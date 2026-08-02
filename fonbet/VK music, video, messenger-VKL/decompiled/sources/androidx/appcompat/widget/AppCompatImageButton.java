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
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vkontakte.android.R;
import xsna.f23;
import xsna.g33;
import xsna.qpo0;
import xsna.uyo0;
import xsna.vyo0;

/* loaded from: classes.dex */
public class AppCompatImageButton extends ImageButton {
    public final f23 b;
    public final g33 c;
    public boolean d;

    public AppCompatImageButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.imageButtonStyle);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        f23 f23Var = this.b;
        if (f23Var != null) {
            f23Var.a();
        }
        g33 g33Var = this.c;
        if (g33Var != null) {
            g33Var.a();
        }
    }

    @Nullable
    public ColorStateList getSupportBackgroundTintList() {
        f23 f23Var = this.b;
        if (f23Var != null) {
            return f23Var.b();
        }
        return null;
    }

    @Nullable
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        f23 f23Var = this.b;
        if (f23Var != null) {
            return f23Var.c();
        }
        return null;
    }

    @Nullable
    public ColorStateList getSupportImageTintList() {
        vyo0 vyo0Var;
        g33 g33Var = this.c;
        if (g33Var == null || (vyo0Var = g33Var.b) == null) {
            return null;
        }
        return vyo0Var.a;
    }

    @Nullable
    public PorterDuff.Mode getSupportImageTintMode() {
        vyo0 vyo0Var;
        g33 g33Var = this.c;
        if (g33Var == null || (vyo0Var = g33Var.b) == null) {
            return null;
        }
        return vyo0Var.b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(this.c.a.getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        f23 f23Var = this.b;
        if (f23Var != null) {
            f23Var.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        f23 f23Var = this.b;
        if (f23Var != null) {
            f23Var.f(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        g33 g33Var = this.c;
        if (g33Var != null) {
            g33Var.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@Nullable Drawable drawable) {
        g33 g33Var = this.c;
        if (g33Var != null && drawable != null && !this.d) {
            g33Var.c = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (g33Var != null) {
            g33Var.a();
            if (this.d) {
                return;
            }
            ImageView imageView = g33Var.a;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(g33Var.c);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.d = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.c.c(i);
    }

    @Override // android.widget.ImageView
    public void setImageURI(@Nullable Uri uri) {
        super.setImageURI(uri);
        g33 g33Var = this.c;
        if (g33Var != null) {
            g33Var.a();
        }
    }

    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        f23 f23Var = this.b;
        if (f23Var != null) {
            f23Var.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        f23 f23Var = this.b;
        if (f23Var != null) {
            f23Var.i(mode);
        }
    }

    public void setSupportImageTintList(@Nullable ColorStateList colorStateList) {
        g33 g33Var = this.c;
        if (g33Var != null) {
            if (g33Var.b == null) {
                g33Var.b = new vyo0();
            }
            vyo0 vyo0Var = g33Var.b;
            vyo0Var.a = colorStateList;
            vyo0Var.d = true;
            g33Var.a();
        }
    }

    public void setSupportImageTintMode(@Nullable PorterDuff.Mode mode) {
        g33 g33Var = this.c;
        if (g33Var != null) {
            if (g33Var.b == null) {
                g33Var.b = new vyo0();
            }
            vyo0 vyo0Var = g33Var.b;
            vyo0Var.b = mode;
            vyo0Var.c = true;
            g33Var.a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatImageButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        uyo0.a(context);
        this.d = false;
        qpo0.a(getContext(), this);
        f23 f23Var = new f23(this);
        this.b = f23Var;
        f23Var.d(attributeSet, i);
        g33 g33Var = new g33(this);
        this.c = g33Var;
        g33Var.b(attributeSet, i);
    }
}
