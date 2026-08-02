package defpackage;

import com.sofascore.results.player.statistics.compare.model.ComparisonSeasonInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ume extends hoi implements Function2 {
    public int r;
    public final /* synthetic */ xme s;
    public final /* synthetic */ int t;
    public final /* synthetic */ ComparisonSeasonInfo.UniqueTournamentSeasonInfo u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ume(xme xmeVar, int i, ComparisonSeasonInfo.UniqueTournamentSeasonInfo uniqueTournamentSeasonInfo, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = xmeVar;
        this.t = i;
        this.u = uniqueTournamentSeasonInfo;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new ume(this.s, this.t, this.u, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ume) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
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
        wve wveVar = this.s.b;
        ComparisonSeasonInfo.UniqueTournamentSeasonInfo uniqueTournamentSeasonInfo = this.u;
        int i2 = uniqueTournamentSeasonInfo.a;
        int i3 = uniqueTournamentSeasonInfo.b;
        String str = uniqueTournamentSeasonInfo.c;
        this.r = 1;
        wveVar.getClass();
        Object P = yaa.P(new sve(wveVar, this.t, i2, i3, str, null, 2), this);
        return P == lu3Var ? lu3Var : P;
    }
}
