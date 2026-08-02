package ru.ozon.tracker.sendEvent;

import Sc.r;
import Sc.s;
import Wc.a;
import com.google.android.gms.identity.intents.AddressConstants;
import fi0.x;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.l;
import mi0.InterfaceC8336f;
import ru.ozon.fintech.ui.input.CounterView;
import ru.ozon.tracker.db.entities.DbEvent;
import ru.ozon.tracker.sendEvent.EventUpdateHandler;
import ru.ozon.tracker.sendEvent.repository.EventRepository;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.tracker.sendEvent.EventManagerImpl$sendBatches$2", f = "EventManager.kt", l = {550, AddressConstants.ErrorCodes.ERROR_CODE_NO_APPLICABLE_ADDRESSES, 556, 562, 563, 570, 571, 576}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class EventManagerImpl$sendBatches$2 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ EventUpdateHandler.UpdateState $updateState;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ EventManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EventManagerImpl$sendBatches$2(EventManagerImpl eventManagerImpl, EventUpdateHandler.UpdateState updateState, d<? super EventManagerImpl$sendBatches$2> dVar) {
        super(2, dVar);
        this.this$0 = eventManagerImpl;
        this.$updateState = updateState;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new EventManagerImpl$sendBatches$2(this.this$0, this.$updateState, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x00b9, code lost:
    
        if (r15 == r2) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0215, code lost:
    
        if (r15 != r2) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0176, code lost:
    
        if (r15 == r2) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0120, code lost:
    
        if (r15 == r2) goto L111;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01c3  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object clearObsoleteEvents;
        int q11;
        EventManagerImpl eventManagerImpl;
        int i11;
        int i12;
        Object countNotPendingEvents;
        Object a11;
        int i13;
        int i14;
        Object m1667mapToHandled1vKEnOE$default;
        EventManagerImpl$sendBatches$2 eventManagerImpl$sendBatches$2;
        EventManagerImpl eventManagerImpl2;
        Throwable th2;
        Object a12;
        Object m1667mapToHandled1vKEnOE$default2;
        List<DbEvent> list;
        EventManagerImpl eventManagerImpl3;
        EventUpdateHandler.UpdateState updateState;
        EventRepository eventRepository;
        EventManagerImpl eventManagerImpl4;
        Object deleteEvents;
        EventUpdateHandler.UpdateState updateState2;
        Throwable th3;
        Object a13;
        Object m1666mapToHandled1vKEnOE;
        InterfaceC8336f interfaceC8336f;
        InterfaceC8336f interfaceC8336f2;
        a aVar = a.COROUTINE_SUSPENDED;
        try {
            try {
                switch (this.label) {
                    case 0:
                        s.b(obj);
                        EventManagerImpl eventManagerImpl5 = this.this$0;
                        this.label = 1;
                        clearObsoleteEvents = eventManagerImpl5.clearObsoleteEvents(this);
                        break;
                    case 1:
                        s.b(obj);
                        int i15 = this.$updateState != EventUpdateHandler.UpdateState.FORCE ? 0 : 1;
                        x xVar = this.this$0.settings;
                        if (i15 != 0) {
                            xVar.getClass();
                            q11 = CounterView.COUNTER_MAX_DEFAULT;
                        } else {
                            q11 = xVar.q();
                        }
                        eventManagerImpl = this.this$0;
                        try {
                            try {
                                EventRepository eventRepository2 = eventManagerImpl.getEventRepository();
                                this.L$0 = eventManagerImpl;
                                this.I$0 = i15;
                                this.I$1 = q11;
                                this.label = 2;
                                countNotPendingEvents = eventRepository2.getCountNotPendingEvents(this);
                            } catch (CancellationException e11) {
                                throw e11;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            i11 = i15;
                            i12 = q11;
                            Throwable th5 = th;
                            r.Companion companion = r.INSTANCE;
                            a11 = s.a(th5);
                            Object obj2 = a11;
                            i13 = i12;
                            i14 = i11;
                            EventManagerImpl eventManagerImpl6 = eventManagerImpl;
                            this.L$0 = null;
                            this.I$0 = i14;
                            this.I$1 = i13;
                            this.label = 3;
                            m1667mapToHandled1vKEnOE$default = EventManagerImpl.m1667mapToHandled1vKEnOE$default(eventManagerImpl6, obj2, null, this, 1, null);
                            eventManagerImpl$sendBatches$2 = this;
                            break;
                        }
                        if (countNotPendingEvents != aVar) {
                            i11 = i15;
                            i12 = q11;
                            obj = countNotPendingEvents;
                            a11 = new Long(((Number) obj).longValue());
                            r.Companion companion2 = r.INSTANCE;
                            Object obj22 = a11;
                            i13 = i12;
                            i14 = i11;
                            EventManagerImpl eventManagerImpl62 = eventManagerImpl;
                            this.L$0 = null;
                            this.I$0 = i14;
                            this.I$1 = i13;
                            this.label = 3;
                            m1667mapToHandled1vKEnOE$default = EventManagerImpl.m1667mapToHandled1vKEnOE$default(eventManagerImpl62, obj22, null, this, 1, null);
                            eventManagerImpl$sendBatches$2 = this;
                        }
                        return aVar;
                    case 2:
                        i12 = this.I$1;
                        i11 = this.I$0;
                        eventManagerImpl = (EventManagerImpl) this.L$0;
                        try {
                            s.b(obj);
                            a11 = new Long(((Number) obj).longValue());
                            r.Companion companion22 = r.INSTANCE;
                        } catch (Throwable th6) {
                            th = th6;
                            Throwable th52 = th;
                            r.Companion companion3 = r.INSTANCE;
                            a11 = s.a(th52);
                            Object obj222 = a11;
                            i13 = i12;
                            i14 = i11;
                            EventManagerImpl eventManagerImpl622 = eventManagerImpl;
                            this.L$0 = null;
                            this.I$0 = i14;
                            this.I$1 = i13;
                            this.label = 3;
                            m1667mapToHandled1vKEnOE$default = EventManagerImpl.m1667mapToHandled1vKEnOE$default(eventManagerImpl622, obj222, null, this, 1, null);
                            eventManagerImpl$sendBatches$2 = this;
                            break;
                        }
                        Object obj2222 = a11;
                        i13 = i12;
                        i14 = i11;
                        EventManagerImpl eventManagerImpl6222 = eventManagerImpl;
                        this.L$0 = null;
                        this.I$0 = i14;
                        this.I$1 = i13;
                        this.label = 3;
                        m1667mapToHandled1vKEnOE$default = EventManagerImpl.m1667mapToHandled1vKEnOE$default(eventManagerImpl6222, obj2222, null, this, 1, null);
                        eventManagerImpl$sendBatches$2 = this;
                    case 3:
                        i13 = this.I$1;
                        i14 = this.I$0;
                        s.b(obj);
                        m1667mapToHandled1vKEnOE$default = ((r) obj).getF26106a();
                        eventManagerImpl$sendBatches$2 = this;
                        if (r.b(m1667mapToHandled1vKEnOE$default) != null) {
                            m1667mapToHandled1vKEnOE$default = new Long(0L);
                        }
                        long longValue = ((Number) m1667mapToHandled1vKEnOE$default).longValue();
                        if (i14 == 0 && longValue < i13) {
                            return Unit.f71690a;
                        }
                        eventManagerImpl2 = eventManagerImpl$sendBatches$2.this$0;
                        try {
                            EventRepository eventRepository3 = eventManagerImpl2.getEventRepository();
                            eventManagerImpl$sendBatches$2.L$0 = eventManagerImpl2;
                            eventManagerImpl$sendBatches$2.label = 4;
                            obj = eventRepository3.getBatch(i13, this);
                        } catch (CancellationException e12) {
                            throw e12;
                        } catch (Throwable th7) {
                            th2 = th7;
                            r.Companion companion4 = r.INSTANCE;
                            a12 = s.a(th2);
                            Object obj3 = a12;
                            EventManagerImpl eventManagerImpl7 = eventManagerImpl2;
                            eventManagerImpl$sendBatches$2.L$0 = null;
                            eventManagerImpl$sendBatches$2.label = 5;
                            m1667mapToHandled1vKEnOE$default2 = EventManagerImpl.m1667mapToHandled1vKEnOE$default(eventManagerImpl7, obj3, null, eventManagerImpl$sendBatches$2, 1, null);
                            break;
                        }
                        if (obj == aVar) {
                            return aVar;
                        }
                        a12 = (List) obj;
                        r.Companion companion5 = r.INSTANCE;
                        Object obj32 = a12;
                        EventManagerImpl eventManagerImpl72 = eventManagerImpl2;
                        eventManagerImpl$sendBatches$2.L$0 = null;
                        eventManagerImpl$sendBatches$2.label = 5;
                        m1667mapToHandled1vKEnOE$default2 = EventManagerImpl.m1667mapToHandled1vKEnOE$default(eventManagerImpl72, obj32, null, eventManagerImpl$sendBatches$2, 1, null);
                        break;
                    case 4:
                        eventManagerImpl2 = (EventManagerImpl) this.L$0;
                        try {
                            s.b(obj);
                            eventManagerImpl$sendBatches$2 = this;
                            a12 = (List) obj;
                            r.Companion companion52 = r.INSTANCE;
                        } catch (CancellationException e13) {
                            throw e13;
                        } catch (Throwable th8) {
                            th2 = th8;
                            eventManagerImpl$sendBatches$2 = this;
                            r.Companion companion42 = r.INSTANCE;
                            a12 = s.a(th2);
                            Object obj322 = a12;
                            EventManagerImpl eventManagerImpl722 = eventManagerImpl2;
                            eventManagerImpl$sendBatches$2.L$0 = null;
                            eventManagerImpl$sendBatches$2.label = 5;
                            m1667mapToHandled1vKEnOE$default2 = EventManagerImpl.m1667mapToHandled1vKEnOE$default(eventManagerImpl722, obj322, null, eventManagerImpl$sendBatches$2, 1, null);
                            break;
                        }
                        Object obj3222 = a12;
                        EventManagerImpl eventManagerImpl7222 = eventManagerImpl2;
                        eventManagerImpl$sendBatches$2.L$0 = null;
                        eventManagerImpl$sendBatches$2.label = 5;
                        m1667mapToHandled1vKEnOE$default2 = EventManagerImpl.m1667mapToHandled1vKEnOE$default(eventManagerImpl7222, obj3222, null, eventManagerImpl$sendBatches$2, 1, null);
                    case 5:
                        s.b(obj);
                        m1667mapToHandled1vKEnOE$default2 = ((r) obj).getF26106a();
                        eventManagerImpl$sendBatches$2 = this;
                        r.Companion companion6 = r.INSTANCE;
                        if (m1667mapToHandled1vKEnOE$default2 instanceof r.b) {
                            m1667mapToHandled1vKEnOE$default2 = null;
                        }
                        list = (List) m1667mapToHandled1vKEnOE$default2;
                        List<DbEvent> list2 = list;
                        if (list2 == null || list2.isEmpty()) {
                            return Unit.f71690a;
                        }
                        eventManagerImpl3 = eventManagerImpl$sendBatches$2.this$0;
                        updateState = eventManagerImpl$sendBatches$2.$updateState;
                        try {
                            eventRepository = eventManagerImpl3.getEventRepository();
                            eventManagerImpl$sendBatches$2.L$0 = list;
                            eventManagerImpl$sendBatches$2.L$1 = eventManagerImpl3;
                            eventManagerImpl$sendBatches$2.L$2 = updateState;
                            eventManagerImpl$sendBatches$2.L$3 = eventRepository;
                            eventManagerImpl$sendBatches$2.L$4 = eventManagerImpl3;
                            eventManagerImpl$sendBatches$2.label = 6;
                        } catch (CancellationException e14) {
                            throw e14;
                        } catch (Throwable th9) {
                            th3 = th9;
                            r.Companion companion7 = r.INSTANCE;
                            a13 = s.a(th3);
                            eventManagerImpl$sendBatches$2.L$0 = null;
                            eventManagerImpl$sendBatches$2.L$1 = null;
                            eventManagerImpl$sendBatches$2.L$2 = null;
                            eventManagerImpl$sendBatches$2.L$3 = null;
                            eventManagerImpl$sendBatches$2.L$4 = null;
                            eventManagerImpl$sendBatches$2.label = 8;
                            m1666mapToHandled1vKEnOE = eventManagerImpl3.m1666mapToHandled1vKEnOE(a13, list, this);
                            break;
                        }
                        if (eventRepository.sendEvents(list, this) == aVar) {
                            return aVar;
                        }
                        eventManagerImpl4 = eventManagerImpl3;
                        eventManagerImpl$sendBatches$2.L$0 = list;
                        eventManagerImpl$sendBatches$2.L$1 = eventManagerImpl4;
                        eventManagerImpl$sendBatches$2.L$2 = updateState;
                        eventManagerImpl$sendBatches$2.L$3 = eventManagerImpl3;
                        eventManagerImpl$sendBatches$2.L$4 = null;
                        eventManagerImpl$sendBatches$2.label = 7;
                        deleteEvents = eventRepository.deleteEvents(list, this);
                        if (deleteEvents != aVar) {
                            return aVar;
                        }
                        updateState2 = updateState;
                        obj = deleteEvents;
                        ((Number) obj).intValue();
                        interfaceC8336f = eventManagerImpl4.eventsLogger;
                        interfaceC8336f.log("Sending cause: " + updateState2);
                        interfaceC8336f2 = eventManagerImpl4.eventsLogger;
                        interfaceC8336f2.a(l.v(C7714v.w(list), EventManagerImpl$sendBatches$2$1$2.INSTANCE));
                        a13 = Unit.f71690a;
                        r.Companion companion8 = r.INSTANCE;
                        eventManagerImpl$sendBatches$2.L$0 = null;
                        eventManagerImpl$sendBatches$2.L$1 = null;
                        eventManagerImpl$sendBatches$2.L$2 = null;
                        eventManagerImpl$sendBatches$2.L$3 = null;
                        eventManagerImpl$sendBatches$2.L$4 = null;
                        eventManagerImpl$sendBatches$2.label = 8;
                        m1666mapToHandled1vKEnOE = eventManagerImpl3.m1666mapToHandled1vKEnOE(a13, list, this);
                        break;
                    case 6:
                        eventManagerImpl3 = (EventManagerImpl) this.L$4;
                        eventRepository = (EventRepository) this.L$3;
                        EventUpdateHandler.UpdateState updateState3 = (EventUpdateHandler.UpdateState) this.L$2;
                        EventManagerImpl eventManagerImpl8 = (EventManagerImpl) this.L$1;
                        List<DbEvent> list3 = (List) this.L$0;
                        try {
                            s.b(obj);
                            eventManagerImpl$sendBatches$2 = this;
                            updateState = updateState3;
                            eventManagerImpl4 = eventManagerImpl8;
                            list = list3;
                            eventManagerImpl$sendBatches$2.L$0 = list;
                            eventManagerImpl$sendBatches$2.L$1 = eventManagerImpl4;
                            eventManagerImpl$sendBatches$2.L$2 = updateState;
                            eventManagerImpl$sendBatches$2.L$3 = eventManagerImpl3;
                            eventManagerImpl$sendBatches$2.L$4 = null;
                            eventManagerImpl$sendBatches$2.label = 7;
                            deleteEvents = eventRepository.deleteEvents(list, this);
                            if (deleteEvents != aVar) {
                            }
                        } catch (Throwable th10) {
                            th3 = th10;
                            eventManagerImpl$sendBatches$2 = this;
                            list = list3;
                            r.Companion companion72 = r.INSTANCE;
                            a13 = s.a(th3);
                            eventManagerImpl$sendBatches$2.L$0 = null;
                            eventManagerImpl$sendBatches$2.L$1 = null;
                            eventManagerImpl$sendBatches$2.L$2 = null;
                            eventManagerImpl$sendBatches$2.L$3 = null;
                            eventManagerImpl$sendBatches$2.L$4 = null;
                            eventManagerImpl$sendBatches$2.label = 8;
                            m1666mapToHandled1vKEnOE = eventManagerImpl3.m1666mapToHandled1vKEnOE(a13, list, this);
                            break;
                        }
                        break;
                    case 7:
                        eventManagerImpl3 = (EventManagerImpl) this.L$3;
                        updateState2 = (EventUpdateHandler.UpdateState) this.L$2;
                        eventManagerImpl4 = (EventManagerImpl) this.L$1;
                        list = (List) this.L$0;
                        try {
                            s.b(obj);
                            eventManagerImpl$sendBatches$2 = this;
                            ((Number) obj).intValue();
                            interfaceC8336f = eventManagerImpl4.eventsLogger;
                            interfaceC8336f.log("Sending cause: " + updateState2);
                            interfaceC8336f2 = eventManagerImpl4.eventsLogger;
                            interfaceC8336f2.a(l.v(C7714v.w(list), EventManagerImpl$sendBatches$2$1$2.INSTANCE));
                            a13 = Unit.f71690a;
                            r.Companion companion82 = r.INSTANCE;
                        } catch (Throwable th11) {
                            th3 = th11;
                            eventManagerImpl$sendBatches$2 = this;
                            r.Companion companion722 = r.INSTANCE;
                            a13 = s.a(th3);
                            eventManagerImpl$sendBatches$2.L$0 = null;
                            eventManagerImpl$sendBatches$2.L$1 = null;
                            eventManagerImpl$sendBatches$2.L$2 = null;
                            eventManagerImpl$sendBatches$2.L$3 = null;
                            eventManagerImpl$sendBatches$2.L$4 = null;
                            eventManagerImpl$sendBatches$2.label = 8;
                            m1666mapToHandled1vKEnOE = eventManagerImpl3.m1666mapToHandled1vKEnOE(a13, list, this);
                            break;
                        }
                        eventManagerImpl$sendBatches$2.L$0 = null;
                        eventManagerImpl$sendBatches$2.L$1 = null;
                        eventManagerImpl$sendBatches$2.L$2 = null;
                        eventManagerImpl$sendBatches$2.L$3 = null;
                        eventManagerImpl$sendBatches$2.L$4 = null;
                        eventManagerImpl$sendBatches$2.label = 8;
                        m1666mapToHandled1vKEnOE = eventManagerImpl3.m1666mapToHandled1vKEnOE(a13, list, this);
                    case 8:
                        s.b(obj);
                        ((r) obj).getClass();
                        return Unit.f71690a;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (CancellationException e15) {
                throw e15;
            }
        } catch (CancellationException e16) {
            throw e16;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((EventManagerImpl$sendBatches$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
