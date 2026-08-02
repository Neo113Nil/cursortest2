package defpackage;

import com.sofascore.model.crowdsourcing.EventSuggest;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class mw5 extends ot8 implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        EventSuggest.IncidentSuggest incidentSuggest = (EventSuggest.IncidentSuggest) obj;
        incidentSuggest.getClass();
        tr3 tr3Var = (tr3) this.receiver;
        tr3Var.getClass();
        if (incidentSuggest instanceof EventSuggest.IncidentSuggest.CardSuggest) {
            xw3.L(un0.z(tr3Var), null, null, new fr3(tr3Var, (EventSuggest.IncidentSuggest.CardSuggest) incidentSuggest, null), 3);
        } else {
            if (!(incidentSuggest instanceof EventSuggest.IncidentSuggest.GoalSuggest)) {
                zzl.b();
                return null;
            }
            xw3.L(un0.z(tr3Var), null, null, new gr3((EventSuggest.IncidentSuggest.GoalSuggest) incidentSuggest, tr3Var, null), 3);
        }
        return Unit.a;
    }
}
