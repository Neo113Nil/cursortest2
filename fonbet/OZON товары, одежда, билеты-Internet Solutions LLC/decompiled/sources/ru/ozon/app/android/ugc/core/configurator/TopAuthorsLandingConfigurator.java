package ru.ozon.app.android.ugc.core.configurator;

import a00.C4911f;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.core.view.C5334o0;
import androidx.core.view.Q0;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import v10.C10183a;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0011\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u00128\u0016X\u0096D¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/ugc/core/configurator/TopAuthorsLandingConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "<init>", "()V", "", "isEnabled", "", "setupFullScreen", "(Z)V", "Landroidx/lifecycle/J;", "owner", "onStart", "(Landroidx/lifecycle/J;)V", "onStop", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "", "originalStatusBarColor", "Ljava/lang/Integer;", "originalNavBarColor", "originalIsLightNavBar", "Ljava/lang/Boolean;", "statusBarColor", "I", "getStatusBarColor", "()I", "Companion", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public class TopAuthorsLandingConfigurator extends ComposerScreenConfig.PageConfigurator {
    private Boolean originalIsLightNavBar;
    private Integer originalNavBarColor;
    private Integer originalStatusBarColor;
    private final int statusBarColor;
    public static final int $stable = 8;

    private final void setupFullScreen(boolean isEnabled) {
        C4911f ownerContainer;
        ComponentCallbacksC5392m c11;
        LinearLayout o11;
        Context context;
        ConfiguratorReferences references = getReferences();
        if (references == null || (ownerContainer = references.getOwnerContainer()) == null || (c11 = ownerContainer.c()) == null) {
            return;
        }
        Window window = c11.requireActivity().getWindow();
        Q0 q02 = new Q0(window.getDecorView(), window);
        Intrinsics.checkNotNullExpressionValue(q02, "getInsetsController(...)");
        if (!isEnabled) {
            View view = c11.getView();
            if (view != null) {
                view.setFitsSystemWindows(true);
            }
            C5334o0.a(window, true);
            Integer num = this.originalStatusBarColor;
            if (num != null) {
                window.setStatusBarColor(num.intValue());
            }
            Integer num2 = this.originalNavBarColor;
            if (num2 != null) {
                window.setNavigationBarColor(num2.intValue());
            }
            if (Build.VERSION.SDK_INT >= 29) {
                window.setNavigationBarContrastEnforced(true);
            }
            Boolean bool = this.originalIsLightNavBar;
            if (bool != null) {
                q02.d(bool.booleanValue());
                return;
            }
            return;
        }
        this.originalStatusBarColor = Integer.valueOf(window.getStatusBarColor());
        this.originalNavBarColor = Integer.valueOf(window.getNavigationBarColor());
        this.originalIsLightNavBar = Boolean.valueOf(q02.b());
        C5334o0.a(window, false);
        View view2 = c11.getView();
        if (view2 != null) {
            view2.setFitsSystemWindows(false);
        }
        window.setStatusBarColor(getStatusBarColor());
        window.setNavigationBarColor(0);
        window.getDecorView().setBackgroundColor(Color.parseColor("#4B2CC3"));
        if (Build.VERSION.SDK_INT >= 29) {
            window.setNavigationBarContrastEnforced(false);
            q02.d(false);
        }
        View view3 = c11.getView();
        if (view3 == null || (context = (o11 = C10183a.o(view3)).getContext()) == null) {
            return;
        }
        ViewExtKt.updatePadding$default(o11, 0, ResourceExtKt.getStatusBarHeight(context), 0, 0, 13, null);
    }

    public int getStatusBarColor() {
        return this.statusBarColor;
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        C4911f ownerContainer;
        ComponentCallbacksC5392m c11;
        View view;
        RecyclerView composerRecyclerViewOrNull;
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        setupFullScreen(true);
        ConfiguratorReferences references = getReferences();
        if (references == null || (ownerContainer = references.getOwnerContainer()) == null || (c11 = ownerContainer.c()) == null || (view = c11.getView()) == null || (composerRecyclerViewOrNull = ComposerViewExtensionKt.composerRecyclerViewOrNull(view)) == null) {
            return;
        }
        composerRecyclerViewOrNull.invalidateItemDecorations();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        setupFullScreen(true);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        setupFullScreen(false);
    }
}
