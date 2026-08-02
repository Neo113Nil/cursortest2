package defpackage;

import com.sofascore.results.base.BaseActivity;
import com.sofascore.results.featureWalkthrough.FeatureWalkthroughFullScreenDialog;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class q01 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ BaseActivity b;

    public /* synthetic */ q01(BaseActivity baseActivity, int i) {
        this.a = i;
        this.b = baseActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        BaseActivity baseActivity = this.b;
        switch (i) {
            case 0:
                return baseActivity.getDefaultViewModelProviderFactory();
            case 1:
                return baseActivity.getViewModelStore();
            case 2:
                return baseActivity.getDefaultViewModelCreationExtras();
            default:
                ut7 ut7Var = ut7.a;
                FeatureWalkthroughFullScreenDialog featureWalkthroughFullScreenDialog = new FeatureWalkthroughFullScreenDialog();
                featureWalkthroughFullScreenDialog.setArguments(hz8.E(new Pair("TYPE", ut7.e)));
                featureWalkthroughFullScreenDialog.p(baseActivity.k(), "FeatureWalkthroughFullScreenDialog");
                return Unit.a;
        }
    }
}
