package ru.ozon.app.android.regulardraw.widgets.lotteryInformation.core;

import WZ.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.pdp.ui.compose.time.StableDateTime;
import ru.ozon.app.android.pdp.ui.compose.time.StableTimeWrappersKt;
import ru.ozon.app.android.regulardraw.ui.button.MorkovskShadowButtonDTO;
import ru.ozon.app.android.regulardraw.ui.currencyBadge.MorkovskCurrencyBadgeDTO;
import ru.ozon.app.android.regulardraw.ui.currencyBadge.MorkovskCurrencyBadgeVO;
import ru.ozon.app.android.regulardraw.ui.currencyBadge.MorkovskCurrencyBadgeVOKt;
import ru.ozon.app.android.regulardraw.widgets.lotteryInformation.data.LotteryInformationDTO;
import ru.ozon.app.android.regulardraw.widgets.lotteryInformation.presentation.LotteryInformationVI;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\r\u001a\u00020\f*\u00020\t2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\r\u001a\u00020\u0010*\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u0011J\u001b\u0010\u0014\u001a\u00020\u0013*\u00020\u00122\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J&\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/core/LotteryInformationMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/data/LotteryInformationDTO;", "Ll20/d;", "", "Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/presentation/LotteryInformationVI;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/data/LotteryInformationDTO$MainInfo$Info;", "", "id", "Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/presentation/LotteryInformationVI$ActiveMainInfo$Item;", "toVI", "(Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/data/LotteryInformationDTO$MainInfo$Info;J)Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/presentation/LotteryInformationVI$ActiveMainInfo$Item;", "Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/data/LotteryInformationDTO$MainInfo$TicketsPurchaseExp;", "Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/presentation/LotteryInformationVI$ActiveMainInfo$TicketsPurchaseTimerData;", "(Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/data/LotteryInformationDTO$MainInfo$TicketsPurchaseExp;J)Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/presentation/LotteryInformationVI$ActiveMainInfo$TicketsPurchaseTimerData;", "Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/data/LotteryInformationDTO$MainInfo;", "Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/presentation/LotteryInformationVI$EmptyMainInfo;", "emptyInfo", "(Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/data/LotteryInformationDTO$MainInfo;J)Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/presentation/LotteryInformationVI$EmptyMainInfo;", "state", "info", "invoke", "(Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/data/LotteryInformationDTO;Ll20/d;)Ljava/util/List;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class LotteryInformationMapper implements Function2<LotteryInformationDTO, d, List<? extends LotteryInformationVI>> {
    private final LotteryInformationVI.EmptyMainInfo emptyInfo(LotteryInformationDTO.MainInfo mainInfo, long j11) {
        String emptyLotteryImagePath = mainInfo.getEmptyLotteryImagePath();
        if (emptyLotteryImagePath == null) {
            emptyLotteryImagePath = "";
        }
        Map<String, TokenizedTrackingInfo> trackingInfo = mainInfo.getTrackingInfo();
        return new LotteryInformationVI.EmptyMainInfo(emptyLotteryImagePath, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }

    private final LotteryInformationVI.ActiveMainInfo.Item toVI(LotteryInformationDTO.MainInfo.Info info, long j11) {
        TextDTO title = info.getTitle();
        String subtitle = info.getSubtitle();
        Map<String, TokenizedTrackingInfo> trackingInfo = info.getTrackingInfo();
        return new LotteryInformationVI.ActiveMainInfo.Item(title, subtitle, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00de  */
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<LotteryInformationVI> invoke(@NotNull LotteryInformationDTO state, @NotNull d info) {
        LotteryInformationVI.MainInfo emptyInfo;
        LotteryInformationVI.MainInfo mainInfo;
        LotteryInformationVI.ActiveMainInfo.TicketsPurchaseTimerData vi2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        long hashCode = info.d().hashCode();
        LotteryInformationDTO.Banner banner = state.getBanner();
        String imagePath = banner.getImagePath();
        TextDTO subtitle = banner.getSubtitle();
        MorkovskCurrencyBadgeDTO ticketsAmount = banner.getTicketsAmount();
        MorkovskCurrencyBadgeVO map = ticketsAmount != null ? MorkovskCurrencyBadgeVOKt.map(ticketsAmount, MorkovskCurrencyBadgeVO.Size.DEFAULT) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = banner.getTrackingInfo();
        LotteryInformationVI.Banner banner2 = new LotteryInformationVI.Banner(imagePath, subtitle, map, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null);
        LotteryInformationDTO.MainInfo mainInfo2 = state.getMainInfo();
        List<LotteryInformationDTO.MainInfo.Info> infos = mainInfo2.getInfos();
        if (infos != null) {
            List<LotteryInformationDTO.MainInfo.Info> list = infos;
            ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(toVI((LotteryInformationDTO.MainInfo.Info) it.next(), hashCode));
            }
            String imagePath2 = mainInfo2.getImagePath();
            if (imagePath2 == null) {
                emptyInfo = emptyInfo(mainInfo2, hashCode);
            } else {
                BadgeDTO badge = mainInfo2.getBadge();
                if (badge == null) {
                    emptyInfo = emptyInfo(mainInfo2, hashCode);
                } else {
                    LotteryInformationDTO.MainInfo.TicketsPurchaseExp ticketsPurchaseExp = mainInfo2.getTicketsPurchaseExp();
                    if (ticketsPurchaseExp != null && (vi2 = toVI(ticketsPurchaseExp, hashCode)) != null) {
                        AtomActionDTO action = mainInfo2.getAction();
                        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, mainInfo2.getTrackingInfo()) : null;
                        Map<String, TokenizedTrackingInfo> trackingInfo2 = mainInfo2.getTrackingInfo();
                        mainInfo = new LotteryInformationVI.ActiveMainInfo(arrayList, imagePath2, badge, vi2, atomAction, trackingInfo2 != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo2, Long.valueOf(hashCode), null, 2, null) : null);
                        MorkovskShadowButtonDTO button = state.getButton();
                        Map<String, TokenizedTrackingInfo> trackingInfo3 = state.getTrackingInfo();
                        return C7714v.a0(new LotteryInformationVI(hashCode, banner2, mainInfo, button, trackingInfo3 != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo3, Long.valueOf(hashCode), null, 2, null) : null));
                    }
                    emptyInfo = emptyInfo(mainInfo2, hashCode);
                }
            }
        } else {
            emptyInfo = emptyInfo(mainInfo2, hashCode);
        }
        mainInfo = emptyInfo;
        MorkovskShadowButtonDTO button2 = state.getButton();
        Map<String, TokenizedTrackingInfo> trackingInfo32 = state.getTrackingInfo();
        return C7714v.a0(new LotteryInformationVI(hashCode, banner2, mainInfo, button2, trackingInfo32 != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo32, Long.valueOf(hashCode), null, 2, null) : null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [Tg.b] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [WZ.t] */
    /* JADX WARN: Type inference failed for: r5v5 */
    private final LotteryInformationVI.ActiveMainInfo.TicketsPurchaseTimerData toVI(LotteryInformationDTO.MainInfo.TicketsPurchaseExp ticketsPurchaseExp, long j11) {
        StableDateTime stableDateTime;
        String str;
        ?? r52;
        ?? r42;
        DateTime date = ticketsPurchaseExp.getDate();
        if (date != null) {
            stableDateTime = StableTimeWrappersKt.stable(date);
            str = null;
        } else {
            stableDateTime = null;
            str = null;
        }
        String timerText = ticketsPurchaseExp.getTimerText();
        String str2 = str;
        TextDTO text = ticketsPurchaseExp.getText();
        AtomActionDTO action = ticketsPurchaseExp.getAction();
        Object atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, ticketsPurchaseExp.getTrackingInfo()) : str2;
        Map<String, TokenizedTrackingInfo> trackingInfo = ticketsPurchaseExp.getTrackingInfo();
        if (trackingInfo != null) {
            t tokenizedEvent$default = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), str2, 2, str2);
            r42 = atomAction;
            r52 = tokenizedEvent$default;
        } else {
            Object obj = atomAction;
            r52 = str2;
            r42 = obj;
        }
        return new LotteryInformationVI.ActiveMainInfo.TicketsPurchaseTimerData(stableDateTime, timerText, text, r42, r52);
    }
}
