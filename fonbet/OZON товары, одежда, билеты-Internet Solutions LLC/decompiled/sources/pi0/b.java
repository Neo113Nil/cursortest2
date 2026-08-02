package pi0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class b<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Gj0.a f81208a;

    public b(@NotNull Gj0.a extractor) {
        Intrinsics.checkNotNullParameter(extractor, "extractor");
        this.f81208a = extractor;
    }

    public final T a(String str, String str2) {
        T c11 = (!kotlin.text.h.K(str) && Intrinsics.d(this.f81208a.c(), str)) ? c(str) : null;
        return (c11 != null || str2 == null || kotlin.text.h.K(str2)) ? c11 : b(str2);
    }

    protected abstract T b(@NotNull String str);

    protected abstract T c(@NotNull String str);

    @NotNull
    protected final Gj0.a d() {
        return this.f81208a;
    }
}
