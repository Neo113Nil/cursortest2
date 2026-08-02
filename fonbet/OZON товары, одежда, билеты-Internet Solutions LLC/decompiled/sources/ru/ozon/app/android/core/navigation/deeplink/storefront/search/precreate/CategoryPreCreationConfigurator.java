package ru.ozon.app.android.core.navigation.deeplink.storefront.search.precreate;

import Ib.a;
import android.content.Context;
import androidx.fragment.app.ComponentCallbacksC5392m;
import gk0.n;
import gk0.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.domain.flags.CategoryPreCreateWidgetsNewConfiguration;
import ru.ozon.app.android.precreation.PreCreateWidgetsFacade;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0014¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/core/navigation/deeplink/storefront/search/precreate/CategoryPreCreationConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "LIb/a;", "Lru/ozon/app/android/precreation/PreCreateWidgetsFacade;", "categoryPreCreateWidgetsFacadeLazy", "<init>", "(LIb/a;)V", "Landroidx/fragment/app/m;", "fragment", "", "fillPreCreationViewPoolIfNeeded", "(Landroidx/fragment/app/m;)V", "onComposerInitialized", "()V", "LIb/a;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CategoryPreCreationConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private final a<PreCreateWidgetsFacade> categoryPreCreateWidgetsFacadeLazy;

    public CategoryPreCreationConfigurator(@NotNull a<PreCreateWidgetsFacade> categoryPreCreateWidgetsFacadeLazy) {
        Intrinsics.checkNotNullParameter(categoryPreCreateWidgetsFacadeLazy, "categoryPreCreateWidgetsFacadeLazy");
        this.categoryPreCreateWidgetsFacadeLazy = categoryPreCreateWidgetsFacadeLazy;
    }

    private final void fillPreCreationViewPoolIfNeeded(ComponentCallbacksC5392m fragment) {
        PreCreateWidgetsFacade preCreateWidgetsFacade = this.categoryPreCreateWidgetsFacadeLazy.get();
        Context requireContext = fragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        List<n> preCreateInfos = preCreateWidgetsFacade.getPreCreateInfos(requireContext, CategoryPreCreateWidgetsNewConfiguration.INSTANCE);
        if (preCreateInfos.isEmpty()) {
            return;
        }
        q qVar = q.f64554a;
        String componentCallbacksC5392m = fragment.toString();
        Intrinsics.checkNotNullExpressionValue(componentCallbacksC5392m, "toString(...)");
        qVar.f(componentCallbacksC5392m, preCreateInfos);
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        super.onComposerInitialized();
        ComponentCallbacksC5392m c11 = getContainer().c();
        if (c11 != null) {
            fillPreCreationViewPoolIfNeeded(c11);
        }
    }
}
