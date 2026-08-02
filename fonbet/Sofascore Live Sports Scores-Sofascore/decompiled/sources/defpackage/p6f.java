package defpackage;

import com.sofascore.results.weeklyChallenge.WeeklyChallengeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class p6f implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ WeeklyChallengeViewModel b;
    public final /* synthetic */ ku3 c;
    public final /* synthetic */ e1d d;

    public /* synthetic */ p6f(WeeklyChallengeViewModel weeklyChallengeViewModel, ku3 ku3Var, e1d e1dVar, int i) {
        this.a = i;
        this.b = weeklyChallengeViewModel;
        this.c = ku3Var;
        this.d = e1dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        rq3 rq3Var = null;
        e1d e1dVar = this.d;
        ku3 ku3Var = this.c;
        WeeklyChallengeViewModel weeklyChallengeViewModel = this.b;
        switch (i) {
            case 0:
                e1dVar.setValue(Boolean.TRUE);
                weeklyChallengeViewModel.getClass();
                iz2 z = un0.z(weeklyChallengeViewModel);
                hs4 hs4Var = z45.a;
                xw3.L(z, hq4.c, null, new g4l(weeklyChallengeViewModel, null), 2);
                xw3.L(ku3Var, null, null, new c27(e1dVar, rq3Var, 1), 3);
                break;
            default:
                e1dVar.setValue(Boolean.TRUE);
                weeklyChallengeViewModel.m();
                xw3.L(ku3Var, null, null, new c27(e1dVar, rq3Var, 4), 3);
                break;
        }
        return Unit.a;
    }
}
