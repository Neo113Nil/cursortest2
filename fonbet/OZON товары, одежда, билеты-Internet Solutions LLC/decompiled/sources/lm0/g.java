package lm0;

import Sc.r;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final class g<T, R> extends AbstractC7971a<R> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC7971a<T> f73396a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final AbstractC7737t f73397b;

    private final class a implements jm0.i {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final AtomicBoolean f73398a = new AtomicBoolean();

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final AtomicReference<jm0.i> f73399b = new AtomicReference<>(null);

        /* renamed from: lm0.g$a$a, reason: collision with other inner class name */
        public static final class C1245a implements n<R> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ g<T, R>.a f73401a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ n<R> f73402b;

            C1245a(g<T, R>.a aVar, n<R> nVar) {
                this.f73401a = aVar;
                this.f73402b = nVar;
            }

            @Override // lm0.n
            public final void a(jm0.i d11) {
                jm0.i iVar;
                Intrinsics.checkNotNullParameter(d11, "d");
                g<T, R>.a aVar = this.f73401a;
                AtomicReference atomicReference = ((a) aVar).f73399b;
                while (!atomicReference.compareAndSet(null, d11) && atomicReference.get() == null) {
                }
                if (!aVar.c() || (iVar = (jm0.i) ((a) aVar).f73399b.getAndSet(null)) == null) {
                    return;
                }
                iVar.dispose();
            }

            @Override // lm0.n
            public final void onError(Throwable e11) {
                Intrinsics.checkNotNullParameter(e11, "e");
                if (((a) this.f73401a).f73398a.compareAndSet(false, true)) {
                    this.f73402b.onError(e11);
                }
            }

            @Override // lm0.n
            public final void onSuccess(R r11) {
                if (((a) this.f73401a).f73398a.compareAndSet(false, true)) {
                    this.f73402b.onSuccess(r11);
                }
            }
        }

        public a() {
        }

        public final boolean c() {
            return this.f73398a.get();
        }

        public final void d(@NotNull n<R> downstream, T t2) {
            Object a11;
            Intrinsics.checkNotNullParameter(downstream, "downstream");
            C1245a c1245a = new C1245a(this, downstream);
            AtomicBoolean atomicBoolean = this.f73398a;
            if (atomicBoolean.get()) {
                return;
            }
            g<T, R> gVar = g.this;
            try {
                r.Companion companion = Sc.r.INSTANCE;
                a11 = (AbstractC7971a) ((g) gVar).f73397b.invoke(t2);
            } catch (Throwable th2) {
                r.Companion companion2 = Sc.r.INSTANCE;
                a11 = Sc.s.a(th2);
            }
            if (!(a11 instanceof r.b)) {
                AbstractC7971a abstractC7971a = (AbstractC7971a) a11;
                if (!atomicBoolean.get()) {
                    abstractC7971a.a(c1245a);
                }
            }
            Throwable b11 = Sc.r.b(a11);
            if (b11 == null || atomicBoolean.get()) {
                return;
            }
            c1245a.onError(b11);
        }

        @Override // jm0.i
        public final void dispose() {
            jm0.i andSet;
            if (!this.f73398a.compareAndSet(false, true) || (andSet = this.f73399b.getAndSet(null)) == null) {
                return;
            }
            andSet.dispose();
        }
    }

    public static final class b implements n<T>, jm0.i {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f73403a = new AtomicBoolean();

        /* renamed from: b, reason: collision with root package name */
        private final AtomicReference<jm0.i> f73404b = new AtomicReference<>(null);

        /* renamed from: c, reason: collision with root package name */
        private final AtomicReference<jm0.i> f73405c = new AtomicReference<>(null);

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ n<R> f73406d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ g<T, R> f73407e;

        b(n<R> nVar, g<T, R> gVar) {
            this.f73406d = nVar;
            this.f73407e = gVar;
        }

        @Override // lm0.n
        public final void a(jm0.i d11) {
            Intrinsics.checkNotNullParameter(d11, "d");
            AtomicReference<jm0.i> atomicReference = this.f73404b;
            while (!atomicReference.compareAndSet(null, d11) && atomicReference.get() == null) {
            }
            if (this.f73403a.get()) {
                jm0.i andSet = atomicReference.getAndSet(null);
                if (andSet != null) {
                    andSet.dispose();
                }
                jm0.i andSet2 = this.f73405c.getAndSet(null);
                if (andSet2 != null) {
                    andSet2.dispose();
                }
            }
            this.f73406d.a(this);
        }

        @Override // jm0.i
        public final void dispose() {
            if (this.f73403a.compareAndSet(false, true)) {
                jm0.i andSet = this.f73404b.getAndSet(null);
                if (andSet != null) {
                    andSet.dispose();
                }
                jm0.i andSet2 = this.f73405c.getAndSet(null);
                if (andSet2 != null) {
                    andSet2.dispose();
                }
            }
        }

        @Override // lm0.n
        public final void onError(Throwable e11) {
            Intrinsics.checkNotNullParameter(e11, "e");
            if (this.f73403a.compareAndSet(false, true)) {
                this.f73406d.onError(e11);
            }
        }

        @Override // lm0.n
        public final void onSuccess(T t2) {
            if (this.f73403a.compareAndSet(false, true)) {
                a aVar = this.f73407e.new a();
                this.f73405c.set(aVar);
                aVar.d(this.f73406d, t2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(@NotNull AbstractC7971a<T> upstream, @NotNull Function1<? super T, ? extends AbstractC7971a<R>> mapper) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f73396a = upstream;
        this.f73397b = (AbstractC7737t) mapper;
    }

    @Override // lm0.AbstractC7971a
    public final void a(@NotNull n<R> downstream) {
        Intrinsics.checkNotNullParameter(downstream, "downstream");
        this.f73396a.a(new b(downstream, this));
    }
}
