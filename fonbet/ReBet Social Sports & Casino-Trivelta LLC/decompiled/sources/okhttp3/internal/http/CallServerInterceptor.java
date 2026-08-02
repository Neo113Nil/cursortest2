package okhttp3.internal.http;

import com.twilio.voice.EventKeys;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.http2.ConnectionShutdownException;
import org.jetbrains.annotations.NotNull;
import ti.InterfaceC6479i;
import ti.t;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lokhttp3/internal/http/CallServerInterceptor;", "Lokhttp3/Interceptor;", "forWebSocket", "", "(Z)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "shouldIgnoreAndWaitForRealResponse", EventKeys.ERROR_CODE, "", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CallServerInterceptor implements Interceptor {
    private final boolean forWebSocket;

    public CallServerInterceptor(boolean z10) {
        this.forWebSocket = z10;
    }

    private final boolean shouldIgnoreAndWaitForRealResponse(int code) {
        if (code == 100) {
            return true;
        }
        return 102 <= code && code < 200;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e5 A[Catch: IOException -> 0x00b8, TryCatch #2 {IOException -> 0x00b8, blocks: (B:64:0x00aa, B:66:0x00b3, B:22:0x00bb, B:24:0x00e5, B:26:0x00ee, B:27:0x00f1, B:28:0x0115, B:32:0x0120, B:33:0x013f, B:35:0x014d, B:43:0x0163, B:45:0x0169, B:48:0x0176, B:50:0x0190, B:51:0x0198, B:52:0x01a2, B:61:0x0158, B:62:0x012f), top: B:63:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0169 A[Catch: IOException -> 0x00b8, TryCatch #2 {IOException -> 0x00b8, blocks: (B:64:0x00aa, B:66:0x00b3, B:22:0x00bb, B:24:0x00e5, B:26:0x00ee, B:27:0x00f1, B:28:0x0115, B:32:0x0120, B:33:0x013f, B:35:0x014d, B:43:0x0163, B:45:0x0169, B:48:0x0176, B:50:0x0190, B:51:0x0198, B:52:0x01a2, B:61:0x0158, B:62:0x012f), top: B:63:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0176 A[Catch: IOException -> 0x00b8, TryCatch #2 {IOException -> 0x00b8, blocks: (B:64:0x00aa, B:66:0x00b3, B:22:0x00bb, B:24:0x00e5, B:26:0x00ee, B:27:0x00f1, B:28:0x0115, B:32:0x0120, B:33:0x013f, B:35:0x014d, B:43:0x0163, B:45:0x0169, B:48:0x0176, B:50:0x0190, B:51:0x0198, B:52:0x01a2, B:61:0x0158, B:62:0x012f), top: B:63:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    @Override // okhttp3.Interceptor
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Response intercept(@NotNull Interceptor.Chain chain) {
        boolean z10;
        Response.Builder builder;
        Response.Builder builder2;
        int code;
        Response build;
        ResponseBody body;
        Response.Builder builder3;
        Intrinsics.checkNotNullParameter(chain, "chain");
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Exchange exchange = realInterceptorChain.getExchange();
        Intrinsics.checkNotNull(exchange);
        Request request = realInterceptorChain.getRequest();
        RequestBody body2 = request.body();
        long currentTimeMillis = System.currentTimeMillis();
        try {
            exchange.writeRequestHeaders(request);
            ?? permitsRequestBody = HttpMethod.permitsRequestBody(request.method());
            try {
                if (permitsRequestBody == 0 || body2 == null) {
                    exchange.noRequestBody();
                    z10 = true;
                    permitsRequestBody = 0;
                } else {
                    if (StringsKt.equals("100-continue", request.header("Expect"), true)) {
                        exchange.flushRequest();
                        Response.Builder readResponseHeaders = exchange.readResponseHeaders(true);
                        try {
                            exchange.responseHeadersStart();
                            z10 = false;
                            builder3 = readResponseHeaders;
                        } catch (IOException e10) {
                            e = e10;
                            z10 = true;
                            builder = readResponseHeaders;
                            if (e instanceof ConnectionShutdownException) {
                                throw e;
                            }
                            builder2 = builder;
                            if (!exchange.getHasFailure()) {
                                throw e;
                            }
                            if (builder2 == null) {
                            }
                            Response build2 = builder2.request(request).handshake(exchange.getConnection().getHandshake()).sentRequestAtMillis(currentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
                            code = build2.code();
                            if (shouldIgnoreAndWaitForRealResponse(code)) {
                            }
                            exchange.responseHeadersEnd(build2);
                            if (this.forWebSocket) {
                            }
                            if (!StringsKt.equals("close", build.request().header("Connection"), true)) {
                            }
                            exchange.noNewExchangesOnConnection();
                            if (code != 204) {
                            }
                            body = build.body();
                            if ((body == null ? body.getContentLength() : -1L) > 0) {
                            }
                            return build;
                        }
                    } else {
                        z10 = true;
                        builder3 = null;
                    }
                    if (builder3 != null) {
                        exchange.noRequestBody();
                        permitsRequestBody = builder3;
                        if (!exchange.getConnection().isMultiplexed$okhttp()) {
                            exchange.noNewExchangesOnConnection();
                            permitsRequestBody = builder3;
                        }
                    } else if (body2.isDuplex()) {
                        exchange.flushRequest();
                        body2.writeTo(t.c(exchange.createRequestBody(request, true)));
                        permitsRequestBody = builder3;
                    } else {
                        InterfaceC6479i c10 = t.c(exchange.createRequestBody(request, false));
                        body2.writeTo(c10);
                        c10.close();
                        permitsRequestBody = builder3;
                    }
                }
                if (body2 == null || !body2.isDuplex()) {
                    exchange.finishRequest();
                }
                e = null;
                builder2 = permitsRequestBody;
            } catch (IOException e11) {
                e = e11;
                builder = permitsRequestBody;
            }
        } catch (IOException e12) {
            e = e12;
            z10 = true;
            builder = null;
        }
        if (builder2 == null) {
            try {
                builder2 = exchange.readResponseHeaders(false);
                Intrinsics.checkNotNull(builder2);
                if (z10) {
                    exchange.responseHeadersStart();
                    z10 = false;
                }
            } catch (IOException e13) {
                if (e == null) {
                    throw e13;
                }
                ExceptionsKt.addSuppressed(e, e13);
                throw e;
            }
        }
        Response build22 = builder2.request(request).handshake(exchange.getConnection().getHandshake()).sentRequestAtMillis(currentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
        code = build22.code();
        if (shouldIgnoreAndWaitForRealResponse(code)) {
            Response.Builder readResponseHeaders2 = exchange.readResponseHeaders(false);
            Intrinsics.checkNotNull(readResponseHeaders2);
            if (z10) {
                exchange.responseHeadersStart();
            }
            build22 = readResponseHeaders2.request(request).handshake(exchange.getConnection().getHandshake()).sentRequestAtMillis(currentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
            code = build22.code();
        }
        exchange.responseHeadersEnd(build22);
        build = (this.forWebSocket || code != 101) ? build22.newBuilder().body(exchange.openResponseBody(build22)).build() : build22.newBuilder().body(Util.EMPTY_RESPONSE).build();
        if (!StringsKt.equals("close", build.request().header("Connection"), true) || StringsKt.equals("close", Response.header$default(build, "Connection", null, 2, null), true)) {
            exchange.noNewExchangesOnConnection();
        }
        if (code != 204 || code == 205) {
            body = build.body();
            if ((body == null ? body.getContentLength() : -1L) > 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("HTTP ");
                sb2.append(code);
                sb2.append(" had non-zero Content-Length: ");
                ResponseBody body3 = build.body();
                sb2.append(body3 != null ? Long.valueOf(body3.getContentLength()) : null);
                throw new ProtocolException(sb2.toString());
            }
        }
        return build;
    }
}
