package e8;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g implements d, Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Object f8780a;

    public g(Object obj) {
        this.f8780a = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        Object obj2 = ((g) obj).f8780a;
        Object obj3 = this.f8780a;
        return obj3 == obj2 || obj3.equals(obj2);
    }

    @Override // e8.d
    public final Object get() {
        return this.f8780a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8780a});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f8780a);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 22);
        sb2.append("Suppliers.ofInstance(");
        sb2.append(valueOf);
        sb2.append(")");
        return sb2.toString();
    }
}
