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
public final class x0 extends View {
    public LinearGradient A;
    public final jg.d B;

    /* renamed from: a, reason: collision with root package name */
    public final float f24917a;

    /* renamed from: b, reason: collision with root package name */
    public final float f24918b;

    /* renamed from: c, reason: collision with root package name */
    public final float f24919c;

    /* renamed from: d, reason: collision with root package name */
    public final float f24920d;

    /* renamed from: e, reason: collision with root package name */
    public final float f24921e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f24922f;

    /* renamed from: g, reason: collision with root package name */
    public final TextPaint f24923g;

    /* renamed from: h, reason: collision with root package name */
    public String f24924h;

    /* renamed from: i, reason: collision with root package name */
    public final float f24925i;
    public final float j;

    /* renamed from: k, reason: collision with root package name */
    public Typeface f24926k;

    /* renamed from: l, reason: collision with root package name */
    public final float f24927l;

    /* renamed from: m, reason: collision with root package name */
    public RippleDrawable f24928m;

    /* renamed from: n, reason: collision with root package name */
    public final int f24929n;

    /* renamed from: o, reason: collision with root package name */
    public final RectF f24930o;

    /* renamed from: p, reason: collision with root package name */
    public final RectF f24931p;
    public final RectF q;

    /* renamed from: r, reason: collision with root package name */
    public final RectF f24932r;

    /* renamed from: s, reason: collision with root package name */
    public StaticLayout f24933s;

    /* renamed from: t, reason: collision with root package name */
    public float f24934t;

    /* renamed from: u, reason: collision with root package name */
    public float f24935u;

    /* renamed from: v, reason: collision with root package name */
    public final DisplayMetrics f24936v;

    /* renamed from: w, reason: collision with root package name */
    public final int[] f24937w;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f24938x;

    /* renamed from: y, reason: collision with root package name */
    public final int[] f24939y;

