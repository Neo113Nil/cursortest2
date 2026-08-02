package com.sports.insider.ui.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yg.a;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/sports/insider/ui/views/LineDivGradientView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLineDivGradientView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LineDivGradientView.kt\ncom/sports/insider/ui/views/LineDivGradientView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Color.kt\nandroidx/core/graphics/ColorKt\n+ 4 Canvas.kt\nandroidx/core/graphics/CanvasKt\n*L\n1#1,198:1\n1#2:199\n404#3:200\n404#3:201\n135#4,8:202\n*S KotlinDebug\n*F\n+ 1 LineDivGradientView.kt\ncom/sports/insider/ui/views/LineDivGradientView\n*L\n64#1:200\n65#1:201\n190#1:202,8\n*E\n"})
/* loaded from: classes.dex */
public final class LineDivGradientView extends View {

    /* renamed from: a, reason: collision with root package name */
    public final float f7580a;

    /* renamed from: b, reason: collision with root package name */
    public final float f7581b;

    /* renamed from: c, reason: collision with root package name */
    public final float f7582c;

    /* renamed from: d, reason: collision with root package name */
    public LinearGradient f7583d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f7584e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f7585f;

    /* renamed from: g, reason: collision with root package name */
    public final RectF f7586g;

    /* renamed from: h, reason: collision with root package name */
    public final RectF f7587h;

    /* renamed from: i, reason: collision with root package name */
    public float f7588i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final int f7589k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LineDivGradientView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f7580a = 1.5f;
        this.f7581b = 1.0f;
        this.f7582c = 1.0f;
        int[] iArr = new int[2];
        for (int i5 = 0; i5 < 2; i5++) {
            iArr[i5] = -1;
        }
        this.f7584e = iArr;
        Paint paint = new Paint(1);
        this.f7585f = paint;
        this.f7586g = new RectF();
        this.f7587h = new RectF();
        DisplayMetrics b10 = a.b(context, "getDisplayMetrics(...)");
        if (b10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            b10 = null;
        }
        float f6 = b10.density;
        this.f7582c = f6 <= 0.0f ? this.f7581b : f6;
        this.j = Color.parseColor("#03F39E");
        int parseColor = Color.parseColor("#40007E");
        this.f7589k = parseColor;
        this.f7580a *= this.f7582c;
        iArr[0] = parseColor;
        iArr[1] = this.j;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(this.f7589k);
        paint.setDither(true);
        paint.setStrokeWidth(this.f7580a);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    public final void a(int i5, int i10) {
        RectF rectF = this.f7586g;
        RectF rectF2 = this.f7587h;
        if (i5 <= 0 || i10 <= 0) {
            rectF.setEmpty();
            rectF2.setEmpty();
            this.f7588i = 0.0f;
            return;
        }
        float paddingStart = getPaddingStart() + 0.0f;
        float paddingTop = getPaddingTop() + 0.0f;
        float paddingEnd = (i5 - getPaddingEnd()) + 0.0f;
        float paddingBottom = (i10 - getPaddingBottom()) + 0.0f;
        float f6 = paddingEnd - paddingStart;
        float f10 = paddingBottom - paddingTop;
        float f11 = (f10 / 2.0f) + paddingTop;
        if (f10 <= 0.0f || f6 <= 0.0f) {
            rectF.setEmpty();
            rectF2.setEmpty();
            this.f7588i = 0.0f;
            return;
        }
        this.f7588i = f11;
        float f12 = (this.f7580a + 0.1f) / 2.0f;
        rectF2.set(f12 + paddingStart, paddingTop, paddingEnd - f12, paddingBottom);
        rectF.set(paddingStart, paddingTop, paddingEnd, paddingBottom);
        this.f7583d = new LinearGradient(paddingStart, f11, paddingEnd, f11, this.f7584e, (float[]) null, Shader.TileMode.CLAMP);
        invalidate();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        a(getWidth(), getHeight());
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f7586g.setEmpty();
        this.f7587h.setEmpty();
        this.f7588i = 0.0f;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        RectF rectF = this.f7586g;
        if (rectF.isEmpty()) {
            return;
        }
        int save = canvas.save();
        canvas.clipRect(rectF);
        try {
            RectF rectF2 = this.f7587h;
            float f6 = rectF2.left;
            float f10 = this.f7588i;
            canvas2 = canvas;
            try {
                canvas2.drawLine(f6, f10, rectF2.right, f10, this.f7585f);
                canvas2.restoreToCount(save);
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                canvas2.restoreToCount(save);
                throw th3;
            }
        } catch (Throwable th4) {
            th = th4;
            canvas2 = canvas;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i5, int i10) {
        super.onMeasure(i5, i10);
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        int paddingEnd = getPaddingEnd() + getPaddingStart();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (mode == Integer.MIN_VALUE) {
            float f6 = this.f7580a;
            size = Math.min((int) (((0.1f + f6) / 2.0f) + f6 + paddingEnd), size);
        } else if (mode != 1073741824) {
            float f10 = this.f7580a;
            size = (int) (((0.1f + f10) / 2.0f) + f10 + paddingEnd);
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min((int) (this.f7580a + paddingBottom), size2);
        } else if (mode2 != 1073741824) {
            size2 = (int) (this.f7580a + paddingBottom);
        }
        Integer valueOf = Integer.valueOf(size);
        Integer valueOf2 = Integer.valueOf(size2);
        int resolveSize = View.resolveSize(valueOf.intValue(), i5);
        int resolveSize2 = View.resolveSize(valueOf2.intValue(), i10);
        setMeasuredDimension(resolveSize, resolveSize2);
        a(resolveSize, resolveSize2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i5, int i10, int i11, int i12) {
        super.onSizeChanged(i5, i10, i11, i12);
        if (i5 <= 0 || i10 <= 0) {
            return;
        }
        Paint paint = this.f7585f;
        if (i11 == i5 && i12 == i10) {
            LinearGradient linearGradient = this.f7583d;
            if (linearGradient != null) {
                paint.setShader(linearGradient);
            }
            invalidate();
            return;
        }
        a(i5, i10);
        LinearGradient linearGradient2 = this.f7583d;
        if (linearGradient2 != null) {
            paint.setShader(linearGradient2);
        }
    }
}
