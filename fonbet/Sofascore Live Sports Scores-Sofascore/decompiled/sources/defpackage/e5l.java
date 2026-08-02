package defpackage;

import com.sofascore.model.database.VoteType;
import com.sofascore.model.firebase.AdType;
import com.sofascore.results.weeklyChallenge.predictions.WeeklyPredictionsFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class e5l implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ WeeklyPredictionsFragment b;
    public final /* synthetic */ int c;
    public final /* synthetic */ VoteType d;

    public /* synthetic */ e5l(WeeklyPredictionsFragment weeklyPredictionsFragment, int i, VoteType voteType, int i2) {
        this.a = i2;
        this.b = weeklyPredictionsFragment;
        this.c = i;
        this.d = voteType;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        VoteType voteType = this.d;
        int i2 = this.c;
        WeeklyPredictionsFragment weeklyPredictionsFragment = this.b;
        switch (i) {
            case 0:
                weeklyPredictionsFragment.v = i2;
                weeklyPredictionsFragment.w = voteType;
                weeklyPredictionsFragment.D().m(AdType.RewardedInterstitial.ProfileWhoWillWin, new e5l(weeklyPredictionsFragment, i2, voteType, 1));
                break;
            default:
                weeklyPredictionsFragment.E(i2, voteType);
                break;
        }
        return Unit.a;
    }
}
