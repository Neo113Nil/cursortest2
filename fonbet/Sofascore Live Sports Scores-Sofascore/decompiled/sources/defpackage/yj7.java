package defpackage;

import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class yj7 implements et8 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ gv9 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ yj7(gv9 gv9Var, boolean z, Integer num, r13 r13Var, String str, String str2, Function1 function1, wla wlaVar) {
        this.b = gv9Var;
        this.c = z;
        this.e = num;
        this.f = r13Var;
        this.g = str;
        this.h = str2;
        this.d = function1;
        this.i = wlaVar;
    }

    @Override // defpackage.et8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        int i2 = this.a;
        Object obj5 = this.i;
        Object obj6 = this.h;
        Object obj7 = this.g;
        Object obj8 = this.f;
        Object obj9 = this.e;
        gv9 gv9Var = this.b;
        switch (i2) {
            case 0:
                osa osaVar = (osa) obj9;
                FantasyCompetitionType fantasyCompetitionType = (FantasyCompetitionType) obj8;
                mei meiVar = (mei) obj7;
                Function1 function1 = (Function1) obj6;
                qug qugVar = (qug) obj5;
                xpa xpaVar = (xpa) obj;
                int intValue = ((Integer) obj2).intValue();
                of3 of3Var = (of3) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                xpaVar.getClass();
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
                    q67 q67Var = (q67) osaVar.b(intValue);
                    if (q67Var == null) {
                        av8Var.d0(866809186);
                        av8Var.s(false);
                    } else {
                        av8Var.d0(866809187);
                        FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel = q67Var.a;
                        int i3 = ek7.a[fantasyCompetitionType.ordinal()];
                        utc utcVar = utc.a;
                        boolean z2 = this.c;
                        Function1 function12 = this.d;
                        if (i3 == 1) {
                            z = false;
                            av8Var.d0(-1932150738);
                            ww9.g(q67.a(q67Var, FantasyRoundPlayerUiModel.b(fantasyRoundPlayerUiModel, null, 0, gv9Var.contains(Integer.valueOf(fantasyRoundPlayerUiModel.a)), false, false, null, null, 536870895)), z2, xpa.a(xpaVar, utcVar, 7), Integer.valueOf(meiVar.ordinal()), function12, function1, qugVar, false, null, false, false, false, false, av8Var, 48, 0, 16128);
                            av8Var.s(false);
                        } else {
                            if (i3 != 2) {
                                throw dmi.h(av8Var, -893614164, false);
                            }
                            av8Var.d0(-1931400724);
                            z = false;
                            tgj.e(q67.a(q67Var, FantasyRoundPlayerUiModel.b(fantasyRoundPlayerUiModel, null, 0, gv9Var.contains(Integer.valueOf(fantasyRoundPlayerUiModel.a)), false, false, null, null, 536870895)), z2, xpa.a(xpaVar, utcVar, 7), meiVar, function12, function1, qugVar, false, null, av8Var, 0, 1920);
                            av8Var.s(false);
                        }
                        av8Var.s(z);
                    }
                } else {
                    av8Var.W();
                }
                return Unit.a;
            default:
                Integer num = (Integer) obj9;
                r13 r13Var = (r13) obj8;
                String str = (String) obj7;
                String str2 = (String) obj6;
                wla wlaVar = (wla) obj5;
                int intValue3 = ((Integer) obj2).intValue();
                of3 of3Var2 = (of3) obj3;
                ((Integer) obj4).getClass();
                ((u5e) obj).getClass();
                rxb rxbVar = (rxb) CollectionsKt.a0(intValue3, gv9Var);
                if (rxbVar == null) {
                    return Unit.a;
                }
                l98.y(rxbVar, this.c, num, r13Var, str, str2, this.d, null, wlaVar, of3Var2, 0);
                return Unit.a;
        }
    }

    public /* synthetic */ yj7(osa osaVar, FantasyCompetitionType fantasyCompetitionType, gv9 gv9Var, mei meiVar, boolean z, Function1 function1, Function1 function12, qug qugVar) {
        this.e = osaVar;
        this.f = fantasyCompetitionType;
        this.b = gv9Var;
        this.g = meiVar;
        this.c = z;
        this.d = function1;
        this.h = function12;
        this.i = qugVar;
    }
}
