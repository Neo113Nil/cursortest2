package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class sji extends vec implements SubMenu {
    public final efc A;
    public final vec z;

    public sji(Context context, vec vecVar, efc efcVar) {
        super(context);
        this.z = vecVar;
        this.A = efcVar;
    }

    @Override // defpackage.vec
    public final boolean d(efc efcVar) {
        return this.z.d(efcVar);
    }

    @Override // defpackage.vec
    public final boolean e(vec vecVar, MenuItem menuItem) {
        return super.e(vecVar, menuItem) || this.z.e(vecVar, menuItem);
    }

    @Override // defpackage.vec
    public final boolean f(efc efcVar) {
        return this.z.f(efcVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // defpackage.vec
    public final String j() {
        int i = this.A.a;
        if (i == 0) {
            return null;
        }
        return ljg.j(i, "android:menu:actionviewstates:");
    }

    @Override // defpackage.vec
    public final vec k() {
        return this.z.k();
    }

    @Override // defpackage.vec
    public final boolean m() {
        return this.z.m();
    }

    @Override // defpackage.vec
    public final boolean n() {
        return this.z.n();
    }

    @Override // defpackage.vec
    public final boolean o() {
        return this.z.o();
    }

    @Override // defpackage.vec, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.z.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }

    @Override // defpackage.vec, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.z.setQwertyMode(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.A.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        u(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        u(i, null, 0, null, null);
        return this;
    }
}
