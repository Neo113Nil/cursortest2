package j9;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f18330a;

    public j(k kVar) {
        this.f18330a = kVar;
    }

    public final void a() {
        k kVar = this.f18330a;
        synchronized (kVar) {
            kVar.f18336d = true;
        }
        this.f18330a.g();
    }
}
