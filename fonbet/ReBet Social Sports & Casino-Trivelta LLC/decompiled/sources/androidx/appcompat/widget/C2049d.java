package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.AbstractC2082d0;

/* renamed from: androidx.appcompat.widget.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2049d {

    /* renamed from: a, reason: collision with root package name */
    public final View f17263a;

    /* renamed from: d, reason: collision with root package name */
    public Y f17266d;

    /* renamed from: e, reason: collision with root package name */
    public Y f17267e;

    /* renamed from: f, reason: collision with root package name */
    public Y f17268f;

    /* renamed from: c, reason: collision with root package name */
    public int f17265c = -1;

    /* renamed from: b, reason: collision with root package name */
    public final C2053h f17264b = C2053h.b();

    public C2049d(View view) {
        this.f17263a = view;
    }

    public final boolean a(Drawable drawable) {
        if (this.f17268f == null) {
            this.f17268f = new Y();
        }
        Y y10 = this.f17268f;
        y10.a();
        ColorStateList r10 = AbstractC2082d0.r(this.f17263a);
        if (r10 != null) {
            y10.f17241d = true;
            y10.f17238a = r10;
        }
        PorterDuff.Mode s10 = AbstractC2082d0.s(this.f17263a);
        if (s10 != null) {
            y10.f17240c = true;
            y10.f17239b = s10;
        }
        if (!y10.f17241d && !y10.f17240c) {
            return false;
        }
        C2053h.i(drawable, y10, this.f17263a.getDrawableState());
        return true;
    }

    public void b() {
        Drawable background = this.f17263a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            Y y10 = this.f17267e;
            if (y10 != null) {
                C2053h.i(background, y10, this.f17263a.getDrawableState());
                return;
            }
            Y y11 = this.f17266d;
            if (y11 != null) {
                C2053h.i(background, y11, this.f17263a.getDrawableState());
            }
        }
    }

    public ColorStateList c() {
        Y y10 = this.f17267e;
        if (y10 != null) {
            return y10.f17238a;
        }
        return null;
    }

    public PorterDuff.Mode d() {
        Y y10 = this.f17267e;
        if (y10 != null) {
            return y10.f17239b;
        }
        return null;
    }

    public void e(AttributeSet attributeSet, int i10) {
        a0 v10 = a0.v(this.f17263a.getContext(), attributeSet, l.j.ViewBackgroundHelper, i10, 0);
        View view = this.f17263a;
        AbstractC2082d0.j0(view, view.getContext(), l.j.ViewBackgroundHelper, attributeSet, v10.r(), i10, 0);
        try {
            if (v10.s(l.j.f55324k3)) {
                this.f17265c = v10.n(l.j.f55324k3, -1);
                ColorStateList f10 = this.f17264b.f(this.f17263a.getContext(), this.f17265c);
                if (f10 != null) {
                    h(f10);
                }
            }
            if (v10.s(l.j.f55329l3)) {
                AbstractC2082d0.q0(this.f17263a, v10.c(l.j.f55329l3));
            }
            if (v10.s(l.j.f55334m3)) {
                AbstractC2082d0.r0(this.f17263a, I.e(v10.k(l.j.f55334m3, -1), null));
            }
            v10.x();
        } catch (Throwable th2) {
            v10.x();
            throw th2;
        }
    }

    public void f(Drawable drawable) {
        this.f17265c = -1;
        h(null);
        b();
    }

    public void g(int i10) {
        this.f17265c = i10;
        C2053h c2053h = this.f17264b;
        h(c2053h != null ? c2053h.f(this.f17263a.getContext(), i10) : null);
        b();
    }

    public void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f17266d == null) {
                this.f17266d = new Y();
            }
            Y y10 = this.f17266d;
            y10.f17238a = colorStateList;
            y10.f17241d = true;
        } else {
            this.f17266d = null;
        }
        b();
    }

    public void i(ColorStateList colorStateList) {
        if (this.f17267e == null) {
            this.f17267e = new Y();
        }
        Y y10 = this.f17267e;
        y10.f17238a = colorStateList;
        y10.f17241d = true;
        b();
    }

    public void j(PorterDuff.Mode mode) {
        if (this.f17267e == null) {
            this.f17267e = new Y();
        }
        Y y10 = this.f17267e;
        y10.f17239b = mode;
        y10.f17240c = true;
        b();
    }

    public final boolean k() {
        return this.f17266d != null;
    }
}
