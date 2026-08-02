package k7;

import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class x0 extends b1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f18937a;

    public x0(long j) {
        this.f18937a = j;
    }

    @Override // k7.b1
    public final int a() {
        return b1.d(this.f18937a >= 0 ? (byte) 0 : (byte) 32);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        b1 b1Var = (b1) obj;
        if (a() != b1Var.a()) {
            return a() - b1Var.a();
        }
        long abs = Math.abs(this.f18937a);
        long abs2 = Math.abs(((x0) b1Var).f18937a);
        if (abs < abs2) {
            return -1;
        }
        return abs > abs2 ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && x0.class == obj.getClass() && this.f18937a == ((x0) obj).f18937a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(a()), Long.valueOf(this.f18937a)});
    }

    public final String toString() {
        return Long.toString(this.f18937a);
    }
}
