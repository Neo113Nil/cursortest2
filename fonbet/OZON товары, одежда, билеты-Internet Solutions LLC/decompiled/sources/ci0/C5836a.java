package ci0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: ci0.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C5836a implements Comparable<C5836a> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC5837b f57188a;

    /* renamed from: b, reason: collision with root package name */
    private final long f57189b;

    public C5836a(@NotNull InterfaceC5837b type, long j11) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f57188a = type;
        this.f57189b = j11;
    }

    @NotNull
    public final InterfaceC5837b a() {
        return this.f57188a;
    }

    public final long b() {
        return this.f57189b;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C5836a c5836a) {
        C5836a other = c5836a;
        Intrinsics.checkNotNullParameter(other, "other");
        return this.f57188a.getName().compareTo(other.f57188a.getName());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C5836a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type ru.ozon.tracer.metric.PerfMetric");
        C5836a c5836a = (C5836a) obj;
        return Intrinsics.d(this.f57188a, c5836a.f57188a) && this.f57189b == c5836a.f57189b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f57189b) + (this.f57188a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "PerfMetric(type=" + this.f57188a + ", value=" + this.f57189b + ")";
    }
}
