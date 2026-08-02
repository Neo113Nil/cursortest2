package com.sports.insider.ui.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/sports/insider/ui/views/IcNextView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIcNextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IcNextView.kt\ncom/sports/insider/ui/views/IcNextView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Canvas.kt\nandroidx/core/graphics/CanvasKt\n*L\n1#1,200:1\n1#2:201\n27#3,7:202\n*S KotlinDebug\n*F\n+ 1 IcNextView.kt\ncom/sports/insider/ui/views/IcNextView\n*L\n184#1:202,7\n*E\n"})
/* loaded from: classes.dex */
public final class IcNextView extends View {

    /* renamed from: a, reason: collision with root package name */
    public final float f7555a;

    /* renamed from: b, reason: collision with root package name */
    public final float f7556b;

    /* renamed from: c, reason: collision with root package name */
    public final float f7557c;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f7558d;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f7559e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f7560f;

    /* renamed from: g, reason: collision with root package name */
    public final RectF f7561g;

    /* renamed from: h, reason: collision with root package name */
    public final Path f7562h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IcNextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f7555a = 16.0f;
        this.f7556b = 3.8f;
        this.f7557c = 1.9f;
        Paint paint = new Paint(1);
        this.f7558d = paint;
        Paint paint2 = new Paint(1);
        this.f7559e = paint2;
        Paint paint3 = new Paint(1);
        this.f7560f = paint3;
        this.f7561g = new RectF();
        this.f7562h = new Path();
        DisplayMetrics b10 = a.b(context, "getDisplayMetrics(...)");
        if (b10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            b10 = null;
        }
        float f6 = b10.density;
        f6 = f6 <= 0.0f ? 1.0f : f6;
        this.f7556b *= f6;
        this.f7555a *= f6;
        this.f7557c *= f6;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(-1);
        paint.setStrokeWidth(this.f7557c);
        paint.setAlpha(63);
        paint2.setStyle(style);
        paint2.setColor(-1);
        paint2.setStrokeWidth(this.f7557c);
        paint2.setAlpha(127);
        paint3.setStyle(style);
        paint3.setColor(-1);
        paint3.setStrokeWidth(this.f7557c);
    }

    public final void a(int i5, int i10) {
        RectF rectF = this.f7561g;
        Path path = this.f7562h;
        if (i5 <= 0 || i10 <= 0) {
            rectF.setEmpty();
            path.rewind();
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
            path.rewind();
            return;
        }
        double d10 = 2.0f;
        float sqrt = (this.f7557c / 2.0f) / ((float) Math.sqrt(d10));
        float sqrt2 = (this.f7556b * 2.0f) / ((float) Math.sqrt(d10));
        float f12 = sqrt + paddingStart;
        path.rewind();
        path.moveTo(f12, f11 - sqrt2);
        path.lineTo(f12 + sqrt2, f11);
        path.lineTo(f12, sqrt2 + f11);
        rectF.set(paddingStart, paddingTop, paddingEnd, paddingBottom);
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
        this.f7561g.setEmpty();
        this.f7562h.rewind();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        Path path = this.f7562h;
        if (path.isEmpty()) {
            return;
        }
        int save = canvas.save();
        try {
            canvas.drawPath(path, this.f7558d);
            canvas.translate(this.f7555a, 0.0f);
            canvas.drawPath(path, this.f7559e);
            canvas.translate(this.f7555a, 0.0f);
            canvas.drawPath(path, this.f7560f);
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
        int paddingEnd = getPaddingEnd() + getPaddingStart();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        double d10 = 2.0f;
        float sqrt = (this.f7556b * 2.0f) / ((float) Math.sqrt(d10));
        float sqrt2 = ((this.f7556b * 2.0f) / ((float) Math.sqrt(d10))) * 2.0f;
        float sqrt3 = (this.f7557c / 2.0f) / ((float) Math.sqrt(d10));
        float sqrt4 = (this.f7557c / 2.0f) * ((float) Math.sqrt(d10));
        float sqrt5 = ((this.f7557c / ((float) Math.sqrt(d10))) * 2.0f) + sqrt2;
        int i11 = (int) (paddingEnd + (this.f7555a * 2.0f) + sqrt3 + sqrt + sqrt4);
        int i12 = (int) (paddingBottom + sqrt5);
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(i11, size);
        } else if (mode != 1073741824) {
            size = i11;
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(i12, size2);
        } else if (mode2 != 1073741824) {
            size2 = i12;
        }
        setMeasuredDimension(size, size2);
        a(size, size2);
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
