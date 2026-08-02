package ru.ozon.tracker.sendEvent;

import Am.C2438a;
import Ib.a;
import Lj0.e;
import Sc.o;
import Sc.r;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import dk0.C6214a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.db.entities.DbEvent;
import ru.ozon.tracker.sendEvent.repository.DatabaseException;
import ru.ozon.tracker.sendEvent.repository.EventRepository;
import xe.C10727i;
import xe.N0;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0013\b\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u000f\u0010\u0012J&\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00132\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0082@¢\u0006\u0004\b\u000f\u0010\u0014J&\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J\u001e\u0010\u0019\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ\u001e\u0010\u001b\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0082@¢\u0006\u0004\b\u001b\u0010\u001aJ\u001e\u0010\u001c\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0082@¢\u0006\u0004\b\u001c\u0010\u001aJ&\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0096@¢\u0006\u0004\b\u001d\u0010\u0018R#\u0010#\u001a\n \u001e*\u0004\u0018\u00010\u00030\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R#\u0010'\u001a\n \u001e*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lru/ozon/tracker/sendEvent/SendEventThrowableHandlerImpl;", "Lru/ozon/tracker/sendEvent/SendEventThrowableHandler;", "LIb/a;", "Lru/ozon/tracker/sendEvent/repository/EventRepository;", "eventRepositoryLazy", "LLj0/e;", "androidTrackerBusinessLoggerLazy", "<init>", "(LIb/a;LIb/a;)V", "Lru/ozon/tracker/sendEvent/ResponseException;", "exception", "", "Lru/ozon/tracker/db/entities/DbEvent;", "batch", "", "handle", "(Lru/ozon/tracker/sendEvent/ResponseException;Ljava/util/List;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/tracker/sendEvent/repository/DatabaseException;", "(Lru/ozon/tracker/sendEvent/repository/DatabaseException;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/tracker/sendEvent/SerializationException;", "(Lru/ozon/tracker/sendEvent/SerializationException;Ljava/util/List;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "throwable", "handleInternal", "(Ljava/lang/Throwable;Ljava/util/List;Lkotlin/coroutines/d;)Ljava/lang/Object;", "removeEvents", "(Ljava/util/List;Lkotlin/coroutines/d;)Ljava/lang/Object;", "deleteEvents", "markForRetry", "handleThrowable", "kotlin.jvm.PlatformType", "eventRepository$delegate", "LIb/a;", "getEventRepository", "()Lru/ozon/tracker/sendEvent/repository/EventRepository;", "eventRepository", "androidTrackerLogger$delegate", "getAndroidTrackerLogger", "()LLj0/e;", "androidTrackerLogger", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SendEventThrowableHandlerImpl implements SendEventThrowableHandler {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(SendEventThrowableHandlerImpl.class, "eventRepository", "getEventRepository()Lru/ozon/tracker/sendEvent/repository/EventRepository;", 0), C2438a.c(SendEventThrowableHandlerImpl.class, "androidTrackerLogger", "getAndroidTrackerLogger()Lru/ozon/tracker/logging/business/AndroidTrackerBusinessLogger;", 0)};

    /* renamed from: androidTrackerLogger$delegate, reason: from kotlin metadata */
    @NotNull
    private final a androidTrackerLogger;

    /* renamed from: eventRepository$delegate, reason: from kotlin metadata */
    @NotNull
    private final a eventRepository;

    public SendEventThrowableHandlerImpl(@NotNull a<EventRepository> eventRepositoryLazy, @NotNull a<e> androidTrackerBusinessLoggerLazy) {
        Intrinsics.checkNotNullParameter(eventRepositoryLazy, "eventRepositoryLazy");
        Intrinsics.checkNotNullParameter(androidTrackerBusinessLoggerLazy, "androidTrackerBusinessLoggerLazy");
        this.eventRepository = eventRepositoryLazy;
        this.androidTrackerLogger = androidTrackerBusinessLoggerLazy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object deleteEvents(List<DbEvent> list, d<? super Unit> dVar) {
        Object f7 = C10727i.f(dVar.getContext().plus(N0.f105411a), new SendEventThrowableHandlerImpl$deleteEvents$2(this, list, null), dVar);
        return f7 == Wc.a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }

    private final e getAndroidTrackerLogger() {
        return (e) C6214a.a(this.androidTrackerLogger, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EventRepository getEventRepository() {
        return (EventRepository) C6214a.a(this.eventRepository, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
    
        if (removeEvents(r8, r0) == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        r8 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0067, code lost:
    
        if (markForRetry(r8, r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handle(ResponseException responseException, List<DbEvent> list, d<? super Unit> dVar) {
        SendEventThrowableHandlerImpl$handle$1 sendEventThrowableHandlerImpl$handle$1;
        Wc.a aVar;
        int i11;
        SendEventThrowableHandlerImpl sendEventThrowableHandlerImpl;
        e androidTrackerLogger;
        int responseCode;
        String message;
        if (dVar instanceof SendEventThrowableHandlerImpl$handle$1) {
            sendEventThrowableHandlerImpl$handle$1 = (SendEventThrowableHandlerImpl$handle$1) dVar;
            int i12 = sendEventThrowableHandlerImpl$handle$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                sendEventThrowableHandlerImpl$handle$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = sendEventThrowableHandlerImpl$handle$1.result;
                aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = sendEventThrowableHandlerImpl$handle$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    if (bk0.d.a(responseException)) {
                        sendEventThrowableHandlerImpl$handle$1.L$0 = this;
                        sendEventThrowableHandlerImpl$handle$1.L$1 = responseException;
                        sendEventThrowableHandlerImpl$handle$1.label = 1;
                    } else {
                        sendEventThrowableHandlerImpl$handle$1.L$0 = this;
                        sendEventThrowableHandlerImpl$handle$1.L$1 = responseException;
                        sendEventThrowableHandlerImpl$handle$1.label = 2;
                    }
                } else {
                    if (i11 != 1 && i11 != 2) {
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResponseException responseException2 = (ResponseException) sendEventThrowableHandlerImpl$handle$1.L$0;
                        s.b(obj);
                        throw responseException2;
                    }
                    responseException = (ResponseException) sendEventThrowableHandlerImpl$handle$1.L$1;
                    sendEventThrowableHandlerImpl = (SendEventThrowableHandlerImpl) sendEventThrowableHandlerImpl$handle$1.L$0;
                    s.b(obj);
                }
                androidTrackerLogger = sendEventThrowableHandlerImpl.getAndroidTrackerLogger();
                responseCode = responseException.getResponseCode();
                message = responseException.getMessage();
                sendEventThrowableHandlerImpl$handle$1.L$0 = responseException;
                sendEventThrowableHandlerImpl$handle$1.L$1 = null;
                sendEventThrowableHandlerImpl$handle$1.label = 3;
                if (androidTrackerLogger.c(responseCode, message, sendEventThrowableHandlerImpl$handle$1) != aVar) {
                    return aVar;
                }
                throw responseException;
            }
        }
        sendEventThrowableHandlerImpl$handle$1 = new SendEventThrowableHandlerImpl$handle$1(this, dVar);
        Object obj2 = sendEventThrowableHandlerImpl$handle$1.result;
        aVar = Wc.a.COROUTINE_SUSPENDED;
        i11 = sendEventThrowableHandlerImpl$handle$1.label;
        if (i11 != 0) {
        }
        androidTrackerLogger = sendEventThrowableHandlerImpl.getAndroidTrackerLogger();
        responseCode = responseException.getResponseCode();
        message = responseException.getMessage();
        sendEventThrowableHandlerImpl$handle$1.L$0 = responseException;
        sendEventThrowableHandlerImpl$handle$1.L$1 = null;
        sendEventThrowableHandlerImpl$handle$1.label = 3;
        if (androidTrackerLogger.c(responseCode, message, sendEventThrowableHandlerImpl$handle$1) != aVar) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleInternal(Throwable th2, List<DbEvent> list, d<? super Unit> dVar) {
        SendEventThrowableHandlerImpl$handleInternal$1 sendEventThrowableHandlerImpl$handleInternal$1;
        Wc.a aVar;
        int i11;
        SendEventThrowableHandlerImpl sendEventThrowableHandlerImpl;
        e androidTrackerLogger;
        String message;
        if (dVar instanceof SendEventThrowableHandlerImpl$handleInternal$1) {
            sendEventThrowableHandlerImpl$handleInternal$1 = (SendEventThrowableHandlerImpl$handleInternal$1) dVar;
            int i12 = sendEventThrowableHandlerImpl$handleInternal$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                sendEventThrowableHandlerImpl$handleInternal$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = sendEventThrowableHandlerImpl$handleInternal$1.result;
                aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = sendEventThrowableHandlerImpl$handleInternal$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    sendEventThrowableHandlerImpl$handleInternal$1.L$0 = this;
                    sendEventThrowableHandlerImpl$handleInternal$1.L$1 = th2;
                    sendEventThrowableHandlerImpl$handleInternal$1.label = 1;
                    if (markForRetry(list, sendEventThrowableHandlerImpl$handleInternal$1) != aVar) {
                        sendEventThrowableHandlerImpl = this;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Throwable th3 = (Throwable) sendEventThrowableHandlerImpl$handleInternal$1.L$0;
                    s.b(obj);
                    throw th3;
                }
                th2 = (Throwable) sendEventThrowableHandlerImpl$handleInternal$1.L$1;
                sendEventThrowableHandlerImpl = (SendEventThrowableHandlerImpl) sendEventThrowableHandlerImpl$handleInternal$1.L$0;
                s.b(obj);
                androidTrackerLogger = sendEventThrowableHandlerImpl.getAndroidTrackerLogger();
                message = th2.getMessage();
                sendEventThrowableHandlerImpl$handleInternal$1.L$0 = th2;
                sendEventThrowableHandlerImpl$handleInternal$1.L$1 = null;
                sendEventThrowableHandlerImpl$handleInternal$1.label = 2;
                if (androidTrackerLogger.d(message, sendEventThrowableHandlerImpl$handleInternal$1) != aVar) {
                    return aVar;
                }
                throw th2;
            }
        }
        sendEventThrowableHandlerImpl$handleInternal$1 = new SendEventThrowableHandlerImpl$handleInternal$1(this, dVar);
        Object obj2 = sendEventThrowableHandlerImpl$handleInternal$1.result;
        aVar = Wc.a.COROUTINE_SUSPENDED;
        i11 = sendEventThrowableHandlerImpl$handleInternal$1.label;
        if (i11 != 0) {
        }
        androidTrackerLogger = sendEventThrowableHandlerImpl.getAndroidTrackerLogger();
        message = th2.getMessage();
        sendEventThrowableHandlerImpl$handleInternal$1.L$0 = th2;
        sendEventThrowableHandlerImpl$handleInternal$1.L$1 = null;
        sendEventThrowableHandlerImpl$handleInternal$1.label = 2;
        if (androidTrackerLogger.d(message, sendEventThrowableHandlerImpl$handleInternal$1) != aVar) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object markForRetry(List<DbEvent> list, d<? super Unit> dVar) {
        Object f7 = C10727i.f(dVar.getContext().plus(N0.f105411a), new SendEventThrowableHandlerImpl$markForRetry$2(list, this, null), dVar);
        return f7 == Wc.a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|26|6|7|(0)(0)|11|12|13|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0029, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0027, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0051, code lost:
    
        r6 = Sc.r.INSTANCE;
        Sc.s.a(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object removeEvents(List<DbEvent> list, d<? super Unit> dVar) {
        SendEventThrowableHandlerImpl$removeEvents$1 sendEventThrowableHandlerImpl$removeEvents$1;
        int i11;
        if (dVar instanceof SendEventThrowableHandlerImpl$removeEvents$1) {
            sendEventThrowableHandlerImpl$removeEvents$1 = (SendEventThrowableHandlerImpl$removeEvents$1) dVar;
            int i12 = sendEventThrowableHandlerImpl$removeEvents$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                sendEventThrowableHandlerImpl$removeEvents$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = sendEventThrowableHandlerImpl$removeEvents$1.result;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = sendEventThrowableHandlerImpl$removeEvents$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    EventRepository eventRepository = getEventRepository();
                    sendEventThrowableHandlerImpl$removeEvents$1.label = 1;
                    obj = eventRepository.deleteEvents(list, sendEventThrowableHandlerImpl$removeEvents$1);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                new Integer(((Number) obj).intValue());
                r.Companion companion = r.INSTANCE;
                return Unit.f71690a;
            }
        }
        sendEventThrowableHandlerImpl$removeEvents$1 = new SendEventThrowableHandlerImpl$removeEvents$1(this, dVar);
        Object obj2 = sendEventThrowableHandlerImpl$removeEvents$1.result;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = sendEventThrowableHandlerImpl$removeEvents$1.label;
        if (i11 != 0) {
        }
        new Integer(((Number) obj2).intValue());
        r.Companion companion2 = r.INSTANCE;
        return Unit.f71690a;
    }

    @Override // ru.ozon.tracker.sendEvent.SendEventThrowableHandler
    public Object handleThrowable(@NotNull Throwable th2, @NotNull List<DbEvent> list, @NotNull d<? super Unit> dVar) {
        if (th2 instanceof ResponseException) {
            Object handle = handle((ResponseException) th2, list, dVar);
            return handle == Wc.a.COROUTINE_SUSPENDED ? handle : Unit.f71690a;
        }
        if (th2 instanceof DatabaseException) {
            Object handle2 = handle((DatabaseException) th2, dVar);
            return handle2 == Wc.a.COROUTINE_SUSPENDED ? handle2 : Unit.f71690a;
        }
        if (th2 instanceof SerializationException) {
            Object handle3 = handle((SerializationException) th2, list, dVar);
            return handle3 == Wc.a.COROUTINE_SUSPENDED ? handle3 : Unit.f71690a;
        }
        if (th2 == null) {
            throw new o();
        }
        Object handleInternal = handleInternal(th2, list, dVar);
        return handleInternal == Wc.a.COROUTINE_SUSPENDED ? handleInternal : Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handle(SerializationException serializationException, List<DbEvent> list, d<? super Unit> dVar) {
        SendEventThrowableHandlerImpl$handle$3 sendEventThrowableHandlerImpl$handle$3;
        Wc.a aVar;
        int i11;
        SendEventThrowableHandlerImpl sendEventThrowableHandlerImpl;
        e androidTrackerLogger;
        String message;
        if (dVar instanceof SendEventThrowableHandlerImpl$handle$3) {
            sendEventThrowableHandlerImpl$handle$3 = (SendEventThrowableHandlerImpl$handle$3) dVar;
            int i12 = sendEventThrowableHandlerImpl$handle$3.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                sendEventThrowableHandlerImpl$handle$3.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = sendEventThrowableHandlerImpl$handle$3.result;
                aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = sendEventThrowableHandlerImpl$handle$3.label;
                if (i11 != 0) {
                    s.b(obj);
                    sendEventThrowableHandlerImpl$handle$3.L$0 = this;
                    sendEventThrowableHandlerImpl$handle$3.L$1 = serializationException;
                    sendEventThrowableHandlerImpl$handle$3.label = 1;
                    if (deleteEvents(list, sendEventThrowableHandlerImpl$handle$3) != aVar) {
                        sendEventThrowableHandlerImpl = this;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SerializationException serializationException2 = (SerializationException) sendEventThrowableHandlerImpl$handle$3.L$0;
                    s.b(obj);
                    throw serializationException2;
                }
                serializationException = (SerializationException) sendEventThrowableHandlerImpl$handle$3.L$1;
                sendEventThrowableHandlerImpl = (SendEventThrowableHandlerImpl) sendEventThrowableHandlerImpl$handle$3.L$0;
                s.b(obj);
                androidTrackerLogger = sendEventThrowableHandlerImpl.getAndroidTrackerLogger();
                message = serializationException.getMessage();
                sendEventThrowableHandlerImpl$handle$3.L$0 = serializationException;
                sendEventThrowableHandlerImpl$handle$3.L$1 = null;
                sendEventThrowableHandlerImpl$handle$3.label = 2;
                if (androidTrackerLogger.b(message, sendEventThrowableHandlerImpl$handle$3) != aVar) {
                    return aVar;
                }
                throw serializationException;
            }
        }
        sendEventThrowableHandlerImpl$handle$3 = new SendEventThrowableHandlerImpl$handle$3(this, dVar);
        Object obj2 = sendEventThrowableHandlerImpl$handle$3.result;
        aVar = Wc.a.COROUTINE_SUSPENDED;
        i11 = sendEventThrowableHandlerImpl$handle$3.label;
        if (i11 != 0) {
        }
        androidTrackerLogger = sendEventThrowableHandlerImpl.getAndroidTrackerLogger();
        message = serializationException.getMessage();
        sendEventThrowableHandlerImpl$handle$3.L$0 = serializationException;
        sendEventThrowableHandlerImpl$handle$3.L$1 = null;
        sendEventThrowableHandlerImpl$handle$3.label = 2;
        if (androidTrackerLogger.b(message, sendEventThrowableHandlerImpl$handle$3) != aVar) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handle(DatabaseException databaseException, d<? super Unit> dVar) {
        SendEventThrowableHandlerImpl$handle$2 sendEventThrowableHandlerImpl$handle$2;
        int i11;
        if (dVar instanceof SendEventThrowableHandlerImpl$handle$2) {
            sendEventThrowableHandlerImpl$handle$2 = (SendEventThrowableHandlerImpl$handle$2) dVar;
            int i12 = sendEventThrowableHandlerImpl$handle$2.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                sendEventThrowableHandlerImpl$handle$2.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = sendEventThrowableHandlerImpl$handle$2.result;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = sendEventThrowableHandlerImpl$handle$2.label;
                if (i11 == 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    DatabaseException databaseException2 = (DatabaseException) sendEventThrowableHandlerImpl$handle$2.L$0;
                    s.b(obj);
                    throw databaseException2;
                }
                s.b(obj);
                e androidTrackerLogger = getAndroidTrackerLogger();
                String databaseMethod = databaseException.getDatabaseMethod();
                String message = databaseException.getMessage();
                sendEventThrowableHandlerImpl$handle$2.L$0 = databaseException;
                sendEventThrowableHandlerImpl$handle$2.label = 1;
                if (androidTrackerLogger.a(databaseMethod, message, sendEventThrowableHandlerImpl$handle$2) == aVar) {
                    return aVar;
                }
                throw databaseException;
            }
        }
        sendEventThrowableHandlerImpl$handle$2 = new SendEventThrowableHandlerImpl$handle$2(this, dVar);
        Object obj2 = sendEventThrowableHandlerImpl$handle$2.result;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = sendEventThrowableHandlerImpl$handle$2.label;
        if (i11 == 0) {
        }
    }
}
