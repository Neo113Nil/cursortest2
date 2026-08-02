package io.agora.base.internal.video;

import io.agora.base.internal.video.EglBase;
import java.util.Arrays;
import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public class DefaultVideoEncoderFactory implements VideoEncoderFactory {
    private final VideoEncoderFactory hardwareVideoEncoderFactory;
    private final VideoEncoderFactory softwareVideoEncoderFactory = new SoftwareVideoEncoderFactory();

    public DefaultVideoEncoderFactory(EglBase.Context context, boolean z10, boolean z11) {
        this.hardwareVideoEncoderFactory = new HardwareVideoEncoderFactory(context, z10, z11);
    }

    @Override // io.agora.base.internal.video.VideoEncoderFactory
    public VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo, boolean z10) {
        VideoEncoder createEncoder = this.softwareVideoEncoderFactory.createEncoder(videoCodecInfo, z10);
        VideoEncoder createEncoder2 = this.hardwareVideoEncoderFactory.createEncoder(videoCodecInfo, z10);
        return (createEncoder2 == null || createEncoder == null) ? createEncoder2 != null ? createEncoder2 : createEncoder : new VideoEncoderFallback(createEncoder, createEncoder2);
    }

    @Override // io.agora.base.internal.video.VideoEncoderFactory
    public VideoCodecInfo[] getSupportedCodecs(boolean z10) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(Arrays.asList(this.softwareVideoEncoderFactory.getSupportedCodecs(z10)));
        linkedHashSet.addAll(Arrays.asList(this.hardwareVideoEncoderFactory.getSupportedCodecs(z10)));
        return (VideoCodecInfo[]) linkedHashSet.toArray(new VideoCodecInfo[linkedHashSet.size()]);
    }

    public DefaultVideoEncoderFactory(VideoEncoderFactory videoEncoderFactory) {
        this.hardwareVideoEncoderFactory = videoEncoderFactory;
    }

    @Override // io.agora.base.internal.video.VideoEncoderFactory
    public VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo, boolean z10, boolean z11) {
        if (!z11) {
            return this.softwareVideoEncoderFactory.createEncoder(videoCodecInfo, z10);
        }
        return createEncoder(videoCodecInfo, z10);
    }
}
