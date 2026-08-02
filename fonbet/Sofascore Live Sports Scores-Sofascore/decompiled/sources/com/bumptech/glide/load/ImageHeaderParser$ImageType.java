package com.bumptech.glide.load;

import defpackage.cs9;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public enum ImageHeaderParser$ImageType {
    GIF(true),
    JPEG(false),
    RAW(false),
    PNG_A(true),
    PNG(false),
    WEBP_A(true),
    WEBP(false),
    ANIMATED_WEBP(true),
    AVIF(true),
    ANIMATED_AVIF(true),
    UNKNOWN(false);

    public final boolean a;

    ImageHeaderParser$ImageType(boolean z) {
        this.a = z;
    }

    public boolean hasAlpha() {
        return this.a;
    }

    public boolean isWebp() {
        int i = cs9.a[ordinal()];
        return i == 1 || i == 2 || i == 3;
    }
}
