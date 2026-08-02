package r;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.view.AbstractC2077b;
import l0.AbstractC5338c;
import n0.AbstractC5597a;
import q0.InterfaceMenuItemC6088b;

/* renamed from: r.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6194a implements InterfaceMenuItemC6088b {

    /* renamed from: a, reason: collision with root package name */
    public final int f63701a;

    /* renamed from: b, reason: collision with root package name */
    public final int f63702b;

    /* renamed from: c, reason: collision with root package name */
    public final int f63703c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f63704d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f63705e;

    /* renamed from: f, reason: collision with root package name */
    public Intent f63706f;

    /* renamed from: g, reason: collision with root package name */
    public char f63707g;

    /* renamed from: i, reason: collision with root package name */
    public char f63709i;

    /* renamed from: k, reason: collision with root package name */
    public Drawable f63711k;

    /* renamed from: l, reason: collision with root package name */
    public Context f63712l;

    /* renamed from: m, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f63713m;

    /* renamed from: n, reason: collision with root package name */
    public CharSequence f63714n;

    /* renamed from: o, reason: collision with root package name */
    public CharSequence f63715o;

    /* renamed from: h, reason: collision with root package name */
    public int f63708h = 4096;

    /* renamed from: j, reason: collision with root package name */
    public int f63710j = 4096;

    /* renamed from: p, reason: collision with root package name */
    public ColorStateList f63716p = null;

    /* renamed from: q, reason: collision with root package name */
    public PorterDuff.Mode f63717q = null;

    /* renamed from: r, reason: collision with root package name */
    public boolean f63718r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f63719s = false;

    /* renamed from: t, reason: collision with root package name */
    public int f63720t = 16;

    public C6194a(Context context, int i10, int i11, int i12, int i13, CharSequence charSequence) {
        this.f63712l = context;
        this.f63701a = i11;
        this.f63702b = i10;
        this.f63703c = i13;
        this.f63704d = charSequence;
    }

    @Override // q0.InterfaceMenuItemC6088b
    public AbstractC2077b a() {
        return null;
    }

    @Override // q0.InterfaceMenuItemC6088b
    public InterfaceMenuItemC6088b b(AbstractC2077b abstractC2077b) {
        throw new UnsupportedOperationException();
    }

    public final void c() {
        Drawable drawable = this.f63711k;
        if (drawable != null) {
            if (this.f63718r || this.f63719s) {
                Drawable r10 = AbstractC5597a.r(drawable);
                this.f63711k = r10;
                Drawable mutate = r10.mutate();
                this.f63711k = mutate;
                if (this.f63718r) {
                    AbstractC5597a.o(mutate, this.f63716p);
                }
                if (this.f63719s) {
                    AbstractC5597a.p(this.f63711k, this.f63717q);
                }
            }
        }
    }

    @Override // q0.InterfaceMenuItemC6088b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // q0.InterfaceMenuItemC6088b, android.view.MenuItem
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC6088b setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // q0.InterfaceMenuItemC6088b, android.view.MenuItem
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC6088b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // q0.InterfaceMenuItemC6088b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // q0.InterfaceMenuItemC6088b, android.view.MenuItem
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC6088b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // q0.InterfaceMenuItemC6088b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // q0.InterfaceMenuItemC6088b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f63710j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f63709i;
    }

    @Override // q0.InterfaceMenuItemC6088b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f63714n;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f63702b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f63711k;
    }

    @Override // q0.InterfaceMenuItemC6088b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f63716p;
    }

    @Override // q0.InterfaceMenuItemC6088b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f63717q;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f63706f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f63701a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // q0.InterfaceMenuItemC6088b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f63708h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f63707g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f63703c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f63704d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f63705e;
        return charSequence != null ? charSequence : this.f63704d;
    }

    @Override // q0.InterfaceMenuItemC6088b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f63715o;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // q0.InterfaceMenuItemC6088b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f63720t & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f63720t & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f63720t & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f63720t & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f63709i = Character.toLowerCase(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        this.f63720t = (z10 ? 1 : 0) | (this.f63720t & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        this.f63720t = (z10 ? 2 : 0) | (this.f63720t & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f63720t = (z10 ? 16 : 0) | (this.f63720t & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f63711k = drawable;
        c();
        return this;
    }

    @Override // q0.InterfaceMenuItemC6088b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f63716p = colorStateList;
        this.f63718r = true;
        c();
        return this;
    }

    @Override // q0.InterfaceMenuItemC6088b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f63717q = mode;
        this.f63719s = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f63706f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f63707g = c10;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f63713m = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f63707g = c10;
        this.f63709i = Character.toLowerCase(c11);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f63704d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f63705e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        this.f63720t = (this.f63720t & 8) | (z10 ? 0 : 8);
        return this;
    }

    @Override // q0.InterfaceMenuItemC6088b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f63709i = Character.toLowerCase(c10);
        this.f63710j = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC6088b setContentDescription(CharSequence charSequence) {
        this.f63714n = charSequence;
        return this;
    }

    @Override // q0.InterfaceMenuItemC6088b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f63707g = c10;
        this.f63708h = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f63704d = this.f63712l.getResources().getString(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC6088b setTooltipText(CharSequence charSequence) {
        this.f63715o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f63711k = AbstractC5338c.getDrawable(this.f63712l, i10);
        c();
        return this;
    }

    @Override // q0.InterfaceMenuItemC6088b, android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f63707g = c10;
        this.f63708h = KeyEvent.normalizeMetaState(i10);
        this.f63709i = Character.toLowerCase(c11);
        this.f63710j = KeyEvent.normalizeMetaState(i11);
        return this;
    }

    @Override // q0.InterfaceMenuItemC6088b, android.view.MenuItem
    public void setShowAsAction(int i10) {
    }
}
