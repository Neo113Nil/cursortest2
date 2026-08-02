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
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.cast.zzdr;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.bko;
import defpackage.e7o;
import defpackage.f2n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class CastSeekBar extends View {
    public zze a;
    public boolean b;
    public Integer c;
    public zzb d;
    public ArrayList e;
    public bko f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;
    public final float k;
    public final Paint l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public int[] q;
    public Point r;
    public f2n s;

    public CastSeekBar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.e = new ArrayList();
        setAccessibilityDelegate(new e7o(this));
        Paint paint = new Paint(1);
        this.l = paint;
        paint.setStyle(Paint.Style.FILL);
        this.g = context.getResources().getDimension(R.dimen.cast_seek_bar_minimum_width);
        this.h = context.getResources().getDimension(R.dimen.cast_seek_bar_minimum_height);
        this.i = context.getResources().getDimension(R.dimen.cast_seek_bar_progress_height) / 2.0f;
        this.j = context.getResources().getDimension(R.dimen.cast_seek_bar_thumb_size) / 2.0f;
        this.k = context.getResources().getDimension(R.dimen.cast_seek_bar_ad_break_minimum_width);
        zze zzeVar = new zze();
        this.a = zzeVar;
        zzeVar.b = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, com.google.android.gms.cast.framework.R.styleable.a, R.attr.castExpandedControllerStyle, R.style.CastExpandedController);
        int resourceId = obtainStyledAttributes.getResourceId(18, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(20, 0);
        int resourceId3 = obtainStyledAttributes.getResourceId(23, 0);
        int resourceId4 = obtainStyledAttributes.getResourceId(0, 0);
        this.m = context.getResources().getColor(resourceId);
        this.n = context.getResources().getColor(resourceId2);
        this.o = context.getResources().getColor(resourceId3);
        this.p = context.getResources().getColor(resourceId4);
        obtainStyledAttributes.recycle();
    }

    public final void a(ArrayList arrayList) {
        if (Objects.a(this.e, arrayList)) {
            return;
        }
        this.e = arrayList == null ? null : new ArrayList(arrayList);
        postInvalidate();
    }

    public final void b(Canvas canvas, int i, int i2, int i3, int i4, int i5) {
        Paint paint = this.l;
        paint.setColor(i5);
        float f = i3;
        float f2 = i2 / f;
        float f3 = i / f;
        float f4 = i4;
        float f5 = f2 * f4;
        float f6 = f3 * f4;
        float f7 = this.i;
        canvas.drawRect(f6, -f7, f5, f7, paint);
    }

    public final void c(int i) {
        zze zzeVar = this.a;
        if (zzeVar.f) {
            int i2 = zzeVar.d;
            int i3 = zzeVar.e;
            Pattern pattern = CastUtils.a;
            this.c = Integer.valueOf(Math.min(Math.max(i, i2), i3));
            bko bkoVar = this.f;
            if (bkoVar != null) {
                bkoVar.b(getProgress(), true);
            }
            f2n f2nVar = this.s;
            if (f2nVar == null) {
                this.s = new f2n(this, 25);
            } else {
                removeCallbacks(f2nVar);
            }
            postDelayed(this.s, 200L);
            postInvalidate();
        }
    }

    public final void d() {
        this.b = true;
        bko bkoVar = this.f;
        if (bkoVar != null) {
            Iterator it = bkoVar.a.d.iterator();
            while (it.hasNext()) {
                ((zzdr) it.next()).g(false);
            }
        }
    }

    public final int e(int i) {
        return (int) ((i / ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) * this.a.b);
    }

    public int getMaxProgress() {
        return this.a.b;
    }

    public int getProgress() {
        Integer num = this.c;
        return num != null ? num.intValue() : this.a.a;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        f2n f2nVar = this.s;
        if (f2nVar != null) {
            removeCallbacks(f2nVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int save = canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        zzb zzbVar = this.d;
        if (zzbVar == null) {
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            int progress = getProgress();
            int save2 = canvas.save();
            canvas.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, measuredHeight / 2);
            zze zzeVar = this.a;
            if (zzeVar.f) {
                int i4 = zzeVar.d;
                if (i4 > 0) {
                    b(canvas, 0, i4, zzeVar.b, measuredWidth, this.o);
                }
                zze zzeVar2 = this.a;
                int i5 = zzeVar2.d;
                if (progress > i5) {
                    b(canvas, i5, progress, zzeVar2.b, measuredWidth, this.m);
                    i3 = progress;
                } else {
                    i3 = progress;
                }
                zze zzeVar3 = this.a;
                int i6 = zzeVar3.e;
                if (i6 > i3) {
                    b(canvas, i3, i6, zzeVar3.b, measuredWidth, this.n);
                }
                zze zzeVar4 = this.a;
                int i7 = zzeVar4.b;
                int i8 = zzeVar4.e;
                if (i7 > i8) {
                    b(canvas, i8, i7, i7, measuredWidth, this.o);
                }
            } else {
                int max = Math.max(zzeVar.c, 0);
                if (max > 0) {
                    i = max;
                    b(canvas, 0, i, this.a.b, measuredWidth, this.o);
                } else {
                    i = max;
                }
                if (progress > i) {
                    b(canvas, i, progress, this.a.b, measuredWidth, this.m);
                    i2 = progress;
                } else {
                    i2 = progress;
                }
                int i9 = this.a.b;
                if (i9 > i2) {
                    b(canvas, i2, i9, i9, measuredWidth, this.o);
                }
            }
            canvas.restoreToCount(save2);
            ArrayList<zza> arrayList = this.e;
            Paint paint = this.l;
            if (arrayList != null && !arrayList.isEmpty()) {
                paint.setColor(this.p);
                int measuredWidth2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                int measuredHeight2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                int save3 = canvas.save();
                canvas.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, measuredHeight2 / 2);
                for (zza zzaVar : arrayList) {
                    if (zzaVar != null) {
                        int min = Math.min(zzaVar.a, this.a.b);
                        int i10 = (zzaVar.c ? zzaVar.b : 1) + min;
                        float f = measuredWidth2;
                        float f2 = this.a.b;
                        float f3 = (i10 * f) / f2;
                        float f4 = (min * f) / f2;
                        float f5 = f3 - f4;
                        float f6 = this.k;
                        if (f5 < f6) {
                            f3 = f4 + f6;
                        }
                        if (f3 <= f) {
                            f = f3;
                        }
                        if (f - f4 < f6) {
                            f4 = f - f6;
                        }
                        float f7 = this.i;
                        canvas.drawRect(f4, -f7, f, f7, paint);
                    }
                }
                canvas.restoreToCount(save3);
            }
            if (isEnabled() && this.a.f) {
                paint.setColor(this.m);
                int measuredWidth3 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                int measuredHeight3 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                double progress2 = getProgress();
                double d = this.a.b;
                int save4 = canvas.save();
                canvas.drawCircle((int) ((progress2 / d) * measuredWidth3), measuredHeight3 / 2.0f, this.j, paint);
                canvas.restoreToCount(save4);
            }
        } else {
            int measuredWidth4 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            int measuredHeight4 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            int save5 = canvas.save();
            canvas.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, measuredHeight4 / 2);
            int i11 = zzbVar.a;
            int i12 = zzbVar.b;
            b(canvas, 0, i11, i12, measuredWidth4, this.p);
            b(canvas, i11, i12, i12, measuredWidth4, this.o);
            canvas.restoreToCount(save5);
        }
        canvas.restoreToCount(save);
    }

    @Override // android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        float paddingLeft = getPaddingLeft();
        setMeasuredDimension(View.resolveSizeAndState((int) (this.g + paddingLeft + getPaddingRight()), i, 0), View.resolveSizeAndState((int) (this.h + getPaddingTop() + getPaddingBottom()), i2, 0));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && this.a.f) {
            if (this.r == null) {
                this.r = new Point();
            }
            int[] iArr = this.q;
            if (iArr == null) {
                iArr = new int[2];
                this.q = iArr;
            }
            getLocationOnScreen(iArr);
            this.r.set((((int) motionEvent.getRawX()) - this.q[0]) - getPaddingLeft(), ((int) motionEvent.getRawY()) - this.q[1]);
            int action = motionEvent.getAction();
            if (action == 0) {
                d();
                c(e(this.r.x));
                return true;
            }
            if (action == 1) {
                c(e(this.r.x));
                this.b = false;
                bko bkoVar = this.f;
                if (bkoVar != null) {
                    bkoVar.a(this);
                }
                return true;
            }
            if (action == 2) {
                c(e(this.r.x));
                return true;
            }
            if (action == 3) {
                this.b = false;
                this.c = null;
                bko bkoVar2 = this.f;
                if (bkoVar2 != null) {
                    bkoVar2.b(getProgress(), true);
                    this.f.a(this);
                }
                postInvalidate();
                return true;
            }
        }
        return false;
    }
}
