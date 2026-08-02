package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Bm {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12071a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12072b;

    /* renamed from: c, reason: collision with root package name */
    public final Zl f12073c;

    /* renamed from: d, reason: collision with root package name */
    public final Fl f12074d;

    /* renamed from: e, reason: collision with root package name */
    public final C0213hm f12075e;

    /* renamed from: f, reason: collision with root package name */
    public final C0546v4 f12076f;

    /* renamed from: g, reason: collision with root package name */
    public final C0135em f12077g;

    /* renamed from: h, reason: collision with root package name */
    public final M7 f12078h;

    /* renamed from: i, reason: collision with root package name */
    public final SystemTimeProvider f12079i;
    public final C0645z3 j;

    /* renamed from: k, reason: collision with root package name */
    public final C3 f12080k;

    /* renamed from: l, reason: collision with root package name */
    public final Il f12081l;

    /* renamed from: m, reason: collision with root package name */
    public final C0555vd f12082m;

    /* renamed from: n, reason: collision with root package name */
    public final po f12083n;

    public Bm(Context context, String str, Zl zl, Fl fl) {
        this.f12071a = context;
        this.f12072b = str;
        this.f12073c = zl;
        this.f12074d = fl;
        C0213hm A = C0353na.k().A();
        this.f12075e = A;
        C0161fm b10 = A.b();
        this.f12076f = new C0546v4(str);
        this.f12077g = new C0135em(context);
        this.f12078h = new M7();
        this.f12079i = new SystemTimeProvider();
        this.j = C0353na.k().f();
        this.f12080k = new C3();
        this.f12081l = new Il(new C0032am(context, str), b10, zl);
        this.f12082m = C0353na.k().q();
        this.f12083n = new po();
    }
}
