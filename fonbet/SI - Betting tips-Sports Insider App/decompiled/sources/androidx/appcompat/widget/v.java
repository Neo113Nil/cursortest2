package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class v extends Button implements androidx.core.widget.m {

    @NonNull
    private f0 mAppCompatEmojiTextHelper;
    private final u mBackgroundTintHelper;
    private final j1 mTextHelper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        z3.a(context);
        y3.a(this, getContext());
        u uVar = new u(this);
        this.mBackgroundTintHelper = uVar;
        uVar.d(attributeSet, i5);
        j1 j1Var = new j1(this);
        this.mTextHelper = j1Var;
        j1Var.f(attributeSet, i5);
        j1Var.b();
        getEmojiTextViewHelper().c(attributeSet, i5);
    }

    @NonNull
    private f0 getEmojiTextViewHelper() {
        if (this.mAppCompatEmojiTextHelper == null) {
            this.mAppCompatEmojiTextHelper = new f0(this);
        }
        return this.mAppCompatEmojiTextHelper;
    }

    @Override // android.widget.TextView, android.view.View
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

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (u4.f984c) {
            return super.getAutoSizeMaxTextSize();
        }
        j1 j1Var = this.mTextHelper;
        if (j1Var != null) {
            return Math.round(j1Var.f788i.f911e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (u4.f984c) {
            return super.getAutoSizeMinTextSize();
        }
        j1 j1Var = this.mTextHelper;
        if (j1Var != null) {
            return Math.round(j1Var.f788i.f910d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (u4.f984c) {
            return super.getAutoSizeStepGranularity();
        }
        j1 j1Var = this.mTextHelper;
        if (j1Var != null) {
            return Math.round(j1Var.f788i.f909c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (u4.f984c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        j1 j1Var = this.mTextHelper;
        return j1Var != null ? j1Var.f788i.f912f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (u4.f984c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        j1 j1Var = this.mTextHelper;
        if (j1Var != null) {
            return j1Var.f788i.f907a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return com.google.android.play.core.appupdate.b.I(super.getCustomSelectionActionModeCallback());
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

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.e();
    }

    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().b();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z5, int i5, int i10, int i11, int i12) {
        super.onLayout(z5, i5, i10, i11, i12);
        j1 j1Var = this.mTextHelper;
        if (j1Var == null || u4.f984c) {
            return;
        }
        j1Var.f788i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i5, int i10, int i11) {
        super.onTextChanged(charSequence, i5, i10, i11);
        j1 j1Var = this.mTextHelper;
        if (j1Var == null || u4.f984c || !j1Var.f788i.f()) {
            return;
        }
        this.mTextHelper.f788i.a();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z5) {
        super.setAllCaps(z5);
        getEmojiTextViewHelper().d(z5);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i5, int i10, int i11, int i12) throws IllegalArgumentException {
        if (u4.f984c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i5, i10, i11, i12);
            return;
        }
        j1 j1Var = this.mTextHelper;
        if (j1Var != null) {
            j1Var.i(i5, i10, i11, i12);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(@NonNull int[] iArr, int i5) throws IllegalArgumentException {
        if (u4.f984c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i5);
            return;
        }
        j1 j1Var = this.mTextHelper;
        if (j1Var != null) {
            j1Var.j(iArr, i5);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i5) {
        if (u4.f984c) {
            super.setAutoSizeTextTypeWithDefaults(i5);
            return;
        }
        j1 j1Var = this.mTextHelper;
        if (j1Var != null) {
            j1Var.k(i5);
        }
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

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(com.google.android.play.core.appupdate.b.J(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z5) {
        getEmojiTextViewHelper().e(z5);
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z5) {
        j1 j1Var = this.mTextHelper;
        if (j1Var != null) {
            j1Var.f780a.setAllCaps(z5);
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

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i5) {
        super.setTextAppearance(context, i5);
        j1 j1Var = this.mTextHelper;
        if (j1Var != null) {
            j1Var.g(context, i5);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i5, float f6) {
        boolean z5 = u4.f984c;
        if (z5) {
            super.setTextSize(i5, f6);
            return;
        }
        j1 j1Var = this.mTextHelper;
        if (j1Var != null) {
            s1 s1Var = j1Var.f788i;
            if (z5 || s1Var.f()) {
                return;
            }
            s1Var.g(f6, i5);
        }
    }
}
