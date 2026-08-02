package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class f0 extends n implements SubMenu {
    private p mItem;
    private n mParentMenu;

    public f0(Context context, n nVar, p pVar) {
        super(context);
        this.mParentMenu = nVar;
        this.mItem = pVar;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean collapseItemActionView(p pVar) {
        return this.mParentMenu.collapseItemActionView(pVar);
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean dispatchMenuItemSelected(@NonNull n nVar, @NonNull MenuItem menuItem) {
        return super.dispatchMenuItemSelected(nVar, menuItem) || this.mParentMenu.dispatchMenuItemSelected(nVar, menuItem);
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean expandItemActionView(p pVar) {
        return this.mParentMenu.expandItemActionView(pVar);
    }

    @Override // androidx.appcompat.view.menu.n
    public String getActionViewStatesKey() {
        p pVar = this.mItem;
        int i5 = pVar != null ? pVar.f517a : 0;
        if (i5 == 0) {
            return null;
        }
        return super.getActionViewStatesKey() + StringUtils.PROCESS_POSTFIX_DELIMITER + i5;
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.mItem;
    }

    public Menu getParentMenu() {
        return this.mParentMenu;
    }

    @Override // androidx.appcompat.view.menu.n
    public n getRootMenu() {
        return this.mParentMenu.getRootMenu();
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean isGroupDividerEnabled() {
        return this.mParentMenu.isGroupDividerEnabled();
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean isQwertyMode() {
        return this.mParentMenu.isQwertyMode();
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean isShortcutsVisible() {
        return this.mParentMenu.isShortcutsVisible();
    }

    @Override // androidx.appcompat.view.menu.n
    public void setCallback(l lVar) {
        this.mParentMenu.setCallback(lVar);
    }

    @Override // androidx.appcompat.view.menu.n, android.view.Menu
    public void setGroupDividerEnabled(boolean z5) {
        this.mParentMenu.setGroupDividerEnabled(z5);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.setHeaderIconInt(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.setHeaderTitleInt(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.setHeaderViewInt(view);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.mItem.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.n, android.view.Menu
    public void setQwertyMode(boolean z5) {
        this.mParentMenu.setQwertyMode(z5);
    }

    @Override // androidx.appcompat.view.menu.n
    public void setShortcutsVisible(boolean z5) {
        this.mParentMenu.setShortcutsVisible(z5);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i5) {
        return (SubMenu) super.setHeaderIconInt(i5);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i5) {
        return (SubMenu) super.setHeaderTitleInt(i5);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i5) {
        this.mItem.setIcon(i5);
        return this;
    }
}
