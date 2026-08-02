package ru.ozon.app.android.payment.ui.updateOrderC2C;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.action.v2.models.ActionV2Response;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "Lru/ozon/app/android/payment/ui/updateOrderC2C/UpdateOrderDO;", "kotlin.jvm.PlatformType", "it", "Lru/ozon/app/android/action/v2/models/ActionV2Response;", "Lru/ozon/app/android/payment/ui/updateOrderC2C/UpdateOrderDTO;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Lru/ozon/app/android/action/v2/models/ActionV2Response;)Lru/ozon/app/android/payment/ui/updateOrderC2C/UpdateOrderDO;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class UpdateOrderC2CRepository$updateOrder$2$1 extends AbstractC7737t implements Function1<ActionV2Response<UpdateOrderDTO>, UpdateOrderDO> {
    public static final UpdateOrderC2CRepository$updateOrder$2$1 INSTANCE = new UpdateOrderC2CRepository$updateOrder$2$1();

    UpdateOrderC2CRepository$updateOrder$2$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final UpdateOrderDO invoke(ActionV2Response<UpdateOrderDTO> it) {
        Intrinsics.checkNotNullParameter(it, "it");
        UpdateOrderDTO data = it.getData();
        if (data != null) {
            return UpdateOrderC2CModelsKt.toDO(data);
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
