package defpackage;

import com.sofascore.results.event.details.EventDetailsFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class wx5 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public /* synthetic */ boolean s;
    public final /* synthetic */ EventDetailsFragment t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wx5(EventDetailsFragment eventDetailsFragment, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = eventDetailsFragment;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        EventDetailsFragment eventDetailsFragment = this.t;
        switch (i) {
            case 0:
                wx5 wx5Var = new wx5(eventDetailsFragment, rq3Var, 0);
                wx5Var.s = ((Boolean) obj).booleanValue();
                return wx5Var;
            default:
                wx5 wx5Var2 = new wx5(eventDetailsFragment, rq3Var, 1);
                wx5Var2.s = ((Boolean) obj).booleanValue();
                return wx5Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.r;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        rq3 rq3Var = (rq3) obj2;
        switch (i) {
        }
        return ((wx5) create(bool, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        EventDetailsFragment eventDetailsFragment = this.t;
        boolean z = this.s;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                e91 e91Var = (e91) eventDetailsFragment.I.getValue();
                if (e91Var != null) {
                    e91Var.setVisibility(z ? 0 : 8);
                }
                break;
            default:
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                lmj lmjVar = (lmj) eventDetailsFragment.r0.getValue();
                if (lmjVar != null) {
                    lmjVar.setShowVotingBubble(z);
                }
                break;
        }
        return Unit.a;
    }
}
