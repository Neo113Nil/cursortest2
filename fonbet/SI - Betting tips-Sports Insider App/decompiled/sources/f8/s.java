package f8;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class s extends j {

    /* renamed from: d, reason: collision with root package name */
    public final transient Object f9538d;

    public s(Object obj) {
        obj.getClass();
        this.f9538d = obj;
    }

    @Override // f8.a
    public final int a(Object[] objArr) {
        objArr[0] = this.f9538d;
        return 1;
    }

    @Override // f8.a, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f9538d.equals(obj);
    }

    @Override // f8.a
    /* renamed from: e */
    public final t iterator() {
        return new k(this.f9538d);
    }

    @Override // f8.j, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f9538d.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String obj = this.f9538d.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj).length() + 2);
        sb2.append('[');
        sb2.append(obj);
        sb2.append(']');
        return sb2.toString();
    }
}
