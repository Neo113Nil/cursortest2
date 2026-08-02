package defpackage;

import com.sofascore.model.newNetwork.StageStandingsItem;
import com.sofascore.results.stagesport.fragments.raceFlow.RaceFlowModels$RaceEntrant;
import com.sofascore.results.stagesport.fragments.raceFlow.RaceFlowModels$RaceTeam;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class l2i implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ l2i(d3i d3iVar) {
        this.a = 4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0267 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01fa A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.AbstractList] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        List H0;
        ?? arrayList;
        Object obj2;
        List list;
        Object obj3;
        ukf ukfVar;
        switch (this.a) {
            case 0:
                e8i e8iVar = (e8i) obj;
                e8iVar.getClass();
                return Boolean.valueOf(e8iVar.f);
            case 1:
                a3i a3iVar = (a3i) obj;
                a3iVar.getClass();
                return a3iVar.e;
            case 2:
                a3i a3iVar2 = (a3i) obj;
                a3iVar2.getClass();
                return new Pair(a3iVar2.l, a3iVar2.f);
            case 3:
                a3i a3iVar3 = (a3i) obj;
                a3iVar3.getClass();
                return a3i.a(a3iVar3, null, null, null, null, null, null, false, 0, 0, a3iVar3.k + 1, null, null, null, 13311);
            case 4:
                a3i a3iVar4 = (a3i) obj;
                RaceFlowModels$RaceTeam raceFlowModels$RaceTeam = a3iVar4.e;
                gv9 gv9Var = a3iVar4.c;
                if (raceFlowModels$RaceTeam == null) {
                    H0 = CollectionsKt.H0(gv9Var, new laf(23));
                    arrayList = d3i.t(a3iVar4);
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj4 : gv9Var) {
                        RaceFlowModels$RaceTeam raceFlowModels$RaceTeam2 = ((RaceFlowModels$RaceEntrant) obj4).e;
                        if (raceFlowModels$RaceTeam2 != null && raceFlowModels$RaceTeam2.a == a3iVar4.e.a) {
                            arrayList2.add(obj4);
                        }
                    }
                    H0 = CollectionsKt.H0(arrayList2, new laf(24));
                    arrayList = new ArrayList(k13.r(H0, 10));
                    Iterator it = H0.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf(((RaceFlowModels$RaceEntrant) it.next()).a));
                    }
                }
                return a3i.a(a3iVar4, null, null, null, null, l6g.W(arrayList), l6g.W(H0), false, 0, 0, 0, null, null, null, 16287);
            case 5:
                a3i a3iVar5 = (a3i) obj;
                if (a3iVar5.l == null) {
                    return a3i.a(a3iVar5, null, null, null, null, null, null, false, 0, 0, 0, null, null, null, 4095);
                }
                gv9 gv9Var2 = a3iVar5.f;
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = gv9Var2.iterator();
                while (it2.hasNext()) {
                    int intValue = ((Number) it2.next()).intValue();
                    Iterator it3 = a3iVar5.c.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            obj2 = it3.next();
                            if (((RaceFlowModels$RaceEntrant) obj2).a == intValue) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    RaceFlowModels$RaceEntrant raceFlowModels$RaceEntrant = (RaceFlowModels$RaceEntrant) obj2;
                    if (raceFlowModels$RaceEntrant != null && (list = (List) a3iVar5.d.get(Integer.valueOf(intValue))) != null) {
                        Iterator it4 = list.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                obj3 = it4.next();
                                ykf ykfVar = (ykf) obj3;
                                if (!ykfVar.f) {
                                    int i = ykfVar.a;
                                    Integer num = a3iVar5.l;
                                    if (num != null && i == num.intValue()) {
                                    }
                                }
                            } else {
                                obj3 = null;
                            }
                        }
                        ykf ykfVar2 = (ykf) obj3;
                        if (ykfVar2 != null) {
                            ukfVar = new ukf(raceFlowModels$RaceEntrant, ykfVar2);
                            if (ukfVar == null) {
                                arrayList3.add(ukfVar);
                            }
                        }
                    }
                    ukfVar = null;
                    if (ukfVar == null) {
                    }
                }
                List H02 = CollectionsKt.H0(arrayList3, new laf(25));
                gv9 W = l6g.W(H02);
                ArrayList arrayList4 = new ArrayList();
                for (Object obj5 : H02) {
                    if (((ukf) obj5).b.c) {
                        arrayList4.add(obj5);
                    }
                }
                return a3i.a(a3iVar5, null, null, null, null, null, null, false, 0, 0, 0, null, W, l6g.W(arrayList4), 4095);
            case 6:
                StageStandingsItem stageStandingsItem = (StageStandingsItem) obj;
                stageStandingsItem.getClass();
                if (stageStandingsItem.getVictories() != null) {
                    return Double.valueOf(r0.intValue());
                }
                return null;
            case 7:
                StageStandingsItem stageStandingsItem2 = (StageStandingsItem) obj;
                stageStandingsItem2.getClass();
                return stageStandingsItem2.getPoints();
            case 8:
                StageStandingsItem stageStandingsItem3 = (StageStandingsItem) obj;
                stageStandingsItem3.getClass();
                Double points = stageStandingsItem3.getPoints();
                if (points == null) {
                    return null;
                }
                double doubleValue = points.doubleValue();
                joa joaVar = l5i.a;
                return doubleValue % 1.0d == 0.0d ? String.valueOf((int) doubleValue) : String.valueOf(doubleValue);
            case 9:
                StageStandingsItem stageStandingsItem4 = (StageStandingsItem) obj;
                stageStandingsItem4.getClass();
                if (stageStandingsItem4.getSprint() != null) {
                    return Double.valueOf(r0.intValue());
                }
                return null;
            case 10:
                StageStandingsItem stageStandingsItem5 = (StageStandingsItem) obj;
                stageStandingsItem5.getClass();
                Integer sprint = stageStandingsItem5.getSprint();
                if (sprint != null) {
                    return String.valueOf(sprint.intValue());
                }
                return null;
            case 11:
                StageStandingsItem stageStandingsItem6 = (StageStandingsItem) obj;
                stageStandingsItem6.getClass();
                if (stageStandingsItem6.getClimb() != null) {
                    return Double.valueOf(r0.intValue());
                }
                return null;
            case 12:
                StageStandingsItem stageStandingsItem7 = (StageStandingsItem) obj;
                stageStandingsItem7.getClass();
                Integer climb = stageStandingsItem7.getClimb();
                if (climb != null) {
                    return String.valueOf(climb.intValue());
                }
                return null;
            case 13:
                ((StageStandingsItem) obj).getClass();
                return null;
            case 14:
                StageStandingsItem stageStandingsItem8 = (StageStandingsItem) obj;
                stageStandingsItem8.getClass();
                return stageStandingsItem8.getTime();
            case 15:
                StageStandingsItem stageStandingsItem9 = (StageStandingsItem) obj;
                stageStandingsItem9.getClass();
                Integer victories = stageStandingsItem9.getVictories();
                if (victories != null) {
                    return String.valueOf(victories.intValue());
                }
                return null;
            case 16:
                StageStandingsItem stageStandingsItem10 = (StageStandingsItem) obj;
                stageStandingsItem10.getClass();
                if (stageStandingsItem10.getPolePositions() != null) {
                    return Double.valueOf(r0.intValue());
                }
                return null;
            case 17:
                StageStandingsItem stageStandingsItem11 = (StageStandingsItem) obj;
                stageStandingsItem11.getClass();
                Integer polePositions = stageStandingsItem11.getPolePositions();
                if (polePositions != null) {
                    return String.valueOf(polePositions.intValue());
                }
                return null;
            case 18:
                StageStandingsItem stageStandingsItem12 = (StageStandingsItem) obj;
                stageStandingsItem12.getClass();
                if (stageStandingsItem12.getPodiums() != null) {
                    return Double.valueOf(r0.intValue());
                }
                return null;
            case 19:
                StageStandingsItem stageStandingsItem13 = (StageStandingsItem) obj;
                stageStandingsItem13.getClass();
                Integer podiums = stageStandingsItem13.getPodiums();
                if (podiums != null) {
                    return String.valueOf(podiums.intValue());
                }
                return null;
            case 20:
                ((i4i) obj).getClass();
                return Boolean.TRUE;
            case 21:
                i4i i4iVar = (i4i) obj;
                i4iVar.getClass();
                return Boolean.valueOf(i4iVar.c);
            case 22:
                ((i4i) obj).getClass();
                joa joaVar2 = l5i.a;
                return Boolean.valueOf(!l5i.f(r0.a));
            case 23:
                i4i i4iVar2 = (i4i) obj;
                i4iVar2.getClass();
                return Boolean.valueOf(i4iVar2.b);
            case 24:
                i4i i4iVar3 = (i4i) obj;
                i4iVar3.getClass();
                return Boolean.valueOf(i4iVar3.d);
            case 25:
                ((e8i) obj).getClass();
                return Boolean.TRUE;
            case 26:
                e8i e8iVar2 = (e8i) obj;
                e8iVar2.getClass();
                return Boolean.valueOf(e8iVar2.d);
            case 27:
                e8i e8iVar3 = (e8i) obj;
                e8iVar3.getClass();
                return Boolean.valueOf(e8iVar3.e);
            case 28:
                e8i e8iVar4 = (e8i) obj;
                e8iVar4.getClass();
                return Boolean.valueOf(e8iVar4.f);
            default:
                ((r60) obj).getClass();
                return l98.l0(uo5.e(s02.h0(150, 0, null, 6), 2), uo5.f(s02.h0(50, 0, null, 6), 2));
        }
    }

    public /* synthetic */ l2i(int i) {
        this.a = i;
    }
}
