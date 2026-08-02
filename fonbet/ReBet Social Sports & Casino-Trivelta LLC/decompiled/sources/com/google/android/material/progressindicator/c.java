package com.google.android.material.progressindicator;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import l.AbstractC5335a;
import sa.AbstractC6344a;

/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public int f35602a;

    /* renamed from: b, reason: collision with root package name */
    public int f35603b;

    /* renamed from: c, reason: collision with root package name */
    public float f35604c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f35605d;

    /* renamed from: e, reason: collision with root package name */
    public int f35606e;

    /* renamed from: f, reason: collision with root package name */
    public int f35607f;

    /* renamed from: g, reason: collision with root package name */
    public int f35608g;

    /* renamed from: h, reason: collision with root package name */
    public int f35609h;

    /* renamed from: i, reason: collision with root package name */
    public int f35610i;

    @NonNull
    public int[] indicatorColors = new int[0];

    /* renamed from: j, reason: collision with root package name */
    public int f35611j;

    /* renamed from: k, reason: collision with root package name */
    public int f35612k;

    /* renamed from: l, reason: collision with root package name */
    public int f35613l;

    /* renamed from: m, reason: collision with root package name */
    public float f35614m;

    public c(Context context, AttributeSet attributeSet, int i10, int i11) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(ia.e.f48290A0);
        TypedArray i12 = xa.l.i(context, attributeSet, ia.m.BaseProgressIndicator, i10, i11, new int[0]);
        this.f35602a = Ca.c.d(context, i12, ia.m.f48813X, dimensionPixelSize);
        TypedValue peekValue = i12.peekValue(ia.m.f48804W);
        if (peekValue != null) {
            int i13 = peekValue.type;
            if (i13 == 5) {
                this.f35603b = Math.min(TypedValue.complexToDimensionPixelSize(peekValue.data, i12.getResources().getDisplayMetrics()), this.f35602a / 2);
                this.f35605d = false;
            } else if (i13 == 6) {
                this.f35604c = Math.min(peekValue.getFraction(1.0f, 1.0f), 0.5f);
                this.f35605d = true;
            }
        }
        this.f35607f = i12.getInt(ia.m.f48777T, 0);
        this.f35608g = i12.getInt(ia.m.f48728O, 0);
        this.f35609h = i12.getDimensionPixelSize(ia.m.f48758R, 0);
        int abs = Math.abs(i12.getDimensionPixelSize(ia.m.f48841a0, 0));
        this.f35610i = Math.abs(i12.getDimensionPixelSize(ia.m.f48851b0, abs));
        this.f35611j = Math.abs(i12.getDimensionPixelSize(ia.m.f48861c0, abs));
        this.f35612k = Math.abs(i12.getDimensionPixelSize(ia.m.f48822Y, 0));
        this.f35613l = i12.getDimensionPixelSize(ia.m.f48831Z, 0);
        this.f35614m = i12.getFloat(ia.m.f48738P, 1.0f);
        e(context, i12);
        f(context, i12);
        i12.recycle();
    }

    public int a() {
        return this.f35605d ? (int) (this.f35602a * this.f35604c) : this.f35603b;
    }

    public boolean b(boolean z10) {
        if (this.f35612k <= 0) {
            return false;
        }
        if (z10 || this.f35611j <= 0) {
            return z10 && this.f35610i > 0;
        }
        return true;
    }

    public boolean c() {
        return this.f35608g != 0;
    }

    public boolean d() {
        return this.f35607f != 0;
    }

    public final void e(Context context, TypedArray typedArray) {
        if (!typedArray.hasValue(ia.m.f48748Q)) {
            this.indicatorColors = new int[]{AbstractC6344a.b(context, AbstractC5335a.f55008w, -1)};
            return;
        }
        if (typedArray.peekValue(ia.m.f48748Q).type != 1) {
            this.indicatorColors = new int[]{typedArray.getColor(ia.m.f48748Q, -1)};
            return;
        }
        int[] intArray = context.getResources().getIntArray(typedArray.getResourceId(ia.m.f48748Q, -1));
        this.indicatorColors = intArray;
        if (intArray.length == 0) {
            throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
        }
    }

    public final void f(Context context, TypedArray typedArray) {
        if (typedArray.hasValue(ia.m.f48795V)) {
            this.f35606e = typedArray.getColor(ia.m.f48795V, -1);
            return;
        }
        this.f35606e = this.indicatorColors[0];
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.disabledAlpha});
        float f10 = obtainStyledAttributes.getFloat(0, 0.2f);
        obtainStyledAttributes.recycle();
        this.f35606e = AbstractC6344a.a(this.f35606e, (int) (f10 * 255.0f));
    }

    public boolean g() {
        return this.f35605d && this.f35604c == 0.5f;
    }

    public void h() {
        if (this.f35609h < 0) {
            throw new IllegalArgumentException("indicatorTrackGapSize must be >= 0.");
        }
    }
}
