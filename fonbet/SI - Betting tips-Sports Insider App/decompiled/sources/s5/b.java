package s5;

import d7.e;
import g6.v;
import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b implements d6.b {

    /* renamed from: c, reason: collision with root package name */
    public static final b f22624c;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f22625a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22626b;

    static {
        e eVar = new e(14);
        eVar.f8268b = Boolean.FALSE;
        f22624c = new b(eVar);
    }

    public b(e eVar) {
        this.f22625a = ((Boolean) eVar.f8268b).booleanValue();
        this.f22626b = (String) eVar.f8269c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return v.k(null, null) && this.f22625a == bVar.f22625a && v.k(this.f22626b, bVar.f22626b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f22625a), this.f22626b});
    }
}
