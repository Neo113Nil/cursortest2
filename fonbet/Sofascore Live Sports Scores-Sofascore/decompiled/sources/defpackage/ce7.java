package defpackage;

import android.content.Context;
import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class ce7 implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cz6 b;
    public final /* synthetic */ Context c;

    public /* synthetic */ ce7(Context context, cz6 cz6Var) {
        this.a = 2;
        this.c = context;
        this.b = cz6Var;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean i;
        Object O;
        int i2 = this.a;
        a99 a99Var = nf3.a;
        utc utcVar = utc.a;
        cz6 cz6Var = this.b;
        Context context = this.c;
        switch (i2) {
            case 0:
                xpa xpaVar = (xpa) obj;
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                xpaVar.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((av8) of3Var).g(xpaVar) ? 4 : 2;
                }
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 19) != 18)) {
                    int i3 = cz6Var.h;
                    FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel = cz6Var.d;
                    boolean z2 = fantasyRoundPlayerUiModel.m;
                    boolean z3 = cz6Var.f;
                    gv9 gv9Var = cz6Var.b;
                    if (gv9Var == null || !gv9Var.isEmpty()) {
                        Iterator<E> it = gv9Var.iterator();
                        while (it.hasNext()) {
                            if (((qx6) it.next()).a.c()) {
                                z = true;
                                boolean c = fantasyRoundPlayerUiModel.c();
                                i = av8Var.i(context) | av8Var.g(cz6Var);
                                O = av8Var.O();
                                if (!i || O == a99Var) {
                                    O = new fe7(0, cz6Var, context);
                                    av8Var.n0(O);
                                }
                                ktm.o(i3, z2, z3, z, c, (Function0) O, xpa.a(xpaVar, l98.d0(l98.f0(utc.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 7), av8Var, 0, 0);
                            }
                        }
                    }
                    z = false;
                    boolean c2 = fantasyRoundPlayerUiModel.c();
                    i = av8Var.i(context) | av8Var.g(cz6Var);
                    O = av8Var.O();
                    if (!i) {
                    }
                    O = new fe7(0, cz6Var, context);
                    av8Var.n0(O);
                    ktm.o(i3, z2, z3, z, c2, (Function0) O, xpa.a(xpaVar, l98.d0(l98.f0(utc.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 7), av8Var, 0, 0);
                } else {
                    av8Var.W();
                }
                break;
            case 1:
                of3 of3Var2 = (of3) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                    xtc c0 = l98.c0(utcVar, 16.0f, 8.0f);
                    a07 a07Var = cz6Var.c;
                    ev6 ev6Var = cz6Var.g;
                    FantasyCompetitionType fantasyCompetitionType = ev6Var.d;
                    boolean z4 = ev6Var.A;
                    boolean i4 = av8Var2.i(context);
                    Object O2 = av8Var2.O();
                    if (i4 || O2 == a99Var) {
                        O2 = new vt(context, 3);
                        av8Var2.n0(O2);
                    }
                    z8e.h(a07Var, fantasyCompetitionType, (Function1) O2, z4, c0, av8Var2, 24576);
                } else {
                    av8Var2.W();
                }
                break;
            default:
                xpa xpaVar2 = (xpa) obj;
                of3 of3Var3 = (of3) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                xpaVar2.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((av8) of3Var3).g(xpaVar2) ? 4 : 2;
                }
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, (intValue3 & 19) != 18)) {
                    String v = oea.v(R.string.points_breakdown, av8Var3);
                    mj7 mj7Var = cz6Var.e;
                    i2a.f(dmi.r(v, " (", f5p.C(context, mj7Var.c, mj7Var.b), ")"), l98.d0(bkh.d(xpa.a(xpaVar2, utcVar, 7), 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), null, av8Var3, 0, 4);
                } else {
                    av8Var3.W();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ ce7(int i, cz6 cz6Var, Context context) {
        this.a = i;
        this.b = cz6Var;
        this.c = context;
    }
}
