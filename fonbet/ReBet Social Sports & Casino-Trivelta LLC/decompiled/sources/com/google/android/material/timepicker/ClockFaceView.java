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
import androidx.core.view.AbstractC2082d0;
import androidx.core.view.C2075a;
import com.google.android.material.timepicker.ClockHandView;
import java.util.Arrays;
import n.AbstractC5596a;
import y0.z;

/* loaded from: classes3.dex */
class ClockFaceView extends g implements ClockHandView.c {

    /* renamed from: C, reason: collision with root package name */
    public final ClockHandView f36365C;

    /* renamed from: D, reason: collision with root package name */
    public final Rect f36366D;

    /* renamed from: E, reason: collision with root package name */
    public final RectF f36367E;

    /* renamed from: F, reason: collision with root package name */
    public final Rect f36368F;

    /* renamed from: G, reason: collision with root package name */
    public final SparseArray f36369G;

    /* renamed from: H, reason: collision with root package name */
    public final C2075a f36370H;

    /* renamed from: I, reason: collision with root package name */
    public final int f36371I;

    /* renamed from: J, reason: collision with root package name */
    public final int f36372J;

    /* renamed from: K, reason: collision with root package name */
    public final int f36373K;

    /* renamed from: L, reason: collision with root package name */
    public final int f36374L;

    /* renamed from: O, reason: collision with root package name */
    public float f36375O;

    /* renamed from: P, reason: collision with root package name */
    public final ColorStateList f36376P;
    private final int[] gradientColors;
    private final float[] gradientPositions;
    private String[] values;

