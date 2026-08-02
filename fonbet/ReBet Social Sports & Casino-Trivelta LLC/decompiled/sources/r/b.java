package r;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import q0.InterfaceMenuItemC6088b;
import z.r;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f63721a;

    /* renamed from: b, reason: collision with root package name */
    public r f63722b;

    /* renamed from: c, reason: collision with root package name */
    public r f63723c;

    public b(Context context) {
        this.f63721a = context;
    }

    public final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof InterfaceMenuItemC6088b)) {
            return menuItem;
        }
        InterfaceMenuItemC6088b interfaceMenuItemC6088b = (InterfaceMenuItemC6088b) menuItem;
        if (this.f63722b == null) {
            this.f63722b = new r();
        }
        MenuItem menuItem2 = (MenuItem) this.f63722b.get(interfaceMenuItemC6088b);
        if (menuItem2 != null) {
            return menuItem2;
        }
        c cVar = new c(this.f63721a, interfaceMenuItemC6088b);
        this.f63722b.put(interfaceMenuItemC6088b, cVar);
        return cVar;
    }

    public final void e() {
        r rVar = this.f63722b;
        if (rVar != null) {
            rVar.clear();
        }
        r rVar2 = this.f63723c;
        if (rVar2 != null) {
            rVar2.clear();
        }
    }

    public final void f(int i10) {
        if (this.f63722b == null) {
            return;
        }
        int i11 = 0;
        while (i11 < this.f63722b.size()) {
            if (((InterfaceMenuItemC6088b) this.f63722b.f(i11)).getGroupId() == i10) {
                this.f63722b.h(i11);
                i11--;
            }
            i11++;
        }
    }

    public final void g(int i10) {
        if (this.f63722b == null) {
            return;
        }
        for (int i11 = 0; i11 < this.f63722b.size(); i11++) {
            if (((InterfaceMenuItemC6088b) this.f63722b.f(i11)).getItemId() == i10) {
                this.f63722b.h(i11);
                return;
            }
        }
    }

    public final SubMenu d(SubMenu subMenu) {
        return subMenu;
    }
}
