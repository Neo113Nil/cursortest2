package jZ;

import P4.f;
import Pk0.c;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final long f69545a;

    /* renamed from: b, reason: collision with root package name */
    private final long f69546b;

    /* renamed from: c, reason: collision with root package name */
    private final long f69547c;

    public b(long j11, long j12, long j13) {
        this.f69545a = j11;
        this.f69546b = j12;
        this.f69547c = j13;
    }

    public final long a() {
        return this.f69545a;
    }

    public final long b() {
        return this.f69547c;
    }

    public final long c() {
        return this.f69546b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f69545a == bVar.f69545a && this.f69546b == bVar.f69546b && this.f69547c == bVar.f69547c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f69547c) + c.a(Long.hashCode(this.f69545a) * 31, 31, this.f69546b);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TimerConfig(frequency=");
        sb2.append(this.f69545a);
        sb2.append(", jMin=");
        sb2.append(this.f69546b);
        sb2.append(", jMax=");
        return f.a(this.f69547c, ")", sb2);
    }
}
