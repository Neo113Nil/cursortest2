package zf;

import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class h extends e {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public static final g f25982e = new g(null);

    /* renamed from: f, reason: collision with root package name */
    public static final h f25983f = new h(1, 0);

    public h(long j, long j6) {
        super(j, j6, 1L);
    }

    @Override // zf.e
    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        if (isEmpty() && ((h) obj).isEmpty()) {
            return true;
        }
        h hVar = (h) obj;
        return this.f25975a == hVar.f25975a && this.f25976b == hVar.f25976b;
    }

    @Override // zf.e
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = this.f25975a;
        long j6 = 31 * (j ^ (j >>> 32));
        long j10 = this.f25976b;
        return (int) (j6 + (j10 ^ (j10 >>> 32)));
    }

    @Override // zf.e
    public final boolean isEmpty() {
        return this.f25975a > this.f25976b;
    }

    @Override // zf.e
    public final String toString() {
        return this.f25975a + ".." + this.f25976b;
    }
}
