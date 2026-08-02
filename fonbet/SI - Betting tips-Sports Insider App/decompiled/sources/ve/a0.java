package ve;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a0 extends View {
    public LinearGradient A;
    public final jg.d B;

    /* renamed from: a, reason: collision with root package name */
    public final float f24558a;

    /* renamed from: b, reason: collision with root package name */
    public final float f24559b;

    /* renamed from: c, reason: collision with root package name */
    public final float f24560c;

    /* renamed from: d, reason: collision with root package name */
    public final float f24561d;

    /* renamed from: e, reason: collision with root package name */
    public final float f24562e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f24563f;

    /* renamed from: g, reason: collision with root package name */
    public final TextPaint f24564g;

    /* renamed from: h, reason: collision with root package name */
    public String f24565h;

    /* renamed from: i, reason: collision with root package name */
    public final float f24566i;
    public final float j;

    /* renamed from: k, reason: collision with root package name */
    public Typeface f24567k;

    /* renamed from: l, reason: collision with root package name */
    public final float f24568l;

    /* renamed from: m, reason: collision with root package name */
    public RippleDrawable f24569m;

    /* renamed from: n, reason: collision with root package name */
    public final int f24570n;

    /* renamed from: o, reason: collision with root package name */
    public final RectF f24571o;

    /* renamed from: p, reason: collision with root package name */
    public final RectF f24572p;
    public final RectF q;

    /* renamed from: r, reason: collision with root package name */
    public final RectF f24573r;

    /* renamed from: s, reason: collision with root package name */
    public StaticLayout f24574s;

    /* renamed from: t, reason: collision with root package name */
    public float f24575t;

    /* renamed from: u, reason: collision with root package name */
    public float f24576u;

    /* renamed from: v, reason: collision with root package name */
    public final DisplayMetrics f24577v;

    /* renamed from: w, reason: collision with root package name */
    public final int[] f24578w;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f24579x;

    /* renamed from: y, reason: collision with root package name */
    public final int[] f24580y;

    /* renamed from: z, reason: collision with root package name */
    public final int[] f24581z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f24558a = 20.0f;
        this.f24559b = 25.0f;
        this.f24560c = 1.0f;
        this.f24561d = 20.0f;
        this.f24562e = 20.0f;
        this.f24563f = new Paint(1);
        this.f24564g = new TextPaint(1);
        this.f24565h = "Live - predictions";
        this.f24566i = 20.0f;
        this.j = 25.0f;
        this.f24568l = 1.0f;
        this.f24571o = new RectF();
        this.f24572p = new RectF();
        this.q = new RectF();
        this.f24573r = new RectF();
        int[] iArr = new int[2];
        for (int i5 = 0; i5 < 2; i5++) {
            iArr[i5] = -1;
        }
        this.f24578w = iArr;
        this.f24579x = new int[0];
        this.f24580y = new int[]{R.attr.state_enabled};
        int[] iArr2 = new int[2];
        int i10 = 0;
        while (i10 < 2) {
            iArr2[i10] = i10 == 0 ? R.attr.state_pressed : 16842910;
            i10++;
        }
        this.f24581z = iArr2;
        lg.e eVar = eg.m0.f9201a;
        this.B = eg.c0.b(jg.q.f18523a);
        setClickable(true);
        setFocusable(true);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "getDisplayMetrics(...)");
        this.f24577v = displayMetrics;
        DisplayMetrics displayMetrics2 = null;
        if (displayMetrics == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics = null;
        }
        float f6 = displayMetrics.density;
        f6 = f6 <= 0.0f ? this.f24560c : f6;
        this.f24568l = f6;
        this.f24566i = this.f24558a * f6;
        DisplayMetrics displayMetrics3 = this.f24577v;
        if (displayMetrics3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
        } else {
            displayMetrics2 = displayMetrics3;
        }
        float f10 = this.f24559b;
        Intrinsics.checkNotNullParameter(displayMetrics2, "<this>");
        this.j = Build.VERSION.SDK_INT >= 34 ? TypedValue.applyDimension(2, f10, displayMetrics2) : f10 * displayMetrics2.scaledDensity;
        this.f24562e = this.f24561d * this.f24568l;
        this.f24570n = Color.parseColor("#E50957EE");
        int parseColor = Color.parseColor("#E57B14CC");
        int[] iArr3 = this.f24578w;
        iArr3[0] = this.f24570n;
        iArr3[1] = parseColor;
        TextPaint textPaint = this.f24564g;
        textPaint.setTypeface(Typeface.DEFAULT_BOLD);
        textPaint.setColor(-1);
        textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        textPaint.setTextSize(this.j);
        Paint paint = this.f24563f;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(this.f24570n);
        d();
    }

    public static StaticLayout e(CharSequence charSequence, TextPaint textPaint, int i5) {
        if (charSequence == null || charSequence.length() == 0 || StringsKt.H(charSequence) || i5 <= 5) {
            return null;
        }
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, Math.min(i5, (int) textPaint.measureText(charSequence.toString()))).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(i5).setAlignment(Layout.Alignment.ALIGN_CENTER).setIncludePad(true).setLineSpacing(0.0f, 1.0f).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setButtonTypeface(Typeface typeface) {
        if (typeface == null || !Intrinsics.areEqual(this.f24567k, typeface)) {
            if (typeface == null) {
                typeface = Typeface.DEFAULT_BOLD;
            }
            this.f24567k = typeface;
            this.f24564g.setTypeface(typeface);
        }
    }

    public final void b() {
        this.f24572p.setEmpty();
        setPressed(false);
        RippleDrawable rippleDrawable = this.f24569m;
        if (rippleDrawable != null) {
            rippleDrawable.setState(this.f24579x);
        }
        this.f24573r.setEmpty();
        this.f24574s = null;
    }

    public final void c(int i5, int i10) {
        if (i5 <= 0 || i10 <= 0) {
            b();
            return;
        }
        RectF rectF = this.f24571o;
        rectF.left = getPaddingStart() + 0.0f;
        rectF.top = getPaddingTop() + 0.0f;
        rectF.right = (i5 - getPaddingEnd()) + 0.0f;
        rectF.bottom = (i10 - getPaddingBottom()) + 0.0f;
        if (rectF.height() <= 0.0f || rectF.width() <= 0.0f || rectF.isEmpty()) {
            b();
            return;
        }
        this.f24575t = rectF.centerX();
        this.f24576u = rectF.centerY();
        float f6 = rectF.left;
        float f10 = this.f24562e;
        RectF rectF2 = this.q;
        rectF2.left = f6 + f10;
        rectF2.top = rectF.top + f10;
        rectF2.right = rectF.right - f10;
        rectF2.bottom = rectF.bottom + f10;
        StaticLayout e7 = e(this.f24565h, this.f24564g, (int) rectF2.width());
        int width = e7 != null ? e7.getWidth() : 0;
        int height = e7 != null ? e7.getHeight() : 0;
        if (e7 != null) {
            e7.getHeight();
        }
        float f11 = width;
        float f12 = this.f24575t - (f11 / 2.0f);
        rectF2.left = f12;
        float f13 = height;
        float f14 = this.f24576u - (f13 / 2.0f);
        rectF2.top = f14;
        float f15 = f11 + f12;
        rectF2.right = f15;
        float f16 = f13 + f14;
        rectF2.bottom = f16;
        this.f24574s = e7;
        RectF rectF3 = this.f24573r;
        rectF3.left = f12;
        rectF3.top = f14;
        rectF3.right = f15;
        rectF3.bottom = f16;
        float f17 = rectF.left;
        RectF rectF4 = this.f24572p;
        rectF4.left = f17;
        rectF4.top = rectF.top;
        rectF4.right = rectF.right;
        rectF4.bottom = rectF.bottom;
        if (!rectF4.isEmpty()) {
            int i11 = (int) rectF4.left;
            int i12 = (int) rectF4.top;
            int i13 = (int) rectF4.right;
            int i14 = (int) rectF4.bottom;
            RippleDrawable rippleDrawable = this.f24569m;
            if (rippleDrawable != null) {
                rippleDrawable.setBounds(i11, i12, i13, i14);
                rippleDrawable.setHotspotBounds(i11, i12, i13, i14);
            }
        }
        this.A = new LinearGradient(rectF.left, rectF.centerY(), rectF.right, rectF.centerY(), this.f24578w, (float[]) null, Shader.TileMode.CLAMP);
        invalidate();
    }

    public final void d() {
        int[] iArr = this.f24578w;
        ColorStateList valueOf = ColorStateList.valueOf(iArr[0]);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.getPaint().setColor(iArr[0]);
        shapeDrawable.getPaint().setStyle(Paint.Style.FILL);
        float[] fArr = new float[8];
        for (int i5 = 0; i5 < 8; i5++) {
            fArr[i5] = this.f24566i;
        }
        shapeDrawable.setShape(new RoundRectShape(fArr, null, null));
        this.f24569m = new RippleDrawable(valueOf, null, shapeDrawable);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getWidth() > 0 && getHeight() > 0) {
            c(getWidth(), getHeight());
        }
        if (this.f24569m == null) {
            d();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
        eg.c0.g(this.B, null);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        RectF rectF = this.f24572p;
        if (rectF.isEmpty()) {
            return;
        }
        int save = canvas.save();
        try {
            float f6 = this.f24566i;
            canvas.drawRoundRect(rectF, f6, f6, this.f24563f);
            canvas.restoreToCount(save);
            RippleDrawable rippleDrawable = this.f24569m;
            if (rippleDrawable != null) {
                rippleDrawable.draw(canvas);
            }
            StaticLayout staticLayout = this.f24574s;
            if (staticLayout != null) {
                RectF rectF2 = this.f24573r;
                if (rectF2.isEmpty()) {
                    return;
                }
                save = canvas.save();
                try {
                    canvas.translate(rectF2.left, rectF2.top);
                    staticLayout.draw(canvas);
                } finally {
                }
            }
        } finally {
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i5, int i10) {
        super.onMeasure(i5, i10);
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        float paddingEnd = (this.f24562e * 2.0f) + getPaddingEnd() + getPaddingStart();
        float paddingBottom = (this.f24562e * 2.0f) + getPaddingBottom() + getPaddingTop();
        float f6 = size - paddingEnd;
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        StaticLayout e7 = e(this.f24565h, this.f24564g, (int) f6);
        int width = (int) ((e7 != null ? e7.getWidth() : 0) + paddingEnd);
        int height = (int) (paddingBottom + (e7 != null ? e7.getHeight() : 0));
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(width, size);
        } else if (mode != 1073741824) {
            size = width;
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(height, size2);
        } else if (mode2 != 1073741824) {
            size2 = height;
        }
        Integer valueOf = Integer.valueOf(size);
        Integer valueOf2 = Integer.valueOf(size2);
        int resolveSize = View.resolveSize(valueOf.intValue(), i5);
        int resolveSize2 = View.resolveSize(valueOf2.intValue(), i10);
        setMeasuredDimension(resolveSize, resolveSize2);
        c(resolveSize, resolveSize2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i5, int i10, int i11, int i12) {
        super.onSizeChanged(i5, i10, i11, i12);
        if (i5 <= 0 || i10 <= 0) {
            return;
        }
        Paint paint = this.f24563f;
        if (i11 == i5 && i12 == i10) {
            LinearGradient linearGradient = this.A;
            if (linearGradient != null) {
                paint.setShader(linearGradient);
            }
            invalidate();
            return;
        }
        c(i5, i10);
        LinearGradient linearGradient2 = this.A;
        if (linearGradient2 != null) {
            paint.setShader(linearGradient2);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int action = event.getAction();
        RectF rectF = this.f24572p;
        if (action == 0) {
            if (!rectF.isEmpty()) {
                float f6 = rectF.left;
                float f10 = rectF.right;
                float x10 = event.getX();
                if (f6 <= x10 && x10 <= f10) {
                    float f11 = rectF.top;
                    float f12 = rectF.bottom;
                    float y5 = event.getY();
                    if (f11 <= y5 && y5 <= f12) {
                        setPressed(true);
                        RippleDrawable rippleDrawable = this.f24569m;
                        if (rippleDrawable != null) {
                            rippleDrawable.setHotspot(event.getX(), event.getY());
                        }
                        RippleDrawable rippleDrawable2 = this.f24569m;
                        if (rippleDrawable2 != null) {
                            rippleDrawable2.setState(this.f24581z);
                        }
                        invalidate();
                        return true;
                    }
                }
            }
            return false;
        }
        if (action != 1 && action != 3) {
            return super.onTouchEvent(event);
        }
        setPressed(false);
        RippleDrawable rippleDrawable3 = this.f24569m;
        if (rippleDrawable3 != null) {
            rippleDrawable3.setState(this.f24580y);
        }
        invalidate();
        if (event.getAction() == 1 && !rectF.isEmpty()) {
            float f13 = rectF.left;
            float f14 = rectF.right;
            float x11 = event.getX();
            if (f13 <= x11 && x11 <= f14) {
                float f15 = rectF.top;
                float f16 = rectF.bottom;
                float y10 = event.getY();
                if (f15 <= y10 && y10 <= f16) {
                    super.performClick();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        super.performClick();
        return true;
    }
}
