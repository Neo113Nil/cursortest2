package le;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class z extends androidx.lifecycle.k1 {

    /* renamed from: b, reason: collision with root package name */
    public eg.t1 f20006b;

    /* renamed from: c, reason: collision with root package name */
    public eg.t1 f20007c;

    /* renamed from: d, reason: collision with root package name */
    public eg.t1 f20008d;

    /* renamed from: e, reason: collision with root package name */
    public eg.t1 f20009e;

    /* renamed from: f, reason: collision with root package name */
    public eg.t1 f20010f;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.lifecycle.p0 f20011g;

    /* renamed from: h, reason: collision with root package name */
    public final androidx.lifecycle.p0 f20012h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f20013i;
    public String j;

    /* renamed from: k, reason: collision with root package name */
    public int f20014k;

    /* renamed from: l, reason: collision with root package name */
    public String f20015l;

    /* renamed from: m, reason: collision with root package name */
    public String f20016m;

    /* renamed from: n, reason: collision with root package name */
    public String f20017n;

    /* renamed from: o, reason: collision with root package name */
    public String f20018o;

    /* renamed from: p, reason: collision with root package name */
    public ic.a f20019p;
    public ic.a q;

    /* renamed from: r, reason: collision with root package name */
    public ic.a f20020r;

    /* renamed from: s, reason: collision with root package name */
    public ic.a f20021s;

    /* renamed from: t, reason: collision with root package name */
    public nc.f f20022t;

    /* renamed from: u, reason: collision with root package name */
    public nc.f f20023u;

    /* renamed from: v, reason: collision with root package name */
    public final androidx.lifecycle.p0 f20024v;

    /* renamed from: w, reason: collision with root package name */
    public final androidx.lifecycle.p0 f20025w;

    /* renamed from: x, reason: collision with root package name */
    public final androidx.lifecycle.p0 f20026x;

    /* renamed from: y, reason: collision with root package name */
    public final com.google.firebase.messaging.x f20027y;

    public z() {
        androidx.lifecycle.p0 p0Var = new androidx.lifecycle.p0(null);
        this.f20011g = p0Var;
        this.f20012h = p0Var;
        this.f20014k = -1;
        this.f20024v = new androidx.lifecycle.p0(null);
        this.f20025w = new androidx.lifecycle.p0(null);
        this.f20026x = new androidx.lifecycle.p0(null);
        this.f20027y = new com.google.firebase.messaging.x(26);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0125, code lost:
    
        if (r11 != r1) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0127, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0102, code lost:
    
        if (r13 == r1) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(z zVar, List list, mf.c cVar) {
        r rVar;
        int i5;
        Object obj;
        Object obj2;
        Object obj3;
        ic.a aVar;
        Object obj4;
        ic.a aVar2;
        z zVar2;
        Object A;
        ic.a aVar3;
        Object A2;
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i10 = rVar.f19921e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                rVar.f19921e = i10 - Integer.MIN_VALUE;
                Object obj5 = rVar.f19919c;
                Object obj6 = lf.a.f20034a;
                i5 = rVar.f19921e;
                Continuation continuation = null;
                if (i5 != 0) {
                    h8.b.B(obj5);
                    if (list == null) {
                        return Unit.f19194a;
                    }
                    if (list.isEmpty()) {
                        return Unit.f19194a;
                    }
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        ic.a aVar4 = (ic.a) obj;
                        if (Intrinsics.areEqual(aVar4 != null ? aVar4.f11062i : null, zVar.f20015l)) {
                            break;
                        }
                    }
                    ic.a aVar5 = (ic.a) obj;
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it2.next();
                        ic.a aVar6 = (ic.a) obj2;
                        if (Intrinsics.areEqual(aVar6 != null ? aVar6.f11062i : null, zVar.f20016m)) {
                            break;
                        }
                    }
                    ic.a aVar7 = (ic.a) obj2;
                    Iterator it3 = list.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            obj3 = null;
                            break;
                        }
                        obj3 = it3.next();
                        ic.a aVar8 = (ic.a) obj3;
                        if (Intrinsics.areEqual(aVar8 != null ? aVar8.f11062i : null, zVar.f20017n)) {
                            break;
                        }
                    }
                    aVar = (ic.a) obj3;
                    Iterator it4 = list.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            obj4 = null;
                            break;
                        }
                        obj4 = it4.next();
                        ic.a aVar9 = (ic.a) obj4;
                        if (Intrinsics.areEqual(aVar9 != null ? aVar9.f11062i : null, zVar.f20018o)) {
                            break;
                        }
                    }
                    aVar2 = (ic.a) obj4;
                    rVar.f19917a = aVar;
                    rVar.f19918b = aVar2;
                    rVar.f19921e = 1;
                    if (aVar5 == null) {
                        A = Unit.f19194a;
                        zVar2 = zVar;
                    } else {
                        lg.e eVar = eg.m0.f9201a;
                        zVar2 = zVar;
                        A = eg.c0.A(jg.q.f18523a, new s(zVar2, aVar5, aVar7, continuation, 1), rVar);
                        if (A != lf.a.f20034a) {
                            A = Unit.f19194a;
                        }
                    }
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj5);
                        return Unit.f19194a;
                    }
                    aVar2 = rVar.f19918b;
                    aVar = rVar.f19917a;
                    h8.b.B(obj5);
                    zVar2 = zVar;
                }
                ic.a aVar10 = aVar2;
                aVar3 = aVar;
                rVar.f19917a = null;
                rVar.f19918b = null;
                rVar.f19921e = 2;
                if (aVar3 != null) {
                    A2 = Unit.f19194a;
                } else {
                    lg.e eVar2 = eg.m0.f9201a;
                    A2 = eg.c0.A(jg.q.f18523a, new s(zVar2, aVar3, aVar10, continuation, 0), rVar);
                    if (A2 != lf.a.f20034a) {
                        A2 = Unit.f19194a;
                    }
                }
            }
        }
        rVar = new r(zVar, cVar);
        Object obj52 = rVar.f19919c;
        Object obj62 = lf.a.f20034a;
        i5 = rVar.f19921e;
        Continuation continuation2 = null;
        if (i5 != 0) {
        }
        ic.a aVar102 = aVar2;
        aVar3 = aVar;
        rVar.f19917a = null;
        rVar.f19918b = null;
        rVar.f19921e = 2;
        if (aVar3 != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(z zVar, mf.c cVar) {
        t tVar;
        Object obj;
        lf.a aVar;
        int i5;
        z zVar2;
        z zVar3;
        com.google.firebase.messaging.x xVar = zVar.f20027y;
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i10 = tVar.f19943d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                tVar.f19943d = i10 - Integer.MIN_VALUE;
                obj = tVar.f19941b;
                aVar = lf.a.f20034a;
                i5 = tVar.f19943d;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                if (i5 != 0) {
                    h8.b.B(obj);
                    tVar.f19940a = zVar;
                    tVar.f19943d = 1;
                    Object obj2 = xVar.f6183b;
                    s7.u.g().getClass();
                    y8.d dVar = new y8.d();
                    lg.e eVar = eg.m0.f9201a;
                    obj = eg.c0.A(lg.d.f20063c, new eb.o(dVar, objArr == true ? 1 : 0, 4), tVar);
                    if (obj != aVar) {
                        zVar2 = zVar;
                    }
                    return aVar;
                }
                if (i5 != 1) {
                    if (i5 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zVar3 = tVar.f19940a;
                    h8.b.B(obj);
                    nc.f fVar = (nc.f) obj;
                    zVar.f20017n = fVar == null ? fVar.productId() : null;
                    zVar.f20018o = fVar != null ? fVar.productIdStrike() : null;
                    zVar3.f20023u = fVar;
                    return Unit.f19194a;
                }
                zVar2 = tVar.f19940a;
                h8.b.B(obj);
                nc.f fVar2 = (nc.f) obj;
                zVar.f20015l = fVar2 == null ? fVar2.productId() : null;
                zVar.f20016m = fVar2 == null ? fVar2.productIdStrike() : null;
                zVar2.f20022t = fVar2;
                tVar.f19940a = zVar;
                tVar.f19943d = 2;
                Object obj3 = xVar.f6183b;
                s7.u.g().getClass();
                y8.d dVar2 = new y8.d();
                lg.e eVar2 = eg.m0.f9201a;
                obj = eg.c0.A(lg.d.f20063c, new eb.o(dVar2, objArr2 == true ? 1 : 0, 3), tVar);
                if (obj != aVar) {
                    zVar3 = zVar;
                    nc.f fVar3 = (nc.f) obj;
                    zVar.f20017n = fVar3 == null ? fVar3.productId() : null;
                    zVar.f20018o = fVar3 != null ? fVar3.productIdStrike() : null;
                    zVar3.f20023u = fVar3;
                    return Unit.f19194a;
                }
                return aVar;
            }
        }
        tVar = new t(zVar, cVar);
        obj = tVar.f19941b;
        aVar = lf.a.f20034a;
        i5 = tVar.f19943d;
        Object[] objArr3 = 0;
        Object[] objArr22 = 0;
        if (i5 != 0) {
        }
        nc.f fVar22 = (nc.f) obj;
        zVar.f20015l = fVar22 == null ? fVar22.productId() : null;
        zVar.f20016m = fVar22 == null ? fVar22.productIdStrike() : null;
        zVar2.f20022t = fVar22;
        tVar.f19940a = zVar;
        tVar.f19943d = 2;
        Object obj32 = xVar.f6183b;
        s7.u.g().getClass();
        y8.d dVar22 = new y8.d();
        lg.e eVar22 = eg.m0.f9201a;
        obj = eg.c0.A(lg.d.f20063c, new eb.o(dVar22, objArr22 == true ? 1 : 0, 3), tVar);
        if (obj != aVar) {
        }
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(z zVar, mf.c cVar) {
        v vVar;
        Object obj;
        int i5;
        String str;
        com.google.firebase.messaging.x xVar = zVar.f20027y;
        if (cVar instanceof v) {
            vVar = (v) cVar;
            int i10 = vVar.f19969d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                vVar.f19969d = i10 - Integer.MIN_VALUE;
                obj = vVar.f19967b;
                lf.a aVar = lf.a.f20034a;
                i5 = vVar.f19969d;
                if (i5 != 0) {
                    h8.b.B(obj);
                    String str2 = zVar.j;
                    if (str2 == null) {
                        return null;
                    }
                    vVar.f19966a = str2;
                    vVar.f19969d = 1;
                    Object A = xVar.A(vVar);
                    if (A == aVar) {
                        return aVar;
                    }
                    str = str2;
                    obj = A;
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = vVar.f19966a;
                    h8.b.B(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    return null;
                }
                da.o oVar = new da.o(str);
                ic.a productInfo = zVar.j(str);
                int i11 = zVar.f20014k;
                if (i11 > 0 && productInfo != null) {
                    oVar.j(i11);
                    xVar.getClass();
                    Intrinsics.checkNotNullParameter(productInfo, "productInfo");
                    long j = productInfo.f11057d;
                    if (productInfo.q == 0 && productInfo.f11067o != null) {
                        long j6 = productInfo.f11058e;
                        if (j6 != 0) {
                            j = j6;
                        }
                    }
                    oVar.l(j);
                    oVar.k(productInfo.f11063k);
                }
                oVar.m("live");
                return oVar;
            }
        }
        vVar = new v(zVar, cVar);
        obj = vVar.f19967b;
        lf.a aVar2 = lf.a.f20034a;
        i5 = vVar.f19969d;
        if (i5 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    @Override // androidx.lifecycle.k1
    public final void d() {
        eg.t1 t1Var = this.f20007c;
        if (t1Var != null) {
            t1Var.k(null);
        }
        eg.t1 t1Var2 = this.f20008d;
        if (t1Var2 != null) {
            t1Var2.k(null);
        }
        this.f20007c = null;
        this.f20008d = null;
        eg.t1 t1Var3 = this.f20009e;
        if (t1Var3 != null) {
            t1Var3.k(null);
        }
        this.f20009e = null;
        eg.t1 t1Var4 = this.f20006b;
        if (t1Var4 != null) {
            t1Var4.k(null);
        }
        this.f20006b = null;
        eg.t1 t1Var5 = this.f20010f;
        if (t1Var5 != null) {
            t1Var5.k(null);
        }
        this.f20010f = null;
        this.f20015l = null;
        this.f20016m = null;
        this.f20017n = null;
        this.f20018o = null;
        this.f20019p = null;
        this.q = null;
        this.f20020r = null;
        this.f20021s = null;
    }

    public final void h(androidx.fragment.app.p0 p0Var) {
        this.f20027y.getClass();
        if (da.r.e()) {
            return;
        }
        Continuation continuation = null;
        if (((Boolean) com.google.firebase.messaging.x.v().f21710k.getValue()).booleanValue()) {
            eg.c0.t(androidx.lifecycle.d1.i(this), null, null, new u(this, continuation, 8), 3);
            return;
        }
        String str = this.f20017n;
        nc.f fVar = this.f20023u;
        String planId = fVar != null ? fVar.planId() : null;
        nc.f fVar2 = this.f20023u;
        String offerId = fVar2 != null ? fVar2.offerId() : null;
        if (str == null) {
            return;
        }
        this.j = str;
        j(str);
        eg.c0.t(androidx.lifecycle.d1.i(this), null, null, new c1.g(this, p0Var, str, planId, offerId, (Continuation) null, 2), 3);
    }

    public final void i(androidx.fragment.app.p0 p0Var) {
        this.f20027y.getClass();
        if (da.r.e()) {
            return;
        }
        Continuation continuation = null;
        if (((Boolean) com.google.firebase.messaging.x.v().f21710k.getValue()).booleanValue()) {
            eg.c0.t(androidx.lifecycle.d1.i(this), null, null, new u(this, continuation, 8), 3);
            return;
        }
        String str = this.f20015l;
        nc.f fVar = this.f20022t;
        String planId = fVar != null ? fVar.planId() : null;
        nc.f fVar2 = this.f20022t;
        String offerId = fVar2 != null ? fVar2.offerId() : null;
        if (str == null) {
            return;
        }
        this.j = str;
        j(str);
        eg.c0.t(androidx.lifecycle.d1.i(this), null, null, new c1.g(this, p0Var, str, planId, offerId, (Continuation) null, 2), 3);
    }

    public final ic.a j(String str) {
        ic.a aVar = Intrinsics.areEqual(str, this.f20015l) ? this.f20019p : Intrinsics.areEqual(str, this.f20016m) ? this.q : Intrinsics.areEqual(str, this.f20017n) ? this.f20020r : Intrinsics.areEqual(str, this.f20018o) ? this.f20021s : null;
        if (aVar == null && str != null) {
            this.f20027y.D(0L);
        }
        return aVar;
    }
}
