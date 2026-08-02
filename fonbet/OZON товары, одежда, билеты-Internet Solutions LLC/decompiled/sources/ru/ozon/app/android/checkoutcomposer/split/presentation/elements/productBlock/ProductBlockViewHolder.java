package ru.ozon.app.android.checkoutcomposer.split.presentation.elements.productBlock;

import JG.b;
import Vg.d;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.checkoutcomposer.split.data.SplitElementDTO;
import ru.ozon.app.android.checkoutcomposer.split.presentation.tooltip.TooltipWrapper;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\"\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000f0\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR*\u0010\u001f\u001a\u0016\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/split/presentation/elements/productBlock/ProductBlockViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/checkoutcomposer/split/presentation/elements/productBlock/ProductsBlockVO;", "Lru/ozon/app/android/checkoutcomposer/split/presentation/elements/productBlock/ProductBlockView;", "view", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Lru/ozon/app/android/checkoutcomposer/split/presentation/elements/productBlock/ProductBlockView;LVg/d;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/checkoutcomposer/split/presentation/elements/productBlock/ProductsBlockVO;Ll20/d;)V", "Lru/ozon/app/android/checkoutcomposer/split/presentation/elements/productBlock/ProductBlockView;", "currentItem", "Lru/ozon/app/android/checkoutcomposer/split/presentation/elements/productBlock/ProductsBlockVO;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/checkoutcomposer/split/presentation/tooltip/TooltipWrapper;", "tooltipWrapper", "Lru/ozon/app/android/checkoutcomposer/split/presentation/tooltip/TooltipWrapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/checkoutcomposer/split/data/SplitElementDTO$SplitProductsBlockDTO$PromotedProduct$ProductTooltip;", "", "onShowTooltip", "Lkotlin/jvm/functions/Function2;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProductBlockViewHolder extends k<ProductsBlockVO> {

    @NotNull
    private Function1<? super AtomAction, Unit> actionHandler;
    private ProductsBlockVO currentItem;
    private Function2<? super SplitElementDTO.SplitProductsBlockDTO.PromotedProduct.ProductTooltip, ? super Integer, Unit> onShowTooltip;
    private TooltipWrapper tooltipWrapper;

    @NotNull
    private final ProductBlockView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductBlockViewHolder(@NotNull ProductBlockView view, @NotNull d customActionHandlersStoreFactory, @NotNull ComposerReferences refs) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.view = view;
        this.actionHandler = new ActionHandler.Builder(refs, this).customActionHandlers(new ProductBlockViewHolder$actionHandler$1(customActionHandlersStoreFactory)).onClick(new ProductBlockViewHolder$actionHandler$2(refs)).buildHandler();
        this.onShowTooltip = new ProductBlockViewHolder$onShowTooltip$1(this, refs);
        view.setOnClickListener(new b(this, 3));
        view.getTitle().setTextIsSelectable(false);
        view.getSubtitle().setTextIsSelectable(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$2$lambda$1(ProductBlockViewHolder productBlockViewHolder, View view) {
        AtomAction action;
        ProductsBlockVO productsBlockVO = productBlockViewHolder.currentItem;
        if (productsBlockVO == null || (action = productsBlockVO.getAction()) == null) {
            return;
        }
        productBlockViewHolder.actionHandler.invoke(action);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ProductsBlockVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.currentItem = item;
        this.view.bind(item, this.actionHandler, this.onShowTooltip);
    }
}
