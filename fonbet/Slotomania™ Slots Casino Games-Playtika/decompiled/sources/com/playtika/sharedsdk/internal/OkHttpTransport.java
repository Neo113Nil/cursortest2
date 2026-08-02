package com.playtika.sharedsdk.internal;

import android.util.Log;
import com.google.common.net.HttpHeaders;
import com.playtika.sharedsdk.shaded.okhttp3.Cache;
import com.playtika.sharedsdk.shaded.okhttp3.CacheControl;
import com.playtika.sharedsdk.shaded.okhttp3.Call;
import com.playtika.sharedsdk.shaded.okhttp3.Callback;
import com.playtika.sharedsdk.shaded.okhttp3.ConnectionPool;
import com.playtika.sharedsdk.shaded.okhttp3.Dispatcher;
import com.playtika.sharedsdk.shaded.okhttp3.Headers;
import com.playtika.sharedsdk.shaded.okhttp3.Interceptor;
import com.playtika.sharedsdk.shaded.okhttp3.MediaType;
import com.playtika.sharedsdk.shaded.okhttp3.OkHttp;
import com.playtika.sharedsdk.shaded.okhttp3.OkHttpClient;
import com.playtika.sharedsdk.shaded.okhttp3.Protocol;
import com.playtika.sharedsdk.shaded.okhttp3.Request;
import com.playtika.sharedsdk.shaded.okhttp3.RequestBody;
import com.playtika.sharedsdk.shaded.okhttp3.Response;
import com.playtika.sharedsdk.shaded.okhttp3.ResponseBody;
import com.playtika.sharedsdk.shaded.okhttp3.brotli.BrotliInterceptor;
import com.safedk.android.a.g;
import io.ktor.sse.ServerSentEventKt;
import java.io.File;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes3.dex */
public final class OkHttpTransport {
    private static final long DEFAULT_CALL_TIMEOUT_MS = 300000;
    private static final long DEFAULT_CONNECT_TIMEOUT_MS = 30000;
    private static final long DEFAULT_READ_WRITE_TIMEOUT_MS = 300000;
    public static final int ERROR_NETWORK = 1;
    public static final int ERROR_NONE = 0;
    public static final int ERROR_TIMEOUT = 2;
    private static final long FALLBACK_CACHE_MAX_BYTES = 524288000;
    private static final int JS_ERROR_NETWORK = 7;
    private static final int JS_ERROR_TIMEOUT = 28;
    private static final long KEEP_ALIVE_DURATION_S = 300;
    private static final int MAX_IDLE_CONNECTIONS = 16;
    private static final int MAX_REQUESTS = 64;
    private static final int MAX_REQUESTS_PER_HOST = 16;
    private static volatile OkHttpTransport sInstance;
    private static volatile String sInstanceCacheDir;
    private OkHttpClient mClient;
    private final ConcurrentHashMap<Long, Call> mActiveCalls = new ConcurrentHashMap<>();
    private final Metrics mMetrics = null;

