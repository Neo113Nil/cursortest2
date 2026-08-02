package androidx.appcompat.widget;

import android.view.MenuItem;
import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e4 implements androidx.appcompat.view.menu.l, s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Toolbar f742a;

    public /* synthetic */ e4(Toolbar toolbar) {
        this.f742a = toolbar;
    }

    @Override // androidx.appcompat.view.menu.l
    public boolean onMenuItemSelected(androidx.appcompat.view.menu.n nVar, MenuItem menuItem) {
        androidx.appcompat.view.menu.l lVar = this.f742a.mMenuBuilderCallback;
        return lVar != null && lVar.onMenuItemSelected(nVar, menuItem);
    }

    @Override // androidx.appcompat.view.menu.l
    public void onMenuModeChange(androidx.appcompat.view.menu.n nVar) {
        Toolbar toolbar = this.f742a;
        n nVar2 = toolbar.mMenuView.f618e;
        if (nVar2 == null || !nVar2.c()) {
            Iterator it = toolbar.mMenuHostHelper.f1383b.iterator();
            while (it.hasNext()) {
                ((androidx.fragment.app.a1) ((androidx.core.view.r) it.next())).f1865a.t(nVar);
            }
        }
        androidx.appcompat.view.menu.l lVar = toolbar.mMenuBuilderCallback;
        if (lVar != null) {
            lVar.onMenuModeChange(nVar);
        }
    }
}
