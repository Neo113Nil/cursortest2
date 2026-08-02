package defpackage;

import com.sofascore.model.fantasy.FantasyLeagueConfig;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class rj7 extends hoi implements Function2 {
    public final /* synthetic */ List r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ tj7 t;
    public final /* synthetic */ Map u;
    public final /* synthetic */ FantasyLeagueConfig v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rj7(List list, boolean z, tj7 tj7Var, Map map, FantasyLeagueConfig fantasyLeagueConfig, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = list;
        this.s = z;
        this.t = tj7Var;
        this.u = map;
        this.v = fantasyLeagueConfig;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new rj7(this.r, this.s, this.t, this.u, this.v, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((rj7) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        List<FantasyRoundPlayerUiModel> list = this.r;
        ArrayList arrayList = new ArrayList(k13.r(list, 10));
        for (FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel : list) {
            boolean z = fantasyRoundPlayerUiModel.m;
            arrayList.add(FantasyRoundPlayerUiModel.b(fantasyRoundPlayerUiModel, null, 0, false, false, false, new Integer(tj7.a(fantasyRoundPlayerUiModel.a, fantasyRoundPlayerUiModel.b.b, this.u, this.v, (z && this.s) ? 3 : z ? 2 : 1)), null, 536862719));
        }
        return arrayList;
    }
}
