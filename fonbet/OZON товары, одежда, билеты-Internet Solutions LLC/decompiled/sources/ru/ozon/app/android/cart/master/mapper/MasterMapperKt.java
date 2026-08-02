package ru.ozon.app.android.cart.master.mapper;

import kotlin.Metadata;
import ru.ozon.app.android.cart.master.data.CartSummaryItemDTO;
import ru.ozon.app.android.cart.master.presentation.CartSummaryItemVO;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, d2 = {"toVOFamily", "Lru/ozon/app/android/cart/master/presentation/CartSummaryItemVO;", "Lru/ozon/app/android/cart/master/data/CartSummaryItemDTO;", "cart_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MasterMapperKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final CartSummaryItemVO toVOFamily(CartSummaryItemDTO cartSummaryItemDTO) {
        long id2 = cartSummaryItemDTO.getId();
        int quantity = cartSummaryItemDTO.getQuantity();
        Long selectedDeliverySchema = cartSummaryItemDTO.getSelectedDeliverySchema();
        if (selectedDeliverySchema == null || selectedDeliverySchema.longValue() == 0) {
            selectedDeliverySchema = null;
        }
        return new CartSummaryItemVO(id2, quantity, selectedDeliverySchema);
    }
}
