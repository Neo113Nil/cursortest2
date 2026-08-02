package com.bytedance.adsdk.sf.wh;

import defpackage.me4;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf {
    public static int pcc(float f, int i, int i2) {
        if (i == i2) {
            return i;
        }
        float f2 = ((i >> 24) & 255) / 255.0f;
        float f3 = ((i2 >> 24) & 255) / 255.0f;
        float sf = sf(((i >> 16) & 255) / 255.0f);
        float sf2 = sf(((i >> 8) & 255) / 255.0f);
        float sf3 = sf((i & 255) / 255.0f);
        float sf4 = sf(((i2 >> 16) & 255) / 255.0f);
        float sf5 = sf(((i2 >> 8) & 255) / 255.0f);
        float sf6 = sf((i2 & 255) / 255.0f);
        float b = me4.b(f3, f2, f, f2);
        float b2 = me4.b(sf4, sf, f, sf);
        float b3 = me4.b(sf5, sf2, f, sf2);
        float b4 = me4.b(sf6, sf3, f, sf3);
        float pcc = pcc(b2) * 255.0f;
        float pcc2 = pcc(b3) * 255.0f;
        return Math.round(pcc(b4) * 255.0f) | (Math.round(pcc) << 16) | (Math.round(b * 255.0f) << 24) | (Math.round(pcc2) << 8);
    }

    private static float sf(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    private static float pcc(float f) {
        return f <= 0.0031308f ? f * 12.92f : (float) ((Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }
}
