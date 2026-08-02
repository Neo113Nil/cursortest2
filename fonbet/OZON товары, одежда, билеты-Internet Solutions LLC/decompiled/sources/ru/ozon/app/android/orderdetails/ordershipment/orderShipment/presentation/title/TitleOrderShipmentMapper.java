package ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.title;

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

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/title/TitleOrderShipmentMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/OrderShipmentItemDTO;", "Ll20/d;", "", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/OrderShipmentItemVO$TitleVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/OrderShipmentItemDTO$Title;", "item", "mapDTOtoVO", "(Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/OrderShipmentItemDTO$Title;)Ljava/util/List;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/OrderShipmentItemDTO;Ll20/d;)Ljava/util/List;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TitleOrderShipmentMapper implements Function2<OrderShipmentItemDTO, d, List<? extends OrderShipmentItemVO.TitleVO>> {
    private final List<OrderShipmentItemVO.TitleVO> mapDTOtoVO(OrderShipmentItemDTO.Title item) {
        long hashCode = item.hashCode();
        String icon = item.getIcon();
        List<OrderShipmentItemDTO.TextChunk> chunks = item.getTitle().getChunks();
        List<OrderShipmentItemDTO.Line> lines = item.getLines();
        if (lines == null) {
            lines = K.f71697a;
        }
        ButtonV3Atom.LargeBorderlessButton button = item.getButton();
        String scrollWidgetId = item.getScrollWidgetId();
        return C7714v.a0(new OrderShipmentItemVO.TitleVO(hashCode, icon, chunks, lines, button, Integer.valueOf(scrollWidgetId != null ? scrollWidgetId.hashCode() : 0)));
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<OrderShipmentItemVO.TitleVO> invoke(@NotNull OrderShipmentItemDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return state instanceof OrderShipmentItemDTO.Title ? mapDTOtoVO((OrderShipmentItemDTO.Title) state) : K.f71697a;
    }
}
