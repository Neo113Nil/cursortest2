package j$.util;

/* loaded from: classes2.dex */
public final class c0 {

    /* renamed from: c, reason: collision with root package name */
    public static final c0 f17622c = new c0();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f17623a;

    /* renamed from: b, reason: collision with root package name */
    public final long f17624b;

    public c0() {
        this.f17623a = false;
        this.f17624b = 0L;
    }

    public c0(long j) {
        this.f17623a = true;
        this.f17624b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        boolean z5 = c0Var.f17623a;
        boolean z7 = this.f17623a;
        return (z7 && z5) ? this.f17624b == c0Var.f17624b : z7 == z5;
    }

    public final int hashCode() {
        if (!this.f17623a) {
            return 0;
        }
        long j = this.f17624b;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        if (this.f17623a) {
            return "OptionalLong[" + this.f17624b + "]";
        }
        return "OptionalLong.empty";
    }
}
