package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class X4 implements Pa, Ea, InterfaceC0259jh {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13142a;

    /* renamed from: b, reason: collision with root package name */
    public final Q4 f13143b;

    /* renamed from: c, reason: collision with root package name */
    public final We f13144c;

    /* renamed from: d, reason: collision with root package name */
    public final Ze f13145d;

    /* renamed from: e, reason: collision with root package name */
    public final L6 f13146e;

    /* renamed from: f, reason: collision with root package name */
    public final C0510ti f13147f;

    /* renamed from: g, reason: collision with root package name */
    public final X8 f13148g;

    /* renamed from: h, reason: collision with root package name */
    public final C0242j0 f13149h;

    /* renamed from: i, reason: collision with root package name */
    public final C0268k0 f13150i;
    public final Rk j;

    /* renamed from: k, reason: collision with root package name */
    public final Qg f13151k;

    /* renamed from: l, reason: collision with root package name */
    public final M8 f13152l;

    /* renamed from: m, reason: collision with root package name */
    public final PublicLogger f13153m;

    /* renamed from: n, reason: collision with root package name */
    public final C0277k9 f13154n;

    /* renamed from: o, reason: collision with root package name */
    public final S4 f13155o;

    /* renamed from: p, reason: collision with root package name */
    public final InterfaceC0427q9 f13156p;
    public final C0321m3 q;

    /* renamed from: r, reason: collision with root package name */
    public final TimePassedChecker f13157r;

    /* renamed from: s, reason: collision with root package name */
    public final C0507tf f13158s;

    /* renamed from: t, reason: collision with root package name */
    public final xo f13159t;

    /* renamed from: u, reason: collision with root package name */
    public final Jk f13160u;

    /* renamed from: v, reason: collision with root package name */
    public final C0395p2 f13161v;

    public X4(@NonNull Context context, @NonNull C0161fm c0161fm, @NonNull Q4 q42, @NonNull C0372o4 c0372o4, @NonNull InterfaceC0208hh interfaceC0208hh, @NonNull V4 v42) {
        this(context, q42, new C0268k0(), new TimePassedChecker(), new C0067c5(context, q42, c0372o4, v42, c0161fm, interfaceC0208hh, C0353na.k().w().c(), PackageManagerUtils.getAppVersionCodeInt(context), C0353na.k().l(), new P4()), c0372o4);
    }

    public final boolean A() {
        C0285kh c0285kh = (C0285kh) this.f13151k.a();
        return c0285kh.f14134n && this.f13157r.didTimePassSeconds(this.f13154n.f14115k, c0285kh.f14139t, "should force send permissions");
    }

    public final boolean B() {
        C0161fm c0161fm;
        C0507tf c0507tf = this.f13158s;
        c0507tf.f12749h.a(c0507tf.f12742a);
        boolean z5 = ((C0433qf) c0507tf.c()).f14516d;
        Qg qg2 = this.f13151k;
        synchronized (qg2) {
            c0161fm = qg2.f14397c.f12506a;
        }
        return !(z5 && c0161fm.q);
    }

    @Override // io.appmetrica.analytics.impl.Pa, io.appmetrica.analytics.impl.Ql
    public final void a(@NonNull Jl jl, C0161fm c0161fm) {
    }

    @Override // io.appmetrica.analytics.impl.Ea
    @NonNull
    public final Q4 b() {
        return this.f13143b;
    }

    @NonNull
    public CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.MANUAL;
    }

    public final void d() {
        C0242j0 c0242j0 = this.f13149h;
        synchronized (c0242j0) {
            c0242j0.f13989a = new Fc();
        }
        this.f13150i.a(this.f13149h.a(), this.f13144c);
    }

    public final synchronized void e() {
        ((C0273k5) this.f13156p).d();
    }

    @NonNull
    public final C0395p2 f() {
        return this.f13161v;
    }

    @NonNull
    public final C0321m3 g() {
        return this.q;
    }

    @Override // io.appmetrica.analytics.impl.Ea
    @NonNull
    public final Context getContext() {
        return this.f13142a;
    }

    @NonNull
    public final We h() {
        return this.f13144c;
    }

    @NonNull
    public final L6 i() {
        return this.f13146e;
    }

    @NonNull
    public final M8 j() {
        return this.f13152l;
    }

    @NonNull
    public final X8 k() {
        return this.f13148g;
    }

    @NonNull
    public final C0277k9 l() {
        return this.f13154n;
    }

    @NonNull
    public final InterfaceC0427q9 m() {
        return this.f13156p;
    }

    @NonNull
    public final C0285kh n() {
        return (C0285kh) this.f13151k.a();
    }

    public final String o() {
        return this.f13144c.j();
    }

    @NonNull
    public final PublicLogger p() {
        return this.f13153m;
    }

    @NonNull
    public final Ze q() {
        return this.f13145d;
    }

    @NonNull
    public final Jk r() {
        return this.f13160u;
    }

    @NonNull
    public final Rk s() {
        return this.j;
    }

    @NonNull
    public final C0161fm t() {
        C0161fm c0161fm;
        Qg qg2 = this.f13151k;
        synchronized (qg2) {
            c0161fm = qg2.f14397c.f12506a;
        }
        return c0161fm;
    }

    @NonNull
    public final xo u() {
        return this.f13159t;
    }

    public final void v() {
        C0277k9 c0277k9 = this.f13154n;
        int i5 = c0277k9.j;
        c0277k9.f14116l = i5;
        c0277k9.f14106a.a(i5).b();
    }

    public final void w() {
        int optInt;
        int libraryApiLevel = AppMetrica.getLibraryApiLevel();
        xo xoVar = this.f13159t;
        synchronized (xoVar) {
            optInt = xoVar.f14934a.a().optInt("last_migration_api_level", 0);
        }
        if (optInt < libraryApiLevel) {
            this.f13155o.getClass();
            Iterator it = kotlin.collections.t.c(new U4(this)).iterator();
            while (it.hasNext()) {
                ((T4) it.next()).a(optInt);
            }
            this.f13159t.b(libraryApiLevel);
        }
    }

    public final boolean x() {
        C0285kh c0285kh = (C0285kh) this.f13151k.a();
        return c0285kh.f14134n && c0285kh.isIdentifiersValid() && this.f13157r.didTimePassSeconds(this.f13154n.f14115k, c0285kh.f14138s, "need to check permissions");
    }

    public final boolean y() {
        C0277k9 c0277k9 = this.f13154n;
        return c0277k9.f14116l < c0277k9.j && ((C0285kh) this.f13151k.a()).f14135o && ((C0285kh) this.f13151k.a()).isIdentifiersValid();
    }

    public final void z() {
        Qg qg2 = this.f13151k;
        synchronized (qg2) {
            qg2.f14395a = null;
        }
    }

    @Override // io.appmetrica.analytics.impl.Pa
    public final void a(@NonNull P5 p52) {
        String a7 = Qf.a("Event received on service", EnumC0047bb.a(p52.f12730d), p52.getName(), p52.getValue());
        if (a7 != null) {
            this.f13153m.info(a7, new Object[0]);
        }
        String str = this.f13143b.f12771b;
        if (TextUtils.isEmpty(str) || "-1".equals(str)) {
            return;
        }
        this.f13147f.a(p52, new C0485si());
    }

    public final void b(P5 p52) {
        this.f13149h.a(p52.f12732f);
        C0217i0 a7 = this.f13149h.a();
        C0268k0 c0268k0 = this.f13150i;
        We we2 = this.f13144c;
        synchronized (c0268k0) {
            if (a7.f13915b > we2.d().f13915b) {
                we2.a(a7).b();
                this.f13153m.info("Save new app environment for %s. Value: %s", this.f13143b, a7.f13914a);
            }
        }
    }

    public X4(Context context, Q4 q42, C0268k0 c0268k0, TimePassedChecker timePassedChecker, C0067c5 c0067c5, C0372o4 c0372o4) {
        this.f13142a = context.getApplicationContext();
        this.f13143b = q42;
        this.f13150i = c0268k0;
        this.f13157r = timePassedChecker;
        xo f6 = c0067c5.f();
        this.f13159t = f6;
        this.f13158s = C0353na.k().t();
        We a7 = c0067c5.e().a();
        this.f13144c = a7;
        this.f13161v = c0067c5.a(a7);
        Qg a10 = c0067c5.a(this);
        this.f13151k = a10;
        PublicLogger a11 = c0067c5.d().a();
        this.f13153m = a11;
        this.f13145d = C0353na.k().y();
        C0242j0 a12 = c0268k0.a(q42, a11, a7);
        this.f13149h = a12;
        this.f13152l = c0067c5.a();
        L6 b10 = c0067c5.b(this);
        this.f13146e = b10;
        C0560vi d10 = c0067c5.d(this);
        this.f13155o = C0067c5.b();
        w();
        Rk a13 = C0067c5.a(this, f6, new W4(this));
        this.j = a13;
        a11.info("Read app environment for component %s. Value: %s", q42.toString(), a12.a().f13914a);
        Jk c2 = c0067c5.c();
        this.f13160u = c2;
        this.f13154n = c0067c5.a(a7, f6, a13, b10, a12, c2, d10);
        X8 c8 = C0067c5.c(this);
        this.f13148g = c8;
        this.f13147f = C0067c5.a(this, c8);
        this.q = c0067c5.b(a7);
        this.f13156p = c0067c5.a(d10, b10, a10, c0372o4, q42, a7);
        b10.d();
    }

    @Override // io.appmetrica.analytics.impl.Pa, io.appmetrica.analytics.impl.Ea
    public synchronized void a(@NonNull C0372o4 c0372o4) {
        long j;
        try {
            this.f13151k.a(c0372o4);
            boolean z5 = false;
            if (Boolean.TRUE.equals(c0372o4.f14388h)) {
                this.f13153m.setEnabled(true);
            } else {
                if (Boolean.FALSE.equals(c0372o4.f14388h)) {
                    this.f13153m.setEnabled(false);
                }
            }
            C0395p2 c0395p2 = this.f13161v;
            Set<String> set = c0372o4.f14394o;
            long currentTimeMillis = c0395p2.f14453d.currentTimeMillis();
            boolean z7 = false;
            for (String str : set) {
                Long l6 = (Long) c0395p2.f14454e.get(str);
                if (l6 != null) {
                    j = l6.longValue();
                } else {
                    j = -1;
                    z7 = true;
                }
                if (currentTimeMillis - j > c0395p2.f14451b) {
                    c0395p2.f14454e.put(str, Long.valueOf(currentTimeMillis));
                    z5 = true;
                }
            }
            if (z5) {
                c0395p2.a(c0395p2.f14454e);
                c0395p2.f14450a.a(c0395p2.f14454e);
            }
            if (z7) {
                this.f13151k.e();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void C() {
    }

    @Override // io.appmetrica.analytics.impl.Pa, io.appmetrica.analytics.impl.Ql
    public final synchronized void a(@NonNull C0161fm c0161fm) {
        this.f13151k.a(c0161fm);
        ((C0273k5) this.f13156p).e();
    }

    public final void a(String str) {
        this.f13144c.j(str).b();
    }
}
