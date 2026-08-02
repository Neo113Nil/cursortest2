package ru.ozon.app.android.travel.feature.general.main.widgets.travelPriceCalendar.v3.presentation;

import a00.h;
import android.view.View;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.calendar.viewModel.CalendarViewModel;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelPriceCalendar.v3.di.TravelPriceCalendarV3Component;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelPriceCalendar.v3.presentation.analytics.TravelPriceCalendarV3AnalyticsViewModel;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPriceCalendar/v3/presentation/TravelPriceCalendarV3WidgetViewHolder;", "view", "Landroid/view/View;", "ref", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class TravelPriceCalendarV3ViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, TravelPriceCalendarV3WidgetViewHolder> {
    final /* synthetic */ TravelPriceCalendarV3ViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelPriceCalendarV3ViewMapper$holderProducer$1(TravelPriceCalendarV3ViewMapper travelPriceCalendarV3ViewMapper) {
        super(2);
        this.this$0 = travelPriceCalendarV3ViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final TravelPriceCalendarV3WidgetViewHolder invoke(View view, ComposerReferences ref) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(ref, "ref");
        h viewModelOwnerProvider = ref.getViewModelOwnerProvider();
        final TravelPriceCalendarV3Component component = this.this$0.component();
        CalendarViewModel calendarViewModel = (CalendarViewModel) new z0(viewModelOwnerProvider.a(), new z0.c() { // from class: ru.ozon.app.android.travel.feature.general.main.widgets.travelPriceCalendar.v3.presentation.TravelPriceCalendarV3ViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                CalendarViewModel calendarViewModel2 = TravelPriceCalendarV3Component.this.getCalendarViewModel();
                Intrinsics.g(calendarViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return calendarViewModel2;
            }
        }).a(CalendarViewModel.class);
        h viewModelOwnerProvider2 = ref.getViewModelOwnerProvider();
        final TravelPriceCalendarV3Component component2 = this.this$0.component();
        return new TravelPriceCalendarV3WidgetViewHolder(view, ref, calendarViewModel, (TravelPriceCalendarV3AnalyticsViewModel) new z0(viewModelOwnerProvider2.a(), new z0.c() { // from class: ru.ozon.app.android.travel.feature.general.main.widgets.travelPriceCalendar.v3.presentation.TravelPriceCalendarV3ViewMapper$holderProducer$1$invoke$$inlined$viewModel$2
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                TravelPriceCalendarV3AnalyticsViewModel analyticsViewModel = TravelPriceCalendarV3Component.this.getAnalyticsViewModel();
                Intrinsics.g(analyticsViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return analyticsViewModel;
            }
        }).a(TravelPriceCalendarV3AnalyticsViewModel.class), this.this$0.component().getTokenizedAnalytics(), this.this$0.component().getCustomActionHandlersStoreFactory());
    }
}
