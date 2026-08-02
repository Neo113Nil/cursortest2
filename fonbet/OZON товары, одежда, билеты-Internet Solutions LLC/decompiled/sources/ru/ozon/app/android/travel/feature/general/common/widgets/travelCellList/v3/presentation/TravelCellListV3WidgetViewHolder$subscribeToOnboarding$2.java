package ru.ozon.app.android.travel.feature.general.common.widgets.travelCellList.v3.presentation;

import Sc.s;
import Wc.a;
import androidx.lifecycle.K;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelCellList.v3.presentation.TravelCellListV3ViewModel;
import ru.ozon.uni.atoms.data.AtomDTO;
import xe.C10727i;
import xe.M;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "event", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelCellList/v3/presentation/TravelCellListV3ViewModel$OnboardingEvent;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.travel.feature.general.common.widgets.travelCellList.v3.presentation.TravelCellListV3WidgetViewHolder$subscribeToOnboarding$2", f = "TravelCellListV3WidgetViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class TravelCellListV3WidgetViewHolder$subscribeToOnboarding$2 extends j implements Function2<TravelCellListV3ViewModel.OnboardingEvent, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TravelCellListV3WidgetViewHolder this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.travel.feature.general.common.widgets.travelCellList.v3.presentation.TravelCellListV3WidgetViewHolder$subscribeToOnboarding$2$1", f = "TravelCellListV3WidgetViewHolder.kt", l = {180}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.travel.feature.general.common.widgets.travelCellList.v3.presentation.TravelCellListV3WidgetViewHolder$subscribeToOnboarding$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        final /* synthetic */ TravelCellListV3ViewModel.OnboardingEvent $event;
        int label;
        final /* synthetic */ TravelCellListV3WidgetViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(TravelCellListV3WidgetViewHolder travelCellListV3WidgetViewHolder, TravelCellListV3ViewModel.OnboardingEvent onboardingEvent, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = travelCellListV3WidgetViewHolder;
            this.$event = onboardingEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.this$0, this.$event, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                this.label = 1;
                if (Y.b(300L, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            TravelCellListV3WidgetViewHolder travelCellListV3WidgetViewHolder = this.this$0;
            OnBoardingDTO onboarding = this.$event.getOnboarding();
            TravelCellListV3VO boundData = this.this$0.getBoundData();
            AtomDTO atom = boundData != null ? boundData.getAtom() : null;
            TravelCellListV3VO boundData2 = this.this$0.getBoundData();
            travelCellListV3WidgetViewHolder.bindOnBoarding(onboarding, atom, boundData2 != null ? boundData2.getLayoutModel() : null);
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelCellListV3WidgetViewHolder$subscribeToOnboarding$2(TravelCellListV3WidgetViewHolder travelCellListV3WidgetViewHolder, d<? super TravelCellListV3WidgetViewHolder$subscribeToOnboarding$2> dVar) {
        super(2, dVar);
        this.this$0 = travelCellListV3WidgetViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        TravelCellListV3WidgetViewHolder$subscribeToOnboarding$2 travelCellListV3WidgetViewHolder$subscribeToOnboarding$2 = new TravelCellListV3WidgetViewHolder$subscribeToOnboarding$2(this.this$0, dVar);
        travelCellListV3WidgetViewHolder$subscribeToOnboarding$2.L$0 = obj;
        return travelCellListV3WidgetViewHolder$subscribeToOnboarding$2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        C10727i.c(K.a(this.this$0), null, null, new AnonymousClass1(this.this$0, (TravelCellListV3ViewModel.OnboardingEvent) this.L$0, null), 3);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(TravelCellListV3ViewModel.OnboardingEvent onboardingEvent, d<? super Unit> dVar) {
        return ((TravelCellListV3WidgetViewHolder$subscribeToOnboarding$2) create(onboardingEvent, dVar)).invokeSuspend(Unit.f71690a);
    }
}
