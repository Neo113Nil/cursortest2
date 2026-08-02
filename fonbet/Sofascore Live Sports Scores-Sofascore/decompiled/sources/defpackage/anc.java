package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.f1;
import com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.h;
import com.sofascore.model.Country;
import com.sofascore.model.Sports;
import com.sofascore.model.TvType;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Referee;
import com.sofascore.model.mvvm.model.RefereeDetailsHeadFlags;
import com.sofascore.model.mvvm.model.ServerType;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.UniqueStage;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.network.response.bettingtips.H2HStreaksResponse;
import com.sofascore.model.network.response.bettingtips.TrendingOddsResponse;
import com.sofascore.model.newNetwork.RecentStageIdsResponse;
import com.sofascore.model.newNetwork.StageResponse;
import com.sofascore.model.newNetwork.StageSeasonsResponse;
import com.sofascore.model.newNetwork.StagesListResponse;
import com.sofascore.model.newNetwork.TeamCareerStatisticsResponse;
import com.sofascore.model.newNetwork.TeamTransfersResponse;
import com.sofascore.model.newNetwork.VenueResponse;
import com.sofascore.model.newNetwork.VenueSport;
import com.sofascore.model.newNetwork.newRankings.RankingsSummaryResponse;
import com.sofascore.model.util.MonthWithYear;
import com.sofascore.results.service.StageWorker;
import com.sofascore.results.widget.SofaWidgetReceiver;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class anc extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public int t;
    public Object u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anc(int i, tll tllVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 21;
        this.t = i;
        this.v = tllVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.v;
        switch (i) {
            case 0:
                return new anc((cnc) obj2, this.t, rq3Var, 0);
            case 1:
                return new anc((qoc) obj2, this.t, rq3Var, 1);
            case 2:
                return new anc((vpc) this.u, this.t, (MonthWithYear) obj2, rq3Var, 2);
            case 3:
                return new anc((aqc) obj2, this.t, rq3Var, 3);
            case 4:
                return new anc((roe) obj2, this.t, rq3Var, 4);
            case 5:
                return new anc((roe) this.u, this.t, (String) obj2, rq3Var, 5);
            case 6:
                return new anc((fqe) this.u, this.t, (String) obj2, rq3Var, 6);
            case 7:
                return new anc((qqe) this.u, this.t, (Integer) obj2, rq3Var, 7);
            case 8:
                anc ancVar = new anc((jsf) obj2, this.t, rq3Var, 8);
                ancVar.u = obj;
                return ancVar;
            case 9:
                return new anc((bxg) this.u, this.t, (String) obj2, rq3Var, 9);
            case 10:
                return new anc((SofaWidgetReceiver) this.u, (Context) obj2, this.t, rq3Var, 10);
            case 11:
                return new anc((q3i) obj2, this.t, rq3Var, 11);
            case 12:
                return new anc((g4i) this.u, this.t, (Country) obj2, rq3Var, 12);
            case 13:
                return new anc((n4i) obj2, this.t, rq3Var, 13);
            case 14:
                return new anc((n4i) this.u, (av4) obj2, this.t, rq3Var, 14);
            case 15:
                return new anc((StageWorker) obj2, this.t, rq3Var, 15);
            case 16:
                return new anc((q3j) obj2, this.t, rq3Var, 16);
            case 17:
                return new anc((klj) this.u, this.t, (String) obj2, rq3Var, 17);
            case 18:
                return new anc((n0k) this.u, this.t, (String) obj2, rq3Var, 18);
            case 19:
                anc ancVar2 = new anc((dnk) obj2, this.t, rq3Var, 19);
                ancVar2.u = obj;
                return ancVar2;
            case 20:
                return new anc((onk) obj2, this.t, rq3Var, 20);
            case 21:
                return new anc(this.t, (tll) obj2, rq3Var);
            default:
                return new anc((h) this.u, (String) obj2, rq3Var);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((anc) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0063, code lost:
    
        if (r9 == r2) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0328, code lost:
    
        if (r2 == r1) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x03f2, code lost:
    
        if (r0 == r2) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007d, code lost:
    
        if (defpackage.n4o.y(com.ironsource.Ua.s, r17) == r2) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x03ab, code lost:
    
        if (r3 == r2) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x044a, code lost:
    
        if (r0 == r1) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0435, code lost:
    
        if (r2 == r1) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x074a, code lost:
    
        if (r0 == r1) goto L364;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x072c, code lost:
    
        if (r2 == r1) goto L364;
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x07c4, code lost:
    
        if (r0 == r1) goto L389;
     */
    /* JADX WARN: Code restructure failed: missing block: B:452:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x078d, code lost:
    
        if (r3 == r1) goto L389;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x0799  */
    /* JADX WARN: Type inference failed for: r2v69, types: [yzc] */
    /* JADX WARN: Type inference failed for: r2v70 */
    /* JADX WARN: Type inference failed for: r2v73 */
    /* JADX WARN: Type inference failed for: r8v0, types: [rq3] */
    /* JADX WARN: Type inference failed for: r8v2, types: [com.sofascore.model.mvvm.model.UniqueTournament, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v54 */
    /* JADX WARN: Type inference failed for: r8v55, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v57, types: [km5] */
    /* JADX WARN: Type inference failed for: r8v58, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v68 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x007d -> B:8:0x0081). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        UniqueTournament uniqueTournament;
        Object k;
        Object f;
        UniqueTournament uniqueTournament2;
        Object P;
        Object R;
        Object k2;
        yzc yzcVar;
        Object X;
        yzc yzcVar2;
        Object P2;
        Referee referee;
        Object w;
        yzc yzcVar3;
        Object P3;
        Object y;
        Stage stage;
        Object l;
        Object w2;
        Integer num;
        UniqueStage uniqueStage;
        UniqueStage uniqueStage2;
        Object M;
        Stage stage2;
        List<Stage> stages;
        Object obj2;
        Object O;
        List<Integer> stageIds;
        Object P4;
        q3j q3jVar;
        Object r;
        Object r2;
        Object w3;
        Object d;
        ?? r22;
        Integer num2;
        Object u;
        int i;
        boolean z;
        Object obj3;
        int i2 = this.r;
        int i3 = 3;
        Object obj4 = this.v;
        int i4 = 1;
        ?? r8 = 0;
        ?? r82 = 0;
        TeamTransfersResponse teamTransfersResponse = null;
        Boolean bool = null;
        switch (i2) {
            case 0:
                cnc cncVar = (cnc) obj4;
                lu3 lu3Var = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    uniqueTournament = cncVar.k;
                    if (uniqueTournament == null) {
                        int i6 = this.t;
                        this.s = 1;
                        k = cncVar.k(i6, this);
                        break;
                    }
                    r8 = uniqueTournament;
                    if (r8 != 0) {
                        ia0 ia0Var = ia0.q;
                        if (!ok3.p().h().e().contains(new Integer(r8.getId()))) {
                            wqc wqcVar = cncVar.f;
                            int id = r8.getId();
                            this.u = r8;
                            this.s = 2;
                            f = wqcVar.f(id, this);
                            uniqueTournament2 = r8;
                            break;
                        }
                    }
                    return Unit.a;
                }
                if (i5 != 1) {
                    if (i5 != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    UniqueTournament uniqueTournament3 = (UniqueTournament) this.u;
                    y6a.M(obj);
                    uniqueTournament2 = uniqueTournament3;
                    f = obj;
                    if (((Number) f).intValue() >= 3) {
                        cncVar.i.a(uniqueTournament2);
                    }
                    return Unit.a;
                }
                y6a.M(obj);
                k = obj;
                uniqueTournament = (UniqueTournament) k;
                if (uniqueTournament != null) {
                    cncVar.k = uniqueTournament;
                    r8 = uniqueTournament;
                }
                if (r8 != 0) {
                }
                return Unit.a;
            case 1:
                qoc qocVar = (qoc) obj4;
                lu3 lu3Var2 = lu3.a;
                int i7 = this.s;
                if (i7 == 0) {
                    y6a.M(obj);
                    j0j j0jVar = qocVar.e;
                    int i8 = this.t;
                    this.s = 1;
                    j0jVar.getClass();
                    P = yaa.P(new azi(j0jVar, i8, r8, 7), this);
                    break;
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qocVar = (qoc) this.u;
                        y6a.M(obj);
                        R = obj;
                        qocVar.f.j(new poc((Map) R));
                        return Unit.a;
                    }
                    y6a.M(obj);
                    P = obj;
                }
                TeamCareerStatisticsResponse teamCareerStatisticsResponse = (TeamCareerStatisticsResponse) yaa.x((x2g) P);
                if (teamCareerStatisticsResponse != null) {
                    hs4 hs4Var = z45.a;
                    ip1 ip1Var = new ip1(teamCareerStatisticsResponse, r8, 27);
                    this.u = qocVar;
                    this.s = 2;
                    R = xw3.R(hs4Var, ip1Var, this);
                    break;
                }
                return Unit.a;
            case 2:
                MonthWithYear monthWithYear = (MonthWithYear) obj4;
                vpc vpcVar = (vpc) this.u;
                yzc yzcVar4 = vpcVar.f;
                lu3 lu3Var3 = lu3.a;
                int i9 = this.s;
                if (i9 == 0) {
                    y6a.M(obj);
                    int i10 = this.t;
                    this.s = 1;
                    k2 = vpcVar.k(i10, monthWithYear, this);
                    if (k2 == lu3Var3) {
                        return lu3Var3;
                    }
                } else {
                    if (i9 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    k2 = obj;
                }
                List list = (List) k2;
                qpc qpcVar = (qpc) yzcVar4.d();
                LinkedHashMap linkedHashMap = qpcVar != null ? new LinkedHashMap(qpcVar.a) : new LinkedHashMap();
                linkedHashMap.put(rpc.c, list);
                yzcVar4.j(new qpc(linkedHashMap, monthWithYear));
                return Unit.a;
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i11 = this.s;
                if (i11 == 0) {
                    y6a.M(obj);
                    aqc aqcVar = (aqc) obj4;
                    yzcVar = aqcVar.f;
                    w3b w3bVar = aqcVar.e;
                    int i12 = this.t;
                    this.u = yzcVar;
                    this.s = 1;
                    X = w3bVar.X(i12, this);
                    if (X == lu3Var4) {
                        return lu3Var4;
                    }
                } else {
                    if (i11 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    yzc yzcVar5 = (yzc) this.u;
                    y6a.M(obj);
                    yzcVar = yzcVar5;
                    X = obj;
                }
                RankingsSummaryResponse rankingsSummaryResponse = (RankingsSummaryResponse) X;
                yzcVar.j(rankingsSummaryResponse != null ? rankingsSummaryResponse.getRankings() : null);
                return Unit.a;
            case 4:
                lu3 lu3Var5 = lu3.a;
                int i13 = this.s;
                if (i13 == 0) {
                    y6a.M(obj);
                    roe roeVar = (roe) obj4;
                    yzcVar2 = roeVar.m;
                    wve wveVar = roeVar.e;
                    int i14 = this.t;
                    this.u = yzcVar2;
                    this.s = 1;
                    wveVar.getClass();
                    P2 = yaa.P(new ive(wveVar, i14, r8, i4), this);
                    if (P2 == lu3Var5) {
                        return lu3Var5;
                    }
                } else {
                    if (i13 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    yzc yzcVar6 = (yzc) this.u;
                    y6a.M(obj);
                    yzcVar2 = yzcVar6;
                    P2 = obj;
                }
                yzcVar2.j(yaa.x((x2g) P2));
                return Unit.a;
            case 5:
                lu3 lu3Var6 = lu3.a;
                int i15 = this.s;
                if (i15 != 0) {
                    if (i15 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                pxe pxeVar = ((roe) this.u).h;
                int i16 = this.t;
                this.s = 1;
                pxeVar.getClass();
                Object r3 = s9a.r(new jr5((String) obj4, pxeVar, i16, (rq3) null, 11), this);
                return r3 == lu3Var6 ? lu3Var6 : r3;
            case 6:
                lu3 lu3Var7 = lu3.a;
                int i17 = this.s;
                if (i17 != 0) {
                    if (i17 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                c64 c64Var = new c64((fqe) this.u, this.t, (String) obj4, (rq3) null, 14);
                this.s = 1;
                Object P5 = yaa.P(c64Var, this);
                return P5 == lu3Var7 ? lu3Var7 : P5;
            case 7:
                lu3 lu3Var8 = lu3.a;
                int i18 = this.s;
                if (i18 != 0) {
                    if (i18 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                wve wveVar2 = ((qqe) this.u).b;
                int i19 = this.t;
                this.s = 1;
                wveVar2.getClass();
                Object P6 = yaa.P(new lh7((Integer) obj4, wveVar2, i19, 0, (rq3) null, 4), this);
                return P6 == lu3Var8 ? lu3Var8 : P6;
            case 8:
                jsf jsfVar = (jsf) obj4;
                ku3 ku3Var = (ku3) this.u;
                lu3 lu3Var9 = lu3.a;
                int i20 = this.s;
                if (i20 == 0) {
                    y6a.M(obj);
                    av4 t = xw3.t(ku3Var, null, new qu1(jsfVar, this.t, (rq3) r8, 26), 3);
                    if (jsfVar.j && !jsfVar.k) {
                        jsfVar.j = false;
                        referee = (Referee) jsfVar.g.d();
                        if (referee == null) {
                            this.u = null;
                            this.s = 1;
                            w = t.w(this);
                            if (w == lu3Var9) {
                                return lu3Var9;
                            }
                        }
                        if (referee != null) {
                            jsfVar.k = true;
                            jsfVar.h.j(new v2g(new RefereeDetailsHeadFlags(referee)));
                        }
                        jsfVar.j = true;
                    }
                    return Unit.a;
                }
                if (i20 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                w = obj;
                referee = (Referee) w;
                if (referee != null) {
                }
                jsfVar.j = true;
                return Unit.a;
            case 9:
                lu3 lu3Var10 = lu3.a;
                int i21 = this.s;
                if (i21 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (((bxg) this.u).e.b(this.t, (String) obj4, this) == lu3Var10) {
                        return lu3Var10;
                    }
                } else {
                    if (i21 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 10:
                Context context = (Context) obj4;
                lu3 lu3Var11 = lu3.a;
                int i22 = this.s;
                if (i22 == 0) {
                    y6a.M(obj);
                    SofaWidgetReceiver sofaWidgetReceiver = (SofaWidgetReceiver) this.u;
                    int i23 = this.t;
                    this.s = 1;
                    int i24 = SofaWidgetReceiver.e;
                    if (sofaWidgetReceiver.c(context, i23, this) == lu3Var11) {
                        return lu3Var11;
                    }
                } else {
                    if (i22 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                aba.E(context);
                return Unit.a;
            case 11:
                lu3 lu3Var12 = lu3.a;
                int i25 = this.s;
                if (i25 == 0) {
                    y6a.M(obj);
                    q3i q3iVar = (q3i) obj4;
                    yzcVar3 = q3iVar.o;
                    j0j j0jVar2 = q3iVar.f;
                    int i26 = this.t;
                    this.u = yzcVar3;
                    this.s = 1;
                    j0jVar2.getClass();
                    P3 = yaa.P(new azi(j0jVar2, i26, r8, i3), this);
                    if (P3 == lu3Var12) {
                        return lu3Var12;
                    }
                } else {
                    if (i25 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    yzc yzcVar7 = (yzc) this.u;
                    y6a.M(obj);
                    yzcVar3 = yzcVar7;
                    P3 = obj;
                }
                StageSeasonsResponse stageSeasonsResponse = (StageSeasonsResponse) yaa.x((x2g) P3);
                yzcVar3.j(stageSeasonsResponse != null ? stageSeasonsResponse.getStageSeasons() : null);
                return Unit.a;
            case 12:
                lu3 lu3Var13 = lu3.a;
                int i27 = this.s;
                if (i27 == 0) {
                    y6a.M(obj);
                    g4i g4iVar = (g4i) this.u;
                    TvType tvType = TvType.STAGE;
                    this.s = 1;
                    if (g4iVar.e.L(this.t, (Country) obj4, tvType, this) == lu3Var13) {
                        return lu3Var13;
                    }
                } else {
                    if (i27 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 13:
                n4i n4iVar = (n4i) obj4;
                lu3 lu3Var14 = lu3.a;
                int i28 = this.s;
                if (i28 == 0) {
                    y6a.M(obj);
                    s96 s96Var = n4iVar.e;
                    int i29 = this.t;
                    this.s = 1;
                    y = s96Var.y(i29, this);
                    break;
                } else {
                    if (i28 != 1) {
                        if (i28 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        n4iVar = (n4i) this.u;
                        y6a.M(obj);
                        l = obj;
                        Stage stage3 = (Stage) l;
                        if (stage3 == null) {
                            return null;
                        }
                        n4iVar.l.j(stage3);
                        return stage3;
                    }
                    y6a.M(obj);
                    y = obj;
                }
                StageResponse stageResponse = (StageResponse) y;
                if (stageResponse != null && (stage = stageResponse.getStage()) != null) {
                    this.u = n4iVar;
                    this.s = 2;
                    l = n4iVar.l(stage, this);
                    break;
                } else {
                    return null;
                }
            case 14:
                n4i n4iVar2 = (n4i) this.u;
                lu3 lu3Var15 = lu3.a;
                int i30 = this.s;
                if (i30 == 0) {
                    y6a.M(obj);
                    Stage stage4 = n4iVar2.k;
                    if (!Intrinsics.c((stage4 == null || (uniqueStage2 = stage4.getUniqueStage()) == null) ? null : uniqueStage2.getName(), Sports.FORMULA_1)) {
                        Stage stage5 = n4iVar2.k;
                        if (!Intrinsics.c((stage5 == null || (uniqueStage = stage5.getUniqueStage()) == null) ? null : uniqueStage.getName(), "MotoGP")) {
                            num = new Integer(this.t);
                            if (num != null) {
                                s96 s96Var2 = n4iVar2.e;
                                int intValue = num.intValue();
                                this.s = 2;
                                M = s96Var2.M(intValue, this);
                                break;
                            }
                            return Boolean.valueOf(Intrinsics.c(bool, Boolean.TRUE));
                        }
                    }
                    this.s = 1;
                    w2 = ((av4) obj4).w(this);
                    break;
                } else {
                    if (i30 != 1) {
                        if (i30 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        M = obj;
                        bool = (Boolean) M;
                        bool.getClass();
                        return Boolean.valueOf(Intrinsics.c(bool, Boolean.TRUE));
                    }
                    y6a.M(obj);
                    w2 = obj;
                }
                StagesListResponse stagesListResponse = (StagesListResponse) w2;
                if (stagesListResponse == null || (stages = stagesListResponse.getStages()) == null) {
                    stage2 = null;
                } else {
                    Iterator it = stages.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (((Stage) obj2).getType() == ServerType.RACE) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    stage2 = (Stage) obj2;
                }
                num = stage2 != null ? new Integer(stage2.getId()) : null;
                if (num != null) {
                }
                return Boolean.valueOf(Intrinsics.c(bool, Boolean.TRUE));
            case 15:
                StageWorker stageWorker = (StageWorker) obj4;
                lu3 lu3Var16 = lu3.a;
                int i31 = this.s;
                if (i31 == 0) {
                    y6a.M(obj);
                    s96 s96Var3 = stageWorker.c;
                    int i32 = this.t;
                    this.s = 1;
                    O = s96Var3.O(i32, this);
                    break;
                } else {
                    if (i31 != 1) {
                        if (i31 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        List list2 = (List) this.u;
                        y6a.M(obj);
                        return list2;
                    }
                    y6a.M(obj);
                    O = obj;
                }
                RecentStageIdsResponse recentStageIdsResponse = (RecentStageIdsResponse) O;
                if (recentStageIdsResponse == null || (stageIds = recentStageIdsResponse.getStageIds()) == null) {
                    return null;
                }
                int[] R0 = CollectionsKt.R0(stageIds);
                this.u = stageIds;
                this.s = 2;
                if (stageWorker.c(R0, true, false, this) != lu3Var16) {
                    return stageIds;
                }
                return lu3Var16;
            case 16:
                q3j q3jVar2 = (q3j) obj4;
                yzc yzcVar8 = q3jVar2.i;
                lu3 lu3Var17 = lu3.a;
                int i33 = this.s;
                if (i33 == 0) {
                    y6a.M(obj);
                    j0j j0jVar3 = q3jVar2.e;
                    int i34 = this.t;
                    this.u = q3jVar2;
                    this.s = 1;
                    j0jVar3.getClass();
                    P4 = yaa.P(new azi(j0jVar3, i34, r8, 20), this);
                    if (P4 == lu3Var17) {
                        return lu3Var17;
                    }
                    q3jVar = q3jVar2;
                } else {
                    if (i33 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    q3j q3jVar3 = (q3j) this.u;
                    y6a.M(obj);
                    q3jVar = q3jVar3;
                    P4 = obj;
                }
                TeamTransfersResponse teamTransfersResponse2 = (TeamTransfersResponse) yaa.x((x2g) P4);
                if (teamTransfersResponse2 != null) {
                    q3jVar2.h = !teamTransfersResponse2.getTransfersIn().isEmpty();
                    TeamTransfersResponse teamTransfersResponse3 = q3jVar2.g;
                    if (teamTransfersResponse3 != null) {
                        yzcVar8.j(q3jVar2.l(teamTransfersResponse3));
                    } else {
                        q3jVar2.k();
                    }
                    yzcVar8.j(q3jVar2.l(teamTransfersResponse2));
                    q3jVar2.k = null;
                    teamTransfersResponse = teamTransfersResponse2;
                }
                q3jVar.g = teamTransfersResponse;
                return Unit.a;
            case 17:
                klj kljVar = (klj) this.u;
                yzc yzcVar9 = kljVar.f;
                lu3 lu3Var18 = lu3.a;
                int i35 = this.s;
                rq3 rq3Var = null;
                if (i35 == 0) {
                    y6a.M(obj);
                    umd umdVar = kljVar.e;
                    this.s = 1;
                    umdVar.getClass();
                    r = s9a.r(new emd(umdVar, this.t, (String) obj4, rq3Var, 1), this);
                    if (r == lu3Var18) {
                        return lu3Var18;
                    }
                } else {
                    if (i35 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    r = obj;
                }
                x2g x2gVar = (x2g) r;
                if (x2gVar instanceof v2g) {
                    yea yeaVar = j58.a;
                    Country e = dv3.e();
                    List f2 = j58.f(e != null ? e.getIso2Alpha() : null);
                    H2HStreaksResponse h2HStreaksResponse = (H2HStreaksResponse) ((v2g) x2gVar).a;
                    List<Event> events = h2HStreaksResponse.getEvents();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj5 : events) {
                        if (!CollectionsKt.R(f2, ok3.v((Event) obj5))) {
                            arrayList.add(obj5);
                        }
                    }
                    yzcVar9.j(new v2g(H2HStreaksResponse.copy$default(h2HStreaksResponse, arrayList, null, 2, null)));
                } else {
                    yzcVar9.j(x2gVar);
                }
                return Unit.a;
            case 18:
                n0k n0kVar = (n0k) this.u;
                yzc yzcVar10 = n0kVar.f;
                lu3 lu3Var19 = lu3.a;
                int i36 = this.s;
                boolean z2 = false;
                if (i36 == 0) {
                    y6a.M(obj);
                    umd umdVar2 = n0kVar.e;
                    this.s = 1;
                    umdVar2.getClass();
                    r2 = s9a.r(new emd(umdVar2, this.t, (String) obj4, z2 ? 1 : 0, 2), this);
                    if (r2 == lu3Var19) {
                        return lu3Var19;
                    }
                } else {
                    if (i36 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    r2 = obj;
                }
                x2g x2gVar2 = (x2g) r2;
                if (x2gVar2 instanceof v2g) {
                    yea yeaVar2 = j58.a;
                    Country e2 = dv3.e();
                    List f3 = j58.f(e2 != null ? e2.getIso2Alpha() : null);
                    TrendingOddsResponse trendingOddsResponse = (TrendingOddsResponse) ((v2g) x2gVar2).a;
                    List<Event> events2 = trendingOddsResponse.getEvents();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj6 : events2) {
                        if (!CollectionsKt.R(f3, ok3.v((Event) obj6))) {
                            arrayList2.add(obj6);
                        }
                    }
                    yzcVar10.j(new v2g(TrendingOddsResponse.copy$default(trendingOddsResponse, arrayList2, null, null, 6, null)));
                } else {
                    yzcVar10.j(x2gVar2);
                }
                return Unit.a;
            case 19:
                dnk dnkVar = (dnk) obj4;
                ku3 ku3Var2 = (ku3) this.u;
                lu3 lu3Var20 = lu3.a;
                int i37 = this.s;
                if (i37 == 0) {
                    y6a.M(obj);
                    av4 t2 = xw3.t(ku3Var2, null, new zni(dnkVar, this.t, r8, 6), 3);
                    dnkVar.h = false;
                    this.u = null;
                    this.s = 1;
                    w3 = t2.w(this);
                    if (w3 == lu3Var20) {
                        return lu3Var20;
                    }
                } else {
                    if (i37 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    w3 = obj;
                }
                dnkVar.f.k((VenueResponse) w3);
                return Unit.a;
            case 20:
                lu3 lu3Var21 = lu3.a;
                int i38 = this.s;
                if (i38 == 0) {
                    y6a.M(obj);
                    onk onkVar = (onk) obj4;
                    yzc yzcVar11 = onkVar.h;
                    unk unkVar = onkVar.e;
                    int i39 = this.t;
                    this.u = yzcVar11;
                    this.s = 1;
                    d = unkVar.d(i39, this);
                    r22 = yzcVar11;
                    if (d == lu3Var21) {
                        return lu3Var21;
                    }
                } else {
                    if (i38 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    yzc yzcVar12 = (yzc) this.u;
                    y6a.M(obj);
                    r22 = yzcVar12;
                    d = obj;
                }
                List list3 = (List) d;
                if (list3 != null) {
                    r82 = new ArrayList(k13.r(list3, 10));
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        r82.add(((VenueSport) it2.next()).getSport().getSportSlug());
                    }
                }
                if (r82 == 0) {
                    r82 = km5.a;
                }
                r22.j(r82);
                return Unit.a;
            case 21:
                int i40 = this.t;
                lu3 lu3Var22 = lu3.a;
                int i41 = this.s;
                if (i41 == 0) {
                    y6a.M(obj);
                    num2 = new Integer(i40);
                    this.u = num2;
                    this.s = 1;
                    Context context2 = ((tll) obj4).a;
                    int s = ao2.s(48, context2);
                    u = inb.g.u(context2, pco.R(i40), aba.g(s, s), Bitmap.Config.ARGB_8888, this);
                    if (u == lu3Var22) {
                        return lu3Var22;
                    }
                } else {
                    if (i41 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Integer num3 = (Integer) this.u;
                    y6a.M(obj);
                    num2 = num3;
                    u = obj;
                }
                return new Pair(num2, u);
            default:
                h hVar = (h) this.u;
                lu3 lu3Var23 = lu3.a;
                int i42 = this.t;
                if (i42 != 0) {
                    if (i42 != 1) {
                        if (i42 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i = this.s;
                        y6a.M(obj);
                        i++;
                        if (i < 5) {
                            return Unit.a;
                        }
                        boolean b = h.b(f1.e(null));
                        MolocoLogger.info$default(MolocoLogger.INSTANCE, "NonPersistentRequest", bf3.l("Network available: ", " for non persistent request", b), null, false, 12, null);
                        if (b) {
                            this.s = i;
                            this.t = 1;
                            obj3 = f1.i(hVar.a, (String) obj4, this);
                            break;
                        } else {
                            z = false;
                            if (!z) {
                                return Unit.a;
                            }
                            this.s = i;
                            this.t = 2;
                            break;
                        }
                    } else {
                        i = this.s;
                        y6a.M(obj);
                        obj3 = obj;
                        z = ((Boolean) obj3).booleanValue();
                        if (!z) {
                        }
                    }
                } else {
                    y6a.M(obj);
                    i = 0;
                    if (i < 5) {
                    }
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ anc(ltk ltkVar, int i, Serializable serializable, rq3 rq3Var, int i2) {
        super(2, rq3Var);
        this.r = i2;
        this.u = ltkVar;
        this.t = i;
        this.v = serializable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anc(h hVar, String str, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 22;
        this.u = hVar;
        this.v = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ anc(Object obj, int i, rq3 rq3Var, int i2) {
        super(2, rq3Var);
        this.r = i2;
        this.v = obj;
        this.t = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ anc(Object obj, Object obj2, int i, rq3 rq3Var, int i2) {
        super(2, rq3Var);
        this.r = i2;
        this.u = obj;
        this.v = obj2;
        this.t = i;
    }
}
