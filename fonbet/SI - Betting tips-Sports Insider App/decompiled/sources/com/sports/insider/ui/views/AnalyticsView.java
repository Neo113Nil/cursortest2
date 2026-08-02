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
import com.sports.insider.data.repository.room.news.NewsTable;
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
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0015\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/sports/insider/ui/views/AnalyticsView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/graphics/Typeface;", "typeface", "", "setArimoBoldTypeface", "(Landroid/graphics/Typeface;)V", "setArimoRegularTypeface", "", NewsTable.TEXT_COLUMN, "setText", "(Ljava/lang/String;)V", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAnalyticsView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnalyticsView.kt\ncom/sports/insider/ui/views/AnalyticsView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Color.kt\nandroidx/core/graphics/ColorKt\n+ 4 Canvas.kt\nandroidx/core/graphics/CanvasKt\n*L\n1#1,358:1\n1#2:359\n404#3:360\n27#4,7:361\n27#4,7:368\n*S KotlinDebug\n*F\n+ 1 AnalyticsView.kt\ncom/sports/insider/ui/views/AnalyticsView\n*L\n98#1:360\n342#1:361,7\n350#1:368,7\n*E\n"})
/* loaded from: classes.dex */
public final class AnalyticsView extends View {

    /* renamed from: a, reason: collision with root package name */
    public final int f7105a;

    /* renamed from: b, reason: collision with root package name */
    public final DisplayMetrics f7106b;

    /* renamed from: c, reason: collision with root package name */
    public final TextPaint f7107c;

    /* renamed from: d, reason: collision with root package name */
    public final TextPaint f7108d;

    /* renamed from: e, reason: collision with root package name */
    public final float f7109e;

    /* renamed from: f, reason: collision with root package name */
    public final float f7110f;

    /* renamed from: g, reason: collision with root package name */
    public final float f7111g;

    /* renamed from: h, reason: collision with root package name */
    public final float f7112h;

    /* renamed from: i, reason: collision with root package name */
    public String f7113i;
    public String j;

    /* renamed from: k, reason: collision with root package name */
    public StaticLayout f7114k;

    /* renamed from: l, reason: collision with root package name */
    public StaticLayout f7115l;

    /* renamed from: m, reason: collision with root package name */
    public final float f7116m;

    /* renamed from: n, reason: collision with root package name */
    public final float f7117n;

    /* renamed from: o, reason: collision with root package name */
    public Typeface f7118o;

    /* renamed from: p, reason: collision with root package name */
    public Typeface f7119p;
    public final float q;

    /* renamed from: r, reason: collision with root package name */
    public final RectF f7120r;

    /* renamed from: s, reason: collision with root package name */
    public final RectF f7121s;

    /* renamed from: t, reason: collision with root package name */
    public final RectF f7122t;

