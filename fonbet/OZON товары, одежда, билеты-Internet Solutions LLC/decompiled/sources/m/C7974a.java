package m;

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
import androidx.annotation.NonNull;
import androidx.core.view.AbstractC5307b;
import s2.InterfaceMenuItemC9585b;

/* renamed from: m.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C7974a implements InterfaceMenuItemC9585b {

    /* renamed from: a, reason: collision with root package name */
    private CharSequence f73448a;

    /* renamed from: b, reason: collision with root package name */
    private CharSequence f73449b;

    /* renamed from: c, reason: collision with root package name */
    private Intent f73450c;

    /* renamed from: d, reason: collision with root package name */
    private char f73451d;

    /* renamed from: f, reason: collision with root package name */
    private char f73453f;

    /* renamed from: h, reason: collision with root package name */
    private Drawable f73455h;

    /* renamed from: i, reason: collision with root package name */
    private Context f73456i;

    /* renamed from: j, reason: collision with root package name */
    private CharSequence f73457j;

    /* renamed from: k, reason: collision with root package name */
    private CharSequence f73458k;

    /* renamed from: e, reason: collision with root package name */
    private int f73452e = 4096;

    /* renamed from: g, reason: collision with root package name */
    private int f73454g = 4096;

    /* renamed from: l, reason: collision with root package name */
    private ColorStateList f73459l = null;

    /* renamed from: m, reason: collision with root package name */
    private PorterDuff.Mode f73460m = null;

    /* renamed from: n, reason: collision with root package name */
    private boolean f73461n = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f73462o = false;

    /* renamed from: p, reason: collision with root package name */
    private int f73463p = 16;

    public C7974a(Context context, CharSequence charSequence) {
        this.f73456i = context;
        this.f73448a = charSequence;
    }

    private void c() {
        Drawable drawable = this.f73455h;
        if (drawable != null) {
            if (this.f73461n || this.f73462o) {
                this.f73455h = drawable;
                Drawable mutate = drawable.mutate();
                this.f73455h = mutate;
                if (this.f73461n) {
                    androidx.core.graphics.drawable.a.j(mutate, this.f73459l);
                }
                if (this.f73462o) {
                    androidx.core.graphics.drawable.a.k(this.f73455h, this.f73460m);
                }
            }
        }
    }

    @Override // s2.InterfaceMenuItemC9585b
    public final AbstractC5307b a() {
        return null;
    }

    @Override // s2.InterfaceMenuItemC9585b
    @NonNull
    public final InterfaceMenuItemC9585b b(AbstractC5307b abstractC5307b) {
        throw new UnsupportedOperationException();
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

    @Override // s2.InterfaceMenuItemC9585b, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f73454g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f73453f;
    }

    @Override // s2.InterfaceMenuItemC9585b, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f73457j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f73455h;
    }

    @Override // s2.InterfaceMenuItemC9585b, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f73459l;
    }

    @Override // s2.InterfaceMenuItemC9585b, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f73460m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f73450c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // s2.InterfaceMenuItemC9585b, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f73452e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f73451d;
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
        return this.f73448a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f73449b;
        return charSequence != null ? charSequence : this.f73448a;
    }

    @Override // s2.InterfaceMenuItemC9585b, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f73458k;
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
        return (this.f73463p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f73463p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f73463p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f73463p & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    @NonNull
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c11) {
        this.f73453f = Character.toLowerCase(c11);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z11) {
        this.f73463p = (z11 ? 1 : 0) | (this.f73463p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z11) {
        this.f73463p = (z11 ? 2 : 0) | (this.f73463p & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    @NonNull
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f73457j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z11) {
        this.f73463p = (z11 ? 16 : 0) | (this.f73463p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f73455h = drawable;
        c();
        return this;
    }

    @Override // s2.InterfaceMenuItemC9585b, android.view.MenuItem
    @NonNull
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f73459l = colorStateList;
        this.f73461n = true;
        c();
        return this;
    }

    @Override // s2.InterfaceMenuItemC9585b, android.view.MenuItem
    @NonNull
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f73460m = mode;
        this.f73462o = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f73450c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c11) {
        this.f73451d = c11;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c11, char c12) {
        this.f73451d = c11;
        this.f73453f = Character.toLowerCase(c12);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i11) {
    }

    @Override // android.view.MenuItem
    @NonNull
    public final MenuItem setShowAsActionFlags(int i11) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f73448a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f73449b = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    @NonNull
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f73458k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z11) {
        this.f73463p = (this.f73463p & 8) | (z11 ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    @NonNull
    public final MenuItem setActionView(int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // s2.InterfaceMenuItemC9585b, android.view.MenuItem
    @NonNull
    public final MenuItem setAlphabeticShortcut(char c11, int i11) {
        this.f73453f = Character.toLowerCase(c11);
        this.f73454g = KeyEvent.normalizeMetaState(i11);
        return this;
    }

    @Override // s2.InterfaceMenuItemC9585b, android.view.MenuItem
    @NonNull
    public final InterfaceMenuItemC9585b setContentDescription(CharSequence charSequence) {
        this.f73457j = charSequence;
        return this;
    }

    @Override // s2.InterfaceMenuItemC9585b, android.view.MenuItem
    @NonNull
    public final MenuItem setNumericShortcut(char c11, int i11) {
        this.f73451d = c11;
        this.f73452e = KeyEvent.normalizeMetaState(i11);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i11) {
        this.f73448a = this.f73456i.getResources().getString(i11);
        return this;
    }

    @Override // s2.InterfaceMenuItemC9585b, android.view.MenuItem
    @NonNull
    public final InterfaceMenuItemC9585b setTooltipText(CharSequence charSequence) {
        this.f73458k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i11) {
        this.f73455h = androidx.core.content.a.getDrawable(this.f73456i, i11);
        c();
        return this;
    }

    @Override // s2.InterfaceMenuItemC9585b, android.view.MenuItem
    @NonNull
    public final MenuItem setShortcut(char c11, char c12, int i11, int i12) {
        this.f73451d = c11;
        this.f73452e = KeyEvent.normalizeMetaState(i11);
        this.f73453f = Character.toLowerCase(c12);
        this.f73454g = KeyEvent.normalizeMetaState(i12);
        return this;
    }
}
