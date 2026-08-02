package m30;

import P4.f;
import org.jetbrains.annotations.NotNull;

/* renamed from: m30.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8074a {

    /* renamed from: a, reason: collision with root package name */
    private final long f74383a;

    /* renamed from: b, reason: collision with root package name */
    private final long f74384b;

    /* renamed from: c, reason: collision with root package name */
    private final long f74385c;

    public C8074a(long j11, long j12, long j13) {
        this.f74383a = j11;
        this.f74384b = j12;
        this.f74385c = j13;
    }

    public static C8074a a(C8074a c8074a, long j11, long j12, int i11) {
        long j13 = c8074a.f74383a;
        if ((i11 & 2) != 0) {
            j11 = c8074a.f74384b;
        }
        long j14 = j11;
        if ((i11 & 4) != 0) {
            j12 = c8074a.f74385c;
        }
        c8074a.getClass();
        return new C8074a(j13, j14, j12);
    }

    public final long b() {
        return this.f74384b;
    }

    public final long c() {
        return this.f74385c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8074a)) {
            return false;
        }
        C8074a c8074a = (C8074a) obj;
        return this.f74383a == c8074a.f74383a && this.f74384b == c8074a.f74384b && this.f74385c == c8074a.f74385c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f74385c) + Pk0.c.a(Long.hashCode(this.f74383a) * 31, 31, this.f74384b);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PagePerf(htmlLoadStarted=");
        sb2.append(this.f74383a);
        sb2.append(", htmlLoadFinished=");
        sb2.append(this.f74384b);
        sb2.append(", pageLoadFinished=");
        return f.a(this.f74385c, ")", sb2);
    }
}
