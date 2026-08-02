package ru.ozon.app.android.travel.feature.tours.widgets.toursFlightOptions.data;

import android.os.SystemClock;
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
import ru.ozon.app.android.travel.feature.tours.widgets.toursFlightOptions.presentation.timer.ToursFlightOptionsTimerVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000f\u001a\u00020\u00022\n\u0010\u0011\u001a\u00060\u0003j\u0002`\u0010H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightOptions/data/ToursFlightOptionsTimerMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightOptions/data/ToursFlightOptionsDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightOptions/presentation/timer/ToursFlightOptionsTimerVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "timeout", "", "timeoutDate", "getTimeout", "(Ljava/lang/Long;Ljava/lang/String;)J", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/tours/widgets/toursFlightOptions/data/ToursFlightOptionsDTO;Ll20/d;)Ljava/util/List;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ToursFlightOptionsTimerMapper implements Function2<ToursFlightOptionsDTO, d, List<? extends ToursFlightOptionsTimerVO>> {
    private final long getTimeout(Long timeout, String timeoutDate) {
        if (timeout != null) {
            return timeout.longValue() + SystemClock.elapsedRealtime();
        }
        return (DateTime.i(timeoutDate).getMillis() + SystemClock.elapsedRealtime()) - new DateTime().getMillis();
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ToursFlightOptionsTimerVO> invoke(@NotNull ToursFlightOptionsDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        long timeout = getTimeout(state.getTimeoutMs(), state.getTimeoutDate());
        AtomAction atomAction = AtomActionMapperKt.toAtomAction(state.getTimeoutAction(), state.getTrackingInfo());
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        return C7714v.a0(new ToursFlightOptionsTimerVO(hashCode, timeout, atomAction, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null));
    }
}
