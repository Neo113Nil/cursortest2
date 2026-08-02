package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.presentation;

import GR.b;
import Ql.c;
import Sc.InterfaceC4008j;
import Vg.d;
import a00.C4911f;
import android.view.View;
import android.view.Window;
import androidx.core.view.C5353y0;
import androidx.core.view.Q0;
import androidx.core.view.Y;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.H;
import d20.AbstractC6065b;
import i10.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.travel.feature.hotels.map.databinding.WidgetHotelsMapInfoBinding;
import ru.ozon.app.android.travel.map.storage.TravelGeoProvidersStorage;
import ru.ozon.app.android.travel.map.viewModel.HotelMapInfoViewModel;
import ru.ozon.app.android.uikit.utils.StatusBarController;
import ru.ozon.app.android.utils.LazyUtilsKt;
import xe.B0;
import xe.C10727i;
import xe.J;

@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001NB;\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b!\u0010 J\u000f\u0010\"\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0016H\u0016¢\u0006\u0004\b$\u0010#J\u0017\u0010&\u001a\u00020\u00162\u0006\u0010%\u001a\u00020\u0002H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0016H\u0016¢\u0006\u0004\b(\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010*R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010+R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010,R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001b\u00106\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010B\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010D\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010G\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010I\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010ER\u0016\u0010J\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010ER\u0016\u0010M\u001a\u0004\u0018\u00010\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010L¨\u0006O"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/HotelsMapInfoV2WidgetHolder;", "Ld20/b;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/HotelsMapInfoV2VO;", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Ll10/i;", "container", "Lru/ozon/app/android/travel/map/viewModel/HotelMapInfoViewModel;", "viewModel", "Lru/ozon/app/android/travel/map/storage/TravelGeoProvidersStorage;", "geoProvidersStorage", "Lru/ozon/app/android/composer/ComposerNavigator;", "composerNavigator", "", "miniAppName", "<init>", "(LVg/d;Ll10/i;Lru/ozon/app/android/travel/map/viewModel/HotelMapInfoViewModel;Lru/ozon/app/android/travel/map/storage/TravelGeoProvidersStorage;Lru/ozon/app/android/composer/ComposerNavigator;Ljava/lang/String;)V", "Landroidx/fragment/app/m;", "fragment", "", "isInDarkMode", "", "changeStatusBarState", "(Landroidx/fragment/app/m;Z)V", "", "initialColor", "restoreStatusBarColor", "(Landroidx/fragment/app/m;IZ)V", "Landroid/view/View;", "rootView", "addInsetsListener", "(Landroid/view/View;)V", "removeInsetsListener", "onWidgetCreated", "()V", "onRefresh", "item", "bind", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/HotelsMapInfoV2VO;)V", "onWidgetDestroyed", "Ll10/i;", "Lru/ozon/app/android/travel/map/viewModel/HotelMapInfoViewModel;", "Lru/ozon/app/android/travel/map/storage/TravelGeoProvidersStorage;", "Lru/ozon/app/android/composer/ComposerNavigator;", "Ljava/lang/String;", "Lru/ozon/app/android/action/ActionHandler$Builder;", "actionBuilder", "Lru/ozon/app/android/action/ActionHandler$Builder;", "Lru/ozon/app/android/travel/feature/hotels/map/databinding/WidgetHotelsMapInfoBinding;", "binding$delegate", "LSc/j;", "getBinding", "()Lru/ozon/app/android/travel/feature/hotels/map/databinding/WidgetHotelsMapInfoBinding;", "binding", "La00/f;", "composerContainer", "La00/f;", "Ll10/b;", "composerController", "Ll10/b;", "Landroidx/fragment/app/m;", "Lxe/J;", "coroutineExceptionHandler", "Lxe/J;", "Lxe/B0;", "initMapJob", "Lxe/B0;", "isMapInited", "Z", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/HotelsMapInfoV2Binder;", "binder", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/HotelsMapInfoV2Binder;", "isDarkThemeActive", "isRefresh", "getMetricView", "()Landroid/view/View;", "metricView", "HotelsMapInfoV2LifecycleObserver", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsMapInfoV2WidgetHolder extends AbstractC6065b<HotelsMapInfoV2VO> {

    @NotNull
    private final ActionHandler.Builder actionBuilder;
    private HotelsMapInfoV2Binder binder;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j binding;

    @NotNull
    private final C4911f composerContainer;

    @NotNull
    private final InterfaceC7851b composerController;

    @NotNull
    private final ComposerNavigator composerNavigator;

    @NotNull
    private final i container;

    @NotNull
    private final J coroutineExceptionHandler;

    @NotNull
    private final ComponentCallbacksC5392m fragment;

    @NotNull
    private final TravelGeoProvidersStorage geoProvidersStorage;
    private B0 initMapJob;
    private boolean isDarkThemeActive;
    private boolean isMapInited;
    private boolean isRefresh;

    @NotNull
    private final String miniAppName;

    @NotNull
    private final HotelMapInfoViewModel viewModel;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000eR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/presentation/HotelsMapInfoV2WidgetHolder$HotelsMapInfoV2LifecycleObserver;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lkotlin/Function0;", "", "startAction", "stopAction", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Landroidx/lifecycle/J;", "owner", "onStart", "(Landroidx/lifecycle/J;)V", "onStop", "onDestroy", "Lkotlin/jvm/functions/Function0;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class HotelsMapInfoV2LifecycleObserver implements DefaultLifecycleObserver {

        @NotNull
        private final Function0<Unit> startAction;

        @NotNull
        private final Function0<Unit> stopAction;

        public HotelsMapInfoV2LifecycleObserver(@NotNull Function0<Unit> startAction, @NotNull Function0<Unit> stopAction) {
            Intrinsics.checkNotNullParameter(startAction, "startAction");
            Intrinsics.checkNotNullParameter(stopAction, "stopAction");
            this.startAction = startAction;
            this.stopAction = stopAction;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onDestroy(@NotNull androidx.lifecycle.J owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            owner.getLifecycle().e(this);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStart(@NotNull androidx.lifecycle.J owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            this.startAction.invoke();
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStop(@NotNull androidx.lifecycle.J owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            this.stopAction.invoke();
        }
    }

    public HotelsMapInfoV2WidgetHolder(@NotNull d customActionHandlersStoreFactory, @NotNull i container, @NotNull HotelMapInfoViewModel viewModel, @NotNull TravelGeoProvidersStorage geoProvidersStorage, @NotNull ComposerNavigator composerNavigator, @NotNull String miniAppName) {
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(geoProvidersStorage, "geoProvidersStorage");
        Intrinsics.checkNotNullParameter(composerNavigator, "composerNavigator");
        Intrinsics.checkNotNullParameter(miniAppName, "miniAppName");
        this.container = container;
        this.viewModel = viewModel;
        this.geoProvidersStorage = geoProvidersStorage;
        this.composerNavigator = composerNavigator;
        this.miniAppName = miniAppName;
        this.actionBuilder = new ActionHandler.Builder(container, this).customActionHandlers(new HotelsMapInfoV2WidgetHolder$actionBuilder$1(customActionHandlersStoreFactory));
        this.binding = LazyUtilsKt.unsafeLazy(new HotelsMapInfoV2WidgetHolder$binding$2(this));
        C4911f Q11 = container.Q();
        this.composerContainer = Q11;
        this.composerController = container.M();
        this.fragment = Q11.j();
        this.coroutineExceptionHandler = new HotelsMapInfoV2WidgetHolder$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addInsetsListener(View rootView) {
        Y.J(rootView, new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5353y0 addInsetsListener$lambda$1(View view, C5353y0 c5353y0) {
        androidx.core.graphics.d a11 = c.a(view, "view", c5353y0, "windowInsets", 7);
        Intrinsics.checkNotNullExpressionValue(a11, "getInsets(...)");
        view.setPadding(a11.f42126a, 0, a11.f42128c, a11.f42129d);
        return C5353y0.f42353b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void changeStatusBarState(ComponentCallbacksC5392m fragment, boolean isInDarkMode) {
        StatusBarController statusBarController = StatusBarController.INSTANCE;
        StatusBarController.UpdateReason.NewState newState = StatusBarController.UpdateReason.NewState.INSTANCE;
        statusBarController.setStatusBarBackgroundColor(fragment, newState, 0);
        StatusBarController.setStatusBarContentColor$default(statusBarController, fragment, newState, isInDarkMode, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WidgetHotelsMapInfoBinding getBinding() {
        return (WidgetHotelsMapInfoBinding) this.binding.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeInsetsListener(View rootView) {
        Y.J(rootView, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void restoreStatusBarColor(ComponentCallbacksC5392m fragment, int initialColor, boolean isInDarkMode) {
        StatusBarController statusBarController = StatusBarController.INSTANCE;
        StatusBarController.UpdateReason.Recovery recovery = StatusBarController.UpdateReason.Recovery.INSTANCE;
        statusBarController.setStatusBarBackgroundColor(fragment, recovery, initialColor);
        StatusBarController.setStatusBarContentColor$default(statusBarController, fragment, recovery, isInDarkMode, false, 8, null);
    }

    @Override // d20.AbstractC6065b
    public View getMetricView() {
        return getBinding().getConstraintLayout();
    }

    @Override // d20.AbstractC6065b
    public void onRefresh() {
        this.isRefresh = true;
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        r a11;
        Window window;
        super.onWidgetCreated();
        ComponentCallbacksC5392m c11 = this.composerContainer.c();
        if (c11 == null || (a11 = this.composerContainer.a()) == null || (window = a11.getWindow()) == null) {
            return;
        }
        getLifecycle().a(new HotelsMapInfoV2LifecycleObserver(new HotelsMapInfoV2WidgetHolder$onWidgetCreated$startAction$1(this, c11), new HotelsMapInfoV2WidgetHolder$onWidgetCreated$stopAction$1(c11, this, window.getStatusBarColor(), !new Q0(window.getDecorView(), window).c())));
        this.binder = new HotelsMapInfoV2Binder(this.viewModel, this);
        HotelsMapViewV2 hotelsMapViewV2 = new HotelsMapViewV2(this.actionBuilder, this.container.X(), this.composerContainer, this.composerController, getBinding(), this.container.Z(), this.composerNavigator);
        HotelsMapInfoV2Binder hotelsMapInfoV2Binder = this.binder;
        if (hotelsMapInfoV2Binder != null) {
            hotelsMapInfoV2Binder.onWidgetCreated(hotelsMapViewV2);
        }
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        this.isMapInited = false;
        HotelsMapInfoV2Binder hotelsMapInfoV2Binder = this.binder;
        if (hotelsMapInfoV2Binder != null) {
            hotelsMapInfoV2Binder.onWidgetDestroyed();
        }
        this.binder = null;
        super.onWidgetDestroyed();
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull HotelsMapInfoV2VO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (this.isRefresh) {
            this.isRefresh = false;
            HotelsMapInfoV2Binder hotelsMapInfoV2Binder = this.binder;
            if (hotelsMapInfoV2Binder != null) {
                hotelsMapInfoV2Binder.mapStateHandler(item);
                return;
            }
            return;
        }
        if (this.isMapInited) {
            HotelsMapInfoV2Binder hotelsMapInfoV2Binder2 = this.binder;
            if (hotelsMapInfoV2Binder2 != null) {
                hotelsMapInfoV2Binder2.mapStateHandler(item);
                return;
            }
            return;
        }
        B0 b02 = this.initMapJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.composerController.e(new l.a.C1079a(0L, null, 3));
        this.initMapJob = C10727i.c(H.a(getLifecycle()), this.coroutineExceptionHandler, null, new HotelsMapInfoV2WidgetHolder$bind$1(this, item, null), 2);
    }
}
