package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.e;

/* loaded from: classes.dex */
public class l extends e implements SubMenu {

    /* renamed from: A, reason: collision with root package name */
    public e f16798A;

    /* renamed from: B, reason: collision with root package name */
    public g f16799B;

    public l(Context context, e eVar, g gVar) {
        super(context);
        this.f16798A = eVar;
        this.f16799B = gVar;
    }

    @Override // androidx.appcompat.view.menu.e
    public e F() {
        return this.f16798A.F();
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean I() {
        return this.f16798A.I();
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean J() {
        return this.f16798A.J();
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean K() {
        return this.f16798A.K();
    }

    @Override // androidx.appcompat.view.menu.e
    public void W(e.a aVar) {
        this.f16798A.W(aVar);
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean f(g gVar) {
        return this.f16798A.f(gVar);
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.f16799B;
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean h(e eVar, MenuItem menuItem) {
        return super.h(eVar, menuItem) || this.f16798A.h(eVar, menuItem);
    }

    public Menu j0() {
        return this.f16798A;
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean m(g gVar) {
        return this.f16798A.m(gVar);
    }

    @Override // androidx.appcompat.view.menu.e, android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.f16798A.setGroupDividerEnabled(z10);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.a0(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.d0(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.e0(view);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f16799B.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.e, android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f16798A.setQwertyMode(z10);
    }

    @Override // androidx.appcompat.view.menu.e
    public String v() {
        g gVar = this.f16799B;
        int itemId = gVar != null ? gVar.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.v() + ":" + itemId;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i10) {
        return (SubMenu) super.Z(i10);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i10) {
        return (SubMenu) super.c0(i10);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i10) {
        this.f16799B.setIcon(i10);
        return this;
    }
}
