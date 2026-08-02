package com.sports.insider.ui.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
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
import eg.c0;
import eg.m0;
import java.util.Locale;
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
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\f\u001a\u00020\b¢\u0006\u0004\b\f\u0010\nJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\nJ\r\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\nJ\r\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\nJ\u0017\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/sports/insider/ui/views/TelegramBannerView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "getWidthSizeFt", "()I", "getHeightSizeFt", "getWidthSizeTg", "getHeightSizeTg", "getWidthSizeSi", "getHeightSizeSi", "Landroid/graphics/Bitmap;", "bitmap", "", "setBitmapTg", "(Landroid/graphics/Bitmap;)V", "setBitmapSi", "setBitmapFt", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTelegramBannerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TelegramBannerView.kt\ncom/sports/insider/ui/views/TelegramBannerView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Color.kt\nandroidx/core/graphics/ColorKt\n+ 4 Canvas.kt\nandroidx/core/graphics/CanvasKt\n*L\n1#1,623:1\n1#2:624\n404#3:625\n404#3:626\n404#3:627\n189#4,8:628\n135#4,8:636\n135#4,8:644\n135#4,8:652\n135#4,8:660\n135#4,8:668\n135#4,8:676\n*S KotlinDebug\n*F\n+ 1 TelegramBannerView.kt\ncom/sports/insider/ui/views/TelegramBannerView\n*L\n160#1:625\n161#1:626\n231#1:627\n273#1:628,8\n306#1:636,8\n314#1:644,8\n319#1:652,8\n327#1:660,8\n339#1:668,8\n347#1:676,8\n*E\n"})
/* loaded from: classes.dex */
public final class TelegramBannerView extends View {
    public final float[] A;
    public Bitmap A0;
    public final Paint B;
    public final Matrix B0;
    public LinearGradient C;
    public final Matrix C0;
    public final int[] D;
    public final Matrix D0;
    public int E;
    public final d E0;
    public int F;
    public float G;
    public float H;
    public final TextPaint I;
    public final TextPaint J;
    public final Paint K;
    public final Paint L;

    /* renamed from: a, reason: collision with root package name */
    public final float f7986a;

    /* renamed from: b, reason: collision with root package name */
    public float f7987b;

    /* renamed from: c, reason: collision with root package name */
    public DisplayMetrics f7988c;

    /* renamed from: d, reason: collision with root package name */
    public Typeface f7989d;

    /* renamed from: e, reason: collision with root package name */
    public Typeface f7990e;

    /* renamed from: f, reason: collision with root package name */
    public final float f7991f;

    /* renamed from: g, reason: collision with root package name */
    public final float f7992g;

    /* renamed from: g0, reason: collision with root package name */
    public final Paint f7993g0;

    /* renamed from: h, reason: collision with root package name */
    public float f7994h;

    /* renamed from: h0, reason: collision with root package name */
    public final String f7995h0;

    /* renamed from: i, reason: collision with root package name */
    public float f7996i;

    /* renamed from: i0, reason: collision with root package name */
    public String f7997i0;
    public float j;
    public final String j0;

    /* renamed from: k, reason: collision with root package name */
    public float f7998k;
    public final RectF k0;

    /* renamed from: l, reason: collision with root package name */
    public float f7999l;

    /* renamed from: l0, reason: collision with root package name */
    public final RectF f8000l0;

    /* renamed from: m, reason: collision with root package name */
    public float f8001m;

    /* renamed from: m0, reason: collision with root package name */
    public final Path f8002m0;

    /* renamed from: n, reason: collision with root package name */
    public float f8003n;

    /* renamed from: n0, reason: collision with root package name */
    public final RectF f8004n0;

    /* renamed from: o, reason: collision with root package name */
    public float f8005o;

    /* renamed from: o0, reason: collision with root package name */
    public final RectF f8006o0;

    /* renamed from: p, reason: collision with root package name */
    public float f8007p;

    /* renamed from: p0, reason: collision with root package name */
    public final RectF f8008p0;
    public float q;

    /* renamed from: q0, reason: collision with root package name */
    public final RectF f8009q0;

    /* renamed from: r, reason: collision with root package name */
    public float f8010r;

    /* renamed from: r0, reason: collision with root package name */
    public StaticLayout f8011r0;

    /* renamed from: s, reason: collision with root package name */
    public float f8012s;

    /* renamed from: s0, reason: collision with root package name */
    public StaticLayout f8013s0;

    /* renamed from: t, reason: collision with root package name */
    public float f8014t;

