package j7;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c extends e {

    /* renamed from: c, reason: collision with root package name */
    public final transient e f18268c;

    public c(e eVar) {
        this.f18268c = eVar;
    }

    @Override // j7.e, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f18268c.contains(obj);
    }

    @Override // j7.e
    public final e e() {
        return this.f18268c;
    }

    @Override // j7.e, java.util.List
    /* renamed from: f */
    public final e subList(int i5, int i10) {
        e eVar = this.f18268c;
        y4.a.L(i5, i10, eVar.size());
        return eVar.subList(eVar.size() - i10, eVar.size() - i5).e();
    }

    @Override // java.util.List
    public final Object get(int i5) {
        e eVar = this.f18268c;
        y4.a.I(i5, eVar.size());
        return eVar.get((eVar.size() - 1) - i5);
    }

    @Override // j7.e, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.f18268c.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return (r0.size() - 1) - lastIndexOf;
        }
        return -1;
    }

    @Override // j7.e, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.f18268c.indexOf(obj);
        if (indexOf >= 0) {
            return (r0.size() - 1) - indexOf;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18268c.size();
    }
}
