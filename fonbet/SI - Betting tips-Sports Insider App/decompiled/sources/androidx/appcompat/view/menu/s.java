package androidx.appcompat.view.menu;

import android.view.MenuItem;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class s implements MenuItem.OnActionExpandListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f544a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f545b;

    public s(u uVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f545b = uVar;
        this.f544a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f544a.onMenuItemActionCollapse(this.f545b.f(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f544a.onMenuItemActionExpand(this.f545b.f(menuItem));
    }
}
