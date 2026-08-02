package com.moloco.sdk.service_locator;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.moloco.sdk.BuildConfig;
import com.moloco.sdk.Init;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.A;
import com.moloco.sdk.internal.B;
import com.moloco.sdk.internal.C2785b;
import com.moloco.sdk.internal.InterfaceC2784a;
import com.moloco.sdk.internal.services.C;
import com.moloco.sdk.internal.services.C2805b;
import com.moloco.sdk.internal.services.C2810e;
import com.moloco.sdk.internal.services.C2812g;
import com.moloco.sdk.internal.services.C2814i;
import com.moloco.sdk.internal.services.C2817l;
import com.moloco.sdk.internal.services.D;
import com.moloco.sdk.internal.services.F;
import com.moloco.sdk.internal.services.G;
import com.moloco.sdk.internal.services.I;
import com.moloco.sdk.internal.services.InterfaceC2804a;
import com.moloco.sdk.internal.services.InterfaceC2809d;
import com.moloco.sdk.internal.services.InterfaceC2811f;
import com.moloco.sdk.internal.services.InterfaceC2816k;
import com.moloco.sdk.internal.services.J;
import com.moloco.sdk.internal.services.K;
import com.moloco.sdk.internal.services.L;
import com.moloco.sdk.internal.services.init.g;
import com.moloco.sdk.internal.services.n;
import com.moloco.sdk.internal.services.o;
import com.moloco.sdk.internal.services.q;
import com.moloco.sdk.internal.services.r;
import com.moloco.sdk.internal.services.s;
import com.moloco.sdk.internal.services.t;
import com.moloco.sdk.internal.services.u;
import com.moloco.sdk.internal.services.v;
import com.moloco.sdk.internal.services.y;
import com.moloco.sdk.service_locator.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C2835o;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C2838s;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.InterfaceC2833m;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.l;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.m;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w;
import io.ktor.client.HttpClient;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* loaded from: classes2.dex */
public final class a {
    public static final a a = new a();
    public static final int b = 0;

