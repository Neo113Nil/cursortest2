package ru.ozon.app.android.search.deeplink;

import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import gk0.q;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.domain.flags.NavigationSliderOptimizationEnabled;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.storefront.ui.navslider.NavigationSliderPreCreateInfoProvider;
import ru.ozon.app.android.storefront.ui.navslider.NavigationSliderV2PreCreateInfoProvider;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tR\u0014\u0010\r\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/search/deeplink/CategoryPageConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "", "onComposerInitialized", "()V", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Landroidx/fragment/app/r;", "getActivity", "()Landroidx/fragment/app/r;", "activity", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CategoryPageConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private final FeatureChecker featureChecker;

    public CategoryPageConfigurator(@NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.featureChecker = featureChecker;
    }

    private final r getActivity() {
        return getContainer().i();
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        ComponentCallbacksC5392m c11 = getContainer().c();
        if (c11 != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(NavigationSliderPreCreateInfoProvider.INSTANCE.getPreCreateInfoList(getActivity()));
            arrayList.addAll(NavigationSliderV2PreCreateInfoProvider.INSTANCE.getPreCreateInfoList(getActivity(), this.featureChecker.isEnabled(NavigationSliderOptimizationEnabled.INSTANCE)));
            q qVar = q.f64554a;
            String componentCallbacksC5392m = c11.toString();
            Intrinsics.checkNotNullExpressionValue(componentCallbacksC5392m, "toString(...)");
            qVar.f(componentCallbacksC5392m, arrayList);
        }
    }
}
