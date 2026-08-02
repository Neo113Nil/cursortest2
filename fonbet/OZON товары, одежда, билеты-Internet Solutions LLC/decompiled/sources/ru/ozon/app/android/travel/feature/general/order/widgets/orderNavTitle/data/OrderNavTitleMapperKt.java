package ru.ozon.app.android.travel.feature.general.order.widgets.orderNavTitle.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.order.widgets.orderNavTitle.data.OrderNavTitleDTO;
import ru.ozon.app.android.travel.feature.general.order.widgets.orderNavTitle.presentation.OrderNavTitleVO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\f\u0010\u0000\u001a\u00020\u0005*\u00020\u0006H\u0002¨\u0006\u0007"}, d2 = {"toVO", "Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavTitle/presentation/OrderNavTitleVO;", "Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavTitle/data/OrderNavTitleDTO;", "id", "", "Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavTitle/presentation/OrderNavTitleVO$TextColors;", "Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavTitle/data/OrderNavTitleDTO$TextColorsDTO;", "order_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OrderNavTitleMapperKt {
    @NotNull
    public static final OrderNavTitleVO toVO(@NotNull OrderNavTitleDTO orderNavTitleDTO, long j11) {
        OrderNavTitleDTO.TextColorsDTO colors;
        Intrinsics.checkNotNullParameter(orderNavTitleDTO, "<this>");
        TextDTO text = orderNavTitleDTO.getTitle().getText();
        OrderNavTitleVO.TextColors vo = toVO(orderNavTitleDTO.getTitle().getColors());
        OrderNavTitleDTO.TextElementDTO subtitle = orderNavTitleDTO.getSubtitle();
        OrderNavTitleVO.TextColors textColors = null;
        TextDTO text2 = subtitle != null ? subtitle.getText() : null;
        OrderNavTitleDTO.TextElementDTO subtitle2 = orderNavTitleDTO.getSubtitle();
        if (subtitle2 != null && (colors = subtitle2.getColors()) != null) {
            textColors = toVO(colors);
        }
        return new OrderNavTitleVO(j11, text, vo, text2, textColors, 0.0f, 32, null);
    }

    private static final OrderNavTitleVO.TextColors toVO(OrderNavTitleDTO.TextColorsDTO textColorsDTO) {
        return new OrderNavTitleVO.TextColors(textColorsDTO.getExpanded(), textColorsDTO.getCollapsed());
    }
}
