package ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.data;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.preload.ImagePrefetcher;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.data.HotelsSearchResultsV5DTO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card.HotelsSearchResultsV5CardVO;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncConfig;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u001d\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\u00022\n\u0010\u0010\u001a\u00060\u0003j\u0002`\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0013R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/data/HotelsSearchResultsV5CardsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/data/HotelsSearchResultsV5DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/HotelsSearchResultsV5CardVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;", "", "hotelsSearchResultV5ImagePrefetcher", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;)V", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/data/HotelsSearchResultsV5DTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsSearchResultsV5CardsMapper implements Function2<HotelsSearchResultsV5DTO, d, List<? extends HotelsSearchResultsV5CardVO>> {

    @NotNull
    private final Context context;

    @NotNull
    private final ImagePrefetcher<String> hotelsSearchResultV5ImagePrefetcher;

    public HotelsSearchResultsV5CardsMapper(@NotNull Context context, @NotNull ImagePrefetcher<String> hotelsSearchResultV5ImagePrefetcher) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(hotelsSearchResultV5ImagePrefetcher, "hotelsSearchResultV5ImagePrefetcher");
        this.context = context;
        this.hotelsSearchResultV5ImagePrefetcher = hotelsSearchResultV5ImagePrefetcher;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<HotelsSearchResultsV5CardVO> invoke(@NotNull HotelsSearchResultsV5DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        String a11 = widgetInfo.c().a();
        AsyncConfig asyncConfig = (a11 == null || state.getAsyncBehaviorType() == HotelsSearchResultsV5DTO.AsyncBehaviorType.NO_ACTION) ? null : new AsyncConfig(a11, state.getAsyncParams());
        List<HotelsSearchResultsV5DTO.HotelItemDTO> hotels = state.getHotels();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = hotels.iterator();
        while (it.hasNext()) {
            String str = (String) C7714v.M(((HotelsSearchResultsV5DTO.HotelItemDTO) it.next()).getImages());
            if (str != null) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList != null) {
            this.hotelsSearchResultV5ImagePrefetcher.prefetch(this.context, arrayList);
        }
        List<HotelsSearchResultsV5DTO.HotelItemDTO> hotels2 = state.getHotels();
        ArrayList arrayList2 = new ArrayList(C7714v.z(hotels2, 10));
        int i11 = 0;
        for (Object obj : hotels2) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            arrayList2.add(HotelsSearchResultsV5HotelMapperExtKt.toVO((HotelsSearchResultsV5DTO.HotelItemDTO) obj, this.context, (asyncConfig == null || i11 != 0) ? null : asyncConfig));
            i11 = i12;
        }
        return arrayList2;
    }
}
