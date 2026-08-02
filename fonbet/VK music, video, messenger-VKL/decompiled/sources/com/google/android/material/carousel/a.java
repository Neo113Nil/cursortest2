package com.google.android.material.carousel;

/* compiled from: CarouselStrategyHelper.java */
/* loaded from: classes13.dex */
public final class a {
    public static float a(float f, float f2, int i) {
        return (Math.max(0, i - 1) * f2) + f;
    }

    public static float b(float f, float f2, int i) {
        return i > 0 ? (f2 / 2.0f) + f : f;
    }

    public static float c(float f, float f2, float f3, int i) {
        return i > 0 ? (f3 / 2.0f) + f2 : f;
    }
}
