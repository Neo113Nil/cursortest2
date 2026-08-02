package ru.ozon.app.android.cml.delivery.widgets.orderCalculator.data;

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
import ru.ozon.app.android.cml.delivery.common.ext.WidgetExtKt;
import ru.ozon.app.android.cml.delivery.molecules.boxCard.data.BoxCardDTO;
import ru.ozon.app.android.cml.delivery.molecules.boxCard.data.BoxCardDTOKt;
import ru.ozon.app.android.cml.delivery.widgets.orderCalculator.data.OrderCalculatorDTO;
import ru.ozon.app.android.cml.delivery.widgets.orderCalculator.presentation.OrderCalculatorVO;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/orderCalculator/data/OrderCalculatorMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/cml/delivery/widgets/orderCalculator/data/OrderCalculatorDTO;", "Ll20/d;", "", "Lru/ozon/app/android/cml/delivery/widgets/orderCalculator/presentation/OrderCalculatorVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/cml/delivery/widgets/orderCalculator/data/OrderCalculatorDTO$RegionsDTO;", "Lru/ozon/app/android/cml/delivery/widgets/orderCalculator/presentation/OrderCalculatorVO$RegionsVO;", "toVO", "(Lru/ozon/app/android/cml/delivery/widgets/orderCalculator/data/OrderCalculatorDTO$RegionsDTO;)Lru/ozon/app/android/cml/delivery/widgets/orderCalculator/presentation/OrderCalculatorVO$RegionsVO;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/cml/delivery/widgets/orderCalculator/data/OrderCalculatorDTO;Ll20/d;)Ljava/util/List;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OrderCalculatorMapper implements Function2<OrderCalculatorDTO, d, List<? extends OrderCalculatorVO>> {
    private final OrderCalculatorVO.RegionsVO toVO(OrderCalculatorDTO.RegionsDTO regionsDTO) {
        return new OrderCalculatorVO.RegionsVO(new OrderCalculatorVO.TextFieldVO(regionsDTO.getSource().getText(), regionsDTO.getSource().getCommonControlSettings()), new OrderCalculatorVO.TextFieldVO(regionsDTO.getDestination().getText(), regionsDTO.getDestination().getCommonControlSettings()), regionsDTO.getSwapButton());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<OrderCalculatorVO> invoke(@NotNull OrderCalculatorDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long widgetId = WidgetExtKt.getWidgetId(widgetInfo);
        OrderCalculatorVO.RegionsVO vo = toVO(state.getRegions());
        List<BoxCardDTO> boxList = state.getBoxList();
        ArrayList arrayList = new ArrayList(C7714v.z(boxList, 10));
        Iterator<T> it = boxList.iterator();
        while (it.hasNext()) {
            arrayList.add(BoxCardDTOKt.toVO((BoxCardDTO) it.next(), WidgetExtKt.getWidgetId(widgetInfo)));
        }
        TextDTO infoText = state.getInfoText();
        ButtonV3DTO createOrderButton = state.getCreateOrderButton();
        String topPatchColor = state.getTopPatchColor();
        String backgroundColor = state.getBackgroundColor();
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        return C7714v.a0(new OrderCalculatorVO(widgetId, vo, arrayList, infoText, createOrderButton, topPatchColor, backgroundColor, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent(trackingInfo, Long.valueOf(WidgetExtKt.getWidgetId(widgetInfo)), null) : null));
    }
}
