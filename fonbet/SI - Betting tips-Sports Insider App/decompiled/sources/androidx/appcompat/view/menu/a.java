package androidx.appcompat.view.menu;

import android.R;
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

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a implements i0.a {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f431a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f432b;

    /* renamed from: c, reason: collision with root package name */
    public Intent f433c;

    /* renamed from: d, reason: collision with root package name */
    public char f434d;

    /* renamed from: e, reason: collision with root package name */
    public int f435e;

    /* renamed from: f, reason: collision with root package name */
    public char f436f;

    /* renamed from: g, reason: collision with root package name */
    public int f437g;

    /* renamed from: h, reason: collision with root package name */
    public Drawable f438h;

    /* renamed from: i, reason: collision with root package name */
    public Context f439i;
    public CharSequence j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f440k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f441l;

    /* renamed from: m, reason: collision with root package name */
    public PorterDuff.Mode f442m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f443n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f444o;

    /* renamed from: p, reason: collision with root package name */
    public int f445p;

    @Override // i0.a
    public final q a() {
        return null;
    }

    @Override // i0.a
    public final i0.a b(q qVar) {
        throw new UnsupportedOperationException();
    }

    public final void c() {
        Drawable drawable = this.f438h;
        if (drawable != null) {
            if (this.f443n || this.f444o) {
                this.f438h = drawable;
                Drawable mutate = drawable.mutate();
                this.f438h = mutate;
                if (this.f443n) {
                    mutate.setTintList(this.f441l);
                }
                if (this.f444o) {
                    this.f438h.setTintMode(this.f442m);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // i0.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f437g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f436f;
    }

    @Override // i0.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f438h;
    }

    @Override // i0.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f441l;
    }

    @Override // i0.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f442m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f433c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // i0.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f435e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f434d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f431a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f432b;
        return charSequence != null ? charSequence : this.f431a;
    }

    @Override // i0.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f440k;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f445p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f445p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f445p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f445p & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2) {
        this.f436f = Character.toLowerCase(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z5) {
        this.f445p = (z5 ? 1 : 0) | (this.f445p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z5) {
        this.f445p = (z5 ? 2 : 0) | (this.f445p & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z5) {
        this.f445p = (z5 ? 16 : 0) | (this.f445p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f438h = drawable;
        c();
        return this;
    }

    @Override // i0.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f441l = colorStateList;
        this.f443n = true;
        c();
        return this;
    }

    @Override // i0.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f442m = mode;
        this.f444o = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f433c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2) {
        this.f434d = c2;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c8) {
        this.f434d = c2;
        this.f436f = Character.toLowerCase(c8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f431a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f432b = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f440k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z5) {
        this.f445p = (this.f445p & 8) | (z5 ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i5) {
        throw new UnsupportedOperationException();
    }

    @Override // i0.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2, int i5) {
        this.f436f = Character.toLowerCase(c2);
        this.f437g = KeyEvent.normalizeMetaState(i5);
        return this;
    }

    @Override // i0.a, android.view.MenuItem
    public final i0.a setContentDescription(CharSequence charSequence) {
        this.j = charSequence;
        return this;
    }

    @Override // i0.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2, int i5) {
        this.f434d = c2;
        this.f435e = KeyEvent.normalizeMetaState(i5);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i5) {
        this.f431a = this.f439i.getResources().getString(i5);
        return this;
    }

    @Override // i0.a, android.view.MenuItem
    public final i0.a setTooltipText(CharSequence charSequence) {
        this.f440k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i5) {
        this.f438h = this.f439i.getDrawable(i5);
        c();
        return this;
    }

    @Override // i0.a, android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c8, int i5, int i10) {
        this.f434d = c2;
        this.f435e = KeyEvent.normalizeMetaState(i5);
        this.f436f = Character.toLowerCase(c8);
        this.f437g = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i5) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i5) {
        return this;
    }
}
