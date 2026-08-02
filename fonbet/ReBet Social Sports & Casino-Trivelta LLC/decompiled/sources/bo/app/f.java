package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Class f25440a;

    public f(Class javaClass) {
        Intrinsics.checkNotNullParameter(javaClass, "javaClass");
        this.f25440a = javaClass;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.areEqual(this.f25440a, ((f) obj).f25440a);
    }

    public final int hashCode() {
        return this.f25440a.hashCode();
    }

    public final String toString() {
        return "ActivitySessionWrapper(javaClass=" + this.f25440a + ")";
    }
}
