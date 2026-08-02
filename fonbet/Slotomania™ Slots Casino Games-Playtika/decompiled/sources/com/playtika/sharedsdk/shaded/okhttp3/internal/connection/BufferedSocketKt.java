package com.playtika.sharedsdk.shaded.okhttp3.internal.connection;

import com.playtika.sharedsdk.shaded.okio.BufferedSink;
import com.playtika.sharedsdk.shaded.okio.BufferedSource;
import com.playtika.sharedsdk.shaded.okio.Okio;
import java.net.Socket;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BufferedSocket.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0003¨\u0006\u0004"}, d2 = {"asBufferedSocket", "Lcom/playtika/sharedsdk/shaded/okhttp3/internal/connection/BufferedSocket;", "Ljava/net/Socket;", "Lcom/playtika/sharedsdk/shaded/okio/Socket;", "okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BufferedSocketKt {
    public static final BufferedSocket asBufferedSocket(Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        return asBufferedSocket(Okio.socket(socket));
    }

    public static final BufferedSocket asBufferedSocket(final com.playtika.sharedsdk.shaded.okio.Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        return new BufferedSocket(socket) { // from class: com.playtika.sharedsdk.shaded.okhttp3.internal.connection.BufferedSocketKt$asBufferedSocket$1
            private final com.playtika.sharedsdk.shaded.okio.Socket delegate;
            private final BufferedSink sink;
            private final BufferedSource source;

            {
                this.delegate = socket;
                this.source = Okio.buffer(socket.getSource());
                this.sink = Okio.buffer(socket.getSink());
            }

            @Override // com.playtika.sharedsdk.shaded.okio.Socket
            public BufferedSource getSource() {
                return this.source;
            }

            @Override // com.playtika.sharedsdk.shaded.okio.Socket
            public BufferedSink getSink() {
                return this.sink;
            }

            @Override // com.playtika.sharedsdk.shaded.okio.Socket
            public void cancel() {
                this.delegate.cancel();
            }
        };
    }
}
