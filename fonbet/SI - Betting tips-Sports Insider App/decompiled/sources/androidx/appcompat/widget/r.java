package androidx.appcompat.widget;

import android.view.MenuItem;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class r implements androidx.appcompat.view.menu.l, androidx.appcompat.view.menu.y, k1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f899a;

    public /* synthetic */ r(Object obj) {
        this.f899a = obj;
    }

    @Override // androidx.appcompat.view.menu.y
    public boolean c(androidx.appcompat.view.menu.n nVar) {
        n nVar2 = (n) this.f899a;
        if (nVar == nVar2.f837c) {
            return false;
        }
        nVar2.f857y = ((androidx.appcompat.view.menu.f0) nVar).getItem().getItemId();
        androidx.appcompat.view.menu.y yVar = nVar2.f839e;
        if (yVar != null) {
            return yVar.c(nVar);
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.y
    public void onCloseMenu(androidx.appcompat.view.menu.n nVar, boolean z5) {
        if (nVar instanceof androidx.appcompat.view.menu.f0) {
            nVar.getRootMenu().close(false);
        }
        androidx.appcompat.view.menu.y yVar = ((n) this.f899a).f839e;
        if (yVar != null) {
            yVar.onCloseMenu(nVar, z5);
        }
    }

    @Override // androidx.appcompat.view.menu.l
    public boolean onMenuItemSelected(androidx.appcompat.view.menu.n nVar, MenuItem menuItem) {
        s sVar = ((ActionMenuView) this.f899a).f624l;
        return sVar != null && ((e4) sVar).f742a.mMenuHostHelper.a(menuItem);
    }

    @Override // androidx.appcompat.view.menu.l
    public void onMenuModeChange(androidx.appcompat.view.menu.n nVar) {
        androidx.appcompat.view.menu.l lVar = ((ActionMenuView) this.f899a).f620g;
        if (lVar != null) {
            lVar.onMenuModeChange(nVar);
        }
    }

    public void a(int i5) {
    }

    public void b(int i5) {
    }

    public void d(int i5, float f6) {
    }
}
