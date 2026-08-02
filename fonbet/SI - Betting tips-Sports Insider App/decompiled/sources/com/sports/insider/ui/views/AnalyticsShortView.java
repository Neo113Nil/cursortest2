package com.sports.insider.ui.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import com.sports.insider.data.repository.room.news.NewsTable;
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
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/sports/insider/ui/views/AnalyticsShortView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/graphics/Typeface;", "typeface", "", "setArimoRegularTypeface", "(Landroid/graphics/Typeface;)V", "", NewsTable.TEXT_COLUMN, "setText", "(Ljava/lang/String;)V", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAnalyticsShortView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnalyticsShortView.kt\ncom/sports/insider/ui/views/AnalyticsShortView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Color.kt\nandroidx/core/graphics/ColorKt\n+ 4 Canvas.kt\nandroidx/core/graphics/CanvasKt\n*L\n1#1,267:1\n1#2:268\n404#3:269\n27#4,7:270\n*S KotlinDebug\n*F\n+ 1 AnalyticsShortView.kt\ncom/sports/insider/ui/views/AnalyticsShortView\n*L\n81#1:269\n182#1:270,7\n*E\n"})
/* loaded from: classes.dex */
public final class AnalyticsShortView extends View {

    /* renamed from: a, reason: collision with root package name */
    public String f7091a;

    /* renamed from: b, reason: collision with root package name */
    public final float f7092b;

    /* renamed from: c, reason: collision with root package name */
    public final TextPaint f7093c;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f7094d;

    /* renamed from: e, reason: collision with root package name */
    public final d f7095e;

    /* renamed from: f, reason: collision with root package name */
    public Typeface f7096f;

    /* renamed from: g, reason: collision with root package name */
    public final RectF f7097g;

    /* renamed from: h, reason: collision with root package name */
    public final RectF f7098h;

    /* renamed from: i, reason: collision with root package name */
    public final float f7099i;
    public final float j;

    /* renamed from: k, reason: collision with root package name */
    public final float f7100k;

    /* renamed from: l, reason: collision with root package name */
    public final float f7101l;

    /* renamed from: m, reason: collision with root package name */
    public final float f7102m;

