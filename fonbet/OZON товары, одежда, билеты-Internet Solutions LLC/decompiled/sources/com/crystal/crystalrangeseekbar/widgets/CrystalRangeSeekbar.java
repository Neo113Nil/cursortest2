package com.crystal.crystalrangeseekbar.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.m;
import ru.ozon.app.android.R;
import s6.InterfaceC9601a;
import s6.InterfaceC9602b;

/* loaded from: classes8.dex */
public class CrystalRangeSeekbar extends View {

    /* renamed from: A, reason: collision with root package name */
    private int f57652A;

    /* renamed from: B, reason: collision with root package name */
    private int f57653B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f57654C;

    /* renamed from: D, reason: collision with root package name */
    private float f57655D;

    /* renamed from: E, reason: collision with root package name */
    private float f57656E;

    /* renamed from: F, reason: collision with root package name */
    private float f57657F;

    /* renamed from: G, reason: collision with root package name */
    private float f57658G;

    /* renamed from: H, reason: collision with root package name */
    private float f57659H;

    /* renamed from: I, reason: collision with root package name */
    private float f57660I;

    /* renamed from: J, reason: collision with root package name */
    private Bitmap f57661J;

    /* renamed from: K, reason: collision with root package name */
    private Bitmap f57662K;

    /* renamed from: L, reason: collision with root package name */
    private Bitmap f57663L;

    /* renamed from: M, reason: collision with root package name */
    private Bitmap f57664M;

    /* renamed from: N, reason: collision with root package name */
    private a f57665N;

    /* renamed from: O, reason: collision with root package name */
    private double f57666O;

    /* renamed from: P, reason: collision with root package name */
    private double f57667P;

    /* renamed from: Q, reason: collision with root package name */
    private int f57668Q;

    /* renamed from: R, reason: collision with root package name */
    private RectF f57669R;

    /* renamed from: S, reason: collision with root package name */
    private Paint f57670S;

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC9601a f57671a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC9602b f57672b;

    /* renamed from: c, reason: collision with root package name */
    private float f57673c;

    /* renamed from: d, reason: collision with root package name */
    private float f57674d;

    /* renamed from: e, reason: collision with root package name */
    private float f57675e;

    /* renamed from: f, reason: collision with root package name */
    private float f57676f;

    /* renamed from: g, reason: collision with root package name */
    private float f57677g;

    /* renamed from: h, reason: collision with root package name */
    private float f57678h;

    /* renamed from: i, reason: collision with root package name */
    private float f57679i;

    /* renamed from: j, reason: collision with root package name */
    private float f57680j;

    /* renamed from: k, reason: collision with root package name */
    private float f57681k;

    /* renamed from: l, reason: collision with root package name */
    private float f57682l;

    /* renamed from: m, reason: collision with root package name */
    private float f57683m;

    /* renamed from: n, reason: collision with root package name */
    private int f57684n;

    /* renamed from: o, reason: collision with root package name */
    private int f57685o;

    /* renamed from: p, reason: collision with root package name */
    private float f57686p;

    /* renamed from: q, reason: collision with root package name */
    private int f57687q;

    /* renamed from: r, reason: collision with root package name */
    private int f57688r;

    /* renamed from: r0, reason: collision with root package name */
    private RectF f57689r0;

    /* renamed from: s, reason: collision with root package name */
    private int f57690s;

    /* renamed from: s0, reason: collision with root package name */
    private RectF f57691s0;

    /* renamed from: t, reason: collision with root package name */
    private int f57692t;

    /* renamed from: t0, reason: collision with root package name */
    private boolean f57693t0;

    /* renamed from: u, reason: collision with root package name */
    private int f57694u;

    /* renamed from: v, reason: collision with root package name */
    private int f57695v;

    /* renamed from: w, reason: collision with root package name */
    private int f57696w;

    /* renamed from: x, reason: collision with root package name */
    private int f57697x;

    /* renamed from: y, reason: collision with root package name */
    private int f57698y;

    /* renamed from: z, reason: collision with root package name */
    private int f57699z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    protected static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a MAX;
        public static final a MIN;

        static {
            a aVar = new a("MIN", 0);
            MIN = aVar;
            a aVar2 = new a("MAX", 1);
            MAX = aVar2;
            $VALUES = new a[]{aVar, aVar2};
        }

