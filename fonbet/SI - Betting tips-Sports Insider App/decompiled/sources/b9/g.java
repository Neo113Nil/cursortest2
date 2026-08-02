package b9;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g implements j {

    /* renamed from: a, reason: collision with root package name */
    public final k f3111a;

    /* renamed from: b, reason: collision with root package name */
    public final w7.g f3112b;

    public g(k kVar, w7.g gVar) {
        this.f3111a = kVar;
        this.f3112b = gVar;
    }

    @Override // b9.j
    public final boolean a(c9.b bVar) {
        if (bVar.f3708b != 4 || this.f3111a.a(bVar)) {
            return false;
        }
        String str = bVar.f3709c;
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.f3112b.b(new a(bVar.f3711e, bVar.f3712f, str));
        return true;
    }

    @Override // b9.j
    public final boolean b(Exception exc) {
        this.f3112b.c(exc);
        return true;
    }
}
