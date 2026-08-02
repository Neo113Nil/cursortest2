package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.annotation.Nullable;
import defpackage.cb0;
import defpackage.dkf;
import defpackage.ic0;
import defpackage.jc0;
import defpackage.kc0;
import defpackage.l2a;
import defpackage.lc0;
import defpackage.lq3;
import defpackage.mc0;
import defpackage.pc0;
import defpackage.qc0;
import defpackage.td4;
import defpackage.wfj;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class b extends Spinner {
    public static final int[] i = {R.attr.spinnerMode};
    public final cb0 a;
    public final Context b;
    public final ic0 c;
    public SpinnerAdapter d;
    public final boolean e;
    public final qc0 f;
    public int g;
    public final Rect h;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005b, code lost:
    
        if (r7 == null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.sofascore.results.R.attr.spinnerStyle);
        TypedArray typedArray;
        this.h = new Rect();
        wfj.a(getContext(), this);
        int[] iArr = dkf.w;
        l2a y = l2a.y(com.sofascore.results.R.attr.spinnerStyle, 0, context, attributeSet, iArr);
        TypedArray typedArray2 = (TypedArray) y.c;
        this.a = new cb0(this);
        int resourceId = typedArray2.getResourceId(4, 0);
        if (resourceId != 0) {
            this.b = new lq3(context, resourceId);
        } else {
            this.b = context;
        }
        int i2 = -1;
        TypedArray typedArray3 = null;
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, i, com.sofascore.results.R.attr.spinnerStyle, 0);
        } catch (Exception unused) {
            typedArray = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (typedArray.hasValue(0)) {
                i2 = typedArray.getInt(0, 0);
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
            typedArray3 = typedArray;
            if (typedArray3 != null) {
                typedArray3.recycle();
            }
            throw th;
        }
        typedArray.recycle();
        if (i2 == 0) {
            lc0 lc0Var = new lc0(this);
            this.f = lc0Var;
            lc0Var.c = typedArray2.getString(2);
        } else if (i2 == 1) {
            pc0 pc0Var = new pc0(this, this.b, attributeSet);
            l2a y2 = l2a.y(com.sofascore.results.R.attr.spinnerStyle, 0, this.b, attributeSet, iArr);
            this.g = ((TypedArray) y2.c).getLayoutDimension(3, -2);
            pc0Var.o(y2.q(1));
            pc0Var.C = typedArray2.getString(2);
            y2.F();
            this.f = pc0Var;
            this.c = new ic0(this, this, pc0Var);
        }
        CharSequence[] textArray = typedArray2.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter.setDropDownViewResource(com.sofascore.results.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        y.F();
        this.e = true;
        SpinnerAdapter spinnerAdapter = this.d;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.d = null;
        }
        this.a.d(attributeSet, com.sofascore.results.R.attr.spinnerStyle);
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i2 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i3 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i3 = Math.max(i3, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i3;
        }
        Rect rect = this.h;
        drawable.getPadding(rect);
        return rect.left + rect.right + i3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        cb0 cb0Var = this.a;
        if (cb0Var != null) {
            cb0Var.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        qc0 qc0Var = this.f;
        return qc0Var != null ? qc0Var.b() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        qc0 qc0Var = this.f;
        return qc0Var != null ? qc0Var.l() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f != null ? this.g : super.getDropDownWidth();
    }

    public final qc0 getInternalPopup() {
        return this.f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        qc0 qc0Var = this.f;
        return qc0Var != null ? qc0Var.f() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        qc0 qc0Var = this.f;
        return qc0Var != null ? qc0Var.e() : super.getPrompt();
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

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qc0 qc0Var = this.f;
        if (qc0Var == null || !qc0Var.a()) {
            return;
        }
        qc0Var.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f == null || View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        AppCompatSpinner$SavedState appCompatSpinner$SavedState = (AppCompatSpinner$SavedState) parcelable;
        super.onRestoreInstanceState(appCompatSpinner$SavedState.getSuperState());
        if (!appCompatSpinner$SavedState.a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new jc0(this, 0));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        AppCompatSpinner$SavedState appCompatSpinner$SavedState = new AppCompatSpinner$SavedState(super.onSaveInstanceState());
        qc0 qc0Var = this.f;
        appCompatSpinner$SavedState.a = qc0Var != null && qc0Var.a();
        return appCompatSpinner$SavedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ic0 ic0Var = this.c;
        if (ic0Var == null || !ic0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        qc0 qc0Var = this.f;
        if (qc0Var == null) {
            return super.performClick();
        }
        if (qc0Var.a()) {
            return true;
        }
        qc0Var.k(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.e) {
            this.d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        qc0 qc0Var = this.f;
        if (qc0Var != null) {
            Context context = this.b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            mc0 mc0Var = new mc0();
            mc0Var.a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                mc0Var.b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                kc0.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            qc0Var.m(mc0Var);
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
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        cb0 cb0Var = this.a;
        if (cb0Var != null) {
            cb0Var.f(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i2) {
        qc0 qc0Var = this.f;
        if (qc0Var == null) {
            super.setDropDownHorizontalOffset(i2);
        } else {
            qc0Var.j(i2);
            qc0Var.d(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i2) {
        qc0 qc0Var = this.f;
        if (qc0Var != null) {
            qc0Var.i(i2);
        } else {
            super.setDropDownVerticalOffset(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i2) {
        if (this.f != null) {
            this.g = i2;
        } else {
            super.setDropDownWidth(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        qc0 qc0Var = this.f;
        if (qc0Var != null) {
            qc0Var.o(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(td4.d0(i2, getPopupContext()));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        qc0 qc0Var = this.f;
        if (qc0Var != null) {
            qc0Var.g(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
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
}
