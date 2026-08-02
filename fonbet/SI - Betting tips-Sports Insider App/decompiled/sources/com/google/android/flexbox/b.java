package com.google.android.flexbox;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public int f4215e;

    /* renamed from: f, reason: collision with root package name */
    public int f4216f;

    /* renamed from: g, reason: collision with root package name */
    public int f4217g;

    /* renamed from: h, reason: collision with root package name */
    public int f4218h;

    /* renamed from: i, reason: collision with root package name */
    public int f4219i;
    public float j;

    /* renamed from: k, reason: collision with root package name */
    public float f4220k;

    /* renamed from: l, reason: collision with root package name */
    public int f4221l;

    /* renamed from: m, reason: collision with root package name */
    public int f4222m;

    /* renamed from: o, reason: collision with root package name */
    public int f4224o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f4225p;
    public boolean q;

    /* renamed from: a, reason: collision with root package name */
    public int f4211a = Integer.MAX_VALUE;

    /* renamed from: b, reason: collision with root package name */
    public int f4212b = Integer.MAX_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public int f4213c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public int f4214d = Integer.MIN_VALUE;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f4223n = new ArrayList();

    public final int a() {
        return this.f4218h - this.f4219i;
    }

    public final void b(View view, int i5, int i10, int i11, int i12) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        this.f4211a = Math.min(this.f4211a, (view.getLeft() - flexItem.O()) - i5);
        this.f4212b = Math.min(this.f4212b, (view.getTop() - flexItem.R()) - i10);
        this.f4213c = Math.max(this.f4213c, view.getRight() + flexItem.d0() + i11);
        this.f4214d = Math.max(this.f4214d, view.getBottom() + flexItem.K() + i12);
    }
}
