package com.ironsource.mediationsdk;

import android.content.Context;
import com.ironsource.U7;
import com.unity3d.mediation.LevelPlayAdSize;

/* loaded from: classes13.dex */
public class ISBannerSize {
    private final int a;
    private final int b;
    private final String c;
    private boolean d;
    U7 e;
    public static final ISBannerSize BANNER = j.a("BANNER", 320, 50);
    public static final ISBannerSize LARGE = j.a("LARGE", 320, 90);
    public static final ISBannerSize RECTANGLE = j.a("RECTANGLE", 300, 250);
    protected static final ISBannerSize f = j.a();
    public static final ISBannerSize SMART = j.a("SMART", 0, 0);

    public ISBannerSize(int i, int i2) {
        this("CUSTOM", i, i2);
    }

    public static int getMaximalAdaptiveHeight(int i) {
        return j.b(i);
    }

    public void a(U7 u7) {
        if (j.a(u7, this.a, this.b)) {
            this.e = u7;
        }
    }

    public String getDescription() {
        return this.c;
    }

    public int getHeight() {
        return this.b;
    }

    public int getWidth() {
        return this.a;
    }

    public boolean isAdaptive() {
        return this.d;
    }

    public boolean isSmart() {
        return this.c.equals("SMART");
    }

    public void setAdaptive(boolean z) {
        this.d = z;
    }

    public LevelPlayAdSize toLevelPlayAdSize(Context context) {
        if (isAdaptive()) {
            return LevelPlayAdSize.createAdaptiveAdSize(context, Integer.valueOf(this.e.d()));
        }
        String description = getDescription();
        description.getClass();
        switch (description) {
            case "RECTANGLE":
            case "MEDIUM_RECTANGLE":
                return LevelPlayAdSize.MEDIUM_RECTANGLE;
            case "LARGE":
                return LevelPlayAdSize.LARGE;
            case "BANNER":
                return LevelPlayAdSize.BANNER;
            case "CUSTOM":
                return LevelPlayAdSize.createCustomSize(this.a, this.b);
            default:
                return LevelPlayAdSize.BANNER;
        }
    }

    public ISBannerSize(String str, int i, int i2) {
        this.c = str;
        this.a = i;
        this.b = i2;
        this.e = new U7(i, i2);
    }
}
