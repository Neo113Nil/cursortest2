package e20;

import P4.f;
import Pk0.c;
import org.jetbrains.annotations.NotNull;

/* renamed from: e20.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6283a {

    /* renamed from: a, reason: collision with root package name */
    private final long f61867a;

    /* renamed from: b, reason: collision with root package name */
    private final long f61868b;

    /* renamed from: c, reason: collision with root package name */
    private final long f61869c;

    public C6283a(long j11, long j12, long j13) {
        this.f61867a = j11;
        this.f61868b = j12;
        this.f61869c = j13;
    }

    public final long a() {
        return this.f61868b;
    }

    public final long b() {
        return this.f61867a;
    }

    public final long c() {
        return this.f61869c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6283a)) {
            return false;
        }
        C6283a c6283a = (C6283a) obj;
        return this.f61867a == c6283a.f61867a && this.f61868b == c6283a.f61868b && this.f61869c == c6283a.f61869c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f61869c) + c.a(Long.hashCode(this.f61867a) * 31, 31, this.f61868b);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OverlayWidgetMetrics(create=");
        sb2.append(this.f61867a);
        sb2.append(", bind=");
        sb2.append(this.f61868b);
        sb2.append(", layout=");
        return f.a(this.f61869c, ")", sb2);
    }
}
