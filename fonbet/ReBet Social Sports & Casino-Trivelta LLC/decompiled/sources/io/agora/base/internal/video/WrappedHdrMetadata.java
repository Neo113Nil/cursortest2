package io.agora.base.internal.video;

import io.agora.base.HdrMetadata;
import io.agora.base.internal.CalledByNative;

/* loaded from: classes2.dex */
public class WrappedHdrMetadata implements HdrMetadata {
    private int luminanceMax;
    private int luminanceMin;
    private int maxContentLightLevel;
    private int maxFrameAverageLightLevel;
    private HdrMetadata.Chromaticity primaryB;
    private HdrMetadata.Chromaticity primaryG;
    private HdrMetadata.Chromaticity primaryR;
    private HdrMetadata.Chromaticity whitePoint;

    private WrappedHdrMetadata() {
    }

    @Override // io.agora.base.HdrMetadata
    public int getLuminanceMax() {
        return this.luminanceMax;
    }

    @Override // io.agora.base.HdrMetadata
    public int getLuminanceMin() {
        return this.luminanceMin;
    }

    @Override // io.agora.base.HdrMetadata
    public int getMaxContentLightLevel() {
        return this.maxContentLightLevel;
    }

    @Override // io.agora.base.HdrMetadata
    public int getMaxFrameAverageLightLevel() {
        return this.maxFrameAverageLightLevel;
    }

    @Override // io.agora.base.HdrMetadata
    public HdrMetadata.Chromaticity getWhitePoint() {
        return this.whitePoint;
    }

    @Override // io.agora.base.HdrMetadata
    public HdrMetadata.Chromaticity getprimaryB() {
        return this.primaryB;
    }

    @Override // io.agora.base.HdrMetadata
    public HdrMetadata.Chromaticity getprimaryG() {
        return this.primaryG;
    }

    @Override // io.agora.base.HdrMetadata
    public HdrMetadata.Chromaticity getprimaryR() {
        return this.primaryR;
    }

    @CalledByNative
    public WrappedHdrMetadata(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21) {
        this.maxContentLightLevel = i10;
        this.maxFrameAverageLightLevel = i11;
        this.primaryR = new HdrMetadata.Chromaticity(i12, i13);
        this.primaryG = new HdrMetadata.Chromaticity(i14, i15);
        this.primaryB = new HdrMetadata.Chromaticity(i16, i17);
        this.whitePoint = new HdrMetadata.Chromaticity(i18, i19);
        this.luminanceMax = i20;
        this.luminanceMin = i21;
    }
}
