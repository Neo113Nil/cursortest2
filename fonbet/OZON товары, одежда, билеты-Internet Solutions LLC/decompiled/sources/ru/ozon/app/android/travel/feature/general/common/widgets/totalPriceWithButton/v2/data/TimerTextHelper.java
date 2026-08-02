package ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v2.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.travel.utils.timerFormatter.TimerFormatter;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ!\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/data/TimerTextHelper;", "", "timerFormatter", "Lru/ozon/app/android/travel/utils/timerFormatter/TimerFormatter;", "<init>", "(Lru/ozon/app/android/travel/utils/timerFormatter/TimerFormatter;)V", "format", "", "timeInSeconds", "", "getInitialTimerText", "Lru/ozon/uni/atoms/data/text/TextDTO;", "time", "", HammersV3BodyDTO.PLACEHOLDER, "(Ljava/lang/Integer;Lru/ozon/uni/atoms/data/text/TextDTO;)Lru/ozon/uni/atoms/data/text/TextDTO;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TimerTextHelper {

    @NotNull
    private final TimerFormatter timerFormatter;

    public TimerTextHelper(@NotNull TimerFormatter timerFormatter) {
        Intrinsics.checkNotNullParameter(timerFormatter, "timerFormatter");
        this.timerFormatter = timerFormatter;
    }

    @NotNull
    public final CharSequence format(long timeInSeconds) {
        return OzonSpannableStringKt.toOzonSpannableString(this.timerFormatter.format(timeInSeconds));
    }

    public final TextDTO getInitialTimerText(Integer time, TextDTO placeholder) {
        if (time == null || placeholder == null) {
            return null;
        }
        return TextDTO.copy$default(placeholder, OzonSpannableStringKt.toOzonSpannableString(format(time.intValue())), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null);
    }
}
