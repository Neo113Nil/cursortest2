package ru.ozon.app.android.pdpvideomolecule.presentation;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.View;
import android.view.Window;
import androidx.core.view.Q0;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.uikit.utils.StatusBarController;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0011\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001c\u0010\u001aR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001eR\u0014\u0010#\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/pdpvideomolecule/presentation/VideoMoleculeConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "<init>", "()V", "", "color", "Lru/ozon/app/android/uikit/utils/StatusBarController$UpdateReason;", "updateReason", "", "setStatusBarColor", "(Ljava/lang/Integer;Lru/ozon/app/android/uikit/utils/StatusBarController$UpdateReason;)V", "", "isBgColorDark", "setStatusBarContentColor", "(Ljava/lang/Boolean;Lru/ozon/app/android/uikit/utils/StatusBarController$UpdateReason;)V", "flags", "fitsSystemWindow", "setStatusBarFlags", "(Ljava/lang/Integer;Z)V", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Landroidx/lifecycle/J;", "owner", "onCreate", "(Landroidx/lifecycle/J;)V", "onStart", "onStop", "portraitFlags", "Ljava/lang/Integer;", "originalStatusBarColor", "isOriginalStatusBarBgDark", "Ljava/lang/Boolean;", "customStatusBarColor", "landscapeFlags", "I", "pdpvideomolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VideoMoleculeConfigurator extends ComposerScreenConfig.PageConfigurator {
    private Integer customStatusBarColor;
    private Boolean isOriginalStatusBarBgDark;
    private final int landscapeFlags = 5894;
    private Integer originalStatusBarColor;
    private Integer portraitFlags;

    private final void setStatusBarColor(Integer color, StatusBarController.UpdateReason updateReason) {
        if (color == null) {
            return;
        }
        StatusBarController.INSTANCE.setStatusBarBackgroundColor(getContainer().c(), updateReason, color.intValue());
    }

    private final void setStatusBarContentColor(Boolean isBgColorDark, StatusBarController.UpdateReason updateReason) {
        if (isBgColorDark == null) {
            return;
        }
        StatusBarController.setStatusBarContentColor$default(StatusBarController.INSTANCE, getContainer().c(), updateReason, isBgColorDark.booleanValue(), false, 8, null);
    }

    private final void setStatusBarFlags(Integer flags, boolean fitsSystemWindow) {
        View view;
        Window window;
        View decorView;
        if (flags == null) {
            return;
        }
        r a11 = getContainer().a();
        if (a11 != null && (window = a11.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            decorView.setSystemUiVisibility(flags.intValue());
        }
        ComponentCallbacksC5392m c11 = getContainer().c();
        if (c11 == null || (view = c11.getView()) == null) {
            return;
        }
        view.setFitsSystemWindows(fitsSystemWindow);
    }

    static /* synthetic */ void setStatusBarFlags$default(VideoMoleculeConfigurator videoMoleculeConfigurator, Integer num, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        videoMoleculeConfigurator.setStatusBarFlags(num, z11);
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        if (newConfig.orientation == 1) {
            setStatusBarFlags$default(this, this.portraitFlags, false, 2, null);
        } else {
            setStatusBarFlags(Integer.valueOf(this.landscapeFlags), false);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(@NotNull J owner) {
        Window window;
        Intrinsics.checkNotNullParameter(owner, "owner");
        r a11 = getContainer().a();
        if (a11 == null || (window = a11.getWindow()) == null) {
            return;
        }
        this.originalStatusBarColor = Integer.valueOf(window.getStatusBarColor());
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        this.portraitFlags = Integer.valueOf(decorView.getSystemUiVisibility());
        this.isOriginalStatusBarBgDark = Boolean.valueOf(!new Q0(decorView, window).c());
        r a12 = getContainer().a();
        this.customStatusBarColor = a12 != null ? Integer.valueOf(ThemeExtKt.themeColor(a12, R$attr.graphicDarkKey)) : null;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@NotNull J owner) {
        Resources resources;
        Configuration configuration;
        Intrinsics.checkNotNullParameter(owner, "owner");
        r a11 = getContainer().a();
        if (a11 == null || (resources = a11.getResources()) == null || (configuration = resources.getConfiguration()) == null || configuration.orientation != 2) {
            setStatusBarFlags$default(this, this.portraitFlags, false, 2, null);
        } else {
            setStatusBarFlags(Integer.valueOf(this.landscapeFlags), false);
        }
        Integer num = this.customStatusBarColor;
        StatusBarController.UpdateReason.NewState newState = StatusBarController.UpdateReason.NewState.INSTANCE;
        setStatusBarColor(num, newState);
        setStatusBarContentColor(Boolean.TRUE, newState);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        setStatusBarFlags$default(this, this.portraitFlags, false, 2, null);
        Integer num = this.originalStatusBarColor;
        StatusBarController.UpdateReason.Recovery recovery = StatusBarController.UpdateReason.Recovery.INSTANCE;
        setStatusBarColor(num, recovery);
        setStatusBarContentColor(this.isOriginalStatusBarBgDark, recovery);
    }
}
