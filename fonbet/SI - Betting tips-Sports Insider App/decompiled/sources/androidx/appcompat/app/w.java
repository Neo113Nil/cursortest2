package androidx.appcompat.app;

import android.view.ViewGroup;
import androidx.core.view.g1;
import androidx.core.view.z0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class w implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f367a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f368b;

    public /* synthetic */ w(l0 l0Var, int i5) {
        this.f367a = i5;
        this.f368b = l0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f367a) {
            case 0:
                l0 l0Var = this.f368b;
                if ((l0Var.f315q0 & 1) != 0) {
                    l0Var.s(0);
                }
                if ((l0Var.f315q0 & 4096) != 0) {
                    l0Var.s(108);
                }
                l0Var.f314p0 = false;
                l0Var.f315q0 = 0;
                break;
            default:
                l0 l0Var2 = this.f368b;
                l0Var2.f326w.showAtLocation(l0Var2.f324v, 55, 0, 0);
                g1 g1Var = l0Var2.f329y;
                if (g1Var != null) {
                    g1Var.b();
                }
                if (!l0Var2.f330z || (viewGroup = l0Var2.A) == null || !viewGroup.isLaidOut()) {
                    l0Var2.f324v.setAlpha(1.0f);
                    l0Var2.f324v.setVisibility(0);
                    break;
                } else {
                    l0Var2.f324v.setAlpha(0.0f);
                    g1 a7 = z0.a(l0Var2.f324v);
                    a7.a(1.0f);
                    l0Var2.f329y = a7;
                    a7.d(new y(0, this));
                    break;
                }
        }
    }
}
