package ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.ui.progressView;

import Bi.a;
import Bu.g;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.regulardraw.R$color;
import ru.ozon.app.android.regulardraw.R$style;
import ru.ozon.app.android.regulardraw.ui.OutlinedTextView;
import ru.ozon.app.android.regulardraw.utils.UtilKt;
import ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.data.MainDrawMajorScreenVO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.TextViewExtKt;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u0000 52\u00020\u0001:\u00015B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007H\u0014J0\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u0007H\u0014J\u0010\u0010'\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020)H\u0014J\u000e\u0010*\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020,J\u0016\u0010-\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010.\u001a\u00020/J\u0010\u00100\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u0007H\u0002J\b\u00101\u001a\u00020\u001dH\u0002J\b\u00102\u001a\u00020\u001dH\u0002J\u0010\u00103\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020)H\u0002J\u0010\u00104\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020)H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0018@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\u001a\u0010\u001b¨\u00066"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/ui/progressView/MainDrawMajorScreenProgressView;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "prizeText", "Lru/ozon/app/android/regulardraw/ui/OutlinedTextView;", "prizeImage", "Landroidx/appcompat/widget/AppCompatImageView;", "bgRectBounds", "Landroid/graphics/RectF;", "progressRightBounds", "bgPath", "Landroid/graphics/Path;", "progressPath", "palette", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/ui/progressView/MainDrawMajorScreenProgressViewPalette;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "percent", "setPercent", "(J)V", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onLayout", "changed", "", "left", "top", "right", "bottom", "dispatchDraw", "canvas", "Landroid/graphics/Canvas;", "bind", "progressBar", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenVO$ProgressBar;", "updateWithAnimation", "text", "", "setProgress", "setBackgroundBounds", "setProgressBounds", "drawProgress", "drawBackground", "Companion", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MainDrawMajorScreenProgressView extends ViewGroup {

    @NotNull
    private final Path bgPath;

    @NotNull
    private final RectF bgRectBounds;

    @NotNull
    private final MainDrawMajorScreenProgressViewPalette palette;
    private long percent;

    @NotNull
    private final AppCompatImageView prizeImage;

    @NotNull
    private final OutlinedTextView prizeText;

    @NotNull
    private final Path progressPath;

    @NotNull
    private final RectF progressRightBounds;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int bgShadowOffset = ResourceExtKt.toPx(1);
    private static final int shadowPadding = ResourceExtKt.toPx(1);
    private static final float textStrokeWidth = ResourceExtKt.toPxF(2);
    private static final int innerHorizontalPadding = ResourceExtKt.toPx(4);
    private static final int imageHeight = ResourceExtKt.toPx(31);
    private static final int imageWidth = ResourceExtKt.toPx(20);

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/ui/progressView/MainDrawMajorScreenProgressView$Companion;", "", "<init>", "()V", "MAX_VALUE", "", "MIN_VALUE", "bgShadowOffset", "", "shadowPadding", "textStrokeWidth", "", "innerHorizontalPadding", "imageHeight", "imageWidth", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ MainDrawMajorScreenProgressView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    private final void drawBackground(Canvas canvas) {
        UtilKt.drawWithClip(canvas, this.bgPath, new MainDrawMajorScreenProgressView$drawBackground$1$1(canvas, this));
        UtilKt.drawWithClip(canvas, this.bgPath, new MainDrawMajorScreenProgressView$drawBackground$1$2(canvas, this));
        UtilKt.drawWithClipOut(canvas, this.bgPath, new MainDrawMajorScreenProgressView$drawBackground$1$3(canvas, this));
    }

    private final void drawProgress(Canvas canvas) {
        if (this.percent == 0) {
            return;
        }
        UtilKt.drawWithClip(canvas, this.progressPath, new MainDrawMajorScreenProgressView$drawProgress$1$1(canvas, this));
        UtilKt.drawWithClip(canvas, this.bgPath, new MainDrawMajorScreenProgressView$drawProgress$1$2(this, canvas));
    }

    private final void setBackgroundBounds() {
        this.bgRectBounds.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        this.bgPath.reset();
        this.bgPath.addRoundRect(this.bgRectBounds, this.palette.getBgCorners(), Path.Direction.CW);
    }

    private final void setPercent(long j11) {
        this.percent = j11;
        requestLayout();
        invalidate();
    }

    private final void setProgress(int percent) {
        long j11 = percent;
        setPercent((j11 > 100 ? 100L : j11 < 0 ? 0L : Integer.valueOf(percent)).longValue());
        setProgressBounds();
    }

    private final void setProgressBounds() {
        float measuredWidth = (getMeasuredWidth() / 100) * this.percent;
        this.palette.getGradientProgress().setBounds(0, 0, (int) measuredWidth, getMeasuredHeight());
        this.progressRightBounds.set(measuredWidth - 1, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        this.progressPath.addRoundRect(this.progressRightBounds, this.palette.getProgressShadowCorners(), Path.Direction.CW);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateWithAnimation$lambda$4$lambda$3(MainDrawMajorScreenProgressView mainDrawMajorScreenProgressView, ValueAnimator valueAnimator) {
        mainDrawMajorScreenProgressView.setProgress(((Integer) a.b(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Int")).intValue());
    }

    public final void bind(@NotNull MainDrawMajorScreenVO.ProgressBar progressBar) {
        Intrinsics.checkNotNullParameter(progressBar, "progressBar");
        setProgress(progressBar.getPercent());
        this.prizeText.setText(progressBar.getText());
        ImageViewExtKt.load$default(this.prizeImage, progressBar.getIcon(), null, null, null, new ImageSize(imageWidth, imageHeight), false, null, 110, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        drawBackground(canvas);
        drawProgress(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        int measuredHeight = getMeasuredHeight() / 2;
        UtilKt.layoutLeftCenter(this.prizeText, (getMeasuredWidth() / 2) - ((this.prizeImage.getMeasuredWidth() + this.prizeText.getMeasuredWidth()) / 2), measuredHeight + 3);
        UtilKt.layoutLeftCenter(this.prizeImage, this.prizeText.getRight(), measuredHeight);
        setBackgroundBounds();
        setProgressBounds();
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        measureChild(this.prizeImage, widthMeasureSpec, heightMeasureSpec);
        this.prizeText.measure(View.MeasureSpec.makeMeasureSpec((size - this.prizeImage.getMeasuredWidth()) - (innerHorizontalPadding * 2), LinearLayoutManager.INVALID_OFFSET), View.MeasureSpec.makeMeasureSpec(0, 0));
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    public final void updateWithAnimation(int percent, @NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        ValueAnimator ofInt = ValueAnimator.ofInt((int) this.percent, percent);
        ofInt.addUpdateListener(new g(this, 2));
        ofInt.start();
        this.prizeText.setText(text);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainDrawMajorScreenProgressView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        OutlinedTextView outlinedTextView = new OutlinedTextView(context, null, 0, 6, null);
        outlinedTextView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        outlinedTextView.setTextConfig(UtilKt.parseColor(R$color.prize_progress_view_text_color, context), UtilKt.parseColor(R$color.prize_progress_view_text_stroke_color, context), textStrokeWidth);
        TextViewExtKt.applyStyle(outlinedTextView, context, R$style.Text_Bold_Medium);
        outlinedTextView.setMaxLines(1);
        outlinedTextView.setEllipsize(TextUtils.TruncateAt.END);
        addView(outlinedTextView);
        this.prizeText = outlinedTextView;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setLayoutParams(new ViewGroup.LayoutParams(imageWidth, imageHeight));
        addView(appCompatImageView);
        this.prizeImage = appCompatImageView;
        this.bgRectBounds = new RectF();
        this.progressRightBounds = new RectF();
        this.bgPath = new Path();
        this.progressPath = new Path();
        this.palette = new MainDrawMajorScreenProgressViewPalette(context);
        setClipChildren(false);
    }
}
