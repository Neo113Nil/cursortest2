package ru.ozon.app.android.account.orders.orderProduct.mappers;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.orderProduct.data.dto.OrderProductItemDTO;
import ru.ozon.app.android.account.orders.orderProduct.viewObject.OrderProductSeparatorVO;
import ru.ozon.uni.atoms.data.common.Paddings;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/account/orders/orderProduct/mappers/OrderProductSeparatorMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/account/orders/orderProduct/data/dto/OrderProductItemDTO$SeparatorDTO;", "Ll20/d;", "", "Lru/ozon/app/android/account/orders/orderProduct/viewObject/OrderProductSeparatorVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "dto", "widgetInfo", "invoke", "(Lru/ozon/app/android/account/orders/orderProduct/data/dto/OrderProductItemDTO$SeparatorDTO;Ll20/d;)Ljava/util/List;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OrderProductSeparatorMapper implements Function2<OrderProductItemDTO.SeparatorDTO, d, List<? extends OrderProductSeparatorVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<OrderProductSeparatorVO> invoke(@NotNull OrderProductItemDTO.SeparatorDTO dto, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = ("orderProductSeparator_" + widgetInfo.hashCode()).hashCode();
        String backgroundColor = dto.getBackgroundColor();
        Paddings leftPadding = dto.getLeftPadding();
        if (leftPadding == null) {
            leftPadding = Paddings.PADDING_500;
        }
        Paddings paddings = leftPadding;
        Paddings rightPadding = dto.getRightPadding();
        if (rightPadding == null) {
            rightPadding = Paddings.NONE;
        }
        return C7714v.a0(new OrderProductSeparatorVO(hashCode, backgroundColor, paddings, rightPadding));
    }
}
