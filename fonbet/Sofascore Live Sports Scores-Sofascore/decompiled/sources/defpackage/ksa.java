package defpackage;

import androidx.compose.runtime.e;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ksa implements jvg {
    public static final y3g y = w1a.w(new mpa(1), new yo9(29));
    public final qq4 a;
    public boolean b;
    public csa c;
    public boolean d;
    public final ipa e;
    public final e1d f;
    public final xzc g;
    public float h;
    public boolean i;
    public final ls4 j;
    public final boolean k;
    public wma l;
    public final npa m;
    public final nw0 n;
    public final rqa o;
    public final cqa p;
    public final era q;
    public final yia r;
    public final bra s;
    public final e1d t;
    public final e1d u;
    public final e1d v;
    public final e1d w;
    public final wj9 x;

    public ksa(int i, int i2) {
        qq4 qq4Var = new qq4();
        qq4Var.a = -1;
        qq4Var.c = -1;
        this.a = qq4Var;
        this.e = new ipa(i, i2, 1);
        this.f = e.e(msa.a, f7a.k);
        this.g = new xzc();
        this.j = new ls4(new ida(this, 9));
        this.k = true;
        this.m = new npa(this, 1);
        this.n = new nw0();
        this.o = new rqa();
        this.p = new cqa(0);
        this.q = new era(new q13(this, i));
        this.r = new yia(this, 1);
        this.s = new bra();
        this.t = b0a.D();
        Boolean bool = Boolean.FALSE;
        this.u = e.f(bool);
        this.v = e.f(bool);
        this.w = b0a.D();
        this.x = new wj9(11);
    }

    public static Object l(int i, rq3 rq3Var, ksa ksaVar) {
        ksaVar.getClass();
        Object a = ksaVar.a(m1d.a, new wo(ksaVar, i, 0, (rq3) null), rq3Var);
        return a == lu3.a ? a : Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        if (r6.j.a(r7, r8, r0) != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        if (r6.n.i(r0) == r1) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.jvg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(m1d m1dVar, Function2 function2, rq3 rq3Var) {
        jsa jsaVar;
        int i;
        Function2 function22;
        if (rq3Var instanceof jsa) {
            jsaVar = (jsa) rq3Var;
            int i2 = jsaVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jsaVar.v = i2 - Integer.MIN_VALUE;
                Object obj = jsaVar.t;
                lu3 lu3Var = lu3.a;
                i = jsaVar.v;
                if (i != 0) {
                    y6a.M(obj);
                    function22 = function2;
                    if (((eoh) this.f).getValue() == msa.a) {
                        jsaVar.r = m1dVar;
                        jsaVar.s = (hoi) function2;
                        jsaVar.v = 1;
                        function22 = function2;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Function2 function23 = (Function2) jsaVar.s;
                    m1dVar = jsaVar.r;
                    y6a.M(obj);
                    function22 = function23;
                }
                jsaVar.r = null;
                jsaVar.s = null;
                jsaVar.v = 2;
            }
        }
        jsaVar = new jsa(this, rq3Var);
        Object obj2 = jsaVar.t;
        lu3 lu3Var2 = lu3.a;
        i = jsaVar.v;
        if (i != 0) {
        }
        jsaVar.r = null;
        jsaVar.s = null;
        jsaVar.v = 2;
    }

    @Override // defpackage.jvg
    public final boolean b() {
        return this.j.b();
    }

    @Override // defpackage.jvg
    public final boolean c() {
        return ((Boolean) ((eoh) this.v).getValue()).booleanValue();
    }

    @Override // defpackage.jvg
    public final boolean d() {
        return ((Boolean) ((eoh) this.u).getValue()).booleanValue();
    }

    @Override // defpackage.jvg
    public final float e(float f) {
        return this.j.e(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(int i, int i2, sq3 sq3Var) {
        hsa hsaVar;
        int i3;
        ksa ksaVar;
        Throwable th;
        if (sq3Var instanceof hsa) {
            hsaVar = (hsa) sq3Var;
            int i4 = hsaVar.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                hsaVar.t = i4 - Integer.MIN_VALUE;
                Object obj = hsaVar.r;
                lu3 lu3Var = lu3.a;
                i3 = hsaVar.t;
                if (i3 != 0) {
                    y6a.M(obj);
                    try {
                        this.i = true;
                        ksaVar = this;
                        try {
                            gz6 gz6Var = new gz6(ksaVar, i, i2, null, 1);
                            hsaVar.t = 1;
                            try {
                                if (ksaVar.a(m1d.a, gz6Var, hsaVar) == lu3Var) {
                                    return lu3Var;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                ksaVar.i = false;
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            th = th;
                            ksaVar.i = false;
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        ksaVar = this;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    try {
                        y6a.M(obj);
                        ksaVar = this;
                    } catch (Throwable th5) {
                        th = th5;
                        ksaVar = this;
                        ksaVar.i = false;
                        throw th;
                    }
                }
                ksaVar.i = false;
                return Unit.a;
            }
        }
        hsaVar = new hsa(this, sq3Var);
        Object obj2 = hsaVar.r;
        lu3 lu3Var2 = lu3.a;
        i3 = hsaVar.t;
        if (i3 != 0) {
        }
        ksaVar.i = false;
        return Unit.a;
    }

    public final void g(csa csaVar, boolean z, boolean z2) {
        float f;
        long j;
        List list = csaVar.k;
        int i = csaVar.n;
        int i2 = csaVar.b;
        dsa dsaVar = csaVar.a;
        this.q.e = list.size();
        wj9 wj9Var = this.x;
        ipa ipaVar = this.e;
        if (!z && this.b) {
            this.c = csaVar;
            nnh w = bea.w();
            Function1 e = w != null ? w.e() : null;
            nnh C = bea.C(w);
            try {
                if (!(((Number) ((eoh) ((d80) wj9Var.c).b).getValue()).floatValue() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) && dsaVar != null && dsaVar.a == ipaVar.b.h() && i2 == ipaVar.c.h()) {
                    wj9Var.L();
                }
                Unit unit = Unit.a;
                bea.K(w, C, e);
                return;
            } catch (Throwable th) {
                bea.K(w, C, e);
                throw th;
            }
        }
        if (z) {
            this.b = true;
        }
        ((eoh) this.v).setValue(Boolean.valueOf(((dsaVar != null ? dsaVar.a : 0) == 0 && i2 == 0) ? false : true));
        ((eoh) this.u).setValue(Boolean.valueOf(csaVar.c));
        this.h -= csaVar.d;
        ((eoh) this.f).setValue(csaVar);
        if (z2) {
            ipaVar.getClass();
            if (i2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                u3a.c("scrollOffset should be non-negative");
            }
            ipaVar.c.i(i2);
        } else {
            dsa dsaVar2 = (dsa) CollectionsKt.firstOrNull(list);
            dsa dsaVar3 = (dsa) CollectionsKt.j0(list);
            if (dsaVar2 != null) {
                f = 0.0f;
                j = dsaVar2.a;
            } else {
                f = 0.0f;
                j = -1;
            }
            eq3.a0(j, "firstVisibleItem:index");
            eq3.a0(dsaVar3 != null ? dsaVar3.a : -1L, "lastVisibleItem:index");
            ipaVar.getClass();
            ipaVar.e = dsaVar != null ? dsaVar.k : null;
            if (ipaVar.d || i > 0) {
                ipaVar.d = true;
                if (i2 < f) {
                    u3a.c("scrollOffset should be non-negative");
                }
                ipaVar.a(dsaVar != null ? dsaVar.a : 0, i2);
            }
            if (this.k) {
                qq4 qq4Var = this.a;
                int i3 = qq4Var.a;
                boolean z3 = qq4Var.b;
                if (i3 != -1 && !list.isEmpty() && i3 != qq4.a(csaVar, z3)) {
                    qq4Var.a = -1;
                    dra draVar = (dra) qq4Var.e;
                    if (draVar != null) {
                        draVar.cancel();
                    }
                    qq4Var.e = null;
                }
                int i4 = qq4Var.c;
                if (i4 != -1 && qq4Var.d != f && i4 != i && !list.isEmpty()) {
                    int a = qq4.a(csaVar, qq4Var.d < f);
                    if (a >= 0 && a < i) {
                        qq4Var.a = a;
                        qq4Var.e = yia.i(this.r, a);
                    }
                }
                qq4Var.c = i;
            }
        }
        if (z) {
            wj9Var.N(csaVar.f, csaVar.i, csaVar.h);
        }
    }

    public final int h() {
        return this.e.b.h();
    }

    public final int i() {
        return this.e.c.h();
    }

    public final csa j() {
        return (csa) ((eoh) this.f).getValue();
    }

    public final void k(float f, csa csaVar) {
        dra draVar;
        dra draVar2;
        if (this.k) {
            boolean isEmpty = csaVar.k.isEmpty();
            qq4 qq4Var = this.a;
            if (!isEmpty) {
                boolean z = f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                int a = qq4.a(csaVar, z);
                if (a >= 0 && a < csaVar.n) {
                    if (a != qq4Var.a) {
                        if (qq4Var.b != z) {
                            qq4Var.a = -1;
                            dra draVar3 = (dra) qq4Var.e;
                            if (draVar3 != null) {
                                draVar3.cancel();
                            }
                            qq4Var.e = null;
                        }
                        qq4Var.b = z;
                        qq4Var.a = a;
                        qq4Var.e = yia.i(this.r, a);
                    }
                    List list = csaVar.k;
                    if (z) {
                        dsa dsaVar = (dsa) CollectionsKt.h0(list);
                        if (((dsaVar.o + dsaVar.p) + csaVar.q) - csaVar.m < (-f) && (draVar2 = (dra) qq4Var.e) != null) {
                            draVar2.a();
                        }
                    } else if (csaVar.l - ((dsa) CollectionsKt.Y(list)).o < f && (draVar = (dra) qq4Var.e) != null) {
                        draVar.a();
                    }
                }
            }
            qq4Var.d = f;
        }
    }

    public final void m(int i, int i2) {
        ipa ipaVar = this.e;
        if (ipaVar.b.h() != i || ipaVar.c.h() != i2) {
            rqa rqaVar = this.o;
            rqaVar.e();
            rqaVar.c = null;
            rqaVar.a = -1;
        }
        ipaVar.a(i, i2);
        ipaVar.e = null;
        wma wmaVar = this.l;
        if (wmaVar != null) {
            wmaVar.l();
        }
    }
}
