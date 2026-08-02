package com.playtika.sharedsdk.shaded.okhttp3.internal.connection;

import com.playtika.sharedsdk.shaded.okio.BufferedSink;
import com.playtika.sharedsdk.shaded.okio.BufferedSource;
import com.playtika.sharedsdk.shaded.okio.Socket;
import kotlin.Metadata;

/* compiled from: BufferedSocket.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/playtika/sharedsdk/shaded/okhttp3/internal/connection/BufferedSocket;", "Lcom/playtika/sharedsdk/shaded/okio/Socket;", "source", "Lcom/playtika/sharedsdk/shaded/okio/BufferedSource;", "getSource", "()Lokio/BufferedSource;", "sink", "Lcom/playtika/sharedsdk/shaded/okio/BufferedSink;", "getSink", "()Lokio/BufferedSink;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface BufferedSocket extends Socket {
    @Override // com.playtika.sharedsdk.shaded.okio.Socket
    BufferedSink getSink();

    @Override // com.playtika.sharedsdk.shaded.okio.Socket
    BufferedSource getSource();
}
