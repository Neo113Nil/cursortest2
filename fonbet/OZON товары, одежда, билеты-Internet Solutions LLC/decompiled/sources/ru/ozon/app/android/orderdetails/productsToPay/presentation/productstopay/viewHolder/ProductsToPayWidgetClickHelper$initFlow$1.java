package ru.ozon.app.android.orderdetails.productsToPay.presentation.productstopay.viewHolder;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;
import ru.ozon.app.android.orderdetails.productsToPay.presentation.productstopay.viewHolder.ProductsToPayWidgetClickHelper;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class ProductsToPayWidgetClickHelper$initFlow$1 extends C7719a implements Function2<ProductsToPayWidgetClickHelper.ClickEvent, d<? super Unit>, Object> {
    ProductsToPayWidgetClickHelper$initFlow$1(Object obj) {
        super(2, obj, ProductsToPayWidgetClickHelper.class, "handleClick", "handleClick(Lru/ozon/app/android/orderdetails/productsToPay/presentation/productstopay/viewHolder/ProductsToPayWidgetClickHelper$ClickEvent;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProductsToPayWidgetClickHelper.ClickEvent clickEvent, d<? super Unit> dVar) {
        Object initFlow$handleClick;
        initFlow$handleClick = ProductsToPayWidgetClickHelper.initFlow$handleClick((ProductsToPayWidgetClickHelper) this.receiver, clickEvent, dVar);
        return initFlow$handleClick;
    }
}
