package defpackage;

import android.content.Context;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.results.R;
import com.sofascore.results.onboarding.follow.model.OnboardingItemUiModel;
import com.sofascore.results.team.statistics.TeamSeasonStatisticsFragment;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class n61 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n61(int i, Object obj, int i2, int i3) {
        this.a = i3;
        this.b = i;
        this.c = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = 3;
        Object obj3 = this.c;
        int i3 = this.b;
        switch (i) {
            case 0:
                fm8 fm8Var = (fm8) obj3;
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    rdh rdhVar = (rdh) fm8Var;
                    l6g.v(rdhVar.c(), rdhVar.d(), rdhVar.b(), yqo.H(-175199530, av8Var, new sj(fm8Var, i3, i2)), av8Var, 3072);
                } else {
                    av8Var.W();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                o02.t((sl1) obj3, (of3) obj, aba.K(i3 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                j72.o((t83) obj3, (of3) obj, aba.K(i3 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                m6k.a((uk4) obj3, (of3) obj, aba.K(i3 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                fcp.X(i3, (r13) obj3, (of3) obj, aba.K(7));
                break;
            case 5:
                zoa zoaVar = (zoa) obj3;
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    h9a j = zoaVar.b.b.j(i3);
                    ((woa) j.c).d.invoke(bpa.a, Integer.valueOf(i3 - j.a), av8Var2, 6);
                } else {
                    av8Var2.W();
                }
                break;
            case 6:
                sra sraVar = (sra) obj3;
                of3 of3Var3 = (of3) obj;
                int intValue3 = ((Integer) obj2).intValue();
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, (intValue3 & 3) != 2)) {
                    h9a j2 = sraVar.b.a.j(i3);
                    ((qra) j2.c).c.invoke(sraVar.c, Integer.valueOf(i3 - j2.a), av8Var3, 0);
                } else {
                    av8Var3.W();
                }
                break;
            case 7:
                Context context = (Context) obj3;
                of3 of3Var4 = (of3) obj;
                int intValue4 = ((Integer) obj2).intValue();
                av8 av8Var4 = (av8) of3Var4;
                if (av8Var4.T(intValue4 & 1, (intValue4 & 3) != 2)) {
                    utc utcVar = utc.a;
                    xtc d0 = l98.d0(bkh.d(utcVar, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                    l8g a = k8g.a(ww9.h, uxf.m, av8Var4, 54);
                    int hashCode = Long.hashCode(av8Var4.T);
                    aee m = av8Var4.m();
                    xtc C = fqj.C(av8Var4, d0);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var4.h0();
                    if (av8Var4.S) {
                        av8Var4.l(zg3Var);
                    } else {
                        av8Var4.q0();
                    }
                    waa.K(av8Var4, a, hf3.g);
                    waa.K(av8Var4, m, hf3.f);
                    waa.K(av8Var4, Integer.valueOf(hashCode), hf3.j);
                    waa.J(av8Var4, hf3.k);
                    waa.K(av8Var4, C, hf3.d);
                    wkn.k(haa.t(2131232884, 0, av8Var4), null, bkh.m(utcVar, 80.0f, 56.0f), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var4, 440, 120);
                    String v = oea.v(R.string.vote, av8Var4);
                    boolean i4 = av8Var4.i(context) | av8Var4.e(i3);
                    Object O = av8Var4.O();
                    if (i4 || O == nf3.a) {
                        O = new xi7(context, i3, i2);
                        av8Var4.n0(O);
                    }
                    mha.h(v, (Function0) O, null, uqh.a, null, false, false, false, 0L, 0, 0, av8Var4, 3072, 0, 2036);
                    wkn.k(haa.t(2131232388, 0, av8Var4), null, bkh.m(utcVar, 80.0f, 56.0f), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var4, 440, 120);
                    av8Var4.s(true);
                } else {
                    av8Var4.W();
                }
                break;
            case 8:
                ((Integer) obj2).getClass();
                fcp.M((Event) obj3, i3, (of3) obj, aba.K(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                ((e7d) obj3).a(aba.K(i3 | 1), (of3) obj);
                break;
            case 10:
                ((Integer) obj2).intValue();
                krd.c((OnboardingItemUiModel) obj3, (of3) obj, aba.K(i3 | 1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                cga.k((qzd) obj3, (of3) obj, aba.K(i3 | 1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                u0a.d((d2e) obj3, (of3) obj, aba.K(i3 | 1));
                break;
            case 13:
                p5e p5eVar = (p5e) obj3;
                of3 of3Var5 = (of3) obj;
                int intValue5 = ((Integer) obj2).intValue();
                av8 av8Var5 = (av8) of3Var5;
                if (av8Var5.T(intValue5 & 1, (intValue5 & 3) != 2)) {
                    h9a j3 = p5eVar.b.h().j(i3);
                    ((k5e) j3.c).b.invoke(u5e.a, Integer.valueOf(i3 - j3.a), av8Var5, 0);
                } else {
                    av8Var5.W();
                }
                break;
            case 14:
                ((Integer) obj2).getClass();
                ((TeamSeasonStatisticsFragment) obj3).C(i3, aba.K(1), (of3) obj);
                break;
            case 15:
                ((Integer) obj2).intValue();
                euj.d((wtj) obj3, (of3) obj, aba.K(i3 | 1));
                break;
            case 16:
                tc3 tc3Var = (tc3) obj3;
                of3 of3Var6 = (of3) obj;
                int intValue6 = ((Integer) obj2).intValue();
                av8 av8Var6 = (av8) of3Var6;
                if (av8Var6.T(intValue6 & 1, (intValue6 & 3) != 2)) {
                    tc3Var.invoke(Integer.valueOf(i3), av8Var6, 0);
                } else {
                    av8Var6.W();
                }
                break;
            case 17:
                ((Integer) obj2).getClass();
                hxk.b((jxk) obj3, (of3) obj, aba.K(i3 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                bea.i(i3, (vy8) obj3, (of3) obj, aba.K(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ n61(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    public /* synthetic */ n61(Object obj, int i, int i2, int i3) {
        this.a = i3;
        this.c = obj;
        this.b = i;
    }
}
