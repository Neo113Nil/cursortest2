package ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v2.presentation;

import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v2.data.TravelScrollPriceCalendarV2DTO;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v2.data.TravelScrollPriceCalendarV2Mapper;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v2.presentation.TravelScrollPriceCalendarV2VO;
import ru.ozon.app.android.travel.utils.asyncWidget.AbstractAsyncWidgetViewModel;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u000e\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0019\u001a\u00020\u0013R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v2/presentation/TravelScrollPriceCalendarV2WidgetViewModel;", "Lru/ozon/app/android/travel/utils/asyncWidget/AbstractAsyncWidgetViewModel;", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v2/data/TravelScrollPriceCalendarV2DTO;", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v2/presentation/TravelScrollPriceCalendarV2VO$State;", "asyncWidgetRepository", "Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;", "mapper", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v2/data/TravelScrollPriceCalendarV2Mapper;", "dispatcherProvider", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "<init>", "(Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v2/data/TravelScrollPriceCalendarV2Mapper;Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;)V", "scrollState", "Landroid/os/Parcelable;", "getScrollState", "()Landroid/os/Parcelable;", "setScrollState", "(Landroid/os/Parcelable;)V", "flagOfFailedFetch", "", "fetchWidget", "", "asyncData", "", "repeatFetchWidget", "fetchIsAvailable", "old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelScrollPriceCalendarV2WidgetViewModel extends AbstractAsyncWidgetViewModel<TravelScrollPriceCalendarV2DTO, TravelScrollPriceCalendarV2VO.State> {
    private boolean flagOfFailedFetch;
    private Parcelable scrollState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelScrollPriceCalendarV2WidgetViewModel(@NotNull ComposerAsyncWidgetRepository asyncWidgetRepository, @NotNull TravelScrollPriceCalendarV2Mapper mapper, @NotNull CoroutineDispatcherProvider dispatcherProvider) {
        super(asyncWidgetRepository, mapper, dispatcherProvider, null, 8, null);
        Intrinsics.checkNotNullParameter(asyncWidgetRepository, "asyncWidgetRepository");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
    }

    public final boolean fetchIsAvailable() {
        return !this.flagOfFailedFetch;
    }

    public void fetchWidget(@NotNull String asyncData) {
        Intrinsics.checkNotNullParameter(asyncData, "asyncData");
        AbstractAsyncWidgetViewModel.fetchWidget$default(this, TravelScrollPriceCalendarV2DTO.class, asyncData, null, 4, null);
    }

    public final Parcelable getScrollState() {
        return this.scrollState;
    }

    public final void repeatFetchWidget(@NotNull String asyncData) {
        Intrinsics.checkNotNullParameter(asyncData, "asyncData");
        fetchWidget(asyncData);
        this.flagOfFailedFetch = true;
    }

    public final void setScrollState(Parcelable parcelable) {
        this.scrollState = parcelable;
    }
}