    /* renamed from: com.moloco.sdk.service_locator.a$a, reason: collision with other inner class name */
    public static final class C0269a {
        public static final C0269a a = new C0269a();
        public static final Lazy b = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.service_locator.a$a$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.C0269a.c();
            }
        });
        public static final int c = 8;

        public static final L c() {
            return new L(a.a.a(), MetricsRecorder.INSTANCE.withNoMediation());
        }

        public final InterfaceC2833m a() {
            return C2835o.a(g.a.a(), b.a.f());
        }

        public final L b() {
            return (L) b.getValue();
        }
    }

    public static final class b {
        public static final b a = new b();
        public static final Lazy b = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.service_locator.a$b$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.b.a();
            }
        });
        public static final Lazy c = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.service_locator.a$b$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.b.j();
            }
        });
        public static final Lazy d = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.service_locator.a$b$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.b.b();
            }
        });
        public static final Lazy e = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.service_locator.a$b$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.b.c();
            }
        });
        public static final Lazy f = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.service_locator.a$b$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.b.i();
            }
        });
        public static final int g = 8;

        public static final com.moloco.sdk.internal.services.analytics.b a() {
            com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i c2 = i.a.c();
            k kVar = k.a;
            return new com.moloco.sdk.internal.services.analytics.b(c2, kVar.b(), kVar.c());
        }

        public static final C2812g b() {
            return new C2812g(ProcessLifecycleOwner.INSTANCE.get().getLifecycle(), a.h());
        }

        public static final com.moloco.sdk.internal.error.c c() {
            return new com.moloco.sdk.internal.error.c(c.a.b(), new com.moloco.sdk.internal.error.api.b(h.a.i(), com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.c.a()));
        }

        public static final com.moloco.sdk.internal.ilrd.c i() {
            return new com.moloco.sdk.internal.ilrd.c(a.a.a());
        }

        public static final I j() {
            return new I(a.d(), h.a.i());
        }

        public final com.moloco.sdk.internal.services.analytics.a d() {
            return (com.moloco.sdk.internal.services.analytics.a) b.getValue();
        }

        public final InterfaceC2811f e() {
            return (InterfaceC2811f) d.getValue();
        }

        public final com.moloco.sdk.internal.error.b f() {
            return (com.moloco.sdk.internal.error.b) e.getValue();
        }

        public final com.moloco.sdk.internal.ilrd.c g() {
            return (com.moloco.sdk.internal.ilrd.c) f.getValue();
        }

        public final I h() {
            return (I) c.getValue();
        }
    }

    public static final class c {
        public static final c a = new c();
        public static final Lazy b = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.service_locator.a$c$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.c.a();
            }
        });
        public static final int c = 8;

        public static final com.moloco.sdk.internal.services.config.b a() {
            return new com.moloco.sdk.internal.services.config.b();
        }

        public final com.moloco.sdk.internal.services.config.a b() {
            return (com.moloco.sdk.internal.services.config.a) b.getValue();
        }
    }

    public static final class d {
        public static final d a = new d();
        public static final Lazy b = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.service_locator.a$d$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.d.a();
            }
        });
        public static final int c = 8;

        public static final com.moloco.sdk.internal.error.crash.b a() {
            return new com.moloco.sdk.internal.error.crash.b(new com.moloco.sdk.internal.error.crash.d(CollectionsKt.listOf(new com.moloco.sdk.internal.error.crash.filters.b()), new com.moloco.sdk.internal.error.api.b(h.a.i(), com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.c.a()), MetricsRecorder.INSTANCE.withNoMediation()));
        }

        public final com.moloco.sdk.internal.error.crash.a b() {
            return (com.moloco.sdk.internal.error.crash.a) b.getValue();
        }
    }

    public static final class e {
        public static final e a = new e();
        public static final Lazy b = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.service_locator.a$e$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.e.b();
            }
        });
        public static final Lazy c = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.service_locator.a$e$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.e.f();
            }
        });
        public static final Lazy d = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.service_locator.a$e$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.e.c();
            }
        });
        public static final Lazy e = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.service_locator.a$e$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.e.n();
            }
        });
        public static final Lazy f = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.service_locator.a$e$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.e.e();
            }
        });
        public static final Lazy g = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.service_locator.a$e$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.e.d();
            }
        });
        public static final Lazy h = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.service_locator.a$e$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.e.a();
            }
        });
        public static final int i = 8;

        public static final C2805b a() {
            return new C2805b(a.a.a());
        }

        public static final C2817l b() {
            return new C2817l(a.a.a());
        }

        public static final o c() {
            return new o(a.a.a());
        }

        public static final r d() {
            return new r(a.a.a());
        }

        public static final v e() {
            return new v(a.a.a());
        }

        public static final C2814i f() {
            return new C2814i(a.a.a());
        }

        public static final G n() {
            return new G(a.a.a());
        }

        public final InterfaceC2804a g() {
            return (InterfaceC2804a) h.getValue();
        }

        public final InterfaceC2816k h() {
            return (InterfaceC2816k) b.getValue();
        }

        public final n i() {
            return (n) d.getValue();
        }

        public final q j() {
            return (q) g.getValue();
        }

        public final u k() {
            return (u) f.getValue();
        }

        public final y l() {
            return (y) c.getValue();
        }

        public final F m() {
            return (F) e.getValue();
        }
    }

    public static final class g {
        public static final g a = new g();
        public static final Lazy b = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.service_locator.a$g$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.g.d();
            }
        });
        public static final Lazy c = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.service_locator.a$g$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.g.c();
            }
        });
        public static final int d = 8;

        public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j c() {
            g gVar = a;
            l b2 = gVar.b();
            e eVar = e.a;
            u k = eVar.k();
            b bVar = b.a;
            com.moloco.sdk.internal.error.b f = bVar.f();
            i iVar = i.a;
            return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j(gVar.b(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.d(eVar.k(), bVar.f(), iVar.a()), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b(b2, k, f, iVar.a()), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.g(a.a.a(), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.k.a));
        }

        public static final l d() {
            return (l) c.a.b().a(l.class, m.a());
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i a() {
            return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i) c.getValue();
        }

        public final l b() {
            return (l) b.getValue();
        }
    }

    public static final class h {
        public static final h a = new h();
        public static final Lazy b = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.service_locator.a$h$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.h.m();
            }
        });
        public static final Lazy c = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.service_locator.a$h$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.h.l();
            }
        });
        public static final Lazy d = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.service_locator.a$h$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.h.b();
            }
        });
        public static final Lazy e = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.service_locator.a$h$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.h.n();
            }
        });
        public static final Lazy f = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.service_locator.a$h$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.h.a();
            }
        });
        public static final int g = 8;

        public static final ActivityManager a() {
            Object systemService = a.a.a().getSystemService("activity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            return (ActivityManager) systemService;
        }

        public static final C2810e b() {
            return new C2810e(a.a.a());
        }

        public static final com.moloco.sdk.internal.services.proto.b l() {
            return new com.moloco.sdk.internal.services.proto.b();
        }

        public static final K m() {
            return new K();
        }

        public static final B n() {
            return new B();
        }

        public final ActivityManager c() {
            return (ActivityManager) f.getValue();
        }

        public final InterfaceC2809d d() {
            return (InterfaceC2809d) d.getValue();
        }

        public final s e() {
            return new t(f(), k.a.b());
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r f() {
            return new C2838s(a.a.a());
        }

        public final Q g() {
            return new w();
        }

        public final com.moloco.sdk.internal.services.proto.a h() {
            return (com.moloco.sdk.internal.services.proto.a) c.getValue();
        }

        public final J i() {
            return (J) b.getValue();
        }

        public final A j() {
            return (A) e.getValue();
        }

        public final Q k() {
            return new S();
        }
    }

    public static final class i {
        public static final i a = new i();
        public static final Lazy b = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.service_locator.a$i$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.i.e();
            }
        });
        public static final Lazy c = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.service_locator.a$i$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.i.f();
            }
        });
        public static final Lazy d = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.service_locator.a$i$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.i.h();
            }
        });
        public static final Lazy e = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.service_locator.a$i$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.i.g();
            }
        });
        public static final int f = 8;

        public static final HttpClient e() {
            e eVar = e.a;
            return com.moloco.sdk.internal.http.a.a(eVar.h().invoke(), eVar.l().invoke());
        }

        public static final C f() {
            return new C(a.a.a(), e.a.l());
        }

        public static final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i g() {
            return com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i.a.a(a.d());
        }

        public static final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.m h() {
            return new com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.m(a.a.a());
        }

        public final HttpClient a() {
            return (HttpClient) b.getValue();
        }

        public final com.moloco.sdk.internal.services.B b() {
            return (com.moloco.sdk.internal.services.B) c.getValue();
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i c() {
            return (com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i) e.getValue();
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l d() {
            return (com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l) d.getValue();
        }
    }

    public static final class j {
        public static final j a = new j();
        public static final Lazy b = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.service_locator.a$j$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.j.a();
            }
        });
        public static final int c = 8;

        public static final D a() {
            SharedPreferences sharedPreferences = a.a.a().getSharedPreferences("moloco_sdk_preferences", 0);
            Intrinsics.checkNotNull(sharedPreferences);
            return new D(sharedPreferences);
        }

        public final com.moloco.sdk.internal.services.w b() {
            return (com.moloco.sdk.internal.services.w) b.getValue();
        }
    }

    public static final class k {
        public static final k a = new k();
        public static final Lazy b = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.service_locator.a$k$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.k.g();
            }
        });
        public static final Lazy c = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.service_locator.a$k$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.k.h();
            }
        });
        public static final Lazy d = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.service_locator.a$k$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.k.a();
            }
        });
        public static final int e = 8;

        public static final com.moloco.sdk.internal.services.events.c a() {
            return new com.moloco.sdk.internal.services.events.c();
        }

        public static final com.moloco.sdk.internal.services.usertracker.c g() {
            return new com.moloco.sdk.internal.services.usertracker.c(j.a.b());
        }

        public static final com.moloco.sdk.internal.services.usertracker.g h() {
            k kVar = a;
            return new com.moloco.sdk.internal.services.usertracker.g(kVar.e(), kVar.d());
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a b() {
            e eVar = e.a;
            InterfaceC2816k h = eVar.h();
            com.moloco.sdk.internal.services.B b2 = i.a.b();
            y l = eVar.l();
            F m = eVar.m();
            com.moloco.sdk.internal.services.usertracker.f f = f();
            h hVar = h.a;
            return new com.moloco.sdk.internal.services.events.a(h, b2, l, m, f, hVar.d(), hVar.h(), c(), BuildConfig.SDK_VERSION_NAME);
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c c() {
            return (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c) d.getValue();
        }

        public final com.moloco.sdk.internal.services.usertracker.b d() {
            return (com.moloco.sdk.internal.services.usertracker.b) b.getValue();
        }

        public final com.moloco.sdk.internal.services.usertracker.e e() {
            return new com.moloco.sdk.internal.services.usertracker.a();
        }

        public final com.moloco.sdk.internal.services.usertracker.f f() {
            return (com.moloco.sdk.internal.services.usertracker.f) c.getValue();
        }
    }

    public final Context a() {
        return com.moloco.sdk.internal.android_context.b.a(null, 1, null);
    }

    public static final class f {
        public static volatile InterfaceC2784a b;
        public static final f a = new f();
        public static final Lazy c = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.service_locator.a$f$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.f.f();
            }
        });
        public static final Lazy d = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.service_locator.a$f$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.f.d();
            }
        });
        public static final Lazy e = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.service_locator.a$f$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.f.e();
            }
        });
        public static final int f = 8;

        public static final com.moloco.sdk.internal.services.init.e d() {
            e eVar = e.a;
            return new com.moloco.sdk.internal.services.init.e(eVar.l(), eVar.h(), k.a.f(), BuildConfig.SDK_VERSION_NAME, BuildConfig.MOLOCO_ENDPOINT_INIT_CONFIG, 3000L, i.a.a());
        }

        public static final com.moloco.sdk.internal.services.init.l e() {
            com.moloco.sdk.internal.services.init.d a2 = a.a();
            g.a aVar = com.moloco.sdk.internal.services.init.g.a;
            SharedPreferences sharedPreferences = a.a.a().getSharedPreferences("moloco_sdk_init_cache", 0);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
            return new com.moloco.sdk.internal.services.init.l(a2, aVar.a(sharedPreferences), CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getIo().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null))));
        }

        public static final com.moloco.sdk.internal.services.init.o f() {
            return new com.moloco.sdk.internal.services.init.o(BuildConfig.MOLOCO_ENDPOINT_INIT_TRACKING, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.c.a());
        }

        public final InterfaceC2784a a(Init.SDKInitResponse initResponse) {
            InterfaceC2784a interfaceC2784a;
            Intrinsics.checkNotNullParameter(initResponse, "initResponse");
            InterfaceC2784a interfaceC2784a2 = b;
            if (interfaceC2784a2 != null) {
                return interfaceC2784a2;
            }
            synchronized (this) {
                interfaceC2784a = b;
                if (interfaceC2784a == null) {
                    interfaceC2784a = new C2785b(initResponse, k.a.b(), h.a.e());
                    b = interfaceC2784a;
                }
            }
            return interfaceC2784a;
        }

        public final com.moloco.sdk.internal.services.init.k b() {
            return (com.moloco.sdk.internal.services.init.k) e.getValue();
        }

        public final com.moloco.sdk.internal.services.init.n c() {
            return (com.moloco.sdk.internal.services.init.n) c.getValue();
        }

        public final com.moloco.sdk.internal.services.init.d a() {
            return (com.moloco.sdk.internal.services.init.d) d.getValue();
        }
    }
}
