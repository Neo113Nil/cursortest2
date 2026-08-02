package io.ably.lib.http;

import com.google.gson.JsonParseException;
import io.ably.lib.debug.DebugOptions;
import io.ably.lib.http.HttpAuth;
import io.ably.lib.network.FailedConnectionException;
import io.ably.lib.network.HttpBody;
import io.ably.lib.network.HttpEngine;
import io.ably.lib.network.HttpEngineConfig;
import io.ably.lib.network.HttpEngineFactory;
import io.ably.lib.network.HttpRequest;
import io.ably.lib.network.HttpResponse;
import io.ably.lib.rest.Auth;
import io.ably.lib.transport.Defaults;
import io.ably.lib.transport.Hosts;
import io.ably.lib.types.AblyException;
import io.ably.lib.types.ClientOptions;
import io.ably.lib.types.ErrorInfo;
import io.ably.lib.types.ErrorResponse;
import io.ably.lib.types.Param;
import io.ably.lib.types.ProxyOptions;
import io.ably.lib.util.AgentHeaderCreator;
import io.ably.lib.util.Base64Coder;
import io.ably.lib.util.ClientOptionsUtils;
import io.ably.lib.util.Log;
import io.ably.lib.util.PlatformAgentProvider;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes9.dex */
public class HttpCore {
    private static final String TAG = "io.ably.lib.http.HttpCore";
    private final Auth auth;
    private Map<String, String> dynamicAgents;
    private final HttpEngine engine;
    final Hosts hosts;
    final ClientOptions options;
    private final PlatformAgentProvider platformAgentProvider;
    public final int port;
    private HttpAuth proxyAuth;
    public final String scheme;

    public interface BodyHandler<T> {
        T[] handleResponseBody(String str, byte[] bArr) throws AblyException;
    }

    public interface RequestBody {
        String getContentType();

        byte[] getEncoded();
    }

    public interface ResponseHandler<T> {
        T handleResponse(Response response, ErrorInfo errorInfo) throws AblyException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    static {
        int i;
        boolean z;
        Field field = 0;
        try {
            field = Class.forName("android.os.Build$VERSION").getField("SDK_INT");
            i = field.getInt(field);
            z = field;
        } catch (Exception unused) {
            i = 0;
            z = field;
        }
        if (!z || i >= 8) {
            return;
        }
        System.setProperty("httpCore.keepAlive", "false");
    }

    public HttpCore(ClientOptions clientOptions, Auth auth, PlatformAgentProvider platformAgentProvider) throws AblyException {
        this.options = clientOptions;
        this.auth = auth;
        this.platformAgentProvider = platformAgentProvider;
        this.scheme = clientOptions.tls ? "https://" : "http://";
        this.port = Defaults.getPort(clientOptions);
        this.hosts = new Hosts(clientOptions.restHost, Defaults.HOST_REST, clientOptions);
        ProxyOptions proxyOptions = clientOptions.proxy;
        if (proxyOptions != null) {
            if (proxyOptions.host == null) {
                throw AblyException.fromErrorInfo(new ErrorInfo("Unable to configure proxy without proxy host", 40000, 400));
            }
            if (proxyOptions.port == 0) {
                throw AblyException.fromErrorInfo(new ErrorInfo("Unable to configure proxy without proxy port", 40000, 400));
            }
            String str = proxyOptions.username;
            if (str != null) {
                String str2 = proxyOptions.password;
                if (str2 == null) {
                    throw AblyException.fromErrorInfo(new ErrorInfo("Unable to configure proxy without proxy password", 40000, 400));
                }
                this.proxyAuth = new HttpAuth(str, str2, proxyOptions.prefAuthType);
            }
        }
        HttpEngineFactory firstAvailable = HttpEngineFactory.getFirstAvailable();
        Log.v(TAG, String.format("Using %s HTTP Engine", firstAvailable.getEngineType().name()));
        this.engine = firstAvailable.create(new HttpEngineConfig(ClientOptionsUtils.convertToProxyConfig(clientOptions)));
    }

    private HttpCore(HttpCore httpCore, Map<String, String> map) {
        this.options = httpCore.options;
        this.auth = httpCore.auth;
        this.platformAgentProvider = httpCore.platformAgentProvider;
        this.scheme = httpCore.scheme;
        this.port = httpCore.port;
        this.hosts = httpCore.hosts;
        this.proxyAuth = httpCore.proxyAuth;
        this.engine = httpCore.engine;
        this.dynamicAgents = map;
    }

