package com.playtika.sharedsdk.shaded.okhttp3.internal.http;

import androidx.core.app.NotificationCompat;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.playtika.sharedsdk.shaded.okhttp3.HttpUrl;
import com.playtika.sharedsdk.shaded.okhttp3.Interceptor;
import com.playtika.sharedsdk.shaded.okhttp3.OkHttpClient;
import com.playtika.sharedsdk.shaded.okhttp3.Request;
import com.playtika.sharedsdk.shaded.okhttp3.RequestBody;
import com.playtika.sharedsdk.shaded.okhttp3.Response;
import com.playtika.sharedsdk.shaded.okhttp3.Route;
import com.playtika.sharedsdk.shaded.okhttp3.internal._UtilCommonKt;
import com.playtika.sharedsdk.shaded.okhttp3.internal._UtilJvmKt;
import com.playtika.sharedsdk.shaded.okhttp3.internal.connection.Exchange;
import com.playtika.sharedsdk.shaded.okhttp3.internal.connection.RealCall;
import com.playtika.sharedsdk.shaded.okhttp3.internal.connection.RealConnection;
import com.playtika.sharedsdk.shaded.okhttp3.internal.http2.ConnectionShutdownException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.Collection;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* compiled from: RetryAndFollowUpInterceptor.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0018\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0018\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u000bH\u0002J\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002J\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001dH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/playtika/sharedsdk/shaded/okhttp3/internal/http/RetryAndFollowUpInterceptor;", "Lcom/playtika/sharedsdk/shaded/okhttp3/Interceptor;", "client", "Lcom/playtika/sharedsdk/shaded/okhttp3/OkHttpClient;", "<init>", "(Lokhttp3/OkHttpClient;)V", "intercept", "Lcom/playtika/sharedsdk/shaded/okhttp3/Response;", "chain", "Lcom/playtika/sharedsdk/shaded/okhttp3/Interceptor$Chain;", "recover", "", "e", "Ljava/io/IOException;", NotificationCompat.CATEGORY_CALL, "Lcom/playtika/sharedsdk/shaded/okhttp3/internal/connection/RealCall;", "userRequest", "Lcom/playtika/sharedsdk/shaded/okhttp3/Request;", "requestIsOneShot", "isRecoverable", "requestSendStarted", "followUpRequest", "userResponse", "exchange", "Lcom/playtika/sharedsdk/shaded/okhttp3/internal/connection/Exchange;", "buildRedirectRequest", "method", "", "retryAfter", "", "defaultDelay", k.M, "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RetryAndFollowUpInterceptor implements Interceptor {
    private static final int MAX_FOLLOW_UPS = 20;
    private final OkHttpClient client;

    public RetryAndFollowUpInterceptor(OkHttpClient client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.client = client;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        r0 = r13.proceed(r0).newBuilder().request(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        if (r7 == null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        r6 = com.playtika.sharedsdk.shaded.okhttp3.internal.UnreadableResponseBodyKt.stripBody(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        r7 = r0.priorResponse(r6).build();
        r0 = r1.getInterceptorScopedExchange();
        r6 = followUpRequest(r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        if (r6 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0064, code lost:
    
        r0 = r6.body();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0068, code lost:
    
        if (r0 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        if (r0.isOneShot() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0070, code lost:
    
        r1.getEventListener().followUpDecision(r1, r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007a, code lost:
    
        r1.exitNetworkInterceptorExchange$okhttp(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007d, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007e, code lost:
    
        com.playtika.sharedsdk.shaded.okhttp3.internal._UtilCommonKt.closeQuietly(r7.body());
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008b, code lost:
    
        if (r8 > 20) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008d, code lost:
    
        r1.getEventListener().followUpDecision(r1, r7, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009d, code lost:
    
        r1.getEventListener().followUpDecision(r1, r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bf, code lost:
    
        throw new java.net.ProtocolException("Too many follow-up requests: " + r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0048, code lost:
    
        if (r0 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x004e, code lost:
    
        if (r0.getIsDuplex() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0050, code lost:
    
        r1.timeoutEarlyExit();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0053, code lost:
    
        r1.getEventListener().followUpDecision(r1, r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005d, code lost:
    
        r1.exitNetworkInterceptorExchange$okhttp(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0060, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0061, code lost:
    
        r13 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ee, code lost:
    
        r1.exitNetworkInterceptorExchange$okhttp(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f1, code lost:
    
        throw r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0035, code lost:
    
        r6 = null;
     */
    @Override // com.playtika.sharedsdk.shaded.okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request followUpRequest;
        Intrinsics.checkNotNullParameter(chain, "chain");
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Request request = realInterceptorChain.getRequest();
        RealCall call = realInterceptorChain.getCall();
        List emptyList = CollectionsKt.emptyList();
        boolean z = false;
        int i = 0;
        Response response = null;
        while (true) {
            boolean z2 = true;
            while (true) {
                call.enterNetworkInterceptorExchange(request, z2, realInterceptorChain);
                try {
                    if (call.getCanceled()) {
                        throw new IOException("Canceled");
                    }
                    try {
                        break;
                    } catch (IOException e) {
                        boolean recover = recover(e, call, request);
                        call.getEventListener().retryDecision(call, e, recover);
                        if (!recover) {
                            throw _UtilCommonKt.withSuppressed(e, emptyList);
                        }
                        emptyList = CollectionsKt.plus((Collection<? extends IOException>) emptyList, e);
                        call.exitNetworkInterceptorExchange$okhttp(true);
                        z2 = false;
                    }
                } catch (Throwable th) {
                    th = th;
                    z = true;
                }
            }
            call.exitNetworkInterceptorExchange$okhttp(true);
            request = followUpRequest;
        }
    }

    private final boolean recover(IOException e, RealCall call, Request userRequest) {
        boolean z = e instanceof ConnectionShutdownException;
        boolean z2 = !z;
        if (this.client.retryOnConnectionFailure()) {
            return (z || !requestIsOneShot(e, userRequest)) && isRecoverable(e, z2) && call.retryAfterFailure();
        }
        return false;
    }

    private final boolean requestIsOneShot(IOException e, Request userRequest) {
        RequestBody body = userRequest.body();
        return (body != null && body.isOneShot()) || (e instanceof FileNotFoundException);
    }

    private final boolean isRecoverable(IOException e, boolean requestSendStarted) {
        if (e instanceof ProtocolException) {
            return false;
        }
        return e instanceof InterruptedIOException ? (e instanceof SocketTimeoutException) && !requestSendStarted : (((e instanceof SSLHandshakeException) && (e.getCause() instanceof CertificateException)) || (e instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    private final Request followUpRequest(Response userResponse, Exchange exchange) throws IOException {
        RealConnection connection$okhttp;
        Route route = (exchange == null || (connection$okhttp = exchange.getConnection$okhttp()) == null) ? null : connection$okhttp.route();
        int code = userResponse.code();
        String method = userResponse.request().method();
        if (code != 307 && code != 308) {
            if (code == 401) {
                return this.client.authenticator().authenticate(route, userResponse);
            }
            if (code == 421) {
                RequestBody body = userResponse.request().body();
                if ((body != null && body.isOneShot()) || exchange == null || !exchange.isCoalescedConnection$okhttp()) {
                    return null;
                }
                exchange.getConnection$okhttp().noCoalescedConnections$okhttp();
                return userResponse.request();
            }
            if (code == 503) {
                Response priorResponse = userResponse.priorResponse();
                if ((priorResponse == null || priorResponse.code() != 503) && retryAfter(userResponse, Integer.MAX_VALUE) == 0) {
                    return userResponse.request();
                }
                return null;
            }
            if (code == 407) {
                Intrinsics.checkNotNull(route);
                if (route.proxy().type() != Proxy.Type.HTTP) {
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                return this.client.proxyAuthenticator().authenticate(route, userResponse);
            }
            if (code == 408) {
                if (!this.client.retryOnConnectionFailure()) {
                    return null;
                }
                RequestBody body2 = userResponse.request().body();
                if (body2 != null && body2.isOneShot()) {
                    return null;
                }
                Response priorResponse2 = userResponse.priorResponse();
                if ((priorResponse2 == null || priorResponse2.code() != 408) && retryAfter(userResponse, 0) <= 0) {
                    return userResponse.request();
                }
                return null;
            }
            switch (code) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        return buildRedirectRequest(userResponse, method);
    }

    private final Request buildRedirectRequest(Response userResponse, String method) {
        String header$default;
        HttpUrl resolve;
        if (!this.client.followRedirects() || (header$default = Response.header$default(userResponse, com.google.common.net.HttpHeaders.LOCATION, null, 2, null)) == null || (resolve = userResponse.request().url().resolve(header$default)) == null) {
            return null;
        }
        if (!Intrinsics.areEqual(resolve.scheme(), userResponse.request().url().scheme()) && !this.client.followSslRedirects()) {
            return null;
        }
        Request.Builder newBuilder = userResponse.request().newBuilder();
        if (HttpMethod.permitsRequestBody(method)) {
            int code = userResponse.code();
            boolean z = HttpMethod.INSTANCE.redirectsWithBody(method) || code == 308 || code == 307;
            if (HttpMethod.INSTANCE.redirectsToGet(method) && code != 308 && code != 307) {
                newBuilder.method("GET", null);
            } else {
                newBuilder.method(method, z ? userResponse.request().body() : null);
            }
            if (!z) {
                newBuilder.removeHeader(com.google.common.net.HttpHeaders.TRANSFER_ENCODING);
                newBuilder.removeHeader(com.google.common.net.HttpHeaders.CONTENT_LENGTH);
                newBuilder.removeHeader("Content-Type");
            }
        }
        if (!_UtilJvmKt.canReuseConnectionFor(userResponse.request().url(), resolve)) {
            newBuilder.removeHeader(com.google.common.net.HttpHeaders.AUTHORIZATION);
        }
        return newBuilder.url(resolve).build();
    }

    private final int retryAfter(Response userResponse, int defaultDelay) {
        String header$default = Response.header$default(userResponse, "Retry-After", null, 2, null);
        if (header$default == null) {
            return defaultDelay;
        }
        if (!new Regex("\\d+").matches(header$default)) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(header$default);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
        return valueOf.intValue();
    }
}
