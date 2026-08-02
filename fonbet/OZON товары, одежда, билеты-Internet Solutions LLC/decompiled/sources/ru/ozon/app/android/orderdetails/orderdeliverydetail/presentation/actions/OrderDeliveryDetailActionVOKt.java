package ru.ozon.app.android.orderdetails.orderdeliverydetail.presentation.actions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.orderdetails.orderdeliverydetail.data.OrderDeliveryDetailDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u0000¨\u0006\u0004"}, d2 = {"toActions", "", "Lru/ozon/app/android/orderdetails/orderdeliverydetail/presentation/actions/OrderDeliveryDetailActionVO;", "Lru/ozon/app/android/orderdetails/orderdeliverydetail/data/OrderDeliveryDetailDTO;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OrderDeliveryDetailActionVOKt {
    @NotNull
    public static final List<OrderDeliveryDetailActionVO> toActions(@NotNull OrderDeliveryDetailDTO orderDeliveryDetailDTO) {
        Intrinsics.checkNotNullParameter(orderDeliveryDetailDTO, "<this>");
        List<ButtonV3Atom.LargeBorderlessButton> actions = orderDeliveryDetailDTO.getActions();
        if (actions == null) {
            return K.f71697a;
        }
        List<ButtonV3Atom.LargeBorderlessButton> list = actions;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new OrderDeliveryDetailActionVO(r1.hashCode(), (ButtonV3Atom.LargeBorderlessButton) it.next()));
        }
        return arrayList;
    }
}
