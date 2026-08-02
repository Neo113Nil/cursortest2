package com.plaid.internal;

import android.app.Application;
import com.plaid.internal.workflow.persistence.database.WorkflowDatabase;
import ei.AbstractC4212b;
import javax.inject.Provider;

/* renamed from: com.plaid.internal.p0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3713p0 implements X4 {

    /* renamed from: a, reason: collision with root package name */
    public final Application f40932a;

    /* renamed from: b, reason: collision with root package name */
    public final C3713p0 f40933b = this;

    /* renamed from: c, reason: collision with root package name */
    public final Gg.b f40934c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<H5> f40935d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<AbstractC4212b> f40936e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<C3794y1> f40937f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<AbstractC3606d1> f40938g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<W4> f40939h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<WorkflowDatabase> f40940i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<A2> f40941j;

    /* renamed from: k, reason: collision with root package name */
    public final Provider<I5> f40942k;

    /* renamed from: l, reason: collision with root package name */
    public final Provider<E5> f40943l;

    /* renamed from: m, reason: collision with root package name */
    public final Provider<C3691m5> f40944m;

    /* renamed from: n, reason: collision with root package name */
    public final Provider<C3575c5> f40945n;

    /* renamed from: o, reason: collision with root package name */
    public final Provider<N5> f40946o;

    /* renamed from: p, reason: collision with root package name */
    public final Provider<C3561b1> f40947p;

    public C3713p0(C3727q5 c3727q5, Application application) {
        this.f40932a = application;
        Gg.a.e(new C3780w5(c3727q5));
        Gg.b a10 = Gg.c.a(application);
        this.f40934c = a10;
        Provider<H5> e10 = Gg.a.e(new C5(c3727q5, a10));
        this.f40935d = e10;
        Provider<AbstractC4212b> e11 = Gg.a.e(new C3789x5(c3727q5));
        this.f40936e = e11;
        this.f40937f = Gg.a.e(new C3803z1(e10, e11));
        Provider<AbstractC3606d1> e12 = Gg.a.e(new C3771v5(c3727q5, a10));
        this.f40938g = e12;
        this.f40939h = Gg.a.e(new C3807z5(c3727q5, e10));
        this.f40940i = Gg.a.e(new C3753t5(c3727q5, a10));
        this.f40941j = Gg.a.e(new C3798y5(c3727q5));
        Provider<I5> e13 = Gg.a.e(new D5(c3727q5, a10));
        this.f40942k = e13;
        Provider<E5> e14 = Gg.a.e(new B5(c3727q5, e13));
        this.f40943l = e14;
        Provider<C3691m5> e15 = Gg.a.e(new A5(c3727q5, a10));
        this.f40944m = e15;
        this.f40945n = Gg.a.e(new C3744s5(c3727q5, a10, e14, e15));
        this.f40946o = Gg.a.e(new O5(a10));
        this.f40947p = Gg.a.e(new C3762u5(c3727q5, e12));
    }
}
