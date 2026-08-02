package ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.products.composable;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.products.viewItem.ProductImageVO;
import ru.ozon.uni.android.atom.productMedia.ProductMediaView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.productMedia.ProductMediaHolderKt;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "view", "Lru/ozon/uni/android/atom/productMedia/ProductMediaView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class ProductsComposableKt$ProductImage$2$1$2$1 extends AbstractC7737t implements Function1<ProductMediaView, Unit> {
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ ProductImageVO $productImage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ProductsComposableKt$ProductImage$2$1$2$1(ProductImageVO productImageVO, Function1<? super AtomAction, Unit> function1) {
        super(1);
        this.$productImage = productImageVO;
        this.$actionHandler = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ProductMediaView productMediaView) {
        invoke2(productMediaView);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ProductMediaView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ProductMediaHolderKt.bind(view, this.$productImage.getProductMediaImage(), this.$actionHandler);
    }
}
