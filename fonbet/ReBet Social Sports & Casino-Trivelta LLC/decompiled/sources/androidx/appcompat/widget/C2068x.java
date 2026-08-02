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
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import n.AbstractC5596a;
import w0.m;

/* renamed from: androidx.appcompat.widget.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2068x extends TextView {
    private final C2049d mBackgroundTintHelper;

    @NonNull
    private C2055j mEmojiTextViewHelper;
    private boolean mIsSetTypefaceProcessing;
    private Future<w0.m> mPrecomputedTextFuture;
    private a mSuperCaller;
    private final C2066v mTextClassifierHelper;
    private final C2067w mTextHelper;

    /* renamed from: androidx.appcompat.widget.x$a */
    public interface a {
        void a(int[] iArr, int i10);

        void b(int i10);

        int c();

        int d();

        void e(int i10, float f10);

        int[] f();

        TextClassifier g();

        int h();

        void i(TextClassifier textClassifier);

        void j(int i10, int i11, int i12, int i13);

        void k(int i10);

        int l();

        void m(int i10);
    }

    /* renamed from: androidx.appcompat.widget.x$b */
    public class b implements a {
        public b() {
        }

        @Override // androidx.appcompat.widget.C2068x.a
        public void a(int[] iArr, int i10) {
            C2068x.super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        @Override // androidx.appcompat.widget.C2068x.a
        public void b(int i10) {
        }

        @Override // androidx.appcompat.widget.C2068x.a
        public int c() {
            return C2068x.super.getAutoSizeTextType();
        }

        @Override // androidx.appcompat.widget.C2068x.a
        public int d() {
            return C2068x.super.getAutoSizeMinTextSize();
        }

        @Override // androidx.appcompat.widget.C2068x.a
        public void e(int i10, float f10) {
        }

        @Override // androidx.appcompat.widget.C2068x.a
        public int[] f() {
            return C2068x.super.getAutoSizeTextAvailableSizes();
        }

        @Override // androidx.appcompat.widget.C2068x.a
        public TextClassifier g() {
            return C2068x.super.getTextClassifier();
        }

        @Override // androidx.appcompat.widget.C2068x.a
        public int h() {
            return C2068x.super.getAutoSizeMaxTextSize();
        }

        @Override // androidx.appcompat.widget.C2068x.a
        public void i(TextClassifier textClassifier) {
            C2068x.super.setTextClassifier(textClassifier);
        }

        @Override // androidx.appcompat.widget.C2068x.a
        public void j(int i10, int i11, int i12, int i13) {
            C2068x.super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }

        @Override // androidx.appcompat.widget.C2068x.a
        public void k(int i10) {
        }

        @Override // androidx.appcompat.widget.C2068x.a
        public int l() {
            return C2068x.super.getAutoSizeStepGranularity();
        }

        @Override // androidx.appcompat.widget.C2068x.a
        public void m(int i10) {
            C2068x.super.setAutoSizeTextTypeWithDefaults(i10);
        }
    }

    /* renamed from: androidx.appcompat.widget.x$c */
    public class c extends b {
        public c() {
            super();
        }

        @Override // androidx.appcompat.widget.C2068x.b, androidx.appcompat.widget.C2068x.a
        public void b(int i10) {
            C2068x.super.setLastBaselineToBottomHeight(i10);
        }

        @Override // androidx.appcompat.widget.C2068x.b, androidx.appcompat.widget.C2068x.a
        public void k(int i10) {
            C2068x.super.setFirstBaselineToTopHeight(i10);
        }
    }

    /* renamed from: androidx.appcompat.widget.x$d */
    public class d extends c {
        public d() {
            super();
        }

        @Override // androidx.appcompat.widget.C2068x.b, androidx.appcompat.widget.C2068x.a
        public void e(int i10, float f10) {
            C2068x.super.setLineHeight(i10, f10);
        }
    }

    public C2068x(Context context) {
        this(context, null);
    }

    @NonNull
    private C2055j getEmojiTextViewHelper() {
        if (this.mEmojiTextViewHelper == null) {
            this.mEmojiTextViewHelper = new C2055j(this);
        }
        return this.mEmojiTextViewHelper;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C2049d c2049d = this.mBackgroundTintHelper;
        if (c2049d != null) {
            c2049d.b();
        }
        C2067w c2067w = this.mTextHelper;
        if (c2067w != null) {
            c2067w.b();
        }
    }

    public final void e() {
        Future<w0.m> future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                android.support.v4.media.session.b.a(future.get());
                C0.j.l(this, null);
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (l0.f17341c) {
            return getSuperCaller().h();
        }
        C2067w c2067w = this.mTextHelper;
        if (c2067w != null) {
            return c2067w.e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (l0.f17341c) {
            return getSuperCaller().d();
        }
        C2067w c2067w = this.mTextHelper;
        if (c2067w != null) {
            return c2067w.f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (l0.f17341c) {
            return getSuperCaller().l();
        }
        C2067w c2067w = this.mTextHelper;
        if (c2067w != null) {
            return c2067w.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (l0.f17341c) {
            return getSuperCaller().f();
        }
        C2067w c2067w = this.mTextHelper;
        return c2067w != null ? c2067w.h() : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (l0.f17341c) {
            return getSuperCaller().c() == 1 ? 1 : 0;
        }
        C2067w c2067w = this.mTextHelper;
        if (c2067w != null) {
            return c2067w.i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C0.j.o(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return C0.j.a(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return C0.j.b(this);
    }

    public a getSuperCaller() {
        if (this.mSuperCaller == null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 34) {
                this.mSuperCaller = new d();
            } else if (i10 >= 28) {
                this.mSuperCaller = new c();
            } else if (i10 >= 26) {
                this.mSuperCaller = new b();
            }
        }
        return this.mSuperCaller;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2049d c2049d = this.mBackgroundTintHelper;
        if (c2049d != null) {
            return c2049d.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2049d c2049d = this.mBackgroundTintHelper;
        if (c2049d != null) {
            return c2049d.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.k();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        e();
        return super.getText();
    }

    @Override // android.widget.TextView
    @NonNull
    public TextClassifier getTextClassifier() {
        C2066v c2066v;
        return (Build.VERSION.SDK_INT >= 28 || (c2066v = this.mTextClassifierHelper) == null) ? getSuperCaller().g() : c2066v.a();
    }

    @NonNull
    public m.a getTextMetricsParamsCompat() {
        return C0.j.e(this);
    }

    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().b();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.r(this, onCreateInputConnection, editorInfo);
        return AbstractC2056k.a(onCreateInputConnection, editorInfo, this);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30 || i10 >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        C2067w c2067w = this.mTextHelper;
        if (c2067w != null) {
            c2067w.o(z10, i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        e();
        super.onMeasure(i10, i11);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        C2067w c2067w = this.mTextHelper;
        if (c2067w == null || l0.f17341c || !c2067w.l()) {
            return;
        }
        this.mTextHelper.c();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        if (l0.f17341c) {
            getSuperCaller().j(i10, i11, i12, i13);
            return;
        }
        C2067w c2067w = this.mTextHelper;
        if (c2067w != null) {
            c2067w.t(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(@NonNull int[] iArr, int i10) {
        if (l0.f17341c) {
            getSuperCaller().a(iArr, i10);
            return;
        }
        C2067w c2067w = this.mTextHelper;
        if (c2067w != null) {
            c2067w.u(iArr, i10);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (l0.f17341c) {
            getSuperCaller().m(i10);
            return;
        }
        C2067w c2067w = this.mTextHelper;
        if (c2067w != null) {
            c2067w.v(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2049d c2049d = this.mBackgroundTintHelper;
        if (c2049d != null) {
            c2049d.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C2049d c2049d = this.mBackgroundTintHelper;
        if (c2049d != null) {
            c2049d.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C2067w c2067w = this.mTextHelper;
        if (c2067w != null) {
            c2067w.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C2067w c2067w = this.mTextHelper;
        if (c2067w != null) {
            c2067w.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C2067w c2067w = this.mTextHelper;
        if (c2067w != null) {
            c2067w.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C2067w c2067w = this.mTextHelper;
        if (c2067w != null) {
            c2067w.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0.j.p(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().e(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().k(i10);
        } else {
            C0.j.h(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().b(i10);
        } else {
            C0.j.i(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i10) {
        C0.j.j(this, i10);
    }

    public void setPrecomputedText(@NonNull w0.m mVar) {
        C0.j.l(this, mVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2049d c2049d = this.mBackgroundTintHelper;
        if (c2049d != null) {
            c2049d.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2049d c2049d = this.mBackgroundTintHelper;
        if (c2049d != null) {
            c2049d.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.w(colorStateList);
        this.mTextHelper.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.x(mode);
        this.mTextHelper.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C2067w c2067w = this.mTextHelper;
        if (c2067w != null) {
            c2067w.q(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C2066v c2066v;
        if (Build.VERSION.SDK_INT >= 28 || (c2066v = this.mTextClassifierHelper) == null) {
            getSuperCaller().i(textClassifier);
        } else {
            c2066v.b(textClassifier);
        }
    }

    public void setTextFuture(Future<w0.m> future) {
        this.mPrecomputedTextFuture = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(@NonNull m.a aVar) {
        C0.j.n(this, aVar);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        if (l0.f17341c) {
            super.setTextSize(i10, f10);
            return;
        }
        C2067w c2067w = this.mTextHelper;
        if (c2067w != null) {
            c2067w.A(i10, f10);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i10) {
        if (this.mIsSetTypefaceProcessing) {
            return;
        }
        Typeface a10 = (typeface == null || i10 <= 0) ? null : androidx.core.graphics.v.a(getContext(), typeface, i10);
        this.mIsSetTypefaceProcessing = true;
        if (a10 != null) {
            typeface = a10;
        }
        try {
            super.setTypeface(typeface, i10);
        } finally {
            this.mIsSetTypefaceProcessing = false;
        }
    }

    public C2068x(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i10, float f10) {
        if (Build.VERSION.SDK_INT >= 34) {
            getSuperCaller().e(i10, f10);
        } else {
            C0.j.k(this, i10, f10);
        }
    }

    public C2068x(Context context, AttributeSet attributeSet, int i10) {
        super(X.b(context), attributeSet, i10);
        this.mIsSetTypefaceProcessing = false;
        this.mSuperCaller = null;
        W.a(this, getContext());
        C2049d c2049d = new C2049d(this);
        this.mBackgroundTintHelper = c2049d;
        c2049d.e(attributeSet, i10);
        C2067w c2067w = new C2067w(this);
        this.mTextHelper = c2067w;
        c2067w.m(attributeSet, i10);
        c2067w.b();
        this.mTextClassifierHelper = new C2066v(this);
        getEmojiTextViewHelper().c(attributeSet, i10);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i10 != 0 ? AbstractC5596a.b(context, i10) : null, i11 != 0 ? AbstractC5596a.b(context, i11) : null, i12 != 0 ? AbstractC5596a.b(context, i12) : null, i13 != 0 ? AbstractC5596a.b(context, i13) : null);
        C2067w c2067w = this.mTextHelper;
        if (c2067w != null) {
            c2067w.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i10 != 0 ? AbstractC5596a.b(context, i10) : null, i11 != 0 ? AbstractC5596a.b(context, i11) : null, i12 != 0 ? AbstractC5596a.b(context, i12) : null, i13 != 0 ? AbstractC5596a.b(context, i13) : null);
        C2067w c2067w = this.mTextHelper;
        if (c2067w != null) {
            c2067w.p();
        }
    }
}
