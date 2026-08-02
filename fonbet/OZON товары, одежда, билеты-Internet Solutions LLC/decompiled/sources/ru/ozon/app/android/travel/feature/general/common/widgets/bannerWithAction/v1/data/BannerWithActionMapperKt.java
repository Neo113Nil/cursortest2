package ru.ozon.app.android.travel.feature.general.common.widgets.bannerWithAction.v1.data;

import android.content.Context;
import java.util.Map;
import kotlin.Metadata;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.travel.feature.general.common.widgets.bannerWithAction.v1.data.BannerWithActionDTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.bannerWithAction.v1.presentation.BannerWithActionVO;
import ru.ozon.app.android.travel.molecules.dto.themeImage.v2.ThemeImageV2DTO;
import ru.ozon.app.android.travel.molecules.mapper.MapperExtKt;
import ru.ozon.app.android.travel.molecules.view.themeImage.v2.ThemeImageV2VO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u001a\f\u0010\u0000\u001a\u00020\u0007*\u00020\bH\u0002\u001a\f\u0010\u0000\u001a\u00020\t*\u00020\nH\u0002\u001a\f\u0010\u0000\u001a\u00020\u000b*\u00020\fH\u0002\u001a\u0013\u0010\u0000\u001a\u00020\r*\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"toVO", "Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/presentation/BannerWithActionVO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/data/BannerWithActionDTO;", "context", "Landroid/content/Context;", "widgetId", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/presentation/BannerWithActionVO$LeftBlockVO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/data/BannerWithActionDTO$LeftBlockDTO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/presentation/BannerWithActionVO$SettingsVO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/data/BannerWithActionDTO$SettingsDTO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/presentation/BannerWithActionVO$MarginsVO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/data/BannerWithActionDTO$Margins;", "Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/presentation/BannerWithActionVO$RightBlockVO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/data/BannerWithActionDTO$RightBlockDTO;", "toVO-9lkhym4", "(Lru/ozon/app/android/travel/molecules/dto/themeImage/v2/ThemeImageV2DTO;)Lru/ozon/app/android/travel/molecules/view/themeImage/v2/ThemeImageV2VO;", "common_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BannerWithActionMapperKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final BannerWithActionVO toVO(BannerWithActionDTO bannerWithActionDTO, Context context, long j11) {
        AtomActionDTO action;
        BannerWithActionVO.LeftBlockVO vo = toVO(bannerWithActionDTO.getLeftBlock());
        BannerWithActionDTO.RightBlockDTO m1187getRightBlockFuAqtFE = bannerWithActionDTO.m1187getRightBlockFuAqtFE();
        BannerWithActionVO.RightBlockVO m1199boximpl = m1187getRightBlockFuAqtFE != null ? BannerWithActionVO.RightBlockVO.m1199boximpl(m1197toVO9lkhym4(m1187getRightBlockFuAqtFE.m1194unboximpl())) : null;
        IconButtonV3DTO closeButton = bannerWithActionDTO.getCloseButton();
        float pxF = ResourceExtKt.toPxF(bannerWithActionDTO.getCornerRadius().getPx(), context);
        String backgroundColor = bannerWithActionDTO.getBackgroundColor();
        String borderColor = bannerWithActionDTO.getBorderColor();
        CommonControlSettings common = bannerWithActionDTO.getCommon();
        AtomAction atomAction = (common == null || (action = common.getAction()) == null) ? null : AtomActionMapperKt.toAtomAction(action, bannerWithActionDTO.getCommon().getTrackingInfo());
        Map<String, TokenizedTrackingInfo> viewTracking = bannerWithActionDTO.getViewTracking();
        return new BannerWithActionVO(j11, vo, m1199boximpl, closeButton, pxF, backgroundColor, borderColor, atomAction, viewTracking != null ? TrackingInfoMapperKt.toTokenizedEvent$default(viewTracking, Long.valueOf(j11), null, 2, null) : null, toVO(bannerWithActionDTO.getMargins()), null);
    }

    /* renamed from: toVO-9lkhym4, reason: not valid java name */
    private static final ThemeImageV2VO m1197toVO9lkhym4(ThemeImageV2DTO themeImageV2DTO) {
        return BannerWithActionVO.RightBlockVO.m1200constructorimpl(themeImageV2DTO != null ? MapperExtKt.toVO(themeImageV2DTO) : null);
    }

    private static final BannerWithActionVO.LeftBlockVO toVO(BannerWithActionDTO.LeftBlockDTO leftBlockDTO) {
        return new BannerWithActionVO.LeftBlockVO(leftBlockDTO.getTitle(), leftBlockDTO.getSubtitle(), leftBlockDTO.getActionButton(), toVO(leftBlockDTO.getSettings()));
    }

    private static final BannerWithActionVO.SettingsVO toVO(BannerWithActionDTO.SettingsDTO settingsDTO) {
        return new BannerWithActionVO.SettingsVO(settingsDTO.getTopPadding(), settingsDTO.getBottomPadding(), settingsDTO.getLeftPadding(), settingsDTO.getRightPadding());
    }

    private static final BannerWithActionVO.MarginsVO toVO(BannerWithActionDTO.Margins margins) {
        return new BannerWithActionVO.MarginsVO(margins.getStart(), margins.getTop(), margins.getEnd(), margins.getBottom());
    }
}
