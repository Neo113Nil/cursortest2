package com.sports.insider.ui.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
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
import jg.d;
import jg.q;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import lg.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yg.a;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/sports/insider/ui/views/EmptySectionFollowView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/graphics/Typeface;", "typeface", "", "setArimoRegularTypeface", "(Landroid/graphics/Typeface;)V", "", "getWidthIcon", "()I", "getHeightIcon", "Landroid/graphics/Bitmap;", "bitmap", "setBitmap", "(Landroid/graphics/Bitmap;)V", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEmptySectionFollowView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmptySectionFollowView.kt\ncom/sports/insider/ui/views/EmptySectionFollowView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Color.kt\nandroidx/core/graphics/ColorKt\n+ 4 Canvas.kt\nandroidx/core/graphics/CanvasKt\n*L\n1#1,443:1\n1#2:444\n404#3:445\n135#4,8:446\n27#4,7:454\n27#4,7:461\n*S KotlinDebug\n*F\n+ 1 EmptySectionFollowView.kt\ncom/sports/insider/ui/views/EmptySectionFollowView\n*L\n124#1:445\n415#1:446,8\n427#1:454,7\n435#1:461,7\n*E\n"})
/* loaded from: classes.dex */
public final class EmptySectionFollowView extends View {
    public final Path A;
    public final RectF B;
    public final RectF C;
    public final d D;
    public boolean E;
    public Bitmap F;
    public final Matrix G;

    /* renamed from: a, reason: collision with root package name */
    public final int f7383a;

    /* renamed from: b, reason: collision with root package name */
    public final DisplayMetrics f7384b;

    /* renamed from: c, reason: collision with root package name */
    public final TextPaint f7385c;

    /* renamed from: d, reason: collision with root package name */
    public final TextPaint f7386d;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f7387e;

    /* renamed from: f, reason: collision with root package name */
    public final float f7388f;

    /* renamed from: g, reason: collision with root package name */
    public final float f7389g;

    /* renamed from: h, reason: collision with root package name */
    public final float f7390h;

    /* renamed from: i, reason: collision with root package name */
    public final float f7391i;
    public final float j;

    /* renamed from: k, reason: collision with root package name */
    public final float f7392k;

    /* renamed from: l, reason: collision with root package name */
    public final float f7393l;

    /* renamed from: m, reason: collision with root package name */
    public final float f7394m;

    /* renamed from: n, reason: collision with root package name */
    public final float f7395n;

    /* renamed from: o, reason: collision with root package name */
    public final int f7396o;

    /* renamed from: p, reason: collision with root package name */
    public final int f7397p;
    public String q;

    /* renamed from: r, reason: collision with root package name */
    public String f7398r;

    /* renamed from: s, reason: collision with root package name */
    public StaticLayout f7399s;

    /* renamed from: t, reason: collision with root package name */
    public StaticLayout f7400t;

    /* renamed from: u, reason: collision with root package name */
    public final float f7401u;

    /* renamed from: v, reason: collision with root package name */
    public final float f7402v;

    /* renamed from: w, reason: collision with root package name */
    public Typeface f7403w;

    /* renamed from: x, reason: collision with root package name */
    public final float f7404x;

    /* renamed from: y, reason: collision with root package name */
    public final RectF f7405y;

