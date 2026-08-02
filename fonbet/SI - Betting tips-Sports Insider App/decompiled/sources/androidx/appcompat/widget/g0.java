package androidx.appcompat.widget;

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

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class g0 extends ImageButton {
    private final u mBackgroundTintHelper;
    private boolean mHasLevel;
    private final h0 mImageHelper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        z3.a(context);
        this.mHasLevel = false;
        y3.a(this, getContext());
        u uVar = new u(this);
        this.mBackgroundTintHelper = uVar;
        uVar.d(attributeSet, i5);
        h0 h0Var = new h0(this);
        this.mImageHelper = h0Var;
        h0Var.b(attributeSet, i5);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        u uVar = this.mBackgroundTintHelper;
        if (uVar != null) {
            uVar.a();
        }
        h0 h0Var = this.mImageHelper;
        if (h0Var != null) {
            h0Var.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        u uVar = this.mBackgroundTintHelper;
        if (uVar != null) {
            return uVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        u uVar = this.mBackgroundTintHelper;
        if (uVar != null) {
            return uVar.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        a4 a4Var;
        h0 h0Var = this.mImageHelper;
        if (h0Var == null || (a4Var = h0Var.f765b) == null) {
            return null;
        }
        return (ColorStateList) a4Var.f697c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        a4 a4Var;
        h0 h0Var = this.mImageHelper;
        if (h0Var == null || (a4Var = h0Var.f765b) == null) {
            return null;
        }
        return (PorterDuff.Mode) a4Var.f698d;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return !(this.mImageHelper.f764a.getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        u uVar = this.mBackgroundTintHelper;
        if (uVar != null) {
            uVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i5) {
        super.setBackgroundResource(i5);
        u uVar = this.mBackgroundTintHelper;
        if (uVar != null) {
            uVar.f(i5);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        h0 h0Var = this.mImageHelper;
        if (h0Var != null) {
            h0Var.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        h0 h0Var = this.mImageHelper;
        if (h0Var != null && drawable != null && !this.mHasLevel) {
            h0Var.f766c = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        h0 h0Var2 = this.mImageHelper;
        if (h0Var2 != null) {
            h0Var2.a();
            if (this.mHasLevel) {
                return;
            }
            h0 h0Var3 = this.mImageHelper;
            ImageView imageView = h0Var3.f764a;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(h0Var3.f766c);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i5) {
        super.setImageLevel(i5);
        this.mHasLevel = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i5) {
        this.mImageHelper.c(i5);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        h0 h0Var = this.mImageHelper;
        if (h0Var != null) {
            h0Var.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        u uVar = this.mBackgroundTintHelper;
        if (uVar != null) {
            uVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        u uVar = this.mBackgroundTintHelper;
        if (uVar != null) {
            uVar.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        h0 h0Var = this.mImageHelper;
        if (h0Var != null) {
            if (h0Var.f765b == null) {
                h0Var.f765b = new a4();
            }
            a4 a4Var = h0Var.f765b;
            a4Var.f697c = colorStateList;
            a4Var.f696b = true;
            h0Var.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        h0 h0Var = this.mImageHelper;
        if (h0Var != null) {
            if (h0Var.f765b == null) {
                h0Var.f765b = new a4();
            }
            a4 a4Var = h0Var.f765b;
            a4Var.f698d = mode;
            a4Var.f695a = true;
            h0Var.a();
        }
    }
}
