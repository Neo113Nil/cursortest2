package io.appmetrica.analytics.impl;

import android.content.ContentValues;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class N8 {

    /* renamed from: a, reason: collision with root package name */
    public final String f12630a;

    /* renamed from: b, reason: collision with root package name */
    public String f12631b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f12632c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f12633d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f12634e;

    /* renamed from: f, reason: collision with root package name */
    public final Long f12635f;

    /* renamed from: g, reason: collision with root package name */
    public final C0224i7 f12636g;

    /* renamed from: h, reason: collision with root package name */
    public final EnumC0047bb f12637h;

    /* renamed from: i, reason: collision with root package name */
    public final Integer f12638i;
    public final String j;

    /* renamed from: k, reason: collision with root package name */
    public final Integer f12639k;

    /* renamed from: l, reason: collision with root package name */
    public final Integer f12640l;

    /* renamed from: m, reason: collision with root package name */
    public final String f12641m;

    /* renamed from: n, reason: collision with root package name */
    public final String f12642n;

    /* renamed from: o, reason: collision with root package name */
    public final I8 f12643o;

    /* renamed from: p, reason: collision with root package name */
    public final EnumC0098da f12644p;
    public final EnumC0327m9 q;

    /* renamed from: r, reason: collision with root package name */
    public final Boolean f12645r;

    /* renamed from: s, reason: collision with root package name */
    public final Integer f12646s;

    /* renamed from: t, reason: collision with root package name */
    public final byte[] f12647t;

    /* JADX WARN: Multi-variable type inference failed */
    public N8(ContentValues contentValues) {
        C0120e7 model = new C0146f7(null, 1, 0 == true ? 1 : 0).toModel(contentValues);
        this.f12630a = model.a().j();
        this.f12631b = model.a().p();
        this.f12632c = model.c();
        this.f12633d = model.b();
        this.f12634e = model.a().k();
        this.f12635f = model.d();
        this.f12636g = model.a().i();
        this.f12637h = model.e();
        this.f12638i = model.a().d();
        this.j = model.a().f();
        this.f12639k = model.a().o();
        this.f12640l = model.a().c();
        this.f12641m = model.a().b();
        this.f12642n = model.a().m();
        I8 e7 = model.a().e();
        this.f12643o = e7 == null ? I8.a(null) : e7;
        EnumC0098da h10 = model.a().h();
        this.f12644p = h10 == null ? EnumC0098da.a(null) : h10;
        this.q = model.a().n();
        this.f12645r = model.a().a();
        this.f12646s = model.a().l();
        this.f12647t = model.a().g();
    }
}
