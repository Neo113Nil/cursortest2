package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.presentation.progress.view;

import Sc.s;
import Wc.a;
import com.airbnb.lottie.LottieAnimationView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.presentation.progress.view.TravelRailwaySearchResultsV4LoaderView$completeAnimationAndRefresh$1", f = "TravelRailwaySearchResultsV4LoaderView.kt", l = {74}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class TravelRailwaySearchResultsV4LoaderView$completeAnimationAndRefresh$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ AtomAction $atomAction;
    int label;
    final /* synthetic */ TravelRailwaySearchResultsV4LoaderView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TravelRailwaySearchResultsV4LoaderView$completeAnimationAndRefresh$1(TravelRailwaySearchResultsV4LoaderView travelRailwaySearchResultsV4LoaderView, Function1<? super AtomAction, Unit> function1, AtomAction atomAction, d<? super TravelRailwaySearchResultsV4LoaderView$completeAnimationAndRefresh$1> dVar) {
        super(2, dVar);
        this.this$0 = travelRailwaySearchResultsV4LoaderView;
        this.$actionHandler = function1;
        this.$atomAction = atomAction;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new TravelRailwaySearchResultsV4LoaderView$completeAnimationAndRefresh$1(this.this$0, this.$actionHandler, this.$atomAction, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        LottieAnimationView lottieAnimationView;
        float f7;
        LottieAnimationView lottieAnimationView2;
        long j11;
        LottieAnimationView lottieAnimationView3;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            lottieAnimationView = this.this$0.lottieView;
            f7 = this.this$0.speedCoefficient;
            lottieAnimationView2 = this.this$0.lottieView;
            lottieAnimationView.setSpeed((1 - lottieAnimationView2.getProgress()) * f7);
            j11 = this.this$0.delayTiming;
            this.label = 1;
            if (Y.b(j11 / 10, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        this.$actionHandler.invoke(this.$atomAction);
        lottieAnimationView3 = this.this$0.lottieView;
        lottieAnimationView3.cancelAnimation();
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((TravelRailwaySearchResultsV4LoaderView$completeAnimationAndRefresh$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
