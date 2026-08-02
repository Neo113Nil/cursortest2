package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.view.scheme;

import Sc.InterfaceC4008j;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.Scroller;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import hd.C6915b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.scheme.SeatItemVO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.scheme.TravelRailwaySeatSelectWithSchemeVO;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.fintech.ui.input.CounterView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.common.Paddings;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0012\u0010\u0010J\u001f\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0010J\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\f2\u0006\u0010!\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010&\u001a\u00020\f2\u0006\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\nH\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\f2\u0006\u0010(\u001a\u00020\u0013H\u0016¢\u0006\u0004\b)\u0010#J\u000f\u0010*\u001a\u00020\fH\u0016¢\u0006\u0004\b*\u0010\u0010J\u001f\u0010-\u001a\u00020\f2\u0006\u0010+\u001a\u00020\u00132\u0006\u0010,\u001a\u00020\u0013H\u0016¢\u0006\u0004\b-\u0010\u0017J\u0017\u0010/\u001a\u00020\f2\u0006\u0010.\u001a\u00020\u0013H\u0016¢\u0006\u0004\b/\u0010#J\u0017\u00102\u001a\u00020\f2\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\fH\u0016¢\u0006\u0004\b4\u0010\u0010J\u0017\u00107\u001a\u00020\u001d2\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108J!\u0010;\u001a\u00020\f2\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u001d09¢\u0006\u0004\b;\u0010<J\u0015\u0010>\u001a\u00020\f2\u0006\u0010:\u001a\u00020=¢\u0006\u0004\b>\u0010?J\u0015\u0010B\u001a\u00020\f2\u0006\u0010A\u001a\u00020@¢\u0006\u0004\bB\u0010CR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010DR\u0014\u0010E\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010G\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010FR\u0016\u0010H\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010FR\u001b\u0010N\u001a\u00020I8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u0016\u0010O\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u001a\u0010R\u001a\u00020Q8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR$\u0010V\u001a\u0010\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u001d\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0018\u0010X\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010Y¨\u0006Z"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/view/scheme/TravelRailwaySchemeView;", "Landroid/view/View;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/view/scheme/TravelRailwaySchemeActions;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/view/scheme/TravelRailwayGestureConsumer;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/view/scheme/TravelRailwaySchemeController;", "controller", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/view/scheme/TravelRailwaySchemeController;)V", "", "target", "", "smoothScrollTo", "(F)V", "clampScroll", "()V", "onAttachedToWindow", "onDetachedFromWindow", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "computeScroll", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "", "disallow", "requestDisallowIntercept", "(Z)V", "dx", "scrollBy", "(I)V", "x", "y", "handleClick", "(FF)V", "velocityX", "startFling", "redraw", "width", "height", "updateViewBounds", "itemIndex", "centerOnItem", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/SeatItemVO;", "seatItem", "showTooltip", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/SeatItemVO;)V", "hideTooltip", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Lkotlin/Function1;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnItemClickListener", "(Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/view/scheme/TravelRailwaySchemeTooltipController;", "setTooltipController", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/view/scheme/TravelRailwaySchemeTooltipController;)V", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeVO$SchemeVO;", "schemeVO", "bind", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeVO$SchemeVO;)V", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/view/scheme/TravelRailwaySchemeController;", "horizontalOffset", "F", "contentWidth", "contentHeight", "Landroid/view/GestureDetector;", "gestureDetector$delegate", "LSc/j;", "getGestureDetector", "()Landroid/view/GestureDetector;", "gestureDetector", "wasScrolled", "Z", "Landroid/widget/Scroller;", "scroller", "Landroid/widget/Scroller;", "getScroller", "()Landroid/widget/Scroller;", "onItemClickListener", "Lkotlin/jvm/functions/Function1;", "tooltipController", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/view/scheme/TravelRailwaySchemeTooltipController;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes4.dex */
public final class TravelRailwaySchemeView extends View implements TravelRailwaySchemeActions, TravelRailwayGestureConsumer {
    private float contentHeight;
    private float contentWidth;

    @NotNull
    private final TravelRailwaySchemeController controller;

