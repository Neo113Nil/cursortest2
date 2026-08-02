package defpackage;

import com.sofascore.model.crowdsourcing.EventSuggest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class gr3 extends hoi implements Function2 {
    public int r;
    public final /* synthetic */ EventSuggest.IncidentSuggest.GoalSuggest s;
    public final /* synthetic */ tr3 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gr3(EventSuggest.IncidentSuggest.GoalSuggest goalSuggest, tr3 tr3Var, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = goalSuggest;
        this.t = tr3Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new gr3(this.s, this.t, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((gr3) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x023f A[LOOP:7: B:108:0x0205->B:110:0x023f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x022f A[EDGE_INSN: B:111:0x022f->B:112:0x022f BREAK  A[LOOP:7: B:108:0x0205->B:110:0x023f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x023b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b9 A[LOOP:5: B:91:0x01b3->B:93:0x01b9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01d8  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        s54 s54Var;
        s54 s54Var2;
        fdi fdiVar;
        Object value;
        s54 s54Var3;
        s54 s54Var4;
        s54 s54Var5;
        aeh aehVar;
        Iterator<E> it;
        Iterator it2;
        Object obj2;
        EventSuggest.IncidentSuggest incidentSuggest;
        Object obj3;
        lu3 lu3Var = lu3.a;
        int i = this.r;
        s54 s54Var6 = null;
        if (i == 0) {
            y6a.M(obj);
            EventSuggest.IncidentSuggest.GoalSuggest goalSuggest = this.s;
            int i2 = 0;
            boolean z = goalSuggest.getId() < 0;
            tr3 tr3Var = this.t;
            g0a g0aVar = (g0a) tr3Var.t.getValue();
            if (g0aVar == null) {
                return Unit.a;
            }
            gv9 a = g0aVar.a();
            ArrayList arrayList = new ArrayList();
            for (Object obj4 : a) {
                if (obj4 instanceof EventSuggest.IncidentSuggest.GoalSuggest) {
                    arrayList.add(obj4);
                }
            }
            if (z) {
                EventSuggest.IncidentSuggest.GoalSuggest goalSuggest2 = (EventSuggest.IncidentSuggest.GoalSuggest) CollectionsKt.firstOrNull(arrayList);
                if (goalSuggest2 != null) {
                    s54Var = new s54(goalSuggest2.getTime(), goalSuggest2.getAddedTime());
                    if (!z) {
                        List list = arrayList;
                        if (!(g0aVar instanceof d0a)) {
                            if (g0aVar instanceof e0a) {
                                gv9 gv9Var = ((e0a) g0aVar).a;
                                ArrayList arrayList2 = new ArrayList(k13.r(gv9Var, 10));
                                Iterator<E> it3 = gv9Var.iterator();
                                while (it3.hasNext()) {
                                    arrayList2.add(((wyf) it3.next()).a);
                                }
                                list = CollectionsKt.H0(arrayList2, new y73(7));
                            } else {
                                list = km5.a;
                            }
                        }
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj5 : list) {
                            if (obj5 instanceof EventSuggest.IncidentSuggest.GoalSuggest) {
                                arrayList3.add(obj5);
                            }
                        }
                        Iterator it4 = arrayList3.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                i2 = -1;
                                break;
                            }
                            if (Intrinsics.c((EventSuggest.IncidentSuggest.GoalSuggest) it4.next(), goalSuggest)) {
                                break;
                            }
                            i2++;
                        }
                        Integer valueOf = i2 == -1 ? null : Integer.valueOf(i2);
                        if (valueOf != null) {
                            List L0 = CollectionsKt.L0(arrayList3, valueOf.intValue());
                            ListIterator listIterator = L0.listIterator(L0.size());
                            while (true) {
                                if (!listIterator.hasPrevious()) {
                                    obj3 = null;
                                    break;
                                }
                                obj3 = listIterator.previous();
                                if (((EventSuggest.IncidentSuggest.GoalSuggest) obj3).getTime() != null) {
                                    break;
                                }
                            }
                            EventSuggest.IncidentSuggest.GoalSuggest goalSuggest3 = (EventSuggest.IncidentSuggest.GoalSuggest) obj3;
                            s54Var6 = new s54(goalSuggest3 != null ? goalSuggest3.getTime() : null, goalSuggest3 != null ? goalSuggest3.getAddedTime() : null);
                        } else {
                            s54Var6 = null;
                        }
                    }
                    if (z && (g0aVar instanceof e0a)) {
                        gv9 gv9Var2 = ((e0a) g0aVar).a;
                        ArrayList arrayList4 = new ArrayList(k13.r(gv9Var2, 10));
                        it = gv9Var2.iterator();
                        while (it.hasNext()) {
                            arrayList4.add(((wyf) it.next()).a);
                        }
                        it2 = CollectionsKt.H0(arrayList4, new y73(7)).iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it2.next();
                            EventSuggest.IncidentSuggest incidentSuggest2 = (EventSuggest.IncidentSuggest) obj2;
                            if ((incidentSuggest2 instanceof EventSuggest.IncidentSuggest.GoalSuggest) && ((EventSuggest.IncidentSuggest.GoalSuggest) incidentSuggest2).getTime() != null) {
                                break;
                            }
                        }
                        incidentSuggest = (EventSuggest.IncidentSuggest) obj2;
                        if (incidentSuggest != null) {
                            s54Var2 = new s54(incidentSuggest.getTime(), incidentSuggest.getAddedTime());
                            fdiVar = tr3Var.v;
                            while (true) {
                                value = fdiVar.getValue();
                                s54Var3 = s54Var6;
                                s54Var4 = s54Var;
                                s54Var5 = s54Var2;
                                if (fdiVar.k(value, new v34(goalSuggest.getHomeScoreSuggest(), goalSuggest.getAwayScoreSuggest(), s54Var4, s54Var3, s54Var5, goalSuggest, tr3Var.k(goalSuggest), tr3Var.t.getValue() instanceof e0a))) {
                                    break;
                                }
                                s54Var6 = s54Var3;
                                s54Var2 = s54Var5;
                                s54Var = s54Var4;
                            }
                            aehVar = tr3Var.g;
                            this.r = 1;
                            if (aehVar.emit(e34.a, this) == lu3Var) {
                                return lu3Var;
                            }
                        }
                    }
                    s54Var2 = null;
                    fdiVar = tr3Var.v;
                    while (true) {
                        value = fdiVar.getValue();
                        s54Var3 = s54Var6;
                        s54Var4 = s54Var;
                        s54Var5 = s54Var2;
                        if (fdiVar.k(value, new v34(goalSuggest.getHomeScoreSuggest(), goalSuggest.getAwayScoreSuggest(), s54Var4, s54Var3, s54Var5, goalSuggest, tr3Var.k(goalSuggest), tr3Var.t.getValue() instanceof e0a))) {
                        }
                        s54Var6 = s54Var3;
                        s54Var2 = s54Var5;
                        s54Var = s54Var4;
                    }
                    aehVar = tr3Var.g;
                    this.r = 1;
                    if (aehVar.emit(e34.a, this) == lu3Var) {
                    }
                }
                s54Var = null;
                if (!z) {
                }
                if (z) {
                    gv9 gv9Var22 = ((e0a) g0aVar).a;
                    ArrayList arrayList42 = new ArrayList(k13.r(gv9Var22, 10));
                    it = gv9Var22.iterator();
                    while (it.hasNext()) {
                    }
                    it2 = CollectionsKt.H0(arrayList42, new y73(7)).iterator();
                    while (true) {
                        if (it2.hasNext()) {
                        }
                    }
                    incidentSuggest = (EventSuggest.IncidentSuggest) obj2;
                    if (incidentSuggest != null) {
                    }
                }
                s54Var2 = null;
                fdiVar = tr3Var.v;
                while (true) {
                    value = fdiVar.getValue();
                    s54Var3 = s54Var6;
                    s54Var4 = s54Var;
                    s54Var5 = s54Var2;
                    if (fdiVar.k(value, new v34(goalSuggest.getHomeScoreSuggest(), goalSuggest.getAwayScoreSuggest(), s54Var4, s54Var3, s54Var5, goalSuggest, tr3Var.k(goalSuggest), tr3Var.t.getValue() instanceof e0a))) {
                    }
                    s54Var6 = s54Var3;
                    s54Var2 = s54Var5;
                    s54Var = s54Var4;
                }
                aehVar = tr3Var.g;
                this.r = 1;
                if (aehVar.emit(e34.a, this) == lu3Var) {
                }
            } else {
                gv9 a2 = g0aVar.a();
                a2.getClass();
                Iterator it5 = a2.iterator();
                int i3 = 0;
                while (true) {
                    if (!it5.hasNext()) {
                        i3 = -1;
                        break;
                    }
                    if (Intrinsics.c((EventSuggest.IncidentSuggest) it5.next(), goalSuggest)) {
                        break;
                    }
                    i3++;
                }
                Integer valueOf2 = i3 == -1 ? null : Integer.valueOf(i3);
                if (valueOf2 != null) {
                    int intValue = valueOf2.intValue();
                    gv9 a3 = g0aVar.a();
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj6 : a3) {
                        if (obj6 instanceof EventSuggest.IncidentSuggest.GoalSuggest) {
                            arrayList5.add(obj6);
                        }
                    }
                    EventSuggest.IncidentSuggest.GoalSuggest goalSuggest4 = (EventSuggest.IncidentSuggest.GoalSuggest) CollectionsKt.a0(intValue + 1, arrayList5);
                    s54Var = new s54(goalSuggest4 != null ? goalSuggest4.getTime() : null, goalSuggest4 != null ? goalSuggest4.getAddedTime() : null);
                    if (!z) {
                    }
                    if (z) {
                    }
                    s54Var2 = null;
                    fdiVar = tr3Var.v;
                    while (true) {
                        value = fdiVar.getValue();
                        s54Var3 = s54Var6;
                        s54Var4 = s54Var;
                        s54Var5 = s54Var2;
                        if (fdiVar.k(value, new v34(goalSuggest.getHomeScoreSuggest(), goalSuggest.getAwayScoreSuggest(), s54Var4, s54Var3, s54Var5, goalSuggest, tr3Var.k(goalSuggest), tr3Var.t.getValue() instanceof e0a))) {
                        }
                        s54Var6 = s54Var3;
                        s54Var2 = s54Var5;
                        s54Var = s54Var4;
                    }
                    aehVar = tr3Var.g;
                    this.r = 1;
                    if (aehVar.emit(e34.a, this) == lu3Var) {
                    }
                }
                s54Var = null;
                if (!z) {
                }
                if (z) {
                }
                s54Var2 = null;
                fdiVar = tr3Var.v;
                while (true) {
                    value = fdiVar.getValue();
                    s54Var3 = s54Var6;
                    s54Var4 = s54Var;
                    s54Var5 = s54Var2;
                    if (fdiVar.k(value, new v34(goalSuggest.getHomeScoreSuggest(), goalSuggest.getAwayScoreSuggest(), s54Var4, s54Var3, s54Var5, goalSuggest, tr3Var.k(goalSuggest), tr3Var.t.getValue() instanceof e0a))) {
                    }
                    s54Var6 = s54Var3;
                    s54Var2 = s54Var5;
                    s54Var = s54Var4;
                }
                aehVar = tr3Var.g;
                this.r = 1;
                if (aehVar.emit(e34.a, this) == lu3Var) {
                }
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
