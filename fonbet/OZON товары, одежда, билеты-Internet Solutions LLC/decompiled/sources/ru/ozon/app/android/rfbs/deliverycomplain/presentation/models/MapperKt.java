package ru.ozon.app.android.rfbs.deliverycomplain.presentation.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.rfbs.deliverycomplain.data.DeliveryComplainDTO;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toVO", "Lru/ozon/app/android/rfbs/deliverycomplain/presentation/models/DeliveryComplainVO;", "Lru/ozon/app/android/rfbs/deliverycomplain/data/DeliveryComplainDTO;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MapperKt {
    @NotNull
    public static final DeliveryComplainVO toVO(@NotNull DeliveryComplainDTO deliveryComplainDTO) {
        Intrinsics.checkNotNullParameter(deliveryComplainDTO, "<this>");
        return new DeliveryComplainVO(deliveryComplainDTO.hashCode(), deliveryComplainDTO.getCompliance(), deliveryComplainDTO.getComplianceFilled(), deliveryComplainDTO.getActionButton());
    }
}
