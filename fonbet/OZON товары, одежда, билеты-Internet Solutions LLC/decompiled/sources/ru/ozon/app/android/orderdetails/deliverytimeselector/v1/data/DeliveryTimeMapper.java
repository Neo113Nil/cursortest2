package ru.ozon.app.android.orderdetails.deliverytimeselector.v1.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.orderdetails.deliverytimeselector.v1.presentation.DeliveryDateVO;
import ru.ozon.app.android.orderdetails.deliverytimeselector.v1.presentation.DeliveryTimeSlotVO;
import ru.ozon.app.android.orderdetails.deliverytimeselector.v1.presentation.DeliveryTimeVO;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00172*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001\u0017B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\r\u001a\u00020\f*\u00020\t2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\r\u001a\u00020\u0010*\u00020\u000fH\u0002¢\u0006\u0004\b\r\u0010\u0011J*\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0012\u001a\u00020\u00022\n\u0010\u0014\u001a\u00060\u0003j\u0002`\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/orderdetails/deliverytimeselector/v1/data/DeliveryTimeMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/orderdetails/deliverytimeselector/v1/data/DeliveryTimeDTO;", "Ll20/d;", "", "Lru/ozon/app/android/orderdetails/deliverytimeselector/v1/presentation/DeliveryTimeVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/orderdetails/deliverytimeselector/v1/data/DeliveryDateDTO;", "", "isSelected", "Lru/ozon/app/android/orderdetails/deliverytimeselector/v1/presentation/DeliveryDateVO;", "toVO", "(Lru/ozon/app/android/orderdetails/deliverytimeselector/v1/data/DeliveryDateDTO;Z)Lru/ozon/app/android/orderdetails/deliverytimeselector/v1/presentation/DeliveryDateVO;", "Lru/ozon/app/android/orderdetails/deliverytimeselector/v1/data/DeliveryTimeSlotDTO;", "Lru/ozon/app/android/orderdetails/deliverytimeselector/v1/presentation/DeliveryTimeSlotVO;", "(Lru/ozon/app/android/orderdetails/deliverytimeselector/v1/data/DeliveryTimeSlotDTO;)Lru/ozon/app/android/orderdetails/deliverytimeselector/v1/presentation/DeliveryTimeSlotVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/orderdetails/deliverytimeselector/v1/data/DeliveryTimeDTO;Ll20/d;)Ljava/util/List;", "Companion", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DeliveryTimeMapper implements Function2<DeliveryTimeDTO, d, List<? extends DeliveryTimeVO>> {
    private final DeliveryDateVO toVO(DeliveryDateDTO deliveryDateDTO, boolean z11) {
        String title = deliveryDateDTO.getTitle();
        List<DeliveryTimeSlotDTO> timeslots = deliveryDateDTO.getTimeslots();
        ArrayList arrayList = new ArrayList(C7714v.z(timeslots, 10));
        Iterator<T> it = timeslots.iterator();
        while (it.hasNext()) {
            arrayList.add(toVO((DeliveryTimeSlotDTO) it.next()));
        }
        return new DeliveryDateVO(title, z11, arrayList);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<DeliveryTimeVO> invoke(@NotNull DeliveryTimeDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        Integer selectedDatePosition = state.getSelectedDatePosition();
        int intValue = selectedDatePosition != null ? selectedDatePosition.intValue() : 0;
        List<DeliveryDateDTO> dates = state.getDates();
        ArrayList arrayList = new ArrayList(C7714v.z(dates, 10));
        int i11 = 0;
        for (Object obj : dates) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            arrayList.add(toVO((DeliveryDateDTO) obj, intValue == i11));
            i11 = i12;
        }
        return C7714v.a0(new DeliveryTimeVO(818381830, arrayList));
    }

    private final DeliveryTimeSlotVO toVO(DeliveryTimeSlotDTO deliveryTimeSlotDTO) {
        return new DeliveryTimeSlotVO(deliveryTimeSlotDTO.getTitle(), deliveryTimeSlotDTO.getDeeplink(), deliveryTimeSlotDTO.isSelected());
    }
}
