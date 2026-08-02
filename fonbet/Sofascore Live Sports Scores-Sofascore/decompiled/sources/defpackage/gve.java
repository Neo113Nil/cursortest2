package defpackage;

import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.newNetwork.statistics.BaseballSeasonPitchesPerspective;
import com.sofascore.network.api.NetworkCoroutineAPI;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class gve extends hoi implements Function1 {
    public int r;
    public final /* synthetic */ wve s;
    public final /* synthetic */ int t;
    public final /* synthetic */ int u;
    public final /* synthetic */ int v;
    public final /* synthetic */ BaseballSeasonPitchesPerspective w;
    public final /* synthetic */ Season.SubSeasonType x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gve(wve wveVar, int i, int i2, int i3, BaseballSeasonPitchesPerspective baseballSeasonPitchesPerspective, Season.SubSeasonType subSeasonType, rq3 rq3Var) {
        super(1, rq3Var);
        this.s = wveVar;
        this.t = i;
        this.u = i2;
        this.v = i3;
        this.w = baseballSeasonPitchesPerspective;
        this.x = subSeasonType;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new gve(this.s, this.t, this.u, this.v, this.w, this.x, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((gve) create((rq3) obj)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i != 0) {
            if (i == 1) {
                y6a.M(obj);
                return obj;
            }
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y6a.M(obj);
        NetworkCoroutineAPI networkCoroutineAPI = this.s.b;
        String argument = this.w.getArgument();
        String label = this.x.getLabel();
        this.r = 1;
        Object baseballSeasonPitches = networkCoroutineAPI.baseballSeasonPitches(this.t, this.u, this.v, argument, label, this);
        return baseballSeasonPitches == lu3Var ? lu3Var : baseballSeasonPitches;
    }
}
