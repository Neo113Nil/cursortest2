package com.google.android.flexbox;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: e, reason: collision with root package name */
    public int f31955e;

    /* renamed from: f, reason: collision with root package name */
    public int f31956f;

    /* renamed from: g, reason: collision with root package name */
    public int f31957g;

    /* renamed from: h, reason: collision with root package name */
    public int f31958h;

    /* renamed from: i, reason: collision with root package name */
    public int f31959i;

    /* renamed from: j, reason: collision with root package name */
    public float f31960j;

    /* renamed from: k, reason: collision with root package name */
    public float f31961k;

    /* renamed from: l, reason: collision with root package name */
    public int f31962l;

    /* renamed from: m, reason: collision with root package name */
    public int f31963m;

    /* renamed from: o, reason: collision with root package name */
    public int f31965o;

    /* renamed from: p, reason: collision with root package name */
    public int f31966p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f31967q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f31968r;

    /* renamed from: a, reason: collision with root package name */
    public int f31951a = Integer.MAX_VALUE;

    /* renamed from: b, reason: collision with root package name */
    public int f31952b = Integer.MAX_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public int f31953c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public int f31954d = Integer.MIN_VALUE;

    /* renamed from: n, reason: collision with root package name */
    public List f31964n = new ArrayList();

    public int a() {
        return this.f31957g;
    }

    public int b() {
        return this.f31958h;
    }

    public int c() {
        return this.f31958h - this.f31959i;
    }

    public void d(View view, int i10, int i11, int i12, int i13) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        this.f31951a = Math.min(this.f31951a, (view.getLeft() - flexItem.L()) - i10);
        this.f31952b = Math.min(this.f31952b, (view.getTop() - flexItem.u()) - i11);
        this.f31953c = Math.max(this.f31953c, view.getRight() + flexItem.V() + i12);
        this.f31954d = Math.max(this.f31954d, view.getBottom() + flexItem.K() + i13);
    }
}
