package com.google.android.flexbox;

import B4.V;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import androidx.recyclerview.widget.w;
import com.google.android.flexbox.d;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public class FlexboxLayoutManager extends RecyclerView.o implements com.google.android.flexbox.a, RecyclerView.z.b {
    private static final Rect TEMP_RECT = new Rect();
    private int mAlignItems;
    private a mAnchorInfo;
    private final Context mContext;
    private int mDirtyPosition;
    private int mFlexDirection;
    private List<com.google.android.flexbox.c> mFlexLines;
    private d.a mFlexLinesResult;
    private int mFlexWrap;
    private final com.google.android.flexbox.d mFlexboxHelper;
    private boolean mFromBottomToTop;
    private boolean mIsRtl;
    private int mJustifyContent;
    private int mLastHeight;
    private int mLastWidth;
    private c mLayoutState;
    private int mMaxLine;
    private w mOrientationHelper;
    private View mParent;
    private d mPendingSavedState;
    private int mPendingScrollPosition;
    private int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private RecyclerView.v mRecycler;
    private RecyclerView.A mState;
    private w mSubOrientationHelper;
    private SparseArray<View> mViewCache;

    private class a {

        /* renamed from: a, reason: collision with root package name */
        private int f57808a;

        /* renamed from: b, reason: collision with root package name */
        private int f57809b;

        /* renamed from: c, reason: collision with root package name */
        private int f57810c;

        /* renamed from: d, reason: collision with root package name */
        private int f57811d = 0;

        /* renamed from: e, reason: collision with root package name */
        private boolean f57812e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f57813f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f57814g;

        a() {
        }

        static void e(a aVar) {
            FlexboxLayoutManager flexboxLayoutManager = FlexboxLayoutManager.this;
            if (flexboxLayoutManager.isMainAxisDirectionHorizontal() || !flexboxLayoutManager.mIsRtl) {
                aVar.f57810c = aVar.f57812e ? flexboxLayoutManager.mOrientationHelper.i() : flexboxLayoutManager.mOrientationHelper.n();
            } else {
                aVar.f57810c = aVar.f57812e ? flexboxLayoutManager.mOrientationHelper.i() : flexboxLayoutManager.getWidth() - flexboxLayoutManager.mOrientationHelper.n();
            }
        }

        static void i(a aVar, View view) {
            FlexboxLayoutManager flexboxLayoutManager = FlexboxLayoutManager.this;
            w wVar = flexboxLayoutManager.mFlexWrap == 0 ? flexboxLayoutManager.mSubOrientationHelper : flexboxLayoutManager.mOrientationHelper;
            if (flexboxLayoutManager.isMainAxisDirectionHorizontal() || !flexboxLayoutManager.mIsRtl) {
                if (aVar.f57812e) {
                    aVar.f57810c = wVar.p() + wVar.d(view);
                } else {
                    aVar.f57810c = wVar.g(view);
                }
            } else if (aVar.f57812e) {
                aVar.f57810c = wVar.p() + wVar.g(view);
            } else {
                aVar.f57810c = wVar.d(view);
            }
            aVar.f57808a = flexboxLayoutManager.getPosition(view);
            aVar.f57814g = false;
            int[] iArr = flexboxLayoutManager.mFlexboxHelper.f57856c;
            int i11 = aVar.f57808a;
            if (i11 == -1) {
                i11 = 0;
            }
            int i12 = iArr[i11];
            aVar.f57809b = i12 != -1 ? i12 : 0;
            if (flexboxLayoutManager.mFlexLines.size() > aVar.f57809b) {
                aVar.f57808a = ((com.google.android.flexbox.c) flexboxLayoutManager.mFlexLines.get(aVar.f57809b)).f57850o;
            }
        }

        static void n(a aVar) {
            aVar.f57808a = -1;
            aVar.f57809b = -1;
            aVar.f57810c = LinearLayoutManager.INVALID_OFFSET;
            aVar.f57813f = false;
            aVar.f57814g = false;
            FlexboxLayoutManager flexboxLayoutManager = FlexboxLayoutManager.this;
            if (flexboxLayoutManager.isMainAxisDirectionHorizontal()) {
                if (flexboxLayoutManager.mFlexWrap == 0) {
                    aVar.f57812e = flexboxLayoutManager.mFlexDirection == 1;
                    return;
                } else {
                    aVar.f57812e = flexboxLayoutManager.mFlexWrap == 2;
                    return;
                }
            }
            if (flexboxLayoutManager.mFlexWrap == 0) {
                aVar.f57812e = flexboxLayoutManager.mFlexDirection == 3;
            } else {
                aVar.f57812e = flexboxLayoutManager.mFlexWrap == 2;
            }
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AnchorInfo{mPosition=");
            sb2.append(this.f57808a);
            sb2.append(", mFlexLinePosition=");
            sb2.append(this.f57809b);
            sb2.append(", mCoordinate=");
            sb2.append(this.f57810c);
            sb2.append(", mPerpendicularCoordinate=");
            sb2.append(this.f57811d);
            sb2.append(", mLayoutFromEnd=");
            sb2.append(this.f57812e);
            sb2.append(", mValid=");
            sb2.append(this.f57813f);
            sb2.append(", mAssignedFromSavedState=");
            return V.d(sb2, this.f57814g, '}');
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        private int f57825a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f57826b;

        /* renamed from: c, reason: collision with root package name */
        private int f57827c;

        /* renamed from: d, reason: collision with root package name */
        private int f57828d;

        /* renamed from: e, reason: collision with root package name */
        private int f57829e;

        /* renamed from: f, reason: collision with root package name */
        private int f57830f;

        /* renamed from: g, reason: collision with root package name */
        private int f57831g;

        /* renamed from: h, reason: collision with root package name */
        private int f57832h = 1;

        /* renamed from: i, reason: collision with root package name */
        private boolean f57833i;

        c() {
        }

        static /* synthetic */ void i(c cVar) {
            cVar.f57827c++;
        }

        static /* synthetic */ void j(c cVar) {
            cVar.f57827c--;
        }

        static boolean m(c cVar, RecyclerView.A a11, List list) {
            int i11;
            int i12 = cVar.f57828d;
            return i12 >= 0 && i12 < a11.b() && (i11 = cVar.f57827c) >= 0 && i11 < list.size();
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("LayoutState{mAvailable=");
            sb2.append(this.f57825a);
            sb2.append(", mFlexLinePosition=");
            sb2.append(this.f57827c);
            sb2.append(", mPosition=");
            sb2.append(this.f57828d);
            sb2.append(", mOffset=");
            sb2.append(this.f57829e);
            sb2.append(", mScrollingOffset=");
            sb2.append(this.f57830f);
            sb2.append(", mLastScrollDelta=");
            sb2.append(this.f57831g);
            sb2.append(", mItemDirection=1, mLayoutDirection=");
            return Ek.a.d(sb2, this.f57832h, '}');
        }
    }

    private static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private int f57834a;

        /* renamed from: b, reason: collision with root package name */
        private int f57835b;

        static class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public final d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final d[] newArray(int i11) {
                return new d[i11];
            }
        }

        d() {
        }

        static void e(d dVar) {
            dVar.f57834a = -1;
        }

        static boolean f(d dVar, int i11) {
            int i12 = dVar.f57834a;
            return i12 >= 0 && i12 < i11;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SavedState{mAnchorPosition=");
            sb2.append(this.f57834a);
            sb2.append(", mAnchorOffset=");
            return Ek.a.d(sb2, this.f57835b, '}');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i11) {
            parcel.writeInt(this.f57834a);
            parcel.writeInt(this.f57835b);
        }

        d(Parcel parcel) {
            this.f57834a = parcel.readInt();
            this.f57835b = parcel.readInt();
        }

        d(d dVar) {
            this.f57834a = dVar.f57834a;
            this.f57835b = dVar.f57835b;
        }
    }

    public FlexboxLayoutManager(Context context) {
        this(context, 0, 1);
    }

    private boolean canViewBeRecycledFromEnd(View view, int i11) {
        return (isMainAxisDirectionHorizontal() || !this.mIsRtl) ? this.mOrientationHelper.g(view) >= this.mOrientationHelper.h() - i11 : this.mOrientationHelper.d(view) <= i11;
    }

    private boolean canViewBeRecycledFromStart(View view, int i11) {
        return (isMainAxisDirectionHorizontal() || !this.mIsRtl) ? this.mOrientationHelper.d(view) <= i11 : this.mOrientationHelper.h() - this.mOrientationHelper.g(view) <= i11;
    }

    private void clearFlexLines() {
        this.mFlexLines.clear();
        a.n(this.mAnchorInfo);
        this.mAnchorInfo.f57811d = 0;
    }

    private int computeScrollExtent(RecyclerView.A a11) {
        if (getChildCount() == 0) {
            return 0;
        }
        int b11 = a11.b();
        ensureOrientationHelper();
        View findFirstReferenceChild = findFirstReferenceChild(b11);
        View findLastReferenceChild = findLastReferenceChild(b11);
        if (a11.b() == 0 || findFirstReferenceChild == null || findLastReferenceChild == null) {
            return 0;
        }
        return Math.min(this.mOrientationHelper.o(), this.mOrientationHelper.d(findLastReferenceChild) - this.mOrientationHelper.g(findFirstReferenceChild));
    }

    private int computeScrollOffset(RecyclerView.A a11) {
        if (getChildCount() == 0) {
            return 0;
        }
        int b11 = a11.b();
        View findFirstReferenceChild = findFirstReferenceChild(b11);
        View findLastReferenceChild = findLastReferenceChild(b11);
        if (a11.b() == 0 || findFirstReferenceChild == null || findLastReferenceChild == null) {
            return 0;
        }
        int position = getPosition(findFirstReferenceChild);
        int position2 = getPosition(findLastReferenceChild);
        int abs = Math.abs(this.mOrientationHelper.d(findLastReferenceChild) - this.mOrientationHelper.g(findFirstReferenceChild));
        int i11 = this.mFlexboxHelper.f57856c[position];
        if (i11 == 0 || i11 == -1) {
            return 0;
        }
        return Math.round((i11 * (abs / ((r3[position2] - i11) + 1))) + (this.mOrientationHelper.n() - this.mOrientationHelper.g(findFirstReferenceChild)));
    }

    private int computeScrollRange(RecyclerView.A a11) {
        if (getChildCount() == 0) {
            return 0;
        }
        int b11 = a11.b();
        View findFirstReferenceChild = findFirstReferenceChild(b11);
        View findLastReferenceChild = findLastReferenceChild(b11);
        if (a11.b() == 0 || findFirstReferenceChild == null || findLastReferenceChild == null) {
            return 0;
        }
        int findFirstVisibleItemPosition = findFirstVisibleItemPosition();
        return (int) ((Math.abs(this.mOrientationHelper.d(findLastReferenceChild) - this.mOrientationHelper.g(findFirstReferenceChild)) / ((findLastVisibleItemPosition() - findFirstVisibleItemPosition) + 1)) * a11.b());
    }

    private void ensureLayoutState() {
        if (this.mLayoutState == null) {
            this.mLayoutState = new c();
        }
    }

    private void ensureOrientationHelper() {
        if (this.mOrientationHelper != null) {
            return;
        }
        if (isMainAxisDirectionHorizontal()) {
            if (this.mFlexWrap == 0) {
                this.mOrientationHelper = w.a(this);
                this.mSubOrientationHelper = w.c(this);
                return;
            } else {
                this.mOrientationHelper = w.c(this);
                this.mSubOrientationHelper = w.a(this);
                return;
            }
        }
        if (this.mFlexWrap == 0) {
            this.mOrientationHelper = w.c(this);
            this.mSubOrientationHelper = w.a(this);
        } else {
            this.mOrientationHelper = w.a(this);
            this.mSubOrientationHelper = w.c(this);
        }
    }

    private int fill(RecyclerView.v vVar, RecyclerView.A a11, c cVar) {
        if (cVar.f57830f != Integer.MIN_VALUE) {
            if (cVar.f57825a < 0) {
                cVar.f57830f += cVar.f57825a;
            }
            recycleByLayoutState(vVar, cVar);
        }
        int i11 = cVar.f57825a;
        int i12 = cVar.f57825a;
        boolean isMainAxisDirectionHorizontal = isMainAxisDirectionHorizontal();
        int i13 = 0;
        while (true) {
            if ((i12 > 0 || this.mLayoutState.f57826b) && c.m(cVar, a11, this.mFlexLines)) {
                com.google.android.flexbox.c cVar2 = this.mFlexLines.get(cVar.f57827c);
                cVar.f57828d = cVar2.f57850o;
                i13 += layoutFlexLine(cVar2, cVar);
                if (isMainAxisDirectionHorizontal || !this.mIsRtl) {
                    cVar.f57829e = (cVar2.f57842g * cVar.f57832h) + cVar.f57829e;
                } else {
                    cVar.f57829e -= cVar2.f57842g * cVar.f57832h;
                }
                i12 -= cVar2.f57842g;
            }
        }
        cVar.f57825a -= i13;
        if (cVar.f57830f != Integer.MIN_VALUE) {
            cVar.f57830f += i13;
            if (cVar.f57825a < 0) {
                cVar.f57830f += cVar.f57825a;
            }
            recycleByLayoutState(vVar, cVar);
        }
        return i11 - cVar.f57825a;
    }

    private View findFirstReferenceChild(int i11) {
        View findReferenceChild = findReferenceChild(0, getChildCount(), i11);
        if (findReferenceChild == null) {
            return null;
        }
        int i12 = this.mFlexboxHelper.f57856c[getPosition(findReferenceChild)];
        if (i12 == -1) {
            return null;
        }
        return findFirstReferenceViewInLine(findReferenceChild, this.mFlexLines.get(i12));
    }

    private View findFirstReferenceViewInLine(View view, com.google.android.flexbox.c cVar) {
        boolean isMainAxisDirectionHorizontal = isMainAxisDirectionHorizontal();
        int i11 = cVar.f57843h;
        for (int i12 = 1; i12 < i11; i12++) {
            View childAt = getChildAt(i12);
            if (childAt != null && childAt.getVisibility() != 8) {
                if (!this.mIsRtl || isMainAxisDirectionHorizontal) {
                    if (this.mOrientationHelper.g(view) <= this.mOrientationHelper.g(childAt)) {
                    }
                    view = childAt;
                } else {
                    if (this.mOrientationHelper.d(view) >= this.mOrientationHelper.d(childAt)) {
                    }
                    view = childAt;
                }
            }
        }
        return view;
    }

    private View findLastReferenceChild(int i11) {
        View findReferenceChild = findReferenceChild(getChildCount() - 1, -1, i11);
        if (findReferenceChild == null) {
            return null;
        }
        return findLastReferenceViewInLine(findReferenceChild, this.mFlexLines.get(this.mFlexboxHelper.f57856c[getPosition(findReferenceChild)]));
    }

    private View findLastReferenceViewInLine(View view, com.google.android.flexbox.c cVar) {
        boolean isMainAxisDirectionHorizontal = isMainAxisDirectionHorizontal();
        int childCount = (getChildCount() - cVar.f57843h) - 1;
        for (int childCount2 = getChildCount() - 2; childCount2 > childCount; childCount2--) {
            View childAt = getChildAt(childCount2);
            if (childAt != null && childAt.getVisibility() != 8) {
                if (!this.mIsRtl || isMainAxisDirectionHorizontal) {
                    if (this.mOrientationHelper.d(view) >= this.mOrientationHelper.d(childAt)) {
                    }
                    view = childAt;
                } else {
                    if (this.mOrientationHelper.g(view) <= this.mOrientationHelper.g(childAt)) {
                    }
                    view = childAt;
                }
            }
        }
        return view;
    }

    private View findOneVisibleChild(int i11, int i12, boolean z11) {
        int i13 = i12 > i11 ? 1 : -1;
        while (i11 != i12) {
            View childAt = getChildAt(i11);
            if (isViewVisible(childAt, z11)) {
                return childAt;
            }
            i11 += i13;
        }
        return null;
    }

    private View findReferenceChild(int i11, int i12, int i13) {
        ensureOrientationHelper();
        ensureLayoutState();
        int n11 = this.mOrientationHelper.n();
        int i14 = this.mOrientationHelper.i();
        int i15 = i12 > i11 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i11 != i12) {
            View childAt = getChildAt(i11);
            int position = getPosition(childAt);
            if (position >= 0 && position < i13) {
                if (((RecyclerView.p) childAt.getLayoutParams()).b()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.mOrientationHelper.g(childAt) >= n11 && this.mOrientationHelper.d(childAt) <= i14) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i11 += i15;
        }
        return view != null ? view : view2;
    }

    private int fixLayoutEndGap(int i11, RecyclerView.v vVar, RecyclerView.A a11, boolean z11) {
        int i12;
        int i13;
        if (isMainAxisDirectionHorizontal() || !this.mIsRtl) {
            int i14 = this.mOrientationHelper.i() - i11;
            if (i14 <= 0) {
                return 0;
            }
            i12 = -handleScrollingMainOrientation(-i14, vVar, a11);
        } else {
            int n11 = i11 - this.mOrientationHelper.n();
            if (n11 <= 0) {
                return 0;
            }
            i12 = handleScrollingMainOrientation(n11, vVar, a11);
        }
        int i15 = i11 + i12;
        if (!z11 || (i13 = this.mOrientationHelper.i() - i15) <= 0) {
            return i12;
        }
        this.mOrientationHelper.s(i13);
        return i13 + i12;
    }

    private int fixLayoutStartGap(int i11, RecyclerView.v vVar, RecyclerView.A a11, boolean z11) {
        int i12;
        int n11;
        if (isMainAxisDirectionHorizontal() || !this.mIsRtl) {
            int n12 = i11 - this.mOrientationHelper.n();
            if (n12 <= 0) {
                return 0;
            }
            i12 = -handleScrollingMainOrientation(n12, vVar, a11);
        } else {
            int i13 = this.mOrientationHelper.i() - i11;
            if (i13 <= 0) {
                return 0;
            }
            i12 = handleScrollingMainOrientation(-i13, vVar, a11);
        }
        int i14 = i11 + i12;
        if (!z11 || (n11 = i14 - this.mOrientationHelper.n()) <= 0) {
            return i12;
        }
        this.mOrientationHelper.s(-n11);
        return i12 - n11;
    }

    private int getChildBottom(View view) {
        return getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).bottomMargin;
    }

    private View getChildClosestToStart() {
        return getChildAt(0);
    }

    private int getChildLeft(View view) {
        return getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).leftMargin;
    }

    private int getChildRight(View view) {
        return getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).rightMargin;
    }

    private int getChildTop(View view) {
        return getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).topMargin;
    }

    private int handleScrollingMainOrientation(int i11, RecyclerView.v vVar, RecyclerView.A a11) {
        if (getChildCount() != 0 && i11 != 0) {
            ensureOrientationHelper();
            int i12 = 1;
            this.mLayoutState.f57833i = true;
            boolean z11 = !isMainAxisDirectionHorizontal() && this.mIsRtl;
            if (!z11 ? i11 <= 0 : i11 >= 0) {
                i12 = -1;
            }
            int abs = Math.abs(i11);
            updateLayoutState(i12, abs);
            int fill = this.mLayoutState.f57830f + fill(vVar, a11, this.mLayoutState);
            if (fill >= 0) {
                if (z11) {
                    if (abs > fill) {
                        i11 = (-i12) * fill;
                    }
                } else if (abs > fill) {
                    i11 = i12 * fill;
                }
                this.mOrientationHelper.s(-i11);
                this.mLayoutState.f57831g = i11;
                return i11;
            }
        }
        return 0;
    }

    private int handleScrollingSubOrientation(int i11) {
        if (getChildCount() == 0 || i11 == 0) {
            return 0;
        }
        ensureOrientationHelper();
        boolean isMainAxisDirectionHorizontal = isMainAxisDirectionHorizontal();
        View view = this.mParent;
        int width = isMainAxisDirectionHorizontal ? view.getWidth() : view.getHeight();
        int width2 = isMainAxisDirectionHorizontal ? getWidth() : getHeight();
        if (getLayoutDirection() == 1) {
            int abs = Math.abs(i11);
            if (i11 < 0) {
                return -Math.min((width2 + this.mAnchorInfo.f57811d) - width, abs);
            }
            if (this.mAnchorInfo.f57811d + i11 > 0) {
                return -this.mAnchorInfo.f57811d;
            }
        } else {
            if (i11 > 0) {
                return Math.min((width2 - this.mAnchorInfo.f57811d) - width, i11);
            }
            if (this.mAnchorInfo.f57811d + i11 < 0) {
                return -this.mAnchorInfo.f57811d;
            }
        }
        return i11;
    }

    private static boolean isMeasurementUpToDate(int i11, int i12, int i13) {
        int mode = View.MeasureSpec.getMode(i12);
        int size = View.MeasureSpec.getSize(i12);
        if (i13 > 0 && i11 != i13) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i11;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i11;
        }
        return true;
    }

    private boolean isViewVisible(View view, boolean z11) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        int childLeft = getChildLeft(view);
        int childTop = getChildTop(view);
        int childRight = getChildRight(view);
        int childBottom = getChildBottom(view);
        return z11 ? (paddingLeft <= childLeft && width >= childRight) && (paddingTop <= childTop && height >= childBottom) : (childLeft >= width || childRight >= paddingLeft) && (childTop >= height || childBottom >= paddingTop);
    }

    private int layoutFlexLine(com.google.android.flexbox.c cVar, c cVar2) {
        return isMainAxisDirectionHorizontal() ? layoutFlexLineMainAxisHorizontal(cVar, cVar2) : layoutFlexLineMainAxisVertical(cVar, cVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int layoutFlexLineMainAxisHorizontal(com.google.android.flexbox.c cVar, c cVar2) {
        float f7;
        float f11;
        float f12;
        int i11;
        int i12;
        float f13;
        com.google.android.flexbox.c cVar3 = cVar;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int width = getWidth();
        int i13 = cVar2.f57829e;
        if (cVar2.f57832h == -1) {
            i13 -= cVar3.f57842g;
        }
        int i14 = i13;
        int i15 = cVar2.f57828d;
        int i16 = this.mJustifyContent;
        int i17 = 1;
        if (i16 == 0) {
            f7 = paddingLeft;
            f11 = width - paddingRight;
        } else if (i16 == 1) {
            int i18 = cVar3.f57840e;
            float f14 = (width - i18) + paddingRight;
            f11 = i18 - paddingLeft;
            f7 = f14;
        } else {
            if (i16 != 2) {
                if (i16 == 3) {
                    f7 = paddingLeft;
                    f12 = (width - cVar3.f57840e) / (cVar3.f57843h != 1 ? r5 - 1 : 1.0f);
                    f11 = width - paddingRight;
                } else if (i16 == 4) {
                    int i19 = cVar3.f57843h;
                    f12 = i19 != 0 ? (width - cVar3.f57840e) / i19 : 0.0f;
                    float f15 = f12 / 2.0f;
                    f7 = paddingLeft + f15;
                    f11 = (width - paddingRight) - f15;
                } else {
                    if (i16 != 5) {
                        throw new IllegalStateException("Invalid justifyContent is set: " + this.mJustifyContent);
                    }
                    f12 = cVar3.f57843h != 0 ? (width - cVar3.f57840e) / (r5 + 1) : 0.0f;
                    f7 = paddingLeft + f12;
                    f11 = (width - paddingRight) - f12;
                }
                float f16 = f7 - this.mAnchorInfo.f57811d;
                float f17 = f11 - this.mAnchorInfo.f57811d;
                float max = Math.max(f12, 0.0f);
                i11 = cVar3.f57843h;
                int i21 = 0;
                i12 = i15;
                while (i12 < i15 + i11) {
                    float f18 = f17;
                    View flexItemAt = getFlexItemAt(i12);
                    if (flexItemAt == null) {
                        f17 = f18;
                        f13 = max;
                    } else {
                        if (cVar2.f57832h == i17) {
                            calculateItemDecorationsForChild(flexItemAt, TEMP_RECT);
                            addView(flexItemAt);
                        } else {
                            calculateItemDecorationsForChild(flexItemAt, TEMP_RECT);
                            addView(flexItemAt, i21);
                            i21++;
                        }
                        int i22 = i21;
                        com.google.android.flexbox.d dVar = this.mFlexboxHelper;
                        f13 = max;
                        long j11 = dVar.f57857d[i12];
                        int i23 = (int) j11;
                        dVar.getClass();
                        int i24 = (int) (j11 >> 32);
                        if (shouldMeasureChild(flexItemAt, i23, i24, (b) flexItemAt.getLayoutParams())) {
                            flexItemAt.measure(i23, i24);
                        }
                        float leftDecorationWidth = f16 + getLeftDecorationWidth(flexItemAt) + ((ViewGroup.MarginLayoutParams) r10).leftMargin;
                        float rightDecorationWidth = f18 - (getRightDecorationWidth(flexItemAt) + ((ViewGroup.MarginLayoutParams) r10).rightMargin);
                        int topDecorationHeight = getTopDecorationHeight(flexItemAt) + i14;
                        if (this.mIsRtl) {
                            this.mFlexboxHelper.r(flexItemAt, cVar3, Math.round(rightDecorationWidth) - flexItemAt.getMeasuredWidth(), topDecorationHeight, Math.round(rightDecorationWidth), flexItemAt.getMeasuredHeight() + topDecorationHeight);
                            cVar3 = cVar;
                        } else {
                            cVar3 = cVar;
                            this.mFlexboxHelper.r(flexItemAt, cVar3, Math.round(leftDecorationWidth), topDecorationHeight, flexItemAt.getMeasuredWidth() + Math.round(leftDecorationWidth), flexItemAt.getMeasuredHeight() + topDecorationHeight);
                        }
                        f16 = getRightDecorationWidth(flexItemAt) + flexItemAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) r10).rightMargin + f13 + leftDecorationWidth;
                        i21 = i22;
                        f17 = rightDecorationWidth - ((getLeftDecorationWidth(flexItemAt) + (flexItemAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) r10).leftMargin)) + f13);
                    }
                    i12++;
                    max = f13;
                    i17 = 1;
                }
                cVar2.f57827c += this.mLayoutState.f57832h;
                return cVar3.f57842g;
            }
            float f19 = (width - cVar3.f57840e) / 2.0f;
            f7 = paddingLeft + f19;
            f11 = (width - paddingRight) - f19;
        }
        f12 = 0.0f;
        float f162 = f7 - this.mAnchorInfo.f57811d;
        float f172 = f11 - this.mAnchorInfo.f57811d;
        float max2 = Math.max(f12, 0.0f);
        i11 = cVar3.f57843h;
        int i212 = 0;
        i12 = i15;
        while (i12 < i15 + i11) {
        }
        cVar2.f57827c += this.mLayoutState.f57832h;
        return cVar3.f57842g;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int layoutFlexLineMainAxisVertical(com.google.android.flexbox.c cVar, c cVar2) {
        float f7;
        float f11;
        float f12;
        int i11;
        int i12;
        float f13;
        boolean z11;
        com.google.android.flexbox.c cVar3 = cVar;
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i13 = cVar2.f57829e;
        int i14 = cVar2.f57829e;
        if (cVar2.f57832h == -1) {
            int i15 = cVar3.f57842g;
            i13 -= i15;
            i14 += i15;
        }
        int i16 = i13;
        int i17 = i14;
        int i18 = cVar2.f57828d;
        int i19 = this.mJustifyContent;
        boolean z12 = true;
        if (i19 == 0) {
            f7 = paddingTop;
            f11 = height - paddingBottom;
        } else if (i19 == 1) {
            int i21 = cVar3.f57840e;
            float f14 = (height - i21) + paddingBottom;
            f11 = i21 - paddingTop;
            f7 = f14;
        } else {
            if (i19 != 2) {
                if (i19 == 3) {
                    f7 = paddingTop;
                    f12 = (height - cVar3.f57840e) / (cVar3.f57843h != 1 ? r5 - 1 : 1.0f);
                    f11 = height - paddingBottom;
                } else if (i19 == 4) {
                    int i22 = cVar3.f57843h;
                    f12 = i22 != 0 ? (height - cVar3.f57840e) / i22 : 0.0f;
                    float f15 = f12 / 2.0f;
                    f7 = paddingTop + f15;
                    f11 = (height - paddingBottom) - f15;
                } else {
                    if (i19 != 5) {
                        throw new IllegalStateException("Invalid justifyContent is set: " + this.mJustifyContent);
                    }
                    f12 = cVar3.f57843h != 0 ? (height - cVar3.f57840e) / (r5 + 1) : 0.0f;
                    f7 = paddingTop + f12;
                    f11 = (height - paddingBottom) - f12;
                }
                float f16 = f7 - this.mAnchorInfo.f57811d;
                float f17 = f11 - this.mAnchorInfo.f57811d;
                float max = Math.max(f12, 0.0f);
                i11 = cVar3.f57843h;
                int i23 = 0;
                i12 = i18;
                while (i12 < i18 + i11) {
                    float f18 = f17;
                    View flexItemAt = getFlexItemAt(i12);
                    if (flexItemAt == null) {
                        f17 = f18;
                        z11 = z12;
                        f13 = max;
                    } else {
                        com.google.android.flexbox.d dVar = this.mFlexboxHelper;
                        f13 = max;
                        long j11 = dVar.f57857d[i12];
                        int i24 = (int) j11;
                        dVar.getClass();
                        int i25 = (int) (j11 >> 32);
                        if (shouldMeasureChild(flexItemAt, i24, i25, (b) flexItemAt.getLayoutParams())) {
                            flexItemAt.measure(i24, i25);
                        }
                        float topDecorationHeight = f16 + getTopDecorationHeight(flexItemAt) + ((ViewGroup.MarginLayoutParams) r12).topMargin;
                        float bottomDecorationHeight = f18 - (getBottomDecorationHeight(flexItemAt) + ((ViewGroup.MarginLayoutParams) r12).rightMargin);
                        if (cVar2.f57832h == 1) {
                            calculateItemDecorationsForChild(flexItemAt, TEMP_RECT);
                            addView(flexItemAt);
                        } else {
                            calculateItemDecorationsForChild(flexItemAt, TEMP_RECT);
                            addView(flexItemAt, i23);
                            i23++;
                        }
                        int i26 = i23;
                        int leftDecorationWidth = getLeftDecorationWidth(flexItemAt) + i16;
                        int rightDecorationWidth = i17 - getRightDecorationWidth(flexItemAt);
                        boolean z13 = this.mIsRtl;
                        if (!z13) {
                            z11 = true;
                            if (this.mFromBottomToTop) {
                                cVar3 = cVar;
                                this.mFlexboxHelper.s(flexItemAt, cVar3, z13, leftDecorationWidth, Math.round(bottomDecorationHeight) - flexItemAt.getMeasuredHeight(), flexItemAt.getMeasuredWidth() + leftDecorationWidth, Math.round(bottomDecorationHeight));
                            } else {
                                cVar3 = cVar;
                                this.mFlexboxHelper.s(flexItemAt, cVar3, z13, leftDecorationWidth, Math.round(topDecorationHeight), flexItemAt.getMeasuredWidth() + leftDecorationWidth, flexItemAt.getMeasuredHeight() + Math.round(topDecorationHeight));
                            }
                        } else if (this.mFromBottomToTop) {
                            z11 = true;
                            this.mFlexboxHelper.s(flexItemAt, cVar3, z13, rightDecorationWidth - flexItemAt.getMeasuredWidth(), Math.round(bottomDecorationHeight) - flexItemAt.getMeasuredHeight(), rightDecorationWidth, Math.round(bottomDecorationHeight));
                            cVar3 = cVar;
                        } else {
                            z11 = true;
                            cVar3 = cVar;
                            this.mFlexboxHelper.s(flexItemAt, cVar3, z13, rightDecorationWidth - flexItemAt.getMeasuredWidth(), Math.round(topDecorationHeight), rightDecorationWidth, flexItemAt.getMeasuredHeight() + Math.round(topDecorationHeight));
                        }
                        f16 = getBottomDecorationHeight(flexItemAt) + flexItemAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) r12).topMargin + f13 + topDecorationHeight;
                        i23 = i26;
                        f17 = bottomDecorationHeight - ((getTopDecorationHeight(flexItemAt) + (flexItemAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) r12).bottomMargin)) + f13);
                    }
                    i12++;
                    max = f13;
                    z12 = z11;
                }
                cVar2.f57827c += this.mLayoutState.f57832h;
                return cVar3.f57842g;
            }
            float f19 = (height - cVar3.f57840e) / 2.0f;
            f7 = paddingTop + f19;
            f11 = (height - paddingBottom) - f19;
        }
        f12 = 0.0f;
        float f162 = f7 - this.mAnchorInfo.f57811d;
        float f172 = f11 - this.mAnchorInfo.f57811d;
        float max2 = Math.max(f12, 0.0f);
        i11 = cVar3.f57843h;
        int i232 = 0;
        i12 = i18;
        while (i12 < i18 + i11) {
        }
        cVar2.f57827c += this.mLayoutState.f57832h;
        return cVar3.f57842g;
    }

    private void recycleByLayoutState(RecyclerView.v vVar, c cVar) {
        if (cVar.f57833i) {
            if (cVar.f57832h == -1) {
                recycleFlexLinesFromEnd(vVar, cVar);
            } else {
                recycleFlexLinesFromStart(vVar, cVar);
            }
        }
    }

    private void recycleChildren(RecyclerView.v vVar, int i11, int i12) {
        while (i12 >= i11) {
            removeAndRecycleViewAt(i12, vVar);
            i12--;
        }
    }

    private void recycleFlexLinesFromEnd(RecyclerView.v vVar, c cVar) {
        if (cVar.f57830f < 0) {
            return;
        }
        this.mOrientationHelper.h();
        int unused = cVar.f57830f;
        int childCount = getChildCount();
        if (childCount == 0) {
            return;
        }
        int i11 = childCount - 1;
        int i12 = this.mFlexboxHelper.f57856c[getPosition(getChildAt(i11))];
        if (i12 == -1) {
            return;
        }
        com.google.android.flexbox.c cVar2 = this.mFlexLines.get(i12);
        int i13 = i11;
        while (true) {
            if (i13 < 0) {
                break;
            }
            View childAt = getChildAt(i13);
            if (!canViewBeRecycledFromEnd(childAt, cVar.f57830f)) {
                break;
            }
            if (cVar2.f57850o == getPosition(childAt)) {
                if (i12 <= 0) {
                    childCount = i13;
                    break;
                } else {
                    i12 += cVar.f57832h;
                    cVar2 = this.mFlexLines.get(i12);
                    childCount = i13;
                }
            }
            i13--;
        }
        recycleChildren(vVar, childCount, i11);
    }

    private void recycleFlexLinesFromStart(RecyclerView.v vVar, c cVar) {
        int childCount;
        if (cVar.f57830f >= 0 && (childCount = getChildCount()) != 0) {
            int i11 = this.mFlexboxHelper.f57856c[getPosition(getChildAt(0))];
            int i12 = -1;
            if (i11 == -1) {
                return;
            }
            com.google.android.flexbox.c cVar2 = this.mFlexLines.get(i11);
            int i13 = 0;
            while (true) {
                if (i13 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i13);
                if (!canViewBeRecycledFromStart(childAt, cVar.f57830f)) {
                    break;
                }
                if (cVar2.f57851p == getPosition(childAt)) {
                    if (i11 >= this.mFlexLines.size() - 1) {
                        i12 = i13;
                        break;
                    } else {
                        i11 += cVar.f57832h;
                        cVar2 = this.mFlexLines.get(i11);
                        i12 = i13;
                    }
                }
                i13++;
            }
            recycleChildren(vVar, 0, i12);
        }
    }

    private void resolveInfiniteAmount() {
        int heightMode = isMainAxisDirectionHorizontal() ? getHeightMode() : getWidthMode();
        this.mLayoutState.f57826b = heightMode == 0 || heightMode == Integer.MIN_VALUE;
    }

    private void resolveLayoutDirection() {
        int layoutDirection = getLayoutDirection();
        int i11 = this.mFlexDirection;
        if (i11 == 0) {
            this.mIsRtl = layoutDirection == 1;
            this.mFromBottomToTop = this.mFlexWrap == 2;
            return;
        }
        if (i11 == 1) {
            this.mIsRtl = layoutDirection != 1;
            this.mFromBottomToTop = this.mFlexWrap == 2;
            return;
        }
        if (i11 == 2) {
            boolean z11 = layoutDirection == 1;
            this.mIsRtl = z11;
            if (this.mFlexWrap == 2) {
                this.mIsRtl = !z11;
            }
            this.mFromBottomToTop = false;
            return;
        }
        if (i11 != 3) {
            this.mIsRtl = false;
            this.mFromBottomToTop = false;
            return;
        }
        boolean z12 = layoutDirection == 1;
        this.mIsRtl = z12;
        if (this.mFlexWrap == 2) {
            this.mIsRtl = !z12;
        }
        this.mFromBottomToTop = true;
    }

    private boolean shouldMeasureChild(View view, int i11, int i12, RecyclerView.p pVar) {
        return (!view.isLayoutRequested() && isMeasurementCacheEnabled() && isMeasurementUpToDate(view.getWidth(), i11, ((ViewGroup.MarginLayoutParams) pVar).width) && isMeasurementUpToDate(view.getHeight(), i12, ((ViewGroup.MarginLayoutParams) pVar).height)) ? false : true;
    }

    private boolean updateAnchorFromChildren(RecyclerView.A a11, a aVar) {
        if (getChildCount() == 0) {
            return false;
        }
        View findLastReferenceChild = aVar.f57812e ? findLastReferenceChild(a11.b()) : findFirstReferenceChild(a11.b());
        if (findLastReferenceChild == null) {
            return false;
        }
        a.i(aVar, findLastReferenceChild);
        if (a11.d() || !supportsPredictiveItemAnimations()) {
            return true;
        }
        if (this.mOrientationHelper.g(findLastReferenceChild) < this.mOrientationHelper.i() && this.mOrientationHelper.d(findLastReferenceChild) >= this.mOrientationHelper.n()) {
            return true;
        }
        aVar.f57810c = aVar.f57812e ? this.mOrientationHelper.i() : this.mOrientationHelper.n();
        return true;
    }

    private boolean updateAnchorFromPendingState(RecyclerView.A a11, a aVar, d dVar) {
        int i11;
        if (!a11.d() && (i11 = this.mPendingScrollPosition) != -1) {
            if (i11 >= 0 && i11 < a11.b()) {
                aVar.f57808a = this.mPendingScrollPosition;
                aVar.f57809b = this.mFlexboxHelper.f57856c[aVar.f57808a];
                d dVar2 = this.mPendingSavedState;
                if (dVar2 != null && d.f(dVar2, a11.b())) {
                    aVar.f57810c = this.mOrientationHelper.n() + dVar.f57835b;
                    aVar.f57814g = true;
                    aVar.f57809b = -1;
                    return true;
                }
                if (this.mPendingScrollPositionOffset != Integer.MIN_VALUE) {
                    if (isMainAxisDirectionHorizontal() || !this.mIsRtl) {
                        aVar.f57810c = this.mOrientationHelper.n() + this.mPendingScrollPositionOffset;
                        return true;
                    }
                    aVar.f57810c = this.mPendingScrollPositionOffset - this.mOrientationHelper.j();
                    return true;
                }
                View findViewByPosition = findViewByPosition(this.mPendingScrollPosition);
                if (findViewByPosition == null) {
                    if (getChildCount() > 0) {
                        aVar.f57812e = this.mPendingScrollPosition < getPosition(getChildAt(0));
                    }
                    a.e(aVar);
                    return true;
                }
                if (this.mOrientationHelper.e(findViewByPosition) > this.mOrientationHelper.o()) {
                    a.e(aVar);
                    return true;
                }
                if (this.mOrientationHelper.g(findViewByPosition) - this.mOrientationHelper.n() < 0) {
                    aVar.f57810c = this.mOrientationHelper.n();
                    aVar.f57812e = false;
                    return true;
                }
                if (this.mOrientationHelper.i() - this.mOrientationHelper.d(findViewByPosition) >= 0) {
                    aVar.f57810c = aVar.f57812e ? this.mOrientationHelper.p() + this.mOrientationHelper.d(findViewByPosition) : this.mOrientationHelper.g(findViewByPosition);
                    return true;
                }
                aVar.f57810c = this.mOrientationHelper.i();
                aVar.f57812e = true;
                return true;
            }
            this.mPendingScrollPosition = -1;
            this.mPendingScrollPositionOffset = LinearLayoutManager.INVALID_OFFSET;
        }
        return false;
    }

    private void updateAnchorInfoForLayout(RecyclerView.A a11, a aVar) {
        if (updateAnchorFromPendingState(a11, aVar, this.mPendingSavedState) || updateAnchorFromChildren(a11, aVar)) {
            return;
        }
        a.e(aVar);
        aVar.f57808a = 0;
        aVar.f57809b = 0;
    }

    private void updateDirtyPosition(int i11) {
        if (i11 >= findLastVisibleItemPosition()) {
            return;
        }
        int childCount = getChildCount();
        this.mFlexboxHelper.l(childCount);
        this.mFlexboxHelper.m(childCount);
        this.mFlexboxHelper.k(childCount);
        if (i11 >= this.mFlexboxHelper.f57856c.length) {
            return;
        }
        this.mDirtyPosition = i11;
        View childClosestToStart = getChildClosestToStart();
        if (childClosestToStart == null) {
            return;
        }
        this.mPendingScrollPosition = getPosition(childClosestToStart);
        if (isMainAxisDirectionHorizontal() || !this.mIsRtl) {
            this.mPendingScrollPositionOffset = this.mOrientationHelper.g(childClosestToStart) - this.mOrientationHelper.n();
        } else {
            this.mPendingScrollPositionOffset = this.mOrientationHelper.j() + this.mOrientationHelper.d(childClosestToStart);
        }
    }

    private void updateFlexLines(int i11) {
        boolean z11;
        int i12;
        int i13;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getWidth(), getWidthMode());
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getHeight(), getHeightMode());
        int width = getWidth();
        int height = getHeight();
        if (isMainAxisDirectionHorizontal()) {
            int i14 = this.mLastWidth;
            z11 = (i14 == Integer.MIN_VALUE || i14 == width) ? false : true;
            i12 = this.mLayoutState.f57826b ? this.mContext.getResources().getDisplayMetrics().heightPixels : this.mLayoutState.f57825a;
        } else {
            int i15 = this.mLastHeight;
            z11 = (i15 == Integer.MIN_VALUE || i15 == height) ? false : true;
            i12 = this.mLayoutState.f57826b ? this.mContext.getResources().getDisplayMetrics().widthPixels : this.mLayoutState.f57825a;
        }
        int i16 = i12;
        this.mLastWidth = width;
        this.mLastHeight = height;
        int i17 = this.mDirtyPosition;
        if (i17 == -1 && (this.mPendingScrollPosition != -1 || z11)) {
            if (this.mAnchorInfo.f57812e) {
                return;
            }
            this.mFlexLines.clear();
            d.a aVar = this.mFlexLinesResult;
            aVar.f57859a = null;
            aVar.f57860b = 0;
            if (isMainAxisDirectionHorizontal()) {
                this.mFlexboxHelper.b(this.mFlexLinesResult, makeMeasureSpec, makeMeasureSpec2, i16, 0, this.mAnchorInfo.f57808a, this.mFlexLines);
            } else {
                this.mFlexboxHelper.b(this.mFlexLinesResult, makeMeasureSpec2, makeMeasureSpec, i16, 0, this.mAnchorInfo.f57808a, this.mFlexLines);
                makeMeasureSpec2 = makeMeasureSpec2;
                makeMeasureSpec = makeMeasureSpec;
            }
            this.mFlexLines = this.mFlexLinesResult.f57859a;
            this.mFlexboxHelper.j(makeMeasureSpec, makeMeasureSpec2, 0);
            this.mFlexboxHelper.x(0);
            a aVar2 = this.mAnchorInfo;
            aVar2.f57809b = this.mFlexboxHelper.f57856c[aVar2.f57808a];
            this.mLayoutState.f57827c = this.mAnchorInfo.f57809b;
            return;
        }
        int min = i17 != -1 ? Math.min(i17, this.mAnchorInfo.f57808a) : this.mAnchorInfo.f57808a;
        d.a aVar3 = this.mFlexLinesResult;
        aVar3.f57859a = null;
        aVar3.f57860b = 0;
        if (isMainAxisDirectionHorizontal()) {
            if (this.mFlexLines.size() > 0) {
                this.mFlexboxHelper.d(min, this.mFlexLines);
                this.mFlexboxHelper.b(this.mFlexLinesResult, makeMeasureSpec, makeMeasureSpec2, i16, min, this.mAnchorInfo.f57808a, this.mFlexLines);
                i13 = min;
                this.mFlexLines = this.mFlexLinesResult.f57859a;
                this.mFlexboxHelper.j(makeMeasureSpec, makeMeasureSpec2, i13);
                this.mFlexboxHelper.x(i13);
            }
            i13 = min;
            this.mFlexboxHelper.k(i11);
            this.mFlexboxHelper.b(this.mFlexLinesResult, makeMeasureSpec, makeMeasureSpec2, i16, 0, -1, this.mFlexLines);
            this.mFlexLines = this.mFlexLinesResult.f57859a;
            this.mFlexboxHelper.j(makeMeasureSpec, makeMeasureSpec2, i13);
            this.mFlexboxHelper.x(i13);
        }
        i13 = min;
        if (this.mFlexLines.size() <= 0) {
            this.mFlexboxHelper.k(i11);
            this.mFlexboxHelper.b(this.mFlexLinesResult, makeMeasureSpec2, makeMeasureSpec, i16, 0, -1, this.mFlexLines);
            makeMeasureSpec2 = makeMeasureSpec2;
            makeMeasureSpec = makeMeasureSpec;
            this.mFlexLines = this.mFlexLinesResult.f57859a;
            this.mFlexboxHelper.j(makeMeasureSpec, makeMeasureSpec2, i13);
            this.mFlexboxHelper.x(i13);
        }
        this.mFlexboxHelper.d(i13, this.mFlexLines);
        min = i13;
        this.mFlexboxHelper.b(this.mFlexLinesResult, makeMeasureSpec2, makeMeasureSpec, i16, min, this.mAnchorInfo.f57808a, this.mFlexLines);
        makeMeasureSpec2 = makeMeasureSpec2;
        makeMeasureSpec = makeMeasureSpec;
        i13 = min;
        this.mFlexLines = this.mFlexLinesResult.f57859a;
        this.mFlexboxHelper.j(makeMeasureSpec, makeMeasureSpec2, i13);
        this.mFlexboxHelper.x(i13);
    }

    private void updateLayoutState(int i11, int i12) {
        this.mLayoutState.f57832h = i11;
        boolean isMainAxisDirectionHorizontal = isMainAxisDirectionHorizontal();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getWidth(), getWidthMode());
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getHeight(), getHeightMode());
        boolean z11 = !isMainAxisDirectionHorizontal && this.mIsRtl;
        if (i11 == 1) {
            View childAt = getChildAt(getChildCount() - 1);
            this.mLayoutState.f57829e = this.mOrientationHelper.d(childAt);
            int position = getPosition(childAt);
            View findLastReferenceViewInLine = findLastReferenceViewInLine(childAt, this.mFlexLines.get(this.mFlexboxHelper.f57856c[position]));
            this.mLayoutState.getClass();
            c cVar = this.mLayoutState;
            cVar.getClass();
            cVar.f57828d = position + 1;
            if (this.mFlexboxHelper.f57856c.length <= this.mLayoutState.f57828d) {
                this.mLayoutState.f57827c = -1;
            } else {
                c cVar2 = this.mLayoutState;
                cVar2.f57827c = this.mFlexboxHelper.f57856c[cVar2.f57828d];
            }
            if (z11) {
                this.mLayoutState.f57829e = this.mOrientationHelper.g(findLastReferenceViewInLine);
                this.mLayoutState.f57830f = this.mOrientationHelper.n() + (-this.mOrientationHelper.g(findLastReferenceViewInLine));
                c cVar3 = this.mLayoutState;
                cVar3.f57830f = cVar3.f57830f >= 0 ? this.mLayoutState.f57830f : 0;
            } else {
                this.mLayoutState.f57829e = this.mOrientationHelper.d(findLastReferenceViewInLine);
                this.mLayoutState.f57830f = this.mOrientationHelper.d(findLastReferenceViewInLine) - this.mOrientationHelper.i();
            }
            if ((this.mLayoutState.f57827c == -1 || this.mLayoutState.f57827c > this.mFlexLines.size() - 1) && this.mLayoutState.f57828d <= getFlexItemCount()) {
                int i13 = i12 - this.mLayoutState.f57830f;
                d.a aVar = this.mFlexLinesResult;
                aVar.f57859a = null;
                aVar.f57860b = 0;
                if (i13 > 0) {
                    if (isMainAxisDirectionHorizontal) {
                        this.mFlexboxHelper.b(aVar, makeMeasureSpec, makeMeasureSpec2, i13, this.mLayoutState.f57828d, -1, this.mFlexLines);
                    } else {
                        this.mFlexboxHelper.b(aVar, makeMeasureSpec2, makeMeasureSpec, i13, this.mLayoutState.f57828d, -1, this.mFlexLines);
                        makeMeasureSpec2 = makeMeasureSpec2;
                        makeMeasureSpec = makeMeasureSpec;
                    }
                    this.mFlexboxHelper.j(makeMeasureSpec, makeMeasureSpec2, this.mLayoutState.f57828d);
                    this.mFlexboxHelper.x(this.mLayoutState.f57828d);
                }
            }
        } else {
            View childAt2 = getChildAt(0);
            this.mLayoutState.f57829e = this.mOrientationHelper.g(childAt2);
            int position2 = getPosition(childAt2);
            View findFirstReferenceViewInLine = findFirstReferenceViewInLine(childAt2, this.mFlexLines.get(this.mFlexboxHelper.f57856c[position2]));
            this.mLayoutState.getClass();
            int i14 = this.mFlexboxHelper.f57856c[position2];
            if (i14 == -1) {
                i14 = 0;
            }
            if (i14 > 0) {
                this.mLayoutState.f57828d = position2 - this.mFlexLines.get(i14 - 1).f57843h;
            } else {
                this.mLayoutState.f57828d = -1;
            }
            this.mLayoutState.f57827c = i14 > 0 ? i14 - 1 : 0;
            if (z11) {
                this.mLayoutState.f57829e = this.mOrientationHelper.d(findFirstReferenceViewInLine);
                this.mLayoutState.f57830f = this.mOrientationHelper.d(findFirstReferenceViewInLine) - this.mOrientationHelper.i();
                c cVar4 = this.mLayoutState;
                cVar4.f57830f = cVar4.f57830f >= 0 ? this.mLayoutState.f57830f : 0;
            } else {
                this.mLayoutState.f57829e = this.mOrientationHelper.g(findFirstReferenceViewInLine);
                this.mLayoutState.f57830f = this.mOrientationHelper.n() + (-this.mOrientationHelper.g(findFirstReferenceViewInLine));
            }
        }
        c cVar5 = this.mLayoutState;
        cVar5.f57825a = i12 - cVar5.f57830f;
    }

    private void updateLayoutStateToFillEnd(a aVar, boolean z11, boolean z12) {
        if (z12) {
            resolveInfiniteAmount();
        } else {
            this.mLayoutState.f57826b = false;
        }
        if (isMainAxisDirectionHorizontal() || !this.mIsRtl) {
            this.mLayoutState.f57825a = this.mOrientationHelper.i() - aVar.f57810c;
        } else {
            this.mLayoutState.f57825a = aVar.f57810c - getPaddingRight();
        }
        this.mLayoutState.f57828d = aVar.f57808a;
        this.mLayoutState.getClass();
        this.mLayoutState.f57832h = 1;
        this.mLayoutState.f57829e = aVar.f57810c;
        this.mLayoutState.f57830f = LinearLayoutManager.INVALID_OFFSET;
        this.mLayoutState.f57827c = aVar.f57809b;
        if (!z11 || this.mFlexLines.size() <= 1 || aVar.f57809b < 0 || aVar.f57809b >= this.mFlexLines.size() - 1) {
            return;
        }
        com.google.android.flexbox.c cVar = this.mFlexLines.get(aVar.f57809b);
        c.i(this.mLayoutState);
        this.mLayoutState.f57828d += cVar.f57843h;
    }

    private void updateLayoutStateToFillStart(a aVar, boolean z11, boolean z12) {
        if (z12) {
            resolveInfiniteAmount();
        } else {
            this.mLayoutState.f57826b = false;
        }
        if (isMainAxisDirectionHorizontal() || !this.mIsRtl) {
            this.mLayoutState.f57825a = aVar.f57810c - this.mOrientationHelper.n();
        } else {
            this.mLayoutState.f57825a = (this.mParent.getWidth() - aVar.f57810c) - this.mOrientationHelper.n();
        }
        this.mLayoutState.f57828d = aVar.f57808a;
        this.mLayoutState.getClass();
        this.mLayoutState.f57832h = -1;
        this.mLayoutState.f57829e = aVar.f57810c;
        this.mLayoutState.f57830f = LinearLayoutManager.INVALID_OFFSET;
        this.mLayoutState.f57827c = aVar.f57809b;
        if (!z11 || aVar.f57809b <= 0 || this.mFlexLines.size() <= aVar.f57809b) {
            return;
        }
        com.google.android.flexbox.c cVar = this.mFlexLines.get(aVar.f57809b);
        c.j(this.mLayoutState);
        this.mLayoutState.f57828d -= cVar.f57843h;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean canScrollHorizontally() {
        if (this.mFlexWrap == 0) {
            return isMainAxisDirectionHorizontal();
        }
        if (!isMainAxisDirectionHorizontal()) {
            return true;
        }
        int width = getWidth();
        View view = this.mParent;
        return width > (view != null ? view.getWidth() : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean canScrollVertically() {
        if (this.mFlexWrap == 0) {
            return !isMainAxisDirectionHorizontal();
        }
        if (!isMainAxisDirectionHorizontal()) {
            int height = getHeight();
            View view = this.mParent;
            if (height <= (view != null ? view.getHeight() : 0)) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean checkLayoutParams(RecyclerView.p pVar) {
        return pVar instanceof b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int computeHorizontalScrollExtent(RecyclerView.A a11) {
        return computeScrollExtent(a11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int computeHorizontalScrollOffset(RecyclerView.A a11) {
        return computeScrollOffset(a11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int computeHorizontalScrollRange(RecyclerView.A a11) {
        return computeScrollRange(a11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z.b
    public PointF computeScrollVectorForPosition(int i11) {
        if (getChildCount() == 0) {
            return null;
        }
        int i12 = i11 < getPosition(getChildAt(0)) ? -1 : 1;
        return isMainAxisDirectionHorizontal() ? new PointF(0.0f, i12) : new PointF(i12, 0.0f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int computeVerticalScrollExtent(RecyclerView.A a11) {
        return computeScrollExtent(a11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int computeVerticalScrollOffset(RecyclerView.A a11) {
        return computeScrollOffset(a11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int computeVerticalScrollRange(RecyclerView.A a11) {
        return computeScrollRange(a11);
    }

    public int findFirstVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(0, getChildCount(), false);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public int findLastVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, false);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // com.google.android.flexbox.a
    public int getAlignContent() {
        return 5;
    }

    @Override // com.google.android.flexbox.a
    public int getAlignItems() {
        return this.mAlignItems;
    }

    @Override // com.google.android.flexbox.a
    public int getChildHeightMeasureSpec(int i11, int i12, int i13) {
        return RecyclerView.o.getChildMeasureSpec(getHeight(), getHeightMode(), i12, i13, canScrollVertically());
    }

    @Override // com.google.android.flexbox.a
    public int getChildWidthMeasureSpec(int i11, int i12, int i13) {
        return RecyclerView.o.getChildMeasureSpec(getWidth(), getWidthMode(), i12, i13, canScrollHorizontally());
    }

    @Override // com.google.android.flexbox.a
    public int getDecorationLengthCrossAxis(View view) {
        int leftDecorationWidth;
        int rightDecorationWidth;
        if (isMainAxisDirectionHorizontal()) {
            leftDecorationWidth = getTopDecorationHeight(view);
            rightDecorationWidth = getBottomDecorationHeight(view);
        } else {
            leftDecorationWidth = getLeftDecorationWidth(view);
            rightDecorationWidth = getRightDecorationWidth(view);
        }
        return rightDecorationWidth + leftDecorationWidth;
    }

    @Override // com.google.android.flexbox.a
    public int getDecorationLengthMainAxis(View view, int i11, int i12) {
        int topDecorationHeight;
        int bottomDecorationHeight;
        if (isMainAxisDirectionHorizontal()) {
            topDecorationHeight = getLeftDecorationWidth(view);
            bottomDecorationHeight = getRightDecorationWidth(view);
        } else {
            topDecorationHeight = getTopDecorationHeight(view);
            bottomDecorationHeight = getBottomDecorationHeight(view);
        }
        return bottomDecorationHeight + topDecorationHeight;
    }

    @Override // com.google.android.flexbox.a
    public int getFlexDirection() {
        return this.mFlexDirection;
    }

    @Override // com.google.android.flexbox.a
    public View getFlexItemAt(int i11) {
        View view = this.mViewCache.get(i11);
        return view != null ? view : this.mRecycler.g(i11);
    }

    @Override // com.google.android.flexbox.a
    public int getFlexItemCount() {
        return this.mState.b();
    }

    public List<com.google.android.flexbox.c> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.mFlexLines.size());
        int size = this.mFlexLines.size();
        for (int i11 = 0; i11 < size; i11++) {
            com.google.android.flexbox.c cVar = this.mFlexLines.get(i11);
            if (cVar.f57843h != 0) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.flexbox.a
    public List<com.google.android.flexbox.c> getFlexLinesInternal() {
        return this.mFlexLines;
    }

    @Override // com.google.android.flexbox.a
    public int getFlexWrap() {
        return this.mFlexWrap;
    }

    @Override // com.google.android.flexbox.a
    public int getLargestMainSize() {
        if (this.mFlexLines.size() == 0) {
            return 0;
        }
        int size = this.mFlexLines.size();
        int i11 = LinearLayoutManager.INVALID_OFFSET;
        for (int i12 = 0; i12 < size; i12++) {
            i11 = Math.max(i11, this.mFlexLines.get(i12).f57840e);
        }
        return i11;
    }

    @Override // com.google.android.flexbox.a
    public int getMaxLine() {
        return this.mMaxLine;
    }

    int getPositionToFlexLineIndex(int i11) {
        return this.mFlexboxHelper.f57856c[i11];
    }

    @Override // com.google.android.flexbox.a
    public View getReorderedFlexItemAt(int i11) {
        return getFlexItemAt(i11);
    }

    @Override // com.google.android.flexbox.a
    public int getSumOfCrossSize() {
        int size = this.mFlexLines.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += this.mFlexLines.get(i12).f57842g;
        }
        return i11;
    }

    boolean isLayoutRtl() {
        return this.mIsRtl;
    }

    @Override // com.google.android.flexbox.a
    public boolean isMainAxisDirectionHorizontal() {
        int i11 = this.mFlexDirection;
        return i11 == 0 || i11 == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onAdapterChanged(RecyclerView.g gVar, RecyclerView.g gVar2) {
        removeAllViews();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.mParent = (View) recyclerView.getParent();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.v vVar) {
        super.onDetachedFromWindow(recyclerView, vVar);
        if (this.mRecycleChildrenOnDetach) {
            removeAndRecycleAllViews(vVar);
            vVar.c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onItemsAdded(@NonNull RecyclerView recyclerView, int i11, int i12) {
        super.onItemsAdded(recyclerView, i11, i12);
        updateDirtyPosition(i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onItemsMoved(@NonNull RecyclerView recyclerView, int i11, int i12, int i13) {
        super.onItemsMoved(recyclerView, i11, i12, i13);
        updateDirtyPosition(Math.min(i11, i12));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onItemsRemoved(@NonNull RecyclerView recyclerView, int i11, int i12) {
        super.onItemsRemoved(recyclerView, i11, i12);
        updateDirtyPosition(i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onItemsUpdated(@NonNull RecyclerView recyclerView, int i11, int i12, Object obj) {
        super.onItemsUpdated(recyclerView, i11, i12, obj);
        updateDirtyPosition(i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onLayoutChildren(RecyclerView.v vVar, RecyclerView.A a11) {
        int i11;
        int i12;
        this.mRecycler = vVar;
        this.mState = a11;
        int b11 = a11.b();
        if (b11 == 0 && a11.d()) {
            return;
        }
        resolveLayoutDirection();
        ensureOrientationHelper();
        ensureLayoutState();
        this.mFlexboxHelper.l(b11);
        this.mFlexboxHelper.m(b11);
        this.mFlexboxHelper.k(b11);
        this.mLayoutState.f57833i = false;
        d dVar = this.mPendingSavedState;
        if (dVar != null && d.f(dVar, b11)) {
            this.mPendingScrollPosition = this.mPendingSavedState.f57834a;
        }
        if (!this.mAnchorInfo.f57813f || this.mPendingScrollPosition != -1 || this.mPendingSavedState != null) {
            a.n(this.mAnchorInfo);
            updateAnchorInfoForLayout(a11, this.mAnchorInfo);
            this.mAnchorInfo.f57813f = true;
        }
        detachAndScrapAttachedViews(vVar);
        if (this.mAnchorInfo.f57812e) {
            updateLayoutStateToFillStart(this.mAnchorInfo, false, true);
        } else {
            updateLayoutStateToFillEnd(this.mAnchorInfo, false, true);
        }
        updateFlexLines(b11);
        if (this.mAnchorInfo.f57812e) {
            fill(vVar, a11, this.mLayoutState);
            i12 = this.mLayoutState.f57829e;
            updateLayoutStateToFillEnd(this.mAnchorInfo, true, false);
            fill(vVar, a11, this.mLayoutState);
            i11 = this.mLayoutState.f57829e;
        } else {
            fill(vVar, a11, this.mLayoutState);
            i11 = this.mLayoutState.f57829e;
            updateLayoutStateToFillStart(this.mAnchorInfo, true, false);
            fill(vVar, a11, this.mLayoutState);
            i12 = this.mLayoutState.f57829e;
        }
        if (getChildCount() > 0) {
            if (this.mAnchorInfo.f57812e) {
                fixLayoutStartGap(i12 + fixLayoutEndGap(i11, vVar, a11, true), vVar, a11, false);
            } else {
                fixLayoutEndGap(i11 + fixLayoutStartGap(i12, vVar, a11, true), vVar, a11, false);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onLayoutCompleted(RecyclerView.A a11) {
        super.onLayoutCompleted(a11);
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = LinearLayoutManager.INVALID_OFFSET;
        this.mDirtyPosition = -1;
        a.n(this.mAnchorInfo);
        this.mViewCache.clear();
    }

    @Override // com.google.android.flexbox.a
    public void onNewFlexItemAdded(View view, int i11, int i12, com.google.android.flexbox.c cVar) {
        calculateItemDecorationsForChild(view, TEMP_RECT);
        if (isMainAxisDirectionHorizontal()) {
            int rightDecorationWidth = getRightDecorationWidth(view) + getLeftDecorationWidth(view);
            cVar.f57840e += rightDecorationWidth;
            cVar.f57841f += rightDecorationWidth;
            return;
        }
        int bottomDecorationHeight = getBottomDecorationHeight(view) + getTopDecorationHeight(view);
        cVar.f57840e += bottomDecorationHeight;
        cVar.f57841f += bottomDecorationHeight;
    }

    @Override // com.google.android.flexbox.a
    public void onNewFlexLineAdded(com.google.android.flexbox.c cVar) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof d) {
            this.mPendingSavedState = (d) parcelable;
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public Parcelable onSaveInstanceState() {
        d dVar = this.mPendingSavedState;
        if (dVar != null) {
            return new d(dVar);
        }
        d dVar2 = new d();
        if (getChildCount() <= 0) {
            d.e(dVar2);
            return dVar2;
        }
        View childClosestToStart = getChildClosestToStart();
        dVar2.f57834a = getPosition(childClosestToStart);
        dVar2.f57835b = this.mOrientationHelper.g(childClosestToStart) - this.mOrientationHelper.n();
        return dVar2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int scrollHorizontallyBy(int i11, RecyclerView.v vVar, RecyclerView.A a11) {
        if (!isMainAxisDirectionHorizontal() || (this.mFlexWrap == 0 && isMainAxisDirectionHorizontal())) {
            int handleScrollingMainOrientation = handleScrollingMainOrientation(i11, vVar, a11);
            this.mViewCache.clear();
            return handleScrollingMainOrientation;
        }
        int handleScrollingSubOrientation = handleScrollingSubOrientation(i11);
        this.mAnchorInfo.f57811d += handleScrollingSubOrientation;
        this.mSubOrientationHelper.s(-handleScrollingSubOrientation);
        return handleScrollingSubOrientation;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void scrollToPosition(int i11) {
        this.mPendingScrollPosition = i11;
        this.mPendingScrollPositionOffset = LinearLayoutManager.INVALID_OFFSET;
        d dVar = this.mPendingSavedState;
        if (dVar != null) {
            d.e(dVar);
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int scrollVerticallyBy(int i11, RecyclerView.v vVar, RecyclerView.A a11) {
        if (isMainAxisDirectionHorizontal() || (this.mFlexWrap == 0 && !isMainAxisDirectionHorizontal())) {
            int handleScrollingMainOrientation = handleScrollingMainOrientation(i11, vVar, a11);
            this.mViewCache.clear();
            return handleScrollingMainOrientation;
        }
        int handleScrollingSubOrientation = handleScrollingSubOrientation(i11);
        this.mAnchorInfo.f57811d += handleScrollingSubOrientation;
        this.mSubOrientationHelper.s(-handleScrollingSubOrientation);
        return handleScrollingSubOrientation;
    }

    public void setAlignItems(int i11) {
        int i12 = this.mAlignItems;
        if (i12 != i11) {
            if (i12 == 4 || i11 == 4) {
                removeAllViews();
                clearFlexLines();
            }
            this.mAlignItems = i11;
            requestLayout();
        }
    }

    public void setFlexDirection(int i11) {
        if (this.mFlexDirection != i11) {
            removeAllViews();
            this.mFlexDirection = i11;
            this.mOrientationHelper = null;
            this.mSubOrientationHelper = null;
            clearFlexLines();
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.a
    public void setFlexLines(List<com.google.android.flexbox.c> list) {
        this.mFlexLines = list;
    }

    public void setFlexWrap(int i11) {
        if (i11 == 2) {
            throw new UnsupportedOperationException("wrap_reverse is not supported in FlexboxLayoutManager");
        }
        int i12 = this.mFlexWrap;
        if (i12 != i11) {
            if (i12 == 0 || i11 == 0) {
                removeAllViews();
                clearFlexLines();
            }
            this.mFlexWrap = i11;
            this.mOrientationHelper = null;
            this.mSubOrientationHelper = null;
            requestLayout();
        }
    }

    public void setJustifyContent(int i11) {
        if (this.mJustifyContent != i11) {
            this.mJustifyContent = i11;
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.A a11, int i11) {
        r rVar = new r(recyclerView.getContext());
        rVar.setTargetPosition(i11);
        startSmoothScroll(rVar);
    }

    @Override // com.google.android.flexbox.a
    public void updateViewCache(int i11, View view) {
        this.mViewCache.put(i11, view);
    }

    public FlexboxLayoutManager(Context context, int i11, int i12) {
        this.mMaxLine = -1;
        this.mFlexLines = new ArrayList();
        this.mFlexboxHelper = new com.google.android.flexbox.d(this);
        this.mAnchorInfo = new a();
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = LinearLayoutManager.INVALID_OFFSET;
        this.mLastWidth = LinearLayoutManager.INVALID_OFFSET;
        this.mLastHeight = LinearLayoutManager.INVALID_OFFSET;
        this.mViewCache = new SparseArray<>();
        this.mDirtyPosition = -1;
        this.mFlexLinesResult = new d.a();
        setFlexDirection(i11);
        setFlexWrap(i12);
        setAlignItems(4);
        setAutoMeasureEnabled(true);
        this.mContext = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onItemsUpdated(@NonNull RecyclerView recyclerView, int i11, int i12) {
        super.onItemsUpdated(recyclerView, i11, i12);
        updateDirtyPosition(i11);
    }

    public static class b extends RecyclerView.p implements com.google.android.flexbox.b {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: e, reason: collision with root package name */
        private float f57816e;

        /* renamed from: f, reason: collision with root package name */
        private float f57817f;

        /* renamed from: g, reason: collision with root package name */
        private int f57818g;

        /* renamed from: h, reason: collision with root package name */
        private float f57819h;

        /* renamed from: i, reason: collision with root package name */
        private int f57820i;

        /* renamed from: j, reason: collision with root package name */
        private int f57821j;

        /* renamed from: k, reason: collision with root package name */
        private int f57822k;

        /* renamed from: l, reason: collision with root package name */
        private int f57823l;

        /* renamed from: m, reason: collision with root package name */
        private boolean f57824m;

        static class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i11) {
                return new b[i11];
            }
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f57816e = 0.0f;
            this.f57817f = 1.0f;
            this.f57818g = -1;
            this.f57819h = -1.0f;
            this.f57822k = 16777215;
            this.f57823l = 16777215;
        }

        @Override // com.google.android.flexbox.b
        public final void J1(int i11) {
            this.f57820i = i11;
        }

        @Override // com.google.android.flexbox.b
        public final int M1() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.google.android.flexbox.b
        public final int O() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.google.android.flexbox.b
        public final int T0() {
            return this.f57818g;
        }

        @Override // com.google.android.flexbox.b
        public final int V1() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.google.android.flexbox.b
        public final float W0() {
            return this.f57817f;
        }

        @Override // com.google.android.flexbox.b
        public final int X1() {
            return this.f57823l;
        }

        public final void c() {
            this.f57818g = 0;
        }

        public final void d() {
            this.f57816e = 1.0f;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final void e() {
            this.f57817f = 0.0f;
        }

        public final void f(int i11) {
            this.f57822k = i11;
        }

        @Override // com.google.android.flexbox.b
        public final int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.b
        public final int getMinHeight() {
            return this.f57821j;
        }

        @Override // com.google.android.flexbox.b
        public final int getMinWidth() {
            return this.f57820i;
        }

        @Override // com.google.android.flexbox.b
        public final int getOrder() {
            return 1;
        }

        @Override // com.google.android.flexbox.b
        public final int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.b
        public final void j1(int i11) {
            this.f57821j = i11;
        }

        @Override // com.google.android.flexbox.b
        public final float k1() {
            return this.f57816e;
        }

        @Override // com.google.android.flexbox.b
        public final float l1() {
            return this.f57819h;
        }

        @Override // com.google.android.flexbox.b
        public final boolean n1() {
            return this.f57824m;
        }

        @Override // com.google.android.flexbox.b
        public final int o0() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.google.android.flexbox.b
        public final int t1() {
            return this.f57822k;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i11) {
            parcel.writeFloat(this.f57816e);
            parcel.writeFloat(this.f57817f);
            parcel.writeInt(this.f57818g);
            parcel.writeFloat(this.f57819h);
            parcel.writeInt(this.f57820i);
            parcel.writeInt(this.f57821j);
            parcel.writeInt(this.f57822k);
            parcel.writeInt(this.f57823l);
            parcel.writeByte(this.f57824m ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        public b(int i11, int i12) {
            super(i11, i12);
            this.f57816e = 0.0f;
            this.f57817f = 1.0f;
            this.f57818g = -1;
            this.f57819h = -1.0f;
            this.f57822k = 16777215;
            this.f57823l = 16777215;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f57816e = 0.0f;
            this.f57817f = 1.0f;
            this.f57818g = -1;
            this.f57819h = -1.0f;
            this.f57822k = 16777215;
            this.f57823l = 16777215;
        }

        protected b(Parcel parcel) {
            super(-2, -2);
            this.f57816e = 0.0f;
            this.f57817f = 1.0f;
            this.f57818g = -1;
            this.f57819h = -1.0f;
            this.f57822k = 16777215;
            this.f57823l = 16777215;
            this.f57816e = parcel.readFloat();
            this.f57817f = parcel.readFloat();
            this.f57818g = parcel.readInt();
            this.f57819h = parcel.readFloat();
            this.f57820i = parcel.readInt();
            this.f57821j = parcel.readInt();
            this.f57822k = parcel.readInt();
            this.f57823l = parcel.readInt();
            this.f57824m = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i11, int i12) {
        this.mMaxLine = -1;
        this.mFlexLines = new ArrayList();
        this.mFlexboxHelper = new com.google.android.flexbox.d(this);
        this.mAnchorInfo = new a();
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = LinearLayoutManager.INVALID_OFFSET;
        this.mLastWidth = LinearLayoutManager.INVALID_OFFSET;
        this.mLastHeight = LinearLayoutManager.INVALID_OFFSET;
        this.mViewCache = new SparseArray<>();
        this.mDirtyPosition = -1;
        this.mFlexLinesResult = new d.a();
        RecyclerView.o.d properties = RecyclerView.o.getProperties(context, attributeSet, i11, i12);
        int i13 = properties.f44743a;
        if (i13 != 0) {
            if (i13 == 1) {
                if (properties.f44745c) {
                    setFlexDirection(3);
                } else {
                    setFlexDirection(2);
                }
            }
        } else if (properties.f44745c) {
            setFlexDirection(1);
        } else {
            setFlexDirection(0);
        }
        setFlexWrap(1);
        setAlignItems(4);
        setAutoMeasureEnabled(true);
        this.mContext = context;
    }
}
