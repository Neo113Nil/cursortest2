package ru.ozon.app.android.tabbar.feature.widgets.hideTabBarOnScroll.presentation.viewmodel;

import androidx.lifecycle.w0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u0003J\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u0003R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\"\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/tabbar/feature/widgets/hideTabBarOnScroll/presentation/viewmodel/HideTabBarOnScrollViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "", "dy", "", "onScrolled", "(I)V", "onViewInVisibleBounds", "onViewOutOfVisibleBounds", "", "scrollingDown", "Z", "hideOnScroll", "getHideOnScroll", "()Z", "setHideOnScroll", "(Z)V", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HideTabBarOnScrollViewModel extends w0 {
    private boolean hideOnScroll;
    private boolean scrollingDown;

    public final boolean getHideOnScroll() {
        return this.hideOnScroll;
    }

    public final void onScrolled(int dy) {
        this.scrollingDown = dy > 0;
    }

    public final void onViewInVisibleBounds() {
        this.hideOnScroll = true;
    }

    public final void onViewOutOfVisibleBounds() {
        this.hideOnScroll = this.scrollingDown;
    }
}