    /* renamed from: z, reason: collision with root package name */
    public final RectF f7406z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmptySectionFollowView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        TextPaint textPaint = new TextPaint(1);
        this.f7385c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f7386d = textPaint2;
        Paint paint = new Paint(1);
        this.f7387e = paint;
        this.f7388f = 16.0f;
        this.f7389g = 16.0f;
        this.f7390h = 16.0f;
        this.f7391i = 0.0f;
        this.j = 16.0f;
        this.f7392k = 10.0f;
        this.f7393l = 16.0f;
        this.f7394m = 16.0f;
        this.f7395n = 16.0f;
        this.f7396o = 100;
        this.f7397p = 75;
        this.q = "Empty section";
        this.f7398r = "Your predictions are stored here";
        this.f7401u = 22.0f;
        this.f7402v = 16.0f;
        this.f7404x = 1.0f;
        this.f7405y = new RectF();
        this.f7406z = new RectF();
        this.A = new Path();
        this.B = new RectF();
        this.C = new RectF();
        e eVar = m0.f9201a;
        this.D = c0.b(q.f18523a);
        Matrix matrix = new Matrix();
        this.G = matrix;
        DisplayMetrics b10 = a.b(context, "getDisplayMetrics(...)");
        this.f7384b = b10;
        DisplayMetrics displayMetrics = null;
        if (b10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            b10 = null;
        }
        float f6 = b10.density;
        f6 = f6 <= 0.0f ? 1.0f : f6;
        this.f7404x = f6;
        this.f7395n *= f6;
        this.f7396o = (int) (this.f7396o * f6);
        this.f7397p = (int) (this.f7397p * f6);
        matrix.setScale(1.0f, 1.0f);
        DisplayMetrics displayMetrics2 = this.f7384b;
        if (displayMetrics2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics2 = null;
        }
        Intrinsics.checkNotNullParameter(displayMetrics2, "<this>");
        int i5 = Build.VERSION.SDK_INT;
        this.f7401u = i5 >= 34 ? TypedValue.applyDimension(2, 22.0f, displayMetrics2) : displayMetrics2.scaledDensity * 22.0f;
        DisplayMetrics displayMetrics3 = this.f7384b;
        if (displayMetrics3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
        } else {
            displayMetrics = displayMetrics3;
        }
        Intrinsics.checkNotNullParameter(displayMetrics, "<this>");
        this.f7402v = i5 >= 34 ? TypedValue.applyDimension(2, 16.0f, displayMetrics) : displayMetrics.scaledDensity * 16.0f;
        this.f7383a = Color.parseColor("#CBCBCB");
        float f10 = this.f7404x;
        float f11 = 16.0f * f10;
        this.f7388f = f11;
        this.f7389g = f11;
        this.f7390h = f11;
        this.f7391i = 0.0f * f10;
        this.j = f11;
        this.f7392k = 10.0f * f10;
        this.f7393l = f11;
        this.f7394m = f11;
        paint.setFilterBitmap(true);
        Typeface typeface = Typeface.DEFAULT;
        textPaint.setTypeface(typeface);
        textPaint.setColor(-1);
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        textPaint.setStyle(style);
        textPaint.setTextSize(this.f7401u);
        Paint.Align align = Paint.Align.CENTER;
        textPaint.setTextAlign(align);
        textPaint2.setTypeface(typeface);
        textPaint2.setColor(this.f7383a);
        textPaint2.setStyle(style);
        textPaint2.setTextSize(this.f7402v);
        textPaint2.setTextAlign(align);
    }

    public static StaticLayout d(EmptySectionFollowView emptySectionFollowView, CharSequence charSequence, int i5, TextPaint textPaint) {
        if (charSequence == null || charSequence.length() == 0 || StringsKt.H(charSequence) || i5 <= 5) {
            return null;
        }
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, Math.min(i5, (int) textPaint.measureText(charSequence.toString()))).setAlignment(Layout.Alignment.ALIGN_NORMAL).setIncludePad(true).setLineSpacing(0.0f, 1.0f).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setArimoRegularTypeface(Typeface typeface) {
        if (typeface == null || !Intrinsics.areEqual(this.f7403w, typeface)) {
            if (typeface == null) {
                typeface = Typeface.DEFAULT;
            }
            this.f7403w = typeface;
            this.f7385c.setTypeface(typeface);
            this.f7386d.setTypeface(this.f7403w);
        }
    }

    public final void b() {
        this.f7405y.setEmpty();
        this.f7406z.setEmpty();
        this.A.reset();
        this.B.setEmpty();
        this.C.setEmpty();
        this.f7399s = null;
        this.f7400t = null;
    }

    public final void c(int i5, int i10) {
        if (i5 <= 0 || i10 <= 0) {
            b();
            return;
        }
        float paddingStart = getPaddingStart() + 0.0f;
        float paddingTop = getPaddingTop() + 0.0f;
        float paddingEnd = (i5 - getPaddingEnd()) + 0.0f;
        float paddingBottom = (i10 - getPaddingBottom()) + 0.0f;
        float f6 = paddingEnd - paddingStart;
        if (paddingBottom - paddingTop <= 0.0f || f6 <= 0.0f) {
            b();
            return;
        }
        int i11 = (int) (f6 - (this.f7388f + this.f7390h));
        int i12 = (int) (f6 - (this.j + this.f7393l));
        StaticLayout d10 = d(this, this.q, i11, this.f7385c);
        StaticLayout d11 = d(this, this.f7398r, i12, this.f7386d);
        int height = d10 != null ? d10.getHeight() : 0;
        int height2 = d11 != null ? d11.getHeight() : 0;
        int width = d10 != null ? d10.getWidth() : 0;
        int width2 = d11 != null ? d11.getWidth() : 0;
        float abs = Math.abs((f6 - this.f7397p) / 2.0f) + paddingStart;
        float f10 = paddingTop + this.f7395n;
        float f11 = abs + this.f7397p;
        float f12 = f10 + this.f7396o;
        float f13 = f12 + this.f7389g;
        float f14 = height + f13;
        float f15 = ((i11 - width) / 2.0f) + this.f7388f + paddingStart;
        float f16 = width;
        float f17 = (f16 / 2.0f) + f15;
        float f18 = f16 + f17;
        float f19 = this.f7391i + f14 + this.f7392k;
        float f20 = ((i12 - width2) / 2.0f) + this.j + paddingStart;
        float f21 = width2;
        float f22 = (f21 / 2.0f) + f20;
        float f23 = f21 + f22;
        float f24 = height2 + f19;
        this.f7399s = d10;
        this.f7400t = d11;
        RectF rectF = this.B;
        if (f14 <= f13 || f18 <= f17) {
            rectF.setEmpty();
        } else {
            rectF.set(f17, f13, f18, f14);
        }
        RectF rectF2 = this.C;
        if (f24 <= f19 || f23 <= f22) {
            rectF2.setEmpty();
        } else {
            rectF2.set(f22, f19, f23, f24);
        }
        this.f7405y.set(paddingStart, paddingTop, paddingEnd, paddingBottom);
        Path path = this.A;
        path.rewind();
        path.addRect(abs, f10, f11, f12, Path.Direction.CW);
        this.f7406z.set(abs, f10, f11, f12);
        invalidate();
    }

    /* renamed from: getHeightIcon, reason: from getter */
    public final int getF7396o() {
        return this.f7396o;
    }

    /* renamed from: getWidthIcon, reason: from getter */
    public final int getF7397p() {
        return this.f7397p;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        c(getWidth(), getHeight());
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
        if (this.E) {
            c0.h(this.D.f18494a);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int save;
        Bitmap bitmap;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (this.f7405y.isEmpty()) {
            return;
        }
        if (!this.A.isEmpty() && (bitmap = this.F) != null) {
            save = canvas.save();
            RectF rectF = this.f7406z;
            canvas.clipRect(rectF);
            try {
                if (!bitmap.isRecycled()) {
                    canvas.translate(rectF.left, rectF.top);
                    canvas.drawBitmap(bitmap, this.G, this.f7387e);
                }
            } finally {
            }
        }
        StaticLayout staticLayout = this.f7399s;
        if (staticLayout != null) {
            RectF rectF2 = this.B;
            if (!rectF2.isEmpty()) {
                save = canvas.save();
                try {
                    canvas.translate(rectF2.left, rectF2.top);
                    staticLayout.draw(canvas);
                } finally {
                }
            }
        }
        StaticLayout staticLayout2 = this.f7400t;
        if (staticLayout2 != null) {
            RectF rectF3 = this.C;
            if (rectF3.isEmpty()) {
                return;
            }
            save = canvas.save();
            try {
                canvas.translate(rectF3.left, rectF3.top);
                staticLayout2.draw(canvas);
            } finally {
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i5, int i10) {
        Pair pair;
        super.onMeasure(i5, i10);
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        int paddingEnd = (mode == Integer.MIN_VALUE || mode == 1073741824) ? (int) (size - (((getPaddingEnd() + getPaddingStart()) + this.f7388f) + this.f7390h)) : Integer.MAX_VALUE;
        if (paddingEnd < 0) {
            paddingEnd = 0;
        }
        if (paddingEnd < 5) {
            pair = new Pair(0, 0);
        } else {
            StaticLayout d10 = d(this, this.q, paddingEnd, this.f7385c);
            StaticLayout d11 = d(this, this.f7398r, paddingEnd, this.f7386d);
            int max = (int) (Math.max(Math.max(this.f7388f + this.f7390h + (d10 != null ? d10.getWidth() : 0), this.j + this.f7393l + (d11 != null ? d11.getWidth() : 0)), this.f7397p) + getPaddingEnd() + getPaddingStart());
            int paddingBottom = (int) (getPaddingBottom() + getPaddingTop() + this.f7389g + this.f7391i + (d10 != null ? d10.getHeight() : 0) + this.f7392k + this.f7394m + (d11 != null ? d11.getHeight() : 0) + this.f7395n + this.f7396o);
            if (mode == Integer.MIN_VALUE) {
                if (max < 0) {
                    max = 0;
                }
                size = Math.min(max, size);
            } else if (mode != 1073741824) {
                size = max < 0 ? 0 : max;
            }
            if (mode2 == Integer.MIN_VALUE) {
                size2 = Math.min(paddingBottom >= 0 ? paddingBottom : 0, size2);
            } else if (mode2 != 1073741824) {
                size2 = paddingBottom >= 0 ? paddingBottom : 0;
            }
            pair = new Pair(Integer.valueOf(size), Integer.valueOf(size2));
        }
        int resolveSize = View.resolveSize(((Number) pair.f19192a).intValue(), i5);
        int resolveSize2 = View.resolveSize(((Number) pair.f19193b).intValue(), i10);
        setMeasuredDimension(resolveSize, resolveSize2);
        c(resolveSize, resolveSize2);
    }

    public final void setBitmap(@Nullable Bitmap bitmap) {
        if (bitmap == null) {
            this.F = null;
            return;
        }
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        if (width > 100.0f && height > 100.0f) {
            float f6 = this.f7397p;
            float f10 = this.f7396o;
            float max = Math.max(f6 / width, f10 / height);
            float f11 = f6 - (width * max);
            float f12 = 2;
            float f13 = f11 / f12;
            float f14 = (f10 - (height * max)) / f12;
            Matrix matrix = this.G;
            matrix.setScale(max, max);
            matrix.postTranslate(f13, f14);
            if (!bitmap.isRecycled()) {
                this.F = bitmap;
            }
        }
        invalidate();
    }
}
