package ru.ozon.app.android.fresh.common.widgets.molecules.tooltip.internal;

import Sc.o;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.common.widgets.molecules.tooltip.TooltipBeakPosition;
import ru.ozon.app.android.fresh.common.widgets.molecules.tooltip.TooltipVO;
import ru.ozon.uni.R$drawable;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.LayoutExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001VB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0013\u001a\u00020\u000e2\b\b\u0001\u0010\u0011\u001a\u00020\b2\b\b\u0001\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u001b\u0010\u0018\u001a\u00020\u000e2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001f\u0010\u0014J/\u0010$\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\b2\u0006\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020\bH\u0014¢\u0006\u0004\b$\u0010%J7\u0010,\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\b2\u0006\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\b2\u0006\u0010+\u001a\u00020\bH\u0014¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020.H\u0014¢\u0006\u0004\b0\u00101J\u0015\u00104\u001a\u00020\u000e2\u0006\u00103\u001a\u000202¢\u0006\u0004\b4\u00105R*\u0010\u001a\u001a\u00020\u00042\u0006\u00106\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010\u001cR\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010=R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010K\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010M\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0018\u0010O\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0018\u0010Q\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010T\u001a\u00020S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010U¨\u0006W"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/tooltip/internal/TooltipView;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "", "initRadius", "<init>", "(Landroid/content/Context;F)V", "", "usedWidth", "parentWidth", "getTooltipWidth", "(II)I", "color", "", "setTooltipBackgroundColor", "(I)V", "background", "iconColor", "setCloseIconColors", "(II)V", "showCloseIcon", "()V", "hideCloseIcon", "prepareUi", "(Ljava/lang/Float;)V", "radius", "onParamsChange", "(F)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "width", "height", "oldw", "oldh", "onSizeChanged", "(IIII)V", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "Lru/ozon/app/android/fresh/common/widgets/molecules/tooltip/TooltipVO;", "tooltip", "bindTooltip", "(Lru/ozon/app/android/fresh/common/widgets/molecules/tooltip/TooltipVO;)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "F", "getRadius", "()F", "setRadius", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleTextAtomView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "subtitleTextAtomView", "Landroid/widget/ImageView;", "closeIconView", "Landroid/widget/ImageView;", "Lru/ozon/app/android/fresh/common/widgets/molecules/tooltip/internal/TooltipView$BeakSpecification;", "beakSpec", "Lru/ozon/app/android/fresh/common/widgets/molecules/tooltip/internal/TooltipView$BeakSpecification;", "Lru/ozon/app/android/fresh/common/widgets/molecules/tooltip/internal/TooltipBeakDrawer;", "beakDrawer", "Lru/ozon/app/android/fresh/common/widgets/molecules/tooltip/internal/TooltipBeakDrawer;", "Lru/ozon/app/android/fresh/common/widgets/molecules/tooltip/internal/TooltipBackgroundDrawer;", "backgroundDrawer", "Lru/ozon/app/android/fresh/common/widgets/molecules/tooltip/internal/TooltipBackgroundDrawer;", "isExpanded", "Z", "minWidth", "I", "maxWidth", "Ljava/lang/Integer;", "beakAnchor", "Ljava/lang/Float;", "Lru/ozon/app/android/fresh/common/widgets/molecules/tooltip/TooltipBeakPosition;", "beakPosition", "Lru/ozon/app/android/fresh/common/widgets/molecules/tooltip/TooltipBeakPosition;", "BeakSpecification", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TooltipView extends ViewGroup {

    @NotNull
    private final TooltipBackgroundDrawer backgroundDrawer;
    private Float beakAnchor;

    @NotNull
    private final TooltipBeakDrawer beakDrawer;

    @NotNull
    private TooltipBeakPosition beakPosition;

    @NotNull
    private final BeakSpecification beakSpec;

    @NotNull
    private final ImageView closeIconView;
    private boolean isExpanded;
    private Integer maxWidth;
    private int minWidth;
    private float radius;

    @NotNull
    private final TextAtomV2View subtitleTextAtomView;

    @NotNull
    private final TextAtomV2View titleTextAtomView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TooltipView(@NotNull Context context, float f7) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.titleTextAtomView = textAtomV2View;
        TextAtomV2View textAtomV2View2 = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.subtitleTextAtomView = textAtomV2View2;
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R$drawable.ic_s_cross_filled_compact);
        ViewExtKt.setPaddingsDp(imageView, 8.0f);
        imageView.setVisibility(8);
        imageView.setClickable(true);
        imageView.setFocusable(true);
        this.closeIconView = imageView;
        BeakSpecification beakSpecification = new BeakSpecification(0, 0, 0.0f, 7, null);
        this.beakSpec = beakSpecification;
        this.beakDrawer = new TooltipBeakDrawer(beakSpecification);
        this.backgroundDrawer = new TooltipBackgroundDrawer(beakSpecification.getHeight());
        this.maxWidth = 0;
        this.beakAnchor = Float.valueOf(0.0f);
        this.beakPosition = TooltipBeakPosition.INSTANCE.getDefaultTooltipBeakPosition();
        prepareUi(Float.valueOf(f7));
    }

    private final int getTooltipWidth(int usedWidth, int parentWidth) {
        Integer num = this.maxWidth;
        return num != null ? Math.max(Math.min(num.intValue(), parentWidth), this.minWidth) : this.isExpanded ? parentWidth : Math.max(usedWidth, this.minWidth);
    }

    private final void hideCloseIcon() {
        this.closeIconView.setVisibility(8);
    }

    private final void onParamsChange(float radius) {
        this.backgroundDrawer.setBackgroundRadius(radius);
        requestLayout();
    }

    private final void prepareUi(Float initRadius) {
        if (initRadius != null) {
            setRadius(initRadius.floatValue());
        }
        addView(this.titleTextAtomView);
        addView(this.subtitleTextAtomView);
        addView(this.closeIconView);
    }

    private final void setCloseIconColors(int background, int iconColor) {
        this.closeIconView.setBackgroundColor(background);
        this.closeIconView.setColorFilter(new PorterDuffColorFilter(iconColor, PorterDuff.Mode.SRC_IN));
    }

    private final void setRadius(float f7) {
        this.radius = f7;
        onParamsChange(f7);
    }

    private final void setTooltipBackgroundColor(int color) {
        this.backgroundDrawer.setBackgroundColor(color);
        this.beakDrawer.setColor(color);
    }

    private final void showCloseIcon() {
        this.closeIconView.setVisibility(0);
    }

    public final void bindTooltip(@NotNull TooltipVO tooltip) {
        Intrinsics.checkNotNullParameter(tooltip, "tooltip");
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setTooltipBackgroundColor(styleParser.parseColor(context, tooltip.getStyle().getBackground().getToken(), UniColors.LAYER_FLOOR_0_INVERTED.getResId()));
        this.minWidth = tooltip.getMinWidth();
        this.maxWidth = tooltip.getMaxWidth();
        this.isExpanded = tooltip.getIsExpanded();
        this.beakPosition = tooltip.getBeakPosition();
        TextHolderKt.bind$default(this.titleTextAtomView, tooltip.getTitle(), null, 2, null);
        TextHolderKt.bindOrGone$default(this.subtitleTextAtomView, tooltip.getSubtitle(), null, 2, null);
        if (tooltip.getHasCloseIcon()) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            int parseColor = styleParser.parseColor(context2, tooltip.getStyle().getCloseIconBackground().getToken(), UniColors.CLEAR_LIGHT_KEY_0.getResId());
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            setCloseIconColors(parseColor, styleParser.parseColor(context3, tooltip.getStyle().getCloseIconColor().getToken(), UniColors.GRAPHIC_TERTIARY_INVERTED.getResId()));
            showCloseIcon();
        } else {
            hideCloseIcon();
        }
        TestInfo testInfo = tooltip.getTestInfo();
        setContentDescription(testInfo != null ? testInfo.getAutomatizationId() : null);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.backgroundDrawer.onDraw(canvas);
        this.beakDrawer.onDraw(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        TooltipBeakPosition tooltipBeakPosition = this.beakPosition;
        if (!(tooltipBeakPosition instanceof TooltipBeakPosition.Vertical.Top)) {
            tooltipBeakPosition = null;
        }
        int height = tooltipBeakPosition != null ? this.beakSpec.getHeight() : 0;
        TooltipBeakPosition tooltipBeakPosition2 = this.beakPosition;
        if (!(tooltipBeakPosition2 instanceof TooltipBeakPosition.Left)) {
            tooltipBeakPosition2 = null;
        }
        int height2 = tooltipBeakPosition2 != null ? this.beakSpec.getHeight() : 0;
        TooltipBeakPosition tooltipBeakPosition3 = this.beakPosition;
        int height3 = (tooltipBeakPosition3 instanceof TooltipBeakPosition.Vertical.Top ? tooltipBeakPosition3 : null) != null ? this.beakSpec.getHeight() : 0;
        LayoutExtKt.layoutLeftTop(this.titleTextAtomView, getPaddingLeft() + left + height2, getPaddingTop() + top + height);
        View ifNotGone = ViewExtKt.getIfNotGone(this.subtitleTextAtomView);
        if (ifNotGone != null) {
            LayoutExtKt.layoutLeftTop(ifNotGone, getPaddingLeft() + left + height2, this.titleTextAtomView.getBottom());
        }
        View ifNotGone2 = ViewExtKt.getIfNotGone(this.closeIconView);
        if (ifNotGone2 != null) {
            LayoutExtKt.layoutLeftTop(ifNotGone2, this.closeIconView.getPaddingLeft() + this.titleTextAtomView.getMeasuredWidth() + getPaddingLeft() + left + height2, ((getPaddingTop() + top) + height3) - this.closeIconView.getPaddingTop());
        }
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int i11;
        int height;
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(heightMeasureSpec), 0);
        measureChild(this.titleTextAtomView, widthMeasureSpec, makeMeasureSpec);
        measureChild(this.subtitleTextAtomView, widthMeasureSpec, makeMeasureSpec);
        measureChild(this.closeIconView, widthMeasureSpec, makeMeasureSpec);
        TooltipBeakPosition tooltipBeakPosition = this.beakPosition;
        if (tooltipBeakPosition instanceof TooltipBeakPosition.Vertical) {
            i11 = this.beakSpec.getHeight();
        } else {
            if (!(tooltipBeakPosition instanceof TooltipBeakPosition.Horizontal)) {
                throw new o();
            }
            i11 = 0;
        }
        TooltipBeakPosition tooltipBeakPosition2 = this.beakPosition;
        if (tooltipBeakPosition2 instanceof TooltipBeakPosition.Vertical) {
            height = 0;
        } else {
            if (!(tooltipBeakPosition2 instanceof TooltipBeakPosition.Horizontal)) {
                throw new o();
            }
            height = this.beakSpec.getHeight();
        }
        View ifNotGone = ViewExtKt.getIfNotGone(this.closeIconView);
        int measuredWidth = ifNotGone != null ? ifNotGone.getMeasuredWidth() : 0;
        View ifNotGone2 = ViewExtKt.getIfNotGone(this.subtitleTextAtomView);
        int measuredHeight = this.titleTextAtomView.getMeasuredHeight() + getPaddingBottom() + getPaddingTop() + (ifNotGone2 != null ? ifNotGone2.getMeasuredHeight() : 0) + i11;
        int max = Math.max(this.titleTextAtomView.getMeasuredWidth(), this.subtitleTextAtomView.getMeasuredWidth());
        int paddingRight = getPaddingRight() + getPaddingLeft() + max + height + measuredWidth;
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        TextAtomV2View textAtomV2View = this.titleTextAtomView;
        textAtomV2View.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(textAtomV2View.getMeasuredHeight(), 1073741824));
        View ifNotGone3 = ViewExtKt.getIfNotGone(this.subtitleTextAtomView);
        if (ifNotGone3 != null) {
            ifNotGone3.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(this.subtitleTextAtomView.getMeasuredHeight(), 1073741824));
        }
        setMeasuredDimension(getTooltipWidth(paddingRight, size), measuredHeight);
    }

    @Override // android.view.View
    protected void onSizeChanged(int width, int height, int oldw, int oldh) {
        this.backgroundDrawer.onSizeChanged(width, height, this.beakPosition);
        TooltipBeakDrawer tooltipBeakDrawer = this.beakDrawer;
        Float f7 = this.beakAnchor;
        tooltipBeakDrawer.onSizeChanged(f7 != null ? f7.floatValue() : width / 2.0f, width, height, this.beakPosition);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\r\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/tooltip/internal/TooltipView$BeakSpecification;", "", "", "width", "height", "", "radius", "<init>", "(IIF)V", "I", "getWidth", "()I", "getHeight", "F", "getRadius", "()F", "widthHalf", "getWidthHalf", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BeakSpecification {
        private final int height;
        private final float radius;
        private final int width;
        private final float widthHalf;

        public BeakSpecification(int i11, int i12, float f7) {
            this.width = i11;
            this.height = i12;
            this.radius = f7;
            this.widthHalf = i11 / 2.0f;
        }

        public final int getHeight() {
            return this.height;
        }

        public final float getRadius() {
            return this.radius;
        }

        public final float getWidthHalf() {
            return this.widthHalf;
        }

        public /* synthetic */ BeakSpecification(int i11, int i12, float f7, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? UiExtKt.toPx(16) : i11, (i13 & 2) != 0 ? UiExtKt.toPx(7) : i12, (i13 & 4) != 0 ? UiExtKt.toPxF(2.0f) : f7);
        }
    }
}
