package ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.uikit.view.behavior.OzonBottomSheetBehavior;
import v10.C10183a;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0001\u0018\u0000 R2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001RB\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0003\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u0015H\u0014¢\u0006\u0004\b \u0010!J'\u0010$\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u0010¢\u0006\u0004\b&\u0010\u0004J\u0017\u0010(\u001a\u00020\u00102\b\u0010'\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b(\u0010)J\u0015\u0010+\u001a\u00020\u00102\u0006\u0010*\u001a\u00020\u0015¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\u0010¢\u0006\u0004\b-\u0010\u0004J\r\u0010.\u001a\u00020\r¢\u0006\u0004\b.\u0010/J\u0015\u00101\u001a\u00020\u00102\u0006\u00100\u001a\u00020\r¢\u0006\u0004\b1\u00102R*\u00104\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u0001038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R0\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0010\u0018\u00010:8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R$\u0010A\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0016\u0010.\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010GR\u0016\u0010H\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010GR\u0016\u0010I\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010GR\u0016\u0010J\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010GR\u0018\u0010K\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010BR\u0016\u0010L\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010GR\u0018\u0010'\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010MR\u0016\u0010N\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010GR\u0016\u0010P\u001a\u00020O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010Q¨\u0006S"}, d2 = {"Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2BottomBehavior;", "Lru/ozon/app/android/uikit/view/behavior/OzonBottomSheetBehavior;", "Landroid/widget/FrameLayout;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "child", "Landroid/view/View;", "dependency", "", "updateChildTranslation", "(Landroid/widget/FrameLayout;Landroid/view/View;)Z", "", "updateSettlingState", "(Landroid/widget/FrameLayout;Landroid/view/View;)V", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "parent", "", "layoutDirection", "onLayoutChild", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/widget/FrameLayout;I)Z", "layoutDependsOn", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/widget/FrameLayout;Landroid/view/View;)Z", "onDependentViewChanged", "calculatePeekHeight", "(Landroid/view/View;Landroid/view/View;)I", "bottomSheet", "newState", "onStateChanged", "(Landroid/view/View;I)V", "Landroid/view/MotionEvent;", "event", "onInterceptTouchEvent", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/widget/FrameLayout;Landroid/view/MotionEvent;)Z", "reset", "scrollOffsetToShow", "configure", "(Ljava/lang/Integer;)V", "offset", "tryToShowBottomNavigationView", "(I)V", "showFullBottomNavigationView", "isShown", "()Z", "locked", "setLocked", "(Z)V", "Lkotlin/Function0;", "onDismissCallback", "Lkotlin/jvm/functions/Function0;", "getOnDismissCallback", "()Lkotlin/jvm/functions/Function0;", "setOnDismissCallback", "(Lkotlin/jvm/functions/Function0;)V", "Lkotlin/Function1;", "onChangeState", "Lkotlin/jvm/functions/Function1;", "getOnChangeState", "()Lkotlin/jvm/functions/Function1;", "setOnChangeState", "(Lkotlin/jvm/functions/Function1;)V", "bottomBorderView", "Landroid/view/View;", "getBottomBorderView", "()Landroid/view/View;", "setBottomBorderView", "(Landroid/view/View;)V", "Z", "isConfigured", "wasExpanded", "isFirstLayout", "composerBottomBorder", "isLocked", "Ljava/lang/Integer;", "settlingPaused", "", "handledPeekHeightTranslationY", "F", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RateItemsV2BottomBehavior extends OzonBottomSheetBehavior<FrameLayout> {
    private static float maxScrollRange;
    private View bottomBorderView;
    private View composerBottomBorder;
    private float handledPeekHeightTranslationY;
    private boolean isConfigured;
    private boolean isFirstLayout;
    private boolean isLocked;
    private boolean isShown;
    private Function1<? super Integer, Unit> onChangeState;
    private Function0<Unit> onDismissCallback;
    private Integer scrollOffsetToShow;
    private boolean settlingPaused;
    private boolean wasExpanded;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2BottomBehavior$Companion;", "", "<init>", "()V", "COMPLETELY_HIDDEN_TABBAR_TRANSLATION", "", "maxScrollRange", "from", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2BottomBehavior;", "view", "Landroid/view/View;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final RateItemsV2BottomBehavior from(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            RateItemsV2BottomBehavior.maxScrollRange = view.getContext().getResources().getDisplayMetrics().heightPixels;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            CoordinatorLayout.f fVar = layoutParams instanceof CoordinatorLayout.f ? (CoordinatorLayout.f) layoutParams : null;
            if (fVar == null) {
                throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
            }
            CoordinatorLayout.c c11 = fVar.c();
            RateItemsV2BottomBehavior rateItemsV2BottomBehavior = c11 instanceof RateItemsV2BottomBehavior ? (RateItemsV2BottomBehavior) c11 : null;
            if (rateItemsV2BottomBehavior != null) {
                return rateItemsV2BottomBehavior;
            }
            throw new IllegalArgumentException("The view is not associated with RateItemsV2BottomBehavior");
        }

        private Companion() {
        }
    }

    public RateItemsV2BottomBehavior() {
        this.isFirstLayout = true;
    }

    private final boolean updateChildTranslation(FrameLayout child, View dependency) {
        float translationY = dependency.getTranslationY() - this.handledPeekHeightTranslationY;
        if (child.getTranslationY() == translationY) {
            return false;
        }
        child.setTranslationY(translationY);
        updateSettlingState(child, dependency);
        return true;
    }

    private final void updateSettlingState(FrameLayout child, View dependency) {
        if (getState() == 2 && dependency.getTranslationY() < 0.0f) {
            this.settlingPaused = true;
            stopSettlingAnimation(child);
        } else if (this.settlingPaused) {
            this.settlingPaused = false;
            int state = getState();
            setStateInternal(2);
            setState(state);
        }
    }

    @Override // ru.ozon.app.android.uikit.view.behavior.OzonBottomSheetBehavior
    protected int calculatePeekHeight(@NotNull View parent, @NotNull View child) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        return super.calculatePeekHeight(parent, child) - ((int) this.handledPeekHeightTranslationY);
    }

    public final void configure(Integer scrollOffsetToShow) {
        if (Intrinsics.d(this.scrollOffsetToShow, scrollOffsetToShow)) {
            return;
        }
        this.scrollOffsetToShow = scrollOffsetToShow;
        this.isConfigured = true;
    }

    public final boolean isShown() {
        return getState() != 5;
    }

    @Override // ru.ozon.app.android.uikit.view.behavior.OzonBottomSheetBehavior
    protected void onStateChanged(@NotNull View bottomSheet, int newState) {
        Function0<Unit> function0;
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        if (newState == 3) {
            setSkipCollapsed(true);
            this.wasExpanded = true;
        } else if (newState == 4) {
            this.wasExpanded = false;
        } else if (newState == 5 && (function0 = this.onDismissCallback) != null) {
            function0.invoke();
        }
        Function1<? super Integer, Unit> function1 = this.onChangeState;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(newState));
        }
        super.onStateChanged(bottomSheet, newState);
    }

    public final void reset() {
        this.isShown = false;
        this.wasExpanded = false;
    }

    public final void setBottomBorderView(View view) {
        this.bottomBorderView = view;
    }

    public final void setLocked(boolean locked) {
        this.isLocked = locked;
    }

    public final void setOnChangeState(Function1<? super Integer, Unit> function1) {
        this.onChangeState = function1;
    }

    public final void setOnDismissCallback(Function0<Unit> function0) {
        this.onDismissCallback = function0;
    }

    public final void showFullBottomNavigationView() {
        if (this.isShown) {
            return;
        }
        setState(3);
        setSkipCollapsed(true);
        this.wasExpanded = true;
        this.isShown = true;
    }

    public final void tryToShowBottomNavigationView(int offset) {
        Integer num = this.scrollOffsetToShow;
        if (num != null) {
            int intValue = num.intValue();
            if (!this.isConfigured || offset < intValue) {
                num = null;
            }
            if (num != null) {
                showFullBottomNavigationView();
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean layoutDependsOn(@NotNull CoordinatorLayout parent, @NotNull FrameLayout child, @NotNull View dependency) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(dependency, "dependency");
        View view = this.bottomBorderView;
        if (view == null) {
            view = C10183a.b(parent);
        }
        return Intrinsics.d(dependency, view) || super.layoutDependsOn(parent, (CoordinatorLayout) child, dependency);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onDependentViewChanged(@NotNull CoordinatorLayout parent, @NotNull FrameLayout child, @NotNull View dependency) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(dependency, "dependency");
        return Intrinsics.d(dependency, this.composerBottomBorder) ? updateChildTranslation(child, dependency) : super.onDependentViewChanged(parent, (CoordinatorLayout) child, dependency);
    }

    @Override // ru.ozon.app.android.uikit.view.behavior.OzonBottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onInterceptTouchEvent(@NotNull CoordinatorLayout parent, @NotNull FrameLayout child, @NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.isLocked || getState() == 2) {
            return false;
        }
        return super.onInterceptTouchEvent(parent, (CoordinatorLayout) child, event);
    }

    @Override // ru.ozon.app.android.uikit.view.behavior.OzonBottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onLayoutChild(@NotNull CoordinatorLayout parent, @NotNull FrameLayout child, int layoutDirection) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        if (this.isFirstLayout) {
            this.isFirstLayout = false;
            View b11 = C10183a.b(parent);
            if (b11 != null) {
                this.handledPeekHeightTranslationY = b11.getTranslationY();
                updateChildTranslation(child, b11);
            } else {
                b11 = null;
            }
            this.composerBottomBorder = b11;
        }
        return super.onLayoutChild(parent, (CoordinatorLayout) child, layoutDirection);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RateItemsV2BottomBehavior(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.isFirstLayout = true;
    }
}
