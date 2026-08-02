package ru.ozon.tracker.sendEvent;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import ru.ozon.tracker.sendEvent.EventUpdateHandler;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lru/ozon/tracker/sendEvent/EventUpdateHandler$UpdateState;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.tracker.sendEvent.EventUpdateHandler$timerUpdateSource$1", f = "EventUpdateHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class EventUpdateHandler$timerUpdateSource$1 extends j implements Function1<d<? super EventUpdateHandler.UpdateState>, Object> {
    int label;

    EventUpdateHandler$timerUpdateSource$1(d<? super EventUpdateHandler$timerUpdateSource$1> dVar) {
        super(1, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(d<?> dVar) {
        return new EventUpdateHandler$timerUpdateSource$1(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        return EventUpdateHandler.UpdateState.FORCE;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(d<? super EventUpdateHandler.UpdateState> dVar) {
        return ((EventUpdateHandler$timerUpdateSource$1) create(dVar)).invokeSuspend(Unit.f71690a);
    }
}
