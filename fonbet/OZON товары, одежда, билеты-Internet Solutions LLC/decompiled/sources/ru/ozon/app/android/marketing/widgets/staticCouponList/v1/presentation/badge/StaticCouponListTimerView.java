package ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.badge;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import androidx.core.content.res.g;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.badge.StaticCouponListTimerFormatter;
import ru.ozon.uni.android.uikit.extensions.view.PaintExtKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 &2\u00020\u0001:\u0001&B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0014J(\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0015H\u0014J\u0010\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001eH\u0014J\u0010\u0010\u001f\u001a\u00020\u00132\b\u0010 \u001a\u0004\u0018\u00010\u0007J\u001a\u0010!\u001a\u00020\u00132\b\b\u0001\u0010\"\u001a\u00020\u00152\b\b\u0001\u0010#\u001a\u00020\u0015J\u001c\u0010$\u001a\u00020\u00132\b\b\u0001\u0010\"\u001a\u00020\u00152\b\b\u0001\u0010%\u001a\u00020\u0015H\u0002R\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/badge/StaticCouponListTimerView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/badge/StaticCouponListTimerFormatter$Time;", "currentFormatedTime", "setCurrentFormatedTime", "(Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/badge/StaticCouponListTimerFormatter$Time;)V", "paint", "Landroid/text/TextPaint;", "x", "", "y", "attrs", "", "onMeasure", "", "widthMeasureSpec", "", "heightMeasureSpec", "onSizeChanged", "width", "height", "oldw", "oldh", "onDraw", "canvas", "Landroid/graphics/Canvas;", "bindOrGone", "formatedTime", "setStyle", "style", "color", "applyStyle", "textColor", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StaticCouponListTimerView extends View {

    @NotNull
    private final int[] attrs;

    @NotNull
    private StaticCouponListTimerFormatter.Time currentFormatedTime;

    @NotNull
    private final TextPaint paint;
    private float x;
    private float y;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/badge/StaticCouponListTimerView$Companion;", "", "<init>", "()V", "DEFAULT_TIME", "", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StaticCouponListTimerView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.currentFormatedTime = new StaticCouponListTimerFormatter.Time("00:00:00", StaticCouponListTimerFormatter.Time.Format.TIMER);
        this.paint = new TextPaint(1);
        int[] iArr = {R.attr.fontFamily, android.R.attr.fontFeatureSettings, android.R.attr.letterSpacing, android.R.attr.textSize};
        C7705l.Z(iArr);
        this.attrs = iArr;
    }

    private final void applyStyle(int style, int textColor) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(style, this.attrs);
        this.paint.setFontFeatureSettings(obtainStyledAttributes.getString(C7705l.L(this.attrs, android.R.attr.fontFeatureSettings)));
        this.paint.setLetterSpacing(obtainStyledAttributes.getFloat(C7705l.L(this.attrs, android.R.attr.letterSpacing), 0.0f));
        this.paint.setTypeface(Typeface.create(g.e(obtainStyledAttributes.getResourceId(C7705l.L(this.attrs, R.attr.fontFamily), 0), getContext()), 0));
        this.paint.setTextSize(obtainStyledAttributes.getDimension(C7705l.L(this.attrs, android.R.attr.textSize), 0.0f));
        this.paint.setColor(textColor);
        obtainStyledAttributes.recycle();
    }

    private final void setCurrentFormatedTime(StaticCouponListTimerFormatter.Time time) {
        boolean z11 = this.currentFormatedTime.getFormat() != time.getFormat() || time.getFormat() == StaticCouponListTimerFormatter.Time.Format.DAYS;
        invalidate();
        if (z11) {
            requestLayout();
        }
        this.currentFormatedTime = time;
    }

    public final void bindOrGone(StaticCouponListTimerFormatter.Time formatedTime) {
        setVisibility(formatedTime != null ? 0 : 8);
        if (formatedTime != null) {
            setCurrentFormatedTime(formatedTime);
        }
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.drawText(this.currentFormatedTime.getRemaining(), this.x, this.y, this.paint);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(View.resolveSize(getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(this.paint.measureText(this.currentFormatedTime.getFormat() == StaticCouponListTimerFormatter.Time.Format.TIMER ? "00:00:00" : this.currentFormatedTime.getRemaining()))), widthMeasureSpec), View.resolveSize(getPaddingBottom() + getPaddingTop() + ((int) Math.ceil(this.paint.getFontMetrics().bottom - this.paint.getFontMetrics().top)), heightMeasureSpec));
    }

    @Override // android.view.View
    protected void onSizeChanged(int width, int height, int oldw, int oldh) {
        super.onSizeChanged(width, height, oldw, oldh);
        this.x = getPaddingLeft();
        this.y = PaintExtKt.getBaseline(this.paint, ((height - getPaddingTop()) - getPaddingBottom()) / 2.0f);
    }

    public final void setStyle(int style, int color) {
        applyStyle(style, color);
        invalidate();
        requestLayout();
    }
}
