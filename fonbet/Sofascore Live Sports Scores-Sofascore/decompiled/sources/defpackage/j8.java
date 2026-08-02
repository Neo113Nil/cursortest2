package defpackage;

import com.sofascore.results.tutorial.AbstractTutorialActivity;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class j8 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AbstractTutorialActivity b;

    public /* synthetic */ j8(AbstractTutorialActivity abstractTutorialActivity, int i) {
        this.a = i;
        this.b = abstractTutorialActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        AbstractTutorialActivity abstractTutorialActivity = this.b;
        switch (i) {
            case 0:
                return abstractTutorialActivity.getDefaultViewModelProviderFactory();
            case 1:
                return abstractTutorialActivity.getViewModelStore();
            default:
                return abstractTutorialActivity.getDefaultViewModelCreationExtras();
        }
    }
}
