package defpackage;

import com.sofascore.model.crowdsourcing.EventSuggest;
import com.sofascore.results.crowdsourcing.CrowdsourcingIncidentDetailsFullScreenDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class a44 extends hoi implements Function2 {
    public /* synthetic */ Object r;
    public final /* synthetic */ CrowdsourcingIncidentDetailsFullScreenDialog s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a44(CrowdsourcingIncidentDetailsFullScreenDialog crowdsourcingIncidentDetailsFullScreenDialog, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = crowdsourcingIncidentDetailsFullScreenDialog;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        a44 a44Var = new a44(this.s, rq3Var);
        a44Var.r = obj;
        return a44Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a44) create((EventSuggest.IncidentSuggest) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        EventSuggest.IncidentSuggest incidentSuggest = (EventSuggest.IncidentSuggest) this.r;
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        CrowdsourcingIncidentDetailsFullScreenDialog crowdsourcingIncidentDetailsFullScreenDialog = this.s;
        tr3 tr3Var = (tr3) crowdsourcingIncidentDetailsFullScreenDialog.A.getValue();
        incidentSuggest.getClass();
        xw3.L(un0.z(tr3Var), null, null, new jr3(tr3Var, incidentSuggest, null), 3);
        crowdsourcingIncidentDetailsFullScreenDialog.k(false, false);
        return Unit.a;
    }
}
