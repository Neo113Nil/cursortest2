package defpackage;

import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class vu5 implements et8 {
    public final /* synthetic */ List a;
    public final /* synthetic */ l22 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ List d;
    public final /* synthetic */ int e;
    public final /* synthetic */ mzg f;
    public final /* synthetic */ float g;
    public final /* synthetic */ fv5 h;
    public final /* synthetic */ float i;
    public final /* synthetic */ int j;
    public final /* synthetic */ Function2 k;

    public vu5(List list, l22 l22Var, boolean z, List list2, int i, mzg mzgVar, float f, fv5 fv5Var, float f2, int i2, Function2 function2) {
        this.a = list;
        this.b = l22Var;
        this.c = z;
        this.d = list2;
        this.e = i;
        this.f = mzgVar;
        this.g = f;
        this.h = fv5Var;
        this.i = f2;
        this.j = i2;
        this.k = function2;
    }

    @Override // defpackage.et8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        xpa xpaVar = (xpa) obj;
        int intValue = ((Number) obj2).intValue();
        of3 of3Var = (of3) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i = (((av8) of3Var).g(xpaVar) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= ((av8) of3Var).e(intValue) ? 32 : 16;
        }
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(i & 1, (i & 147) != 146)) {
            ku5 ku5Var = (ku5) this.a.get(intValue);
            av8Var.d0(-1094446681);
            float f = (intValue != b.i(this.b.a.b) || this.c) ? 0.0f : 16.0f;
            utc utcVar = utc.a;
            xtc J = lz.J(xpa.a(xpaVar, utcVar, 7), (e9d) this.d.get(this.e), null);
            float f2 = this.g;
            mzg mzgVar = this.f;
            xtc K = yqo.K(J, mzgVar, f2, av8Var);
            long D = lz.D(R.color.surface_0, av8Var);
            jf9 jf9Var = oyn.e;
            xtc d0 = l98.d0(n9e.q(K, D, jf9Var), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            k1c c = e12.c(uxf.c, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, d0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            float h = mzgVar.a.h();
            qug qugVar = mzgVar.c;
            boolean booleanValue = ((Boolean) ((eoh) mzgVar.b).getValue()).booleanValue();
            boolean booleanValue2 = ((Boolean) mzgVar.d.getValue()).booleanValue();
            boolean z = this.h.c;
            xtc q = n9e.q(wnn.A(utcVar, o7g.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f, 3)), lz.D(R.color.surface_1, av8Var), jf9Var);
            long D2 = lz.D(R.color.n_lv_4, av8Var);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = mz1.e(av8Var);
            }
            wzc wzcVar = (wzc) O;
            Object[] objArr = new Object[0];
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = b74.j;
                av8Var.n0(O2);
            }
            pco.d(ku5Var, h, this.i, this.g, booleanValue, qugVar, booleanValue2, z, this.j, tol.y(q, true, true, true, D2, wzcVar, new gi(7, (boh) o3a.N(objArr, (Function0) O2, av8Var, 48), this.k, ku5Var), av8Var, 0), av8Var, 0);
            av8Var.s(true);
            av8Var.s(false);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }
}
