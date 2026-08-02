package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class t extends AutoCompleteTextView implements androidx.core.widget.m {
    private static final int[] TINT_ATTRS = {R.attr.popupBackground};

    @NonNull
    private final e0 mAppCompatEmojiEditTextHelper;
    private final u mBackgroundTintHelper;
    private final j1 mTextHelper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        z3.a(context);
        y3.a(this, getContext());
        c4 f6 = c4.f(getContext(), attributeSet, TINT_ATTRS, i5, 0);
        if (f6.f722b.hasValue(0)) {
            setDropDownBackgroundDrawable(f6.b(0));
        }
        f6.g();
        u uVar = new u(this);
        this.mBackgroundTintHelper = uVar;
        uVar.d(attributeSet, i5);
        j1 j1Var = new j1(this);
        this.mTextHelper = j1Var;
        j1Var.f(attributeSet, i5);
        j1Var.b();
        e0 e0Var = new e0(this);
        this.mAppCompatEmojiEditTextHelper = e0Var;
        e0Var.b(attributeSet, i5);
        initEmojiKeyListener(e0Var);
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

    public void initEmojiKeyListener(e0 e0Var) {
        KeyListener keyListener = getKeyListener();
        e0Var.getClass();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = super.isFocusable();
        boolean isClickable = super.isClickable();
        boolean isLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener a7 = e0Var.a(keyListener);
        if (a7 == keyListener) {
            return;
        }
        super.setKeyListener(a7);
        super.setRawInputType(inputType);
        super.setFocusable(isFocusable);
        super.setClickable(isClickable);
        super.setLongClickable(isLongClickable);
    }

    public boolean isEmojiCompatEnabled() {
        return ((l1.j) ((l1.a) this.mAppCompatEmojiEditTextHelper.f736b.f10882b).f19315c).f19334c;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        k2.x.x(editorInfo, onCreateInputConnection, this);
        return this.mAppCompatEmojiEditTextHelper.c(onCreateInputConnection, editorInfo);
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

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(com.google.android.play.core.appupdate.b.J(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i5) {
        setDropDownBackgroundDrawable(h8.b.n(getContext(), i5));
    }

    public void setEmojiCompatEnabled(boolean z5) {
        this.mAppCompatEmojiEditTextHelper.d(z5);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.mAppCompatEmojiEditTextHelper.a(keyListener));
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
}
