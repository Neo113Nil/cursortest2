package ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart;

import GZ.g;
import android.content.SharedPreferences;
import android.view.View;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import d20.AbstractC6065b;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l10.v;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.CartButtonActionHandlerFactory;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.CartButtonNotificationHandler;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.CartViewModel;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.ExpressSheetVisibilityStorage;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.ExtKt;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.PDPCartItemInfo;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.DoubleCartVO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0001\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u001a*\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001e\u001a\u00020\u0002*\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJS\u0010+\u001a\u00020\u00162\u0006\u0010!\u001a\u00020 2\u000e\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\"2\u0006\u0010%\u001a\u00020$2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00120&2\u0016\b\u0002\u0010*\u001a\u0010\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u0016\u0018\u00010(¢\u0006\u0004\b+\u0010,J=\u0010/\u001a\u00020\u00162\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010%\u001a\u00020$2\u0016\b\u0002\u0010.\u001a\u0010\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u0016\u0018\u00010(¢\u0006\u0004\b/\u00100R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00101R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00102R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00103R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00104R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00105R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00106R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00107R0\u00108\u001a\u0010\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u0016\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0018\u0010>\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?¨\u0006@"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartViewBinder;", "", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartViewModel;", "cartViewModel", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonActionHandlerFactory;", "actionHandlerFactory", "LGZ/g;", "ozonRouter", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "Landroid/content/SharedPreferences;", "sharedPreferences", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonNotificationHandler;", "notificationHandler", "Lru/ozon/app/android/composer/ComposerNavigator;", "composerNavigator", "<init>", "(Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartViewModel;Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonActionHandlerFactory;LGZ/g;Lru/ozon/app/android/cart/common/domain/CartService;Landroid/content/SharedPreferences;Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonNotificationHandler;Lru/ozon/app/android/composer/ComposerNavigator;)V", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO;", "vo", "", "selectedDeliverySchema", "", "showExpressSheet", "(Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO;J)V", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "", "getLink", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;)Ljava/lang/String;", "Ll10/v;", "getCartViewModel", "(Ll10/v;)Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartViewModel;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartView;", "view", "Lkotlin/Function0;", "voProvider", "Ll10/i;", "container", "Ld20/b;", "overlayWidgetViewHolder", "Lkotlin/Function1;", "", "onShowLoader", "onContainerInitialized", "(Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartView;Lkotlin/jvm/functions/Function0;Ll10/i;Ld20/b;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/View;", "onBind", "bind", "(Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartView;Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO;Ll10/i;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartViewModel;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonActionHandlerFactory;", "LGZ/g;", "Lru/ozon/app/android/cart/common/domain/CartService;", "Landroid/content/SharedPreferences;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonNotificationHandler;", "Lru/ozon/app/android/composer/ComposerNavigator;", "onShowRelatedProductsBottomSheet", "Lkotlin/jvm/functions/Function1;", "getOnShowRelatedProductsBottomSheet", "()Lkotlin/jvm/functions/Function1;", "setOnShowRelatedProductsBottomSheet", "(Lkotlin/jvm/functions/Function1;)V", "deeplinkRecommendation", "Ljava/lang/String;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DoubleCartViewBinder {

    @NotNull
    private final CartButtonActionHandlerFactory actionHandlerFactory;

    @NotNull
    private final CartService cartService;

    @NotNull
    private final CartViewModel cartViewModel;

    @NotNull
    private final ComposerNavigator composerNavigator;
    private String deeplinkRecommendation;

    @NotNull
    private final CartButtonNotificationHandler notificationHandler;
    private Function1<? super Boolean, Unit> onShowRelatedProductsBottomSheet;

    @NotNull
    private final g ozonRouter;

    @NotNull
    private final SharedPreferences sharedPreferences;

    public DoubleCartViewBinder(@NotNull CartViewModel cartViewModel, @NotNull CartButtonActionHandlerFactory actionHandlerFactory, @NotNull g ozonRouter, @NotNull CartService cartService, @NotNull SharedPreferences sharedPreferences, @NotNull CartButtonNotificationHandler notificationHandler, @NotNull ComposerNavigator composerNavigator) {
        Intrinsics.checkNotNullParameter(cartViewModel, "cartViewModel");
        Intrinsics.checkNotNullParameter(actionHandlerFactory, "actionHandlerFactory");
        Intrinsics.checkNotNullParameter(ozonRouter, "ozonRouter");
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(notificationHandler, "notificationHandler");
        Intrinsics.checkNotNullParameter(composerNavigator, "composerNavigator");
        this.cartViewModel = cartViewModel;
        this.actionHandlerFactory = actionHandlerFactory;
        this.ozonRouter = ozonRouter;
        this.cartService = cartService;
        this.sharedPreferences = sharedPreferences;
        this.notificationHandler = notificationHandler;
        this.composerNavigator = composerNavigator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void bind$default(DoubleCartViewBinder doubleCartViewBinder, DoubleCartView doubleCartView, DoubleCartVO doubleCartVO, i iVar, Function1 function1, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            function1 = null;
        }
        doubleCartViewBinder.bind(doubleCartView, doubleCartVO, iVar, function1);
    }

    private final CartViewModel getCartViewModel(v vVar) {
        return (CartViewModel) new z0(vVar.a(), new z0.c() { // from class: ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.DoubleCartViewBinder$getCartViewModel$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                CartViewModel cartViewModel;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                cartViewModel = DoubleCartViewBinder.this.cartViewModel;
                Intrinsics.g(cartViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return cartViewModel;
            }
        }).a(CartViewModel.class);
    }

    private final String getLink(ButtonV3Atom.LargeButton largeButton) {
        Map<String, String> params;
        AtomActionDTO action = largeButton.getAction();
        if (action == null || (params = action.getParams()) == null) {
            return null;
        }
        return params.get("link");
    }

    public static /* synthetic */ void onContainerInitialized$default(DoubleCartViewBinder doubleCartViewBinder, DoubleCartView doubleCartView, Function0 function0, i iVar, AbstractC6065b abstractC6065b, Function1 function1, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            function1 = null;
        }
        doubleCartViewBinder.onContainerInitialized(doubleCartView, function0, iVar, abstractC6065b, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showExpressSheet(DoubleCartVO vo, long selectedDeliverySchema) {
        Object obj;
        String link;
        if (ExpressSheetVisibilityStorage.INSTANCE.isExpressSheetNotShown()) {
            Iterator it = C7714v.b0(ExtKt.mainButton(vo.getFirstCartData().getToCart()), ExtKt.mainButton(vo.getSecondCartData().getToCart())).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                Long selectedDeliverySchema2 = ExtKt.getSelectedDeliverySchema((ButtonV3Atom.LargeButton) obj);
                if (selectedDeliverySchema2 != null && selectedDeliverySchema2.longValue() == selectedDeliverySchema) {
                    break;
                }
            }
            ButtonV3Atom.LargeButton largeButton = (ButtonV3Atom.LargeButton) obj;
            if (largeButton == null || (link = getLink(largeButton)) == null) {
                return;
            }
            g.a.a(this.ozonRouter, link, null, null, 6);
            ExpressSheetVisibilityStorage.INSTANCE.expressSheetShowed();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void bind(@NotNull DoubleCartView view, @NotNull DoubleCartVO vo, @NotNull i container, final Function1<? super View, Unit> onBind) {
        Map<Long, ? extends Set<PDPCartItemInfo>> j11;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(vo, "vo");
        Intrinsics.checkNotNullParameter(container, "container");
        if (vo.getFirstCartData().getIsUpdateData()) {
            view.bind(vo);
            View view2 = view instanceof View ? (View) view : null;
            if (view2 != null) {
                if (!view2.isLaidOut() || view2.isLayoutRequested()) {
                    view2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.DoubleCartViewBinder$bind$$inlined$doOnLayout$1
                        @Override // android.view.View.OnLayoutChangeListener
                        public void onLayoutChange(@NotNull View view3, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                            view3.removeOnLayoutChangeListener(this);
                            Function1 function1 = Function1.this;
                            if (function1 != null) {
                                function1.invoke(view3);
                            }
                        }
                    });
                } else if (onBind != null) {
                    onBind.invoke(view2);
                }
            }
        }
        ButtonV3Atom.LargeButton firstToCart = ExtKt.getFirstToCart(vo);
        PDPCartItemInfo pDPCartItemInfo = new PDPCartItemInfo(vo.getFirstCartData().getQuantity(), ExtKt.getSelectedDeliverySchema(firstToCart), null, ExtKt.getForStars(firstToCart), DoubleCartVO.CartMode.FIRST, 4, null);
        ButtonV3Atom.LargeButton secondToCart = ExtKt.getSecondToCart(vo);
        PDPCartItemInfo pDPCartItemInfo2 = new PDPCartItemInfo(vo.getSecondCartData().getQuantity(), ExtKt.getSelectedDeliverySchema(secondToCart), null, ExtKt.getForStars(secondToCart), DoubleCartVO.CartMode.SECOND, 4, null);
        if (vo.getFirstCartData().getSku() == vo.getSecondCartData().getSku()) {
            Long valueOf = Long.valueOf(vo.getFirstCartData().getSku());
            PDPCartItemInfo[] elements = {pDPCartItemInfo, pDPCartItemInfo2};
            Intrinsics.checkNotNullParameter(elements, "elements");
            j11 = U.i(new Pair(valueOf, C7705l.j0(elements)));
        } else {
            j11 = U.j(new Pair(Long.valueOf(vo.getFirstCartData().getSku()), e0.h(pDPCartItemInfo)), new Pair(Long.valueOf(vo.getSecondCartData().getSku()), e0.h(pDPCartItemInfo2)));
        }
        getCartViewModel(container.b0()).bind(j11, Long.valueOf(vo.getId()), new Pair<>(Long.valueOf(vo.getFirstCartData().getSku()), Long.valueOf(vo.getSecondCartData().getSku())), container.X(), vo.getFirstCartData().getIsUpdateData());
    }

    public final Function1<Boolean, Unit> getOnShowRelatedProductsBottomSheet() {
        return this.onShowRelatedProductsBottomSheet;
    }

    public final void onContainerInitialized(@NotNull DoubleCartView view, @NotNull Function0<DoubleCartVO> voProvider, @NotNull i container, @NotNull AbstractC6065b<DoubleCartVO> overlayWidgetViewHolder, Function1<? super Boolean, Unit> onShowLoader) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(voProvider, "voProvider");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(overlayWidgetViewHolder, "overlayWidgetViewHolder");
        CartViewModel cartViewModel = getCartViewModel(container.b0());
        view.setActionHandlerBuilder(this.actionHandlerFactory.builder(container, overlayWidgetViewHolder));
        view.setOnAddToCartClick(new DoubleCartViewBinder$onContainerInitialized$1$1(voProvider, cartViewModel));
        view.setOnAddToCartClickRecommendation(new DoubleCartViewBinder$onContainerInitialized$1$2(voProvider, container, cartViewModel, this, overlayWidgetViewHolder));
        view.setOnMinusCartClick(new DoubleCartViewBinder$onContainerInitialized$1$3(voProvider, cartViewModel));
        view.setOnPlusCartClick(new DoubleCartViewBinder$onContainerInitialized$1$4(voProvider, cartViewModel));
        view.setShowinfoDigitalModal(new DoubleCartViewBinder$onContainerInitialized$1$5(this));
        cartViewModel.getShowRecommendations().observe(container.K().f(), new DoubleCartViewBinderKt$sam$androidx_lifecycle_Observer$0(new DoubleCartViewBinder$onContainerInitialized$2(this)));
        cartViewModel.getAction().removeObservers(container.K().f());
        cartViewModel.getAction().observe(container.K().f(), new DoubleCartViewBinderKt$sam$androidx_lifecycle_Observer$0(new DoubleCartViewBinder$onContainerInitialized$3(container, voProvider, view, onShowLoader, this)));
        this.cartService.attach(container.X());
    }

    public final void setOnShowRelatedProductsBottomSheet(Function1<? super Boolean, Unit> function1) {
        this.onShowRelatedProductsBottomSheet = function1;
    }
}
