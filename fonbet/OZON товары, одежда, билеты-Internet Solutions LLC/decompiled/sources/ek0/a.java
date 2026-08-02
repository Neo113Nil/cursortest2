package ek0;

import Sc.s;
import android.content.Context;
import androidx.work.g;
import androidx.work.impl.C;
import androidx.work.q;
import com.google.protobuf.DescriptorProtos$FileOptions;
import fi0.v;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.process.lifecycle.ApplicationLifecycleState;
import ru.ozon.tracker.worker.EventsSenderWorker;
import xe.C10727i;
import xe.M;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f62376a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final v f62377b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final M f62378c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ru.ozon.tracker.process.lifecycle.a f62379d;

    @e(c = "ru.ozon.tracker.worker.SendEventsWorkerStarter$start$1", f = "SendEventsWorkerStarter.kt", l = {DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER}, m = "invokeSuspend")
    /* renamed from: ek0.a$a, reason: collision with other inner class name */
    static final class C0983a extends j implements Function2<M, d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f62380d;

        @e(c = "ru.ozon.tracker.worker.SendEventsWorkerStarter$start$1$1", f = "SendEventsWorkerStarter.kt", l = {}, m = "invokeSuspend")
        /* renamed from: ek0.a$a$a, reason: collision with other inner class name */
        static final class C0984a extends j implements Function2<M, d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ a f62382d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0984a(a aVar, d<? super C0984a> dVar) {
                super(2, dVar);
                this.f62382d = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                return new C0984a(this.f62382d, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, d<? super Unit> dVar) {
                return ((C0984a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                s.b(obj);
                a aVar2 = this.f62382d;
                if (!aVar2.f62377b.e()) {
                    return Unit.f71690a;
                }
                q.a aVar3 = new q.a(EventsSenderWorker.class);
                androidx.work.a aVar4 = androidx.work.a.LINEAR;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                q b11 = aVar3.i(aVar4, 10L, timeUnit).k(5L, timeUnit).b();
                C i11 = C.i(aVar2.f62376a);
                g gVar = g.REPLACE;
                i11.getClass();
                i11.b("TrackerBackgroundSendingWorker", gVar, Collections.singletonList(b11));
                return Unit.f71690a;
            }
        }

        C0983a(d<? super C0983a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return a.this.new C0983a(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((C0983a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f62380d;
            if (i11 == 0) {
                s.b(obj);
                a aVar2 = a.this;
                ru.ozon.tracker.process.lifecycle.a aVar3 = aVar2.f62379d;
                ApplicationLifecycleState applicationLifecycleState = ApplicationLifecycleState.BACKGROUND;
                C0984a c0984a = new C0984a(aVar2, null);
                this.f62380d = 1;
                if (aVar3.c(applicationLifecycleState, c0984a, this) == aVar) {
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
    }

    @e(c = "ru.ozon.tracker.worker.SendEventsWorkerStarter$start$2", f = "SendEventsWorkerStarter.kt", l = {50}, m = "invokeSuspend")
    static final class b extends j implements Function2<M, d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f62383d;

        @e(c = "ru.ozon.tracker.worker.SendEventsWorkerStarter$start$2$1", f = "SendEventsWorkerStarter.kt", l = {}, m = "invokeSuspend")
        /* renamed from: ek0.a$b$a, reason: collision with other inner class name */
        static final class C0985a extends j implements Function2<M, d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ a f62385d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0985a(a aVar, d<? super C0985a> dVar) {
                super(2, dVar);
                this.f62385d = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                return new C0985a(this.f62385d, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, d<? super Unit> dVar) {
                return ((C0985a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                s.b(obj);
                C.i(this.f62385d.f62376a).a("TrackerBackgroundSendingWorker");
                return Unit.f71690a;
            }
        }

        b(d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return a.this.new b(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f62383d;
            if (i11 == 0) {
                s.b(obj);
                a aVar2 = a.this;
                ru.ozon.tracker.process.lifecycle.a aVar3 = aVar2.f62379d;
                ApplicationLifecycleState applicationLifecycleState = ApplicationLifecycleState.FOREGROUND;
                C0985a c0985a = new C0985a(aVar2, null);
                this.f62383d = 1;
                if (aVar3.c(applicationLifecycleState, c0985a, this) == aVar) {
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
    }

    public a(@NotNull Context context, @NotNull v backgroundModeConfig, @NotNull M trackerScope, @NotNull ru.ozon.tracker.process.lifecycle.a lifecycleActionExecutor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(backgroundModeConfig, "backgroundModeConfig");
        Intrinsics.checkNotNullParameter(trackerScope, "trackerScope");
        Intrinsics.checkNotNullParameter(lifecycleActionExecutor, "lifecycleActionExecutor");
        this.f62376a = context;
        this.f62377b = backgroundModeConfig;
        this.f62378c = trackerScope;
        this.f62379d = lifecycleActionExecutor;
    }

    public final void d() {
        C0983a c0983a = new C0983a(null);
        M m11 = this.f62378c;
        C10727i.c(m11, null, null, c0983a, 3);
        C10727i.c(m11, null, null, new b(null), 3);
    }
}
