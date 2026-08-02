package io.agora.rtc2.video;

import io.agora.base.internal.CalledByNative;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public class WatermarkBuffer {
    public static final int WATERMARK_BUFFER_FORMAT_BGRA = 2;
    public static final int WATERMARK_BUFFER_FORMAT_I420 = 1;
    public static final int WATERMARK_BUFFER_FORMAT_NV21 = 3;
    public static final int WATERMARK_BUFFER_FORMAT_RGBA = 4;
    public ByteBuffer buffer;
    public int format;
    public int height;
    public int width;

    @CalledByNative
    public ByteBuffer getBuffer() {
        return this.buffer;
    }

    @CalledByNative
    public int getFormat() {
        return this.format;
    }

    @CalledByNative
    public int getHeight() {
        return this.height;
    }

    @CalledByNative
    public int getWidth() {
        return this.width;
    }
}
