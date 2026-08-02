package io.agora.base;

import android.graphics.Matrix;
import io.agora.base.ColorSpace;
import io.agora.base.internal.CalledByNative;
import io.agora.base.internal.JniCommon;
import io.agora.base.internal.RefCounted;
import io.agora.base.internal.video.EglBase;
import io.agora.base.internal.video.WrappedNativeColorSpace;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class VideoFrame implements RefCounted {
    private ByteBuffer alphaBuffer;
    private AlphaStitchMode alphaStitchMode;
    private Buffer buffer;
    private ColorSpace colorSpace;
    private VideoFrameMetaInfo metaInfo;
    private long nativeAlphaBuffer;
    private long renderStartTimeMs;
    private int rotation;
    private float sampleAspectRatio;
    private SourceType sourceType;
    private long timestampNs;

    public interface Buffer extends RefCounted {
        @CalledByNative("Buffer")
        Buffer cropAndScale(int i10, int i11, int i12, int i13, int i14, int i15);

        @CalledByNative("Buffer")
        int getHeight();

        @CalledByNative("Buffer")
        int getWidth();

        @CalledByNative("Buffer")
        Buffer mirror(int i10);

        @Override // io.agora.base.internal.RefCounted
        @CalledByNative("Buffer")
        void release();

        @Override // io.agora.base.internal.RefCounted
        @CalledByNative("Buffer")
        void retain();

        @CalledByNative("Buffer")
        Buffer rotate(int i10);

        @CalledByNative("Buffer")
        I010Buffer toI010();

        @CalledByNative("Buffer")
        I420Buffer toI420();

        @CalledByNative("Buffer")
        Buffer transform(int i10, int i11, int i12, int i13, int i14, int i15, int i16);
    }

    public interface I010Buffer extends Buffer {
        @CalledByNative("I010Buffer")
        ByteBuffer getDataU();

        @CalledByNative("I010Buffer")
        ByteBuffer getDataV();

        @CalledByNative("I010Buffer")
        ByteBuffer getDataY();

        @CalledByNative("I010Buffer")
        int getStrideU();

        @CalledByNative("I010Buffer")
        int getStrideV();

        @CalledByNative("I010Buffer")
        int getStrideY();
    }

    public interface I420Buffer extends Buffer {
        @CalledByNative("I420Buffer")
        ByteBuffer getDataU();

        @CalledByNative("I420Buffer")
        ByteBuffer getDataV();

        @CalledByNative("I420Buffer")
        ByteBuffer getDataY();

        @CalledByNative("I420Buffer")
        int getStrideU();

        @CalledByNative("I420Buffer")
        int getStrideV();

        @CalledByNative("I420Buffer")
        int getStrideY();
    }

    public interface I422Buffer extends Buffer {
        @CalledByNative("I422Buffer")
        ByteBuffer getDataU();

        @CalledByNative("I422Buffer")
        ByteBuffer getDataV();

        @CalledByNative("I422Buffer")
        ByteBuffer getDataY();

        @CalledByNative("I422Buffer")
        int getStrideU();

        @CalledByNative("I422Buffer")
        int getStrideV();

        @CalledByNative("I422Buffer")
        int getStrideY();
    }

    public interface P010Buffer extends Buffer {
        @CalledByNative("P010Buffer")
        ByteBuffer getDataUV();

        @CalledByNative("P010Buffer")
        ByteBuffer getDataY();

        @CalledByNative("P010Buffer")
        int getStrideUV();

        @CalledByNative("P010Buffer")
        int getStrideY();
    }

    public interface RgbaBuffer extends Buffer {
        @CalledByNative("RgbaBuffer")
        ByteBuffer getData();
    }

    public enum SourceType {
        kFrontCamera,
        kBackCamera,
        kUnspecified
    }

    public interface TextureBuffer extends Buffer {

        public enum ContextType {
            EGL_CONTEXT_10,
            EGL_CONTEXT_14
        }

        public enum Type {
            OES(36197),
            RGB(3553);

            private final int glTarget;

            Type(int i10) {
                this.glTarget = i10;
            }

            public int getGlTarget() {
                return this.glTarget;
            }
        }

        @CalledByNative("TextureBuffer")
        EglBase.Context getEglBaseContext();

        @CalledByNative("TextureBuffer")
        int getEglContextType();

        @CalledByNative("TextureBuffer")
        long getFenceObject();

        @CalledByNative("TextureBuffer")
        long getNativeEglContext();

        @CalledByNative("TextureBuffer")
        int getSequence();

        @CalledByNative("TextureBuffer")
        Object getSourceTexturePool();

        @CalledByNative("TextureBuffer")
        int getTextureId();

        Matrix getTransformMatrix();

        @CalledByNative("TextureBuffer")
        float[] getTransformMatrixArray();

        Type getType();

        @CalledByNative("TextureBuffer")
        boolean is10BitTexture();
    }

    public VideoFrame(Buffer buffer, int i10, long j10) {
        this(buffer, i10, j10, new WrappedNativeColorSpace(), null, 0L, 1.0f, SourceType.kUnspecified.ordinal(), System.currentTimeMillis());
    }

    @CalledByNative
    private int getColorSpaceMatrix() {
        ColorSpace colorSpace = this.colorSpace;
        return colorSpace == null ? ColorSpace.Matrix.Unspecified.getMatrix() : colorSpace.getMatrix().getMatrix();
    }

    @CalledByNative
    private int getColorSpacePrimary() {
        ColorSpace colorSpace = this.colorSpace;
        return colorSpace == null ? ColorSpace.Primary.Unspecified.getPrimary() : colorSpace.getPrimary().getPrimary();
    }

    @CalledByNative
    private int getColorSpaceRange() {
        ColorSpace colorSpace = this.colorSpace;
        return colorSpace == null ? ColorSpace.Range.Invalid.getRange() : colorSpace.getRange().getRange();
    }

    @CalledByNative
    private int getColorSpaceTransfer() {
        ColorSpace colorSpace = this.colorSpace;
        return colorSpace == null ? ColorSpace.Transfer.Unspecified.getTransfer() : colorSpace.getTransfer().getTransfer();
    }

    public void fillAlphaData(ByteBuffer byteBuffer) {
        this.alphaBuffer = byteBuffer;
    }

    @CalledByNative
    public ByteBuffer getAlphaBuffer() {
        return this.alphaBuffer;
    }

    @CalledByNative
    public int getAlphaStitchMode() {
        return this.alphaStitchMode.value();
    }

    @CalledByNative
    public Buffer getBuffer() {
        return this.buffer;
    }

    @CalledByNative
    public ColorSpace getColorSpace() {
        return this.colorSpace;
    }

    @CalledByNative
    public VideoFrameMetaInfo getMetaInfo() {
        return this.metaInfo;
    }

    public long getRenderStartTimeMs() {
        return this.renderStartTimeMs;
    }

    public int getRotatedHeight() {
        if (this.rotation % 180 == 0) {
            AlphaStitchMode alphaStitchMode = this.alphaStitchMode;
            return (alphaStitchMode == AlphaStitchMode.ALPHA_STITCH_UP || alphaStitchMode == AlphaStitchMode.ALPHA_STITCH_BELOW) ? this.buffer.getHeight() / 2 : this.buffer.getHeight();
        }
        AlphaStitchMode alphaStitchMode2 = this.alphaStitchMode;
        return (alphaStitchMode2 == AlphaStitchMode.ALPHA_STITCH_LEFT || alphaStitchMode2 == AlphaStitchMode.ALPHA_STITCH_RIGHT) ? this.buffer.getWidth() / 2 : this.buffer.getWidth();
    }

    public int getRotatedWidth() {
        if (this.rotation % 180 == 0) {
            AlphaStitchMode alphaStitchMode = this.alphaStitchMode;
            return (alphaStitchMode == AlphaStitchMode.ALPHA_STITCH_LEFT || alphaStitchMode == AlphaStitchMode.ALPHA_STITCH_RIGHT) ? this.buffer.getWidth() / 2 : this.buffer.getWidth();
        }
        AlphaStitchMode alphaStitchMode2 = this.alphaStitchMode;
        return (alphaStitchMode2 == AlphaStitchMode.ALPHA_STITCH_UP || alphaStitchMode2 == AlphaStitchMode.ALPHA_STITCH_BELOW) ? this.buffer.getHeight() / 2 : this.buffer.getHeight();
    }

    @CalledByNative
    public int getRotation() {
        return this.rotation;
    }

    public float getSampleAspectRatio() {
        return this.sampleAspectRatio;
    }

    @CalledByNative
    public SourceType getSourceType() {
        return this.sourceType;
    }

    @CalledByNative
    public long getTimestampNs() {
        return this.timestampNs;
    }

    @Override // io.agora.base.internal.RefCounted
    @CalledByNative
    public void release() {
        this.buffer.release();
    }

    public void releaseAlphaBuffer() {
        JniCommon.nativeReleaseRef(this.nativeAlphaBuffer);
    }

    public void replaceBuffer(Buffer buffer, int i10, long j10) {
        release();
        this.buffer = buffer;
        this.rotation = i10;
        this.timestampNs = j10;
    }

    @Override // io.agora.base.internal.RefCounted
    public void retain() {
        this.buffer.retain();
    }

    public void retainAlphaBuffer() {
        JniCommon.nativeAddRef(this.nativeAlphaBuffer);
    }

    @CalledByNative
    public void setAlphaStitchMode(int i10) {
        this.alphaStitchMode = AlphaStitchMode.values()[i10];
    }

    public void setColorSpace(ColorSpace colorSpace) {
        this.colorSpace = colorSpace;
    }

    @CalledByNative
    public VideoFrame(Buffer buffer, int i10, long j10, ColorSpace colorSpace, ByteBuffer byteBuffer, long j11, float f10, int i11, long j12) {
        this.alphaStitchMode = AlphaStitchMode.ALPHA_NO_STITCH;
        this.metaInfo = new VideoFrameMetaInfo();
        if (buffer != null) {
            if (i10 % 90 == 0) {
                this.buffer = buffer;
                this.rotation = i10;
                this.timestampNs = j10;
                this.colorSpace = colorSpace;
                this.alphaBuffer = byteBuffer;
                this.nativeAlphaBuffer = j11;
                this.sampleAspectRatio = f10;
                this.sourceType = SourceType.values()[i11];
                this.renderStartTimeMs = j12;
                return;
            }
            throw new IllegalArgumentException("rotation must be a multiple of 90");
        }
        throw new IllegalArgumentException("buffer not allowed to be null");
    }
}
