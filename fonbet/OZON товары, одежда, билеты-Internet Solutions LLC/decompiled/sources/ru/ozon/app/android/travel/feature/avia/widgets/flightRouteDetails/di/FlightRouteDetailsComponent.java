package ru.ozon.app.android.travel.feature.avia.widgets.flightRouteDetails.di;

import AG.b;
import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import WZ.l;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainAnalyticsComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.favorites.domain.di.FavoriteCoreComponentApi;
import ru.ozon.app.android.favorites.domain.favoritemanager.FavoriteManager;
import ru.ozon.app.android.favorites.ui.di.FavoriteComponentApi;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.ProductFavoriteDelegateProvider;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.travel.feature.avia.shared.favorites.AddToFavoritesViewModel;
import ru.ozon.app.android.travel.feature.avia.widgets.flightRouteDetails.data.FlightRouteDetailsAnnotationMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.flightRouteDetails.data.FlightRouteDetailsMapper;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 !2\u00060\u0001j\u0002`\u0002:\u0001!R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0018\u0010\u000f\u001a\u00060\u000bj\u0002`\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0014\u001a\u00060\u0010j\u0002`\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightRouteDetails/di/FlightRouteDetailsComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightRouteDetails/data/FlightRouteDetailsAnnotationMapper;", "getFlightRouteDetailsAnnotationMapper", "()Lru/ozon/app/android/travel/feature/avia/widgets/flightRouteDetails/data/FlightRouteDetailsAnnotationMapper;", "flightRouteDetailsAnnotationMapper", "Lru/ozon/app/android/travel/feature/avia/widgets/flightRouteDetails/data/FlightRouteDetailsMapper;", "getFlightRouteDetailsMapper", "()Lru/ozon/app/android/travel/feature/avia/widgets/flightRouteDetails/data/FlightRouteDetailsMapper;", "flightRouteDetailsMapper", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "getProductFavoriteDelegateProvider", "()Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "productFavoriteDelegateProvider", "Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;", "getFavoriteManager", "()Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;", "favoriteManager", "Lru/ozon/app/android/travel/feature/avia/shared/favorites/AddToFavoritesViewModel;", "getViewModel", "()Lru/ozon/app/android/travel/feature/avia/shared/favorites/AddToFavoritesViewModel;", "viewModel", "Companion", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface FlightRouteDetailsComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightRouteDetails/di/FlightRouteDetailsComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightRouteDetails/di/FlightRouteDetailsComponent;", "create", "(Lk20/g;)Lk20/e;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final FlightRouteDetailsComponent create$lambda$0(final C7475g c7475g) {
            return new FlightRouteDetailsComponent(c7475g) { // from class: ru.ozon.app.android.travel.feature.avia.widgets.flightRouteDetails.di.FlightRouteDetailsComponent$Companion$create$1$1
                private final ActionComponentApi actionComponentApi;
                private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
                private final FavoriteComponentApi favoriteComponentApi;
                private final FavoriteCoreComponentApi favoriteCoreComponentApi;
                private final NavigationComponentApi navigationComponentApi;
                private final RetainAnalyticsComponentApi retainAnalyticsApi;
                private final RetainComposerComponentApi retainComposerComponentApi;

                /* renamed from: flightRouteDetailsMapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j flightRouteDetailsMapper = k.b(FlightRouteDetailsComponent$Companion$create$1$1$flightRouteDetailsMapper$2.INSTANCE);

                /* renamed from: flightRouteDetailsAnnotationMapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j flightRouteDetailsAnnotationMapper = k.b(FlightRouteDetailsComponent$Companion$create$1$1$flightRouteDetailsAnnotationMapper$2.INSTANCE);

                {
                    this.favoriteComponentApi = (FavoriteComponentApi) c7475g.getComponent(FavoriteComponentApi.class);
                    this.favoriteCoreComponentApi = (FavoriteCoreComponentApi) c7475g.getComponent(FavoriteCoreComponentApi.class);
                    this.retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
                    this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
                    this.actionComponentApi = (ActionComponentApi) c7475g.getComponent(ActionComponentApi.class);
                    this.navigationComponentApi = (NavigationComponentApi) c7475g.getComponent(NavigationComponentApi.class);
                    this.retainAnalyticsApi = (RetainAnalyticsComponentApi) c7475g.getComponent(RetainAnalyticsComponentApi.class);
                }

                @Override // ru.ozon.app.android.travel.feature.avia.widgets.flightRouteDetails.di.FlightRouteDetailsComponent
                public d getCustomActionHandlersStoreFactory() {
                    return this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
                }

                @Override // ru.ozon.app.android.travel.feature.avia.widgets.flightRouteDetails.di.FlightRouteDetailsComponent
                public FavoriteManager getFavoriteManager() {
                    return this.favoriteCoreComponentApi.getFavoriteManager();
                }

                @Override // ru.ozon.app.android.travel.feature.avia.widgets.flightRouteDetails.di.FlightRouteDetailsComponent
                public FlightRouteDetailsAnnotationMapper getFlightRouteDetailsAnnotationMapper() {
                    return (FlightRouteDetailsAnnotationMapper) this.flightRouteDetailsAnnotationMapper.getValue();
                }

                @Override // ru.ozon.app.android.travel.feature.avia.widgets.flightRouteDetails.di.FlightRouteDetailsComponent
                public FlightRouteDetailsMapper getFlightRouteDetailsMapper() {
                    return (FlightRouteDetailsMapper) this.flightRouteDetailsMapper.getValue();
                }

                @Override // ru.ozon.app.android.travel.feature.avia.widgets.flightRouteDetails.di.FlightRouteDetailsComponent
                public ProductFavoriteDelegateProvider getProductFavoriteDelegateProvider() {
                    return this.favoriteComponentApi.getFavoriteProductDelegate();
                }

                @Override // ru.ozon.app.android.travel.feature.avia.widgets.flightRouteDetails.di.FlightRouteDetailsComponent
                public l getTokenizedAnalytics() {
                    return this.retainComposerComponentApi.getTokenizedAnalytics();
                }

                @Override // ru.ozon.app.android.travel.feature.avia.widgets.flightRouteDetails.di.FlightRouteDetailsComponent
                public AddToFavoritesViewModel getViewModel() {
                    return new AddToFavoritesViewModel(getFavoriteManager(), this.actionComponentApi.getActionRepository(), this.navigationComponentApi.getMiniAppConfigHolder(), this.retainAnalyticsApi.getAnalyticsScreenStorage());
                }
            };
        }

        @NotNull
        public final C7473e<FlightRouteDetailsComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(FlightRouteDetailsComponent.class), new b(storage, 1));
        }
    }

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    FavoriteManager getFavoriteManager();

    @NotNull
    FlightRouteDetailsAnnotationMapper getFlightRouteDetailsAnnotationMapper();

    @NotNull
    FlightRouteDetailsMapper getFlightRouteDetailsMapper();

    @NotNull
    ProductFavoriteDelegateProvider getProductFavoriteDelegateProvider();

    @NotNull
    l getTokenizedAnalytics();

    @NotNull
    AddToFavoritesViewModel getViewModel();
}
