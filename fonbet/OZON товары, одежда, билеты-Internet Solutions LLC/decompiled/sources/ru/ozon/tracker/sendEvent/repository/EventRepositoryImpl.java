package ru.ozon.tracker.sendEvent.repository;

import Ae.C;
import Ae.InterfaceC2395h;
import Ib.a;
import Mj0.h;
import Sc.o;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.e0;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import li0.InterfaceC7963a;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import org.json.JSONObject;
import ru.ozon.tracker.db.entities.DbEvent;
import ru.ozon.tracker.db.entities.EventType;
import ru.ozon.tracker.sendEvent.BadRequestException;
import ru.ozon.tracker.sendEvent.SerializationException;
import ru.ozon.tracker.sendEvent.repository.EventRepository;
import xe.C10727i;
import xe.I;
import xe.N0;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B/\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J,\u0010\u0019\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00152\u0006\u0010\u0016\u001a\u00020\u00122\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0082\b¢\u0006\u0004\b\u0019\u0010\u001aJ\u001e\u0010\u001c\u001a\u00020\u001b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00120\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0096@¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#H\u0096@¢\u0006\u0004\b$\u0010\"J\u0010\u0010&\u001a\u00020%H\u0096@¢\u0006\u0004\b&\u0010\"J\u001e\u0010'\u001a\u00020%2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0096@¢\u0006\u0004\b'\u0010\u001dJ\u0018\u0010)\u001a\u00020%2\u0006\u0010(\u001a\u00020\fH\u0096@¢\u0006\u0004\b)\u0010*J\u001e\u0010,\u001a\u00020+2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0096@¢\u0006\u0004\b,\u0010\u001dJ\u0010\u0010-\u001a\u00020%H\u0096@¢\u0006\u0004\b-\u0010\"J\u0018\u00100\u001a\u00020%2\u0006\u0010/\u001a\u00020.H\u0096@¢\u0006\u0004\b0\u00101J\u001e\u00103\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u00102\u001a\u00020+H\u0096@¢\u0006\u0004\b3\u00104R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00105R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00105R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00106R\"\u0010:\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020908078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006<"}, d2 = {"Lru/ozon/tracker/sendEvent/repository/EventRepositoryImpl;", "Lru/ozon/tracker/sendEvent/repository/EventRepository;", "LIb/a;", "Lli0/a;", "eventDaoLazy", "LMj0/h;", "trackerApiLazy", "Lxe/I;", "ioDispatcher", "<init>", "(LIb/a;LIb/a;Lxe/I;)V", "", "Lru/ozon/tracker/db/entities/DbEvent;", "events", "Lorg/json/JSONObject;", "createMultiEventTypeBunch", "(Ljava/util/List;)Ljava/util/List;", "Lru/ozon/tracker/db/entities/EventType;", "", "toMultiEventKey", "(Lru/ozon/tracker/db/entities/EventType;)Ljava/lang/String;", "T", "message", "Lkotlin/Function0;", "block", "tryCatching", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Lru/ozon/tracker/sendEvent/repository/EventRepository$SendEventResult;", "sendEvents", "(Ljava/util/List;Lkotlin/coroutines/d;)Ljava/lang/Object;", "LAe/h;", "onChangedEvents", "()LAe/h;", "getAllEvents", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "getCountNotPendingEvents", "", "resetPendingStatus", "saveEvents", "event", "saveEvent", "(Lru/ozon/tracker/db/entities/DbEvent;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "deleteEvents", "clear", "Lorg/joda/time/DateTime;", "date", "clearUnderDate", "(Lorg/joda/time/DateTime;Lkotlin/coroutines/d;)Ljava/lang/Object;", "batchSize", "getBatch", "(ILkotlin/coroutines/d;)Ljava/lang/Object;", "LIb/a;", "Lxe/I;", "", "Ljava/lang/Class;", "", "nonRepeatableExceptions", "Ljava/util/Set;", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EventRepositoryImpl implements EventRepository {

    @NotNull
    private final a<InterfaceC7963a> eventDaoLazy;

    @NotNull
    private final I ioDispatcher;

    @NotNull
    private final Set<Class<? extends Throwable>> nonRepeatableExceptions;

    @NotNull
    private final a<h> trackerApiLazy;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EventType.values().length];
            try {
                iArr[EventType.USUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EventType.TRINITY_EVENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public EventRepositoryImpl(@NotNull a<InterfaceC7963a> eventDaoLazy, @NotNull a<h> trackerApiLazy, @NotNull I ioDispatcher) {
        Intrinsics.checkNotNullParameter(eventDaoLazy, "eventDaoLazy");
        Intrinsics.checkNotNullParameter(trackerApiLazy, "trackerApiLazy");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.eventDaoLazy = eventDaoLazy;
        this.trackerApiLazy = trackerApiLazy;
        this.ioDispatcher = ioDispatcher;
        this.nonRepeatableExceptions = e0.h(BadRequestException.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<JSONObject> createMultiEventTypeBunch(List<DbEvent> events) {
        try {
            List<DbEvent> list = events;
            ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
            for (DbEvent dbEvent : list) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(toMultiEventKey(dbEvent.getType()), new JSONObject(dbEvent.getEventBody()));
                arrayList.add(jSONObject);
            }
            return arrayList;
        } catch (Exception e11) {
            if (e11 instanceof CancellationException) {
                throw e11;
            }
            throw new SerializationException(e11);
        }
    }

    private final String toMultiEventKey(EventType eventType) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[eventType.ordinal()];
        if (i11 == 1) {
            return "event";
        }
        if (i11 == 2) {
            return "trinityEvent";
        }
        throw new o();
    }

    private final <T> T tryCatching(String message, Function0<? extends T> block) {
        try {
            return block.invoke();
        } catch (Exception e11) {
            if (e11 instanceof CancellationException) {
                throw e11;
            }
            throw new DatabaseException(message, e11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // ru.ozon.tracker.sendEvent.repository.EventRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object clear(@NotNull d<? super Unit> dVar) {
        EventRepositoryImpl$clear$1 eventRepositoryImpl$clear$1;
        int i11;
        String str;
        Exception e11;
        if (dVar instanceof EventRepositoryImpl$clear$1) {
            eventRepositoryImpl$clear$1 = (EventRepositoryImpl$clear$1) dVar;
            int i12 = eventRepositoryImpl$clear$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                eventRepositoryImpl$clear$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = eventRepositoryImpl$clear$1.result;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = eventRepositoryImpl$clear$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    try {
                        InterfaceC7963a interfaceC7963a = this.eventDaoLazy.get();
                        eventRepositoryImpl$clear$1.L$0 = "clear";
                        eventRepositoryImpl$clear$1.label = 1;
                        if (interfaceC7963a.clear(eventRepositoryImpl$clear$1) == aVar) {
                            return aVar;
                        }
                    } catch (Exception e12) {
                        str = "clear";
                        e11 = e12;
                        if (e11 instanceof CancellationException) {
                            throw new DatabaseException(str, e11);
                        }
                        throw e11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) eventRepositoryImpl$clear$1.L$0;
                    try {
                        s.b(obj);
                    } catch (Exception e13) {
                        e11 = e13;
                        if (e11 instanceof CancellationException) {
                        }
                    }
                }
                return Unit.f71690a;
            }
        }
        eventRepositoryImpl$clear$1 = new EventRepositoryImpl$clear$1(this, dVar);
        Object obj2 = eventRepositoryImpl$clear$1.result;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = eventRepositoryImpl$clear$1.label;
        if (i11 != 0) {
        }
        return Unit.f71690a;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // ru.ozon.tracker.sendEvent.repository.EventRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object clearUnderDate(@NotNull DateTime dateTime, @NotNull d<? super Unit> dVar) {
        EventRepositoryImpl$clearUnderDate$1 eventRepositoryImpl$clearUnderDate$1;
        int i11;
        Exception e11;
        String str;
        if (dVar instanceof EventRepositoryImpl$clearUnderDate$1) {
            eventRepositoryImpl$clearUnderDate$1 = (EventRepositoryImpl$clearUnderDate$1) dVar;
            int i12 = eventRepositoryImpl$clearUnderDate$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                eventRepositoryImpl$clearUnderDate$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = eventRepositoryImpl$clearUnderDate$1.result;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = eventRepositoryImpl$clearUnderDate$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    try {
                        InterfaceC7963a interfaceC7963a = this.eventDaoLazy.get();
                        eventRepositoryImpl$clearUnderDate$1.L$0 = "clearUnderDate";
                        eventRepositoryImpl$clearUnderDate$1.label = 1;
                        if (interfaceC7963a.clearUnderDate(dateTime, eventRepositoryImpl$clearUnderDate$1) == aVar) {
                            return aVar;
                        }
                    } catch (Exception e12) {
                        e11 = e12;
                        str = "clearUnderDate";
                        if (e11 instanceof CancellationException) {
                            throw new DatabaseException(str, e11);
                        }
                        throw e11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) eventRepositoryImpl$clearUnderDate$1.L$0;
                    try {
                        s.b(obj);
                    } catch (Exception e13) {
                        e11 = e13;
                        if (e11 instanceof CancellationException) {
                        }
                    }
                }
                return Unit.f71690a;
            }
        }
        eventRepositoryImpl$clearUnderDate$1 = new EventRepositoryImpl$clearUnderDate$1(this, dVar);
        Object obj2 = eventRepositoryImpl$clearUnderDate$1.result;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = eventRepositoryImpl$clearUnderDate$1.label;
        if (i11 != 0) {
        }
        return Unit.f71690a;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // ru.ozon.tracker.sendEvent.repository.EventRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object deleteEvents(@NotNull List<DbEvent> list, @NotNull d<? super Integer> dVar) {
        EventRepositoryImpl$deleteEvents$1 eventRepositoryImpl$deleteEvents$1;
        int i11;
        Exception e11;
        String str;
        if (dVar instanceof EventRepositoryImpl$deleteEvents$1) {
            eventRepositoryImpl$deleteEvents$1 = (EventRepositoryImpl$deleteEvents$1) dVar;
            int i12 = eventRepositoryImpl$deleteEvents$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                eventRepositoryImpl$deleteEvents$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = eventRepositoryImpl$deleteEvents$1.result;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = eventRepositoryImpl$deleteEvents$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    try {
                        InterfaceC7963a interfaceC7963a = this.eventDaoLazy.get();
                        eventRepositoryImpl$deleteEvents$1.L$0 = "deleteEvents";
                        eventRepositoryImpl$deleteEvents$1.label = 1;
                        Object deleteEvents = interfaceC7963a.deleteEvents(list, eventRepositoryImpl$deleteEvents$1);
                        if (deleteEvents == aVar) {
                            return aVar;
                        }
                        obj = deleteEvents;
                        str = "deleteEvents";
                    } catch (Exception e12) {
                        e11 = e12;
                        str = "deleteEvents";
                        if (e11 instanceof CancellationException) {
                            throw new DatabaseException(str, e11);
                        }
                        throw e11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) eventRepositoryImpl$deleteEvents$1.L$0;
                    try {
                        s.b(obj);
                    } catch (Exception e13) {
                        e11 = e13;
                        if (e11 instanceof CancellationException) {
                        }
                    }
                }
                return new Integer(((Number) obj).intValue());
            }
        }
        eventRepositoryImpl$deleteEvents$1 = new EventRepositoryImpl$deleteEvents$1(this, dVar);
        Object obj2 = eventRepositoryImpl$deleteEvents$1.result;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = eventRepositoryImpl$deleteEvents$1.label;
        if (i11 != 0) {
        }
        return new Integer(((Number) obj2).intValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // ru.ozon.tracker.sendEvent.repository.EventRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getAllEvents(@NotNull d<? super List<DbEvent>> dVar) {
        EventRepositoryImpl$getAllEvents$1 eventRepositoryImpl$getAllEvents$1;
        int i11;
        String str;
        Exception e11;
        if (dVar instanceof EventRepositoryImpl$getAllEvents$1) {
            eventRepositoryImpl$getAllEvents$1 = (EventRepositoryImpl$getAllEvents$1) dVar;
            int i12 = eventRepositoryImpl$getAllEvents$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                eventRepositoryImpl$getAllEvents$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = eventRepositoryImpl$getAllEvents$1.result;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = eventRepositoryImpl$getAllEvents$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    try {
                        InterfaceC7963a interfaceC7963a = this.eventDaoLazy.get();
                        eventRepositoryImpl$getAllEvents$1.L$0 = "getAllEvents";
                        eventRepositoryImpl$getAllEvents$1.label = 1;
                        Object b11 = interfaceC7963a.b(eventRepositoryImpl$getAllEvents$1);
                        if (b11 == aVar) {
                            return aVar;
                        }
                        str = "getAllEvents";
                        obj = b11;
                    } catch (Exception e12) {
                        str = "getAllEvents";
                        e11 = e12;
                        if (e11 instanceof CancellationException) {
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) eventRepositoryImpl$getAllEvents$1.L$0;
                    try {
                        s.b(obj);
                    } catch (Exception e13) {
                        e11 = e13;
                        if (e11 instanceof CancellationException) {
                            throw new DatabaseException(str, e11);
                        }
                        throw e11;
                    }
                }
                return (List) obj;
            }
        }
        eventRepositoryImpl$getAllEvents$1 = new EventRepositoryImpl$getAllEvents$1(this, dVar);
        Object obj2 = eventRepositoryImpl$getAllEvents$1.result;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = eventRepositoryImpl$getAllEvents$1.label;
        if (i11 != 0) {
        }
        return (List) obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // ru.ozon.tracker.sendEvent.repository.EventRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getBatch(int i11, @NotNull d<? super List<DbEvent>> dVar) {
        EventRepositoryImpl$getBatch$1 eventRepositoryImpl$getBatch$1;
        int i12;
        Exception e11;
        String str;
        if (dVar instanceof EventRepositoryImpl$getBatch$1) {
            eventRepositoryImpl$getBatch$1 = (EventRepositoryImpl$getBatch$1) dVar;
            int i13 = eventRepositoryImpl$getBatch$1.label;
            if ((i13 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                eventRepositoryImpl$getBatch$1.label = i13 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = eventRepositoryImpl$getBatch$1.result;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i12 = eventRepositoryImpl$getBatch$1.label;
                if (i12 != 0) {
                    s.b(obj);
                    try {
                        InterfaceC7963a interfaceC7963a = this.eventDaoLazy.get();
                        eventRepositoryImpl$getBatch$1.L$0 = "getBatch";
                        eventRepositoryImpl$getBatch$1.label = 1;
                        Object batch = interfaceC7963a.getBatch(i11, eventRepositoryImpl$getBatch$1);
                        if (batch == aVar) {
                            return aVar;
                        }
                        obj = batch;
                        str = "getBatch";
                    } catch (Exception e12) {
                        e11 = e12;
                        str = "getBatch";
                        if (e11 instanceof CancellationException) {
                        }
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) eventRepositoryImpl$getBatch$1.L$0;
                    try {
                        s.b(obj);
                    } catch (Exception e13) {
                        e11 = e13;
                        if (e11 instanceof CancellationException) {
                            throw new DatabaseException(str, e11);
                        }
                        throw e11;
                    }
                }
                return (List) obj;
            }
        }
        eventRepositoryImpl$getBatch$1 = new EventRepositoryImpl$getBatch$1(this, dVar);
        Object obj2 = eventRepositoryImpl$getBatch$1.result;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i12 = eventRepositoryImpl$getBatch$1.label;
        if (i12 != 0) {
        }
        return (List) obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // ru.ozon.tracker.sendEvent.repository.EventRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getCountNotPendingEvents(@NotNull d<? super Long> dVar) {
        EventRepositoryImpl$getCountNotPendingEvents$1 eventRepositoryImpl$getCountNotPendingEvents$1;
        int i11;
        String str;
        Exception e11;
        if (dVar instanceof EventRepositoryImpl$getCountNotPendingEvents$1) {
            eventRepositoryImpl$getCountNotPendingEvents$1 = (EventRepositoryImpl$getCountNotPendingEvents$1) dVar;
            int i12 = eventRepositoryImpl$getCountNotPendingEvents$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                eventRepositoryImpl$getCountNotPendingEvents$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = eventRepositoryImpl$getCountNotPendingEvents$1.result;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = eventRepositoryImpl$getCountNotPendingEvents$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    try {
                        InterfaceC7963a interfaceC7963a = this.eventDaoLazy.get();
                        eventRepositoryImpl$getCountNotPendingEvents$1.L$0 = "getCountNotPendingEvents";
                        eventRepositoryImpl$getCountNotPendingEvents$1.label = 1;
                        Object countNotPendingEvents = interfaceC7963a.getCountNotPendingEvents(eventRepositoryImpl$getCountNotPendingEvents$1);
                        if (countNotPendingEvents == aVar) {
                            return aVar;
                        }
                        str = "getCountNotPendingEvents";
                        obj = countNotPendingEvents;
                    } catch (Exception e12) {
                        str = "getCountNotPendingEvents";
                        e11 = e12;
                        if (e11 instanceof CancellationException) {
                            throw new DatabaseException(str, e11);
                        }
                        throw e11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) eventRepositoryImpl$getCountNotPendingEvents$1.L$0;
                    try {
                        s.b(obj);
                    } catch (Exception e13) {
                        e11 = e13;
                        if (e11 instanceof CancellationException) {
                        }
                    }
                }
                return new Long(((Number) obj).longValue());
            }
        }
        eventRepositoryImpl$getCountNotPendingEvents$1 = new EventRepositoryImpl$getCountNotPendingEvents$1(this, dVar);
        Object obj2 = eventRepositoryImpl$getCountNotPendingEvents$1.result;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = eventRepositoryImpl$getCountNotPendingEvents$1.label;
        if (i11 != 0) {
        }
        return new Long(((Number) obj2).longValue());
    }

    @Override // ru.ozon.tracker.sendEvent.repository.EventRepository
    @NotNull
    public InterfaceC2395h<String> onChangedEvents() {
        return new C(this.eventDaoLazy.get().onChangedEvents(), new EventRepositoryImpl$onChangedEvents$1(null));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // ru.ozon.tracker.sendEvent.repository.EventRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object resetPendingStatus(@NotNull d<? super Unit> dVar) {
        EventRepositoryImpl$resetPendingStatus$1 eventRepositoryImpl$resetPendingStatus$1;
        int i11;
        String str;
        Exception e11;
        if (dVar instanceof EventRepositoryImpl$resetPendingStatus$1) {
            eventRepositoryImpl$resetPendingStatus$1 = (EventRepositoryImpl$resetPendingStatus$1) dVar;
            int i12 = eventRepositoryImpl$resetPendingStatus$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                eventRepositoryImpl$resetPendingStatus$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = eventRepositoryImpl$resetPendingStatus$1.result;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = eventRepositoryImpl$resetPendingStatus$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    try {
                        InterfaceC7963a interfaceC7963a = this.eventDaoLazy.get();
                        eventRepositoryImpl$resetPendingStatus$1.L$0 = "resetPendingStatus";
                        eventRepositoryImpl$resetPendingStatus$1.label = 1;
                        if (interfaceC7963a.resetPendingStatus(eventRepositoryImpl$resetPendingStatus$1) == aVar) {
                            return aVar;
                        }
                    } catch (Exception e12) {
                        str = "resetPendingStatus";
                        e11 = e12;
                        if (e11 instanceof CancellationException) {
                            throw new DatabaseException(str, e11);
                        }
                        throw e11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) eventRepositoryImpl$resetPendingStatus$1.L$0;
                    try {
                        s.b(obj);
                    } catch (Exception e13) {
                        e11 = e13;
                        if (e11 instanceof CancellationException) {
                        }
                    }
                }
                return Unit.f71690a;
            }
        }
        eventRepositoryImpl$resetPendingStatus$1 = new EventRepositoryImpl$resetPendingStatus$1(this, dVar);
        Object obj2 = eventRepositoryImpl$resetPendingStatus$1.result;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = eventRepositoryImpl$resetPendingStatus$1.label;
        if (i11 != 0) {
        }
        return Unit.f71690a;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // ru.ozon.tracker.sendEvent.repository.EventRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object saveEvent(@NotNull DbEvent dbEvent, @NotNull d<? super Unit> dVar) {
        EventRepositoryImpl$saveEvent$1 eventRepositoryImpl$saveEvent$1;
        int i11;
        Exception e11;
        String str;
        if (dVar instanceof EventRepositoryImpl$saveEvent$1) {
            eventRepositoryImpl$saveEvent$1 = (EventRepositoryImpl$saveEvent$1) dVar;
            int i12 = eventRepositoryImpl$saveEvent$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                eventRepositoryImpl$saveEvent$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = eventRepositoryImpl$saveEvent$1.result;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = eventRepositoryImpl$saveEvent$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    try {
                        InterfaceC7963a interfaceC7963a = this.eventDaoLazy.get();
                        eventRepositoryImpl$saveEvent$1.L$0 = "saveEvent";
                        eventRepositoryImpl$saveEvent$1.label = 1;
                        if (interfaceC7963a.saveEvent(dbEvent, eventRepositoryImpl$saveEvent$1) == aVar) {
                            return aVar;
                        }
                    } catch (Exception e12) {
                        e11 = e12;
                        str = "saveEvent";
                        if (e11 instanceof CancellationException) {
                            throw new DatabaseException(str, e11);
                        }
                        throw e11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) eventRepositoryImpl$saveEvent$1.L$0;
                    try {
                        s.b(obj);
                    } catch (Exception e13) {
                        e11 = e13;
                        if (e11 instanceof CancellationException) {
                        }
                    }
                }
                return Unit.f71690a;
            }
        }
        eventRepositoryImpl$saveEvent$1 = new EventRepositoryImpl$saveEvent$1(this, dVar);
        Object obj2 = eventRepositoryImpl$saveEvent$1.result;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = eventRepositoryImpl$saveEvent$1.label;
        if (i11 != 0) {
        }
        return Unit.f71690a;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // ru.ozon.tracker.sendEvent.repository.EventRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object saveEvents(@NotNull List<DbEvent> list, @NotNull d<? super Unit> dVar) {
        EventRepositoryImpl$saveEvents$1 eventRepositoryImpl$saveEvents$1;
        int i11;
        Exception e11;
        String str;
        if (dVar instanceof EventRepositoryImpl$saveEvents$1) {
            eventRepositoryImpl$saveEvents$1 = (EventRepositoryImpl$saveEvents$1) dVar;
            int i12 = eventRepositoryImpl$saveEvents$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                eventRepositoryImpl$saveEvents$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = eventRepositoryImpl$saveEvents$1.result;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = eventRepositoryImpl$saveEvents$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    try {
                        InterfaceC7963a interfaceC7963a = this.eventDaoLazy.get();
                        eventRepositoryImpl$saveEvents$1.L$0 = "saveEvents";
                        eventRepositoryImpl$saveEvents$1.label = 1;
                        if (interfaceC7963a.c(list, eventRepositoryImpl$saveEvents$1) == aVar) {
                            return aVar;
                        }
                    } catch (Exception e12) {
                        e11 = e12;
                        str = "saveEvents";
                        if (e11 instanceof CancellationException) {
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) eventRepositoryImpl$saveEvents$1.L$0;
                    try {
                        s.b(obj);
                    } catch (Exception e13) {
                        e11 = e13;
                        if (e11 instanceof CancellationException) {
                            throw new DatabaseException(str, e11);
                        }
                        throw e11;
                    }
                }
                return Unit.f71690a;
            }
        }
        eventRepositoryImpl$saveEvents$1 = new EventRepositoryImpl$saveEvents$1(this, dVar);
        Object obj2 = eventRepositoryImpl$saveEvents$1.result;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = eventRepositoryImpl$saveEvents$1.label;
        if (i11 != 0) {
        }
        return Unit.f71690a;
    }

    @Override // ru.ozon.tracker.sendEvent.repository.EventRepository
    public Object sendEvents(@NotNull List<DbEvent> list, @NotNull d<? super EventRepository.SendEventResult> dVar) {
        return C10727i.f(this.ioDispatcher.plus(N0.f105411a), new EventRepositoryImpl$sendEvents$2(this, list, null), dVar);
    }
}
