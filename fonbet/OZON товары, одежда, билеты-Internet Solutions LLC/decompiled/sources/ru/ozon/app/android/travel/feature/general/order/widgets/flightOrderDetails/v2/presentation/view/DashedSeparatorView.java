package ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v2.presentation.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.order.R$styleable;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0007H\u0014J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0014R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/presentation/view/DashedSeparatorView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "dashLength", "", "dashThickness", "dashGap", "dashColor", "paint", "Landroid/graphics/Paint;", "additionalLengthFromRoundCap", "getAdditionalLengthFromRoundCap", "()F", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onDraw", "canvas", "Landroid/graphics/Canvas;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DashedSeparatorView extends View {
    private int dashColor;
    private float dashGap;
    private float dashLength;
    private float dashThickness;

    @NotNull
    private Paint paint;

    public /* synthetic */ DashedSeparatorView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final float getAdditionalLengthFromRoundCap() {
        return this.dashThickness / 2;
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float height = getHeight() / 2.0f;
        canvas.drawLine(getPaddingLeft() + getAdditionalLengthFromRoundCap(), height, (getWidth() - getPaddingRight()) - getAdditionalLengthFromRoundCap(), height, this.paint);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(View.MeasureSpec.getSize(widthMeasureSpec), View.resolveSize((int) (getPaddingBottom() + getPaddingTop() + this.dashThickness), heightMeasureSpec));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashedSeparatorView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dashLength = ResourceExtKt.toPxF(6, context);
        this.dashThickness = UiExtKt.toPxF(1.5f);
        this.dashGap = ResourceExtKt.toPxF(6, context);
        this.dashColor = ThemeExtKt.themeColor(context, R$attr.graphicNeutral);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.DashedSeparatorView);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
            this.dashLength = obtainStyledAttributes.getDimension(R$styleable.DashedSeparatorView_dashLength, this.dashLength);
            this.dashThickness = obtainStyledAttributes.getDimension(R$styleable.DashedSeparatorView_dashThickness, this.dashThickness);
            this.dashGap = obtainStyledAttributes.getDimension(R$styleable.DashedSeparatorView_dashGap, this.dashGap);
            this.dashColor = obtainStyledAttributes.getColor(R$styleable.DashedSeparatorView_dashColor, this.dashColor);
            obtainStyledAttributes.recycle();
        }
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(this.dashThickness);
        paint.setColor(this.dashColor);
        paint.setPathEffect(new DashPathEffect(new float[]{this.dashLength, this.dashGap}, 0.0f));
        this.paint = paint;
    }
}
