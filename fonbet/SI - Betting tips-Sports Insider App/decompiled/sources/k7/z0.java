package k7;

import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class z0 extends b1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f18943a;

    public z0(String str) {
        this.f18943a = str;
    }

    @Override // k7.b1
    public final int a() {
        return b1.d((byte) 96);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        b1 b1Var = (b1) obj;
        int a7 = b1Var.a();
        int d10 = b1.d((byte) 96);
        if (d10 != a7) {
            return d10 - b1Var.a();
        }
        String str = ((z0) b1Var).f18943a;
        int length = str.length();
        String str2 = this.f18943a;
        if (str2.length() == length) {
            return str2.compareTo(str);
        }
        return str2.length() - str.length();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z0.class == obj.getClass()) {
            return this.f18943a.equals(((z0) obj).f18943a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(b1.d((byte) 96)), this.f18943a});
    }

    public final String toString() {
        return d9.e.l(new StringBuilder("\""), this.f18943a, "\"");
    }
}
