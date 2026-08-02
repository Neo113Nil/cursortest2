package ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.accessories;

import Ae.C2399j;
import Ae.C2406m0;
import Ae.C2408n0;
import N.RunnableC3647e;
import Sc.InterfaceC4008j;
import Sc.o;
import WZ.t;
import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import jk0.l;
import jk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.cart.cartSplitV2.StartSnapHelper;
import ru.ozon.app.android.cart.cartSplitV2.accessories.AccessoriesAsyncState;
import ru.ozon.app.android.cart.cartSplitV2.accessories.AccessoriesAsyncStateKt;
import ru.ozon.app.android.cart.cartSplitV2.accessories.AccessoriesItemDecoration;
import ru.ozon.app.android.cart.cartSplitV2.accessories.AccessoriesSkeletonAdapter;
import ru.ozon.app.android.cart.cartSplitV2.accessories.AccessoriesSkeletonAdapterKt;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.accessories.vm.AccessoriesViewModelV2;
import ru.ozon.app.android.cart.common.presentation.addToCart.AddToCartViewModel;
import ru.ozon.app.android.cart.feature.databinding.WidgetCartSplitV2ItemAccessoriesBinding;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.product.skuthinscroll.data.SkuThinScrollHeaderDTO;
import ru.ozon.app.android.product.skuthinscroll.presentation.SkuThinItemsAdapter;
import ru.ozon.app.android.product.skuthinscroll.presentation.SkuThinScrollOffsetItemsDecorator;
import ru.ozon.app.android.product.skuthinscroll.presentation.SkuThinScrollVO;
import ru.ozon.app.android.product.skuthinscroll.presentation.vh.SkuThinScrollItemViewHolder;
import ru.ozon.app.android.uikit.view.shimmer.ShimmerFrameLayout;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import xe.B0;

