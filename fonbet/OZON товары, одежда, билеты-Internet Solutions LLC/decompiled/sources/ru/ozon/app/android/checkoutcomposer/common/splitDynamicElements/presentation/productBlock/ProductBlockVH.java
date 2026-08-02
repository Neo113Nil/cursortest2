package ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.presentation.productBlock;

import Am.b;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.SplitDynamicElementVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u001c\b\u0002\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R(\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/presentation/productBlock/ProductBlockVH;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/presentation/productBlock/ProductBlockView;", "view", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAtomAction", "Lkotlin/Function2;", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/DynamicElementDTO$ProductsBlockDTO$PromotedProduct$ProductTooltip;", "", "onShowTooltip", "<init>", "(Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/presentation/productBlock/ProductBlockView;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/SplitDynamicElementVO$ProductsBlock;", "item", "bind", "(Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/SplitDynamicElementVO$ProductsBlock;)V", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/presentation/productBlock/ProductBlockView;", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function2;", "currentItem", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/SplitDynamicElementVO$ProductsBlock;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProductBlockVH extends RecyclerView.C {
    private SplitDynamicElementVO.ProductsBlock currentItem;

    @NotNull
    private final Function1<AtomAction, Unit> onAtomAction;
    private final Function2<DynamicElementDTO.ProductsBlockDTO.PromotedProduct.ProductTooltip, Integer, Unit> onShowTooltip;

    @NotNull
    private final ProductBlockView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ProductBlockVH(@NotNull ProductBlockView view, @NotNull Function1<? super AtomAction, Unit> onAtomAction, Function2<? super DynamicElementDTO.ProductsBlockDTO.PromotedProduct.ProductTooltip, ? super Integer, Unit> function2) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onAtomAction, "onAtomAction");
        this.view = view;
        this.onAtomAction = onAtomAction;
        this.onShowTooltip = function2;
        view.setOnClickListener(new b(this, 15));
        view.getTitle().setTextIsSelectable(false);
        view.getSubtitle().setTextIsSelectable(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$2$lambda$1(ProductBlockVH productBlockVH, View view) {
        AtomActionDTO action;
        SplitDynamicElementVO.ProductsBlock productsBlock = productBlockVH.currentItem;
        if (productsBlock == null || (action = productsBlock.getAction()) == null) {
            return;
        }
        Function1<AtomAction, Unit> function1 = productBlockVH.onAtomAction;
        SplitDynamicElementVO.ProductsBlock productsBlock2 = productBlockVH.currentItem;
        function1.invoke(AtomActionMapperKt.toAtomAction(action, productsBlock2 != null ? productsBlock2.getTrackingInfo() : null));
    }

    public final void bind(@NotNull SplitDynamicElementVO.ProductsBlock item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ProductBlockView productBlockView = this.view;
        this.currentItem = item;
        TextHolderKt.bindOrGone$default(productBlockView.getTitle(), item.getTitle(), null, 2, null);
        TextHolderKt.bindOrGone$default(productBlockView.getSubtitle(), item.getSubtitle(), null, 2, null);
        BadgeHolderKt.bindOrGone$default(productBlockView.getBadge(), item.getBadge(), (Function1) null, 2, (Object) null);
        ProductView product1 = productBlockView.getProduct1();
        List<DynamicElementDTO.ProductsBlockDTO.PromotedProduct> promotedProducts = item.getPromotedProducts();
        product1.bindOrGone(promotedProducts != null ? (DynamicElementDTO.ProductsBlockDTO.PromotedProduct) C7714v.Q(0, promotedProducts) : null, this.onShowTooltip);
        ProductView product2 = productBlockView.getProduct2();
        List<DynamicElementDTO.ProductsBlockDTO.PromotedProduct> promotedProducts2 = item.getPromotedProducts();
        product2.bindOrGone(promotedProducts2 != null ? (DynamicElementDTO.ProductsBlockDTO.PromotedProduct) C7714v.Q(1, promotedProducts2) : null, this.onShowTooltip);
        ProductView product3 = productBlockView.getProduct3();
        List<DynamicElementDTO.ProductsBlockDTO.PromotedProduct> promotedProducts3 = item.getPromotedProducts();
        product3.bindOrGone(promotedProducts3 != null ? (DynamicElementDTO.ProductsBlockDTO.PromotedProduct) C7714v.Q(2, promotedProducts3) : null, this.onShowTooltip);
    }
}
