package ru.ozon.app.android.travel.feature.hotels.widgets.travelHotelCard.v3.presentation;

import Sc.s;
import Wc.a;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.hotels.widgets.travelHotelCard.v3.presentation.TravelHotelCardV3ViewModel$startTimer$1", f = "TravelHotelCardV3ViewModel.kt", l = {23}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class TravelHotelCardV3ViewModel$startTimer$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction $action;
    final /* synthetic */ int $timeLeft;
    int label;
    final /* synthetic */ TravelHotelCardV3ViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelHotelCardV3ViewModel$startTimer$1(int i11, TravelHotelCardV3ViewModel travelHotelCardV3ViewModel, AtomAction atomAction, d<? super TravelHotelCardV3ViewModel$startTimer$1> dVar) {
        super(2, dVar);
        this.$timeLeft = i11;
        this.this$0 = travelHotelCardV3ViewModel;
        this.$action = atomAction;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new TravelHotelCardV3ViewModel$startTimer$1(this.$timeLeft, this.this$0, this.$action, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        SingleLiveEvent singleLiveEvent;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            long millis = TimeUnit.SECONDS.toMillis(this.$timeLeft);
            this.label = 1;
            if (Y.b(millis, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        singleLiveEvent = this.this$0.actionLiveData;
        singleLiveEvent.setValue(this.$action);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((TravelHotelCardV3ViewModel$startTimer$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
