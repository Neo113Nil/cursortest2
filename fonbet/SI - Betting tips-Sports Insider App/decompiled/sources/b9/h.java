package b9;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h implements j {

    /* renamed from: a, reason: collision with root package name */
    public final w7.g f3113a;

    public h(w7.g gVar) {
        this.f3113a = gVar;
    }

    @Override // b9.j
    public final boolean a(c9.b bVar) {
        int i5 = bVar.f3708b;
        if (i5 != 3 && i5 != 4 && i5 != 5) {
            return false;
        }
        this.f3113a.d(bVar.f3707a);
        return true;
    }

    @Override // b9.j
    public final boolean b(Exception exc) {
        return false;
    }
}
