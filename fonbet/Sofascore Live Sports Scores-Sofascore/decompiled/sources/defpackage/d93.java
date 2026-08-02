package defpackage;

import com.sofascore.model.crowdsourcing.EventSuggest;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class d93 implements et8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gv9 b;
    public final /* synthetic */ gv9 c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ d93(gv9 gv9Var, gv9 gv9Var2, Function1 function1, int i) {
        this.a = i;
        this.b = gv9Var;
        this.c = gv9Var2;
        this.d = function1;
    }

    @Override // defpackage.et8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3 = this.a;
        int i4 = 3;
        utc utcVar = utc.a;
        gv9 gv9Var = this.b;
        gv9 gv9Var2 = this.c;
        switch (i3) {
            case 0:
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
                    y83 y83Var = (y83) gv9Var.get(intValue);
                    av8Var.d0(935106416);
                    String str = y83Var.d;
                    boolean equals = y83Var.equals(CollectionsKt.h0(gv9Var2));
                    Object obj5 = this.d;
                    boolean g = av8Var.g(obj5) | av8Var.i(y83Var);
                    Object O = av8Var.O();
                    if (g || O == nf3.a) {
                        O = new pi(i4, obj5, y83Var);
                        av8Var.n0(O);
                    }
                    gz8.n(0, av8Var, xpa.a(xpaVar, utcVar, 7), str, (Function0) O, equals);
                    av8Var.s(false);
                } else {
                    av8Var.W();
                }
                break;
            default:
                uah uahVar = oyn.e;
                xpa xpaVar2 = (xpa) obj;
                int intValue3 = ((Number) obj2).intValue();
                of3 of3Var2 = (of3) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    i2 = intValue4 | (((av8) of3Var2).g(xpaVar2) ? 4 : 2);
                } else {
                    i2 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i2 |= ((av8) of3Var2).e(intValue3) ? 32 : 16;
                }
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(i2 & 1, (i2 & 147) != 146)) {
                    EventSuggest.IncidentSuggest incidentSuggest = (EventSuggest.IncidentSuggest) gv9Var.get(intValue3);
                    av8Var2.d0(1145678177);
                    if (intValue3 != 0) {
                        av8Var2.d0(1145672968);
                        nq8.h(av8Var2, n9e.q(bkh.d(bkh.e(utcVar, 1.0f), 1.0f), lz.D(R.color.surface_0, av8Var2), uahVar));
                        av8Var2.s(false);
                    } else {
                        av8Var2.d0(1145863246);
                        av8Var2.s(false);
                    }
                    String v = oea.v(R.string.crowdsourcing_add_scorer, av8Var2);
                    if (gv9Var2.size() == 1) {
                        uahVar = o7g.a(16.0f);
                    } else if (Intrinsics.c(incidentSuggest, CollectionsKt.Y(gv9Var2))) {
                        uahVar = o7g.c(16.0f, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12);
                    } else if (Intrinsics.c(incidentSuggest, CollectionsKt.h0(gv9Var2))) {
                        uahVar = o7g.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 16.0f, 3);
                    }
                    a0a.c(incidentSuggest, v, this.d, null, false, uahVar, av8Var2, 0, 24);
                    av8Var2.s(false);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
