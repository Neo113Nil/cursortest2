package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;

/* loaded from: classes3.dex */
public final class r extends c {

    /* renamed from: n, reason: collision with root package name */
    public int f35739n;

    /* renamed from: o, reason: collision with root package name */
    public int f35740o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f35741p;

    /* renamed from: q, reason: collision with root package name */
    public int f35742q;

    /* renamed from: r, reason: collision with root package name */
    public Integer f35743r;

    /* renamed from: s, reason: collision with root package name */
    public int f35744s;

    /* renamed from: t, reason: collision with root package name */
    public float f35745t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f35746u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f35747v;

    public r(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ia.c.f48200E);
    }

    @Override // com.google.android.material.progressindicator.c
    public boolean g() {
        return super.g() && i() == a();
    }

    @Override // com.google.android.material.progressindicator.c
    public void h() {
        super.h();
        if (this.f35742q < 0) {
            throw new IllegalArgumentException("Stop indicator size must be >= 0.");
        }
        if (this.f35739n == 0) {
            if ((a() > 0 || (this.f35747v && i() > 0)) && this.f35609h == 0) {
                throw new IllegalArgumentException("Rounded corners without gap are not supported in contiguous indeterminate animation.");
            }
            if (this.indicatorColors.length < 3) {
                throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
            }
        }
    }

    public int i() {
        return !this.f35747v ? a() : this.f35746u ? (int) (this.f35602a * this.f35745t) : this.f35744s;
    }

    public r(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, LinearProgressIndicator.f35581q);
    }

    public r(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        TypedArray i12 = xa.l.i(context, attributeSet, ia.m.LinearProgressIndicator, ia.c.f48200E, LinearProgressIndicator.f35581q, new int[0]);
        this.f35739n = i12.getInt(ia.m.f48651G2, 1);
        this.f35740o = i12.getInt(ia.m.f48661H2, 0);
        this.f35742q = Math.min(i12.getDimensionPixelSize(ia.m.f48691K2, 0), this.f35602a);
        if (i12.hasValue(ia.m.f48681J2)) {
            this.f35743r = Integer.valueOf(i12.getDimensionPixelSize(ia.m.f48681J2, 0));
        }
        TypedValue peekValue = i12.peekValue(ia.m.f48671I2);
        if (peekValue != null) {
            int i13 = peekValue.type;
            if (i13 == 5) {
                this.f35744s = Math.min(TypedValue.complexToDimensionPixelSize(peekValue.data, i12.getResources().getDisplayMetrics()), this.f35602a / 2);
                this.f35746u = false;
                this.f35747v = true;
            } else if (i13 == 6) {
                this.f35745t = Math.min(peekValue.getFraction(1.0f, 1.0f), 0.5f);
                this.f35746u = true;
                this.f35747v = true;
            }
        }
        i12.recycle();
        h();
        this.f35741p = this.f35740o == 1;
    }
}
