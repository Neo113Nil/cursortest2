package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager$SavedState;
import com.google.android.material.tabs.TabLayout;
import com.mbridge.msdk.nativex.view.RollingBCView;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class suk extends ViewGroup {
    private static final int CLOSE_ENOUGH = 2;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_GUTTER_SIZE = 16;
    private static final int DEFAULT_OFFSCREEN_PAGES = 1;
    private static final int DRAW_ORDER_DEFAULT = 0;
    private static final int DRAW_ORDER_FORWARD = 1;
    private static final int DRAW_ORDER_REVERSE = 2;
    private static final int INVALID_POINTER = -1;
    private static final int MAX_SETTLE_DURATION = 600;
    private static final int MIN_DISTANCE_FOR_FLING = 25;
    private static final int MIN_FLING_VELOCITY = 400;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    private static final String TAG = "ViewPager";
    private static final boolean USE_CACHE = false;
    private int mActivePointerId;
    PagerAdapter mAdapter;
    private List<fuk> mAdapterChangeListeners;
    private int mBottomPageBounds;
    private boolean mCalledSuper;
    private int mChildHeightMeasureSpec;
    private int mChildWidthMeasureSpec;
    private int mCloseEnough;
    int mCurItem;
    private int mDecorChildCount;
    private int mDefaultGutterSize;
    private int mDrawingOrder;
    private ArrayList<View> mDrawingOrderedChildren;
    private final Runnable mEndScrollRunnable;
    private int mExpectedAdapterCount;
    private long mFakeDragBeginTime;
    private boolean mFakeDragging;
    private boolean mFirstLayout;
    private float mFirstOffset;
    private int mFlingDistance;
    private int mGutterSize;
    private boolean mInLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private guk mInternalPageChangeListener;
    private boolean mIsBeingDragged;
    private boolean mIsScrollStarted;
    private boolean mIsUnableToDrag;
    private final ArrayList<cuk> mItems;
    private float mLastMotionX;
    private float mLastMotionY;
    private float mLastOffset;
    private EdgeEffect mLeftEdge;
    private Drawable mMarginDrawable;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private boolean mNeedCalculatePageOffsets;
    private iuk mObserver;
    private int mOffscreenPageLimit;
    private guk mOnPageChangeListener;
    private List<guk> mOnPageChangeListeners;
    private int mPageMargin;
    private huk mPageTransformer;
    private int mPageTransformerLayerType;
    private boolean mPopulatePending;
    private Parcelable mRestoredAdapterState;
    private ClassLoader mRestoredClassLoader;
    private int mRestoredCurItem;
    private EdgeEffect mRightEdge;
    private int mScrollState;
    private Scroller mScroller;
    private boolean mScrollingCacheEnabled;
    private final cuk mTempItem;
    private final Rect mTempRect;
    private int mTopPageBounds;
    private int mTouchSlop;
    private VelocityTracker mVelocityTracker;
    static final int[] LAYOUT_ATTRS = {R.attr.layout_gravity};
    private static final Comparator<cuk> COMPARATOR = new q6i(14);
    private static final Interpolator sInterpolator = new aca(4);
    private static final juk sPositionComparator = new juk();

    public suk(Context context) {
        super(context);
        this.mItems = new ArrayList<>();
        this.mTempItem = new cuk();
        this.mTempRect = new Rect();
        this.mRestoredCurItem = -1;
        this.mRestoredAdapterState = null;
        this.mRestoredClassLoader = null;
        this.mFirstOffset = -3.4028235E38f;
        this.mLastOffset = Float.MAX_VALUE;
        this.mOffscreenPageLimit = 1;
        this.mActivePointerId = -1;
        this.mFirstLayout = true;
        this.mNeedCalculatePageOffsets = false;
        this.mEndScrollRunnable = new kac((RollingBCView) this, 25);
        this.mScrollState = 0;
        initViewPager();
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.mScrollingCacheEnabled != z) {
            this.mScrollingCacheEnabled = z;
        }
    }

    public final void a(boolean z) {
        boolean z2 = this.mScrollState == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.mScroller.isFinished()) {
                this.mScroller.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.mScroller.getCurrX();
                int currY = this.mScroller.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        g(currX);
                    }
                }
            }
        }
        this.mPopulatePending = false;
        for (int i = 0; i < this.mItems.size(); i++) {
            cuk cukVar = this.mItems.get(i);
            if (cukVar.c) {
                cukVar.c = false;
                z2 = true;
            }
        }
        if (z2) {
            Runnable runnable = this.mEndScrollRunnable;
            if (!z) {
                runnable.run();
            } else {
                WeakHashMap weakHashMap = bsk.a;
                postOnAnimation(runnable);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        cuk infoForChild;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.b == this.mCurItem) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    public cuk addNewItem(int i, int i2) {
        cuk cukVar = new cuk();
        cukVar.b = i;
        cukVar.a = this.mAdapter.instantiateItem((ViewGroup) this, i);
        cukVar.d = this.mAdapter.getPageWidth(i);
        if (i2 < 0 || i2 >= this.mItems.size()) {
            this.mItems.add(cukVar);
            return cukVar;
        }
        this.mItems.add(i2, cukVar);
        return cukVar;
    }

    public void addOnAdapterChangeListener(@NonNull fuk fukVar) {
        List list = this.mAdapterChangeListeners;
        if (list == null) {
            list = new ArrayList();
            this.mAdapterChangeListeners = list;
        }
        list.add(fukVar);
    }

    public void addOnPageChangeListener(@NonNull guk gukVar) {
        List list = this.mOnPageChangeListeners;
        if (list == null) {
            list = new ArrayList();
            this.mOnPageChangeListeners = list;
        }
        list.add(gukVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        cuk infoForChild;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.b == this.mCurItem) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        duk dukVar = (duk) layoutParams;
        boolean z = dukVar.a | (view.getClass().getAnnotation(buk.class) != null);
        dukVar.a = z;
        if (!this.mInLayout) {
            super.addView(view, i, layoutParams);
        } else if (z) {
            a70.r("Cannot add pager decor view during layout");
        } else {
            dukVar.d = true;
            addViewInLayout(view, i, layoutParams);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean arrowScroll(int i) {
        View findNextFocus;
        boolean pageLeft;
        View findFocus = findFocus();
        if (findFocus != this) {
            if (findFocus != null) {
                for (ViewParent parent = findFocus.getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                    if (parent == this) {
                        break;
                    }
                }
                StringBuilder sb = new StringBuilder(findFocus.getClass().getSimpleName());
                for (ViewParent parent2 = findFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                    sb.append(" => ");
                    sb.append(parent2.getClass().getSimpleName());
                }
            }
            findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
            if (findNextFocus != null || findNextFocus == findFocus) {
                if (i != 17 || i == 1) {
                    pageLeft = pageLeft();
                } else {
                    if (i == 66 || i == 2) {
                        pageLeft = pageRight();
                    }
                    pageLeft = false;
                }
            } else if (i == 17) {
                pageLeft = (findFocus == null || d(this.mTempRect, findNextFocus).left < d(this.mTempRect, findFocus).left) ? findNextFocus.requestFocus() : pageLeft();
            } else {
                if (i == 66) {
                    pageLeft = (findFocus == null || d(this.mTempRect, findNextFocus).left > d(this.mTempRect, findFocus).left) ? findNextFocus.requestFocus() : pageRight();
                }
                pageLeft = false;
            }
            if (pageLeft) {
                playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
            }
            return pageLeft;
        }
        findFocus = null;
        findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        if (findNextFocus != null) {
        }
        if (i != 17) {
        }
        pageLeft = pageLeft();
        if (pageLeft) {
        }
        return pageLeft;
    }

    public final int b(int i, float f, int i2, int i3) {
        if (Math.abs(i3) <= this.mFlingDistance || Math.abs(i2) <= this.mMinimumVelocity) {
            i += (int) (f + (i >= this.mCurItem ? 0.4f : 0.6f));
        } else if (i2 <= 0) {
            i++;
        }
        if (this.mItems.size() > 0) {
            return Math.max(this.mItems.get(0).b, Math.min(i, ((cuk) mz1.h(this.mItems, 1)).b));
        }
        return i;
    }

    public boolean beginFakeDrag() {
        if (this.mIsBeingDragged) {
            return false;
        }
        this.mFakeDragging = true;
        setScrollState(1);
        this.mLastMotionX = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.mInitialMotionX = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
        this.mVelocityTracker.addMovement(obtain);
        obtain.recycle();
        this.mFakeDragBeginTime = uptimeMillis;
        return true;
    }

    public final void c(int i) {
        guk gukVar = this.mOnPageChangeListener;
        if (gukVar != null) {
            gukVar.onPageSelected(i);
        }
        List<guk> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                guk gukVar2 = this.mOnPageChangeListeners.get(i2);
                if (gukVar2 != null) {
                    gukVar2.onPageSelected(i);
                }
            }
        }
        guk gukVar3 = this.mInternalPageChangeListener;
        if (gukVar3 != null) {
            gukVar3.onPageSelected(i);
        }
    }

    public boolean canScroll(View view, boolean z, int i, int i2, int i3) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && canScroll(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && view.canScrollHorizontally(-i);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        if (this.mAdapter == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i < 0 ? scrollX > ((int) (((float) clientWidth) * this.mFirstOffset)) : i > 0 && scrollX < ((int) (((float) clientWidth) * this.mLastOffset));
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof duk) && super.checkLayoutParams(layoutParams);
    }

    public void clearOnPageChangeListeners() {
        List<guk> list = this.mOnPageChangeListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        this.mIsScrollStarted = true;
        if (this.mScroller.isFinished() || !this.mScroller.computeScrollOffset()) {
            a(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.mScroller.getCurrX();
        int currY = this.mScroller.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!g(currX)) {
                this.mScroller.abortAnimation();
                scrollTo(0, currY);
            }
        }
        WeakHashMap weakHashMap = bsk.a;
        postInvalidateOnAnimation();
    }

    public final Rect d(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    public void dataSetChanged() {
        int count = this.mAdapter.getCount();
        this.mExpectedAdapterCount = count;
        boolean z = this.mItems.size() < (this.mOffscreenPageLimit * 2) + 1 && this.mItems.size() < count;
        int i = this.mCurItem;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < this.mItems.size()) {
            cuk cukVar = this.mItems.get(i2);
            int itemPosition = this.mAdapter.getItemPosition(cukVar.a);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.mItems.remove(i2);
                    i2--;
                    if (!z2) {
                        this.mAdapter.startUpdate((ViewGroup) this);
                        z2 = true;
                    }
                    this.mAdapter.destroyItem((ViewGroup) this, cukVar.b, cukVar.a);
                    int i3 = this.mCurItem;
                    if (i3 == cukVar.b) {
                        i = Math.max(0, Math.min(i3, count - 1));
                    }
                } else {
                    int i4 = cukVar.b;
                    if (i4 != itemPosition) {
                        if (i4 == this.mCurItem) {
                            i = itemPosition;
                        }
                        cukVar.b = itemPosition;
                    }
                }
                z = true;
            }
            i2++;
        }
        if (z2) {
            this.mAdapter.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.mItems, COMPARATOR);
        if (z) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                duk dukVar = (duk) getChildAt(i5).getLayoutParams();
                if (!dukVar.a) {
                    dukVar.c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                }
            }
            setCurrentItemInternal(i, false, true);
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || executeKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        cuk infoForChild;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.b == this.mCurItem && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    public float distanceInfluenceForSnapDuration(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        PagerAdapter pagerAdapter;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (pagerAdapter = this.mAdapter) != null && pagerAdapter.getCount() > 1)) {
            if (!this.mLeftEdge.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.mFirstOffset * width);
                this.mLeftEdge.setSize(height, width);
                z = this.mLeftEdge.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.mRightEdge.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.mLastOffset + 1.0f)) * width2);
                this.mRightEdge.setSize(height2, width2);
                z |= this.mRightEdge.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.mLeftEdge.finish();
            this.mRightEdge.finish();
        }
        if (z) {
            WeakHashMap weakHashMap = bsk.a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.mMarginDrawable;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public final cuk e() {
        int i;
        int clientWidth = getClientWidth();
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f2 = clientWidth > 0 ? this.mPageMargin / clientWidth : 0.0f;
        int i2 = 0;
        boolean z = true;
        cuk cukVar = null;
        int i3 = -1;
        float f3 = 0.0f;
        while (i2 < this.mItems.size()) {
            cuk cukVar2 = this.mItems.get(i2);
            if (!z && cukVar2.b != (i = i3 + 1)) {
                cukVar2 = this.mTempItem;
                cukVar2.e = f + f3 + f2;
                cukVar2.b = i;
                cukVar2.d = this.mAdapter.getPageWidth(i);
                i2--;
            }
            cuk cukVar3 = cukVar2;
            f = cukVar3.e;
            float f4 = cukVar3.d + f + f2;
            if (!z && scrollX < f) {
                break;
            }
            if (scrollX < f4 || i2 == this.mItems.size() - 1) {
                return cukVar3;
            }
            int i4 = cukVar3.b;
            float f5 = cukVar3.d;
            i2++;
            i3 = i4;
            f3 = f5;
            cukVar = cukVar3;
            z = false;
        }
        return cukVar;
    }

    public void endFakeDrag() {
        if (!this.mFakeDragging) {
            a70.r("No fake drag in progress. Call beginFakeDrag first.");
            return;
        }
        if (this.mAdapter != null) {
            VelocityTracker velocityTracker = this.mVelocityTracker;
            velocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
            int xVelocity = (int) velocityTracker.getXVelocity(this.mActivePointerId);
            this.mPopulatePending = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            cuk e = e();
            setCurrentItemInternal(b(e.b, ((scrollX / clientWidth) - e.e) / e.d, xVelocity, (int) (this.mLastMotionX - this.mInitialMotionX)), true, true, xVelocity);
        }
        this.mIsBeingDragged = false;
        this.mIsUnableToDrag = false;
        VelocityTracker velocityTracker2 = this.mVelocityTracker;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            this.mVelocityTracker = null;
        }
        this.mFakeDragging = false;
    }

    public boolean executeKeyEvent(@NonNull KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 21) {
            return keyEvent.hasModifiers(2) ? pageLeft() : arrowScroll(17);
        }
        if (keyCode == 22) {
            return keyEvent.hasModifiers(2) ? pageRight() : arrowScroll(66);
        }
        if (keyCode != 61) {
            return false;
        }
        if (keyEvent.hasNoModifiers()) {
            return arrowScroll(2);
        }
        if (keyEvent.hasModifiers(1)) {
            return arrowScroll(1);
        }
        return false;
    }

    public final void f(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mActivePointerId) {
            int i = actionIndex == 0 ? 1 : 0;
            this.mLastMotionX = motionEvent.getX(i);
            this.mActivePointerId = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.mVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public void fakeDragBy(float f) {
        if (!this.mFakeDragging) {
            a70.r("No fake drag in progress. Call beginFakeDrag first.");
            return;
        }
        if (this.mAdapter == null) {
            return;
        }
        this.mLastMotionX += f;
        float scrollX = getScrollX() - f;
        float clientWidth = getClientWidth();
        float f2 = this.mFirstOffset * clientWidth;
        float f3 = this.mLastOffset * clientWidth;
        cuk cukVar = this.mItems.get(0);
        cuk cukVar2 = (cuk) mz1.h(this.mItems, 1);
        if (cukVar.b != 0) {
            f2 = cukVar.e * clientWidth;
        }
        if (cukVar2.b != this.mAdapter.getCount() - 1) {
            f3 = cukVar2.e * clientWidth;
        }
        if (scrollX < f2) {
            scrollX = f2;
        } else if (scrollX > f3) {
            scrollX = f3;
        }
        int i = (int) scrollX;
        this.mLastMotionX = (scrollX - i) + this.mLastMotionX;
        scrollTo(i, getScrollY());
        g(i);
        MotionEvent obtain = MotionEvent.obtain(this.mFakeDragBeginTime, SystemClock.uptimeMillis(), 2, this.mLastMotionX, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
        this.mVelocityTracker.addMovement(obtain);
        obtain.recycle();
    }

    public final boolean g(int i) {
        if (this.mItems.size() == 0) {
            if (this.mFirstLayout) {
                return false;
            }
            this.mCalledSuper = false;
            onPageScrolled(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
            if (this.mCalledSuper) {
                return false;
            }
            a70.r("onPageScrolled did not call superclass implementation");
            return false;
        }
        cuk e = e();
        int clientWidth = getClientWidth();
        int i2 = this.mPageMargin;
        int i3 = clientWidth + i2;
        float f = clientWidth;
        int i4 = e.b;
        float f2 = ((i / f) - e.e) / (e.d + (i2 / f));
        this.mCalledSuper = false;
        onPageScrolled(i4, f2, (int) (i3 * f2));
        if (this.mCalledSuper) {
            return true;
        }
        a70.r("onPageScrolled did not call superclass implementation");
        return false;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        duk dukVar = new duk(-1, -1);
        dukVar.c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        return dukVar;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        duk dukVar = new duk(context, attributeSet);
        dukVar.c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, LAYOUT_ATTRS);
        dukVar.b = obtainStyledAttributes.getInteger(0, 48);
        obtainStyledAttributes.recycle();
        return dukVar;
    }

    @Nullable
    public PagerAdapter getAdapter() {
        return this.mAdapter;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        if (this.mDrawingOrder == 2) {
            i2 = (i - 1) - i2;
        }
        return ((duk) this.mDrawingOrderedChildren.get(i2).getLayoutParams()).f;
    }

    public int getCurrentItem() {
        return this.mCurItem;
    }

    public int getOffscreenPageLimit() {
        return this.mOffscreenPageLimit;
    }

    public int getPageMargin() {
        return this.mPageMargin;
    }

    public final boolean h(float f) {
        boolean z;
        boolean z2;
        float f2 = this.mLastMotionX - f;
        this.mLastMotionX = f;
        float scrollX = getScrollX() + f2;
        float clientWidth = getClientWidth();
        float f3 = this.mFirstOffset * clientWidth;
        float f4 = this.mLastOffset * clientWidth;
        boolean z3 = false;
        cuk cukVar = this.mItems.get(0);
        cuk cukVar2 = (cuk) mz1.h(this.mItems, 1);
        if (cukVar.b != 0) {
            f3 = cukVar.e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (cukVar2.b != this.mAdapter.getCount() - 1) {
            f4 = cukVar2.e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.mLeftEdge.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.mRightEdge.onPull(Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.mLastMotionX = (scrollX - i) + this.mLastMotionX;
        scrollTo(i, getScrollY());
        g(i);
        return z3;
    }

    public final void i(int i, int i2, int i3, int i4) {
        if (i2 > 0 && !this.mItems.isEmpty()) {
            if (!this.mScroller.isFinished()) {
                this.mScroller.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)) * (((i - getPaddingLeft()) - getPaddingRight()) + i3)), getScrollY());
                return;
            }
        }
        cuk infoForPosition = infoForPosition(this.mCurItem);
        int min = (int) ((infoForPosition != null ? Math.min(infoForPosition.e, this.mLastOffset) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) * ((i - getPaddingLeft()) - getPaddingRight()));
        if (min != getScrollX()) {
            a(false);
            scrollTo(min, getScrollY());
        }
    }

    public cuk infoForAnyChild(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent == this) {
                return infoForChild(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    public cuk infoForChild(View view) {
        for (int i = 0; i < this.mItems.size(); i++) {
            cuk cukVar = this.mItems.get(i);
            if (this.mAdapter.isViewFromObject(view, cukVar.a)) {
                return cukVar;
            }
        }
        return null;
    }

    public cuk infoForPosition(int i) {
        for (int i2 = 0; i2 < this.mItems.size(); i2++) {
            cuk cukVar = this.mItems.get(i2);
            if (cukVar.b == i) {
                return cukVar;
            }
        }
        return null;
    }

    public void initViewPager() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.mScroller = new Scroller(context, sInterpolator);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        this.mMinimumVelocity = (int) (400.0f * f);
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mLeftEdge = new EdgeEffect(context);
        this.mRightEdge = new EdgeEffect(context);
        this.mFlingDistance = (int) (25.0f * f);
        this.mCloseEnough = (int) (2.0f * f);
        this.mDefaultGutterSize = (int) (f * 16.0f);
        bsk.q(this, new euk(this, 0));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        srk.c(this, new y3g(this));
    }

    public boolean isFakeDragging() {
        return this.mFakeDragging;
    }

    public final boolean j() {
        this.mActivePointerId = -1;
        this.mIsBeingDragged = false;
        this.mIsUnableToDrag = false;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
        this.mLeftEdge.onRelease();
        this.mRightEdge.onRelease();
        return this.mLeftEdge.isFinished() || this.mRightEdge.isFinished();
    }

    public final void k(int i, int i2, boolean z, boolean z2) {
        int i3;
        cuk infoForPosition = infoForPosition(i);
        if (infoForPosition != null) {
            i3 = (int) (Math.max(this.mFirstOffset, Math.min(infoForPosition.e, this.mLastOffset)) * getClientWidth());
        } else {
            i3 = 0;
        }
        if (z) {
            smoothScrollTo(i3, 0, i2);
            if (z2) {
                c(i);
                return;
            }
            return;
        }
        if (z2) {
            c(i);
        }
        a(false);
        scrollTo(i3, 0);
        g(i3);
    }

    public final void l() {
        if (this.mDrawingOrder != 0) {
            ArrayList<View> arrayList = this.mDrawingOrderedChildren;
            if (arrayList == null) {
                this.mDrawingOrderedChildren = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.mDrawingOrderedChildren.add(getChildAt(i));
            }
            Collections.sort(this.mDrawingOrderedChildren, sPositionComparator);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mFirstLayout = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.mEndScrollRunnable);
        Scroller scroller = this.mScroller;
        if (scroller != null && !scroller.isFinished()) {
            this.mScroller.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        float f;
        int i2;
        super.onDraw(canvas);
        if (this.mPageMargin <= 0 || this.mMarginDrawable == null || this.mItems.size() <= 0 || this.mAdapter == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f2 = this.mPageMargin / width;
        int i3 = 0;
        cuk cukVar = this.mItems.get(0);
        float f3 = cukVar.e;
        int size = this.mItems.size();
        int i4 = cukVar.b;
        int i5 = this.mItems.get(size - 1).b;
        while (i4 < i5) {
            while (true) {
                i = cukVar.b;
                if (i4 <= i || i3 >= size) {
                    break;
                }
                i3++;
                cukVar = this.mItems.get(i3);
            }
            if (i4 == i) {
                float f4 = cukVar.e;
                float f5 = cukVar.d;
                f = (f4 + f5) * width;
                f3 = f4 + f5 + f2;
            } else {
                float pageWidth = this.mAdapter.getPageWidth(i4);
                f = (f3 + pageWidth) * width;
                f3 = pageWidth + f2 + f3;
            }
            if (this.mPageMargin + f > scrollX) {
                i2 = scrollX;
                this.mMarginDrawable.setBounds(Math.round(f), this.mTopPageBounds, Math.round(this.mPageMargin + f), this.mBottomPageBounds);
                this.mMarginDrawable.draw(canvas);
            } else {
                i2 = scrollX;
            }
            if (f > i2 + r2) {
                return;
            }
            i4++;
            scrollX = i2;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            j();
            return false;
        }
        if (action != 0) {
            if (this.mIsBeingDragged) {
                return true;
            }
            if (this.mIsUnableToDrag) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.mInitialMotionX = x;
            this.mLastMotionX = x;
            float y = motionEvent.getY();
            this.mInitialMotionY = y;
            this.mLastMotionY = y;
            this.mActivePointerId = motionEvent.getPointerId(0);
            this.mIsUnableToDrag = false;
            this.mIsScrollStarted = true;
            this.mScroller.computeScrollOffset();
            if (this.mScrollState != 2 || Math.abs(this.mScroller.getFinalX() - this.mScroller.getCurrX()) <= this.mCloseEnough) {
                a(false);
                this.mIsBeingDragged = false;
            } else {
                this.mScroller.abortAnimation();
                this.mPopulatePending = false;
                populate();
                this.mIsBeingDragged = true;
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                setScrollState(1);
            }
        } else if (action == 2) {
            int i = this.mActivePointerId;
            if (i != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i);
                float x2 = motionEvent.getX(findPointerIndex);
                float f = x2 - this.mLastMotionX;
                float abs = Math.abs(f);
                float y2 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y2 - this.mInitialMotionY);
                if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    float f2 = this.mLastMotionX;
                    if ((f2 >= this.mGutterSize || f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) && ((f2 <= getWidth() - this.mGutterSize || f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) && canScroll(this, false, (int) f, (int) x2, (int) y2))) {
                        this.mLastMotionX = x2;
                        this.mLastMotionY = y2;
                        this.mIsUnableToDrag = true;
                        return false;
                    }
                }
                float f3 = this.mTouchSlop;
                if (abs > f3 && abs * 0.5f > abs2) {
                    this.mIsBeingDragged = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                    float f4 = this.mInitialMotionX;
                    float f5 = this.mTouchSlop;
                    this.mLastMotionX = f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? f4 + f5 : f4 - f5;
                    this.mLastMotionY = y2;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > f3) {
                    this.mIsUnableToDrag = true;
                }
                if (this.mIsBeingDragged && h(x2)) {
                    WeakHashMap weakHashMap = bsk.a;
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            f(motionEvent);
        }
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker == null) {
            velocityTracker = VelocityTracker.obtain();
            this.mVelocityTracker = velocityTracker;
        }
        velocityTracker.addMovement(motionEvent);
        return this.mIsBeingDragged;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        cuk infoForChild;
        int max;
        int i5;
        int max2;
        int i6;
        int childCount = getChildCount();
        int i7 = i3 - i;
        int i8 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                duk dukVar = (duk) childAt.getLayoutParams();
                if (dukVar.a) {
                    int i11 = dukVar.b;
                    int i12 = i11 & 7;
                    int i13 = i11 & 112;
                    if (i12 != 1) {
                        if (i12 == 3) {
                            i5 = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i12 != 5) {
                            i5 = paddingLeft;
                        } else {
                            max = (i7 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i13 == 16) {
                            if (i13 == 48) {
                                i6 = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i13 != 80) {
                                i6 = paddingTop;
                            } else {
                                max2 = (i8 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i14 = paddingLeft + scrollX;
                            childAt.layout(i14, paddingTop, childAt.getMeasuredWidth() + i14, childAt.getMeasuredHeight() + paddingTop);
                            i9++;
                            paddingTop = i6;
                            paddingLeft = i5;
                        } else {
                            max2 = Math.max((i8 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i15 = max2;
                        i6 = paddingTop;
                        paddingTop = i15;
                        int i142 = paddingLeft + scrollX;
                        childAt.layout(i142, paddingTop, childAt.getMeasuredWidth() + i142, childAt.getMeasuredHeight() + paddingTop);
                        i9++;
                        paddingTop = i6;
                        paddingLeft = i5;
                    } else {
                        max = Math.max((i7 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i16 = max;
                    i5 = paddingLeft;
                    paddingLeft = i16;
                    if (i13 == 16) {
                    }
                    int i152 = max2;
                    i6 = paddingTop;
                    paddingTop = i152;
                    int i1422 = paddingLeft + scrollX;
                    childAt.layout(i1422, paddingTop, childAt.getMeasuredWidth() + i1422, childAt.getMeasuredHeight() + paddingTop);
                    i9++;
                    paddingTop = i6;
                    paddingLeft = i5;
                }
            }
        }
        int i17 = (i7 - paddingLeft) - paddingRight;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt2 = getChildAt(i18);
            if (childAt2.getVisibility() != 8) {
                duk dukVar2 = (duk) childAt2.getLayoutParams();
                if (!dukVar2.a && (infoForChild = infoForChild(childAt2)) != null) {
                    float f = i17;
                    int i19 = ((int) (infoForChild.e * f)) + paddingLeft;
                    if (dukVar2.d) {
                        dukVar2.d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f * dukVar2.c), 1073741824), View.MeasureSpec.makeMeasureSpec((i8 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i19, paddingTop, childAt2.getMeasuredWidth() + i19, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.mTopPageBounds = paddingTop;
        this.mBottomPageBounds = i8 - paddingBottom;
        this.mDecorChildCount = i9;
        if (this.mFirstLayout) {
            z2 = false;
            k(this.mCurItem, 0, false, false);
        } else {
            z2 = false;
        }
        this.mFirstLayout = z2;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        duk dukVar;
        duk dukVar2;
        int i3;
        setMeasuredDimension(View.getDefaultSize(0, i), View.getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.mGutterSize = Math.min(measuredWidth / 10, this.mDefaultGutterSize);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i4 = 0;
        while (true) {
            boolean z = true;
            int i5 = 1073741824;
            if (i4 >= childCount) {
                break;
            }
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8 && (dukVar2 = (duk) childAt.getLayoutParams()) != null && dukVar2.a) {
                int i6 = dukVar2.b;
                int i7 = i6 & 7;
                int i8 = i6 & 112;
                boolean z2 = i8 == 48 || i8 == 80;
                if (i7 != 3 && i7 != 5) {
                    z = false;
                }
                int i9 = Integer.MIN_VALUE;
                if (z2) {
                    i3 = Integer.MIN_VALUE;
                    i9 = 1073741824;
                } else {
                    i3 = z ? 1073741824 : Integer.MIN_VALUE;
                }
                int i10 = ((ViewGroup.LayoutParams) dukVar2).width;
                if (i10 != -2) {
                    if (i10 == -1) {
                        i10 = paddingLeft;
                    }
                    i9 = 1073741824;
                } else {
                    i10 = paddingLeft;
                }
                int i11 = ((ViewGroup.LayoutParams) dukVar2).height;
                if (i11 == -2) {
                    i11 = measuredHeight;
                    i5 = i3;
                } else if (i11 == -1) {
                    i11 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i10, i9), View.MeasureSpec.makeMeasureSpec(i11, i5));
                if (z2) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i4++;
        }
        this.mChildWidthMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.mChildHeightMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.mInLayout = true;
        populate();
        this.mInLayout = false;
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8 && ((dukVar = (duk) childAt2.getLayoutParams()) == null || !dukVar.a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * dukVar.c), 1073741824), this.mChildHeightMeasureSpec);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onPageScrolled(int i, float f, int i2) {
        int max;
        int i3;
        int left;
        if (this.mDecorChildCount > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                duk dukVar = (duk) childAt.getLayoutParams();
                if (dukVar.a) {
                    int i5 = dukVar.b & 7;
                    if (i5 != 1) {
                        if (i5 == 3) {
                            i3 = childAt.getWidth() + paddingLeft;
                        } else if (i5 != 5) {
                            i3 = paddingLeft;
                        } else {
                            max = (width - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = i3;
                    } else {
                        max = Math.max((width - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i6 = max;
                    i3 = paddingLeft;
                    paddingLeft = i6;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                    }
                    paddingLeft = i3;
                }
            }
        }
        guk gukVar = this.mOnPageChangeListener;
        if (gukVar != null) {
            gukVar.onPageScrolled(i, f, i2);
        }
        List<guk> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                guk gukVar2 = this.mOnPageChangeListeners.get(i7);
                if (gukVar2 != null) {
                    gukVar2.onPageScrolled(i, f, i2);
                }
            }
        }
        guk gukVar3 = this.mInternalPageChangeListener;
        if (gukVar3 != null) {
            gukVar3.onPageScrolled(i, f, i2);
        }
        this.mCalledSuper = true;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        int i4;
        cuk infoForChild;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i3 = childCount;
            i2 = 0;
            i4 = 1;
        } else {
            i2 = childCount - 1;
            i3 = -1;
            i4 = -1;
        }
        while (i2 != i3) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.b == this.mCurItem && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i4;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ViewPager$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ViewPager$SavedState viewPager$SavedState = (ViewPager$SavedState) parcelable;
        ClassLoader classLoader = viewPager$SavedState.e;
        super.onRestoreInstanceState(viewPager$SavedState.a);
        PagerAdapter pagerAdapter = this.mAdapter;
        if (pagerAdapter != null) {
            pagerAdapter.restoreState(viewPager$SavedState.d, classLoader);
            setCurrentItemInternal(viewPager$SavedState.c, false, true);
        } else {
            this.mRestoredCurItem = viewPager$SavedState.c;
            this.mRestoredAdapterState = viewPager$SavedState.d;
            this.mRestoredClassLoader = classLoader;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        ViewPager$SavedState viewPager$SavedState = new ViewPager$SavedState(super.onSaveInstanceState());
        viewPager$SavedState.c = this.mCurItem;
        PagerAdapter pagerAdapter = this.mAdapter;
        if (pagerAdapter != null) {
            viewPager$SavedState.d = pagerAdapter.saveState();
        }
        return viewPager$SavedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.mPageMargin;
            i(i, i3, i5, i5);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        PagerAdapter pagerAdapter;
        if (!this.mFakeDragging) {
            boolean z = false;
            if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (pagerAdapter = this.mAdapter) == null || pagerAdapter.getCount() == 0) {
                return false;
            }
            VelocityTracker velocityTracker = this.mVelocityTracker;
            if (velocityTracker == null) {
                velocityTracker = VelocityTracker.obtain();
                this.mVelocityTracker = velocityTracker;
            }
            velocityTracker.addMovement(motionEvent);
            int action = motionEvent.getAction() & 255;
            if (action == 0) {
                this.mScroller.abortAnimation();
                this.mPopulatePending = false;
                populate();
                float x = motionEvent.getX();
                this.mInitialMotionX = x;
                this.mLastMotionX = x;
                float y = motionEvent.getY();
                this.mInitialMotionY = y;
                this.mLastMotionY = y;
                this.mActivePointerId = motionEvent.getPointerId(0);
            } else if (action != 1) {
                if (action == 2) {
                    if (!this.mIsBeingDragged) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
                        if (findPointerIndex == -1) {
                            z = j();
                        } else {
                            float x2 = motionEvent.getX(findPointerIndex);
                            float abs = Math.abs(x2 - this.mLastMotionX);
                            float y2 = motionEvent.getY(findPointerIndex);
                            float abs2 = Math.abs(y2 - this.mLastMotionY);
                            if (abs > this.mTouchSlop && abs > abs2) {
                                this.mIsBeingDragged = true;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                                float f = this.mInitialMotionX;
                                float f2 = x2 - f;
                                int i = this.mTouchSlop;
                                this.mLastMotionX = f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? f + i : f - i;
                                this.mLastMotionY = y2;
                                setScrollState(1);
                                setScrollingCacheEnabled(true);
                                ViewParent parent2 = getParent();
                                if (parent2 != null) {
                                    parent2.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                    if (this.mIsBeingDragged) {
                        z = h(motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId)));
                    }
                } else if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        this.mLastMotionX = motionEvent.getX(actionIndex);
                        this.mActivePointerId = motionEvent.getPointerId(actionIndex);
                    } else if (action == 6) {
                        f(motionEvent);
                        this.mLastMotionX = motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId));
                    }
                } else if (this.mIsBeingDragged) {
                    k(this.mCurItem, 0, true, false);
                    z = j();
                }
            } else if (this.mIsBeingDragged) {
                VelocityTracker velocityTracker2 = this.mVelocityTracker;
                velocityTracker2.computeCurrentVelocity(1000, this.mMaximumVelocity);
                int xVelocity = (int) velocityTracker2.getXVelocity(this.mActivePointerId);
                this.mPopulatePending = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                cuk e = e();
                float f3 = clientWidth;
                setCurrentItemInternal(b(e.b, ((scrollX / f3) - e.e) / (e.d + (this.mPageMargin / f3)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId)) - this.mInitialMotionX)), true, true, xVelocity);
                z = j();
            }
            if (z) {
                WeakHashMap weakHashMap = bsk.a;
                postInvalidateOnAnimation();
            }
        }
        return true;
    }

    public boolean pageLeft() {
        int i = this.mCurItem;
        if (i <= 0) {
            return false;
        }
        setCurrentItem(i - 1, true);
        return true;
    }

    public boolean pageRight() {
        PagerAdapter pagerAdapter = this.mAdapter;
        if (pagerAdapter == null || this.mCurItem >= pagerAdapter.getCount() - 1) {
            return false;
        }
        setCurrentItem(this.mCurItem + 1, true);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
    
        if (r9 == r10) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
    
        r8 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void populate(int i) {
        cuk cukVar;
        String hexString;
        cuk cukVar2;
        float f;
        cuk infoForChild;
        int i2;
        int i3;
        cuk cukVar3;
        cuk cukVar4;
        cuk cukVar5;
        int i4 = this.mCurItem;
        if (i4 != i) {
            cukVar = infoForPosition(i4);
            this.mCurItem = i;
        } else {
            cukVar = null;
        }
        if (this.mAdapter == null) {
            l();
            return;
        }
        if (this.mPopulatePending) {
            l();
            return;
        }
        if (getWindowToken() == null) {
            return;
        }
        this.mAdapter.startUpdate((ViewGroup) this);
        int i5 = this.mOffscreenPageLimit;
        int max = Math.max(0, this.mCurItem - i5);
        int count = this.mAdapter.getCount();
        int min = Math.min(count - 1, this.mCurItem + i5);
        if (count != this.mExpectedAdapterCount) {
            try {
                hexString = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException unused) {
                hexString = Integer.toHexString(getId());
            }
            StringBuilder sb = new StringBuilder("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ");
            me4.q(sb, this.mExpectedAdapterCount, ", found: ", count, " Pager id: ");
            sb.append(hexString);
            sb.append(" Pager class: ");
            sb.append(getClass());
            sb.append(" Problematic adapter: ");
            zzl.m(sb, this.mAdapter.getClass());
            return;
        }
        int i6 = 0;
        while (true) {
            if (i6 >= this.mItems.size()) {
                break;
            }
            cukVar2 = this.mItems.get(i6);
            int i7 = cukVar2.b;
            int i8 = this.mCurItem;
            if (i7 < i8) {
                i6++;
            }
        }
        if (cukVar2 == null && count > 0) {
            cukVar2 = addNewItem(this.mCurItem, i6);
        }
        if (cukVar2 != null) {
            int i9 = i6 - 1;
            cuk cukVar6 = i9 >= 0 ? this.mItems.get(i9) : null;
            int clientWidth = getClientWidth();
            float paddingLeft = clientWidth <= 0 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : (getPaddingLeft() / clientWidth) + (2.0f - cukVar2.d);
            float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            for (int i10 = this.mCurItem - 1; i10 >= 0; i10--) {
                if (f2 >= paddingLeft && i10 < max) {
                    if (cukVar6 == null) {
                        break;
                    }
                    if (i10 == cukVar6.b && !cukVar6.c) {
                        this.mItems.remove(i9);
                        this.mAdapter.destroyItem((ViewGroup) this, i10, cukVar6.a);
                        i9--;
                        i6--;
                        if (i9 >= 0) {
                            cukVar5 = this.mItems.get(i9);
                            cukVar6 = cukVar5;
                        }
                        cukVar5 = null;
                        cukVar6 = cukVar5;
                    }
                } else if (cukVar6 == null || i10 != cukVar6.b) {
                    f2 += addNewItem(i10, i9 + 1).d;
                    i6++;
                    if (i9 >= 0) {
                        cukVar5 = this.mItems.get(i9);
                        cukVar6 = cukVar5;
                    }
                    cukVar5 = null;
                    cukVar6 = cukVar5;
                } else {
                    f2 += cukVar6.d;
                    i9--;
                    if (i9 >= 0) {
                        cukVar5 = this.mItems.get(i9);
                        cukVar6 = cukVar5;
                    }
                    cukVar5 = null;
                    cukVar6 = cukVar5;
                }
            }
            f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            float f3 = cukVar2.d;
            int i11 = i6 + 1;
            if (f3 < 2.0f) {
                cuk cukVar7 = i11 < this.mItems.size() ? this.mItems.get(i11) : null;
                float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                int i12 = i11;
                for (int i13 = this.mCurItem + 1; i13 < count; i13++) {
                    if (f3 >= paddingRight && i13 > min) {
                        if (cukVar7 == null) {
                            break;
                        }
                        if (i13 == cukVar7.b && !cukVar7.c) {
                            this.mItems.remove(i12);
                            this.mAdapter.destroyItem((ViewGroup) this, i13, cukVar7.a);
                            if (i12 < this.mItems.size()) {
                                cukVar7 = this.mItems.get(i12);
                            }
                            cukVar7 = null;
                        }
                    } else if (cukVar7 == null || i13 != cukVar7.b) {
                        cuk addNewItem = addNewItem(i13, i12);
                        i12++;
                        f3 += addNewItem.d;
                        if (i12 < this.mItems.size()) {
                            cukVar7 = this.mItems.get(i12);
                        }
                        cukVar7 = null;
                    } else {
                        f3 += cukVar7.d;
                        i12++;
                        if (i12 < this.mItems.size()) {
                            cukVar7 = this.mItems.get(i12);
                        }
                        cukVar7 = null;
                    }
                }
            }
            int count2 = this.mAdapter.getCount();
            int clientWidth2 = getClientWidth();
            float f4 = clientWidth2 > 0 ? this.mPageMargin / clientWidth2 : 0.0f;
            if (cukVar != null) {
                int i14 = cukVar.b;
                int i15 = cukVar2.b;
                if (i14 < i15) {
                    float f5 = cukVar.e + cukVar.d + f4;
                    int i16 = i14 + 1;
                    int i17 = 0;
                    while (i16 <= cukVar2.b && i17 < this.mItems.size()) {
                        cuk cukVar8 = this.mItems.get(i17);
                        while (true) {
                            cukVar4 = cukVar8;
                            if (i16 <= cukVar4.b || i17 >= this.mItems.size() - 1) {
                                break;
                            }
                            i17++;
                            cukVar8 = this.mItems.get(i17);
                        }
                        while (i16 < cukVar4.b) {
                            f5 += this.mAdapter.getPageWidth(i16) + f4;
                            i16++;
                        }
                        cukVar4.e = f5;
                        f5 += cukVar4.d + f4;
                        i16++;
                    }
                } else if (i14 > i15) {
                    int size = this.mItems.size() - 1;
                    float f6 = cukVar.e;
                    while (true) {
                        i14--;
                        if (i14 < cukVar2.b || size < 0) {
                            break;
                        }
                        cuk cukVar9 = this.mItems.get(size);
                        while (true) {
                            cukVar3 = cukVar9;
                            if (i14 >= cukVar3.b || size <= 0) {
                                break;
                            }
                            size--;
                            cukVar9 = this.mItems.get(size);
                        }
                        while (i14 > cukVar3.b) {
                            f6 -= this.mAdapter.getPageWidth(i14) + f4;
                            i14--;
                        }
                        f6 -= cukVar3.d + f4;
                        cukVar3.e = f6;
                    }
                }
            }
            int size2 = this.mItems.size();
            float f7 = cukVar2.e;
            int i18 = cukVar2.b;
            int i19 = i18 - 1;
            this.mFirstOffset = i18 == 0 ? f7 : -3.4028235E38f;
            int i20 = count2 - 1;
            this.mLastOffset = i18 == i20 ? (cukVar2.d + f7) - 1.0f : Float.MAX_VALUE;
            int i21 = i6 - 1;
            while (i21 >= 0) {
                cuk cukVar10 = this.mItems.get(i21);
                while (true) {
                    i3 = cukVar10.b;
                    if (i19 <= i3) {
                        break;
                    }
                    f7 -= this.mAdapter.getPageWidth(i19) + f4;
                    i19--;
                }
                f7 -= cukVar10.d + f4;
                cukVar10.e = f7;
                if (i3 == 0) {
                    this.mFirstOffset = f7;
                }
                i21--;
                i19--;
            }
            float f8 = cukVar2.e + cukVar2.d + f4;
            int i22 = cukVar2.b;
            while (true) {
                i22++;
                if (i11 >= size2) {
                    break;
                }
                cuk cukVar11 = this.mItems.get(i11);
                while (true) {
                    i2 = cukVar11.b;
                    if (i22 >= i2) {
                        break;
                    }
                    f8 += this.mAdapter.getPageWidth(i22) + f4;
                    i22++;
                }
                if (i2 == i20) {
                    this.mLastOffset = (cukVar11.d + f8) - 1.0f;
                }
                cukVar11.e = f8;
                f8 += cukVar11.d + f4;
                i11++;
            }
            this.mNeedCalculatePageOffsets = false;
            this.mAdapter.setPrimaryItem((ViewGroup) this, this.mCurItem, cukVar2.a);
        } else {
            f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        this.mAdapter.finishUpdate((ViewGroup) this);
        int childCount = getChildCount();
        for (int i23 = 0; i23 < childCount; i23++) {
            View childAt = getChildAt(i23);
            duk dukVar = (duk) childAt.getLayoutParams();
            dukVar.f = i23;
            if (!dukVar.a && dukVar.c == f && (infoForChild = infoForChild(childAt)) != null) {
                dukVar.c = infoForChild.d;
                dukVar.e = infoForChild.b;
            }
        }
        l();
        if (hasFocus()) {
            View findFocus = findFocus();
            cuk infoForAnyChild = findFocus != null ? infoForAnyChild(findFocus) : null;
            if (infoForAnyChild == null || infoForAnyChild.b != this.mCurItem) {
                for (int i24 = 0; i24 < getChildCount(); i24++) {
                    View childAt2 = getChildAt(i24);
                    cuk infoForChild2 = infoForChild(childAt2);
                    if (infoForChild2 != null && infoForChild2.b == this.mCurItem && childAt2.requestFocus(2)) {
                        return;
                    }
                }
            }
        }
    }

    public void removeOnAdapterChangeListener(@NonNull fuk fukVar) {
        List<fuk> list = this.mAdapterChangeListeners;
        if (list != null) {
            list.remove(fukVar);
        }
    }

    public void removeOnPageChangeListener(@NonNull guk gukVar) {
        List<guk> list = this.mOnPageChangeListeners;
        if (list != null) {
            list.remove(gukVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.mInLayout) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(@Nullable PagerAdapter pagerAdapter) {
        PagerAdapter pagerAdapter2 = this.mAdapter;
        if (pagerAdapter2 != null) {
            pagerAdapter2.setViewPagerObserver(null);
            this.mAdapter.startUpdate((ViewGroup) this);
            for (int i = 0; i < this.mItems.size(); i++) {
                cuk cukVar = this.mItems.get(i);
                this.mAdapter.destroyItem((ViewGroup) this, cukVar.b, cukVar.a);
            }
            this.mAdapter.finishUpdate((ViewGroup) this);
            this.mItems.clear();
            int i2 = 0;
            while (i2 < getChildCount()) {
                if (!((duk) getChildAt(i2).getLayoutParams()).a) {
                    removeViewAt(i2);
                    i2--;
                }
                i2++;
            }
            this.mCurItem = 0;
            scrollTo(0, 0);
        }
        this.mAdapter = pagerAdapter;
        this.mExpectedAdapterCount = 0;
        if (pagerAdapter != null) {
            iuk iukVar = this.mObserver;
            if (iukVar == null) {
                iukVar = new iuk(this);
                this.mObserver = iukVar;
            }
            this.mAdapter.setViewPagerObserver(iukVar);
            this.mPopulatePending = false;
            boolean z = this.mFirstLayout;
            this.mFirstLayout = true;
            this.mExpectedAdapterCount = this.mAdapter.getCount();
            if (this.mRestoredCurItem >= 0) {
                this.mAdapter.restoreState(this.mRestoredAdapterState, this.mRestoredClassLoader);
                setCurrentItemInternal(this.mRestoredCurItem, false, true);
                this.mRestoredCurItem = -1;
                this.mRestoredAdapterState = null;
                this.mRestoredClassLoader = null;
            } else if (z) {
                requestLayout();
            } else {
                populate();
            }
        }
        List<fuk> list = this.mAdapterChangeListeners;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.mAdapterChangeListeners.size();
        for (int i3 = 0; i3 < size; i3++) {
            esi esiVar = (esi) this.mAdapterChangeListeners.get(i3);
            TabLayout tabLayout = esiVar.b;
            if (tabLayout.O == this) {
                tabLayout.m(pagerAdapter, esiVar.a);
            }
        }
    }

    public void setCurrentItem(int i) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i, !this.mFirstLayout, false);
    }

    public void setCurrentItemInternal(int i, boolean z, boolean z2, int i2) {
        PagerAdapter pagerAdapter = this.mAdapter;
        if (pagerAdapter == null || pagerAdapter.getCount() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z2 && this.mCurItem == i && this.mItems.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i >= this.mAdapter.getCount()) {
            i = this.mAdapter.getCount() - 1;
        }
        int i3 = this.mOffscreenPageLimit;
        int i4 = this.mCurItem;
        if (i > i4 + i3 || i < i4 - i3) {
            for (int i5 = 0; i5 < this.mItems.size(); i5++) {
                this.mItems.get(i5).c = true;
            }
        }
        boolean z3 = this.mCurItem != i;
        if (!this.mFirstLayout) {
            populate(i);
            k(i, i2, z, z3);
        } else {
            this.mCurItem = i;
            if (z3) {
                c(i);
            }
            requestLayout();
        }
    }

    public guk setInternalPageChangeListener(guk gukVar) {
        guk gukVar2 = this.mInternalPageChangeListener;
        this.mInternalPageChangeListener = gukVar;
        return gukVar2;
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            i = 1;
        }
        if (i != this.mOffscreenPageLimit) {
            this.mOffscreenPageLimit = i;
            populate();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(guk gukVar) {
        this.mOnPageChangeListener = gukVar;
    }

    public void setPageMargin(int i) {
        int i2 = this.mPageMargin;
        this.mPageMargin = i;
        int width = getWidth();
        i(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(@Nullable Drawable drawable) {
        this.mMarginDrawable = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setPageTransformer(boolean z, @Nullable huk hukVar, int i) {
        boolean z2 = hukVar != null;
        setChildrenDrawingOrderEnabled(z2);
        if (z2) {
            this.mDrawingOrder = z ? 2 : 1;
            this.mPageTransformerLayerType = i;
        } else {
            this.mDrawingOrder = 0;
        }
        if (z2) {
            populate();
        }
    }

    public void setScrollState(int i) {
        if (this.mScrollState == i) {
            return;
        }
        this.mScrollState = i;
        guk gukVar = this.mOnPageChangeListener;
        if (gukVar != null) {
            gukVar.onPageScrollStateChanged(i);
        }
        List<guk> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                guk gukVar2 = this.mOnPageChangeListeners.get(i2);
                if (gukVar2 != null) {
                    gukVar2.onPageScrollStateChanged(i);
                }
            }
        }
        guk gukVar3 = this.mInternalPageChangeListener;
        if (gukVar3 != null) {
            gukVar3.onPageScrollStateChanged(i);
        }
    }

    public void smoothScrollTo(int i, int i2, int i3) {
        int scrollX;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.mScroller;
        if (scroller == null || scroller.isFinished()) {
            scrollX = getScrollX();
        } else {
            boolean z = this.mIsScrollStarted;
            Scroller scroller2 = this.mScroller;
            scrollX = z ? scroller2.getCurrX() : scroller2.getStartX();
            this.mScroller.abortAnimation();
            setScrollingCacheEnabled(false);
        }
        int i4 = scrollX;
        int scrollY = getScrollY();
        int i5 = i - i4;
        int i6 = i2 - scrollY;
        if (i5 == 0 && i6 == 0) {
            a(false);
            populate();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i7 = clientWidth / 2;
        float f = clientWidth;
        float f2 = i7;
        float distanceInfluenceForSnapDuration = (distanceInfluenceForSnapDuration(Math.min(1.0f, (Math.abs(i5) * 1.0f) / f)) * f2) + f2;
        int abs = Math.abs(i3);
        int min = Math.min(abs > 0 ? Math.round(Math.abs(distanceInfluenceForSnapDuration / abs) * 1000.0f) * 4 : (int) (((Math.abs(i5) / ((this.mAdapter.getPageWidth(this.mCurItem) * f) + this.mPageMargin)) + 1.0f) * 100.0f), 600);
        this.mIsScrollStarted = false;
        this.mScroller.startScroll(i4, scrollY, i5, i6, min);
        WeakHashMap weakHashMap = bsk.a;
        postInvalidateOnAnimation();
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mMarginDrawable;
    }

    public void setCurrentItem(int i, boolean z) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i, z, false);
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(getContext().getDrawable(i));
    }

    public void setPageTransformer(boolean z, @Nullable huk hukVar) {
        setPageTransformer(z, hukVar, 2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public suk(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mItems = new ArrayList<>();
        this.mTempItem = new cuk();
        this.mTempRect = new Rect();
        this.mRestoredCurItem = -1;
        this.mRestoredAdapterState = null;
        this.mRestoredClassLoader = null;
        this.mFirstOffset = -3.4028235E38f;
        this.mLastOffset = Float.MAX_VALUE;
        this.mOffscreenPageLimit = 1;
        this.mActivePointerId = -1;
        this.mFirstLayout = true;
        this.mNeedCalculatePageOffsets = false;
        this.mEndScrollRunnable = new kac((RollingBCView) this, 25);
        this.mScrollState = 0;
        initViewPager();
    }

    public void setCurrentItemInternal(int i, boolean z, boolean z2) {
        setCurrentItemInternal(i, z, z2, 0);
    }

    public void smoothScrollTo(int i, int i2) {
        smoothScrollTo(i, i2, 0);
    }

    public void populate() {
        populate(this.mCurItem);
    }
}
