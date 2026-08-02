package ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.annotation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.orderdetails.ordershipment.orderShipment.data.OrderShipmentItemDTO;
import ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.OrderShipmentItemVO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J&\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/annotation/AnnotationOrderShipmentMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/OrderShipmentItemDTO;", "Ll20/d;", "", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/OrderShipmentItemVO$AnnotationVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/OrderShipmentItemDTO$AnnotationDTO;", "item", "mapItemDTOtoVO", "(Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/OrderShipmentItemDTO$AnnotationDTO;)Ljava/util/List;", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/OrderShipmentItemDTO$ButtonDTO;", "button", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/OrderShipmentItemVO$AnnotationVO$AnnotationButton;", "mapButtonToVO", "(Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/OrderShipmentItemDTO$ButtonDTO;)Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/OrderShipmentItemVO$AnnotationVO$AnnotationButton;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/OrderShipmentItemDTO;Ll20/d;)Ljava/util/List;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AnnotationOrderShipmentMapper implements Function2<OrderShipmentItemDTO, d, List<? extends OrderShipmentItemVO.AnnotationVO>> {
    private final OrderShipmentItemVO.AnnotationVO.AnnotationButton mapButtonToVO(OrderShipmentItemDTO.ButtonDTO button) {
        return new OrderShipmentItemVO.AnnotationVO.AnnotationButton(new ButtonV3Atom.SmallBorderlessButton(OzonSpannableStringKt.toOzonSpannableString(button.getText()), button.getAction(), null, null, null, button.getTrackingInfo(), false, 92, null), button.getTextColor());
    }

    private final List<OrderShipmentItemVO.AnnotationVO> mapItemDTOtoVO(OrderShipmentItemDTO.AnnotationDTO item) {
        ArrayList arrayList;
        long hashCode = hashCode();
        OzonSpannableString text = item.getText();
        String textColor = item.getTextColor();
        String icon = item.getIcon();
        String iconColor = item.getIconColor();
        String backgroundColor = item.getBackgroundColor();
        Boolean useBoldFont = item.getUseBoldFont();
        boolean booleanValue = useBoldFont != null ? useBoldFont.booleanValue() : false;
        List<OrderShipmentItemDTO.ButtonDTO> buttons = item.getButtons();
        if (buttons != null) {
            List<OrderShipmentItemDTO.ButtonDTO> list = buttons;
            arrayList = new ArrayList(C7714v.z(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(mapButtonToVO((OrderShipmentItemDTO.ButtonDTO) it.next()));
            }
        } else {
            arrayList = null;
        }
        return C7714v.a0(new OrderShipmentItemVO.AnnotationVO(hashCode, icon, iconColor, text, textColor, backgroundColor, booleanValue, arrayList));
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<OrderShipmentItemVO.AnnotationVO> invoke(@NotNull OrderShipmentItemDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return state instanceof OrderShipmentItemDTO.AnnotationDTO ? mapItemDTOtoVO((OrderShipmentItemDTO.AnnotationDTO) state) : K.f71697a;
    }
}
