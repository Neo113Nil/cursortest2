package ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.controls;

import Ae.C2399j;
import Ae.C2408n0;
import Vg.d;
import WR.b;
import WR.c;
import WR.e;
import WR.f;
import WZ.m;
import WZ.t;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.Y;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import h20.InterfaceC6786a;
import io.reactivex.p;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import mc.C8125a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.cart.CartViewModel;
import ru.ozon.app.android.cart.cartButtonWithTooltip.presentation.HideCartTooltip;
import ru.ozon.app.android.cart.cartSplitV2.BuyForStarsButtonBinder;
import ru.ozon.app.android.cart.cartSplitV2.BuyOneClickButtonBinder;
import ru.ozon.app.android.cart.cartSplitV2.LockedQuantityBinder;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.BaseMultiFrameBindingViewHolder;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.CartSplitV2ViewModelV2;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.ControlsVO;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.controls.binder.CountPickerBinder;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.controls.binder.CountPickerListener;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.controls.view.CartCountPickerView;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.controls.view.CartSplitControlsView;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.extensions.CartExtensionsKt;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.SwipeViewModel;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.coordinator.GroupSwipeCoordinator;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.holder.SwipeableViewHolder;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.view.BaseSwipeableWrapperView;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.view.SwipeFavoriteButtonView;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.viewObjects.SwipeButtonVO;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.viewObjects.SwipeInfoVO;
import ru.ozon.app.android.cart.common.presentation.asyncCart.AsyncCartViewModel;
import ru.ozon.app.android.cart.common.presentation.throttleNotificationHandler.CartThrottleNotificationHandler;
import ru.ozon.app.android.cart.common.presentation.utils.ExtensionsKt;
import ru.ozon.app.android.cart.feature.R$id;
import ru.ozon.app.android.cart.ui.rightIconButtonView.RightIconButtonDTO;
import ru.ozon.app.android.cart.ui.rightIconButtonView.RightIconButtonView;
import ru.ozon.app.android.cart.ui.tooltip.CartTooltipShowService;
import ru.ozon.app.android.cart.ui.tooltip.molecule.TooltipWithOnboardingActionVO;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.multiframebinder.BindStep;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.AnalyticData;
import ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.delegate.FavoriteProductV4Delegate;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.FavoriteButton;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.ProductFavoriteMoleculeButtonView;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegate;
import ru.ozon.app.android.product.tiles.skuGrid2.BackgroundDrawBySkuGrid2DecoratorDisabled;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.app.android.utils.rx.RxExtKt;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import xe.B0;

