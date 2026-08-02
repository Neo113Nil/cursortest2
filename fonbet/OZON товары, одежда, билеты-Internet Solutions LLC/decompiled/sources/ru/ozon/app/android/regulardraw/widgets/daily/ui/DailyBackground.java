package ru.ozon.app.android.regulardraw.widgets.daily.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.regulardraw.utils.UtilKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ(\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0007H\u0014J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001aH\u0014J\b\u0010\u001b\u001a\u00020\u0013H\u0002J\f\u0010\u001c\u001a\u00020\u0013*\u00020\u001aH\u0002J\f\u0010\u001d\u001a\u00020\u0013*\u00020\u001aH\u0002J\f\u0010\u001e\u001a\u00020\u0013*\u00020\u001aH\u0002R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/daily/ui/DailyBackground;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "screenWidth", "palette", "Lru/ozon/app/android/regulardraw/widgets/daily/ui/DailyBackgroundPalette;", "rectF", "Landroid/graphics/RectF;", "bgPath", "Landroid/graphics/Path;", "roundedRectClipPath", "onSizeChanged", "", "width", "height", "oldw", "oldh", "dispatchDraw", "canvas", "Landroid/graphics/Canvas;", "updateBgRect", "drawBorder", "drawShadow", "drawMainColorRect", "Companion", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DailyBackground extends ConstraintLayout {

    @NotNull
    private final Path bgPath;

    @NotNull
    private final DailyBackgroundPalette palette;

    @NotNull
    private final RectF rectF;

    @NotNull
    private final Path roundedRectClipPath;
    private final int screenWidth;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final float cornerRadius = ResourceExtKt.toPxF(24);
    private static final int shadowOffset = ResourceExtKt.toPx(4);
    private static final int maxScreenWidth = ResourceExtKt.toPx(375);
    private static final int maxBgWidth = ResourceExtKt.toPx(351);
    private static final int minBgWidth = ResourceExtKt.toPx(339);
    private static final int maxPadding = ResourceExtKt.toPx(16);
    private static final int minPadding = ResourceExtKt.toPx(10);

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/daily/ui/DailyBackground$Companion;", "", "<init>", "()V", "", "cornerRadius", "F", "getCornerRadius", "()F", "", "shadowOffset", "I", "getShadowOffset", "()I", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float getCornerRadius() {
            return DailyBackground.cornerRadius;
        }

        public final int getShadowOffset() {
            return DailyBackground.shadowOffset;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DailyBackground(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void drawBorder(Canvas canvas) {
        float gradientBorderWidth = this.palette.getGradientBorderWidth() / 2;
        RectF rectF = this.rectF;
        float f7 = rectF.left + gradientBorderWidth;
        float f11 = rectF.top + gradientBorderWidth;
        float f12 = rectF.right - gradientBorderWidth;
        float f13 = rectF.bottom - gradientBorderWidth;
        float f14 = cornerRadius;
        canvas.drawRoundRect(f7, f11, f12, f13, f14, f14, this.palette.getBorderPaint());
    }

    private final void drawMainColorRect(Canvas canvas) {
        UtilKt.drawWithClip(canvas, this.roundedRectClipPath, new DailyBackground$drawMainColorRect$1(canvas, this));
    }

    private final void drawShadow(Canvas canvas) {
        UtilKt.drawWithClip(canvas, this.roundedRectClipPath, new DailyBackground$drawShadow$1(canvas, this));
        UtilKt.drawWithClip(canvas, this.roundedRectClipPath, new DailyBackground$drawShadow$2(canvas, this));
    }

    private final void updateBgRect() {
        RectF rectF = this.rectF;
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        rectF.right = getMeasuredWidth();
        this.rectF.bottom = getMeasuredHeight();
        this.bgPath.reset();
        Path path = this.bgPath;
        RectF rectF2 = this.rectF;
        float f7 = cornerRadius;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF2, f7, f7, direction);
        this.roundedRectClipPath.reset();
        this.roundedRectClipPath.addRoundRect(this.rectF, f7, f7, direction);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        drawMainColorRect(canvas);
        drawShadow(canvas);
        drawBorder(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    protected void onSizeChanged(int width, int height, int oldw, int oldh) {
        updateBgRect();
        this.palette.updateGradient(width, height);
        super.onSizeChanged(width, height, oldw, oldh);
    }

    public /* synthetic */ DailyBackground(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DailyBackground(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        int i12 = context.getResources().getDisplayMetrics().widthPixels;
        this.screenWidth = i12;
        this.palette = new DailyBackgroundPalette(context);
        this.rectF = new RectF();
        this.bgPath = new Path();
        this.roundedRectClipPath = new Path();
        setLayerType(1, null);
        int i13 = maxScreenWidth;
        setMaxWidth(i12 < i13 ? minBgWidth : maxBgWidth);
        setMinWidth(getMaxWidth());
        int i14 = i12 < i13 ? minPadding : maxPadding;
        setPadding(i14, maxPadding, i14, i14);
    }
}
