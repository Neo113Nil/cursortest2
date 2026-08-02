package ru.ozon.app.android.common.serviceCarousel.core;

import WZ.t;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.common.serviceCarousel.data.CornersState;
import ru.ozon.app.android.common.serviceCarousel.data.ServiceCarouselDTO;
import ru.ozon.app.android.common.serviceCarousel.data.ServiceCarouselItemDTO;
import ru.ozon.app.android.common.serviceCarousel.presentation.ServiceCarouselItemVO;
import ru.ozon.app.android.common.serviceCarousel.presentation.ServiceCarouselVO;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004*\b\u0012\u0004\u0012\u00020\r0\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\u0010J*\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0011\u001a\u00020\u00022\n\u0010\u0013\u001a\u00060\u0003j\u0002`\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/common/serviceCarousel/core/ServiceCarouselMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/common/serviceCarousel/data/ServiceCarouselDTO;", "Ll20/d;", "", "Lru/ozon/app/android/common/serviceCarousel/presentation/ServiceCarouselVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "id", "toVo", "(Lru/ozon/app/android/common/serviceCarousel/data/ServiceCarouselDTO;J)Lru/ozon/app/android/common/serviceCarousel/presentation/ServiceCarouselVO;", "Lru/ozon/app/android/common/serviceCarousel/data/ServiceCarouselItemDTO;", "widgetId", "Lru/ozon/app/android/common/serviceCarousel/presentation/ServiceCarouselItemVO;", "(Ljava/util/List;Ljava/lang/Long;)Ljava/util/List;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/common/serviceCarousel/data/ServiceCarouselDTO;Ll20/d;)Ljava/util/List;", "service-carousel_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ServiceCarouselMapper implements Function2<ServiceCarouselDTO, d, List<? extends ServiceCarouselVO>> {
    private final ServiceCarouselVO toVo(ServiceCarouselDTO serviceCarouselDTO, long j11) {
        List<ServiceCarouselItemVO> vo = toVo(serviceCarouselDTO.getItems(), Long.valueOf(j11));
        CornersState cornersState = serviceCarouselDTO.getCornersState();
        Map<String, TokenizedTrackingInfo> trackingInfo = serviceCarouselDTO.getTrackingInfo();
        return new ServiceCarouselVO(j11, vo, cornersState, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null, false, null, serviceCarouselDTO.isKeepPermanentPageViewId(), serviceCarouselDTO.getOnboarding(), serviceCarouselDTO.getOnboardingItemIndex());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ServiceCarouselVO> invoke(@NotNull ServiceCarouselDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVo(state, widgetInfo.d().hashCode()));
    }

    private final List<ServiceCarouselItemVO> toVo(List<ServiceCarouselItemDTO> list, Long l11) {
        List<ServiceCarouselItemDTO> list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        for (ServiceCarouselItemDTO serviceCarouselItemDTO : list2) {
            long hashCode = serviceCarouselItemDTO.hashCode();
            String link = serviceCarouselItemDTO.getAction().getLink();
            TextAtom title = serviceCarouselItemDTO.getTitle();
            String image = serviceCarouselItemDTO.getImage();
            AtomAction atomAction = AtomActionMapperKt.toAtomAction(serviceCarouselItemDTO.getAction(), serviceCarouselItemDTO.getTrackingInfo());
            Boolean showNewBadge = serviceCarouselItemDTO.getShowNewBadge();
            boolean booleanValue = showNewBadge != null ? showNewBadge.booleanValue() : false;
            Integer storyId = serviceCarouselItemDTO.getStoryId();
            Map<String, TokenizedTrackingInfo> trackingInfo = serviceCarouselItemDTO.getTrackingInfo();
            t tVar = null;
            if (trackingInfo != null) {
                tVar = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, l11, null, 2, null);
            }
            arrayList.add(new ServiceCarouselItemVO(hashCode, title, image, atomAction, booleanValue, storyId, link, tVar, serviceCarouselItemDTO.getBadge(), serviceCarouselItemDTO.getImageBgColor()));
        }
        return arrayList;
    }
}
