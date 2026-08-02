package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.WeakHashMap;
import okio.Segment;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class k1 {
    boolean mAutoMeasure;
    k mChildHelper;
    private int mHeight;
    private int mHeightMode;
    q2 mHorizontalBoundCheck;
    private final p2 mHorizontalBoundCheckCallback;
    boolean mIsAttachedToWindow;
    private boolean mItemPrefetchEnabled;
    private boolean mMeasurementCacheEnabled;
    int mPrefetchMaxCountObserved;
    boolean mPrefetchMaxObservedInInitialPrefetch;
    RecyclerView mRecyclerView;
    boolean mRequestedSimpleAnimations;
    y1 mSmoothScroller;
    q2 mVerticalBoundCheck;
    private final p2 mVerticalBoundCheckCallback;
    private int mWidth;
    private int mWidthMode;

    public k1() {
        h1 h1Var = new h1(this, 0);
        this.mHorizontalBoundCheckCallback = h1Var;
        h1 h1Var2 = new h1(this, 1);
        this.mVerticalBoundCheckCallback = h1Var2;
        this.mHorizontalBoundCheck = new q2(h1Var);
        this.mVerticalBoundCheck = new q2(h1Var2);
        this.mRequestedSimpleAnimations = false;
        this.mIsAttachedToWindow = false;
        this.mAutoMeasure = false;
        this.mMeasurementCacheEnabled = true;
        this.mItemPrefetchEnabled = true;
    }

    public static boolean b(int i5, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (i11 > 0 && i5 != i11) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i5;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i5;
        }
        return true;
    }

    public static int chooseSize(int i5, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i10, i11) : size : Math.min(size, Math.max(i10, i11));
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r3 >= 0) goto L5;
     */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int getChildMeasureSpec(int i5, int i10, int i11, boolean z5) {
        int i12 = i5 - i10;
        int i13 = 0;
        int max = Math.max(0, i12);
        if (!z5) {
            if (i11 < 0) {
                if (i11 == -1) {
                    i11 = max;
                } else {
                    if (i11 == -2) {
                        i13 = Integer.MIN_VALUE;
                        i11 = max;
                    }
                    i11 = 0;
                }
            }
            i13 = 1073741824;
        }
        return View.MeasureSpec.makeMeasureSpec(i11, i13);
    }

    public static j1 getProperties(@NonNull Context context, AttributeSet attributeSet, int i5, int i10) {
        j1 j1Var = new j1();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j2.a.f18247a, i5, i10);
        j1Var.f2444a = obtainStyledAttributes.getInt(0, 1);
        j1Var.f2445b = obtainStyledAttributes.getInt(10, 1);
        j1Var.f2446c = obtainStyledAttributes.getBoolean(9, false);
        j1Var.f2447d = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return j1Var;
    }

    public final void a(View view, int i5, boolean z5) {
        d2 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (z5 || childViewHolderInt.isRemoved()) {
            s.n nVar = this.mRecyclerView.mViewInfoStore.f2559a;
            r2 r2Var = (r2) nVar.get(childViewHolderInt);
            if (r2Var == null) {
                r2Var = r2.a();
                nVar.put(childViewHolderInt, r2Var);
            }
            r2Var.f2540a |= 1;
        } else {
            this.mRecyclerView.mViewInfoStore.c(childViewHolderInt);
        }
        l1 l1Var = (l1) view.getLayoutParams();
        if (childViewHolderInt.wasReturnedFromScrap() || childViewHolderInt.isScrap()) {
            if (childViewHolderInt.isScrap()) {
                childViewHolderInt.unScrap();
            } else {
                childViewHolderInt.clearReturnedFromScrapFlag();
            }
            this.mChildHelper.b(view, i5, view.getLayoutParams(), false);
        } else if (view.getParent() == this.mRecyclerView) {
            int j = this.mChildHelper.j(view);
            if (i5 == -1) {
                i5 = this.mChildHelper.e();
            }
            if (j == -1) {
                StringBuilder sb2 = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                sb2.append(this.mRecyclerView.indexOfChild(view));
                throw new IllegalStateException(androidx.appcompat.widget.c1.k(this.mRecyclerView, sb2));
            }
            if (j != i5) {
                this.mRecyclerView.mLayout.moveView(j, i5);
            }
        } else {
            this.mChildHelper.a(view, i5, false);
            l1Var.f2470c = true;
            y1 y1Var = this.mSmoothScroller;
            if (y1Var != null && y1Var.isRunning()) {
                this.mSmoothScroller.onChildAttachedToWindow(view);
            }
        }
        if (l1Var.f2471d) {
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d("RecyclerView", "consuming pending invalidate on child " + l1Var.f2468a);
            }
            childViewHolderInt.itemView.invalidate();
            l1Var.f2471d = false;
        }
    }

    @SuppressLint({"UnknownNullness"})
    public void addDisappearingView(View view) {
        addDisappearingView(view, -1);
    }

    @SuppressLint({"UnknownNullness"})
    public void addView(View view) {
        addView(view, -1);
    }

    public void assertInLayoutOrScroll(String str) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.assertInLayoutOrScroll(str);
        }
    }

    @SuppressLint({"UnknownNullness"})
    public void assertNotInLayoutOrScroll(String str) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.assertNotInLayoutOrScroll(str);
        }
    }

    public void attachView(@NonNull View view, int i5, l1 l1Var) {
        d2 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt.isRemoved()) {
            s.n nVar = this.mRecyclerView.mViewInfoStore.f2559a;
            r2 r2Var = (r2) nVar.get(childViewHolderInt);
            if (r2Var == null) {
                r2Var = r2.a();
                nVar.put(childViewHolderInt, r2Var);
            }
            r2Var.f2540a |= 1;
        } else {
            this.mRecyclerView.mViewInfoStore.c(childViewHolderInt);
        }
        this.mChildHelper.b(view, i5, l1Var, childViewHolderInt.isRemoved());
    }

    public final void c(s1 s1Var, int i5, View view) {
        d2 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt.shouldIgnore()) {
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d("RecyclerView", "ignoring view " + childViewHolderInt);
                return;
            }
            return;
        }
        if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !this.mRecyclerView.mAdapter.hasStableIds()) {
            removeViewAt(i5);
            s1Var.k(childViewHolderInt);
        } else {
            detachViewAt(i5);
            s1Var.l(view);
            this.mRecyclerView.mViewInfoStore.c(childViewHolderInt);
        }
    }

    public void calculateItemDecorationsForChild(@NonNull View view, @NonNull Rect rect) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.getItemDecorInsetsForChild(view));
        }
    }

    public abstract boolean canScrollHorizontally();

    public abstract boolean canScrollVertically();

    public boolean checkLayoutParams(l1 l1Var) {
        return l1Var != null;
    }

    public abstract int computeHorizontalScrollExtent(z1 z1Var);

    public abstract int computeHorizontalScrollOffset(z1 z1Var);

    public abstract int computeHorizontalScrollRange(z1 z1Var);

    public abstract int computeVerticalScrollExtent(z1 z1Var);

    public abstract int computeVerticalScrollOffset(z1 z1Var);

    public abstract int computeVerticalScrollRange(z1 z1Var);

    public void detachAndScrapAttachedViews(@NonNull s1 s1Var) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            c(s1Var, childCount, getChildAt(childCount));
        }
    }

    public void detachAndScrapView(@NonNull View view, @NonNull s1 s1Var) {
        c(s1Var, this.mChildHelper.j(view), view);
    }

    public void detachAndScrapViewAt(int i5, @NonNull s1 s1Var) {
        c(s1Var, i5, getChildAt(i5));
    }

    public void detachView(@NonNull View view) {
        int j = this.mChildHelper.j(view);
        if (j >= 0) {
            this.mChildHelper.c(j);
        }
    }

    public void detachViewAt(int i5) {
        getChildAt(i5);
        this.mChildHelper.c(i5);
    }

    public void dispatchAttachedToWindow(RecyclerView recyclerView) {
        this.mIsAttachedToWindow = true;
        onAttachedToWindow(recyclerView);
    }

    public void dispatchDetachedFromWindow(RecyclerView recyclerView, s1 s1Var) {
        this.mIsAttachedToWindow = false;
        onDetachedFromWindow(recyclerView, s1Var);
    }

    @SuppressLint({"UnknownNullness"})
    public void endAnimation(View view) {
        f1 f1Var = this.mRecyclerView.mItemAnimator;
        if (f1Var != null) {
            f1Var.d(RecyclerView.getChildViewHolderInt(view));
        }
    }

    public View findContainingItemView(@NonNull View view) {
        View findContainingItemView;
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || (findContainingItemView = recyclerView.findContainingItemView(view)) == null || this.mChildHelper.f2451c.contains(findContainingItemView)) {
            return null;
        }
        return findContainingItemView;
    }

    public View findViewByPosition(int i5) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            d2 childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt);
            if (childViewHolderInt != null && childViewHolderInt.getLayoutPosition() == i5 && !childViewHolderInt.shouldIgnore() && (this.mRecyclerView.mState.f2601g || !childViewHolderInt.isRemoved())) {
                return childAt;
            }
        }
        return null;
    }

    public abstract l1 generateDefaultLayoutParams();

    @SuppressLint({"UnknownNullness"})
    public l1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof l1 ? new l1((l1) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new l1((ViewGroup.MarginLayoutParams) layoutParams) : new l1(layoutParams);
    }

    public int getBaseline() {
        return -1;
    }

    public int getBottomDecorationHeight(@NonNull View view) {
        return ((l1) view.getLayoutParams()).f2469b.bottom;
    }

    public View getChildAt(int i5) {
        k kVar = this.mChildHelper;
        if (kVar != null) {
            return kVar.d(i5);
        }
        return null;
    }

    public int getChildCount() {
        k kVar = this.mChildHelper;
        if (kVar != null) {
            return kVar.e();
        }
        return 0;
    }

    public boolean getClipToPadding() {
        RecyclerView recyclerView = this.mRecyclerView;
        return recyclerView != null && recyclerView.mClipToPadding;
    }

    public int getColumnCountForAccessibility(@NonNull s1 s1Var, @NonNull z1 z1Var) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || recyclerView.mAdapter == null || !canScrollHorizontally()) {
            return 1;
        }
        return this.mRecyclerView.mAdapter.getItemCount();
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
        Rect rect = ((l1) view.getLayoutParams()).f2469b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public int getDecoratedMeasuredWidth(@NonNull View view) {
        Rect rect = ((l1) view.getLayoutParams()).f2469b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public int getDecoratedRight(@NonNull View view) {
        return getRightDecorationWidth(view) + view.getRight();
    }

    public int getDecoratedTop(@NonNull View view) {
        return view.getTop() - getTopDecorationHeight(view);
    }

    public View getFocusedChild() {
        View focusedChild;
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.mChildHelper.f2451c.contains(focusedChild)) {
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
        x0 adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.getItemCount();
        }
        return 0;
    }

    public int getItemViewType(@NonNull View view) {
        return RecyclerView.getChildViewHolderInt(view).getItemViewType();
    }

    public int getLayoutDirection() {
        return this.mRecyclerView.getLayoutDirection();
    }

    public int getLeftDecorationWidth(@NonNull View view) {
        return ((l1) view.getLayoutParams()).f2469b.left;
    }

    public int getMinimumHeight() {
        RecyclerView recyclerView = this.mRecyclerView;
        WeakHashMap weakHashMap = androidx.core.view.z0.f1413a;
        return recyclerView.getMinimumHeight();
    }

    public int getMinimumWidth() {
        RecyclerView recyclerView = this.mRecyclerView;
        WeakHashMap weakHashMap = androidx.core.view.z0.f1413a;
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
        WeakHashMap weakHashMap = androidx.core.view.z0.f1413a;
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
        WeakHashMap weakHashMap = androidx.core.view.z0.f1413a;
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
        return ((l1) view.getLayoutParams()).f2468a.getLayoutPosition();
    }

    public int getRightDecorationWidth(@NonNull View view) {
        return ((l1) view.getLayoutParams()).f2469b.right;
    }

    public int getRowCountForAccessibility(@NonNull s1 s1Var, @NonNull z1 z1Var) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || recyclerView.mAdapter == null || !canScrollVertically()) {
            return 1;
        }
        return this.mRecyclerView.mAdapter.getItemCount();
    }

    public int getSelectionModeForAccessibility(@NonNull s1 s1Var, @NonNull z1 z1Var) {
        return 0;
    }

    public int getTopDecorationHeight(@NonNull View view) {
        return ((l1) view.getLayoutParams()).f2469b.top;
    }

    public void getTransformedBoundingBox(@NonNull View view, boolean z5, @NonNull Rect rect) {
        Matrix matrix;
        if (z5) {
            Rect rect2 = ((l1) view.getLayoutParams()).f2469b;
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
        for (int i5 = 0; i5 < childCount; i5++) {
            ViewGroup.LayoutParams layoutParams = getChildAt(i5).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                return true;
            }
        }
        return false;
    }

    public boolean hasFocus() {
        RecyclerView recyclerView = this.mRecyclerView;
        return recyclerView != null && recyclerView.hasFocus();
    }

    public void ignoreView(@NonNull View view) {
        ViewParent parent = view.getParent();
        RecyclerView recyclerView = this.mRecyclerView;
        if (parent != recyclerView || recyclerView.indexOfChild(view) == -1) {
            throw new IllegalArgumentException(androidx.appcompat.widget.c1.k(this.mRecyclerView, new StringBuilder("View should be fully attached to be ignored")));
        }
        d2 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        childViewHolderInt.addFlags(128);
        this.mRecyclerView.mViewInfoStore.d(childViewHolderInt);
    }

    public boolean isAttachedToWindow() {
        return this.mIsAttachedToWindow;
    }

    public abstract boolean isAutoMeasureEnabled();

    public boolean isFocused() {
        RecyclerView recyclerView = this.mRecyclerView;
        return recyclerView != null && recyclerView.isFocused();
    }

    public final boolean isItemPrefetchEnabled() {
        return this.mItemPrefetchEnabled;
    }

    public boolean isLayoutHierarchical(@NonNull s1 s1Var, @NonNull z1 z1Var) {
        return false;
    }

    public boolean isLayoutReversed() {
        return false;
    }

    public boolean isMeasurementCacheEnabled() {
        return this.mMeasurementCacheEnabled;
    }

    public boolean isSmoothScrolling() {
        y1 y1Var = this.mSmoothScroller;
        return y1Var != null && y1Var.isRunning();
    }

    public boolean isViewPartiallyVisible(@NonNull View view, boolean z5, boolean z7) {
        boolean z10 = this.mHorizontalBoundCheck.b(view) && this.mVerticalBoundCheck.b(view);
        return z5 ? z10 : !z10;
    }

    public void layoutDecorated(@NonNull View view, int i5, int i10, int i11, int i12) {
        Rect rect = ((l1) view.getLayoutParams()).f2469b;
        view.layout(i5 + rect.left, i10 + rect.top, i11 - rect.right, i12 - rect.bottom);
    }

    public void layoutDecoratedWithMargins(@NonNull View view, int i5, int i10, int i11, int i12) {
        l1 l1Var = (l1) view.getLayoutParams();
        Rect rect = l1Var.f2469b;
        view.layout(i5 + rect.left + ((ViewGroup.MarginLayoutParams) l1Var).leftMargin, i10 + rect.top + ((ViewGroup.MarginLayoutParams) l1Var).topMargin, (i11 - rect.right) - ((ViewGroup.MarginLayoutParams) l1Var).rightMargin, (i12 - rect.bottom) - ((ViewGroup.MarginLayoutParams) l1Var).bottomMargin);
    }

    public void measureChild(@NonNull View view, int i5, int i10) {
        l1 l1Var = (l1) view.getLayoutParams();
        Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
        int i11 = itemDecorInsetsForChild.left + itemDecorInsetsForChild.right + i5;
        int i12 = itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom + i10;
        int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + i11, ((ViewGroup.MarginLayoutParams) l1Var).width, canScrollHorizontally());
        int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + i12, ((ViewGroup.MarginLayoutParams) l1Var).height, canScrollVertically());
        if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, l1Var)) {
            view.measure(childMeasureSpec, childMeasureSpec2);
        }
    }

    public void measureChildWithMargins(@NonNull View view, int i5, int i10) {
        l1 l1Var = (l1) view.getLayoutParams();
        Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
        int i11 = itemDecorInsetsForChild.left + itemDecorInsetsForChild.right + i5;
        int i12 = itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom + i10;
        int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) l1Var).leftMargin + ((ViewGroup.MarginLayoutParams) l1Var).rightMargin + i11, ((ViewGroup.MarginLayoutParams) l1Var).width, canScrollHorizontally());
        int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) l1Var).topMargin + ((ViewGroup.MarginLayoutParams) l1Var).bottomMargin + i12, ((ViewGroup.MarginLayoutParams) l1Var).height, canScrollVertically());
        if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, l1Var)) {
            view.measure(childMeasureSpec, childMeasureSpec2);
        }
    }

    public void moveView(int i5, int i10) {
        View childAt = getChildAt(i5);
        if (childAt != null) {
            detachViewAt(i5);
            attachView(childAt, i10);
        } else {
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i5 + this.mRecyclerView.toString());
        }
    }

    public void offsetChildrenHorizontal(int i5) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.offsetChildrenHorizontal(i5);
        }
    }

    public void offsetChildrenVertical(int i5) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.offsetChildrenVertical(i5);
        }
    }

    public boolean onAddFocusables(@NonNull RecyclerView recyclerView, @NonNull ArrayList<View> arrayList, int i5, int i10) {
        return false;
    }

    @Deprecated
    public void onDetachedFromWindow(RecyclerView recyclerView) {
    }

    public abstract void onDetachedFromWindow(RecyclerView recyclerView, s1 s1Var);

    public abstract View onFocusSearchFailed(View view, int i5, s1 s1Var, z1 z1Var);

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.mRecyclerView;
        onInitializeAccessibilityEvent(recyclerView.mRecycler, recyclerView.mState, accessibilityEvent);
    }

    public void onInitializeAccessibilityNodeInfo(q0.c cVar) {
        RecyclerView recyclerView = this.mRecyclerView;
        onInitializeAccessibilityNodeInfo(recyclerView.mRecycler, recyclerView.mState, cVar);
    }

    public void onInitializeAccessibilityNodeInfoForItem(View view, q0.c cVar) {
        d2 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt == null || childViewHolderInt.isRemoved()) {
            return;
        }
        k kVar = this.mChildHelper;
        if (kVar.f2451c.contains(childViewHolderInt.itemView)) {
            return;
        }
        RecyclerView recyclerView = this.mRecyclerView;
        onInitializeAccessibilityNodeInfoForItem(recyclerView.mRecycler, recyclerView.mState, view, cVar);
    }

    public View onInterceptFocusSearch(@NonNull View view, int i5) {
        return null;
    }

    public void onItemsUpdated(@NonNull RecyclerView recyclerView, int i5, int i10) {
    }

    public abstract void onLayoutChildren(s1 s1Var, z1 z1Var);

    public abstract void onLayoutCompleted(z1 z1Var);

    public void onMeasure(@NonNull s1 s1Var, @NonNull z1 z1Var, int i5, int i10) {
        this.mRecyclerView.defaultOnMeasure(i5, i10);
    }

    @Deprecated
    public boolean onRequestChildFocus(@NonNull RecyclerView recyclerView, @NonNull View view, View view2) {
        return isSmoothScrolling() || recyclerView.isComputingLayout();
    }

    public Parcelable onSaveInstanceState() {
        return null;
    }

    public void onSmoothScrollerStopped(y1 y1Var) {
        if (this.mSmoothScroller == y1Var) {
            this.mSmoothScroller = null;
        }
    }

    public boolean performAccessibilityAction(int i5, Bundle bundle) {
        RecyclerView recyclerView = this.mRecyclerView;
        return performAccessibilityAction(recyclerView.mRecycler, recyclerView.mState, i5, bundle);
    }

    public boolean performAccessibilityActionForItem(@NonNull s1 s1Var, @NonNull z1 z1Var, @NonNull View view, int i5, Bundle bundle) {
        return false;
    }

    public void postOnAnimation(Runnable runnable) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            WeakHashMap weakHashMap = androidx.core.view.z0.f1413a;
            recyclerView.postOnAnimation(runnable);
        }
    }

    public void removeAllViews() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            this.mChildHelper.k(childCount);
        }
    }

    public void removeAndRecycleAllViews(@NonNull s1 s1Var) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (!RecyclerView.getChildViewHolderInt(getChildAt(childCount)).shouldIgnore()) {
                removeAndRecycleViewAt(childCount, s1Var);
            }
        }
    }

    public void removeAndRecycleScrapInt(s1 s1Var) {
        ArrayList arrayList = s1Var.f2546a;
        int size = arrayList.size();
        for (int i5 = size - 1; i5 >= 0; i5--) {
            View view = ((d2) arrayList.get(i5)).itemView;
            d2 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.setIsRecyclable(false);
                if (childViewHolderInt.isTmpDetached()) {
                    this.mRecyclerView.removeDetachedView(view, false);
                }
                f1 f1Var = this.mRecyclerView.mItemAnimator;
                if (f1Var != null) {
                    f1Var.d(childViewHolderInt);
                }
                childViewHolderInt.setIsRecyclable(true);
                d2 childViewHolderInt2 = RecyclerView.getChildViewHolderInt(view);
                childViewHolderInt2.mScrapContainer = null;
                childViewHolderInt2.mInChangeScrap = false;
                childViewHolderInt2.clearReturnedFromScrapFlag();
                s1Var.k(childViewHolderInt2);
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = s1Var.f2547b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.mRecyclerView.invalidate();
        }
    }

    public void removeAndRecycleView(@NonNull View view, @NonNull s1 s1Var) {
        removeView(view);
        s1Var.j(view);
    }

    public void removeAndRecycleViewAt(int i5, @NonNull s1 s1Var) {
        View childAt = getChildAt(i5);
        removeViewAt(i5);
        s1Var.j(childAt);
    }

    public boolean removeCallbacks(Runnable runnable) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            return recyclerView.removeCallbacks(runnable);
        }
        return false;
    }

    public void removeDetachedView(@NonNull View view) {
        this.mRecyclerView.removeDetachedView(view, false);
    }

    @SuppressLint({"UnknownNullness"})
    public void removeView(View view) {
        k kVar = this.mChildHelper;
        v0 v0Var = kVar.f2449a;
        int i5 = kVar.f2452d;
        if (i5 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i5 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            kVar.f2452d = 1;
            kVar.f2453e = view;
            int indexOfChild = v0Var.f2572a.indexOfChild(view);
            if (indexOfChild >= 0) {
                if (kVar.f2450b.h(indexOfChild)) {
                    kVar.l(view);
                }
                v0Var.c(indexOfChild);
            }
            kVar.f2452d = 0;
            kVar.f2453e = null;
        } catch (Throwable th2) {
            kVar.f2452d = 0;
            kVar.f2453e = null;
            throw th2;
        }
    }

    public void removeViewAt(int i5) {
        if (getChildAt(i5) != null) {
            this.mChildHelper.k(i5);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b3, code lost:
    
        if ((r5.bottom - r10) > r2) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean requestChildRectangleOnScreen(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z5, boolean z7) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int width2 = rect.width() + left;
        int height2 = rect.height() + top;
        int i5 = left - paddingLeft;
        int min = Math.min(0, i5);
        int i10 = top - paddingTop;
        int min2 = Math.min(0, i10);
        int i11 = width2 - width;
        int max = Math.max(0, i11);
        int max2 = Math.max(0, height2 - height);
        if (getLayoutDirection() != 1) {
            if (min == 0) {
                min = Math.min(i5, max);
            }
            max = min;
        } else if (max == 0) {
            max = Math.max(min, i11);
        }
        if (min2 == 0) {
            min2 = Math.min(i10, max2);
        }
        int[] iArr = {max, min2};
        int i12 = iArr[0];
        int i13 = iArr[1];
        if (z7) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int paddingLeft2 = getPaddingLeft();
                int paddingTop2 = getPaddingTop();
                int width3 = getWidth() - getPaddingRight();
                int height3 = getHeight() - getPaddingBottom();
                Rect rect2 = this.mRecyclerView.mTempRect;
                getDecoratedBoundsWithMargins(focusedChild, rect2);
                if (rect2.left - i12 < width3) {
                    if (rect2.right - i12 > paddingLeft2) {
                        if (rect2.top - i13 < height3) {
                        }
                    }
                }
            }
            return false;
        }
        if (i12 != 0 || i13 != 0) {
            if (z5) {
                recyclerView.scrollBy(i12, i13);
            } else {
                recyclerView.smoothScrollBy(i12, i13);
            }
            return true;
        }
        return false;
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

    public abstract int scrollHorizontallyBy(int i5, s1 s1Var, z1 z1Var);

    public abstract void scrollToPosition(int i5);

    public abstract int scrollVerticallyBy(int i5, s1 s1Var, z1 z1Var);

    @Deprecated
    public void setAutoMeasureEnabled(boolean z5) {
        this.mAutoMeasure = z5;
    }

    public void setExactMeasureSpecsFrom(RecyclerView recyclerView) {
        setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public final void setItemPrefetchEnabled(boolean z5) {
        if (z5 != this.mItemPrefetchEnabled) {
            this.mItemPrefetchEnabled = z5;
            this.mPrefetchMaxCountObserved = 0;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.mRecycler.o();
            }
        }
    }

    public void setMeasureSpecs(int i5, int i10) {
        this.mWidth = View.MeasureSpec.getSize(i5);
        int mode = View.MeasureSpec.getMode(i5);
        this.mWidthMode = mode;
        if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
            this.mWidth = 0;
        }
        this.mHeight = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i10);
        this.mHeightMode = mode2;
        if (mode2 != 0 || RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
            return;
        }
        this.mHeight = 0;
    }

    public void setMeasuredDimension(Rect rect, int i5, int i10) {
        setMeasuredDimension(chooseSize(i5, getPaddingRight() + getPaddingLeft() + rect.width(), getMinimumWidth()), chooseSize(i10, getPaddingBottom() + getPaddingTop() + rect.height(), getMinimumHeight()));
    }

    public void setMeasuredDimensionFromChildren(int i5, int i10) {
        int childCount = getChildCount();
        if (childCount == 0) {
            this.mRecyclerView.defaultOnMeasure(i5, i10);
            return;
        }
        int i11 = Integer.MIN_VALUE;
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MIN_VALUE;
        int i14 = Integer.MAX_VALUE;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            Rect rect = this.mRecyclerView.mTempRect;
            getDecoratedBoundsWithMargins(childAt, rect);
            int i16 = rect.left;
            if (i16 < i14) {
                i14 = i16;
            }
            int i17 = rect.right;
            if (i17 > i11) {
                i11 = i17;
            }
            int i18 = rect.top;
            if (i18 < i12) {
                i12 = i18;
            }
            int i19 = rect.bottom;
            if (i19 > i13) {
                i13 = i19;
            }
        }
        this.mRecyclerView.mTempRect.set(i14, i12, i11, i13);
        setMeasuredDimension(this.mRecyclerView.mTempRect, i5, i10);
    }

    public void setMeasurementCacheEnabled(boolean z5) {
        this.mMeasurementCacheEnabled = z5;
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

    public boolean shouldMeasureChild(View view, int i5, int i10, l1 l1Var) {
        return (!view.isLayoutRequested() && this.mMeasurementCacheEnabled && b(view.getWidth(), i5, ((ViewGroup.MarginLayoutParams) l1Var).width) && b(view.getHeight(), i10, ((ViewGroup.MarginLayoutParams) l1Var).height)) ? false : true;
    }

    public boolean shouldMeasureTwice() {
        return false;
    }

    public boolean shouldReMeasureChild(View view, int i5, int i10, l1 l1Var) {
        return (this.mMeasurementCacheEnabled && b(view.getMeasuredWidth(), i5, ((ViewGroup.MarginLayoutParams) l1Var).width) && b(view.getMeasuredHeight(), i10, ((ViewGroup.MarginLayoutParams) l1Var).height)) ? false : true;
    }

    public abstract void smoothScrollToPosition(RecyclerView recyclerView, z1 z1Var, int i5);

    @SuppressLint({"UnknownNullness"})
    public void startSmoothScroll(y1 y1Var) {
        y1 y1Var2 = this.mSmoothScroller;
        if (y1Var2 != null && y1Var != y1Var2 && y1Var2.isRunning()) {
            this.mSmoothScroller.stop();
        }
        this.mSmoothScroller = y1Var;
        y1Var.start(this.mRecyclerView, this);
    }

    public void stopIgnoringView(@NonNull View view) {
        d2 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        childViewHolderInt.stopIgnoring();
        childViewHolderInt.resetInternal();
        childViewHolderInt.addFlags(4);
    }

    public void stopSmoothScroller() {
        y1 y1Var = this.mSmoothScroller;
        if (y1Var != null) {
            y1Var.stop();
        }
    }

    public boolean supportsPredictiveItemAnimations() {
        return false;
    }

    @SuppressLint({"UnknownNullness"})
    public void addDisappearingView(View view, int i5) {
        a(view, i5, true);
    }

    @SuppressLint({"UnknownNullness"})
    public void addView(View view, int i5) {
        a(view, i5, false);
    }

    public void onInitializeAccessibilityEvent(@NonNull s1 s1Var, @NonNull z1 z1Var, @NonNull AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z5 = true;
        if (!recyclerView.canScrollVertically(1) && !this.mRecyclerView.canScrollVertically(-1) && !this.mRecyclerView.canScrollHorizontally(-1) && !this.mRecyclerView.canScrollHorizontally(1)) {
            z5 = false;
        }
        accessibilityEvent.setScrollable(z5);
        x0 x0Var = this.mRecyclerView.mAdapter;
        if (x0Var != null) {
            accessibilityEvent.setItemCount(x0Var.getItemCount());
        }
    }

    public void onInitializeAccessibilityNodeInfo(@NonNull s1 s1Var, @NonNull z1 z1Var, @NonNull q0.c cVar) {
        if (this.mRecyclerView.canScrollVertically(-1) || this.mRecyclerView.canScrollHorizontally(-1)) {
            cVar.a(Segment.SIZE);
            cVar.q(true);
            cVar.i(67108864, true);
        }
        if (this.mRecyclerView.canScrollVertically(1) || this.mRecyclerView.canScrollHorizontally(1)) {
            cVar.a(4096);
            cVar.q(true);
            cVar.i(67108864, true);
        }
        cVar.f21914a.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) c4.k.b(getRowCountForAccessibility(s1Var, z1Var), getColumnCountForAccessibility(s1Var, z1Var), getSelectionModeForAccessibility(s1Var, z1Var), isLayoutHierarchical(s1Var, z1Var)).f3593a);
    }

    public void onItemsUpdated(@NonNull RecyclerView recyclerView, int i5, int i10, Object obj) {
        onItemsUpdated(recyclerView, i5, i10);
    }

    public boolean onRequestChildFocus(@NonNull RecyclerView recyclerView, @NonNull z1 z1Var, @NonNull View view, View view2) {
        return onRequestChildFocus(recyclerView, view, view2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0090 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean performAccessibilityAction(@NonNull s1 s1Var, @NonNull z1 z1Var, int i5, Bundle bundle) {
        int paddingTop;
        int paddingLeft;
        float f6;
        if (this.mRecyclerView != null) {
            int height = getHeight();
            int width = getWidth();
            Rect rect = new Rect();
            if (this.mRecyclerView.getMatrix().isIdentity() && this.mRecyclerView.getGlobalVisibleRect(rect)) {
                height = rect.height();
                width = rect.width();
            }
            if (i5 != 4096) {
                if (i5 != 8192) {
                    paddingTop = 0;
                    paddingLeft = 0;
                } else {
                    paddingTop = this.mRecyclerView.canScrollVertically(-1) ? -((height - getPaddingTop()) - getPaddingBottom()) : 0;
                    if (this.mRecyclerView.canScrollHorizontally(-1)) {
                        paddingLeft = -((width - getPaddingLeft()) - getPaddingRight());
                    }
                    paddingLeft = 0;
                }
                if (paddingTop == 0 || paddingLeft != 0) {
                    if (bundle != null) {
                        f6 = bundle.getFloat("androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT", 1.0f);
                        if (f6 < 0.0f) {
                            if (RecyclerView.sDebugAssertionsEnabled) {
                                throw new IllegalArgumentException("attempting to use ACTION_ARGUMENT_SCROLL_AMOUNT_FLOAT with a negative value (" + f6 + ")");
                            }
                        }
                    } else {
                        f6 = 1.0f;
                    }
                    if (Float.compare(f6, Float.POSITIVE_INFINITY) != 0) {
                        if (Float.compare(1.0f, f6) != 0 && Float.compare(0.0f, f6) != 0) {
                            paddingLeft = (int) (paddingLeft * f6);
                            paddingTop = (int) (paddingTop * f6);
                        }
                        this.mRecyclerView.smoothScrollBy(paddingLeft, paddingTop, null, Integer.MIN_VALUE, true);
                        return true;
                    }
                    RecyclerView recyclerView = this.mRecyclerView;
                    x0 x0Var = recyclerView.mAdapter;
                    if (x0Var != null) {
                        if (i5 == 4096) {
                            recyclerView.smoothScrollToPosition(x0Var.getItemCount() - 1);
                            return true;
                        }
                        if (i5 != 8192) {
                            return true;
                        }
                        recyclerView.smoothScrollToPosition(0);
                        return true;
                    }
                }
            } else {
                paddingTop = this.mRecyclerView.canScrollVertically(1) ? (height - getPaddingTop()) - getPaddingBottom() : 0;
                if (this.mRecyclerView.canScrollHorizontally(1)) {
                    paddingLeft = (width - getPaddingLeft()) - getPaddingRight();
                    if (paddingTop == 0) {
                    }
                    if (bundle != null) {
                    }
                    if (Float.compare(f6, Float.POSITIVE_INFINITY) != 0) {
                    }
                }
                paddingLeft = 0;
                if (paddingTop == 0) {
                }
                if (bundle != null) {
                }
                if (Float.compare(f6, Float.POSITIVE_INFINITY) != 0) {
                }
            }
        }
        return false;
    }

    public boolean performAccessibilityActionForItem(@NonNull View view, int i5, Bundle bundle) {
        RecyclerView recyclerView = this.mRecyclerView;
        return performAccessibilityActionForItem(recyclerView.mRecycler, recyclerView.mState, view, i5, bundle);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r5 == 1073741824) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int getChildMeasureSpec(int i5, int i10, int i11, int i12, boolean z5) {
        int max = Math.max(0, i5 - i11);
        if (z5) {
            if (i12 < 0) {
                if (i12 == -1) {
                    if (i10 != Integer.MIN_VALUE) {
                        if (i10 != 0) {
                        }
                    }
                    i12 = max;
                }
                i10 = 0;
                i12 = 0;
            }
            i10 = 1073741824;
        } else {
            if (i12 < 0) {
                if (i12 != -1) {
                    if (i12 == -2) {
                        if (i10 == Integer.MIN_VALUE || i10 == 1073741824) {
                            i12 = max;
                            i10 = Integer.MIN_VALUE;
                        } else {
                            i12 = max;
                            i10 = 0;
                        }
                    }
                    i10 = 0;
                    i12 = 0;
                }
                i12 = max;
            }
            i10 = 1073741824;
        }
        return View.MeasureSpec.makeMeasureSpec(i12, i10);
    }

    @SuppressLint({"UnknownNullness"})
    public l1 generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new l1(context, attributeSet);
    }

    public void onInitializeAccessibilityNodeInfoForItem(@NonNull s1 s1Var, @NonNull z1 z1Var, @NonNull View view, @NonNull q0.c cVar) {
        cVar.k(c4.k.a(canScrollVertically() ? getPosition(view) : 0, 1, canScrollHorizontally() ? getPosition(view) : 0, 1, false, false));
    }

    public void setMeasuredDimension(int i5, int i10) {
        this.mRecyclerView.setMeasuredDimension(i5, i10);
    }

    public void attachView(@NonNull View view, int i5) {
        attachView(view, i5, (l1) view.getLayoutParams());
    }

    public void attachView(@NonNull View view) {
        attachView(view, -1);
    }

    public void onAttachedToWindow(RecyclerView recyclerView) {
    }

    public void onItemsChanged(@NonNull RecyclerView recyclerView) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    public void onScrollStateChanged(int i5) {
    }

    public boolean requestChildRectangleOnScreen(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z5) {
        return requestChildRectangleOnScreen(recyclerView, view, rect, z5, false);
    }

    @SuppressLint({"UnknownNullness"})
    public void collectInitialPrefetchPositions(int i5, i1 i1Var) {
    }

    public void onAdapterChanged(x0 x0Var, x0 x0Var2) {
    }

    public void onItemsAdded(@NonNull RecyclerView recyclerView, int i5, int i10) {
    }

    public void onItemsRemoved(@NonNull RecyclerView recyclerView, int i5, int i10) {
    }

    @SuppressLint({"UnknownNullness"})
    public void collectAdjacentPrefetchPositions(int i5, int i10, z1 z1Var, i1 i1Var) {
    }

    public void onItemsMoved(@NonNull RecyclerView recyclerView, int i5, int i10, int i11) {
    }
}
