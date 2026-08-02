package com.vk.stories.design.view.editor;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.unity3d.services.UnityAdsConstants;
import com.vk.movika.sdk.android.defaultplayer.control.m;
import com.vk.typography.FontFamily;
import com.vk.typography.b;
import com.vkontakte.android.R;
import java.util.Arrays;
import java.util.NoSuchElementException;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.an10;
import xsna.bn10;
import xsna.e3m;
import xsna.e43;
import xsna.epx;
import xsna.gpt0;
import xsna.iah0;
import xsna.kd7;
import xsna.m33;
import xsna.m9i0;
import xsna.n9i0;
import xsna.o9i0;
import xsna.p31;
import xsna.rl3;
import xsna.rqi;
import xsna.u11;
import xsna.z8s;

/* compiled from: SelectRangeWaveFormView.kt */
/* loaded from: classes6.dex */
public final class SelectRangeWaveFormView extends View implements View.OnTouchListener {
    public static final float A0;
    public static final float B0;
    public static final float C0;
    public static final float D0;
    public static final float E0;
    public static final float F0;
    public static final float G0;
    public static final float H0;
    public static final float I0;
    public static final float J0;
    public static final float K0;
    public static final float u0;
    public static final float v0;
    public static final float w0 = iah0.f().widthPixels - iah0.b(64.0f);
    public static final float x0 = iah0.a(64);
    public static final float y0;
    public static final float z0;
    public final TextPaint A;
    public final Paint B;
    public final Paint C;
    public final Bitmap D;
    public final Bitmap E;
    public final Bitmap F;
    public final Bitmap G;
    public final Bitmap H;
    public final Bitmap I;
    public float[] J;
    public int K;
    public float L;
    public float M;
    public float N;
    public float O;
    public float P;
    public float Q;
    public float R;
    public float S;
    public float T;
    public float U;
    public float V;
    public float W;
    public float a0;
    public m9i0 b;
    public int b0;
    public boolean c;
    public int c0;
    public boolean d;
    public int d0;
    public boolean e;
    public boolean e0;
    public boolean f;
    public boolean f0;
    public boolean g;
    public boolean g0;
    public int h;
    public float h0;
    public int i;
    public float i0;
    public int j;
    public String j0;
    public float k;
    public String k0;
    public float l;
    public float l0;
    public float m;
    public float m0;
    public boolean n;
    public int n0;
    public boolean o;
    public int o0;
    public byte[] p;
    public String[] p0;
    public byte[] q;
    public float[] q0;
    public byte r;
    public boolean r0;
    public Integer s;
    public final GestureDetector s0;
    public boolean t;
    public final ValueAnimator t0;
    public final Paint u;
    public final Paint v;
    public final Paint w;
    public final Paint x;
    public final Paint y;
    public final Paint z;

    /* compiled from: SelectRangeWaveFormView.kt */
    public static final class a {
        public static final int a(float[] fArr, float f) {
            float f2 = SelectRangeWaveFormView.u0;
            int length = (fArr.length / 4) - 1;
            int i = 0;
            while (i <= length) {
                int i2 = (i + length) >>> 1;
                int compare = Float.compare(fArr[i2 * 4], f);
                if (compare < 0) {
                    i = i2 + 1;
                } else {
                    if (compare <= 0) {
                        return i2;
                    }
                    length = i2 - 1;
                }
            }
            return i;
        }
    }

    static {
        float f = 8;
        u0 = iah0.a(f);
        v0 = iah0.a(r1);
        y0 = iah0.a(f);
        iah0.a(4);
        z0 = 13.0f;
        A0 = iah0.a(r0);
        float a2 = iah0.a(12);
        B0 = a2;
        C0 = 5 * a2;
        D0 = a2 * 1.5f;
        E0 = iah0.a(r1);
        F0 = iah0.a(36.0f);
        G0 = iah0.a(20.0f);
        H0 = iah0.a(14.0f);
        I0 = iah0.a(8.0f);
        J0 = iah0.a(6.0f);
        K0 = iah0.b(4.0f);
    }

