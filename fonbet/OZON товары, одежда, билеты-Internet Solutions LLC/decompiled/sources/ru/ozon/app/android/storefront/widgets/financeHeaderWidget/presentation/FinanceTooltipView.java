package ru.ozon.app.android.storefront.widgets.financeHeaderWidget.presentation;

import E0.C2942q;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.financeHeaderWidget.presentation.FinanceHeaderVO;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.LayoutExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001:\u0002LMB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u00020\u000e2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010 \u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\bH\u0014¢\u0006\u0004\b \u0010!J7\u0010'\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\b2\u0006\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020\b2\u0006\u0010&\u001a\u00020\bH\u0014¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020)H\u0014¢\u0006\u0004\b+\u0010,J\u0015\u0010-\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\b¢\u0006\u0004\b-\u0010\u0010J\u0015\u00100\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101R*\u00102\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u0010\u0012R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00109R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010D\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER$\u0010F\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00138\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bF\u0010G\"\u0004\bH\u0010IR$\u0010J\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bJ\u0010E\"\u0004\bK\u0010\u0010¨\u0006N"}, d2 = {"Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/presentation/FinanceTooltipView;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/presentation/FinanceTooltipView$Params;", "initParams", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/presentation/FinanceTooltipView$Params;)V", "", "usedWidth", "parentWidth", "getTooltipWidth", "(II)I", "color", "", "setTooltipBackgroundColor", "(I)V", "prepareUi", "(Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/presentation/FinanceTooltipView$Params;)V", "", "sizedCouldChanged", AppMeasurementSdk.ConditionalUserProperty.VALUE, "onParamsChange", "(ZLru/ozon/app/android/storefront/widgets/financeHeaderWidget/presentation/FinanceTooltipView$Params;)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "width", "height", "oldw", "oldh", "onSizeChanged", "(IIII)V", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "setAnchorWidth", "Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/presentation/FinanceHeaderVO$TooltipVO;", "tooltipVO", "bindTooltip", "(Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/presentation/FinanceHeaderVO$TooltipVO;)V", "params", "Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/presentation/FinanceTooltipView$Params;", "getParams", "()Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/presentation/FinanceTooltipView$Params;", "setParams", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleTextAtomView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "subtitleTextAtomView", "Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/presentation/FinanceTooltipView$BeakSpecification;", "beakSpec", "Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/presentation/FinanceTooltipView$BeakSpecification;", "Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/presentation/FinanceBeakDrawer;", "beakDrawer", "Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/presentation/FinanceBeakDrawer;", "Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/presentation/FinanceBackgroundDrawer;", "backgroundDrawer", "Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/presentation/FinanceBackgroundDrawer;", "anchorWidth", "I", "isExpanded", "Z", "setExpanded", "(Z)V", "maxWidth", "setMaxWidth", "Params", "BeakSpecification", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FinanceTooltipView extends ViewGroup {
    private int anchorWidth;

    @NotNull
    private final FinanceBackgroundDrawer backgroundDrawer;

    @NotNull
    private final FinanceBeakDrawer beakDrawer;

    @NotNull
    private final BeakSpecification beakSpec;
    private boolean isExpanded;
    private int maxWidth;

    @NotNull
    private Params params;

    @NotNull
    private final TextAtomV2View subtitleTextAtomView;

    @NotNull
    private final TextAtomV2View titleTextAtomView;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/presentation/FinanceTooltipView$Params;", "", "", "radius", "<init>", "(F)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getRadius", "()F", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Params {
        private final float radius;

        public Params() {
            this(0.0f, 1, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && Float.compare(this.radius, ((Params) other).radius) == 0;
        }

        public final float getRadius() {
            return this.radius;
        }

        public int hashCode() {
            return Float.hashCode(this.radius);
        }

        @NotNull
        public String toString() {
            return C2942q.b(this.radius, "Params(radius=", ")");
        }

        public Params(float f7) {
            this.radius = f7;
        }

        public /* synthetic */ Params(float f7, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? 0.0f : f7);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinanceTooltipView(@NotNull Context context, @NotNull Params initParams) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initParams, "initParams");
        this.params = new Params(0.0f, 1, null);
        AttributeSet attributeSet = null;
        int i11 = 0;
        int i12 = 6;
        DefaultConstructorMarker defaultConstructorMarker = null;
        this.titleTextAtomView = new TextAtomV2View(context, attributeSet, i11, i12, defaultConstructorMarker);
        this.subtitleTextAtomView = new TextAtomV2View(context, attributeSet, i11, i12, defaultConstructorMarker);
        BeakSpecification beakSpecification = new BeakSpecification(0, 0, 0.0f, 7, null);
        this.beakSpec = beakSpecification;
        this.beakDrawer = new FinanceBeakDrawer(beakSpecification);
        this.backgroundDrawer = new FinanceBackgroundDrawer(beakSpecification.getHeight());
        prepareUi(initParams);
    }

    private final int getTooltipWidth(int usedWidth, int parentWidth) {
        int i11 = this.maxWidth;
        return i11 != 0 ? Math.min(i11, parentWidth) : this.isExpanded ? parentWidth : usedWidth;
    }

    private final void onParamsChange(boolean sizedCouldChanged, Params value) {
        this.backgroundDrawer.setBackgroundRadius(value.getRadius());
        if (sizedCouldChanged) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    private final void prepareUi(Params initParams) {
        if (initParams != null) {
            setParams(initParams);
        }
        addView(this.titleTextAtomView);
        addView(this.subtitleTextAtomView);
    }

    private final void setExpanded(boolean z11) {
        if (z11 != this.isExpanded) {
            this.isExpanded = z11;
        }
    }

    private final void setMaxWidth(int i11) {
        if (i11 != this.maxWidth) {
            this.maxWidth = i11;
        }
    }

    private final void setParams(Params params) {
        this.params = params;
        onParamsChange(true, params);
    }

    private final void setTooltipBackgroundColor(int color) {
        this.backgroundDrawer.setBackgroundColor(color);
        this.beakDrawer.setColor(color);
    }

    public final void bindTooltip(@NotNull FinanceHeaderVO.TooltipVO tooltipVO) {
        Intrinsics.checkNotNullParameter(tooltipVO, "tooltipVO");
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setTooltipBackgroundColor(styleParser.parseColor(context, tooltipVO.getBackgroundColor(), UniColors.LAYER_ACTIVE_FLOOR_2_INVERTED.getResId()));
        Boolean isExpanded = tooltipVO.getIsExpanded();
        setExpanded(isExpanded != null ? isExpanded.booleanValue() : false);
        Integer maxWidth = tooltipVO.getMaxWidth();
        setMaxWidth(maxWidth != null ? UiExtKt.toPx(maxWidth.intValue()) : 0);
        TextHolderKt.bind$default(this.titleTextAtomView, tooltipVO.getTitle(), null, 2, null);
        TextHolderKt.bindOrGone$default(this.subtitleTextAtomView, tooltipVO.getSubtitle(), null, 2, null);
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
        LayoutExtKt.layoutLeftTop(this.titleTextAtomView, getPaddingLeft(), getPaddingTop());
        View ifNotGone = ViewExtKt.getIfNotGone(this.subtitleTextAtomView);
        if (ifNotGone != null) {
            LayoutExtKt.layoutLeftTop(ifNotGone, getPaddingLeft(), this.titleTextAtomView.getBottom());
        }
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        measureChild(this.titleTextAtomView, widthMeasureSpec, heightMeasureSpec);
        measureChild(this.subtitleTextAtomView, widthMeasureSpec, heightMeasureSpec);
        View ifNotGone = ViewExtKt.getIfNotGone(this.subtitleTextAtomView);
        setMeasuredDimension(getTooltipWidth(Math.max(this.titleTextAtomView.getMeasuredWidth(), this.subtitleTextAtomView.getMeasuredWidth()) + getPaddingRight() + getPaddingLeft(), size), this.titleTextAtomView.getMeasuredHeight() + this.beakSpec.getHeight() + getPaddingBottom() + getPaddingTop() + (ifNotGone != null ? ifNotGone.getMeasuredHeight() : 0));
    }

    @Override // android.view.View
    protected void onSizeChanged(int width, int height, int oldw, int oldh) {
        this.backgroundDrawer.onSizeChanged(width, height);
        int i11 = this.anchorWidth;
        this.beakDrawer.onSizeChanged(width > i11 ? width - (i11 / 2.0f) : width / 2.0f, height);
    }

    public final void setAnchorWidth(int width) {
        this.anchorWidth = width;
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/presentation/FinanceTooltipView$BeakSpecification;", "", "", "width", "height", "", "radius", "<init>", "(IIF)V", "I", "getWidth", "()I", "getHeight", "F", "getRadius", "()F", "widthHalf", "getWidthHalf", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
