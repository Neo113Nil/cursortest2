package ru.ozon.app.android.cart.cartSplitV2.v1.presentation.item.accessories;

import Ae.C2399j;
import Ae.C2406m0;
import Ae.C2408n0;
import Sc.InterfaceC4008j;
import Sc.o;
import WZ.t;
import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.C5423j;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.lifecycle.T;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.appsflyer.internal.b;
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
import ru.ozon.app.android.cart.cartSplitV2.v1.presentation.item.CartSplitV2ItemVO;
import ru.ozon.app.android.cart.cartSplitV2.v1.presentation.item.CartSplitV2ItemWidgetViewHolder;
import ru.ozon.app.android.cart.common.presentation.addToCart.AddToCartViewModel;
import ru.ozon.app.android.cart.common.product.ProductVO;
import ru.ozon.app.android.cart.feature.databinding.WidgetCartSplitV2ItemAccessoriesBinding;
import ru.ozon.app.android.cart.feature.databinding.WidgetCartSplitV2ItemBinding;
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

@Metadata(d1 = {"\u0000\u009b\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004*\u00019\b\u0001\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001c\u0010\u0015J\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0011\u0010 \u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b \u0010!J\u0011\u0010\"\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\"\u0010!J\u0011\u0010#\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b#\u0010!J\u0015\u0010&\u001a\u00020\n2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\n¢\u0006\u0004\b(\u0010\u0015J\u0015\u0010+\u001a\u00020\n2\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\n¢\u0006\u0004\b-\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010.R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010/R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00100R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00101R\u0018\u00103\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00106\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00108\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00107R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010=\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010?\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010A\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u001b\u0010H\u001a\u00020C8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u001b\u0010M\u001a\u00020I8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010E\u001a\u0004\bK\u0010LR\u0018\u0010N\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010Q\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010V\u001a\u00020S8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bT\u0010U¨\u0006W"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/item/accessories/AccessoriesViewRender;", "", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/cart/feature/databinding/WidgetCartSplitV2ItemBinding;", "cartSplitBinding", "Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/item/CartSplitV2ItemWidgetViewHolder;", "cartSplitV2ItemWidgetViewHolder", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lru/ozon/app/android/cart/common/presentation/addToCart/AddToCartViewModel;", "addToCartViewModel", "Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/item/accessories/AccessoriesViewModel;", "accessoriesViewModel", "Landroidx/lifecycle/J;", "lifecycleOwner", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/cart/feature/databinding/WidgetCartSplitV2ItemBinding;Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/item/CartSplitV2ItemWidgetViewHolder;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/cart/common/presentation/addToCart/AddToCartViewModel;Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/item/accessories/AccessoriesViewModel;Landroidx/lifecycle/J;)V", "updateRenderJob", "()V", "trackViewAccessoriesItem", "updateCompletelyVisible", "Lru/ozon/app/android/cart/cartSplitV2/accessories/AccessoriesAsyncState;", "state", "renderState", "(Lru/ozon/app/android/cart/cartSplitV2/accessories/AccessoriesAsyncState;)V", "trackViewAccessories", "Lru/ozon/app/android/cart/feature/databinding/WidgetCartSplitV2ItemAccessoriesBinding;", "getAccessoriesViewBinding", "()Lru/ozon/app/android/cart/feature/databinding/WidgetCartSplitV2ItemAccessoriesBinding;", "startShimmer", "()Lkotlin/Unit;", "stopShimmer", "saveScrollState", "Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/item/CartSplitV2ItemVO;", "item", "bind", "(Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/item/CartSplitV2ItemVO;)V", "onAttach", "Ljk0/q;", "info", "onVisibleAreaChanged", "(Ljk0/q;)V", "onDetach", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/cart/feature/databinding/WidgetCartSplitV2ItemBinding;", "Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/item/CartSplitV2ItemWidgetViewHolder;", "Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/item/accessories/AccessoriesViewModel;", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "boundGetAccessoriesAction", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "", "isVerticalCompletelyVisible", "Z", "isHorizontalListenerAdded", "ru/ozon/app/android/cart/cartSplitV2/v1/presentation/item/accessories/AccessoriesViewRender$horizontalScrollListener$1", "horizontalScrollListener", "Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/item/accessories/AccessoriesViewRender$horizontalScrollListener$1;", "Lxe/B0;", "renderJob", "Lxe/B0;", "binding", "Lru/ozon/app/android/cart/feature/databinding/WidgetCartSplitV2ItemAccessoriesBinding;", "currentState", "Lru/ozon/app/android/cart/cartSplitV2/accessories/AccessoriesAsyncState;", "Lru/ozon/app/android/cart/cartSplitV2/accessories/AccessoriesSkeletonAdapter;", "skeletonAdapter$delegate", "LSc/j;", "getSkeletonAdapter", "()Lru/ozon/app/android/cart/cartSplitV2/accessories/AccessoriesSkeletonAdapter;", "skeletonAdapter", "Lru/ozon/app/android/product/skuthinscroll/presentation/SkuThinItemsAdapter;", "skuThinScrollAdapter$delegate", "getSkuThinScrollAdapter", "()Lru/ozon/app/android/product/skuthinscroll/presentation/SkuThinItemsAdapter;", "skuThinScrollAdapter", "viewHolderPositionInfo", "Ljk0/q;", "Landroid/graphics/Rect;", "viewVisibleRect", "Landroid/graphics/Rect;", "", "getWidgetId", "()J", "widgetId", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AccessoriesViewRender {

    @NotNull
    private final AccessoriesViewModel accessoriesViewModel;
    private WidgetCartSplitV2ItemAccessoriesBinding binding;
    private AtomAction.ComposerAction boundGetAccessoriesAction;

    @NotNull
    private final WidgetCartSplitV2ItemBinding cartSplitBinding;

    @NotNull
    private final CartSplitV2ItemWidgetViewHolder cartSplitV2ItemWidgetViewHolder;
    private AccessoriesAsyncState currentState;

    @NotNull
    private final AccessoriesViewRender$horizontalScrollListener$1 horizontalScrollListener;
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

    /* JADX WARN: Type inference failed for: r2v1, types: [ru.ozon.app.android.cart.cartSplitV2.v1.presentation.item.accessories.AccessoriesViewRender$horizontalScrollListener$1] */
    public AccessoriesViewRender(@NotNull ComposerReferences refs, @NotNull WidgetCartSplitV2ItemBinding cartSplitBinding, @NotNull CartSplitV2ItemWidgetViewHolder cartSplitV2ItemWidgetViewHolder, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull AddToCartViewModel addToCartViewModel, @NotNull AccessoriesViewModel accessoriesViewModel, @NotNull J lifecycleOwner) {
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(cartSplitBinding, "cartSplitBinding");
        Intrinsics.checkNotNullParameter(cartSplitV2ItemWidgetViewHolder, "cartSplitV2ItemWidgetViewHolder");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(addToCartViewModel, "addToCartViewModel");
        Intrinsics.checkNotNullParameter(accessoriesViewModel, "accessoriesViewModel");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.refs = refs;
        this.cartSplitBinding = cartSplitBinding;
        this.cartSplitV2ItemWidgetViewHolder = cartSplitV2ItemWidgetViewHolder;
        this.accessoriesViewModel = accessoriesViewModel;
        this.horizontalScrollListener = new RecyclerView.t() { // from class: ru.ozon.app.android.cart.cartSplitV2.v1.presentation.item.accessories.AccessoriesViewRender$horizontalScrollListener$1
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (newState == 0) {
                    AccessoriesViewRender.this.saveScrollState();
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                AccessoriesViewRender.this.trackViewAccessoriesItem();
            }
        };
        this.skeletonAdapter = LazyUtilsKt.unsafeLazy(new AccessoriesViewRender$skeletonAdapter$2(this));
        this.skuThinScrollAdapter = LazyUtilsKt.unsafeLazy(new AccessoriesViewRender$skuThinScrollAdapter$2(actionHandler, addToCartViewModel, this, lifecycleOwner));
        this.viewVisibleRect = new Rect();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WidgetCartSplitV2ItemAccessoriesBinding getAccessoriesViewBinding() {
        WidgetCartSplitV2ItemAccessoriesBinding widgetCartSplitV2ItemAccessoriesBinding = this.binding;
        if (widgetCartSplitV2ItemAccessoriesBinding != null) {
            return widgetCartSplitV2ItemAccessoriesBinding;
        }
        WidgetCartSplitV2ItemAccessoriesBinding bind = WidgetCartSplitV2ItemAccessoriesBinding.bind(this.cartSplitBinding.accessoriesViewStub.inflate());
        new StartSnapHelper().attachToRecyclerView(bind.itemsRv);
        RecyclerView recyclerView = bind.itemsRv;
        Context context = bind.getConstraintLayout().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerView.addItemDecoration(new AccessoriesItemDecoration(context));
        View view = bind.headerSkeleton;
        Context context2 = bind.getConstraintLayout().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        view.setBackground(AccessoriesSkeletonAdapterKt.createFillSkeletonBackground(context2, UiExtKt.toPxF(8)));
        this.binding = bind;
        Intrinsics.checkNotNullExpressionValue(bind, "run(...)");
        return bind;
    }

    private final AccessoriesSkeletonAdapter getSkeletonAdapter() {
        return (AccessoriesSkeletonAdapter) this.skeletonAdapter.getValue();
    }

    private final SkuThinItemsAdapter getSkuThinScrollAdapter() {
        return (SkuThinItemsAdapter) this.skuThinScrollAdapter.getValue();
    }

    private final long getWidgetId() {
        CartSplitV2ItemVO boundedData = this.cartSplitV2ItemWidgetViewHolder.getBoundedData();
        if (boundedData != null) {
            return boundedData.getId();
        }
        return 0L;
    }

    private final void renderState(AccessoriesAsyncState state) {
        ConstraintLayout constraintLayout;
        WidgetCartSplitV2ItemAccessoriesBinding widgetCartSplitV2ItemAccessoriesBinding = this.binding;
        if (widgetCartSplitV2ItemAccessoriesBinding != null && (constraintLayout = widgetCartSplitV2ItemAccessoriesBinding.getConstraintLayout()) != null) {
            constraintLayout.setVisibility(!(state instanceof AccessoriesAsyncState.Hided) ? 0 : 8);
        }
        if (state instanceof AccessoriesAsyncState.Hided) {
            stopShimmer();
        } else if (Intrinsics.d(state, AccessoriesAsyncState.Loading.INSTANCE)) {
            WidgetCartSplitV2ItemAccessoriesBinding accessoriesViewBinding = getAccessoriesViewBinding();
            startShimmer();
            if (accessoriesViewBinding.itemsRv.getAdapter() != getSkeletonAdapter()) {
                accessoriesViewBinding.itemsRv.swapAdapter(getSkeletonAdapter(), true);
            }
        } else {
            if (!(state instanceof AccessoriesAsyncState.Success)) {
                throw new o();
            }
            WidgetCartSplitV2ItemAccessoriesBinding accessoriesViewBinding2 = getAccessoriesViewBinding();
            stopShimmer();
            TextAtomV2View headerTav = accessoriesViewBinding2.headerTav;
            Intrinsics.checkNotNullExpressionValue(headerTav, "headerTav");
            AccessoriesAsyncState.Success success = (AccessoriesAsyncState.Success) state;
            SkuThinScrollHeaderDTO header = success.getShelf().getHeader();
            TextHolderKt.bindOrGone$default(headerTav, header != null ? header.getText() : null, null, 2, null);
            getSkuThinScrollAdapter().submitList(success.getShelf().getItems(), new b(accessoriesViewBinding2, this, (AccessoriesAsyncState.Success) state, 1));
        }
        updateCompletelyVisible();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderState$lambda$10$lambda$9(WidgetCartSplitV2ItemAccessoriesBinding widgetCartSplitV2ItemAccessoriesBinding, AccessoriesViewRender accessoriesViewRender, AccessoriesAsyncState accessoriesAsyncState) {
        RecyclerView.o layoutManager;
        if (widgetCartSplitV2ItemAccessoriesBinding.itemsRv.getAdapter() != accessoriesViewRender.getSkuThinScrollAdapter()) {
            widgetCartSplitV2ItemAccessoriesBinding.itemsRv.swapAdapter(accessoriesViewRender.getSkuThinScrollAdapter(), true);
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
        AtomAction.ComposerAction composerAction;
        RecyclerView.o layoutManager;
        Parcelable onSaveInstanceState;
        WidgetCartSplitV2ItemAccessoriesBinding widgetCartSplitV2ItemAccessoriesBinding = this.binding;
        if (widgetCartSplitV2ItemAccessoriesBinding == null || (composerAction = this.boundGetAccessoriesAction) == null || (layoutManager = widgetCartSplitV2ItemAccessoriesBinding.itemsRv.getLayoutManager()) == null || (onSaveInstanceState = layoutManager.onSaveInstanceState()) == null) {
            return null;
        }
        this.accessoriesViewModel.saveScrollState(composerAction, onSaveInstanceState);
        return Unit.f71690a;
    }

    private final Unit startShimmer() {
        WidgetCartSplitV2ItemAccessoriesBinding widgetCartSplitV2ItemAccessoriesBinding = this.binding;
        if (widgetCartSplitV2ItemAccessoriesBinding == null) {
            return null;
        }
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
        return Unit.f71690a;
    }

    private final Unit stopShimmer() {
        WidgetCartSplitV2ItemAccessoriesBinding widgetCartSplitV2ItemAccessoriesBinding = this.binding;
        if (widgetCartSplitV2ItemAccessoriesBinding == null) {
            return null;
        }
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
        return Unit.f71690a;
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
        WidgetCartSplitV2ItemAccessoriesBinding widgetCartSplitV2ItemAccessoriesBinding = this.binding;
        if (widgetCartSplitV2ItemAccessoriesBinding == null || !this.isVerticalCompletelyVisible) {
            return;
        }
        RecyclerView.o layoutManager = widgetCartSplitV2ItemAccessoriesBinding.itemsRv.getLayoutManager();
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
            RecyclerView.C findViewHolderForLayoutPosition = widgetCartSplitV2ItemAccessoriesBinding.itemsRv.findViewHolderForLayoutPosition(intValue2);
            SkuThinScrollItemViewHolder skuThinScrollItemViewHolder = findViewHolderForLayoutPosition instanceof SkuThinScrollItemViewHolder ? (SkuThinScrollItemViewHolder) findViewHolderForLayoutPosition : null;
            if (skuThinScrollItemViewHolder != null && (boundItem = skuThinScrollItemViewHolder.getBoundItem()) != null) {
                View itemView = skuThinScrollItemViewHolder.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                if (itemView.getX() >= 0.0f && itemView.getX() + itemView.getWidth() <= widgetCartSplitV2ItemAccessoriesBinding.itemsRv.getWidth() && (tokenizedEvent = boundItem.getTokenizedEvent()) != null) {
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

    /* JADX WARN: Code restructure failed: missing block: B:39:0x004f, code lost:
    
        if (r5 >= 1.0f) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0030, code lost:
    
        if (jk0.o.a(r1, r0, true) > 0.0f) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0051, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void updateCompletelyVisible() {
        boolean z11;
        WidgetCartSplitV2ItemAccessoriesBinding widgetCartSplitV2ItemAccessoriesBinding;
        ConstraintLayout constraintLayout;
        q qVar = this.viewHolderPositionInfo;
        if (qVar == null) {
            return;
        }
        if (AccessoriesAsyncStateKt.isExistTokenizedEvent(this.currentState)) {
            AccessoriesAsyncState accessoriesAsyncState = this.currentState;
            float f7 = 0.0f;
            if (accessoriesAsyncState instanceof AccessoriesAsyncState.Hided) {
                View rootView = this.cartSplitV2ItemWidgetViewHolder.itemView;
                Intrinsics.checkNotNullExpressionValue(rootView, "itemView");
                Intrinsics.checkNotNullParameter(qVar, "<this>");
                Intrinsics.checkNotNullParameter(rootView, "rootView");
            } else if (accessoriesAsyncState instanceof AccessoriesAsyncState.Success) {
                WidgetCartSplitV2ItemAccessoriesBinding widgetCartSplitV2ItemAccessoriesBinding2 = this.binding;
                if (widgetCartSplitV2ItemAccessoriesBinding2 != null && (constraintLayout = widgetCartSplitV2ItemAccessoriesBinding2.getConstraintLayout()) != null) {
                    f7 = jk0.o.b(qVar.a(), constraintLayout, this.viewVisibleRect, true);
                }
            }
            this.isVerticalCompletelyVisible = z11;
            if (z11) {
                trackViewAccessories();
            }
            widgetCartSplitV2ItemAccessoriesBinding = this.binding;
            if (widgetCartSplitV2ItemAccessoriesBinding == null) {
                if (this.isVerticalCompletelyVisible && AccessoriesAsyncStateKt.isShelfNotEmpty(this.currentState)) {
                    if (this.isHorizontalListenerAdded) {
                        return;
                    }
                    this.isHorizontalListenerAdded = true;
                    widgetCartSplitV2ItemAccessoriesBinding.itemsRv.addOnScrollListener(this.horizontalScrollListener);
                    return;
                }
                if (this.isHorizontalListenerAdded) {
                    this.isHorizontalListenerAdded = false;
                    widgetCartSplitV2ItemAccessoriesBinding.itemsRv.removeOnScrollListener(this.horizontalScrollListener);
                    return;
                }
                return;
            }
            return;
        }
        z11 = false;
        this.isVerticalCompletelyVisible = z11;
        if (z11) {
        }
        widgetCartSplitV2ItemAccessoriesBinding = this.binding;
        if (widgetCartSplitV2ItemAccessoriesBinding == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateRenderJob() {
        B0 b02 = this.renderJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.renderJob = C2399j.C(new C2408n0(new C2406m0(new C2408n0(this.accessoriesViewModel.getState$cart_prodGoogleAllVendorsRelease(this.boundGetAccessoriesAction, getWidgetId()), new AccessoriesViewRender$updateRenderJob$1(this, null))), new AccessoriesViewRender$updateRenderJob$2(this)), K.a(this.cartSplitV2ItemWidgetViewHolder));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object updateRenderJob$renderState(AccessoriesViewRender accessoriesViewRender, AccessoriesAsyncState accessoriesAsyncState, d dVar) {
        accessoriesViewRender.renderState(accessoriesAsyncState);
        return Unit.f71690a;
    }

    public final void bind(@NotNull CartSplitV2ItemVO item) {
        WidgetCartSplitV2ItemAccessoriesBinding widgetCartSplitV2ItemAccessoriesBinding;
        ConstraintLayout constraintLayout;
        Intrinsics.checkNotNullParameter(item, "item");
        ProductVO product = item.getProduct();
        AtomAction getAccessoriesAction = product != null ? product.getGetAccessoriesAction() : null;
        AtomAction.ComposerAction composerAction = getAccessoriesAction instanceof AtomAction.ComposerAction ? (AtomAction.ComposerAction) getAccessoriesAction : null;
        this.boundGetAccessoriesAction = composerAction;
        if (composerAction == null && (widgetCartSplitV2ItemAccessoriesBinding = this.binding) != null && (constraintLayout = widgetCartSplitV2ItemAccessoriesBinding.getConstraintLayout()) != null) {
            constraintLayout.setVisibility(8);
        }
        updateRenderJob();
    }

    public final void onAttach() {
        C5423j events = this.refs.getController().getEvents();
        T t2 = new T();
        t2.a(events, new AccessoriesViewRender$inlined$sam$i$androidx_lifecycle_Observer$0(new AccessoriesViewRender$onAttach$$inlined$filterIsInstance$1(t2)));
        t2.observe(this.cartSplitV2ItemWidgetViewHolder, new AccessoriesViewRender$sam$androidx_lifecycle_Observer$0(new AccessoriesViewRender$onAttach$1(this)));
    }

    public final void onDetach() {
        this.viewHolderPositionInfo = null;
    }

    public final void onVisibleAreaChanged(@NotNull q info) {
        Intrinsics.checkNotNullParameter(info, "info");
        this.viewHolderPositionInfo = info;
        updateCompletelyVisible();
    }
}
