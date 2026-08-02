package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.ReferenceHolder;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceProvider;
import io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier;
import io.appmetrica.analytics.coreutils.internal.system.SystemPropertiesHelper;
import io.appmetrica.analytics.locationapi.internal.LocationClient;
import java.io.File;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.na, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0353na {
    public static volatile C0353na I;
    public volatile M9 C;
    public C0637yk H;

    /* renamed from: a, reason: collision with root package name */
    public final Context f14321a;

    /* renamed from: b, reason: collision with root package name */
    public volatile C0309lg f14322b;

    /* renamed from: c, reason: collision with root package name */
    public volatile E6 f14323c;

    /* renamed from: e, reason: collision with root package name */
    public volatile R2 f14325e;

    /* renamed from: f, reason: collision with root package name */
    public volatile C0337mj f14326f;

    /* renamed from: g, reason: collision with root package name */
    public volatile U f14327g;

    /* renamed from: h, reason: collision with root package name */
    public volatile C0012a2 f14328h;

    /* renamed from: i, reason: collision with root package name */
    public volatile PlatformIdentifiers f14329i;
    public volatile C0507tf j;

    /* renamed from: k, reason: collision with root package name */
    public volatile C0645z3 f14330k;

    /* renamed from: l, reason: collision with root package name */
    public volatile Ze f14331l;

    /* renamed from: m, reason: collision with root package name */
    public volatile Ao f14332m;

    /* renamed from: n, reason: collision with root package name */
    public volatile C0132ej f14333n;

    /* renamed from: o, reason: collision with root package name */
    public volatile Fb f14334o;

    /* renamed from: p, reason: collision with root package name */
    public Al f14335p;

    /* renamed from: r, reason: collision with root package name */
    public volatile C0612xk f14336r;

    /* renamed from: w, reason: collision with root package name */
    public volatile Kb f14341w;

    /* renamed from: x, reason: collision with root package name */
    public volatile C0391on f14342x;

    /* renamed from: y, reason: collision with root package name */
    public volatile C0513tl f14343y;

    /* renamed from: z, reason: collision with root package name */
    public volatile C0555vd f14344z;
    public final C0328ma q = new C0328ma();

    /* renamed from: s, reason: collision with root package name */
    public final Sc f14337s = new Sc();

    /* renamed from: t, reason: collision with root package name */
    public final Uc f14338t = new Uc();

    /* renamed from: u, reason: collision with root package name */
    public final C0213hm f14339u = new C0213hm();

    /* renamed from: v, reason: collision with root package name */
    public final C0133ek f14340v = new C0133ek();
    public final Od A = new Od();
    public final UtilityServiceProvider B = new UtilityServiceProvider();
    public final C0338mk D = new C0338mk();
    public final ReferenceHolder E = new ReferenceHolder();
    public final C0587wk F = new C0587wk();
    public final C0241j G = new C0241j();

    /* renamed from: d, reason: collision with root package name */
    public final C0288kk f14324d = new C0288kk();

    public C0353na(Context context) {
        this.f14321a = context;
    }

    public static void a(Context context) {
        if (I == null) {
            synchronized (C0353na.class) {
                try {
                    if (I == null) {
                        I = new C0353na(context.getApplicationContext());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static C0353na k() {
        return I;
    }

    public final C0213hm A() {
        return this.f14339u;
    }

    public final C0637yk B() {
        C0637yk c0637yk;
        File file;
        C0637yk c0637yk2 = this.H;
        if (c0637yk2 != null) {
            return c0637yk2;
        }
        synchronized (this) {
            c0637yk = this.H;
            if (c0637yk == null) {
                Context context = this.f14321a;
                String readSystemProperty = SystemPropertiesHelper.readSystemProperty("ro.yndx.metrica.db.dir");
                String readSystemProperty2 = SystemPropertiesHelper.readSystemProperty("debug.yndx.iaa.db.dir");
                if (StringsKt.H(readSystemProperty)) {
                    readSystemProperty = readSystemProperty2;
                }
                if (!StringsKt.H(readSystemProperty)) {
                    file = new File(readSystemProperty, context.getPackageName());
                    try {
                        file.mkdirs();
                    } catch (Exception unused) {
                    }
                    c0637yk = new C0637yk(file);
                    this.H = c0637yk;
                }
                file = null;
                c0637yk = new C0637yk(file);
                this.H = c0637yk;
            }
        }
        return c0637yk;
    }

    public final C0391on C() {
        C0391on c0391on;
        C0391on c0391on2 = this.f14342x;
        if (c0391on2 != null) {
            return c0391on2;
        }
        synchronized (this) {
            try {
                c0391on = this.f14342x;
                if (c0391on == null) {
                    c0391on = new C0391on(this.f14321a);
                    this.f14342x = c0391on;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c0391on;
    }

    public final synchronized Ao D() {
        try {
            if (this.f14332m == null) {
                this.f14332m = new Ao(this.f14321a);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f14332m;
    }

    public final void E() {
        if (this.j == null) {
            synchronized (this) {
                try {
                    if (this.j == null) {
                        Qm a7 = Pm.a(C0103df.class);
                        Context context = this.f14321a;
                        Rm rm = (Rm) a7;
                        ProtobufStateStorage<Object> a10 = rm.a(context, rm.a(context));
                        C0103df c0103df = (C0103df) a10.read();
                        this.j = new C0507tf(this.f14321a, a10, new C0283kf(), new C0051bf(c0103df), new C0482sf(), new C0257jf(this.f14321a), new C0383of(k().y()), new C0128ef(), c0103df, "[PreloadInfoStorage]");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final C0241j b() {
        return this.G;
    }

    public final U c() {
        U u10;
        U u11 = this.f14327g;
        if (u11 != null) {
            return u11;
        }
        synchronized (this) {
            try {
                u10 = this.f14327g;
                if (u10 == null) {
                    u10 = new U(this.f14321a, this.f14324d.a(), this.f14339u.b());
                    this.f14339u.a(u10);
                    this.f14327g = u10;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return u10;
    }

    public final C0012a2 d() {
        C0012a2 c0012a2;
        C0012a2 c0012a22 = this.f14328h;
        if (c0012a22 != null) {
            return c0012a22;
        }
        synchronized (this) {
            try {
                c0012a2 = this.f14328h;
                if (c0012a2 == null) {
                    c0012a2 = new C0012a2(this.f14321a, AbstractC0038b2.a());
                    this.f14328h = c0012a2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c0012a2;
    }

    public final C0167g2 e() {
        return l().f12221b;
    }

    public final C0645z3 f() {
        if (this.f14330k == null) {
            synchronized (this) {
                try {
                    if (this.f14330k == null) {
                        Qm a7 = Pm.a(C0470s3.class);
                        Context context = this.f14321a;
                        Rm rm = (Rm) a7;
                        ProtobufStateStorage<Object> a10 = rm.a(context, rm.a(context));
                        this.f14330k = new C0645z3(this.f14321a, a10, new A3(), new C0346n3(), new D3(), new Ti(this.f14321a), new B3(y()), new C0371o3(), (C0470s3) a10.read(), "[ClidsInfoStorage]");
                    }
                } finally {
                }
            }
        }
        return this.f14330k;
    }

    public final Context g() {
        return this.f14321a;
    }

    public final E6 h() {
        if (this.f14323c == null) {
            synchronized (this) {
                try {
                    if (this.f14323c == null) {
                        this.f14323c = new E6(new D6(y()));
                    }
                } finally {
                }
            }
        }
        return this.f14323c;
    }

    public final M9 i() {
        M9 m92;
        M9 m93 = this.C;
        if (m93 != null) {
            return m93;
        }
        synchronized (this) {
            try {
                m92 = this.C;
                if (m92 == null) {
                    m92 = new M9(this.f14321a);
                    this.C = m92;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return m92;
    }

    public final PermissionExtractor j() {
        C0513tl c0513tl = this.f14343y;
        if (c0513tl != null) {
            return c0513tl;
        }
        synchronized (this) {
            try {
                C0513tl c0513tl2 = this.f14343y;
                if (c0513tl2 != null) {
                    return c0513tl2;
                }
                C0513tl c0513tl3 = new C0513tl(p().f14932c.getAskForPermissionStrategy());
                this.f14343y = c0513tl3;
                return c0513tl3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Fb l() {
        Fb fb2;
        Fb fb3 = this.f14334o;
        if (fb3 != null) {
            return fb3;
        }
        synchronized (this) {
            try {
                fb2 = this.f14334o;
                if (fb2 == null) {
                    fb2 = new Fb(new O2(this.f14321a, this.f14324d.a()), new C0167g2());
                    this.f14334o = fb2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fb2;
    }

    public final Kb m() {
        Kb kb2;
        Kb kb3 = this.f14341w;
        if (kb3 != null) {
            return kb3;
        }
        synchronized (this) {
            try {
                kb2 = this.f14341w;
                if (kb2 == null) {
                    Context context = this.f14321a;
                    LocationClient locationClient = (LocationClient) ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor("io.appmetrica.analytics.location.internal.LocationClientImpl", LocationClient.class);
                    kb2 = locationClient == null ? new Mb() : new Lb(context, new Sb(), locationClient);
                    this.f14341w = kb2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return kb2;
    }

    public final Kb n() {
        return m();
    }

    public final Uc o() {
        return this.f14338t;
    }

    public final C0612xk p() {
        C0612xk c0612xk;
        C0612xk c0612xk2 = this.f14336r;
        if (c0612xk2 != null) {
            return c0612xk2;
        }
        synchronized (this) {
            try {
                c0612xk = this.f14336r;
                if (c0612xk == null) {
                    c0612xk = new C0612xk();
                    this.f14336r = c0612xk;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c0612xk;
    }

    public final C0555vd q() {
        C0555vd c0555vd;
        C0555vd c0555vd2 = this.f14344z;
        if (c0555vd2 != null) {
            return c0555vd2;
        }
        synchronized (this) {
            try {
                c0555vd = this.f14344z;
                if (c0555vd == null) {
                    c0555vd = new C0555vd(this.f14321a, new no());
                    this.f14344z = c0555vd;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c0555vd;
    }

    public final Od r() {
        return this.A;
    }

    public final PlatformIdentifiers s() {
        PlatformIdentifiers platformIdentifiers;
        PlatformIdentifiers platformIdentifiers2 = this.f14329i;
        if (platformIdentifiers2 != null) {
            return platformIdentifiers2;
        }
        synchronized (this) {
            try {
                platformIdentifiers = this.f14329i;
                if (platformIdentifiers == null) {
                    platformIdentifiers = new PlatformIdentifiers(c(), d());
                    this.f14329i = platformIdentifiers;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return platformIdentifiers;
    }

    public final C0507tf t() {
        E();
        return this.j;
    }

    public final C0309lg u() {
        if (this.f14322b == null) {
            synchronized (this) {
                try {
                    if (this.f14322b == null) {
                        this.f14322b = new C0309lg(this.f14321a, I.D().f12014c);
                    }
                } finally {
                }
            }
        }
        return this.f14322b;
    }

    public final C0132ej v() {
        C0132ej c0132ej;
        C0132ej c0132ej2 = this.f14333n;
        if (c0132ej2 != null) {
            return c0132ej2;
        }
        synchronized (this) {
            try {
                c0132ej = this.f14333n;
                if (c0132ej == null) {
                    c0132ej = new C0132ej(this.f14321a);
                    this.f14333n = c0132ej;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c0132ej;
    }

    public final C0288kk w() {
        return this.f14324d;
    }

    public final C0587wk x() {
        return this.F;
    }

    public final Ze y() {
        if (this.f14331l == null) {
            synchronized (this) {
                try {
                    if (this.f14331l == null) {
                        this.f14331l = new Ze(B().d(this.f14321a));
                    }
                } finally {
                }
            }
        }
        return this.f14331l;
    }

    public final synchronized K2 z() {
        try {
            if (this.f14335p == null) {
                Al al = new Al(this.f14321a);
                this.f14335p = al;
                this.f14339u.a(al);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f14335p;
    }

    public final WaitForActivationDelayBarrier a() {
        return this.B.getActivationBarrier();
    }
}
