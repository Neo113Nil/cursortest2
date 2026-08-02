package f1;

import b1.C2334C;

/* renamed from: f1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4229g implements C2334C.a {

    /* renamed from: a, reason: collision with root package name */
    public final long f46182a;

    /* renamed from: b, reason: collision with root package name */
    public final long f46183b;

    /* renamed from: c, reason: collision with root package name */
    public final long f46184c;

    public C4229g(long j10, long j11, long j12) {
        this.f46182a = j10;
        this.f46183b = j11;
        this.f46184c = j12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4229g)) {
            return false;
        }
        C4229g c4229g = (C4229g) obj;
        return this.f46182a == c4229g.f46182a && this.f46183b == c4229g.f46183b && this.f46184c == c4229g.f46184c;
    }

    public int hashCode() {
        return ((((527 + com.google.common.primitives.h.c(this.f46182a)) * 31) + com.google.common.primitives.h.c(this.f46183b)) * 31) + com.google.common.primitives.h.c(this.f46184c);
    }

    public String toString() {
        return "Mp4Timestamp: creation time=" + this.f46182a + ", modification time=" + this.f46183b + ", timescale=" + this.f46184c;
    }
}
