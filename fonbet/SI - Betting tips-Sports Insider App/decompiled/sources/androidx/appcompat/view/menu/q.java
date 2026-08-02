package androidx.appcompat.view.menu;

import android.view.ActionProvider;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class q implements ActionProvider.VisibilityListener {

    /* renamed from: a, reason: collision with root package name */
    public h9.c f541a;

    /* renamed from: b, reason: collision with root package name */
    public final ActionProvider f542b;

    public q(u uVar, ActionProvider actionProvider) {
        this.f542b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z5) {
        h9.c cVar = this.f541a;
        if (cVar != null) {
            p pVar = (p) cVar.f10430b;
            pVar.f529n.onItemVisibleChanged(pVar);
        }
    }
}
