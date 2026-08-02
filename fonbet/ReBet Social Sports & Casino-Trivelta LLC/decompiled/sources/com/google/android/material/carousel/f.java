package com.google.android.material.carousel;

import android.content.Context;
import android.view.View;

/* loaded from: classes3.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public float f35110a;

    /* renamed from: b, reason: collision with root package name */
    public float f35111b;

    public enum a {
        CONTAINED,
        UNCONTAINED
    }

    public static int[] a(int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr2[i10] = iArr[i10] * 2;
        }
        return iArr2;
    }

    public static float b(float f10, float f11, float f12) {
        return 1.0f - ((f10 - f12) / (f11 - f12));
    }

    public float c() {
        return this.f35111b;
    }

    public float d() {
        return this.f35110a;
    }

    public a e() {
        return a.CONTAINED;
    }

    public void f(Context context) {
        float f10 = this.f35110a;
        if (f10 <= 0.0f) {
            f10 = g.h(context);
        }
        this.f35110a = f10;
        float f11 = this.f35111b;
        if (f11 <= 0.0f) {
            f11 = g.g(context);
        }
        this.f35111b = f11;
    }

    public abstract h g(b bVar, View view);

    public abstract boolean h(b bVar, int i10);
}
