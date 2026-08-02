package ru.ozon.app.android.storefront.stories.playstoriesv3;

import a00.C4911f;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.Window;
import androidx.core.content.a;
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
import ru.ozon.uni.core.R$color;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\rR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0012R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0012R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0012¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/storefront/stories/playstoriesv3/PlayStoriesV3Configurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "<init>", "()V", "Landroid/view/Window;", "window", "", "setupPortraitWindow", "(Landroid/view/Window;)V", "clearWindow", "Landroidx/lifecycle/J;", "owner", "onCreate", "(Landroidx/lifecycle/J;)V", "onStart", "onStop", "", "originalStatusBarColor", "Ljava/lang/Integer;", "", "originalIsAppearanceLightStatusBars", "Ljava/lang/Boolean;", "originalWindowColor", "originalNavigationBarColor", "customStatusBarColor", "customDecorViewColor", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PlayStoriesV3Configurator extends ComposerScreenConfig.PageConfigurator {
    private Integer customDecorViewColor;
    private Integer customStatusBarColor;
    private Boolean originalIsAppearanceLightStatusBars;
    private Integer originalNavigationBarColor;
    private Integer originalStatusBarColor;
    private Integer originalWindowColor;

    private final void clearWindow(Window window) {
        C4911f ownerContainer;
        C4911f ownerContainer2;
        Integer num = this.originalStatusBarColor;
        ComponentCallbacksC5392m componentCallbacksC5392m = null;
        if (num != null) {
            int intValue = num.intValue();
            StatusBarController statusBarController = StatusBarController.INSTANCE;
            ConfiguratorReferences references = getReferences();
            statusBarController.setStatusBarBackgroundColor((references == null || (ownerContainer2 = references.getOwnerContainer()) == null) ? null : ownerContainer2.c(), StatusBarController.UpdateReason.Recovery.INSTANCE, intValue);
        }
        Boolean bool = this.originalIsAppearanceLightStatusBars;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            StatusBarController statusBarController2 = StatusBarController.INSTANCE;
            ConfiguratorReferences references2 = getReferences();
            if (references2 != null && (ownerContainer = references2.getOwnerContainer()) != null) {
                componentCallbacksC5392m = ownerContainer.c();
            }
            StatusBarController.setStatusBarContentColor$default(statusBarController2, componentCallbacksC5392m, StatusBarController.UpdateReason.Recovery.INSTANCE, !booleanValue, false, 8, null);
        }
        Integer num2 = this.originalWindowColor;
        if (num2 != null) {
            window.getDecorView().setBackgroundColor(num2.intValue());
        }
        Integer num3 = this.originalNavigationBarColor;
        if (num3 != null) {
            window.setNavigationBarColor(num3.intValue());
        }
        window.clearFlags(134217728);
    }

    private final void setupPortraitWindow(Window window) {
        ComponentCallbacksC5392m componentCallbacksC5392m;
        ComponentCallbacksC5392m componentCallbacksC5392m2;
        C4911f ownerContainer;
        C4911f ownerContainer2;
        C4911f ownerContainer3;
        ComponentCallbacksC5392m c11;
        View view;
        ConfiguratorReferences references = getReferences();
        if (references != null && (ownerContainer3 = references.getOwnerContainer()) != null && (c11 = ownerContainer3.c()) != null && (view = c11.getView()) != null) {
            view.setFitsSystemWindows(false);
        }
        Integer num = this.customStatusBarColor;
        if (num != null) {
            int intValue = num.intValue();
            StatusBarController statusBarController = StatusBarController.INSTANCE;
            ConfiguratorReferences references2 = getReferences();
            if (references2 == null || (ownerContainer2 = references2.getOwnerContainer()) == null) {
                componentCallbacksC5392m = null;
                componentCallbacksC5392m2 = null;
            } else {
                componentCallbacksC5392m = ownerContainer2.c();
                componentCallbacksC5392m2 = null;
            }
            StatusBarController.UpdateReason.NewState newState = StatusBarController.UpdateReason.NewState.INSTANCE;
            statusBarController.setStatusBarBackgroundColor(componentCallbacksC5392m, newState, intValue);
            ConfiguratorReferences references3 = getReferences();
            StatusBarController.setStatusBarContentColor$default(statusBarController, (references3 == null || (ownerContainer = references3.getOwnerContainer()) == null) ? componentCallbacksC5392m2 : ownerContainer.c(), newState, true, false, 8, null);
        }
        Integer num2 = this.customDecorViewColor;
        if (num2 != null) {
            int intValue2 = num2.intValue();
            window.setNavigationBarColor(intValue2);
            window.getDecorView().setBackgroundColor(intValue2);
        }
        window.setFlags(134217728, 134217728);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(@NotNull J owner) {
        Window window;
        Intrinsics.checkNotNullParameter(owner, "owner");
        r i11 = getContainer().i();
        Window window2 = i11.getWindow();
        if (window2 == null) {
            return;
        }
        View decorView = window2.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        this.originalNavigationBarColor = Integer.valueOf(i11.getWindow().getNavigationBarColor());
        Drawable background = decorView.getBackground();
        Integer num = null;
        ColorDrawable colorDrawable = background instanceof ColorDrawable ? (ColorDrawable) background : null;
        this.originalWindowColor = colorDrawable != null ? Integer.valueOf(colorDrawable.getColor()) : null;
        r a11 = getContainer().a();
        if (a11 != null && (window = a11.getWindow()) != null) {
            num = Integer.valueOf(window.getStatusBarColor());
        }
        this.originalStatusBarColor = num;
        this.originalIsAppearanceLightStatusBars = Boolean.valueOf(new Q0(decorView, window2).c());
        this.customStatusBarColor = 0;
        this.customDecorViewColor = Integer.valueOf(a.getColor(i11, R$color.bg_dark_key));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Window window = getContainer().i().getWindow();
        Intrinsics.f(window);
        setupPortraitWindow(window);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Window window = getContainer().i().getWindow();
        Intrinsics.f(window);
        clearWindow(window);
    }
}
