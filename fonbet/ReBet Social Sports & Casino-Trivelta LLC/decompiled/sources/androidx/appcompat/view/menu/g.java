package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.j;
import androidx.core.view.AbstractC2077b;
import n.AbstractC5596a;
import n0.AbstractC5597a;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import q0.InterfaceMenuItemC6088b;

/* loaded from: classes.dex */
public final class g implements InterfaceMenuItemC6088b {

    /* renamed from: A, reason: collision with root package name */
    public View f16730A;

    /* renamed from: B, reason: collision with root package name */
    public AbstractC2077b f16731B;

    /* renamed from: C, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f16732C;

    /* renamed from: E, reason: collision with root package name */
    public ContextMenu.ContextMenuInfo f16734E;

    /* renamed from: a, reason: collision with root package name */
    public final int f16735a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16736b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16737c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16738d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f16739e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f16740f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f16741g;

    /* renamed from: h, reason: collision with root package name */
    public char f16742h;

    /* renamed from: j, reason: collision with root package name */
    public char f16744j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f16746l;

    /* renamed from: n, reason: collision with root package name */
    public e f16748n;

    /* renamed from: o, reason: collision with root package name */
    public l f16749o;

    /* renamed from: p, reason: collision with root package name */
    public Runnable f16750p;

    /* renamed from: q, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f16751q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f16752r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f16753s;

    /* renamed from: z, reason: collision with root package name */
    public int f16760z;

    /* renamed from: i, reason: collision with root package name */
    public int f16743i = 4096;

    /* renamed from: k, reason: collision with root package name */
    public int f16745k = 4096;

    /* renamed from: m, reason: collision with root package name */
    public int f16747m = 0;

    /* renamed from: t, reason: collision with root package name */
    public ColorStateList f16754t = null;

    /* renamed from: u, reason: collision with root package name */
    public PorterDuff.Mode f16755u = null;

    /* renamed from: v, reason: collision with root package name */
    public boolean f16756v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f16757w = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f16758x = false;

    /* renamed from: y, reason: collision with root package name */
    public int f16759y = 16;

    /* renamed from: D, reason: collision with root package name */
    public boolean f16733D = false;

    public class a implements AbstractC2077b.InterfaceC0363b {
        public a() {
        }

        @Override // androidx.core.view.AbstractC2077b.InterfaceC0363b
        public void onActionProviderVisibilityChanged(boolean z10) {
            g gVar = g.this;
            gVar.f16748n.M(gVar);
        }
    }

    public g(e eVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f16748n = eVar;
        this.f16735a = i11;
        this.f16736b = i10;
        this.f16737c = i12;
        this.f16738d = i13;
        this.f16739e = charSequence;
        this.f16760z = i14;
    }

