package ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.product;

import A00.a;
import Ae.C2399j;
import Ae.C2408n0;
import EX.a;
import EX.b;
import Vg.d;
import W10.c;
import WZ.l;
import WZ.m;
import WZ.t;
import WZ.x;
import android.view.View;
import androidx.lifecycle.K;
import cT.C5784a;
import i10.h;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.cart.cartSplitV2.v2.dynamicElementV2.DynamicElementVOV2;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.BaseMultiFrameBindingViewHolder;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.CheckboxVO;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.product.productView.ProductV2View;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.product.productView.ProductVOV2;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.product.productView.binder.ProductBinderV2;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.ProductMediaSizeCalculator;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.extensions.CartExtensionsKt;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.extensions.SwipeAnalyticsExtKt;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.SwipeViewModel;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.coordinator.GroupSwipeCoordinator;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.holder.SwipeableViewHolder;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.view.BaseSwipeableWrapperView;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.view.SwipeFavoriteButtonView;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.viewObjects.SwipeButtonVO;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.viewObjects.SwipeInfoVO;
import ru.ozon.app.android.cart.common.presentation.asyncCart.AsyncCartViewModel;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.multiframebinder.BindStep;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.AnalyticData;
import ru.ozon.app.android.favorites.domain.model.FavoriteProductModel;
import ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.delegate.FavoriteProductV4Delegate;
import ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.view.ProductFavoriteMoleculeV4ButtonView;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import xe.B0;

