package com.playtika.sharedsdk.shaded.okio;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Okio.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0005H\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u0005H\u0016¨\u0006\u000e"}, d2 = {"Lcom/playtika/sharedsdk/shaded/okio/BlackholeSink;", "Lcom/playtika/sharedsdk/shaded/okio/Sink;", "<init>", "()V", "write", "", "source", "Lcom/playtika/sharedsdk/shaded/okio/Buffer;", "byteCount", "", "flush", "timeout", "Lcom/playtika/sharedsdk/shaded/okio/Timeout;", "close", "com.playtika.sharedsdk.shaded.okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
final class BlackholeSink implements Sink {
    @Override // com.playtika.sharedsdk.shaded.okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // com.playtika.sharedsdk.shaded.okio.Sink, java.io.Flushable
    public void flush() {
    }

    @Override // com.playtika.sharedsdk.shaded.okio.Sink
    public void write(Buffer source, long byteCount) {
        Intrinsics.checkNotNullParameter(source, "source");
        source.skip(byteCount);
    }

    @Override // com.playtika.sharedsdk.shaded.okio.Sink
    /* renamed from: timeout */
    public Timeout getTimeout() {
        return Timeout.NONE;
    }
}
