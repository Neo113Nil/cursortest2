package com.playtika.sharedsdk.shaded.okhttp3.internal.http;

import com.playtika.sharedsdk.shaded.okhttp3.Headers;
import com.playtika.sharedsdk.shaded.okhttp3.Interceptor;
import com.playtika.sharedsdk.shaded.okhttp3.Request;
import com.playtika.sharedsdk.shaded.okhttp3.RequestBody;
import com.playtika.sharedsdk.shaded.okhttp3.Response;
import com.playtika.sharedsdk.shaded.okhttp3.ResponseBody;
import com.playtika.sharedsdk.shaded.okhttp3.TrailersSource;
import com.playtika.sharedsdk.shaded.okhttp3.internal.UnreadableResponseBody;
import com.playtika.sharedsdk.shaded.okhttp3.internal._UtilJvmKt;
import com.playtika.sharedsdk.shaded.okhttp3.internal.connection.Exchange;
import com.playtika.sharedsdk.shaded.okhttp3.internal.http2.ConnectionShutdownException;
import com.playtika.sharedsdk.shaded.okio.BufferedSink;
import com.playtika.sharedsdk.shaded.okio.BufferedSource;
import com.playtika.sharedsdk.shaded.okio.Okio;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: CallServerInterceptor.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002¨\u0006\f"}, d2 = {"Lcom/playtika/sharedsdk/shaded/okhttp3/internal/http/CallServerInterceptor;", "Lcom/playtika/sharedsdk/shaded/okhttp3/Interceptor;", "<init>", "()V", "intercept", "Lcom/playtika/sharedsdk/shaded/okhttp3/Response;", "chain", "Lcom/playtika/sharedsdk/shaded/okhttp3/Interceptor$Chain;", "shouldIgnoreAndWaitForRealResponse", "", "code", "", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CallServerInterceptor implements Interceptor {
    public static final CallServerInterceptor INSTANCE = new CallServerInterceptor();

    private final boolean shouldIgnoreAndWaitForRealResponse(int code) {
        if (code == 100) {
            return true;
        }
        return 102 <= code && code < 200;
    }

    private CallServerInterceptor() {
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00fa A[Catch: IOException -> 0x0206, TryCatch #1 {IOException -> 0x0206, blocks: (B:28:0x00f4, B:30:0x00fa, B:32:0x0103, B:34:0x0106, B:37:0x012d, B:41:0x0139, B:44:0x0144, B:45:0x014b, B:49:0x014f, B:54:0x0161, B:55:0x01a8, B:57:0x01b7, B:64:0x01cc, B:66:0x01db, B:67:0x0205, B:68:0x01c1, B:69:0x018d), top: B:27:0x00f4 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.playtika.sharedsdk.shaded.okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Response intercept(Interceptor.Chain chain) throws IOException {
        boolean z;
        IOException iOException;
        Response.Builder builder;
        Response build;
        int code;
        boolean z2;
        Response build2;
        Intrinsics.checkNotNullParameter(chain, "chain");
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        final Exchange exchange = realInterceptorChain.getExchange();
        Intrinsics.checkNotNull(exchange);
        Request request = realInterceptorChain.getRequest();
        RequestBody body = request.body();
        long currentTimeMillis = System.currentTimeMillis();
        boolean z3 = false;
        Response.Builder builder2 = (!HttpMethod.permitsRequestBody(request.method()) || body == null) ? null : 1;
        boolean equals = StringsKt.equals("upgrade", request.header(com.google.common.net.HttpHeaders.CONNECTION), true);
        try {
            exchange.writeRequestHeaders(request);
            try {
                if (builder2 != null) {
                    if (StringsKt.equals("100-continue", request.header(com.google.common.net.HttpHeaders.EXPECT), true)) {
                        exchange.flushRequest();
                        builder2 = exchange.readResponseHeaders(true);
                        try {
                            exchange.responseHeadersStart();
                            z = false;
                        } catch (IOException e) {
                            e = e;
                            z = true;
                            if (e instanceof ConnectionShutdownException) {
                                throw e;
                            }
                            if (!exchange.getHasFailure()) {
                                throw e;
                            }
                            Response.Builder builder3 = builder2;
                            iOException = e;
                            builder = builder3;
                            if (builder == null) {
                            }
                            build = builder.request(request).handshake(exchange.getConnection$okhttp().getHandshake()).sentRequestAtMillis(currentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
                            code = build.code();
                            while (shouldIgnoreAndWaitForRealResponse(code)) {
                                try {
                                } catch (IOException e2) {
                                    e = e2;
                                    if (iOException == null) {
                                    }
                                }
                            }
                            exchange.responseHeadersEnd(build);
                            if (code != 101) {
                            }
                            if (z2) {
                                throw new ProtocolException("Unexpected 101 code on HTTP/2 connection");
                            }
                            if (z2) {
                            }
                            if (!equals) {
                            }
                            final ResponseBody openResponseBody = exchange.openResponseBody(build);
                            build2 = build.newBuilder().body(openResponseBody).trailers(new TrailersSource() { // from class: com.playtika.sharedsdk.shaded.okhttp3.internal.http.CallServerInterceptor$intercept$1
                                @Override // com.playtika.sharedsdk.shaded.okhttp3.TrailersSource
                                public Headers peek() {
                                    return Exchange.this.peekTrailers();
                                }

                                @Override // com.playtika.sharedsdk.shaded.okhttp3.TrailersSource
                                public Headers get() {
                                    BufferedSource source = openResponseBody.getSource();
                                    if (source.isOpen()) {
                                        _UtilJvmKt.skipAll(source);
                                    }
                                    Headers peek = peek();
                                    if (peek != null) {
                                        return peek;
                                    }
                                    throw new IllegalStateException("null trailers after exhausting response body?!".toString());
                                }
                            }).build();
                            if (!StringsKt.equals("close", build2.request().header(com.google.common.net.HttpHeaders.CONNECTION), true)) {
                            }
                            exchange.noNewExchangesOnConnection();
                            if (code != 204) {
                            }
                            throw new ProtocolException("HTTP " + code + " had non-zero Content-Length: " + build2.body().getContentLength());
                        }
                    } else {
                        z = true;
                        builder2 = null;
                    }
                    if (builder2 == null) {
                        if (body.isDuplex()) {
                            exchange.flushRequest();
                            body.writeTo(Okio.buffer(exchange.createRequestBody(request, true)));
                        } else {
                            BufferedSink buffer = Okio.buffer(exchange.createRequestBody(request, false));
                            body.writeTo(buffer);
                            buffer.close();
                        }
                    } else {
                        exchange.noRequestBody();
                        if (!exchange.getConnection$okhttp().isMultiplexed$okhttp()) {
                            exchange.noNewExchangesOnConnection();
                        }
                    }
                } else {
                    exchange.noRequestBody();
                    z = true;
                    builder2 = null;
                }
                if (body == null || !body.isDuplex()) {
                    exchange.finishRequest();
                }
                builder = builder2;
                iOException = null;
            } catch (IOException e3) {
                e = e3;
            }
        } catch (IOException e4) {
            e = e4;
            z = true;
            builder2 = null;
        }
        if (builder == null) {
            try {
                builder = exchange.readResponseHeaders(false);
                Intrinsics.checkNotNull(builder);
                if (z) {
                    exchange.responseHeadersStart();
                    z = false;
                }
            } catch (IOException e5) {
                e = e5;
                if (iOException == null) {
                    ExceptionsKt.addSuppressed(iOException, e);
                    throw iOException;
                }
                throw e;
            }
        }
        build = builder.request(request).handshake(exchange.getConnection$okhttp().getHandshake()).sentRequestAtMillis(currentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
        code = build.code();
        while (shouldIgnoreAndWaitForRealResponse(code)) {
            Response.Builder readResponseHeaders = exchange.readResponseHeaders(z3);
            Intrinsics.checkNotNull(readResponseHeaders);
            if (z) {
                exchange.responseHeadersStart();
            }
            build = readResponseHeaders.request(request).handshake(exchange.getConnection$okhttp().getHandshake()).sentRequestAtMillis(currentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
            code = build.code();
            z3 = false;
        }
        exchange.responseHeadersEnd(build);
        z2 = code != 101;
        if (z2 && exchange.getConnection$okhttp().isMultiplexed$okhttp()) {
            throw new ProtocolException("Unexpected 101 code on HTTP/2 connection");
        }
        boolean z4 = !z2 && StringsKt.equals("upgrade", Response.header$default(build, com.google.common.net.HttpHeaders.CONNECTION, null, 2, null), true);
        if (!equals && z4) {
            build2 = build.newBuilder().body(new UnreadableResponseBody(build.body().getMediaType(), build.body().getContentLength())).socket(exchange.upgradeToSocket()).build();
        } else {
            final ResponseBody openResponseBody2 = exchange.openResponseBody(build);
            build2 = build.newBuilder().body(openResponseBody2).trailers(new TrailersSource() { // from class: com.playtika.sharedsdk.shaded.okhttp3.internal.http.CallServerInterceptor$intercept$1
                @Override // com.playtika.sharedsdk.shaded.okhttp3.TrailersSource
                public Headers peek() {
                    return Exchange.this.peekTrailers();
                }

                @Override // com.playtika.sharedsdk.shaded.okhttp3.TrailersSource
                public Headers get() {
                    BufferedSource source = openResponseBody2.getSource();
                    if (source.isOpen()) {
                        _UtilJvmKt.skipAll(source);
                    }
                    Headers peek = peek();
                    if (peek != null) {
                        return peek;
                    }
                    throw new IllegalStateException("null trailers after exhausting response body?!".toString());
                }
            }).build();
        }
        if (!StringsKt.equals("close", build2.request().header(com.google.common.net.HttpHeaders.CONNECTION), true) || StringsKt.equals("close", Response.header$default(build2, com.google.common.net.HttpHeaders.CONNECTION, null, 2, null), true)) {
            exchange.noNewExchangesOnConnection();
        }
        if ((code != 204 || code == 205) && build2.body().getContentLength() > 0) {
            throw new ProtocolException("HTTP " + code + " had non-zero Content-Length: " + build2.body().getContentLength());
        }
        return build2;
    }
}
