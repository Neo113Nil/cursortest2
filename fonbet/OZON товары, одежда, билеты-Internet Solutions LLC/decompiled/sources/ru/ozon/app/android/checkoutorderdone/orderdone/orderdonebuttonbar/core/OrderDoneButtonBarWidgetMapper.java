package ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.core;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.data.OrderDoneButtonBarDTO;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.presentation.OrderDoneButtonBarVO;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/core/OrderDoneButtonBarWidgetMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/data/OrderDoneButtonBarDTO;", "Ll20/d;", "", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/presentation/OrderDoneButtonBarVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "id", "toVo", "(Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/data/OrderDoneButtonBarDTO;J)Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/presentation/OrderDoneButtonBarVO;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/data/OrderDoneButtonBarDTO;Ll20/d;)Ljava/util/List;", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OrderDoneButtonBarWidgetMapper implements Function2<OrderDoneButtonBarDTO, d, List<? extends OrderDoneButtonBarVO>> {
    private final OrderDoneButtonBarVO toVo(OrderDoneButtonBarDTO orderDoneButtonBarDTO, long j11) {
        BadgeDTO badge = orderDoneButtonBarDTO.getBadge();
        List<AtomDTO> buttons = orderDoneButtonBarDTO.getButtons();
        TextDTO text = orderDoneButtonBarDTO.getText();
        TextDTO copy$default = text != null ? TextDTO.copy$default(text, null, null, null, null, null, null, null, null, null, null, null, null, null, true, null, null, null, null, null, 516095, null) : null;
        OrderDoneButtonBarVO.PaddingVO paddingVO = new OrderDoneButtonBarVO.PaddingVO(UiExtKt.toPx(orderDoneButtonBarDTO.getPadding().getLeft()), UiExtKt.toPx(orderDoneButtonBarDTO.getPadding().getTop()), UiExtKt.toPx(orderDoneButtonBarDTO.getPadding().getRight()), UiExtKt.toPx(orderDoneButtonBarDTO.getPadding().getBottom()));
        OrderDoneButtonBarDTO.ButtonsLayout buttonsLayout = orderDoneButtonBarDTO.getButtonsLayout();
        if (buttonsLayout == null) {
            buttonsLayout = OrderDoneButtonBarDTO.ButtonsLayout.HORIZONTAL;
        }
        return new OrderDoneButtonBarVO(j11, badge, buttons, copy$default, paddingVO, buttonsLayout);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<OrderDoneButtonBarVO> invoke(@NotNull OrderDoneButtonBarDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVo(state, widgetInfo.d().hashCode()));
    }
}
