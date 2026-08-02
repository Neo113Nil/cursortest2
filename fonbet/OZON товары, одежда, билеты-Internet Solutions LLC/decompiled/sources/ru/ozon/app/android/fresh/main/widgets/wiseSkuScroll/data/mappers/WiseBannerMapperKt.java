package ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.data.mappers;

import WZ.t;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.data.WiseBannerDTO;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.vo.WiseBannerVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¨\u0006\u0007"}, d2 = {"toVO", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/vo/WiseBannerVO;", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/data/WiseBannerDTO;", "widgetId", "", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/vo/WiseBannerVO$BadgeVO;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class WiseBannerMapperKt {
    @NotNull
    public static final WiseBannerVO toVO(@NotNull WiseBannerDTO wiseBannerDTO, long j11) {
        Intrinsics.checkNotNullParameter(wiseBannerDTO, "<this>");
        TextDTO title = wiseBannerDTO.getTitle();
        String imageUrl = wiseBannerDTO.getImageUrl();
        String videoUrl = wiseBannerDTO.getVideoUrl();
        String videoUrl2 = wiseBannerDTO.getVideoUrl();
        boolean z11 = false;
        if (videoUrl2 != null && h.t(videoUrl2, ".m3u8", false)) {
            z11 = true;
        }
        String promoBadgeUrl = wiseBannerDTO.getPromoBadgeUrl();
        BadgeDTO adsBadge = wiseBannerDTO.getAdsBadge();
        WiseBannerVO.BadgeVO vo = adsBadge != null ? toVO(adsBadge, j11) : null;
        AtomActionDTO action = wiseBannerDTO.getAction();
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, null) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = wiseBannerDTO.getTrackingInfo();
        return new WiseBannerVO(title, imageUrl, videoUrl, z11, promoBadgeUrl, vo, atomAction, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }

    private static final WiseBannerVO.BadgeVO toVO(BadgeDTO badgeDTO, long j11) {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        CommonControlSettings common = badgeDTO.getCommon();
        t tVar = null;
        AtomAction atomAction = common != null ? common.toAtomAction() : null;
        CommonControlSettings common2 = badgeDTO.getCommon();
        if (common2 != null && (trackingInfo = common2.getTrackingInfo()) != null) {
            tVar = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null);
        }
        return new WiseBannerVO.BadgeVO(badgeDTO, atomAction, tVar);
    }
}
