package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.a08;
import defpackage.cb0;
import defpackage.cc0;
import defpackage.gjj;
import defpackage.wfj;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class AppCompatImageView extends ImageView {
    private final cb0 mBackgroundTintHelper;
    private boolean mHasLevel;
    private final cc0 mImageHelper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatImageView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        gjj.a(context);
        this.mHasLevel = false;
        wfj.a(getContext(), this);
        cb0 cb0Var = new cb0(this);
        this.mBackgroundTintHelper = cb0Var;
        cb0Var.d(attributeSet, i);
        cc0 cc0Var = new cc0(this);
        this.mImageHelper = cc0Var;
        cc0Var.b(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        cb0 cb0Var = this.mBackgroundTintHelper;
        if (cb0Var != null) {
            cb0Var.a();
        }
        cc0 cc0Var = this.mImageHelper;
        if (cc0Var != null) {
            cc0Var.a();
        }
    }

    @Nullable
    public ColorStateList getSupportBackgroundTintList() {
        cb0 cb0Var = this.mBackgroundTintHelper;
        if (cb0Var != null) {
            return cb0Var.b();
        }
        return null;
    }

    @Nullable
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        cb0 cb0Var = this.mBackgroundTintHelper;
        if (cb0Var != null) {
            return cb0Var.c();
        }
        return null;
    }

    @Nullable
    public ColorStateList getSupportImageTintList() {
        a08 a08Var;
        cc0 cc0Var = this.mImageHelper;
        if (cc0Var == null || (a08Var = cc0Var.b) == null) {
            return null;
        }
        return (ColorStateList) a08Var.c;
    }

    @Nullable
    public PorterDuff.Mode getSupportImageTintMode() {
        a08 a08Var;
        cc0 cc0Var = this.mImageHelper;
        if (cc0Var == null || (a08Var = cc0Var.b) == null) {
            return null;
        }
        return (PorterDuff.Mode) a08Var.d;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return !(this.mImageHelper.a.getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        cb0 cb0Var = this.mBackgroundTintHelper;
        if (cb0Var != null) {
            cb0Var.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        cb0 cb0Var = this.mBackgroundTintHelper;
        if (cb0Var != null) {
            cb0Var.f(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        cc0 cc0Var = this.mImageHelper;
        if (cc0Var != null) {
            cc0Var.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@Nullable Drawable drawable) {
        cc0 cc0Var = this.mImageHelper;
        if (cc0Var != null && drawable != null && !this.mHasLevel) {
            cc0Var.c = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        cc0 cc0Var2 = this.mImageHelper;
        if (cc0Var2 != null) {
            cc0Var2.a();
            if (this.mHasLevel) {
                return;
            }
            cc0 cc0Var3 = this.mImageHelper;
            ImageView imageView = cc0Var3.a;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(cc0Var3.c);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.mHasLevel = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        cc0 cc0Var = this.mImageHelper;
        if (cc0Var != null) {
            cc0Var.c(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(@Nullable Uri uri) {
        super.setImageURI(uri);
        cc0 cc0Var = this.mImageHelper;
        if (cc0Var != null) {
            cc0Var.a();
        }
    }

    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        cb0 cb0Var = this.mBackgroundTintHelper;
        if (cb0Var != null) {
            cb0Var.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        cb0 cb0Var = this.mBackgroundTintHelper;
        if (cb0Var != null) {
            cb0Var.i(mode);
        }
    }

    public void setSupportImageTintList(@Nullable ColorStateList colorStateList) {
        cc0 cc0Var = this.mImageHelper;
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
        cc0 cc0Var = this.mImageHelper;
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

    public AppCompatImageView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppCompatImageView(@NonNull Context context) {
        this(context, null);
    }
}
