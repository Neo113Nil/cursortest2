package ru.ozon.app.android.marketing.widgets.bigPromoCheckout.core;

import Bk.C2638a;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.marketing.widgets.bigPromoCheckout.data.BigPromoCheckoutDTO;
import ru.ozon.app.android.marketing.widgets.bigPromoCheckout.presentation.BigPromoCheckoutVO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00152*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001\u0015B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000b\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000b\u0010\u000fJ*\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0010\u001a\u00020\u00022\n\u0010\u0012\u001a\u00060\u0003j\u0002`\u0011H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/marketing/widgets/bigPromoCheckout/core/BigPromoCheckoutMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/marketing/widgets/bigPromoCheckout/data/BigPromoCheckoutDTO;", "Ll20/d;", "", "Lru/ozon/app/android/marketing/widgets/bigPromoCheckout/presentation/BigPromoCheckoutVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "id", "toVO", "(Lru/ozon/app/android/marketing/widgets/bigPromoCheckout/data/BigPromoCheckoutDTO;J)Lru/ozon/app/android/marketing/widgets/bigPromoCheckout/presentation/BigPromoCheckoutVO;", "Lru/ozon/app/android/marketing/widgets/bigPromoCheckout/data/BigPromoCheckoutDTO$TimerBadgeDTO;", "Lru/ozon/app/android/marketing/widgets/bigPromoCheckout/presentation/BigPromoCheckoutVO$TimerBadgeVO;", "(Lru/ozon/app/android/marketing/widgets/bigPromoCheckout/data/BigPromoCheckoutDTO$TimerBadgeDTO;)Lru/ozon/app/android/marketing/widgets/bigPromoCheckout/presentation/BigPromoCheckoutVO$TimerBadgeVO;", "state", "Lru/ozon/composer/network/widget/item/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/marketing/widgets/bigPromoCheckout/data/BigPromoCheckoutDTO;Ll20/d;)Ljava/util/List;", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BigPromoCheckoutMapper implements Function2<BigPromoCheckoutDTO, d, List<? extends BigPromoCheckoutVO>> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/marketing/widgets/bigPromoCheckout/core/BigPromoCheckoutMapper$Companion;", "", "<init>", "()V", "MILLISECONDS_IN_SECOND", "", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final BigPromoCheckoutVO.TimerBadgeVO toVO(BigPromoCheckoutDTO.TimerBadgeDTO timerBadgeDTO) {
        long a11 = C2638a.a();
        Long secondsLeft = timerBadgeDTO.getSecondsLeft();
        Long valueOf = secondsLeft != null ? Long.valueOf(secondsLeft.longValue() * 1000) : null;
        return new BigPromoCheckoutVO.TimerBadgeVO(timerBadgeDTO.getText(), timerBadgeDTO.getBackgroundColor(), timerBadgeDTO.getSecondsLeft(), timerBadgeDTO.getTimerStyle(), timerBadgeDTO.getOnExpiredText(), a11 + (valueOf != null ? valueOf.longValue() : 0L));
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<BigPromoCheckoutVO> invoke(@NotNull BigPromoCheckoutDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(state, widgetInfo.d().hashCode()));
    }

    private final BigPromoCheckoutVO toVO(BigPromoCheckoutDTO bigPromoCheckoutDTO, long j11) {
        TextDTO title = bigPromoCheckoutDTO.getTitle();
        TextDTO subtitle = bigPromoCheckoutDTO.getSubtitle();
        IconDTO icon = bigPromoCheckoutDTO.getIcon();
        String backgroundColor = bigPromoCheckoutDTO.getBackgroundColor();
        BigPromoCheckoutDTO.TimerBadgeDTO timerBadge = bigPromoCheckoutDTO.getTimerBadge();
        BigPromoCheckoutVO.TimerBadgeVO vo = timerBadge != null ? toVO(timerBadge) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = bigPromoCheckoutDTO.getTrackingInfo();
        return new BigPromoCheckoutVO(j11, title, subtitle, icon, backgroundColor, vo, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }
}
