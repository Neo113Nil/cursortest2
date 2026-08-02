package ru.ozon.app.android.cart.cartSplitV2.v1.presentation.item;

import A00.a;
import Cz.ViewOnClickListenerC2788a;
import Go.C3125a;
import Go.b;
import Go.c;
import Go.e;
import Il.a;
import Vg.d;
import WZ.t;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import h20.InterfaceC6786a;
import i10.h;
import io.reactivex.p;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import jk0.q;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l10.InterfaceC7851b;
import m10.C8042d;
import mc.C8125a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.cart.CartViewModel;
import ru.ozon.app.android.cart.cartSplitV2.BuyOneClickButtonBinder;
import ru.ozon.app.android.cart.cartSplitV2.LockedQuantityBinder;
import ru.ozon.app.android.cart.cartSplitV2.v1.presentation.item.CartSplitV2ItemVO;
import ru.ozon.app.android.cart.cartSplitV2.v1.presentation.item.CartSplitV2ItemWidgetViewHolder;
import ru.ozon.app.android.cart.cartSplitV2.v1.presentation.item.accessories.AccessoriesViewModel;
import ru.ozon.app.android.cart.cartSplitV2.v1.presentation.item.accessories.AccessoriesViewRender;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementListAdapter;
import ru.ozon.app.android.cart.common.dynamicElement.decorations.HorizontalMargins16DPDecoration;
import ru.ozon.app.android.cart.common.presentation.addToCart.AddToCartViewModel;
import ru.ozon.app.android.cart.common.presentation.throttleNotificationHandler.CartThrottleNotificationHandler;
import ru.ozon.app.android.cart.common.presentation.utils.ExtensionsKt;
import ru.ozon.app.android.cart.common.product.binder.ProductBinder;
import ru.ozon.app.android.cart.feature.databinding.ItemCommonProductBinding;
import ru.ozon.app.android.cart.feature.databinding.WidgetCartSplitV2ItemBinding;
import ru.ozon.app.android.cart.ui.quantityInput.QuantityInput;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.composer.view.multiframebinder.BindStep;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.AnalyticData;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.FavoriteButton;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.ProductFavoriteMoleculeButtonView;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegate;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.product.tiles.skuGrid2.BackgroundDrawBySkuGrid2DecoratorDisabled;
import ru.ozon.app.android.utils.KeyboardUtilsKt;
import ru.ozon.app.android.utils.rx.RxExtKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.common.SimpleTextWatcher;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000©\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007*\u0001m\b\u0007\u0018\u0000 \u0089\u00012\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u00020\u00042\u00020\u0005:\u0002\u0089\u0001BK\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\n\u0010\r\u001a\u00060\u000bj\u0002`\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010\"\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u001aH\u0016¢\u0006\u0004\b$\u0010\u001eJ\u0017\u0010'\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J#\u0010,\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u00022\n\u0010&\u001a\u00060*j\u0002`+H\u0014¢\u0006\u0004\b,\u0010-J\u0018\u00100\u001a\u00020\u001a2\u0006\u0010/\u001a\u00020.H\u0096\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u001aH\u0096\u0001¢\u0006\u0004\b2\u0010\u001eJ*\u00108\u001a\u00020\u001a2\u0006\u0010/\u001a\u0002032\b\u00105\u001a\u0004\u0018\u0001042\u0006\u00107\u001a\u000206H\u0096\u0001¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u001aH\u0002¢\u0006\u0004\b:\u0010\u001eJ\u000f\u0010;\u001a\u00020\u001aH\u0002¢\u0006\u0004\b;\u0010\u001eJ\u000f\u0010<\u001a\u00020\u001aH\u0002¢\u0006\u0004\b<\u0010\u001eJ\u000f\u0010=\u001a\u00020\u001aH\u0002¢\u0006\u0004\b=\u0010\u001eJ\u0011\u0010?\u001a\u0004\u0018\u00010>H\u0002¢\u0006\u0004\b?\u0010@J\u001b\u0010C\u001a\u000e\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020B0AH\u0002¢\u0006\u0004\bC\u0010DJ\u001f\u0010H\u001a\u00020\u001a2\u0006\u0010F\u001a\u00020E2\u0006\u0010G\u001a\u00020BH\u0002¢\u0006\u0004\bH\u0010IJ\u0019\u0010L\u001a\u00020\u001a2\b\u0010K\u001a\u0004\u0018\u00010JH\u0002¢\u0006\u0004\bL\u0010MJ\u0019\u0010O\u001a\u00020\u001a2\b\u0010)\u001a\u0004\u0018\u00010NH\u0002¢\u0006\u0004\bO\u0010PJ\u0019\u0010S\u001a\u00020\u001a2\b\u0010R\u001a\u0004\u0018\u00010QH\u0002¢\u0006\u0004\bS\u0010TJ\u0017\u0010V\u001a\u00020\u001a2\u0006\u0010U\u001a\u00020BH\u0002¢\u0006\u0004\bV\u0010WJ\u000f\u0010X\u001a\u00020\u001aH\u0002¢\u0006\u0004\bX\u0010\u001eJ\u000f\u0010Y\u001a\u00020\u001aH\u0002¢\u0006\u0004\bY\u0010\u001eJ\u0017\u0010\\\u001a\u00020\u001a2\u0006\u0010[\u001a\u00020ZH\u0002¢\u0006\u0004\b\\\u0010]R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010^R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010_R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010`R\u0018\u0010\r\u001a\u00060\u000bj\u0002`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010aR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010bR \u0010e\u001a\u000e\u0012\u0004\u0012\u00020d\u0012\u0004\u0012\u00020\u001a0c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010h\u001a\u00020g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010k\u001a\u00020j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010n\u001a\u00020m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010q\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u001a\u0010u\u001a\b\u0012\u0004\u0012\u00020t0s8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u0014\u0010x\u001a\u00020w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR\u0014\u0010{\u001a\u00020z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R\u0014\u0010~\u001a\u00020}8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0018\u0010\u0081\u0001\u001a\u00030\u0080\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R0\u0010\u0088\u0001\u001a\u0011\u0012\u0005\u0012\u00030\u0083\u0001\u0012\u0004\u0012\u00020\u001a\u0018\u00010c8\u0016@\u0016X\u0096\u000f¢\u0006\u0010\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001¨\u0006\u008a\u0001"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/item/CartSplitV2ItemWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/item/CartSplitV2ItemVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/FavoriteProductDelegate;", "Lru/ozon/app/android/product/tiles/skuGrid2/BackgroundDrawBySkuGrid2DecoratorDisabled;", "Lru/ozon/app/android/cart/feature/databinding/WidgetCartSplitV2ItemBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "favProductMoleculeDelegate", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "frameBinder", "Lru/ozon/app/android/cart/common/presentation/addToCart/AddToCartViewModel;", "addToCartViewModel", "Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/item/accessories/AccessoriesViewModel;", "accessoriesViewModel", "Lru/ozon/app/android/cart/common/presentation/throttleNotificationHandler/CartThrottleNotificationHandler;", "cartThrottleNotificationHandler", "<init>", "(Lru/ozon/app/android/cart/feature/databinding/WidgetCartSplitV2ItemBinding;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/FavoriteProductDelegate;LVg/d;Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;Lru/ozon/app/android/cart/common/presentation/addToCart/AddToCartViewModel;Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/item/accessories/AccessoriesViewModel;Lru/ozon/app/android/cart/common/presentation/throttleNotificationHandler/CartThrottleNotificationHandler;)V", "Landroidx/lifecycle/J;", "lifecycle", "", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "onAttach", "()V", "onDetach", "", "offscreenOffsetPercent", "onOffscreenPositionChanged", "(F)V", "onRecycle", "Ljk0/q;", "info", "onVisibleAreaChanged", "(Ljk0/q;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "bind", "(Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/item/CartSplitV2ItemVO;Ll20/d;)V", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/ProductFavoriteMoleculeButtonView;", "button", "attachFavButtonView", "(Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/ProductFavoriteMoleculeButtonView;)V", "detachFavButtonView", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/FavoriteButton;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "molecule", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;", "analyticData", "bindFavoriteProductButton", "(Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/FavoriteButton;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;)V", "bindProduct", "bindDynamicElements", "bindControls", "bindAccessories", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "getRemoveAction", "()Lru/ozon/uni/atoms/af/AtomAction$Click;", "Lkotlin/Pair;", "", "findPreviousScrollAnchor", "()Lkotlin/Pair;", "Lru/ozon/uni/atoms/af/AtomAction$Refresh;", "action", "scrollWidgetKey", "refreshWithScroll", "(Lru/ozon/uni/atoms/af/AtomAction$Refresh;I)V", "Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/item/CartSplitV2ItemVO$Controls$RemoveControl;", ProductAction.ACTION_REMOVE, "bindRemoveSection", "(Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/item/CartSplitV2ItemVO$Controls$RemoveControl;)V", "Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/item/CartSplitV2ItemVO$Controls$QuantityControl;", "bindQuantityControl", "(Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/item/CartSplitV2ItemVO$Controls$QuantityControl;)V", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "buyOneClickBtn", "bindBuyOneClickControl", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "quantity", "refreshWithQuantity", "(I)V", "initQuantityInput", "hideKeyboard", "Lru/ozon/app/android/cart/CartViewModel$SplitQuantityChange;", "quantityChange", "trackQuantityChange", "(Lru/ozon/app/android/cart/CartViewModel$SplitQuantityChange;)V", "Lru/ozon/app/android/cart/feature/databinding/WidgetCartSplitV2ItemBinding;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/FavoriteProductDelegate;", "LVg/d;", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/cart/common/dynamicElement/DynamicElementListAdapter;", "dynamicElementAdapter", "Lru/ozon/app/android/cart/common/dynamicElement/DynamicElementListAdapter;", "Lru/ozon/uni/android/uikit/common/SimpleTextWatcher;", "quantityTextWatcher", "Lru/ozon/uni/android/uikit/common/SimpleTextWatcher;", "ru/ozon/app/android/cart/cartSplitV2/v1/presentation/item/CartSplitV2ItemWidgetViewHolder$hideKeyboardScrollListener$1", "hideKeyboardScrollListener", "Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/item/CartSplitV2ItemWidgetViewHolder$hideKeyboardScrollListener$1;", "Landroid/view/View$OnClickListener;", "removeClickListener", "Landroid/view/View$OnClickListener;", "", "Lru/ozon/app/android/composer/view/multiframebinder/BindStep;", "steps", "Ljava/util/List;", "Lru/ozon/app/android/cart/common/product/binder/ProductBinder;", "productBinder", "Lru/ozon/app/android/cart/common/product/binder/ProductBinder;", "Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/item/accessories/AccessoriesViewRender;", "accessories", "Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/item/accessories/AccessoriesViewRender;", "Lru/ozon/app/android/cart/cartSplitV2/LockedQuantityBinder;", "lockedQuantityBinder", "Lru/ozon/app/android/cart/cartSplitV2/LockedQuantityBinder;", "Lru/ozon/app/android/cart/cartSplitV2/BuyOneClickButtonBinder;", "buyOneClickButtonBinder", "Lru/ozon/app/android/cart/cartSplitV2/BuyOneClickButtonBinder;", "", "getOnFavoriteClick", "()Lkotlin/jvm/functions/Function1;", "setOnFavoriteClick", "(Lkotlin/jvm/functions/Function1;)V", "onFavoriteClick", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CartSplitV2ItemWidgetViewHolder extends k<CartSplitV2ItemVO> implements FavoriteProductDelegate, BackgroundDrawBySkuGrid2DecoratorDisabled {

    @NotNull
    private final AccessoriesViewRender accessories;

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetCartSplitV2ItemBinding binding;

    @NotNull
    private final BuyOneClickButtonBinder buyOneClickButtonBinder;

    @NotNull
    private final ComposerReferences composerReferences;

    @NotNull
    private final d customActionHandlersStoreFactory;

    @NotNull
    private final DynamicElementListAdapter dynamicElementAdapter;

    @NotNull
    private final FavoriteProductDelegate favProductMoleculeDelegate;

    @NotNull
    private final FrameBinder frameBinder;

    @NotNull
    private final CartSplitV2ItemWidgetViewHolder$hideKeyboardScrollListener$1 hideKeyboardScrollListener;

    @NotNull
    private final LockedQuantityBinder lockedQuantityBinder;

    @NotNull
    private final ProductBinder productBinder;

    @NotNull
    private final SimpleTextWatcher quantityTextWatcher;

    @NotNull
    private final View.OnClickListener removeClickListener;

    @NotNull
    private final List<BindStep> steps;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/item/CartSplitV2ItemWidgetViewHolder$Companion;", "", "<init>", "()V", "BUY_ONE_CLICK_MIN_WIDTH", "", "QUANTITY_PLACEHOLDER", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v4, types: [ru.ozon.app.android.cart.cartSplitV2.v1.presentation.item.CartSplitV2ItemWidgetViewHolder$hideKeyboardScrollListener$1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CartSplitV2ItemWidgetViewHolder(@NotNull WidgetCartSplitV2ItemBinding binding, @NotNull ComposerReferences composerReferences, @NotNull FavoriteProductDelegate favProductMoleculeDelegate, @NotNull d customActionHandlersStoreFactory, @NotNull FrameBinder frameBinder, @NotNull AddToCartViewModel addToCartViewModel, @NotNull AccessoriesViewModel accessoriesViewModel, @NotNull CartThrottleNotificationHandler cartThrottleNotificationHandler) {
        super(r5);
        View view;
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(favProductMoleculeDelegate, "favProductMoleculeDelegate");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(frameBinder, "frameBinder");
        Intrinsics.checkNotNullParameter(addToCartViewModel, "addToCartViewModel");
        Intrinsics.checkNotNullParameter(accessoriesViewModel, "accessoriesViewModel");
        Intrinsics.checkNotNullParameter(cartThrottleNotificationHandler, "cartThrottleNotificationHandler");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.composerReferences = composerReferences;
        this.favProductMoleculeDelegate = favProductMoleculeDelegate;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.frameBinder = frameBinder;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(composerReferences, this).customActionHandlers(new CartSplitV2ItemWidgetViewHolder$actionHandler$1(this)).buildHandler();
        this.actionHandler = buildHandler;
        DynamicElementListAdapter dynamicElementListAdapter = new DynamicElementListAdapter(buildHandler);
        this.dynamicElementAdapter = dynamicElementListAdapter;
        this.quantityTextWatcher = new SimpleTextWatcher(new CartSplitV2ItemWidgetViewHolder$quantityTextWatcher$1(this));
        this.hideKeyboardScrollListener = new RecyclerView.t() { // from class: ru.ozon.app.android.cart.cartSplitV2.v1.presentation.item.CartSplitV2ItemWidgetViewHolder$hideKeyboardScrollListener$1
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                InterfaceC6786a widgetViewModel;
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (dx == 0 && dy == 0) {
                    return;
                }
                CartSplitV2ItemWidgetViewHolder.this.hideKeyboard();
                widgetViewModel = CartSplitV2ItemWidgetViewHolder.this.getWidgetViewModel();
                CartSplitV2ViewModel cartSplitV2ViewModel = (CartSplitV2ViewModel) widgetViewModel;
                if (cartSplitV2ViewModel != null) {
                    cartSplitV2ViewModel.updateQuantityIfNeed();
                }
            }
        };
        this.removeClickListener = new ViewOnClickListenerC2788a(this, 7);
        int i11 = 1;
        this.steps = C7714v.b0(new BindStep() { // from class: dn.a
            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                Unit steps$lambda$1;
                steps$lambda$1 = CartSplitV2ItemWidgetViewHolder.steps$lambda$1(CartSplitV2ItemWidgetViewHolder.this);
                return steps$lambda$1;
            }
        }, new C3125a(i11, this), new b(this, i11), new c(this, i11));
        ItemCommonProductBinding productInclude = binding.productInclude;
        Intrinsics.checkNotNullExpressionValue(productInclude, "productInclude");
        this.productBinder = new ProductBinder(productInclude, buildHandler, composerReferences);
        this.accessories = new AccessoriesViewRender(composerReferences, binding, this, buildHandler, addToCartViewModel, accessoriesViewModel, this);
        ConstraintLayout constraintLayout2 = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "getRoot(...)");
        this.lockedQuantityBinder = new LockedQuantityBinder(constraintLayout2, composerReferences, buildHandler, cartThrottleNotificationHandler, false, 16, null);
        ConstraintLayout constraintLayout3 = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout3, "getRoot(...)");
        this.buyOneClickButtonBinder = new BuyOneClickButtonBinder(constraintLayout3, buildHandler, false, 4, null);
        binding.dynamicElementsRv.setAdapter(dynamicElementListAdapter);
        binding.dynamicElementsRv.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        RecyclerView recyclerView = null;
        binding.dynamicElementsRv.setItemAnimator(null);
        binding.dynamicElementsRv.addItemDecoration(new HorizontalMargins16DPDecoration());
        binding.checkboxContainerFL.setOnClickListener(new a(this, 9));
        int i12 = 7;
        binding.decreaseQuantityBtn.setOnClickListener(new e(this, i12));
        binding.increaseQuantityBtn.setOnClickListener(new EX.c(this, i12));
        initQuantityInput();
        View itemView = this.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        frameBinder.init(itemView);
        ComponentCallbacksC5392m c11 = composerReferences.getContainer().c();
        if (c11 != null && (view = c11.getView()) != null) {
            recyclerView = ComposerViewExtensionKt.composerRecyclerView(view);
        }
        frameBinder.applyRecycler(recyclerView);
    }

    private final void bindAccessories() {
        CartSplitV2ItemVO boundedData = getBoundedData();
        if (boundedData == null) {
            return;
        }
        this.accessories.bind(boundedData);
    }

    private final void bindBuyOneClickControl(ButtonV3DTO buyOneClickBtn) {
        View view;
        ComponentCallbacksC5392m c11 = this.composerReferences.getContainer().c();
        this.buyOneClickButtonBinder.bind(((c11 == null || (view = c11.getView()) == null) ? 0 : ResourceExtKt.toDp(view.getWidth())) < 336 ? buyOneClickBtn != null ? ButtonV3DTO.copy$default(buyOneClickBtn, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131055, null) : null : buyOneClickBtn);
    }

    private final void bindControls() {
        WidgetCartSplitV2ItemBinding widgetCartSplitV2ItemBinding = this.binding;
        CartSplitV2ItemVO boundedData = getBoundedData();
        if (boundedData == null) {
            return;
        }
        CartSplitV2ItemVO.Controls controls = boundedData.getControls();
        bindRemoveSection(controls != null ? controls.getRemove() : null);
        CartSplitV2ItemVO.Controls controls2 = boundedData.getControls();
        bindQuantityControl(controls2 != null ? controls2.getQuantity() : null);
        CartSplitV2ItemVO.Controls controls3 = boundedData.getControls();
        bindBuyOneClickControl(controls3 != null ? controls3.getBuyInOneClick() : null);
        if (boundedData.getControls() == null) {
            ProductFavoriteMoleculeButtonView favBtn = widgetCartSplitV2ItemBinding.favBtn;
            Intrinsics.checkNotNullExpressionValue(favBtn, "favBtn");
            ViewExtKt.gone(favBtn);
        } else {
            ProductFavoriteMoleculeButtonView favBtn2 = widgetCartSplitV2ItemBinding.favBtn;
            Intrinsics.checkNotNullExpressionValue(favBtn2, "favBtn");
            ViewExtKt.show(favBtn2);
            ProductFavoriteMoleculeButtonView favBtn3 = widgetCartSplitV2ItemBinding.favBtn;
            Intrinsics.checkNotNullExpressionValue(favBtn3, "favBtn");
            bindFavoriteProductButton(favBtn3, boundedData.getControls().getFavoriteProduct(), new AnalyticData(getTrackingData(), getViewItem()));
        }
    }

    private final void bindDynamicElements() {
        CartSplitV2ItemVO boundedData = getBoundedData();
        if (boundedData == null) {
            return;
        }
        this.dynamicElementAdapter.submitList(boundedData.getDynamicElements());
    }

    private final void bindProduct() {
        WidgetCartSplitV2ItemBinding widgetCartSplitV2ItemBinding = this.binding;
        CartSplitV2ItemVO boundedData = getBoundedData();
        if (boundedData == null) {
            return;
        }
        View view = widgetCartSplitV2ItemBinding.checkboxV;
        CartSplitV2ItemVO.Checkbox checkbox = boundedData.getCheckbox();
        view.setSelected(checkbox != null ? checkbox.getIsSelected() : false);
        FrameLayout checkboxContainerFL = widgetCartSplitV2ItemBinding.checkboxContainerFL;
        Intrinsics.checkNotNullExpressionValue(checkboxContainerFL, "checkboxContainerFL");
        checkboxContainerFL.setVisibility(boundedData.getCheckbox() != null ? 0 : 8);
        this.productBinder.bind(boundedData.getProduct());
    }

    private final void bindQuantityControl(CartSplitV2ItemVO.Controls.QuantityControl item) {
        NotificationDTO controlsLockNotification = item != null ? item.getControlsLockNotification() : null;
        if (controlsLockNotification != null) {
            this.lockedQuantityBinder.bind(controlsLockNotification);
        } else {
            this.lockedQuantityBinder.clear();
        }
        if (item == null) {
            Group quantityGroup = this.binding.quantityGroup;
            Intrinsics.checkNotNullExpressionValue(quantityGroup, "quantityGroup");
            ViewExtKt.gone(quantityGroup);
            return;
        }
        Group quantityGroup2 = this.binding.quantityGroup;
        Intrinsics.checkNotNullExpressionValue(quantityGroup2, "quantityGroup");
        ViewExtKt.show(quantityGroup2);
        CartSplitV2ViewModel cartSplitV2ViewModel = (CartSplitV2ViewModel) getWidgetViewModel();
        if (cartSplitV2ViewModel != null) {
            cartSplitV2ViewModel.setQuantityData(item.getMultiplicity(), item.getMinimum(), item.getMaximum(), item.getQuantSize());
            cartSplitV2ViewModel.setCurrentQuantity(item.getCurrent());
        }
    }

    private final void bindRemoveSection(CartSplitV2ItemVO.Controls.RemoveControl remove) {
        WidgetCartSplitV2ItemBinding widgetCartSplitV2ItemBinding = this.binding;
        AppCompatImageView appCompatImageView = widgetCartSplitV2ItemBinding.removeButton;
        Intrinsics.f(appCompatImageView);
        ImageViewExtKt.loadImageOrGone(appCompatImageView, remove != null ? remove.getIcon() : null);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = appCompatImageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ThemeExtKt.tint(appCompatImageView, styleParser.parseColor(context, remove != null ? remove.getTintColor() : null));
        appCompatImageView.setOnClickListener(this.removeClickListener);
        AppCompatImageView removeButton = widgetCartSplitV2ItemBinding.removeButton;
        Intrinsics.checkNotNullExpressionValue(removeButton, "removeButton");
        removeButton.setVisibility(remove != null ? 0 : 8);
    }

    private final Pair<Integer, Integer> findPreviousScrollAnchor() {
        Integer num;
        int adapterPosition = getAdapterPosition();
        loop0: while (true) {
            num = null;
            while (adapterPosition > 0 && num == null) {
                adapterPosition--;
                C8042d bindingAdapter = getBindingAdapter();
                l20.c b11 = bindingAdapter != null ? bindingAdapter.b(adapterPosition) : null;
                if (b11 != null) {
                    num = b11.getScrollWidgetKey();
                }
            }
        }
        return new Pair<>(Integer.valueOf(adapterPosition), Integer.valueOf(num != null ? num.intValue() : -1));
    }

    private final AtomAction.Click getRemoveAction() {
        CartSplitV2ItemVO.Controls controls;
        CartSplitV2ItemVO.Controls.RemoveControl remove;
        AtomAction action;
        View view;
        View rootView;
        RecyclerView composerRecyclerViewOrNull;
        RecyclerView.C findViewHolderForAdapterPosition;
        View view2;
        CartSplitV2ItemVO boundedData = getBoundedData();
        LinkedHashMap linkedHashMap = null;
        if (boundedData == null || (controls = boundedData.getControls()) == null || (remove = controls.getRemove()) == null || (action = remove.getAction()) == null || !(action instanceof AtomAction.Click)) {
            return null;
        }
        if (getAdapterPosition() == -1 || getAdapterPosition() == 0) {
            return (AtomAction.Click) action;
        }
        Pair<Integer, Integer> findPreviousScrollAnchor = findPreviousScrollAnchor();
        int intValue = findPreviousScrollAnchor.a().intValue();
        int intValue2 = findPreviousScrollAnchor.b().intValue();
        ComponentCallbacksC5392m c11 = this.composerReferences.getContainer().c();
        int y11 = (c11 == null || (view = c11.getView()) == null || (rootView = view.getRootView()) == null || (composerRecyclerViewOrNull = ComposerViewExtensionKt.composerRecyclerViewOrNull(rootView)) == null || (findViewHolderForAdapterPosition = composerRecyclerViewOrNull.findViewHolderForAdapterPosition(intValue)) == null || (view2 = findViewHolderForAdapterPosition.itemView) == null) ? 0 : (int) view2.getY();
        AtomAction.Click click = (AtomAction.Click) action;
        Map<String, String> params = click.getParams();
        if (params != null) {
            linkedHashMap = U.u(params);
            linkedHashMap.put("widgetScrollId", String.valueOf(intValue2));
            linkedHashMap.put("widgetOffsetScroll", String.valueOf(y11));
        }
        return AtomAction.Click.copy$default(click, null, null, null, linkedHashMap, null, null, 55, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideKeyboard() {
        this.binding.quantityEt.clearFocus();
        ComponentCallbacksC5392m c11 = this.composerReferences.getContainer().c();
        if (c11 != null) {
            KeyboardUtilsKt.hideKeyboard(c11);
        }
    }

    private final void initQuantityInput() {
        final QuantityInput quantityInput = this.binding.quantityEt;
        quantityInput.addTextChangedListener(this.quantityTextWatcher);
        quantityInput.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: dn.b
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                CartSplitV2ItemWidgetViewHolder.initQuantityInput$lambda$23$lambda$21(CartSplitV2ItemWidgetViewHolder.this, view, z11);
            }
        });
        quantityInput.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: dn.c
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                boolean initQuantityInput$lambda$23$lambda$22;
                initQuantityInput$lambda$23$lambda$22 = CartSplitV2ItemWidgetViewHolder.initQuantityInput$lambda$23$lambda$22(QuantityInput.this, textView, i11, keyEvent);
                return initQuantityInput$lambda$23$lambda$22;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initQuantityInput$lambda$23$lambda$21(CartSplitV2ItemWidgetViewHolder cartSplitV2ItemWidgetViewHolder, View view, boolean z11) {
        View view2;
        ComponentCallbacksC5392m c11 = cartSplitV2ItemWidgetViewHolder.composerReferences.getContainer().c();
        RecyclerView composerRecyclerView = (c11 == null || (view2 = c11.getView()) == null) ? null : ComposerViewExtensionKt.composerRecyclerView(view2);
        if (z11) {
            if (composerRecyclerView != null) {
                composerRecyclerView.addOnScrollListener(cartSplitV2ItemWidgetViewHolder.hideKeyboardScrollListener);
            }
        } else {
            if (composerRecyclerView != null) {
                composerRecyclerView.removeOnScrollListener(cartSplitV2ItemWidgetViewHolder.hideKeyboardScrollListener);
            }
            CartSplitV2ViewModel cartSplitV2ViewModel = (CartSplitV2ViewModel) cartSplitV2ItemWidgetViewHolder.getWidgetViewModel();
            if (cartSplitV2ViewModel != null) {
                cartSplitV2ViewModel.updateQuantityIfNeed();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initQuantityInput$lambda$23$lambda$22(QuantityInput quantityInput, TextView textView, int i11, KeyEvent keyEvent) {
        if (i11 != 6) {
            return false;
        }
        quantityInput.clearFocus();
        KeyboardUtilsKt.hideKeyboard(quantityInput);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$11$lambda$10(CartSplitV2ItemWidgetViewHolder cartSplitV2ItemWidgetViewHolder, View view) {
        cartSplitV2ItemWidgetViewHolder.hideKeyboard();
        CartSplitV2ViewModel cartSplitV2ViewModel = (CartSplitV2ViewModel) cartSplitV2ItemWidgetViewHolder.getWidgetViewModel();
        if (cartSplitV2ViewModel != null) {
            cartSplitV2ViewModel.increaseQuantity();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$11$lambda$8(CartSplitV2ItemWidgetViewHolder cartSplitV2ItemWidgetViewHolder, View view) {
        CartSplitV2ItemVO.Checkbox checkbox;
        AtomAction action;
        t mapToTokenizedEvent$default;
        CartSplitV2ItemVO boundedData = cartSplitV2ItemWidgetViewHolder.getBoundedData();
        if (boundedData == null || (checkbox = boundedData.getCheckbox()) == null || (action = checkbox.getAction()) == null) {
            return;
        }
        if (!(action instanceof AtomAction.Refresh)) {
            cartSplitV2ItemWidgetViewHolder.actionHandler.invoke(action);
            return;
        }
        AtomAction.Refresh refresh = (AtomAction.Refresh) action;
        cartSplitV2ItemWidgetViewHolder.refreshWithScroll(refresh, boundedData.getScrollWidgetKey().intValue());
        Map<String, TokenizedTrackingInfo> trackingInfo = refresh.getTrackingInfo();
        if (trackingInfo == null || (mapToTokenizedEvent$default = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(boundedData.getId()), null, 2, null)) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processClickEvents$default(cartSplitV2ItemWidgetViewHolder.composerReferences.getTokenizedAnalytics(), mapToTokenizedEvent$default, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$11$lambda$9(CartSplitV2ItemWidgetViewHolder cartSplitV2ItemWidgetViewHolder, View view) {
        cartSplitV2ItemWidgetViewHolder.hideKeyboard();
        CartSplitV2ViewModel cartSplitV2ViewModel = (CartSplitV2ViewModel) cartSplitV2ItemWidgetViewHolder.getWidgetViewModel();
        if (cartSplitV2ViewModel != null) {
            cartSplitV2ViewModel.decreaseQuantity();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshWithQuantity(int quantity) {
        CartSplitV2ItemVO.Controls controls;
        CartSplitV2ItemVO.Controls.QuantityControl quantity2;
        AtomAction action;
        LinkedHashMap linkedHashMap;
        CartSplitV2ItemVO boundedData = getBoundedData();
        if (boundedData == null || (controls = boundedData.getControls()) == null || (quantity2 = controls.getQuantity()) == null || (action = quantity2.getAction()) == null) {
            return;
        }
        if (action instanceof AtomAction.Click) {
            AtomAction.Click click = (AtomAction.Click) action;
            Map<String, String> params = click.getParams();
            if (params != null) {
                linkedHashMap = new LinkedHashMap(U.h(params.size()));
                Iterator<T> it = params.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    linkedHashMap.put(entry.getKey(), h.X((String) entry.getValue(), "{qty}", String.valueOf(quantity), false));
                }
            } else {
                linkedHashMap = null;
            }
            action = AtomAction.Click.copy$default(click, null, null, null, linkedHashMap, null, null, 55, null);
        }
        this.actionHandler.invoke(action);
    }

    private final void refreshWithScroll(AtomAction.Refresh action, int scrollWidgetKey) {
        InterfaceC7851b.a.a(this.composerReferences.getController(), action.getLink(), null, null, new h.b(new a.C.d(scrollWidgetKey, (int) this.binding.getConstraintLayout().getY(), 28, false), null, 2), 6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeClickListener$lambda$0(CartSplitV2ItemWidgetViewHolder cartSplitV2ItemWidgetViewHolder, View view) {
        AtomAction.Click removeAction = cartSplitV2ItemWidgetViewHolder.getRemoveAction();
        if (removeAction != null) {
            cartSplitV2ItemWidgetViewHolder.actionHandler.invoke(removeAction);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit steps$lambda$1(CartSplitV2ItemWidgetViewHolder cartSplitV2ItemWidgetViewHolder) {
        cartSplitV2ItemWidgetViewHolder.bindProduct();
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit steps$lambda$2(CartSplitV2ItemWidgetViewHolder cartSplitV2ItemWidgetViewHolder) {
        cartSplitV2ItemWidgetViewHolder.bindDynamicElements();
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit steps$lambda$3(CartSplitV2ItemWidgetViewHolder cartSplitV2ItemWidgetViewHolder) {
        cartSplitV2ItemWidgetViewHolder.bindControls();
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit steps$lambda$4(CartSplitV2ItemWidgetViewHolder cartSplitV2ItemWidgetViewHolder) {
        cartSplitV2ItemWidgetViewHolder.bindAccessories();
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackQuantityChange(CartViewModel.SplitQuantityChange quantityChange) {
        CartSplitV2ItemVO boundedData;
        CartSplitV2ItemVO.Controls controls;
        CartSplitV2ItemVO.Controls.QuantityControl quantity;
        CartSplitV2ItemVO boundedData2 = getBoundedData();
        if (boundedData2 == null || quantityChange.getSplitId() != boundedData2.getId() || (boundedData = getBoundedData()) == null || (controls = boundedData.getControls()) == null || (quantity = controls.getQuantity()) == null) {
            return;
        }
        int current = quantity.getCurrent();
        int newQuantity = quantityChange.getNewQuantity();
        if (newQuantity > current) {
            int i11 = newQuantity - current;
            t incrementTrackingInfo = quantity.getIncrementTrackingInfo();
            if (incrementTrackingInfo != null) {
                ExtensionsKt.processChangeCart$default(this.composerReferences.getTokenizedAnalytics(), incrementTrackingInfo, i11, null, Integer.valueOf(newQuantity), 4, null);
                return;
            }
            return;
        }
        if (current > newQuantity) {
            int i12 = current - newQuantity;
            t decrementTrackingInfo = quantity.getDecrementTrackingInfo();
            if (decrementTrackingInfo != null) {
                ExtensionsKt.processChangeCart$default(this.composerReferences.getTokenizedAnalytics(), decrementTrackingInfo, i12, null, Integer.valueOf(newQuantity), 4, null);
            }
        }
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegate
    public void attachFavButtonView(@NotNull ProductFavoriteMoleculeButtonView button) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.favProductMoleculeDelegate.attachFavButtonView(button);
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegate
    public void bindFavoriteProductButton(@NotNull FavoriteButton button, FavoriteProductMolecule molecule, @NotNull AnalyticData analyticData) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(analyticData, "analyticData");
        this.favProductMoleculeDelegate.bindFavoriteProductButton(button, molecule, analyticData);
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegate
    public void detachFavButtonView() {
        this.favProductMoleculeDelegate.detachFavButtonView();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        FrameBinder.DefaultImpls.onAttach$default(this.frameBinder, null, 1, null);
        this.accessories.onAttach();
        this.productBinder.onAttach();
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        CartSplitV2ItemVO.Controls controls;
        CartSplitV2ItemVO.Controls.QuantityControl quantity;
        Long debounceDelay;
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        CartSplitV2ViewModel cartSplitV2ViewModel = (CartSplitV2ViewModel) getWidgetViewModel();
        if (cartSplitV2ViewModel != null) {
            p<Integer> refreshEvents = cartSplitV2ViewModel.getRefreshEvents();
            CartSplitV2ItemVO boundedData = getBoundedData();
            p<Integer> observeOn = refreshEvents.debounce((boundedData == null || (controls = boundedData.getControls()) == null || (quantity = controls.getQuantity()) == null || (debounceDelay = quantity.getDebounceDelay()) == null) ? 0L : debounceDelay.longValue(), TimeUnit.MILLISECONDS).observeOn(C8125a.a());
            Intrinsics.checkNotNullExpressionValue(observeOn, "observeOn(...)");
            RxExtKt.subscribe$default(observeOn, lifecycle, new CartSplitV2ItemWidgetViewHolder$onAttachViewModel$1$1(this), CartSplitV2ItemWidgetViewHolder$onAttachViewModel$1$2.INSTANCE, null, 8, null);
            cartSplitV2ViewModel.getDecreaseEnabled().observe(lifecycle, new CartSplitV2ItemWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new CartSplitV2ItemWidgetViewHolder$onAttachViewModel$1$3(this)));
            cartSplitV2ViewModel.getIncreaseEnabled().observe(lifecycle, new CartSplitV2ItemWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new CartSplitV2ItemWidgetViewHolder$onAttachViewModel$1$4(this)));
            cartSplitV2ViewModel.getQuantityInputEnabled().observe(lifecycle, new CartSplitV2ItemWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new CartSplitV2ItemWidgetViewHolder$onAttachViewModel$1$5(this)));
            cartSplitV2ViewModel.getCurrentQuantity().observe(lifecycle, new CartSplitV2ItemWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new CartSplitV2ItemWidgetViewHolder$onAttachViewModel$1$6(this)));
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        this.lockedQuantityBinder.clear();
        this.frameBinder.onDetach();
        this.accessories.onDetach();
        this.productBinder.onDetach();
    }

    @Override // jk0.j, lk0.b
    public void onOffscreenPositionChanged(float offscreenOffsetPercent) {
        super.onOffscreenPositionChanged(offscreenOffsetPercent);
        this.frameBinder.onOffscreenPositionChanged(offscreenOffsetPercent);
    }

    @Override // jk0.j
    public void onRecycle() {
        super.onRecycle();
        this.frameBinder.onRecycle();
    }

    @Override // jk0.j, jk0.n
    public void onVisibleAreaChanged(@NotNull q info) {
        Intrinsics.checkNotNullParameter(info, "info");
        super.onVisibleAreaChanged(info);
        this.accessories.onVisibleAreaChanged(info);
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegate
    public void setOnFavoriteClick(Function1<? super Boolean, Unit> function1) {
        this.favProductMoleculeDelegate.setOnFavoriteClick(function1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull CartSplitV2ItemVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.productBinder.bindImage(item.getProduct());
        this.frameBinder.bind(this.steps, item.getViewItemKey());
    }
}
