package io.agora.base.internal.video;

import io.agora.base.ColorSpace;
import io.agora.base.internal.CalledByNative;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class EncodedImage {
    public final ByteBuffer buffer;
    public final long captureTimeMs;
    public final long captureTimeNs;
    public final ColorSpace colorSpace;
    public final boolean completeFrame;
    public final int encodedHeight;
    public final int encodedWidth;
    public final FrameCropWindow frameCropWindow;
    public final FrameType frameType;
    public final Integer qp;
    public final int rotation;
    public final boolean shouldSkipColorSpaceOverride;

    public static class Builder {
        private ByteBuffer buffer;
        private long captureTimeNs;
        private boolean completeFrame;
        private int encodedHeight;
        private int encodedWidth;
        private FrameCropWindow frameCropWindow;
        private FrameType frameType;
        private Integer qp;
        private int rotation;
        private boolean shouldSkipColorSpaceOverride;

        public EncodedImage createEncodedImage() {
            return new EncodedImage(this.buffer, this.encodedWidth, this.encodedHeight, this.captureTimeNs, this.frameType, this.rotation, this.completeFrame, this.qp, null, this.shouldSkipColorSpaceOverride, this.frameCropWindow);
        }

        public Builder setBuffer(ByteBuffer byteBuffer) {
            this.buffer = byteBuffer;
            return this;
        }

        @Deprecated
        public Builder setCaptureTimeMs(long j10) {
            this.captureTimeNs = TimeUnit.MILLISECONDS.toNanos(j10);
            return this;
        }

        public Builder setCaptureTimeNs(long j10) {
            this.captureTimeNs = j10;
            return this;
        }

        public Builder setCompleteFrame(boolean z10) {
            this.completeFrame = z10;
            return this;
        }

        public Builder setEncodedHeight(int i10) {
            this.encodedHeight = i10;
            return this;
        }

        public Builder setEncodedWidth(int i10) {
            this.encodedWidth = i10;
            return this;
        }

        public void setFrameCropWindow(FrameCropWindow frameCropWindow) {
            this.frameCropWindow = frameCropWindow;
        }

        public Builder setFrameType(FrameType frameType) {
            this.frameType = frameType;
            return this;
        }

        public Builder setQp(Integer num) {
            this.qp = num;
            return this;
        }

        public Builder setRotation(int i10) {
            this.rotation = i10;
            return this;
        }

        public Builder setShouldSkipColorSpaceOverride(boolean z10) {
            this.shouldSkipColorSpaceOverride = z10;
            return this;
        }

        private Builder() {
        }
    }

    public enum FrameType {
        EmptyFrame(0),
        VideoFrameKey(3),
        VideoFrameDelta(4);

        private final int nativeIndex;

        FrameType(int i10) {
            this.nativeIndex = i10;
        }

        @CalledByNative("FrameType")
        public static FrameType fromNativeIndex(int i10) {
            for (FrameType frameType : values()) {
                if (frameType.getNative() == i10) {
                    return frameType;
                }
            }
            throw new IllegalArgumentException("Unknown native frame type: " + i10);
        }

        public int getNative() {
            return this.nativeIndex;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    @CalledByNative
    private EncodedImage(ByteBuffer byteBuffer, int i10, int i11, long j10, FrameType frameType, int i12, boolean z10, Integer num, ColorSpace colorSpace, boolean z11, FrameCropWindow frameCropWindow) {
        this.buffer = byteBuffer;
        this.encodedWidth = i10;
        this.encodedHeight = i11;
        this.captureTimeMs = TimeUnit.NANOSECONDS.toMillis(j10);
        this.captureTimeNs = j10;
        this.frameType = frameType;
        this.rotation = i12;
        this.completeFrame = z10;
        this.qp = num;
        this.colorSpace = colorSpace;
        this.shouldSkipColorSpaceOverride = z11;
        this.frameCropWindow = frameCropWindow;
    }
}
