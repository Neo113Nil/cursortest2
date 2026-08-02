package ru.ozon.app.android.travel.feature.general.booking.widgets.modalCheckoutTimeLimit.data;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.modalCheckoutTimeLimit.presentation.ModalCheckoutTimeLimitVO;
import ru.ozon.app.android.travel.utils.timerFormatter.TimerFormatter;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0011\u001a\u00020\u00022\n\u0010\u0013\u001a\u00060\u0003j\u0002`\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/modalCheckoutTimeLimit/data/ModalCheckoutTimeLimitMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/modalCheckoutTimeLimit/data/ModalCheckoutTimeLimitDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/booking/widgets/modalCheckoutTimeLimit/presentation/ModalCheckoutTimeLimitVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/travel/utils/timerFormatter/TimerFormatter;", "timerFormatter", "<init>", "(Lru/ozon/app/android/travel/utils/timerFormatter/TimerFormatter;)V", "", "time", "Lru/ozon/uni/atoms/data/text/TextDTO;", HammersV3BodyDTO.PLACEHOLDER, "getInitialTimerText", "(Ljava/lang/Integer;Lru/ozon/uni/atoms/data/text/TextDTO;)Lru/ozon/uni/atoms/data/text/TextDTO;", "state", "Lru/ozon/composer/network/widget/item/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/modalCheckoutTimeLimit/data/ModalCheckoutTimeLimitDTO;Ll20/d;)Ljava/util/List;", "", "timeInSeconds", "", "format", "(J)Ljava/lang/CharSequence;", "Lru/ozon/app/android/travel/utils/timerFormatter/TimerFormatter;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ModalCheckoutTimeLimitMapper implements Function2<ModalCheckoutTimeLimitDTO, d, List<? extends ModalCheckoutTimeLimitVO>> {

    @NotNull
    private final TimerFormatter timerFormatter;

    public ModalCheckoutTimeLimitMapper(@NotNull TimerFormatter timerFormatter) {
        Intrinsics.checkNotNullParameter(timerFormatter, "timerFormatter");
        this.timerFormatter = timerFormatter;
    }

    private final TextDTO getInitialTimerText(Integer time, TextDTO placeholder) {
        if (time == null || placeholder == null) {
            return null;
        }
        return TextDTO.copy$default(placeholder, OzonSpannableStringKt.toOzonSpannableString(format(time.intValue())), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null);
    }

    @NotNull
    public final CharSequence format(long timeInSeconds) {
        return OzonSpannableStringKt.toOzonSpannableString(this.timerFormatter.format(timeInSeconds));
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ModalCheckoutTimeLimitVO> invoke(@NotNull ModalCheckoutTimeLimitDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        TextDTO title = state.getTitle();
        TextDTO initialTimerText = getInitialTimerText(state.getTimeToPay(), state.getTimeToPayText());
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        return C7714v.a0(new ModalCheckoutTimeLimitVO(hashCode, initialTimerText, title, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null));
    }
}
