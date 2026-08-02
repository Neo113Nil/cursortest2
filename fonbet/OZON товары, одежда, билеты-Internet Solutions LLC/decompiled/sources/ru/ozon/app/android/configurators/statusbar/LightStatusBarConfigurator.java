package ru.ozon.app.android.configurators.statusbar;

import android.graphics.Color;
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

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/configurators/statusbar/LightStatusBarConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "<init>", "()V", "", "", "isDark", "(I)Z", "Landroidx/lifecycle/J;", "owner", "", "onStart", "(Landroidx/lifecycle/J;)V", "onStop", "originalStatusBarColor", "Ljava/lang/Integer;", "isOriginalStatusBarBgDark", "Ljava/lang/Boolean;", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LightStatusBarConfigurator extends ComposerScreenConfig.PageConfigurator {
    private Boolean isOriginalStatusBarBgDark;
    private Integer originalStatusBarColor;

    private final boolean isDark(int i11) {
        return ((double) 1) - (((((double) Color.blue(i11)) * 0.114d) + ((((double) Color.green(i11)) * 0.587d) + (((double) Color.red(i11)) * 0.299d))) / ((double) 255)) >= 0.5d;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@NotNull J owner) {
        r a11;
        Intrinsics.checkNotNullParameter(owner, "owner");
        ComponentCallbacksC5392m c11 = getContainer().c();
        if (c11 == null || (a11 = getContainer().a()) == null) {
            return;
        }
        this.originalStatusBarColor = Integer.valueOf(a11.getWindow().getStatusBarColor());
        this.isOriginalStatusBarBgDark = Boolean.valueOf(!new Q0(r1.getDecorView(), r1).c());
        int themeColor = ThemeExtKt.themeColor(a11, R$attr.layerFloor1);
        StatusBarController statusBarController = StatusBarController.INSTANCE;
        StatusBarController.UpdateReason.NewState newState = StatusBarController.UpdateReason.NewState.INSTANCE;
        statusBarController.setStatusBarBackgroundColor(c11, newState, themeColor);
        statusBarController.setStatusBarContentColor(c11, newState, isDark(themeColor), true);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NotNull J owner) {
        Integer num;
        Intrinsics.checkNotNullParameter(owner, "owner");
        ComponentCallbacksC5392m c11 = getContainer().c();
        if (c11 == null || (num = this.originalStatusBarColor) == null) {
            return;
        }
        int intValue = num.intValue();
        Boolean bool = this.isOriginalStatusBarBgDark;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            StatusBarController statusBarController = StatusBarController.INSTANCE;
            StatusBarController.UpdateReason.Recovery recovery = StatusBarController.UpdateReason.Recovery.INSTANCE;
            statusBarController.setStatusBarBackgroundColor(c11, recovery, intValue);
            statusBarController.setStatusBarContentColor(c11, recovery, booleanValue, true);
        }
    }
}
