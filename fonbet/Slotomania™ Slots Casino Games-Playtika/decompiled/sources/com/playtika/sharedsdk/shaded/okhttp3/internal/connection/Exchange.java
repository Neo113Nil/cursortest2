package com.playtika.sharedsdk.shaded.okhttp3.internal.connection;

import androidx.core.app.NotificationCompat;
import com.playtika.sharedsdk.shaded.okhttp3.EventListener;
import com.playtika.sharedsdk.shaded.okhttp3.Headers;
import com.playtika.sharedsdk.shaded.okhttp3.Request;
import com.playtika.sharedsdk.shaded.okhttp3.RequestBody;
import com.playtika.sharedsdk.shaded.okhttp3.Response;
import com.playtika.sharedsdk.shaded.okhttp3.ResponseBody;
import com.playtika.sharedsdk.shaded.okhttp3.internal.connection.Exchange;
import com.playtika.sharedsdk.shaded.okhttp3.internal.http.ExchangeCodec;
import com.playtika.sharedsdk.shaded.okhttp3.internal.http.RealResponseBody;
import com.playtika.sharedsdk.shaded.okio.Buffer;
import com.playtika.sharedsdk.shaded.okio.ForwardingSink;
import com.playtika.sharedsdk.shaded.okio.ForwardingSource;
import com.playtika.sharedsdk.shaded.okio.Okio;
import com.playtika.sharedsdk.shaded.okio.Sink;
import com.playtika.sharedsdk.shaded.okio.Socket;
import com.playtika.sharedsdk.shaded.okio.Source;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Exchange.kt */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002BCB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"J\u0016\u0010#\u001a\u00020$2\u0006\u0010!\u001a\u00020\"2\u0006\u0010%\u001a\u00020\u0013J\u0006\u0010&\u001a\u00020 J\u0006\u0010'\u001a\u00020 J\u0006\u0010(\u001a\u00020 J\u0010\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020\u0013J\u000e\u0010,\u001a\u00020 2\u0006\u0010-\u001a\u00020.J\u000e\u0010/\u001a\u0002002\u0006\u0010-\u001a\u00020.J\b\u00101\u001a\u0004\u0018\u000102J\u0006\u00103\u001a\u000204J\u0006\u00105\u001a\u00020 J\u0006\u00106\u001a\u00020 J\u0006\u00107\u001a\u00020 J\u0010\u00108\u001a\u00020 2\u0006\u00109\u001a\u00020:H\u0002J8\u0010;\u001a\u0004\u0018\u00010:2\b\b\u0002\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\u00132\b\b\u0002\u0010?\u001a\u00020\u00132\b\b\u0002\u0010@\u001a\u00020\u00132\b\u00109\u001a\u0004\u0018\u00010:J\u0006\u0010A\u001a\u00020 R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0013@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0013@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u001a8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00138@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0016¨\u0006D"}, d2 = {"Lcom/playtika/sharedsdk/shaded/okhttp3/internal/connection/Exchange;", "", NotificationCompat.CATEGORY_CALL, "Lcom/playtika/sharedsdk/shaded/okhttp3/internal/connection/RealCall;", "eventListener", "Lcom/playtika/sharedsdk/shaded/okhttp3/EventListener;", "finder", "Lcom/playtika/sharedsdk/shaded/okhttp3/internal/connection/ExchangeFinder;", "codec", "Lcom/playtika/sharedsdk/shaded/okhttp3/internal/http/ExchangeCodec;", "<init>", "(Lokhttp3/internal/connection/RealCall;Lokhttp3/EventListener;Lokhttp3/internal/connection/ExchangeFinder;Lokhttp3/internal/http/ExchangeCodec;)V", "getCall$okhttp", "()Lokhttp3/internal/connection/RealCall;", "getEventListener$okhttp", "()Lokhttp3/EventListener;", "getFinder$okhttp", "()Lokhttp3/internal/connection/ExchangeFinder;", "value", "", "isDuplex", "isDuplex$okhttp", "()Z", "hasFailure", "getHasFailure$okhttp", "connection", "Lcom/playtika/sharedsdk/shaded/okhttp3/internal/connection/RealConnection;", "getConnection$okhttp", "()Lokhttp3/internal/connection/RealConnection;", "isCoalescedConnection", "isCoalescedConnection$okhttp", "writeRequestHeaders", "", "request", "Lcom/playtika/sharedsdk/shaded/okhttp3/Request;", "createRequestBody", "Lcom/playtika/sharedsdk/shaded/okio/Sink;", "duplex", "flushRequest", "finishRequest", "responseHeadersStart", "readResponseHeaders", "Lcom/playtika/sharedsdk/shaded/okhttp3/Response$Builder;", "expectContinue", "responseHeadersEnd", "response", "Lcom/playtika/sharedsdk/shaded/okhttp3/Response;", "openResponseBody", "Lcom/playtika/sharedsdk/shaded/okhttp3/ResponseBody;", "peekTrailers", "Lcom/playtika/sharedsdk/shaded/okhttp3/Headers;", "upgradeToSocket", "Lcom/playtika/sharedsdk/shaded/okio/Socket;", "noNewExchangesOnConnection", "cancel", "detachWithViolence", "trackFailure", "e", "Ljava/io/IOException;", "bodyComplete", "bytesRead", "", "isSocket", "responseDone", "requestDone", "noRequestBody", "RequestBodySink", "ResponseBodySource", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Exchange {
    private final RealCall call;
    private final ExchangeCodec codec;
    private final EventListener eventListener;
    private final ExchangeFinder finder;
    private boolean hasFailure;
    private boolean isDuplex;

    public Exchange(RealCall call, EventListener eventListener, ExchangeFinder finder, ExchangeCodec codec) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        Intrinsics.checkNotNullParameter(finder, "finder");
        Intrinsics.checkNotNullParameter(codec, "codec");
        this.call = call;
        this.eventListener = eventListener;
        this.finder = finder;
        this.codec = codec;
    }

    /* renamed from: getCall$okhttp, reason: from getter */
    public final RealCall getCall() {
        return this.call;
    }

    /* renamed from: getEventListener$okhttp, reason: from getter */
    public final EventListener getEventListener() {
        return this.eventListener;
    }

    /* renamed from: getFinder$okhttp, reason: from getter */
    public final ExchangeFinder getFinder() {
        return this.finder;
    }

    /* renamed from: isDuplex$okhttp, reason: from getter */
    public final boolean getIsDuplex() {
        return this.isDuplex;
    }

    /* renamed from: getHasFailure$okhttp, reason: from getter */
    public final boolean getHasFailure() {
        return this.hasFailure;
    }

    public final RealConnection getConnection$okhttp() {
        ExchangeCodec.Carrier carrier = this.codec.getCarrier();
        RealConnection realConnection = carrier instanceof RealConnection ? (RealConnection) carrier : null;
        if (realConnection != null) {
            return realConnection;
        }
        throw new IllegalStateException("no connection for CONNECT tunnels".toString());
    }

    public final boolean isCoalescedConnection$okhttp() {
        return !Intrinsics.areEqual(this.finder.getRoutePlanner().getAddress().url().host(), this.codec.getCarrier().getRoute().address().url().host());
    }

    public final void writeRequestHeaders(Request request) throws IOException {
        Intrinsics.checkNotNullParameter(request, "request");
        try {
            this.eventListener.requestHeadersStart(this.call);
            this.codec.writeRequestHeaders(request);
            this.eventListener.requestHeadersEnd(this.call, request);
        } catch (IOException e) {
            this.eventListener.requestFailed(this.call, e);
            trackFailure(e);
            throw e;
        }
    }

    public final Sink createRequestBody(Request request, boolean duplex) throws IOException {
        Intrinsics.checkNotNullParameter(request, "request");
        this.isDuplex = duplex;
        RequestBody body = request.body();
        Intrinsics.checkNotNull(body);
        long contentLength = body.contentLength();
        this.eventListener.requestBodyStart(this.call);
        return new RequestBodySink(this, this.codec.createRequestBody(request, contentLength), contentLength, false);
    }

    public final void flushRequest() throws IOException {
        try {
            this.codec.flushRequest();
        } catch (IOException e) {
            this.eventListener.requestFailed(this.call, e);
            trackFailure(e);
            throw e;
        }
    }

    public final void finishRequest() throws IOException {
        try {
            this.codec.finishRequest();
        } catch (IOException e) {
            this.eventListener.requestFailed(this.call, e);
            trackFailure(e);
            throw e;
        }
    }

    public final void responseHeadersStart() {
        this.eventListener.responseHeadersStart(this.call);
    }

    public final Response.Builder readResponseHeaders(boolean expectContinue) throws IOException {
        try {
            Response.Builder readResponseHeaders = this.codec.readResponseHeaders(expectContinue);
            if (readResponseHeaders != null) {
                readResponseHeaders.initExchange$okhttp(this);
            }
            return readResponseHeaders;
        } catch (IOException e) {
            this.eventListener.responseFailed(this.call, e);
            trackFailure(e);
            throw e;
        }
    }

    public final void responseHeadersEnd(Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        this.eventListener.responseHeadersEnd(this.call, response);
    }

    public final ResponseBody openResponseBody(Response response) throws IOException {
        Exchange exchange;
        String header$default;
        long reportedContentLength;
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            header$default = Response.header$default(response, "Content-Type", null, 2, null);
            reportedContentLength = this.codec.reportedContentLength(response);
            exchange = this;
        } catch (IOException e) {
            e = e;
            exchange = this;
        }
        try {
            return new RealResponseBody(header$default, reportedContentLength, Okio.buffer(new ResponseBodySource(exchange, this.codec.openResponseBodySource(response), reportedContentLength, false)));
        } catch (IOException e2) {
            e = e2;
            IOException iOException = e;
            exchange.eventListener.responseFailed(exchange.call, iOException);
            trackFailure(iOException);
            throw iOException;
        }
    }

    public final Headers peekTrailers() throws IOException {
        return this.codec.peekTrailers();
    }

    public final Socket upgradeToSocket() {
        this.call.upgradeToSocket();
        ExchangeCodec.Carrier carrier = this.codec.getCarrier();
        Intrinsics.checkNotNull(carrier, "null cannot be cast to non-null type okhttp3.internal.connection.RealConnection");
        ((RealConnection) carrier).useAsSocket$okhttp();
        return new Socket() { // from class: com.playtika.sharedsdk.shaded.okhttp3.internal.connection.Exchange$upgradeToSocket$1
            private final Exchange.RequestBodySink sink;
            private final Exchange.ResponseBodySource source;

            {
                this.sink = new Exchange.RequestBodySink(Exchange.this, Exchange.this.codec.getSocket().getSink(), -1L, true);
                this.source = new Exchange.ResponseBodySource(Exchange.this, Exchange.this.codec.getSocket().getSource(), -1L, true);
            }

            @Override // com.playtika.sharedsdk.shaded.okio.Socket
            public void cancel() {
                Exchange.this.cancel();
            }

            @Override // com.playtika.sharedsdk.shaded.okio.Socket
            public Exchange.RequestBodySink getSink() {
                return this.sink;
            }

            @Override // com.playtika.sharedsdk.shaded.okio.Socket
            public Exchange.ResponseBodySource getSource() {
                return this.source;
            }
        };
    }

    public final void noNewExchangesOnConnection() {
        this.codec.getCarrier().noNewExchanges();
    }

    public final void cancel() {
        this.codec.cancel();
    }

    public final void detachWithViolence() {
        this.codec.cancel();
        this.call.messageDone$okhttp(this, true, true, true, true, null);
    }

    private final void trackFailure(IOException e) {
        this.hasFailure = true;
        this.codec.getCarrier().trackFailure(this.call, e);
    }

    public static /* synthetic */ IOException bodyComplete$default(Exchange exchange, long j, boolean z, boolean z2, boolean z3, IOException iOException, int i, Object obj) {
        if ((i & 1) != 0) {
            j = -1;
        }
        return exchange.bodyComplete(j, z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, iOException);
    }

    public final IOException bodyComplete(long bytesRead, boolean isSocket, boolean responseDone, boolean requestDone, IOException e) {
        if (e != null) {
            trackFailure(e);
        }
        if (requestDone) {
            if (e != null) {
                this.eventListener.requestFailed(this.call, e);
            } else {
                this.eventListener.requestBodyEnd(this.call, bytesRead);
            }
        }
        if (responseDone) {
            if (e != null) {
                this.eventListener.responseFailed(this.call, e);
            } else {
                this.eventListener.responseBodyEnd(this.call, bytesRead);
            }
        }
        return this.call.messageDone$okhttp(this, requestDone && !isSocket, responseDone && !isSocket, responseDone && isSocket, requestDone && isSocket, e);
    }

    public final void noRequestBody() {
        RealCall.messageDone$okhttp$default(this.call, this, true, false, false, false, null, 28, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Exchange.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0005H\u0016J\b\u0010\u0013\u001a\u00020\u000fH\u0016J\b\u0010\u0014\u001a\u00020\u000fH\u0016J\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/playtika/sharedsdk/shaded/okhttp3/internal/connection/Exchange$RequestBodySink;", "Lcom/playtika/sharedsdk/shaded/okio/ForwardingSink;", "delegate", "Lcom/playtika/sharedsdk/shaded/okio/Sink;", "contentLength", "", "isSocket", "", "<init>", "(Lokhttp3/internal/connection/Exchange;Lokio/Sink;JZ)V", "completed", "bytesReceived", "invokeStartEvent", "closed", "write", "", "source", "Lcom/playtika/sharedsdk/shaded/okio/Buffer;", "byteCount", "flush", "close", "complete", "Ljava/io/IOException;", "e", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    final class RequestBodySink extends ForwardingSink {
        private long bytesReceived;
        private boolean closed;
        private boolean completed;
        private final long contentLength;
        private boolean invokeStartEvent;
        private final boolean isSocket;
        final /* synthetic */ Exchange this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequestBodySink(Exchange exchange, Sink delegate, long j, boolean z) {
            super(delegate);
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.this$0 = exchange;
            this.contentLength = j;
            this.isSocket = z;
            this.invokeStartEvent = z;
        }

        @Override // com.playtika.sharedsdk.shaded.okio.ForwardingSink, com.playtika.sharedsdk.shaded.okio.Sink
        public void write(Buffer source, long byteCount) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            if (this.closed) {
                throw new IllegalStateException("closed".toString());
            }
            long j = this.contentLength;
            if (j != -1 && this.bytesReceived + byteCount > j) {
                throw new ProtocolException("expected " + this.contentLength + " bytes but received " + (this.bytesReceived + byteCount));
            }
            try {
                if (this.invokeStartEvent) {
                    this.invokeStartEvent = false;
                    this.this$0.getEventListener().requestBodyStart(this.this$0.getCall());
                }
                super.write(source, byteCount);
                this.bytesReceived += byteCount;
            } catch (IOException e) {
                IOException complete = complete(e);
                Intrinsics.checkNotNull(complete);
                throw complete;
            }
        }

        @Override // com.playtika.sharedsdk.shaded.okio.ForwardingSink, com.playtika.sharedsdk.shaded.okio.Sink, java.io.Flushable
        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e) {
                IOException complete = complete(e);
                Intrinsics.checkNotNull(complete);
                throw complete;
            }
        }

        @Override // com.playtika.sharedsdk.shaded.okio.ForwardingSink, com.playtika.sharedsdk.shaded.okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.closed) {
                return;
            }
            this.closed = true;
            long j = this.contentLength;
            if (j != -1 && this.bytesReceived != j) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                complete(null);
            } catch (IOException e) {
                IOException complete = complete(e);
                Intrinsics.checkNotNull(complete);
                throw complete;
            }
        }

        private final IOException complete(IOException e) {
            if (this.completed) {
                return e;
            }
            this.completed = true;
            return Exchange.bodyComplete$default(this.this$0, this.bytesReceived, this.isSocket, false, true, e, 4, null);
        }
    }

    /* compiled from: Exchange.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/playtika/sharedsdk/shaded/okhttp3/internal/connection/Exchange$ResponseBodySource;", "Lcom/playtika/sharedsdk/shaded/okio/ForwardingSource;", "delegate", "Lcom/playtika/sharedsdk/shaded/okio/Source;", "contentLength", "", "isSocket", "", "<init>", "(Lokhttp3/internal/connection/Exchange;Lokio/Source;JZ)V", "bytesReceived", "invokeStartEvent", "completed", "closed", "read", "sink", "Lcom/playtika/sharedsdk/shaded/okio/Buffer;", "byteCount", "close", "", "complete", "Ljava/io/IOException;", "e", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class ResponseBodySource extends ForwardingSource {
        private long bytesReceived;
        private boolean closed;
        private boolean completed;
        private final long contentLength;
        private boolean invokeStartEvent;
        private final boolean isSocket;
        final /* synthetic */ Exchange this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResponseBodySource(Exchange exchange, Source delegate, long j, boolean z) {
            super(delegate);
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.this$0 = exchange;
            this.contentLength = j;
            this.isSocket = z;
            this.invokeStartEvent = true;
            if (j == 0) {
                complete(null);
            }
        }

        @Override // com.playtika.sharedsdk.shaded.okio.ForwardingSource, com.playtika.sharedsdk.shaded.okio.Source
        public long read(Buffer sink, long byteCount) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (this.closed) {
                throw new IllegalStateException("closed".toString());
            }
            try {
                long read = delegate().read(sink, byteCount);
                if (this.invokeStartEvent) {
                    this.invokeStartEvent = false;
                    this.this$0.getEventListener().responseBodyStart(this.this$0.getCall());
                }
                if (read == -1) {
                    complete(null);
                    return -1L;
                }
                long j = this.bytesReceived + read;
                long j2 = this.contentLength;
                if (j2 != -1 && j > j2) {
                    throw new ProtocolException("expected " + this.contentLength + " bytes but received " + j);
                }
                this.bytesReceived = j;
                if (this.this$0.codec.isResponseComplete()) {
                    complete(null);
                }
                return read;
            } catch (IOException e) {
                IOException complete = complete(e);
                Intrinsics.checkNotNull(complete);
                throw complete;
            }
        }

        @Override // com.playtika.sharedsdk.shaded.okio.ForwardingSource, com.playtika.sharedsdk.shaded.okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.closed) {
                return;
            }
            this.closed = true;
            try {
                super.close();
                complete(null);
            } catch (IOException e) {
                IOException complete = complete(e);
                Intrinsics.checkNotNull(complete);
                throw complete;
            }
        }

        public final IOException complete(IOException e) {
            if (this.completed) {
                return e;
            }
            this.completed = true;
            if (e == null && this.invokeStartEvent) {
                this.invokeStartEvent = false;
                this.this$0.getEventListener().responseBodyStart(this.this$0.getCall());
            }
            return Exchange.bodyComplete$default(this.this$0, this.bytesReceived, this.isSocket, true, false, e, 8, null);
        }
    }
}
