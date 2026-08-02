package p;

import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final Object f21387a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f21388b;

    /* renamed from: c, reason: collision with root package name */
    public c f21389c;

    /* renamed from: d, reason: collision with root package name */
    public c f21390d;

    public c(Object obj, Object obj2) {
        this.f21387a = obj;
        this.f21388b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f21387a.equals(cVar.f21387a) && this.f21388b.equals(cVar.f21388b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f21387a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f21388b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f21387a.hashCode() ^ this.f21388b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f21387a + "=" + this.f21388b;
    }
}
