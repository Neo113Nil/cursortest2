package ru.ozon.tracker.sendEvent;

import Sc.r;
import Sc.s;
import Wc.a;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.tracker.db.entities.DbEvent;
import ru.ozon.tracker.sendEvent.repository.EventRepository;
import xe.M;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lxe/M;", "LSc/r;", "", "<anonymous>", "(Lxe/M;)LSc/r;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.tracker.sendEvent.SendEventThrowableHandlerImpl$deleteEvents$2", f = "SendEventThrowableHandler.kt", l = {111}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SendEventThrowableHandlerImpl$deleteEvents$2 extends j implements Function2<M, d<? super r<? extends Integer>>, Object> {
    final /* synthetic */ List<DbEvent> $batch;
    int label;
    final /* synthetic */ SendEventThrowableHandlerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SendEventThrowableHandlerImpl$deleteEvents$2(SendEventThrowableHandlerImpl sendEventThrowableHandlerImpl, List<DbEvent> list, d<? super SendEventThrowableHandlerImpl$deleteEvents$2> dVar) {
        super(2, dVar);
        this.this$0 = sendEventThrowableHandlerImpl;
        this.$batch = list;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new SendEventThrowableHandlerImpl$deleteEvents$2(this.this$0, this.$batch, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(M m11, d<? super r<? extends Integer>> dVar) {
        return invoke2(m11, (d<? super r<Integer>>) dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        EventRepository eventRepository;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                SendEventThrowableHandlerImpl sendEventThrowableHandlerImpl = this.this$0;
                List<DbEvent> list = this.$batch;
                eventRepository = sendEventThrowableHandlerImpl.getEventRepository();
                this.label = 1;
                obj = eventRepository.deleteEvents(list, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            a11 = new Integer(((Number) obj).intValue());
            r.Companion companion = r.INSTANCE;
        } catch (CancellationException e11) {
            throw e11;
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            a11 = s.a(th2);
        }
        return r.a(a11);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(M m11, d<? super r<Integer>> dVar) {
        return ((SendEventThrowableHandlerImpl$deleteEvents$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
