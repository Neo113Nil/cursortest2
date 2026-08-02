package ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.accessories;

import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.cart.common.presentation.addToCart.AddToCartViewModel;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.product.skuthinscroll.presentation.SkuThinItemsAdapter;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/product/skuthinscroll/presentation/SkuThinItemsAdapter;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class CartSplitV2AccessoriesViewRender$skuThinScrollAdapter$2 extends AbstractC7737t implements Function0<SkuThinItemsAdapter> {
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ AddToCartViewModel $addToCartViewModel;
    final /* synthetic */ J $lifecycleOwner;
    final /* synthetic */ CartSplitV2AccessoriesViewRender this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CartSplitV2AccessoriesViewRender$skuThinScrollAdapter$2(Function1<? super AtomAction, Unit> function1, AddToCartViewModel addToCartViewModel, CartSplitV2AccessoriesViewRender cartSplitV2AccessoriesViewRender, J j11) {
        super(0);
        this.$actionHandler = function1;
        this.$addToCartViewModel = addToCartViewModel;
        this.this$0 = cartSplitV2AccessoriesViewRender;
        this.$lifecycleOwner = j11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final SkuThinItemsAdapter invoke() {
        ComposerReferences composerReferences;
        ComposerReferences composerReferences2;
        Function1<AtomAction, Unit> function1 = this.$actionHandler;
        AddToCartViewModel addToCartViewModel = this.$addToCartViewModel;
        composerReferences = this.this$0.refs;
        addToCartViewModel.attach(composerReferences.getTokenizedAnalytics());
        composerReferences2 = this.this$0.refs;
        return new SkuThinItemsAdapter(function1, addToCartViewModel, composerReferences2, null, null, null, null, null, null, this.$lifecycleOwner, 504, null);
    }
}
