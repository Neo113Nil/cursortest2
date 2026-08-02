package defpackage;

import com.sofascore.model.crowdsourcing.EventSuggest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class jr3 extends hoi implements Function2 {
    public int r;
    public final /* synthetic */ tr3 s;
    public final /* synthetic */ EventSuggest.IncidentSuggest t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jr3(tr3 tr3Var, EventSuggest.IncidentSuggest incidentSuggest, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = tr3Var;
        this.t = incidentSuggest;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new jr3(this.s, this.t, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((jr3) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x02ed, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.c(r12.getAddedTime(), r9.getAddedTime()) != false) goto L126;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v15, types: [java.lang.Iterable, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Iterable, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v9, types: [xbb] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Collection<EventSuggest.IncidentSuggest> collection;
        ?? a;
        Object value;
        g0a g0aVar;
        Object obj2;
        int i;
        ?? arrayList;
        wyf a2;
        int i2;
        wyf a3;
        tr3 tr3Var = this.s;
        fdi fdiVar = tr3Var.t;
        lu3 lu3Var = lu3.a;
        int i3 = this.r;
        boolean z = true;
        if (i3 == 0) {
            y6a.M(obj);
            w34 w34Var = (w34) tr3Var.v.getValue();
            boolean c = Intrinsics.c(w34Var != null ? Boolean.valueOf(w34Var.a) : null, Boolean.TRUE);
            EventSuggest.IncidentSuggest incidentSuggest = this.t;
            if (c) {
                while (true) {
                    Object value2 = fdiVar.getValue();
                    if (value2 instanceof e0a) {
                        e0a e0aVar = (e0a) value2;
                        gv9 gv9Var = e0aVar.a;
                        if (incidentSuggest instanceof EventSuggest.IncidentSuggest.CardSuggest) {
                            EventSuggest.IncidentSuggest.CardSuggest cardSuggest = (EventSuggest.IncidentSuggest.CardSuggest) incidentSuggest;
                            Iterator it = gv9Var.iterator();
                            int i4 = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    i2 = -1;
                                    break;
                                }
                                if (((wyf) it.next()).a.getId() == cardSuggest.getId()) {
                                    i2 = i4;
                                    break;
                                }
                                i4++;
                            }
                            if (i2 != -1) {
                                wyf wyfVar = (wyf) gv9Var.get(i2);
                                boolean z2 = (Intrinsics.c(wyfVar.a.getTime(), cardSuggest.getTime()) && Intrinsics.c(wyfVar.a.getAddedTime(), cardSuggest.getAddedTime())) ? false : z;
                                arrayList = new ArrayList(gv9Var);
                                arrayList.set(i2, new wyf(cardSuggest, z, null));
                                if (z2) {
                                    arrayList = CollectionsKt.H0(arrayList, new y73(6));
                                }
                            } else {
                                xbb b = a.b();
                                b.add(new wyf(cardSuggest, z, null));
                                b.addAll(gv9Var);
                                List<wyf> H0 = CollectionsKt.H0(a.a(b), new y73(6));
                                ArrayList arrayList2 = new ArrayList(k13.r(H0, 10));
                                Iterator it2 = H0.iterator();
                                while (it2.hasNext()) {
                                    arrayList2.add(((wyf) it2.next()).a);
                                }
                                Integer M = z8e.M(arrayList2, new q73(8));
                                arrayList = new ArrayList(k13.r(H0, 10));
                                for (wyf wyfVar2 : H0) {
                                    EventSuggest.IncidentSuggest incidentSuggest2 = wyfVar2.a;
                                    if (incidentSuggest2 instanceof EventSuggest.IncidentSuggest.CardSuggest) {
                                        a3 = wyf.a(wyfVar2, null, z8e.M(arrayList2, new ox1((EventSuggest.IncidentSuggest.CardSuggest) incidentSuggest2, 26)), 3);
                                    } else {
                                        if (!(incidentSuggest2 instanceof EventSuggest.IncidentSuggest.GoalSuggest)) {
                                            zzl.b();
                                            return null;
                                        }
                                        a3 = wyf.a(wyfVar2, null, M, 3);
                                    }
                                    arrayList.add(a3);
                                }
                            }
                        } else {
                            if (!(incidentSuggest instanceof EventSuggest.IncidentSuggest.GoalSuggest)) {
                                zzl.b();
                                return null;
                            }
                            EventSuggest.IncidentSuggest.GoalSuggest goalSuggest = (EventSuggest.IncidentSuggest.GoalSuggest) incidentSuggest;
                            Iterator it3 = gv9Var.iterator();
                            int i5 = 0;
                            while (true) {
                                if (!it3.hasNext()) {
                                    i = -1;
                                    break;
                                }
                                if (((wyf) it3.next()).a.getId() == goalSuggest.getId()) {
                                    i = i5;
                                    break;
                                }
                                i5++;
                            }
                            wyf wyfVar3 = (wyf) gv9Var.get(i);
                            arrayList = new ArrayList(gv9Var);
                            ArrayList arrayList3 = new ArrayList(k13.r(arrayList, 10));
                            Iterator it4 = arrayList.iterator();
                            while (it4.hasNext()) {
                                arrayList3.add(((wyf) it4.next()).a);
                            }
                            Integer M2 = z8e.M(arrayList3, new q73(8));
                            EventSuggest.IncidentSuggest incidentSuggest3 = wyfVar3.a;
                            incidentSuggest3.getClass();
                            arrayList.set(i, new wyf(goalSuggest, incidentSuggest3.getId() < 0, M2));
                            if (!Intrinsics.c(incidentSuggest3.getTime(), goalSuggest.getTime()) || !Intrinsics.c(incidentSuggest3.getAddedTime(), goalSuggest.getAddedTime()) || incidentSuggest3.getSide() != goalSuggest.getSide()) {
                                gv9<wyf> y = tr3.y(CollectionsKt.U0(CollectionsKt.H0(arrayList, new y73(6))));
                                ArrayList arrayList4 = new ArrayList(k13.r(y, 10));
                                for (wyf wyfVar4 : y) {
                                    EventSuggest.IncidentSuggest incidentSuggest4 = wyfVar4.a;
                                    if (incidentSuggest4 instanceof EventSuggest.IncidentSuggest.CardSuggest) {
                                        ArrayList arrayList5 = new ArrayList(k13.r(y, 10));
                                        Iterator it5 = y.iterator();
                                        while (it5.hasNext()) {
                                            arrayList5.add(((wyf) it5.next()).a);
                                        }
                                        a2 = wyf.a(wyfVar4, null, z8e.M(arrayList5, new ox1((EventSuggest.IncidentSuggest.CardSuggest) incidentSuggest4, 26)), 3);
                                    } else {
                                        if (!(incidentSuggest4 instanceof EventSuggest.IncidentSuggest.GoalSuggest)) {
                                            zzl.b();
                                            return null;
                                        }
                                        a2 = wyf.a(wyfVar4, null, M2, 3);
                                    }
                                    arrayList4.add(a2);
                                }
                                arrayList = arrayList4;
                            }
                        }
                        obj2 = e0a.b(e0aVar, l6g.W(arrayList), rlh.b, false, 26);
                    } else {
                        obj2 = value2;
                    }
                    if (fdiVar.k(value2, obj2)) {
                        break;
                    }
                    z = true;
                }
            } else {
                boolean z3 = false;
                this.r = 1;
                g0a g0aVar2 = (g0a) fdiVar.getValue();
                if (g0aVar2 == null || (collection = g0aVar2.a()) == null) {
                    collection = km5.a;
                }
                ArrayList arrayList6 = new ArrayList(k13.r(collection, 10));
                Iterator it6 = collection.iterator();
                while (it6.hasNext()) {
                    w1l.A(arrayList6, ((EventSuggest.IncidentSuggest) it6.next()).getId());
                }
                boolean contains = arrayList6.contains(new Integer(incidentSuggest.getId()));
                if (contains) {
                    for (EventSuggest.IncidentSuggest incidentSuggest5 : collection) {
                        if (incidentSuggest5.getId() == incidentSuggest.getId()) {
                            if (Intrinsics.c(incidentSuggest5.getTime(), incidentSuggest.getTime())) {
                            }
                        }
                    }
                    ogj.m("Collection contains no element matching the predicate.");
                    return null;
                }
                z3 = true;
                if (contains) {
                    a = new ArrayList(k13.r(collection, 10));
                    for (EventSuggest.IncidentSuggest incidentSuggest6 : collection) {
                        if (incidentSuggest6.getId() == incidentSuggest.getId()) {
                            incidentSuggest6 = incidentSuggest;
                        }
                        a.add(incidentSuggest6);
                    }
                } else {
                    xbb b2 = a.b();
                    b2.add(incidentSuggest);
                    b2.addAll(collection);
                    a = a.a(b2);
                }
                if (z3) {
                    a = tr3.w(a);
                }
                gv9 W = l6g.W(a);
                do {
                    value = fdiVar.getValue();
                    g0aVar = (g0a) value;
                } while (!fdiVar.k(value, g0aVar instanceof d0a ? new d0a(W, ((d0a) g0aVar).b) : g0aVar instanceof f0a ? new f0a(W) : null));
                h38 h38Var = (h38) tr3Var.n.getValue();
                if ((h38Var instanceof f38) && !contains && (incidentSuggest instanceof EventSuggest.IncidentSuggest.GoalSuggest)) {
                    f38 f38Var = (f38) h38Var;
                    EventSuggest.IncidentSuggest.GoalSuggest goalSuggest2 = (EventSuggest.IncidentSuggest.GoalSuggest) incidentSuggest;
                    w1a.E(f38Var.d, String.valueOf(goalSuggest2.getHomeScoreSuggest()));
                    w1a.E(f38Var.e, String.valueOf(goalSuggest2.getAwayScoreSuggest()));
                }
                Object emit = tr3Var.i.emit(omh.e, this);
                if (emit != lu3.a) {
                    emit = Unit.a;
                }
                if (emit == lu3Var) {
                    return lu3Var;
                }
            }
        } else {
            if (i3 != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        return Unit.a;
    }
}
