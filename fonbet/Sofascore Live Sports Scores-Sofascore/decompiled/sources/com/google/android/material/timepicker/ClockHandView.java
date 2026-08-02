package com.google.android.material.timepicker;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.Nullable;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.az2;
import defpackage.e80;
import defpackage.pjf;
import defpackage.vha;
import defpackage.x2a;
import defpackage.yfa;
import defpackage.zy2;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
class ClockHandView extends View {
    public static final /* synthetic */ int n = 0;
    public final ValueAnimator a;
    public boolean b;
    public final ArrayList c;
    public final int d;
    public final float e;
    public final Paint f;
    public final RectF g;
    public final int h;
    public float i;
    public boolean j;
    public double k;
    public int l;
    public int m;

    public ClockHandView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.a = valueAnimator;
        this.c = new ArrayList();
        Paint paint = new Paint();
        this.f = paint;
        this.g = new RectF();
        this.m = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pjf.j, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        x2a.M(context, R.attr.motionDurationLong2, 200);
        yfa.E(context, R.attr.motionEasingEmphasizedInterpolator, e80.b);
        this.l = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.d = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.h = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.e = r5.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ViewConfiguration.get(context).getScaledTouchSlop();
        setImportantForAccessibility(2);
        obtainStyledAttributes.recycle();
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i = ClockHandView.n;
                ClockHandView.this.b(((Float) valueAnimator2.getAnimatedValue()).floatValue());
            }
        });
        valueAnimator.addListener(new zy2());
    }

    public final void a(float f) {
        this.a.cancel();
        b(f);
    }

    public final void b(float f) {
        float f2 = f % 360.0f;
        this.i = f2;
        this.k = Math.toRadians(f2 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int i = this.m;
        int i2 = this.l;
        if (i == 2) {
            i2 = Math.round(i2 * 0.66f);
        }
        float f3 = width;
        float f4 = i2;
        float cos = (((float) Math.cos(this.k)) * f4) + f3;
        float sin = (f4 * ((float) Math.sin(this.k))) + height;
        float f5 = this.d;
        this.g.set(cos - f5, sin - f5, cos + f5, sin + f5);
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ClockFaceView clockFaceView = (ClockFaceView) ((az2) it.next());
            if (Math.abs(clockFaceView.q - f2) > 0.001f) {
                clockFaceView.q = f2;
                clockFaceView.j();
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int i = this.m;
        int i2 = this.l;
        if (i == 2) {
            i2 = Math.round(i2 * 0.66f);
        }
        float f = width;
        float f2 = i2;
        float cos = (((float) Math.cos(this.k)) * f2) + f;
        float f3 = height;
        float sin = (f2 * ((float) Math.sin(this.k))) + f3;
        Paint paint = this.f;
        paint.setStrokeWidth(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        canvas.drawCircle(cos, sin, this.d, paint);
        double sin2 = Math.sin(this.k);
        paint.setStrokeWidth(this.h);
        canvas.drawLine(f, f3, width + ((int) (Math.cos(this.k) * r3)), height + ((int) (r3 * sin2)), paint);
        canvas.drawCircle(f, f3, this.e, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.a.isRunning()) {
            return;
        }
        a(this.i);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        boolean z3 = false;
        if (actionMasked == 0) {
            this.j = false;
            z = true;
            z2 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z2 = this.j;
            if (this.b) {
                this.m = ((float) Math.hypot((double) (x - ((float) (getWidth() / 2))), (double) (y - ((float) (getHeight() / 2))))) <= ((float) Math.round(((float) this.l) * 0.66f)) + vha.p(12, getContext()) ? 2 : 1;
            }
            z = false;
        } else {
            z2 = false;
            z = false;
        }
        boolean z4 = this.j;
        int degrees = (int) Math.toDegrees(Math.atan2(y - (getHeight() / 2), x - (getWidth() / 2)));
        int i = degrees + 90;
        if (i < 0) {
            i = degrees + 450;
        }
        float f = i;
        boolean z5 = this.i != f;
        if (!z || !z5) {
            if (z5 || z2) {
                a(f);
            }
            this.j = z4 | z3;
            return true;
        }
        z3 = true;
        this.j = z4 | z3;
        return true;
    }
}
