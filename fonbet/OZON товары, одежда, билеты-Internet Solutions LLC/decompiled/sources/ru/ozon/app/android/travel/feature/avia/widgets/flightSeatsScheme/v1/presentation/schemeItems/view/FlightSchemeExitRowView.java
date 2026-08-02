package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.widget.FrameLayout;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.FlightSchemeExitRow;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\fH\u0014J0\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00020\fH\u0014J\u0010\u0010!\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020#H\u0014J\u000e\u0010$\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\nJ\b\u0010%\u001a\u00020\u0007H\u0002J\b\u0010&\u001a\u00020\u0017H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/view/FlightSchemeExitRowView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "leftTextView", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "rightTextView", "item", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSchemeExitRow;", "minHeight", "", "horizontalOffset", "exitMarkingPath", "Landroid/graphics/Path;", "exitMarkingRadius", "", "exitMarkingWidth", "exitMarkingHeight", "exitMarkingPaint", "Landroid/graphics/Paint;", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onLayout", "changed", "", "left", "top", "right", "bottom", "onDraw", "canvas", "Landroid/graphics/Canvas;", "bind", "createTextAtomView", "fillMarkingPath", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightSchemeExitRowView extends FrameLayout {
    private final float exitMarkingHeight;

    @NotNull
    private final Paint exitMarkingPaint;

    @NotNull
    private final Path exitMarkingPath;
    private final float exitMarkingRadius;
    private final float exitMarkingWidth;
    private final int horizontalOffset;
    private FlightSchemeExitRow item;

    @NotNull
    private final TextAtomView leftTextView;
    private final int minHeight;

    @NotNull
    private final TextAtomView rightTextView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightSchemeExitRowView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        TextAtomView createTextAtomView = createTextAtomView();
        this.leftTextView = createTextAtomView;
        TextAtomView createTextAtomView2 = createTextAtomView();
        this.rightTextView = createTextAtomView2;
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
        addView(createTextAtomView);
        addView(createTextAtomView2);
    }

    private final TextAtomView createTextAtomView() {
        q qVar = q.f64554a;
        d b11 = N.b(TextAtomView.class);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextAtomView textAtomView = (TextAtomView) qVar.g(b11, context);
        textAtomView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        return textAtomView;
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

    public final void bind(@NotNull FlightSchemeExitRow item) {
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
        TextAtomHolderKt.bindOrGone$default(this.leftTextView, item.getLeftText(), null, 2, null);
        TextAtomHolderKt.bindOrGone$default(this.rightTextView, item.getRightText(), null, 2, null);
        requestLayout();
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        FlightSchemeExitRow flightSchemeExitRow = this.item;
        if (flightSchemeExitRow == null) {
            return;
        }
        if (flightSchemeExitRow.getLeftText() == null && flightSchemeExitRow.getRightText() == null) {
            return;
        }
        float width = (getWidth() / 2.0f) - (flightSchemeExitRow.getSchemeWidth() / 2.0f);
        float paddingTop = getPaddingTop() + ((((getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f) - (this.exitMarkingHeight / 2.0f));
        int save = canvas.save();
        try {
            canvas.translate(width, paddingTop);
            if (flightSchemeExitRow.getLeftText() != null) {
                canvas.drawPath(this.exitMarkingPath, this.exitMarkingPaint);
            }
            if (flightSchemeExitRow.getRightText() != null) {
                canvas.translate(flightSchemeExitRow.getSchemeWidth(), 0.0f);
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
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        FlightSchemeExitRow flightSchemeExitRow = this.item;
        if (flightSchemeExitRow != null) {
            fillMarkingPath();
            int paddingTop = ((bottom - top) - getPaddingTop()) - getPaddingBottom();
            int schemeWidth = ((right - left) / 2) - (flightSchemeExitRow.getSchemeWidth() / 2);
            if (this.leftTextView.getVisibility() != 8) {
                int i11 = left + this.horizontalOffset + schemeWidth;
                int measuredHeight = ((paddingTop / 2) - (this.leftTextView.getMeasuredHeight() / 2)) + getPaddingTop();
                TextAtomView textAtomView = this.leftTextView;
                textAtomView.layout(i11, measuredHeight, textAtomView.getMeasuredWidth() + i11, this.leftTextView.getMeasuredHeight() + measuredHeight);
            }
            if (this.rightTextView.getVisibility() == 8) {
                return;
            }
            int measuredWidth = ((right - this.horizontalOffset) - schemeWidth) - this.rightTextView.getMeasuredWidth();
            int measuredHeight2 = ((paddingTop / 2) - (this.rightTextView.getMeasuredHeight() / 2)) + getPaddingTop();
            TextAtomView textAtomView2 = this.rightTextView;
            textAtomView2.layout(measuredWidth, measuredHeight2, textAtomView2.getMeasuredWidth() + measuredWidth, this.rightTextView.getMeasuredHeight() + measuredHeight2);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + this.minHeight, 1073741824));
    }
}
