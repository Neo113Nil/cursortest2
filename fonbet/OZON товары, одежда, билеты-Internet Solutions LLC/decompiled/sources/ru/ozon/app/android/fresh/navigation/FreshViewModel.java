package ru.ozon.app.android.fresh.navigation;

import M4.c;
import Sg.a;
import androidx.lifecycle.P;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\bJ\u0019\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0011R\u0018\u0010\u001a\u001a\u00060\u0016j\u0002`\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/fresh/navigation/FreshViewModel;", "", "LM4/c;", "savedStateRegistry", "", "init", "(LM4/c;)V", "onClosed", "()V", "pageViewChanged", "", "deeplink", "downloadNewTabConfig", "(Ljava/lang/String;)V", "Landroidx/lifecycle/P;", "Lru/ozon/app/android/fresh/navigation/FreshActivityTabBarState;", "getTabsState", "()Landroidx/lifecycle/P;", "tabsState", "Lru/ozon/app/android/fresh/navigation/FreshScreenState;", "getScreenState", "screenState", "LSg/a;", "Lru/ozon/app/android/analytics/AnalyticsScreenStorage;", "getAnalyticsScreenStorage", "()LSg/a;", "analyticsScreenStorage", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface FreshViewModel {
    void downloadNewTabConfig(String deeplink);

    @NotNull
    a getAnalyticsScreenStorage();

    @NotNull
    P<FreshScreenState> getScreenState();

    @NotNull
    P<FreshActivityTabBarState> getTabsState();

    void init(@NotNull c savedStateRegistry);

    void onClosed();

    void pageViewChanged();
}
