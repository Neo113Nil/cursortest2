package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.allDone;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "event", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/allDone/AviaSearchResultV4AllDoneViewModel$OnboardingEvent$Onboarding;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.allDone.AviaSearchResultV4AllDoneWidgetViewHolder$onAttach$2", f = "AviaSearchResultV4AllDoneWidgetViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class AviaSearchResultV4AllDoneWidgetViewHolder$onAttach$2 extends j implements Function2<AviaSearchResultV4AllDoneViewModel$OnboardingEvent$Onboarding, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AviaSearchResultV4AllDoneWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AviaSearchResultV4AllDoneWidgetViewHolder$onAttach$2(AviaSearchResultV4AllDoneWidgetViewHolder aviaSearchResultV4AllDoneWidgetViewHolder, d<? super AviaSearchResultV4AllDoneWidgetViewHolder$onAttach$2> dVar) {
        super(2, dVar);
        this.this$0 = aviaSearchResultV4AllDoneWidgetViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        AviaSearchResultV4AllDoneWidgetViewHolder$onAttach$2 aviaSearchResultV4AllDoneWidgetViewHolder$onAttach$2 = new AviaSearchResultV4AllDoneWidgetViewHolder$onAttach$2(this.this$0, dVar);
        aviaSearchResultV4AllDoneWidgetViewHolder$onAttach$2.L$0 = obj;
        return aviaSearchResultV4AllDoneWidgetViewHolder$onAttach$2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        this.this$0.bindOnBoarding(((AviaSearchResultV4AllDoneViewModel$OnboardingEvent$Onboarding) this.L$0).getOnboarding());
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AviaSearchResultV4AllDoneViewModel$OnboardingEvent$Onboarding aviaSearchResultV4AllDoneViewModel$OnboardingEvent$Onboarding, d<? super Unit> dVar) {
        return ((AviaSearchResultV4AllDoneWidgetViewHolder$onAttach$2) create(aviaSearchResultV4AllDoneViewModel$OnboardingEvent$Onboarding, dVar)).invokeSuspend(Unit.f71690a);
    }
}
