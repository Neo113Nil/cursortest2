package ru.ozon.app.android.travel.feature.general.order.widgets.travelOrderNavContent.data;

import WZ.t;
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
import ru.ozon.app.android.travel.feature.general.order.widgets.travelOrderNavContent.data.TravelOrderNavContentDTO;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelOrderNavContent.presentation.TravelOrderNavContentVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000b\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000b\u0010\u000fJ\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u0010*\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J&\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderNavContent/data/TravelOrderNavContentMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderNavContent/data/TravelOrderNavContentDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderNavContent/presentation/TravelOrderNavContentVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "stateId", "toVO", "(Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderNavContent/data/TravelOrderNavContentDTO;Ljava/lang/String;)Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderNavContent/presentation/TravelOrderNavContentVO;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderNavContent/data/TravelOrderNavContentDTO$DateTimeInfo;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderNavContent/presentation/TravelOrderNavContentVO$DateTimeInfoVO;", "(Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderNavContent/data/TravelOrderNavContentDTO$DateTimeInfo;)Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderNavContent/presentation/TravelOrderNavContentVO$DateTimeInfoVO;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderNavContent/presentation/TravelOrderNavContentVO$DateTimeItemVO;", "toLeftTimeItemVO", "(Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderNavContent/data/TravelOrderNavContentDTO$DateTimeInfo;)Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderNavContent/presentation/TravelOrderNavContentVO$DateTimeItemVO;", "toRightTimeItemVO", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderNavContent/data/TravelOrderNavContentDTO;Ll20/d;)Ljava/util/List;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelOrderNavContentMapper implements Function2<TravelOrderNavContentDTO, d, List<? extends TravelOrderNavContentVO>> {
    private final TravelOrderNavContentVO.DateTimeItemVO toLeftTimeItemVO(TravelOrderNavContentDTO.DateTimeInfo dateTimeInfo) {
        return new TravelOrderNavContentVO.DateTimeItemVO(dateTimeInfo.getAspect(), dateTimeInfo.getFromTitle(), dateTimeInfo.getFromSubtitle());
    }

    private final TravelOrderNavContentVO.DateTimeItemVO toRightTimeItemVO(TravelOrderNavContentDTO.DateTimeInfo dateTimeInfo) {
        return new TravelOrderNavContentVO.DateTimeItemVO(dateTimeInfo.getAspect(), dateTimeInfo.getToTitle(), dateTimeInfo.getToSubtitle());
    }

    private final TravelOrderNavContentVO toVO(TravelOrderNavContentDTO travelOrderNavContentDTO, String str) {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        AtomActionDTO action;
        long hashCode = str.hashCode();
        TextDTO title = travelOrderNavContentDTO.getTitle();
        IconDTO icon = travelOrderNavContentDTO.getIcon();
        TextDTO subtitle = travelOrderNavContentDTO.getSubtitle();
        CommonControlSettings common = travelOrderNavContentDTO.getCommon();
        AtomAction atomAction = (common == null || (action = common.getAction()) == null) ? null : AtomActionMapperKt.toAtomAction(action, travelOrderNavContentDTO.getCommon().getTrackingInfo());
        CommonControlSettings common2 = travelOrderNavContentDTO.getCommon();
        t mapToTokenizedEvent$default = (common2 == null || (trackingInfo = common2.getTrackingInfo()) == null) ? null : TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null);
        TravelOrderNavContentDTO.DateTimeInfo dateTimeInfo = travelOrderNavContentDTO.getDateTimeInfo();
        return new TravelOrderNavContentVO(hashCode, title, icon, subtitle, atomAction, mapToTokenizedEvent$default, dateTimeInfo != null ? toVO(dateTimeInfo) : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TravelOrderNavContentVO> invoke(@NotNull TravelOrderNavContentDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(state, widgetInfo.d()));
    }

    private final TravelOrderNavContentVO.DateTimeInfoVO toVO(TravelOrderNavContentDTO.DateTimeInfo dateTimeInfo) {
        return new TravelOrderNavContentVO.DateTimeInfoVO(toLeftTimeItemVO(dateTimeInfo), toRightTimeItemVO(dateTimeInfo), dateTimeInfo.getIcon());
    }
}
