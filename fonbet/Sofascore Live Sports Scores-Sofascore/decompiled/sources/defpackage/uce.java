package defpackage;

import com.sofascore.results.event.dialog.PenaltyHistoryBottomSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KFunction;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class uce implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PenaltyHistoryBottomSheet b;

    public /* synthetic */ uce(PenaltyHistoryBottomSheet penaltyHistoryBottomSheet, int i) {
        this.a = i;
        this.b = penaltyHistoryBottomSheet;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        PenaltyHistoryBottomSheet penaltyHistoryBottomSheet = this.b;
        int i2 = 1;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    haa.f(yqo.H(1599967777, av8Var, new uce(penaltyHistoryBottomSheet, i2)), av8Var, 6);
                } else {
                    av8Var.W();
                }
                break;
            default:
                otk otkVar = penaltyHistoryBottomSheet.B;
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    xce xceVar = (xce) rfo.x(((ade) otkVar.getValue()).k, av8Var2, 0).getValue();
                    ade adeVar = (ade) otkVar.getValue();
                    boolean i3 = av8Var2.i(adeVar);
                    Object O = av8Var2.O();
                    if (i3 || O == nf3.a) {
                        fl8 fl8Var = new fl8(0, adeVar, ade.class, "hideInfoRow", "hideInfoRow()V", 0, 12);
                        av8Var2.n0(fl8Var);
                        O = fl8Var;
                    }
                    pea.i(xceVar, (Function0) ((KFunction) O), av8Var2, 0);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
