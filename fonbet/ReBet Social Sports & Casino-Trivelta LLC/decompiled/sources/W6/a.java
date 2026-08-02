package W6;

import D6.g;
import D6.i;
import D6.k;
import V6.a;
import V6.c;
import a7.C1922a;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.MotionEvent;
import b7.InterfaceC2406a;
import b7.InterfaceC2407b;
import b7.InterfaceC2408c;
import java.util.Map;
import java.util.concurrent.Executor;
import n7.C5673b;
import o7.C5822d;
import o7.InterfaceC5820b;

/* loaded from: classes2.dex */
public abstract class a implements InterfaceC2406a, a.InterfaceC0262a, C1922a.InterfaceC0318a {

    /* renamed from: w, reason: collision with root package name */
    public static final Map f13015w = g.of("component_tag", "drawee");

    /* renamed from: x, reason: collision with root package name */
    public static final Map f13016x = g.of("origin", "memory_bitmap", "origin_sub", "shortcut");

    /* renamed from: y, reason: collision with root package name */
    public static final Class f13017y = a.class;

    /* renamed from: b, reason: collision with root package name */
    public final V6.a f13019b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f13020c;

    /* renamed from: d, reason: collision with root package name */
    public V6.d f13021d;

    /* renamed from: e, reason: collision with root package name */
    public C1922a f13022e;

    /* renamed from: f, reason: collision with root package name */
    public d f13023f;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC2408c f13025h;

    /* renamed from: i, reason: collision with root package name */
    public Drawable f13026i;

    /* renamed from: j, reason: collision with root package name */
    public String f13027j;

    /* renamed from: k, reason: collision with root package name */
    public Object f13028k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f13029l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f13030m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f13031n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f13032o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f13033p;

    /* renamed from: q, reason: collision with root package name */
    public String f13034q;

    /* renamed from: r, reason: collision with root package name */
    public M6.c f13035r;

    /* renamed from: s, reason: collision with root package name */
    public Object f13036s;

    /* renamed from: v, reason: collision with root package name */
    public Drawable f13039v;

    /* renamed from: a, reason: collision with root package name */
    public final V6.c f13018a = V6.c.a();

    /* renamed from: g, reason: collision with root package name */
    public C5822d f13024g = new C5822d();

    /* renamed from: t, reason: collision with root package name */
    public boolean f13037t = true;

    /* renamed from: u, reason: collision with root package name */
    public boolean f13038u = false;

    /* renamed from: W6.a$a, reason: collision with other inner class name */
    public class C0270a extends M6.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f13040a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f13041b;

        public C0270a(String str, boolean z10) {
            this.f13040a = str;
            this.f13041b = z10;
        }

        @Override // M6.b
        public void onFailureImpl(M6.c cVar) {
            a.this.L(this.f13040a, cVar, cVar.f(), true);
        }

        @Override // M6.b
        public void onNewResultImpl(M6.c cVar) {
            boolean d10 = cVar.d();
            boolean i10 = cVar.i();
            float h10 = cVar.h();
            Object result = cVar.getResult();
            if (result != null) {
                a.this.N(this.f13040a, cVar, result, h10, d10, this.f13041b, i10);
            } else if (d10) {
                a.this.L(this.f13040a, cVar, new NullPointerException(), true);
            }
        }

