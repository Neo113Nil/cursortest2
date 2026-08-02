package androidx.appcompat.widget;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f733a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f734b;

    public /* synthetic */ e(ActionBarOverlayLayout actionBarOverlayLayout, int i5) {
        this.f733a = i5;
        this.f734b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f733a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f734b;
                actionBarOverlayLayout.b();
                actionBarOverlayLayout.f609w = actionBarOverlayLayout.f592d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f610x);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f734b;
                actionBarOverlayLayout2.b();
                actionBarOverlayLayout2.f609w = actionBarOverlayLayout2.f592d.animate().translationY(-actionBarOverlayLayout2.f592d.getHeight()).setListener(actionBarOverlayLayout2.f610x);
                break;
        }
    }
}
