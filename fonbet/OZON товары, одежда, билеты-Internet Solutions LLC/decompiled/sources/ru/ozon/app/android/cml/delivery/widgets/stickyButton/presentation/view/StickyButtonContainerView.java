package ru.ozon.app.android.cml.delivery.widgets.stickyButton.presentation.view;

import Pk0.h;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.widgets.stickyButton.presentation.StickyButtonVO;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\"B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ(\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007H\u0014J\u0010\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001eH\u0014J\u000e\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020!R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/stickyButton/presentation/view/StickyButtonContainerView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "backgroundPaint", "Landroid/graphics/Paint;", "borderPaint", "rect", "Landroid/graphics/RectF;", "topLeftCornerRect", "topRightCornerRect", "path", "Landroid/graphics/Path;", "cornerRadius", "", "strokeXEnd", "onSizeChanged", "", "width", "height", "oldWidth", "oldHeight", "onDraw", "canvas", "Landroid/graphics/Canvas;", "bind", "item", "Lru/ozon/app/android/cml/delivery/widgets/stickyButton/presentation/StickyButtonVO;", "Companion", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class StickyButtonContainerView extends FrameLayout {
    private static final float BORDER_WIDTH;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final float HALF_STROKE_WIDTH;

    @NotNull
    private final Paint backgroundPaint;

    @NotNull
    private final Paint borderPaint;
    private float cornerRadius;

    @NotNull
    private final Path path;

    @NotNull
    private final RectF rect;
    private float strokeXEnd;

    @NotNull
    private final RectF topLeftCornerRect;

    @NotNull
    private final RectF topRightCornerRect;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/stickyButton/presentation/view/StickyButtonContainerView$Companion;", "", "<init>", "()V", "", "DEGREES_180", "F", "DEGREES_270", "DEGREES_90", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        float pxF = UiExtKt.toPxF(1.0f);
        BORDER_WIDTH = pxF;
        HALF_STROKE_WIDTH = pxF / 2;
    }

    public /* synthetic */ StickyButtonContainerView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    public final void bind(@NotNull StickyButtonVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int parseColor = styleParser.parseColor(context, item.getBackgroundColor(), R$color.layer_floor_1);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int parseColor2 = styleParser.parseColor(context2, item.getTopBorderColor(), R$color.graphic_disabled);
        this.cornerRadius = UiExtKt.toPxF(item.getTopCornerRadius().getPx());
        this.backgroundPaint.setColor(parseColor);
        this.borderPaint.setColor(parseColor2);
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawPath(this.path, this.backgroundPaint);
        canvas.drawArc(this.topLeftCornerRect, 180.0f, 90.0f, false, this.borderPaint);
        float f7 = this.cornerRadius;
        float f11 = HALF_STROKE_WIDTH;
        canvas.drawLine(f7, f11, this.strokeXEnd, f11, this.borderPaint);
        canvas.drawArc(this.topRightCornerRect, 270.0f, 90.0f, false, this.borderPaint);
    }

    @Override // android.view.View
    protected void onSizeChanged(int width, int height, int oldWidth, int oldHeight) {
        super.onSizeChanged(width, height, oldWidth, oldHeight);
        RectF rectF = this.rect;
        rectF.right = width;
        rectF.bottom = height;
        float f7 = this.cornerRadius * 2;
        float f11 = HALF_STROKE_WIDTH;
        float f12 = f7 + f11;
        float width2 = rectF.width();
        RectF rectF2 = this.topLeftCornerRect;
        rectF2.top = f11;
        rectF2.right = f7;
        rectF2.bottom = f12;
        RectF rectF3 = this.topRightCornerRect;
        rectF3.left = width2 - f7;
        rectF3.top = f11;
        rectF3.right = width2;
        rectF3.bottom = f12;
        this.strokeXEnd = width2 - this.cornerRadius;
        Path path = this.path;
        path.reset();
        float f13 = this.cornerRadius;
        path.addRoundRect(this.rect, new float[]{f13, f13, f13, f13, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CW);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickyButtonContainerView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.backgroundPaint = paint;
        Paint a11 = h.a(true);
        a11.setStyle(Paint.Style.STROKE);
        a11.setStrokeWidth(BORDER_WIDTH);
        this.borderPaint = a11;
        this.rect = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.topLeftCornerRect = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.topRightCornerRect = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.path = new Path();
        setWillNotDraw(false);
    }
}
