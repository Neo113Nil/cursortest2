package defpackage;

import com.sofascore.results.weeklyChallenge.WeeklyChallengeActivity;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class p2l implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ WeeklyChallengeActivity b;

    public /* synthetic */ p2l(WeeklyChallengeActivity weeklyChallengeActivity, int i) {
        this.a = i;
        this.b = weeklyChallengeActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        WeeklyChallengeActivity weeklyChallengeActivity = this.b;
        switch (i) {
            case 0:
                return weeklyChallengeActivity.getDefaultViewModelProviderFactory();
            case 1:
                return weeklyChallengeActivity.getViewModelStore();
            default:
                return weeklyChallengeActivity.getDefaultViewModelCreationExtras();
        }
    }
}
