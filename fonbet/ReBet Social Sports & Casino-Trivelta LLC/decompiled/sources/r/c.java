package r;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.AbstractC2077b;
import java.lang.reflect.Method;
import q0.InterfaceMenuItemC6088b;

/* loaded from: classes.dex */
public class c extends r.b implements MenuItem {

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceMenuItemC6088b f63724d;

    /* renamed from: e, reason: collision with root package name */
    public Method f63725e;

    public class a extends AbstractC2077b implements ActionProvider.VisibilityListener {

        /* renamed from: d, reason: collision with root package name */
        public AbstractC2077b.InterfaceC0363b f63726d;

        /* renamed from: e, reason: collision with root package name */
        public final ActionProvider f63727e;

        public a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f63727e = actionProvider;
        }

        @Override // androidx.core.view.AbstractC2077b
        public boolean a() {
            return this.f63727e.hasSubMenu();
        }

        @Override // androidx.core.view.AbstractC2077b
        public boolean b() {
            return this.f63727e.isVisible();
        }

        @Override // androidx.core.view.AbstractC2077b
        public View c(MenuItem menuItem) {
            return this.f63727e.onCreateActionView(menuItem);
        }

        @Override // androidx.core.view.AbstractC2077b
        public boolean d() {
            return this.f63727e.onPerformDefaultAction();
        }

        @Override // androidx.core.view.AbstractC2077b
        public void e(SubMenu subMenu) {
            this.f63727e.onPrepareSubMenu(c.this.d(subMenu));
        }

        @Override // androidx.core.view.AbstractC2077b
        public boolean f() {
            return this.f63727e.overridesItemVisibility();
        }

        @Override // androidx.core.view.AbstractC2077b
        public void i(AbstractC2077b.InterfaceC0363b interfaceC0363b) {
            this.f63726d = interfaceC0363b;
            this.f63727e.setVisibilityListener(interfaceC0363b != null ? this : null);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z10) {
            AbstractC2077b.InterfaceC0363b interfaceC0363b = this.f63726d;
            if (interfaceC0363b != null) {
                interfaceC0363b.onActionProviderVisibilityChanged(z10);
            }
        }
    }

    public static class b extends FrameLayout implements androidx.appcompat.view.c {

        /* renamed from: a, reason: collision with root package name */
        public final CollapsibleActionView f63729a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(View view) {
            super(view.getContext());
            this.f63729a = (CollapsibleActionView) view;
            addView(view);
        }

        public View a() {
            return (View) this.f63729a;
        }

        @Override // androidx.appcompat.view.c
        public void onActionViewCollapsed() {
            this.f63729a.onActionViewCollapsed();
        }

        @Override // androidx.appcompat.view.c
        public void onActionViewExpanded() {
            this.f63729a.onActionViewExpanded();
        }
    }

    /* renamed from: r.c$c, reason: collision with other inner class name */
    public class MenuItemOnActionExpandListenerC0885c implements MenuItem.OnActionExpandListener {

        /* renamed from: a, reason: collision with root package name */
        public final MenuItem.OnActionExpandListener f63730a;

        public MenuItemOnActionExpandListenerC0885c(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f63730a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f63730a.onMenuItemActionCollapse(c.this.c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f63730a.onMenuItemActionExpand(c.this.c(menuItem));
        }
    }

    public class d implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final MenuItem.OnMenuItemClickListener f63732a;

        public d(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f63732a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f63732a.onMenuItemClick(c.this.c(menuItem));
        }
    }

    public c(Context context, InterfaceMenuItemC6088b interfaceMenuItemC6088b) {
        super(context);
        if (interfaceMenuItemC6088b == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f63724d = interfaceMenuItemC6088b;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f63724d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f63724d.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        AbstractC2077b a10 = this.f63724d.a();
        if (a10 instanceof a) {
            return ((a) a10).f63727e;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f63724d.getActionView();
        return actionView instanceof b ? ((b) actionView).a() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f63724d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f63724d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f63724d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f63724d.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f63724d.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f63724d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f63724d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f63724d.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f63724d.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f63724d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f63724d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f63724d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f63724d.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return d(this.f63724d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f63724d.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f63724d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f63724d.getTooltipText();
    }

    public void h(boolean z10) {
        try {
            if (this.f63725e == null) {
                this.f63725e = this.f63724d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f63725e.invoke(this.f63724d, Boolean.valueOf(z10));
        } catch (Exception e10) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e10);
        }
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f63724d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f63724d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f63724d.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f63724d.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f63724d.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f63724d.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        a aVar = new a(this.f63721a, actionProvider);
        InterfaceMenuItemC6088b interfaceMenuItemC6088b = this.f63724d;
        if (actionProvider == null) {
            aVar = null;
        }
        interfaceMenuItemC6088b.b(aVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new b(view);
        }
        this.f63724d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f63724d.setAlphabeticShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        this.f63724d.setCheckable(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        this.f63724d.setChecked(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f63724d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f63724d.setEnabled(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f63724d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f63724d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f63724d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f63724d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f63724d.setNumericShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f63724d.setOnActionExpandListener(onActionExpandListener != null ? new MenuItemOnActionExpandListenerC0885c(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f63724d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new d(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f63724d.setShortcut(c10, c11);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i10) {
        this.f63724d.setShowAsAction(i10);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i10) {
        this.f63724d.setShowAsActionFlags(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f63724d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f63724d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f63724d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        return this.f63724d.setVisible(z10);
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f63724d.setAlphabeticShortcut(c10, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f63724d.setIcon(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f63724d.setNumericShortcut(c10, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f63724d.setShortcut(c10, c11, i10, i11);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f63724d.setTitle(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i10) {
        this.f63724d.setActionView(i10);
        View actionView = this.f63724d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f63724d.setActionView(new b(actionView));
        }
        return this;
    }
}
