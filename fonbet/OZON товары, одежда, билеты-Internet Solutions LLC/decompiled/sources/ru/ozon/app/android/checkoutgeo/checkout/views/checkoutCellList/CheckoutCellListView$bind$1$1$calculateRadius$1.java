package ru.ozon.app.android.checkoutgeo.checkout.views.checkoutCellList;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.checkoutgeo.checkout.views.checkoutCellList.CheckoutCellListDTO;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "corner", "Lru/ozon/app/android/checkoutgeo/checkout/views/checkoutCellList/CheckoutCellListDTO$Corners;", "invoke", "(Lru/ozon/app/android/checkoutgeo/checkout/views/checkoutCellList/CheckoutCellListDTO$Corners;)Ljava/lang/Float;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class CheckoutCellListView$bind$1$1$calculateRadius$1 extends AbstractC7737t implements Function1<CheckoutCellListDTO.Corners, Float> {
    final /* synthetic */ CheckoutCellListDTO $data;
    final /* synthetic */ float $islandCornerRadius;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CheckoutCellListView$bind$1$1$calculateRadius$1(CheckoutCellListDTO checkoutCellListDTO, float f7) {
        super(1);
        this.$data = checkoutCellListDTO;
        this.$islandCornerRadius = f7;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Float invoke(CheckoutCellListDTO.Corners corner) {
        Intrinsics.checkNotNullParameter(corner, "corner");
        return Float.valueOf(this.$data.getCorners().contains(corner) ? this.$islandCornerRadius : 0.0f);
    }
}