    public class a implements ViewTreeObserver.OnPreDrawListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView.this.B(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.f36365C.j()) - ClockFaceView.this.f36371I);
            return true;
        }
    }

    public class b extends C2075a {
        public b() {
        }

        @Override // androidx.core.view.C2075a
        public void onInitializeAccessibilityNodeInfo(View view, z zVar) {
            super.onInitializeAccessibilityNodeInfo(view, zVar);
            int intValue = ((Integer) view.getTag(ia.g.f48394B)).intValue();
            if (intValue > 0) {
                zVar.b1((View) ClockFaceView.this.f36369G.get(intValue - 1));
            }
            zVar.z0(z.g.b(0, 1, intValue, 1, false, view.isSelected()));
            zVar.x0(true);
            zVar.b(z.a.f68223i);
        }

        @Override // androidx.core.view.C2075a
        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            if (i10 != 16) {
                return super.performAccessibilityAction(view, i10, bundle);
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            view.getHitRect(ClockFaceView.this.f36366D);
            float centerX = ClockFaceView.this.f36366D.centerX();
            float centerY = ClockFaceView.this.f36366D.centerY();
            ClockFaceView.this.f36365C.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
            ClockFaceView.this.f36365C.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
            return true;
        }
    }

    public ClockFaceView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ia.c.f48207L);
    }

    public static float N(float f10, float f11, float f12) {
        return Math.max(Math.max(f10, f11), f12);
    }

    @Override // com.google.android.material.timepicker.g
    public void B(int i10) {
        if (i10 != A()) {
            super.B(i10);
            this.f36365C.o(A());
        }
    }

    @Override // com.google.android.material.timepicker.g
    public void D() {
        super.D();
        for (int i10 = 0; i10 < this.f36369G.size(); i10++) {
            ((TextView) this.f36369G.get(i10)).setVisibility(0);
        }
    }

    public final void J() {
        RectF f10 = this.f36365C.f();
        TextView M10 = M(f10);
        for (int i10 = 0; i10 < this.f36369G.size(); i10++) {
            TextView textView = (TextView) this.f36369G.get(i10);
            if (textView != null) {
                textView.setSelected(textView == M10);
                textView.getPaint().setShader(L(f10, textView));
                textView.invalidate();
            }
        }
    }

    public int K() {
        return this.f36365C.e();
    }

    public final RadialGradient L(RectF rectF, TextView textView) {
        textView.getHitRect(this.f36366D);
        this.f36367E.set(this.f36366D);
        textView.getLineBounds(0, this.f36368F);
        RectF rectF2 = this.f36367E;
        Rect rect = this.f36368F;
        rectF2.inset(rect.left, rect.top);
        if (RectF.intersects(rectF, this.f36367E)) {
            return new RadialGradient(rectF.centerX() - this.f36367E.left, rectF.centerY() - this.f36367E.top, rectF.width() * 0.5f, this.gradientColors, this.gradientPositions, Shader.TileMode.CLAMP);
        }
        return null;
    }

    public final TextView M(RectF rectF) {
        float f10 = Float.MAX_VALUE;
        TextView textView = null;
        for (int i10 = 0; i10 < this.f36369G.size(); i10++) {
            TextView textView2 = (TextView) this.f36369G.get(i10);
            if (textView2 != null) {
                textView2.getHitRect(this.f36366D);
                this.f36367E.set(this.f36366D);
                this.f36367E.union(rectF);
                float width = this.f36367E.width() * this.f36367E.height();
                if (width < f10) {
                    textView = textView2;
                    f10 = width;
                }
            }
        }
        return textView;
    }

    public void O(int i10) {
        this.f36365C.p(i10);
    }

    public void P(String[] strArr, int i10) {
        this.values = strArr;
        Q(i10);
    }

    public final void Q(int i10) {
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = this.f36369G.size();
        boolean z10 = false;
        for (int i11 = 0; i11 < Math.max(this.values.length, size); i11++) {
            TextView textView = (TextView) this.f36369G.get(i11);
            if (i11 >= this.values.length) {
                removeView(textView);
                this.f36369G.remove(i11);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(ia.i.f48479l, (ViewGroup) this, false);
                    this.f36369G.put(i11, textView);
                    addView(textView);
                }
                textView.setText(this.values[i11]);
                textView.setTag(ia.g.f48394B, Integer.valueOf(i11));
                int i12 = (i11 / 12) + 1;
                textView.setTag(ia.g.f48445n, Integer.valueOf(i12));
                if (i12 > 1) {
                    z10 = true;
                }
                AbstractC2082d0.l0(textView, this.f36370H);
                textView.setTextColor(this.f36376P);
                if (i10 != 0) {
                    textView.setContentDescription(getResources().getString(i10, this.values[i11]));
                }
            }
        }
        this.f36365C.t(z10);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.c
    public void d(float f10, boolean z10) {
        if (Math.abs(this.f36375O - f10) > 0.001f) {
            this.f36375O = f10;
            J();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        z.f1(accessibilityNodeInfo).y0(z.f.b(1, this.values.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        J();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int N10 = (int) (this.f36374L / N(this.f36372J / displayMetrics.heightPixels, this.f36373K / displayMetrics.widthPixels, 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(N10, 1073741824);
        setMeasuredDimension(N10, N10);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public ClockFaceView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f36366D = new Rect();
        this.f36367E = new RectF();
        this.f36368F = new Rect();
        this.f36369G = new SparseArray();
        this.gradientPositions = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ia.m.ClockFaceView, i10, ia.l.f48559K);
        Resources resources = getResources();
        ColorStateList a10 = Ca.c.a(context, obtainStyledAttributes, ia.m.f49082y1);
        this.f36376P = a10;
        LayoutInflater.from(context).inflate(ia.i.f48480m, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(ia.g.f48443m);
        this.f36365C = clockHandView;
        this.f36371I = resources.getDimensionPixelSize(ia.e.f48309K);
        int colorForState = a10.getColorForState(new int[]{R.attr.state_selected}, a10.getDefaultColor());
        this.gradientColors = new int[]{colorForState, colorForState, a10.getDefaultColor()};
        clockHandView.b(this);
        int defaultColor = AbstractC5596a.a(context, ia.d.f48284k).getDefaultColor();
        ColorStateList a11 = Ca.c.a(context, obtainStyledAttributes, ia.m.f49072x1);
        setBackgroundColor(a11 != null ? a11.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a());
        setFocusable(false);
        obtainStyledAttributes.recycle();
        this.f36370H = new b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        P(strArr, 0);
        this.f36372J = resources.getDimensionPixelSize(ia.e.f48328Y);
        this.f36373K = resources.getDimensionPixelSize(ia.e.f48329Z);
        this.f36374L = resources.getDimensionPixelSize(ia.e.f48313M);
    }
}
