package ru.ozon.app.android.composer.navigations.navigators;

import EZ.e;
import EZ.g;
import EZ.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.navigations.destinations.BottomSheetComposerFragmentDestination;
import ru.ozon.app.android.composer.navigations.destinations.ComposerNestedPageDestination;
import ru.ozon.app.android.composer.navigations.destinations.ComposerScreenContainer;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import uZ.C9992d;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J/\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\r¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/composer/navigations/navigators/ComposerNestedPageNavigationHandler;", "LEZ/i;", "Lru/ozon/app/android/composer/navigations/destinations/ComposerNestedPageDestination;", "<init>", "()V", "LEZ/g;", "navigator", "LEZ/e;", "response", "", "requestCode", "", "navigateInternal", "(LEZ/g;LEZ/e;I)V", "Lru/ozon/app/android/composer/navigations/destinations/ComposerScreenContainer;", "destination", "getCorrectMinHeight", "(Lru/ozon/app/android/composer/navigations/destinations/ComposerScreenContainer;LEZ/e;)I", "navigate", "(LEZ/g;LEZ/e;)V", "navigateForResult", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposerNestedPageNavigationHandler extends i<ComposerNestedPageDestination> {
    private final int getCorrectMinHeight(ComposerScreenContainer destination, e<ComposerNestedPageDestination> response) {
        ComposerScreenConfig.BottomSheetConfig bottomSheetConfig = response.b().getScreenConfig().getBottomSheetConfig();
        Integer valueOf = bottomSheetConfig != null ? Integer.valueOf(bottomSheetConfig.getMinHeight()) : null;
        ComposerScreenConfig.BottomSheetConfig.Companion companion = ComposerScreenConfig.BottomSheetConfig.INSTANCE;
        int min_height_default = companion.getMIN_HEIGHT_DEFAULT();
        if ((valueOf == null || valueOf.intValue() != min_height_default) && valueOf != null) {
            return bottomSheetConfig.getMinHeight();
        }
        ComposerScreenConfig.BottomSheetConfig bottomSheetConfig2 = destination.getScreenConfig().getBottomSheetConfig();
        return bottomSheetConfig2 != null ? bottomSheetConfig2.getMinHeight() : companion.getMIN_HEIGHT_DEFAULT();
    }

    private final void navigateInternal(g navigator, e<ComposerNestedPageDestination> response, int requestCode) {
        ComposerScreenConfig screenConfig;
        ComposerScreenConfig.BottomSheetConfig bottomSheetConfig;
        ComposerNestedPageDestination b11 = response.b();
        Object d11 = getOzonRouter().d(navigator.getActivity(), b11.getDeeplink());
        if (d11 instanceof ComposerScreenContainer) {
            ComposerScreenContainer composerScreenContainer = (ComposerScreenContainer) d11;
            ComposerScreenConfig screenConfig2 = composerScreenContainer.getScreenConfig();
            if (screenConfig2.getBottomSheetConfig() == null) {
                screenConfig = ComposerScreenConfig.copy$default(screenConfig2, null, null, false, b11.getScreenConfig().getBottomSheetConfig(), false, false, false, false, null, false, false, false, null, null, null, null, false, null, null, null, false, false, null, null, 16777207, null);
            } else {
                ComposerScreenConfig.BottomSheetConfig bottomSheetConfig2 = composerScreenContainer.getScreenConfig().getBottomSheetConfig();
                if (bottomSheetConfig2 != null) {
                    ComposerScreenConfig.BottomSheetConfig bottomSheetConfig3 = b11.getScreenConfig().getBottomSheetConfig();
                    bottomSheetConfig = ComposerScreenConfig.BottomSheetConfig.copy$default(bottomSheetConfig2, null, false, false, null, getCorrectMinHeight(composerScreenContainer, response), bottomSheetConfig3 != null ? bottomSheetConfig3.getCancelable() : true, false, false, false, false, false, 1999, null);
                } else {
                    bottomSheetConfig = null;
                }
                screenConfig = ComposerScreenConfig.copy$default(screenConfig2, null, null, false, bottomSheetConfig, false, false, false, false, null, false, false, false, null, null, null, null, false, null, null, null, false, false, null, null, 16777207, null);
            }
        } else {
            screenConfig = b11.getScreenConfig();
        }
        ComposerScreenConfig composerScreenConfig = screenConfig;
        redirect(response.e(new BottomSheetComposerFragmentDestination(b11.getFragmentTag(), composerScreenConfig, d11 instanceof BottomSheetComposerFragmentDestination ? ((BottomSheetComposerFragmentDestination) d11).getNavigationMode() : C9992d.b.a.f100436a, b11.getOverrideDisplayMode(), null, null, 48, null)), requestCode);
    }

    static /* synthetic */ void navigateInternal$default(ComposerNestedPageNavigationHandler composerNestedPageNavigationHandler, g gVar, e eVar, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        composerNestedPageNavigationHandler.navigateInternal(gVar, eVar, i11);
    }

    @Override // EZ.a
    public void navigate(@NotNull g navigator, @NotNull e<ComposerNestedPageDestination> response) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(response, "response");
        navigateInternal$default(this, navigator, response, 0, 4, null);
    }

    @Override // EZ.a
    public void navigateForResult(@NotNull g navigator, @NotNull e<ComposerNestedPageDestination> response, int requestCode) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(response, "response");
        navigateInternal(navigator, response, requestCode);
    }
}
