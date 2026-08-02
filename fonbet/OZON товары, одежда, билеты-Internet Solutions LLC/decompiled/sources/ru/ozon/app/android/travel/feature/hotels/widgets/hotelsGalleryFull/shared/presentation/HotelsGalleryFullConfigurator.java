package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.shared.presentation;

import Sc.InterfaceC4008j;
import a00.C4911f;
import android.view.Window;
import androidx.core.view.Q0;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.uikit.utils.StatusBarController;
import ru.ozon.app.android.utils.LazyUtilsKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000e\u0010\u0003J\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0012R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u001b\u0010$\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/shared/presentation/HotelsGalleryFullConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "<init>", "()V", "", "captureOriginalState", "Landroidx/fragment/app/m;", "fragment", "applyTransparentStatusBar", "(Landroidx/fragment/app/m;)V", "applyBlackNavigationBar", "restoreOriginalState", "restoreOriginalStatusBar", "restoreOriginalNavigationBar", "onComposerInitialized", "Landroidx/lifecycle/J;", "owner", "onResume", "(Landroidx/lifecycle/J;)V", "onPause", "onDestroy", "", "originalStatusBarColor", "Ljava/lang/Integer;", "", "originalStatusBarLightAppearance", "Ljava/lang/Boolean;", "originalNavBarColor", "originalNavBarLightAppearance", "isStatusBarModified", "Z", "isNavBarModified", "navBarColor$delegate", "LSc/j;", "getNavBarColor", "()I", "navBarColor", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HotelsGalleryFullConfigurator extends ComposerScreenConfig.PageConfigurator {
    private boolean isNavBarModified;
    private boolean isStatusBarModified;

    /* renamed from: navBarColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j navBarColor = LazyUtilsKt.unsafeLazy(new HotelsGalleryFullConfigurator$navBarColor$2(this));
    private Integer originalNavBarColor;
    private Boolean originalNavBarLightAppearance;
    private Integer originalStatusBarColor;
    private Boolean originalStatusBarLightAppearance;

    private final void applyBlackNavigationBar() {
        r a11;
        if (this.isNavBarModified || (a11 = getContainer().a()) == null) {
            return;
        }
        Window window = a11.getWindow();
        if (window != null) {
            window.setNavigationBarColor(getNavBarColor());
            new Q0(window.getDecorView(), window).d(false);
        }
        this.isNavBarModified = true;
    }

    private final void applyTransparentStatusBar(ComponentCallbacksC5392m fragment) {
        if (this.isStatusBarModified) {
            return;
        }
        StatusBarController statusBarController = StatusBarController.INSTANCE;
        StatusBarController.UpdateReason.NewState newState = StatusBarController.UpdateReason.NewState.INSTANCE;
        statusBarController.setStatusBarBackgroundColor(fragment, newState, 0);
        StatusBarController.setStatusBarContentColor$default(statusBarController, fragment, newState, true, false, 8, null);
        this.isStatusBarModified = true;
    }

    private final void captureOriginalState() {
        Window window;
        r a11 = getContainer().a();
        if (a11 == null || (window = a11.getWindow()) == null) {
            return;
        }
        if (this.originalStatusBarColor == null || this.originalStatusBarLightAppearance == null) {
            this.originalStatusBarColor = Integer.valueOf(window.getStatusBarColor());
            this.originalStatusBarLightAppearance = Boolean.valueOf(new Q0(window.getDecorView(), window).c());
        }
        if (this.originalNavBarColor == null) {
            this.originalNavBarColor = Integer.valueOf(window.getNavigationBarColor());
            this.originalNavBarLightAppearance = Boolean.valueOf(new Q0(window.getDecorView(), window).b());
        }
    }

    private final int getNavBarColor() {
        return ((Number) this.navBarColor.getValue()).intValue();
    }

    private final void restoreOriginalNavigationBar() {
        r a11;
        if (this.isNavBarModified && (a11 = getContainer().a()) != null) {
            Window window = a11.getWindow();
            if (window != null) {
                Integer num = this.originalNavBarColor;
                if (num != null) {
                    window.setNavigationBarColor(num.intValue());
                }
                Boolean bool = this.originalNavBarLightAppearance;
                if (bool != null) {
                    new Q0(window.getDecorView(), window).d(bool.booleanValue());
                }
            }
            this.isNavBarModified = false;
        }
    }

    private final void restoreOriginalState() {
        restoreOriginalStatusBar();
        restoreOriginalNavigationBar();
    }

    private final void restoreOriginalStatusBar() {
        ComponentCallbacksC5392m c11;
        if (this.isStatusBarModified && (c11 = getContainer().c()) != null) {
            Integer num = this.originalStatusBarColor;
            if (num != null) {
                StatusBarController.INSTANCE.setStatusBarBackgroundColor(c11, StatusBarController.UpdateReason.Recovery.INSTANCE, num.intValue());
            }
            if (this.originalStatusBarLightAppearance != null) {
                StatusBarController.setStatusBarContentColor$default(StatusBarController.INSTANCE, c11, StatusBarController.UpdateReason.Recovery.INSTANCE, !r0.booleanValue(), false, 8, null);
            }
            this.isStatusBarModified = false;
        }
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        super.onComposerInitialized();
        captureOriginalState();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        restoreOriginalState();
        super.onDestroy(owner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onPause(owner);
        restoreOriginalState();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(@NotNull J owner) {
        C4911f ownerContainer;
        ComponentCallbacksC5392m c11;
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onResume(owner);
        ConfiguratorReferences references = getReferences();
        if (references == null || (ownerContainer = references.getOwnerContainer()) == null || (c11 = ownerContainer.c()) == null) {
            return;
        }
        applyTransparentStatusBar(c11);
        applyBlackNavigationBar();
    }
}
