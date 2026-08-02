package defpackage;

import android.content.Context;
import com.sofascore.model.mvvm.model.StageInfo;
import com.sofascore.model.newNetwork.StageDriverPerformance;
import com.sofascore.model.newNetwork.StageDriverPerformanceGraphResponse;
import com.sofascore.model.newNetwork.StageDriverPerformanceRaceStage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class xxa extends hoi implements Function2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int r = 0;
    public List s;
    public int t;
    public int u;
    public int v;
    public int w;
    public Object x;
    public Object y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xxa(int i, rq3 rq3Var, rxa rxaVar, aya ayaVar) {
        super(2, rq3Var);
        this.z = rxaVar;
        this.A = ayaVar;
        this.w = i;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.A;
        Object obj3 = this.z;
        switch (i) {
            case 0:
                xxa xxaVar = new xxa(this.w, rq3Var, (rxa) obj3, (aya) obj2);
                xxaVar.y = obj;
                return xxaVar;
            default:
                return new xxa((StageDriverPerformanceGraphResponse) obj3, (Context) obj2, rq3Var);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((xxa) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x02c8, code lost:
    
        if (r0 != r2) goto L113;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x020e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0195  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        av4 t;
        Object w;
        av4 av4Var;
        int i3;
        List list;
        Object T;
        Integer num;
        Integer stages;
        int intValue;
        LinkedHashMap linkedHashMap;
        Object r;
        List list2;
        int i4;
        int i5;
        Object r2;
        int i6;
        int i7;
        int i8;
        List list3;
        LinkedHashMap linkedHashMap2;
        Iterator it;
        int i9 = this.r;
        Object obj2 = this.A;
        Object obj3 = this.z;
        int i10 = 2;
        switch (i9) {
            case 0:
                aya ayaVar = (aya) obj2;
                rxa rxaVar = (rxa) obj3;
                ku3 ku3Var = (ku3) this.y;
                lu3 lu3Var = lu3.a;
                int i11 = this.v;
                if (i11 == 0) {
                    y6a.M(obj);
                    boolean z = rxaVar.b;
                    i = z ? 4 : 3;
                    i2 = z ? 2 : 3;
                    av4 p = yaa.p(ku3Var, z, new wxa(this.w, null, rxaVar, ayaVar));
                    t = xw3.t(ku3Var, null, new vxa(ayaVar, this.w, rxaVar, i2, i, null), 3);
                    if (p != null) {
                        this.y = null;
                        this.x = t;
                        this.t = i;
                        this.u = i2;
                        this.v = 1;
                        w = p.w(this);
                        if (w != lu3Var) {
                            av4Var = t;
                            i3 = i2;
                        }
                        return lu3Var;
                    }
                    list = rlh.b;
                    av4Var = t;
                    i3 = i2;
                    this.y = null;
                    this.x = null;
                    this.s = list;
                    this.t = i;
                    this.u = i3;
                    this.v = 2;
                    T = av4Var.T(this);
                    break;
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        List list4 = this.s;
                        y6a.M(obj);
                        list = list4;
                        T = obj;
                        Iterable iterable = (List) T;
                        if (iterable == null) {
                            iterable = rlh.b;
                        }
                        return l6g.W(CollectionsKt.w0(iterable, list));
                    }
                    i3 = this.u;
                    int i12 = this.t;
                    av4Var = (av4) this.x;
                    y6a.M(obj);
                    i = i12;
                    w = obj;
                }
                list = (List) w;
                if (list == null) {
                    i2 = i3;
                    t = av4Var;
                    list = rlh.b;
                    av4Var = t;
                    i3 = i2;
                }
                this.y = null;
                this.x = null;
                this.s = list;
                this.t = i;
                this.u = i3;
                this.v = 2;
                T = av4Var.T(this);
            default:
                StageDriverPerformanceGraphResponse stageDriverPerformanceGraphResponse = (StageDriverPerformanceGraphResponse) obj3;
                lu3 lu3Var2 = lu3.a;
                int i13 = this.w;
                rq3 rq3Var = null;
                if (i13 == 0) {
                    y6a.M(obj);
                    List<StageDriverPerformance> driverPerformance = stageDriverPerformanceGraphResponse.getDriverPerformance();
                    ArrayList arrayList = new ArrayList();
                    Iterator<T> it2 = driverPerformance.iterator();
                    while (it2.hasNext()) {
                        o13.v(((StageDriverPerformance) it2.next()).getStages(), arrayList);
                    }
                    Iterator it3 = arrayList.iterator();
                    if (it3.hasNext()) {
                        num = new Integer(((StageDriverPerformanceRaceStage) it3.next()).getStage());
                        while (it3.hasNext()) {
                            Integer num2 = new Integer(((StageDriverPerformanceRaceStage) it3.next()).getStage());
                            if (num.compareTo(num2) < 0) {
                                num = num2;
                            }
                        }
                    } else {
                        num = null;
                    }
                    int intValue2 = num != null ? num.intValue() : 1;
                    Iterator it4 = arrayList.iterator();
                    if (!it4.hasNext()) {
                        yhk.d();
                        return null;
                    }
                    int stage = ((StageDriverPerformanceRaceStage) it4.next()).getStage();
                    while (it4.hasNext()) {
                        int stage2 = ((StageDriverPerformanceRaceStage) it4.next()).getStage();
                        if (stage > stage2) {
                            stage = stage2;
                        }
                    }
                    StageInfo info = stageDriverPerformanceGraphResponse.getStage().getInfo();
                    if (info == null || (stages = info.getStages()) == null) {
                        a70.p("No stages.");
                        return null;
                    }
                    intValue = stages.intValue();
                    if (intValue < intValue2) {
                        intValue = intValue2;
                    }
                    int i14 = 20;
                    List<StageDriverPerformance> L0 = CollectionsKt.L0(CollectionsKt.H0(stageDriverPerformanceGraphResponse.getDriverPerformance(), new d5c(intValue2, i10)), 20);
                    int c = sub.c(k13.r(L0, 10));
                    if (c < 16) {
                        c = 16;
                    }
                    linkedHashMap = new LinkedHashMap(c);
                    for (StageDriverPerformance stageDriverPerformance : L0) {
                        linkedHashMap.put(new Integer(stageDriverPerformance.getStartNumber()), stageDriverPerformance.getStages());
                    }
                    this.s = L0;
                    this.x = linkedHashMap;
                    this.t = intValue2;
                    this.u = stage;
                    this.v = intValue;
                    this.w = 1;
                    r = s9a.r(new m1f(L0, (Context) obj2, rq3Var, i14), this);
                    if (r != lu3Var2) {
                        list2 = L0;
                        i4 = intValue2;
                        i5 = stage;
                    }
                    return lu3Var2;
                }
                if (i13 == 1) {
                    int i15 = this.v;
                    i5 = this.u;
                    i4 = this.t;
                    LinkedHashMap linkedHashMap3 = (LinkedHashMap) this.x;
                    List list5 = this.s;
                    y6a.M(obj);
                    linkedHashMap = linkedHashMap3;
                    list2 = list5;
                    intValue = i15;
                    r = obj;
                } else {
                    if (i13 != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i8 = this.v;
                    i6 = this.u;
                    i7 = this.t;
                    list3 = (List) this.y;
                    List list6 = this.s;
                    y6a.M(obj);
                    list2 = list6;
                    r2 = obj;
                    List list7 = (List) r2;
                    int c2 = sub.c(k13.r(list2, 10));
                    linkedHashMap2 = new LinkedHashMap(c2 >= 16 ? 16 : c2);
                    it = list2.iterator();
                    while (true) {
                        int i16 = 0;
                        if (it.hasNext()) {
                            return new a3i(xkf.d, l6g.W(list3), l6g.W(list7), l6g.X(linkedHashMap2), null, null, i7 != i8, i8 - 1, i7 - 1, 15472);
                        }
                        StageDriverPerformance stageDriverPerformance2 = (StageDriverPerformance) it.next();
                        Integer num3 = new Integer(stageDriverPerformance2.getStartNumber());
                        List<StageDriverPerformanceRaceStage> stages2 = stageDriverPerformance2.getStages();
                        ArrayList arrayList2 = new ArrayList(k13.r(stages2, 10));
                        for (Object obj4 : stages2) {
                            int i17 = i16 + 1;
                            if (i16 < 0) {
                                b.q();
                                throw null;
                            }
                            StageDriverPerformanceRaceStage stageDriverPerformanceRaceStage = (StageDriverPerformanceRaceStage) obj4;
                            int stage3 = stageDriverPerformanceRaceStage.getStage() - i6;
                            Integer position = stageDriverPerformanceRaceStage.getPosition();
                            arrayList2.add(new ykf(null, stage3, null, false, stageDriverPerformanceRaceStage.getOut(), position != null ? position.intValue() : list7.size()));
                            i16 = i17;
                        }
                        linkedHashMap2.put(num3, arrayList2);
                    }
                }
                List list8 = (List) r;
                pph pphVar = new pph(linkedHashMap, i10);
                this.s = list2;
                this.x = null;
                this.y = list8;
                this.t = i4;
                this.u = i5;
                this.v = intValue;
                this.w = 2;
                r2 = s9a.r(new k50(list2, pphVar, list8, rq3Var, 28), this);
                if (r2 != lu3Var2) {
                    i6 = i5;
                    i7 = i4;
                    i8 = intValue;
                    list3 = list8;
                    List list72 = (List) r2;
                    int c22 = sub.c(k13.r(list2, 10));
                    linkedHashMap2 = new LinkedHashMap(c22 >= 16 ? 16 : c22);
                    it = list2.iterator();
                    while (true) {
                        int i162 = 0;
                        if (it.hasNext()) {
                        }
                        linkedHashMap2.put(num3, arrayList2);
                    }
                }
                return lu3Var2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xxa(StageDriverPerformanceGraphResponse stageDriverPerformanceGraphResponse, Context context, rq3 rq3Var) {
        super(2, rq3Var);
        this.z = stageDriverPerformanceGraphResponse;
        this.A = context;
    }
}
