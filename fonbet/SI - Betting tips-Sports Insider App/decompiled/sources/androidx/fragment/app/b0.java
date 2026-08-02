package androidx.fragment.app;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1867a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Fragment f1868b;

    public /* synthetic */ b0(Fragment fragment, int i5) {
        this.f1867a = i5;
        this.f1868b = fragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1867a) {
            case 0:
                this.f1868b.startPostponedEnterTransition();
                break;
            default:
                this.f1868b.callStartTransitionListener(false);
                break;
        }
    }
}
