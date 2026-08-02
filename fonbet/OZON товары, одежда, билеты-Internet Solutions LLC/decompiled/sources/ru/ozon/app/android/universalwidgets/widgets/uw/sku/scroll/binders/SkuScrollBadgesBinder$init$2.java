package ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.binders;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.product.common.core.GalleryItem;
import ru.ozon.app.android.product.common.product.ProductVO;
import ru.ozon.app.android.universalwidgets.widgets.uw.badgescontainer.HorizontalBadgesContainerView;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "item", "Lru/ozon/app/android/product/common/core/GalleryItem;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SkuScrollBadgesBinder$init$2 extends AbstractC7737t implements Function1<GalleryItem, Unit> {
    final /* synthetic */ SkuScrollBadgesBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SkuScrollBadgesBinder$init$2(SkuScrollBadgesBinder skuScrollBadgesBinder) {
        super(1);
        this.this$0 = skuScrollBadgesBinder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GalleryItem galleryItem) {
        invoke2(galleryItem);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(GalleryItem item) {
        ProductVO product;
        HorizontalBadgesContainerView badgesContainer;
        Intrinsics.checkNotNullParameter(item, "item");
        product = this.this$0.getProduct();
        if (product.getIsAdult()) {
            boolean shouldBlur = item.getShouldBlur();
            if (!shouldBlur) {
                this.this$0.updateBadges();
            }
            badgesContainer = this.this$0.getBadgesContainer();
            badgesContainer.setVisibility(!shouldBlur ? 0 : 8);
        }
    }
}
