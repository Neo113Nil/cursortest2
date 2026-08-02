package km0;

import gm0.C6752a;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import jm0.i;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final class b<T> extends AbstractC7693a<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC7693a<T> f71675a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final jm0.b f71676b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C6752a f71677c;

    public static final class a implements d<T>, i {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f71678a = new AtomicBoolean();

        /* renamed from: b, reason: collision with root package name */
        private final AtomicReference<i> f71679b = new AtomicReference<>(null);

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f71680c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ im0.c<T> f71681d;

        a(d<T> dVar, im0.c<T> cVar) {
            this.f71680c = dVar;
            this.f71681d = cVar;
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, km0.d] */
        @Override // km0.d
        public final void a(i d11) {
            i andSet;
            Intrinsics.checkNotNullParameter(d11, "d");
            AtomicReference<i> atomicReference = this.f71679b;
            while (!atomicReference.compareAndSet(null, d11) && atomicReference.get() == null) {
            }
            if (this.f71678a.get() && (andSet = atomicReference.getAndSet(null)) != null) {
                andSet.dispose();
            }
            this.f71680c.a(this);
        }

        @Override // jm0.i
        public final void dispose() {
            if (this.f71678a.compareAndSet(false, true)) {
                this.f71681d.dispose();
                i andSet = this.f71679b.getAndSet(null);
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }

        @Override // km0.d
        public final void onComplete() {
            this.f71678a.set(true);
            im0.c<T> cVar = this.f71681d;
            cVar.b();
            cVar.c();
        }

        @Override // km0.d
        public final void onError(Throwable e11) {
            Intrinsics.checkNotNullParameter(e11, "e");
            this.f71678a.set(true);
            im0.c<T> cVar = this.f71681d;
            cVar.f(e11);
            cVar.c();
        }

        @Override // km0.d
        public final void onNext(T t2) {
            im0.c<T> cVar = this.f71681d;
            cVar.d(t2);
            cVar.c();
        }
    }

    public b(@NotNull AbstractC7693a upstream, @NotNull jm0.b dispatcher, @NotNull C6752a backpressureStrategy) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(backpressureStrategy, "backpressureStrategy");
        this.f71675a = upstream;
        this.f71676b = dispatcher;
        this.f71677c = backpressureStrategy;
    }

    @Override // km0.AbstractC7693a
    public final void a(@NotNull d<T> downstream) {
        Intrinsics.checkNotNullParameter(downstream, "downstream");
        this.f71675a.a(new a(downstream, im0.d.a(this.f71677c, downstream, this.f71676b)));
    }
}
