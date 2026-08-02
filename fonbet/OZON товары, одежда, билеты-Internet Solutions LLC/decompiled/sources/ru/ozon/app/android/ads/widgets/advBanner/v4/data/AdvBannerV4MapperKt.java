package ru.ozon.app.android.ads.widgets.advBanner.v4.data;

import WZ.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ads.common.pixel.data.PixelDTO;
import ru.ozon.app.android.ads.data.pixel.presentation.PixelKt;
import ru.ozon.app.android.ads.widgets.advBanner.v4.data.AdvBannerV4DTO;
import ru.ozon.app.android.ads.widgets.advBanner.v4.presentation.model.AdvBannerV4ItemVO;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a%\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u0002\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/ads/widgets/advBanner/v4/data/AdvBannerV4DTO$DesignTypeDTO;", "Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/model/AdvBannerV4ItemVO$DesignTypeVO;", "toDesignTypeVo", "(Lru/ozon/app/android/ads/widgets/advBanner/v4/data/AdvBannerV4DTO$DesignTypeDTO;)Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/model/AdvBannerV4ItemVO$DesignTypeVO;", "Lru/ozon/app/android/ads/widgets/advBanner/v4/data/AdvBannerV4DTO;", "", "parentVoId", "", "Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/model/AdvBannerV4ItemVO;", "(Lru/ozon/app/android/ads/widgets/advBanner/v4/data/AdvBannerV4DTO;Ljava/lang/Long;)Ljava/util/List;", "ads_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AdvBannerV4MapperKt {
    @NotNull
    public static final AdvBannerV4ItemVO.DesignTypeVO toDesignTypeVo(@NotNull AdvBannerV4DTO.DesignTypeDTO designTypeDTO) {
        Intrinsics.checkNotNullParameter(designTypeDTO, "<this>");
        return new AdvBannerV4ItemVO.DesignTypeVO(AdvBannerV4ItemVO.DesignTypeVO.Type.INSTANCE.fromString(designTypeDTO.getType()));
    }

    @NotNull
    public static final List<AdvBannerV4ItemVO> toDesignTypeVo(@NotNull AdvBannerV4DTO advBannerV4DTO, Long l11) {
        ArrayList arrayList;
        BadgeDTO badgeDTO;
        CommonControlSettings copy$default;
        Integer bottomCornerRadius;
        Integer topCornerRadius;
        Intrinsics.checkNotNullParameter(advBannerV4DTO, "<this>");
        List<AdvBannerV4DTO.ItemDTO> items = advBannerV4DTO.getItems();
        ArrayList arrayList2 = new ArrayList();
        int i11 = 0;
        for (Object obj : items) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            AdvBannerV4DTO.ItemDTO itemDTO = (AdvBannerV4DTO.ItemDTO) obj;
            long id2 = itemDTO.getId();
            String image = itemDTO.getImage();
            AtomActionDTO action = itemDTO.getAction();
            Map<String, TokenizedTrackingInfo> trackingInfo = itemDTO.getTrackingInfo();
            t tokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(l11 != null ? l11.longValue() : itemDTO.getId()), null, 2, null) : null;
            List<PixelDTO> pixel = itemDTO.getPixel();
            if (pixel != null) {
                List<PixelDTO> list = pixel;
                arrayList = new ArrayList(C7714v.z(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(PixelKt.toVO((PixelDTO) it.next()));
                }
            } else {
                arrayList = null;
            }
            Double aspectRation = advBannerV4DTO.getAspectRation();
            Float valueOf = aspectRation != null ? Float.valueOf((float) aspectRation.doubleValue()) : null;
            Map<String, TokenizedTrackingInfo> trackingInfo2 = itemDTO.getImpressionTracking().getTrackingInfo();
            t tokenizedEvent$default2 = trackingInfo2 != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo2, Long.valueOf(l11 != null ? l11.longValue() : itemDTO.getId()), null, 2, null) : null;
            AdvBannerV4DTO.DesignOptionsDTO designOptions = advBannerV4DTO.getDesignOptions();
            int i13 = 16;
            int intValue = (designOptions == null || (topCornerRadius = designOptions.getTopCornerRadius()) == null) ? 16 : topCornerRadius.intValue();
            AdvBannerV4DTO.DesignOptionsDTO designOptions2 = advBannerV4DTO.getDesignOptions();
            if (designOptions2 != null && (bottomCornerRadius = designOptions2.getBottomCornerRadius()) != null) {
                i13 = bottomCornerRadius.intValue();
            }
            AdvBannerV4ItemVO.DesignOptions designOptions3 = new AdvBannerV4ItemVO.DesignOptions(intValue, i13);
            BadgeDTO badgeV2 = advBannerV4DTO.getBadgeV2();
            if (badgeV2 != null) {
                CommonControlSettings common = advBannerV4DTO.getBadgeV2().getCommon();
                badgeDTO = BadgeDTO.copy$default(badgeV2, null, null, null, null, null, (common == null || (copy$default = CommonControlSettings.copy$default(common, itemDTO.getAdvInfoAction(), null, null, 6, null)) == null) ? new CommonControlSettings(itemDTO.getAdvInfoAction(), null, null, 6, null) : copy$default, null, advBannerV4DTO.getBadgeV2().getHideDisclosure(), null, null, null, null, 3935, null);
            } else {
                badgeDTO = null;
            }
            arrayList2.add(new AdvBannerV4ItemVO(i11, id2, image, action, tokenizedEvent$default, arrayList, badgeDTO, valueOf, tokenizedEvent$default2, designOptions3));
            i11 = i12;
        }
        return arrayList2;
    }
}
