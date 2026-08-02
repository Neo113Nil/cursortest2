package com.sports.insider.ui.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
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
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/sports/insider/ui/views/EmptySectionView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/graphics/Typeface;", "typeface", "", "setArimoRegularTypeface", "(Landroid/graphics/Typeface;)V", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEmptySectionView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmptySectionView.kt\ncom/sports/insider/ui/views/EmptySectionView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Color.kt\nandroidx/core/graphics/ColorKt\n+ 4 Canvas.kt\nandroidx/core/graphics/CanvasKt\n*L\n1#1,358:1\n1#2:359\n404#3:360\n27#4,7:361\n27#4,7:368\n*S KotlinDebug\n*F\n+ 1 EmptySectionView.kt\ncom/sports/insider/ui/views/EmptySectionView\n*L\n106#1:360\n342#1:361,7\n350#1:368,7\n*E\n"})
/* loaded from: classes.dex */
public final class EmptySectionView extends View {

    /* renamed from: a, reason: collision with root package name */
    public final int f7407a;

    /* renamed from: b, reason: collision with root package name */
    public final DisplayMetrics f7408b;

    /* renamed from: c, reason: collision with root package name */
    public final TextPaint f7409c;

    /* renamed from: d, reason: collision with root package name */
    public final TextPaint f7410d;

    /* renamed from: e, reason: collision with root package name */
    public final float f7411e;

    /* renamed from: f, reason: collision with root package name */
    public final float f7412f;

    /* renamed from: g, reason: collision with root package name */
    public final float f7413g;

    /* renamed from: h, reason: collision with root package name */
    public final float f7414h;

    /* renamed from: i, reason: collision with root package name */
    public final float f7415i;
    public final float j;

    /* renamed from: k, reason: collision with root package name */
    public final float f7416k;

    /* renamed from: l, reason: collision with root package name */
    public final float f7417l;

    /* renamed from: m, reason: collision with root package name */
    public String f7418m;

    /* renamed from: n, reason: collision with root package name */
    public String f7419n;

    /* renamed from: o, reason: collision with root package name */
    public StaticLayout f7420o;

    /* renamed from: p, reason: collision with root package name */
    public StaticLayout f7421p;
    public final float q;

    /* renamed from: r, reason: collision with root package name */
    public final float f7422r;

    /* renamed from: s, reason: collision with root package name */
    public Typeface f7423s;

    /* renamed from: t, reason: collision with root package name */
    public final float f7424t;

    /* renamed from: u, reason: collision with root package name */
    public final RectF f7425u;

    /* renamed from: v, reason: collision with root package name */
    public final RectF f7426v;

    /* renamed from: w, reason: collision with root package name */
    public final RectF f7427w;

