package com.airbnb.lottie.utils;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public float f29128a;

    /* renamed from: b, reason: collision with root package name */
    public int f29129b;

    public void a(float f10) {
        float f11 = this.f29128a + f10;
        this.f29128a = f11;
        int i10 = this.f29129b + 1;
        this.f29129b = i10;
        if (i10 == Integer.MAX_VALUE) {
            this.f29128a = f11 / 2.0f;
            this.f29129b = i10 / 2;
        }
    }
}
