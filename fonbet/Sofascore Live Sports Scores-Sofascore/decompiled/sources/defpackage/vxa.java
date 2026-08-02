package defpackage;

import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.newNetwork.topperformance.TopPerformanceResponse;
import com.sofascore.model.newNetwork.topperformance.response.TopPerformanceStatistics;
import com.sofascore.results.league.fragment.topStats.TopPlayerCategoryUiModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class vxa extends hoi implements Function2 {
    public int r;
    public final /* synthetic */ aya s;
    public final /* synthetic */ int t;
    public final /* synthetic */ rxa u;
    public final /* synthetic */ int v;
    public final /* synthetic */ int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vxa(aya ayaVar, int i, rxa rxaVar, int i2, int i3, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = ayaVar;
        this.t = i;
        this.u = rxaVar;
        this.v = i2;
        this.w = i3;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new vxa(this.s, this.t, this.u, this.v, this.w, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((vxa) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Object T;
        lu3 lu3Var = lu3.a;
        int i = this.r;
        aya ayaVar = this.s;
        if (i == 0) {
            y6a.M(obj);
            w3b w3bVar = ayaVar.b;
            int i2 = this.u.a;
            String label = Season.SubSeasonType.OVERALL.getLabel();
            this.r = 1;
            T = w3bVar.T(this.t, i2, this, label, null);
            if (T == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
            T = obj;
        }
        TopPerformanceResponse topPerformanceResponse = (TopPerformanceResponse) T;
        TopPerformanceStatistics topPerformanceStatistics = topPerformanceResponse != null ? (TopPerformanceStatistics) topPerformanceResponse.getTopPerformanceItems() : null;
        if (topPerformanceStatistics == null) {
            return null;
        }
        gv9<TopPlayerCategoryUiModel> F = zic.F(ayaVar.a, topPerformanceStatistics, null, null, false, null, hub.c, false, 440);
        ArrayList arrayList = new ArrayList();
        for (TopPlayerCategoryUiModel topPlayerCategoryUiModel : F) {
            List L0 = CollectionsKt.L0(topPlayerCategoryUiModel.b, this.w);
            if (L0.isEmpty()) {
                L0 = null;
            }
            TopPlayerCategoryUiModel a = L0 != null ? TopPlayerCategoryUiModel.a(topPlayerCategoryUiModel, l6g.W(L0), 29) : null;
            if (a != null) {
                arrayList.add(a);
            }
        }
        return CollectionsKt.L0(CollectionsKt.w0(CollectionsKt.L0(arrayList, 1), CollectionsKt.S(arrayList, 1)), this.v);
    }
}
