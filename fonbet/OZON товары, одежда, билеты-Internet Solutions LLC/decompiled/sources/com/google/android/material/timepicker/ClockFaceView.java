package com.google.android.material.timepicker;

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
import androidx.core.view.C5305a;
import androidx.core.view.Y;
import com.google.android.material.timepicker.ClockHandView;
import i7.C7017a;
import java.util.Arrays;
import ru.ozon.app.android.R;
import y2.q;

/* loaded from: classes9.dex */
class ClockFaceView extends com.google.android.material.timepicker.a implements ClockHandView.a {

    /* renamed from: f, reason: collision with root package name */
    private final ClockHandView f58800f;

    /* renamed from: g, reason: collision with root package name */
    private final Rect f58801g;

    /* renamed from: h, reason: collision with root package name */
    private final RectF f58802h;

    /* renamed from: i, reason: collision with root package name */
    private final SparseArray<TextView> f58803i;

    /* renamed from: j, reason: collision with root package name */
    private final C5305a f58804j;

    /* renamed from: k, reason: collision with root package name */
    private final int[] f58805k;

    /* renamed from: l, reason: collision with root package name */
    private final float[] f58806l;

    /* renamed from: m, reason: collision with root package name */
    private final int f58807m;

    /* renamed from: n, reason: collision with root package name */
    private final int f58808n;

    /* renamed from: o, reason: collision with root package name */
    private final int f58809o;

    /* renamed from: p, reason: collision with root package name */
    private final int f58810p;

    /* renamed from: q, reason: collision with root package name */
    private String[] f58811q;

    /* renamed from: r, reason: collision with root package name */
    private float f58812r;

    /* renamed from: s, reason: collision with root package name */
    private final ColorStateList f58813s;

    final class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            ClockFaceView clockFaceView = ClockFaceView.this;
            if (!clockFaceView.isShown()) {
                return true;
            }
            clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
            clockFaceView.c(((clockFaceView.getHeight() / 2) - clockFaceView.f58800f.c()) - clockFaceView.f58807m);
            return true;
        }
    }

    final class b extends C5305a {
        b() {
        }

        @Override // androidx.core.view.C5305a
        public final void onInitializeAccessibilityNodeInfo(View view, @NonNull q qVar) {
            super.onInitializeAccessibilityNodeInfo(view, qVar);
            int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
            if (intValue > 0) {
                qVar.u0((View) ClockFaceView.this.f58803i.get(intValue - 1));
            }
            qVar.N(q.f.f(0, 1, intValue, 1, false, view.isSelected()));
            qVar.L(true);
            qVar.b(q.a.f105942e);
        }

        @Override // androidx.core.view.C5305a
        public final boolean performAccessibilityAction(View view, int i11, Bundle bundle) {
            if (i11 != 16) {
                return super.performAccessibilityAction(view, i11, bundle);
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            float width = (view.getWidth() / 2.0f) + view.getX();
            float height = (view.getHeight() / 2.0f) + view.getY();
            ClockFaceView clockFaceView = ClockFaceView.this;
            clockFaceView.f58800f.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, width, height, 0));
            clockFaceView.f58800f.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, width, height, 0));
            return true;
        }
    }

    public ClockFaceView(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.f58801g = new Rect();
        this.f58802h = new RectF();
        SparseArray<TextView> sparseArray = new SparseArray<>();
        this.f58803i = sparseArray;
        this.f58806l = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7017a.f65943i, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList a11 = v7.c.a(context, obtainStyledAttributes, 1);
        this.f58813s = a11;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f58800f = clockHandView;
        this.f58807m = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = a11.getColorForState(new int[]{android.R.attr.state_selected}, a11.getDefaultColor());
        this.f58805k = new int[]{colorForState, colorForState, a11.getDefaultColor()};
        clockHandView.a(this);
        int defaultColor = androidx.core.content.a.getColorStateList(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList a12 = v7.c.a(context, obtainStyledAttributes, 0);
        setBackgroundColor(a12 != null ? a12.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a());
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f58804j = new b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.f58811q = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        for (int i11 = 0; i11 < Math.max(this.f58811q.length, size); i11++) {
            TextView textView = sparseArray.get(i11);
            if (i11 >= this.f58811q.length) {
                removeView(textView);
                sparseArray.remove(i11);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i11, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.f58811q[i11]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i11));
                Y.C(textView, this.f58804j);
                textView.setTextColor(this.f58813s);
            }
        }
        this.f58808n = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.f58809o = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.f58810p = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    private void h() {
        RadialGradient radialGradient;
        RectF b11 = this.f58800f.b();
        int i11 = 0;
        while (true) {
            SparseArray<TextView> sparseArray = this.f58803i;
            if (i11 >= sparseArray.size()) {
                return;
            }
            TextView textView = sparseArray.get(i11);
            if (textView != null) {
                Rect rect = this.f58801g;
                textView.getDrawingRect(rect);
                offsetDescendantRectToMyCoords(textView, rect);
                textView.setSelected(b11.contains(rect.centerX(), rect.centerY()));
                RectF rectF = this.f58802h;
                rectF.set(rect);
                rectF.offset(textView.getPaddingLeft(), textView.getPaddingTop());
                if (RectF.intersects(b11, rectF)) {
                    radialGradient = new RadialGradient(b11.centerX() - rectF.left, b11.centerY() - rectF.top, 0.5f * b11.width(), this.f58805k, this.f58806l, Shader.TileMode.CLAMP);
                } else {
                    radialGradient = null;
                }
                textView.getPaint().setShader(radialGradient);
                textView.invalidate();
            }
            i11++;
        }
    }

    @Override // com.google.android.material.timepicker.ClockHandView.a
    public final void a(float f7) {
        if (Math.abs(this.f58812r - f7) > 0.001f) {
            this.f58812r = f7;
            h();
        }
    }

    @Override // com.google.android.material.timepicker.a
    public final void c(int i11) {
        if (i11 != b()) {
            super.c(i11);
            this.f58800f.d(b());
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        q.A0(accessibilityNodeInfo).M(q.e.a(1, this.f58811q.length, 1, false));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        h();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected final void onMeasure(int i11, int i12) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (this.f58810p / Math.max(Math.max(this.f58808n / displayMetrics.heightPixels, this.f58809o / displayMetrics.widthPixels), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}