    public SelectRangeWaveFormView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        float f = v0;
        this.k = 0.5f * f;
        this.l = f;
        this.m = u0;
        this.p = new byte[0];
        this.q = new byte[0];
        this.t = true;
        Paint b = rqi.b(1, -1191182337);
        b.setStrokeWidth(this.l);
        Paint.Cap cap = Paint.Cap.ROUND;
        b.setStrokeCap(cap);
        this.u = b;
        Paint paint = new Paint(1);
        Context context2 = getContext();
        e3m.a aVar = e3m.a;
        paint.setColor(context2.getColor(R.color.vk_steel_gray_200));
        paint.setStrokeWidth(this.l);
        paint.setStrokeCap(cap);
        this.v = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(getContext().getColor(R.color.vk_azure_300));
        paint2.setStrokeWidth(this.l);
        paint2.setStrokeCap(cap);
        this.w = paint2;
        Paint paint3 = new Paint(1);
        paint3.setColor(getContext().getColor(R.color.vk_orange));
        paint3.setStrokeWidth(this.l);
        paint3.setStrokeCap(cap);
        this.x = paint3;
        Paint b2 = rqi.b(1, -1);
        b2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        this.y = b2;
        Paint paint4 = new Paint(1);
        Context context3 = e43.a;
        paint4.setColor((context3 == null ? null : context3).getColor(R.color.vk_azure_300));
        this.z = paint4;
        TextPaint textPaint = new TextPaint(1);
        textPaint.setColor(-1);
        textPaint.setAlpha(184);
        b.j(textPaint, getContext(), FontFamily.REGULAR, Float.valueOf(z0), 8);
        this.A = textPaint;
        this.B = new Paint(2);
        Paint paint5 = new Paint(2);
        paint5.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.C = paint5;
        Bitmap f2 = kd7.f(m33.a(R.drawable.vk_icon_chevron_16, getContext()));
        this.D = f2;
        Bitmap k = kd7.k(f2, 180, false);
        this.E = k;
        this.F = k;
        this.G = f2;
        this.H = ((BitmapDrawable) m33.a(R.drawable.vk_icon_deprecated_ic_label_music_background_28, getContext())).getBitmap();
        this.I = ((BitmapDrawable) m33.a(R.drawable.ic_label_music_foreground_28, getContext())).getBitmap();
        this.J = new float[0];
        this.h0 = w0;
        this.i0 = C0;
        this.j0 = "";
        this.k0 = "";
        this.p0 = new String[0];
        this.q0 = new float[0];
        setOnTouchListener(this);
        this.s0 = new GestureDetector(getContext(), new o9i0(this));
        n9i0 n9i0Var = new n9i0(this);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(200L);
        valueAnimator.setInterpolator(new DecelerateInterpolator());
        valueAnimator.addUpdateListener(new m(this, 2));
        valueAnimator.addListener(n9i0Var);
        this.t0 = valueAnimator;
    }

    public static void a(SelectRangeWaveFormView selectRangeWaveFormView, ValueAnimator valueAnimator) {
        selectRangeWaveFormView.setCommonOffset(selectRangeWaveFormView.T + ((Float) valueAnimator.getAnimatedValue()).floatValue());
        selectRangeWaveFormView.invalidate();
    }

    private final boolean getDrawBoundArrows() {
        return this.c && this.d;
    }

    private final float getFullLineCenterSpace() {
        return (getXPointsCount() - 1) * this.m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getLeftBound() {
        return (-this.N) - this.k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double getLeftOffsetPercent() {
        return ((this.M + this.L) - this.k) / getXCoordDiff();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double getLeftPercent() {
        return Math.max(((this.N + this.L) - this.k) / getXCoordDiff(), ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getRecommendedTimeX() {
        return this.J[this.d0 * 4];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getRightBound() {
        return (getFullLineCenterSpace() - this.O) + this.k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double getRightPercent() {
        return Math.min(((this.O + this.L) + this.k) / getXCoordDiff(), 1.0d);
    }

    private final double getXCoordDiff() {
        float[] fArr = this.J;
        return fArr[fArr.length - 2] - fArr[0];
    }

    private final int getXPointsCount() {
        return this.J.length / 4;
    }

    public static final void i(SelectRangeWaveFormView selectRangeWaveFormView) {
        ValueAnimator valueAnimator = selectRangeWaveFormView.t0;
        if (selectRangeWaveFormView.K != 5) {
            return;
        }
        if (valueAnimator.isStarted() || valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        float b = bn10.b(selectRangeWaveFormView.U, selectRangeWaveFormView.getLeftBound() - selectRangeWaveFormView.L, selectRangeWaveFormView.getRightBound() - selectRangeWaveFormView.L);
        selectRangeWaveFormView.T = selectRangeWaveFormView.L;
        valueAnimator.setFloatValues(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, b);
        valueAnimator.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCommonOffset(float f) {
        float f2;
        float f3 = f - this.L;
        this.n0 = -1;
        this.o0 = -1;
        int xPointsCount = getXPointsCount();
        int i = 0;
        while (true) {
            f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (i >= xPointsCount) {
                break;
            }
            float[] fArr = this.J;
            int i2 = i * 4;
            fArr[i2] = fArr[i2] - f3;
            int i3 = i2 + 2;
            fArr[i3] = fArr[i3] - f3;
            if (this.n0 == -1) {
                if (fArr[i2] - this.k > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    this.n0 = Math.max(0, i - 1);
                }
            } else if (this.o0 == -1 && fArr[i2] + this.k > iah0.f().widthPixels) {
                this.o0 = i;
            }
            i++;
        }
        int max = Math.max(0, this.n0);
        this.n0 = max;
        if (this.o0 < max) {
            this.o0 = getXPointsCount();
        }
        this.o0 = Math.min(this.o0, getXPointsCount());
        if (this.g0) {
            this.P -= f3;
        }
        this.L = f;
        t();
        u();
        int i4 = this.j;
        if (i4 != 0) {
            f2 = k(i4);
        }
        this.S = f2;
    }

    private final void setLineWidth(float f) {
        this.l = f;
        this.k = 0.5f * f;
        this.u.setStrokeWidth(f);
        this.v.setStrokeWidth(f);
        this.w.setStrokeWidth(f);
        this.x.setStrokeWidth(f);
    }

    public final float getMaxTopOffset() {
        return Math.max(this.V, F0);
    }

    public final int getProgressMs() {
        return this.j;
    }

    public final void j() {
        byte[] bArr;
        byte b;
        byte[] bArr2;
        byte b2;
        byte[] bArr3 = this.q;
        if (bArr3.length == 0) {
            throw new NoSuchElementException();
        }
        byte b3 = bArr3[0];
        int length = bArr3.length - 1;
        if (1 <= length) {
            int i = 1;
            while (true) {
                byte b4 = bArr3[i];
                if (b3 < b4) {
                    b3 = b4;
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        float f = (x0 * 0.5f) + this.V;
        int length2 = this.q.length;
        boolean z = false;
        for (int i2 = 0; i2 < length2; i2++) {
            if (this.r == b3 && (b = (bArr = this.q)[i2]) != (b2 = (bArr2 = this.p)[i2])) {
                if (b2 < b) {
                    bArr2[i2] = (byte) (b2 + 1);
                }
                byte b5 = bArr2[i2];
                if (b5 > bArr[i2]) {
                    bArr2[i2] = (byte) (b5 - 1);
                }
                int i3 = i2 * 4;
                float max = Math.max((bArr2[i2] / b3) * A0, 1.0f);
                float[] fArr = this.J;
                fArr[i3 + 1] = f - max;
                fArr[i3 + 3] = max + f;
                z = true;
            }
        }
        if (z) {
            postDelayed(new p31(this, 20), 32L);
        }
        this.r = b3;
    }

    public final float k(int i) {
        int i2;
        float[] fArr = this.J;
        return (fArr.length < 4 || (i2 = this.h) == 0) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : (((fArr[fArr.length - 2] - fArr[0]) * (i / (i2 * 1000))) - this.L) - this.k;
    }

    public final String l(float f) {
        if (this.r0) {
            return String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
        }
        int b = an10.b(f);
        String[] strArr = this.p0;
        if (strArr[b] == null) {
            gpt0 gpt0Var = gpt0.a;
            strArr[b] = z8s.a(b);
        }
        String str = this.p0[b];
        return str == null ? "" : str;
    }

    public final float m(float f) {
        String l = l(f);
        boolean z = this.r0;
        TextPaint textPaint = this.A;
        if (z) {
            return textPaint.measureText(l);
        }
        int b = an10.b(f);
        float[] fArr = this.q0;
        if (fArr[b] == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            fArr[b] = textPaint.measureText(l);
        }
        return this.q0[b];
    }

    public final boolean n(float f, boolean z) {
        float f2;
        float f3 = z ? -1.0f : this.f ? 0.0f : 1.0f;
        float f4 = z ? this.f ? 0.0f : -1.0f : 1.0f;
        float max = Math.max(this.N - (f3 * f), this.Q);
        float min = Math.min((f4 * f) + this.O, this.R);
        if (this.f) {
            f2 = bn10.b(((f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || this.L - f >= (-max) - this.k) && (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || this.L - f <= (getFullLineCenterSpace() - min) + this.k)) ? this.L : this.L - f, (-max) - this.k, (getFullLineCenterSpace() - min) + this.k);
        } else {
            f2 = this.L + f;
        }
        float f5 = f2 - this.L;
        Float Q = rl3.Q(0, this.J);
        float floatValue = ((Q != null ? Q.floatValue() : 0.0f) - f5) - this.k;
        if (this.f || max >= floatValue || f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            float max2 = Math.max(floatValue, max);
            Float Q2 = rl3.Q(r7.length - 2, this.J);
            float floatValue2 = ((Q2 != null ? Q2.floatValue() : 0.0f) - f5) + this.k;
            if (this.f || min <= floatValue2 || f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                float min2 = Math.min(floatValue2, min);
                float f6 = min - max;
                float f7 = this.i0;
                if (f6 > f7 || ((!z || f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) && (z || f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT))) {
                    if (f7 >= f6 || f6 >= this.h0) {
                        return true;
                    }
                    if (!this.f) {
                        f2 = (min2 - min) + (max2 - max) + f2;
                    }
                    this.N = max2;
                    this.O = min2;
                    setCommonOffset(f2);
                    return true;
                }
            }
        }
        return false;
    }

    public final void o() {
        int a2 = an10.a(this.h * 1000 * getLeftOffsetPercent());
        int a3 = an10.a(this.h * 1000 * getLeftPercent());
        int min = Math.min(this.i + a3, an10.a(this.h * 1000 * getRightPercent()));
        int i = this.f ? a3 - a2 : 0;
        m9i0 m9i0Var = this.b;
        if (m9i0Var != null) {
            m9i0Var.i1(i, a3, min, this.K == 3);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint;
        Paint paint2;
        Canvas canvas2;
        float f;
        int i;
        float f2;
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap bitmap3;
        int i2;
        super.onDraw(canvas);
        boolean z = this.c;
        Paint paint3 = this.y;
        Paint paint4 = this.z;
        float f3 = x0;
        float f4 = B0;
        if (z) {
            float f5 = this.N - f4;
            float f6 = this.V;
            float f7 = y0;
            canvas.drawRoundRect(f5, f6, this.O + f4, f6 + f3, f7, f7, paint4);
            paint = paint4;
            paint2 = paint3;
        } else {
            paint = paint4;
            float f8 = this.N;
            float f9 = this.V;
            float f10 = y0;
            paint2 = paint3;
            canvas.drawRoundRect(f8, f9, this.O, f9 + f3, f10, f10, paint2);
        }
        if (this.c) {
            float f11 = this.N;
            float f12 = this.V;
            float f13 = E0;
            float f14 = f12 + f13;
            float f15 = this.O;
            float f16 = (f12 + f3) - f13;
            float f17 = y0;
            canvas2 = canvas;
            canvas2.drawRoundRect(f11, f14, f15, f16, f17, f17, paint2);
        } else {
            canvas2 = canvas;
        }
        if (this.J.length >= 4) {
            int i3 = this.n0;
            int max = Math.max((this.b0 - i3) - (this.e0 ? 1 : 0), 0);
            if (this.e0) {
                max++;
            }
            Paint paint5 = this.u;
            canvas2.drawLines(this.J, i3 * 4, max * 4, paint5);
            int i4 = i3 + max;
            if (this.e0) {
                i4--;
            }
            int min = Math.min((this.c0 - i4) + (this.f0 ? 1 : 0), (this.J.length / 4) - i4);
            if (min < 0) {
                min = 0;
            }
            int save = canvas2.save();
            float f18 = this.N;
            float f19 = this.V;
            i = 1;
            canvas2.clipRect(f18, f19, this.O, f19 + f3);
            int i5 = i4 * 4;
            int i6 = min * 4;
            canvas2.drawLines(this.J, i5, i6, this.v);
            float f20 = this.S;
            if (f20 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                float f21 = this.N;
                f = 0.0f;
                float f22 = this.V;
                i2 = 4;
                canvas2.clipRect(f21, f22, f20, f22 + f3);
                canvas2.drawLines(this.J, i5, i6, this.w);
            } else {
                i2 = 4;
                f = 0.0f;
            }
            canvas2.restoreToCount(save);
            int i7 = i4 + min;
            int i8 = this.o0 - i7;
            if (this.f0) {
                i7--;
                i8++;
            }
            int c = bn10.c(i7, 0, getXPointsCount() - 1);
            int c2 = bn10.c(i8, 0, (getXPointsCount() - c) - 1);
            int save2 = canvas2.save();
            canvas2.clipRect(this.O, this.V, canvas2.getWidth(), this.V + f3);
            canvas2.drawLines(this.J, c * 4, c2 * 4, paint5);
            canvas2.restoreToCount(save2);
            if (this.g0) {
                canvas2.drawLines(this.J, this.d0 * 4, i2, this.x);
            }
        } else {
            f = 0.0f;
            i = 1;
        }
        if (this.c) {
            float f23 = this.N;
            float f24 = this.V;
            float f25 = y0;
            Paint paint6 = paint;
            canvas2.drawRect(f23, f24 + f25, f23 - f4, (f24 + f3) - f25, paint6);
            float f26 = this.O;
            float f27 = this.V;
            float f28 = f27 + f25;
            float f29 = (f27 + f3) - f25;
            canvas2 = canvas;
            canvas2.drawRect(f26 + f4, f28, f26, f29, paint6);
        }
        if (getDrawBoundArrows()) {
            float f30 = this.O;
            float f31 = this.N;
            if (f30 - f31 > f) {
                boolean z2 = this.e;
                Paint paint7 = this.C;
                if (!z2 || (bitmap2 = this.F) == null || (bitmap3 = this.G) == null) {
                    Bitmap bitmap4 = this.D;
                    if (bitmap4 != null && (bitmap = this.E) != null) {
                        canvas2.drawBitmap(bitmap4, f31 - f4, this.a0, paint7);
                        canvas2.drawBitmap(bitmap, this.O, this.a0, paint7);
                    }
                } else {
                    canvas2.drawBitmap(bitmap2, f31 - f4, this.a0, paint7);
                    canvas2.drawBitmap(bitmap3, this.O, this.a0, paint7);
                }
            }
        }
        if (this.g0 && this.t) {
            float recommendedTimeX = getRecommendedTimeX();
            float f32 = recommendedTimeX - H0;
            Bitmap bitmap5 = this.H;
            Paint paint8 = this.B;
            f2 = f;
            canvas2.drawBitmap(bitmap5, f32, f2, paint8);
            canvas2.drawBitmap(this.I, recommendedTimeX - I0, J0, paint8);
        } else {
            f2 = f;
        }
        boolean z3 = this.n;
        float f33 = z3 ? -f4 : f2;
        if (!z3) {
            f4 = f2;
        }
        float f34 = this.N + f33;
        float a2 = ((this.O - this.m0) - iah0.a(i)) + f4;
        float f35 = a2 - (this.l0 + f34);
        float f36 = K0;
        if (f35 < f36) {
            float f37 = (f36 - f35) / 2;
            f34 -= f37;
            a2 += f37;
        }
        String str = this.j0;
        float height = getHeight();
        TextPaint textPaint = this.A;
        canvas2.drawText(str, f34, height, textPaint);
        canvas2.drawText(this.k0, a2, getHeight(), textPaint);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = iah0.f().widthPixels;
        int a2 = e3m.a(R.dimen.story_music_range_selector_height, getContext());
        float f = this.V;
        int i4 = a2 + ((int) f);
        this.a0 = u11.b(x0, this.D != null ? r1.getHeight() : 0, 0.5f, f);
        setMeasuredDimension(i3, i4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        if (r8 != 3) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00bd, code lost:
    
        if (r8 <= r7) goto L55;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = this.K;
        int i2 = 3;
        if ((i == 0 || i == 1) && this.s0.onTouchEvent(motionEvent) && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return true;
        }
        if (this.K == 4) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float f = x - this.W;
                    int i3 = this.K;
                    if (i3 == 1) {
                        setCommonOffset(bn10.b(this.L - f, getLeftBound(), getRightBound()));
                        invalidate();
                        p();
                    } else if (i3 != 2) {
                        if (i3 == 3 && n(f, false)) {
                            invalidate();
                            p();
                        }
                    } else if (n(f, true)) {
                        invalidate();
                        p();
                    }
                }
            }
            if (this.K != 0) {
                o();
                this.K = 0;
            }
        } else {
            float f2 = this.V;
            if (y > x0 + f2 || f2 > y) {
                i2 = 0;
            } else {
                if (this.d) {
                    float f3 = this.N;
                    float f4 = B0 * 0.5f;
                    float f5 = f3 - f4;
                    float f6 = f4 + this.O;
                    float f7 = D0;
                    float f8 = f5 - f7;
                    if (x > f5 + f7 || f8 > x) {
                        float f9 = f6 - f7;
                        if (x <= f6 + f7) {
                        }
                    } else {
                        i2 = 2;
                    }
                }
                i2 = 1;
            }
            this.K = i2;
            if (i2 != 0) {
                this.T = this.L;
                m9i0 m9i0Var = this.b;
                if (m9i0Var != null) {
                    m9i0Var.g();
                }
            }
        }
        this.W = x;
        return true;
    }

    public final void p() {
        int a2 = an10.a(this.h * 1000 * getLeftOffsetPercent());
        int a3 = an10.a(this.h * 1000 * getLeftPercent());
        int min = Math.min(this.i + a3, an10.a(this.h * 1000 * getRightPercent()));
        int i = this.f ? a3 - a2 : 0;
        m9i0 m9i0Var = this.b;
        if (m9i0Var != null) {
            m9i0Var.r1(i, a3, min, this.K == 3);
        }
    }

    public final void q(int i, int i2, int i3) {
        int min = Math.min(i3, this.h * 1000);
        if (!this.f) {
            i = 0;
        }
        int i4 = i2 - i;
        this.N = k(i4);
        float k = k(min);
        this.O = k;
        float f = ((i4 / 1000) * ((k - this.N) / (((min - i2) + i) / 1000.0f))) - ((iah0.f().widthPixels - (this.O - this.N)) * 0.5f);
        if (this.L < f) {
            setCommonOffset(f);
        }
        this.M = k(i4);
        this.N = k(i2);
        float k2 = k(min);
        this.O = k2;
        boolean z = this.f;
        float f2 = w0;
        setCommonOffset(this.L + (this.M - ((iah0.f().widthPixels - (z ? f2 : k2 - this.M)) * 0.5f)));
        this.Q = (iah0.f().widthPixels - f2) * 0.5f;
        this.R = (iah0.f().widthPixels + f2) * 0.5f;
        this.M = k(i4);
        this.N = Math.max(k(i2), this.Q);
        this.O = Math.min(k(min), this.R);
        t();
        u();
        invalidate();
    }

    public final void r(int i, int i2) {
        this.h = i;
        this.i = i2;
        int i3 = i + 3;
        this.p0 = new String[i3];
        float[] fArr = new float[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            fArr[i4] = 0.0f;
        }
        this.q0 = fArr;
        u();
        invalidate();
    }

    public final void s(int i) {
        this.j = i;
        this.S = i == 0 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : k(i);
        invalidate();
    }

    public final void setActiveLineColor(int i) {
        this.w.setColor(i);
        invalidate();
    }

    public final void setArrowsOutward(boolean z) {
        this.e = z;
    }

    public final void setBoundsColor(int i) {
        this.z.setColor(i);
        invalidate();
    }

    public final void setDarkBackground(boolean z) {
        Integer num = this.s;
        this.y.setColor(num != null ? num.intValue() : z ? -16777216 : -1);
        invalidate();
    }

    public final void setDrawRecommendedTimeBubble(boolean z) {
        this.t = z;
        invalidate();
    }

    public final void setFloatTimeRanges(boolean z) {
        this.r0 = z;
        u();
        invalidate();
    }

    public final void setIsOffsetTimeMarks(boolean z) {
        this.n = !z;
        invalidate();
    }

    public final void setLinesSpace(float f) {
        this.m = f;
        invalidate();
    }

    public final void setLinesWidth(float f) {
        setLineWidth(f);
        invalidate();
    }

    public final void setListener(m9i0 m9i0Var) {
        this.b = m9i0Var;
    }

    public final void setMaxSelectorWidth(Float f) {
        this.h0 = f != null ? f.floatValue() : w0;
    }

    public final void setMinSelectorWidth(Float f) {
        this.i0 = f != null ? f.floatValue() : C0;
    }

    public final void setPerformHapticFeedback(boolean z) {
        this.o = z;
    }

    public final void setRecommendedTime(int i) {
        if (!this.g || i <= 0 || i > this.h * 1000) {
            this.g0 = false;
            return;
        }
        this.g0 = true;
        this.P = k(i);
        float f = this.V;
        float f2 = F0;
        if (f < f2) {
            setTopOffset(f2);
        }
        t();
        invalidate();
    }

    public final void setTopOffset(float f) {
        int length = this.J.length / 4;
        for (int i = 0; i < length; i++) {
            float[] fArr = this.J;
            int i2 = i * 4;
            int i3 = i2 + 1;
            fArr[i3] = fArr[i3] + f;
            int i4 = i2 + 3;
            fArr[i4] = fArr[i4] + f;
        }
        this.V = f;
        measure(getMeasuredWidth(), getMeasuredHeight());
    }

    public final void setWaveForm(byte[] bArr) {
        Byte valueOf;
        byte[] bArr2 = this.p;
        int i = 0;
        if (bArr2.length != 0 && bArr.length == bArr2.length) {
            int length = bArr.length;
            int i2 = 0;
            while (i < length) {
                this.q[i2] = bArr[i];
                i++;
                i2++;
            }
            removeCallbacks(new p31(this, 20));
            j();
        } else {
            int length2 = bArr.length;
            if (length2 == 0) {
                return;
            }
            if (bArr.length == 0) {
                valueOf = null;
            } else {
                byte b = bArr[0];
                int i3 = 1;
                int length3 = bArr.length - 1;
                if (1 <= length3) {
                    while (true) {
                        byte b2 = bArr[i3];
                        if (b < b2) {
                            b = b2;
                        }
                        if (i3 == length3) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
                valueOf = Byte.valueOf(b);
            }
            if (valueOf == null) {
                return;
            }
            byte byteValue = valueOf.byteValue();
            this.p = Arrays.copyOf(bArr, bArr.length);
            this.q = Arrays.copyOf(bArr, bArr.length);
            if (this.f) {
                setCommonOffset(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            this.J = new float[length2 * 4];
            float f = (x0 * 0.5f) + this.V;
            int length4 = bArr.length;
            float f2 = 0.0f;
            while (i < length4) {
                float max = Math.max((bArr[i] / byteValue) * A0, 1.0f);
                float[] fArr = this.J;
                int i4 = i * 4;
                fArr[i4] = f2;
                fArr[i4 + 1] = f - max;
                fArr[i4 + 2] = f2;
                fArr[i4 + 3] = max + f;
                f2 += this.m;
                i++;
            }
            this.N = ((iah0.f().widthPixels - this.i0) - this.k) / 2.0f;
            float f3 = ((iah0.f().widthPixels + this.i0) - this.k) / 2.0f;
            this.O = f3;
            if (this.f) {
                this.Q = this.N;
                this.R = f3;
                setCommonOffset(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            } else {
                setCommonOffset(-this.N);
            }
        }
        invalidate();
    }

    public final void setWithBoundsOffset(boolean z) {
        this.f = z;
        setDarkBackground(z);
        invalidate();
    }

    public final void setWithRecommendedTime(boolean z) {
        this.g = z;
        if (!z) {
            this.g0 = false;
            return;
        }
        float f = this.V;
        float f2 = F0;
        if (f < f2) {
            setTopOffset(f2);
        }
        t();
        invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ba, code lost:
    
        if (r0 != null) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t() {
        float f;
        Float Q;
        float f2;
        float f3;
        float f4 = this.N;
        float f5 = this.O * f4;
        float f6 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (f5 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        int c = bn10.c(a.a(this.J, f4), 0, getXPointsCount() - 1);
        this.b0 = c;
        float f7 = c == 0 ? 0.0f : this.J[(c - 1) * 4];
        float f8 = this.k;
        float f9 = f7 - f8;
        float f10 = f7 + f8;
        float f11 = this.N;
        this.e0 = f9 <= f11 && f11 <= f10;
        float f12 = c == 0 ? this.J[0] : this.J[c * 4];
        float f13 = f12 - f8;
        float f14 = f12 + f8;
        if (f13 <= f11 && f11 <= f14) {
            this.b0 = c + 1;
            this.e0 = true;
        }
        int c2 = bn10.c(a.a(this.J, this.O), 0, this.J.length / 4);
        this.c0 = c2;
        Float Q2 = rl3.Q(c2 * 4, this.J);
        if (Q2 == null) {
            Q2 = rl3.Q(r0.length - 4, this.J);
            if (Q2 == null) {
                f = 0.0f;
                float f15 = this.k;
                float f16 = f - f15;
                float f17 = f + f15;
                float f18 = this.O;
                this.f0 = f16 > f18 && f18 <= f17;
                Q = rl3.Q((this.c0 - 1) * 4, this.J);
                if (Q == null) {
                    Q = rl3.Q(r0.length - 4, this.J);
                }
                f6 = Q.floatValue();
                float f19 = this.k;
                f2 = f6 - f19;
                float f20 = f6 + f19;
                f3 = this.O;
                if (f2 <= f3 && f3 <= f20) {
                    this.c0--;
                    this.f0 = true;
                }
                if (this.g0) {
                    return;
                }
                this.d0 = bn10.c(a.a(this.J, this.P), 0, (this.J.length - 1) / 4);
                return;
            }
        }
        f = Q2.floatValue();
        float f152 = this.k;
        float f162 = f - f152;
        float f172 = f + f152;
        float f182 = this.O;
        this.f0 = f162 > f182 && f182 <= f172;
        Q = rl3.Q((this.c0 - 1) * 4, this.J);
        if (Q == null) {
        }
        f6 = Q.floatValue();
        float f192 = this.k;
        f2 = f6 - f192;
        float f202 = f6 + f192;
        f3 = this.O;
        if (f2 <= f3) {
            this.c0--;
            this.f0 = true;
        }
        if (this.g0) {
        }
    }

    public final void u() {
        int i = this.h;
        if (i == 0 || this.N == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || this.O == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || this.J.length < 4) {
            return;
        }
        float b = bn10.b((float) (i * getLeftPercent()), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.h);
        float b2 = bn10.b((float) (this.h * getRightPercent()), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.min((this.i / 1000.0f) + b, this.h));
        String l = l(b);
        String l2 = l(b2);
        boolean z = (epx.f(this.j0, l) && l2.equals(this.k0)) ? false : true;
        if (this.o && z) {
            performHapticFeedback(4, 1);
        }
        this.j0 = l;
        this.k0 = l2;
        this.l0 = m(b);
        this.m0 = m(b2);
    }

    private static /* synthetic */ void getWindowMoveState$annotations() {
    }
}
