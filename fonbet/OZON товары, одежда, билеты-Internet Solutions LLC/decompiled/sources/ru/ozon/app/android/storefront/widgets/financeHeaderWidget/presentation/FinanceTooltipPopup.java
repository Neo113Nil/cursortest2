package ru.ozon.app.android.storefront.widgets.financeHeaderWidget.presentation;

import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.storefront.widgets.financeHeaderWidget.presentation.FinanceHeaderVO;
import ru.ozon.app.android.storefront.widgets.financeHeaderWidget.presentation.FinanceTooltipView;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0002FGB[\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010#\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\r\u0010&\u001a\u00020%¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\u0016¢\u0006\u0004\b(\u0010\u001aJ\u0015\u0010*\u001a\u00020%2\u0006\u0010)\u001a\u00020!¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010-R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010.R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010/R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010/R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010/R\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010/R\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010/R\u0014\u0010\u000e\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010/R\u0016\u0010\u000f\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001b\u00108\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001b\u0010=\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u00105\u001a\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010E¨\u0006H"}, d2 = {"Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/presentation/FinanceTooltipPopup;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/presentation/FinanceHeaderVO$TooltipVO;", "tooltipVO", "", "radius", "", "horizontalMargin", "marginFromAnchor", "leftPadding", "topPadding", "rightPadding", "bottomPadding", "anchorWidth", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/presentation/FinanceHeaderVO$TooltipVO;FIIIIIII)V", "Landroid/view/View;", "anchorView", "Landroid/view/WindowManager$LayoutParams;", "outParams", "", "computePosition", "(Landroid/view/View;Landroid/view/WindowManager$LayoutParams;I)V", "prepareUi", "()V", "Landroidx/lifecycle/J;", "owner", "onDestroy", "(Landroidx/lifecycle/J;)V", "show", "(Landroid/view/View;)V", "", "timeMillis", "showForAWhile", "(Landroid/view/View;J)V", "", "isShowing", "()Z", "dismiss", "delayMillis", "dismissWithDelay", "(J)Z", "Landroid/content/Context;", "Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/presentation/FinanceHeaderVO$TooltipVO;", "F", "I", "Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/presentation/FinanceTooltipView;", "tooltipView", "Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/presentation/FinanceTooltipView;", "Landroid/os/Handler;", "autoDismissHandler$delegate", "LSc/j;", "getAutoDismissHandler", "()Landroid/os/Handler;", "autoDismissHandler", "Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/presentation/FinanceTooltipPopup$AutoDismissRunnable;", "autoDismissRunnable$delegate", "getAutoDismissRunnable", "()Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/presentation/FinanceTooltipPopup$AutoDismissRunnable;", "autoDismissRunnable", "tooltipLayoutParams", "Landroid/view/WindowManager$LayoutParams;", "Landroid/graphics/Rect;", "displayFrame", "Landroid/graphics/Rect;", "", "anchorPos", "[I", "Builder", "AutoDismissRunnable", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FinanceTooltipPopup implements DefaultLifecycleObserver {

    @NotNull
    private final int[] anchorPos;
    private int anchorWidth;

    /* renamed from: autoDismissHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j autoDismissHandler;

    /* renamed from: autoDismissRunnable$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j autoDismissRunnable;
    private final int bottomPadding;

    @NotNull
    private final Context context;

    @NotNull
    private final Rect displayFrame;
    private final int horizontalMargin;
    private final int leftPadding;
    private final int marginFromAnchor;
    private final float radius;
    private final int rightPadding;

    @NotNull
    private final WindowManager.LayoutParams tooltipLayoutParams;

    @NotNull
    private final FinanceHeaderVO.TooltipVO tooltipVO;

    @NotNull
    private final FinanceTooltipView tooltipView;
    private final int topPadding;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/presentation/FinanceTooltipPopup$AutoDismissRunnable;", "Ljava/lang/Runnable;", "tooltipPopup", "Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/presentation/FinanceTooltipPopup;", "<init>", "(Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/presentation/FinanceTooltipPopup;)V", "run", "", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class AutoDismissRunnable implements Runnable {

        @NotNull
        private final FinanceTooltipPopup tooltipPopup;

        public AutoDismissRunnable(@NotNull FinanceTooltipPopup tooltipPopup) {
            Intrinsics.checkNotNullParameter(tooltipPopup, "tooltipPopup");
            this.tooltipPopup = tooltipPopup;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.tooltipPopup.isShowing()) {
                this.tooltipPopup.dismiss();
            }
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0007J\u0010\u0010\u0014\u001a\u00020\u00002\b\b\u0001\u0010\u0013\u001a\u00020\tJ\u0010\u0010\u0015\u001a\u00020\u00002\b\b\u0001\u0010\u0013\u001a\u00020\u000bJ\u0010\u0010\u0016\u001a\u00020\u00002\b\b\u0001\u0010\u0013\u001a\u00020\u000bJ\u0010\u0010\u0017\u001a\u00020\u00002\b\b\u0001\u0010\u0013\u001a\u00020\u000bJ\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u000bJ\u0006\u0010\u001a\u001a\u00020\u001bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/presentation/FinanceTooltipPopup$Builder;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "tooltipVO", "Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/presentation/FinanceHeaderVO$TooltipVO;", "radius", "", "horizontalMargin", "", "marginFromAnchor", "paddingLeft", "paddingTop", "paddingRight", "paddingBottom", "anchorWidth", "setTooltip", AppMeasurementSdk.ConditionalUserProperty.VALUE, "setRadius", "setHorizontalMargin", "setMarginFromAnchor", "setPaddings", "setAnchorWidth", "width", "build", "Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/presentation/FinanceTooltipPopup;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {
        private int anchorWidth;

        @NotNull
        private final Context context;
        private int horizontalMargin;
        private int marginFromAnchor;
        private int paddingBottom;
        private int paddingLeft;
        private int paddingRight;
        private int paddingTop;
        private float radius;
        private FinanceHeaderVO.TooltipVO tooltipVO;

        public Builder(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.context = context;
        }

        @NotNull
        public final FinanceTooltipPopup build() {
            Context context = this.context;
            FinanceHeaderVO.TooltipVO tooltipVO = this.tooltipVO;
            if (tooltipVO != null) {
                return new FinanceTooltipPopup(context, tooltipVO, this.radius, this.horizontalMargin, this.marginFromAnchor, this.paddingLeft, this.paddingTop, this.paddingRight, this.paddingBottom, this.anchorWidth, null);
            }
            Intrinsics.n("tooltipVO");
            throw null;
        }

        @NotNull
        public final Builder setAnchorWidth(int width) {
            this.anchorWidth = width;
            return this;
        }

        @NotNull
        public final Builder setHorizontalMargin(int value) {
            this.horizontalMargin = value;
            return this;
        }

        @NotNull
        public final Builder setMarginFromAnchor(int value) {
            this.marginFromAnchor = value;
            return this;
        }

        @NotNull
        public final Builder setPaddings(int value) {
            this.paddingRight = value;
            this.paddingLeft = value;
            this.paddingTop = value;
            this.paddingBottom = value;
            return this;
        }

        @NotNull
        public final Builder setRadius(float value) {
            this.radius = value;
            return this;
        }

        @NotNull
        public final Builder setTooltip(@NotNull FinanceHeaderVO.TooltipVO value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.tooltipVO = value;
            return this;
        }
    }

    public /* synthetic */ FinanceTooltipPopup(Context context, FinanceHeaderVO.TooltipVO tooltipVO, float f7, int i11, int i12, int i13, int i14, int i15, int i16, int i17, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, tooltipVO, f7, i11, i12, i13, i14, i15, i16, i17);
    }

    private final void computePosition(View anchorView, WindowManager.LayoutParams outParams, int horizontalMargin) {
        outParams.token = anchorView.getApplicationWindowToken();
        View rootView = anchorView.getRootView();
        Intrinsics.checkNotNullExpressionValue(rootView, "getRootView(...)");
        rootView.getWindowVisibleDisplayFrame(this.displayFrame);
        anchorView.getLocationOnScreen(this.anchorPos);
        this.tooltipView.measure(View.MeasureSpec.makeMeasureSpec(this.displayFrame.width() - (horizontalMargin * 2), LinearLayoutManager.INVALID_OFFSET), View.MeasureSpec.makeMeasureSpec(0, 0));
        outParams.width = this.tooltipView.getMeasuredWidth();
        outParams.height = this.tooltipView.getMeasuredHeight();
        outParams.gravity = 53;
        Integer J11 = C7705l.J(this.anchorPos, 1);
        if (J11 != null) {
            outParams.y = (J11.intValue() - this.tooltipView.getMeasuredHeight()) - this.marginFromAnchor;
        }
        outParams.x = horizontalMargin;
    }

    private final Handler getAutoDismissHandler() {
        return (Handler) this.autoDismissHandler.getValue();
    }

    private final AutoDismissRunnable getAutoDismissRunnable() {
        return (AutoDismissRunnable) this.autoDismissRunnable.getValue();
    }

    private final void prepareUi() {
        WindowManager.LayoutParams layoutParams = this.tooltipLayoutParams;
        layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.flags = 8;
        FinanceTooltipView financeTooltipView = this.tooltipView;
        financeTooltipView.setPadding(this.leftPadding, this.topPadding, this.rightPadding, this.bottomPadding);
        financeTooltipView.setAnchorWidth(this.anchorWidth);
        financeTooltipView.bindTooltip(this.tooltipVO);
    }

    public final void dismiss() {
        if (isShowing()) {
            Object systemService = this.context.getSystemService("window");
            Intrinsics.g(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            ((WindowManager) systemService).removeView(this.tooltipView);
            getAutoDismissHandler().removeCallbacks(getAutoDismissRunnable());
        }
    }

    public final boolean dismissWithDelay(long delayMillis) {
        return getAutoDismissHandler().postDelayed(getAutoDismissRunnable(), delayMillis);
    }

    public final boolean isShowing() {
        return this.tooltipView.getParent() != null;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        dismiss();
    }

    public final void show(@NotNull View anchorView) {
        Intrinsics.checkNotNullParameter(anchorView, "anchorView");
        if (isShowing()) {
            dismiss();
        }
        computePosition(anchorView, this.tooltipLayoutParams, this.horizontalMargin);
        Object systemService = this.context.getSystemService("window");
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        ((WindowManager) systemService).addView(this.tooltipView, this.tooltipLayoutParams);
    }

    public final void showForAWhile(@NotNull View anchorView, long timeMillis) {
        Intrinsics.checkNotNullParameter(anchorView, "anchorView");
        show(anchorView);
        dismissWithDelay(timeMillis);
    }

    private FinanceTooltipPopup(Context context, FinanceHeaderVO.TooltipVO tooltipVO, float f7, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        this.context = context;
        this.tooltipVO = tooltipVO;
        this.radius = f7;
        this.horizontalMargin = i11;
        this.marginFromAnchor = i12;
        this.leftPadding = i13;
        this.topPadding = i14;
        this.rightPadding = i15;
        this.bottomPadding = i16;
        this.anchorWidth = i17;
        this.tooltipView = new FinanceTooltipView(context, new FinanceTooltipView.Params(f7));
        n nVar = n.NONE;
        this.autoDismissHandler = k.a(nVar, FinanceTooltipPopup$autoDismissHandler$2.INSTANCE);
        this.autoDismissRunnable = k.a(nVar, new FinanceTooltipPopup$autoDismissRunnable$2(this));
        this.tooltipLayoutParams = new WindowManager.LayoutParams();
        this.displayFrame = new Rect();
        this.anchorPos = new int[2];
        prepareUi();
    }
}
