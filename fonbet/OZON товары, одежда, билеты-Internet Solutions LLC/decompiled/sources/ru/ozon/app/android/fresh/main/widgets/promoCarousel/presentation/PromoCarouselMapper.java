package ru.ozon.app.android.fresh.main.widgets.promoCarousel.presentation;

import androidx.recyclerview.widget.m;
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
import ru.ozon.app.android.fresh.main.utils.ExtentionsKt;
import ru.ozon.app.android.fresh.main.widgets.promoCarousel.data.PromoCarouselDTO;
import ru.ozon.app.android.fresh.main.widgets.promoCarousel.presentation.PromoCarouselVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u001d2*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001\u001dB\u0007¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000f\u001a\u00020\u000e*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J*\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0018\u001a\u00020\u00022\n\u0010\u001a\u001a\u00060\u0003j\u0002`\u0019H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/promoCarousel/presentation/PromoCarouselMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/main/widgets/promoCarousel/data/PromoCarouselDTO;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/main/widgets/promoCarousel/presentation/PromoCarouselVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/fresh/main/widgets/promoCarousel/data/PromoCarouselDTO$SectionDTO$BannerDTO;", "", "widgetId", "Lru/ozon/app/android/fresh/main/widgets/promoCarousel/presentation/PromoCarouselVO$PromoCarouselBannerVO$BannerType;", "bannerType", "Lru/ozon/app/android/fresh/main/widgets/promoCarousel/presentation/PromoCarouselVO$PromoCarouselBannerVO;", "toBannerVO", "(Lru/ozon/app/android/fresh/main/widgets/promoCarousel/data/PromoCarouselDTO$SectionDTO$BannerDTO;JLru/ozon/app/android/fresh/main/widgets/promoCarousel/presentation/PromoCarouselVO$PromoCarouselBannerVO$BannerType;)Lru/ozon/app/android/fresh/main/widgets/promoCarousel/presentation/PromoCarouselVO$PromoCarouselBannerVO;", "bannerDTO", "createFullHeightBanner", "(Lru/ozon/app/android/fresh/main/widgets/promoCarousel/data/PromoCarouselDTO$SectionDTO$BannerDTO;J)Lru/ozon/app/android/fresh/main/widgets/promoCarousel/presentation/PromoCarouselVO$PromoCarouselBannerVO;", "", "isSmallCarousel", "createHalfHeightBanner", "(Lru/ozon/app/android/fresh/main/widgets/promoCarousel/data/PromoCarouselDTO$SectionDTO$BannerDTO;JZ)Lru/ozon/app/android/fresh/main/widgets/promoCarousel/presentation/PromoCarouselVO$PromoCarouselBannerVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/fresh/main/widgets/promoCarousel/data/PromoCarouselDTO;Ll20/d;)Ljava/util/List;", "Companion", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PromoCarouselMapper implements Function2<PromoCarouselDTO, d, List<? extends PromoCarouselVO>> {
    private final PromoCarouselVO.PromoCarouselBannerVO createFullHeightBanner(PromoCarouselDTO.SectionDTO.BannerDTO bannerDTO, long widgetId) {
        return toBannerVO(bannerDTO, widgetId, new PromoCarouselVO.PromoCarouselBannerVO.BannerType(2, m.e.DEFAULT_DRAG_ANIMATION_DURATION, m.e.DEFAULT_DRAG_ANIMATION_DURATION));
    }

    private final PromoCarouselVO.PromoCarouselBannerVO createHalfHeightBanner(PromoCarouselDTO.SectionDTO.BannerDTO bannerDTO, long widgetId, boolean isSmallCarousel) {
        return toBannerVO(bannerDTO, widgetId, new PromoCarouselVO.PromoCarouselBannerVO.BannerType(isSmallCarousel ? 2 : 1, 240, 96));
    }

    private final PromoCarouselVO.PromoCarouselBannerVO toBannerVO(PromoCarouselDTO.SectionDTO.BannerDTO bannerDTO, long j11, PromoCarouselVO.PromoCarouselBannerVO.BannerType bannerType) {
        AtomAction atomAction = AtomActionMapperKt.toAtomAction(bannerDTO.getAction(), bannerDTO.getTrackingInfo());
        String image = bannerDTO.getImage();
        BadgeDTO advBadgeV2 = bannerDTO.getAdvBadgeV2();
        Map<String, TokenizedTrackingInfo> trackingInfo = bannerDTO.getTrackingInfo();
        return new PromoCarouselVO.PromoCarouselBannerVO(image, atomAction, advBadgeV2, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null, bannerType);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<PromoCarouselVO> invoke(@NotNull PromoCarouselDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long id2 = ExtentionsKt.getId(widgetInfo);
        Boolean isSmallCarousel = state.isSmallCarousel();
        boolean booleanValue = isSmallCarousel != null ? isSmallCarousel.booleanValue() : false;
        List<PromoCarouselDTO.SectionDTO> sections = state.getSections();
        ArrayList arrayList = new ArrayList();
        for (Object obj : sections) {
            int size = ((PromoCarouselDTO.SectionDTO) obj).getBanners().size();
            if (1 <= size && size < 3) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            PromoCarouselDTO.SectionDTO sectionDTO = (PromoCarouselDTO.SectionDTO) it.next();
            List<PromoCarouselDTO.SectionDTO.BannerDTO> banners = sectionDTO.getBanners();
            ArrayList arrayList3 = new ArrayList(C7714v.z(banners, 10));
            for (PromoCarouselDTO.SectionDTO.BannerDTO bannerDTO : banners) {
                arrayList3.add((sectionDTO.getBanners().size() != 1 || booleanValue) ? createHalfHeightBanner(bannerDTO, id2, booleanValue) : createFullHeightBanner(bannerDTO, id2));
            }
            arrayList2.add(arrayList3);
        }
        ArrayList N11 = C7714v.N(arrayList2);
        Boolean hasAnimation = state.getHasAnimation();
        boolean booleanValue2 = hasAnimation != null ? hasAnimation.booleanValue() : false;
        Boolean isSmallCarousel2 = state.isSmallCarousel();
        boolean booleanValue3 = isSmallCarousel2 != null ? isSmallCarousel2.booleanValue() : false;
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        return C7714v.a0(new PromoCarouselVO(id2, N11, booleanValue2, booleanValue3, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(id2), null, 2, null) : null, null, 32, null));
    }
}
