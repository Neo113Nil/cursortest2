package com.facebook.react.modules.network;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ti.AbstractC6473c;
import ti.C6478h;
import ti.G;
import ti.InterfaceC6480j;
import ti.n;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\b\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\b\u0010\u0012R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/facebook/react/modules/network/ProgressResponseBody;", "Lokhttp3/ResponseBody;", "responseBody", "Lcom/facebook/react/modules/network/ProgressListener;", "progressListener", "<init>", "(Lokhttp3/ResponseBody;Lcom/facebook/react/modules/network/ProgressListener;)V", "Lti/G;", "source", "(Lti/G;)Lti/G;", "Lokhttp3/MediaType;", "contentType", "()Lokhttp3/MediaType;", "", "contentLength", "()J", "totalBytesRead", "Lti/j;", "()Lti/j;", "Lokhttp3/ResponseBody;", "Lcom/facebook/react/modules/network/ProgressListener;", "bufferedSource", "Lti/j;", "J", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProgressResponseBody extends ResponseBody {
    private InterfaceC6480j bufferedSource;

    @NotNull
    private final ProgressListener progressListener;

    @NotNull
    private final ResponseBody responseBody;
    private long totalBytesRead;

    public ProgressResponseBody(@NotNull ResponseBody responseBody, @NotNull ProgressListener progressListener) {
        Intrinsics.checkNotNullParameter(responseBody, "responseBody");
        Intrinsics.checkNotNullParameter(progressListener, "progressListener");
        this.responseBody = responseBody;
        this.progressListener = progressListener;
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: contentLength */
    public long getContentLength() {
        return this.responseBody.getContentLength();
    }

    @Override // okhttp3.ResponseBody
    @Nullable
    /* renamed from: contentType */
    public MediaType get$contentType() {
        return this.responseBody.get$contentType();
    }

    @Override // okhttp3.ResponseBody
    @NotNull
    /* renamed from: source */
    public InterfaceC6480j getSource() {
        if (this.bufferedSource == null) {
            this.bufferedSource = AbstractC6473c.a().b(source(this.responseBody.getSource()));
        }
        InterfaceC6480j interfaceC6480j = this.bufferedSource;
        if (interfaceC6480j != null) {
            return interfaceC6480j;
        }
        Intrinsics.throwUninitializedPropertyAccessException("bufferedSource");
        return null;
    }

    /* renamed from: totalBytesRead, reason: from getter */
    public final long getTotalBytesRead() {
        return this.totalBytesRead;
    }

    private final G source(final G source) {
        return new n(source) { // from class: com.facebook.react.modules.network.ProgressResponseBody$source$1
            @Override // ti.n, ti.G
            public long read(C6478h sink, long byteCount) {
                ProgressListener progressListener;
                long j10;
                ResponseBody responseBody;
                long j11;
                Intrinsics.checkNotNullParameter(sink, "sink");
                long read = super.read(sink, byteCount);
                ProgressResponseBody progressResponseBody = this;
                if (read != -1) {
                    j11 = progressResponseBody.totalBytesRead;
                    progressResponseBody.totalBytesRead = j11 + read;
                }
                progressListener = progressResponseBody.progressListener;
                j10 = progressResponseBody.totalBytesRead;
                responseBody = progressResponseBody.responseBody;
                progressListener.onProgress(j10, responseBody.getContentLength(), read == -1);
                return read;
            }
        };
    }
}
