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
public final class qpa implements jvg {
    public static final y3g w = w1a.w(new mpa(0), new yo9(25));
    public final qq4 a;
    public boolean b;
    public fpa c;
    public final ipa d;
    public final e1d e;
    public final xzc f;
    public float g;
    public final ls4 h;
    public final boolean i;
    public wma j;
    public final npa k;
    public final nw0 l;
    public final rqa m;
    public final cqa n;
    public final era o;
    public final by9 p;
    public final bra q;
    public final e1d r;
    public final e1d s;
    public final e1d t;
    public final e1d u;
    public final wj9 v;

    public qpa(int i, int i2) {
        qq4 qq4Var = new qq4();
        qq4Var.a = -1;
        qq4Var.e = new i1d(new dra[16], 0);
        qq4Var.c = -1;
        this.a = qq4Var;
        this.d = new ipa(i, i2, 0);
        this.e = e.e(tpa.a, f7a.k);
        this.f = new xzc();
        int i3 = 5;
        this.h = new ls4(new ida(this, i3));
        this.i = true;
        this.k = new npa(this, 0);
        this.l = new nw0();
        this.m = new rqa();
        this.n = new cqa(0);
        this.o = new era(new tj(this, i, i3));
        this.p = new by9(this);
        this.q = new bra();
        this.r = b0a.D();
        this.s = b0a.D();
        Boolean bool = Boolean.FALSE;
        this.t = e.f(bool);
        this.u = e.f(bool);
        this.v = new wj9(11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        if (r6.h.a(r7, r8, r0) != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        if (r6.l.i(r0) == r1) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.jvg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(m1d m1dVar, Function2 function2, rq3 rq3Var) {
        opa opaVar;
        int i;
        Function2 function22;
        if (rq3Var instanceof opa) {
            opaVar = (opa) rq3Var;
            int i2 = opaVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                opaVar.v = i2 - Integer.MIN_VALUE;
                Object obj = opaVar.t;
                lu3 lu3Var = lu3.a;
                i = opaVar.v;
                if (i != 0) {
                    y6a.M(obj);
                    function22 = function2;
                    if (((eoh) this.e).getValue() == tpa.a) {
                        opaVar.r = m1dVar;
                        opaVar.s = (hoi) function2;
                        opaVar.v = 1;
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
                    Function2 function23 = (Function2) opaVar.s;
                    m1dVar = opaVar.r;
                    y6a.M(obj);
                    function22 = function23;
                }
                opaVar.r = null;
                opaVar.s = null;
                opaVar.v = 2;
            }
        }
        opaVar = new opa(this, rq3Var);
        Object obj2 = opaVar.t;
        lu3 lu3Var2 = lu3.a;
        i = opaVar.v;
        if (i != 0) {
        }
        opaVar.r = null;
        opaVar.s = null;
        opaVar.v = 2;
    }

    @Override // defpackage.jvg
    public final boolean b() {
        return this.h.b();
    }

    @Override // defpackage.jvg
    public final boolean c() {
        return ((Boolean) ((eoh) this.u).getValue()).booleanValue();
    }

    @Override // defpackage.jvg
    public final boolean d() {
        return ((Boolean) ((eoh) this.t).getValue()).booleanValue();
    }

    @Override // defpackage.jvg
    public final float e(float f) {
        return this.h.e(f);
    }

    public final void f(fpa fpaVar, boolean z, boolean z2) {
        gpa gpaVar;
        gpa gpaVar2;
        gpa gpaVar3;
        List list = fpaVar.m;
        int i = fpaVar.p;
        hpa hpaVar = fpaVar.a;
        int i2 = fpaVar.b;
        this.o.e = list.size();
        Object obj = null;
        obj = null;
        ipa ipaVar = this.d;
        wj9 wj9Var = this.v;
        if (!z && this.b) {
            this.c = fpaVar;
            nnh w2 = bea.w();
            Function1 e = w2 != null ? w2.e() : null;
            nnh C = bea.C(w2);
            try {
                if (!(((Number) ((eoh) ((d80) wj9Var.c).b).getValue()).floatValue() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) && i2 == ipaVar.c.h() && hpaVar != null && (gpaVar3 = (gpa) ph0.A(hpaVar.b)) != null && gpaVar3.a == ipaVar.b.h()) {
                    wj9Var.L();
                }
                Unit unit = Unit.a;
                bea.K(w2, C, e);
                return;
            } catch (Throwable th) {
                bea.K(w2, C, e);
                throw th;
            }
        }
        if (z) {
            this.b = true;
        }
        this.g -= fpaVar.d;
        ((eoh) this.e).setValue(fpaVar);
        ((eoh) this.u).setValue(Boolean.valueOf(((hpaVar != null ? hpaVar.a : 0) == 0 && i2 == 0) ? false : true));
        ((eoh) this.t).setValue(Boolean.valueOf(fpaVar.c));
        if (z2) {
            ipaVar.getClass();
            if (i2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                u3a.c("scrollOffset should be non-negative");
            }
            ipaVar.c.i(i2);
        } else {
            ipaVar.getClass();
            if (hpaVar != null && (gpaVar2 = (gpa) ph0.A(hpaVar.b)) != null) {
                obj = gpaVar2.b;
            }
            ipaVar.e = obj;
            if (ipaVar.d || i > 0) {
                ipaVar.d = true;
                if (i2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    u3a.c("scrollOffset should be non-negative (" + i2 + ')');
                }
                ipaVar.a((hpaVar == null || (gpaVar = (gpa) ph0.A(hpaVar.b)) == null) ? 0 : gpaVar.a, i2);
            }
            if (this.i) {
                qq4 qq4Var = this.a;
                i1d i1dVar = (i1d) qq4Var.e;
                int i3 = qq4Var.a;
                boolean z3 = qq4Var.b;
                if (i3 != -1 && !list.isEmpty() && i3 != qq4.b(fpaVar, z3)) {
                    qq4Var.a = -1;
                    Object[] objArr = i1dVar.a;
                    int i4 = i1dVar.c;
                    for (int i5 = 0; i5 < i4; i5++) {
                        ((dra) objArr[i5]).cancel();
                    }
                    i1dVar.n();
                }
                int i6 = qq4Var.c;
                if (i6 != -1 && qq4Var.d != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && i6 != i && !list.isEmpty()) {
                    int b = qq4.b(fpaVar, qq4Var.d < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    int i7 = qq4Var.d < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? ((gpa) CollectionsKt.h0(list)).a + 1 : ((gpa) CollectionsKt.Y(list)).a - 1;
                    if (i7 >= 0 && i7 < i && b != qq4Var.a && b >= 0) {
                        qq4Var.a = b;
                        i1dVar.n();
                        i1dVar.d(i1dVar.c, this.p.B(b));
                    }
                }
                qq4Var.c = i;
            }
        }
        if (z) {
            wj9Var.N(fpaVar.f, fpaVar.i, fpaVar.h);
        }
    }

    public final int g() {
        return this.d.b.h();
    }

    public final fpa h() {
        return (fpa) ((eoh) this.e).getValue();
    }

    public final void i(float f, fpa fpaVar) {
        if (this.i) {
            qq4 qq4Var = this.a;
            i1d i1dVar = (i1d) qq4Var.e;
            List list = fpaVar.m;
            List list2 = fpaVar.m;
            ewd ewdVar = fpaVar.q;
            if (!list.isEmpty()) {
                int i = 0;
                boolean z = f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                int b = qq4.b(fpaVar, z);
                int i2 = z ? ((gpa) CollectionsKt.h0(list2)).a + 1 : ((gpa) CollectionsKt.Y(list2)).a - 1;
                if (i2 >= 0 && i2 < fpaVar.p) {
                    if (b != qq4Var.a && b >= 0) {
                        if (qq4Var.b != z) {
                            Object[] objArr = i1dVar.a;
                            int i3 = i1dVar.c;
                            for (int i4 = 0; i4 < i3; i4++) {
                                ((dra) objArr[i4]).cancel();
                            }
                        }
                        qq4Var.b = z;
                        qq4Var.a = b;
                        i1dVar.n();
                        i1dVar.d(i1dVar.c, this.p.B(b));
                    }
                    if (z) {
                        gpa gpaVar = (gpa) CollectionsKt.h0(list2);
                        if (((uaa.v(gpaVar, ewdVar) + ((int) (ewdVar == ewd.a ? gpaVar.s & 4294967295L : gpaVar.s >> 32))) + fpaVar.s) - fpaVar.o < (-f)) {
                            Object[] objArr2 = i1dVar.a;
                            int i5 = i1dVar.c;
                            while (i < i5) {
                                ((dra) objArr2[i]).a();
                                i++;
                            }
                        }
                    } else if (fpaVar.n - uaa.v((gpa) CollectionsKt.Y(list2), ewdVar) < f) {
                        Object[] objArr3 = i1dVar.a;
                        int i6 = i1dVar.c;
                        while (i < i6) {
                            ((dra) objArr3[i]).a();
                            i++;
                        }
                    }
                }
            }
            qq4Var.d = f;
        }
    }
}
