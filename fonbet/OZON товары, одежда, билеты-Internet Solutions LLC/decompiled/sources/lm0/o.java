package lm0;

import Sc.r;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final class o<T> extends AbstractC7971a<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC7971a<T> f73417a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final AbstractC7737t f73418b;

    public static final class a implements n<T>, jm0.i {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f73419a = new AtomicBoolean();

        /* renamed from: b, reason: collision with root package name */
        private final AtomicReference<jm0.i> f73420b = new AtomicReference<>(null);

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ n<T> f73421c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ o<T> f73422d;

        a(n<T> nVar, o<T> oVar) {
            this.f73421c = nVar;
            this.f73422d = oVar;
        }

        @Override // lm0.n
        public final void a(jm0.i d11) {
            Intrinsics.checkNotNullParameter(d11, "d");
            this.f73421c.a(d11);
        }

        @Override // jm0.i
        public final void dispose() {
            jm0.i andSet;
            if (!this.f73419a.compareAndSet(false, true) || (andSet = this.f73420b.getAndSet(null)) == null) {
                return;
            }
            andSet.dispose();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // lm0.n
        public final void onError(Throwable e11) {
            Object a11;
            Intrinsics.checkNotNullParameter(e11, "e");
            if (this.f73419a.compareAndSet(false, true)) {
                try {
                    r.Companion companion = Sc.r.INSTANCE;
                    a11 = ((o) this.f73422d).f73418b.invoke(e11);
                } catch (Throwable th2) {
                    r.Companion companion2 = Sc.r.INSTANCE;
                    a11 = Sc.s.a(th2);
                }
                boolean z11 = a11 instanceof r.b;
                n<T> nVar = this.f73421c;
                if (!z11) {
                    nVar.onSuccess(a11);
                }
                Throwable b11 = Sc.r.b(a11);
                if (b11 != null) {
                    nVar.onError(b11);
                }
            }
        }

        @Override // lm0.n
        public final void onSuccess(T t2) {
            if (this.f73419a.compareAndSet(false, true)) {
                this.f73421c.onSuccess(t2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o(@NotNull AbstractC7971a<T> upstream, @NotNull Function1<? super Throwable, ? extends T> mapper) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f73417a = upstream;
        this.f73418b = (AbstractC7737t) mapper;
    }

    @Override // lm0.AbstractC7971a
    public final void a(@NotNull n<T> downstream) {
        Intrinsics.checkNotNullParameter(downstream, "downstream");
        this.f73417a.a(new a(downstream, this));
    }
}
