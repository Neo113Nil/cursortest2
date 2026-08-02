package ru.ozon.app.android.fresh.main.widgets.product.scroll.di;

import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.account.adult.presenter.AdultListDelegateProvider;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.cart.domain.delegate.CartAtomEnablingStateDelegate;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.widgets.v2.di.ComposerWidgetComponentStorageKt;
import ru.ozon.app.android.favorites.ui.di.FavoriteComponentApi;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.ProductFavoriteDelegateProvider;
import ru.ozon.app.android.fresh.main.widgets.product.common.product.ProductToOneMapper;
import ru.ozon.app.android.fresh.main.widgets.product.scroll.di.ScrollComponent$Companion$create$1$1;
import ru.ozon.app.android.fresh.main.widgets.product.scroll.utils.CartPriceAtomBinder;

@Metadata(d1 = {"\u0000A\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001b\u0010\u0007\u001a\u00020\u00028VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u000bR(\u0010\u0010\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u000e0\u000e0\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001c\u001a\u00060\u0018j\u0002`\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"ru/ozon/app/android/fresh/main/widgets/product/scroll/di/ScrollComponent$Companion$create$1$1", "Lru/ozon/app/android/fresh/main/widgets/product/scroll/di/ScrollComponent;", "Lru/ozon/app/android/fresh/main/widgets/product/common/product/ProductToOneMapper;", "productMapper$delegate", "LSc/j;", "getProductMapper", "()Lru/ozon/app/android/fresh/main/widgets/product/common/product/ProductToOneMapper;", "productMapper", "Lru/ozon/app/android/account/adult/presenter/AdultListDelegateProvider;", "adultListDelegateProvider$delegate", "getAdultListDelegateProvider", "()Lru/ozon/app/android/account/adult/presenter/AdultListDelegateProvider;", "adultListDelegateProvider", "LPc/a;", "Lru/ozon/app/android/fresh/main/widgets/product/scroll/utils/CartPriceAtomBinder;", "kotlin.jvm.PlatformType", "cartPriceAtomBinder", "LPc/a;", "getCartPriceAtomBinder", "()LPc/a;", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "getFavMoleculeProvider", "()Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "favMoleculeProvider", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "getAdultHandler", "()Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ScrollComponent$Companion$create$1$1 implements ScrollComponent {
    final /* synthetic */ C7475g $storage;

    /* renamed from: adultListDelegateProvider$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j adultListDelegateProvider;
    private final a<CartPriceAtomBinder> cartPriceAtomBinder;

    /* renamed from: productMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j productMapper = k.b(ScrollComponent$Companion$create$1$1$productMapper$2.INSTANCE);

    ScrollComponent$Companion$create$1$1(final C7475g c7475g) {
        this.$storage = c7475g;
        this.adultListDelegateProvider = k.b(new ScrollComponent$Companion$create$1$1$adultListDelegateProvider$2(this, c7475g));
        this.cartPriceAtomBinder = new a() { // from class: Bw.b
            @Override // Pc.a
            public final Object get() {
                CartPriceAtomBinder cartPriceAtomBinder$lambda$0;
                cartPriceAtomBinder$lambda$0 = ScrollComponent$Companion$create$1$1.cartPriceAtomBinder$lambda$0(C7475g.this, this);
                return cartPriceAtomBinder$lambda$0;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CartPriceAtomBinder cartPriceAtomBinder$lambda$0(C7475g c7475g, ScrollComponent$Companion$create$1$1 scrollComponent$Companion$create$1$1) {
        return new CartPriceAtomBinder(ComposerWidgetComponentStorageKt.getContext(c7475g), scrollComponent$Companion$create$1$1.getAdultHandler(), new CartAtomEnablingStateDelegate(), ((CartServiceApi) c7475g.getComponent(CartServiceApi.class)).getCartService());
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.product.scroll.di.ScrollComponent
    public AdultHandler getAdultHandler() {
        return ((AccountComponentApi) this.$storage.getComponent(AccountComponentApi.class)).getAdultHandler();
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.product.scroll.di.ScrollComponent
    public AdultListDelegateProvider getAdultListDelegateProvider() {
        return (AdultListDelegateProvider) this.adultListDelegateProvider.getValue();
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.product.scroll.di.ScrollComponent
    public a<CartPriceAtomBinder> getCartPriceAtomBinder() {
        return this.cartPriceAtomBinder;
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.product.scroll.di.ScrollComponent
    public ProductFavoriteDelegateProvider getFavMoleculeProvider() {
        return ((FavoriteComponentApi) this.$storage.getComponent(FavoriteComponentApi.class)).getFavoriteProductDelegate();
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.product.scroll.di.ScrollComponent
    public ProductToOneMapper getProductMapper() {
        return (ProductToOneMapper) this.productMapper.getValue();
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.product.scroll.di.ScrollComponent
    public l getTokenizedAnalytics() {
        return ((RetainComposerComponentApi) this.$storage.getComponent(RetainComposerComponentApi.class)).getTokenizedAnalytics();
    }
}
