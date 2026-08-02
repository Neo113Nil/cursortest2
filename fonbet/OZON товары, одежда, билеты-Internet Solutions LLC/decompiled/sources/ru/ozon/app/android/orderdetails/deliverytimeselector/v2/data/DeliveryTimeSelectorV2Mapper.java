package ru.ozon.app.android.orderdetails.deliverytimeselector.v2.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.orderdetails.deliverytimeselector.v2.data.DeliveryTimeSelectorV2DTO;
import ru.ozon.app.android.orderdetails.deliverytimeselector.v2.presentation.datePicker.viewItem.DeliveryDateSelectorV2VO;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000b\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000b\u0010\u000fJ&\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/data/DeliveryTimeSelectorV2Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/data/DeliveryDatesDTO;", "Ll20/d;", "", "Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/presentation/datePicker/viewItem/DeliveryDateSelectorV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "id", "toVO", "(Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/data/DeliveryDatesDTO;J)Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/presentation/datePicker/viewItem/DeliveryDateSelectorV2VO;", "Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/data/DeliveryTimeSelectorV2DTO$DeliveryDateDTO;", "Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/presentation/datePicker/viewItem/DeliveryDateSelectorV2VO$DeliveryDateVO;", "(Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/data/DeliveryTimeSelectorV2DTO$DeliveryDateDTO;)Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/presentation/datePicker/viewItem/DeliveryDateSelectorV2VO$DeliveryDateVO;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/data/DeliveryDatesDTO;Ll20/d;)Ljava/util/List;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DeliveryTimeSelectorV2Mapper implements Function2<DeliveryDatesDTO, d, List<? extends DeliveryDateSelectorV2VO>> {
    private final DeliveryDateSelectorV2VO toVO(DeliveryDatesDTO deliveryDatesDTO, long j11) {
        List<DeliveryTimeSelectorV2DTO.DeliveryDateDTO> deliveryDates = deliveryDatesDTO.getDeliveryDates();
        ArrayList arrayList = new ArrayList(C7714v.z(deliveryDates, 10));
        Iterator<T> it = deliveryDates.iterator();
        while (it.hasNext()) {
            arrayList.add(toVO((DeliveryTimeSelectorV2DTO.DeliveryDateDTO) it.next()));
        }
        return new DeliveryDateSelectorV2VO(j11, arrayList);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<DeliveryDateSelectorV2VO> invoke(@NotNull DeliveryDatesDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(state, widgetInfo.d().hashCode()));
    }

    private final DeliveryDateSelectorV2VO.DeliveryDateVO toVO(DeliveryTimeSelectorV2DTO.DeliveryDateDTO deliveryDateDTO) {
        return new DeliveryDateSelectorV2VO.DeliveryDateVO(deliveryDateDTO.getWrapper(), deliveryDateDTO.getTitle(), deliveryDateDTO.getSubtitle());
    }
}
