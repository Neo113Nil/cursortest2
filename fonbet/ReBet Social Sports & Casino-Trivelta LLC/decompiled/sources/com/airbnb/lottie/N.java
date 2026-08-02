package com.airbnb.lottie;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public class N {

    /* renamed from: a, reason: collision with root package name */
    public final int f28434a;

    /* renamed from: b, reason: collision with root package name */
    public final int f28435b;

    /* renamed from: c, reason: collision with root package name */
    public final String f28436c;

    /* renamed from: d, reason: collision with root package name */
    public final String f28437d;

    /* renamed from: e, reason: collision with root package name */
    public final String f28438e;

    /* renamed from: f, reason: collision with root package name */
    public Bitmap f28439f;

    public N(int i10, int i11, String str, String str2, String str3) {
        this.f28434a = i10;
        this.f28435b = i11;
        this.f28436c = str;
        this.f28437d = str2;
        this.f28438e = str3;
    }

    public N a(float f10) {
        N n10 = new N((int) (this.f28434a * f10), (int) (this.f28435b * f10), this.f28436c, this.f28437d, this.f28438e);
        Bitmap bitmap = this.f28439f;
        if (bitmap != null) {
            n10.g(Bitmap.createScaledBitmap(bitmap, n10.f28434a, n10.f28435b, true));
        }
        return n10;
    }

    public Bitmap b() {
        return this.f28439f;
    }

    public String c() {
        return this.f28437d;
    }

    public int d() {
        return this.f28435b;
    }

    public String e() {
        return this.f28436c;
    }

    public int f() {
        return this.f28434a;
    }

    public void g(Bitmap bitmap) {
        this.f28439f = bitmap;
    }
}
