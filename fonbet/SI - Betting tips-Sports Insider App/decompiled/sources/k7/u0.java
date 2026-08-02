package k7;

import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class u0 extends b1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f18926a;

    public u0(boolean z5) {
        this.f18926a = z5;
    }

    @Override // k7.b1
    public final int a() {
        return b1.d((byte) -32);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        b1 b1Var = (b1) obj;
        int a7 = b1Var.a();
        int d10 = b1.d((byte) -32);
        if (d10 != a7) {
            return d10 - b1Var.a();
        }
        return (true != this.f18926a ? 20 : 21) - (true != ((u0) b1Var).f18926a ? 20 : 21);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && u0.class == obj.getClass() && this.f18926a == ((u0) obj).f18926a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(b1.d((byte) -32)), Boolean.valueOf(this.f18926a)});
    }

    public final String toString() {
        return Boolean.toString(this.f18926a);
    }
}
