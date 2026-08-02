package ru.ozon.app.android.fresh.cart.widgets.cartTile.di;

import BZ.e;
import Bw.C2676a;
import Sc.InterfaceC4008j;
import Sg.a;
import Vg.d;
import WZ.l;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.favorites.domain.favoritemanager.FavoriteManager;
import ru.ozon.app.android.fresh.cart.widgets.cartTile.presentation.CartTileMapper;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshFavoriteButton.delegate.FreshFavoriteDelegate;
import ru.ozon.app.android.utils.LazyUtilsKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u001b2\u00060\u0001j\u0002`\u0002:\u0001\u001bR\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0010\u001a\u00060\fj\u0002`\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0015\u001a\u00060\u0011j\u0002`\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u001a\u001a\u00060\u0016j\u0002`\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/cartTile/di/CartTileComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileMapper;", "getMapper", "()Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileMapper;", "mapper", "LPc/a;", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshFavoriteButton/delegate/FreshFavoriteDelegate;", "getFreshFavoriteDelegateProvider", "()LPc/a;", "freshFavoriteDelegateProvider", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "getJsonDeserializer", "()Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "jsonDeserializer", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Companion", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CartTileComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u0017²\u0006\f\u0010\r\u001a\u00020\f8\nX\u008a\u0084\u0002²\u0006\f\u0010\u000f\u001a\u00020\u000e8\nX\u008a\u0084\u0002²\u0006\u0010\u0010\u0012\u001a\u00060\u0010j\u0002`\u00118\nX\u008a\u0084\u0002²\u0006\f\u0010\u0014\u001a\u00020\u00138\nX\u008a\u0084\u0002²\u0006\f\u0010\u0016\u001a\u00020\u00158\nX\u008a\u0084\u0002"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/cartTile/di/CartTileComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/di/CartTileComponent;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionRepository", "LSg/a;", "Lru/ozon/app/android/analytics/AnalyticsScreenStorage;", "analyticsScreenStorage", "LBZ/e;", "miniAppConfigHolder", "Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;", "favoriteManager", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CartTileComponent create$lambda$5(C7475g c7475g) {
            return new CartTileComponent$Companion$create$1$1(LazyUtilsKt.unsafeLazy(new CartTileComponent$Companion$create$1$favoriteManager$2(c7475g)), LazyUtilsKt.unsafeLazy(new CartTileComponent$Companion$create$1$adultHandler$2(c7475g)), LazyUtilsKt.unsafeLazy(new CartTileComponent$Companion$create$1$actionRepository$2(c7475g)), LazyUtilsKt.unsafeLazy(new CartTileComponent$Companion$create$1$analyticsScreenStorage$2(c7475g)), LazyUtilsKt.unsafeLazy(new CartTileComponent$Companion$create$1$miniAppConfigHolder$2(c7475g)), c7475g);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AdultHandler create$lambda$5$lambda$0(InterfaceC4008j<? extends AdultHandler> interfaceC4008j) {
            return interfaceC4008j.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ActionV2Repository create$lambda$5$lambda$1(InterfaceC4008j<? extends ActionV2Repository> interfaceC4008j) {
            return interfaceC4008j.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final a create$lambda$5$lambda$2(InterfaceC4008j<? extends a> interfaceC4008j) {
            return interfaceC4008j.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final e create$lambda$5$lambda$3(InterfaceC4008j<e> interfaceC4008j) {
            return interfaceC4008j.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final FavoriteManager create$lambda$5$lambda$4(InterfaceC4008j<? extends FavoriteManager> interfaceC4008j) {
            return interfaceC4008j.getValue();
        }

        @NotNull
        public final C7473e<CartTileComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(CartTileComponent.class), new C2676a(storage, 4));
        }
    }

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    Pc.a<FreshFavoriteDelegate> getFreshFavoriteDelegateProvider();

    @NotNull
    JsonParser getJsonDeserializer();

    @NotNull
    CartTileMapper getMapper();

    @NotNull
    l getTokenizedAnalytics();
}
