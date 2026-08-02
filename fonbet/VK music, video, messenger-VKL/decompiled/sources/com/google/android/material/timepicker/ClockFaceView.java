package com.google.android.material.timepicker;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.R$attr;
import com.google.android.material.R$color;
import com.google.android.material.R$dimen;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.timepicker.ClockHandView;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import xsna.am;
import xsna.anj;
import xsna.hk;
import xsna.hte0;
import xsna.iut0;
import xsna.qm10;

/* loaded from: classes13.dex */
class ClockFaceView extends hte0 implements ClockHandView.b {
    public final SparseArray<TextView> A;
    public final b B;
    public final int[] C;
    public final float[] D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public String[] I;
    public float J;
    public final ColorStateList K;
    public final ClockHandView w;
    public final Rect x;
    public final RectF y;
    public final Rect z;

    public final class a implements ViewTreeObserver.OnPreDrawListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            ClockFaceView clockFaceView = ClockFaceView.this;
            if (!clockFaceView.isShown()) {
                return true;
            }
            clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
            int height = ((clockFaceView.getHeight() / 2) - clockFaceView.w.l) - clockFaceView.E;
            if (height != clockFaceView.u) {
                clockFaceView.u = height;
                clockFaceView.P4();
                ClockHandView clockHandView = clockFaceView.w;
                clockHandView.u = clockFaceView.u;
                clockHandView.invalidate();
            }
            return true;
        }
    }

    public final class b extends hk {
        public b() {
        }

        @Override // xsna.hk
        public final void onInitializeAccessibilityNodeInfo(View view, @NonNull am amVar) {
            super.onInitializeAccessibilityNodeInfo(view, amVar);
            int intValue = ((Integer) view.getTag(R$id.material_value_index)).intValue();
            if (intValue > 0) {
                amVar.a.setTraversalAfter(ClockFaceView.this.A.get(intValue - 1));
            }
            amVar.q(am.h.a(0, 1, intValue, 1, view.isSelected()));
            amVar.o(true);
            amVar.b(am.a.e);
        }

        @Override // xsna.hk
        public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (i != 16) {
                return super.performAccessibilityAction(view, i, bundle);
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            ClockFaceView clockFaceView = ClockFaceView.this;
            view.getHitRect(clockFaceView.x);
            float centerX = clockFaceView.x.centerX();
            float centerY = clockFaceView.x.centerY();
            clockFaceView.w.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
            clockFaceView.w.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
            return true;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ClockFaceView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, r0);
        int i = R$attr.materialClockStyle;
        this.x = new Rect();
        this.y = new RectF();
        this.z = new Rect();
        this.A = new SparseArray<>();
        this.D = new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ClockFaceView, i, R$style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList a2 = qm10.a(context, obtainStyledAttributes, R$styleable.ClockFaceView_clockNumberTextColor);
        this.K = a2;
        LayoutInflater.from(context).inflate(R$layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R$id.material_clock_hand);
        this.w = clockHandView;
        this.E = resources.getDimensionPixelSize(R$dimen.material_clock_hand_padding);
        int colorForState = a2.getColorForState(new int[]{R.attr.state_selected}, a2.getDefaultColor());
        this.C = new int[]{colorForState, colorForState, a2.getDefaultColor()};
        clockHandView.k.add(this);
        int defaultColor = anj.b(R$color.material_timepicker_clockface, context).getDefaultColor();
        ColorStateList a3 = qm10.a(context, obtainStyledAttributes, R$styleable.ClockFaceView_clockFaceBackgroundColor);
        setBackgroundColor(a3 != null ? a3.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a());
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.B = new b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        T4(0, strArr);
        this.F = resources.getDimensionPixelSize(R$dimen.material_time_picker_minimum_screen_height);
        this.G = resources.getDimensionPixelSize(R$dimen.material_time_picker_minimum_screen_width);
        this.H = resources.getDimensionPixelSize(R$dimen.material_clock_size);
    }

    @Override // xsna.hte0
    public final void P4() {
        super.P4();
        int i = 0;
        while (true) {
            SparseArray<TextView> sparseArray = this.A;
            if (i >= sparseArray.size()) {
                return;
            }
            sparseArray.get(i).setVisibility(0);
            i++;
        }
    }

    public final void Q4() {
        SparseArray<TextView> sparseArray;
        Rect rect;
        RectF rectF;
        RectF rectF2 = this.w.o;
        float f = Float.MAX_VALUE;
        TextView textView = null;
        int i = 0;
        while (true) {
            sparseArray = this.A;
            int size = sparseArray.size();
            rect = this.x;
            rectF = this.y;
            if (i >= size) {
                break;
            }
            TextView textView2 = sparseArray.get(i);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float height = rectF.height() * rectF.width();
                if (height < f) {
                    textView = textView2;
                    f = height;
                }
            }
            i++;
        }
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            TextView textView3 = sparseArray.get(i2);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.z);
                rectF.inset(r8.left, r8.top);
                textView3.getPaint().setShader(!RectF.intersects(rectF2, rectF) ? null : new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.C, this.D, Shader.TileMode.CLAMP));
                textView3.invalidate();
            }
        }
    }

    public final void T4(int i, String[] strArr) {
        this.I = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        SparseArray<TextView> sparseArray = this.A;
        int size = sparseArray.size();
        boolean z = false;
        for (int i2 = 0; i2 < Math.max(this.I.length, size); i2++) {
            TextView textView = sparseArray.get(i2);
            if (i2 >= this.I.length) {
                removeView(textView);
                sparseArray.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R$layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i2, textView);
                    addView(textView);
                }
                textView.setText(this.I[i2]);
                textView.setTag(R$id.material_value_index, Integer.valueOf(i2));
                int i3 = (i2 / 12) + 1;
                textView.setTag(R$id.material_clock_level, Integer.valueOf(i3));
                if (i3 > 1) {
                    z = true;
                }
                iut0.q(textView, this.B);
                textView.setTextColor(this.K);
                if (i != 0) {
                    textView.setContentDescription(getResources().getString(i, this.I[i2]));
                }
            }
        }
        ClockHandView clockHandView = this.w;
        if (clockHandView.j && !z) {
            clockHandView.v = 1;
        }
        clockHandView.j = z;
        clockHandView.invalidate();
    }

    @Override // com.google.android.material.timepicker.ClockHandView.b
    public final void Y1(float f, boolean z) {
        if (Math.abs(this.J - f) > 0.001f) {
            this.J = f;
            Q4();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) am.g.a(1, this.I.length, 1, false).a);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Q4();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (this.H / Math.max(Math.max(this.F / displayMetrics.heightPixels, this.G / displayMetrics.widthPixels), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}
