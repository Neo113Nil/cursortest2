package j7;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d extends e {

    /* renamed from: c, reason: collision with root package name */
    public final transient int f18269c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f18270d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f18271e;

    public d(e eVar, int i5, int i10) {
        this.f18271e = eVar;
        this.f18269c = i5;
        this.f18270d = i10;
    }

    @Override // j7.a
    public final Object[] a() {
        return this.f18271e.a();
    }

    @Override // j7.a
    public final int b() {
        return this.f18271e.b() + this.f18269c;
    }

    @Override // j7.a
    public final int c() {
        return this.f18271e.b() + this.f18269c + this.f18270d;
    }

    @Override // j7.e, java.util.List
    /* renamed from: f */
    public final e subList(int i5, int i10) {
        y4.a.L(i5, i10, this.f18270d);
        int i11 = this.f18269c;
        return this.f18271e.subList(i5 + i11, i10 + i11);
    }

    @Override // java.util.List
    public final Object get(int i5) {
        y4.a.I(i5, this.f18270d);
        return this.f18271e.get(i5 + this.f18269c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18270d;
    }
}
