package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.view.AbstractC2082d0;
import n.AbstractC5596a;

/* renamed from: androidx.appcompat.widget.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2058m {

    /* renamed from: a, reason: collision with root package name */
    public final ImageView f17342a;

    /* renamed from: b, reason: collision with root package name */
    public Y f17343b;

    /* renamed from: c, reason: collision with root package name */
    public Y f17344c;

    /* renamed from: d, reason: collision with root package name */
    public Y f17345d;

    /* renamed from: e, reason: collision with root package name */
    public int f17346e = 0;

    public C2058m(ImageView imageView) {
        this.f17342a = imageView;
    }

    public final boolean a(Drawable drawable) {
        if (this.f17345d == null) {
            this.f17345d = new Y();
        }
        Y y10 = this.f17345d;
        y10.a();
        ColorStateList a10 = C0.g.a(this.f17342a);
        if (a10 != null) {
            y10.f17241d = true;
            y10.f17238a = a10;
        }
        PorterDuff.Mode b10 = C0.g.b(this.f17342a);
        if (b10 != null) {
            y10.f17240c = true;
            y10.f17239b = b10;
        }
        if (!y10.f17241d && !y10.f17240c) {
            return false;
        }
        C2053h.i(drawable, y10, this.f17342a.getDrawableState());
        return true;
    }

    public void b() {
        if (this.f17342a.getDrawable() != null) {
            this.f17342a.getDrawable().setLevel(this.f17346e);
        }
    }

    public void c() {
        Drawable drawable = this.f17342a.getDrawable();
        if (drawable != null) {
            I.b(drawable);
        }
        if (drawable != null) {
            if (l() && a(drawable)) {
                return;
            }
            Y y10 = this.f17344c;
            if (y10 != null) {
                C2053h.i(drawable, y10, this.f17342a.getDrawableState());
                return;
            }
            Y y11 = this.f17343b;
            if (y11 != null) {
                C2053h.i(drawable, y11, this.f17342a.getDrawableState());
            }
        }
    }

    public ColorStateList d() {
        Y y10 = this.f17344c;
        if (y10 != null) {
            return y10.f17238a;
        }
        return null;
    }

    public PorterDuff.Mode e() {
        Y y10 = this.f17344c;
        if (y10 != null) {
            return y10.f17239b;
        }
        return null;
    }

    public boolean f() {
        return !(this.f17342a.getBackground() instanceof RippleDrawable);
    }

    public void g(AttributeSet attributeSet, int i10) {
        int n10;
        a0 v10 = a0.v(this.f17342a.getContext(), attributeSet, l.j.AppCompatImageView, i10, 0);
        ImageView imageView = this.f17342a;
        AbstractC2082d0.j0(imageView, imageView.getContext(), l.j.AppCompatImageView, attributeSet, v10.r(), i10, 0);
        try {
            Drawable drawable = this.f17342a.getDrawable();
            if (drawable == null && (n10 = v10.n(l.j.f55194H, -1)) != -1 && (drawable = AbstractC5596a.b(this.f17342a.getContext(), n10)) != null) {
                this.f17342a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                I.b(drawable);
            }
            if (v10.s(l.j.f55198I)) {
                C0.g.c(this.f17342a, v10.c(l.j.f55198I));
            }
            if (v10.s(l.j.f55202J)) {
                C0.g.d(this.f17342a, I.e(v10.k(l.j.f55202J, -1), null));
            }
            v10.x();
        } catch (Throwable th2) {
            v10.x();
            throw th2;
        }
    }

    public void h(Drawable drawable) {
        this.f17346e = drawable.getLevel();
    }

    public void i(int i10) {
        if (i10 != 0) {
            Drawable b10 = AbstractC5596a.b(this.f17342a.getContext(), i10);
            if (b10 != null) {
                I.b(b10);
            }
            this.f17342a.setImageDrawable(b10);
        } else {
            this.f17342a.setImageDrawable(null);
        }
        c();
    }

    public void j(ColorStateList colorStateList) {
        if (this.f17344c == null) {
            this.f17344c = new Y();
        }
        Y y10 = this.f17344c;
        y10.f17238a = colorStateList;
        y10.f17241d = true;
        c();
    }

    public void k(PorterDuff.Mode mode) {
        if (this.f17344c == null) {
            this.f17344c = new Y();
        }
        Y y10 = this.f17344c;
        y10.f17239b = mode;
        y10.f17240c = true;
        c();
    }

    public final boolean l() {
        return this.f17343b != null;
    }
}
