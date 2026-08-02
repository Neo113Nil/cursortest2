package ru.ozon.app.android.storefront.core.socialAtoms.productList.container;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.storefront.core.socialAtoms.productList.items.ProductListItemVO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class SocialProductListView$productListAdapter$1 extends C7735q implements Function1<ProductListItemVO, Unit> {
    SocialProductListView$productListAdapter$1(Object obj) {
        super(1, obj, SocialProductListView.class, "onItemAttached", "onItemAttached(Lru/ozon/app/android/storefront/core/socialAtoms/productList/items/ProductListItemVO;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ProductListItemVO productListItemVO) {
        invoke2(productListItemVO);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ProductListItemVO p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((SocialProductListView) this.receiver).onItemAttached(p02);
    }
}
