package g9;

import com.twilio.voice.EventKeys;
import j9.C5102a;
import j9.C5103b;
import rb.InterfaceC6214a;
import rb.InterfaceC6215b;

/* renamed from: g9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4366a implements InterfaceC6214a {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC6214a f47141a = new C4366a();

    /* renamed from: g9.a$a, reason: collision with other inner class name */
    public static final class C0687a implements qb.e {

        /* renamed from: a, reason: collision with root package name */
        public static final C0687a f47142a = new C0687a();

        /* renamed from: b, reason: collision with root package name */
        public static final qb.d f47143b = qb.d.a("window").b(com.google.firebase.encoders.proto.a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        public static final qb.d f47144c = qb.d.a("logSourceMetrics").b(com.google.firebase.encoders.proto.a.b().c(2).a()).a();

        /* renamed from: d, reason: collision with root package name */
        public static final qb.d f47145d = qb.d.a("globalMetrics").b(com.google.firebase.encoders.proto.a.b().c(3).a()).a();

        /* renamed from: e, reason: collision with root package name */
        public static final qb.d f47146e = qb.d.a("appNamespace").b(com.google.firebase.encoders.proto.a.b().c(4).a()).a();

        @Override // qb.InterfaceC6134b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C5102a c5102a, qb.f fVar) {
            fVar.c(f47143b, c5102a.d());
            fVar.c(f47144c, c5102a.c());
            fVar.c(f47145d, c5102a.b());
            fVar.c(f47146e, c5102a.a());
        }
    }

    /* renamed from: g9.a$b */
    public static final class b implements qb.e {

        /* renamed from: a, reason: collision with root package name */
        public static final b f47147a = new b();

        /* renamed from: b, reason: collision with root package name */
        public static final qb.d f47148b = qb.d.a("storageMetrics").b(com.google.firebase.encoders.proto.a.b().c(1).a()).a();

        @Override // qb.InterfaceC6134b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C5103b c5103b, qb.f fVar) {
            fVar.c(f47148b, c5103b.a());
        }
    }

    /* renamed from: g9.a$c */
    public static final class c implements qb.e {

        /* renamed from: a, reason: collision with root package name */
        public static final c f47149a = new c();

        /* renamed from: b, reason: collision with root package name */
        public static final qb.d f47150b = qb.d.a("eventsDroppedCount").b(com.google.firebase.encoders.proto.a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        public static final qb.d f47151c = qb.d.a(EventKeys.REASON).b(com.google.firebase.encoders.proto.a.b().c(3).a()).a();

        @Override // qb.InterfaceC6134b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(j9.c cVar, qb.f fVar) {
            fVar.b(f47150b, cVar.a());
            fVar.c(f47151c, cVar.b());
        }
    }

    /* renamed from: g9.a$d */
    public static final class d implements qb.e {

        /* renamed from: a, reason: collision with root package name */
        public static final d f47152a = new d();

        /* renamed from: b, reason: collision with root package name */
        public static final qb.d f47153b = qb.d.a("logSource").b(com.google.firebase.encoders.proto.a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        public static final qb.d f47154c = qb.d.a("logEventDropped").b(com.google.firebase.encoders.proto.a.b().c(2).a()).a();

        @Override // qb.InterfaceC6134b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(j9.d dVar, qb.f fVar) {
            fVar.c(f47153b, dVar.b());
            fVar.c(f47154c, dVar.a());
        }
    }

    /* renamed from: g9.a$e */
    public static final class e implements qb.e {

        /* renamed from: a, reason: collision with root package name */
        public static final e f47155a = new e();

        /* renamed from: b, reason: collision with root package name */
        public static final qb.d f47156b = qb.d.d("clientMetrics");

        @Override // qb.InterfaceC6134b
        public /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
            android.support.v4.media.session.b.a(obj);
            b(null, (qb.f) obj2);
        }

        public void b(l lVar, qb.f fVar) {
            throw null;
        }
    }

    /* renamed from: g9.a$f */
    public static final class f implements qb.e {

        /* renamed from: a, reason: collision with root package name */
        public static final f f47157a = new f();

        /* renamed from: b, reason: collision with root package name */
        public static final qb.d f47158b = qb.d.a("currentCacheSizeBytes").b(com.google.firebase.encoders.proto.a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        public static final qb.d f47159c = qb.d.a("maxCacheSizeBytes").b(com.google.firebase.encoders.proto.a.b().c(2).a()).a();

        @Override // qb.InterfaceC6134b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(j9.e eVar, qb.f fVar) {
            fVar.b(f47158b, eVar.a());
            fVar.b(f47159c, eVar.b());
        }
    }

    /* renamed from: g9.a$g */
    public static final class g implements qb.e {

        /* renamed from: a, reason: collision with root package name */
        public static final g f47160a = new g();

        /* renamed from: b, reason: collision with root package name */
        public static final qb.d f47161b = qb.d.a("startMs").b(com.google.firebase.encoders.proto.a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        public static final qb.d f47162c = qb.d.a("endMs").b(com.google.firebase.encoders.proto.a.b().c(2).a()).a();

        @Override // qb.InterfaceC6134b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(j9.f fVar, qb.f fVar2) {
            fVar2.b(f47161b, fVar.b());
            fVar2.b(f47162c, fVar.a());
        }
    }

    @Override // rb.InterfaceC6214a
    public void a(InterfaceC6215b interfaceC6215b) {
        interfaceC6215b.a(l.class, e.f47155a);
        interfaceC6215b.a(C5102a.class, C0687a.f47142a);
        interfaceC6215b.a(j9.f.class, g.f47160a);
        interfaceC6215b.a(j9.d.class, d.f47152a);
        interfaceC6215b.a(j9.c.class, c.f47149a);
        interfaceC6215b.a(C5103b.class, b.f47147a);
        interfaceC6215b.a(j9.e.class, f.f47157a);
    }
}
