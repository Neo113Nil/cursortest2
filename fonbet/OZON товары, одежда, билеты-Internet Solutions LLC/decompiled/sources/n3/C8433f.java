package n3;

import j3.t;

/* renamed from: n3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8433f implements t.a {

    /* renamed from: a, reason: collision with root package name */
    public final long f76382a;

    /* renamed from: b, reason: collision with root package name */
    public final long f76383b;

    /* renamed from: c, reason: collision with root package name */
    public final long f76384c;

    public C8433f(long j11, long j12, long j13) {
        this.f76382a = j11;
        this.f76383b = j12;
        this.f76384c = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8433f)) {
            return false;
        }
        C8433f c8433f = (C8433f) obj;
        return this.f76382a == c8433f.f76382a && this.f76383b == c8433f.f76383b && this.f76384c == c8433f.f76384c;
    }

    public final int hashCode() {
        return com.google.common.primitives.d.b(this.f76384c) + ((com.google.common.primitives.d.b(this.f76383b) + ((com.google.common.primitives.d.b(this.f76382a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f76382a + ", modification time=" + this.f76383b + ", timescale=" + this.f76384c;
    }
}
