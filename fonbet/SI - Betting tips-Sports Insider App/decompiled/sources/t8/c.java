package t8;

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f23753a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f23754b;

    public c(String str, Map map) {
        this.f23753a = str;
        this.f23754b = map;
    }

    public static c a(String str) {
        return new c(str, Collections.EMPTY_MAP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f23753a.equals(cVar.f23753a) && this.f23754b.equals(cVar.f23754b);
    }

    public final int hashCode() {
        return this.f23754b.hashCode() + (this.f23753a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f23753a + ", properties=" + this.f23754b.values() + "}";
    }
}
