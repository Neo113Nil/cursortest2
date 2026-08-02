package com.playtika.sharedsdk.shaded.okhttp3.internal;

import com.playtika.sharedsdk.shaded.okhttp3.MediaType;
import com.playtika.sharedsdk.shaded.okhttp3.ResponseBody;
import com.playtika.sharedsdk.shaded.okio.Buffer;
import com.playtika.sharedsdk.shaded.okio.BufferedSource;
import com.playtika.sharedsdk.shaded.okio.Okio;
import com.playtika.sharedsdk.shaded.okio.Source;
import com.playtika.sharedsdk.shaded.okio.Timeout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UnreadableResponseBody.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\n\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0006H\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/playtika/sharedsdk/shaded/okhttp3/internal/UnreadableResponseBody;", "Lcom/playtika/sharedsdk/shaded/okhttp3/ResponseBody;", "Lcom/playtika/sharedsdk/shaded/okio/Source;", "mediaType", "Lcom/playtika/sharedsdk/shaded/okhttp3/MediaType;", "contentLength", "", "<init>", "(Lokhttp3/MediaType;J)V", "contentType", "source", "Lcom/playtika/sharedsdk/shaded/okio/BufferedSource;", "read", "sink", "Lcom/playtika/sharedsdk/shaded/okio/Buffer;", "byteCount", "timeout", "Lcom/playtika/sharedsdk/shaded/okio/Timeout;", "close", "", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UnreadableResponseBody extends ResponseBody implements Source {
    private final long contentLength;
    private final MediaType mediaType;

    @Override // com.playtika.sharedsdk.shaded.okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public UnreadableResponseBody(MediaType mediaType, long j) {
        this.mediaType = mediaType;
        this.contentLength = j;
    }

    @Override // com.playtika.sharedsdk.shaded.okhttp3.ResponseBody
    /* renamed from: contentType, reason: from getter */
    public MediaType getMediaType() {
        return this.mediaType;
    }

    @Override // com.playtika.sharedsdk.shaded.okhttp3.ResponseBody
    /* renamed from: contentLength, reason: from getter */
    public long getContentLength() {
        return this.contentLength;
    }

    @Override // com.playtika.sharedsdk.shaded.okhttp3.ResponseBody
    /* renamed from: source */
    public BufferedSource getSource() {
        return Okio.buffer(this);
    }

    @Override // com.playtika.sharedsdk.shaded.okio.Source
    public long read(Buffer sink, long byteCount) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        throw new IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }

    @Override // com.playtika.sharedsdk.shaded.okio.Source
    /* renamed from: timeout */
    public Timeout getTimeout() {
        return Timeout.NONE;
    }
}
