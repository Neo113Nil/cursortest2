package defpackage;

import com.sofascore.model.crowdsourcing.EventSuggest;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class er3 extends hoi implements Function2 {
    public int r;
    public final /* synthetic */ tr3 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public er3(tr3 tr3Var, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = tr3Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new er3(this.s, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((er3) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        EventSuggest.IncidentSuggest.GoalSuggest goalSuggest;
        Object value;
        gv9 a;
        Object obj2;
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            tr3 tr3Var = this.s;
            g0a g0aVar = (g0a) tr3Var.t.getValue();
            if (g0aVar == null || (a = g0aVar.a()) == null) {
                goalSuggest = null;
            } else {
                Iterator<E> it = a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (obj2 instanceof EventSuggest.IncidentSuggest.GoalSuggest) {
                        break;
                    }
                }
                if (!(obj2 instanceof EventSuggest.IncidentSuggest.GoalSuggest)) {
                    obj2 = null;
                }
                goalSuggest = (EventSuggest.IncidentSuggest.GoalSuggest) obj2;
            }
            fdi fdiVar = tr3Var.v;
            do {
                value = fdiVar.getValue();
            } while (!fdiVar.k(value, new v34(yid.m(goalSuggest != null ? new Integer(goalSuggest.getHomeScoreSuggest()) : null), yid.m(goalSuggest != null ? new Integer(goalSuggest.getAwayScoreSuggest()) : null), new s54(goalSuggest != null ? goalSuggest.getTime() : null, goalSuggest != null ? goalSuggest.getAddedTime() : null), null, null, null, false, false)));
            aeh aehVar = tr3Var.g;
            this.r = 1;
            if (aehVar.emit(e34.a, this) == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        return Unit.a;
    }
}
