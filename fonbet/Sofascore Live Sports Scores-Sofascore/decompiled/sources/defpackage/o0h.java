package defpackage;

import androidx.compose.runtime.e;
import com.unity3d.services.UnityAdsConstants;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class o0h extends t01 {
    public static final f80 t = new f80(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    public static final f80 u = new f80(1.0f);
    public final e1d c;
    public final e1d d;
    public Object e;
    public axj f;
    public long g;
    public final e6g h;
    public a5f i;
    public final xnh j;
    public lj2 k;
    public final j2d l;
    public final r1d m;
    public long n;
    public final l0d o;
    public h0h p;
    public final g0h q;
    public float r;
    public final g0h s;

    /* JADX WARN: Type inference failed for: r3v7, types: [g0h] */
    /* JADX WARN: Type inference failed for: r3v8, types: [g0h] */
    public o0h(Object obj) {
        super(11);
        this.c = e.f(obj);
        this.d = e.f(obj);
        this.e = obj;
        this.h = new e6g(this, 13);
        this.j = e.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.l = new j2d();
        this.m = new r1d();
        this.n = Long.MIN_VALUE;
        this.o = new l0d();
        final int i = 0;
        this.q = new Function1(this) { // from class: g0h
            public final /* synthetic */ o0h b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i2 = i;
                o0h o0hVar = this.b;
                Long l = (Long) obj2;
                switch (i2) {
                    case 0:
                        o0hVar.n = l.longValue();
                        break;
                    default:
                        long longValue = l.longValue();
                        long j = longValue - o0hVar.n;
                        o0hVar.n = longValue;
                        long c = wzb.c(j / o0hVar.r);
                        l0d l0dVar = o0hVar.o;
                        if (l0dVar.i()) {
                            Object[] objArr = l0dVar.a;
                            int i3 = l0dVar.b;
                            int i4 = 0;
                            for (int i5 = 0; i5 < i3; i5++) {
                                h0h h0hVar = (h0h) objArr[i5];
                                o0h.V(h0hVar, c);
                                h0hVar.c = true;
                            }
                            axj axjVar = o0hVar.f;
                            if (axjVar != null) {
                                axjVar.q();
                            }
                            int i6 = l0dVar.b;
                            Object[] objArr2 = l0dVar.a;
                            IntRange j2 = llf.j(0, i6);
                            int i7 = j2.a;
                            int i8 = j2.b;
                            if (i7 <= i8) {
                                while (true) {
                                    objArr2[i7 - i4] = objArr2[i7];
                                    if (((h0h) objArr2[i7]).c) {
                                        i4++;
                                    }
                                    if (i7 != i8) {
                                        i7++;
                                    }
                                }
                            }
                            mh0.m(i6 - i4, i6, null, objArr2);
                            l0dVar.b -= i4;
                        }
                        h0h h0hVar2 = o0hVar.p;
                        if (h0hVar2 != null) {
                            h0hVar2.g = o0hVar.g;
                            o0h.V(h0hVar2, c);
                            o0hVar.Z(h0hVar2.d);
                            if (h0hVar2.d == 1.0f) {
                                o0hVar.p = null;
                            }
                            o0hVar.Y();
                        }
                        break;
                }
                return Unit.a;
            }
        };
        final int i2 = 1;
        this.s = new Function1(this) { // from class: g0h
            public final /* synthetic */ o0h b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i22 = i2;
                o0h o0hVar = this.b;
                Long l = (Long) obj2;
                switch (i22) {
                    case 0:
                        o0hVar.n = l.longValue();
                        break;
                    default:
                        long longValue = l.longValue();
                        long j = longValue - o0hVar.n;
                        o0hVar.n = longValue;
                        long c = wzb.c(j / o0hVar.r);
                        l0d l0dVar = o0hVar.o;
                        if (l0dVar.i()) {
                            Object[] objArr = l0dVar.a;
                            int i3 = l0dVar.b;
                            int i4 = 0;
                            for (int i5 = 0; i5 < i3; i5++) {
                                h0h h0hVar = (h0h) objArr[i5];
                                o0h.V(h0hVar, c);
                                h0hVar.c = true;
                            }
                            axj axjVar = o0hVar.f;
                            if (axjVar != null) {
                                axjVar.q();
                            }
                            int i6 = l0dVar.b;
                            Object[] objArr2 = l0dVar.a;
                            IntRange j2 = llf.j(0, i6);
                            int i7 = j2.a;
                            int i8 = j2.b;
                            if (i7 <= i8) {
                                while (true) {
                                    objArr2[i7 - i4] = objArr2[i7];
                                    if (((h0h) objArr2[i7]).c) {
                                        i4++;
                                    }
                                    if (i7 != i8) {
                                        i7++;
                                    }
                                }
                            }
                            mh0.m(i6 - i4, i6, null, objArr2);
                            l0dVar.b -= i4;
                        }
                        h0h h0hVar2 = o0hVar.p;
                        if (h0hVar2 != null) {
                            h0hVar2.g = o0hVar.g;
                            o0h.V(h0hVar2, c);
                            o0hVar.Z(h0hVar2.d);
                            if (h0hVar2.d == 1.0f) {
                                o0hVar.p = null;
                            }
                            o0hVar.Y();
                        }
                        break;
                }
                return Unit.a;
            }
        };
    }

    public static Object S(o0h o0hVar, Object obj, hoi hoiVar) {
        axj axjVar = o0hVar.f;
        if (axjVar == null) {
            return Unit.a;
        }
        Object a = r1d.a(o0hVar.m, new i0h(axjVar, o0hVar, obj, (rq3) null), hoiVar);
        return a == lu3.a ? a : Unit.a;
    }

    public static void V(h0h h0hVar, long j) {
        long j2 = h0hVar.a + j;
        h0hVar.a = j2;
        long j3 = h0hVar.h;
        if (j2 >= j3) {
            h0hVar.d = 1.0f;
            return;
        }
        qmk qmkVar = h0hVar.b;
        f80 f80Var = h0hVar.e;
        if (qmkVar == null) {
            float f = j2 / j3;
            h0hVar.d = (f * 1.0f) + ((1.0f - f) * f80Var.a(0));
            return;
        }
        f80 f80Var2 = h0hVar.f;
        if (f80Var2 == null) {
            f80Var2 = t;
        }
        h0hVar.d = llf.b(((f80) qmkVar.z(j2, f80Var, u, f80Var2)).a(0), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
    }

    @Override // defpackage.t01
    public final Object A() {
        return ((eoh) this.c).getValue();
    }

    @Override // defpackage.t01
    public final void I(Object obj) {
        ((eoh) this.d).setValue(obj);
    }

    @Override // defpackage.t01
    public final void J(axj axjVar) {
        axj axjVar2 = this.f;
        if (axjVar2 != null && axjVar != axjVar2) {
            j3f.b("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.f + ", new instance: " + axjVar);
        }
        this.f = axjVar;
    }

    @Override // defpackage.t01
    public final void K() {
        this.f = null;
        a5f a5fVar = this.i;
        if (a5fVar != null) {
            a5fVar.b(this);
        }
    }

    public final Object R(sq3 sq3Var) {
        float w = d2a.w(sq3Var.getContext());
        if (w <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            T();
            return Unit.a;
        }
        this.r = w;
        Object p = bea.y(sq3Var.getContext()).p(this.s, sq3Var);
        return p == lu3.a ? p : Unit.a;
    }

    public final void T() {
        axj axjVar = this.f;
        if (axjVar != null) {
            axjVar.c();
        }
        this.o.d();
        if (this.p != null) {
            this.p = null;
            Z(1.0f);
            Y();
        }
    }

    public final void U() {
        axj axjVar = this.f;
        if (axjVar == null) {
            return;
        }
        h0h h0hVar = this.p;
        if (h0hVar == null) {
            if (this.g > 0) {
                xnh xnhVar = this.j;
                if (xnhVar.h() != 1.0f && !Intrinsics.c(((eoh) this.d).getValue(), ((eoh) this.c).getValue())) {
                    h0h h0hVar2 = new h0h();
                    h0hVar2.d = xnhVar.h();
                    long j = this.g;
                    h0hVar2.g = j;
                    h0hVar2.h = wzb.c((1.0d - xnhVar.h()) * j);
                    h0hVar2.e.e(xnhVar.h(), 0);
                    h0hVar = h0hVar2;
                }
            }
            h0hVar = null;
        }
        if (h0hVar != null) {
            h0hVar.g = this.g;
            this.o.a(h0hVar);
            axjVar.o(h0hVar);
        }
        this.p = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0071, code lost:
    
        if (defpackage.bea.y(r0.getContext()).p(r10.q, r0) == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object W(sq3 sq3Var) {
        j0h j0hVar;
        Object obj;
        int i;
        l0d l0dVar;
        if (sq3Var instanceof j0h) {
            j0hVar = (j0h) sq3Var;
            int i2 = j0hVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                j0hVar.t = i2 - Integer.MIN_VALUE;
                Object obj2 = j0hVar.r;
                obj = lu3.a;
                i = j0hVar.t;
                l0dVar = this.o;
                if (i != 0) {
                    y6a.M(obj2);
                    if (l0dVar.h() && this.p == null) {
                        return Unit.a;
                    }
                    if (d2a.w(j0hVar.getContext()) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        T();
                        this.n = Long.MIN_VALUE;
                        return Unit.a;
                    }
                    if (this.n == Long.MIN_VALUE) {
                        j0hVar.t = 1;
                    }
                } else {
                    if (i != 1 && i != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj2);
                }
                do {
                    if (l0dVar.i() && this.p == null) {
                        this.n = Long.MIN_VALUE;
                        return Unit.a;
                    }
                    j0hVar.t = 2;
                } while (R(j0hVar) != obj);
                return obj;
            }
        }
        j0hVar = new j0h(this, sq3Var);
        Object obj22 = j0hVar.r;
        obj = lu3.a;
        i = j0hVar.t;
        l0dVar = this.o;
        if (i != 0) {
        }
        do {
            if (l0dVar.i()) {
            }
            j0hVar.t = 2;
        } while (R(j0hVar) != obj);
        return obj;
    }

    public final Object X(float f, Object obj, hoi hoiVar) {
        if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT > f || f > 1.0f) {
            j3f.a("Expecting fraction between 0 and 1. Got " + f);
        }
        axj axjVar = this.f;
        if (axjVar == null) {
            return Unit.a;
        }
        Object a = r1d.a(this.m, new l0h(obj, ((eoh) this.c).getValue(), this, axjVar, f, null), hoiVar);
        return a == lu3.a ? a : Unit.a;
    }

    public final void Y() {
        axj axjVar = this.f;
        if (axjVar == null) {
            return;
        }
        axjVar.n(wzb.c(this.j.h() * axjVar.h()));
    }

    public final void Z(float f) {
        this.j.i(f);
    }

    public final void a0(a5f a5fVar) {
        imf imfVar;
        if (Intrinsics.c(this.i, a5fVar)) {
            return;
        }
        a5f a5fVar2 = this.i;
        if (a5fVar2 != null) {
            a5fVar2.b(this);
        }
        a5f a5fVar3 = this.i;
        if (a5fVar3 != null && (imfVar = (imf) a5fVar3.i) != null) {
            imfVar.f();
        }
        this.i = a5fVar;
        if (a5fVar != null) {
            a5fVar.j();
        }
        a5f a5fVar4 = this.i;
        if (a5fVar4 != null) {
            a5fVar4.i(this, yso.o, this.h);
        }
    }

    public final Object b0(Object obj, hoi hoiVar) {
        axj axjVar = this.f;
        if (axjVar == null) {
            return Unit.a;
        }
        if (Intrinsics.c(((eoh) this.d).getValue(), obj) && Intrinsics.c(((eoh) this.c).getValue(), obj)) {
            return Unit.a;
        }
        Object a = r1d.a(this.m, new i0h(this, obj, axjVar, (rq3) null), hoiVar);
        return a == lu3.a ? a : Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
    
        if (r4.e(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c0(sq3 sq3Var) {
        m0h m0hVar;
        lu3 lu3Var;
        int i;
        Object value;
        Object q;
        Object obj;
        if (sq3Var instanceof m0h) {
            m0hVar = (m0h) sq3Var;
            int i2 = m0hVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                m0hVar.u = i2 - Integer.MIN_VALUE;
                Object obj2 = m0hVar.s;
                lu3Var = lu3.a;
                i = m0hVar.u;
                j2d j2dVar = this.l;
                if (i != 0) {
                    y6a.M(obj2);
                    value = ((eoh) this.c).getValue();
                    m0hVar.r = value;
                    m0hVar.u = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj = m0hVar.r;
                        y6a.M(obj2);
                        if (!Intrinsics.c(obj2, obj)) {
                            return Unit.a;
                        }
                        this.n = Long.MIN_VALUE;
                        throw new CancellationException("targetState while waiting for composition");
                    }
                    Object obj3 = m0hVar.r;
                    y6a.M(obj2);
                    value = obj3;
                }
                m0hVar.r = value;
                m0hVar.u = 2;
                lj2 lj2Var = new lj2(1, z9a.b(m0hVar));
                lj2Var.t();
                this.k = lj2Var;
                j2dVar.f(null);
                q = lj2Var.q();
                if (q != lu3Var) {
                    obj = value;
                    obj2 = q;
                    if (!Intrinsics.c(obj2, obj)) {
                    }
                }
                return lu3Var;
            }
        }
        m0hVar = new m0h(this, sq3Var);
        Object obj22 = m0hVar.s;
        lu3Var = lu3.a;
        i = m0hVar.u;
        j2d j2dVar2 = this.l;
        if (i != 0) {
        }
        m0hVar.r = value;
        m0hVar.u = 2;
        lj2 lj2Var2 = new lj2(1, z9a.b(m0hVar));
        lj2Var2.t();
        this.k = lj2Var2;
        j2dVar2.f(null);
        q = lj2Var2.q();
        if (q != lu3Var) {
        }
        return lu3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004f, code lost:
    
        if (r5.e(r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d0(sq3 sq3Var) {
        n0h n0hVar;
        int i;
        Object value;
        Object obj;
        if (sq3Var instanceof n0h) {
            n0hVar = (n0h) sq3Var;
            int i2 = n0hVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                n0hVar.u = i2 - Integer.MIN_VALUE;
                Object obj2 = n0hVar.s;
                lu3 lu3Var = lu3.a;
                i = n0hVar.u;
                j2d j2dVar = this.l;
                if (i != 0) {
                    y6a.M(obj2);
                    value = ((eoh) this.c).getValue();
                    n0hVar.r = value;
                    n0hVar.u = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj = n0hVar.r;
                        y6a.M(obj2);
                        if (!Intrinsics.c(obj2, obj)) {
                            this.n = Long.MIN_VALUE;
                            throw new CancellationException("snapTo() was canceled because state was changed to " + obj2 + " instead of " + obj);
                        }
                        return Unit.a;
                    }
                    Object obj3 = n0hVar.r;
                    y6a.M(obj2);
                    value = obj3;
                }
                if (!Intrinsics.c(value, this.e)) {
                    j2dVar.f(null);
                    return Unit.a;
                }
                n0hVar.r = value;
                n0hVar.u = 2;
                lj2 lj2Var = new lj2(1, z9a.b(n0hVar));
                lj2Var.t();
                this.k = lj2Var;
                j2dVar.f(null);
                Object q = lj2Var.q();
                if (q != lu3Var) {
                    obj = value;
                    obj2 = q;
                    if (!Intrinsics.c(obj2, obj)) {
                    }
                    return Unit.a;
                }
                return lu3Var;
            }
        }
        n0hVar = new n0h(this, sq3Var);
        Object obj22 = n0hVar.s;
        lu3 lu3Var2 = lu3.a;
        i = n0hVar.u;
        j2d j2dVar2 = this.l;
        if (i != 0) {
        }
        if (!Intrinsics.c(value, this.e)) {
        }
    }

    @Override // defpackage.t01
    public final Object w() {
        return ((eoh) this.d).getValue();
    }
}
