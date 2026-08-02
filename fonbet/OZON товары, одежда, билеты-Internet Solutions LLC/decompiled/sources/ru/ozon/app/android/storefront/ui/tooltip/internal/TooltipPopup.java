package ru.ozon.app.android.storefront.ui.tooltip.internal;

import B90.Y;
import Sc.InterfaceC4008j;
import Sc.o;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.storefront.ui.tooltip.TooltipBeakPosition;
import ru.ozon.app.android.storefront.ui.tooltip.TooltipVO;
import ru.ozon.app.android.storefront.ui.tooltip.internal.TooltipView;
import ru.ozon.app.android.utils.LazyUtilsKt;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001HBG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fB1\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u0011JA\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J+\u0010'\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u001a¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u001c¢\u0006\u0004\b+\u0010 J\u0015\u0010-\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020%¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010/R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00100R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00101R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00101R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00101R\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00101R\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00101R\u0018\u00103\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u001b\u0010:\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001b\u0010?\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u00107\u001a\u0004\b=\u0010>R\u0014\u0010@\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010G¨\u0006I"}, d2 = {"Lru/ozon/app/android/storefront/ui/tooltip/internal/TooltipPopup;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/storefront/ui/tooltip/TooltipVO;", "tooltipVO", "", "marginFromAnchor", "leftPadding", "topPadding", "rightPadding", "bottomPadding", "", "radius", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/storefront/ui/tooltip/TooltipVO;IIIIIF)V", "padding", "(Landroid/content/Context;Lru/ozon/app/android/storefront/ui/tooltip/TooltipVO;IIF)V", "Landroid/view/View;", "anchorView", "Landroid/view/WindowManager$LayoutParams;", "outParams", "leftMargin", "rightMargin", "Lru/ozon/app/android/storefront/ui/tooltip/TooltipBeakPosition;", "beakPosition", "", "centerAboutAnchor", "", "computePosition", "(Landroid/view/View;Landroid/view/WindowManager$LayoutParams;IILru/ozon/app/android/storefront/ui/tooltip/TooltipBeakPosition;Z)V", "prepareUi", "()V", "Landroidx/lifecycle/J;", "owner", "onDestroy", "(Landroidx/lifecycle/J;)V", "", "dismissTimeout", "show", "(Landroid/view/View;ZLjava/lang/Long;)V", "isShowing", "()Z", "dismiss", "delayMillis", "dismissWithDelay", "(J)Z", "Landroid/content/Context;", "Lru/ozon/app/android/storefront/ui/tooltip/TooltipVO;", "I", "Lru/ozon/app/android/storefront/ui/tooltip/internal/TooltipView;", "tooltipView", "Lru/ozon/app/android/storefront/ui/tooltip/internal/TooltipView;", "Landroid/os/Handler;", "autoDismissHandler$delegate", "LSc/j;", "getAutoDismissHandler", "()Landroid/os/Handler;", "autoDismissHandler", "Lru/ozon/app/android/storefront/ui/tooltip/internal/TooltipPopup$AutoDismissRunnable;", "autoDismissRunnable$delegate", "getAutoDismissRunnable", "()Lru/ozon/app/android/storefront/ui/tooltip/internal/TooltipPopup$AutoDismissRunnable;", "autoDismissRunnable", "tooltipLayoutParams", "Landroid/view/WindowManager$LayoutParams;", "Landroid/graphics/Rect;", "displayFrame", "Landroid/graphics/Rect;", "", "anchorPos", "[I", "AutoDismissRunnable", "tooltip_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TooltipPopup implements DefaultLifecycleObserver {

    @NotNull
    private final int[] anchorPos;

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
    private final int leftPadding;
    private final int marginFromAnchor;
    private final int rightPadding;

    @NotNull
    private final WindowManager.LayoutParams tooltipLayoutParams;

    @NotNull
    private final TooltipVO tooltipVO;
    private TooltipView tooltipView;
    private final int topPadding;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/storefront/ui/tooltip/internal/TooltipPopup$AutoDismissRunnable;", "Ljava/lang/Runnable;", "tooltipPopup", "Lru/ozon/app/android/storefront/ui/tooltip/internal/TooltipPopup;", "<init>", "(Lru/ozon/app/android/storefront/ui/tooltip/internal/TooltipPopup;)V", "run", "", "tooltip_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class AutoDismissRunnable implements Runnable {

        @NotNull
        private final TooltipPopup tooltipPopup;

        public AutoDismissRunnable(@NotNull TooltipPopup tooltipPopup) {
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

    public TooltipPopup(@NotNull Context context, @NotNull TooltipVO tooltipVO, int i11, int i12, int i13, int i14, int i15, float f7) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(tooltipVO, "tooltipVO");
        this.context = context;
        this.tooltipVO = tooltipVO;
        this.marginFromAnchor = i11;
        this.leftPadding = i12;
        this.topPadding = i13;
        this.rightPadding = i14;
        this.bottomPadding = i15;
        this.tooltipView = new TooltipView(context, TooltipView.Params.m1027constructorimpl(f7), null);
        this.autoDismissHandler = LazyUtilsKt.unsafeLazy(TooltipPopup$autoDismissHandler$2.INSTANCE);
        this.autoDismissRunnable = LazyUtilsKt.unsafeLazy(new TooltipPopup$autoDismissRunnable$2(this));
        this.tooltipLayoutParams = new WindowManager.LayoutParams();
        this.displayFrame = new Rect();
        this.anchorPos = new int[2];
        prepareUi();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void computePosition(View anchorView, WindowManager.LayoutParams outParams, int leftMargin, int rightMargin, TooltipBeakPosition beakPosition, boolean centerAboutAnchor) {
        int i11;
        int measuredWidth;
        int measuredHeight;
        int max;
        TooltipView tooltipView = this.tooltipView;
        if (tooltipView == null) {
            return;
        }
        outParams.token = anchorView.getApplicationWindowToken();
        anchorView.getRootView().getWindowVisibleDisplayFrame(this.displayFrame);
        int width = this.displayFrame.width();
        anchorView.getLocationOnScreen(this.anchorPos);
        int[] iArr = this.anchorPos;
        int i12 = iArr[0];
        int i13 = iArr[1];
        boolean z11 = beakPosition instanceof TooltipBeakPosition.Vertical;
        if (z11) {
            measuredWidth = width - leftMargin;
        } else {
            if (!(beakPosition instanceof TooltipBeakPosition.Left)) {
                if (!(beakPosition instanceof TooltipBeakPosition.Right)) {
                    throw new o();
                }
                i11 = i12 - leftMargin;
                tooltipView.measure(View.MeasureSpec.makeMeasureSpec(i11, LinearLayoutManager.INVALID_OFFSET), View.MeasureSpec.makeMeasureSpec(0, 0));
                outParams.width = tooltipView.getMeasuredWidth();
                outParams.height = tooltipView.getMeasuredHeight();
                outParams.gravity = 51;
                if (!(beakPosition instanceof TooltipBeakPosition.Vertical.Top)) {
                    measuredHeight = anchorView.getHeight() + i13 + this.marginFromAnchor;
                } else if (beakPosition instanceof TooltipBeakPosition.Vertical.Bottom) {
                    measuredHeight = (i13 - tooltipView.getMeasuredHeight()) - this.marginFromAnchor;
                } else {
                    if (!(beakPosition instanceof TooltipBeakPosition.Horizontal)) {
                        throw new o();
                    }
                    measuredHeight = ((anchorView.getMeasuredHeight() / 2) + i13) - (tooltipView.getMeasuredHeight() / 2);
                }
                outParams.y = measuredHeight;
                if (!z11) {
                    int measuredWidth2 = (width - rightMargin) - tooltipView.getMeasuredWidth();
                    max = centerAboutAnchor ? h.e(((anchorView.getMeasuredWidth() / 2) + i12) - (tooltipView.getMeasuredWidth() / 2), leftMargin, measuredWidth2) : h.e(i12 - (tooltipView.getMeasuredWidth() / 2), leftMargin, measuredWidth2);
                } else if (beakPosition instanceof TooltipBeakPosition.Left) {
                    max = Math.min(anchorView.getMeasuredWidth() + i12 + this.marginFromAnchor, width);
                } else {
                    if (!(beakPosition instanceof TooltipBeakPosition.Right)) {
                        throw new o();
                    }
                    max = Math.max((i12 - tooltipView.getMeasuredWidth()) - this.marginFromAnchor, 0);
                }
                outParams.x = max;
                tooltipView.setBeakAnchor((anchorView.getMeasuredWidth() / 2.0f) + i12, outParams.x);
            }
            measuredWidth = (width - i12) - anchorView.getMeasuredWidth();
        }
        i11 = measuredWidth - rightMargin;
        tooltipView.measure(View.MeasureSpec.makeMeasureSpec(i11, LinearLayoutManager.INVALID_OFFSET), View.MeasureSpec.makeMeasureSpec(0, 0));
        outParams.width = tooltipView.getMeasuredWidth();
        outParams.height = tooltipView.getMeasuredHeight();
        outParams.gravity = 51;
        if (!(beakPosition instanceof TooltipBeakPosition.Vertical.Top)) {
        }
        outParams.y = measuredHeight;
        if (!z11) {
        }
        outParams.x = max;
        tooltipView.setBeakAnchor((anchorView.getMeasuredWidth() / 2.0f) + i12, outParams.x);
    }

    private final Handler getAutoDismissHandler() {
        return (Handler) this.autoDismissHandler.getValue();
    }

    private final AutoDismissRunnable getAutoDismissRunnable() {
        return (AutoDismissRunnable) this.autoDismissRunnable.getValue();
    }

    private final void prepareUi() {
        TooltipView tooltipView;
        TooltipView tooltipView2;
        TooltipView tooltipView3 = this.tooltipView;
        if (tooltipView3 == null) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.tooltipLayoutParams;
        layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.flags = 262152;
        tooltipView3.setPadding(this.leftPadding, this.topPadding, this.rightPadding, this.bottomPadding);
        tooltipView3.bindTooltip(this.tooltipVO);
        if (this.tooltipVO.getHideByTouchOutside() && (tooltipView2 = this.tooltipView) != null) {
            tooltipView2.setOnTooltipOutsideTouchListener(new Y(this));
        }
        if (!this.tooltipVO.getHasCloseIcon() || (tooltipView = this.tooltipView) == null) {
            return;
        }
        tooltipView.setOnCloseIconClickListener(new TooltipPopup$prepareUi$4(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void prepareUi$lambda$3(TooltipPopup tooltipPopup, MotionEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (tooltipPopup.isShowing()) {
            tooltipPopup.dismiss();
        }
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
        TooltipView tooltipView = this.tooltipView;
        return (tooltipView != null ? tooltipView.getParent() : null) != null;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        dismiss();
        this.tooltipView = null;
    }

    public final void show(@NotNull View anchorView, boolean centerAboutAnchor, Long dismissTimeout) {
        Intrinsics.checkNotNullParameter(anchorView, "anchorView");
        if (isShowing()) {
            dismiss();
        }
        computePosition(anchorView, this.tooltipLayoutParams, this.tooltipVO.getLeftMargin(), this.tooltipVO.getRightMargin(), this.tooltipVO.getBeakPosition(), centerAboutAnchor);
        Object systemService = this.context.getSystemService("window");
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        ((WindowManager) systemService).addView(this.tooltipView, this.tooltipLayoutParams);
        if (dismissTimeout != null) {
            dismissWithDelay(dismissTimeout.longValue());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TooltipPopup(@NotNull Context context, @NotNull TooltipVO tooltipVO, int i11, int i12, float f7) {
        this(context, tooltipVO, i11, i12, i12, i12, i12, f7);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(tooltipVO, "tooltipVO");
    }
}
