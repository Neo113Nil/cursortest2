package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class cb0 {
    public final View a;
    public a08 d;
    public a08 e;
    public a08 f;
    public int c = -1;
    public final xb0 b = xb0.a();

    public cb0(View view) {
        this.a = view;
    }

    public final void a() {
        View view = this.a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.d != null) {
                a08 a08Var = this.f;
                if (a08Var == null) {
                    a08Var = new a08();
                    this.f = a08Var;
                }
                a08Var.c = null;
                a08Var.b = false;
                a08Var.d = null;
                a08Var.a = false;
                WeakHashMap weakHashMap = bsk.a;
                ColorStateList backgroundTintList = view.getBackgroundTintList();
                if (backgroundTintList != null) {
                    a08Var.b = true;
                    a08Var.c = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = view.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    a08Var.a = true;
                    a08Var.d = backgroundTintMode;
                }
                if (a08Var.b || a08Var.a) {
                    int[] drawableState = view.getDrawableState();
                    PorterDuff.Mode mode = xb0.b;
                    t1g.h(background, a08Var, drawableState);
                    return;
                }
            }
            a08 a08Var2 = this.e;
            if (a08Var2 != null) {
                int[] drawableState2 = view.getDrawableState();
                PorterDuff.Mode mode2 = xb0.b;
                t1g.h(background, a08Var2, drawableState2);
            } else {
                a08 a08Var3 = this.d;
                if (a08Var3 != null) {
                    int[] drawableState3 = view.getDrawableState();
                    PorterDuff.Mode mode3 = xb0.b;
                    t1g.h(background, a08Var3, drawableState3);
                }
            }
        }
    }

    public final ColorStateList b() {
        a08 a08Var = this.e;
        if (a08Var != null) {
            return (ColorStateList) a08Var.c;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        a08 a08Var = this.e;
        if (a08Var != null) {
            return (PorterDuff.Mode) a08Var.d;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i) {
        ColorStateList f;
        View view = this.a;
        Context context = view.getContext();
        int[] iArr = dkf.B;
        l2a y = l2a.y(i, 0, context, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) y.c;
        View view2 = this.a;
        bsk.p(view2, view2.getContext(), iArr, attributeSet, (TypedArray) y.c, i);
        try {
            if (typedArray.hasValue(0)) {
                this.c = typedArray.getResourceId(0, -1);
                xb0 xb0Var = this.b;
                Context context2 = view.getContext();
                int i2 = this.c;
                synchronized (xb0Var) {
                    f = xb0Var.a.f(i2, context2);
                }
                if (f != null) {
                    g(f);
                }
            }
            if (typedArray.hasValue(1)) {
                view.setBackgroundTintList(y.m(1));
            }
            if (typedArray.hasValue(2)) {
                view.setBackgroundTintMode(fb5.c(typedArray.getInt(2, -1), null));
            }
            y.F();
        } catch (Throwable th) {
            y.F();
            throw th;
        }
    }

    public final void e() {
        this.c = -1;
        g(null);
        a();
    }

    public final void f(int i) {
        ColorStateList colorStateList;
        this.c = i;
        xb0 xb0Var = this.b;
        if (xb0Var != null) {
            Context context = this.a.getContext();
            synchronized (xb0Var) {
                colorStateList = xb0Var.a.f(i, context);
            }
        } else {
            colorStateList = null;
        }
        g(colorStateList);
        a();
    }

    public final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            a08 a08Var = this.d;
            if (a08Var == null) {
                a08Var = new a08();
                this.d = a08Var;
            }
            a08Var.c = colorStateList;
            a08Var.b = true;
        } else {
            this.d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        a08 a08Var = this.e;
        if (a08Var == null) {
            a08Var = new a08();
            this.e = a08Var;
        }
        a08Var.c = colorStateList;
        a08Var.b = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        a08 a08Var = this.e;
        if (a08Var == null) {
            a08Var = new a08();
            this.e = a08Var;
        }
        a08Var.d = mode;
        a08Var.a = true;
        a();
    }
}
