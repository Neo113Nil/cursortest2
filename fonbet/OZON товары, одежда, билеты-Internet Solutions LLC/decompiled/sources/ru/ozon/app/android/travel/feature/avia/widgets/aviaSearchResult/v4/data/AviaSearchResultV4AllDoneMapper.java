package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.data;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.preload.ImagePrefetcher;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.data.AviaSearchResultV4DTO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.vo.AviaSearchResultV4AllDoneVO;
import ru.ozon.uni.atoms.data.icon.IconDTO;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u001d\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\u00022\n\u0010\u0010\u001a\u00060\u0003j\u0002`\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0013R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/data/AviaSearchResultV4AllDoneMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/data/AviaSearchResultV4DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4AllDoneVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "imagePrefetcher", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;)V", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/data/AviaSearchResultV4DTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaSearchResultV4AllDoneMapper implements Function2<AviaSearchResultV4DTO, d, List<? extends AviaSearchResultV4AllDoneVO>> {

    @NotNull
    private final Context context;

    @NotNull
    private final ImagePrefetcher<IconDTO> imagePrefetcher;

    public AviaSearchResultV4AllDoneMapper(@NotNull Context context, @NotNull ImagePrefetcher<IconDTO> imagePrefetcher) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imagePrefetcher, "imagePrefetcher");
        this.context = context;
        this.imagePrefetcher = imagePrefetcher;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<AviaSearchResultV4AllDoneVO> invoke(@NotNull AviaSearchResultV4DTO state, @NotNull d widgetInfo) {
        List<AviaSearchResultV4DTO.Flight> flights;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        if (state.getAsyncBehaviorType() != AviaSearchResultV4DTO.AsyncBehaviorType.NO_ACTION || (flights = state.getFlights()) == null || flights.isEmpty()) {
            return K.f71697a;
        }
        AviaSearchResultV4FlightMapperExtKt.prefetchImages(state.getFlights(), this.context, this.imagePrefetcher);
        List<AviaSearchResultV4DTO.Flight> flights2 = state.getFlights();
        ArrayList arrayList = new ArrayList(C7714v.z(flights2, 10));
        for (AviaSearchResultV4DTO.Flight flight : flights2) {
            arrayList.add(new AviaSearchResultV4AllDoneVO(flight.getFlightId() != null ? widgetInfo.d().hashCode() + (flight.getFlightId().intValue() * 31) : AviaSearchResultV4FlightMapperExtKt.generateUniqueId(flight.getCardClickAction(), widgetInfo.d()), AviaSearchResultV4FlightMapperExtKt.toVO(flight, this.context, state.getOnboardingApp(), false)));
        }
        return arrayList;
    }
}
