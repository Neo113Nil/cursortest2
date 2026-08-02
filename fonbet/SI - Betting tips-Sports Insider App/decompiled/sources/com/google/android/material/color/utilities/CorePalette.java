package com.google.android.material.color.utilities;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class CorePalette {

    /* renamed from: a1, reason: collision with root package name */
    public TonalPalette f5873a1;

    /* renamed from: a2, reason: collision with root package name */
    public TonalPalette f5874a2;

    /* renamed from: a3, reason: collision with root package name */
    public TonalPalette f5875a3;
    public TonalPalette error;

    /* renamed from: n1, reason: collision with root package name */
    public TonalPalette f5876n1;

    /* renamed from: n2, reason: collision with root package name */
    public TonalPalette f5877n2;

    private CorePalette(int i5, boolean z5) {
        Hct fromInt = Hct.fromInt(i5);
        double hue = fromInt.getHue();
        double chroma = fromInt.getChroma();
        if (z5) {
            this.f5873a1 = TonalPalette.fromHueAndChroma(hue, chroma);
            this.f5874a2 = TonalPalette.fromHueAndChroma(hue, chroma / 3.0d);
            this.f5875a3 = TonalPalette.fromHueAndChroma(60.0d + hue, chroma / 2.0d);
            this.f5876n1 = TonalPalette.fromHueAndChroma(hue, Math.min(chroma / 12.0d, 4.0d));
            this.f5877n2 = TonalPalette.fromHueAndChroma(hue, Math.min(chroma / 6.0d, 8.0d));
        } else {
            this.f5873a1 = TonalPalette.fromHueAndChroma(hue, Math.max(48.0d, chroma));
            this.f5874a2 = TonalPalette.fromHueAndChroma(hue, 16.0d);
            this.f5875a3 = TonalPalette.fromHueAndChroma(60.0d + hue, 24.0d);
            this.f5876n1 = TonalPalette.fromHueAndChroma(hue, 4.0d);
            this.f5877n2 = TonalPalette.fromHueAndChroma(hue, 8.0d);
        }
        this.error = TonalPalette.fromHueAndChroma(25.0d, 84.0d);
    }

    public static CorePalette contentOf(int i5) {
        return new CorePalette(i5, true);
    }

    public static CorePalette of(int i5) {
        return new CorePalette(i5, false);
    }
}
