package defpackage;

import com.sofascore.model.database.VoteType;
import com.sofascore.model.firebase.AdType;
import com.sofascore.results.profile.predictions.ProfilePredictionsFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class oaf implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfilePredictionsFragment b;
    public final /* synthetic */ int c;
    public final /* synthetic */ VoteType d;

    public /* synthetic */ oaf(ProfilePredictionsFragment profilePredictionsFragment, int i, VoteType voteType, int i2) {
        this.a = i2;
        this.b = profilePredictionsFragment;
        this.c = i;
        this.d = voteType;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        VoteType voteType = this.d;
        int i2 = this.c;
        ProfilePredictionsFragment profilePredictionsFragment = this.b;
        switch (i) {
            case 0:
                profilePredictionsFragment.u = i2;
                profilePredictionsFragment.v = voteType;
                profilePredictionsFragment.D().m(AdType.RewardedInterstitial.ProfileWhoWillWin, new oaf(profilePredictionsFragment, i2, voteType, 1));
                break;
            default:
                profilePredictionsFragment.E(i2, voteType);
                break;
        }
        return Unit.a;
    }
}