    /* renamed from: t0, reason: collision with root package name */
    public float f8015t0;

    /* renamed from: u, reason: collision with root package name */
    public float f8016u;

    /* renamed from: u0, reason: collision with root package name */
    public final RectF f8017u0;

    /* renamed from: v, reason: collision with root package name */
    public float f8018v;

    /* renamed from: v0, reason: collision with root package name */
    public final RectF f8019v0;

    /* renamed from: w, reason: collision with root package name */
    public float f8020w;

    /* renamed from: w0, reason: collision with root package name */
    public final RectF f8021w0;

    /* renamed from: x, reason: collision with root package name */
    public float f8022x;
    public final RectF x0;

    /* renamed from: y, reason: collision with root package name */
    public final float f8023y;

    /* renamed from: y0, reason: collision with root package name */
    public Bitmap f8024y0;

    /* renamed from: z, reason: collision with root package name */
    public float f8025z;
    public Bitmap z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TelegramBannerView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f7986a = 1.0f;
        this.f7987b = 1.0f;
        this.f7991f = 16.0f;
        this.f7992g = 12.0f;
        this.f7994h = 1.0f;
        this.f7996i = 0.5f;
        this.j = 1.5f;
        this.f7998k = 4.0f;
        this.f7999l = 6.0f;
        this.f8001m = 12.0f;
        this.f8003n = 13.0f;
        this.f8005o = 15.0f;
        this.f8007p = 16.0f;
        this.q = 18.0f;
        this.f8010r = 54.0f;
        this.f8012s = 56.0f;
        this.f8014t = 88.0f;
        this.f8016u = 66.74f;
        this.f8018v = 16.83f;
        this.f8020w = 36.74f;
        this.f8022x = 151.0f;
        this.f8023y = 8.0f;
        this.f8025z = 8.0f;
        this.A = new float[8];
        this.B = new Paint(1);
        int[] iArr = new int[2];
        for (int i5 = 0; i5 < 2; i5++) {
            iArr[i5] = -1;
        }
        this.D = iArr;
        this.G = this.f7991f;
        this.H = this.f7992g;
        this.I = new TextPaint(1);
        this.J = new TextPaint(1);
        this.K = new Paint(1);
        this.L = new Paint(1);
        this.f7993g0 = new Paint(1);
        this.f7995h0 = "Получи экспресс-прогноз бесплатно";
        this.f7997i0 = "Получи экспресс-прогноз бесплатно";
        this.j0 = "Выполни задание в Telegram боте";
        this.k0 = new RectF();
        this.f8000l0 = new RectF();
        this.f8002m0 = new Path();
        this.f8004n0 = new RectF();
        this.f8006o0 = new RectF();
        this.f8008p0 = new RectF();
        this.f8009q0 = new RectF();
        this.f8017u0 = new RectF();
        this.f8019v0 = new RectF();
        this.f8021w0 = new RectF();
        this.x0 = new RectF();
        this.B0 = new Matrix();
        this.C0 = new Matrix();
        this.D0 = new Matrix();
        e eVar = m0.f9201a;
        this.E0 = c0.b(q.f18523a);
        c(context);
    }

    public static StaticLayout f(CharSequence charSequence, TextPaint textPaint, int i5) {
        if (charSequence == null || charSequence.length() == 0 || StringsKt.H(charSequence) || i5 <= 5) {
            return null;
        }
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, Math.min(i5, (int) textPaint.measureText(charSequence.toString()))).setAlignment(Layout.Alignment.ALIGN_CENTER).setIncludePad(true).setLineSpacing(0.0f, 1.0f).build();
    }

    public final void a(Canvas canvas) {
        Bitmap bitmap;
        int save;
        Bitmap bitmap2;
        Bitmap bitmap3;
        RectF rectF = this.f8017u0;
        if (!rectF.isEmpty() && (bitmap3 = this.f8024y0) != null) {
            save = canvas.save();
            canvas.clipRect(this.f8000l0);
            try {
                canvas.translate(rectF.left, rectF.top);
                if (!bitmap3.isRecycled()) {
                    canvas.drawBitmap(bitmap3, this.B0, this.K);
                }
                canvas.restoreToCount(save);
            } finally {
            }
        }
        RectF rectF2 = this.x0;
        if (!rectF2.isEmpty()) {
            save = canvas.save();
            canvas.clipRect(rectF2);
            try {
                canvas.drawRect(rectF2, this.L);
            } finally {
            }
        }
        RectF rectF3 = this.f8019v0;
        boolean isEmpty = rectF3.isEmpty();
        Paint paint = this.f7993g0;
        if (!isEmpty && (bitmap2 = this.z0) != null) {
            save = canvas.save();
            canvas.clipRect(rectF3);
            try {
                canvas.translate(rectF3.left, rectF3.top);
                if (!bitmap2.isRecycled()) {
                    canvas.drawBitmap(bitmap2, this.C0, paint);
                }
            } finally {
            }
        }
        RectF rectF4 = this.f8021w0;
        if (rectF4.isEmpty() || (bitmap = this.A0) == null) {
            return;
        }
        save = canvas.save();
        canvas.clipRect(rectF4);
        try {
            canvas.translate(rectF4.left, rectF4.top);
            if (!bitmap.isRecycled()) {
                canvas.drawBitmap(bitmap, this.D0, paint);
            }
        } finally {
        }
    }

    public final void b(Canvas canvas) {
        int save;
        StaticLayout staticLayout = this.f8011r0;
        if (staticLayout != null) {
            RectF rectF = this.f8008p0;
            if (!rectF.isEmpty()) {
                save = canvas.save();
                canvas.clipRect(rectF);
                try {
                    canvas.translate(rectF.left, rectF.top);
                    staticLayout.draw(canvas);
                } finally {
                }
            }
        }
        StaticLayout staticLayout2 = this.f8013s0;
        if (staticLayout2 != null) {
            RectF rectF2 = this.f8009q0;
            if (rectF2.isEmpty()) {
                return;
            }
            save = canvas.save();
            canvas.clipRect(rectF2);
            try {
                canvas.translate(rectF2.left, rectF2.top);
                staticLayout2.draw(canvas);
            } finally {
            }
        }
    }

    public final void c(Context context) {
        DisplayMetrics b10 = a.b(context, "getDisplayMetrics(...)");
        this.f7988c = b10;
        DisplayMetrics displayMetrics = null;
        if (b10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            b10 = null;
        }
        float f6 = b10.density;
        if (f6 <= 0.0f) {
            f6 = this.f7986a;
        }
        this.f7987b = f6;
        DisplayMetrics displayMetrics2 = this.f7988c;
        if (displayMetrics2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics2 = null;
        }
        Intrinsics.checkNotNullParameter(displayMetrics2, "<this>");
        int i5 = Build.VERSION.SDK_INT;
        float f10 = this.f7991f;
        this.G = i5 >= 34 ? TypedValue.applyDimension(2, f10, displayMetrics2) : displayMetrics2.scaledDensity * f10;
        DisplayMetrics displayMetrics3 = this.f7988c;
        if (displayMetrics3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
        } else {
            displayMetrics = displayMetrics3;
        }
        Intrinsics.checkNotNullParameter(displayMetrics, "<this>");
        float f11 = this.f7992g;
        this.H = i5 >= 34 ? TypedValue.applyDimension(2, f11, displayMetrics) : f11 * displayMetrics.scaledDensity;
        String upperCase = this.f7995h0.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        this.f7997i0 = upperCase;
        float f12 = this.f7987b;
        this.f7994h = f12 * 1.0f;
        this.f7996i = 0.5f * f12;
        this.j = 1.5f * f12;
        this.f7998k = 4.0f * f12;
        this.f7999l = 6.0f * f12;
        this.f8001m = 12.0f * f12;
        this.f8003n = 13.0f * f12;
        this.f8005o = 15.0f * f12;
        this.f8007p = 16.0f * f12;
        this.q = 18.0f * f12;
        this.f8010r = 54.0f * f12;
        this.f8012s = 56.0f * f12;
        this.f8016u = 66.74f * f12;
        this.f8018v = 16.83f * f12;
        this.f8020w = 36.74f * f12;
        this.f8014t = 88.0f * f12;
        this.f8022x = f12 * 151.0f;
        this.E = Color.parseColor("#061035");
        int parseColor = Color.parseColor("#203788");
        this.F = parseColor;
        int i10 = this.E;
        int[] iArr = this.D;
        iArr[0] = i10;
        iArr[1] = parseColor;
        float f13 = this.f8023y * this.f7987b;
        this.f8025z = f13;
        float[] fArr = this.A;
        fArr[0] = f13;
        fArr[1] = f13;
        fArr[2] = f13;
        fArr[3] = f13;
        fArr[4] = f13;
        fArr[5] = f13;
        fArr[6] = f13;
        fArr[7] = f13;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        TextPaint textPaint = this.I;
        textPaint.setTypeface(typeface);
        textPaint.setColor(-1);
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        textPaint.setStyle(style);
        textPaint.setTextSize(this.G);
        Typeface typeface2 = Typeface.DEFAULT;
        TextPaint textPaint2 = this.J;
        textPaint2.setTypeface(typeface2);
        textPaint2.setColor(Color.parseColor("#7FFFFFFF"));
        textPaint2.setStyle(style);
        textPaint2.setTextSize(this.H);
        this.f7993g0.setFilterBitmap(true);
        Paint paint = this.K;
        paint.setFilterBitmap(true);
        paint.setAlpha(26);
        Paint paint2 = this.L;
        paint2.setColor(-1);
        paint2.setAlpha(26);
        Paint.Style style2 = Paint.Style.FILL;
        Paint paint3 = this.B;
        paint3.setStyle(style2);
        paint3.setColor(this.F);
        paint3.setDither(true);
        this.B0.setScale(1.0f, 1.0f);
        this.C0.setScale(1.0f, 1.0f);
        this.D0.setScale(1.0f, 1.0f);
    }

    public final void d() {
        this.f8000l0.setEmpty();
        this.f8008p0.setEmpty();
        this.f8011r0 = null;
        this.f8009q0.setEmpty();
        this.f8013s0 = null;
        this.f8017u0.setEmpty();
        this.f8019v0.setEmpty();
        this.f8021w0.setEmpty();
    }

    public final void e(int i5, int i10) {
        if (i5 <= 0 || i10 <= 0) {
            d();
            return;
        }
        RectF rectF = this.k0;
        rectF.left = getPaddingStart() + 0.0f;
        rectF.top = getPaddingTop() + 0.0f;
        rectF.right = (i5 - getPaddingEnd()) + 0.0f;
        rectF.bottom = (i10 - getPaddingBottom()) + 0.0f;
        if (rectF.height() <= 0.0f || rectF.width() <= 0.0f || rectF.isEmpty()) {
            d();
            return;
        }
        this.f8015t0 = rectF.centerX();
        rectF.centerY();
        float f6 = rectF.top + this.f8001m;
        float f10 = this.q + f6;
        float f11 = this.f8015t0;
        float f12 = this.f8016u;
        float f13 = f11 - (f12 / 2.0f);
        float f14 = f12 + f13;
        float f15 = this.j;
        RectF rectF2 = this.f8019v0;
        rectF2.top = f6 + f15;
        rectF2.bottom = f10 - f15;
        float f16 = f13 + f15;
        rectF2.left = f16;
        rectF2.right = f16 + this.f8005o;
        float f17 = this.f7996i;
        RectF rectF3 = this.f8021w0;
        rectF3.top = f6 + f17;
        rectF3.bottom = f10 - f17;
        rectF3.left = f14 - this.f8020w;
        rectF3.right = f14;
        float f18 = this.f7994h;
        RectF rectF4 = this.x0;
        rectF4.top = f6 + f18;
        rectF4.bottom = f10 - f18;
        float f19 = rectF2.right + f15 + this.f7999l;
        rectF4.left = f19;
        rectF4.right = f19 + f17;
        RectF rectF5 = this.f8004n0;
        rectF5.setEmpty();
        RectF rectF6 = this.f8006o0;
        rectF6.setEmpty();
        rectF5.left = rectF.left;
        rectF5.top = f10 + this.f8003n;
        rectF5.right = rectF.right;
        StaticLayout f20 = f(this.f7997i0, this.I, (int) rectF5.width());
        float width = (r12 - (f20 != null ? f20.getWidth() : 0)) / 2.0f;
        rectF5.left = rectF.left + width;
        rectF5.right = rectF.right - width;
        float height = rectF5.top + (f20 != null ? f20.getHeight() : 0);
        rectF5.bottom = height;
        rectF6.left = rectF.left;
        rectF6.top = height + this.f7998k;
        rectF6.right = rectF.right;
        StaticLayout f21 = f(this.j0, this.J, (int) rectF6.width());
        float width2 = (r12 - (f21 != null ? f21.getWidth() : 0)) / 2.0f;
        rectF6.left = rectF.left + width2;
        rectF6.right = rectF.right - width2;
        rectF6.bottom = rectF6.top + (f21 != null ? f21.getHeight() : 0);
        float f22 = rectF5.left;
        RectF rectF7 = this.f8008p0;
        rectF7.left = f22;
        rectF7.top = rectF5.top;
        rectF7.right = rectF5.right;
        rectF7.bottom = rectF5.bottom;
        float f23 = rectF6.left;
        RectF rectF8 = this.f8009q0;
        rectF8.left = f23;
        rectF8.top = rectF6.top;
        rectF8.right = rectF6.right;
        float f24 = rectF6.bottom;
        rectF8.bottom = f24;
        this.f8011r0 = f20;
        this.f8013s0 = f21;
        rectF.bottom = f24 + this.f8001m;
        Path path = this.f8002m0;
        path.rewind();
        path.addRoundRect(rectF.left, rectF.top, rectF.right, rectF.bottom, this.A, Path.Direction.CCW);
        float f25 = rectF.left;
        RectF rectF9 = this.f8000l0;
        rectF9.left = f25;
        float f26 = rectF.top;
        rectF9.top = f26;
        float f27 = rectF.right;
        rectF9.right = f27;
        float f28 = rectF.bottom;
        rectF9.bottom = f28;
        float f29 = this.f8022x;
        float f30 = (f29 / this.f8014t) * (f28 - f26);
        float f31 = (this.f8010r * f30) / f29;
        float f32 = ((f29 - this.f8012s) * f30) / f29;
        float f33 = f26 - f31;
        RectF rectF10 = this.f8017u0;
        rectF10.top = f33;
        rectF10.bottom = f33 + f30;
        float f34 = f27 - f32;
        rectF10.left = f34;
        rectF10.right = f34 + f30;
        float f35 = rectF9.top;
        float f36 = rectF9.bottom;
        float f37 = this.f8015t0;
        this.C = new LinearGradient(f37, f35, f37, f36, this.D, (float[]) null, Shader.TileMode.CLAMP);
        invalidate();
    }

    public final int getHeightSizeFt() {
        RectF rectF = this.f8017u0;
        if (rectF.isEmpty()) {
            return 0;
        }
        return (int) Math.abs(rectF.bottom - rectF.top);
    }

    public final int getHeightSizeSi() {
        return (int) (this.f7987b * 16.83d);
    }

    public final int getHeightSizeTg() {
        return (int) this.f8005o;
    }

    public final int getWidthSizeFt() {
        RectF rectF = this.f8017u0;
        if (rectF.isEmpty()) {
            return 0;
        }
        return (int) Math.abs(rectF.right - rectF.left);
    }

    public final int getWidthSizeSi() {
        return (int) (this.f7987b * 36.74d);
    }

    public final int getWidthSizeTg() {
        return (int) this.f8005o;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        e(getWidth(), getHeight());
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
        c0.g(this.E0, null);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        RectF rectF = this.f8000l0;
        if (rectF.isEmpty()) {
            return;
        }
        int save = canvas.save();
        canvas.clipPath(this.f8002m0);
        try {
            float f6 = this.f8025z;
            canvas.drawRoundRect(rectF, f6, f6, this.B);
            a(canvas);
            b(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i5, int i10) {
        super.onMeasure(i5, i10);
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        float paddingEnd = (this.f8007p * 2) + getPaddingEnd() + getPaddingStart();
        float f6 = size - paddingEnd;
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        int i11 = (int) f6;
        StaticLayout f10 = f(this.f7997i0, this.I, i11);
        StaticLayout f11 = f(this.j0, this.J, i11);
        int max = (int) (Math.max(f10 != null ? f10.getWidth() : 0, f11 != null ? f11.getWidth() : 0) + paddingEnd);
        float paddingTop = getPaddingTop();
        float f12 = this.f8001m;
        float paddingBottom = paddingTop + f12 + this.q + this.f8003n + this.f7998k + f12 + getPaddingBottom() + (f10 != null ? f10.getHeight() : 0) + (f11 != null ? f11.getHeight() : 0);
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(max, size);
        } else if (mode != 1073741824) {
            size = max;
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min((int) paddingBottom, size2);
        } else if (mode2 != 1073741824) {
            size2 = (int) paddingBottom;
        }
        Integer valueOf = Integer.valueOf(size);
        Integer valueOf2 = Integer.valueOf(size2);
        int resolveSize = View.resolveSize(valueOf.intValue(), i5);
        int resolveSize2 = View.resolveSize(valueOf2.intValue(), i10);
        setMeasuredDimension(resolveSize, resolveSize2);
        e(resolveSize, resolveSize2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i5, int i10, int i11, int i12) {
        super.onSizeChanged(i5, i10, i11, i12);
        if (i5 <= 0 || i10 <= 0) {
            return;
        }
        Paint paint = this.B;
        if (i11 == i5 && i12 == i10) {
            LinearGradient linearGradient = this.C;
            if (linearGradient != null) {
                paint.setShader(linearGradient);
            }
            invalidate();
            return;
        }
        e(i5, i10);
        LinearGradient linearGradient2 = this.C;
        if (linearGradient2 != null) {
            paint.setShader(linearGradient2);
        }
    }

    public final void setBitmapFt(@Nullable Bitmap bitmap) {
        if (bitmap == null) {
            this.f8024y0 = null;
        }
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f8024y0 = bitmap;
        }
        requestLayout();
    }

    public final void setBitmapSi(@Nullable Bitmap bitmap) {
        if (bitmap == null) {
            this.A0 = null;
        }
        float width = bitmap != null ? bitmap.getWidth() : 0.0f;
        float height = bitmap != null ? bitmap.getHeight() : 0.0f;
        if (bitmap != null && width > 10.0f && height > 10.0f) {
            float f6 = this.f8020w;
            float f10 = this.f8018v;
            float min = Math.min(f6 / width, f10 / height);
            float f11 = f6 - (width * min);
            float f12 = 2;
            float f13 = (f10 - (height * min)) / f12;
            Matrix matrix = this.D0;
            matrix.setScale(min, min);
            matrix.postTranslate(f11 / f12, f13);
            if (!bitmap.isRecycled()) {
                this.A0 = bitmap;
            }
        }
        invalidate();
    }

    public final void setBitmapTg(@Nullable Bitmap bitmap) {
        if (bitmap == null) {
            this.z0 = null;
        }
        float width = bitmap != null ? bitmap.getWidth() : 0.0f;
        float height = bitmap != null ? bitmap.getHeight() : 0.0f;
        if (bitmap != null && width > 10.0f && height > 10.0f) {
            float f6 = this.f8005o;
            float min = Math.min(f6 / width, f6 / height);
            float f10 = 2;
            float f11 = (f6 - (width * min)) / f10;
            float f12 = (f6 - (height * min)) / f10;
            Matrix matrix = this.C0;
            matrix.setScale(min, min);
            matrix.postTranslate(f11, f12);
            if (!bitmap.isRecycled()) {
                this.z0 = bitmap;
            }
        }
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TelegramBannerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f7986a = 1.0f;
        this.f7987b = 1.0f;
        this.f7991f = 16.0f;
        this.f7992g = 12.0f;
        this.f7994h = 1.0f;
        this.f7996i = 0.5f;
        this.j = 1.5f;
        this.f7998k = 4.0f;
        this.f7999l = 6.0f;
        this.f8001m = 12.0f;
        this.f8003n = 13.0f;
        this.f8005o = 15.0f;
        this.f8007p = 16.0f;
        this.q = 18.0f;
        this.f8010r = 54.0f;
        this.f8012s = 56.0f;
        this.f8014t = 88.0f;
        this.f8016u = 66.74f;
        this.f8018v = 16.83f;
        this.f8020w = 36.74f;
        this.f8022x = 151.0f;
        this.f8023y = 8.0f;
        this.f8025z = 8.0f;
        this.A = new float[8];
        this.B = new Paint(1);
        int[] iArr = new int[2];
        for (int i5 = 0; i5 < 2; i5++) {
            iArr[i5] = -1;
        }
        this.D = iArr;
        this.G = this.f7991f;
        this.H = this.f7992g;
        this.I = new TextPaint(1);
        this.J = new TextPaint(1);
        this.K = new Paint(1);
        this.L = new Paint(1);
        this.f7993g0 = new Paint(1);
        this.f7995h0 = "Получи экспресс-прогноз бесплатно";
        this.f7997i0 = "Получи экспресс-прогноз бесплатно";
        this.j0 = "Выполни задание в Telegram боте";
        this.k0 = new RectF();
        this.f8000l0 = new RectF();
        this.f8002m0 = new Path();
        this.f8004n0 = new RectF();
        this.f8006o0 = new RectF();
        this.f8008p0 = new RectF();
        this.f8009q0 = new RectF();
        this.f8017u0 = new RectF();
        this.f8019v0 = new RectF();
        this.f8021w0 = new RectF();
        this.x0 = new RectF();
        this.B0 = new Matrix();
        this.C0 = new Matrix();
        this.D0 = new Matrix();
        e eVar = m0.f9201a;
        this.E0 = c0.b(q.f18523a);
        c(context);
    }
}
