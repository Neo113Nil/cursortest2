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
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class z0 extends Spinner {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f1024i = {R.attr.spinnerMode};

    /* renamed from: a, reason: collision with root package name */
    public final u f1025a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f1026b;

    /* renamed from: c, reason: collision with root package name */
    public final q0 f1027c;

    /* renamed from: d, reason: collision with root package name */
    public SpinnerAdapter f1028d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1029e;

    /* renamed from: f, reason: collision with root package name */
    public final y0 f1030f;

    /* renamed from: g, reason: collision with root package name */
    public int f1031g;

    /* renamed from: h, reason: collision with root package name */
    public final Rect f1032h;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005e, code lost:
    
        if (r7 == null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public z0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.sports.insider.R.attr.spinnerStyle);
        TypedArray typedArray;
        this.f1032h = new Rect();
        y3.a(this, getContext());
        int[] iArr = i.a.f10850w;
        c4 f6 = c4.f(context, attributeSet, iArr, com.sports.insider.R.attr.spinnerStyle, 0);
        TypedArray typedArray2 = f6.f722b;
        this.f1025a = new u(this);
        int resourceId = typedArray2.getResourceId(4, 0);
        if (resourceId != 0) {
            this.f1026b = new n.d(context, resourceId);
        } else {
            this.f1026b = context;
        }
        int i5 = -1;
        TypedArray typedArray3 = null;
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, f1024i, com.sports.insider.R.attr.spinnerStyle, 0);
            try {
                try {
                    if (typedArray.hasValue(0)) {
                        i5 = typedArray.getInt(0, 0);
                    }
                } catch (Exception e7) {
                    e = e7;
                    Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                }
            } catch (Throwable th2) {
                th = th2;
                typedArray3 = typedArray;
                if (typedArray3 != null) {
                    typedArray3.recycle();
                }
                throw th;
            }
        } catch (Exception e9) {
            e = e9;
            typedArray = null;
        } catch (Throwable th3) {
            th = th3;
            if (typedArray3 != null) {
            }
            throw th;
        }
        typedArray.recycle();
        if (i5 == 0) {
            t0 t0Var = new t0(this);
            this.f1030f = t0Var;
            t0Var.f949c = typedArray2.getString(2);
        } else if (i5 == 1) {
            x0 x0Var = new x0(this, this.f1026b, attributeSet);
            c4 f10 = c4.f(this.f1026b, attributeSet, iArr, com.sports.insider.R.attr.spinnerStyle, 0);
            this.f1031g = f10.f722b.getLayoutDimension(3, -2);
            x0Var.setBackgroundDrawable(f10.b(1));
            x0Var.D = typedArray2.getString(2);
            f10.g();
            this.f1030f = x0Var;
            this.f1027c = new q0(this, this, x0Var);
        }
        CharSequence[] textArray = typedArray2.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter.setDropDownViewResource(com.sports.insider.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        f6.g();
        this.f1029e = true;
        SpinnerAdapter spinnerAdapter = this.f1028d;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f1028d = null;
        }
        this.f1025a.d(attributeSet, com.sports.insider.R.attr.spinnerStyle);
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i5 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i10 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i5) {
                view = null;
                i5 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i10 = Math.max(i10, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i10;
        }
        Rect rect = this.f1032h;
        drawable.getPadding(rect);
        return rect.left + rect.right + i10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        u uVar = this.f1025a;
        if (uVar != null) {
            uVar.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        y0 y0Var = this.f1030f;
        return y0Var != null ? y0Var.b() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        y0 y0Var = this.f1030f;
        return y0Var != null ? y0Var.l() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f1030f != null ? this.f1031g : super.getDropDownWidth();
    }

    public final y0 getInternalPopup() {
        return this.f1030f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        y0 y0Var = this.f1030f;
        return y0Var != null ? y0Var.getBackground() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f1026b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        y0 y0Var = this.f1030f;
        return y0Var != null ? y0Var.e() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        u uVar = this.f1025a;
        if (uVar != null) {
            return uVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        u uVar = this.f1025a;
        if (uVar != null) {
            return uVar.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        y0 y0Var = this.f1030f;
        if (y0Var == null || !y0Var.a()) {
            return;
        }
        y0Var.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i5, int i10) {
        super.onMeasure(i5, i10);
        if (this.f1030f == null || View.MeasureSpec.getMode(i5) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i5)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        AppCompatSpinner$SavedState appCompatSpinner$SavedState = (AppCompatSpinner$SavedState) parcelable;
        super.onRestoreInstanceState(appCompatSpinner$SavedState.getSuperState());
        if (!appCompatSpinner$SavedState.f626a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new r0(0, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        AppCompatSpinner$SavedState appCompatSpinner$SavedState = new AppCompatSpinner$SavedState(super.onSaveInstanceState());
        y0 y0Var = this.f1030f;
        appCompatSpinner$SavedState.f626a = y0Var != null && y0Var.a();
        return appCompatSpinner$SavedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        q0 q0Var = this.f1027c;
        if (q0Var == null || !q0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        y0 y0Var = this.f1030f;
        if (y0Var == null) {
            return super.performClick();
        }
        if (y0Var.a()) {
            return true;
        }
        y0Var.k(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        u uVar = this.f1025a;
        if (uVar != null) {
            uVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i5) {
        super.setBackgroundResource(i5);
        u uVar = this.f1025a;
        if (uVar != null) {
            uVar.f(i5);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i5) {
        y0 y0Var = this.f1030f;
        if (y0Var == null) {
            super.setDropDownHorizontalOffset(i5);
        } else {
            y0Var.j(i5);
            y0Var.d(i5);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i5) {
        y0 y0Var = this.f1030f;
        if (y0Var != null) {
            y0Var.i(i5);
        } else {
            super.setDropDownVerticalOffset(i5);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i5) {
        if (this.f1030f != null) {
            this.f1031g = i5;
        } else {
            super.setDropDownWidth(i5);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        y0 y0Var = this.f1030f;
        if (y0Var != null) {
            y0Var.setBackgroundDrawable(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i5) {
        setPopupBackgroundDrawable(h8.b.n(getPopupContext(), i5));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        y0 y0Var = this.f1030f;
        if (y0Var != null) {
            y0Var.h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        u uVar = this.f1025a;
        if (uVar != null) {
            uVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        u uVar = this.f1025a;
        if (uVar != null) {
            uVar.i(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1029e) {
            this.f1028d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        y0 y0Var = this.f1030f;
        if (y0Var != null) {
            Context context = this.f1026b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            u0 u0Var = new u0();
            u0Var.f965a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                u0Var.f966b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                s0.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            y0Var.m(u0Var);
        }
    }
}
