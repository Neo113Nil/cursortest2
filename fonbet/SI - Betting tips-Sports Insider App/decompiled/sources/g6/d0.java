package g6;

import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f9800a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9801b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f9802c;

    public d0(String str, boolean z5) {
        v.e(str);
        this.f9800a = str;
        v.e("com.google.android.gms");
        this.f9801b = "com.google.android.gms";
        this.f9802c = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return v.k(this.f9800a, d0Var.f9800a) && v.k(this.f9801b, d0Var.f9801b) && v.k(null, null) && this.f9802c == d0Var.f9802c && v.k(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9800a, this.f9801b, null, 4225, Boolean.valueOf(this.f9802c), null});
    }

    public final String toString() {
        String str = this.f9800a;
        if (str != null) {
            return str;
        }
        v.h(null);
        throw null;
    }
}
