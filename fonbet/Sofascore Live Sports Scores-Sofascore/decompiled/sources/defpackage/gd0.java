package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gd0 extends ToggleButton {
    public final cb0 a;
    public final xc0 b;
    public ac0 c;

    public gd0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        wfj.a(getContext(), this);
        cb0 cb0Var = new cb0(this);
        this.a = cb0Var;
        cb0Var.d(attributeSet, R.attr.buttonStyleToggle);
        xc0 xc0Var = new xc0(this);
        this.b = xc0Var;
        xc0Var.f(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().b(attributeSet, R.attr.buttonStyleToggle);
    }

    @NonNull
    private ac0 getEmojiTextViewHelper() {
        ac0 ac0Var = this.c;
        if (ac0Var != null) {
            return ac0Var;
        }
        ac0 ac0Var2 = new ac0(this);
        this.c = ac0Var2;
        return ac0Var2;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        cb0 cb0Var = this.a;
        if (cb0Var != null) {
            cb0Var.a();
        }
        xc0 xc0Var = this.b;
        if (xc0Var != null) {
            xc0Var.b();
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
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.b.d();
    }

    @Nullable
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.b.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.ToggleButton, android.view.View
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

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        xc0 xc0Var = this.b;
        if (xc0Var != null) {
            xc0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        xc0 xc0Var = this.b;
        if (xc0Var != null) {
            xc0Var.b();
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

    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList) {
        xc0 xc0Var = this.b;
        xc0Var.k(colorStateList);
        xc0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode mode) {
        xc0 xc0Var = this.b;
        xc0Var.l(mode);
        xc0Var.b();
    }
}
