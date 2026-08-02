package io.agora.rtc2.video;

import io.agora.base.internal.CalledByNative;

/* loaded from: classes3.dex */
public class WatermarkConfig {
    public static final int WATERMARK_TYPE_BUFFER = 1;
    public static final int WATERMARK_TYPE_IMAGE = 0;

    /* renamed from: id, reason: collision with root package name */
    public String f49183id;
    public String imageUrl;
    public int type;
    public WatermarkBuffer buffer = new WatermarkBuffer();
    public WatermarkOptions options = new WatermarkOptions();

    @CalledByNative
    public WatermarkBuffer getBuffer() {
        return this.buffer;
    }

    @CalledByNative
    public String getId() {
        return this.f49183id;
    }

    @CalledByNative
    public String getImageUrl() {
        return this.imageUrl;
    }

    @CalledByNative
    public WatermarkOptions getOptions() {
        return this.options;
    }

    @CalledByNative
    public int getType() {
        return this.type;
    }
}
