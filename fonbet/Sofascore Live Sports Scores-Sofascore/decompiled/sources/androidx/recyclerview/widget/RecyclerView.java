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
import androidx.annotation.Nullable;
import androidx.customview.view.AbsSavedState;
import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.a70;
import defpackage.aca;
import defpackage.am0;
import defpackage.arf;
import defpackage.bka;
import defpackage.brf;
import defpackage.bsk;
import defpackage.crf;
import defpackage.ctk;
import defpackage.d4a;
import defpackage.drf;
import defpackage.dtk;
import defpackage.e3c;
import defpackage.eh;
import defpackage.erf;
import defpackage.etk;
import defpackage.fc6;
import defpackage.fhh;
import defpackage.fsk;
import defpackage.hrf;
import defpackage.irf;
import defpackage.is8;
import defpackage.jrf;
import defpackage.krf;
import defpackage.l4a;
import defpackage.lrf;
import defpackage.mrf;
import defpackage.mz1;
import defpackage.n25;
import defpackage.nq4;
import defpackage.nrf;
import defpackage.o25;
import defpackage.o9d;
import defpackage.oyn;
import defpackage.p9d;
import defpackage.pvd;
import defpackage.qha;
import defpackage.qrf;
import defpackage.rrf;
import defpackage.sea;
import defpackage.srf;
import defpackage.tsk;
import defpackage.urf;
import defpackage.usk;
import defpackage.uvg;
import defpackage.vrk;
import defpackage.yhk;
import defpackage.zzl;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements uvg, o9d {
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
    static final rrf sDefaultEdgeEffectFactory;
    static final Interpolator sQuinticInterpolator;
    static boolean sVerboseLoggingEnabled = false;
    urf mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    l mAdapter;
    a mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private arf mChildDrawingOrderCallback;
    b mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    n25 mDifferentialMotionFlingController;
    private final o25 mDifferentialMotionFlingTarget;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;

    @NonNull
    private brf mEdgeEffectFactory;
    boolean mEnableFastScroller;
    boolean mFirstLayoutComplete;
    f mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private krf mInterceptingOnItemTouchListener;
    boolean mIsAttached;
    m mItemAnimator;
    private crf mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    final ArrayList<erf> mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastAutoMeasureNonExactMeasuredHeight;
    private int mLastAutoMeasureNonExactMeasuredWidth;
    private boolean mLastAutoMeasureSkippedDueToExact;
    private int mLastTouchX;
    private int mLastTouchY;
    n mLayout;
    private int mLayoutOrScrollCounter;
    boolean mLayoutSuppressed;
    boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    boolean mLowResRotaryEncoderFeature;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final p mObserver;
    private List<irf> mOnChildAttachStateListeners;
    private jrf mOnFlingListener;
    private final ArrayList<krf> mOnItemTouchListeners;
    final List<u> mPendingAccessibilityImportanceChange;
    SavedState mPendingSavedState;
    private final float mPhysicalCoef;
    boolean mPostedAnimatorRunner;
    e mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final o mRecycler;
    nrf mRecyclerListener;
    final List<nrf> mRecyclerListeners;
    final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    float mScaledHorizontalScrollFactor;
    float mScaledVerticalScrollFactor;
    private OnScrollListener mScrollListener;
    private List<OnScrollListener> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private p9d mScrollingChildHelper;
    final qrf mState;
    final Rect mTempRect;
    private final Rect mTempRect2;
    final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    final t mViewFlinger;
    private final dtk mViewInfoProcessCallback;
    final etk mViewInfoStore;
    private static final int[] NESTED_SCROLLING_ATTRS = {R.attr.nestedScrollingEnabled};
    private static final float DECELERATION_RATE = (float) (Math.log(0.78d) / Math.log(0.9d));
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST = false;
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = true;
    static final boolean ALLOW_THREAD_GAP_WORK = true;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new q();
        public Parcelable c;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readParcelable(classLoader == null ? n.class.getClassLoader() : classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.c, 0);
        }
    }

    static {
        Class cls = Integer.TYPE;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, cls, cls};
        sQuinticInterpolator = new aca(2);
        sDefaultEdgeEffectFactory = new rrf();
    }

    public RecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mObserver = new p(this);
        this.mRecycler = new o(this);
        this.mViewInfoStore = new etk();
        this.mUpdateChildViewsRunnable = new j(this, 0);
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
        nq4 nq4Var = new nq4();
        nq4Var.a = null;
        nq4Var.b = new ArrayList();
        nq4Var.c = 120L;
        nq4Var.d = 120L;
        nq4Var.e = 250L;
        nq4Var.f = 250L;
        int i2 = 1;
        nq4Var.g = true;
        nq4Var.h = new ArrayList();
        nq4Var.i = new ArrayList();
        nq4Var.j = new ArrayList();
        nq4Var.k = new ArrayList();
        nq4Var.l = new ArrayList();
        nq4Var.m = new ArrayList();
        nq4Var.n = new ArrayList();
        nq4Var.o = new ArrayList();
        nq4Var.p = new ArrayList();
        nq4Var.q = new ArrayList();
        nq4Var.r = new ArrayList();
        this.mItemAnimator = nq4Var;
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new t(this);
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new e() : null;
        qrf qrfVar = new qrf();
        qrfVar.a = -1;
        qrfVar.b = 0;
        qrfVar.c = 0;
        qrfVar.d = 1;
        qrfVar.e = 0;
        qrfVar.f = false;
        qrfVar.g = false;
        qrfVar.h = false;
        qrfVar.i = false;
        qrfVar.j = false;
        qrfVar.k = false;
        this.mState = qrfVar;
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new e3c(this, 9);
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new j(this, i2);
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mViewInfoProcessCallback = new bka(this, 13);
        k kVar = new k(this);
        this.mDifferentialMotionFlingTarget = kVar;
        this.mDifferentialMotionFlingController = new n25(getContext(), kVar);
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
        this.mItemAnimator.a = this.mItemAnimatorListener;
        initAdapterManager();
        initChildrenHelper();
        initAutofill();
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new urf(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.recyclerview.R.styleable.RecyclerView, i, 0);
        bsk.p(this, context, androidx.recyclerview.R.styleable.RecyclerView, attributeSet, obtainStyledAttributes, i);
        String string = obtainStyledAttributes.getString(androidx.recyclerview.R.styleable.RecyclerView_layoutManager);
        if (obtainStyledAttributes.getInt(androidx.recyclerview.R.styleable.RecyclerView_android_descendantFocusability, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.mClipToPadding = obtainStyledAttributes.getBoolean(androidx.recyclerview.R.styleable.RecyclerView_android_clipToPadding, true);
        boolean z = obtainStyledAttributes.getBoolean(androidx.recyclerview.R.styleable.RecyclerView_fastScrollEnabled, false);
        this.mEnableFastScroller = z;
        if (z) {
            initFastScroller((StateListDrawable) obtainStyledAttributes.getDrawable(androidx.recyclerview.R.styleable.RecyclerView_fastScrollVerticalThumbDrawable), obtainStyledAttributes.getDrawable(androidx.recyclerview.R.styleable.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable) obtainStyledAttributes.getDrawable(androidx.recyclerview.R.styleable.RecyclerView_fastScrollHorizontalThumbDrawable), obtainStyledAttributes.getDrawable(androidx.recyclerview.R.styleable.RecyclerView_fastScrollHorizontalTrackDrawable));
        }
        obtainStyledAttributes.recycle();
        this.mLowResRotaryEncoderFeature = context.getPackageManager().hasSystemFeature(LOW_RES_ROTARY_ENCODER_FEATURE);
        createLayoutManager(context, string, attributeSet, i, 0);
        int[] iArr = NESTED_SCROLLING_ATTRS;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        bsk.p(this, context, iArr, attributeSet, obtainStyledAttributes2, i);
        boolean z2 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z2);
        setTag(com.sofascore.results.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    private void addAnimatingView(u uVar) {
        View view = uVar.itemView;
        boolean z = view.getParent() == this;
        this.mRecycler.n(getChildViewHolder(view));
        boolean isTmpDetached = uVar.isTmpDetached();
        b bVar = this.mChildHelper;
        if (isTmpDetached) {
            bVar.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z) {
            bVar.a(view, -1, true);
            return;
        }
        int indexOfChild = ((RecyclerView) bVar.a.b).indexOfChild(view);
        if (indexOfChild < 0) {
            is8.c(view, "view is not a child, cannot hide ");
        } else {
            bVar.b.z(indexOfChild);
            bVar.i(view);
        }
    }

    private void animateChange(@NonNull u uVar, @NonNull u uVar2, @NonNull drf drfVar, @NonNull drf drfVar2, boolean z, boolean z2) {
        uVar.setIsRecyclable(false);
        if (z) {
            addAnimatingView(uVar);
        }
        if (uVar != uVar2) {
            if (z2) {
                addAnimatingView(uVar2);
            }
            uVar.mShadowedHolder = uVar2;
            addAnimatingView(uVar);
            this.mRecycler.n(uVar);
            uVar2.setIsRecyclable(false);
            uVar2.mShadowingHolder = uVar;
        }
        if (this.mItemAnimator.a(uVar, uVar2, drfVar, drfVar2)) {
            postAnimationRunner();
        }
    }

    private void cancelScroll() {
        resetScroll();
        setScrollState(0);
    }

    public static void clearNestedRecyclerViewIfNotNested(@NonNull u uVar) {
        WeakReference<RecyclerView> weakReference = uVar.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == uVar.itemView) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            uVar.mNestedRecyclerView = null;
        }
    }

    private int consumeFlingInStretch(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && oyn.D(edgeEffect) != 0.0f) {
            int round = Math.round(oyn.L(edgeEffect, ((-i) * FLING_DESTRETCH_FACTOR) / i2, 0.5f) * ((-i2) / FLING_DESTRETCH_FACTOR));
            if (round != i) {
                edgeEffect.finish();
            }
            return i - round;
        }
        if (i >= 0 || edgeEffect2 == null || oyn.D(edgeEffect2) == 0.0f) {
            return i;
        }
        float f = i2;
        int round2 = Math.round(oyn.L(edgeEffect2, (i * FLING_DESTRETCH_FACTOR) / f, 0.5f) * (f / FLING_DESTRETCH_FACTOR));
        if (round2 != i) {
            edgeEffect2.finish();
        }
        return i - round2;
    }

    private void createLayoutManager(Context context, String str, AttributeSet attributeSet, int i, int i2) {
        Object[] objArr;
        Constructor constructor;
        if (str != null) {
            String trim = str.trim();
            if (trim.isEmpty()) {
                return;
            }
            String fullClassName = getFullClassName(context, trim);
            try {
                Class<? extends U> asSubclass = Class.forName(fullClassName, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(n.class);
                try {
                    constructor = asSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
                } catch (NoSuchMethodException e) {
                    objArr = null;
                    try {
                        constructor = asSubclass.getConstructor(null);
                    } catch (NoSuchMethodException e2) {
                        e2.initCause(e);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + fullClassName, e2);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((n) constructor.newInstance(objArr));
            } catch (ClassCastException e3) {
                pvd.o(attributeSet.getPositionDescription(), ": Class is not a LayoutManager ", fullClassName, e3);
            } catch (ClassNotFoundException e4) {
                pvd.o(attributeSet.getPositionDescription(), ": Unable to find LayoutManager ", fullClassName, e4);
            } catch (IllegalAccessException e5) {
                pvd.o(attributeSet.getPositionDescription(), ": Cannot access non-public constructor ", fullClassName, e5);
            } catch (InstantiationException e6) {
                pvd.o(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", fullClassName, e6);
            } catch (InvocationTargetException e7) {
                pvd.o(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", fullClassName, e7);
            }
        }
    }

    private boolean didChildRangeChange(int i, int i2) {
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        return (iArr[0] == i && iArr[1] == i2) ? false : true;
    }

    private void dispatchContentChangedIfNecessary() {
        int i = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i == 0 || !isAccessibilityEnabled()) {
            return;
        }
        AccessibilityEvent obtain = AccessibilityEvent.obtain();
        obtain.setEventType(com.ironsource.mediationsdk.metadata.a.o);
        obtain.setContentChangeTypes(i);
        sendAccessibilityEventUnchecked(obtain);
    }

    private void dispatchLayoutStep1() {
        ctk ctkVar;
        this.mState.a(1);
        fillRemainingScrollValues(this.mState);
        this.mState.i = false;
        startInterceptRequestLayout();
        etk etkVar = this.mViewInfoStore;
        etkVar.a.clear();
        etkVar.b.a();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        qrf qrfVar = this.mState;
        qrfVar.h = qrfVar.j && this.mItemsChanged;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        qrfVar.g = qrfVar.k;
        qrfVar.e = this.mAdapter.getItemCount();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.j) {
            int e = this.mChildHelper.e();
            for (int i = 0; i < e; i++) {
                u childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i));
                if (!childViewHolderInt.shouldIgnore() && (!childViewHolderInt.isInvalid() || this.mAdapter.hasStableIds())) {
                    m mVar = this.mItemAnimator;
                    m.b(childViewHolderInt);
                    childViewHolderInt.getUnmodifiedPayloads();
                    mVar.getClass();
                    drf drfVar = new drf();
                    drfVar.a(childViewHolderInt);
                    fhh fhhVar = this.mViewInfoStore.a;
                    ctk ctkVar2 = (ctk) fhhVar.get(childViewHolderInt);
                    if (ctkVar2 == null) {
                        ctkVar2 = ctk.a();
                        fhhVar.put(childViewHolderInt, ctkVar2);
                    }
                    ctkVar2.b = drfVar;
                    ctkVar2.a |= 4;
                    if (this.mState.h && childViewHolderInt.isUpdated() && !childViewHolderInt.isRemoved() && !childViewHolderInt.shouldIgnore() && !childViewHolderInt.isInvalid()) {
                        this.mViewInfoStore.b.g(childViewHolderInt, getChangedHolderKey(childViewHolderInt));
                    }
                }
            }
        }
        if (this.mState.k) {
            saveOldPositions();
            qrf qrfVar2 = this.mState;
            boolean z = qrfVar2.f;
            qrfVar2.f = false;
            this.mLayout.onLayoutChildren(this.mRecycler, qrfVar2);
            this.mState.f = z;
            for (int i2 = 0; i2 < this.mChildHelper.e(); i2++) {
                u childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.d(i2));
                if (!childViewHolderInt2.shouldIgnore() && ((ctkVar = (ctk) this.mViewInfoStore.a.get(childViewHolderInt2)) == null || (ctkVar.a & 4) == 0)) {
                    m.b(childViewHolderInt2);
                    boolean hasAnyOfTheFlags = childViewHolderInt2.hasAnyOfTheFlags(8192);
                    m mVar2 = this.mItemAnimator;
                    childViewHolderInt2.getUnmodifiedPayloads();
                    mVar2.getClass();
                    drf drfVar2 = new drf();
                    drfVar2.a(childViewHolderInt2);
                    if (hasAnyOfTheFlags) {
                        recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, drfVar2);
                    } else {
                        fhh fhhVar2 = this.mViewInfoStore.a;
                        ctk ctkVar3 = (ctk) fhhVar2.get(childViewHolderInt2);
                        if (ctkVar3 == null) {
                            ctkVar3 = ctk.a();
                            fhhVar2.put(childViewHolderInt2, ctkVar3);
                        }
                        ctkVar3.a |= 2;
                        ctkVar3.b = drfVar2;
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
            Parcelable parcelable = this.mPendingSavedState.c;
            if (parcelable != null) {
                this.mLayout.onRestoreInstanceState(parcelable);
            }
            this.mPendingSavedState = null;
        }
        qrf qrfVar = this.mState;
        qrfVar.g = false;
        this.mLayout.onLayoutChildren(this.mRecycler, qrfVar);
        qrf qrfVar2 = this.mState;
        qrfVar2.f = false;
        qrfVar2.j = qrfVar2.j && this.mItemAnimator != null;
        qrfVar2.d = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01aa A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void dispatchLayoutStep3() {
        boolean z;
        RecyclerView recyclerView;
        boolean g;
        boolean z2;
        boolean z3;
        this.mState.a(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        qrf qrfVar = this.mState;
        boolean z4 = true;
        qrfVar.d = 1;
        if (qrfVar.j) {
            for (int e = this.mChildHelper.e() - 1; e >= 0; e--) {
                u childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(e));
                if (!childViewHolderInt.shouldIgnore()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    this.mItemAnimator.getClass();
                    drf drfVar = new drf();
                    drfVar.a(childViewHolderInt);
                    u uVar = (u) this.mViewInfoStore.b.c(changedHolderKey);
                    if (uVar == null || uVar.shouldIgnore()) {
                        this.mViewInfoStore.a(childViewHolderInt, drfVar);
                    } else {
                        ctk ctkVar = (ctk) this.mViewInfoStore.a.get(uVar);
                        boolean z5 = (ctkVar == null || (ctkVar.a & 1) == 0) ? false : true;
                        ctk ctkVar2 = (ctk) this.mViewInfoStore.a.get(childViewHolderInt);
                        if (ctkVar2 == null || (ctkVar2.a & 1) == 0) {
                            z2 = z5;
                            z3 = false;
                        } else {
                            z2 = z5;
                            z3 = true;
                        }
                        if (z2 && uVar == childViewHolderInt) {
                            this.mViewInfoStore.a(childViewHolderInt, drfVar);
                        } else {
                            drf b = this.mViewInfoStore.b(uVar, 4);
                            this.mViewInfoStore.a(childViewHolderInt, drfVar);
                            drf b2 = this.mViewInfoStore.b(childViewHolderInt, 8);
                            if (b == null) {
                                handleMissingPreInfoForChangeError(changedHolderKey, childViewHolderInt, uVar);
                            } else {
                                animateChange(uVar, childViewHolderInt, b, b2, z2, z3);
                            }
                        }
                    }
                }
            }
            etk etkVar = this.mViewInfoStore;
            dtk dtkVar = this.mViewInfoProcessCallback;
            fhh fhhVar = etkVar.a;
            int i = fhhVar.c - 1;
            while (i >= 0) {
                u uVar2 = (u) fhhVar.g(i);
                ctk ctkVar3 = (ctk) fhhVar.i(i);
                int i2 = ctkVar3.a;
                if ((i2 & 3) == 3) {
                    RecyclerView recyclerView2 = (RecyclerView) ((bka) dtkVar).b;
                    recyclerView2.mLayout.removeAndRecycleView(uVar2.itemView, recyclerView2.mRecycler);
                } else if ((i2 & 1) != 0) {
                    drf drfVar2 = ctkVar3.b;
                    if (drfVar2 == null) {
                        RecyclerView recyclerView3 = (RecyclerView) ((bka) dtkVar).b;
                        recyclerView3.mLayout.removeAndRecycleView(uVar2.itemView, recyclerView3.mRecycler);
                    } else {
                        drf drfVar3 = ctkVar3.c;
                        RecyclerView recyclerView4 = (RecyclerView) ((bka) dtkVar).b;
                        recyclerView4.mRecycler.n(uVar2);
                        recyclerView4.animateDisappearance(uVar2, drfVar2, drfVar3);
                    }
                } else if ((i2 & 14) == 14) {
                    ((RecyclerView) ((bka) dtkVar).b).animateAppearance(uVar2, ctkVar3.b, ctkVar3.c);
                } else {
                    if ((i2 & 12) == 12) {
                        drf drfVar4 = ctkVar3.b;
                        drf drfVar5 = ctkVar3.c;
                        bka bkaVar = (bka) dtkVar;
                        bkaVar.getClass();
                        uVar2.setIsRecyclable(false);
                        RecyclerView recyclerView5 = (RecyclerView) bkaVar.b;
                        boolean z6 = recyclerView5.mDataSetHasChangedAfterLayout;
                        m mVar = recyclerView5.mItemAnimator;
                        if (!z6) {
                            nq4 nq4Var = (nq4) mVar;
                            nq4Var.getClass();
                            int i3 = drfVar4.a;
                            int i4 = drfVar5.a;
                            if (i3 == i4) {
                                z = z4;
                                if (drfVar4.b == drfVar5.b) {
                                    nq4Var.c(uVar2);
                                    g = false;
                                    recyclerView = recyclerView5;
                                    if (!g) {
                                        recyclerView.postAnimationRunner();
                                    }
                                }
                            } else {
                                z = z4;
                            }
                            recyclerView = recyclerView5;
                            g = nq4Var.g(uVar2, i3, drfVar4.b, i4, drfVar5.b);
                            if (!g) {
                            }
                        } else if (mVar.a(uVar2, uVar2, drfVar4, drfVar5)) {
                            recyclerView5.postAnimationRunner();
                        }
                    } else {
                        z = z4;
                        if ((i2 & 4) != 0) {
                            drf drfVar6 = ctkVar3.b;
                            RecyclerView recyclerView6 = (RecyclerView) ((bka) dtkVar).b;
                            recyclerView6.mRecycler.n(uVar2);
                            recyclerView6.animateDisappearance(uVar2, drfVar6, null);
                        } else if ((i2 & 8) != 0) {
                            ((RecyclerView) ((bka) dtkVar).b).animateAppearance(uVar2, ctkVar3.b, ctkVar3.c);
                        }
                    }
                    ctkVar3.a = 0;
                    ctkVar3.b = null;
                    ctkVar3.c = null;
                    ctk.d.b(ctkVar3);
                    i--;
                    z4 = z;
                }
                z = z4;
                ctkVar3.a = 0;
                ctkVar3.b = null;
                ctkVar3.c = null;
                ctk.d.b(ctkVar3);
                i--;
                z4 = z;
            }
        }
        boolean z7 = z4;
        this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        qrf qrfVar2 = this.mState;
        qrfVar2.b = qrfVar2.e;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        qrfVar2.j = false;
        qrfVar2.k = false;
        this.mLayout.mRequestedSimpleAnimations = false;
        ArrayList arrayList = this.mRecycler.b;
        if (arrayList != null) {
            arrayList.clear();
        }
        n nVar = this.mLayout;
        if (nVar.mPrefetchMaxObservedInInitialPrefetch) {
            nVar.mPrefetchMaxCountObserved = 0;
            nVar.mPrefetchMaxObservedInInitialPrefetch = false;
            this.mRecycler.o();
        }
        this.mLayout.onLayoutCompleted(this.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        etk etkVar2 = this.mViewInfoStore;
        etkVar2.a.clear();
        etkVar2.b.a();
        int[] iArr = this.mMinMaxLayoutPositions;
        if (didChildRangeChange(iArr[0], iArr[z7 ? 1 : 0])) {
            dispatchOnScrolled(0, 0);
        }
        recoverFocusFromState();
        resetFocusInfo();
    }

    private boolean dispatchToOnItemTouchListeners(MotionEvent motionEvent) {
        krf krfVar = this.mInterceptingOnItemTouchListener;
        if (krfVar == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return findInterceptingOnItemTouchListener(motionEvent);
        }
        krfVar.a(this, motionEvent);
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
        for (int i = 0; i < size; i++) {
            krf krfVar = this.mOnItemTouchListeners.get(i);
            if (krfVar.c(this, motionEvent) && action != 3) {
                this.mInterceptingOnItemTouchListener = krfVar;
                return true;
            }
        }
        return false;
    }

    private void findMinMaxChildLayoutPositions(int[] iArr) {
        int e = this.mChildHelper.e();
        if (e == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < e; i3++) {
            u childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i3));
            if (!childViewHolderInt.shouldIgnore()) {
                int layoutPosition = childViewHolderInt.getLayoutPosition();
                if (layoutPosition < i) {
                    i = layoutPosition;
                }
                if (layoutPosition > i2) {
                    i2 = layoutPosition;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
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
        for (int i = 0; i < childCount; i++) {
            RecyclerView findNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i));
            if (findNestedRecyclerView != null) {
                return findNestedRecyclerView;
            }
        }
        return null;
    }

    @Nullable
    private View findNextViewToFocus() {
        u findViewHolderForAdapterPosition;
        qrf qrfVar = this.mState;
        int i = qrfVar.l;
        if (i == -1) {
            i = 0;
        }
        int b = qrfVar.b();
        for (int i2 = i; i2 < b; i2++) {
            u findViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i2);
            if (findViewHolderForAdapterPosition2 == null) {
                break;
            }
            if (findViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                return findViewHolderForAdapterPosition2.itemView;
            }
        }
        int min = Math.min(b, i);
        do {
            min--;
            if (min < 0 || (findViewHolderForAdapterPosition = findViewHolderForAdapterPosition(min)) == null) {
                return null;
            }
        } while (!findViewHolderForAdapterPosition.itemView.hasFocusable());
        return findViewHolderForAdapterPosition.itemView;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean fling(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        float f;
        float f2;
        n nVar = this.mLayout;
        if (nVar == null || this.mLayoutSuppressed) {
            return false;
        }
        boolean canScrollHorizontally = nVar.canScrollHorizontally();
        boolean canScrollVertically = this.mLayout.canScrollVertically();
        if (!canScrollHorizontally || Math.abs(i) < i3) {
            i = 0;
        }
        if (!canScrollVertically || Math.abs(i2) < i3) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return false;
        }
        if (i != 0) {
            EdgeEffect edgeEffect = this.mLeftGlow;
            if (edgeEffect == null || oyn.D(edgeEffect) == 0.0f) {
                EdgeEffect edgeEffect2 = this.mRightGlow;
                if (edgeEffect2 != null && oyn.D(edgeEffect2) != 0.0f) {
                    if (shouldAbsorb(this.mRightGlow, i, getWidth())) {
                        this.mRightGlow.onAbsorb(i);
                        i = 0;
                    }
                    i5 = i;
                    i = 0;
                }
            } else {
                int i7 = -i;
                if (shouldAbsorb(this.mLeftGlow, i7, getWidth())) {
                    this.mLeftGlow.onAbsorb(i7);
                    i = 0;
                }
                i5 = i;
                i = 0;
            }
            if (i2 != 0) {
                EdgeEffect edgeEffect3 = this.mTopGlow;
                if (edgeEffect3 == null || oyn.D(edgeEffect3) == 0.0f) {
                    EdgeEffect edgeEffect4 = this.mBottomGlow;
                    if (edgeEffect4 != null && oyn.D(edgeEffect4) != 0.0f) {
                        if (shouldAbsorb(this.mBottomGlow, i2, getHeight())) {
                            this.mBottomGlow.onAbsorb(i2);
                            i2 = 0;
                        }
                        i6 = 0;
                    }
                } else {
                    int i8 = -i2;
                    if (shouldAbsorb(this.mTopGlow, i8, getHeight())) {
                        this.mTopGlow.onAbsorb(i8);
                        i2 = 0;
                    }
                    i6 = 0;
                }
                if (i5 == 0 || i2 != 0) {
                    int i9 = -i4;
                    i5 = Math.max(i9, Math.min(i5, i4));
                    i2 = Math.max(i9, Math.min(i2, i4));
                    startNestedScrollForType(1);
                    this.mViewFlinger.a(i5, i2);
                }
                if (i != 0 && i6 == 0) {
                    return (i5 == 0 && i2 == 0) ? false : true;
                }
                f = i;
                f2 = i6;
                if (!dispatchNestedPreFling(f, f2)) {
                    boolean z = canScrollHorizontally || canScrollVertically;
                    dispatchNestedFling(f, f2, z);
                    jrf jrfVar = this.mOnFlingListener;
                    if (jrfVar != null && jrfVar.onFling(i, i6)) {
                        return true;
                    }
                    if (z) {
                        startNestedScrollForType(1);
                        int i10 = -i4;
                        this.mViewFlinger.a(Math.max(i10, Math.min(i, i4)), Math.max(i10, Math.min(i6, i4)));
                        return true;
                    }
                }
                return false;
            }
            i6 = i2;
            i2 = 0;
            if (i5 == 0) {
            }
            int i92 = -i4;
            i5 = Math.max(i92, Math.min(i5, i4));
            i2 = Math.max(i92, Math.min(i2, i4));
            startNestedScrollForType(1);
            this.mViewFlinger.a(i5, i2);
            if (i != 0) {
            }
            f = i;
            f2 = i6;
            if (!dispatchNestedPreFling(f, f2)) {
            }
            return false;
        }
        i5 = 0;
        if (i2 != 0) {
        }
        i6 = i2;
        i2 = 0;
        if (i5 == 0) {
        }
        int i922 = -i4;
        i5 = Math.max(i922, Math.min(i5, i4));
        i2 = Math.max(i922, Math.min(i2, i4));
        startNestedScrollForType(1);
        this.mViewFlinger.a(i5, i2);
        if (i != 0) {
        }
        f = i;
        f2 = i6;
        if (!dispatchNestedPreFling(f, f2)) {
        }
        return false;
    }

    public static u getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((hrf) view.getLayoutParams()).a;
    }

    public static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        hrf hrfVar = (hrf) view.getLayoutParams();
        Rect rect2 = hrfVar.b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) hrfVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) hrfVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) hrfVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) hrfVar).bottomMargin);
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
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    private p9d getScrollingChildHelper() {
        p9d p9dVar = this.mScrollingChildHelper;
        if (p9dVar != null) {
            return p9dVar;
        }
        p9d p9dVar2 = new p9d(this);
        this.mScrollingChildHelper = p9dVar2;
        return p9dVar2;
    }

    private float getSplineFlingDistance(int i) {
        double log = Math.log((Math.abs(i) * INFLEXION) / (this.mPhysicalCoef * SCROLL_FRICTION));
        float f = DECELERATION_RATE;
        return (float) (Math.exp((f / (f - 1.0d)) * log) * this.mPhysicalCoef * SCROLL_FRICTION);
    }

    private void handleMissingPreInfoForChangeError(long j, u uVar, u uVar2) {
        int e = this.mChildHelper.e();
        for (int i = 0; i < e; i++) {
            u childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i));
            if (childViewHolderInt != uVar && getChangedHolderKey(childViewHolderInt) == j) {
                l lVar = this.mAdapter;
                if (lVar == null || !lVar.hasStableIds()) {
                    StringBuilder sb = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                    sb.append(childViewHolderInt);
                    sb.append(" \n View Holder 2:");
                    sb.append(uVar);
                    a70.r(mz1.l(this, sb));
                    return;
                }
                StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                sb2.append(childViewHolderInt);
                sb2.append(" \n View Holder 2:");
                sb2.append(uVar);
                a70.r(mz1.l(this, sb2));
                return;
            }
        }
        Objects.toString(uVar2);
        Objects.toString(uVar);
        exceptionLabel();
    }

    private boolean hasUpdatedView() {
        int e = this.mChildHelper.e();
        for (int i = 0; i < e; i++) {
            u childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    private void initAutofill() {
        WeakHashMap weakHashMap = bsk.a;
        if (vrk.a(this) == 0) {
            vrk.b(this, 8);
        }
    }

    private void initChildrenHelper() {
        this.mChildHelper = new b(new d4a(this, 13));
    }

    private boolean isPreferredNextFocus(View view, View view2, int i) {
        int i2;
        int i3;
        int i4;
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
        char c = 65535;
        int i5 = this.mLayout.getLayoutDirection() == 1 ? -1 : 1;
        Rect rect = this.mTempRect;
        int i6 = rect.left;
        Rect rect2 = this.mTempRect2;
        int i7 = rect2.left;
        if ((i6 < i7 || (i2 = rect.right) <= i7) && (i2 = rect.right) < rect2.right) {
            i3 = 1;
        } else {
            int i8 = rect2.right;
            i3 = ((i2 > i8 || i6 >= i8) && i6 > i7) ? -1 : 0;
        }
        int i9 = rect.top;
        int i10 = rect2.top;
        if ((i9 < i10 || (i4 = rect.bottom) <= i10) && (i4 = rect.bottom) < rect2.bottom) {
            c = 1;
        } else {
            int i11 = rect2.bottom;
            if ((i4 <= i11 && i9 < i11) || i9 <= i10) {
                c = 0;
            }
        }
        if (i == 1) {
            return c < 0 || (c == 0 && i3 * i5 < 0);
        }
        if (i == 2) {
            return c > 0 || (c == 0 && i3 * i5 > 0);
        }
        if (i == 17) {
            return i3 < 0;
        }
        if (i == 33) {
            return c < 0;
        }
        if (i == 66) {
            return i3 > 0;
        }
        if (i == 130) {
            return c > 0;
        }
        StringBuilder sb = new StringBuilder("Invalid direction: ");
        sb.append(i);
        a70.p(mz1.l(this, sb));
        return false;
    }

    private void nestedScrollByInternal(int i, int i2, @Nullable MotionEvent motionEvent, int i3) {
        n nVar = this.mLayout;
        if (nVar == null || this.mLayoutSuppressed) {
            return;
        }
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean canScrollHorizontally = nVar.canScrollHorizontally();
        boolean canScrollVertically = this.mLayout.canScrollVertically();
        int i4 = canScrollVertically ? (canScrollHorizontally ? 1 : 0) | 2 : canScrollHorizontally ? 1 : 0;
        float height = motionEvent == null ? getHeight() / 2.0f : motionEvent.getY();
        float width = motionEvent == null ? getWidth() / 2.0f : motionEvent.getX();
        int releaseHorizontalGlow = i - releaseHorizontalGlow(i, height);
        int releaseVerticalGlow = i2 - releaseVerticalGlow(i2, width);
        startNestedScroll(i4, i3);
        if (dispatchNestedPreScroll(canScrollHorizontally ? releaseHorizontalGlow : 0, canScrollVertically ? releaseVerticalGlow : 0, this.mReusableIntPair, this.mScrollOffset, i3)) {
            int[] iArr2 = this.mReusableIntPair;
            releaseHorizontalGlow -= iArr2[0];
            releaseVerticalGlow -= iArr2[1];
        }
        scrollByInternal(canScrollHorizontally ? releaseHorizontalGlow : 0, canScrollVertically ? releaseVerticalGlow : 0, motionEvent, i3);
        f fVar = this.mGapWorker;
        if (fVar != null && (releaseHorizontalGlow != 0 || releaseVerticalGlow != 0)) {
            fVar.a(this, releaseHorizontalGlow, releaseVerticalGlow);
        }
        stopNestedScroll(i3);
    }

    private void onPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            int i = actionIndex == 0 ? 1 : 0;
            this.mScrollPointerId = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
        }
    }

    private boolean predictiveItemAnimationsEnabled() {
        return this.mItemAnimator != null && this.mLayout.supportsPredictiveItemAnimations();
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
        boolean z;
        boolean z2 = false;
        if (this.mDataSetHasChangedAfterLayout) {
            a aVar = this.mAdapterHelper;
            aVar.k(aVar.b);
            aVar.k(aVar.c);
            aVar.f = 0;
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.onItemsChanged(this);
            }
        }
        boolean predictiveItemAnimationsEnabled = predictiveItemAnimationsEnabled();
        a aVar2 = this.mAdapterHelper;
        if (predictiveItemAnimationsEnabled) {
            aVar2.j();
        } else {
            aVar2.c();
        }
        boolean z3 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        this.mState.j = this.mFirstLayoutComplete && this.mItemAnimator != null && ((z = this.mDataSetHasChangedAfterLayout) || z3 || this.mLayout.mRequestedSimpleAnimations) && (!z || this.mAdapter.hasStableIds());
        qrf qrfVar = this.mState;
        if (qrfVar.j && z3 && !this.mDataSetHasChangedAfterLayout && predictiveItemAnimationsEnabled()) {
            z2 = true;
        }
        qrfVar.k = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void pullGlows(float f, float f2, float f3, float f4) {
        boolean z;
        boolean z2 = true;
        if (f2 < 0.0f) {
            ensureLeftGlow();
            oyn.L(this.mLeftGlow, (-f2) / getWidth(), 1.0f - (f3 / getHeight()));
        } else {
            if (f2 <= 0.0f) {
                z = false;
                if (f4 >= 0.0f) {
                    ensureTopGlow();
                    oyn.L(this.mTopGlow, (-f4) / getHeight(), f / getWidth());
                } else if (f4 > 0.0f) {
                    ensureBottomGlow();
                    oyn.L(this.mBottomGlow, f4 / getHeight(), 1.0f - (f / getWidth()));
                } else {
                    z2 = z;
                }
                if (z2 && f2 == 0.0f && f4 == 0.0f) {
                    return;
                }
                postInvalidateOnAnimation();
            }
            ensureRightGlow();
            oyn.L(this.mRightGlow, f2 / getWidth(), f3 / getHeight());
        }
        z = true;
        if (f4 >= 0.0f) {
        }
        if (z2) {
        }
        postInvalidateOnAnimation();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
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
            if (!this.mChildHelper.c.contains(getFocusedChild())) {
                return;
            }
        }
        View view = null;
        u findViewHolderForItemId = (this.mState.m == -1 || !this.mAdapter.hasStableIds()) ? null : findViewHolderForItemId(this.mState.m);
        if (findViewHolderForItemId != null) {
            if (!this.mChildHelper.c.contains(findViewHolderForItemId.itemView) && findViewHolderForItemId.itemView.hasFocusable()) {
                view = findViewHolderForItemId.itemView;
                if (view == null) {
                    int i = this.mState.n;
                    if (i != -1 && (findViewById = view.findViewById(i)) != null && findViewById.isFocusable()) {
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
        boolean z;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.mLeftGlow.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.mBottomGlow.isFinished();
        }
        if (z) {
            postInvalidateOnAnimation();
        }
    }

    private int releaseHorizontalGlow(int i, float f) {
        float height = f / getHeight();
        float width = i / getWidth();
        EdgeEffect edgeEffect = this.mLeftGlow;
        float f2 = 0.0f;
        if (edgeEffect == null || oyn.D(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.mRightGlow;
            if (edgeEffect2 != null && oyn.D(edgeEffect2) != 0.0f) {
                boolean canScrollHorizontally = canScrollHorizontally(1);
                EdgeEffect edgeEffect3 = this.mRightGlow;
                if (canScrollHorizontally) {
                    edgeEffect3.onRelease();
                } else {
                    float L = oyn.L(edgeEffect3, width, height);
                    if (oyn.D(this.mRightGlow) == 0.0f) {
                        this.mRightGlow.onRelease();
                    }
                    f2 = L;
                }
                invalidate();
            }
        } else {
            boolean canScrollHorizontally2 = canScrollHorizontally(-1);
            EdgeEffect edgeEffect4 = this.mLeftGlow;
            if (canScrollHorizontally2) {
                edgeEffect4.onRelease();
            } else {
                float f3 = -oyn.L(edgeEffect4, -width, 1.0f - height);
                if (oyn.D(this.mLeftGlow) == 0.0f) {
                    this.mLeftGlow.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getWidth());
    }

    private int releaseVerticalGlow(int i, float f) {
        float width = f / getWidth();
        float height = i / getHeight();
        EdgeEffect edgeEffect = this.mTopGlow;
        float f2 = 0.0f;
        if (edgeEffect == null || oyn.D(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.mBottomGlow;
            if (edgeEffect2 != null && oyn.D(edgeEffect2) != 0.0f) {
                boolean canScrollVertically = canScrollVertically(1);
                EdgeEffect edgeEffect3 = this.mBottomGlow;
                if (canScrollVertically) {
                    edgeEffect3.onRelease();
                } else {
                    float L = oyn.L(edgeEffect3, height, 1.0f - width);
                    if (oyn.D(this.mBottomGlow) == 0.0f) {
                        this.mBottomGlow.onRelease();
                    }
                    f2 = L;
                }
                invalidate();
            }
        } else {
            boolean canScrollVertically2 = canScrollVertically(-1);
            EdgeEffect edgeEffect4 = this.mTopGlow;
            if (canScrollVertically2) {
                edgeEffect4.onRelease();
            } else {
                float f3 = -oyn.L(edgeEffect4, -height, width);
                if (oyn.D(this.mTopGlow) == 0.0f) {
                    this.mTopGlow.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getHeight());
    }

    private void requestChildOnScreen(@NonNull View view, @Nullable View view2) {
        View view3 = view2 != null ? view2 : view;
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof hrf) {
            hrf hrfVar = (hrf) layoutParams;
            if (!hrfVar.c) {
                Rect rect = hrfVar.b;
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
        qrf qrfVar = this.mState;
        qrfVar.m = -1L;
        qrfVar.l = -1;
        qrfVar.n = -1;
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
        u findContainingViewHolder = focusedChild != null ? findContainingViewHolder(focusedChild) : null;
        if (findContainingViewHolder == null) {
            resetFocusInfo();
            return;
        }
        this.mState.m = this.mAdapter.hasStableIds() ? findContainingViewHolder.getItemId() : -1L;
        this.mState.l = this.mDataSetHasChangedAfterLayout ? -1 : findContainingViewHolder.isRemoved() ? findContainingViewHolder.mOldPosition : findContainingViewHolder.getAbsoluteAdapterPosition();
        this.mState.n = getDeepestFocusedViewWithId(findContainingViewHolder.itemView);
    }

    private void setAdapterInternal(@Nullable l lVar, boolean z, boolean z2) {
        l lVar2 = this.mAdapter;
        if (lVar2 != null) {
            lVar2.unregisterAdapterDataObserver(this.mObserver);
            this.mAdapter.onDetachedFromRecyclerView(this);
        }
        if (!z || z2) {
            removeAndRecycleViews();
        }
        a aVar = this.mAdapterHelper;
        aVar.k(aVar.b);
        aVar.k(aVar.c);
        aVar.f = 0;
        l lVar3 = this.mAdapter;
        this.mAdapter = lVar;
        if (lVar != null) {
            lVar.registerAdapterDataObserver(this.mObserver);
            lVar.onAttachedToRecyclerView(this);
        }
        n nVar = this.mLayout;
        if (nVar != null) {
            nVar.onAdapterChanged(lVar3, this.mAdapter);
        }
        o oVar = this.mRecycler;
        l lVar4 = this.mAdapter;
        oVar.a.clear();
        oVar.h();
        oVar.g(lVar3, true);
        mrf c = oVar.c();
        if (lVar3 != null) {
            c.b--;
        }
        if (!z && c.b == 0) {
            SparseArray sparseArray = c.a;
            for (int i = 0; i < sparseArray.size(); i++) {
                lrf lrfVar = (lrf) sparseArray.valueAt(i);
                Iterator it = lrfVar.a.iterator();
                while (it.hasNext()) {
                    qha.o(((u) it.next()).itemView);
                }
                lrfVar.a.clear();
            }
        }
        if (lVar4 != null) {
            c.b++;
        } else {
            c.getClass();
        }
        oVar.f();
        this.mState.f = true;
    }

    public static void setDebugAssertionsEnabled(boolean z) {
        sDebugAssertionsEnabled = z;
    }

    public static void setVerboseLoggingEnabled(boolean z) {
        sVerboseLoggingEnabled = z;
    }

    private boolean shouldAbsorb(@NonNull EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        return getSplineFlingDistance(-i) < oyn.D(edgeEffect) * ((float) i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void startNestedScrollForType(int i) {
        boolean canScrollHorizontally = this.mLayout.canScrollHorizontally();
        int i2 = canScrollHorizontally;
        if (this.mLayout.canScrollVertically()) {
            i2 = (canScrollHorizontally ? 1 : 0) | 2;
        }
        startNestedScroll(i2, i);
    }

    private boolean stopGlowAnimations(MotionEvent motionEvent) {
        boolean z;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || oyn.D(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
            z = false;
        } else {
            oyn.L(this.mLeftGlow, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
            z = true;
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && oyn.D(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
            oyn.L(this.mRightGlow, 0.0f, motionEvent.getY() / getHeight());
            z = true;
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && oyn.D(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
            oyn.L(this.mTopGlow, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 == null || oyn.D(edgeEffect4) == 0.0f || canScrollVertically(1)) {
            return z;
        }
        oyn.L(this.mBottomGlow, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    private void stopScrollersInternal() {
        t tVar = this.mViewFlinger;
        tVar.g.removeCallbacks(tVar);
        tVar.c.abortAnimation();
        n nVar = this.mLayout;
        if (nVar != null) {
            nVar.stopSmoothScroller();
        }
    }

    public void absorbGlows(int i, int i2) {
        if (i < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i);
            }
        } else if (i > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i);
            }
        }
        if (i2 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i2);
            }
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        postInvalidateOnAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        n nVar = this.mLayout;
        if (nVar == null || !nVar.onAddFocusables(this, arrayList, i, i2)) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    public void addItemDecoration(@NonNull erf erfVar, int i) {
        n nVar = this.mLayout;
        if (nVar != null) {
            nVar.assertNotInLayoutOrScroll("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        ArrayList<erf> arrayList = this.mItemDecorations;
        if (i < 0) {
            arrayList.add(erfVar);
        } else {
            arrayList.add(i, erfVar);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addOnChildAttachStateChangeListener(@NonNull irf irfVar) {
        List list = this.mOnChildAttachStateListeners;
        if (list == null) {
            list = new ArrayList();
            this.mOnChildAttachStateListeners = list;
        }
        list.add(irfVar);
    }

    public void addOnItemTouchListener(@NonNull krf krfVar) {
        this.mOnItemTouchListeners.add(krfVar);
    }

    public void addOnScrollListener(@NonNull OnScrollListener onScrollListener) {
        List list = this.mScrollListeners;
        if (list == null) {
            list = new ArrayList();
            this.mScrollListeners = list;
        }
        list.add(onScrollListener);
    }

    public void addRecyclerListener(@NonNull nrf nrfVar) {
        l4a.h("'listener' arg cannot be null.", nrfVar != null);
        this.mRecyclerListeners.add(nrfVar);
    }

    public void animateAppearance(@NonNull u uVar, @Nullable drf drfVar, @NonNull drf drfVar2) {
        boolean z;
        int i;
        int i2;
        uVar.setIsRecyclable(false);
        nq4 nq4Var = (nq4) this.mItemAnimator;
        nq4Var.getClass();
        if (drfVar == null || ((i = drfVar.a) == (i2 = drfVar2.a) && drfVar.b == drfVar2.b)) {
            nq4Var.l(uVar);
            uVar.itemView.setAlpha(0.0f);
            nq4Var.i.add(uVar);
            z = true;
        } else {
            z = nq4Var.g(uVar, i, drfVar.b, i2, drfVar2.b);
        }
        if (z) {
            postAnimationRunner();
        }
    }

    public void animateDisappearance(@NonNull u uVar, @NonNull drf drfVar, @Nullable drf drfVar2) {
        boolean z;
        addAnimatingView(uVar);
        uVar.setIsRecyclable(false);
        nq4 nq4Var = (nq4) this.mItemAnimator;
        nq4Var.getClass();
        int i = drfVar.a;
        int i2 = drfVar.b;
        View view = uVar.itemView;
        int left = drfVar2 == null ? view.getLeft() : drfVar2.a;
        int top = drfVar2 == null ? view.getTop() : drfVar2.b;
        if (uVar.isRemoved() || (i == left && i2 == top)) {
            nq4Var.l(uVar);
            nq4Var.h.add(uVar);
            z = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            z = nq4Var.g(uVar, i, i2, left, top);
        }
        if (z) {
            postAnimationRunner();
        }
    }

    public void assertInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            return;
        }
        if (str == null) {
            a70.r(mz1.l(this, new StringBuilder("Cannot call this method unless RecyclerView is computing a layout or scrolling")));
        } else {
            a70.r(mz1.l(this, new StringBuilder(str)));
        }
    }

    public void assertNotInLayoutOrScroll(String str) {
        if (!isComputingLayout()) {
            if (this.mDispatchScrollCounter > 0) {
                new IllegalStateException(mz1.l(this, new StringBuilder("")));
            }
        } else if (str == null) {
            a70.r(mz1.l(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
        } else {
            a70.r(str);
        }
    }

    public boolean canReuseUpdatedViewHolder(u uVar) {
        m mVar = this.mItemAnimator;
        if (mVar == null) {
            return true;
        }
        List<Object> unmodifiedPayloads = uVar.getUnmodifiedPayloads();
        nq4 nq4Var = (nq4) mVar;
        nq4Var.getClass();
        return (unmodifiedPayloads.isEmpty() && nq4Var.g && !uVar.isInvalid()) ? false : true;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof hrf) && this.mLayout.checkLayoutParams((hrf) layoutParams);
    }

    public void clearOldPositions() {
        int h = this.mChildHelper.h();
        for (int i = 0; i < h; i++) {
            u childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.clearOldPosition();
            }
        }
        o oVar = this.mRecycler;
        ArrayList arrayList = oVar.a;
        ArrayList arrayList2 = oVar.c;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((u) arrayList2.get(i2)).clearOldPosition();
        }
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((u) arrayList.get(i3)).clearOldPosition();
        }
        ArrayList arrayList3 = oVar.b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                ((u) oVar.b.get(i4)).clearOldPosition();
            }
        }
    }

    public void clearOnChildAttachStateChangeListeners() {
        List<irf> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void clearOnScrollListeners() {
        List<OnScrollListener> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        n nVar = this.mLayout;
        if (nVar != null && nVar.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        n nVar = this.mLayout;
        if (nVar != null && nVar.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        n nVar = this.mLayout;
        if (nVar != null && nVar.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollRange(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        n nVar = this.mLayout;
        if (nVar != null && nVar.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        n nVar = this.mLayout;
        if (nVar != null && nVar.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        n nVar = this.mLayout;
        if (nVar != null && nVar.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollRange(this.mState);
        }
        return 0;
    }

    public void considerReleasingGlowsOnScroll(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z = false;
        } else {
            this.mLeftGlow.onRelease();
            z = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.mRightGlow.onRelease();
            z |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.mTopGlow.onRelease();
            z |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.mBottomGlow.onRelease();
            z |= this.mBottomGlow.isFinished();
        }
        if (z) {
            postInvalidateOnAnimation();
        }
    }

    public int consumeFlingInHorizontalStretch(int i) {
        return consumeFlingInStretch(i, this.mLeftGlow, this.mRightGlow, getWidth());
    }

    public int consumeFlingInVerticalStretch(int i) {
        return consumeFlingInStretch(i, this.mTopGlow, this.mBottomGlow, getHeight());
    }

    public void consumePendingUpdateOperations() {
        if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout) {
            Trace.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
            dispatchLayout();
            Trace.endSection();
            return;
        }
        if (this.mAdapterHelper.g()) {
            a aVar = this.mAdapterHelper;
            int i = aVar.f;
            if ((i & 4) == 0 || (i & 11) != 0) {
                if (aVar.g()) {
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
                if (hasUpdatedView()) {
                    dispatchLayout();
                } else {
                    this.mAdapterHelper.b();
                }
            }
            stopInterceptRequestLayout(true);
            onExitLayoutOrScroll();
            Trace.endSection();
        }
    }

    public void defaultOnMeasure(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = bsk.a;
        setMeasuredDimension(n.chooseSize(i, paddingRight, getMinimumWidth()), n.chooseSize(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public void dispatchChildAttached(View view) {
        u childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        l lVar = this.mAdapter;
        if (lVar != null && childViewHolderInt != null) {
            lVar.onViewAttachedToWindow(childViewHolderInt);
        }
        List<irf> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).d(view);
            }
        }
    }

    public void dispatchChildDetached(View view) {
        u childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        l lVar = this.mAdapter;
        if (lVar != null && childViewHolderInt != null) {
            lVar.onViewDetachedFromWindow(childViewHolderInt);
        }
        List<irf> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).b(view);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(@Nullable KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        n layoutManager = getLayoutManager();
        int i = 0;
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
                            i = getAdapter().getItemCount();
                        }
                    } else if (!isLayoutReversed) {
                        i = getAdapter().getItemCount();
                    }
                    smoothScrollToPosition(i);
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
                            i = getAdapter().getItemCount();
                        }
                    } else if (!isLayoutReversed2) {
                        i = getAdapter().getItemCount();
                    }
                    smoothScrollToPosition(i);
                    return true;
                }
            }
        }
        return false;
    }

    public void dispatchLayout() {
        if (this.mAdapter == null || this.mLayout == null) {
            return;
        }
        this.mState.i = false;
        boolean z = this.mLastAutoMeasureSkippedDueToExact && !(this.mLastAutoMeasureNonExactMeasuredWidth == getWidth() && this.mLastAutoMeasureNonExactMeasuredHeight == getHeight());
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mLastAutoMeasureSkippedDueToExact = false;
        if (this.mState.d == 1) {
            dispatchLayoutStep1();
            this.mLayout.setExactMeasureSpecsFrom(this);
            dispatchLayoutStep2();
        } else {
            a aVar = this.mAdapterHelper;
            if ((aVar.c.isEmpty() || aVar.b.isEmpty()) && !z && this.mLayout.getWidth() == getWidth() && this.mLayout.getHeight() == getHeight()) {
                this.mLayout.setExactMeasureSpecsFrom(this);
            } else {
                this.mLayout.setExactMeasureSpecsFrom(this);
                dispatchLayoutStep2();
            }
        }
        dispatchLayoutStep3();
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().a(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().b(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().d(i, i2, i3, i4, iArr, 0, null);
    }

    public void dispatchOnScrollStateChanged(int i) {
        n nVar = this.mLayout;
        if (nVar != null) {
            nVar.onScrollStateChanged(i);
        }
        onScrollStateChanged(i);
        OnScrollListener onScrollListener = this.mScrollListener;
        if (onScrollListener != null) {
            onScrollListener.onScrollStateChanged(this, i);
        }
        List<OnScrollListener> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrollStateChanged(this, i);
            }
        }
    }

    public void dispatchOnScrolled(int i, int i2) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        onScrolled(i, i2);
        OnScrollListener onScrollListener = this.mScrollListener;
        if (onScrollListener != null) {
            onScrollListener.onScrolled(this, i, i2);
        }
        List<OnScrollListener> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrolled(this, i, i2);
            }
        }
        this.mDispatchScrollCounter--;
    }

    public void dispatchPendingImportantForAccessibilityChanges() {
        int i;
        int size = this.mPendingAccessibilityImportanceChange.size();
        while (true) {
            size--;
            List<u> list = this.mPendingAccessibilityImportanceChange;
            if (size < 0) {
                list.clear();
                return;
            }
            u uVar = list.get(size);
            if (uVar.itemView.getParent() == this && !uVar.shouldIgnore() && (i = uVar.mPendingAccessibilityState) != -1) {
                uVar.itemView.setImportantForAccessibility(i);
                uVar.mPendingAccessibilityState = -1;
            }
        }
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
        boolean z;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            this.mItemDecorations.get(i).onDrawOver(canvas, this, this.mState);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.mClipToPadding ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
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
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
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
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(save4);
        }
        if ((z || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.f()) ? z : true) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(@NonNull Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public void ensureBottomGlow() {
        if (this.mBottomGlow != null) {
            return;
        }
        ((rrf) this.mEdgeEffectFactory).getClass();
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
        ((rrf) this.mEdgeEffectFactory).getClass();
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
        ((rrf) this.mEdgeEffectFactory).getClass();
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
        ((rrf) this.mEdgeEffectFactory).getClass();
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

    public final void fillRemainingScrollValues(qrf qrfVar) {
        if (getScrollState() != 2) {
            qrfVar.getClass();
            return;
        }
        OverScroller overScroller = this.mViewFlinger.c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        qrfVar.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    @Nullable
    public View findChildViewUnder(float f, float f2) {
        for (int e = this.mChildHelper.e() - 1; e >= 0; e--) {
            View d = this.mChildHelper.d(e);
            float translationX = d.getTranslationX();
            float translationY = d.getTranslationY();
            if (f >= d.getLeft() + translationX && f <= d.getRight() + translationX && f2 >= d.getTop() + translationY && f2 <= d.getBottom() + translationY) {
                return d;
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
    public u findContainingViewHolder(@NonNull View view) {
        View findContainingItemView = findContainingItemView(view);
        if (findContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(findContainingItemView);
    }

    @Nullable
    public u findViewHolderForAdapterPosition(int i) {
        u uVar = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int h = this.mChildHelper.h();
        for (int i2 = 0; i2 < h; i2++) {
            u childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i2));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && getAdapterPositionInRecyclerView(childViewHolderInt) == i) {
                b bVar = this.mChildHelper;
                if (!bVar.c.contains(childViewHolderInt.itemView)) {
                    return childViewHolderInt;
                }
                uVar = childViewHolderInt;
            }
        }
        return uVar;
    }

    public u findViewHolderForItemId(long j) {
        l lVar = this.mAdapter;
        u uVar = null;
        if (lVar != null && lVar.hasStableIds()) {
            int h = this.mChildHelper.h();
            for (int i = 0; i < h; i++) {
                u childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i));
                if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && childViewHolderInt.getItemId() == j) {
                    b bVar = this.mChildHelper;
                    if (!bVar.c.contains(childViewHolderInt.itemView)) {
                        return childViewHolderInt;
                    }
                    uVar = childViewHolderInt;
                }
            }
        }
        return uVar;
    }

    @Nullable
    public u findViewHolderForLayoutPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0038 A[SYNTHETIC] */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public u findViewHolderForPosition(int i, boolean z) {
        b bVar;
        int h = this.mChildHelper.h();
        u uVar = null;
        for (int i2 = 0; i2 < h; i2++) {
            u childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i2));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved()) {
                if (z) {
                    if (childViewHolderInt.mPosition != i) {
                        continue;
                    }
                    bVar = this.mChildHelper;
                    if (bVar.c.contains(childViewHolderInt.itemView)) {
                        return childViewHolderInt;
                    }
                    uVar = childViewHolderInt;
                } else {
                    if (childViewHolderInt.getLayoutPosition() != i) {
                        continue;
                    }
                    bVar = this.mChildHelper;
                    if (bVar.c.contains(childViewHolderInt.itemView)) {
                    }
                }
            }
        }
        return uVar;
    }

    public boolean flingNoThresholdCheck(int i, int i2) {
        return fling(i, i2, 0, Integer.MAX_VALUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0071  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View focusSearch(View view, int i) {
        View view2;
        boolean z;
        View onInterceptFocusSearch = this.mLayout.onInterceptFocusSearch(view, i);
        if (onInterceptFocusSearch != null) {
            return onInterceptFocusSearch;
        }
        boolean z2 = (this.mAdapter == null || this.mLayout == null || isComputingLayout() || this.mLayoutSuppressed) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z2 && (i == 2 || i == 1)) {
            if (this.mLayout.canScrollVertically()) {
                if (focusFinder.findNextFocus(this, view, i == 2 ? 130 : 33) == null) {
                    z = true;
                    if (!z && this.mLayout.canScrollHorizontally()) {
                        z = focusFinder.findNextFocus(this, view, !((this.mLayout.getLayoutDirection() != 1) ^ (i != 2)) ? 66 : 17) == null;
                    }
                    if (z) {
                        consumePendingUpdateOperations();
                        if (findContainingItemView(view) == null) {
                            return null;
                        }
                        startInterceptRequestLayout();
                        this.mLayout.onFocusSearchFailed(view, i, this.mRecycler, this.mState);
                        stopInterceptRequestLayout(false);
                    }
                    view2 = focusFinder.findNextFocus(this, view, i);
                }
            }
            z = false;
            if (!z) {
                z = focusFinder.findNextFocus(this, view, !((this.mLayout.getLayoutDirection() != 1) ^ (i != 2)) ? 66 : 17) == null;
            }
            if (z) {
            }
            view2 = focusFinder.findNextFocus(this, view, i);
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i);
            if (findNextFocus == null && z2) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                view2 = this.mLayout.onFocusSearchFailed(view, i, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            } else {
                view2 = findNextFocus;
            }
        }
        if (view2 == null || view2.hasFocusable()) {
            return isPreferredNextFocus(view, view2, i) ? view2 : super.focusSearch(view, i);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i);
        }
        requestChildOnScreen(view2, null);
        return view;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        n nVar = this.mLayout;
        if (nVar != null) {
            return nVar.generateDefaultLayoutParams();
        }
        a70.r(mz1.l(this, new StringBuilder("RecyclerView has no LayoutManager")));
        return null;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        n nVar = this.mLayout;
        if (nVar != null) {
            return nVar.generateLayoutParams(getContext(), attributeSet);
        }
        a70.r(mz1.l(this, new StringBuilder("RecyclerView has no LayoutManager")));
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    @Nullable
    public l getAdapter() {
        return this.mAdapter;
    }

    public int getAdapterPositionInRecyclerView(u uVar) {
        if (uVar.hasAnyOfTheFlags(IronSourceError.ERROR_PLACEMENT_CAPPED) || !uVar.isBound()) {
            return -1;
        }
        a aVar = this.mAdapterHelper;
        int i = uVar.mPosition;
        ArrayList arrayList = aVar.b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            eh ehVar = (eh) arrayList.get(i2);
            int i3 = ehVar.a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = ehVar.b;
                    if (i4 <= i) {
                        int i5 = ehVar.d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = ehVar.b;
                    if (i6 == i) {
                        i = ehVar.d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (ehVar.d <= i) {
                            i++;
                        }
                    }
                }
            } else if (ehVar.b <= i) {
                i += ehVar.d;
            }
        }
        return i;
    }

    @Override // android.view.View
    public int getBaseline() {
        n nVar = this.mLayout;
        return nVar != null ? nVar.getBaseline() : super.getBaseline();
    }

    public long getChangedHolderKey(u uVar) {
        return this.mAdapter.hasStableIds() ? uVar.getItemId() : uVar.mPosition;
    }

    public int getChildAdapterPosition(@NonNull View view) {
        u childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    public long getChildItemId(@NonNull View view) {
        u childViewHolderInt;
        l lVar = this.mAdapter;
        if (lVar == null || !lVar.hasStableIds() || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1L;
        }
        return childViewHolderInt.getItemId();
    }

    public int getChildLayoutPosition(@NonNull View view) {
        u childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getLayoutPosition();
        }
        return -1;
    }

    @Deprecated
    public int getChildPosition(@NonNull View view) {
        return getChildAdapterPosition(view);
    }

    public u getChildViewHolder(@NonNull View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return getChildViewHolderInt(view);
        }
        yhk.m("View ", view, " is not a direct child of ", this);
        return null;
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    @Nullable
    public urf getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void getDecoratedBoundsWithMargins(@NonNull View view, @NonNull Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    @NonNull
    public brf getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    @Nullable
    public m getItemAnimator() {
        return this.mItemAnimator;
    }

    public Rect getItemDecorInsetsForChild(View view) {
        hrf hrfVar = (hrf) view.getLayoutParams();
        boolean z = hrfVar.c;
        Rect rect = hrfVar.b;
        if (!z || (this.mState.g && (hrfVar.a.isUpdated() || hrfVar.a.isInvalid()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            this.mTempRect.set(0, 0, 0, 0);
            this.mItemDecorations.get(i).getItemOffsets(this.mTempRect, view, this, this.mState);
            int i2 = rect.left;
            Rect rect2 = this.mTempRect;
            rect.left = i2 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        hrfVar.c = false;
        return rect;
    }

    @NonNull
    public erf getItemDecorationAt(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i >= 0 && i < itemDecorationCount) {
            return this.mItemDecorations.get(i);
        }
        zzl.r(fc6.g(i, itemDecorationCount, " is an invalid index for size "));
        return null;
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    @Nullable
    public n getLayoutManager() {
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
    public jrf getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    @NonNull
    public mrf getRecycledViewPool() {
        return this.mRecycler.c();
    }

    public int getScrollState() {
        return this.mScrollState;
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

    public void initAdapterManager() {
        this.mAdapterHelper = new a(new k(this));
    }

    public void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            a70.p(mz1.l(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
        } else {
            Resources resources = getContext().getResources();
            new d(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(androidx.recyclerview.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(androidx.recyclerview.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(androidx.recyclerview.R.dimen.fastscroll_margin));
        }
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
        n nVar = this.mLayout;
        if (nVar != null) {
            nVar.assertNotInLayoutOrScroll("Cannot invalidate item decorations during a scroll or layout");
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean isAnimating() {
        m mVar = this.mItemAnimator;
        return mVar != null && mVar.f();
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

    public void jumpToPositionForSmoothScroller(int i) {
        if (this.mLayout == null) {
            return;
        }
        setScrollState(2);
        this.mLayout.scrollToPosition(i);
        awakenScrollBars();
    }

    public void markItemDecorInsetsDirty() {
        int h = this.mChildHelper.h();
        for (int i = 0; i < h; i++) {
            ((hrf) this.mChildHelper.g(i).getLayoutParams()).c = true;
        }
        ArrayList arrayList = this.mRecycler.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            hrf hrfVar = (hrf) ((u) arrayList.get(i2)).itemView.getLayoutParams();
            if (hrfVar != null) {
                hrfVar.c = true;
            }
        }
    }

    public void markKnownViewsInvalid() {
        int h = this.mChildHelper.h();
        for (int i = 0; i < h; i++) {
            u childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.addFlags(6);
            }
        }
        markItemDecorInsetsDirty();
        o oVar = this.mRecycler;
        ArrayList arrayList = oVar.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            u uVar = (u) arrayList.get(i2);
            if (uVar != null) {
                uVar.addFlags(6);
                uVar.addChangePayload(null);
            }
        }
        l lVar = oVar.h.mAdapter;
        if (lVar == null || !lVar.hasStableIds()) {
            oVar.h();
        }
    }

    public void nestedScrollBy(int i, int i2) {
        nestedScrollByInternal(i, i2, null, 1);
    }

    public void offsetChildrenHorizontal(int i) {
        int e = this.mChildHelper.e();
        for (int i2 = 0; i2 < e; i2++) {
            this.mChildHelper.d(i2).offsetLeftAndRight(i);
        }
    }

    public void offsetChildrenVertical(int i) {
        int e = this.mChildHelper.e();
        for (int i2 = 0; i2 < e; i2++) {
            this.mChildHelper.d(i2).offsetTopAndBottom(i);
        }
    }

    public void offsetPositionRecordsForInsert(int i, int i2) {
        int h = this.mChildHelper.h();
        for (int i3 = 0; i3 < h; i3++) {
            u childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i3));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.mPosition >= i) {
                if (sVerboseLoggingEnabled) {
                    childViewHolderInt.toString();
                }
                childViewHolderInt.offsetPosition(i2, false);
                this.mState.f = true;
            }
        }
        ArrayList arrayList = this.mRecycler.c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            u uVar = (u) arrayList.get(i4);
            if (uVar != null && uVar.mPosition >= i) {
                if (sVerboseLoggingEnabled) {
                    uVar.toString();
                }
                uVar.offsetPosition(i2, false);
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForMove(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int h = this.mChildHelper.h();
        int i10 = -1;
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i11 = 0; i11 < h; i11++) {
            u childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i11));
            if (childViewHolderInt != null && (i9 = childViewHolderInt.mPosition) >= i4 && i9 <= i3) {
                if (sVerboseLoggingEnabled) {
                    childViewHolderInt.toString();
                }
                if (childViewHolderInt.mPosition == i) {
                    childViewHolderInt.offsetPosition(i2 - i, false);
                } else {
                    childViewHolderInt.offsetPosition(i5, false);
                }
                this.mState.f = true;
            }
        }
        ArrayList arrayList = this.mRecycler.c;
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i10 = 1;
            i7 = i2;
        }
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            u uVar = (u) arrayList.get(i12);
            if (uVar != null && (i8 = uVar.mPosition) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    uVar.offsetPosition(i2 - i, false);
                } else {
                    uVar.offsetPosition(i10, false);
                }
                if (sVerboseLoggingEnabled) {
                    uVar.toString();
                }
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForRemove(int i, int i2, boolean z) {
        int i3 = i + i2;
        int h = this.mChildHelper.h();
        for (int i4 = 0; i4 < h; i4++) {
            u childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i4));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                int i5 = childViewHolderInt.mPosition;
                if (i5 >= i3) {
                    if (sVerboseLoggingEnabled) {
                        childViewHolderInt.toString();
                    }
                    childViewHolderInt.offsetPosition(-i2, z);
                    this.mState.f = true;
                } else if (i5 >= i) {
                    if (sVerboseLoggingEnabled) {
                        childViewHolderInt.toString();
                    }
                    childViewHolderInt.flagRemovedAndOffsetPosition(i - 1, -i2, z);
                    this.mState.f = true;
                }
            }
        }
        o oVar = this.mRecycler;
        ArrayList arrayList = oVar.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            u uVar = (u) arrayList.get(size);
            if (uVar != null) {
                int i6 = uVar.mPosition;
                if (i6 >= i3) {
                    if (sVerboseLoggingEnabled) {
                        uVar.toString();
                    }
                    uVar.offsetPosition(-i2, z);
                } else if (i6 >= i) {
                    uVar.addFlags(8);
                    oVar.i(size);
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
        float f;
        super.onAttachedToWindow();
        this.mLayoutOrScrollCounter = 0;
        this.mIsAttached = true;
        this.mFirstLayoutComplete = this.mFirstLayoutComplete && !isLayoutRequested();
        this.mRecycler.f();
        n nVar = this.mLayout;
        if (nVar != null) {
            nVar.dispatchAttachedToWindow(this);
        }
        this.mPostedAnimatorRunner = false;
        if (ALLOW_THREAD_GAP_WORK) {
            ThreadLocal threadLocal = f.e;
            f fVar = (f) threadLocal.get();
            this.mGapWorker = fVar;
            if (fVar == null) {
                this.mGapWorker = new f();
                WeakHashMap weakHashMap = bsk.a;
                Display display = getDisplay();
                if (!isInEditMode() && display != null) {
                    f = display.getRefreshRate();
                }
                f = 60.0f;
                f fVar2 = this.mGapWorker;
                fVar2.c = (long) (1.0E9f / f);
                threadLocal.set(fVar2);
            }
            ArrayList arrayList = this.mGapWorker.a;
            if (sDebugAssertionsEnabled && arrayList.contains(this)) {
                a70.r("RecyclerView already present in worker list!");
            } else {
                arrayList.add(this);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        f fVar;
        super.onDetachedFromWindow();
        m mVar = this.mItemAnimator;
        if (mVar != null) {
            mVar.e();
        }
        stopScroll();
        this.mIsAttached = false;
        n nVar = this.mLayout;
        if (nVar != null) {
            nVar.dispatchDetachedFromWindow(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.getClass();
        while (ctk.d.c() != null) {
        }
        o oVar = this.mRecycler;
        ArrayList arrayList = oVar.c;
        for (int i = 0; i < arrayList.size(); i++) {
            qha.o(((u) arrayList.get(i)).itemView);
        }
        oVar.g(oVar.h.mAdapter, false);
        Iterator it = new tsk(this).iterator();
        while (true) {
            usk uskVar = (usk) it;
            if (!uskVar.hasNext()) {
                break;
            }
            ArrayList arrayList2 = qha.C((View) uskVar.next()).a;
            int size = arrayList2.size();
            while (true) {
                size--;
                if (-1 < size) {
                    ((fsk) arrayList2.get(size)).a.e();
                }
            }
        }
        if (!ALLOW_THREAD_GAP_WORK || (fVar = this.mGapWorker) == null) {
            return;
        }
        boolean remove = fVar.a.remove(this);
        if (!sDebugAssertionsEnabled || remove) {
            this.mGapWorker = null;
        } else {
            a70.r("RecyclerView removal failed!");
        }
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            this.mItemDecorations.get(i).onDraw(canvas, this, this.mState);
        }
    }

    public void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    public void onExitLayoutOrScroll(boolean z) {
        int i = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i;
        if (i < 1) {
            if (sDebugAssertionsEnabled && i < 0) {
                a70.r(mz1.l(this, new StringBuilder("layout or scroll counter cannot go below zero.Some calls are not matching")));
                return;
            }
            this.mLayoutOrScrollCounter = 0;
            if (z) {
                dispatchContentChangedIfNecessary();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i;
        boolean z;
        float f;
        RecyclerView recyclerView;
        if (this.mLayout != null && !this.mLayoutSuppressed && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                float f2 = this.mLayout.canScrollVertically() ? -motionEvent.getAxisValue(9) : 0.0f;
                z = false;
                f = this.mLayout.canScrollHorizontally() ? motionEvent.getAxisValue(10) : 0.0f;
                r2 = f2;
                i = 0;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                i = 26;
                f = motionEvent.getAxisValue(26);
                if (this.mLayout.canScrollVertically()) {
                    float f3 = -f;
                    f = 0.0f;
                    r2 = f3;
                } else if (!this.mLayout.canScrollHorizontally()) {
                    f = 0.0f;
                }
                z = this.mLowResRotaryEncoderFeature;
            } else {
                i = 0;
                z = false;
                f = 0.0f;
            }
            int i2 = (int) (r2 * this.mScaledVerticalScrollFactor);
            int i3 = (int) (f * this.mScaledHorizontalScrollFactor);
            if (z) {
                OverScroller overScroller = this.mViewFlinger.c;
                recyclerView = this;
                recyclerView.smoothScrollBy((overScroller.getFinalX() - overScroller.getCurrX()) + i3, (overScroller.getFinalY() - overScroller.getCurrY()) + i2, null, Integer.MIN_VALUE, true);
            } else {
                recyclerView = this;
                recyclerView.nestedScrollByInternal(i3, i2, motionEvent, 1);
            }
            if (i != 0 && !z) {
                recyclerView.mDifferentialMotionFlingController.a(motionEvent, i);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (findInterceptingOnItemTouchListener(motionEvent)) {
            cancelScroll();
            return true;
        }
        n nVar = this.mLayout;
        if (nVar == null) {
            return false;
        }
        boolean canScrollHorizontally = nVar.canScrollHorizontally();
        boolean canScrollVertically = this.mLayout.canScrollVertically();
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker == null) {
            velocityTracker = VelocityTracker.obtain();
            this.mVelocityTracker = velocityTracker;
        }
        velocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.mIgnoreMotionEventTillDown) {
                this.mIgnoreMotionEventTillDown = false;
            }
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
            if (stopGlowAnimations(motionEvent) || this.mScrollState == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                stopNestedScroll(1);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
            startNestedScrollForType(0);
        } else if (actionMasked == 1) {
            this.mVelocityTracker.clear();
            stopNestedScroll(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
            if (findPointerIndex < 0) {
                return false;
            }
            int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.mScrollState != 1) {
                int i = x2 - this.mInitialTouchX;
                int i2 = y2 - this.mInitialTouchY;
                if (!canScrollHorizontally || Math.abs(i) <= this.mTouchSlop) {
                    z = false;
                } else {
                    this.mLastTouchX = x2;
                    z = true;
                }
                if (canScrollVertically && Math.abs(i2) > this.mTouchSlop) {
                    this.mLastTouchY = y2;
                    z = true;
                }
                if (z) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            cancelScroll();
        } else if (actionMasked == 5) {
            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.mLastTouchX = x3;
            this.mInitialTouchX = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.mLastTouchY = y3;
            this.mInitialTouchY = y3;
        } else if (actionMasked == 6) {
            onPointerUp(motionEvent);
        }
        return this.mScrollState == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        Trace.endSection();
        this.mFirstLayoutComplete = true;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        n nVar = this.mLayout;
        if (nVar == null) {
            defaultOnMeasure(i, i2);
            return;
        }
        boolean z = false;
        if (nVar.isAutoMeasureEnabled()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.mLayout.onMeasure(this.mRecycler, this.mState, i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.mLastAutoMeasureSkippedDueToExact = z;
            if (z || this.mAdapter == null) {
                return;
            }
            if (this.mState.d == 1) {
                dispatchLayoutStep1();
            }
            this.mLayout.setMeasureSpecs(i, i2);
            this.mState.i = true;
            dispatchLayoutStep2();
            this.mLayout.setMeasuredDimensionFromChildren(i, i2);
            if (this.mLayout.shouldMeasureTwice()) {
                this.mLayout.setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.mState.i = true;
                dispatchLayoutStep2();
                this.mLayout.setMeasuredDimensionFromChildren(i, i2);
            }
            this.mLastAutoMeasureNonExactMeasuredWidth = getMeasuredWidth();
            this.mLastAutoMeasureNonExactMeasuredHeight = getMeasuredHeight();
            return;
        }
        if (this.mHasFixedSize) {
            this.mLayout.onMeasure(this.mRecycler, this.mState, i, i2);
            return;
        }
        if (this.mAdapterUpdateDuringMeasure) {
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            processAdapterUpdatesAndSetAnimationFlags();
            onExitLayoutOrScroll();
            qrf qrfVar = this.mState;
            if (qrfVar.k) {
                qrfVar.g = true;
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
        l lVar = this.mAdapter;
        qrf qrfVar2 = this.mState;
        if (lVar != null) {
            qrfVar2.e = lVar.getItemCount();
        } else {
            qrfVar2.e = 0;
        }
        startInterceptRequestLayout();
        this.mLayout.onMeasure(this.mRecycler, this.mState, i, i2);
        stopInterceptRequestLayout(false);
        this.mState.g = false;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.mPendingSavedState = savedState;
        super.onRestoreInstanceState(savedState.a);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.mPendingSavedState;
        if (savedState2 != null) {
            savedState.c = savedState2.c;
            return savedState;
        }
        n nVar = this.mLayout;
        if (nVar != null) {
            savedState.c = nVar.onSaveInstanceState();
            return savedState;
        }
        savedState.c = null;
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        invalidateGlows();
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d7  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.mLayoutSuppressed || this.mIgnoreMotionEventTillDown) {
            return false;
        }
        if (dispatchToOnItemTouchListeners(motionEvent)) {
            cancelScroll();
            return true;
        }
        n nVar = this.mLayout;
        if (nVar == null) {
            return false;
        }
        boolean canScrollHorizontally = nVar.canScrollHorizontally();
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
            int x = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
            startNestedScrollForType(0);
        } else {
            if (actionMasked == 1) {
                this.mVelocityTracker.addMovement(obtain);
                this.mVelocityTracker.computeCurrentVelocity(1000, this.mMaxFlingVelocity);
                float f = canScrollHorizontally ? -this.mVelocityTracker.getXVelocity(this.mScrollPointerId) : 0.0f;
                float f2 = canScrollVertically ? -this.mVelocityTracker.getYVelocity(this.mScrollPointerId) : 0.0f;
                if ((f == 0.0f && f2 == 0.0f) || !fling((int) f, (int) f2)) {
                    setScrollState(0);
                }
                resetScroll();
                obtain.recycle();
                return true;
            }
            if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
                if (findPointerIndex < 0) {
                    return false;
                }
                int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                int i = this.mLastTouchX - x2;
                int i2 = this.mLastTouchY - y2;
                if (this.mScrollState != 1) {
                    if (canScrollHorizontally) {
                        int i3 = this.mTouchSlop;
                        i = i > 0 ? Math.max(0, i - i3) : Math.min(0, i + i3);
                        if (i != 0) {
                            z = true;
                            if (canScrollVertically) {
                                int i4 = this.mTouchSlop;
                                i2 = i2 > 0 ? Math.max(0, i2 - i4) : Math.min(0, i2 + i4);
                                if (i2 != 0) {
                                    z = true;
                                }
                            }
                            if (z) {
                                setScrollState(1);
                            }
                        }
                    }
                    z = false;
                    if (canScrollVertically) {
                    }
                    if (z) {
                    }
                }
                if (this.mScrollState == 1) {
                    int[] iArr3 = this.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    int releaseHorizontalGlow = i - releaseHorizontalGlow(i, motionEvent.getY());
                    int releaseVerticalGlow = i2 - releaseVerticalGlow(i2, motionEvent.getX());
                    if (dispatchNestedPreScroll(canScrollHorizontally ? releaseHorizontalGlow : 0, canScrollVertically ? releaseVerticalGlow : 0, this.mReusableIntPair, this.mScrollOffset, 0)) {
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
                    this.mLastTouchX = x2 - iArr7[0];
                    this.mLastTouchY = y2 - iArr7[1];
                    if (scrollByInternal(canScrollHorizontally ? releaseHorizontalGlow : 0, canScrollVertically ? releaseVerticalGlow : 0, motionEvent, 0)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    f fVar = this.mGapWorker;
                    if (fVar != null && (releaseHorizontalGlow != 0 || releaseVerticalGlow != 0)) {
                        fVar.a(this, releaseHorizontalGlow, releaseVerticalGlow);
                    }
                }
            } else if (actionMasked == 3) {
                cancelScroll();
            } else if (actionMasked == 5) {
                this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
                int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.mLastTouchX = x3;
                this.mInitialTouchX = x3;
                int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.mLastTouchY = y3;
                this.mInitialTouchY = y3;
            } else if (actionMasked == 6) {
                onPointerUp(motionEvent);
            }
        }
        this.mVelocityTracker.addMovement(obtain);
        obtain.recycle();
        return true;
    }

    public void postAnimationRunner() {
        if (this.mPostedAnimatorRunner || !this.mIsAttached) {
            return;
        }
        Runnable runnable = this.mItemAnimatorRunner;
        WeakHashMap weakHashMap = bsk.a;
        postOnAnimation(runnable);
        this.mPostedAnimatorRunner = true;
    }

    public void processDataSetCompletelyChanged(boolean z) {
        this.mDispatchItemsChangedEvent = z | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    public void recordAnimationInfoIfBouncedHiddenView(u uVar, drf drfVar) {
        uVar.setFlags(0, 8192);
        if (this.mState.h && uVar.isUpdated() && !uVar.isRemoved() && !uVar.shouldIgnore()) {
            this.mViewInfoStore.b.g(uVar, getChangedHolderKey(uVar));
        }
        fhh fhhVar = this.mViewInfoStore.a;
        ctk ctkVar = (ctk) fhhVar.get(uVar);
        if (ctkVar == null) {
            ctkVar = ctk.a();
            fhhVar.put(uVar, ctkVar);
        }
        ctkVar.b = drfVar;
        ctkVar.a |= 4;
    }

    public void removeAndRecycleViews() {
        m mVar = this.mItemAnimator;
        if (mVar != null) {
            mVar.e();
        }
        n nVar = this.mLayout;
        if (nVar != null) {
            nVar.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        }
        o oVar = this.mRecycler;
        oVar.a.clear();
        oVar.h();
    }

    public boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        b bVar = this.mChildHelper;
        am0 am0Var = bVar.b;
        d4a d4aVar = bVar.a;
        int i = bVar.d;
        boolean z = false;
        z = false;
        if (i == 1) {
            if (bVar.e != view) {
                a70.r("Cannot call removeViewIfHidden within removeView(At) for a different view");
                return false;
            }
        } else {
            if (i == 2) {
                a70.r("Cannot call removeViewIfHidden within removeViewIfHidden");
                return false;
            }
            try {
                bVar.d = 2;
                int indexOfChild = ((RecyclerView) d4aVar.b).indexOfChild(view);
                if (indexOfChild == -1) {
                    bVar.l(view);
                } else if (am0Var.t(indexOfChild)) {
                    am0Var.x(indexOfChild);
                    bVar.l(view);
                    d4aVar.v(indexOfChild);
                }
                bVar.d = 0;
                z = true;
            } finally {
                bVar.d = 0;
            }
        }
        if (z) {
            u childViewHolderInt = getChildViewHolderInt(view);
            this.mRecycler.n(childViewHolderInt);
            this.mRecycler.k(childViewHolderInt);
            if (sVerboseLoggingEnabled) {
                Objects.toString(view);
                toString();
            }
        }
        stopInterceptRequestLayout(!z);
        return z;
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z) {
        u childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.isTmpDetached()) {
                childViewHolderInt.clearTmpDetachFlag();
            } else if (!childViewHolderInt.shouldIgnore()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(childViewHolderInt);
                a70.p(mz1.l(this, sb));
                return;
            }
        } else if (sDebugAssertionsEnabled) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            a70.p(mz1.l(this, sb2));
            return;
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z);
    }

    public void removeItemDecoration(@NonNull erf erfVar) {
        n nVar = this.mLayout;
        if (nVar != null) {
            nVar.assertNotInLayoutOrScroll("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(erfVar);
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeItemDecorationAt(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i < 0 || i >= itemDecorationCount) {
            zzl.r(fc6.g(i, itemDecorationCount, " is an invalid index for size "));
        } else {
            removeItemDecoration(getItemDecorationAt(i));
        }
    }

    public void removeOnChildAttachStateChangeListener(@NonNull irf irfVar) {
        List<irf> list = this.mOnChildAttachStateListeners;
        if (list == null) {
            return;
        }
        list.remove(irfVar);
    }

    public void removeOnItemTouchListener(@NonNull krf krfVar) {
        this.mOnItemTouchListeners.remove(krfVar);
        if (this.mInterceptingOnItemTouchListener == krfVar) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(@NonNull OnScrollListener onScrollListener) {
        List<OnScrollListener> list = this.mScrollListeners;
        if (list != null) {
            list.remove(onScrollListener);
        }
    }

    public void removeRecyclerListener(@NonNull nrf nrfVar) {
        this.mRecyclerListeners.remove(nrfVar);
    }

    public void repositionShadowingViews() {
        u uVar;
        int e = this.mChildHelper.e();
        for (int i = 0; i < e; i++) {
            View d = this.mChildHelper.d(i);
            u childViewHolder = getChildViewHolder(d);
            if (childViewHolder != null && (uVar = childViewHolder.mShadowingHolder) != null) {
                View view = uVar.itemView;
                int left = d.getLeft();
                int top = d.getTop();
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
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.mLayout.requestChildRectangleOnScreen(this, view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.mOnItemTouchListeners.size();
        for (int i = 0; i < size; i++) {
            this.mOnItemTouchListeners.get(i).e(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
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
        int h = this.mChildHelper.h();
        for (int i = 0; i < h; i++) {
            u childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i));
            if (sDebugAssertionsEnabled && childViewHolderInt.mPosition == -1 && !childViewHolderInt.isRemoved()) {
                a70.r(mz1.l(this, new StringBuilder("view holder cannot have position -1 unless it is removed")));
                return;
            } else {
                if (!childViewHolderInt.shouldIgnore()) {
                    childViewHolderInt.saveOldPosition();
                }
            }
        }
    }

    @Override // android.view.View
    public void scrollBy(int i, int i2) {
        n nVar = this.mLayout;
        if (nVar == null || this.mLayoutSuppressed) {
            return;
        }
        boolean canScrollHorizontally = nVar.canScrollHorizontally();
        boolean canScrollVertically = this.mLayout.canScrollVertically();
        if (canScrollHorizontally || canScrollVertically) {
            if (!canScrollHorizontally) {
                i = 0;
            }
            if (!canScrollVertically) {
                i2 = 0;
            }
            scrollByInternal(i, i2, null, 0);
        }
    }

    public boolean scrollByInternal(int i, int i2, MotionEvent motionEvent, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i, i2, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i8 = iArr2[0];
            int i9 = iArr2[1];
            i6 = i - i8;
            i7 = i2 - i9;
            i5 = i9;
            i4 = i8;
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i4, i5, i6, i7, this.mScrollOffset, i3, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i10 = iArr4[0];
        int i11 = i6 - i10;
        int i12 = iArr4[1];
        int i13 = i7 - i12;
        boolean z = (i10 == 0 && i12 == 0) ? false : true;
        int i14 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        int i15 = iArr5[0];
        this.mLastTouchX = i14 - i15;
        int i16 = this.mLastTouchY;
        int i17 = iArr5[1];
        this.mLastTouchY = i16 - i17;
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + i15;
        iArr6[1] = iArr6[1] + i17;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !sea.r(motionEvent, 8194)) {
                pullGlows(motionEvent.getX(), i11, motionEvent.getY(), i13);
                if (Build.VERSION.SDK_INT >= 31 && sea.r(motionEvent, 4194304)) {
                    releaseGlows();
                }
            }
            considerReleasingGlowsOnScroll(i, i2);
        }
        if (i4 != 0 || i5 != 0) {
            dispatchOnScrolled(i4, i5);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z && i4 == 0 && i5 == 0) ? false : true;
    }

    public void scrollStep(int i, int i2, @Nullable int[] iArr) {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        Trace.beginSection(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        int scrollHorizontallyBy = i != 0 ? this.mLayout.scrollHorizontallyBy(i, this.mRecycler, this.mState) : 0;
        int scrollVerticallyBy = i2 != 0 ? this.mLayout.scrollVerticallyBy(i2, this.mRecycler, this.mState) : 0;
        Trace.endSection();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = scrollHorizontallyBy;
            iArr[1] = scrollVerticallyBy;
        }
    }

    public void scrollToPosition(int i) {
        if (this.mLayoutSuppressed) {
            return;
        }
        stopScroll();
        n nVar = this.mLayout;
        if (nVar == null) {
            return;
        }
        nVar.scrollToPosition(i);
        awakenScrollBars();
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (shouldDeferAccessibilityEvent(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(@Nullable urf urfVar) {
        this.mAccessibilityDelegate = urfVar;
        bsk.q(this, urfVar);
    }

    public void setAdapter(@Nullable l lVar) {
        setLayoutFrozen(false);
        setAdapterInternal(lVar, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(@Nullable arf arfVar) {
        if (arfVar == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    public boolean setChildImportantForAccessibilityInternal(u uVar, int i) {
        if (!isComputingLayout()) {
            uVar.itemView.setImportantForAccessibility(i);
            return true;
        }
        uVar.mPendingAccessibilityState = i;
        this.mPendingAccessibilityImportanceChange.add(uVar);
        return false;
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z;
        super.setClipToPadding(z);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(@NonNull brf brfVar) {
        brfVar.getClass();
        this.mEdgeEffectFactory = brfVar;
        invalidateGlows();
    }

    public void setHasFixedSize(boolean z) {
        this.mHasFixedSize = z;
    }

    public void setItemAnimator(@Nullable m mVar) {
        m mVar2 = this.mItemAnimator;
        if (mVar2 != null) {
            mVar2.e();
            this.mItemAnimator.a = null;
        }
        this.mItemAnimator = mVar;
        if (mVar != null) {
            mVar.a = this.mItemAnimatorListener;
        }
    }

    public void setItemViewCacheSize(int i) {
        o oVar = this.mRecycler;
        oVar.e = i;
        oVar.o();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(@Nullable n nVar) {
        RecyclerView recyclerView;
        if (nVar == this.mLayout) {
            return;
        }
        stopScroll();
        if (this.mLayout != null) {
            m mVar = this.mItemAnimator;
            if (mVar != null) {
                mVar.e();
            }
            this.mLayout.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
            o oVar = this.mRecycler;
            oVar.a.clear();
            oVar.h();
            if (this.mIsAttached) {
                this.mLayout.dispatchDetachedFromWindow(this, this.mRecycler);
            }
            this.mLayout.setRecyclerView(null);
            this.mLayout = null;
        } else {
            o oVar2 = this.mRecycler;
            oVar2.a.clear();
            oVar2.h();
        }
        b bVar = this.mChildHelper;
        bVar.b.y();
        ArrayList arrayList = bVar.c;
        int size = arrayList.size();
        while (true) {
            size--;
            recyclerView = (RecyclerView) bVar.a.b;
            if (size < 0) {
                break;
            }
            u childViewHolderInt = getChildViewHolderInt((View) arrayList.get(size));
            if (childViewHolderInt != null) {
                childViewHolderInt.onLeftHiddenState(recyclerView);
            }
            arrayList.remove(size);
        }
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            recyclerView.dispatchChildDetached(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.mLayout = nVar;
        if (nVar != null) {
            if (nVar.mRecyclerView != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(nVar);
                sb.append(" is already attached to a RecyclerView:");
                a70.p(mz1.l(nVar.mRecyclerView, sb));
                return;
            }
            nVar.setRecyclerView(this);
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
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
        } else {
            a70.p("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().g(z);
    }

    public void setOnFlingListener(@Nullable jrf jrfVar) {
        this.mOnFlingListener = jrfVar;
    }

    @Deprecated
    public void setOnScrollListener(@Nullable OnScrollListener onScrollListener) {
        this.mScrollListener = onScrollListener;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.mPreserveFocusAfterLayout = z;
    }

    public void setRecycledViewPool(@Nullable mrf mrfVar) {
        o oVar = this.mRecycler;
        RecyclerView recyclerView = oVar.h;
        oVar.g(recyclerView.mAdapter, false);
        if (oVar.g != null) {
            r1.b--;
        }
        oVar.g = mrfVar;
        if (mrfVar != null && recyclerView.getAdapter() != null) {
            oVar.g.b++;
        }
        oVar.f();
    }

    public void setScrollState(int i) {
        if (i == this.mScrollState) {
            return;
        }
        if (sVerboseLoggingEnabled) {
            new Exception();
        }
        this.mScrollState = i;
        if (i != 2) {
            stopScrollersInternal();
        }
        dispatchOnScrollStateChanged(i);
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 1) {
            this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        } else {
            this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        }
    }

    public void setViewCacheExtension(@Nullable srf srfVar) {
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

    public void smoothScrollBy(int i, int i2, @Nullable Interpolator interpolator, int i3, boolean z) {
        n nVar = this.mLayout;
        if (nVar == null || this.mLayoutSuppressed) {
            return;
        }
        if (!nVar.canScrollHorizontally()) {
            i = 0;
        }
        if (!this.mLayout.canScrollVertically()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        if (i3 != Integer.MIN_VALUE && i3 <= 0) {
            scrollBy(i, i2);
            return;
        }
        if (z) {
            int i4 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i4 |= 2;
            }
            startNestedScroll(i4, 1);
        }
        this.mViewFlinger.c(i, i2, interpolator, i3);
    }

    public void smoothScrollToPosition(int i) {
        n nVar;
        if (this.mLayoutSuppressed || (nVar = this.mLayout) == null) {
            return;
        }
        nVar.smoothScrollToPosition(this, this.mState, i);
    }

    public void startInterceptRequestLayout() {
        int i = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i;
        if (i != 1 || this.mLayoutSuppressed) {
            return;
        }
        this.mLayoutWasDefered = false;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().h(i, 0);
    }

    public void stopInterceptRequestLayout(boolean z) {
        int i = this.mInterceptRequestLayoutDepth;
        if (i < 1) {
            if (sDebugAssertionsEnabled) {
                a70.r(mz1.l(this, new StringBuilder("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.")));
                return;
            } else {
                this.mInterceptRequestLayoutDepth = 1;
                i = 1;
            }
        }
        if (!z && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (i == 1) {
            if (z && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
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
    public final void suppressLayout(boolean z) {
        if (z != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (z) {
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

    public void swapAdapter(@Nullable l lVar, boolean z) {
        setLayoutFrozen(false);
        setAdapterInternal(lVar, true, z);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    public void viewRangeUpdate(int i, int i2, Object obj) {
        int i3;
        int i4;
        int h = this.mChildHelper.h();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < h; i6++) {
            View g = this.mChildHelper.g(i6);
            u childViewHolderInt = getChildViewHolderInt(g);
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && (i4 = childViewHolderInt.mPosition) >= i && i4 < i5) {
                childViewHolderInt.addFlags(2);
                childViewHolderInt.addChangePayload(obj);
                ((hrf) g.getLayoutParams()).c = true;
            }
        }
        o oVar = this.mRecycler;
        ArrayList arrayList = oVar.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            u uVar = (u) arrayList.get(size);
            if (uVar != null && (i3 = uVar.mPosition) >= i && i3 < i5) {
                uVar.addFlags(2);
                oVar.i(size);
            }
        }
    }

    public void stopNestedScroll(int i) {
        getScrollingChildHelper().i(i);
    }

    public boolean hasNestedScrollingParent(int i) {
        return getScrollingChildHelper().f(i);
    }

    public boolean startNestedScroll(int i, int i2) {
        return getScrollingChildHelper().h(i, i2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().c(i, i2, iArr, iArr2, i3);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return getScrollingChildHelper().d(i, i2, i3, i4, iArr, i5, null);
    }

    public final void dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5, @NonNull int[] iArr2) {
        getScrollingChildHelper().d(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public void onChildAttachedToWindow(@NonNull View view) {
    }

    public void onChildDetachedFromWindow(@NonNull View view) {
    }

    public void onScrollStateChanged(int i) {
    }

    @Deprecated
    public void setRecyclerListener(@Nullable nrf nrfVar) {
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        n nVar = this.mLayout;
        if (nVar != null) {
            return nVar.generateLayoutParams(layoutParams);
        }
        a70.r(mz1.l(this, new StringBuilder("RecyclerView has no LayoutManager")));
        return null;
    }

    public void addItemDecoration(@NonNull erf erfVar) {
        addItemDecoration(erfVar, -1);
    }

    public void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static abstract class OnScrollListener {
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
        }

        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
        }
    }

    public void onScrolled(int i, int i2) {
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
    }

    @Nullable
    @Deprecated
    public u findViewHolderForPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    public void smoothScrollBy(int i, int i2, @Nullable Interpolator interpolator) {
        smoothScrollBy(i, i2, interpolator, Integer.MIN_VALUE);
    }

    public void smoothScrollBy(int i, int i2, @Nullable Interpolator interpolator, int i3) {
        smoothScrollBy(i, i2, interpolator, i3, false);
    }

    public void smoothScrollBy(int i, int i2) {
        smoothScrollBy(i, i2, null);
    }

    public boolean fling(int i, int i2) {
        return fling(i, i2, this.mMinFlingVelocity, this.mMaxFlingVelocity);
    }

    public RecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, androidx.recyclerview.R.attr.recyclerViewStyle);
    }

    public RecyclerView(@NonNull Context context) {
        this(context, null);
    }
}
