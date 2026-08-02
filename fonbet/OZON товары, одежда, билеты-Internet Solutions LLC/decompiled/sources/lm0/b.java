package lm0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class b<T> extends AbstractC7971a<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC7737t f73386a;

    /* JADX WARN: Multi-variable type inference failed */
    public b(@NotNull Function1<? super e<T>, Unit> source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f73386a = (AbstractC7737t) source;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    @Override // lm0.AbstractC7971a
    public final void a(@NotNull n<T> downstream) {
        Intrinsics.checkNotNullParameter(downstream, "downstream");
        f fVar = new f(downstream);
        downstream.a(fVar);
        try {
            this.f73386a.invoke(fVar);
        } catch (Throwable th2) {
            fVar.a(th2);
        }
    }
}
