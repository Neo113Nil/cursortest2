package defpackage;

import com.sofascore.model.cuptree.CupTreesResponse;
import com.sofascore.model.mvvm.model.OffersBanner;
import com.sofascore.model.mvvm.model.OffersBannerResponse;
import com.sofascore.model.mvvm.model.StandingsTable;
import com.sofascore.model.mvvm.model.UniqueTournamentDetails;
import com.sofascore.model.newNetwork.PlayerOfTheSeasonResponse;
import com.sofascore.model.newNetwork.StandingsResponse;
import com.sofascore.model.newNetwork.UniqueTournamentGroup;
import com.sofascore.model.newNetwork.topperformance.TopPerformanceResponse;
import java.time.ZonedDateTime;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class mv7 extends hoi implements Function2 {
    public List A;
    public PlayerOfTheSeasonResponse B;
    public TopPerformanceResponse C;
    public List D;
    public int E;
    public int F;
    public int G;
    public int H;
    public /* synthetic */ Object I;
    public final /* synthetic */ nv7 J;
    public final /* synthetic */ ZonedDateTime K;
    public av4 r;
    public zu4 s;
    public zu4 t;
    public zu4 u;
    public zu4 v;
    public PlayerOfTheSeasonResponse w;
    public ArrayList x;
    public yzc y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mv7(nv7 nv7Var, ZonedDateTime zonedDateTime, rq3 rq3Var) {
        super(2, rq3Var);
        this.J = nv7Var;
        this.K = zonedDateTime;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        mv7 mv7Var = new mv7(this.J, this.K, rq3Var);
        mv7Var.I = obj;
        return mv7Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((mv7) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x02ff, code lost:
    
        if (r0 != null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x02f4, code lost:
    
        if (r0 == r5) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x028f, code lost:
    
        if (r2 == r5) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x025c, code lost:
    
        if (r2 != r5) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017a  */
    /* JADX WARN: Type inference failed for: r15v5, types: [zu4] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v5 */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        av4 t;
        zu4 p;
        zu4 t2;
        int i;
        Object w;
        zu4 zu4Var;
        av4 av4Var;
        int i2;
        int i3;
        Object T;
        PlayerOfTheSeasonResponse playerOfTheSeasonResponse;
        int i4;
        zu4 zu4Var2;
        int i5;
        zu4 zu4Var3;
        StandingsResponse standingsResponse;
        yzc yzcVar;
        ArrayList arrayList;
        Object T2;
        zu4 zu4Var4;
        List list;
        yzc yzcVar2;
        List<StandingsTable> standings;
        yzc yzcVar3;
        Iterator it;
        UniqueTournamentGroup uniqueTournamentGroup;
        int i6;
        Object T3;
        UniqueTournamentDetails uniqueTournamentDetails;
        zu4 zu4Var5;
        PlayerOfTheSeasonResponse playerOfTheSeasonResponse2;
        int i7;
        TopPerformanceResponse topPerformanceResponse;
        Object T4;
        int i8;
        yzc yzcVar4;
        UniqueTournamentDetails uniqueTournamentDetails2;
        List list2;
        PlayerOfTheSeasonResponse playerOfTheSeasonResponse3;
        TopPerformanceResponse topPerformanceResponse2;
        List list3;
        yzc yzcVar5;
        CupTreesResponse cupTreesResponse;
        Object T5;
        int i9;
        yzc yzcVar6;
        Object w2;
        int i10;
        List<OffersBanner> list4;
        nv7 nv7Var = this.J;
        yzc yzcVar7 = nv7Var.n;
        qv7 qv7Var = nv7Var.i;
        ku3 ku3Var = (ku3) this.I;
        lu3 lu3Var = lu3.a;
        int i11 = 4;
        int i12 = 3;
        rq3 rq3Var = null;
        switch (this.H) {
            case 0:
                y6a.M(obj);
                qv7Var.getClass();
                qv7Var.getClass();
                int i13 = 0;
                int i14 = 1;
                ?? r3 = this.K.toLocalDate().compareTo((ChronoLocalDate) qv7Var.c) >= 0 ? 1 : 0;
                t = xw3.t(ku3Var, null, new lv7(nv7Var, rq3Var, i11), 3);
                av4 t3 = xw3.t(ku3Var, null, new lv7(nv7Var, rq3Var, i14), 3);
                p = yaa.p(ku3Var, r3, new lv7(nv7Var, rq3Var, i13));
                av4 t4 = xw3.t(ku3Var, null, new lv7(nv7Var, rq3Var, 2), 3);
                t2 = xw3.t(ku3Var, null, new lv7(nv7Var, rq3Var, i12), 3);
                av4 t5 = xw3.t(ku3Var, null, new lv7(nv7Var, rq3Var, 5), 3);
                this.I = ku3Var;
                this.r = t;
                this.s = t3;
                this.t = p;
                this.u = t2;
                this.v = t5;
                this.E = 270;
                i = 71636;
                this.F = 71636;
                this.G = r3;
                this.H = 1;
                w = t4.w(this);
                if (w != lu3Var) {
                    zu4Var = t5;
                    av4Var = t3;
                    i2 = 270;
                    i3 = r3;
                    PlayerOfTheSeasonResponse playerOfTheSeasonResponse4 = (PlayerOfTheSeasonResponse) w;
                    this.I = ku3Var;
                    this.r = null;
                    this.s = av4Var;
                    this.t = p;
                    this.u = t2;
                    this.v = zu4Var;
                    this.w = playerOfTheSeasonResponse4;
                    this.E = i2;
                    this.F = i;
                    this.G = i3;
                    this.H = 2;
                    T = t.T(this);
                    if (T != lu3Var) {
                        av4 av4Var2 = av4Var;
                        playerOfTheSeasonResponse = playerOfTheSeasonResponse4;
                        i4 = i;
                        zu4Var2 = av4Var2;
                        i5 = i3;
                        zu4 zu4Var6 = p;
                        zu4Var3 = t2;
                        standingsResponse = (StandingsResponse) T;
                        if (standingsResponse != null || (standings = standingsResponse.getStandings()) == null) {
                            yzcVar = yzcVar7;
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList();
                            Iterator it2 = standings.iterator();
                            while (it2.hasNext()) {
                                StandingsTable standingsTable = (StandingsTable) it2.next();
                                String groupName = standingsTable.getTournament().getGroupName();
                                if (groupName != null) {
                                    it = it2;
                                    yzcVar3 = yzcVar7;
                                    uniqueTournamentGroup = new UniqueTournamentGroup(standingsTable.getTournament().getId(), groupName);
                                } else {
                                    yzcVar3 = yzcVar7;
                                    it = it2;
                                    uniqueTournamentGroup = null;
                                }
                                if (uniqueTournamentGroup != null) {
                                    arrayList.add(uniqueTournamentGroup);
                                }
                                it2 = it;
                                yzcVar7 = yzcVar3;
                            }
                            yzcVar = yzcVar7;
                        }
                        yzc yzcVar8 = nv7Var.j;
                        this.I = ku3Var;
                        this.r = null;
                        this.s = null;
                        this.t = zu4Var6;
                        this.u = zu4Var3;
                        this.v = zu4Var;
                        this.w = playerOfTheSeasonResponse;
                        this.x = arrayList;
                        this.y = yzcVar8;
                        this.E = i2;
                        this.F = i4;
                        this.G = i5;
                        this.H = 3;
                        T2 = zu4Var2.T(this);
                        if (T2 != lu3Var) {
                            zu4Var4 = zu4Var6;
                            list = arrayList;
                            yzcVar2 = yzcVar8;
                            i6 = i5;
                            UniqueTournamentDetails uniqueTournamentDetails3 = (UniqueTournamentDetails) T2;
                            this.I = ku3Var;
                            this.r = null;
                            this.s = null;
                            this.t = zu4Var4;
                            this.u = null;
                            this.v = zu4Var;
                            this.w = playerOfTheSeasonResponse;
                            this.x = null;
                            this.y = yzcVar2;
                            this.z = uniqueTournamentDetails3;
                            this.A = list;
                            this.B = playerOfTheSeasonResponse;
                            this.E = i2;
                            this.F = i4;
                            this.G = i6;
                            this.H = 4;
                            T3 = zu4Var3.T(this);
                            if (T3 != lu3Var) {
                                zu4 zu4Var7 = zu4Var;
                                uniqueTournamentDetails = uniqueTournamentDetails3;
                                zu4Var5 = zu4Var7;
                                playerOfTheSeasonResponse2 = playerOfTheSeasonResponse;
                                i7 = i6;
                                if (playerOfTheSeasonResponse2 != null) {
                                    T3 = null;
                                }
                                topPerformanceResponse = (TopPerformanceResponse) T3;
                                this.I = ku3Var;
                                this.r = null;
                                this.s = null;
                                this.t = zu4Var4;
                                this.u = null;
                                this.v = null;
                                this.w = null;
                                this.x = null;
                                this.y = yzcVar2;
                                this.z = uniqueTournamentDetails;
                                this.A = list;
                                this.B = playerOfTheSeasonResponse;
                                this.C = topPerformanceResponse;
                                this.E = i2;
                                this.F = i4;
                                this.G = i7;
                                this.H = 5;
                                T4 = zu4Var5.T(this);
                                i8 = i7;
                                break;
                            }
                        }
                    }
                }
                return lu3Var;
            case 1:
                int i15 = this.G;
                int i16 = this.F;
                i2 = this.E;
                zu4Var = this.v;
                t2 = this.u;
                p = this.t;
                ?? r15 = this.s;
                t = this.r;
                y6a.M(obj);
                av4Var = r15;
                i = i16;
                w = obj;
                i3 = i15;
                PlayerOfTheSeasonResponse playerOfTheSeasonResponse42 = (PlayerOfTheSeasonResponse) w;
                this.I = ku3Var;
                this.r = null;
                this.s = av4Var;
                this.t = p;
                this.u = t2;
                this.v = zu4Var;
                this.w = playerOfTheSeasonResponse42;
                this.E = i2;
                this.F = i;
                this.G = i3;
                this.H = 2;
                T = t.T(this);
                if (T != lu3Var) {
                }
                return lu3Var;
            case 2:
                int i17 = this.G;
                i4 = this.F;
                i2 = this.E;
                PlayerOfTheSeasonResponse playerOfTheSeasonResponse5 = this.w;
                zu4Var = this.v;
                t2 = this.u;
                p = this.t;
                zu4Var2 = this.s;
                y6a.M(obj);
                playerOfTheSeasonResponse = playerOfTheSeasonResponse5;
                T = obj;
                i5 = i17;
                zu4 zu4Var62 = p;
                zu4Var3 = t2;
                standingsResponse = (StandingsResponse) T;
                if (standingsResponse != null) {
                    break;
                }
                yzcVar = yzcVar7;
                arrayList = null;
                yzc yzcVar82 = nv7Var.j;
                this.I = ku3Var;
                this.r = null;
                this.s = null;
                this.t = zu4Var62;
                this.u = zu4Var3;
                this.v = zu4Var;
                this.w = playerOfTheSeasonResponse;
                this.x = arrayList;
                this.y = yzcVar82;
                this.E = i2;
                this.F = i4;
                this.G = i5;
                this.H = 3;
                T2 = zu4Var2.T(this);
                if (T2 != lu3Var) {
                }
                return lu3Var;
            case 3:
                int i18 = this.G;
                i4 = this.F;
                i2 = this.E;
                yzc yzcVar9 = this.y;
                list = this.x;
                PlayerOfTheSeasonResponse playerOfTheSeasonResponse6 = this.w;
                zu4 zu4Var8 = this.v;
                zu4Var3 = this.u;
                zu4Var4 = this.t;
                y6a.M(obj);
                yzcVar = yzcVar7;
                playerOfTheSeasonResponse = playerOfTheSeasonResponse6;
                zu4Var = zu4Var8;
                yzcVar2 = yzcVar9;
                T2 = obj;
                i6 = i18;
                UniqueTournamentDetails uniqueTournamentDetails32 = (UniqueTournamentDetails) T2;
                this.I = ku3Var;
                this.r = null;
                this.s = null;
                this.t = zu4Var4;
                this.u = null;
                this.v = zu4Var;
                this.w = playerOfTheSeasonResponse;
                this.x = null;
                this.y = yzcVar2;
                this.z = uniqueTournamentDetails32;
                this.A = list;
                this.B = playerOfTheSeasonResponse;
                this.E = i2;
                this.F = i4;
                this.G = i6;
                this.H = 4;
                T3 = zu4Var3.T(this);
                if (T3 != lu3Var) {
                }
                return lu3Var;
            case 4:
                int i19 = this.G;
                i4 = this.F;
                int i20 = this.E;
                playerOfTheSeasonResponse = this.B;
                list = this.A;
                uniqueTournamentDetails = (UniqueTournamentDetails) this.z;
                yzcVar2 = this.y;
                playerOfTheSeasonResponse2 = this.w;
                zu4 zu4Var9 = this.v;
                zu4 zu4Var10 = this.t;
                y6a.M(obj);
                yzcVar = yzcVar7;
                zu4Var5 = zu4Var9;
                zu4Var4 = zu4Var10;
                i2 = i20;
                T3 = obj;
                i7 = i19;
                if (playerOfTheSeasonResponse2 != null) {
                }
                topPerformanceResponse = (TopPerformanceResponse) T3;
                this.I = ku3Var;
                this.r = null;
                this.s = null;
                this.t = zu4Var4;
                this.u = null;
                this.v = null;
                this.w = null;
                this.x = null;
                this.y = yzcVar2;
                this.z = uniqueTournamentDetails;
                this.A = list;
                this.B = playerOfTheSeasonResponse;
                this.C = topPerformanceResponse;
                this.E = i2;
                this.F = i4;
                this.G = i7;
                this.H = 5;
                T4 = zu4Var5.T(this);
                i8 = i7;
                break;
            case 5:
                int i21 = this.G;
                i4 = this.F;
                i2 = this.E;
                topPerformanceResponse = this.C;
                playerOfTheSeasonResponse = this.B;
                list = this.A;
                uniqueTournamentDetails = (UniqueTournamentDetails) this.z;
                yzcVar2 = this.y;
                zu4 zu4Var11 = this.t;
                y6a.M(obj);
                yzcVar = yzcVar7;
                zu4Var4 = zu4Var11;
                T4 = obj;
                i8 = i21;
                yzcVar4 = yzcVar2;
                uniqueTournamentDetails2 = uniqueTournamentDetails;
                list2 = list;
                playerOfTheSeasonResponse3 = playerOfTheSeasonResponse;
                topPerformanceResponse2 = topPerformanceResponse;
                list3 = (List) T4;
                if (zu4Var4 == null) {
                    yzcVar5 = yzcVar4;
                    cupTreesResponse = null;
                    i9 = i8;
                    yzcVar5.j(new jv7(uniqueTournamentDetails2, list2, playerOfTheSeasonResponse3, topPerformanceResponse2, list3, cupTreesResponse));
                    if (yzcVar.d() == null) {
                        bga bgaVar = xld.a;
                        av4 p2 = yaa.p(ku3Var, xld.g(nv7Var.i()), new qu1(nv7Var, i2, (rq3) null, 12));
                        if (p2 != null) {
                            this.I = null;
                            this.r = null;
                            this.s = null;
                            this.t = null;
                            this.u = null;
                            this.v = null;
                            this.w = null;
                            this.x = null;
                            this.y = null;
                            yzcVar6 = yzcVar;
                            this.z = yzcVar6;
                            this.A = null;
                            this.B = null;
                            this.C = null;
                            this.D = null;
                            this.E = i2;
                            this.F = i4;
                            this.G = i9;
                            this.H = 7;
                            w2 = p2.w(this);
                            lu3 lu3Var2 = lu3.a;
                            break;
                        } else {
                            yzcVar6 = yzcVar;
                            list4 = km5.a;
                            yzcVar6.j(list4);
                        }
                    }
                    return Unit.a;
                }
                this.I = ku3Var;
                this.r = null;
                this.s = null;
                this.t = null;
                this.u = null;
                this.v = null;
                this.w = null;
                this.x = null;
                this.y = yzcVar4;
                this.z = uniqueTournamentDetails2;
                this.A = list2;
                this.B = playerOfTheSeasonResponse3;
                this.C = topPerformanceResponse2;
                this.D = list3;
                this.E = i2;
                this.F = i4;
                this.G = i8;
                this.H = 6;
                T5 = zu4Var4.T(this);
                i10 = i8;
                break;
            case 6:
                int i22 = this.G;
                i4 = this.F;
                i2 = this.E;
                list3 = this.D;
                topPerformanceResponse2 = this.C;
                playerOfTheSeasonResponse3 = this.B;
                list2 = this.A;
                uniqueTournamentDetails2 = (UniqueTournamentDetails) this.z;
                yzcVar4 = this.y;
                y6a.M(obj);
                yzcVar = yzcVar7;
                T5 = obj;
                i10 = i22;
                yzc yzcVar10 = yzcVar4;
                cupTreesResponse = (CupTreesResponse) T5;
                yzcVar5 = yzcVar10;
                i9 = i10;
                yzcVar5.j(new jv7(uniqueTournamentDetails2, list2, playerOfTheSeasonResponse3, topPerformanceResponse2, list3, cupTreesResponse));
                if (yzcVar.d() == null) {
                }
                return Unit.a;
            case 7:
                yzcVar6 = (yzc) this.z;
                y6a.M(obj);
                w2 = obj;
                OffersBannerResponse offersBannerResponse = (OffersBannerResponse) w2;
                if (offersBannerResponse != null) {
                    list4 = offersBannerResponse.getBanners();
                    break;
                }
                list4 = km5.a;
                yzcVar6.j(list4);
                return Unit.a;
            default:
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
