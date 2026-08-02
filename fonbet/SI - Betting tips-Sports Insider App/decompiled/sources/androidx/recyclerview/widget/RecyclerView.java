package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.core.view.ScrollingView;
import androidx.customview.view.AbsSavedState;
import com.google.android.gms.internal.measurement.d5;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import okio.Segment;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements ScrollingView, androidx.core.view.s {
    static final int DEFAULT_ORIENTATION = 1;
    static final boolean DISPATCH_TEMP_DETACH = false;
    private static final float FLING_DESTRETCH_FACTOR = 4.0f;
    static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final float INFLEXION = 0.35f;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    static final String LOW_RES_ROTARY_ENCODER_FEATURE = "android.hardware.rotaryencoder.lowres";
    static final int MAX_SCROLL_DURATION = 2000;
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    private static final float SCROLL_FRICTION = 0.015f;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    static boolean sDebugAssertionsEnabled = false;
    static final a2 sDefaultEdgeEffectFactory;
    static final Interpolator sQuinticInterpolator;
    static boolean sVerboseLoggingEnabled = false;
    f2 mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    x0 mAdapter;
    b mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private b1 mChildDrawingOrderCallback;
    k mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    androidx.core.view.i mDifferentialMotionFlingController;
    private final androidx.core.view.j mDifferentialMotionFlingTarget;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;

    @NonNull
    private c1 mEdgeEffectFactory;
    boolean mEnableFastScroller;
    boolean mFirstLayoutComplete;
    f0 mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private o1 mInterceptingOnItemTouchListener;
    boolean mIsAttached;
    f1 mItemAnimator;
    private d1 mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    final ArrayList<g1> mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastAutoMeasureNonExactMeasuredHeight;
    private int mLastAutoMeasureNonExactMeasuredWidth;
    private boolean mLastAutoMeasureSkippedDueToExact;
    private int mLastTouchX;
    private int mLastTouchY;
    k1 mLayout;
    private int mLayoutOrScrollCounter;
    boolean mLayoutSuppressed;
    boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    boolean mLowResRotaryEncoderFeature;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final u1 mObserver;
    private List<m1> mOnChildAttachStateListeners;
    private n1 mOnFlingListener;
    private final ArrayList<o1> mOnItemTouchListeners;
    final List<d2> mPendingAccessibilityImportanceChange;
    SavedState mPendingSavedState;
    private final float mPhysicalCoef;
    boolean mPostedAnimatorRunner;
    d0 mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final s1 mRecycler;
    t1 mRecyclerListener;
    final List<t1> mRecyclerListeners;
    final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    float mScaledHorizontalScrollFactor;
    float mScaledVerticalScrollFactor;
    private p1 mScrollListener;
    private List<p1> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private androidx.core.view.t mScrollingChildHelper;
    final z1 mState;
    final Rect mTempRect;
    private final Rect mTempRect2;
    final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    final c2 mViewFlinger;
    private final s2 mViewInfoProcessCallback;
    final t2 mViewInfoStore;
    private static final int[] NESTED_SCROLLING_ATTRS = {R.attr.nestedScrollingEnabled};
    private static final float DECELERATION_RATE = (float) (Math.log(0.78d) / Math.log(0.9d));
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST = false;
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = true;
    static final boolean ALLOW_THREAD_GAP_WORK = true;

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new v1();

        /* renamed from: a, reason: collision with root package name */
        public Parcelable f2282a;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2282a = parcel.readParcelable(classLoader == null ? k1.class.getClassLoader() : classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i5) {
            super.writeToParcel(parcel, i5);
            parcel.writeParcelable(this.f2282a, 0);
        }
    }

    static {
        Class<?> cls = Integer.TYPE;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, cls, cls};
        sQuinticInterpolator = new u0();
        sDefaultEdgeEffectFactory = new a2();
    }

    public RecyclerView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.sports.insider.R.attr.recyclerViewStyle);
    }

    public static int b(int i5, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i10) {
        if (i5 > 0 && edgeEffect != null && d5.s(edgeEffect) != DECELERATION_RATE) {
            int round = Math.round(d5.D(edgeEffect, ((-i5) * FLING_DESTRETCH_FACTOR) / i10, 0.5f) * ((-i10) / FLING_DESTRETCH_FACTOR));
            if (round != i5) {
                edgeEffect.finish();
            }
            return i5 - round;
        }
        if (i5 >= 0 || edgeEffect2 == null || d5.s(edgeEffect2) == DECELERATION_RATE) {
            return i5;
        }
        float f6 = i10;
        int round2 = Math.round(d5.D(edgeEffect2, (i5 * FLING_DESTRETCH_FACTOR) / f6, 0.5f) * (f6 / FLING_DESTRETCH_FACTOR));
        if (round2 != i5) {
            edgeEffect2.finish();
        }
        return i5 - round2;
    }

    public static void clearNestedRecyclerViewIfNotNested(@NonNull d2 d2Var) {
        WeakReference<RecyclerView> weakReference = d2Var.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == d2Var.itemView) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            d2Var.mNestedRecyclerView = null;
        }
    }

    public static RecyclerView findNestedRecyclerView(@NonNull View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            RecyclerView findNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i5));
            if (findNestedRecyclerView != null) {
                return findNestedRecyclerView;
            }
        }
        return null;
    }

    public static d2 getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((l1) view.getLayoutParams()).f2468a;
    }

    public static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        l1 l1Var = (l1) view.getLayoutParams();
        Rect rect2 = l1Var.f2469b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) l1Var).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) l1Var).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) l1Var).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) l1Var).bottomMargin);
    }

    private androidx.core.view.t getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new androidx.core.view.t(this);
        }
        return this.mScrollingChildHelper;
    }

    public static void setDebugAssertionsEnabled(boolean z5) {
        sDebugAssertionsEnabled = z5;
    }

    public static void setVerboseLoggingEnabled(boolean z5) {
        sVerboseLoggingEnabled = z5;
    }

    public final void a(d2 d2Var) {
        View view = d2Var.itemView;
        boolean z5 = view.getParent() == this;
        this.mRecycler.n(getChildViewHolder(view));
        if (d2Var.isTmpDetached()) {
            this.mChildHelper.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z5) {
            this.mChildHelper.a(view, -1, true);
            return;
        }
        k kVar = this.mChildHelper;
        int indexOfChild = kVar.f2449a.f2572a.indexOfChild(view);
        if (indexOfChild >= 0) {
            kVar.f2450b.j(indexOfChild);
            kVar.i(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public void absorbGlows(int i5, int i10) {
        if (i5 < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i5);
            }
        } else if (i5 > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i5);
            }
        }
        if (i10 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i10);
            }
        } else if (i10 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i10);
            }
        }
        if (i5 == 0 && i10 == 0) {
            return;
        }
        postInvalidateOnAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i5, int i10) {
        k1 k1Var = this.mLayout;
        if (k1Var == null || !k1Var.onAddFocusables(this, arrayList, i5, i10)) {
            super.addFocusables(arrayList, i5, i10);
        }
    }

    public void addItemDecoration(@NonNull g1 g1Var, int i5) {
        k1 k1Var = this.mLayout;
        if (k1Var != null) {
            k1Var.assertNotInLayoutOrScroll("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i5 < 0) {
            this.mItemDecorations.add(g1Var);
        } else {
            this.mItemDecorations.add(i5, g1Var);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addOnChildAttachStateChangeListener(@NonNull m1 m1Var) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(m1Var);
    }

    public void addOnItemTouchListener(@NonNull o1 o1Var) {
        this.mOnItemTouchListeners.add(o1Var);
    }

    public void addOnScrollListener(@NonNull p1 p1Var) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(p1Var);
    }

    public void addRecyclerListener(@NonNull t1 t1Var) {
        rh.g.c("'listener' arg cannot be null.", t1Var != null);
        this.mRecyclerListeners.add(t1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void animateAppearance(@NonNull d2 d2Var, e1 e1Var, @NonNull e1 e1Var2) {
        boolean z5;
        d2Var.setIsRecyclable(false);
        r rVar = (r) this.mItemAnimator;
        if (e1Var != null) {
            rVar.getClass();
            int i5 = e1Var.f2375a;
            int i10 = e1Var2.f2375a;
            if (i5 != i10 || e1Var.f2376b != e1Var2.f2376b) {
                z5 = rVar.g(d2Var, i5, e1Var.f2376b, i10, e1Var2.f2376b);
                if (z5) {
                    return;
                }
                postAnimationRunner();
                return;
            }
        }
        rVar.l(d2Var);
        d2Var.itemView.setAlpha(DECELERATION_RATE);
        rVar.f2526i.add(d2Var);
        z5 = true;
        if (z5) {
        }
    }

    public void animateDisappearance(@NonNull d2 d2Var, @NonNull e1 e1Var, e1 e1Var2) {
        boolean z5;
        a(d2Var);
        d2Var.setIsRecyclable(false);
        r rVar = (r) this.mItemAnimator;
        rVar.getClass();
        int i5 = e1Var.f2375a;
        int i10 = e1Var.f2376b;
        View view = d2Var.itemView;
        int left = e1Var2 == null ? view.getLeft() : e1Var2.f2375a;
        int top = e1Var2 == null ? view.getTop() : e1Var2.f2376b;
        if (d2Var.isRemoved() || (i5 == left && i10 == top)) {
            rVar.l(d2Var);
            rVar.f2525h.add(d2Var);
            z5 = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            z5 = rVar.g(d2Var, i5, i10, left, top);
        }
        if (z5) {
            postAnimationRunner();
        }
    }

    public void assertInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            return;
        }
        if (str != null) {
            throw new IllegalStateException(androidx.appcompat.widget.c1.k(this, v.f.b(str)));
        }
        throw new IllegalStateException(androidx.appcompat.widget.c1.k(this, new StringBuilder("Cannot call this method unless RecyclerView is computing a layout or scrolling")));
    }

    public void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException(androidx.appcompat.widget.c1.k(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
        }
        if (this.mDispatchScrollCounter > 0) {
            io.sentry.android.core.w0.n(TAG, "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(androidx.appcompat.widget.c1.k(this, new StringBuilder(""))));
        }
    }

    public final void c() {
        r2 r2Var;
        this.mState.a(1);
        fillRemainingScrollValues(this.mState);
        this.mState.f2603i = false;
        startInterceptRequestLayout();
        t2 t2Var = this.mViewInfoStore;
        t2Var.f2559a.clear();
        t2Var.f2560b.b();
        onEnterLayoutOrScroll();
        j();
        View focusedChild = (this.mPreserveFocusAfterLayout && hasFocus() && this.mAdapter != null) ? getFocusedChild() : null;
        d2 findContainingViewHolder = focusedChild != null ? findContainingViewHolder(focusedChild) : null;
        if (findContainingViewHolder == null) {
            z1 z1Var = this.mState;
            z1Var.f2606m = -1L;
            z1Var.f2605l = -1;
            z1Var.f2607n = -1;
        } else {
            this.mState.f2606m = this.mAdapter.hasStableIds() ? findContainingViewHolder.getItemId() : -1L;
            this.mState.f2605l = this.mDataSetHasChangedAfterLayout ? -1 : findContainingViewHolder.isRemoved() ? findContainingViewHolder.mOldPosition : findContainingViewHolder.getAbsoluteAdapterPosition();
            z1 z1Var2 = this.mState;
            View view = findContainingViewHolder.itemView;
            int id2 = view.getId();
            while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                    id2 = view.getId();
                }
            }
            z1Var2.f2607n = id2;
        }
        z1 z1Var3 = this.mState;
        z1Var3.f2602h = z1Var3.j && this.mItemsChanged;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        z1Var3.f2601g = z1Var3.f2604k;
        z1Var3.f2599e = this.mAdapter.getItemCount();
        f(this.mMinMaxLayoutPositions);
        if (this.mState.j) {
            int e7 = this.mChildHelper.e();
            for (int i5 = 0; i5 < e7; i5++) {
                d2 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i5));
                if (!childViewHolderInt.shouldIgnore() && (!childViewHolderInt.isInvalid() || this.mAdapter.hasStableIds())) {
                    f1 f1Var = this.mItemAnimator;
                    f1.b(childViewHolderInt);
                    childViewHolderInt.getUnmodifiedPayloads();
                    f1Var.getClass();
                    e1 e1Var = new e1();
                    e1Var.a(childViewHolderInt);
                    s.n nVar = this.mViewInfoStore.f2559a;
                    r2 r2Var2 = (r2) nVar.get(childViewHolderInt);
                    if (r2Var2 == null) {
                        r2Var2 = r2.a();
                        nVar.put(childViewHolderInt, r2Var2);
                    }
                    r2Var2.f2541b = e1Var;
                    r2Var2.f2540a |= 4;
                    if (this.mState.f2602h && childViewHolderInt.isUpdated() && !childViewHolderInt.isRemoved() && !childViewHolderInt.shouldIgnore() && !childViewHolderInt.isInvalid()) {
                        this.mViewInfoStore.f2560b.h(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.f2604k) {
            saveOldPositions();
            z1 z1Var4 = this.mState;
            boolean z5 = z1Var4.f2600f;
            z1Var4.f2600f = false;
            this.mLayout.onLayoutChildren(this.mRecycler, z1Var4);
            this.mState.f2600f = z5;
            for (int i10 = 0; i10 < this.mChildHelper.e(); i10++) {
                d2 childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.d(i10));
                if (!childViewHolderInt2.shouldIgnore() && ((r2Var = (r2) this.mViewInfoStore.f2559a.get(childViewHolderInt2)) == null || (r2Var.f2540a & 4) == 0)) {
                    f1.b(childViewHolderInt2);
                    boolean hasAnyOfTheFlags = childViewHolderInt2.hasAnyOfTheFlags(Segment.SIZE);
                    f1 f1Var2 = this.mItemAnimator;
                    childViewHolderInt2.getUnmodifiedPayloads();
                    f1Var2.getClass();
                    e1 e1Var2 = new e1();
                    e1Var2.a(childViewHolderInt2);
                    if (hasAnyOfTheFlags) {
                        recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, e1Var2);
                    } else {
                        s.n nVar2 = this.mViewInfoStore.f2559a;
                        r2 r2Var3 = (r2) nVar2.get(childViewHolderInt2);
                        if (r2Var3 == null) {
                            r2Var3 = r2.a();
                            nVar2.put(childViewHolderInt2, r2Var3);
                        }
                        r2Var3.f2540a |= 2;
                        r2Var3.f2541b = e1Var2;
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.f2598d = 2;
    }

    public boolean canReuseUpdatedViewHolder(d2 d2Var) {
        f1 f1Var = this.mItemAnimator;
        if (f1Var != null) {
            return (d2Var.getUnmodifiedPayloads().isEmpty() && ((r) f1Var).f2524g && !d2Var.isInvalid()) ? false : true;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof l1) && this.mLayout.checkLayoutParams((l1) layoutParams);
    }

    public void clearOldPositions() {
        int h10 = this.mChildHelper.h();
        for (int i5 = 0; i5 < h10; i5++) {
            d2 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i5));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.clearOldPosition();
            }
        }
        s1 s1Var = this.mRecycler;
        ArrayList arrayList = s1Var.f2546a;
        ArrayList arrayList2 = s1Var.f2548c;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((d2) arrayList2.get(i10)).clearOldPosition();
        }
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((d2) arrayList.get(i11)).clearOldPosition();
        }
        ArrayList arrayList3 = s1Var.f2547b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i12 = 0; i12 < size3; i12++) {
                ((d2) s1Var.f2547b.get(i12)).clearOldPosition();
            }
        }
    }

    public void clearOnChildAttachStateChangeListeners() {
        List<m1> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void clearOnScrollListeners() {
        List<p1> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollExtent() {
        k1 k1Var = this.mLayout;
        if (k1Var != null && k1Var.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollOffset() {
        k1 k1Var = this.mLayout;
        if (k1Var != null && k1Var.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollRange() {
        k1 k1Var = this.mLayout;
        if (k1Var != null && k1Var.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollRange(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollExtent() {
        k1 k1Var = this.mLayout;
        if (k1Var != null && k1Var.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollOffset() {
        k1 k1Var = this.mLayout;
        if (k1Var != null && k1Var.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollRange() {
        k1 k1Var = this.mLayout;
        if (k1Var != null && k1Var.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollRange(this.mState);
        }
        return 0;
    }

    public void considerReleasingGlowsOnScroll(int i5, int i10) {
        boolean z5;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished() || i5 <= 0) {
            z5 = false;
        } else {
            this.mLeftGlow.onRelease();
            z5 = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i5 < 0) {
            this.mRightGlow.onRelease();
            z5 |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i10 > 0) {
            this.mTopGlow.onRelease();
            z5 |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i10 < 0) {
            this.mBottomGlow.onRelease();
            z5 |= this.mBottomGlow.isFinished();
        }
        if (z5) {
            postInvalidateOnAnimation();
        }
    }

    public int consumeFlingInHorizontalStretch(int i5) {
        return b(i5, this.mLeftGlow, this.mRightGlow, getWidth());
    }

    public int consumeFlingInVerticalStretch(int i5) {
        return b(i5, this.mTopGlow, this.mBottomGlow, getHeight());
    }

    public void consumePendingUpdateOperations() {
        if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout) {
            Trace.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
            dispatchLayout();
            Trace.endSection();
            return;
        }
        if (this.mAdapterHelper.g()) {
            b bVar = this.mAdapterHelper;
            int i5 = bVar.f2328f;
            if ((i5 & 4) == 0 || (i5 & 11) != 0) {
                if (bVar.g()) {
                    Trace.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                    dispatchLayout();
                    Trace.endSection();
                    return;
                }
                return;
            }
            Trace.beginSection(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            this.mAdapterHelper.j();
            if (!this.mLayoutWasDefered) {
                int e7 = this.mChildHelper.e();
                int i10 = 0;
                while (true) {
                    if (i10 < e7) {
                        d2 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i10));
                        if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.isUpdated()) {
                            dispatchLayout();
                            break;
                        }
                        i10++;
                    } else {
                        this.mAdapterHelper.b();
                        break;
                    }
                }
            }
            stopInterceptRequestLayout(true);
            onExitLayoutOrScroll();
            Trace.endSection();
        }
    }

    public final void d() {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.a(6);
        this.mAdapterHelper.c();
        this.mState.f2599e = this.mAdapter.getItemCount();
        this.mState.f2597c = 0;
        if (this.mPendingSavedState != null && this.mAdapter.canRestoreState()) {
            Parcelable parcelable = this.mPendingSavedState.f2282a;
            if (parcelable != null) {
                this.mLayout.onRestoreInstanceState(parcelable);
            }
            this.mPendingSavedState = null;
        }
        z1 z1Var = this.mState;
        z1Var.f2601g = false;
        this.mLayout.onLayoutChildren(this.mRecycler, z1Var);
        z1 z1Var2 = this.mState;
        z1Var2.f2600f = false;
        z1Var2.j = z1Var2.j && this.mItemAnimator != null;
        z1Var2.f2598d = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    public void defaultOnMeasure(int i5, int i10) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = androidx.core.view.z0.f1413a;
        setMeasuredDimension(k1.chooseSize(i5, paddingRight, getMinimumWidth()), k1.chooseSize(i10, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public void dispatchChildAttached(View view) {
        d2 childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        x0 x0Var = this.mAdapter;
        if (x0Var != null && childViewHolderInt != null) {
            x0Var.onViewAttachedToWindow(childViewHolderInt);
        }
        List<m1> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((androidx.viewpager2.widget.g) this.mOnChildAttachStateListeners.get(size)).getClass();
                l1 l1Var = (l1) view.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) l1Var).width != -1 || ((ViewGroup.MarginLayoutParams) l1Var).height != -1) {
                    throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
                }
            }
        }
    }

    public void dispatchChildDetached(View view) {
        d2 childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        x0 x0Var = this.mAdapter;
        if (x0Var != null && childViewHolderInt != null) {
            x0Var.onViewDetachedFromWindow(childViewHolderInt);
        }
        List<m1> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).getClass();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        k1 layoutManager = getLayoutManager();
        int i5 = 0;
        if (layoutManager != null) {
            if (layoutManager.canScrollVertically()) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 92 || keyCode == 93) {
                    int measuredHeight = getMeasuredHeight();
                    if (keyCode == 93) {
                        smoothScrollBy(0, measuredHeight, null, Integer.MIN_VALUE);
                        return true;
                    }
                    smoothScrollBy(0, -measuredHeight, null, Integer.MIN_VALUE);
                    return true;
                }
                if (keyCode == 122 || keyCode == 123) {
                    boolean isLayoutReversed = layoutManager.isLayoutReversed();
                    if (keyCode == 122) {
                        if (isLayoutReversed) {
                            i5 = getAdapter().getItemCount();
                        }
                    } else if (!isLayoutReversed) {
                        i5 = getAdapter().getItemCount();
                    }
                    smoothScrollToPosition(i5);
                    return true;
                }
            } else if (layoutManager.canScrollHorizontally()) {
                int keyCode2 = keyEvent.getKeyCode();
                if (keyCode2 == 92 || keyCode2 == 93) {
                    int measuredWidth = getMeasuredWidth();
                    if (keyCode2 == 93) {
                        smoothScrollBy(measuredWidth, 0, null, Integer.MIN_VALUE);
                        return true;
                    }
                    smoothScrollBy(-measuredWidth, 0, null, Integer.MIN_VALUE);
                    return true;
                }
                if (keyCode2 == 122 || keyCode2 == 123) {
                    boolean isLayoutReversed2 = layoutManager.isLayoutReversed();
                    if (keyCode2 == 122) {
                        if (isLayoutReversed2) {
                            i5 = getAdapter().getItemCount();
                        }
                    } else if (!isLayoutReversed2) {
                        i5 = getAdapter().getItemCount();
                    }
                    smoothScrollToPosition(i5);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:159:0x0374, code lost:
    
        if (r17.mChildHelper.f2451c.contains(getFocusedChild()) == false) goto L208;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02bf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03f6  */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v58 */
    /* JADX WARN: Type inference failed for: r1v73 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void dispatchLayout() {
        View findViewById;
        boolean z5;
        boolean g10;
        if (this.mAdapter == null) {
            io.sentry.android.core.w0.m(TAG, "No adapter attached; skipping layout");
            return;
        }
        if (this.mLayout == null) {
            io.sentry.android.core.w0.d(TAG, "No layout manager attached; skipping layout");
            return;
        }
        this.mState.f2603i = false;
        boolean z7 = true;
        ?? r12 = this.mLastAutoMeasureSkippedDueToExact && !(this.mLastAutoMeasureNonExactMeasuredWidth == getWidth() && this.mLastAutoMeasureNonExactMeasuredHeight == getHeight());
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mLastAutoMeasureSkippedDueToExact = false;
        if (this.mState.f2598d == 1) {
            c();
            this.mLayout.setExactMeasureSpecsFrom(this);
            d();
        } else {
            b bVar = this.mAdapterHelper;
            if ((bVar.f2325c.isEmpty() || bVar.f2324b.isEmpty()) && !r12 == true && this.mLayout.getWidth() == getWidth() && this.mLayout.getHeight() == getHeight()) {
                this.mLayout.setExactMeasureSpecsFrom(this);
            } else {
                this.mLayout.setExactMeasureSpecsFrom(this);
                d();
            }
        }
        this.mState.a(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        z1 z1Var = this.mState;
        z1Var.f2598d = 1;
        View view = null;
        if (z1Var.j) {
            for (int e7 = this.mChildHelper.e() - 1; e7 >= 0; e7--) {
                d2 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(e7));
                if (!childViewHolderInt.shouldIgnore()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    this.mItemAnimator.getClass();
                    e1 e1Var = new e1();
                    e1Var.a(childViewHolderInt);
                    d2 d2Var = (d2) this.mViewInfoStore.f2560b.e(changedHolderKey);
                    if (d2Var == null || d2Var.shouldIgnore()) {
                        this.mViewInfoStore.a(childViewHolderInt, e1Var);
                    } else {
                        r2 r2Var = (r2) this.mViewInfoStore.f2559a.get(d2Var);
                        ?? r122 = (r2Var == null || (r2Var.f2540a & 1) == 0) ? false : true;
                        r2 r2Var2 = (r2) this.mViewInfoStore.f2559a.get(childViewHolderInt);
                        ?? r13 = (r2Var2 == null || (r2Var2.f2540a & 1) == 0) ? false : true;
                        if (r122 == true && d2Var == childViewHolderInt) {
                            this.mViewInfoStore.a(childViewHolderInt, e1Var);
                        } else {
                            e1 b10 = this.mViewInfoStore.b(d2Var, 4);
                            this.mViewInfoStore.a(childViewHolderInt, e1Var);
                            e1 b11 = this.mViewInfoStore.b(childViewHolderInt, 8);
                            if (b10 == null) {
                                int e9 = this.mChildHelper.e();
                                for (int i5 = 0; i5 < e9; i5++) {
                                    d2 childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.d(i5));
                                    if (childViewHolderInt2 != childViewHolderInt && getChangedHolderKey(childViewHolderInt2) == changedHolderKey) {
                                        x0 x0Var = this.mAdapter;
                                        if (x0Var == null || !x0Var.hasStableIds()) {
                                            StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                                            sb2.append(childViewHolderInt2);
                                            sb2.append(" \n View Holder 2:");
                                            sb2.append(childViewHolderInt);
                                            throw new IllegalStateException(androidx.appcompat.widget.c1.k(this, sb2));
                                        }
                                        StringBuilder sb3 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                                        sb3.append(childViewHolderInt2);
                                        sb3.append(" \n View Holder 2:");
                                        sb3.append(childViewHolderInt);
                                        throw new IllegalStateException(androidx.appcompat.widget.c1.k(this, sb3));
                                    }
                                }
                                io.sentry.android.core.w0.d(TAG, "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + d2Var + " cannot be found but it is necessary for " + childViewHolderInt + exceptionLabel());
                            } else {
                                d2Var.setIsRecyclable(false);
                                if (r122 != false) {
                                    a(d2Var);
                                }
                                if (d2Var != childViewHolderInt) {
                                    if (r13 != false) {
                                        a(childViewHolderInt);
                                    }
                                    d2Var.mShadowedHolder = childViewHolderInt;
                                    a(d2Var);
                                    this.mRecycler.n(d2Var);
                                    childViewHolderInt.setIsRecyclable(false);
                                    childViewHolderInt.mShadowingHolder = d2Var;
                                }
                                if (this.mItemAnimator.a(d2Var, childViewHolderInt, b10, b11)) {
                                    postAnimationRunner();
                                }
                            }
                        }
                    }
                }
            }
            t2 t2Var = this.mViewInfoStore;
            s2 s2Var = this.mViewInfoProcessCallback;
            s.n nVar = t2Var.f2559a;
            int i10 = nVar.f22575c - 1;
            while (i10 >= 0) {
                d2 d2Var2 = (d2) nVar.g(i10);
                r2 r2Var3 = (r2) nVar.h(i10);
                int i11 = r2Var3.f2540a;
                if ((i11 & 3) == 3) {
                    RecyclerView recyclerView = ((v0) s2Var).f2572a;
                    recyclerView.mLayout.removeAndRecycleView(d2Var2.itemView, recyclerView.mRecycler);
                } else if ((i11 & 1) != 0) {
                    e1 e1Var2 = r2Var3.f2541b;
                    if (e1Var2 == null) {
                        RecyclerView recyclerView2 = ((v0) s2Var).f2572a;
                        recyclerView2.mLayout.removeAndRecycleView(d2Var2.itemView, recyclerView2.mRecycler);
                    } else {
                        e1 e1Var3 = r2Var3.f2542c;
                        RecyclerView recyclerView3 = ((v0) s2Var).f2572a;
                        recyclerView3.mRecycler.n(d2Var2);
                        recyclerView3.animateDisappearance(d2Var2, e1Var2, e1Var3);
                    }
                } else if ((i11 & 14) == 14) {
                    ((v0) s2Var).f2572a.animateAppearance(d2Var2, r2Var3.f2541b, r2Var3.f2542c);
                } else {
                    if ((i11 & 12) == 12) {
                        e1 e1Var4 = r2Var3.f2541b;
                        e1 e1Var5 = r2Var3.f2542c;
                        v0 v0Var = (v0) s2Var;
                        v0Var.getClass();
                        d2Var2.setIsRecyclable(false);
                        RecyclerView recyclerView4 = v0Var.f2572a;
                        if (!recyclerView4.mDataSetHasChangedAfterLayout) {
                            r rVar = (r) recyclerView4.mItemAnimator;
                            rVar.getClass();
                            int i12 = e1Var4.f2375a;
                            int i13 = e1Var5.f2375a;
                            if (i12 == i13) {
                                z5 = z7;
                                if (e1Var4.f2376b == e1Var5.f2376b) {
                                    rVar.c(d2Var2);
                                    g10 = false;
                                    if (!g10) {
                                        recyclerView4.postAnimationRunner();
                                    }
                                }
                            } else {
                                z5 = z7;
                            }
                            g10 = rVar.g(d2Var2, i12, e1Var4.f2376b, i13, e1Var5.f2376b);
                            if (!g10) {
                            }
                        } else if (recyclerView4.mItemAnimator.a(d2Var2, d2Var2, e1Var4, e1Var5)) {
                            recyclerView4.postAnimationRunner();
                        }
                    } else {
                        z5 = z7;
                        if ((i11 & 4) != 0) {
                            e1 e1Var6 = r2Var3.f2541b;
                            RecyclerView recyclerView5 = ((v0) s2Var).f2572a;
                            recyclerView5.mRecycler.n(d2Var2);
                            recyclerView5.animateDisappearance(d2Var2, e1Var6, null);
                        } else if ((i11 & 8) != 0) {
                            ((v0) s2Var).f2572a.animateAppearance(d2Var2, r2Var3.f2541b, r2Var3.f2542c);
                        }
                    }
                    r2Var3.f2540a = 0;
                    r2Var3.f2541b = null;
                    r2Var3.f2542c = null;
                    r2.f2539d.a(r2Var3);
                    i10--;
                    z7 = z5;
                }
                z5 = z7;
                r2Var3.f2540a = 0;
                r2Var3.f2541b = null;
                r2Var3.f2542c = null;
                r2.f2539d.a(r2Var3);
                i10--;
                z7 = z5;
            }
        }
        boolean z10 = z7;
        this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        z1 z1Var2 = this.mState;
        z1Var2.f2596b = z1Var2.f2599e;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        z1Var2.j = false;
        z1Var2.f2604k = false;
        this.mLayout.mRequestedSimpleAnimations = false;
        ArrayList arrayList = this.mRecycler.f2547b;
        if (arrayList != null) {
            arrayList.clear();
        }
        k1 k1Var = this.mLayout;
        if (k1Var.mPrefetchMaxObservedInInitialPrefetch) {
            k1Var.mPrefetchMaxCountObserved = 0;
            k1Var.mPrefetchMaxObservedInInitialPrefetch = false;
            this.mRecycler.o();
        }
        this.mLayout.onLayoutCompleted(this.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        t2 t2Var2 = this.mViewInfoStore;
        t2Var2.f2559a.clear();
        t2Var2.f2560b.b();
        int[] iArr = this.mMinMaxLayoutPositions;
        int i14 = iArr[0];
        int i15 = iArr[z10 ? 1 : 0];
        f(iArr);
        int[] iArr2 = this.mMinMaxLayoutPositions;
        if (((iArr2[0] == i14 && iArr2[z10 ? 1 : 0] == i15) ? false : z10 ? 1 : 0) != false) {
            dispatchOnScrolled(0, 0);
        }
        if (this.mPreserveFocusAfterLayout && this.mAdapter != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (!isFocused()) {
            }
            d2 findViewHolderForItemId = (this.mState.f2606m == -1 || !this.mAdapter.hasStableIds()) ? null : findViewHolderForItemId(this.mState.f2606m);
            if (findViewHolderForItemId != null) {
                if (!this.mChildHelper.f2451c.contains(findViewHolderForItemId.itemView) && findViewHolderForItemId.itemView.hasFocusable()) {
                    view = findViewHolderForItemId.itemView;
                    if (view != null) {
                        int i16 = this.mState.f2607n;
                        if (i16 != -1 && (findViewById = view.findViewById(i16)) != null && findViewById.isFocusable()) {
                            view = findViewById;
                        }
                        view.requestFocus();
                    }
                }
            }
            if (this.mChildHelper.e() > 0) {
                z1 z1Var3 = this.mState;
                int i17 = z1Var3.f2605l;
                int i18 = i17 != -1 ? i17 : 0;
                int b12 = z1Var3.b();
                for (int i19 = i18; i19 < b12; i19++) {
                    d2 findViewHolderForAdapterPosition = findViewHolderForAdapterPosition(i19);
                    if (findViewHolderForAdapterPosition == null) {
                        break;
                    }
                    if (findViewHolderForAdapterPosition.itemView.hasFocusable()) {
                        view = findViewHolderForAdapterPosition.itemView;
                        break;
                    }
                }
                int min = Math.min(b12, i18) - 1;
                while (true) {
                    if (min < 0) {
                        break;
                    }
                    d2 findViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(min);
                    if (findViewHolderForAdapterPosition2 == null) {
                        break;
                    }
                    if (findViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                        view = findViewHolderForAdapterPosition2.itemView;
                        break;
                    }
                    min--;
                }
            }
            if (view != null) {
            }
        }
        z1 z1Var4 = this.mState;
        z1Var4.f2606m = -1L;
        z1Var4.f2605l = -1;
        z1Var4.f2607n = -1;
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f6, float f10, boolean z5) {
        return getScrollingChildHelper().a(f6, f10, z5);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f6, float f10) {
        return getScrollingChildHelper().b(f6, f10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i5, int i10, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i5, i10, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i5, int i10, int i11, int i12, int[] iArr) {
        return getScrollingChildHelper().d(i5, i10, i11, i12, iArr, 0, null);
    }

    public void dispatchOnScrollStateChanged(int i5) {
        k1 k1Var = this.mLayout;
        if (k1Var != null) {
            k1Var.onScrollStateChanged(i5);
        }
        onScrollStateChanged(i5);
        p1 p1Var = this.mScrollListener;
        if (p1Var != null) {
            p1Var.onScrollStateChanged(this, i5);
        }
        List<p1> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrollStateChanged(this, i5);
            }
        }
    }

    public void dispatchOnScrolled(int i5, int i10) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i5, scrollY - i10);
        onScrolled(i5, i10);
        p1 p1Var = this.mScrollListener;
        if (p1Var != null) {
            p1Var.onScrolled(this, i5, i10);
        }
        List<p1> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrolled(this, i5, i10);
            }
        }
        this.mDispatchScrollCounter--;
    }

    public void dispatchPendingImportantForAccessibilityChanges() {
        int i5;
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            d2 d2Var = this.mPendingAccessibilityImportanceChange.get(size);
            if (d2Var.itemView.getParent() == this && !d2Var.shouldIgnore() && (i5 = d2Var.mPendingAccessibilityState) != -1) {
                d2Var.itemView.setImportantForAccessibility(i5);
                d2Var.mPendingAccessibilityState = -1;
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        boolean z5;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z7 = false;
        for (int i5 = 0; i5 < size; i5++) {
            this.mItemDecorations.get(i5).onDrawOver(canvas, this, this.mState);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z5 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.mClipToPadding ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, DECELERATION_RATE);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            z5 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            z5 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.mClipToPadding ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.mRightGlow;
            z5 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z7 = true;
            }
            z5 |= z7;
            canvas.restoreToCount(save4);
        }
        if ((z5 || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.f()) ? z5 : true) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(@NonNull Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        for (int i5 = 0; i5 < size; i5++) {
            o1 o1Var = this.mOnItemTouchListeners.get(i5);
            c0 c0Var = (c0) o1Var;
            int i10 = c0Var.f2350v;
            if (i10 == 1) {
                boolean b10 = c0Var.b(motionEvent.getX(), motionEvent.getY());
                boolean a7 = c0Var.a(motionEvent.getX(), motionEvent.getY());
                if (motionEvent.getAction() == 0 && (b10 || a7)) {
                    if (a7) {
                        c0Var.f2351w = 1;
                        c0Var.f2345p = (int) motionEvent.getX();
                    } else if (b10) {
                        c0Var.f2351w = 2;
                        c0Var.f2342m = (int) motionEvent.getY();
                    }
                    c0Var.d(2);
                    if (action == 3) {
                        this.mInterceptingOnItemTouchListener = o1Var;
                        return true;
                    }
                }
            } else {
                if (i10 != 2) {
                    continue;
                }
                if (action == 3) {
                }
            }
        }
        return false;
    }

    public void ensureBottomGlow() {
        if (this.mBottomGlow != null) {
            return;
        }
        ((a2) this.mEdgeEffectFactory).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mBottomGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void ensureLeftGlow() {
        if (this.mLeftGlow != null) {
            return;
        }
        ((a2) this.mEdgeEffectFactory).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mLeftGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void ensureRightGlow() {
        if (this.mRightGlow != null) {
            return;
        }
        ((a2) this.mEdgeEffectFactory).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mRightGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void ensureTopGlow() {
        if (this.mTopGlow != null) {
            return;
        }
        ((a2) this.mEdgeEffectFactory).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mTopGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public String exceptionLabel() {
        return " " + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + getContext();
    }

    public final void f(int[] iArr) {
        int e7 = this.mChildHelper.e();
        if (e7 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i5 = Integer.MAX_VALUE;
        int i10 = Integer.MIN_VALUE;
        for (int i11 = 0; i11 < e7; i11++) {
            d2 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i11));
            if (!childViewHolderInt.shouldIgnore()) {
                int layoutPosition = childViewHolderInt.getLayoutPosition();
                if (layoutPosition < i5) {
                    i5 = layoutPosition;
                }
                if (layoutPosition > i10) {
                    i10 = layoutPosition;
                }
            }
        }
        iArr[0] = i5;
        iArr[1] = i10;
    }

    public final void fillRemainingScrollValues(z1 z1Var) {
        if (getScrollState() != 2) {
            z1Var.getClass();
            return;
        }
        OverScroller overScroller = this.mViewFlinger.f2357c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        z1Var.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public View findChildViewUnder(float f6, float f10) {
        for (int e7 = this.mChildHelper.e() - 1; e7 >= 0; e7--) {
            View d10 = this.mChildHelper.d(e7);
            float translationX = d10.getTranslationX();
            float translationY = d10.getTranslationY();
            if (f6 >= d10.getLeft() + translationX && f6 <= d10.getRight() + translationX && f10 >= d10.getTop() + translationY && f10 <= d10.getBottom() + translationY) {
                return d10;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View findContainingItemView(@NonNull View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        return null;
    }

    public d2 findContainingViewHolder(@NonNull View view) {
        View findContainingItemView = findContainingItemView(view);
        if (findContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(findContainingItemView);
    }

    public d2 findViewHolderForAdapterPosition(int i5) {
        d2 d2Var = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int h10 = this.mChildHelper.h();
        for (int i10 = 0; i10 < h10; i10++) {
            d2 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i10));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && getAdapterPositionInRecyclerView(childViewHolderInt) == i5) {
                k kVar = this.mChildHelper;
                if (!kVar.f2451c.contains(childViewHolderInt.itemView)) {
                    return childViewHolderInt;
                }
                d2Var = childViewHolderInt;
            }
        }
        return d2Var;
    }

    public d2 findViewHolderForItemId(long j) {
        x0 x0Var = this.mAdapter;
        d2 d2Var = null;
        if (x0Var != null && x0Var.hasStableIds()) {
            int h10 = this.mChildHelper.h();
            for (int i5 = 0; i5 < h10; i5++) {
                d2 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i5));
                if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && childViewHolderInt.getItemId() == j) {
                    k kVar = this.mChildHelper;
                    if (!kVar.f2451c.contains(childViewHolderInt.itemView)) {
                        return childViewHolderInt;
                    }
                    d2Var = childViewHolderInt;
                }
            }
        }
        return d2Var;
    }

    public d2 findViewHolderForLayoutPosition(int i5) {
        return findViewHolderForPosition(i5, false);
    }

    @Deprecated
    public d2 findViewHolderForPosition(int i5) {
        return findViewHolderForPosition(i5, false);
    }

    public boolean fling(int i5, int i10) {
        return g(i5, i10, this.mMinFlingVelocity, this.mMaxFlingVelocity);
    }

    public boolean flingNoThresholdCheck(int i5, int i10) {
        return g(i5, i10, 0, Integer.MAX_VALUE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0189, code lost:
    
        if (r5 > 0) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x018c, code lost:
    
        if (r11 < 0) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x018f, code lost:
    
        if (r5 < 0) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0197, code lost:
    
        if ((r5 * r6) <= 0) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x019f, code lost:
    
        if ((r5 * r6) >= 0) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0170, code lost:
    
        if (r11 > 0) goto L139;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a4  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View focusSearch(View view, int i5) {
        View view2;
        int i10;
        char c2;
        boolean z5;
        View onInterceptFocusSearch = this.mLayout.onInterceptFocusSearch(view, i5);
        if (onInterceptFocusSearch != null) {
            return onInterceptFocusSearch;
        }
        boolean z7 = true;
        boolean z10 = (this.mAdapter == null || this.mLayout == null || isComputingLayout() || this.mLayoutSuppressed) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z10 && (i5 == 2 || i5 == 1)) {
            if (this.mLayout.canScrollVertically()) {
                if (focusFinder.findNextFocus(this, view, i5 == 2 ? 130 : 33) == null) {
                    z5 = true;
                    if (!z5 && this.mLayout.canScrollHorizontally()) {
                        z5 = focusFinder.findNextFocus(this, view, !((this.mLayout.getLayoutDirection() != 1) ^ (i5 != 2)) ? 66 : 17) != null;
                    }
                    if (z5) {
                        consumePendingUpdateOperations();
                        if (findContainingItemView(view) == null) {
                            return null;
                        }
                        startInterceptRequestLayout();
                        this.mLayout.onFocusSearchFailed(view, i5, this.mRecycler, this.mState);
                        stopInterceptRequestLayout(false);
                    }
                    view2 = focusFinder.findNextFocus(this, view, i5);
                }
            }
            z5 = false;
            if (!z5) {
                if (focusFinder.findNextFocus(this, view, !((this.mLayout.getLayoutDirection() != 1) ^ (i5 != 2)) ? 66 : 17) != null) {
                }
            }
            if (z5) {
            }
            view2 = focusFinder.findNextFocus(this, view, i5);
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i5);
            if (findNextFocus == null && z10) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                view2 = this.mLayout.onFocusSearchFailed(view, i5, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            } else {
                view2 = findNextFocus;
            }
        }
        if (view2 != null && !view2.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i5);
            }
            n(view2, null);
            return view;
        }
        if (view2 != null && view2 != this && view2 != view) {
            if (findContainingItemView(view2) == null) {
                z7 = false;
            } else if (view != null && findContainingItemView(view) != null) {
                this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
                this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
                offsetDescendantRectToMyCoords(view, this.mTempRect);
                offsetDescendantRectToMyCoords(view2, this.mTempRect2);
                int i11 = this.mLayout.getLayoutDirection() == 1 ? -1 : 1;
                Rect rect = this.mTempRect;
                int i12 = rect.left;
                Rect rect2 = this.mTempRect2;
                int i13 = rect2.left;
                if ((i12 < i13 || rect.right <= i13) && rect.right < rect2.right) {
                    i10 = 1;
                } else {
                    int i14 = rect.right;
                    int i15 = rect2.right;
                    i10 = ((i14 > i15 || i12 >= i15) && i12 > i13) ? -1 : 0;
                }
                int i16 = rect.top;
                int i17 = rect2.top;
                if ((i16 < i17 || rect.bottom <= i17) && rect.bottom < rect2.bottom) {
                    c2 = 1;
                } else {
                    int i18 = rect.bottom;
                    int i19 = rect2.bottom;
                    c2 = ((i18 > i19 || i16 >= i19) && i16 > i17) ? (char) 65535 : (char) 0;
                }
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i5 != 17) {
                            if (i5 != 33) {
                                if (i5 != 66) {
                                    if (i5 != 130) {
                                        StringBuilder sb2 = new StringBuilder("Invalid direction: ");
                                        sb2.append(i5);
                                        throw new IllegalArgumentException(androidx.appcompat.widget.c1.k(this, sb2));
                                    }
                                }
                            }
                        }
                    } else if (c2 <= 0) {
                        if (c2 == 0) {
                        }
                    }
                } else if (c2 >= 0) {
                    if (c2 == 0) {
                    }
                }
            }
            return !z7 ? view2 : super.focusSearch(view, i5);
        }
        z7 = false;
        if (!z7) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00da A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(int i5, int i10, int i11, int i12) {
        int i13;
        int i14;
        float f6;
        float f10;
        k1 k1Var = this.mLayout;
        if (k1Var == null) {
            io.sentry.android.core.w0.d(TAG, "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.mLayoutSuppressed) {
            return false;
        }
        boolean canScrollHorizontally = k1Var.canScrollHorizontally();
        boolean canScrollVertically = this.mLayout.canScrollVertically();
        if (!canScrollHorizontally || Math.abs(i5) < i11) {
            i5 = 0;
        }
        if (!canScrollVertically || Math.abs(i10) < i11) {
            i10 = 0;
        }
        if (i5 == 0 && i10 == 0) {
            return false;
        }
        if (i5 != 0) {
            EdgeEffect edgeEffect = this.mLeftGlow;
            if (edgeEffect == null || d5.s(edgeEffect) == DECELERATION_RATE) {
                EdgeEffect edgeEffect2 = this.mRightGlow;
                if (edgeEffect2 != null && d5.s(edgeEffect2) != DECELERATION_RATE) {
                    if (p(this.mRightGlow, i5, getWidth())) {
                        this.mRightGlow.onAbsorb(i5);
                        i5 = 0;
                    }
                    i13 = i5;
                    i5 = 0;
                }
            } else {
                int i15 = -i5;
                if (p(this.mLeftGlow, i15, getWidth())) {
                    this.mLeftGlow.onAbsorb(i15);
                    i5 = 0;
                }
                i13 = i5;
                i5 = 0;
            }
            if (i10 != 0) {
                EdgeEffect edgeEffect3 = this.mTopGlow;
                if (edgeEffect3 == null || d5.s(edgeEffect3) == DECELERATION_RATE) {
                    EdgeEffect edgeEffect4 = this.mBottomGlow;
                    if (edgeEffect4 != null && d5.s(edgeEffect4) != DECELERATION_RATE) {
                        if (p(this.mBottomGlow, i10, getHeight())) {
                            this.mBottomGlow.onAbsorb(i10);
                            i10 = 0;
                        }
                        i14 = 0;
                    }
                } else {
                    int i16 = -i10;
                    if (p(this.mTopGlow, i16, getHeight())) {
                        this.mTopGlow.onAbsorb(i16);
                        i10 = 0;
                    }
                    i14 = 0;
                }
                if (i13 == 0 || i10 != 0) {
                    int i17 = -i12;
                    i13 = Math.max(i17, Math.min(i13, i12));
                    i10 = Math.max(i17, Math.min(i10, i12));
                    q(1);
                    this.mViewFlinger.a(i13, i10);
                }
                if (i5 != 0 && i14 == 0) {
                    return (i13 == 0 && i10 == 0) ? false : true;
                }
                f6 = i5;
                f10 = i14;
                if (!dispatchNestedPreFling(f6, f10)) {
                    boolean z5 = canScrollHorizontally || canScrollVertically;
                    dispatchNestedFling(f6, f10, z5);
                    n1 n1Var = this.mOnFlingListener;
                    if (n1Var != null && n1Var.onFling(i5, i14)) {
                        return true;
                    }
                    if (z5) {
                        q(1);
                        int i18 = -i12;
                        this.mViewFlinger.a(Math.max(i18, Math.min(i5, i12)), Math.max(i18, Math.min(i14, i12)));
                        return true;
                    }
                }
                return false;
            }
            i14 = i10;
            i10 = 0;
            if (i13 == 0) {
            }
            int i172 = -i12;
            i13 = Math.max(i172, Math.min(i13, i12));
            i10 = Math.max(i172, Math.min(i10, i12));
            q(1);
            this.mViewFlinger.a(i13, i10);
            if (i5 != 0) {
            }
            f6 = i5;
            f10 = i14;
            if (!dispatchNestedPreFling(f6, f10)) {
            }
            return false;
        }
        i13 = 0;
        if (i10 != 0) {
        }
        i14 = i10;
        i10 = 0;
        if (i13 == 0) {
        }
        int i1722 = -i12;
        i13 = Math.max(i1722, Math.min(i13, i12));
        i10 = Math.max(i1722, Math.min(i10, i12));
        q(1);
        this.mViewFlinger.a(i13, i10);
        if (i5 != 0) {
        }
        f6 = i5;
        f10 = i14;
        if (!dispatchNestedPreFling(f6, f10)) {
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        k1 k1Var = this.mLayout;
        if (k1Var != null) {
            return k1Var.generateDefaultLayoutParams();
        }
        throw new IllegalStateException(androidx.appcompat.widget.c1.k(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        k1 k1Var = this.mLayout;
        if (k1Var != null) {
            return k1Var.generateLayoutParams(getContext(), attributeSet);
        }
        throw new IllegalStateException(androidx.appcompat.widget.c1.k(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public x0 getAdapter() {
        return this.mAdapter;
    }

    public int getAdapterPositionInRecyclerView(d2 d2Var) {
        if (d2Var.hasAnyOfTheFlags(524) || !d2Var.isBound()) {
            return -1;
        }
        b bVar = this.mAdapterHelper;
        int i5 = d2Var.mPosition;
        ArrayList arrayList = bVar.f2324b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = (a) arrayList.get(i10);
            int i11 = aVar.f2316a;
            if (i11 != 1) {
                if (i11 == 2) {
                    int i12 = aVar.f2317b;
                    if (i12 <= i5) {
                        int i13 = aVar.f2319d;
                        if (i12 + i13 > i5) {
                            return -1;
                        }
                        i5 -= i13;
                    } else {
                        continue;
                    }
                } else if (i11 == 8) {
                    int i14 = aVar.f2317b;
                    if (i14 == i5) {
                        i5 = aVar.f2319d;
                    } else {
                        if (i14 < i5) {
                            i5--;
                        }
                        if (aVar.f2319d <= i5) {
                            i5++;
                        }
                    }
                }
            } else if (aVar.f2317b <= i5) {
                i5 += aVar.f2319d;
            }
        }
        return i5;
    }

    @Override // android.view.View
    public int getBaseline() {
        k1 k1Var = this.mLayout;
        return k1Var != null ? k1Var.getBaseline() : super.getBaseline();
    }

    public long getChangedHolderKey(d2 d2Var) {
        return this.mAdapter.hasStableIds() ? d2Var.getItemId() : d2Var.mPosition;
    }

    public int getChildAdapterPosition(@NonNull View view) {
        d2 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i5, int i10) {
        return super.getChildDrawingOrder(i5, i10);
    }

    public long getChildItemId(@NonNull View view) {
        d2 childViewHolderInt;
        x0 x0Var = this.mAdapter;
        if (x0Var == null || !x0Var.hasStableIds() || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1L;
        }
        return childViewHolderInt.getItemId();
    }

    public int getChildLayoutPosition(@NonNull View view) {
        d2 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getLayoutPosition();
        }
        return -1;
    }

    @Deprecated
    public int getChildPosition(@NonNull View view) {
        return getChildAdapterPosition(view);
    }

    public d2 getChildViewHolder(@NonNull View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return getChildViewHolderInt(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    public f2 getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void getDecoratedBoundsWithMargins(@NonNull View view, @NonNull Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    @NonNull
    public c1 getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    public f1 getItemAnimator() {
        return this.mItemAnimator;
    }

    public Rect getItemDecorInsetsForChild(View view) {
        l1 l1Var = (l1) view.getLayoutParams();
        boolean z5 = l1Var.f2470c;
        Rect rect = l1Var.f2469b;
        if (!z5 || (this.mState.f2601g && (l1Var.f2468a.isUpdated() || l1Var.f2468a.isInvalid()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.mTempRect.set(0, 0, 0, 0);
            this.mItemDecorations.get(i5).getItemOffsets(this.mTempRect, view, this, this.mState);
            int i10 = rect.left;
            Rect rect2 = this.mTempRect;
            rect.left = i10 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        l1Var.f2470c = false;
        return rect;
    }

    @NonNull
    public g1 getItemDecorationAt(int i5) {
        int itemDecorationCount = getItemDecorationCount();
        if (i5 >= 0 && i5 < itemDecorationCount) {
            return this.mItemDecorations.get(i5);
        }
        throw new IndexOutOfBoundsException(i5 + " is an invalid index for size " + itemDecorationCount);
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    public k1 getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    public long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0L;
    }

    public n1 getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    @NonNull
    public r1 getRecycledViewPool() {
        return this.mRecycler.c();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public final void h(int i5, int i10, MotionEvent motionEvent) {
        k1 k1Var = this.mLayout;
        if (k1Var == null) {
            io.sentry.android.core.w0.d(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean canScrollHorizontally = k1Var.canScrollHorizontally();
        boolean canScrollVertically = this.mLayout.canScrollVertically();
        int i11 = canScrollVertically ? (canScrollHorizontally ? 1 : 0) | 2 : canScrollHorizontally ? 1 : 0;
        float height = motionEvent == null ? getHeight() / 2.0f : motionEvent.getY();
        float width = motionEvent == null ? getWidth() / 2.0f : motionEvent.getX();
        int l6 = i5 - l(height, i5);
        int m6 = i10 - m(width, i10);
        startNestedScroll(i11, 1);
        if (dispatchNestedPreScroll(canScrollHorizontally ? l6 : 0, canScrollVertically ? m6 : 0, this.mReusableIntPair, this.mScrollOffset, 1)) {
            int[] iArr2 = this.mReusableIntPair;
            l6 -= iArr2[0];
            m6 -= iArr2[1];
        }
        scrollByInternal(canScrollHorizontally ? l6 : 0, canScrollVertically ? m6 : 0, motionEvent, 1);
        f0 f0Var = this.mGapWorker;
        if (f0Var != null && (l6 != 0 || m6 != 0)) {
            f0Var.a(this, l6, m6);
        }
        stopNestedScroll(1);
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.g();
    }

    public final void i(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            int i5 = actionIndex == 0 ? 1 : 0;
            this.mScrollPointerId = motionEvent.getPointerId(i5);
            int x10 = (int) (motionEvent.getX(i5) + 0.5f);
            this.mLastTouchX = x10;
            this.mInitialTouchX = x10;
            int y5 = (int) (motionEvent.getY(i5) + 0.5f);
            this.mLastTouchY = y5;
            this.mInitialTouchY = y5;
        }
    }

    public void initAdapterManager() {
        this.mAdapterHelper = new b(new v0(this));
    }

    public void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException(androidx.appcompat.widget.c1.k(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
        }
        Resources resources = getContext().getResources();
        new c0(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.sports.insider.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.sports.insider.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.sports.insider.R.dimen.fastscroll_margin));
    }

    public void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() == 0) {
            return;
        }
        k1 k1Var = this.mLayout;
        if (k1Var != null) {
            k1Var.assertNotInLayoutOrScroll("Cannot invalidate item decorations during a scroll or layout");
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean isAnimating() {
        f1 f1Var = this.mItemAnimator;
        return f1Var != null && f1Var.f();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f1395d;
    }

    public final void j() {
        boolean z5;
        boolean z7 = false;
        if (this.mDataSetHasChangedAfterLayout) {
            b bVar = this.mAdapterHelper;
            bVar.k(bVar.f2324b);
            bVar.k(bVar.f2325c);
            bVar.f2328f = 0;
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.onItemsChanged(this);
            }
        }
        if (this.mItemAnimator == null || !this.mLayout.supportsPredictiveItemAnimations()) {
            this.mAdapterHelper.c();
        } else {
            this.mAdapterHelper.j();
        }
        boolean z10 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        this.mState.j = this.mFirstLayoutComplete && this.mItemAnimator != null && ((z5 = this.mDataSetHasChangedAfterLayout) || z10 || this.mLayout.mRequestedSimpleAnimations) && (!z5 || this.mAdapter.hasStableIds());
        z1 z1Var = this.mState;
        if (z1Var.j && z10 && !this.mDataSetHasChangedAfterLayout && this.mItemAnimator != null && this.mLayout.supportsPredictiveItemAnimations()) {
            z7 = true;
        }
        z1Var.f2604k = z7;
    }

    public void jumpToPositionForSmoothScroller(int i5) {
        if (this.mLayout == null) {
            return;
        }
        setScrollState(2);
        this.mLayout.scrollToPosition(i5);
        awakenScrollBars();
    }

    public final void k() {
        boolean z5;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z5 = this.mLeftGlow.isFinished();
        } else {
            z5 = false;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z5 |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z5 |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z5 |= this.mBottomGlow.isFinished();
        }
        if (z5) {
            postInvalidateOnAnimation();
        }
    }

    public final int l(float f6, int i5) {
        float height = f6 / getHeight();
        float width = i5 / getWidth();
        EdgeEffect edgeEffect = this.mLeftGlow;
        float f10 = DECELERATION_RATE;
        if (edgeEffect == null || d5.s(edgeEffect) == DECELERATION_RATE) {
            EdgeEffect edgeEffect2 = this.mRightGlow;
            if (edgeEffect2 != null && d5.s(edgeEffect2) != DECELERATION_RATE) {
                if (canScrollHorizontally(1)) {
                    this.mRightGlow.onRelease();
                } else {
                    float D = d5.D(this.mRightGlow, width, height);
                    if (d5.s(this.mRightGlow) == DECELERATION_RATE) {
                        this.mRightGlow.onRelease();
                    }
                    f10 = D;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.mLeftGlow.onRelease();
            } else {
                float f11 = -d5.D(this.mLeftGlow, -width, 1.0f - height);
                if (d5.s(this.mLeftGlow) == DECELERATION_RATE) {
                    this.mLeftGlow.onRelease();
                }
                f10 = f11;
            }
            invalidate();
        }
        return Math.round(f10 * getWidth());
    }

    public final int m(float f6, int i5) {
        float width = f6 / getWidth();
        float height = i5 / getHeight();
        EdgeEffect edgeEffect = this.mTopGlow;
        float f10 = DECELERATION_RATE;
        if (edgeEffect == null || d5.s(edgeEffect) == DECELERATION_RATE) {
            EdgeEffect edgeEffect2 = this.mBottomGlow;
            if (edgeEffect2 != null && d5.s(edgeEffect2) != DECELERATION_RATE) {
                if (canScrollVertically(1)) {
                    this.mBottomGlow.onRelease();
                } else {
                    float D = d5.D(this.mBottomGlow, height, 1.0f - width);
                    if (d5.s(this.mBottomGlow) == DECELERATION_RATE) {
                        this.mBottomGlow.onRelease();
                    }
                    f10 = D;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.mTopGlow.onRelease();
            } else {
                float f11 = -d5.D(this.mTopGlow, -height, width);
                if (d5.s(this.mTopGlow) == DECELERATION_RATE) {
                    this.mTopGlow.onRelease();
                }
                f10 = f11;
            }
            invalidate();
        }
        return Math.round(f10 * getHeight());
    }

    public void markItemDecorInsetsDirty() {
        int h10 = this.mChildHelper.h();
        for (int i5 = 0; i5 < h10; i5++) {
            ((l1) this.mChildHelper.g(i5).getLayoutParams()).f2470c = true;
        }
        ArrayList arrayList = this.mRecycler.f2548c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            l1 l1Var = (l1) ((d2) arrayList.get(i10)).itemView.getLayoutParams();
            if (l1Var != null) {
                l1Var.f2470c = true;
            }
        }
    }

    public void markKnownViewsInvalid() {
        int h10 = this.mChildHelper.h();
        for (int i5 = 0; i5 < h10; i5++) {
            d2 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i5));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.addFlags(6);
            }
        }
        markItemDecorInsetsDirty();
        s1 s1Var = this.mRecycler;
        ArrayList arrayList = s1Var.f2548c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            d2 d2Var = (d2) arrayList.get(i10);
            if (d2Var != null) {
                d2Var.addFlags(6);
                d2Var.addChangePayload(null);
            }
        }
        x0 x0Var = s1Var.f2553h.mAdapter;
        if (x0Var == null || !x0Var.hasStableIds()) {
            s1Var.h();
        }
    }

    public final void n(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof l1) {
            l1 l1Var = (l1) layoutParams;
            if (!l1Var.f2470c) {
                Rect rect = l1Var.f2469b;
                Rect rect2 = this.mTempRect;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        this.mLayout.requestChildRectangleOnScreen(this, view, this.mTempRect, !this.mFirstLayoutComplete, view2 == null);
    }

    public void nestedScrollBy(int i5, int i10) {
        h(i5, i10, null);
    }

    public final void o(x0 x0Var, boolean z5, boolean z7) {
        x0 x0Var2 = this.mAdapter;
        if (x0Var2 != null) {
            x0Var2.unregisterAdapterDataObserver(this.mObserver);
            this.mAdapter.onDetachedFromRecyclerView(this);
        }
        if (!z5 || z7) {
            removeAndRecycleViews();
        }
        b bVar = this.mAdapterHelper;
        bVar.k(bVar.f2324b);
        bVar.k(bVar.f2325c);
        bVar.f2328f = 0;
        x0 x0Var3 = this.mAdapter;
        this.mAdapter = x0Var;
        if (x0Var != null) {
            x0Var.registerAdapterDataObserver(this.mObserver);
            x0Var.onAttachedToRecyclerView(this);
        }
        k1 k1Var = this.mLayout;
        if (k1Var != null) {
            k1Var.onAdapterChanged(x0Var3, this.mAdapter);
        }
        s1 s1Var = this.mRecycler;
        x0 x0Var4 = this.mAdapter;
        s1Var.f2546a.clear();
        s1Var.h();
        s1Var.g(x0Var3, true);
        r1 c2 = s1Var.c();
        if (x0Var3 != null) {
            c2.f2537b--;
        }
        if (!z5 && c2.f2537b == 0) {
            SparseArray sparseArray = c2.f2536a;
            for (int i5 = 0; i5 < sparseArray.size(); i5++) {
                q1 q1Var = (q1) sparseArray.valueAt(i5);
                Iterator it = q1Var.f2517a.iterator();
                while (it.hasNext()) {
                    ci.c.g(((d2) it.next()).itemView);
                }
                q1Var.f2517a.clear();
            }
        }
        if (x0Var4 != null) {
            c2.f2537b++;
        } else {
            c2.getClass();
        }
        s1Var.f();
        this.mState.f2600f = true;
    }

    public void offsetChildrenHorizontal(int i5) {
        int e7 = this.mChildHelper.e();
        for (int i10 = 0; i10 < e7; i10++) {
            this.mChildHelper.d(i10).offsetLeftAndRight(i5);
        }
    }

    public void offsetChildrenVertical(int i5) {
        int e7 = this.mChildHelper.e();
        for (int i10 = 0; i10 < e7; i10++) {
            this.mChildHelper.d(i10).offsetTopAndBottom(i5);
        }
    }

    public void offsetPositionRecordsForInsert(int i5, int i10) {
        int h10 = this.mChildHelper.h();
        for (int i11 = 0; i11 < h10; i11++) {
            d2 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i11));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.mPosition >= i5) {
                if (sVerboseLoggingEnabled) {
                    Log.d(TAG, "offsetPositionRecordsForInsert attached child " + i11 + " holder " + childViewHolderInt + " now at position " + (childViewHolderInt.mPosition + i10));
                }
                childViewHolderInt.offsetPosition(i10, false);
                this.mState.f2600f = true;
            }
        }
        ArrayList arrayList = this.mRecycler.f2548c;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            d2 d2Var = (d2) arrayList.get(i12);
            if (d2Var != null && d2Var.mPosition >= i5) {
                if (sVerboseLoggingEnabled) {
                    Log.d(TAG, "offsetPositionRecordsForInsert cached " + i12 + " holder " + d2Var + " now at position " + (d2Var.mPosition + i10));
                }
                d2Var.offsetPosition(i10, false);
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForMove(int i5, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int h10 = this.mChildHelper.h();
        int i18 = -1;
        if (i5 < i10) {
            i12 = i5;
            i11 = i10;
            i13 = -1;
        } else {
            i11 = i5;
            i12 = i10;
            i13 = 1;
        }
        for (int i19 = 0; i19 < h10; i19++) {
            d2 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i19));
            if (childViewHolderInt != null && (i17 = childViewHolderInt.mPosition) >= i12 && i17 <= i11) {
                if (sVerboseLoggingEnabled) {
                    Log.d(TAG, "offsetPositionRecordsForMove attached child " + i19 + " holder " + childViewHolderInt);
                }
                if (childViewHolderInt.mPosition == i5) {
                    childViewHolderInt.offsetPosition(i10 - i5, false);
                } else {
                    childViewHolderInt.offsetPosition(i13, false);
                }
                this.mState.f2600f = true;
            }
        }
        ArrayList arrayList = this.mRecycler.f2548c;
        if (i5 < i10) {
            i15 = i5;
            i14 = i10;
        } else {
            i14 = i5;
            i18 = 1;
            i15 = i10;
        }
        int size = arrayList.size();
        for (int i20 = 0; i20 < size; i20++) {
            d2 d2Var = (d2) arrayList.get(i20);
            if (d2Var != null && (i16 = d2Var.mPosition) >= i15 && i16 <= i14) {
                if (i16 == i5) {
                    d2Var.offsetPosition(i10 - i5, false);
                } else {
                    d2Var.offsetPosition(i18, false);
                }
                if (sVerboseLoggingEnabled) {
                    Log.d(TAG, "offsetPositionRecordsForMove cached child " + i20 + " holder " + d2Var);
                }
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForRemove(int i5, int i10, boolean z5) {
        int i11 = i5 + i10;
        int h10 = this.mChildHelper.h();
        for (int i12 = 0; i12 < h10; i12++) {
            d2 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i12));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                int i13 = childViewHolderInt.mPosition;
                if (i13 >= i11) {
                    if (sVerboseLoggingEnabled) {
                        Log.d(TAG, "offsetPositionRecordsForRemove attached child " + i12 + " holder " + childViewHolderInt + " now at position " + (childViewHolderInt.mPosition - i10));
                    }
                    childViewHolderInt.offsetPosition(-i10, z5);
                    this.mState.f2600f = true;
                } else if (i13 >= i5) {
                    if (sVerboseLoggingEnabled) {
                        Log.d(TAG, "offsetPositionRecordsForRemove attached child " + i12 + " holder " + childViewHolderInt + " now REMOVED");
                    }
                    childViewHolderInt.flagRemovedAndOffsetPosition(i5 - 1, -i10, z5);
                    this.mState.f2600f = true;
                }
            }
        }
        s1 s1Var = this.mRecycler;
        ArrayList arrayList = s1Var.f2548c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            d2 d2Var = (d2) arrayList.get(size);
            if (d2Var != null) {
                int i14 = d2Var.mPosition;
                if (i14 >= i11) {
                    if (sVerboseLoggingEnabled) {
                        Log.d(TAG, "offsetPositionRecordsForRemove cached " + size + " holder " + d2Var + " now at position " + (d2Var.mPosition - i10));
                    }
                    d2Var.offsetPosition(-i10, z5);
                } else if (i14 >= i5) {
                    d2Var.addFlags(8);
                    s1Var.i(size);
                }
            }
        }
        requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        if (r1 >= 30.0f) goto L22;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onAttachedToWindow() {
        float f6;
        super.onAttachedToWindow();
        this.mLayoutOrScrollCounter = 0;
        this.mIsAttached = true;
        this.mFirstLayoutComplete = this.mFirstLayoutComplete && !isLayoutRequested();
        this.mRecycler.f();
        k1 k1Var = this.mLayout;
        if (k1Var != null) {
            k1Var.dispatchAttachedToWindow(this);
        }
        this.mPostedAnimatorRunner = false;
        if (ALLOW_THREAD_GAP_WORK) {
            ThreadLocal threadLocal = f0.f2384e;
            f0 f0Var = (f0) threadLocal.get();
            this.mGapWorker = f0Var;
            if (f0Var == null) {
                this.mGapWorker = new f0();
                WeakHashMap weakHashMap = androidx.core.view.z0.f1413a;
                Display display = getDisplay();
                if (!isInEditMode() && display != null) {
                    f6 = display.getRefreshRate();
                }
                f6 = 60.0f;
                f0 f0Var2 = this.mGapWorker;
                f0Var2.f2388c = (long) (1.0E9f / f6);
                threadLocal.set(f0Var2);
            }
            ArrayList arrayList = this.mGapWorker.f2386a;
            if (sDebugAssertionsEnabled && arrayList.contains(this)) {
                throw new IllegalStateException("RecyclerView already present in worker list!");
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        f0 f0Var;
        ArrayList arrayList;
        int e7;
        super.onDetachedFromWindow();
        f1 f1Var = this.mItemAnimator;
        if (f1Var != null) {
            f1Var.e();
        }
        stopScroll();
        this.mIsAttached = false;
        k1 k1Var = this.mLayout;
        if (k1Var != null) {
            k1Var.dispatchDetachedFromWindow(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.getClass();
        while (r2.f2539d.b() != null) {
        }
        s1 s1Var = this.mRecycler;
        ArrayList arrayList2 = s1Var.f2548c;
        for (int i5 = 0; i5 < arrayList2.size(); i5++) {
            ci.c.g(((d2) arrayList2.get(i5)).itemView);
        }
        s1Var.g(s1Var.f2553h.mAdapter, false);
        Intrinsics.checkNotNullParameter(this, "<this>");
        Iterator it = new androidx.core.view.c1(this).iterator();
        do {
            androidx.core.view.d1 d1Var = (androidx.core.view.d1) it;
            if (!d1Var.hasNext()) {
                if (!ALLOW_THREAD_GAP_WORK || (f0Var = this.mGapWorker) == null) {
                    return;
                }
                boolean remove = f0Var.f2386a.remove(this);
                if (sDebugAssertionsEnabled && !remove) {
                    throw new IllegalStateException("RecyclerView removal failed!");
                }
                this.mGapWorker = null;
                return;
            }
            View view = (View) d1Var.next();
            b1.a aVar = (b1.a) view.getTag(com.sports.insider.R.id.pooling_container_listener_holder_tag);
            if (aVar == null) {
                aVar = new b1.a();
                view.setTag(com.sports.insider.R.id.pooling_container_listener_holder_tag, aVar);
            }
            arrayList = aVar.f2952a;
            e7 = kotlin.collections.u.e(arrayList);
        } while (-1 >= e7);
        arrayList.get(e7).getClass();
        throw new ClassCastException();
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.mItemDecorations.get(i5).onDraw(canvas, this, this.mState);
        }
    }

    public void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    public void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i5;
        boolean z5;
        float f6;
        RecyclerView recyclerView;
        if (this.mLayout != null && !this.mLayoutSuppressed && motionEvent.getAction() == 8) {
            int source = motionEvent.getSource() & 2;
            float f10 = DECELERATION_RATE;
            if (source != 0) {
                float f11 = this.mLayout.canScrollVertically() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.mLayout.canScrollHorizontally()) {
                    f10 = motionEvent.getAxisValue(10);
                }
                z5 = false;
                f6 = f10;
                f10 = f11;
                i5 = 0;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                i5 = 26;
                f6 = motionEvent.getAxisValue(26);
                if (this.mLayout.canScrollVertically()) {
                    float f12 = -f6;
                    f6 = 0.0f;
                    f10 = f12;
                } else if (!this.mLayout.canScrollHorizontally()) {
                    f6 = 0.0f;
                }
                z5 = this.mLowResRotaryEncoderFeature;
            } else {
                i5 = 0;
                z5 = false;
                f6 = 0.0f;
            }
            int i10 = (int) (f10 * this.mScaledVerticalScrollFactor);
            int i11 = (int) (f6 * this.mScaledHorizontalScrollFactor);
            if (z5) {
                OverScroller overScroller = this.mViewFlinger.f2357c;
                recyclerView = this;
                recyclerView.smoothScrollBy((overScroller.getFinalX() - overScroller.getCurrX()) + i11, (overScroller.getFinalY() - overScroller.getCurrY()) + i10, null, Integer.MIN_VALUE, true);
            } else {
                recyclerView = this;
                h(i11, i10, motionEvent);
            }
            if (i5 != 0 && !z5) {
                recyclerView.mDifferentialMotionFlingController.a(motionEvent, i5);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z5;
        boolean z7;
        if (!this.mLayoutSuppressed) {
            this.mInterceptingOnItemTouchListener = null;
            if (e(motionEvent)) {
                VelocityTracker velocityTracker = this.mVelocityTracker;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
                stopNestedScroll(0);
                k();
                setScrollState(0);
                return true;
            }
            k1 k1Var = this.mLayout;
            if (k1Var != null) {
                boolean canScrollHorizontally = k1Var.canScrollHorizontally();
                boolean canScrollVertically = this.mLayout.canScrollVertically();
                if (this.mVelocityTracker == null) {
                    this.mVelocityTracker = VelocityTracker.obtain();
                }
                this.mVelocityTracker.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.mIgnoreMotionEventTillDown) {
                        this.mIgnoreMotionEventTillDown = false;
                    }
                    this.mScrollPointerId = motionEvent.getPointerId(0);
                    int x10 = (int) (motionEvent.getX() + 0.5f);
                    this.mLastTouchX = x10;
                    this.mInitialTouchX = x10;
                    int y5 = (int) (motionEvent.getY() + 0.5f);
                    this.mLastTouchY = y5;
                    this.mInitialTouchY = y5;
                    EdgeEffect edgeEffect = this.mLeftGlow;
                    if (edgeEffect == null || d5.s(edgeEffect) == DECELERATION_RATE || canScrollHorizontally(-1)) {
                        z5 = false;
                    } else {
                        d5.D(this.mLeftGlow, DECELERATION_RATE, 1.0f - (motionEvent.getY() / getHeight()));
                        z5 = true;
                    }
                    EdgeEffect edgeEffect2 = this.mRightGlow;
                    if (edgeEffect2 != null && d5.s(edgeEffect2) != DECELERATION_RATE && !canScrollHorizontally(1)) {
                        d5.D(this.mRightGlow, DECELERATION_RATE, motionEvent.getY() / getHeight());
                        z5 = true;
                    }
                    EdgeEffect edgeEffect3 = this.mTopGlow;
                    if (edgeEffect3 != null && d5.s(edgeEffect3) != DECELERATION_RATE && !canScrollVertically(-1)) {
                        d5.D(this.mTopGlow, DECELERATION_RATE, motionEvent.getX() / getWidth());
                        z5 = true;
                    }
                    EdgeEffect edgeEffect4 = this.mBottomGlow;
                    if (edgeEffect4 != null && d5.s(edgeEffect4) != DECELERATION_RATE && !canScrollVertically(1)) {
                        d5.D(this.mBottomGlow, DECELERATION_RATE, 1.0f - (motionEvent.getX() / getWidth()));
                        z5 = true;
                    }
                    if (z5 || this.mScrollState == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        stopNestedScroll(1);
                    }
                    int[] iArr = this.mNestedOffsets;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    q(0);
                } else if (actionMasked == 1) {
                    this.mVelocityTracker.clear();
                    stopNestedScroll(0);
                } else if (actionMasked == 2) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
                    if (findPointerIndex < 0) {
                        io.sentry.android.core.w0.d(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x11 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y10 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    if (this.mScrollState != 1) {
                        int i5 = x11 - this.mInitialTouchX;
                        int i10 = y10 - this.mInitialTouchY;
                        if (!canScrollHorizontally || Math.abs(i5) <= this.mTouchSlop) {
                            z7 = false;
                        } else {
                            this.mLastTouchX = x11;
                            z7 = true;
                        }
                        if (canScrollVertically && Math.abs(i10) > this.mTouchSlop) {
                            this.mLastTouchY = y10;
                            z7 = true;
                        }
                        if (z7) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    VelocityTracker velocityTracker2 = this.mVelocityTracker;
                    if (velocityTracker2 != null) {
                        velocityTracker2.clear();
                    }
                    stopNestedScroll(0);
                    k();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
                    int x12 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.mLastTouchX = x12;
                    this.mInitialTouchX = x12;
                    int y11 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.mLastTouchY = y11;
                    this.mInitialTouchY = y11;
                } else if (actionMasked == 6) {
                    i(motionEvent);
                }
                if (this.mScrollState == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z5, int i5, int i10, int i11, int i12) {
        Trace.beginSection(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        Trace.endSection();
        this.mFirstLayoutComplete = true;
    }

    @Override // android.view.View
    public void onMeasure(int i5, int i10) {
        k1 k1Var = this.mLayout;
        if (k1Var == null) {
            defaultOnMeasure(i5, i10);
            return;
        }
        boolean z5 = false;
        if (k1Var.isAutoMeasureEnabled()) {
            int mode = View.MeasureSpec.getMode(i5);
            int mode2 = View.MeasureSpec.getMode(i10);
            this.mLayout.onMeasure(this.mRecycler, this.mState, i5, i10);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z5 = true;
            }
            this.mLastAutoMeasureSkippedDueToExact = z5;
            if (z5 || this.mAdapter == null) {
                return;
            }
            if (this.mState.f2598d == 1) {
                c();
            }
            this.mLayout.setMeasureSpecs(i5, i10);
            this.mState.f2603i = true;
            d();
            this.mLayout.setMeasuredDimensionFromChildren(i5, i10);
            if (this.mLayout.shouldMeasureTwice()) {
                this.mLayout.setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.mState.f2603i = true;
                d();
                this.mLayout.setMeasuredDimensionFromChildren(i5, i10);
            }
            this.mLastAutoMeasureNonExactMeasuredWidth = getMeasuredWidth();
            this.mLastAutoMeasureNonExactMeasuredHeight = getMeasuredHeight();
            return;
        }
        if (this.mHasFixedSize) {
            this.mLayout.onMeasure(this.mRecycler, this.mState, i5, i10);
            return;
        }
        if (this.mAdapterUpdateDuringMeasure) {
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            j();
            onExitLayoutOrScroll();
            z1 z1Var = this.mState;
            if (z1Var.f2604k) {
                z1Var.f2601g = true;
            } else {
                this.mAdapterHelper.c();
                this.mState.f2601g = false;
            }
            this.mAdapterUpdateDuringMeasure = false;
            stopInterceptRequestLayout(false);
        } else if (this.mState.f2604k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        x0 x0Var = this.mAdapter;
        if (x0Var != null) {
            this.mState.f2599e = x0Var.getItemCount();
        } else {
            this.mState.f2599e = 0;
        }
        startInterceptRequestLayout();
        this.mLayout.onMeasure(this.mRecycler, this.mState, i5, i10);
        stopInterceptRequestLayout(false);
        this.mState.f2601g = false;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i5, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i5, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.mPendingSavedState = savedState;
        super.onRestoreInstanceState(savedState.getSuperState());
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.mPendingSavedState;
        if (savedState2 != null) {
            savedState.f2282a = savedState2.f2282a;
            return savedState;
        }
        k1 k1Var = this.mLayout;
        if (k1Var != null) {
            savedState.f2282a = k1Var.onSaveInstanceState();
            return savedState;
        }
        savedState.f2282a = null;
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i5, int i10, int i11, int i12) {
        super.onSizeChanged(i5, i10, i11, i12);
        if (i5 == i11 && i10 == i12) {
            return;
        }
        invalidateGlows();
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0228  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z5;
        boolean z7;
        if (!this.mLayoutSuppressed && !this.mIgnoreMotionEventTillDown) {
            o1 o1Var = this.mInterceptingOnItemTouchListener;
            if (o1Var == null) {
                z5 = motionEvent.getAction() == 0 ? false : e(motionEvent);
            } else {
                c0 c0Var = (c0) o1Var;
                int i5 = c0Var.f2332b;
                if (c0Var.f2350v != 0) {
                    if (motionEvent.getAction() == 0) {
                        boolean b10 = c0Var.b(motionEvent.getX(), motionEvent.getY());
                        boolean a7 = c0Var.a(motionEvent.getX(), motionEvent.getY());
                        if (b10 || a7) {
                            if (a7) {
                                c0Var.f2351w = 1;
                                c0Var.f2345p = (int) motionEvent.getX();
                            } else if (b10) {
                                c0Var.f2351w = 2;
                                c0Var.f2342m = (int) motionEvent.getY();
                            }
                            c0Var.d(2);
                        }
                    } else if (motionEvent.getAction() == 1 && c0Var.f2350v == 2) {
                        c0Var.f2342m = DECELERATION_RATE;
                        c0Var.f2345p = DECELERATION_RATE;
                        c0Var.d(1);
                        c0Var.f2351w = 0;
                    } else if (motionEvent.getAction() == 2 && c0Var.f2350v == 2) {
                        c0Var.e();
                        if (c0Var.f2351w == 1) {
                            float x10 = motionEvent.getX();
                            int[] iArr = c0Var.f2353y;
                            iArr[0] = i5;
                            int i10 = c0Var.q - i5;
                            iArr[1] = i10;
                            float max = Math.max(i5, Math.min(i10, x10));
                            if (Math.abs(c0Var.f2344o - max) >= 2.0f) {
                                int c2 = c0.c(c0Var.f2345p, max, iArr, c0Var.f2347s.computeHorizontalScrollRange(), c0Var.f2347s.computeHorizontalScrollOffset(), c0Var.q);
                                if (c2 != 0) {
                                    c0Var.f2347s.scrollBy(c2, 0);
                                }
                                c0Var.f2345p = max;
                            }
                        }
                        if (c0Var.f2351w == 2) {
                            float y5 = motionEvent.getY();
                            int[] iArr2 = c0Var.f2352x;
                            iArr2[0] = i5;
                            int i11 = c0Var.f2346r - i5;
                            iArr2[1] = i11;
                            float max2 = Math.max(i5, Math.min(i11, y5));
                            if (Math.abs(c0Var.f2341l - max2) >= 2.0f) {
                                int c8 = c0.c(c0Var.f2342m, max2, iArr2, c0Var.f2347s.computeVerticalScrollRange(), c0Var.f2347s.computeVerticalScrollOffset(), c0Var.f2346r);
                                if (c8 != 0) {
                                    c0Var.f2347s.scrollBy(0, c8);
                                }
                                c0Var.f2342m = max2;
                            }
                        }
                    }
                }
                int action = motionEvent.getAction();
                if (action == 3 || action == 1) {
                    this.mInterceptingOnItemTouchListener = null;
                }
                z5 = true;
            }
            if (z5) {
                VelocityTracker velocityTracker = this.mVelocityTracker;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
                stopNestedScroll(0);
                k();
                setScrollState(0);
                return true;
            }
            k1 k1Var = this.mLayout;
            if (k1Var != null) {
                boolean canScrollHorizontally = k1Var.canScrollHorizontally();
                boolean canScrollVertically = this.mLayout.canScrollVertically();
                if (this.mVelocityTracker == null) {
                    this.mVelocityTracker = VelocityTracker.obtain();
                }
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    int[] iArr3 = this.mNestedOffsets;
                    iArr3[1] = 0;
                    iArr3[0] = 0;
                }
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                int[] iArr4 = this.mNestedOffsets;
                obtain.offsetLocation(iArr4[0], iArr4[1]);
                if (actionMasked == 0) {
                    this.mScrollPointerId = motionEvent.getPointerId(0);
                    int x11 = (int) (motionEvent.getX() + 0.5f);
                    this.mLastTouchX = x11;
                    this.mInitialTouchX = x11;
                    int y10 = (int) (motionEvent.getY() + 0.5f);
                    this.mLastTouchY = y10;
                    this.mInitialTouchY = y10;
                    q(0);
                } else {
                    if (actionMasked == 1) {
                        this.mVelocityTracker.addMovement(obtain);
                        this.mVelocityTracker.computeCurrentVelocity(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, this.mMaxFlingVelocity);
                        float f6 = canScrollHorizontally ? -this.mVelocityTracker.getXVelocity(this.mScrollPointerId) : 0.0f;
                        float f10 = canScrollVertically ? -this.mVelocityTracker.getYVelocity(this.mScrollPointerId) : 0.0f;
                        if ((f6 == DECELERATION_RATE && f10 == DECELERATION_RATE) || !fling((int) f6, (int) f10)) {
                            setScrollState(0);
                        }
                        VelocityTracker velocityTracker2 = this.mVelocityTracker;
                        if (velocityTracker2 != null) {
                            velocityTracker2.clear();
                        }
                        stopNestedScroll(0);
                        k();
                        obtain.recycle();
                        return true;
                    }
                    if (actionMasked == 2) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
                        if (findPointerIndex < 0) {
                            io.sentry.android.core.w0.d(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                            return false;
                        }
                        int x12 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                        int y11 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                        int i12 = this.mLastTouchX - x12;
                        int i13 = this.mLastTouchY - y11;
                        if (this.mScrollState != 1) {
                            if (canScrollHorizontally) {
                                i12 = i12 > 0 ? Math.max(0, i12 - this.mTouchSlop) : Math.min(0, i12 + this.mTouchSlop);
                                if (i12 != 0) {
                                    z7 = true;
                                    if (canScrollVertically) {
                                        i13 = i13 > 0 ? Math.max(0, i13 - this.mTouchSlop) : Math.min(0, i13 + this.mTouchSlop);
                                        if (i13 != 0) {
                                            z7 = true;
                                        }
                                    }
                                    if (z7) {
                                        setScrollState(1);
                                    }
                                }
                            }
                            z7 = false;
                            if (canScrollVertically) {
                            }
                            if (z7) {
                            }
                        }
                        if (this.mScrollState == 1) {
                            int[] iArr5 = this.mReusableIntPair;
                            iArr5[0] = 0;
                            iArr5[1] = 0;
                            int l6 = i12 - l(motionEvent.getY(), i12);
                            int m6 = i13 - m(motionEvent.getX(), i13);
                            if (dispatchNestedPreScroll(canScrollHorizontally ? l6 : 0, canScrollVertically ? m6 : 0, this.mReusableIntPair, this.mScrollOffset, 0)) {
                                int[] iArr6 = this.mReusableIntPair;
                                l6 -= iArr6[0];
                                m6 -= iArr6[1];
                                int[] iArr7 = this.mNestedOffsets;
                                int i14 = iArr7[0];
                                int[] iArr8 = this.mScrollOffset;
                                iArr7[0] = i14 + iArr8[0];
                                iArr7[1] = iArr7[1] + iArr8[1];
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            int[] iArr9 = this.mScrollOffset;
                            this.mLastTouchX = x12 - iArr9[0];
                            this.mLastTouchY = y11 - iArr9[1];
                            if (scrollByInternal(canScrollHorizontally ? l6 : 0, canScrollVertically ? m6 : 0, motionEvent, 0)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            f0 f0Var = this.mGapWorker;
                            if (f0Var != null && (l6 != 0 || m6 != 0)) {
                                f0Var.a(this, l6, m6);
                            }
                        }
                    } else if (actionMasked == 3) {
                        VelocityTracker velocityTracker3 = this.mVelocityTracker;
                        if (velocityTracker3 != null) {
                            velocityTracker3.clear();
                        }
                        stopNestedScroll(0);
                        k();
                        setScrollState(0);
                    } else if (actionMasked == 5) {
                        this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
                        int x13 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                        this.mLastTouchX = x13;
                        this.mInitialTouchX = x13;
                        int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                        this.mLastTouchY = y12;
                        this.mInitialTouchY = y12;
                    } else if (actionMasked == 6) {
                        i(motionEvent);
                    }
                }
                this.mVelocityTracker.addMovement(obtain);
                obtain.recycle();
                return true;
            }
        }
        return false;
    }

    public final boolean p(EdgeEffect edgeEffect, int i5, int i10) {
        if (i5 > 0) {
            return true;
        }
        float s8 = d5.s(edgeEffect) * i10;
        double log = Math.log((Math.abs(-i5) * INFLEXION) / (this.mPhysicalCoef * SCROLL_FRICTION));
        double d10 = DECELERATION_RATE;
        return ((float) (Math.exp((d10 / (d10 - 1.0d)) * log) * ((double) (this.mPhysicalCoef * SCROLL_FRICTION)))) < s8;
    }

    public void postAnimationRunner() {
        if (this.mPostedAnimatorRunner || !this.mIsAttached) {
            return;
        }
        Runnable runnable = this.mItemAnimatorRunner;
        WeakHashMap weakHashMap = androidx.core.view.z0.f1413a;
        postOnAnimation(runnable);
        this.mPostedAnimatorRunner = true;
    }

    public void processDataSetCompletelyChanged(boolean z5) {
        this.mDispatchItemsChangedEvent = z5 | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q(int i5) {
        boolean canScrollHorizontally = this.mLayout.canScrollHorizontally();
        int i10 = canScrollHorizontally;
        if (this.mLayout.canScrollVertically()) {
            i10 = (canScrollHorizontally ? 1 : 0) | 2;
        }
        startNestedScroll(i10, i5);
    }

    public void recordAnimationInfoIfBouncedHiddenView(d2 d2Var, e1 e1Var) {
        d2Var.setFlags(0, Segment.SIZE);
        if (this.mState.f2602h && d2Var.isUpdated() && !d2Var.isRemoved() && !d2Var.shouldIgnore()) {
            this.mViewInfoStore.f2560b.h(getChangedHolderKey(d2Var), d2Var);
        }
        s.n nVar = this.mViewInfoStore.f2559a;
        r2 r2Var = (r2) nVar.get(d2Var);
        if (r2Var == null) {
            r2Var = r2.a();
            nVar.put(d2Var, r2Var);
        }
        r2Var.f2541b = e1Var;
        r2Var.f2540a |= 4;
    }

    public void removeAndRecycleViews() {
        f1 f1Var = this.mItemAnimator;
        if (f1Var != null) {
            f1Var.e();
        }
        k1 k1Var = this.mLayout;
        if (k1Var != null) {
            k1Var.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        }
        s1 s1Var = this.mRecycler;
        s1Var.f2546a.clear();
        s1Var.h();
    }

    public boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        k kVar = this.mChildHelper;
        j jVar = kVar.f2450b;
        v0 v0Var = kVar.f2449a;
        int i5 = kVar.f2452d;
        boolean z5 = false;
        z5 = false;
        if (i5 == 1) {
            if (kVar.f2453e != view) {
                throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
            }
        } else {
            if (i5 == 2) {
                throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
            }
            try {
                kVar.f2452d = 2;
                int indexOfChild = v0Var.f2572a.indexOfChild(view);
                if (indexOfChild == -1) {
                    kVar.l(view);
                } else if (jVar.e(indexOfChild)) {
                    jVar.h(indexOfChild);
                    kVar.l(view);
                    v0Var.c(indexOfChild);
                }
                kVar.f2452d = 0;
                z5 = true;
            } finally {
                kVar.f2452d = 0;
            }
        }
        if (z5) {
            d2 childViewHolderInt = getChildViewHolderInt(view);
            this.mRecycler.n(childViewHolderInt);
            this.mRecycler.k(childViewHolderInt);
            if (sVerboseLoggingEnabled) {
                Log.d(TAG, "after removing animated view: " + view + ", " + this);
            }
        }
        stopInterceptRequestLayout(!z5);
        return z5;
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z5) {
        d2 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.isTmpDetached()) {
                childViewHolderInt.clearTmpDetachFlag();
            } else if (!childViewHolderInt.shouldIgnore()) {
                StringBuilder sb2 = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb2.append(childViewHolderInt);
                throw new IllegalArgumentException(androidx.appcompat.widget.c1.k(this, sb2));
            }
        } else if (sDebugAssertionsEnabled) {
            StringBuilder sb3 = new StringBuilder("No ViewHolder found for child: ");
            sb3.append(view);
            throw new IllegalArgumentException(androidx.appcompat.widget.c1.k(this, sb3));
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z5);
    }

    public void removeItemDecoration(@NonNull g1 g1Var) {
        k1 k1Var = this.mLayout;
        if (k1Var != null) {
            k1Var.assertNotInLayoutOrScroll("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(g1Var);
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeItemDecorationAt(int i5) {
        int itemDecorationCount = getItemDecorationCount();
        if (i5 >= 0 && i5 < itemDecorationCount) {
            removeItemDecoration(getItemDecorationAt(i5));
            return;
        }
        throw new IndexOutOfBoundsException(i5 + " is an invalid index for size " + itemDecorationCount);
    }

    public void removeOnChildAttachStateChangeListener(@NonNull m1 m1Var) {
        List<m1> list = this.mOnChildAttachStateListeners;
        if (list == null) {
            return;
        }
        list.remove(m1Var);
    }

    public void removeOnItemTouchListener(@NonNull o1 o1Var) {
        this.mOnItemTouchListeners.remove(o1Var);
        if (this.mInterceptingOnItemTouchListener == o1Var) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(@NonNull p1 p1Var) {
        List<p1> list = this.mScrollListeners;
        if (list != null) {
            list.remove(p1Var);
        }
    }

    public void removeRecyclerListener(@NonNull t1 t1Var) {
        this.mRecyclerListeners.remove(t1Var);
    }

    public void repositionShadowingViews() {
        d2 d2Var;
        int e7 = this.mChildHelper.e();
        for (int i5 = 0; i5 < e7; i5++) {
            View d10 = this.mChildHelper.d(i5);
            d2 childViewHolder = getChildViewHolder(d10);
            if (childViewHolder != null && (d2Var = childViewHolder.mShadowingHolder) != null) {
                View view = d2Var.itemView;
                int left = d10.getLeft();
                int top = d10.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.mLayout.onRequestChildFocus(this, this.mState, view, view2) && view2 != null) {
            n(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z5) {
        return this.mLayout.requestChildRectangleOnScreen(this, view, rect, z5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z5) {
        int size = this.mOnItemTouchListeners.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.mOnItemTouchListeners.get(i5).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z5);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth != 0 || this.mLayoutSuppressed) {
            this.mLayoutWasDefered = true;
        } else {
            super.requestLayout();
        }
    }

    public void saveOldPositions() {
        int h10 = this.mChildHelper.h();
        for (int i5 = 0; i5 < h10; i5++) {
            d2 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i5));
            if (sDebugAssertionsEnabled && childViewHolderInt.mPosition == -1 && !childViewHolderInt.isRemoved()) {
                throw new IllegalStateException(androidx.appcompat.widget.c1.k(this, new StringBuilder("view holder cannot have position -1 unless it is removed")));
            }
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.saveOldPosition();
            }
        }
    }

    @Override // android.view.View
    public void scrollBy(int i5, int i10) {
        k1 k1Var = this.mLayout;
        if (k1Var == null) {
            io.sentry.android.core.w0.d(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        boolean canScrollHorizontally = k1Var.canScrollHorizontally();
        boolean canScrollVertically = this.mLayout.canScrollVertically();
        if (canScrollHorizontally || canScrollVertically) {
            if (!canScrollHorizontally) {
                i5 = 0;
            }
            if (!canScrollVertically) {
                i10 = 0;
            }
            scrollByInternal(i5, i10, null, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean scrollByInternal(int i5, int i10, MotionEvent motionEvent, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z5;
        boolean z7;
        boolean z10;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i5, i10, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i16 = iArr2[0];
            int i17 = iArr2[1];
            i14 = i5 - i16;
            i15 = i10 - i17;
            i13 = i17;
            i12 = i16;
        } else {
            i12 = 0;
            i13 = 0;
            i14 = 0;
            i15 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i12, i13, i14, i15, this.mScrollOffset, i11, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i18 = iArr4[0];
        int i19 = i14 - i18;
        int i20 = iArr4[1];
        int i21 = i15 - i20;
        boolean z11 = (i18 == 0 && i20 == 0) ? false : true;
        int i22 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        int i23 = iArr5[0];
        this.mLastTouchX = i22 - i23;
        int i24 = this.mLastTouchY;
        int i25 = iArr5[1];
        this.mLastTouchY = i24 - i25;
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + i23;
        iArr6[1] = iArr6[1] + i25;
        if (getOverScrollMode() != 2) {
            if (motionEvent == null || u6.h.p(motionEvent, 8194)) {
                z5 = true;
                z7 = false;
            } else {
                float x10 = motionEvent.getX();
                float f6 = i19;
                float y5 = motionEvent.getY();
                float f10 = i21;
                if (f6 < DECELERATION_RATE) {
                    ensureLeftGlow();
                    z5 = true;
                    z7 = false;
                    d5.D(this.mLeftGlow, (-f6) / getWidth(), 1.0f - (y5 / getHeight()));
                } else {
                    z5 = true;
                    z7 = false;
                    if (f6 > DECELERATION_RATE) {
                        ensureRightGlow();
                        d5.D(this.mRightGlow, f6 / getWidth(), y5 / getHeight());
                    } else {
                        z10 = false;
                        if (f10 >= DECELERATION_RATE) {
                            ensureTopGlow();
                            d5.D(this.mTopGlow, (-f10) / getHeight(), x10 / getWidth());
                        } else {
                            if (f10 > DECELERATION_RATE) {
                                ensureBottomGlow();
                                d5.D(this.mBottomGlow, f10 / getHeight(), 1.0f - (x10 / getWidth()));
                            }
                            if (!z10 || f6 != DECELERATION_RATE || f10 != DECELERATION_RATE) {
                                postInvalidateOnAnimation();
                            }
                            if (Build.VERSION.SDK_INT >= 31 && u6.h.p(motionEvent, 4194304)) {
                                k();
                            }
                        }
                        z10 = z5;
                        if (!z10) {
                        }
                        postInvalidateOnAnimation();
                        if (Build.VERSION.SDK_INT >= 31) {
                            k();
                        }
                    }
                }
                z10 = z5;
                if (f10 >= DECELERATION_RATE) {
                }
                z10 = z5;
                if (!z10) {
                }
                postInvalidateOnAnimation();
                if (Build.VERSION.SDK_INT >= 31) {
                }
            }
            considerReleasingGlowsOnScroll(i5, i10);
        } else {
            z5 = true;
            z7 = false;
        }
        if (i12 != 0 || i13 != 0) {
            dispatchOnScrolled(i12, i13);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z11 && i12 == 0 && i13 == 0) ? z7 : z5;
    }

    public void scrollStep(int i5, int i10, int[] iArr) {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        Trace.beginSection(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        int scrollHorizontallyBy = i5 != 0 ? this.mLayout.scrollHorizontallyBy(i5, this.mRecycler, this.mState) : 0;
        int scrollVerticallyBy = i10 != 0 ? this.mLayout.scrollVerticallyBy(i10, this.mRecycler, this.mState) : 0;
        Trace.endSection();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = scrollHorizontallyBy;
            iArr[1] = scrollVerticallyBy;
        }
    }

    @Override // android.view.View
    public void scrollTo(int i5, int i10) {
        io.sentry.android.core.w0.m(TAG, "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollToPosition(int i5) {
        if (this.mLayoutSuppressed) {
            return;
        }
        stopScroll();
        k1 k1Var = this.mLayout;
        if (k1Var == null) {
            io.sentry.android.core.w0.d(TAG, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            k1Var.scrollToPosition(i5);
            awakenScrollBars();
        }
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (shouldDeferAccessibilityEvent(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(f2 f2Var) {
        this.mAccessibilityDelegate = f2Var;
        androidx.core.view.z0.o(this, f2Var);
    }

    public void setAdapter(x0 x0Var) {
        setLayoutFrozen(false);
        o(x0Var, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(b1 b1Var) {
        if (b1Var == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    public boolean setChildImportantForAccessibilityInternal(d2 d2Var, int i5) {
        if (!isComputingLayout()) {
            d2Var.itemView.setImportantForAccessibility(i5);
            return true;
        }
        d2Var.mPendingAccessibilityState = i5;
        this.mPendingAccessibilityImportanceChange.add(d2Var);
        return false;
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z5) {
        if (z5 != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z5;
        super.setClipToPadding(z5);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(@NonNull c1 c1Var) {
        c1Var.getClass();
        this.mEdgeEffectFactory = c1Var;
        invalidateGlows();
    }

    public void setHasFixedSize(boolean z5) {
        this.mHasFixedSize = z5;
    }

    public void setItemAnimator(f1 f1Var) {
        f1 f1Var2 = this.mItemAnimator;
        if (f1Var2 != null) {
            f1Var2.e();
            this.mItemAnimator.f2390a = null;
        }
        this.mItemAnimator = f1Var;
        if (f1Var != null) {
            f1Var.f2390a = this.mItemAnimatorListener;
        }
    }

    public void setItemViewCacheSize(int i5) {
        s1 s1Var = this.mRecycler;
        s1Var.f2550e = i5;
        s1Var.o();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z5) {
        suppressLayout(z5);
    }

    public void setLayoutManager(k1 k1Var) {
        if (k1Var == this.mLayout) {
            return;
        }
        stopScroll();
        if (this.mLayout != null) {
            f1 f1Var = this.mItemAnimator;
            if (f1Var != null) {
                f1Var.e();
            }
            this.mLayout.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
            s1 s1Var = this.mRecycler;
            s1Var.f2546a.clear();
            s1Var.h();
            if (this.mIsAttached) {
                this.mLayout.dispatchDetachedFromWindow(this, this.mRecycler);
            }
            this.mLayout.setRecyclerView(null);
            this.mLayout = null;
        } else {
            s1 s1Var2 = this.mRecycler;
            s1Var2.f2546a.clear();
            s1Var2.h();
        }
        k kVar = this.mChildHelper;
        RecyclerView recyclerView = kVar.f2449a.f2572a;
        kVar.f2450b.i();
        ArrayList arrayList = kVar.f2451c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            d2 childViewHolderInt = getChildViewHolderInt((View) arrayList.get(size));
            if (childViewHolderInt != null) {
                childViewHolderInt.onLeftHiddenState(recyclerView);
            }
            arrayList.remove(size);
        }
        int childCount = recyclerView.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = recyclerView.getChildAt(i5);
            recyclerView.dispatchChildDetached(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.mLayout = k1Var;
        if (k1Var != null) {
            if (k1Var.mRecyclerView != null) {
                StringBuilder sb2 = new StringBuilder("LayoutManager ");
                sb2.append(k1Var);
                sb2.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(androidx.appcompat.widget.c1.k(k1Var.mRecyclerView, sb2));
            }
            k1Var.setRecyclerView(this);
            if (this.mIsAttached) {
                this.mLayout.dispatchAttachedToWindow(this);
            }
        }
        this.mRecycler.o();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z5) {
        androidx.core.view.t scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f1395d) {
            ViewGroup viewGroup = scrollingChildHelper.f1394c;
            WeakHashMap weakHashMap = androidx.core.view.z0.f1413a;
            androidx.core.view.q0.n(viewGroup);
        }
        scrollingChildHelper.f1395d = z5;
    }

    public void setOnFlingListener(n1 n1Var) {
        this.mOnFlingListener = n1Var;
    }

    @Deprecated
    public void setOnScrollListener(p1 p1Var) {
        this.mScrollListener = p1Var;
    }

    public void setPreserveFocusAfterLayout(boolean z5) {
        this.mPreserveFocusAfterLayout = z5;
    }

    public void setRecycledViewPool(r1 r1Var) {
        s1 s1Var = this.mRecycler;
        RecyclerView recyclerView = s1Var.f2553h;
        s1Var.g(recyclerView.mAdapter, false);
        if (s1Var.f2552g != null) {
            r2.f2537b--;
        }
        s1Var.f2552g = r1Var;
        if (r1Var != null && recyclerView.getAdapter() != null) {
            s1Var.f2552g.f2537b++;
        }
        s1Var.f();
    }

    public void setScrollState(int i5) {
        if (i5 == this.mScrollState) {
            return;
        }
        if (sVerboseLoggingEnabled) {
            StringBuilder r5 = androidx.appcompat.widget.c1.r(i5, "setting scroll state to ", " from ");
            r5.append(this.mScrollState);
            Log.d(TAG, r5.toString(), new Exception());
        }
        this.mScrollState = i5;
        if (i5 != 2) {
            c2 c2Var = this.mViewFlinger;
            c2Var.f2361g.removeCallbacks(c2Var);
            c2Var.f2357c.abortAnimation();
            k1 k1Var = this.mLayout;
            if (k1Var != null) {
                k1Var.stopSmoothScroller();
            }
        }
        dispatchOnScrollStateChanged(i5);
    }

    public void setScrollingTouchSlop(int i5) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i5 != 0) {
            if (i5 == 1) {
                this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            io.sentry.android.core.w0.m(TAG, "setScrollingTouchSlop(): bad argument constant " + i5 + "; using default value");
        }
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(b2 b2Var) {
        this.mRecycler.getClass();
    }

    public boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (!isComputingLayout()) {
            return false;
        }
        int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
        this.mEatenAccessibilityChangeFlags |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        return true;
    }

    public void smoothScrollBy(int i5, int i10) {
        smoothScrollBy(i5, i10, null);
    }

    public void smoothScrollToPosition(int i5) {
        if (this.mLayoutSuppressed) {
            return;
        }
        k1 k1Var = this.mLayout;
        if (k1Var == null) {
            io.sentry.android.core.w0.d(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            k1Var.smoothScrollToPosition(this, this.mState, i5);
        }
    }

    public void startInterceptRequestLayout() {
        int i5 = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i5;
        if (i5 != 1 || this.mLayoutSuppressed) {
            return;
        }
        this.mLayoutWasDefered = false;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i5) {
        return getScrollingChildHelper().g(i5, 0);
    }

    public void stopInterceptRequestLayout(boolean z5) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            if (sDebugAssertionsEnabled) {
                throw new IllegalStateException(androidx.appcompat.widget.c1.k(this, new StringBuilder("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.")));
            }
            this.mInterceptRequestLayoutDepth = 1;
        }
        if (!z5 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z5 && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    public void stopScroll() {
        setScrollState(0);
        c2 c2Var = this.mViewFlinger;
        c2Var.f2361g.removeCallbacks(c2Var);
        c2Var.f2357c.abortAnimation();
        k1 k1Var = this.mLayout;
        if (k1Var != null) {
            k1Var.stopSmoothScroller();
        }
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z5) {
        if (z5 != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (z5) {
                long uptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, DECELERATION_RATE, DECELERATION_RATE, 0));
                this.mLayoutSuppressed = true;
                this.mIgnoreMotionEventTillDown = true;
                stopScroll();
                return;
            }
            this.mLayoutSuppressed = false;
            if (this.mLayoutWasDefered && this.mLayout != null && this.mAdapter != null) {
                requestLayout();
            }
            this.mLayoutWasDefered = false;
        }
    }

    public void swapAdapter(x0 x0Var, boolean z5) {
        setLayoutFrozen(false);
        o(x0Var, true, z5);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    public void viewRangeUpdate(int i5, int i10, Object obj) {
        int i11;
        int i12;
        int h10 = this.mChildHelper.h();
        int i13 = i10 + i5;
        for (int i14 = 0; i14 < h10; i14++) {
            View g10 = this.mChildHelper.g(i14);
            d2 childViewHolderInt = getChildViewHolderInt(g10);
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && (i12 = childViewHolderInt.mPosition) >= i5 && i12 < i13) {
                childViewHolderInt.addFlags(2);
                childViewHolderInt.addChangePayload(obj);
                ((l1) g10.getLayoutParams()).f2470c = true;
            }
        }
        s1 s1Var = this.mRecycler;
        ArrayList arrayList = s1Var.f2548c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            d2 d2Var = (d2) arrayList.get(size);
            if (d2Var != null && (i11 = d2Var.mPosition) >= i5 && i11 < i13) {
                d2Var.addFlags(2);
                s1Var.i(size);
            }
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        float a7;
        Constructor constructor;
        this.mObserver = new u1(this);
        this.mRecycler = new s1(this);
        this.mViewInfoStore = new t2();
        this.mUpdateChildViewsRunnable = new t0(this, 0);
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mRecyclerListeners = new ArrayList();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = sDefaultEdgeEffectFactory;
        r rVar = new r();
        Object[] objArr = null;
        rVar.f2390a = null;
        rVar.f2391b = new ArrayList();
        rVar.f2392c = 120L;
        rVar.f2393d = 120L;
        rVar.f2394e = 250L;
        rVar.f2395f = 250L;
        int i10 = 1;
        rVar.f2524g = true;
        rVar.f2525h = new ArrayList();
        rVar.f2526i = new ArrayList();
        rVar.j = new ArrayList();
        rVar.f2527k = new ArrayList();
        rVar.f2528l = new ArrayList();
        rVar.f2529m = new ArrayList();
        rVar.f2530n = new ArrayList();
        rVar.f2531o = new ArrayList();
        rVar.f2532p = new ArrayList();
        rVar.q = new ArrayList();
        rVar.f2533r = new ArrayList();
        this.mItemAnimator = rVar;
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new c2(this);
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new d0() : null;
        z1 z1Var = new z1();
        z1Var.f2595a = -1;
        z1Var.f2596b = 0;
        z1Var.f2597c = 0;
        z1Var.f2598d = 1;
        z1Var.f2599e = 0;
        z1Var.f2600f = false;
        z1Var.f2601g = false;
        z1Var.f2602h = false;
        z1Var.f2603i = false;
        z1Var.j = false;
        z1Var.f2604k = false;
        this.mState = z1Var;
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new v0(this);
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new t0(this, i10);
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mViewInfoProcessCallback = new v0(this);
        v0 v0Var = new v0(this);
        this.mDifferentialMotionFlingTarget = v0Var;
        this.mDifferentialMotionFlingController = new androidx.core.view.i(getContext(), v0Var);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            Method method = androidx.core.view.a1.f1281a;
            a7 = s6.a.h(viewConfiguration);
        } else {
            a7 = androidx.core.view.a1.a(viewConfiguration, context);
        }
        this.mScaledHorizontalScrollFactor = a7;
        this.mScaledVerticalScrollFactor = i11 >= 26 ? s6.a.i(viewConfiguration) : androidx.core.view.a1.a(viewConfiguration, context);
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mPhysicalCoef = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.f2390a = this.mItemAnimatorListener;
        initAdapterManager();
        this.mChildHelper = new k(new v0(this));
        WeakHashMap weakHashMap = androidx.core.view.z0.f1413a;
        if ((i11 >= 26 ? androidx.core.view.t0.a(this) : 0) == 0 && i11 >= 26) {
            androidx.core.view.t0.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new f2(this));
        int[] iArr = j2.a.f18247a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i5, 0);
        androidx.core.view.z0.n(this, context, iArr, attributeSet, obtainStyledAttributes, i5);
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.mClipToPadding = obtainStyledAttributes.getBoolean(1, true);
        boolean z5 = obtainStyledAttributes.getBoolean(3, false);
        this.mEnableFastScroller = z5;
        if (z5) {
            initFastScroller((StateListDrawable) obtainStyledAttributes.getDrawable(6), obtainStyledAttributes.getDrawable(7), (StateListDrawable) obtainStyledAttributes.getDrawable(4), obtainStyledAttributes.getDrawable(5));
        }
        obtainStyledAttributes.recycle();
        this.mLowResRotaryEncoderFeature = context.getPackageManager().hasSystemFeature(LOW_RES_ROTARY_ENCODER_FEATURE);
        if (string != null) {
            String trim = string.trim();
            if (!trim.isEmpty()) {
                if (trim.charAt(0) == '.') {
                    trim = context.getPackageName() + trim;
                } else if (!trim.contains(".")) {
                    trim = RecyclerView.class.getPackage().getName() + '.' + trim;
                }
                try {
                    Class<? extends U> asSubclass = Class.forName(trim, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(k1.class);
                    try {
                        constructor = asSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i5), 0};
                    } catch (NoSuchMethodException e7) {
                        try {
                            constructor = asSubclass.getConstructor(null);
                        } catch (NoSuchMethodException e9) {
                            e9.initCause(e7);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + trim, e9);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((k1) constructor.newInstance(objArr));
                } catch (ClassCastException e10) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + trim, e10);
                } catch (ClassNotFoundException e11) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + trim, e11);
                } catch (IllegalAccessException e12) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + trim, e12);
                } catch (InstantiationException e13) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e13);
                } catch (InvocationTargetException e14) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e14);
                }
            }
        }
        int[] iArr2 = NESTED_SCROLLING_ATTRS;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i5, 0);
        androidx.core.view.z0.n(this, context, iArr2, attributeSet, obtainStyledAttributes2, i5);
        boolean z7 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z7);
        Intrinsics.checkNotNullParameter(this, "<this>");
        setTag(com.sports.insider.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0038 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d2 findViewHolderForPosition(int i5, boolean z5) {
        k kVar;
        int h10 = this.mChildHelper.h();
        d2 d2Var = null;
        for (int i10 = 0; i10 < h10; i10++) {
            d2 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i10));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved()) {
                if (z5) {
                    if (childViewHolderInt.mPosition != i5) {
                        continue;
                    }
                    kVar = this.mChildHelper;
                    if (kVar.f2451c.contains(childViewHolderInt.itemView)) {
                        return childViewHolderInt;
                    }
                    d2Var = childViewHolderInt;
                } else {
                    if (childViewHolderInt.getLayoutPosition() != i5) {
                        continue;
                    }
                    kVar = this.mChildHelper;
                    if (kVar.f2451c.contains(childViewHolderInt.itemView)) {
                    }
                }
            }
        }
        return d2Var;
    }

    public void onExitLayoutOrScroll(boolean z5) {
        int i5 = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i5;
        if (i5 < 1) {
            if (sDebugAssertionsEnabled && i5 < 0) {
                throw new IllegalStateException(androidx.appcompat.widget.c1.k(this, new StringBuilder("layout or scroll counter cannot go below zero.Some calls are not matching")));
            }
            this.mLayoutOrScrollCounter = 0;
            if (z5) {
                int i10 = this.mEatenAccessibilityChangeFlags;
                this.mEatenAccessibilityChangeFlags = 0;
                if (i10 != 0 && isAccessibilityEnabled()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    obtain.setContentChangeTypes(i10);
                    sendAccessibilityEventUnchecked(obtain);
                }
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    public void smoothScrollBy(int i5, int i10, Interpolator interpolator) {
        smoothScrollBy(i5, i10, interpolator, Integer.MIN_VALUE);
    }

    public boolean dispatchNestedPreScroll(int i5, int i10, int[] iArr, int[] iArr2, int i11) {
        return getScrollingChildHelper().c(i5, i10, iArr, iArr2, i11);
    }

    public boolean dispatchNestedScroll(int i5, int i10, int i11, int i12, int[] iArr, int i13) {
        return getScrollingChildHelper().d(i5, i10, i11, i12, iArr, i13, null);
    }

    public boolean hasNestedScrollingParent(int i5) {
        return getScrollingChildHelper().f(i5);
    }

    public void smoothScrollBy(int i5, int i10, Interpolator interpolator, int i11) {
        smoothScrollBy(i5, i10, interpolator, i11, false);
    }

    public boolean startNestedScroll(int i5, int i10) {
        return getScrollingChildHelper().g(i5, i10);
    }

    public void stopNestedScroll(int i5) {
        getScrollingChildHelper().h(i5);
    }

    public void smoothScrollBy(int i5, int i10, Interpolator interpolator, int i11, boolean z5) {
        k1 k1Var = this.mLayout;
        if (k1Var == null) {
            io.sentry.android.core.w0.d(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        if (!k1Var.canScrollHorizontally()) {
            i5 = 0;
        }
        if (!this.mLayout.canScrollVertically()) {
            i10 = 0;
        }
        if (i5 == 0 && i10 == 0) {
            return;
        }
        if (i11 != Integer.MIN_VALUE && i11 <= 0) {
            scrollBy(i5, i10);
            return;
        }
        if (z5) {
            int i12 = i5 != 0 ? 1 : 0;
            if (i10 != 0) {
                i12 |= 2;
            }
            startNestedScroll(i12, 1);
        }
        this.mViewFlinger.c(i5, i10, interpolator, i11);
    }

    public final void dispatchNestedScroll(int i5, int i10, int i11, int i12, int[] iArr, int i13, @NonNull int[] iArr2) {
        getScrollingChildHelper().d(i5, i10, i11, i12, iArr, i13, iArr2);
    }

    public void addItemDecoration(@NonNull g1 g1Var) {
        addItemDecoration(g1Var, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        k1 k1Var = this.mLayout;
        if (k1Var != null) {
            return k1Var.generateLayoutParams(layoutParams);
        }
        throw new IllegalStateException(androidx.appcompat.widget.c1.k(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    public void onChildAttachedToWindow(@NonNull View view) {
    }

    public void onChildDetachedFromWindow(@NonNull View view) {
    }

    public void onScrollStateChanged(int i5) {
    }

    @Deprecated
    public void setRecyclerListener(t1 t1Var) {
    }

    public void onScrolled(int i5, int i10) {
    }
}
