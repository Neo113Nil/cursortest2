package f7;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i extends j {

    /* renamed from: c, reason: collision with root package name */
    public final transient int f9486c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f9487d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f9488e;

    public i(j jVar, int i5, int i10) {
        this.f9488e = jVar;
        this.f9486c = i5;
        this.f9487d = i10;
    }

    @Override // f7.g
    public final Object[] a() {
        return this.f9488e.a();
    }

    @Override // f7.g
    public final int b() {
        return this.f9488e.b() + this.f9486c;
    }

    @Override // f7.g
    public final int c() {
        return this.f9488e.b() + this.f9486c + this.f9487d;
    }

    @Override // f7.g
    public final boolean d() {
        return true;
    }

    @Override // f7.j, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final j subList(int i5, int i10) {
        e.e(i5, i10, this.f9487d);
        int i11 = this.f9486c;
        return this.f9488e.subList(i5 + i11, i10 + i11);
    }

    @Override // java.util.List
    public final Object get(int i5) {
        e.c(i5, this.f9487d);
        return this.f9488e.get(i5 + this.f9486c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9487d;
    }
}
