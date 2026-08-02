package io.agora.base.internal.video;

import androidx.annotation.NonNull;
import io.agora.base.VideoFrame;
import io.agora.base.internal.CalledByNative;
import io.agora.base.internal.JniCommon;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
class WrappedNativeRgbaBuffer implements VideoFrame.RgbaBuffer {
    private final ByteBuffer data;
    private final int height;
    private long nativeBuffer;
    private final int width;

    @CalledByNative
    public WrappedNativeRgbaBuffer(int i10, int i11, @NonNull ByteBuffer byteBuffer, long j10) {
        this.nativeBuffer = j10;
        this.width = i10;
        this.height = i11;
        this.data = byteBuffer;
        retain();
    }

    @Override // io.agora.base.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i10, int i11, int i12, int i13, int i14, int i15) {
        return null;
    }

    @Override // io.agora.base.VideoFrame.RgbaBuffer
    public ByteBuffer getData() {
        return this.data.slice();
    }

    @Override // io.agora.base.VideoFrame.Buffer
    public int getHeight() {
        return this.height;
    }

    @Override // io.agora.base.VideoFrame.Buffer
    public int getWidth() {
        return this.width;
    }

    @Override // io.agora.base.VideoFrame.Buffer
    public VideoFrame.Buffer mirror(int i10) {
        return null;
    }

    @Override // io.agora.base.VideoFrame.Buffer, io.agora.base.internal.RefCounted
    public void release() {
        JniCommon.nativeReleaseRef(this.nativeBuffer);
    }

    @Override // io.agora.base.VideoFrame.Buffer, io.agora.base.internal.RefCounted
    public void retain() {
        JniCommon.nativeAddRef(this.nativeBuffer);
    }

    @Override // io.agora.base.VideoFrame.Buffer
    public VideoFrame.Buffer rotate(int i10) {
        return null;
    }

    @Override // io.agora.base.VideoFrame.Buffer
    public VideoFrame.I010Buffer toI010() {
        return null;
    }

    @Override // io.agora.base.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        return null;
    }

    @Override // io.agora.base.VideoFrame.Buffer
    public VideoFrame.Buffer transform(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        return null;
    }
}
