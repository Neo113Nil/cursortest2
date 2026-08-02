package com.facebook.react.views.scroll;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.HorizontalScrollView;
import android.widget.OverScroller;
import androidx.core.view.AbstractC2082d0;
import com.facebook.react.R;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.uimanager.BackgroundStyleApplicator;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.LengthPercentageType;
import com.facebook.react.uimanager.MeasureSpecAssertions;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.ReactClippingViewGroup;
import com.facebook.react.uimanager.ReactClippingViewGroupHelper;
import com.facebook.react.uimanager.ReactOverflowViewWithInset;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.NativeGestureUtil;
import com.facebook.react.uimanager.style.BorderRadiusProp;
import com.facebook.react.uimanager.style.BorderStyle;
import com.facebook.react.uimanager.style.LogicalEdge;
import com.facebook.react.uimanager.style.Overflow;
import com.facebook.react.views.scroll.MaintainVisibleScrollPositionHelper;
import com.facebook.react.views.scroll.ReactScrollViewHelper;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public class ReactHorizontalScrollView extends HorizontalScrollView implements ReactClippingViewGroup, ViewGroup.OnHierarchyChangeListener, View.OnLayoutChangeListener, ReactAccessibleScrollView, ReactOverflowViewWithInset, ReactScrollViewHelper.HasScrollState, ReactScrollViewHelper.HasStateWrapper, ReactScrollViewHelper.HasFlingAnimator, ReactScrollViewHelper.HasScrollEventThrottle, ReactScrollViewHelper.HasSmoothScroll, VirtualViewContainer {
    private static final boolean DEBUG_MODE = false;
    private static final int NO_SCROLL_POSITION = Integer.MIN_VALUE;
    private static final String TAG = "ReactHorizontalScrollView";
    private static final int UNSET_CONTENT_OFFSET = -1;
    private static Field sScrollerField = null;
    private static boolean sTriedToGetScrollerField = false;
    private final ValueAnimator DEFAULT_FLING_ANIMATOR;
    private boolean mActivelyScrolling;
    private Rect mClippingRect;
    private View mContentView;
    private boolean mDisableIntervalMomentum;
    private boolean mDragging;
    private boolean mEmittedOverScrollSinceScrollBegin;
    private Drawable mEndBackground;
    private int mEndFillColor;
    private int mFadingEdgeLengthEnd;
    private int mFadingEdgeLengthStart;
    private FpsListener mFpsListener;
    private long mLastScrollDispatchTime;
    private MaintainVisibleScrollPositionHelper mMaintainVisibleContentPositionHelper;
    private final OnScrollDispatchHelper mOnScrollDispatchHelper;
    private Overflow mOverflow;
    private Rect mOverflowInset;
    private boolean mPagedArrowScrolling;
    private boolean mPagingEnabled;
    private int mPendingContentOffsetX;
    private int mPendingContentOffsetY;
    private PointerEvents mPointerEvents;
    private Runnable mPostTouchRunnable;
    private ReactScrollViewHelper.ReactScrollViewScrollState mReactScrollViewScrollState;
    private boolean mRemoveClippedSubviews;
    private boolean mScrollEnabled;
    private int mScrollEventThrottle;
    private String mScrollPerfTag;
    private int mScrollXAfterMeasure;
    private final OverScroller mScroller;
    private boolean mSendMomentumEvents;
    private int mSnapInterval;
    private List<Integer> mSnapOffsets;
    private int mSnapToAlignment;
    private boolean mSnapToEnd;
    private boolean mSnapToStart;
    private StateWrapper mStateWrapper;
    private final Rect mTempRect;
    private final VelocityHelper mVelocityHelper;
    private VirtualViewContainerState mVirtualViewContainerState;

    /* renamed from: com.facebook.react.views.scroll.ReactHorizontalScrollView$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$react$uimanager$style$Overflow;

        static {
            int[] iArr = new int[Overflow.values().length];
            $SwitchMap$com$facebook$react$uimanager$style$Overflow = iArr;
            try {
                iArr[Overflow.HIDDEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$style$Overflow[Overflow.SCROLL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$style$Overflow[Overflow.VISIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public ReactHorizontalScrollView(Context context) {
        this(context, null);
    }

    private void adjustPositionForContentChangeRTL(int i10, int i11, int i12, int i13) {
        if (getFlingAnimator().isRunning()) {
            getFlingAnimator().end();
        }
        int i14 = i11 - i10;
        int scrollX = i14 - (i13 - getScrollX());
        scrollTo(scrollX, getScrollY());
        recreateFlingAnimation(scrollX, i14 - getWidth());
    }

    private void cancelPostTouchScrolling() {
        Runnable runnable = this.mPostTouchRunnable;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.mPostTouchRunnable = null;
            getFlingAnimator().cancel();
        }
    }

    private void disableFpsListener() {
        if (isScrollPerfLoggingEnabled()) {
            S7.a.c(this.mFpsListener);
            S7.a.c(this.mScrollPerfTag);
            this.mFpsListener.disable(this.mScrollPerfTag);
        }
    }

    private void enableFpsListener() {
        if (isScrollPerfLoggingEnabled()) {
            S7.a.c(this.mFpsListener);
            S7.a.c(this.mScrollPerfTag);
            this.mFpsListener.enable(this.mScrollPerfTag);
        }
    }

    private static HorizontalScrollView findDeepestScrollViewForMotionEvent(View view, MotionEvent motionEvent) {
        return findDeepestScrollViewForMotionEvent(view, motionEvent, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void flingAndSnap(int i10) {
        int i11;
        int min;
        int i12;
        int i13;
        int i14;
        OverScroller overScroller;
        if (DEBUG_MODE) {
            E6.a.t(TAG, "smoothScrollAndSnap[%d] velocityX %d", Integer.valueOf(getId()), Integer.valueOf(i10));
        }
        if (getChildCount() <= 0) {
            return;
        }
        if (this.mSnapInterval == 0 && this.mSnapOffsets == null && this.mSnapToAlignment == 0) {
            smoothScrollAndSnap(i10);
            return;
        }
        boolean z10 = getFlingAnimator() != this.DEFAULT_FLING_ANIMATOR;
        int max = Math.max(0, computeHorizontalScrollRange() - getWidth());
        int predictFinalScrollPosition = predictFinalScrollPosition(i10);
        if (this.mDisableIntervalMomentum) {
            predictFinalScrollPosition = getScrollX();
        }
        int width = (getWidth() - AbstractC2082d0.E(this)) - AbstractC2082d0.D(this);
        if (getLayoutDirection() == 1) {
            predictFinalScrollPosition = max - predictFinalScrollPosition;
            i11 = -i10;
        } else {
            i11 = i10;
        }
        List<Integer> list = this.mSnapOffsets;
        if (list == null || list.isEmpty()) {
            int i15 = this.mSnapToAlignment;
            if (i15 != 0) {
                int i16 = this.mSnapInterval;
                if (i16 > 0) {
                    double d10 = predictFinalScrollPosition / i16;
                    double floor = Math.floor(d10);
                    int i17 = this.mSnapInterval;
                    int max2 = Math.max(getItemStartOffset(i15, (int) (floor * i17), i17, width), 0);
                    int i18 = this.mSnapToAlignment;
                    double ceil = Math.ceil(d10);
                    int i19 = this.mSnapInterval;
                    min = Math.min(getItemStartOffset(i18, (int) (ceil * i19), i19, width), max);
                    i12 = max;
                    i13 = max2;
                    i14 = 0;
                } else {
                    ViewGroup viewGroup = (ViewGroup) getContentView();
                    int i20 = max;
                    int i21 = i20;
                    int i22 = 0;
                    int i23 = 0;
                    for (int i24 = 0; i24 < viewGroup.getChildCount(); i24++) {
                        View childAt = viewGroup.getChildAt(i24);
                        int itemStartOffset = getItemStartOffset(this.mSnapToAlignment, childAt.getLeft(), childAt.getWidth(), width);
                        if (itemStartOffset <= predictFinalScrollPosition && predictFinalScrollPosition - itemStartOffset < predictFinalScrollPosition - i22) {
                            i22 = itemStartOffset;
                        }
                        if (itemStartOffset >= predictFinalScrollPosition && itemStartOffset - predictFinalScrollPosition < i21 - predictFinalScrollPosition) {
                            i21 = itemStartOffset;
                        }
                        i20 = Math.min(i20, itemStartOffset);
                        i23 = Math.max(i23, itemStartOffset);
                    }
                    i13 = Math.max(i22, i20);
                    min = Math.min(i21, i23);
                    i12 = max;
                }
            } else {
                double snapInterval = getSnapInterval();
                double d11 = predictFinalScrollPosition / snapInterval;
                int floor2 = (int) (Math.floor(d11) * snapInterval);
                min = Math.min((int) (Math.ceil(d11) * snapInterval), max);
                i12 = max;
                i13 = floor2;
            }
            i14 = 0;
        } else {
            i14 = this.mSnapOffsets.get(0).intValue();
            List<Integer> list2 = this.mSnapOffsets;
            i12 = list2.get(list2.size() - 1).intValue();
            min = max;
            i13 = 0;
            for (int i25 = 0; i25 < this.mSnapOffsets.size(); i25++) {
                int intValue = this.mSnapOffsets.get(i25).intValue();
                if (intValue <= predictFinalScrollPosition && predictFinalScrollPosition - intValue < predictFinalScrollPosition - i13) {
                    i13 = intValue;
                }
                if (intValue >= predictFinalScrollPosition && intValue - predictFinalScrollPosition < min - predictFinalScrollPosition) {
                    min = intValue;
                }
            }
        }
        int i26 = predictFinalScrollPosition - i13;
        int i27 = min - predictFinalScrollPosition;
        int i28 = Math.abs(i26) < Math.abs(i27) ? i13 : min;
        int scrollX = getScrollX();
        if (getLayoutDirection() == 1) {
            scrollX = max - scrollX;
        }
        if (this.mSnapToEnd || predictFinalScrollPosition < i12) {
            if (this.mSnapToStart || predictFinalScrollPosition > i14) {
                if (i11 > 0) {
                    if (!z10) {
                        i11 += (int) (i27 * 10.0d);
                    }
                    predictFinalScrollPosition = min;
                } else if (i11 < 0) {
                    if (!z10) {
                        i11 -= (int) (i26 * 10.0d);
                    }
                    predictFinalScrollPosition = i13;
                } else {
                    predictFinalScrollPosition = i28;
                }
            } else if (scrollX > i14) {
                predictFinalScrollPosition = i14;
            }
        } else if (scrollX < i12) {
            predictFinalScrollPosition = i12;
        }
        int min2 = Math.min(Math.max(0, predictFinalScrollPosition), max);
        if (getLayoutDirection() == 1) {
            min2 = max - min2;
            i11 = -i11;
        }
        int i29 = min2;
        if (z10 || (overScroller = this.mScroller) == null) {
            reactSmoothScrollTo(i29, getScrollY());
            return;
        }
        this.mActivelyScrolling = true;
        int scrollX2 = getScrollX();
        int scrollY = getScrollY();
        if (i11 == 0) {
            i11 = i29 - getScrollX();
        }
        overScroller.fling(scrollX2, scrollY, i11, 0, i29, i29, 0, 0, (i29 == 0 || i29 == max) ? width / 2 : 0, 0);
        postInvalidateOnAnimation();
    }

    private View getContentView() {
        return getChildAt(0);
    }

    private int getItemStartOffset(int i10, int i11, int i12, int i13) {
        int i14;
        if (i10 == 1) {
            return i11;
        }
        if (i10 == 2) {
            i14 = (i13 - i12) / 2;
        } else {
            if (i10 != 3) {
                throw new IllegalStateException("Invalid SnapToAlignment value: " + this.mSnapToAlignment);
            }
            i14 = i13 - i12;
        }
        return i11 - i14;
    }

    private OverScroller getOverScrollerFromParent() {
        if (!sTriedToGetScrollerField) {
            sTriedToGetScrollerField = true;
            try {
                Field declaredField = HorizontalScrollView.class.getDeclaredField("mScroller");
                sScrollerField = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                E6.a.K(TAG, "Failed to get mScroller field for HorizontalScrollView! This app will exhibit the bounce-back scrolling bug :(");
            }
        }
        Field field = sScrollerField;
        OverScroller overScroller = null;
        if (field != null) {
            try {
                Object obj = field.get(this);
                if (obj instanceof OverScroller) {
                    overScroller = (OverScroller) obj;
                } else {
                    E6.a.K(TAG, "Failed to cast mScroller field in HorizontalScrollView (probably due to OEM changes to AOSP)! This app will exhibit the bounce-back scrolling bug :(");
                }
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Failed to get mScroller from HorizontalScrollView!", e10);
            }
        }
        return overScroller;
    }

    private int getScrollDelta(View view) {
        view.getDrawingRect(this.mTempRect);
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        return computeScrollDeltaToGetChildRectOnScreen(this.mTempRect);
    }

    private int getSnapInterval() {
        int i10 = this.mSnapInterval;
        return i10 != 0 ? i10 : getWidth();
    }

    private void handlePostTouchScrolling(int i10, int i11) {
        if (DEBUG_MODE) {
            E6.a.u(TAG, "handlePostTouchScrolling[%d] velocityX %d velocityY %d", Integer.valueOf(getId()), Integer.valueOf(i10), Integer.valueOf(i11));
        }
        if (this.mPostTouchRunnable != null) {
            return;
        }
        if (this.mSendMomentumEvents) {
            ReactScrollViewHelper.emitScrollMomentumBeginEvent(this, i10, i11);
        }
        this.mActivelyScrolling = false;
        Runnable runnable = new Runnable() { // from class: com.facebook.react.views.scroll.ReactHorizontalScrollView.2
            private boolean mSnappingToPage = false;
            private int mStableFrames = 0;

            @Override // java.lang.Runnable
            public void run() {
                if (ReactHorizontalScrollView.this.mActivelyScrolling) {
                    ReactHorizontalScrollView.this.mActivelyScrolling = false;
                    this.mStableFrames = 0;
                    ReactHorizontalScrollView.this.postOnAnimationDelayed(this, 20L);
                    return;
                }
                ReactScrollViewHelper.updateFabricScrollState(ReactHorizontalScrollView.this);
                int i12 = this.mStableFrames + 1;
                this.mStableFrames = i12;
                if (i12 >= 3) {
                    ReactHorizontalScrollView.this.mPostTouchRunnable = null;
                    if (ReactHorizontalScrollView.this.mSendMomentumEvents) {
                        ReactScrollViewHelper.emitScrollMomentumEndEvent(ReactHorizontalScrollView.this);
                    }
                    ReactScrollViewHelper.notifyUserDrivenScrollEnded_internal(ReactHorizontalScrollView.this);
                    return;
                }
                if (ReactHorizontalScrollView.this.mPagingEnabled && !this.mSnappingToPage) {
                    this.mSnappingToPage = true;
                    ReactHorizontalScrollView.this.flingAndSnap(0);
                }
                ReactHorizontalScrollView.this.postOnAnimationDelayed(this, 20L);
            }
        };
        this.mPostTouchRunnable = runnable;
        postOnAnimationDelayed(runnable, 20L);
    }

    private void initView() {
        this.mOverflowInset = new Rect();
        this.mVirtualViewContainerState = null;
        this.mActivelyScrolling = false;
        this.mClippingRect = null;
        this.mOverflow = ReactNativeFeatureFlags.enablePropsUpdateReconciliationAndroid() ? Overflow.VISIBLE : Overflow.SCROLL;
        this.mDragging = false;
        this.mPagingEnabled = false;
        this.mPostTouchRunnable = null;
        this.mRemoveClippedSubviews = false;
        this.mScrollEnabled = true;
        this.mSendMomentumEvents = false;
        this.mFpsListener = null;
        this.mScrollPerfTag = null;
        this.mEndBackground = null;
        this.mEndFillColor = 0;
        this.mDisableIntervalMomentum = false;
        this.mSnapInterval = 0;
        this.mSnapOffsets = null;
        this.mSnapToStart = true;
        this.mSnapToEnd = true;
        this.mSnapToAlignment = 0;
        this.mPagedArrowScrolling = false;
        this.mPendingContentOffsetX = -1;
        this.mPendingContentOffsetY = -1;
        this.mStateWrapper = null;
        this.mReactScrollViewScrollState = new ReactScrollViewHelper.ReactScrollViewScrollState();
        this.mPointerEvents = PointerEvents.AUTO;
        this.mLastScrollDispatchTime = 0L;
        this.mScrollEventThrottle = 0;
        this.mContentView = null;
        this.mMaintainVisibleContentPositionHelper = null;
        this.mFadingEdgeLengthStart = 0;
        this.mFadingEdgeLengthEnd = 0;
    }

    private boolean isContentReady() {
        View contentView = getContentView();
        return (contentView == null || contentView.getWidth() == 0 || contentView.getHeight() == 0) ? false : true;
    }

    private boolean isDescendantOf(View view, View view2) {
        if (view2 != null && view != null) {
            for (ViewParent parent = view2.getParent(); parent != null && parent.getParent() != null; parent = parent.getParent()) {
                if (parent == view) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isMostlyScrolledInView(View view) {
        int scrollDelta = getScrollDelta(view);
        view.getDrawingRect(this.mTempRect);
        return scrollDelta != 0 && Math.abs(scrollDelta) < this.mTempRect.width() / 2;
    }

    private boolean isScrollPerfLoggingEnabled() {
        String str;
        return (this.mFpsListener == null || (str = this.mScrollPerfTag) == null || str.isEmpty()) ? false : true;
    }

    private boolean isScrolledInView(View view) {
        return getScrollDelta(view) == 0;
    }

    private int predictFinalScrollPosition(int i10) {
        return getFlingAnimator() == this.DEFAULT_FLING_ANIMATOR ? ReactScrollViewHelper.predictFinalScrollPosition(this, i10, 0, Math.max(0, computeHorizontalScrollRange() - getWidth()), 0).x : ReactScrollViewHelper.getNextFlingStartValue(this, getScrollX(), getReactScrollViewScrollState().getFinalAnimatedPositionScroll().x, i10) + getFlingExtrapolatedDistance(i10);
    }

    private void recreateFlingAnimation(int i10, int i11) {
        if (getFlingAnimator().isRunning()) {
            getFlingAnimator().cancel();
        }
        OverScroller overScroller = this.mScroller;
        if (overScroller == null || overScroller.isFinished()) {
            return;
        }
        int currX = this.mScroller.getCurrX();
        boolean computeScrollOffset = this.mScroller.computeScrollOffset();
        this.mScroller.forceFinished(true);
        if (!computeScrollOffset) {
            scrollTo((this.mScroller.getCurrX() - currX) + i10, getScrollY());
            return;
        }
        this.mScroller.fling(i10, getScrollY(), (int) (this.mScroller.getCurrVelocity() * Math.signum(this.mScroller.getFinalX() - this.mScroller.getStartX())), 0, 0, i11, 0, 0);
    }

    private void scrollToChild(View view) {
        int scrollDelta = getScrollDelta(view);
        if (scrollDelta != 0) {
            scrollBy(scrollDelta, 0);
        }
    }

    private void setPendingContentOffsets(int i10, int i11) {
        if (DEBUG_MODE) {
            E6.a.u(TAG, "setPendingContentOffsets[%d] x %d y %d", Integer.valueOf(getId()), Integer.valueOf(i10), Integer.valueOf(i11));
        }
        if (isContentReady()) {
            this.mPendingContentOffsetX = -1;
            this.mPendingContentOffsetY = -1;
        } else {
            this.mPendingContentOffsetX = i10;
            this.mPendingContentOffsetY = i11;
        }
    }

    private void smoothScrollAndSnap(int i10) {
        if (DEBUG_MODE) {
            E6.a.t(TAG, "smoothScrollAndSnap[%d] velocity %d", Integer.valueOf(getId()), Integer.valueOf(i10));
        }
        double snapInterval = getSnapInterval();
        double nextFlingStartValue = ReactScrollViewHelper.getNextFlingStartValue(this, getScrollX(), getReactScrollViewScrollState().getFinalAnimatedPositionScroll().x, i10);
        double predictFinalScrollPosition = predictFinalScrollPosition(i10);
        double d10 = nextFlingStartValue / snapInterval;
        int floor = (int) Math.floor(d10);
        int ceil = (int) Math.ceil(d10);
        int round = (int) Math.round(d10);
        int round2 = (int) Math.round(predictFinalScrollPosition / snapInterval);
        if (i10 > 0 && ceil == floor) {
            ceil++;
        } else if (i10 < 0 && floor == ceil) {
            floor--;
        }
        if (i10 > 0 && round < ceil && round2 > floor) {
            round = ceil;
        } else if (i10 < 0 && round > floor && round2 < ceil) {
            round = floor;
        }
        double d11 = round * snapInterval;
        if (d11 != nextFlingStartValue) {
            this.mActivelyScrolling = true;
            reactSmoothScrollTo((int) d11, getScrollY());
        }
    }

    private void smoothScrollToNextPage(int i10) {
        if (DEBUG_MODE) {
            E6.a.t(TAG, "smoothScrollToNextPage[%d] direction %d", Integer.valueOf(getId()), Integer.valueOf(i10));
        }
        int width = getWidth();
        int scrollX = getScrollX();
        int i11 = scrollX / width;
        if (scrollX % width != 0) {
            i11++;
        }
        int i12 = i10 == 17 ? i11 - 1 : i11 + 1;
        if (i12 < 0) {
            i12 = 0;
        }
        reactSmoothScrollTo(i12 * width, getScrollY());
        handlePostTouchScrolling(0, 0);
    }

    private void updateView() {
    }

    public void abortAnimation() {
        OverScroller overScroller = this.mScroller;
        if (overScroller == null || overScroller.isFinished()) {
            return;
        }
        this.mScroller.abortAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        if (!this.mPagingEnabled || this.mPagedArrowScrolling) {
            super.addFocusables(arrayList, i10, i11);
            return;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        super.addFocusables(arrayList2, i10, i11);
        Iterator<View> it = arrayList2.iterator();
        while (it.hasNext()) {
            View next = it.next();
            if (isScrolledInView(next) || isPartiallyScrolledInView(next) || next.isFocused()) {
                arrayList.add(next);
            }
        }
    }

    @Override // android.widget.HorizontalScrollView
    public boolean arrowScroll(int i10) {
        if (!this.mPagingEnabled) {
            return super.arrowScroll(i10);
        }
        boolean z10 = true;
        this.mPagedArrowScrolling = true;
        if (getChildCount() > 0) {
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus(), i10);
            if (isDescendantOf(getContentView(), findNextFocus)) {
                if (!isScrolledInView(findNextFocus) && !isMostlyScrolledInView(findNextFocus)) {
                    smoothScrollToNextPage(i10);
                }
                findNextFocus.requestFocus();
            } else {
                smoothScrollToNextPage(i10);
            }
        } else {
            z10 = false;
        }
        this.mPagedArrowScrolling = false;
        return z10;
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i10) {
        return this.mScrollEnabled && super.canScrollHorizontally(i10);
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if (!PointerEvents.canChildrenBeTouchTarget(this.mPointerEvents)) {
            return false;
        }
        if (motionEvent.getActionMasked() == 8) {
            final float axisValue = motionEvent.getAxisValue(10);
            if (axisValue != 0.0f) {
                boolean dispatchGenericMotionEvent = super.dispatchGenericMotionEvent(motionEvent);
                if (dispatchGenericMotionEvent && (this.mPagingEnabled || this.mSnapInterval != 0 || this.mSnapOffsets != null || this.mSnapToAlignment != 0)) {
                    Runnable runnable = this.mPostTouchRunnable;
                    if (runnable != null) {
                        removeCallbacks(runnable);
                    }
                    Runnable runnable2 = new Runnable() { // from class: com.facebook.react.views.scroll.ReactHorizontalScrollView.1
                        @Override // java.lang.Runnable
                        public void run() {
                            ReactHorizontalScrollView.this.mPostTouchRunnable = null;
                            int signum = (int) Math.signum(axisValue);
                            if (ReactHorizontalScrollView.this.mDisableIntervalMomentum) {
                                signum = 0;
                            }
                            ReactHorizontalScrollView.this.flingAndSnap(signum);
                        }
                    };
                    this.mPostTouchRunnable = runnable2;
                    postOnAnimationDelayed(runnable2, 20L);
                }
                return dispatchGenericMotionEvent;
            }
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void draw(Canvas canvas) {
        if (this.mEndFillColor != 0) {
            View contentView = getContentView();
            if (this.mEndBackground != null && contentView != null && contentView.getRight() < getWidth()) {
                this.mEndBackground.setBounds(contentView.getRight(), 0, getWidth(), getHeight());
                this.mEndBackground.draw(canvas);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.HorizontalScrollView
    public boolean executeKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (this.mScrollEnabled || !(keyCode == 21 || keyCode == 22)) {
            return super.executeKeyEvent(keyEvent);
        }
        return false;
    }

    public void flashScrollIndicators() {
        awakenScrollBars();
    }

    @Override // android.widget.HorizontalScrollView
    public void fling(int i10) {
        if (DEBUG_MODE) {
            E6.a.t(TAG, "fling[%d] velocityX %d", Integer.valueOf(getId()), Integer.valueOf(i10));
        }
        if (Build.VERSION.SDK_INT == 28) {
            i10 = (int) (Math.abs(i10) * Math.signum(this.mOnScrollDispatchHelper.getXFlingVelocity()));
        }
        int i11 = i10;
        if (this.mPagingEnabled) {
            flingAndSnap(i11);
        } else if (this.mScroller != null) {
            this.mScroller.fling(getScrollX(), getScrollY(), i11, 0, 0, Integer.MAX_VALUE, 0, 0, ((getWidth() - AbstractC2082d0.E(this)) - AbstractC2082d0.D(this)) / 2, 0);
            AbstractC2082d0.c0(this);
        } else {
            super.fling(i11);
        }
        handlePostTouchScrolling(i11, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i10) {
        View focusSearch = super.focusSearch(view, i10);
        if (ReactNativeFeatureFlags.enableCustomFocusSearchOnClippedElementsAndroid()) {
            if (focusSearch != null && findViewById(focusSearch.getId()) != null) {
                return focusSearch;
            }
            View findNextFocusableView = ReactScrollViewHelper.findNextFocusableView(this, view, i10);
            if (findNextFocusableView != null) {
                return findNextFocusableView;
            }
        }
        return focusSearch;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean getChildVisibleRect(View view, Rect rect, Point point) {
        return super.getChildVisibleRect(view, rect, point);
    }

    @Override // com.facebook.react.uimanager.ReactClippingViewGroup
    public void getClippingRect(Rect rect) {
        rect.set((Rect) S7.a.c(this.mClippingRect));
    }

    public int getFadingEdgeLengthEnd() {
        return this.mFadingEdgeLengthEnd;
    }

    public int getFadingEdgeLengthStart() {
        return this.mFadingEdgeLengthStart;
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewHelper.HasFlingAnimator
    public ValueAnimator getFlingAnimator() {
        return this.DEFAULT_FLING_ANIMATOR;
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewHelper.HasFlingAnimator
    public int getFlingExtrapolatedDistance(int i10) {
        return ReactScrollViewHelper.predictFinalScrollPosition(this, i10, 0, Math.max(0, computeHorizontalScrollRange() - getWidth()), 0).x;
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewHelper.HasScrollEventThrottle
    public long getLastScrollDispatchTime() {
        return this.mLastScrollDispatchTime;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public float getLeftFadingEdgeStrength() {
        return (getLayoutDirection() == 1 ? this.mFadingEdgeLengthEnd : this.mFadingEdgeLengthStart) / Math.max(this.mFadingEdgeLengthStart, this.mFadingEdgeLengthEnd);
    }

    @Override // com.facebook.react.uimanager.ReactOverflowView
    public String getOverflow() {
        int i10 = AnonymousClass3.$SwitchMap$com$facebook$react$uimanager$style$Overflow[this.mOverflow.ordinal()];
        if (i10 == 1) {
            return ViewProps.HIDDEN;
        }
        if (i10 == 2) {
            return ViewProps.SCROLL;
        }
        if (i10 != 3) {
            return null;
        }
        return ViewProps.VISIBLE;
    }

    @Override // com.facebook.react.uimanager.ReactOverflowViewWithInset
    public Rect getOverflowInset() {
        return this.mOverflowInset;
    }

    public PointerEvents getPointerEvents() {
        return this.mPointerEvents;
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewHelper.HasScrollState
    public ReactScrollViewHelper.ReactScrollViewScrollState getReactScrollViewScrollState() {
        return this.mReactScrollViewScrollState;
    }

    @Override // com.facebook.react.uimanager.ReactClippingViewGroup
    public boolean getRemoveClippedSubviews() {
        return this.mRemoveClippedSubviews;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public float getRightFadingEdgeStrength() {
        return (getLayoutDirection() == 1 ? this.mFadingEdgeLengthStart : this.mFadingEdgeLengthEnd) / Math.max(this.mFadingEdgeLengthStart, this.mFadingEdgeLengthEnd);
    }

    @Override // com.facebook.react.views.scroll.ReactAccessibleScrollView
    public boolean getScrollEnabled() {
        return this.mScrollEnabled;
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewHelper.HasScrollEventThrottle
    public int getScrollEventThrottle() {
        return this.mScrollEventThrottle;
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewHelper.HasStateWrapper
    public StateWrapper getStateWrapper() {
        return this.mStateWrapper;
    }

    @Override // com.facebook.react.views.scroll.VirtualViewContainer
    public VirtualViewContainerState getVirtualViewContainerState() {
        if (this.mVirtualViewContainerState == null) {
            this.mVirtualViewContainerState = VirtualViewContainerState.create(this);
        }
        return this.mVirtualViewContainerState;
    }

    public void handleInterceptedTouchEvent(MotionEvent motionEvent) {
        if (!ReactNativeFeatureFlags.shouldTriggerResponderTransferOnScrollAndroid()) {
            NativeGestureUtil.notifyNativeGestureStarted(this, motionEvent);
        }
        ReactScrollViewHelper.emitScrollBeginDragEvent(this);
        this.mDragging = true;
        this.mEmittedOverScrollSinceScrollBegin = false;
        enableFpsListener();
        getFlingAnimator().cancel();
    }

    @Override // com.facebook.react.views.scroll.ReactAccessibleScrollView
    public boolean isPartiallyScrolledInView(View view) {
        int scrollDelta = getScrollDelta(view);
        view.getDrawingRect(this.mTempRect);
        return scrollDelta != 0 && Math.abs(scrollDelta) < this.mTempRect.width();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.mRemoveClippedSubviews) {
            updateClippingRect();
        }
        MaintainVisibleScrollPositionHelper maintainVisibleScrollPositionHelper = this.mMaintainVisibleContentPositionHelper;
        if (maintainVisibleScrollPositionHelper != null) {
            maintainVisibleScrollPositionHelper.start();
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewAdded(View view, View view2) {
        this.mContentView = view2;
        view2.addOnLayoutChangeListener(this);
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewRemoved(View view, View view2) {
        View view3 = this.mContentView;
        if (view3 != null) {
            view3.removeOnLayoutChangeListener(this);
        }
        this.mContentView = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        MaintainVisibleScrollPositionHelper maintainVisibleScrollPositionHelper = this.mMaintainVisibleContentPositionHelper;
        if (maintainVisibleScrollPositionHelper != null) {
            maintainVisibleScrollPositionHelper.stop();
        }
        VirtualViewContainerState virtualViewContainerState = this.mVirtualViewContainerState;
        if (virtualViewContainerState != null) {
            virtualViewContainerState.cleanup();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.mOverflow != Overflow.VISIBLE) {
            BackgroundStyleApplicator.clipToPaddingBox(this, canvas);
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String str = (String) getTag(R.id.react_test_id);
        if (str != null) {
            accessibilityNodeInfo.setViewIdResourceName(str);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.mScrollEnabled) {
            return false;
        }
        if (motionEvent.getAction() == 0 && findDeepestScrollViewForMotionEvent(this, motionEvent) != null) {
            return false;
        }
        if (!PointerEvents.canChildrenBeTouchTarget(this.mPointerEvents)) {
            return true;
        }
        try {
            if (super.onInterceptTouchEvent(motionEvent)) {
                handleInterceptedTouchEvent(motionEvent);
                return true;
            }
        } catch (IllegalArgumentException e10) {
            E6.a.L(ReactConstants.TAG, "Error intercepting touch event.", e10);
        }
        return false;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        OverScroller overScroller;
        boolean z11 = DEBUG_MODE;
        if (z11) {
            E6.a.v(TAG, "onLayout[%d] l %d t %d r %d b %d", Integer.valueOf(getId()), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
        }
        int i14 = this.mScrollXAfterMeasure;
        if (i14 != Integer.MIN_VALUE && (overScroller = this.mScroller) != null && i14 != overScroller.getFinalX() && !this.mScroller.isFinished()) {
            if (z11) {
                E6.a.t(TAG, "onLayout[%d] scroll hack enabled: reset to previous scrollX position of %d", Integer.valueOf(getId()), Integer.valueOf(this.mScrollXAfterMeasure));
            }
            OverScroller overScroller2 = this.mScroller;
            overScroller2.startScroll(this.mScrollXAfterMeasure, overScroller2.getFinalY(), 0, 0);
            this.mScroller.forceFinished(true);
            this.mScrollXAfterMeasure = Integer.MIN_VALUE;
        }
        if (isContentReady()) {
            int i15 = this.mPendingContentOffsetX;
            if (i15 == -1) {
                i15 = getScrollX();
            }
            int i16 = this.mPendingContentOffsetY;
            if (i16 == -1) {
                i16 = getScrollY();
            }
            scrollTo(i15, i16);
        }
        ReactScrollViewHelper.emitLayoutEvent(this);
        VirtualViewContainerState virtualViewContainerState = this.mVirtualViewContainerState;
        if (virtualViewContainerState != null) {
            virtualViewContainerState.updateState();
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        if (this.mContentView == null) {
            return;
        }
        if (view.getLayoutDirection() == 1) {
            adjustPositionForContentChangeRTL(i10, i12, i14, i16);
        } else {
            MaintainVisibleScrollPositionHelper maintainVisibleScrollPositionHelper = this.mMaintainVisibleContentPositionHelper;
            if (maintainVisibleScrollPositionHelper != null) {
                maintainVisibleScrollPositionHelper.updateScrollPosition();
            }
        }
        ReactScrollViewHelper.emitLayoutChangeEvent(this);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        OverScroller overScroller;
        MeasureSpecAssertions.assertExplicitMeasureSpec(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (DEBUG_MODE) {
            E6.a.u(TAG, "onMeasure[%d] measured width: %d measured height: %d", Integer.valueOf(getId()), Integer.valueOf(size), Integer.valueOf(size2));
        }
        boolean z10 = getMeasuredHeight() != size2;
        setMeasuredDimension(size, size2);
        if (!z10 || (overScroller = this.mScroller) == null) {
            return;
        }
        this.mScrollXAfterMeasure = overScroller.getCurrX();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void onOverScrolled(int i10, int i11, boolean z10, boolean z11) {
        int max;
        if (DEBUG_MODE) {
            E6.a.v(TAG, "onOverScrolled[%d] scrollX %d scrollY %d clampedX %b clampedY %b", Integer.valueOf(getId()), Integer.valueOf(i10), Integer.valueOf(i11), Boolean.valueOf(z10), Boolean.valueOf(z11));
        }
        OverScroller overScroller = this.mScroller;
        if (overScroller != null && !overScroller.isFinished() && this.mScroller.getCurrX() != this.mScroller.getFinalX() && i10 >= (max = Math.max(computeHorizontalScrollRange() - getWidth(), 0))) {
            this.mScroller.abortAnimation();
            i10 = max;
        }
        if (ReactNativeFeatureFlags.shouldTriggerResponderTransferOnScrollAndroid() && z10 && !this.mEmittedOverScrollSinceScrollBegin) {
            ReactScrollViewHelper.emitScrollEvent(this, 0.0f, 0.0f);
            this.mEmittedOverScrollSinceScrollBegin = true;
        }
        super.onOverScrolled(i10, i11, z10, z11);
    }

    @Override // android.view.View
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        if (DEBUG_MODE) {
            E6.a.v(TAG, "onScrollChanged[%d] x %d y %d oldx %d oldy %d", Integer.valueOf(getId()), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
        }
        A8.a.c(0L, "ReactHorizontalScrollView.onScrollChanged");
        try {
            super.onScrollChanged(i10, i11, i12, i13);
            this.mActivelyScrolling = true;
            if (this.mOnScrollDispatchHelper.onScrollChanged(i10, i11)) {
                if (this.mRemoveClippedSubviews) {
                    updateClippingRect();
                }
                ReactScrollViewHelper.updateStateOnScrollChanged(this, this.mOnScrollDispatchHelper.getXFlingVelocity(), this.mOnScrollDispatchHelper.getYFlingVelocity());
                VirtualViewContainerState virtualViewContainerState = this.mVirtualViewContainerState;
                if (virtualViewContainerState != null) {
                    virtualViewContainerState.updateState();
                }
            }
            A8.a.i(0L);
        } catch (Throwable th2) {
            A8.a.i(0L);
            throw th2;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.mRemoveClippedSubviews) {
            updateClippingRect();
        }
        VirtualViewContainerState virtualViewContainerState = this.mVirtualViewContainerState;
        if (virtualViewContainerState != null) {
            virtualViewContainerState.updateState();
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.mScrollEnabled || !PointerEvents.canBeTouchTarget(this.mPointerEvents)) {
            return false;
        }
        this.mVelocityHelper.calculateVelocity(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 && this.mDragging) {
            ReactScrollViewHelper.updateFabricScrollState(this);
            float xVelocity = this.mVelocityHelper.getXVelocity();
            float yVelocity = this.mVelocityHelper.getYVelocity();
            ReactScrollViewHelper.emitScrollEndDragEvent(this, xVelocity, yVelocity);
            if (!ReactNativeFeatureFlags.shouldTriggerResponderTransferOnScrollAndroid()) {
                NativeGestureUtil.notifyNativeGestureEnded(this, motionEvent);
            }
            this.mDragging = false;
            handlePostTouchScrolling(Math.round(xVelocity), Math.round(yVelocity));
        }
        if (actionMasked == 0) {
            cancelPostTouchScrolling();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.HorizontalScrollView
    public boolean pageScroll(int i10) {
        boolean pageScroll = super.pageScroll(i10);
        if (this.mPagingEnabled && pageScroll) {
            handlePostTouchScrolling(0, 0);
        }
        return pageScroll;
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewHelper.HasSmoothScroll
    public void reactSmoothScrollTo(int i10, int i11) {
        ReactScrollViewHelper.smoothScrollTo(this, i10, i11);
        setPendingContentOffsets(i10, i11);
    }

    public void recycleView() {
        initView();
        if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
        }
        updateView();
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (view2 != null && !this.mPagingEnabled) {
            scrollToChild(view2);
        }
        requestChildFocusWithoutScroll(view, view2);
    }

    public void requestChildFocusWithoutScroll(View view, View view2) {
        super.requestChildFocus(view, view2);
    }

    public void restoreScrollTo(int i10, int i11) {
        scrollTo(i10, i11);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void scrollTo(int i10, int i11) {
        if (DEBUG_MODE) {
            E6.a.u(TAG, "scrollTo[%d] x %d y %d", Integer.valueOf(getId()), Integer.valueOf(i10), Integer.valueOf(i11));
        }
        super.scrollTo(i10, i11);
        ReactScrollViewHelper.updateFabricScrollState(this);
        setPendingContentOffsets(i10, i11);
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewHelper.HasSmoothScroll
    public void scrollToPreservingMomentum(int i10, int i11) {
        scrollTo(i10, i11);
        recreateFlingAnimation(i10, Integer.MAX_VALUE);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        BackgroundStyleApplicator.setBackgroundColor(this, Integer.valueOf(i10));
    }

    public void setBorderColor(int i10, Integer num) {
        BackgroundStyleApplicator.setBorderColor(this, LogicalEdge.values()[i10], num);
    }

    public void setBorderRadius(float f10) {
        setBorderRadius(f10, BorderRadiusProp.BORDER_RADIUS.ordinal());
    }

    public void setBorderStyle(String str) {
        BackgroundStyleApplicator.setBorderStyle(this, str == null ? null : BorderStyle.fromString(str));
    }

    public void setBorderWidth(int i10, float f10) {
        BackgroundStyleApplicator.setBorderWidth(this, LogicalEdge.values()[i10], Float.valueOf(PixelUtil.toDIPFromPixel(f10)));
    }

    public void setDecelerationRate(float f10) {
        getReactScrollViewScrollState().setDecelerationRate(f10);
        OverScroller overScroller = this.mScroller;
        if (overScroller != null) {
            overScroller.setFriction(1.0f - f10);
        }
    }

    public void setDisableIntervalMomentum(boolean z10) {
        this.mDisableIntervalMomentum = z10;
    }

    public void setEndFillColor(int i10) {
        if (i10 != this.mEndFillColor) {
            this.mEndFillColor = i10;
            this.mEndBackground = new ColorDrawable(this.mEndFillColor);
        }
    }

    public void setFadingEdgeLengthEnd(int i10) {
        this.mFadingEdgeLengthEnd = i10;
        invalidate();
    }

    public void setFadingEdgeLengthStart(int i10) {
        this.mFadingEdgeLengthStart = i10;
        invalidate();
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewHelper.HasScrollEventThrottle
    public void setLastScrollDispatchTime(long j10) {
        this.mLastScrollDispatchTime = j10;
    }

    public void setMaintainVisibleContentPosition(MaintainVisibleScrollPositionHelper.Config config) {
        MaintainVisibleScrollPositionHelper maintainVisibleScrollPositionHelper;
        if (config != null && this.mMaintainVisibleContentPositionHelper == null) {
            MaintainVisibleScrollPositionHelper maintainVisibleScrollPositionHelper2 = new MaintainVisibleScrollPositionHelper(this, true);
            this.mMaintainVisibleContentPositionHelper = maintainVisibleScrollPositionHelper2;
            maintainVisibleScrollPositionHelper2.start();
        } else if (config == null && (maintainVisibleScrollPositionHelper = this.mMaintainVisibleContentPositionHelper) != null) {
            maintainVisibleScrollPositionHelper.stop();
            this.mMaintainVisibleContentPositionHelper = null;
        }
        MaintainVisibleScrollPositionHelper maintainVisibleScrollPositionHelper3 = this.mMaintainVisibleContentPositionHelper;
        if (maintainVisibleScrollPositionHelper3 != null) {
            maintainVisibleScrollPositionHelper3.setConfig(config);
        }
    }

    public void setOverflow(String str) {
        if (str == null) {
            this.mOverflow = Overflow.SCROLL;
        } else {
            Overflow fromString = Overflow.fromString(str);
            if (fromString == null) {
                fromString = ReactNativeFeatureFlags.enablePropsUpdateReconciliationAndroid() ? Overflow.VISIBLE : Overflow.SCROLL;
            }
            this.mOverflow = fromString;
        }
        invalidate();
    }

    @Override // com.facebook.react.uimanager.ReactOverflowViewWithInset
    public void setOverflowInset(int i10, int i11, int i12, int i13) {
        this.mOverflowInset.set(i10, i11, i12, i13);
    }

    public void setPagingEnabled(boolean z10) {
        this.mPagingEnabled = z10;
    }

    public void setPointerEvents(PointerEvents pointerEvents) {
        this.mPointerEvents = pointerEvents;
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewHelper.HasScrollState
    public void setReactScrollViewScrollState(ReactScrollViewHelper.ReactScrollViewScrollState reactScrollViewScrollState) {
        this.mReactScrollViewScrollState = reactScrollViewScrollState;
        if (ReactNativeFeatureFlags.enableViewCulling() || ReactNativeFeatureFlags.useTraitHiddenOnAndroid()) {
            Point lastStateUpdateScroll = reactScrollViewScrollState.getLastStateUpdateScroll();
            restoreScrollTo(lastStateUpdateScroll.x, lastStateUpdateScroll.y);
        }
    }

    @Override // com.facebook.react.uimanager.ReactClippingViewGroup
    public void setRemoveClippedSubviews(boolean z10) {
        if (ReactNativeFeatureFlags.disableSubviewClippingAndroid()) {
            return;
        }
        if (z10 && this.mClippingRect == null) {
            this.mClippingRect = new Rect();
        }
        this.mRemoveClippedSubviews = z10;
        updateClippingRect();
    }

    public void setScrollEnabled(boolean z10) {
        this.mScrollEnabled = z10;
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewHelper.HasScrollEventThrottle
    public void setScrollEventThrottle(int i10) {
        this.mScrollEventThrottle = i10;
    }

    public void setScrollPerfTag(String str) {
        this.mScrollPerfTag = str;
    }

    public void setSendMomentumEvents(boolean z10) {
        this.mSendMomentumEvents = z10;
    }

    public void setSnapInterval(int i10) {
        this.mSnapInterval = i10;
    }

    public void setSnapOffsets(List<Integer> list) {
        this.mSnapOffsets = list;
    }

    public void setSnapToAlignment(int i10) {
        this.mSnapToAlignment = i10;
    }

    public void setSnapToEnd(boolean z10) {
        this.mSnapToEnd = z10;
    }

    public void setSnapToStart(boolean z10) {
        this.mSnapToStart = z10;
    }

    public void setStateWrapper(StateWrapper stateWrapper) {
        this.mStateWrapper = stateWrapper;
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewHelper.HasFlingAnimator
    public void startFlingAnimator(int i10, int i11) {
        this.DEFAULT_FLING_ANIMATOR.cancel();
        int defaultScrollAnimationDuration = ReactScrollViewHelper.getDefaultScrollAnimationDuration(getContext());
        this.DEFAULT_FLING_ANIMATOR.setDuration(defaultScrollAnimationDuration).setIntValues(i10, i11);
        this.DEFAULT_FLING_ANIMATOR.start();
        if (this.mSendMomentumEvents) {
            ReactScrollViewHelper.emitScrollMomentumBeginEvent(this, defaultScrollAnimationDuration > 0 ? (i11 - i10) / defaultScrollAnimationDuration : 0, 0);
            ReactScrollViewHelper.dispatchMomentumEndOnAnimationEnd(this);
        }
    }

    @Override // com.facebook.react.uimanager.ReactClippingViewGroup
    public void updateClippingRect() {
        updateClippingRect(null);
    }

    public ReactHorizontalScrollView(Context context, FpsListener fpsListener) {
        super(context);
        this.mScrollXAfterMeasure = Integer.MIN_VALUE;
        this.mOnScrollDispatchHelper = new OnScrollDispatchHelper();
        this.mVelocityHelper = new VelocityHelper();
        this.mTempRect = new Rect();
        this.DEFAULT_FLING_ANIMATOR = ObjectAnimator.ofInt(this, "scrollX", 0, 0);
        this.mOverflowInset = new Rect();
        this.mOverflow = Overflow.SCROLL;
        this.mPagingEnabled = false;
        this.mScrollEnabled = true;
        this.mFpsListener = null;
        this.mEndFillColor = 0;
        this.mDisableIntervalMomentum = false;
        this.mSnapInterval = 0;
        this.mSnapToStart = true;
        this.mSnapToEnd = true;
        this.mSnapToAlignment = 0;
        this.mPagedArrowScrolling = false;
        this.mPendingContentOffsetX = -1;
        this.mPendingContentOffsetY = -1;
        this.mStateWrapper = null;
        this.mPointerEvents = PointerEvents.AUTO;
        this.mLastScrollDispatchTime = 0L;
        this.mScrollEventThrottle = 0;
        this.mFadingEdgeLengthStart = 0;
        this.mFadingEdgeLengthEnd = 0;
        this.mEmittedOverScrollSinceScrollBegin = false;
        this.mFpsListener = fpsListener;
        AbstractC2082d0.l0(this, new ReactScrollViewAccessibilityDelegate());
        this.mScroller = getOverScrollerFromParent();
        setOnHierarchyChangeListener(this);
        setClipChildren(false);
        initView();
    }

    private static HorizontalScrollView findDeepestScrollViewForMotionEvent(View view, MotionEvent motionEvent, boolean z10) {
        if (view == null) {
            return null;
        }
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
            return null;
        }
        if (!z10 && (view instanceof HorizontalScrollView) && AbstractC2082d0.S(view) && (view instanceof ReactHorizontalScrollView) && ((ReactHorizontalScrollView) view).mScrollEnabled) {
            return (HorizontalScrollView) view;
        }
        if (view instanceof ViewGroup) {
            int i10 = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i10 >= viewGroup.getChildCount()) {
                    break;
                }
                HorizontalScrollView findDeepestScrollViewForMotionEvent = findDeepestScrollViewForMotionEvent(viewGroup.getChildAt(i10), motionEvent, false);
                if (findDeepestScrollViewForMotionEvent != null) {
                    return findDeepestScrollViewForMotionEvent;
                }
                i10++;
            }
        }
        return null;
    }

    public void setBorderRadius(float f10, int i10) {
        BackgroundStyleApplicator.setBorderRadius(this, BorderRadiusProp.values()[i10], Float.isNaN(f10) ? null : new LengthPercentage(PixelUtil.toDIPFromPixel(f10), LengthPercentageType.POINT));
    }

    @Override // com.facebook.react.uimanager.ReactClippingViewGroup
    public void updateClippingRect(Set<Integer> set) {
        if (this.mRemoveClippedSubviews) {
            A8.a.c(0L, "ReactHorizontalScrollView.updateClippingRect");
            try {
                S7.a.c(this.mClippingRect);
                ReactClippingViewGroupHelper.calculateClippingRect(this, this.mClippingRect);
                KeyEvent.Callback contentView = getContentView();
                if (contentView instanceof ReactClippingViewGroup) {
                    ((ReactClippingViewGroup) contentView).updateClippingRect(set);
                }
            } finally {
                A8.a.i(0L);
            }
        }
    }
}
