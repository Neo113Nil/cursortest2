package ru.ozon.app.android.pdp.widgets.othersellers.core.di;

import CE.a;
import GZ.g;
import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.favorites.domain.di.FavoriteCoreComponentApi;
import ru.ozon.app.android.favorites.domain.favorite.FavoriteInteractor;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.pdp.widgets.othersellers.core.seller.OtherSellersSellerMapper;
import ru.ozon.app.android.pdp.widgets.othersellers.presentation.OtherSellersViewModel;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u001b2\u00060\u0001j\u0002`\u0002:\u0001\u001bR\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/pdp/widgets/othersellers/core/di/OtherSellersSellerComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/pdp/widgets/othersellers/core/seller/OtherSellersSellerMapper;", "getOtherSellersSellerMapper", "()Lru/ozon/app/android/pdp/widgets/othersellers/core/seller/OtherSellersSellerMapper;", "otherSellersSellerMapper", "Lru/ozon/app/android/cart/common/domain/CartService;", "getCartService", "()Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "Lru/ozon/app/android/favorites/domain/favorite/FavoriteInteractor;", "getFavoriteInteractor", "()Lru/ozon/app/android/favorites/domain/favorite/FavoriteInteractor;", "favoriteInteractor", "LGZ/g;", "getOzonRouter", "()LGZ/g;", "ozonRouter", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/pdp/widgets/othersellers/presentation/OtherSellersViewModel;", "getOtherSellersViewModel", "()Lru/ozon/app/android/pdp/widgets/othersellers/presentation/OtherSellersViewModel;", "otherSellersViewModel", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface OtherSellersSellerComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/othersellers/core/di/OtherSellersSellerComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/pdp/widgets/othersellers/core/di/OtherSellersSellerComponent;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "createComponent", "(Lk20/g;)Lk20/e;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final OtherSellersSellerComponent createComponent$lambda$0(final C7475g c7475g) {
            return new OtherSellersSellerComponent() { // from class: ru.ozon.app.android.pdp.widgets.othersellers.core.di.OtherSellersSellerComponent$Companion$createComponent$1$1

                /* renamed from: otherSellersFooterMapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j otherSellersFooterMapper = k.b(OtherSellersSellerComponent$Companion$createComponent$1$1$otherSellersFooterMapper$2.INSTANCE);

                /* renamed from: otherSellersTitleMapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j otherSellersTitleMapper = k.b(OtherSellersSellerComponent$Companion$createComponent$1$1$otherSellersTitleMapper$2.INSTANCE);

                /* renamed from: otherSellersSellerMapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j otherSellersSellerMapper = k.b(OtherSellersSellerComponent$Companion$createComponent$1$1$otherSellersSellerMapper$2.INSTANCE);

                @Override // ru.ozon.app.android.pdp.widgets.othersellers.core.di.OtherSellersSellerComponent
                public CartService getCartService() {
                    return getCartServiceApi().getCartService();
                }

                public final CartServiceApi getCartServiceApi() {
                    return (CartServiceApi) C7475g.this.getComponent(CartServiceApi.class);
                }

                public final FavoriteCoreComponentApi getFavoriteCoreComponentApi() {
                    return (FavoriteCoreComponentApi) C7475g.this.getComponent(FavoriteCoreComponentApi.class);
                }

                @Override // ru.ozon.app.android.pdp.widgets.othersellers.core.di.OtherSellersSellerComponent
                public FavoriteInteractor getFavoriteInteractor() {
                    return getFavoriteCoreComponentApi().getFavoriteInteractor();
                }

                public final NavigationComponentApi getNavigationComponentApi() {
                    return (NavigationComponentApi) C7475g.this.getComponent(NavigationComponentApi.class);
                }

                @Override // ru.ozon.app.android.pdp.widgets.othersellers.core.di.OtherSellersSellerComponent
                public OtherSellersSellerMapper getOtherSellersSellerMapper() {
                    return (OtherSellersSellerMapper) this.otherSellersSellerMapper.getValue();
                }

                @Override // ru.ozon.app.android.pdp.widgets.othersellers.core.di.OtherSellersSellerComponent
                public OtherSellersViewModel getOtherSellersViewModel() {
                    return new OtherSellersViewModel(getCartServiceApi().getCartService());
                }

                @Override // ru.ozon.app.android.pdp.widgets.othersellers.core.di.OtherSellersSellerComponent
                public g getOzonRouter() {
                    return getNavigationComponentApi().getOzonRouter();
                }

                public final RetainComposerComponentApi getRetainComposerComponentApi() {
                    return (RetainComposerComponentApi) C7475g.this.getComponent(RetainComposerComponentApi.class);
                }

                @Override // ru.ozon.app.android.pdp.widgets.othersellers.core.di.OtherSellersSellerComponent
                public l getTokenizedAnalytics() {
                    return getRetainComposerComponentApi().getTokenizedAnalytics();
                }
            };
        }

        @NotNull
        public final C7473e<OtherSellersSellerComponent> createComponent(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(OtherSellersSellerComponent.class), new a(storage, 9));
        }
    }

    @NotNull
    CartService getCartService();

    @NotNull
    FavoriteInteractor getFavoriteInteractor();

    @NotNull
    OtherSellersSellerMapper getOtherSellersSellerMapper();

    @NotNull
    OtherSellersViewModel getOtherSellersViewModel();

    @NotNull
    g getOzonRouter();

    @NotNull
    l getTokenizedAnalytics();
}
