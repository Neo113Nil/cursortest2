package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vkontakte.android.R;
import xsna.f23;
import xsna.f33;
import xsna.j23;
import xsna.m33;
import xsna.p33;
import xsna.qpo0;
import xsna.uyo0;
import xsna.zyo0;

/* loaded from: classes11.dex */
public class AppCompatRadioButton extends RadioButton implements zyo0 {
    public final j23 b;
    public final f23 c;
    public final p33 d;
    public f33 e;

    public AppCompatRadioButton(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.radioButtonStyle);
    }

    @NonNull
    private f33 getEmojiTextViewHelper() {
        if (this.e == null) {
            this.e = new f33(this);
        }
        return this.e;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        f23 f23Var = this.c;
        if (f23Var != null) {
            f23Var.a();
        }
        p33 p33Var = this.d;
        if (p33Var != null) {
            p33Var.b();
        }
    }

    @Nullable
    public ColorStateList getSupportBackgroundTintList() {
        f23 f23Var = this.c;
        if (f23Var != null) {
            return f23Var.b();
        }
        return null;
    }

    @Nullable
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        f23 f23Var = this.c;
        if (f23Var != null) {
            return f23Var.c();
        }
        return null;
    }

    @Override // xsna.zyo0
    @Nullable
    public ColorStateList getSupportButtonTintList() {
        j23 j23Var = this.b;
        if (j23Var != null) {
            return j23Var.b;
        }
        return null;
    }

    @Nullable
    public PorterDuff.Mode getSupportButtonTintMode() {
        j23 j23Var = this.b;
        if (j23Var != null) {
            return j23Var.c;
        }
        return null;
    }

    @Nullable
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.d.d();
    }

    @Nullable
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.d.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        f23 f23Var = this.c;
        if (f23Var != null) {
            f23Var.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        f23 f23Var = this.c;
        if (f23Var != null) {
            f23Var.f(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        j23 j23Var = this.b;
        if (j23Var != null) {
            if (j23Var.f) {
                j23Var.f = false;
            } else {
                j23Var.f = true;
                j23Var.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        p33 p33Var = this.d;
        if (p33Var != null) {
            p33Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        p33 p33Var = this.d;
        if (p33Var != null) {
            p33Var.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        f23 f23Var = this.c;
        if (f23Var != null) {
            f23Var.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        f23 f23Var = this.c;
        if (f23Var != null) {
            f23Var.i(mode);
        }
    }

    @Override // xsna.zyo0
    public void setSupportButtonTintList(@Nullable ColorStateList colorStateList) {
        j23 j23Var = this.b;
        if (j23Var != null) {
            j23Var.b = colorStateList;
            j23Var.d = true;
            j23Var.a();
        }
    }

    @Override // xsna.zyo0
    public void setSupportButtonTintMode(@Nullable PorterDuff.Mode mode) {
        j23 j23Var = this.b;
        if (j23Var != null) {
            j23Var.c = mode;
            j23Var.e = true;
            j23Var.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList) {
        p33 p33Var = this.d;
        p33Var.h(colorStateList);
        p33Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode mode) {
        p33 p33Var = this.d;
        p33Var.i(mode);
        p33Var.b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatRadioButton(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        uyo0.a(context);
        qpo0.a(getContext(), this);
        j23 j23Var = new j23(this);
        this.b = j23Var;
        j23Var.b(attributeSet, i);
        f23 f23Var = new f23(this);
        this.c = f23Var;
        f23Var.d(attributeSet, i);
        p33 p33Var = new p33(this);
        this.d = p33Var;
        p33Var.f(attributeSet, i);
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(m33.a(i, getContext()));
    }
}
