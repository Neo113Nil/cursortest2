package defpackage;

import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.onboarding.components.bottomSheet.FantasySectionedInfoType;
import com.sofascore.results.fantasy.onboarding.components.bottomSheet.a;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class zx0 implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e1d b;

    public /* synthetic */ zx0(e1d e1dVar) {
        this.a = 3;
        this.b = e1dVar;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        e6b e6bVar;
        FantasySectionedInfoType weeklyCompetitions;
        int i = this.a;
        a99 a99Var = nf3.a;
        utc utcVar = utc.a;
        e1d e1dVar = this.b;
        switch (i) {
            case 0:
                e7d e7dVar = (e7d) obj;
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= ((av8) of3Var).g(e7dVar) ? 4 : 2;
                }
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 19) != 18)) {
                    List list = (List) e1dVar.getValue();
                    boolean z = (intValue & 14) == 4;
                    Object O = av8Var.O();
                    if (z || O == a99Var) {
                        O = new u2(e7dVar, 11);
                        av8Var.n0(O);
                    }
                    Function1 function1 = (Function1) O;
                    if (list instanceof RandomAccess) {
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            if (((Boolean) function1.invoke(list.get(i2))).booleanValue()) {
                                e6bVar = e6b.e;
                            }
                        }
                        e6bVar = e6b.c;
                    } else {
                        if (list == null || !list.isEmpty()) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                if (((Boolean) function1.invoke(it.next())).booleanValue()) {
                                    e6bVar = e6b.e;
                                }
                            }
                        }
                        e6bVar = e6b.c;
                    }
                    tol.b(mhb.a.a(i2a.H(e6bVar, av8Var)), yqo.H(-1713684244, av8Var, new yx0(e7dVar, 0)), av8Var, 56);
                } else {
                    av8Var.W();
                }
                break;
            case 1:
                xpa xpaVar = (xpa) obj;
                of3 of3Var2 = (of3) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                xpaVar.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((av8) of3Var2).g(xpaVar) ? 4 : 2;
                }
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 19) != 18)) {
                    xtc f0 = l98.f0(n9e.q(bkh.d(xpa.a(xpaVar, utcVar, 7), 1.0f), lz.D(R.color.surface_1, av8Var2), o7g.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 16.0f, 3)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 5);
                    k1c c = e12.c(uxf.c, false);
                    int hashCode = Long.hashCode(av8Var2.T);
                    aee m = av8Var2.m();
                    xtc C = fqj.C(av8Var2, f0);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var);
                    } else {
                        av8Var2.q0();
                    }
                    waa.K(av8Var2, c, hf3.g);
                    waa.K(av8Var2, m, hf3.f);
                    waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
                    waa.J(av8Var2, hf3.k);
                    waa.K(av8Var2, C, hf3.d);
                    String v = oea.v(R.string.show_more, av8Var2);
                    xtc q = n9e.q(n12.a.a(utcVar, uxf.g), lz.D(R.color.primary_default, av8Var2), o7g.a(32.0f));
                    Object O2 = av8Var2.O();
                    if (O2 == a99Var) {
                        O2 = new v30(7, e1dVar);
                        av8Var2.n0(O2);
                    }
                    xtc c0 = l98.c0(tol.y(q, false, false, false, 0L, null, (Function0) O2, av8Var2, 31), 12.0f, 4.0f);
                    yf8 yf8Var = xth.a;
                    udj.c(v, c0, lz.D(R.color.surface_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var2, 0, 0, 131064);
                    av8Var2.s(true);
                } else {
                    av8Var2.W();
                }
                break;
            case 2:
                of3 of3Var3 = (of3) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, (intValue3 & 17) != 16)) {
                    FantasyCompetitionType fantasyCompetitionType = ((mb7) e1dVar.getValue()).f;
                    if (fantasyCompetitionType == null) {
                        av8Var3.d0(-641436751);
                        av8Var3.s(false);
                    } else {
                        av8Var3.d0(-641436750);
                        int i3 = kb7.a[fantasyCompetitionType.ordinal()];
                        if (i3 == 1) {
                            weeklyCompetitions = new FantasySectionedInfoType.WeeklyCompetitions(null);
                        } else if (i3 != 2) {
                            zzl.b();
                            break;
                        } else {
                            weeklyCompetitions = new FantasySectionedInfoType.SeasonCompetitions(null);
                        }
                        FantasySectionedInfoType fantasySectionedInfoType = weeklyCompetitions;
                        a.a(fantasySectionedInfoType, m6k.r(utcVar, "OnboardingInfoModal", new su(Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE, fantasySectionedInfoType.Q0(), null)), null, av8Var3, 0, 4);
                        av8Var3.s(false);
                    }
                } else {
                    av8Var3.W();
                }
                break;
            default:
                of3 of3Var4 = (of3) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((m12) obj).getClass();
                av8 av8Var4 = (av8) of3Var4;
                if (av8Var4.T(intValue4 & 1, (intValue4 & 17) != 16)) {
                    o1j.o((vnb) e1dVar.getValue(), av8Var4, 0);
                } else {
                    av8Var4.W();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ zx0(int i, e1d e1dVar) {
        this.a = i;
        this.b = e1dVar;
    }
}
