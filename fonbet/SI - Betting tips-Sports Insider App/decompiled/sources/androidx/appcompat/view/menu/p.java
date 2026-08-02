package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class p implements i0.a {
    public q A;
    public MenuItem.OnActionExpandListener B;
    public ContextMenu.ContextMenuInfo D;

    /* renamed from: a, reason: collision with root package name */
    public final int f517a;

    /* renamed from: b, reason: collision with root package name */
    public final int f518b;

    /* renamed from: c, reason: collision with root package name */
    public final int f519c;

    /* renamed from: d, reason: collision with root package name */
    public final int f520d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f521e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f522f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f523g;

    /* renamed from: h, reason: collision with root package name */
    public char f524h;
    public char j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f527l;

    /* renamed from: n, reason: collision with root package name */
    public final n f529n;

    /* renamed from: o, reason: collision with root package name */
    public f0 f530o;

    /* renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f531p;
    public CharSequence q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f532r;

    /* renamed from: y, reason: collision with root package name */
    public int f539y;

    /* renamed from: z, reason: collision with root package name */
    public View f540z;

    /* renamed from: i, reason: collision with root package name */
    public int f525i = 4096;

    /* renamed from: k, reason: collision with root package name */
    public int f526k = 4096;

    /* renamed from: m, reason: collision with root package name */
    public int f528m = 0;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f533s = null;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f534t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f535u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f536v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f537w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f538x = 16;
    public boolean C = false;

    public p(n nVar, int i5, int i10, int i11, int i12, CharSequence charSequence, int i13) {
        this.f529n = nVar;
        this.f517a = i10;
        this.f518b = i5;
        this.f519c = i11;
        this.f520d = i12;
        this.f521e = charSequence;
        this.f539y = i13;
    }

    public static void c(int i5, int i10, String str, StringBuilder sb2) {
        if ((i5 & i10) == i10) {
            sb2.append(str);
        }
    }

    @Override // i0.a
    public final q a() {
        return this.A;
    }

    @Override // i0.a
    public final i0.a b(q qVar) {
        this.f540z = null;
        this.A = qVar;
        this.f529n.onItemsChanged(true);
        q qVar2 = this.A;
        if (qVar2 != null) {
            qVar2.f541a = new h9.c(6, this);
            qVar2.f542b.setVisibilityListener(qVar2);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f539y & 8) == 0) {
            return false;
        }
        if (this.f540z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f529n.collapseItemActionView(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f537w && (this.f535u || this.f536v)) {
            drawable = drawable.mutate();
            if (this.f535u) {
                drawable.setTintList(this.f533s);
            }
            if (this.f536v) {
                drawable.setTintMode(this.f534t);
            }
            this.f537w = false;
        }
        return drawable;
    }

    public final boolean e() {
        q qVar;
        if ((this.f539y & 8) != 0) {
            if (this.f540z == null && (qVar = this.A) != null) {
                this.f540z = qVar.f542b.onCreateActionView(this);
            }
            if (this.f540z != null) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f529n.expandItemActionView(this);
        }
        return false;
    }

    public final void f(boolean z5) {
        this.f538x = (z5 ? 4 : 0) | (this.f538x & (-5));
    }

    public final void g(boolean z5) {
        if (z5) {
            this.f538x |= 32;
        } else {
            this.f538x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f540z;
        if (view != null) {
            return view;
        }
        q qVar = this.A;
        if (qVar == null) {
            return null;
        }
        View onCreateActionView = qVar.f542b.onCreateActionView(this);
        this.f540z = onCreateActionView;
        return onCreateActionView;
    }

    @Override // i0.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f526k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.j;
    }

    @Override // i0.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f518b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f527l;
        if (drawable != null) {
            return d(drawable);
        }
        if (this.f528m == 0) {
            return null;
        }
        Drawable n9 = h8.b.n(this.f529n.getContext(), this.f528m);
        this.f528m = 0;
        this.f527l = n9;
        return d(n9);
    }

    @Override // i0.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f533s;
    }

    @Override // i0.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f534t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f523g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f517a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.D;
    }

    @Override // i0.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f525i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f524h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f519c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f530o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f521e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f522f;
        return charSequence != null ? charSequence : this.f521e;
    }

    @Override // i0.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f532r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f530o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f538x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f538x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f538x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        q qVar = this.A;
        return (qVar == null || !qVar.f542b.overridesItemVisibility()) ? (this.f538x & 8) == 0 : (this.f538x & 8) == 0 && this.A.f542b.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i5;
        this.f540z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i5 = this.f517a) > 0) {
            view.setId(i5);
        }
        this.f529n.onItemActionRequestChanged(this);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2) {
        if (this.j == c2) {
            return this;
        }
        this.j = Character.toLowerCase(c2);
        this.f529n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z5) {
        int i5 = this.f538x;
        int i10 = (z5 ? 1 : 0) | (i5 & (-2));
        this.f538x = i10;
        if (i5 != i10) {
            this.f529n.onItemsChanged(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z5) {
        int i5 = this.f538x;
        int i10 = i5 & 4;
        n nVar = this.f529n;
        if (i10 != 0) {
            nVar.setExclusiveItemChecked(this);
            return this;
        }
        int i11 = (z5 ? 2 : 0) | (i5 & (-3));
        this.f538x = i11;
        if (i5 != i11) {
            nVar.onItemsChanged(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z5) {
        if (z5) {
            this.f538x |= 16;
        } else {
            this.f538x &= -17;
        }
        this.f529n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f528m = 0;
        this.f527l = drawable;
        this.f537w = true;
        this.f529n.onItemsChanged(false);
        return this;
    }

    @Override // i0.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f533s = colorStateList;
        this.f535u = true;
        this.f537w = true;
        this.f529n.onItemsChanged(false);
        return this;
    }

    @Override // i0.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f534t = mode;
        this.f536v = true;
        this.f537w = true;
        this.f529n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f523g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2) {
        if (this.f524h == c2) {
            return this;
        }
        this.f524h = c2;
        this.f529n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f531p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c8) {
        this.f524h = c2;
        this.j = Character.toLowerCase(c8);
        this.f529n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i5) {
        int i10 = i5 & 3;
        if (i10 != 0 && i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f539y = i5;
        this.f529n.onItemActionRequestChanged(this);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i5) {
        setShowAsAction(i5);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f521e = charSequence;
        this.f529n.onItemsChanged(false);
        f0 f0Var = this.f530o;
        if (f0Var != null) {
            f0Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f522f = charSequence;
        this.f529n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z5) {
        int i5 = this.f538x;
        int i10 = (z5 ? 0 : 8) | (i5 & (-9));
        this.f538x = i10;
        if (i5 != i10) {
            this.f529n.onItemVisibleChanged(this);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f521e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // i0.a, android.view.MenuItem
    public final i0.a setContentDescription(CharSequence charSequence) {
        this.q = charSequence;
        this.f529n.onItemsChanged(false);
        return this;
    }

    @Override // i0.a, android.view.MenuItem
    public final i0.a setTooltipText(CharSequence charSequence) {
        this.f532r = charSequence;
        this.f529n.onItemsChanged(false);
        return this;
    }

    @Override // i0.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2, int i5) {
        if (this.j == c2 && this.f526k == i5) {
            return this;
        }
        this.j = Character.toLowerCase(c2);
        this.f526k = KeyEvent.normalizeMetaState(i5);
        this.f529n.onItemsChanged(false);
        return this;
    }

    @Override // i0.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2, int i5) {
        if (this.f524h == c2 && this.f525i == i5) {
            return this;
        }
        this.f524h = c2;
        this.f525i = KeyEvent.normalizeMetaState(i5);
        this.f529n.onItemsChanged(false);
        return this;
    }

    @Override // i0.a, android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c8, int i5, int i10) {
        this.f524h = c2;
        this.f525i = KeyEvent.normalizeMetaState(i5);
        this.j = Character.toLowerCase(c8);
        this.f526k = KeyEvent.normalizeMetaState(i10);
        this.f529n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i5) {
        this.f527l = null;
        this.f528m = i5;
        this.f537w = true;
        this.f529n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i5) {
        setTitle(this.f529n.getContext().getString(i5));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i5) {
        int i10;
        n nVar = this.f529n;
        Context context = nVar.getContext();
        View inflate = LayoutInflater.from(context).inflate(i5, (ViewGroup) new LinearLayout(context), false);
        this.f540z = inflate;
        this.A = null;
        if (inflate != null && inflate.getId() == -1 && (i10 = this.f517a) > 0) {
            inflate.setId(i10);
        }
        nVar.onItemActionRequestChanged(this);
        return this;
    }
}
