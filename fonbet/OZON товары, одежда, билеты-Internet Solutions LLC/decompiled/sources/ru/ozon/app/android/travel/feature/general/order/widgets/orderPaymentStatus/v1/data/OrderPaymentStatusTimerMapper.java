package ru.ozon.app.android.travel.feature.general.order.widgets.orderPaymentStatus.v1.data;

import Kk.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.app.android.travel.feature.general.order.widgets.orderPaymentStatus.v1.presentation.timer.OrderPaymentStatusTimerVO;
import ru.ozon.app.android.travel.utils.extensions.DateExtensionsKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\u0003j\u0002`\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/orderPaymentStatus/v1/data/OrderPaymentStatusTimerMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/order/widgets/orderPaymentStatus/v1/data/OrderPaymentStatusDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/order/widgets/orderPaymentStatus/v1/presentation/timer/OrderPaymentStatusTimerVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/order/widgets/orderPaymentStatus/v1/data/OrderPaymentStatusDTO;Ll20/d;)Ljava/util/List;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OrderPaymentStatusTimerMapper implements Function2<OrderPaymentStatusDTO, d, List<? extends OrderPaymentStatusTimerVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<OrderPaymentStatusTimerVO> invoke(@NotNull OrderPaymentStatusDTO state, @NotNull d widgetInfo) {
        AtomActionDTO action;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        CommonControlSettings common = state.getCommon();
        AtomAction atomAction = (common == null || (action = common.getAction()) == null) ? null : AtomActionMapperKt.toAtomAction(action, state.getCommon().getTrackingInfo());
        if ((state.getEndTime() == null && state.getTimeLeft() == null) || atomAction == null) {
            return K.f71697a;
        }
        long a11 = c.a(widgetInfo.d(), "_timer");
        DateTime endTime = state.getEndTime();
        return C7714v.a0(new OrderPaymentStatusTimerVO(a11, endTime != null ? endTime.l(1000) : null, DateExtensionsKt.toTimestamp(state.getTimeLeft()), atomAction));
    }
}
