package ru.ozon.app.android.universalwidgets.widgets.uw.sku.binders;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.product.common.core.GalleryItem;
import ru.ozon.app.android.product.common.product.ProductVO;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.SkuImageWrapper;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "item", "Lru/ozon/app/android/product/common/core/GalleryItem;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ProductAdultImageWithVideoCoverBinder$init$3 extends AbstractC7737t implements Function1<GalleryItem, Unit> {
    final /* synthetic */ ProductAdultImageWithVideoCoverBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProductAdultImageWithVideoCoverBinder$init$3(ProductAdultImageWithVideoCoverBinder productAdultImageWithVideoCoverBinder) {
        super(1);
        this.this$0 = productAdultImageWithVideoCoverBinder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GalleryItem galleryItem) {
        invoke2(galleryItem);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(GalleryItem item) {
        ProductVO product;
        SkuImageWrapper imageContainer;
        View badgesView;
        Intrinsics.checkNotNullParameter(item, "item");
        product = this.this$0.getProduct();
        if (product.getIsAdult()) {
            imageContainer = this.this$0.getImageContainer();
            if (imageContainer != null) {
                imageContainer.bindItem(item);
            }
            badgesView = this.this$0.getBadgesView();
            badgesView.setVisibility(!item.getShouldBlur() ? 0 : 8);
        }
    }
}
