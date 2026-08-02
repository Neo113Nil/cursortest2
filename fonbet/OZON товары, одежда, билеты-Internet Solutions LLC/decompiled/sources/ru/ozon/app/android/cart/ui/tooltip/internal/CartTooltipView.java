package ru.ozon.app.android.cart.ui.tooltip.internal;

import B90.N;
import E0.C2942q;
import Sc.o;
import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import ed.InterfaceC6346b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.ui.tooltip.CartTooltipBeakPosition;
import ru.ozon.app.android.cart.ui.tooltip.CartTooltipVO;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.LayoutExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0002`aB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\u00020\u000e2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010\"\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010 \u001a\u00020\b2\u0006\u0010!\u001a\u00020\bH\u0014¢\u0006\u0004\b\"\u0010#J7\u0010)\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\b2\u0006\u0010&\u001a\u00020\b2\u0006\u0010'\u001a\u00020\b2\u0006\u0010(\u001a\u00020\bH\u0014¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020+H\u0014¢\u0006\u0004\b-\u0010.J\u0019\u00101\u001a\u00020\u00142\b\u00100\u001a\u0004\u0018\u00010/H\u0016¢\u0006\u0004\b1\u00102J\u0015\u00105\u001a\u00020\u000e2\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J\u0017\u00109\u001a\u00020\u000e2\b\u00108\u001a\u0004\u0018\u000107¢\u0006\u0004\b9\u0010:J\u001d\u0010>\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u00020;¢\u0006\u0004\b>\u0010?R*\u0010@\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u0014\u0010G\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010I\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010HR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010N\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010Q\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010S\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010U\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0018\u0010W\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0018\u0010Y\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010\\\u001a\u00020[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0018\u0010^\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_¨\u0006b"}, d2 = {"Lru/ozon/app/android/cart/ui/tooltip/internal/CartTooltipView;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/cart/ui/tooltip/internal/CartTooltipView$Params;", "initParams", "<init>", "(Landroid/content/Context;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "usedWidth", "parentWidth", "getTooltipWidth", "(II)I", "color", "", "setTooltipBackgroundColor", "(I)V", "prepareUi-9M42X54", "(Lru/ozon/app/android/cart/ui/tooltip/internal/CartTooltipView$Params;)V", "prepareUi", "", "sizedCouldChanged", AppMeasurementSdk.ConditionalUserProperty.VALUE, "onParamsChange-XfPV-Yo", "(ZF)V", "onParamsChange", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "width", "height", "oldw", "oldh", "onSizeChanged", "(IIII)V", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Lru/ozon/app/android/cart/ui/tooltip/CartTooltipVO;", "tooltip", "bindTooltip", "(Lru/ozon/app/android/cart/ui/tooltip/CartTooltipVO;)V", "Lru/ozon/app/android/cart/ui/tooltip/internal/OnTooltipOutsideTouchListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnTooltipOutsideTouchListener", "(Lru/ozon/app/android/cart/ui/tooltip/internal/OnTooltipOutsideTouchListener;)V", "", "anchorX", "tooltipX", "setBeakAnchor", "(FF)V", "params", "F", "getParams-8ZHHWMI", "()F", "setParams-Iof8rx8", "(F)V", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleTextAtomView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "subtitleTextAtomView", "Lru/ozon/app/android/cart/ui/tooltip/internal/CartTooltipView$BeakSpecification;", "beakSpec", "Lru/ozon/app/android/cart/ui/tooltip/internal/CartTooltipView$BeakSpecification;", "Lru/ozon/app/android/cart/ui/tooltip/internal/CartBeakDrawer;", "beakDrawer", "Lru/ozon/app/android/cart/ui/tooltip/internal/CartBeakDrawer;", "Lru/ozon/app/android/cart/ui/tooltip/internal/CartBackgroundDrawer;", "backgroundDrawer", "Lru/ozon/app/android/cart/ui/tooltip/internal/CartBackgroundDrawer;", "isExpanded", "Z", "minWidth", "I", "maxWidth", "Ljava/lang/Integer;", "beakAnchor", "Ljava/lang/Float;", "Lru/ozon/app/android/cart/ui/tooltip/CartTooltipBeakPosition;", "beakPosition", "Lru/ozon/app/android/cart/ui/tooltip/CartTooltipBeakPosition;", "onTooltipOutsideTouchListener", "Lru/ozon/app/android/cart/ui/tooltip/internal/OnTooltipOutsideTouchListener;", "Params", "BeakSpecification", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CartTooltipView extends ViewGroup {

    @NotNull
    private final CartBackgroundDrawer backgroundDrawer;
    private Float beakAnchor;

    @NotNull
    private final CartBeakDrawer beakDrawer;

    @NotNull
    private CartTooltipBeakPosition beakPosition;

    @NotNull
    private final BeakSpecification beakSpec;
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
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0012\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/cart/ui/tooltip/internal/CartTooltipView$Params;", "", "", "radius", "constructor-impl", "(F)F", "", "toString-impl", "(F)Ljava/lang/String;", "toString", "", "hashCode-impl", "(F)I", "hashCode", "other", "", "equals-impl", "(FLjava/lang/Object;)Z", "equals", "F", "getRadius", "()F", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Params {
        private final float radius;

        private /* synthetic */ Params(float f7) {
            this.radius = f7;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Params m557boximpl(float f7) {
            return new Params(f7);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static float m558constructorimpl(float f7) {
            return f7;
        }

        /* renamed from: constructor-impl$default, reason: not valid java name */
        public static /* synthetic */ float m559constructorimpl$default(float f7, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i11 & 1) != 0) {
                f7 = 0.0f;
            }
            return m558constructorimpl(f7);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m560equalsimpl(float f7, Object obj) {
            return (obj instanceof Params) && Float.compare(f7, ((Params) obj).getRadius()) == 0;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m561hashCodeimpl(float f7) {
            return Float.hashCode(f7);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m562toStringimpl(float f7) {
            return C2942q.b(f7, "Params(radius=", ")");
        }

        public boolean equals(Object obj) {
            return m560equalsimpl(this.radius, obj);
        }

        public int hashCode() {
            return m561hashCodeimpl(this.radius);
        }

        public String toString() {
            return m562toStringimpl(this.radius);
        }

        /* renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ float getRadius() {
            return this.radius;
        }
    }

    public /* synthetic */ CartTooltipView(Context context, float f7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, f7);
    }

    private final int getTooltipWidth(int usedWidth, int parentWidth) {
        Integer num = this.maxWidth;
        return num != null ? Math.max(Math.min(num.intValue(), parentWidth), this.minWidth) : this.isExpanded ? parentWidth : Math.max(usedWidth, this.minWidth);
    }

    /* renamed from: onParamsChange-XfPV-Yo, reason: not valid java name */
    private final void m554onParamsChangeXfPVYo(boolean sizedCouldChanged, float value) {
        this.backgroundDrawer.setBackgroundRadius(value);
        if (sizedCouldChanged) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    /* renamed from: prepareUi-9M42X54, reason: not valid java name */
    private final void m555prepareUi9M42X54(Params initParams) {
        if (initParams != null) {
            m556setParamsIof8rx8(initParams.getRadius());
        }
        addView(this.titleTextAtomView);
        addView(this.subtitleTextAtomView);
    }

    /* renamed from: setParams-Iof8rx8, reason: not valid java name */
    private final void m556setParamsIof8rx8(float f7) {
        this.params = f7;
        m554onParamsChangeXfPVYo(true, f7);
    }

    private final void setTooltipBackgroundColor(int color) {
        this.backgroundDrawer.setBackgroundColor(color);
        this.beakDrawer.setColor(color);
    }

    public final void bindTooltip(@NotNull CartTooltipVO tooltip) {
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
        CartTooltipBeakPosition cartTooltipBeakPosition = this.beakPosition;
        if (!(cartTooltipBeakPosition instanceof CartTooltipBeakPosition.Vertical.Top)) {
            cartTooltipBeakPosition = null;
        }
        int height = cartTooltipBeakPosition != null ? this.beakSpec.getHeight() : 0;
        CartTooltipBeakPosition cartTooltipBeakPosition2 = this.beakPosition;
        int height2 = (cartTooltipBeakPosition2 instanceof CartTooltipBeakPosition.Left ? cartTooltipBeakPosition2 : null) != null ? this.beakSpec.getHeight() : 0;
        LayoutExtKt.layoutLeftTop(this.titleTextAtomView, getPaddingLeft() + left + height2, getPaddingTop() + top + height);
        View ifNotGone = ViewExtKt.getIfNotGone(this.subtitleTextAtomView);
        if (ifNotGone != null) {
            LayoutExtKt.layoutLeftTop(ifNotGone, getPaddingLeft() + left + height2, this.titleTextAtomView.getBottom());
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
        CartTooltipBeakPosition cartTooltipBeakPosition = this.beakPosition;
        if (cartTooltipBeakPosition instanceof CartTooltipBeakPosition.Vertical) {
            i11 = this.beakSpec.getHeight();
        } else {
            if (!(cartTooltipBeakPosition instanceof CartTooltipBeakPosition.Horizontal)) {
                throw new o();
            }
            i11 = 0;
        }
        CartTooltipBeakPosition cartTooltipBeakPosition2 = this.beakPosition;
        if (cartTooltipBeakPosition2 instanceof CartTooltipBeakPosition.Vertical) {
            height = 0;
        } else {
            if (!(cartTooltipBeakPosition2 instanceof CartTooltipBeakPosition.Horizontal)) {
                throw new o();
            }
            height = this.beakSpec.getHeight();
        }
        View ifNotGone = ViewExtKt.getIfNotGone(this.subtitleTextAtomView);
        setMeasuredDimension(getTooltipWidth(Math.max(this.titleTextAtomView.getMeasuredWidth(), this.subtitleTextAtomView.getMeasuredWidth()) + getPaddingRight() + getPaddingLeft() + height, size), this.titleTextAtomView.getMeasuredHeight() + getPaddingBottom() + getPaddingTop() + (ifNotGone != null ? ifNotGone.getMeasuredHeight() : 0) + i11);
    }

    @Override // android.view.View
    protected void onSizeChanged(int width, int height, int oldw, int oldh) {
        this.backgroundDrawer.onSizeChanged(width, height, this.beakPosition);
        CartBeakDrawer cartBeakDrawer = this.beakDrawer;
        Float f7 = this.beakAnchor;
        cartBeakDrawer.onSizeChanged(f7 != null ? f7.floatValue() : width / 2.0f, width, height, this.beakPosition);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        super.onTouchEvent(event);
        if (event == null || event.getAction() != 4) {
            return false;
        }
        OnTooltipOutsideTouchListener onTooltipOutsideTouchListener = this.onTooltipOutsideTouchListener;
        if (onTooltipOutsideTouchListener != null) {
            CartTooltipPopup.prepareUi$lambda$3((CartTooltipPopup) ((N) onTooltipOutsideTouchListener).f3114a, event);
        }
        return this.onTooltipOutsideTouchListener != null;
    }

    public final void setBeakAnchor(float anchorX, float tooltipX) {
        this.beakAnchor = Float.valueOf(Math.min(anchorX - tooltipX, (getMeasuredWidth() - this.beakSpec.getWidth()) - this.params));
    }

    public final void setOnTooltipOutsideTouchListener(OnTooltipOutsideTouchListener listener) {
        this.onTooltipOutsideTouchListener = listener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private CartTooltipView(Context context, float f7) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        this.params = Params.m559constructorimpl$default(0.0f, 1, null);
        this.titleTextAtomView = new TextAtomV2View(context, null, 0, 6, null);
        this.subtitleTextAtomView = new TextAtomV2View(context, null, 0, 6, null);
        BeakSpecification beakSpecification = new BeakSpecification(0, 0, 0.0f, 7, null);
        this.beakSpec = beakSpecification;
        this.beakDrawer = new CartBeakDrawer(beakSpecification);
        this.backgroundDrawer = new CartBackgroundDrawer(beakSpecification.getHeight());
        this.maxWidth = 0;
        this.beakAnchor = Float.valueOf(0.0f);
        this.beakPosition = CartTooltipBeakPosition.INSTANCE.getDefaultCartTooltipBeakPosition();
        m555prepareUi9M42X54(Params.m557boximpl(f7));
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/cart/ui/tooltip/internal/CartTooltipView$BeakSpecification;", "", "width", "", "height", "radius", "", "<init>", "(IIF)V", "getWidth", "()I", "getHeight", "getRadius", "()F", "widthHalf", "getWidthHalf", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
