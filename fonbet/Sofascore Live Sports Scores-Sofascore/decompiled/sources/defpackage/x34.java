package defpackage;

import com.sofascore.results.crowdsourcing.CrowdsourcingIncidentDetailsFullScreenDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KFunction;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class x34 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CrowdsourcingIncidentDetailsFullScreenDialog b;

    public /* synthetic */ x34(CrowdsourcingIncidentDetailsFullScreenDialog crowdsourcingIncidentDetailsFullScreenDialog, int i) {
        this.a = i;
        this.b = crowdsourcingIncidentDetailsFullScreenDialog;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = 1;
        switch (this.a) {
            case 0:
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    haa.f(yqo.H(1162723962, av8Var, new x34(this.b, i)), av8Var, 6);
                } else {
                    av8Var.W();
                }
                break;
            default:
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    CrowdsourcingIncidentDetailsFullScreenDialog crowdsourcingIncidentDetailsFullScreenDialog = this.b;
                    e1d v = rfo.v(crowdsourcingIncidentDetailsFullScreenDialog.v().B, null, av8Var2, 48);
                    e1d v2 = rfo.v(crowdsourcingIncidentDetailsFullScreenDialog.v().A, null, av8Var2, 48);
                    n44 n44Var = (n44) v.getValue();
                    r54 r54Var = (r54) v2.getValue();
                    if (n44Var != null && r54Var != null) {
                        q54 v3 = crowdsourcingIncidentDetailsFullScreenDialog.v();
                        boolean i2 = av8Var2.i(v3);
                        Object O = av8Var2.O();
                        a99 a99Var = nf3.a;
                        if (i2 || O == a99Var) {
                            k43 k43Var = new k43(1, v3, q54.class, "onTeamSelected", "onTeamSelected(Lcom/sofascore/model/crowdsourcing/TeamSide;)V", 0, 8);
                            av8Var2.n0(k43Var);
                            O = k43Var;
                        }
                        KFunction kFunction = (KFunction) O;
                        q54 v4 = crowdsourcingIncidentDetailsFullScreenDialog.v();
                        boolean i3 = av8Var2.i(v4);
                        Object O2 = av8Var2.O();
                        if (i3 || O2 == a99Var) {
                            k43 k43Var2 = new k43(1, v4, q54.class, "onIncidentTypeSelected", "onIncidentTypeSelected(Lcom/sofascore/model/crowdsourcing/CrowdsourcingIncidentType;)V", 0, 10);
                            av8Var2.n0(k43Var2);
                            O2 = k43Var2;
                        }
                        KFunction kFunction2 = (KFunction) O2;
                        q54 v5 = crowdsourcingIncidentDetailsFullScreenDialog.v();
                        boolean i4 = av8Var2.i(v5);
                        Object O3 = av8Var2.O();
                        if (i4 || O3 == a99Var) {
                            k43 k43Var3 = new k43(1, v5, q54.class, "onTimeToggle", "onTimeToggle(Z)V", 0, 11);
                            av8Var2.n0(k43Var3);
                            O3 = k43Var3;
                        }
                        KFunction kFunction3 = (KFunction) O3;
                        q54 v6 = crowdsourcingIncidentDetailsFullScreenDialog.v();
                        boolean i5 = av8Var2.i(v6);
                        Object O4 = av8Var2.O();
                        if (i5 || O4 == a99Var) {
                            k43 k43Var4 = new k43(1, v6, q54.class, "onTimeChanged", "onTimeChanged(Ljava/lang/String;)V", 0, 12);
                            av8Var2.n0(k43Var4);
                            O4 = k43Var4;
                        }
                        KFunction kFunction4 = (KFunction) O4;
                        q54 v7 = crowdsourcingIncidentDetailsFullScreenDialog.v();
                        boolean i6 = av8Var2.i(v7);
                        Object O5 = av8Var2.O();
                        if (i6 || O5 == a99Var) {
                            O5 = new y34(0, v7, q54.class, "onPlayerSearchClick", "onPlayerSearchClick()Lkotlinx/coroutines/Job;", 8, 0);
                            av8Var2.n0(O5);
                        }
                        Function0 function0 = (Function0) O5;
                        q54 v8 = crowdsourcingIncidentDetailsFullScreenDialog.v();
                        boolean i7 = av8Var2.i(v8);
                        Object O6 = av8Var2.O();
                        if (i7 || O6 == a99Var) {
                            O6 = new ny(0, v8, q54.class, "onAssistSearchClick", "onAssistSearchClick()V", 0, 10);
                            av8Var2.n0(O6);
                        }
                        KFunction kFunction5 = (KFunction) O6;
                        q54 v9 = crowdsourcingIncidentDetailsFullScreenDialog.v();
                        boolean i8 = av8Var2.i(v9);
                        Object O7 = av8Var2.O();
                        if (i8 || O7 == a99Var) {
                            O7 = new ny(0, v9, q54.class, "onCancelSearch", "onCancelSearch()V", 0, 11);
                            av8Var2.n0(O7);
                        }
                        KFunction kFunction6 = (KFunction) O7;
                        q54 v10 = crowdsourcingIncidentDetailsFullScreenDialog.v();
                        boolean i9 = av8Var2.i(v10);
                        Object O8 = av8Var2.O();
                        if (i9 || O8 == a99Var) {
                            O8 = new p1(2, v10, q54.class, "onPlayerSelected", "onPlayerSelected(Lcom/sofascore/results/crowdsourcing/model/CrowdsourcingPlayerEntity;I)V", 0, 3);
                            av8Var2.n0(O8);
                        }
                        KFunction kFunction7 = (KFunction) O8;
                        q54 v11 = crowdsourcingIncidentDetailsFullScreenDialog.v();
                        boolean i10 = av8Var2.i(v11);
                        Object O9 = av8Var2.O();
                        if (i10 || O9 == a99Var) {
                            O9 = new k43(1, v11, q54.class, "onPlayerDeselected", "onPlayerDeselected(Lcom/sofascore/results/crowdsourcing/model/CrowdsourcingPlayerEntity;)V", 0, 13);
                            av8Var2.n0(O9);
                        }
                        KFunction kFunction8 = (KFunction) O9;
                        boolean i11 = av8Var2.i(crowdsourcingIncidentDetailsFullScreenDialog);
                        Object O10 = av8Var2.O();
                        if (i11 || O10 == a99Var) {
                            ny nyVar = new ny(0, crowdsourcingIncidentDetailsFullScreenDialog, CrowdsourcingIncidentDetailsFullScreenDialog.class, "dismiss", "dismiss()V", 0, 6);
                            av8Var2.n0(nyVar);
                            O10 = nyVar;
                        }
                        KFunction kFunction9 = (KFunction) O10;
                        q54 v12 = crowdsourcingIncidentDetailsFullScreenDialog.v();
                        boolean i12 = av8Var2.i(v12);
                        Object O11 = av8Var2.O();
                        if (i12 || O11 == a99Var) {
                            O11 = new ny(0, v12, q54.class, "submit", "submit()V", 0, 7);
                            av8Var2.n0(O11);
                        }
                        KFunction kFunction10 = (KFunction) O11;
                        boolean i13 = av8Var2.i(crowdsourcingIncidentDetailsFullScreenDialog);
                        Object O12 = av8Var2.O();
                        if (i13 || O12 == a99Var) {
                            ny nyVar2 = new ny(0, crowdsourcingIncidentDetailsFullScreenDialog, CrowdsourcingIncidentDetailsFullScreenDialog.class, "dismiss", "dismiss()V", 0, 8);
                            av8Var2.n0(nyVar2);
                            O12 = nyVar2;
                        }
                        KFunction kFunction11 = (KFunction) O12;
                        q54 v13 = crowdsourcingIncidentDetailsFullScreenDialog.v();
                        boolean i14 = av8Var2.i(v13);
                        Object O13 = av8Var2.O();
                        if (i14 || O13 == a99Var) {
                            O13 = new k43(1, v13, q54.class, "onSubmitPlayerName", "onSubmitPlayerName(Lcom/sofascore/results/crowdsourcing/model/CrowdsourcingPlayerEntity;)V", 0, 9);
                            av8Var2.n0(O13);
                        }
                        KFunction kFunction12 = (KFunction) O13;
                        boolean i15 = av8Var2.i(crowdsourcingIncidentDetailsFullScreenDialog);
                        Object O14 = av8Var2.O();
                        if (i15 || O14 == a99Var) {
                            O14 = new h63(crowdsourcingIncidentDetailsFullScreenDialog, 9);
                            av8Var2.n0(O14);
                        }
                        k44.b(n44Var, r54Var, (Function0) O14, (Function1) kFunction, (Function1) kFunction2, (Function1) kFunction3, (Function1) kFunction4, (Function2) kFunction7, (Function1) kFunction8, function0, (Function0) kFunction5, (Function0) kFunction6, (Function0) kFunction9, (Function0) kFunction10, (Function0) kFunction11, (Function1) kFunction12, av8Var2, 0);
                    }
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