@Metadata(d1 = {"\u0000ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004Bg\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\u0010\r\u001a\u00060\u000bj\u0002`\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\n\u0010\u0017\u001a\u00060\u0015j\u0002`\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0011\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010&\u001a\u00020%2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020%2\u0006\u0010(\u001a\u00020#H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020!H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020%H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020%H\u0016¢\u0006\u0004\b/\u0010.J\u000f\u00100\u001a\u00020%H\u0016¢\u0006\u0004\b0\u0010.J\u001f\u00104\u001a\u00020%2\u0006\u00101\u001a\u00020\u00022\u0006\u00103\u001a\u000202H\u0014¢\u0006\u0004\b4\u00105J)\u0010:\u001a\u00020%2\u0006\u00101\u001a\u00020\u00022\u0006\u00107\u001a\u0002062\b\u00109\u001a\u0004\u0018\u000108H\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020%H\u0016¢\u0006\u0004\b<\u0010.J\u0018\u0010>\u001a\u00020%2\u0006\u0010\b\u001a\u00020=H\u0096\u0001¢\u0006\u0004\b>\u0010?J\u0010\u0010@\u001a\u00020%H\u0096\u0001¢\u0006\u0004\b@\u0010.J*\u0010E\u001a\u00020%2\u0006\u0010\b\u001a\u00020=2\b\u0010B\u001a\u0004\u0018\u00010A2\u0006\u0010D\u001a\u00020CH\u0096\u0001¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020%H\u0002¢\u0006\u0004\bG\u0010.J\u000f\u0010H\u001a\u00020%H\u0002¢\u0006\u0004\bH\u0010.J\u000f\u0010I\u001a\u00020%H\u0002¢\u0006\u0004\bI\u0010.J\u001f\u0010N\u001a\u00020%2\u0006\u0010K\u001a\u00020J2\u0006\u0010M\u001a\u00020LH\u0002¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020%H\u0002¢\u0006\u0004\bP\u0010.J\u000f\u0010Q\u001a\u00020%H\u0002¢\u0006\u0004\bQ\u0010.J\u0011\u0010S\u001a\u0004\u0018\u00010RH\u0002¢\u0006\u0004\bS\u0010TJ\u0017\u0010V\u001a\u00020%2\u0006\u0010U\u001a\u00020#H\u0002¢\u0006\u0004\bV\u0010*J#\u0010Y\u001a\u0004\u0018\u00010W*\u0004\u0018\u00010W2\n\b\u0002\u0010X\u001a\u0004\u0018\u00010#H\u0002¢\u0006\u0004\bY\u0010ZR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010[R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\\R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010]R\u0018\u0010\r\u001a\u00060\u000bj\u0002`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010^R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010_R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010`R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010aR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010bR \u0010e\u001a\u000e\u0012\u0004\u0012\u00020d\u0012\u0004\u0012\u00020%0c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR \u0010i\u001a\b\u0012\u0004\u0012\u00020h0g8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010lR\u0014\u0010n\u001a\u00020m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0018\u0010q\u001a\u0004\u0018\u00010p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u0016\u0010s\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010tR\u0016\u0010w\u001a\u0004\u0018\u00010!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bu\u0010v¨\u0006x"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/CartSplitV2ProductWidgetViewHolder;", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/BaseMultiFrameBindingViewHolder;", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/CartSplitV2ProductVO;", "Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/holder/SwipeableViewHolder;", "Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/delegate/FavoriteProductV4Delegate;", "Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/view/BaseSwipeableWrapperView;", "containerView", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/productView/ProductV2View;", "view", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/coordinator/GroupSwipeCoordinator;", "swipeGroupCoordinator", "favoriteProductV4Delegate", "Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/SwipeViewModel;", "swipeViewModel", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "frameBinder", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/cart/cartSplitV2/v2/util/ProductMediaSizeCalculator;", "productMediaSizeCalculator", "Lru/ozon/app/android/cart/common/presentation/asyncCart/AsyncCartViewModel;", "asyncCartViewModel", "<init>", "(Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/view/BaseSwipeableWrapperView;Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/productView/ProductV2View;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/coordinator/GroupSwipeCoordinator;Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/delegate/FavoriteProductV4Delegate;Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/SwipeViewModel;Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;LVg/d;Lru/ozon/app/android/cart/cartSplitV2/v2/util/ProductMediaSizeCalculator;Lru/ozon/app/android/cart/common/presentation/asyncCart/AsyncCartViewModel;)V", "", "getSwipeGroupId", "()Ljava/lang/String;", "", "offset", "", "animate", "", "updateSwipeOffset", "(FZ)V", "isOpen", "onSwipeStateChanged", "(Z)V", "getMaxSwipeDistance", "()F", "ensureSwipeMenuInitialized", "()V", "onAttach", "onDetach", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/CartSplitV2ProductVO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/CartSplitV2ProductVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "onRecycle", "Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/view/ProductFavoriteMoleculeV4ButtonView;", "attachFavButtonView", "(Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/view/ProductFavoriteMoleculeV4ButtonView;)V", "detachFavButtonView", "Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;", "molecule", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;", "analyticData", "bindFavoriteProductButton", "(Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/view/ProductFavoriteMoleculeV4ButtonView;Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;)V", "bindProduct", "bindBottomDynamicElement", "bindSwipeContainer", "Lru/ozon/uni/atoms/af/AtomAction$Refresh;", "action", "", "scrollWidgetKey", "refreshWithScroll", "(Lru/ozon/uni/atoms/af/AtomAction$Refresh;I)V", "processCheckboxClick", "observeSwipeFavButton", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "getSwipeRemoveAction", "()Lru/ozon/uni/atoms/af/AtomAction$Click;", "inProgress", "updateAsyncLocking", "Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/viewObjects/SwipeInfoVO;", "lock", "lockWhileAsync", "(Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/viewObjects/SwipeInfoVO;Ljava/lang/Boolean;)Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/viewObjects/SwipeInfoVO;", "Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/view/BaseSwipeableWrapperView;", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/productView/ProductV2View;", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/coordinator/GroupSwipeCoordinator;", "Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/delegate/FavoriteProductV4Delegate;", "Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/SwipeViewModel;", "Lru/ozon/app/android/cart/common/presentation/asyncCart/AsyncCartViewModel;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "", "Lru/ozon/app/android/composer/view/multiframebinder/BindStep;", "steps", "Ljava/util/List;", "getSteps", "()Ljava/util/List;", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/productView/binder/ProductBinderV2;", "productBinder", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/productView/binder/ProductBinderV2;", "Lxe/B0;", "swipeFavJob", "Lxe/B0;", "isFavButtonBind", "Z", "getCurrentOffset", "()Ljava/lang/Float;", "currentOffset", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CartSplitV2ProductWidgetViewHolder extends BaseMultiFrameBindingViewHolder<CartSplitV2ProductVO> implements SwipeableViewHolder, FavoriteProductV4Delegate {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AsyncCartViewModel asyncCartViewModel;

    @NotNull
    private final ComposerReferences composerReferences;

    @NotNull
    private final BaseSwipeableWrapperView containerView;

    @NotNull
    private final FavoriteProductV4Delegate favoriteProductV4Delegate;
    private boolean isFavButtonBind;

    @NotNull
    private final ProductBinderV2 productBinder;

    @NotNull
    private final List<BindStep> steps;
    private B0 swipeFavJob;

    @NotNull
    private final GroupSwipeCoordinator swipeGroupCoordinator;

    @NotNull
    private final SwipeViewModel swipeViewModel;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final ProductV2View view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartSplitV2ProductWidgetViewHolder(@NotNull BaseSwipeableWrapperView containerView, @NotNull ProductV2View view, @NotNull ComposerReferences composerReferences, @NotNull l tokenizedAnalytics, @NotNull GroupSwipeCoordinator swipeGroupCoordinator, @NotNull FavoriteProductV4Delegate favoriteProductV4Delegate, @NotNull SwipeViewModel swipeViewModel, @NotNull FrameBinder frameBinder, @NotNull d customActionHandlersStoreFactory, @NotNull ProductMediaSizeCalculator productMediaSizeCalculator, @NotNull AsyncCartViewModel asyncCartViewModel) {
        super(containerView, composerReferences, frameBinder);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(swipeGroupCoordinator, "swipeGroupCoordinator");
        Intrinsics.checkNotNullParameter(favoriteProductV4Delegate, "favoriteProductV4Delegate");
        Intrinsics.checkNotNullParameter(swipeViewModel, "swipeViewModel");
        Intrinsics.checkNotNullParameter(frameBinder, "frameBinder");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(productMediaSizeCalculator, "productMediaSizeCalculator");
        Intrinsics.checkNotNullParameter(asyncCartViewModel, "asyncCartViewModel");
        this.containerView = containerView;
        this.view = view;
        this.composerReferences = composerReferences;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.swipeGroupCoordinator = swipeGroupCoordinator;
        this.favoriteProductV4Delegate = favoriteProductV4Delegate;
        this.swipeViewModel = swipeViewModel;
        this.asyncCartViewModel = asyncCartViewModel;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(composerReferences, this).customActionHandlers(new CartSplitV2ProductWidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).customAnalyticHandler(CartSplitV2ProductWidgetViewHolder$actionHandler$2.INSTANCE).buildHandler();
        this.actionHandler = buildHandler;
        int i11 = 2;
        this.steps = C7714v.b0(new a(this, i11), new b(this, i11), new C5784a(this, i11));
        this.productBinder = new ProductBinderV2(view, buildHandler, composerReferences, productMediaSizeCalculator, tokenizedAnalytics, asyncCartViewModel, new CartSplitV2ProductWidgetViewHolder$productBinder$1(this));
        containerView.getFavButton().setupViewClickListener(new CartSplitV2ProductWidgetViewHolder$1$1(this));
        containerView.setOnRemoveClick(new CartSplitV2ProductWidgetViewHolder$1$2(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void bindBottomDynamicElement() {
        ProductVOV2 product;
        List<DynamicElementVOV2> bottomDynamicElements;
        CartSplitV2ProductVO cartSplitV2ProductVO = (CartSplitV2ProductVO) getBoundData();
        if (cartSplitV2ProductVO == null || (product = cartSplitV2ProductVO.getProduct()) == null || (bottomDynamicElements = product.getBottomDynamicElements()) == null) {
            return;
        }
        this.productBinder.bindDynamicElements(bottomDynamicElements);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void bindProduct() {
        CartSplitV2ProductVO cartSplitV2ProductVO = (CartSplitV2ProductVO) getBoundData();
        if (cartSplitV2ProductVO == null) {
            return;
        }
        this.productBinder.bind(cartSplitV2ProductVO);
        this.productBinder.setOnCheckboxClick(new CartSplitV2ProductWidgetViewHolder$bindProduct$1$1(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void bindSwipeContainer() {
        BaseSwipeableWrapperView baseSwipeableWrapperView = this.containerView;
        CartSplitV2ProductVO cartSplitV2ProductVO = (CartSplitV2ProductVO) getBoundData();
        baseSwipeableWrapperView.setSwipeData(lockWhileAsync$default(this, cartSplitV2ProductVO != null ? cartSplitV2ProductVO.getSwipeInfo() : null, null, 1, null));
        this.isFavButtonBind = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final AtomAction.Click getSwipeRemoveAction() {
        SwipeInfoVO swipeInfo;
        SwipeButtonVO removeButton;
        AtomActionDTO action;
        CartSplitV2ProductVO cartSplitV2ProductVO = (CartSplitV2ProductVO) getBoundData();
        if (cartSplitV2ProductVO == null || (swipeInfo = cartSplitV2ProductVO.getSwipeInfo()) == null || (removeButton = swipeInfo.getRemoveButton()) == null || (action = removeButton.getAction()) == null) {
            return null;
        }
        return CartExtensionsKt.getActionWithScrollParams(AtomActionMapperKt.toAtomAction(action, null), getAdapterPosition(), this.composerReferences, getBindingAdapter());
    }

    private final SwipeInfoVO lockWhileAsync(SwipeInfoVO swipeInfoVO, Boolean bool) {
        if (bool == null) {
            bool = this.asyncCartViewModel.isProcessing().getValue();
        }
        if (!bool.booleanValue()) {
            return swipeInfoVO;
        }
        if (swipeInfoVO != null) {
            return CartExtensionsKt.lockRemoveButton(swipeInfoVO);
        }
        return null;
    }

    static /* synthetic */ SwipeInfoVO lockWhileAsync$default(CartSplitV2ProductWidgetViewHolder cartSplitV2ProductWidgetViewHolder, SwipeInfoVO swipeInfoVO, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = null;
        }
        return cartSplitV2ProductWidgetViewHolder.lockWhileAsync(swipeInfoVO, bool);
    }

    private final void observeSwipeFavButton() {
        B0 b02 = this.swipeFavJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.swipeFavJob = C2399j.C(new C2408n0(this.swipeViewModel.getSwipeFavoriteClick(), new CartSplitV2ProductWidgetViewHolder$observeSwipeFavButton$1(this, null)), K.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object onAttach$updateAsyncLocking(CartSplitV2ProductWidgetViewHolder cartSplitV2ProductWidgetViewHolder, boolean z11, kotlin.coroutines.d dVar) {
        cartSplitV2ProductWidgetViewHolder.updateAsyncLocking(z11);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void processCheckboxClick() {
        CheckboxVO checkbox;
        AtomAction action;
        CartSplitV2ProductVO cartSplitV2ProductVO = (CartSplitV2ProductVO) getBoundData();
        if (cartSplitV2ProductVO == null || (checkbox = cartSplitV2ProductVO.getCheckbox()) == null || (action = checkbox.getAction()) == null) {
            return;
        }
        if (!(action instanceof AtomAction.Refresh)) {
            this.actionHandler.invoke(action);
            return;
        }
        AtomAction.Refresh refresh = (AtomAction.Refresh) action;
        refreshWithScroll(refresh, cartSplitV2ProductVO.getScrollWidgetKey().intValue());
        Map<String, TokenizedTrackingInfo> trackingInfo = refresh.getTrackingInfo();
        if (trackingInfo != null) {
            Long valueOf = Long.valueOf(cartSplitV2ProductVO.getId());
            Intrinsics.checkNotNullParameter(trackingInfo, "<this>");
            t b11 = x.b(trackingInfo, valueOf, null);
            if (b11 != null) {
                TokenizedAnalyticsExtensionsKt.processClickEvents$default(this.tokenizedAnalytics, b11, null, 2, null);
            }
        }
    }

    private final void refreshWithScroll(AtomAction.Refresh action, int scrollWidgetKey) {
        InterfaceC7851b.a.a(this.composerReferences.getController(), action.getLink(), null, null, new h.b(new a.C.d(scrollWidgetKey, (int) this.view.getY(), 28, false), null, 2), 6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit steps$lambda$0(CartSplitV2ProductWidgetViewHolder cartSplitV2ProductWidgetViewHolder) {
        cartSplitV2ProductWidgetViewHolder.bindProduct();
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit steps$lambda$1(CartSplitV2ProductWidgetViewHolder cartSplitV2ProductWidgetViewHolder) {
        cartSplitV2ProductWidgetViewHolder.bindBottomDynamicElement();
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit steps$lambda$2(CartSplitV2ProductWidgetViewHolder cartSplitV2ProductWidgetViewHolder) {
        cartSplitV2ProductWidgetViewHolder.bindSwipeContainer();
        return Unit.f71690a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateAsyncLocking(boolean inProgress) {
        CartSplitV2ProductVO cartSplitV2ProductVO;
        SwipeInfoVO swipeInfo;
        if (!this.asyncCartViewModel.isEnabled() || (cartSplitV2ProductVO = (CartSplitV2ProductVO) getBoundData()) == null || (swipeInfo = cartSplitV2ProductVO.getSwipeInfo()) == null) {
            return;
        }
        this.containerView.setSwipeData(lockWhileAsync(swipeInfo, Boolean.valueOf(inProgress)));
    }

    @Override // ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.delegate.FavoriteProductV4Delegate
    public void attachFavButtonView(@NotNull ProductFavoriteMoleculeV4ButtonView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.favoriteProductV4Delegate.attachFavButtonView(view);
    }

    @Override // ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.delegate.FavoriteProductV4Delegate
    public void bindFavoriteProductButton(@NotNull ProductFavoriteMoleculeV4ButtonView view, FavoriteProductModel molecule, @NotNull AnalyticData analyticData) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(analyticData, "analyticData");
        this.favoriteProductV4Delegate.bindFavoriteProductButton(view, molecule, analyticData);
    }

    @Override // ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.delegate.FavoriteProductV4Delegate
    public void detachFavButtonView() {
        this.favoriteProductV4Delegate.detachFavButtonView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.holder.SwipeableViewHolder
    public void ensureSwipeMenuInitialized() {
        SwipeInfoVO swipeInfo;
        this.containerView.ensureSwipeMenuInitialized();
        if (this.isFavButtonBind) {
            return;
        }
        SwipeFavoriteButtonView favButton = this.containerView.getFavButton();
        CartSplitV2ProductVO cartSplitV2ProductVO = (CartSplitV2ProductVO) getBoundData();
        bindFavoriteProductButton(favButton, (cartSplitV2ProductVO == null || (swipeInfo = cartSplitV2ProductVO.getSwipeInfo()) == null) ? null : swipeInfo.getFavMolecule(), new AnalyticData(getTrackingData(), getViewItem()));
        this.isFavButtonBind = true;
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
        CartSplitV2ProductVO cartSplitV2ProductVO = (CartSplitV2ProductVO) getBoundData();
        if (cartSplitV2ProductVO == null || (swipeInfo = cartSplitV2ProductVO.getSwipeInfo()) == null) {
            return null;
        }
        return swipeInfo.getGroupSwipeId();
    }

    @Override // ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.BaseMultiFrameBindingViewHolder, ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        this.swipeGroupCoordinator.registerViewHolder(this);
        this.productBinder.onAttach();
        attachFavButtonView(this.containerView.getFavButton());
        observeSwipeFavButton();
        C2399j.C(new C2408n0(this.asyncCartViewModel.isProcessing(), new CartSplitV2ProductWidgetViewHolder$onAttach$1(this)), K.a(this));
    }

    @Override // ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.BaseMultiFrameBindingViewHolder, ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        this.swipeGroupCoordinator.unregisterViewHolder(this);
        super.onDetach();
        this.productBinder.onDetach();
        detachFavButtonView();
        B0 b02 = this.swipeFavJob;
        if (b02 != null) {
            b02.j(null);
        }
    }

    @Override // ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.BaseMultiFrameBindingViewHolder, jk0.j
    public void onRecycle() {
        this.swipeGroupCoordinator.closeAllGroups(false);
        this.containerView.resetSwipeMenuState();
        this.isFavButtonBind = false;
        super.onRecycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.holder.SwipeableViewHolder
    public void onSwipeStateChanged(boolean isOpen) {
        SwipeInfoVO swipeInfo;
        if (isOpen) {
            l lVar = this.tokenizedAnalytics;
            CartSplitV2ProductVO cartSplitV2ProductVO = (CartSplitV2ProductVO) getBoundData();
            SwipeAnalyticsExtKt.processEventsSwipeView$default(lVar, (cartSplitV2ProductVO == null || (swipeInfo = cartSplitV2ProductVO.getSwipeInfo()) == null) ? null : swipeInfo.getTokenizedEvent(), null, 2, null);
        }
    }

    @Override // ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.holder.SwipeableViewHolder
    public void updateSwipeOffset(float offset, boolean animate) {
        this.containerView.updateSwipeOffset(offset);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.BaseMultiFrameBindingViewHolder, ru.ozon.composer.ui.widget.k
    public void bind(@NotNull CartSplitV2ProductVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.productBinder.loadProductImage(item.getProduct().getMedia());
        super.bind((CartSplitV2ProductWidgetViewHolder) item, info);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull CartSplitV2ProductVO item, @NotNull c trackingData, f viewedPond) {
        ProductVOV2 product;
        t trackingInfo;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((CartSplitV2ProductWidgetViewHolder) item, trackingData, viewedPond);
        CartSplitV2ProductVO cartSplitV2ProductVO = (CartSplitV2ProductVO) getBoundData();
        if (cartSplitV2ProductVO == null || (product = cartSplitV2ProductVO.getProduct()) == null || (trackingInfo = product.getTrackingInfo()) == null) {
            return;
        }
        m.c(this.tokenizedAnalytics, trackingInfo, null);
    }
}
