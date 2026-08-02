package lm0;

import Sc.C4001c;
import jm0.C7438a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rl0.Y;

/* loaded from: classes8.dex */
final class k<T> extends AbstractC7971a<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC7971a<T> f73413a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Y.b f73414b;

    public static final class a implements n<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n<T> f73415a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k<T> f73416b;

        a(n<T> nVar, k<T> kVar) {
            this.f73415a = nVar;
            this.f73416b = kVar;
        }

        @Override // lm0.n
        public final void a(jm0.i d11) {
            Intrinsics.checkNotNullParameter(d11, "d");
            this.f73415a.a(d11);
        }

        @Override // lm0.n
        public final void onError(Throwable e11) {
            Throwable c7438a;
            Intrinsics.checkNotNullParameter(e11, "e");
            try {
                c7438a = (Throwable) ((Y.b) ((k) this.f73416b).f73414b).invoke(e11);
            } catch (Throwable th2) {
                c7438a = new C7438a(C4001c.b(th2), e11);
            }
            this.f73415a.onError(c7438a);
        }

        @Override // lm0.n
        public final void onSuccess(T t2) {
            this.f73415a.onSuccess(t2);
        }
    }

    public k(@NotNull AbstractC7971a upstream, @NotNull Y.b mapper) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f73413a = upstream;
        this.f73414b = mapper;
    }

    @Override // lm0.AbstractC7971a
    public final void a(@NotNull n<T> downstream) {
        Intrinsics.checkNotNullParameter(downstream, "downstream");
        this.f73413a.a(new a(downstream, this));
    }
}
