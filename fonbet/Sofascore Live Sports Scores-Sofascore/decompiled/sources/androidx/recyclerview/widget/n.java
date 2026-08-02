package androidx.recyclerview.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a70;
import defpackage.bsk;
import defpackage.by9;
import defpackage.ca;
import defpackage.cqa;
import defpackage.ctk;
import defpackage.d4a;
import defpackage.da;
import defpackage.dad;
import defpackage.fhh;
import defpackage.frf;
import defpackage.grf;
import defpackage.hrf;
import defpackage.lrk;
import defpackage.mrk;
import defpackage.mz1;
import defpackage.qrf;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class n {
    boolean mAutoMeasure;
    b mChildHelper;
    private int mHeight;
    private int mHeightMode;
    mrk mHorizontalBoundCheck;
    private final lrk mHorizontalBoundCheckCallback;
    boolean mIsAttachedToWindow;
    private boolean mItemPrefetchEnabled;
    private boolean mMeasurementCacheEnabled;
    int mPrefetchMaxCountObserved;
    boolean mPrefetchMaxObservedInInitialPrefetch;
    RecyclerView mRecyclerView;
    boolean mRequestedSimpleAnimations;

    @Nullable
    s mSmoothScroller;
    mrk mVerticalBoundCheck;
    private final lrk mVerticalBoundCheckCallback;
    private int mWidth;
    private int mWidthMode;

    public n() {
        by9 by9Var = new by9(this);
        this.mHorizontalBoundCheckCallback = by9Var;
        cqa cqaVar = new cqa(this);
        this.mVerticalBoundCheckCallback = cqaVar;
        this.mHorizontalBoundCheck = new mrk(by9Var);
        this.mVerticalBoundCheck = new mrk(cqaVar);
        this.mRequestedSimpleAnimations = false;
        this.mIsAttachedToWindow = false;
        this.mAutoMeasure = false;
        this.mMeasurementCacheEnabled = true;
        this.mItemPrefetchEnabled = true;
    }

    public static boolean b(int i, int i2, int i3) {
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

    public static int chooseSize(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
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

    public static grf getProperties(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        grf grfVar = new grf();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RecyclerView, i, i2);
        grfVar.a = obtainStyledAttributes.getInt(R.styleable.RecyclerView_android_orientation, 1);
        grfVar.b = obtainStyledAttributes.getInt(R.styleable.RecyclerView_spanCount, 1);
        grfVar.c = obtainStyledAttributes.getBoolean(R.styleable.RecyclerView_reverseLayout, false);
        grfVar.d = obtainStyledAttributes.getBoolean(R.styleable.RecyclerView_stackFromEnd, false);
        obtainStyledAttributes.recycle();
        return grfVar;
    }

    public final void a(View view, int i, boolean z) {
        u childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (z || childViewHolderInt.isRemoved()) {
            fhh fhhVar = this.mRecyclerView.mViewInfoStore.a;
            ctk ctkVar = (ctk) fhhVar.get(childViewHolderInt);
            if (ctkVar == null) {
                ctkVar = ctk.a();
                fhhVar.put(childViewHolderInt, ctkVar);
            }
            ctkVar.a |= 1;
        } else {
            this.mRecyclerView.mViewInfoStore.c(childViewHolderInt);
        }
        hrf hrfVar = (hrf) view.getLayoutParams();
        if (childViewHolderInt.wasReturnedFromScrap() || childViewHolderInt.isScrap()) {
            if (childViewHolderInt.isScrap()) {
                childViewHolderInt.unScrap();
            } else {
                childViewHolderInt.clearReturnedFromScrapFlag();
            }
            this.mChildHelper.b(view, i, view.getLayoutParams(), false);
        } else {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.mRecyclerView;
            b bVar = this.mChildHelper;
            if (parent == recyclerView) {
                int j = bVar.j(view);
                if (i == -1) {
                    i = this.mChildHelper.e();
                }
                if (j == -1) {
                    StringBuilder sb = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                    sb.append(this.mRecyclerView.indexOfChild(view));
                    a70.r(mz1.l(this.mRecyclerView, sb));
                    return;
                } else if (j != i) {
                    this.mRecyclerView.mLayout.moveView(j, i);
                }
            } else {
                bVar.a(view, i, false);
                hrfVar.c = true;
                s sVar = this.mSmoothScroller;
                if (sVar != null && sVar.isRunning()) {
                    this.mSmoothScroller.onChildAttachedToWindow(view);
                }
            }
        }
        if (hrfVar.d) {
            if (RecyclerView.sVerboseLoggingEnabled) {
                Objects.toString(hrfVar.a);
            }
            childViewHolderInt.itemView.invalidate();
            hrfVar.d = false;
        }
    }

    public void addDisappearingView(View view) {
        addDisappearingView(view, -1);
    }

    public void addView(View view) {
        addView(view, -1);
    }

    public void assertInLayoutOrScroll(String str) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.assertInLayoutOrScroll(str);
        }
    }

    public void assertNotInLayoutOrScroll(String str) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.assertNotInLayoutOrScroll(str);
        }
    }

    public void attachView(@NonNull View view, int i, hrf hrfVar) {
        u childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        boolean isRemoved = childViewHolderInt.isRemoved();
        RecyclerView recyclerView = this.mRecyclerView;
        if (isRemoved) {
            fhh fhhVar = recyclerView.mViewInfoStore.a;
            ctk ctkVar = (ctk) fhhVar.get(childViewHolderInt);
            if (ctkVar == null) {
                ctkVar = ctk.a();
                fhhVar.put(childViewHolderInt, ctkVar);
            }
            ctkVar.a |= 1;
        } else {
            recyclerView.mViewInfoStore.c(childViewHolderInt);
        }
        this.mChildHelper.b(view, i, hrfVar, childViewHolderInt.isRemoved());
    }

    public final void c(o oVar, int i, View view) {
        u childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt.shouldIgnore()) {
            if (RecyclerView.sVerboseLoggingEnabled) {
                childViewHolderInt.toString();
            }
        } else if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !this.mRecyclerView.mAdapter.hasStableIds()) {
            removeViewAt(i);
            oVar.k(childViewHolderInt);
        } else {
            detachViewAt(i);
            oVar.l(view);
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

    public boolean checkLayoutParams(hrf hrfVar) {
        return hrfVar != null;
    }

    public abstract int computeHorizontalScrollExtent(qrf qrfVar);

    public abstract int computeHorizontalScrollOffset(qrf qrfVar);

    public abstract int computeHorizontalScrollRange(qrf qrfVar);

    public abstract int computeVerticalScrollExtent(qrf qrfVar);

    public abstract int computeVerticalScrollOffset(qrf qrfVar);

    public abstract int computeVerticalScrollRange(qrf qrfVar);

    public void detachAndScrapAttachedViews(@NonNull o oVar) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            c(oVar, childCount, getChildAt(childCount));
        }
    }

    public void detachAndScrapView(@NonNull View view, @NonNull o oVar) {
        c(oVar, this.mChildHelper.j(view), view);
    }

    public void detachAndScrapViewAt(int i, @NonNull o oVar) {
        c(oVar, i, getChildAt(i));
    }

    public void detachView(@NonNull View view) {
        int j = this.mChildHelper.j(view);
        if (j >= 0) {
            this.mChildHelper.c(j);
        }
    }

    public void detachViewAt(int i) {
        getChildAt(i);
        this.mChildHelper.c(i);
    }

    public void dispatchAttachedToWindow(RecyclerView recyclerView) {
        this.mIsAttachedToWindow = true;
        onAttachedToWindow(recyclerView);
    }

    public void dispatchDetachedFromWindow(RecyclerView recyclerView, o oVar) {
        this.mIsAttachedToWindow = false;
        onDetachedFromWindow(recyclerView, oVar);
    }

    public void endAnimation(View view) {
        m mVar = this.mRecyclerView.mItemAnimator;
        if (mVar != null) {
            mVar.d(RecyclerView.getChildViewHolderInt(view));
        }
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

    public View findViewByPosition(int i) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            u childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt);
            if (childViewHolderInt != null && childViewHolderInt.getLayoutPosition() == i && !childViewHolderInt.shouldIgnore() && (this.mRecyclerView.mState.g || !childViewHolderInt.isRemoved())) {
                return childAt;
            }
        }
        return null;
    }

    public abstract hrf generateDefaultLayoutParams();

    public hrf generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof hrf ? new hrf((hrf) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new hrf((ViewGroup.MarginLayoutParams) layoutParams) : new hrf(layoutParams);
    }

    public int getBaseline() {
        return -1;
    }

    public int getBottomDecorationHeight(@NonNull View view) {
        return ((hrf) view.getLayoutParams()).b.bottom;
    }

    @Nullable
    public View getChildAt(int i) {
        b bVar = this.mChildHelper;
        if (bVar != null) {
            return bVar.d(i);
        }
        return null;
    }

    public int getChildCount() {
        b bVar = this.mChildHelper;
        if (bVar != null) {
            return bVar.e();
        }
        return 0;
    }

    public boolean getClipToPadding() {
        RecyclerView recyclerView = this.mRecyclerView;
        return recyclerView != null && recyclerView.mClipToPadding;
    }

    public int getColumnCountForAccessibility(@NonNull o oVar, @NonNull qrf qrfVar) {
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
        Rect rect = ((hrf) view.getLayoutParams()).b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public int getDecoratedMeasuredWidth(@NonNull View view) {
        Rect rect = ((hrf) view.getLayoutParams()).b;
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
        l adapter = recyclerView != null ? recyclerView.getAdapter() : null;
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
        return ((hrf) view.getLayoutParams()).b.left;
    }

    public int getMinimumHeight() {
        RecyclerView recyclerView = this.mRecyclerView;
        WeakHashMap weakHashMap = bsk.a;
        return recyclerView.getMinimumHeight();
    }

    public int getMinimumWidth() {
        RecyclerView recyclerView = this.mRecyclerView;
        WeakHashMap weakHashMap = bsk.a;
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
        WeakHashMap weakHashMap = bsk.a;
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
        WeakHashMap weakHashMap = bsk.a;
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
        return ((hrf) view.getLayoutParams()).a.getLayoutPosition();
    }

    public int getRightDecorationWidth(@NonNull View view) {
        return ((hrf) view.getLayoutParams()).b.right;
    }

    public int getRowCountForAccessibility(@NonNull o oVar, @NonNull qrf qrfVar) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || recyclerView.mAdapter == null || !canScrollVertically()) {
            return 1;
        }
        return this.mRecyclerView.mAdapter.getItemCount();
    }

    public int getSelectionModeForAccessibility(@NonNull o oVar, @NonNull qrf qrfVar) {
        return 0;
    }

    public int getTopDecorationHeight(@NonNull View view) {
        return ((hrf) view.getLayoutParams()).b.top;
    }

    public void getTransformedBoundingBox(@NonNull View view, boolean z, @NonNull Rect rect) {
        Matrix matrix;
        if (z) {
            Rect rect2 = ((hrf) view.getLayoutParams()).b;
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

    public boolean hasFocus() {
        RecyclerView recyclerView = this.mRecyclerView;
        return recyclerView != null && recyclerView.hasFocus();
    }

    public void ignoreView(@NonNull View view) {
        ViewParent parent = view.getParent();
        RecyclerView recyclerView = this.mRecyclerView;
        if (parent != recyclerView || recyclerView.indexOfChild(view) == -1) {
            a70.p(mz1.l(this.mRecyclerView, new StringBuilder("View should be fully attached to be ignored")));
        } else {
            u childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.addFlags(128);
            this.mRecyclerView.mViewInfoStore.d(childViewHolderInt);
        }
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

    public boolean isLayoutHierarchical(@NonNull o oVar, @NonNull qrf qrfVar) {
        return false;
    }

    public boolean isLayoutReversed() {
        return false;
    }

    public boolean isMeasurementCacheEnabled() {
        return this.mMeasurementCacheEnabled;
    }

    public boolean isSmoothScrolling() {
        s sVar = this.mSmoothScroller;
        return sVar != null && sVar.isRunning();
    }

    public boolean isViewPartiallyVisible(@NonNull View view, boolean z, boolean z2) {
        boolean z3 = this.mHorizontalBoundCheck.b(view) && this.mVerticalBoundCheck.b(view);
        return z ? z3 : !z3;
    }

    public void layoutDecorated(@NonNull View view, int i, int i2, int i3, int i4) {
        Rect rect = ((hrf) view.getLayoutParams()).b;
        view.layout(i + rect.left, i2 + rect.top, i3 - rect.right, i4 - rect.bottom);
    }

    public void layoutDecoratedWithMargins(@NonNull View view, int i, int i2, int i3, int i4) {
        hrf hrfVar = (hrf) view.getLayoutParams();
        Rect rect = hrfVar.b;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) hrfVar).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) hrfVar).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) hrfVar).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) hrfVar).bottomMargin);
    }

    public void measureChild(@NonNull View view, int i, int i2) {
        hrf hrfVar = (hrf) view.getLayoutParams();
        Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
        int i3 = itemDecorInsetsForChild.left + itemDecorInsetsForChild.right + i;
        int i4 = itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom + i2;
        int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + i3, ((ViewGroup.MarginLayoutParams) hrfVar).width, canScrollHorizontally());
        int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + i4, ((ViewGroup.MarginLayoutParams) hrfVar).height, canScrollVertically());
        if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, hrfVar)) {
            view.measure(childMeasureSpec, childMeasureSpec2);
        }
    }

    public void measureChildWithMargins(@NonNull View view, int i, int i2) {
        hrf hrfVar = (hrf) view.getLayoutParams();
        Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
        int i3 = itemDecorInsetsForChild.left + itemDecorInsetsForChild.right + i;
        int i4 = itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom + i2;
        int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) hrfVar).leftMargin + ((ViewGroup.MarginLayoutParams) hrfVar).rightMargin + i3, ((ViewGroup.MarginLayoutParams) hrfVar).width, canScrollHorizontally());
        int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) hrfVar).topMargin + ((ViewGroup.MarginLayoutParams) hrfVar).bottomMargin + i4, ((ViewGroup.MarginLayoutParams) hrfVar).height, canScrollVertically());
        if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, hrfVar)) {
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

    public abstract void onDetachedFromWindow(RecyclerView recyclerView, o oVar);

    public abstract View onFocusSearchFailed(View view, int i, o oVar, qrf qrfVar);

    public void onInitializeAccessibilityEvent(@NonNull o oVar, @NonNull qrf qrfVar, @NonNull AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.mRecyclerView.canScrollVertically(-1) && !this.mRecyclerView.canScrollHorizontally(-1) && !this.mRecyclerView.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        l lVar = this.mRecyclerView.mAdapter;
        if (lVar != null) {
            accessibilityEvent.setItemCount(lVar.getItemCount());
        }
    }

    public void onInitializeAccessibilityNodeInfo(o oVar, qrf qrfVar, da daVar) {
        if (this.mRecyclerView.canScrollVertically(-1) || this.mRecyclerView.canScrollHorizontally(-1)) {
            daVar.a(8192);
            daVar.q(true);
            daVar.h(67108864, true);
        }
        if (this.mRecyclerView.canScrollVertically(1) || this.mRecyclerView.canScrollHorizontally(1)) {
            daVar.a(4096);
            daVar.q(true);
            daVar.h(67108864, true);
        }
        daVar.l(ca.b(getRowCountForAccessibility(oVar, qrfVar), getColumnCountForAccessibility(oVar, qrfVar), getSelectionModeForAccessibility(oVar, qrfVar), isLayoutHierarchical(oVar, qrfVar)));
    }

    public void onInitializeAccessibilityNodeInfoForItem(View view, da daVar) {
        u childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt == null || childViewHolderInt.isRemoved()) {
            return;
        }
        b bVar = this.mChildHelper;
        if (bVar.c.contains(childViewHolderInt.itemView)) {
            return;
        }
        RecyclerView recyclerView = this.mRecyclerView;
        onInitializeAccessibilityNodeInfoForItem(recyclerView.mRecycler, recyclerView.mState, view, daVar);
    }

    @Nullable
    public View onInterceptFocusSearch(@NonNull View view, int i) {
        return null;
    }

    public void onItemsUpdated(@NonNull RecyclerView recyclerView, int i, int i2, @Nullable Object obj) {
        onItemsUpdated(recyclerView, i, i2);
    }

    public abstract void onLayoutChildren(o oVar, qrf qrfVar);

    public abstract void onLayoutCompleted(qrf qrfVar);

    public void onMeasure(@NonNull o oVar, @NonNull qrf qrfVar, int i, int i2) {
        this.mRecyclerView.defaultOnMeasure(i, i2);
    }

    @Deprecated
    public boolean onRequestChildFocus(@NonNull RecyclerView recyclerView, @NonNull View view, @Nullable View view2) {
        return isSmoothScrolling() || recyclerView.isComputingLayout();
    }

    public Parcelable onSaveInstanceState() {
        return null;
    }

    public void onSmoothScrollerStopped(s sVar) {
        if (this.mSmoothScroller == sVar) {
            this.mSmoothScroller = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0090 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean performAccessibilityAction(@NonNull o oVar, @NonNull qrf qrfVar, int i, @Nullable Bundle bundle) {
        int paddingTop;
        int paddingLeft;
        float f;
        if (this.mRecyclerView != null) {
            int height = getHeight();
            int width = getWidth();
            Rect rect = new Rect();
            if (this.mRecyclerView.getMatrix().isIdentity() && this.mRecyclerView.getGlobalVisibleRect(rect)) {
                height = rect.height();
                width = rect.width();
            }
            if (i != 4096) {
                if (i != 8192) {
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
                        f = bundle.getFloat("androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT", 1.0f);
                        if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            if (RecyclerView.sDebugAssertionsEnabled) {
                                throw new IllegalArgumentException("attempting to use ACTION_ARGUMENT_SCROLL_AMOUNT_FLOAT with a negative value (" + f + ")");
                            }
                        }
                    } else {
                        f = 1.0f;
                    }
                    if (Float.compare(f, Float.POSITIVE_INFINITY) != 0) {
                        if (Float.compare(1.0f, f) != 0 && Float.compare(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f) != 0) {
                            paddingLeft = (int) (paddingLeft * f);
                            paddingTop = (int) (paddingTop * f);
                        }
                        this.mRecyclerView.smoothScrollBy(paddingLeft, paddingTop, null, Integer.MIN_VALUE, true);
                        return true;
                    }
                    RecyclerView recyclerView = this.mRecyclerView;
                    l lVar = recyclerView.mAdapter;
                    if (lVar != null) {
                        if (i == 4096) {
                            recyclerView.smoothScrollToPosition(lVar.getItemCount() - 1);
                            return true;
                        }
                        if (i != 8192) {
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
                    if (Float.compare(f, Float.POSITIVE_INFINITY) != 0) {
                    }
                }
                paddingLeft = 0;
                if (paddingTop == 0) {
                }
                if (bundle != null) {
                }
                if (Float.compare(f, Float.POSITIVE_INFINITY) != 0) {
                }
            }
        }
        return false;
    }

    public boolean performAccessibilityActionForItem(@NonNull View view, int i, @Nullable Bundle bundle) {
        RecyclerView recyclerView = this.mRecyclerView;
        return performAccessibilityActionForItem(recyclerView.mRecycler, recyclerView.mState, view, i, bundle);
    }

    public void postOnAnimation(Runnable runnable) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            WeakHashMap weakHashMap = bsk.a;
            recyclerView.postOnAnimation(runnable);
        }
    }

    public void removeAllViews() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            this.mChildHelper.k(childCount);
        }
    }

    public void removeAndRecycleAllViews(@NonNull o oVar) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (!RecyclerView.getChildViewHolderInt(getChildAt(childCount)).shouldIgnore()) {
                removeAndRecycleViewAt(childCount, oVar);
            }
        }
    }

    public void removeAndRecycleScrapInt(o oVar) {
        ArrayList arrayList;
        int size = oVar.a.size();
        int i = size - 1;
        while (true) {
            arrayList = oVar.a;
            if (i < 0) {
                break;
            }
            View view = ((u) arrayList.get(i)).itemView;
            u childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.setIsRecyclable(false);
                if (childViewHolderInt.isTmpDetached()) {
                    this.mRecyclerView.removeDetachedView(view, false);
                }
                m mVar = this.mRecyclerView.mItemAnimator;
                if (mVar != null) {
                    mVar.d(childViewHolderInt);
                }
                childViewHolderInt.setIsRecyclable(true);
                u childViewHolderInt2 = RecyclerView.getChildViewHolderInt(view);
                childViewHolderInt2.mScrapContainer = null;
                childViewHolderInt2.mInChangeScrap = false;
                childViewHolderInt2.clearReturnedFromScrapFlag();
                oVar.k(childViewHolderInt2);
            }
            i--;
        }
        arrayList.clear();
        ArrayList arrayList2 = oVar.b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.mRecyclerView.invalidate();
        }
    }

    public void removeAndRecycleView(@NonNull View view, @NonNull o oVar) {
        removeView(view);
        oVar.j(view);
    }

    public void removeAndRecycleViewAt(int i, @NonNull o oVar) {
        View childAt = getChildAt(i);
        removeViewAt(i);
        oVar.j(childAt);
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

    public void removeView(View view) {
        b bVar = this.mChildHelper;
        d4a d4aVar = bVar.a;
        int i = bVar.d;
        if (i == 1) {
            a70.r("Cannot call removeView(At) within removeView(At)");
            return;
        }
        if (i == 2) {
            a70.r("Cannot call removeView(At) within removeViewIfHidden");
            return;
        }
        try {
            bVar.d = 1;
            bVar.e = view;
            int indexOfChild = ((RecyclerView) d4aVar.b).indexOfChild(view);
            if (indexOfChild < 0) {
                bVar.d = 0;
                bVar.e = null;
                return;
            }
            if (bVar.b.x(indexOfChild)) {
                bVar.l(view);
            }
            d4aVar.v(indexOfChild);
            bVar.d = 0;
            bVar.e = null;
        } catch (Throwable th) {
            bVar.d = 0;
            bVar.e = null;
            throw th;
        }
    }

    public void removeViewAt(int i) {
        if (getChildAt(i) != null) {
            this.mChildHelper.k(i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b3, code lost:
    
        if ((r5.bottom - r10) > r2) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean requestChildRectangleOnScreen(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z, boolean z2) {
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
        int[] iArr = {max, min2};
        int i4 = iArr[0];
        int i5 = iArr[1];
        if (z2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int paddingLeft2 = getPaddingLeft();
                int paddingTop2 = getPaddingTop();
                int width3 = getWidth() - getPaddingRight();
                int height3 = getHeight() - getPaddingBottom();
                Rect rect2 = this.mRecyclerView.mTempRect;
                getDecoratedBoundsWithMargins(focusedChild, rect2);
                if (rect2.left - i4 < width3) {
                    if (rect2.right - i4 > paddingLeft2) {
                        if (rect2.top - i5 < height3) {
                        }
                    }
                }
            }
            return false;
        }
        if (i4 != 0 || i5 != 0) {
            if (z) {
                recyclerView.scrollBy(i4, i5);
            } else {
                recyclerView.smoothScrollBy(i4, i5);
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

    public abstract int scrollHorizontallyBy(int i, o oVar, qrf qrfVar);

    public abstract void scrollToPosition(int i);

    public abstract int scrollVerticallyBy(int i, o oVar, qrf qrfVar);

    @Deprecated
    public void setAutoMeasureEnabled(boolean z) {
        this.mAutoMeasure = z;
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
                recyclerView.mRecycler.o();
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

    public void setMeasurementCacheEnabled(boolean z) {
        this.mMeasurementCacheEnabled = z;
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

    public boolean shouldMeasureChild(View view, int i, int i2, hrf hrfVar) {
        return (!view.isLayoutRequested() && this.mMeasurementCacheEnabled && b(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) hrfVar).width) && b(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) hrfVar).height)) ? false : true;
    }

    public boolean shouldMeasureTwice() {
        return false;
    }

    public boolean shouldReMeasureChild(View view, int i, int i2, hrf hrfVar) {
        return (this.mMeasurementCacheEnabled && b(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) hrfVar).width) && b(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) hrfVar).height)) ? false : true;
    }

    public abstract void smoothScrollToPosition(RecyclerView recyclerView, qrf qrfVar, int i);

    public void startSmoothScroll(s sVar) {
        s sVar2 = this.mSmoothScroller;
        if (sVar2 != null && sVar != sVar2 && sVar2.isRunning()) {
            this.mSmoothScroller.stop();
        }
        this.mSmoothScroller = sVar;
        sVar.start(this.mRecyclerView, this);
    }

    public void stopIgnoringView(@NonNull View view) {
        u childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        childViewHolderInt.stopIgnoring();
        childViewHolderInt.resetInternal();
        childViewHolderInt.addFlags(4);
    }

    public void stopSmoothScroller() {
        s sVar = this.mSmoothScroller;
        if (sVar != null) {
            sVar.stop();
        }
    }

    public boolean supportsPredictiveItemAnimations() {
        return false;
    }

    public void onItemsUpdated(@NonNull RecyclerView recyclerView, int i, int i2) {
    }

    public void addDisappearingView(View view, int i) {
        a(view, i, true);
    }

    public void addView(View view, int i) {
        a(view, i, false);
    }

    public boolean performAccessibilityActionForItem(@NonNull o oVar, @NonNull qrf qrfVar, @NonNull View view, int i, @Nullable Bundle bundle) {
        return false;
    }

    public boolean onRequestChildFocus(@NonNull RecyclerView recyclerView, @NonNull qrf qrfVar, @NonNull View view, @Nullable View view2) {
        return onRequestChildFocus(recyclerView, view, view2);
    }

    public void onAttachedToWindow(RecyclerView recyclerView) {
    }

    @Deprecated
    public void onDetachedFromWindow(RecyclerView recyclerView) {
    }

    public void onItemsChanged(@NonNull RecyclerView recyclerView) {
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    public void onScrollStateChanged(int i) {
    }

    public hrf generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new hrf(context, attributeSet);
    }

    public void onInitializeAccessibilityNodeInfoForItem(@NonNull o oVar, @NonNull qrf qrfVar, @NonNull View view, @NonNull da daVar) {
        daVar.m(dad.w(canScrollVertically() ? getPosition(view) : 0, 1, canScrollHorizontally() ? getPosition(view) : 0, 1, false));
    }

    public void collectInitialPrefetchPositions(int i, frf frfVar) {
    }

    public void onAdapterChanged(@Nullable l lVar, @Nullable l lVar2) {
    }

    public void setMeasuredDimension(int i, int i2) {
        this.mRecyclerView.setMeasuredDimension(i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r3 >= 0) goto L5;
     */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int getChildMeasureSpec(int i, int i2, int i3, boolean z) {
        int i4 = i - i2;
        int i5 = 0;
        int max = Math.max(0, i4);
        if (!z) {
            if (i3 < 0) {
                if (i3 == -1) {
                    i3 = max;
                } else {
                    if (i3 == -2) {
                        i5 = Integer.MIN_VALUE;
                        i3 = max;
                    }
                    i3 = 0;
                }
            }
            i5 = 1073741824;
        }
        return View.MeasureSpec.makeMeasureSpec(i3, i5);
    }

    public void attachView(@NonNull View view, int i) {
        attachView(view, i, (hrf) view.getLayoutParams());
    }

    public void attachView(@NonNull View view) {
        attachView(view, -1);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.mRecyclerView;
        onInitializeAccessibilityEvent(recyclerView.mRecycler, recyclerView.mState, accessibilityEvent);
    }

    public void onInitializeAccessibilityNodeInfo(da daVar) {
        RecyclerView recyclerView = this.mRecyclerView;
        onInitializeAccessibilityNodeInfo(recyclerView.mRecycler, recyclerView.mState, daVar);
    }

    public void onItemsAdded(@NonNull RecyclerView recyclerView, int i, int i2) {
    }

    public void onItemsRemoved(@NonNull RecyclerView recyclerView, int i, int i2) {
    }

    public void collectAdjacentPrefetchPositions(int i, int i2, qrf qrfVar, frf frfVar) {
    }

    public void onItemsMoved(@NonNull RecyclerView recyclerView, int i, int i2, int i3) {
    }

    public boolean requestChildRectangleOnScreen(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z) {
        return requestChildRectangleOnScreen(recyclerView, view, rect, z, false);
    }

    public boolean performAccessibilityAction(int i, Bundle bundle) {
        RecyclerView recyclerView = this.mRecyclerView;
        return performAccessibilityAction(recyclerView.mRecycler, recyclerView.mState, i, bundle);
    }
}
