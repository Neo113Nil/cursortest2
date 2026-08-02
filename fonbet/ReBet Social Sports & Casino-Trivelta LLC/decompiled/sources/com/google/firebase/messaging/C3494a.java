package com.google.firebase.messaging;

import com.twilio.voice.EventKeys;
import rb.InterfaceC6214a;
import rb.InterfaceC6215b;

/* renamed from: com.google.firebase.messaging.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3494a implements InterfaceC6214a {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC6214a f37902a = new C3494a();

    /* renamed from: com.google.firebase.messaging.a$a, reason: collision with other inner class name */
    public static final class C0528a implements qb.e {

        /* renamed from: a, reason: collision with root package name */
        public static final C0528a f37903a = new C0528a();

        /* renamed from: b, reason: collision with root package name */
        public static final qb.d f37904b = qb.d.a("projectNumber").b(com.google.firebase.encoders.proto.a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        public static final qb.d f37905c = qb.d.a("messageId").b(com.google.firebase.encoders.proto.a.b().c(2).a()).a();

        /* renamed from: d, reason: collision with root package name */
        public static final qb.d f37906d = qb.d.a("instanceId").b(com.google.firebase.encoders.proto.a.b().c(3).a()).a();

        /* renamed from: e, reason: collision with root package name */
        public static final qb.d f37907e = qb.d.a("messageType").b(com.google.firebase.encoders.proto.a.b().c(4).a()).a();

        /* renamed from: f, reason: collision with root package name */
        public static final qb.d f37908f = qb.d.a("sdkPlatform").b(com.google.firebase.encoders.proto.a.b().c(5).a()).a();

        /* renamed from: g, reason: collision with root package name */
        public static final qb.d f37909g = qb.d.a("packageName").b(com.google.firebase.encoders.proto.a.b().c(6).a()).a();

        /* renamed from: h, reason: collision with root package name */
        public static final qb.d f37910h = qb.d.a("collapseKey").b(com.google.firebase.encoders.proto.a.b().c(7).a()).a();

        /* renamed from: i, reason: collision with root package name */
        public static final qb.d f37911i = qb.d.a(EventKeys.PRIORITY).b(com.google.firebase.encoders.proto.a.b().c(8).a()).a();

        /* renamed from: j, reason: collision with root package name */
        public static final qb.d f37912j = qb.d.a("ttl").b(com.google.firebase.encoders.proto.a.b().c(9).a()).a();

        /* renamed from: k, reason: collision with root package name */
        public static final qb.d f37913k = qb.d.a("topic").b(com.google.firebase.encoders.proto.a.b().c(10).a()).a();

        /* renamed from: l, reason: collision with root package name */
        public static final qb.d f37914l = qb.d.a("bulkId").b(com.google.firebase.encoders.proto.a.b().c(11).a()).a();

        /* renamed from: m, reason: collision with root package name */
        public static final qb.d f37915m = qb.d.a("event").b(com.google.firebase.encoders.proto.a.b().c(12).a()).a();

        /* renamed from: n, reason: collision with root package name */
        public static final qb.d f37916n = qb.d.a("analyticsLabel").b(com.google.firebase.encoders.proto.a.b().c(13).a()).a();

        /* renamed from: o, reason: collision with root package name */
        public static final qb.d f37917o = qb.d.a("campaignId").b(com.google.firebase.encoders.proto.a.b().c(14).a()).a();

        /* renamed from: p, reason: collision with root package name */
        public static final qb.d f37918p = qb.d.a("composerLabel").b(com.google.firebase.encoders.proto.a.b().c(15).a()).a();

        @Override // qb.InterfaceC6134b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Cb.a aVar, qb.f fVar) {
            fVar.b(f37904b, aVar.l());
            fVar.c(f37905c, aVar.h());
            fVar.c(f37906d, aVar.g());
            fVar.c(f37907e, aVar.i());
            fVar.c(f37908f, aVar.m());
            fVar.c(f37909g, aVar.j());
            fVar.c(f37910h, aVar.d());
            fVar.a(f37911i, aVar.k());
            fVar.a(f37912j, aVar.o());
            fVar.c(f37913k, aVar.n());
            fVar.b(f37914l, aVar.b());
            fVar.c(f37915m, aVar.f());
            fVar.c(f37916n, aVar.a());
            fVar.b(f37917o, aVar.c());
            fVar.c(f37918p, aVar.e());
        }
    }

    /* renamed from: com.google.firebase.messaging.a$b */
    public static final class b implements qb.e {

        /* renamed from: a, reason: collision with root package name */
        public static final b f37919a = new b();

        /* renamed from: b, reason: collision with root package name */
        public static final qb.d f37920b = qb.d.a("messagingClientEvent").b(com.google.firebase.encoders.proto.a.b().c(1).a()).a();

        @Override // qb.InterfaceC6134b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Cb.b bVar, qb.f fVar) {
            fVar.c(f37920b, bVar.a());
        }
    }

    /* renamed from: com.google.firebase.messaging.a$c */
    public static final class c implements qb.e {

        /* renamed from: a, reason: collision with root package name */
        public static final c f37921a = new c();

        /* renamed from: b, reason: collision with root package name */
        public static final qb.d f37922b = qb.d.d("messagingClientEventExtension");

        @Override // qb.InterfaceC6134b
        public /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
            android.support.v4.media.session.b.a(obj);
            b(null, (qb.f) obj2);
        }

        public void b(P p10, qb.f fVar) {
            throw null;
        }
    }

    @Override // rb.InterfaceC6214a
    public void a(InterfaceC6215b interfaceC6215b) {
        interfaceC6215b.a(P.class, c.f37921a);
        interfaceC6215b.a(Cb.b.class, b.f37919a);
        interfaceC6215b.a(Cb.a.class, C0528a.f37903a);
    }
}
