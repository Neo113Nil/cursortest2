package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final View f959a;

    /* renamed from: d, reason: collision with root package name */
    public a4 f962d;

    /* renamed from: e, reason: collision with root package name */
    public a4 f963e;

    /* renamed from: f, reason: collision with root package name */
    public a4 f964f;

    /* renamed from: c, reason: collision with root package name */
    public int f961c = -1;

    /* renamed from: b, reason: collision with root package name */
    public final b0 f960b = b0.a();

    public u(View view) {
        this.f959a = view;
    }

    public final void a() {
        View view = this.f959a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.f962d != null) {
                if (this.f964f == null) {
                    this.f964f = new a4();
                }
                a4 a4Var = this.f964f;
                a4Var.f697c = null;
                a4Var.f696b = false;
                a4Var.f698d = null;
                a4Var.f695a = false;
                WeakHashMap weakHashMap = androidx.core.view.z0.f1413a;
                ColorStateList c2 = androidx.core.view.q0.c(view);
                if (c2 != null) {
                    a4Var.f696b = true;
                    a4Var.f697c = c2;
                }
                PorterDuff.Mode d10 = androidx.core.view.q0.d(view);
                if (d10 != null) {
                    a4Var.f695a = true;
                    a4Var.f698d = d10;
                }
                if (a4Var.f696b || a4Var.f695a) {
                    b0.e(background, a4Var, view.getDrawableState());
                    return;
                }
            }
            a4 a4Var2 = this.f963e;
            if (a4Var2 != null) {
                b0.e(background, a4Var2, view.getDrawableState());
                return;
            }
            a4 a4Var3 = this.f962d;
            if (a4Var3 != null) {
                b0.e(background, a4Var3, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        a4 a4Var = this.f963e;
        if (a4Var != null) {
            return (ColorStateList) a4Var.f697c;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        a4 a4Var = this.f963e;
        if (a4Var != null) {
            return (PorterDuff.Mode) a4Var.f698d;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i5) {
        ColorStateList i10;
        View view = this.f959a;
        Context context = view.getContext();
        int[] iArr = i.a.B;
        c4 f6 = c4.f(context, attributeSet, iArr, i5, 0);
        TypedArray typedArray = f6.f722b;
        View view2 = this.f959a;
        androidx.core.view.z0.n(view2, view2.getContext(), iArr, attributeSet, f6.f722b, i5);
        try {
            if (typedArray.hasValue(0)) {
                this.f961c = typedArray.getResourceId(0, -1);
                b0 b0Var = this.f960b;
                Context context2 = view.getContext();
                int i11 = this.f961c;
                synchronized (b0Var) {
                    i10 = b0Var.f703a.i(context2, i11);
                }
                if (i10 != null) {
                    g(i10);
                }
            }
            if (typedArray.hasValue(1)) {
                androidx.core.view.q0.i(view, f6.a(1));
            }
            if (typedArray.hasValue(2)) {
                androidx.core.view.q0.j(view, z1.c(typedArray.getInt(2, -1), null));
            }
            f6.g();
        } catch (Throwable th2) {
            f6.g();
            throw th2;
        }
    }

    public final void e() {
        this.f961c = -1;
        g(null);
        a();
    }

    public final void f(int i5) {
        ColorStateList colorStateList;
        this.f961c = i5;
        b0 b0Var = this.f960b;
        if (b0Var != null) {
            Context context = this.f959a.getContext();
            synchronized (b0Var) {
                colorStateList = b0Var.f703a.i(context, i5);
            }
        } else {
            colorStateList = null;
        }
        g(colorStateList);
        a();
    }

    public final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f962d == null) {
                this.f962d = new a4();
            }
            a4 a4Var = this.f962d;
            a4Var.f697c = colorStateList;
            a4Var.f696b = true;
        } else {
            this.f962d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.f963e == null) {
            this.f963e = new a4();
        }
        a4 a4Var = this.f963e;
        a4Var.f697c = colorStateList;
        a4Var.f696b = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.f963e == null) {
            this.f963e = new a4();
        }
        a4 a4Var = this.f963e;
        a4Var.f698d = mode;
        a4Var.f695a = true;
        a();
    }
}
