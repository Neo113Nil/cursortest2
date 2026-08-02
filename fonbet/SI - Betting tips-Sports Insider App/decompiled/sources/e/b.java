package e;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8395a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f8396b;

    public /* synthetic */ b(j jVar, int i5) {
        this.f8395a = i5;
        this.f8396b = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8395a) {
            case 0:
                this.f8396b.invalidateOptionsMenu();
                break;
            default:
                j.n(this.f8396b);
                break;
        }
    }
}
