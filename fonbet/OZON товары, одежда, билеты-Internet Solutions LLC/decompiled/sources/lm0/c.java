package lm0;

import Sc.r;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.metrics.internal.presentation.SendMetricsEventJobService;

/* loaded from: classes8.dex */
final class c<T> extends AbstractC7971a<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC7971a<T> f73387a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final SendMetricsEventJobService.c f73388b;

    public static final class a implements n<T>, jm0.i {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f73389a = new AtomicBoolean();

        /* renamed from: b, reason: collision with root package name */
        private final AtomicReference<jm0.i> f73390b = new AtomicReference<>(null);

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ n<T> f73391c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ c<T> f73392d;

        a(n<T> nVar, c<T> cVar) {
            this.f73391c = nVar;
            this.f73392d = cVar;
        }

        @Override // lm0.n
        public final void a(jm0.i d11) {
            jm0.i andSet;
            Intrinsics.checkNotNullParameter(d11, "d");
            AtomicReference<jm0.i> atomicReference = this.f73390b;
            while (!atomicReference.compareAndSet(null, d11) && atomicReference.get() == null) {
            }
            if (this.f73389a.get() && (andSet = atomicReference.getAndSet(null)) != null) {
                andSet.dispose();
            }
            this.f73391c.a(this);
        }

        @Override // jm0.i
        public final void dispose() {
            Object a11;
            if (this.f73389a.compareAndSet(false, true)) {
                c<T> cVar = this.f73392d;
                try {
                    r.Companion companion = Sc.r.INSTANCE;
                    ((SendMetricsEventJobService.c) ((c) cVar).f73388b).invoke();
                    a11 = Unit.f71690a;
                } catch (Throwable th2) {
                    r.Companion companion2 = Sc.r.INSTANCE;
                    a11 = Sc.s.a(th2);
                }
                Throwable b11 = Sc.r.b(a11);
                AtomicReference<jm0.i> atomicReference = this.f73390b;
                if (b11 != null) {
                    jm0.i andSet = atomicReference.getAndSet(null);
                    if (andSet != null) {
                        andSet.dispose();
                    }
                    this.f73391c.onError(b11);
                }
                if (a11 instanceof r.b) {
                    return;
                }
                jm0.i andSet2 = atomicReference.getAndSet(null);
                if (andSet2 != null) {
                    andSet2.dispose();
                }
            }
        }

        @Override // lm0.n
        public final void onError(Throwable e11) {
            Intrinsics.checkNotNullParameter(e11, "e");
            if (this.f73389a.compareAndSet(false, true)) {
                this.f73391c.onError(e11);
            }
        }

        @Override // lm0.n
        public final void onSuccess(T t2) {
            if (this.f73389a.compareAndSet(false, true)) {
                this.f73391c.onSuccess(t2);
            }
        }
    }

    public c(@NotNull AbstractC7971a upstream, @NotNull SendMetricsEventJobService.c onDispose) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        Intrinsics.checkNotNullParameter(onDispose, "onDispose");
        this.f73387a = upstream;
        this.f73388b = onDispose;
    }

    @Override // lm0.AbstractC7971a
    public final void a(@NotNull n<T> downstream) {
        Intrinsics.checkNotNullParameter(downstream, "downstream");
        this.f73387a.a(new a(downstream, this));
    }
}
