package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Category;
import com.sofascore.model.mvvm.model.ServerType;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.StageSeason;
import com.sofascore.model.mvvm.model.StageSeasonKt;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueStage;
import com.sofascore.model.newNetwork.StageFeaturedOdds;
import com.sofascore.model.newNetwork.StageFeaturedOddsResponse;
import com.sofascore.model.newNetwork.StageOddsResponse;
import com.sofascore.model.newNetwork.StageStandingsItem;
import com.sofascore.model.odds.OddsChoice;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.model.odds.ProviderOdds;
import com.vungle.ads.internal.protos.Sdk;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lg4i;", "Lq8;", "", "b4i", "c4i", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class g4i extends q8 {
    public final /* synthetic */ vng e;
    public final s96 f;
    public final t9c g;
    public final umd h;
    public final amd i;
    public Stage j;
    public List k;
    public final String l;
    public final String m;
    public Stage n;
    public final yzc o;
    public final yzc p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4i(Application application, s96 s96Var, t9c t9cVar, umd umdVar, z3k z3kVar, amd amdVar, SharedPreferences sharedPreferences, fqg fqgVar) {
        super(application);
        StageSeason stageSeason;
        UniqueStage uniqueStage;
        Category category;
        StageSeason stageSeason2;
        s96Var.getClass();
        t9cVar.getClass();
        umdVar.getClass();
        z3kVar.getClass();
        amdVar.getClass();
        sharedPreferences.getClass();
        fqgVar.getClass();
        this.e = new vng(z3kVar, sharedPreferences);
        this.f = s96Var;
        this.g = t9cVar;
        this.h = umdVar;
        this.i = amdVar;
        Stage stage = (Stage) fqgVar.a("EVENT");
        this.j = stage;
        String str = null;
        this.l = (stage == null || (stageSeason2 = stage.getStageSeason()) == null) ? null : StageSeasonKt.getSportName(stageSeason2);
        Stage stage2 = this.j;
        if (stage2 != null && (stageSeason = stage2.getStageSeason()) != null && (uniqueStage = stageSeason.getUniqueStage()) != null && (category = uniqueStage.getCategory()) != null) {
            str = category.getName();
        }
        this.m = str;
        yzc yzcVar = new yzc();
        this.o = yzcVar;
        this.p = yzcVar;
    }

    public static ArrayList k(List list, ta4 ta4Var) {
        Integer position;
        list.getClass();
        ta4Var.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            StageStandingsItem stageStandingsItem = (StageStandingsItem) it.next();
            if (stageStandingsItem.getPosition() == null || ((position = stageStandingsItem.getPosition()) != null && position.intValue() == 0)) {
                arrayList2.add(stageStandingsItem);
            }
            int ordinal = ta4Var.ordinal();
            if (ordinal == 0) {
                Integer position2 = stageStandingsItem.getPosition();
                if ((position2 != null ? position2.intValue() : 0) > 0) {
                    arrayList.add(stageStandingsItem);
                }
            } else if (ordinal == 1) {
                Integer sprintPosition = stageStandingsItem.getSprintPosition();
                if ((sprintPosition != null ? sprintPosition.intValue() : 0) > 0) {
                    arrayList.add(stageStandingsItem);
                }
            } else if (ordinal == 2) {
                Integer climbPosition = stageStandingsItem.getClimbPosition();
                if ((climbPosition != null ? climbPosition.intValue() : 0) > 0) {
                    arrayList.add(stageStandingsItem);
                }
            } else {
                if (ordinal != 3) {
                    zzl.b();
                    return null;
                }
                Integer youngRiderPosition = stageStandingsItem.getYoungRiderPosition();
                if ((youngRiderPosition != null ? youngRiderPosition.intValue() : 0) > 0) {
                    arrayList.add(stageStandingsItem);
                }
            }
        }
        int ordinal2 = ta4Var.ordinal();
        if (ordinal2 == 0) {
            n13.u(new rs2(new wqg(23), 17), arrayList);
            arrayList.addAll(arrayList2);
            return arrayList;
        }
        if (ordinal2 == 1) {
            n13.u(new rs2(new wqg(22), 16), arrayList);
            return arrayList;
        }
        if (ordinal2 == 2) {
            n13.u(new rs2(new wqg(21), 15), arrayList);
            return arrayList;
        }
        if (ordinal2 == 3) {
            n13.u(new rs2(new wqg(20), 14), arrayList);
            return arrayList;
        }
        zzl.b();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Stage stage, OddsCountryProvider oddsCountryProvider, sq3 sq3Var) {
        d4i d4iVar;
        int i;
        Stage stage2;
        OddsCountryProvider oddsCountryProvider2;
        StageFeaturedOddsResponse stageFeaturedOddsResponse;
        List<StageFeaturedOdds> featured;
        r9k r9kVar;
        dld dldVar;
        String nameCode;
        Team team;
        Integer marketId;
        Team team2;
        if (sq3Var instanceof d4i) {
            d4iVar = (d4i) sq3Var;
            int i2 = d4iVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d4iVar.v = i2 - Integer.MIN_VALUE;
                Object obj = d4iVar.t;
                lu3 lu3Var = lu3.a;
                i = d4iVar.v;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    d4iVar.r = stage;
                    d4iVar.s = oddsCountryProvider;
                    d4iVar.v = 1;
                    umd umdVar = this.h;
                    umdVar.getClass();
                    obj = s9a.r(new pmd(umdVar, oddsCountryProvider, stage, rq3Var, 1), d4iVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                    stage2 = stage;
                    oddsCountryProvider2 = oddsCountryProvider;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    OddsCountryProvider oddsCountryProvider3 = d4iVar.s;
                    stage2 = d4iVar.r;
                    y6a.M(obj);
                    oddsCountryProvider2 = oddsCountryProvider3;
                }
                stageFeaturedOddsResponse = (StageFeaturedOddsResponse) obj;
                if (stageFeaturedOddsResponse != null || (featured = stageFeaturedOddsResponse.getFeatured()) == null) {
                    return null;
                }
                Context i3 = i();
                boolean z = stage2.getType() == ServerType.SPRINT;
                boolean c = Intrinsics.c(stage2.getSportSlug(), Sports.CYCLING);
                oddsCountryProvider2.getClass();
                StageFeaturedOdds stageFeaturedOdds = (StageFeaturedOdds) CollectionsKt.firstOrNull(featured);
                if (stageFeaturedOdds == null) {
                    r9kVar = null;
                } else if (c) {
                    Integer marketId2 = stageFeaturedOdds.getMarketId();
                    OddsChoice choice = stageFeaturedOdds.getChoice();
                    r9kVar = ug5.m(marketId2, (choice == null || (team2 = choice.getTeam()) == null) ? null : team2.getGender(), null);
                } else {
                    r9kVar = ug5.r(4, stageFeaturedOdds.getMarketId(), z);
                }
                StageFeaturedOdds stageFeaturedOdds2 = (StageFeaturedOdds) CollectionsKt.firstOrNull(featured);
                int intValue = (stageFeaturedOdds2 == null || (marketId = stageFeaturedOdds2.getMarketId()) == null) ? 0 : marketId.intValue();
                StageFeaturedOdds stageFeaturedOdds3 = (StageFeaturedOdds) CollectionsKt.firstOrNull(featured);
                boolean c2 = Intrinsics.c(stageFeaturedOdds3 != null ? stageFeaturedOdds3.isLive() : null, Boolean.TRUE);
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : featured) {
                    OddsChoice choice2 = ((StageFeaturedOdds) obj2).getChoice();
                    if (hashSet.add((choice2 == null || (team = choice2.getTeam()) == null) ? null : Integer.valueOf(team.getId()))) {
                        arrayList.add(obj2);
                    }
                }
                boolean z2 = arrayList.size() < 2;
                ArrayList arrayList2 = new ArrayList();
                for (StageFeaturedOdds stageFeaturedOdds4 : featured) {
                    OddsChoice choice3 = stageFeaturedOdds4.getChoice();
                    if (choice3 != null) {
                        Integer fid = stageFeaturedOdds4.getFid();
                        Integer sourceId = stageFeaturedOdds4.getSourceId();
                        Integer marketId3 = stageFeaturedOdds4.getMarketId();
                        int intValue2 = marketId3 != null ? marketId3.intValue() : 0;
                        String marketName = stageFeaturedOdds4.getMarketName();
                        if (marketName == null) {
                            marketName = "";
                        }
                        String l = rld.l(i3, oddsCountryProvider2, fid, sourceId, intValue2, marketName, choice3);
                        if (z2) {
                            Integer marketId4 = stageFeaturedOdds4.getMarketId();
                            dldVar = z5i.a(i3, choice3, l, ug5.q(Integer.valueOf(marketId4 != null ? marketId4.intValue() : 0), false, false));
                        } else {
                            Team team3 = choice3.getTeam();
                            dldVar = z5i.a(i3, choice3, l, (team3 == null || (nameCode = team3.getNameCode()) == null) ? null : new m9k(nameCode));
                        }
                    } else {
                        dldVar = null;
                    }
                    if (dldVar != null) {
                        arrayList2.add(dldVar);
                    }
                }
                return new fgf(-1, r9kVar, intValue, c2, l6g.W(arrayList2), (ProviderOdds.Type) null, (String) null, 224);
            }
        }
        d4iVar = new d4i(this, sq3Var);
        Object obj3 = d4iVar.t;
        lu3 lu3Var2 = lu3.a;
        i = d4iVar.v;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        stageFeaturedOddsResponse = (StageFeaturedOddsResponse) obj3;
        if (stageFeaturedOddsResponse != null) {
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x013c, code lost:
    
        if (r5 == null) goto L71;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x014c  */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(Stage stage, OddsCountryProvider oddsCountryProvider, Stage stage2, sq3 sq3Var) {
        e4i e4iVar;
        int i;
        Stage stage3;
        OddsCountryProvider oddsCountryProvider2;
        Object obj;
        Stage stage4;
        StageOddsResponse stageOddsResponse;
        List<ProviderOdds> markets;
        ServerType type;
        ProviderOdds d;
        ProviderOdds d2;
        Stage stage5;
        ProviderOdds next;
        Stage stage6;
        String nameCode;
        if (sq3Var instanceof e4i) {
            e4iVar = (e4i) sq3Var;
            int i2 = e4iVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e4iVar.w = i2 - Integer.MIN_VALUE;
                Object obj2 = e4iVar.u;
                lu3 lu3Var = lu3.a;
                i = e4iVar.w;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj2);
                    e4iVar.r = stage;
                    e4iVar.s = oddsCountryProvider;
                    stage3 = stage2;
                    e4iVar.t = stage3;
                    e4iVar.w = 1;
                    umd umdVar = this.h;
                    umdVar.getClass();
                    Object r = s9a.r(new pmd(umdVar, oddsCountryProvider, stage, rq3Var, 0), e4iVar);
                    if (r == lu3Var) {
                        return lu3Var;
                    }
                    oddsCountryProvider2 = oddsCountryProvider;
                    obj = r;
                    stage4 = stage;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Stage stage7 = e4iVar.t;
                    oddsCountryProvider2 = e4iVar.s;
                    stage4 = e4iVar.r;
                    y6a.M(obj2);
                    obj = obj2;
                    stage3 = stage7;
                }
                stageOddsResponse = (StageOddsResponse) obj;
                if (stageOddsResponse != null && (markets = stageOddsResponse.getMarkets()) != null) {
                    ArrayList A = ug5.A(markets);
                    stage3.getClass();
                    type = stage3.getType();
                    switch (type != null ? -1 : y5i.a[type.ordinal()]) {
                        case 1:
                        case 2:
                            Integer sequence = stage3.getSequence();
                            if (sequence != null) {
                                int intValue = sequence.intValue() + 120;
                                DayOfWeek dayOfWeek = hwc.a;
                                d = ug5.d(intValue, A, hwc.f(stage3));
                                break;
                            }
                            d = null;
                            break;
                        case 3:
                        case 4:
                            DayOfWeek dayOfWeek2 = hwc.a;
                            d2 = ug5.d(105, A, hwc.f(stage3));
                            if (d2 == null) {
                                d = ug5.d(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, A, hwc.f(stage3));
                                break;
                            }
                            d = d2;
                            break;
                        case 5:
                        case 6:
                            Integer sequence2 = stage3.getSequence();
                            if (sequence2 == null) {
                                List<Stage> partSubstages = stage3.getPartSubstages();
                                sequence2 = (partSubstages == null || (stage5 = (Stage) CollectionsKt.firstOrNull(partSubstages)) == null) ? null : stage5.getSequence();
                            }
                            if (sequence2 != null) {
                                int intValue2 = sequence2.intValue() + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
                                DayOfWeek dayOfWeek3 = hwc.a;
                                d2 = ug5.d(intValue2, A, hwc.f(stage3));
                                break;
                            }
                            DayOfWeek dayOfWeek4 = hwc.a;
                            d = ug5.d(105, A, hwc.f(stage3));
                            break;
                        case 7:
                            ArrayList arrayList = new ArrayList();
                            Iterator it = A.iterator();
                            while (it.hasNext()) {
                                Object next2 = it.next();
                                ProviderOdds providerOdds = (ProviderOdds) next2;
                                if (providerOdds.getMarketId() == 129 && (stage6 = providerOdds.getStage()) != null && stage3.getId() == stage6.getId()) {
                                    arrayList.add(next2);
                                }
                            }
                            Iterator it2 = arrayList.iterator();
                            if (it2.hasNext()) {
                                next = it2.next();
                                if (it2.hasNext()) {
                                    boolean isLive = ((ProviderOdds) next).isLive();
                                    DayOfWeek dayOfWeek5 = hwc.a;
                                    char c = isLive == hwc.f(stage3) ? (char) 1 : (char) 0;
                                    do {
                                        Object next3 = it2.next();
                                        boolean isLive2 = ((ProviderOdds) next3).isLive();
                                        DayOfWeek dayOfWeek6 = hwc.a;
                                        char c2 = isLive2 == hwc.f(stage3) ? (char) 1 : (char) 0;
                                        if (c < c2) {
                                            next = next3;
                                            c = c2;
                                        }
                                    } while (it2.hasNext());
                                }
                            } else {
                                next = 0;
                            }
                            d = next;
                            break;
                        default:
                            d = null;
                            break;
                    }
                    if (d != null) {
                        Context i3 = i();
                        boolean z = stage4.getType() == ServerType.SPRINT;
                        boolean c3 = Intrinsics.c(stage4.getSportSlug(), Sports.CYCLING);
                        oddsCountryProvider2.getClass();
                        r9k l = c3 ? ug5.l(d) : ug5.r(4, Integer.valueOf(d.getMarketId()), z);
                        int marketId = d.getMarketId();
                        boolean isLive3 = d.isLive();
                        List<OddsChoice> L0 = CollectionsKt.L0(d.getChoices(), 3);
                        ArrayList arrayList2 = new ArrayList(k13.r(L0, 10));
                        for (OddsChoice oddsChoice : L0) {
                            String k = rld.k(i3, oddsCountryProvider2, d, oddsChoice);
                            Team team = oddsChoice.getTeam();
                            arrayList2.add(z5i.a(i3, oddsChoice, k, (team == null || (nameCode = team.getNameCode()) == null) ? null : new m9k(nameCode)));
                        }
                        return new fgf(-1, l, marketId, isLive3, l6g.W(arrayList2), (ProviderOdds.Type) null, (String) null, 224);
                    }
                }
                return null;
            }
        }
        e4iVar = new e4i(this, sq3Var);
        Object obj22 = e4iVar.u;
        lu3 lu3Var2 = lu3.a;
        i = e4iVar.w;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        stageOddsResponse = (StageOddsResponse) obj;
        if (stageOddsResponse != null) {
            ArrayList A2 = ug5.A(markets);
            stage3.getClass();
            type = stage3.getType();
            switch (type != null ? -1 : y5i.a[type.ordinal()]) {
            }
            if (d != null) {
            }
        }
        return null;
    }

    public final void n() {
        List<Stage> partSubstages;
        Stage stage = this.n;
        if (stage == null) {
            return;
        }
        List<Stage> partSubstages2 = stage.getPartSubstages();
        xw3.L(un0.z(this), z45.a, null, new q7c(this, (!Boolean.valueOf(yid.m(partSubstages2 != null ? Integer.valueOf(partSubstages2.size()) : null) == 1).equals(Boolean.TRUE) || (partSubstages = stage.getPartSubstages()) == null) ? null : (Stage) CollectionsKt.firstOrNull(partSubstages), stage, (rq3) null), 2);
    }
}
