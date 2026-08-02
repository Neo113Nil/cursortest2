package se;

import androidx.lifecycle.k1;
import androidx.lifecycle.p0;
import c4.w;
import eg.c0;
import eg.m0;
import eg.t1;
import eg.y;
import hg.d1;
import hg.u0;
import jg.q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class p extends k1 {
    public static int T = -1;
    public final wc.i A = new wc.i();
    public final p0 B;
    public final p0 C;
    public final d1 D;
    public final d1 E;
    public final d1 F;
    public final d1 G;
    public final d1 H;
    public String I;
    public String J;
    public final p0 K;
    public final CoroutineContext L;
    public t1 M;
    public t1 N;
    public t1 O;
    public t1 P;
    public t1 Q;
    public t1 R;
    public t1 S;

    /* renamed from: b, reason: collision with root package name */
    public String f23576b;

    /* renamed from: c, reason: collision with root package name */
    public String f23577c;

    /* renamed from: d, reason: collision with root package name */
    public String f23578d;

    /* renamed from: e, reason: collision with root package name */
    public String f23579e;

    /* renamed from: f, reason: collision with root package name */
    public String f23580f;

    /* renamed from: g, reason: collision with root package name */
    public String f23581g;

    /* renamed from: h, reason: collision with root package name */
    public String f23582h;

    /* renamed from: i, reason: collision with root package name */
    public String f23583i;
    public String j;

    /* renamed from: k, reason: collision with root package name */
    public String f23584k;

    /* renamed from: l, reason: collision with root package name */
    public ic.a f23585l;

    /* renamed from: m, reason: collision with root package name */
    public ic.a f23586m;

    /* renamed from: n, reason: collision with root package name */
    public ic.a f23587n;

    /* renamed from: o, reason: collision with root package name */
    public ic.a f23588o;

    /* renamed from: p, reason: collision with root package name */
    public ic.a f23589p;
    public ic.a q;

    /* renamed from: r, reason: collision with root package name */
    public ic.a f23590r;

    /* renamed from: s, reason: collision with root package name */
    public ic.a f23591s;

    /* renamed from: t, reason: collision with root package name */
    public ic.a f23592t;

    /* renamed from: u, reason: collision with root package name */
    public ic.a f23593u;

    /* renamed from: v, reason: collision with root package name */
    public nc.f f23594v;

    /* renamed from: w, reason: collision with root package name */
    public nc.f f23595w;

    /* renamed from: x, reason: collision with root package name */
    public nc.f f23596x;

    /* renamed from: y, reason: collision with root package name */
    public nc.f f23597y;

    /* renamed from: z, reason: collision with root package name */
    public nc.f f23598z;

    public p() {
        p0 p0Var = new p0(null);
        this.B = p0Var;
        this.C = p0Var;
        ic.c cVar = wc.i.f25109h;
        this.D = u0.b(cVar);
        this.E = u0.b(cVar);
        this.F = u0.b(cVar);
        this.G = u0.b(cVar);
        this.H = u0.b(cVar);
        this.K = new p0(null);
        y yVar = new y("ListSubsViewModel");
        w wVar = zc.a.f25907a;
        wVar.getClass();
        this.L = kotlin.coroutines.e.c(wVar, yVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(p pVar, mf.c cVar) {
        l lVar;
        Object obj;
        int i5;
        String str;
        wc.i iVar = pVar.A;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i10 = lVar.f23567d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                lVar.f23567d = i10 - Integer.MIN_VALUE;
                obj = lVar.f23565b;
                lf.a aVar = lf.a.f20034a;
                i5 = lVar.f23567d;
                if (i5 != 0) {
                    h8.b.B(obj);
                    String str2 = pVar.I;
                    if (str2 == null) {
                        return null;
                    }
                    lVar.f23564a = str2;
                    lVar.f23567d = 1;
                    Object e7 = iVar.e(lVar);
                    if (e7 == aVar) {
                        return aVar;
                    }
                    str = str2;
                    obj = e7;
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = lVar.f23564a;
                    h8.b.B(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    return null;
                }
                da.o oVar = new da.o(str);
                ic.a productInfo = pVar.i(str);
                int i11 = T;
                if (i11 > 0 && productInfo != null) {
                    oVar.j(i11);
                    iVar.getClass();
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
                oVar.m(pVar.J);
                return oVar;
            }
        }
        lVar = new l(pVar, cVar);
        obj = lVar.f23565b;
        lf.a aVar2 = lf.a.f20034a;
        i5 = lVar.f23567d;
        if (i5 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    @Override // androidx.lifecycle.k1
    public final void d() {
        f();
        this.f23576b = null;
        this.f23577c = null;
        this.f23578d = null;
        this.f23579e = null;
        this.f23580f = null;
        this.f23581g = null;
        this.f23582h = null;
        this.f23583i = null;
        this.j = null;
        this.f23584k = null;
        this.f23585l = null;
        this.f23586m = null;
        this.f23587n = null;
        this.f23588o = null;
        this.f23589p = null;
        this.q = null;
        this.f23590r = null;
        this.f23591s = null;
        this.f23592t = null;
        this.f23593u = null;
    }

    public final void f() {
        t1 t1Var = this.M;
        if (t1Var != null) {
            t1Var.k(null);
        }
        t1 t1Var2 = this.N;
        if (t1Var2 != null) {
            t1Var2.k(null);
        }
        t1 t1Var3 = this.O;
        if (t1Var3 != null) {
            t1Var3.k(null);
        }
        t1 t1Var4 = this.P;
        if (t1Var4 != null) {
            t1Var4.k(null);
        }
        t1 t1Var5 = this.Q;
        if (t1Var5 != null) {
            t1Var5.k(null);
        }
        t1 t1Var6 = this.R;
        if (t1Var6 != null) {
            t1Var6.k(null);
        }
        t1 t1Var7 = this.S;
        if (t1Var7 != null) {
            t1Var7.k(null);
        }
        this.M = null;
        this.N = null;
        this.O = null;
        this.P = null;
        this.Q = null;
        this.R = null;
        this.S = null;
    }

    public final CoroutineContext g() {
        y yVar = new y("Sdk observer state subs");
        this.A.getClass();
        CoroutineContext c2 = kotlin.coroutines.e.c(yVar, zc.a.f25907a);
        lg.e eVar = m0.f9201a;
        return c2.t(lg.d.f20063c);
    }

    public final void h(androidx.fragment.app.p0 p0Var, String str, String str2, String str3) {
        if (str == null) {
            return;
        }
        this.I = str;
        i(str);
        u1.a i5 = androidx.lifecycle.d1.i(this);
        lg.e eVar = m0.f9201a;
        c0.t(i5, this.L.t(q.f18523a), null, new c1.g(this, p0Var, str, str2, str3, (Continuation) null, 5), 2);
    }

    public final ic.a i(String str) {
        ic.a aVar = Intrinsics.areEqual(str, this.f23576b) ? this.f23585l : Intrinsics.areEqual(str, this.f23577c) ? this.f23586m : Intrinsics.areEqual(str, this.f23578d) ? this.f23587n : Intrinsics.areEqual(str, this.f23579e) ? this.f23588o : Intrinsics.areEqual(str, this.f23580f) ? this.f23589p : Intrinsics.areEqual(str, this.f23581g) ? this.q : Intrinsics.areEqual(str, this.f23582h) ? this.f23590r : Intrinsics.areEqual(str, this.f23583i) ? this.f23591s : Intrinsics.areEqual(str, this.j) ? this.f23592t : Intrinsics.areEqual(str, this.f23584k) ? this.f23593u : null;
        if (aVar == null && str != null) {
            this.A.f(0L);
        }
        return aVar;
    }
}
