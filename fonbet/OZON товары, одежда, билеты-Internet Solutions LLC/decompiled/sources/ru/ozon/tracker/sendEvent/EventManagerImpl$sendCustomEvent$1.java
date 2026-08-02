package ru.ozon.tracker.sendEvent;

import Sc.s;
import Wc.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.tracker.sendEvent.repository.EventRepository;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.tracker.sendEvent.EventManagerImpl$sendCustomEvent$1", f = "EventManager.kt", l = {375, 379}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class EventManagerImpl$sendCustomEvent$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Map<String, Object> $custom;
    final /* synthetic */ String $uuid;
    int label;
    final /* synthetic */ EventManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EventManagerImpl$sendCustomEvent$1(EventManagerImpl eventManagerImpl, String str, Map<String, ? extends Object> map, d<? super EventManagerImpl$sendCustomEvent$1> dVar) {
        super(2, dVar);
        this.this$0 = eventManagerImpl;
        this.$uuid = str;
        this.$custom = map;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new EventManagerImpl$sendCustomEvent$1(this.this$0, this.$uuid, this.$custom, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        if (r1.saveEvent((ru.ozon.tracker.db.entities.DbEvent) r6, r5) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if (r6 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EventMapper eventMapper;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            eventMapper = this.this$0.eventMapper;
            String str = this.$uuid;
            Map<String, ? extends Object> map = this.$custom;
            this.label = 1;
            obj = eventMapper.createCustomEventEntity(str, map, this);
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            s.b(obj);
        }
        EventRepository eventRepository = this.this$0.getEventRepository();
        this.label = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((EventManagerImpl$sendCustomEvent$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
