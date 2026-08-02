package ru.ozon.app.android.checkoutcomposer.rfbsSplit.presentation.tooltip;

import Pk0.h;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0012H\u0014J\u0010\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001bH\u0014J\u0016\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u001f\u001a\u00020\u0014H\u0002J\b\u0010 \u001a\u00020\u0014H\u0002J\u0018\u0010!\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0012H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/rfbsSplit/presentation/tooltip/TooltipView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "backgroundPaint", "Landroid/graphics/Paint;", "beakPaint", "beakPath", "Landroid/graphics/Path;", "backgroundBounds", "Landroid/graphics/RectF;", "titleTav", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "icon", "Lru/ozon/uni/android/atom/icon/IconView;", "anchorX", "", "onSizeChanged", "", "width", "height", "oldw", "oldh", "onDraw", "canvas", "Landroid/graphics/Canvas;", "bind", "tooltip", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/DynamicElementDTO$ProductsBlockDTO$PromotedProduct$ProductTooltip;", "updatePaddingForBeak", "calculateBounds", "calculateBeak", "Companion", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TooltipView extends LinearLayout {
    private int anchorX;

    @NotNull
    private final RectF backgroundBounds;

    @NotNull
    private Paint backgroundPaint;

    @NotNull
    private Paint beakPaint;

    @NotNull
    private final Path beakPath;

    @NotNull
    private final IconView icon;

    @NotNull
    private final TextAtomV2View titleTav;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int TITLE_MARGIN = UiExtKt.toPx(12);
    private static final int ICON_MARGIN = UiExtKt.toPx(8);
    private static final int BEAK_WIDTH = UiExtKt.toPx(16);
    private static final int BEAK_WIDTH_HALF = UiExtKt.toPx(8);
    private static final float BEAK_HEIGHT = ResourceExtKt.toPxF(8);
    private static final float BEAK_RADIUS = ResourceExtKt.toPxF(2);
    private static final float BG_RADIUS = ResourceExtKt.toPxF(16);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/rfbsSplit/presentation/tooltip/TooltipView$Companion;", "", "<init>", "()V", "", "LOCATOR_TOOLTIP_TITLE", "Ljava/lang/String;", "LOCATOR_TOOLTIP_CLOSE", "", "TITLE_WEIGHT", "F", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TooltipView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint a11 = h.a(true);
        a11.setColor(ThemeExtKt.themeColor(context, R$attr.layerFloor0Inverted));
        this.backgroundPaint = a11;
        Paint a12 = h.a(true);
        a12.setColor(ThemeExtKt.themeColor(context, R$attr.layerFloor0Inverted));
        a12.setPathEffect(new CornerPathEffect(BEAK_RADIUS));
        this.beakPaint = a12;
        this.beakPath = new Path();
        this.backgroundBounds = new RectF();
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        int i11 = TITLE_MARGIN;
        layoutParams.topMargin = i11;
        layoutParams.bottomMargin = i11;
        layoutParams.setMarginStart(i11);
        layoutParams.weight = 1.0f;
        textAtomV2View.setLayoutParams(layoutParams);
        textAtomV2View.setTextIsSelectable(false);
        textAtomV2View.setContentDescription("tooltipTitle");
        this.titleTav = textAtomV2View;
        IconView iconView = new IconView(context, null, 0, 6, null);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        int i12 = ICON_MARGIN;
        layoutParams2.topMargin = i12;
        layoutParams2.setMarginEnd(i12);
        iconView.setLayoutParams(layoutParams2);
        iconView.setContentDescription("tooltipClose");
        this.icon = iconView;
        addView(textAtomV2View);
        addView(iconView);
        setWillNotDraw(false);
        setOrientation(0);
        ViewExtKt.gone(this);
    }

    private final void calculateBeak(int width, int height) {
        float f7 = (width - this.anchorX) + BEAK_WIDTH;
        int i11 = BEAK_WIDTH_HALF;
        this.beakPath.rewind();
        float f11 = height;
        float f12 = f11 - BEAK_HEIGHT;
        this.beakPath.moveTo(f7 - i11, f12);
        this.beakPath.lineTo(f7, f11);
        this.beakPath.lineTo(i11 + f7, f12);
    }

    private final void calculateBounds() {
        this.backgroundBounds.set(0.0f, 0.0f, getWidth(), getHeight() - BEAK_HEIGHT);
        calculateBeak(getWidth(), getHeight());
    }

    private final void updatePaddingForBeak() {
        setPadding(0, 0, 0, (int) BEAK_HEIGHT);
    }

    public final void bind(@NotNull DynamicElementDTO.ProductsBlockDTO.PromotedProduct.ProductTooltip tooltip, int anchorX) {
        Intrinsics.checkNotNullParameter(tooltip, "tooltip");
        this.anchorX = anchorX;
        TextHolderKt.bind$default(this.titleTav, tooltip.getMessage(), null, 2, null);
        this.titleTav.isFocusableInTouchMode();
        IconHolderKt.bind$default(this.icon, tooltip.getCloseIcon(), null, 2, null);
        updatePaddingForBeak();
        calculateBounds();
        Paint a11 = h.a(true);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        a11.setColor(styleParser.parseColor(context, tooltip.getBackgroundColor(), R$color.layer_floor_0_inverted));
        this.backgroundPaint = a11;
        Paint a12 = h.a(true);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        a12.setColor(styleParser.parseColor(context2, tooltip.getBackgroundColor(), R$color.layer_floor_0_inverted));
        a12.setPathEffect(new CornerPathEffect(BEAK_RADIUS));
        this.beakPaint = a12;
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        RectF rectF = this.backgroundBounds;
        float f7 = BG_RADIUS;
        canvas.drawRoundRect(rectF, f7, f7, this.backgroundPaint);
        canvas.drawPath(this.beakPath, this.beakPaint);
    }

    @Override // android.view.View
    protected void onSizeChanged(int width, int height, int oldw, int oldh) {
        calculateBounds();
    }
}
