package defpackage;

import androidx.compose.runtime.e;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class a6e implements jvg {
    public final e1d A;
    public final e1d B;
    public final e1d C;
    public final e1d D;
    public final e1d E;
    public boolean a;
    public r5e b;
    public final e1d c;
    public final p5c d;
    public int e;
    public int f;
    public long g;
    public long h;
    public float i;
    public float j;
    public final ls4 k;
    public final boolean l;
    public final e1d m;
    public kx4 n;
    public int o;
    public final xzc p;
    public final znh q;
    public final znh r;
    public final era s;
    public final j5e t;
    public final cqa u;
    public final nw0 v;
    public final e1d w;
    public final npa x;
    public final bra y;
    public final e1d z;

    public a6e(int i, float f) {
        double d = f;
        if (-0.5d > d || d > 0.5d) {
            u3a.a("currentPageOffsetFraction " + f + " is not within the range -0.5 to 0.5");
        }
        this.c = e.f(new dnd(0L));
        p5c p5cVar = new p5c();
        p5cVar.b = this;
        p5cVar.c = e.c(i);
        p5cVar.d = e.b(f);
        p5cVar.f = new yqa(i, 30, 100);
        this.d = p5cVar;
        this.e = i;
        this.g = Long.MAX_VALUE;
        final int i2 = 0;
        this.k = new ls4(new Function1(this) { // from class: w5e
            public final /* synthetic */ a6e b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:39:0x00b3  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00f2  */
            /* JADX WARN: Removed duplicated region for block: B:43:0x00c0  */
            /* JADX WARN: Type inference failed for: r0v4 */
            /* JADX WARN: Type inference failed for: r0v5 */
            /* JADX WARN: Type inference failed for: r0v7 */
            /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Float] */
            /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Number] */
            /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Long] */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke(Object obj) {
                r5e r5eVar;
                int i3 = i2;
                r5e r5eVar2 = null;
                a6e a6eVar = this.b;
                switch (i3) {
                    case 0:
                        ?? r14 = (Float) obj;
                        float floatValue = r14.floatValue();
                        long u = t6a.u(a6eVar);
                        float f2 = a6eVar.i + floatValue;
                        long c = wzb.c(f2);
                        a6eVar.i = f2 - c;
                        if (Math.abs(floatValue) >= 1.0E-4f) {
                            long j = u + c;
                            long e = llf.e(j, a6eVar.h, a6eVar.g);
                            ?? r0 = j != e;
                            long j2 = e - u;
                            float f3 = j2;
                            a6eVar.j = f3;
                            long abs = Math.abs(j2);
                            float f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            if (abs != 0) {
                                ((eoh) a6eVar.D).setValue(Boolean.valueOf(f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                                ((eoh) a6eVar.E).setValue(Boolean.valueOf(f3 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                            }
                            int i4 = (int) j2;
                            int i5 = -i4;
                            r5e d2 = ((r5e) ((eoh) a6eVar.m).getValue()).d(i5);
                            if (d2 != null && (r5eVar = a6eVar.b) != null) {
                                r5e d3 = r5eVar.d(i5);
                                if (d3 != null) {
                                    a6eVar.b = d3;
                                }
                                if (r5eVar2 == null) {
                                    a6eVar.h(r5eVar2, a6eVar.a, true);
                                    a6eVar.z.setValue(Unit.a);
                                } else {
                                    p5c p5cVar2 = a6eVar.d;
                                    a6e a6eVar2 = (a6e) p5cVar2.b;
                                    xnh xnhVar = (xnh) p5cVar2.d;
                                    if (a6eVar2.p() != 0) {
                                        f4 = i4 / a6eVar2.p();
                                    }
                                    xnhVar.i(xnhVar.h() + f4);
                                    wma wmaVar = (wma) ((eoh) a6eVar.w).getValue();
                                    if (wmaVar != null) {
                                        wmaVar.l();
                                    }
                                }
                                if (r0 != false) {
                                    r14 = Long.valueOf(j2);
                                }
                                floatValue = r14.floatValue();
                            }
                            r5eVar2 = d2;
                            if (r5eVar2 == null) {
                            }
                            if (r0 != false) {
                            }
                            floatValue = r14.floatValue();
                        }
                        return Float.valueOf(floatValue);
                    default:
                        cra craVar = (cra) obj;
                        nnh w = bea.w();
                        Function1 e2 = w != null ? w.e() : null;
                        nnh C = bea.C(w);
                        try {
                            craVar.a(a6eVar.e);
                            Unit unit = Unit.a;
                            bea.K(w, C, e2);
                            return Unit.a;
                        } catch (Throwable th) {
                            bea.K(w, C, e2);
                            throw th;
                        }
                }
            }
        });
        final int i3 = 1;
        this.l = true;
        this.m = e.e(c6e.b, f7a.k);
        this.n = c6e.a;
        this.p = new xzc();
        this.q = e.c(-1);
        this.r = e.c(i);
        goh.c(new jt7(this, 3));
        goh.c(new jt7(this, 4));
        era eraVar = new era(new Function1(this) { // from class: w5e
            public final /* synthetic */ a6e b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:39:0x00b3  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00f2  */
            /* JADX WARN: Removed duplicated region for block: B:43:0x00c0  */
            /* JADX WARN: Type inference failed for: r0v4 */
            /* JADX WARN: Type inference failed for: r0v5 */
            /* JADX WARN: Type inference failed for: r0v7 */
            /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Float] */
            /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Number] */
            /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Long] */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke(Object obj) {
                r5e r5eVar;
                int i32 = i3;
                r5e r5eVar2 = null;
                a6e a6eVar = this.b;
                switch (i32) {
                    case 0:
                        ?? r14 = (Float) obj;
                        float floatValue = r14.floatValue();
                        long u = t6a.u(a6eVar);
                        float f2 = a6eVar.i + floatValue;
                        long c = wzb.c(f2);
                        a6eVar.i = f2 - c;
                        if (Math.abs(floatValue) >= 1.0E-4f) {
                            long j = u + c;
                            long e = llf.e(j, a6eVar.h, a6eVar.g);
                            ?? r0 = j != e;
                            long j2 = e - u;
                            float f3 = j2;
                            a6eVar.j = f3;
                            long abs = Math.abs(j2);
                            float f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            if (abs != 0) {
                                ((eoh) a6eVar.D).setValue(Boolean.valueOf(f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                                ((eoh) a6eVar.E).setValue(Boolean.valueOf(f3 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                            }
                            int i4 = (int) j2;
                            int i5 = -i4;
                            r5e d2 = ((r5e) ((eoh) a6eVar.m).getValue()).d(i5);
                            if (d2 != null && (r5eVar = a6eVar.b) != null) {
                                r5e d3 = r5eVar.d(i5);
                                if (d3 != null) {
                                    a6eVar.b = d3;
                                }
                                if (r5eVar2 == null) {
                                    a6eVar.h(r5eVar2, a6eVar.a, true);
                                    a6eVar.z.setValue(Unit.a);
                                } else {
                                    p5c p5cVar2 = a6eVar.d;
                                    a6e a6eVar2 = (a6e) p5cVar2.b;
                                    xnh xnhVar = (xnh) p5cVar2.d;
                                    if (a6eVar2.p() != 0) {
                                        f4 = i4 / a6eVar2.p();
                                    }
                                    xnhVar.i(xnhVar.h() + f4);
                                    wma wmaVar = (wma) ((eoh) a6eVar.w).getValue();
                                    if (wmaVar != null) {
                                        wmaVar.l();
                                    }
                                }
                                if (r0 != false) {
                                    r14 = Long.valueOf(j2);
                                }
                                floatValue = r14.floatValue();
                            }
                            r5eVar2 = d2;
                            if (r5eVar2 == null) {
                            }
                            if (r0 != false) {
                            }
                            floatValue = r14.floatValue();
                        }
                        return Float.valueOf(floatValue);
                    default:
                        cra craVar = (cra) obj;
                        nnh w = bea.w();
                        Function1 e2 = w != null ? w.e() : null;
                        nnh C = bea.C(w);
                        try {
                            craVar.a(a6eVar.e);
                            Unit unit = Unit.a;
                            bea.K(w, C, e2);
                            return Unit.a;
                        } catch (Throwable th) {
                            bea.K(w, C, e2);
                            throw th;
                        }
                }
            }
        });
        this.s = eraVar;
        this.t = new j5e(new yia(this, 9), eraVar, new jt7(this, 5));
        this.u = new cqa(0);
        this.v = new nw0();
        this.w = e.f(null);
        this.x = new npa(this, 2);
        cn3.b(0, 0, 0, 0, 15);
        this.y = new bra();
        this.z = b0a.D();
        this.A = b0a.D();
        Boolean bool = Boolean.FALSE;
        this.B = e.f(bool);
        this.C = e.f(bool);
        this.D = e.f(bool);
        this.E = e.f(bool);
    }

    public static /* synthetic */ Object g(a6e a6eVar, int i, i4k i4kVar, hoi hoiVar, int i2) {
        c80 c80Var = i4kVar;
        if ((i2 & 4) != 0) {
            c80Var = s02.e0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 7);
        }
        return a6eVar.f(i, c80Var, hoiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0074, code lost:
    
        if (r9.a(r7, r8, r0) != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0076, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        if (r6.i(r0) == r1) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object s(a6e a6eVar, m1d m1dVar, Function2 function2, rq3 rq3Var) {
        z5e z5eVar;
        int i;
        Function2 function22;
        if (rq3Var instanceof z5e) {
            z5eVar = (z5e) rq3Var;
            int i2 = z5eVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                z5eVar.w = i2 - Integer.MIN_VALUE;
                Object obj = z5eVar.u;
                lu3 lu3Var = lu3.a;
                i = z5eVar.w;
                if (i != 0) {
                    y6a.M(obj);
                    z5eVar.r = a6eVar;
                    z5eVar.s = m1dVar;
                    z5eVar.t = (hoi) function2;
                    z5eVar.w = 1;
                    function22 = function2;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        a6eVar = z5eVar.r;
                        y6a.M(obj);
                        a6eVar.q.i(-1);
                        return Unit.a;
                    }
                    Function2 function23 = (Function2) z5eVar.t;
                    m1dVar = z5eVar.s;
                    a6eVar = z5eVar.r;
                    y6a.M(obj);
                    function22 = function23;
                }
                if (!a6eVar.k.b()) {
                    a6eVar.r.i(a6eVar.k());
                }
                ls4 ls4Var = a6eVar.k;
                z5eVar.r = a6eVar;
                z5eVar.s = null;
                z5eVar.t = null;
                z5eVar.w = 2;
            }
        }
        z5eVar = new z5e(a6eVar, rq3Var);
        Object obj2 = z5eVar.u;
        lu3 lu3Var2 = lu3.a;
        i = z5eVar.w;
        if (i != 0) {
        }
        if (!a6eVar.k.b()) {
        }
        ls4 ls4Var2 = a6eVar.k;
        z5eVar.r = a6eVar;
        z5eVar.s = null;
        z5eVar.t = null;
        z5eVar.w = 2;
    }

    public static Object t(a6e a6eVar, int i, hoi hoiVar) {
        a6eVar.getClass();
        Object a = a6eVar.a(m1d.a, new qu1(a6eVar, i, (rq3) null, 22), hoiVar);
        return a == lu3.a ? a : Unit.a;
    }

    @Override // defpackage.jvg
    public final Object a(m1d m1dVar, Function2 function2, rq3 rq3Var) {
        return s(this, m1dVar, function2, rq3Var);
    }

    @Override // defpackage.jvg
    public final boolean b() {
        return this.k.b();
    }

    @Override // defpackage.jvg
    public final boolean c() {
        return ((Boolean) ((eoh) this.C).getValue()).booleanValue();
    }

    @Override // defpackage.jvg
    public final boolean d() {
        return ((Boolean) ((eoh) this.B).getValue()).booleanValue();
    }

    @Override // defpackage.jvg
    public final float e(float f) {
        return this.k.e(f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x007f, code lost:
    
        if (a(defpackage.m1d.a, r6, r0) != r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0081, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0060, code lost:
    
        if (i(r0) == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(int i, c80 c80Var, sq3 sq3Var) {
        x5e x5eVar;
        int i2;
        if (sq3Var instanceof x5e) {
            x5eVar = (x5e) sq3Var;
            int i3 = x5eVar.v;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                x5eVar.v = i3 - Integer.MIN_VALUE;
                Object obj = x5eVar.t;
                Object obj2 = lu3.a;
                i2 = x5eVar.v;
                if (i2 != 0) {
                    y6a.M(obj);
                    if ((i == k() && l() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) || n() == 0) {
                        return Unit.a;
                    }
                    x5eVar.s = c80Var;
                    x5eVar.r = i;
                    x5eVar.v = 1;
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = x5eVar.r;
                    c80Var = x5eVar.s;
                    y6a.M(obj);
                }
                Function2 y5eVar = new y5e(this, j(i), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT * p(), c80Var, null);
                x5eVar.s = null;
                x5eVar.v = 2;
            }
        }
        x5eVar = new x5e(this, sq3Var);
        Object obj3 = x5eVar.t;
        Object obj22 = lu3.a;
        i2 = x5eVar.v;
        if (i2 != 0) {
        }
        Function2 y5eVar2 = new y5e(this, j(i), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT * p(), c80Var, null);
        x5eVar.s = null;
        x5eVar.v = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0342, code lost:
    
        if (r() == false) goto L136;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0233 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02b3  */
    /* JADX WARN: Type inference failed for: r5v22, types: [int] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(r5e r5eVar, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        qf2 qf2Var;
        List list;
        ?? r5;
        long c;
        long j;
        List list2 = r5eVar.a;
        int i = r5eVar.l;
        n1c n1cVar = r5eVar.i;
        n1c n1cVar2 = r5eVar.j;
        float f = r5eVar.k;
        this.s.e = list2.size();
        int i2 = r5eVar.b;
        this.o = r5eVar.c + i2;
        if (!z && this.a) {
            this.b = r5eVar;
            return;
        }
        boolean z9 = true;
        if (z) {
            this.a = true;
        }
        j5e j5eVar = this.t;
        boolean z10 = this.l;
        p5c p5cVar = this.d;
        if (z2) {
            ((xnh) p5cVar.d).i(f);
        } else {
            p5cVar.getClass();
            p5cVar.e = n1cVar2 != null ? n1cVar2.d : null;
            if (p5cVar.a || !list2.isEmpty()) {
                p5cVar.a = true;
                int i3 = n1cVar2 != null ? n1cVar2.a : 0;
                ((znh) p5cVar.c).i(i3);
                ((yqa) p5cVar.f).c(i3);
                ((xnh) p5cVar.d).i(f);
            }
            if (z10) {
                boolean z11 = z10;
                sx2 sx2Var = j5eVar.o;
                uzc uzcVar = j5eVar.e;
                sx2Var.b = r5eVar;
                sx2Var.c = j5eVar.n;
                yia yiaVar = j5eVar.a;
                int i4 = j5eVar.g;
                int i5 = -1;
                float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if (i4 != -1 && i4 != sx2Var.E()) {
                    j5eVar.l = true;
                    if (sx2Var.w()) {
                        int i6 = j5eVar.h;
                        if (i6 < 0) {
                            i6 = 0;
                        }
                        j5eVar.h = i6;
                        int E = sx2Var.A().a.isEmpty() ? -1 : sx2Var.E() - 1;
                        if (E != -1) {
                            int i7 = j5eVar.i;
                            if (i7 <= E) {
                                E = i7;
                            }
                            j5eVar.i = E;
                        }
                        if (j5eVar.f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            j5eVar.f(sx2Var.y(), j5eVar.m - 1);
                        } else {
                            j5eVar.f(0, sx2Var.v());
                        }
                    }
                }
                j5eVar.m = sx2Var.E();
                if (sx2Var.w()) {
                    int size = sx2Var.A().r.size() + sx2Var.A().a.size() + sx2Var.A().q.size();
                    int i8 = 0;
                    while (i8 < size) {
                        int size2 = sx2Var.A().q.size();
                        float f3 = f2;
                        int size3 = sx2Var.A().a.size();
                        int i9 = i8 < size2 ? ((n1c) sx2Var.A().q.get(i8)).a : (i8 < size2 || i8 >= size2 + size3) ? i8 >= size2 + size3 ? ((n1c) sx2Var.A().r.get((i8 - size2) - size3)).a : i5 : ((n1c) sx2Var.A().a.get(i8 - size2)).a;
                        int size4 = sx2Var.A().q.size();
                        int size5 = sx2Var.A().a.size();
                        Object obj = i8 < size4 ? ((n1c) sx2Var.A().q.get(i8)).d : (i8 < size4 || i8 >= size4 + size5) ? i8 >= size4 + size5 ? ((n1c) sx2Var.A().r.get((i8 - size4) - size5)).d : qf2.c : ((n1c) sx2Var.A().a.get(i8 - size4)).d;
                        int i10 = sx2Var.A().b;
                        if (i9 != -1) {
                            if (uzcVar.a(i9)) {
                                Object b = uzcVar.b(i9);
                                b.getClass();
                                int i11 = ((qf2) b).b;
                                Object b2 = uzcVar.b(i9);
                                b2.getClass();
                                z7 = z11;
                                Object obj2 = ((qf2) b2).a;
                                if (i11 != i10 || !Intrinsics.c(obj2, obj)) {
                                    z8 = true;
                                    j5eVar.l = true;
                                    qf2Var = (qf2) uzcVar.b(i9);
                                    if (qf2Var == null) {
                                        qf2Var.b = i10;
                                        qf2Var.a = obj;
                                    } else {
                                        qf2Var = new qf2();
                                        qf2Var.a = obj;
                                        qf2Var.b = i10;
                                    }
                                    uzcVar.i(i9, qf2Var);
                                    j5eVar.h = Math.min(j5eVar.h, i9);
                                    j5eVar.i = Math.max(j5eVar.i, i9);
                                    list = (List) j5eVar.b.g(i9);
                                    if (list == null) {
                                        int size6 = list.size();
                                        for (int i12 = 0; i12 < size6; i12++) {
                                            ((dra) list.get(i12)).cancel();
                                        }
                                    }
                                }
                            } else {
                                z7 = z11;
                            }
                            z8 = true;
                            qf2Var = (qf2) uzcVar.b(i9);
                            if (qf2Var == null) {
                            }
                            uzcVar.i(i9, qf2Var);
                            j5eVar.h = Math.min(j5eVar.h, i9);
                            j5eVar.i = Math.max(j5eVar.i, i9);
                            list = (List) j5eVar.b.g(i9);
                            if (list == null) {
                            }
                        } else {
                            z7 = z11;
                            z8 = true;
                        }
                        i8++;
                        f2 = f3;
                        z9 = z8;
                        z11 = z7;
                        i5 = -1;
                    }
                    z3 = z11;
                    z4 = z9;
                    float f4 = f2;
                    if (j5eVar.l) {
                        boolean z12 = j5eVar.f <= f4 ? z4 : false;
                        if (sx2Var.w()) {
                            o6a.E(sx2Var.A());
                            z6 = false;
                            j5eVar.d(sx2Var, sx2Var.v(), sx2Var.y(), sx2Var.A().t != null ? ((a6e) yiaVar.b).o : 0, sx2Var.B(), sx2Var.C(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, z12);
                        } else {
                            z6 = false;
                        }
                        j5eVar.l = z6;
                        z5 = z6;
                    } else {
                        z5 = false;
                    }
                } else {
                    z3 = z11;
                    z4 = true;
                    z5 = false;
                    j5eVar.g();
                }
                j5eVar.g = sx2Var.E();
                r5 = z5;
                ((eoh) this.m).setValue(r5eVar);
                ((eoh) this.B).setValue(Boolean.valueOf(r5eVar.m));
                ((eoh) this.C).setValue(Boolean.valueOf(((n1cVar == null ? n1cVar.a : r5) == 0 || i != 0) ? z4 : r5));
                if (n1cVar != null) {
                    this.e = n1cVar.a;
                }
                this.f = i;
                nnh w = bea.w();
                Function1 e = w != null ? w.e() : null;
                nnh C = bea.C(w);
                if (z3) {
                    try {
                        if (r5eVar.h < n() && Math.abs(this.j) > 0.5f) {
                            float f5 = this.j;
                            if (m().e == ewd.a) {
                                if (Math.signum(f5) == Math.signum(-Float.intBitsToFloat((int) (q() & 4294967295L)))) {
                                    j5eVar.e(this.j, r5eVar);
                                    Unit unit = Unit.a;
                                }
                            } else if (Math.signum(f5) == Math.signum(-Float.intBitsToFloat((int) (q() >> 32)))) {
                                j5eVar.e(this.j, r5eVar);
                                Unit unit2 = Unit.a;
                            }
                        }
                    } finally {
                        bea.K(w, C, e);
                    }
                }
                this.g = c6e.a(r5eVar, n());
                n();
                int e2 = (int) (r5eVar.e != ewd.b ? r5eVar.e() >> 32 : r5eVar.e() & 4294967295L);
                c = llf.c(r5eVar.n.a(e2, i2, -r5eVar.f, r5eVar.d), r5, e2);
                j = this.g;
                if (c > j) {
                    c = j;
                }
                this.h = c;
            }
        }
        z4 = true;
        z3 = z10;
        r5 = 0;
        ((eoh) this.m).setValue(r5eVar);
        ((eoh) this.B).setValue(Boolean.valueOf(r5eVar.m));
        ((eoh) this.C).setValue(Boolean.valueOf(((n1cVar == null ? n1cVar.a : r5) == 0 || i != 0) ? z4 : r5));
        if (n1cVar != null) {
        }
        this.f = i;
        nnh w2 = bea.w();
        Function1 e3 = w2 != null ? w2.e() : null;
        nnh C2 = bea.C(w2);
        if (z3) {
        }
        this.g = c6e.a(r5eVar, n());
        n();
        int e22 = (int) (r5eVar.e != ewd.b ? r5eVar.e() >> 32 : r5eVar.e() & 4294967295L);
        c = llf.c(r5eVar.n.a(e22, i2, -r5eVar.f, r5eVar.d), r5, e22);
        j = this.g;
        if (c > j) {
        }
        this.h = c;
    }

    public final Object i(sq3 sq3Var) {
        if (((eoh) this.m).getValue() != c6e.b) {
            return Unit.a;
        }
        Object i = this.v.i(sq3Var);
        return i == lu3.a ? i : Unit.a;
    }

    public final int j(int i) {
        if (n() > 0) {
            return llf.c(i, 0, n() - 1);
        }
        return 0;
    }

    public final int k() {
        return ((znh) this.d.c).h();
    }

    public final float l() {
        return ((xnh) this.d.d).h();
    }

    public final r5e m() {
        return (r5e) ((eoh) this.m).getValue();
    }

    public abstract int n();

    public final int o() {
        return ((r5e) ((eoh) this.m).getValue()).b;
    }

    public final int p() {
        return ((r5e) ((eoh) this.m).getValue()).c + o();
    }

    public final long q() {
        return ((dnd) ((eoh) this.c).getValue()).a;
    }

    public final boolean r() {
        return ((int) Float.intBitsToFloat((int) (q() >> 32))) == 0 && ((int) Float.intBitsToFloat((int) (q() & 4294967295L))) == 0;
    }

    public final void u(int i, float f, boolean z) {
        p5c p5cVar = this.d;
        znh znhVar = (znh) p5cVar.c;
        xnh xnhVar = (xnh) p5cVar.d;
        if (znhVar.h() != i || xnhVar.h() != f) {
            this.t.g();
        }
        ((znh) p5cVar.c).i(i);
        ((yqa) p5cVar.f).c(i);
        xnhVar.i(f);
        p5cVar.e = null;
        if (!z) {
            this.A.setValue(Unit.a);
            return;
        }
        wma wmaVar = (wma) ((eoh) this.w).getValue();
        if (wmaVar != null) {
            wmaVar.l();
        }
    }
}
