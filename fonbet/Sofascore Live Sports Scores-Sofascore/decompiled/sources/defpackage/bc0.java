package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class bc0 extends ImageButton {
    public final cb0 a;
    public final cc0 b;
    public boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bc0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        gjj.a(context);
        this.c = false;
        wfj.a(getContext(), this);
        cb0 cb0Var = new cb0(this);
        this.a = cb0Var;
        cb0Var.d(attributeSet, i);
        cc0 cc0Var = new cc0(this);
        this.b = cc0Var;
        cc0Var.b(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        cb0 cb0Var = this.a;
        if (cb0Var != null) {
            cb0Var.a();
        }
        cc0 cc0Var = this.b;
        if (cc0Var != null) {
            cc0Var.a();
        }
    }

    @Nullable
    public ColorStateList getSupportBackgroundTintList() {
        cb0 cb0Var = this.a;
        if (cb0Var != null) {
            return cb0Var.b();
        }
        return null;
    }

    @Nullable
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        cb0 cb0Var = this.a;
        if (cb0Var != null) {
            return cb0Var.c();
        }
        return null;
    }

    @Nullable
    public ColorStateList getSupportImageTintList() {
        a08 a08Var;
        cc0 cc0Var = this.b;
        if (cc0Var == null || (a08Var = cc0Var.b) == null) {
            return null;
        }
        return (ColorStateList) a08Var.c;
    }

    @Nullable
    public PorterDuff.Mode getSupportImageTintMode() {
        a08 a08Var;
        cc0 cc0Var = this.b;
        if (cc0Var == null || (a08Var = cc0Var.b) == null) {
            return null;
        }
        return (PorterDuff.Mode) a08Var.d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(this.b.a.getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        cb0 cb0Var = this.a;
        if (cb0Var != null) {
            cb0Var.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        cb0 cb0Var = this.a;
        if (cb0Var != null) {
            cb0Var.f(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        cc0 cc0Var = this.b;
        if (cc0Var != null) {
            cc0Var.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@Nullable Drawable drawable) {
        cc0 cc0Var = this.b;
        if (cc0Var != null && drawable != null && !this.c) {
            cc0Var.c = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (cc0Var != null) {
            cc0Var.a();
            if (this.c) {
                return;
            }
            ImageView imageView = cc0Var.a;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(cc0Var.c);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.b.c(i);
    }

    @Override // android.widget.ImageView
    public void setImageURI(@Nullable Uri uri) {
        super.setImageURI(uri);
        cc0 cc0Var = this.b;
        if (cc0Var != null) {
            cc0Var.a();
        }
    }

    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        cb0 cb0Var = this.a;
        if (cb0Var != null) {
            cb0Var.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        cb0 cb0Var = this.a;
        if (cb0Var != null) {
            cb0Var.i(mode);
        }
    }

    public void setSupportImageTintList(@Nullable ColorStateList colorStateList) {
        cc0 cc0Var = this.b;
        if (cc0Var != null) {
            a08 a08Var = cc0Var.b;
            if (a08Var == null) {
                a08Var = new a08();
                cc0Var.b = a08Var;
            }
            a08Var.c = colorStateList;
            a08Var.b = true;
            cc0Var.a();
        }
    }

    public void setSupportImageTintMode(@Nullable PorterDuff.Mode mode) {
        cc0 cc0Var = this.b;
        if (cc0Var != null) {
            a08 a08Var = cc0Var.b;
            if (a08Var == null) {
                a08Var = new a08();
                cc0Var.b = a08Var;
            }
            a08Var.d = mode;
            a08Var.a = true;
            cc0Var.a();
        }
    }
}
