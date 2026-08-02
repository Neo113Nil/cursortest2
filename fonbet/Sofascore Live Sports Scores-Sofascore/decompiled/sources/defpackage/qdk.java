package defpackage;

import com.sofascore.results.ads.UpgradeSofascoreActivity;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class qdk implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ UpgradeSofascoreActivity b;

    public /* synthetic */ qdk(UpgradeSofascoreActivity upgradeSofascoreActivity, int i) {
        this.a = i;
        this.b = upgradeSofascoreActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        UpgradeSofascoreActivity upgradeSofascoreActivity = this.b;
        switch (i) {
            case 0:
                return upgradeSofascoreActivity.getDefaultViewModelProviderFactory();
            case 1:
                return upgradeSofascoreActivity.getViewModelStore();
            default:
                return upgradeSofascoreActivity.getDefaultViewModelCreationExtras();
        }
    }
}
