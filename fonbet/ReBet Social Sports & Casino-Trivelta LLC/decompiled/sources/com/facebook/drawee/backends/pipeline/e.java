package com.facebook.drawee.backends.pipeline;

import A7.x;
import D6.i;
import D6.k;
import D6.n;
import H7.m;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import b7.InterfaceC2407b;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.drawee.drawable.AbstractC3010a;
import com.facebook.drawee.drawable.InterfaceC3012c;
import com.facebook.drawee.drawable.p;
import com.facebook.drawee.drawable.r;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import o7.InterfaceC5825g;
import o7.l;
import w6.InterfaceC6713d;

/* loaded from: classes2.dex */
public class e extends W6.a {

    /* renamed from: L, reason: collision with root package name */
    public static final Class f30372L = e.class;

    /* renamed from: A, reason: collision with root package name */
    public final G7.a f30373A;

    /* renamed from: B, reason: collision with root package name */
    public final D6.f f30374B;

    /* renamed from: C, reason: collision with root package name */
    public final x f30375C;

    /* renamed from: D, reason: collision with root package name */
    public InterfaceC6713d f30376D;

    /* renamed from: E, reason: collision with root package name */
    public n f30377E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f30378F;

    /* renamed from: G, reason: collision with root package name */
    public D6.f f30379G;

    /* renamed from: H, reason: collision with root package name */
    public T6.a f30380H;

    /* renamed from: I, reason: collision with root package name */
    public Set f30381I;

    /* renamed from: J, reason: collision with root package name */
    public com.facebook.imagepipeline.request.b f30382J;

    /* renamed from: K, reason: collision with root package name */
    public com.facebook.imagepipeline.request.b f30383K;
    private com.facebook.imagepipeline.request.b[] mFirstAvailableImageRequests;

    /* renamed from: z, reason: collision with root package name */
    public final Resources f30384z;

