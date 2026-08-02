package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.view.tooltip;

import An.b;
import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.scheme.TravelRailwaySeatSelectWithSchemeVO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.common.Paddings;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 82\u00020\u0001:\u00018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ?\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\bJ\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ=\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0006¢\u0006\u0004\b \u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010-\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u00069"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/view/tooltip/TooltipWrapper;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "dismissWithDelay", "()V", "cancelAutoDismiss", "", "isShowing", "()Z", "Landroid/view/View;", "anchorView", "", "anchorX", "anchorWidth", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeVO$TooltipVO;", "tooltip", "anchorHeight", "anchorY", "computePositionsByCoordinates", "(Landroid/view/View;IILru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeVO$TooltipVO;II)V", "prepareUi", "Landroidx/lifecycle/J;", "owner", "onCreate", "(Landroidx/lifecycle/J;)V", "onDestroy", "showByCoordinates", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeVO$TooltipVO;Landroid/view/View;IIII)V", "dismiss", "Landroid/content/Context;", "Landroid/view/WindowManager$LayoutParams;", "tooltipLayoutParams", "Landroid/view/WindowManager$LayoutParams;", "Landroid/graphics/Rect;", "displayFrame", "Landroid/graphics/Rect;", "", "anchorPos", "[I", "dp6", "I", "lifecycleOwner", "Landroidx/lifecycle/J;", "Lxe/B0;", "autoDismissJob", "Lxe/B0;", "Landroid/view/WindowManager;", "windowManager", "Landroid/view/WindowManager;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/view/tooltip/TooltipView;", "tooltipView", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/view/tooltip/TooltipView;", "Companion", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TooltipWrapper implements DefaultLifecycleObserver {

    @NotNull
    private final int[] anchorPos;
    private B0 autoDismissJob;

    @NotNull
    private final Context context;

    @NotNull
    private final Rect displayFrame;
    private final int dp6;
    private J lifecycleOwner;

    @NotNull
    private final WindowManager.LayoutParams tooltipLayoutParams;

    @NotNull
    private final TooltipView tooltipView;

    @NotNull
    private final WindowManager windowManager;
    public static final int $stable = 8;

    public TooltipWrapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.tooltipLayoutParams = new WindowManager.LayoutParams();
        this.displayFrame = new Rect();
        this.anchorPos = new int[2];
        this.dp6 = ResourceExtKt.toPx(Paddings.PADDING_250.getPx(), context);
        Object systemService = context.getSystemService("window");
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.windowManager = (WindowManager) systemService;
        TooltipView tooltipView = new TooltipView(context);
        tooltipView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.tooltipView = tooltipView;
        prepareUi();
    }

    private final void cancelAutoDismiss() {
        B0 b02 = this.autoDismissJob;
        if (b02 != null) {
            b02.j(null);
        }
    }

    private final void computePositionsByCoordinates(View anchorView, int anchorX, int anchorWidth, TravelRailwaySeatSelectWithSchemeVO.TooltipVO tooltip, int anchorHeight, int anchorY) {
        anchorView.getLocationOnScreen(this.anchorPos);
        this.tooltipLayoutParams.token = anchorView.getApplicationWindowToken();
        this.tooltipView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.tooltipLayoutParams.width = this.tooltipView.getMeasuredWidth();
        this.tooltipLayoutParams.height = this.tooltipView.getMeasuredHeight();
        this.tooltipLayoutParams.gravity = 8388659;
        Integer J11 = C7705l.J(this.anchorPos, 0);
        int intValue = J11 != null ? J11.intValue() : 0;
        Integer J12 = C7705l.J(this.anchorPos, 1);
        int intValue2 = J12 != null ? J12.intValue() : 0;
        this.tooltipLayoutParams.x = (anchorWidth / 2) + ((intValue + anchorX) - (this.tooltipView.getMeasuredWidth() / 2));
        this.tooltipLayoutParams.y = intValue2 + anchorY + (tooltip.getIsTooltipOnTop() ? (-this.tooltipView.getMeasuredHeight()) - this.dp6 : this.dp6 + anchorHeight);
    }

    private final void dismissWithDelay() {
        cancelAutoDismiss();
        J j11 = this.lifecycleOwner;
        this.autoDismissJob = j11 != null ? C10727i.c(K.a(j11), null, null, new TooltipWrapper$dismissWithDelay$1(this, null), 3) : null;
    }

    private final boolean isShowing() {
        return this.tooltipView.getParent() != null;
    }

    private final void prepareUi() {
        WindowManager.LayoutParams layoutParams = this.tooltipLayoutParams;
        layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
        layoutParams.type = 1000;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.gravity = 8388659;
        layoutParams.flags = 262152;
        this.tooltipView.setOnTooltipOutsideTouchListener(new b(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void prepareUi$lambda$6$lambda$5(TooltipWrapper tooltipWrapper, MotionEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (tooltipWrapper.isShowing()) {
            tooltipWrapper.dismiss();
        }
    }

    public final void dismiss() {
        if (isShowing()) {
            this.windowManager.removeView(this.tooltipView);
            cancelAutoDismiss();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onCreate(owner);
        this.lifecycleOwner = owner;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        dismiss();
        this.lifecycleOwner = null;
    }

    public final void showByCoordinates(@NotNull TravelRailwaySeatSelectWithSchemeVO.TooltipVO tooltip, @NotNull View anchorView, int anchorX, int anchorY, int anchorWidth, int anchorHeight) {
        Intrinsics.checkNotNullParameter(tooltip, "tooltip");
        Intrinsics.checkNotNullParameter(anchorView, "anchorView");
        if (isShowing()) {
            dismiss();
        }
        this.tooltipView.bind(tooltip);
        computePositionsByCoordinates(anchorView, anchorX, anchorWidth, tooltip, anchorHeight, anchorY);
        this.windowManager.addView(this.tooltipView, this.tooltipLayoutParams);
        dismissWithDelay();
    }
}
