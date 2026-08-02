package ru.ozon.app.android.pdp.widgets.cartButtonV4.cart;

import android.content.SharedPreferences;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import d20.AbstractC6065b;
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
import ru.ozon.app.android.pdp.widgets.cartButtonV4.CartButtonActionHandlerFactory;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.CartButtonNotificationHandler;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.CartView;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.CartViewModel;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.ExtKt;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.PDPCartItemInfo;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\u00020\u0002*\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012JO\u0010 \u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0019\u001a\u00020\u00182\n\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u001a2\u0016\b\u0002\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001c¢\u0006\u0004\b \u0010!J7\u0010#\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0015¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010)R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010*R0\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00104\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010'¨\u00065"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/cart/CartViewBinder;", "", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartViewModel;", "cartViewModel", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonActionHandlerFactory;", "actionHandlerFactory", "Lru/ozon/app/android/pdp/view/animationsaleblock/SaleBlockViewModel;", "saleBlockViewModel", "Landroid/content/SharedPreferences;", "sharedPreferences", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonNotificationHandler;", "notificationHandler", "Lru/ozon/app/android/composer/ComposerNavigator;", "composerNavigator", "<init>", "(Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartViewModel;Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonActionHandlerFactory;Lru/ozon/app/android/pdp/view/animationsaleblock/SaleBlockViewModel;Landroid/content/SharedPreferences;Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonNotificationHandler;Lru/ozon/app/android/composer/ComposerNavigator;)V", "Ll10/v;", "getViewModel", "(Ll10/v;)Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartViewModel;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartView;", "cartView", "Lkotlin/Function0;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/cart/CartVO;", "voProvider", "Ll10/i;", "container", "Ld20/b;", "overlayWidgetViewHolder", "Lkotlin/Function1;", "", "", "onShowLoader", "onContainerInitialized", "(Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartView;Lkotlin/jvm/functions/Function0;Ll10/i;Ld20/b;Lkotlin/jvm/functions/Function1;)V", "vo", "onBind", "(Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartView;Lru/ozon/app/android/pdp/widgets/cartButtonV4/cart/CartVO;Ll10/i;Lkotlin/jvm/functions/Function0;)V", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartViewModel;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonActionHandlerFactory;", "Lru/ozon/app/android/pdp/view/animationsaleblock/SaleBlockViewModel;", "Landroid/content/SharedPreferences;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonNotificationHandler;", "Lru/ozon/app/android/composer/ComposerNavigator;", "onShowRelatedProductsBottomSheet", "Lkotlin/jvm/functions/Function1;", "getOnShowRelatedProductsBottomSheet", "()Lkotlin/jvm/functions/Function1;", "setOnShowRelatedProductsBottomSheet", "(Lkotlin/jvm/functions/Function1;)V", "", "deeplinkRecommendation", "Ljava/lang/String;", "viewModelSaleBlock", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CartViewBinder {

    @NotNull
    private final CartButtonActionHandlerFactory actionHandlerFactory;

    @NotNull
    private final CartViewModel cartViewModel;

    @NotNull
    private final ComposerNavigator composerNavigator;
    private String deeplinkRecommendation;

    @NotNull
    private final CartButtonNotificationHandler notificationHandler;
    private Function1<? super Boolean, Unit> onShowRelatedProductsBottomSheet;

    @NotNull
    private final SaleBlockViewModel saleBlockViewModel;

    @NotNull
    private final SharedPreferences sharedPreferences;
    private SaleBlockViewModel viewModelSaleBlock;

    public CartViewBinder(@NotNull CartViewModel cartViewModel, @NotNull CartButtonActionHandlerFactory actionHandlerFactory, @NotNull SaleBlockViewModel saleBlockViewModel, @NotNull SharedPreferences sharedPreferences, @NotNull CartButtonNotificationHandler notificationHandler, @NotNull ComposerNavigator composerNavigator) {
        Intrinsics.checkNotNullParameter(cartViewModel, "cartViewModel");
        Intrinsics.checkNotNullParameter(actionHandlerFactory, "actionHandlerFactory");
        Intrinsics.checkNotNullParameter(saleBlockViewModel, "saleBlockViewModel");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(notificationHandler, "notificationHandler");
        Intrinsics.checkNotNullParameter(composerNavigator, "composerNavigator");
        this.cartViewModel = cartViewModel;
        this.actionHandlerFactory = actionHandlerFactory;
        this.saleBlockViewModel = saleBlockViewModel;
        this.sharedPreferences = sharedPreferences;
        this.notificationHandler = notificationHandler;
        this.composerNavigator = composerNavigator;
    }

    private final CartViewModel getViewModel(v vVar) {
        return (CartViewModel) new z0(vVar.a(), new z0.c() { // from class: ru.ozon.app.android.pdp.widgets.cartButtonV4.cart.CartViewBinder$getViewModel$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                CartViewModel cartViewModel;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                cartViewModel = CartViewBinder.this.cartViewModel;
                Intrinsics.g(cartViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return cartViewModel;
            }
        }).a(CartViewModel.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onBind$default(CartViewBinder cartViewBinder, CartView cartView, CartVO cartVO, i iVar, Function0 function0, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            function0 = null;
        }
        cartViewBinder.onBind(cartView, cartVO, iVar, function0);
    }

    public static /* synthetic */ void onContainerInitialized$default(CartViewBinder cartViewBinder, CartView cartView, Function0 function0, i iVar, AbstractC6065b abstractC6065b, Function1 function1, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            function1 = null;
        }
        cartViewBinder.onContainerInitialized(cartView, function0, iVar, abstractC6065b, function1);
    }

    public final Function1<Boolean, Unit> getOnShowRelatedProductsBottomSheet() {
        return this.onShowRelatedProductsBottomSheet;
    }

    public final void onBind(@NotNull CartView cartView, @NotNull CartVO vo, @NotNull i container, Function0<Unit> onBind) {
        Intrinsics.checkNotNullParameter(cartView, "cartView");
        Intrinsics.checkNotNullParameter(vo, "vo");
        Intrinsics.checkNotNullParameter(container, "container");
        if (this.viewModelSaleBlock == null) {
            this.viewModelSaleBlock = (SaleBlockViewModel) new z0(container.b0().b(), new z0.c() { // from class: ru.ozon.app.android.pdp.widgets.cartButtonV4.cart.CartViewBinder$onBind$$inlined$sharedViewModel$1
                @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
                public <T extends w0> T create(Class<T> modelClass) {
                    SaleBlockViewModel saleBlockViewModel;
                    Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                    saleBlockViewModel = CartViewBinder.this.saleBlockViewModel;
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
        ButtonV3Atom.LargeButton mainButton = ExtKt.mainButton(vo.getToCart());
        Map<Long, ? extends Set<PDPCartItemInfo>> i11 = U.i(new Pair(Long.valueOf(vo.getSku()), e0.h(new PDPCartItemInfo(quantity, ExtKt.getSelectedDeliverySchema(mainButton), null, ExtKt.getForStars(mainButton), null, 20, null))));
        if (vo.getIsUpdateData() || ExtKt.getSelectedDeliverySchema(ExtKt.mainButton(vo.getToCart())) != null) {
            cartView.bind(vo);
            if (onBind != null) {
                onBind.invoke();
            }
        }
        getViewModel(container.b0()).bind(i11, Long.valueOf(vo.getId()), new Pair<>(Long.valueOf(vo.getSku()), 0L), container.X(), vo.getIsUpdateData());
    }

    public final void onContainerInitialized(@NotNull CartView cartView, @NotNull Function0<CartVO> voProvider, @NotNull i container, @NotNull AbstractC6065b<?> overlayWidgetViewHolder, Function1<? super Boolean, Unit> onShowLoader) {
        Intrinsics.checkNotNullParameter(cartView, "cartView");
        Intrinsics.checkNotNullParameter(voProvider, "voProvider");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(overlayWidgetViewHolder, "overlayWidgetViewHolder");
        CartViewModel viewModel = getViewModel(container.b0());
        this.cartViewModel.getAction().removeObservers(container.K().f());
        viewModel.getAction().observe(container.K().f(), new CartViewBinder$sam$androidx_lifecycle_Observer$0(new CartViewBinder$onContainerInitialized$1(container, cartView, onShowLoader, this)));
        viewModel.getShowRecommendations().observe(container.K().f(), new CartViewBinder$sam$androidx_lifecycle_Observer$0(new CartViewBinder$onContainerInitialized$2(this)));
        cartView.setActionHandlerBuilder(this.actionHandlerFactory.builder(container, overlayWidgetViewHolder));
        cartView.setOnAddToCartClick(new CartViewBinder$onContainerInitialized$3$1(container, this, viewModel, voProvider, overlayWidgetViewHolder));
        cartView.setOnMinusCartClick(new CartViewBinder$onContainerInitialized$3$2(viewModel, voProvider));
        cartView.setOnPlusCartClick(new CartViewBinder$onContainerInitialized$3$3(viewModel, voProvider));
        cartView.setShowinfoDigitalModal(new CartViewBinder$onContainerInitialized$3$4(this));
    }

    public final void setOnShowRelatedProductsBottomSheet(Function1<? super Boolean, Unit> function1) {
        this.onShowRelatedProductsBottomSheet = function1;
    }
}
