package ru.ozon.android.messenger.blocks.snackbar.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.utils.view.s;
import ru.ozon.app.android.messenger.R$attr;
import ru.ozon.app.android.messenger.R$style;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/android/messenger/blocks/snackbar/view/TimerView;", "Landroid/view/View;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TimerView extends View implements AtomView {

    /* renamed from: o, reason: collision with root package name */
    private static final int f86455o = UiExtKt.toPx(40);

    /* renamed from: a, reason: collision with root package name */
    private int f86456a;

    /* renamed from: b, reason: collision with root package name */
    private int f86457b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final LinearInterpolator f86458c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final RectF f86459d;

    /* renamed from: e, reason: collision with root package name */
    private ValueAnimator f86460e;

    /* renamed from: f, reason: collision with root package name */
    private float f86461f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final Paint f86462g;

    /* renamed from: h, reason: collision with root package name */
    private float f86463h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private String f86464i;

    /* renamed from: j, reason: collision with root package name */
    private float f86465j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private String f86466k;

    /* renamed from: l, reason: collision with root package name */
    private float f86467l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final TextPaint f86468m;

    /* renamed from: n, reason: collision with root package name */
    private final float f86469n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimerView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f86456a = ThemeExtKt.themeColor(context, R$attr.layerOverlayParanja);
        int themeColor = ThemeExtKt.themeColor(context, R$attr.textAction);
        this.f86457b = themeColor;
        this.f86458c = new LinearInterpolator();
        this.f86459d = new RectF();
        this.f86461f = 1.0f;
        Paint paint = new Paint(1);
        paint.setStrokeWidth(UiExtKt.toPxF(2));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        this.f86462g = paint;
        this.f86463h = 1.0f;
        this.f86464i = "";
        this.f86466k = "";
        TextPaint textPaint = new TextPaint(1);
        a.a(new a(context), textPaint, R$style.TextStyle_Head_M);
        textPaint.setColor(themeColor);
        this.f86468m = textPaint;
        this.f86469n = textPaint.descent() - textPaint.ascent();
    }

    public static void a(TimerView timerView, long j11, ValueAnimator valueAnimator) {
        timerView.f86461f = ((Float) Bi.a.b(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        timerView.invalidate();
        String valueOf = String.valueOf((int) Math.ceil((j11 * r6) / 1000));
        if (Intrinsics.d(timerView.f86464i, valueOf)) {
            return;
        }
        String str = timerView.f86464i;
        timerView.f86466k = str;
        TextPaint textPaint = timerView.f86468m;
        float f7 = 2;
        timerView.f86467l = textPaint.measureText(str) / f7;
        timerView.f86464i = valueOf;
        timerView.f86465j = textPaint.measureText(valueOf) / f7;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(100L);
        ofFloat.setInterpolator(timerView.f86458c);
        ofFloat.addUpdateListener(new Ak0.a(timerView, 1));
        ofFloat.start();
    }

    public static void b(TimerView timerView, ValueAnimator valueAnimator) {
        timerView.f86463h = ((Float) Bi.a.b(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        timerView.invalidate();
    }

    public final void c(Integer num) {
        if (num == null) {
            s.a(this);
            return;
        }
        int intValue = num.intValue();
        ValueAnimator valueAnimator = this.f86460e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        final long j11 = intValue * 1000;
        String valueOf = String.valueOf(intValue);
        String str = this.f86464i;
        this.f86466k = str;
        TextPaint textPaint = this.f86468m;
        float f7 = 2;
        this.f86467l = textPaint.measureText(str) / f7;
        this.f86464i = valueOf;
        this.f86465j = textPaint.measureText(valueOf) / f7;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.setDuration(j11);
        ofFloat.setInterpolator(this.f86458c);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ru.ozon.android.messenger.blocks.snackbar.view.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                TimerView.a(TimerView.this, j11, valueAnimator2);
            }
        });
        ofFloat.start();
        this.f86460e = ofFloat;
    }

    @Override // android.view.View
    protected final void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Paint paint = this.f86462g;
        paint.setColor(this.f86456a);
        RectF rectF = this.f86459d;
        canvas.drawArc(rectF, 0.0f, 360.0f, false, paint);
        paint.setColor(this.f86457b);
        canvas.drawArc(rectF, 270.0f, this.f86461f * (-360.0f), false, paint);
        float centerX = rectF.centerX() - this.f86465j;
        TextPaint textPaint = this.f86468m;
        float centerY = rectF.centerY();
        float f7 = 1.0f - this.f86463h;
        float f11 = this.f86469n;
        float f12 = centerY - (f7 * f11);
        float ascent = textPaint.ascent() + textPaint.descent();
        float f13 = 2;
        float f14 = 255;
        textPaint.setAlpha((int) (this.f86463h * f14));
        canvas.drawText(this.f86464i, centerX, f12 - (ascent / f13), textPaint);
        float centerX2 = rectF.centerX() - this.f86467l;
        float centerY2 = ((this.f86463h * f11) + rectF.centerY()) - ((textPaint.ascent() + textPaint.descent()) / f13);
        textPaint.setAlpha((int) ((1.0f - this.f86463h) * f14));
        canvas.drawText(this.f86466k, centerX2, centerY2, textPaint);
    }

    @Override // android.view.View
    protected final void onMeasure(int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        int i13 = 0;
        int i14 = f86455o;
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
        float strokeWidth = (this.f86462g.getStrokeWidth() / 2) + Vc.a.c(new int[]{getPaddingTop(), getPaddingRight(), getPaddingBottom()}, getPaddingLeft());
        this.f86459d.set(strokeWidth, strokeWidth, i11 - strokeWidth, i12 - strokeWidth);
    }
}
