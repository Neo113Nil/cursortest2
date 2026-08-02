package defpackage;

import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.newNetwork.topperformance.TopPerformanceResponse;
import com.sofascore.model.newNetwork.topperformance.response.TopPerformanceStatistics;
import com.sofascore.results.league.fragment.topStats.TopTeamCategoryUiModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class wxa extends hoi implements Function2 {
    public int r;
    public final /* synthetic */ aya s;
    public final /* synthetic */ int t;
    public final /* synthetic */ rxa u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wxa(int i, rq3 rq3Var, rxa rxaVar, aya ayaVar) {
        super(2, rq3Var);
        this.s = ayaVar;
        this.t = i;
        this.u = rxaVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new wxa(this.t, rq3Var, this.u, this.s);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((wxa) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        aya ayaVar = this.s;
        if (i == 0) {
            y6a.M(obj);
            w3b w3bVar = ayaVar.b;
            int i2 = this.u.a;
            String label = Season.SubSeasonType.OVERALL.getLabel();
            this.r = 1;
            obj = w3bVar.V(this.t, i2, this, label);
            if (obj == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        TopPerformanceResponse topPerformanceResponse = (TopPerformanceResponse) obj;
        TopPerformanceStatistics topPerformanceStatistics = topPerformanceResponse != null ? (TopPerformanceStatistics) topPerformanceResponse.getTopPerformanceItems() : null;
        if (topPerformanceStatistics == null) {
            return null;
        }
        gv9<TopTeamCategoryUiModel> x = w1a.x(ayaVar.a, topPerformanceStatistics, hub.c);
        ArrayList arrayList = new ArrayList();
        for (TopTeamCategoryUiModel topTeamCategoryUiModel : x) {
            List L0 = CollectionsKt.L0(topTeamCategoryUiModel.b, 4);
            if (L0.isEmpty()) {
                L0 = null;
            }
            TopTeamCategoryUiModel a = L0 != null ? TopTeamCategoryUiModel.a(topTeamCategoryUiModel, l6g.W(L0), 29) : null;
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }
}
