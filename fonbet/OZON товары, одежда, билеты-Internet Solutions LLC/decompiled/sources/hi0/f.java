package hi0;

import Sc.s;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;
import xe.C10740o0;
import xe.M;
import xe.Y;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final M f65556a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f65557b;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.coroutines.SingleDelayedAction$schedule$1", f = "SingleDelayedAction.kt", l = {23, 24}, m = "invokeSuspend")
    static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f65558d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f65559e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<kotlin.coroutines.d<? super Unit>, Object> f65560f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ f f65561g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(long j11, Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function1, f fVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f65559e = j11;
            this.f65560f = function1;
            this.f65561g = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f65559e, this.f65560f, this.f65561g, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
        
            if (r9.invoke(r8) == r0) goto L22;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f65558d;
            f fVar = this.f65561g;
            try {
                try {
                    if (i11 == 0) {
                        s.b(obj);
                        long j11 = this.f65559e;
                        this.f65558d = 1;
                        if (Y.c(j11, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i11 != 1) {
                            if (i11 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            s.b(obj);
                            fVar.f65557b.set(false);
                            return Unit.f71690a;
                        }
                        s.b(obj);
                    }
                    Function1<kotlin.coroutines.d<? super Unit>, Object> function1 = this.f65560f;
                    this.f65558d = 2;
                } catch (CancellationException e11) {
                    throw C10740o0.a("Failed invoke delayed action", e11);
                }
            } catch (Throwable th2) {
                fVar.f65557b.set(false);
                throw th2;
            }
        }
    }

    public f(@NotNull M scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f65556a = scope;
        this.f65557b = new AtomicBoolean(false);
    }

    public final void b(long j11, @NotNull Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        b.Companion companion = kotlin.time.b.INSTANCE;
        if (j11 > 0 && this.f65557b.compareAndSet(false, true)) {
            C10727i.c(this.f65556a, null, null, new a(j11, block, this, null), 3);
        }
    }
}
