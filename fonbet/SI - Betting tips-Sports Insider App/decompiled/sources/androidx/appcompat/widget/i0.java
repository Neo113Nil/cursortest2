package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i0 extends MultiAutoCompleteTextView implements androidx.core.widget.m {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f772d = {R.attr.popupBackground};

    /* renamed from: a, reason: collision with root package name */
    public final u f773a;

    /* renamed from: b, reason: collision with root package name */
    public final j1 f774b;

    /* renamed from: c, reason: collision with root package name */
    public final e0 f775c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.sports.insider.R.attr.autoCompleteTextViewStyle);
        z3.a(context);
        y3.a(this, getContext());
        c4 f6 = c4.f(getContext(), attributeSet, f772d, com.sports.insider.R.attr.autoCompleteTextViewStyle, 0);
        if (f6.f722b.hasValue(0)) {
            setDropDownBackgroundDrawable(f6.b(0));
        }
        f6.g();
        u uVar = new u(this);
        this.f773a = uVar;
        uVar.d(attributeSet, com.sports.insider.R.attr.autoCompleteTextViewStyle);
        j1 j1Var = new j1(this);
        this.f774b = j1Var;
        j1Var.f(attributeSet, com.sports.insider.R.attr.autoCompleteTextViewStyle);
        j1Var.b();
        e0 e0Var = new e0(this);
        this.f775c = e0Var;
        e0Var.b(attributeSet, com.sports.insider.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = isFocusable();
        boolean isClickable = isClickable();
        boolean isLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener a7 = e0Var.a(keyListener);
        if (a7 == keyListener) {
            return;
        }
        super.setKeyListener(a7);
        setRawInputType(inputType);
        setFocusable(isFocusable);
        setClickable(isClickable);
        setLongClickable(isLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        u uVar = this.f773a;
        if (uVar != null) {
            uVar.a();
        }
        j1 j1Var = this.f774b;
        if (j1Var != null) {
            j1Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        u uVar = this.f773a;
        if (uVar != null) {
            return uVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        u uVar = this.f773a;
        if (uVar != null) {
            return uVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f774b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f774b.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        k2.x.x(editorInfo, onCreateInputConnection, this);
        return this.f775c.c(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        u uVar = this.f773a;
        if (uVar != null) {
            uVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i5) {
        super.setBackgroundResource(i5);
        u uVar = this.f773a;
        if (uVar != null) {
            uVar.f(i5);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        j1 j1Var = this.f774b;
        if (j1Var != null) {
            j1Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        j1 j1Var = this.f774b;
        if (j1Var != null) {
            j1Var.b();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i5) {
        setDropDownBackgroundDrawable(h8.b.n(getContext(), i5));
    }

    public void setEmojiCompatEnabled(boolean z5) {
        this.f775c.d(z5);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f775c.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        u uVar = this.f773a;
        if (uVar != null) {
            uVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        u uVar = this.f773a;
        if (uVar != null) {
            uVar.i(mode);
        }
    }

    @Override // androidx.core.widget.m
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        j1 j1Var = this.f774b;
        j1Var.l(colorStateList);
        j1Var.b();
    }

    @Override // androidx.core.widget.m
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        j1 j1Var = this.f774b;
        j1Var.m(mode);
        j1Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i5) {
        super.setTextAppearance(context, i5);
        j1 j1Var = this.f774b;
        if (j1Var != null) {
            j1Var.g(context, i5);
        }
    }
}
