package androidx.appcompat.widget;

import android.view.View;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final i f802a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f803b;

    public k(n nVar, i iVar) {
        this.f803b = nVar;
        this.f802a = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n nVar = this.f803b;
        androidx.appcompat.view.menu.n nVar2 = nVar.f837c;
        if (nVar2 != null) {
            nVar2.changeMenuMode();
        }
        View view = (View) nVar.f842h;
        if (view != null && view.getWindowToken() != null) {
            i iVar = this.f802a;
            if (!iVar.b()) {
                if (iVar.f556e != null) {
                    iVar.d(0, 0, false, false);
                }
            }
            nVar.f852t = iVar;
        }
        nVar.f854v = null;
    }
}
