package com.unity3d.services.core.network.core;

import defpackage.p2g;
import defpackage.u2g;
import defpackage.w2g;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import kotlin.Metadata;
import kotlin.Unit;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\b \u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0016\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ \u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0016\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ \u0010\u0015\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0017H&R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/unity3d/services/core/network/core/UnityAdsUrlRequestCallback;", "Lorg/chromium/net/UrlRequest$Callback;", "<init>", "()V", "bytesReceived", "Ljava/io/ByteArrayOutputStream;", "receiveChannel", "Ljava/nio/channels/WritableByteChannel;", "kotlin.jvm.PlatformType", "onRedirectReceived", "", "request", "Lorg/chromium/net/UrlRequest;", "info", "Lorg/chromium/net/UrlResponseInfo;", "newLocationUrl", "", "onResponseStarted", "onReadCompleted", "byteBuffer", "Ljava/nio/ByteBuffer;", "onSucceeded", "bodyBytes", "", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class UnityAdsUrlRequestCallback extends UrlRequest.Callback {
    private static final int BYTE_BUFFER_CAPACITY_BYTES = 16384;

    @NotNull
    private final ByteArrayOutputStream bytesReceived;
    private final WritableByteChannel receiveChannel;

    public UnityAdsUrlRequestCallback() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.bytesReceived = byteArrayOutputStream;
        this.receiveChannel = Channels.newChannel(byteArrayOutputStream);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onReadCompleted(@NotNull UrlRequest request, @NotNull UrlResponseInfo info, @NotNull ByteBuffer byteBuffer) {
        Object u2gVar;
        request.getClass();
        info.getClass();
        byteBuffer.getClass();
        byteBuffer.flip();
        try {
            p2g p2gVar = w2g.b;
            this.receiveChannel.write(byteBuffer);
            byteBuffer.clear();
            request.read(byteBuffer);
            u2gVar = Unit.a;
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        if (w2g.a(u2gVar) != null) {
            request.cancel();
            onFailed(request, info, null);
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onRedirectReceived(@NotNull UrlRequest request, @Nullable UrlResponseInfo info, @Nullable String newLocationUrl) {
        request.getClass();
        request.followRedirect();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(@NotNull UrlRequest request, @NotNull UrlResponseInfo info) {
        request.getClass();
        info.getClass();
        request.read(ByteBuffer.allocateDirect(BYTE_BUFFER_CAPACITY_BYTES));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(@NotNull UrlRequest request, @NotNull UrlResponseInfo info) {
        Object u2gVar;
        request.getClass();
        info.getClass();
        try {
            p2g p2gVar = w2g.b;
            u2gVar = this.bytesReceived.toByteArray();
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        if (!(u2gVar instanceof u2g)) {
            byte[] bArr = (byte[]) u2gVar;
            bArr.getClass();
            onSucceeded(request, info, bArr);
        }
        if (w2g.a(u2gVar) != null) {
            onFailed(request, info, null);
        }
    }

    public abstract void onSucceeded(@NotNull UrlRequest request, @NotNull UrlResponseInfo info, @NotNull byte[] bodyBytes);
}
