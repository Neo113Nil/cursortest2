package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.view;

import Am.C2438a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.FlightSchemeExitRowV2;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0012H\u0014J0\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u0012H\u0015J\u0010\u0010'\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020)H\u0015J\u000e\u0010*\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010+\u001a\u00020\u001dH\u0002R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\r\u0010\tR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/view/FlightSchemeExitRowViewV2;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "leftTextView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getLeftTextView", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "leftTextView$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "rightTextView", "getRightTextView", "rightTextView$delegate", "item", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/FlightSchemeExitRowV2;", "minHeight", "", "horizontalOffset", "exitMarkingPath", "Landroid/graphics/Path;", "exitMarkingRadius", "", "exitMarkingWidth", "exitMarkingHeight", "exitMarkingPaint", "Landroid/graphics/Paint;", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onLayout", "changed", "", "left", "top", "right", "bottom", "onDraw", "canvas", "Landroid/graphics/Canvas;", "bind", "fillMarkingPath", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightSchemeExitRowViewV2 extends FrameLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(FlightSchemeExitRowViewV2.class, "leftTextView", "getLeftTextView()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(FlightSchemeExitRowViewV2.class, "rightTextView", "getRightTextView()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0)};
    public static final int $stable = 8;
    private final float exitMarkingHeight;

    @NotNull
    private final Paint exitMarkingPaint;

    @NotNull
    private final Path exitMarkingPath;
    private final float exitMarkingRadius;
    private final float exitMarkingWidth;
    private final int horizontalOffset;
    private FlightSchemeExitRowV2 item;

    /* renamed from: leftTextView$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate leftTextView;
    private final int minHeight;

    /* renamed from: rightTextView$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate rightTextView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightSchemeExitRowViewV2(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.leftTextView = new PreCreationViewPoolDelegate(context2, N.b(TextAtomV2View.class), new FlightSchemeExitRowViewV2$special$$inlined$preCreationViewPool$default$1(this), new FlightSchemeExitRowViewV2$special$$inlined$preCreationViewPool$default$2());
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.rightTextView = new PreCreationViewPoolDelegate(context3, N.b(TextAtomV2View.class), new FlightSchemeExitRowViewV2$special$$inlined$preCreationViewPool$default$3(this), new FlightSchemeExitRowViewV2$special$$inlined$preCreationViewPool$default$4());
        this.minHeight = ResourceExtKt.toPx(40, context);
        this.horizontalOffset = ResourceExtKt.toPx(13, context);
        this.exitMarkingPath = new Path();
        this.exitMarkingRadius = ResourceExtKt.toPxF(2, context);
        this.exitMarkingWidth = ResourceExtKt.toPxF(5, context);
        this.exitMarkingHeight = ResourceExtKt.toPxF(30, context);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.exitMarkingPaint = paint;
        setWillNotDraw(false);
        addView(getLeftTextView());
        addView(getRightTextView());
    }

    private final void fillMarkingPath() {
        Path path = this.exitMarkingPath;
        path.rewind();
        path.moveTo(0.0f, 0.0f);
        path.lineTo(0.0f, this.exitMarkingHeight);
        path.lineTo(this.exitMarkingWidth - this.exitMarkingRadius, this.exitMarkingHeight);
        float f7 = this.exitMarkingWidth;
        float f11 = this.exitMarkingHeight;
        path.quadTo(f7, f11, f7, f11 - this.exitMarkingRadius);
        path.lineTo(this.exitMarkingWidth, this.exitMarkingRadius);
        float f12 = this.exitMarkingWidth;
        path.quadTo(f12, 0.0f, f12 - this.exitMarkingRadius, 0.0f);
        path.close();
    }

    private final TextAtomV2View getLeftTextView() {
        return (TextAtomV2View) this.leftTextView.getValue(this, $$delegatedProperties[0]);
    }

    private final TextAtomV2View getRightTextView() {
        return (TextAtomV2View) this.rightTextView.getValue(this, $$delegatedProperties[1]);
    }

    public final void bind(@NotNull FlightSchemeExitRowV2 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.item = item;
        setPadding(getPaddingLeft(), item.getTopOffset(), getPaddingRight(), getPaddingBottom());
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, item.getExitMarkingColor());
        if (parseColor != null) {
            this.exitMarkingPaint.setColor(parseColor.intValue());
        }
        TextHolderKt.bindOrGone$default(getLeftTextView(), item.getLeftText(), null, 2, null);
        TextHolderKt.bindOrGone$default(getRightTextView(), item.getRightText(), null, 2, null);
        requestLayout();
        invalidate();
    }

    @Override // android.view.View
    @SuppressLint({"LifecycleMethodsOrder"})
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        FlightSchemeExitRowV2 flightSchemeExitRowV2 = this.item;
        if (flightSchemeExitRowV2 == null) {
            return;
        }
        if (flightSchemeExitRowV2.getLeftText() == null && flightSchemeExitRowV2.getRightText() == null) {
            return;
        }
        float width = (getWidth() / 2.0f) - (flightSchemeExitRowV2.getSchemeWidth() / 2.0f);
        float paddingTop = getPaddingTop() + ((((getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f) - (this.exitMarkingHeight / 2.0f));
        int save = canvas.save();
        try {
            canvas.translate(width, paddingTop);
            if (flightSchemeExitRowV2.getLeftText() != null) {
                canvas.drawPath(this.exitMarkingPath, this.exitMarkingPaint);
            }
            if (flightSchemeExitRowV2.getRightText() != null) {
                canvas.translate(flightSchemeExitRowV2.getSchemeWidth(), 0.0f);
                canvas.scale(-1.0f, 1.0f);
                canvas.drawPath(this.exitMarkingPath, this.exitMarkingPaint);
            }
            canvas.restoreToCount(save);
        } catch (Throwable th2) {
            canvas.restoreToCount(save);
            throw th2;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    @SuppressLint({"LifecycleMethodsOrder"})
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        FlightSchemeExitRowV2 flightSchemeExitRowV2 = this.item;
        if (flightSchemeExitRowV2 != null) {
            fillMarkingPath();
            int paddingTop = ((bottom - top) - getPaddingTop()) - getPaddingBottom();
            int schemeWidth = ((right - left) / 2) - (flightSchemeExitRowV2.getSchemeWidth() / 2);
            if (getLeftTextView().getVisibility() != 8) {
                int i11 = left + this.horizontalOffset + schemeWidth;
                int measuredHeight = ((paddingTop / 2) - (getLeftTextView().getMeasuredHeight() / 2)) + getPaddingTop();
                getLeftTextView().layout(i11, measuredHeight, getLeftTextView().getMeasuredWidth() + i11, getLeftTextView().getMeasuredHeight() + measuredHeight);
            }
            if (getRightTextView().getVisibility() == 8) {
                return;
            }
            int measuredWidth = ((right - this.horizontalOffset) - schemeWidth) - getRightTextView().getMeasuredWidth();
            int measuredHeight2 = ((paddingTop / 2) - (getRightTextView().getMeasuredHeight() / 2)) + getPaddingTop();
            getRightTextView().layout(measuredWidth, measuredHeight2, getRightTextView().getMeasuredWidth() + measuredWidth, getRightTextView().getMeasuredHeight() + measuredHeight2);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + this.minHeight, 1073741824));
    }
}
