package ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation.customViews;

import Sc.InterfaceC4008j;
import Sc.k;
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
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 (2\u00020\u0001:\u0001(B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001b\u0010'\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010#¨\u0006)"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/customViews/SegmentedCircleProgressView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "(II)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "", "progress", "setProgressValue", "(F)V", "color", "setProgressColor", "(I)V", "progressValue", "F", "Landroid/graphics/RectF;", "rectF", "Landroid/graphics/RectF;", "Landroid/graphics/Paint;", "backgroundPaint$delegate", "LSc/j;", "getBackgroundPaint", "()Landroid/graphics/Paint;", "backgroundPaint", "foregroundPaint$delegate", "getForegroundPaint", "foregroundPaint", "Companion", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SegmentedCircleProgressView extends View {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final float DEFAULT_CIRCLE_WIDTH;
    private static final float DEFAULT_LINE_WIDTH;

    /* renamed from: backgroundPaint$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j backgroundPaint;

    /* renamed from: foregroundPaint$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j foregroundPaint;
    private float progressValue;

    @NotNull
    private final RectF rectF;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000f\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0006¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/customViews/SegmentedCircleProgressView$Companion;", "", "<init>", "()V", "", "DEFAULT_CIRCLE_WIDTH", "F", "getDEFAULT_CIRCLE_WIDTH", "()F", "", "CIRCLE_DEGREE", "I", "PROGRESS_MIN", "PROGRESS_MAX", "PROGRESS_SECTIONS", "PROGRESS_START_ANGLE", "PROGRESS_SWEEP_ANGLE", "PROGRESS_ANGLE_STEP", "START_GAP", "START_SECTION_GAP", "SECTION_GAP_STEP", "DEFAULT_GAP", "FILL_GAP", "FILL_PROGRESS_GAP", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float getDEFAULT_CIRCLE_WIDTH() {
            return SegmentedCircleProgressView.DEFAULT_CIRCLE_WIDTH;
        }

        private Companion() {
        }
    }

    static {
        float pxF = UiExtKt.toPxF(4);
        DEFAULT_CIRCLE_WIDTH = pxF;
        DEFAULT_LINE_WIDTH = pxF / 2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SegmentedCircleProgressView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final Paint getBackgroundPaint() {
        return (Paint) this.backgroundPaint.getValue();
    }

    private final Paint getForegroundPaint() {
        return (Paint) this.foregroundPaint.getValue();
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        float f7;
        float f11;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float f12 = this.progressValue;
        float f13 = 360 * f12;
        if (f12 == 0.0f) {
            f7 = 0.0f;
            f11 = 0.0f;
        } else if (f12 < 1.0f) {
            f11 = 10.0f;
            f7 = 6.0f;
        } else {
            f7 = 4.0f;
            f11 = 0.0f;
        }
        float f14 = 5.0f;
        for (int i11 = 0; i11 < 4; i11++) {
            canvas.drawArc(this.rectF, 2.0f + f14, 75.0f, false, getBackgroundPaint());
            f14 += 90.0f;
        }
        canvas.drawArc(this.rectF, f7 - 90.0f, f13 - f11, false, getForegroundPaint());
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int defaultSize = View.getDefaultSize(getSuggestedMinimumHeight(), heightMeasureSpec);
        int defaultSize2 = View.getDefaultSize(getSuggestedMinimumWidth(), widthMeasureSpec);
        if (defaultSize2 <= defaultSize) {
            defaultSize = defaultSize2;
        }
        setMeasuredDimension(defaultSize, defaultSize);
        RectF rectF = this.rectF;
        float f7 = DEFAULT_LINE_WIDTH;
        float f11 = defaultSize;
        rectF.set(f7, f7, f11 - f7, f11 - f7);
    }

    public final void setProgressColor(int color) {
        getForegroundPaint().setColor(color);
        invalidate();
    }

    public final void setProgressValue(float progress) {
        this.progressValue = progress;
        invalidate();
    }

    public /* synthetic */ SegmentedCircleProgressView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SegmentedCircleProgressView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.rectF = new RectF();
        this.backgroundPaint = k.b(new SegmentedCircleProgressView$backgroundPaint$2(context));
        this.foregroundPaint = k.b(SegmentedCircleProgressView$foregroundPaint$2.INSTANCE);
    }
}
