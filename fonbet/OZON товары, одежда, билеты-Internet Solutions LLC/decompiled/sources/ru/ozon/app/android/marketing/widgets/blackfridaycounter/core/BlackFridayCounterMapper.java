package ru.ozon.app.android.marketing.widgets.blackfridaycounter.core;

import Bk.C2638a;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Instant;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.marketing.widgets.blackfridaycounter.data.BlackFridayCounterDTO;
import ru.ozon.app.android.marketing.widgets.blackfridaycounter.presentation.BlackFridayCounterVO;
import ru.ozon.app.android.marketing.widgets.blackfridaycounter.presentation.TickVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000b\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000b\u0010\u000fJ\u0013\u0010\u000b\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u000b\u0010\u0012J*\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0013\u001a\u00020\u00022\n\u0010\u0015\u001a\u00060\u0003j\u0002`\u0014H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/marketing/widgets/blackfridaycounter/core/BlackFridayCounterMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/marketing/widgets/blackfridaycounter/data/BlackFridayCounterDTO;", "Ll20/d;", "", "Lru/ozon/app/android/marketing/widgets/blackfridaycounter/presentation/BlackFridayCounterVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "id", "toVo", "(Lru/ozon/app/android/marketing/widgets/blackfridaycounter/data/BlackFridayCounterDTO;J)Lru/ozon/app/android/marketing/widgets/blackfridaycounter/presentation/BlackFridayCounterVO;", "Lru/ozon/app/android/marketing/widgets/blackfridaycounter/data/BlackFridayCounterDTO$TimerDTO;", "Lru/ozon/app/android/marketing/widgets/blackfridaycounter/presentation/BlackFridayCounterVO$TimerVO;", "(Lru/ozon/app/android/marketing/widgets/blackfridaycounter/data/BlackFridayCounterDTO$TimerDTO;)Lru/ozon/app/android/marketing/widgets/blackfridaycounter/presentation/BlackFridayCounterVO$TimerVO;", "Lru/ozon/app/android/marketing/widgets/blackfridaycounter/data/BlackFridayCounterDTO$FooterDTO;", "Lru/ozon/app/android/marketing/widgets/blackfridaycounter/presentation/BlackFridayCounterVO$FooterVO;", "(Lru/ozon/app/android/marketing/widgets/blackfridaycounter/data/BlackFridayCounterDTO$FooterDTO;)Lru/ozon/app/android/marketing/widgets/blackfridaycounter/presentation/BlackFridayCounterVO$FooterVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/marketing/widgets/blackfridaycounter/data/BlackFridayCounterDTO;Ll20/d;)Ljava/util/List;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BlackFridayCounterMapper implements Function2<BlackFridayCounterDTO, d, List<? extends BlackFridayCounterVO>> {
    private final BlackFridayCounterVO.TimerVO toVo(BlackFridayCounterDTO.TimerDTO timerDTO) {
        long millis = Instant.e(timerDTO.getDeadlineTimestamp()).getMillis() - (Instant.e(timerDTO.getServerTimestamp()).getMillis() - C2638a.a());
        return new BlackFridayCounterVO.TimerVO(timerDTO.getTintColor(), millis, new TickVO(millis).getIsFinished(), timerDTO.getTitle(), timerDTO.getTitleOnExpire(), timerDTO.getBackgroundColor());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<BlackFridayCounterVO> invoke(@NotNull BlackFridayCounterDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVo(state, widgetInfo.d().hashCode()));
    }

    private final BlackFridayCounterVO toVo(BlackFridayCounterDTO blackFridayCounterDTO, long j11) {
        String backgroundImage = blackFridayCounterDTO.getBackgroundImage();
        String titleImage = blackFridayCounterDTO.getTitleImage();
        BlackFridayCounterVO.TimerVO vo = toVo(blackFridayCounterDTO.getTimer());
        BlackFridayCounterDTO.FooterDTO footer = blackFridayCounterDTO.getFooter();
        BlackFridayCounterVO.FooterVO vo2 = footer != null ? toVo(footer) : null;
        AtomActionDTO action = blackFridayCounterDTO.getAction();
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, blackFridayCounterDTO.getTrackingInfo()) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = blackFridayCounterDTO.getTrackingInfo();
        return new BlackFridayCounterVO(j11, backgroundImage, titleImage, vo, vo2, atomAction, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }

    private final BlackFridayCounterVO.FooterVO toVo(BlackFridayCounterDTO.FooterDTO footerDTO) {
        boolean z11;
        boolean z12;
        String tintColor = footerDTO.getTintColor();
        String title = footerDTO.getTitle();
        Boolean showDisclosure = footerDTO.getShowDisclosure();
        if (showDisclosure != null) {
            z11 = showDisclosure.booleanValue();
            z12 = false;
        } else {
            z11 = false;
            z12 = false;
        }
        boolean isHidden = footerDTO.isHidden();
        Boolean isPremium = footerDTO.isPremium();
        if (isPremium != null) {
            z12 = isPremium.booleanValue();
        }
        AtomActionDTO action = footerDTO.getAction();
        return new BlackFridayCounterVO.FooterVO(tintColor, title, z11, isHidden, z12, action != null ? AtomActionMapperKt.toAtomAction(action, footerDTO.getTrackingInfo()) : null);
    }
}
