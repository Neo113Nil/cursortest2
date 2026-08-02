package ru.ozon.app.android.cml.delivery.molecules.button.presentation;

import Pk0.h;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 (2\u00020\u0001:\u0001(B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ(\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0007H\u0014J\u0010\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020 H\u0014J&\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020#2\u0016\u0010$\u001a\u0012\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00190%j\u0002`'R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lru/ozon/app/android/cml/delivery/molecules/button/presentation/CmlButtonView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "button", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "backgroundPaint", "Landroid/graphics/Paint;", "borderPaint", "rect", "Landroid/graphics/RectF;", "topLeftCornerRect", "topRightCornerRect", "path", "Landroid/graphics/Path;", "cornerRadius", "", "strokeXEnd", "onSizeChanged", "", "width", "height", "oldWidth", "oldHeight", "onDraw", "canvas", "Landroid/graphics/Canvas;", "bind", "item", "Lru/ozon/app/android/cml/delivery/molecules/button/presentation/CmlButtonVO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/action/BuildedActionHandler;", "Companion", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CmlButtonView extends FrameLayout {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final Paint backgroundPaint;

    @NotNull
    private final Paint borderPaint;

    @NotNull
    private final ButtonV3View button;
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

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/cml/delivery/molecules/button/presentation/CmlButtonView$Companion;", "", "<init>", "()V", "BORDER_WIDTH", "", "HALF_STROKE_WIDTH", "DEGREES_180", "DEGREES_270", "DEGREES_90", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ CmlButtonView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    public final void bind(@NotNull CmlButtonVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int parseColor = styleParser.parseColor(context, item.getBackgroundColor(), R$color.layer_floor_1);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int parseColor2 = styleParser.parseColor(context2, item.getTopBorderColor(), R$color.graphic_disabled);
        int px = item.getTopCornerRadius().getPx();
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.cornerRadius = ResourceExtKt.toPxF(px, context3);
        this.backgroundPaint.setColor(parseColor);
        this.borderPaint.setColor(parseColor2);
        invalidate();
        ButtonV3HolderKt.bind(this.button, item.getButton(), actionHandler);
        ButtonV3View buttonV3View = this.button;
        ViewGroup.LayoutParams layoutParams = buttonV3View.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        int px2 = item.getTopPadding().getPx();
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        layoutParams2.topMargin = ResourceExtKt.toPx(px2, context4);
        int px3 = item.getBottomPadding().getPx();
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        layoutParams2.bottomMargin = ResourceExtKt.toPx(px3, context5);
        int px4 = item.getLeftPadding().getPx();
        Context context6 = getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        layoutParams2.setMarginStart(ResourceExtKt.toPx(px4, context6));
        int px5 = item.getRightPadding().getPx();
        Context context7 = getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
        layoutParams2.setMarginEnd(ResourceExtKt.toPx(px5, context7));
        buttonV3View.setLayoutParams(layoutParams2);
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawPath(this.path, this.backgroundPaint);
        canvas.drawArc(this.topLeftCornerRect, 180.0f, 90.0f, false, this.borderPaint);
        canvas.drawLine(this.cornerRadius, 0.5f, this.strokeXEnd, 0.5f, this.borderPaint);
        canvas.drawArc(this.topRightCornerRect, 270.0f, 90.0f, false, this.borderPaint);
    }

    @Override // android.view.View
    protected void onSizeChanged(int width, int height, int oldWidth, int oldHeight) {
        super.onSizeChanged(width, height, oldWidth, oldHeight);
        RectF rectF = this.rect;
        rectF.right = width;
        rectF.bottom = height;
        float f7 = this.cornerRadius * 2;
        float f11 = f7 + 0.5f;
        float width2 = rectF.width();
        RectF rectF2 = this.topLeftCornerRect;
        rectF2.top = 0.5f;
        rectF2.right = f7;
        rectF2.bottom = f11;
        RectF rectF3 = this.topRightCornerRect;
        rectF3.left = width2 - f7;
        rectF3.top = 0.5f;
        rectF3.right = width2;
        rectF3.bottom = f11;
        this.strokeXEnd = width2 - this.cornerRadius;
        Path path = this.path;
        path.reset();
        float f12 = this.cornerRadius;
        path.addRoundRect(this.rect, new float[]{f12, f12, f12, f12, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CW);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CmlButtonView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        ButtonV3View buttonV3View = new ButtonV3View(context, null, 0, 0, 14, null);
        buttonV3View.setId(View.generateViewId());
        buttonV3View.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        this.button = buttonV3View;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.backgroundPaint = paint;
        Paint a11 = h.a(true);
        a11.setStyle(Paint.Style.STROKE);
        a11.setStrokeWidth(1.0f);
        this.borderPaint = a11;
        this.rect = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.topLeftCornerRect = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.topRightCornerRect = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.path = new Path();
        addView(buttonV3View);
        setWillNotDraw(false);
    }
}
