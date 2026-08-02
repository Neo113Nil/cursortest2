package com.google.ads.interactivemedia.v3.impl.data;

import defpackage.me4;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
final class AutoValue_ImageSize extends ImageSize {
    private final int height;
    private final int width;

    public AutoValue_ImageSize(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImageSize) {
            ImageSize imageSize = (ImageSize) obj;
            if (this.width == imageSize.width() && this.height == imageSize.height()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.height ^ ((this.width ^ 1000003) * 1000003);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ImageSize
    public int height() {
        return this.height;
    }

    public String toString() {
        int i = this.width;
        int length = String.valueOf(i).length();
        int i2 = this.height;
        StringBuilder sb = new StringBuilder(length + 25 + String.valueOf(i2).length() + 1);
        me4.r(sb, "ImageSize{width=", i, ", height=", i2);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ImageSize
    public int width() {
        return this.width;
    }
}
