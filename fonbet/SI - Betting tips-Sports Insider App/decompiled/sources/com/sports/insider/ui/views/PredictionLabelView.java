package com.sports.insider.ui.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
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
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/sports/insider/ui/views/PredictionLabelView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/graphics/Typeface;", "typeface", "", "setArimoBoldTypeface", "(Landroid/graphics/Typeface;)V", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPredictionLabelView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PredictionLabelView.kt\ncom/sports/insider/ui/views/PredictionLabelView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Canvas.kt\nandroidx/core/graphics/CanvasKt\n*L\n1#1,241:1\n1#2:242\n27#3,7:243\n*S KotlinDebug\n*F\n+ 1 PredictionLabelView.kt\ncom/sports/insider/ui/views/PredictionLabelView\n*L\n158#1:243,7\n*E\n"})
/* loaded from: classes.dex */
public final class PredictionLabelView extends View {

    /* renamed from: a, reason: collision with root package name */
    public String f7793a;

    /* renamed from: b, reason: collision with root package name */
    public final float f7794b;

    /* renamed from: c, reason: collision with root package name */
    public final TextPaint f7795c;

    /* renamed from: d, reason: collision with root package name */
    public final d f7796d;

    /* renamed from: e, reason: collision with root package name */
    public Typeface f7797e;

    /* renamed from: f, reason: collision with root package name */
    public final RectF f7798f;

    /* renamed from: g, reason: collision with root package name */
    public final RectF f7799g;

    /* renamed from: h, reason: collision with root package name */
    public StaticLayout f7800h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f7801i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PredictionLabelView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f7793a = "Prediction";
        this.f7794b = 27.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f7795c = textPaint;
        e eVar = m0.f9201a;
        this.f7796d = c0.b(q.f18523a);
        this.f7798f = new RectF();
        this.f7799g = new RectF();
        DisplayMetrics b10 = a.b(context, "getDisplayMetrics(...)");
        if (b10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            b10 = null;
        }
        float f6 = b10.density;
        this.f7794b *= f6 <= 0.0f ? 1.0f : f6;
        textPaint.setColor(-16777216);
        textPaint.setTypeface(Typeface.DEFAULT_BOLD);
        textPaint.setTextSize(this.f7794b);
        textPaint.setTextAlign(Paint.Align.CENTER);
    }

    public static StaticLayout c(CharSequence charSequence, TextPaint textPaint, int i5) {
        if (charSequence == null || charSequence.length() == 0 || StringsKt.H(charSequence) || i5 <= 5) {
            return null;
        }
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, Math.min(i5, (int) textPaint.measureText(charSequence.toString()))).setAlignment(Layout.Alignment.ALIGN_NORMAL).setIncludePad(true).setLineSpacing(0.0f, 1.0f).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setArimoBoldTypeface(Typeface typeface) {
        if (typeface == null || !Intrinsics.areEqual(this.f7797e, typeface)) {
            if (typeface == null) {
                typeface = Typeface.DEFAULT_BOLD;
            }
            this.f7797e = typeface;
            this.f7795c.setTypeface(typeface);
        }
    }

    public final void b(int i5, int i10) {
        RectF rectF = this.f7799g;
        RectF rectF2 = this.f7798f;
        if (i5 <= 0 || i10 <= 0) {
            rectF2.setEmpty();
            rectF.setEmpty();
            this.f7800h = null;
            return;
        }
        float paddingStart = getPaddingStart() + 0.0f;
        float paddingTop = getPaddingTop() + 0.0f;
        float paddingEnd = (i5 - getPaddingEnd()) + 0.0f;
        float paddingBottom = (i10 - getPaddingBottom()) + 0.0f;
        float f6 = paddingEnd - paddingStart;
        float f10 = (f6 / 2.0f) + paddingStart;
        if (paddingBottom - paddingTop <= 0.0f || f6 <= 0.0f) {
            rectF2.setEmpty();
            rectF.setEmpty();
            this.f7800h = null;
            return;
        }
        StaticLayout c2 = c(this.f7793a, this.f7795c, (int) f6);
        this.f7800h = c2;
        float width = (c2 != null ? c2.getWidth() : 0) + f10;
        StaticLayout staticLayout = this.f7800h;
        int height = staticLayout != null ? staticLayout.getHeight() : 0;
        rectF2.set(paddingStart, paddingTop, paddingEnd, paddingBottom);
        rectF.set(f10, paddingTop, width, height + paddingTop);
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
        this.f7798f.setEmpty();
        this.f7799g.setEmpty();
        this.f7800h = null;
        if (this.f7801i) {
            c0.h(this.f7796d.f18494a);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (this.f7798f.isEmpty()) {
            return;
        }
        RectF rectF = this.f7799g;
        if (rectF.isEmpty()) {
            return;
        }
        int save = canvas.save();
        try {
            canvas.translate(rectF.left, rectF.top);
            StaticLayout staticLayout = this.f7800h;
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
        float paddingEnd = getPaddingEnd() + getPaddingStart();
        float paddingBottom = getPaddingBottom() + getPaddingTop();
        StaticLayout c2 = c(this.f7793a, this.f7795c, (int) (((mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE) - paddingEnd));
        this.f7800h = c2;
        int width = (int) (paddingEnd + (c2 != null ? c2.getWidth() : 0));
        int height = (int) (paddingBottom + (this.f7800h != null ? r6.getHeight() : 0));
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
}
