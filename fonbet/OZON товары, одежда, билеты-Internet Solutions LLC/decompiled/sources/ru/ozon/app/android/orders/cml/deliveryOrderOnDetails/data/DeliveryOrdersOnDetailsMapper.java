package ru.ozon.app.android.orders.cml.deliveryOrderOnDetails.data;

import Sc.v;
import WZ.x;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.data.ImagesDTO;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.presentation.ImagesVO;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.presentation.ImagesVOKt;
import ru.ozon.app.android.orders.cml.deliveryOrderOnDetails.presentation.viewItems.DeliveryOrderOnDetailsVO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ5\u0010\u0012\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000e*\b\u0012\u0004\u0012\u00020\r0\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J&\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/orders/cml/deliveryOrderOnDetails/data/DeliveryOrdersOnDetailsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/orders/cml/deliveryOrderOnDetails/data/DeliveryOrderOnDetailsDTO;", "Ll20/d;", "", "Lru/ozon/app/android/orders/cml/deliveryOrderOnDetails/presentation/viewItems/DeliveryOrderOnDetailsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "id", "toVO", "(Lru/ozon/app/android/orders/cml/deliveryOrderOnDetails/data/DeliveryOrderOnDetailsDTO;J)Lru/ozon/app/android/orders/cml/deliveryOrderOnDetails/presentation/viewItems/DeliveryOrderOnDetailsVO;", "", "LSc/v;", "Lru/ozon/app/android/orders/cml/deliveryOrderOnDetails/data/TextIconDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/data/ImagesDTO;", "partitionToComponents", "(Ljava/util/List;)LSc/v;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/orders/cml/deliveryOrderOnDetails/data/DeliveryOrderOnDetailsDTO;Ll20/d;)Ljava/util/List;", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DeliveryOrdersOnDetailsMapper implements Function2<DeliveryOrderOnDetailsDTO, d, List<? extends DeliveryOrderOnDetailsVO>> {
    private final v<TextIconDTO, List<TextDTO>, ImagesDTO> partitionToComponents(List<? extends Object> list) {
        ArrayList arrayList = new ArrayList();
        Object obj = null;
        Object obj2 = null;
        for (Object obj3 : list) {
            if (obj3 instanceof TextIconDTO) {
                obj = obj3;
            } else if (obj3 instanceof TextDTO) {
                arrayList.add(obj3);
            } else if (obj3 instanceof ImagesDTO) {
                obj2 = obj3;
            }
        }
        return new v<>(obj, arrayList, obj2);
    }

    private final DeliveryOrderOnDetailsVO toVO(DeliveryOrderOnDetailsDTO deliveryOrderOnDetailsDTO, long j11) {
        v<TextIconDTO, List<TextDTO>, ImagesDTO> partitionToComponents = partitionToComponents(deliveryOrderOnDetailsDTO.getItems());
        TextIconDTO a11 = partitionToComponents.a();
        List<TextDTO> b11 = partitionToComponents.b();
        ImagesDTO d11 = partitionToComponents.d();
        ImagesVO vo = d11 != null ? ImagesVOKt.toVo(d11) : null;
        BadgeDTO badge = a11 != null ? a11.getBadge() : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = deliveryOrderOnDetailsDTO.getTrackingInfo();
        return new DeliveryOrderOnDetailsVO(j11, a11, b11, badge, vo, trackingInfo != null ? x.b(trackingInfo, Long.valueOf(j11), null) : null, deliveryOrderOnDetailsDTO.getTestInfo(), deliveryOrderOnDetailsDTO.getVerticalPadding());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<DeliveryOrderOnDetailsVO> invoke(@NotNull DeliveryOrderOnDetailsDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(state, widgetInfo.d().hashCode()));
    }
}
