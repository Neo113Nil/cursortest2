package ru.ozon.app.android.pdp.widgets.cartButtonV4.di;

import Du.C2881a;
import WZ.l;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.pdp.ui.configurators.pdp.onboarding.PDPOnBoardingViewModel;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.CartButtonActionHandlerFactory;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.CartButtonPreCreateVHStateHolder;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.cart.CartV4Mapper;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.cart.CartViewBinder;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.DoubleCartV4Mapper;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.DoubleCartViewBinder;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.plain.PlainV4Mapper;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.subscribe.SubscribeV4Mapper;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.subscribe.SubscribeViewModel;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 62\u00060\u0001j\u0002`\u0002:\u00016R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\f\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8&X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8&X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0018\u00101\u001a\u00060-j\u0002`.8&X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00105\u001a\u0002028&X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u00104¨\u00067"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/di/CartButtonWidgetComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonPreCreateVHStateHolder;", "getCartPreCreateVHStateHolder", "()Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonPreCreateVHStateHolder;", "cartPreCreateVHStateHolder", "getDoubleCartPreCreateVHStateHolder", "doubleCartPreCreateVHStateHolder", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/cart/CartV4Mapper;", "getCartMapper", "()Lru/ozon/app/android/pdp/widgets/cartButtonV4/cart/CartV4Mapper;", "cartMapper", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartV4Mapper;", "getDoubleCartMapper", "()Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartV4Mapper;", "doubleCartMapper", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/plain/PlainV4Mapper;", "getPlainMapper", "()Lru/ozon/app/android/pdp/widgets/cartButtonV4/plain/PlainV4Mapper;", "plainMapper", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/subscribe/SubscribeV4Mapper;", "getSubscribeMapper", "()Lru/ozon/app/android/pdp/widgets/cartButtonV4/subscribe/SubscribeV4Mapper;", "subscribeMapper", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonActionHandlerFactory;", "getActionHandlerFactory", "()Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonActionHandlerFactory;", "actionHandlerFactory", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/subscribe/SubscribeViewModel;", "getSubscribeViewModel", "()Lru/ozon/app/android/pdp/widgets/cartButtonV4/subscribe/SubscribeViewModel;", "subscribeViewModel", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/cart/CartViewBinder;", "getCartViewBinder", "()Lru/ozon/app/android/pdp/widgets/cartButtonV4/cart/CartViewBinder;", "cartViewBinder", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartViewBinder;", "getDoubleCartViewBinder", "()Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartViewBinder;", "doubleCartViewBinder", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/pdp/ui/configurators/pdp/onboarding/PDPOnBoardingViewModel;", "getPdpOnBoardingViewModel", "()Lru/ozon/app/android/pdp/ui/configurators/pdp/onboarding/PDPOnBoardingViewModel;", "pdpOnBoardingViewModel", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CartButtonWidgetComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/di/CartButtonWidgetComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/di/CartButtonWidgetComponent;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CartButtonWidgetComponent create$lambda$0(C7475g c7475g) {
            return new CartButtonWidgetComponent$Companion$create$1$1(c7475g);
        }

        @NotNull
        public final C7473e<CartButtonWidgetComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(CartButtonWidgetComponent.class), new C2881a(storage, 12));
        }
    }

    @NotNull
    CartButtonActionHandlerFactory getActionHandlerFactory();

    @NotNull
    CartV4Mapper getCartMapper();

    @NotNull
    CartButtonPreCreateVHStateHolder getCartPreCreateVHStateHolder();

    @NotNull
    CartViewBinder getCartViewBinder();

    @NotNull
    DoubleCartV4Mapper getDoubleCartMapper();

    @NotNull
    CartButtonPreCreateVHStateHolder getDoubleCartPreCreateVHStateHolder();

    @NotNull
    DoubleCartViewBinder getDoubleCartViewBinder();

    @NotNull
    FeatureChecker getFeatureChecker();

    @NotNull
    PDPOnBoardingViewModel getPdpOnBoardingViewModel();

    @NotNull
    PlainV4Mapper getPlainMapper();

    @NotNull
    SubscribeV4Mapper getSubscribeMapper();

    @NotNull
    SubscribeViewModel getSubscribeViewModel();

    @NotNull
    l getTokenizedAnalytics();
}
