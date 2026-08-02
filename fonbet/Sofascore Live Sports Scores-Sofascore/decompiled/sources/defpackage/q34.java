package defpackage;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.sofascore.model.crowdsourcing.EventSuggest;
import com.sofascore.model.crowdsourcing.SuggestStatus;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class q34 implements et8 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ List c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ dt8 e;

    public q34(gv9 gv9Var, Function1 function1, gv9 gv9Var2, boolean z) {
        this.c = gv9Var;
        this.e = function1;
        this.d = gv9Var2;
        this.b = z;
    }

    @Override // defpackage.et8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.a;
        List list = this.c;
        Object obj5 = this.d;
        Object obj6 = this.e;
        utc utcVar = utc.a;
        switch (i) {
            case 0:
                xpa xpaVar = (xpa) obj;
                int intValue = ((Number) obj2).intValue();
                of3 of3Var = (of3) obj3;
                int intValue2 = ((Number) obj4).intValue();
                int i2 = (intValue2 & 6) == 0 ? intValue2 | (((av8) of3Var).g(xpaVar) ? 4 : 2) : intValue2;
                if ((intValue2 & 48) == 0) {
                    i2 |= ((av8) of3Var).e(intValue) ? 32 : 16;
                }
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
                    EventSuggest.IncidentSuggest incidentSuggest = (EventSuggest.IncidentSuggest) ((gv9) list).get(intValue);
                    av8Var.d0(-1485758354);
                    xtc d = bkh.d(bkh.e(utcVar, 1.0f), 1.0f);
                    long D = lz.D(R.color.surface_0, av8Var);
                    uah uahVar = oyn.e;
                    nq8.h(av8Var, n9e.q(d, D, uahVar));
                    String v = oea.v(R.string.crowdsourcing_add_scorer, av8Var);
                    Function1 function1 = incidentSuggest.getStatus() != SuggestStatus.SUBMITTED ? (Function1) obj6 : null;
                    if (incidentSuggest.equals(CollectionsKt.h0((gv9) obj5)) && !this.b) {
                        uahVar = o7g.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 16.0f, 3);
                    }
                    a0a.c(incidentSuggest, v, function1, null, false, uahVar, av8Var, 0, 24);
                    av8Var.s(false);
                } else {
                    av8Var.W();
                }
                break;
            default:
                xpa xpaVar2 = (xpa) obj;
                int intValue3 = ((Number) obj2).intValue();
                of3 of3Var2 = (of3) obj3;
                int intValue4 = ((Number) obj4).intValue();
                Object obj7 = (Function2) obj6;
                re7 re7Var = (re7) obj5;
                int i3 = (intValue4 & 6) == 0 ? intValue4 | (((av8) of3Var2).g(xpaVar2) ? 4 : 2) : intValue4;
                if ((intValue4 & 48) == 0) {
                    i3 |= ((av8) of3Var2).e(intValue3) ? 32 : 16;
                }
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(i3 & 1, (i3 & 147) != 146)) {
                    kj7 kj7Var = (kj7) list.get(intValue3);
                    av8Var2.d0(-1180695931);
                    String g = fc6.g(kj7Var.a.a, kj7Var.b, "_");
                    xtc x = gz8.x(bkh.d(utcVar, 1.0f), null, null, 3);
                    u23 a = t23.a(ww9.d, uxf.o, av8Var2, 0);
                    int hashCode = Long.hashCode(av8Var2.T);
                    aee m = av8Var2.m();
                    xtc C = fqj.C(av8Var2, x);
                    if3.k7.getClass();
                    Function0 function0 = hf3.b;
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(function0);
                    } else {
                        av8Var2.q0();
                    }
                    waa.K(av8Var2, a, hf3.g);
                    waa.K(av8Var2, m, hf3.f);
                    waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
                    waa.J(av8Var2, hf3.k);
                    waa.K(av8Var2, C, hf3.d);
                    tee teeVar = re7Var.c;
                    boolean contains = ((wv9) teeVar.keySet()).contains(g);
                    boolean g2 = av8Var2.g(obj7) | av8Var2.g(kj7Var);
                    Object O = av8Var2.O();
                    if (g2 || O == nf3.a) {
                        O = new pi(10, obj7, kj7Var);
                        av8Var2.n0(O);
                    }
                    lz.j(kj7Var, contains, (Function0) O, this.b, xpa.a(xpaVar2, utcVar, 7), av8Var2, 0);
                    if (teeVar.containsKey(g)) {
                        av8Var2.d0(-2041127142);
                        ki6 ki6Var = (ki6) teeVar.get(g);
                        if (Intrinsics.c(ki6Var != null ? Boolean.valueOf(ki6Var.a) : null, Boolean.TRUE)) {
                            av8Var2.d0(-2041087865);
                            s6a.f(36.0f, 4.0f, 432, 57, 0L, 0L, av8Var2, null);
                            av8Var2.s(false);
                        } else {
                            av8Var2.d0(-2040761528);
                            ki6 ki6Var2 = (ki6) teeVar.get(g);
                            gv9<qx6> gv9Var = ki6Var2 != null ? ki6Var2.b : null;
                            if (gv9Var == null) {
                                av8Var2.d0(-2040761529);
                                av8Var2.s(false);
                            } else {
                                av8Var2.d0(-2040761528);
                                for (qx6 qx6Var : gv9Var) {
                                    wn1 wn1Var = qx6Var.a;
                                    gv9<ae7> gv9Var2 = qx6Var.b;
                                    rz8.l(wn1Var, qx6Var.c, !(gv9Var2 == null || gv9Var2.isEmpty()), qx6Var.d, this.b, l98.b0(utcVar, 8.0f), lz.D(R.color.surface_2, av8Var2), 0L, 0L, 0L, false, av8Var2, 196608, 0, 1920);
                                    ktm.n(0, 1, av8Var2, null);
                                    if (gv9Var2 == null) {
                                        av8Var2.d0(-637706804);
                                        av8Var2.s(false);
                                    } else {
                                        av8Var2.d0(-637706803);
                                        for (ae7 ae7Var : gv9Var2) {
                                            if (Intrinsics.c(ae7Var.a, CampaignEx.JSON_KEY_STAR)) {
                                                av8Var2.d0(684907956);
                                                u6h.k(ae7Var, false, null, 0L, av8Var2, 48, 12);
                                                av8Var2.s(false);
                                            } else {
                                                av8Var2.d0(685062522);
                                                u6h.l(ae7Var, false, null, 0L, av8Var2, 48, 12);
                                                av8Var2.s(false);
                                            }
                                        }
                                        av8Var2.s(false);
                                    }
                                }
                                av8Var2.s(false);
                                Unit unit = Unit.a;
                            }
                            av8Var2.s(false);
                        }
                        av8Var2.s(false);
                    } else {
                        av8Var2.d0(-2039552063);
                        av8Var2.s(false);
                    }
                    av8Var2.s(true);
                    av8Var2.s(false);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }

    public q34(List list, re7 re7Var, Function2 function2, boolean z) {
        this.c = list;
        this.d = re7Var;
        this.e = function2;
        this.b = z;
    }
}