    public e(Resources resources, V6.a aVar, G7.a aVar2, G7.a aVar3, Executor executor, x xVar, D6.f fVar) {
        super(aVar, executor, null, null);
        this.f30384z = resources;
        this.f30373A = new a(resources, aVar2, aVar3);
        this.f30374B = fVar;
        this.f30375C = xVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static p k0(Drawable drawable) {
        if (drawable == 0) {
            return null;
        }
        if (drawable instanceof p) {
            return (p) drawable;
        }
        if (drawable instanceof InterfaceC3012c) {
            return k0(((InterfaceC3012c) drawable).getDrawable());
        }
        if (drawable instanceof AbstractC3010a) {
            AbstractC3010a abstractC3010a = (AbstractC3010a) drawable;
            int d10 = abstractC3010a.d();
            for (int i10 = 0; i10 < d10; i10++) {
                p k02 = k0(abstractC3010a.b(i10));
                if (k02 != null) {
                    return k02;
                }
            }
        }
        return null;
    }

    public void A0(boolean z10) {
        this.f30378F = z10;
    }

    public void B0(H7.e eVar, X6.a aVar) {
        p k02;
        aVar.j(v());
        InterfaceC2407b g10 = g();
        r rVar = null;
        if (g10 != null && (k02 = k0(g10.d())) != null) {
            rVar = k02.l();
        }
        aVar.m(rVar);
        String m02 = m0();
        if (m02 != null) {
            aVar.b("cc", m02);
        }
        if (eVar == null) {
            aVar.i();
        } else {
            aVar.k(eVar.getWidth(), eVar.getHeight());
            aVar.l(eVar.o());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // W6.a
    public void P(Drawable drawable) {
        if (drawable instanceof R6.a) {
            ((R6.a) drawable).a();
        }
    }

    @Override // W6.a, b7.InterfaceC2406a
    public void i(InterfaceC2407b interfaceC2407b) {
        super.i(interfaceC2407b);
        u0(null);
    }

    public synchronized void i0(J7.e eVar) {
        try {
            if (this.f30381I == null) {
                this.f30381I = new HashSet();
            }
            this.f30381I.add(eVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // W6.a
    /* renamed from: j0, reason: merged with bridge method [inline-methods] */
    public Drawable m(H6.a aVar) {
        try {
            if (N7.b.d()) {
                N7.b.a("PipelineDraweeController#createDrawable");
            }
            k.i(H6.a.isValid(aVar));
            H7.e eVar = (H7.e) aVar.z0();
            u0(eVar);
            Drawable t02 = t0(this.f30379G, eVar);
            if (t02 != null) {
                if (N7.b.d()) {
                    N7.b.b();
                }
                return t02;
            }
            Drawable t03 = t0(this.f30374B, eVar);
            if (t03 != null) {
                if (N7.b.d()) {
                    N7.b.b();
                }
                return t03;
            }
            Drawable a10 = this.f30373A.a(eVar);
            if (a10 != null) {
                if (N7.b.d()) {
                    N7.b.b();
                }
                return a10;
            }
            throw new UnsupportedOperationException("Unrecognized image class: " + eVar);
        } catch (Throwable th2) {
            if (N7.b.d()) {
                N7.b.b();
            }
            throw th2;
        }
    }

    @Override // W6.a
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public H6.a n() {
        InterfaceC6713d interfaceC6713d;
        if (N7.b.d()) {
            N7.b.a("PipelineDraweeController#getCachedImage");
        }
        try {
            x xVar = this.f30375C;
            if (xVar != null && (interfaceC6713d = this.f30376D) != null) {
                H6.a aVar = xVar.get(interfaceC6713d);
                if (aVar != null && !((H7.e) aVar.z0()).t1().a()) {
                    aVar.close();
                    return null;
                }
                if (N7.b.d()) {
                    N7.b.b();
                }
                return aVar;
            }
            if (N7.b.d()) {
                N7.b.b();
            }
            return null;
        } finally {
            if (N7.b.d()) {
                N7.b.b();
            }
        }
    }

    public String m0() {
        Object o10 = o();
        if (o10 == null) {
            return null;
        }
        return o10.toString();
    }

    @Override // W6.a
    /* renamed from: n0, reason: merged with bridge method [inline-methods] */
    public int x(H6.a aVar) {
        if (aVar != null) {
            return aVar.A0();
        }
        return 0;
    }

    @Override // W6.a
    /* renamed from: o0, reason: merged with bridge method [inline-methods] */
    public m y(H6.a aVar) {
        k.i(H6.a.isValid(aVar));
        return ((H7.e) aVar.z0()).w1();
    }

    public synchronized J7.e p0() {
        Set set = this.f30381I;
        if (set == null) {
            return null;
        }
        return new J7.c(set);
    }

    public final void q0(n nVar) {
        this.f30377E = nVar;
        u0(null);
    }

    public void r0(n nVar, String str, InterfaceC6713d interfaceC6713d, Object obj, D6.f fVar) {
        if (N7.b.d()) {
            N7.b.a("PipelineDraweeController#initialize");
        }
        super.D(str, obj);
        q0(nVar);
        this.f30376D = interfaceC6713d;
        z0(fVar);
        u0(null);
        if (N7.b.d()) {
            N7.b.b();
        }
    }

    @Override // W6.a
    public M6.c s() {
        if (N7.b.d()) {
            N7.b.a("PipelineDraweeController#getDataSource");
        }
        if (E6.a.w(2)) {
            E6.a.y(f30372L, "controller %x: getDataSource", Integer.valueOf(System.identityHashCode(this)));
        }
        M6.c cVar = (M6.c) this.f30377E.get();
        if (N7.b.d()) {
            N7.b.b();
        }
        return cVar;
    }

    public synchronized void s0(InterfaceC5825g interfaceC5825g, W6.b bVar) {
        try {
            T6.a aVar = this.f30380H;
            if (aVar != null) {
                aVar.f();
            }
            if (interfaceC5825g != null) {
                if (this.f30380H == null) {
                    this.f30380H = new T6.a(AwakeTimeSinceBootClock.get(), this);
                }
                this.f30380H.c(interfaceC5825g);
                this.f30380H.g(true);
            }
            this.f30382J = (com.facebook.imagepipeline.request.b) bVar.n();
            this.mFirstAvailableImageRequests = (com.facebook.imagepipeline.request.b[]) bVar.m();
            this.f30383K = (com.facebook.imagepipeline.request.b) bVar.o();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final Drawable t0(D6.f fVar, H7.e eVar) {
        Drawable a10;
        if (fVar == null) {
            return null;
        }
        Iterator<E> it = fVar.iterator();
        while (it.hasNext()) {
            G7.a aVar = (G7.a) it.next();
            if (aVar.b(eVar) && (a10 = aVar.a(eVar)) != null) {
                return a10;
            }
        }
        return null;
    }

    @Override // W6.a
    public String toString() {
        return i.b(this).b("super", super.toString()).b("dataSourceSupplier", this.f30377E).toString();
    }

    public final void u0(H7.e eVar) {
        if (this.f30378F) {
            if (r() == null) {
                X6.a aVar = new X6.a();
                k(new Y6.a(aVar));
                a0(aVar);
            }
            if (r() instanceof X6.a) {
                B0(eVar, (X6.a) r());
            }
        }
    }

    @Override // W6.a
    /* renamed from: v0, reason: merged with bridge method [inline-methods] */
    public Map K(m mVar) {
        if (mVar == null) {
            return null;
        }
        return mVar.getExtras();
    }

    @Override // W6.a
    /* renamed from: w0, reason: merged with bridge method [inline-methods] */
    public void M(String str, H6.a aVar) {
        super.M(str, aVar);
        synchronized (this) {
        }
    }

    @Override // W6.a
    /* renamed from: x0, reason: merged with bridge method [inline-methods] */
    public void R(H6.a aVar) {
        H6.a.U(aVar);
    }

    public synchronized void y0(J7.e eVar) {
        Set set = this.f30381I;
        if (set == null) {
            return;
        }
        set.remove(eVar);
    }

    @Override // W6.a
    public Uri z() {
        return l.a(this.f30382J, this.f30383K, this.mFirstAvailableImageRequests, com.facebook.imagepipeline.request.b.REQUEST_TO_URI_FN);
    }

    public void z0(D6.f fVar) {
        this.f30379G = fVar;
    }
}
