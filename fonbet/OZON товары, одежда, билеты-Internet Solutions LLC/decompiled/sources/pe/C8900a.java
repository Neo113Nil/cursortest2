package pe;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: pe.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C8900a<T> {

    /* renamed from: a, reason: collision with root package name */
    private final T f80406a;

    /* renamed from: b, reason: collision with root package name */
    private final T f80407b;

    public C8900a(T t2, T t11) {
        this.f80406a = t2;
        this.f80407b = t11;
    }

    public final T a() {
        return this.f80406a;
    }

    public final T b() {
        return this.f80407b;
    }

    public final T c() {
        return this.f80406a;
    }

    public final T d() {
        return this.f80407b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8900a)) {
            return false;
        }
        C8900a c8900a = (C8900a) obj;
        return Intrinsics.d(this.f80406a, c8900a.f80406a) && Intrinsics.d(this.f80407b, c8900a.f80407b);
    }

    public final int hashCode() {
        T t2 = this.f80406a;
        int hashCode = (t2 == null ? 0 : t2.hashCode()) * 31;
        T t11 = this.f80407b;
        return hashCode + (t11 != null ? t11.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "ApproximationBounds(lower=" + this.f80406a + ", upper=" + this.f80407b + ')';
    }
}
