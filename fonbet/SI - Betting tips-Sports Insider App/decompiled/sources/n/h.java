package n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.p;
import androidx.appcompat.view.menu.q;
import androidx.appcompat.view.menu.u;
import io.sentry.android.core.w0;
import java.lang.reflect.Constructor;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h {
    public CharSequence A;
    public CharSequence B;
    public final /* synthetic */ i E;

    /* renamed from: a, reason: collision with root package name */
    public final Menu f20778a;

    /* renamed from: h, reason: collision with root package name */
    public boolean f20785h;

    /* renamed from: i, reason: collision with root package name */
    public int f20786i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f20787k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f20788l;

    /* renamed from: m, reason: collision with root package name */
    public int f20789m;

    /* renamed from: n, reason: collision with root package name */
    public char f20790n;

    /* renamed from: o, reason: collision with root package name */
    public int f20791o;

    /* renamed from: p, reason: collision with root package name */
    public char f20792p;
    public int q;

    /* renamed from: r, reason: collision with root package name */
    public int f20793r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f20794s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f20795t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f20796u;

    /* renamed from: v, reason: collision with root package name */
    public int f20797v;

    /* renamed from: w, reason: collision with root package name */
    public int f20798w;

    /* renamed from: x, reason: collision with root package name */
    public String f20799x;

    /* renamed from: y, reason: collision with root package name */
    public String f20800y;

    /* renamed from: z, reason: collision with root package name */
    public q f20801z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;

    /* renamed from: b, reason: collision with root package name */
    public int f20779b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f20780c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f20781d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f20782e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f20783f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f20784g = true;

    public h(i iVar, Menu menu) {
        this.E = iVar;
        this.f20778a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.f20806c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e7) {
            w0.n("SupportMenuInflater", "Cannot instantiate class: " + str, e7);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        i iVar = this.E;
        Context context = iVar.f20806c;
        boolean z5 = false;
        menuItem.setChecked(this.f20794s).setVisible(this.f20795t).setEnabled(this.f20796u).setCheckable(this.f20793r >= 1).setTitleCondensed(this.f20788l).setIcon(this.f20789m);
        int i5 = this.f20797v;
        if (i5 >= 0) {
            menuItem.setShowAsAction(i5);
        }
        if (this.f20800y != null) {
            if (context.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (iVar.f20807d == null) {
                iVar.f20807d = i.a(context);
            }
            Object obj = iVar.f20807d;
            String str = this.f20800y;
            g gVar = new g();
            gVar.f20776a = obj;
            Class<?> cls = obj.getClass();
            try {
                gVar.f20777b = cls.getMethod(str, g.f20775c);
                menuItem.setOnMenuItemClickListener(gVar);
            } catch (Exception e7) {
                StringBuilder p10 = d9.e.p("Couldn't resolve menu item onClick handler ", str, " in class ");
                p10.append(cls.getName());
                InflateException inflateException = new InflateException(p10.toString());
                inflateException.initCause(e7);
                throw inflateException;
            }
        }
        if (this.f20793r >= 2) {
            if (menuItem instanceof p) {
                ((p) menuItem).f(true);
            } else if (menuItem instanceof u) {
                u uVar = (u) menuItem;
                i0.a aVar = uVar.f548c;
                try {
                    if (uVar.f549d == null) {
                        uVar.f549d = aVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    uVar.f549d.invoke(aVar, Boolean.TRUE);
                } catch (Exception e9) {
                    w0.n("MenuItemWrapper", "Error while calling setExclusiveCheckable", e9);
                }
            }
        }
        String str2 = this.f20799x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, i.f20802e, iVar.f20804a));
            z5 = true;
        }
        int i10 = this.f20798w;
        if (i10 > 0) {
            if (z5) {
                w0.m("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i10);
            }
        }
        q qVar = this.f20801z;
        if (qVar != null) {
            if (menuItem instanceof i0.a) {
                ((i0.a) menuItem).b(qVar);
            } else {
                w0.m("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.A;
        boolean z7 = menuItem instanceof i0.a;
        if (z7) {
            ((i0.a) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            s6.a.t(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z7) {
            ((i0.a) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            s6.a.x(menuItem, charSequence2);
        }
        char c2 = this.f20790n;
        int i11 = this.f20791o;
        if (z7) {
            ((i0.a) menuItem).setAlphabeticShortcut(c2, i11);
        } else if (Build.VERSION.SDK_INT >= 26) {
            s6.a.s(menuItem, c2, i11);
        }
        char c8 = this.f20792p;
        int i12 = this.q;
        if (z7) {
            ((i0.a) menuItem).setNumericShortcut(c8, i12);
        } else if (Build.VERSION.SDK_INT >= 26) {
            s6.a.w(menuItem, c8, i12);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z7) {
                ((i0.a) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                s6.a.v(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z7) {
                ((i0.a) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                s6.a.u(menuItem, colorStateList);
            }
        }
    }
}
