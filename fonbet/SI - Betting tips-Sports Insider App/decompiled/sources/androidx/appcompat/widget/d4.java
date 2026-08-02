package androidx.appcompat.widget;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class d4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f731a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Toolbar f732b;

    public /* synthetic */ d4(Toolbar toolbar, int i5) {
        this.f731a = i5;
        this.f732b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f731a) {
            case 0:
                this.f732b.collapseActionView();
                break;
            default:
                this.f732b.invalidateMenu();
                break;
        }
    }
}
