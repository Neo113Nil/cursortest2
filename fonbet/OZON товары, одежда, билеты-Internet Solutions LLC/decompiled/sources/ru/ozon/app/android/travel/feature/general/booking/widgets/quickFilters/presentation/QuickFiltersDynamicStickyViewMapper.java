package ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.presentation;

import N10.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.data.QuickFiltersDTO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.data.QuickFiltersDTOKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/QuickFiltersDynamicStickyViewMapper;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/QuickFiltersViewMapper;", "<init>", "()V", "Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/data/QuickFiltersDTO;", "state", "", "isDynamicStickyWidget", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/data/QuickFiltersDTO;)Z", "", "canMap", "(Ljava/lang/Object;)Z", "LN10/h;", "stickyWidgetConfig", "LN10/h;", "getStickyWidgetConfig", "()LN10/h;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class QuickFiltersDynamicStickyViewMapper extends QuickFiltersViewMapper {

    @NotNull
    private final h stickyWidgetConfig;

    public QuickFiltersDynamicStickyViewMapper() {
        Intrinsics.checkNotNullParameter("quickFilters", "tag");
        this.stickyWidgetConfig = new h("quickFilters", 6);
    }

    private final boolean isDynamicStickyWidget(QuickFiltersDTO state) {
        return QuickFiltersDTOKt.getBehaviour(state) == QuickFiltersDTO.StickyBehavior.DYNAMIC_STICKY;
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return (state instanceof QuickFiltersDTO) && isDynamicStickyWidget((QuickFiltersDTO) state);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public h getStickyWidgetConfig() {
        return this.stickyWidgetConfig;
    }
}
