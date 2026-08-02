package co.paystack.android.design.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.StateSet;
import android.view.View;
import android.widget.Checkable;
import android.widget.LinearLayout;
import androidx.core.content.res.k;

/* loaded from: classes.dex */
public class a extends LinearLayout implements Checkable {
    private static final int[] CHECKED_STATE_SET = {R.attr.state_checked};

    /* renamed from: a, reason: collision with root package name */
    public boolean f27962a;

    /* renamed from: b, reason: collision with root package name */
    public int f27963b;

    /* renamed from: c, reason: collision with root package name */
    public int f27964c;

    /* renamed from: d, reason: collision with root package name */
    public int f27965d;

    /* renamed from: e, reason: collision with root package name */
    public int f27966e;

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27962a = false;
        this.f27963b = -1;
        this.f27964c = -1;
        this.f27966e = 4;
        e(context, attributeSet);
    }

    public final int a(float f10) {
        return Math.round(f10 * (Resources.getSystem().getDisplayMetrics().densityDpi / 160.0f));
    }

    public final StateListDrawable b() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, d());
        stateListDrawable.addState(StateSet.WILD_CARD, c());
        return stateListDrawable;
    }

    public final Drawable c() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setStroke(this.f27966e, this.f27964c);
        gradientDrawable.setColor(0);
        return gradientDrawable;
    }

    public final Drawable d() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(this.f27963b);
        return gradientDrawable;
    }

    public final void e(Context context, AttributeSet attributeSet) {
        if (context != null) {
            if (attributeSet != null) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.PinPadView);
                this.f27965d = obtainStyledAttributes.getDimensionPixelSize(f.f28006n, a(12.0f));
                this.f27966e = obtainStyledAttributes.getDimensionPixelOffset(f.f28008p, 4);
                if (obtainStyledAttributes.hasValue(f.f28005m)) {
                    this.f27963b = obtainStyledAttributes.getColor(f.f28005m, k.d(getResources(), b.f27969c, null));
                }
                if (obtainStyledAttributes.hasValue(f.f28004l)) {
                    this.f27964c = obtainStyledAttributes.getColor(f.f28004l, k.d(getResources(), b.f27968b, null));
                }
                obtainStyledAttributes.recycle();
            }
            h(this.f27965d);
            setBackground(b());
            setChecked(false);
        }
    }

    public void f(int i10) {
        this.f27964c = i10;
        requestLayout();
    }

    public void g(int i10) {
        this.f27963b = i10;
        requestLayout();
    }

    public void h(int i10) {
        this.f27965d = i10;
        setLayoutParams(new LinearLayout.LayoutParams(i10, i10));
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f27962a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, CHECKED_STATE_SET);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (z10 != this.f27962a) {
            this.f27962a = z10;
            refreshDrawableState();
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f27962a);
    }
}
