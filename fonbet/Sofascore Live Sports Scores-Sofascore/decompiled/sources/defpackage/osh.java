package defpackage;

import com.sofascore.results.sofaSeason.SofaSeasonActivity;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class osh implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SofaSeasonActivity b;

    public /* synthetic */ osh(SofaSeasonActivity sofaSeasonActivity, int i) {
        this.a = i;
        this.b = sofaSeasonActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        SofaSeasonActivity sofaSeasonActivity = this.b;
        switch (i) {
            case 0:
                return sofaSeasonActivity.getDefaultViewModelProviderFactory();
            case 1:
                return sofaSeasonActivity.getViewModelStore();
            default:
                return sofaSeasonActivity.getDefaultViewModelCreationExtras();
        }
    }
}
