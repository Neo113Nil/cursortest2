package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class l5m extends Drawable {
    public static final /* synthetic */ int h = 0;
    public final s2 a = new s2(this, 23);
    public final Paint b;
    public final Rect c;
    public final Matrix d;
    public ValueAnimator e;
    public float f;
    public abm g;

    public l5m() {
        Paint paint = new Paint();
        this.b = paint;
        this.c = new Rect();
        this.d = new Matrix();
        this.f = -1.0f;
        paint.setAntiAlias(true);
    }

    public final void a() {
        abm abmVar;
        try {
            ValueAnimator valueAnimator = this.e;
            if (valueAnimator == null || !valueAnimator.isStarted() || (abmVar = this.g) == null || !abmVar.i || getCallback() == null) {
                return;
            }
            valueAnimator.start();
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    public final void b() {
        abm abmVar;
        Shader linearGradient;
        try {
            Rect bounds = getBounds();
            bounds.getClass();
            int width = bounds.width();
            int height = bounds.height();
            if (width != 0 && height != 0 && (abmVar = this.g) != null) {
                int b = wzb.b(abmVar.e * width);
                abm abmVar2 = this.g;
                int b2 = abmVar2 != null ? wzb.b(abmVar2.f * height) : 0;
                Integer num = this.g != null ? 0 : null;
                if (num != null && num.intValue() == 0) {
                    float f = b;
                    abm abmVar3 = this.g;
                    linearGradient = new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, abmVar3 != null ? abmVar3.b : new int[0], abmVar3 != null ? abmVar3.a : new float[0], Shader.TileMode.CLAMP);
                    this.b.setShader(linearGradient);
                }
                if (num.intValue() == 1) {
                    float f2 = b / 2.0f;
                    float f3 = b2 / 2.0f;
                    if (b < b2) {
                        b = b2;
                    }
                    float sqrt = (float) (b / Math.sqrt(2.0d));
                    abm abmVar4 = this.g;
                    linearGradient = new RadialGradient(f2, f3, sqrt, abmVar4 != null ? abmVar4.b : new int[0], abmVar4 != null ? abmVar4.a : null, Shader.TileMode.CLAMP);
                    this.b.setShader(linearGradient);
                }
                float f4 = b;
                abm abmVar5 = this.g;
                linearGradient = new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, abmVar5 != null ? abmVar5.b : new int[0], abmVar5 != null ? abmVar5.a : new float[0], Shader.TileMode.CLAMP);
                this.b.setShader(linearGradient);
            }
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    public final void c() {
        boolean z;
        ValueAnimator valueAnimator;
        try {
            if (this.g == null) {
                return;
            }
            ValueAnimator valueAnimator2 = this.e;
            if (valueAnimator2 != null) {
                z = valueAnimator2.isStarted();
                ValueAnimator valueAnimator3 = this.e;
                if (valueAnimator3 != null) {
                    valueAnimator3.cancel();
                }
                ValueAnimator valueAnimator4 = this.e;
                if (valueAnimator4 != null) {
                    valueAnimator4.removeAllUpdateListeners();
                }
            } else {
                z = false;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (this.g != null ? r3.n / r3.m : 0.0f) + 1.0f);
            this.e = ofFloat;
            if (ofFloat != null) {
                ofFloat.setInterpolator(new LinearInterpolator());
            }
            ValueAnimator valueAnimator5 = this.e;
            if (valueAnimator5 != null) {
                abm abmVar = this.g;
                valueAnimator5.setRepeatMode(abmVar != null ? abmVar.l : 0);
            }
            ValueAnimator valueAnimator6 = this.e;
            if (valueAnimator6 != null) {
                valueAnimator6.setStartDelay(0L);
            }
            ValueAnimator valueAnimator7 = this.e;
            if (valueAnimator7 != null) {
                abm abmVar2 = this.g;
                valueAnimator7.setRepeatCount(abmVar2 != null ? abmVar2.k : 0);
            }
            ValueAnimator valueAnimator8 = this.e;
            if (valueAnimator8 != null) {
                abm abmVar3 = this.g;
                valueAnimator8.setDuration(abmVar3 != null ? abmVar3.m + abmVar3.n : 0L);
            }
            ValueAnimator valueAnimator9 = this.e;
            if (valueAnimator9 != null) {
                valueAnimator9.addUpdateListener(this.a);
            }
            if (!z || (valueAnimator = this.e) == null) {
                return;
            }
            valueAnimator.start();
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x006d, code lost:
    
        if (r10.intValue() != 0) goto L30;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        float f;
        float f2;
        float b;
        Paint paint = this.b;
        Matrix matrix = this.d;
        Rect rect = this.c;
        canvas.getClass();
        try {
            if (this.g != null && paint.getShader() != null) {
                float tan = (float) Math.tan(Math.toRadians(0.0d));
                float width = (rect.width() * tan) + rect.height();
                float height = (tan * rect.height()) + rect.width();
                float f3 = this.f;
                if (f3 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    ValueAnimator valueAnimator = this.e;
                    if (valueAnimator != null) {
                        Object animatedValue = valueAnimator.getAnimatedValue();
                        Float f4 = animatedValue instanceof Float ? (Float) animatedValue : null;
                        if (f4 != null) {
                            f3 = f4.floatValue();
                        }
                    }
                    f3 = 0.0f;
                }
                Integer num = this.g != null ? 0 : null;
                if (num != null) {
                }
                if (num != null && num.intValue() == 2) {
                    f = me4.b(-height, height, f3, height);
                    f2 = 0.0f;
                    matrix.reset();
                    matrix.setRotate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, rect.width() / 2.0f, rect.height() / 2.0f);
                    matrix.preTranslate(f, f2);
                    paint.getShader().setLocalMatrix(matrix);
                    canvas.drawRect(rect, paint);
                }
                if (num.intValue() == 1) {
                    float f5 = -width;
                    b = me4.b(width, f5, f3, f5);
                    f2 = b;
                    f = 0.0f;
                    matrix.reset();
                    matrix.setRotate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, rect.width() / 2.0f, rect.height() / 2.0f);
                    matrix.preTranslate(f, f2);
                    paint.getShader().setLocalMatrix(matrix);
                    canvas.drawRect(rect, paint);
                }
                if (num != null && num.intValue() == 3) {
                    b = me4.b(-width, width, f3, width);
                    f2 = b;
                    f = 0.0f;
                    matrix.reset();
                    matrix.setRotate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, rect.width() / 2.0f, rect.height() / 2.0f);
                    matrix.preTranslate(f, f2);
                    paint.getShader().setLocalMatrix(matrix);
                    canvas.drawRect(rect, paint);
                }
                float f6 = -height;
                f = me4.b(height, f6, f3, f6);
                f2 = 0.0f;
                matrix.reset();
                matrix.setRotate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, rect.width() / 2.0f, rect.height() / 2.0f);
                matrix.preTranslate(f, f2);
                paint.getShader().setLocalMatrix(matrix);
                canvas.drawRect(rect, paint);
            }
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        abm abmVar = this.g;
        if (abmVar != null) {
            return (abmVar.h || abmVar.j) ? -3 : -1;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        rect.getClass();
        try {
            super.onBoundsChange(rect);
            this.c.set(rect);
            b();
            a();
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
