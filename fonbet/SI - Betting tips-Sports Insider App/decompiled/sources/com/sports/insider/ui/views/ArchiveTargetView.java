package com.sports.insider.ui.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import com.sports.insider.R;
import eg.c0;
import eg.m0;
import jg.d;
import jg.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import lg.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yg.a;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/sports/insider/ui/views/ArchiveTargetView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/graphics/Typeface;", "typeface", "", "setButtonTypeface", "(Landroid/graphics/Typeface;)V", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nArchiveTargetView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchiveTargetView.kt\ncom/sports/insider/ui/views/ArchiveTargetView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Color.kt\nandroidx/core/graphics/ColorKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 Canvas.kt\nandroidx/core/graphics/CanvasKt\n*L\n1#1,495:1\n1#2:496\n404#3:497\n404#3:498\n404#3:499\n1440#4,2:500\n27#5,7:502\n135#5,8:509\n*S KotlinDebug\n*F\n+ 1 ArchiveTargetView.kt\ncom/sports/insider/ui/views/ArchiveTargetView\n*L\n154#1:497\n155#1:498\n157#1:499\n270#1:500,2\n275#1:502,7\n292#1:509,8\n*E\n"})
/* loaded from: classes.dex */
public final class ArchiveTargetView extends View {
    public float A;
    public float B;
    public float C;
    public final RectF D;
    public final RectF E;
    public final RectF F;
    public final Path G;
    public final RectF H;
    public final RectF I;
    public final float[] J;
    public final float[] K;
    public final RectF L;

    /* renamed from: a, reason: collision with root package name */
    public final float f7125a;

    /* renamed from: b, reason: collision with root package name */
    public final float f7126b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7127c;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f7128d;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f7129e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f7130f;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f7131g;

    /* renamed from: g0, reason: collision with root package name */
    public final RectF f7132g0;

    /* renamed from: h, reason: collision with root package name */
    public final TextPaint f7133h;

    /* renamed from: h0, reason: collision with root package name */
    public final RectF f7134h0;

    /* renamed from: i, reason: collision with root package name */
    public String f7135i;

    /* renamed from: i0, reason: collision with root package name */
    public final RectF f7136i0;
    public float j;
    public StaticLayout j0;

    /* renamed from: k, reason: collision with root package name */
    public Typeface f7137k;
    public DisplayMetrics k0;

    /* renamed from: l, reason: collision with root package name */
    public float f7138l;

    /* renamed from: l0, reason: collision with root package name */
    public final int[] f7139l0;

    /* renamed from: m, reason: collision with root package name */
    public int f7140m;

    /* renamed from: m0, reason: collision with root package name */
    public final int[] f7141m0;

    /* renamed from: n, reason: collision with root package name */
    public int f7142n;

    /* renamed from: n0, reason: collision with root package name */
    public LinearGradient f7143n0;

    /* renamed from: o, reason: collision with root package name */
    public int f7144o;

    /* renamed from: o0, reason: collision with root package name */
    public LinearGradient f7145o0;

    /* renamed from: p, reason: collision with root package name */
    public float f7146p;

    /* renamed from: p0, reason: collision with root package name */
    public final d f7147p0;
    public float q;

    /* renamed from: r, reason: collision with root package name */
    public float f7148r;

    /* renamed from: s, reason: collision with root package name */
    public float f7149s;

    /* renamed from: t, reason: collision with root package name */
    public float f7150t;

    /* renamed from: u, reason: collision with root package name */
    public float f7151u;

    /* renamed from: v, reason: collision with root package name */
    public float f7152v;

    /* renamed from: w, reason: collision with root package name */
    public float f7153w;

    /* renamed from: x, reason: collision with root package name */
    public float f7154x;

    /* renamed from: y, reason: collision with root package name */
    public float f7155y;

