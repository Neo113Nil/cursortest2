package L4;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.d;
import com.bumptech.glide.load.engine.k;
import com.bumptech.glide.load.engine.q;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.util.l;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import lb.C5444x;

/* loaded from: classes2.dex */
public final class j implements d, M4.i, i {

    /* renamed from: E, reason: collision with root package name */
    public static final boolean f7016E = Log.isLoggable("GlideRequest", 2);

    /* renamed from: A, reason: collision with root package name */
    public int f7017A;

    /* renamed from: B, reason: collision with root package name */
    public int f7018B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f7019C;

    /* renamed from: D, reason: collision with root package name */
    public RuntimeException f7020D;

    /* renamed from: a, reason: collision with root package name */
    public int f7021a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7022b;

    /* renamed from: c, reason: collision with root package name */
    public final P4.c f7023c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f7024d;

    /* renamed from: e, reason: collision with root package name */
    public final g f7025e;

    /* renamed from: f, reason: collision with root package name */
    public final e f7026f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f7027g;

    /* renamed from: h, reason: collision with root package name */
    public final com.bumptech.glide.e f7028h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f7029i;

    /* renamed from: j, reason: collision with root package name */
    public final Class f7030j;

    /* renamed from: k, reason: collision with root package name */
    public final L4.a f7031k;

    /* renamed from: l, reason: collision with root package name */
    public final int f7032l;

    /* renamed from: m, reason: collision with root package name */
    public final int f7033m;

    /* renamed from: n, reason: collision with root package name */
    public final com.bumptech.glide.h f7034n;

    /* renamed from: o, reason: collision with root package name */
    public final M4.j f7035o;

    /* renamed from: p, reason: collision with root package name */
    public final List f7036p;

    /* renamed from: q, reason: collision with root package name */
    public final N4.e f7037q;

    /* renamed from: r, reason: collision with root package name */
    public final Executor f7038r;

    /* renamed from: s, reason: collision with root package name */
    public v f7039s;

    /* renamed from: t, reason: collision with root package name */
    public k.d f7040t;

    /* renamed from: u, reason: collision with root package name */
    public long f7041u;

    /* renamed from: v, reason: collision with root package name */
    public volatile com.bumptech.glide.load.engine.k f7042v;

    /* renamed from: w, reason: collision with root package name */
    public a f7043w;

    /* renamed from: x, reason: collision with root package name */
    public Drawable f7044x;

    /* renamed from: y, reason: collision with root package name */
    public Drawable f7045y;

    /* renamed from: z, reason: collision with root package name */
    public Drawable f7046z;

    public enum a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    public j(Context context, com.bumptech.glide.e eVar, Object obj, Object obj2, Class cls, L4.a aVar, int i10, int i11, com.bumptech.glide.h hVar, M4.j jVar, g gVar, List list, e eVar2, com.bumptech.glide.load.engine.k kVar, N4.e eVar3, Executor executor) {
        this.f7022b = f7016E ? String.valueOf(super.hashCode()) : null;
        this.f7023c = P4.c.a();
        this.f7024d = obj;
        this.f7027g = context;
        this.f7028h = eVar;
        this.f7029i = obj2;
        this.f7030j = cls;
        this.f7031k = aVar;
        this.f7032l = i10;
        this.f7033m = i11;
        this.f7034n = hVar;
        this.f7035o = jVar;
        this.f7025e = gVar;
        this.f7036p = list;
        this.f7026f = eVar2;
        this.f7042v = kVar;
        this.f7037q = eVar3;
        this.f7038r = executor;
        this.f7043w = a.PENDING;
        if (this.f7020D == null && eVar.g().a(d.c.class)) {
            this.f7020D = new RuntimeException("Glide request origin trace");
        }
    }

    public static int u(int i10, float f10) {
        return i10 == Integer.MIN_VALUE ? i10 : Math.round(f10 * i10);
    }

    public static j x(Context context, com.bumptech.glide.e eVar, Object obj, Object obj2, Class cls, L4.a aVar, int i10, int i11, com.bumptech.glide.h hVar, M4.j jVar, g gVar, List list, e eVar2, com.bumptech.glide.load.engine.k kVar, N4.e eVar3, Executor executor) {
        return new j(context, eVar, obj, obj2, cls, aVar, i10, i11, hVar, jVar, gVar, list, eVar2, kVar, eVar3, executor);
    }

    public final void A() {
        if (k()) {
            Drawable p10 = this.f7029i == null ? p() : null;
            if (p10 == null) {
                p10 = o();
            }
            if (p10 == null) {
                p10 = q();
            }
            this.f7035o.n(p10);
        }
    }

