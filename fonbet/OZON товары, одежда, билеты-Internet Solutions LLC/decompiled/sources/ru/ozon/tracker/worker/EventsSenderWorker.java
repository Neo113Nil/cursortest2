package ru.ozon.tracker.worker;

import Qj0.l0;
import Sc.r;
import Sc.s;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import fi0.v;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.l;
import mi0.InterfaceC8336f;
import mi0.InterfaceC8339i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.db.entities.DbEvent;
import ru.ozon.tracker.model.SendPerfEventsTraceEntity;
import ru.ozon.tracker.sendEvent.repository.EventRepository;
import xe.N;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/tracker/worker/EventsSenderWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EventsSenderWorker extends CoroutineWorker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventsSenderWorker(@NotNull Context appContext, @NotNull WorkerParameters workerParameters) {
        super(appContext, workerParameters);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(1:(6:12|13|14|15|16|17)(2:19|20))(3:21|22|23))(2:26|27))(4:36|(2:38|(2:40|25))|16|17)|28|(2:30|31)(2:32|(2:34|25)(2:35|23))))|45|6|7|(0)(0)|28|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a6, code lost:
    
        if (r8.clear(r0) != r9) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c7, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c8, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0039, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bd, code lost:
    
        r6 = Sc.r.INSTANCE;
        r5 = Sc.s.a(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0080 A[Catch: all -> 0x0039, CancellationException -> 0x00c7, TryCatch #2 {CancellationException -> 0x00c7, all -> 0x0039, blocks: (B:13:0x0034, B:14:0x00a9, B:22:0x0050, B:23:0x0099, B:27:0x005e, B:28:0x0078, B:30:0x0080, B:32:0x0083, B:38:0x006b), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0083 A[Catch: all -> 0x0039, CancellationException -> 0x00c7, TryCatch #2 {CancellationException -> 0x00c7, all -> 0x0039, blocks: (B:13:0x0034, B:14:0x00a9, B:22:0x0050, B:23:0x0099, B:27:0x005e, B:28:0x0078, B:30:0x0080, B:32:0x0083, B:38:0x006b), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(EventsSenderWorker eventsSenderWorker, v vVar, EventRepository eventRepository, InterfaceC8336f interfaceC8336f, kotlin.coroutines.jvm.internal.c cVar) {
        c cVar2;
        int i11;
        List<DbEvent> list;
        EventRepository eventRepository2;
        InterfaceC8336f interfaceC8336f2;
        List<DbEvent> list2;
        eventsSenderWorker.getClass();
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i12 = cVar2.f97891i;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                cVar2.f97891i = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = cVar2.f97889g;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = cVar2.f97891i;
                boolean z11 = true;
                if (i11 != 0) {
                    s.b(obj);
                    if (vVar.a()) {
                        cVar2.f97886d = eventRepository;
                        cVar2.f97887e = interfaceC8336f;
                        cVar2.f97891i = 1;
                        obj = eventRepository.getAllEvents(cVar2);
                        if (obj == aVar) {
                            return aVar;
                        }
                    }
                    return Boolean.valueOf(z11);
                }
                if (i11 == 1) {
                    interfaceC8336f = (InterfaceC8336f) cVar2.f97887e;
                    eventRepository = (EventRepository) cVar2.f97886d;
                    s.b(obj);
                } else {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        list2 = (List) cVar2.f97887e;
                        interfaceC8336f2 = (InterfaceC8336f) cVar2.f97886d;
                        s.b(obj);
                        interfaceC8336f2.a(l.v(C7714v.w(list2), d.f97892b));
                        Object a11 = Unit.f71690a;
                        r.Companion companion = r.INSTANCE;
                        z11 = true ^ (a11 instanceof r.b);
                        return Boolean.valueOf(z11);
                    }
                    list2 = cVar2.f97888f;
                    interfaceC8336f2 = (InterfaceC8336f) cVar2.f97887e;
                    eventRepository2 = (EventRepository) cVar2.f97886d;
                    s.b(obj);
                    cVar2.f97886d = interfaceC8336f2;
                    cVar2.f97887e = list2;
                    cVar2.f97888f = null;
                    cVar2.f97891i = 3;
                }
                list = (List) obj;
                if (!list.isEmpty()) {
                    return Boolean.TRUE;
                }
                cVar2.f97886d = eventRepository;
                cVar2.f97887e = interfaceC8336f;
                cVar2.f97888f = list;
                cVar2.f97891i = 2;
                if (eventRepository.sendEvents(list, cVar2) == aVar) {
                    return aVar;
                }
                InterfaceC8336f interfaceC8336f3 = interfaceC8336f;
                eventRepository2 = eventRepository;
                interfaceC8336f2 = interfaceC8336f3;
                list2 = list;
                cVar2.f97886d = interfaceC8336f2;
                cVar2.f97887e = list2;
                cVar2.f97888f = null;
                cVar2.f97891i = 3;
            }
        }
        cVar2 = new c(eventsSenderWorker, cVar);
        Object obj2 = cVar2.f97889g;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = cVar2.f97891i;
        boolean z112 = true;
        if (i11 != 0) {
        }
        list = (List) obj2;
        if (!list.isEmpty()) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(1:(1:(1:(6:13|14|15|16|17|18)(2:20|21))(8:22|23|24|(2:26|27)|15|16|17|18))(4:28|29|30|(2:32|33)(2:34|(2:36|37)(7:38|24|(0)|15|16|17|18))))(2:39|40))(4:49|(2:51|(2:53|54))|17|18)|41|42|43|(2:45|46)(3:47|30|(0)(0))))|63|6|7|(0)(0)|41|42|43|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0107, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0108, code lost:
    
        throw r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x007b, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x009c, code lost:
    
        r8 = Sc.r.INSTANCE;
        Sc.s.a(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0105, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0106, code lost:
    
        throw r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x003c, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00fb, code lost:
    
        r8 = Sc.r.INSTANCE;
        r7 = Sc.s.a(r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bc A[Catch: all -> 0x003c, CancellationException -> 0x0105, TryCatch #3 {CancellationException -> 0x0105, all -> 0x003c, blocks: (B:14:0x0037, B:15:0x00ef, B:23:0x0053, B:24:0x00df, B:29:0x0064, B:30:0x00b4, B:32:0x00bc, B:34:0x00bf, B:43:0x00a2), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bf A[Catch: all -> 0x003c, CancellationException -> 0x0105, TryCatch #3 {CancellationException -> 0x0105, all -> 0x003c, blocks: (B:14:0x0037, B:15:0x00ef, B:23:0x0053, B:24:0x00df, B:29:0x0064, B:30:0x00b4, B:32:0x00bc, B:34:0x00bf, B:43:0x00a2), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(EventsSenderWorker eventsSenderWorker, v vVar, ru.ozon.tracker.performance.d dVar, l0 l0Var, InterfaceC8339i interfaceC8339i, kotlin.coroutines.jvm.internal.c cVar) {
        e eVar;
        Object obj;
        Object obj2;
        int i11;
        InterfaceC8339i interfaceC8339i2;
        ru.ozon.tracker.performance.d dVar2;
        l0 l0Var2;
        List traces;
        InterfaceC8339i interfaceC8339i3;
        SendPerfEventsTraceEntity sendPerfEventsTraceEntity;
        l0 l0Var3;
        eventsSenderWorker.getClass();
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i12 = eVar.f97898i;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                eVar.f97898i = i12 - LinearLayoutManager.INVALID_OFFSET;
                obj = eVar.f97896g;
                obj2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = eVar.f97898i;
                boolean z11 = true;
                if (i11 != 0) {
                    s.b(obj);
                    if (vVar.b()) {
                        eVar.f97893d = dVar;
                        eVar.f97894e = l0Var;
                        eVar.f97895f = interfaceC8339i;
                        eVar.f97898i = 1;
                        if (l0Var.d(eVar) == obj2) {
                            return obj2;
                        }
                    }
                    return Boolean.valueOf(z11);
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sendPerfEventsTraceEntity = (SendPerfEventsTraceEntity) eVar.f97894e;
                            interfaceC8339i3 = (InterfaceC8339i) eVar.f97893d;
                            s.b(obj);
                            interfaceC8339i3.a(sendPerfEventsTraceEntity.getEvents());
                            Object a11 = Unit.f71690a;
                            r.Companion companion = r.INSTANCE;
                            z11 = true ^ (a11 instanceof r.b);
                            return Boolean.valueOf(z11);
                        }
                        sendPerfEventsTraceEntity = (SendPerfEventsTraceEntity) eVar.f97895f;
                        interfaceC8339i3 = (InterfaceC8339i) eVar.f97894e;
                        l0Var3 = (l0) eVar.f97893d;
                        s.b(obj);
                        eVar.f97893d = interfaceC8339i3;
                        eVar.f97894e = sendPerfEventsTraceEntity;
                        eVar.f97895f = null;
                        eVar.f97898i = 4;
                        if (l0Var3.b(eVar) == obj2) {
                            return obj2;
                        }
                        interfaceC8339i3.a(sendPerfEventsTraceEntity.getEvents());
                        Object a112 = Unit.f71690a;
                        r.Companion companion2 = r.INSTANCE;
                        z11 = true ^ (a112 instanceof r.b);
                        return Boolean.valueOf(z11);
                    }
                    interfaceC8339i2 = (InterfaceC8339i) eVar.f97895f;
                    l0Var2 = (l0) eVar.f97894e;
                    dVar2 = (ru.ozon.tracker.performance.d) eVar.f97893d;
                    s.b(obj);
                    traces = (List) obj;
                    if (!traces.isEmpty()) {
                        return Boolean.TRUE;
                    }
                    dVar2.getClass();
                    Intrinsics.checkNotNullParameter(traces, "traces");
                    SendPerfEventsTraceEntity sendPerfEventsTraceEntity2 = new SendPerfEventsTraceEntity(traces);
                    eVar.f97893d = l0Var2;
                    eVar.f97894e = interfaceC8339i2;
                    eVar.f97895f = sendPerfEventsTraceEntity2;
                    eVar.f97898i = 3;
                    if (l0Var2.c(sendPerfEventsTraceEntity2, eVar) == obj2) {
                        return obj2;
                    }
                    l0 l0Var4 = l0Var2;
                    interfaceC8339i3 = interfaceC8339i2;
                    sendPerfEventsTraceEntity = sendPerfEventsTraceEntity2;
                    l0Var3 = l0Var4;
                    eVar.f97893d = interfaceC8339i3;
                    eVar.f97894e = sendPerfEventsTraceEntity;
                    eVar.f97895f = null;
                    eVar.f97898i = 4;
                    if (l0Var3.b(eVar) == obj2) {
                    }
                    interfaceC8339i3.a(sendPerfEventsTraceEntity.getEvents());
                    Object a1122 = Unit.f71690a;
                    r.Companion companion22 = r.INSTANCE;
                    z11 = true ^ (a1122 instanceof r.b);
                    return Boolean.valueOf(z11);
                }
                interfaceC8339i = (InterfaceC8339i) eVar.f97895f;
                l0Var = (l0) eVar.f97894e;
                dVar = (ru.ozon.tracker.performance.d) eVar.f97893d;
                s.b(obj);
                Unit unit = Unit.f71690a;
                r.Companion companion3 = r.INSTANCE;
                interfaceC8339i2 = interfaceC8339i;
                eVar.f97893d = dVar;
                eVar.f97894e = l0Var;
                eVar.f97895f = interfaceC8339i2;
                eVar.f97898i = 2;
                obj = l0Var.g(eVar);
                if (obj != obj2) {
                    return obj2;
                }
                l0 l0Var5 = l0Var;
                dVar2 = dVar;
                l0Var2 = l0Var5;
                traces = (List) obj;
                if (!traces.isEmpty()) {
                }
            }
        }
        eVar = new e(eventsSenderWorker, cVar);
        obj = eVar.f97896g;
        obj2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = eVar.f97898i;
        boolean z112 = true;
        if (i11 != 0) {
        }
        Unit unit2 = Unit.f71690a;
        r.Companion companion32 = r.INSTANCE;
        interfaceC8339i2 = interfaceC8339i;
        eVar.f97893d = dVar;
        eVar.f97894e = l0Var;
        eVar.f97895f = interfaceC8339i2;
        eVar.f97898i = 2;
        obj = l0Var.g(eVar);
        if (obj != obj2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        a aVar;
        int i11;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i12 = aVar.f97871f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                aVar.f97871f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = aVar.f97869d;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = aVar.f97871f;
                if (i11 != 0) {
                    s.b(obj);
                    b bVar = new b(this, null);
                    aVar.f97871f = 1;
                    obj = N.d(bVar, aVar);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                Intrinsics.checkNotNullExpressionValue(obj, "coroutineScope(...)");
                return obj;
            }
        }
        aVar = new a(this, cVar);
        Object obj2 = aVar.f97869d;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = aVar.f97871f;
        if (i11 != 0) {
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "coroutineScope(...)");
        return obj2;
    }
}
