package ru.ozon.app.android.pdp.widgets.cartButtonQuant.doubleCart;

import GZ.g;
import android.content.SharedPreferences;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
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
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.CartButtonQuantActionHandlerFactory;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.CartButtonQuantNotificationHandler;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.CartQuantViewModel;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.PDPCartQuantItemInfo;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.QuantExpressSheetVisibilityStorage;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.QuantExtKt;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.doubleCart.DoubleCartQuantVO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u001a*\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001e\u001a\u00020\u0002*\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJM\u0010+\u001a\u00020\u00162\u0006\u0010!\u001a\u00020 2\u000e\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\u0016\b\u0002\u0010*\u001a\u0010\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u0016\u0018\u00010(¢\u0006\u0004\b+\u0010,J%\u0010-\u001a\u00020\u00162\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010/R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00100R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00101R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00102R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00103R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00104R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00105R\u0018\u00106\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107¨\u00068"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantViewBinder;", "", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartQuantViewModel;", "cartQuantViewModel", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantActionHandlerFactory;", "actionHandlerFactory", "LGZ/g;", "ozonRouter", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "Landroid/content/SharedPreferences;", "sharedPreferences", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantNotificationHandler;", "notificationHandler", "Lru/ozon/app/android/composer/ComposerNavigator;", "composerNavigator", "<init>", "(Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartQuantViewModel;Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantActionHandlerFactory;LGZ/g;Lru/ozon/app/android/cart/common/domain/CartService;Landroid/content/SharedPreferences;Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantNotificationHandler;Lru/ozon/app/android/composer/ComposerNavigator;)V", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantVO;", "vo", "", "selectedDeliverySchema", "", "showExpressSheet", "(Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantVO;J)V", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "", "getLink", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;)Ljava/lang/String;", "Ll10/v;", "getCartViewModel", "(Ll10/v;)Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartQuantViewModel;", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantView;", "view", "Lkotlin/Function0;", "voProvider", "Ll10/i;", "container", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantViewHolder;", "overlayWidgetViewHolder", "Lkotlin/Function1;", "", "onShowLoader", "onContainerInitialized", "(Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantView;Lkotlin/jvm/functions/Function0;Ll10/i;Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantViewHolder;Lkotlin/jvm/functions/Function1;)V", "bind", "(Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantView;Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantVO;Ll10/i;)V", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartQuantViewModel;", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantActionHandlerFactory;", "LGZ/g;", "Lru/ozon/app/android/cart/common/domain/CartService;", "Landroid/content/SharedPreferences;", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartButtonQuantNotificationHandler;", "Lru/ozon/app/android/composer/ComposerNavigator;", "deeplinkRecommendation", "Ljava/lang/String;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DoubleCartQuantViewBinder {

    @NotNull
    private final CartButtonQuantActionHandlerFactory actionHandlerFactory;

    @NotNull
    private final CartQuantViewModel cartQuantViewModel;

    @NotNull
    private final CartService cartService;

    @NotNull
    private final ComposerNavigator composerNavigator;
    private String deeplinkRecommendation;

    @NotNull
    private final CartButtonQuantNotificationHandler notificationHandler;

    @NotNull
    private final g ozonRouter;

    @NotNull
    private final SharedPreferences sharedPreferences;

    public DoubleCartQuantViewBinder(@NotNull CartQuantViewModel cartQuantViewModel, @NotNull CartButtonQuantActionHandlerFactory actionHandlerFactory, @NotNull g ozonRouter, @NotNull CartService cartService, @NotNull SharedPreferences sharedPreferences, @NotNull CartButtonQuantNotificationHandler notificationHandler, @NotNull ComposerNavigator composerNavigator) {
        Intrinsics.checkNotNullParameter(cartQuantViewModel, "cartQuantViewModel");
        Intrinsics.checkNotNullParameter(actionHandlerFactory, "actionHandlerFactory");
        Intrinsics.checkNotNullParameter(ozonRouter, "ozonRouter");
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(notificationHandler, "notificationHandler");
        Intrinsics.checkNotNullParameter(composerNavigator, "composerNavigator");
        this.cartQuantViewModel = cartQuantViewModel;
        this.actionHandlerFactory = actionHandlerFactory;
        this.ozonRouter = ozonRouter;
        this.cartService = cartService;
        this.sharedPreferences = sharedPreferences;
        this.notificationHandler = notificationHandler;
        this.composerNavigator = composerNavigator;
    }

    private final CartQuantViewModel getCartViewModel(v vVar) {
        return (CartQuantViewModel) new z0(vVar.a(), new z0.c() { // from class: ru.ozon.app.android.pdp.widgets.cartButtonQuant.doubleCart.DoubleCartQuantViewBinder$getCartViewModel$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                CartQuantViewModel cartQuantViewModel;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                cartQuantViewModel = DoubleCartQuantViewBinder.this.cartQuantViewModel;
                Intrinsics.g(cartQuantViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return cartQuantViewModel;
            }
        }).a(CartQuantViewModel.class);
    }

    private final String getLink(ButtonV3Atom.LargeButton largeButton) {
        Map<String, String> params;
        AtomActionDTO action = largeButton.getAction();
        if (action == null || (params = action.getParams()) == null) {
            return null;
        }
        return params.get("link");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showExpressSheet(DoubleCartQuantVO vo, long selectedDeliverySchema) {
        Object obj;
        String link;
        if (QuantExpressSheetVisibilityStorage.INSTANCE.isExpressSheetNotShown()) {
            Iterator it = C7714v.b0(QuantExtKt.mainButton(vo.getFirstCartData().getToCart()), QuantExtKt.mainButton(vo.getSecondCartData().getToCart())).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                Long selectedQuantDeliverySchema = QuantExtKt.getSelectedQuantDeliverySchema((ButtonV3Atom.LargeButton) obj);
                if (selectedQuantDeliverySchema != null && selectedQuantDeliverySchema.longValue() == selectedDeliverySchema) {
                    break;
                }
            }
            ButtonV3Atom.LargeButton largeButton = (ButtonV3Atom.LargeButton) obj;
            if (largeButton == null || (link = getLink(largeButton)) == null) {
                return;
            }
            g.a.a(this.ozonRouter, link, null, null, 6);
            QuantExpressSheetVisibilityStorage.INSTANCE.expressSheetShowed();
        }
    }

    public final void bind(@NotNull DoubleCartQuantView view, @NotNull DoubleCartQuantVO vo, @NotNull i container) {
        Map<Long, ? extends Set<PDPCartQuantItemInfo>> j11;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(vo, "vo");
        Intrinsics.checkNotNullParameter(container, "container");
        if (vo.getFirstCartData().getIsUpdateData()) {
            view.bind(vo);
        }
        ButtonV3Atom.LargeButton firstToCart = QuantExtKt.getFirstToCart(vo);
        PDPCartQuantItemInfo pDPCartQuantItemInfo = new PDPCartQuantItemInfo(vo.getFirstCartData().getQuantity(), QuantExtKt.getSelectedQuantDeliverySchema(firstToCart), null, QuantExtKt.getForStars(firstToCart), DoubleCartQuantVO.CartMode.FIRST, 4, null);
        ButtonV3Atom.LargeButton secondToCart = QuantExtKt.getSecondToCart(vo);
        PDPCartQuantItemInfo pDPCartQuantItemInfo2 = new PDPCartQuantItemInfo(vo.getSecondCartData().getQuantity(), QuantExtKt.getSelectedQuantDeliverySchema(secondToCart), null, QuantExtKt.getForStars(secondToCart), DoubleCartQuantVO.CartMode.SECOND, 4, null);
        if (vo.getFirstCartData().getSku() == vo.getSecondCartData().getSku()) {
            Long valueOf = Long.valueOf(vo.getFirstCartData().getSku());
            PDPCartQuantItemInfo[] elements = {pDPCartQuantItemInfo, pDPCartQuantItemInfo2};
            Intrinsics.checkNotNullParameter(elements, "elements");
            j11 = U.i(new Pair(valueOf, C7705l.j0(elements)));
        } else {
            j11 = U.j(new Pair(Long.valueOf(vo.getFirstCartData().getSku()), e0.h(pDPCartQuantItemInfo)), new Pair(Long.valueOf(vo.getSecondCartData().getSku()), e0.h(pDPCartQuantItemInfo2)));
        }
        getCartViewModel(container.b0()).bind(j11, Long.valueOf(vo.getId()), new Pair<>(Long.valueOf(vo.getFirstCartData().getSku()), Long.valueOf(vo.getSecondCartData().getSku())), container.X(), vo.getFirstCartData().getIsUpdateData());
    }

    public final void onContainerInitialized(@NotNull DoubleCartQuantView view, @NotNull Function0<DoubleCartQuantVO> voProvider, @NotNull i container, @NotNull DoubleCartQuantViewHolder overlayWidgetViewHolder, Function1<? super Boolean, Unit> onShowLoader) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(voProvider, "voProvider");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(overlayWidgetViewHolder, "overlayWidgetViewHolder");
        CartQuantViewModel cartViewModel = getCartViewModel(container.b0());
        view.setActionHandlerBuilder(this.actionHandlerFactory.builder(container, overlayWidgetViewHolder));
        view.setOnAddToCartClick(new DoubleCartQuantViewBinder$onContainerInitialized$1$1(voProvider, cartViewModel));
        view.setOnAddToCartClickRecommendation(new DoubleCartQuantViewBinder$onContainerInitialized$1$2(voProvider, container, cartViewModel, this, overlayWidgetViewHolder));
        view.setOnMinusCartClick(new DoubleCartQuantViewBinder$onContainerInitialized$1$3(voProvider, cartViewModel));
        view.setOnPlusCartClick(new DoubleCartQuantViewBinder$onContainerInitialized$1$4(voProvider, cartViewModel));
        view.setShowinfoDigitalModal(new DoubleCartQuantViewBinder$onContainerInitialized$1$5(this));
        cartViewModel.getShowRecommendations().observe(container.K().f(), new DoubleCartQuantViewBinderKt$sam$androidx_lifecycle_Observer$0(new DoubleCartQuantViewBinder$onContainerInitialized$2(this)));
        cartViewModel.getAction().observe(container.K().f(), new DoubleCartQuantViewBinderKt$sam$androidx_lifecycle_Observer$0(new DoubleCartQuantViewBinder$onContainerInitialized$3(container, voProvider, view, onShowLoader, this)));
        this.cartService.attach(container.X());
    }
}
