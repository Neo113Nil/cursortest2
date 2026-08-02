package t1;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f23740a = new LinkedHashMap();

    public abstract Object a(b bVar);

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return Intrinsics.areEqual(this.f23740a, ((c) obj).f23740a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f23740a.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.f23740a + ')';
    }
}
