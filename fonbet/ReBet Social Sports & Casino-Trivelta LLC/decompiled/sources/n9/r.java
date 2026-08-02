package n9;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import d9.C4040c;
import h9.g;
import j9.C5102a;
import j9.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import k9.AbstractC5213a;
import o9.AbstractC5849k;
import o9.InterfaceC5841c;
import o9.InterfaceC5842d;
import p9.C6057a;
import p9.InterfaceC6058b;
import q9.InterfaceC6129a;

/* loaded from: classes2.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    public final Context f57125a;

    /* renamed from: b, reason: collision with root package name */
    public final h9.e f57126b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC5842d f57127c;

    /* renamed from: d, reason: collision with root package name */
    public final x f57128d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f57129e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC6058b f57130f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC6129a f57131g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC6129a f57132h;

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC5841c f57133i;

    public r(Context context, h9.e eVar, InterfaceC5842d interfaceC5842d, x xVar, Executor executor, InterfaceC6058b interfaceC6058b, InterfaceC6129a interfaceC6129a, InterfaceC6129a interfaceC6129a2, InterfaceC5841c interfaceC5841c) {
        this.f57125a = context;
        this.f57126b = eVar;
        this.f57127c = interfaceC5842d;
        this.f57128d = xVar;
        this.f57129e = executor;
        this.f57130f = interfaceC6058b;
        this.f57131g = interfaceC6129a;
        this.f57132h = interfaceC6129a2;
        this.f57133i = interfaceC5841c;
    }

    public static /* synthetic */ Object b(r rVar, Iterable iterable, g9.o oVar, long j10) {
        rVar.f57127c.F0(iterable);
        rVar.f57127c.z1(oVar, rVar.f57131g.a() + j10);
        return null;
    }

    public static /* synthetic */ Object c(r rVar) {
        rVar.f57133i.k();
        return null;
    }

    public static /* synthetic */ Object e(r rVar, Iterable iterable) {
        rVar.f57127c.w(iterable);
        return null;
    }

    public static /* synthetic */ Object f(r rVar, g9.o oVar, int i10) {
        rVar.f57128d.b(oVar, i10 + 1);
        return null;
    }

    public static /* synthetic */ Object g(r rVar, g9.o oVar, long j10) {
        rVar.f57127c.z1(oVar, rVar.f57131g.a() + j10);
        return null;
    }

    public static /* synthetic */ Object h(r rVar, Map map) {
        rVar.getClass();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            rVar.f57133i.r(((Integer) r0.getValue()).intValue(), c.b.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
        }
        return null;
    }

    public static /* synthetic */ void i(final r rVar, final g9.o oVar, final int i10, Runnable runnable) {
        rVar.getClass();
        try {
            try {
                InterfaceC6058b interfaceC6058b = rVar.f57130f;
                final InterfaceC5842d interfaceC5842d = rVar.f57127c;
                Objects.requireNonNull(interfaceC5842d);
                interfaceC6058b.d(new InterfaceC6058b.a() { // from class: n9.i
                    @Override // p9.InterfaceC6058b.a
                    public final Object execute() {
                        return Integer.valueOf(InterfaceC5842d.this.f());
                    }
                });
                if (rVar.k()) {
                    rVar.l(oVar, i10);
                } else {
                    rVar.f57130f.d(new InterfaceC6058b.a() { // from class: n9.j
                        @Override // p9.InterfaceC6058b.a
                        public final Object execute() {
                            return r.f(r.this, oVar, i10);
                        }
                    });
                }
                runnable.run();
            } catch (C6057a unused) {
                rVar.f57128d.b(oVar, i10 + 1);
                runnable.run();
            }
        } catch (Throwable th2) {
            runnable.run();
            throw th2;
        }
    }

    public g9.i j(h9.m mVar) {
        InterfaceC6058b interfaceC6058b = this.f57130f;
        final InterfaceC5841c interfaceC5841c = this.f57133i;
        Objects.requireNonNull(interfaceC5841c);
        return mVar.a(g9.i.a().i(this.f57131g.a()).k(this.f57132h.a()).j("GDT_CLIENT_METRICS").h(new g9.h(C4040c.b("proto"), ((C5102a) interfaceC6058b.d(new InterfaceC6058b.a() { // from class: n9.h
            @Override // p9.InterfaceC6058b.a
            public final Object execute() {
                return InterfaceC5841c.this.B();
            }
        })).f())).d());
    }

    public boolean k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f57125a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public h9.g l(final g9.o oVar, int i10) {
        h9.g b10;
        h9.m mVar = this.f57126b.get(oVar.b());
        h9.g e10 = h9.g.e(0L);
        final long j10 = 0;
        while (((Boolean) this.f57130f.d(new InterfaceC6058b.a() { // from class: n9.k
            @Override // p9.InterfaceC6058b.a
            public final Object execute() {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r.this.f57127c.K(oVar));
                return valueOf;
            }
        })).booleanValue()) {
            final Iterable iterable = (Iterable) this.f57130f.d(new InterfaceC6058b.a() { // from class: n9.l
                @Override // p9.InterfaceC6058b.a
                public final Object execute() {
                    Iterable H02;
                    H02 = r.this.f57127c.H0(oVar);
                    return H02;
                }
            });
            if (!iterable.iterator().hasNext()) {
                return e10;
            }
            if (mVar == null) {
                AbstractC5213a.b("Uploader", "Unknown backend for %s, deleting event batch for it...", oVar);
                b10 = h9.g.a();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AbstractC5849k) it.next()).b());
                }
                if (oVar.e()) {
                    arrayList.add(j(mVar));
                }
                b10 = mVar.b(h9.f.a().b(arrayList).c(oVar.c()).a());
            }
            e10 = b10;
            if (e10.c() == g.a.TRANSIENT_ERROR) {
                final g9.o oVar2 = oVar;
                this.f57130f.d(new InterfaceC6058b.a() { // from class: n9.m
                    @Override // p9.InterfaceC6058b.a
                    public final Object execute() {
                        return r.b(r.this, iterable, oVar2, j10);
                    }
                });
                this.f57128d.a(oVar2, i10 + 1, true);
                return e10;
            }
            g9.o oVar3 = oVar;
            this.f57130f.d(new InterfaceC6058b.a() { // from class: n9.n
                @Override // p9.InterfaceC6058b.a
                public final Object execute() {
                    return r.e(r.this, iterable);
                }
            });
            if (e10.c() == g.a.OK) {
                long max = Math.max(j10, e10.b());
                if (oVar3.e()) {
                    this.f57130f.d(new InterfaceC6058b.a() { // from class: n9.o
                        @Override // p9.InterfaceC6058b.a
                        public final Object execute() {
                            return r.c(r.this);
                        }
                    });
                }
                j10 = max;
            } else if (e10.c() == g.a.INVALID_PAYLOAD) {
                final HashMap hashMap = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String j11 = ((AbstractC5849k) it2.next()).b().j();
                    if (hashMap.containsKey(j11)) {
                        hashMap.put(j11, Integer.valueOf(((Integer) hashMap.get(j11)).intValue() + 1));
                    } else {
                        hashMap.put(j11, 1);
                    }
                }
                this.f57130f.d(new InterfaceC6058b.a() { // from class: n9.p
                    @Override // p9.InterfaceC6058b.a
                    public final Object execute() {
                        return r.h(r.this, hashMap);
                    }
                });
            }
            oVar = oVar3;
        }
        final g9.o oVar4 = oVar;
        this.f57130f.d(new InterfaceC6058b.a() { // from class: n9.q
            @Override // p9.InterfaceC6058b.a
            public final Object execute() {
                return r.g(r.this, oVar4, j10);
            }
        });
        return e10;
    }

    public void m(final g9.o oVar, final int i10, final Runnable runnable) {
        this.f57129e.execute(new Runnable() { // from class: n9.g
            @Override // java.lang.Runnable
            public final void run() {
                r.i(r.this, oVar, i10, runnable);
            }
        });
    }
}
