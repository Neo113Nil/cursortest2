package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class n1 extends TextView implements androidx.core.widget.m {
    private final u mBackgroundTintHelper;

    @NonNull
    private f0 mEmojiTextViewHelper;
    private boolean mIsSetTypefaceProcessing;
    private Future<o0.d> mPrecomputedTextFuture;
    private k1 mSuperCaller;
    private final b1 mTextClassifierHelper;
    private final j1 mTextHelper;

    public n1(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    @NonNull
    private f0 getEmojiTextViewHelper() {
        if (this.mEmojiTextViewHelper == null) {
            this.mEmojiTextViewHelper = new f0(this);
        }
        return this.mEmojiTextViewHelper;
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

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public k1 getSuperCaller() {
        if (this.mSuperCaller == null) {
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 34) {
                this.mSuperCaller = new m1(this);
            } else if (i5 >= 28) {
                this.mSuperCaller = new l1(this);
            } else if (i5 >= 26) {
                this.mSuperCaller = new r(this);
            }
        }
        return this.mSuperCaller;
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

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future<o0.d> future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                com.google.android.play.core.appupdate.b.t(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    @NonNull
    public TextClassifier getTextClassifier() {
        b1 b1Var;
        if (Build.VERSION.SDK_INT >= 28 || (b1Var = this.mTextClassifierHelper) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = b1Var.f705b;
        return textClassifier == null ? a1.a(b1Var.f704a) : textClassifier;
    }

    @NonNull
    public o0.c getTextMetricsParamsCompat() {
        return com.google.android.play.core.appupdate.b.t(this);
    }

    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().b();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.getClass();
        j1.h(editorInfo, onCreateInputConnection, this);
        k2.x.x(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 30 || i5 >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
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

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i5, int i10) {
        Future<o0.d> future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                com.google.android.play.core.appupdate.b.t(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i5, i10);
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
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        j1 j1Var = this.mTextHelper;
        if (j1Var != null) {
            j1Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        j1 j1Var = this.mTextHelper;
        if (j1Var != null) {
            j1Var.b();
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

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i5) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().b(i5);
        } else {
            com.google.android.play.core.appupdate.b.E(this, i5);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i5) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().a(i5);
        } else {
            com.google.android.play.core.appupdate.b.F(this, i5);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i5) {
        com.google.android.play.core.appupdate.b.G(this, i5);
    }

    public void setPrecomputedText(@NonNull o0.d dVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        com.google.android.play.core.appupdate.b.t(this);
        throw null;
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
    public void setTextClassifier(TextClassifier textClassifier) {
        b1 b1Var;
        if (Build.VERSION.SDK_INT >= 28 || (b1Var = this.mTextClassifierHelper) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            b1Var.f705b = textClassifier;
        }
    }

    public void setTextFuture(Future<o0.d> future) {
        this.mPrecomputedTextFuture = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(@NonNull o0.c cVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = cVar.f21071b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i5 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i5 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i5 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i5 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i5 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i5 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i5 = 7;
            }
        }
        setTextDirection(i5);
        getPaint().set(cVar.f21070a);
        setBreakStrategy(cVar.f21072c);
        setHyphenationFrequency(cVar.f21073d);
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

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i5) {
        Typeface typeface2;
        if (this.mIsSetTypefaceProcessing) {
            return;
        }
        if (typeface == null || i5 <= 0) {
            typeface2 = null;
        } else {
            Context context = getContext();
            a.a aVar = g0.g.f9683a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typeface2 = Typeface.create(typeface, i5);
        }
        this.mIsSetTypefaceProcessing = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i5);
        } finally {
            this.mIsSetTypefaceProcessing = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        z3.a(context);
        this.mIsSetTypefaceProcessing = false;
        this.mSuperCaller = null;
        y3.a(this, getContext());
        u uVar = new u(this);
        this.mBackgroundTintHelper = uVar;
        uVar.d(attributeSet, i5);
        j1 j1Var = new j1(this);
        this.mTextHelper = j1Var;
        j1Var.f(attributeSet, i5);
        j1Var.b();
        b1 b1Var = new b1();
        b1Var.f704a = this;
        this.mTextClassifierHelper = b1Var;
        getEmojiTextViewHelper().c(attributeSet, i5);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i5, float f6) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            getSuperCaller().d(i5, f6);
        } else if (i10 >= 34) {
            androidx.core.view.h0.m(this, i5, f6);
        } else {
            com.google.android.play.core.appupdate.b.G(this, Math.round(TypedValue.applyDimension(i5, f6, getResources().getDisplayMetrics())));
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i5, int i10, int i11, int i12) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i5 != 0 ? h8.b.n(context, i5) : null, i10 != 0 ? h8.b.n(context, i10) : null, i11 != 0 ? h8.b.n(context, i11) : null, i12 != 0 ? h8.b.n(context, i12) : null);
        j1 j1Var = this.mTextHelper;
        if (j1Var != null) {
            j1Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i5, int i10, int i11, int i12) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i5 != 0 ? h8.b.n(context, i5) : null, i10 != 0 ? h8.b.n(context, i10) : null, i11 != 0 ? h8.b.n(context, i11) : null, i12 != 0 ? h8.b.n(context, i12) : null);
        j1 j1Var = this.mTextHelper;
        if (j1Var != null) {
            j1Var.b();
        }
    }
}
