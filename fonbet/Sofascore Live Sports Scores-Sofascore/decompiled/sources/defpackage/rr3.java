package defpackage;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.sofascore.model.crowdsourcing.EventSuggest;
import com.sofascore.model.crowdsourcing.EventSuggestRequest;
import com.sofascore.model.crowdsourcing.SuggestStatus;
import com.sofascore.model.mvvm.model.Event;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class rr3 extends hoi implements Function2 {
    public tr3 r;
    public e0a s;
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ tr3 v;
    public final /* synthetic */ boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rr3(tr3 tr3Var, boolean z, rq3 rq3Var) {
        super(2, rq3Var);
        this.v = tr3Var;
        this.w = z;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        rr3 rr3Var = new rr3(this.v, this.w, rq3Var);
        rr3Var.u = obj;
        return rr3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((rr3) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x00d9, code lost:
    
        if (r1.emit(defpackage.c34.a, r30) == r2) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0134 A[LOOP:1: B:18:0x012e->B:20:0x0134, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x017b A[LOOP:3: B:34:0x0175->B:36:0x017b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01b2 A[LOOP:4: B:39:0x01ac->B:41:0x01b2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0254 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0109  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object y;
        tr3 tr3Var;
        e0a e0aVar;
        Object obj2;
        Boolean bool;
        boolean z;
        Iterator it;
        Iterator it2;
        Iterator<E> it3;
        ArrayList arrayList;
        ListIterator listIterator;
        hc9 hc9Var;
        EventSuggest.IncidentSuggest copy;
        ku3 ku3Var = (ku3) this.u;
        lu3 lu3Var = lu3.a;
        int i = this.t;
        if (i == 0) {
            y6a.M(obj);
            tr3 tr3Var2 = this.v;
            Object value = tr3Var2.t.getValue();
            e0a e0aVar2 = value instanceof e0a ? (e0a) value : null;
            if (e0aVar2 != null) {
                if (this.w) {
                    Object value2 = tr3Var2.n.getValue();
                    g38 g38Var = value2 instanceof g38 ? (g38) value2 : null;
                    Iterator<E> it4 = e0aVar2.a.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it4.next();
                        if (((wyf) obj2).a instanceof EventSuggest.IncidentSuggest.GoalSuggest) {
                            break;
                        }
                    }
                    wyf wyfVar = (wyf) obj2;
                    if (wyfVar != null) {
                        EventSuggest.IncidentSuggest incidentSuggest = wyfVar.a;
                        incidentSuggest.getClass();
                        EventSuggest.IncidentSuggest.GoalSuggest goalSuggest = (EventSuggest.IncidentSuggest.GoalSuggest) incidentSuggest;
                        if (goalSuggest.getHomeScoreSuggest() == yid.m(g38Var != null ? new Integer(g38Var.a) : null)) {
                            if (goalSuggest.getAwayScoreSuggest() == yid.m(g38Var != null ? new Integer(g38Var.b) : null)) {
                                z = true;
                                bool = Boolean.valueOf(z);
                            }
                        }
                        z = false;
                        bool = Boolean.valueOf(z);
                    } else {
                        bool = null;
                    }
                    if (Intrinsics.c(bool != null ? Boolean.valueOf(!bool.booleanValue()) : null, Boolean.TRUE)) {
                        aeh aehVar = tr3Var2.g;
                        this.u = null;
                        this.r = null;
                        this.s = null;
                        this.t = 1;
                    }
                }
                aeh aehVar2 = tr3Var2.k;
                this.u = ku3Var;
                this.r = tr3Var2;
                this.s = e0aVar2;
                this.t = 2;
                y = rd0.y(aehVar2, this);
                if (y != lu3Var) {
                    tr3Var = tr3Var2;
                    e0aVar = e0aVar2;
                    int id = ((Event) y).getId();
                    gv9 gv9Var = e0aVar.a;
                    ArrayList arrayList2 = new ArrayList();
                    while (r0.hasNext()) {
                    }
                    ArrayList arrayList3 = new ArrayList(k13.r(arrayList2, 10));
                    it = arrayList2.iterator();
                    while (it.hasNext()) {
                    }
                    gv9 gv9Var2 = e0aVar.b;
                    ArrayList arrayList4 = new ArrayList();
                    while (r3.hasNext()) {
                    }
                    ArrayList arrayList5 = new ArrayList(k13.r(arrayList4, 10));
                    it2 = arrayList4.iterator();
                    while (it2.hasNext()) {
                    }
                    fdi fdiVar = tr3Var.t;
                    xbb b = a.b();
                    gv9 gv9Var3 = e0aVar.a;
                    ArrayList arrayList6 = new ArrayList(k13.r(gv9Var3, 10));
                    it3 = gv9Var3.iterator();
                    while (it3.hasNext()) {
                    }
                    b.addAll(arrayList6);
                    xbb a = a.a(b);
                    arrayList = new ArrayList(k13.r(a, 10));
                    listIterator = a.listIterator(0);
                    while (true) {
                        hc9Var = (hc9) listIterator;
                        if (hc9Var.hasNext()) {
                        }
                        arrayList.add(copy);
                    }
                }
                return lu3Var;
            }
        } else {
            if (i == 1) {
                y6a.M(obj);
                return Unit.a;
            }
            if (i != 2) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            e0aVar = this.s;
            tr3 tr3Var3 = this.r;
            y6a.M(obj);
            tr3Var = tr3Var3;
            y = obj;
            int id2 = ((Event) y).getId();
            gv9 gv9Var4 = e0aVar.a;
            ArrayList arrayList22 = new ArrayList();
            for (Object obj3 : gv9Var4) {
                EventSuggest.IncidentSuggest incidentSuggest2 = ((wyf) obj3).a;
                incidentSuggest2.getClass();
                if (incidentSuggest2.getId() < 0) {
                    arrayList22.add(obj3);
                }
            }
            ArrayList arrayList32 = new ArrayList(k13.r(arrayList22, 10));
            it = arrayList22.iterator();
            while (it.hasNext()) {
                arrayList32.add(t34.a(((wyf) it.next()).a));
            }
            gv9 gv9Var22 = e0aVar.b;
            ArrayList arrayList42 = new ArrayList();
            for (Object obj4 : gv9Var22) {
                if (((EventSuggest.IncidentSuggest) obj4).getStatus() == SuggestStatus.PENDING) {
                    arrayList42.add(obj4);
                }
            }
            ArrayList arrayList52 = new ArrayList(k13.r(arrayList42, 10));
            it2 = arrayList42.iterator();
            while (it2.hasNext()) {
                EventSuggest.IncidentSuggest incidentSuggest3 = (EventSuggest.IncidentSuggest) it2.next();
                arrayList52.add(new Pair(new Integer(incidentSuggest3.getId()), t34.a(incidentSuggest3)));
            }
            fdi fdiVar2 = tr3Var.t;
            xbb b2 = a.b();
            gv9 gv9Var32 = e0aVar.a;
            ArrayList arrayList62 = new ArrayList(k13.r(gv9Var32, 10));
            it3 = gv9Var32.iterator();
            while (it3.hasNext()) {
                arrayList62.add(((wyf) it3.next()).a);
            }
            b2.addAll(arrayList62);
            xbb a2 = a.a(b2);
            arrayList = new ArrayList(k13.r(a2, 10));
            listIterator = a2.listIterator(0);
            while (true) {
                hc9Var = (hc9) listIterator;
                if (hc9Var.hasNext()) {
                    f0a f0aVar = new f0a(l6g.W(arrayList));
                    fdiVar2.getClass();
                    fdiVar2.m(null, f0aVar);
                    if (!arrayList32.isEmpty()) {
                        xw3.L(ku3Var, null, null, new ok0(tr3Var, id2, arrayList32, (rq3) null, 2), 3);
                    }
                    if (!arrayList52.isEmpty()) {
                        Iterator it5 = arrayList52.iterator();
                        while (it5.hasNext()) {
                            Pair pair = (Pair) it5.next();
                            xw3.L(ku3Var, null, null, new ok0(tr3Var, ((Number) pair.a).intValue(), (EventSuggestRequest) pair.b, (rq3) null, 3), 3);
                        }
                    }
                } else {
                    EventSuggest.IncidentSuggest incidentSuggest4 = (EventSuggest.IncidentSuggest) hc9Var.next();
                    if (incidentSuggest4 instanceof EventSuggest.IncidentSuggest.CardSuggest) {
                        EventSuggest.IncidentSuggest.CardSuggest cardSuggest = (EventSuggest.IncidentSuggest.CardSuggest) incidentSuggest4;
                        copy = EventSuggest.IncidentSuggest.CardSuggest.copy$default(cardSuggest, 0, cardSuggest.getStatus() == SuggestStatus.APPROVED ? cardSuggest.getStatus() : SuggestStatus.SUBMITTED, false, null, null, null, null, null, null, null, IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT, null);
                    } else {
                        if (!(incidentSuggest4 instanceof EventSuggest.IncidentSuggest.GoalSuggest)) {
                            zzl.b();
                            return null;
                        }
                        EventSuggest.IncidentSuggest.GoalSuggest goalSuggest2 = (EventSuggest.IncidentSuggest.GoalSuggest) incidentSuggest4;
                        copy = goalSuggest2.copy((r29 & 1) != 0 ? goalSuggest2.id : 0, (r29 & 2) != 0 ? goalSuggest2.status : goalSuggest2.getStatus() == SuggestStatus.APPROVED ? goalSuggest2.getStatus() : SuggestStatus.SUBMITTED, (r29 & 4) != 0 ? goalSuggest2.validated : false, (r29 & 8) != 0 ? goalSuggest2.homeScoreSuggest : 0, (r29 & 16) != 0 ? goalSuggest2.awayScoreSuggest : 0, (r29 & 32) != 0 ? goalSuggest2.player : null, (r29 & 64) != 0 ? goalSuggest2.assist : null, (r29 & 128) != 0 ? goalSuggest2.playerName : null, (r29 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? goalSuggest2.assistName : null, (r29 & 512) != 0 ? goalSuggest2.type : null, (r29 & 1024) != 0 ? goalSuggest2.side : null, (r29 & com.ironsource.mediationsdk.metadata.a.o) != 0 ? goalSuggest2.time : null, (r29 & 4096) != 0 ? goalSuggest2.addedTime : null, (r29 & 8192) != 0 ? goalSuggest2.applied : null);
                    }
                    arrayList.add(copy);
                }
            }
        }
        return Unit.a;
    }
}