    /* renamed from: z, reason: collision with root package name */
    public final int[] f24940z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f24917a = 20.0f;
        this.f24918b = 25.0f;
        this.f24919c = 1.0f;
        this.f24920d = 20.0f;
        this.f24921e = 20.0f;
        this.f24922f = new Paint(1);
        this.f24923g = new TextPaint(1);
        this.f24924h = "Diamond access";
        this.f24925i = 20.0f;
        this.j = 25.0f;
        this.f24927l = 1.0f;
        this.f24930o = new RectF();
        this.f24931p = new RectF();
        this.q = new RectF();
        this.f24932r = new RectF();
        int[] iArr = new int[2];
        for (int i5 = 0; i5 < 2; i5++) {
            iArr[i5] = -1;
        }
        this.f24937w = iArr;
        this.f24938x = new int[0];
        this.f24939y = new int[]{R.attr.state_enabled};
        int[] iArr2 = new int[2];
        int i10 = 0;
        while (i10 < 2) {
            iArr2[i10] = i10 == 0 ? R.attr.state_pressed : 16842910;
            i10++;
        }
        this.f24940z = iArr2;
        lg.e eVar = eg.m0.f9201a;
        this.B = eg.c0.b(jg.q.f18523a);
        setClickable(true);
        setFocusable(true);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "getDisplayMetrics(...)");
        this.f24936v = displayMetrics;
        DisplayMetrics displayMetrics2 = null;
        if (displayMetrics == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics = null;
        }
        float f6 = displayMetrics.density;
        f6 = f6 <= 0.0f ? this.f24919c : f6;
        this.f24927l = f6;
        this.f24925i = this.f24917a * f6;
        DisplayMetrics displayMetrics3 = this.f24936v;
        if (displayMetrics3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
        } else {
            displayMetrics2 = displayMetrics3;
        }
        float f10 = this.f24918b;
        Intrinsics.checkNotNullParameter(displayMetrics2, "<this>");
        this.j = Build.VERSION.SDK_INT >= 34 ? TypedValue.applyDimension(2, f10, displayMetrics2) : f10 * displayMetrics2.scaledDensity;
        this.f24921e = this.f24920d * this.f24927l;
        this.f24929n = Color.parseColor("#E5F9E324");
        int parseColor = Color.parseColor("#E5FA3636");
        int[] iArr3 = this.f24937w;
        iArr3[0] = this.f24929n;
        iArr3[1] = parseColor;
        TextPaint textPaint = this.f24923g;
        textPaint.setTypeface(Typeface.DEFAULT_BOLD);
        textPaint.setColor(-1);
        textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        textPaint.setTextSize(this.j);
        Paint paint = this.f24922f;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(this.f24929n);
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
        if (typeface == null || !Intrinsics.areEqual(this.f24926k, typeface)) {
            if (typeface == null) {
                typeface = Typeface.DEFAULT_BOLD;
            }
            this.f24926k = typeface;
            this.f24923g.setTypeface(typeface);
        }
    }

    public final void b() {
        this.f24931p.setEmpty();
        setPressed(false);
        RippleDrawable rippleDrawable = this.f24928m;
        if (rippleDrawable != null) {
            rippleDrawable.setState(this.f24938x);
        }
        this.f24932r.setEmpty();
        this.f24933s = null;
    }

    public final void c(int i5, int i10) {
        if (i5 <= 0 || i10 <= 0) {
            b();
            return;
        }
        RectF rectF = this.f24930o;
        rectF.left = getPaddingStart() + 0.0f;
        rectF.top = getPaddingTop() + 0.0f;
        rectF.right = (i5 - getPaddingEnd()) + 0.0f;
        rectF.bottom = (i10 - getPaddingBottom()) + 0.0f;
        if (rectF.height() <= 0.0f || rectF.width() <= 0.0f || rectF.isEmpty()) {
            b();
            return;
        }
        this.f24934t = rectF.centerX();
        this.f24935u = rectF.centerY();
        float f6 = rectF.left;
        float f10 = this.f24921e;
        RectF rectF2 = this.q;
        rectF2.left = f6 + f10;
        rectF2.top = rectF.top + f10;
        rectF2.right = rectF.right - f10;
        rectF2.bottom = rectF.bottom + f10;
        StaticLayout e7 = e(this.f24924h, this.f24923g, (int) rectF2.width());
        int width = e7 != null ? e7.getWidth() : 0;
        int height = e7 != null ? e7.getHeight() : 0;
        if (e7 != null) {
            e7.getHeight();
        }
        float f11 = width;
        float f12 = this.f24934t - (f11 / 2.0f);
        rectF2.left = f12;
        float f13 = height;
        float f14 = this.f24935u - (f13 / 2.0f);
        rectF2.top = f14;
        float f15 = f11 + f12;
        rectF2.right = f15;
        float f16 = f13 + f14;
        rectF2.bottom = f16;
        this.f24933s = e7;
        RectF rectF3 = this.f24932r;
        rectF3.left = f12;
        rectF3.top = f14;
        rectF3.right = f15;
        rectF3.bottom = f16;
        float f17 = rectF.left;
        RectF rectF4 = this.f24931p;
        rectF4.left = f17;
        rectF4.top = rectF.top;
        rectF4.right = rectF.right;
        rectF4.bottom = rectF.bottom;
        if (!rectF4.isEmpty()) {
            int i11 = (int) rectF4.left;
            int i12 = (int) rectF4.top;
            int i13 = (int) rectF4.right;
            int i14 = (int) rectF4.bottom;
            RippleDrawable rippleDrawable = this.f24928m;
            if (rippleDrawable != null) {
                rippleDrawable.setBounds(i11, i12, i13, i14);
                rippleDrawable.setHotspotBounds(i11, i12, i13, i14);
            }
        }
        this.A = new LinearGradient(rectF.left, rectF.centerY(), rectF.right, rectF.centerY(), this.f24937w, (float[]) null, Shader.TileMode.CLAMP);
        invalidate();
    }

    public final void d() {
        int[] iArr = this.f24937w;
        ColorStateList valueOf = ColorStateList.valueOf(iArr[0]);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.getPaint().setColor(iArr[0]);
        shapeDrawable.getPaint().setStyle(Paint.Style.FILL);
        float[] fArr = new float[8];
        for (int i5 = 0; i5 < 8; i5++) {
            fArr[i5] = this.f24925i;
        }
        shapeDrawable.setShape(new RoundRectShape(fArr, null, null));
        this.f24928m = new RippleDrawable(valueOf, null, shapeDrawable);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getWidth() > 0 && getHeight() > 0) {
            c(getWidth(), getHeight());
        }
        if (this.f24928m == null) {
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
        RectF rectF = this.f24931p;
        if (rectF.isEmpty()) {
            return;
        }
        int save = canvas.save();
        try {
            float f6 = this.f24925i;
            canvas.drawRoundRect(rectF, f6, f6, this.f24922f);
            canvas.restoreToCount(save);
            RippleDrawable rippleDrawable = this.f24928m;
            if (rippleDrawable != null) {
                rippleDrawable.draw(canvas);
            }
            StaticLayout staticLayout = this.f24933s;
            if (staticLayout != null) {
                RectF rectF2 = this.f24932r;
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
        float paddingEnd = (this.f24921e * 2.0f) + getPaddingEnd() + getPaddingStart();
        float paddingBottom = (this.f24921e * 2.0f) + getPaddingBottom() + getPaddingTop();
        float f6 = size - paddingEnd;
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        StaticLayout e7 = e(this.f24924h, this.f24923g, (int) f6);
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
        Paint paint = this.f24922f;
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
        RectF rectF = this.f24931p;
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
                        RippleDrawable rippleDrawable = this.f24928m;
                        if (rippleDrawable != null) {
                            rippleDrawable.setHotspot(event.getX(), event.getY());
                        }
                        RippleDrawable rippleDrawable2 = this.f24928m;
                        if (rippleDrawable2 != null) {
                            rippleDrawable2.setState(this.f24940z);
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
        RippleDrawable rippleDrawable3 = this.f24928m;
        if (rippleDrawable3 != null) {
            rippleDrawable3.setState(this.f24939y);
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
