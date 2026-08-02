package com.vk.crop.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import com.unity3d.services.UnityAdsConstants;
import com.vk.crop.b;
import com.vk.crop.g;
import com.vungle.ads.internal.protos.Sdk;
import xsna.bfk;
import xsna.gs20;
import xsna.iah0;
import xsna.mc30;

/* loaded from: classes17.dex */
public class AdjusterView extends View implements mc30.a {
    public static final AccelerateInterpolator s = new AccelerateInterpolator(0.5f);
    public static final int t = iah0.a(Sdk.SDKError.Reason.JSON_PARAMS_ENCODE_ERROR_VALUE);
    public static final int u = -10707738;
    public static final int v = -7301991;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final Paint h;
    public final Paint i;
    public final Paint j;
    public final Paint k;
    public a l;
    public final mc30 m;
    public float n;
    public boolean o;
    public View.OnTouchListener p;
    public final float[] q;
    public final int[] r;

    public interface a {
    }

    public AdjusterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 200;
        this.c = iah0.a(6.0f);
        this.d = iah0.a(6);
        this.e = iah0.a(16);
        this.f = iah0.a(4);
        this.g = iah0.a(1);
        Paint paint = new Paint();
        this.h = paint;
        Paint paint2 = new Paint();
        this.i = paint2;
        Paint paint3 = new Paint();
        this.j = paint3;
        Paint paint4 = new Paint();
        this.k = paint4;
        this.n = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.o = true;
        this.q = new float[200];
        this.r = new int[200];
        this.m = new mc30(this);
        paint.setColor(v);
        paint.setStrokeWidth(iah0.a(1.0f));
        int i = u;
        paint2.setColor(i);
        paint2.setStrokeWidth(iah0.a(1.0f));
        paint4.setColor(i);
        paint4.setStrokeWidth(iah0.a(2.0f));
        paint4.setStyle(Paint.Style.STROKE);
        paint4.setAntiAlias(true);
        paint3.setColor(i);
        paint3.setStyle(Paint.Style.FILL);
        paint3.setAntiAlias(true);
    }

    @Override // xsna.mc30.a
    public final void b(float f, float f2) {
        boolean z;
        boolean z2;
        float width = (((-f) / getWidth()) / 2.0f) * 45.0f;
        float f3 = this.n + width;
        if (Math.abs(f3) <= 45.0f) {
            this.n += width;
        } else if (f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.n = 45.0f;
        } else {
            this.n = -45.0f;
        }
        a aVar = this.l;
        if (aVar != null) {
            float f4 = this.n;
            b bVar = (b) aVar;
            bfk bfkVar = bVar.c;
            g gVar = bVar.e;
            float f5 = gVar.f;
            gs20 gs20Var = bVar.a;
            float f6 = gVar.b;
            float f7 = gVar.c;
            if (gVar.g % 180.0f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                z = false;
                z2 = true;
            } else {
                z = false;
                z2 = false;
            }
            float a2 = gs20Var.a(f5, f6, f7, bfkVar.getCropWidth(), bfkVar.getCropHeight(), z2);
            float f8 = gVar.e;
            float f9 = f4 - f5;
            gVar.a.postRotate(f9, bfkVar.getCenterX(), bfkVar.getCenterY());
            gVar.f += f9;
            float a3 = bVar.a.a(f4, gVar.b, gVar.c, bfkVar.getCropWidth(), bfkVar.getCropHeight(), gVar.g % 180.0f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? true : z);
            float f10 = gVar.e;
            if (a3 > f10 || a2 == f8) {
                gVar.a(a3 / f10, bfkVar.getCenterX(), bfkVar.getCenterY(), z);
            }
            bVar.d(z);
        }
        invalidate();
    }

    public float getCurrentRotation() {
        return this.n;
    }

    public a getScrollListener() {
        return this.l;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c8 A[SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float[] fArr;
        int[] iArr;
        float f;
        float f2;
        float f3;
        float f4;
        int i;
        super.onDraw(canvas);
        float width = canvas.getWidth() / 2;
        int i2 = 0;
        while (true) {
            fArr = this.q;
            if (i2 >= fArr.length) {
                break;
            }
            fArr[i2] = -1.0f;
            i2++;
        }
        float f5 = 1.0f;
        float currentRotation = ((((getCurrentRotation() / 45.0f) + 1.0f) / 2.0f) * 56.0f) + ((fArr.length / 2) - 28);
        int i3 = (int) currentRotation;
        float f6 = currentRotation - i3;
        int i4 = 0;
        while (true) {
            int i5 = this.b;
            iArr = this.r;
            if (i4 >= i5) {
                break;
            }
            if (i4 == 0) {
                fArr[i3] = width - ((float) (Math.sin((f6 / 20.0f) * 1.2566371f) * width));
                iArr[i3] = 255;
                f = f5;
            } else {
                int i6 = i3 - i4;
                AccelerateInterpolator accelerateInterpolator = s;
                f = f5;
                if (i6 >= 0) {
                    float f7 = (-((i4 - (f - f6)) + f)) / 20.0f;
                    if (f7 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f7 >= -1.0f) {
                        f2 = 1.2566371f;
                        f3 = 0.0f;
                        double sin = Math.sin(f7 * 1.2566371f);
                        f4 = 20.0f;
                        fArr[i6] = ((float) (width * sin)) + width;
                        iArr[i6] = (int) (accelerateInterpolator.getInterpolation((float) (sin + 1.0d)) * 255.0f);
                        i = i3 + i4;
                        if (i >= fArr.length) {
                            float f8 = (((f - f6) + i4) - f) / f4;
                            if (f8 >= f3 && f8 <= f) {
                                double sin2 = Math.sin(f8 * f2);
                                fArr[i] = ((float) (width * sin2)) + width;
                                iArr[i] = (int) (accelerateInterpolator.getInterpolation((float) (1.0d - sin2)) * 255.0f);
                            }
                        }
                    }
                }
                f2 = 1.2566371f;
                f3 = 0.0f;
                f4 = 20.0f;
                i = i3 + i4;
                if (i >= fArr.length) {
                }
            }
            i4++;
            f5 = f;
        }
        int paddingTop = getPaddingTop() + this.e + 1;
        for (int i7 = 0; i7 < fArr.length; i7++) {
            float f9 = fArr[i7];
            if (f9 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f9 < canvas.getWidth()) {
                if (i7 == fArr.length / 2) {
                    int i8 = iArr[i7];
                    Paint paint = this.i;
                    paint.setAlpha(i8);
                    int i9 = iArr[i7];
                    Paint paint2 = this.j;
                    paint2.setAlpha(i9);
                    float f10 = fArr[i7];
                    int i10 = this.d;
                    canvas.drawLine(f10, paddingTop - i10, f10, i10 + paddingTop, paint);
                    canvas.drawCircle(fArr[i7], r5 + this.f, this.g, paint2);
                } else {
                    Paint paint3 = this.h;
                    if ((i7 <= i3 || i7 >= fArr.length / 2) && (i7 > i3 || i7 <= fArr.length / 2)) {
                        paint3.setColor(v);
                    } else {
                        paint3.setColor(u);
                    }
                    paint3.setAlpha(iArr[i7]);
                    float f11 = fArr[i7];
                    int i11 = this.c;
                    canvas.drawLine(f11, paddingTop - i11, f11, i11 + paddingTop, paint3);
                }
            }
        }
        canvas.drawLine(canvas.getWidth() / 2, paddingTop - r2, canvas.getWidth() / 2, paddingTop + r2, this.k);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = t;
        if (size > i3) {
            i = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.o) {
            return true;
        }
        View.OnTouchListener onTouchListener = this.p;
        if (onTouchListener != null) {
            onTouchListener.onTouch(this, motionEvent);
        }
        try {
            this.m.a(motionEvent);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public void setCurrentScroll(float f) {
        this.n = f;
        invalidate();
    }

    public void setScrollListener(a aVar) {
        this.l = aVar;
    }

    public void setTouchEnabled(boolean z) {
        this.o = z;
    }

    public void setTransparentTouchListener(View.OnTouchListener onTouchListener) {
        this.p = onTouchListener;
    }
}
