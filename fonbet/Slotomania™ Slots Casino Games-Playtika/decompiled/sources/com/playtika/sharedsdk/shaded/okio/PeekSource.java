package com.playtika.sharedsdk.shaded.okio;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PeekSource.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/playtika/sharedsdk/shaded/okio/PeekSource;", "Lcom/playtika/sharedsdk/shaded/okio/Source;", "upstream", "Lcom/playtika/sharedsdk/shaded/okio/BufferedSource;", "<init>", "(Lokio/BufferedSource;)V", "buffer", "Lcom/playtika/sharedsdk/shaded/okio/Buffer;", "expectedSegment", "Lcom/playtika/sharedsdk/shaded/okio/Segment;", "expectedPos", "", "closed", "", "pos", "", "read", "sink", "byteCount", "timeout", "Lcom/playtika/sharedsdk/shaded/okio/Timeout;", "close", "", "com.playtika.sharedsdk.shaded.okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PeekSource implements Source {
    private final Buffer buffer;
    private boolean closed;
    private int expectedPos;
    private Segment expectedSegment;
    private long pos;
    private final BufferedSource upstream;

    public PeekSource(BufferedSource upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        this.upstream = upstream;
        Buffer buffer = upstream.getBuffer();
        this.buffer = buffer;
        this.expectedSegment = buffer.head;
        Segment segment = buffer.head;
        this.expectedPos = segment != null ? segment.pos : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        if (r3 == r4.pos) goto L15;
     */
    @Override // com.playtika.sharedsdk.shaded.okio.Source
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long read(Buffer sink, long byteCount) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (byteCount < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
        }
        if (this.closed) {
            throw new IllegalStateException("closed".toString());
        }
        Segment segment = this.expectedSegment;
        if (segment != null) {
            if (segment == this.buffer.head) {
                int i = this.expectedPos;
                Segment segment2 = this.buffer.head;
                Intrinsics.checkNotNull(segment2);
            }
            throw new IllegalStateException("Peek source is invalid because upstream source was used".toString());
        }
        if (byteCount == 0) {
            return 0L;
        }
        if (!this.upstream.request(this.pos + 1)) {
            return -1L;
        }
        if (this.expectedSegment == null && this.buffer.head != null) {
            this.expectedSegment = this.buffer.head;
            Segment segment3 = this.buffer.head;
            Intrinsics.checkNotNull(segment3);
            this.expectedPos = segment3.pos;
        }
        long min = Math.min(byteCount, this.buffer.size() - this.pos);
        this.buffer.copyTo(sink, this.pos, min);
        this.pos += min;
        return min;
    }

    @Override // com.playtika.sharedsdk.shaded.okio.Source
    /* renamed from: timeout */
    public Timeout getTimeout() {
        return this.upstream.getTimeout();
    }

    @Override // com.playtika.sharedsdk.shaded.okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.closed = true;
    }
}
