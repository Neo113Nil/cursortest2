package ru.ozon.app.android.cart.master.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Sg.a;
import WZ.l;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.cart.CartViewModel;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.cart.common.domain.CartNavigationService;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cart.common.domain.delegate.CartItemsChecker;
import ru.ozon.app.android.cart.master.mapper.MasterMapper;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 $2\u00060\u0001j\u0002`\u0002:\u0001$R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010#\u001a\u00060\u001fj\u0002` 8&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lru/ozon/app/android/cart/master/di/MasterWidgetComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/cart/master/mapper/MasterMapper;", "getMapper", "()Lru/ozon/app/android/cart/master/mapper/MasterMapper;", "mapper", "Lru/ozon/app/android/cart/CartViewModel;", "getViewModel", "()Lru/ozon/app/android/cart/CartViewModel;", "viewModel", "Lru/ozon/app/android/cart/common/domain/CartService;", "getCartService", "()Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "Lru/ozon/app/android/cart/common/domain/CartNavigationService;", "getCartNavigationService", "()Lru/ozon/app/android/cart/common/domain/CartNavigationService;", "cartNavigationService", "LSg/a;", "getAnalyticsScreenStorage", "()LSg/a;", "analyticsScreenStorage", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/cart/common/domain/delegate/CartItemsChecker;", "getCartItemsChecker", "()Lru/ozon/app/android/cart/common/domain/delegate/CartItemsChecker;", "cartItemsChecker", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface MasterWidgetComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/cart/master/di/MasterWidgetComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/cart/master/di/MasterWidgetComponent;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final MasterWidgetComponent create$lambda$0(final C7475g c7475g) {
            return new MasterWidgetComponent() { // from class: ru.ozon.app.android.cart.master.di.MasterWidgetComponent$Companion$create$1$1
                private final CartServiceApi cartServiceApi;
                private final FeatureChecker featureChecker;

                /* renamed from: mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j mapper = k.b(MasterWidgetComponent$Companion$create$1$1$mapper$2.INSTANCE);

                {
                    this.cartServiceApi = (CartServiceApi) C7475g.this.getComponent(CartServiceApi.class);
                    this.featureChecker = ((NetworkComponentApi) C7475g.this.getComponent(NetworkComponentApi.class)).getFeatureChecker();
                }

                @Override // ru.ozon.app.android.cart.master.di.MasterWidgetComponent
                public a getAnalyticsScreenStorage() {
                    return ((AnalyticsScreenStorageComponentApi) C7475g.this.getComponent(AnalyticsScreenStorageComponentApi.class)).getAnalyticsScreenStorage();
                }

                @Override // ru.ozon.app.android.cart.master.di.MasterWidgetComponent
                public CartItemsChecker getCartItemsChecker() {
                    return this.cartServiceApi.getCartItemsChecker();
                }

                @Override // ru.ozon.app.android.cart.master.di.MasterWidgetComponent
                public CartNavigationService getCartNavigationService() {
                    return this.cartServiceApi.getCartNavigationService();
                }

                @Override // ru.ozon.app.android.cart.master.di.MasterWidgetComponent
                public CartService getCartService() {
                    return this.cartServiceApi.getCartService();
                }

                @Override // ru.ozon.app.android.cart.master.di.MasterWidgetComponent
                public FeatureChecker getFeatureChecker() {
                    return this.featureChecker;
                }

                @Override // ru.ozon.app.android.cart.master.di.MasterWidgetComponent
                public MasterMapper getMapper() {
                    return (MasterMapper) this.mapper.getValue();
                }

                @Override // ru.ozon.app.android.cart.master.di.MasterWidgetComponent
                public l getTokenizedAnalytics() {
                    return ((RetainComposerComponentApi) C7475g.this.getComponent(RetainComposerComponentApi.class)).getTokenizedAnalytics();
                }

                @Override // ru.ozon.app.android.cart.master.di.MasterWidgetComponent
                public CartViewModel getViewModel() {
                    return new CartViewModel();
                }
            };
        }

        @NotNull
        public final C7473e<MasterWidgetComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(MasterWidgetComponent.class), new CA.a(storage, 6));
        }
    }

    @NotNull
    a getAnalyticsScreenStorage();

    @NotNull
    CartItemsChecker getCartItemsChecker();

    @NotNull
    CartNavigationService getCartNavigationService();

    @NotNull
    CartService getCartService();

    @NotNull
    FeatureChecker getFeatureChecker();

    @NotNull
    MasterMapper getMapper();

    @NotNull
    l getTokenizedAnalytics();

    @NotNull
    CartViewModel getViewModel();
}
