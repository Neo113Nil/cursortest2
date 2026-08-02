package androidx.appcompat.widget;

import android.view.ViewGroup;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f745a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f746b;

    public /* synthetic */ f2(ViewGroup viewGroup, int i5) {
        this.f745a = i5;
        this.f746b = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f745a) {
            case 0:
                g2 g2Var = (g2) this.f746b;
                g2Var.f759l = null;
                g2Var.drawableStateChanged();
                break;
            default:
                ((Toolbar) this.f746b).showOverflowMenu();
                break;
        }
    }
}
