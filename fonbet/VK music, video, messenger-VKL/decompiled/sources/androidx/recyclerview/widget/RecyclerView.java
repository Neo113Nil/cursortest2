package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
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
import androidx.annotation.Nullable;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.l0;
import androidx.recyclerview.widget.q;
import androidx.recyclerview.widget.q0;
import androidx.recyclerview.widget.r0;
import com.ironsource.mediationsdk.logger.IronSourceError;
import io.jsonwebtoken.JwtParser;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import xsna.am;
import xsna.b0u0;
import xsna.dpj0;
import xsna.eih0;
import xsna.fsk;
import xsna.fyo;
import xsna.g620;
import xsna.hk;
import xsna.ho8;
import xsna.iut0;
import xsna.ji;
import xsna.jk;
import xsna.kxt0;
import xsna.mxt0;
import xsna.obr;
import xsna.odj;
import xsna.pdp0;
import xsna.q160;
import xsna.s160;
import xsna.t9c;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements eih0, q160 {
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    static boolean sDebugAssertionsEnabled = false;
    static final b0 sDefaultEdgeEffectFactory;
    static final Interpolator sQuinticInterpolator;
    static boolean sVerboseLoggingEnabled = false;
    l0 mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    Adapter mAdapter;
    androidx.recyclerview.widget.a mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private j mChildDrawingOrderCallback;
    androidx.recyclerview.widget.e mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;

    @NonNull
    private k mEdgeEffectFactory;
    boolean mEnableFastScroller;
    boolean mFirstLayoutComplete;
    androidx.recyclerview.widget.q mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private s mInterceptingOnItemTouchListener;
    boolean mIsAttached;
    l mItemAnimator;
    private l.b mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    final ArrayList<n> mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastAutoMeasureNonExactMeasuredHeight;
    private int mLastAutoMeasureNonExactMeasuredWidth;
    private boolean mLastAutoMeasureSkippedDueToExact;
    private int mLastTouchX;
    private int mLastTouchY;
    o mLayout;
    private int mLayoutOrScrollCounter;
    boolean mLayoutSuppressed;
    boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final x mObserver;
    private List<q> mOnChildAttachStateListeners;
    private r mOnFlingListener;
    private final ArrayList<s> mOnItemTouchListeners;
    final List<e0> mPendingAccessibilityImportanceChange;
    SavedState mPendingSavedState;
    private final float mPhysicalCoef;
    boolean mPostedAnimatorRunner;
    q.b mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final v mRecycler;
    w mRecyclerListener;
    final List<w> mRecyclerListeners;
    final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private t mScrollListener;
    private List<t> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private s160 mScrollingChildHelper;
    final a0 mState;
    final Rect mTempRect;
    private final Rect mTempRect2;
    final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    final d0 mViewFlinger;
    private final r0.b mViewInfoProcessCallback;
    final r0 mViewInfoStore;
    private static final int[] NESTED_SCROLLING_ATTRS = {R.attr.nestedScrollingEnabled};
    private static final float DECELERATION_RATE = (float) (Math.log(0.78d) / Math.log(0.9d));
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST = false;
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = true;
    static final boolean POST_UPDATES_ON_ANIMATION = true;
    static final boolean ALLOW_THREAD_GAP_WORK = true;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION = false;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD = false;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.mFirstLayoutComplete || recyclerView.isLayoutRequested()) {
                return;
            }
            if (!recyclerView.mIsAttached) {
                recyclerView.requestLayout();
            } else if (recyclerView.mLayoutSuppressed) {
                recyclerView.mLayoutWasDefered = true;
            } else {
                recyclerView.consumePendingUpdateOperations();
            }
        }
    }

    public static class a0 {
        public int a = -1;
        public int b = 0;
        public int c = 0;
        public int d = 1;
        public int e = 0;
        public boolean f = false;
        public boolean g = false;
        public boolean h = false;
        public boolean i = false;
        public boolean j = false;
        public boolean k = false;
        public int l;
        public long m;
        public int n;

        public final void a(int i) {
            if ((this.d & i) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.d));
        }

        public final int b() {
            return this.g ? this.b - this.c : this.e;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("State{mTargetPosition=");
            sb.append(this.a);
            sb.append(", mData=null, mItemCount=");
            sb.append(this.e);
            sb.append(", mIsMeasuring=");
            sb.append(this.i);
            sb.append(", mPreviousLayoutItemCount=");
            sb.append(this.b);
            sb.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            sb.append(this.c);
            sb.append(", mStructureChanged=");
            sb.append(this.f);
            sb.append(", mInPreLayout=");
            sb.append(this.g);
            sb.append(", mRunSimpleAnimations=");
            sb.append(this.j);
            sb.append(", mRunPredictiveAnimations=");
            return defpackage.q0.a(sb, this.k, '}');
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RecyclerView recyclerView = RecyclerView.this;
            l lVar = recyclerView.mItemAnimator;
            if (lVar != null) {
                lVar.r();
            }
            recyclerView.mPostedAnimatorRunner = false;
        }
    }

    public static class b0 extends k {
        @Override // androidx.recyclerview.widget.RecyclerView.k
        @NonNull
        public final EdgeEffect a(@NonNull RecyclerView recyclerView, int i) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public class c implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* loaded from: classes12.dex */
    public static abstract class c0 {
    }

    public class d implements r0.b {
        public d() {
        }
    }

    public class d0 implements Runnable {
        public int b;
        public int c;
        public OverScroller d;
        public Interpolator e;
        public boolean f;
        public boolean g;

        public d0() {
            Interpolator interpolator = RecyclerView.sQuinticInterpolator;
            this.e = interpolator;
            this.f = false;
            this.g = false;
            this.d = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        public final void a(int i, int i2) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.setScrollState(2);
            this.c = 0;
            this.b = 0;
            Interpolator interpolator = this.e;
            Interpolator interpolator2 = RecyclerView.sQuinticInterpolator;
            if (interpolator != interpolator2) {
                this.e = interpolator2;
                this.d = new OverScroller(recyclerView.getContext(), interpolator2);
            }
            this.d.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            b();
        }

        public final void b() {
            if (this.f) {
                this.g = true;
                return;
            }
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.removeCallbacks(this);
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            recyclerView.postOnAnimation(this);
        }

        public final void c(int i, int i2, @Nullable Interpolator interpolator, int i3) {
            RecyclerView recyclerView = RecyclerView.this;
            if (i3 == Integer.MIN_VALUE) {
                int abs = Math.abs(i);
                int abs2 = Math.abs(i2);
                boolean z = abs > abs2;
                int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
                if (!z) {
                    abs = abs2;
                }
                i3 = Math.min((int) (((abs / width) + 1.0f) * 300.0f), 2000);
            }
            int i4 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.sQuinticInterpolator;
            }
            if (this.e != interpolator) {
                this.e = interpolator;
                this.d = new OverScroller(recyclerView.getContext(), interpolator);
            }
            this.c = 0;
            this.b = 0;
            recyclerView.setScrollState(2);
            this.d.startScroll(0, 0, i, i2, i4);
            b();
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i;
            int i2;
            int i3;
            int i4;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mLayout == null) {
                recyclerView.removeCallbacks(this);
                this.d.abortAnimation();
                return;
            }
            this.g = false;
            this.f = true;
            recyclerView.consumePendingUpdateOperations();
            OverScroller overScroller = this.d;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i5 = currX - this.b;
                int i6 = currY - this.c;
                this.b = currX;
                this.c = currY;
                int consumeFlingInHorizontalStretch = recyclerView.consumeFlingInHorizontalStretch(i5);
                int consumeFlingInVerticalStretch = recyclerView.consumeFlingInVerticalStretch(i6);
                int[] iArr = recyclerView.mReusableIntPair;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView.dispatchNestedPreScroll(consumeFlingInHorizontalStretch, consumeFlingInVerticalStretch, iArr, null, 1)) {
                    int[] iArr2 = recyclerView.mReusableIntPair;
                    consumeFlingInHorizontalStretch -= iArr2[0];
                    consumeFlingInVerticalStretch -= iArr2[1];
                }
                if (recyclerView.getOverScrollMode() != 2) {
                    recyclerView.considerReleasingGlowsOnScroll(consumeFlingInHorizontalStretch, consumeFlingInVerticalStretch);
                }
                if (recyclerView.mAdapter != null) {
                    int[] iArr3 = recyclerView.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView.scrollStep(consumeFlingInHorizontalStretch, consumeFlingInVerticalStretch, iArr3);
                    int[] iArr4 = recyclerView.mReusableIntPair;
                    int i7 = iArr4[0];
                    int i8 = iArr4[1];
                    int i9 = consumeFlingInHorizontalStretch - i7;
                    int i10 = consumeFlingInVerticalStretch - i8;
                    z zVar = recyclerView.mLayout.mSmoothScroller;
                    if (zVar != null && !zVar.isPendingInitialRun() && zVar.isRunning()) {
                        int b = recyclerView.mState.b();
                        if (b == 0) {
                            zVar.stop();
                        } else if (zVar.getTargetPosition() >= b) {
                            zVar.setTargetPosition(b - 1);
                            zVar.onAnimation(i7, i8);
                        } else {
                            zVar.onAnimation(i7, i8);
                        }
                    }
                    i = i9;
                    i3 = i7;
                    i2 = i10;
                    i4 = i8;
                } else {
                    i = consumeFlingInHorizontalStretch;
                    i2 = consumeFlingInVerticalStretch;
                    i3 = 0;
                    i4 = 0;
                }
                if (!recyclerView.mItemDecorations.isEmpty()) {
                    recyclerView.invalidate();
                }
                int[] iArr5 = recyclerView.mReusableIntPair;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView.dispatchNestedScroll(i3, i4, i, i2, null, 1, iArr5);
                int[] iArr6 = recyclerView.mReusableIntPair;
                int i11 = i - iArr6[0];
                int i12 = i2 - iArr6[1];
                if (i3 != 0 || i4 != 0) {
                    recyclerView.dispatchOnScrolled(i3, i4);
                }
                if (!recyclerView.awakenScrollBars()) {
                    recyclerView.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i11 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i12 != 0));
                z zVar2 = recyclerView.mLayout.mSmoothScroller;
                if ((zVar2 == null || !zVar2.isPendingInitialRun()) && z) {
                    if (recyclerView.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i13 = i11 < 0 ? -currVelocity : i11 > 0 ? currVelocity : 0;
                        if (i12 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i12 <= 0) {
                            currVelocity = 0;
                        }
                        recyclerView.absorbGlows(i13, currVelocity);
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                        q.b bVar = recyclerView.mPrefetchRegistry;
                        int[] iArr7 = bVar.c;
                        if (iArr7 != null) {
                            Arrays.fill(iArr7, -1);
                        }
                        bVar.d = 0;
                    }
                } else {
                    b();
                    androidx.recyclerview.widget.q qVar = recyclerView.mGapWorker;
                    if (qVar != null) {
                        qVar.b(recyclerView, i3, i4);
                    }
                }
            }
            z zVar3 = recyclerView.mLayout.mSmoothScroller;
            if (zVar3 != null && zVar3.isPendingInitialRun()) {
                zVar3.onAnimation(0, 0);
            }
            this.f = false;
            if (!this.g) {
                recyclerView.setScrollState(0);
                recyclerView.stopNestedScroll(1);
            } else {
                recyclerView.removeCallbacks(this);
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                recyclerView.postOnAnimation(this);
            }
        }
    }

    public class e {
        public e() {
        }

        public final void a(int i) {
            RecyclerView recyclerView = RecyclerView.this;
            View childAt = recyclerView.getChildAt(i);
            if (childAt != null) {
                recyclerView.dispatchChildDetached(childAt);
                childAt.clearAnimation();
            }
            recyclerView.removeViewAt(i);
        }
    }

    /* loaded from: classes12.dex */
    public static abstract class e0 {
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.EMPTY_LIST;

        @NonNull
        public final View itemView;
        Adapter<? extends e0> mBindingAdapter;
        int mFlags;
        WeakReference<RecyclerView> mNestedRecyclerView;
        RecyclerView mOwnerRecyclerView;
        int mPosition = -1;
        int mOldPosition = -1;
        long mItemId = -1;
        int mItemViewType = -1;
        int mPreLayoutPosition = -1;
        e0 mShadowedHolder = null;
        e0 mShadowingHolder = null;
        List<Object> mPayloads = null;
        List<Object> mUnmodifiedPayloads = null;
        private int mIsRecyclableCount = 0;
        v mScrapContainer = null;
        boolean mInChangeScrap = false;
        private int mWasImportantForAccessibilityBeforeHidden = 0;
        int mPendingAccessibilityState = -1;

        public e0(@NonNull View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.itemView = view;
        }

        private void createPayloadsIfNeeded() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }

        public void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(1024);
            } else if ((1024 & this.mFlags) == 0) {
                createPayloadsIfNeeded();
                this.mPayloads.add(obj);
            }
        }

        public void addFlags(int i) {
            this.mFlags = i | this.mFlags;
        }

        public void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        public void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        public void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        public void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        public boolean doesTransientStatePreventRecycling() {
            if ((this.mFlags & 16) != 0) {
                return false;
            }
            View view = this.itemView;
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            return view.hasTransientState();
        }

        public void flagRemovedAndOffsetPosition(int i, int i2, boolean z) {
            addFlags(8);
            offsetPosition(i2, z);
            this.mPosition = i;
        }

        public final int getAbsoluteAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.getAdapterPositionInRecyclerView(this);
        }

        @Deprecated
        public final int getAdapterPosition() {
            return getBindingAdapterPosition();
        }

        @Nullable
        public final Adapter<? extends e0> getBindingAdapter() {
            return this.mBindingAdapter;
        }

        public final int getBindingAdapterPosition() {
            RecyclerView recyclerView;
            Adapter adapter;
            int adapterPositionInRecyclerView;
            if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (adapterPositionInRecyclerView = this.mOwnerRecyclerView.getAdapterPositionInRecyclerView(this)) == -1) {
                return -1;
            }
            return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, adapterPositionInRecyclerView);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i = this.mPreLayoutPosition;
            return i == -1 ? this.mPosition : i;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            int i = this.mPreLayoutPosition;
            return i == -1 ? this.mPosition : i;
        }

        public List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & 1024) != 0) {
                return FULLUPDATE_PAYLOADS;
            }
            List<Object> list = this.mPayloads;
            return (list == null || list.size() == 0) ? FULLUPDATE_PAYLOADS : this.mUnmodifiedPayloads;
        }

        public boolean hasAnyOfTheFlags(int i) {
            return (i & this.mFlags) != 0;
        }

        public boolean isAdapterPositionUnknown() {
            return (this.mFlags & 512) != 0 || isInvalid();
        }

        public boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        public boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        public boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            if ((this.mFlags & 16) != 0) {
                return false;
            }
            View view = this.itemView;
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            return !view.hasTransientState();
        }

        public boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        public boolean isScrap() {
            return this.mScrapContainer != null;
        }

        public boolean isTmpDetached() {
            return (this.mFlags & 256) != 0;
        }

        public boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        public boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        public void offsetPosition(int i, boolean z) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z) {
                this.mPreLayoutPosition += i;
            }
            this.mPosition += i;
            if (this.itemView.getLayoutParams() != null) {
                ((p) this.itemView.getLayoutParams()).d = true;
            }
        }

        public void onEnteredHiddenState(RecyclerView recyclerView) {
            int i = this.mPendingAccessibilityState;
            if (i != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i;
            } else {
                View view = this.itemView;
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                this.mWasImportantForAccessibilityBeforeHidden = view.getImportantForAccessibility();
            }
            recyclerView.setChildImportantForAccessibilityInternal(this, 4);
        }

        public void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.setChildImportantForAccessibilityInternal(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        public void resetInternal() {
            if (RecyclerView.sDebugAssertionsEnabled && isTmpDetached()) {
                throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
            }
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.clearNestedRecyclerViewIfNotNested(this);
        }

        public void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        public void setFlags(int i, int i2) {
            this.mFlags = (i & i2) | (this.mFlags & (~i2));
        }

        public final void setIsRecyclable(boolean z) {
            int i = this.mIsRecyclableCount;
            int i2 = z ? i - 1 : i + 1;
            this.mIsRecyclableCount = i2;
            if (i2 < 0) {
                this.mIsRecyclableCount = 0;
                if (RecyclerView.sDebugAssertionsEnabled) {
                    throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                }
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else if (!z && i2 == 1) {
                this.mFlags |= 16;
            } else if (z && i2 == 0) {
                this.mFlags &= -17;
            }
            if (RecyclerView.sVerboseLoggingEnabled) {
                toString();
            }
        }

        public void setScrapContainer(v vVar, boolean z) {
            this.mScrapContainer = vVar;
            this.mInChangeScrap = z;
        }

        public boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        public boolean shouldIgnore() {
            return (this.mFlags & 128) != 0;
        }

        public void stopIgnoring() {
            this.mFlags &= -129;
        }

        public String toString() {
            StringBuilder b = ho8.b(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
            b.append(Integer.toHexString(hashCode()));
            b.append(" position=");
            b.append(this.mPosition);
            b.append(" id=");
            b.append(this.mItemId);
            b.append(", oldPos=");
            b.append(this.mOldPosition);
            b.append(", pLpos:");
            b.append(this.mPreLayoutPosition);
            StringBuilder sb = new StringBuilder(b.toString());
            if (isScrap()) {
                sb.append(" scrap ");
                sb.append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
            }
            if (isInvalid()) {
                sb.append(" invalid");
            }
            if (!isBound()) {
                sb.append(" unbound");
            }
            if (needsUpdate()) {
                sb.append(" update");
            }
            if (isRemoved()) {
                sb.append(" removed");
            }
            if (shouldIgnore()) {
                sb.append(" ignored");
            }
            if (isTmpDetached()) {
                sb.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }
            if (isAdapterPositionUnknown()) {
                sb.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        public void unScrap() {
            this.mScrapContainer.p(this);
        }

        public boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }
    }

    public class f {
        public f() {
        }

        public final void a(a.C0080a c0080a) {
            int i = c0080a.a;
            RecyclerView recyclerView = RecyclerView.this;
            if (i == 1) {
                recyclerView.mLayout.onItemsAdded(recyclerView, c0080a.b, c0080a.d);
                return;
            }
            if (i == 2) {
                recyclerView.mLayout.onItemsRemoved(recyclerView, c0080a.b, c0080a.d);
            } else if (i == 4) {
                recyclerView.mLayout.onItemsUpdated(recyclerView, c0080a.b, c0080a.d, c0080a.c);
            } else {
                if (i != 8) {
                    return;
                }
                recyclerView.mLayout.onItemsMoved(recyclerView, c0080a.b, c0080a.d, 1);
            }
        }
    }

    /* loaded from: classes12.dex */
    public static /* synthetic */ class g {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Adapter.StateRestorationPolicy.values().length];
            a = iArr;
            try {
                iArr[Adapter.StateRestorationPolicy.PREVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class h extends Observable<i> {
        public final boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public final void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).b();
            }
        }

        public final void c(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).f(i, i2);
            }
        }

        public final void d(int i, int i2, @Nullable Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).d(i, i2, obj);
            }
        }

        public final void e(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).e(i, i2);
            }
        }

        public final void f(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).g(i, i2);
            }
        }

        public final void g() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).h();
            }
        }
    }

    /* loaded from: classes12.dex */
    public interface j {
    }

    public static class k {
        @NonNull
        public EdgeEffect a(@NonNull RecyclerView recyclerView, int i) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public class m implements l.b {
        public m() {
        }
    }

    /* loaded from: classes12.dex */
    public static abstract class n {
        @Deprecated
        public void getItemOffsets(@NonNull Rect rect, int i, @NonNull RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        @Deprecated
        public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
        }

        @Deprecated
        public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
        }

        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull a0 a0Var) {
            getItemOffsets(rect, ((p) view.getLayoutParams()).b.getLayoutPosition(), recyclerView);
        }

        public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull a0 a0Var) {
            onDraw(canvas, recyclerView);
        }

        public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull a0 a0Var) {
            onDrawOver(canvas, recyclerView);
        }
    }

    public static abstract class o {
        boolean mAutoMeasure;
        androidx.recyclerview.widget.e mChildHelper;
        private int mHeight;
        private int mHeightMode;
        q0 mHorizontalBoundCheck;
        private final q0.b mHorizontalBoundCheckCallback;
        boolean mIsAttachedToWindow;
        private boolean mItemPrefetchEnabled;
        private boolean mMeasurementCacheEnabled;
        int mPrefetchMaxCountObserved;
        boolean mPrefetchMaxObservedInInitialPrefetch;
        RecyclerView mRecyclerView;
        boolean mRequestedSimpleAnimations;

        @Nullable
        z mSmoothScroller;
        q0 mVerticalBoundCheck;
        private final q0.b mVerticalBoundCheckCallback;
        private int mWidth;
        private int mWidthMode;

        public class a implements q0.b {
            public a() {
            }

            @Override // androidx.recyclerview.widget.q0.b
            public final int a() {
                o oVar = o.this;
                return oVar.getWidth() - oVar.getPaddingRight();
            }

            @Override // androidx.recyclerview.widget.q0.b
            public final View b(int i) {
                return o.this.getChildAt(i);
            }

            @Override // androidx.recyclerview.widget.q0.b
            public final int c(View view) {
                return o.this.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.q0.b
            public final int d() {
                return o.this.getPaddingLeft();
            }

            @Override // androidx.recyclerview.widget.q0.b
            public final int e(View view) {
                return o.this.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).rightMargin;
            }
        }

        public class b implements q0.b {
            public b() {
            }

            @Override // androidx.recyclerview.widget.q0.b
            public final int a() {
                o oVar = o.this;
                return oVar.getHeight() - oVar.getPaddingBottom();
            }

            @Override // androidx.recyclerview.widget.q0.b
            public final View b(int i) {
                return o.this.getChildAt(i);
            }

            @Override // androidx.recyclerview.widget.q0.b
            public final int c(View view) {
                return o.this.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.q0.b
            public final int d() {
                return o.this.getPaddingTop();
            }

            @Override // androidx.recyclerview.widget.q0.b
            public final int e(View view) {
                return o.this.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).bottomMargin;
            }
        }

        public interface c {
        }

        /* loaded from: classes12.dex */
        public static class d {
            public int a;
            public int b;
            public boolean c;
            public boolean d;
        }

        public o() {
            a aVar = new a();
            this.mHorizontalBoundCheckCallback = aVar;
            b bVar = new b();
            this.mVerticalBoundCheckCallback = bVar;
            this.mHorizontalBoundCheck = new q0(aVar);
            this.mVerticalBoundCheck = new q0(bVar);
            this.mRequestedSimpleAnimations = false;
            this.mIsAttachedToWindow = false;
            this.mAutoMeasure = false;
            this.mMeasurementCacheEnabled = true;
            this.mItemPrefetchEnabled = true;
        }

        private void addViewInt(View view, int i, boolean z) {
            e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (z || childViewHolderInt.isRemoved()) {
                dpj0<e0, r0.a> dpj0Var = this.mRecyclerView.mViewInfoStore.a;
                r0.a aVar = dpj0Var.get(childViewHolderInt);
                if (aVar == null) {
                    aVar = r0.a.b();
                    dpj0Var.put(childViewHolderInt, aVar);
                }
                aVar.a |= 1;
            } else {
                this.mRecyclerView.mViewInfoStore.c(childViewHolderInt);
            }
            p pVar = (p) view.getLayoutParams();
            if (childViewHolderInt.wasReturnedFromScrap() || childViewHolderInt.isScrap()) {
                if (childViewHolderInt.isScrap()) {
                    childViewHolderInt.unScrap();
                } else {
                    childViewHolderInt.clearReturnedFromScrapFlag();
                }
                this.mChildHelper.b(view, i, view.getLayoutParams(), false);
            } else if (view.getParent() == this.mRecyclerView) {
                int j = this.mChildHelper.j(view);
                if (i == -1) {
                    i = this.mChildHelper.e();
                }
                if (j == -1) {
                    StringBuilder sb = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                    sb.append(this.mRecyclerView.indexOfChild(view));
                    throw new IllegalStateException(t9c.a(this.mRecyclerView, sb));
                }
                if (j != i) {
                    this.mRecyclerView.mLayout.moveView(j, i);
                }
            } else {
                this.mChildHelper.a(view, i, false);
                pVar.d = true;
                z zVar = this.mSmoothScroller;
                if (zVar != null && zVar.isRunning()) {
                    this.mSmoothScroller.onChildAttachedToWindow(view);
                }
            }
            if (pVar.e) {
                if (RecyclerView.sVerboseLoggingEnabled) {
                    Objects.toString(pVar.b);
                }
                childViewHolderInt.itemView.invalidate();
                pVar.e = false;
            }
        }

        public static int chooseSize(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
        }

        private void detachViewInternal(int i, @NonNull View view) {
            this.mChildHelper.c(i);
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
        
            if (r5 == 1073741824) goto L14;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static int getChildMeasureSpec(int i, int i2, int i3, int i4, boolean z) {
            int max = Math.max(0, i - i3);
            if (z) {
                if (i4 < 0) {
                    if (i4 == -1) {
                        if (i2 != Integer.MIN_VALUE) {
                            if (i2 != 0) {
                            }
                        }
                        i4 = max;
                    }
                    i2 = 0;
                    i4 = 0;
                }
                i2 = 1073741824;
            } else {
                if (i4 < 0) {
                    if (i4 != -1) {
                        if (i4 == -2) {
                            if (i2 == Integer.MIN_VALUE || i2 == 1073741824) {
                                i4 = max;
                                i2 = Integer.MIN_VALUE;
                            } else {
                                i4 = max;
                                i2 = 0;
                            }
                        }
                        i2 = 0;
                        i4 = 0;
                    }
                    i4 = max;
                }
                i2 = 1073741824;
            }
            return View.MeasureSpec.makeMeasureSpec(i4, i2);
        }

        private int[] getChildRectangleOnScreenScrollAmount(View view, Rect rect) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width2 = rect.width() + left;
            int height2 = rect.height() + top;
            int i = left - paddingLeft;
            int min = Math.min(0, i);
            int i2 = top - paddingTop;
            int min2 = Math.min(0, i2);
            int i3 = width2 - width;
            int max = Math.max(0, i3);
            int max2 = Math.max(0, height2 - height);
            if (getLayoutDirection() != 1) {
                if (min == 0) {
                    min = Math.min(i, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i3);
            }
            if (min2 == 0) {
                min2 = Math.min(i2, max2);
            }
            return new int[]{max, min2};
        }

        public static d getProperties(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.recyclerview.R.styleable.RecyclerView, i, i2);
            dVar.a = obtainStyledAttributes.getInt(androidx.recyclerview.R.styleable.RecyclerView_android_orientation, 1);
            dVar.b = obtainStyledAttributes.getInt(androidx.recyclerview.R.styleable.RecyclerView_spanCount, 1);
            dVar.c = obtainStyledAttributes.getBoolean(androidx.recyclerview.R.styleable.RecyclerView_reverseLayout, false);
            dVar.d = obtainStyledAttributes.getBoolean(androidx.recyclerview.R.styleable.RecyclerView_stackFromEnd, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        private boolean isFocusedChildVisibleAfterScrolling(RecyclerView recyclerView, int i, int i2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            Rect rect = this.mRecyclerView.mTempRect;
            getDecoratedBoundsWithMargins(focusedChild, rect);
            return rect.left - i < width && rect.right - i > paddingLeft && rect.top - i2 < height && rect.bottom - i2 > paddingTop;
        }

        private static boolean isMeasurementUpToDate(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i;
            }
            return true;
        }

        private void scrapOrRecycleView(v vVar, int i, View view) {
            e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.shouldIgnore()) {
                if (RecyclerView.sVerboseLoggingEnabled) {
                    childViewHolderInt.toString();
                }
            } else if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !this.mRecyclerView.mAdapter.hasStableIds()) {
                removeViewAt(i);
                vVar.l(childViewHolderInt);
            } else {
                detachViewAt(i);
                vVar.m(view);
                this.mRecyclerView.mViewInfoStore.c(childViewHolderInt);
            }
        }

        public View _getChildAt(int i) {
            return getChildAt(i);
        }

        public int _getPosition(View view) {
            return getPosition(view);
        }

        @SuppressLint({"UnknownNullness"})
        public void addDisappearingView(View view) {
            addDisappearingView(view, -1);
        }

        @SuppressLint({"UnknownNullness"})
        public void addView(View view) {
            addView(view, -1);
        }

        @SuppressLint({"UnknownNullness"})
        public void assertNotInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.assertNotInLayoutOrScroll(str);
            }
        }

        public void attachView(@NonNull View view, int i, p pVar) {
            e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isRemoved()) {
                dpj0<e0, r0.a> dpj0Var = this.mRecyclerView.mViewInfoStore.a;
                r0.a aVar = dpj0Var.get(childViewHolderInt);
                if (aVar == null) {
                    aVar = r0.a.b();
                    dpj0Var.put(childViewHolderInt, aVar);
                }
                aVar.a |= 1;
            } else {
                this.mRecyclerView.mViewInfoStore.c(childViewHolderInt);
            }
            this.mChildHelper.b(view, i, pVar, childViewHolderInt.isRemoved());
        }

        public void calculateItemDecorationsForChild(@NonNull View view, @NonNull Rect rect) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.getItemDecorInsetsForChild(view));
            }
        }

        public boolean canScrollHorizontally() {
            return false;
        }

        public boolean canScrollVertically() {
            return false;
        }

        public boolean checkLayoutParams(p pVar) {
            return pVar != null;
        }

        public int computeHorizontalScrollExtent(@NonNull a0 a0Var) {
            return 0;
        }

        public int computeHorizontalScrollOffset(@NonNull a0 a0Var) {
            return 0;
        }

        public int computeHorizontalScrollRange(@NonNull a0 a0Var) {
            return 0;
        }

        public int computeVerticalScrollExtent(@NonNull a0 a0Var) {
            return 0;
        }

        public int computeVerticalScrollOffset(@NonNull a0 a0Var) {
            return 0;
        }

        public int computeVerticalScrollRange(@NonNull a0 a0Var) {
            return 0;
        }

        public void detachAndScrapAttachedViews(@NonNull v vVar) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                scrapOrRecycleView(vVar, childCount, getChildAt(childCount));
            }
        }

        public void detachAndScrapViewAt(int i, @NonNull v vVar) {
            scrapOrRecycleView(vVar, i, getChildAt(i));
        }

        public void detachView(@NonNull View view) {
            int j = this.mChildHelper.j(view);
            if (j >= 0) {
                detachViewInternal(j, view);
            }
        }

        public void detachViewAt(int i) {
            detachViewInternal(i, getChildAt(i));
        }

        public void dispatchAttachedToWindow(RecyclerView recyclerView) {
            this.mIsAttachedToWindow = true;
            onAttachedToWindow(recyclerView);
        }

        public void dispatchDetachedFromWindow(RecyclerView recyclerView, v vVar) {
            this.mIsAttachedToWindow = false;
            onDetachedFromWindow(recyclerView, vVar);
        }

        @Nullable
        public View findContainingItemView(@NonNull View view) {
            View findContainingItemView;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (findContainingItemView = recyclerView.findContainingItemView(view)) == null || this.mChildHelper.c.contains(findContainingItemView)) {
                return null;
            }
            return findContainingItemView;
        }

        @Nullable
        public View findViewByPosition(int i) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt);
                if (childViewHolderInt != null && childViewHolderInt.getLayoutPosition() == i && !childViewHolderInt.shouldIgnore() && (this.mRecyclerView.mState.g || !childViewHolderInt.isRemoved())) {
                    return childAt;
                }
            }
            return null;
        }

        @SuppressLint({"UnknownNullness"})
        public abstract p generateDefaultLayoutParams();

        @SuppressLint({"UnknownNullness"})
        public p generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof p ? new p((p) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new p((ViewGroup.MarginLayoutParams) layoutParams) : new p(layoutParams);
        }

        public int getBaseline() {
            return -1;
        }

        public int getBottomDecorationHeight(@NonNull View view) {
            return ((p) view.getLayoutParams()).c.bottom;
        }

        @Nullable
        public View getChildAt(int i) {
            androidx.recyclerview.widget.e eVar = this.mChildHelper;
            if (eVar != null) {
                return eVar.d(i);
            }
            return null;
        }

        public int getChildCount() {
            androidx.recyclerview.widget.e eVar = this.mChildHelper;
            if (eVar != null) {
                return eVar.e();
            }
            return 0;
        }

        public boolean getClipToPadding() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.mClipToPadding;
        }

        public int getColumnCountForAccessibility(@NonNull v vVar, @NonNull a0 a0Var) {
            return -1;
        }

        public int getDecoratedBottom(@NonNull View view) {
            return getBottomDecorationHeight(view) + view.getBottom();
        }

        public void getDecoratedBoundsWithMargins(@NonNull View view, @NonNull Rect rect) {
            RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
        }

        public int getDecoratedLeft(@NonNull View view) {
            return view.getLeft() - getLeftDecorationWidth(view);
        }

        public int getDecoratedMeasuredHeight(@NonNull View view) {
            Rect rect = ((p) view.getLayoutParams()).c;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public int getDecoratedMeasuredWidth(@NonNull View view) {
            Rect rect = ((p) view.getLayoutParams()).c;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public int getDecoratedRight(@NonNull View view) {
            return getRightDecorationWidth(view) + view.getRight();
        }

        public int getDecoratedTop(@NonNull View view) {
            return view.getTop() - getTopDecorationHeight(view);
        }

        @Nullable
        public View getFocusedChild() {
            View focusedChild;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.mChildHelper.c.contains(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public int getHeight() {
            return this.mHeight;
        }

        public int getHeightMode() {
            return this.mHeightMode;
        }

        public int getItemCount() {
            RecyclerView recyclerView = this.mRecyclerView;
            Adapter adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        public int getItemViewType(@NonNull View view) {
            return RecyclerView.getChildViewHolderInt(view).getItemViewType();
        }

        public int getLayoutDirection() {
            RecyclerView recyclerView = this.mRecyclerView;
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            return recyclerView.getLayoutDirection();
        }

        public int getLeftDecorationWidth(@NonNull View view) {
            return ((p) view.getLayoutParams()).c.left;
        }

        public int getMinimumHeight() {
            RecyclerView recyclerView = this.mRecyclerView;
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            return recyclerView.getMinimumHeight();
        }

        public int getMinimumWidth() {
            RecyclerView recyclerView = this.mRecyclerView;
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            return recyclerView.getMinimumWidth();
        }

        public int getPaddingBottom() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public int getPaddingEnd() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                return 0;
            }
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            return recyclerView.getPaddingEnd();
        }

        public int getPaddingLeft() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public int getPaddingRight() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public int getPaddingStart() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                return 0;
            }
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            return recyclerView.getPaddingStart();
        }

        public int getPaddingTop() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int getPosition(@NonNull View view) {
            return ((p) view.getLayoutParams()).d();
        }

        public int getRightDecorationWidth(@NonNull View view) {
            return ((p) view.getLayoutParams()).c.right;
        }

        public int getRowCountForAccessibility(@NonNull v vVar, @NonNull a0 a0Var) {
            return -1;
        }

        public int getSelectionModeForAccessibility(@NonNull v vVar, @NonNull a0 a0Var) {
            return 0;
        }

        public int getTopDecorationHeight(@NonNull View view) {
            return ((p) view.getLayoutParams()).c.top;
        }

        public void getTransformedBoundingBox(@NonNull View view, boolean z, @NonNull Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((p) view.getLayoutParams()).c;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.mRecyclerView != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.mRecyclerView.mTempRectF;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public int getWidth() {
            return this.mWidth;
        }

        public int getWidthMode() {
            return this.mWidthMode;
        }

        public boolean hasFlexibleChildInBothOrientations() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                ViewGroup.LayoutParams layoutParams = getChildAt(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public void ignoreView(@NonNull View view) {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.mRecyclerView;
            if (parent != recyclerView || recyclerView.indexOfChild(view) == -1) {
                throw new IllegalArgumentException(t9c.a(this.mRecyclerView, new StringBuilder("View should be fully attached to be ignored")));
            }
            e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.addFlags(128);
            this.mRecyclerView.mViewInfoStore.d(childViewHolderInt);
        }

        public boolean isAttachedToWindow() {
            return this.mIsAttachedToWindow;
        }

        public boolean isAutoMeasureEnabled() {
            return this.mAutoMeasure;
        }

        public final boolean isItemPrefetchEnabled() {
            return this.mItemPrefetchEnabled;
        }

        public boolean isLayoutHierarchical(@NonNull v vVar, @NonNull a0 a0Var) {
            return false;
        }

        public boolean isMeasurementCacheEnabled() {
            return this.mMeasurementCacheEnabled;
        }

        public boolean isSmoothScrolling() {
            z zVar = this.mSmoothScroller;
            return zVar != null && zVar.isRunning();
        }

        public boolean isViewPartiallyVisible(@NonNull View view, boolean z, boolean z2) {
            boolean z3 = this.mHorizontalBoundCheck.b(view) && this.mVerticalBoundCheck.b(view);
            return z ? z3 : !z3;
        }

        public void layoutDecorated(@NonNull View view, int i, int i2, int i3, int i4) {
            Rect rect = ((p) view.getLayoutParams()).c;
            view.layout(i + rect.left, i2 + rect.top, i3 - rect.right, i4 - rect.bottom);
        }

        public void layoutDecoratedWithMargins(@NonNull View view, int i, int i2, int i3, int i4) {
            p pVar = (p) view.getLayoutParams();
            Rect rect = pVar.c;
            view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) pVar).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) pVar).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) pVar).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) pVar).bottomMargin);
        }

        public void measureChildWithMargins(@NonNull View view, int i, int i2) {
            p pVar = (p) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
            int i3 = itemDecorInsetsForChild.left + itemDecorInsetsForChild.right + i;
            int i4 = itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom + i2;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin + i3, ((ViewGroup.MarginLayoutParams) pVar).width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin + i4, ((ViewGroup.MarginLayoutParams) pVar).height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, pVar)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void moveView(int i, int i2) {
            View childAt = getChildAt(i);
            if (childAt != null) {
                detachViewAt(i);
                attachView(childAt, i2);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i + this.mRecyclerView.toString());
            }
        }

        public int n() {
            return getItemCount();
        }

        public void offsetChildrenHorizontal(int i) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.offsetChildrenHorizontal(i);
            }
        }

        public void offsetChildrenVertical(int i) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.offsetChildrenVertical(i);
            }
        }

        public boolean onAddFocusables(@NonNull RecyclerView recyclerView, @NonNull ArrayList<View> arrayList, int i, int i2) {
            return false;
        }

        @Deprecated
        public void onDetachedFromWindow(RecyclerView recyclerView) {
        }

        @Nullable
        public View onFocusSearchFailed(@NonNull View view, int i, @NonNull v vVar, @NonNull a0 a0Var) {
            return null;
        }

        public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityEvent(recyclerView.mRecycler, recyclerView.mState, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(am amVar) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityNodeInfo(recyclerView.mRecycler, recyclerView.mState, amVar);
        }

        public void onInitializeAccessibilityNodeInfoForItem(View view, am amVar) {
            e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt == null || childViewHolderInt.isRemoved()) {
                return;
            }
            androidx.recyclerview.widget.e eVar = this.mChildHelper;
            if (eVar.c.contains(childViewHolderInt.itemView)) {
                return;
            }
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityNodeInfoForItem(recyclerView.mRecycler, recyclerView.mState, view, amVar);
        }

        @Nullable
        public View onInterceptFocusSearch(@NonNull View view, int i) {
            return null;
        }

        public void onItemsUpdated(@NonNull RecyclerView recyclerView, int i, int i2) {
        }

        @SuppressLint({"UnknownNullness"})
        public void onLayoutChildren(v vVar, a0 a0Var) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public void onMeasure(@NonNull v vVar, @NonNull a0 a0Var, int i, int i2) {
            this.mRecyclerView.defaultOnMeasure(i, i2);
        }

        @Deprecated
        public boolean onRequestChildFocus(@NonNull RecyclerView recyclerView, @NonNull View view, @Nullable View view2) {
            return isSmoothScrolling() || recyclerView.isComputingLayout();
        }

        @Nullable
        public Parcelable onSaveInstanceState() {
            return null;
        }

        public void onSmoothScrollerStopped(z zVar) {
            if (this.mSmoothScroller == zVar) {
                this.mSmoothScroller = null;
            }
        }

        public boolean performAccessibilityAction(int i, @Nullable Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityAction(recyclerView.mRecycler, recyclerView.mState, i, bundle);
        }

        public boolean performAccessibilityActionForItem(@NonNull v vVar, @NonNull a0 a0Var, @NonNull View view, int i, @Nullable Bundle bundle) {
            return false;
        }

        public void removeAllViews() {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                this.mChildHelper.k(childCount);
            }
        }

        public void removeAndRecycleAllViews(@NonNull v vVar) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                if (!RecyclerView.getChildViewHolderInt(getChildAt(childCount)).shouldIgnore()) {
                    removeAndRecycleViewAt(childCount, vVar);
                }
            }
        }

        public void removeAndRecycleScrapInt(v vVar) {
            ArrayList<e0> arrayList = vVar.a;
            int size = arrayList.size();
            for (int i = size - 1; i >= 0; i--) {
                View view = arrayList.get(i).itemView;
                e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                if (!childViewHolderInt.shouldIgnore()) {
                    childViewHolderInt.setIsRecyclable(false);
                    if (childViewHolderInt.isTmpDetached()) {
                        this.mRecyclerView.removeDetachedView(view, false);
                    }
                    l lVar = this.mRecyclerView.mItemAnimator;
                    if (lVar != null) {
                        lVar.j(childViewHolderInt);
                    }
                    childViewHolderInt.setIsRecyclable(true);
                    e0 childViewHolderInt2 = RecyclerView.getChildViewHolderInt(view);
                    childViewHolderInt2.mScrapContainer = null;
                    childViewHolderInt2.mInChangeScrap = false;
                    childViewHolderInt2.clearReturnedFromScrapFlag();
                    vVar.l(childViewHolderInt2);
                }
            }
            arrayList.clear();
            ArrayList<e0> arrayList2 = vVar.b;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
            if (size > 0) {
                this.mRecyclerView.invalidate();
            }
        }

        public void removeAndRecycleView(@NonNull View view, @NonNull v vVar) {
            removeView(view);
            vVar.k(view);
        }

        public void removeAndRecycleViewAt(int i, @NonNull v vVar) {
            View childAt = getChildAt(i);
            removeViewAt(i);
            vVar.k(childAt);
        }

        public boolean removeCallbacks(Runnable runnable) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        @SuppressLint({"UnknownNullness"})
        public void removeView(View view) {
            androidx.recyclerview.widget.e eVar = this.mChildHelper;
            e eVar2 = eVar.a;
            int i = eVar.d;
            if (i == 1) {
                throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
            }
            if (i == 2) {
                throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
            }
            try {
                eVar.d = 1;
                eVar.e = view;
                int indexOfChild = RecyclerView.this.indexOfChild(view);
                if (indexOfChild >= 0) {
                    if (eVar.b.f(indexOfChild)) {
                        eVar.l(view);
                    }
                    eVar2.a(indexOfChild);
                }
                eVar.d = 0;
                eVar.e = null;
            } catch (Throwable th) {
                eVar.d = 0;
                eVar.e = null;
                throw th;
            }
        }

        public void removeViewAt(int i) {
            if (getChildAt(i) != null) {
                this.mChildHelper.k(i);
            }
        }

        public boolean requestChildRectangleOnScreen(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z) {
            return requestChildRectangleOnScreen(recyclerView, view, rect, z, false);
        }

        public void requestLayout() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public void requestSimpleAnimationsInNextLayout() {
            this.mRequestedSimpleAnimations = true;
        }

        @SuppressLint({"UnknownNullness"})
        public int scrollHorizontallyBy(int i, v vVar, a0 a0Var) {
            return 0;
        }

        public void scrollToPosition(int i) {
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.e("RecyclerView", "You MUST implement scrollToPosition. It will soon become abstract");
            }
        }

        @SuppressLint({"UnknownNullness"})
        public int scrollVerticallyBy(int i, v vVar, a0 a0Var) {
            return 0;
        }

        public void setExactMeasureSpecsFrom(RecyclerView recyclerView) {
            setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public final void setItemPrefetchEnabled(boolean z) {
            if (z != this.mItemPrefetchEnabled) {
                this.mItemPrefetchEnabled = z;
                this.mPrefetchMaxCountObserved = 0;
                RecyclerView recyclerView = this.mRecyclerView;
                if (recyclerView != null) {
                    recyclerView.mRecycler.q();
                }
            }
        }

        public void setMeasureSpecs(int i, int i2) {
            this.mWidth = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.mWidthMode = mode;
            if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.mWidth = 0;
            }
            this.mHeight = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.mHeightMode = mode2;
            if (mode2 != 0 || RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                return;
            }
            this.mHeight = 0;
        }

        public void setMeasuredDimension(Rect rect, int i, int i2) {
            setMeasuredDimension(chooseSize(i, getPaddingRight() + getPaddingLeft() + rect.width(), getMinimumWidth()), chooseSize(i2, getPaddingBottom() + getPaddingTop() + rect.height(), getMinimumHeight()));
        }

        public void setMeasuredDimensionFromChildren(int i, int i2) {
            int childCount = getChildCount();
            if (childCount == 0) {
                this.mRecyclerView.defaultOnMeasure(i, i2);
                return;
            }
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                Rect rect = this.mRecyclerView.mTempRect;
                getDecoratedBoundsWithMargins(childAt, rect);
                int i8 = rect.left;
                if (i8 < i6) {
                    i6 = i8;
                }
                int i9 = rect.right;
                if (i9 > i3) {
                    i3 = i9;
                }
                int i10 = rect.top;
                if (i10 < i4) {
                    i4 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i5) {
                    i5 = i11;
                }
            }
            this.mRecyclerView.mTempRect.set(i6, i4, i3, i5);
            setMeasuredDimension(this.mRecyclerView.mTempRect, i, i2);
        }

        public void setRecyclerView(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.mRecyclerView = null;
                this.mChildHelper = null;
                this.mWidth = 0;
                this.mHeight = 0;
            } else {
                this.mRecyclerView = recyclerView;
                this.mChildHelper = recyclerView.mChildHelper;
                this.mWidth = recyclerView.getWidth();
                this.mHeight = recyclerView.getHeight();
            }
            this.mWidthMode = 1073741824;
            this.mHeightMode = 1073741824;
        }

        public boolean shouldMeasureChild(View view, int i, int i2, p pVar) {
            return (!view.isLayoutRequested() && this.mMeasurementCacheEnabled && isMeasurementUpToDate(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) pVar).width) && isMeasurementUpToDate(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) pVar).height)) ? false : true;
        }

        public boolean shouldMeasureTwice() {
            return false;
        }

        public boolean shouldReMeasureChild(View view, int i, int i2, p pVar) {
            return (this.mMeasurementCacheEnabled && isMeasurementUpToDate(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) pVar).width) && isMeasurementUpToDate(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) pVar).height)) ? false : true;
        }

        @SuppressLint({"UnknownNullness"})
        public void smoothScrollToPosition(RecyclerView recyclerView, a0 a0Var, int i) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        @SuppressLint({"UnknownNullness"})
        public void startSmoothScroll(z zVar) {
            z zVar2 = this.mSmoothScroller;
            if (zVar2 != null && zVar != zVar2 && zVar2.isRunning()) {
                this.mSmoothScroller.stop();
            }
            this.mSmoothScroller = zVar;
            zVar.start(this.mRecyclerView, this);
        }

        public void stopIgnoringView(@NonNull View view) {
            e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.stopIgnoring();
            childViewHolderInt.resetInternal();
            childViewHolderInt.addFlags(4);
        }

        public void stopSmoothScroller() {
            z zVar = this.mSmoothScroller;
            if (zVar != null) {
                zVar.stop();
            }
        }

        public boolean supportsPredictiveItemAnimations() {
            return false;
        }

        public int width() {
            return getWidth();
        }

        @SuppressLint({"UnknownNullness"})
        public void addDisappearingView(View view, int i) {
            addViewInt(view, i, true);
        }

        @SuppressLint({"UnknownNullness"})
        public void addView(View view, int i) {
            addViewInt(view, i, false);
        }

        @SuppressLint({"UnknownNullness"})
        public void onDetachedFromWindow(RecyclerView recyclerView, v vVar) {
            onDetachedFromWindow(recyclerView);
        }

        public void onInitializeAccessibilityEvent(@NonNull v vVar, @NonNull a0 a0Var, @NonNull AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.mRecyclerView.canScrollVertically(-1) && !this.mRecyclerView.canScrollHorizontally(-1) && !this.mRecyclerView.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            Adapter adapter = this.mRecyclerView.mAdapter;
            if (adapter != null) {
                accessibilityEvent.setItemCount(adapter.getItemCount());
            }
        }

        public void onInitializeAccessibilityNodeInfo(@NonNull v vVar, @NonNull a0 a0Var, @NonNull am amVar) {
            if (this.mRecyclerView.canScrollVertically(-1) || this.mRecyclerView.canScrollHorizontally(-1)) {
                amVar.a(8192);
                amVar.y(true);
            }
            if (this.mRecyclerView.canScrollVertically(1) || this.mRecyclerView.canScrollHorizontally(1)) {
                amVar.a(4096);
                amVar.y(true);
            }
            amVar.p(am.g.a(getRowCountForAccessibility(vVar, a0Var), getColumnCountForAccessibility(vVar, a0Var), getSelectionModeForAccessibility(vVar, a0Var), isLayoutHierarchical(vVar, a0Var)));
        }

        public void onItemsUpdated(@NonNull RecyclerView recyclerView, int i, int i2, @Nullable Object obj) {
            onItemsUpdated(recyclerView, i, i2);
        }

        public boolean onRequestChildFocus(@NonNull RecyclerView recyclerView, @NonNull a0 a0Var, @NonNull View view, @Nullable View view2) {
            return onRequestChildFocus(recyclerView, view, view2);
        }

        public boolean performAccessibilityAction(@NonNull v vVar, @NonNull a0 a0Var, int i, @Nullable Bundle bundle) {
            int paddingTop;
            int paddingLeft;
            int i2;
            int i3;
            if (this.mRecyclerView == null) {
                return false;
            }
            int height = getHeight();
            int width = getWidth();
            Rect rect = new Rect();
            if (this.mRecyclerView.getMatrix().isIdentity() && this.mRecyclerView.getGlobalVisibleRect(rect)) {
                height = rect.height();
                width = rect.width();
            }
            if (i == 4096) {
                paddingTop = this.mRecyclerView.canScrollVertically(1) ? (height - getPaddingTop()) - getPaddingBottom() : 0;
                if (this.mRecyclerView.canScrollHorizontally(1)) {
                    paddingLeft = (width - getPaddingLeft()) - getPaddingRight();
                    i2 = paddingTop;
                    i3 = paddingLeft;
                }
                i2 = paddingTop;
                i3 = 0;
            } else if (i != 8192) {
                i3 = 0;
                i2 = 0;
            } else {
                paddingTop = this.mRecyclerView.canScrollVertically(-1) ? -((height - getPaddingTop()) - getPaddingBottom()) : 0;
                if (this.mRecyclerView.canScrollHorizontally(-1)) {
                    paddingLeft = -((width - getPaddingLeft()) - getPaddingRight());
                    i2 = paddingTop;
                    i3 = paddingLeft;
                }
                i2 = paddingTop;
                i3 = 0;
            }
            if (i2 == 0 && i3 == 0) {
                return false;
            }
            this.mRecyclerView.smoothScrollBy(i3, i2, null, Integer.MIN_VALUE, true);
            return true;
        }

        public boolean performAccessibilityActionForItem(@NonNull View view, int i, @Nullable Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityActionForItem(recyclerView.mRecycler, recyclerView.mState, view, i, bundle);
        }

        public boolean requestChildRectangleOnScreen(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z, boolean z2) {
            int[] childRectangleOnScreenScrollAmount = getChildRectangleOnScreenScrollAmount(view, rect);
            int i = childRectangleOnScreenScrollAmount[0];
            int i2 = childRectangleOnScreenScrollAmount[1];
            if ((z2 && !isFocusedChildVisibleAfterScrolling(recyclerView, i, i2)) || (i == 0 && i2 == 0)) {
                return false;
            }
            if (z) {
                recyclerView.scrollBy(i, i2);
                return true;
            }
            recyclerView.smoothScrollBy(i, i2);
            return true;
        }

        @SuppressLint({"UnknownNullness"})
        public p generateLayoutParams(Context context, AttributeSet attributeSet) {
            return new p(context, attributeSet);
        }

        public void onInitializeAccessibilityNodeInfoForItem(@NonNull v vVar, @NonNull a0 a0Var, @NonNull View view, @NonNull am amVar) {
        }

        public void setMeasuredDimension(int i, int i2) {
            this.mRecyclerView.setMeasuredDimension(i, i2);
        }

        public void attachView(@NonNull View view, int i) {
            attachView(view, i, (p) view.getLayoutParams());
        }

        public void attachView(@NonNull View view) {
            attachView(view, -1);
        }

        public void onAttachedToWindow(RecyclerView recyclerView) {
        }

        public void onItemsChanged(@NonNull RecyclerView recyclerView) {
        }

        @SuppressLint({"UnknownNullness"})
        public void onLayoutCompleted(a0 a0Var) {
        }

        @SuppressLint({"UnknownNullness"})
        public void onRestoreInstanceState(Parcelable parcelable) {
        }

        public void onScrollStateChanged(int i) {
        }

        @SuppressLint({"UnknownNullness"})
        public void collectInitialPrefetchPositions(int i, c cVar) {
        }

        public void onAdapterChanged(@Nullable Adapter adapter, @Nullable Adapter adapter2) {
        }

        public void onItemsAdded(@NonNull RecyclerView recyclerView, int i, int i2) {
        }

        public void onItemsRemoved(@NonNull RecyclerView recyclerView, int i, int i2) {
        }

        @SuppressLint({"UnknownNullness"})
        public void collectAdjacentPrefetchPositions(int i, int i2, a0 a0Var, c cVar) {
        }

        public void onItemsMoved(@NonNull RecyclerView recyclerView, int i, int i2, int i3) {
        }
    }

    /* loaded from: classes12.dex */
    public interface q {
        void g(@NonNull View view);

        void k(@NonNull View view);
    }

    public static abstract class r {
        public abstract boolean onFling(int i, int i2);
    }

    /* loaded from: classes12.dex */
    public interface s {
        void f(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent);

        void h(boolean z);

        boolean j(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent);
    }

    public static class u {
        SparseArray<a> mScrap = new SparseArray<>();
        int mAttachCountForClearing = 0;
        Set<Adapter<?>> mAttachedAdaptersForPoolingContainer = Collections.newSetFromMap(new IdentityHashMap());

        /* loaded from: classes12.dex */
        public static class a {
            public final ArrayList<e0> a = new ArrayList<>();
            public int b = 5;
            public long c = 0;
            public long d = 0;
        }

        private a getScrapDataForType(int i) {
            a aVar = this.mScrap.get(i);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.mScrap.put(i, aVar2);
            return aVar2;
        }

        public void attach() {
            this.mAttachCountForClearing++;
        }

        public void attachForPoolingContainer(@NonNull Adapter<?> adapter) {
            this.mAttachedAdaptersForPoolingContainer.add(adapter);
        }

        public void clear() {
            for (int i = 0; i < this.mScrap.size(); i++) {
                a valueAt = this.mScrap.valueAt(i);
                Iterator<e0> it = valueAt.a.iterator();
                while (it.hasNext()) {
                    g620.c(it.next().itemView);
                }
                valueAt.a.clear();
            }
        }

        public void detach() {
            this.mAttachCountForClearing--;
        }

        public void detachForPoolingContainer(@NonNull Adapter<?> adapter, boolean z) {
            this.mAttachedAdaptersForPoolingContainer.remove(adapter);
            if (this.mAttachedAdaptersForPoolingContainer.size() != 0 || z) {
                return;
            }
            for (int i = 0; i < this.mScrap.size(); i++) {
                SparseArray<a> sparseArray = this.mScrap;
                ArrayList<e0> arrayList = sparseArray.get(sparseArray.keyAt(i)).a;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    g620.c(arrayList.get(i2).itemView);
                }
            }
        }

        public void factorInBindTime(int i, long j) {
            a scrapDataForType = getScrapDataForType(i);
            scrapDataForType.d = runningAverage(scrapDataForType.d, j);
        }

        public void factorInCreateTime(int i, long j) {
            a scrapDataForType = getScrapDataForType(i);
            scrapDataForType.c = runningAverage(scrapDataForType.c, j);
        }

        @Nullable
        public e0 getRecycledView(int i) {
            a aVar = this.mScrap.get(i);
            if (aVar == null) {
                return null;
            }
            ArrayList<e0> arrayList = aVar.a;
            if (arrayList.isEmpty()) {
                return null;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).isAttachedToTransitionOverlay()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        public int getRecycledViewCount(int i) {
            return getScrapDataForType(i).a.size();
        }

        public void onAdapterChanged(Adapter<?> adapter, Adapter<?> adapter2, boolean z) {
            if (adapter != null) {
                detach();
            }
            if (!z && this.mAttachCountForClearing == 0) {
                clear();
            }
            if (adapter2 != null) {
                attach();
            }
        }

        public void putRecycledView(e0 e0Var) {
            int itemViewType = e0Var.getItemViewType();
            ArrayList<e0> arrayList = getScrapDataForType(itemViewType).a;
            if (this.mScrap.get(itemViewType).b <= arrayList.size()) {
                g620.c(e0Var.itemView);
            } else {
                if (RecyclerView.sDebugAssertionsEnabled && arrayList.contains(e0Var)) {
                    throw new IllegalArgumentException("this scrap item already exists");
                }
                e0Var.resetInternal();
                arrayList.add(e0Var);
            }
        }

        public long runningAverage(long j, long j2) {
            if (j == 0) {
                return j2;
            }
            return (j2 / 4) + ((j / 4) * 3);
        }

        public void setMaxRecycledViews(int i, int i2) {
            a scrapDataForType = getScrapDataForType(i);
            scrapDataForType.b = i2;
            ArrayList<e0> arrayList = scrapDataForType.a;
            while (arrayList.size() > i2) {
                arrayList.remove(arrayList.size() - 1);
            }
        }

        public boolean willBindInTime(int i, long j, long j2) {
            long j3 = getScrapDataForType(i).d;
            return j3 == 0 || j + j3 < j2;
        }

        public boolean willCreateInTime(int i, long j, long j2) {
            long j3 = getScrapDataForType(i).c;
            return j3 == 0 || j + j3 < j2;
        }
    }

    public final class v {
        public final ArrayList<e0> a;
        public ArrayList<e0> b;
        public final ArrayList<e0> c;
        public final List<e0> d;
        public int e;
        public int f;
        public u g;

        public v() {
            ArrayList<e0> arrayList = new ArrayList<>();
            this.a = arrayList;
            this.b = null;
            this.c = new ArrayList<>();
            this.d = Collections.unmodifiableList(arrayList);
            this.e = 2;
            this.f = 2;
        }

        public static void g(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    g((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        public final void a(@NonNull e0 e0Var, boolean z) {
            RecyclerView.clearNestedRecyclerViewIfNotNested(e0Var);
            View view = e0Var.itemView;
            RecyclerView recyclerView = RecyclerView.this;
            l0 l0Var = recyclerView.mAccessibilityDelegate;
            if (l0Var != null) {
                hk itemDelegate = l0Var.getItemDelegate();
                iut0.q(view, itemDelegate instanceof l0.a ? ((l0.a) itemDelegate).getAndRemoveOriginalDelegateForItem(view) : null);
            }
            if (z) {
                w wVar = recyclerView.mRecyclerListener;
                if (wVar != null) {
                    wVar.b(e0Var);
                }
                int size = recyclerView.mRecyclerListeners.size();
                for (int i = 0; i < size; i++) {
                    recyclerView.mRecyclerListeners.get(i).b(e0Var);
                }
                Adapter adapter = recyclerView.mAdapter;
                if (adapter != null) {
                    adapter.onViewRecycled(e0Var);
                }
                if (recyclerView.mState != null) {
                    recyclerView.mViewInfoStore.d(e0Var);
                }
                if (RecyclerView.sVerboseLoggingEnabled) {
                    Objects.toString(e0Var);
                }
            }
            e0Var.mBindingAdapter = null;
            e0Var.mOwnerRecyclerView = null;
            e().putRecycledView(e0Var);
        }

        public final void b(int i, @NonNull View view) {
            p pVar;
            e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            RecyclerView recyclerView = RecyclerView.this;
            if (childViewHolderInt == null) {
                throw new IllegalArgumentException(t9c.a(recyclerView, new StringBuilder("The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter")));
            }
            int f = recyclerView.mAdapterHelper.f(i, 0);
            if (f < 0 || f >= recyclerView.mAdapter.getItemCount()) {
                StringBuilder a = odj.a(i, f, "Inconsistency detected. Invalid item position ", "(offset:", ").state:");
                a.append(recyclerView.mState.b());
                a.append(recyclerView.exceptionLabel());
                throw new IndexOutOfBoundsException(a.toString());
            }
            n(childViewHolderInt, f, i, Long.MAX_VALUE);
            ViewGroup.LayoutParams layoutParams = childViewHolderInt.itemView.getLayoutParams();
            if (layoutParams == null) {
                pVar = (p) recyclerView.generateDefaultLayoutParams();
                childViewHolderInt.itemView.setLayoutParams(pVar);
            } else if (recyclerView.checkLayoutParams(layoutParams)) {
                pVar = (p) layoutParams;
            } else {
                pVar = (p) recyclerView.generateLayoutParams(layoutParams);
                childViewHolderInt.itemView.setLayoutParams(pVar);
            }
            pVar.d = true;
            pVar.b = childViewHolderInt;
            pVar.e = childViewHolderInt.itemView.getParent() == null;
        }

        public final void c() {
            this.a.clear();
            i();
        }

        public final int d(int i) {
            RecyclerView recyclerView = RecyclerView.this;
            if (i >= 0 && i < recyclerView.mState.b()) {
                return !recyclerView.mState.g ? i : recyclerView.mAdapterHelper.f(i, 0);
            }
            StringBuilder b = ji.b(i, "invalid position ", ". State item count is ");
            b.append(recyclerView.mState.b());
            b.append(recyclerView.exceptionLabel());
            throw new IndexOutOfBoundsException(b.toString());
        }

        public final u e() {
            if (this.g == null) {
                this.g = new u();
                h();
            }
            return this.g;
        }

        @NonNull
        public final View f(int i) {
            return o(i, Long.MAX_VALUE).itemView;
        }

        public final void h() {
            if (this.g != null) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.mAdapter == null || !recyclerView.isAttachedToWindow()) {
                    return;
                }
                this.g.attachForPoolingContainer(recyclerView.mAdapter);
            }
        }

        public final void i() {
            ArrayList<e0> arrayList = this.c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                j(size);
            }
            arrayList.clear();
            if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                q.b bVar = RecyclerView.this.mPrefetchRegistry;
                int[] iArr = bVar.c;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                bVar.d = 0;
            }
        }

        public final void j(int i) {
            boolean z = RecyclerView.sDebugAssertionsEnabled;
            ArrayList<e0> arrayList = this.c;
            e0 e0Var = arrayList.get(i);
            if (RecyclerView.sVerboseLoggingEnabled) {
                Objects.toString(e0Var);
            }
            a(e0Var, true);
            arrayList.remove(i);
        }

        public final void k(@NonNull View view) {
            e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            boolean isTmpDetached = childViewHolderInt.isTmpDetached();
            RecyclerView recyclerView = RecyclerView.this;
            if (isTmpDetached) {
                recyclerView.removeDetachedView(view, false);
            }
            if (childViewHolderInt.isScrap()) {
                childViewHolderInt.unScrap();
            } else if (childViewHolderInt.wasReturnedFromScrap()) {
                childViewHolderInt.clearReturnedFromScrapFlag();
            }
            l(childViewHolderInt);
            if (recyclerView.mItemAnimator == null || childViewHolderInt.isRecyclable()) {
                return;
            }
            recyclerView.mItemAnimator.j(childViewHolderInt);
        }

        /* JADX WARN: Code restructure failed: missing block: B:68:0x00c0, code lost:
        
            r4 = r4 - 1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void l(e0 e0Var) {
            boolean z;
            boolean isScrap = e0Var.isScrap();
            boolean z2 = true;
            RecyclerView recyclerView = RecyclerView.this;
            if (isScrap || e0Var.itemView.getParent() != null) {
                StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(e0Var.isScrap());
                sb.append(" isAttached:");
                sb.append(e0Var.itemView.getParent() != null);
                sb.append(recyclerView.exceptionLabel());
                throw new IllegalArgumentException(sb.toString());
            }
            if (e0Var.isTmpDetached()) {
                StringBuilder sb2 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
                sb2.append(e0Var);
                throw new IllegalArgumentException(t9c.a(recyclerView, sb2));
            }
            if (e0Var.shouldIgnore()) {
                throw new IllegalArgumentException(t9c.a(recyclerView, new StringBuilder("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.")));
            }
            boolean doesTransientStatePreventRecycling = e0Var.doesTransientStatePreventRecycling();
            Adapter adapter = recyclerView.mAdapter;
            boolean z3 = adapter != null && doesTransientStatePreventRecycling && adapter.onFailedToRecycleView(e0Var);
            boolean z4 = RecyclerView.sDebugAssertionsEnabled;
            ArrayList<e0> arrayList = this.c;
            if (z4 && arrayList.contains(e0Var)) {
                StringBuilder sb3 = new StringBuilder("cached view received recycle internal? ");
                sb3.append(e0Var);
                throw new IllegalArgumentException(t9c.a(recyclerView, sb3));
            }
            if (z3 || e0Var.isRecyclable()) {
                if (this.f <= 0 || e0Var.hasAnyOfTheFlags(IronSourceError.ERROR_CAPPED_PER_SESSION)) {
                    z = false;
                } else {
                    int size = arrayList.size();
                    if (size >= this.f && size > 0) {
                        j(0);
                        size--;
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK && size > 0) {
                        q.b bVar = recyclerView.mPrefetchRegistry;
                        int i = e0Var.mPosition;
                        if (bVar.c != null) {
                            int i2 = bVar.d * 2;
                            for (int i3 = 0; i3 < i2; i3 += 2) {
                                if (bVar.c[i3] == i) {
                                    break;
                                }
                            }
                        }
                        int i4 = size - 1;
                        loop1: while (i4 >= 0) {
                            int i5 = arrayList.get(i4).mPosition;
                            q.b bVar2 = recyclerView.mPrefetchRegistry;
                            if (bVar2.c == null) {
                                break;
                            }
                            int i6 = bVar2.d * 2;
                            for (int i7 = 0; i7 < i6; i7 += 2) {
                                if (bVar2.c[i7] == i5) {
                                    break;
                                }
                            }
                            break loop1;
                        }
                        size = i4 + 1;
                    }
                    arrayList.add(size, e0Var);
                    z = true;
                }
                if (z) {
                    z2 = false;
                } else {
                    a(e0Var, true);
                }
                r1 = z;
            } else {
                if (RecyclerView.sVerboseLoggingEnabled) {
                    recyclerView.exceptionLabel();
                }
                z2 = false;
            }
            recyclerView.mViewInfoStore.d(e0Var);
            if (r1 || z2 || !doesTransientStatePreventRecycling) {
                return;
            }
            g620.c(e0Var.itemView);
            e0Var.mBindingAdapter = null;
            e0Var.mOwnerRecyclerView = null;
        }

        public final void m(View view) {
            e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            boolean hasAnyOfTheFlags = childViewHolderInt.hasAnyOfTheFlags(12);
            RecyclerView recyclerView = RecyclerView.this;
            if (!hasAnyOfTheFlags && childViewHolderInt.isUpdated() && !recyclerView.canReuseUpdatedViewHolder(childViewHolderInt)) {
                if (this.b == null) {
                    this.b = new ArrayList<>();
                }
                childViewHolderInt.setScrapContainer(this, true);
                this.b.add(childViewHolderInt);
                return;
            }
            if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !recyclerView.mAdapter.hasStableIds()) {
                throw new IllegalArgumentException(t9c.a(recyclerView, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
            }
            childViewHolderInt.setScrapContainer(this, false);
            this.a.add(childViewHolderInt);
        }

        public final boolean n(@NonNull e0 e0Var, int i, int i2, long j) {
            e0Var.mBindingAdapter = null;
            RecyclerView recyclerView = RecyclerView.this;
            e0Var.mOwnerRecyclerView = recyclerView;
            int itemViewType = e0Var.getItemViewType();
            long nanoTime = recyclerView.getNanoTime();
            boolean z = false;
            if (j != Long.MAX_VALUE && !this.g.willBindInTime(itemViewType, nanoTime, j)) {
                return false;
            }
            if (e0Var.isTmpDetached()) {
                recyclerView.attachViewToParent(e0Var.itemView, recyclerView.getChildCount(), e0Var.itemView.getLayoutParams());
                z = true;
            }
            recyclerView.mAdapter.bindViewHolder(e0Var, i);
            if (z) {
                recyclerView.detachViewFromParent(e0Var.itemView);
            }
            this.g.factorInBindTime(e0Var.getItemViewType(), recyclerView.getNanoTime() - nanoTime);
            if (recyclerView.isAccessibilityEnabled()) {
                View view = e0Var.itemView;
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                if (view.getImportantForAccessibility() == 0) {
                    view.setImportantForAccessibility(1);
                }
                l0 l0Var = recyclerView.mAccessibilityDelegate;
                if (l0Var != null) {
                    hk itemDelegate = l0Var.getItemDelegate();
                    if (itemDelegate instanceof l0.a) {
                        ((l0.a) itemDelegate).saveOriginalDelegate(view);
                    }
                    iut0.q(view, itemDelegate);
                }
            }
            if (recyclerView.mState.g) {
                e0Var.mPreLayoutPosition = i2;
            }
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:129:0x0231  */
        /* JADX WARN: Removed duplicated region for block: B:184:0x038a  */
        /* JADX WARN: Removed duplicated region for block: B:193:0x03f6  */
        /* JADX WARN: Removed duplicated region for block: B:196:0x041a A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:201:0x0402  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:240:0x036e  */
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final e0 o(int i, long j) {
            e0 e0Var;
            boolean z;
            boolean z2;
            boolean z3;
            e0 e0Var2;
            boolean n;
            ViewGroup.LayoutParams layoutParams;
            p pVar;
            RecyclerView findNestedRecyclerView;
            View view;
            e0 e0Var3;
            boolean z4;
            int size;
            int f;
            RecyclerView recyclerView = RecyclerView.this;
            if (i < 0 || i >= recyclerView.mState.b()) {
                StringBuilder a = odj.a(i, i, "Invalid item position ", "(", "). Item count:");
                a.append(recyclerView.mState.b());
                a.append(recyclerView.exceptionLabel());
                throw new IndexOutOfBoundsException(a.toString());
            }
            boolean z5 = true;
            if (recyclerView.mState.g) {
                ArrayList<e0> arrayList = this.b;
                if (arrayList != null && (size = arrayList.size()) != 0) {
                    int i2 = 0;
                    while (true) {
                        if (i2 < size) {
                            e0Var = this.b.get(i2);
                            if (!e0Var.wasReturnedFromScrap() && e0Var.getLayoutPosition() == i) {
                                e0Var.addFlags(32);
                                break;
                            }
                            i2++;
                        } else if (recyclerView.mAdapter.hasStableIds() && (f = recyclerView.mAdapterHelper.f(i, 0)) > 0 && f < recyclerView.mAdapter.getItemCount()) {
                            long itemId = recyclerView.mAdapter.getItemId(f);
                            for (int i3 = 0; i3 < size; i3++) {
                                e0 e0Var4 = this.b.get(i3);
                                if (!e0Var4.wasReturnedFromScrap() && e0Var4.getItemId() == itemId) {
                                    e0Var4.addFlags(32);
                                    e0Var = e0Var4;
                                    break;
                                }
                            }
                        }
                    }
                    if (e0Var != null) {
                        z = true;
                        ArrayList<e0> arrayList2 = this.a;
                        ArrayList<e0> arrayList3 = this.c;
                        if (e0Var == null) {
                            int size2 = arrayList2.size();
                            for (int i4 = 0; i4 < size2; i4++) {
                                e0Var3 = arrayList2.get(i4);
                                if (!e0Var3.wasReturnedFromScrap() && e0Var3.getLayoutPosition() == i && !e0Var3.isInvalid() && (recyclerView.mState.g || !e0Var3.isRemoved())) {
                                    e0Var3.addFlags(32);
                                    break;
                                }
                            }
                            ArrayList arrayList4 = recyclerView.mChildHelper.c;
                            int size3 = arrayList4.size();
                            int i5 = 0;
                            while (true) {
                                if (i5 >= size3) {
                                    view = null;
                                    break;
                                }
                                view = (View) arrayList4.get(i5);
                                e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                                if (childViewHolderInt.getLayoutPosition() == i && !childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved()) {
                                    break;
                                }
                                i5++;
                            }
                            if (view != null) {
                                e0Var = RecyclerView.getChildViewHolderInt(view);
                                androidx.recyclerview.widget.e eVar = recyclerView.mChildHelper;
                                e.a aVar = eVar.b;
                                int indexOfChild = RecyclerView.this.indexOfChild(view);
                                if (indexOfChild < 0) {
                                    throw new IllegalArgumentException("view is not a child, cannot hide " + view);
                                }
                                if (!aVar.d(indexOfChild)) {
                                    throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                                }
                                aVar.a(indexOfChild);
                                eVar.l(view);
                                int j2 = recyclerView.mChildHelper.j(view);
                                if (j2 == -1) {
                                    StringBuilder sb = new StringBuilder("layout index should not be -1 after unhiding a view:");
                                    sb.append(e0Var);
                                    throw new IllegalStateException(t9c.a(recyclerView, sb));
                                }
                                recyclerView.mChildHelper.c(j2);
                                m(view);
                                e0Var.addFlags(8224);
                            } else {
                                int size4 = arrayList3.size();
                                for (int i6 = 0; i6 < size4; i6++) {
                                    e0Var3 = arrayList3.get(i6);
                                    if (!e0Var3.isInvalid() && e0Var3.getLayoutPosition() == i && !e0Var3.isAttachedToTransitionOverlay()) {
                                        arrayList3.remove(i6);
                                        if (RecyclerView.sVerboseLoggingEnabled) {
                                            e0Var3.toString();
                                        }
                                        e0Var = e0Var3;
                                    }
                                }
                                e0Var = null;
                            }
                            if (e0Var != null) {
                                if (!e0Var.isRemoved()) {
                                    int i7 = e0Var.mPosition;
                                    if (i7 < 0 || i7 >= recyclerView.mAdapter.getItemCount()) {
                                        StringBuilder sb2 = new StringBuilder("Inconsistency detected. Invalid view holder adapter position");
                                        sb2.append(e0Var);
                                        throw new IndexOutOfBoundsException(t9c.a(recyclerView, sb2));
                                    }
                                    z4 = (recyclerView.mState.g || recyclerView.mAdapter.getItemViewType(e0Var.mPosition) == e0Var.getItemViewType()) && (!recyclerView.mAdapter.hasStableIds() || e0Var.getItemId() == recyclerView.mAdapter.getItemId(e0Var.mPosition));
                                } else {
                                    if (RecyclerView.sDebugAssertionsEnabled && !recyclerView.mState.g) {
                                        throw new IllegalStateException(t9c.a(recyclerView, new StringBuilder("should not receive a removed view unless it is pre layout")));
                                    }
                                    z4 = recyclerView.mState.g;
                                }
                                if (z4) {
                                    z = true;
                                } else {
                                    e0Var.addFlags(4);
                                    if (e0Var.isScrap()) {
                                        recyclerView.removeDetachedView(e0Var.itemView, false);
                                        e0Var.unScrap();
                                    } else if (e0Var.wasReturnedFromScrap()) {
                                        e0Var.clearReturnedFromScrapFlag();
                                    }
                                    l(e0Var);
                                    e0Var = null;
                                }
                            }
                        }
                        if (e0Var != null) {
                            int f2 = recyclerView.mAdapterHelper.f(i, 0);
                            if (f2 < 0 || f2 >= recyclerView.mAdapter.getItemCount()) {
                                StringBuilder a2 = odj.a(i, f2, "Inconsistency detected. Invalid item position ", "(offset:", ").state:");
                                a2.append(recyclerView.mState.b());
                                a2.append(recyclerView.exceptionLabel());
                                throw new IndexOutOfBoundsException(a2.toString());
                            }
                            int itemViewType = recyclerView.mAdapter.getItemViewType(f2);
                            if (recyclerView.mAdapter.hasStableIds()) {
                                long itemId2 = recyclerView.mAdapter.getItemId(f2);
                                int size5 = arrayList2.size() - 1;
                                while (true) {
                                    if (size5 >= 0) {
                                        e0 e0Var5 = arrayList2.get(size5);
                                        if (e0Var5.getItemId() != itemId2 || e0Var5.wasReturnedFromScrap()) {
                                            z2 = z5;
                                        } else {
                                            z2 = z5;
                                            if (itemViewType == e0Var5.getItemViewType()) {
                                                e0Var5.addFlags(32);
                                                if (e0Var5.isRemoved() && !recyclerView.mState.g) {
                                                    e0Var5.setFlags(2, 14);
                                                }
                                                e0Var = e0Var5;
                                            } else {
                                                arrayList2.remove(size5);
                                                recyclerView.removeDetachedView(e0Var5.itemView, false);
                                                e0 childViewHolderInt2 = RecyclerView.getChildViewHolderInt(e0Var5.itemView);
                                                childViewHolderInt2.mScrapContainer = null;
                                                childViewHolderInt2.mInChangeScrap = false;
                                                childViewHolderInt2.clearReturnedFromScrapFlag();
                                                l(childViewHolderInt2);
                                            }
                                        }
                                        size5--;
                                        z5 = z2;
                                    } else {
                                        z2 = z5;
                                        int size6 = arrayList3.size() - 1;
                                        while (true) {
                                            if (size6 < 0) {
                                                break;
                                            }
                                            e0 e0Var6 = arrayList3.get(size6);
                                            if (e0Var6.getItemId() != itemId2 || e0Var6.isAttachedToTransitionOverlay()) {
                                                size6--;
                                            } else if (itemViewType == e0Var6.getItemViewType()) {
                                                arrayList3.remove(size6);
                                                e0Var = e0Var6;
                                            } else {
                                                j(size6);
                                            }
                                        }
                                        e0Var = null;
                                    }
                                }
                                if (e0Var != null) {
                                    e0Var.mPosition = f2;
                                    z = z2;
                                }
                            } else {
                                z2 = true;
                            }
                            if (e0Var == null) {
                                boolean z6 = RecyclerView.sDebugAssertionsEnabled;
                                e0 recycledView = e().getRecycledView(itemViewType);
                                if (recycledView != null) {
                                    recycledView.resetInternal();
                                    if (RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST) {
                                        View view2 = recycledView.itemView;
                                        if (view2 instanceof ViewGroup) {
                                            g((ViewGroup) view2, false);
                                        }
                                    }
                                }
                                e0Var = recycledView;
                            }
                            if (e0Var == null) {
                                long nanoTime = recyclerView.getNanoTime();
                                if (j != Long.MAX_VALUE && !this.g.willCreateInTime(itemViewType, nanoTime, j)) {
                                    return null;
                                }
                                e0Var = recyclerView.mAdapter.createViewHolder(recyclerView, itemViewType);
                                if (RecyclerView.ALLOW_THREAD_GAP_WORK && (findNestedRecyclerView = RecyclerView.findNestedRecyclerView(e0Var.itemView)) != null) {
                                    e0Var.mNestedRecyclerView = new WeakReference<>(findNestedRecyclerView);
                                }
                                this.g.factorInCreateTime(itemViewType, recyclerView.getNanoTime() - nanoTime);
                            }
                        } else {
                            z2 = true;
                        }
                        z3 = z;
                        e0Var2 = e0Var;
                        if (z3 && !recyclerView.mState.g && e0Var2.hasAnyOfTheFlags(8192)) {
                            e0Var2.setFlags(0, 8192);
                            if (recyclerView.mState.j) {
                                recyclerView.recordAnimationInfoIfBouncedHiddenView(e0Var2, recyclerView.mItemAnimator.q(recyclerView.mState, e0Var2, l.e(e0Var2) | 4096, e0Var2.getUnmodifiedPayloads()));
                            }
                        }
                        if (!recyclerView.mState.g && e0Var2.isBound()) {
                            e0Var2.mPreLayoutPosition = i;
                        } else if (e0Var2.isBound() || e0Var2.needsUpdate() || e0Var2.isInvalid()) {
                            if (!RecyclerView.sDebugAssertionsEnabled && e0Var2.isRemoved()) {
                                StringBuilder sb3 = new StringBuilder("Removed holder should be bound and it should come here only in pre-layout. Holder: ");
                                sb3.append(e0Var2);
                                throw new IllegalStateException(t9c.a(recyclerView, sb3));
                            }
                            n = n(e0Var2, recyclerView.mAdapterHelper.f(i, 0), i, j);
                            layoutParams = e0Var2.itemView.getLayoutParams();
                            if (layoutParams == null) {
                                pVar = (p) recyclerView.generateDefaultLayoutParams();
                                e0Var2.itemView.setLayoutParams(pVar);
                            } else if (recyclerView.checkLayoutParams(layoutParams)) {
                                pVar = (p) layoutParams;
                            } else {
                                pVar = (p) recyclerView.generateLayoutParams(layoutParams);
                                e0Var2.itemView.setLayoutParams(pVar);
                            }
                            pVar.b = e0Var2;
                            pVar.e = (z3 || !n) ? false : z2;
                            return e0Var2;
                        }
                        n = false;
                        layoutParams = e0Var2.itemView.getLayoutParams();
                        if (layoutParams == null) {
                        }
                        pVar.b = e0Var2;
                        pVar.e = (z3 || !n) ? false : z2;
                        return e0Var2;
                    }
                }
                e0Var = null;
                if (e0Var != null) {
                }
            } else {
                e0Var = null;
            }
            z = false;
            ArrayList<e0> arrayList22 = this.a;
            ArrayList<e0> arrayList32 = this.c;
            if (e0Var == null) {
            }
            if (e0Var != null) {
            }
            z3 = z;
            e0Var2 = e0Var;
            if (z3) {
                e0Var2.setFlags(0, 8192);
                if (recyclerView.mState.j) {
                }
            }
            if (!recyclerView.mState.g) {
            }
            if (e0Var2.isBound()) {
            }
            if (!RecyclerView.sDebugAssertionsEnabled) {
            }
            n = n(e0Var2, recyclerView.mAdapterHelper.f(i, 0), i, j);
            layoutParams = e0Var2.itemView.getLayoutParams();
            if (layoutParams == null) {
            }
            pVar.b = e0Var2;
            pVar.e = (z3 || !n) ? false : z2;
            return e0Var2;
        }

        public final void p(e0 e0Var) {
            if (e0Var.mInChangeScrap) {
                this.b.remove(e0Var);
            } else {
                this.a.remove(e0Var);
            }
            e0Var.mScrapContainer = null;
            e0Var.mInChangeScrap = false;
            e0Var.clearReturnedFromScrapFlag();
        }

        public final void q() {
            o oVar = RecyclerView.this.mLayout;
            this.f = this.e + (oVar != null ? oVar.mPrefetchMaxCountObserved : 0);
            ArrayList<e0> arrayList = this.c;
            for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f; size--) {
                j(size);
            }
        }
    }

    /* loaded from: classes12.dex */
    public interface w {
        void b(@NonNull e0 e0Var);
    }

    public class x extends i {
        public x() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void b() {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.assertNotInLayoutOrScroll(null);
            recyclerView.mState.f = true;
            recyclerView.processDataSetCompletelyChanged(true);
            if (recyclerView.mAdapterHelper.g()) {
                return;
            }
            recyclerView.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void d(int i, int i2, Object obj) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.assertNotInLayoutOrScroll(null);
            androidx.recyclerview.widget.a aVar = recyclerView.mAdapterHelper;
            ArrayList<a.C0080a> arrayList = aVar.b;
            if (i2 < 1) {
                return;
            }
            arrayList.add(aVar.h(4, i, i2, obj));
            aVar.f |= 4;
            if (arrayList.size() == 1) {
                i();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void e(int i, int i2) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.assertNotInLayoutOrScroll(null);
            androidx.recyclerview.widget.a aVar = recyclerView.mAdapterHelper;
            ArrayList<a.C0080a> arrayList = aVar.b;
            if (i2 < 1) {
                return;
            }
            arrayList.add(aVar.h(1, i, i2, null));
            aVar.f |= 1;
            if (arrayList.size() == 1) {
                i();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void f(int i, int i2) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.assertNotInLayoutOrScroll(null);
            androidx.recyclerview.widget.a aVar = recyclerView.mAdapterHelper;
            ArrayList<a.C0080a> arrayList = aVar.b;
            if (i == i2) {
                return;
            }
            arrayList.add(aVar.h(8, i, i2, null));
            aVar.f |= 8;
            if (arrayList.size() == 1) {
                i();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void g(int i, int i2) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.assertNotInLayoutOrScroll(null);
            androidx.recyclerview.widget.a aVar = recyclerView.mAdapterHelper;
            ArrayList<a.C0080a> arrayList = aVar.b;
            if (i2 < 1) {
                return;
            }
            arrayList.add(aVar.h(2, i, i2, null));
            aVar.f |= 2;
            if (arrayList.size() == 1) {
                i();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void h() {
            Adapter adapter;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mPendingSavedState == null || (adapter = recyclerView.mAdapter) == null || !adapter.canRestoreState()) {
                return;
            }
            recyclerView.requestLayout();
        }

        public final void i() {
            boolean z = RecyclerView.POST_UPDATES_ON_ANIMATION;
            RecyclerView recyclerView = RecyclerView.this;
            if (!z || !recyclerView.mHasFixedSize || !recyclerView.mIsAttached) {
                recyclerView.mAdapterUpdateDuringMeasure = true;
                recyclerView.requestLayout();
            } else {
                Runnable runnable = recyclerView.mUpdateChildViewsRunnable;
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                recyclerView.postOnAnimation(runnable);
            }
        }
    }

    public static abstract class z {
        private o mLayoutManager;
        private boolean mPendingInitialRun;
        private RecyclerView mRecyclerView;
        private final a mRecyclingAction;
        private boolean mRunning;
        private boolean mStarted;
        private int mTargetPosition = -1;
        private View mTargetView;

        public static class a {
            public int a;
            public int b;
            public int c;
            public int d;
            public Interpolator e;
            public boolean f;
            public int g;

            public final void a(RecyclerView recyclerView) {
                int i = this.d;
                if (i >= 0) {
                    this.d = -1;
                    recyclerView.jumpToPositionForSmoothScroller(i);
                    this.f = false;
                    return;
                }
                if (!this.f) {
                    this.g = 0;
                    return;
                }
                Interpolator interpolator = this.e;
                if (interpolator != null && this.c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                int i2 = this.c;
                if (i2 < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
                recyclerView.mViewFlinger.c(this.a, this.b, interpolator, i2);
                int i3 = this.g + 1;
                this.g = i3;
                if (i3 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f = false;
            }

            public final void b(int i, int i2, @Nullable Interpolator interpolator, int i3) {
                this.a = i;
                this.b = i2;
                this.c = i3;
                this.e = interpolator;
                this.f = true;
            }
        }

        public interface b {
            @Nullable
            PointF computeScrollVectorForPosition(int i);
        }

        public z() {
            a aVar = new a();
            aVar.d = -1;
            aVar.f = false;
            aVar.g = 0;
            aVar.a = 0;
            aVar.b = 0;
            aVar.c = Integer.MIN_VALUE;
            aVar.e = null;
            this.mRecyclingAction = aVar;
        }

        @Nullable
        public PointF computeScrollVectorForPosition(int i) {
            Object layoutManager = getLayoutManager();
            if (layoutManager instanceof b) {
                return ((b) layoutManager).computeScrollVectorForPosition(i);
            }
            return null;
        }

        public View findViewByPosition(int i) {
            return this.mRecyclerView.mLayout.findViewByPosition(i);
        }

        public int getChildCount() {
            return this.mRecyclerView.mLayout.getChildCount();
        }

        public int getChildPosition(View view) {
            return this.mRecyclerView.getChildLayoutPosition(view);
        }

        @Nullable
        public o getLayoutManager() {
            return this.mLayoutManager;
        }

        public int getTargetPosition() {
            return this.mTargetPosition;
        }

        public boolean isPendingInitialRun() {
            return this.mPendingInitialRun;
        }

        public boolean isRunning() {
            return this.mRunning;
        }

        public void normalize(@NonNull PointF pointF) {
            float f = pointF.x;
            float f2 = pointF.y;
            float sqrt = (float) Math.sqrt((f2 * f2) + (f * f));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        public void onAnimation(int i, int i2) {
            PointF computeScrollVectorForPosition;
            RecyclerView recyclerView = this.mRecyclerView;
            if (this.mTargetPosition == -1 || recyclerView == null) {
                stop();
            }
            if (this.mPendingInitialRun && this.mTargetView == null && this.mLayoutManager != null && (computeScrollVectorForPosition = computeScrollVectorForPosition(this.mTargetPosition)) != null) {
                float f = computeScrollVectorForPosition.x;
                if (f != 0.0f || computeScrollVectorForPosition.y != 0.0f) {
                    recyclerView.scrollStep((int) Math.signum(f), (int) Math.signum(computeScrollVectorForPosition.y), null);
                }
            }
            this.mPendingInitialRun = false;
            View view = this.mTargetView;
            if (view != null) {
                if (getChildPosition(view) == this.mTargetPosition) {
                    onTargetFound(this.mTargetView, recyclerView.mState, this.mRecyclingAction);
                    this.mRecyclingAction.a(recyclerView);
                    stop();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.mTargetView = null;
                }
            }
            if (this.mRunning) {
                onSeekTargetStep(i, i2, recyclerView.mState, this.mRecyclingAction);
                a aVar = this.mRecyclingAction;
                boolean z = aVar.d >= 0;
                aVar.a(recyclerView);
                if (z && this.mRunning) {
                    this.mPendingInitialRun = true;
                    recyclerView.mViewFlinger.b();
                }
            }
        }

        public void onChildAttachedToWindow(View view) {
            if (getChildPosition(view) == getTargetPosition()) {
                this.mTargetView = view;
                boolean z = RecyclerView.sDebugAssertionsEnabled;
            }
        }

        public abstract void onSeekTargetStep(int i, int i2, @NonNull a0 a0Var, @NonNull a aVar);

        public abstract void onStart();

        public abstract void onStop();

        public abstract void onTargetFound(@NonNull View view, @NonNull a0 a0Var, @NonNull a aVar);

        public void setTargetPosition(int i) {
            this.mTargetPosition = i;
        }

        public void start(RecyclerView recyclerView, o oVar) {
            d0 d0Var = recyclerView.mViewFlinger;
            RecyclerView.this.removeCallbacks(d0Var);
            d0Var.d.abortAnimation();
            this.mRecyclerView = recyclerView;
            this.mLayoutManager = oVar;
            int i = this.mTargetPosition;
            if (i == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.mState.a = i;
            this.mRunning = true;
            this.mPendingInitialRun = true;
            this.mTargetView = findViewByPosition(getTargetPosition());
            onStart();
            this.mRecyclerView.mViewFlinger.b();
            this.mStarted = true;
        }

        public final void stop() {
            if (this.mRunning) {
                this.mRunning = false;
                onStop();
                this.mRecyclerView.mState.a = -1;
                this.mTargetView = null;
                this.mTargetPosition = -1;
                this.mPendingInitialRun = false;
                this.mLayoutManager.onSmoothScrollerStopped(this);
                this.mLayoutManager = null;
                this.mRecyclerView = null;
            }
        }
    }

    static {
        Class cls = Integer.TYPE;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, cls, cls};
        sQuinticInterpolator = new c();
        sDefaultEdgeEffectFactory = new b0();
    }

    public RecyclerView(@NonNull Context context) {
        this(context, null);
    }

    private void addAnimatingView(e0 e0Var) {
        View view = e0Var.itemView;
        boolean z2 = view.getParent() == this;
        this.mRecycler.p(getChildViewHolder(view));
        if (e0Var.isTmpDetached()) {
            this.mChildHelper.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z2) {
            this.mChildHelper.a(view, -1, true);
            return;
        }
        androidx.recyclerview.widget.e eVar = this.mChildHelper;
        int indexOfChild = RecyclerView.this.indexOfChild(view);
        if (indexOfChild >= 0) {
            eVar.b.h(indexOfChild);
            eVar.i(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    private void animateChange(@NonNull e0 e0Var, @NonNull e0 e0Var2, @NonNull l.c cVar, @NonNull l.c cVar2, boolean z2, boolean z3) {
        e0Var.setIsRecyclable(false);
        if (z2) {
            addAnimatingView(e0Var);
        }
        if (e0Var != e0Var2) {
            if (z3) {
                addAnimatingView(e0Var2);
            }
            e0Var.mShadowedHolder = e0Var2;
            addAnimatingView(e0Var);
            this.mRecycler.p(e0Var);
            e0Var2.setIsRecyclable(false);
            e0Var2.mShadowingHolder = e0Var;
        }
        if (this.mItemAnimator.b(e0Var, e0Var2, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    private void cancelScroll() {
        resetScroll();
        setScrollState(0);
    }

    public static void clearNestedRecyclerViewIfNotNested(@NonNull e0 e0Var) {
        WeakReference<RecyclerView> weakReference = e0Var.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == e0Var.itemView) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            e0Var.mNestedRecyclerView = null;
        }
    }

    private int consumeFlingInStretch(int i2, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i3) {
        if (i2 > 0 && edgeEffect != null && fyo.a(edgeEffect) != 0.0f) {
            int round = Math.round(fyo.b(edgeEffect, ((-i2) * 4.0f) / i3, 0.5f) * ((-i3) / 4.0f));
            if (round != i2) {
                edgeEffect.finish();
            }
            return i2 - round;
        }
        if (i2 >= 0 || edgeEffect2 == null || fyo.a(edgeEffect2) == 0.0f) {
            return i2;
        }
        float f2 = i3;
        int round2 = Math.round(fyo.b(edgeEffect2, (i2 * 4.0f) / f2, 0.5f) * (f2 / 4.0f));
        if (round2 != i2) {
            edgeEffect2.finish();
        }
        return i2 - round2;
    }

    private void createLayoutManager(Context context, String str, AttributeSet attributeSet, int i2, int i3) {
        Object[] objArr;
        Constructor constructor;
        if (str != null) {
            String trim = str.trim();
            if (trim.isEmpty()) {
                return;
            }
            String fullClassName = getFullClassName(context, trim);
            try {
                Class<? extends U> asSubclass = Class.forName(fullClassName, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(o.class);
                try {
                    constructor = asSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i2), Integer.valueOf(i3)};
                } catch (NoSuchMethodException e2) {
                    objArr = null;
                    try {
                        constructor = asSubclass.getConstructor(null);
                    } catch (NoSuchMethodException e3) {
                        e3.initCause(e2);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + fullClassName, e3);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((o) constructor.newInstance(objArr));
            } catch (ClassCastException e4) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + fullClassName, e4);
            } catch (ClassNotFoundException e5) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + fullClassName, e5);
            } catch (IllegalAccessException e6) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + fullClassName, e6);
            } catch (InstantiationException e7) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e8);
            }
        }
    }

    private boolean didChildRangeChange(int i2, int i3) {
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        return (iArr[0] == i2 && iArr[1] == i3) ? false : true;
    }

    private void dispatchContentChangedIfNecessary() {
        int i2 = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i2 == 0 || !isAccessibilityEnabled()) {
            return;
        }
        AccessibilityEvent obtain = AccessibilityEvent.obtain();
        obtain.setEventType(2048);
        jk.b(i2, obtain);
        sendAccessibilityEventUnchecked(obtain);
    }

    private void dispatchLayoutStep1() {
        r0.a aVar;
        this.mState.a(1);
        fillRemainingScrollValues(this.mState);
        this.mState.i = false;
        startInterceptRequestLayout();
        r0 r0Var = this.mViewInfoStore;
        r0Var.a.clear();
        r0Var.b.clear();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        a0 a0Var = this.mState;
        a0Var.h = a0Var.j && this.mItemsChanged;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        a0Var.g = a0Var.k;
        a0Var.e = this.mAdapter.getItemCount();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.j) {
            int e2 = this.mChildHelper.e();
            for (int i2 = 0; i2 < e2; i2++) {
                e0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i2));
                if (!childViewHolderInt.shouldIgnore() && (!childViewHolderInt.isInvalid() || this.mAdapter.hasStableIds())) {
                    l.c q2 = this.mItemAnimator.q(this.mState, childViewHolderInt, l.e(childViewHolderInt), childViewHolderInt.getUnmodifiedPayloads());
                    dpj0<e0, r0.a> dpj0Var = this.mViewInfoStore.a;
                    r0.a aVar2 = dpj0Var.get(childViewHolderInt);
                    if (aVar2 == null) {
                        aVar2 = r0.a.b();
                        dpj0Var.put(childViewHolderInt, aVar2);
                    }
                    aVar2.b = q2;
                    aVar2.a |= 4;
                    if (this.mState.h && childViewHolderInt.isUpdated() && !childViewHolderInt.isRemoved() && !childViewHolderInt.shouldIgnore() && !childViewHolderInt.isInvalid()) {
                        this.mViewInfoStore.b.put(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.k) {
            saveOldPositions();
            a0 a0Var2 = this.mState;
            boolean z2 = a0Var2.f;
            a0Var2.f = false;
            this.mLayout.onLayoutChildren(this.mRecycler, a0Var2);
            this.mState.f = z2;
            for (int i3 = 0; i3 < this.mChildHelper.e(); i3++) {
                e0 childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.d(i3));
                if (!childViewHolderInt2.shouldIgnore() && ((aVar = this.mViewInfoStore.a.get(childViewHolderInt2)) == null || (aVar.a & 4) == 0)) {
                    int e3 = l.e(childViewHolderInt2);
                    boolean hasAnyOfTheFlags = childViewHolderInt2.hasAnyOfTheFlags(8192);
                    if (!hasAnyOfTheFlags) {
                        e3 |= 4096;
                    }
                    l.c q3 = this.mItemAnimator.q(this.mState, childViewHolderInt2, e3, childViewHolderInt2.getUnmodifiedPayloads());
                    if (hasAnyOfTheFlags) {
                        recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, q3);
                    } else {
                        dpj0<e0, r0.a> dpj0Var2 = this.mViewInfoStore.a;
                        r0.a aVar3 = dpj0Var2.get(childViewHolderInt2);
                        if (aVar3 == null) {
                            aVar3 = r0.a.b();
                            dpj0Var2.put(childViewHolderInt2, aVar3);
                        }
                        aVar3.a |= 2;
                        aVar3.b = q3;
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.d = 2;
    }

    private void dispatchLayoutStep2() {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.a(6);
        this.mAdapterHelper.c();
        this.mState.e = this.mAdapter.getItemCount();
        this.mState.c = 0;
        if (this.mPendingSavedState != null && this.mAdapter.canRestoreState()) {
            Parcelable parcelable = this.mPendingSavedState.d;
            if (parcelable != null) {
                this.mLayout.onRestoreInstanceState(parcelable);
            }
            this.mPendingSavedState = null;
        }
        a0 a0Var = this.mState;
        a0Var.g = false;
        this.mLayout.onLayoutChildren(this.mRecycler, a0Var);
        a0 a0Var2 = this.mState;
        a0Var2.f = false;
        a0Var2.j = a0Var2.j && this.mItemAnimator != null;
        a0Var2.d = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    private void dispatchLayoutStep3() {
        RecyclerView recyclerView;
        this.mState.a(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        a0 a0Var = this.mState;
        a0Var.d = 1;
        if (a0Var.j) {
            for (int e2 = this.mChildHelper.e() - 1; e2 >= 0; e2--) {
                e0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(e2));
                if (!childViewHolderInt.shouldIgnore()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    this.mItemAnimator.getClass();
                    l.c cVar = new l.c();
                    cVar.a(childViewHolderInt);
                    e0 e0Var = this.mViewInfoStore.b.get(changedHolderKey);
                    if (e0Var == null || e0Var.shouldIgnore()) {
                        this.mViewInfoStore.a(childViewHolderInt, cVar);
                    } else {
                        r0.a aVar = this.mViewInfoStore.a.get(e0Var);
                        boolean z2 = (aVar == null || (aVar.a & 1) == 0) ? false : true;
                        r0.a aVar2 = this.mViewInfoStore.a.get(childViewHolderInt);
                        boolean z3 = (aVar2 == null || (aVar2.a & 1) == 0) ? false : true;
                        if (z2 && e0Var == childViewHolderInt) {
                            this.mViewInfoStore.a(childViewHolderInt, cVar);
                        } else {
                            l.c b2 = this.mViewInfoStore.b(e0Var, 4);
                            this.mViewInfoStore.a(childViewHolderInt, cVar);
                            l.c b3 = this.mViewInfoStore.b(childViewHolderInt, 8);
                            if (b2 == null) {
                                handleMissingPreInfoForChangeError(changedHolderKey, childViewHolderInt, e0Var);
                            } else {
                                animateChange(e0Var, childViewHolderInt, b2, b3, z2, z3);
                            }
                        }
                    }
                }
            }
            recyclerView = this;
            r0 r0Var = recyclerView.mViewInfoStore;
            r0.b bVar = recyclerView.mViewInfoProcessCallback;
            dpj0<e0, r0.a> dpj0Var = r0Var.a;
            for (int i2 = dpj0Var.d - 1; i2 >= 0; i2--) {
                e0 f2 = dpj0Var.f(i2);
                r0.a h2 = dpj0Var.h(i2);
                int i3 = h2.a;
                if ((i3 & 3) == 3) {
                    RecyclerView recyclerView2 = RecyclerView.this;
                    recyclerView2.mLayout.removeAndRecycleView(f2.itemView, recyclerView2.mRecycler);
                } else if ((i3 & 1) != 0) {
                    l.c cVar2 = h2.b;
                    if (cVar2 == null) {
                        RecyclerView recyclerView3 = RecyclerView.this;
                        recyclerView3.mLayout.removeAndRecycleView(f2.itemView, recyclerView3.mRecycler);
                    } else {
                        l.c cVar3 = h2.c;
                        RecyclerView recyclerView4 = RecyclerView.this;
                        recyclerView4.mRecycler.p(f2);
                        recyclerView4.animateDisappearance(f2, cVar2, cVar3);
                    }
                } else if ((i3 & 14) == 14) {
                    RecyclerView.this.animateAppearance(f2, h2.b, h2.c);
                } else if ((i3 & 12) == 12) {
                    l.c cVar4 = h2.b;
                    l.c cVar5 = h2.c;
                    d dVar = (d) bVar;
                    dVar.getClass();
                    f2.setIsRecyclable(false);
                    RecyclerView recyclerView5 = RecyclerView.this;
                    if (recyclerView5.mDataSetHasChangedAfterLayout) {
                        if (recyclerView5.mItemAnimator.b(f2, f2, cVar4, cVar5)) {
                            recyclerView5.postAnimationRunner();
                        }
                    } else if (recyclerView5.mItemAnimator.d(f2, cVar4, cVar5)) {
                        recyclerView5.postAnimationRunner();
                    }
                } else if ((i3 & 4) != 0) {
                    l.c cVar6 = h2.b;
                    RecyclerView recyclerView6 = RecyclerView.this;
                    recyclerView6.mRecycler.p(f2);
                    recyclerView6.animateDisappearance(f2, cVar6, null);
                } else if ((i3 & 8) != 0) {
                    RecyclerView.this.animateAppearance(f2, h2.b, h2.c);
                }
                r0.a.c(h2);
            }
        } else {
            recyclerView = this;
        }
        recyclerView.mLayout.removeAndRecycleScrapInt(recyclerView.mRecycler);
        a0 a0Var2 = recyclerView.mState;
        a0Var2.b = a0Var2.e;
        recyclerView.mDataSetHasChangedAfterLayout = false;
        recyclerView.mDispatchItemsChangedEvent = false;
        a0Var2.j = false;
        a0Var2.k = false;
        recyclerView.mLayout.mRequestedSimpleAnimations = false;
        ArrayList<e0> arrayList = recyclerView.mRecycler.b;
        if (arrayList != null) {
            arrayList.clear();
        }
        o oVar = recyclerView.mLayout;
        if (oVar.mPrefetchMaxObservedInInitialPrefetch) {
            oVar.mPrefetchMaxCountObserved = 0;
            oVar.mPrefetchMaxObservedInInitialPrefetch = false;
            recyclerView.mRecycler.q();
        }
        recyclerView.mLayout.onLayoutCompleted(recyclerView.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        r0 r0Var2 = recyclerView.mViewInfoStore;
        r0Var2.a.clear();
        r0Var2.b.clear();
        int[] iArr = recyclerView.mMinMaxLayoutPositions;
        if (didChildRangeChange(iArr[0], iArr[1])) {
            dispatchOnScrolled(0, 0);
        }
        recoverFocusFromState();
        resetFocusInfo();
    }

    private boolean dispatchToOnItemTouchListeners(MotionEvent motionEvent) {
        s sVar = this.mInterceptingOnItemTouchListener;
        if (sVar == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return findInterceptingOnItemTouchListener(motionEvent);
        }
        sVar.f(this, motionEvent);
        int action = motionEvent.getAction();
        if (action != 3 && action != 1) {
            return true;
        }
        this.mInterceptingOnItemTouchListener = null;
        return true;
    }

    private boolean findInterceptingOnItemTouchListener(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        for (int i2 = 0; i2 < size; i2++) {
            s sVar = this.mOnItemTouchListeners.get(i2);
            if (sVar.j(this, motionEvent) && action != 3) {
                this.mInterceptingOnItemTouchListener = sVar;
                return true;
            }
        }
        return false;
    }

    private void findMinMaxChildLayoutPositions(int[] iArr) {
        int e2 = this.mChildHelper.e();
        if (e2 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MIN_VALUE;
        for (int i4 = 0; i4 < e2; i4++) {
            e0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i4));
            if (!childViewHolderInt.shouldIgnore()) {
                int layoutPosition = childViewHolderInt.getLayoutPosition();
                if (layoutPosition < i2) {
                    i2 = layoutPosition;
                }
                if (layoutPosition > i3) {
                    i3 = layoutPosition;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i3;
    }

    @Nullable
    public static RecyclerView findNestedRecyclerView(@NonNull View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            RecyclerView findNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i2));
            if (findNestedRecyclerView != null) {
                return findNestedRecyclerView;
            }
        }
        return null;
    }

    @Nullable
    private View findNextViewToFocus() {
        e0 findViewHolderForAdapterPosition;
        a0 a0Var = this.mState;
        int i2 = a0Var.l;
        if (i2 == -1) {
            i2 = 0;
        }
        int b2 = a0Var.b();
        for (int i3 = i2; i3 < b2; i3++) {
            e0 findViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i3);
            if (findViewHolderForAdapterPosition2 == null) {
                break;
            }
            if (findViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                return findViewHolderForAdapterPosition2.itemView;
            }
        }
        int min = Math.min(b2, i2);
        do {
            min--;
            if (min < 0 || (findViewHolderForAdapterPosition = findViewHolderForAdapterPosition(min)) == null) {
                return null;
            }
        } while (!findViewHolderForAdapterPosition.itemView.hasFocusable());
        return findViewHolderForAdapterPosition.itemView;
    }

    public static e0 getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((p) view.getLayoutParams()).b;
    }

    public static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        p pVar = (p) view.getLayoutParams();
        Rect rect2 = pVar.c;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) pVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) pVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) pVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin);
    }

    private int getDeepestFocusedViewWithId(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    private String getFullClassName(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + JwtParser.SEPARATOR_CHAR + str;
    }

    private s160 getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new s160(this);
        }
        return this.mScrollingChildHelper;
    }

    private float getSplineFlingDistance(int i2) {
        double log = Math.log((Math.abs(i2) * 0.35f) / (this.mPhysicalCoef * 0.015f));
        float f2 = DECELERATION_RATE;
        return (float) (Math.exp((f2 / (f2 - 1.0d)) * log) * this.mPhysicalCoef * 0.015f);
    }

    private void handleMissingPreInfoForChangeError(long j2, e0 e0Var, e0 e0Var2) {
        int e2 = this.mChildHelper.e();
        for (int i2 = 0; i2 < e2; i2++) {
            e0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i2));
            if (childViewHolderInt != e0Var && getChangedHolderKey(childViewHolderInt) == j2) {
                Adapter adapter = this.mAdapter;
                if (adapter == null || !adapter.hasStableIds()) {
                    StringBuilder sb = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                    sb.append(childViewHolderInt);
                    sb.append(" \n View Holder 2:");
                    sb.append(e0Var);
                    throw new IllegalStateException(t9c.a(this, sb));
                }
                StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                sb2.append(childViewHolderInt);
                sb2.append(" \n View Holder 2:");
                sb2.append(e0Var);
                throw new IllegalStateException(t9c.a(this, sb2));
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + e0Var2 + " cannot be found but it is necessary for " + e0Var + exceptionLabel());
    }

    private boolean hasUpdatedView() {
        int e2 = this.mChildHelper.e();
        for (int i2 = 0; i2 < e2; i2++) {
            e0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i2));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"InlinedApi"})
    private void initAutofill() {
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        if (iut0.g.a(this) == 0) {
            iut0.g.b(this, 8);
        }
    }

    private void initChildrenHelper() {
        this.mChildHelper = new androidx.recyclerview.widget.e(new e());
    }

    private boolean isPreferredNextFocus(View view, View view2, int i2) {
        int i3;
        if (view2 == null || view2 == this || view2 == view || findContainingItemView(view2) == null) {
            return false;
        }
        if (view == null || findContainingItemView(view) == null) {
            return true;
        }
        this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
        this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        offsetDescendantRectToMyCoords(view2, this.mTempRect2);
        char c2 = 65535;
        int i4 = this.mLayout.getLayoutDirection() == 1 ? -1 : 1;
        Rect rect = this.mTempRect;
        int i5 = rect.left;
        Rect rect2 = this.mTempRect2;
        int i6 = rect2.left;
        if ((i5 < i6 || rect.right <= i6) && rect.right < rect2.right) {
            i3 = 1;
        } else {
            int i7 = rect.right;
            int i8 = rect2.right;
            i3 = ((i7 > i8 || i5 >= i8) && i5 > i6) ? -1 : 0;
        }
        int i9 = rect.top;
        int i10 = rect2.top;
        if ((i9 < i10 || rect.bottom <= i10) && rect.bottom < rect2.bottom) {
            c2 = 1;
        } else {
            int i11 = rect.bottom;
            int i12 = rect2.bottom;
            if ((i11 <= i12 && i9 < i12) || i9 <= i10) {
                c2 = 0;
            }
        }
        if (i2 == 1) {
            return c2 < 0 || (c2 == 0 && i3 * i4 < 0);
        }
        if (i2 == 2) {
            return c2 > 0 || (c2 == 0 && i3 * i4 > 0);
        }
        if (i2 == 17) {
            return i3 < 0;
        }
        if (i2 == 33) {
            return c2 < 0;
        }
        if (i2 == 66) {
            return i3 > 0;
        }
        if (i2 == 130) {
            return c2 > 0;
        }
        StringBuilder sb = new StringBuilder("Invalid direction: ");
        sb.append(i2);
        throw new IllegalArgumentException(t9c.a(this, sb));
    }

    private void nestedScrollByInternal(int i2, int i3, @Nullable MotionEvent motionEvent, int i4) {
        o oVar = this.mLayout;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean canScrollHorizontally = oVar.canScrollHorizontally();
        boolean canScrollVertically = this.mLayout.canScrollVertically();
        int i5 = canScrollVertically ? (canScrollHorizontally ? 1 : 0) | 2 : canScrollHorizontally ? 1 : 0;
        float height = motionEvent == null ? getHeight() / 2.0f : motionEvent.getY();
        float width = motionEvent == null ? getWidth() / 2.0f : motionEvent.getX();
        int releaseHorizontalGlow = i2 - releaseHorizontalGlow(i2, height);
        int releaseVerticalGlow = i3 - releaseVerticalGlow(i3, width);
        startNestedScroll(i5, i4);
        if (dispatchNestedPreScroll(canScrollHorizontally ? releaseHorizontalGlow : 0, canScrollVertically ? releaseVerticalGlow : 0, this.mReusableIntPair, this.mScrollOffset, i4)) {
            int[] iArr2 = this.mReusableIntPair;
            releaseHorizontalGlow -= iArr2[0];
            releaseVerticalGlow -= iArr2[1];
        }
        scrollByInternal(canScrollHorizontally ? releaseHorizontalGlow : 0, canScrollVertically ? releaseVerticalGlow : 0, motionEvent, i4);
        androidx.recyclerview.widget.q qVar = this.mGapWorker;
        if (qVar != null && (releaseHorizontalGlow != 0 || releaseVerticalGlow != 0)) {
            qVar.b(this, releaseHorizontalGlow, releaseVerticalGlow);
        }
        stopNestedScroll(i4);
    }

    private void onPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.mScrollPointerId = motionEvent.getPointerId(i2);
            int x2 = (int) (motionEvent.getX(i2) + 0.5f);
            this.mLastTouchX = x2;
            this.mInitialTouchX = x2;
            int y2 = (int) (motionEvent.getY(i2) + 0.5f);
            this.mLastTouchY = y2;
            this.mInitialTouchY = y2;
        }
    }

    private boolean predictiveItemAnimationsEnabled() {
        return this.mItemAnimator != null && this.mLayout.supportsPredictiveItemAnimations();
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
        boolean z2;
        boolean z3 = false;
        if (this.mDataSetHasChangedAfterLayout) {
            androidx.recyclerview.widget.a aVar = this.mAdapterHelper;
            aVar.k(aVar.b);
            aVar.k(aVar.c);
            aVar.f = 0;
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.onItemsChanged(this);
            }
        }
        if (predictiveItemAnimationsEnabled()) {
            this.mAdapterHelper.j();
        } else {
            this.mAdapterHelper.c();
        }
        boolean z4 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        this.mState.j = this.mFirstLayoutComplete && this.mItemAnimator != null && ((z2 = this.mDataSetHasChangedAfterLayout) || z4 || this.mLayout.mRequestedSimpleAnimations) && (!z2 || this.mAdapter.hasStableIds());
        a0 a0Var = this.mState;
        if (a0Var.j && z4 && !this.mDataSetHasChangedAfterLayout && predictiveItemAnimationsEnabled()) {
            z3 = true;
        }
        a0Var.k = z3;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void pullGlows(float f2, float f3, float f4, float f5) {
        boolean z2;
        boolean z3 = true;
        if (f3 < 0.0f) {
            ensureLeftGlow();
            fyo.b(this.mLeftGlow, (-f3) / getWidth(), 1.0f - (f4 / getHeight()));
        } else {
            if (f3 <= 0.0f) {
                z2 = false;
                if (f5 >= 0.0f) {
                    ensureTopGlow();
                    fyo.b(this.mTopGlow, (-f5) / getHeight(), f2 / getWidth());
                } else if (f5 > 0.0f) {
                    ensureBottomGlow();
                    fyo.b(this.mBottomGlow, f5 / getHeight(), 1.0f - (f2 / getWidth()));
                } else {
                    z3 = z2;
                }
                if (z3 && f3 == 0.0f && f5 == 0.0f) {
                    return;
                }
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                postInvalidateOnAnimation();
            }
            ensureRightGlow();
            fyo.b(this.mRightGlow, f3 / getWidth(), f4 / getHeight());
        }
        z2 = true;
        if (f5 >= 0.0f) {
        }
        if (z3) {
        }
        WeakHashMap<View, b0u0> weakHashMap2 = iut0.a;
        postInvalidateOnAnimation();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void recoverFocusFromState() {
        View findViewById;
        if (!this.mPreserveFocusAfterLayout || this.mAdapter == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (!IGNORE_DETACHED_FOCUSED_CHILD || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                if (!this.mChildHelper.c.contains(focusedChild)) {
                    return;
                }
            } else if (this.mChildHelper.e() == 0) {
                requestFocus();
                return;
            }
        }
        View view = null;
        e0 findViewHolderForItemId = (this.mState.m == -1 || !this.mAdapter.hasStableIds()) ? null : findViewHolderForItemId(this.mState.m);
        if (findViewHolderForItemId != null) {
            if (!this.mChildHelper.c.contains(findViewHolderForItemId.itemView) && findViewHolderForItemId.itemView.hasFocusable()) {
                view = findViewHolderForItemId.itemView;
                if (view == null) {
                    int i2 = this.mState.n;
                    if (i2 != -1 && (findViewById = view.findViewById(i2)) != null && findViewById.isFocusable()) {
                        view = findViewById;
                    }
                    view.requestFocus();
                    return;
                }
                return;
            }
        }
        if (this.mChildHelper.e() > 0) {
            view = findNextViewToFocus();
        }
        if (view == null) {
        }
    }

    private void releaseGlows() {
        boolean z2;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z2 = this.mLeftGlow.isFinished();
        } else {
            z2 = false;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z2 |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z2 |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z2 |= this.mBottomGlow.isFinished();
        }
        if (z2) {
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            postInvalidateOnAnimation();
        }
    }

    private int releaseHorizontalGlow(int i2, float f2) {
        float height = f2 / getHeight();
        float width = i2 / getWidth();
        EdgeEffect edgeEffect = this.mLeftGlow;
        float f3 = 0.0f;
        if (edgeEffect == null || fyo.a(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.mRightGlow;
            if (edgeEffect2 != null && fyo.a(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.mRightGlow.onRelease();
                } else {
                    float b2 = fyo.b(this.mRightGlow, width, height);
                    if (fyo.a(this.mRightGlow) == 0.0f) {
                        this.mRightGlow.onRelease();
                    }
                    f3 = b2;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.mLeftGlow.onRelease();
            } else {
                float f4 = -fyo.b(this.mLeftGlow, -width, 1.0f - height);
                if (fyo.a(this.mLeftGlow) == 0.0f) {
                    this.mLeftGlow.onRelease();
                }
                f3 = f4;
            }
            invalidate();
        }
        return Math.round(f3 * getWidth());
    }

    private int releaseVerticalGlow(int i2, float f2) {
        float width = f2 / getWidth();
        float height = i2 / getHeight();
        EdgeEffect edgeEffect = this.mTopGlow;
        float f3 = 0.0f;
        if (edgeEffect == null || fyo.a(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.mBottomGlow;
            if (edgeEffect2 != null && fyo.a(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.mBottomGlow.onRelease();
                } else {
                    float b2 = fyo.b(this.mBottomGlow, height, 1.0f - width);
                    if (fyo.a(this.mBottomGlow) == 0.0f) {
                        this.mBottomGlow.onRelease();
                    }
                    f3 = b2;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.mTopGlow.onRelease();
            } else {
                float f4 = -fyo.b(this.mTopGlow, -height, width);
                if (fyo.a(this.mTopGlow) == 0.0f) {
                    this.mTopGlow.onRelease();
                }
                f3 = f4;
            }
            invalidate();
        }
        return Math.round(f3 * getHeight());
    }

    private void requestChildOnScreen(@NonNull View view, @Nullable View view2) {
        View view3 = view2 != null ? view2 : view;
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof p) {
            p pVar = (p) layoutParams;
            if (!pVar.d) {
                Rect rect = pVar.c;
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

    private void resetFocusInfo() {
        a0 a0Var = this.mState;
        a0Var.m = -1L;
        a0Var.l = -1;
        a0Var.n = -1;
    }

    private void resetScroll() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        releaseGlows();
    }

    private void saveFocusInfo() {
        View focusedChild = (this.mPreserveFocusAfterLayout && hasFocus() && this.mAdapter != null) ? getFocusedChild() : null;
        e0 findContainingViewHolder = focusedChild != null ? findContainingViewHolder(focusedChild) : null;
        if (findContainingViewHolder == null) {
            resetFocusInfo();
            return;
        }
        this.mState.m = this.mAdapter.hasStableIds() ? findContainingViewHolder.getItemId() : -1L;
        this.mState.l = this.mDataSetHasChangedAfterLayout ? -1 : findContainingViewHolder.isRemoved() ? findContainingViewHolder.mOldPosition : findContainingViewHolder.getAbsoluteAdapterPosition();
        this.mState.n = getDeepestFocusedViewWithId(findContainingViewHolder.itemView);
    }

    private void setAdapterInternal(@Nullable Adapter<?> adapter, boolean z2, boolean z3) {
        Adapter adapter2 = this.mAdapter;
        if (adapter2 != null) {
            adapter2.unregisterAdapterDataObserver(this.mObserver);
            this.mAdapter.onDetachedFromRecyclerView(this);
        }
        if (!z2 || z3) {
            removeAndRecycleViews();
        }
        androidx.recyclerview.widget.a aVar = this.mAdapterHelper;
        aVar.k(aVar.b);
        aVar.k(aVar.c);
        aVar.f = 0;
        Adapter<?> adapter3 = this.mAdapter;
        this.mAdapter = adapter;
        if (adapter != null) {
            adapter.registerAdapterDataObserver(this.mObserver);
            adapter.onAttachedToRecyclerView(this);
        }
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.onAdapterChanged(adapter3, this.mAdapter);
        }
        v vVar = this.mRecycler;
        Adapter<?> adapter4 = this.mAdapter;
        vVar.c();
        u uVar = vVar.g;
        if (uVar != null) {
            uVar.detachForPoolingContainer(adapter3, true);
        }
        vVar.e().onAdapterChanged(adapter3, adapter4, z2);
        vVar.h();
        this.mState.f = true;
    }

    public static void setDebugAssertionsEnabled(boolean z2) {
        sDebugAssertionsEnabled = z2;
    }

    public static void setVerboseLoggingEnabled(boolean z2) {
        sVerboseLoggingEnabled = z2;
    }

    private boolean shouldAbsorb(@NonNull EdgeEffect edgeEffect, int i2, int i3) {
        if (i2 > 0) {
            return true;
        }
        return getSplineFlingDistance(-i2) < fyo.a(edgeEffect) * ((float) i3);
    }

    private boolean stopGlowAnimations(MotionEvent motionEvent) {
        boolean z2;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || fyo.a(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
            z2 = false;
        } else {
            fyo.b(this.mLeftGlow, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
            z2 = true;
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && fyo.a(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
            fyo.b(this.mRightGlow, 0.0f, motionEvent.getY() / getHeight());
            z2 = true;
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && fyo.a(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
            fyo.b(this.mTopGlow, 0.0f, motionEvent.getX() / getWidth());
            z2 = true;
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 == null || fyo.a(edgeEffect4) == 0.0f || canScrollVertically(1)) {
            return z2;
        }
        fyo.b(this.mBottomGlow, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    private void stopScrollersInternal() {
        d0 d0Var = this.mViewFlinger;
        RecyclerView.this.removeCallbacks(d0Var);
        d0Var.d.abortAnimation();
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.stopSmoothScroller();
        }
    }

    public void absorbGlows(int i2, int i3) {
        if (i2 < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i2);
            }
        }
        if (i3 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i3);
            }
        } else if (i3 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i3);
            }
        }
        if (i2 == 0 && i3 == 0) {
            return;
        }
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        postInvalidateOnAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        o oVar = this.mLayout;
        if (oVar == null || !oVar.onAddFocusables(this, arrayList, i2, i3)) {
            super.addFocusables(arrayList, i2, i3);
        }
    }

    public void addItemDecoration(@NonNull n nVar, int i2) {
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.assertNotInLayoutOrScroll("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i2 < 0) {
            this.mItemDecorations.add(nVar);
        } else {
            this.mItemDecorations.add(i2, nVar);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addOnChildAttachStateChangeListener(@NonNull q qVar) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(qVar);
    }

    public void addOnItemTouchListener(@NonNull s sVar) {
        this.mOnItemTouchListeners.add(sVar);
    }

    public void addOnScrollListener(@NonNull t tVar) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(tVar);
    }

    public void addRecyclerListener(@NonNull w wVar) {
        obr.a("'listener' arg cannot be null.", wVar != null);
        this.mRecyclerListeners.add(wVar);
    }

    public void animateAppearance(@NonNull e0 e0Var, @Nullable l.c cVar, @NonNull l.c cVar2) {
        e0Var.setIsRecyclable(false);
        if (this.mItemAnimator.a(e0Var, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    public void animateDisappearance(@NonNull e0 e0Var, @NonNull l.c cVar, @Nullable l.c cVar2) {
        addAnimatingView(e0Var);
        e0Var.setIsRecyclable(false);
        if (this.mItemAnimator.c(e0Var, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    public void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException(t9c.a(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
        }
        if (this.mDispatchScrollCounter > 0) {
            new IllegalStateException(t9c.a(this, new StringBuilder("")));
        }
    }

    public boolean canReuseUpdatedViewHolder(e0 e0Var) {
        l lVar = this.mItemAnimator;
        return lVar == null || lVar.g(e0Var, e0Var.getUnmodifiedPayloads());
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof p) && this.mLayout.checkLayoutParams((p) layoutParams);
    }

    public void clearOldPositions() {
        int h2 = this.mChildHelper.h();
        for (int i2 = 0; i2 < h2; i2++) {
            e0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i2));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.clearOldPosition();
            }
        }
        v vVar = this.mRecycler;
        ArrayList<e0> arrayList = vVar.a;
        ArrayList<e0> arrayList2 = vVar.c;
        int size = arrayList2.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList2.get(i3).clearOldPosition();
        }
        int size2 = arrayList.size();
        for (int i4 = 0; i4 < size2; i4++) {
            arrayList.get(i4).clearOldPosition();
        }
        ArrayList<e0> arrayList3 = vVar.b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i5 = 0; i5 < size3; i5++) {
                vVar.b.get(i5).clearOldPosition();
            }
        }
    }

    public void clearOnScrollListeners() {
        List<t> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        o oVar = this.mLayout;
        if (oVar != null && oVar.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        o oVar = this.mLayout;
        if (oVar != null && oVar.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        o oVar = this.mLayout;
        if (oVar != null && oVar.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollRange(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        o oVar = this.mLayout;
        if (oVar != null && oVar.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        o oVar = this.mLayout;
        if (oVar != null && oVar.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        o oVar = this.mLayout;
        if (oVar != null && oVar.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollRange(this.mState);
        }
        return 0;
    }

    public void considerReleasingGlowsOnScroll(int i2, int i3) {
        boolean z2;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished() || i2 <= 0) {
            z2 = false;
        } else {
            this.mLeftGlow.onRelease();
            z2 = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i2 < 0) {
            this.mRightGlow.onRelease();
            z2 |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i3 > 0) {
            this.mTopGlow.onRelease();
            z2 |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i3 < 0) {
            this.mBottomGlow.onRelease();
            z2 |= this.mBottomGlow.isFinished();
        }
        if (z2) {
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            postInvalidateOnAnimation();
        }
    }

    public int consumeFlingInHorizontalStretch(int i2) {
        return consumeFlingInStretch(i2, this.mLeftGlow, this.mRightGlow, getWidth());
    }

    public int consumeFlingInVerticalStretch(int i2) {
        return consumeFlingInStretch(i2, this.mTopGlow, this.mBottomGlow, getHeight());
    }

    public void consumePendingUpdateOperations() {
        if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout) {
            pdp0.a("RV FullInvalidate");
            dispatchLayout();
            pdp0.b();
            return;
        }
        if (this.mAdapterHelper.g()) {
            androidx.recyclerview.widget.a aVar = this.mAdapterHelper;
            int i2 = aVar.f;
            if ((i2 & 4) == 0 || (i2 & 11) != 0) {
                if (aVar.g()) {
                    pdp0.a("RV FullInvalidate");
                    dispatchLayout();
                    pdp0.b();
                    return;
                }
                return;
            }
            pdp0.a("RV PartialInvalidate");
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            this.mAdapterHelper.j();
            if (!this.mLayoutWasDefered) {
                if (hasUpdatedView()) {
                    dispatchLayout();
                } else {
                    this.mAdapterHelper.b();
                }
            }
            stopInterceptRequestLayout(true);
            onExitLayoutOrScroll();
            pdp0.b();
        }
    }

    public void defaultOnMeasure(int i2, int i3) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        setMeasuredDimension(o.chooseSize(i2, paddingRight, getMinimumWidth()), o.chooseSize(i3, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public void dispatchChildAttached(View view) {
        e0 childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        Adapter adapter = this.mAdapter;
        if (adapter != null && childViewHolderInt != null) {
            adapter.onViewAttachedToWindow(childViewHolderInt);
        }
        List<q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).k(view);
            }
        }
    }

    public void dispatchChildDetached(View view) {
        e0 childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        Adapter adapter = this.mAdapter;
        if (adapter != null && childViewHolderInt != null) {
            adapter.onViewDetachedFromWindow(childViewHolderInt);
        }
        List<q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).g(view);
            }
        }
    }

    public void dispatchLayout() {
        if (this.mAdapter == null) {
            return;
        }
        if (this.mLayout == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        this.mState.i = false;
        boolean z2 = this.mLastAutoMeasureSkippedDueToExact && !(this.mLastAutoMeasureNonExactMeasuredWidth == getWidth() && this.mLastAutoMeasureNonExactMeasuredHeight == getHeight());
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mLastAutoMeasureSkippedDueToExact = false;
        if (this.mState.d == 1) {
            dispatchLayoutStep1();
            this.mLayout.setExactMeasureSpecsFrom(this);
            dispatchLayoutStep2();
        } else {
            androidx.recyclerview.widget.a aVar = this.mAdapterHelper;
            if ((aVar.c.isEmpty() || aVar.b.isEmpty()) && !z2 && this.mLayout.getWidth() == getWidth() && this.mLayout.getHeight() == getHeight()) {
                this.mLayout.setExactMeasureSpecsFrom(this);
            } else {
                this.mLayout.setExactMeasureSpecsFrom(this);
                dispatchLayoutStep2();
            }
        }
        dispatchLayoutStep3();
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return getScrollingChildHelper().a(f2, f3, z2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f2, float f3) {
        return getScrollingChildHelper().b(f2, f3);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i2, i3, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return getScrollingChildHelper().d(i2, i3, i4, i5, iArr, 0, null);
    }

    public void dispatchOnScrollStateChanged(int i2) {
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.onScrollStateChanged(i2);
        }
        onScrollStateChanged(i2);
        t tVar = this.mScrollListener;
        if (tVar != null) {
            tVar.onScrollStateChanged(this, i2);
        }
        List<t> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrollStateChanged(this, i2);
            }
        }
    }

    public void dispatchOnScrolled(int i2, int i3) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i2, scrollY - i3);
        onScrolled(i2, i3);
        t tVar = this.mScrollListener;
        if (tVar != null) {
            tVar.onScrolled(this, i2, i3);
        }
        List<t> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrolled(this, i2, i3);
            }
        }
        this.mDispatchScrollCounter--;
    }

    public void dispatchPendingImportantForAccessibilityChanges() {
        int i2;
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            e0 e0Var = this.mPendingAccessibilityImportanceChange.get(size);
            if (e0Var.itemView.getParent() == this && !e0Var.shouldIgnore() && (i2 = e0Var.mPendingAccessibilityState) != -1) {
                View view = e0Var.itemView;
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                view.setImportantForAccessibility(i2);
                e0Var.mPendingAccessibilityState = -1;
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
    public void draw(Canvas canvas) {
        boolean z2;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            this.mItemDecorations.get(i2).onDrawOver(canvas, this, this.mState);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.mClipToPadding ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
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
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
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
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(save4);
        }
        if ((z2 || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.n()) ? z2 : true) {
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    public void ensureBottomGlow() {
        if (this.mBottomGlow != null) {
            return;
        }
        EdgeEffect a2 = this.mEdgeEffectFactory.a(this, 3);
        this.mBottomGlow = a2;
        if (this.mClipToPadding) {
            a2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            a2.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void ensureLeftGlow() {
        if (this.mLeftGlow != null) {
            return;
        }
        EdgeEffect a2 = this.mEdgeEffectFactory.a(this, 0);
        this.mLeftGlow = a2;
        if (this.mClipToPadding) {
            a2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            a2.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void ensureRightGlow() {
        if (this.mRightGlow != null) {
            return;
        }
        EdgeEffect a2 = this.mEdgeEffectFactory.a(this, 2);
        this.mRightGlow = a2;
        if (this.mClipToPadding) {
            a2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            a2.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void ensureTopGlow() {
        if (this.mTopGlow != null) {
            return;
        }
        EdgeEffect a2 = this.mEdgeEffectFactory.a(this, 1);
        this.mTopGlow = a2;
        if (this.mClipToPadding) {
            a2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            a2.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public String exceptionLabel() {
        return " " + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + getContext();
    }

    public final void fillRemainingScrollValues(a0 a0Var) {
        if (getScrollState() != 2) {
            a0Var.getClass();
            return;
        }
        OverScroller overScroller = this.mViewFlinger.d;
        overScroller.getFinalX();
        overScroller.getCurrX();
        a0Var.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    @Nullable
    public View findChildViewUnder(float f2, float f3) {
        for (int e2 = this.mChildHelper.e() - 1; e2 >= 0; e2--) {
            View d2 = this.mChildHelper.d(e2);
            float translationX = d2.getTranslationX();
            float translationY = d2.getTranslationY();
            if (f2 >= d2.getLeft() + translationX && f2 <= d2.getRight() + translationX && f3 >= d2.getTop() + translationY && f3 <= d2.getBottom() + translationY) {
                return d2;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        return r3;
     */
    @Nullable
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

    @Nullable
    public e0 findContainingViewHolder(@NonNull View view) {
        View findContainingItemView = findContainingItemView(view);
        if (findContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(findContainingItemView);
    }

    @Nullable
    public e0 findViewHolderForAdapterPosition(int i2) {
        e0 e0Var = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int h2 = this.mChildHelper.h();
        for (int i3 = 0; i3 < h2; i3++) {
            e0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i3));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && getAdapterPositionInRecyclerView(childViewHolderInt) == i2) {
                androidx.recyclerview.widget.e eVar = this.mChildHelper;
                if (!eVar.c.contains(childViewHolderInt.itemView)) {
                    return childViewHolderInt;
                }
                e0Var = childViewHolderInt;
            }
        }
        return e0Var;
    }

    public e0 findViewHolderForItemId(long j2) {
        Adapter adapter = this.mAdapter;
        e0 e0Var = null;
        if (adapter != null && adapter.hasStableIds()) {
            int h2 = this.mChildHelper.h();
            for (int i2 = 0; i2 < h2; i2++) {
                e0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i2));
                if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && childViewHolderInt.getItemId() == j2) {
                    androidx.recyclerview.widget.e eVar = this.mChildHelper;
                    if (!eVar.c.contains(childViewHolderInt.itemView)) {
                        return childViewHolderInt;
                    }
                    e0Var = childViewHolderInt;
                }
            }
        }
        return e0Var;
    }

    @Nullable
    public e0 findViewHolderForLayoutPosition(int i2) {
        return findViewHolderForPosition(i2, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0038 A[SYNTHETIC] */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e0 findViewHolderForPosition(int i2, boolean z2) {
        androidx.recyclerview.widget.e eVar;
        int h2 = this.mChildHelper.h();
        e0 e0Var = null;
        for (int i3 = 0; i3 < h2; i3++) {
            e0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i3));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved()) {
                if (z2) {
                    if (childViewHolderInt.mPosition != i2) {
                        continue;
                    }
                    eVar = this.mChildHelper;
                    if (eVar.c.contains(childViewHolderInt.itemView)) {
                        return childViewHolderInt;
                    }
                    e0Var = childViewHolderInt;
                } else {
                    if (childViewHolderInt.getLayoutPosition() != i2) {
                        continue;
                    }
                    eVar = this.mChildHelper;
                    if (eVar.c.contains(childViewHolderInt.itemView)) {
                    }
                }
            }
        }
        return e0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f1  */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean fling(int i2, int i3) {
        int i4;
        int i5;
        float f2;
        float f3;
        o oVar = this.mLayout;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (!this.mLayoutSuppressed) {
            int canScrollHorizontally = oVar.canScrollHorizontally();
            boolean canScrollVertically = this.mLayout.canScrollVertically();
            if (canScrollHorizontally == 0 || Math.abs(i2) < this.mMinFlingVelocity) {
                i2 = 0;
            }
            if (!canScrollVertically || Math.abs(i3) < this.mMinFlingVelocity) {
                i3 = 0;
            }
            if (i2 != 0 || i3 != 0) {
                if (i2 != 0) {
                    EdgeEffect edgeEffect = this.mLeftGlow;
                    if (edgeEffect == null || fyo.a(edgeEffect) == 0.0f) {
                        EdgeEffect edgeEffect2 = this.mRightGlow;
                        if (edgeEffect2 != null && fyo.a(edgeEffect2) != 0.0f) {
                            if (shouldAbsorb(this.mRightGlow, i2, getWidth())) {
                                this.mRightGlow.onAbsorb(i2);
                                i2 = 0;
                            }
                            i4 = i2;
                            i2 = 0;
                        }
                    } else {
                        int i6 = -i2;
                        if (shouldAbsorb(this.mLeftGlow, i6, getWidth())) {
                            this.mLeftGlow.onAbsorb(i6);
                            i2 = 0;
                        }
                        i4 = i2;
                        i2 = 0;
                    }
                    if (i3 != 0) {
                        EdgeEffect edgeEffect3 = this.mTopGlow;
                        if (edgeEffect3 == null || fyo.a(edgeEffect3) == 0.0f) {
                            EdgeEffect edgeEffect4 = this.mBottomGlow;
                            if (edgeEffect4 != null && fyo.a(edgeEffect4) != 0.0f) {
                                if (shouldAbsorb(this.mBottomGlow, i3, getHeight())) {
                                    this.mBottomGlow.onAbsorb(i3);
                                    i3 = 0;
                                }
                                i5 = 0;
                            }
                        } else {
                            int i7 = -i3;
                            if (shouldAbsorb(this.mTopGlow, i7, getHeight())) {
                                this.mTopGlow.onAbsorb(i7);
                                i3 = 0;
                            }
                            i5 = 0;
                        }
                        if (i4 == 0 || i3 != 0) {
                            int i8 = this.mMaxFlingVelocity;
                            i4 = Math.max(-i8, Math.min(i4, i8));
                            int i9 = this.mMaxFlingVelocity;
                            i3 = Math.max(-i9, Math.min(i3, i9));
                            this.mViewFlinger.a(i4, i3);
                        }
                        if (i2 == 0 || i5 != 0) {
                            f2 = i2;
                            f3 = i5;
                            if (!dispatchNestedPreFling(f2, f3)) {
                                boolean z2 = canScrollHorizontally != 0 || canScrollVertically;
                                dispatchNestedFling(f2, f3, z2);
                                r rVar = this.mOnFlingListener;
                                if (rVar == null || !rVar.onFling(i2, i5)) {
                                    if (z2) {
                                        if (canScrollVertically) {
                                            canScrollHorizontally = (canScrollHorizontally == true ? 1 : 0) | 2;
                                        }
                                        startNestedScroll(canScrollHorizontally, 1);
                                        int i10 = this.mMaxFlingVelocity;
                                        int max = Math.max(-i10, Math.min(i2, i10));
                                        int i11 = this.mMaxFlingVelocity;
                                        this.mViewFlinger.a(max, Math.max(-i11, Math.min(i5, i11)));
                                        return true;
                                    }
                                }
                                return true;
                            }
                        } else if (i4 != 0 || i3 != 0) {
                            return true;
                        }
                    }
                    i5 = i3;
                    i3 = 0;
                    if (i4 == 0) {
                    }
                    int i82 = this.mMaxFlingVelocity;
                    i4 = Math.max(-i82, Math.min(i4, i82));
                    int i92 = this.mMaxFlingVelocity;
                    i3 = Math.max(-i92, Math.min(i3, i92));
                    this.mViewFlinger.a(i4, i3);
                    if (i2 == 0) {
                    }
                    f2 = i2;
                    f3 = i5;
                    if (!dispatchNestedPreFling(f2, f3)) {
                    }
                }
                i4 = 0;
                if (i3 != 0) {
                }
                i5 = i3;
                i3 = 0;
                if (i4 == 0) {
                }
                int i822 = this.mMaxFlingVelocity;
                i4 = Math.max(-i822, Math.min(i4, i822));
                int i922 = this.mMaxFlingVelocity;
                i3 = Math.max(-i922, Math.min(i3, i922));
                this.mViewFlinger.a(i4, i3);
                if (i2 == 0) {
                }
                f2 = i2;
                f3 = i5;
                if (!dispatchNestedPreFling(f2, f3)) {
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x00dc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00dd  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View focusSearch(View view, int i2) {
        View view2;
        boolean z2;
        View onInterceptFocusSearch = this.mLayout.onInterceptFocusSearch(view, i2);
        if (onInterceptFocusSearch != null) {
            return onInterceptFocusSearch;
        }
        boolean z3 = (this.mAdapter == null || this.mLayout == null || isComputingLayout() || this.mLayoutSuppressed) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (!z3 || (i2 != 2 && i2 != 1)) {
            View findNextFocus = focusFinder.findNextFocus(this, view, i2);
            if (findNextFocus == null && z3) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) != null) {
                    startInterceptRequestLayout();
                    view2 = this.mLayout.onFocusSearchFailed(view, i2, this.mRecycler, this.mState);
                    stopInterceptRequestLayout(false);
                }
                return null;
            }
            view2 = findNextFocus;
            if (view2 != null || view2.hasFocusable()) {
                return !isPreferredNextFocus(view, view2, i2) ? view2 : super.focusSearch(view, i2);
            }
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i2);
            }
            requestChildOnScreen(view2, null);
            return view;
        }
        if (this.mLayout.canScrollVertically()) {
            int i3 = i2 == 2 ? 130 : 33;
            z2 = focusFinder.findNextFocus(this, view, i3) == null;
            if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                i2 = i3;
            }
        } else {
            z2 = false;
        }
        if (!z2 && this.mLayout.canScrollHorizontally()) {
            int i4 = (this.mLayout.getLayoutDirection() == 1) ^ (i2 == 2) ? 66 : 17;
            boolean z4 = focusFinder.findNextFocus(this, view, i4) == null;
            if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                i2 = i4;
            }
            z2 = z4;
        }
        if (z2) {
            consumePendingUpdateOperations();
            if (findContainingItemView(view) != null) {
                startInterceptRequestLayout();
                this.mLayout.onFocusSearchFailed(view, i2, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
            return null;
        }
        view2 = focusFinder.findNextFocus(this, view, i2);
        if (view2 != null) {
        }
        if (!isPreferredNextFocus(view, view2, i2)) {
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        o oVar = this.mLayout;
        if (oVar != null) {
            return oVar.generateDefaultLayoutParams();
        }
        throw new IllegalStateException(t9c.a(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        o oVar = this.mLayout;
        if (oVar != null) {
            return oVar.generateLayoutParams(getContext(), attributeSet);
        }
        throw new IllegalStateException(t9c.a(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    @Nullable
    public Adapter getAdapter() {
        return this.mAdapter;
    }

    public int getAdapterPositionInRecyclerView(e0 e0Var) {
        if (e0Var.hasAnyOfTheFlags(IronSourceError.ERROR_PLACEMENT_CAPPED) || !e0Var.isBound()) {
            return -1;
        }
        androidx.recyclerview.widget.a aVar = this.mAdapterHelper;
        int i2 = e0Var.mPosition;
        ArrayList<a.C0080a> arrayList = aVar.b;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            a.C0080a c0080a = arrayList.get(i3);
            int i4 = c0080a.a;
            if (i4 != 1) {
                if (i4 == 2) {
                    int i5 = c0080a.b;
                    if (i5 <= i2) {
                        int i6 = c0080a.d;
                        if (i5 + i6 > i2) {
                            return -1;
                        }
                        i2 -= i6;
                    } else {
                        continue;
                    }
                } else if (i4 == 8) {
                    int i7 = c0080a.b;
                    if (i7 == i2) {
                        i2 = c0080a.d;
                    } else {
                        if (i7 < i2) {
                            i2--;
                        }
                        if (c0080a.d <= i2) {
                            i2++;
                        }
                    }
                }
            } else if (c0080a.b <= i2) {
                i2 += c0080a.d;
            }
        }
        return i2;
    }

    @Override // android.view.View
    public int getBaseline() {
        o oVar = this.mLayout;
        return oVar != null ? oVar.getBaseline() : super.getBaseline();
    }

    public long getChangedHolderKey(e0 e0Var) {
        return this.mAdapter.hasStableIds() ? e0Var.getItemId() : e0Var.mPosition;
    }

    public int getChildAdapterPosition(@NonNull View view) {
        e0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i2, int i3) {
        return super.getChildDrawingOrder(i2, i3);
    }

    public int getChildLayoutPosition(@NonNull View view) {
        e0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getLayoutPosition();
        }
        return -1;
    }

    public e0 getChildViewHolder(@NonNull View view) {
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

    @Nullable
    public l0 getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void getDecoratedBoundsWithMargins(@NonNull View view, @NonNull Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    @NonNull
    public k getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    @Nullable
    public l getItemAnimator() {
        return this.mItemAnimator;
    }

    public Rect getItemDecorInsetsForChild(View view) {
        p pVar = (p) view.getLayoutParams();
        boolean z2 = pVar.d;
        Rect rect = pVar.c;
        if (!z2 || (this.mState.g && (pVar.e() || pVar.g()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mTempRect.set(0, 0, 0, 0);
            this.mItemDecorations.get(i2).getItemOffsets(this.mTempRect, view, this, this.mState);
            int i3 = rect.left;
            Rect rect2 = this.mTempRect;
            rect.left = i3 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        pVar.d = false;
        return rect;
    }

    @NonNull
    public n getItemDecorationAt(int i2) {
        int itemDecorationCount = getItemDecorationCount();
        if (i2 >= 0 && i2 < itemDecorationCount) {
            return this.mItemDecorations.get(i2);
        }
        throw new IndexOutOfBoundsException(i2 + " is an invalid index for size " + itemDecorationCount);
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    @Nullable
    public o getLayoutManager() {
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

    @Nullable
    public r getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    @NonNull
    public u getRecycledViewPool() {
        return this.mRecycler.e();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.g();
    }

    public void initAdapterManager() {
        this.mAdapterHelper = new androidx.recyclerview.widget.a(new f());
    }

    public void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException(t9c.a(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
        }
        Resources resources = getContext().getResources();
        new androidx.recyclerview.widget.o(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(androidx.recyclerview.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(androidx.recyclerview.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(androidx.recyclerview.R.dimen.fastscroll_margin));
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
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.assertNotInLayoutOrScroll("Cannot invalidate item decorations during a scroll or layout");
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean isAnimating() {
        l lVar = this.mItemAnimator;
        return lVar != null && lVar.n();
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
        return getScrollingChildHelper().d;
    }

    public void jumpToPositionForSmoothScroller(int i2) {
        if (this.mLayout == null) {
            return;
        }
        setScrollState(2);
        this.mLayout.scrollToPosition(i2);
        awakenScrollBars();
    }

    public void markItemDecorInsetsDirty() {
        int h2 = this.mChildHelper.h();
        for (int i2 = 0; i2 < h2; i2++) {
            ((p) this.mChildHelper.g(i2).getLayoutParams()).d = true;
        }
        ArrayList<e0> arrayList = this.mRecycler.c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            p pVar = (p) arrayList.get(i3).itemView.getLayoutParams();
            if (pVar != null) {
                pVar.d = true;
            }
        }
    }

    public void markKnownViewsInvalid() {
        int h2 = this.mChildHelper.h();
        for (int i2 = 0; i2 < h2; i2++) {
            e0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i2));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.addFlags(6);
            }
        }
        markItemDecorInsetsDirty();
        v vVar = this.mRecycler;
        ArrayList<e0> arrayList = vVar.c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            e0 e0Var = arrayList.get(i3);
            if (e0Var != null) {
                e0Var.addFlags(6);
                e0Var.addChangePayload(null);
            }
        }
        Adapter adapter = RecyclerView.this.mAdapter;
        if (adapter == null || !adapter.hasStableIds()) {
            vVar.i();
        }
    }

    public void nestedScrollBy(int i2, int i3) {
        nestedScrollByInternal(i2, i3, null, 1);
    }

    public void offsetChildrenHorizontal(int i2) {
        int e2 = this.mChildHelper.e();
        for (int i3 = 0; i3 < e2; i3++) {
            this.mChildHelper.d(i3).offsetLeftAndRight(i2);
        }
    }

    public void offsetChildrenVertical(int i2) {
        int e2 = this.mChildHelper.e();
        for (int i3 = 0; i3 < e2; i3++) {
            this.mChildHelper.d(i3).offsetTopAndBottom(i2);
        }
    }

    public void offsetPositionRecordsForInsert(int i2, int i3) {
        int h2 = this.mChildHelper.h();
        for (int i4 = 0; i4 < h2; i4++) {
            e0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i4));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.mPosition >= i2) {
                if (sVerboseLoggingEnabled) {
                    childViewHolderInt.toString();
                }
                childViewHolderInt.offsetPosition(i3, false);
                this.mState.f = true;
            }
        }
        ArrayList<e0> arrayList = this.mRecycler.c;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            e0 e0Var = arrayList.get(i5);
            if (e0Var != null && e0Var.mPosition >= i2) {
                if (sVerboseLoggingEnabled) {
                    e0Var.toString();
                }
                e0Var.offsetPosition(i3, false);
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForMove(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int h2 = this.mChildHelper.h();
        int i11 = -1;
        if (i2 < i3) {
            i5 = i2;
            i4 = i3;
            i6 = -1;
        } else {
            i4 = i2;
            i5 = i3;
            i6 = 1;
        }
        for (int i12 = 0; i12 < h2; i12++) {
            e0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i12));
            if (childViewHolderInt != null && (i10 = childViewHolderInt.mPosition) >= i5 && i10 <= i4) {
                if (sVerboseLoggingEnabled) {
                    childViewHolderInt.toString();
                }
                if (childViewHolderInt.mPosition == i2) {
                    childViewHolderInt.offsetPosition(i3 - i2, false);
                } else {
                    childViewHolderInt.offsetPosition(i6, false);
                }
                this.mState.f = true;
            }
        }
        ArrayList<e0> arrayList = this.mRecycler.c;
        if (i2 < i3) {
            i8 = i2;
            i7 = i3;
        } else {
            i7 = i2;
            i11 = 1;
            i8 = i3;
        }
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            e0 e0Var = arrayList.get(i13);
            if (e0Var != null && (i9 = e0Var.mPosition) >= i8 && i9 <= i7) {
                if (i9 == i2) {
                    e0Var.offsetPosition(i3 - i2, false);
                } else {
                    e0Var.offsetPosition(i11, false);
                }
                if (sVerboseLoggingEnabled) {
                    e0Var.toString();
                }
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForRemove(int i2, int i3, boolean z2) {
        int i4 = i2 + i3;
        int h2 = this.mChildHelper.h();
        for (int i5 = 0; i5 < h2; i5++) {
            e0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i5));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                int i6 = childViewHolderInt.mPosition;
                if (i6 >= i4) {
                    if (sVerboseLoggingEnabled) {
                        childViewHolderInt.toString();
                    }
                    childViewHolderInt.offsetPosition(-i3, z2);
                    this.mState.f = true;
                } else if (i6 >= i2) {
                    if (sVerboseLoggingEnabled) {
                        childViewHolderInt.toString();
                    }
                    childViewHolderInt.flagRemovedAndOffsetPosition(i2 - 1, -i3, z2);
                    this.mState.f = true;
                }
            }
        }
        v vVar = this.mRecycler;
        ArrayList<e0> arrayList = vVar.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            e0 e0Var = arrayList.get(size);
            if (e0Var != null) {
                int i7 = e0Var.mPosition;
                if (i7 >= i4) {
                    if (sVerboseLoggingEnabled) {
                        e0Var.toString();
                    }
                    e0Var.offsetPosition(-i3, z2);
                } else if (i7 >= i2) {
                    e0Var.addFlags(8);
                    vVar.j(size);
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
        float f2;
        super.onAttachedToWindow();
        this.mLayoutOrScrollCounter = 0;
        this.mIsAttached = true;
        this.mFirstLayoutComplete = this.mFirstLayoutComplete && !isLayoutRequested();
        this.mRecycler.h();
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.dispatchAttachedToWindow(this);
        }
        this.mPostedAnimatorRunner = false;
        if (ALLOW_THREAD_GAP_WORK) {
            ThreadLocal<androidx.recyclerview.widget.q> threadLocal = androidx.recyclerview.widget.q.f;
            androidx.recyclerview.widget.q qVar = threadLocal.get();
            this.mGapWorker = qVar;
            if (qVar == null) {
                this.mGapWorker = new androidx.recyclerview.widget.q();
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                Display display = getDisplay();
                if (!isInEditMode() && display != null) {
                    f2 = display.getRefreshRate();
                }
                f2 = 60.0f;
                androidx.recyclerview.widget.q qVar2 = this.mGapWorker;
                qVar2.d = (long) (1.0E9f / f2);
                threadLocal.set(qVar2);
            }
            this.mGapWorker.a(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        androidx.recyclerview.widget.q qVar;
        super.onDetachedFromWindow();
        l lVar = this.mItemAnimator;
        if (lVar != null) {
            lVar.k();
        }
        stopScroll();
        this.mIsAttached = false;
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.dispatchDetachedFromWindow(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.getClass();
        r0.a.a();
        v vVar = this.mRecycler;
        ArrayList<e0> arrayList = vVar.c;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            g620.c(arrayList.get(i2).itemView);
        }
        Adapter<?> adapter = RecyclerView.this.mAdapter;
        u uVar = vVar.g;
        if (uVar != null) {
            uVar.detachForPoolingContainer(adapter, false);
        }
        Iterator<View> it = mxt0.b(this).iterator();
        while (true) {
            kxt0 kxt0Var = (kxt0) it;
            if (!kxt0Var.hasNext()) {
                break;
            } else {
                g620.i((View) kxt0Var.next()).b();
            }
        }
        if (!ALLOW_THREAD_GAP_WORK || (qVar = this.mGapWorker) == null) {
            return;
        }
        qVar.e(this);
        this.mGapWorker = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mItemDecorations.get(i2).onDraw(canvas, this, this.mState);
        }
    }

    public void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    public void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f2;
        float f3;
        if (this.mLayout != null && !this.mLayoutSuppressed && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f2 = this.mLayout.canScrollVertically() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.mLayout.canScrollHorizontally()) {
                    f3 = motionEvent.getAxisValue(10);
                    if (f2 == 0.0f || f3 != 0.0f) {
                        nestedScrollByInternal((int) (f3 * this.mScaledHorizontalScrollFactor), (int) (f2 * this.mScaledVerticalScrollFactor), motionEvent, 1);
                    }
                }
                f3 = 0.0f;
                if (f2 == 0.0f) {
                }
                nestedScrollByInternal((int) (f3 * this.mScaledHorizontalScrollFactor), (int) (f2 * this.mScaledVerticalScrollFactor), motionEvent, 1);
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.mLayout.canScrollVertically()) {
                        f2 = -axisValue;
                        f3 = 0.0f;
                        if (f2 == 0.0f) {
                        }
                        nestedScrollByInternal((int) (f3 * this.mScaledHorizontalScrollFactor), (int) (f2 * this.mScaledVerticalScrollFactor), motionEvent, 1);
                    } else if (this.mLayout.canScrollHorizontally()) {
                        f3 = axisValue;
                        f2 = 0.0f;
                        if (f2 == 0.0f) {
                        }
                        nestedScrollByInternal((int) (f3 * this.mScaledHorizontalScrollFactor), (int) (f2 * this.mScaledVerticalScrollFactor), motionEvent, 1);
                    }
                }
                f2 = 0.0f;
                f3 = 0.0f;
                if (f2 == 0.0f) {
                }
                nestedScrollByInternal((int) (f3 * this.mScaledHorizontalScrollFactor), (int) (f2 * this.mScaledVerticalScrollFactor), motionEvent, 1);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        if (!this.mLayoutSuppressed) {
            this.mInterceptingOnItemTouchListener = null;
            if (findInterceptingOnItemTouchListener(motionEvent)) {
                cancelScroll();
                return true;
            }
            o oVar = this.mLayout;
            if (oVar != null) {
                boolean canScrollHorizontally = oVar.canScrollHorizontally();
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
                    int x2 = (int) (motionEvent.getX() + 0.5f);
                    this.mLastTouchX = x2;
                    this.mInitialTouchX = x2;
                    int y2 = (int) (motionEvent.getY() + 0.5f);
                    this.mLastTouchY = y2;
                    this.mInitialTouchY = y2;
                    if (stopGlowAnimations(motionEvent) || this.mScrollState == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        stopNestedScroll(1);
                    }
                    int[] iArr = this.mNestedOffsets;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    int i2 = canScrollHorizontally;
                    if (canScrollVertically) {
                        i2 = (canScrollHorizontally ? 1 : 0) | 2;
                    }
                    startNestedScroll(i2, 0);
                } else if (actionMasked == 1) {
                    this.mVelocityTracker.clear();
                    stopNestedScroll(0);
                } else if (actionMasked == 2) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
                    if (findPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    if (this.mScrollState != 1) {
                        int i3 = x3 - this.mInitialTouchX;
                        int i4 = y3 - this.mInitialTouchY;
                        if (canScrollHorizontally == 0 || Math.abs(i3) <= this.mTouchSlop) {
                            z2 = false;
                        } else {
                            this.mLastTouchX = x3;
                            z2 = true;
                        }
                        if (canScrollVertically && Math.abs(i4) > this.mTouchSlop) {
                            this.mLastTouchY = y3;
                            z2 = true;
                        }
                        if (z2) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    cancelScroll();
                } else if (actionMasked == 5) {
                    this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
                    int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.mLastTouchX = x4;
                    this.mInitialTouchX = x4;
                    int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.mLastTouchY = y4;
                    this.mInitialTouchY = y4;
                } else if (actionMasked == 6) {
                    onPointerUp(motionEvent);
                }
                if (this.mScrollState == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        pdp0.a("RV OnLayout");
        dispatchLayout();
        pdp0.b();
        this.mFirstLayoutComplete = true;
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        o oVar = this.mLayout;
        if (oVar == null) {
            defaultOnMeasure(i2, i3);
            return;
        }
        boolean z2 = false;
        if (oVar.isAutoMeasureEnabled()) {
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.mLayout.onMeasure(this.mRecycler, this.mState, i2, i3);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z2 = true;
            }
            this.mLastAutoMeasureSkippedDueToExact = z2;
            if (z2 || this.mAdapter == null) {
                return;
            }
            if (this.mState.d == 1) {
                dispatchLayoutStep1();
            }
            this.mLayout.setMeasureSpecs(i2, i3);
            this.mState.i = true;
            dispatchLayoutStep2();
            this.mLayout.setMeasuredDimensionFromChildren(i2, i3);
            if (this.mLayout.shouldMeasureTwice()) {
                this.mLayout.setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.mState.i = true;
                dispatchLayoutStep2();
                this.mLayout.setMeasuredDimensionFromChildren(i2, i3);
            }
            this.mLastAutoMeasureNonExactMeasuredWidth = getMeasuredWidth();
            this.mLastAutoMeasureNonExactMeasuredHeight = getMeasuredHeight();
            return;
        }
        if (this.mHasFixedSize) {
            this.mLayout.onMeasure(this.mRecycler, this.mState, i2, i3);
            return;
        }
        if (this.mAdapterUpdateDuringMeasure) {
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            processAdapterUpdatesAndSetAnimationFlags();
            onExitLayoutOrScroll();
            a0 a0Var = this.mState;
            if (a0Var.k) {
                a0Var.g = true;
            } else {
                this.mAdapterHelper.c();
                this.mState.g = false;
            }
            this.mAdapterUpdateDuringMeasure = false;
            stopInterceptRequestLayout(false);
        } else if (this.mState.k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        Adapter adapter = this.mAdapter;
        if (adapter != null) {
            this.mState.e = adapter.getItemCount();
        } else {
            this.mState.e = 0;
        }
        startInterceptRequestLayout();
        this.mLayout.onMeasure(this.mRecycler, this.mState, i2, i3);
        stopInterceptRequestLayout(false);
        this.mState.g = false;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.mPendingSavedState = savedState;
        super.onRestoreInstanceState(savedState.d());
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.mPendingSavedState;
        if (savedState2 != null) {
            savedState.e(savedState2);
            return savedState;
        }
        o oVar = this.mLayout;
        if (oVar != null) {
            savedState.d = oVar.onSaveInstanceState();
            return savedState;
        }
        savedState.d = null;
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 == i4 && i3 == i5) {
            return;
        }
        invalidateGlows();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f6  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        if (!this.mLayoutSuppressed && !this.mIgnoreMotionEventTillDown) {
            if (dispatchToOnItemTouchListeners(motionEvent)) {
                cancelScroll();
                return true;
            }
            o oVar = this.mLayout;
            if (oVar != null) {
                boolean canScrollHorizontally = oVar.canScrollHorizontally();
                boolean canScrollVertically = this.mLayout.canScrollVertically();
                if (this.mVelocityTracker == null) {
                    this.mVelocityTracker = VelocityTracker.obtain();
                }
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    int[] iArr = this.mNestedOffsets;
                    iArr[1] = 0;
                    iArr[0] = 0;
                }
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                int[] iArr2 = this.mNestedOffsets;
                obtain.offsetLocation(iArr2[0], iArr2[1]);
                if (actionMasked == 0) {
                    this.mScrollPointerId = motionEvent.getPointerId(0);
                    int x2 = (int) (motionEvent.getX() + 0.5f);
                    this.mLastTouchX = x2;
                    this.mInitialTouchX = x2;
                    int y2 = (int) (motionEvent.getY() + 0.5f);
                    this.mLastTouchY = y2;
                    this.mInitialTouchY = y2;
                    int i2 = canScrollHorizontally;
                    if (canScrollVertically) {
                        i2 = (canScrollHorizontally ? 1 : 0) | 2;
                    }
                    startNestedScroll(i2, 0);
                } else {
                    if (actionMasked == 1) {
                        this.mVelocityTracker.addMovement(obtain);
                        this.mVelocityTracker.computeCurrentVelocity(1000, this.mMaxFlingVelocity);
                        float f2 = canScrollHorizontally != 0 ? -this.mVelocityTracker.getXVelocity(this.mScrollPointerId) : 0.0f;
                        float f3 = canScrollVertically ? -this.mVelocityTracker.getYVelocity(this.mScrollPointerId) : 0.0f;
                        if ((f2 == 0.0f && f3 == 0.0f) || !fling((int) f2, (int) f3)) {
                            setScrollState(0);
                        }
                        resetScroll();
                        obtain.recycle();
                        return true;
                    }
                    if (actionMasked == 2) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
                        if (findPointerIndex < 0) {
                            Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                            return false;
                        }
                        int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                        int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                        int i3 = this.mLastTouchX - x3;
                        int i4 = this.mLastTouchY - y3;
                        if (this.mScrollState != 1) {
                            if (canScrollHorizontally != 0) {
                                i3 = i3 > 0 ? Math.max(0, i3 - this.mTouchSlop) : Math.min(0, i3 + this.mTouchSlop);
                                if (i3 != 0) {
                                    z2 = true;
                                    if (canScrollVertically) {
                                        i4 = i4 > 0 ? Math.max(0, i4 - this.mTouchSlop) : Math.min(0, i4 + this.mTouchSlop);
                                        if (i4 != 0) {
                                            z2 = true;
                                        }
                                    }
                                    if (z2) {
                                        setScrollState(1);
                                    }
                                }
                            }
                            z2 = false;
                            if (canScrollVertically) {
                            }
                            if (z2) {
                            }
                        }
                        if (this.mScrollState == 1) {
                            int[] iArr3 = this.mReusableIntPair;
                            iArr3[0] = 0;
                            iArr3[1] = 0;
                            int releaseHorizontalGlow = i3 - releaseHorizontalGlow(i3, motionEvent.getY());
                            int releaseVerticalGlow = i4 - releaseVerticalGlow(i4, motionEvent.getX());
                            if (dispatchNestedPreScroll(canScrollHorizontally != 0 ? releaseHorizontalGlow : 0, canScrollVertically ? releaseVerticalGlow : 0, this.mReusableIntPair, this.mScrollOffset, 0)) {
                                int[] iArr4 = this.mReusableIntPair;
                                releaseHorizontalGlow -= iArr4[0];
                                releaseVerticalGlow -= iArr4[1];
                                int[] iArr5 = this.mNestedOffsets;
                                int i5 = iArr5[0];
                                int[] iArr6 = this.mScrollOffset;
                                iArr5[0] = i5 + iArr6[0];
                                iArr5[1] = iArr5[1] + iArr6[1];
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            int[] iArr7 = this.mScrollOffset;
                            this.mLastTouchX = x3 - iArr7[0];
                            this.mLastTouchY = y3 - iArr7[1];
                            if (scrollByInternal(canScrollHorizontally != 0 ? releaseHorizontalGlow : 0, canScrollVertically ? releaseVerticalGlow : 0, motionEvent, 0)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            androidx.recyclerview.widget.q qVar = this.mGapWorker;
                            if (qVar != null && (releaseHorizontalGlow != 0 || releaseVerticalGlow != 0)) {
                                qVar.b(this, releaseHorizontalGlow, releaseVerticalGlow);
                            }
                        }
                    } else if (actionMasked == 3) {
                        cancelScroll();
                    } else if (actionMasked == 5) {
                        this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
                        int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                        this.mLastTouchX = x4;
                        this.mInitialTouchX = x4;
                        int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                        this.mLastTouchY = y4;
                        this.mInitialTouchY = y4;
                    } else if (actionMasked == 6) {
                        onPointerUp(motionEvent);
                    }
                }
                this.mVelocityTracker.addMovement(obtain);
                obtain.recycle();
                return true;
            }
        }
        return false;
    }

    public void postAnimationRunner() {
        if (this.mPostedAnimatorRunner || !this.mIsAttached) {
            return;
        }
        Runnable runnable = this.mItemAnimatorRunner;
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        postOnAnimation(runnable);
        this.mPostedAnimatorRunner = true;
    }

    public void processDataSetCompletelyChanged(boolean z2) {
        this.mDispatchItemsChangedEvent = z2 | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    public void recordAnimationInfoIfBouncedHiddenView(e0 e0Var, l.c cVar) {
        e0Var.setFlags(0, 8192);
        if (this.mState.h && e0Var.isUpdated() && !e0Var.isRemoved() && !e0Var.shouldIgnore()) {
            this.mViewInfoStore.b.put(getChangedHolderKey(e0Var), e0Var);
        }
        dpj0<e0, r0.a> dpj0Var = this.mViewInfoStore.a;
        r0.a aVar = dpj0Var.get(e0Var);
        if (aVar == null) {
            aVar = r0.a.b();
            dpj0Var.put(e0Var, aVar);
        }
        aVar.b = cVar;
        aVar.a |= 4;
    }

    public void removeAndRecycleViews() {
        l lVar = this.mItemAnimator;
        if (lVar != null) {
            lVar.k();
        }
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        }
        this.mRecycler.c();
    }

    public boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        androidx.recyclerview.widget.e eVar = this.mChildHelper;
        e.a aVar = eVar.b;
        e eVar2 = eVar.a;
        int i2 = eVar.d;
        boolean z2 = false;
        z2 = false;
        if (i2 == 1) {
            if (eVar.e != view) {
                throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
            }
        } else {
            if (i2 == 2) {
                throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
            }
            try {
                eVar.d = 2;
                int indexOfChild = RecyclerView.this.indexOfChild(view);
                if (indexOfChild == -1) {
                    eVar.l(view);
                } else if (aVar.d(indexOfChild)) {
                    aVar.f(indexOfChild);
                    eVar.l(view);
                    eVar2.a(indexOfChild);
                }
                eVar.d = 0;
                z2 = true;
            } finally {
                eVar.d = 0;
            }
        }
        if (z2) {
            e0 childViewHolderInt = getChildViewHolderInt(view);
            this.mRecycler.p(childViewHolderInt);
            this.mRecycler.l(childViewHolderInt);
            if (sVerboseLoggingEnabled) {
                Objects.toString(view);
                toString();
            }
        }
        stopInterceptRequestLayout(!z2);
        return z2;
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z2) {
        e0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.isTmpDetached()) {
                childViewHolderInt.clearTmpDetachFlag();
            } else if (!childViewHolderInt.shouldIgnore()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(childViewHolderInt);
                throw new IllegalArgumentException(t9c.a(this, sb));
            }
        } else if (sDebugAssertionsEnabled) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            throw new IllegalArgumentException(t9c.a(this, sb2));
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z2);
    }

    public void removeItemDecoration(@NonNull n nVar) {
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.assertNotInLayoutOrScroll("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(nVar);
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeItemDecorationAt(int i2) {
        int itemDecorationCount = getItemDecorationCount();
        if (i2 >= 0 && i2 < itemDecorationCount) {
            removeItemDecoration(getItemDecorationAt(i2));
            return;
        }
        throw new IndexOutOfBoundsException(i2 + " is an invalid index for size " + itemDecorationCount);
    }

    public void removeOnChildAttachStateChangeListener(@NonNull q qVar) {
        List<q> list = this.mOnChildAttachStateListeners;
        if (list == null) {
            return;
        }
        list.remove(qVar);
    }

    public void removeOnItemTouchListener(@NonNull s sVar) {
        this.mOnItemTouchListeners.remove(sVar);
        if (this.mInterceptingOnItemTouchListener == sVar) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(@NonNull t tVar) {
        List<t> list = this.mScrollListeners;
        if (list != null) {
            list.remove(tVar);
        }
    }

    public void removeRecyclerListener(@NonNull w wVar) {
        this.mRecyclerListeners.remove(wVar);
    }

    public void repositionShadowingViews() {
        e0 e0Var;
        int e2 = this.mChildHelper.e();
        for (int i2 = 0; i2 < e2; i2++) {
            View d2 = this.mChildHelper.d(i2);
            e0 childViewHolder = getChildViewHolder(d2);
            if (childViewHolder != null && (e0Var = childViewHolder.mShadowingHolder) != null) {
                View view = e0Var.itemView;
                int left = d2.getLeft();
                int top = d2.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.mLayout.onRequestChildFocus(this, this.mState, view, view2) && view2 != null) {
            requestChildOnScreen(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.mLayout.requestChildRectangleOnScreen(this, view, rect, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z2) {
        int size = this.mOnItemTouchListeners.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mOnItemTouchListeners.get(i2).h(z2);
        }
        super.requestDisallowInterceptTouchEvent(z2);
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
        int h2 = this.mChildHelper.h();
        for (int i2 = 0; i2 < h2; i2++) {
            e0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i2));
            if (sDebugAssertionsEnabled && childViewHolderInt.mPosition == -1 && !childViewHolderInt.isRemoved()) {
                throw new IllegalStateException(t9c.a(this, new StringBuilder("view holder cannot have position -1 unless it is removed")));
            }
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.saveOldPosition();
            }
        }
    }

    @Override // android.view.View
    public void scrollBy(int i2, int i3) {
        o oVar = this.mLayout;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        boolean canScrollHorizontally = oVar.canScrollHorizontally();
        boolean canScrollVertically = this.mLayout.canScrollVertically();
        if (canScrollHorizontally || canScrollVertically) {
            if (!canScrollHorizontally) {
                i2 = 0;
            }
            if (!canScrollVertically) {
                i3 = 0;
            }
            scrollByInternal(i2, i3, null, 0);
        }
    }

    public boolean scrollByInternal(int i2, int i3, MotionEvent motionEvent, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i2, i3, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i9 = iArr2[0];
            int i10 = iArr2[1];
            i7 = i2 - i9;
            i8 = i3 - i10;
            i6 = i10;
            i5 = i9;
        } else {
            i5 = 0;
            i6 = 0;
            i7 = 0;
            i8 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i5, i6, i7, i8, this.mScrollOffset, i4, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i11 = iArr4[0];
        int i12 = i7 - i11;
        int i13 = iArr4[1];
        int i14 = i8 - i13;
        boolean z2 = (i11 == 0 && i13 == 0) ? false : true;
        int i15 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        int i16 = iArr5[0];
        this.mLastTouchX = i15 - i16;
        int i17 = this.mLastTouchY;
        int i18 = iArr5[1];
        this.mLastTouchY = i17 - i18;
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + i16;
        iArr6[1] = iArr6[1] + i18;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !fsk.y(motionEvent, 8194)) {
                pullGlows(motionEvent.getX(), i12, motionEvent.getY(), i14);
            }
            considerReleasingGlowsOnScroll(i2, i3);
        }
        if (i5 != 0 || i6 != 0) {
            dispatchOnScrolled(i5, i6);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z2 && i5 == 0 && i6 == 0) ? false : true;
    }

    public void scrollStep(int i2, int i3, @Nullable int[] iArr) {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        pdp0.a("RV Scroll");
        fillRemainingScrollValues(this.mState);
        int scrollHorizontallyBy = i2 != 0 ? this.mLayout.scrollHorizontallyBy(i2, this.mRecycler, this.mState) : 0;
        int scrollVerticallyBy = i3 != 0 ? this.mLayout.scrollVerticallyBy(i3, this.mRecycler, this.mState) : 0;
        pdp0.b();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = scrollHorizontallyBy;
            iArr[1] = scrollVerticallyBy;
        }
    }

    public void scrollToPosition(int i2) {
        if (this.mLayoutSuppressed) {
            return;
        }
        stopScroll();
        o oVar = this.mLayout;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            oVar.scrollToPosition(i2);
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

    public void setAccessibilityDelegateCompat(@Nullable l0 l0Var) {
        this.mAccessibilityDelegate = l0Var;
        iut0.q(this, l0Var);
    }

    public void setAdapter(@Nullable Adapter adapter) {
        setLayoutFrozen(false);
        setAdapterInternal(adapter, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(@Nullable j jVar) {
        if (jVar == this.mChildDrawingOrderCallback) {
            return;
        }
        this.mChildDrawingOrderCallback = jVar;
        setChildrenDrawingOrderEnabled(jVar != null);
    }

    public boolean setChildImportantForAccessibilityInternal(e0 e0Var, int i2) {
        if (isComputingLayout()) {
            e0Var.mPendingAccessibilityState = i2;
            this.mPendingAccessibilityImportanceChange.add(e0Var);
            return false;
        }
        View view = e0Var.itemView;
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        view.setImportantForAccessibility(i2);
        return true;
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z2) {
        if (z2 != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z2;
        super.setClipToPadding(z2);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(@NonNull k kVar) {
        kVar.getClass();
        this.mEdgeEffectFactory = kVar;
        invalidateGlows();
    }

    public void setHasFixedSize(boolean z2) {
        this.mHasFixedSize = z2;
    }

    public void setItemAnimator(@Nullable l lVar) {
        l lVar2 = this.mItemAnimator;
        if (lVar2 != null) {
            lVar2.k();
            this.mItemAnimator.u(null);
        }
        this.mItemAnimator = lVar;
        if (lVar != null) {
            lVar.u(this.mItemAnimatorListener);
        }
    }

    public void setItemViewCacheSize(int i2) {
        v vVar = this.mRecycler;
        vVar.e = i2;
        vVar.q();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z2) {
        suppressLayout(z2);
    }

    public void setLayoutManager(@Nullable o oVar) {
        if (oVar == this.mLayout) {
            return;
        }
        stopScroll();
        if (this.mLayout != null) {
            l lVar = this.mItemAnimator;
            if (lVar != null) {
                lVar.k();
            }
            this.mLayout.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
            this.mRecycler.c();
            if (this.mIsAttached) {
                this.mLayout.dispatchDetachedFromWindow(this, this.mRecycler);
            }
            this.mLayout.setRecyclerView(null);
            this.mLayout = null;
        } else {
            this.mRecycler.c();
        }
        androidx.recyclerview.widget.e eVar = this.mChildHelper;
        RecyclerView recyclerView = RecyclerView.this;
        eVar.b.g();
        ArrayList arrayList = eVar.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            e0 childViewHolderInt = getChildViewHolderInt((View) arrayList.get(size));
            if (childViewHolderInt != null) {
                childViewHolderInt.onLeftHiddenState(recyclerView);
            }
            arrayList.remove(size);
        }
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            recyclerView.dispatchChildDetached(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.mLayout = oVar;
        if (oVar != null) {
            if (oVar.mRecyclerView != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(oVar);
                sb.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(t9c.a(oVar.mRecyclerView, sb));
            }
            oVar.setRecyclerView(this);
            if (this.mIsAttached) {
                this.mLayout.dispatchAttachedToWindow(this);
            }
        }
        this.mRecycler.q();
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
    public void setNestedScrollingEnabled(boolean z2) {
        getScrollingChildHelper().g(z2);
    }

    public void setOnFlingListener(@Nullable r rVar) {
        this.mOnFlingListener = rVar;
    }

    @Deprecated
    public void setOnScrollListener(@Nullable t tVar) {
        this.mScrollListener = tVar;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.mPreserveFocusAfterLayout = z2;
    }

    public void setRecycledViewPool(@Nullable u uVar) {
        v vVar = this.mRecycler;
        RecyclerView recyclerView = RecyclerView.this;
        Adapter<?> adapter = recyclerView.mAdapter;
        u uVar2 = vVar.g;
        if (uVar2 != null) {
            uVar2.detachForPoolingContainer(adapter, false);
        }
        u uVar3 = vVar.g;
        if (uVar3 != null) {
            uVar3.detach();
        }
        vVar.g = uVar;
        if (uVar != null && recyclerView.getAdapter() != null) {
            vVar.g.attach();
        }
        vVar.h();
    }

    @Deprecated
    public void setRecyclerListener(@Nullable w wVar) {
        this.mRecyclerListener = wVar;
    }

    public void setScrollState(int i2) {
        if (i2 == this.mScrollState) {
            return;
        }
        if (sVerboseLoggingEnabled) {
            new Exception();
        }
        this.mScrollState = i2;
        if (i2 != 2) {
            stopScrollersInternal();
        }
        dispatchOnScrollStateChanged(i2);
    }

    public void setScrollingTouchSlop(int i2) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i2 != 1) {
            this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        } else {
            this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        }
    }

    public void setViewCacheExtension(@Nullable c0 c0Var) {
        this.mRecycler.getClass();
    }

    public boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (!isComputingLayout()) {
            return false;
        }
        int a2 = accessibilityEvent != null ? jk.a(accessibilityEvent) : 0;
        this.mEatenAccessibilityChangeFlags |= a2 != 0 ? a2 : 0;
        return true;
    }

    public void smoothScrollBy(int i2, int i3) {
        smoothScrollBy(i2, i3, null);
    }

    public void smoothScrollToPosition(int i2) {
        if (this.mLayoutSuppressed) {
            return;
        }
        o oVar = this.mLayout;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            oVar.smoothScrollToPosition(this, this.mState, i2);
        }
    }

    public void startInterceptRequestLayout() {
        int i2 = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i2;
        if (i2 != 1 || this.mLayoutSuppressed) {
            return;
        }
        this.mLayoutWasDefered = false;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i2) {
        return getScrollingChildHelper().h(i2, 0);
    }

    public void stopInterceptRequestLayout(boolean z2) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            if (sDebugAssertionsEnabled) {
                throw new IllegalStateException(t9c.a(this, new StringBuilder("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.")));
            }
            this.mInterceptRequestLayoutDepth = 1;
        }
        if (!z2 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z2 && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
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
        getScrollingChildHelper().i(0);
    }

    public void stopScroll() {
        setScrollState(0);
        stopScrollersInternal();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z2) {
        if (z2 != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (z2) {
                long uptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
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

    public void swapAdapter(@Nullable Adapter adapter, boolean z2) {
        setLayoutFrozen(false);
        setAdapterInternal(adapter, true, z2);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    public void viewRangeUpdate(int i2, int i3, Object obj) {
        int i4;
        int i5;
        int h2 = this.mChildHelper.h();
        int i6 = i3 + i2;
        for (int i7 = 0; i7 < h2; i7++) {
            View g2 = this.mChildHelper.g(i7);
            e0 childViewHolderInt = getChildViewHolderInt(g2);
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && (i5 = childViewHolderInt.mPosition) >= i2 && i5 < i6) {
                childViewHolderInt.addFlags(2);
                childViewHolderInt.addChangePayload(obj);
                ((p) g2.getLayoutParams()).d = true;
            }
        }
        v vVar = this.mRecycler;
        ArrayList<e0> arrayList = vVar.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            e0 e0Var = arrayList.get(size);
            if (e0Var != null && (i4 = e0Var.mPosition) >= i2 && i4 < i6) {
                e0Var.addFlags(2);
                vVar.j(size);
            }
        }
    }

    public static abstract class Adapter<VH extends e0> {
        private final h mObservable = new h();
        private boolean mHasStableIds = false;
        private StateRestorationPolicy mStateRestorationPolicy = StateRestorationPolicy.ALLOW;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class StateRestorationPolicy {
            private static final /* synthetic */ StateRestorationPolicy[] $VALUES;
            public static final StateRestorationPolicy ALLOW;
            public static final StateRestorationPolicy PREVENT;
            public static final StateRestorationPolicy PREVENT_WHEN_EMPTY;

            static {
                StateRestorationPolicy stateRestorationPolicy = new StateRestorationPolicy("ALLOW", 0);
                ALLOW = stateRestorationPolicy;
                StateRestorationPolicy stateRestorationPolicy2 = new StateRestorationPolicy("PREVENT_WHEN_EMPTY", 1);
                PREVENT_WHEN_EMPTY = stateRestorationPolicy2;
                StateRestorationPolicy stateRestorationPolicy3 = new StateRestorationPolicy("PREVENT", 2);
                PREVENT = stateRestorationPolicy3;
                $VALUES = new StateRestorationPolicy[]{stateRestorationPolicy, stateRestorationPolicy2, stateRestorationPolicy3};
            }

            public StateRestorationPolicy() {
                throw null;
            }

            public static StateRestorationPolicy valueOf(String str) {
                return (StateRestorationPolicy) Enum.valueOf(StateRestorationPolicy.class, str);
            }

            public static StateRestorationPolicy[] values() {
                return (StateRestorationPolicy[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void bindViewHolder(@NonNull VH vh, int i) {
            boolean z = vh.mBindingAdapter == null;
            if (z) {
                vh.mPosition = i;
                if (hasStableIds()) {
                    vh.mItemId = getItemId(i);
                }
                vh.setFlags(1, 519);
                pdp0.a("RV OnBindView");
            }
            vh.mBindingAdapter = this;
            if (RecyclerView.sDebugAssertionsEnabled) {
                if (vh.itemView.getParent() == null) {
                    View view = vh.itemView;
                    WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                    if (view.isAttachedToWindow() != vh.isTmpDetached()) {
                        throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + vh.isTmpDetached() + ", attached to window: " + vh.itemView.isAttachedToWindow() + ", holder: " + vh);
                    }
                }
                if (vh.itemView.getParent() == null) {
                    View view2 = vh.itemView;
                    WeakHashMap<View, b0u0> weakHashMap2 = iut0.a;
                    if (view2.isAttachedToWindow()) {
                        throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + vh);
                    }
                }
            }
            onBindViewHolder(vh, i, vh.getUnmodifiedPayloads());
            if (z) {
                vh.clearPayload();
                ViewGroup.LayoutParams layoutParams = vh.itemView.getLayoutParams();
                if (layoutParams instanceof p) {
                    ((p) layoutParams).d = true;
                }
                pdp0.b();
            }
        }

        public boolean canRestoreState() {
            int i = g.a[this.mStateRestorationPolicy.ordinal()];
            return i != 1 && (i != 2 || getItemCount() > 0);
        }

        @NonNull
        public final VH createViewHolder(@NonNull ViewGroup viewGroup, int i) {
            try {
                pdp0.a("RV CreateView");
                VH onCreateViewHolder = onCreateViewHolder(viewGroup, i);
                if (onCreateViewHolder.itemView.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                onCreateViewHolder.mItemViewType = i;
                return onCreateViewHolder;
            } finally {
                pdp0.b();
            }
        }

        public int findRelativeAdapterPositionIn(@NonNull Adapter<? extends e0> adapter, @NonNull e0 e0Var, int i) {
            if (adapter == this) {
                return i;
            }
            return -1;
        }

        public abstract int getItemCount();

        public long getItemId(int i) {
            return -1L;
        }

        public int getItemViewType(int i) {
            return 0;
        }

        @NonNull
        public final StateRestorationPolicy getStateRestorationPolicy() {
            return this.mStateRestorationPolicy;
        }

        public final boolean hasObservers() {
            return this.mObservable.a();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.b();
        }

        public final void notifyItemChanged(int i) {
            this.mObservable.d(i, 1, null);
        }

        public final void notifyItemInserted(int i) {
            this.mObservable.e(i, 1);
        }

        public final void notifyItemMoved(int i, int i2) {
            this.mObservable.c(i, i2);
        }

        public final void notifyItemRangeChanged(int i, int i2) {
            this.mObservable.d(i, i2, null);
        }

        public final void notifyItemRangeInserted(int i, int i2) {
            this.mObservable.e(i, i2);
        }

        public final void notifyItemRangeRemoved(int i, int i2) {
            this.mObservable.f(i, i2);
        }

        public final void notifyItemRemoved(int i) {
            this.mObservable.f(i, 1);
        }

        public abstract void onBindViewHolder(@NonNull VH vh, int i);

        public void onBindViewHolder(@NonNull VH vh, int i, @NonNull List<Object> list) {
            onBindViewHolder(vh, i);
        }

        @NonNull
        public abstract VH onCreateViewHolder(@NonNull ViewGroup viewGroup, int i);

        public boolean onFailedToRecycleView(@NonNull VH vh) {
            return false;
        }

        public void registerAdapterDataObserver(@NonNull i iVar) {
            this.mObservable.registerObserver(iVar);
        }

        public void setHasStableIds(boolean z) {
            if (hasObservers()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.mHasStableIds = z;
        }

        public void setStateRestorationPolicy(@NonNull StateRestorationPolicy stateRestorationPolicy) {
            this.mStateRestorationPolicy = stateRestorationPolicy;
            this.mObservable.g();
        }

        public int u() {
            return getItemCount();
        }

        public void unregisterAdapterDataObserver(@NonNull i iVar) {
            this.mObservable.unregisterObserver(iVar);
        }

        public final void notifyItemChanged(int i, @Nullable Object obj) {
            this.mObservable.d(i, 1, obj);
        }

        public final void notifyItemRangeChanged(int i, int i2, @Nullable Object obj) {
            this.mObservable.d(i, i2, obj);
        }

        public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        }

        public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        }

        public void onViewAttachedToWindow(@NonNull VH vh) {
        }

        public void onViewDetachedFromWindow(@NonNull VH vh) {
        }

        public void onViewRecycled(@NonNull VH vh) {
        }
    }

    public RecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, androidx.recyclerview.R.attr.recyclerViewStyle);
    }

    public void onExitLayoutOrScroll(boolean z2) {
        int i2 = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i2;
        if (i2 < 1) {
            if (sDebugAssertionsEnabled && i2 < 0) {
                throw new IllegalStateException(t9c.a(this, new StringBuilder("layout or scroll counter cannot go below zero.Some calls are not matching")));
            }
            this.mLayoutOrScrollCounter = 0;
            if (z2) {
                dispatchContentChangedIfNecessary();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    public void smoothScrollBy(int i2, int i3, @Nullable Interpolator interpolator) {
        smoothScrollBy(i2, i3, interpolator, Integer.MIN_VALUE);
    }

    /* loaded from: classes12.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public Parcelable d;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.d = parcel.readParcelable(classLoader == null ? o.class.getClassLoader() : classLoader);
        }

        public final void e(SavedState savedState) {
            this.d = savedState.d;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.d, 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public RecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.mObserver = new x();
        this.mRecycler = new v();
        this.mViewInfoStore = new r0();
        this.mUpdateChildViewsRunnable = new a();
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
        this.mItemAnimator = new androidx.recyclerview.widget.g();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new d0();
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new q.b() : null;
        this.mState = new a0();
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new m();
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new b();
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mViewInfoProcessCallback = new d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mScaledHorizontalScrollFactor = viewConfiguration.getScaledHorizontalScrollFactor();
        this.mScaledVerticalScrollFactor = viewConfiguration.getScaledVerticalScrollFactor();
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mPhysicalCoef = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.u(this.mItemAnimatorListener);
        initAdapterManager();
        initChildrenHelper();
        initAutofill();
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new l0(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.recyclerview.R.styleable.RecyclerView, i2, 0);
        iut0.p(this, context, androidx.recyclerview.R.styleable.RecyclerView, attributeSet, obtainStyledAttributes, i2);
        String string = obtainStyledAttributes.getString(androidx.recyclerview.R.styleable.RecyclerView_layoutManager);
        if (obtainStyledAttributes.getInt(androidx.recyclerview.R.styleable.RecyclerView_android_descendantFocusability, -1) == -1) {
            setDescendantFocusability(SQLiteDatabase.OPEN_PRIVATECACHE);
        }
        this.mClipToPadding = obtainStyledAttributes.getBoolean(androidx.recyclerview.R.styleable.RecyclerView_android_clipToPadding, true);
        boolean z2 = obtainStyledAttributes.getBoolean(androidx.recyclerview.R.styleable.RecyclerView_fastScrollEnabled, false);
        this.mEnableFastScroller = z2;
        if (z2) {
            initFastScroller((StateListDrawable) obtainStyledAttributes.getDrawable(androidx.recyclerview.R.styleable.RecyclerView_fastScrollVerticalThumbDrawable), obtainStyledAttributes.getDrawable(androidx.recyclerview.R.styleable.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable) obtainStyledAttributes.getDrawable(androidx.recyclerview.R.styleable.RecyclerView_fastScrollHorizontalThumbDrawable), obtainStyledAttributes.getDrawable(androidx.recyclerview.R.styleable.RecyclerView_fastScrollHorizontalTrackDrawable));
        }
        obtainStyledAttributes.recycle();
        createLayoutManager(context, string, attributeSet, i2, 0);
        int[] iArr = NESTED_SCROLLING_ATTRS;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        iut0.p(this, context, iArr, attributeSet, obtainStyledAttributes2, i2);
        boolean z3 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z3);
        setTag(com.vkontakte.android.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return getScrollingChildHelper().c(i2, i3, iArr, iArr2, i4);
    }

    public final void dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr, int i6, @NonNull int[] iArr2) {
        getScrollingChildHelper().d(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    public void smoothScrollBy(int i2, int i3, @Nullable Interpolator interpolator, int i4) {
        smoothScrollBy(i2, i3, interpolator, i4, false);
    }

    public boolean startNestedScroll(int i2, int i3) {
        return getScrollingChildHelper().h(i2, i3);
    }

    @Override // xsna.q160
    public void stopNestedScroll(int i2) {
        getScrollingChildHelper().i(i2);
    }

    /* loaded from: classes12.dex */
    public static class p extends ViewGroup.MarginLayoutParams {
        public e0 b;
        public final Rect c;
        public boolean d;
        public boolean e;

        public p(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.c = new Rect();
            this.d = true;
            this.e = false;
        }

        public final int d() {
            return this.b.getLayoutPosition();
        }

        public final boolean e() {
            return this.b.isUpdated();
        }

        public final boolean f() {
            return this.b.isRemoved();
        }

        public final boolean g() {
            return this.b.isInvalid();
        }

        public p(int i, int i2) {
            super(i, i2);
            this.c = new Rect();
            this.d = true;
            this.e = false;
        }

        public p(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.c = new Rect();
            this.d = true;
            this.e = false;
        }

        public p(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.c = new Rect();
            this.d = true;
            this.e = false;
        }

        public p(p pVar) {
            super((ViewGroup.LayoutParams) pVar);
            this.c = new Rect();
            this.d = true;
            this.e = false;
        }
    }

    public void smoothScrollBy(int i2, int i3, @Nullable Interpolator interpolator, int i4, boolean z2) {
        o oVar = this.mLayout;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        if (!oVar.canScrollHorizontally()) {
            i2 = 0;
        }
        if (!this.mLayout.canScrollVertically()) {
            i3 = 0;
        }
        if (i2 == 0 && i3 == 0) {
            return;
        }
        if (i4 != Integer.MIN_VALUE && i4 <= 0) {
            scrollBy(i2, i3);
            return;
        }
        if (z2) {
            int i5 = i2 != 0 ? 1 : 0;
            if (i3 != 0) {
                i5 |= 2;
            }
            startNestedScroll(i5, 1);
        }
        this.mViewFlinger.c(i2, i3, interpolator, i4);
    }

    public void addItemDecoration(@NonNull n nVar) {
        addItemDecoration(nVar, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        o oVar = this.mLayout;
        if (oVar != null) {
            return oVar.generateLayoutParams(layoutParams);
        }
        throw new IllegalStateException(t9c.a(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    public static abstract class i {
        public void d(int i, int i2, @Nullable Object obj) {
            c(i, i2);
        }

        public void b() {
        }

        public void h() {
        }

        public void c(int i, int i2) {
        }

        public void e(int i, int i2) {
        }

        public void f(int i, int i2) {
        }

        public void g(int i, int i2) {
        }
    }

    public static abstract class l {
        public b a = null;
        public final ArrayList<a> b = new ArrayList<>();
        public long c = 120;
        public long d = 120;
        public long e = 250;
        public long f = 250;

        /* loaded from: classes12.dex */
        public interface a {
            void a();
        }

        public interface b {
        }

        /* loaded from: classes12.dex */
        public static class c {
            public int a;
            public int b;

            @NonNull
            public final void a(@NonNull e0 e0Var) {
                View view = e0Var.itemView;
                this.a = view.getLeft();
                this.b = view.getTop();
                view.getRight();
                view.getBottom();
            }
        }

        public static int e(e0 e0Var) {
            int i = e0Var.mFlags;
            int i2 = i & 14;
            if (e0Var.isInvalid()) {
                return 4;
            }
            if ((i & 4) == 0) {
                int oldPosition = e0Var.getOldPosition();
                int absoluteAdapterPosition = e0Var.getAbsoluteAdapterPosition();
                if (oldPosition != -1 && absoluteAdapterPosition != -1 && oldPosition != absoluteAdapterPosition) {
                    return i2 | 2048;
                }
            }
            return i2;
        }

        public abstract boolean a(@NonNull e0 e0Var, @Nullable c cVar, @NonNull c cVar2);

        public abstract boolean b(@NonNull e0 e0Var, @NonNull e0 e0Var2, @NonNull c cVar, @NonNull c cVar2);

        public abstract boolean c(@NonNull e0 e0Var, @NonNull c cVar, @Nullable c cVar2);

        public abstract boolean d(@NonNull e0 e0Var, @NonNull c cVar, @NonNull c cVar2);

        public boolean f(@NonNull e0 e0Var) {
            return true;
        }

        public boolean g(@NonNull e0 e0Var, @NonNull List<Object> list) {
            return f(e0Var);
        }

        public final void h(@NonNull e0 e0Var) {
            p();
            b bVar = this.a;
            if (bVar != null) {
                RecyclerView recyclerView = RecyclerView.this;
                e0Var.setIsRecyclable(true);
                if (e0Var.mShadowedHolder != null && e0Var.mShadowingHolder == null) {
                    e0Var.mShadowedHolder = null;
                }
                e0Var.mShadowingHolder = null;
                if (e0Var.shouldBeKeptAsChild() || recyclerView.removeAnimatingView(e0Var.itemView) || !e0Var.isTmpDetached()) {
                    return;
                }
                recyclerView.removeDetachedView(e0Var.itemView, false);
            }
        }

        public final void i() {
            ArrayList<a> arrayList = this.b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                arrayList.get(i).a();
            }
            arrayList.clear();
        }

        public abstract void j(@NonNull e0 e0Var);

        public abstract void k();

        public long l() {
            return this.e;
        }

        public long m() {
            return this.d;
        }

        public abstract boolean n();

        public final boolean o(@Nullable a aVar) {
            boolean n = n();
            if (aVar != null) {
                if (!n) {
                    aVar.a();
                    return n;
                }
                this.b.add(aVar);
            }
            return n;
        }

        @NonNull
        public c q(@NonNull a0 a0Var, @NonNull e0 e0Var, int i, @NonNull List<Object> list) {
            c cVar = new c();
            cVar.a(e0Var);
            return cVar;
        }

        public abstract void r();

        public void s() {
            this.c = 0L;
        }

        public void t() {
            this.f = 0L;
        }

        public void u(b bVar) {
            this.a = bVar;
        }

        public void v() {
            this.e = 150L;
        }

        public void p() {
        }
    }

    /* loaded from: classes12.dex */
    public static class y implements s {
        @Override // androidx.recyclerview.widget.RecyclerView.s
        public final void h(boolean z) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public final void f(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
        }
    }

    public void onChildAttachedToWindow(@NonNull View view) {
    }

    public void onChildDetachedFromWindow(@NonNull View view) {
    }

    public void onScrollStateChanged(int i2) {
    }

    public static abstract class t {
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
        }

        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
        }
    }

    public void onScrolled(int i2, int i3) {
    }

    @Override // android.view.View
    public void scrollTo(int i2, int i3) {
    }
}
