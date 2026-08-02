package androidx.appcompat.widget;

import android.R;
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
import defpackage.a70;
import defpackage.ac0;
import defpackage.ad0;
import defpackage.cb0;
import defpackage.dad;
import defpackage.f3f;
import defpackage.f4a;
import defpackage.fd0;
import defpackage.fs0;
import defpackage.g3f;
import defpackage.gjj;
import defpackage.h5a;
import defpackage.i9a;
import defpackage.lvk;
import defpackage.lz;
import defpackage.q9;
import defpackage.rc0;
import defpackage.td4;
import defpackage.wfj;
import defpackage.x5k;
import defpackage.xc0;
import defpackage.xw3;
import defpackage.yc0;
import defpackage.zc0;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class AppCompatTextView extends TextView implements fs0 {
    public final cb0 a;
    public final xc0 b;
    public final f4a c;
    public ac0 d;
    public boolean e;
    public dad f;
    public Future g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        gjj.a(context);
        this.e = false;
        this.f = null;
        wfj.a(getContext(), this);
        cb0 cb0Var = new cb0(this);
        this.a = cb0Var;
        cb0Var.d(attributeSet, i);
        xc0 xc0Var = new xc0(this);
        this.b = xc0Var;
        xc0Var.f(attributeSet, i);
        xc0Var.b();
        f4a f4aVar = new f4a((char) 0, 20);
        f4aVar.b = this;
        this.c = f4aVar;
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

    @Override // android.widget.TextView, android.view.View
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

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (lvk.c) {
            return super.getAutoSizeMaxTextSize();
        }
        xc0 xc0Var = this.b;
        if (xc0Var != null) {
            return Math.round(xc0Var.i.e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (lvk.c) {
            return super.getAutoSizeMinTextSize();
        }
        xc0 xc0Var = this.b;
        if (xc0Var != null) {
            return Math.round(xc0Var.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (lvk.c) {
            return super.getAutoSizeStepGranularity();
        }
        xc0 xc0Var = this.b;
        if (xc0Var != null) {
            return Math.round(xc0Var.i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (lvk.c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        xc0 xc0Var = this.b;
        return xc0Var != null ? xc0Var.i.f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (lvk.c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        xc0 xc0Var = this.b;
        if (xc0Var != null) {
            return xc0Var.i.a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    @Nullable
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return i9a.N(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public yc0 getSuperCaller() {
        dad dadVar = this.f;
        if (dadVar != null) {
            return dadVar;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            ad0 ad0Var = new ad0(this);
            this.f = ad0Var;
            return ad0Var;
        }
        if (i >= 28) {
            zc0 zc0Var = new zc0(this);
            this.f = zc0Var;
            return zc0Var;
        }
        dad dadVar2 = new dad(this, 7);
        this.f = dadVar2;
        return dadVar2;
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
    public CharSequence getText() {
        Future future = this.g;
        if (future != null) {
            try {
                this.g = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                i9a.D(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    @NonNull
    public TextClassifier getTextClassifier() {
        f4a f4aVar;
        if (Build.VERSION.SDK_INT >= 28 || (f4aVar = this.c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) f4aVar.c;
        return textClassifier == null ? rc0.a((TextView) f4aVar.b) : textClassifier;
    }

    @NonNull
    public f3f getTextMetricsParamsCompat() {
        return i9a.D(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.b.getClass();
        if (Build.VERSION.SDK_INT < 30 && onCreateInputConnection != null) {
            lz.M(editorInfo, getText());
        }
        xw3.N(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        xc0 xc0Var = this.b;
        if (xc0Var == null || lvk.c) {
            return;
        }
        xc0Var.i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Future future = this.g;
        if (future != null) {
            try {
                this.g = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                i9a.D(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        xc0 xc0Var = this.b;
        if (xc0Var != null) {
            fd0 fd0Var = xc0Var.i;
            if (lvk.c || !fd0Var.e()) {
                return;
            }
            fd0Var.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView, defpackage.fs0
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (lvk.c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        xc0 xc0Var = this.b;
        if (xc0Var != null) {
            xc0Var.h(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (lvk.c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        xc0 xc0Var = this.b;
        if (xc0Var != null) {
            xc0Var.i(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (lvk.c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        xc0 xc0Var = this.b;
        if (xc0Var != null) {
            xc0Var.j(i);
        }
    }

    @Override // android.view.View
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

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? td4.d0(i, context) : null, i2 != 0 ? td4.d0(i2, context) : null, i3 != 0 ? td4.d0(i3, context) : null, i4 != 0 ? td4.d0(i4, context) : null);
        xc0 xc0Var = this.b;
        if (xc0Var != null) {
            xc0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? td4.d0(i, context) : null, i2 != 0 ? td4.d0(i2, context) : null, i3 != 0 ? td4.d0(i3, context) : null, i4 != 0 ? td4.d0(i4, context) : null);
        xc0 xc0Var = this.b;
        if (xc0Var != null) {
            xc0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@Nullable ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i9a.O(callback, this));
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
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().n(i);
        } else {
            i9a.I(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().g(i);
        } else {
            i9a.J(this, i);
        }
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            getSuperCaller().i(i, f);
        } else if (i2 >= 34) {
            q9.H(this, i, f);
        } else {
            i9a.K(this, Math.round(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics())));
        }
    }

    public void setPrecomputedText(@NonNull g3f g3fVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        i9a.D(this);
        throw null;
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

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        xc0 xc0Var = this.b;
        if (xc0Var != null) {
            xc0Var.g(i, context);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(@Nullable TextClassifier textClassifier) {
        f4a f4aVar;
        if (Build.VERSION.SDK_INT >= 28 || (f4aVar = this.c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            f4aVar.c = textClassifier;
        }
    }

    public void setTextFuture(@Nullable Future<g3f> future) {
        this.g = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(@NonNull f3f f3fVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = f3fVar.b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i = 7;
            }
        }
        setTextDirection(i);
        getPaint().set(f3fVar.a);
        setBreakStrategy(f3fVar.c);
        setHyphenationFrequency(f3fVar.d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        boolean z = lvk.c;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        xc0 xc0Var = this.b;
        if (xc0Var != null) {
            fd0 fd0Var = xc0Var.i;
            if (z || fd0Var.e()) {
                return;
            }
            fd0Var.f(f, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typeface2;
        if (this.e) {
            return;
        }
        if (typeface == null || i <= 0) {
            typeface2 = null;
        } else {
            Context context = getContext();
            h5a h5aVar = x5k.a;
            if (context == null) {
                a70.p("Context cannot be null");
                return;
            }
            typeface2 = Typeface.create(typeface, i);
        }
        this.e = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.e = false;
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        i9a.K(this, i);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        xc0 xc0Var = this.b;
        if (xc0Var != null) {
            xc0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        xc0 xc0Var = this.b;
        if (xc0Var != null) {
            xc0Var.b();
        }
    }

    public AppCompatTextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }
}
