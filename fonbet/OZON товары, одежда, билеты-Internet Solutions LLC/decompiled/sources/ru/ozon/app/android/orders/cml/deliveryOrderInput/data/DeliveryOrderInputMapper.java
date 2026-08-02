package ru.ozon.app.android.orders.cml.deliveryOrderInput.data;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.orders.cml.deliveryOrderInput.presentation.viewItem.DeliveryOrderInputVO;
import ru.ozon.app.android.orders.cml.deliveryOrderInput.presentation.viewItem.InputFieldVO;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000b\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000b\u0010\u000fJ&\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/orders/cml/deliveryOrderInput/data/DeliveryOrderInputMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/orders/cml/deliveryOrderInput/data/DeliveryOrderInputDTO;", "Ll20/d;", "", "Lru/ozon/app/android/orders/cml/deliveryOrderInput/presentation/viewItem/DeliveryOrderInputVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "id", "toVO", "(Lru/ozon/app/android/orders/cml/deliveryOrderInput/data/DeliveryOrderInputDTO;J)Lru/ozon/app/android/orders/cml/deliveryOrderInput/presentation/viewItem/DeliveryOrderInputVO;", "Lru/ozon/app/android/orders/cml/deliveryOrderInput/data/InputFieldDTO;", "Lru/ozon/app/android/orders/cml/deliveryOrderInput/presentation/viewItem/InputFieldVO;", "(Lru/ozon/app/android/orders/cml/deliveryOrderInput/data/InputFieldDTO;)Lru/ozon/app/android/orders/cml/deliveryOrderInput/presentation/viewItem/InputFieldVO;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/orders/cml/deliveryOrderInput/data/DeliveryOrderInputDTO;Ll20/d;)Ljava/util/List;", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DeliveryOrderInputMapper implements Function2<DeliveryOrderInputDTO, d, List<? extends DeliveryOrderInputVO>> {
    private final DeliveryOrderInputVO toVO(DeliveryOrderInputDTO deliveryOrderInputDTO, long j11) {
        InputFieldVO vo = toVO(deliveryOrderInputDTO.getInputField());
        Map<String, TokenizedTrackingInfo> trackingInfo = deliveryOrderInputDTO.getTrackingInfo();
        return new DeliveryOrderInputVO(j11, vo, deliveryOrderInputDTO.getSubmitButton(), trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null, deliveryOrderInputDTO.getTestInfo());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<DeliveryOrderInputVO> invoke(@NotNull DeliveryOrderInputDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(state, widgetInfo.d().hashCode()));
    }

    private final InputFieldVO toVO(InputFieldDTO inputFieldDTO) {
        return new InputFieldVO(inputFieldDTO.getValue(), inputFieldDTO.getInputTitle(), Integer.valueOf(inputFieldDTO.getMinCount()), inputFieldDTO.getMaxCount(), inputFieldDTO.getEmptyError(), inputFieldDTO.getCountError());
    }
}
