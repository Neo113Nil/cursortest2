package k7;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f18859a;

    public f(Object obj) {
        this.f18859a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return a.i(this.f18859a, ((f) obj).f18859a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18859a});
    }

    public final String toString() {
        return androidx.appcompat.widget.c1.n("Suppliers.ofInstance(", this.f18859a.toString(), ")");
    }
}
