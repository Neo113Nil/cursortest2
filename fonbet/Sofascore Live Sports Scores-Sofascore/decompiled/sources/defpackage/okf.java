package defpackage;

import com.sofascore.results.stagesport.fragments.raceFlow.RaceFlowModels$RaceEntrant;
import com.sofascore.results.stagesport.fragments.raceFlow.RaceFlowModels$RaceTeam;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class okf extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ gv9 t;
    public final /* synthetic */ koh u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ okf(gv9 gv9Var, koh kohVar, Object obj, Object obj2, Object obj3, Object obj4, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = gv9Var;
        this.u = kohVar;
        this.v = obj;
        this.w = obj2;
        this.x = obj3;
        this.y = obj4;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.y;
        Object obj3 = this.x;
        Object obj4 = this.w;
        Object obj5 = this.v;
        switch (i) {
            case 0:
                okf okfVar = new okf(this.t, this.u, (cdi) obj5, (tee) obj4, (e1d) obj3, (e1d) obj2, rq3Var, 0);
                okfVar.s = obj;
                return okfVar;
            default:
                okf okfVar2 = new okf(this.t, this.u, (koh) obj5, (xnh) obj4, (koh) obj3, (Function0) obj2, rq3Var, 1);
                okfVar2.s = obj;
                return okfVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((okf) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Pair pair;
        ykf ykfVar;
        int i = this.r;
        Object obj2 = this.y;
        Object obj3 = this.x;
        koh kohVar = this.u;
        gv9<RaceFlowModels$RaceEntrant> gv9Var = this.t;
        Object obj4 = this.w;
        Object obj5 = this.v;
        rq3 rq3Var = null;
        ku3 ku3Var = (ku3) this.s;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                gv9 gv9Var2 = (gv9) ((cdi) obj5).getValue();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj6 : gv9Var2) {
                    RaceFlowModels$RaceTeam raceFlowModels$RaceTeam = ((RaceFlowModels$RaceEntrant) obj6).e;
                    Integer num = raceFlowModels$RaceTeam != null ? new Integer(raceFlowModels$RaceTeam.a) : null;
                    Object obj7 = linkedHashMap.get(num);
                    if (obj7 == null) {
                        obj7 = new ArrayList();
                        linkedHashMap.put(num, obj7);
                    }
                    ((List) obj7).add(obj6);
                }
                tee teeVar = (tee) obj4;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(sub.c(linkedHashMap.size()));
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    Object key = entry.getKey();
                    List<RaceFlowModels$RaceEntrant> list = (List) entry.getValue();
                    ArrayList arrayList = new ArrayList(k13.r(list, 10));
                    for (RaceFlowModels$RaceEntrant raceFlowModels$RaceEntrant : list) {
                        Integer num2 = new Integer(raceFlowModels$RaceEntrant.a);
                        List list2 = (List) teeVar.get(new Integer(raceFlowModels$RaceEntrant.a));
                        arrayList.add(new Pair(num2, new Integer((list2 == null || (ykfVar = (ykf) CollectionsKt.j0(list2)) == null) ? Integer.MAX_VALUE : ykfVar.b)));
                    }
                    List H0 = CollectionsKt.H0(arrayList, new laf(4));
                    ArrayList arrayList2 = new ArrayList(k13.r(H0, 10));
                    Iterator it = H0.iterator();
                    while (it.hasNext()) {
                        w1l.A(arrayList2, ((Number) ((Pair) it.next()).a).intValue());
                    }
                    linkedHashMap2.put(key, arrayList2);
                }
                for (RaceFlowModels$RaceEntrant raceFlowModels$RaceEntrant2 : gv9Var) {
                    gv9 gv9Var3 = (gv9) ((e1d) obj3).getValue();
                    int i2 = raceFlowModels$RaceEntrant2.a;
                    int i3 = 2;
                    if (gv9Var3.contains(new Integer(i2))) {
                        RaceFlowModels$RaceTeam raceFlowModels$RaceTeam2 = raceFlowModels$RaceEntrant2.e;
                        List list3 = (List) linkedHashMap2.get(raceFlowModels$RaceTeam2 != null ? new Integer(raceFlowModels$RaceTeam2.a) : null);
                        if (list3 == null) {
                            list3 = km5.a;
                        }
                        pair = list3.size() == 2 ? list3.indexOf(new Integer(i2)) == 0 ? new Pair(new Float(1.0f), new Float(1.0f)) : new Pair(new Float(0.5f), new Float(1.0f)) : new Pair(new Float(1.0f), new Float(1.0f));
                    } else {
                        pair = new Pair(new Float(0.1f), new Float(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                    }
                    float floatValue = ((Number) pair.a).floatValue();
                    float floatValue2 = ((Number) pair.b).floatValue();
                    q50 q50Var = (q50) kohVar.get("path_alpha_" + i2);
                    if (q50Var != null) {
                        xw3.L(ku3Var, null, null, new cba(q50Var, floatValue, rq3Var, 1), 3);
                    } else {
                        kohVar.put(ljg.j(i2, "path_alpha_"), ml4.b(floatValue));
                        Unit unit = Unit.a;
                    }
                    q50 q50Var2 = (q50) kohVar.get("pit_circle_alpha_" + i2);
                    if (q50Var2 != null) {
                        xw3.L(ku3Var, null, null, new cba(q50Var2, floatValue2, rq3Var, i3), 3);
                    } else {
                        kohVar.put(ljg.j(i2, "pit_circle_alpha_"), ml4.b(floatValue2));
                        Unit unit2 = Unit.a;
                    }
                    if (!raceFlowModels$RaceEntrant2.g) {
                        q50 q50Var3 = (q50) kohVar.get("number_circle_alpha_" + i2);
                        if (q50Var3 == null) {
                            kohVar.put(ljg.j(i2, "number_circle_alpha_"), ml4.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                        } else if (((Boolean) ((e1d) obj2).getValue()).booleanValue()) {
                            xw3.L(ku3Var, null, null, new cba(q50Var3, floatValue2, rq3Var, 3), 3);
                        }
                    }
                }
                break;
            default:
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                xw3.L(ku3Var, null, null, new gje((koh) obj5, (xnh) obj4, rq3Var, 15), 3);
                for (RaceFlowModels$RaceEntrant raceFlowModels$RaceEntrant3 : gv9Var) {
                    boolean z = raceFlowModels$RaceEntrant3.g;
                    int i4 = raceFlowModels$RaceEntrant3.a;
                    if (!z) {
                        q50 q50Var4 = (q50) kohVar.get("number_circle_position_" + i4);
                        if (q50Var4 != null) {
                            Function0 function0 = (Function0) obj2;
                            dnd dndVar = (dnd) ((koh) obj3).get(new Integer(i4));
                            if (dndVar != null) {
                                xw3.L(ku3Var, null, null, new a74(q50Var4, dndVar.a, function0, (rq3) null, 4), 3);
                            }
                        }
                    }
                }
                break;
        }
        return Unit.a;
    }
}
