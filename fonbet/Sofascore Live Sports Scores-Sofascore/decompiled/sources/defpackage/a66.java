package defpackage;

import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.MmaOrganisationHeadFlags;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.network.response.LineupsResponse;
import com.sofascore.model.newNetwork.topperformance.TopPerformanceResponse;
import com.sofascore.model.newNetwork.topperformance.response.TopPerformanceStatistics;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class a66 extends hoi implements Function2 {
    public final /* synthetic */ q8 A;
    public final /* synthetic */ int r = 0;
    public zu4 s;
    public av4 t;
    public int u;
    public int v;
    public /* synthetic */ Object w;
    public Object x;
    public Object y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a66(Event event, b66 b66Var, rq3 rq3Var) {
        super(2, rq3Var);
        this.z = event;
        this.A = b66Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        q8 q8Var = this.A;
        switch (i) {
            case 0:
                a66 a66Var = new a66((Event) this.z, (b66) q8Var, rq3Var);
                a66Var.w = obj;
                return a66Var;
            default:
                a66 a66Var2 = new a66((fpc) q8Var, rq3Var);
                a66Var2.w = obj;
                return a66Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((a66) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x011a, code lost:
    
        if (r0 != r10) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f5, code lost:
    
        if (r7 == r10) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b6, code lost:
    
        if (r2 == r10) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x027f, code lost:
    
        if (r11.j(r19) == r3) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x024a, code lost:
    
        if (r5 == r3) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0223, code lost:
    
        if (r6 == r3) goto L109;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0213  */
    /* JADX WARN: Type inference failed for: r2v26, types: [zu4] */
    /* JADX WARN: Type inference failed for: r5v13, types: [zu4] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        av4 t;
        av4 t2;
        Object w;
        av4 av4Var;
        int i;
        av4 av4Var2;
        TopPerformanceResponse topPerformanceResponse;
        Object T;
        TopPerformanceResponse topPerformanceResponse2;
        TopPerformanceResponse topPerformanceResponse3;
        av4 av4Var3;
        Object T2;
        zu4 t3;
        av4 t4;
        zu4 t5;
        Object w2;
        Object T3;
        zu4 zu4Var;
        zu4 zu4Var2;
        UniqueTournament uniqueTournament;
        yzc yzcVar;
        Object T4;
        UniqueTournament uniqueTournament2;
        int i2;
        Object T5;
        int i3 = this.r;
        q8 q8Var = this.A;
        int i4 = 0;
        i4 = 0;
        i4 = 0;
        rq3 rq3Var = null;
        switch (i3) {
            case 0:
                b66 b66Var = (b66) q8Var;
                Event event = (Event) this.z;
                ku3 ku3Var = (ku3) this.w;
                lu3 lu3Var = lu3.a;
                int i5 = this.v;
                if (i5 == 0) {
                    y6a.M(obj);
                    UniqueTournament uniqueTournament3 = event.getTournament().getUniqueTournament();
                    Integer num = uniqueTournament3 != null ? new Integer(uniqueTournament3.getId()) : null;
                    Season season = event.getSeason();
                    Integer num2 = season != null ? new Integer(season.getId()) : null;
                    String seasonStatisticsType = event.getSeasonStatisticsType();
                    if (num != null && num2 != null && seasonStatisticsType != null) {
                        i4 = 1;
                    }
                    av4 t6 = i4 != 0 ? xw3.t(ku3Var, null, new z56(b66Var, event, num, num2, seasonStatisticsType, null, 0), 3) : null;
                    t = i4 != 0 ? xw3.t(ku3Var, null, new z56(b66Var, event, num, num2, seasonStatisticsType, null, 1), 3) : null;
                    t2 = xw3.t(ku3Var, null, new ce4(b66Var, event, rq3Var, 17), 3);
                    if (t6 != null) {
                        this.w = null;
                        this.t = t;
                        this.s = t2;
                        this.u = i4;
                        this.v = 1;
                        w = t6.w(this);
                        if (w != lu3Var) {
                            av4Var = t2;
                            i = i4;
                        }
                        break;
                    }
                    av4Var2 = t2;
                    i = i4;
                    topPerformanceResponse = null;
                    if (t != null) {
                        this.w = null;
                        this.t = null;
                        this.s = av4Var2;
                        this.x = topPerformanceResponse;
                        this.u = i;
                        this.v = 2;
                        T = t.T(this);
                        av4Var2 = av4Var2;
                        break;
                    }
                    topPerformanceResponse2 = topPerformanceResponse;
                    topPerformanceResponse3 = null;
                    av4Var3 = av4Var2;
                    this.w = null;
                    this.t = null;
                    this.s = null;
                    this.x = topPerformanceResponse2;
                    this.y = topPerformanceResponse3;
                    this.u = i;
                    this.v = 3;
                    T2 = av4Var3.T(this);
                } else if (i5 == 1) {
                    i = this.u;
                    ?? r2 = this.s;
                    av4 av4Var4 = this.t;
                    y6a.M(obj);
                    t = av4Var4;
                    av4Var = r2;
                    w = obj;
                } else if (i5 == 2) {
                    i = this.u;
                    topPerformanceResponse = (TopPerformanceResponse) this.x;
                    ?? r5 = this.s;
                    y6a.M(obj);
                    T = obj;
                    av4Var2 = r5;
                    x2g x2gVar = (x2g) T;
                    if (x2gVar != null) {
                        TopPerformanceResponse topPerformanceResponse4 = (TopPerformanceResponse) yaa.x(x2gVar);
                        topPerformanceResponse2 = topPerformanceResponse;
                        topPerformanceResponse3 = topPerformanceResponse4;
                        av4Var3 = av4Var2;
                        this.w = null;
                        this.t = null;
                        this.s = null;
                        this.x = topPerformanceResponse2;
                        this.y = topPerformanceResponse3;
                        this.u = i;
                        this.v = 3;
                        T2 = av4Var3.T(this);
                        break;
                    }
                    topPerformanceResponse2 = topPerformanceResponse;
                    topPerformanceResponse3 = null;
                    av4Var3 = av4Var2;
                    this.w = null;
                    this.t = null;
                    this.s = null;
                    this.x = topPerformanceResponse2;
                    this.y = topPerformanceResponse3;
                    this.u = i;
                    this.v = 3;
                    T2 = av4Var3.T(this);
                } else if (i5 == 3) {
                    i = this.u;
                    topPerformanceResponse3 = (TopPerformanceResponse) this.y;
                    TopPerformanceResponse topPerformanceResponse5 = (TopPerformanceResponse) this.x;
                    y6a.M(obj);
                    topPerformanceResponse2 = topPerformanceResponse5;
                    T2 = obj;
                    b66Var.g.j(new y56(event, topPerformanceResponse2 != null ? (TopPerformanceStatistics) topPerformanceResponse2.getTopPerformanceItems() : null, topPerformanceResponse3 != null ? (TopPerformanceStatistics) topPerformanceResponse3.getTopPerformanceItems() : null, (LineupsResponse) T2));
                    this.w = null;
                    this.t = null;
                    this.s = null;
                    this.x = null;
                    this.y = null;
                    this.u = i;
                    this.v = 4;
                    break;
                } else if (i5 != 4) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                    break;
                }
                x2g x2gVar2 = (x2g) w;
                if (x2gVar2 != null) {
                    topPerformanceResponse = (TopPerformanceResponse) yaa.x(x2gVar2);
                    av4Var2 = av4Var;
                    if (t != null) {
                    }
                    topPerformanceResponse2 = topPerformanceResponse;
                    topPerformanceResponse3 = null;
                    av4Var3 = av4Var2;
                    this.w = null;
                    this.t = null;
                    this.s = null;
                    this.x = topPerformanceResponse2;
                    this.y = topPerformanceResponse3;
                    this.u = i;
                    this.v = 3;
                    T2 = av4Var3.T(this);
                } else {
                    i4 = i;
                    t2 = av4Var;
                    av4Var2 = t2;
                    i = i4;
                    topPerformanceResponse = null;
                    if (t != null) {
                    }
                    topPerformanceResponse2 = topPerformanceResponse;
                    topPerformanceResponse3 = null;
                    av4Var3 = av4Var2;
                    this.w = null;
                    this.t = null;
                    this.s = null;
                    this.x = topPerformanceResponse2;
                    this.y = topPerformanceResponse3;
                    this.u = i;
                    this.v = 3;
                    T2 = av4Var3.T(this);
                }
            default:
                fpc fpcVar = (fpc) q8Var;
                ku3 ku3Var2 = (ku3) this.w;
                lu3 lu3Var2 = lu3.a;
                int i6 = this.v;
                if (i6 == 0) {
                    y6a.M(obj);
                    av4 t7 = xw3.t(ku3Var2, null, new epc(fpcVar, null, 3), 3);
                    t3 = xw3.t(ku3Var2, null, new epc(fpcVar, null, 0), 3);
                    t4 = xw3.t(ku3Var2, null, new epc(fpcVar, null, 1), 3);
                    t5 = xw3.t(ku3Var2, null, new epc(fpcVar, null, 2), 3);
                    if (fpcVar.m && !fpcVar.n) {
                        fpcVar.m = false;
                        this.w = null;
                        this.s = t3;
                        this.t = t4;
                        this.x = t5;
                        this.v = 1;
                        w2 = t7.w(this);
                        break;
                    }
                } else if (i6 == 1) {
                    t5 = (zu4) this.x;
                    av4 av4Var5 = this.t;
                    t3 = this.s;
                    y6a.M(obj);
                    t4 = av4Var5;
                    w2 = obj;
                } else if (i6 == 2) {
                    uniqueTournament = (UniqueTournament) this.z;
                    yzcVar = (yzc) this.y;
                    zu4 zu4Var3 = (zu4) this.x;
                    zu4 zu4Var4 = this.s;
                    y6a.M(obj);
                    zu4Var = zu4Var4;
                    zu4Var2 = zu4Var3;
                    T3 = obj;
                    if (!((Boolean) T3).booleanValue()) {
                        this.w = null;
                        this.s = null;
                        this.t = null;
                        this.x = zu4Var2;
                        this.y = yzcVar;
                        this.z = uniqueTournament;
                        this.v = 3;
                        T4 = zu4Var.T(this);
                        break;
                    }
                    uniqueTournament2 = uniqueTournament;
                    i2 = 1;
                    this.w = null;
                    this.s = null;
                    this.t = null;
                    this.x = null;
                    this.y = yzcVar;
                    this.z = uniqueTournament2;
                    this.u = i2;
                    this.v = 4;
                    T5 = zu4Var2.T(this);
                } else if (i6 == 3) {
                    uniqueTournament = (UniqueTournament) this.z;
                    yzcVar = (yzc) this.y;
                    zu4 zu4Var5 = (zu4) this.x;
                    y6a.M(obj);
                    zu4Var2 = zu4Var5;
                    T4 = obj;
                    if (!((Boolean) T4).booleanValue()) {
                        uniqueTournament2 = uniqueTournament;
                        i2 = 0;
                        this.w = null;
                        this.s = null;
                        this.t = null;
                        this.x = null;
                        this.y = yzcVar;
                        this.z = uniqueTournament2;
                        this.u = i2;
                        this.v = 4;
                        T5 = zu4Var2.T(this);
                        break;
                    }
                    uniqueTournament2 = uniqueTournament;
                    i2 = 1;
                    this.w = null;
                    this.s = null;
                    this.t = null;
                    this.x = null;
                    this.y = yzcVar;
                    this.z = uniqueTournament2;
                    this.u = i2;
                    this.v = 4;
                    T5 = zu4Var2.T(this);
                } else if (i6 != 4) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    i2 = this.u;
                    UniqueTournament uniqueTournament4 = (UniqueTournament) this.z;
                    yzc yzcVar2 = (yzc) this.y;
                    y6a.M(obj);
                    uniqueTournament2 = uniqueTournament4;
                    yzcVar = yzcVar2;
                    T5 = obj;
                    yzcVar.j(new MmaOrganisationHeadFlags(uniqueTournament2, i2 != 0, ((Boolean) T5).booleanValue()));
                    fpcVar.m = true;
                    break;
                }
                UniqueTournament uniqueTournament5 = (UniqueTournament) w2;
                if (uniqueTournament5 != null) {
                    fpcVar.n = true;
                    yzc yzcVar3 = fpcVar.i;
                    this.w = null;
                    this.s = t3;
                    this.t = null;
                    this.x = t5;
                    this.y = yzcVar3;
                    this.z = uniqueTournament5;
                    this.v = 2;
                    T3 = t4.T(this);
                    if (T3 != lu3Var2) {
                        zu4Var = t3;
                        zu4Var2 = t5;
                        uniqueTournament = uniqueTournament5;
                        yzcVar = yzcVar3;
                        if (!((Boolean) T3).booleanValue()) {
                        }
                        uniqueTournament2 = uniqueTournament;
                        i2 = 1;
                        this.w = null;
                        this.s = null;
                        this.t = null;
                        this.x = null;
                        this.y = yzcVar;
                        this.z = uniqueTournament2;
                        this.u = i2;
                        this.v = 4;
                        T5 = zu4Var2.T(this);
                    }
                    break;
                }
                fpcVar.m = true;
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a66(fpc fpcVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.A = fpcVar;
    }
}
