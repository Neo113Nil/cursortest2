package com.getcapacitor;

import android.content.Context;
import android.net.Uri;
import android.webkit.CookieManager;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.google.common.net.HttpHeaders;
import com.ironsource.InterfaceC2517l1;
import io.ktor.client.utils.CacheControl;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class WebViewLocalServer {
    private static final String capacitorContentStart = "/_capacitor_content_";
    private static final String capacitorFileStart = "/_capacitor_file_";
    private final ArrayList<String> authorities;
    private String basePath;
    private final Bridge bridge;
    private final boolean html5mode;
    private boolean isAsset;
    private final JSInjector jsInjector;
    private final AndroidProtocolHandler protocolHandler;
    private final UriMatcher uriMatcher = new UriMatcher(null);

    public static abstract class PathHandler {
        private String charset;
        private String encoding;
        protected String mimeType;
        private String reasonPhrase;
        private Map<String, String> responseHeaders;
        private int statusCode;

        public abstract InputStream handle(Uri uri);

        public PathHandler() {
            this(null, null, 200, "OK", null);
        }

        public PathHandler(String str, String str2, int i, String str3, Map<String, String> map) {
            this.encoding = str;
            this.charset = str2;
            this.statusCode = i;
            this.reasonPhrase = str3;
            map = map == null ? new HashMap<>() : map;
            map.put(HttpHeaders.CACHE_CONTROL, CacheControl.NO_CACHE);
            this.responseHeaders = map;
        }

        public InputStream handle(WebResourceRequest webResourceRequest) {
            return handle(webResourceRequest.getUrl());
        }

        public String getEncoding() {
            return this.encoding;
        }

        public String getCharset() {
            return this.charset;
        }

        public int getStatusCode() {
            return this.statusCode;
        }

        public String getReasonPhrase() {
            return this.reasonPhrase;
        }

        public Map<String, String> getResponseHeaders() {
            return this.responseHeaders;
        }
    }

    WebViewLocalServer(Context context, Bridge bridge, JSInjector jSInjector, ArrayList<String> arrayList, boolean z) {
        this.html5mode = z;
        this.protocolHandler = new AndroidProtocolHandler(context.getApplicationContext());
        this.authorities = arrayList;
        this.bridge = bridge;
        this.jsInjector = jSInjector;
    }

    private static Uri parseAndVerifyUrl(String str) {
        if (str == null) {
            return null;
        }
        Uri parse = Uri.parse(str);
        if (parse == null) {
            Logger.error("Malformed URL: " + str);
            return null;
        }
        String path = parse.getPath();
        if (path != null && path.length() != 0) {
            return parse;
        }
        Logger.error("URL does not have a path: " + str);
        return null;
    }

    public WebResourceResponse shouldInterceptRequest(WebResourceRequest webResourceRequest) {
        PathHandler pathHandler;
        Uri url = webResourceRequest.getUrl();
        synchronized (this.uriMatcher) {
            pathHandler = (PathHandler) this.uriMatcher.match(webResourceRequest.getUrl());
        }
        if (pathHandler == null) {
            return null;
        }
        if (isLocalFile(url) || isMainUrl(url) || !isAllowedUrl(url)) {
            Logger.debug("Handling local request: " + webResourceRequest.getUrl().toString());
            return handleLocalRequest(webResourceRequest, pathHandler);
        }
        return handleProxyRequest(webResourceRequest, pathHandler);
    }

    private boolean isLocalFile(Uri uri) {
        String path = uri.getPath();
        return path.startsWith("/_capacitor_content_") || path.startsWith("/_capacitor_file_");
    }

    private boolean isMainUrl(Uri uri) {
        return this.bridge.getServerUrl() == null && uri.getHost().equalsIgnoreCase(this.bridge.getHost());
    }

    private boolean isAllowedUrl(Uri uri) {
        return this.bridge.getServerUrl() != null || this.bridge.getAppAllowNavigationMask().matches(uri.getHost());
    }

    private WebResourceResponse handleLocalRequest(WebResourceRequest webResourceRequest, PathHandler pathHandler) {
        int i;
        String path = webResourceRequest.getUrl().getPath();
        if (webResourceRequest.getRequestHeaders().get(HttpHeaders.RANGE) != null) {
            LollipopLazyInputStream lollipopLazyInputStream = new LollipopLazyInputStream(pathHandler, webResourceRequest);
            String mimeType = getMimeType(path, lollipopLazyInputStream);
            Map<String, String> responseHeaders = pathHandler.getResponseHeaders();
            try {
                int available = lollipopLazyInputStream.available();
                String[] split = webResourceRequest.getRequestHeaders().get(HttpHeaders.RANGE).split("=")[1].split("-");
                String str = split[0];
                int i2 = available - 1;
                if (split.length > 1) {
                    i2 = Integer.parseInt(split[1]);
                }
                responseHeaders.put(HttpHeaders.ACCEPT_RANGES, "bytes");
                responseHeaders.put(HttpHeaders.CONTENT_RANGE, "bytes " + str + "-" + i2 + "/" + available);
                i = 206;
            } catch (IOException unused) {
                i = InterfaceC2517l1.a.b.d;
            }
            return new WebResourceResponse(mimeType, pathHandler.getEncoding(), i, pathHandler.getReasonPhrase(), responseHeaders, lollipopLazyInputStream);
        }
        if (isLocalFile(webResourceRequest.getUrl())) {
            LollipopLazyInputStream lollipopLazyInputStream2 = new LollipopLazyInputStream(pathHandler, webResourceRequest);
            return new WebResourceResponse(getMimeType(webResourceRequest.getUrl().getPath(), lollipopLazyInputStream2), pathHandler.getEncoding(), getStatusCode(lollipopLazyInputStream2, pathHandler.getStatusCode()), pathHandler.getReasonPhrase(), pathHandler.getResponseHeaders(), lollipopLazyInputStream2);
        }
        if (path.equals("/cordova.js")) {
            return new WebResourceResponse("application/javascript", pathHandler.getEncoding(), pathHandler.getStatusCode(), pathHandler.getReasonPhrase(), pathHandler.getResponseHeaders(), null);
        }
        if (path.equals("/") || (!webResourceRequest.getUrl().getLastPathSegment().contains(".") && this.html5mode)) {
            try {
                String str2 = this.basePath + "/index.html";
                InputStream injectedStream = this.jsInjector.getInjectedStream(this.isAsset ? this.protocolHandler.openAsset(str2) : this.protocolHandler.openFile(str2));
                this.bridge.reset();
                return new WebResourceResponse("text/html", pathHandler.getEncoding(), getStatusCode(injectedStream, pathHandler.getStatusCode()), pathHandler.getReasonPhrase(), pathHandler.getResponseHeaders(), injectedStream);
            } catch (IOException e) {
                Logger.error("Unable to open index.html", e);
                return null;
            }
        }
        if ("/favicon.ico".equalsIgnoreCase(path)) {
            try {
                return new WebResourceResponse("image/png", null, null);
            } catch (Exception e2) {
                Logger.error("favicon handling failed", e2);
            }
        }
        if (path.lastIndexOf(".") < 0) {
            return null;
        }
        String substring = path.substring(path.lastIndexOf("."), path.length());
        InputStream lollipopLazyInputStream3 = new LollipopLazyInputStream(pathHandler, webResourceRequest);
        if (substring.equals(".html")) {
            lollipopLazyInputStream3 = this.jsInjector.getInjectedStream(lollipopLazyInputStream3);
            this.bridge.reset();
        }
        InputStream inputStream = lollipopLazyInputStream3;
        return new WebResourceResponse(getMimeType(path, inputStream), pathHandler.getEncoding(), getStatusCode(inputStream, pathHandler.getStatusCode()), pathHandler.getReasonPhrase(), pathHandler.getResponseHeaders(), inputStream);
    }

    private WebResourceResponse handleProxyRequest(WebResourceRequest webResourceRequest, PathHandler pathHandler) {
        String method = webResourceRequest.getMethod();
        if (!method.equals("GET")) {
            return null;
        }
        try {
            String uri = webResourceRequest.getUrl().toString();
            Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
            for (Map.Entry<String, String> entry : requestHeaders.entrySet()) {
                if (entry.getKey().equalsIgnoreCase("Accept") && entry.getValue().toLowerCase().contains("text/html")) {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
                    for (Map.Entry<String, String> entry2 : requestHeaders.entrySet()) {
                        httpURLConnection.setRequestProperty(entry2.getKey(), entry2.getValue());
                    }
                    String cookie = CookieManager.getInstance().getCookie(uri);
                    if (cookie != null) {
                        httpURLConnection.setRequestProperty("Cookie", cookie);
                    }
                    httpURLConnection.setRequestMethod(method);
                    httpURLConnection.setReadTimeout(30000);
                    httpURLConnection.setConnectTimeout(30000);
                    String headerField = httpURLConnection.getHeaderField(HttpHeaders.SET_COOKIE);
                    if (headerField != null) {
                        CookieManager.getInstance().setCookie(uri, headerField);
                    }
                    InputStream injectedStream = this.jsInjector.getInjectedStream(httpURLConnection.getInputStream());
                    this.bridge.reset();
                    return new WebResourceResponse("text/html", pathHandler.getEncoding(), pathHandler.getStatusCode(), pathHandler.getReasonPhrase(), pathHandler.getResponseHeaders(), injectedStream);
                }
            }
            return null;
        } catch (SocketTimeoutException e) {
            this.bridge.handleAppUrlLoadError(e);
            return null;
        } catch (Exception e2) {
            this.bridge.handleAppUrlLoadError(e2);
            return null;
        }
    }

    private String getMimeType(String str, InputStream inputStream) {
        String str2;
        try {
            str2 = URLConnection.guessContentTypeFromName(str);
            if (str2 != null) {
                try {
                    if (str.endsWith(".js") && str2.equals("image/x-icon")) {
                        Logger.debug("We shouldn't be here");
                    }
                } catch (Exception e) {
                    e = e;
                    Logger.error("Unable to get mime type" + str, e);
                    return str2;
                }
            }
            if (str2 != null) {
                return str2;
            }
            if (!str.endsWith(".js") && !str.endsWith(".mjs")) {
                if (str.endsWith(".wasm")) {
                    return "application/wasm";
                }
                str = URLConnection.guessContentTypeFromStream(inputStream);
                return str;
            }
            return "application/javascript";
        } catch (Exception e2) {
            e = e2;
            str2 = null;
        }
    }

    private int getStatusCode(InputStream inputStream, int i) {
        try {
            return inputStream.available() == -1 ? InterfaceC2517l1.a.b.d : i;
        } catch (IOException unused) {
            return 500;
        }
    }

    void register(Uri uri, PathHandler pathHandler) {
        synchronized (this.uriMatcher) {
            this.uriMatcher.addURI(uri.getScheme(), uri.getAuthority(), uri.getPath(), pathHandler);
        }
    }

    public void hostAssets(String str) {
        this.isAsset = true;
        this.basePath = str;
        createHostingDetails();
    }

    public void hostFiles(String str) {
        this.isAsset = false;
        this.basePath = str;
        createHostingDetails();
    }

    private void createHostingDetails() {
        final String str = this.basePath;
        if (str.indexOf(42) != -1) {
            throw new IllegalArgumentException("assetPath cannot contain the '*' character.");
        }
        PathHandler pathHandler = new PathHandler() { // from class: com.getcapacitor.WebViewLocalServer.1
            @Override // com.getcapacitor.WebViewLocalServer.PathHandler
            public InputStream handle(Uri uri) {
                String path = uri.getPath();
                try {
                    if (path.startsWith("/_capacitor_content_")) {
                        return WebViewLocalServer.this.protocolHandler.openContentUrl(uri);
                    }
                    if (!path.startsWith("/_capacitor_file_") && WebViewLocalServer.this.isAsset) {
                        return WebViewLocalServer.this.protocolHandler.openAsset(str + path);
                    }
                    if (!path.startsWith("/_capacitor_file_")) {
                        path = WebViewLocalServer.this.basePath + uri.getPath();
                    }
                    return WebViewLocalServer.this.protocolHandler.openFile(path);
                } catch (IOException unused) {
                    Logger.error("Unable to open asset URL: " + uri);
                    return null;
                }
            }
        };
        Iterator<String> it = this.authorities.iterator();
        while (it.hasNext()) {
            String next = it.next();
            registerUriForScheme("http", pathHandler, next);
            registerUriForScheme("https", pathHandler, next);
            String scheme = this.bridge.getScheme();
            if (!scheme.equals("http") && !scheme.equals("https")) {
                registerUriForScheme(scheme, pathHandler, next);
            }
        }
    }

    private void registerUriForScheme(String str, PathHandler pathHandler, String str2) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(str);
        builder.authority(str2);
        builder.path("");
        Uri build = builder.build();
        register(Uri.withAppendedPath(build, "/"), pathHandler);
        register(Uri.withAppendedPath(build, "**"), pathHandler);
    }

    private static abstract class LazyInputStream extends InputStream {
        protected final PathHandler handler;
        private InputStream is = null;

        protected abstract InputStream handle();

        public LazyInputStream(PathHandler pathHandler) {
            this.handler = pathHandler;
        }

        private InputStream getInputStream() {
            if (this.is == null) {
                this.is = handle();
            }
            return this.is;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            InputStream inputStream = getInputStream();
            if (inputStream != null) {
                return inputStream.available();
            }
            return -1;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            InputStream inputStream = getInputStream();
            if (inputStream != null) {
                return inputStream.read();
            }
            return -1;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr) throws IOException {
            InputStream inputStream = getInputStream();
            if (inputStream != null) {
                return inputStream.read(bArr);
            }
            return -1;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            InputStream inputStream = getInputStream();
            if (inputStream != null) {
                return inputStream.read(bArr, i, i2);
            }
            return -1;
        }

        @Override // java.io.InputStream
        public long skip(long j) throws IOException {
            InputStream inputStream = getInputStream();
            if (inputStream != null) {
                return inputStream.skip(j);
            }
            return 0L;
        }
    }

    private static class LollipopLazyInputStream extends LazyInputStream {
        private InputStream is;
        private WebResourceRequest request;

        public LollipopLazyInputStream(PathHandler pathHandler, WebResourceRequest webResourceRequest) {
            super(pathHandler);
            this.request = webResourceRequest;
        }

        @Override // com.getcapacitor.WebViewLocalServer.LazyInputStream
        protected InputStream handle() {
            return this.handler.handle(this.request);
        }
    }

    public String getBasePath() {
        return this.basePath;
    }
}
