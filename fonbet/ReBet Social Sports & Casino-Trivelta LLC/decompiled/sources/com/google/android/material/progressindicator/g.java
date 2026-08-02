package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes3.dex */
public final class g extends c {

    /* renamed from: n, reason: collision with root package name */
    public int f35652n;

    /* renamed from: o, reason: collision with root package name */
    public int f35653o;

    /* renamed from: p, reason: collision with root package name */
    public int f35654p;

    /* renamed from: q, reason: collision with root package name */
    public int f35655q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f35656r;

    public g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ia.c.f48234g);
    }

    public g(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, CircularProgressIndicator.f35580q);
    }

    public g(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(ia.e.f48381z0);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(ia.e.f48379y0);
        TypedArray i12 = xa.l.i(context, attributeSet, ia.m.CircularProgressIndicator, i10, i11, new int[0]);
        this.f35652n = i12.getInt(ia.m.f49022s1, 0);
        this.f35653o = Math.max(Ca.c.d(context, i12, ia.m.f49062w1, dimensionPixelSize), this.f35602a * 2);
        this.f35654p = Ca.c.d(context, i12, ia.m.f49052v1, dimensionPixelSize2);
        this.f35655q = i12.getInt(ia.m.f49042u1, 0);
        this.f35656r = i12.getBoolean(ia.m.f49032t1, true);
        i12.recycle();
        h();
    }
}
