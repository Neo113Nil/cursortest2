package ru.ozon.app.android.marketing.widgets.sellerCarousel.core;

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
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.marketing.widgets.sellerCarousel.data.SellerCarouselDTO;
import ru.ozon.app.android.marketing.widgets.sellerCarousel.data.SellerListDTO;
import ru.ozon.app.android.marketing.widgets.sellerCarousel.presentation.SellerCarouselVO;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000b\u001a\u00020\u00022\n\u0010\r\u001a\u00060\u0003j\u0002`\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerCarousel/core/SellerCarouselMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/marketing/widgets/sellerCarousel/data/SellerCarouselDTO;", "Ll20/d;", "", "Lru/ozon/app/android/marketing/widgets/sellerCarousel/presentation/SellerCarouselVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/marketing/widgets/sellerCarousel/core/SellerMapper;", "sellerMapper", "<init>", "(Lru/ozon/app/android/marketing/widgets/sellerCarousel/core/SellerMapper;)V", "carouselDto", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/marketing/widgets/sellerCarousel/data/SellerCarouselDTO;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/marketing/widgets/sellerCarousel/core/SellerMapper;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SellerCarouselMapper implements Function2<SellerCarouselDTO, d, List<? extends SellerCarouselVO>> {

    @NotNull
    private final SellerMapper sellerMapper;

    public SellerCarouselMapper(@NotNull SellerMapper sellerMapper) {
        Intrinsics.checkNotNullParameter(sellerMapper, "sellerMapper");
        this.sellerMapper = sellerMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<SellerCarouselVO> invoke(@NotNull SellerCarouselDTO carouselDto, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(carouselDto, "carouselDto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        String title = carouselDto.getTitle();
        String titleDeepLink = carouselDto.getTitleDeepLink();
        List<SellerListDTO.SellerDTO> items = carouselDto.getItems();
        Intrinsics.f(items);
        List<SellerListDTO.SellerDTO> list = items;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.sellerMapper.transform((SellerListDTO.SellerDTO) it.next()));
        }
        Map<String, TokenizedTrackingInfo> titleDeepLinkTrackingInfo = carouselDto.getTitleDeepLinkTrackingInfo();
        t tokenizedEvent$default = titleDeepLinkTrackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(titleDeepLinkTrackingInfo, Long.valueOf(hashCode), null, 2, null) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = carouselDto.getTrackingInfo();
        return C7714v.a0(new SellerCarouselVO(hashCode, title, titleDeepLink, arrayList, tokenizedEvent$default, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null));
    }
}
