package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zmi {
    public CharSequence A;
    public CharSequence B;
    public final /* synthetic */ ani E;
    public final Menu a;
    public boolean h;
    public int i;
    public int j;
    public CharSequence k;
    public CharSequence l;
    public int m;
    public char n;
    public int o;
    public char p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public String x;
    public String y;
    public gfc z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;
    public int b = 0;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public boolean f = true;
    public boolean g = true;

    public zmi(ani aniVar, Menu menu) {
        this.E = aniVar;
        this.a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        ani aniVar = this.E;
        Context context = aniVar.c;
        boolean z = false;
        menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.l).setIcon(this.m);
        int i = this.v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        if (this.y != null) {
            if (context.isRestricted()) {
                a70.r("The android:onClick attribute cannot be used within a restricted context");
                return;
            }
            Object obj = aniVar.d;
            if (obj == null) {
                obj = ani.a(context);
                aniVar.d = obj;
            }
            String str = this.y;
            ymi ymiVar = new ymi();
            ymiVar.b = obj;
            Class<?> cls = obj.getClass();
            try {
                ymiVar.c = cls.getMethod(str, ymi.d);
                menuItem.setOnMenuItemClickListener(ymiVar);
            } catch (Exception e) {
                StringBuilder q = wt3.q("Couldn't resolve menu item onClick handler ", str, " in class ");
                q.append(cls.getName());
                InflateException inflateException = new InflateException(q.toString());
                inflateException.initCause(e);
                throw inflateException;
            }
        }
        if (this.r >= 2) {
            if (menuItem instanceof efc) {
                efc efcVar = (efc) menuItem;
                efcVar.x = (efcVar.x & (-5)) | 4;
            } else if (menuItem instanceof jfc) {
                jfc jfcVar = (jfc) menuItem;
                bni bniVar = jfcVar.c;
                try {
                    Method method = jfcVar.d;
                    if (method == null) {
                        method = bniVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                        jfcVar.d = method;
                    }
                    method.invoke(bniVar, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
        String str2 = this.x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, ani.e, aniVar.a));
            z = true;
        }
        int i2 = this.w;
        if (i2 > 0 && !z) {
            menuItem.setActionView(i2);
        }
        gfc gfcVar = this.z;
        if (gfcVar != null && (menuItem instanceof bni)) {
            ((bni) menuItem).a(gfcVar);
        }
        CharSequence charSequence = this.A;
        boolean z2 = menuItem instanceof bni;
        if (z2) {
            ((bni) menuItem).setContentDescription(charSequence);
        } else {
            menuItem.setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z2) {
            ((bni) menuItem).setTooltipText(charSequence2);
        } else {
            menuItem.setTooltipText(charSequence2);
        }
        char c = this.n;
        int i3 = this.o;
        if (z2) {
            ((bni) menuItem).setAlphabeticShortcut(c, i3);
        } else {
            menuItem.setAlphabeticShortcut(c, i3);
        }
        char c2 = this.p;
        int i4 = this.q;
        if (z2) {
            ((bni) menuItem).setNumericShortcut(c2, i4);
        } else {
            menuItem.setNumericShortcut(c2, i4);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z2) {
                ((bni) menuItem).setIconTintMode(mode);
            } else {
                menuItem.setIconTintMode(mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z2) {
                ((bni) menuItem).setIconTintList(colorStateList);
            } else {
                menuItem.setIconTintList(colorStateList);
            }
        }
    }
}