    /* renamed from: x, reason: collision with root package name */
    public final d f7428x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f7429y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmptySectionView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        TextPaint textPaint = new TextPaint(1);
        this.f7409c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f7410d = textPaint2;
        this.f7411e = 16.0f;
        this.f7412f = 16.0f;
        this.f7413g = 16.0f;
        this.f7414h = 0.0f;
        this.f7415i = 16.0f;
        this.j = 10.0f;
        this.f7416k = 16.0f;
        this.f7417l = 16.0f;
        this.f7418m = "Empty section";
        this.f7419n = "We have already begun to prepare forecasts for this sport, and soon they will be published. Now we suggest you to choose the category \"All sports\" and get acquainted with the available forecasts.";
        this.q = 22.0f;
        this.f7422r = 16.0f;
        this.f7424t = 1.0f;
        this.f7425u = new RectF();
        this.f7426v = new RectF();
        this.f7427w = new RectF();
        e eVar = m0.f9201a;
        this.f7428x = c0.b(q.f18523a);
        DisplayMetrics b10 = a.b(context, "getDisplayMetrics(...)");
        this.f7408b = b10;
        DisplayMetrics displayMetrics = null;
        if (b10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            b10 = null;
        }
        float f6 = b10.density;
        this.f7424t = f6 > 0.0f ? f6 : 1.0f;
        DisplayMetrics displayMetrics2 = this.f7408b;
        if (displayMetrics2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics2 = null;
        }
        Intrinsics.checkNotNullParameter(displayMetrics2, "<this>");
        int i5 = Build.VERSION.SDK_INT;
        this.q = i5 >= 34 ? TypedValue.applyDimension(2, 22.0f, displayMetrics2) : displayMetrics2.scaledDensity * 22.0f;
        DisplayMetrics displayMetrics3 = this.f7408b;
        if (displayMetrics3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
        } else {
            displayMetrics = displayMetrics3;
        }
        Intrinsics.checkNotNullParameter(displayMetrics, "<this>");
        this.f7422r = i5 >= 34 ? TypedValue.applyDimension(2, 16.0f, displayMetrics) : displayMetrics.scaledDensity * 16.0f;
        this.f7407a = Color.parseColor("#CBCBCB");
        float f10 = this.f7424t;
        float f11 = 16.0f * f10;
        this.f7411e = f11;
        this.f7412f = f11;
        this.f7413g = f11;
        this.f7414h = 0.0f * f10;
        this.f7415i = f11;
        this.j = 10.0f * f10;
        this.f7416k = f11;
        this.f7417l = f11;
        Typeface typeface = Typeface.DEFAULT;
        textPaint.setTypeface(typeface);
        textPaint.setColor(-1);
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        textPaint.setStyle(style);
        textPaint.setTextSize(this.q);
        Paint.Align align = Paint.Align.CENTER;
        textPaint.setTextAlign(align);
        textPaint2.setTypeface(typeface);
        textPaint2.setColor(this.f7407a);
        textPaint2.setStyle(style);
        textPaint2.setTextSize(this.f7422r);
        textPaint2.setTextAlign(align);
    }

    public static StaticLayout d(EmptySectionView emptySectionView, CharSequence charSequence, int i5, TextPaint textPaint) {
        if (charSequence == null || charSequence.length() == 0 || StringsKt.H(charSequence) || i5 <= 5) {
            return null;
        }
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, Math.min(i5, (int) textPaint.measureText(charSequence.toString()))).setAlignment(Layout.Alignment.ALIGN_NORMAL).setIncludePad(true).setLineSpacing(0.0f, 1.0f).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setArimoRegularTypeface(Typeface typeface) {
        if (typeface == null || !Intrinsics.areEqual(this.f7423s, typeface)) {
            if (typeface == null) {
                typeface = Typeface.DEFAULT;
            }
            this.f7423s = typeface;
            this.f7409c.setTypeface(typeface);
            this.f7410d.setTypeface(this.f7423s);
        }
    }

    public final void b() {
        this.f7425u.setEmpty();
        this.f7426v.setEmpty();
        this.f7427w.setEmpty();
        this.f7420o = null;
        this.f7421p = null;
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
        int i11 = (int) (f6 - (this.f7411e + this.f7413g));
        int i12 = (int) (f6 - (this.f7415i + this.f7416k));
        StaticLayout d10 = d(this, this.f7418m, i11, this.f7409c);
        StaticLayout d11 = d(this, this.f7419n, i12, this.f7410d);
        int height = d10 != null ? d10.getHeight() : 0;
        int height2 = d11 != null ? d11.getHeight() : 0;
        int width = d10 != null ? d10.getWidth() : 0;
        int width2 = d11 != null ? d11.getWidth() : 0;
        float f10 = this.f7412f + paddingTop;
        float f11 = height + f10;
        float f12 = ((i11 - width) / 2.0f) + this.f7411e + paddingStart;
        float f13 = width;
        float f14 = (f13 / 2.0f) + f12;
        float f15 = f13 + f14;
        float f16 = this.f7414h + f11 + this.j;
        float f17 = ((i12 - width2) / 2.0f) + this.f7415i + paddingStart;
        float f18 = width2;
        float f19 = (f18 / 2.0f) + f17;
        float f20 = f18 + f19;
        float f21 = height2 + f16;
        this.f7420o = d10;
        this.f7421p = d11;
        RectF rectF = this.f7426v;
        if (f11 <= f10 || f15 <= f14) {
            rectF.setEmpty();
        } else {
            rectF.set(f14, f10, f15, f11);
        }
        RectF rectF2 = this.f7427w;
        if (f21 <= f16 || f20 <= f19) {
            rectF2.setEmpty();
        } else {
            rectF2.set(f19, f16, f20, f21);
        }
        this.f7425u.set(paddingStart, paddingTop, paddingEnd, paddingBottom);
        invalidate();
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
        if (this.f7429y) {
            c0.h(this.f7428x.f18494a);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int save;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (this.f7425u.isEmpty()) {
            return;
        }
        StaticLayout staticLayout = this.f7420o;
        if (staticLayout != null) {
            RectF rectF = this.f7426v;
            if (!rectF.isEmpty()) {
                save = canvas.save();
                try {
                    canvas.translate(rectF.left, rectF.top);
                    staticLayout.draw(canvas);
                } finally {
                }
            }
        }
        StaticLayout staticLayout2 = this.f7421p;
        if (staticLayout2 != null) {
            RectF rectF2 = this.f7427w;
            if (rectF2.isEmpty()) {
                return;
            }
            save = canvas.save();
            try {
                canvas.translate(rectF2.left, rectF2.top);
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
        int paddingEnd = (mode == Integer.MIN_VALUE || mode == 1073741824) ? (int) (size - (((getPaddingEnd() + getPaddingStart()) + this.f7411e) + this.f7413g)) : Integer.MAX_VALUE;
        if (paddingEnd < 0) {
            paddingEnd = 0;
        }
        if (paddingEnd < 5) {
            pair = new Pair(0, 0);
        } else {
            StaticLayout d10 = d(this, this.f7418m, paddingEnd, this.f7409c);
            StaticLayout d11 = d(this, this.f7419n, paddingEnd, this.f7410d);
            int max = (int) (Math.max(this.f7411e + this.f7413g + (d10 != null ? d10.getWidth() : 0), this.f7415i + this.f7416k + (d11 != null ? d11.getWidth() : 0)) + getPaddingEnd() + getPaddingStart());
            int paddingBottom = (int) (getPaddingBottom() + getPaddingTop() + this.f7412f + this.f7414h + (d10 != null ? d10.getHeight() : 0) + this.j + this.f7417l + (d11 != null ? d11.getHeight() : 0));
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
}
