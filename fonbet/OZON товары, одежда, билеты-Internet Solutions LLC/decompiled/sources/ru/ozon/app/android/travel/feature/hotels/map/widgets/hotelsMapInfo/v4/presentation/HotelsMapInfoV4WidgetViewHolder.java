package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation;

import Vg.d;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.H;
import d20.AbstractC6065b;
import i10.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.AnalyticData;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.ProductFavoriteDelegateProvider;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.storage.auth.AuthStateStorage;
import ru.ozon.app.android.travel.favorite.analytics.HotelFavoriteUnauthorizedAnalytics;
import ru.ozon.app.android.travel.favorite.delegate.HotelFavoriteUnauthorizedClickDelegate;
import ru.ozon.app.android.travel.favorite.delegate.HotelFavoritesForAuthorizedFeatureActivator;
import ru.ozon.app.android.travel.feature.hotels.map.shared.presentation.PageModifier;
import ru.ozon.app.android.travel.feature.hotels.map.shared.presentation.onboarding.HotelsMapInfoOnboardingBinder;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.MapEvent;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.view.HotelsMapInfoV4View;
import ru.ozon.app.android.travel.map.storage.TravelGeoProvidersStorage;
import ru.ozon.app.android.travel.utils.onboarding.presentation.TravelOnboardingViewModel;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.B0;
import xe.C10727i;
import xe.J;

