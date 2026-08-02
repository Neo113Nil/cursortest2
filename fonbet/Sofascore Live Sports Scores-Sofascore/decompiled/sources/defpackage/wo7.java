package defpackage;

import com.sofascore.results.fantasy.walkthrough.FantasyWalkthroughActivity;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class wo7 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FantasyWalkthroughActivity b;

    public /* synthetic */ wo7(FantasyWalkthroughActivity fantasyWalkthroughActivity, int i) {
        this.a = i;
        this.b = fantasyWalkthroughActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        FantasyWalkthroughActivity fantasyWalkthroughActivity = this.b;
        switch (i) {
            case 0:
                return fantasyWalkthroughActivity.getDefaultViewModelProviderFactory();
            case 1:
                return fantasyWalkthroughActivity.getViewModelStore();
            case 2:
                return fantasyWalkthroughActivity.getDefaultViewModelCreationExtras();
            case 3:
                return fantasyWalkthroughActivity.getDefaultViewModelProviderFactory();
            case 4:
                return fantasyWalkthroughActivity.getViewModelStore();
            default:
                return fantasyWalkthroughActivity.getDefaultViewModelCreationExtras();
        }
    }
}
