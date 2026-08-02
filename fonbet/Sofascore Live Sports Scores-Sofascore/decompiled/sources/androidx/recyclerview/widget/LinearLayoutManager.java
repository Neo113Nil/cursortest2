package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.a70;
import defpackage.a8b;
import defpackage.b8b;
import defpackage.c8b;
import defpackage.cp4;
import defpackage.da;
import defpackage.dca;
import defpackage.f8b;
import defpackage.frf;
import defpackage.grf;
import defpackage.gwd;
import defpackage.hrf;
import defpackage.jaa;
import defpackage.ljg;
import defpackage.prf;
import defpackage.qrf;
import defpackage.x9;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class LinearLayoutManager extends n implements dca, prf {
    static final boolean DEBUG = false;
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = Integer.MIN_VALUE;
    private static final float MAX_SCROLL_FACTOR = 0.33333334f;
    private static final String TAG = "LinearLayoutManager";
    public static final int VERTICAL = 1;
    final a8b mAnchorInfo;
    private int mInitialPrefetchItemCount;
    private boolean mLastStackFromEnd;
    private final b8b mLayoutChunkResult;
    private c8b mLayoutState;
    int mOrientation;
    gwd mOrientationHelper;
    SavedState mPendingSavedState;
    int mPendingScrollPosition;
    int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private int[] mReusableIntPair;
    private boolean mReverseLayout;
    boolean mShouldReverseLayout;
    private boolean mSmoothScrollbarEnabled;
    private boolean mStackFromEnd;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new g();
        public int a;
        public int b;
        public boolean c;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c ? 1 : 0);
        }
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new a8b();
        this.mLayoutChunkResult = new b8b();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        grf properties = n.getProperties(context, attributeSet, i, i2);
        setOrientation(properties.a);
        setReverseLayout(properties.c);
        setStackFromEnd(properties.d);
    }

    @Override // androidx.recyclerview.widget.n
    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    public void calculateExtraLayoutSpace(qrf qrfVar, int[] iArr) {
        int i;
        int extraLayoutSpace = getExtraLayoutSpace(qrfVar);
        if (this.mLayoutState.f == -1) {
            i = 0;
        } else {
            i = extraLayoutSpace;
            extraLayoutSpace = 0;
        }
        iArr[0] = extraLayoutSpace;
        iArr[1] = i;
    }

    @Override // androidx.recyclerview.widget.n
    public boolean canScrollHorizontally() {
        return this.mOrientation == 0;
    }

    @Override // androidx.recyclerview.widget.n
    public boolean canScrollVertically() {
        return this.mOrientation == 1;
    }

    @Override // androidx.recyclerview.widget.n
    public void collectAdjacentPrefetchPositions(int i, int i2, qrf qrfVar, frf frfVar) {
        if (this.mOrientation != 0) {
            i = i2;
        }
        if (getChildCount() == 0 || i == 0) {
            return;
        }
        ensureLayoutState();
        o(i > 0 ? 1 : -1, Math.abs(i), true, qrfVar);
        collectPrefetchPositionsForLayoutState(qrfVar, this.mLayoutState, frfVar);
    }

    @Override // androidx.recyclerview.widget.n
    public void collectInitialPrefetchPositions(int i, frf frfVar) {
        boolean z;
        int i2;
        SavedState savedState = this.mPendingSavedState;
        if (savedState == null || (i2 = savedState.a) < 0) {
            n();
            z = this.mShouldReverseLayout;
            i2 = this.mPendingScrollPosition;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = savedState.c;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.mInitialPrefetchItemCount && i2 >= 0 && i2 < i; i4++) {
            ((e) frfVar).a(i2, 0);
            i2 += i3;
        }
    }

    public void collectPrefetchPositionsForLayoutState(qrf qrfVar, c8b c8bVar, frf frfVar) {
        int i = c8bVar.d;
        if (i < 0 || i >= qrfVar.b()) {
            return;
        }
        ((e) frfVar).a(i, Math.max(0, c8bVar.g));
    }

    @Override // androidx.recyclerview.widget.n
    public int computeHorizontalScrollExtent(qrf qrfVar) {
        return d(qrfVar);
    }

    @Override // androidx.recyclerview.widget.n
    public int computeHorizontalScrollOffset(qrf qrfVar) {
        return e(qrfVar);
    }

    @Override // androidx.recyclerview.widget.n
    public int computeHorizontalScrollRange(qrf qrfVar) {
        return f(qrfVar);
    }

    @Override // defpackage.prf
    public PointF computeScrollVectorForPosition(int i) {
        if (getChildCount() == 0) {
            return null;
        }
        int i2 = (i < getPosition(getChildAt(0))) != this.mShouldReverseLayout ? -1 : 1;
        return this.mOrientation == 0 ? new PointF(i2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) : new PointF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i2);
    }

    @Override // androidx.recyclerview.widget.n
    public int computeVerticalScrollExtent(qrf qrfVar) {
        return d(qrfVar);
    }

    @Override // androidx.recyclerview.widget.n
    public int computeVerticalScrollOffset(qrf qrfVar) {
        return e(qrfVar);
    }

    @Override // androidx.recyclerview.widget.n
    public int computeVerticalScrollRange(qrf qrfVar) {
        return f(qrfVar);
    }

    public int convertFocusDirectionToLayoutDirection(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.mOrientation == 1) ? 1 : Integer.MIN_VALUE : this.mOrientation == 0 ? 1 : Integer.MIN_VALUE : this.mOrientation == 1 ? -1 : Integer.MIN_VALUE : this.mOrientation == 0 ? -1 : Integer.MIN_VALUE : (this.mOrientation != 1 && isLayoutRTL()) ? -1 : 1 : (this.mOrientation != 1 && isLayoutRTL()) ? 1 : -1;
    }

    public c8b createLayoutState() {
        c8b c8bVar = new c8b();
        c8bVar.a = true;
        c8bVar.h = 0;
        c8bVar.i = 0;
        c8bVar.k = null;
        return c8bVar;
    }

    public final int d(qrf qrfVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return jaa.u(qrfVar, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    public final int e(qrf qrfVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return jaa.v(qrfVar, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    public void ensureLayoutState() {
        if (this.mLayoutState == null) {
            this.mLayoutState = createLayoutState();
        }
    }

    public final int f(qrf qrfVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return jaa.w(qrfVar, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    public int fill(o oVar, c8b c8bVar, qrf qrfVar, boolean z) {
        int i;
        int i2 = c8bVar.c;
        int i3 = c8bVar.g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                c8bVar.g = i3 + i2;
            }
            l(oVar, c8bVar);
        }
        int i4 = c8bVar.c + c8bVar.h;
        b8b b8bVar = this.mLayoutChunkResult;
        while (true) {
            if ((!c8bVar.l && i4 <= 0) || (i = c8bVar.d) < 0 || i >= qrfVar.b()) {
                break;
            }
            b8bVar.a = 0;
            b8bVar.b = false;
            b8bVar.c = false;
            b8bVar.d = false;
            layoutChunk(oVar, qrfVar, c8bVar, b8bVar);
            if (!b8bVar.b) {
                int i5 = c8bVar.b;
                int i6 = b8bVar.a;
                c8bVar.b = (c8bVar.f * i6) + i5;
                if (!b8bVar.c || c8bVar.k != null || !qrfVar.g) {
                    c8bVar.c -= i6;
                    i4 -= i6;
                }
                int i7 = c8bVar.g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    c8bVar.g = i8;
                    int i9 = c8bVar.c;
                    if (i9 < 0) {
                        c8bVar.g = i8 + i9;
                    }
                    l(oVar, c8bVar);
                }
                if (z && b8bVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - c8bVar.c;
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(0, getChildCount(), true, false);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public View findFirstVisibleChildClosestToEnd(boolean z, boolean z2) {
        return this.mShouldReverseLayout ? findOneVisibleChild(0, getChildCount(), z, z2) : findOneVisibleChild(getChildCount() - 1, -1, z, z2);
    }

    public View findFirstVisibleChildClosestToStart(boolean z, boolean z2) {
        return this.mShouldReverseLayout ? findOneVisibleChild(getChildCount() - 1, -1, z, z2) : findOneVisibleChild(0, getChildCount(), z, z2);
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

    public View findOnePartiallyOrCompletelyInvisibleChild(int i, int i2) {
        int i3;
        int i4;
        ensureLayoutState();
        if (i2 <= i && i2 >= i) {
            return getChildAt(i);
        }
        if (this.mOrientationHelper.e(getChildAt(i)) < this.mOrientationHelper.k()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.mOrientation == 0 ? this.mHorizontalBoundCheck.a(i, i2, i3, i4) : this.mVerticalBoundCheck.a(i, i2, i3, i4);
    }

    public View findOneVisibleChild(int i, int i2, boolean z, boolean z2) {
        ensureLayoutState();
        int i3 = Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE;
        int i4 = z ? 24579 : 320;
        if (!z2) {
            i3 = 0;
        }
        return this.mOrientation == 0 ? this.mHorizontalBoundCheck.a(i, i2, i4, i3) : this.mVerticalBoundCheck.a(i, i2, i4, i3);
    }

    public View findReferenceChild(o oVar, qrf qrfVar, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        ensureLayoutState();
        int childCount = getChildCount();
        if (z2) {
            i2 = getChildCount() - 1;
            i = -1;
            i3 = -1;
        } else {
            i = childCount;
            i2 = 0;
            i3 = 1;
        }
        int b = qrfVar.b();
        int k = this.mOrientationHelper.k();
        int g = this.mOrientationHelper.g();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i2 != i) {
            View childAt = getChildAt(i2);
            int position = getPosition(childAt);
            int e = this.mOrientationHelper.e(childAt);
            int b2 = this.mOrientationHelper.b(childAt);
            if (position >= 0 && position < b) {
                if (!((hrf) childAt.getLayoutParams()).a.isRemoved()) {
                    boolean z3 = b2 <= k && e < k;
                    boolean z4 = e >= g && b2 > g;
                    if (!z3 && !z4) {
                        return childAt;
                    }
                    if (z) {
                        if (!z4) {
                            if (view != null) {
                            }
                            view = childAt;
                        }
                        view2 = childAt;
                    } else {
                        if (!z3) {
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
            i2 += i3;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    @Override // androidx.recyclerview.widget.n
    public View findViewByPosition(int i) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        int position = i - getPosition(getChildAt(0));
        if (position >= 0 && position < childCount) {
            View childAt = getChildAt(position);
            if (getPosition(childAt) == i) {
                return childAt;
            }
        }
        return super.findViewByPosition(i);
    }

    public final int g(int i, o oVar, qrf qrfVar, boolean z) {
        int g;
        int g2 = this.mOrientationHelper.g() - i;
        if (g2 <= 0) {
            return 0;
        }
        int i2 = -scrollBy(-g2, oVar, qrfVar);
        int i3 = i + i2;
        if (!z || (g = this.mOrientationHelper.g() - i3) <= 0) {
            return i2;
        }
        this.mOrientationHelper.o(g);
        return g + i2;
    }

    @Override // androidx.recyclerview.widget.n
    public hrf generateDefaultLayoutParams() {
        return new hrf(-2, -2);
    }

    @Deprecated
    public int getExtraLayoutSpace(qrf qrfVar) {
        if (qrfVar.a != -1) {
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

    public final int h(int i, o oVar, qrf qrfVar, boolean z) {
        int k;
        int k2 = i - this.mOrientationHelper.k();
        if (k2 <= 0) {
            return 0;
        }
        int i2 = -scrollBy(k2, oVar, qrfVar);
        int i3 = i + i2;
        if (!z || (k = i3 - this.mOrientationHelper.k()) <= 0) {
            return i2;
        }
        this.mOrientationHelper.o(-k);
        return i2 - k;
    }

    public final View i() {
        return getChildAt(this.mShouldReverseLayout ? 0 : getChildCount() - 1);
    }

    @Override // androidx.recyclerview.widget.n
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    public boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.n
    public boolean isLayoutReversed() {
        return this.mReverseLayout;
    }

    public boolean isSmoothScrollbarEnabled() {
        return this.mSmoothScrollbarEnabled;
    }

    public final View j() {
        return getChildAt(this.mShouldReverseLayout ? getChildCount() - 1 : 0);
    }

    public final void k() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            getPosition(childAt);
            this.mOrientationHelper.e(childAt);
        }
    }

    public final void l(o oVar, c8b c8bVar) {
        if (!c8bVar.a || c8bVar.l) {
            return;
        }
        int i = c8bVar.g;
        int i2 = c8bVar.i;
        if (c8bVar.f == -1) {
            int childCount = getChildCount();
            if (i < 0) {
                return;
            }
            int f = (this.mOrientationHelper.f() - i) + i2;
            if (this.mShouldReverseLayout) {
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = getChildAt(i3);
                    if (this.mOrientationHelper.e(childAt) < f || this.mOrientationHelper.n(childAt) < f) {
                        m(oVar, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = childCount - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View childAt2 = getChildAt(i5);
                if (this.mOrientationHelper.e(childAt2) < f || this.mOrientationHelper.n(childAt2) < f) {
                    m(oVar, i4, i5);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i6 = i - i2;
        int childCount2 = getChildCount();
        if (!this.mShouldReverseLayout) {
            for (int i7 = 0; i7 < childCount2; i7++) {
                View childAt3 = getChildAt(i7);
                if (this.mOrientationHelper.b(childAt3) > i6 || this.mOrientationHelper.m(childAt3) > i6) {
                    m(oVar, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = childCount2 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View childAt4 = getChildAt(i9);
            if (this.mOrientationHelper.b(childAt4) > i6 || this.mOrientationHelper.m(childAt4) > i6) {
                m(oVar, i8, i9);
                return;
            }
        }
    }

    public void layoutChunk(o oVar, qrf qrfVar, c8b c8bVar, b8b b8bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int d;
        View b = c8bVar.b(oVar);
        if (b == null) {
            b8bVar.b = true;
            return;
        }
        hrf hrfVar = (hrf) b.getLayoutParams();
        List list = c8bVar.k;
        boolean z = this.mShouldReverseLayout;
        int i5 = c8bVar.f;
        if (list == null) {
            if (z == (i5 == -1)) {
                addView(b);
            } else {
                addView(b, 0);
            }
        } else {
            if (z == (i5 == -1)) {
                addDisappearingView(b);
            } else {
                addDisappearingView(b, 0);
            }
        }
        measureChildWithMargins(b, 0, 0);
        b8bVar.a = this.mOrientationHelper.c(b);
        if (this.mOrientation == 1) {
            if (isLayoutRTL()) {
                d = getWidth() - getPaddingRight();
                i3 = d - this.mOrientationHelper.d(b);
            } else {
                i3 = getPaddingLeft();
                d = this.mOrientationHelper.d(b) + i3;
            }
            int i6 = c8bVar.f;
            int i7 = c8bVar.b;
            int i8 = b8bVar.a;
            if (i6 == -1) {
                i4 = i7 - i8;
                i = i7;
            } else {
                i = i8 + i7;
                i4 = i7;
            }
            i2 = d;
        } else {
            int paddingTop = getPaddingTop();
            int d2 = this.mOrientationHelper.d(b) + paddingTop;
            int i9 = c8bVar.f;
            int i10 = c8bVar.b;
            int i11 = b8bVar.a;
            if (i9 == -1) {
                int i12 = i10 - i11;
                i2 = i10;
                i = d2;
                i3 = i12;
            } else {
                int i13 = i10 + i11;
                i = d2;
                i2 = i13;
                i3 = i10;
            }
            i4 = paddingTop;
        }
        layoutDecoratedWithMargins(b, i3, i4, i2, i);
        if (hrfVar.a.isRemoved() || hrfVar.a.isUpdated()) {
            b8bVar.c = true;
        }
        b8bVar.d = b.hasFocusable();
    }

    public final void m(o oVar, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                removeAndRecycleViewAt(i, oVar);
                i--;
            }
        } else {
            for (int i3 = i2 - 1; i3 >= i; i3--) {
                removeAndRecycleViewAt(i3, oVar);
            }
        }
    }

    public final void n() {
        if (this.mOrientation == 1 || !isLayoutRTL()) {
            this.mShouldReverseLayout = this.mReverseLayout;
        } else {
            this.mShouldReverseLayout = !this.mReverseLayout;
        }
    }

    public final void o(int i, int i2, boolean z, qrf qrfVar) {
        int k;
        this.mLayoutState.l = resolveIsInfinite();
        this.mLayoutState.f = i;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(qrfVar, iArr);
        int max = Math.max(0, this.mReusableIntPair[0]);
        int max2 = Math.max(0, this.mReusableIntPair[1]);
        boolean z2 = i == 1;
        c8b c8bVar = this.mLayoutState;
        int i3 = z2 ? max2 : max;
        c8bVar.h = i3;
        if (!z2) {
            max = max2;
        }
        c8bVar.i = max;
        if (z2) {
            c8bVar.h = this.mOrientationHelper.h() + i3;
            View i4 = i();
            c8b c8bVar2 = this.mLayoutState;
            c8bVar2.e = this.mShouldReverseLayout ? -1 : 1;
            int position = getPosition(i4);
            c8b c8bVar3 = this.mLayoutState;
            c8bVar2.d = position + c8bVar3.e;
            c8bVar3.b = this.mOrientationHelper.b(i4);
            k = this.mOrientationHelper.b(i4) - this.mOrientationHelper.g();
        } else {
            View j = j();
            c8b c8bVar4 = this.mLayoutState;
            c8bVar4.h = this.mOrientationHelper.k() + c8bVar4.h;
            c8b c8bVar5 = this.mLayoutState;
            c8bVar5.e = this.mShouldReverseLayout ? 1 : -1;
            int position2 = getPosition(j);
            c8b c8bVar6 = this.mLayoutState;
            c8bVar5.d = position2 + c8bVar6.e;
            c8bVar6.b = this.mOrientationHelper.e(j);
            k = (-this.mOrientationHelper.e(j)) + this.mOrientationHelper.k();
        }
        c8b c8bVar7 = this.mLayoutState;
        c8bVar7.c = i2;
        if (z) {
            c8bVar7.c = i2 - k;
        }
        c8bVar7.g = k;
    }

    @Override // androidx.recyclerview.widget.n
    public void onDetachedFromWindow(RecyclerView recyclerView, o oVar) {
        onDetachedFromWindow(recyclerView);
        if (this.mRecycleChildrenOnDetach) {
            removeAndRecycleAllViews(oVar);
            oVar.a.clear();
            oVar.h();
        }
    }

    @Override // androidx.recyclerview.widget.n
    public View onFocusSearchFailed(View view, int i, o oVar, qrf qrfVar) {
        int convertFocusDirectionToLayoutDirection;
        n();
        if (getChildCount() != 0 && (convertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i)) != Integer.MIN_VALUE) {
            ensureLayoutState();
            o(convertFocusDirectionToLayoutDirection, (int) (this.mOrientationHelper.l() * MAX_SCROLL_FACTOR), false, qrfVar);
            c8b c8bVar = this.mLayoutState;
            c8bVar.g = Integer.MIN_VALUE;
            c8bVar.a = false;
            fill(oVar, c8bVar, qrfVar, true);
            boolean z = this.mShouldReverseLayout;
            View findOnePartiallyOrCompletelyInvisibleChild = convertFocusDirectionToLayoutDirection == -1 ? z ? findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1) : findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount()) : z ? findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount()) : findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1);
            View j = convertFocusDirectionToLayoutDirection == -1 ? j() : i();
            if (!j.hasFocusable()) {
                return findOnePartiallyOrCompletelyInvisibleChild;
            }
            if (findOnePartiallyOrCompletelyInvisibleChild != null) {
                return j;
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.n
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(findFirstVisibleItemPosition());
            accessibilityEvent.setToIndex(findLastVisibleItemPosition());
        }
    }

    @Override // androidx.recyclerview.widget.n
    public void onInitializeAccessibilityNodeInfo(@NonNull o oVar, @NonNull qrf qrfVar, @NonNull da daVar) {
        super.onInitializeAccessibilityNodeInfo(oVar, qrfVar, daVar);
        l lVar = this.mRecyclerView.mAdapter;
        if (lVar == null || lVar.getItemCount() <= 0) {
            return;
        }
        daVar.b(x9.l);
    }

    @Override // androidx.recyclerview.widget.n
    public void onLayoutChildren(o oVar, qrf qrfVar) {
        View findReferenceChild;
        int i;
        int e;
        int i2;
        int i3;
        int i4;
        int i5;
        int g;
        int i6;
        View findViewByPosition;
        int e2;
        int i7;
        int i8;
        int i9 = -1;
        if (!(this.mPendingSavedState == null && this.mPendingScrollPosition == -1) && qrfVar.b() == 0) {
            removeAndRecycleAllViews(oVar);
            return;
        }
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null && (i8 = savedState.a) >= 0) {
            this.mPendingScrollPosition = i8;
        }
        ensureLayoutState();
        this.mLayoutState.a = false;
        n();
        View focusedChild = getFocusedChild();
        a8b a8bVar = this.mAnchorInfo;
        boolean z = true;
        if (!a8bVar.e || this.mPendingScrollPosition != -1 || this.mPendingSavedState != null) {
            a8bVar.c();
            a8b a8bVar2 = this.mAnchorInfo;
            a8bVar2.d = this.mShouldReverseLayout ^ this.mStackFromEnd;
            if (!qrfVar.g && (i = this.mPendingScrollPosition) != -1) {
                if (i < 0 || i >= qrfVar.b()) {
                    this.mPendingScrollPosition = -1;
                    this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
                } else {
                    int i10 = this.mPendingScrollPosition;
                    a8bVar2.b = i10;
                    SavedState savedState2 = this.mPendingSavedState;
                    if (savedState2 != null && savedState2.a >= 0) {
                        boolean z2 = savedState2.c;
                        a8bVar2.d = z2;
                        gwd gwdVar = this.mOrientationHelper;
                        if (z2) {
                            a8bVar2.c = gwdVar.g() - this.mPendingSavedState.b;
                        } else {
                            a8bVar2.c = gwdVar.k() + this.mPendingSavedState.b;
                        }
                    } else if (this.mPendingScrollPositionOffset == Integer.MIN_VALUE) {
                        View findViewByPosition2 = findViewByPosition(i10);
                        if (findViewByPosition2 == null) {
                            if (getChildCount() > 0) {
                                a8bVar2.d = (this.mPendingScrollPosition < getPosition(getChildAt(0))) == this.mShouldReverseLayout;
                            }
                            a8bVar2.a();
                        } else if (this.mOrientationHelper.c(findViewByPosition2) > this.mOrientationHelper.l()) {
                            a8bVar2.a();
                        } else {
                            int e3 = this.mOrientationHelper.e(findViewByPosition2) - this.mOrientationHelper.k();
                            gwd gwdVar2 = this.mOrientationHelper;
                            if (e3 < 0) {
                                a8bVar2.c = gwdVar2.k();
                                a8bVar2.d = false;
                            } else if (gwdVar2.g() - this.mOrientationHelper.b(findViewByPosition2) < 0) {
                                a8bVar2.c = this.mOrientationHelper.g();
                                a8bVar2.d = true;
                            } else {
                                boolean z3 = a8bVar2.d;
                                gwd gwdVar3 = this.mOrientationHelper;
                                if (z3) {
                                    int b = gwdVar3.b(findViewByPosition2);
                                    gwd gwdVar4 = this.mOrientationHelper;
                                    e = (Integer.MIN_VALUE == gwdVar4.b ? 0 : gwdVar4.l() - gwdVar4.b) + b;
                                } else {
                                    e = gwdVar3.e(findViewByPosition2);
                                }
                                a8bVar2.c = e;
                            }
                        }
                    } else {
                        boolean z4 = this.mShouldReverseLayout;
                        a8bVar2.d = z4;
                        gwd gwdVar5 = this.mOrientationHelper;
                        if (z4) {
                            a8bVar2.c = gwdVar5.g() - this.mPendingScrollPositionOffset;
                        } else {
                            a8bVar2.c = gwdVar5.k() + this.mPendingScrollPositionOffset;
                        }
                    }
                    this.mAnchorInfo.e = true;
                }
            }
            if (getChildCount() != 0) {
                View focusedChild2 = getFocusedChild();
                if (focusedChild2 != null) {
                    hrf hrfVar = (hrf) focusedChild2.getLayoutParams();
                    if (!hrfVar.a.isRemoved() && hrfVar.a.getLayoutPosition() >= 0 && hrfVar.a.getLayoutPosition() < qrfVar.b()) {
                        a8bVar2.b(getPosition(focusedChild2), focusedChild2);
                        this.mAnchorInfo.e = true;
                    }
                }
                boolean z5 = this.mLastStackFromEnd;
                boolean z6 = this.mStackFromEnd;
                if (z5 == z6 && (findReferenceChild = findReferenceChild(oVar, qrfVar, a8bVar2.d, z6)) != null) {
                    int position = getPosition(findReferenceChild);
                    boolean z7 = a8bVar2.d;
                    gwd gwdVar6 = a8bVar2.a;
                    if (z7) {
                        int b2 = gwdVar6.b(findReferenceChild);
                        gwd gwdVar7 = a8bVar2.a;
                        a8bVar2.c = (Integer.MIN_VALUE == gwdVar7.b ? 0 : gwdVar7.l() - gwdVar7.b) + b2;
                    } else {
                        a8bVar2.c = gwdVar6.e(findReferenceChild);
                    }
                    a8bVar2.b = position;
                    if (!qrfVar.g && supportsPredictiveItemAnimations()) {
                        int e4 = this.mOrientationHelper.e(findReferenceChild);
                        int b3 = this.mOrientationHelper.b(findReferenceChild);
                        int k = this.mOrientationHelper.k();
                        int g2 = this.mOrientationHelper.g();
                        boolean z8 = b3 <= k && e4 < k;
                        boolean z9 = e4 >= g2 && b3 > g2;
                        if (z8 || z9) {
                            if (a8bVar2.d) {
                                k = g2;
                            }
                            a8bVar2.c = k;
                        }
                    }
                    this.mAnchorInfo.e = true;
                }
            }
            a8bVar2.a();
            a8bVar2.b = this.mStackFromEnd ? qrfVar.b() - 1 : 0;
            this.mAnchorInfo.e = true;
        } else if (focusedChild != null && (this.mOrientationHelper.e(focusedChild) >= this.mOrientationHelper.g() || this.mOrientationHelper.b(focusedChild) <= this.mOrientationHelper.k())) {
            this.mAnchorInfo.b(getPosition(focusedChild), focusedChild);
        }
        c8b c8bVar = this.mLayoutState;
        c8bVar.f = c8bVar.j >= 0 ? 1 : -1;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(qrfVar, iArr);
        int k2 = this.mOrientationHelper.k() + Math.max(0, this.mReusableIntPair[0]);
        int h = this.mOrientationHelper.h() + Math.max(0, this.mReusableIntPair[1]);
        if (qrfVar.g && (i6 = this.mPendingScrollPosition) != -1 && this.mPendingScrollPositionOffset != Integer.MIN_VALUE && (findViewByPosition = findViewByPosition(i6)) != null) {
            boolean z10 = this.mShouldReverseLayout;
            gwd gwdVar8 = this.mOrientationHelper;
            if (z10) {
                i7 = gwdVar8.g() - this.mOrientationHelper.b(findViewByPosition);
                e2 = this.mPendingScrollPositionOffset;
            } else {
                e2 = gwdVar8.e(findViewByPosition) - this.mOrientationHelper.k();
                i7 = this.mPendingScrollPositionOffset;
            }
            int i11 = i7 - e2;
            if (i11 > 0) {
                k2 += i11;
            } else {
                h -= i11;
            }
        }
        a8b a8bVar3 = this.mAnchorInfo;
        boolean z11 = a8bVar3.d;
        boolean z12 = this.mShouldReverseLayout;
        if (!z11 ? !z12 : z12) {
            i9 = 1;
        }
        onAnchorReady(oVar, qrfVar, a8bVar3, i9);
        detachAndScrapAttachedViews(oVar);
        this.mLayoutState.l = resolveIsInfinite();
        this.mLayoutState.getClass();
        this.mLayoutState.i = 0;
        a8b a8bVar4 = this.mAnchorInfo;
        boolean z13 = a8bVar4.d;
        int i12 = a8bVar4.b;
        if (z13) {
            q(i12, a8bVar4.c);
            c8b c8bVar2 = this.mLayoutState;
            c8bVar2.h = k2;
            fill(oVar, c8bVar2, qrfVar, false);
            c8b c8bVar3 = this.mLayoutState;
            i3 = c8bVar3.b;
            int i13 = c8bVar3.d;
            int i14 = c8bVar3.c;
            if (i14 > 0) {
                h += i14;
            }
            a8b a8bVar5 = this.mAnchorInfo;
            p(a8bVar5.b, a8bVar5.c);
            c8b c8bVar4 = this.mLayoutState;
            c8bVar4.h = h;
            c8bVar4.d += c8bVar4.e;
            fill(oVar, c8bVar4, qrfVar, false);
            c8b c8bVar5 = this.mLayoutState;
            i2 = c8bVar5.b;
            int i15 = c8bVar5.c;
            if (i15 > 0) {
                q(i13, i3);
                c8b c8bVar6 = this.mLayoutState;
                c8bVar6.h = i15;
                fill(oVar, c8bVar6, qrfVar, false);
                i3 = this.mLayoutState.b;
            }
        } else {
            p(i12, a8bVar4.c);
            c8b c8bVar7 = this.mLayoutState;
            c8bVar7.h = h;
            fill(oVar, c8bVar7, qrfVar, false);
            c8b c8bVar8 = this.mLayoutState;
            i2 = c8bVar8.b;
            int i16 = c8bVar8.d;
            int i17 = c8bVar8.c;
            if (i17 > 0) {
                k2 += i17;
            }
            a8b a8bVar6 = this.mAnchorInfo;
            q(a8bVar6.b, a8bVar6.c);
            c8b c8bVar9 = this.mLayoutState;
            c8bVar9.h = k2;
            c8bVar9.d += c8bVar9.e;
            fill(oVar, c8bVar9, qrfVar, false);
            c8b c8bVar10 = this.mLayoutState;
            int i18 = c8bVar10.b;
            int i19 = c8bVar10.c;
            if (i19 > 0) {
                p(i16, i2);
                c8b c8bVar11 = this.mLayoutState;
                c8bVar11.h = i19;
                fill(oVar, c8bVar11, qrfVar, false);
                i2 = this.mLayoutState.b;
            }
            i3 = i18;
        }
        if (getChildCount() > 0) {
            if (this.mShouldReverseLayout ^ this.mStackFromEnd) {
                int g3 = g(i2, oVar, qrfVar, true);
                i4 = i3 + g3;
                i5 = i2 + g3;
                g = h(i4, oVar, qrfVar, false);
            } else {
                int h2 = h(i3, oVar, qrfVar, true);
                i4 = i3 + h2;
                i5 = i2 + h2;
                g = g(i5, oVar, qrfVar, false);
            }
            i3 = i4 + g;
            i2 = i5 + g;
        }
        if (qrfVar.k && getChildCount() != 0 && !qrfVar.g && supportsPredictiveItemAnimations()) {
            List list = oVar.d;
            int size = list.size();
            int position2 = getPosition(getChildAt(0));
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            while (i20 < size) {
                u uVar = (u) list.get(i20);
                if (!uVar.isRemoved()) {
                    boolean z14 = uVar.getLayoutPosition() < position2 ? z : false;
                    boolean z15 = this.mShouldReverseLayout;
                    gwd gwdVar9 = this.mOrientationHelper;
                    View view = uVar.itemView;
                    if (z14 != z15) {
                        i21 += gwdVar9.c(view);
                    } else {
                        i22 += gwdVar9.c(view);
                    }
                }
                i20++;
                z = true;
            }
            this.mLayoutState.k = list;
            if (i21 > 0) {
                q(getPosition(j()), i3);
                c8b c8bVar12 = this.mLayoutState;
                c8bVar12.h = i21;
                c8bVar12.c = 0;
                c8bVar12.a(null);
                fill(oVar, this.mLayoutState, qrfVar, false);
            }
            if (i22 > 0) {
                p(getPosition(i()), i2);
                c8b c8bVar13 = this.mLayoutState;
                c8bVar13.h = i22;
                c8bVar13.c = 0;
                c8bVar13.a(null);
                fill(oVar, this.mLayoutState, qrfVar, false);
            }
            this.mLayoutState.k = null;
        }
        if (qrfVar.g) {
            this.mAnchorInfo.c();
        } else {
            gwd gwdVar10 = this.mOrientationHelper;
            gwdVar10.b = gwdVar10.l();
        }
        this.mLastStackFromEnd = this.mStackFromEnd;
    }

    @Override // androidx.recyclerview.widget.n
    public void onLayoutCompleted(qrf qrfVar) {
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mAnchorInfo.c();
    }

    @Override // androidx.recyclerview.widget.n
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.mPendingSavedState = savedState;
            if (this.mPendingScrollPosition != -1) {
                savedState.a = -1;
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.n
    public Parcelable onSaveInstanceState() {
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            SavedState savedState2 = new SavedState();
            savedState2.a = savedState.a;
            savedState2.b = savedState.b;
            savedState2.c = savedState.c;
            return savedState2;
        }
        SavedState savedState3 = new SavedState();
        if (getChildCount() <= 0) {
            savedState3.a = -1;
            return savedState3;
        }
        ensureLayoutState();
        boolean z = this.mLastStackFromEnd ^ this.mShouldReverseLayout;
        savedState3.c = z;
        if (z) {
            View i = i();
            savedState3.b = this.mOrientationHelper.g() - this.mOrientationHelper.b(i);
            savedState3.a = getPosition(i);
            return savedState3;
        }
        View j = j();
        savedState3.a = getPosition(j);
        savedState3.b = this.mOrientationHelper.e(j) - this.mOrientationHelper.k();
        return savedState3;
    }

    public final void p(int i, int i2) {
        this.mLayoutState.c = this.mOrientationHelper.g() - i2;
        c8b c8bVar = this.mLayoutState;
        c8bVar.e = this.mShouldReverseLayout ? -1 : 1;
        c8bVar.d = i;
        c8bVar.f = 1;
        c8bVar.b = i2;
        c8bVar.g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.n
    public boolean performAccessibilityAction(int i, @Nullable Bundle bundle) {
        int min;
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (i == 16908343 && bundle != null) {
            if (this.mOrientation == 1) {
                int i2 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
                if (i2 < 0) {
                    return false;
                }
                RecyclerView recyclerView = this.mRecyclerView;
                min = Math.min(i2, getRowCountForAccessibility(recyclerView.mRecycler, recyclerView.mState) - 1);
            } else {
                int i3 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
                if (i3 < 0) {
                    return false;
                }
                RecyclerView recyclerView2 = this.mRecyclerView;
                min = Math.min(i3, getColumnCountForAccessibility(recyclerView2.mRecycler, recyclerView2.mState) - 1);
            }
            if (min >= 0) {
                scrollToPositionWithOffset(min, 0);
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dca
    public void prepareForDrop(@NonNull View view, @NonNull View view2, int i, int i2) {
        assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        ensureLayoutState();
        n();
        int position = getPosition(view);
        int position2 = getPosition(view2);
        char c = position < position2 ? (char) 1 : (char) 65535;
        boolean z = this.mShouldReverseLayout;
        gwd gwdVar = this.mOrientationHelper;
        if (z) {
            if (c == 1) {
                scrollToPositionWithOffset(position2, gwdVar.g() - (this.mOrientationHelper.c(view) + this.mOrientationHelper.e(view2)));
                return;
            } else {
                scrollToPositionWithOffset(position2, gwdVar.g() - this.mOrientationHelper.b(view2));
                return;
            }
        }
        if (c == 65535) {
            scrollToPositionWithOffset(position2, gwdVar.e(view2));
        } else {
            scrollToPositionWithOffset(position2, gwdVar.b(view2) - this.mOrientationHelper.c(view));
        }
    }

    public final void q(int i, int i2) {
        this.mLayoutState.c = i2 - this.mOrientationHelper.k();
        c8b c8bVar = this.mLayoutState;
        c8bVar.d = i;
        c8bVar.e = this.mShouldReverseLayout ? 1 : -1;
        c8bVar.f = -1;
        c8bVar.b = i2;
        c8bVar.g = Integer.MIN_VALUE;
    }

    public boolean resolveIsInfinite() {
        return this.mOrientationHelper.i() == 0 && this.mOrientationHelper.f() == 0;
    }

    public int scrollBy(int i, o oVar, qrf qrfVar) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        ensureLayoutState();
        this.mLayoutState.a = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        o(i2, abs, true, qrfVar);
        c8b c8bVar = this.mLayoutState;
        int fill = fill(oVar, c8bVar, qrfVar, false) + c8bVar.g;
        if (fill < 0) {
            return 0;
        }
        if (abs > fill) {
            i = i2 * fill;
        }
        this.mOrientationHelper.o(-i);
        this.mLayoutState.j = i;
        return i;
    }

    @Override // androidx.recyclerview.widget.n
    public int scrollHorizontallyBy(int i, o oVar, qrf qrfVar) {
        if (this.mOrientation == 1) {
            return 0;
        }
        return scrollBy(i, oVar, qrfVar);
    }

    @Override // androidx.recyclerview.widget.n
    public void scrollToPosition(int i) {
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.a = -1;
        }
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i, int i2) {
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = i2;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.a = -1;
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.n
    public int scrollVerticallyBy(int i, o oVar, qrf qrfVar) {
        if (this.mOrientation == 0) {
            return 0;
        }
        return scrollBy(i, oVar, qrfVar);
    }

    public void setInitialPrefetchItemCount(int i) {
        this.mInitialPrefetchItemCount = i;
    }

    public void setOrientation(int i) {
        if (i != 0 && i != 1) {
            a70.p(ljg.j(i, "invalid orientation:"));
            return;
        }
        assertNotInLayoutOrScroll(null);
        if (i != this.mOrientation || this.mOrientationHelper == null) {
            gwd a = gwd.a(this, i);
            this.mOrientationHelper = a;
            this.mAnchorInfo.a = a;
            this.mOrientation = i;
            requestLayout();
        }
    }

    public void setRecycleChildrenOnDetach(boolean z) {
        this.mRecycleChildrenOnDetach = z;
    }

    public void setReverseLayout(boolean z) {
        assertNotInLayoutOrScroll(null);
        if (z == this.mReverseLayout) {
            return;
        }
        this.mReverseLayout = z;
        requestLayout();
    }

    public void setSmoothScrollbarEnabled(boolean z) {
        this.mSmoothScrollbarEnabled = z;
    }

    public void setStackFromEnd(boolean z) {
        assertNotInLayoutOrScroll(null);
        if (this.mStackFromEnd == z) {
            return;
        }
        this.mStackFromEnd = z;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.n
    public boolean shouldMeasureTwice() {
        return (getHeightMode() == 1073741824 || getWidthMode() == 1073741824 || !hasFlexibleChildInBothOrientations()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.n
    public void smoothScrollToPosition(RecyclerView recyclerView, qrf qrfVar, int i) {
        f8b f8bVar = new f8b(recyclerView.getContext());
        f8bVar.setTargetPosition(i);
        startSmoothScroll(f8bVar);
    }

    @Override // androidx.recyclerview.widget.n
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && this.mLastStackFromEnd == this.mStackFromEnd;
    }

    public void validateChildOrder() {
        getChildCount();
        if (getChildCount() < 1) {
            return;
        }
        int position = getPosition(getChildAt(0));
        int e = this.mOrientationHelper.e(getChildAt(0));
        if (this.mShouldReverseLayout) {
            for (int i = 1; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                int position2 = getPosition(childAt);
                int e2 = this.mOrientationHelper.e(childAt);
                if (position2 < position) {
                    k();
                    StringBuilder sb = new StringBuilder("detected invalid position. loc invalid? ");
                    sb.append(e2 < e);
                    throw new RuntimeException(sb.toString());
                }
                if (e2 > e) {
                    k();
                    cp4.h("detected invalid location");
                    return;
                }
            }
            return;
        }
        for (int i2 = 1; i2 < getChildCount(); i2++) {
            View childAt2 = getChildAt(i2);
            int position3 = getPosition(childAt2);
            int e3 = this.mOrientationHelper.e(childAt2);
            if (position3 < position) {
                k();
                StringBuilder sb2 = new StringBuilder("detected invalid position. loc invalid? ");
                sb2.append(e3 < e);
                throw new RuntimeException(sb2.toString());
            }
            if (e3 < e) {
                k();
                cp4.h("detected invalid location");
                return;
            }
        }
    }

    public LinearLayoutManager(int i, boolean z) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new a8b();
        this.mLayoutChunkResult = new b8b();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        setOrientation(i);
        setReverseLayout(z);
    }

    public LinearLayoutManager() {
        this(1, false);
    }

    public void onAnchorReady(o oVar, qrf qrfVar, a8b a8bVar, int i) {
    }
}
