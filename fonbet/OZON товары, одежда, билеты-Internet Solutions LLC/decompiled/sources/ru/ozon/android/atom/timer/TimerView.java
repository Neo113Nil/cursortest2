package ru.ozon.android.atom.timer;

import Kj.e;
import Mj.C3638a;
import Vc.a;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import hd.C6915b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.uikit.extensions.ThemeExtKt;
import ru.ozon.android.uikit.extensions.view.PaintExtKt;
import ru.ozon.app.android.R;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/android/atom/timer/TimerView;", "Landroid/view/View;", "", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TimerView extends View {

    /* renamed from: k, reason: collision with root package name */
    private static final int f83773k = C6915b.c(e.b(40));

    /* renamed from: a, reason: collision with root package name */
    private int f83774a;

    /* renamed from: b, reason: collision with root package name */
    private int f83775b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final RectF f83776c;

    /* renamed from: d, reason: collision with root package name */
    private float f83777d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Paint f83778e;

    /* renamed from: f, reason: collision with root package name */
    private float f83779f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private String f83780g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private String f83781h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final TextPaint f83782i;

    /* renamed from: j, reason: collision with root package name */
    private final float f83783j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimerView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f83774a = ThemeExtKt.themeColor(context, R.attr.oz_semantic_parandja);
        int themeColor = ThemeExtKt.themeColor(context, R.attr.oz_semantic_accent_primary);
        this.f83775b = themeColor;
        new LinearInterpolator();
        this.f83776c = new RectF();
        this.f83777d = 1.0f;
        Paint paint = new Paint(1);
        paint.setStrokeWidth(e.b(2));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        this.f83778e = paint;
        this.f83779f = 1.0f;
        this.f83780g = "";
        this.f83781h = "";
        TextPaint textPaint = new TextPaint(1);
        C3638a.a(new C3638a(context), textPaint);
        textPaint.setColor(themeColor);
        this.f83782i = textPaint;
        this.f83783j = PaintExtKt.getTextHeight(textPaint);
    }

    @Override // android.view.View
    protected final void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Paint paint = this.f83778e;
        paint.setColor(this.f83774a);
        RectF rectF = this.f83776c;
        canvas.drawArc(rectF, 0.0f, 360.0f, false, paint);
        paint.setColor(this.f83775b);
        canvas.drawArc(rectF, 270.0f, this.f83777d * (-360.0f), false, paint);
        float centerX = rectF.centerX() - 0.0f;
        TextPaint textPaint = this.f83782i;
        float centerY = rectF.centerY();
        float f7 = this.f83779f;
        float f11 = this.f83783j;
        float baseline = PaintExtKt.getBaseline(textPaint, centerY - ((1.0f - f7) * f11));
        float f12 = 255;
        textPaint.setAlpha((int) (f7 * f12));
        canvas.drawText(this.f83780g, centerX, baseline, textPaint);
        float centerX2 = rectF.centerX() - 0.0f;
        float baseline2 = PaintExtKt.getBaseline(textPaint, (f11 * f7) + rectF.centerY());
        textPaint.setAlpha((int) ((1.0f - f7) * f12));
        canvas.drawText(this.f83781h, centerX2, baseline2, textPaint);
    }

    @Override // android.view.View
    protected final void onMeasure(int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        int i13 = 0;
        int i14 = f83773k;
        int size = mode != Integer.MIN_VALUE ? mode != 0 ? mode != 1073741824 ? 0 : View.MeasureSpec.getSize(i11) : i14 : Math.min(i14, View.MeasureSpec.getSize(i11));
        int mode2 = View.MeasureSpec.getMode(i12);
        if (mode2 == Integer.MIN_VALUE) {
            i13 = Math.min(i14, View.MeasureSpec.getSize(i12));
        } else if (mode2 == 0) {
            i13 = i14;
        } else if (mode2 == 1073741824) {
            i13 = View.MeasureSpec.getSize(i12);
        }
        setMeasuredDimension(size, i13);
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i11, int i12, int i13, int i14) {
        float strokeWidth = (this.f83778e.getStrokeWidth() / 2) + a.c(new int[]{getPaddingTop(), getPaddingRight(), getPaddingBottom()}, getPaddingLeft());
        this.f83776c.set(strokeWidth, strokeWidth, i11 - strokeWidth, i12 - strokeWidth);
    }
}
