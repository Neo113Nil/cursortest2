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
import androidx.annotation.Nullable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import xsna.aup0;
import xsna.dxc0;
import xsna.f23;
import xsna.f33;
import xsna.hno0;
import xsna.hup0;
import xsna.k4p;
import xsna.m33;
import xsna.o33;
import xsna.p33;
import xsna.qpo0;
import xsna.uyo0;
import xsna.y6l;

/* loaded from: classes.dex */
public class AppCompatTextView extends TextView {
    private final f23 mBackgroundTintHelper;

    @NonNull
    private f33 mEmojiTextViewHelper;
    private boolean mIsSetTypefaceProcessing;

    @Nullable
    private Future<dxc0> mPrecomputedTextFuture;

    @Nullable
    private a mSuperCaller;
    private final o33 mTextClassifierHelper;
    private final p33 mTextHelper;

    /* loaded from: classes11.dex */
    public interface a {
        void a(int i);

        void b(int i);

        void c(int i, float f);
    }

    /* loaded from: classes11.dex */
    public class c extends b {
        public c() {
            super();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public final void a(int i) {
            AppCompatTextView.super.setFirstBaselineToTopHeight(i);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public final void b(int i) {
            AppCompatTextView.super.setLastBaselineToBottomHeight(i);
        }
    }

    /* loaded from: classes11.dex */
    public class d extends c {
        public d() {
            super();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.b, androidx.appcompat.widget.AppCompatTextView.a
        public final void c(int i, float f) {
            AppCompatTextView.super.setLineHeight(i, f);
        }
    }

    public AppCompatTextView(@NonNull Context context) {
        this(context, null);
    }

    private void consumeTextFutureAndSetBlocking() {
        Future<dxc0> future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                hno0.c(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @NonNull
    private f33 getEmojiTextViewHelper() {
        if (this.mEmojiTextViewHelper == null) {
            this.mEmojiTextViewHelper = new f33(this);
        }
        return this.mEmojiTextViewHelper;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        f23 f23Var = this.mBackgroundTintHelper;
        if (f23Var != null) {
            f23Var.a();
        }
        p33 p33Var = this.mTextHelper;
        if (p33Var != null) {
            p33Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        return ((b) getSuperCaller()).d();
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        return ((b) getSuperCaller()).e();
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        return ((b) getSuperCaller()).f();
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        return ((b) getSuperCaller()).g();
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        return ((b) getSuperCaller()).h() == 1 ? 1 : 0;
    }

    @Override // android.widget.TextView
    @Nullable
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return hno0.d(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public a getSuperCaller() {
        if (this.mSuperCaller == null) {
            if (Build.VERSION.SDK_INT >= 34) {
                this.mSuperCaller = new d();
            } else {
                this.mSuperCaller = new c();
            }
        }
        return this.mSuperCaller;
    }

    @Nullable
    public ColorStateList getSupportBackgroundTintList() {
        f23 f23Var = this.mBackgroundTintHelper;
        if (f23Var != null) {
            return f23Var.b();
        }
        return null;
    }

    @Nullable
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        f23 f23Var = this.mBackgroundTintHelper;
        if (f23Var != null) {
            return f23Var.c();
        }
        return null;
    }

    @Nullable
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.d();
    }

    @Nullable
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        consumeTextFutureAndSetBlocking();
        return super.getText();
    }

    @Override // android.widget.TextView
    @NonNull
    public TextClassifier getTextClassifier() {
        return ((b) getSuperCaller()).i();
    }

    @NonNull
    public dxc0.a getTextMetricsParamsCompat() {
        return new dxc0.a(hno0.a.a(this));
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.getClass();
        if (Build.VERSION.SDK_INT < 30 && onCreateInputConnection != null) {
            k4p.b(editorInfo, getText());
        }
        y6l.b(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        p33 p33Var = this.mTextHelper;
        if (p33Var != null) {
            p33Var.getClass();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        consumeTextFutureAndSetBlocking();
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        ((b) getSuperCaller()).j(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(@NonNull int[] iArr, int i) throws IllegalArgumentException {
        ((b) getSuperCaller()).k(iArr, i);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        ((b) getSuperCaller()).l(i);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        f23 f23Var = this.mBackgroundTintHelper;
        if (f23Var != null) {
            f23Var.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        f23 f23Var = this.mBackgroundTintHelper;
        if (f23Var != null) {
            f23Var.f(i);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        p33 p33Var = this.mTextHelper;
        if (p33Var != null) {
            p33Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        p33 p33Var = this.mTextHelper;
        if (p33Var != null) {
            p33Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        p33 p33Var = this.mTextHelper;
        if (p33Var != null) {
            p33Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        p33 p33Var = this.mTextHelper;
        if (p33Var != null) {
            p33Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@Nullable ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        getSuperCaller().a(i);
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        getSuperCaller().b(i);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        hno0.b(this, i);
    }

    public void setPrecomputedText(@NonNull dxc0 dxc0Var) {
        hno0.c(this, dxc0Var);
    }

    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        f23 f23Var = this.mBackgroundTintHelper;
        if (f23Var != null) {
            f23Var.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        f23 f23Var = this.mBackgroundTintHelper;
        if (f23Var != null) {
            f23Var.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList) {
        this.mTextHelper.h(colorStateList);
        this.mTextHelper.b();
    }

    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode mode) {
        this.mTextHelper.i(mode);
        this.mTextHelper.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        p33 p33Var = this.mTextHelper;
        if (p33Var != null) {
            p33Var.g(i, context);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(@Nullable TextClassifier textClassifier) {
        ((b) getSuperCaller()).m(textClassifier);
    }

    public void setTextFuture(@Nullable Future<dxc0> future) {
        this.mPrecomputedTextFuture = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(@NonNull dxc0.a aVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic d2 = aVar.d();
        TextDirectionHeuristic textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (d2 != textDirectionHeuristic2 && d2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (d2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (d2 == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (d2 == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (d2 == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (d2 == textDirectionHeuristic) {
                i = 6;
            } else if (d2 == textDirectionHeuristic2) {
                i = 7;
            }
        }
        setTextDirection(i);
        getPaint().set(aVar.e());
        setBreakStrategy(aVar.b());
        setHyphenationFrequency(aVar.c());
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        super.setTextSize(i, f);
    }

    @Override // android.widget.TextView
    public void setTypeface(@Nullable Typeface typeface, int i) {
        Typeface typeface2;
        if (this.mIsSetTypefaceProcessing) {
            return;
        }
        if (typeface == null || i <= 0) {
            typeface2 = null;
        } else {
            Context context = getContext();
            hup0 hup0Var = aup0.a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typeface2 = Typeface.create(typeface, i);
        }
        this.mIsSetTypefaceProcessing = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.mIsSetTypefaceProcessing = false;
        }
    }

    public AppCompatTextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i, float f) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            getSuperCaller().c(i, f);
        } else if (i2 >= 34) {
            hno0.b.a(this, i, f);
        } else {
            hno0.b(this, Math.round(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics())));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatTextView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        uyo0.a(context);
        this.mIsSetTypefaceProcessing = false;
        this.mSuperCaller = null;
        qpo0.a(getContext(), this);
        f23 f23Var = new f23(this);
        this.mBackgroundTintHelper = f23Var;
        f23Var.d(attributeSet, i);
        p33 p33Var = new p33(this);
        this.mTextHelper = p33Var;
        p33Var.f(attributeSet, i);
        p33Var.b();
        this.mTextClassifierHelper = new o33();
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? m33.a(i, context) : null, i2 != 0 ? m33.a(i2, context) : null, i3 != 0 ? m33.a(i3, context) : null, i4 != 0 ? m33.a(i4, context) : null);
        p33 p33Var = this.mTextHelper;
        if (p33Var != null) {
            p33Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? m33.a(i, context) : null, i2 != 0 ? m33.a(i2, context) : null, i3 != 0 ? m33.a(i3, context) : null, i4 != 0 ? m33.a(i4, context) : null);
        p33 p33Var = this.mTextHelper;
        if (p33Var != null) {
            p33Var.b();
        }
    }

    /* loaded from: classes11.dex */
    public class b implements a {
        public b() {
        }

        public final int d() {
            return AppCompatTextView.super.getAutoSizeMaxTextSize();
        }

        public final int e() {
            return AppCompatTextView.super.getAutoSizeMinTextSize();
        }

        public final int f() {
            return AppCompatTextView.super.getAutoSizeStepGranularity();
        }

        public final int[] g() {
            return AppCompatTextView.super.getAutoSizeTextAvailableSizes();
        }

        public final int h() {
            return AppCompatTextView.super.getAutoSizeTextType();
        }

        public final TextClassifier i() {
            return AppCompatTextView.super.getTextClassifier();
        }

        public final void j(int i, int i2, int i3, int i4) {
            AppCompatTextView.super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        public final void k(int[] iArr, int i) {
            AppCompatTextView.super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        public final void l(int i) {
            AppCompatTextView.super.setAutoSizeTextTypeWithDefaults(i);
        }

        public final void m(@Nullable TextClassifier textClassifier) {
            AppCompatTextView.super.setTextClassifier(textClassifier);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void c(int i, float f) {
        }
    }
}