    public static void d(StringBuilder sb2, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    public boolean A() {
        return this.f16748n.K() && g() != 0;
    }

    public boolean B() {
        return (this.f16760z & 4) == 4;
    }

    @Override // q0.InterfaceMenuItemC6088b
    public AbstractC2077b a() {
        return this.f16731B;
    }

    @Override // q0.InterfaceMenuItemC6088b
    public InterfaceMenuItemC6088b b(AbstractC2077b abstractC2077b) {
        AbstractC2077b abstractC2077b2 = this.f16731B;
        if (abstractC2077b2 != null) {
            abstractC2077b2.g();
        }
        this.f16730A = null;
        this.f16731B = abstractC2077b;
        this.f16748n.N(true);
        AbstractC2077b abstractC2077b3 = this.f16731B;
        if (abstractC2077b3 != null) {
            abstractC2077b3.i(new a());
        }
        return this;
    }

    public void c() {
        this.f16748n.L(this);
    }

    @Override // q0.InterfaceMenuItemC6088b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f16760z & 8) == 0) {
            return false;
        }
        if (this.f16730A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f16732C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f16748n.f(this);
        }
        return false;
    }

    public final Drawable e(Drawable drawable) {
        if (drawable != null && this.f16758x && (this.f16756v || this.f16757w)) {
            drawable = AbstractC5597a.r(drawable).mutate();
            if (this.f16756v) {
                AbstractC5597a.o(drawable, this.f16754t);
            }
            if (this.f16757w) {
                AbstractC5597a.p(drawable, this.f16755u);
            }
            this.f16758x = false;
        }
        return drawable;
    }

    @Override // q0.InterfaceMenuItemC6088b, android.view.MenuItem
    public boolean expandActionView() {
        if (!j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f16732C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f16748n.m(this);
        }
        return false;
    }

    public int f() {
        return this.f16738d;
    }

    public char g() {
        return this.f16748n.J() ? this.f16744j : this.f16742h;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // q0.InterfaceMenuItemC6088b, android.view.MenuItem
    public View getActionView() {
        View view = this.f16730A;
        if (view != null) {
            return view;
        }
        AbstractC2077b abstractC2077b = this.f16731B;
        if (abstractC2077b == null) {
            return null;
        }
        View c10 = abstractC2077b.c(this);
        this.f16730A = c10;
        return c10;
    }

    @Override // q0.InterfaceMenuItemC6088b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f16745k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f16744j;
    }

    @Override // q0.InterfaceMenuItemC6088b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f16752r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f16736b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f16746l;
        if (drawable != null) {
            return e(drawable);
        }
        if (this.f16747m == 0) {
            return null;
        }
        Drawable b10 = AbstractC5596a.b(this.f16748n.w(), this.f16747m);
        this.f16747m = 0;
        this.f16746l = b10;
        return e(b10);
    }

    @Override // q0.InterfaceMenuItemC6088b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f16754t;
    }

    @Override // q0.InterfaceMenuItemC6088b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f16755u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f16741g;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f16735a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f16734E;
    }

    @Override // q0.InterfaceMenuItemC6088b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f16743i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f16742h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f16737c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f16749o;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f16739e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f16740f;
        return charSequence != null ? charSequence : this.f16739e;
    }

    @Override // q0.InterfaceMenuItemC6088b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f16753s;
    }

    public String h() {
        char g10 = g();
        if (g10 == 0) {
            return "";
        }
        Resources resources = this.f16748n.w().getResources();
        StringBuilder sb2 = new StringBuilder();
        if (ViewConfiguration.get(this.f16748n.w()).hasPermanentMenuKey()) {
            sb2.append(resources.getString(l.h.f55154m));
        }
        int i10 = this.f16748n.J() ? this.f16745k : this.f16743i;
        d(sb2, i10, PKIFailureInfo.notAuthorized, resources.getString(l.h.f55150i));
        d(sb2, i10, 4096, resources.getString(l.h.f55146e));
        d(sb2, i10, 2, resources.getString(l.h.f55145d));
        d(sb2, i10, 1, resources.getString(l.h.f55151j));
        d(sb2, i10, 4, resources.getString(l.h.f55153l));
        d(sb2, i10, 8, resources.getString(l.h.f55149h));
        if (g10 == '\b') {
            sb2.append(resources.getString(l.h.f55147f));
        } else if (g10 == '\n') {
            sb2.append(resources.getString(l.h.f55148g));
        } else if (g10 != ' ') {
            sb2.append(g10);
        } else {
            sb2.append(resources.getString(l.h.f55152k));
        }
        return sb2.toString();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f16749o != null;
    }

    public CharSequence i(j.a aVar) {
        return (aVar == null || !aVar.d()) ? getTitle() : getTitleCondensed();
    }

    @Override // q0.InterfaceMenuItemC6088b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f16733D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f16759y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f16759y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f16759y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        AbstractC2077b abstractC2077b = this.f16731B;
        return (abstractC2077b == null || !abstractC2077b.f()) ? (this.f16759y & 8) == 0 : (this.f16759y & 8) == 0 && this.f16731B.b();
    }

    public boolean j() {
        AbstractC2077b abstractC2077b;
        if ((this.f16760z & 8) != 0) {
            if (this.f16730A == null && (abstractC2077b = this.f16731B) != null) {
                this.f16730A = abstractC2077b.c(this);
            }
            if (this.f16730A != null) {
                return true;
            }
        }
        return false;
    }

    public boolean k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f16751q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        e eVar = this.f16748n;
        if (eVar.h(eVar, this)) {
            return true;
        }
        Runnable runnable = this.f16750p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f16741g != null) {
            try {
                this.f16748n.w().startActivity(this.f16741g);
                return true;
            } catch (ActivityNotFoundException e10) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e10);
            }
        }
        AbstractC2077b abstractC2077b = this.f16731B;
        return abstractC2077b != null && abstractC2077b.d();
    }

    public boolean l() {
        return (this.f16759y & 32) == 32;
    }

    public boolean m() {
        return (this.f16759y & 4) != 0;
    }

    public boolean n() {
        return (this.f16760z & 1) == 1;
    }

    public boolean o() {
        return (this.f16760z & 2) == 2;
    }

    @Override // q0.InterfaceMenuItemC6088b, android.view.MenuItem
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC6088b setActionView(int i10) {
        Context w10 = this.f16748n.w();
        setActionView(LayoutInflater.from(w10).inflate(i10, (ViewGroup) new LinearLayout(w10), false));
        return this;
    }

    @Override // q0.InterfaceMenuItemC6088b, android.view.MenuItem
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC6088b setActionView(View view) {
        int i10;
        this.f16730A = view;
        this.f16731B = null;
        if (view != null && view.getId() == -1 && (i10 = this.f16735a) > 0) {
            view.setId(i10);
        }
        this.f16748n.L(this);
        return this;
    }

    public void r(boolean z10) {
        this.f16733D = z10;
        this.f16748n.N(false);
    }

    public void s(boolean z10) {
        int i10 = this.f16759y;
        int i11 = (z10 ? 2 : 0) | (i10 & (-3));
        this.f16759y = i11;
        if (i10 != i11) {
            this.f16748n.N(false);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        if (this.f16744j == c10) {
            return this;
        }
        this.f16744j = Character.toLowerCase(c10);
        this.f16748n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        int i10 = this.f16759y;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.f16759y = i11;
        if (i10 != i11) {
            this.f16748n.N(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        if ((this.f16759y & 4) != 0) {
            this.f16748n.Y(this);
            return this;
        }
        s(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        if (z10) {
            this.f16759y |= 16;
        } else {
            this.f16759y &= -17;
        }
        this.f16748n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f16747m = 0;
        this.f16746l = drawable;
        this.f16758x = true;
        this.f16748n.N(false);
        return this;
    }

    @Override // q0.InterfaceMenuItemC6088b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f16754t = colorStateList;
        this.f16756v = true;
        this.f16758x = true;
        this.f16748n.N(false);
        return this;
    }

    @Override // q0.InterfaceMenuItemC6088b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f16755u = mode;
        this.f16757w = true;
        this.f16758x = true;
        this.f16748n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f16741g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        if (this.f16742h == c10) {
            return this;
        }
        this.f16742h = c10;
        this.f16748n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f16732C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f16751q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f16742h = c10;
        this.f16744j = Character.toLowerCase(c11);
        this.f16748n.N(false);
        return this;
    }

    @Override // q0.InterfaceMenuItemC6088b, android.view.MenuItem
    public void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f16760z = i10;
        this.f16748n.L(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f16739e = charSequence;
        this.f16748n.N(false);
        l lVar = this.f16749o;
        if (lVar != null) {
            lVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f16740f = charSequence;
        this.f16748n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        if (y(z10)) {
            this.f16748n.M(this);
        }
        return this;
    }

    public void t(boolean z10) {
        this.f16759y = (z10 ? 4 : 0) | (this.f16759y & (-5));
    }

    public String toString() {
        CharSequence charSequence = this.f16739e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void u(boolean z10) {
        if (z10) {
            this.f16759y |= 32;
        } else {
            this.f16759y &= -33;
        }
    }

    public void v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f16734E = contextMenuInfo;
    }

    @Override // q0.InterfaceMenuItemC6088b, android.view.MenuItem
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC6088b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    public void x(l lVar) {
        this.f16749o = lVar;
        lVar.setHeaderTitle(getTitle());
    }

    public boolean y(boolean z10) {
        int i10 = this.f16759y;
        int i11 = (z10 ? 0 : 8) | (i10 & (-9));
        this.f16759y = i11;
        return i10 != i11;
    }

    public boolean z() {
        return this.f16748n.C();
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC6088b setContentDescription(CharSequence charSequence) {
        this.f16752r = charSequence;
        this.f16748n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC6088b setTooltipText(CharSequence charSequence) {
        this.f16753s = charSequence;
        this.f16748n.N(false);
        return this;
    }

    @Override // q0.InterfaceMenuItemC6088b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f16744j == c10 && this.f16745k == i10) {
            return this;
        }
        this.f16744j = Character.toLowerCase(c10);
        this.f16745k = KeyEvent.normalizeMetaState(i10);
        this.f16748n.N(false);
        return this;
    }

    @Override // q0.InterfaceMenuItemC6088b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        if (this.f16742h == c10 && this.f16743i == i10) {
            return this;
        }
        this.f16742h = c10;
        this.f16743i = KeyEvent.normalizeMetaState(i10);
        this.f16748n.N(false);
        return this;
    }

    @Override // q0.InterfaceMenuItemC6088b, android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f16742h = c10;
        this.f16743i = KeyEvent.normalizeMetaState(i10);
        this.f16744j = Character.toLowerCase(c11);
        this.f16745k = KeyEvent.normalizeMetaState(i11);
        this.f16748n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f16746l = null;
        this.f16747m = i10;
        this.f16758x = true;
        this.f16748n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        return setTitle(this.f16748n.w().getString(i10));
    }
}
