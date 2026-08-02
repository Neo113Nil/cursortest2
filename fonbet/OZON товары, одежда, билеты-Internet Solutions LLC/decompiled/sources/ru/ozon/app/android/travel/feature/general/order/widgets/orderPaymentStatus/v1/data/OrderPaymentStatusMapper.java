package ru.ozon.app.android.travel.feature.general.order.widgets.orderPaymentStatus.v1.data;

import WZ.t;
import android.content.Context;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.travel.feature.general.order.widgets.orderPaymentStatus.v1.data.OrderPaymentStatusDTO;
import ru.ozon.app.android.travel.feature.general.order.widgets.orderPaymentStatus.v1.presentation.OrderPaymentStatusVO;
import ru.ozon.app.android.travel.utils.extensions.DateExtensionsKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\f*\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/orderPaymentStatus/v1/data/OrderPaymentStatusMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/order/widgets/orderPaymentStatus/v1/data/OrderPaymentStatusDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/order/widgets/orderPaymentStatus/v1/presentation/OrderPaymentStatusVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/travel/feature/general/order/widgets/orderPaymentStatus/v1/data/OrderPaymentStatusDTO$WidgetPaddings;", "Lru/ozon/app/android/travel/feature/general/order/widgets/orderPaymentStatus/v1/presentation/OrderPaymentStatusVO$WidgetPaddings;", "toVO", "(Lru/ozon/app/android/travel/feature/general/order/widgets/orderPaymentStatus/v1/data/OrderPaymentStatusDTO$WidgetPaddings;Landroid/content/Context;)Lru/ozon/app/android/travel/feature/general/order/widgets/orderPaymentStatus/v1/presentation/OrderPaymentStatusVO$WidgetPaddings;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/order/widgets/orderPaymentStatus/v1/data/OrderPaymentStatusDTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OrderPaymentStatusMapper implements Function2<OrderPaymentStatusDTO, d, List<? extends OrderPaymentStatusVO>> {

    @NotNull
    private final Context context;

    public OrderPaymentStatusMapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final OrderPaymentStatusVO.WidgetPaddings toVO(OrderPaymentStatusDTO.WidgetPaddings widgetPaddings, Context context) {
        return new OrderPaymentStatusVO.WidgetPaddings(UiExtKt.toPx(widgetPaddings.getTop().getPx(), context), UiExtKt.toPx(widgetPaddings.getBottom().getPx(), context), UiExtKt.toPx(widgetPaddings.getLeft().getPx(), context), UiExtKt.toPx(widgetPaddings.getRight().getPx(), context));
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<OrderPaymentStatusVO> invoke(@NotNull OrderPaymentStatusDTO state, @NotNull d widgetInfo) {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        TextDTO title = state.getTitle();
        BadgeDTO price = state.getPrice();
        TextDTO subtitle = state.getSubtitle();
        TextDTO copy$default = subtitle != null ? TextDTO.copy$default(subtitle, null, null, null, null, null, null, null, null, null, null, null, null, null, true, null, null, null, null, null, 516095, null) : null;
        DateTime endTime = state.getEndTime();
        Integer timeLeft = state.getTimeLeft();
        Long valueOf = timeLeft != null ? Long.valueOf(DateExtensionsKt.toTimestamp(timeLeft.intValue())) : null;
        CommonControlSettings common = state.getCommon();
        t mapToTokenizedEvent$default = (common == null || (trackingInfo = common.getTrackingInfo()) == null) ? null : TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null);
        List<ButtonV3DTO> buttons = state.getButtons();
        IconButtonV3DTO infoButton = state.getInfoButton();
        OrderPaymentStatusDTO.WidgetPaddings paddings = state.getPaddings();
        return C7714v.a0(new OrderPaymentStatusVO(hashCode, title, price, copy$default, endTime, valueOf, mapToTokenizedEvent$default, buttons, infoButton, paddings != null ? toVO(paddings, this.context) : null));
    }
}
