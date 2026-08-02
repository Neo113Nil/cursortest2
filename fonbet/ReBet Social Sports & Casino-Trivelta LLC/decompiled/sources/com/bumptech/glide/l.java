package com.bumptech.glide;

import android.content.Context;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class l extends L4.a implements Cloneable {

    /* renamed from: R, reason: collision with root package name */
    public static final L4.h f29636R = (L4.h) ((L4.h) ((L4.h) new L4.h().f(com.bumptech.glide.load.engine.j.f29825c)).V(h.LOW)).c0(true);

    /* renamed from: A, reason: collision with root package name */
    public final Context f29637A;

    /* renamed from: B, reason: collision with root package name */
    public final m f29638B;

    /* renamed from: C, reason: collision with root package name */
    public final Class f29639C;

    /* renamed from: D, reason: collision with root package name */
    public final c f29640D;

    /* renamed from: E, reason: collision with root package name */
    public final e f29641E;

    /* renamed from: F, reason: collision with root package name */
    public n f29642F;

    /* renamed from: G, reason: collision with root package name */
    public Object f29643G;

    /* renamed from: H, reason: collision with root package name */
    public List f29644H;

    /* renamed from: I, reason: collision with root package name */
    public l f29645I;

    /* renamed from: J, reason: collision with root package name */
    public l f29646J;

    /* renamed from: K, reason: collision with root package name */
    public Float f29647K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f29648L = true;

    /* renamed from: O, reason: collision with root package name */
    public boolean f29649O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f29650P;

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$android$widget$ImageView$ScaleType;
        static final /* synthetic */ int[] $SwitchMap$com$bumptech$glide$Priority;

        static {
            int[] iArr = new int[h.values().length];
            $SwitchMap$com$bumptech$glide$Priority = iArr;
            try {
                iArr[h.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$bumptech$glide$Priority[h.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$bumptech$glide$Priority[h.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$bumptech$glide$Priority[h.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            $SwitchMap$android$widget$ImageView$ScaleType = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public l(c cVar, m mVar, Class cls, Context context) {
        this.f29640D = cVar;
        this.f29638B = mVar;
        this.f29639C = cls;
        this.f29637A = context;
        this.f29642F = mVar.u(cls);
        this.f29641E = cVar.j();
        t0(mVar.s());
        a(mVar.t());
    }

    public l A0(Object obj) {
        return C0(obj);
    }

    public l B0(String str) {
        return C0(str);
    }

    public final l C0(Object obj) {
        if (B()) {
            return clone().C0(obj);
        }
        this.f29643G = obj;
        this.f29649O = true;
        return (l) Y();
    }

    public final L4.d D0(Object obj, M4.j jVar, L4.g gVar, L4.a aVar, L4.e eVar, n nVar, h hVar, int i10, int i11, Executor executor) {
        Context context = this.f29637A;
        e eVar2 = this.f29641E;
        return L4.j.x(context, eVar2, obj, this.f29643G, this.f29639C, aVar, i10, i11, hVar, jVar, gVar, this.f29644H, eVar, eVar2.f(), nVar.b(), executor);
    }

    public M4.j E0() {
        return F0(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public M4.j F0(int i10, int i11) {
        return u0(M4.h.k(this.f29638B, i10, i11));
    }

    public L4.c G0() {
        return H0(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public L4.c H0(int i10, int i11) {
        L4.f fVar = new L4.f(i10, i11);
        return (L4.c) w0(fVar, fVar, com.bumptech.glide.util.e.a());
    }

    public l I0(l lVar) {
        if (B()) {
            return clone().I0(lVar);
        }
        this.f29645I = lVar;
        return (l) Y();
    }

    public l J0(n nVar) {
        if (B()) {
            return clone().J0(nVar);
        }
        this.f29642F = (n) com.bumptech.glide.util.k.d(nVar);
        this.f29648L = false;
        return (l) Y();
    }

    @Override // L4.a
    public boolean equals(Object obj) {
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (super.equals(lVar) && Objects.equals(this.f29639C, lVar.f29639C) && this.f29642F.equals(lVar.f29642F) && Objects.equals(this.f29643G, lVar.f29643G) && Objects.equals(this.f29644H, lVar.f29644H) && Objects.equals(this.f29645I, lVar.f29645I) && Objects.equals(this.f29646J, lVar.f29646J) && Objects.equals(this.f29647K, lVar.f29647K) && this.f29648L == lVar.f29648L && this.f29649O == lVar.f29649O) {
                return true;
            }
        }
        return false;
    }

    @Override // L4.a
    public int hashCode() {
        return com.bumptech.glide.util.l.r(this.f29649O, com.bumptech.glide.util.l.r(this.f29648L, com.bumptech.glide.util.l.q(this.f29647K, com.bumptech.glide.util.l.q(this.f29646J, com.bumptech.glide.util.l.q(this.f29645I, com.bumptech.glide.util.l.q(this.f29644H, com.bumptech.glide.util.l.q(this.f29643G, com.bumptech.glide.util.l.q(this.f29642F, com.bumptech.glide.util.l.q(this.f29639C, super.hashCode())))))))));
    }

    public l j0(L4.g gVar) {
        if (B()) {
            return clone().j0(gVar);
        }
        if (gVar != null) {
            if (this.f29644H == null) {
                this.f29644H = new ArrayList();
            }
            this.f29644H.add(gVar);
        }
        return (l) Y();
    }

    @Override // L4.a
    /* renamed from: k0, reason: merged with bridge method [inline-methods] */
    public l a(L4.a aVar) {
        com.bumptech.glide.util.k.d(aVar);
        return (l) super.a(aVar);
    }

    public final L4.d l0(M4.j jVar, L4.g gVar, L4.a aVar, Executor executor) {
        return m0(new Object(), jVar, gVar, null, this.f29642F, aVar.t(), aVar.q(), aVar.p(), aVar, executor);
    }

    public final L4.d m0(Object obj, M4.j jVar, L4.g gVar, L4.e eVar, n nVar, h hVar, int i10, int i11, L4.a aVar, Executor executor) {
        L4.b bVar;
        L4.e eVar2;
        Object obj2;
        M4.j jVar2;
        L4.g gVar2;
        n nVar2;
        h hVar2;
        int i12;
        int i13;
        L4.a aVar2;
        Executor executor2;
        l lVar;
        if (this.f29646J != null) {
            bVar = new L4.b(obj, eVar);
            eVar2 = bVar;
            lVar = this;
            obj2 = obj;
            jVar2 = jVar;
            gVar2 = gVar;
            nVar2 = nVar;
            hVar2 = hVar;
            i12 = i10;
            i13 = i11;
            aVar2 = aVar;
            executor2 = executor;
        } else {
            bVar = null;
            eVar2 = eVar;
            obj2 = obj;
            jVar2 = jVar;
            gVar2 = gVar;
            nVar2 = nVar;
            hVar2 = hVar;
            i12 = i10;
            i13 = i11;
            aVar2 = aVar;
            executor2 = executor;
            lVar = this;
        }
        L4.d n02 = lVar.n0(obj2, jVar2, gVar2, eVar2, nVar2, hVar2, i12, i13, aVar2, executor2);
        if (bVar == null) {
            return n02;
        }
        int q10 = this.f29646J.q();
        int p10 = this.f29646J.p();
        if (com.bumptech.glide.util.l.v(i10, i11) && !this.f29646J.L()) {
            q10 = aVar.q();
            p10 = aVar.p();
        }
        l lVar2 = this.f29646J;
        L4.b bVar2 = bVar;
        bVar2.n(n02, lVar2.m0(obj, jVar, gVar, bVar2, lVar2.f29642F, lVar2.t(), q10, p10, this.f29646J, executor));
        return bVar2;
    }

    public final L4.d n0(Object obj, M4.j jVar, L4.g gVar, L4.e eVar, n nVar, h hVar, int i10, int i11, L4.a aVar, Executor executor) {
        l lVar = this.f29645I;
        if (lVar == null) {
            if (this.f29647K == null) {
                return D0(obj, jVar, gVar, aVar, eVar, nVar, hVar, i10, i11, executor);
            }
            L4.k kVar = new L4.k(obj, eVar);
            kVar.m(D0(obj, jVar, gVar, aVar, kVar, nVar, hVar, i10, i11, executor), D0(obj, jVar, gVar, aVar.clone().b0(this.f29647K.floatValue()), kVar, nVar, s0(hVar), i10, i11, executor));
            return kVar;
        }
        if (this.f29650P) {
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        n nVar2 = lVar.f29648L ? nVar : lVar.f29642F;
        h t10 = lVar.E() ? this.f29645I.t() : s0(hVar);
        int q10 = this.f29645I.q();
        int p10 = this.f29645I.p();
        if (com.bumptech.glide.util.l.v(i10, i11) && !this.f29645I.L()) {
            q10 = aVar.q();
            p10 = aVar.p();
        }
        L4.k kVar2 = new L4.k(obj, eVar);
        L4.d D02 = D0(obj, jVar, gVar, aVar, kVar2, nVar, hVar, i10, i11, executor);
        this.f29650P = true;
        l lVar2 = this.f29645I;
        L4.d m02 = lVar2.m0(obj, jVar, gVar, kVar2, nVar2, t10, q10, p10, lVar2, executor);
        this.f29650P = false;
        kVar2.m(D02, m02);
        return kVar2;
    }

    @Override // L4.a
    /* renamed from: o0, reason: merged with bridge method [inline-methods] */
    public l clone() {
        l lVar = (l) super.clone();
        lVar.f29642F = lVar.f29642F.clone();
        if (lVar.f29644H != null) {
            lVar.f29644H = new ArrayList(lVar.f29644H);
        }
        l lVar2 = lVar.f29645I;
        if (lVar2 != null) {
            lVar.f29645I = lVar2.clone();
        }
        l lVar3 = lVar.f29646J;
        if (lVar3 != null) {
            lVar.f29646J = lVar3.clone();
        }
        return lVar;
    }

    public final l p0() {
        return clone().q0(null).I0(null);
    }

    public l q0(l lVar) {
        if (B()) {
            return clone().q0(lVar);
        }
        this.f29646J = lVar;
        return (l) Y();
    }

    public l r0(Object obj) {
        return obj == null ? q0(null) : q0(p0().A0(obj));
    }

    public final h s0(h hVar) {
        int i10 = a.$SwitchMap$com$bumptech$glide$Priority[hVar.ordinal()];
        if (i10 == 1) {
            return h.NORMAL;
        }
        if (i10 == 2) {
            return h.HIGH;
        }
        if (i10 == 3 || i10 == 4) {
            return h.IMMEDIATE;
        }
        throw new IllegalArgumentException("unknown priority: " + t());
    }

    public final void t0(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j0((L4.g) it.next());
        }
    }

    public M4.j u0(M4.j jVar) {
        return w0(jVar, null, com.bumptech.glide.util.e.b());
    }

    public final M4.j v0(M4.j jVar, L4.g gVar, L4.a aVar, Executor executor) {
        com.bumptech.glide.util.k.d(jVar);
        if (!this.f29649O) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        L4.d l02 = l0(jVar, gVar, aVar, executor);
        L4.d c10 = jVar.c();
        if (l02.i(c10) && !y0(aVar, c10)) {
            if (!((L4.d) com.bumptech.glide.util.k.d(c10)).isRunning()) {
                c10.h();
            }
            return jVar;
        }
        this.f29638B.p(jVar);
        jVar.g(l02);
        this.f29638B.C(jVar, l02);
        return jVar;
    }

    public M4.j w0(M4.j jVar, L4.g gVar, Executor executor) {
        return v0(jVar, gVar, this, executor);
    }

    public M4.k x0(ImageView imageView) {
        L4.a aVar;
        com.bumptech.glide.util.l.b();
        com.bumptech.glide.util.k.d(imageView);
        if (!K() && I() && imageView.getScaleType() != null) {
            switch (a.$SwitchMap$android$widget$ImageView$ScaleType[imageView.getScaleType().ordinal()]) {
                case 1:
                    aVar = clone().O();
                    break;
                case 2:
                    aVar = clone().P();
                    break;
                case 3:
                case 4:
                case 5:
                    aVar = clone().Q();
                    break;
                case 6:
                    aVar = clone().P();
                    break;
            }
            return (M4.k) v0(this.f29641E.a(imageView, this.f29639C), null, aVar, com.bumptech.glide.util.e.b());
        }
        aVar = this;
        return (M4.k) v0(this.f29641E.a(imageView, this.f29639C), null, aVar, com.bumptech.glide.util.e.b());
    }

    public final boolean y0(L4.a aVar, L4.d dVar) {
        return !aVar.D() && dVar.isComplete();
    }

    public l z0(L4.g gVar) {
        if (B()) {
            return clone().z0(gVar);
        }
        this.f29644H = null;
        return j0(gVar);
    }
}