    public <T> T httpExecuteWithRetry(URL url, String str, Param[] paramArr, RequestBody requestBody, ResponseHandler<T> responseHandler, boolean z) throws AblyException {
        HttpAuth httpAuth;
        if (z) {
            authorize(false);
        }
        boolean z2 = true;
        boolean z3 = true;
        while (true) {
            try {
                return (T) httpExecute(url, str, paramArr, requestBody, true, responseHandler);
            } catch (AuthRequiredException e) {
                if (e.authChallenge != null && z && e.expired && z2) {
                    authorize(true);
                    z2 = false;
                } else if (e.proxyAuthChallenge != null && z3 && (httpAuth = this.proxyAuth) != null) {
                    httpAuth.processAuthenticateHeaders(e.proxyAuthChallenge);
                    z3 = false;
                } else {
                    throw e;
                }
            }
        }
        throw e;
    }

    public String getPreferredHost() {
        return this.hosts.getPreferredHost();
    }

    public void setPreferredHost(String str) {
        this.hosts.setPreferredHost(str, false);
    }

    public String getPrimaryHost() {
        return this.hosts.getPrimaryHost();
    }

    void authorize(boolean z) throws AblyException {
        this.auth.assertAuthorizationHeader(z);
    }

    public <T> T httpExecute(URL url, String str, Param[] paramArr, RequestBody requestBody, boolean z, ResponseHandler<T> responseHandler) throws AblyException {
        return (T) httpExecute(url, str, paramArr, requestBody, z, this.engine.isUsingProxy() && this.proxyAuth != null, responseHandler);
    }

    <T> T httpExecute(URL url, String str, Param[] paramArr, RequestBody requestBody, boolean z, boolean z2, ResponseHandler<T> responseHandler) throws AblyException {
        String str2;
        HttpRequest.HttpRequestBuilder builder = HttpRequest.builder();
        DebugOptions.RawHttpListener rawHttpListener = null;
        builder.url(url).method(str).httpOpenTimeout(this.options.httpOpenTimeout).httpReadTimeout(this.options.httpRequestTimeout).body(requestBody != null ? new HttpBody(requestBody.getContentType(), requestBody.getEncoded()) : null);
        Map<String, String> collectRequestHeaders = collectRequestHeaders(url, str, paramArr, requestBody, z, z2);
        boolean containsKey = collectRequestHeaders.containsKey("Authorization");
        String str3 = collectRequestHeaders.get("Authorization");
        builder.headers(collectRequestHeaders);
        HttpRequest build = builder.build();
        if (Log.level <= 2 && build.getBody() != null && build.getBody().getContent() != null) {
            Log.v(TAG, System.lineSeparator() + new String(build.getBody().getContent()));
        }
        Map<String, List<String>> headers = build.getHeaders();
        if (Log.level <= 2) {
            String str4 = TAG;
            Log.v(str4, "HTTP request: " + url + " " + str);
            if (containsKey) {
                Log.v(str4, "  Authorization: " + str3);
            }
            for (Map.Entry<String, List<String>> entry : headers.entrySet()) {
                for (String str5 : entry.getValue()) {
                    Log.v(TAG, "  " + entry.getKey() + ": " + str5);
                }
            }
            if (requestBody != null) {
                String str6 = TAG;
                Log.v(str6, "  Content-Type: " + requestBody.getContentType());
                StringBuilder sb = new StringBuilder("  Content-Length: ");
                sb.append(requestBody.getEncoded() != null ? requestBody.getEncoded().length : 0);
                Log.v(str6, sb.toString());
            }
        }
        ClientOptions clientOptions = this.options;
        if (clientOptions instanceof DebugOptions) {
            DebugOptions.RawHttpListener rawHttpListener2 = ((DebugOptions) clientOptions).httpListener;
            if (rawHttpListener2 != null) {
                str2 = String.valueOf(Math.random()).substring(2);
                Response onRawHttpRequest = rawHttpListener2.onRawHttpRequest(str2, build, containsKey ? str3 : null, headers, requestBody);
                if (onRawHttpRequest != null) {
                    return (T) handleResponse(containsKey, onRawHttpRequest, responseHandler);
                }
            } else {
                str2 = null;
            }
            rawHttpListener = rawHttpListener2;
        } else {
            str2 = null;
        }
        try {
            Response executeRequest = executeRequest(build);
            if (rawHttpListener != null) {
                rawHttpListener.onRawHttpResponse(str2, str, executeRequest);
            }
            return (T) handleResponse(containsKey, executeRequest, responseHandler);
        } catch (FailedConnectionException e) {
            throw AblyException.fromThrowable(e);
        } catch (Exception e2) {
            if (e2.getCause() instanceof IOException) {
                throw AblyException.fromThrowable(e2.getCause());
            }
            throw AblyException.fromThrowable(e2);
        }
    }

