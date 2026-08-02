package ru.ozon.app.android.orderdetails.orderdetailsitem.core;

import WZ.t;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.data.ImagesDTO;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.presentation.ImagesVO;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.presentation.ImagesVOKt;
import ru.ozon.app.android.orderdetails.orderdetailsitem.data.OrderDetailsItemDTO;
import ru.ozon.app.android.orderdetails.orderdetailsitem.presentation.OrderDetailsItemVO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.cell.ButtonTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/orderdetails/orderdetailsitem/core/OrderDetailsItemMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/orderdetails/orderdetailsitem/data/OrderDetailsItemDTO;", "Ll20/d;", "", "Lru/ozon/app/android/orderdetails/orderdetailsitem/presentation/OrderDetailsItemVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "id", "toVo", "(Lru/ozon/app/android/orderdetails/orderdetailsitem/data/OrderDetailsItemDTO;J)Lru/ozon/app/android/orderdetails/orderdetailsitem/presentation/OrderDetailsItemVO;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/orderdetails/orderdetailsitem/data/OrderDetailsItemDTO;Ll20/d;)Ljava/util/List;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OrderDetailsItemMapper implements Function2<OrderDetailsItemDTO, d, List<? extends OrderDetailsItemVO>> {
    private final OrderDetailsItemVO toVo(OrderDetailsItemDTO orderDetailsItemDTO, long j11) {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        IconDTO icon = orderDetailsItemDTO.getIcon();
        ButtonTitleSubtitleCellDTO cell = orderDetailsItemDTO.getCell();
        ButtonV3DTO button = orderDetailsItemDTO.getButton();
        ImagesDTO images = orderDetailsItemDTO.getImages();
        t tVar = null;
        ImagesVO vo = images != null ? ImagesVOKt.toVo(images) : null;
        Boolean hasSeparator = orderDetailsItemDTO.getHasSeparator();
        boolean booleanValue = hasSeparator != null ? hasSeparator.booleanValue() : false;
        List<ButtonV3DTO> buttonsInRow = orderDetailsItemDTO.getButtonsInRow();
        if (buttonsInRow == null) {
            buttonsInRow = K.f71697a;
        }
        List<ButtonV3DTO> list = buttonsInRow;
        TestInfo testInfo = orderDetailsItemDTO.getTestInfo();
        CommonCellSettings common = orderDetailsItemDTO.getCell().getCommon();
        if (common != null && (trackingInfo = common.getTrackingInfo()) != null) {
            tVar = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null);
        }
        return new OrderDetailsItemVO(j11, icon, cell, button, vo, booleanValue, list, testInfo, tVar);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<OrderDetailsItemVO> invoke(@NotNull OrderDetailsItemDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVo(state, widgetInfo.d().hashCode()));
    }
}
