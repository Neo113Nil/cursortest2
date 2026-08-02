package ru.ozon.app.android.fresh.navigation;

import B0.C2454a;
import L9.b;
import L9.d;
import M4.c;
import Mw.C3641a;
import Sc.InterfaceC4008j;
import Sc.k;
import Sg.a;
import android.os.Bundle;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.MiniAppAnalytics;
import ru.ozon.app.android.fresh.navigation.FreshScreenState;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.tabbar.miniapp.fresh.FreshTabConfigRepository;
import ru.ozon.app.android.tabbar.miniapp.fresh.FreshTabData;
import xe.C10727i;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ?2\u00020\u00012\u00020\u0002:\u0001?B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\f\b\u0001\u0010\u000b\u001a\u00060\tj\u0002`\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0014*\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\u0019\u0010\u001f\u001a\u00020\u00102\b\u0010\u001e\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010!R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\"R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010#R\u001e\u0010\u000b\u001a\u00060\tj\u0002`\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&R \u0010)\u001a\b\u0012\u0004\u0012\u00020(0'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R \u0010.\u001a\b\u0012\u0004\u0012\u00020-0'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010*\u001a\u0004\b/\u0010,R\u0016\u00101\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u001b\u00105\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\"\u00109\u001a\u0010\u0012\f\u0012\n 8*\u0004\u0018\u00010\u00100\u0010078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R \u0010<\u001a\b\u0012\u0004\u0012\u00020\u00100;8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b<\u0010>¨\u0006@"}, d2 = {"Lru/ozon/app/android/fresh/navigation/FreshViewModelImpl;", "Lru/ozon/app/android/fresh/navigation/FreshViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/tabbar/miniapp/fresh/FreshTabConfigRepository;", "freshTabConfigRepo", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/analytics/modules/MiniAppAnalytics;", "analytics", "LSg/a;", "Lru/ozon/app/android/analytics/AnalyticsScreenStorage;", "analyticsScreenStorage", "<init>", "(Lru/ozon/app/android/tabbar/miniapp/fresh/FreshTabConfigRepository;Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/analytics/modules/MiniAppAnalytics;LSg/a;)V", "Lru/ozon/app/android/tabbar/miniapp/fresh/FreshTabData;", "newTabs", "", "handleNewTabState", "(Lru/ozon/app/android/tabbar/miniapp/fresh/FreshTabData;)V", "", "", "toDeeplinkParamMap", "(Ljava/lang/String;)Ljava/util/Map;", "LM4/c;", "savedStateRegistry", "init", "(LM4/c;)V", "pageViewChanged", "()V", "onClosed", "deeplink", "downloadNewTabConfig", "(Ljava/lang/String;)V", "Lru/ozon/app/android/tabbar/miniapp/fresh/FreshTabConfigRepository;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Lru/ozon/app/android/analytics/modules/MiniAppAnalytics;", "LSg/a;", "getAnalyticsScreenStorage", "()LSg/a;", "Landroidx/lifecycle/V;", "Lru/ozon/app/android/fresh/navigation/FreshActivityTabBarState;", "tabsState", "Landroidx/lifecycle/V;", "getTabsState", "()Landroidx/lifecycle/V;", "Lru/ozon/app/android/fresh/navigation/FreshScreenState;", "screenState", "getScreenState", "", "analyticsIsNotSent", "Z", "isTabbarVisible$delegate", "LSc/j;", "isTabbarVisible", "()Z", "LL9/b;", "kotlin.jvm.PlatformType", "_isRefreshNeeded", "LL9/b;", "LL9/d;", "isRefreshNeeded", "LL9/d;", "()LL9/d;", "Companion", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FreshViewModelImpl extends w0 implements FreshViewModel {

    @NotNull
    private final b<Unit> _isRefreshNeeded;

    @NotNull
    private final MiniAppAnalytics analytics;
    private boolean analyticsIsNotSent;

    @NotNull
    private final a analyticsScreenStorage;

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final FreshTabConfigRepository freshTabConfigRepo;

    @NotNull
    private final d<Unit> isRefreshNeeded;

    /* renamed from: isTabbarVisible$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j isTabbarVisible;

    @NotNull
    private final V<FreshScreenState> screenState;

    @NotNull
    private final V<FreshActivityTabBarState> tabsState;

    public FreshViewModelImpl(@NotNull FreshTabConfigRepository freshTabConfigRepo, @NotNull FeatureChecker featureChecker, @NotNull MiniAppAnalytics analytics, @NotNull a analyticsScreenStorage) {
        Intrinsics.checkNotNullParameter(freshTabConfigRepo, "freshTabConfigRepo");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(analyticsScreenStorage, "analyticsScreenStorage");
        this.freshTabConfigRepo = freshTabConfigRepo;
        this.featureChecker = featureChecker;
        this.analytics = analytics;
        this.analyticsScreenStorage = analyticsScreenStorage;
        this.tabsState = new V<>();
        this.screenState = new V<>();
        this.analyticsIsNotSent = true;
        this.isTabbarVisible = k.b(new FreshViewModelImpl$isTabbarVisible$2(this));
        b<Unit> c11 = b.c();
        Intrinsics.checkNotNullExpressionValue(c11, "create(...)");
        this._isRefreshNeeded = c11;
        this.isRefreshNeeded = c11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleNewTabState(FreshTabData newTabs) {
        getScreenState().setValue(FreshScreenState.Idle.INSTANCE);
        getTabsState().postValue(new FreshActivityTabBarState(newTabs.getBottomNavigationTabs(), newTabs.getTabNavigatorConfig(), newTabs.getActiveTabConfig()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle init$lambda$1(FreshViewModelImpl freshViewModelImpl) {
        Bundle bundle = new Bundle(1);
        FreshActivityTabBarState value = freshViewModelImpl.getTabsState().getValue();
        if (value != null) {
            bundle.putParcelable("ru.ozon.app.android.fresh.presentation.EXTRA_STATE", value);
        }
        return bundle;
    }

    private final boolean isTabbarVisible() {
        return ((Boolean) this.isTabbarVisible.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, String> toDeeplinkParamMap(String str) {
        if (str == null) {
            str = "";
        }
        return C2454a.b("deeplink", str);
    }

    @Override // ru.ozon.app.android.fresh.navigation.FreshViewModel
    public void downloadNewTabConfig(String deeplink) {
        C10727i.c(x0.a(this), null, null, new FreshViewModelImpl$downloadNewTabConfig$1(this, deeplink, null), 3);
    }

    @Override // ru.ozon.app.android.fresh.navigation.FreshViewModel
    @NotNull
    public a getAnalyticsScreenStorage() {
        return this.analyticsScreenStorage;
    }

    @Override // ru.ozon.app.android.fresh.navigation.FreshViewModel
    public void init(@NotNull c savedStateRegistry) {
        FreshActivityTabBarState freshActivityTabBarState;
        Intrinsics.checkNotNullParameter(savedStateRegistry, "savedStateRegistry");
        Bundle b11 = savedStateRegistry.b("ru.ozon.app.android.fresh.presentation.EXTRA_BUNDLE");
        if (b11 != null && (freshActivityTabBarState = (FreshActivityTabBarState) b11.getParcelable("ru.ozon.app.android.fresh.presentation.EXTRA_STATE")) != null) {
            getTabsState().setValue(freshActivityTabBarState);
            getScreenState().setValue(FreshScreenState.Idle.INSTANCE);
        }
        savedStateRegistry.i("ru.ozon.app.android.fresh.presentation.EXTRA_BUNDLE");
        savedStateRegistry.g("ru.ozon.app.android.fresh.presentation.EXTRA_BUNDLE", new C3641a(this, 0));
        if (isTabbarVisible()) {
            return;
        }
        getScreenState().setValue(FreshScreenState.Idle.INSTANCE);
    }

    @Override // ru.ozon.app.android.fresh.navigation.FreshViewModel
    public void onClosed() {
        this.analytics.trackCloseAppEvent();
    }

    @Override // ru.ozon.app.android.fresh.navigation.FreshViewModel
    public void pageViewChanged() {
        if (this.analyticsIsNotSent) {
            this.analytics.trackCampaignEvent();
            this.analyticsIsNotSent = false;
        }
    }

    @Override // ru.ozon.app.android.fresh.navigation.FreshViewModel
    @NotNull
    public V<FreshScreenState> getScreenState() {
        return this.screenState;
    }

    @Override // ru.ozon.app.android.fresh.navigation.FreshViewModel
    @NotNull
    public V<FreshActivityTabBarState> getTabsState() {
        return this.tabsState;
    }
}
