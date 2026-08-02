package defpackage;

import com.sofascore.model.crowdsourcing.EventSuggest;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.network.response.VotesResponse;
import com.sofascore.model.newNetwork.EventChildEventsResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class qy5 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public Object t;
    public final /* synthetic */ Event u;
    public final /* synthetic */ dz5 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qy5(rq3 rq3Var, dz5 dz5Var, Event event) {
        super(2, rq3Var);
        this.r = 1;
        this.u = event;
        this.v = dz5Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Event event = this.u;
        dz5 dz5Var = this.v;
        switch (i) {
            case 0:
                qy5 qy5Var = new qy5(dz5Var, event, rq3Var, 0);
                qy5Var.t = obj;
                return qy5Var;
            case 1:
                qy5 qy5Var2 = new qy5(rq3Var, dz5Var, event);
                qy5Var2.t = obj;
                return qy5Var2;
            default:
                return new qy5(dz5Var, event, rq3Var, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((qy5) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        if (r0 == r10) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e9, code lost:
    
        if (r0 == r10) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x009f, code lost:
    
        if (r7 == r10) goto L40;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object w;
        Object P;
        List<Integer> childEvents;
        Object u;
        Object P2;
        int i = this.r;
        int i2 = 0;
        Event event = this.u;
        dz5 dz5Var = this.v;
        rq3 rq3Var = null;
        switch (i) {
            case 0:
                ku3 ku3Var = (ku3) this.t;
                lu3 lu3Var = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    av4 t = xw3.t(ku3Var, null, new py5(dz5Var, event, rq3Var, i2), 3);
                    this.t = null;
                    this.s = 1;
                    w = t.w(this);
                    if (w == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    w = obj;
                }
                return new hy5((EventSuggest) w);
            case 1:
                ku3 ku3Var2 = (ku3) this.t;
                lu3 lu3Var2 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    if (!ok3.G(event)) {
                        return km5.a;
                    }
                    s96 s96Var = dz5Var.i;
                    int id = event.getId();
                    this.t = ku3Var2;
                    this.s = 1;
                    s96Var.getClass();
                    P = yaa.P(new a86(s96Var, id, null, 1), this);
                    break;
                } else {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        u = obj;
                        List list = (List) u;
                        if (list != null) {
                            return CollectionsKt.W(list);
                        }
                        return km5.a;
                    }
                    y6a.M(obj);
                    P = obj;
                }
                EventChildEventsResponse eventChildEventsResponse = (EventChildEventsResponse) yaa.x((x2g) P);
                if (eventChildEventsResponse != null && (childEvents = eventChildEventsResponse.getChildEvents()) != null) {
                    event.setChildEvents(childEvents);
                    ArrayList arrayList = new ArrayList(k13.r(childEvents, 10));
                    Iterator<T> it = childEvents.iterator();
                    while (it.hasNext()) {
                        arrayList.add(xw3.t(ku3Var2, null, new vy5(dz5Var, ((Number) it.next()).intValue(), null, 0), 3));
                    }
                    this.t = null;
                    this.s = 2;
                    u = m6k.u(arrayList, this);
                    break;
                }
                return km5.a;
            default:
                lu3 lu3Var3 = lu3.a;
                int i5 = this.s;
                Event event2 = this.u;
                dz5 dz5Var2 = this.v;
                if (i5 == 0) {
                    y6a.M(obj);
                    s96 s96Var2 = dz5Var2.i;
                    int id2 = event2.getId();
                    this.s = 1;
                    s96Var2.getClass();
                    P2 = yaa.P(new a86(s96Var2, id2, null, 9), this);
                    break;
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Object obj2 = this.t;
                        y6a.M(obj);
                        return obj2;
                    }
                    y6a.M(obj);
                    P2 = obj;
                }
                Object x = yaa.x((x2g) P2);
                this.t = x;
                this.s = 2;
                if (dz5Var2.l(event2, false, null, (VotesResponse) x, this) != lu3Var3) {
                    return x;
                }
                return lu3Var3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qy5(dz5 dz5Var, Event event, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.v = dz5Var;
        this.u = event;
    }
}