    /* renamed from: z, reason: collision with root package name */
    public float f7156z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArchiveTargetView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f7125a = 12.0f;
        this.f7126b = 1.0f;
        this.f7127c = R.string.archive_description;
        this.f7128d = new Paint(1);
        this.f7129e = new Paint(1);
        this.f7130f = new Paint(1);
        this.f7131g = new Paint(1);
        this.f7133h = new TextPaint(1);
        this.f7135i = "You have seen all predictions for today, below there is the archive of predictions for the last year.";
        this.j = 12.0f;
        this.f7138l = 1.0f;
        this.f7146p = 2.0f;
        this.q = 5.0f;
        this.f7148r = 9.0f;
        this.f7149s = 10.0f;
        this.f7150t = 15.0f;
        this.f7151u = 16.0f;
        this.f7152v = 17.5f;
        this.f7153w = 18.5f;
        this.f7154x = 20.0f;
        this.f7155y = 26.0f;
        this.f7156z = 27.0f;
        this.A = 30.0f;
        this.B = 54.0f;
        this.C = 64.0f;
        this.D = new RectF();
        this.E = new RectF();
        this.F = new RectF();
        this.G = new Path();
        this.H = new RectF();
        this.I = new RectF();
        float[] fArr = new float[4];
        for (int i5 = 0; i5 < 4; i5++) {
            fArr[i5] = 0.0f;
        }
        this.J = fArr;
        float[] fArr2 = new float[4];
        for (int i10 = 0; i10 < 4; i10++) {
            fArr2[i10] = 0.0f;
        }
        this.K = fArr2;
        this.L = new RectF();
        this.f7132g0 = new RectF();
        this.f7134h0 = new RectF();
        this.f7136i0 = new RectF();
        int[] iArr = new int[2];
        for (int i11 = 0; i11 < 2; i11++) {
            iArr[i11] = -1;
        }
        this.f7139l0 = iArr;
        int[] iArr2 = new int[2];
        for (int i12 = 0; i12 < 2; i12++) {
            iArr2[i12] = -1;
        }
        this.f7141m0 = iArr2;
        e eVar = m0.f9201a;
        this.f7147p0 = c0.b(q.f18523a);
        b(context);
    }

    public static boolean c(float[] fArr) {
        Float f6;
        int length = fArr.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                f6 = null;
                break;
            }
            float f10 = fArr[i5];
            if (f10 != 0.0f) {
                f6 = Float.valueOf(f10);
                break;
            }
            i5++;
        }
        return f6 == null;
    }

    public static StaticLayout e(CharSequence charSequence, TextPaint textPaint, int i5) {
        if (charSequence == null || charSequence.length() == 0 || StringsKt.H(charSequence) || i5 <= 5) {
            return null;
        }
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, Math.min(i5, (int) textPaint.measureText(charSequence.toString()))).setAlignment(Layout.Alignment.ALIGN_CENTER).setIncludePad(true).setLineSpacing(0.0f, 1.0f).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setButtonTypeface(Typeface typeface) {
        if (typeface == null || !Intrinsics.areEqual(this.f7137k, typeface)) {
            this.f7137k = typeface;
            if (typeface == null) {
                typeface = Typeface.DEFAULT;
            }
            this.f7133h.setTypeface(typeface);
        }
    }

    public final void b(Context context) {
        DisplayMetrics b10 = a.b(context, "getDisplayMetrics(...)");
        this.k0 = b10;
        DisplayMetrics displayMetrics = null;
        if (b10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            b10 = null;
        }
        float f6 = b10.density;
        if (f6 <= 0.0f) {
            f6 = this.f7126b;
        }
        this.f7138l = f6;
        DisplayMetrics displayMetrics2 = this.k0;
        if (displayMetrics2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
        } else {
            displayMetrics = displayMetrics2;
        }
        Intrinsics.checkNotNullParameter(displayMetrics, "<this>");
        int i5 = Build.VERSION.SDK_INT;
        float f10 = this.f7125a;
        this.j = i5 >= 34 ? TypedValue.applyDimension(2, f10, displayMetrics) : displayMetrics.scaledDensity * f10;
        float f11 = this.f7138l;
        this.f7146p = 2.0f * f11;
        this.q = 5.0f * f11;
        this.f7148r = 9.0f * f11;
        this.f7149s = 10.0f * f11;
        this.f7150t = 15.0f * f11;
        this.f7151u = 16.0f * f11;
        this.f7152v = 17.5f * f11;
        this.f7153w = 18.5f * f11;
        this.f7154x = 20.0f * f11;
        this.f7155y = 26.0f * f11;
        this.f7156z = 27.0f * f11;
        this.A = 30.0f * f11;
        this.B = 54.0f * f11;
        this.C = f11 * 64.0f;
        this.f7140m = Color.parseColor("#03F39E");
        this.f7142n = Color.parseColor("#40007E");
        this.f7144o = Color.parseColor("#CBCBCB");
        int i10 = this.f7140m;
        int[] iArr = this.f7141m0;
        iArr[0] = i10;
        int i11 = this.f7142n;
        iArr[1] = i11;
        int[] iArr2 = this.f7139l0;
        iArr2[0] = i11;
        iArr2[1] = i10;
        Typeface typeface = Typeface.DEFAULT;
        TextPaint textPaint = this.f7133h;
        textPaint.setTypeface(typeface);
        textPaint.setColor(this.f7144o);
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        textPaint.setStyle(style);
        textPaint.setTextSize(this.j);
        Paint paint = this.f7128d;
        paint.setStyle(style);
        paint.setColor(this.f7140m);
        paint.setStrokeWidth(this.f7146p);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint paint2 = this.f7129e;
        paint2.setStyle(style);
        paint2.setColor(this.f7140m);
        paint2.setStrokeWidth(this.f7146p);
        paint2.setStrokeCap(cap);
        Paint.Style style2 = Paint.Style.STROKE;
        Paint paint3 = this.f7130f;
        paint3.setStyle(style2);
        paint3.setColor(this.f7140m);
        paint3.setStrokeWidth(this.f7146p);
        Paint paint4 = this.f7131g;
        paint4.setStyle(style2);
        paint4.setColor(-1);
        paint4.setStrokeWidth(this.f7146p);
        paint4.setStrokeCap(cap);
    }

    public final void d(int i5, int i10) {
        RectF rectF = this.E;
        RectF rectF2 = this.f7136i0;
        if (i5 <= 0 || i10 <= 0) {
            rectF.setEmpty();
            rectF2.setEmpty();
            this.j0 = null;
            return;
        }
        RectF rectF3 = this.D;
        rectF3.left = getPaddingStart() + 0.0f;
        rectF3.top = getPaddingTop() + 0.0f;
        rectF3.right = (i5 - getPaddingEnd()) + 0.0f;
        rectF3.bottom = (i10 - getPaddingBottom()) + 0.0f;
        if (rectF3.height() <= 0.0f || rectF3.width() <= 0.0f || rectF3.isEmpty()) {
            rectF.setEmpty();
            rectF2.setEmpty();
            this.j0 = null;
            return;
        }
        rectF3.centerX();
        rectF3.centerY();
        RectF rectF4 = this.f7134h0;
        rectF4.setEmpty();
        float f6 = rectF3.left;
        float f10 = this.f7150t;
        rectF4.left = f6 + f10;
        rectF4.top = rectF3.top + this.B + this.f7149s;
        rectF4.right = rectF3.right - f10;
        rectF4.bottom = rectF3.bottom;
        StaticLayout e7 = e(this.f7135i, this.f7133h, (int) rectF4.width());
        rectF4.bottom = rectF4.top + (e7 != null ? e7.getHeight() : 0);
        RectF rectF5 = this.H;
        rectF5.setEmpty();
        rectF5.left = rectF3.left + this.f7151u;
        rectF5.top = rectF3.top + this.f7155y;
        rectF5.right = (rectF3.centerX() - this.f7153w) - this.f7156z;
        rectF5.bottom = rectF3.top + this.f7155y + this.f7146p;
        RectF rectF6 = this.I;
        rectF6.setEmpty();
        rectF6.left = rectF3.centerX() + this.f7156z + this.f7153w;
        rectF6.top = rectF5.top;
        rectF6.right = rectF3.right - this.f7151u;
        rectF6.bottom = rectF5.bottom;
        float f11 = rectF5.left;
        float[] fArr = this.J;
        fArr[0] = f11;
        fArr[1] = rectF5.centerY();
        fArr[2] = rectF5.right;
        fArr[3] = rectF5.centerY();
        float f12 = rectF6.left;
        float[] fArr2 = this.K;
        fArr2[0] = f12;
        fArr2[1] = rectF6.centerY();
        fArr2[2] = rectF6.right;
        fArr2[3] = rectF6.centerY();
        RectF rectF7 = this.L;
        rectF7.setEmpty();
        rectF7.left = rectF3.centerX() - this.f7156z;
        rectF7.top = rectF3.top;
        rectF7.right = rectF3.centerX() + this.f7156z;
        rectF7.bottom = rectF3.top + this.B;
        RectF rectF8 = this.f7132g0;
        rectF8.setEmpty();
        rectF8.left = rectF7.centerX();
        rectF8.top = rectF7.centerY();
        rectF8.right = rectF7.centerX() + 0.5f;
        rectF8.bottom = rectF7.centerY() + 0.5f;
        float f13 = rectF7.left;
        float f14 = this.f7152v;
        RectF rectF9 = this.F;
        rectF9.left = f13 + f14;
        float f15 = rectF7.top;
        float f16 = this.f7154x;
        rectF9.top = f15 + f16;
        rectF9.right = rectF7.right - f14;
        rectF9.bottom = rectF7.bottom - f16;
        Path path = this.G;
        path.rewind();
        path.moveTo(rectF9.left, rectF9.top + this.f7148r);
        path.lineTo(rectF9.left + this.q, rectF9.bottom);
        path.lineTo(rectF9.right, rectF9.top);
        rectF2.left = rectF4.left;
        rectF2.top = rectF4.top;
        rectF2.right = rectF4.right;
        rectF2.bottom = rectF4.bottom;
        this.j0 = e7;
        rectF.left = rectF3.left;
        rectF.top = rectF3.top;
        rectF.right = rectF3.right;
        rectF.bottom = rectF3.bottom;
        float f17 = rectF5.left;
        float centerY = rectF5.centerY();
        float f18 = rectF5.right;
        float centerY2 = rectF5.centerY();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f7143n0 = new LinearGradient(f17, centerY, f18, centerY2, this.f7139l0, (float[]) null, tileMode);
        this.f7145o0 = new LinearGradient(rectF6.left, rectF6.centerY(), rectF6.right, rectF6.centerY(), this.f7141m0, (float[]) null, tileMode);
        invalidate();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        d(getWidth(), getHeight());
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.E.setEmpty();
        this.f7136i0.setEmpty();
        this.j0 = null;
        c0.g(this.f7147p0, null);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (this.E.isEmpty()) {
            return;
        }
        RectF rectF = this.f7132g0;
        float[] fArr = this.K;
        float[] fArr2 = this.J;
        int save = canvas.save();
        try {
            if (!c(fArr2)) {
                canvas.drawLines(fArr2, this.f7128d);
            }
            if (!c(fArr)) {
                canvas.drawLines(fArr, this.f7129e);
            }
            if (!rectF.isEmpty()) {
                canvas.drawCircle(rectF.left, rectF.top, this.f7155y, this.f7130f);
            }
            canvas.drawPath(this.G, this.f7131g);
            canvas.restoreToCount(save);
            StaticLayout staticLayout = this.j0;
            if (staticLayout != null) {
                RectF rectF2 = this.f7136i0;
                if (rectF2.isEmpty()) {
                    return;
                }
                save = canvas.save();
                canvas.clipRect(rectF2);
                try {
                    canvas.translate(rectF2.left, rectF2.top);
                    staticLayout.draw(canvas);
                } finally {
                    canvas.restoreToCount(save);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i5, int i10) {
        super.onMeasure(i5, i10);
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        float paddingEnd = getPaddingEnd() + getPaddingStart() + this.A;
        float f6 = size - paddingEnd;
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        StaticLayout e7 = e(this.f7135i, this.f7133h, (int) f6);
        int width = (int) ((e7 != null ? e7.getWidth() : 0) + paddingEnd);
        int paddingBottom = (int) (getPaddingBottom() + getPaddingTop() + this.C + (e7 != null ? e7.getHeight() : 0));
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(width, size);
        } else if (mode != 1073741824) {
            size = width;
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(paddingBottom, size2);
        } else if (mode2 != 1073741824) {
            size2 = paddingBottom;
        }
        Integer valueOf = Integer.valueOf(size);
        Integer valueOf2 = Integer.valueOf(size2);
        int resolveSize = View.resolveSize(valueOf.intValue(), i5);
        int resolveSize2 = View.resolveSize(valueOf2.intValue(), i10);
        setMeasuredDimension(resolveSize, resolveSize2);
        d(resolveSize, resolveSize2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i5, int i10, int i11, int i12) {
        super.onSizeChanged(i5, i10, i11, i12);
        if (i5 <= 0 || i10 <= 0) {
            return;
        }
        Paint paint = this.f7129e;
        Paint paint2 = this.f7128d;
        if (i11 == i5 && i12 == i10) {
            LinearGradient linearGradient = this.f7143n0;
            if (linearGradient != null) {
                paint2.setShader(linearGradient);
            }
            LinearGradient linearGradient2 = this.f7145o0;
            if (linearGradient2 != null) {
                paint.setShader(linearGradient2);
            }
            invalidate();
            return;
        }
        d(i5, i10);
        LinearGradient linearGradient3 = this.f7143n0;
        if (linearGradient3 != null) {
            paint2.setShader(linearGradient3);
        }
        LinearGradient linearGradient4 = this.f7145o0;
        if (linearGradient4 != null) {
            paint.setShader(linearGradient4);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArchiveTargetView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f7125a = 12.0f;
        this.f7126b = 1.0f;
        this.f7127c = R.string.archive_description;
        this.f7128d = new Paint(1);
        this.f7129e = new Paint(1);
        this.f7130f = new Paint(1);
        this.f7131g = new Paint(1);
        this.f7133h = new TextPaint(1);
        this.f7135i = "You have seen all predictions for today, below there is the archive of predictions for the last year.";
        this.j = 12.0f;
        this.f7138l = 1.0f;
        this.f7146p = 2.0f;
        this.q = 5.0f;
        this.f7148r = 9.0f;
        this.f7149s = 10.0f;
        this.f7150t = 15.0f;
        this.f7151u = 16.0f;
        this.f7152v = 17.5f;
        this.f7153w = 18.5f;
        this.f7154x = 20.0f;
        this.f7155y = 26.0f;
        this.f7156z = 27.0f;
        this.A = 30.0f;
        this.B = 54.0f;
        this.C = 64.0f;
        this.D = new RectF();
        this.E = new RectF();
        this.F = new RectF();
        this.G = new Path();
        this.H = new RectF();
        this.I = new RectF();
        float[] fArr = new float[4];
        for (int i5 = 0; i5 < 4; i5++) {
            fArr[i5] = 0.0f;
        }
        this.J = fArr;
        float[] fArr2 = new float[4];
        for (int i10 = 0; i10 < 4; i10++) {
            fArr2[i10] = 0.0f;
        }
        this.K = fArr2;
        this.L = new RectF();
        this.f7132g0 = new RectF();
        this.f7134h0 = new RectF();
        this.f7136i0 = new RectF();
        int[] iArr = new int[2];
        for (int i11 = 0; i11 < 2; i11++) {
            iArr[i11] = -1;
        }
        this.f7139l0 = iArr;
        int[] iArr2 = new int[2];
        for (int i12 = 0; i12 < 2; i12++) {
            iArr2[i12] = -1;
        }
        this.f7141m0 = iArr2;
        e eVar = m0.f9201a;
        this.f7147p0 = c0.b(q.f18523a);
        b(context);
    }
}