        @Override // M6.b, M6.e
        public void onProgressUpdate(M6.c cVar) {
            boolean d10 = cVar.d();
            a.this.O(this.f13040a, cVar, cVar.h(), d10);
        }
    }

    public static class b extends f {
        public static b d(d dVar, d dVar2) {
            if (N7.b.d()) {
                N7.b.a("AbstractDraweeController#createInternal");
            }
            b bVar = new b();
            bVar.a(dVar);
            bVar.a(dVar2);
            if (N7.b.d()) {
                N7.b.b();
            }
            return bVar;
        }
    }

    public a(V6.a aVar, Executor executor, String str, Object obj) {
        this.f13019b = aVar;
        this.f13020c = executor;
        C(str, obj);
    }

    public V6.d A() {
        if (this.f13021d == null) {
            this.f13021d = new V6.d();
        }
        return this.f13021d;
    }

    public final InterfaceC2408c B() {
        InterfaceC2408c interfaceC2408c = this.f13025h;
        if (interfaceC2408c != null) {
            return interfaceC2408c;
        }
        throw new IllegalStateException("mSettableDraweeHierarchy is null; Caller context: " + this.f13028k);
    }

    public final synchronized void C(String str, Object obj) {
        V6.a aVar;
        try {
            if (N7.b.d()) {
                N7.b.a("AbstractDraweeController#init");
            }
            this.f13018a.b(c.a.ON_INIT_CONTROLLER);
            if (!this.f13037t && (aVar = this.f13019b) != null) {
                aVar.a(this);
            }
            this.f13029l = false;
            this.f13031n = false;
            Q();
            this.f13033p = false;
            V6.d dVar = this.f13021d;
            if (dVar != null) {
                dVar.a();
            }
            C1922a c1922a = this.f13022e;
            if (c1922a != null) {
                c1922a.a();
                this.f13022e.f(this);
            }
            d dVar2 = this.f13023f;
            if (dVar2 instanceof b) {
                ((b) dVar2).b();
            } else {
                this.f13023f = null;
            }
            InterfaceC2408c interfaceC2408c = this.f13025h;
            if (interfaceC2408c != null) {
                interfaceC2408c.reset();
                this.f13025h.f(null);
                this.f13025h = null;
            }
            this.f13026i = null;
            if (E6.a.w(2)) {
                E6.a.A(f13017y, "controller %x %s -> %s: initialize", Integer.valueOf(System.identityHashCode(this)), this.f13027j, str);
            }
            this.f13027j = str;
            this.f13028k = obj;
            if (N7.b.d()) {
                N7.b.b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void D(String str, Object obj) {
        C(str, obj);
        this.f13037t = false;
        this.f13038u = false;
    }

    public final boolean E(String str, M6.c cVar) {
        if (cVar == null && this.f13035r == null) {
            return true;
        }
        return str.equals(this.f13027j) && cVar == this.f13035r && this.f13030m;
    }

    public boolean F() {
        return this.f13038u;
    }

    public final void G(String str, Throwable th2) {
        if (E6.a.w(2)) {
            E6.a.B(f13017y, "controller %x %s: %s: failure: %s", Integer.valueOf(System.identityHashCode(this)), this.f13027j, str, th2);
        }
    }

    public final void H(String str, Object obj) {
        if (E6.a.w(2)) {
            E6.a.C(f13017y, "controller %x %s: %s: image: %s %x", Integer.valueOf(System.identityHashCode(this)), this.f13027j, str, w(obj), Integer.valueOf(x(obj)));
        }
    }

    public final InterfaceC5820b.a I(M6.c cVar, Object obj, Uri uri) {
        return J(cVar == null ? null : cVar.getExtras(), K(obj), uri);
    }

    public final InterfaceC5820b.a J(Map map, Map map2, Uri uri) {
        String str;
        PointF pointF;
        InterfaceC2408c interfaceC2408c = this.f13025h;
        if (interfaceC2408c instanceof Z6.a) {
            Z6.a aVar = (Z6.a) interfaceC2408c;
            String valueOf = String.valueOf(aVar.m());
            pointF = aVar.l();
            str = valueOf;
        } else {
            str = null;
            pointF = null;
        }
        return C5673b.a(f13015w, f13016x, map, null, t(), str, pointF, map2, o(), F(), uri);
    }

    public abstract Map K(Object obj);

    public final void L(String str, M6.c cVar, Throwable th2, boolean z10) {
        Drawable drawable;
        if (N7.b.d()) {
            N7.b.a("AbstractDraweeController#onFailureInternal");
        }
        if (!E(str, cVar)) {
            G("ignore_old_datasource @ onFailure", th2);
            cVar.close();
            if (N7.b.d()) {
                N7.b.b();
                return;
            }
            return;
        }
        this.f13018a.b(z10 ? c.a.ON_DATASOURCE_FAILURE : c.a.ON_DATASOURCE_FAILURE_INT);
        if (z10) {
            G("final_failed @ onFailure", th2);
            this.f13035r = null;
            this.f13032o = true;
            InterfaceC2408c interfaceC2408c = this.f13025h;
            if (interfaceC2408c != null) {
                if (this.f13033p && (drawable = this.f13039v) != null) {
                    interfaceC2408c.e(drawable, 1.0f, true);
                } else if (g0()) {
                    interfaceC2408c.a(th2);
                } else {
                    interfaceC2408c.b(th2);
                }
            }
            T(th2, cVar);
        } else {
            G("intermediate_failed @ onFailure", th2);
            U(th2);
        }
        if (N7.b.d()) {
            N7.b.b();
        }
    }

    public final void N(String str, M6.c cVar, Object obj, float f10, boolean z10, boolean z11, boolean z12) {
        try {
            if (N7.b.d()) {
                N7.b.a("AbstractDraweeController#onNewResultInternal");
            }
            if (!E(str, cVar)) {
                H("ignore_old_datasource @ onNewResult", obj);
                R(obj);
                cVar.close();
                if (N7.b.d()) {
                    N7.b.b();
                    return;
                }
                return;
            }
            this.f13018a.b(z10 ? c.a.ON_DATASOURCE_RESULT : c.a.ON_DATASOURCE_RESULT_INT);
            try {
                Drawable m10 = m(obj);
                Object obj2 = this.f13036s;
                Drawable drawable = this.f13039v;
                this.f13036s = obj;
                this.f13039v = m10;
                try {
                    if (z10) {
                        H("set_final_result @ onNewResult", obj);
                        this.f13035r = null;
                        B().e(m10, 1.0f, z11);
                        Y(str, obj, cVar);
                    } else if (z12) {
                        H("set_temporary_result @ onNewResult", obj);
                        B().e(m10, 1.0f, z11);
                        Y(str, obj, cVar);
                    } else {
                        H("set_intermediate_result @ onNewResult", obj);
                        B().e(m10, f10, z11);
                        V(str, obj);
                    }
                    if (drawable != null && drawable != m10) {
                        P(drawable);
                    }
                    if (obj2 != null && obj2 != obj) {
                        H("release_previous_result @ onNewResult", obj2);
                        R(obj2);
                    }
                    if (N7.b.d()) {
                        N7.b.b();
                    }
                } catch (Throwable th2) {
                    if (drawable != null && drawable != m10) {
                        P(drawable);
                    }
                    if (obj2 != null && obj2 != obj) {
                        H("release_previous_result @ onNewResult", obj2);
                        R(obj2);
                    }
                    throw th2;
                }
            } catch (Exception e10) {
                H("drawable_failed @ onNewResult", obj);
                R(obj);
                L(str, cVar, e10, z10);
                if (N7.b.d()) {
                    N7.b.b();
                }
            }
        } catch (Throwable th3) {
            if (N7.b.d()) {
                N7.b.b();
            }
            throw th3;
        }
    }

    public final void O(String str, M6.c cVar, float f10, boolean z10) {
        if (!E(str, cVar)) {
            G("ignore_old_datasource @ onProgress", null);
            cVar.close();
        } else {
            if (z10) {
                return;
            }
            this.f13025h.c(f10, false);
        }
    }

    public abstract void P(Drawable drawable);

    public final void Q() {
        Map map;
        boolean z10 = this.f13030m;
        this.f13030m = false;
        this.f13032o = false;
        M6.c cVar = this.f13035r;
        Map map2 = null;
        if (cVar != null) {
            map = cVar.getExtras();
            this.f13035r.close();
            this.f13035r = null;
        } else {
            map = null;
        }
        Drawable drawable = this.f13039v;
        if (drawable != null) {
            P(drawable);
        }
        if (this.f13034q != null) {
            this.f13034q = null;
        }
        this.f13039v = null;
        Object obj = this.f13036s;
        if (obj != null) {
            Map K10 = K(y(obj));
            H("release", this.f13036s);
            R(this.f13036s);
            this.f13036s = null;
            map2 = K10;
        }
        if (z10) {
            W(map, map2);
        }
    }

    public abstract void R(Object obj);

    public void S(InterfaceC5820b interfaceC5820b) {
        this.f13024g.z0(interfaceC5820b);
    }

    public final void T(Throwable th2, M6.c cVar) {
        InterfaceC5820b.a I10 = I(cVar, null, null);
        p().onFailure(this.f13027j, th2);
        q().r(this.f13027j, th2, I10);
    }

    public final void U(Throwable th2) {
        p().onIntermediateImageFailed(this.f13027j, th2);
        q().J(this.f13027j);
    }

    public final void V(String str, Object obj) {
        Object y10 = y(obj);
        p().onIntermediateImageSet(str, y10);
        q().onIntermediateImageSet(str, y10);
    }

    public final void W(Map map, Map map2) {
        p().onRelease(this.f13027j);
        q().B(this.f13027j, J(map, map2, null));
    }

    public void X(M6.c cVar, Object obj) {
        p().onSubmit(this.f13027j, this.f13028k);
        q().d(this.f13027j, this.f13028k, I(cVar, obj, z()));
    }

    public final void Y(String str, Object obj, M6.c cVar) {
        Object y10 = y(obj);
        p().onFinalImageSet(str, y10, h());
        q().k(str, y10, I(cVar, y10, null));
    }

    public void Z(String str) {
        this.f13034q = str;
    }

    @Override // a7.C1922a.InterfaceC0318a
    public boolean a() {
        if (E6.a.w(2)) {
            E6.a.z(f13017y, "controller %x %s: onClick", Integer.valueOf(System.identityHashCode(this)), this.f13027j);
        }
        if (!g0()) {
            return false;
        }
        this.f13021d.b();
        this.f13025h.reset();
        h0();
        return true;
    }

    public void a0(Drawable drawable) {
        this.f13026i = drawable;
        InterfaceC2408c interfaceC2408c = this.f13025h;
        if (interfaceC2408c != null) {
            interfaceC2408c.f(drawable);
        }
    }

    public void c0(C1922a c1922a) {
        this.f13022e = c1922a;
        if (c1922a != null) {
            c1922a.f(this);
        }
    }

    @Override // b7.InterfaceC2406a
    public boolean d(MotionEvent motionEvent) {
        if (E6.a.w(2)) {
            E6.a.A(f13017y, "controller %x %s: onTouchEvent %s", Integer.valueOf(System.identityHashCode(this)), this.f13027j, motionEvent);
        }
        C1922a c1922a = this.f13022e;
        if (c1922a == null) {
            return false;
        }
        if (!c1922a.b() && !f0()) {
            return false;
        }
        this.f13022e.d(motionEvent);
        return true;
    }

    public void d0(boolean z10) {
        this.f13038u = z10;
    }

    @Override // b7.InterfaceC2406a
    public void e() {
        if (N7.b.d()) {
            N7.b.a("AbstractDraweeController#onAttach");
        }
        if (E6.a.w(2)) {
            E6.a.A(f13017y, "controller %x %s: onAttach: %s", Integer.valueOf(System.identityHashCode(this)), this.f13027j, this.f13030m ? "request already submitted" : "request needs submit");
        }
        this.f13018a.b(c.a.ON_ATTACH_CONTROLLER);
        k.g(this.f13025h);
        this.f13019b.a(this);
        this.f13029l = true;
        if (!this.f13030m) {
            h0();
        }
        if (N7.b.d()) {
            N7.b.b();
        }
    }

    public void e0(boolean z10) {
        this.f13033p = z10;
    }

    @Override // b7.InterfaceC2406a
    public void f() {
        if (N7.b.d()) {
            N7.b.a("AbstractDraweeController#onDetach");
        }
        if (E6.a.w(2)) {
            E6.a.z(f13017y, "controller %x %s: onDetach", Integer.valueOf(System.identityHashCode(this)), this.f13027j);
        }
        this.f13018a.b(c.a.ON_DETACH_CONTROLLER);
        this.f13029l = false;
        this.f13019b.d(this);
        if (N7.b.d()) {
            N7.b.b();
        }
    }

    public boolean f0() {
        return g0();
    }

    @Override // b7.InterfaceC2406a
    public InterfaceC2407b g() {
        return this.f13025h;
    }

    public final boolean g0() {
        V6.d dVar;
        return this.f13032o && (dVar = this.f13021d) != null && dVar.e();
    }

    @Override // b7.InterfaceC2406a
    public Animatable h() {
        Object obj = this.f13039v;
        if (obj instanceof Animatable) {
            return (Animatable) obj;
        }
        return null;
    }

    public void h0() {
        if (N7.b.d()) {
            N7.b.a("AbstractDraweeController#submitRequest");
        }
        Object n10 = n();
        if (n10 != null) {
            if (N7.b.d()) {
                N7.b.a("AbstractDraweeController#submitRequest->cache");
            }
            this.f13035r = null;
            this.f13030m = true;
            this.f13032o = false;
            this.f13018a.b(c.a.ON_SUBMIT_CACHE_HIT);
            X(this.f13035r, y(n10));
            M(this.f13027j, n10);
            N(this.f13027j, this.f13035r, n10, 1.0f, true, true, true);
            if (N7.b.d()) {
                N7.b.b();
            }
            if (N7.b.d()) {
                N7.b.b();
                return;
            }
            return;
        }
        this.f13018a.b(c.a.ON_DATASOURCE_SUBMIT);
        this.f13025h.c(0.0f, true);
        this.f13030m = true;
        this.f13032o = false;
        M6.c s10 = s();
        this.f13035r = s10;
        X(s10, null);
        if (E6.a.w(2)) {
            E6.a.A(f13017y, "controller %x %s: submitRequest: dataSource: %x", Integer.valueOf(System.identityHashCode(this)), this.f13027j, Integer.valueOf(System.identityHashCode(this.f13035r)));
        }
        this.f13035r.g(new C0270a(this.f13027j, this.f13035r.e()), this.f13020c);
        if (N7.b.d()) {
            N7.b.b();
        }
    }

    @Override // b7.InterfaceC2406a
    public void i(InterfaceC2407b interfaceC2407b) {
        if (E6.a.w(2)) {
            E6.a.A(f13017y, "controller %x %s: setHierarchy: %s", Integer.valueOf(System.identityHashCode(this)), this.f13027j, interfaceC2407b);
        }
        this.f13018a.b(interfaceC2407b != null ? c.a.ON_SET_HIERARCHY : c.a.ON_CLEAR_HIERARCHY);
        if (this.f13030m) {
            this.f13019b.a(this);
            release();
        }
        InterfaceC2408c interfaceC2408c = this.f13025h;
        if (interfaceC2408c != null) {
            interfaceC2408c.f(null);
            this.f13025h = null;
        }
        if (interfaceC2407b != null) {
            k.b(Boolean.valueOf(interfaceC2407b instanceof InterfaceC2408c));
            InterfaceC2408c interfaceC2408c2 = (InterfaceC2408c) interfaceC2407b;
            this.f13025h = interfaceC2408c2;
            interfaceC2408c2.f(this.f13026i);
        }
    }

    public void k(d dVar) {
        k.g(dVar);
        d dVar2 = this.f13023f;
        if (dVar2 instanceof b) {
            ((b) dVar2).a(dVar);
        } else if (dVar2 != null) {
            this.f13023f = b.d(dVar2, dVar);
        } else {
            this.f13023f = dVar;
        }
    }

    public void l(InterfaceC5820b interfaceC5820b) {
        this.f13024g.w0(interfaceC5820b);
    }

    public abstract Drawable m(Object obj);

    public abstract Object n();

    public Object o() {
        return this.f13028k;
    }

    public d p() {
        d dVar = this.f13023f;
        return dVar == null ? c.a() : dVar;
    }

    public InterfaceC5820b q() {
        return this.f13024g;
    }

    public Drawable r() {
        return this.f13026i;
    }

    @Override // V6.a.InterfaceC0262a
    public void release() {
        this.f13018a.b(c.a.ON_RELEASE_CONTROLLER);
        V6.d dVar = this.f13021d;
        if (dVar != null) {
            dVar.c();
        }
        C1922a c1922a = this.f13022e;
        if (c1922a != null) {
            c1922a.e();
        }
        InterfaceC2408c interfaceC2408c = this.f13025h;
        if (interfaceC2408c != null) {
            interfaceC2408c.reset();
        }
        Q();
    }

    public abstract M6.c s();

    public final Rect t() {
        InterfaceC2408c interfaceC2408c = this.f13025h;
        if (interfaceC2408c == null) {
            return null;
        }
        return interfaceC2408c.getBounds();
    }

    public String toString() {
        return i.b(this).c("isAttached", this.f13029l).c("isRequestSubmitted", this.f13030m).c("hasFetchFailed", this.f13032o).a("fetchedImage", x(this.f13036s)).b("events", this.f13018a.toString()).toString();
    }

    public C1922a u() {
        return this.f13022e;
    }

    public String v() {
        return this.f13027j;
    }

    public String w(Object obj) {
        return obj != null ? obj.getClass().getSimpleName() : "<null>";
    }

    public abstract int x(Object obj);

    public abstract Object y(Object obj);

    public abstract Uri z();

    public void b0(e eVar) {
    }

    public void M(String str, Object obj) {
    }
}