@Metadata(d1 = {"\u0000¾\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u0000 ¬\u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005:\u0002¬\u0001Bs\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0011\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u0012H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020(2\u0006\u0010+\u001a\u00020\u0012H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020%H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020(H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u00020(2\u0006\u00103\u001a\u000202H\u0014¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020(H\u0016¢\u0006\u0004\b6\u00101J\u000f\u00107\u001a\u00020(H\u0016¢\u0006\u0004\b7\u00101J)\u0010=\u001a\u00020(2\u0006\u00108\u001a\u00020\u00022\u0006\u0010:\u001a\u0002092\b\u0010<\u001a\u0004\u0018\u00010;H\u0016¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020(H\u0016¢\u0006\u0004\b?\u00101J\u0018\u0010B\u001a\u00020(2\u0006\u0010A\u001a\u00020@H\u0096\u0001¢\u0006\u0004\bB\u0010CJ\u0010\u0010D\u001a\u00020(H\u0096\u0001¢\u0006\u0004\bD\u00101J*\u0010J\u001a\u00020(2\u0006\u0010A\u001a\u00020E2\b\u0010G\u001a\u0004\u0018\u00010F2\u0006\u0010I\u001a\u00020HH\u0096\u0001¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020(H\u0002¢\u0006\u0004\bL\u00101J\u0013\u0010N\u001a\u00020(*\u00020MH\u0002¢\u0006\u0004\bN\u0010OJ\u0017\u0010Q\u001a\u0004\u0018\u00010P*\u0004\u0018\u00010PH\u0002¢\u0006\u0004\bQ\u0010RJ\u0017\u0010Q\u001a\u0004\u0018\u00010S*\u0004\u0018\u00010SH\u0002¢\u0006\u0004\bQ\u0010TJ#\u0010W\u001a\u0004\u0018\u00010U*\u0004\u0018\u00010U2\n\b\u0002\u0010V\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\bW\u0010XJ#\u0010W\u001a\u0004\u0018\u00010Y*\u0004\u0018\u00010Y2\n\b\u0002\u0010V\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\bW\u0010ZJ\u0017\u0010\\\u001a\u00020(2\u0006\u0010[\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\\\u0010-J\u000f\u0010]\u001a\u00020(H\u0002¢\u0006\u0004\b]\u00101J\u000f\u0010^\u001a\u00020(H\u0002¢\u0006\u0004\b^\u00101J\u000f\u0010_\u001a\u00020(H\u0002¢\u0006\u0004\b_\u00101J\u000f\u0010`\u001a\u00020(H\u0002¢\u0006\u0004\b`\u00101J\u000f\u0010a\u001a\u00020(H\u0002¢\u0006\u0004\ba\u00101J\u0011\u0010c\u001a\u0004\u0018\u00010bH\u0002¢\u0006\u0004\bc\u0010dJ\u0011\u0010e\u001a\u0004\u0018\u00010bH\u0002¢\u0006\u0004\be\u0010dJ\u0011\u0010f\u001a\u0004\u0018\u00010bH\u0002¢\u0006\u0004\bf\u0010dJ\u0019\u0010h\u001a\u00020(2\b\u00108\u001a\u0004\u0018\u00010gH\u0002¢\u0006\u0004\bh\u0010iJ\u0019\u0010k\u001a\u00020(2\b\u0010j\u001a\u0004\u0018\u00010PH\u0002¢\u0006\u0004\bk\u0010lJ\u000f\u0010m\u001a\u00020(H\u0002¢\u0006\u0004\bm\u00101J\u0017\u0010p\u001a\u00020(2\u0006\u0010o\u001a\u00020nH\u0002¢\u0006\u0004\bp\u0010qJ\u0017\u0010t\u001a\u00020(2\u0006\u0010s\u001a\u00020rH\u0002¢\u0006\u0004\bt\u0010uJ\u000f\u0010v\u001a\u00020(H\u0002¢\u0006\u0004\bv\u00101J\u000f\u0010w\u001a\u00020(H\u0002¢\u0006\u0004\bw\u00101J\u0019\u0010x\u001a\u00020(2\b\b\u0002\u0010'\u001a\u00020\u0012H\u0002¢\u0006\u0004\bx\u0010-J\u0017\u0010y\u001a\u00020(2\u0006\u00108\u001a\u00020MH\u0002¢\u0006\u0004\by\u0010OR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010zR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010{R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010|R\u0014\u0010\f\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010}R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010~R\u0018\u0010\u0011\u001a\u00060\u000fj\u0002`\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u007fR\u0015\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0013\u0010\u0080\u0001R\u0015\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0015\u0010\u0081\u0001R\u0015\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0017\u0010\u0082\u0001R\u0015\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0019\u0010\u0083\u0001R\u0015\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001f\u0010\u0084\u0001R%\u0010\u0087\u0001\u001a\u0010\u0012\u0005\u0012\u00030\u0086\u0001\u0012\u0004\u0012\u00020(0\u0085\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0018\u0010\u008a\u0001\u001a\u00030\u0089\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0018\u0010\u008d\u0001\u001a\u00030\u008c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0018\u0010\u0090\u0001\u001a\u00030\u008f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R%\u0010\u0092\u0001\u001a\u0010\u0012\u0005\u0012\u00030\u0086\u0001\u0012\u0004\u0012\u00020(0\u0085\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0088\u0001R%\u0010\u0093\u0001\u001a\u0010\u0012\u0005\u0012\u00030\u0086\u0001\u0012\u0004\u0012\u00020(0\u0085\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0088\u0001R\u0018\u0010\u0095\u0001\u001a\u00030\u0094\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0018\u0010\u0098\u0001\u001a\u00030\u0097\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R'\u0010\u009c\u0001\u001a\n\u0012\u0005\u0012\u00030\u009b\u00010\u009a\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u009c\u0001\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R\u001c\u0010¡\u0001\u001a\u0005\u0018\u00010 \u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u0019\u0010£\u0001\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b£\u0001\u0010\u0080\u0001R\u0019\u0010¦\u0001\u001a\u0004\u0018\u00010%8VX\u0096\u0004¢\u0006\b\u001a\u0006\b¤\u0001\u0010¥\u0001R0\u0010«\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020(\u0018\u00010\u0085\u00018\u0016@\u0016X\u0096\u000f¢\u0006\u0010\u001a\u0006\b§\u0001\u0010¨\u0001\"\u0006\b©\u0001\u0010ª\u0001¨\u0006\u00ad\u0001"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/controls/CartSplitV2ControlsWidgetViewHolder;", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/BaseMultiFrameBindingViewHolder;", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/controls/CartSplitV2ControlsVO;", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/FavoriteProductDelegate;", "Lru/ozon/app/android/product/tiles/skuGrid2/BackgroundDrawBySkuGrid2DecoratorDisabled;", "Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/holder/SwipeableViewHolder;", "Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/view/BaseSwipeableWrapperView;", "containerView", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/controls/view/CartSplitControlsView;", "view", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "favProductMoleculeDelegate", "Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/delegate/FavoriteProductV4Delegate;", "favoriteProductV4Delegate", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "", "controlsMoveEnabled", "Lru/ozon/app/android/utils/AppType;", "appType", "Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/coordinator/GroupSwipeCoordinator;", "swipeGroupCoordinator", "Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/SwipeViewModel;", "swipeViewModel", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "frameBinder", "Lru/ozon/app/android/cart/common/presentation/throttleNotificationHandler/CartThrottleNotificationHandler;", "cartThrottleNotificationHandler", "Lru/ozon/app/android/cart/common/presentation/asyncCart/AsyncCartViewModel;", "asyncCartViewModel", "<init>", "(Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/view/BaseSwipeableWrapperView;Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/controls/view/CartSplitControlsView;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/FavoriteProductDelegate;Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/delegate/FavoriteProductV4Delegate;LVg/d;ZLru/ozon/app/android/utils/AppType;Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/coordinator/GroupSwipeCoordinator;Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/SwipeViewModel;Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;Lru/ozon/app/android/cart/common/presentation/throttleNotificationHandler/CartThrottleNotificationHandler;Lru/ozon/app/android/cart/common/presentation/asyncCart/AsyncCartViewModel;)V", "", "getSwipeGroupId", "()Ljava/lang/String;", "", "offset", "animate", "", "updateSwipeOffset", "(FZ)V", "isOpen", "onSwipeStateChanged", "(Z)V", "getMaxSwipeDistance", "()F", "ensureSwipeMenuInitialized", "()V", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "onAttach", "onDetach", "item", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/controls/CartSplitV2ControlsVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "onRecycle", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/ProductFavoriteMoleculeButtonView;", "button", "attachFavButtonView", "(Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/ProductFavoriteMoleculeButtonView;)V", "detachFavButtonView", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/FavoriteButton;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "molecule", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;", "analyticData", "bindFavoriteProductButton", "(Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/FavoriteButton;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;)V", "lockButtonsForProduct", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/ControlsVO;", "updateLockStatesForProduct", "(Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/ControlsVO;)V", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "lockForProductWhileAsync", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Lru/ozon/app/android/cart/ui/rightIconButtonView/RightIconButtonDTO;", "(Lru/ozon/app/android/cart/ui/rightIconButtonView/RightIconButtonDTO;)Lru/ozon/app/android/cart/ui/rightIconButtonView/RightIconButtonDTO;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "lock", "lockWhileAsync", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Ljava/lang/Boolean;)Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/viewObjects/SwipeInfoVO;", "(Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/viewObjects/SwipeInfoVO;Ljava/lang/Boolean;)Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/viewObjects/SwipeInfoVO;", "inProgress", "updateAsyncLocking", "bindControlsStep1", "bindControlsStep2", "bindControlsStep3", "bindControlsStep4", "bindSwipeContainer", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "getRemoveAction", "()Lru/ozon/uni/atoms/af/AtomAction$Click;", "getSwipeRemoveAction", "getDecrementRemoveAction", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/ControlsVO$QuantityControl;", "bindQuantityControl", "(Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/ControlsVO$QuantityControl;)V", "buyOneClickBtn", "bindBuyOneClickControl", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "swapQuantityAndBuyOneClickIfNeed", "", "quantity", "refreshWithQuantity", "(I)V", "Lru/ozon/app/android/cart/CartViewModel$SplitQuantityChange;", "quantityChange", "trackQuantityChange", "(Lru/ozon/app/android/cart/CartViewModel$SplitQuantityChange;)V", "onDecreaseQuantity", "observeSwipeFavButton", "closeAllSwipeGroup", "showMoveButtonOnboardingIfNeed", "Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/view/BaseSwipeableWrapperView;", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/controls/view/CartSplitControlsView;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/FavoriteProductDelegate;", "Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/delegate/FavoriteProductV4Delegate;", "LVg/d;", "Z", "Lru/ozon/app/android/utils/AppType;", "Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/coordinator/GroupSwipeCoordinator;", "Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/SwipeViewModel;", "Lru/ozon/app/android/cart/common/presentation/asyncCart/AsyncCartViewModel;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/cart/cartSplitV2/LockedQuantityBinder;", "lockedQuantityBinder", "Lru/ozon/app/android/cart/cartSplitV2/LockedQuantityBinder;", "Lru/ozon/app/android/cart/cartSplitV2/BuyOneClickButtonBinder;", "buyOneClickButtonBinder", "Lru/ozon/app/android/cart/cartSplitV2/BuyOneClickButtonBinder;", "Lru/ozon/app/android/cart/cartSplitV2/BuyForStarsButtonBinder;", "buyForStarsBinder", "Lru/ozon/app/android/cart/cartSplitV2/BuyForStarsButtonBinder;", "moveButtonActionHandler", "removeButtonActionHandler", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/controls/binder/CountPickerBinder;", "quantityBinder", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/controls/binder/CountPickerBinder;", "Lru/ozon/app/android/cart/ui/tooltip/CartTooltipShowService;", "tooltipService", "Lru/ozon/app/android/cart/ui/tooltip/CartTooltipShowService;", "", "Lru/ozon/app/android/composer/view/multiframebinder/BindStep;", "steps", "Ljava/util/List;", "getSteps", "()Ljava/util/List;", "Lxe/B0;", "swipeFavJob", "Lxe/B0;", "isFavButtonBind", "getCurrentOffset", "()Ljava/lang/Float;", "currentOffset", "getOnFavoriteClick", "()Lkotlin/jvm/functions/Function1;", "setOnFavoriteClick", "(Lkotlin/jvm/functions/Function1;)V", "onFavoriteClick", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CartSplitV2ControlsWidgetViewHolder extends BaseMultiFrameBindingViewHolder<CartSplitV2ControlsVO> implements FavoriteProductDelegate, BackgroundDrawBySkuGrid2DecoratorDisabled, SwipeableViewHolder {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AppType appType;

    @NotNull
    private final AsyncCartViewModel asyncCartViewModel;

    @NotNull
    private final BuyForStarsButtonBinder buyForStarsBinder;

    @NotNull
    private final BuyOneClickButtonBinder buyOneClickButtonBinder;

    @NotNull
    private final ComposerReferences composerReferences;

    @NotNull
    private final BaseSwipeableWrapperView containerView;
    private final boolean controlsMoveEnabled;

    @NotNull
    private final d customActionHandlersStoreFactory;

    @NotNull
    private final FavoriteProductDelegate favProductMoleculeDelegate;

    @NotNull
    private final FavoriteProductV4Delegate favoriteProductV4Delegate;
    private boolean isFavButtonBind;

    @NotNull
    private final LockedQuantityBinder lockedQuantityBinder;

    @NotNull
    private final Function1<AtomAction, Unit> moveButtonActionHandler;

    @NotNull
    private final CountPickerBinder quantityBinder;

    @NotNull
    private final Function1<AtomAction, Unit> removeButtonActionHandler;

    @NotNull
    private final List<BindStep> steps;
    private B0 swipeFavJob;

    @NotNull
    private final GroupSwipeCoordinator swipeGroupCoordinator;

    @NotNull
    private final SwipeViewModel swipeViewModel;

    @NotNull
    private final CartTooltipShowService tooltipService;

    @NotNull
    private final CartSplitControlsView view;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.controls.CartSplitV2ControlsWidgetViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Unit> {
        AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            CartSplitV2ControlsWidgetViewHolder.this.composerReferences.getController().update(HideCartTooltip.INSTANCE);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/controls/CartSplitV2ControlsWidgetViewHolder$Companion;", "", "<init>", "()V", "BUY_ONE_CLICK_MIN_WIDTH", "", "QUANTITY_PLACEHOLDER", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartSplitV2ControlsWidgetViewHolder(@NotNull BaseSwipeableWrapperView containerView, @NotNull CartSplitControlsView view, @NotNull ComposerReferences composerReferences, @NotNull FavoriteProductDelegate favProductMoleculeDelegate, @NotNull FavoriteProductV4Delegate favoriteProductV4Delegate, @NotNull d customActionHandlersStoreFactory, boolean z11, @NotNull AppType appType, @NotNull GroupSwipeCoordinator swipeGroupCoordinator, @NotNull SwipeViewModel swipeViewModel, @NotNull FrameBinder frameBinder, @NotNull CartThrottleNotificationHandler cartThrottleNotificationHandler, @NotNull AsyncCartViewModel asyncCartViewModel) {
        super(containerView, composerReferences, frameBinder);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(favProductMoleculeDelegate, "favProductMoleculeDelegate");
        Intrinsics.checkNotNullParameter(favoriteProductV4Delegate, "favoriteProductV4Delegate");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(swipeGroupCoordinator, "swipeGroupCoordinator");
        Intrinsics.checkNotNullParameter(swipeViewModel, "swipeViewModel");
        Intrinsics.checkNotNullParameter(frameBinder, "frameBinder");
        Intrinsics.checkNotNullParameter(cartThrottleNotificationHandler, "cartThrottleNotificationHandler");
        Intrinsics.checkNotNullParameter(asyncCartViewModel, "asyncCartViewModel");
        this.containerView = containerView;
        this.view = view;
        this.composerReferences = composerReferences;
        this.favProductMoleculeDelegate = favProductMoleculeDelegate;
        this.favoriteProductV4Delegate = favoriteProductV4Delegate;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.controlsMoveEnabled = z11;
        this.appType = appType;
        this.swipeGroupCoordinator = swipeGroupCoordinator;
        this.swipeViewModel = swipeViewModel;
        this.asyncCartViewModel = asyncCartViewModel;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(composerReferences, this).onPreProcess(new CartSplitV2ControlsWidgetViewHolder$actionHandler$1(this)).customActionHandlers(new CartSplitV2ControlsWidgetViewHolder$actionHandler$2(this)).buildHandler();
        this.actionHandler = buildHandler;
        this.lockedQuantityBinder = new LockedQuantityBinder(view, composerReferences, buildHandler, cartThrottleNotificationHandler, true);
        int i11 = 1;
        this.buyOneClickButtonBinder = new BuyOneClickButtonBinder(view, buildHandler, true);
        this.buyForStarsBinder = new BuyForStarsButtonBinder(view, buildHandler, composerReferences.getTokenizedAnalytics(), appType);
        this.moveButtonActionHandler = new CartSplitV2ControlsWidgetViewHolder$moveButtonActionHandler$1(this);
        this.removeButtonActionHandler = new CartSplitV2ControlsWidgetViewHolder$removeButtonActionHandler$1(this);
        this.quantityBinder = new CountPickerBinder(view.getCountPickerV(), composerReferences, appType, new CountPickerListener() { // from class: ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.controls.CartSplitV2ControlsWidgetViewHolder$quantityBinder$1
            @Override // ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.controls.binder.CountPickerListener
            public void onDecreaseQuantity() {
                CartSplitV2ControlsWidgetViewHolder.closeAllSwipeGroup$default(CartSplitV2ControlsWidgetViewHolder.this, false, 1, null);
                CartSplitV2ControlsWidgetViewHolder.this.onDecreaseQuantity();
            }

            @Override // ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.controls.binder.CountPickerListener
            public void onIncreaseQuantity() {
                InterfaceC6786a widgetViewModel;
                CartSplitV2ControlsWidgetViewHolder.this.lockButtonsForProduct();
                CartSplitV2ControlsWidgetViewHolder.closeAllSwipeGroup$default(CartSplitV2ControlsWidgetViewHolder.this, false, 1, null);
                widgetViewModel = CartSplitV2ControlsWidgetViewHolder.this.getWidgetViewModel();
                CartSplitV2ViewModelV2 cartSplitV2ViewModelV2 = (CartSplitV2ViewModelV2) widgetViewModel;
                if (cartSplitV2ViewModelV2 != null) {
                    cartSplitV2ViewModelV2.increaseQuantity();
                }
            }

            @Override // ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.controls.binder.CountPickerListener
            public void onInputValueChanged(String value) {
                InterfaceC6786a widgetViewModel;
                Intrinsics.checkNotNullParameter(value, "value");
                CartSplitV2ControlsWidgetViewHolder.this.lockButtonsForProduct();
                CartSplitV2ControlsWidgetViewHolder.closeAllSwipeGroup$default(CartSplitV2ControlsWidgetViewHolder.this, false, 1, null);
                widgetViewModel = CartSplitV2ControlsWidgetViewHolder.this.getWidgetViewModel();
                CartSplitV2ViewModelV2 cartSplitV2ViewModelV2 = (CartSplitV2ViewModelV2) widgetViewModel;
                if (cartSplitV2ViewModelV2 != null) {
                    cartSplitV2ViewModelV2.setFromInput(value);
                }
            }

            @Override // ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.controls.binder.CountPickerListener
            public void onKeyboardHided() {
                InterfaceC6786a widgetViewModel;
                CartSplitV2ControlsWidgetViewHolder.this.lockButtonsForProduct();
                CartSplitV2ControlsWidgetViewHolder.closeAllSwipeGroup$default(CartSplitV2ControlsWidgetViewHolder.this, false, 1, null);
                widgetViewModel = CartSplitV2ControlsWidgetViewHolder.this.getWidgetViewModel();
                CartSplitV2ViewModelV2 cartSplitV2ViewModelV2 = (CartSplitV2ViewModelV2) widgetViewModel;
                if (cartSplitV2ViewModelV2 != null) {
                    cartSplitV2ViewModelV2.updateQuantityIfNeed();
                }
            }
        }, asyncCartViewModel);
        this.tooltipService = new CartTooltipShowService(composerReferences, true, false, false, 12, null);
        this.steps = C7714v.b0(new b(this, i11), new c(this, i11), new WR.d(this, 2), new e(this, i11), new f(this, i11));
        view.getFavBtn().setOnClick(new AnonymousClass1());
        containerView.setOnRemoveClick(new CartSplitV2ControlsWidgetViewHolder$2$1(this));
        containerView.getFavButton().setupViewClickListener(new CartSplitV2ControlsWidgetViewHolder$2$2(this));
    }

    private final void bindBuyOneClickControl(ButtonV3DTO buyOneClickBtn) {
        View view;
        ComponentCallbacksC5392m c11 = this.composerReferences.getContainer().c();
        this.buyOneClickButtonBinder.bind(((c11 == null || (view = c11.getView()) == null) ? 0 : ResourceExtKt.toDp(view.getWidth())) < 336 ? buyOneClickBtn != null ? ButtonV3DTO.copy$default(buyOneClickBtn, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131055, null) : null : buyOneClickBtn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void bindControlsStep1() {
        CartSplitControlsView cartSplitControlsView = this.view;
        CartSplitV2ControlsVO cartSplitV2ControlsVO = (CartSplitV2ControlsVO) getBoundData();
        if (cartSplitV2ControlsVO == null) {
            return;
        }
        IconButtonV3HolderKt.bindOrGone(cartSplitControlsView.getRemoveButton(), lockWhileAsync$default(this, cartSplitV2ControlsVO.getControls().getRemoveButton(), (Boolean) null, 1, (Object) null), this.removeButtonActionHandler);
        ViewExtKt.show(cartSplitControlsView.getFavBtn());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void bindControlsStep2() {
        CartSplitV2ControlsVO cartSplitV2ControlsVO = (CartSplitV2ControlsVO) getBoundData();
        if (cartSplitV2ControlsVO == null) {
            return;
        }
        bindQuantityControl(cartSplitV2ControlsVO.getControls().getQuantity());
        bindBuyOneClickControl(lockForProductWhileAsync(cartSplitV2ControlsVO.getControls().getBuyInOneClick()));
        this.buyForStarsBinder.bind(lockForProductWhileAsync(cartSplitV2ControlsVO.getControls().getBuyForStars()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void bindControlsStep3() {
        CartSplitControlsView cartSplitControlsView = this.view;
        CartSplitV2ControlsVO cartSplitV2ControlsVO = (CartSplitV2ControlsVO) getBoundData();
        if (cartSplitV2ControlsVO == null) {
            return;
        }
        swapQuantityAndBuyOneClickIfNeed();
        bindFavoriteProductButton(cartSplitControlsView.getFavBtn(), cartSplitV2ControlsVO.getControls().getFavoriteProduct(), new AnalyticData(getTrackingData(), getViewItem()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void bindControlsStep4() {
        ControlsVO controls;
        CartSplitControlsView cartSplitControlsView = this.view;
        CartSplitV2ControlsVO cartSplitV2ControlsVO = (CartSplitV2ControlsVO) getBoundData();
        if (cartSplitV2ControlsVO == null || (controls = cartSplitV2ControlsVO.getControls()) == null) {
            return;
        }
        IconButtonV3HolderKt.bindOrGone(cartSplitControlsView.getMoveButton(), lockWhileAsync$default(this, controls.getMoveButton(), (Boolean) null, 1, (Object) null), this.moveButtonActionHandler);
        cartSplitControlsView.updateQuantityLPForSmallScreen(controls);
        showMoveButtonOnboardingIfNeed(controls);
    }

    private final void bindQuantityControl(ControlsVO.QuantityControl item) {
        NotificationDTO controlsLockNotification = item != null ? item.getControlsLockNotification() : null;
        if (controlsLockNotification != null) {
            this.lockedQuantityBinder.bind(controlsLockNotification);
        } else {
            this.lockedQuantityBinder.clear();
        }
        CartSplitV2ViewModelV2 cartSplitV2ViewModelV2 = (CartSplitV2ViewModelV2) getWidgetViewModel();
        if (cartSplitV2ViewModelV2 == null) {
            return;
        }
        this.quantityBinder.bind(item);
        if (item == null) {
            return;
        }
        cartSplitV2ViewModelV2.setQuantityData(item.getMultiplicity(), item.getMinimum(), item.getMaximum(), item.getQuantSize());
        cartSplitV2ViewModelV2.setCurrentQuantity(item.getCurrent());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void bindSwipeContainer() {
        BaseSwipeableWrapperView baseSwipeableWrapperView = this.containerView;
        CartSplitV2ControlsVO cartSplitV2ControlsVO = (CartSplitV2ControlsVO) getBoundData();
        baseSwipeableWrapperView.setSwipeData(lockWhileAsync$default(this, cartSplitV2ControlsVO != null ? cartSplitV2ControlsVO.getSwipeInfo() : null, (Boolean) null, 1, (Object) null));
        this.isFavButtonBind = false;
    }

    private final void closeAllSwipeGroup(boolean animate) {
        this.swipeGroupCoordinator.closeAllGroups(animate);
    }

    static /* synthetic */ void closeAllSwipeGroup$default(CartSplitV2ControlsWidgetViewHolder cartSplitV2ControlsWidgetViewHolder, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        cartSplitV2ControlsWidgetViewHolder.closeAllSwipeGroup(z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final AtomAction.Click getDecrementRemoveAction() {
        ControlsVO controls;
        ControlsVO.QuantityControl quantity;
        ControlsVO.DecrementRemove decrementRemove;
        AtomAction action;
        CartSplitV2ControlsVO cartSplitV2ControlsVO = (CartSplitV2ControlsVO) getBoundData();
        if (cartSplitV2ControlsVO == null || (controls = cartSplitV2ControlsVO.getControls()) == null || (quantity = controls.getQuantity()) == null || (decrementRemove = quantity.getDecrementRemove()) == null || (action = decrementRemove.getAction()) == null) {
            return null;
        }
        return CartExtensionsKt.getActionWithScrollParams(action, getAdapterPosition(), this.composerReferences, getBindingAdapter());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final AtomAction.Click getRemoveAction() {
        ControlsVO controls;
        IconButtonV3DTO removeButton;
        CommonControlSettings common;
        AtomActionDTO action;
        AtomAction atomAction;
        CartSplitV2ControlsVO cartSplitV2ControlsVO = (CartSplitV2ControlsVO) getBoundData();
        if (cartSplitV2ControlsVO == null || (controls = cartSplitV2ControlsVO.getControls()) == null || (removeButton = controls.getRemoveButton()) == null || (common = removeButton.getCommon()) == null || (action = common.getAction()) == null || (atomAction = AtomActionMapperKt.toAtomAction(action, common.getTrackingInfo())) == null) {
            return null;
        }
        return CartExtensionsKt.getActionWithScrollParams(atomAction, getAdapterPosition(), this.composerReferences, getBindingAdapter());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final AtomAction.Click getSwipeRemoveAction() {
        SwipeInfoVO swipeInfo;
        SwipeButtonVO removeButton;
        AtomActionDTO action;
        CartSplitV2ControlsVO cartSplitV2ControlsVO = (CartSplitV2ControlsVO) getBoundData();
        if (cartSplitV2ControlsVO == null || (swipeInfo = cartSplitV2ControlsVO.getSwipeInfo()) == null || (removeButton = swipeInfo.getRemoveButton()) == null || (action = removeButton.getAction()) == null) {
            return null;
        }
        return CartExtensionsKt.getActionWithScrollParams(AtomActionMapperKt.toAtomAction(action, null), getAdapterPosition(), this.composerReferences, getBindingAdapter());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void lockButtonsForProduct() {
        CartSplitV2ControlsVO cartSplitV2ControlsVO;
        if (this.asyncCartViewModel.isEnabled() && (cartSplitV2ControlsVO = (CartSplitV2ControlsVO) getBoundData()) != null) {
            cartSplitV2ControlsVO.setLockedForProduct(true);
            updateLockStatesForProduct(cartSplitV2ControlsVO.getControls());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final ButtonV3DTO lockForProductWhileAsync(ButtonV3DTO buttonV3DTO) {
        CartSplitV2ControlsVO cartSplitV2ControlsVO = (CartSplitV2ControlsVO) getBoundData();
        return (cartSplitV2ControlsVO == null || !cartSplitV2ControlsVO.getIsLockedForProduct() || buttonV3DTO == null) ? buttonV3DTO : ButtonV3DTO.copy$default(buttonV3DTO, null, null, null, null, null, null, Boolean.TRUE, null, null, null, null, null, null, null, null, null, null, 131007, null);
    }

    private final IconButtonV3DTO lockWhileAsync(IconButtonV3DTO iconButtonV3DTO, Boolean bool) {
        return (!(bool != null ? bool.booleanValue() : this.asyncCartViewModel.isProcessing().getValue().booleanValue()) || iconButtonV3DTO == null) ? iconButtonV3DTO : IconButtonV3DTO.copy$default(iconButtonV3DTO, null, null, null, null, Boolean.TRUE, null, null, null, null, null, null, null, null, null, 16367, null);
    }

    static /* synthetic */ IconButtonV3DTO lockWhileAsync$default(CartSplitV2ControlsWidgetViewHolder cartSplitV2ControlsWidgetViewHolder, IconButtonV3DTO iconButtonV3DTO, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = null;
        }
        return cartSplitV2ControlsWidgetViewHolder.lockWhileAsync(iconButtonV3DTO, bool);
    }

    private final void observeSwipeFavButton() {
        B0 b02 = this.swipeFavJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.swipeFavJob = C2399j.C(new C2408n0(this.swipeViewModel.getSwipeFavoriteClick(), new CartSplitV2ControlsWidgetViewHolder$observeSwipeFavButton$1(this, null)), K.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object onAttach$updateAsyncLocking(CartSplitV2ControlsWidgetViewHolder cartSplitV2ControlsWidgetViewHolder, boolean z11, kotlin.coroutines.d dVar) {
        cartSplitV2ControlsWidgetViewHolder.updateAsyncLocking(z11);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void onDecreaseQuantity() {
        ControlsVO controls;
        ControlsVO.QuantityControl quantity;
        CartSplitV2ViewModelV2 cartSplitV2ViewModelV2 = (CartSplitV2ViewModelV2) getWidgetViewModel();
        if (cartSplitV2ViewModelV2 == null) {
            return;
        }
        CartSplitV2ControlsVO cartSplitV2ControlsVO = (CartSplitV2ControlsVO) getBoundData();
        ControlsVO.DecrementRemove decrementRemove = (cartSplitV2ControlsVO == null || (controls = cartSplitV2ControlsVO.getControls()) == null || (quantity = controls.getQuantity()) == null) ? null : quantity.getDecrementRemove();
        if (!Intrinsics.d(cartSplitV2ViewModelV2.getDecreaseEnabled().getValue(), Boolean.FALSE) || decrementRemove == null) {
            lockButtonsForProduct();
            cartSplitV2ViewModelV2.decreaseQuantity();
        } else {
            AtomAction.Click decrementRemoveAction = getDecrementRemoveAction();
            if (decrementRemoveAction != null) {
                this.actionHandler.invoke(decrementRemoveAction);
            }
            m.a(this.composerReferences.getTokenizedAnalytics(), decrementRemove.getTokenizedEvent(), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void refreshWithQuantity(int quantity) {
        ControlsVO controls;
        ControlsVO.QuantityControl quantity2;
        AtomAction action;
        LinkedHashMap linkedHashMap;
        CartSplitV2ControlsVO cartSplitV2ControlsVO = (CartSplitV2ControlsVO) getBoundData();
        if (cartSplitV2ControlsVO == null || (controls = cartSplitV2ControlsVO.getControls()) == null || (quantity2 = controls.getQuantity()) == null || (action = quantity2.getAction()) == null) {
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

    private final void showMoveButtonOnboardingIfNeed(ControlsVO item) {
        final TooltipWithOnboardingActionVO moveButtonTooltipWithAction = item.getMoveButtonTooltipWithAction();
        if (moveButtonTooltipWithAction == null) {
            return;
        }
        CartSplitControlsView cartSplitControlsView = this.view;
        int i11 = Y.f42258g;
        if (!cartSplitControlsView.isLaidOut() || cartSplitControlsView.isLayoutRequested()) {
            cartSplitControlsView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.controls.CartSplitV2ControlsWidgetViewHolder$showMoveButtonOnboardingIfNeed$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    view.removeOnLayoutChangeListener(this);
                    CartTooltipShowService.showTooltipIfNeed$default(CartSplitV2ControlsWidgetViewHolder.this.tooltipService, moveButtonTooltipWithAction, CartSplitV2ControlsWidgetViewHolder.this.view.getMoveButton(), 0, false, CartSplitV2ControlsWidgetViewHolder.this.actionHandler, 12, null);
                }
            });
        } else {
            CartTooltipShowService.showTooltipIfNeed$default(this.tooltipService, moveButtonTooltipWithAction, this.view.getMoveButton(), 0, false, this.actionHandler, 12, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit steps$lambda$0(CartSplitV2ControlsWidgetViewHolder cartSplitV2ControlsWidgetViewHolder) {
        cartSplitV2ControlsWidgetViewHolder.bindControlsStep1();
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit steps$lambda$1(CartSplitV2ControlsWidgetViewHolder cartSplitV2ControlsWidgetViewHolder) {
        cartSplitV2ControlsWidgetViewHolder.bindControlsStep2();
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit steps$lambda$2(CartSplitV2ControlsWidgetViewHolder cartSplitV2ControlsWidgetViewHolder) {
        cartSplitV2ControlsWidgetViewHolder.bindControlsStep3();
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit steps$lambda$3(CartSplitV2ControlsWidgetViewHolder cartSplitV2ControlsWidgetViewHolder) {
        cartSplitV2ControlsWidgetViewHolder.bindControlsStep4();
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit steps$lambda$4(CartSplitV2ControlsWidgetViewHolder cartSplitV2ControlsWidgetViewHolder) {
        cartSplitV2ControlsWidgetViewHolder.bindSwipeContainer();
        return Unit.f71690a;
    }

    private final void swapQuantityAndBuyOneClickIfNeed() {
        ButtonV3View buyOneClickButtonView = this.buyOneClickButtonBinder.getBuyOneClickButtonView();
        ViewGroup.LayoutParams layoutParams = buyOneClickButtonView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        boolean z11 = this.controlsMoveEnabled;
        bVar.f41655s = z11 ? -1 : R$id.removeButton;
        bVar.f41658v = z11 ? 0 : -1;
        buyOneClickButtonView.setLayoutParams(bVar);
        RightIconButtonView buyForStarsButtonView = this.buyForStarsBinder.getBuyForStarsButtonView();
        if (buyForStarsButtonView != null) {
            ViewGroup.LayoutParams layoutParams2 = buyForStarsButtonView.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams2;
            boolean z12 = this.controlsMoveEnabled;
            bVar2.f41655s = z12 ? R$id.countPickerV : R$id.removeButton;
            bVar2.f41657u = z12 ? -1 : R$id.countPickerV;
            bVar2.f41658v = z12 ? 0 : -1;
            bVar2.setMarginEnd(z12 ? BuyForStarsButtonBinder.INSTANCE.getDP_16() : BuyForStarsButtonBinder.INSTANCE.getDP_8());
            bVar2.f41598E = this.controlsMoveEnabled ? 1.0f : 0.0f;
            buyForStarsButtonView.setLayoutParams(bVar2);
        }
        CartCountPickerView countPickerV = this.view.getCountPickerV();
        ViewGroup.LayoutParams layoutParams3 = countPickerV.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar3 = (ConstraintLayout.b) layoutParams3;
        bVar3.f41655s = this.controlsMoveEnabled ? R$id.removeButton : -1;
        countPickerV.setLayoutParams(bVar3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void trackQuantityChange(CartViewModel.SplitQuantityChange quantityChange) {
        CartSplitV2ControlsVO cartSplitV2ControlsVO;
        ControlsVO controls;
        ControlsVO.QuantityControl quantity;
        CartSplitV2ControlsVO cartSplitV2ControlsVO2 = (CartSplitV2ControlsVO) getBoundData();
        if (cartSplitV2ControlsVO2 == null || quantityChange.getSplitId() != cartSplitV2ControlsVO2.getId() || (cartSplitV2ControlsVO = (CartSplitV2ControlsVO) getBoundData()) == null || (controls = cartSplitV2ControlsVO.getControls()) == null || (quantity = controls.getQuantity()) == null) {
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

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateAsyncLocking(boolean inProgress) {
        CartSplitV2ControlsVO cartSplitV2ControlsVO = (CartSplitV2ControlsVO) getBoundData();
        if (cartSplitV2ControlsVO == null) {
            return;
        }
        ControlsVO controls = cartSplitV2ControlsVO.getControls();
        IconButtonV3HolderKt.bindOrGone(this.view.getRemoveButton(), lockWhileAsync(controls.getRemoveButton(), Boolean.valueOf(inProgress)), this.removeButtonActionHandler);
        IconButtonV3HolderKt.bindOrGone(this.view.getMoveButton(), lockWhileAsync(controls.getMoveButton(), Boolean.valueOf(inProgress)), this.moveButtonActionHandler);
        SwipeInfoVO swipeInfo = cartSplitV2ControlsVO.getSwipeInfo();
        if (swipeInfo != null) {
            this.containerView.setSwipeData(lockWhileAsync$default(this, swipeInfo, (Boolean) null, 1, (Object) null));
        }
        if (inProgress || !cartSplitV2ControlsVO.getIsLockedForProduct()) {
            return;
        }
        cartSplitV2ControlsVO.setLockedForProduct(false);
        updateLockStatesForProduct(cartSplitV2ControlsVO.getControls());
    }

    private final void updateLockStatesForProduct(ControlsVO controlsVO) {
        bindBuyOneClickControl(lockForProductWhileAsync(controlsVO.getBuyInOneClick()));
        this.buyForStarsBinder.bind(lockForProductWhileAsync(controlsVO.getBuyForStars()));
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.holder.SwipeableViewHolder
    public void ensureSwipeMenuInitialized() {
        SwipeInfoVO swipeInfo;
        this.containerView.ensureSwipeMenuInitialized();
        if (!this.isFavButtonBind) {
            FavoriteProductV4Delegate favoriteProductV4Delegate = this.favoriteProductV4Delegate;
            SwipeFavoriteButtonView favButton = this.containerView.getFavButton();
            CartSplitV2ControlsVO cartSplitV2ControlsVO = (CartSplitV2ControlsVO) getBoundData();
            favoriteProductV4Delegate.bindFavoriteProductButton(favButton, (cartSplitV2ControlsVO == null || (swipeInfo = cartSplitV2ControlsVO.getSwipeInfo()) == null) ? null : swipeInfo.getFavMolecule(), new AnalyticData(getTrackingData(), getViewItem()));
            this.isFavButtonBind = true;
        }
        this.containerView.getFavButton().setIconVisibility(false);
    }

    @Override // ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.holder.SwipeableViewHolder
    public Float getCurrentOffset() {
        View contentView = this.containerView.getContentView();
        if (contentView != null) {
            return Float.valueOf(contentView.getTranslationX());
        }
        return null;
    }

    @Override // ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.holder.SwipeableViewHolder
    public float getMaxSwipeDistance() {
        return this.containerView.getMaxSwipeDistance();
    }

    @Override // ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.BaseMultiFrameBindingViewHolder
    @NotNull
    public List<BindStep> getSteps() {
        return this.steps;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.holder.SwipeableViewHolder
    public String getSwipeGroupId() {
        SwipeInfoVO swipeInfo;
        CartSplitV2ControlsVO cartSplitV2ControlsVO = (CartSplitV2ControlsVO) getBoundData();
        if (cartSplitV2ControlsVO == null || (swipeInfo = cartSplitV2ControlsVO.getSwipeInfo()) == null) {
            return null;
        }
        return swipeInfo.getGroupSwipeId();
    }

    @Override // ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.BaseMultiFrameBindingViewHolder, ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        this.swipeGroupCoordinator.registerViewHolder(this);
        this.favoriteProductV4Delegate.attachFavButtonView(this.containerView.getFavButton());
        observeSwipeFavButton();
        C2399j.C(new C2408n0(this.asyncCartViewModel.isProcessing(), new CartSplitV2ControlsWidgetViewHolder$onAttach$1(this)), K.a(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        ControlsVO controls;
        ControlsVO.QuantityControl quantity;
        Long debounceDelay;
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        CartSplitV2ViewModelV2 cartSplitV2ViewModelV2 = (CartSplitV2ViewModelV2) getWidgetViewModel();
        if (cartSplitV2ViewModelV2 == null) {
            return;
        }
        p<Integer> doOnEach = cartSplitV2ViewModelV2.getRefreshEvents().doOnEach(new Hs.d(new CartSplitV2ControlsWidgetViewHolder$onAttachViewModel$1(this), 8));
        CartSplitV2ControlsVO cartSplitV2ControlsVO = (CartSplitV2ControlsVO) getBoundData();
        p<Integer> observeOn = doOnEach.debounce((cartSplitV2ControlsVO == null || (controls = cartSplitV2ControlsVO.getControls()) == null || (quantity = controls.getQuantity()) == null || (debounceDelay = quantity.getDebounceDelay()) == null) ? 0L : debounceDelay.longValue(), TimeUnit.MILLISECONDS).observeOn(C8125a.a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "observeOn(...)");
        RxExtKt.subscribe$default(observeOn, lifecycle, new CartSplitV2ControlsWidgetViewHolder$onAttachViewModel$2(this), CartSplitV2ControlsWidgetViewHolder$onAttachViewModel$3.INSTANCE, null, 8, null);
        this.quantityBinder.onAttachViewModel(lifecycle, cartSplitV2ViewModelV2);
    }

    @Override // ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.BaseMultiFrameBindingViewHolder, ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        this.swipeGroupCoordinator.unregisterViewHolder(this);
        super.onDetach();
        this.favoriteProductV4Delegate.detachFavButtonView();
        B0 b02 = this.swipeFavJob;
        if (b02 != null) {
            b02.j(null);
        }
    }

    @Override // ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.BaseMultiFrameBindingViewHolder, jk0.j
    public void onRecycle() {
        this.containerView.resetSwipeMenuState();
        this.isFavButtonBind = false;
        super.onRecycle();
    }

    @Override // ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.holder.SwipeableViewHolder
    public void onSwipeStateChanged(boolean isOpen) {
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegate
    public void setOnFavoriteClick(Function1<? super Boolean, Unit> function1) {
        this.favProductMoleculeDelegate.setOnFavoriteClick(function1);
    }

    @Override // ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.holder.SwipeableViewHolder
    public void updateSwipeOffset(float offset, boolean animate) {
        this.containerView.updateSwipeOffset(offset);
    }

    static /* synthetic */ SwipeInfoVO lockWhileAsync$default(CartSplitV2ControlsWidgetViewHolder cartSplitV2ControlsWidgetViewHolder, SwipeInfoVO swipeInfoVO, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = null;
        }
        return cartSplitV2ControlsWidgetViewHolder.lockWhileAsync(swipeInfoVO, bool);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull CartSplitV2ControlsVO item, @NotNull W10.c trackingData, ru.ozon.composer.ui.widget.f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        this.buyForStarsBinder.trackViewIfNeed(item.getId());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final RightIconButtonDTO lockForProductWhileAsync(RightIconButtonDTO rightIconButtonDTO) {
        CartSplitV2ControlsVO cartSplitV2ControlsVO = (CartSplitV2ControlsVO) getBoundData();
        return (cartSplitV2ControlsVO == null || !cartSplitV2ControlsVO.getIsLockedForProduct() || rightIconButtonDTO == null) ? rightIconButtonDTO : RightIconButtonDTO.copy$default(rightIconButtonDTO, null, null, null, null, 11, null);
    }

    private final SwipeInfoVO lockWhileAsync(SwipeInfoVO swipeInfoVO, Boolean bool) {
        if (bool == null) {
            bool = this.asyncCartViewModel.isProcessing().getValue();
        }
        return (!bool.booleanValue() || swipeInfoVO == null) ? swipeInfoVO : CartExtensionsKt.lockRemoveButton(swipeInfoVO);
    }
}
