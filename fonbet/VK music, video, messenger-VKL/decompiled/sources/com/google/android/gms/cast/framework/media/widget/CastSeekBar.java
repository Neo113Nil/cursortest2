package com.google.android.gms.cast.framework.media.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.cast.framework.R$styleable;
import com.google.android.gms.internal.cast.zzdr;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;
import xsna.b901;
import xsna.dq70;
import xsna.dsz0;
import xsna.jn4;
import xsna.k201;
import xsna.o0a;
import xsna.ta01;
import xsna.vwp0;
import xsna.way0;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public class CastSeekBar extends View {
    public b901 b;
    public boolean c;

    @Nullable
    public Integer d;

    @Nullable
    public k201 e;

    @Nullable
    public ArrayList f;
    public jn4 g;
    public final float h;
    public final float i;
    public final float j;
    public final float k;
    public final float l;
    public final Paint m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public int[] r;
    public Point s;
    public way0 t;

    public CastSeekBar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f = new ArrayList();
        setAccessibilityDelegate(new ta01(this));
        Paint paint = new Paint(1);
        this.m = paint;
        paint.setStyle(Paint.Style.FILL);
        this.h = context.getResources().getDimension(R.dimen.cast_seek_bar_minimum_width);
        this.i = context.getResources().getDimension(R.dimen.cast_seek_bar_minimum_height);
        this.j = context.getResources().getDimension(R.dimen.cast_seek_bar_progress_height) / 2.0f;
        this.k = context.getResources().getDimension(R.dimen.cast_seek_bar_thumb_size) / 2.0f;
        this.l = context.getResources().getDimension(R.dimen.cast_seek_bar_ad_break_minimum_width);
        b901 b901Var = new b901();
        this.b = b901Var;
        b901Var.b = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, R$styleable.a, R.attr.castExpandedControllerStyle, R.style.CastExpandedController);
        int resourceId = obtainStyledAttributes.getResourceId(18, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(20, 0);
        int resourceId3 = obtainStyledAttributes.getResourceId(23, 0);
        int resourceId4 = obtainStyledAttributes.getResourceId(0, 0);
        this.n = context.getResources().getColor(resourceId);
        this.o = context.getResources().getColor(resourceId2);
        this.p = context.getResources().getColor(resourceId3);
        this.q = context.getResources().getColor(resourceId4);
        obtainStyledAttributes.recycle();
    }

    public final void a(@Nullable ArrayList arrayList) {
        if (dq70.b(this.f, arrayList)) {
            return;
        }
        this.f = arrayList == null ? null : new ArrayList(arrayList);
        postInvalidate();
    }

    public final void b(@NonNull Canvas canvas, int i, int i2, int i3, int i4, int i5) {
        Paint paint = this.m;
        paint.setColor(i5);
        float f = i3;
        float f2 = i2 / f;
        float f3 = i / f;
        float f4 = i4;
        float f5 = this.j;
        canvas.drawRect(f3 * f4, -f5, f2 * f4, f5, paint);
    }

    public final void c(int i) {
        b901 b901Var = this.b;
        if (b901Var.f) {
            int i2 = b901Var.d;
            int i3 = b901Var.e;
            Pattern pattern = o0a.a;
            this.d = Integer.valueOf(Math.min(Math.max(i, i2), i3));
            jn4 jn4Var = this.g;
            if (jn4Var != null) {
                jn4Var.d(getProgress(), true);
            }
            way0 way0Var = this.t;
            if (way0Var == null) {
                this.t = new way0(this, 2);
            } else {
                removeCallbacks(way0Var);
            }
            postDelayed(this.t, 200L);
            postInvalidate();
        }
    }

    public final void d() {
        this.c = true;
        jn4 jn4Var = this.g;
        if (jn4Var != null) {
            Iterator it = ((vwp0) jn4Var.b).e.iterator();
            while (it.hasNext()) {
                ((zzdr) it.next()).zzb(false);
            }
        }
    }

    public final int e(int i) {
        return (int) ((i / ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) * this.b.b);
    }

    public int getMaxProgress() {
        return this.b.b;
    }

    public int getProgress() {
        Integer num = this.d;
        return num != null ? num.intValue() : this.b.a;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        way0 way0Var = this.t;
        if (way0Var != null) {
            removeCallbacks(way0Var);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(@NonNull Canvas canvas) {
        int i;
        int i2;
        int i3;
        int save = canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        k201 k201Var = this.e;
        if (k201Var == null) {
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            int progress = getProgress();
            int save2 = canvas.save();
            canvas.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, measuredHeight / 2);
            b901 b901Var = this.b;
            if (b901Var.f) {
                int i4 = b901Var.d;
                if (i4 > 0) {
                    b(canvas, 0, i4, b901Var.b, measuredWidth, this.p);
                }
                b901 b901Var2 = this.b;
                int i5 = b901Var2.d;
                if (progress > i5) {
                    b(canvas, i5, progress, b901Var2.b, measuredWidth, this.n);
                    i3 = progress;
                } else {
                    i3 = progress;
                }
                b901 b901Var3 = this.b;
                int i6 = b901Var3.e;
                if (i6 > i3) {
                    b(canvas, i3, i6, b901Var3.b, measuredWidth, this.o);
                }
                b901 b901Var4 = this.b;
                int i7 = b901Var4.b;
                int i8 = b901Var4.e;
                if (i7 > i8) {
                    b(canvas, i8, i7, i7, measuredWidth, this.p);
                }
            } else {
                int max = Math.max(b901Var.c, 0);
                if (max > 0) {
                    i = max;
                    b(canvas, 0, i, this.b.b, measuredWidth, this.p);
                } else {
                    i = max;
                }
                if (progress > i) {
                    b(canvas, i, progress, this.b.b, measuredWidth, this.n);
                    i2 = progress;
                } else {
                    i2 = progress;
                }
                int i9 = this.b.b;
                if (i9 > i2) {
                    b(canvas, i2, i9, i9, measuredWidth, this.p);
                }
            }
            canvas.restoreToCount(save2);
            ArrayList<dsz0> arrayList = this.f;
            Paint paint = this.m;
            if (arrayList != null && !arrayList.isEmpty()) {
                paint.setColor(this.q);
                int measuredWidth2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                int measuredHeight2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                int save3 = canvas.save();
                canvas.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, measuredHeight2 / 2);
                for (dsz0 dsz0Var : arrayList) {
                    if (dsz0Var != null) {
                        int min = Math.min(dsz0Var.a, this.b.b);
                        int i10 = (dsz0Var.c ? dsz0Var.b : 1) + min;
                        float f = measuredWidth2;
                        float f2 = this.b.b;
                        float f3 = (i10 * f) / f2;
                        float f4 = (min * f) / f2;
                        float f5 = f3 - f4;
                        float f6 = this.l;
                        if (f5 < f6) {
                            f3 = f4 + f6;
                        }
                        if (f3 <= f) {
                            f = f3;
                        }
                        if (f - f4 < f6) {
                            f4 = f - f6;
                        }
                        float f7 = this.j;
                        canvas.drawRect(f4, -f7, f, f7, paint);
                    }
                }
                canvas.restoreToCount(save3);
            }
            if (isEnabled() && this.b.f) {
                paint.setColor(this.n);
                int measuredWidth3 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                int measuredHeight3 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                double progress2 = getProgress();
                double d = this.b.b;
                int save4 = canvas.save();
                canvas.drawCircle((int) ((progress2 / d) * measuredWidth3), measuredHeight3 / 2.0f, this.k, paint);
                canvas.restoreToCount(save4);
            }
        } else {
            int measuredWidth4 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            int measuredHeight4 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            int save5 = canvas.save();
            canvas.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, measuredHeight4 / 2);
            int i11 = k201Var.a;
            int i12 = k201Var.b;
            b(canvas, 0, i11, i12, measuredWidth4, this.q);
            b(canvas, i11, i12, i12, measuredWidth4, this.p);
            canvas.restoreToCount(save5);
        }
        canvas.restoreToCount(save);
    }

    @Override // android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        float paddingLeft = getPaddingLeft();
        setMeasuredDimension(View.resolveSizeAndState((int) (this.h + paddingLeft + getPaddingRight()), i, 0), View.resolveSizeAndState((int) (this.i + getPaddingTop() + getPaddingBottom()), i2, 0));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        if (isEnabled() && this.b.f) {
            if (this.s == null) {
                this.s = new Point();
            }
            if (this.r == null) {
                this.r = new int[2];
            }
            getLocationOnScreen(this.r);
            this.s.set((((int) motionEvent.getRawX()) - this.r[0]) - getPaddingLeft(), ((int) motionEvent.getRawY()) - this.r[1]);
            int action = motionEvent.getAction();
            if (action == 0) {
                d();
                c(e(this.s.x));
                return true;
            }
            if (action == 1) {
                c(e(this.s.x));
                this.c = false;
                jn4 jn4Var = this.g;
                if (jn4Var != null) {
                    jn4Var.c(this);
                }
                return true;
            }
            if (action == 2) {
                c(e(this.s.x));
                return true;
            }
            if (action == 3) {
                this.c = false;
                this.d = null;
                jn4 jn4Var2 = this.g;
                if (jn4Var2 != null) {
                    jn4Var2.d(getProgress(), true);
                    this.g.c(this);
                }
                postInvalidate();
                return true;
            }
        }
        return false;
    }
}
