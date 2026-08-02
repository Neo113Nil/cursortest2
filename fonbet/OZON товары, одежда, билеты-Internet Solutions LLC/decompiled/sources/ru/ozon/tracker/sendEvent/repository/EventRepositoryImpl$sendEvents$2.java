package ru.ozon.tracker.sendEvent.repository;

import Ib.a;
import Mj0.b;
import Mj0.h;
import Sc.r;
import Sc.s;
import java.util.List;
import java.util.Set;
import kd.C7665d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import retrofit2.Response;
import ru.ozon.tracker.db.entities.DbEvent;
import ru.ozon.tracker.model.SendEventsRequest;
import ru.ozon.tracker.sendEvent.repository.EventRepository;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "Lru/ozon/tracker/sendEvent/repository/EventRepository$SendEventResult;", "<anonymous>", "(Lxe/M;)Lru/ozon/tracker/sendEvent/repository/EventRepository$SendEventResult;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.tracker.sendEvent.repository.EventRepositoryImpl$sendEvents$2", f = "EventRepositoryImpl.kt", l = {43}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class EventRepositoryImpl$sendEvents$2 extends j implements Function2<M, d<? super EventRepository.SendEventResult>, Object> {
    final /* synthetic */ List<DbEvent> $events;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ EventRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EventRepositoryImpl$sendEvents$2(EventRepositoryImpl eventRepositoryImpl, List<DbEvent> list, d<? super EventRepositoryImpl$sendEvents$2> dVar) {
        super(2, dVar);
        this.this$0 = eventRepositoryImpl;
        this.$events = list;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new EventRepositoryImpl$sendEvents$2(this.this$0, this.$events, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x00a6: IPUT (r11v1 ?? I:T), (r4 I:kotlin.jvm.internal.M) kotlin.jvm.internal.M.a java.lang.Object, block:B:26:0x00a6 */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x00ab: INVOKE (r8 I:java.util.Set) = (r6 I:Mj0.g) INTERFACE call: Mj0.g.a():java.util.Set A[MD:():java.util.Set<java.lang.Class<? extends java.lang.Throwable>> (m)], block:B:26:0x00a6 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a1 A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:6:0x001f, B:7:0x008f, B:9:0x0097, B:12:0x00a1, B:13:0x00a5, B:20:0x0070), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0097 A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:6:0x001f, B:7:0x008f, B:9:0x0097, B:12:0x00a1, B:13:0x00a5, B:20:0x0070), top: B:2:0x0005 }] */
    /* JADX WARN: Type inference failed for: r11v1, types: [T, java.lang.Object, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v0, types: [Mj0.g] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        kotlin.jvm.internal.M m11;
        ?? a11;
        b bVar;
        a aVar;
        SendEventsRequest sendEventsRequest;
        Response response;
        List createMultiEventTypeBunch;
        Set set;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
        } catch (Throwable th2) {
            m11.f71787a = th2;
            th2.printStackTrace();
            if (a11.a().contains(th2.getClass())) {
                throw th2;
            }
            int b11 = a11.b();
            bVar = a11;
            if (i11 < b11) {
                long c11 = a11.c();
                try {
                    r.Companion companion = r.INSTANCE;
                    Thread.sleep(c11);
                    Unit unit = Unit.f71690a;
                    bVar = a11;
                } catch (Throwable th3) {
                    r.Companion companion2 = r.INSTANCE;
                    s.a(th3);
                    bVar = a11;
                }
            }
        }
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i12 = this.I$0;
            sendEventsRequest = (SendEventsRequest) this.L$0;
            s.b(obj);
            response = (Response) obj;
            if (!response.isSuccessful()) {
                return new EventRepository.SendEventResult(sendEventsRequest.getEvents());
            }
            Pj0.a.a(response);
            throw null;
        }
        s.b(obj);
        createMultiEventTypeBunch = this.this$0.createMultiEventTypeBunch(this.$events);
        SendEventsRequest sendEventsRequest2 = new SendEventsRequest(createMultiEventTypeBunch);
        set = this.this$0.nonRepeatableExceptions;
        b bVar2 = new b(set);
        EventRepositoryImpl eventRepositoryImpl = this.this$0;
        m11 = new kotlin.jvm.internal.M();
        C7665d it = new IntRange(0, bVar2.b(), 1).iterator();
        bVar = bVar2;
        sendEventsRequest = sendEventsRequest2;
        if (!it.hasNext()) {
            T t2 = m11.f71787a;
            Intrinsics.f(t2);
            throw ((Throwable) t2);
        }
        int b12 = it.b();
        aVar = eventRepositoryImpl.trackerApiLazy;
        h hVar = (h) aVar.get();
        this.L$0 = sendEventsRequest;
        this.L$1 = bVar;
        this.L$2 = eventRepositoryImpl;
        this.L$3 = m11;
        this.L$4 = it;
        this.I$0 = b12;
        this.label = 1;
        obj = hVar.sendMultiEvent(sendEventsRequest, this);
        if (obj == aVar2) {
            return aVar2;
        }
        response = (Response) obj;
        if (!response.isSuccessful()) {
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super EventRepository.SendEventResult> dVar) {
        return ((EventRepositoryImpl$sendEvents$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
