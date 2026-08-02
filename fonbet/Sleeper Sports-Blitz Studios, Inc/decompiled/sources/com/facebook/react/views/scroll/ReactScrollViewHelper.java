package com.facebook.react.views.scroll;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.widget.OverScroller;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.bridge.ScrollEndedListeners;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ReactClippingViewGroup;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.common.ViewUtil;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.scroll.ReactScrollViewHelper;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: ReactScrollViewHelper.kt */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001:\thijklmnopB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u001e\u001a\u00020\u001f\"\u000e\b\u0000\u0010 *\u0004\u0018\u00010!*\u00020\"2\u0006\u0010#\u001a\u0002H 2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%H\u0007¢\u0006\u0002\u0010'J%\u0010(\u001a\u00020\u001f\"\u000e\b\u0000\u0010 *\u0004\u0018\u00010!*\u00020\"2\u0006\u0010#\u001a\u0002H H\u0007¢\u0006\u0002\u0010)J5\u0010*\u001a\u00020\u001f\"\u000e\b\u0000\u0010 *\u0004\u0018\u00010!*\u00020\"2\u0006\u0010#\u001a\u0002H 2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%H\u0007¢\u0006\u0002\u0010'J5\u0010+\u001a\u00020\u001f\"\u000e\b\u0000\u0010 *\u0004\u0018\u00010!*\u00020\"2\u0006\u0010#\u001a\u0002H 2\u0006\u0010$\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u0012H\u0007¢\u0006\u0002\u0010,J%\u0010-\u001a\u00020\u001f\"\u000e\b\u0000\u0010 *\u0004\u0018\u00010!*\u00020\"2\u0006\u0010#\u001a\u0002H H\u0007¢\u0006\u0002\u0010)J-\u0010\u001e\u001a\u00020\u001f\"\u000e\b\u0000\u0010 *\u0004\u0018\u00010!*\u00020\"2\u0006\u0010#\u001a\u0002H 2\u0006\u0010.\u001a\u00020/H\u0002¢\u0006\u0002\u00100J=\u0010\u001e\u001a\u00020\u001f\"\u000e\b\u0000\u0010 *\u0004\u0018\u00010!*\u00020\"2\u0006\u0010#\u001a\u0002H 2\u0006\u0010.\u001a\u00020/2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0002\u00101J\u0015\u00102\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"H\u0001¢\u0006\u0002\b3J\u0010\u00104\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"H\u0007J\u0010\u00105\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"H\u0007J\u0012\u00106\u001a\u00020\u00122\b\u00107\u001a\u0004\u0018\u00010\u0005H\u0007J\u0012\u00108\u001a\u00020\u00122\b\u00109\u001a\u0004\u0018\u00010\u0005H\u0007J\u0012\u0010:\u001a\u00020\u00122\b\u0010;\u001a\u0004\u0018\u00010<H\u0007J\u0010\u0010=\u001a\u00020\u001f2\u0006\u0010>\u001a\u00020\u0019H\u0007J\u0010\u0010?\u001a\u00020\u001f2\u0006\u0010>\u001a\u00020\u0019H\u0007J\u0010\u0010@\u001a\u00020\u001f2\u0006\u0010>\u001a\u00020\u001bH\u0007J\u0010\u0010A\u001a\u00020\u001f2\u0006\u0010>\u001a\u00020\u001bH\u0007JA\u0010B\u001a\u00020\u001f\"\u001a\b\u0000\u0010 *\u0004\u0018\u00010C*\u0004\u0018\u00010D*\u0004\u0018\u00010E*\u00020\"2\u0006\u0010#\u001a\u0002H 2\u0006\u0010F\u001a\u00020\u00122\u0006\u0010G\u001a\u00020\u0012H\u0007¢\u0006\u0002\u0010,JC\u0010H\u001a\u00020\u0012\"\u0014\b\u0000\u0010 *\u0004\u0018\u00010C*\u0004\u0018\u00010D*\u00020\"2\u0006\u0010#\u001a\u0002H 2\u0006\u0010I\u001a\u00020\u00122\u0006\u0010J\u001a\u00020\u00122\u0006\u0010K\u001a\u00020\u0012H\u0007¢\u0006\u0002\u0010LJ1\u0010M\u001a\u00020\u001f\"\u001a\b\u0000\u0010 *\u0004\u0018\u00010C*\u0004\u0018\u00010D*\u0004\u0018\u00010E*\u00020\"2\u0006\u0010#\u001a\u0002H H\u0007¢\u0006\u0002\u0010)J9\u0010M\u001a\u00020\u001f\"\u0014\b\u0000\u0010 *\u0004\u0018\u00010D*\u0004\u0018\u00010E*\u00020\"2\u0006\u0010#\u001a\u0002H 2\u0006\u0010N\u001a\u00020\u00122\u0006\u0010O\u001a\u00020\u0012¢\u0006\u0002\u0010,J+\u0010P\u001a\u00020\u001f\"\u0014\b\u0000\u0010 *\u0004\u0018\u00010D*\u0004\u0018\u00010E*\u00020\"2\u0006\u0010#\u001a\u0002H H\u0007¢\u0006\u0002\u0010)J5\u0010Q\u001a\u00020\u001f\"\u0014\b\u0000\u0010 *\u0004\u0018\u00010D*\u0004\u0018\u00010E*\u00020\"2\u0006\u0010#\u001a\u0002H 2\u0006\u0010R\u001a\u00020SH\u0001¢\u0006\u0004\bT\u0010UJG\u0010V\u001a\u00020\u001f\" \b\u0000\u0010 *\u0004\u0018\u00010C*\u0004\u0018\u00010!*\u0004\u0018\u00010D*\u0004\u0018\u00010E*\u00020\"2\u0006\u0010#\u001a\u0002H 2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%H\u0007¢\u0006\u0002\u0010'J/\u0010W\u001a\u00020\u001f\"\u001a\b\u0000\u0010 *\u0004\u0018\u00010C*\u0004\u0018\u00010D*\u0004\u0018\u00010E*\u00020\"2\u0006\u0010#\u001a\u0002H ¢\u0006\u0002\u0010)J+\u0010X\u001a\u00020\u001f\"\u0014\b\u0000\u0010 *\u0004\u0018\u00010C*\u0004\u0018\u00010!*\u00020\"2\u0006\u0010#\u001a\u0002H H\u0007¢\u0006\u0002\u0010)JK\u0010Y\u001a\u00020Z\"\u0014\b\u0000\u0010 *\u0004\u0018\u00010C*\u0004\u0018\u00010D*\u00020\"2\u0006\u0010#\u001a\u0002H 2\u0006\u0010[\u001a\u00020\u00122\u0006\u0010\\\u001a\u00020\u00122\u0006\u0010]\u001a\u00020\u00122\u0006\u0010^\u001a\u00020\u0012H\u0007¢\u0006\u0002\u0010_J\"\u0010`\u001a\u0004\u0018\u00010a2\u0006\u0010b\u001a\u00020\"2\u0006\u0010c\u001a\u00020a2\u0006\u0010d\u001a\u00020\u0012H\u0007J \u0010e\u001a\u00020\u00122\u0006\u0010d\u001a\u00020\u00122\u0006\u0010f\u001a\u00020\b2\u0006\u0010g\u001a\u00020\u0012H\u0007R\u0016\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0012X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0012X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006q"}, d2 = {"Lcom/facebook/react/views/scroll/ReactScrollViewHelper;", "", "<init>", "()V", "TAG", "", "kotlin.jvm.PlatformType", "DEBUG_MODE", "", "CONTENT_OFFSET_LEFT", "CONTENT_OFFSET_TOP", "SCROLL_AWAY_PADDING_TOP", "MOMENTUM_DELAY", "", "OVER_SCROLL_ALWAYS", "AUTO", "OVER_SCROLL_NEVER", "SNAP_ALIGNMENT_DISABLED", "", "SNAP_ALIGNMENT_START", "SNAP_ALIGNMENT_CENTER", "SNAP_ALIGNMENT_END", "scrollListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Ljava/lang/ref/WeakReference;", "Lcom/facebook/react/views/scroll/ReactScrollViewHelper$ScrollListener;", "layoutChangeListeners", "Lcom/facebook/react/views/scroll/ReactScrollViewHelper$LayoutChangeListener;", "SMOOTH_SCROLL_DURATION", "smoothScrollDurationInitialized", "emitScrollEvent", "", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/facebook/react/views/scroll/ReactScrollViewHelper$HasScrollEventThrottle;", "Landroid/view/ViewGroup;", "scrollView", "xVelocity", "", "yVelocity", "(Landroid/view/ViewGroup;FF)V", "emitScrollBeginDragEvent", "(Landroid/view/ViewGroup;)V", "emitScrollEndDragEvent", "emitScrollMomentumBeginEvent", "(Landroid/view/ViewGroup;II)V", "emitScrollMomentumEndEvent", "scrollEventType", "Lcom/facebook/react/views/scroll/ScrollEventType;", "(Landroid/view/ViewGroup;Lcom/facebook/react/views/scroll/ScrollEventType;)V", "(Landroid/view/ViewGroup;Lcom/facebook/react/views/scroll/ScrollEventType;FF)V", "notifyUserDrivenScrollEnded", "notifyUserDrivenScrollEnded_internal", "emitLayoutEvent", "emitLayoutChangeEvent", "parseOverScrollMode", "jsOverScrollMode", "parseSnapToAlignment", "alignment", "getDefaultScrollAnimationDuration", "context", "Landroid/content/Context;", "addScrollListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "removeScrollListener", "addLayoutChangeListener", "removeLayoutChangeListener", "smoothScrollTo", "Lcom/facebook/react/views/scroll/ReactScrollViewHelper$HasFlingAnimator;", "Lcom/facebook/react/views/scroll/ReactScrollViewHelper$HasScrollState;", "Lcom/facebook/react/views/scroll/ReactScrollViewHelper$HasStateWrapper;", "x", "y", "getNextFlingStartValue", "currentValue", "postAnimationValue", "velocity", "(Landroid/view/ViewGroup;III)I", "updateFabricScrollState", "scrollX", "scrollY", "forceUpdateState", "loadFabricScrollState", "stateWrapper", "Lcom/facebook/react/uimanager/StateWrapper;", "loadFabricScrollState$ReactAndroid_release", "(Landroid/view/ViewGroup;Lcom/facebook/react/uimanager/StateWrapper;)V", "updateStateOnScrollChanged", "registerFlingAnimator", "dispatchMomentumEndOnAnimationEnd", "predictFinalScrollPosition", "Landroid/graphics/Point;", "velocityX", "velocityY", "maximumOffsetX", "maximumOffsetY", "(Landroid/view/ViewGroup;IIII)Landroid/graphics/Point;", "findNextFocusableView", "Landroid/view/View;", "host", "focused", "direction", "resolveAbsoluteDirection", AnalyticsConstantsKt.HORIZONTAL, ViewProps.LAYOUT_DIRECTION, "ScrollListener", "LayoutChangeListener", "HasStateWrapper", "OverScrollerDurationGetter", "ReactScrollViewScrollState", "HasScrollState", "HasFlingAnimator", "HasScrollEventThrottle", "HasSmoothScroll", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ReactScrollViewHelper {
    public static final String AUTO = "auto";
    private static final String CONTENT_OFFSET_LEFT = "contentOffsetLeft";
    private static final String CONTENT_OFFSET_TOP = "contentOffsetTop";
    private static final boolean DEBUG_MODE = false;
    public static final long MOMENTUM_DELAY = 20;
    public static final String OVER_SCROLL_ALWAYS = "always";
    public static final String OVER_SCROLL_NEVER = "never";
    private static final String SCROLL_AWAY_PADDING_TOP = "scrollAwayPaddingTop";
    public static final int SNAP_ALIGNMENT_CENTER = 2;
    public static final int SNAP_ALIGNMENT_DISABLED = 0;
    public static final int SNAP_ALIGNMENT_END = 3;
    public static final int SNAP_ALIGNMENT_START = 1;
    private static boolean smoothScrollDurationInitialized;
    public static final ReactScrollViewHelper INSTANCE = new ReactScrollViewHelper();
    private static final String TAG = "ReactScrollView";
    private static final CopyOnWriteArrayList<WeakReference<ScrollListener>> scrollListeners = new CopyOnWriteArrayList<>();
    private static final CopyOnWriteArrayList<WeakReference<LayoutChangeListener>> layoutChangeListeners = new CopyOnWriteArrayList<>();
    private static int SMOOTH_SCROLL_DURATION = 250;

    /* compiled from: ReactScrollViewHelper.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/views/scroll/ReactScrollViewHelper$HasFlingAnimator;", "", "startFlingAnimator", "", "start", "", "end", "getFlingAnimator", "Landroid/animation/ValueAnimator;", "getFlingExtrapolatedDistance", "velocity", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface HasFlingAnimator {
        ValueAnimator getFlingAnimator();

        int getFlingExtrapolatedDistance(int velocity);

        void startFlingAnimator(int start, int end);
    }

    /* compiled from: ReactScrollViewHelper.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\tX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/views/scroll/ReactScrollViewHelper$HasScrollEventThrottle;", "", "scrollEventThrottle", "", "getScrollEventThrottle", "()I", "setScrollEventThrottle", "(I)V", "lastScrollDispatchTime", "", "getLastScrollDispatchTime", "()J", "setLastScrollDispatchTime", "(J)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface HasScrollEventThrottle {
        long getLastScrollDispatchTime();

        int getScrollEventThrottle();

        void setLastScrollDispatchTime(long j);

        void setScrollEventThrottle(int i);
    }

    /* compiled from: ReactScrollViewHelper.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/views/scroll/ReactScrollViewHelper$HasScrollState;", "", "reactScrollViewScrollState", "Lcom/facebook/react/views/scroll/ReactScrollViewHelper$ReactScrollViewScrollState;", "getReactScrollViewScrollState", "()Lcom/facebook/react/views/scroll/ReactScrollViewHelper$ReactScrollViewScrollState;", "setReactScrollViewScrollState", "(Lcom/facebook/react/views/scroll/ReactScrollViewHelper$ReactScrollViewScrollState;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface HasScrollState {
        ReactScrollViewScrollState getReactScrollViewScrollState();

        void setReactScrollViewScrollState(ReactScrollViewScrollState reactScrollViewScrollState);
    }

    /* compiled from: ReactScrollViewHelper.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/views/scroll/ReactScrollViewHelper$HasSmoothScroll;", "", "reactSmoothScrollTo", "", "x", "", "y", "scrollToPreservingMomentum", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface HasSmoothScroll {
        void reactSmoothScrollTo(int x, int y);

        void scrollToPreservingMomentum(int x, int y);
    }

    /* compiled from: ReactScrollViewHelper.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/facebook/react/views/scroll/ReactScrollViewHelper$HasStateWrapper;", "", "stateWrapper", "Lcom/facebook/react/uimanager/StateWrapper;", "getStateWrapper", "()Lcom/facebook/react/uimanager/StateWrapper;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface HasStateWrapper {
        StateWrapper getStateWrapper();
    }

    /* compiled from: ReactScrollViewHelper.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/facebook/react/views/scroll/ReactScrollViewHelper$LayoutChangeListener;", "", "onLayoutChange", "", "scrollView", "Landroid/view/ViewGroup;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface LayoutChangeListener {
        void onLayoutChange(ViewGroup scrollView);
    }

    /* compiled from: ReactScrollViewHelper.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH&J\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/views/scroll/ReactScrollViewHelper$ScrollListener;", "", "onScroll", "", "scrollView", "Landroid/view/ViewGroup;", "scrollEventType", "Lcom/facebook/react/views/scroll/ScrollEventType;", "xVelocity", "", "yVelocity", "onLayout", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ScrollListener {
        void onLayout(ViewGroup scrollView);

        void onScroll(ViewGroup scrollView, ScrollEventType scrollEventType, float xVelocity, float yVelocity);
    }

    @JvmStatic
    public static final int resolveAbsoluteDirection(int direction, boolean horizontal, int layoutDirection) {
        boolean z = layoutDirection == 1;
        if (direction != 1 && direction != 2) {
            return direction;
        }
        if (horizontal) {
            return (direction == 2) != z ? 66 : 17;
        }
        return direction == 2 ? 130 : 33;
    }

    private ReactScrollViewHelper() {
    }

    @JvmStatic
    public static final <T extends ViewGroup & HasScrollEventThrottle> void emitScrollEvent(T scrollView, float xVelocity, float yVelocity) {
        INSTANCE.emitScrollEvent(scrollView, ScrollEventType.SCROLL, xVelocity, yVelocity);
    }

    @JvmStatic
    public static final <T extends ViewGroup & HasScrollEventThrottle> void emitScrollBeginDragEvent(T scrollView) {
        INSTANCE.emitScrollEvent(scrollView, ScrollEventType.BEGIN_DRAG);
    }

    @JvmStatic
    public static final <T extends ViewGroup & HasScrollEventThrottle> void emitScrollEndDragEvent(T scrollView, float xVelocity, float yVelocity) {
        INSTANCE.emitScrollEvent(scrollView, ScrollEventType.END_DRAG, xVelocity, yVelocity);
    }

    @JvmStatic
    public static final <T extends ViewGroup & HasScrollEventThrottle> void emitScrollMomentumBeginEvent(T scrollView, int xVelocity, int yVelocity) {
        INSTANCE.emitScrollEvent(scrollView, ScrollEventType.MOMENTUM_BEGIN, xVelocity, yVelocity);
    }

    @JvmStatic
    public static final <T extends ViewGroup & HasScrollEventThrottle> void emitScrollMomentumEndEvent(T scrollView) {
        INSTANCE.emitScrollEvent(scrollView, ScrollEventType.MOMENTUM_END);
    }

    private final <T extends ViewGroup & HasScrollEventThrottle> void emitScrollEvent(T scrollView, ScrollEventType scrollEventType) {
        emitScrollEvent(scrollView, scrollEventType, 0.0f, 0.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T extends ViewGroup & HasScrollEventThrottle> void emitScrollEvent(T scrollView, ScrollEventType scrollEventType, float xVelocity, float yVelocity) {
        long currentTimeMillis = System.currentTimeMillis();
        if (scrollEventType == ScrollEventType.SCROLL) {
            if (r1.getScrollEventThrottle() >= Math.max(17L, currentTimeMillis - scrollView.getLastScrollDispatchTime())) {
                return;
            }
        }
        View childAt = scrollView.getChildAt(0);
        if (childAt == null) {
            return;
        }
        Iterator it = CollectionsKt.toList(scrollListeners).iterator();
        while (it.hasNext()) {
            ScrollListener scrollListener = (ScrollListener) ((WeakReference) it.next()).get();
            if (scrollListener != null) {
                scrollListener.onScroll(scrollView, scrollEventType, xVelocity, yVelocity);
            }
        }
        View view = (View) scrollView;
        Context context = view.getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        int surfaceId = UIManagerHelper.getSurfaceId(reactContext);
        EventDispatcher eventDispatcher = UIManagerHelper.getEventDispatcher(reactContext);
        if (eventDispatcher != null) {
            eventDispatcher.dispatchEvent(ScrollEvent.INSTANCE.obtain(surfaceId, view.getId(), scrollEventType, view.getScrollX(), view.getScrollY(), xVelocity, yVelocity, childAt.getWidth(), childAt.getHeight(), view.getWidth(), view.getHeight()));
            if (scrollEventType == ScrollEventType.SCROLL) {
                scrollView.setLastScrollDispatchTime(currentTimeMillis);
            }
        }
    }

    @JvmStatic
    public static final void notifyUserDrivenScrollEnded_internal(ViewGroup scrollView) {
        ScrollEndedListeners scrollEndedListeners;
        Intrinsics.checkNotNullParameter(scrollView, "scrollView");
        Context context = scrollView.getContext();
        ReactContext reactContext = context instanceof ReactContext ? (ReactContext) context : null;
        if (reactContext == null || (scrollEndedListeners = reactContext.getScrollEndedListeners()) == null) {
            return;
        }
        scrollEndedListeners.notifyScrollEnded(scrollView);
    }

    @JvmStatic
    public static final void emitLayoutEvent(ViewGroup scrollView) {
        Intrinsics.checkNotNullParameter(scrollView, "scrollView");
        Iterator<WeakReference<ScrollListener>> it = scrollListeners.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            ScrollListener scrollListener = it.next().get();
            if (scrollListener != null) {
                scrollListener.onLayout(scrollView);
            }
        }
    }

    @JvmStatic
    public static final void emitLayoutChangeEvent(ViewGroup scrollView) {
        Intrinsics.checkNotNullParameter(scrollView, "scrollView");
        Iterator<WeakReference<LayoutChangeListener>> it = layoutChangeListeners.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            LayoutChangeListener layoutChangeListener = it.next().get();
            if (layoutChangeListener != null) {
                layoutChangeListener.onLayoutChange(scrollView);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0028, code lost:
    
        if (r3.equals("auto") != false) goto L25;
     */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int parseOverScrollMode(String jsOverScrollMode) {
        if (jsOverScrollMode != null) {
            int hashCode = jsOverScrollMode.hashCode();
            if (hashCode != -1414557169) {
                if (hashCode != 3005871) {
                    if (hashCode == 104712844 && jsOverScrollMode.equals("never")) {
                        return 2;
                    }
                }
            } else if (jsOverScrollMode.equals("always")) {
                return 0;
            }
            FLog.w("ReactNative", "wrong overScrollMode: " + jsOverScrollMode);
            return 1;
        }
        return 1;
    }

    @JvmStatic
    public static final int parseSnapToAlignment(String alignment) {
        if (alignment == null) {
            return 0;
        }
        if (StringsKt.equals("start", alignment, true)) {
            return 1;
        }
        if (StringsKt.equals("center", alignment, true)) {
            return 2;
        }
        if (Intrinsics.areEqual("end", alignment)) {
            return 3;
        }
        FLog.w("ReactNative", "wrong snap alignment value: " + alignment);
        return 0;
    }

    @JvmStatic
    public static final int getDefaultScrollAnimationDuration(Context context) {
        if (!smoothScrollDurationInitialized) {
            smoothScrollDurationInitialized = true;
            try {
                SMOOTH_SCROLL_DURATION = new OverScrollerDurationGetter(context).getScrollAnimationDuration();
            } catch (Throwable unused) {
            }
        }
        return SMOOTH_SCROLL_DURATION;
    }

    @JvmStatic
    public static final void addScrollListener(ScrollListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        scrollListeners.add(new WeakReference<>(listener));
    }

    @JvmStatic
    public static final void removeScrollListener(ScrollListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        ArrayList arrayList = new ArrayList();
        Iterator<WeakReference<ScrollListener>> it = scrollListeners.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            WeakReference<ScrollListener> next = it.next();
            ScrollListener scrollListener = next.get();
            if (scrollListener == null || Intrinsics.areEqual(scrollListener, listener)) {
                arrayList.add(next);
            }
        }
        scrollListeners.removeAll(arrayList);
    }

    @JvmStatic
    public static final void addLayoutChangeListener(LayoutChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        layoutChangeListeners.add(new WeakReference<>(listener));
    }

    @JvmStatic
    public static final void removeLayoutChangeListener(LayoutChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        ArrayList arrayList = new ArrayList();
        Iterator<WeakReference<LayoutChangeListener>> it = layoutChangeListeners.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            WeakReference<LayoutChangeListener> next = it.next();
            LayoutChangeListener layoutChangeListener = next.get();
            if (layoutChangeListener == null || Intrinsics.areEqual(layoutChangeListener, listener)) {
                arrayList.add(next);
            }
        }
        layoutChangeListeners.removeAll(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    public static final <T extends ViewGroup & HasFlingAnimator & HasScrollState & HasStateWrapper> void smoothScrollTo(T scrollView, int x, int y) {
        if (DEBUG_MODE) {
            FLog.i(TAG, "smoothScrollTo[%d] x %d y %d", Integer.valueOf(((View) scrollView).getId()), Integer.valueOf(x), Integer.valueOf(y));
        }
        T t = scrollView;
        ValueAnimator flingAnimator = t.getFlingAnimator();
        if (flingAnimator.getListeners() == null || flingAnimator.getListeners().size() == 0) {
            INSTANCE.registerFlingAnimator(scrollView);
        }
        scrollView.getReactScrollViewScrollState().setFinalAnimatedPositionScroll(x, y);
        View view = (View) scrollView;
        int scrollX = view.getScrollX();
        int scrollY = view.getScrollY();
        if (scrollX != x) {
            t.startFlingAnimator(scrollX, x);
        }
        if (scrollY != y) {
            t.startFlingAnimator(scrollY, y);
        }
    }

    @JvmStatic
    public static final <T extends ViewGroup & HasFlingAnimator & HasScrollState> int getNextFlingStartValue(T scrollView, int currentValue, int postAnimationValue, int velocity) {
        ReactScrollViewScrollState reactScrollViewScrollState = scrollView.getReactScrollViewScrollState();
        return (!reactScrollViewScrollState.isFinished() || (reactScrollViewScrollState.isCanceled() && ((velocity != 0 ? velocity / Math.abs(velocity) : 0) * (postAnimationValue - currentValue) > 0))) ? postAnimationValue : currentValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    public static final <T extends ViewGroup & HasFlingAnimator & HasScrollState & HasStateWrapper> void updateFabricScrollState(T scrollView) {
        View view = (View) scrollView;
        INSTANCE.updateFabricScrollState(scrollView, view.getScrollX(), view.getScrollY());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends ViewGroup & HasScrollState & HasStateWrapper> void updateFabricScrollState(T scrollView, int scrollX, int scrollY) {
        if (DEBUG_MODE) {
            FLog.i(TAG, "updateFabricScrollState[%d] scrollX %d scrollY %d", Integer.valueOf(((View) scrollView).getId()), Integer.valueOf(scrollX), Integer.valueOf(scrollY));
        }
        if (ViewUtil.getUIManagerType(((View) scrollView).getId()) == 1 || scrollView.getStateWrapper() == null) {
            return;
        }
        ReactScrollViewScrollState reactScrollViewScrollState = scrollView.getReactScrollViewScrollState();
        reactScrollViewScrollState.setUpdatedByScroll(true);
        if (reactScrollViewScrollState.getLastStateUpdateScroll().equals(scrollX, scrollY)) {
            return;
        }
        reactScrollViewScrollState.setLastStateUpdateScroll(scrollX, scrollY);
        forceUpdateState(scrollView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    public static final <T extends ViewGroup & HasScrollState & HasStateWrapper> void forceUpdateState(T scrollView) {
        ReactScrollViewScrollState reactScrollViewScrollState = scrollView.getReactScrollViewScrollState();
        int scrollAwayPaddingTop = reactScrollViewScrollState.getScrollAwayPaddingTop();
        Point lastStateUpdateScroll = reactScrollViewScrollState.getLastStateUpdateScroll();
        int i = lastStateUpdateScroll.x;
        int i2 = lastStateUpdateScroll.y;
        if (DEBUG_MODE) {
            FLog.i(TAG, "updateFabricScrollState[%d] scrollX %d scrollY %d", Integer.valueOf(((View) scrollView).getId()), Integer.valueOf(i), Integer.valueOf(i2));
        }
        StateWrapper stateWrapper = scrollView.getStateWrapper();
        if (stateWrapper != null) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble(CONTENT_OFFSET_LEFT, PixelUtil.toDIPFromPixel(i));
            writableNativeMap.putDouble(CONTENT_OFFSET_TOP, PixelUtil.toDIPFromPixel(i2));
            writableNativeMap.putDouble(SCROLL_AWAY_PADDING_TOP, PixelUtil.toDIPFromPixel(scrollAwayPaddingTop));
            stateWrapper.updateState(writableNativeMap);
        }
    }

    @JvmStatic
    public static final <T extends ViewGroup & HasScrollState & HasStateWrapper> void loadFabricScrollState$ReactAndroid_release(T scrollView, StateWrapper stateWrapper) {
        ReadableNativeMap stateData;
        Intrinsics.checkNotNullParameter(stateWrapper, "stateWrapper");
        T t = scrollView;
        if (t.getReactScrollViewScrollState().isUpdatedByScroll() || (stateData = stateWrapper.getStateData()) == null) {
            return;
        }
        int pixelFromDIP = (int) PixelUtil.toPixelFromDIP(stateData.getDouble(CONTENT_OFFSET_LEFT));
        int pixelFromDIP2 = (int) PixelUtil.toPixelFromDIP(stateData.getDouble(CONTENT_OFFSET_TOP));
        ReactScrollViewScrollState copy$default = ReactScrollViewScrollState.copy$default(t.getReactScrollViewScrollState(), null, (int) PixelUtil.toPixelFromDIP(stateData.getDouble(SCROLL_AWAY_PADDING_TOP)), null, false, false, 0.0f, false, 125, null);
        copy$default.setLastStateUpdateScroll(pixelFromDIP, pixelFromDIP2);
        t.setReactScrollViewScrollState(copy$default);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    public static final <T extends ViewGroup & HasFlingAnimator & HasScrollEventThrottle & HasScrollState & HasStateWrapper> void updateStateOnScrollChanged(T scrollView, float xVelocity, float yVelocity) {
        View view = (View) scrollView;
        INSTANCE.updateFabricScrollState(scrollView, view.getScrollX(), view.getScrollY());
        emitScrollEvent(scrollView, xVelocity, yVelocity);
    }

    public final <T extends ViewGroup & HasFlingAnimator & HasScrollState & HasStateWrapper> void registerFlingAnimator(final T scrollView) {
        scrollView.getFlingAnimator().addListener(new Animator.AnimatorListener() { // from class: com.facebook.react.views.scroll.ReactScrollViewHelper$registerFlingAnimator$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
                ReactScrollViewHelper.ReactScrollViewScrollState reactScrollViewScrollState = ((ReactScrollViewHelper.HasScrollState) scrollView).getReactScrollViewScrollState();
                reactScrollViewScrollState.setCanceled(false);
                reactScrollViewScrollState.setFinished(false);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
                ((ReactScrollViewHelper.HasScrollState) scrollView).getReactScrollViewScrollState().setFinished(true);
                ReactScrollViewHelper.notifyUserDrivenScrollEnded_internal(scrollView);
                ReactScrollViewHelper.updateFabricScrollState(scrollView);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
                ((ReactScrollViewHelper.HasScrollState) scrollView).getReactScrollViewScrollState().setCanceled(true);
                ReactScrollViewHelper.notifyUserDrivenScrollEnded_internal(scrollView);
            }
        });
    }

    @JvmStatic
    public static final <T extends ViewGroup & HasFlingAnimator & HasScrollEventThrottle> void dispatchMomentumEndOnAnimationEnd(final T scrollView) {
        scrollView.getFlingAnimator().addListener(new Animator.AnimatorListener() { // from class: com.facebook.react.views.scroll.ReactScrollViewHelper$dispatchMomentumEndOnAnimationEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
                ReactScrollViewHelper.emitScrollMomentumEndEvent(scrollView);
                animator.removeListener(this);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
                ReactScrollViewHelper.emitScrollMomentumEndEvent(scrollView);
                animator.removeListener(this);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    public static final <T extends ViewGroup & HasFlingAnimator & HasScrollState> Point predictFinalScrollPosition(T scrollView, int velocityX, int velocityY, int maximumOffsetX, int maximumOffsetY) {
        ReactScrollViewScrollState reactScrollViewScrollState = scrollView.getReactScrollViewScrollState();
        View view = (View) scrollView;
        OverScroller overScroller = new OverScroller(view.getContext());
        overScroller.setFriction(1.0f - reactScrollViewScrollState.getDecelerationRate());
        int width = (view.getWidth() - view.getPaddingStart()) - view.getPaddingEnd();
        int height = (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
        Point finalAnimatedPositionScroll = reactScrollViewScrollState.getFinalAnimatedPositionScroll();
        overScroller.fling(getNextFlingStartValue(scrollView, view.getScrollX(), finalAnimatedPositionScroll.x, velocityX), getNextFlingStartValue(scrollView, view.getScrollY(), finalAnimatedPositionScroll.y, velocityY), velocityX, velocityY, 0, maximumOffsetX, 0, maximumOffsetY, width / 2, height / 2);
        return new Point(overScroller.getFinalX(), overScroller.getFinalY());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    public static final View findNextFocusableView(ViewGroup host, View focused, int direction) {
        FabricUIManager fabricUIManager;
        Integer findNextFocusableElement;
        int intValue;
        int[] relativeAncestorList;
        Set<Integer> mutableSet;
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(focused, "focused");
        if (!(host instanceof ReactClippingViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = host;
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        UIManager uIManager = UIManagerHelper.getUIManager((ReactContext) context, 2);
        if (uIManager == null || (findNextFocusableElement = (fabricUIManager = (FabricUIManager) uIManager).findNextFocusableElement(viewGroup.getId(), focused.getId(), direction)) == null || (relativeAncestorList = fabricUIManager.getRelativeAncestorList(host.getChildAt(0).getId(), (intValue = findNextFocusableElement.intValue()))) == null || (mutableSet = ArraysKt.toMutableSet(relativeAncestorList)) == null) {
            return null;
        }
        mutableSet.add(findNextFocusableElement);
        ((ReactClippingViewGroup) host).updateClippingRect(mutableSet);
        return host.findViewById(intValue);
    }

    /* compiled from: ReactScrollViewHelper.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J0\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/facebook/react/views/scroll/ReactScrollViewHelper$OverScrollerDurationGetter;", "Landroid/widget/OverScroller;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "currentScrollAnimationDuration", "", "scrollAnimationDuration", "getScrollAnimationDuration", "()I", "startScroll", "", "startX", "startY", "dx", "dy", "duration", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class OverScrollerDurationGetter extends OverScroller {
        private int currentScrollAnimationDuration;

        public OverScrollerDurationGetter(Context context) {
            super(context);
            this.currentScrollAnimationDuration = 250;
        }

        public final int getScrollAnimationDuration() {
            super.startScroll(0, 0, 0, 0);
            return this.currentScrollAnimationDuration;
        }

        @Override // android.widget.OverScroller
        public void startScroll(int startX, int startY, int dx, int dy, int duration) {
            this.currentScrollAnimationDuration = duration;
        }
    }

    /* compiled from: ReactScrollViewHelper.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b%\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0005J\u0016\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u0005J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\bHÆ\u0003J\t\u0010)\u001a\u00020\bHÆ\u0003J\t\u0010*\u001a\u00020\u000bHÆ\u0003J\t\u0010+\u001a\u00020\bHÆ\u0003JO\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\bHÆ\u0001J\u0013\u0010-\u001a\u00020\b2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\u0005HÖ\u0001J\t\u00100\u001a\u000201HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\t\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0016\"\u0004\b\u0019\u0010\u0018R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\f\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0016\"\u0004\b\u001e\u0010\u0018¨\u00062"}, d2 = {"Lcom/facebook/react/views/scroll/ReactScrollViewHelper$ReactScrollViewScrollState;", "", "finalAnimatedPositionScroll", "Landroid/graphics/Point;", ReactScrollViewHelper.SCROLL_AWAY_PADDING_TOP, "", "lastStateUpdateScroll", "isCanceled", "", "isFinished", "decelerationRate", "", "isUpdatedByScroll", "<init>", "(Landroid/graphics/Point;ILandroid/graphics/Point;ZZFZ)V", "getFinalAnimatedPositionScroll", "()Landroid/graphics/Point;", "getScrollAwayPaddingTop", "()I", "setScrollAwayPaddingTop", "(I)V", "getLastStateUpdateScroll", "()Z", "setCanceled", "(Z)V", "setFinished", "getDecelerationRate", "()F", "setDecelerationRate", "(F)V", "setUpdatedByScroll", "setFinalAnimatedPositionScroll", "finalAnimatedPositionScrollX", "finalAnimatedPositionScrollY", "setLastStateUpdateScroll", "lastStateUpdateScrollX", "lastStateUpdateScrollY", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ReactScrollViewScrollState {
        private float decelerationRate;
        private final Point finalAnimatedPositionScroll;
        private boolean isCanceled;
        private boolean isFinished;
        private boolean isUpdatedByScroll;
        private final Point lastStateUpdateScroll;
        private int scrollAwayPaddingTop;

        public ReactScrollViewScrollState() {
            this(null, 0, null, false, false, 0.0f, false, 127, null);
        }

        public static /* synthetic */ ReactScrollViewScrollState copy$default(ReactScrollViewScrollState reactScrollViewScrollState, Point point, int i, Point point2, boolean z, boolean z2, float f, boolean z3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                point = reactScrollViewScrollState.finalAnimatedPositionScroll;
            }
            if ((i2 & 2) != 0) {
                i = reactScrollViewScrollState.scrollAwayPaddingTop;
            }
            if ((i2 & 4) != 0) {
                point2 = reactScrollViewScrollState.lastStateUpdateScroll;
            }
            if ((i2 & 8) != 0) {
                z = reactScrollViewScrollState.isCanceled;
            }
            if ((i2 & 16) != 0) {
                z2 = reactScrollViewScrollState.isFinished;
            }
            if ((i2 & 32) != 0) {
                f = reactScrollViewScrollState.decelerationRate;
            }
            if ((i2 & 64) != 0) {
                z3 = reactScrollViewScrollState.isUpdatedByScroll;
            }
            float f2 = f;
            boolean z4 = z3;
            boolean z5 = z2;
            Point point3 = point2;
            return reactScrollViewScrollState.copy(point, i, point3, z, z5, f2, z4);
        }

        /* renamed from: component1, reason: from getter */
        public final Point getFinalAnimatedPositionScroll() {
            return this.finalAnimatedPositionScroll;
        }

        /* renamed from: component2, reason: from getter */
        public final int getScrollAwayPaddingTop() {
            return this.scrollAwayPaddingTop;
        }

        /* renamed from: component3, reason: from getter */
        public final Point getLastStateUpdateScroll() {
            return this.lastStateUpdateScroll;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsCanceled() {
            return this.isCanceled;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsFinished() {
            return this.isFinished;
        }

        /* renamed from: component6, reason: from getter */
        public final float getDecelerationRate() {
            return this.decelerationRate;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getIsUpdatedByScroll() {
            return this.isUpdatedByScroll;
        }

        public final ReactScrollViewScrollState copy(Point finalAnimatedPositionScroll, int scrollAwayPaddingTop, Point lastStateUpdateScroll, boolean isCanceled, boolean isFinished, float decelerationRate, boolean isUpdatedByScroll) {
            Intrinsics.checkNotNullParameter(finalAnimatedPositionScroll, "finalAnimatedPositionScroll");
            Intrinsics.checkNotNullParameter(lastStateUpdateScroll, "lastStateUpdateScroll");
            return new ReactScrollViewScrollState(finalAnimatedPositionScroll, scrollAwayPaddingTop, lastStateUpdateScroll, isCanceled, isFinished, decelerationRate, isUpdatedByScroll);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReactScrollViewScrollState)) {
                return false;
            }
            ReactScrollViewScrollState reactScrollViewScrollState = (ReactScrollViewScrollState) other;
            return Intrinsics.areEqual(this.finalAnimatedPositionScroll, reactScrollViewScrollState.finalAnimatedPositionScroll) && this.scrollAwayPaddingTop == reactScrollViewScrollState.scrollAwayPaddingTop && Intrinsics.areEqual(this.lastStateUpdateScroll, reactScrollViewScrollState.lastStateUpdateScroll) && this.isCanceled == reactScrollViewScrollState.isCanceled && this.isFinished == reactScrollViewScrollState.isFinished && Float.compare(this.decelerationRate, reactScrollViewScrollState.decelerationRate) == 0 && this.isUpdatedByScroll == reactScrollViewScrollState.isUpdatedByScroll;
        }

        public int hashCode() {
            return (((((((((((this.finalAnimatedPositionScroll.hashCode() * 31) + Integer.hashCode(this.scrollAwayPaddingTop)) * 31) + this.lastStateUpdateScroll.hashCode()) * 31) + Boolean.hashCode(this.isCanceled)) * 31) + Boolean.hashCode(this.isFinished)) * 31) + Float.hashCode(this.decelerationRate)) * 31) + Boolean.hashCode(this.isUpdatedByScroll);
        }

        public String toString() {
            return "ReactScrollViewScrollState(finalAnimatedPositionScroll=" + this.finalAnimatedPositionScroll + ", scrollAwayPaddingTop=" + this.scrollAwayPaddingTop + ", lastStateUpdateScroll=" + this.lastStateUpdateScroll + ", isCanceled=" + this.isCanceled + ", isFinished=" + this.isFinished + ", decelerationRate=" + this.decelerationRate + ", isUpdatedByScroll=" + this.isUpdatedByScroll + ")";
        }

        public ReactScrollViewScrollState(Point finalAnimatedPositionScroll, int i, Point lastStateUpdateScroll, boolean z, boolean z2, float f, boolean z3) {
            Intrinsics.checkNotNullParameter(finalAnimatedPositionScroll, "finalAnimatedPositionScroll");
            Intrinsics.checkNotNullParameter(lastStateUpdateScroll, "lastStateUpdateScroll");
            this.finalAnimatedPositionScroll = finalAnimatedPositionScroll;
            this.scrollAwayPaddingTop = i;
            this.lastStateUpdateScroll = lastStateUpdateScroll;
            this.isCanceled = z;
            this.isFinished = z2;
            this.decelerationRate = f;
            this.isUpdatedByScroll = z3;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ ReactScrollViewScrollState(android.graphics.Point r2, int r3, android.graphics.Point r4, boolean r5, boolean r6, float r7, boolean r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
            /*
                r1 = this;
                r10 = r9 & 1
                if (r10 == 0) goto L9
                android.graphics.Point r2 = new android.graphics.Point
                r2.<init>()
            L9:
                r10 = r9 & 2
                r0 = 0
                if (r10 == 0) goto Lf
                r3 = r0
            Lf:
                r10 = r9 & 4
                if (r10 == 0) goto L19
                android.graphics.Point r4 = new android.graphics.Point
                r10 = -1
                r4.<init>(r10, r10)
            L19:
                r10 = r9 & 8
                if (r10 == 0) goto L1e
                r5 = r0
            L1e:
                r10 = r9 & 16
                if (r10 == 0) goto L23
                r6 = 1
            L23:
                r10 = r9 & 32
                if (r10 == 0) goto L2a
                r7 = 1065101558(0x3f7c28f6, float:0.985)
            L2a:
                r9 = r9 & 64
                if (r9 == 0) goto L37
                r10 = r0
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
                goto L3f
            L37:
                r10 = r8
                r9 = r7
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
            L3f:
                r3.<init>(r4, r5, r6, r7, r8, r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.scroll.ReactScrollViewHelper.ReactScrollViewScrollState.<init>(android.graphics.Point, int, android.graphics.Point, boolean, boolean, float, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final Point getFinalAnimatedPositionScroll() {
            return this.finalAnimatedPositionScroll;
        }

        public final int getScrollAwayPaddingTop() {
            return this.scrollAwayPaddingTop;
        }

        public final void setScrollAwayPaddingTop(int i) {
            this.scrollAwayPaddingTop = i;
        }

        public final Point getLastStateUpdateScroll() {
            return this.lastStateUpdateScroll;
        }

        public final boolean isCanceled() {
            return this.isCanceled;
        }

        public final void setCanceled(boolean z) {
            this.isCanceled = z;
        }

        public final boolean isFinished() {
            return this.isFinished;
        }

        public final void setFinished(boolean z) {
            this.isFinished = z;
        }

        public final float getDecelerationRate() {
            return this.decelerationRate;
        }

        public final void setDecelerationRate(float f) {
            this.decelerationRate = f;
        }

        public final boolean isUpdatedByScroll() {
            return this.isUpdatedByScroll;
        }

        public final void setUpdatedByScroll(boolean z) {
            this.isUpdatedByScroll = z;
        }

        public final ReactScrollViewScrollState setFinalAnimatedPositionScroll(int finalAnimatedPositionScrollX, int finalAnimatedPositionScrollY) {
            this.finalAnimatedPositionScroll.set(finalAnimatedPositionScrollX, finalAnimatedPositionScrollY);
            return this;
        }

        public final ReactScrollViewScrollState setLastStateUpdateScroll(int lastStateUpdateScrollX, int lastStateUpdateScrollY) {
            this.lastStateUpdateScroll.set(lastStateUpdateScrollX, lastStateUpdateScrollY);
            return this;
        }
    }
}