@Metadata(d1 = {"\u0000\u0093\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004*\u00014\b\u0001\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001c\u0010\u0015J\u000f\u0010\u001d\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001d\u0010\u0015J\u000f\u0010\u001e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001e\u0010\u0015J\u0011\u0010\u001f\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\u00020\n2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010+R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00101\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00103\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00102R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u00108\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010:\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u001b\u0010A\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001b\u0010F\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010>\u001a\u0004\bD\u0010ER\u0018\u0010G\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010J\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010O\u001a\u00020L8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bM\u0010N¨\u0006P"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/accessories/CartSplitV2AccessoriesViewRender;", "", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/cart/feature/databinding/WidgetCartSplitV2ItemAccessoriesBinding;", "binding", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/accessories/CartSplitV2AccessoriesWidgetViewHolder;", "cartSplitV2AccessoriesWidgetViewHolder", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lru/ozon/app/android/cart/common/presentation/addToCart/AddToCartViewModel;", "addToCartViewModel", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/accessories/vm/AccessoriesViewModelV2;", "accessoriesViewModel", "Landroidx/lifecycle/J;", "lifecycleOwner", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/cart/feature/databinding/WidgetCartSplitV2ItemAccessoriesBinding;Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/accessories/CartSplitV2AccessoriesWidgetViewHolder;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/cart/common/presentation/addToCart/AddToCartViewModel;Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/accessories/vm/AccessoriesViewModelV2;Landroidx/lifecycle/J;)V", "updateRenderJob", "()V", "trackViewAccessoriesItem", "updateCompletelyVisible", "Lru/ozon/app/android/cart/cartSplitV2/accessories/AccessoriesAsyncState;", "state", "renderState", "(Lru/ozon/app/android/cart/cartSplitV2/accessories/AccessoriesAsyncState;)V", "trackViewAccessories", "startShimmer", "stopShimmer", "saveScrollState", "()Lkotlin/Unit;", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/accessories/CartSplitV2AccessoriesVO;", "item", "bind", "(Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/accessories/CartSplitV2AccessoriesVO;)V", "Ljk0/q;", "info", "onVisibleAreaChanged", "(Ljk0/q;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/cart/feature/databinding/WidgetCartSplitV2ItemAccessoriesBinding;", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/accessories/CartSplitV2AccessoriesWidgetViewHolder;", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/accessories/vm/AccessoriesViewModelV2;", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "boundGetAccessoriesAction", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "", "isVerticalCompletelyVisible", "Z", "isHorizontalListenerAdded", "ru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/accessories/CartSplitV2AccessoriesViewRender$horizontalScrollListener$1", "horizontalScrollListener", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/accessories/CartSplitV2AccessoriesViewRender$horizontalScrollListener$1;", "Lxe/B0;", "renderJob", "Lxe/B0;", "currentState", "Lru/ozon/app/android/cart/cartSplitV2/accessories/AccessoriesAsyncState;", "Lru/ozon/app/android/cart/cartSplitV2/accessories/AccessoriesSkeletonAdapter;", "skeletonAdapter$delegate", "LSc/j;", "getSkeletonAdapter", "()Lru/ozon/app/android/cart/cartSplitV2/accessories/AccessoriesSkeletonAdapter;", "skeletonAdapter", "Lru/ozon/app/android/product/skuthinscroll/presentation/SkuThinItemsAdapter;", "skuThinScrollAdapter$delegate", "getSkuThinScrollAdapter", "()Lru/ozon/app/android/product/skuthinscroll/presentation/SkuThinItemsAdapter;", "skuThinScrollAdapter", "viewHolderPositionInfo", "Ljk0/q;", "Landroid/graphics/Rect;", "viewVisibleRect", "Landroid/graphics/Rect;", "", "getWidgetId", "()J", "widgetId", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CartSplitV2AccessoriesViewRender {

    @NotNull
    private final AccessoriesViewModelV2 accessoriesViewModel;

    @NotNull
    private final WidgetCartSplitV2ItemAccessoriesBinding binding;
    private AtomAction.ComposerAction boundGetAccessoriesAction;

    @NotNull
    private final CartSplitV2AccessoriesWidgetViewHolder cartSplitV2AccessoriesWidgetViewHolder;
    private AccessoriesAsyncState currentState;

    @NotNull
    private final CartSplitV2AccessoriesViewRender$horizontalScrollListener$1 horizontalScrollListener;
    private boolean isHorizontalListenerAdded;
    private boolean isVerticalCompletelyVisible;

    @NotNull
    private final ComposerReferences refs;
    private B0 renderJob;

    /* renamed from: skeletonAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j skeletonAdapter;

    /* renamed from: skuThinScrollAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j skuThinScrollAdapter;
    private q viewHolderPositionInfo;

    @NotNull
    private final Rect viewVisibleRect;

    /* JADX WARN: Type inference failed for: r2v1, types: [ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.accessories.CartSplitV2AccessoriesViewRender$horizontalScrollListener$1] */
    public CartSplitV2AccessoriesViewRender(@NotNull ComposerReferences refs, @NotNull WidgetCartSplitV2ItemAccessoriesBinding binding, @NotNull CartSplitV2AccessoriesWidgetViewHolder cartSplitV2AccessoriesWidgetViewHolder, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull AddToCartViewModel addToCartViewModel, @NotNull AccessoriesViewModelV2 accessoriesViewModel, @NotNull J lifecycleOwner) {
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(cartSplitV2AccessoriesWidgetViewHolder, "cartSplitV2AccessoriesWidgetViewHolder");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(addToCartViewModel, "addToCartViewModel");
        Intrinsics.checkNotNullParameter(accessoriesViewModel, "accessoriesViewModel");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.refs = refs;
        this.binding = binding;
        this.cartSplitV2AccessoriesWidgetViewHolder = cartSplitV2AccessoriesWidgetViewHolder;
        this.accessoriesViewModel = accessoriesViewModel;
        this.horizontalScrollListener = new RecyclerView.t() { // from class: ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.accessories.CartSplitV2AccessoriesViewRender$horizontalScrollListener$1
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (newState == 0) {
                    CartSplitV2AccessoriesViewRender.this.saveScrollState();
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                CartSplitV2AccessoriesViewRender.this.trackViewAccessoriesItem();
            }
        };
        this.skeletonAdapter = LazyUtilsKt.unsafeLazy(new CartSplitV2AccessoriesViewRender$skeletonAdapter$2(this));
        this.skuThinScrollAdapter = LazyUtilsKt.unsafeLazy(new CartSplitV2AccessoriesViewRender$skuThinScrollAdapter$2(actionHandler, addToCartViewModel, this, lifecycleOwner));
        this.viewVisibleRect = new Rect();
        new StartSnapHelper().attachToRecyclerView(binding.itemsRv);
        RecyclerView recyclerView = binding.itemsRv;
        Context context = binding.getConstraintLayout().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerView.addItemDecoration(new AccessoriesItemDecoration(context));
        View view = binding.headerSkeleton;
        Context context2 = binding.getConstraintLayout().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        view.setBackground(AccessoriesSkeletonAdapterKt.createFillSkeletonBackground(context2, UiExtKt.toPxF(8)));
    }

    private final AccessoriesSkeletonAdapter getSkeletonAdapter() {
        return (AccessoriesSkeletonAdapter) this.skeletonAdapter.getValue();
    }

    private final SkuThinItemsAdapter getSkuThinScrollAdapter() {
        return (SkuThinItemsAdapter) this.skuThinScrollAdapter.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long getWidgetId() {
        CartSplitV2AccessoriesVO cartSplitV2AccessoriesVO = (CartSplitV2AccessoriesVO) this.cartSplitV2AccessoriesWidgetViewHolder.getBoundData();
        if (cartSplitV2AccessoriesVO != null) {
            return cartSplitV2AccessoriesVO.getId();
        }
        return 0L;
    }

    private final void renderState(AccessoriesAsyncState state) {
        if (state instanceof AccessoriesAsyncState.Hided) {
            this.refs.getController().m(getWidgetId());
            stopShimmer();
        } else if (Intrinsics.d(state, AccessoriesAsyncState.Loading.INSTANCE)) {
            WidgetCartSplitV2ItemAccessoriesBinding widgetCartSplitV2ItemAccessoriesBinding = this.binding;
            startShimmer();
            if (widgetCartSplitV2ItemAccessoriesBinding.itemsRv.getAdapter() != getSkeletonAdapter()) {
                widgetCartSplitV2ItemAccessoriesBinding.itemsRv.swapAdapter(getSkeletonAdapter(), true);
            }
        } else {
            if (!(state instanceof AccessoriesAsyncState.Success)) {
                throw new o();
            }
            WidgetCartSplitV2ItemAccessoriesBinding widgetCartSplitV2ItemAccessoriesBinding2 = this.binding;
            stopShimmer();
            TextAtomV2View headerTav = widgetCartSplitV2ItemAccessoriesBinding2.headerTav;
            Intrinsics.checkNotNullExpressionValue(headerTav, "headerTav");
            AccessoriesAsyncState.Success success = (AccessoriesAsyncState.Success) state;
            SkuThinScrollHeaderDTO header = success.getShelf().getHeader();
            TextHolderKt.bindOrGone$default(headerTav, header != null ? header.getText() : null, null, 2, null);
            getSkuThinScrollAdapter().submitList(success.getShelf().getItems(), new RunnableC3647e(widgetCartSplitV2ItemAccessoriesBinding2, this, (AccessoriesAsyncState.Success) state, 1));
        }
        updateCompletelyVisible();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderState$lambda$9$lambda$8(WidgetCartSplitV2ItemAccessoriesBinding widgetCartSplitV2ItemAccessoriesBinding, CartSplitV2AccessoriesViewRender cartSplitV2AccessoriesViewRender, AccessoriesAsyncState accessoriesAsyncState) {
        RecyclerView.o layoutManager;
        if (widgetCartSplitV2ItemAccessoriesBinding.itemsRv.getAdapter() != cartSplitV2AccessoriesViewRender.getSkuThinScrollAdapter()) {
            widgetCartSplitV2ItemAccessoriesBinding.itemsRv.swapAdapter(cartSplitV2AccessoriesViewRender.getSkuThinScrollAdapter(), true);
            widgetCartSplitV2ItemAccessoriesBinding.itemsRv.addItemDecoration(new SkuThinScrollOffsetItemsDecorator());
        }
        AccessoriesAsyncState.Success success = (AccessoriesAsyncState.Success) accessoriesAsyncState;
        if (success.getScrollState() == null || (layoutManager = widgetCartSplitV2ItemAccessoriesBinding.itemsRv.getLayoutManager()) == null) {
            return;
        }
        layoutManager.onRestoreInstanceState(success.getScrollState());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Unit saveScrollState() {
        RecyclerView.o layoutManager;
        Parcelable onSaveInstanceState;
        WidgetCartSplitV2ItemAccessoriesBinding widgetCartSplitV2ItemAccessoriesBinding = this.binding;
        AtomAction.ComposerAction composerAction = this.boundGetAccessoriesAction;
        if (composerAction == null || (layoutManager = widgetCartSplitV2ItemAccessoriesBinding.itemsRv.getLayoutManager()) == null || (onSaveInstanceState = layoutManager.onSaveInstanceState()) == null) {
            return null;
        }
        this.accessoriesViewModel.saveScrollState(composerAction, onSaveInstanceState);
        return Unit.f71690a;
    }

    private final void startShimmer() {
        WidgetCartSplitV2ItemAccessoriesBinding widgetCartSplitV2ItemAccessoriesBinding = this.binding;
        if (widgetCartSplitV2ItemAccessoriesBinding.shimmerView.getVisibility() != 0) {
            ShimmerFrameLayout shimmerView = widgetCartSplitV2ItemAccessoriesBinding.shimmerView;
            Intrinsics.checkNotNullExpressionValue(shimmerView, "shimmerView");
            ViewExtKt.show(shimmerView);
            widgetCartSplitV2ItemAccessoriesBinding.shimmerView.showShimmer(true);
            View headerSkeleton = widgetCartSplitV2ItemAccessoriesBinding.headerSkeleton;
            Intrinsics.checkNotNullExpressionValue(headerSkeleton, "headerSkeleton");
            ViewExtKt.show(headerSkeleton);
            TextAtomV2View headerTav = widgetCartSplitV2ItemAccessoriesBinding.headerTav;
            Intrinsics.checkNotNullExpressionValue(headerTav, "headerTav");
            ViewExtKt.hide(headerTav);
        }
    }

    private final void stopShimmer() {
        WidgetCartSplitV2ItemAccessoriesBinding widgetCartSplitV2ItemAccessoriesBinding = this.binding;
        if (widgetCartSplitV2ItemAccessoriesBinding.shimmerView.getVisibility() == 0) {
            widgetCartSplitV2ItemAccessoriesBinding.shimmerView.hideShimmer();
            ShimmerFrameLayout shimmerView = widgetCartSplitV2ItemAccessoriesBinding.shimmerView;
            Intrinsics.checkNotNullExpressionValue(shimmerView, "shimmerView");
            ViewExtKt.hide(shimmerView);
            View headerSkeleton = widgetCartSplitV2ItemAccessoriesBinding.headerSkeleton;
            Intrinsics.checkNotNullExpressionValue(headerSkeleton, "headerSkeleton");
            ViewExtKt.hide(headerSkeleton);
            TextAtomV2View headerTav = widgetCartSplitV2ItemAccessoriesBinding.headerTav;
            Intrinsics.checkNotNullExpressionValue(headerTav, "headerTav");
            ViewExtKt.show(headerTav);
        }
    }

    private final void trackViewAccessories() {
        t shelfTokenizedEvent = AccessoriesAsyncStateKt.getShelfTokenizedEvent(this.currentState);
        if (shelfTokenizedEvent != null && this.isVerticalCompletelyVisible && this.accessoriesViewModel.validateTrackViewWidget(getWidgetId())) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.refs.getTokenizedAnalytics(), shelfTokenizedEvent, null, 2, null);
        }
        trackViewAccessoriesItem();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackViewAccessoriesItem() {
        int intValue;
        SkuThinScrollVO.ItemVO boundItem;
        t tokenizedEvent;
        if (!this.isVerticalCompletelyVisible) {
            return;
        }
        RecyclerView.o layoutManager = this.binding.itemsRv.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        if (!AccessoriesAsyncStateKt.isShelfNotEmpty(this.currentState)) {
            linearLayoutManager = null;
        }
        if (linearLayoutManager == null) {
            return;
        }
        Integer valueOf = Integer.valueOf(linearLayoutManager.findFirstVisibleItemPosition());
        if (valueOf.intValue() == -1) {
            valueOf = null;
        }
        if (valueOf == null) {
            return;
        }
        int intValue2 = valueOf.intValue();
        Integer valueOf2 = Integer.valueOf(linearLayoutManager.findLastVisibleItemPosition());
        if (valueOf2.intValue() == -1) {
            valueOf2 = null;
        }
        if (valueOf2 == null || intValue2 > (intValue = valueOf2.intValue())) {
            return;
        }
        while (true) {
            RecyclerView.C findViewHolderForLayoutPosition = this.binding.itemsRv.findViewHolderForLayoutPosition(intValue2);
            SkuThinScrollItemViewHolder skuThinScrollItemViewHolder = findViewHolderForLayoutPosition instanceof SkuThinScrollItemViewHolder ? (SkuThinScrollItemViewHolder) findViewHolderForLayoutPosition : null;
            if (skuThinScrollItemViewHolder != null && (boundItem = skuThinScrollItemViewHolder.getBoundItem()) != null) {
                View itemView = skuThinScrollItemViewHolder.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                if (itemView.getX() >= 0.0f && itemView.getX() + itemView.getWidth() <= this.binding.itemsRv.getWidth() && (tokenizedEvent = boundItem.getTokenizedEvent()) != null) {
                    if (!this.accessoriesViewModel.validateTrackViewItem(boundItem)) {
                        tokenizedEvent = null;
                    }
                    if (tokenizedEvent != null) {
                        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.refs.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
                    }
                }
            }
            if (intValue2 == intValue) {
                return;
            } else {
                intValue2++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0050, code lost:
    
        if (jk0.o.b(r0, r1, r5.viewVisibleRect, true) >= 1.0f) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0030, code lost:
    
        if (jk0.o.a(r1, r0, true) > 0.0f) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0052, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void updateCompletelyVisible() {
        boolean z11;
        q qVar = this.viewHolderPositionInfo;
        if (qVar == null) {
            return;
        }
        if (AccessoriesAsyncStateKt.isExistTokenizedEvent(this.currentState)) {
            AccessoriesAsyncState accessoriesAsyncState = this.currentState;
            if (accessoriesAsyncState instanceof AccessoriesAsyncState.Hided) {
                View rootView = this.cartSplitV2AccessoriesWidgetViewHolder.itemView;
                Intrinsics.checkNotNullExpressionValue(rootView, "itemView");
                Intrinsics.checkNotNullParameter(qVar, "<this>");
                Intrinsics.checkNotNullParameter(rootView, "rootView");
            } else if (accessoriesAsyncState instanceof AccessoriesAsyncState.Success) {
                l a11 = qVar.a();
                ConstraintLayout constraintLayout = this.binding.getConstraintLayout();
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
            }
            this.isVerticalCompletelyVisible = z11;
            if (z11) {
                trackViewAccessories();
            }
            if (this.isVerticalCompletelyVisible || !AccessoriesAsyncStateKt.isShelfNotEmpty(this.currentState)) {
                if (this.isHorizontalListenerAdded) {
                    return;
                }
                this.isHorizontalListenerAdded = false;
                this.binding.itemsRv.removeOnScrollListener(this.horizontalScrollListener);
                return;
            }
            if (this.isHorizontalListenerAdded) {
                return;
            }
            this.isHorizontalListenerAdded = true;
            this.binding.itemsRv.addOnScrollListener(this.horizontalScrollListener);
            return;
        }
        z11 = false;
        this.isVerticalCompletelyVisible = z11;
        if (z11) {
        }
        if (this.isVerticalCompletelyVisible) {
        }
        if (this.isHorizontalListenerAdded) {
        }
    }

    private final void updateRenderJob() {
        B0 b02 = this.renderJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.renderJob = C2399j.C(new C2408n0(new C2406m0(new C2408n0(this.accessoriesViewModel.getState$cart_prodGoogleAllVendorsRelease(this.boundGetAccessoriesAction, getWidgetId()), new CartSplitV2AccessoriesViewRender$updateRenderJob$1(this, null))), new CartSplitV2AccessoriesViewRender$updateRenderJob$2(this)), K.a(this.cartSplitV2AccessoriesWidgetViewHolder));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object updateRenderJob$renderState(CartSplitV2AccessoriesViewRender cartSplitV2AccessoriesViewRender, AccessoriesAsyncState accessoriesAsyncState, d dVar) {
        cartSplitV2AccessoriesViewRender.renderState(accessoriesAsyncState);
        return Unit.f71690a;
    }

    public final void bind(@NotNull CartSplitV2AccessoriesVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        AtomAction getAccessoriesAction = item.getGetAccessoriesAction();
        AtomAction.ComposerAction composerAction = getAccessoriesAction instanceof AtomAction.ComposerAction ? (AtomAction.ComposerAction) getAccessoriesAction : null;
        this.boundGetAccessoriesAction = composerAction;
        if (composerAction == null) {
            this.refs.getController().m(getWidgetId());
        }
        updateRenderJob();
    }

    public final void onVisibleAreaChanged(@NotNull q info) {
        Intrinsics.checkNotNullParameter(info, "info");
        this.viewHolderPositionInfo = info;
        updateCompletelyVisible();
    }
}
