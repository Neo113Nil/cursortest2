package lm0;

import Sc.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class i<T> extends AbstractC7971a<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC7737t f73408a;

    /* JADX WARN: Multi-variable type inference failed */
    public i(@NotNull Function0<? extends T> source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f73408a = (AbstractC7737t) source;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
    @Override // lm0.AbstractC7971a
    public final void a(@NotNull n<T> downstream) {
        Object a11;
        Intrinsics.checkNotNullParameter(downstream, "downstream");
        jm0.k kVar = new jm0.k();
        downstream.a(kVar);
        if (kVar.a()) {
            return;
        }
        try {
            r.Companion companion = Sc.r.INSTANCE;
            a11 = this.f73408a.invoke();
        } catch (Throwable th2) {
            r.Companion companion2 = Sc.r.INSTANCE;
            a11 = Sc.s.a(th2);
        }
        if (!(a11 instanceof r.b) && !kVar.a()) {
            downstream.onSuccess(a11);
        }
        Throwable b11 = Sc.r.b(a11);
        if (b11 == null || kVar.a()) {
            return;
        }
        downstream.onError(b11);
    }
}
