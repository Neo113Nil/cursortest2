package ru.ozon.app.android.common.productselectormobile.util;

import a00.C4911f;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.productselectormobile.core.AutopickerBottomSheetRepository;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/common/productselectormobile/util/AutopickerBottomSheetConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "Lru/ozon/app/android/common/productselectormobile/core/AutopickerBottomSheetRepository;", "autopickerBottomSheetRepository", "<init>", "(Lru/ozon/app/android/common/productselectormobile/core/AutopickerBottomSheetRepository;)V", "Landroidx/lifecycle/J;", "owner", "", "onResume", "(Landroidx/lifecycle/J;)V", "Lru/ozon/app/android/common/productselectormobile/core/AutopickerBottomSheetRepository;", "product-selector-mobile_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AutopickerBottomSheetConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private final AutopickerBottomSheetRepository autopickerBottomSheetRepository;

    public AutopickerBottomSheetConfigurator(@NotNull AutopickerBottomSheetRepository autopickerBottomSheetRepository) {
        Intrinsics.checkNotNullParameter(autopickerBottomSheetRepository, "autopickerBottomSheetRepository");
        this.autopickerBottomSheetRepository = autopickerBottomSheetRepository;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(@NotNull J owner) {
        ConfiguratorReferences references;
        C4911f ownerContainer;
        ComponentCallbacksC5392m c11;
        ComposerNavigator navigator;
        Intrinsics.checkNotNullParameter(owner, "owner");
        if (!this.autopickerBottomSheetRepository.getShouldCloseBottomSheet() || (references = getReferences()) == null || (ownerContainer = references.getOwnerContainer()) == null || (c11 = ownerContainer.c()) == null || !(c11 instanceof ComposerFragment) || ((ComposerFragment) c11).getConfig().getBottomSheetConfig() == null) {
            return;
        }
        ConfiguratorReferences references2 = getReferences();
        if (references2 != null && (navigator = references2.getNavigator()) != null) {
            navigator.popBackStack();
        }
        this.autopickerBottomSheetRepository.setShouldCloseBottomSheet(false);
    }
}
