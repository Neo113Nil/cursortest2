package defpackage;

import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.OffersBanner;
import com.sofascore.model.mvvm.model.OffersBannerResponse;
import com.sofascore.model.mvvm.model.Transfer;
import com.sofascore.model.newNetwork.AttributeOverviewResponse;
import com.sofascore.model.newNetwork.NationalTeamStatisticsData;
import com.sofascore.model.newNetwork.NationalTeamStatisticsResponse;
import com.sofascore.model.newNetwork.PlayerCharacteristicsResponse;
import com.sofascore.model.newNetwork.PlayerEventsListResponse;
import com.sofascore.model.newNetwork.PlayerSummaryEvent;
import com.sofascore.model.newNetwork.PlayerUniqueTournamentsResponse;
import com.sofascore.model.newNetwork.PlayerYearSummaryResponse;
import com.sofascore.model.newNetwork.TransferHistoryResponse;
import com.sofascore.model.util.MarketValueUserVote;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class qoe extends hoi implements Function2 {
    public Object A;
    public Object B;
    public Object C;
    public Object D;
    public Object E;
    public Object F;
    public Object G;
    public Object H;
    public Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ ltk K;
    public final /* synthetic */ int r;
    public av4 s;
    public zu4 t;
    public int u;
    public /* synthetic */ Object v;
    public final /* synthetic */ int w;
    public Object x;
    public Object y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qoe(Object obj, ltk ltkVar, int i, rq3 rq3Var, int i2) {
        super(2, rq3Var);
        this.r = i2;
        this.J = obj;
        this.K = ltkVar;
        this.w = i;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        ltk ltkVar = this.K;
        Object obj2 = this.J;
        switch (i) {
            case 0:
                qoe qoeVar = new qoe((String) obj2, (roe) ltkVar, this.w, rq3Var, 0);
                qoeVar.v = obj;
                return qoeVar;
            default:
                qoe qoeVar2 = new qoe((Integer) obj2, (qqe) ltkVar, this.w, rq3Var, 1);
                qoeVar2.v = obj;
                return qoeVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((qoe) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c4, code lost:
    
        if (r3 == r4) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0405  */
    /* JADX WARN: Type inference failed for: r2v8, types: [zu4] */
    /* JADX WARN: Type inference failed for: r5v55, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v8, types: [zu4] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        av4 t;
        zu4 p;
        Object w;
        av4 av4Var;
        av4 av4Var2;
        zu4 zu4Var;
        zu4 zu4Var2;
        zu4 zu4Var3;
        Object T;
        zu4 zu4Var4;
        MarketValueUserVote marketValueUserVote;
        zu4 zu4Var5;
        zu4 zu4Var6;
        zu4 zu4Var7;
        zu4 zu4Var8;
        Object T2;
        zu4 zu4Var9;
        cxe cxeVar;
        zu4 zu4Var10;
        zu4 zu4Var11;
        zu4 zu4Var12;
        zu4 zu4Var13;
        Object T3;
        MarketValueUserVote marketValueUserVote2;
        x2g x2gVar;
        zu4 zu4Var14;
        zu4 zu4Var15;
        zu4 zu4Var16;
        Object T4;
        x2g x2gVar2;
        MarketValueUserVote marketValueUserVote3;
        cxe cxeVar2;
        x2g x2gVar3;
        zu4 zu4Var17;
        zu4 zu4Var18;
        zu4 zu4Var19;
        Object T5;
        MarketValueUserVote marketValueUserVote4;
        x2g x2gVar4;
        zu4 zu4Var20;
        Object T6;
        x2g x2gVar5;
        x2g x2gVar6;
        x2g x2gVar7;
        zu4 zu4Var21;
        cxe cxeVar3;
        x2g x2gVar8;
        OffersBannerResponse offersBannerResponse;
        r91 r91Var;
        Object T7;
        x2g x2gVar9;
        OffersBannerResponse offersBannerResponse2;
        PlayerYearSummaryResponse playerYearSummaryResponse;
        NationalTeamStatisticsResponse nationalTeamStatisticsResponse;
        av4 t2;
        zu4 t3;
        Object w2;
        ArrayList arrayList;
        HashMap hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        HashMap hashMap4;
        yzc yzcVar;
        Object T8;
        zu4 zu4Var22;
        yzc yzcVar2;
        HashMap hashMap5;
        HashMap hashMap6;
        ArrayList arrayList2;
        HashMap hashMap7;
        List<Transfer> list;
        Object T9;
        ArrayList arrayList3;
        HashMap hashMap8;
        HashMap hashMap9;
        List<Transfer> list2;
        HashMap hashMap10;
        x2g x2gVar10;
        TransferHistoryResponse transferHistoryResponse;
        int i = this.r;
        ltk ltkVar = this.K;
        Object obj2 = this.J;
        switch (i) {
            case 0:
                String str = (String) obj2;
                roe roeVar = (roe) ltkVar;
                ku3 ku3Var = (ku3) this.v;
                lu3 lu3Var = lu3.a;
                switch (this.u) {
                    case 0:
                        y6a.M(obj);
                        int i2 = this.w;
                        av4 t4 = xw3.t(ku3Var, null, new poe(roeVar, i2, null, 1), 3);
                        av4 t5 = xw3.t(ku3Var, null, new anc(roeVar, i2, str, (rq3) null, 5), 3);
                        av4 t6 = xw3.t(ku3Var, null, new poe(roeVar, i2, null, 5), 3);
                        av4 t7 = xw3.t(ku3Var, null, new poe(roeVar, i2, null, 0), 3);
                        av4 t8 = xw3.t(ku3Var, null, new poe(roeVar, i2, null, 2), 3);
                        av4 t9 = xw3.t(ku3Var, null, new poe(roeVar, i2, null, 4), 3);
                        t = xw3.t(ku3Var, null, new poe(roeVar, i2, null, 3), 3);
                        p = yaa.p(ku3Var, str.equals(Sports.BASEBALL) && roeVar.k() == null, new jr5(roeVar, i2, (rq3) null, 10));
                        this.v = null;
                        this.s = t5;
                        this.t = t6;
                        this.x = t7;
                        this.y = t8;
                        this.z = t9;
                        this.A = t;
                        this.B = p;
                        this.u = 1;
                        w = t4.w(this);
                        if (w != lu3Var) {
                            av4Var = t8;
                            av4Var2 = t5;
                            zu4Var = t7;
                            zu4Var2 = t9;
                            zu4Var3 = t6;
                            MarketValueUserVote marketValueUserVote5 = (MarketValueUserVote) w;
                            this.v = null;
                            this.s = null;
                            this.t = zu4Var3;
                            this.x = zu4Var;
                            this.y = av4Var;
                            this.z = zu4Var2;
                            this.A = t;
                            this.B = p;
                            this.C = marketValueUserVote5;
                            this.u = 2;
                            T = av4Var2.T(this);
                            if (T != lu3Var) {
                                zu4Var4 = p;
                                marketValueUserVote = marketValueUserVote5;
                                av4 av4Var3 = t;
                                zu4Var5 = zu4Var2;
                                zu4Var6 = av4Var3;
                                av4 av4Var4 = av4Var;
                                zu4Var7 = zu4Var;
                                zu4Var8 = av4Var4;
                                cxe cxeVar4 = (cxe) T;
                                this.v = null;
                                this.s = null;
                                this.t = null;
                                this.x = zu4Var7;
                                this.y = zu4Var8;
                                this.z = zu4Var5;
                                this.A = zu4Var6;
                                this.B = zu4Var4;
                                this.C = marketValueUserVote;
                                this.D = cxeVar4;
                                this.u = 3;
                                T2 = zu4Var3.T(this);
                                if (T2 != lu3Var) {
                                    zu4 zu4Var23 = zu4Var6;
                                    zu4Var9 = zu4Var4;
                                    cxeVar = cxeVar4;
                                    zu4Var10 = zu4Var7;
                                    zu4Var11 = zu4Var8;
                                    zu4Var12 = zu4Var5;
                                    zu4Var13 = zu4Var23;
                                    x2g x2gVar11 = (x2g) T2;
                                    this.v = null;
                                    this.s = null;
                                    this.t = null;
                                    this.x = null;
                                    this.y = zu4Var11;
                                    this.z = zu4Var12;
                                    this.A = zu4Var13;
                                    this.B = zu4Var9;
                                    this.C = marketValueUserVote;
                                    this.D = cxeVar;
                                    this.E = x2gVar11;
                                    this.u = 4;
                                    T3 = zu4Var10.T(this);
                                    if (T3 != lu3Var) {
                                        zu4 zu4Var24 = zu4Var9;
                                        marketValueUserVote2 = marketValueUserVote;
                                        x2gVar = x2gVar11;
                                        zu4Var14 = zu4Var12;
                                        zu4Var15 = zu4Var13;
                                        zu4Var16 = zu4Var24;
                                        x2g x2gVar12 = (x2g) T3;
                                        this.v = null;
                                        this.s = null;
                                        this.t = null;
                                        this.x = null;
                                        this.y = null;
                                        this.z = zu4Var14;
                                        this.A = zu4Var15;
                                        this.B = zu4Var16;
                                        this.C = marketValueUserVote2;
                                        this.D = cxeVar;
                                        this.E = x2gVar;
                                        this.F = x2gVar12;
                                        this.u = 5;
                                        T4 = zu4Var11.T(this);
                                        if (T4 != lu3Var) {
                                            MarketValueUserVote marketValueUserVote6 = marketValueUserVote2;
                                            x2gVar2 = x2gVar;
                                            marketValueUserVote3 = marketValueUserVote6;
                                            zu4 zu4Var25 = zu4Var16;
                                            cxeVar2 = cxeVar;
                                            x2gVar3 = x2gVar12;
                                            zu4Var17 = zu4Var14;
                                            zu4Var18 = zu4Var15;
                                            zu4Var19 = zu4Var25;
                                            x2g x2gVar13 = (x2g) T4;
                                            this.v = null;
                                            this.s = null;
                                            this.t = null;
                                            this.x = null;
                                            this.y = null;
                                            this.z = null;
                                            this.A = zu4Var18;
                                            this.B = zu4Var19;
                                            this.C = marketValueUserVote3;
                                            this.D = cxeVar2;
                                            this.E = x2gVar2;
                                            this.F = x2gVar3;
                                            this.G = x2gVar13;
                                            this.u = 6;
                                            T5 = zu4Var17.T(this);
                                            if (T5 != lu3Var) {
                                                zu4 zu4Var26 = zu4Var19;
                                                marketValueUserVote4 = marketValueUserVote3;
                                                x2gVar4 = x2gVar13;
                                                zu4Var20 = zu4Var26;
                                                x2g x2gVar14 = (x2g) T5;
                                                this.v = null;
                                                this.s = null;
                                                this.t = null;
                                                this.x = null;
                                                this.y = null;
                                                this.z = null;
                                                this.A = null;
                                                this.B = zu4Var20;
                                                this.C = marketValueUserVote4;
                                                this.D = cxeVar2;
                                                this.E = x2gVar2;
                                                this.F = x2gVar3;
                                                this.G = x2gVar4;
                                                this.H = x2gVar14;
                                                this.u = 7;
                                                T6 = zu4Var18.T(this);
                                                if (T6 != lu3Var) {
                                                    x2g x2gVar15 = x2gVar2;
                                                    x2gVar5 = x2gVar4;
                                                    x2gVar6 = x2gVar3;
                                                    x2gVar7 = x2gVar14;
                                                    zu4Var21 = zu4Var20;
                                                    cxeVar3 = cxeVar2;
                                                    x2gVar8 = x2gVar15;
                                                    offersBannerResponse = (OffersBannerResponse) T6;
                                                    if (zu4Var21 == null) {
                                                        this.v = null;
                                                        this.s = null;
                                                        this.t = null;
                                                        this.x = null;
                                                        this.y = null;
                                                        this.z = null;
                                                        this.A = null;
                                                        this.B = null;
                                                        this.C = marketValueUserVote4;
                                                        this.D = cxeVar3;
                                                        this.E = x2gVar8;
                                                        this.F = x2gVar6;
                                                        this.G = x2gVar5;
                                                        this.H = x2gVar7;
                                                        this.I = offersBannerResponse;
                                                        this.u = 8;
                                                        T7 = zu4Var21.T(this);
                                                        if (T7 != lu3Var) {
                                                            x2gVar9 = x2gVar6;
                                                            offersBannerResponse2 = offersBannerResponse;
                                                            r91Var = (r91) T7;
                                                            offersBannerResponse = offersBannerResponse2;
                                                            x2gVar6 = x2gVar9;
                                                            MarketValueUserVote marketValueUserVote7 = marketValueUserVote4;
                                                            cxe cxeVar5 = cxeVar3;
                                                            yzc yzcVar3 = roeVar.i;
                                                            playerYearSummaryResponse = (PlayerYearSummaryResponse) yaa.x(x2gVar8);
                                                            if (playerYearSummaryResponse != null || (r5 = playerYearSummaryResponse.getSummary()) == null) {
                                                                List<PlayerSummaryEvent> list3 = km5.a;
                                                            }
                                                            List<PlayerSummaryEvent> list4 = list3;
                                                            AttributeOverviewResponse attributeOverviewResponse = (AttributeOverviewResponse) yaa.x(x2gVar6);
                                                            nationalTeamStatisticsResponse = (NationalTeamStatisticsResponse) yaa.x(x2gVar5);
                                                            if (nationalTeamStatisticsResponse != null || (r1 = nationalTeamStatisticsResponse.getStatistics()) == null) {
                                                                List<NationalTeamStatisticsData> list5 = km5.a;
                                                            }
                                                            List<NationalTeamStatisticsData> list6 = list5;
                                                            PlayerCharacteristicsResponse playerCharacteristicsResponse = (PlayerCharacteristicsResponse) yaa.x(x2gVar7);
                                                            List<OffersBanner> banners = offersBannerResponse != null ? offersBannerResponse.getBanners() : null;
                                                            if (r91Var == null) {
                                                                r91Var = roeVar.k();
                                                            }
                                                            yzcVar3.k(new soe(marketValueUserVote7, cxeVar5, list4, attributeOverviewResponse, list6, playerCharacteristicsResponse, banners, r91Var));
                                                            break;
                                                        }
                                                    } else {
                                                        r91Var = null;
                                                        MarketValueUserVote marketValueUserVote72 = marketValueUserVote4;
                                                        cxe cxeVar52 = cxeVar3;
                                                        yzc yzcVar32 = roeVar.i;
                                                        playerYearSummaryResponse = (PlayerYearSummaryResponse) yaa.x(x2gVar8);
                                                        if (playerYearSummaryResponse != null) {
                                                        }
                                                        List<PlayerSummaryEvent> list32 = km5.a;
                                                        List<PlayerSummaryEvent> list42 = list32;
                                                        AttributeOverviewResponse attributeOverviewResponse2 = (AttributeOverviewResponse) yaa.x(x2gVar6);
                                                        nationalTeamStatisticsResponse = (NationalTeamStatisticsResponse) yaa.x(x2gVar5);
                                                        if (nationalTeamStatisticsResponse != null) {
                                                        }
                                                        List<NationalTeamStatisticsData> list52 = km5.a;
                                                        List<NationalTeamStatisticsData> list62 = list52;
                                                        PlayerCharacteristicsResponse playerCharacteristicsResponse2 = (PlayerCharacteristicsResponse) yaa.x(x2gVar7);
                                                        List<OffersBanner> banners2 = offersBannerResponse != null ? offersBannerResponse.getBanners() : null;
                                                        if (r91Var == null) {
                                                        }
                                                        yzcVar32.k(new soe(marketValueUserVote72, cxeVar52, list42, attributeOverviewResponse2, list62, playerCharacteristicsResponse2, banners2, r91Var));
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
                        p = (zu4) this.B;
                        ?? r2 = (zu4) this.A;
                        zu4Var2 = (zu4) this.z;
                        ?? r5 = (zu4) this.y;
                        zu4Var = (zu4) this.x;
                        zu4 zu4Var27 = this.t;
                        av4Var2 = this.s;
                        y6a.M(obj);
                        av4Var = r5;
                        zu4Var3 = zu4Var27;
                        t = r2;
                        w = obj;
                        MarketValueUserVote marketValueUserVote52 = (MarketValueUserVote) w;
                        this.v = null;
                        this.s = null;
                        this.t = zu4Var3;
                        this.x = zu4Var;
                        this.y = av4Var;
                        this.z = zu4Var2;
                        this.A = t;
                        this.B = p;
                        this.C = marketValueUserVote52;
                        this.u = 2;
                        T = av4Var2.T(this);
                        if (T != lu3Var) {
                        }
                        break;
                    case 2:
                        marketValueUserVote = (MarketValueUserVote) this.C;
                        zu4Var4 = (zu4) this.B;
                        zu4Var6 = (zu4) this.A;
                        zu4Var5 = (zu4) this.z;
                        zu4Var8 = (zu4) this.y;
                        zu4 zu4Var28 = (zu4) this.x;
                        zu4Var3 = this.t;
                        y6a.M(obj);
                        zu4Var7 = zu4Var28;
                        T = obj;
                        cxe cxeVar42 = (cxe) T;
                        this.v = null;
                        this.s = null;
                        this.t = null;
                        this.x = zu4Var7;
                        this.y = zu4Var8;
                        this.z = zu4Var5;
                        this.A = zu4Var6;
                        this.B = zu4Var4;
                        this.C = marketValueUserVote;
                        this.D = cxeVar42;
                        this.u = 3;
                        T2 = zu4Var3.T(this);
                        if (T2 != lu3Var) {
                        }
                        break;
                    case 3:
                        cxe cxeVar6 = (cxe) this.D;
                        MarketValueUserVote marketValueUserVote8 = (MarketValueUserVote) this.C;
                        zu4Var9 = (zu4) this.B;
                        zu4Var13 = (zu4) this.A;
                        zu4Var12 = (zu4) this.z;
                        zu4Var11 = (zu4) this.y;
                        zu4Var10 = (zu4) this.x;
                        y6a.M(obj);
                        cxeVar = cxeVar6;
                        marketValueUserVote = marketValueUserVote8;
                        T2 = obj;
                        x2g x2gVar112 = (x2g) T2;
                        this.v = null;
                        this.s = null;
                        this.t = null;
                        this.x = null;
                        this.y = zu4Var11;
                        this.z = zu4Var12;
                        this.A = zu4Var13;
                        this.B = zu4Var9;
                        this.C = marketValueUserVote;
                        this.D = cxeVar;
                        this.E = x2gVar112;
                        this.u = 4;
                        T3 = zu4Var10.T(this);
                        if (T3 != lu3Var) {
                        }
                        break;
                    case 4:
                        x2gVar = (x2g) this.E;
                        cxeVar = (cxe) this.D;
                        marketValueUserVote2 = (MarketValueUserVote) this.C;
                        zu4Var16 = (zu4) this.B;
                        zu4Var15 = (zu4) this.A;
                        zu4 zu4Var29 = (zu4) this.z;
                        zu4 zu4Var30 = (zu4) this.y;
                        y6a.M(obj);
                        zu4Var14 = zu4Var29;
                        zu4Var11 = zu4Var30;
                        T3 = obj;
                        x2g x2gVar122 = (x2g) T3;
                        this.v = null;
                        this.s = null;
                        this.t = null;
                        this.x = null;
                        this.y = null;
                        this.z = zu4Var14;
                        this.A = zu4Var15;
                        this.B = zu4Var16;
                        this.C = marketValueUserVote2;
                        this.D = cxeVar;
                        this.E = x2gVar;
                        this.F = x2gVar122;
                        this.u = 5;
                        T4 = zu4Var11.T(this);
                        if (T4 != lu3Var) {
                        }
                        break;
                    case 5:
                        x2g x2gVar16 = (x2g) this.F;
                        x2g x2gVar17 = (x2g) this.E;
                        cxe cxeVar7 = (cxe) this.D;
                        MarketValueUserVote marketValueUserVote9 = (MarketValueUserVote) this.C;
                        zu4Var19 = (zu4) this.B;
                        zu4 zu4Var31 = (zu4) this.A;
                        zu4Var17 = (zu4) this.z;
                        y6a.M(obj);
                        x2gVar3 = x2gVar16;
                        marketValueUserVote3 = marketValueUserVote9;
                        cxeVar2 = cxeVar7;
                        x2gVar2 = x2gVar17;
                        zu4Var18 = zu4Var31;
                        T4 = obj;
                        x2g x2gVar132 = (x2g) T4;
                        this.v = null;
                        this.s = null;
                        this.t = null;
                        this.x = null;
                        this.y = null;
                        this.z = null;
                        this.A = zu4Var18;
                        this.B = zu4Var19;
                        this.C = marketValueUserVote3;
                        this.D = cxeVar2;
                        this.E = x2gVar2;
                        this.F = x2gVar3;
                        this.G = x2gVar132;
                        this.u = 6;
                        T5 = zu4Var17.T(this);
                        if (T5 != lu3Var) {
                        }
                        break;
                    case 6:
                        x2gVar4 = (x2g) this.G;
                        x2gVar3 = (x2g) this.F;
                        x2gVar2 = (x2g) this.E;
                        cxeVar2 = (cxe) this.D;
                        marketValueUserVote4 = (MarketValueUserVote) this.C;
                        zu4Var20 = (zu4) this.B;
                        zu4 zu4Var32 = (zu4) this.A;
                        y6a.M(obj);
                        zu4Var18 = zu4Var32;
                        T5 = obj;
                        x2g x2gVar142 = (x2g) T5;
                        this.v = null;
                        this.s = null;
                        this.t = null;
                        this.x = null;
                        this.y = null;
                        this.z = null;
                        this.A = null;
                        this.B = zu4Var20;
                        this.C = marketValueUserVote4;
                        this.D = cxeVar2;
                        this.E = x2gVar2;
                        this.F = x2gVar3;
                        this.G = x2gVar4;
                        this.H = x2gVar142;
                        this.u = 7;
                        T6 = zu4Var18.T(this);
                        if (T6 != lu3Var) {
                        }
                        break;
                    case 7:
                        x2g x2gVar18 = (x2g) this.H;
                        x2g x2gVar19 = (x2g) this.G;
                        x2g x2gVar20 = (x2g) this.F;
                        x2gVar8 = (x2g) this.E;
                        cxe cxeVar8 = (cxe) this.D;
                        MarketValueUserVote marketValueUserVote10 = (MarketValueUserVote) this.C;
                        zu4Var21 = (zu4) this.B;
                        y6a.M(obj);
                        x2gVar7 = x2gVar18;
                        x2gVar6 = x2gVar20;
                        x2gVar5 = x2gVar19;
                        cxeVar3 = cxeVar8;
                        marketValueUserVote4 = marketValueUserVote10;
                        T6 = obj;
                        offersBannerResponse = (OffersBannerResponse) T6;
                        if (zu4Var21 == null) {
                        }
                        break;
                    case 8:
                        offersBannerResponse2 = (OffersBannerResponse) this.I;
                        x2gVar7 = (x2g) this.H;
                        x2gVar5 = (x2g) this.G;
                        x2gVar9 = (x2g) this.F;
                        x2gVar8 = (x2g) this.E;
                        cxe cxeVar9 = (cxe) this.D;
                        MarketValueUserVote marketValueUserVote11 = (MarketValueUserVote) this.C;
                        y6a.M(obj);
                        cxeVar3 = cxeVar9;
                        marketValueUserVote4 = marketValueUserVote11;
                        T7 = obj;
                        r91Var = (r91) T7;
                        offersBannerResponse = offersBannerResponse2;
                        x2gVar6 = x2gVar9;
                        MarketValueUserVote marketValueUserVote722 = marketValueUserVote4;
                        cxe cxeVar522 = cxeVar3;
                        yzc yzcVar322 = roeVar.i;
                        playerYearSummaryResponse = (PlayerYearSummaryResponse) yaa.x(x2gVar8);
                        if (playerYearSummaryResponse != null) {
                        }
                        List<PlayerSummaryEvent> list322 = km5.a;
                        List<PlayerSummaryEvent> list422 = list322;
                        AttributeOverviewResponse attributeOverviewResponse22 = (AttributeOverviewResponse) yaa.x(x2gVar6);
                        nationalTeamStatisticsResponse = (NationalTeamStatisticsResponse) yaa.x(x2gVar5);
                        if (nationalTeamStatisticsResponse != null) {
                        }
                        List<NationalTeamStatisticsData> list522 = km5.a;
                        List<NationalTeamStatisticsData> list622 = list522;
                        PlayerCharacteristicsResponse playerCharacteristicsResponse22 = (PlayerCharacteristicsResponse) yaa.x(x2gVar7);
                        List<OffersBanner> banners22 = offersBannerResponse != null ? offersBannerResponse.getBanners() : null;
                        if (r91Var == null) {
                        }
                        yzcVar322.k(new soe(marketValueUserVote722, cxeVar522, list422, attributeOverviewResponse22, list622, playerCharacteristicsResponse22, banners22, r91Var));
                        break;
                    default:
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        break;
                }
            default:
                Integer num = (Integer) obj2;
                qqe qqeVar = (qqe) ltkVar;
                ku3 ku3Var2 = (ku3) this.v;
                lu3 lu3Var2 = lu3.a;
                int i3 = this.u;
                if (i3 == 0) {
                    y6a.M(obj);
                    boolean equals = Boolean.valueOf(num == null).equals(Boolean.TRUE);
                    int i4 = this.w;
                    t2 = equals ? xw3.t(ku3Var2, null, new pqe(qqeVar, i4, null, 1), 3) : null;
                    av4 t10 = xw3.t(ku3Var2, null, new anc(qqeVar, i4, num, (rq3) null, 7), 3);
                    t3 = xw3.t(ku3Var2, null, new pqe(qqeVar, i4, null, 2), 3);
                    this.v = null;
                    this.s = t2;
                    this.t = t3;
                    this.u = 1;
                    w2 = t10.w(this);
                    break;
                } else if (i3 == 1) {
                    t3 = this.t;
                    t2 = this.s;
                    y6a.M(obj);
                    w2 = obj;
                } else if (i3 == 2) {
                    yzcVar2 = (yzc) this.C;
                    HashMap hashMap11 = (HashMap) this.B;
                    hashMap5 = (HashMap) this.A;
                    hashMap2 = (HashMap) this.z;
                    hashMap = (HashMap) this.y;
                    arrayList = (ArrayList) this.x;
                    zu4Var22 = this.t;
                    y6a.M(obj);
                    hashMap4 = hashMap11;
                    T8 = obj;
                    x2gVar10 = (x2g) T8;
                    if (x2gVar10 != null || (transferHistoryResponse = (TransferHistoryResponse) yaa.x(x2gVar10)) == null) {
                        hashMap3 = hashMap5;
                        yzcVar = yzcVar2;
                        t3 = zu4Var22;
                        zu4Var22 = t3;
                        yzcVar2 = yzcVar;
                        hashMap6 = hashMap2;
                        arrayList2 = arrayList;
                        hashMap7 = hashMap3;
                        list = null;
                        this.v = null;
                        this.s = null;
                        this.t = null;
                        this.x = null;
                        this.y = null;
                        this.z = null;
                        this.A = null;
                        this.B = null;
                        this.C = yzcVar2;
                        this.D = list;
                        this.E = arrayList2;
                        this.F = hashMap;
                        this.G = hashMap6;
                        this.H = hashMap7;
                        this.I = hashMap4;
                        this.u = 3;
                        T9 = zu4Var22.T(this);
                        if (T9 != lu3Var2) {
                            arrayList3 = arrayList2;
                            hashMap8 = hashMap;
                            hashMap9 = hashMap6;
                            list2 = list;
                            hashMap10 = hashMap4;
                            PlayerUniqueTournamentsResponse playerUniqueTournamentsResponse = (PlayerUniqueTournamentsResponse) T9;
                            yzcVar2.j(new zse(list2, arrayList3, hashMap8, hashMap9, hashMap7, hashMap10, playerUniqueTournamentsResponse != null ? playerUniqueTournamentsResponse.getUniqueTournaments() : null));
                        }
                        break;
                    } else {
                        ArrayList arrayList4 = arrayList;
                        list = transferHistoryResponse.getTransferHistory();
                        hashMap7 = hashMap5;
                        hashMap6 = hashMap2;
                        arrayList2 = arrayList4;
                        this.v = null;
                        this.s = null;
                        this.t = null;
                        this.x = null;
                        this.y = null;
                        this.z = null;
                        this.A = null;
                        this.B = null;
                        this.C = yzcVar2;
                        this.D = list;
                        this.E = arrayList2;
                        this.F = hashMap;
                        this.G = hashMap6;
                        this.H = hashMap7;
                        this.I = hashMap4;
                        this.u = 3;
                        T9 = zu4Var22.T(this);
                        if (T9 != lu3Var2) {
                        }
                    }
                } else if (i3 != 3) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    HashMap hashMap12 = (HashMap) this.I;
                    hashMap7 = (HashMap) this.H;
                    HashMap hashMap13 = (HashMap) this.G;
                    HashMap hashMap14 = (HashMap) this.F;
                    ?? r52 = (List) this.E;
                    List<Transfer> list7 = (List) this.D;
                    yzc yzcVar4 = (yzc) this.C;
                    y6a.M(obj);
                    hashMap9 = hashMap13;
                    list2 = list7;
                    hashMap8 = hashMap14;
                    arrayList3 = r52;
                    hashMap10 = hashMap12;
                    yzcVar2 = yzcVar4;
                    T9 = obj;
                    PlayerUniqueTournamentsResponse playerUniqueTournamentsResponse2 = (PlayerUniqueTournamentsResponse) T9;
                    yzcVar2.j(new zse(list2, arrayList3, hashMap8, hashMap9, hashMap7, hashMap10, playerUniqueTournamentsResponse2 != null ? playerUniqueTournamentsResponse2.getUniqueTournaments() : null));
                    break;
                }
                x2g x2gVar21 = (x2g) w2;
                arrayList = new ArrayList();
                hashMap = new HashMap();
                hashMap2 = new HashMap();
                hashMap3 = new HashMap();
                hashMap4 = new HashMap();
                if (x2gVar21 instanceof v2g) {
                    PlayerEventsListResponse playerEventsListResponse = (PlayerEventsListResponse) ((v2g) x2gVar21).a;
                    arrayList.addAll(playerEventsListResponse.getEvents());
                    hashMap.putAll(playerEventsListResponse.getPlayedForTeamMap());
                    hashMap2.putAll(playerEventsListResponse.getIncidentsMap());
                    hashMap3.putAll(playerEventsListResponse.getStatisticsMap());
                    hashMap4.putAll(playerEventsListResponse.getOnBenchMap());
                }
                yzcVar = qqeVar.c;
                if (t2 != null) {
                    this.v = null;
                    this.s = null;
                    this.t = t3;
                    this.x = arrayList;
                    this.y = hashMap;
                    this.z = hashMap2;
                    this.A = hashMap3;
                    this.B = hashMap4;
                    this.C = yzcVar;
                    this.u = 2;
                    T8 = t2.T(this);
                    if (T8 != lu3Var2) {
                        zu4Var22 = t3;
                        yzcVar2 = yzcVar;
                        hashMap5 = hashMap3;
                        x2gVar10 = (x2g) T8;
                        if (x2gVar10 != null) {
                        }
                        hashMap3 = hashMap5;
                        yzcVar = yzcVar2;
                        t3 = zu4Var22;
                    }
                }
                zu4Var22 = t3;
                yzcVar2 = yzcVar;
                hashMap6 = hashMap2;
                arrayList2 = arrayList;
                hashMap7 = hashMap3;
                list = null;
                this.v = null;
                this.s = null;
                this.t = null;
                this.x = null;
                this.y = null;
                this.z = null;
                this.A = null;
                this.B = null;
                this.C = yzcVar2;
                this.D = list;
                this.E = arrayList2;
                this.F = hashMap;
                this.G = hashMap6;
                this.H = hashMap7;
                this.I = hashMap4;
                this.u = 3;
                T9 = zu4Var22.T(this);
                if (T9 != lu3Var2) {
                }
        }
        return Unit.a;
    }
}
