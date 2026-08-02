package k7;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k extends m {

    /* renamed from: c, reason: collision with root package name */
    public final transient m f18885c;

    public k(m mVar) {
        this.f18885c = mVar;
    }

    @Override // k7.m, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f18885c.contains(obj);
    }

    @Override // k7.m
    public final m f() {
        return this.f18885c;
    }

    @Override // k7.m, java.util.List
    /* renamed from: g */
    public final m subList(int i5, int i10) {
        m mVar = this.f18885c;
        a.n(i5, i10, mVar.size());
        return mVar.subList(mVar.size() - i10, mVar.size() - i5).f();
    }

    @Override // java.util.List
    public final Object get(int i5) {
        m mVar = this.f18885c;
        a.f(i5, mVar.size());
        return mVar.get((mVar.size() - 1) - i5);
    }

    @Override // k7.m, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.f18885c.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return (r0.size() - 1) - lastIndexOf;
        }
        return -1;
    }

    @Override // k7.m, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.f18885c.indexOf(obj);
        if (indexOf >= 0) {
            return (r0.size() - 1) - indexOf;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18885c.size();
    }
}
