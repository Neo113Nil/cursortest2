package ru.ozon.app.android.storefront.widgets.cms.bannercarousel;

import WZ.t;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"mapToVo", "Lru/ozon/app/android/storefront/widgets/cms/bannercarousel/BannerCarouselVO;", "Lru/ozon/app/android/storefront/widgets/cms/bannercarousel/BannerCarouselParamsDTO;", "cms_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BannerCarouselParamsDTOKt {
    @NotNull
    public static final BannerCarouselVO mapToVo(@NotNull BannerCarouselParamsDTO bannerCarouselParamsDTO) {
        Intrinsics.checkNotNullParameter(bannerCarouselParamsDTO, "<this>");
        long hashCode = bannerCarouselParamsDTO.getItems().toString().hashCode();
        int width = bannerCarouselParamsDTO.getWidth();
        int height = bannerCarouselParamsDTO.getHeight();
        List<BannerCarouselItemDTO> items = bannerCarouselParamsDTO.getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        for (BannerCarouselItemDTO bannerCarouselItemDTO : items) {
            String image = bannerCarouselItemDTO.getImage();
            String deeplink = bannerCarouselItemDTO.getDeeplink();
            t tVar = null;
            if (deeplink == null || h.K(deeplink)) {
                deeplink = null;
            }
            Map<String, TokenizedTrackingInfo> trackingInfo = bannerCarouselItemDTO.getTrackingInfo();
            if (trackingInfo != null) {
                tVar = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null);
            }
            arrayList.add(new BannerCarouselItem(image, deeplink, tVar, bannerCarouselItemDTO.getAdBadge()));
        }
        return new BannerCarouselVO(hashCode, width, height, arrayList, null, 16, null);
    }
}
