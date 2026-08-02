package com.google.ads.interactivemedia.v3.impl.data;

import androidx.annotation.NonNull;
import com.ironsource.U3;
import defpackage.bf3;
import defpackage.me4;
import defpackage.q1p;
import defpackage.wt3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@q1p(zza = AutoValue_IconClickFallbackImageMsgData.class)
/* loaded from: classes2.dex */
public abstract class IconClickFallbackImageMsgData {
    @NonNull
    public static IconClickFallbackImageMsgData create(int i, int i2, @NonNull String str, @NonNull String str2, @NonNull String str3) {
        return new AutoValue_IconClickFallbackImageMsgData(i, i2, str, str2, str3);
    }

    @NonNull
    public abstract String alternateText();

    @NonNull
    public abstract String creativeType();

    @NonNull
    public String getAlternateText() {
        return alternateText();
    }

    @NonNull
    public String getCreativeType() {
        return creativeType();
    }

    public int getHeight() {
        return height();
    }

    @NonNull
    public String getResourceUri() {
        return imageUrl();
    }

    public int getWidth() {
        return width();
    }

    public abstract int height();

    @NonNull
    public abstract String imageUrl();

    @NonNull
    public final String toString() {
        int width = width();
        int height = height();
        String imageUrl = imageUrl();
        String alternateText = alternateText();
        String creativeType = creativeType();
        int length = String.valueOf(width).length();
        int length2 = String.valueOf(height).length();
        int length3 = String.valueOf(imageUrl).length();
        StringBuilder sb = new StringBuilder(length + 46 + length2 + 11 + length3 + 16 + String.valueOf(alternateText).length() + 15 + String.valueOf(creativeType).length() + 1);
        me4.r(sb, "IconClickFallbackImageMsgData [width=", width, ", height=", height);
        bf3.v(sb, ", imageUrl=", imageUrl, ", alternateText=", alternateText);
        return wt3.m(", creativeType=", creativeType, sb, U3.j.e);
    }

    public abstract int width();
}
