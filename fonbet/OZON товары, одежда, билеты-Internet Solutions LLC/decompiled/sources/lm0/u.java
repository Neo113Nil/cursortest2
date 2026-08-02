package lm0;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final class u<T> extends AbstractC7971a<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final b f73431a;

    /* renamed from: b, reason: collision with root package name */
    private final long f73432b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final TimeUnit f73433c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final jm0.b f73434d;

    public static final class a implements n<T>, jm0.i {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f73435a = new AtomicBoolean();

        /* renamed from: b, reason: collision with root package name */
        private final AtomicReference<jm0.i> f73436b = new AtomicReference<>(null);

        /* renamed from: c, reason: collision with root package name */
        private final AtomicReference<jm0.i> f73437c = new AtomicReference<>(null);

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ u<T> f73438d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ n<T> f73439e;

        /* renamed from: lm0.u$a$a, reason: collision with other inner class name */
        static final class C1246a extends AbstractC7737t implements Function0<Unit> {

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ u<T> f73441c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1246a(u<T> uVar) {
                super(0);
                this.f73441c = uVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                a aVar = a.this;
                jm0.i iVar = (jm0.i) aVar.f73436b.getAndSet(null);
                if (iVar != null) {
                    iVar.dispose();
                }
                StringBuilder sb2 = new StringBuilder("No value after timeout ");
                u<T> uVar = this.f73441c;
                sb2.append(((u) uVar).f73432b);
                sb2.append(' ');
                sb2.append(((u) uVar).f73433c);
                aVar.onError(new TimeoutException(sb2.toString()));
                return Unit.f71690a;
            }
        }

        a(u<T> uVar, n<T> nVar) {
            this.f73438d = uVar;
            this.f73439e = nVar;
        }

        @Override // lm0.n
        public final void a(jm0.i d11) {
            Intrinsics.checkNotNullParameter(d11, "d");
            AtomicReference<jm0.i> atomicReference = this.f73436b;
            while (!atomicReference.compareAndSet(null, d11) && atomicReference.get() == null) {
            }
            boolean z11 = this.f73435a.get();
            AtomicReference<jm0.i> atomicReference2 = this.f73437c;
            if (z11) {
                jm0.i andSet = atomicReference.getAndSet(null);
                if (andSet != null) {
                    andSet.dispose();
                }
                jm0.i andSet2 = atomicReference2.getAndSet(null);
                if (andSet2 != null) {
                    andSet2.dispose();
                }
            } else {
                u<T> uVar = this.f73438d;
                jm0.i andSet3 = atomicReference2.getAndSet(((u) uVar).f73434d.b(((u) uVar).f73432b, ((u) uVar).f73433c, new C1246a(uVar)));
                if (andSet3 != null) {
                    andSet3.dispose();
                }
            }
            this.f73439e.a(this);
        }

        @Override // jm0.i
        public final void dispose() {
            if (this.f73435a.compareAndSet(false, true)) {
                jm0.i andSet = this.f73436b.getAndSet(null);
                if (andSet != null) {
                    andSet.dispose();
                }
                jm0.i andSet2 = this.f73437c.getAndSet(null);
                if (andSet2 != null) {
                    andSet2.dispose();
                }
            }
        }

        @Override // lm0.n
        public final void onError(Throwable e11) {
            Intrinsics.checkNotNullParameter(e11, "e");
            if (this.f73435a.compareAndSet(false, true)) {
                jm0.i andSet = this.f73437c.getAndSet(null);
                if (andSet != null) {
                    andSet.dispose();
                }
                this.f73439e.onError(e11);
            }
        }

        @Override // lm0.n
        public final void onSuccess(T t2) {
            if (this.f73435a.compareAndSet(false, true)) {
                jm0.i andSet = this.f73437c.getAndSet(null);
                if (andSet != null) {
                    andSet.dispose();
                }
                this.f73439e.onSuccess(t2);
            }
        }
    }

    public u(@NotNull b upstream, @NotNull jm0.b dispatcher) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.f73431a = upstream;
        this.f73432b = 20000L;
        this.f73433c = timeUnit;
        this.f73434d = dispatcher;
    }

    @Override // lm0.AbstractC7971a
    public final void a(@NotNull n<T> downstream) {
        Intrinsics.checkNotNullParameter(downstream, "downstream");
        this.f73431a.a(new a(this, downstream));
    }
}
