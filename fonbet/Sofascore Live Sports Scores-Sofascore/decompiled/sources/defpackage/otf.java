package defpackage;

import com.sofascore.results.referral.ReferralActivity;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class otf implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ReferralActivity b;

    public /* synthetic */ otf(ReferralActivity referralActivity, int i) {
        this.a = i;
        this.b = referralActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        ReferralActivity referralActivity = this.b;
        switch (i) {
            case 0:
                return referralActivity.getDefaultViewModelProviderFactory();
            case 1:
                return referralActivity.getViewModelStore();
            default:
                return referralActivity.getDefaultViewModelCreationExtras();
        }
    }
}