    /* renamed from: n, reason: collision with root package name */
    public StaticLayout f7103n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f7104o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalyticsShortView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f7091a = "";
        this.f7092b = 20.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f7093c = textPaint;
        Paint paint = new Paint(1);
        this.f7094d = paint;
        e eVar = m0.f9201a;
        this.f7095e = c0.b(q.f18523a);
        this.f7097g = new RectF();
        this.f7098h = new RectF();
        this.f7099i = 20.0f;
        this.j = 16.0f;
        this.f7100k = 16.0f;
        this.f7101l = 19.0f;
        this.f7102m = 16.0f;
        DisplayMetrics b10 = a.b(context, "getDisplayMetrics(...)");
        if (b10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            b10 = null;
        }
        float f6 = b10.density;
        f6 = f6 <= 0.0f ? 1.0f : f6;
        this.f7099i *= f6;
        this.j *= f6;
        this.f7100k *= f6;
        this.f7101l *= f6;
        this.f7102m *= f6;
        this.f7092b *= f6;
        textPaint.setColor(Color.parseColor("#242424"));
        textPaint.setTypeface(Typeface.DEFAULT);
        textPaint.setTextSize(this.f7092b);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
    }

    public static StaticLayout c(CharSequence charSequence, TextPaint textPaint, int i5) {
        if (charSequence == null || charSequence.length() == 0 || StringsKt.H(charSequence) || i5 <= 5) {
            return null;
        }
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, Math.min(i5, (int) textPaint.measureText(charSequence.toString()))).setAlignment(Layout.Alignment.ALIGN_NORMAL).setIncludePad(false).setLineSpacing(0.0f, 1.0f).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setArimoRegularTypeface(Typeface typeface) {
        if (typeface == null || !Intrinsics.areEqual(this.f7096f, typeface)) {
            if (typeface == null) {
                typeface = Typeface.DEFAULT;
            }
            this.f7096f = typeface;
            this.f7093c.setTypeface(typeface);
        }
    }

    public final void b(int i5, int i10) {
        RectF rectF = this.f7097g;
        RectF rectF2 = this.f7098h;
        if (i5 <= 0 || i10 <= 0) {
            rectF.setEmpty();
            rectF2.setEmpty();
            this.f7103n = null;
            return;
        }
        float paddingStart = getPaddingStart() + 0.0f;
        float paddingTop = getPaddingTop() + 0.0f;
        float paddingEnd = (i5 - getPaddingEnd()) + 0.0f;
        float paddingBottom = (i10 - getPaddingBottom()) + 0.0f;
        float f6 = paddingEnd - paddingStart;
        float f10 = paddingBottom - paddingTop;
        if (f10 <= 0.0f || f6 <= 0.0f) {
            rectF.setEmpty();
            rectF2.setEmpty();
            this.f7103n = null;
            return;
        }
        if (f10 >= getPaddingBottom() + getPaddingTop() + this.f7100k + this.f7102m) {
            float paddingEnd2 = getPaddingEnd() + getPaddingStart();
            float f11 = this.j;
            float f12 = this.f7101l;
            if (f6 >= paddingEnd2 + f11 + f12) {
                StaticLayout c2 = c(this.f7091a, this.f7093c, (int) (f6 - (f11 + f12)));
                this.f7103n = c2;
                float f13 = this.f7100k + paddingTop;
                float f14 = this.j + paddingStart;
                float f15 = paddingEnd - this.f7101l;
                float height = ((((paddingBottom - this.f7102m) - f13) - (c2 != null ? c2.getHeight() : 0)) / 2.0f) + f13;
                rectF2.set(f14, height, f15, (this.f7103n != null ? r0.getHeight() : 0) + height);
            }
        }
        rectF.set(paddingStart, paddingTop, paddingEnd, paddingBottom);
        invalidate();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        b(getWidth(), getHeight());
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f7097g.setEmpty();
        this.f7098h.setEmpty();
        this.f7103n = null;
        if (this.f7104o) {
            c0.h(this.f7095e.f18494a);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        RectF rectF = this.f7097g;
        if (rectF.isEmpty()) {
            return;
        }
        float f6 = this.f7099i;
        canvas.drawRoundRect(rectF, f6, f6, this.f7094d);
        RectF rectF2 = this.f7098h;
        if (rectF2.isEmpty()) {
            return;
        }
        int save = canvas.save();
        try {
            canvas.translate(rectF2.left, rectF2.top);
            StaticLayout staticLayout = this.f7103n;
            if (staticLayout != null) {
                staticLayout.draw(canvas);
            }
        } finally {
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i5, int i10) {
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        float paddingEnd = getPaddingEnd() + getPaddingStart() + this.j + this.f7101l;
        float paddingBottom = getPaddingBottom() + getPaddingTop() + this.f7100k + this.f7102m;
        StaticLayout c2 = c(this.f7091a, this.f7093c, (int) (((mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE) - paddingEnd));
        this.f7103n = c2;
        int width = (int) (paddingEnd + (c2 != null ? c2.getWidth() : 0));
        int height = (int) (paddingBottom + (this.f7103n != null ? r6.getHeight() : 0));
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
        setMeasuredDimension(size, size2);
        b(size, size2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i5, int i10, int i11, int i12) {
        super.onSizeChanged(i5, i10, i11, i12);
        if (i5 <= 0 || i10 <= 0) {
            return;
        }
        if (i11 == i5 && i12 == i10) {
            invalidate();
        } else {
            b(i5, i10);
        }
    }

    public final void setText(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f7091a = text;
        requestLayout();
        invalidate();
    }
}
