package ru.ozon.app.android.fresh.cart.widgets.cartTile.di;

import BZ.e;
import Sc.InterfaceC4008j;
import Sc.k;
import Sg.a;
import Vg.d;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.favorites.domain.favoritemanager.FavoriteManager;
import ru.ozon.app.android.fresh.cart.widgets.cartTile.di.CartTileComponent;
import ru.ozon.app.android.fresh.cart.widgets.cartTile.di.CartTileComponent$Companion$create$1$1;
import ru.ozon.app.android.fresh.cart.widgets.cartTile.presentation.CartTileMapper;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshFavoriteButton.delegate.FreshFavoriteDelegate;
import ru.ozon.app.android.network.di.NetworkComponentApi;

@Metadata(d1 = {"\u0000A\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001b\u0010\u0007\u001a\u00020\u00028VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0011\u001a\u00060\rj\u0002`\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0016\u001a\u00060\u0012j\u0002`\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u001b\u001a\u00060\u0017j\u0002`\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"ru/ozon/app/android/fresh/cart/widgets/cartTile/di/CartTileComponent$Companion$create$1$1", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/di/CartTileComponent;", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileMapper;", "mapper", "LPc/a;", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshFavoriteButton/delegate/FreshFavoriteDelegate;", "getFreshFavoriteDelegateProvider", "()LPc/a;", "freshFavoriteDelegateProvider", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "getJsonDeserializer", "()Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "jsonDeserializer", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CartTileComponent$Companion$create$1$1 implements CartTileComponent {
    final /* synthetic */ InterfaceC4008j<ActionV2Repository> $actionRepository$delegate;
    final /* synthetic */ InterfaceC4008j<AdultHandler> $adultHandler$delegate;
    final /* synthetic */ InterfaceC4008j<a> $analyticsScreenStorage$delegate;
    final /* synthetic */ InterfaceC4008j<FavoriteManager> $favoriteManager$delegate;
    final /* synthetic */ InterfaceC4008j<e> $miniAppConfigHolder$delegate;
    final /* synthetic */ C7475g $storage;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(CartTileComponent$Companion$create$1$1$mapper$2.INSTANCE);

    /* JADX WARN: Multi-variable type inference failed */
    CartTileComponent$Companion$create$1$1(InterfaceC4008j<? extends FavoriteManager> interfaceC4008j, InterfaceC4008j<? extends AdultHandler> interfaceC4008j2, InterfaceC4008j<? extends ActionV2Repository> interfaceC4008j3, InterfaceC4008j<? extends a> interfaceC4008j4, InterfaceC4008j<e> interfaceC4008j5, C7475g c7475g) {
        this.$favoriteManager$delegate = interfaceC4008j;
        this.$adultHandler$delegate = interfaceC4008j2;
        this.$actionRepository$delegate = interfaceC4008j3;
        this.$analyticsScreenStorage$delegate = interfaceC4008j4;
        this.$miniAppConfigHolder$delegate = interfaceC4008j5;
        this.$storage = c7475g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FreshFavoriteDelegate _get_freshFavoriteDelegateProvider_$lambda$0(CartTileComponent$Companion$create$1$1 cartTileComponent$Companion$create$1$1, InterfaceC4008j interfaceC4008j, InterfaceC4008j interfaceC4008j2, InterfaceC4008j interfaceC4008j3, InterfaceC4008j interfaceC4008j4, InterfaceC4008j interfaceC4008j5) {
        FavoriteManager create$lambda$5$lambda$4;
        AdultHandler create$lambda$5$lambda$0;
        ActionV2Repository create$lambda$5$lambda$1;
        a create$lambda$5$lambda$2;
        e create$lambda$5$lambda$3;
        create$lambda$5$lambda$4 = CartTileComponent.Companion.create$lambda$5$lambda$4(interfaceC4008j);
        create$lambda$5$lambda$0 = CartTileComponent.Companion.create$lambda$5$lambda$0(interfaceC4008j2);
        create$lambda$5$lambda$1 = CartTileComponent.Companion.create$lambda$5$lambda$1(interfaceC4008j3);
        create$lambda$5$lambda$2 = CartTileComponent.Companion.create$lambda$5$lambda$2(interfaceC4008j4);
        create$lambda$5$lambda$3 = CartTileComponent.Companion.create$lambda$5$lambda$3(interfaceC4008j5);
        return new FreshFavoriteDelegate(create$lambda$5$lambda$4, create$lambda$5$lambda$0, create$lambda$5$lambda$1, create$lambda$5$lambda$2, create$lambda$5$lambda$3, cartTileComponent$Companion$create$1$1.getTokenizedAnalytics());
    }

    @Override // ru.ozon.app.android.fresh.cart.widgets.cartTile.di.CartTileComponent
    public d getCustomActionHandlersStoreFactory() {
        return ((CustomActionHandlersComponentApi) this.$storage.getComponent(CustomActionHandlersComponentApi.class)).getCustomActionHandlersStoreFactory();
    }

    @Override // ru.ozon.app.android.fresh.cart.widgets.cartTile.di.CartTileComponent
    public Pc.a<FreshFavoriteDelegate> getFreshFavoriteDelegateProvider() {
        final InterfaceC4008j<FavoriteManager> interfaceC4008j = this.$favoriteManager$delegate;
        final InterfaceC4008j<AdultHandler> interfaceC4008j2 = this.$adultHandler$delegate;
        final InterfaceC4008j<ActionV2Repository> interfaceC4008j3 = this.$actionRepository$delegate;
        final InterfaceC4008j<a> interfaceC4008j4 = this.$analyticsScreenStorage$delegate;
        final InterfaceC4008j<e> interfaceC4008j5 = this.$miniAppConfigHolder$delegate;
        return new Pc.a() { // from class: Kt.a
            @Override // Pc.a
            public final Object get() {
                FreshFavoriteDelegate _get_freshFavoriteDelegateProvider_$lambda$0;
                _get_freshFavoriteDelegateProvider_$lambda$0 = CartTileComponent$Companion$create$1$1._get_freshFavoriteDelegateProvider_$lambda$0(CartTileComponent$Companion$create$1$1.this, interfaceC4008j, interfaceC4008j2, interfaceC4008j3, interfaceC4008j4, interfaceC4008j5);
                return _get_freshFavoriteDelegateProvider_$lambda$0;
            }
        };
    }

    @Override // ru.ozon.app.android.fresh.cart.widgets.cartTile.di.CartTileComponent
    public JsonParser getJsonDeserializer() {
        return ((NetworkComponentApi) this.$storage.getComponent(NetworkComponentApi.class)).getJsonDeserializer();
    }

    @Override // ru.ozon.app.android.fresh.cart.widgets.cartTile.di.CartTileComponent
    public CartTileMapper getMapper() {
        return (CartTileMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.fresh.cart.widgets.cartTile.di.CartTileComponent
    public l getTokenizedAnalytics() {
        return ((RetainComposerComponentApi) this.$storage.getComponent(RetainComposerComponentApi.class)).getTokenizedAnalytics();
    }
}