@Metadata(d1 = {"\u0000Ç\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001N\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Bc\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\"\u0010\u001eJ\u000f\u0010#\u001a\u00020\u001cH\u0016¢\u0006\u0004\b#\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010%R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010&R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010'R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010(R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010)R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010/\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R \u00109\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u001c078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010?\u001a\u0004\u0018\u00010>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010B\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u001c\u0010F\u001a\n E*\u0004\u0018\u00010D0D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010L\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010O\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u001a\u0010R\u001a\u00020Q8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U¨\u0006V"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4WidgetViewHolder;", "Ld20/b;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO;", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Ll10/i;", "container", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4ViewModel;", "viewModel", "Lru/ozon/app/android/travel/map/storage/TravelGeoProvidersStorage;", "travelGeoProvidersStorage", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "productFavoriteDelegateProvider", "Lru/ozon/app/android/travel/utils/onboarding/presentation/TravelOnboardingViewModel;", "onboardingViewModel", "", "miniAppName", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "dispatchersProvider", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "authStateStorage", "Lru/ozon/app/android/travel/favorite/analytics/HotelFavoriteUnauthorizedAnalytics;", "favoriteUnauthorizedAnalytics", "<init>", "(LVg/d;Ll10/i;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4ViewModel;Lru/ozon/app/android/travel/map/storage/TravelGeoProvidersStorage;Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;Lru/ozon/app/android/travel/utils/onboarding/presentation/TravelOnboardingViewModel;Ljava/lang/String;Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/storage/auth/AuthStateStorage;Lru/ozon/app/android/travel/favorite/analytics/HotelFavoriteUnauthorizedAnalytics;)V", "", "onWidgetCreated", "()V", "item", "bind", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO;)V", "onRefresh", "onWidgetDestroyed", "Ll10/i;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4ViewModel;", "Lru/ozon/app/android/travel/map/storage/TravelGeoProvidersStorage;", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "Lru/ozon/app/android/travel/utils/onboarding/presentation/TravelOnboardingViewModel;", "Ljava/lang/String;", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "Lxe/B0;", "initMapJob", "Lxe/B0;", "", "isMapInited", "Z", "Lxe/J;", "coroutineExceptionHandler", "Lxe/J;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/view/HotelsMapInfoV4View;", "hotelsMapInfoView", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/view/HotelsMapInfoV4View;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/favorite/delegate/HotelFavoritesForAuthorizedFeatureActivator;", "favoritesForAuthorizedFeatureActivator", "Lru/ozon/app/android/travel/favorite/delegate/HotelFavoritesForAuthorizedFeatureActivator;", "Lru/ozon/app/android/travel/favorite/delegate/HotelFavoriteUnauthorizedClickDelegate;", "favoriteUnauthorizedClickDelegate", "Lru/ozon/app/android/travel/favorite/delegate/HotelFavoriteUnauthorizedClickDelegate;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4Wrapper;", "mapWrapper", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4Wrapper;", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "context", "Landroid/content/Context;", "Ll10/b;", "composerController", "Ll10/b;", "Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/PageModifier;", "pageModifier", "Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/PageModifier;", "ru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4WidgetViewHolder$viewObserver$1", "viewObserver", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4WidgetViewHolder$viewObserver$1;", "Landroid/view/View;", "metricView", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsMapInfoV4WidgetViewHolder extends AbstractC6065b<HotelsMapInfoV4VO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final InterfaceC7851b composerController;

    @NotNull
    private final i container;
    private final Context context;

    @NotNull
    private final J coroutineExceptionHandler;

    @NotNull
    private final CoroutineDispatcherProvider dispatchersProvider;
    private final HotelFavoriteUnauthorizedClickDelegate favoriteUnauthorizedClickDelegate;

    @NotNull
    private final HotelFavoritesForAuthorizedFeatureActivator favoritesForAuthorizedFeatureActivator;

    @NotNull
    private final HotelsMapInfoV4View hotelsMapInfoView;
    private B0 initMapJob;
    private boolean isMapInited;
    private HotelsMapInfoV4Wrapper mapWrapper;

    @NotNull
    private final View metricView;

    @NotNull
    private final String miniAppName;

    @NotNull
    private final TravelOnboardingViewModel onboardingViewModel;

    @NotNull
    private final PageModifier pageModifier;

    @NotNull
    private final ProductFavoriteDelegateProvider productFavoriteDelegateProvider;

    @NotNull
    private final TravelGeoProvidersStorage travelGeoProvidersStorage;

    @NotNull
    private final HotelsMapInfoV4ViewModel viewModel;

    @NotNull
    private final HotelsMapInfoV4WidgetViewHolder$viewObserver$1 viewObserver;

    /* JADX WARN: Type inference failed for: r2v8, types: [ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4WidgetViewHolder$viewObserver$1] */
    public HotelsMapInfoV4WidgetViewHolder(@NotNull d customActionHandlersStoreFactory, @NotNull i container, @NotNull HotelsMapInfoV4ViewModel viewModel, @NotNull TravelGeoProvidersStorage travelGeoProvidersStorage, @NotNull ProductFavoriteDelegateProvider productFavoriteDelegateProvider, @NotNull TravelOnboardingViewModel onboardingViewModel, @NotNull String miniAppName, @NotNull CoroutineDispatcherProvider dispatchersProvider, @NotNull FeatureChecker featureChecker, @NotNull AuthStateStorage authStateStorage, @NotNull HotelFavoriteUnauthorizedAnalytics favoriteUnauthorizedAnalytics) {
        ViewGroup rootView;
        NotificationLayoutManager asNotificationLayoutManager$default;
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(travelGeoProvidersStorage, "travelGeoProvidersStorage");
        Intrinsics.checkNotNullParameter(productFavoriteDelegateProvider, "productFavoriteDelegateProvider");
        Intrinsics.checkNotNullParameter(onboardingViewModel, "onboardingViewModel");
        Intrinsics.checkNotNullParameter(miniAppName, "miniAppName");
        Intrinsics.checkNotNullParameter(dispatchersProvider, "dispatchersProvider");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(authStateStorage, "authStateStorage");
        Intrinsics.checkNotNullParameter(favoriteUnauthorizedAnalytics, "favoriteUnauthorizedAnalytics");
        this.container = container;
        this.viewModel = viewModel;
        this.travelGeoProvidersStorage = travelGeoProvidersStorage;
        this.productFavoriteDelegateProvider = productFavoriteDelegateProvider;
        this.onboardingViewModel = onboardingViewModel;
        this.miniAppName = miniAppName;
        this.dispatchersProvider = dispatchersProvider;
        this.coroutineExceptionHandler = new HotelsMapInfoV4WidgetViewHolder$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0, this);
        Context L11 = container.L();
        Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
        HotelsMapInfoV4View hotelsMapInfoV4View = new HotelsMapInfoV4View(L11);
        hotelsMapInfoV4View.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.hotelsMapInfoView = hotelsMapInfoV4View;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(container, this).customActionHandlers(new HotelsMapInfoV4WidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).onClick(new HotelsMapInfoV4WidgetViewHolder$actionHandler$2(this)).buildHandler();
        this.actionHandler = buildHandler;
        this.favoritesForAuthorizedFeatureActivator = new HotelFavoritesForAuthorizedFeatureActivator(featureChecker, authStateStorage.isAuthenticated(), authStateStorage.getAuthState());
        ComponentCallbacksC5392m c11 = container.Q().c();
        HotelFavoriteUnauthorizedClickDelegate hotelFavoriteUnauthorizedClickDelegate = null;
        if (c11 != null && (rootView = ContextExtKt.getRootView(c11)) != null && (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(rootView, null, 1, null)) != null) {
            hotelFavoriteUnauthorizedClickDelegate = new HotelFavoriteUnauthorizedClickDelegate(asNotificationLayoutManager$default, buildHandler, container.Q().g(), favoriteUnauthorizedAnalytics);
        }
        this.favoriteUnauthorizedClickDelegate = hotelFavoriteUnauthorizedClickDelegate;
        this.context = container.L();
        this.composerController = container.M();
        this.pageModifier = new PageModifier(hotelsMapInfoV4View);
        this.viewObserver = new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4WidgetViewHolder$viewObserver$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(androidx.lifecycle.J owner) {
                HotelsMapInfoV4View hotelsMapInfoV4View2;
                Intrinsics.checkNotNullParameter(owner, "owner");
                hotelsMapInfoV4View2 = HotelsMapInfoV4WidgetViewHolder.this.hotelsMapInfoView;
                hotelsMapInfoV4View2.onDestroy();
                owner.getLifecycle().e(this);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStart(androidx.lifecycle.J owner) {
                HotelsMapInfoV4View hotelsMapInfoV4View2;
                Intrinsics.checkNotNullParameter(owner, "owner");
                hotelsMapInfoV4View2 = HotelsMapInfoV4WidgetViewHolder.this.hotelsMapInfoView;
                hotelsMapInfoV4View2.onStart();
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStop(androidx.lifecycle.J owner) {
                HotelsMapInfoV4View hotelsMapInfoV4View2;
                Intrinsics.checkNotNullParameter(owner, "owner");
                hotelsMapInfoV4View2 = HotelsMapInfoV4WidgetViewHolder.this.hotelsMapInfoView;
                hotelsMapInfoV4View2.onStop();
            }
        };
        this.metricView = hotelsMapInfoV4View;
    }

    @Override // d20.AbstractC6065b
    @NotNull
    public View getMetricView() {
        return this.metricView;
    }

    @Override // d20.AbstractC6065b
    public void onRefresh() {
        super.onRefresh();
        this.viewModel.onEvent(MapEvent.OnRefresh.INSTANCE);
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        this.pageModifier.attachToPage(this.container.Z());
        i iVar = this.container;
        l viewItem = getViewItem();
        AnalyticData analyticData = new AnalyticData(viewItem != null ? viewItem.n() : null, getViewItem());
        HotelsMapInfoV4View hotelsMapInfoV4View = this.hotelsMapInfoView;
        HotelsMapInfoV4ViewModel hotelsMapInfoV4ViewModel = this.viewModel;
        AbstractC5434v lifecycle = getLifecycle();
        Function1<AtomAction, Unit> function1 = this.actionHandler;
        ProductFavoriteDelegateProvider productFavoriteDelegateProvider = this.productFavoriteDelegateProvider;
        HotelsMapInfoV4VO boundData = getBoundData();
        this.mapWrapper = new HotelsMapInfoV4Wrapper(analyticData, productFavoriteDelegateProvider, new HotelsMapInfoOnboardingBinder(this, boundData != null ? Long.valueOf(boundData.getId()) : null, this.container, this.onboardingViewModel), iVar, function1, hotelsMapInfoV4View, hotelsMapInfoV4ViewModel, lifecycle, this.dispatchersProvider, this.favoritesForAuthorizedFeatureActivator, this.favoriteUnauthorizedClickDelegate);
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        this.viewModel.onEvent(new MapEvent.OnRemoveView(this.hotelsMapInfoView.saveCardsRvState()));
        this.isMapInited = false;
        HotelsMapInfoV4Wrapper hotelsMapInfoV4Wrapper = this.mapWrapper;
        if (hotelsMapInfoV4Wrapper != null) {
            hotelsMapInfoV4Wrapper.onDestroy();
        }
        this.mapWrapper = null;
        this.pageModifier.detachFromPage(this.container.Z());
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull HotelsMapInfoV4VO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (this.isMapInited && !this.hotelsMapInfoView.isControllerNull()) {
            this.viewModel.onEvent(new MapEvent.OnBind(item));
            return;
        }
        this.composerController.e(new l.a.C1079a(0L, null, 3));
        B0 b02 = this.initMapJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.initMapJob = C10727i.c(H.a(getLifecycle()), this.coroutineExceptionHandler, null, new HotelsMapInfoV4WidgetViewHolder$bind$1(this, item, null), 2);
    }
}
