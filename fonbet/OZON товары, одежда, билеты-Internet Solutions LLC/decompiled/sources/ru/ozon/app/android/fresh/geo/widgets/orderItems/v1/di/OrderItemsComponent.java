package ru.ozon.app.android.fresh.geo.widgets.orderItems.v1.di;

import AL.a;
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
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.favorites.domain.di.FavoriteCoreComponentApi;
import ru.ozon.app.android.favorites.domain.favorite.FavoriteInteractor;
import ru.ozon.app.android.favorites.ui.di.FavoriteComponentApi;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.ProductFavoriteDelegateProvider;
import ru.ozon.app.android.fresh.geo.widgets.orderItems.v1.presentation.items.OrderItemsMapper;
import ru.ozon.app.android.fresh.geo.widgets.orderItems.v1.presentation.title.OrderItemsTitleMapper;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00182\u00060\u0001j\u0002`\u0002:\u0001\u0018R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0018\u0010\u000f\u001a\u00060\u000bj\u0002`\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/orderItems/v1/di/OrderItemsComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/fresh/geo/widgets/orderItems/v1/presentation/items/OrderItemsMapper;", "getOrderItemsMapper", "()Lru/ozon/app/android/fresh/geo/widgets/orderItems/v1/presentation/items/OrderItemsMapper;", "orderItemsMapper", "Lru/ozon/app/android/fresh/geo/widgets/orderItems/v1/presentation/title/OrderItemsTitleMapper;", "getOrderItemsTitleMapper", "()Lru/ozon/app/android/fresh/geo/widgets/orderItems/v1/presentation/title/OrderItemsTitleMapper;", "orderItemsTitleMapper", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "getFavMoleculeDelegateProvider", "()Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "favMoleculeDelegateProvider", "Lru/ozon/app/android/favorites/domain/favorite/FavoriteInteractor;", "getFavoriteInteractor", "()Lru/ozon/app/android/favorites/domain/favorite/FavoriteInteractor;", "favoriteInteractor", "Companion", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface OrderItemsComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/orderItems/v1/di/OrderItemsComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/fresh/geo/widgets/orderItems/v1/di/OrderItemsComponent;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final OrderItemsComponent create$lambda$0(final C7475g c7475g) {
            return new OrderItemsComponent() { // from class: ru.ozon.app.android.fresh.geo.widgets.orderItems.v1.di.OrderItemsComponent$Companion$create$1$1

                /* renamed from: orderItemsMapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j orderItemsMapper = k.b(OrderItemsComponent$Companion$create$1$1$orderItemsMapper$2.INSTANCE);

                /* renamed from: orderItemsTitleMapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j orderItemsTitleMapper = k.b(OrderItemsComponent$Companion$create$1$1$orderItemsTitleMapper$2.INSTANCE);

                @Override // ru.ozon.app.android.fresh.geo.widgets.orderItems.v1.di.OrderItemsComponent
                public ProductFavoriteDelegateProvider getFavMoleculeDelegateProvider() {
                    return ((FavoriteComponentApi) C7475g.this.getComponent(FavoriteComponentApi.class)).getFavoriteProductDelegate();
                }

                @Override // ru.ozon.app.android.fresh.geo.widgets.orderItems.v1.di.OrderItemsComponent
                public FavoriteInteractor getFavoriteInteractor() {
                    return ((FavoriteCoreComponentApi) C7475g.this.getComponent(FavoriteCoreComponentApi.class)).getFavoriteInteractor();
                }

                @Override // ru.ozon.app.android.fresh.geo.widgets.orderItems.v1.di.OrderItemsComponent
                public OrderItemsMapper getOrderItemsMapper() {
                    return (OrderItemsMapper) this.orderItemsMapper.getValue();
                }

                @Override // ru.ozon.app.android.fresh.geo.widgets.orderItems.v1.di.OrderItemsComponent
                public OrderItemsTitleMapper getOrderItemsTitleMapper() {
                    return (OrderItemsTitleMapper) this.orderItemsTitleMapper.getValue();
                }

                @Override // ru.ozon.app.android.fresh.geo.widgets.orderItems.v1.di.OrderItemsComponent
                public l getTokenizedAnalytics() {
                    return ((RetainComposerComponentApi) C7475g.this.getComponent(RetainComposerComponentApi.class)).getTokenizedAnalytics();
                }
            };
        }

        @NotNull
        public final C7473e<OrderItemsComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(OrderItemsComponent.class), new a(storage, 5));
        }
    }

    @NotNull
    ProductFavoriteDelegateProvider getFavMoleculeDelegateProvider();

    @NotNull
    FavoriteInteractor getFavoriteInteractor();

    @NotNull
    OrderItemsMapper getOrderItemsMapper();

    @NotNull
    OrderItemsTitleMapper getOrderItemsTitleMapper();

    @NotNull
    l getTokenizedAnalytics();
}
