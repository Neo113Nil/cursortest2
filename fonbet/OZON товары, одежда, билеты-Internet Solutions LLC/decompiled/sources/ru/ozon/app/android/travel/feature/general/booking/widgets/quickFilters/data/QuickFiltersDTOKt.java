package ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.data.QuickFiltersDTO;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"getBehaviour", "Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/data/QuickFiltersDTO$StickyBehavior;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/data/QuickFiltersDTO;", "booking_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class QuickFiltersDTOKt {
    @NotNull
    public static final QuickFiltersDTO.StickyBehavior getBehaviour(@NotNull QuickFiltersDTO quickFiltersDTO) {
        Intrinsics.checkNotNullParameter(quickFiltersDTO, "<this>");
        QuickFiltersDTO.StickyBehavior stickyBehavior = quickFiltersDTO.getStickyBehavior();
        return stickyBehavior == null ? (quickFiltersDTO.isDynamicSticky() || quickFiltersDTO.getShouldHideFiltersOnScroll()) ? (quickFiltersDTO.isDynamicSticky() || !quickFiltersDTO.getShouldHideFiltersOnScroll()) ? QuickFiltersDTO.StickyBehavior.DYNAMIC_STICKY : QuickFiltersDTO.StickyBehavior.STATIC_STICKY : QuickFiltersDTO.StickyBehavior.STATIC_HEADER : stickyBehavior;
    }
}
