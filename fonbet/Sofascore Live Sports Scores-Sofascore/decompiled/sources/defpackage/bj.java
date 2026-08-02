package defpackage;

import android.content.Context;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class bj implements et8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ Context c;

    public /* synthetic */ bj(int i, Context context, List list) {
        this.a = i;
        this.b = list;
        this.c = context;
    }

    @Override // defpackage.et8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        int i4 = this.a;
        a99 a99Var = nf3.a;
        Context context = this.c;
        utc utcVar = utc.a;
        List list = this.b;
        int i5 = 0;
        switch (i4) {
            case 0:
                xpa xpaVar = (xpa) obj;
                int intValue = ((Number) obj2).intValue();
                of3 of3Var = (of3) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    i = intValue2 | (((av8) of3Var).g(xpaVar) ? 4 : 2);
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= ((av8) of3Var).e(intValue) ? 32 : 16;
                }
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(i & 1, (i & 147) != 146)) {
                    pv3 pv3Var = (pv3) list.get(intValue);
                    av8Var.d0(-1803989036);
                    boolean i6 = av8Var.i(context) | av8Var.g(pv3Var);
                    Object O = av8Var.O();
                    if (i6 || O == a99Var) {
                        O = new yi(context, pv3Var, 0);
                        av8Var.n0(O);
                    }
                    s6a.l(pv3Var, bea.Q(utcVar, (Function0) O, 3), av8Var, 0);
                    av8Var.s(false);
                } else {
                    av8Var.W();
                }
                break;
            case 1:
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
                    pv3 pv3Var2 = (pv3) list.get(intValue3);
                    av8Var2.d0(1380090703);
                    xtc d0 = l98.d0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                    boolean i7 = av8Var2.i(context) | av8Var2.g(pv3Var2);
                    Object O2 = av8Var2.O();
                    if (i7 || O2 == a99Var) {
                        O2 = new yi(context, pv3Var2, 1);
                        av8Var2.n0(O2);
                    }
                    s6a.l(pv3Var2, bea.Q(d0, (Function0) O2, 3), av8Var2, 0);
                    av8Var2.s(false);
                } else {
                    av8Var2.W();
                }
                break;
            default:
                xpa xpaVar3 = (xpa) obj;
                int intValue5 = ((Number) obj2).intValue();
                of3 of3Var3 = (of3) obj3;
                int intValue6 = ((Number) obj4).intValue();
                if ((intValue6 & 6) == 0) {
                    i3 = (((av8) of3Var3).g(xpaVar3) ? 4 : 2) | intValue6;
                } else {
                    i3 = intValue6;
                }
                if ((intValue6 & 48) == 0) {
                    i3 |= ((av8) of3Var3).e(intValue5) ? 32 : 16;
                }
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(i3 & 1, (i3 & 147) != 146)) {
                    Object obj5 = list.get(intValue5);
                    av8Var3.d0(1684921469);
                    un0.a(l98.f0(bkh.m(xpa.a(xpaVar3, utcVar, 7), 168.0f, 104.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 8.0f, 8.0f, 1), o7g.a(12.0f), rd0.t(lz.D(R.color.surface_1, av8Var3), av8Var3, 0), rd0.u(2.0f, 62), null, yqo.H(1649450326, av8Var3, new ef8(i5, obj5, context)), av8Var3, 196608, 16);
                    av8Var3.s(false);
                } else {
                    av8Var3.W();
                }
                break;
        }
        return Unit.a;
    }
}
