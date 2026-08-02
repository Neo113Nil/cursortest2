package ru.ozon.app.android.travel.feature.avia.widgets.aviaBookedTicketInfo.data;

import WZ.t;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaBookedTicketInfo.presentation.AviaBookedTicketInfoVO;
import ru.ozon.app.android.travel.utils.timerFormatter.TimerFormatter;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000b\u001a\u00020\u00022\n\u0010\r\u001a\u00060\u0003j\u0002`\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaBookedTicketInfo/data/AviaBookedTicketInfoMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaBookedTicketInfo/data/AviaBookedTicketInfoDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaBookedTicketInfo/presentation/AviaBookedTicketInfoVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/travel/utils/timerFormatter/TimerFormatter;", "timerFormatter", "<init>", "(Lru/ozon/app/android/travel/utils/timerFormatter/TimerFormatter;)V", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaBookedTicketInfo/data/AviaBookedTicketInfoDTO;Ll20/d;)Ljava/util/List;", "", "ms", "", "formattedTimerText", "(J)Ljava/lang/String;", "Lru/ozon/app/android/travel/utils/timerFormatter/TimerFormatter;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaBookedTicketInfoMapper implements Function2<AviaBookedTicketInfoDTO, d, List<? extends AviaBookedTicketInfoVO>> {

    @NotNull
    private final TimerFormatter timerFormatter;

    public AviaBookedTicketInfoMapper(@NotNull TimerFormatter timerFormatter) {
        Intrinsics.checkNotNullParameter(timerFormatter, "timerFormatter");
        this.timerFormatter = timerFormatter;
    }

    @NotNull
    public final String formattedTimerText(long ms2) {
        return this.timerFormatter.format(ms2);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<AviaBookedTicketInfoVO> invoke(@NotNull AviaBookedTicketInfoDTO state, @NotNull d widgetInfo) {
        AtomAction atomAction;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        BadgeDTO payUntilBadge = state.getPayUntilBadge();
        AtomActionDTO timeOutAction = state.getTimeOutAction();
        t tVar = null;
        AtomAction atomAction2 = timeOutAction != null ? AtomActionMapperKt.toAtomAction(timeOutAction, state.getTrackingInfo()) : null;
        Long timeToPay = state.getTimeToPay();
        Long valueOf = timeToPay != null ? Long.valueOf(TimeUnit.SECONDS.toMillis(timeToPay.longValue())) : null;
        long currentTimeMillis = System.currentTimeMillis();
        TextDTO title = state.getTitle();
        CellDTO flightCell = state.getFlightCell();
        flightCell.setTagSupported(true);
        Unit unit = Unit.f71690a;
        List<BadgeDTO> badges = state.getBadges();
        List<BadgeDTO> badges2 = state.getBadges();
        boolean z11 = true ^ (badges2 == null || badges2.isEmpty());
        AtomActionDTO clickAction = state.getClickAction();
        AtomAction atomAction3 = clickAction != null ? AtomActionMapperKt.toAtomAction(clickAction, state.getTrackingInfo()) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        if (trackingInfo != null) {
            atomAction = atomAction2;
            tVar = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null);
        } else {
            atomAction = atomAction2;
        }
        return C7714v.a0(new AviaBookedTicketInfoVO(hashCode, payUntilBadge, atomAction, valueOf, currentTimeMillis, title, flightCell, badges, z11, atomAction3, tVar, state.getBackgroundColor(), state.getShowSkeleton()));
    }
}
