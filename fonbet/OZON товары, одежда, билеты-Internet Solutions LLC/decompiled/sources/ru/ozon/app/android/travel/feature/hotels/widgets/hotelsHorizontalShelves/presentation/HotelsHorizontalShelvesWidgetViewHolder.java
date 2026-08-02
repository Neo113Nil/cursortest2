package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsHorizontalShelves.presentation;

import IC.b;
import Lm0.a;
import Sc.o;
import Vg.d;
import W10.c;
import WZ.l;
import WZ.t;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.J;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.AnalyticData;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.ProductFavoriteDelegateProvider;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.storage.auth.AuthStateStorage;
import ru.ozon.app.android.travel.favorite.analytics.HotelFavoriteUnauthorizedAnalytics;
import ru.ozon.app.android.travel.favorite.delegate.HotelFavoriteUnauthorizedClickDelegate;
import ru.ozon.app.android.travel.favorite.delegate.HotelFavoritesForAuthorizedFeatureActivator;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsHorizontalShelves.presentation.HotelsHorizontalShelvesVO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsHorizontalShelves.presentation.adapter.CardsAdapter;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsHorizontalShelves.view.HotelsHorizontalShelvesView;
import ru.ozon.app.android.travel.utils.asyncWidget.AbstractAsyncWidgetViewModel;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetFetchedModel;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004BO\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\u0010\u000e\u001a\u00060\fj\u0002`\r\u0012\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020$H\u0002¢\u0006\u0004\b%\u0010&J\u001f\u0010)\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'H\u0014¢\u0006\u0004\b)\u0010*J'\u0010)\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'2\u0006\u0010,\u001a\u00020+H\u0014¢\u0006\u0004\b)\u0010-J\u000f\u0010.\u001a\u00020\u001bH\u0016¢\u0006\u0004\b.\u0010\u001fJ\u0017\u00101\u001a\u00020\u001b2\u0006\u00100\u001a\u00020/H\u0014¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u001bH\u0016¢\u0006\u0004\b3\u0010\u001fJ\u001d\u00106\u001a\u00020\u001b2\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u000504H\u0016¢\u0006\u0004\b6\u00107J\u0017\u0010:\u001a\u00020\u001b2\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u001bH\u0016¢\u0006\u0004\b<\u0010\u001fJ)\u0010A\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010>\u001a\u00020=2\b\u0010@\u001a\u0004\u0018\u00010?H\u0016¢\u0006\u0004\bA\u0010BR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010CR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010DR\u0018\u0010\u000e\u001a\u00060\fj\u0002`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010ER\u0018\u0010\u0011\u001a\u00060\u000fj\u0002`\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010FR \u0010I\u001a\u000e\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020\u001b0G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010L\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010O\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010T\u001a\u0004\u0018\u00010Q8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bR\u0010S¨\u0006U"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/presentation/HotelsHorizontalShelvesWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/presentation/HotelsHorizontalShelvesVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetCallbacks;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/presentation/HotelsHorizontalShelvesVO$State;", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "favoriteProductDelegateProvider", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/view/HotelsHorizontalShelvesView;", "view", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "authStateStorage", "Lru/ozon/app/android/travel/favorite/analytics/HotelFavoriteUnauthorizedAnalytics;", "favoriteUnauthorizedAnalytics", "<init>", "(Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/view/HotelsHorizontalShelvesView;LWZ/l;LVg/d;Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/storage/auth/AuthStateStorage;Lru/ozon/app/android/travel/favorite/analytics/HotelFavoriteUnauthorizedAnalytics;)V", "item", "", "trackViewEvent", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/presentation/HotelsHorizontalShelvesVO;)V", "removeWidget", "()V", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/presentation/HotelsHorizontalShelvesVO$AsyncPlaceholder;", "state", "fetchAsyncWidget", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/presentation/HotelsHorizontalShelvesVO$AsyncPlaceholder;)V", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/presentation/HotelsHorizontalShelvesVO$Loaded;", "bindLoadedState", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/presentation/HotelsHorizontalShelvesVO$Loaded;)V", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/presentation/HotelsHorizontalShelvesVO;Ll20/d;)V", "", "payload", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/presentation/HotelsHorizontalShelvesVO;Ll20/d;Ljava/lang/Object;)V", "onAttach", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "onDetach", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;", "fetchedModel", "onAsyncWidgetFetched", "(Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;)V", "", "throwable", "onAsyncWidgetFetchingFailed", "(Ljava/lang/Throwable;)V", "onAsyncWidgetSkipped", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/presentation/HotelsHorizontalShelvesVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/view/HotelsHorizontalShelvesView;", "LWZ/l;", "LVg/d;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Landroid/os/Handler;", "instanceRestorationHandler", "Landroid/os/Handler;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/presentation/adapter/CardsAdapter;", "cardsAdapter", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/presentation/adapter/CardsAdapter;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/presentation/HotelsHorizontalShelvesViewModel;", "getWidgetViewModel", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/presentation/HotelsHorizontalShelvesViewModel;", "widgetViewModel", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsHorizontalShelvesWidgetViewHolder extends k<HotelsHorizontalShelvesVO> implements AsyncWidgetCallbacks<HotelsHorizontalShelvesVO.State> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final CardsAdapter cardsAdapter;

    @NotNull
    private final d customActionHandlersStoreFactory;

    @NotNull
    private final Handler instanceRestorationHandler;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final HotelsHorizontalShelvesView view;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.hotels.widgets.hotelsHorizontalShelves.presentation.HotelsHorizontalShelvesWidgetViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<Map<String, ? extends TokenizedTrackingInfo>, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends TokenizedTrackingInfo> map) {
            invoke2((Map<String, TokenizedTrackingInfo>) map);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Map<String, TokenizedTrackingInfo> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            HotelsHorizontalShelvesWidgetViewHolder.this.actionHandler.invoke(new AtomAction.ViewAction(it, null, 2, null));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsHorizontalShelvesWidgetViewHolder(@NotNull ProductFavoriteDelegateProvider favoriteProductDelegateProvider, @NotNull ComposerReferences references, @NotNull HotelsHorizontalShelvesView view, @NotNull l tokenizedAnalytics, @NotNull d customActionHandlersStoreFactory, @NotNull FeatureChecker featureChecker, @NotNull AuthStateStorage authStateStorage, @NotNull HotelFavoriteUnauthorizedAnalytics favoriteUnauthorizedAnalytics) {
        super(view);
        ViewGroup rootView;
        NotificationLayoutManager asNotificationLayoutManager$default;
        Intrinsics.checkNotNullParameter(favoriteProductDelegateProvider, "favoriteProductDelegateProvider");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(authStateStorage, "authStateStorage");
        Intrinsics.checkNotNullParameter(favoriteUnauthorizedAnalytics, "favoriteUnauthorizedAnalytics");
        this.references = references;
        this.view = view;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(references, this).customActionHandlers(new HotelsHorizontalShelvesWidgetViewHolder$actionHandler$1(this)).buildHandler();
        this.actionHandler = buildHandler;
        this.instanceRestorationHandler = new Handler(Looper.getMainLooper());
        HotelFavoritesForAuthorizedFeatureActivator hotelFavoritesForAuthorizedFeatureActivator = new HotelFavoritesForAuthorizedFeatureActivator(featureChecker, authStateStorage.isAuthenticated(), authStateStorage.getAuthState());
        ComponentCallbacksC5392m c11 = references.getContainer().c();
        HotelFavoriteUnauthorizedClickDelegate hotelFavoriteUnauthorizedClickDelegate = null;
        if (c11 != null && (rootView = ContextExtKt.getRootView(c11)) != null && (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(rootView, null, 1, null)) != null) {
            hotelFavoriteUnauthorizedClickDelegate = new HotelFavoriteUnauthorizedClickDelegate(asNotificationLayoutManager$default, buildHandler, references.getContainer().g(), favoriteUnauthorizedAnalytics);
        }
        CardsAdapter cardsAdapter = new CardsAdapter(this, favoriteProductDelegateProvider, references, tokenizedAnalytics, buildHandler, new AnonymousClass1(), hotelFavoritesForAuthorizedFeatureActivator, hotelFavoriteUnauthorizedClickDelegate);
        this.cardsAdapter = cardsAdapter;
        view.setupRecyclerView(cardsAdapter, references.getComposerViewPoolProvider().getViewPool());
    }

    private final void bindLoadedState(HotelsHorizontalShelvesVO.Loaded state) {
        this.view.hidePlaceholder();
        this.view.bind(state, new AnalyticData(getTrackingData(), getViewItem()), this.actionHandler);
    }

    private final void fetchAsyncWidget(HotelsHorizontalShelvesVO.AsyncPlaceholder state) {
        this.view.showPlaceholder();
        HotelsHorizontalShelvesViewModel widgetViewModel = getWidgetViewModel();
        if (widgetViewModel != null) {
            widgetViewModel.fetchWidget(state.getAsyncData());
        }
    }

    private final HotelsHorizontalShelvesViewModel getWidgetViewModel() {
        return (HotelsHorizontalShelvesViewModel) getWidgetViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttach$lambda$1(HotelsHorizontalShelvesWidgetViewHolder hotelsHorizontalShelvesWidgetViewHolder) {
        Parcelable cardsSavedState;
        HotelsHorizontalShelvesVO boundData = hotelsHorizontalShelvesWidgetViewHolder.getBoundData();
        HotelsHorizontalShelvesVO.State state = boundData != null ? boundData.getState() : null;
        HotelsHorizontalShelvesVO.Loaded loaded = state instanceof HotelsHorizontalShelvesVO.Loaded ? (HotelsHorizontalShelvesVO.Loaded) state : null;
        if (loaded == null || (cardsSavedState = loaded.getCardsSavedState()) == null) {
            return;
        }
        hotelsHorizontalShelvesWidgetViewHolder.view.setCardsRvState(cardsSavedState);
    }

    private final void removeWidget() {
        HotelsHorizontalShelvesVO boundData = getBoundData();
        if (boundData != null) {
            this.references.getController().m(boundData.getId());
        }
    }

    private final void trackViewEvent(HotelsHorizontalShelvesVO item) {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        t mapToTokenizedEvent$default;
        HotelsHorizontalShelvesVO.State state = item.getState();
        HotelsHorizontalShelvesVO.Loaded loaded = state instanceof HotelsHorizontalShelvesVO.Loaded ? (HotelsHorizontalShelvesVO.Loaded) state : null;
        if (loaded == null || (trackingInfo = loaded.getTrackingInfo()) == null || (mapToTokenizedEvent$default = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(item.getId()), null, 2, null)) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, mapToTokenizedEvent$default, null, 2, null);
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetFetched(@NotNull AsyncWidgetFetchedModel<HotelsHorizontalShelvesVO.State> fetchedModel) {
        Intrinsics.checkNotNullParameter(fetchedModel, "fetchedModel");
        Map<String, String> trackingPayloads = fetchedModel.getTrackingPayloads();
        if (trackingPayloads != null) {
            this.tokenizedAnalytics.e(trackingPayloads);
        }
        InterfaceC7851b controller = this.references.getController();
        HotelsHorizontalShelvesVO boundData = getBoundData();
        controller.update(new HotelsHorizontalShelvesUpdate(boundData != null ? Long.valueOf(boundData.getId()) : null, fetchedModel.getFetchedState()));
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetFetchingFailed(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        a.f17149a.e(throwable);
        removeWidget();
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetSkipped() {
        removeWidget();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        this.instanceRestorationHandler.post(new b(this, 2));
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        super.onAttachViewModel(lifecycle);
        HotelsHorizontalShelvesViewModel widgetViewModel = getWidgetViewModel();
        if (widgetViewModel != null) {
            AbstractAsyncWidgetViewModel.observeEvents$default(widgetViewModel, lifecycle, this, null, 4, null);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        this.instanceRestorationHandler.removeCallbacksAndMessages(null);
        HotelsHorizontalShelvesVO boundData = getBoundData();
        Object state = boundData != null ? boundData.getState() : null;
        HotelsHorizontalShelvesVO.Loaded loaded = state instanceof HotelsHorizontalShelvesVO.Loaded ? (HotelsHorizontalShelvesVO.Loaded) state : null;
        if (loaded != null) {
            loaded.setCardsSavedState(this.view.getCardsRvState());
        }
        super.onDetach();
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull HotelsHorizontalShelvesVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        trackViewEvent(item);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull HotelsHorizontalShelvesVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        HotelsHorizontalShelvesVO.State state = item.getState();
        if (state instanceof HotelsHorizontalShelvesVO.AsyncPlaceholder) {
            fetchAsyncWidget((HotelsHorizontalShelvesVO.AsyncPlaceholder) item.getState());
        } else {
            if (!(state instanceof HotelsHorizontalShelvesVO.Loaded)) {
                throw new o();
            }
            bindLoadedState((HotelsHorizontalShelvesVO.Loaded) item.getState());
        }
        if (isInVisibleBounds()) {
            trackViewEvent(item);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull HotelsHorizontalShelvesVO item, @NotNull l20.d info, @NotNull Object payload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(payload, "payload");
        if ((payload instanceof HotelsHorizontalShelvesPayload) && (item.getState() instanceof HotelsHorizontalShelvesVO.Loaded)) {
            HotelsHorizontalShelvesPayload hotelsHorizontalShelvesPayload = (HotelsHorizontalShelvesPayload) payload;
            if (hotelsHorizontalShelvesPayload.isTitleChanged()) {
                this.view.bindTitle(((HotelsHorizontalShelvesVO.Loaded) item.getState()).getTitle());
            }
            if (hotelsHorizontalShelvesPayload.isSubtitleChanged()) {
                this.view.bindSubtitle(((HotelsHorizontalShelvesVO.Loaded) item.getState()).getSubtitle());
            }
            if (hotelsHorizontalShelvesPayload.isCardsTopMarginChanged()) {
                this.view.bindCardTopMargin(((HotelsHorizontalShelvesVO.Loaded) item.getState()).getCardsTopMargin());
            }
            if (hotelsHorizontalShelvesPayload.isActionChanged()) {
                this.view.bindAction(((HotelsHorizontalShelvesVO.Loaded) item.getState()).getAtomAction());
            }
            if (hotelsHorizontalShelvesPayload.isBackgroundChanged()) {
                this.view.bindBackground(((HotelsHorizontalShelvesVO.Loaded) item.getState()).getBackgroundImage(), ((HotelsHorizontalShelvesVO.Loaded) item.getState()).getBackgroundToken(), ((HotelsHorizontalShelvesVO.Loaded) item.getState()).getBackgroundGradient(), ((HotelsHorizontalShelvesVO.Loaded) item.getState()).getCornerRadius());
            }
            if (hotelsHorizontalShelvesPayload.areCardsChanged()) {
                this.view.bindCards((HotelsHorizontalShelvesVO.Loaded) item.getState(), new AnalyticData(getTrackingData(), getViewItem()));
                return;
            }
            return;
        }
        super.bind((HotelsHorizontalShelvesWidgetViewHolder) item, info, payload);
    }
}
