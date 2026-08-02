package ru.ozon.tracker.worker;

import Qj0.l0;
import Sc.s;
import androidx.work.n;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import fi0.v;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mi0.InterfaceC8336f;
import mi0.InterfaceC8339i;
import ru.ozon.tracker.sendEvent.repository.EventRepository;
import xe.C10721f;
import xe.C10727i;
import xe.M;
import xe.U;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.worker.EventsSenderWorker$doWork$2", f = "EventsSenderWorker.kt", l = {UserVerificationMethods.USER_VERIFY_EYEPRINT}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class b extends j implements Function2<M, kotlin.coroutines.d<? super n.a>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f97872d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f97873e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ EventsSenderWorker f97874f;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.worker.EventsSenderWorker$doWork$2$exceptionErrorDeferred$1", f = "EventsSenderWorker.kt", l = {51}, m = "invokeSuspend")
    static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Boolean>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f97875d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ EventsSenderWorker f97876e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ v f97877f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ EventRepository f97878g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC8336f f97879h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(EventsSenderWorker eventsSenderWorker, v vVar, EventRepository eventRepository, InterfaceC8336f interfaceC8336f, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f97876e = eventsSenderWorker;
            this.f97877f = vVar;
            this.f97878g = eventRepository;
            this.f97879h = interfaceC8336f;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f97876e, this.f97877f, this.f97878g, this.f97879h, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Boolean> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f97875d;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return obj;
            }
            s.b(obj);
            this.f97875d = 1;
            Object d11 = EventsSenderWorker.d(this.f97876e, this.f97877f, this.f97878g, this.f97879h, this);
            return d11 == aVar ? aVar : d11;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.worker.EventsSenderWorker$doWork$2$perfEventsDeferred$1", f = "EventsSenderWorker.kt", l = {43}, m = "invokeSuspend")
    /* renamed from: ru.ozon.tracker.worker.b$b, reason: collision with other inner class name */
    static final class C2155b extends j implements Function2<M, kotlin.coroutines.d<? super Boolean>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f97880d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ EventsSenderWorker f97881e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ v f97882f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ru.ozon.tracker.performance.d f97883g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ l0 f97884h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC8339i f97885i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2155b(EventsSenderWorker eventsSenderWorker, v vVar, ru.ozon.tracker.performance.d dVar, l0 l0Var, InterfaceC8339i interfaceC8339i, kotlin.coroutines.d<? super C2155b> dVar2) {
            super(2, dVar2);
            this.f97881e = eventsSenderWorker;
            this.f97882f = vVar;
            this.f97883g = dVar;
            this.f97884h = l0Var;
            this.f97885i = interfaceC8339i;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new C2155b(this.f97881e, this.f97882f, this.f97883g, this.f97884h, this.f97885i, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Boolean> dVar) {
            return ((C2155b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f97880d;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return obj;
            }
            s.b(obj);
            this.f97880d = 1;
            Object g10 = EventsSenderWorker.g(this.f97881e, this.f97882f, this.f97883g, this.f97884h, this.f97885i, this);
            return g10 == aVar ? aVar : g10;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(EventsSenderWorker eventsSenderWorker, kotlin.coroutines.d<? super b> dVar) {
        super(2, dVar);
        this.f97874f = eventsSenderWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        b bVar = new b(this.f97874f, dVar);
        bVar.f97873e = obj;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super n.a> dVar) {
        return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f97872d;
        if (i11 == 0) {
            s.b(obj);
            M m11 = (M) this.f97873e;
            v b11 = ek0.b.b();
            l0 g10 = ek0.b.g();
            ru.ozon.tracker.performance.d f7 = ek0.b.f();
            EventRepository c11 = ek0.b.c();
            InterfaceC8336f d11 = ek0.b.d();
            InterfaceC8339i e11 = ek0.b.e();
            if (b11 == null || g10 == null || f7 == null || c11 == null || d11 == null || e11 == null) {
                return new n.a.C0823a();
            }
            d11.log("Запуск отправки аналитики из фона");
            U a11 = C10727i.a(m11, null, null, new C2155b(this.f97874f, b11, f7, g10, e11, null), 3);
            U a12 = C10727i.a(m11, null, null, new a(this.f97874f, b11, c11, d11, null), 3);
            Tc.b builder = new Tc.b(2);
            builder.add(a11);
            builder.add(a12);
            Intrinsics.checkNotNullParameter(builder, "builder");
            Tc.b B11 = builder.B();
            this.f97872d = 1;
            obj = C10721f.a(B11, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        Iterator it = ((Iterable) obj).iterator();
        while (it.hasNext()) {
            if (!((Boolean) it.next()).booleanValue()) {
                return new n.a.b();
            }
        }
        return new n.a.c();
    }
}
