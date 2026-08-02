package defpackage;

import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.newNetwork.StatisticsSeasonsResponse;
import com.sofascore.model.newNetwork.UniqueTournamentSeasons;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class jk1 extends hoi implements Function2 {
    public int r;
    public final /* synthetic */ qk1 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk1(qk1 qk1Var, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = qk1Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new jk1(this.s, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((jk1) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0071 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0117  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object P;
        gv9 gv9Var;
        ArrayList arrayList;
        am1 am1Var;
        Map map;
        List<String> list;
        Object obj2;
        lu3 lu3Var = lu3.a;
        int i = this.r;
        qk1 qk1Var = this.s;
        if (i == 0) {
            y6a.M(obj);
            wve wveVar = qk1Var.l;
            int i2 = qk1Var.m;
            this.r = 1;
            wveVar.getClass();
            P = yaa.P(new ive(wveVar, i2, null, 6), this);
            if (P == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
            P = obj;
        }
        StatisticsSeasonsResponse statisticsSeasonsResponse = (StatisticsSeasonsResponse) yaa.x((x2g) P);
        if (statisticsSeasonsResponse != null) {
            List<UniqueTournamentSeasons> uniqueTournamentSeasons = statisticsSeasonsResponse.getUniqueTournamentSeasons();
            ArrayList arrayList2 = new ArrayList(k13.r(uniqueTournamentSeasons, 10));
            for (UniqueTournamentSeasons uniqueTournamentSeasons2 : uniqueTournamentSeasons) {
                int id = uniqueTournamentSeasons2.getUniqueTournament().getId();
                List<Season> seasons = uniqueTournamentSeasons2.getSeasons();
                ArrayList arrayList3 = new ArrayList();
                for (Season season : seasons) {
                    Map<Integer, Map<Integer, List<String>>> typesMap = statisticsSeasonsResponse.getTypesMap();
                    if (typesMap == null || (map = (Map) me4.f(id, typesMap)) == null || (list = (List) me4.f(season.getId(), map)) == null) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList();
                        for (String str : list) {
                            Iterator<E> it = Season.SubSeasonType.getEntries().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    obj2 = null;
                                    break;
                                }
                                obj2 = it.next();
                                if (Intrinsics.c(((Season.SubSeasonType) obj2).getLabel(), str)) {
                                    break;
                                }
                            }
                            Season.SubSeasonType subSeasonType = (Season.SubSeasonType) obj2;
                            if (subSeasonType != null) {
                                arrayList.add(subSeasonType);
                            }
                        }
                    }
                    if (arrayList != null) {
                        if (arrayList.isEmpty()) {
                            arrayList = null;
                        }
                        if (arrayList != null) {
                            am1Var = new am1(season.getId(), id, season.getYear(), l6g.W(arrayList));
                            if (am1Var == null) {
                                arrayList3.add(am1Var);
                            }
                        }
                    }
                    am1Var = null;
                    if (am1Var == null) {
                    }
                }
                arrayList2.add(arrayList3);
            }
            if (arrayList2.isEmpty()) {
                arrayList2 = null;
            }
            if (arrayList2 != null) {
                gv9Var = l6g.W(k13.s(arrayList2));
                if (gv9Var != null) {
                    am1 am1Var2 = (am1) CollectionsKt.Y(gv9Var);
                    Season.SubSeasonType subSeasonType2 = (Season.SubSeasonType) CollectionsKt.Y(am1Var2.d);
                    qk1Var.n(new fk1(null, null, null, null, null, 255), new fa(7, gv9Var, am1Var2, subSeasonType2));
                    int i3 = am1Var2.b;
                    int i4 = am1Var2.a;
                    g9i g9iVar = qk1Var.q;
                    if (g9iVar != null) {
                        g9iVar.e(null);
                    }
                    qk1Var.q = xw3.L(un0.z(qk1Var), null, null, new nk1(qk1Var, i4, subSeasonType2, null, i3, null), 3);
                }
                return Unit.a;
            }
        }
        gv9Var = null;
        if (gv9Var != null) {
        }
        return Unit.a;
    }
}
