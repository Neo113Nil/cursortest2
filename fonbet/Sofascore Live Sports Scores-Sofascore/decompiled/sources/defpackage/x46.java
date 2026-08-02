package defpackage;

import com.sofascore.model.mvvm.model.CricketEvent;
import com.sofascore.model.mvvm.model.Incident;
import com.sofascore.model.mvvm.model.IncidentKt;
import com.sofascore.model.newNetwork.EventIncidentsResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class x46 extends hoi implements Function2 {
    public int r;
    public final /* synthetic */ y46 s;
    public final /* synthetic */ CricketEvent t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x46(y46 y46Var, CricketEvent cricketEvent, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = y46Var;
        this.t = cricketEvent;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new x46(this.s, this.t, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((x46) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x017c, code lost:
    
        if (r4.j(r17) == r1) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x017e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x002f, code lost:
    
        if (r2 == r1) goto L98;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object n;
        Integer num;
        Integer num2;
        int intValue;
        Integer over;
        Integer superOver;
        lu3 lu3Var = lu3.a;
        int i = this.r;
        y46 y46Var = this.s;
        if (i == 0) {
            y6a.M(obj);
            s96 s96Var = y46Var.e;
            this.r = 1;
            n = s96Var.n(this.t, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    y6a.M(obj);
                    return Unit.a;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
            n = obj;
        }
        EventIncidentsResponse eventIncidentsResponse = (EventIncidentsResponse) n;
        List<Incident> incidents = eventIncidentsResponse != null ? eventIncidentsResponse.getIncidents() : null;
        if (incidents != null) {
            if (incidents.isEmpty()) {
                incidents = null;
            }
            if (incidents != null) {
                yzc yzcVar = y46Var.f;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : incidents) {
                    if (obj2 instanceof Incident.CricketIncident) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                List<Incident.CricketIncident> B0 = CollectionsKt.B0(arrayList);
                Iterator it = B0.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        num = null;
                        break;
                    }
                    num = ((Incident.CricketIncident) it.next()).getOver();
                    if (num != null) {
                        break;
                    }
                }
                if (num == null) {
                    ogj.m("No element of the collection was transformed to a non-null value.");
                    return null;
                }
                int intValue2 = num.intValue();
                Iterator it2 = B0.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        num2 = null;
                        break;
                    }
                    num2 = ((Incident.CricketIncident) it2.next()).getInningNumber();
                    if (num2 != null) {
                        break;
                    }
                }
                if (num2 == null) {
                    ogj.m("No element of the collection was transformed to a non-null value.");
                    return null;
                }
                int intValue3 = num2.intValue();
                boolean z = ((Incident.CricketIncident) CollectionsKt.Y(B0)).getSuperOver() != null;
                for (Incident.CricketIncident cricketIncident : B0) {
                    Integer inningNumber = cricketIncident.getInningNumber();
                    if (inningNumber != null && inningNumber.intValue() == intValue3 && (Intrinsics.c(cricketIncident.getIncidentType(), IncidentKt.TYPE_UDRS) || ((z && (superOver = cricketIncident.getSuperOver()) != null && superOver.intValue() == intValue2) || !(z || (over = cricketIncident.getOver()) == null || over.intValue() != intValue2)))) {
                        arrayList3.add(cricketIncident);
                    } else {
                        arrayList2.add(new q04(z, intValue3, intValue2, CollectionsKt.S0(arrayList3)));
                        arrayList3 = b.l(cricketIncident);
                        Integer inningNumber2 = cricketIncident.getInningNumber();
                        if (inningNumber2 != null) {
                            intValue3 = inningNumber2.intValue();
                        }
                        Integer superOver2 = cricketIncident.getSuperOver();
                        if (superOver2 != null) {
                            intValue = superOver2.intValue();
                        } else {
                            Integer over2 = cricketIncident.getOver();
                            intValue = over2 != null ? over2.intValue() : intValue2 + 1;
                        }
                        intValue2 = intValue;
                        z = cricketIncident.getSuperOver() != null;
                    }
                }
                if (!arrayList3.isEmpty()) {
                    arrayList2.add(new q04(z, intValue3, intValue2, CollectionsKt.S0(arrayList3)));
                }
                yzcVar.j(CollectionsKt.B0(arrayList2));
            }
        }
        this.r = 2;
    }
}
