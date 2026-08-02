package ru.ozon.app.android.pdp.ui.configurators.ugc.teenMode;

import android.os.Build;
import android.view.Window;
import androidx.core.view.Q0;
import androidx.fragment.app.r;
import androidx.lifecycle.J;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.storefrontcommonwidgets.di.component.StorefrontCommonComponentApi;
import ru.ozon.app.android.storefrontcommonwidgets.services.TeensModeService;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0004H$¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0004H$¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\u000e\u0010\u0003R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/teenMode/BaseTeenModeConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "<init>", "()V", "", "saveDefaultSettings", "Landroidx/lifecycle/J;", "owner", "onStart", "(Landroidx/lifecycle/J;)V", "onStop", "applyTeenModeSettings", "restoreSettings", "applyTransparentNavBar", "restoreDefaultSettings", "", "originalNavBarColor", "Ljava/lang/Integer;", "", "originalContrastEnforced", "Ljava/lang/Boolean;", "originalIsLightNavBar", "isTeenMode", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class BaseTeenModeConfigurator extends ComposerScreenConfig.PageConfigurator {
    private Boolean isTeenMode;
    private Boolean originalContrastEnforced;
    private Boolean originalIsLightNavBar;
    private Integer originalNavBarColor;

    private final void saveDefaultSettings() {
        Window window;
        boolean isNavigationBarContrastEnforced;
        r a11 = getContainer().a();
        if (a11 == null || (window = a11.getWindow()) == null) {
            return;
        }
        Q0 q02 = new Q0(window.getDecorView(), window);
        this.originalNavBarColor = Integer.valueOf(window.getNavigationBarColor());
        this.originalIsLightNavBar = Boolean.valueOf(q02.b());
        if (Build.VERSION.SDK_INT >= 29) {
            isNavigationBarContrastEnforced = window.isNavigationBarContrastEnforced();
            this.originalContrastEnforced = Boolean.valueOf(isNavigationBarContrastEnforced);
        }
    }

    protected abstract void applyTeenModeSettings();

    protected final void applyTransparentNavBar() {
        Window window;
        r a11 = getContainer().a();
        if (a11 == null || (window = a11.getWindow()) == null) {
            return;
        }
        Q0 q02 = new Q0(window.getDecorView(), window);
        window.setNavigationBarColor(0);
        if (Build.VERSION.SDK_INT >= 29) {
            window.setNavigationBarContrastEnforced(false);
        }
        q02.d(!ThemeExtKt.isDarkThemeActive(a11));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@NotNull J owner) {
        TeensModeService teensModeService;
        C7475g composerWidgetComponentStorage;
        Intrinsics.checkNotNullParameter(owner, "owner");
        ConfiguratorReferences references = getReferences();
        Boolean bool = null;
        StorefrontCommonComponentApi storefrontCommonComponentApi = (StorefrontCommonComponentApi) ((references == null || (composerWidgetComponentStorage = references.getComposerWidgetComponentStorage()) == null) ? null : composerWidgetComponentStorage.getComponent(StorefrontCommonComponentApi.class));
        if (storefrontCommonComponentApi != null && (teensModeService = storefrontCommonComponentApi.getTeensModeService()) != null) {
            bool = Boolean.valueOf(teensModeService.isTeensModeOn());
        }
        this.isTeenMode = bool;
        if (Intrinsics.d(bool, Boolean.TRUE)) {
            saveDefaultSettings();
            applyTeenModeSettings();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        if (Intrinsics.d(this.isTeenMode, Boolean.TRUE)) {
            restoreSettings();
        }
    }

    protected final void restoreDefaultSettings() {
        Window window;
        Boolean bool;
        r a11 = getContainer().a();
        if (a11 == null || (window = a11.getWindow()) == null) {
            return;
        }
        Q0 q02 = new Q0(window.getDecorView(), window);
        Integer num = this.originalNavBarColor;
        if (num != null) {
            window.setNavigationBarColor(num.intValue());
        }
        Boolean bool2 = this.originalIsLightNavBar;
        if (bool2 != null) {
            q02.d(bool2.booleanValue());
        }
        if (Build.VERSION.SDK_INT < 29 || (bool = this.originalContrastEnforced) == null) {
            return;
        }
        window.setNavigationBarContrastEnforced(bool.booleanValue());
    }

    protected abstract void restoreSettings();
}