    static /* synthetic */ boolean lambda$setupInsecure$0(String str, SSLSession sSLSession) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnHttpComplete(long j, long j2, int i, String str, byte[] bArr, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static int toJsErrorCode(int i) {
        if (i == 2) {
            return 28;
        }
        return i == 1 ? 7 : 0;
    }

    public void logStats() {
    }

    public static synchronized OkHttpTransport getOrCreate(String str, long j, long j2) {
        OkHttpTransport okHttpTransport;
        synchronized (OkHttpTransport.class) {
            if (sInstance == null) {
                sInstance = new OkHttpTransport(str, j, j2);
                sInstanceCacheDir = str;
            } else if (sInstanceCacheDir != null && !sInstanceCacheDir.equals(str)) {
                Log.w("OkHttpTransport", "ignoring cacheDirPath '" + str + "' — already initialised with '" + sInstanceCacheDir + "'");
            }
            okHttpTransport = sInstance;
        }
        return okHttpTransport;
    }

    private OkHttpTransport(String str, long j, long j2) {
        Dispatcher dispatcher = new Dispatcher();
        dispatcher.setMaxRequests(64);
        dispatcher.setMaxRequestsPerHost(16);
        OkHttpClient.Builder writeTimeout = new OkHttpClient.Builder().dispatcher(dispatcher).connectionPool(new ConnectionPool(16, KEEP_ALIVE_DURATION_S, TimeUnit.SECONDS)).protocols(Arrays.asList(Protocol.HTTP_2, Protocol.HTTP_1_1)).retryOnConnectionFailure(true).followRedirects(true).followSslRedirects(true).addInterceptor(BrotliInterceptor.INSTANCE).callTimeout(300000L, TimeUnit.MILLISECONDS).connectTimeout(30000L, TimeUnit.MILLISECONDS).readTimeout(300000L, TimeUnit.MILLISECONDS).writeTimeout(300000L, TimeUnit.MILLISECONDS);
        if (j > 0) {
            writeTimeout.addNetworkInterceptor(new MaxAgeClampInterceptor(j));
        }
        try {
            File file = new File(str, "okhttp_cache");
            if (j2 <= 0) {
                j2 = FALLBACK_CACHE_MAX_BYTES;
            }
            writeTimeout.cache(new Cache(file, j2));
        } catch (Exception e) {
            Log.e("OkHttpTransport", "cache init failed: " + e.getMessage(), e);
        }
        this.mClient = writeTimeout.build();
    }

    private static final class MaxAgeClampInterceptor implements Interceptor {
        private final long mMaxSeconds;

        MaxAgeClampInterceptor(long j) {
            this.mMaxSeconds = j;
        }

        @Override // com.playtika.sharedsdk.shaded.okhttp3.Interceptor
        public Response intercept(Interceptor.Chain chain) throws IOException {
            Response proceed = chain.proceed(chain.request());
            CacheControl cacheControl = proceed.cacheControl();
            if (cacheControl.noStore()) {
                return proceed;
            }
            long maxAgeSeconds = cacheControl.maxAgeSeconds();
            if (maxAgeSeconds < 0 || maxAgeSeconds <= this.mMaxSeconds) {
                return proceed;
            }
            return proceed.newBuilder().header(HttpHeaders.CACHE_CONTROL, "max-age=" + this.mMaxSeconds + ", " + (cacheControl.getIsPrivate() ? io.ktor.client.utils.CacheControl.PRIVATE : "public")).build();
        }
    }

    public void setupInsecure() {
        try {
            TrustManager[] trustManagerArr = {new X509TrustManager() { // from class: com.playtika.sharedsdk.internal.OkHttpTransport.1
                @Override // javax.net.ssl.X509TrustManager
                public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
                }

                @Override // javax.net.ssl.X509TrustManager
                public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
                }

                @Override // javax.net.ssl.X509TrustManager
                public X509Certificate[] getAcceptedIssuers() {
                    return new X509Certificate[0];
                }
            }};
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, trustManagerArr, new SecureRandom());
            this.mClient = this.mClient.newBuilder().sslSocketFactory(sSLContext.getSocketFactory(), (X509TrustManager) trustManagerArr[0]).hostnameVerifier(new HostnameVerifier() { // from class: com.playtika.sharedsdk.internal.OkHttpTransport$$ExternalSyntheticLambda0
                @Override // javax.net.ssl.HostnameVerifier
                public final boolean verify(String str, SSLSession sSLSession) {
                    return OkHttpTransport.lambda$setupInsecure$0(str, sSLSession);
                }
            }).build();
        } catch (Exception e) {
            Log.e("OkHttpTransport", "setupInsecure failed: " + e.getMessage(), e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        if (r6 != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void enqueue(final long j, final long j2, String str, String str2, String[] strArr, String[] strArr2, byte[] bArr, int i, int i2) {
        MediaType mediaType;
        OkHttpClient okHttpClient;
        int i3 = 0;
        while (true) {
            if (i3 >= strArr.length) {
                mediaType = null;
                break;
            } else if ("Content-Type".equalsIgnoreCase(strArr[i3])) {
                mediaType = MediaType.parse(strArr2[i3]);
            } else {
                i3++;
            }
        }
        i3 = -1;
        Request.Builder url = new Request.Builder().url(str);
        int headerPairCount = headerPairCount(strArr, strArr2);
        for (int i4 = 0; i4 < headerPairCount; i4++) {
            if (i4 != i3) {
                url.addHeader(strArr[i4], strArr2[i4]);
            }
        }
        url.method(str2, buildBody(str2, bArr, mediaType));
        Request build = url.build();
        if (i > 0 && i != 300000) {
            long j3 = i;
            okHttpClient = this.mClient.newBuilder().callTimeout(j3, TimeUnit.MILLISECONDS).connectTimeout(j3, TimeUnit.MILLISECONDS).readTimeout(j3, TimeUnit.MILLISECONDS).writeTimeout(j3, TimeUnit.MILLISECONDS).build();
        } else if (i2 > 0 && i2 != 300000) {
            long j4 = i2;
            okHttpClient = this.mClient.newBuilder().callTimeout(j4, TimeUnit.MILLISECONDS).readTimeout(j4, TimeUnit.MILLISECONDS).writeTimeout(j4, TimeUnit.MILLISECONDS).build();
        } else {
            okHttpClient = this.mClient;
        }
        Call newCall = okHttpClient.newCall(build);
        this.mActiveCalls.put(Long.valueOf(j2), newCall);
        final long nanoTime = System.nanoTime();
        newCall.enqueue(new Callback() { // from class: com.playtika.sharedsdk.internal.OkHttpTransport.2
            @Override // com.playtika.sharedsdk.shaded.okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
                OkHttpTransport.nativeOnHttpComplete(j, j2, 0, null, null, OkHttpTransport.toJsErrorCode(OkHttpTransport.isTimeout(iOException) ? 2 : 1));
            }

            @Override // com.playtika.sharedsdk.shaded.okhttp3.Callback
            public void onResponse(Call call, Response response) {
                OkHttpTransport.this.mActiveCalls.remove(Long.valueOf(j2));
                OkHttpTransport.this.handleResponse(j, j2, response, nanoTime);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isTimeout(IOException iOException) {
        for (IOException iOException2 = iOException; iOException2 != null; iOException2 = iOException2.getCause()) {
            if (iOException2 instanceof SocketTimeoutException) {
                return true;
            }
        }
        return false;
    }

    private static int headerPairCount(String[] strArr, String[] strArr2) {
        if (strArr == null || strArr2 == null) {
            return 0;
        }
        return Math.min(strArr.length, strArr2.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleResponse(long j, long j2, Response response, long j3) {
        byte[] bArr;
        int i;
        int code = response.code();
        String serializeHeaders = serializeHeaders(response.headers());
        int i2 = 0;
        try {
            ResponseBody body = response.body();
            try {
                bArr = body != null ? body.bytes() : new byte[0];
                if (body != null) {
                    body.close();
                }
                i = code;
            } finally {
            }
        } catch (IOException e) {
            bArr = null;
            i = 0;
            i2 = isTimeout(e) ? 2 : 1;
        }
        nativeOnHttpComplete(j, j2, i, serializeHeaders, bArr, toJsErrorCode(i2));
    }

    public void cancel(long j) {
        Call remove = this.mActiveCalls.remove(Long.valueOf(j));
        if (remove != null) {
            remove.cancel();
        }
    }

    public static String getOkHttpVersion() {
        return OkHttp.VERSION;
    }

    private static RequestBody buildBody(String str, byte[] bArr, MediaType mediaType) {
        if (bArr == null || bArr.length == 0) {
            if ("POST".equalsIgnoreCase(str) || g.f.equalsIgnoreCase(str)) {
                return RequestBody.create(new byte[0], mediaType);
            }
            return null;
        }
        return RequestBody.create(bArr, mediaType);
    }

    private static String serializeHeaders(Headers headers) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < headers.size(); i++) {
            sb.append(headers.name(i)).append(": ").append(headers.value(i)).append(ServerSentEventKt.END_OF_LINE);
        }
        return sb.toString();
    }
}
