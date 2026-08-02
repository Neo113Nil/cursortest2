package ru.ozon.app.android.orders.cml.deliveryInfo.data;

import WZ.t;
import WZ.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.orders.cml.common.data.VerticalPadding;
import ru.ozon.app.android.orders.cml.deliveryInfo.presentation.viewItem.DeliveryInfoVO;
import ru.ozon.app.android.orders.cml.deliveryInfo.presentation.viewItem.InfoCellVO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.common.CornerRadius;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000b\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000b\u0010\u000fJ&\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/orders/cml/deliveryInfo/data/DeliveryInfoMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/orders/cml/deliveryInfo/data/DeliveryInfoDTO;", "Ll20/d;", "", "Lru/ozon/app/android/orders/cml/deliveryInfo/presentation/viewItem/DeliveryInfoVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "stateId", "toVO", "(Lru/ozon/app/android/orders/cml/deliveryInfo/data/DeliveryInfoDTO;J)Lru/ozon/app/android/orders/cml/deliveryInfo/presentation/viewItem/DeliveryInfoVO;", "Lru/ozon/app/android/orders/cml/deliveryInfo/data/InfoCellDTO;", "Lru/ozon/app/android/orders/cml/deliveryInfo/presentation/viewItem/InfoCellVO;", "(Lru/ozon/app/android/orders/cml/deliveryInfo/data/InfoCellDTO;)Lru/ozon/app/android/orders/cml/deliveryInfo/presentation/viewItem/InfoCellVO;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/orders/cml/deliveryInfo/data/DeliveryInfoDTO;Ll20/d;)Ljava/util/List;", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DeliveryInfoMapper implements Function2<DeliveryInfoDTO, d, List<? extends DeliveryInfoVO>> {
    private final DeliveryInfoVO toVO(DeliveryInfoDTO deliveryInfoDTO, long j11) {
        CornerRadius islandCornerRadius = deliveryInfoDTO.getIslandCornerRadius();
        String backgroundColor = deliveryInfoDTO.getBackgroundColor();
        VerticalPadding verticalPadding = deliveryInfoDTO.getVerticalPadding();
        Map<String, TokenizedTrackingInfo> trackingInfo = deliveryInfoDTO.getTrackingInfo();
        t b11 = trackingInfo != null ? x.b(trackingInfo, Long.valueOf(j11), null) : null;
        TestInfo testInfo = deliveryInfoDTO.getTestInfo();
        List<InfoCellDTO> cellList = deliveryInfoDTO.getCellList();
        ArrayList arrayList = new ArrayList(C7714v.z(cellList, 10));
        Iterator<T> it = cellList.iterator();
        while (it.hasNext()) {
            arrayList.add(toVO((InfoCellDTO) it.next()));
        }
        return new DeliveryInfoVO(j11, islandCornerRadius, backgroundColor, verticalPadding, b11, testInfo, arrayList);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<DeliveryInfoVO> invoke(@NotNull DeliveryInfoDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(state, widgetInfo.d().hashCode()));
    }

    private final InfoCellVO toVO(InfoCellDTO infoCellDTO) {
        return new InfoCellVO(infoCellDTO.getCell(), infoCellDTO.getButtons(), infoCellDTO.getHasSeparator());
    }
}
