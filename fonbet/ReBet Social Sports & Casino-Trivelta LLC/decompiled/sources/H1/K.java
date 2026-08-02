package H1;

/* loaded from: classes.dex */
public final class K {

    /* renamed from: c, reason: collision with root package name */
    public static final K f4338c = new K(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final long f4339a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4340b;

    public K(long j10, long j11) {
        this.f4339a = j10;
        this.f4340b = j11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && K.class == obj.getClass()) {
            K k10 = (K) obj;
            if (this.f4339a == k10.f4339a && this.f4340b == k10.f4340b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f4339a) * 31) + ((int) this.f4340b);
    }

    public String toString() {
        return "[timeUs=" + this.f4339a + ", position=" + this.f4340b + "]";
    }
}
