package ru.ozon.app.android.cart.cartButtonWithTooltip.presentation;

import Ax.ViewOnClickListenerC2451a;
import Vg.d;
import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.cart.cartButtonWithTooltip.presentation.CartButtonWithTooltipVO;
import ru.ozon.app.android.cart.ui.tooltip.CartTooltipShowService;
import ru.ozon.app.android.cart.ui.tooltip.CartTooltipVO;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u00020\u0004B#\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\u0010\u000b\u001a\u00060\tj\u0002`\n¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u000b\u001a\u00060\tj\u0002`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001bR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00100\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/cart/cartButtonWithTooltip/presentation/CartButtonWithTooltipViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/cart/cartButtonWithTooltip/presentation/CartButtonWithTooltipVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Lru/ozon/uni/android/atom/text/TextAtomV2View;Lru/ozon/app/android/composer/ComposerReferences;LVg/d;)V", "Lru/ozon/app/android/cart/ui/tooltip/CartTooltipVO;", "tooltip", "", "showOrHideTooltip", "(Lru/ozon/app/android/cart/ui/tooltip/CartTooltipVO;)V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/cart/cartButtonWithTooltip/presentation/CartButtonWithTooltipVO;Ll20/d;)V", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getContainerView", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "LVg/d;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/cart/ui/tooltip/CartTooltipShowService;", "tooltipShowService", "Lru/ozon/app/android/cart/ui/tooltip/CartTooltipShowService;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CartButtonWithTooltipViewHolder extends k<CartButtonWithTooltipVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final TextAtomV2View containerView;

    @NotNull
    private final d customActionHandlersStoreFactory;

    @NotNull
    private final CartTooltipShowService tooltipShowService;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartButtonWithTooltipViewHolder(@NotNull TextAtomV2View containerView, @NotNull ComposerReferences references, @NotNull d customActionHandlersStoreFactory) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.containerView = containerView;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.actionHandler = new ActionHandler.Builder(references, this).customActionHandlers(new CartButtonWithTooltipViewHolder$actionHandler$1(this)).buildHandler();
        this.tooltipShowService = new CartTooltipShowService(references, true, true, false, 8, null);
        getContainerView().setOnClickListener(new ViewOnClickListenerC2451a(this, 10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(CartButtonWithTooltipViewHolder cartButtonWithTooltipViewHolder, View view) {
        CartButtonWithTooltipVO.ActionButton actionButton;
        AtomAction action;
        CartButtonWithTooltipVO boundData = cartButtonWithTooltipViewHolder.getBoundData();
        if (boundData == null || (actionButton = boundData.getActionButton()) == null || (action = actionButton.getAction()) == null) {
            return;
        }
        cartButtonWithTooltipViewHolder.actionHandler.invoke(action);
    }

    private final void showOrHideTooltip(final CartTooltipVO tooltip) {
        final TextAtomV2View containerView = getContainerView();
        containerView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ru.ozon.app.android.cart.cartButtonWithTooltip.presentation.CartButtonWithTooltipViewHolder$showOrHideTooltip$$inlined$afterMeasured$1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                CartTooltipShowService cartTooltipShowService;
                if (containerView.getMeasuredWidth() <= 0 || containerView.getMeasuredHeight() <= 0) {
                    return;
                }
                containerView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                TextAtomV2View textAtomV2View = (TextAtomV2View) containerView;
                int baseline = this.getContainerView().getBaseline() - this.getContainerView().getBottom();
                cartTooltipShowService = this.tooltipShowService;
                CartTooltipShowService.showTooltipIfNeed$default(cartTooltipShowService, tooltip, textAtomV2View, baseline, false, null, null, 56, null);
            }
        });
    }

    @NotNull
    public TextAtomV2View getContainerView() {
        return this.containerView;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull CartButtonWithTooltipVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        CartButtonWithTooltipVO.ActionButton actionButton = item.getActionButton();
        TextHolderKt.bind$default(getContainerView(), actionButton.getText(), null, 2, null);
        TextAtomV2View containerView = getContainerView();
        TestInfo testInfo = actionButton.getTestInfo();
        containerView.setContentDescription(testInfo != null ? testInfo.getAutomatizationId() : null);
        showOrHideTooltip(item.getTooltip());
    }
}
