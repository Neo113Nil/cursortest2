package ru.ozon.app.android.marketing.widgets.blackFridayStatus.presentation.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import org.joda.time.Instant;
import ru.ozon.app.android.marketing.widgets.blackFridayStatus.data.TimerDTO;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toVo", "Lru/ozon/app/android/marketing/widgets/blackFridayStatus/presentation/model/TimerVO;", "Lru/ozon/app/android/marketing/widgets/blackFridayStatus/data/TimerDTO;", "marketing_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TimerVOKt {
    @NotNull
    public static final TimerVO toVo(@NotNull TimerDTO timerDTO) {
        Intrinsics.checkNotNullParameter(timerDTO, "<this>");
        return new TimerVO(Instant.e(timerDTO.getDeadlineTimestamp()).getMillis() - (Instant.e(timerDTO.getServerTimestamp()).getMillis() - new DateTime().getMillis()), timerDTO.getTextColor(), timerDTO.getBackgroundColor());
    }
}
