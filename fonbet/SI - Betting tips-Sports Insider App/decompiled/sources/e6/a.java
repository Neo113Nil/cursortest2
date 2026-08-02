package e6;

import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f8667a;

    /* renamed from: b, reason: collision with root package name */
    public final l1.a f8668b;

    /* renamed from: c, reason: collision with root package name */
    public final d6.b f8669c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8670d;

    public a(l1.a aVar, d6.b bVar, String str) {
        this.f8668b = aVar;
        this.f8669c = bVar;
        this.f8670d = str;
        this.f8667a = Arrays.hashCode(new Object[]{aVar, bVar, str, null});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return g6.v.k(this.f8668b, aVar.f8668b) && g6.v.k(this.f8669c, aVar.f8669c) && g6.v.k(this.f8670d, aVar.f8670d) && g6.v.k(null, null);
    }

    public final int hashCode() {
        return this.f8667a;
    }
}
