package ru.ozon.app.android.pdp.widgets.cartButtonQuant.cart;

import android.content.SharedPreferences;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l10.v;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.pdp.view.animationsaleblock.SaleBlockViewModel;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.CartButtonQuantActionHandlerFactory;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.CartButtonQuantNotificationHandler;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.CartQuantView;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.CartQuantViewModel;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.PDPCartQuantItemInfo;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.QuantExtKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\u00020\u0002*\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012JK\u0010 \u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0016\b\u0002\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001c¢\u0006\u0004\b \u0010!J%\u0010#\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010)R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010.\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010'¨\u0006/"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonQuant/cart/CartQuantViewBinder;", "", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartQuantViewModel;", "cartQuantViewModel", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantActionHandlerFactory;", "actionHandlerFactory", "Lru/ozon/app/android/pdp/view/animationsaleblock/SaleBlockViewModel;", "saleBlockViewModel", "Landroid/content/SharedPreferences;", "sharedPreferences", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantNotificationHandler;", "notificationHandler", "Lru/ozon/app/android/composer/ComposerNavigator;", "composerNavigator", "<init>", "(Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartQuantViewModel;Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantActionHandlerFactory;Lru/ozon/app/android/pdp/view/animationsaleblock/SaleBlockViewModel;Landroid/content/SharedPreferences;Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantNotificationHandler;Lru/ozon/app/android/composer/ComposerNavigator;)V", "Ll10/v;", "getViewModel", "(Ll10/v;)Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartQuantViewModel;", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartQuantView;", "cartView", "Lkotlin/Function0;", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/cart/CartQuantVO;", "voProvider", "Ll10/i;", "container", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/cart/CartButtonQuantQuantOverlayViewHolder;", "overlayWidgetViewHolder", "Lkotlin/Function1;", "", "", "onShowLoader", "onContainerInitialized", "(Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartQuantView;Lkotlin/jvm/functions/Function0;Ll10/i;Lru/ozon/app/android/pdp/widgets/cartButtonQuant/cart/CartButtonQuantQuantOverlayViewHolder;Lkotlin/jvm/functions/Function1;)V", "vo", "onBind", "(Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartQuantView;Lru/ozon/app/android/pdp/widgets/cartButtonQuant/cart/CartQuantVO;Ll10/i;)V", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartQuantViewModel;", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantActionHandlerFactory;", "Lru/ozon/app/android/pdp/view/animationsaleblock/SaleBlockViewModel;", "Landroid/content/SharedPreferences;", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantNotificationHandler;", "Lru/ozon/app/android/composer/ComposerNavigator;", "", "deeplinkRecommendation", "Ljava/lang/String;", "viewModelSaleBlock", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CartQuantViewBinder {

    @NotNull
    private final CartButtonQuantActionHandlerFactory actionHandlerFactory;

    @NotNull
    private final CartQuantViewModel cartQuantViewModel;

    @NotNull
    private final ComposerNavigator composerNavigator;
    private String deeplinkRecommendation;

    @NotNull
    private final CartButtonQuantNotificationHandler notificationHandler;

    @NotNull
    private final SaleBlockViewModel saleBlockViewModel;

    @NotNull
    private final SharedPreferences sharedPreferences;
    private SaleBlockViewModel viewModelSaleBlock;

    public CartQuantViewBinder(@NotNull CartQuantViewModel cartQuantViewModel, @NotNull CartButtonQuantActionHandlerFactory actionHandlerFactory, @NotNull SaleBlockViewModel saleBlockViewModel, @NotNull SharedPreferences sharedPreferences, @NotNull CartButtonQuantNotificationHandler notificationHandler, @NotNull ComposerNavigator composerNavigator) {
        Intrinsics.checkNotNullParameter(cartQuantViewModel, "cartQuantViewModel");
        Intrinsics.checkNotNullParameter(actionHandlerFactory, "actionHandlerFactory");
        Intrinsics.checkNotNullParameter(saleBlockViewModel, "saleBlockViewModel");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(notificationHandler, "notificationHandler");
        Intrinsics.checkNotNullParameter(composerNavigator, "composerNavigator");
        this.cartQuantViewModel = cartQuantViewModel;
        this.actionHandlerFactory = actionHandlerFactory;
        this.saleBlockViewModel = saleBlockViewModel;
        this.sharedPreferences = sharedPreferences;
        this.notificationHandler = notificationHandler;
        this.composerNavigator = composerNavigator;
    }

    private final CartQuantViewModel getViewModel(v vVar) {
        return (CartQuantViewModel) new z0(vVar.a(), new z0.c() { // from class: ru.ozon.app.android.pdp.widgets.cartButtonQuant.cart.CartQuantViewBinder$getViewModel$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                CartQuantViewModel cartQuantViewModel;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                cartQuantViewModel = CartQuantViewBinder.this.cartQuantViewModel;
                Intrinsics.g(cartQuantViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return cartQuantViewModel;
            }
        }).a(CartQuantViewModel.class);
    }

    public final void onBind(@NotNull CartQuantView cartView, @NotNull CartQuantVO vo, @NotNull i container) {
        Intrinsics.checkNotNullParameter(cartView, "cartView");
        Intrinsics.checkNotNullParameter(vo, "vo");
        Intrinsics.checkNotNullParameter(container, "container");
        if (this.viewModelSaleBlock == null) {
            this.viewModelSaleBlock = (SaleBlockViewModel) new z0(container.b0().b(), new z0.c() { // from class: ru.ozon.app.android.pdp.widgets.cartButtonQuant.cart.CartQuantViewBinder$onBind$$inlined$sharedViewModel$1
                @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
                public <T extends w0> T create(Class<T> modelClass) {
                    SaleBlockViewModel saleBlockViewModel;
                    Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                    saleBlockViewModel = CartQuantViewBinder.this.saleBlockViewModel;
                    Intrinsics.g(saleBlockViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                    return saleBlockViewModel;
                }
            }).a(SaleBlockViewModel.class);
        }
        SaleBlockViewModel saleBlockViewModel = this.viewModelSaleBlock;
        if (saleBlockViewModel != null) {
            saleBlockViewModel.changeStateItemInCart(vo.getQuantity() != 0);
        }
        int quantity = vo.getQuantity();
        ButtonV3Atom.LargeButton mainButton = QuantExtKt.mainButton(vo.getToCart());
        Map<Long, ? extends Set<PDPCartQuantItemInfo>> i11 = U.i(new Pair(Long.valueOf(vo.getSku()), e0.h(new PDPCartQuantItemInfo(quantity, QuantExtKt.getSelectedQuantDeliverySchema(mainButton), null, QuantExtKt.getForStars(mainButton), null, 20, null))));
        if (vo.getIsUpdateData() || QuantExtKt.getSelectedQuantDeliverySchema(QuantExtKt.mainButton(vo.getInCart())) != null) {
            cartView.bind(vo);
        }
        getViewModel(container.b0()).bind(i11, Long.valueOf(vo.getId()), new Pair<>(Long.valueOf(vo.getSku()), 0L), container.X(), vo.getIsUpdateData());
    }

    public final void onContainerInitialized(@NotNull CartQuantView cartView, @NotNull Function0<CartQuantVO> voProvider, @NotNull i container, @NotNull CartButtonQuantQuantOverlayViewHolder overlayWidgetViewHolder, Function1<? super Boolean, Unit> onShowLoader) {
        Intrinsics.checkNotNullParameter(cartView, "cartView");
        Intrinsics.checkNotNullParameter(voProvider, "voProvider");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(overlayWidgetViewHolder, "overlayWidgetViewHolder");
        CartQuantViewModel viewModel = getViewModel(container.b0());
        viewModel.getAction().observe(container.K().f(), new CartQuantViewBinder$sam$androidx_lifecycle_Observer$0(new CartQuantViewBinder$onContainerInitialized$1(container, cartView, onShowLoader)));
        viewModel.getShowRecommendations().observe(container.K().f(), new CartQuantViewBinder$sam$androidx_lifecycle_Observer$0(new CartQuantViewBinder$onContainerInitialized$2(this)));
        cartView.setActionHandlerBuilder(this.actionHandlerFactory.builder(container, overlayWidgetViewHolder));
        cartView.setOnAddToCartClick(new CartQuantViewBinder$onContainerInitialized$3$1(container, this, viewModel, voProvider, overlayWidgetViewHolder));
        cartView.setOnMinusCartClick(new CartQuantViewBinder$onContainerInitialized$3$2(viewModel, voProvider));
        cartView.setOnPlusCartClick(new CartQuantViewBinder$onContainerInitialized$3$3(viewModel, voProvider));
        cartView.setShowinfoDigitalModal(new CartQuantViewBinder$onContainerInitialized$3$4(this));
    }
}
