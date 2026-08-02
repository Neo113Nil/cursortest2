package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsHorizontalShelves.di;

import Vg.d;
import WZ.l;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.ProductFavoriteDelegateProvider;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.storage.auth.AuthStateStorage;
import ru.ozon.app.android.travel.favorite.analytics.HotelFavoriteUnauthorizedAnalytics;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsHorizontalShelves.data.HotelsHorizontalShelvesMapper;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsHorizontalShelves.presentation.HotelsHorizontalShelvesViewModel;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 &2\u00060\u0001j\u0002`\u0002:\u0001&R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u000b\u001a\u00060\u0007j\u0002`\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0019\u001a\u00060\u0015j\u0002`\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/di/HotelsHorizontalShelvesComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/data/HotelsHorizontalShelvesMapper;", "getMapper", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/data/HotelsHorizontalShelvesMapper;", "mapper", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "getFavoriteProductMoleculeDelegateProvider", "()Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "favoriteProductMoleculeDelegateProvider", "LPc/a;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/presentation/HotelsHorizontalShelvesViewModel;", "getWidgetViewModelProvider", "()LPc/a;", "widgetViewModelProvider", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "getAuthStateStorage", "()Lru/ozon/app/android/storage/auth/AuthStateStorage;", "authStateStorage", "Lru/ozon/app/android/travel/favorite/analytics/HotelFavoriteUnauthorizedAnalytics;", "getFavoriteUnauthorizedAnalytics", "()Lru/ozon/app/android/travel/favorite/analytics/HotelFavoriteUnauthorizedAnalytics;", "favoriteUnauthorizedAnalytics", "Companion", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface HotelsHorizontalShelvesComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/di/HotelsHorizontalShelvesComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/di/HotelsHorizontalShelvesComponent;", "create", "(Lk20/g;)Lk20/e;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final HotelsHorizontalShelvesComponent create$lambda$0(C7475g c7475g) {
            return new HotelsHorizontalShelvesComponent$Companion$create$1$1(c7475g);
        }

        @NotNull
        public final C7473e<HotelsHorizontalShelvesComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(HotelsHorizontalShelvesComponent.class), new FU.a(storage, 8));
        }
    }

    @NotNull
    AuthStateStorage getAuthStateStorage();

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    ProductFavoriteDelegateProvider getFavoriteProductMoleculeDelegateProvider();

    @NotNull
    HotelFavoriteUnauthorizedAnalytics getFavoriteUnauthorizedAnalytics();

    @NotNull
    FeatureChecker getFeatureChecker();

    @NotNull
    HotelsHorizontalShelvesMapper getMapper();

    @NotNull
    l getTokenizedAnalytics();

    @NotNull
    Pc.a<HotelsHorizontalShelvesViewModel> getWidgetViewModelProvider();
}
