package androidx.appcompat.widget;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f747a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchView f748b;

    public /* synthetic */ f3(SearchView searchView, int i5) {
        this.f747a = i5;
        this.f748b = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f747a) {
            case 0:
                this.f748b.k();
                break;
            default:
                a1.c cVar = this.f748b.f664z;
                if (cVar instanceof u3) {
                    cVar.b(null);
                    break;
                }
                break;
        }
    }
}
