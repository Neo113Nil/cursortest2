package com.google.firebase.messaging;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a implements t8.d {

    /* renamed from: a, reason: collision with root package name */
    public static final a f6074a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final t8.c f6075b = new t8.c("projectNumber", d9.e.s(d9.e.q(w8.e.class, new w8.a(1))));

    /* renamed from: c, reason: collision with root package name */
    public static final t8.c f6076c = new t8.c("messageId", d9.e.s(d9.e.q(w8.e.class, new w8.a(2))));

    /* renamed from: d, reason: collision with root package name */
    public static final t8.c f6077d = new t8.c("instanceId", d9.e.s(d9.e.q(w8.e.class, new w8.a(3))));

    /* renamed from: e, reason: collision with root package name */
    public static final t8.c f6078e = new t8.c("messageType", d9.e.s(d9.e.q(w8.e.class, new w8.a(4))));

    /* renamed from: f, reason: collision with root package name */
    public static final t8.c f6079f = new t8.c("sdkPlatform", d9.e.s(d9.e.q(w8.e.class, new w8.a(5))));

    /* renamed from: g, reason: collision with root package name */
    public static final t8.c f6080g = new t8.c("packageName", d9.e.s(d9.e.q(w8.e.class, new w8.a(6))));

    /* renamed from: h, reason: collision with root package name */
    public static final t8.c f6081h = new t8.c("collapseKey", d9.e.s(d9.e.q(w8.e.class, new w8.a(7))));

    /* renamed from: i, reason: collision with root package name */
    public static final t8.c f6082i = new t8.c("priority", d9.e.s(d9.e.q(w8.e.class, new w8.a(8))));
    public static final t8.c j = new t8.c("ttl", d9.e.s(d9.e.q(w8.e.class, new w8.a(9))));

    /* renamed from: k, reason: collision with root package name */
    public static final t8.c f6083k = new t8.c("topic", d9.e.s(d9.e.q(w8.e.class, new w8.a(10))));

    /* renamed from: l, reason: collision with root package name */
    public static final t8.c f6084l = new t8.c("bulkId", d9.e.s(d9.e.q(w8.e.class, new w8.a(11))));

    /* renamed from: m, reason: collision with root package name */
    public static final t8.c f6085m = new t8.c("event", d9.e.s(d9.e.q(w8.e.class, new w8.a(12))));

    /* renamed from: n, reason: collision with root package name */
    public static final t8.c f6086n = new t8.c("analyticsLabel", d9.e.s(d9.e.q(w8.e.class, new w8.a(13))));

    /* renamed from: o, reason: collision with root package name */
    public static final t8.c f6087o = new t8.c("campaignId", d9.e.s(d9.e.q(w8.e.class, new w8.a(14))));

    /* renamed from: p, reason: collision with root package name */
    public static final t8.c f6088p = new t8.c("composerLabel", d9.e.s(d9.e.q(w8.e.class, new w8.a(15))));

    @Override // t8.a
    public final void a(Object obj, Object obj2) {
        g9.d dVar = (g9.d) obj;
        t8.e eVar = (t8.e) obj2;
        eVar.b(f6075b, dVar.f9898a);
        eVar.a(f6076c, dVar.f9899b);
        eVar.a(f6077d, dVar.f9900c);
        eVar.a(f6078e, dVar.f9901d);
        eVar.a(f6079f, g9.c.ANDROID);
        eVar.a(f6080g, dVar.f9902e);
        eVar.a(f6081h, dVar.f9903f);
        eVar.e(f6082i, dVar.f9904g);
        eVar.e(j, dVar.f9905h);
        eVar.a(f6083k, dVar.f9906i);
        eVar.b(f6084l, 0L);
        eVar.a(f6085m, g9.a.MESSAGE_DELIVERED);
        eVar.a(f6086n, dVar.j);
        eVar.b(f6087o, 0L);
        eVar.a(f6088p, dVar.f9907k);
    }
}
