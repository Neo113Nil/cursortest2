package ru.ozon.app.android.storefront.ui.tooltip.internal;

import B90.Y;
import D90.c;
import E0.C2942q;
import Sc.o;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.view.d;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import ed.InterfaceC6346b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.ui.tooltip.TooltipBeakPosition;
import ru.ozon.app.android.storefront.ui.tooltip.TooltipVO;
import ru.ozon.app.android.uikit.R$style;
import ru.ozon.uni.R$drawable;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.LayoutExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0002lmB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0013\u001a\u00020\u000e2\b\b\u0001\u0010\u0011\u001a\u00020\b2\b\b\u0001\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0019\u001a\u00020\u000e2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\"\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\b2\u0006\u0010!\u001a\u00020\bH\u0014¢\u0006\u0004\b\"\u0010\u0014J/\u0010'\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\b2\u0006\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020\b2\u0006\u0010&\u001a\u00020\bH\u0014¢\u0006\u0004\b'\u0010(J7\u0010.\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020\b2\u0006\u0010+\u001a\u00020\b2\u0006\u0010,\u001a\u00020\b2\u0006\u0010-\u001a\u00020\bH\u0014¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\u000e2\u0006\u00101\u001a\u000200H\u0014¢\u0006\u0004\b2\u00103J\u0019\u00106\u001a\u00020\u001a2\b\u00105\u001a\u0004\u0018\u000104H\u0016¢\u0006\u0004\b6\u00107J\u0015\u0010:\u001a\u00020\u000e2\u0006\u00109\u001a\u000208¢\u0006\u0004\b:\u0010;J\u0017\u0010>\u001a\u00020\u000e2\b\u0010=\u001a\u0004\u0018\u00010<¢\u0006\u0004\b>\u0010?J!\u0010B\u001a\u00020\u000e2\u0012\u0010=\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020\u000e0@¢\u0006\u0004\bB\u0010CJ\u001d\u0010G\u001a\u00020\u000e2\u0006\u0010E\u001a\u00020D2\u0006\u0010F\u001a\u00020D¢\u0006\u0004\bG\u0010HR*\u0010I\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010R\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010QR\u0014\u0010T\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010W\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010Z\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010]\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0016\u0010_\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0016\u0010a\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0018\u0010c\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0018\u0010e\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0016\u0010h\u001a\u00020g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0018\u0010j\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010k¨\u0006n"}, d2 = {"Lru/ozon/app/android/storefront/ui/tooltip/internal/TooltipView;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/storefront/ui/tooltip/internal/TooltipView$Params;", "initParams", "<init>", "(Landroid/content/Context;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "usedWidth", "parentWidth", "getTooltipWidth", "(II)I", "color", "", "setTooltipBackgroundColor", "(I)V", "background", "iconColor", "setCloseIconColors", "(II)V", "showCloseIcon", "()V", "prepareUi-PAEcZ-0", "(Lru/ozon/app/android/storefront/ui/tooltip/internal/TooltipView$Params;)V", "prepareUi", "", "sizedCouldChanged", AppMeasurementSdk.ConditionalUserProperty.VALUE, "onParamsChange-L-nMY0k", "(ZF)V", "onParamsChange", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "width", "height", "oldw", "oldh", "onSizeChanged", "(IIII)V", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Lru/ozon/app/android/storefront/ui/tooltip/TooltipVO;", "tooltip", "bindTooltip", "(Lru/ozon/app/android/storefront/ui/tooltip/TooltipVO;)V", "Lru/ozon/app/android/storefront/ui/tooltip/internal/OnTooltipOutsideTouchListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnTooltipOutsideTouchListener", "(Lru/ozon/app/android/storefront/ui/tooltip/internal/OnTooltipOutsideTouchListener;)V", "Lkotlin/Function1;", "Landroid/view/View;", "setOnCloseIconClickListener", "(Lkotlin/jvm/functions/Function1;)V", "", "anchorX", "tooltipX", "setBeakAnchor", "(FF)V", "params", "F", "getParams-JApHkeY", "()F", "setParams-uS1LLYY", "(F)V", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleTextAtomView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "subtitleTextAtomView", "Landroid/widget/ImageView;", "closeIconView", "Landroid/widget/ImageView;", "Lru/ozon/app/android/storefront/ui/tooltip/internal/TooltipView$BeakSpecification;", "beakSpec", "Lru/ozon/app/android/storefront/ui/tooltip/internal/TooltipView$BeakSpecification;", "Lru/ozon/app/android/storefront/ui/tooltip/internal/TooltipBeakDrawer;", "beakDrawer", "Lru/ozon/app/android/storefront/ui/tooltip/internal/TooltipBeakDrawer;", "Lru/ozon/app/android/storefront/ui/tooltip/internal/TooltipBackgroundDrawer;", "backgroundDrawer", "Lru/ozon/app/android/storefront/ui/tooltip/internal/TooltipBackgroundDrawer;", "isExpanded", "Z", "minWidth", "I", "maxWidth", "Ljava/lang/Integer;", "beakAnchor", "Ljava/lang/Float;", "Lru/ozon/app/android/storefront/ui/tooltip/TooltipBeakPosition;", "beakPosition", "Lru/ozon/app/android/storefront/ui/tooltip/TooltipBeakPosition;", "onTooltipOutsideTouchListener", "Lru/ozon/app/android/storefront/ui/tooltip/internal/OnTooltipOutsideTouchListener;", "Params", "BeakSpecification", "tooltip_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
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
    private OnTooltipOutsideTouchListener onTooltipOutsideTouchListener;
    private float params;

    @NotNull
    private final TextAtomV2View subtitleTextAtomView;

    @NotNull
    private final TextAtomV2View titleTextAtomView;

    @InterfaceC6346b
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0012\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/storefront/ui/tooltip/internal/TooltipView$Params;", "", "", "radius", "constructor-impl", "(F)F", "", "toString-impl", "(F)Ljava/lang/String;", "toString", "", "hashCode-impl", "(F)I", "hashCode", "other", "", "equals-impl", "(FLjava/lang/Object;)Z", "equals", "F", "getRadius", "()F", "tooltip_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Params {
        private final float radius;

        private /* synthetic */ Params(float f7) {
            this.radius = f7;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Params m1026boximpl(float f7) {
            return new Params(f7);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static float m1027constructorimpl(float f7) {
            return f7;
        }

        /* renamed from: constructor-impl$default, reason: not valid java name */
        public static /* synthetic */ float m1028constructorimpl$default(float f7, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i11 & 1) != 0) {
                f7 = 0.0f;
            }
            return m1027constructorimpl(f7);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m1029equalsimpl(float f7, Object obj) {
            return (obj instanceof Params) && Float.compare(f7, ((Params) obj).getRadius()) == 0;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m1030hashCodeimpl(float f7) {
            return Float.hashCode(f7);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m1031toStringimpl(float f7) {
            return C2942q.b(f7, "Params(radius=", ")");
        }

        public boolean equals(Object obj) {
            return m1029equalsimpl(this.radius, obj);
        }

        public int hashCode() {
            return m1030hashCodeimpl(this.radius);
        }

        public String toString() {
            return m1031toStringimpl(this.radius);
        }

        /* renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ float getRadius() {
            return this.radius;
        }
    }

    public /* synthetic */ TooltipView(Context context, float f7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, f7);
    }

    private final int getTooltipWidth(int usedWidth, int parentWidth) {
        Integer num = this.maxWidth;
        return num != null ? Math.max(Math.min(num.intValue(), parentWidth), this.minWidth) : this.isExpanded ? parentWidth : Math.max(usedWidth, this.minWidth);
    }

    /* renamed from: onParamsChange-L-nMY0k, reason: not valid java name */
    private final void m1023onParamsChangeLnMY0k(boolean sizedCouldChanged, float value) {
        this.backgroundDrawer.setBackgroundRadius(value);
        if (sizedCouldChanged) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    /* renamed from: prepareUi-PAEcZ-0, reason: not valid java name */
    private final void m1024prepareUiPAEcZ0(Params initParams) {
        if (initParams != null) {
            m1025setParamsuS1LLYY(initParams.getRadius());
        }
        addView(this.titleTextAtomView);
        addView(this.subtitleTextAtomView);
        addView(this.closeIconView);
    }

    private final void setCloseIconColors(int background, int iconColor) {
        this.closeIconView.setBackgroundColor(background);
        this.closeIconView.setColorFilter(new PorterDuffColorFilter(iconColor, PorterDuff.Mode.SRC_IN));
    }

    /* renamed from: setParams-uS1LLYY, reason: not valid java name */
    private final void m1025setParamsuS1LLYY(float f7) {
        this.params = f7;
        m1023onParamsChangeLnMY0k(true, f7);
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
        d dVar = new d(getContext(), R$style.OzonTheme);
        StyleParser styleParser = StyleParser.INSTANCE;
        setTooltipBackgroundColor(styleParser.parseColor(dVar, tooltip.getStyle().getBackground().getToken(), UniColors.LAYER_FLOOR_0_INVERTED.getResId()));
        this.minWidth = tooltip.getMinWidth();
        this.maxWidth = tooltip.getMaxWidth();
        this.isExpanded = tooltip.getIsExpanded();
        this.beakPosition = tooltip.getBeakPosition();
        TextHolderKt.bind$default(this.titleTextAtomView, tooltip.getTitle(), null, 2, null);
        TextHolderKt.bindOrGone$default(this.subtitleTextAtomView, tooltip.getSubtitle(), null, 2, null);
        if (tooltip.getHasCloseIcon()) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int parseColor = styleParser.parseColor(context, tooltip.getStyle().getCloseIconBackground().getToken(), UniColors.CLEAR_LIGHT_KEY_0.getResId());
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            setCloseIconColors(parseColor, styleParser.parseColor(context2, tooltip.getStyle().getCloseIconColor().getToken(), UniColors.GRAPHIC_TERTIARY_INVERTED.getResId()));
            showCloseIcon();
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
        setMeasuredDimension(getTooltipWidth(Math.max(this.titleTextAtomView.getMeasuredWidth(), this.subtitleTextAtomView.getMeasuredWidth()) + getPaddingRight() + getPaddingLeft() + height + measuredWidth, size), this.titleTextAtomView.getMeasuredHeight() + getPaddingBottom() + getPaddingTop() + (ifNotGone2 != null ? ifNotGone2.getMeasuredHeight() : 0) + i11);
    }

    @Override // android.view.View
    protected void onSizeChanged(int width, int height, int oldw, int oldh) {
        this.backgroundDrawer.onSizeChanged(width, height, this.beakPosition);
        TooltipBeakDrawer tooltipBeakDrawer = this.beakDrawer;
        Float f7 = this.beakAnchor;
        tooltipBeakDrawer.onSizeChanged(f7 != null ? f7.floatValue() : width / 2.0f, width, height, this.beakPosition);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        super.onTouchEvent(event);
        if (event == null || event.getAction() != 4) {
            return false;
        }
        OnTooltipOutsideTouchListener onTooltipOutsideTouchListener = this.onTooltipOutsideTouchListener;
        if (onTooltipOutsideTouchListener != null) {
            TooltipPopup.prepareUi$lambda$3((TooltipPopup) ((Y) onTooltipOutsideTouchListener).f3128a, event);
        }
        return this.onTooltipOutsideTouchListener != null;
    }

    public final void setBeakAnchor(float anchorX, float tooltipX) {
        this.beakAnchor = Float.valueOf(Math.min(anchorX - tooltipX, (getMeasuredWidth() - this.beakSpec.getWidth()) - this.params));
    }

    public final void setOnCloseIconClickListener(@NotNull Function1<? super View, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.closeIconView.setOnClickListener(new c(listener, 12));
    }

    public final void setOnTooltipOutsideTouchListener(OnTooltipOutsideTouchListener listener) {
        this.onTooltipOutsideTouchListener = listener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private TooltipView(Context context, float f7) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        this.params = Params.m1028constructorimpl$default(0.0f, 1, null);
        this.titleTextAtomView = new TextAtomV2View(context, null, 0, 6, null);
        this.subtitleTextAtomView = new TextAtomV2View(context, null, 0, 6, null);
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
        m1024prepareUiPAEcZ0(Params.m1026boximpl(f7));
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/storefront/ui/tooltip/internal/TooltipView$BeakSpecification;", "", "width", "", "height", "radius", "", "<init>", "(IIF)V", "getWidth", "()I", "getHeight", "getRadius", "()F", "widthHalf", "getWidthHalf", "tooltip_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

        public final int getWidth() {
            return this.width;
        }

        public final float getWidthHalf() {
            return this.widthHalf;
        }

        public /* synthetic */ BeakSpecification(int i11, int i12, float f7, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? UiExtKt.toPx(16) : i11, (i13 & 2) != 0 ? UiExtKt.toPx(7) : i12, (i13 & 4) != 0 ? UiExtKt.toPxF(2.0f) : f7);
        }
    }
}
