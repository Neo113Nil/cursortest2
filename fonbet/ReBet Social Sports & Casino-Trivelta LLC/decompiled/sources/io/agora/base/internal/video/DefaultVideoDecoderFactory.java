package io.agora.base.internal.video;

import io.agora.base.internal.Logging;
import io.agora.base.internal.video.EglBase;
import java.util.Arrays;
import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public class DefaultVideoDecoderFactory implements VideoDecoderFactory {
    private static final String TAG = "DefaultVideoDecoderFactory";
    private final VideoDecoderFactory hardwareVideoDecoderFactory;
    private final VideoDecoderFactory softwareVideoDecoderFactory = new SoftwareVideoDecoderFactory();

    public DefaultVideoDecoderFactory(EglBase.Context context) {
        this.hardwareVideoDecoderFactory = new HardwareVideoDecoderFactory(context);
    }

    @Override // io.agora.base.internal.video.VideoDecoderFactory
    public VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo) {
        VideoDecoder createDecoder = this.softwareVideoDecoderFactory.createDecoder(videoCodecInfo);
        VideoDecoder createDecoder2 = this.hardwareVideoDecoderFactory.createDecoder(videoCodecInfo);
        if (createDecoder2 != null && createDecoder != null) {
            return new VideoDecoderFallback(createDecoder, createDecoder2);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("using decoder:");
        sb2.append(createDecoder2 != null ? "hardware" : "software");
        Logging.d(TAG, sb2.toString());
        return createDecoder2 != null ? createDecoder2 : createDecoder;
    }

    @Override // io.agora.base.internal.video.VideoDecoderFactory
    public VideoCodecInfo[] getSupportedCodecs() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(Arrays.asList(this.softwareVideoDecoderFactory.getSupportedCodecs()));
        linkedHashSet.addAll(Arrays.asList(this.hardwareVideoDecoderFactory.getSupportedCodecs()));
        return (VideoCodecInfo[]) linkedHashSet.toArray(new VideoCodecInfo[linkedHashSet.size()]);
    }

    public DefaultVideoDecoderFactory(VideoDecoderFactory videoDecoderFactory) {
        this.hardwareVideoDecoderFactory = videoDecoderFactory;
    }

    @Override // io.agora.base.internal.video.VideoDecoderFactory
    public VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo, boolean z10) {
        if (!z10) {
            return this.softwareVideoDecoderFactory.createDecoder(videoCodecInfo);
        }
        return createDecoder(videoCodecInfo);
    }

    @Override // io.agora.base.internal.video.VideoDecoderFactory
    public VideoDecoder createDecoder(String str) {
        throw new UnsupportedOperationException("Deprecated and not implemented.");
    }
}