    /* renamed from: gestureDetector$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j gestureDetector;
    private final float horizontalOffset;
    private Function1<? super SeatItemVO, Boolean> onItemClickListener;

    @NotNull
    private final Scroller scroller;
    private TravelRailwaySchemeTooltipController tooltipController;
    private boolean wasScrolled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelRailwaySchemeView(@NotNull Context context, @NotNull TravelRailwaySchemeController controller) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.controller = controller;
        this.horizontalOffset = ResourceExtKt.toPxF(Paddings.PADDING_500.getPx(), context);
        this.gestureDetector = LazyUtilsKt.unsafeLazy(new TravelRailwaySchemeView$gestureDetector$2(context, this));
        this.scroller = new Scroller(context);
    }

    private final void clampScroll() {
        int c11 = C6915b.c(this.contentWidth - getWidth());
        if (c11 < 0) {
            c11 = 0;
        }
        setScrollX(h.e(getScrollX(), 0, c11));
    }

    private final GestureDetector getGestureDetector() {
        return (GestureDetector) this.gestureDetector.getValue();
    }

    private final void smoothScrollTo(float target) {
        float width = this.contentWidth - getWidth();
        if (width < 0.0f) {
            width = 0.0f;
        }
        float d11 = h.d(target, 0.0f, width);
        if (getScroller().isFinished()) {
            this.wasScrolled = true;
            getScroller().startScroll(getScrollX(), 0, (int) (d11 - getScrollX()), 0, CounterView.COUNTER_MAX_DEFAULT);
            awakenScrollBars();
            postInvalidateOnAnimation();
        }
    }

    public final void bind(@NotNull TravelRailwaySeatSelectWithSchemeVO.SchemeVO schemeVO) {
        Intrinsics.checkNotNullParameter(schemeVO, "schemeVO");
        this.controller.bind(schemeVO);
    }

    @Override // ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.view.scheme.TravelRailwaySchemeActions
    public void centerOnItem(int itemIndex) {
        if (this.controller.isIndexUnavailable(itemIndex)) {
            return;
        }
        RectF rectF = new RectF();
        this.controller.getBoundsByIndex(itemIndex, rectF);
        smoothScrollTo((rectF.centerX() - (getWidth() / 2.0f)) + this.horizontalOffset);
    }

    @Override // android.view.View
    public void computeScroll() {
        if (getScroller().computeScrollOffset()) {
            setScrollX(getScroller().getCurrX());
            clampScroll();
            awakenScrollBars();
            postInvalidateOnAnimation();
            return;
        }
        if (this.wasScrolled) {
            this.wasScrolled = false;
            this.controller.onScrollCompleted();
        }
    }

    @Override // ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.view.scheme.TravelRailwayGestureConsumer
    @NotNull
    public Scroller getScroller() {
        return this.scroller;
    }

    @Override // ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.view.scheme.TravelRailwayGestureConsumer
    public void handleClick(float x11, float y11) {
        this.controller.onClick(x11 - this.horizontalOffset, y11, getScrollX(), this.onItemClickListener);
    }

    @Override // ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.view.scheme.TravelRailwaySchemeActions
    public void hideTooltip() {
        TravelRailwaySchemeTooltipController travelRailwaySchemeTooltipController = this.tooltipController;
        if (travelRailwaySchemeTooltipController != null) {
            travelRailwaySchemeTooltipController.hideTooltip();
        }
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.controller.setViewCallbackAndInvalidate(this);
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        this.controller.setViewCallbackAndInvalidate(null);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float f7 = this.horizontalOffset;
        int save = canvas.save();
        canvas.translate(f7, 0.0f);
        try {
            this.controller.onDraw(canvas, getScrollX() - this.horizontalOffset, canvas.getWidth());
        } finally {
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(View.resolveSize((int) this.contentWidth, widthMeasureSpec), View.resolveSize((int) this.contentHeight, heightMeasureSpec));
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        ViewParent parent;
        Intrinsics.checkNotNullParameter(event, "event");
        boolean onTouchEvent = getGestureDetector().onTouchEvent(event);
        int actionMasked = event.getActionMasked();
        if ((actionMasked == 1 || actionMasked == 3) && (parent = getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        return onTouchEvent;
    }

    @Override // ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.view.scheme.TravelRailwaySchemeActions
    public void redraw() {
        invalidate();
    }

    @Override // ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.view.scheme.TravelRailwayGestureConsumer
    public void requestDisallowIntercept(boolean disallow) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(disallow);
        }
    }

    @Override // ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.view.scheme.TravelRailwayGestureConsumer
    public void scrollBy(int dx) {
        setScrollX(getScrollX() + dx);
        clampScroll();
        invalidate();
    }

    public final void setOnItemClickListener(@NotNull Function1<? super SeatItemVO, Boolean> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onItemClickListener = listener;
    }

    public final void setTooltipController(@NotNull TravelRailwaySchemeTooltipController listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.tooltipController = listener;
    }

    @Override // ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.view.scheme.TravelRailwaySchemeActions
    public void showTooltip(@NotNull SeatItemVO seatItem) {
        TravelRailwaySeatSelectWithSchemeVO.TooltipVO tooltip;
        Intrinsics.checkNotNullParameter(seatItem, "seatItem");
        if (this.tooltipController == null || (tooltip = seatItem.getSeat().getTooltip()) == null) {
            return;
        }
        RectF rectF = new RectF();
        this.controller.getBounds(seatItem, rectF);
        TravelRailwaySchemeTooltipController travelRailwaySchemeTooltipController = this.tooltipController;
        if (travelRailwaySchemeTooltipController != null) {
            travelRailwaySchemeTooltipController.showTooltip(getScrollX() - this.horizontalOffset, rectF, tooltip);
        }
    }

    @Override // ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.view.scheme.TravelRailwayGestureConsumer
    public void startFling(int velocityX) {
        int max = (int) Math.max(0.0f, this.contentWidth - getWidth());
        this.wasScrolled = true;
        getScroller().fling(getScrollX(), 0, velocityX, 0, 0, max, 0, 0);
        postInvalidateOnAnimation();
    }

    @Override // ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.view.scheme.TravelRailwaySchemeActions
    public void updateViewBounds(int width, int height) {
        float f7 = width;
        float f11 = height;
        if (f7 == this.contentWidth && f11 == this.contentHeight) {
            return;
        }
        this.contentWidth = (2 * this.horizontalOffset) + f7;
        this.contentHeight = f11;
        requestLayout();
        invalidate();
    }
}
