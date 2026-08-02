package ru.ozon.app.android.tabbar.ui.controller;

import De.s;
import androidx.fragment.app.ComponentCallbacksC5392m;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.tabbar.ui.BaseOzonBottomTabView;
import ru.ozon.app.android.tabbar.ui.model.BottomNavigationItem;
import ru.ozon.app.android.tabbar.ui.utils.OzonBottomNavigationTabViewExtKt;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;
import xe.C10720e0;
import xe.M;
import xe.N;
import xe.X0;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0019\u0010\bJ\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u001c\u0010\u0010J\u000f\u0010\u001f\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u001e\u0010\bJ\u000f\u0010!\u001a\u00020\u0006H\u0000¢\u0006\u0004\b \u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010$R(\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010%\u001a\u0004\u0018\u00010\r8\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u000e\u0010&\u001a\u0004\b'\u0010(R\"\u0010*\u001a\u00020)8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00060"}, d2 = {"Lru/ozon/app/android/tabbar/ui/controller/TabUiController;", "", "Landroidx/fragment/app/m;", "fragment", "<init>", "(Landroidx/fragment/app/m;)V", "", "onInit", "()V", "Lru/ozon/app/android/tabbar/ui/model/BottomNavigationItem;", "item", "onBind", "(Lru/ozon/app/android/tabbar/ui/model/BottomNavigationItem;)V", "Lru/ozon/app/android/tabbar/ui/BaseOzonBottomTabView;", "tabView", "onAnimation", "(Lru/ozon/app/android/tabbar/ui/BaseOzonBottomTabView;Lru/ozon/app/android/tabbar/ui/model/BottomNavigationItem;)V", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "indicator", "onStaticBadgeUpdated", "(Lru/ozon/app/android/tabbar/ui/BaseOzonBottomTabView;Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;)V", "", "wasTheSame", "onTabSelected", "(Z)V", "onDestroy", "onTabViewRecycled", "(Lru/ozon/app/android/tabbar/ui/BaseOzonBottomTabView;)V", "dispatchUpdate$tabbar_prodGoogleAllVendorsRelease", "dispatchUpdate", "dispatchTabViewRecycled$tabbar_prodGoogleAllVendorsRelease", "dispatchTabViewRecycled", "dispatchDestroy$tabbar_prodGoogleAllVendorsRelease", "dispatchDestroy", "Landroidx/fragment/app/m;", "getFragment", "()Landroidx/fragment/app/m;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lru/ozon/app/android/tabbar/ui/BaseOzonBottomTabView;", "getTabView", "()Lru/ozon/app/android/tabbar/ui/BaseOzonBottomTabView;", "Lxe/M;", "tabScope", "Lxe/M;", "getTabScope", "()Lxe/M;", "setTabScope", "(Lxe/M;)V", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class TabUiController {

    @NotNull
    private final ComponentCallbacksC5392m fragment;

    @NotNull
    private M tabScope;
    private BaseOzonBottomTabView tabView;

    public TabUiController(@NotNull ComponentCallbacksC5392m fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.fragment = fragment;
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.tabScope = N.a(s.f6650a.x().plus(X0.b()));
    }

    public final void dispatchDestroy$tabbar_prodGoogleAllVendorsRelease() {
        this.tabView = null;
        onDestroy();
    }

    public final void dispatchTabViewRecycled$tabbar_prodGoogleAllVendorsRelease() {
        BaseOzonBottomTabView baseOzonBottomTabView = this.tabView;
        if (baseOzonBottomTabView != null) {
            onTabViewRecycled(baseOzonBottomTabView);
        }
    }

    public final void dispatchUpdate$tabbar_prodGoogleAllVendorsRelease(@NotNull BaseOzonBottomTabView tabView, @NotNull BottomNavigationItem item) {
        Intrinsics.checkNotNullParameter(tabView, "tabView");
        Intrinsics.checkNotNullParameter(item, "item");
        this.tabView = tabView;
        onBind(item);
        if (OzonBottomNavigationTabViewExtKt.hasAnimation(tabView)) {
            onAnimation(tabView, item);
        }
        onStaticBadgeUpdated(tabView, item.getIndicator());
    }

    @NotNull
    protected final ComponentCallbacksC5392m getFragment() {
        return this.fragment;
    }

    @NotNull
    protected final M getTabScope() {
        return this.tabScope;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final BaseOzonBottomTabView getTabView() {
        return this.tabView;
    }

    public void onAnimation(@NotNull BaseOzonBottomTabView tabView, @NotNull BottomNavigationItem item) {
        Intrinsics.checkNotNullParameter(tabView, "tabView");
        Intrinsics.checkNotNullParameter(item, "item");
        tabView.playAnimationIfExists();
    }

    public void onBind(@NotNull BottomNavigationItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
    }

    public void onDestroy() {
        if (N.f(this.tabScope)) {
            N.c(this.tabScope, null);
        }
    }

    public void onInit() {
        if (N.f(this.tabScope)) {
            N.c(this.tabScope, null);
        }
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.tabScope = N.a(s.f6650a.x().plus(X0.b()));
    }

    public void onStaticBadgeUpdated(@NotNull BaseOzonBottomTabView tabView, IndicatorDTO indicator) {
        Intrinsics.checkNotNullParameter(tabView, "tabView");
        if (indicator != null) {
            BaseOzonBottomTabView.bindBadge$default(tabView, indicator, null, 2, null);
        } else {
            BaseOzonBottomTabView.removeBadge$default(tabView, null, 1, null);
        }
    }

    public void onTabSelected(boolean wasTheSame) {
    }

    public void onTabViewRecycled(@NotNull BaseOzonBottomTabView tabView) {
        Intrinsics.checkNotNullParameter(tabView, "tabView");
    }
}
