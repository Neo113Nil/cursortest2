package ru.ozon.tracker.sendEvent;

import Sc.s;
import Wc.a;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, d2 = {"<anonymous>", "", "<unused var>", "Lkotlin/coroutines/CoroutineContext;", "e", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.tracker.sendEvent.EventUpdateHandler$eventUpdateSource$2", f = "EventUpdateHandler.kt", l = {46}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class EventUpdateHandler$eventUpdateSource$2 extends j implements InterfaceC6511n<CoroutineContext, Throwable, d<? super Unit>, Object> {
    final /* synthetic */ Function2<Throwable, d<? super Unit>, Object> $onPreHandledError;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EventUpdateHandler$eventUpdateSource$2(Function2<? super Throwable, ? super d<? super Unit>, ? extends Object> function2, d<? super EventUpdateHandler$eventUpdateSource$2> dVar) {
        super(3, dVar);
        this.$onPreHandledError = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            Throwable th2 = (Throwable) this.L$0;
            Function2<Throwable, d<? super Unit>, Object> function2 = this.$onPreHandledError;
            this.label = 1;
            if (function2.invoke(th2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        this.$onPreHandledError.invoke((Throwable) this.L$0, this);
        return Unit.f71690a;
    }

    @Override // fd.InterfaceC6511n
    public final Object invoke(CoroutineContext coroutineContext, Throwable th2, d<? super Unit> dVar) {
        EventUpdateHandler$eventUpdateSource$2 eventUpdateHandler$eventUpdateSource$2 = new EventUpdateHandler$eventUpdateSource$2(this.$onPreHandledError, dVar);
        eventUpdateHandler$eventUpdateSource$2.L$0 = th2;
        return eventUpdateHandler$eventUpdateSource$2.invokeSuspend(Unit.f71690a);
    }
}
