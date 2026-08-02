package com.sports.insider.ui.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/sports/insider/ui/views/WhiteBorderRoundBackgroundHolder;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWhiteBorderRoundBackgroundHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WhiteBorderRoundBackgroundHolder.kt\ncom/sports/insider/ui/views/WhiteBorderRoundBackgroundHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Canvas.kt\nandroidx/core/graphics/CanvasKt\n*L\n1#1,158:1\n1#2:159\n27#3,7:160\n*S KotlinDebug\n*F\n+ 1 WhiteBorderRoundBackgroundHolder.kt\ncom/sports/insider/ui/views/WhiteBorderRoundBackgroundHolder\n*L\n103#1:160,7\n*E\n"})
/* loaded from: classes.dex */
public final class WhiteBorderRoundBackgroundHolder extends View {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f8066a;

    /* renamed from: b, reason: collision with root package name */
    public final float f8067b;

    /* renamed from: c, reason: collision with root package name */
    public final RectF f8068c;

    /* renamed from: d, reason: collision with root package name */
    public final float f8069d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WhiteBorderRoundBackgroundHolder(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint(1);
        this.f8066a = paint;
        this.f8067b = 10.0f;
        this.f8068c = new RectF();
        this.f8069d = 1.0f;
        DisplayMetrics b10 = a.b(context, "getDisplayMetrics(...)");
        if (b10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            b10 = null;
        }
        float f6 = b10.density;
        f6 = f6 <= 0.0f ? 1.0f : f6;
        this.f8067b = 10.0f * f6;
        this.f8069d = f6 * 1.0f;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.f8069d);
    }

    public final void a(int i5, int i10) {
        RectF rectF = this.f8068c;
        if (i5 <= 0 || i10 <= 0) {
            rectF.setEmpty();
            return;
        }
        float paddingStart = (this.f8069d / 2.0f) + getPaddingStart() + 0.0f;
        float paddingTop = (this.f8069d / 2.0f) + getPaddingTop() + 0.0f;
        float paddingEnd = i5 - ((this.f8069d / 2.0f) + (getPaddingEnd() + 0.0f));
        float paddingBottom = i10 - ((this.f8069d / 2.0f) + (getPaddingBottom() + 0.0f));
        float abs = Math.abs(paddingEnd - paddingStart);
        float abs2 = Math.abs(paddingBottom - paddingTop);
        float f6 = this.f8067b;
        if (abs2 <= f6 || abs <= f6) {
            rectF.setEmpty();
        } else {
            rectF.set(paddingStart, paddingTop, paddingEnd, paddingBottom);
            invalidate();
        }
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
        this.f8068c.setEmpty();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        RectF rectF = this.f8068c;
        if (rectF.isEmpty()) {
            return;
        }
        int save = canvas.save();
        try {
            float f6 = this.f8067b;
            canvas.drawRoundRect(rectF, f6, f6, this.f8066a);
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
        int i11 = (int) this.f8067b;
        if (mode != Integer.MIN_VALUE && mode != 1073741824) {
            size = i11;
        }
        if (mode2 != Integer.MIN_VALUE && mode2 != 1073741824) {
            size2 = i11;
        }
        Integer valueOf = Integer.valueOf(size);
        Integer valueOf2 = Integer.valueOf(size2);
        int intValue = valueOf.intValue();
        int intValue2 = valueOf2.intValue();
        setMeasuredDimension(intValue, intValue2);
        a(intValue, intValue2);
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
            a(i5, i10);
        }
    }
}
