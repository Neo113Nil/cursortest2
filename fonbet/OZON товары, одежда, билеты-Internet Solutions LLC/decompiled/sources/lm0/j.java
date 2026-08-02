package lm0;

import Sc.r;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rl0.k0;

/* loaded from: classes4.dex */
final class j<T, R> extends AbstractC7971a<R> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC7971a<T> f73409a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final k0 f73410b;

    public static final class a implements n<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n<R> f73411a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ j<T, R> f73412b;

        a(n<R> nVar, j<T, R> jVar) {
            this.f73411a = nVar;
            this.f73412b = jVar;
        }

        @Override // lm0.n
        public final void a(jm0.i d11) {
            Intrinsics.checkNotNullParameter(d11, "d");
            this.f73411a.a(d11);
        }

        @Override // lm0.n
        public final void onError(Throwable e11) {
            Intrinsics.checkNotNullParameter(e11, "e");
            this.f73411a.onError(e11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // lm0.n
        public final void onSuccess(T t2) {
            Object a11;
            j<T, R> jVar = this.f73412b;
            try {
                r.Companion companion = Sc.r.INSTANCE;
                a11 = ((k0) ((j) jVar).f73410b).invoke(t2);
            } catch (Throwable th2) {
                r.Companion companion2 = Sc.r.INSTANCE;
                a11 = Sc.s.a(th2);
            }
            boolean z11 = a11 instanceof r.b;
            n<R> nVar = this.f73411a;
            if (!z11) {
                nVar.onSuccess(a11);
            }
            Throwable b11 = Sc.r.b(a11);
            if (b11 != null) {
                nVar.onError(b11);
            }
        }
    }

    public j(@NotNull AbstractC7971a upstream, @NotNull k0 mapper) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f73409a = upstream;
        this.f73410b = mapper;
    }

    @Override // lm0.AbstractC7971a
    public final void a(@NotNull n<R> downstream) {
        Intrinsics.checkNotNullParameter(downstream, "downstream");
        this.f73409a.a(new a(downstream, this));
    }
}
