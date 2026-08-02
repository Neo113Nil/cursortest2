package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import l.AbstractC5335a;

/* renamed from: androidx.appcompat.widget.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2057l extends ImageButton {

    /* renamed from: a, reason: collision with root package name */
    public final C2049d f17336a;

    /* renamed from: b, reason: collision with root package name */
    public final C2058m f17337b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f17338c;

    public C2057l(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5335a.f54970C);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C2049d c2049d = this.f17336a;
        if (c2049d != null) {
            c2049d.b();
        }
        C2058m c2058m = this.f17337b;
        if (c2058m != null) {
            c2058m.c();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2049d c2049d = this.f17336a;
        if (c2049d != null) {
            return c2049d.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2049d c2049d = this.f17336a;
        if (c2049d != null) {
            return c2049d.d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C2058m c2058m = this.f17337b;
        if (c2058m != null) {
            return c2058m.d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C2058m c2058m = this.f17337b;
        if (c2058m != null) {
            return c2058m.e();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f17337b.f() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2049d c2049d = this.f17336a;
        if (c2049d != null) {
            c2049d.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C2049d c2049d = this.f17336a;
        if (c2049d != null) {
            c2049d.g(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C2058m c2058m = this.f17337b;
        if (c2058m != null) {
            c2058m.c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C2058m c2058m = this.f17337b;
        if (c2058m != null && drawable != null && !this.f17338c) {
            c2058m.h(drawable);
        }
        super.setImageDrawable(drawable);
        C2058m c2058m2 = this.f17337b;
        if (c2058m2 != null) {
            c2058m2.c();
            if (this.f17338c) {
                return;
            }
            this.f17337b.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.f17338c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        this.f17337b.i(i10);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C2058m c2058m = this.f17337b;
        if (c2058m != null) {
            c2058m.c();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2049d c2049d = this.f17336a;
        if (c2049d != null) {
            c2049d.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2049d c2049d = this.f17336a;
        if (c2049d != null) {
            c2049d.j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C2058m c2058m = this.f17337b;
        if (c2058m != null) {
            c2058m.j(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C2058m c2058m = this.f17337b;
        if (c2058m != null) {
            c2058m.k(mode);
        }
    }

    public C2057l(Context context, AttributeSet attributeSet, int i10) {
        super(X.b(context), attributeSet, i10);
        this.f17338c = false;
        W.a(this, getContext());
        C2049d c2049d = new C2049d(this);
        this.f17336a = c2049d;
        c2049d.e(attributeSet, i10);
        C2058m c2058m = new C2058m(this);
        this.f17337b = c2058m;
        c2058m.g(attributeSet, i10);
    }
}
