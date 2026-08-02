package com.google.firebase.messaging;

import java.io.IOException;

/* renamed from: com.google.firebase.messaging.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C5920a implements r8.d<F8.a> {

    /* renamed from: a, reason: collision with root package name */
    static final C5920a f59678a = new C5920a();

    /* renamed from: b, reason: collision with root package name */
    private static final r8.c f59679b = HY.a.b(1, r8.c.a("projectNumber"));

    /* renamed from: c, reason: collision with root package name */
    private static final r8.c f59680c = HY.a.b(2, r8.c.a("messageId"));

    /* renamed from: d, reason: collision with root package name */
    private static final r8.c f59681d = HY.a.b(3, r8.c.a("instanceId"));

    /* renamed from: e, reason: collision with root package name */
    private static final r8.c f59682e = HY.a.b(4, r8.c.a("messageType"));

    /* renamed from: f, reason: collision with root package name */
    private static final r8.c f59683f = HY.a.b(5, r8.c.a("sdkPlatform"));

    /* renamed from: g, reason: collision with root package name */
    private static final r8.c f59684g = HY.a.b(6, r8.c.a("packageName"));

    /* renamed from: h, reason: collision with root package name */
    private static final r8.c f59685h = HY.a.b(7, r8.c.a("collapseKey"));

    /* renamed from: i, reason: collision with root package name */
    private static final r8.c f59686i = HY.a.b(8, r8.c.a("priority"));

    /* renamed from: j, reason: collision with root package name */
    private static final r8.c f59687j = HY.a.b(9, r8.c.a("ttl"));

    /* renamed from: k, reason: collision with root package name */
    private static final r8.c f59688k = HY.a.b(10, r8.c.a("topic"));

    /* renamed from: l, reason: collision with root package name */
    private static final r8.c f59689l = HY.a.b(11, r8.c.a("bulkId"));

    /* renamed from: m, reason: collision with root package name */
    private static final r8.c f59690m = HY.a.b(12, r8.c.a("event"));

    /* renamed from: n, reason: collision with root package name */
    private static final r8.c f59691n = HY.a.b(13, r8.c.a("analyticsLabel"));

    /* renamed from: o, reason: collision with root package name */
    private static final r8.c f59692o = HY.a.b(14, r8.c.a("campaignId"));

    /* renamed from: p, reason: collision with root package name */
    private static final r8.c f59693p = HY.a.b(15, r8.c.a("composerLabel"));

    @Override // r8.d
    public final void encode(Object obj, Object obj2) throws IOException {
        F8.a aVar = (F8.a) obj;
        r8.e eVar = (r8.e) obj2;
        eVar.add(f59679b, aVar.j());
        eVar.add(f59680c, aVar.f());
        eVar.add(f59681d, aVar.e());
        eVar.add(f59682e, aVar.g());
        eVar.add(f59683f, aVar.k());
        eVar.add(f59684g, aVar.h());
        eVar.add(f59685h, aVar.b());
        eVar.add(f59686i, aVar.i());
        eVar.add(f59687j, aVar.m());
        eVar.add(f59688k, aVar.l());
        eVar.add(f59689l, 0L);
        eVar.add(f59690m, aVar.d());
        eVar.add(f59691n, aVar.a());
        eVar.add(f59692o, 0L);
        eVar.add(f59693p, aVar.c());
    }
}
