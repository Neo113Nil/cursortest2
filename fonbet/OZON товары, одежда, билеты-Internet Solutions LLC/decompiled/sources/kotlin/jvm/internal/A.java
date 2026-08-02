package kotlin.jvm.internal;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class A implements InterfaceC7726h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Class<?> f71782a;

    public A(@NotNull Class<?> jClass, @NotNull String moduleName) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        this.f71782a = jClass;
    }

    @Override // kotlin.jvm.internal.InterfaceC7726h
    @NotNull
    public final Class<?> c() {
        return this.f71782a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof A) {
            return Intrinsics.d(this.f71782a, ((A) obj).f71782a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f71782a.hashCode();
    }

    @NotNull
    public final String toString() {
        return this.f71782a.toString() + " (Kotlin reflection is not available)";
    }
}
