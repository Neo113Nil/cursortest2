package defpackage;

import com.sofascore.model.mvvm.model.CricketEvent;
import com.sofascore.model.mvvm.model.Incident;
import com.sofascore.model.newNetwork.EventIncidentsResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class v06 extends hoi implements Function2 {
    public int r;
    public final /* synthetic */ w06 s;
    public final /* synthetic */ CricketEvent t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v06(w06 w06Var, CricketEvent cricketEvent, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = w06Var;
        this.t = cricketEvent;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new v06(this.s, this.t, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v06) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        w06 w06Var = this.s;
        if (i == 0) {
            y6a.M(obj);
            s96 s96Var = w06Var.e;
            this.r = 1;
            obj = s96Var.n(this.t, this);
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
        List<Incident> incidents = eventIncidentsResponse != null ? eventIncidentsResponse.getIncidents() : null;
        if (incidents != null) {
            List<Incident> list = incidents.isEmpty() ? null : incidents;
            if (list != null) {
                yzc yzcVar = w06Var.f;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (obj2 instanceof Incident.CricketIncident) {
                        arrayList.add(obj2);
                    }
                }
                yzcVar.j(arrayList);
            }
        }
        return Unit.a;
    }
}
