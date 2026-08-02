package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.multibutton.relatedProductsBottomSheet;

import B90.Y;
import Sc.o;
import WZ.l;
import WZ.t;
import Xc.a;
import Xc.b;
import a00.C4911f;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Outline;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k;
import androidx.fragment.app.G;
import androidx.fragment.app.Q;
import androidx.fragment.app.r;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import i10.h;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationAnimationController;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.multibutton.data.TileRelatedProductsCurtainVO;
import ru.ozon.app.android.universalwidgets.R$drawable;
import ru.ozon.app.android.universalwidgets.R$id;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.multibutton.relatedProductsBottomSheet.TileRelatedProductsBottomSheetView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\b\b*\u0002FI\b\u0001\u0018\u0000 N2\u00020\u0001:\u0002NOB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u001b\u0010\u0013\u001a\u00020\f*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u0017¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\f¢\u0006\u0004\b!\u0010\u000eR\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\"R\u0018\u0010\t\u001a\u00060\u0007j\u0002`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010#R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00010$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010'\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010/\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00101\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010-R\u0016\u00102\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010-R\u0016\u00103\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010-R\u0016\u00104\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010-R\u0018\u00106\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00109\u001a\u0004\u0018\u0001088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010<\u001a\u0004\u0018\u00010;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010?\u001a\u0004\u0018\u00010>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010D\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010CR\u0014\u0010E\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010CR\u0014\u0010G\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010J\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010L\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bL\u0010M¨\u0006P"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/multibutton/relatedProductsBottomSheet/TileRelatedProductsBottomSheetView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "container", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Landroid/content/Context;La00/f;LWZ/l;)V", "", "resetValuesToDefault", "()V", "tryShowMiniState", "Landroidx/fragment/app/G;", "Landroidx/lifecycle/J;", "lifecycleOwner", "setupFragmentResultListener", "(Landroidx/fragment/app/G;Landroidx/lifecycle/J;)V", "Landroid/view/MotionEvent;", "ev", "", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/multibutton/data/TileRelatedProductsCurtainVO;", "relatedProductsCurtain", "loadComposer", "(Lru/ozon/app/android/product/tiles/tilegrid2/presentation/multibutton/data/TileRelatedProductsCurtainVO;)V", "isValidatedShow", "showMiniState", "(Z)V", "onDetach", "La00/f;", "LWZ/l;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/multibutton/relatedProductsBottomSheet/TileRelatedProductsBottomSheetBehavior;", "behavior", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/multibutton/relatedProductsBottomSheet/TileRelatedProductsBottomSheetBehavior;", "analytics", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/multibutton/data/TileRelatedProductsCurtainVO;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/multibutton/relatedProductsBottomSheet/TileRelatedProductsBottomSheetView$State;", "lastState", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/multibutton/relatedProductsBottomSheet/TileRelatedProductsBottomSheetView$State;", "isShownBottomSheet", "Z", "", "lastSlideOffset", "F", "isValidatedShowWithExternalState", "isValidatedShowWithComposerWidgetState", "isValidatedShowWithExternalDialogFragment", "isAnimatedBottomNavigation", "Lru/ozon/app/android/composer/universalscreen/view/ComposerFragment;", "composerFragment", "Lru/ozon/app/android/composer/universalscreen/view/ComposerFragment;", "Landroidx/recyclerview/widget/RecyclerView;", "composerRv", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationAnimationController;", "bottomNavigationAnimationController", "Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationAnimationController;", "Landroid/view/ViewGroup;", "containerDecorView", "Landroid/view/ViewGroup;", "Landroid/view/View;", "closeButton", "Landroid/view/View;", "composerDimmingView", "dimmingView", "ru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/multibutton/relatedProductsBottomSheet/TileRelatedProductsBottomSheetView$bottomSheetCallback$1", "bottomSheetCallback", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/multibutton/relatedProductsBottomSheet/TileRelatedProductsBottomSheetView$bottomSheetCallback$1;", "ru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/multibutton/relatedProductsBottomSheet/TileRelatedProductsBottomSheetView$fragmentLifecycleCallbacks$1", "fragmentLifecycleCallbacks", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/multibutton/relatedProductsBottomSheet/TileRelatedProductsBottomSheetView$fragmentLifecycleCallbacks$1;", "isValidatedShowWithComposerScroll", "()Z", "Companion", "State", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class TileRelatedProductsBottomSheetView extends FrameLayout {
    private TileRelatedProductsCurtainVO analytics;

    @NotNull
    private final TileRelatedProductsBottomSheetBehavior<FrameLayout> behavior;
    private final BottomNavigationAnimationController bottomNavigationAnimationController;

    @NotNull
    private final TileRelatedProductsBottomSheetView$bottomSheetCallback$1 bottomSheetCallback;

    @NotNull
    private final View closeButton;

    @NotNull
    private final View composerDimmingView;
    private ComposerFragment composerFragment;
    private final RecyclerView composerRv;

    @NotNull
    private final C4911f container;
    private final ViewGroup containerDecorView;

    @NotNull
    private final View dimmingView;

    @NotNull
    private final TileRelatedProductsBottomSheetView$fragmentLifecycleCallbacks$1 fragmentLifecycleCallbacks;
    private boolean isAnimatedBottomNavigation;
    private boolean isShownBottomSheet;
    private boolean isValidatedShowWithComposerWidgetState;
    private boolean isValidatedShowWithExternalDialogFragment;
    private boolean isValidatedShowWithExternalState;
    private float lastSlideOffset;

    @NotNull
    private State lastState;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int closeIconSize = ResourceExtKt.toPx(32);
    private static final int closeIconMargin = ResourceExtKt.toPx(16);
    private static final float topRadius = ResourceExtKt.toPxF(24);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/multibutton/relatedProductsBottomSheet/TileRelatedProductsBottomSheetView$Companion;", "", "<init>", "()V", "", "topRadius", "F", "getTopRadius", "()F", "COMPOSER_DIMMING_ELEVATION", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float getTopRadius() {
            return TileRelatedProductsBottomSheetView.topRadius;
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/multibutton/relatedProductsBottomSheet/TileRelatedProductsBottomSheetView$State;", "", "<init>", "(Ljava/lang/String;I)V", "OPEN_MINI", "OPEN_FULL", "CLOSE_MINI_EXTERNAL", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class State {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State OPEN_MINI = new State("OPEN_MINI", 0);
        public static final State OPEN_FULL = new State("OPEN_FULL", 1);
        public static final State CLOSE_MINI_EXTERNAL = new State("CLOSE_MINI_EXTERNAL", 2);

        private static final /* synthetic */ State[] $values() {
            return new State[]{OPEN_MINI, OPEN_FULL, CLOSE_MINI_EXTERNAL};
        }

        static {
            State[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private State(String str, int i11) {
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [com.google.android.material.bottomsheet.BottomSheetBehavior$f, ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.multibutton.relatedProductsBottomSheet.TileRelatedProductsBottomSheetView$bottomSheetCallback$1] */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.fragment.app.G$m, ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.multibutton.relatedProductsBottomSheet.TileRelatedProductsBottomSheetView$fragmentLifecycleCallbacks$1] */
    public TileRelatedProductsBottomSheetView(@NotNull Context context, @NotNull C4911f container, @NotNull l tokenizedAnalytics) {
        super(context);
        ViewGroup rootView;
        ViewGroup composerContainer;
        Window window;
        ComponentCallbacksC5392m parentFragment;
        View view;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.container = container;
        this.tokenizedAnalytics = tokenizedAnalytics;
        TileRelatedProductsBottomSheetBehavior<FrameLayout> tileRelatedProductsBottomSheetBehavior = new TileRelatedProductsBottomSheetBehavior<>();
        tileRelatedProductsBottomSheetBehavior.setHideable(true);
        tileRelatedProductsBottomSheetBehavior.setSkipCollapsed(true);
        tileRelatedProductsBottomSheetBehavior.setExpandedOffset(ResourceExtKt.getStatusBarHeight(context));
        tileRelatedProductsBottomSheetBehavior.setHalfExpandedRatio(0.25f);
        tileRelatedProductsBottomSheetBehavior.setFitToContents(false);
        this.behavior = tileRelatedProductsBottomSheetBehavior;
        this.lastState = State.OPEN_MINI;
        this.isValidatedShowWithExternalDialogFragment = true;
        this.isAnimatedBottomNavigation = true;
        ComponentCallbacksC5392m c11 = container.c();
        this.composerRv = (c11 == null || (view = c11.getView()) == null) ? null : ComposerViewExtensionKt.composerRecyclerViewOrNull(view);
        ComponentCallbacksC5392m c12 = container.c();
        InterfaceC5431s parentFragment2 = (c12 == null || (parentFragment = c12.getParentFragment()) == null) ? null : parentFragment.getParentFragment();
        this.bottomNavigationAnimationController = parentFragment2 instanceof BottomNavigationAnimationController ? (BottomNavigationAnimationController) parentFragment2 : null;
        r a11 = container.a();
        View decorView = (a11 == null || (window = a11.getWindow()) == null) ? null : window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        this.containerDecorView = viewGroup;
        View view2 = new View(context);
        int i11 = closeIconSize;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i11, i11);
        view2.setElevation(1.0f);
        layoutParams.gravity = 8388613;
        int i12 = closeIconMargin;
        layoutParams.topMargin = i12;
        layoutParams.rightMargin = i12;
        view2.setLayoutParams(layoutParams);
        view2.setBackground(androidx.core.content.a.getDrawable(context, R$drawable.ic_close_related_products_curtain));
        view2.setOnClickListener(new Cw.b(this, 8));
        this.closeButton = view2;
        View view3 = new View(context);
        ViewExtKt.gone(view3);
        UniColors uniColors = UniColors.LAYER_OVERLAY_DIMMING;
        view3.setBackgroundColor(androidx.core.content.a.getColor(context, uniColors.getResId()));
        view3.setAlpha(0.0f);
        view3.setElevation(3.0f);
        ComponentCallbacksC5392m c13 = container.c();
        if (c13 != null && (rootView = ContextExtKt.getRootView(c13)) != null && (composerContainer = ComposerViewExtensionKt.composerContainer(rootView)) != null) {
            composerContainer.addView(view3);
        }
        this.composerDimmingView = view3;
        View view4 = new View(context);
        ViewExtKt.gone(view4);
        view4.setLayoutParams(new ViewGroup.LayoutParams(-1, ResourceExtKt.getStatusBarHeight(context)));
        view4.setBackgroundColor(androidx.core.content.a.getColor(context, uniColors.getResId()));
        view4.setAlpha(0.0f);
        if (viewGroup != null) {
            viewGroup.addView(view4);
        }
        this.dimmingView = view4;
        ?? r11 = new BottomSheetBehavior.f() { // from class: ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.multibutton.relatedProductsBottomSheet.TileRelatedProductsBottomSheetView$bottomSheetCallback$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[TileRelatedProductsBottomSheetView.State.values().length];
                    try {
                        iArr[TileRelatedProductsBottomSheetView.State.OPEN_MINI.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[TileRelatedProductsBottomSheetView.State.OPEN_FULL.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[TileRelatedProductsBottomSheetView.State.CLOSE_MINI_EXTERNAL.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
            public void onSlide(View bottomSheet, float slideOffset) {
                boolean z11;
                View view5;
                View view6;
                float f7;
                BottomNavigationAnimationController bottomNavigationAnimationController;
                BottomNavigationAnimationController bottomNavigationAnimationController2;
                Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                z11 = TileRelatedProductsBottomSheetView.this.isAnimatedBottomNavigation;
                if (z11) {
                    view5 = TileRelatedProductsBottomSheetView.this.dimmingView;
                    view5.setAlpha(slideOffset);
                    view6 = TileRelatedProductsBottomSheetView.this.composerDimmingView;
                    view6.setAlpha(slideOffset);
                    f7 = TileRelatedProductsBottomSheetView.this.lastSlideOffset;
                    if (slideOffset >= f7) {
                        bottomNavigationAnimationController2 = TileRelatedProductsBottomSheetView.this.bottomNavigationAnimationController;
                        if (bottomNavigationAnimationController2 != null) {
                            BottomNavigationAnimationController.DefaultImpls.hideBottomNavigationWithTranslationAnimation$default(bottomNavigationAnimationController2, 0L, 1, null);
                        }
                    } else {
                        bottomNavigationAnimationController = TileRelatedProductsBottomSheetView.this.bottomNavigationAnimationController;
                        if (bottomNavigationAnimationController != null) {
                            BottomNavigationAnimationController.DefaultImpls.showBottomNavigationWithTranslationAnimation$default(bottomNavigationAnimationController, 0L, 1, null);
                        }
                    }
                }
                TileRelatedProductsBottomSheetView.this.lastSlideOffset = slideOffset;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onStateChanged(View bottomSheet, int newState) {
                TileRelatedProductsCurtainVO tileRelatedProductsCurtainVO;
                t openFullEvent;
                l lVar;
                TileRelatedProductsBottomSheetView.State state;
                TileRelatedProductsCurtainVO tileRelatedProductsCurtainVO2;
                t miniCloseSwipeEvent;
                l lVar2;
                TileRelatedProductsCurtainVO tileRelatedProductsCurtainVO3;
                Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                if (newState == 3) {
                    TileRelatedProductsBottomSheetView.this.lastState = TileRelatedProductsBottomSheetView.State.OPEN_FULL;
                    tileRelatedProductsCurtainVO = TileRelatedProductsBottomSheetView.this.analytics;
                    if (tileRelatedProductsCurtainVO == null || (openFullEvent = tileRelatedProductsCurtainVO.getOpenFullEvent()) == null) {
                        return;
                    }
                    lVar = TileRelatedProductsBottomSheetView.this.tokenizedAnalytics;
                    TokenizedAnalyticsExtensionsKt.processAnyEvents$default(lVar, openFullEvent, null, 2, null);
                    return;
                }
                if (newState != 4) {
                    if (newState == 5) {
                        state = TileRelatedProductsBottomSheetView.this.lastState;
                        int i13 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                        if (i13 == 1) {
                            tileRelatedProductsCurtainVO2 = TileRelatedProductsBottomSheetView.this.analytics;
                            if (tileRelatedProductsCurtainVO2 != null) {
                                miniCloseSwipeEvent = tileRelatedProductsCurtainVO2.getMiniCloseSwipeEvent();
                                if (miniCloseSwipeEvent != null) {
                                }
                                TileRelatedProductsBottomSheetView.this.resetValuesToDefault();
                                TileRelatedProductsBottomSheetView.this.isAnimatedBottomNavigation = false;
                                return;
                            }
                            miniCloseSwipeEvent = null;
                            if (miniCloseSwipeEvent != null) {
                            }
                            TileRelatedProductsBottomSheetView.this.resetValuesToDefault();
                            TileRelatedProductsBottomSheetView.this.isAnimatedBottomNavigation = false;
                            return;
                        }
                        if (i13 == 2) {
                            tileRelatedProductsCurtainVO3 = TileRelatedProductsBottomSheetView.this.analytics;
                            if (tileRelatedProductsCurtainVO3 != null) {
                                miniCloseSwipeEvent = tileRelatedProductsCurtainVO3.getCloseFullEvent();
                                if (miniCloseSwipeEvent != null) {
                                    lVar2 = TileRelatedProductsBottomSheetView.this.tokenizedAnalytics;
                                    TokenizedAnalyticsExtensionsKt.processAnyEvents$default(lVar2, miniCloseSwipeEvent, null, 2, null);
                                }
                                TileRelatedProductsBottomSheetView.this.resetValuesToDefault();
                                TileRelatedProductsBottomSheetView.this.isAnimatedBottomNavigation = false;
                                return;
                            }
                        } else if (i13 != 3) {
                            throw new o();
                        }
                        miniCloseSwipeEvent = null;
                        if (miniCloseSwipeEvent != null) {
                        }
                        TileRelatedProductsBottomSheetView.this.resetValuesToDefault();
                        TileRelatedProductsBottomSheetView.this.isAnimatedBottomNavigation = false;
                        return;
                    }
                    if (newState != 6) {
                        return;
                    }
                }
                TileRelatedProductsBottomSheetView.this.isAnimatedBottomNavigation = true;
            }
        };
        this.bottomSheetCallback = r11;
        ?? r32 = new G.m() { // from class: ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.multibutton.relatedProductsBottomSheet.TileRelatedProductsBottomSheetView$fragmentLifecycleCallbacks$1
            @Override // androidx.fragment.app.G.m
            public void onFragmentDestroyed(G fm, ComponentCallbacksC5392m fragment) {
                Intrinsics.checkNotNullParameter(fm, "fm");
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                if (fragment instanceof DialogInterfaceOnCancelListenerC5390k) {
                    TileRelatedProductsBottomSheetView.this.isValidatedShowWithExternalDialogFragment = true;
                }
                super.onFragmentDestroyed(fm, fragment);
            }

            @Override // androidx.fragment.app.G.m
            public void onFragmentResumed(G fm, ComponentCallbacksC5392m fragment) {
                TileRelatedProductsBottomSheetBehavior tileRelatedProductsBottomSheetBehavior2;
                Intrinsics.checkNotNullParameter(fm, "fm");
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                if (fragment instanceof DialogInterfaceOnCancelListenerC5390k) {
                    TileRelatedProductsBottomSheetView.this.isValidatedShowWithExternalDialogFragment = false;
                    try {
                        tileRelatedProductsBottomSheetBehavior2 = TileRelatedProductsBottomSheetView.this.behavior;
                        tileRelatedProductsBottomSheetBehavior2.setState(5);
                    } catch (Exception e11) {
                        Lm0.a.f17149a.e(e11);
                    }
                }
                super.onFragmentResumed(fm, fragment);
            }
        };
        this.fragmentLifecycleCallbacks = r32;
        setId(R$id.tileRelatedProductComposerContainer);
        CoordinatorLayout.f fVar = new CoordinatorLayout.f(-1, -2);
        fVar.i(tileRelatedProductsBottomSheetBehavior);
        setLayoutParams(fVar);
        addView(view2);
        tileRelatedProductsBottomSheetBehavior.addBottomSheetCallback(r11);
        G d11 = container.d();
        if (d11 != 0) {
            d11.Y0(r32, false);
        }
        setElevation(4.0f);
        setClipToOutline(true);
        setClipToPadding(false);
        setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.multibutton.relatedProductsBottomSheet.TileRelatedProductsBottomSheetView.2
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view5, Outline outline) {
                Intrinsics.checkNotNullParameter(view5, "view");
                if (outline != null) {
                    outline.setRoundRect(0, 0, view5.getWidth(), view5.getHeight() + ((int) TileRelatedProductsBottomSheetView.Companion.getTopRadius()), TileRelatedProductsBottomSheetView.Companion.getTopRadius());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void closeButton$lambda$3$lambda$2(TileRelatedProductsBottomSheetView tileRelatedProductsBottomSheetView, View view) {
        tileRelatedProductsBottomSheetView.behavior.setState(5);
    }

    private final boolean isValidatedShowWithComposerScroll() {
        RecyclerView recyclerView = this.composerRv;
        return recyclerView != null && recyclerView.getScrollState() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resetValuesToDefault() {
        ViewExtKt.gone(this.dimmingView);
        ViewExtKt.gone(this.composerDimmingView);
        this.isShownBottomSheet = false;
        this.isValidatedShowWithExternalState = false;
        this.isValidatedShowWithComposerWidgetState = false;
        this.analytics = null;
        this.behavior.setOnExternalCollapsedCallback(null);
    }

    private final void setupFragmentResultListener(G g10, J j11) {
        g10.n1("tileRelatedProductsBottomSheetConfigurator_LoadCompleted_requestCode", j11, new Y(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupFragmentResultListener$lambda$13(TileRelatedProductsBottomSheetView tileRelatedProductsBottomSheetView, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        if (bundle.getBoolean("loadCompleted_state")) {
            tileRelatedProductsBottomSheetView.isValidatedShowWithComposerWidgetState = true;
            tileRelatedProductsBottomSheetView.tryShowMiniState();
        }
    }

    private final void tryShowMiniState() {
        t openTokenizedEvent;
        if (!this.isShownBottomSheet && this.isValidatedShowWithExternalState && this.isValidatedShowWithComposerWidgetState && isValidatedShowWithComposerScroll()) {
            ViewExtKt.show(this.dimmingView);
            ViewExtKt.show(this.composerDimmingView);
            this.isShownBottomSheet = true;
            this.behavior.setState(6);
            this.dimmingView.setAlpha(this.behavior.getHalfExpandedRatio());
            this.composerDimmingView.setAlpha(this.behavior.getHalfExpandedRatio());
            this.lastState = State.OPEN_MINI;
            TileRelatedProductsCurtainVO tileRelatedProductsCurtainVO = this.analytics;
            if (tileRelatedProductsCurtainVO == null || (openTokenizedEvent = tileRelatedProductsCurtainVO.getOpenTokenizedEvent()) == null) {
                return;
            }
            TokenizedAnalyticsExtensionsKt.processAnyEvents$default(this.tokenizedAnalytics, openTokenizedEvent, null, 2, null);
        }
    }

    public final void loadComposer(@NotNull TileRelatedProductsCurtainVO relatedProductsCurtain) {
        Intrinsics.checkNotNullParameter(relatedProductsCurtain, "relatedProductsCurtain");
        if (this.isShownBottomSheet) {
            return;
        }
        resetValuesToDefault();
        this.analytics = relatedProductsCurtain;
        ComposerFragment composerFragment = this.composerFragment;
        String str = null;
        if (composerFragment != null) {
            ComposerFragment.startLoading$default(composerFragment, relatedProductsCurtain.getCurtainDeeplink(), null, 2, null);
        } else {
            ComposerFragment newInstance$default = ComposerFragment.Companion.newInstance$default(ComposerFragment.INSTANCE, new ComposerScreenConfig(new h.c.a(relatedProductsCurtain.getCurtainDeeplink(), str, str, 14), null, false, null, false, false, false, false, null, false, false, false, e0.h(TileRelatedProductsBottomSheetConfigurator.class), null, null, null, false, null, null, null, false, false, null, null, 14675900, null), ComposerFragment.DisplayMode.BOTTOM_SHEET_FULL, null, 4, null);
            G d11 = this.container.d();
            if (d11 != null) {
                Q p11 = d11.p();
                p11.r(getId(), newInstance$default, null);
                p11.l();
            }
            try {
                G d12 = this.container.d();
                if (d12 != null) {
                    J viewLifecycleOwner = newInstance$default.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    setupFragmentResultListener(d12, viewLifecycleOwner);
                }
            } catch (IllegalStateException e11) {
                Lm0.a.f17149a.e(e11);
            }
            this.composerFragment = newInstance$default;
        }
        if (this.behavior.getOnExternalCollapsedCallback() == null) {
            this.behavior.setOnExternalCollapsedCallback(new TileRelatedProductsBottomSheetView$loadComposer$2(this));
        }
    }

    public final void onDetach() {
        ViewGroup rootView;
        ViewGroup composerContainer;
        G d11;
        this.isShownBottomSheet = true;
        G d12 = this.container.d();
        if (d12 != null) {
            d12.t1(this.fragmentLifecycleCallbacks);
        }
        ComposerFragment composerFragment = this.composerFragment;
        if (composerFragment != null && (d11 = this.container.d()) != null) {
            Q p11 = d11.p();
            p11.q(composerFragment);
            p11.j();
        }
        ViewGroup viewGroup = this.containerDecorView;
        if (viewGroup != null) {
            viewGroup.removeView(this.dimmingView);
        }
        ComponentCallbacksC5392m c11 = this.container.c();
        if (c11 != null && (rootView = ContextExtKt.getRootView(c11)) != null && (composerContainer = ComposerViewExtensionKt.composerContainer(rootView)) != null) {
            composerContainer.removeView(this.composerDimmingView);
        }
        this.behavior.onDetachedFromLayoutParams();
        this.behavior.setOnExternalCollapsedCallback(null);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        requestDisallowInterceptTouchEvent(true);
        return super.onInterceptTouchEvent(ev);
    }

    public final void showMiniState(boolean isValidatedShow) {
        this.isValidatedShowWithExternalState = isValidatedShow;
        if (isValidatedShow) {
            tryShowMiniState();
        } else {
            resetValuesToDefault();
        }
    }
}
