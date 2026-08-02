package z00;

import T00.i;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Object f106880a;

    public c(@NotNull List<i> widgets) {
        Intrinsics.checkNotNullParameter(widgets, "widgets");
        this.f106880a = widgets;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List<T00.i>] */
    @NotNull
    public final List<i> a() {
        return this.f106880a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!c.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type ru.ozon.composer.error.ErrorStateModel");
        return Intrinsics.d(this.f106880a, ((c) obj).f106880a);
    }

    public final int hashCode() {
        return this.f106880a.hashCode();
    }
}
