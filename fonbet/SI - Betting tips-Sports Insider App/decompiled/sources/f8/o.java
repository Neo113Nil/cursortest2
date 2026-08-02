package f8;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class o extends j {

    /* renamed from: d, reason: collision with root package name */
    public final transient h f9523d;

    /* renamed from: e, reason: collision with root package name */
    public final transient p f9524e;

    public o(h hVar, p pVar) {
        this.f9523d = hVar;
        this.f9524e = pVar;
    }

    @Override // f8.a
    public final int a(Object[] objArr) {
        return this.f9524e.a(objArr);
    }

    @Override // f8.a, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f9523d.get(obj) != null;
    }

    @Override // f8.a
    /* renamed from: e */
    public final t iterator() {
        return this.f9524e.listIterator(0);
    }

    @Override // f8.j
    public final e f() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ((q) this.f9523d).f9531f;
    }
}
