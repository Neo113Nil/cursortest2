package ru.ozon.app.android.barcode.barcodeProductsList.presentation.viewHolder.items.products;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.cscore.databinding.ItemImageBinding;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.presentation.adapter.ImageViewHolder;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/adapter/ImageViewHolder;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class ProductView$imageViewHolder$2 extends AbstractC7737t implements Function0<ImageViewHolder> {
    final /* synthetic */ ProductView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProductView$imageViewHolder$2(ProductView productView) {
        super(0);
        this.this$0 = productView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ImageViewHolder invoke() {
        ItemImageBinding itemImageBinding;
        Function1 function1;
        itemImageBinding = this.this$0.imageViewBinding;
        function1 = this.this$0.onAction;
        return new ImageViewHolder(itemImageBinding, function1);
    }
}
