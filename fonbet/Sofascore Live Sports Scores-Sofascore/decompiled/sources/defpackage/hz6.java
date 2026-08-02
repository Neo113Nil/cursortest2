package defpackage;

import com.sofascore.model.fantasy.FantasyRoundPlayer;
import com.sofascore.model.newNetwork.AllOddsResponse;
import com.sofascore.model.odds.ProviderOdds;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class hz6 extends hoi implements Function2 {
    public final /* synthetic */ int r = 0;
    public int s;
    public /* synthetic */ int t;
    public final /* synthetic */ int u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hz6(jz6 jz6Var, int i, int i2, boolean z, rq3 rq3Var) {
        super(2, rq3Var);
        this.w = jz6Var;
        this.t = i;
        this.u = i2;
        this.v = z;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.w;
        switch (i) {
            case 0:
                return new hz6((jz6) obj2, this.t, this.u, this.v, rq3Var);
            default:
                hz6 hz6Var = new hz6((umd) obj2, this.u, this.v, rq3Var);
                hz6Var.t = ((Number) obj).intValue();
                return hz6Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                return ((hz6) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            default:
                return ((hz6) create(Integer.valueOf(((Number) obj).intValue()), (rq3) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        Object obj2 = this.w;
        switch (i) {
            case 0:
                jz6 jz6Var = (jz6) obj2;
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    wi7 wi7Var = jz6Var.e;
                    int i3 = this.t;
                    this.s = 1;
                    obj = wi7Var.H(i3, this.u, this);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                FantasyRoundPlayer fantasyRoundPlayer = (FantasyRoundPlayer) obj;
                if (fantasyRoundPlayer != null) {
                    return FantasyRoundPlayerUiModel.b(hkg.g0(fantasyRoundPlayer, jz6Var.i()), null, 0, false, false, this.v, null, null, 536866815);
                }
                return null;
            default:
                int i4 = this.t;
                lu3 lu3Var2 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    fmd fmdVar = new fmd((umd) obj2, this.u, i4, null, 0);
                    this.t = i4;
                    this.s = 1;
                    obj = yaa.P(fmdVar, this);
                    if (obj == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i5 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                AllOddsResponse allOddsResponse = (AllOddsResponse) yaa.x((x2g) obj);
                if (allOddsResponse == null) {
                    return null;
                }
                Iterator<T> it = allOddsResponse.getMarkets().iterator();
                while (it.hasNext()) {
                    ((ProviderOdds) it.next()).setShouldReverseOdds(this.v);
                }
                return allOddsResponse;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hz6(umd umdVar, int i, boolean z, rq3 rq3Var) {
        super(2, rq3Var);
        this.w = umdVar;
        this.u = i;
        this.v = z;
    }
}
