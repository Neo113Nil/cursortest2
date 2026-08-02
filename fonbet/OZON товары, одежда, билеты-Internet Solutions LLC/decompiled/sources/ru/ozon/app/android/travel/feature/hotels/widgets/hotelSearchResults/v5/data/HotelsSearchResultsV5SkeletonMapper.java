package ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.data;

import Kk.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.loading.HotelsSearchResultsV5SkeletonVO;
import ru.ozon.app.android.travel.molecules.dto.emptyState.v1.EmptyStateDTO;
import ru.ozon.app.android.travel.molecules.mapper.MapperExtKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\u00022\n\u0010\u0010\u001a\u00060\u0003j\u0002`\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/data/HotelsSearchResultsV5SkeletonMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/data/HotelsSearchResultsV5DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/loading/HotelsSearchResultsV5SkeletonVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "isHotelsEmpty", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/loading/HotelsSearchResultsV5SkeletonVO$SkeletonItemVO;", "createHotelsList", "(Z)Ljava/util/List;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/data/HotelsSearchResultsV5DTO;Ll20/d;)Ljava/util/List;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsSearchResultsV5SkeletonMapper implements Function2<HotelsSearchResultsV5DTO, d, List<? extends HotelsSearchResultsV5SkeletonVO>> {
    private final List<HotelsSearchResultsV5SkeletonVO.SkeletonItemVO> createHotelsList(boolean isHotelsEmpty) {
        if (!isHotelsEmpty) {
            return K.f71697a;
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 1; i11 < 4; i11++) {
            arrayList.add(new HotelsSearchResultsV5SkeletonVO.SkeletonItemVO(i11));
        }
        return arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<HotelsSearchResultsV5SkeletonVO> invoke(@NotNull HotelsSearchResultsV5DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long a11 = c.a(widgetInfo.d(), "skeleton");
        List<HotelsSearchResultsV5SkeletonVO.SkeletonItemVO> createHotelsList = createHotelsList(state.getHotels().isEmpty());
        EmptyStateDTO asyncErrorMessage = state.getAsyncErrorMessage();
        return C7714v.a0(new HotelsSearchResultsV5SkeletonVO(a11, createHotelsList, asyncErrorMessage != null ? MapperExtKt.toVO(asyncErrorMessage) : null, false));
    }
}
