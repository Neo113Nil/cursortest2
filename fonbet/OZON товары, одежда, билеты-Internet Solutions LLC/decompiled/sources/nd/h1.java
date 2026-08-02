package nd;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class h1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final WeakReference<ClassLoader> f76983a;

    /* renamed from: b, reason: collision with root package name */
    private final int f76984b;

    public h1(@NotNull ClassLoader classLoader) {
        Intrinsics.checkNotNullParameter(classLoader, "classLoader");
        this.f76983a = new WeakReference<>(classLoader);
        this.f76984b = System.identityHashCode(classLoader);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof h1) && this.f76983a.get() == ((h1) obj).f76983a.get();
    }

    public final int hashCode() {
        return this.f76984b;
    }

    @NotNull
    public final String toString() {
        String obj;
        ClassLoader classLoader = this.f76983a.get();
        return (classLoader == null || (obj = classLoader.toString()) == null) ? "<null>" : obj;
    }
}
