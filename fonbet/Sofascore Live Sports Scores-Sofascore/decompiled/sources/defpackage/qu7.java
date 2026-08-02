package defpackage;

import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.OffersBanner;
import com.sofascore.model.mvvm.model.OffersBannerResponse;
import com.sofascore.model.mvvm.model.SubTeam;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.EventListResponse;
import com.sofascore.model.newNetwork.RecentTeamTournamentsResponse;
import com.sofascore.model.newNetwork.TeamAchievementsResponse;
import com.sofascore.model.newNetwork.TeamStreakBettingOddsResponse;
import com.sofascore.model.newNetwork.TeamTransfersResponse;
import com.sofascore.model.newNetwork.TeamUniqueTournamentsResponse;
import com.sofascore.model.newNetwork.TennisGrandSlamPerformance;
import com.sofascore.model.newNetwork.TennisGrandSlamPerformanceResponse;
import com.sofascore.model.newNetwork.TennisGrandSlamResult;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.model.odds.ProviderOdds;
import com.sofascore.results.R;
import com.sofascore.results.event.odds.model.OddsEventUIModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class qu7 extends hoi implements Function2 {
    public Object A;
    public Object B;
    public Object C;
    public Object D;
    public Object E;
    public Object F;
    public Object G;
    public Object H;
    public Object I;
    public Object J;
    public Object K;
    public Object L;
    public Object M;
    public Object N;
    public final /* synthetic */ int r = 1;
    public av4 s;
    public Event t;
    public Object u;
    public Object v;
    public int w;
    public int x;
    public /* synthetic */ Object y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qu7(tu7 tu7Var, Event event, rq3 rq3Var) {
        super(2, rq3Var);
        this.I = tu7Var;
        this.J = event;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                qu7 qu7Var = new qu7((tu7) this.I, (Event) this.J, rq3Var);
                qu7Var.y = obj;
                return qu7Var;
            default:
                qu7 qu7Var2 = new qu7((pvi) this.N, this.z, rq3Var);
                qu7Var2.y = obj;
                return qu7Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((qu7) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:426:0x0cb3, code lost:
    
        if (r1.isEmpty() == false) goto L393;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0a7f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0a85  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x057b  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0f73  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0f94  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0fb3  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0f91  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0f16  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0cdc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0a75  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0de7  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0ee7  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0dd2  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0caf  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0cc7  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0f1e  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x0cb8  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x0c54  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x073f  */
    /* JADX WARN: Type inference failed for: r12v23, types: [f1d] */
    /* JADX WARN: Type inference failed for: r12v32, types: [zu4] */
    /* JADX WARN: Type inference failed for: r12v36, types: [zu4] */
    /* JADX WARN: Type inference failed for: r12v70 */
    /* JADX WARN: Type inference failed for: r12v71 */
    /* JADX WARN: Type inference failed for: r12v72, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r12v74, types: [km5] */
    /* JADX WARN: Type inference failed for: r12v75, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v55, types: [zu4] */
    /* JADX WARN: Type inference failed for: r5v39, types: [zu4] */
    /* JADX WARN: Type inference failed for: r6v57, types: [zu4] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [av4, java.lang.Object, xmd] */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r8v50, types: [zu4] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:369:0x0e0e -> B:349:0x0e36). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:372:0x0eab -> B:347:0x0b34). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:375:0x0ee7 -> B:351:0x0efc). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ?? r7;
        boolean z;
        av4 p;
        Object w;
        vnb vnbVar;
        OddsCountryProvider oddsCountryProvider;
        Object value;
        lu3 lu3Var;
        ProviderOdds providerOdds;
        ProviderOdds providerOdds2;
        Object T;
        OddsCountryProvider oddsCountryProvider2;
        ProviderOdds providerOdds3;
        vnb vnbVar2;
        Object value2;
        gv9 gv9Var;
        gv9 gv9Var2;
        xmd xmdVar;
        Object k;
        ProviderOdds providerOdds4;
        OddsCountryProvider oddsCountryProvider3;
        OddsEventUIModel oddsEventUIModel;
        gv9 gv9Var3;
        gv9 gv9Var4;
        ProviderOdds providerOdds5;
        ProviderOdds providerOdds6;
        vnb vnbVar3;
        int i;
        gv9 gv9Var5;
        gv9 gv9Var6;
        ProviderOdds providerOdds7;
        fdi fdiVar;
        tu7 tu7Var;
        OddsCountryProvider oddsCountryProvider4;
        int i2;
        Event event;
        OddsEventUIModel oddsEventUIModel2;
        OddsCountryProvider oddsCountryProvider5;
        gv9 gv9Var7;
        Object obj2;
        lu3 lu3Var2;
        unb unbVar;
        n2j n2jVar;
        int i3;
        Object obj3;
        vnb vnbVar4;
        ProviderOdds providerOdds8;
        Object obj4;
        xmd xmdVar2;
        n2j n2jVar2;
        unb unbVar2;
        int i4;
        b98 b98Var;
        tu7 tu7Var2;
        ProviderOdds providerOdds9;
        Event event2;
        Object obj5;
        unb unbVar3;
        int i5;
        OddsCountryProvider oddsCountryProvider6;
        gv9 gv9Var8;
        int i6;
        lu3 lu3Var3;
        gv9 gv9Var9;
        tld tldVar;
        Object value3;
        av4 t;
        av4 t2;
        Object w2;
        lu3 lu3Var4;
        zu4 zu4Var;
        av4 av4Var;
        av4 av4Var2;
        zu4 zu4Var2;
        av4 av4Var3;
        zu4 zu4Var3;
        Event event3;
        Object T2;
        zu4 zu4Var4;
        zu4 zu4Var5;
        av4 av4Var4;
        yzc yzcVar;
        zu4 zu4Var6;
        zu4 zu4Var7;
        Object T3;
        zu4 zu4Var8;
        zu4 zu4Var9;
        zu4 zu4Var10;
        zu4 zu4Var11;
        zu4 zu4Var12;
        zu4 zu4Var13;
        TeamUniqueTournamentsResponse teamUniqueTournamentsResponse;
        Object T4;
        TeamUniqueTournamentsResponse teamUniqueTournamentsResponse2;
        zu4 zu4Var14;
        yzc yzcVar2;
        Event event4;
        zu4 zu4Var15;
        List list;
        Object T5;
        zu4 zu4Var16;
        RecentTeamTournamentsResponse recentTeamTournamentsResponse;
        zu4 zu4Var17;
        xyi xyiVar;
        Object T6;
        RecentTeamTournamentsResponse recentTeamTournamentsResponse2;
        TeamTransfersResponse teamTransfersResponse;
        zu4 zu4Var18;
        yzc yzcVar3;
        Event event5;
        TeamUniqueTournamentsResponse teamUniqueTournamentsResponse3;
        List list2;
        List<Event> events;
        ArrayList arrayList;
        Iterator it;
        pvi pviVar;
        gv9 W;
        Object T7;
        Event event6;
        zu4 zu4Var19;
        yzc yzcVar4;
        pvi pviVar2;
        Integer num;
        lu3 lu3Var5;
        int i7;
        String str;
        String str2;
        String valueOf;
        pvi pviVar3;
        Object T8;
        gv9 gv9Var10;
        Event event7;
        TeamUniqueTournamentsResponse teamUniqueTournamentsResponse4;
        RecentTeamTournamentsResponse recentTeamTournamentsResponse3;
        zu4 zu4Var20;
        List list3;
        TeamTransfersResponse teamTransfersResponse2;
        TeamAchievementsResponse teamAchievementsResponse;
        TennisGrandSlamPerformanceResponse tennisGrandSlamPerformanceResponse;
        TeamAchievementsResponse teamAchievementsResponse2;
        gv9 gv9Var11;
        TeamTransfersResponse teamTransfersResponse3;
        RecentTeamTournamentsResponse recentTeamTournamentsResponse4;
        List list4;
        TeamUniqueTournamentsResponse teamUniqueTournamentsResponse5;
        lu3 lu3Var6;
        zu4 zu4Var21;
        y5j y5jVar;
        List<OffersBanner> list5;
        gv9 gv9Var12;
        TeamAchievementsResponse teamAchievementsResponse3;
        Object T9;
        y5j y5jVar2;
        TeamUniqueTournamentsResponse teamUniqueTournamentsResponse6;
        TeamTransfersResponse teamTransfersResponse4;
        List list6;
        RecentTeamTournamentsResponse recentTeamTournamentsResponse5;
        Event event8;
        List<TennisGrandSlamPerformance> results;
        ?? r12;
        int i8;
        r9k m9kVar;
        Iterator it2;
        String str3;
        TeamUniqueTournamentsResponse teamUniqueTournamentsResponse7;
        Boolean bool;
        n1k n1kVar;
        n1k n1kVar2;
        List<TennisGrandSlamResult> years;
        switch (this.r) {
            case 0:
                Event event9 = (Event) this.J;
                tu7 tu7Var3 = (tu7) this.I;
                amd amdVar = tu7Var3.f;
                fdi fdiVar2 = tu7Var3.k;
                ku3 ku3Var = (ku3) this.y;
                lu3 lu3Var7 = lu3.a;
                int i9 = this.z;
                if (i9 != 0) {
                    if (i9 != 1) {
                        if (i9 != 2) {
                            if (i9 != 3) {
                                if (i9 != 4) {
                                    if (i9 == 5) {
                                        OddsEventUIModel oddsEventUIModel3 = (OddsEventUIModel) this.u;
                                        gv9Var3 = (gv9) this.F;
                                        providerOdds2 = (ProviderOdds) this.E;
                                        providerOdds4 = (ProviderOdds) this.D;
                                        OddsCountryProvider oddsCountryProvider7 = (OddsCountryProvider) this.B;
                                        y6a.M(obj);
                                        oddsCountryProvider3 = oddsCountryProvider7;
                                        oddsEventUIModel = oddsEventUIModel3;
                                        xmdVar = null;
                                        k = obj;
                                        tldVar = (tld) k;
                                        do {
                                            value3 = fdiVar2.getValue();
                                        } while (!fdiVar2.k(value3, new unb(new n2j(providerOdds4 == null ? new xmd(gv9Var3 == null ? l6g.K(r4a.B(tu7Var3.i(), oddsCountryProvider3, providerOdds4)) : gv9Var3, oddsCountryProvider3, oddsEventUIModel, tldVar, 8) : xmdVar, providerOdds2 == null ? new xmd(gv9Var3 == null ? l6g.K(r4a.B(tu7Var3.i(), oddsCountryProvider3, providerOdds2)) : rlh.b, oddsCountryProvider3, oddsEventUIModel, tldVar, 8) : xmdVar, Intrinsics.c(oddsCountryProvider3.getOddsMayDiffer(), Boolean.TRUE)))));
                                        break;
                                    } else {
                                        a70.r("call to 'resume' before 'invoke' with coroutine");
                                        break;
                                    }
                                } else {
                                    int i10 = this.w;
                                    xmd xmdVar3 = (xmd) this.N;
                                    gv9 gv9Var13 = (gv9) this.G;
                                    OddsCountryProvider oddsCountryProvider8 = (OddsCountryProvider) this.C;
                                    OddsEventUIModel oddsEventUIModel4 = (OddsEventUIModel) this.M;
                                    unb unbVar4 = (unb) this.L;
                                    n2j n2jVar3 = (n2j) this.K;
                                    Object obj6 = this.v;
                                    Event event10 = this.t;
                                    tu7 tu7Var4 = (tu7) this.H;
                                    b98 b98Var2 = (f1d) this.u;
                                    gv9 gv9Var14 = (gv9) this.F;
                                    ProviderOdds providerOdds10 = (ProviderOdds) this.E;
                                    providerOdds9 = (ProviderOdds) this.D;
                                    int i11 = i10;
                                    OddsCountryProvider oddsCountryProvider9 = (OddsCountryProvider) this.B;
                                    vnb vnbVar5 = (vnb) this.A;
                                    y6a.M(obj);
                                    xmd xmdVar4 = xmdVar3;
                                    tu7 tu7Var5 = tu7Var4;
                                    b98 b98Var3 = b98Var2;
                                    gv9 gv9Var15 = gv9Var14;
                                    vnbVar4 = vnbVar5;
                                    providerOdds6 = providerOdds10;
                                    Object obj7 = obj6;
                                    Event event11 = event10;
                                    OddsCountryProvider oddsCountryProvider10 = oddsCountryProvider8;
                                    OddsEventUIModel oddsEventUIModel5 = oddsEventUIModel4;
                                    unb unbVar5 = unbVar4;
                                    n2j n2jVar4 = n2jVar3;
                                    lu3Var = lu3Var7;
                                    gv9 gv9Var16 = gv9Var13;
                                    Object k2 = obj;
                                    ProviderOdds providerOdds11 = providerOdds9;
                                    xmd a = new xmd(gv9Var16, oddsCountryProvider10, oddsEventUIModel5, (tld) k2, 8);
                                    n2jVar2 = n2jVar4;
                                    obj5 = obj7;
                                    event2 = event11;
                                    providerOdds9 = providerOdds11;
                                    i6 = i11;
                                    tu7Var2 = tu7Var5;
                                    b98Var = b98Var3;
                                    unb unbVar6 = unbVar5;
                                    oddsCountryProvider6 = oddsCountryProvider9;
                                    event9 = event2;
                                    n2j n2jVar5 = n2jVar2;
                                    Object obj8 = obj5;
                                    xmd xmdVar5 = xmdVar4;
                                    xmd xmdVar6 = a;
                                    OddsCountryProvider oddsCountryProvider11 = oddsCountryProvider6;
                                    tu7Var3 = tu7Var2;
                                    gv9Var4 = gv9Var15;
                                    n2j n2jVar6 = new n2j(xmdVar5, xmdVar6, n2jVar5.c);
                                    unbVar6.getClass();
                                    fdiVar2 = (fdi) b98Var;
                                    if (!fdiVar2.k(obj8, new unb(n2jVar6))) {
                                        vnbVar3 = vnbVar4;
                                        i = i6;
                                        lu3Var7 = lu3Var;
                                        oddsCountryProvider2 = oddsCountryProvider11;
                                        providerOdds5 = providerOdds9;
                                        obj2 = fdiVar2.getValue();
                                        unb unbVar7 = (unb) vnbVar3;
                                        n2jVar2 = (n2j) unbVar7.a;
                                        if (providerOdds5 == null) {
                                            i4 = i;
                                            lu3Var2 = lu3Var7;
                                            vnbVar4 = vnbVar3;
                                            gv9Var8 = gv9Var4;
                                            providerOdds9 = providerOdds5;
                                            tu7Var2 = tu7Var3;
                                            oddsCountryProvider6 = oddsCountryProvider2;
                                            b98Var = fdiVar2;
                                            unbVar3 = unbVar7;
                                            event2 = event9;
                                            obj5 = obj2;
                                            i5 = 0;
                                            xmdVar2 = null;
                                            i6 = i4;
                                            if (providerOdds6 != null) {
                                                if (gv9Var8 == null) {
                                                    lu3Var3 = lu3Var2;
                                                    gv9Var9 = l6g.K(r4a.B(tu7Var2.i(), oddsCountryProvider6, providerOdds6));
                                                } else {
                                                    lu3Var3 = lu3Var2;
                                                    gv9Var9 = rlh.b;
                                                }
                                                int i12 = i5;
                                                xmd xmdVar7 = ((n2j) ((unb) vnbVar4).a).b;
                                                if (xmdVar7 == null) {
                                                    unb unbVar8 = unbVar3;
                                                    xmdVar4 = xmdVar2;
                                                    event2.getClass();
                                                    OddsEventUIModel oddsEventUIModel6 = new OddsEventUIModel(event2.getId(), o3a.F(event2.getTournament()), event2.getStatusType(), ok3.s(event2), event2.shouldReverseTeams());
                                                    int id = event2.getId();
                                                    boolean E = ok3.E(event2);
                                                    this.y = null;
                                                    this.A = vnbVar4;
                                                    this.B = oddsCountryProvider6;
                                                    this.s = null;
                                                    this.D = providerOdds9;
                                                    this.E = providerOdds6;
                                                    this.F = gv9Var8;
                                                    this.u = b98Var;
                                                    this.H = tu7Var2;
                                                    this.t = event2;
                                                    this.v = obj5;
                                                    this.K = n2jVar2;
                                                    this.L = unbVar8;
                                                    this.M = oddsEventUIModel6;
                                                    this.C = oddsCountryProvider6;
                                                    this.G = gv9Var9;
                                                    gv9 gv9Var17 = gv9Var8;
                                                    this.N = xmdVar4;
                                                    this.w = i6;
                                                    this.x = i12;
                                                    this.z = 4;
                                                    k2 = tu7Var2.k(oddsCountryProvider6, id, E, this);
                                                    lu3Var = lu3Var3;
                                                    if (k2 != lu3Var) {
                                                        n2j n2jVar7 = n2jVar2;
                                                        oddsEventUIModel5 = oddsEventUIModel6;
                                                        n2jVar4 = n2jVar7;
                                                        gv9Var15 = gv9Var17;
                                                        oddsCountryProvider9 = oddsCountryProvider6;
                                                        b98Var3 = b98Var;
                                                        i11 = i6;
                                                        unbVar5 = unbVar8;
                                                        event11 = event2;
                                                        tu7Var5 = tu7Var2;
                                                        gv9Var16 = gv9Var9;
                                                        obj7 = obj5;
                                                        oddsCountryProvider10 = oddsCountryProvider9;
                                                        ProviderOdds providerOdds112 = providerOdds9;
                                                        xmd a2 = new xmd(gv9Var16, oddsCountryProvider10, oddsEventUIModel5, (tld) k2, 8);
                                                        n2jVar2 = n2jVar4;
                                                        obj5 = obj7;
                                                        event2 = event11;
                                                        providerOdds9 = providerOdds112;
                                                        i6 = i11;
                                                        tu7Var2 = tu7Var5;
                                                        b98Var = b98Var3;
                                                        unb unbVar62 = unbVar5;
                                                        oddsCountryProvider6 = oddsCountryProvider9;
                                                        event9 = event2;
                                                        n2j n2jVar52 = n2jVar2;
                                                        Object obj82 = obj5;
                                                        xmd xmdVar52 = xmdVar4;
                                                        xmd xmdVar62 = a2;
                                                        OddsCountryProvider oddsCountryProvider112 = oddsCountryProvider6;
                                                        tu7Var3 = tu7Var2;
                                                        gv9Var4 = gv9Var15;
                                                        n2j n2jVar62 = new n2j(xmdVar52, xmdVar62, n2jVar52.c);
                                                        unbVar62.getClass();
                                                        fdiVar2 = (fdi) b98Var;
                                                        if (!fdiVar2.k(obj82, new unb(n2jVar62))) {
                                                        }
                                                    }
                                                    break;
                                                } else {
                                                    String statusType = event2.getStatusType();
                                                    xmdVar7.getClass();
                                                    gv9Var9.getClass();
                                                    statusType.getClass();
                                                    xmdVar4 = xmdVar2;
                                                    unbVar62 = unbVar3;
                                                    gv9Var15 = gv9Var8;
                                                    a2 = xmd.a(xmdVar7, gv9Var9, OddsEventUIModel.a(xmdVar7.c, statusType), false, 26);
                                                    lu3Var = lu3Var3;
                                                    i6 = i6;
                                                    event9 = event2;
                                                    n2j n2jVar522 = n2jVar2;
                                                    Object obj822 = obj5;
                                                    xmd xmdVar522 = xmdVar4;
                                                    xmd xmdVar622 = a2;
                                                    OddsCountryProvider oddsCountryProvider1122 = oddsCountryProvider6;
                                                    tu7Var3 = tu7Var2;
                                                    gv9Var4 = gv9Var15;
                                                    n2j n2jVar622 = new n2j(xmdVar522, xmdVar622, n2jVar522.c);
                                                    unbVar62.getClass();
                                                    fdiVar2 = (fdi) b98Var;
                                                    if (!fdiVar2.k(obj822, new unb(n2jVar622))) {
                                                    }
                                                }
                                            } else {
                                                xmd xmdVar8 = xmdVar2;
                                                unb unbVar9 = unbVar3;
                                                lu3Var = lu3Var2;
                                                oddsCountryProvider1122 = oddsCountryProvider6;
                                                unbVar62 = unbVar9;
                                                event9 = event2;
                                                tu7Var3 = tu7Var2;
                                                xmdVar622 = null;
                                                gv9Var4 = gv9Var8;
                                                n2jVar522 = n2jVar2;
                                                obj822 = obj5;
                                                xmdVar522 = xmdVar8;
                                                n2j n2jVar6222 = new n2j(xmdVar522, xmdVar622, n2jVar522.c);
                                                unbVar62.getClass();
                                                fdiVar2 = (fdi) b98Var;
                                                if (!fdiVar2.k(obj822, new unb(n2jVar6222))) {
                                                }
                                            }
                                        } else {
                                            gv9 K = gv9Var4 == null ? l6g.K(r4a.B(tu7Var3.i(), oddsCountryProvider2, providerOdds5)) : gv9Var4;
                                            xmd xmdVar9 = ((n2j) unbVar7.a).a;
                                            if (xmdVar9 != null) {
                                                lu3 lu3Var8 = lu3Var7;
                                                String statusType2 = event9.getStatusType();
                                                xmdVar9.getClass();
                                                K.getClass();
                                                statusType2.getClass();
                                                i4 = i;
                                                xmd a3 = xmd.a(xmdVar9, K, OddsEventUIModel.a(xmdVar9.c, statusType2), false, 26);
                                                unbVar2 = unbVar7;
                                                providerOdds8 = providerOdds6;
                                                lu3Var2 = lu3Var8;
                                                i2 = 0;
                                                obj4 = obj2;
                                                xmdVar2 = a3;
                                                vnbVar4 = vnbVar3;
                                                event2 = event9;
                                                gv9Var8 = gv9Var4;
                                                providerOdds9 = providerOdds5;
                                                i5 = i2;
                                                tu7Var2 = tu7Var3;
                                                oddsCountryProvider6 = oddsCountryProvider2;
                                                b98Var = fdiVar2;
                                                obj5 = obj4;
                                                providerOdds6 = providerOdds8;
                                                unbVar3 = unbVar2;
                                                i6 = i4;
                                                if (providerOdds6 != null) {
                                                }
                                            } else {
                                                int i13 = i;
                                                event9.getClass();
                                                OddsEventUIModel oddsEventUIModel7 = new OddsEventUIModel(event9.getId(), o3a.F(event9.getTournament()), event9.getStatusType(), ok3.s(event9), event9.shouldReverseTeams());
                                                int id2 = event9.getId();
                                                boolean E2 = ok3.E(event9);
                                                this.y = null;
                                                this.A = vnbVar3;
                                                this.B = oddsCountryProvider2;
                                                this.s = null;
                                                this.D = providerOdds5;
                                                this.E = providerOdds6;
                                                this.F = gv9Var4;
                                                this.u = fdiVar2;
                                                this.H = tu7Var3;
                                                this.t = event9;
                                                this.v = obj2;
                                                this.K = n2jVar2;
                                                this.L = unbVar7;
                                                this.M = oddsEventUIModel7;
                                                this.C = oddsCountryProvider2;
                                                this.G = K;
                                                vnb vnbVar6 = vnbVar3;
                                                this.N = null;
                                                this.w = i13;
                                                this.x = 0;
                                                this.z = 3;
                                                obj3 = tu7Var3.k(oddsCountryProvider2, id2, E2, this);
                                                lu3Var2 = lu3Var7;
                                                if (obj3 == lu3Var2) {
                                                    lu3Var = lu3Var2;
                                                } else {
                                                    tu7Var = tu7Var3;
                                                    fdiVar = fdiVar2;
                                                    gv9Var7 = K;
                                                    providerOdds7 = providerOdds5;
                                                    i3 = i13;
                                                    i2 = 0;
                                                    event = event9;
                                                    oddsCountryProvider4 = oddsCountryProvider2;
                                                    n2jVar = n2jVar2;
                                                    oddsCountryProvider5 = oddsCountryProvider4;
                                                    unbVar = unbVar7;
                                                    oddsEventUIModel2 = oddsEventUIModel7;
                                                    vnbVar4 = vnbVar6;
                                                    gv9 gv9Var18 = gv9Var4;
                                                    providerOdds8 = providerOdds6;
                                                    obj4 = obj2;
                                                    xmdVar2 = new xmd(gv9Var7, oddsCountryProvider5, oddsEventUIModel2, (tld) obj3, 8);
                                                    n2jVar2 = n2jVar;
                                                    unbVar2 = unbVar;
                                                    event9 = event;
                                                    oddsCountryProvider2 = oddsCountryProvider4;
                                                    fdiVar2 = fdiVar;
                                                    gv9Var4 = gv9Var18;
                                                    providerOdds5 = providerOdds7;
                                                    i4 = i3;
                                                    tu7Var3 = tu7Var;
                                                    event2 = event9;
                                                    gv9Var8 = gv9Var4;
                                                    providerOdds9 = providerOdds5;
                                                    i5 = i2;
                                                    tu7Var2 = tu7Var3;
                                                    oddsCountryProvider6 = oddsCountryProvider2;
                                                    b98Var = fdiVar2;
                                                    obj5 = obj4;
                                                    providerOdds6 = providerOdds8;
                                                    unbVar3 = unbVar2;
                                                    i6 = i4;
                                                    if (providerOdds6 != null) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                int i14 = this.x;
                                int i15 = this.w;
                                gv9 gv9Var19 = (gv9) this.G;
                                OddsCountryProvider oddsCountryProvider12 = (OddsCountryProvider) this.C;
                                OddsEventUIModel oddsEventUIModel8 = (OddsEventUIModel) this.M;
                                unbVar = (unb) this.L;
                                n2j n2jVar8 = (n2j) this.K;
                                obj2 = this.v;
                                Event event12 = this.t;
                                tu7 tu7Var6 = (tu7) this.H;
                                ?? r122 = (f1d) this.u;
                                gv9Var4 = (gv9) this.F;
                                providerOdds6 = (ProviderOdds) this.E;
                                ProviderOdds providerOdds12 = (ProviderOdds) this.D;
                                i2 = i14;
                                oddsCountryProvider4 = (OddsCountryProvider) this.B;
                                vnb vnbVar7 = (vnb) this.A;
                                y6a.M(obj);
                                oddsEventUIModel2 = oddsEventUIModel8;
                                n2jVar = n2jVar8;
                                lu3Var2 = lu3Var7;
                                tu7Var = tu7Var6;
                                fdiVar = r122;
                                providerOdds7 = providerOdds12;
                                oddsCountryProvider5 = oddsCountryProvider12;
                                event = event12;
                                i3 = i15;
                                gv9Var7 = gv9Var19;
                                obj3 = obj;
                                vnbVar4 = vnbVar7;
                                gv9 gv9Var182 = gv9Var4;
                                providerOdds8 = providerOdds6;
                                obj4 = obj2;
                                xmdVar2 = new xmd(gv9Var7, oddsCountryProvider5, oddsEventUIModel2, (tld) obj3, 8);
                                n2jVar2 = n2jVar;
                                unbVar2 = unbVar;
                                event9 = event;
                                oddsCountryProvider2 = oddsCountryProvider4;
                                fdiVar2 = fdiVar;
                                gv9Var4 = gv9Var182;
                                providerOdds5 = providerOdds7;
                                i4 = i3;
                                tu7Var3 = tu7Var;
                                event2 = event9;
                                gv9Var8 = gv9Var4;
                                providerOdds9 = providerOdds5;
                                i5 = i2;
                                tu7Var2 = tu7Var3;
                                oddsCountryProvider6 = oddsCountryProvider2;
                                b98Var = fdiVar2;
                                obj5 = obj4;
                                providerOdds6 = providerOdds8;
                                unbVar3 = unbVar2;
                                i6 = i4;
                                if (providerOdds6 != null) {
                                }
                            }
                        } else {
                            ProviderOdds providerOdds13 = (ProviderOdds) this.E;
                            providerOdds3 = (ProviderOdds) this.D;
                            OddsCountryProvider oddsCountryProvider13 = (OddsCountryProvider) this.B;
                            vnb vnbVar8 = (vnb) this.A;
                            y6a.M(obj);
                            vnbVar2 = vnbVar8;
                            gv9Var6 = null;
                            oddsCountryProvider2 = oddsCountryProvider13;
                            providerOdds2 = providerOdds13;
                            T = obj;
                            gv9Var2 = (gv9) T;
                            if (gv9Var2 == null) {
                                gv9Var5 = gv9Var6;
                                break;
                            } else {
                                vnb vnbVar9 = vnbVar2;
                                providerOdds = providerOdds3;
                                oddsCountryProvider = oddsCountryProvider2;
                                vnbVar = vnbVar9;
                                gv9Var = gv9Var6;
                                vnb vnbVar10 = vnbVar;
                                oddsCountryProvider2 = oddsCountryProvider;
                                providerOdds3 = providerOdds;
                                vnbVar2 = vnbVar10;
                                gv9Var5 = gv9Var;
                                gv9Var2 = gv9Var5;
                                if (vnbVar2 instanceof unb) {
                                    OddsCountryProvider oddsCountryProvider14 = oddsCountryProvider2;
                                    lu3Var = lu3Var7;
                                    OddsEventUIModel oddsEventUIModel9 = new OddsEventUIModel(event9.getId(), o3a.F(event9.getTournament()), event9.getStatusType(), ok3.s(event9), event9.shouldReverseTeams());
                                    int id3 = event9.getId();
                                    boolean E3 = ok3.E(event9);
                                    xmdVar = null;
                                    this.y = null;
                                    this.A = null;
                                    this.B = oddsCountryProvider14;
                                    this.s = null;
                                    this.D = providerOdds3;
                                    this.E = providerOdds2;
                                    this.F = gv9Var2;
                                    this.u = oddsEventUIModel9;
                                    this.z = 5;
                                    k = tu7Var3.k(oddsCountryProvider14, id3, E3, this);
                                    if (k != lu3Var) {
                                        providerOdds4 = providerOdds3;
                                        oddsCountryProvider3 = oddsCountryProvider14;
                                        oddsEventUIModel = oddsEventUIModel9;
                                        gv9Var3 = gv9Var2;
                                        tldVar = (tld) k;
                                        do {
                                            value3 = fdiVar2.getValue();
                                            if (providerOdds4 == null) {
                                            }
                                            if (providerOdds2 == null) {
                                            }
                                        } while (!fdiVar2.k(value3, new unb(new n2j(providerOdds4 == null ? new xmd(gv9Var3 == null ? l6g.K(r4a.B(tu7Var3.i(), oddsCountryProvider3, providerOdds4)) : gv9Var3, oddsCountryProvider3, oddsEventUIModel, tldVar, 8) : xmdVar, providerOdds2 == null ? new xmd(gv9Var3 == null ? l6g.K(r4a.B(tu7Var3.i(), oddsCountryProvider3, providerOdds2)) : rlh.b, oddsCountryProvider3, oddsEventUIModel, tldVar, 8) : xmdVar, Intrinsics.c(oddsCountryProvider3.getOddsMayDiffer(), Boolean.TRUE)))));
                                    }
                                } else {
                                    gv9Var4 = gv9Var2;
                                    providerOdds5 = providerOdds3;
                                    providerOdds6 = providerOdds2;
                                    vnbVar3 = vnbVar2;
                                    i = 0;
                                    obj2 = fdiVar2.getValue();
                                    unb unbVar72 = (unb) vnbVar3;
                                    n2jVar2 = (n2j) unbVar72.a;
                                    if (providerOdds5 == null) {
                                    }
                                }
                            }
                        }
                    } else {
                        p = this.s;
                        oddsCountryProvider = (OddsCountryProvider) this.B;
                        vnb vnbVar11 = (vnb) this.A;
                        y6a.M(obj);
                        vnbVar = vnbVar11;
                        r7 = 0;
                        w = obj;
                    }
                } else {
                    y6a.M(obj);
                    vnb vnbVar12 = (vnb) fdiVar2.getValue();
                    List list7 = tu7Var3.p;
                    if (list7 == null && (list7 = amdVar.a(o3a.F(event9.getTournament()))) == null) {
                        list7 = amdVar.c();
                    }
                    tu7Var3.p = list7;
                    OddsCountryProvider oddsCountryProvider15 = list7 != null ? (OddsCountryProvider) CollectionsKt.firstOrNull(list7) : null;
                    if (oddsCountryProvider15 == null) {
                        do {
                            value = fdiVar2.getValue();
                        } while (!fdiVar2.k(value, new snb()));
                    } else {
                        r7 = 0;
                        av4 t3 = xw3.t(ku3Var, null, new ou7(tu7Var3, event9, oddsCountryProvider15, null, 1), 3);
                        List b = xld.b(tu7Var3.i());
                        if (!b.isEmpty()) {
                            Iterator it3 = b.iterator();
                            while (it3.hasNext()) {
                                if (((OddsCountryProvider) it3.next()).getGroup() != null) {
                                    z = true;
                                    p = yaa.p(ku3Var, z, new nu7(tu7Var3, event9, null, 1));
                                    this.y = null;
                                    this.A = vnbVar12;
                                    this.B = oddsCountryProvider15;
                                    this.s = p;
                                    this.z = 1;
                                    w = t3.w(this);
                                    if (w != lu3Var7) {
                                        OddsCountryProvider oddsCountryProvider16 = oddsCountryProvider15;
                                        vnbVar = vnbVar12;
                                        oddsCountryProvider = oddsCountryProvider16;
                                    }
                                    lu3Var = lu3Var7;
                                }
                            }
                        }
                        z = false;
                        p = yaa.p(ku3Var, z, new nu7(tu7Var3, event9, null, 1));
                        this.y = null;
                        this.A = vnbVar12;
                        this.B = oddsCountryProvider15;
                        this.s = p;
                        this.z = 1;
                        w = t3.w(this);
                        if (w != lu3Var7) {
                        }
                        lu3Var = lu3Var7;
                    }
                }
                TeamStreakBettingOddsResponse teamStreakBettingOddsResponse = (TeamStreakBettingOddsResponse) w;
                if (teamStreakBettingOddsResponse == null) {
                    do {
                        value2 = fdiVar2.getValue();
                    } while (!fdiVar2.k(value2, new unb(new n2j(r7, r7, false))));
                } else {
                    providerOdds = (ProviderOdds) CollectionsKt.firstOrNull(teamStreakBettingOddsResponse.getGeneral());
                    providerOdds2 = (ProviderOdds) CollectionsKt.firstOrNull(teamStreakBettingOddsResponse.getHead2head());
                    gv9Var = r7;
                    if (p != null) {
                        this.y = r7;
                        this.A = vnbVar;
                        this.B = oddsCountryProvider;
                        this.s = r7;
                        this.D = providerOdds;
                        this.E = providerOdds2;
                        this.z = 2;
                        T = p.T(this);
                        if (T != lu3Var7) {
                            vnb vnbVar13 = vnbVar;
                            oddsCountryProvider2 = oddsCountryProvider;
                            providerOdds3 = providerOdds;
                            vnbVar2 = vnbVar13;
                            gv9Var6 = r7;
                            gv9Var2 = (gv9) T;
                            if (gv9Var2 == null) {
                            }
                        }
                        lu3Var = lu3Var7;
                    }
                    vnb vnbVar102 = vnbVar;
                    oddsCountryProvider2 = oddsCountryProvider;
                    providerOdds3 = providerOdds;
                    vnbVar2 = vnbVar102;
                    gv9Var5 = gv9Var;
                    gv9Var2 = gv9Var5;
                    if (vnbVar2 instanceof unb) {
                    }
                }
                break;
            default:
                int i16 = this.z;
                pvi pviVar4 = (pvi) this.N;
                yzc yzcVar5 = pviVar4.l;
                ku3 ku3Var2 = (ku3) this.y;
                lu3 lu3Var9 = lu3.a;
                switch (this.x) {
                    case 0:
                        y6a.M(obj);
                        if (yzcVar5.d() == null) {
                            pviVar4.i = ccd.A(i16, pviVar4.i());
                        }
                        av4 t4 = xw3.t(ku3Var2, null, new ovi(pviVar4, i16, null, 1), 3);
                        t = xw3.t(ku3Var2, null, new ovi(pviVar4, i16, null, 4), 3);
                        av4 t5 = xw3.t(ku3Var2, null, new ovi(pviVar4, i16, null, 2), 3);
                        av4 t6 = xw3.t(ku3Var2, null, new ovi(pviVar4, i16, null, 3), 3);
                        av4 t7 = xw3.t(ku3Var2, null, new ovi(pviVar4, i16, null, 5), 3);
                        av4 t8 = xw3.t(ku3Var2, null, new ovi(pviVar4, i16, null, 7), 3);
                        av4 t9 = xw3.t(ku3Var2, null, new ovi(pviVar4, i16, null, 0), 3);
                        t2 = xw3.t(ku3Var2, null, new ovi(pviVar4, i16, null, 8), 3);
                        av4 t10 = xw3.t(ku3Var2, null, new ovi(pviVar4, i16, null, 6), 3);
                        this.y = null;
                        this.s = t;
                        this.A = t5;
                        this.B = t6;
                        this.C = t7;
                        this.D = t8;
                        this.E = t9;
                        this.F = t2;
                        this.G = t10;
                        this.H = yzcVar5;
                        this.x = 1;
                        w2 = t4.w(this);
                        lu3 lu3Var10 = lu3.a;
                        lu3Var4 = lu3Var9;
                        if (w2 != lu3Var4) {
                            zu4Var = t5;
                            av4Var = t10;
                            av4Var2 = t6;
                            zu4Var2 = t8;
                            av4Var3 = t7;
                            zu4Var3 = t9;
                            event3 = (Event) w2;
                            this.y = null;
                            this.s = null;
                            this.A = zu4Var;
                            this.B = av4Var2;
                            this.C = av4Var3;
                            this.D = zu4Var2;
                            this.E = zu4Var3;
                            this.F = t2;
                            this.G = av4Var;
                            this.H = yzcVar5;
                            this.t = event3;
                            this.x = 2;
                            T2 = t.T(this);
                            if (T2 != lu3Var4) {
                                zu4Var4 = zu4Var;
                                zu4Var5 = av4Var2;
                                av4Var4 = av4Var;
                                yzcVar = yzcVar5;
                                zu4Var6 = zu4Var2;
                                zu4Var7 = t2;
                                TeamUniqueTournamentsResponse teamUniqueTournamentsResponse8 = (TeamUniqueTournamentsResponse) yaa.x((x2g) T2);
                                this.y = null;
                                this.s = null;
                                this.A = null;
                                this.B = zu4Var5;
                                this.C = av4Var3;
                                this.D = zu4Var6;
                                this.E = zu4Var3;
                                this.F = zu4Var7;
                                this.G = av4Var4;
                                this.H = yzcVar;
                                this.t = event3;
                                this.I = teamUniqueTournamentsResponse8;
                                this.x = 3;
                                T3 = zu4Var4.T(this);
                                if (T3 != lu3Var4) {
                                    zu4Var8 = zu4Var5;
                                    zu4Var9 = av4Var3;
                                    zu4Var10 = zu4Var6;
                                    zu4Var11 = zu4Var3;
                                    zu4Var12 = zu4Var7;
                                    zu4Var13 = av4Var4;
                                    teamUniqueTournamentsResponse = teamUniqueTournamentsResponse8;
                                    List list8 = (List) T3;
                                    this.y = null;
                                    this.s = null;
                                    this.A = null;
                                    this.B = null;
                                    this.C = zu4Var9;
                                    this.D = zu4Var10;
                                    this.E = zu4Var11;
                                    this.F = zu4Var12;
                                    this.G = zu4Var13;
                                    this.H = yzcVar;
                                    this.t = event3;
                                    this.I = teamUniqueTournamentsResponse;
                                    this.J = list8;
                                    this.x = 4;
                                    T4 = zu4Var8.T(this);
                                    if (T4 != lu3Var4) {
                                        Event event13 = event3;
                                        teamUniqueTournamentsResponse2 = teamUniqueTournamentsResponse;
                                        zu4Var14 = zu4Var13;
                                        yzcVar2 = yzcVar;
                                        event4 = event13;
                                        zu4Var15 = zu4Var10;
                                        list = list8;
                                        RecentTeamTournamentsResponse recentTeamTournamentsResponse6 = (RecentTeamTournamentsResponse) yaa.x((x2g) T4);
                                        this.y = null;
                                        this.s = null;
                                        this.A = null;
                                        this.B = null;
                                        this.C = null;
                                        this.D = zu4Var15;
                                        this.E = zu4Var11;
                                        this.F = zu4Var12;
                                        this.G = zu4Var14;
                                        this.H = yzcVar2;
                                        this.t = event4;
                                        this.I = teamUniqueTournamentsResponse2;
                                        this.J = list;
                                        this.K = recentTeamTournamentsResponse6;
                                        this.x = 5;
                                        T5 = zu4Var9.T(this);
                                        if (T5 != lu3Var4) {
                                            zu4 zu4Var22 = zu4Var12;
                                            zu4Var16 = zu4Var14;
                                            recentTeamTournamentsResponse = recentTeamTournamentsResponse6;
                                            zu4Var17 = zu4Var22;
                                            TeamTransfersResponse teamTransfersResponse5 = (TeamTransfersResponse) yaa.x((x2g) T5);
                                            this.y = null;
                                            this.s = null;
                                            this.A = null;
                                            this.B = null;
                                            this.C = null;
                                            this.D = null;
                                            this.E = zu4Var11;
                                            this.F = zu4Var17;
                                            this.G = zu4Var16;
                                            this.H = yzcVar2;
                                            this.t = event4;
                                            this.I = teamUniqueTournamentsResponse2;
                                            this.J = list;
                                            this.K = recentTeamTournamentsResponse;
                                            this.L = teamTransfersResponse5;
                                            xyiVar = xyi.a;
                                            this.u = xyiVar;
                                            this.w = i16;
                                            this.x = 6;
                                            T6 = zu4Var15.T(this);
                                            if (T6 != lu3Var4) {
                                                List list9 = list;
                                                recentTeamTournamentsResponse2 = recentTeamTournamentsResponse;
                                                teamTransfersResponse = teamTransfersResponse5;
                                                zu4Var18 = zu4Var17;
                                                yzcVar3 = yzcVar2;
                                                event5 = event4;
                                                teamUniqueTournamentsResponse3 = teamUniqueTournamentsResponse2;
                                                list2 = list9;
                                                EventListResponse eventListResponse = (EventListResponse) yaa.x((x2g) T6);
                                                events = eventListResponse == null ? eventListResponse.getEvents() : null;
                                                if (events == null) {
                                                    events = km5.a;
                                                }
                                                xyiVar.getClass();
                                                events.getClass();
                                                ArrayList arrayList2 = new ArrayList();
                                                for (Object obj9 : events) {
                                                    if (ok3.C((Event) obj9)) {
                                                        arrayList2.add(obj9);
                                                    }
                                                }
                                                List M0 = CollectionsKt.M0(5, arrayList2);
                                                int i17 = i16;
                                                arrayList = new ArrayList(k13.r(M0, 10));
                                                it = M0.iterator();
                                                while (it.hasNext()) {
                                                    Event event14 = (Event) it.next();
                                                    Iterator it4 = it;
                                                    Team homeTeam$default = Event.getHomeTeam$default(event14, null, 1, null);
                                                    Integer valueOf2 = Integer.valueOf(homeTeam$default.getId());
                                                    SubTeam subTeam1 = homeTeam$default.getSubTeam1();
                                                    Integer valueOf3 = subTeam1 != null ? Integer.valueOf(subTeam1.getId()) : null;
                                                    SubTeam subTeam2 = homeTeam$default.getSubTeam2();
                                                    if (subTeam2 != null) {
                                                        Integer valueOf4 = Integer.valueOf(subTeam2.getId());
                                                        pviVar2 = pviVar4;
                                                        num = valueOf4;
                                                    } else {
                                                        pviVar2 = pviVar4;
                                                        num = null;
                                                    }
                                                    Integer[] numArr = {valueOf2, valueOf3, num};
                                                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                                                    for (int i18 = 0; i18 < 3; i18++) {
                                                        Integer num2 = numArr[i18];
                                                        if (num2 != null) {
                                                            linkedHashSet.add(num2);
                                                        }
                                                    }
                                                    boolean contains = linkedHashSet.contains(Integer.valueOf(i17));
                                                    if (contains) {
                                                        homeTeam$default = Event.getAwayTeam$default(event14, null, 1, null);
                                                    }
                                                    boolean isDoublesMatch = event14.isDoublesMatch();
                                                    Integer winnerCode$default = Event.getWinnerCode$default(event14, null, 1, null);
                                                    vyi vyiVar = (winnerCode$default != null && winnerCode$default.intValue() == 1) ? contains ? vyi.a : vyi.c : (winnerCode$default != null && winnerCode$default.intValue() == 2) ? contains ? vyi.c : vyi.a : vyi.b;
                                                    int id4 = event14.getId();
                                                    long startTimestamp = event14.getStartTimestamp();
                                                    int id5 = homeTeam$default.getId();
                                                    SubTeam subTeam12 = homeTeam$default.getSubTeam1();
                                                    Integer valueOf5 = isDoublesMatch ? subTeam12 != null ? Integer.valueOf(subTeam12.getId()) : null : null;
                                                    SubTeam subTeam22 = homeTeam$default.getSubTeam2();
                                                    Integer valueOf6 = isDoublesMatch ? subTeam22 != null ? Integer.valueOf(subTeam22.getId()) : null : null;
                                                    boolean z2 = vyiVar == vyi.c && Intrinsics.c(ok3.s(event14), Sports.ICE_HOCKEY) && ph0.a0(new Integer[]{110, 120}).contains(Integer.valueOf(event14.getStatus().getCode()));
                                                    Integer display = Event.getHomeScore$default(event14, null, 1, null).getDisplay();
                                                    vyi vyiVar2 = vyiVar;
                                                    if (display != null) {
                                                        int intValue = display.intValue();
                                                        Integer penalties = Event.getHomeScore$default(event14, null, 1, null).getPenalties();
                                                        if (penalties != null) {
                                                            lu3Var5 = lu3Var4;
                                                            valueOf = "(" + penalties + ") " + intValue;
                                                        } else {
                                                            lu3Var5 = lu3Var4;
                                                            valueOf = String.valueOf(intValue);
                                                        }
                                                        str = valueOf;
                                                        i7 = 1;
                                                    } else {
                                                        lu3Var5 = lu3Var4;
                                                        i7 = 1;
                                                        str = null;
                                                    }
                                                    Integer display2 = Event.getAwayScore$default(event14, null, i7, null).getDisplay();
                                                    if (display2 != null) {
                                                        int intValue2 = display2.intValue();
                                                        Integer penalties2 = Event.getAwayScore$default(event14, null, i7, null).getPenalties();
                                                        str2 = penalties2 != null ? intValue2 + " (" + penalties2 + ")" : String.valueOf(intValue2);
                                                    } else {
                                                        str2 = null;
                                                    }
                                                    arrayList.add(new wyi(id4, startTimestamp, id5, valueOf5, valueOf6, str, str2, contains, vyiVar2, z2));
                                                    it = it4;
                                                    lu3Var4 = lu3Var5;
                                                    pviVar4 = pviVar2;
                                                }
                                                pviVar = pviVar4;
                                                lu3 lu3Var11 = lu3Var4;
                                                if (arrayList.isEmpty()) {
                                                    arrayList = null;
                                                }
                                                W = arrayList == null ? l6g.W(arrayList) : null;
                                                this.y = null;
                                                this.s = null;
                                                this.A = null;
                                                this.B = null;
                                                this.C = null;
                                                this.D = null;
                                                this.E = null;
                                                this.F = zu4Var18;
                                                this.G = zu4Var16;
                                                this.H = yzcVar3;
                                                this.t = event5;
                                                this.I = teamUniqueTournamentsResponse3;
                                                this.J = list2;
                                                this.K = recentTeamTournamentsResponse2;
                                                this.L = teamTransfersResponse;
                                                this.u = W;
                                                this.x = 7;
                                                T7 = zu4Var11.T(this);
                                                lu3Var4 = lu3Var11;
                                                if (T7 != lu3Var4) {
                                                    zu4 zu4Var23 = zu4Var16;
                                                    event6 = event5;
                                                    zu4Var19 = zu4Var23;
                                                    yzcVar4 = yzcVar3;
                                                    TeamAchievementsResponse teamAchievementsResponse4 = (TeamAchievementsResponse) T7;
                                                    this.y = null;
                                                    this.s = null;
                                                    this.A = null;
                                                    this.B = null;
                                                    this.C = null;
                                                    this.D = null;
                                                    this.E = null;
                                                    this.F = null;
                                                    this.G = zu4Var19;
                                                    this.H = yzcVar4;
                                                    this.t = event6;
                                                    this.I = teamUniqueTournamentsResponse3;
                                                    this.J = list2;
                                                    this.K = recentTeamTournamentsResponse2;
                                                    this.L = teamTransfersResponse;
                                                    this.u = W;
                                                    this.M = teamAchievementsResponse4;
                                                    pviVar3 = pviVar;
                                                    this.v = pviVar3;
                                                    this.x = 8;
                                                    T8 = zu4Var18.T(this);
                                                    if (T8 != lu3Var4) {
                                                        RecentTeamTournamentsResponse recentTeamTournamentsResponse7 = recentTeamTournamentsResponse2;
                                                        gv9Var10 = W;
                                                        event7 = event6;
                                                        teamUniqueTournamentsResponse4 = teamUniqueTournamentsResponse3;
                                                        recentTeamTournamentsResponse3 = recentTeamTournamentsResponse7;
                                                        zu4Var20 = zu4Var19;
                                                        list3 = list2;
                                                        teamTransfersResponse2 = teamTransfersResponse;
                                                        teamAchievementsResponse = teamAchievementsResponse4;
                                                        tennisGrandSlamPerformanceResponse = (TennisGrandSlamPerformanceResponse) T8;
                                                        pviVar3.getClass();
                                                        if (tennisGrandSlamPerformanceResponse != null || (results = tennisGrandSlamPerformanceResponse.getResults()) == null) {
                                                            teamAchievementsResponse2 = teamAchievementsResponse;
                                                            gv9Var11 = gv9Var10;
                                                            teamTransfersResponse3 = teamTransfersResponse2;
                                                            recentTeamTournamentsResponse4 = recentTeamTournamentsResponse3;
                                                            list4 = list3;
                                                            teamUniqueTournamentsResponse5 = teamUniqueTournamentsResponse4;
                                                            lu3Var6 = lu3Var4;
                                                            zu4Var21 = zu4Var20;
                                                        } else {
                                                            Boolean bool2 = Boolean.TRUE;
                                                            ArrayList arrayList3 = new ArrayList();
                                                            Iterator it5 = results.iterator();
                                                            while (it5.hasNext()) {
                                                                List<TennisGrandSlamResult> years2 = ((TennisGrandSlamPerformance) it5.next()).getYears();
                                                                Iterator it6 = it5;
                                                                lu3 lu3Var12 = lu3Var4;
                                                                zu4 zu4Var24 = zu4Var20;
                                                                ArrayList arrayList4 = new ArrayList(k13.r(years2, 10));
                                                                Iterator it7 = years2.iterator();
                                                                while (it7.hasNext()) {
                                                                    arrayList4.add(((TennisGrandSlamResult) it7.next()).getRound());
                                                                }
                                                                o13.v(arrayList4, arrayList3);
                                                                it5 = it6;
                                                                zu4Var20 = zu4Var24;
                                                                lu3Var4 = lu3Var12;
                                                            }
                                                            lu3Var6 = lu3Var4;
                                                            zu4Var21 = zu4Var20;
                                                            if (!arrayList3.isEmpty()) {
                                                                Iterator it8 = arrayList3.iterator();
                                                                while (it8.hasNext()) {
                                                                    if (((String) it8.next()) != null) {
                                                                        TennisGrandSlamPerformance tennisGrandSlamPerformance = (TennisGrandSlamPerformance) CollectionsKt.firstOrNull(results);
                                                                        if (tennisGrandSlamPerformance == null || (years = tennisGrandSlamPerformance.getYears()) == null) {
                                                                            r12 = 0;
                                                                        } else {
                                                                            r12 = new ArrayList(k13.r(years, 10));
                                                                            Iterator it9 = years.iterator();
                                                                            while (it9.hasNext()) {
                                                                                r12.add(Integer.valueOf(((TennisGrandSlamResult) it9.next()).getYear()));
                                                                            }
                                                                        }
                                                                        if (r12 == 0) {
                                                                            r12 = km5.a;
                                                                        }
                                                                        gv9 W2 = l6g.W(r12);
                                                                        ArrayList arrayList5 = new ArrayList(k13.r(results, 10));
                                                                        Iterator it10 = results.iterator();
                                                                        while (it10.hasNext()) {
                                                                            TennisGrandSlamPerformance tennisGrandSlamPerformance2 = (TennisGrandSlamPerformance) it10.next();
                                                                            String name = tennisGrandSlamPerformance2.getName();
                                                                            Iterator it11 = it10;
                                                                            if (StringsKt.J(name, "Australian Open", true)) {
                                                                                i8 = R.string.tennis_australian_open;
                                                                            } else if (StringsKt.J(name, "Wimbledon", true)) {
                                                                                i8 = R.string.tennis_wimbledon;
                                                                            } else if (StringsKt.J(name, "US Open", true)) {
                                                                                i8 = R.string.tennis_us_open;
                                                                            } else if (StringsKt.J(name, "Roland Garros", true) || StringsKt.J(name, "French Open", true)) {
                                                                                i8 = R.string.tennis_french_open;
                                                                            } else {
                                                                                m9kVar = new m9k(name);
                                                                                int uniqueTournamentId = tennisGrandSlamPerformance2.getUniqueTournamentId();
                                                                                List<TennisGrandSlamResult> years3 = tennisGrandSlamPerformance2.getYears();
                                                                                TeamAchievementsResponse teamAchievementsResponse5 = teamAchievementsResponse;
                                                                                gv9 gv9Var20 = gv9Var10;
                                                                                ArrayList arrayList6 = new ArrayList(k13.r(years3, 10));
                                                                                it2 = years3.iterator();
                                                                                while (it2.hasNext()) {
                                                                                    TennisGrandSlamResult tennisGrandSlamResult = (TennisGrandSlamResult) it2.next();
                                                                                    Float valueOf7 = Float.valueOf(1.0f);
                                                                                    Iterator it12 = it2;
                                                                                    Float valueOf8 = Float.valueOf(0.1f);
                                                                                    Integer valueOf9 = Integer.valueOf(R.color.primary_default);
                                                                                    TeamTransfersResponse teamTransfersResponse6 = teamTransfersResponse2;
                                                                                    String round = tennisGrandSlamResult.getRound();
                                                                                    RecentTeamTournamentsResponse recentTeamTournamentsResponse8 = recentTeamTournamentsResponse3;
                                                                                    if (round != null) {
                                                                                        str3 = round.toLowerCase(Locale.ROOT);
                                                                                        str3.getClass();
                                                                                    } else {
                                                                                        str3 = null;
                                                                                    }
                                                                                    Boolean winner = tennisGrandSlamResult.getWinner();
                                                                                    List list10 = list3;
                                                                                    Boolean bool3 = Boolean.TRUE;
                                                                                    if (Intrinsics.c(winner, bool3)) {
                                                                                        n1kVar2 = new n1k(Integer.valueOf(R.string.winner_short), valueOf9, valueOf7);
                                                                                        teamUniqueTournamentsResponse7 = teamUniqueTournamentsResponse4;
                                                                                    } else {
                                                                                        if (str3 != null) {
                                                                                            teamUniqueTournamentsResponse7 = teamUniqueTournamentsResponse4;
                                                                                            bool = Boolean.valueOf(c.v(str3, "final", false));
                                                                                        } else {
                                                                                            teamUniqueTournamentsResponse7 = teamUniqueTournamentsResponse4;
                                                                                            bool = null;
                                                                                        }
                                                                                        if (Intrinsics.c(bool, bool3)) {
                                                                                            n1kVar2 = new n1k(Integer.valueOf(R.string.finals_short), valueOf9, Float.valueOf(0.4f));
                                                                                        } else if (Intrinsics.c(str3 != null ? Boolean.valueOf(c.v(str3, "semifinal", false)) : null, bool3)) {
                                                                                            n1kVar2 = new n1k(Integer.valueOf(R.string.semifinals_short), valueOf9, Float.valueOf(0.3f));
                                                                                        } else if (Intrinsics.c(str3 != null ? Boolean.valueOf(c.v(str3, "quarterfinal", false)) : null, bool3)) {
                                                                                            n1kVar2 = new n1k(Integer.valueOf(R.string.quarterfinals_short), valueOf9, Float.valueOf(0.2f));
                                                                                        } else {
                                                                                            List j = b.j("round of 16", "1/8-finals", "r16");
                                                                                            if (j == null || !j.isEmpty()) {
                                                                                                Iterator it13 = j.iterator();
                                                                                                while (it13.hasNext()) {
                                                                                                    if (Intrinsics.c(str3 != null ? Boolean.valueOf(c.v(str3, (String) it13.next(), false)) : null, Boolean.TRUE)) {
                                                                                                        n1kVar = new n1k(Integer.valueOf(R.string.tennis_tournament_fourth_round_short), valueOf9, valueOf8);
                                                                                                        n1kVar2 = n1kVar;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            List j2 = b.j("round of 32", "1/16-finals", "r32");
                                                                                            if (j2 == null || !j2.isEmpty()) {
                                                                                                Iterator it14 = j2.iterator();
                                                                                                while (it14.hasNext()) {
                                                                                                    if (Intrinsics.c(str3 != null ? Boolean.valueOf(c.v(str3, (String) it14.next(), false)) : null, Boolean.TRUE)) {
                                                                                                        n1kVar = new n1k(Integer.valueOf(R.string.tennis_tournament_third_round_short), valueOf9, valueOf8);
                                                                                                        n1kVar2 = n1kVar;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            List j3 = b.j("round of 64", "1/32-finals", "r64");
                                                                                            if (j3 == null || !j3.isEmpty()) {
                                                                                                Iterator it15 = j3.iterator();
                                                                                                while (it15.hasNext()) {
                                                                                                    if (Intrinsics.c(str3 != null ? Boolean.valueOf(c.v(str3, (String) it15.next(), false)) : null, Boolean.TRUE)) {
                                                                                                        n1kVar = new n1k(Integer.valueOf(R.string.tennis_tournament_second_round_short), valueOf9, valueOf8);
                                                                                                        n1kVar2 = n1kVar;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            List j4 = b.j("round of 128", "1/64-finals", "r128");
                                                                                            if (j4 == null || !j4.isEmpty()) {
                                                                                                Iterator it16 = j4.iterator();
                                                                                                while (it16.hasNext()) {
                                                                                                    if (Intrinsics.c(str3 != null ? Boolean.valueOf(c.v(str3, (String) it16.next(), false)) : null, Boolean.TRUE)) {
                                                                                                        n1kVar = new n1k(Integer.valueOf(R.string.tennis_tournament_first_round_short), valueOf9, valueOf8);
                                                                                                        n1kVar2 = n1kVar;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            n1kVar2 = Intrinsics.c(str3 != null ? Boolean.valueOf(c.v(str3, "qualification", false)) : null, Boolean.TRUE) ? new n1k(Integer.valueOf(R.string.tennis_qualifiers_short), valueOf9, Float.valueOf(0.05f)) : tennisGrandSlamResult.isLive() ? new n1k(null, null, valueOf7) : tennisGrandSlamResult.isUpcoming() ? new n1k(null, null, valueOf7) : new n1k(Integer.valueOf(R.string.hypen), Integer.valueOf(R.color.n_lv_5), Float.valueOf(0.15f));
                                                                                        }
                                                                                    }
                                                                                    Integer num3 = (Integer) n1kVar2.a;
                                                                                    arrayList6.add(new f29(num3 != null ? new q9k(num3.intValue()) : null, (Integer) n1kVar2.b, ((Number) n1kVar2.c).floatValue(), Intrinsics.c(tennisGrandSlamResult.getWinner(), bool2) ? R.color.surface_1 : R.color.n_lv_1, tennisGrandSlamResult.getSeasonId(), tennisGrandSlamResult.isUpcoming()));
                                                                                    teamTransfersResponse2 = teamTransfersResponse6;
                                                                                    it2 = it12;
                                                                                    recentTeamTournamentsResponse3 = recentTeamTournamentsResponse8;
                                                                                    list3 = list10;
                                                                                    teamUniqueTournamentsResponse4 = teamUniqueTournamentsResponse7;
                                                                                }
                                                                                arrayList5.add(new g29(m9kVar, uniqueTournamentId, l6g.W(arrayList6)));
                                                                                it10 = it11;
                                                                                teamAchievementsResponse = teamAchievementsResponse5;
                                                                                gv9Var10 = gv9Var20;
                                                                            }
                                                                            m9kVar = new q9k(i8);
                                                                            int uniqueTournamentId2 = tennisGrandSlamPerformance2.getUniqueTournamentId();
                                                                            List<TennisGrandSlamResult> years32 = tennisGrandSlamPerformance2.getYears();
                                                                            TeamAchievementsResponse teamAchievementsResponse52 = teamAchievementsResponse;
                                                                            gv9 gv9Var202 = gv9Var10;
                                                                            ArrayList arrayList62 = new ArrayList(k13.r(years32, 10));
                                                                            it2 = years32.iterator();
                                                                            while (it2.hasNext()) {
                                                                            }
                                                                            arrayList5.add(new g29(m9kVar, uniqueTournamentId2, l6g.W(arrayList62)));
                                                                            it10 = it11;
                                                                            teamAchievementsResponse = teamAchievementsResponse52;
                                                                            gv9Var10 = gv9Var202;
                                                                        }
                                                                        teamAchievementsResponse2 = teamAchievementsResponse;
                                                                        gv9Var11 = gv9Var10;
                                                                        teamTransfersResponse3 = teamTransfersResponse2;
                                                                        recentTeamTournamentsResponse4 = recentTeamTournamentsResponse3;
                                                                        list4 = list3;
                                                                        teamUniqueTournamentsResponse5 = teamUniqueTournamentsResponse4;
                                                                        y5jVar = new y5j(W2, l6g.W(arrayList5));
                                                                        list5 = null;
                                                                        this.y = null;
                                                                        this.s = null;
                                                                        this.A = null;
                                                                        this.B = null;
                                                                        this.C = null;
                                                                        this.D = null;
                                                                        this.E = null;
                                                                        this.F = null;
                                                                        this.G = null;
                                                                        this.H = yzcVar4;
                                                                        this.t = event7;
                                                                        TeamUniqueTournamentsResponse teamUniqueTournamentsResponse9 = teamUniqueTournamentsResponse5;
                                                                        this.I = teamUniqueTournamentsResponse9;
                                                                        List list11 = list4;
                                                                        this.J = list11;
                                                                        RecentTeamTournamentsResponse recentTeamTournamentsResponse9 = recentTeamTournamentsResponse4;
                                                                        this.K = recentTeamTournamentsResponse9;
                                                                        TeamTransfersResponse teamTransfersResponse7 = teamTransfersResponse3;
                                                                        this.L = teamTransfersResponse7;
                                                                        gv9Var12 = gv9Var11;
                                                                        this.u = gv9Var12;
                                                                        teamAchievementsResponse3 = teamAchievementsResponse2;
                                                                        this.M = teamAchievementsResponse3;
                                                                        this.v = y5jVar;
                                                                        this.x = 9;
                                                                        T9 = zu4Var21.T(this);
                                                                        lu3Var4 = lu3Var6;
                                                                        if (T9 != lu3Var4) {
                                                                            y5jVar2 = y5jVar;
                                                                            teamUniqueTournamentsResponse6 = teamUniqueTournamentsResponse9;
                                                                            teamTransfersResponse4 = teamTransfersResponse7;
                                                                            list6 = list11;
                                                                            recentTeamTournamentsResponse5 = recentTeamTournamentsResponse9;
                                                                            event8 = event7;
                                                                            OffersBannerResponse offersBannerResponse = (OffersBannerResponse) T9;
                                                                            yzcVar4.k(new hvi(event8, teamUniqueTournamentsResponse6, list6, recentTeamTournamentsResponse5, teamTransfersResponse4, gv9Var12, teamAchievementsResponse3, y5jVar2, offersBannerResponse == null ? offersBannerResponse.getBanners() : list5));
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            teamAchievementsResponse2 = teamAchievementsResponse;
                                                            gv9Var11 = gv9Var10;
                                                            teamTransfersResponse3 = teamTransfersResponse2;
                                                            recentTeamTournamentsResponse4 = recentTeamTournamentsResponse3;
                                                            list4 = list3;
                                                            teamUniqueTournamentsResponse5 = teamUniqueTournamentsResponse4;
                                                        }
                                                        y5jVar = null;
                                                        list5 = null;
                                                        this.y = null;
                                                        this.s = null;
                                                        this.A = null;
                                                        this.B = null;
                                                        this.C = null;
                                                        this.D = null;
                                                        this.E = null;
                                                        this.F = null;
                                                        this.G = null;
                                                        this.H = yzcVar4;
                                                        this.t = event7;
                                                        TeamUniqueTournamentsResponse teamUniqueTournamentsResponse92 = teamUniqueTournamentsResponse5;
                                                        this.I = teamUniqueTournamentsResponse92;
                                                        List list112 = list4;
                                                        this.J = list112;
                                                        RecentTeamTournamentsResponse recentTeamTournamentsResponse92 = recentTeamTournamentsResponse4;
                                                        this.K = recentTeamTournamentsResponse92;
                                                        TeamTransfersResponse teamTransfersResponse72 = teamTransfersResponse3;
                                                        this.L = teamTransfersResponse72;
                                                        gv9Var12 = gv9Var11;
                                                        this.u = gv9Var12;
                                                        teamAchievementsResponse3 = teamAchievementsResponse2;
                                                        this.M = teamAchievementsResponse3;
                                                        this.v = y5jVar;
                                                        this.x = 9;
                                                        T9 = zu4Var21.T(this);
                                                        lu3Var4 = lu3Var6;
                                                        if (T9 != lu3Var4) {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    case 1:
                        yzcVar5 = (yzc) this.H;
                        ?? r2 = (zu4) this.G;
                        ?? r5 = (zu4) this.F;
                        zu4 zu4Var25 = (zu4) this.E;
                        zu4Var2 = (zu4) this.D;
                        ?? r8 = (zu4) this.C;
                        ?? r123 = (zu4) this.B;
                        zu4Var = (zu4) this.A;
                        t = this.s;
                        y6a.M(obj);
                        av4Var3 = r8;
                        zu4Var3 = zu4Var25;
                        av4Var = r2;
                        av4Var2 = r123;
                        lu3Var4 = lu3Var9;
                        t2 = r5;
                        w2 = obj;
                        event3 = (Event) w2;
                        this.y = null;
                        this.s = null;
                        this.A = zu4Var;
                        this.B = av4Var2;
                        this.C = av4Var3;
                        this.D = zu4Var2;
                        this.E = zu4Var3;
                        this.F = t2;
                        this.G = av4Var;
                        this.H = yzcVar5;
                        this.t = event3;
                        this.x = 2;
                        T2 = t.T(this);
                        if (T2 != lu3Var4) {
                        }
                        break;
                    case 2:
                        Event event15 = this.t;
                        yzc yzcVar6 = (yzc) this.H;
                        ?? r6 = (zu4) this.G;
                        zu4Var7 = (zu4) this.F;
                        zu4Var3 = (zu4) this.E;
                        zu4Var6 = (zu4) this.D;
                        ?? r124 = (zu4) this.C;
                        zu4Var5 = (zu4) this.B;
                        zu4Var4 = (zu4) this.A;
                        y6a.M(obj);
                        event3 = event15;
                        av4Var4 = r6;
                        yzcVar = yzcVar6;
                        T2 = obj;
                        av4Var3 = r124;
                        lu3Var4 = lu3Var9;
                        TeamUniqueTournamentsResponse teamUniqueTournamentsResponse82 = (TeamUniqueTournamentsResponse) yaa.x((x2g) T2);
                        this.y = null;
                        this.s = null;
                        this.A = null;
                        this.B = zu4Var5;
                        this.C = av4Var3;
                        this.D = zu4Var6;
                        this.E = zu4Var3;
                        this.F = zu4Var7;
                        this.G = av4Var4;
                        this.H = yzcVar;
                        this.t = event3;
                        this.I = teamUniqueTournamentsResponse82;
                        this.x = 3;
                        T3 = zu4Var4.T(this);
                        if (T3 != lu3Var4) {
                        }
                        break;
                    case 3:
                        teamUniqueTournamentsResponse = (TeamUniqueTournamentsResponse) this.I;
                        event3 = this.t;
                        yzcVar = (yzc) this.H;
                        zu4Var13 = (zu4) this.G;
                        zu4Var12 = (zu4) this.F;
                        zu4Var11 = (zu4) this.E;
                        zu4 zu4Var26 = (zu4) this.D;
                        zu4Var9 = (zu4) this.C;
                        zu4Var8 = (zu4) this.B;
                        y6a.M(obj);
                        zu4Var10 = zu4Var26;
                        lu3Var4 = lu3Var9;
                        T3 = obj;
                        List list82 = (List) T3;
                        this.y = null;
                        this.s = null;
                        this.A = null;
                        this.B = null;
                        this.C = zu4Var9;
                        this.D = zu4Var10;
                        this.E = zu4Var11;
                        this.F = zu4Var12;
                        this.G = zu4Var13;
                        this.H = yzcVar;
                        this.t = event3;
                        this.I = teamUniqueTournamentsResponse;
                        this.J = list82;
                        this.x = 4;
                        T4 = zu4Var8.T(this);
                        if (T4 != lu3Var4) {
                        }
                        break;
                    case 4:
                        List list12 = (List) this.J;
                        TeamUniqueTournamentsResponse teamUniqueTournamentsResponse10 = (TeamUniqueTournamentsResponse) this.I;
                        Event event16 = this.t;
                        yzc yzcVar7 = (yzc) this.H;
                        zu4 zu4Var27 = (zu4) this.G;
                        zu4Var12 = (zu4) this.F;
                        zu4Var11 = (zu4) this.E;
                        zu4 zu4Var28 = (zu4) this.D;
                        zu4Var9 = (zu4) this.C;
                        y6a.M(obj);
                        list = list12;
                        zu4Var14 = zu4Var27;
                        yzcVar2 = yzcVar7;
                        event4 = event16;
                        teamUniqueTournamentsResponse2 = teamUniqueTournamentsResponse10;
                        zu4Var15 = zu4Var28;
                        lu3Var4 = lu3Var9;
                        T4 = obj;
                        RecentTeamTournamentsResponse recentTeamTournamentsResponse62 = (RecentTeamTournamentsResponse) yaa.x((x2g) T4);
                        this.y = null;
                        this.s = null;
                        this.A = null;
                        this.B = null;
                        this.C = null;
                        this.D = zu4Var15;
                        this.E = zu4Var11;
                        this.F = zu4Var12;
                        this.G = zu4Var14;
                        this.H = yzcVar2;
                        this.t = event4;
                        this.I = teamUniqueTournamentsResponse2;
                        this.J = list;
                        this.K = recentTeamTournamentsResponse62;
                        this.x = 5;
                        T5 = zu4Var9.T(this);
                        if (T5 != lu3Var4) {
                        }
                        break;
                    case 5:
                        recentTeamTournamentsResponse = (RecentTeamTournamentsResponse) this.K;
                        list = (List) this.J;
                        teamUniqueTournamentsResponse2 = (TeamUniqueTournamentsResponse) this.I;
                        event4 = this.t;
                        yzcVar2 = (yzc) this.H;
                        zu4Var16 = (zu4) this.G;
                        zu4 zu4Var29 = (zu4) this.F;
                        zu4 zu4Var30 = (zu4) this.E;
                        zu4 zu4Var31 = (zu4) this.D;
                        y6a.M(obj);
                        zu4Var17 = zu4Var29;
                        zu4Var11 = zu4Var30;
                        lu3Var4 = lu3Var9;
                        zu4Var15 = zu4Var31;
                        T5 = obj;
                        TeamTransfersResponse teamTransfersResponse52 = (TeamTransfersResponse) yaa.x((x2g) T5);
                        this.y = null;
                        this.s = null;
                        this.A = null;
                        this.B = null;
                        this.C = null;
                        this.D = null;
                        this.E = zu4Var11;
                        this.F = zu4Var17;
                        this.G = zu4Var16;
                        this.H = yzcVar2;
                        this.t = event4;
                        this.I = teamUniqueTournamentsResponse2;
                        this.J = list;
                        this.K = recentTeamTournamentsResponse;
                        this.L = teamTransfersResponse52;
                        xyiVar = xyi.a;
                        this.u = xyiVar;
                        this.w = i16;
                        this.x = 6;
                        T6 = zu4Var15.T(this);
                        if (T6 != lu3Var4) {
                        }
                        break;
                    case 6:
                        i16 = this.w;
                        xyi xyiVar2 = (xyi) this.u;
                        TeamTransfersResponse teamTransfersResponse8 = (TeamTransfersResponse) this.L;
                        RecentTeamTournamentsResponse recentTeamTournamentsResponse10 = (RecentTeamTournamentsResponse) this.K;
                        List list13 = (List) this.J;
                        TeamUniqueTournamentsResponse teamUniqueTournamentsResponse11 = (TeamUniqueTournamentsResponse) this.I;
                        event5 = this.t;
                        yzc yzcVar8 = (yzc) this.H;
                        zu4 zu4Var32 = (zu4) this.G;
                        zu4 zu4Var33 = (zu4) this.F;
                        zu4 zu4Var34 = (zu4) this.E;
                        y6a.M(obj);
                        T6 = obj;
                        yzcVar3 = yzcVar8;
                        xyiVar = xyiVar2;
                        teamTransfersResponse = teamTransfersResponse8;
                        recentTeamTournamentsResponse2 = recentTeamTournamentsResponse10;
                        zu4Var11 = zu4Var34;
                        zu4Var16 = zu4Var32;
                        teamUniqueTournamentsResponse3 = teamUniqueTournamentsResponse11;
                        zu4Var18 = zu4Var33;
                        list2 = list13;
                        lu3Var4 = lu3Var9;
                        EventListResponse eventListResponse2 = (EventListResponse) yaa.x((x2g) T6);
                        if (eventListResponse2 == null) {
                        }
                        if (events == null) {
                        }
                        xyiVar.getClass();
                        events.getClass();
                        ArrayList arrayList22 = new ArrayList();
                        while (r4.hasNext()) {
                        }
                        List M02 = CollectionsKt.M0(5, arrayList22);
                        int i172 = i16;
                        arrayList = new ArrayList(k13.r(M02, 10));
                        it = M02.iterator();
                        while (it.hasNext()) {
                        }
                        pviVar = pviVar4;
                        lu3 lu3Var112 = lu3Var4;
                        if (arrayList.isEmpty()) {
                        }
                        if (arrayList == null) {
                        }
                        this.y = null;
                        this.s = null;
                        this.A = null;
                        this.B = null;
                        this.C = null;
                        this.D = null;
                        this.E = null;
                        this.F = zu4Var18;
                        this.G = zu4Var16;
                        this.H = yzcVar3;
                        this.t = event5;
                        this.I = teamUniqueTournamentsResponse3;
                        this.J = list2;
                        this.K = recentTeamTournamentsResponse2;
                        this.L = teamTransfersResponse;
                        this.u = W;
                        this.x = 7;
                        T7 = zu4Var11.T(this);
                        lu3Var4 = lu3Var112;
                        if (T7 != lu3Var4) {
                        }
                        break;
                    case 7:
                        W = (gv9) this.u;
                        teamTransfersResponse = (TeamTransfersResponse) this.L;
                        recentTeamTournamentsResponse2 = (RecentTeamTournamentsResponse) this.K;
                        list2 = (List) this.J;
                        teamUniqueTournamentsResponse3 = (TeamUniqueTournamentsResponse) this.I;
                        event6 = this.t;
                        yzcVar4 = (yzc) this.H;
                        zu4 zu4Var35 = (zu4) this.G;
                        zu4Var18 = (zu4) this.F;
                        y6a.M(obj);
                        T7 = obj;
                        pviVar = pviVar4;
                        zu4Var19 = zu4Var35;
                        lu3Var4 = lu3Var9;
                        TeamAchievementsResponse teamAchievementsResponse42 = (TeamAchievementsResponse) T7;
                        this.y = null;
                        this.s = null;
                        this.A = null;
                        this.B = null;
                        this.C = null;
                        this.D = null;
                        this.E = null;
                        this.F = null;
                        this.G = zu4Var19;
                        this.H = yzcVar4;
                        this.t = event6;
                        this.I = teamUniqueTournamentsResponse3;
                        this.J = list2;
                        this.K = recentTeamTournamentsResponse2;
                        this.L = teamTransfersResponse;
                        this.u = W;
                        this.M = teamAchievementsResponse42;
                        pviVar3 = pviVar;
                        this.v = pviVar3;
                        this.x = 8;
                        T8 = zu4Var18.T(this);
                        if (T8 != lu3Var4) {
                        }
                        break;
                    case 8:
                        pviVar3 = (pvi) this.v;
                        TeamAchievementsResponse teamAchievementsResponse6 = (TeamAchievementsResponse) this.M;
                        gv9 gv9Var21 = (gv9) this.u;
                        TeamTransfersResponse teamTransfersResponse9 = (TeamTransfersResponse) this.L;
                        RecentTeamTournamentsResponse recentTeamTournamentsResponse11 = (RecentTeamTournamentsResponse) this.K;
                        List list14 = (List) this.J;
                        teamUniqueTournamentsResponse4 = (TeamUniqueTournamentsResponse) this.I;
                        Event event17 = this.t;
                        yzc yzcVar9 = (yzc) this.H;
                        zu4Var20 = (zu4) this.G;
                        y6a.M(obj);
                        T8 = obj;
                        list3 = list14;
                        recentTeamTournamentsResponse3 = recentTeamTournamentsResponse11;
                        teamTransfersResponse2 = teamTransfersResponse9;
                        gv9Var10 = gv9Var21;
                        teamAchievementsResponse = teamAchievementsResponse6;
                        event7 = event17;
                        yzcVar4 = yzcVar9;
                        lu3Var4 = lu3Var9;
                        tennisGrandSlamPerformanceResponse = (TennisGrandSlamPerformanceResponse) T8;
                        pviVar3.getClass();
                        if (tennisGrandSlamPerformanceResponse != null) {
                            break;
                        }
                        teamAchievementsResponse2 = teamAchievementsResponse;
                        gv9Var11 = gv9Var10;
                        teamTransfersResponse3 = teamTransfersResponse2;
                        recentTeamTournamentsResponse4 = recentTeamTournamentsResponse3;
                        list4 = list3;
                        teamUniqueTournamentsResponse5 = teamUniqueTournamentsResponse4;
                        lu3Var6 = lu3Var4;
                        zu4Var21 = zu4Var20;
                        y5jVar = null;
                        list5 = null;
                        this.y = null;
                        this.s = null;
                        this.A = null;
                        this.B = null;
                        this.C = null;
                        this.D = null;
                        this.E = null;
                        this.F = null;
                        this.G = null;
                        this.H = yzcVar4;
                        this.t = event7;
                        TeamUniqueTournamentsResponse teamUniqueTournamentsResponse922 = teamUniqueTournamentsResponse5;
                        this.I = teamUniqueTournamentsResponse922;
                        List list1122 = list4;
                        this.J = list1122;
                        RecentTeamTournamentsResponse recentTeamTournamentsResponse922 = recentTeamTournamentsResponse4;
                        this.K = recentTeamTournamentsResponse922;
                        TeamTransfersResponse teamTransfersResponse722 = teamTransfersResponse3;
                        this.L = teamTransfersResponse722;
                        gv9Var12 = gv9Var11;
                        this.u = gv9Var12;
                        teamAchievementsResponse3 = teamAchievementsResponse2;
                        this.M = teamAchievementsResponse3;
                        this.v = y5jVar;
                        this.x = 9;
                        T9 = zu4Var21.T(this);
                        lu3Var4 = lu3Var6;
                        if (T9 != lu3Var4) {
                        }
                        break;
                    case 9:
                        y5j y5jVar3 = (y5j) this.v;
                        TeamAchievementsResponse teamAchievementsResponse7 = (TeamAchievementsResponse) this.M;
                        gv9 gv9Var22 = (gv9) this.u;
                        TeamTransfersResponse teamTransfersResponse10 = (TeamTransfersResponse) this.L;
                        RecentTeamTournamentsResponse recentTeamTournamentsResponse12 = (RecentTeamTournamentsResponse) this.K;
                        List list15 = (List) this.J;
                        TeamUniqueTournamentsResponse teamUniqueTournamentsResponse12 = (TeamUniqueTournamentsResponse) this.I;
                        Event event18 = this.t;
                        yzc yzcVar10 = (yzc) this.H;
                        y6a.M(obj);
                        teamTransfersResponse4 = teamTransfersResponse10;
                        recentTeamTournamentsResponse5 = recentTeamTournamentsResponse12;
                        yzcVar4 = yzcVar10;
                        list5 = null;
                        list6 = list15;
                        T9 = obj;
                        gv9Var12 = gv9Var22;
                        teamUniqueTournamentsResponse6 = teamUniqueTournamentsResponse12;
                        teamAchievementsResponse3 = teamAchievementsResponse7;
                        event8 = event18;
                        y5jVar2 = y5jVar3;
                        OffersBannerResponse offersBannerResponse2 = (OffersBannerResponse) T9;
                        yzcVar4.k(new hvi(event8, teamUniqueTournamentsResponse6, list6, recentTeamTournamentsResponse5, teamTransfersResponse4, gv9Var12, teamAchievementsResponse3, y5jVar2, offersBannerResponse2 == null ? offersBannerResponse2.getBanners() : list5));
                        break;
                    default:
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        break;
                }
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qu7(pvi pviVar, int i, rq3 rq3Var) {
        super(2, rq3Var);
        this.N = pviVar;
        this.z = i;
    }
}
