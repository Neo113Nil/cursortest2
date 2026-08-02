package defpackage;

import com.sofascore.results.event.aiInsights.EventAiInsightsFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class yr5 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ EventAiInsightsFragment t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yr5(EventAiInsightsFragment eventAiInsightsFragment, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = eventAiInsightsFragment;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        EventAiInsightsFragment eventAiInsightsFragment = this.t;
        switch (i) {
            case 0:
                yr5 yr5Var = new yr5(eventAiInsightsFragment, rq3Var, 0);
                yr5Var.s = obj;
                return yr5Var;
            default:
                yr5 yr5Var2 = new yr5(eventAiInsightsFragment, rq3Var, 1);
                yr5Var2.s = obj;
                return yr5Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eli eliVar = (eli) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((yr5) create(eliVar, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        EventAiInsightsFragment eventAiInsightsFragment = this.t;
        eli eliVar = (eli) this.s;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                if ((eliVar != null ? xr5.a[eliVar.ordinal()] : -1) == 1) {
                    eventAiInsightsFragment.E().u(eventAiInsightsFragment.D());
                }
                break;
            default:
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                if ((eliVar != null ? zr5.a[eliVar.ordinal()] : -1) == 1) {
                    eventAiInsightsFragment.E().u(eventAiInsightsFragment.D());
                }
                break;
        }
        return Unit.a;
    }
}
