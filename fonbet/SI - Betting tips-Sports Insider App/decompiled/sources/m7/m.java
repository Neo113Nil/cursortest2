package m7;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m extends n {

    /* renamed from: c, reason: collision with root package name */
    public final transient int f20466c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f20467d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n f20468e;

    public m(n nVar, int i5, int i10) {
        this.f20468e = nVar;
        this.f20466c = i5;
        this.f20467d = i10;
    }

    @Override // m7.k
    public final Object[] a() {
        return this.f20468e.a();
    }

    @Override // m7.k
    public final int b() {
        return this.f20468e.b() + this.f20466c;
    }

    @Override // m7.k
    public final int c() {
        return this.f20468e.b() + this.f20466c + this.f20467d;
    }

    @Override // m7.k
    public final boolean d() {
        return true;
    }

    @Override // m7.n, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final n subList(int i5, int i10) {
        y4.a.N(i5, i10, this.f20467d);
        int i11 = this.f20466c;
        return this.f20468e.subList(i5 + i11, i10 + i11);
    }

    @Override // java.util.List
    public final Object get(int i5) {
        y4.a.K(i5, this.f20467d);
        return this.f20468e.get(i5 + this.f20466c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f20467d;
    }
}