        private a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public CrystalRangeSeekbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        float f7;
        this.f57684n = 255;
        this.f57666O = 0.0d;
        this.f57667P = 100.0d;
        if (isInEditMode()) {
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6.a.f4424a);
        try {
            this.f57686p = obtainStyledAttributes.getFloat(9, 0.0f);
            this.f57677g = obtainStyledAttributes.getFloat(20, 0.0f);
            this.f57678h = obtainStyledAttributes.getFloat(18, 100.0f);
            this.f57679i = obtainStyledAttributes.getFloat(19, this.f57677g);
            this.f57680j = obtainStyledAttributes.getFloat(17, this.f57678h);
            this.f57681k = obtainStyledAttributes.getFloat(27, -1.0f);
            this.f57682l = obtainStyledAttributes.getFloat(12, 0.0f);
            this.f57683m = obtainStyledAttributes.getFloat(11, -1.0f);
            this.f57657F = obtainStyledAttributes.getDimensionPixelSize(4, 0);
            this.f57687q = obtainStyledAttributes.getInt(1, 0);
            this.f57688r = obtainStyledAttributes.getColor(0, -7829368);
            this.f57690s = obtainStyledAttributes.getColor(3, -7829368);
            this.f57692t = obtainStyledAttributes.getColor(2, -12303292);
            this.f57694u = obtainStyledAttributes.getInt(6, 0);
            this.f57695v = obtainStyledAttributes.getColor(5, -16777216);
            this.f57696w = obtainStyledAttributes.getColor(8, -12303292);
            this.f57697x = obtainStyledAttributes.getColor(7, -16777216);
            this.f57698y = obtainStyledAttributes.getColor(13, -16777216);
            this.f57652A = obtainStyledAttributes.getColor(22, -16777216);
            this.f57699z = obtainStyledAttributes.getColor(14, -12303292);
            this.f57653B = obtainStyledAttributes.getColor(23, -12303292);
            Drawable drawable = obtainStyledAttributes.getDrawable(15);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(24);
            Drawable drawable3 = obtainStyledAttributes.getDrawable(16);
            Drawable drawable4 = obtainStyledAttributes.getDrawable(25);
            this.f57659H = obtainStyledAttributes.getDimensionPixelSize(28, getResources().getDimensionPixelSize(R.dimen.thumb_height));
            this.f57685o = obtainStyledAttributes.getInt(10, 2);
            this.f57654C = obtainStyledAttributes.getBoolean(26, false);
            obtainStyledAttributes.recycle();
            this.f57673c = this.f57677g;
            this.f57674d = this.f57678h;
            this.f57661J = drawable != null ? ((BitmapDrawable) drawable).getBitmap() : null;
            this.f57663L = drawable2 != null ? ((BitmapDrawable) drawable2).getBitmap() : null;
            this.f57662K = drawable3 != null ? ((BitmapDrawable) drawable3).getBitmap() : null;
            Bitmap bitmap = drawable4 != null ? ((BitmapDrawable) drawable4).getBitmap() : null;
            this.f57664M = bitmap;
            Bitmap bitmap2 = this.f57662K;
            this.f57662K = bitmap2 == null ? this.f57661J : bitmap2;
            this.f57664M = bitmap == null ? this.f57663L : bitmap;
            float max = Math.max(0.0f, Math.min(this.f57682l, this.f57674d - this.f57673c));
            float f11 = this.f57674d;
            this.f57682l = (max / (f11 - this.f57673c)) * 100.0f;
            float f12 = this.f57683m;
            if (f12 != -1.0f) {
                this.f57683m = (Math.min(f12, f11) / (this.f57674d - this.f57673c)) * 100.0f;
                a(true);
            }
            this.f57658G = g();
            Bitmap bitmap3 = this.f57661J;
            if (bitmap3 != null) {
                f7 = bitmap3.getHeight();
            } else {
                f7 = this.f57659H;
                if (f7 <= 0.0f) {
                    f7 = getResources().getDimension(R.dimen.thumb_width);
                }
            }
            this.f57660I = f7;
            float f13 = this.f57657F;
            this.f57656E = f13 <= 0.0f ? f7 * 0.5f * 0.3f : f13;
            this.f57655D = this.f57658G * 0.5f;
            this.f57670S = new Paint(1);
            this.f57669R = new RectF();
            this.f57689r0 = new RectF();
            this.f57691s0 = new RectF();
            this.f57665N = null;
            q();
            n();
            setWillNotDraw(false);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    private void a(boolean z11) {
        if (z11) {
            double d11 = this.f57666O;
            double d12 = this.f57683m;
            double d13 = d11 + d12;
            this.f57667P = d13;
            if (d13 >= 100.0d) {
                this.f57667P = 100.0d;
                this.f57666O = 100.0d - d12;
                return;
            }
            return;
        }
        double d14 = this.f57667P;
        double d15 = this.f57683m;
        double d16 = d14 - d15;
        this.f57666O = d16;
        if (d16 <= 0.0d) {
            this.f57666O = 0.0d;
            this.f57667P = 0.0d + d15;
        }
    }

    private a c(float f7) {
        boolean h11 = h(f7, this.f57666O);
        boolean h12 = h(f7, this.f57667P);
        a aVar = (h11 && h12) ? f7 / ((float) getWidth()) > 0.5f ? a.MIN : a.MAX : h11 ? a.MIN : h12 ? a.MAX : null;
        if (!this.f57654C || aVar != null) {
            return aVar;
        }
        float i11 = i(this.f57666O);
        if (f7 >= i(this.f57667P)) {
            return a.MAX;
        }
        if (f7 > i11 && Math.abs(i11 - f7) >= Math.abs(r1 - f7)) {
            return a.MAX;
        }
        return a.MIN;
    }

    private Number d(Double d11) throws IllegalArgumentException {
        int i11 = this.f57685o;
        if (i11 == 0) {
            return Long.valueOf(d11.longValue());
        }
        if (i11 == 1) {
            return d11;
        }
        if (i11 == 2) {
            return Long.valueOf(Math.round(d11.doubleValue()));
        }
        if (i11 == 3) {
            return Float.valueOf(d11.floatValue());
        }
        if (i11 == 4) {
            return Short.valueOf(d11.shortValue());
        }
        if (i11 == 5) {
            return Byte.valueOf(d11.byteValue());
        }
        throw new IllegalArgumentException("Number class '" + d11.getClass().getName() + "' is not supported");
    }

    private boolean h(float f7, double d11) {
        float i11 = i(d11);
        float g10 = i11 - (g() / 2.0f);
        float g11 = (g() / 2.0f) + i11;
        float g12 = f7 - (g() / 2.0f);
        if (i11 <= getWidth() - this.f57658G) {
            f7 = g12;
        }
        return f7 >= g10 && f7 <= g11;
    }

    private float i(double d11) {
        return (((float) d11) / 100.0f) * (getWidth() - (this.f57655D * 2.0f));
    }

    private double j(float f7) {
        double width = getWidth();
        float f11 = this.f57655D;
        if (width <= f11 * 2.0f) {
            return 0.0d;
        }
        double d11 = width - (2.0f * f11);
        return Math.min(100.0d, Math.max(0.0d, ((f7 / d11) * 100.0d) - ((f11 / d11) * 100.0d)));
    }

    private void n() {
        float f7 = this.f57680j;
        if (f7 <= this.f57674d) {
            float f11 = this.f57673c;
            if (f7 <= f11 || f7 < this.f57675e) {
                return;
            }
            float max = Math.max(this.f57676f, f11);
            float f12 = this.f57673c;
            float f13 = ((max - f12) / (this.f57674d - f12)) * 100.0f;
            this.f57680j = f13;
            t(f13);
        }
    }

    private void q() {
        float f7 = this.f57679i;
        if (f7 <= this.f57677g || f7 > this.f57678h) {
            return;
        }
        float min = Math.min(f7, this.f57674d);
        float f11 = this.f57673c;
        float f12 = ((min - f11) / (this.f57674d - f11)) * 100.0f;
        this.f57679i = f12;
        u(f12);
    }

    private void t(double d11) {
        double max = Math.max(0.0d, Math.min(100.0d, Math.max(d11, this.f57666O)));
        this.f57667P = max;
        float f7 = this.f57683m;
        if (f7 == -1.0f || f7 <= 0.0f) {
            double d12 = max - this.f57682l;
            if (d12 < this.f57666O) {
                this.f57666O = d12;
                double max2 = Math.max(0.0d, Math.min(100.0d, Math.min(d12, max)));
                this.f57666O = max2;
                double d13 = max2 + this.f57682l;
                if (this.f57667P <= d13) {
                    this.f57667P = d13;
                }
            }
        } else {
            a(false);
        }
        invalidate();
    }

    private void u(double d11) {
        double max = Math.max(0.0d, Math.min(100.0d, Math.min(d11, this.f57667P)));
        this.f57666O = max;
        float f7 = this.f57683m;
        if (f7 == -1.0f || f7 <= 0.0f) {
            double d12 = this.f57682l + max;
            if (d12 > this.f57667P) {
                this.f57667P = d12;
                double max2 = Math.max(0.0d, Math.min(100.0d, Math.max(d12, max)));
                this.f57667P = max2;
                double d13 = max2 - this.f57682l;
                if (this.f57666O >= d13) {
                    this.f57666O = d13;
                }
            }
        } else {
            a(true);
        }
        invalidate();
    }

    protected final void A(Canvas canvas, Paint paint, RectF rectF) {
        rectF.left = this.f57655D;
        rectF.top = (getHeight() - this.f57656E) * 0.5f;
        rectF.right = getWidth() - this.f57655D;
        rectF.bottom = (getHeight() + this.f57656E) * 0.5f;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        if (this.f57687q == 0) {
            paint.setColor(this.f57688r);
            float f7 = this.f57686p;
            canvas.drawRoundRect(rectF, f7, f7, paint);
            return;
        }
        paint.setShader(new LinearGradient(rectF.left, rectF.bottom, rectF.right, rectF.top, this.f57690s, this.f57692t, Shader.TileMode.MIRROR));
        float f11 = this.f57686p;
        canvas.drawRoundRect(rectF, f11, f11, paint);
        paint.setShader(null);
    }

    protected final void B(Canvas canvas, Paint paint, RectF rectF) {
        rectF.left = (g() / 2.0f) + i(this.f57666O);
        rectF.right = (g() / 2.0f) + i(this.f57667P);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        if (this.f57694u == 0) {
            paint.setColor(this.f57695v);
            float f7 = this.f57686p;
            canvas.drawRoundRect(rectF, f7, f7, paint);
            return;
        }
        paint.setShader(new LinearGradient(rectF.left, rectF.bottom, rectF.right, rectF.top, this.f57696w, this.f57697x, Shader.TileMode.MIRROR));
        float f11 = this.f57686p;
        canvas.drawRoundRect(rectF, f11, f11, paint);
        paint.setShader(null);
    }

    protected final void C(Canvas canvas, Paint paint) {
        a aVar = a.MIN;
        paint.setColor(aVar.equals(this.f57665N) ? this.f57699z : this.f57698y);
        this.f57689r0.left = i(this.f57666O);
        RectF rectF = this.f57689r0;
        rectF.right = Math.min((g() / 2.0f) + rectF.left + this.f57655D, getWidth());
        RectF rectF2 = this.f57689r0;
        rectF2.top = 0.0f;
        rectF2.bottom = this.f57660I;
        if (this.f57661J == null) {
            canvas.drawOval(rectF2, paint);
            return;
        }
        Bitmap bitmap = aVar.equals(this.f57665N) ? this.f57662K : this.f57661J;
        RectF rectF3 = this.f57689r0;
        canvas.drawBitmap(bitmap, rectF3.left, rectF3.top, paint);
    }

    protected final void D(Canvas canvas, Paint paint) {
        a aVar = a.MAX;
        paint.setColor(aVar.equals(this.f57665N) ? this.f57653B : this.f57652A);
        this.f57691s0.left = i(this.f57667P);
        RectF rectF = this.f57691s0;
        rectF.right = Math.min((g() / 2.0f) + rectF.left + this.f57655D, getWidth());
        RectF rectF2 = this.f57691s0;
        rectF2.top = 0.0f;
        rectF2.bottom = this.f57660I;
        if (this.f57663L == null) {
            canvas.drawOval(rectF2, paint);
            return;
        }
        Bitmap bitmap = aVar.equals(this.f57665N) ? this.f57664M : this.f57663L;
        RectF rectF3 = this.f57691s0;
        canvas.drawBitmap(bitmap, rectF3.left, rectF3.top, paint);
    }

    protected final void E(MotionEvent motionEvent) {
        try {
            float x11 = motionEvent.getX(motionEvent.findPointerIndex(this.f57684n));
            if (a.MIN.equals(this.f57665N)) {
                u(j(x11));
            } else if (a.MAX.equals(this.f57665N)) {
                t(j(x11));
            }
        } catch (Exception unused) {
        }
    }

    public final void b() {
        float f7;
        this.f57666O = 0.0d;
        this.f57667P = 100.0d;
        float max = Math.max(0.0f, Math.min(this.f57682l, this.f57674d - this.f57673c));
        float f11 = this.f57674d;
        this.f57682l = (max / (f11 - this.f57673c)) * 100.0f;
        float f12 = this.f57683m;
        if (f12 != -1.0f) {
            this.f57683m = (Math.min(f12, f11) / (this.f57674d - this.f57673c)) * 100.0f;
            a(true);
        }
        this.f57658G = g();
        Bitmap bitmap = this.f57661J;
        if (bitmap != null) {
            f7 = bitmap.getHeight();
        } else {
            f7 = this.f57659H;
            if (f7 <= 0.0f) {
                f7 = getResources().getDimension(R.dimen.thumb_width);
            }
        }
        this.f57660I = f7;
        float f13 = this.f57657F;
        if (f13 <= 0.0f) {
            f13 = 0.3f * f7 * 0.5f;
        }
        this.f57656E = f13;
        this.f57655D = this.f57658G * 0.5f;
        float f14 = this.f57679i;
        if (f14 <= this.f57673c) {
            this.f57679i = 0.0f;
            u(0.0f);
        } else {
            float f15 = this.f57674d;
            if (f14 >= f15) {
                this.f57679i = f15;
                q();
            } else {
                q();
            }
        }
        float f16 = this.f57680j;
        if (f16 < this.f57675e || f16 <= this.f57673c) {
            this.f57680j = 0.0f;
            t(0.0f);
        } else {
            float f17 = this.f57674d;
            if (f16 >= f17) {
                this.f57680j = f17;
                n();
            } else {
                n();
            }
        }
        invalidate();
        InterfaceC9601a interfaceC9601a = this.f57671a;
        if (interfaceC9601a != null) {
            interfaceC9601a.a(f(), e());
        }
    }

    public final Number e() {
        double d11 = this.f57667P;
        float f7 = this.f57681k;
        if (f7 > 0.0f && f7 <= Math.abs(this.f57674d) / 2.0f) {
            float f11 = (this.f57681k / (this.f57674d - this.f57673c)) * 100.0f;
            double d12 = f11;
            double d13 = d11 % d12;
            d11 = d13 > ((double) (f11 / 2.0f)) ? (d11 - d13) + d12 : d11 - d13;
        } else if (this.f57681k != -1.0f) {
            throw new IllegalStateException("steps out of range " + this.f57681k);
        }
        float f12 = this.f57678h;
        return d(Double.valueOf(((d11 / 100.0d) * (f12 - r3)) + this.f57677g));
    }

    public final Number f() {
        double d11 = this.f57666O;
        float f7 = this.f57681k;
        if (f7 > 0.0f && f7 <= Math.abs(this.f57674d) / 2.0f) {
            float f11 = (this.f57681k / (this.f57674d - this.f57673c)) * 100.0f;
            double d12 = f11;
            double d13 = d11 % d12;
            d11 = d13 > ((double) (f11 / 2.0f)) ? (d11 - d13) + d12 : d11 - d13;
        } else if (this.f57681k != -1.0f) {
            throw new IllegalStateException("steps out of range " + this.f57681k);
        }
        float f12 = this.f57678h;
        return d(Double.valueOf(((d11 / 100.0d) * (f12 - r3)) + this.f57677g));
    }

    protected final float g() {
        if (this.f57661J != null) {
            return r0.getWidth();
        }
        float f7 = this.f57659H;
        return f7 > 0.0f ? f7 : getResources().getDimension(R.dimen.thumb_width);
    }

    public final void k(int i11) {
        this.f57685o = i11;
    }

    public final void l(Bitmap bitmap) {
        this.f57661J = bitmap;
    }

    public final void m(Bitmap bitmap) {
        this.f57662K = bitmap;
    }

    public final void o(float f7) {
        this.f57680j = f7;
        this.f57676f = f7;
    }

    @Override // android.view.View
    protected final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isInEditMode()) {
            return;
        }
        A(canvas, this.f57670S, this.f57669R);
        B(canvas, this.f57670S, this.f57669R);
        C(canvas, this.f57670S);
        D(canvas, this.f57670S);
    }

    @Override // android.view.View
    protected final synchronized void onMeasure(int i11, int i12) {
        int size = View.MeasureSpec.getMode(i11) != 0 ? View.MeasureSpec.getSize(i11) : m.e.DEFAULT_DRAG_ANIMATION_DURATION;
        int round = Math.round(this.f57660I);
        if (View.MeasureSpec.getMode(i12) != 0) {
            round = Math.min(round, View.MeasureSpec.getSize(i12));
        }
        setMeasuredDimension(size, round);
    }

    @Override // android.view.View
    public final synchronized boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            if (!isEnabled()) {
                return false;
            }
            int action = motionEvent.getAction() & 255;
            if (action == 0) {
                int pointerId = motionEvent.getPointerId(motionEvent.getPointerCount() - 1);
                this.f57684n = pointerId;
                int findPointerIndex = motionEvent.findPointerIndex(pointerId);
                this.f57668Q = findPointerIndex;
                a c11 = c(motionEvent.getX(findPointerIndex));
                this.f57665N = c11;
                if (c11 == null) {
                    return super.onTouchEvent(motionEvent);
                }
                motionEvent.getX(this.f57668Q);
                motionEvent.getY(this.f57668Q);
                setPressed(true);
                invalidate();
                this.f57693t0 = true;
                E(motionEvent);
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
            } else if (action == 1) {
                if (this.f57693t0) {
                    E(motionEvent);
                    this.f57693t0 = false;
                    setPressed(false);
                    motionEvent.getX(this.f57668Q);
                    motionEvent.getY(this.f57668Q);
                    InterfaceC9602b interfaceC9602b = this.f57672b;
                    if (interfaceC9602b != null) {
                        interfaceC9602b.a(f(), e());
                    }
                } else {
                    this.f57693t0 = true;
                    E(motionEvent);
                    this.f57693t0 = false;
                }
                this.f57665N = null;
                invalidate();
                InterfaceC9601a interfaceC9601a = this.f57671a;
                if (interfaceC9601a != null) {
                    interfaceC9601a.a(f(), e());
                }
            } else if (action != 2) {
                if (action == 3) {
                    if (this.f57693t0) {
                        this.f57693t0 = false;
                        setPressed(false);
                        motionEvent.getX(this.f57668Q);
                        motionEvent.getY(this.f57668Q);
                    }
                    invalidate();
                } else if (action == 6) {
                    invalidate();
                }
            } else if (this.f57665N != null) {
                if (this.f57693t0) {
                    motionEvent.getX(this.f57668Q);
                    motionEvent.getY(this.f57668Q);
                    E(motionEvent);
                }
                InterfaceC9601a interfaceC9601a2 = this.f57671a;
                if (interfaceC9601a2 != null) {
                    interfaceC9601a2.a(f(), e());
                }
            }
            return true;
        } finally {
        }
    }

    public final void p(float f7) {
        this.f57678h = f7;
        this.f57674d = f7;
    }

    public final void r(float f7) {
        this.f57679i = f7;
        this.f57675e = f7;
    }

    public final void s(float f7) {
        this.f57677g = f7;
        this.f57673c = f7;
    }

    public final void v(InterfaceC9601a interfaceC9601a) {
        this.f57671a = interfaceC9601a;
        interfaceC9601a.a(f(), e());
    }

    public final void w(InterfaceC9602b interfaceC9602b) {
        this.f57672b = interfaceC9602b;
    }

    public final void x(Bitmap bitmap) {
        this.f57663L = bitmap;
    }

    public final void y(Bitmap bitmap) {
        this.f57664M = bitmap;
    }

    public final void z(float f7) {
        this.f57681k = f7;
    }
}
