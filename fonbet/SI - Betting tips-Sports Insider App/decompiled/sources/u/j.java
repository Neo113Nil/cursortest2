package u;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j extends g {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k f24002h;

    public j(k kVar) {
        this.f24002h = kVar;
    }

    @Override // u.g
    public final String i() {
        h hVar = (h) this.f24002h.f24003a.get();
        if (hVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + hVar.f23998a + "]";
    }
}
