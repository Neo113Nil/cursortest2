package defpackage;

import android.content.Context;
import com.sofascore.model.mvvm.model.ManagerData;
import com.sofascore.model.mvvm.model.StageInfo;
import com.sofascore.model.newNetwork.StageDriverPerformance;
import com.sofascore.model.newNetwork.StageDriverPerformanceGraphResponse;
import com.sofascore.model.newNetwork.StageDriverPerformanceRaceLap;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class zxa extends hoi implements Function2 {
    public final /* synthetic */ int r = 3;
    public int s;
    public /* synthetic */ Object t;
    public int u;
    public int v;
    public Object w;
    public Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zxa(u6b u6bVar, int i, Function0 function0, boh bohVar, e1d e1dVar, int i2, e1d e1dVar2, rq3 rq3Var) {
        super(2, rq3Var);
        this.w = u6bVar;
        this.u = i;
        this.x = function0;
        this.t = bohVar;
        this.y = e1dVar;
        this.v = i2;
        this.z = e1dVar2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.z;
        Object obj3 = this.y;
        switch (i) {
            case 0:
                zxa zxaVar = new zxa(this.v, rq3Var, (rxa) obj3, (aya) obj2);
                zxaVar.t = obj;
                return zxaVar;
            case 1:
                zxa zxaVar2 = new zxa((osb) this.w, (ManagerData) this.x, (lsb) obj3, this.u, (t6e) obj2, this.v, rq3Var);
                zxaVar2.t = obj;
                return zxaVar2;
            case 2:
                return new zxa((StageDriverPerformanceGraphResponse) this.t, (Context) obj3, (xkf) obj2, rq3Var);
            case 3:
                zxa zxaVar3 = new zxa(this.u, (Function0) this.w, (boh) this.x, (e1d) obj3, this.v, (e1d) obj2, rq3Var);
                zxaVar3.t = obj;
                return zxaVar3;
            default:
                return new zxa((u6b) this.w, this.u, (Function0) this.x, (boh) this.t, (e1d) obj3, this.v, (e1d) obj2, rq3Var);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((zxa) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:180:0x03b8, code lost:
    
        if (r2 == r3) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00de, code lost:
    
        if (defpackage.n4o.y(2000, r31) != r10) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0081, code lost:
    
        if (defpackage.n4o.y(500, r31) == r10) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:?, code lost:
    
        return r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x022b  */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00de -> B:38:0x0071). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        av4 p;
        int i;
        Object w;
        gv9 gv9Var;
        int i2;
        Object T;
        int i3;
        Object w2;
        Integer laps;
        int intValue;
        Integer num;
        Object r;
        int i4;
        LinkedHashMap linkedHashMap;
        List list;
        Object r2;
        int i5;
        int i6;
        ?? r17;
        boolean z;
        int i7 = this.r;
        Object obj2 = this.z;
        Object obj3 = this.y;
        int i8 = 1;
        switch (i7) {
            case 0:
                rxa rxaVar = (rxa) obj3;
                int i9 = this.v;
                aya ayaVar = (aya) obj2;
                ku3 ku3Var = (ku3) this.t;
                Object obj4 = lu3.a;
                int i10 = this.u;
                ec9 ec9Var = null;
                boolean z2 = false;
                boolean z3 = false;
                if (i10 == 0) {
                    y6a.M(obj);
                    av4 t = xw3.t(ku3Var, null, new yxa(ayaVar, i9, rxaVar, z3 ? 1 : 0, 1), 3);
                    p = yaa.p(ku3Var, !rxaVar.b, new yxa(ayaVar, i9, rxaVar, z2 ? 1 : 0, 0));
                    this.t = null;
                    this.w = p;
                    i = 0;
                    this.s = 0;
                    this.u = 1;
                    w = t.w(this);
                    break;
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i3 = this.s;
                        gv9 gv9Var2 = (gv9) this.x;
                        y6a.M(obj);
                        gv9Var = gv9Var2;
                        T = obj;
                        ec9Var = (ec9) T;
                        i2 = i3;
                        obj4 = new sxa(i2, (gv9) null, gv9Var, (rxa) null, ec9Var, 27);
                        return obj4;
                    }
                    int i11 = this.s;
                    av4 av4Var = (av4) this.w;
                    y6a.M(obj);
                    i = i11;
                    p = av4Var;
                    w = obj;
                }
                gv9Var = (gv9) w;
                if (gv9Var == null) {
                    gv9Var = rlh.b;
                }
                if (p == null) {
                    i2 = i;
                    obj4 = new sxa(i2, (gv9) null, gv9Var, (rxa) null, ec9Var, 27);
                    return obj4;
                }
                this.t = null;
                this.w = null;
                this.x = gv9Var;
                this.s = i;
                this.u = 2;
                T = p.T(this);
                if (T != obj4) {
                    i3 = i;
                    ec9Var = (ec9) T;
                    i2 = i3;
                    obj4 = new sxa(i2, (gv9) null, gv9Var, (rxa) null, ec9Var, 27);
                }
                return obj4;
            case 1:
                osb osbVar = (osb) this.w;
                ku3 ku3Var2 = (ku3) this.t;
                lu3 lu3Var = lu3.a;
                int i12 = this.s;
                if (i12 == 0) {
                    y6a.M(obj);
                    av4 t2 = xw3.t(ku3Var2, null, new gz6(osbVar, this.u, (t6e) obj2, this.v, (rq3) null, 3), 3);
                    this.t = null;
                    this.s = 1;
                    w2 = t2.w(this);
                    if (w2 == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i12 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    w2 = obj;
                }
                x2g x2gVar = (x2g) w2;
                List list2 = osbVar.h;
                if (list2 == null || list2.isEmpty()) {
                    osbVar.h = osbVar.k(((ManagerData) this.x).getCareerHistory());
                }
                ((lsb) obj3).invoke(new vsb(osbVar.h, x2gVar));
                return Unit.a;
            case 2:
                StageDriverPerformanceGraphResponse stageDriverPerformanceGraphResponse = (StageDriverPerformanceGraphResponse) this.t;
                lu3 lu3Var2 = lu3.a;
                int i13 = this.v;
                rq3 rq3Var = null;
                if (i13 == 0) {
                    y6a.M(obj);
                    StageInfo info = stageDriverPerformanceGraphResponse.getStage().getInfo();
                    if (info == null || (laps = info.getLaps()) == null) {
                        a70.p("No laps.");
                        return null;
                    }
                    intValue = laps.intValue();
                    List<StageDriverPerformance> driverPerformance = stageDriverPerformanceGraphResponse.getDriverPerformance();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = driverPerformance.iterator();
                    while (it.hasNext()) {
                        o13.v(((StageDriverPerformance) it.next()).getLaps(), arrayList);
                    }
                    Iterator it2 = arrayList.iterator();
                    if (it2.hasNext()) {
                        num = new Integer(((StageDriverPerformanceRaceLap) it2.next()).getLap());
                        while (it2.hasNext()) {
                            Integer num2 = new Integer(((StageDriverPerformanceRaceLap) it2.next()).getLap());
                            if (num.compareTo(num2) < 0) {
                                num = num2;
                            }
                        }
                    } else {
                        num = null;
                    }
                    int intValue2 = num != null ? num.intValue() : 0;
                    List<StageDriverPerformance> driverPerformance2 = stageDriverPerformanceGraphResponse.getDriverPerformance();
                    int c = sub.c(k13.r(driverPerformance2, 10));
                    if (c < 16) {
                        c = 16;
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(c);
                    for (StageDriverPerformance stageDriverPerformance : driverPerformance2) {
                        linkedHashMap2.put(new Integer(stageDriverPerformance.getStartNumber()), stageDriverPerformance.getLaps());
                    }
                    this.w = linkedHashMap2;
                    this.s = intValue;
                    this.u = intValue2;
                    this.v = 1;
                    r = s9a.r(new m1f(stageDriverPerformanceGraphResponse.getDriverPerformance(), (Context) obj3, rq3Var, 20), this);
                    if (r != lu3Var2) {
                        i4 = intValue2;
                        linkedHashMap = linkedHashMap2;
                    }
                    return lu3Var2;
                }
                if (i13 != 1) {
                    if (i13 != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i5 = this.u;
                    i6 = this.s;
                    List list3 = (List) this.x;
                    y6a.M(obj);
                    list = list3;
                    r17 = 0;
                    r2 = obj;
                    List list4 = (List) r2;
                    List<StageDriverPerformance> driverPerformance3 = stageDriverPerformanceGraphResponse.getDriverPerformance();
                    int c2 = sub.c(k13.r(driverPerformance3, 10));
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(c2 >= 16 ? 16 : c2);
                    for (StageDriverPerformance stageDriverPerformance2 : driverPerformance3) {
                        Integer num3 = new Integer(stageDriverPerformance2.getStartNumber());
                        List<StageDriverPerformanceRaceLap> laps2 = stageDriverPerformance2.getLaps();
                        ArrayList arrayList2 = new ArrayList(k13.r(laps2, 10));
                        int i14 = 0;
                        for (Object obj5 : laps2) {
                            int i15 = i14 + 1;
                            if (i14 < 0) {
                                b.q();
                                throw r17;
                            }
                            StageDriverPerformanceRaceLap stageDriverPerformanceRaceLap = (StageDriverPerformanceRaceLap) obj5;
                            StageDriverPerformanceRaceLap stageDriverPerformanceRaceLap2 = (StageDriverPerformanceRaceLap) CollectionsKt.a0(i15, stageDriverPerformance2.getLaps());
                            String tyreType = stageDriverPerformanceRaceLap.getVisitedPitStop() ? stageDriverPerformanceRaceLap.getTyreType() : r17;
                            String tyreType2 = (tyreType == null || stageDriverPerformanceRaceLap2 == null) ? r17 : stageDriverPerformanceRaceLap2.getTyreType();
                            int lap = stageDriverPerformanceRaceLap.getLap();
                            Integer position = stageDriverPerformanceRaceLap.getPosition();
                            arrayList2.add(new ykf(tyreType, lap, tyreType2, stageDriverPerformanceRaceLap.getVisitedPitStop(), stageDriverPerformanceRaceLap.getOut(), position != null ? position.intValue() : list4.size()));
                            i14 = i15;
                        }
                        linkedHashMap3.put(num3, arrayList2);
                    }
                    return new a3i((xkf) obj2, l6g.W(list), l6g.W(list4), l6g.X(linkedHashMap3), null, null, i5 == i6, i6, i5, 15472);
                }
                i4 = this.u;
                intValue = this.s;
                linkedHashMap = (LinkedHashMap) this.w;
                y6a.M(obj);
                r = obj;
                List list5 = (List) r;
                List<StageDriverPerformance> driverPerformance4 = stageDriverPerformanceGraphResponse.getDriverPerformance();
                pph pphVar = new pph(linkedHashMap, i8);
                this.w = null;
                this.x = list5;
                this.s = intValue;
                this.u = i4;
                this.v = 2;
                rq3 rq3Var2 = null;
                list = list5;
                r2 = s9a.r(new k50(driverPerformance4, pphVar, list, rq3Var2, 28), this);
                if (r2 != lu3Var2) {
                    i5 = i4;
                    i6 = intValue;
                    r17 = rq3Var2;
                    List list42 = (List) r2;
                    List<StageDriverPerformance> driverPerformance32 = stageDriverPerformanceGraphResponse.getDriverPerformance();
                    int c22 = sub.c(k13.r(driverPerformance32, 10));
                    LinkedHashMap linkedHashMap32 = new LinkedHashMap(c22 >= 16 ? 16 : c22);
                    while (r1.hasNext()) {
                    }
                    return new a3i((xkf) obj2, l6g.W(list), l6g.W(list42), l6g.X(linkedHashMap32), null, null, i5 == i6, i6, i5, 15472);
                }
                return lu3Var2;
            case 3:
                boh bohVar = (boh) this.x;
                ku3 ku3Var3 = (ku3) this.t;
                lu3 lu3Var3 = lu3.a;
                int i16 = this.s;
                if (i16 != 0) {
                    if (i16 == 1) {
                        y6a.M(obj);
                        boolean z4 = yaa.w() - bohVar.h() >= ((long) this.u);
                        oqf oqfVar = (oqf) ((e1d) obj3).getValue();
                        if (oqfVar != null) {
                            int i17 = this.v;
                            float f = oqfVar.b;
                            if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f < i17) {
                                z = true;
                                if (z4 && ((Boolean) ((e1d) obj2).getValue()).booleanValue() && z) {
                                    bohVar.i(yaa.w());
                                    ((Function0) this.w).invoke();
                                }
                                this.t = ku3Var3;
                                this.s = 2;
                                break;
                            }
                        }
                        z = false;
                        if (z4) {
                            bohVar.i(yaa.w());
                            ((Function0) this.w).invoke();
                        }
                        this.t = ku3Var3;
                        this.s = 2;
                    } else if (i16 != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
                y6a.M(obj);
                if (!s9a.w(ku3Var3)) {
                    return Unit.a;
                }
                this.t = ku3Var3;
                this.s = 1;
                break;
                break;
            default:
                lu3 lu3Var4 = lu3.a;
                int i18 = this.s;
                if (i18 == 0) {
                    y6a.M(obj);
                    u6b u6bVar = (u6b) this.w;
                    e6b e6bVar = e6b.e;
                    zxa zxaVar = new zxa(this.u, (Function0) this.x, (boh) this.t, (e1d) obj3, this.v, (e1d) obj2, (rq3) null);
                    this.s = 1;
                    if (b6a.A(u6bVar, e6bVar, zxaVar, this) == lu3Var4) {
                        return lu3Var4;
                    }
                } else {
                    if (i18 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zxa(int i, Function0 function0, boh bohVar, e1d e1dVar, int i2, e1d e1dVar2, rq3 rq3Var) {
        super(2, rq3Var);
        this.u = i;
        this.w = function0;
        this.x = bohVar;
        this.y = e1dVar;
        this.v = i2;
        this.z = e1dVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zxa(int i, rq3 rq3Var, rxa rxaVar, aya ayaVar) {
        super(2, rq3Var);
        this.y = rxaVar;
        this.z = ayaVar;
        this.v = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zxa(osb osbVar, ManagerData managerData, lsb lsbVar, int i, t6e t6eVar, int i2, rq3 rq3Var) {
        super(2, rq3Var);
        this.w = osbVar;
        this.x = managerData;
        this.y = lsbVar;
        this.u = i;
        this.z = t6eVar;
        this.v = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zxa(StageDriverPerformanceGraphResponse stageDriverPerformanceGraphResponse, Context context, xkf xkfVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.t = stageDriverPerformanceGraphResponse;
        this.y = context;
        this.z = xkfVar;
    }
}
