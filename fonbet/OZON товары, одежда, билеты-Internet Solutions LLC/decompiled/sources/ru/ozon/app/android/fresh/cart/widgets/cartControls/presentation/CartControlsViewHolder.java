package ru.ozon.app.android.fresh.cart.widgets.cartControls.presentation;

import Vg.d;
import W10.c;
import WZ.l;
import WZ.m;
import WZ.t;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.cart.ui.tooltip.CartTooltipHelper;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.fresh.navigation.interceptors.MoveCartItemsPayloadHandler;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 92\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u00019B3\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\u0010\u000e\u001a\u00060\fj\u0002`\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0016J#\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00022\n\u0010\u001c\u001a\u00060\u001aj\u0002`\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010#\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0014H\u0016¢\u0006\u0004\b%\u0010\u0016J\u000f\u0010&\u001a\u00020\u0014H\u0016¢\u0006\u0004\b&\u0010\u0016J\u000f\u0010'\u001a\u00020\u0014H\u0016¢\u0006\u0004\b'\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010*R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R \u00104\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u0014028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00106\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00108\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u0010\u0013¨\u0006:"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/cartControls/presentation/CartControlsViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/cart/widgets/cartControls/presentation/CartControlsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/fresh/cart/widgets/cartControls/presentation/CartControlsView;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/fresh/navigation/interceptors/MoveCartItemsPayloadHandler;", "moveCartItemsHandler", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customHandlersStoreFactory", "<init>", "(Lru/ozon/app/android/fresh/cart/widgets/cartControls/presentation/CartControlsView;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;Lru/ozon/app/android/fresh/navigation/interceptors/MoveCartItemsPayloadHandler;LVg/d;)V", "", "isAnimationNeeded", "()Z", "", "setupView", "()V", "setupCornersMode", "setLifecycleObserver", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/fresh/cart/widgets/cartControls/presentation/CartControlsVO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/fresh/cart/widgets/cartControls/presentation/CartControlsVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "onAttach", "onDetach", "onViewInVisibleBounds", "Lru/ozon/app/android/fresh/cart/widgets/cartControls/presentation/CartControlsView;", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lru/ozon/app/android/fresh/navigation/interceptors/MoveCartItemsPayloadHandler;", "Lru/ozon/app/android/cart/ui/tooltip/CartTooltipHelper;", "tooltipHelper", "Lru/ozon/app/android/cart/ui/tooltip/CartTooltipHelper;", "Lru/ozon/app/android/fresh/cart/widgets/cartControls/presentation/CartControlsViewController;", "cartControlsViewController", "Lru/ozon/app/android/fresh/cart/widgets/cartControls/presentation/CartControlsViewController;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "observerInitialized", "Z", "isSticky", "Companion", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CartControlsViewHolder extends k<CartControlsVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final CartControlsViewController cartControlsViewController;

    @NotNull
    private final CartControlsView containerView;

    @NotNull
    private final MoveCartItemsPayloadHandler moveCartItemsHandler;
    private boolean observerInitialized;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final CartTooltipHelper tooltipHelper;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/cartControls/presentation/CartControlsViewHolder$Companion;", "", "<init>", "()V", "NON_STICKY", "", "STICKY", "NO_POSITION", "", "FIRST_INDEX", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartControlsViewHolder(@NotNull CartControlsView containerView, @NotNull ComposerReferences refs, @NotNull l tokenizedAnalytics, @NotNull MoveCartItemsPayloadHandler moveCartItemsHandler, @NotNull d customHandlersStoreFactory) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(moveCartItemsHandler, "moveCartItemsHandler");
        Intrinsics.checkNotNullParameter(customHandlersStoreFactory, "customHandlersStoreFactory");
        this.containerView = containerView;
        this.refs = refs;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.moveCartItemsHandler = moveCartItemsHandler;
        CartTooltipHelper cartTooltipHelper = new CartTooltipHelper(refs.getContainer().j());
        this.tooltipHelper = cartTooltipHelper;
        this.cartControlsViewController = new CartControlsViewController(refs, containerView, cartTooltipHelper, new Gt.d(this, 0), tokenizedAnalytics);
        this.actionHandler = new ActionHandler.Builder(refs, this).customActionHandlers(new CartControlsViewHolder$actionHandler$1(customHandlersStoreFactory)).onPreProcess(new CartControlsViewHolder$actionHandler$2(this)).buildHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CartControlsViewModel cartControlsViewController$lambda$0(CartControlsViewHolder cartControlsViewHolder) {
        return (CartControlsViewModel) cartControlsViewHolder.getWidgetViewModel();
    }

    private final boolean isAnimationNeeded() {
        CartControlsVO boundData = getBoundData();
        if (boundData == null || !boundData.getIsAnimationEnabled()) {
            return false;
        }
        CartControlsVO boundData2 = getBoundData();
        return boundData2 == null || !boundData2.getIsTopCornersRounded();
    }

    private final boolean isSticky() {
        View view;
        ViewGroup composerStickyContainer;
        View childAt;
        ComponentCallbacksC5392m c11 = this.refs.getContainer().c();
        boolean z11 = false;
        if (c11 != null && (view = c11.getView()) != null && (composerStickyContainer = ComposerViewExtensionKt.composerStickyContainer(view)) != null && (childAt = composerStickyContainer.getChildAt(0)) != null) {
            ViewGroup viewGroup = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup != null && viewGroup.indexOfChild(this.containerView) == -1) {
                z11 = true;
            }
        }
        return !z11;
    }

    private final void setLifecycleObserver() {
        if (this.observerInitialized) {
            return;
        }
        this.observerInitialized = true;
        U7.d.c(this.refs).a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.fresh.cart.widgets.cartControls.presentation.CartControlsViewHolder$setLifecycleObserver$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStop(J owner) {
                ComposerReferences composerReferences;
                Intrinsics.checkNotNullParameter(owner, "owner");
                super.onStop(owner);
                CartControlsVO boundData = CartControlsViewHolder.this.getBoundData();
                if (boundData != null) {
                    boundData.setBlockAnimation(true);
                }
                composerReferences = CartControlsViewHolder.this.refs;
                composerReferences.getContainer().g().getLifecycle().e(this);
            }
        });
    }

    private final void setupCornersMode() {
        if (isSticky() && isAnimationNeeded()) {
            this.cartControlsViewController.animateSetup(true);
        } else {
            setupView();
        }
    }

    private final void setupView() {
        CartControlsVO boundData = getBoundData();
        if (boundData != null) {
            boundData.setBlockAnimation(false);
        }
        CartControlsViewController.setup$default(this.cartControlsViewController, isSticky(), false, 2, null);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        boolean isSticky = isSticky();
        this.cartControlsViewController.setLocatorsTags(isSticky);
        if (isSticky) {
            setLifecycleObserver();
            this.containerView.setContentDescription("cartControlsWidgetSticky");
        } else {
            this.containerView.setContentDescription("cartControlsWidgetNonSticky");
        }
        CartControlsVO boundData = getBoundData();
        if (boundData == null || !boundData.getIsAnimationEnabled()) {
            return;
        }
        setupCornersMode();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        this.tooltipHelper.onDismissTooltip();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        super.onViewInVisibleBounds();
        if (isAnimationNeeded()) {
            setupView();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull CartControlsVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.cartControlsViewController.bind(item, this.actionHandler);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull CartControlsVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((CartControlsViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            m.c(this.tokenizedAnalytics, tokenizedEvent, null);
        }
    }
}