    @Override // L4.d
    public boolean a() {
        boolean z10;
        synchronized (this.f7024d) {
            z10 = this.f7043w == a.COMPLETE;
        }
        return z10;
    }

    @Override // L4.i
    public void b(v vVar, com.bumptech.glide.load.a aVar, boolean z10) {
        this.f7023c.c();
        v vVar2 = null;
        try {
            synchronized (this.f7024d) {
                try {
                    this.f7040t = null;
                    if (vVar == null) {
                        c(new q("Expected to receive a Resource<R> with an object of " + this.f7030j + " inside, but instead got null."));
                        return;
                    }
                    Object obj = vVar.get();
                    try {
                        if (obj != null && this.f7030j.isAssignableFrom(obj.getClass())) {
                            if (l()) {
                                z(vVar, obj, aVar, z10);
                                return;
                            }
                            this.f7039s = null;
                            this.f7043w = a.COMPLETE;
                            P4.b.f("GlideRequest", this.f7021a);
                            this.f7042v.l(vVar);
                        }
                        this.f7039s = null;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Expected to receive an object of ");
                        sb2.append(this.f7030j);
                        sb2.append(" but instead got ");
                        sb2.append(obj != null ? obj.getClass() : "");
                        sb2.append("{");
                        sb2.append(obj);
                        sb2.append("} inside Resource{");
                        sb2.append(vVar);
                        sb2.append("}.");
                        sb2.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                        c(new q(sb2.toString()));
                        this.f7042v.l(vVar);
                    } catch (Throwable th2) {
                        vVar2 = vVar;
                        th = th2;
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            if (vVar2 != null) {
                this.f7042v.l(vVar2);
            }
            throw th4;
        }
    }

    @Override // L4.i
    public void c(q qVar) {
        y(qVar, 5);
    }

    @Override // L4.d
    public void clear() {
        synchronized (this.f7024d) {
            try {
                g();
                this.f7023c.c();
                a aVar = this.f7043w;
                a aVar2 = a.CLEARED;
                if (aVar == aVar2) {
                    return;
                }
                m();
                v vVar = this.f7039s;
                if (vVar != null) {
                    this.f7039s = null;
                } else {
                    vVar = null;
                }
                if (j()) {
                    this.f7035o.j(q());
                }
                P4.b.f("GlideRequest", this.f7021a);
                this.f7043w = aVar2;
                if (vVar != null) {
                    this.f7042v.l(vVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // M4.i
    public void d(int i10, int i11) {
        j jVar = this;
        jVar.f7023c.c();
        Object obj = jVar.f7024d;
        synchronized (obj) {
            try {
                try {
                    boolean z10 = f7016E;
                    if (z10) {
                        jVar.t("Got onSizeReady in " + com.bumptech.glide.util.g.a(jVar.f7041u));
                    }
                    if (jVar.f7043w == a.WAITING_FOR_SIZE) {
                        a aVar = a.RUNNING;
                        jVar.f7043w = aVar;
                        float w10 = jVar.f7031k.w();
                        jVar.f7017A = u(i10, w10);
                        jVar.f7018B = u(i11, w10);
                        if (z10) {
                            jVar.t("finished setup for calling load in " + com.bumptech.glide.util.g.a(jVar.f7041u));
                        }
                        try {
                            com.bumptech.glide.load.engine.k kVar = jVar.f7042v;
                            com.bumptech.glide.e eVar = jVar.f7028h;
                            try {
                                Object obj2 = jVar.f7029i;
                                com.bumptech.glide.load.g v10 = jVar.f7031k.v();
                                try {
                                    int i12 = jVar.f7017A;
                                    int i13 = jVar.f7018B;
                                    Class u10 = jVar.f7031k.u();
                                    Class cls = jVar.f7030j;
                                    try {
                                        com.bumptech.glide.h hVar = jVar.f7034n;
                                        com.bumptech.glide.load.engine.j i14 = jVar.f7031k.i();
                                        Map y10 = jVar.f7031k.y();
                                        boolean J10 = jVar.f7031k.J();
                                        boolean F10 = jVar.f7031k.F();
                                        com.bumptech.glide.load.j o10 = jVar.f7031k.o();
                                        boolean D10 = jVar.f7031k.D();
                                        boolean A10 = jVar.f7031k.A();
                                        boolean z11 = jVar.f7031k.z();
                                        boolean n10 = jVar.f7031k.n();
                                        Executor executor = jVar.f7038r;
                                        jVar = obj;
                                        try {
                                            jVar.f7040t = kVar.g(eVar, obj2, v10, i12, i13, u10, cls, hVar, i14, y10, J10, F10, o10, D10, A10, z11, n10, jVar, executor);
                                            if (jVar.f7043w != aVar) {
                                                jVar.f7040t = null;
                                            }
                                            if (z10) {
                                                jVar.t("finished onSizeReady in " + com.bumptech.glide.util.g.a(jVar.f7041u));
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            throw th;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        jVar = obj;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    jVar = obj;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                jVar = obj;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            jVar = obj;
                        }
                    }
                } catch (Throwable th7) {
                    th = th7;
                    jVar = obj;
                }
            } catch (Throwable th8) {
                th = th8;
            }
        }
    }

    @Override // L4.d
    public boolean e() {
        boolean z10;
        synchronized (this.f7024d) {
            z10 = this.f7043w == a.CLEARED;
        }
        return z10;
    }

    @Override // L4.i
    public Object f() {
        this.f7023c.c();
        return this.f7024d;
    }

    public final void g() {
        if (this.f7019C) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    @Override // L4.d
    public void h() {
        synchronized (this.f7024d) {
            try {
                g();
                this.f7023c.c();
                this.f7041u = com.bumptech.glide.util.g.b();
                Object obj = this.f7029i;
                if (obj == null) {
                    if (l.v(this.f7032l, this.f7033m)) {
                        this.f7017A = this.f7032l;
                        this.f7018B = this.f7033m;
                    }
                    y(new q("Received null model"), p() == null ? 5 : 3);
                    return;
                }
                a aVar = this.f7043w;
                a aVar2 = a.RUNNING;
                if (aVar == aVar2) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (aVar == a.COMPLETE) {
                    b(this.f7039s, com.bumptech.glide.load.a.MEMORY_CACHE, false);
                    return;
                }
                n(obj);
                this.f7021a = P4.b.b("GlideRequest");
                a aVar3 = a.WAITING_FOR_SIZE;
                this.f7043w = aVar3;
                if (l.v(this.f7032l, this.f7033m)) {
                    d(this.f7032l, this.f7033m);
                } else {
                    this.f7035o.h(this);
                }
                a aVar4 = this.f7043w;
                if ((aVar4 == aVar2 || aVar4 == aVar3) && k()) {
                    this.f7035o.i(q());
                }
                if (f7016E) {
                    t("finished run method in " + com.bumptech.glide.util.g.a(this.f7041u));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // L4.d
    public boolean i(d dVar) {
        int i10;
        int i11;
        Object obj;
        Class cls;
        L4.a aVar;
        com.bumptech.glide.h hVar;
        int size;
        int i12;
        int i13;
        Object obj2;
        Class cls2;
        L4.a aVar2;
        com.bumptech.glide.h hVar2;
        int size2;
        if (!(dVar instanceof j)) {
            return false;
        }
        synchronized (this.f7024d) {
            try {
                i10 = this.f7032l;
                i11 = this.f7033m;
                obj = this.f7029i;
                cls = this.f7030j;
                aVar = this.f7031k;
                hVar = this.f7034n;
                List list = this.f7036p;
                size = list != null ? list.size() : 0;
            } finally {
            }
        }
        j jVar = (j) dVar;
        synchronized (jVar.f7024d) {
            try {
                i12 = jVar.f7032l;
                i13 = jVar.f7033m;
                obj2 = jVar.f7029i;
                cls2 = jVar.f7030j;
                aVar2 = jVar.f7031k;
                hVar2 = jVar.f7034n;
                List list2 = jVar.f7036p;
                size2 = list2 != null ? list2.size() : 0;
            } finally {
            }
        }
        return i10 == i12 && i11 == i13 && l.d(obj, obj2) && cls.equals(cls2) && l.c(aVar, aVar2) && hVar == hVar2 && size == size2;
    }

    @Override // L4.d
    public boolean isComplete() {
        boolean z10;
        synchronized (this.f7024d) {
            z10 = this.f7043w == a.COMPLETE;
        }
        return z10;
    }

    @Override // L4.d
    public boolean isRunning() {
        boolean z10;
        synchronized (this.f7024d) {
            try {
                a aVar = this.f7043w;
                z10 = aVar == a.RUNNING || aVar == a.WAITING_FOR_SIZE;
            } finally {
            }
        }
        return z10;
    }

    public final boolean j() {
        e eVar = this.f7026f;
        return eVar == null || eVar.f(this);
    }

    public final boolean k() {
        e eVar = this.f7026f;
        return eVar == null || eVar.d(this);
    }

    public final boolean l() {
        e eVar = this.f7026f;
        return eVar == null || eVar.c(this);
    }

    public final void m() {
        g();
        this.f7023c.c();
        this.f7035o.e(this);
        k.d dVar = this.f7040t;
        if (dVar != null) {
            dVar.a();
            this.f7040t = null;
        }
    }

    public final void n(Object obj) {
        List<g> list = this.f7036p;
        if (list == null) {
            return;
        }
        for (g gVar : list) {
        }
    }

    public final Drawable o() {
        if (this.f7044x == null) {
            Drawable k10 = this.f7031k.k();
            this.f7044x = k10;
            if (k10 == null && this.f7031k.j() > 0) {
                this.f7044x = s(this.f7031k.j());
            }
        }
        return this.f7044x;
    }

    public final Drawable p() {
        if (this.f7046z == null) {
            Drawable l10 = this.f7031k.l();
            this.f7046z = l10;
            if (l10 == null && this.f7031k.m() > 0) {
                this.f7046z = s(this.f7031k.m());
            }
        }
        return this.f7046z;
    }

    @Override // L4.d
    public void pause() {
        synchronized (this.f7024d) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Drawable q() {
        if (this.f7045y == null) {
            Drawable r10 = this.f7031k.r();
            this.f7045y = r10;
            if (r10 == null && this.f7031k.s() > 0) {
                this.f7045y = s(this.f7031k.s());
            }
        }
        return this.f7045y;
    }

    public final boolean r() {
        e eVar = this.f7026f;
        return eVar == null || !eVar.getRoot().a();
    }

    public final Drawable s(int i10) {
        return F4.i.a(this.f7027g, i10, this.f7031k.x() != null ? this.f7031k.x() : this.f7027g.getTheme());
    }

    public String toString() {
        Object obj;
        Class cls;
        synchronized (this.f7024d) {
            obj = this.f7029i;
            cls = this.f7030j;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }

    public final void v() {
        e eVar = this.f7026f;
        if (eVar != null) {
            eVar.b(this);
        }
    }

    public final void w() {
        e eVar = this.f7026f;
        if (eVar != null) {
            eVar.g(this);
        }
    }

    public final void y(q qVar, int i10) {
        boolean z10;
        this.f7023c.c();
        synchronized (this.f7024d) {
            try {
                qVar.k(this.f7020D);
                int h10 = this.f7028h.h();
                if (h10 <= i10) {
                    Log.w("Glide", "Load failed for [" + this.f7029i + "] with dimensions [" + this.f7017A + C5444x.f55808b + this.f7018B + "]", qVar);
                    if (h10 <= 4) {
                        qVar.g("Glide");
                    }
                }
                this.f7040t = null;
                this.f7043w = a.FAILED;
                v();
                boolean z11 = true;
                this.f7019C = true;
                try {
                    List list = this.f7036p;
                    if (list != null) {
                        Iterator it = list.iterator();
                        z10 = false;
                        while (it.hasNext()) {
                            z10 |= ((g) it.next()).k(qVar, this.f7029i, this.f7035o, r());
                        }
                    } else {
                        z10 = false;
                    }
                    g gVar = this.f7025e;
                    if (gVar == null || !gVar.k(qVar, this.f7029i, this.f7035o, r())) {
                        z11 = false;
                    }
                    if (!(z10 | z11)) {
                        A();
                    }
                    this.f7019C = false;
                    P4.b.f("GlideRequest", this.f7021a);
                } catch (Throwable th2) {
                    this.f7019C = false;
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void z(v vVar, Object obj, com.bumptech.glide.load.a aVar, boolean z10) {
        boolean z11;
        boolean r10 = r();
        this.f7043w = a.COMPLETE;
        this.f7039s = vVar;
        if (this.f7028h.h() <= 3) {
            obj.getClass();
            Objects.toString(aVar);
            Objects.toString(this.f7029i);
            com.bumptech.glide.util.g.a(this.f7041u);
        }
        w();
        boolean z12 = true;
        this.f7019C = true;
        try {
            List list = this.f7036p;
            if (list != null) {
                Iterator it = list.iterator();
                z11 = false;
                while (it.hasNext()) {
                    Object obj2 = obj;
                    com.bumptech.glide.load.a aVar2 = aVar;
                    z11 |= ((g) it.next()).f(obj2, this.f7029i, this.f7035o, aVar2, r10);
                    obj = obj2;
                    aVar = aVar2;
                }
            } else {
                z11 = false;
            }
            Object obj3 = obj;
            com.bumptech.glide.load.a aVar3 = aVar;
            g gVar = this.f7025e;
            if (gVar == null || !gVar.f(obj3, this.f7029i, this.f7035o, aVar3, r10)) {
                z12 = false;
            }
            if (!(z12 | z11)) {
                this.f7035o.m(obj3, this.f7037q.a(aVar3, r10));
            }
            this.f7019C = false;
            P4.b.f("GlideRequest", this.f7021a);
        } catch (Throwable th2) {
            this.f7019C = false;
            throw th2;
        }
    }

    public final void t(String str) {
    }
}
