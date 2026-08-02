package ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v1.presentation;

import Pc.a;
import a00.h;
import android.view.View;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v1/presentation/TravelScrollPriceCalendarWidgetViewHolder;", "view", "Landroid/view/View;", "ref", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class TravelScrollPriceCalendarViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, TravelScrollPriceCalendarWidgetViewHolder> {
    final /* synthetic */ TravelScrollPriceCalendarViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelScrollPriceCalendarViewMapper$holderProducer$1(TravelScrollPriceCalendarViewMapper travelScrollPriceCalendarViewMapper) {
        super(2);
        this.this$0 = travelScrollPriceCalendarViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final TravelScrollPriceCalendarWidgetViewHolder invoke(View view, ComposerReferences ref) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(ref, "ref");
        h viewModelOwnerProvider = ref.getViewModelOwnerProvider();
        final a<TravelScrollPriceCalendarViewModel> widgetViewModelProvider = this.this$0.component().getWidgetViewModelProvider();
        w0 a11 = new z0(viewModelOwnerProvider.a(), new z0.c() { // from class: ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v1.presentation.TravelScrollPriceCalendarViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                TravelScrollPriceCalendarViewModel travelScrollPriceCalendarViewModel = (TravelScrollPriceCalendarViewModel) a.this.get();
                Intrinsics.g(travelScrollPriceCalendarViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return travelScrollPriceCalendarViewModel;
            }
        }).a(TravelScrollPriceCalendarViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a11, "viewModel(...)");
        return new TravelScrollPriceCalendarWidgetViewHolder((RecyclerView) view, ref, (TravelScrollPriceCalendarViewModel) a11, this.this$0.component().getTokenizedAnalytics());
    }
}
