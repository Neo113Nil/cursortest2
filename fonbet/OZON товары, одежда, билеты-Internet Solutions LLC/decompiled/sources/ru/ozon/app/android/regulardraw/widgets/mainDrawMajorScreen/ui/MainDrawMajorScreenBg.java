package ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.ui;

import Ve.ViewOnClickListenerC4465n7;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.regulardraw.utils.UtilKt;
import ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.data.MainDrawMajorScreenVO;
import ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.ui.holders.MainDrawMajorScreenProgressEmptyHolder;
import ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.ui.holders.MainDrawMajorScreenProgressHeaderHolder;
import ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.ui.holders.MainDrawMajorScreenProgressHolder;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0001\u0018\u0000 72\u00020\u0001:\u00017B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0007H\u0014J(\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007H\u0014J0\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u0007H\u0014J\u0010\u0010'\u001a\u00020\u00182\u0006\u0010(\u001a\u00020)H\u0014J\"\u0010*\u001a\u00020\u00182\u0006\u0010+\u001a\u00020,2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u00180.J\u0016\u00100\u001a\u00020\u00182\u0006\u00101\u001a\u00020\u00072\u0006\u00102\u001a\u000203J\b\u00104\u001a\u00020\u0018H\u0002J\f\u00105\u001a\u00020\u0018*\u00020)H\u0002J\f\u00106\u001a\u00020\u0018*\u00020)H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/ui/MainDrawMajorScreenBg;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "headerHolder", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/ui/holders/MainDrawMajorScreenProgressHeaderHolder;", "emptyHolder", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/ui/holders/MainDrawMajorScreenProgressEmptyHolder;", "progressHolder", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/ui/holders/MainDrawMajorScreenProgressHolder;", "palette", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/ui/MainDrawMajorScreenBgPalette;", "rectF", "Landroid/graphics/RectF;", "bgPath", "Landroid/graphics/Path;", "roundedRectClipPath", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onSizeChanged", "width", "height", "oldw", "oldh", "onLayout", "changed", "", "left", "top", "right", "bottom", "dispatchDraw", "canvas", "Landroid/graphics/Canvas;", "bind", "item", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenVO$ProgressBlock;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "updateProgress", "percent", "text", "", "updateBgRect", "drawShadow", "drawMainColorRect", "Companion", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MainDrawMajorScreenBg extends ViewGroup {

    @NotNull
    private final Path bgPath;

    @NotNull
    private final MainDrawMajorScreenProgressEmptyHolder emptyHolder;

    @NotNull
    private final MainDrawMajorScreenProgressHeaderHolder headerHolder;

    @NotNull
    private final MainDrawMajorScreenBgPalette palette;

    @NotNull
    private final MainDrawMajorScreenProgressHolder progressHolder;

    @NotNull
    private final RectF rectF;

    @NotNull
    private final Path roundedRectClipPath;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final float cornerRadius = ResourceExtKt.toPxF(16);
    private static final int shadowOffset = ResourceExtKt.toPx(4);
    private static final int horizontalMargin = ResourceExtKt.toPx(12);

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/ui/MainDrawMajorScreenBg$Companion;", "", "<init>", "()V", "", "cornerRadius", "F", "getCornerRadius", "()F", "", "shadowOffset", "I", "getShadowOffset", "()I", "MAX_SCREEN_WIDTH", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float getCornerRadius() {
            return MainDrawMajorScreenBg.cornerRadius;
        }

        public final int getShadowOffset() {
            return MainDrawMajorScreenBg.shadowOffset;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MainDrawMajorScreenBg(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$0(MainDrawMajorScreenVO.ProgressBlock progressBlock, Function1 function1, View view) {
        AtomAction progressAction = progressBlock.getProgressAction();
        if (progressAction != null) {
            function1.invoke(progressAction);
        }
    }

    private final void drawMainColorRect(Canvas canvas) {
        UtilKt.drawWithClip(canvas, this.roundedRectClipPath, new MainDrawMajorScreenBg$drawMainColorRect$1(canvas, this));
        UtilKt.drawWithClipOut(canvas, this.roundedRectClipPath, new MainDrawMajorScreenBg$drawMainColorRect$2(canvas, this));
    }

    private final void drawShadow(Canvas canvas) {
        UtilKt.drawWithClip(canvas, this.roundedRectClipPath, new MainDrawMajorScreenBg$drawShadow$1(canvas, this));
        UtilKt.drawWithClip(canvas, this.roundedRectClipPath, new MainDrawMajorScreenBg$drawShadow$2(canvas, this));
    }

    private final void updateBgRect() {
        float borderWidth = this.palette.getBorderWidth() / 2;
        RectF rectF = this.rectF;
        rectF.left = borderWidth;
        rectF.top = this.headerHolder.getMeasuredHeight().intValue() + borderWidth;
        this.rectF.right = getMeasuredWidth() - borderWidth;
        this.rectF.bottom = getMeasuredHeight() - borderWidth;
        this.bgPath.reset();
        Path path = this.bgPath;
        RectF rectF2 = this.rectF;
        float f7 = cornerRadius;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF2, f7, f7, direction);
        this.roundedRectClipPath.reset();
        this.roundedRectClipPath.addRoundRect(this.rectF, f7, f7, direction);
    }

    public final void bind(@NotNull MainDrawMajorScreenVO.ProgressBlock item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        setClipChildren(false);
        this.palette.theme(item);
        this.headerHolder.bind(item, actionHandler);
        this.emptyHolder.bind(item, actionHandler);
        this.progressHolder.bind(item, actionHandler);
        setOnClickListener(new ViewOnClickListenerC4465n7(3, item, actionHandler));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        drawMainColorRect(canvas);
        drawShadow(canvas);
        this.headerHolder.dispatchDraw(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        float borderWidth = this.rectF.left + cornerRadius + this.palette.getBorderWidth();
        float borderWidth2 = (this.rectF.right - ((int) r2)) - this.palette.getBorderWidth();
        MainDrawMajorScreenProgressHeaderHolder mainDrawMajorScreenProgressHeaderHolder = this.headerHolder;
        mainDrawMajorScreenProgressHeaderHolder.onLayout((int) borderWidth, 0, (int) borderWidth2, mainDrawMajorScreenProgressHeaderHolder.getMeasuredHeight().intValue());
        MainDrawMajorScreenProgressEmptyHolder mainDrawMajorScreenProgressEmptyHolder = this.emptyHolder;
        RectF rectF = this.rectF;
        mainDrawMajorScreenProgressEmptyHolder.onLayout((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        MainDrawMajorScreenProgressHolder mainDrawMajorScreenProgressHolder = this.progressHolder;
        RectF rectF2 = this.rectF;
        mainDrawMajorScreenProgressHolder.onLayout((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int dp = UiExtKt.toDp(View.MeasureSpec.getSize(widthMeasureSpec));
        if (dp > 440) {
            dp = 440;
        }
        int px = ResourceExtKt.toPx(dp) - (horizontalMargin * 2);
        this.headerHolder.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (px - (cornerRadius * 2)), LinearLayoutManager.INVALID_OFFSET), heightMeasureSpec);
        this.emptyHolder.onMeasure(View.MeasureSpec.makeMeasureSpec(px, LinearLayoutManager.INVALID_OFFSET), heightMeasureSpec);
        this.progressHolder.onMeasure(View.MeasureSpec.makeMeasureSpec(px, LinearLayoutManager.INVALID_OFFSET), heightMeasureSpec);
        Integer measuredHeight = this.emptyHolder.getMeasuredHeight();
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(px, LinearLayoutManager.INVALID_OFFSET), View.MeasureSpec.makeMeasureSpec(this.headerHolder.getMeasuredHeight().intValue() + ((measuredHeight == null && (measuredHeight = this.progressHolder.getMeasuredHeight()) == null) ? 0 : measuredHeight.intValue()), 1073741824));
    }

    @Override // android.view.View
    protected void onSizeChanged(int width, int height, int oldw, int oldh) {
        updateBgRect();
        super.onSizeChanged(width, height, oldw, oldh);
    }

    public final void updateProgress(int percent, @NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.progressHolder.updateProgress(percent, text);
    }

    public /* synthetic */ MainDrawMajorScreenBg(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainDrawMajorScreenBg(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.headerHolder = new MainDrawMajorScreenProgressHeaderHolder(context, this);
        this.emptyHolder = new MainDrawMajorScreenProgressEmptyHolder(context, this);
        this.progressHolder = new MainDrawMajorScreenProgressHolder(context, this);
        this.palette = new MainDrawMajorScreenBgPalette(context);
        this.rectF = new RectF();
        this.bgPath = new Path();
        this.roundedRectClipPath = new Path();
        setLayerType(1, null);
    }
}
