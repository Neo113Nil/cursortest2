package defpackage;

import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class k95 extends bw4 implements pze, a2a, ug3, xw8 {
    public n85 A;
    public m85 B;
    public l85 C;
    public z8e D;
    public yia E;
    public am0 G;
    public y1a H;
    public ewd q;
    public Function1 r;
    public boolean s;
    public wzc t;
    public zw8 u;
    public g62 v;
    public m95 w;
    public boolean x;
    public boolean y;
    public k85 z;
    public long F = 9205357640488583168L;
    public long I = 0;

    public k95(Function1 function1, boolean z, wzc wzcVar, ewd ewdVar) {
        this.q = ewdVar;
        this.r = function1;
        this.s = z;
        this.t = wzcVar;
    }

    public static void r1(k95 k95Var, mze mzeVar, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        m85 m85Var = k95Var.B;
        if (m85Var == null) {
            m85Var = new m85();
            m85Var.n = null;
            m85Var.o = Long.MAX_VALUE;
            m85Var.p = false;
            k95Var.B = m85Var;
        }
        m85Var.n = mzeVar;
        m85Var.o = j;
        am0 am0Var = k95Var.G;
        ewd ewdVar = k95Var.q;
        if (am0Var == null) {
            k95Var.G = new am0(ewdVar);
        } else {
            am0Var.c = ewdVar;
            am0Var.b = j2;
        }
        m85Var.p = false;
        k95Var.D = m85Var;
    }

    public final void A1(long j, mze mzeVar) {
        long I = c6o.b0(this.a).I(0L);
        if (!dnd.c(this.F, 9205357640488583168L) && !dnd.c(I, this.F)) {
            this.I = dnd.i(this.I, dnd.h(I, this.F));
        }
        this.F = I;
        y6a.r(z1(), mzeVar, this.I);
        y1().d(new q85(j, false));
    }

    public void B(fze fzeVar, gze gzeVar, long j) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        boolean z = true;
        this.y = true;
        if (this.u == null) {
            zw8 zw8Var = new zw8(this);
            k1(zw8Var);
            this.u = zw8Var;
        }
        if (this.s) {
            z8e z8eVar = this.D;
            int i = 0;
            z8e z8eVar2 = z8eVar;
            if (z8eVar == null) {
                k85 k85Var = this.z;
                k85 k85Var2 = k85Var;
                if (k85Var == null) {
                    j85 j85Var = j85.c;
                    k85 k85Var3 = new k85();
                    k85Var3.n = j85Var;
                    k85Var3.o = false;
                    this.z = k85Var3;
                    k85Var2 = k85Var3;
                }
                this.D = k85Var2;
                z8eVar2 = k85Var2;
            }
            if (z8eVar2 instanceof k85) {
                k85 k85Var4 = (k85) z8eVar2;
                if (!fzeVar.a.isEmpty() && rti.e(fzeVar, false)) {
                    mze mzeVar = (mze) CollectionsKt.Y(fzeVar.a);
                    j85 j85Var2 = f95.a[k85Var4.n.ordinal()] == 1 ? !C1() ? j85.a : j85.b : k85Var4.n;
                    k85Var4.n = j85Var2;
                    if (gzeVar == gze.a && j85Var2 == j85.b) {
                        mzeVar.a();
                        k85Var4.o = true;
                    }
                    if (gzeVar == gze.b) {
                        if (j85Var2 == j85.a) {
                            r1(this, mzeVar, mzeVar.a, 0L, 12);
                            return;
                        }
                        if (k85Var4.o) {
                            B1(mzeVar, mzeVar, 0L);
                            A1(0L, mzeVar);
                            long j2 = mzeVar.a;
                            n85 n85Var = this.A;
                            if (n85Var == null) {
                                n85Var = new n85();
                                n85Var.n = Long.MAX_VALUE;
                                this.A = n85Var;
                            }
                            n85Var.n = j2;
                            this.D = n85Var;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            Object obj5 = null;
            if (!(z8eVar2 instanceof m85)) {
                if (z8eVar2 instanceof l85) {
                    l85 l85Var = (l85) z8eVar2;
                    if (gzeVar != gze.c) {
                        return;
                    }
                    List list = fzeVar.a;
                    int size = list.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            break;
                        }
                        if (((mze) list.get(i2)).b()) {
                            z = false;
                            break;
                        }
                        i2++;
                    }
                    int size2 = list.size();
                    while (true) {
                        if (i >= size2) {
                            break;
                        }
                        if (!((mze) list.get(i)).d) {
                            i++;
                        } else if (!list.isEmpty()) {
                            if (z) {
                                long j3 = ((mze) CollectionsKt.Y(list)).c;
                                mze mzeVar2 = l85Var.n;
                                mzeVar2.getClass();
                                long h = dnd.h(j3, mzeVar2.c);
                                mze mzeVar3 = l85Var.n;
                                if (mzeVar3 != null) {
                                    r1(this, mzeVar3, l85Var.o, h, 8);
                                    return;
                                } else {
                                    a70.p("AwaitGesturePickup.initialDown was not initialized.");
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    p1();
                    return;
                }
                if (!(z8eVar2 instanceof n85)) {
                    zzl.b();
                    return;
                }
                n85 n85Var2 = (n85) z8eVar2;
                if (gzeVar != gze.b) {
                    return;
                }
                long j4 = n85Var2.n;
                List list2 = fzeVar.a;
                int size3 = list2.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size3) {
                        obj = null;
                        break;
                    }
                    obj = list2.get(i3);
                    if (ufa.o(((mze) obj).a, j4)) {
                        break;
                    } else {
                        i3++;
                    }
                }
                mze mzeVar4 = (mze) obj;
                if (mzeVar4 == null) {
                    return;
                }
                boolean n = qea.n(mzeVar4);
                Object obj6 = p85.a;
                if (!n) {
                    if (mzeVar4.b()) {
                        y1().d(obj6);
                        return;
                    } else {
                        if (dnd.d(qea.E(mzeVar4, true)) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            return;
                        }
                        A1(qea.E(mzeVar4, false), mzeVar4);
                        mzeVar4.a();
                        return;
                    }
                }
                List list3 = fzeVar.a;
                int size4 = list3.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size4) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list3.get(i4);
                    if (((mze) obj2).d) {
                        break;
                    } else {
                        i4++;
                    }
                }
                mze mzeVar5 = (mze) obj2;
                if (mzeVar5 != null) {
                    n85Var2.n = mzeVar5.a;
                    return;
                }
                if (mzeVar4.b() || !qea.n(mzeVar4)) {
                    y1().d(obj6);
                } else {
                    y6a.r(z1(), mzeVar4, 0L);
                    float f = ((hsk) tgj.x(this, dh3.t)).f();
                    long d = z1().d(t6a.i(f, f));
                    ou4 ou4Var = (ou4) z1().b;
                    xmk xmkVar = (xmk) ou4Var.b;
                    mh0.m(0, r6.length, null, xmkVar.d);
                    xmkVar.e = 0;
                    xmk xmkVar2 = (xmk) ou4Var.c;
                    mh0.m(0, r6.length, null, xmkVar2.d);
                    xmkVar2.e = 0;
                    ou4Var.a = 0L;
                    y1().d(new s85(w95.a(d), false));
                    this.y = false;
                }
                p1();
                return;
            }
            m85 m85Var = (m85) z8eVar2;
            if (gzeVar == gze.a) {
                return;
            }
            List list4 = fzeVar.a;
            int size5 = list4.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size5) {
                    obj3 = null;
                    break;
                }
                obj3 = list4.get(i5);
                if (ufa.o(((mze) obj3).a, m85Var.o)) {
                    break;
                } else {
                    i5++;
                }
            }
            mze mzeVar6 = (mze) obj3;
            if (mzeVar6 == null) {
                int size6 = list4.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size6) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list4.get(i6);
                    if (((mze) obj4).d) {
                        break;
                    } else {
                        i6++;
                    }
                }
                mzeVar6 = (mze) obj4;
                if (mzeVar6 == null) {
                    p1();
                    return;
                }
                m85Var.o = mzeVar6.a;
            }
            if (gzeVar == gze.b) {
                if (mzeVar6.b()) {
                    mze mzeVar7 = m85Var.n;
                    if (mzeVar7 == null) {
                        a70.p("AwaitTouchSlop.initialDown was not initialized");
                        return;
                    }
                    long j5 = m85Var.o;
                    am0 am0Var = this.G;
                    if (am0Var == null) {
                        a70.p("AwaitTouchSlop.touchSlopDetector was not initialized");
                        return;
                    }
                    q1(mzeVar7, j5, am0Var);
                } else if (qea.n(mzeVar6)) {
                    int size7 = list4.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= size7) {
                            break;
                        }
                        Object obj7 = list4.get(i7);
                        if (((mze) obj7).d) {
                            obj5 = obj7;
                            break;
                        }
                        i7++;
                    }
                    mze mzeVar8 = (mze) obj5;
                    if (mzeVar8 == null) {
                        p1();
                    } else {
                        m85Var.o = mzeVar8.a;
                    }
                } else {
                    float i8 = e95.i((hsk) tgj.x(this, dh3.t), mzeVar6.i);
                    am0 am0Var2 = this.G;
                    if (am0Var2 == null) {
                        a70.p("Touch slop detector not initialized.");
                        return;
                    }
                    long u = am0Var2.u(qea.E(mzeVar6, true), i8, true);
                    if ((9223372034707292159L & u) != 9205357640488583168L) {
                        boolean F0 = F0(mzeVar6);
                        jyj C = jca.C(this, zw8.p);
                        zw8 zw8Var2 = C instanceof zw8 ? (zw8) C : null;
                        xw8 xw8Var = zw8Var2 != null ? zw8Var2.o : null;
                        boolean z2 = xw8Var != null && xw8Var.F0(mzeVar6);
                        if (F0 || !z2) {
                            mzeVar6.a();
                            mze mzeVar9 = m85Var.n;
                            mzeVar9.getClass();
                            B1(mzeVar9, mzeVar6, u);
                            A1(u, mzeVar6);
                            long j6 = mzeVar6.a;
                            n85 n85Var3 = this.A;
                            if (n85Var3 == null) {
                                n85Var3 = new n85();
                                n85Var3.n = Long.MAX_VALUE;
                                this.A = n85Var3;
                            }
                            n85Var3.n = j6;
                            this.D = n85Var3;
                        } else {
                            m85Var.p = true;
                        }
                    } else {
                        m85Var.p = true;
                    }
                }
            }
            if (gzeVar == gze.c && m85Var.p) {
                if (!mzeVar6.b()) {
                    m85Var.p = false;
                    return;
                }
                mze mzeVar10 = m85Var.n;
                if (mzeVar10 == null) {
                    a70.p("AwaitTouchSlop.initialDown was not initialized");
                    return;
                }
                long j7 = m85Var.o;
                am0 am0Var3 = this.G;
                if (am0Var3 != null) {
                    q1(mzeVar10, j7, am0Var3);
                } else {
                    a70.p("AwaitTouchSlop.touchSlopDetector was not initialized");
                }
            }
        }
    }

    public final void B1(mze mzeVar, mze mzeVar2, long j) {
        if (this.E == null) {
            this.E = new yia((byte) 0, 26);
        }
        y6a.r(z1(), mzeVar, 0L);
        long h = dnd.h(mzeVar2.c, j);
        this.I = 0L;
        if (((Boolean) this.r.invoke(new vze(mzeVar.i))).booleanValue()) {
            if (!this.x) {
                if (this.v == null) {
                    this.v = ml4.g(Integer.MAX_VALUE, 6, null);
                }
                D1();
            }
            this.F = c6o.b0(this).I(0L);
            y1().d(new r85(h));
        }
    }

    public abstract boolean C1();

    public final void D1() {
        this.x = true;
        if (this.v == null) {
            this.v = ml4.g(Integer.MAX_VALUE, 6, null);
        }
        xw3.L(Y0(), null, null, new j95(this, null), 3);
    }

    public final void E1(Function1 function1, boolean z, wzc wzcVar, ewd ewdVar, boolean z2) {
        this.r = function1;
        boolean z3 = true;
        if (this.s != z) {
            this.s = z;
            if (!z) {
                n1();
                this.H = null;
            }
            z2 = true;
        }
        if (!Intrinsics.c(this.t, wzcVar)) {
            n1();
            this.t = wzcVar;
        }
        if (this.q != ewdVar) {
            this.q = ewdVar;
        } else {
            z3 = z2;
        }
        if (z3) {
            boolean z4 = this.y;
            p85 p85Var = p85.a;
            if (z4) {
                p1();
                if (this.x) {
                    y1().d(p85Var);
                }
                this.E = null;
            }
            y1a y1aVar = this.H;
            if (y1aVar != null) {
                y1aVar.a();
                k95 k95Var = y1aVar.a;
                if (k95Var.x) {
                    k95Var.s1(p85Var);
                }
                y1aVar.g = null;
                yz1 yz1Var = y1aVar.k;
                yz1Var.b = 0;
                ((a0d) yz1Var.c).b = 0;
            }
        }
    }

    @Override // defpackage.xw8
    public final boolean F(q1a q1aVar) {
        return z1a.l(q1aVar) && this.s;
    }

    @Override // defpackage.xw8
    public final boolean F0(mze mzeVar) {
        if (qea.l(mzeVar)) {
            return this.s;
        }
        if (!qea.n(mzeVar)) {
            if (this.G == null) {
                this.G = new am0(this.q);
            }
            float g = ((hsk) tgj.x(this, dh3.t)).g();
            long E = qea.E(mzeVar, false);
            am0 am0Var = this.G;
            if (am0Var == null) {
                a70.p("Touch slop detector not initialized.");
                return false;
            }
            if (!dnd.c(am0Var.u(E, g, false), 9205357640488583168L)) {
                long i = dnd.i(am0Var.b, E);
                double atan2 = (((float) Math.atan2(Math.abs(Float.intBitsToFloat((int) (i & 4294967295L))), Math.abs(Float.intBitsToFloat((int) (i >> 32))))) * 180.0f) / 3.141592653589793d;
                ewd ewdVar = (ewd) am0Var.c;
                int i2 = ewdVar == null ? -1 : tqj.a[ewdVar.ordinal()];
                if (i2 == 1 ? atan2 < 30.0d : !(i2 != 2 || atan2 <= 30.0d)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.a2a
    public final void K0() {
        y1a y1aVar = this.H;
        if (y1aVar != null) {
            y1aVar.a();
            k95 k95Var = y1aVar.a;
            if (k95Var.x) {
                k95Var.s1(p85.a);
            }
            y1aVar.g = null;
            yz1 yz1Var = y1aVar.k;
            yz1Var.b = 0;
            ((a0d) yz1Var.c).b = 0;
        }
    }

    @Override // defpackage.wtc
    public final void d1() {
        this.x = false;
        n1();
        this.I = 0L;
        zw8 zw8Var = this.u;
        if (zw8Var != null) {
            l1(zw8Var);
        }
        this.u = null;
    }

    public final void n1() {
        m95 m95Var = this.w;
        if (m95Var != null) {
            wzc wzcVar = this.t;
            if (wzcVar != null) {
                wzcVar.c(new l95(m95Var));
            }
            this.w = null;
        }
    }

    public abstract Object o1(j95 j95Var, j95 j95Var2);

    public final void p1() {
        k85 k85Var = this.z;
        if (k85Var == null) {
            j85 j85Var = j85.c;
            k85Var = new k85();
            k85Var.n = j85Var;
            k85Var.o = false;
            this.z = k85Var;
        }
        k85Var.n = j85.c;
        k85Var.o = false;
        this.D = k85Var;
    }

    public final void q1(mze mzeVar, long j, am0 am0Var) {
        l85 l85Var = this.C;
        if (l85Var == null) {
            l85Var = new l85();
            l85Var.n = null;
            l85Var.o = Long.MAX_VALUE;
            this.C = l85Var;
        }
        l85Var.n = mzeVar;
        l85Var.o = j;
        am0Var.b = 0L;
        this.D = l85Var;
    }

    public final void s1(t85 t85Var) {
        if ((t85Var instanceof r85) && !this.x) {
            this.x = true;
            D1();
        }
        y1().d(t85Var);
    }

    public abstract void t1(long j);

    public abstract void u1(s85 s85Var);

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v1(sq3 sq3Var) {
        g95 g95Var;
        int i;
        if (sq3Var instanceof g95) {
            g95Var = (g95) sq3Var;
            int i2 = g95Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g95Var.t = i2 - Integer.MIN_VALUE;
                Object obj = g95Var.r;
                lu3 lu3Var = lu3.a;
                i = g95Var.t;
                if (i != 0) {
                    y6a.M(obj);
                    m95 m95Var = this.w;
                    if (m95Var != null) {
                        wzc wzcVar = this.t;
                        if (wzcVar != null) {
                            l95 l95Var = new l95(m95Var);
                            g95Var.t = 1;
                            if (wzcVar.a(l95Var, g95Var) == lu3Var) {
                                return lu3Var;
                            }
                        }
                    }
                    u1(new s85(0L, false));
                    return Unit.a;
                }
                if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                this.w = null;
                u1(new s85(0L, false));
                return Unit.a;
            }
        }
        g95Var = new g95(this, sq3Var);
        Object obj2 = g95Var.r;
        lu3 lu3Var2 = lu3.a;
        i = g95Var.t;
        if (i != 0) {
        }
        this.w = null;
        u1(new s85(0L, false));
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0053, code lost:
    
        if (r2.a(r5, r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object w1(r85 r85Var, sq3 sq3Var) {
        h95 h95Var;
        int i;
        m95 m95Var;
        wzc wzcVar;
        r85 r85Var2;
        m95 m95Var2;
        if (sq3Var instanceof h95) {
            h95Var = (h95) sq3Var;
            int i2 = h95Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h95Var.v = i2 - Integer.MIN_VALUE;
                Object obj = h95Var.t;
                lu3 lu3Var = lu3.a;
                i = h95Var.v;
                if (i != 0) {
                    y6a.M(obj);
                    m95 m95Var3 = this.w;
                    if (m95Var3 != null && (r2 = this.t) != null) {
                        l95 l95Var = new l95(m95Var3);
                        h95Var.r = r85Var;
                        h95Var.v = 1;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        m95Var2 = h95Var.s;
                        r85Var2 = h95Var.r;
                        y6a.M(obj);
                        m95Var = m95Var2;
                        r85Var = r85Var2;
                        this.w = m95Var;
                        t1(r85Var.a);
                        return Unit.a;
                    }
                    r85Var = h95Var.r;
                    y6a.M(obj);
                }
                m95Var = new m95();
                wzcVar = this.t;
                if (wzcVar != null) {
                    h95Var.r = r85Var;
                    h95Var.s = m95Var;
                    h95Var.v = 2;
                    if (wzcVar.a(m95Var, h95Var) != lu3Var) {
                        r85Var2 = r85Var;
                        m95Var2 = m95Var;
                        m95Var = m95Var2;
                        r85Var = r85Var2;
                    }
                    return lu3Var;
                }
                this.w = m95Var;
                t1(r85Var.a);
                return Unit.a;
            }
        }
        h95Var = new h95(this, sq3Var);
        Object obj2 = h95Var.t;
        lu3 lu3Var2 = lu3.a;
        i = h95Var.v;
        if (i != 0) {
        }
        m95Var = new m95();
        wzcVar = this.t;
        if (wzcVar != null) {
        }
        this.w = m95Var;
        t1(r85Var.a);
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x1(s85 s85Var, sq3 sq3Var) {
        i95 i95Var;
        int i;
        if (sq3Var instanceof i95) {
            i95Var = (i95) sq3Var;
            int i2 = i95Var.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i95Var.u = i2 - Integer.MIN_VALUE;
                Object obj = i95Var.s;
                lu3 lu3Var = lu3.a;
                i = i95Var.u;
                if (i != 0) {
                    y6a.M(obj);
                    m95 m95Var = this.w;
                    if (m95Var != null) {
                        wzc wzcVar = this.t;
                        if (wzcVar != null) {
                            n95 n95Var = new n95(m95Var);
                            i95Var.r = s85Var;
                            i95Var.u = 1;
                            if (wzcVar.a(n95Var, i95Var) == lu3Var) {
                                return lu3Var;
                            }
                        }
                    }
                    u1(s85Var);
                    return Unit.a;
                }
                if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                s85Var = i95Var.r;
                y6a.M(obj);
                this.w = null;
                u1(s85Var);
                return Unit.a;
            }
        }
        i95Var = new i95(this, sq3Var);
        Object obj2 = i95Var.s;
        lu3 lu3Var2 = lu3.a;
        i = i95Var.u;
        if (i != 0) {
        }
        this.w = null;
        u1(s85Var);
        return Unit.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v0, types: [bw4, k95, xw8] */
    /* JADX WARN: Type inference failed for: r6v33, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // defpackage.a2a
    public final void y(b10 b10Var, gze gzeVar) {
        Object obj;
        Object obj2;
        Object obj3;
        q1a q1aVar;
        q1a q1aVar2;
        int i = b10Var.b;
        ArrayList arrayList = (ArrayList) b10Var.c;
        if (this.u == null) {
            zw8 zw8Var = new zw8(this);
            k1(zw8Var);
            this.u = zw8Var;
        }
        if (this.s) {
            y1a y1aVar = this.H;
            if (y1aVar == null) {
                y1aVar = new y1a(this);
                this.H = y1aVar;
            }
            y1a y1aVar2 = y1aVar;
            k95 k95Var = y1aVar2.a;
            w1a w1aVar = y1aVar2.f;
            int i2 = 0;
            w1a w1aVar2 = w1aVar;
            if (w1aVar == null) {
                s1a s1aVar = y1aVar2.b;
                s1a s1aVar2 = s1aVar;
                if (s1aVar == null) {
                    r1a r1aVar = r1a.c;
                    s1a s1aVar3 = new s1a();
                    s1aVar3.k = r1aVar;
                    s1aVar3.l = false;
                    y1aVar2.b = s1aVar3;
                    s1aVar2 = s1aVar3;
                }
                y1aVar2.f = s1aVar2;
                w1aVar2 = s1aVar2;
            }
            boolean z = true;
            if (w1aVar2 instanceof s1a) {
                s1a s1aVar4 = (s1a) w1aVar2;
                if (arrayList.isEmpty()) {
                    return;
                }
                int size = arrayList.size();
                while (i2 < size) {
                    if (!z1a.l((q1a) arrayList.get(i2))) {
                        return;
                    } else {
                        i2++;
                    }
                }
                q1a q1aVar3 = (q1a) CollectionsKt.Y(arrayList);
                r1a r1aVar2 = x1a.a[s1aVar4.k.ordinal()] == 1 ? !k95Var.C1() ? r1a.a : r1a.b : s1aVar4.k;
                s1aVar4.k = r1aVar2;
                if (gzeVar == gze.a && r1aVar2 == r1a.b) {
                    q1aVar3.i = true;
                    s1aVar4.l = true;
                }
                if (gzeVar == gze.b) {
                    if (r1aVar2 == r1a.a) {
                        y1a.c(y1aVar2, q1aVar3, q1aVar3.a, 0L, 12);
                        return;
                    }
                    if (s1aVar4.l) {
                        y1aVar2.f(q1aVar3, q1aVar3, new p1a(i), 0L);
                        y1aVar2.e(q1aVar3, new p1a(i), 0L);
                        long j = q1aVar3.a;
                        v1a v1aVar = y1aVar2.c;
                        if (v1aVar == null) {
                            v1aVar = new v1a();
                            v1aVar.k = Long.MAX_VALUE;
                            y1aVar2.c = v1aVar;
                        }
                        v1aVar.k = j;
                        y1aVar2.f = v1aVar;
                        return;
                    }
                    return;
                }
                return;
            }
            if (!(w1aVar2 instanceof u1a)) {
                if (w1aVar2 instanceof t1a) {
                    t1a t1aVar = (t1a) w1aVar2;
                    if (gzeVar != gze.c) {
                        return;
                    }
                    int size2 = arrayList.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size2) {
                            break;
                        }
                        if (((q1a) arrayList.get(i3)).i) {
                            z = false;
                            break;
                        }
                        i3++;
                    }
                    int size3 = arrayList.size();
                    while (true) {
                        if (i2 >= size3) {
                            break;
                        }
                        if (!((q1a) arrayList.get(i2)).d) {
                            i2++;
                        } else if (!arrayList.isEmpty()) {
                            if (z) {
                                long T = z1a.T((q1a) CollectionsKt.Y(arrayList), k95Var.q, new p1a(i));
                                q1a q1aVar4 = t1aVar.k;
                                q1aVar4.getClass();
                                long h = dnd.h(T, z1a.T(q1aVar4, k95Var.q, new p1a(i)));
                                q1a q1aVar5 = t1aVar.k;
                                if (q1aVar5 != null) {
                                    y1a.c(y1aVar2, q1aVar5, t1aVar.l, h, 8);
                                    return;
                                } else {
                                    a70.p("AwaitGesturePickup.initialDown was not initialized.");
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    y1aVar2.a();
                    return;
                }
                if (!(w1aVar2 instanceof v1a)) {
                    zzl.b();
                    return;
                }
                v1a v1aVar2 = (v1a) w1aVar2;
                if (gzeVar != gze.b) {
                    return;
                }
                long j2 = v1aVar2.k;
                int size4 = arrayList.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size4) {
                        obj = null;
                        break;
                    }
                    obj = arrayList.get(i4);
                    if (ufa.o(((q1a) obj).a, j2)) {
                        break;
                    } else {
                        i4++;
                    }
                }
                q1a q1aVar6 = (q1a) obj;
                if (q1aVar6 == null) {
                    return;
                }
                boolean m = z1a.m(q1aVar6);
                p85 p85Var = p85.a;
                if (!m) {
                    if (q1aVar6.i) {
                        k95Var.s1(p85Var);
                        return;
                    } else {
                        if (dnd.d(z1a.S(q1aVar6, k95Var.q, new p1a(i), true)) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            return;
                        }
                        y1aVar2.e(q1aVar6, new p1a(i), z1a.S(q1aVar6, k95Var.q, new p1a(i), false));
                        q1aVar6.i = true;
                        return;
                    }
                }
                int size5 = arrayList.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size5) {
                        obj2 = null;
                        break;
                    }
                    obj2 = arrayList.get(i5);
                    if (((q1a) obj2).d) {
                        break;
                    } else {
                        i5++;
                    }
                }
                q1a q1aVar7 = (q1a) obj2;
                if (q1aVar7 != null) {
                    v1aVar2.k = q1aVar7.a;
                    return;
                }
                if (q1aVar6.i || !z1a.m(q1aVar6)) {
                    k95Var.s1(p85Var);
                } else {
                    z1a.h(y1aVar2.d(), q1aVar6, k95Var.q, new p1a(i), y1aVar2.j, y1aVar2.l);
                    float f = ((hsk) tgj.x(k95Var, dh3.t)).f();
                    long d = y1aVar2.d().d(t6a.i(f, f));
                    ou4 ou4Var = (ou4) y1aVar2.d().b;
                    xmk xmkVar = (xmk) ou4Var.b;
                    mh0.m(0, r6.length, null, xmkVar.d);
                    xmkVar.e = 0;
                    xmk xmkVar2 = (xmk) ou4Var.c;
                    mh0.m(0, r6.length, null, xmkVar2.d);
                    xmkVar2.e = 0;
                    ou4Var.a = 0L;
                    k95Var.s1(new s85(w95.a(d), true));
                }
                y1aVar2.a();
                return;
            }
            u1a u1aVar = (u1a) w1aVar2;
            if (gzeVar == gze.a) {
                return;
            }
            int size6 = arrayList.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size6) {
                    obj3 = null;
                    break;
                }
                obj3 = arrayList.get(i6);
                int i7 = i6;
                if (ufa.o(((q1a) obj3).a, u1aVar.l)) {
                    break;
                } else {
                    i6 = i7 + 1;
                }
            }
            q1a q1aVar8 = (q1a) obj3;
            if (q1aVar8 == null) {
                int size7 = arrayList.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size7) {
                        q1aVar2 = 0;
                        break;
                    }
                    q1aVar2 = arrayList.get(i8);
                    if (((q1a) q1aVar2).d) {
                        break;
                    } else {
                        i8++;
                    }
                }
                q1aVar8 = q1aVar2;
                if (q1aVar8 == null) {
                    y1aVar2.a();
                    return;
                }
                u1aVar.l = q1aVar8.a;
            }
            if (gzeVar == gze.b) {
                if (q1aVar8.i) {
                    q1a q1aVar9 = u1aVar.k;
                    if (q1aVar9 == null) {
                        a70.p("AwaitTouchSlop.initialDown was not initialized");
                        return;
                    }
                    long j3 = u1aVar.l;
                    am0 am0Var = y1aVar2.i;
                    if (am0Var == null) {
                        a70.p("AwaitTouchSlop.touchSlopDetector was not initialized");
                        return;
                    }
                    y1aVar2.b(q1aVar9, j3, am0Var);
                } else if (z1a.m(q1aVar8)) {
                    int size8 = arrayList.size();
                    int i9 = 0;
                    while (true) {
                        if (i9 >= size8) {
                            q1aVar = null;
                            break;
                        }
                        ?? r6 = arrayList.get(i9);
                        if (((q1a) r6).d) {
                            q1aVar = r6;
                            break;
                        }
                        i9++;
                    }
                    q1a q1aVar10 = q1aVar;
                    if (q1aVar10 == null) {
                        y1aVar2.a();
                    } else {
                        u1aVar.l = q1aVar10.a;
                    }
                } else {
                    hsk hskVar = (hsk) tgj.x(k95Var, dh3.t);
                    float f2 = e95.a;
                    float g = hskVar.g();
                    am0 am0Var2 = y1aVar2.i;
                    if (am0Var2 == null) {
                        a70.p("Touch slop detector not initialized.");
                        return;
                    }
                    long u = am0Var2.u(z1a.S(q1aVar8, k95Var.q, new p1a(i), true), g, true);
                    if ((9223372034707292159L & u) != 9205357640488583168L) {
                        q1aVar8.i = true;
                        q1a q1aVar11 = u1aVar.k;
                        q1aVar11.getClass();
                        q1a q1aVar12 = q1aVar8;
                        y1aVar2.f(q1aVar11, q1aVar12, new p1a(i), u);
                        q1aVar8 = q1aVar12;
                        y1aVar2.e(q1aVar8, new p1a(i), u);
                        long j4 = q1aVar8.a;
                        v1a v1aVar3 = y1aVar2.c;
                        if (v1aVar3 == null) {
                            v1aVar3 = new v1a();
                            v1aVar3.k = Long.MAX_VALUE;
                            y1aVar2.c = v1aVar3;
                        }
                        v1aVar3.k = j4;
                        y1aVar2.f = v1aVar3;
                    } else {
                        u1aVar.m = true;
                    }
                }
            }
            if (gzeVar == gze.c && u1aVar.m) {
                if (!q1aVar8.i) {
                    u1aVar.m = false;
                    return;
                }
                q1a q1aVar13 = u1aVar.k;
                if (q1aVar13 == null) {
                    a70.p("AwaitTouchSlop.initialDown was not initialized");
                    return;
                }
                long j5 = u1aVar.l;
                am0 am0Var3 = y1aVar2.i;
                if (am0Var3 != null) {
                    y1aVar2.b(q1aVar13, j5, am0Var3);
                } else {
                    a70.p("AwaitTouchSlop.touchSlopDetector was not initialized");
                }
            }
        }
    }

    @Override // defpackage.pze
    public final void y0() {
        if (this.y) {
            p1();
            if (this.x) {
                y1().d(p85.a);
            }
            this.E = null;
        }
        this.y = false;
    }

    public final ln2 y1() {
        g62 g62Var = this.v;
        if (g62Var != null) {
            return g62Var;
        }
        a70.p("Events channel not initialized.");
        return null;
    }

    public final yia z1() {
        yia yiaVar = this.E;
        if (yiaVar != null) {
            return yiaVar;
        }
        a70.p("Velocity Tracker not initialized.");
        return null;
    }
}
