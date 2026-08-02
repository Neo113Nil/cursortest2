package defpackage;

import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Incident;
import com.sofascore.model.newNetwork.EventIncidentsResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class er5 extends hoi implements Function2 {
    public int r;
    public final /* synthetic */ String s;
    public final /* synthetic */ mr5 t;
    public final /* synthetic */ Event u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public er5(String str, mr5 mr5Var, Event event, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = str;
        this.t = mr5Var;
        this.u = event;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new er5(this.s, this.t, this.u, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((er5) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        List<Incident> incidents;
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            if (!this.s.equals(Sports.FOOTBALL)) {
                return km5.a;
            }
            s96 s96Var = this.t.f;
            this.r = 1;
            obj = s96Var.n(this.u, this);
            if (obj == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        EventIncidentsResponse eventIncidentsResponse = (EventIncidentsResponse) obj;
        if (eventIncidentsResponse == null || (incidents = eventIncidentsResponse.getIncidents()) == null) {
            return km5.a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : incidents) {
            if (obj2 instanceof Incident.GoalIncident) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }
}
