package defpackage;

import com.sofascore.results.event.aiInsights.ui.EventAiInsightsResultProbabilityModal;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class fs5 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ EventAiInsightsResultProbabilityModal b;

    public /* synthetic */ fs5(EventAiInsightsResultProbabilityModal eventAiInsightsResultProbabilityModal, int i) {
        this.a = i;
        this.b = eventAiInsightsResultProbabilityModal;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        EventAiInsightsResultProbabilityModal eventAiInsightsResultProbabilityModal = this.b;
        int i2 = 1;
        of3 of3Var = (of3) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    haa.f(yqo.H(1533859502, av8Var, new fs5(eventAiInsightsResultProbabilityModal, i2)), av8Var, 6);
                } else {
                    av8Var.W();
                }
                break;
            default:
                av8 av8Var2 = (av8) of3Var;
                if (av8Var2.T(intValue & 1, (intValue & 3) != 2)) {
                    String string = eventAiInsightsResultProbabilityModal.requireArguments().getString("FIRST_TEAM_NAME");
                    String str = string == null ? "" : string;
                    String string2 = eventAiInsightsResultProbabilityModal.requireArguments().getString("SECOND_TEAM_NAME");
                    String str2 = string2 == null ? "" : string2;
                    boolean i3 = av8Var2.i(eventAiInsightsResultProbabilityModal);
                    Object O = av8Var2.O();
                    if (i3 || O == nf3.a) {
                        O = new h63(eventAiInsightsResultProbabilityModal, 24);
                        av8Var2.n0(O);
                    }
                    qx9.f(str, str2, (Function0) O, null, av8Var2, 0);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
