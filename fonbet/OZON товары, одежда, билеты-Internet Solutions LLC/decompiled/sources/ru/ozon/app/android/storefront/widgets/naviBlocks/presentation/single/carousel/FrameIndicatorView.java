package ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.single.carousel;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0007H\u0014J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bH\u0014J\u000e\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u0007J\u000e\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\fJ\u000e\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u0007J\u001c\u0010\"\u001a\u00020\u0016*\u00020\u001b2\u0006\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020\fH\u0002R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/single/carousel/FrameIndicatorView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "indicatorGap", "roundedCorner", "", "indicatorRect", "Landroid/graphics/RectF;", "paint", "Landroid/graphics/Paint;", "indicatorWidth", "framesCount", "currentFramePosition", "frameProgress", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onDraw", "canvas", "Landroid/graphics/Canvas;", "setFramesCount", "newFramesCount", "setProgress", "newFrameProgress", "setCurrentFramePosition", "newFramePosition", "drawIndicator", "from", "to", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FrameIndicatorView extends View {
    private int currentFramePosition;
    private float frameProgress;
    private int framesCount;
    private final int indicatorGap;

    @NotNull
    private final RectF indicatorRect;
    private int indicatorWidth;

    @NotNull
    private final Paint paint;
    private final float roundedCorner;

    public /* synthetic */ FrameIndicatorView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void drawIndicator(Canvas canvas, float f7, float f11) {
        RectF rectF = this.indicatorRect;
        rectF.left = f7;
        rectF.right = f11;
        float f12 = this.roundedCorner;
        canvas.drawRoundRect(rectF, f12, f12, this.paint);
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int i11 = this.framesCount;
        float f7 = 0.0f;
        for (int i12 = 0; i12 < i11; i12++) {
            float f11 = this.indicatorWidth + f7;
            drawIndicator(canvas, f7, f11);
            int i13 = this.currentFramePosition;
            if (i12 < i13) {
                drawIndicator(canvas, f7, f11);
            } else if (i12 == i13) {
                drawIndicator(canvas, f7, (this.indicatorWidth * this.frameProgress) + f7);
            }
            f7 += this.indicatorWidth + this.indicatorGap;
        }
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (this.framesCount > 0) {
            int measuredWidth = getMeasuredWidth();
            int i11 = this.framesCount;
            this.indicatorWidth = (measuredWidth - ((i11 - 1) * this.indicatorGap)) / i11;
            this.indicatorRect.set(0.0f, 0.0f, 0.0f, getMeasuredHeight());
        }
    }

    public final void setCurrentFramePosition(int newFramePosition) {
        if (newFramePosition != this.currentFramePosition) {
            this.currentFramePosition = newFramePosition;
            this.frameProgress = 0.0f;
            invalidate();
        }
    }

    public final void setFramesCount(int newFramesCount) {
        this.framesCount = newFramesCount;
        this.currentFramePosition = 0;
        this.frameProgress = 0.0f;
        if (isInLayout()) {
            return;
        }
        requestLayout();
    }

    public final void setProgress(float newFrameProgress) {
        if (newFrameProgress == 1.0f && this.frameProgress == 0.0f) {
            return;
        }
        this.frameProgress = newFrameProgress;
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrameIndicatorView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.indicatorGap = ResourceExtKt.toPx(4);
        this.roundedCorner = ResourceExtKt.toPxF(6);
        this.indicatorRect = new RectF();
        Paint paint = new Paint(1);
        paint.setColor(context.getColor(R$color.clear_light_key_700));
        this.paint = paint;
    }
}
