package ru.ozon.app.android.marketing.widgets.blackFridayStatus.presentation.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.blackFridayStatus.data.TimerDTO;
import ru.ozon.app.android.marketing.widgets.blackFridayStatus.data.TimerWithTitleDTO;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toVo", "Lru/ozon/app/android/marketing/widgets/blackFridayStatus/presentation/model/TimerWithTitleVO;", "Lru/ozon/app/android/marketing/widgets/blackFridayStatus/data/TimerWithTitleDTO;", "marketing_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TimerWithTitleVOKt {
    @NotNull
    public static final TimerWithTitleVO toVo(@NotNull TimerWithTitleDTO timerWithTitleDTO) {
        Intrinsics.checkNotNullParameter(timerWithTitleDTO, "<this>");
        TimerDTO timer = timerWithTitleDTO.getTimer();
        return new TimerWithTitleVO(timer != null ? TimerVOKt.toVo(timer) : null, timerWithTitleDTO.getTitle(), timerWithTitleDTO.getTitleOnExpire(), timerWithTitleDTO.getHideTimerOnExpire());
    }
}
