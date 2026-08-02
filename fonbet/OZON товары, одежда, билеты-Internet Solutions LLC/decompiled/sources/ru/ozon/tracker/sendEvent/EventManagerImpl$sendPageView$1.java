package ru.ozon.tracker.sendEvent;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.tracker.sendEvent.repository.EventRepository;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.tracker.sendEvent.EventManagerImpl$sendPageView$1", f = "EventManager.kt", l = {521, 521}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class EventManagerImpl$sendPageView$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Page $page;
    Object L$0;
    int label;
    final /* synthetic */ EventManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EventManagerImpl$sendPageView$1(EventManagerImpl eventManagerImpl, Page page, d<? super EventManagerImpl$sendPageView$1> dVar) {
        super(2, dVar);
        this.this$0 = eventManagerImpl;
        this.$page = page;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new EventManagerImpl$sendPageView$1(this.this$0, this.$page, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        if (r1.saveEvent((ru.ozon.tracker.db.entities.DbEvent) r6, r5) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        if (r6 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EventRepository eventRepository;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            eventRepository = this.this$0.getEventRepository();
            EventManagerImpl eventManagerImpl = this.this$0;
            Page page = this.$page;
            this.L$0 = eventRepository;
            this.label = 1;
            obj = eventManagerImpl.createPageView(page, this);
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            eventRepository = (EventRepository) this.L$0;
            s.b(obj);
        }
        this.L$0 = null;
        this.label = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((EventManagerImpl$sendPageView$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
