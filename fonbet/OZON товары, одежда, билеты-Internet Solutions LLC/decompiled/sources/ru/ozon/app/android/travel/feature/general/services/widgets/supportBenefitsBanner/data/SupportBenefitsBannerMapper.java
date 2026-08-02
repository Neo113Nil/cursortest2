package ru.ozon.app.android.travel.feature.general.services.widgets.supportBenefitsBanner.data;

import WZ.x;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.general.services.widgets.supportBenefitsBanner.data.SupportBenefitsBannerDTO;
import ru.ozon.app.android.travel.feature.general.services.widgets.supportBenefitsBanner.presentation.SupportBenefitsBannerVO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u000f\u001a\u00060\u0003j\u0002`\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/supportBenefitsBanner/data/SupportBenefitsBannerMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/services/widgets/supportBenefitsBanner/data/SupportBenefitsBannerDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/services/widgets/supportBenefitsBanner/presentation/SupportBenefitsBannerVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/travel/feature/general/services/widgets/supportBenefitsBanner/data/SupportBenefitsBannerDTO$CardItemDTO;", "Lru/ozon/app/android/travel/feature/general/services/widgets/supportBenefitsBanner/presentation/SupportBenefitsBannerVO$CardItemVO;", "toVO", "(Lru/ozon/app/android/travel/feature/general/services/widgets/supportBenefitsBanner/data/SupportBenefitsBannerDTO$CardItemDTO;)Lru/ozon/app/android/travel/feature/general/services/widgets/supportBenefitsBanner/presentation/SupportBenefitsBannerVO$CardItemVO;", "dto", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/services/widgets/supportBenefitsBanner/data/SupportBenefitsBannerDTO;Ll20/d;)Ljava/util/List;", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SupportBenefitsBannerMapper implements Function2<SupportBenefitsBannerDTO, d, List<? extends SupportBenefitsBannerVO>> {
    private final SupportBenefitsBannerVO.CardItemVO toVO(SupportBenefitsBannerDTO.CardItemDTO cardItemDTO) {
        TextDTO title = cardItemDTO.getTitle();
        TextDTO subtitle = cardItemDTO.getSubtitle();
        ImageDTO image = cardItemDTO.getImage();
        String backgroundColor = cardItemDTO.getBackgroundColor();
        BadgeDTO badge = cardItemDTO.getBadge();
        CommonControlSettings common = cardItemDTO.getCommon();
        return new SupportBenefitsBannerVO.CardItemVO(title, subtitle, badge, image, common != null ? common.toAtomAction() : null, backgroundColor);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<SupportBenefitsBannerVO> invoke(@NotNull SupportBenefitsBannerDTO dto, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        TextDTO title = dto.getTitle();
        SupportBenefitsBannerVO.CardItemVO vo = toVO(dto.getLeftCard());
        SupportBenefitsBannerVO.CardItemVO vo2 = toVO(dto.getRightCard());
        Map<String, TokenizedTrackingInfo> trackingInfo = dto.getTrackingInfo();
        return C7714v.a0(new SupportBenefitsBannerVO(hashCode, title, vo, vo2, trackingInfo != null ? x.b(trackingInfo, Long.valueOf(hashCode), null) : null));
    }
}
