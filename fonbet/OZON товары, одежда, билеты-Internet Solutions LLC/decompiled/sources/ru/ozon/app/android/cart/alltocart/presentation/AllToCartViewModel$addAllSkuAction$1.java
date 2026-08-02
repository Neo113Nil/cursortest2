package ru.ozon.app.android.cart.alltocart.presentation;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.cart.alltocart.presentation.AllToCartVO;
import ru.ozon.app.android.cart.common.domain.CartState;
import ru.ozon.app.android.cart.common.models.AddProductsWithTokenizedAnalytics;
import ru.ozon.app.android.cart.common.models.CartItemInfo;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "Lru/ozon/app/android/cart/common/models/AddProductsWithTokenizedAnalytics;", "kotlin.jvm.PlatformType", "skus", "", "Lru/ozon/app/android/cart/alltocart/presentation/AllToCartVO$CartData;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Ljava/util/List;)Lru/ozon/app/android/cart/common/models/AddProductsWithTokenizedAnalytics;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class AllToCartViewModel$addAllSkuAction$1 extends AbstractC7737t implements Function1<List<? extends AllToCartVO.CartData>, AddProductsWithTokenizedAnalytics> {
    final /* synthetic */ AllToCartViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AllToCartViewModel$addAllSkuAction$1(AllToCartViewModel allToCartViewModel) {
        super(1);
        this.this$0 = allToCartViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ AddProductsWithTokenizedAnalytics invoke(List<? extends AllToCartVO.CartData> list) {
        return invoke2((List<AllToCartVO.CartData>) list);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final AddProductsWithTokenizedAnalytics invoke2(List<AllToCartVO.CartData> skus) {
        CartState cartState;
        Intrinsics.checkNotNullParameter(skus, "skus");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        AllToCartViewModel allToCartViewModel = this.this$0;
        for (AllToCartVO.CartData cartData : skus) {
            cartState = allToCartViewModel.cartState;
            CartItemInfo cartItemInfo = cartState.getItems().get(Long.valueOf(cartData.getId()));
            int incrementQuantity = cartItemInfo != null ? cartData.getIncrementQuantity() + cartItemInfo.getQuantity() : cartData.getAddQuantity();
            if (incrementQuantity <= cartData.getMaxItems()) {
                linkedHashMap.put(Long.valueOf(cartData.getId()), new CartItemInfo(incrementQuantity, cartData.getSelectedDeliverySchema(), null, null, null, null, 60, null));
                allToCartViewModel.addAnalytics(arrayList, cartData, cartItemInfo);
            }
        }
        AllToCartVO allToCartVO = this.this$0.voState;
        return new AddProductsWithTokenizedAnalytics(linkedHashMap, arrayList, null, allToCartVO != null ? Long.valueOf(allToCartVO.getId()) : null, null, 20, null);
    }
}
