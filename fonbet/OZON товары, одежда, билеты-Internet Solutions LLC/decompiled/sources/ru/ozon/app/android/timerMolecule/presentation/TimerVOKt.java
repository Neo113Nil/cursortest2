package ru.ozon.app.android.timerMolecule.presentation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import ru.ozon.app.android.pdp.common.ugc.timer.TimerDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0001¨\u0006\u0005"}, d2 = {"toVo", "Lru/ozon/app/android/timerMolecule/presentation/TimerVO;", "Lru/ozon/app/android/pdp/common/ugc/timer/TimerDTO;", "isFinished", "", "molecules_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TimerVOKt {
    public static final boolean isFinished(@NotNull TimerVO timerVO) {
        Intrinsics.checkNotNullParameter(timerVO, "<this>");
        return new DateTime().j(timerVO.getTimeDelta()).compareTo(timerVO.getEndTimestamp()) > 0;
    }

    @NotNull
    public static final TimerVO toVo(@NotNull TimerDTO timerDTO) {
        Intrinsics.checkNotNullParameter(timerDTO, "<this>");
        DateTime serverTimestamp = timerDTO.getServerTimestamp();
        DateTimeZone dateTimeZone = DateTimeZone.f78989a;
        DateTime p11 = serverTimestamp.p(dateTimeZone);
        long millis = p11.getMillis() - new DateTime().getMillis();
        TextDTO title = timerDTO.getTitle();
        DateTime p12 = timerDTO.getEndTimestamp().p(dateTimeZone);
        Intrinsics.checkNotNullExpressionValue(p12, "withZone(...)");
        return new TimerVO(title, p11, p12, millis, timerDTO.getBackgroundColor(), timerDTO.getCornerRadius());
    }
}
