package ru.ozon.app.android.travel.feature.general.common.widgets.landingNavBar.v1.presentation.controllers;

import android.view.Window;
import androidx.core.view.Q0;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.uikit.utils.StatusBarController;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\nR\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/landingNavBar/v1/presentation/controllers/StatusBarController;", "", "Ll10/i;", "container", "<init>", "(Ll10/i;)V", "", "configStatusBar", "()V", "restoreStatusBar", "Ll10/i;", "Landroidx/fragment/app/m;", "fragment", "Landroidx/fragment/app/m;", "Landroidx/fragment/app/r;", "activity", "Landroidx/fragment/app/r;", "Landroid/view/Window;", "window", "Landroid/view/Window;", "", "originBgColor", "Ljava/lang/Integer;", "", "isBgColorDark", "Ljava/lang/Boolean;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StatusBarController {
    private final r activity;

    @NotNull
    private final i container;
    private final ComponentCallbacksC5392m fragment;
    private final Boolean isBgColorDark;
    private final Integer originBgColor;
    private final Window window;

    public StatusBarController(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.container = container;
        this.fragment = container.Q().c();
        r a11 = container.Q().a();
        this.activity = a11;
        Window window = a11 != null ? a11.getWindow() : null;
        this.window = window;
        this.originBgColor = window != null ? Integer.valueOf(window.getStatusBarColor()) : null;
        this.isBgColorDark = window != null ? Boolean.valueOf(!new Q0(window.getDecorView(), window).c()) : null;
    }

    public final void configStatusBar() {
        ru.ozon.app.android.uikit.utils.StatusBarController statusBarController = ru.ozon.app.android.uikit.utils.StatusBarController.INSTANCE;
        ComponentCallbacksC5392m c11 = this.container.Q().c();
        StatusBarController.UpdateReason.NewState newState = StatusBarController.UpdateReason.NewState.INSTANCE;
        statusBarController.setStatusBarBackgroundColor(c11, newState, 0);
        ru.ozon.app.android.uikit.utils.StatusBarController.setStatusBarContentColor$default(statusBarController, this.container.Q().c(), newState, true, false, 8, null);
        this.container.Z().setFitsSystemWindows(false);
    }

    public final void restoreStatusBar() {
        Integer num = this.originBgColor;
        if (num == null || this.isBgColorDark == null) {
            return;
        }
        ru.ozon.app.android.uikit.utils.StatusBarController statusBarController = ru.ozon.app.android.uikit.utils.StatusBarController.INSTANCE;
        ComponentCallbacksC5392m componentCallbacksC5392m = this.fragment;
        StatusBarController.UpdateReason.Recovery recovery = StatusBarController.UpdateReason.Recovery.INSTANCE;
        statusBarController.setStatusBarBackgroundColor(componentCallbacksC5392m, recovery, num.intValue());
        ru.ozon.app.android.uikit.utils.StatusBarController.setStatusBarContentColor$default(statusBarController, this.fragment, recovery, this.isBgColorDark.booleanValue(), false, 8, null);
        this.container.Z().setFitsSystemWindows(true);
    }
}
