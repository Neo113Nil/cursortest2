package com.turboimage.events.interceptor;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;
import okio.Source;

/* compiled from: ProgressResponseBody.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\n\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\bH\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/turboimage/events/interceptor/ProgressResponseBody;", "Lokhttp3/ResponseBody;", "responseBody", "progressListener", "Lcom/turboimage/events/interceptor/ProgressListener;", "<init>", "(Lokhttp3/ResponseBody;Lcom/turboimage/events/interceptor/ProgressListener;)V", "bufferedSource", "Lokio/BufferedSource;", "getBufferedSource", "()Lokio/BufferedSource;", "bufferedSource$delegate", "Lkotlin/Lazy;", "contentType", "Lokhttp3/MediaType;", "contentLength", "", "source", "Lokio/Source;", "react-native-turbo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ProgressResponseBody extends ResponseBody {

    /* renamed from: bufferedSource$delegate, reason: from kotlin metadata */
    private final Lazy bufferedSource;
    private final ProgressListener progressListener;
    private final ResponseBody responseBody;

    public ProgressResponseBody(ResponseBody responseBody, ProgressListener progressListener) {
        Intrinsics.checkNotNullParameter(responseBody, "responseBody");
        Intrinsics.checkNotNullParameter(progressListener, "progressListener");
        this.responseBody = responseBody;
        this.progressListener = progressListener;
        this.bufferedSource = LazyKt.lazy(new Function0() { // from class: com.turboimage.events.interceptor.ProgressResponseBody$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BufferedSource bufferedSource_delegate$lambda$0;
                bufferedSource_delegate$lambda$0 = ProgressResponseBody.bufferedSource_delegate$lambda$0(ProgressResponseBody.this);
                return bufferedSource_delegate$lambda$0;
            }
        });
    }

    private final BufferedSource getBufferedSource() {
        return (BufferedSource) this.bufferedSource.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BufferedSource bufferedSource_delegate$lambda$0(ProgressResponseBody progressResponseBody) {
        return Okio.buffer(progressResponseBody.source(progressResponseBody.responseBody.getBodySource()));
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: contentType */
    public MediaType get$contentType() {
        return this.responseBody.get$contentType();
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: contentLength */
    public long getContentLength() {
        return this.responseBody.getContentLength();
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: source */
    public BufferedSource getBodySource() {
        return getBufferedSource();
    }

    private final Source source(final Source source) {
        return new ForwardingSource(source) { // from class: com.turboimage.events.interceptor.ProgressResponseBody$source$1
            private long totalBytesRead;

            public final long getTotalBytesRead() {
                return this.totalBytesRead;
            }

            public final void setTotalBytesRead(long j) {
                this.totalBytesRead = j;
            }

            @Override // okio.ForwardingSource, okio.Source
            public long read(Buffer sink, long byteCount) {
                ProgressListener progressListener;
                ResponseBody responseBody;
                Intrinsics.checkNotNullParameter(sink, "sink");
                long read = super.read(sink, byteCount);
                this.totalBytesRead += read != -1 ? read : 0L;
                progressListener = this.progressListener;
                long j = this.totalBytesRead;
                responseBody = this.responseBody;
                progressListener.update(j, responseBody.getContentLength(), read == -1);
                return read;
            }
        };
    }
}