    /* renamed from: u, reason: collision with root package name */
    public final d f7123u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f7124v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalyticsView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        TextPaint textPaint = new TextPaint(1);
        this.f7107c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f7108d = textPaint2;
        this.f7109e = 0.0f;
        this.f7110f = 16.0f;
        this.f7111g = 0.0f;
        this.f7112h = 0.0f;
        this.f7113i = "Analytics";
        this.j = "Analytics and statistics";
        this.f7116m = 27.0f;
        this.f7117n = 20.0f;
        this.q = 1.0f;
        this.f7120r = new RectF();
        this.f7121s = new RectF();
        this.f7122t = new RectF();
        e eVar = m0.f9201a;
        this.f7123u = c0.b(q.f18523a);
        DisplayMetrics b10 = a.b(context, "getDisplayMetrics(...)");
        this.f7106b = b10;
        DisplayMetrics displayMetrics = null;
        if (b10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            b10 = null;
        }
        float f6 = b10.density;
        this.q = f6 > 0.0f ? f6 : 1.0f;
        DisplayMetrics displayMetrics2 = this.f7106b;
        if (displayMetrics2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics2 = null;
        }
        Intrinsics.checkNotNullParameter(displayMetrics2, "<this>");
        int i5 = Build.VERSION.SDK_INT;
        this.f7116m = i5 >= 34 ? TypedValue.applyDimension(2, 27.0f, displayMetrics2) : displayMetrics2.scaledDensity * 27.0f;
        DisplayMetrics displayMetrics3 = this.f7106b;
        if (displayMetrics3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
        } else {
            displayMetrics = displayMetrics3;
        }
        Intrinsics.checkNotNullParameter(displayMetrics, "<this>");
        this.f7117n = i5 >= 34 ? TypedValue.applyDimension(2, 20.0f, displayMetrics) : displayMetrics.scaledDensity * 20.0f;
        this.f7105a = Color.parseColor("#242424");
        float f10 = this.q;
        float f11 = 0.0f * f10;
        this.f7109e = f11;
        this.f7110f = 16.0f * f10;
        this.f7111g = f11;
        this.f7112h = f11;
        textPaint.setTypeface(Typeface.DEFAULT_BOLD);
        textPaint.setColor(-16777216);
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        textPaint.setStyle(style);
        textPaint.setTextSize(this.f7116m);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint2.setTypeface(Typeface.DEFAULT);
        textPaint2.setColor(this.f7105a);
        textPaint2.setStyle(style);
        textPaint2.setTextSize(this.f7117n);
    }

    public static StaticLayout e(AnalyticsView analyticsView, CharSequence charSequence, int i5, TextPaint textPaint) {
        if (charSequence == null || charSequence.length() == 0 || StringsKt.H(charSequence) || i5 <= 5) {
            return null;
        }
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, Math.min(i5, (int) textPaint.measureText(charSequence.toString()))).setAlignment(Layout.Alignment.ALIGN_NORMAL).setIncludePad(true).setLineSpacing(0.0f, 1.0f).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setArimoBoldTypeface(Typeface typeface) {
        if (typeface == null || !Intrinsics.areEqual(this.f7118o, typeface)) {
            if (typeface == null) {
                typeface = Typeface.DEFAULT_BOLD;
            }
            this.f7118o = typeface;
            this.f7107c.setTypeface(typeface);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setArimoRegularTypeface(Typeface typeface) {
        if (typeface == null || !Intrinsics.areEqual(this.f7119p, typeface)) {
            if (typeface == null) {
                typeface = Typeface.DEFAULT;
            }
            this.f7119p = typeface;
            this.f7108d.setTypeface(typeface);
        }
    }

    public final void c() {
        this.f7120r.setEmpty();
        this.f7121s.setEmpty();
        this.f7122t.setEmpty();
        this.f7114k = null;
        this.f7115l = null;
    }

    public final void d(int i5, int i10) {
        if (i5 <= 0 || i10 <= 0) {
            c();
            return;
        }
        float paddingStart = getPaddingStart() + 0.0f;
        float paddingTop = getPaddingTop() + 0.0f;
        float paddingEnd = (i5 - getPaddingEnd()) + 0.0f;
        float paddingBottom = (i10 - getPaddingBottom()) + 0.0f;
        float f6 = paddingEnd - paddingStart;
        if (paddingBottom - paddingTop <= 0.0f || f6 <= 0.0f) {
            c();
            return;
        }
        int i11 = (int) (f6 - (this.f7109e + this.f7111g));
        StaticLayout e7 = e(this, this.f7113i, i11, this.f7107c);
        StaticLayout e9 = e(this, this.j, i11, this.f7108d);
        int height = e7 != null ? e7.getHeight() : 0;
        int height2 = e9 != null ? e9.getHeight() : 0;
        int width = e7 != null ? e7.getWidth() : 0;
        float f10 = this.f7110f;
        float f11 = paddingTop + f10;
        float f12 = height + f11;
        float f13 = this.f7109e + paddingStart;
        float f14 = ((i11 - width) / 2.0f) + f13;
        float f15 = width;
        float f16 = (f15 / 2.0f) + f14;
        float f17 = f15 + f16;
        float f18 = this.f7112h + f12 + f10;
        float f19 = paddingEnd - this.f7111g;
        float f20 = height2 + f18;
        this.f7114k = e7;
        this.f7115l = e9;
        RectF rectF = this.f7121s;
        if (f12 <= f11 || f17 <= f16) {
            rectF.setEmpty();
        } else {
            rectF.set(f16, f11, f17, f12);
        }
        RectF rectF2 = this.f7122t;
        if (f20 <= f18 || f19 <= f13) {
            rectF2.setEmpty();
        } else {
            rectF2.set(f13, f18, f19, f20);
        }
        this.f7120r.set(paddingStart, paddingTop, paddingEnd, paddingBottom);
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
        c();
        if (this.f7124v) {
            c0.h(this.f7123u.f18494a);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int save;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (this.f7120r.isEmpty()) {
            return;
        }
        StaticLayout staticLayout = this.f7114k;
        if (staticLayout != null) {
            RectF rectF = this.f7121s;
            if (!rectF.isEmpty()) {
                save = canvas.save();
                try {
                    canvas.translate(rectF.left, rectF.top);
                    staticLayout.draw(canvas);
                } finally {
                }
            }
        }
        StaticLayout staticLayout2 = this.f7115l;
        if (staticLayout2 != null) {
            RectF rectF2 = this.f7122t;
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
        int paddingEnd = (mode == Integer.MIN_VALUE || mode == 1073741824) ? (int) (size - (((getPaddingEnd() + getPaddingStart()) + this.f7109e) + this.f7111g)) : Integer.MAX_VALUE;
        if (paddingEnd < 0) {
            paddingEnd = 0;
        }
        if (paddingEnd < 5) {
            pair = new Pair(0, 0);
        } else {
            StaticLayout e7 = e(this, this.f7113i, paddingEnd, this.f7107c);
            StaticLayout e9 = e(this, this.j, paddingEnd, this.f7108d);
            int max = (int) (Math.max(this.f7109e + this.f7111g + (e7 != null ? e7.getWidth() : 0), this.f7109e + this.f7111g + (e9 != null ? e9.getWidth() : 0)) + getPaddingEnd() + getPaddingStart());
            int paddingBottom = (int) ((this.f7112h * 2.0f) + (this.f7110f * 2.0f) + getPaddingBottom() + getPaddingTop() + (e7 != null ? e7.getHeight() : 0) + (e9 != null ? e9.getHeight() : 0));
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
        d(resolveSize, resolveSize2);
    }

    public final void setText(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.j = text;
        requestLayout();
        invalidate();
    }
}
