package com.facebook.react.modules.network;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ti.AbstractC6473c;
import ti.C6472b;
import ti.E;
import ti.InterfaceC6479i;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0019R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/facebook/react/modules/network/ProgressRequestBody;", "Lokhttp3/RequestBody;", "requestBody", "Lcom/facebook/react/modules/network/ProgressListener;", "progressListener", "<init>", "(Lokhttp3/RequestBody;Lcom/facebook/react/modules/network/ProgressListener;)V", "Lti/i;", "sink", "Lti/E;", "outputStreamSink", "(Lti/i;)Lti/E;", "Lokhttp3/MediaType;", "contentType", "()Lokhttp3/MediaType;", "", "contentLength", "()J", "", "writeTo", "(Lti/i;)V", "", "getBodyPreview", "()Ljava/lang/String;", "Lokhttp3/RequestBody;", "Lcom/facebook/react/modules/network/ProgressListener;", "J", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProgressRequestBody extends RequestBody {
    private long contentLength;

    @NotNull
    private final ProgressListener progressListener;

    @NotNull
    private final RequestBody requestBody;

    public ProgressRequestBody(@NotNull RequestBody requestBody, @NotNull ProgressListener progressListener) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(progressListener, "progressListener");
        this.requestBody = requestBody;
        this.progressListener = progressListener;
    }

    private final E outputStreamSink(InterfaceC6479i sink) {
        C6472b a10 = AbstractC6473c.a();
        final OutputStream U12 = sink.U1();
        return a10.d(new FilterOutputStream(U12) { // from class: com.facebook.react.modules.network.ProgressRequestBody$outputStreamSink$1
            private long count;

            public final void sendProgressUpdate() {
                ProgressListener progressListener;
                long j10 = this.count;
                long contentLength = ProgressRequestBody.this.contentLength();
                progressListener = ProgressRequestBody.this.progressListener;
                progressListener.onProgress(j10, contentLength, j10 == contentLength);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] data, int offset, int byteCount) {
                Intrinsics.checkNotNullParameter(data, "data");
                super.write(data, offset, byteCount);
                this.count += byteCount;
                sendProgressUpdate();
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int data) {
                super.write(data);
                this.count++;
                sendProgressUpdate();
            }
        });
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        if (this.contentLength == 0) {
            this.contentLength = this.requestBody.contentLength();
        }
        return this.contentLength;
    }

    @Override // okhttp3.RequestBody
    @Nullable
    /* renamed from: contentType */
    public MediaType get$contentType() {
        return this.requestBody.get$contentType();
    }

    @NotNull
    public final String getBodyPreview() {
        return "[Preview unavailable]";
    }

    @Override // okhttp3.RequestBody
    public void writeTo(@NotNull InterfaceC6479i sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        InterfaceC6479i a10 = AbstractC6473c.a().a(outputStreamSink(sink));
        contentLength();
        this.requestBody.writeTo(a10);
        a10.flush();
    }
}
