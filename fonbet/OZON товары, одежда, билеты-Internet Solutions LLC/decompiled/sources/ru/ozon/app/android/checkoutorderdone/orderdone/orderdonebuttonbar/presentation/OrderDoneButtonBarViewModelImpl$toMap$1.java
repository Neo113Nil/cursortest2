package ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.data.ReorderProductItem;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/data/ReorderProductItem;", "invoke", "(Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/data/ReorderProductItem;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class OrderDoneButtonBarViewModelImpl$toMap$1 extends AbstractC7737t implements Function1<ReorderProductItem, Boolean> {
    public static final OrderDoneButtonBarViewModelImpl$toMap$1 INSTANCE = new OrderDoneButtonBarViewModelImpl$toMap$1();

    OrderDoneButtonBarViewModelImpl$toMap$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(ReorderProductItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(h.y0(it.getSku()) != null);
    }
}
