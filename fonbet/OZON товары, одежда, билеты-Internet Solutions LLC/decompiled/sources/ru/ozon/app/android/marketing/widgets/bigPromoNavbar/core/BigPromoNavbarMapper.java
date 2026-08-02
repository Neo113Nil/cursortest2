package ru.ozon.app.android.marketing.widgets.bigPromoNavbar.core;

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
import ru.ozon.app.android.marketing.widgets.bigPromoNavbar.data.BigPromoNavbarDTO;
import ru.ozon.app.android.marketing.widgets.bigPromoNavbar.presentation.BigPromoNavbarVO;
import ru.ozon.app.android.marketing.widgets.blackfridaycounter.presentation.TickVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000b\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000b\u0010\u000fJ*\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0010\u001a\u00020\u00022\n\u0010\u0012\u001a\u00060\u0003j\u0002`\u0011H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/marketing/widgets/bigPromoNavbar/core/BigPromoNavbarMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/marketing/widgets/bigPromoNavbar/data/BigPromoNavbarDTO;", "Ll20/d;", "", "Lru/ozon/app/android/marketing/widgets/bigPromoNavbar/presentation/BigPromoNavbarVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "id", "toVo", "(Lru/ozon/app/android/marketing/widgets/bigPromoNavbar/data/BigPromoNavbarDTO;J)Lru/ozon/app/android/marketing/widgets/bigPromoNavbar/presentation/BigPromoNavbarVO;", "Lru/ozon/app/android/marketing/widgets/bigPromoNavbar/data/BigPromoNavbarDTO$TimerDTO;", "Lru/ozon/app/android/marketing/widgets/bigPromoNavbar/presentation/BigPromoNavbarVO$TimerVO;", "(Lru/ozon/app/android/marketing/widgets/bigPromoNavbar/data/BigPromoNavbarDTO$TimerDTO;)Lru/ozon/app/android/marketing/widgets/bigPromoNavbar/presentation/BigPromoNavbarVO$TimerVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/marketing/widgets/bigPromoNavbar/data/BigPromoNavbarDTO;Ll20/d;)Ljava/util/List;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BigPromoNavbarMapper implements Function2<BigPromoNavbarDTO, d, List<? extends BigPromoNavbarVO>> {
    private final BigPromoNavbarVO.TimerVO toVo(BigPromoNavbarDTO.TimerDTO timerDTO) {
        long millis = Instant.e(timerDTO.getDeadlineTimestamp()).getMillis() - (Instant.e(timerDTO.getServerTimestamp()).getMillis() - C2638a.a());
        return new BigPromoNavbarVO.TimerVO(timerDTO.getTintColor(), timerDTO.getBackgroundColor(), millis, new TickVO(millis).getIsFinished(), timerDTO.getTitle(), timerDTO.getTitleOnExpire(), timerDTO.getIcon());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<BigPromoNavbarVO> invoke(@NotNull BigPromoNavbarDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVo(state, widgetInfo.d().hashCode()));
    }

    private final BigPromoNavbarVO toVo(BigPromoNavbarDTO bigPromoNavbarDTO, long j11) {
        String backgroundImage = bigPromoNavbarDTO.getBackgroundImage();
        String cornerImage = bigPromoNavbarDTO.getCornerImage();
        OzonSpannableString ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(bigPromoNavbarDTO.getTitle());
        BigPromoNavbarVO.TimerVO vo = toVo(bigPromoNavbarDTO.getTimer());
        String backgroundImage2 = bigPromoNavbarDTO.getBackgroundImage();
        boolean z11 = !(backgroundImage2 == null || backgroundImage2.length() == 0);
        AtomActionDTO action = bigPromoNavbarDTO.getAction();
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, bigPromoNavbarDTO.getTrackingInfo()) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = bigPromoNavbarDTO.getTrackingInfo();
        return new BigPromoNavbarVO(j11, backgroundImage, cornerImage, ozonSpannableString, vo, z11, atomAction, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }
}