    private Map<String, String> collectRequestHeaders(URL url, String str, Param[] paramArr, RequestBody requestBody, boolean z, boolean z2) throws AblyException {
        Auth auth;
        HashMap hashMap = new HashMap();
        String first = Param.getFirst(paramArr, "Authorization");
        if (first == null && (auth = this.auth) != null) {
            first = auth.getAuthorizationHeader();
        }
        if (z && first != null) {
            hashMap.put("Authorization", first);
        }
        if (z2 && this.proxyAuth.hasChallenge()) {
            hashMap.put("Proxy-Authorization", this.proxyAuth.getAuthorizationHeader(str, url.getPath(), requestBody != null ? requestBody.getEncoded() : null));
        }
        int i = 0;
        if (paramArr != null) {
            int length = paramArr.length;
            int i2 = 0;
            while (i < length) {
                Param param = paramArr[i];
                hashMap.put(param.key, param.value);
                if (param.key.equals("Accept")) {
                    i2 = 1;
                }
                i++;
            }
            i = i2;
        }
        if (i == 0) {
            hashMap.put("Accept", "application/json");
        }
        if (!hashMap.containsKey(Defaults.ABLY_PROTOCOL_VERSION_HEADER)) {
            hashMap.put(Defaults.ABLY_PROTOCOL_VERSION_HEADER, Defaults.ABLY_PROTOCOL_VERSION);
        }
        HashMap hashMap2 = new HashMap();
        if (this.options.agents != null) {
            hashMap2.putAll(this.options.agents);
        }
        Map<String, String> map = this.dynamicAgents;
        if (map != null) {
            hashMap2.putAll(map);
        }
        hashMap.put(Defaults.ABLY_AGENT_HEADER, AgentHeaderCreator.create(hashMap2, this.platformAgentProvider));
        if (this.options.clientId != null) {
            hashMap.put(Defaults.ABLY_CLIENT_ID_HEADER, Base64Coder.encodeString(this.options.clientId));
        }
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private <T> T handleResponse(boolean z, Response response, ResponseHandler<T> responseHandler) throws AblyException {
        ErrorInfo errorInfo;
        List<String> headerFields;
        if (response.statusCode == 0) {
            return null;
        }
        if (response.statusCode >= 500 && response.statusCode <= 504) {
            throw AblyException.fromErrorInfo(ErrorInfo.fromResponseStatus(response.statusLine, response.statusCode));
        }
        if (response.statusCode >= 200 && response.statusCode < 300) {
            if (responseHandler != null) {
                return responseHandler.handleResponse(response, null);
            }
            return null;
        }
        if (response.body != null && response.body.length > 0) {
            if (response.contentType != null && response.contentType.contains("msgpack")) {
                try {
                    errorInfo = ErrorInfo.fromMsgpackBody(response.body);
                } catch (IOException unused) {
                    System.err.println("Unable to parse msgpack error response");
                }
            } else {
                String str = new String(response.body);
                try {
                    ErrorResponse fromJSON = ErrorResponse.fromJSON(str);
                    if (fromJSON != null) {
                        errorInfo = fromJSON.error;
                    }
                } catch (JsonParseException unused2) {
                    System.err.println("Error message in unexpected format: ".concat(str));
                }
            }
            if (errorInfo == null) {
                String headerField = response.getHeaderField("X-Ably-ErrorCode");
                String headerField2 = response.getHeaderField("X-Ably-ErrorMessage");
                if (headerField != null) {
                    try {
                        errorInfo = new ErrorInfo(headerField2, response.statusCode, Integer.parseInt(headerField));
                    } catch (NumberFormatException unused3) {
                    }
                }
            }
            if (response.statusCode == 401) {
                boolean z2 = errorInfo != null && errorInfo.code == 40140;
                List<String> headerFields2 = response.getHeaderFields("WWW-Authenticate");
                if (headerFields2 != null && headerFields2.size() > 0) {
                    Map<HttpAuth.Type, String> sortAuthenticateHeaders = HttpAuth.sortAuthenticateHeaders(headerFields2);
                    String str2 = sortAuthenticateHeaders.get(HttpAuth.Type.X_ABLY_TOKEN);
                    if (str2 != null) {
                        z2 |= str2.indexOf("stale") > -1;
                    }
                    AuthRequiredException authRequiredException = new AuthRequiredException(null, errorInfo);
                    authRequiredException.authChallenge = sortAuthenticateHeaders;
                    if (z2) {
                        authRequiredException.expired = true;
                        throw authRequiredException;
                    }
                    if (!z) {
                        throw authRequiredException;
                    }
                }
            }
            if (response.statusCode != 407 && (headerFields = response.getHeaderFields("Proxy-Authenticate")) != null && !headerFields.isEmpty()) {
                AuthRequiredException authRequiredException2 = new AuthRequiredException(null, errorInfo);
                authRequiredException2.proxyAuthChallenge = HttpAuth.sortAuthenticateHeaders(headerFields);
                throw authRequiredException2;
            }
            if (errorInfo == null) {
                errorInfo = ErrorInfo.fromResponseStatus(response.statusLine, response.statusCode);
            }
            Log.e(TAG, "Error response from server: err = " + errorInfo);
            if (responseHandler == null) {
                return responseHandler.handleResponse(response, errorInfo);
            }
            throw AblyException.fromErrorInfo(errorInfo);
        }
        errorInfo = null;
        if (errorInfo == null) {
        }
        if (response.statusCode == 401) {
        }
        if (response.statusCode != 407) {
        }
        if (errorInfo == null) {
        }
        Log.e(TAG, "Error response from server: err = " + errorInfo);
        if (responseHandler == null) {
        }
    }

    private Response executeRequest(HttpRequest httpRequest) {
        HttpResponse execute = this.engine.call(httpRequest).execute();
        Response response = new Response();
        response.statusCode = execute.getCode();
        response.statusLine = execute.getMessage();
        Log.v(TAG, "HTTP response:");
        Map<String, List<String>> headers = execute.getHeaders();
        response.headers = new HashMap(headers.size(), 1.0f);
        for (Map.Entry<String, List<String>> entry : headers.entrySet()) {
            if (entry.getKey() != null) {
                response.headers.put(entry.getKey().toLowerCase(Locale.ROOT), entry.getValue());
                if (Log.level <= 2) {
                    for (String str : entry.getValue()) {
                        Log.v(TAG, entry.getKey() + ": " + str);
                    }
                }
            }
        }
        if (response.statusCode != 204 && execute.getBody() != null) {
            response.contentType = execute.getBody().getContentType();
            response.body = execute.getBody().getContent();
            response.contentLength = response.body == null ? 0 : response.body.length;
            if (Log.level <= 2 && response.body != null) {
                Log.v(TAG, System.lineSeparator() + new String(response.body));
            }
        }
        return response;
    }

    public HttpCore injectDynamicAgents(Map<String, String> map) {
        return new HttpCore(this, map);
    }

    public static class Response {
        public byte[] body;
        public int contentLength;
        public String contentType;
        public Map<String, List<String>> headers;
        public int statusCode;
        public String statusLine;

        public List<String> getHeaderFields(String str) {
            Map<String, List<String>> map = this.headers;
            if (map == null) {
                return null;
            }
            return map.get(str.toLowerCase(Locale.ROOT));
        }

        public String getHeaderField(String str) {
            List<String> list;
            Map<String, List<String>> map = this.headers;
            if (map == null || (list = map.get(str.toLowerCase(Locale.ROOT))) == null || list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
    }

    public static class AuthRequiredException extends AblyException {
        private static final long serialVersionUID = 1;
        public Map<HttpAuth.Type, String> authChallenge;
        public boolean expired;
        public Map<HttpAuth.Type, String> proxyAuthChallenge;

        public AuthRequiredException(Throwable th, ErrorInfo errorInfo) {
            super(th, errorInfo);
        }
    }
}
