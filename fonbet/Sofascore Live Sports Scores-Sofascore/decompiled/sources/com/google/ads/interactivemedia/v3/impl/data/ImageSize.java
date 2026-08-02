package com.google.ads.interactivemedia.v3.impl.data;

import androidx.annotation.NonNull;
import defpackage.b2p;
import defpackage.u1p;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class ImageSize {
    @NonNull
    public static ImageSize create(int i, int i2) {
        return new AutoValue_ImageSize(i, i2);
    }

    public static b2p createFromVastSizeString(String str) {
        if (str == null) {
            return u1p.a;
        }
        String[] split = str.split("x", -1);
        if (split.length != 2) {
            return b2p.k(create(0, 0));
        }
        try {
            return b2p.k(create(Integer.parseInt(split[0]), Integer.parseInt(split[1])));
        } catch (NumberFormatException unused) {
            return b2p.k(create(0, 0));
        }
    }

    public abstract int height();

    public abstract int width();
}
