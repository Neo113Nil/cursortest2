package ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card.HotelsSearchResultsV5CardViewModel;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "event", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/HotelsSearchResultsV5CardViewModel$OnboardingEvent;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card.HotelsSearchResultsV5CardWidgetViewHolder$subscribeToOnboarding$2", f = "HotelsSearchResultsV5CardWidgetViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class HotelsSearchResultsV5CardWidgetViewHolder$subscribeToOnboarding$2 extends j implements Function2<HotelsSearchResultsV5CardViewModel.OnboardingEvent, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ HotelsSearchResultsV5CardWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsSearchResultsV5CardWidgetViewHolder$subscribeToOnboarding$2(HotelsSearchResultsV5CardWidgetViewHolder hotelsSearchResultsV5CardWidgetViewHolder, d<? super HotelsSearchResultsV5CardWidgetViewHolder$subscribeToOnboarding$2> dVar) {
        super(2, dVar);
        this.this$0 = hotelsSearchResultsV5CardWidgetViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        HotelsSearchResultsV5CardWidgetViewHolder$subscribeToOnboarding$2 hotelsSearchResultsV5CardWidgetViewHolder$subscribeToOnboarding$2 = new HotelsSearchResultsV5CardWidgetViewHolder$subscribeToOnboarding$2(this.this$0, dVar);
        hotelsSearchResultsV5CardWidgetViewHolder$subscribeToOnboarding$2.L$0 = obj;
        return hotelsSearchResultsV5CardWidgetViewHolder$subscribeToOnboarding$2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        this.this$0.bindOnBoarding(((HotelsSearchResultsV5CardViewModel.OnboardingEvent) this.L$0).getOnboarding());
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(HotelsSearchResultsV5CardViewModel.OnboardingEvent onboardingEvent, d<? super Unit> dVar) {
        return ((HotelsSearchResultsV5CardWidgetViewHolder$subscribeToOnboarding$2) create(onboardingEvent, dVar)).invokeSuspend(Unit.f71690a);
    }
}
