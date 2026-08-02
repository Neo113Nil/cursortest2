package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.Nullable;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import xsna.b0u0;
import xsna.iut0;
import xsna.rq2;
import xsna.t1u0;
import xsna.tb30;
import xsna.zjq;

/* loaded from: classes13.dex */
class ClockHandView extends View {
    public static final /* synthetic */ int w = 0;
    public final int b;
    public final TimeInterpolator c;
    public final ValueAnimator d;
    public boolean e;
    public float f;
    public float g;
    public boolean h;
    public final int i;
    public boolean j;
    public final ArrayList k;
    public final int l;
    public final float m;
    public final Paint n;
    public final RectF o;
    public final int p;
    public float q;
    public boolean r;
    public c s;
    public double t;
    public int u;
    public int v;

    public class a extends AnimatorListenerAdapter {
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    public interface b {
        void Y1(float f, boolean z);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ClockHandView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, r0);
        int i = R$attr.materialClockStyle;
        this.d = new ValueAnimator();
        this.k = new ArrayList();
        Paint paint = new Paint();
        this.n = paint;
        this.o = new RectF();
        this.v = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ClockHandView, i, R$style.Widget_MaterialComponents_TimePicker_Clock);
        this.b = tb30.c(R$attr.motionDurationLong2, 200, context);
        this.c = tb30.d(context, R$attr.motionEasingEmphasizedInterpolator, rq2.b);
        this.u = obtainStyledAttributes.getDimensionPixelSize(R$styleable.ClockHandView_materialCircleRadius, 0);
        this.l = obtainStyledAttributes.getDimensionPixelSize(R$styleable.ClockHandView_selectorSize, 0);
        this.p = getResources().getDimensionPixelSize(R$dimen.material_clock_hand_stroke_width);
        this.m = r0.getDimensionPixelSize(R$dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(R$styleable.ClockHandView_clockHandColor, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false);
        this.i = ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        setImportantForAccessibility(2);
        obtainStyledAttributes.recycle();
    }

    public final int a(float f, float f2) {
        int degrees = (int) Math.toDegrees(Math.atan2(f2 - (getHeight() / 2), f - (getWidth() / 2)));
        int i = degrees + 90;
        return i < 0 ? degrees + 450 : i;
    }

    public final int b(int i) {
        return i == 2 ? Math.round(this.u * 0.66f) : this.u;
    }

    public final void c(float f, boolean z) {
        ValueAnimator valueAnimator = this.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z) {
            d(f, false);
            return;
        }
        float f2 = this.q;
        if (Math.abs(f2 - f) > 180.0f) {
            if (f2 > 180.0f && f < 180.0f) {
                f += 360.0f;
            }
            if (f2 < 180.0f && f > 180.0f) {
                f2 += 360.0f;
            }
        }
        Pair pair = new Pair(Float.valueOf(f2), Float.valueOf(f));
        valueAnimator.setFloatValues(((Float) pair.first).floatValue(), ((Float) pair.second).floatValue());
        valueAnimator.setDuration(this.b);
        valueAnimator.setInterpolator(this.c);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i = ClockHandView.w;
                ClockHandView clockHandView = ClockHandView.this;
                clockHandView.getClass();
                clockHandView.d(((Float) valueAnimator2.getAnimatedValue()).floatValue(), true);
            }
        });
        valueAnimator.addListener(new a());
        valueAnimator.start();
    }

    public final void d(float f, boolean z) {
        float f2 = f % 360.0f;
        this.q = f2;
        this.t = Math.toRadians(f2 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float b2 = b(this.v);
        float cos = (((float) Math.cos(this.t)) * b2) + width;
        float sin = (b2 * ((float) Math.sin(this.t))) + height;
        float f3 = this.l;
        this.o.set(cos - f3, sin - f3, cos + f3, sin + f3);
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((b) it.next()).Y1(f2, z);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f = width;
        float b2 = b(this.v);
        float cos = (((float) Math.cos(this.t)) * b2) + f;
        float f2 = height;
        float sin = (b2 * ((float) Math.sin(this.t))) + f2;
        Paint paint = this.n;
        paint.setStrokeWidth(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        canvas.drawCircle(cos, sin, this.l, paint);
        double sin2 = Math.sin(this.t);
        paint.setStrokeWidth(this.p);
        canvas.drawLine(f, f2, width + ((int) (Math.cos(this.t) * r2)), height + ((int) (r2 * sin2)), paint);
        canvas.drawCircle(f, f2, this.m, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.d.isRunning()) {
            return;
        }
        c(this.q, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00db  */
    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        c cVar;
        TimeModel timeModel;
        TimePickerView timePickerView;
        int i;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 2) {
                int i2 = (int) (x - this.f);
                int i3 = (int) (y - this.g);
                this.h = (i3 * i3) + (i2 * i2) > this.i;
                z3 = this.r;
                z2 = actionMasked == 1;
                if (this.j) {
                    this.v = zjq.h((float) (getWidth() / 2), (float) (getHeight() / 2), x, y) > ((float) b(2)) + t1u0.b(12, getContext()) ? 1 : 2;
                }
                z = false;
            } else {
                z2 = false;
                z = false;
                z3 = false;
            }
        } else {
            this.f = x;
            this.g = y;
            this.h = true;
            this.r = false;
            z = true;
            z2 = false;
            z3 = false;
        }
        boolean z6 = this.r;
        float a2 = a(x, y);
        boolean z7 = this.q != a2;
        if (!z || !z7) {
            if (!z7 && !z3) {
                z4 = false;
                z5 = z4 | z6;
                this.r = z5;
                if (z5 && z2 && (cVar = this.s) != null) {
                    timeModel = cVar.c;
                    timePickerView = cVar.b;
                    float a3 = a(x, y);
                    boolean z8 = this.h;
                    cVar.f = true;
                    i = timeModel.f;
                    int i4 = timeModel.e;
                    if (timeModel.g != 10) {
                        timePickerView.v.c(cVar.e, false);
                        AccessibilityManager accessibilityManager = (AccessibilityManager) timePickerView.getContext().getSystemService(AccessibilityManager.class);
                        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
                            cVar.a(12, true);
                        }
                    } else {
                        int round = Math.round(a3);
                        if (!z8) {
                            timeModel.f(((round + 15) / 30) * 5);
                            cVar.d = timeModel.f * 6;
                        }
                        timePickerView.v.c(cVar.d, z8);
                    }
                    cVar.f = false;
                    cVar.b();
                    if (timeModel.f == i || timeModel.e != i4) {
                        timePickerView.performHapticFeedback(4);
                    }
                }
                return true;
            }
            c(a2, z2 && this.e);
        }
        z4 = true;
        z5 = z4 | z6;
        this.r = z5;
        if (z5) {
            timeModel = cVar.c;
            timePickerView = cVar.b;
            float a32 = a(x, y);
            boolean z82 = this.h;
            cVar.f = true;
            i = timeModel.f;
            int i42 = timeModel.e;
            if (timeModel.g != 10) {
            }
            cVar.f = false;
            cVar.b();
            if (timeModel.f == i) {
            }
            timePickerView.performHapticFeedback(4);
        }
        return true;
    }
}
