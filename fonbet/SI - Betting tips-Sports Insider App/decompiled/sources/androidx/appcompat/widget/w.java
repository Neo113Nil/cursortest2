package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class w extends CheckBox implements androidx.core.widget.l, androidx.core.widget.m {
    private f0 mAppCompatEmojiTextHelper;
    private final u mBackgroundTintHelper;
    private final z mCompoundButtonHelper;
    private final j1 mTextHelper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        z3.a(context);
        y3.a(this, getContext());
        z zVar = new z(this);
        this.mCompoundButtonHelper = zVar;
        zVar.b(attributeSet, i5);
        u uVar = new u(this);
        this.mBackgroundTintHelper = uVar;
        uVar.d(attributeSet, i5);
        j1 j1Var = new j1(this);
        this.mTextHelper = j1Var;
        j1Var.f(attributeSet, i5);
        getEmojiTextViewHelper().c(attributeSet, i5);
    }

    @NonNull
    private f0 getEmojiTextViewHelper() {
        if (this.mAppCompatEmojiTextHelper == null) {
            this.mAppCompatEmojiTextHelper = new f0(this);
        }
        return this.mAppCompatEmojiTextHelper;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        u uVar = this.mBackgroundTintHelper;
        if (uVar != null) {
            uVar.a();
        }
        j1 j1Var = this.mTextHelper;
        if (j1Var != null) {
            j1Var.b();
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

    @Override // androidx.core.widget.l
    public ColorStateList getSupportButtonTintList() {
        z zVar = this.mCompoundButtonHelper;
        if (zVar != null) {
            return zVar.f1019b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        z zVar = this.mCompoundButtonHelper;
        if (zVar != null) {
            return zVar.f1020c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.e();
    }

    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().b();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z5) {
        super.setAllCaps(z5);
        getEmojiTextViewHelper().d(z5);
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

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        z zVar = this.mCompoundButtonHelper;
        if (zVar != null) {
            if (zVar.f1023f) {
                zVar.f1023f = false;
            } else {
                zVar.f1023f = true;
                zVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        j1 j1Var = this.mTextHelper;
        if (j1Var != null) {
            j1Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        j1 j1Var = this.mTextHelper;
        if (j1Var != null) {
            j1Var.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z5) {
        getEmojiTextViewHelper().e(z5);
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
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

    @Override // androidx.core.widget.l
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        z zVar = this.mCompoundButtonHelper;
        if (zVar != null) {
            zVar.f1019b = colorStateList;
            zVar.f1021d = true;
            zVar.a();
        }
    }

    @Override // androidx.core.widget.l
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        z zVar = this.mCompoundButtonHelper;
        if (zVar != null) {
            zVar.f1020c = mode;
            zVar.f1022e = true;
            zVar.a();
        }
    }

    @Override // androidx.core.widget.m
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.l(colorStateList);
        this.mTextHelper.b();
    }

    @Override // androidx.core.widget.m
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.m(mode);
        this.mTextHelper.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i5) {
        setButtonDrawable(h8.b.n(getContext(), i5));
    }
}
