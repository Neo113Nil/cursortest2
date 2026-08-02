package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a1 implements Map.Entry, Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final Comparable f1574a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1575b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z0 f1576c;

    public a1(z0 z0Var, Comparable comparable, Object obj) {
        this.f1576c = z0Var;
        this.f1574a = comparable;
        this.f1575b = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f1574a.compareTo(((a1) obj).f1574a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f1574a;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.f1575b;
                    Object value = entry.getValue();
                    if (obj2 == null ? value == null : obj2.equals(value)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f1574a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f1575b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f1574a;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f1575b;
        return (obj != null ? obj.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f1576c.c();
        Object obj2 = this.f1575b;
        this.f1575b = obj;
        return obj2;
    }

    public final String toString() {
        return this.f1574a + "=" + this.f1575b;
    }
}
