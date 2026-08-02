package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageDetailsFull.data;

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
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageDetailsFull.data.HotelsPageDetailsFullDTO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageDetailsFull.presentation.HotelsPageDetailsFullVO;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J*\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0015\u001a\u00020\u00022\n\u0010\u0017\u001a\u00060\u0003j\u0002`\u0016H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageDetailsFull/data/HotelsPageDetailsFullMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageDetailsFull/data/HotelsPageDetailsFullDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageDetailsFull/presentation/HotelsPageDetailsFullVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageDetailsFull/data/HotelsPageDetailsFullDTO$HotelDetails;", "details", "", "showMoreButtonTitle", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageDetailsFull/presentation/HotelsPageDetailsFullVO$HotelsDetailsVariant;", "mapHotelDetail", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageDetailsFull/data/HotelsPageDetailsFullDTO$HotelDetails;Ljava/lang/String;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageDetailsFull/presentation/HotelsPageDetailsFullVO$HotelsDetailsVariant;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageDetailsFull/data/HotelsPageDetailsFullDTO$Services;", "service", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageDetailsFull/presentation/HotelsPageDetailsFullVO$ServicesVO;", "mapService", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageDetailsFull/data/HotelsPageDetailsFullDTO$Services;Ljava/lang/String;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageDetailsFull/presentation/HotelsPageDetailsFullVO$ServicesVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageDetailsFull/data/HotelsPageDetailsFullDTO;Ll20/d;)Ljava/util/List;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsPageDetailsFullMapper implements Function2<HotelsPageDetailsFullDTO, d, List<? extends HotelsPageDetailsFullVO>> {
    private final HotelsPageDetailsFullVO.HotelsDetailsVariant mapHotelDetail(HotelsPageDetailsFullDTO.HotelDetails details, String showMoreButtonTitle) {
        if (details.getInfo().getDescription() != null) {
            return new HotelsPageDetailsFullVO.TextDetail(details.getHeader().getText().hashCode(), details.getHeader(), details.getInfo().getDescription());
        }
        if (details.getInfo().getServicesWrapper() == null) {
            return null;
        }
        long hashCode = details.getHeader().getText().hashCode();
        TextAtom header = details.getHeader();
        List<HotelsPageDetailsFullDTO.Services> services = details.getInfo().getServicesWrapper().getServices();
        ArrayList arrayList = new ArrayList(C7714v.z(services, 10));
        Iterator<T> it = services.iterator();
        while (it.hasNext()) {
            arrayList.add(mapService((HotelsPageDetailsFullDTO.Services) it.next(), showMoreButtonTitle));
        }
        return new HotelsPageDetailsFullVO.ServicesDetail(hashCode, header, arrayList);
    }

    private final HotelsPageDetailsFullVO.ServicesVO mapService(HotelsPageDetailsFullDTO.Services service, String showMoreButtonTitle) {
        OzonSpannableString text = service.getTitle().getText();
        String fullServicesSet = service.getFullServicesSet();
        return new HotelsPageDetailsFullVO.ServicesVO((((Object) text) + fullServicesSet).hashCode(), service.getIcon(), service.getTitle(), service.getFullServicesSet(), service.getShortServicesSet(), showMoreButtonTitle);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<HotelsPageDetailsFullVO> invoke(@NotNull HotelsPageDetailsFullDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        List<HotelsPageDetailsFullDTO.HotelDetails> hotelDetails = state.getHotelDetails();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = hotelDetails.iterator();
        while (it.hasNext()) {
            HotelsPageDetailsFullVO.HotelsDetailsVariant mapHotelDetail = mapHotelDetail((HotelsPageDetailsFullDTO.HotelDetails) it.next(), state.getShowMoreButtonTitle());
            if (mapHotelDetail != null) {
                arrayList.add(mapHotelDetail);
            }
        }
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        return C7714v.a0(new HotelsPageDetailsFullVO(hashCode, arrayList, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null));
    }
}
