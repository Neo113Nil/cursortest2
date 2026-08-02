package ru.ozon.app.android.travel.feature.general.order.widgets.travelOrderListMobile.data.timer;

import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelOrderListMobile.data.TravelOrderListMobileDTO;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelOrderListMobile.presentation.timer.TravelOrderListTimerVO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/data/timer/TravelOrderListTimerMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/data/TravelOrderListMobileDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/presentation/timer/TravelOrderListTimerVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "widgetId", "item", "mapTimer", "(JLru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/data/TravelOrderListMobileDTO;)Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/presentation/timer/TravelOrderListTimerVO;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderListMobile/data/TravelOrderListMobileDTO;Ll20/d;)Ljava/util/List;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelOrderListTimerMapper implements Function2<TravelOrderListMobileDTO, d, List<? extends TravelOrderListTimerVO>> {
    private final TravelOrderListTimerVO mapTimer(long widgetId, TravelOrderListMobileDTO item) {
        if (item.getTimerTimeLeft() == null || item.getTimerAction() == null) {
            return null;
        }
        return new TravelOrderListTimerVO(widgetId, TimeUnit.SECONDS.toMillis(item.getTimerTimeLeft().intValue()) + System.currentTimeMillis(), AtomActionMapperKt.toAtomAction(item.getTimerAction(), null));
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TravelOrderListTimerVO> invoke(@NotNull TravelOrderListMobileDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        TravelOrderListTimerVO mapTimer = mapTimer(widgetInfo.d().hashCode(), state);
        List<TravelOrderListTimerVO> a02 = mapTimer != null ? C7714v.a0(mapTimer) : null;
        return a02 == null ? K.f71697a : a02;
    }
}
