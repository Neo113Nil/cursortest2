package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class eb0 extends CheckBox implements ijj {
    public final gb0 a;
    public final cb0 b;
    public final xc0 c;
    public ac0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        gjj.a(context);
        wfj.a(getContext(), this);
        gb0 gb0Var = new gb0(this);
        this.a = gb0Var;
        gb0Var.d(attributeSet, i);
        cb0 cb0Var = new cb0(this);
        this.b = cb0Var;
        cb0Var.d(attributeSet, i);
        xc0 xc0Var = new xc0(this);
        this.c = xc0Var;
        xc0Var.f(attributeSet, i);
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    @NonNull
    private ac0 getEmojiTextViewHelper() {
        ac0 ac0Var = this.d;
        if (ac0Var != null) {
            return ac0Var;
        }
        ac0 ac0Var2 = new ac0(this);
        this.d = ac0Var2;
        return ac0Var2;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        cb0 cb0Var = this.b;
        if (cb0Var != null) {
            cb0Var.a();
        }
        xc0 xc0Var = this.c;
        if (xc0Var != null) {
            xc0Var.b();
        }
    }

    @Nullable
    public ColorStateList getSupportBackgroundTintList() {
        cb0 cb0Var = this.b;
        if (cb0Var != null) {
            return cb0Var.b();
        }
        return null;
    }

    @Nullable
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        cb0 cb0Var = this.b;
        if (cb0Var != null) {
            return cb0Var.c();
        }
        return null;
    }

    @Override // defpackage.ijj
    @Nullable
    public ColorStateList getSupportButtonTintList() {
        gb0 gb0Var = this.a;
        if (gb0Var != null) {
            return (ColorStateList) gb0Var.a;
        }
        return null;
    }

    @Nullable
    public PorterDuff.Mode getSupportButtonTintMode() {
        gb0 gb0Var = this.a;
        if (gb0Var != null) {
            return (PorterDuff.Mode) gb0Var.b;
        }
        return null;
    }

    @Nullable
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.c.d();
    }

    @Nullable
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.c.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        cb0 cb0Var = this.b;
        if (cb0Var != null) {
            cb0Var.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        cb0 cb0Var = this.b;
        if (cb0Var != null) {
            cb0Var.f(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        gb0 gb0Var = this.a;
        if (gb0Var != null) {
            if (gb0Var.e) {
                gb0Var.e = false;
            } else {
                gb0Var.e = true;
                gb0Var.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        xc0 xc0Var = this.c;
        if (xc0Var != null) {
            xc0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        xc0 xc0Var = this.c;
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
        cb0 cb0Var = this.b;
        if (cb0Var != null) {
            cb0Var.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        cb0 cb0Var = this.b;
        if (cb0Var != null) {
            cb0Var.i(mode);
        }
    }

    @Override // defpackage.ijj
    public void setSupportButtonTintList(@Nullable ColorStateList colorStateList) {
        gb0 gb0Var = this.a;
        if (gb0Var != null) {
            gb0Var.a = colorStateList;
            gb0Var.c = true;
            gb0Var.a();
        }
    }

    @Override // defpackage.ijj
    public void setSupportButtonTintMode(@Nullable PorterDuff.Mode mode) {
        gb0 gb0Var = this.a;
        if (gb0Var != null) {
            gb0Var.b = mode;
            gb0Var.d = true;
            gb0Var.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList) {
        xc0 xc0Var = this.c;
        xc0Var.k(colorStateList);
        xc0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode mode) {
        xc0 xc0Var = this.c;
        xc0Var.l(mode);
        xc0Var.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(td4.d0(i, getContext()));
    }
}
