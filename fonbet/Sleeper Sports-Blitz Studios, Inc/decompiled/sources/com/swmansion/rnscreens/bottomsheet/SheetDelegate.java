package com.swmansion.rnscreens.bottomsheet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.view.inputmethod.InputMethodManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.react.uimanager.ThemedReactContext;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import com.swmansion.rnscreens.InsetsObserverProxy;
import com.swmansion.rnscreens.KeyboardDidHide;
import com.swmansion.rnscreens.KeyboardNotVisible;
import com.swmansion.rnscreens.KeyboardState;
import com.swmansion.rnscreens.KeyboardVisible;
import com.swmansion.rnscreens.Screen;
import com.swmansion.rnscreens.ScreenContainer;
import com.swmansion.rnscreens.ScreenContentWrapper;
import com.swmansion.rnscreens.ScreenFooter;
import com.swmansion.rnscreens.ScreenStackFragment;
import com.swmansion.rnscreens.events.ScreenAnimationDelegate;
import com.swmansion.rnscreens.events.ScreenEventEmitter;
import com.swmansion.rnscreens.transition.ExternalBoundaryValuesEvaluator;
import io.sentry.protocol.Request;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: SheetDelegate.kt */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 b2\u00020\u00012\u00020\u0002:\u0004_`abB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010%\u001a\u00020&H\u0002J\u0018\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0016J\b\u0010-\u001a\u00020(H\u0002J\b\u0010.\u001a\u00020(H\u0002J\b\u0010/\u001a\u00020(H\u0002J\u0010\u00100\u001a\u00020(2\u0006\u00101\u001a\u00020\u000fH\u0002J\u001b\u00102\u001a\u00020(2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00040\u001eH\u0000¢\u0006\u0002\b4J5\u00105\u001a\b\u0012\u0004\u0012\u00020\u00040\u001e2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00040\u001e2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u00106\u001a\u00020\u000fH\u0000¢\u0006\u0002\b7J\u0015\u00108\u001a\u00020\u000f2\u0006\u00109\u001a\u00020\u000fH\u0000¢\u0006\u0002\b:J\u0018\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020&2\u0006\u0010>\u001a\u00020<H\u0016J\u0010\u0010?\u001a\u00020\n2\u0006\u0010@\u001a\u00020\u000fH\u0002J\u000f\u0010A\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0002\u0010BJ\u000f\u0010C\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0002\u0010BJ\u0015\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020GH\u0000¢\u0006\u0002\bHJ\u0015\u0010I\u001a\u00020E2\u0006\u0010F\u001a\u00020GH\u0000¢\u0006\u0002\bJJ \u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020N2\u0006\u0010P\u001a\u00020QH\u0002J\b\u0010R\u001a\u00020LH\u0002J\u0010\u0010S\u001a\u00020L2\u0006\u0010T\u001a\u00020UH\u0002J\u0010\u0010V\u001a\u00020(2\u0006\u0010W\u001a\u00020NH\u0002J\u0015\u0010X\u001a\u00020(2\u0006\u0010>\u001a\u00020<H\u0000¢\u0006\u0002\bYJ \u0010Z\u001a\u00020(2\u0006\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020\n2\u0006\u0010^\u001a\u00020\"H\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R$\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f@BX\u0086\u000e¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0014R\u0012\u0010\u0019\u001a\u00060\u001aR\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u001b\u001a\u00060\u001cR\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006c"}, d2 = {"Lcom/swmansion/rnscreens/bottomsheet/SheetDelegate;", "Landroidx/lifecycle/LifecycleEventObserver;", "Landroidx/core/view/OnApplyWindowInsetsListener;", AnalyticsConstantsKt.KEY_SCREEN, "Lcom/swmansion/rnscreens/Screen;", "<init>", "(Lcom/swmansion/rnscreens/Screen;)V", "getScreen", "()Lcom/swmansion/rnscreens/Screen;", "isKeyboardVisible", "", "keyboardState", "Lcom/swmansion/rnscreens/KeyboardState;", "isSheetAnimationInProgress", "lastTopInset", "", "lastKeyboardBottomOffset", "value", "lastStableDetentIndex", "getLastStableDetentIndex", "()I", "lastStableState", "getLastStableState$annotations", "()V", "getLastStableState", "sheetStateObserver", "Lcom/swmansion/rnscreens/bottomsheet/SheetDelegate$SheetStateObserver;", "keyboardHandlerCallback", "Lcom/swmansion/rnscreens/bottomsheet/SheetDelegate$KeyboardHandler;", "sheetBehavior", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "getSheetBehavior", "()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "stackFragment", "Lcom/swmansion/rnscreens/ScreenStackFragment;", "getStackFragment", "()Lcom/swmansion/rnscreens/ScreenStackFragment;", "requireDecorView", "Landroid/view/View;", "onStateChanged", "", "source", "Landroidx/lifecycle/LifecycleOwner;", "event", "Landroidx/lifecycle/Lifecycle$Event;", "handleHostFragmentOnStart", "handleHostFragmentOnResume", "handleHostFragmentOnPause", "onSheetStateChanged", "newState", "updateBottomSheetMetrics", "behavior", "updateBottomSheetMetrics$react_native_screens_release", "configureBottomSheetBehaviour", "selectedDetentIndex", "configureBottomSheetBehaviour$react_native_screens_release", "computeSheetOffsetYWithIMEPresent", "keyboardHeight", "computeSheetOffsetYWithIMEPresent$react_native_screens_release", "onApplyWindowInsets", "Landroidx/core/view/WindowInsetsCompat;", "v", "insets", "shouldDismissSheetInState", "state", "tryResolveSafeAreaSpaceForSheet", "()Ljava/lang/Integer;", "tryResolveContainerHeight", "createSheetEnterAnimator", "Landroid/animation/Animator;", "sheetAnimationContext", "Lcom/swmansion/rnscreens/bottomsheet/SheetDelegate$SheetAnimationContext;", "createSheetEnterAnimator$react_native_screens_release", "createSheetExitAnimator", "createSheetExitAnimator$react_native_screens_release", "createDimmingViewAlphaAnimator", "Landroid/animation/ValueAnimator;", "from", "", "to", "dimmingDelegate", "Lcom/swmansion/rnscreens/bottomsheet/DimmingViewManager;", "createSheetSlideInAnimator", "createSheetSlideOutAnimator", "coordinatorLayout", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "updateSheetTranslationY", "baseTranslationY", "handleKeyboardInsetsProgress", "handleKeyboardInsetsProgress$react_native_screens_release", "attachCommonListeners", "animatorSet", "Landroid/animation/AnimatorSet;", "isEnter", "screenStackFragment", "KeyboardHandler", "SheetStateObserver", "SheetAnimationContext", "Companion", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SheetDelegate implements LifecycleEventObserver, OnApplyWindowInsetsListener {
    public static final String TAG = "SheetDelegate";
    private boolean isKeyboardVisible;
    private boolean isSheetAnimationInProgress;
    private final KeyboardHandler keyboardHandlerCallback;
    private KeyboardState keyboardState;
    private int lastKeyboardBottomOffset;
    private int lastStableDetentIndex;
    private int lastStableState;
    private int lastTopInset;
    private final Screen screen;
    private final SheetStateObserver sheetStateObserver;

    /* compiled from: SheetDelegate.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ void getLastStableState$annotations() {
    }

    private final boolean shouldDismissSheetInState(int state) {
        return state == 5;
    }

    public SheetDelegate(Screen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        this.screen = screen;
        this.keyboardState = KeyboardNotVisible.INSTANCE;
        this.lastStableDetentIndex = screen.getSheetInitialDetentIndex();
        this.lastStableState = screen.getSheetDetents().sheetStateFromIndex$react_native_screens_release(screen.getSheetInitialDetentIndex());
        SheetStateObserver sheetStateObserver = new SheetStateObserver();
        this.sheetStateObserver = sheetStateObserver;
        this.keyboardHandlerCallback = new KeyboardHandler();
        boolean z = screen.getFragment() instanceof ScreenStackFragment;
        Fragment fragment = screen.getFragment();
        Intrinsics.checkNotNull(fragment);
        fragment.getLifecycle().addObserver(this);
        BottomSheetBehavior<Screen> sheetBehavior = getSheetBehavior();
        if (sheetBehavior == null) {
            throw new IllegalStateException("[RNScreens] Sheet delegate accepts screen with initialized sheet behaviour only.".toString());
        }
        sheetBehavior.addBottomSheetCallback(sheetStateObserver);
    }

    public final Screen getScreen() {
        return this.screen;
    }

    public final int getLastStableDetentIndex() {
        return this.lastStableDetentIndex;
    }

    public final int getLastStableState() {
        return this.lastStableState;
    }

    private final BottomSheetBehavior<Screen> getSheetBehavior() {
        return this.screen.getSheetBehavior();
    }

    private final ScreenStackFragment getStackFragment() {
        Fragment fragment = this.screen.getFragment();
        Intrinsics.checkNotNull(fragment, "null cannot be cast to non-null type com.swmansion.rnscreens.ScreenStackFragment");
        return (ScreenStackFragment) fragment;
    }

    private final View requireDecorView() {
        Activity currentActivity = this.screen.getReactContext().getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("[RNScreens] Attempt to access activity on detached context".toString());
        }
        View decorView = currentActivity.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        return decorView;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        int i = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
        if (i == 1) {
            handleHostFragmentOnStart();
        } else if (i == 2) {
            handleHostFragmentOnResume();
        } else {
            if (i != 3) {
                return;
            }
            handleHostFragmentOnPause();
        }
    }

    private final void handleHostFragmentOnStart() {
        InsetsObserverProxy.INSTANCE.registerOnView(requireDecorView());
    }

    private final void handleHostFragmentOnResume() {
        InsetsObserverProxy.INSTANCE.addOnApplyWindowInsetsListener(this);
    }

    private final void handleHostFragmentOnPause() {
        InsetsObserverProxy.INSTANCE.removeOnApplyWindowInsetsListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSheetStateChanged(int newState) {
        boolean isStateStable = SheetUtils.INSTANCE.isStateStable(newState);
        if (isStateStable) {
            this.lastStableState = newState;
            this.lastStableDetentIndex = this.screen.getSheetDetents().indexFromSheetState$react_native_screens_release(newState);
        }
        this.screen.onSheetDetentChanged$react_native_screens_release(this.lastStableDetentIndex, isStateStable);
        if (shouldDismissSheetInState(newState)) {
            getStackFragment().dismissSelf$react_native_screens_release();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003e, code lost:
    
        if (com.swmansion.rnscreens.bottomsheet.SheetUtilsKt.isLaidOutOrHasCachedLayout(r1) != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateBottomSheetMetrics$react_native_screens_release(BottomSheetBehavior<Screen> behavior) {
        Integer valueOf;
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        Integer tryResolveContainerHeight = this.screen.getSheetShouldOverflowTopInset() ? tryResolveContainerHeight() : tryResolveSafeAreaSpaceForSheet();
        if (tryResolveContainerHeight == null) {
            throw new IllegalStateException("[RNScreens] Failed to find window height during bottom sheet behaviour configuration".toString());
        }
        boolean isSheetFitToContents = SheetUtilsKt.isSheetFitToContents(this.screen);
        if (isSheetFitToContents) {
            ScreenContentWrapper contentWrapper = this.screen.getContentWrapper();
            if (contentWrapper != null) {
                valueOf = Integer.valueOf(contentWrapper.getHeight());
                valueOf.intValue();
            }
            valueOf = null;
        } else {
            if (isSheetFitToContents) {
                throw new NoWhenBranchMatchedException();
            }
            valueOf = Integer.valueOf((int) (this.screen.getSheetDetents().highest$react_native_screens_release() * tryResolveContainerHeight.intValue()));
        }
        BottomSheetBehaviorExtKt.updateMetrics(behavior, valueOf, this.screen.getSheetDetents().getCount$react_native_screens_release() == 3 ? Integer.valueOf(this.screen.getSheetDetents().expandedOffsetFromTop$react_native_screens_release(tryResolveContainerHeight.intValue(), this.lastTopInset)) : null);
    }

    public static /* synthetic */ BottomSheetBehavior configureBottomSheetBehaviour$react_native_screens_release$default(SheetDelegate sheetDelegate, BottomSheetBehavior bottomSheetBehavior, KeyboardState keyboardState, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            keyboardState = KeyboardNotVisible.INSTANCE;
        }
        if ((i2 & 4) != 0) {
            i = sheetDelegate.lastStableDetentIndex;
        }
        return sheetDelegate.configureBottomSheetBehaviour$react_native_screens_release(bottomSheetBehavior, keyboardState, i);
    }

    public final BottomSheetBehavior<Screen> configureBottomSheetBehaviour$react_native_screens_release(BottomSheetBehavior<Screen> behavior, KeyboardState keyboardState, int selectedDetentIndex) {
        int maxAllowedHeight$react_native_screens_release;
        int maxAllowedHeight$react_native_screens_release2;
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        Intrinsics.checkNotNullParameter(keyboardState, "keyboardState");
        Integer tryResolveContainerHeight = this.screen.getSheetShouldOverflowTopInset() ? tryResolveContainerHeight() : tryResolveSafeAreaSpaceForSheet();
        if (tryResolveContainerHeight == null) {
            throw new IllegalStateException("[RNScreens] Failed to find window height during bottom sheet behaviour configuration".toString());
        }
        behavior.setHideable(true);
        behavior.setDraggable(true);
        behavior.addBottomSheetCallback(this.sheetStateObserver);
        ScreenFooter footer = this.screen.getFooter();
        if (footer != null) {
            footer.registerWithSheetBehavior(behavior);
        }
        if (keyboardState instanceof KeyboardNotVisible) {
            int count$react_native_screens_release = this.screen.getSheetDetents().getCount$react_native_screens_release();
            if (count$react_native_screens_release == 1) {
                Integer num = tryResolveContainerHeight;
                if (SheetUtilsKt.isSheetFitToContents(this.screen)) {
                    maxAllowedHeight$react_native_screens_release2 = this.screen.getSheetDetents().maxAllowedHeightForFitToContents$react_native_screens_release(this.screen);
                } else {
                    maxAllowedHeight$react_native_screens_release2 = this.screen.getSheetDetents().maxAllowedHeight$react_native_screens_release(num.intValue());
                }
                BottomSheetBehaviorExtKt.useSingleDetent$default(behavior, Integer.valueOf(maxAllowedHeight$react_native_screens_release2), false, 2, null);
                return behavior;
            }
            if (count$react_native_screens_release == 2) {
                Integer num2 = tryResolveContainerHeight;
                return BottomSheetBehaviorExtKt.useTwoDetents(behavior, Integer.valueOf(this.screen.getSheetDetents().sheetStateFromIndex$react_native_screens_release(selectedDetentIndex)), Integer.valueOf(this.screen.getSheetDetents().firstHeight$react_native_screens_release(num2.intValue())), Integer.valueOf(this.screen.getSheetDetents().maxAllowedHeight$react_native_screens_release(num2.intValue())));
            }
            if (count$react_native_screens_release == 3) {
                return BottomSheetBehaviorExtKt.useThreeDetents(behavior, Integer.valueOf(this.screen.getSheetDetents().sheetStateFromIndex$react_native_screens_release(selectedDetentIndex)), Integer.valueOf(this.screen.getSheetDetents().firstHeight$react_native_screens_release(tryResolveContainerHeight.intValue())), Integer.valueOf(this.screen.getSheetDetents().maxAllowedHeight$react_native_screens_release(tryResolveContainerHeight.intValue())), Float.valueOf(this.screen.getSheetDetents().halfExpandedRatio$react_native_screens_release()), Integer.valueOf(this.screen.getSheetDetents().expandedOffsetFromTop$react_native_screens_release(tryResolveContainerHeight.intValue(), this.lastTopInset)));
            }
            throw new IllegalStateException("[RNScreens] Invalid detent count " + this.screen.getSheetDetents().getCount$react_native_screens_release() + ". Expected at most 3.");
        }
        Integer num3 = tryResolveContainerHeight;
        if (keyboardState instanceof KeyboardVisible) {
            boolean z = ((KeyboardVisible) keyboardState).getHeight() != 0;
            int count$react_native_screens_release2 = this.screen.getSheetDetents().getCount$react_native_screens_release();
            if (count$react_native_screens_release2 == 1) {
                behavior.addBottomSheetCallback(this.keyboardHandlerCallback);
                return behavior;
            }
            if (count$react_native_screens_release2 == 2) {
                if (z) {
                    BottomSheetBehaviorExtKt.useTwoDetents$default(behavior, 3, null, null, 6, null);
                } else {
                    BottomSheetBehaviorExtKt.useTwoDetents$default(behavior, null, null, null, 7, null);
                }
                behavior.addBottomSheetCallback(this.keyboardHandlerCallback);
                return behavior;
            }
            if (count$react_native_screens_release2 == 3) {
                if (z) {
                    BottomSheetBehaviorExtKt.useThreeDetents$default(behavior, 3, null, null, null, null, 30, null);
                } else {
                    BottomSheetBehaviorExtKt.useThreeDetents$default(behavior, null, null, null, null, null, 31, null);
                }
                behavior.addBottomSheetCallback(this.keyboardHandlerCallback);
                return behavior;
            }
            throw new IllegalStateException("[RNScreens] Invalid detent count " + this.screen.getSheetDetents().getCount$react_native_screens_release() + ". Expected at most 3.");
        }
        if (!(keyboardState instanceof KeyboardDidHide)) {
            throw new NoWhenBranchMatchedException();
        }
        behavior.removeBottomSheetCallback(this.keyboardHandlerCallback);
        int count$react_native_screens_release3 = this.screen.getSheetDetents().getCount$react_native_screens_release();
        if (count$react_native_screens_release3 == 1) {
            if (SheetUtilsKt.isSheetFitToContents(this.screen)) {
                maxAllowedHeight$react_native_screens_release = this.screen.getSheetDetents().maxAllowedHeightForFitToContents$react_native_screens_release(this.screen);
            } else {
                maxAllowedHeight$react_native_screens_release = this.screen.getSheetDetents().maxAllowedHeight$react_native_screens_release(num3.intValue());
            }
            BottomSheetBehaviorExtKt.useSingleDetent(behavior, Integer.valueOf(maxAllowedHeight$react_native_screens_release), false);
            return behavior;
        }
        if (count$react_native_screens_release3 == 2) {
            return BottomSheetBehaviorExtKt.useTwoDetents$default(behavior, null, Integer.valueOf(this.screen.getSheetDetents().firstHeight$react_native_screens_release(num3.intValue())), Integer.valueOf(this.screen.getSheetDetents().maxAllowedHeight$react_native_screens_release(num3.intValue())), 1, null);
        }
        if (count$react_native_screens_release3 == 3) {
            return BottomSheetBehaviorExtKt.useThreeDetents$default(behavior, null, Integer.valueOf(this.screen.getSheetDetents().firstHeight$react_native_screens_release(num3.intValue())), Integer.valueOf(this.screen.getSheetDetents().maxAllowedHeight$react_native_screens_release(num3.intValue())), Float.valueOf(this.screen.getSheetDetents().halfExpandedRatio$react_native_screens_release()), Integer.valueOf(this.screen.getSheetDetents().expandedOffsetFromTop$react_native_screens_release(num3.intValue(), this.lastTopInset)), 1, null);
        }
        throw new IllegalStateException("[RNScreens] Invalid detent count " + this.screen.getSheetDetents().getCount$react_native_screens_release() + ". Expected at most 3.");
    }

    public final int computeSheetOffsetYWithIMEPresent$react_native_screens_release(int keyboardHeight) {
        Integer tryResolveContainerHeight = this.screen.getSheetShouldOverflowTopInset() ? tryResolveContainerHeight() : tryResolveSafeAreaSpaceForSheet();
        if (tryResolveContainerHeight == null) {
            throw new IllegalStateException("[RNScreens] Failed to find window height during bottom sheet behaviour configuration".toString());
        }
        if (SheetUtilsKt.isSheetFitToContents(this.screen)) {
            ScreenContentWrapper contentWrapper = this.screen.getContentWrapper();
            return Math.min(Math.max(tryResolveContainerHeight.intValue() - (contentWrapper != null ? contentWrapper.getHeight() : 0), 0), keyboardHeight);
        }
        return Math.min(tryResolveContainerHeight.intValue() - ((int) (RangesKt.coerceIn(this.screen.getSheetDetents().highest$react_native_screens_release(), 0.0d, 1.0d) * tryResolveContainerHeight.intValue())), keyboardHeight);
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View v, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(v, "v");
        Intrinsics.checkNotNullParameter(insets, "insets");
        boolean isVisible = insets.isVisible(WindowInsetsCompat.Type.ime());
        Insets insets2 = insets.getInsets(WindowInsetsCompat.Type.ime());
        Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
        Insets insets3 = insets.getInsets(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insets3, "getInsets(...)");
        Insets insets4 = insets.getInsets(WindowInsetsCompat.Type.displayCutout());
        Intrinsics.checkNotNullExpressionValue(insets4, "getInsets(...)");
        this.lastTopInset = Math.max(insets3.top, insets4.top);
        if (isVisible) {
            this.isKeyboardVisible = true;
            this.keyboardState = new KeyboardVisible(insets2.bottom);
            BottomSheetBehavior<Screen> sheetBehavior = getSheetBehavior();
            if (sheetBehavior != null) {
                configureBottomSheetBehaviour$react_native_screens_release$default(this, sheetBehavior, this.keyboardState, 0, 4, null);
            }
        } else {
            BottomSheetBehavior<Screen> sheetBehavior2 = getSheetBehavior();
            if (sheetBehavior2 != null) {
                if (this.isKeyboardVisible) {
                    configureBottomSheetBehaviour$react_native_screens_release$default(this, sheetBehavior2, KeyboardDidHide.INSTANCE, 0, 4, null);
                } else if (!Intrinsics.areEqual(this.keyboardState, KeyboardNotVisible.INSTANCE)) {
                    configureBottomSheetBehaviour$react_native_screens_release$default(this, sheetBehavior2, KeyboardNotVisible.INSTANCE, 0, 4, null);
                }
            }
            this.keyboardState = KeyboardNotVisible.INSTANCE;
            this.isKeyboardVisible = false;
        }
        WindowInsetsCompat build = new WindowInsetsCompat.Builder(insets).setInsets(WindowInsetsCompat.Type.systemBars(), Insets.of(insets3.left, insets3.top, insets3.right, isVisible ? 0 : insets3.bottom)).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    private final Integer tryResolveSafeAreaSpaceForSheet() {
        Integer tryResolveContainerHeight = tryResolveContainerHeight();
        if (tryResolveContainerHeight != null) {
            return Integer.valueOf(tryResolveContainerHeight.intValue() - this.lastTopInset);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
    
        r0 = r0.getCurrentWindowMetrics();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
    
        r0 = r0.getBounds();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Integer tryResolveContainerHeight() {
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        DisplayMetrics displayMetrics;
        ScreenContainer container = this.screen.getContainer();
        if (container != null) {
            return Integer.valueOf(container.getHeight());
        }
        ThemedReactContext reactContext = this.screen.getReactContext();
        Resources resources = reactContext.getResources();
        if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            return Integer.valueOf(displayMetrics.heightPixels);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            Object systemService = reactContext.getSystemService("window");
            WindowManager windowManager = systemService instanceof WindowManager ? (WindowManager) systemService : null;
            if (windowManager != null && currentWindowMetrics != null && bounds != null) {
                return Integer.valueOf(bounds.height());
            }
        }
        return null;
    }

    public final Animator createSheetEnterAnimator$react_native_screens_release(SheetAnimationContext sheetAnimationContext) {
        Intrinsics.checkNotNullParameter(sheetAnimationContext, "sheetAnimationContext");
        AnimatorSet animatorSet = new AnimatorSet();
        DimmingViewManager dimmingDelegate = sheetAnimationContext.getDimmingDelegate();
        ScreenStackFragment fragment = sheetAnimationContext.getFragment();
        ValueAnimator createDimmingViewAlphaAnimator = createDimmingViewAlphaAnimator(0.0f, dimmingDelegate.getMaxAlpha(), dimmingDelegate);
        AnimatorSet.Builder play = animatorSet.play(createSheetSlideInAnimator());
        Screen screen = this.screen;
        if (!dimmingDelegate.willDimForDetentIndex(screen, screen.getSheetInitialDetentIndex())) {
            play = null;
        }
        if (play != null) {
            play.with(createDimmingViewAlphaAnimator);
        }
        attachCommonListeners(animatorSet, true, fragment);
        return animatorSet;
    }

    public final Animator createSheetExitAnimator$react_native_screens_release(SheetAnimationContext sheetAnimationContext) {
        Intrinsics.checkNotNullParameter(sheetAnimationContext, "sheetAnimationContext");
        AnimatorSet animatorSet = new AnimatorSet();
        CoordinatorLayout coordinatorLayout = sheetAnimationContext.getCoordinatorLayout();
        DimmingViewManager dimmingDelegate = sheetAnimationContext.getDimmingDelegate();
        ScreenStackFragment fragment = sheetAnimationContext.getFragment();
        ValueAnimator createDimmingViewAlphaAnimator = createDimmingViewAlphaAnimator(dimmingDelegate.getDimmingView().getAlpha(), 0.0f, dimmingDelegate);
        animatorSet.play(createDimmingViewAlphaAnimator).with(createSheetSlideOutAnimator(coordinatorLayout));
        attachCommonListeners(animatorSet, false, fragment);
        return animatorSet;
    }

    private final ValueAnimator createDimmingViewAlphaAnimator(float from, float to, final DimmingViewManager dimmingDelegate) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(from, to);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.swmansion.rnscreens.bottomsheet.SheetDelegate$$ExternalSyntheticLambda3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SheetDelegate.createDimmingViewAlphaAnimator$lambda$23$lambda$22(DimmingViewManager.this, valueAnimator);
            }
        });
        Intrinsics.checkNotNullExpressionValue(ofFloat, "apply(...)");
        return ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createDimmingViewAlphaAnimator$lambda$23$lambda$22(DimmingViewManager dimmingViewManager, ValueAnimator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        Object animatedValue = animator.getAnimatedValue();
        Float f = animatedValue instanceof Float ? (Float) animatedValue : null;
        if (f != null) {
            dimmingViewManager.getDimmingView().setAlpha(f.floatValue());
        }
    }

    private final ValueAnimator createSheetSlideInAnimator() {
        ValueAnimator ofObject = ValueAnimator.ofObject(new ExternalBoundaryValuesEvaluator(new Function1() { // from class: com.swmansion.rnscreens.bottomsheet.SheetDelegate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                float createSheetSlideInAnimator$lambda$24;
                createSheetSlideInAnimator$lambda$24 = SheetDelegate.createSheetSlideInAnimator$lambda$24(SheetDelegate.this, (Number) obj);
                return Float.valueOf(createSheetSlideInAnimator$lambda$24);
            }
        }, new Function1() { // from class: com.swmansion.rnscreens.bottomsheet.SheetDelegate$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Float createSheetSlideInAnimator$lambda$25;
                createSheetSlideInAnimator$lambda$25 = SheetDelegate.createSheetSlideInAnimator$lambda$25((Number) obj);
                return createSheetSlideInAnimator$lambda$25;
            }
        }), Float.valueOf(this.screen.getHeight()), Float.valueOf(0.0f));
        ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.swmansion.rnscreens.bottomsheet.SheetDelegate$$ExternalSyntheticLambda2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SheetDelegate.createSheetSlideInAnimator$lambda$27$lambda$26(SheetDelegate.this, valueAnimator);
            }
        });
        Intrinsics.checkNotNullExpressionValue(ofObject, "apply(...)");
        return ofObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float createSheetSlideInAnimator$lambda$24(SheetDelegate sheetDelegate, Number number) {
        return sheetDelegate.screen.getHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Float createSheetSlideInAnimator$lambda$25(Number number) {
        return Float.valueOf(0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createSheetSlideInAnimator$lambda$27$lambda$26(SheetDelegate sheetDelegate, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        sheetDelegate.updateSheetTranslationY(((Float) animatedValue).floatValue());
    }

    private final ValueAnimator createSheetSlideOutAnimator(CoordinatorLayout coordinatorLayout) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, (coordinatorLayout.getBottom() - this.screen.getTop()) - this.screen.getTranslationY());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.swmansion.rnscreens.bottomsheet.SheetDelegate$$ExternalSyntheticLambda4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SheetDelegate.createSheetSlideOutAnimator$lambda$29$lambda$28(SheetDelegate.this, valueAnimator);
            }
        });
        Intrinsics.checkNotNullExpressionValue(ofFloat, "apply(...)");
        return ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createSheetSlideOutAnimator$lambda$29$lambda$28(SheetDelegate sheetDelegate, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        sheetDelegate.updateSheetTranslationY(((Float) animatedValue).floatValue());
    }

    private final void updateSheetTranslationY(float baseTranslationY) {
        this.screen.setTranslationY(baseTranslationY - computeSheetOffsetYWithIMEPresent$react_native_screens_release(this.lastKeyboardBottomOffset));
    }

    public final void handleKeyboardInsetsProgress$react_native_screens_release(WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        this.lastKeyboardBottomOffset = insets.getInsets(WindowInsetsCompat.Type.ime()).bottom;
        if (this.isSheetAnimationInProgress) {
            return;
        }
        updateSheetTranslationY(0.0f);
    }

    private final void attachCommonListeners(AnimatorSet animatorSet, boolean isEnter, ScreenStackFragment screenStackFragment) {
        ScreenAnimationDelegate.AnimationType animationType;
        ScreenStackFragment screenStackFragment2 = screenStackFragment;
        ScreenEventEmitter screenEventEmitter = new ScreenEventEmitter(this.screen);
        if (isEnter) {
            animationType = ScreenAnimationDelegate.AnimationType.ENTER;
        } else {
            animationType = ScreenAnimationDelegate.AnimationType.EXIT;
        }
        animatorSet.addListener(new ScreenAnimationDelegate(screenStackFragment2, screenEventEmitter, animationType));
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.swmansion.rnscreens.bottomsheet.SheetDelegate$attachCommonListeners$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                SheetDelegate.this.isSheetAnimationInProgress = true;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                SheetDelegate.this.isSheetAnimationInProgress = false;
                SheetDelegate.this.getScreen().onSheetYTranslationChanged$react_native_screens_release();
            }
        });
    }

    /* compiled from: SheetDelegate.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Lcom/swmansion/rnscreens/bottomsheet/SheetDelegate$KeyboardHandler;", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "<init>", "(Lcom/swmansion/rnscreens/bottomsheet/SheetDelegate;)V", "onStateChanged", "", "bottomSheet", "Landroid/view/View;", "newState", "", "onSlide", "slideOffset", "", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class KeyboardHandler extends BottomSheetBehavior.BottomSheetCallback {
        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(View bottomSheet, float slideOffset) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        }

        public KeyboardHandler() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(View bottomSheet, int newState) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            if (newState == 4 && WindowInsetsCompat.toWindowInsetsCompat(bottomSheet.getRootWindowInsets()).isVisible(WindowInsetsCompat.Type.ime())) {
                bottomSheet.requestFocus();
                ((InputMethodManager) SheetDelegate.this.getScreen().getReactContext().getSystemService(InputMethodManager.class)).hideSoftInputFromWindow(bottomSheet.getWindowToken(), 0);
            }
        }
    }

    /* compiled from: SheetDelegate.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Lcom/swmansion/rnscreens/bottomsheet/SheetDelegate$SheetStateObserver;", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "<init>", "(Lcom/swmansion/rnscreens/bottomsheet/SheetDelegate;)V", "onStateChanged", "", "bottomSheet", "Landroid/view/View;", "newState", "", "onSlide", "slideOffset", "", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class SheetStateObserver extends BottomSheetBehavior.BottomSheetCallback {
        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(View bottomSheet, float slideOffset) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        }

        public SheetStateObserver() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(View bottomSheet, int newState) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            SheetDelegate.this.onSheetStateChanged(newState);
        }
    }

    /* compiled from: SheetDelegate.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/swmansion/rnscreens/bottomsheet/SheetDelegate$SheetAnimationContext;", "", Request.JsonKeys.FRAGMENT, "Lcom/swmansion/rnscreens/ScreenStackFragment;", AnalyticsConstantsKt.KEY_SCREEN, "Lcom/swmansion/rnscreens/Screen;", "coordinatorLayout", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "dimmingDelegate", "Lcom/swmansion/rnscreens/bottomsheet/DimmingViewManager;", "<init>", "(Lcom/swmansion/rnscreens/ScreenStackFragment;Lcom/swmansion/rnscreens/Screen;Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lcom/swmansion/rnscreens/bottomsheet/DimmingViewManager;)V", "getFragment", "()Lcom/swmansion/rnscreens/ScreenStackFragment;", "getScreen", "()Lcom/swmansion/rnscreens/Screen;", "getCoordinatorLayout", "()Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "getDimmingDelegate", "()Lcom/swmansion/rnscreens/bottomsheet/DimmingViewManager;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SheetAnimationContext {
        private final CoordinatorLayout coordinatorLayout;
        private final DimmingViewManager dimmingDelegate;
        private final ScreenStackFragment fragment;
        private final Screen screen;

        public static /* synthetic */ SheetAnimationContext copy$default(SheetAnimationContext sheetAnimationContext, ScreenStackFragment screenStackFragment, Screen screen, CoordinatorLayout coordinatorLayout, DimmingViewManager dimmingViewManager, int i, Object obj) {
            if ((i & 1) != 0) {
                screenStackFragment = sheetAnimationContext.fragment;
            }
            if ((i & 2) != 0) {
                screen = sheetAnimationContext.screen;
            }
            if ((i & 4) != 0) {
                coordinatorLayout = sheetAnimationContext.coordinatorLayout;
            }
            if ((i & 8) != 0) {
                dimmingViewManager = sheetAnimationContext.dimmingDelegate;
            }
            return sheetAnimationContext.copy(screenStackFragment, screen, coordinatorLayout, dimmingViewManager);
        }

        /* renamed from: component1, reason: from getter */
        public final ScreenStackFragment getFragment() {
            return this.fragment;
        }

        /* renamed from: component2, reason: from getter */
        public final Screen getScreen() {
            return this.screen;
        }

        /* renamed from: component3, reason: from getter */
        public final CoordinatorLayout getCoordinatorLayout() {
            return this.coordinatorLayout;
        }

        /* renamed from: component4, reason: from getter */
        public final DimmingViewManager getDimmingDelegate() {
            return this.dimmingDelegate;
        }

        public final SheetAnimationContext copy(ScreenStackFragment fragment, Screen screen, CoordinatorLayout coordinatorLayout, DimmingViewManager dimmingDelegate) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(screen, "screen");
            Intrinsics.checkNotNullParameter(coordinatorLayout, "coordinatorLayout");
            Intrinsics.checkNotNullParameter(dimmingDelegate, "dimmingDelegate");
            return new SheetAnimationContext(fragment, screen, coordinatorLayout, dimmingDelegate);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SheetAnimationContext)) {
                return false;
            }
            SheetAnimationContext sheetAnimationContext = (SheetAnimationContext) other;
            return Intrinsics.areEqual(this.fragment, sheetAnimationContext.fragment) && Intrinsics.areEqual(this.screen, sheetAnimationContext.screen) && Intrinsics.areEqual(this.coordinatorLayout, sheetAnimationContext.coordinatorLayout) && Intrinsics.areEqual(this.dimmingDelegate, sheetAnimationContext.dimmingDelegate);
        }

        public int hashCode() {
            return (((((this.fragment.hashCode() * 31) + this.screen.hashCode()) * 31) + this.coordinatorLayout.hashCode()) * 31) + this.dimmingDelegate.hashCode();
        }

        public String toString() {
            return "SheetAnimationContext(fragment=" + this.fragment + ", screen=" + this.screen + ", coordinatorLayout=" + this.coordinatorLayout + ", dimmingDelegate=" + this.dimmingDelegate + ")";
        }

        public SheetAnimationContext(ScreenStackFragment fragment, Screen screen, CoordinatorLayout coordinatorLayout, DimmingViewManager dimmingDelegate) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(screen, "screen");
            Intrinsics.checkNotNullParameter(coordinatorLayout, "coordinatorLayout");
            Intrinsics.checkNotNullParameter(dimmingDelegate, "dimmingDelegate");
            this.fragment = fragment;
            this.screen = screen;
            this.coordinatorLayout = coordinatorLayout;
            this.dimmingDelegate = dimmingDelegate;
        }

        public final ScreenStackFragment getFragment() {
            return this.fragment;
        }

        public final Screen getScreen() {
            return this.screen;
        }

        public final CoordinatorLayout getCoordinatorLayout() {
            return this.coordinatorLayout;
        }

        public final DimmingViewManager getDimmingDelegate() {
            return this.dimmingDelegate;
        }
    }
}
