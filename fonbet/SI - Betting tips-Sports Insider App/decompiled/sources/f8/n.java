package f8;

import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n extends j {

    /* renamed from: d, reason: collision with root package name */
    public final transient h f9520d;

    /* renamed from: e, reason: collision with root package name */
    public final transient Object[] f9521e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f9522f;

    public n(h hVar, Object[] objArr, int i5) {
        this.f9520d = hVar;
        this.f9521e = objArr;
        this.f9522f = i5;
    }

    @Override // f8.a
    public final int a(Object[] objArr) {
        return f().a(objArr);
    }

    @Override // f8.a, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f9520d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // f8.a
    /* renamed from: e */
    public final t iterator() {
        return f().listIterator(0);
    }

    @Override // f8.j
    public final e i() {
        return new m(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f9522f;
    }
}
