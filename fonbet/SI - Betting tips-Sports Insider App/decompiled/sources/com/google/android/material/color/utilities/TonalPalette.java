package com.google.android.material.color.utilities;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class TonalPalette {
    Map<Integer, Integer> cache = new HashMap();
    double chroma;
    double hue;
    Hct keyColor;

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static final class KeyColor {
        private static final double MAX_CHROMA_VALUE = 200.0d;
        private final Map<Integer, Double> chromaCache = new HashMap();
        private final double hue;
        private final double requestedChroma;

        public KeyColor(double d10, double d11) {
            this.hue = d10;
            this.requestedChroma = d11;
        }

        private double maxChroma(int i5) {
            if (this.chromaCache.get(Integer.valueOf(i5)) == null) {
                this.chromaCache.put(Integer.valueOf(i5), Double.valueOf(Hct.from(this.hue, MAX_CHROMA_VALUE, i5).getChroma()));
            }
            return this.chromaCache.get(Integer.valueOf(i5)).doubleValue();
        }

        public Hct create() {
            int i5 = 100;
            int i10 = 0;
            while (i10 < i5) {
                int i11 = (i10 + i5) / 2;
                int i12 = i11 + 1;
                boolean z5 = maxChroma(i11) < maxChroma(i12);
                if (maxChroma(i11) >= this.requestedChroma - 0.01d) {
                    if (Math.abs(i10 - 50) < Math.abs(i5 - 50)) {
                        i5 = i11;
                    } else {
                        if (i10 == i11) {
                            return Hct.from(this.hue, this.requestedChroma, i10);
                        }
                        i10 = i11;
                    }
                } else if (z5) {
                    i10 = i12;
                } else {
                    i5 = i11;
                }
            }
            return Hct.from(this.hue, this.requestedChroma, i10);
        }
    }

    private TonalPalette(double d10, double d11, Hct hct) {
        this.hue = d10;
        this.chroma = d11;
        this.keyColor = hct;
    }

    public static TonalPalette fromHct(Hct hct) {
        return new TonalPalette(hct.getHue(), hct.getChroma(), hct);
    }

    public static TonalPalette fromHueAndChroma(double d10, double d11) {
        return new TonalPalette(d10, d11, new KeyColor(d10, d11).create());
    }

    public static TonalPalette fromInt(int i5) {
        return fromHct(Hct.fromInt(i5));
    }

    public double getChroma() {
        return this.chroma;
    }

    public Hct getHct(double d10) {
        return Hct.from(this.hue, this.chroma, d10);
    }

    public double getHue() {
        return this.hue;
    }

    public Hct getKeyColor() {
        return this.keyColor;
    }

    public int tone(int i5) {
        Integer num = this.cache.get(Integer.valueOf(i5));
        if (num == null) {
            num = Integer.valueOf(Hct.from(this.hue, this.chroma, i5).toInt());
            this.cache.put(Integer.valueOf(i5), num);
        }
        return num.intValue();
    }
}
