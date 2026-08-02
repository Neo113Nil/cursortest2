package defpackage;

import android.content.Context;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class y77 implements et8 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ y77(mhj mhjVar, mhj mhjVar2, mhj mhjVar3, mhj mhjVar4, boolean z, Function1 function1, cdi cdiVar) {
        this.c = mhjVar;
        this.d = mhjVar2;
        this.e = mhjVar3;
        this.f = mhjVar4;
        this.b = z;
        this.g = function1;
        this.h = cdiVar;
    }

    @Override // defpackage.et8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        ku3 ku3Var;
        int i3 = this.a;
        a99 a99Var = nf3.a;
        utc utcVar = utc.a;
        Object obj5 = this.h;
        Object obj6 = this.g;
        Object obj7 = this.f;
        Object obj8 = this.e;
        Object obj9 = this.d;
        Object obj10 = this.c;
        boolean z = this.b;
        switch (i3) {
            case 0:
                mhj mhjVar = (mhj) obj10;
                mhj mhjVar2 = (mhj) obj9;
                mhj mhjVar3 = (mhj) obj8;
                mhj mhjVar4 = (mhj) obj7;
                Function1 function1 = (Function1) obj6;
                cdi cdiVar = (cdi) obj5;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                of3 of3Var = (of3) obj3;
                ((Integer) obj4).getClass();
                ((k60) obj).getClass();
                if (booleanValue) {
                    av8 av8Var = (av8) of3Var;
                    av8Var.d0(430523075);
                    gvd.c(((js8) cdiVar.getValue()).d > 0 ? mhjVar : mhjVar2, ((js8) cdiVar.getValue()).d > 0 ? mhjVar2 : mhjVar3, ((js8) cdiVar.getValue()).d > 0 ? mhjVar3 : mhjVar4, lz.D(R.color.n_lv_1, av8Var), null, null, v8a.v(16), 4.0f, av8Var, 14155776, 48);
                    av8Var.s(false);
                } else {
                    av8 av8Var2 = (av8) of3Var;
                    av8Var2.d0(431052059);
                    xtc d = bkh.d(utcVar, 1.0f);
                    if (z) {
                        i = 2092118586;
                        i2 = R.string.fantasy_create_lineup_button;
                    } else {
                        i = 2092120634;
                        i2 = R.string.fantasy_show_fixtures_button;
                    }
                    String k = ljg.k(av8Var2, i, i2, av8Var2, false);
                    boolean g = av8Var2.g(function1) | av8Var2.h(z);
                    Object O = av8Var2.O();
                    if (g || O == a99Var) {
                        O = new ct2(function1, z, 1);
                        av8Var2.n0(O);
                    }
                    qx9.m(k, (Function0) O, d, 0L, 0L, false, av8Var2, 384, 56);
                    av8Var2.s(false);
                }
                break;
            default:
                n52 n52Var = (n52) obj10;
                g3j g3jVar = (g3j) obj9;
                ynj ynjVar = (ynj) obj8;
                ksa ksaVar = (ksa) obj7;
                Context context = (Context) obj6;
                ku3 ku3Var2 = (ku3) obj5;
                ((Integer) obj2).getClass();
                of3 of3Var2 = (of3) obj3;
                int intValue = ((Integer) obj4).intValue();
                ((xpa) obj).getClass();
                av8 av8Var3 = (av8) of3Var2;
                if (av8Var3.T(intValue & 1, (intValue & 129) != 128)) {
                    av8Var3.d0(129344779);
                    xtc f0 = l98.f0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 7);
                    if (z) {
                        ku3Var = ku3Var2;
                    } else {
                        ku3Var = ku3Var2;
                        f0 = f0.z(n9e.q(utcVar, lz.D(R.color.surface_1, av8Var3), oyn.e));
                    }
                    av8Var3.s(false);
                    if (n52Var != null) {
                        f0 = f0.z(n9e.p(utcVar, n52Var, null, 6));
                    }
                    k1c c = e12.c(uxf.c, false);
                    int hashCode = Long.hashCode(av8Var3.T);
                    aee m = av8Var3.m();
                    xtc C = fqj.C(av8Var3, f0);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var3.h0();
                    if (av8Var3.S) {
                        av8Var3.l(zg3Var);
                    } else {
                        av8Var3.q0();
                    }
                    waa.K(av8Var3, c, hf3.g);
                    waa.K(av8Var3, m, hf3.f);
                    waa.K(av8Var3, Integer.valueOf(hashCode), hf3.j);
                    waa.J(av8Var3, hf3.k);
                    waa.K(av8Var3, C, hf3.d);
                    gv9 gv9Var = g3jVar.i;
                    uxh uxhVar = z ? rxh.i : sxh.i;
                    oxh oxhVar = new oxh(new zl2("Quick Find", -1), oea.v(R.string.quick_find, av8Var3), null, null, null, false, 252);
                    t3e t3eVar = new t3e(8.0f, 8.0f, 8.0f, 8.0f);
                    xtc O2 = kda.O(utcVar, "quick_find_spinner", av8Var3);
                    ku3 ku3Var3 = ku3Var;
                    boolean i4 = av8Var3.i(ynjVar) | av8Var3.g(ksaVar) | av8Var3.i(context) | av8Var3.i(ku3Var3);
                    Object O3 = av8Var3.O();
                    if (i4 || O3 == a99Var) {
                        lwc lwcVar = new lwc(ynjVar, ksaVar, context, ku3Var3, 11);
                        av8Var3.n0(lwcVar);
                        O3 = lwcVar;
                    }
                    r4a.j(gv9Var, oxhVar, (Function1) O3, O2, uxhVar, false, t3eVar, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var3, 12582912, 864);
                    tz9.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 14, 0L, 0L, av8Var3, n12.a.a(utcVar, uxf.j));
                    av8Var3.s(true);
                } else {
                    av8Var3.W();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ y77(boolean z, n52 n52Var, g3j g3jVar, ynj ynjVar, ksa ksaVar, Context context, ku3 ku3Var) {
        this.b = z;
        this.c = n52Var;
        this.d = g3jVar;
        this.e = ynjVar;
        this.f = ksaVar;
        this.g = context;
        this.h = ku3Var;
    }
}
