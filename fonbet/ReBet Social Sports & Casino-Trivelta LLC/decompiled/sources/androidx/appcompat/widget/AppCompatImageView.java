package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public class AppCompatImageView extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    public final C2049d f16918a;

    /* renamed from: b, reason: collision with root package name */
    public final C2058m f16919b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f16920c;

    public AppCompatImageView(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C2049d c2049d = this.f16918a;
        if (c2049d != null) {
            c2049d.b();
        }
        C2058m c2058m = this.f16919b;
        if (c2058m != null) {
            c2058m.c();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2049d c2049d = this.f16918a;
        if (c2049d != null) {
            return c2049d.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2049d c2049d = this.f16918a;
        if (c2049d != null) {
            return c2049d.d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C2058m c2058m = this.f16919b;
        if (c2058m != null) {
            return c2058m.d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C2058m c2058m = this.f16919b;
        if (c2058m != null) {
            return c2058m.e();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f16919b.f() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2049d c2049d = this.f16918a;
        if (c2049d != null) {
            c2049d.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C2049d c2049d = this.f16918a;
        if (c2049d != null) {
            c2049d.g(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C2058m c2058m = this.f16919b;
        if (c2058m != null) {
            c2058m.c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C2058m c2058m = this.f16919b;
        if (c2058m != null && drawable != null && !this.f16920c) {
            c2058m.h(drawable);
        }
        super.setImageDrawable(drawable);
        C2058m c2058m2 = this.f16919b;
        if (c2058m2 != null) {
            c2058m2.c();
            if (this.f16920c) {
                return;
            }
            this.f16919b.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.f16920c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        C2058m c2058m = this.f16919b;
        if (c2058m != null) {
            c2058m.i(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C2058m c2058m = this.f16919b;
        if (c2058m != null) {
            c2058m.c();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2049d c2049d = this.f16918a;
        if (c2049d != null) {
            c2049d.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2049d c2049d = this.f16918a;
        if (c2049d != null) {
            c2049d.j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C2058m c2058m = this.f16919b;
        if (c2058m != null) {
            c2058m.j(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C2058m c2058m = this.f16919b;
        if (c2058m != null) {
            c2058m.k(mode);
        }
    }

    public AppCompatImageView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet, int i10) {
        super(X.b(context), attributeSet, i10);
        this.f16920c = false;
        W.a(this, getContext());
        C2049d c2049d = new C2049d(this);
        this.f16918a = c2049d;
        c2049d.e(attributeSet, i10);
        C2058m c2058m = new C2058m(this);
        this.f16919b = c2058m;
        c2058m.g(attributeSet, i10);
    }
}
