package com.margelo.nitro.nitrofetch;

import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.net.UrlRequest;

/* compiled from: NitroUrlRequest.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/margelo/nitro/nitrofetch/NitroUrlRequest;", "Lcom/margelo/nitro/nitrofetch/HybridUrlRequestSpec;", "cronetRequest", "Lorg/chromium/net/UrlRequest;", "byteBuffer", "Ljava/nio/ByteBuffer;", "<init>", "(Lorg/chromium/net/UrlRequest;Ljava/nio/ByteBuffer;)V", "start", "", "followRedirect", "read", "cancel", "isDone", "", "react-native-nitro-fetch_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NitroUrlRequest extends HybridUrlRequestSpec {
    private final ByteBuffer byteBuffer;
    private final UrlRequest cronetRequest;

    public NitroUrlRequest(UrlRequest cronetRequest, ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(cronetRequest, "cronetRequest");
        Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        this.cronetRequest = cronetRequest;
        this.byteBuffer = byteBuffer;
    }

    @Override // com.margelo.nitro.nitrofetch.HybridUrlRequestSpec
    public void start() {
        this.cronetRequest.start();
    }

    @Override // com.margelo.nitro.nitrofetch.HybridUrlRequestSpec
    public void followRedirect() {
        this.cronetRequest.followRedirect();
    }

    @Override // com.margelo.nitro.nitrofetch.HybridUrlRequestSpec
    public void read() {
        this.byteBuffer.clear();
        this.cronetRequest.read(this.byteBuffer);
    }

    @Override // com.margelo.nitro.nitrofetch.HybridUrlRequestSpec
    public void cancel() {
        this.cronetRequest.cancel();
    }

    @Override // com.margelo.nitro.nitrofetch.HybridUrlRequestSpec
    public boolean isDone() {
        return this.cronetRequest.isDone();
    }
}
