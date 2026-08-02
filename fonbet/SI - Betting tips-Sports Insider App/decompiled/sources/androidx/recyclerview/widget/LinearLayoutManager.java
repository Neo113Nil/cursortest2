package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class LinearLayoutManager extends k1 implements x1 {
    static final boolean DEBUG = false;
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = Integer.MIN_VALUE;
    private static final float MAX_SCROLL_FACTOR = 0.33333334f;
    private static final String TAG = "LinearLayoutManager";
    public static final int VERTICAL = 1;
    final i0 mAnchorInfo;
    private int mInitialPrefetchItemCount;
    private boolean mLastStackFromEnd;
    private final j0 mLayoutChunkResult;
    private k0 mLayoutState;
    int mOrientation;
    q0 mOrientationHelper;
    SavedState mPendingSavedState;
    int mPendingScrollPosition;
    int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private int[] mReusableIntPair;
    private boolean mReverseLayout;
    boolean mShouldReverseLayout;
    private boolean mSmoothScrollbarEnabled;
    private boolean mStackFromEnd;

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new l0();

        /* renamed from: a, reason: collision with root package name */
        public int f2279a;

        /* renamed from: b, reason: collision with root package name */
        public int f2280b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f2281c;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i5) {
            parcel.writeInt(this.f2279a);
            parcel.writeInt(this.f2280b);
            parcel.writeInt(this.f2281c ? 1 : 0);
        }
    }

    public LinearLayoutManager(int i5, boolean z5) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new i0();
        this.mLayoutChunkResult = new j0();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        setOrientation(i5);
        setReverseLayout(z5);
    }

    @Override // androidx.recyclerview.widget.k1
    @SuppressLint({"UnknownNullness"})
    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    public void calculateExtraLayoutSpace(@NonNull z1 z1Var, @NonNull int[] iArr) {
        int i5;
        int extraLayoutSpace = getExtraLayoutSpace(z1Var);
        if (this.mLayoutState.f2459f == -1) {
            i5 = 0;
        } else {
            i5 = extraLayoutSpace;
            extraLayoutSpace = 0;
        }
        iArr[0] = extraLayoutSpace;
        iArr[1] = i5;
    }

    @Override // androidx.recyclerview.widget.k1
    public boolean canScrollHorizontally() {
        return this.mOrientation == 0;
    }

    @Override // androidx.recyclerview.widget.k1
    public boolean canScrollVertically() {
        return this.mOrientation == 1;
    }

    @Override // androidx.recyclerview.widget.k1
    @SuppressLint({"UnknownNullness"})
    public void collectAdjacentPrefetchPositions(int i5, int i10, z1 z1Var, i1 i1Var) {
        if (this.mOrientation != 0) {
            i5 = i10;
        }
        if (getChildCount() == 0 || i5 == 0) {
            return;
        }
        ensureLayoutState();
        m(i5 > 0 ? 1 : -1, Math.abs(i5), true, z1Var);
        collectPrefetchPositionsForLayoutState(z1Var, this.mLayoutState, i1Var);
    }

    @Override // androidx.recyclerview.widget.k1
    @SuppressLint({"UnknownNullness"})
    public void collectInitialPrefetchPositions(int i5, i1 i1Var) {
        boolean z5;
        int i10;
        SavedState savedState = this.mPendingSavedState;
        if (savedState == null || (i10 = savedState.f2279a) < 0) {
            l();
            z5 = this.mShouldReverseLayout;
            i10 = this.mPendingScrollPosition;
            if (i10 == -1) {
                i10 = z5 ? i5 - 1 : 0;
            }
        } else {
            z5 = savedState.f2281c;
        }
        int i11 = z5 ? -1 : 1;
        for (int i12 = 0; i12 < this.mInitialPrefetchItemCount && i10 >= 0 && i10 < i5; i12++) {
            ((d0) i1Var).a(i10, 0);
            i10 += i11;
        }
    }

    public void collectPrefetchPositionsForLayoutState(z1 z1Var, k0 k0Var, i1 i1Var) {
        int i5 = k0Var.f2457d;
        if (i5 < 0 || i5 >= z1Var.b()) {
            return;
        }
        ((d0) i1Var).a(i5, Math.max(0, k0Var.f2460g));
    }

    @Override // androidx.recyclerview.widget.k1
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollExtent(z1 z1Var) {
        return d(z1Var);
    }

    @Override // androidx.recyclerview.widget.k1
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollOffset(z1 z1Var) {
        return e(z1Var);
    }

    @Override // androidx.recyclerview.widget.k1
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollRange(z1 z1Var) {
        return f(z1Var);
    }

    @Override // androidx.recyclerview.widget.x1
    @SuppressLint({"UnknownNullness"})
    public PointF computeScrollVectorForPosition(int i5) {
        if (getChildCount() == 0) {
            return null;
        }
        int i10 = (i5 < getPosition(getChildAt(0))) != this.mShouldReverseLayout ? -1 : 1;
        return this.mOrientation == 0 ? new PointF(i10, 0.0f) : new PointF(0.0f, i10);
    }

    @Override // androidx.recyclerview.widget.k1
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollExtent(z1 z1Var) {
        return d(z1Var);
    }

    @Override // androidx.recyclerview.widget.k1
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollOffset(z1 z1Var) {
        return e(z1Var);
    }

    @Override // androidx.recyclerview.widget.k1
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollRange(z1 z1Var) {
        return f(z1Var);
    }

    public int convertFocusDirectionToLayoutDirection(int i5) {
        return i5 != 1 ? i5 != 2 ? i5 != 17 ? i5 != 33 ? i5 != 66 ? (i5 == 130 && this.mOrientation == 1) ? 1 : Integer.MIN_VALUE : this.mOrientation == 0 ? 1 : Integer.MIN_VALUE : this.mOrientation == 1 ? -1 : Integer.MIN_VALUE : this.mOrientation == 0 ? -1 : Integer.MIN_VALUE : (this.mOrientation != 1 && isLayoutRTL()) ? -1 : 1 : (this.mOrientation != 1 && isLayoutRTL()) ? 1 : -1;
    }

    public k0 createLayoutState() {
        k0 k0Var = new k0();
        k0Var.f2454a = true;
        k0Var.f2461h = 0;
        k0Var.f2462i = 0;
        k0Var.f2463k = null;
        return k0Var;
    }

    public final int d(z1 z1Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return d.d(z1Var, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    public final int e(z1 z1Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return d.e(z1Var, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    public void ensureLayoutState() {
        if (this.mLayoutState == null) {
            this.mLayoutState = createLayoutState();
        }
    }

    public final int f(z1 z1Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return d.f(z1Var, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    public int fill(s1 s1Var, k0 k0Var, z1 z1Var, boolean z5) {
        int i5;
        int i10 = k0Var.f2456c;
        int i11 = k0Var.f2460g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                k0Var.f2460g = i11 + i10;
            }
            j(s1Var, k0Var);
        }
        int i12 = k0Var.f2456c + k0Var.f2461h;
        j0 j0Var = this.mLayoutChunkResult;
        while (true) {
            if ((!k0Var.f2464l && i12 <= 0) || (i5 = k0Var.f2457d) < 0 || i5 >= z1Var.b()) {
                break;
            }
            j0Var.f2440a = 0;
            j0Var.f2441b = false;
            j0Var.f2442c = false;
            j0Var.f2443d = false;
            layoutChunk(s1Var, z1Var, k0Var, j0Var);
            if (!j0Var.f2441b) {
                int i13 = k0Var.f2455b;
                int i14 = j0Var.f2440a;
                k0Var.f2455b = (k0Var.f2459f * i14) + i13;
                if (!j0Var.f2442c || k0Var.f2463k != null || !z1Var.f2601g) {
                    k0Var.f2456c -= i14;
                    i12 -= i14;
                }
                int i15 = k0Var.f2460g;
                if (i15 != Integer.MIN_VALUE) {
                    int i16 = i15 + i14;
                    k0Var.f2460g = i16;
                    int i17 = k0Var.f2456c;
                    if (i17 < 0) {
                        k0Var.f2460g = i16 + i17;
                    }
                    j(s1Var, k0Var);
                }
                if (z5 && j0Var.f2443d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - k0Var.f2456c;
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(0, getChildCount(), true, false);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public View findFirstVisibleChildClosestToEnd(boolean z5, boolean z7) {
        return this.mShouldReverseLayout ? findOneVisibleChild(0, getChildCount(), z5, z7) : findOneVisibleChild(getChildCount() - 1, -1, z5, z7);
    }

    public View findFirstVisibleChildClosestToStart(boolean z5, boolean z7) {
        return this.mShouldReverseLayout ? findOneVisibleChild(getChildCount() - 1, -1, z5, z7) : findOneVisibleChild(0, getChildCount(), z5, z7);
    }

    public int findFirstVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(0, getChildCount(), false, true);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, true, false);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public int findLastVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, false, true);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public View findOnePartiallyOrCompletelyInvisibleChild(int i5, int i10) {
        int i11;
        int i12;
        ensureLayoutState();
        if (i10 <= i5 && i10 >= i5) {
            return getChildAt(i5);
        }
        if (this.mOrientationHelper.e(getChildAt(i5)) < this.mOrientationHelper.k()) {
            i11 = 16644;
            i12 = 16388;
        } else {
            i11 = 4161;
            i12 = 4097;
        }
        return this.mOrientation == 0 ? this.mHorizontalBoundCheck.a(i5, i10, i11, i12) : this.mVerticalBoundCheck.a(i5, i10, i11, i12);
    }

    public View findOneVisibleChild(int i5, int i10, boolean z5, boolean z7) {
        ensureLayoutState();
        int i11 = z5 ? 24579 : 320;
        int i12 = z7 ? 320 : 0;
        return this.mOrientation == 0 ? this.mHorizontalBoundCheck.a(i5, i10, i11, i12) : this.mVerticalBoundCheck.a(i5, i10, i11, i12);
    }

    public View findReferenceChild(s1 s1Var, z1 z1Var, boolean z5, boolean z7) {
        int i5;
        int i10;
        int i11;
        ensureLayoutState();
        int childCount = getChildCount();
        if (z7) {
            i10 = getChildCount() - 1;
            i5 = -1;
            i11 = -1;
        } else {
            i5 = childCount;
            i10 = 0;
            i11 = 1;
        }
        int b10 = z1Var.b();
        int k6 = this.mOrientationHelper.k();
        int g10 = this.mOrientationHelper.g();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i10 != i5) {
            View childAt = getChildAt(i10);
            int position = getPosition(childAt);
            int e7 = this.mOrientationHelper.e(childAt);
            int b11 = this.mOrientationHelper.b(childAt);
            if (position >= 0 && position < b10) {
                if (!((l1) childAt.getLayoutParams()).f2468a.isRemoved()) {
                    boolean z10 = b11 <= k6 && e7 < k6;
                    boolean z11 = e7 >= g10 && b11 > g10;
                    if (!z10 && !z11) {
                        return childAt;
                    }
                    if (z5) {
                        if (!z11) {
                            if (view != null) {
                            }
                            view = childAt;
                        }
                        view2 = childAt;
                    } else {
                        if (!z10) {
                            if (view != null) {
                            }
                            view = childAt;
                        }
                        view2 = childAt;
                    }
                } else if (view3 == null) {
                    view3 = childAt;
                }
            }
            i10 += i11;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    @Override // androidx.recyclerview.widget.k1
    @SuppressLint({"UnknownNullness"})
    public View findViewByPosition(int i5) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        int position = i5 - getPosition(getChildAt(0));
        if (position >= 0 && position < childCount) {
            View childAt = getChildAt(position);
            if (getPosition(childAt) == i5) {
                return childAt;
            }
        }
        return super.findViewByPosition(i5);
    }

    public final int g(int i5, s1 s1Var, z1 z1Var, boolean z5) {
        int g10;
        int g11 = this.mOrientationHelper.g() - i5;
        if (g11 <= 0) {
            return 0;
        }
        int i10 = -scrollBy(-g11, s1Var, z1Var);
        int i11 = i5 + i10;
        if (!z5 || (g10 = this.mOrientationHelper.g() - i11) <= 0) {
            return i10;
        }
        this.mOrientationHelper.o(g10);
        return g10 + i10;
    }

    @Override // androidx.recyclerview.widget.k1
    @SuppressLint({"UnknownNullness"})
    public l1 generateDefaultLayoutParams() {
        return new l1(-2, -2);
    }

    public final View getChildClosestToEnd() {
        return getChildAt(this.mShouldReverseLayout ? 0 : getChildCount() - 1);
    }

    public final View getChildClosestToStart() {
        return getChildAt(this.mShouldReverseLayout ? getChildCount() - 1 : 0);
    }

    @Deprecated
    public int getExtraLayoutSpace(z1 z1Var) {
        if (z1Var.f2595a != -1) {
            return this.mOrientationHelper.l();
        }
        return 0;
    }

    public int getInitialPrefetchItemCount() {
        return this.mInitialPrefetchItemCount;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.mRecycleChildrenOnDetach;
    }

    public boolean getReverseLayout() {
        return this.mReverseLayout;
    }

    public boolean getStackFromEnd() {
        return this.mStackFromEnd;
    }

    public final int h(int i5, s1 s1Var, z1 z1Var, boolean z5) {
        int k6;
        int k9 = i5 - this.mOrientationHelper.k();
        if (k9 <= 0) {
            return 0;
        }
        int i10 = -scrollBy(k9, s1Var, z1Var);
        int i11 = i5 + i10;
        if (!z5 || (k6 = i11 - this.mOrientationHelper.k()) <= 0) {
            return i10;
        }
        this.mOrientationHelper.o(-k6);
        return i10 - k6;
    }

    public final void i() {
        Log.d(TAG, "internal representation of views on the screen");
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            Log.d(TAG, "item " + getPosition(childAt) + ", coord:" + this.mOrientationHelper.e(childAt));
        }
        Log.d(TAG, "==============");
    }

    @Override // androidx.recyclerview.widget.k1
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    public boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.k1
    public boolean isLayoutReversed() {
        return this.mReverseLayout;
    }

    public boolean isSmoothScrollbarEnabled() {
        return this.mSmoothScrollbarEnabled;
    }

    public final void j(s1 s1Var, k0 k0Var) {
        if (!k0Var.f2454a || k0Var.f2464l) {
            return;
        }
        int i5 = k0Var.f2460g;
        int i10 = k0Var.f2462i;
        if (k0Var.f2459f == -1) {
            int childCount = getChildCount();
            if (i5 < 0) {
                return;
            }
            int f6 = (this.mOrientationHelper.f() - i5) + i10;
            if (this.mShouldReverseLayout) {
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = getChildAt(i11);
                    if (this.mOrientationHelper.e(childAt) < f6 || this.mOrientationHelper.n(childAt) < f6) {
                        k(s1Var, 0, i11);
                        return;
                    }
                }
                return;
            }
            int i12 = childCount - 1;
            for (int i13 = i12; i13 >= 0; i13--) {
                View childAt2 = getChildAt(i13);
                if (this.mOrientationHelper.e(childAt2) < f6 || this.mOrientationHelper.n(childAt2) < f6) {
                    k(s1Var, i12, i13);
                    return;
                }
            }
            return;
        }
        if (i5 < 0) {
            return;
        }
        int i14 = i5 - i10;
        int childCount2 = getChildCount();
        if (!this.mShouldReverseLayout) {
            for (int i15 = 0; i15 < childCount2; i15++) {
                View childAt3 = getChildAt(i15);
                if (this.mOrientationHelper.b(childAt3) > i14 || this.mOrientationHelper.m(childAt3) > i14) {
                    k(s1Var, 0, i15);
                    return;
                }
            }
            return;
        }
        int i16 = childCount2 - 1;
        for (int i17 = i16; i17 >= 0; i17--) {
            View childAt4 = getChildAt(i17);
            if (this.mOrientationHelper.b(childAt4) > i14 || this.mOrientationHelper.m(childAt4) > i14) {
                k(s1Var, i16, i17);
                return;
            }
        }
    }

    public final void k(s1 s1Var, int i5, int i10) {
        if (i5 == i10) {
            return;
        }
        if (i10 <= i5) {
            while (i5 > i10) {
                removeAndRecycleViewAt(i5, s1Var);
                i5--;
            }
        } else {
            for (int i11 = i10 - 1; i11 >= i5; i11--) {
                removeAndRecycleViewAt(i11, s1Var);
            }
        }
    }

    public final void l() {
        if (this.mOrientation == 1 || !isLayoutRTL()) {
            this.mShouldReverseLayout = this.mReverseLayout;
        } else {
            this.mShouldReverseLayout = !this.mReverseLayout;
        }
    }

    public void layoutChunk(s1 s1Var, z1 z1Var, k0 k0Var, j0 j0Var) {
        int i5;
        int i10;
        int i11;
        int i12;
        int paddingLeft;
        int d10;
        int i13;
        int i14;
        View b10 = k0Var.b(s1Var);
        if (b10 == null) {
            j0Var.f2441b = true;
            return;
        }
        l1 l1Var = (l1) b10.getLayoutParams();
        if (k0Var.f2463k == null) {
            if (this.mShouldReverseLayout == (k0Var.f2459f == -1)) {
                addView(b10);
            } else {
                addView(b10, 0);
            }
        } else {
            if (this.mShouldReverseLayout == (k0Var.f2459f == -1)) {
                addDisappearingView(b10);
            } else {
                addDisappearingView(b10, 0);
            }
        }
        measureChildWithMargins(b10, 0, 0);
        j0Var.f2440a = this.mOrientationHelper.c(b10);
        if (this.mOrientation == 1) {
            if (isLayoutRTL()) {
                d10 = getWidth() - getPaddingRight();
                paddingLeft = d10 - this.mOrientationHelper.d(b10);
            } else {
                paddingLeft = getPaddingLeft();
                d10 = this.mOrientationHelper.d(b10) + paddingLeft;
            }
            if (k0Var.f2459f == -1) {
                i14 = k0Var.f2455b;
                i13 = i14 - j0Var.f2440a;
            } else {
                i13 = k0Var.f2455b;
                i14 = j0Var.f2440a + i13;
            }
            int i15 = paddingLeft;
            i12 = i13;
            i11 = i15;
            i10 = i14;
            i5 = d10;
        } else {
            int paddingTop = getPaddingTop();
            int d11 = this.mOrientationHelper.d(b10) + paddingTop;
            if (k0Var.f2459f == -1) {
                int i16 = k0Var.f2455b;
                i11 = i16 - j0Var.f2440a;
                i5 = i16;
                i10 = d11;
            } else {
                int i17 = k0Var.f2455b;
                i5 = j0Var.f2440a + i17;
                i10 = d11;
                i11 = i17;
            }
            i12 = paddingTop;
        }
        layoutDecoratedWithMargins(b10, i11, i12, i5, i10);
        if (l1Var.f2468a.isRemoved() || l1Var.f2468a.isUpdated()) {
            j0Var.f2442c = true;
        }
        j0Var.f2443d = b10.hasFocusable();
    }

    public final void m(int i5, int i10, boolean z5, z1 z1Var) {
        int k6;
        this.mLayoutState.f2464l = resolveIsInfinite();
        this.mLayoutState.f2459f = i5;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(z1Var, iArr);
        int max = Math.max(0, this.mReusableIntPair[0]);
        int max2 = Math.max(0, this.mReusableIntPair[1]);
        boolean z7 = i5 == 1;
        k0 k0Var = this.mLayoutState;
        int i11 = z7 ? max2 : max;
        k0Var.f2461h = i11;
        if (!z7) {
            max = max2;
        }
        k0Var.f2462i = max;
        if (z7) {
            k0Var.f2461h = this.mOrientationHelper.h() + i11;
            View childClosestToEnd = getChildClosestToEnd();
            k0 k0Var2 = this.mLayoutState;
            k0Var2.f2458e = this.mShouldReverseLayout ? -1 : 1;
            int position = getPosition(childClosestToEnd);
            k0 k0Var3 = this.mLayoutState;
            k0Var2.f2457d = position + k0Var3.f2458e;
            k0Var3.f2455b = this.mOrientationHelper.b(childClosestToEnd);
            k6 = this.mOrientationHelper.b(childClosestToEnd) - this.mOrientationHelper.g();
        } else {
            View childClosestToStart = getChildClosestToStart();
            k0 k0Var4 = this.mLayoutState;
            k0Var4.f2461h = this.mOrientationHelper.k() + k0Var4.f2461h;
            k0 k0Var5 = this.mLayoutState;
            k0Var5.f2458e = this.mShouldReverseLayout ? 1 : -1;
            int position2 = getPosition(childClosestToStart);
            k0 k0Var6 = this.mLayoutState;
            k0Var5.f2457d = position2 + k0Var6.f2458e;
            k0Var6.f2455b = this.mOrientationHelper.e(childClosestToStart);
            k6 = (-this.mOrientationHelper.e(childClosestToStart)) + this.mOrientationHelper.k();
        }
        k0 k0Var7 = this.mLayoutState;
        k0Var7.f2456c = i10;
        if (z5) {
            k0Var7.f2456c = i10 - k6;
        }
        k0Var7.f2460g = k6;
    }

    public final void n(int i5, int i10) {
        this.mLayoutState.f2456c = this.mOrientationHelper.g() - i10;
        k0 k0Var = this.mLayoutState;
        k0Var.f2458e = this.mShouldReverseLayout ? -1 : 1;
        k0Var.f2457d = i5;
        k0Var.f2459f = 1;
        k0Var.f2455b = i10;
        k0Var.f2460g = Integer.MIN_VALUE;
    }

    public final void o(int i5, int i10) {
        this.mLayoutState.f2456c = i10 - this.mOrientationHelper.k();
        k0 k0Var = this.mLayoutState;
        k0Var.f2457d = i5;
        k0Var.f2458e = this.mShouldReverseLayout ? 1 : -1;
        k0Var.f2459f = -1;
        k0Var.f2455b = i10;
        k0Var.f2460g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.k1
    @SuppressLint({"UnknownNullness"})
    public void onDetachedFromWindow(RecyclerView recyclerView, s1 s1Var) {
        onDetachedFromWindow(recyclerView);
        if (this.mRecycleChildrenOnDetach) {
            removeAndRecycleAllViews(s1Var);
            s1Var.f2546a.clear();
            s1Var.h();
        }
    }

    @Override // androidx.recyclerview.widget.k1
    @SuppressLint({"UnknownNullness"})
    public View onFocusSearchFailed(View view, int i5, s1 s1Var, z1 z1Var) {
        int convertFocusDirectionToLayoutDirection;
        l();
        if (getChildCount() != 0 && (convertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i5)) != Integer.MIN_VALUE) {
            ensureLayoutState();
            m(convertFocusDirectionToLayoutDirection, (int) (this.mOrientationHelper.l() * MAX_SCROLL_FACTOR), false, z1Var);
            k0 k0Var = this.mLayoutState;
            k0Var.f2460g = Integer.MIN_VALUE;
            k0Var.f2454a = false;
            fill(s1Var, k0Var, z1Var, true);
            View findOnePartiallyOrCompletelyInvisibleChild = convertFocusDirectionToLayoutDirection == -1 ? this.mShouldReverseLayout ? findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1) : findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount()) : this.mShouldReverseLayout ? findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount()) : findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1);
            View childClosestToStart = convertFocusDirectionToLayoutDirection == -1 ? getChildClosestToStart() : getChildClosestToEnd();
            if (!childClosestToStart.hasFocusable()) {
                return findOnePartiallyOrCompletelyInvisibleChild;
            }
            if (findOnePartiallyOrCompletelyInvisibleChild != null) {
                return childClosestToStart;
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.k1
    @SuppressLint({"UnknownNullness"})
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(findFirstVisibleItemPosition());
            accessibilityEvent.setToIndex(findLastVisibleItemPosition());
        }
    }

    @Override // androidx.recyclerview.widget.k1
    public void onInitializeAccessibilityNodeInfo(@NonNull s1 s1Var, @NonNull z1 z1Var, @NonNull q0.c cVar) {
        super.onInitializeAccessibilityNodeInfo(s1Var, z1Var, cVar);
        x0 x0Var = this.mRecyclerView.mAdapter;
        if (x0Var == null || x0Var.getItemCount() <= 0) {
            return;
        }
        cVar.b(q0.b.f21905m);
    }

    @Override // androidx.recyclerview.widget.k1
    @SuppressLint({"UnknownNullness"})
    public void onLayoutChildren(s1 s1Var, z1 z1Var) {
        View findReferenceChild;
        int i5;
        int e7;
        int i10;
        int i11;
        int i12;
        int i13;
        int g10;
        int i14;
        View findViewByPosition;
        int e9;
        int i15;
        int i16;
        int i17 = -1;
        if (!(this.mPendingSavedState == null && this.mPendingScrollPosition == -1) && z1Var.b() == 0) {
            removeAndRecycleAllViews(s1Var);
            return;
        }
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null && (i16 = savedState.f2279a) >= 0) {
            this.mPendingScrollPosition = i16;
        }
        ensureLayoutState();
        this.mLayoutState.f2454a = false;
        l();
        View focusedChild = getFocusedChild();
        i0 i0Var = this.mAnchorInfo;
        if (!i0Var.f2429e || this.mPendingScrollPosition != -1 || this.mPendingSavedState != null) {
            i0Var.d();
            i0 i0Var2 = this.mAnchorInfo;
            i0Var2.f2428d = this.mShouldReverseLayout ^ this.mStackFromEnd;
            if (!z1Var.f2601g && (i5 = this.mPendingScrollPosition) != -1) {
                if (i5 < 0 || i5 >= z1Var.b()) {
                    this.mPendingScrollPosition = -1;
                    this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
                } else {
                    int i18 = this.mPendingScrollPosition;
                    i0Var2.f2426b = i18;
                    SavedState savedState2 = this.mPendingSavedState;
                    if (savedState2 != null && savedState2.f2279a >= 0) {
                        boolean z5 = savedState2.f2281c;
                        i0Var2.f2428d = z5;
                        if (z5) {
                            i0Var2.f2427c = this.mOrientationHelper.g() - this.mPendingSavedState.f2280b;
                        } else {
                            i0Var2.f2427c = this.mOrientationHelper.k() + this.mPendingSavedState.f2280b;
                        }
                    } else if (this.mPendingScrollPositionOffset == Integer.MIN_VALUE) {
                        View findViewByPosition2 = findViewByPosition(i18);
                        if (findViewByPosition2 == null) {
                            if (getChildCount() > 0) {
                                i0Var2.f2428d = (this.mPendingScrollPosition < getPosition(getChildAt(0))) == this.mShouldReverseLayout;
                            }
                            i0Var2.a();
                        } else if (this.mOrientationHelper.c(findViewByPosition2) > this.mOrientationHelper.l()) {
                            i0Var2.a();
                        } else if (this.mOrientationHelper.e(findViewByPosition2) - this.mOrientationHelper.k() < 0) {
                            i0Var2.f2427c = this.mOrientationHelper.k();
                            i0Var2.f2428d = false;
                        } else if (this.mOrientationHelper.g() - this.mOrientationHelper.b(findViewByPosition2) < 0) {
                            i0Var2.f2427c = this.mOrientationHelper.g();
                            i0Var2.f2428d = true;
                        } else {
                            if (i0Var2.f2428d) {
                                int b10 = this.mOrientationHelper.b(findViewByPosition2);
                                q0 q0Var = this.mOrientationHelper;
                                e7 = (Integer.MIN_VALUE == q0Var.f2515b ? 0 : q0Var.l() - q0Var.f2515b) + b10;
                            } else {
                                e7 = this.mOrientationHelper.e(findViewByPosition2);
                            }
                            i0Var2.f2427c = e7;
                        }
                    } else {
                        boolean z7 = this.mShouldReverseLayout;
                        i0Var2.f2428d = z7;
                        if (z7) {
                            i0Var2.f2427c = this.mOrientationHelper.g() - this.mPendingScrollPositionOffset;
                        } else {
                            i0Var2.f2427c = this.mOrientationHelper.k() + this.mPendingScrollPositionOffset;
                        }
                    }
                    this.mAnchorInfo.f2429e = true;
                }
            }
            if (getChildCount() != 0) {
                View focusedChild2 = getFocusedChild();
                if (focusedChild2 != null) {
                    l1 l1Var = (l1) focusedChild2.getLayoutParams();
                    if (!l1Var.f2468a.isRemoved() && l1Var.f2468a.getLayoutPosition() >= 0 && l1Var.f2468a.getLayoutPosition() < z1Var.b()) {
                        i0Var2.c(getPosition(focusedChild2), focusedChild2);
                        this.mAnchorInfo.f2429e = true;
                    }
                }
                boolean z10 = this.mLastStackFromEnd;
                boolean z11 = this.mStackFromEnd;
                if (z10 == z11 && (findReferenceChild = findReferenceChild(s1Var, z1Var, i0Var2.f2428d, z11)) != null) {
                    i0Var2.b(getPosition(findReferenceChild), findReferenceChild);
                    if (!z1Var.f2601g && supportsPredictiveItemAnimations()) {
                        int e10 = this.mOrientationHelper.e(findReferenceChild);
                        int b11 = this.mOrientationHelper.b(findReferenceChild);
                        int k6 = this.mOrientationHelper.k();
                        int g11 = this.mOrientationHelper.g();
                        boolean z12 = b11 <= k6 && e10 < k6;
                        boolean z13 = e10 >= g11 && b11 > g11;
                        if (z12 || z13) {
                            if (i0Var2.f2428d) {
                                k6 = g11;
                            }
                            i0Var2.f2427c = k6;
                        }
                    }
                    this.mAnchorInfo.f2429e = true;
                }
            }
            i0Var2.a();
            i0Var2.f2426b = this.mStackFromEnd ? z1Var.b() - 1 : 0;
            this.mAnchorInfo.f2429e = true;
        } else if (focusedChild != null && (this.mOrientationHelper.e(focusedChild) >= this.mOrientationHelper.g() || this.mOrientationHelper.b(focusedChild) <= this.mOrientationHelper.k())) {
            this.mAnchorInfo.c(getPosition(focusedChild), focusedChild);
        }
        k0 k0Var = this.mLayoutState;
        k0Var.f2459f = k0Var.j >= 0 ? 1 : -1;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(z1Var, iArr);
        int k9 = this.mOrientationHelper.k() + Math.max(0, this.mReusableIntPair[0]);
        int h10 = this.mOrientationHelper.h() + Math.max(0, this.mReusableIntPair[1]);
        if (z1Var.f2601g && (i14 = this.mPendingScrollPosition) != -1 && this.mPendingScrollPositionOffset != Integer.MIN_VALUE && (findViewByPosition = findViewByPosition(i14)) != null) {
            if (this.mShouldReverseLayout) {
                i15 = this.mOrientationHelper.g() - this.mOrientationHelper.b(findViewByPosition);
                e9 = this.mPendingScrollPositionOffset;
            } else {
                e9 = this.mOrientationHelper.e(findViewByPosition) - this.mOrientationHelper.k();
                i15 = this.mPendingScrollPositionOffset;
            }
            int i19 = i15 - e9;
            if (i19 > 0) {
                k9 += i19;
            } else {
                h10 -= i19;
            }
        }
        i0 i0Var3 = this.mAnchorInfo;
        if (!i0Var3.f2428d ? !this.mShouldReverseLayout : this.mShouldReverseLayout) {
            i17 = 1;
        }
        onAnchorReady(s1Var, z1Var, i0Var3, i17);
        detachAndScrapAttachedViews(s1Var);
        this.mLayoutState.f2464l = resolveIsInfinite();
        this.mLayoutState.getClass();
        this.mLayoutState.f2462i = 0;
        i0 i0Var4 = this.mAnchorInfo;
        if (i0Var4.f2428d) {
            o(i0Var4.f2426b, i0Var4.f2427c);
            k0 k0Var2 = this.mLayoutState;
            k0Var2.f2461h = k9;
            fill(s1Var, k0Var2, z1Var, false);
            k0 k0Var3 = this.mLayoutState;
            i11 = k0Var3.f2455b;
            int i20 = k0Var3.f2457d;
            int i21 = k0Var3.f2456c;
            if (i21 > 0) {
                h10 += i21;
            }
            i0 i0Var5 = this.mAnchorInfo;
            n(i0Var5.f2426b, i0Var5.f2427c);
            k0 k0Var4 = this.mLayoutState;
            k0Var4.f2461h = h10;
            k0Var4.f2457d += k0Var4.f2458e;
            fill(s1Var, k0Var4, z1Var, false);
            k0 k0Var5 = this.mLayoutState;
            i10 = k0Var5.f2455b;
            int i22 = k0Var5.f2456c;
            if (i22 > 0) {
                o(i20, i11);
                k0 k0Var6 = this.mLayoutState;
                k0Var6.f2461h = i22;
                fill(s1Var, k0Var6, z1Var, false);
                i11 = this.mLayoutState.f2455b;
            }
        } else {
            n(i0Var4.f2426b, i0Var4.f2427c);
            k0 k0Var7 = this.mLayoutState;
            k0Var7.f2461h = h10;
            fill(s1Var, k0Var7, z1Var, false);
            k0 k0Var8 = this.mLayoutState;
            i10 = k0Var8.f2455b;
            int i23 = k0Var8.f2457d;
            int i24 = k0Var8.f2456c;
            if (i24 > 0) {
                k9 += i24;
            }
            i0 i0Var6 = this.mAnchorInfo;
            o(i0Var6.f2426b, i0Var6.f2427c);
            k0 k0Var9 = this.mLayoutState;
            k0Var9.f2461h = k9;
            k0Var9.f2457d += k0Var9.f2458e;
            fill(s1Var, k0Var9, z1Var, false);
            k0 k0Var10 = this.mLayoutState;
            int i25 = k0Var10.f2455b;
            int i26 = k0Var10.f2456c;
            if (i26 > 0) {
                n(i23, i10);
                k0 k0Var11 = this.mLayoutState;
                k0Var11.f2461h = i26;
                fill(s1Var, k0Var11, z1Var, false);
                i10 = this.mLayoutState.f2455b;
            }
            i11 = i25;
        }
        if (getChildCount() > 0) {
            if (this.mShouldReverseLayout ^ this.mStackFromEnd) {
                int g12 = g(i10, s1Var, z1Var, true);
                i12 = i11 + g12;
                i13 = i10 + g12;
                g10 = h(i12, s1Var, z1Var, false);
            } else {
                int h11 = h(i11, s1Var, z1Var, true);
                i12 = i11 + h11;
                i13 = i10 + h11;
                g10 = g(i13, s1Var, z1Var, false);
            }
            i11 = i12 + g10;
            i10 = i13 + g10;
        }
        if (z1Var.f2604k && getChildCount() != 0 && !z1Var.f2601g && supportsPredictiveItemAnimations()) {
            List list = s1Var.f2549d;
            int size = list.size();
            int position = getPosition(getChildAt(0));
            int i27 = 0;
            int i28 = 0;
            for (int i29 = 0; i29 < size; i29++) {
                d2 d2Var = (d2) list.get(i29);
                if (!d2Var.isRemoved()) {
                    if ((d2Var.getLayoutPosition() < position) != this.mShouldReverseLayout) {
                        i27 += this.mOrientationHelper.c(d2Var.itemView);
                    } else {
                        i28 += this.mOrientationHelper.c(d2Var.itemView);
                    }
                }
            }
            this.mLayoutState.f2463k = list;
            if (i27 > 0) {
                o(getPosition(getChildClosestToStart()), i11);
                k0 k0Var12 = this.mLayoutState;
                k0Var12.f2461h = i27;
                k0Var12.f2456c = 0;
                k0Var12.a(null);
                fill(s1Var, this.mLayoutState, z1Var, false);
            }
            if (i28 > 0) {
                n(getPosition(getChildClosestToEnd()), i10);
                k0 k0Var13 = this.mLayoutState;
                k0Var13.f2461h = i28;
                k0Var13.f2456c = 0;
                k0Var13.a(null);
                fill(s1Var, this.mLayoutState, z1Var, false);
            }
            this.mLayoutState.f2463k = null;
        }
        if (z1Var.f2601g) {
            this.mAnchorInfo.d();
        } else {
            q0 q0Var2 = this.mOrientationHelper;
            q0Var2.f2515b = q0Var2.l();
        }
        this.mLastStackFromEnd = this.mStackFromEnd;
    }

    @Override // androidx.recyclerview.widget.k1
    @SuppressLint({"UnknownNullness"})
    public void onLayoutCompleted(z1 z1Var) {
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mAnchorInfo.d();
    }

    @Override // androidx.recyclerview.widget.k1
    @SuppressLint({"UnknownNullness"})
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.mPendingSavedState = savedState;
            if (this.mPendingScrollPosition != -1) {
                savedState.f2279a = -1;
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.k1
    @SuppressLint({"UnknownNullness"})
    public Parcelable onSaveInstanceState() {
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            SavedState savedState2 = new SavedState();
            savedState2.f2279a = savedState.f2279a;
            savedState2.f2280b = savedState.f2280b;
            savedState2.f2281c = savedState.f2281c;
            return savedState2;
        }
        SavedState savedState3 = new SavedState();
        if (getChildCount() <= 0) {
            savedState3.f2279a = -1;
            return savedState3;
        }
        ensureLayoutState();
        boolean z5 = this.mLastStackFromEnd ^ this.mShouldReverseLayout;
        savedState3.f2281c = z5;
        if (z5) {
            View childClosestToEnd = getChildClosestToEnd();
            savedState3.f2280b = this.mOrientationHelper.g() - this.mOrientationHelper.b(childClosestToEnd);
            savedState3.f2279a = getPosition(childClosestToEnd);
            return savedState3;
        }
        View childClosestToStart = getChildClosestToStart();
        savedState3.f2279a = getPosition(childClosestToStart);
        savedState3.f2280b = this.mOrientationHelper.e(childClosestToStart) - this.mOrientationHelper.k();
        return savedState3;
    }

    @Override // androidx.recyclerview.widget.k1
    public boolean performAccessibilityAction(int i5, Bundle bundle) {
        int min;
        if (super.performAccessibilityAction(i5, bundle)) {
            return true;
        }
        if (i5 == 16908343 && bundle != null) {
            if (this.mOrientation == 1) {
                int i10 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
                if (i10 < 0) {
                    return false;
                }
                RecyclerView recyclerView = this.mRecyclerView;
                min = Math.min(i10, getRowCountForAccessibility(recyclerView.mRecycler, recyclerView.mState) - 1);
            } else {
                int i11 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
                if (i11 < 0) {
                    return false;
                }
                RecyclerView recyclerView2 = this.mRecyclerView;
                min = Math.min(i11, getColumnCountForAccessibility(recyclerView2.mRecycler, recyclerView2.mState) - 1);
            }
            if (min >= 0) {
                scrollToPositionWithOffset(min, 0);
                return true;
            }
        }
        return false;
    }

    public void prepareForDrop(@NonNull View view, @NonNull View view2, int i5, int i10) {
        assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        ensureLayoutState();
        l();
        int position = getPosition(view);
        int position2 = getPosition(view2);
        char c2 = position < position2 ? (char) 1 : (char) 65535;
        if (this.mShouldReverseLayout) {
            if (c2 == 1) {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.g() - (this.mOrientationHelper.c(view) + this.mOrientationHelper.e(view2)));
                return;
            } else {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.g() - this.mOrientationHelper.b(view2));
                return;
            }
        }
        if (c2 == 65535) {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.e(view2));
        } else {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.b(view2) - this.mOrientationHelper.c(view));
        }
    }

    public boolean resolveIsInfinite() {
        return this.mOrientationHelper.i() == 0 && this.mOrientationHelper.f() == 0;
    }

    public int scrollBy(int i5, s1 s1Var, z1 z1Var) {
        if (getChildCount() == 0 || i5 == 0) {
            return 0;
        }
        ensureLayoutState();
        this.mLayoutState.f2454a = true;
        int i10 = i5 > 0 ? 1 : -1;
        int abs = Math.abs(i5);
        m(i10, abs, true, z1Var);
        k0 k0Var = this.mLayoutState;
        int fill = fill(s1Var, k0Var, z1Var, false) + k0Var.f2460g;
        if (fill < 0) {
            return 0;
        }
        if (abs > fill) {
            i5 = i10 * fill;
        }
        this.mOrientationHelper.o(-i5);
        this.mLayoutState.j = i5;
        return i5;
    }

    @Override // androidx.recyclerview.widget.k1
    @SuppressLint({"UnknownNullness"})
    public int scrollHorizontallyBy(int i5, s1 s1Var, z1 z1Var) {
        if (this.mOrientation == 1) {
            return 0;
        }
        return scrollBy(i5, s1Var, z1Var);
    }

    @Override // androidx.recyclerview.widget.k1
    public void scrollToPosition(int i5) {
        this.mPendingScrollPosition = i5;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.f2279a = -1;
        }
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i5, int i10) {
        this.mPendingScrollPosition = i5;
        this.mPendingScrollPositionOffset = i10;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.f2279a = -1;
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.k1
    @SuppressLint({"UnknownNullness"})
    public int scrollVerticallyBy(int i5, s1 s1Var, z1 z1Var) {
        if (this.mOrientation == 0) {
            return 0;
        }
        return scrollBy(i5, s1Var, z1Var);
    }

    public void setInitialPrefetchItemCount(int i5) {
        this.mInitialPrefetchItemCount = i5;
    }

    public void setOrientation(int i5) {
        if (i5 != 0 && i5 != 1) {
            throw new IllegalArgumentException(androidx.appcompat.widget.c1.i(i5, "invalid orientation:"));
        }
        assertNotInLayoutOrScroll(null);
        if (i5 != this.mOrientation || this.mOrientationHelper == null) {
            q0 a7 = q0.a(this, i5);
            this.mOrientationHelper = a7;
            this.mAnchorInfo.f2425a = a7;
            this.mOrientation = i5;
            requestLayout();
        }
    }

    public void setRecycleChildrenOnDetach(boolean z5) {
        this.mRecycleChildrenOnDetach = z5;
    }

    public void setReverseLayout(boolean z5) {
        assertNotInLayoutOrScroll(null);
        if (z5 == this.mReverseLayout) {
            return;
        }
        this.mReverseLayout = z5;
        requestLayout();
    }

    public void setSmoothScrollbarEnabled(boolean z5) {
        this.mSmoothScrollbarEnabled = z5;
    }

    public void setStackFromEnd(boolean z5) {
        assertNotInLayoutOrScroll(null);
        if (this.mStackFromEnd == z5) {
            return;
        }
        this.mStackFromEnd = z5;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.k1
    public boolean shouldMeasureTwice() {
        return (getHeightMode() == 1073741824 || getWidthMode() == 1073741824 || !hasFlexibleChildInBothOrientations()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.k1
    public void smoothScrollToPosition(RecyclerView recyclerView, z1 z1Var, int i5) {
        m0 m0Var = new m0(recyclerView.getContext());
        m0Var.setTargetPosition(i5);
        startSmoothScroll(m0Var);
    }

    @Override // androidx.recyclerview.widget.k1
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && this.mLastStackFromEnd == this.mStackFromEnd;
    }

    public void validateChildOrder() {
        Log.d(TAG, "validating child count " + getChildCount());
        if (getChildCount() < 1) {
            return;
        }
        int position = getPosition(getChildAt(0));
        int e7 = this.mOrientationHelper.e(getChildAt(0));
        if (this.mShouldReverseLayout) {
            for (int i5 = 1; i5 < getChildCount(); i5++) {
                View childAt = getChildAt(i5);
                int position2 = getPosition(childAt);
                int e9 = this.mOrientationHelper.e(childAt);
                if (position2 < position) {
                    i();
                    StringBuilder sb2 = new StringBuilder("detected invalid position. loc invalid? ");
                    sb2.append(e9 < e7);
                    throw new RuntimeException(sb2.toString());
                }
                if (e9 > e7) {
                    i();
                    throw new RuntimeException("detected invalid location");
                }
            }
            return;
        }
        for (int i10 = 1; i10 < getChildCount(); i10++) {
            View childAt2 = getChildAt(i10);
            int position3 = getPosition(childAt2);
            int e10 = this.mOrientationHelper.e(childAt2);
            if (position3 < position) {
                i();
                StringBuilder sb3 = new StringBuilder("detected invalid position. loc invalid? ");
                sb3.append(e10 < e7);
                throw new RuntimeException(sb3.toString());
            }
            if (e10 < e7) {
                i();
                throw new RuntimeException("detected invalid location");
            }
        }
    }

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i5, int i10) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new i0();
        this.mLayoutChunkResult = new j0();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        j1 properties = k1.getProperties(context, attributeSet, i5, i10);
        setOrientation(properties.f2444a);
        setReverseLayout(properties.f2446c);
        setStackFromEnd(properties.f2447d);
    }

    public void onAnchorReady(s1 s1Var, z1 z1Var, i0 i0Var, int i5) {
    }
}
