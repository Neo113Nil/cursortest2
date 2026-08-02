package defpackage;

import com.sofascore.results.referee.RefereeActivity;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class isf implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ RefereeActivity b;

    public /* synthetic */ isf(RefereeActivity refereeActivity, int i) {
        this.a = i;
        this.b = refereeActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        RefereeActivity refereeActivity = this.b;
        switch (i) {
            case 0:
                return refereeActivity.getDefaultViewModelProviderFactory();
            case 1:
                return refereeActivity.getViewModelStore();
            default:
                return refereeActivity.getDefaultViewModelCreationExtras();
        }
    }
}
