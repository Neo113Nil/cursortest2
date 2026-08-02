package ru.ozon.app.android.marketing.widgets.bigPromoPDP.core;

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
import ru.ozon.app.android.marketing.widgets.bigPromoPDP.data.BigPromoPDPDTO;
import ru.ozon.app.android.marketing.widgets.bigPromoPDP.presentation.BigPromoPDPVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00152*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001\u0015B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000b\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000b\u0010\u000fJ*\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0010\u001a\u00020\u00022\n\u0010\u0012\u001a\u00060\u0003j\u0002`\u0011H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/marketing/widgets/bigPromoPDP/core/BigPromoPDPMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/marketing/widgets/bigPromoPDP/data/BigPromoPDPDTO;", "Ll20/d;", "", "Lru/ozon/app/android/marketing/widgets/bigPromoPDP/presentation/BigPromoPDPVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "id", "toVo", "(Lru/ozon/app/android/marketing/widgets/bigPromoPDP/data/BigPromoPDPDTO;J)Lru/ozon/app/android/marketing/widgets/bigPromoPDP/presentation/BigPromoPDPVO;", "Lru/ozon/app/android/marketing/widgets/bigPromoPDP/data/BigPromoPDPDTO$TimerBadgeDTO;", "Lru/ozon/app/android/marketing/widgets/bigPromoPDP/presentation/BigPromoPDPVO$TimerBadgeVO;", "(Lru/ozon/app/android/marketing/widgets/bigPromoPDP/data/BigPromoPDPDTO$TimerBadgeDTO;)Lru/ozon/app/android/marketing/widgets/bigPromoPDP/presentation/BigPromoPDPVO$TimerBadgeVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/marketing/widgets/bigPromoPDP/data/BigPromoPDPDTO;Ll20/d;)Ljava/util/List;", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BigPromoPDPMapper implements Function2<BigPromoPDPDTO, d, List<? extends BigPromoPDPVO>> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/marketing/widgets/bigPromoPDP/core/BigPromoPDPMapper$Companion;", "", "<init>", "()V", "MILLISECONDS_TO_SECONDS", "", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final BigPromoPDPVO.TimerBadgeVO toVo(BigPromoPDPDTO.TimerBadgeDTO timerBadgeDTO) {
        long a11 = C2638a.a();
        Long secondsLeft = timerBadgeDTO.getSecondsLeft();
        Long valueOf = secondsLeft != null ? Long.valueOf(secondsLeft.longValue() * 1000) : null;
        long longValue = valueOf != null ? valueOf.longValue() : 0L;
        return new BigPromoPDPVO.TimerBadgeVO(timerBadgeDTO.getTimerText(), timerBadgeDTO.getSecondsLeft(), timerBadgeDTO.getTimerStyle(), timerBadgeDTO.getBackgroundColor(), timerBadgeDTO.getOnExpiredText(), a11 + longValue);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<BigPromoPDPVO> invoke(@NotNull BigPromoPDPDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVo(state, widgetInfo.d().hashCode()));
    }

    private final BigPromoPDPVO toVo(BigPromoPDPDTO bigPromoPDPDTO, long j11) {
        CommonControlSettings common;
        AtomActionDTO action;
        Integer titleStartPadding;
        Integer bottomPadding;
        Integer topPadding;
        TextDTO title = bigPromoPDPDTO.getTitle();
        IconDTO chevronIcon = bigPromoPDPDTO.getChevronIcon();
        TextDTO stockNumber = bigPromoPDPDTO.getStockNumber();
        TextDTO stockText = bigPromoPDPDTO.getStockText();
        ButtonV3DTO rightButton = bigPromoPDPDTO.getRightButton();
        ImageDTO logo = bigPromoPDPDTO.getLogo();
        BigPromoPDPDTO.TimerBadgeDTO timerBadge = bigPromoPDPDTO.getTimerBadge();
        BigPromoPDPVO.TimerBadgeVO vo = timerBadge != null ? toVo(timerBadge) : null;
        BigPromoPDPDTO.AnimatedCounterDTO counter = bigPromoPDPDTO.getCounter();
        AtomActionDTO action2 = bigPromoPDPDTO.getAction();
        AtomAction atomAction = action2 != null ? AtomActionMapperKt.toAtomAction(action2, bigPromoPDPDTO.getTrackingInfo()) : null;
        BigPromoPDPDTO.PaddingsDTO paddings = bigPromoPDPDTO.getPaddings();
        int i11 = 8;
        int intValue = (paddings == null || (topPadding = paddings.getTopPadding()) == null) ? 8 : topPadding.intValue();
        BigPromoPDPDTO.PaddingsDTO paddings2 = bigPromoPDPDTO.getPaddings();
        if (paddings2 != null && (bottomPadding = paddings2.getBottomPadding()) != null) {
            i11 = bottomPadding.intValue();
        }
        BigPromoPDPDTO.PaddingsDTO paddings3 = bigPromoPDPDTO.getPaddings();
        BigPromoPDPVO.PaddingsVO paddingsVO = new BigPromoPDPVO.PaddingsVO(intValue, i11, (paddings3 == null || (titleStartPadding = paddings3.getTitleStartPadding()) == null) ? 4 : titleStartPadding.intValue());
        String widgetBackgroundColor = bigPromoPDPDTO.getWidgetBackgroundColor();
        ButtonV3DTO rightButton2 = bigPromoPDPDTO.getRightButton();
        AtomAction atomAction2 = (rightButton2 == null || (common = rightButton2.getCommon()) == null || (action = common.getAction()) == null) ? null : AtomActionMapperKt.toAtomAction(action, bigPromoPDPDTO.getTrackingInfo());
        Map<String, TokenizedTrackingInfo> trackingInfo = bigPromoPDPDTO.getTrackingInfo();
        return new BigPromoPDPVO(j11, logo, counter, title, stockText, stockNumber, chevronIcon, rightButton, vo, paddingsVO, atomAction, atomAction2, widgetBackgroundColor, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null, false, 16384, null);
    }
}
