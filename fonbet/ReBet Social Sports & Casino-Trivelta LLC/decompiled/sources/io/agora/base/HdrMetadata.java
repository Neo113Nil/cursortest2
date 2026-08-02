package io.agora.base;

/* loaded from: classes2.dex */
public interface HdrMetadata {

    public static class Chromaticity {

        /* renamed from: x, reason: collision with root package name */
        public int f49153x;

        /* renamed from: y, reason: collision with root package name */
        public int f49154y;

        public Chromaticity(int i10, int i11) {
            this.f49153x = i10;
            this.f49154y = i11;
        }
    }

    int getLuminanceMax();

    int getLuminanceMin();

    int getMaxContentLightLevel();

    int getMaxFrameAverageLightLevel();

    Chromaticity getWhitePoint();

    Chromaticity getprimaryB();

    Chromaticity getprimaryG();

    Chromaticity getprimaryR();
}
