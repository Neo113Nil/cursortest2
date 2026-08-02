package lm0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final class s<T> extends AbstractC7971a<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC7971a<T> f73427a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final jm0.b f73428b;

    static final class a extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ s<T> f73429b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ n<T> f73430c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(s<T> sVar, n<T> nVar) {
            super(0);
            this.f73429b = sVar;
            this.f73430c = nVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((s) this.f73429b).f73427a.a(this.f73430c);
            return Unit.f71690a;
        }
    }

    public s(@NotNull AbstractC7971a<T> upstream, @NotNull jm0.b dispatcher) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.f73427a = upstream;
        this.f73428b = dispatcher;
    }

    @Override // lm0.AbstractC7971a
    public final void a(@NotNull n<T> downstream) {
        Intrinsics.checkNotNullParameter(downstream, "downstream");
        this.f73428b.a(new a(this, downstream));
    }
}
