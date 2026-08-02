package com.google.android.flexbox;

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
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d0;
import androidx.recyclerview.widget.e0;
import androidx.recyclerview.widget.f0;
import androidx.recyclerview.widget.v;
import com.google.android.flexbox.b;
import com.unity3d.services.UnityAdsConstants;
import defpackage.q0;
import java.util.ArrayList;
import java.util.List;
import xsna.eor;
import xsna.vu5;

/* loaded from: classes12.dex */
public class FlexboxLayoutManager extends RecyclerView.o implements eor, RecyclerView.z.b {
    public static final Rect A = new Rect();
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean g;
    public boolean h;
    public RecyclerView.v k;
    public RecyclerView.a0 l;
    public b m;
    public f0 o;
    public f0 p;
    public SavedState q;
    public final Context w;
    public View x;
    public final int f = -1;
    public List<com.google.android.flexbox.a> i = new ArrayList();
    public final com.google.android.flexbox.b j = new com.google.android.flexbox.b(this);
    public final a n = new a();
    public int r = -1;
    public int s = Integer.MIN_VALUE;
    public int t = Integer.MIN_VALUE;
    public int u = Integer.MIN_VALUE;
    public final SparseArray<View> v = new SparseArray<>();
    public int y = -1;
    public final b.a z = new b.a();

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int b;
        public int c;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState();
                savedState.b = parcel.readInt();
                savedState.c = parcel.readInt();
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @NonNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("SavedState{mAnchorPosition=");
            sb.append(this.b);
            sb.append(", mAnchorOffset=");
            return vu5.b(sb, this.c, '}');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
        }
    }

    public class a {
        public int a;
        public int b;
        public int c;
        public int d = 0;
        public boolean e;
        public boolean f;
        public boolean g;

        public a() {
        }

        public static void a(a aVar) {
            FlexboxLayoutManager flexboxLayoutManager = FlexboxLayoutManager.this;
            if (flexboxLayoutManager.m() || !flexboxLayoutManager.g) {
                aVar.c = aVar.e ? flexboxLayoutManager.o.g() : flexboxLayoutManager.o.k();
            } else {
                aVar.c = aVar.e ? flexboxLayoutManager.o.g() : flexboxLayoutManager.getWidth() - flexboxLayoutManager.o.k();
            }
        }

        public static void b(a aVar) {
            aVar.a = -1;
            aVar.b = -1;
            aVar.c = Integer.MIN_VALUE;
            aVar.f = false;
            aVar.g = false;
            FlexboxLayoutManager flexboxLayoutManager = FlexboxLayoutManager.this;
            if (flexboxLayoutManager.m()) {
                int i = flexboxLayoutManager.c;
                if (i == 0) {
                    aVar.e = flexboxLayoutManager.b == 1;
                    return;
                } else {
                    aVar.e = i == 2;
                    return;
                }
            }
            int i2 = flexboxLayoutManager.c;
            if (i2 == 0) {
                aVar.e = flexboxLayoutManager.b == 3;
            } else {
                aVar.e = i2 == 2;
            }
        }

        @NonNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("AnchorInfo{mPosition=");
            sb.append(this.a);
            sb.append(", mFlexLinePosition=");
            sb.append(this.b);
            sb.append(", mCoordinate=");
            sb.append(this.c);
            sb.append(", mPerpendicularCoordinate=");
            sb.append(this.d);
            sb.append(", mLayoutFromEnd=");
            sb.append(this.e);
            sb.append(", mValid=");
            sb.append(this.f);
            sb.append(", mAssignedFromSavedState=");
            return q0.a(sb, this.g, '}');
        }
    }

    public static class b {
        public int a;
        public boolean b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public boolean i;

        @NonNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("LayoutState{mAvailable=");
            sb.append(this.a);
            sb.append(", mFlexLinePosition=");
            sb.append(this.c);
            sb.append(", mPosition=");
            sb.append(this.d);
            sb.append(", mOffset=");
            sb.append(this.e);
            sb.append(", mScrollingOffset=");
            sb.append(this.f);
            sb.append(", mLastScrollDelta=");
            sb.append(this.g);
            sb.append(", mItemDirection=1, mLayoutDirection=");
            return vu5.b(sb, this.h, '}');
        }
    }

    public FlexboxLayoutManager(Context context) {
        I(0);
        J(1);
        H(4);
        this.w = context;
    }

    public static boolean E(int i, int i2, int i3) {
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

    public final int A(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z) {
        int i2;
        int g;
        if (m() || !this.g) {
            int g2 = this.o.g() - i;
            if (g2 <= 0) {
                return 0;
            }
            i2 = -C(-g2, vVar, a0Var);
        } else {
            int k = i - this.o.k();
            if (k <= 0) {
                return 0;
            }
            i2 = C(k, vVar, a0Var);
        }
        int i3 = i + i2;
        if (!z || (g = this.o.g() - i3) <= 0) {
            return i2;
        }
        this.o.p(g);
        return g + i2;
    }

    public final int B(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z) {
        int i2;
        int k;
        if (m() || !this.g) {
            int k2 = i - this.o.k();
            if (k2 <= 0) {
                return 0;
            }
            i2 = -C(k2, vVar, a0Var);
        } else {
            int g = this.o.g() - i;
            if (g <= 0) {
                return 0;
            }
            i2 = C(-g, vVar, a0Var);
        }
        int i3 = i + i2;
        if (!z || (k = i3 - this.o.k()) <= 0) {
            return i2;
        }
        this.o.p(-k);
        return i2 - k;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x01ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int C(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        int s;
        int i2;
        if (getChildCount() != 0 && i != 0) {
            r();
            this.m.i = true;
            boolean z = !m() && this.g;
            int i3 = (!z ? i > 0 : i < 0) ? -1 : 1;
            int abs = Math.abs(i);
            this.m.h = i3;
            boolean m = m();
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getWidth(), getWidthMode());
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getHeight(), getHeightMode());
            boolean z2 = !m && this.g;
            com.google.android.flexbox.b bVar = this.j;
            if (i3 == 1) {
                View childAt = getChildAt(getChildCount() - 1);
                if (childAt != null) {
                    this.m.e = this.o.b(childAt);
                    int position = getPosition(childAt);
                    View w = w(childAt, this.i.get(bVar.c[position]));
                    b bVar2 = this.m;
                    bVar2.getClass();
                    int i4 = position + 1;
                    bVar2.d = i4;
                    int[] iArr = bVar.c;
                    if (iArr.length <= i4) {
                        bVar2.c = -1;
                    } else {
                        bVar2.c = iArr[i4];
                    }
                    if (z2) {
                        bVar2.e = this.o.e(w);
                        this.m.f = this.o.k() + (-this.o.e(w));
                        b bVar3 = this.m;
                        bVar3.f = Math.max(bVar3.f, 0);
                    } else {
                        bVar2.e = this.o.b(w);
                        this.m.f = this.o.b(w) - this.o.g();
                    }
                    int i5 = this.m.c;
                    if ((i5 == -1 || i5 > this.i.size() - 1) && this.m.d <= this.l.b()) {
                        b bVar4 = this.m;
                        int i6 = abs - bVar4.f;
                        b.a aVar = this.z;
                        aVar.a = null;
                        aVar.b = 0;
                        if (i6 > 0) {
                            if (m) {
                                this.j.b(aVar, makeMeasureSpec, makeMeasureSpec2, i6, bVar4.d, -1, this.i);
                            } else {
                                this.j.b(aVar, makeMeasureSpec2, makeMeasureSpec, i6, bVar4.d, -1, this.i);
                                makeMeasureSpec2 = makeMeasureSpec2;
                                makeMeasureSpec = makeMeasureSpec;
                            }
                            bVar.h(makeMeasureSpec, makeMeasureSpec2, this.m.d);
                            bVar.u(this.m.d);
                        }
                    }
                    b bVar5 = this.m;
                    bVar5.a = abs - bVar5.f;
                }
                b bVar6 = this.m;
                s = s(vVar, a0Var, bVar6) + bVar6.f;
                if (s >= 0) {
                    if (z) {
                        if (abs > s) {
                            i2 = (-i3) * s;
                        }
                        i2 = i;
                    } else {
                        if (abs > s) {
                            i2 = i3 * s;
                        }
                        i2 = i;
                    }
                    this.o.p(-i2);
                    this.m.g = i2;
                    return i2;
                }
            } else {
                View childAt2 = getChildAt(0);
                if (childAt2 != null) {
                    this.m.e = this.o.e(childAt2);
                    int position2 = getPosition(childAt2);
                    View u = u(childAt2, this.i.get(bVar.c[position2]));
                    b bVar7 = this.m;
                    bVar7.getClass();
                    int i7 = bVar.c[position2];
                    if (i7 == -1) {
                        i7 = 0;
                    }
                    if (i7 > 0) {
                        this.m.d = position2 - this.i.get(i7 - 1).h;
                    } else {
                        bVar7.d = -1;
                    }
                    b bVar8 = this.m;
                    bVar8.c = i7 > 0 ? i7 - 1 : 0;
                    if (z2) {
                        bVar8.e = this.o.b(u);
                        this.m.f = this.o.b(u) - this.o.g();
                        b bVar9 = this.m;
                        bVar9.f = Math.max(bVar9.f, 0);
                    } else {
                        bVar8.e = this.o.e(u);
                        this.m.f = this.o.k() + (-this.o.e(u));
                    }
                    b bVar52 = this.m;
                    bVar52.a = abs - bVar52.f;
                }
                b bVar62 = this.m;
                s = s(vVar, a0Var, bVar62) + bVar62.f;
                if (s >= 0) {
                }
            }
        }
        return 0;
    }

    public final int D(int i) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        r();
        boolean m = m();
        View view = this.x;
        int width = m ? view.getWidth() : view.getHeight();
        int width2 = m ? getWidth() : getHeight();
        int layoutDirection = getLayoutDirection();
        a aVar = this.n;
        if (layoutDirection == 1) {
            int abs = Math.abs(i);
            if (i < 0) {
                return -Math.min((width2 + aVar.d) - width, abs);
            }
            int i2 = aVar.d;
            if (i2 + i > 0) {
                return -i2;
            }
        } else {
            if (i > 0) {
                return Math.min((width2 - aVar.d) - width, i);
            }
            int i3 = aVar.d;
            if (i3 + i < 0) {
                return -i3;
            }
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0103 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F(RecyclerView.v vVar, b bVar) {
        int childCount;
        int i;
        int childCount2;
        int i2;
        View childAt;
        int i3;
        if (bVar.i) {
            int i4 = bVar.h;
            com.google.android.flexbox.b bVar2 = this.j;
            int i5 = -1;
            if (i4 == -1) {
                if (bVar.f < 0 || (childCount2 = getChildCount()) == 0 || (childAt = getChildAt(childCount2 - 1)) == null || (i3 = bVar2.c[getPosition(childAt)]) == -1) {
                    return;
                }
                com.google.android.flexbox.a aVar = this.i.get(i3);
                int i6 = i2;
                while (true) {
                    if (i6 < 0) {
                        break;
                    }
                    View childAt2 = getChildAt(i6);
                    if (childAt2 != null) {
                        int i7 = bVar.f;
                        if (m() || !this.g) {
                            if (this.o.e(childAt2) < this.o.f() - i7) {
                                break;
                            }
                            if (aVar.o != getPosition(childAt2)) {
                                continue;
                            } else if (i3 <= 0) {
                                childCount2 = i6;
                                break;
                            } else {
                                i3 += bVar.h;
                                aVar = this.i.get(i3);
                                childCount2 = i6;
                            }
                        } else {
                            if (this.o.b(childAt2) > i7) {
                                break;
                            }
                            if (aVar.o != getPosition(childAt2)) {
                            }
                        }
                    }
                    i6--;
                }
                while (i2 >= childCount2) {
                    removeAndRecycleViewAt(i2, vVar);
                    i2--;
                }
                return;
            }
            if (bVar.f >= 0 && (childCount = getChildCount()) != 0) {
                int i8 = 0;
                View childAt3 = getChildAt(0);
                if (childAt3 == null || (i = bVar2.c[getPosition(childAt3)]) == -1) {
                    return;
                }
                com.google.android.flexbox.a aVar2 = this.i.get(i);
                while (true) {
                    if (i8 >= childCount) {
                        break;
                    }
                    View childAt4 = getChildAt(i8);
                    if (childAt4 != null) {
                        int i9 = bVar.f;
                        if (m() || !this.g) {
                            if (this.o.b(childAt4) > i9) {
                                break;
                            }
                            if (aVar2.p != getPosition(childAt4)) {
                                continue;
                            } else if (i >= this.i.size() - 1) {
                                i5 = i8;
                                break;
                            } else {
                                i += bVar.h;
                                aVar2 = this.i.get(i);
                                i5 = i8;
                            }
                        } else {
                            if (this.o.f() - this.o.e(childAt4) > i9) {
                                break;
                            }
                            if (aVar2.p != getPosition(childAt4)) {
                            }
                        }
                    }
                    i8++;
                }
                while (i5 >= 0) {
                    removeAndRecycleViewAt(i5, vVar);
                    i5--;
                }
            }
        }
    }

    public final void G() {
        int heightMode = m() ? getHeightMode() : getWidthMode();
        this.m.b = heightMode == 0 || heightMode == Integer.MIN_VALUE;
    }

    public final void H(int i) {
        int i2 = this.e;
        if (i2 != i) {
            if (i2 == 4 || i == 4) {
                removeAllViews();
                this.i.clear();
                a aVar = this.n;
                a.b(aVar);
                aVar.d = 0;
            }
            this.e = i;
            requestLayout();
        }
    }

    public final void I(int i) {
        if (this.b != i) {
            removeAllViews();
            this.b = i;
            this.o = null;
            this.p = null;
            this.i.clear();
            a aVar = this.n;
            a.b(aVar);
            aVar.d = 0;
            requestLayout();
        }
    }

    public final void J(int i) {
        int i2 = this.c;
        if (i2 != 1) {
            if (i2 == 0) {
                removeAllViews();
                this.i.clear();
                a aVar = this.n;
                a.b(aVar);
                aVar.d = 0;
            }
            this.c = 1;
            this.o = null;
            this.p = null;
            requestLayout();
        }
    }

    public final boolean K(View view, int i, int i2, LayoutParams layoutParams) {
        return (!view.isLayoutRequested() && isMeasurementCacheEnabled() && E(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) layoutParams).width) && E(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
    }

    public final void L(int i) {
        if (i >= x()) {
            return;
        }
        int childCount = getChildCount();
        com.google.android.flexbox.b bVar = this.j;
        bVar.j(childCount);
        bVar.k(childCount);
        bVar.i(childCount);
        if (i >= bVar.c.length) {
            return;
        }
        this.y = i;
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        this.r = getPosition(childAt);
        if (m() || !this.g) {
            this.s = this.o.e(childAt) - this.o.k();
        } else {
            this.s = this.o.h() + this.o.b(childAt);
        }
    }

    public final void M(a aVar, boolean z, boolean z2) {
        int i;
        if (z2) {
            G();
        } else {
            this.m.b = false;
        }
        if (m() || !this.g) {
            this.m.a = this.o.g() - aVar.c;
        } else {
            this.m.a = aVar.c - getPaddingRight();
        }
        b bVar = this.m;
        bVar.d = aVar.a;
        bVar.h = 1;
        bVar.e = aVar.c;
        bVar.f = Integer.MIN_VALUE;
        bVar.c = aVar.b;
        if (!z || this.i.size() <= 1 || (i = aVar.b) < 0 || i >= this.i.size() - 1) {
            return;
        }
        com.google.android.flexbox.a aVar2 = this.i.get(aVar.b);
        b bVar2 = this.m;
        bVar2.c++;
        bVar2.d += aVar2.h;
    }

    public final void N(a aVar, boolean z, boolean z2) {
        if (z2) {
            G();
        } else {
            this.m.b = false;
        }
        if (m() || !this.g) {
            this.m.a = aVar.c - this.o.k();
        } else {
            this.m.a = (this.x.getWidth() - aVar.c) - this.o.k();
        }
        b bVar = this.m;
        bVar.d = aVar.a;
        bVar.h = -1;
        bVar.e = aVar.c;
        bVar.f = Integer.MIN_VALUE;
        int i = aVar.b;
        bVar.c = i;
        if (!z || i <= 0) {
            return;
        }
        int size = this.i.size();
        int i2 = aVar.b;
        if (size > i2) {
            com.google.android.flexbox.a aVar2 = this.i.get(i2);
            r4.c--;
            this.m.d -= aVar2.h;
        }
    }

    @Override // xsna.eor
    public final int a(int i, int i2, View view) {
        int topDecorationHeight;
        int bottomDecorationHeight;
        if (m()) {
            topDecorationHeight = getLeftDecorationWidth(view);
            bottomDecorationHeight = getRightDecorationWidth(view);
        } else {
            topDecorationHeight = getTopDecorationHeight(view);
            bottomDecorationHeight = getBottomDecorationHeight(view);
        }
        return bottomDecorationHeight + topDecorationHeight;
    }

    @Override // xsna.eor
    public final int c(View view) {
        int leftDecorationWidth;
        int rightDecorationWidth;
        if (m()) {
            leftDecorationWidth = getTopDecorationHeight(view);
            rightDecorationWidth = getBottomDecorationHeight(view);
        } else {
            leftDecorationWidth = getLeftDecorationWidth(view);
            rightDecorationWidth = getRightDecorationWidth(view);
        }
        return rightDecorationWidth + leftDecorationWidth;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean canScrollHorizontally() {
        if (this.c == 0) {
            return m();
        }
        if (!m()) {
            return true;
        }
        int width = getWidth();
        View view = this.x;
        return width > (view != null ? view.getWidth() : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean canScrollVertically() {
        if (this.c == 0) {
            return !m();
        }
        if (!m()) {
            int height = getHeight();
            View view = this.x;
            if (height <= (view != null ? view.getHeight() : 0)) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean checkLayoutParams(RecyclerView.p pVar) {
        return pVar instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int computeHorizontalScrollExtent(@NonNull RecyclerView.a0 a0Var) {
        return o(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int computeHorizontalScrollOffset(@NonNull RecyclerView.a0 a0Var) {
        return p(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int computeHorizontalScrollRange(@NonNull RecyclerView.a0 a0Var) {
        return q(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z.b
    public final PointF computeScrollVectorForPosition(int i) {
        View childAt;
        if (getChildCount() == 0 || (childAt = getChildAt(0)) == null) {
            return null;
        }
        int i2 = i < getPosition(childAt) ? -1 : 1;
        return m() ? new PointF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i2) : new PointF(i2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int computeVerticalScrollExtent(@NonNull RecyclerView.a0 a0Var) {
        return o(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int computeVerticalScrollOffset(@NonNull RecyclerView.a0 a0Var) {
        return p(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int computeVerticalScrollRange(@NonNull RecyclerView.a0 a0Var) {
        return q(a0Var);
    }

    @Override // xsna.eor
    public final void g(View view, int i, int i2, com.google.android.flexbox.a aVar) {
        calculateItemDecorationsForChild(view, A);
        if (m()) {
            int rightDecorationWidth = getRightDecorationWidth(view) + getLeftDecorationWidth(view);
            aVar.e += rightDecorationWidth;
            aVar.f += rightDecorationWidth;
            return;
        }
        int bottomDecorationHeight = getBottomDecorationHeight(view) + getTopDecorationHeight(view);
        aVar.e += bottomDecorationHeight;
        aVar.f += bottomDecorationHeight;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final RecyclerView.p generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final RecyclerView.p generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    @Override // xsna.eor
    public final int getAlignContent() {
        return 5;
    }

    @Override // xsna.eor
    public final int getAlignItems() {
        return this.e;
    }

    @Override // xsna.eor
    public final int getFlexDirection() {
        return this.b;
    }

    @Override // xsna.eor
    public final int getFlexItemCount() {
        return this.l.b();
    }

    @Override // xsna.eor
    public final List<com.google.android.flexbox.a> getFlexLinesInternal() {
        return this.i;
    }

    @Override // xsna.eor
    public final int getFlexWrap() {
        return this.c;
    }

    @Override // xsna.eor
    public final int getLargestMainSize() {
        if (this.i.size() == 0) {
            return 0;
        }
        int size = this.i.size();
        int i = Integer.MIN_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            i = Math.max(i, this.i.get(i2).e);
        }
        return i;
    }

    @Override // xsna.eor
    public final int getMaxLine() {
        return this.f;
    }

    @Override // xsna.eor
    public final int getSumOfCrossSize() {
        int size = this.i.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += this.i.get(i2).g;
        }
        return i;
    }

    @Override // xsna.eor
    public final View h(int i) {
        View view = this.v.get(i);
        return view != null ? view : this.k.f(i);
    }

    @Override // xsna.eor
    public final int i(int i, int i2, int i3) {
        return RecyclerView.o.getChildMeasureSpec(getHeight(), getHeightMode(), i2, i3, canScrollVertically());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean isAutoMeasureEnabled() {
        return true;
    }

    @Override // xsna.eor
    public final View j(int i) {
        return h(i);
    }

    @Override // xsna.eor
    public final int k(int i, int i2, int i3) {
        return RecyclerView.o.getChildMeasureSpec(getWidth(), getWidthMode(), i2, i3, canScrollHorizontally());
    }

    @Override // xsna.eor
    public final void l(int i, View view) {
        this.v.put(i, view);
    }

    @Override // xsna.eor
    public final boolean m() {
        int i = this.b;
        return i == 0 || i == 1;
    }

    public final int o(RecyclerView.a0 a0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        int b2 = a0Var.b();
        r();
        View t = t(b2);
        View v = v(b2);
        if (a0Var.b() == 0 || t == null || v == null) {
            return 0;
        }
        return Math.min(this.o.l(), this.o.b(v) - this.o.e(t));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onAdapterChanged(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        removeAllViews();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.x = (View) recyclerView.getParent();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onItemsAdded(@NonNull RecyclerView recyclerView, int i, int i2) {
        super.onItemsAdded(recyclerView, i, i2);
        L(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onItemsMoved(@NonNull RecyclerView recyclerView, int i, int i2, int i3) {
        super.onItemsMoved(recyclerView, i, i2, i3);
        L(Math.min(i, i2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onItemsRemoved(@NonNull RecyclerView recyclerView, int i, int i2) {
        super.onItemsRemoved(recyclerView, i, i2);
        L(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onItemsUpdated(@NonNull RecyclerView recyclerView, int i, int i2, Object obj) {
        super.onItemsUpdated(recyclerView, i, i2, obj);
        L(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onLayoutChildren(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        int i;
        View childAt;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        int i4;
        int i5;
        this.k = vVar;
        this.l = a0Var;
        int b2 = a0Var.b();
        if (b2 == 0 && a0Var.g) {
            return;
        }
        int layoutDirection = getLayoutDirection();
        int i6 = this.b;
        if (i6 == 0) {
            this.g = layoutDirection == 1;
            this.h = this.c == 2;
        } else if (i6 == 1) {
            this.g = layoutDirection != 1;
            this.h = this.c == 2;
        } else if (i6 == 2) {
            boolean z3 = layoutDirection == 1;
            this.g = z3;
            if (this.c == 2) {
                this.g = !z3;
            }
            this.h = false;
        } else if (i6 != 3) {
            this.g = false;
            this.h = false;
        } else {
            boolean z4 = layoutDirection == 1;
            this.g = z4;
            if (this.c == 2) {
                this.g = !z4;
            }
            this.h = true;
        }
        r();
        if (this.m == null) {
            b bVar = new b();
            bVar.h = 1;
            this.m = bVar;
        }
        com.google.android.flexbox.b bVar2 = this.j;
        bVar2.j(b2);
        bVar2.k(b2);
        bVar2.i(b2);
        this.m.i = false;
        SavedState savedState = this.q;
        if (savedState != null && (i5 = savedState.b) >= 0 && i5 < b2) {
            this.r = i5;
        }
        a aVar = this.n;
        if (!aVar.f || this.r != -1 || savedState != null) {
            a.b(aVar);
            SavedState savedState2 = this.q;
            if (!a0Var.g && (i = this.r) != -1) {
                if (i < 0 || i >= a0Var.b()) {
                    this.r = -1;
                    this.s = Integer.MIN_VALUE;
                } else {
                    int i7 = this.r;
                    aVar.a = i7;
                    aVar.b = bVar2.c[i7];
                    SavedState savedState3 = this.q;
                    if (savedState3 != null) {
                        int b3 = a0Var.b();
                        int i8 = savedState3.b;
                        if (i8 >= 0 && i8 < b3) {
                            aVar.c = this.o.k() + savedState2.c;
                            aVar.g = true;
                            aVar.b = -1;
                            aVar.f = true;
                        }
                    }
                    if (this.s == Integer.MIN_VALUE) {
                        View findViewByPosition = findViewByPosition(this.r);
                        if (findViewByPosition == null) {
                            if (getChildCount() > 0 && (childAt = getChildAt(0)) != null) {
                                aVar.e = this.r < getPosition(childAt);
                            }
                            a.a(aVar);
                        } else if (this.o.c(findViewByPosition) > this.o.l()) {
                            a.a(aVar);
                        } else if (this.o.e(findViewByPosition) - this.o.k() < 0) {
                            aVar.c = this.o.k();
                            aVar.e = false;
                        } else if (this.o.g() - this.o.b(findViewByPosition) < 0) {
                            aVar.c = this.o.g();
                            aVar.e = true;
                        } else {
                            aVar.c = aVar.e ? this.o.m() + this.o.b(findViewByPosition) : this.o.e(findViewByPosition);
                        }
                    } else if (m() || !this.g) {
                        aVar.c = this.o.k() + this.s;
                    } else {
                        aVar.c = this.s - this.o.h();
                    }
                    aVar.f = true;
                }
            }
            if (getChildCount() != 0) {
                View v = aVar.e ? v(a0Var.b()) : t(a0Var.b());
                if (v != null) {
                    FlexboxLayoutManager flexboxLayoutManager = FlexboxLayoutManager.this;
                    f0 f0Var = flexboxLayoutManager.c == 0 ? flexboxLayoutManager.p : flexboxLayoutManager.o;
                    if (flexboxLayoutManager.m() || !flexboxLayoutManager.g) {
                        if (aVar.e) {
                            aVar.c = f0Var.m() + f0Var.b(v);
                        } else {
                            aVar.c = f0Var.e(v);
                        }
                    } else if (aVar.e) {
                        aVar.c = f0Var.m() + f0Var.e(v);
                    } else {
                        aVar.c = f0Var.b(v);
                    }
                    int position = flexboxLayoutManager.getPosition(v);
                    aVar.a = position;
                    aVar.g = false;
                    int[] iArr = flexboxLayoutManager.j.c;
                    if (position == -1) {
                        position = 0;
                    }
                    int i9 = iArr[position];
                    if (i9 == -1) {
                        i9 = 0;
                    }
                    aVar.b = i9;
                    int size = flexboxLayoutManager.i.size();
                    int i10 = aVar.b;
                    if (size > i10) {
                        aVar.a = flexboxLayoutManager.i.get(i10).o;
                    }
                    if (!a0Var.g && supportsPredictiveItemAnimations() && (this.o.e(v) >= this.o.g() || this.o.b(v) < this.o.k())) {
                        aVar.c = aVar.e ? this.o.g() : this.o.k();
                    }
                    aVar.f = true;
                }
            }
            a.a(aVar);
            aVar.a = 0;
            aVar.b = 0;
            aVar.f = true;
        }
        detachAndScrapAttachedViews(vVar);
        if (aVar.e) {
            N(aVar, false, true);
        } else {
            M(aVar, false, true);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getWidth(), getWidthMode());
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getHeight(), getHeightMode());
        int width = getWidth();
        int height = getHeight();
        boolean m = m();
        Context context = this.w;
        if (m) {
            int i11 = this.t;
            z = (i11 == Integer.MIN_VALUE || i11 == width) ? false : true;
            b bVar3 = this.m;
            i2 = bVar3.b ? context.getResources().getDisplayMetrics().heightPixels : bVar3.a;
        } else {
            int i12 = this.u;
            z = (i12 == Integer.MIN_VALUE || i12 == height) ? false : true;
            b bVar4 = this.m;
            i2 = bVar4.b ? context.getResources().getDisplayMetrics().widthPixels : bVar4.a;
        }
        int i13 = i2;
        this.t = width;
        this.u = height;
        int i14 = this.y;
        b.a aVar2 = this.z;
        if (i14 != -1 || (this.r == -1 && !z)) {
            int min = i14 != -1 ? Math.min(i14, aVar.a) : aVar.a;
            aVar2.a = null;
            aVar2.b = 0;
            if (m()) {
                if (this.i.size() > 0) {
                    bVar2.d(min, this.i);
                    this.j.b(this.z, makeMeasureSpec, makeMeasureSpec2, i13, min, aVar.a, this.i);
                } else {
                    bVar2.i(b2);
                    this.j.b(this.z, makeMeasureSpec, makeMeasureSpec2, i13, 0, -1, this.i);
                }
            } else if (this.i.size() > 0) {
                bVar2.d(min, this.i);
                int i15 = min;
                this.j.b(this.z, makeMeasureSpec2, makeMeasureSpec, i13, i15, aVar.a, this.i);
                makeMeasureSpec2 = makeMeasureSpec2;
                makeMeasureSpec = makeMeasureSpec;
                min = i15;
            } else {
                bVar2.i(b2);
                this.j.b(this.z, makeMeasureSpec2, makeMeasureSpec, i13, 0, -1, this.i);
                makeMeasureSpec2 = makeMeasureSpec2;
                makeMeasureSpec = makeMeasureSpec;
            }
            this.i = aVar2.a;
            bVar2.h(makeMeasureSpec, makeMeasureSpec2, min);
            bVar2.u(min);
        } else if (!aVar.e) {
            this.i.clear();
            aVar2.a = null;
            aVar2.b = 0;
            if (m()) {
                this.j.b(this.z, makeMeasureSpec, makeMeasureSpec2, i13, 0, aVar.a, this.i);
            } else {
                this.j.b(this.z, makeMeasureSpec2, makeMeasureSpec, i13, 0, aVar.a, this.i);
                makeMeasureSpec2 = makeMeasureSpec2;
                makeMeasureSpec = makeMeasureSpec;
            }
            this.i = aVar2.a;
            bVar2.h(makeMeasureSpec, makeMeasureSpec2, 0);
            bVar2.u(0);
            int i16 = bVar2.c[aVar.a];
            aVar.b = i16;
            this.m.c = i16;
        }
        s(vVar, a0Var, this.m);
        if (aVar.e) {
            i4 = this.m.e;
            z2 = true;
            M(aVar, true, false);
            s(vVar, a0Var, this.m);
            i3 = this.m.e;
        } else {
            z2 = true;
            i3 = this.m.e;
            N(aVar, true, false);
            s(vVar, a0Var, this.m);
            i4 = this.m.e;
        }
        if (getChildCount() > 0) {
            if (aVar.e) {
                B(A(i3, vVar, a0Var, z2) + i4, vVar, a0Var, false);
            } else {
                A(B(i4, vVar, a0Var, z2) + i3, vVar, a0Var, false);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onLayoutCompleted(RecyclerView.a0 a0Var) {
        super.onLayoutCompleted(a0Var);
        this.q = null;
        this.r = -1;
        this.s = Integer.MIN_VALUE;
        this.y = -1;
        a.b(this.n);
        this.v.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.q = (SavedState) parcelable;
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = this.q;
        if (savedState != null) {
            SavedState savedState2 = new SavedState();
            savedState2.b = savedState.b;
            savedState2.c = savedState.c;
            return savedState2;
        }
        SavedState savedState3 = new SavedState();
        if (getChildCount() <= 0) {
            savedState3.b = -1;
            return savedState3;
        }
        View childAt = getChildAt(0);
        savedState3.b = getPosition(childAt);
        savedState3.c = this.o.e(childAt) - this.o.k();
        return savedState3;
    }

    public final int p(RecyclerView.a0 a0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        int b2 = a0Var.b();
        View t = t(b2);
        View v = v(b2);
        if (a0Var.b() == 0 || t == null || v == null) {
            return 0;
        }
        int position = getPosition(t);
        int position2 = getPosition(v);
        int abs = Math.abs(this.o.b(v) - this.o.e(t));
        int i = this.j.c[position];
        if (i == 0 || i == -1) {
            return 0;
        }
        return Math.round((i * (abs / ((r3[position2] - i) + 1))) + (this.o.k() - this.o.e(t)));
    }

    public final int q(RecyclerView.a0 a0Var) {
        if (getChildCount() != 0) {
            int b2 = a0Var.b();
            View t = t(b2);
            View v = v(b2);
            if (a0Var.b() != 0 && t != null && v != null) {
                return (int) ((Math.abs(this.o.b(v) - this.o.e(t)) / ((x() - (y(0, getChildCount(), false) == null ? -1 : getPosition(r1))) + 1)) * a0Var.b());
            }
        }
        return 0;
    }

    public final void r() {
        if (this.o != null) {
            return;
        }
        if (m()) {
            if (this.c == 0) {
                this.o = new d0(this);
                this.p = new e0(this);
                return;
            } else {
                this.o = new e0(this);
                this.p = new d0(this);
                return;
            }
        }
        if (this.c == 0) {
            this.o = new e0(this);
            this.p = new d0(this);
        } else {
            this.o = new d0(this);
            this.p = new e0(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x042e, code lost:
    
        r3 = r34.a - r8;
        r34.a = r3;
        r4 = r34.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0437, code lost:
    
        if (r4 == Integer.MIN_VALUE) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0439, code lost:
    
        r4 = r4 + r8;
        r34.f = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x043c, code lost:
    
        if (r3 >= 0) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x043e, code lost:
    
        r34.f = r4 + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0441, code lost:
    
        F(r32, r34);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0448, code lost:
    
        return r27 - r34.a;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int s(RecyclerView.v vVar, RecyclerView.a0 a0Var, b bVar) {
        int i;
        int i2;
        boolean z;
        int i3;
        float f;
        float f2;
        float f3;
        int i4;
        int i5;
        int i6;
        int i7;
        Rect rect;
        int i8;
        int i9;
        int i10;
        float bottomDecorationHeight;
        float topDecorationHeight;
        float f4;
        float f5;
        float f6;
        int i11;
        int i12;
        boolean z2;
        com.google.android.flexbox.b bVar2;
        int i13;
        int i14;
        Rect rect2;
        int i15;
        int i16 = bVar.f;
        if (i16 != Integer.MIN_VALUE) {
            int i17 = bVar.a;
            if (i17 < 0) {
                bVar.f = i16 + i17;
            }
            F(vVar, bVar);
        }
        int i18 = bVar.a;
        boolean m = m();
        int i19 = i18;
        int i20 = 0;
        while (true) {
            if (i19 <= 0 && !this.m.b) {
                break;
            }
            List<com.google.android.flexbox.a> list = this.i;
            int i21 = bVar.d;
            if (i21 < 0 || i21 >= a0Var.b() || (i = bVar.c) < 0 || i >= list.size()) {
                break;
            }
            com.google.android.flexbox.a aVar = this.i.get(bVar.c);
            bVar.d = aVar.o;
            boolean m2 = m();
            a aVar2 = this.n;
            Rect rect3 = A;
            com.google.android.flexbox.b bVar3 = this.j;
            if (m2) {
                int paddingLeft = getPaddingLeft();
                int paddingRight = getPaddingRight();
                int width = getWidth();
                int i22 = bVar.e;
                if (bVar.h == -1) {
                    i22 -= aVar.g;
                }
                int i23 = i22;
                int i24 = bVar.d;
                int i25 = this.d;
                if (i25 != 0) {
                    i2 = i18;
                    if (i25 == 1) {
                        int i26 = aVar.e;
                        float f7 = (width - i26) + paddingRight;
                        float f8 = i26 - paddingLeft;
                        f4 = f7;
                        f5 = f8;
                    } else if (i25 != 2) {
                        if (i25 == 3) {
                            f4 = paddingLeft;
                            f6 = (width - aVar.e) / (aVar.h != 1 ? r3 - 1 : 1.0f);
                            f5 = width - paddingRight;
                        } else if (i25 == 4) {
                            int i27 = aVar.h;
                            f6 = i27 != 0 ? (width - aVar.e) / i27 : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            float f9 = f6 / 2.0f;
                            f4 = paddingLeft + f9;
                            f5 = (width - paddingRight) - f9;
                        } else {
                            if (i25 != 5) {
                                throw new IllegalStateException("Invalid justifyContent is set: " + this.d);
                            }
                            f6 = aVar.h != 0 ? (width - aVar.e) / (r3 + 1) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            f4 = paddingLeft + f6;
                            f5 = (width - paddingRight) - f6;
                        }
                        float f10 = aVar2.d;
                        float f11 = f4 - f10;
                        float f12 = f5 - f10;
                        float max = Math.max(f6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        i11 = aVar.h;
                        i12 = i24;
                        int i28 = 0;
                        while (i12 < i24 + i11) {
                            int i29 = i24;
                            View h = h(i12);
                            if (h == null) {
                                z2 = m;
                                bVar2 = bVar3;
                                i13 = i11;
                                i14 = i12;
                                rect2 = rect3;
                                i15 = i29;
                            } else {
                                z2 = m;
                                if (bVar.h == 1) {
                                    calculateItemDecorationsForChild(h, rect3);
                                    addView(h);
                                } else {
                                    calculateItemDecorationsForChild(h, rect3);
                                    addView(h, i28);
                                    i28++;
                                }
                                bVar2 = bVar3;
                                long j = bVar3.d[i12];
                                int i30 = (int) j;
                                int i31 = (int) (j >> 32);
                                if (K(h, i30, i31, (LayoutParams) h.getLayoutParams())) {
                                    h.measure(i30, i31);
                                }
                                float leftDecorationWidth = f11 + getLeftDecorationWidth(h) + ((ViewGroup.MarginLayoutParams) r6).leftMargin;
                                float rightDecorationWidth = f12 - (getRightDecorationWidth(h) + ((ViewGroup.MarginLayoutParams) r6).rightMargin);
                                int topDecorationHeight2 = getTopDecorationHeight(h) + i23;
                                if (this.g) {
                                    int round = Math.round(rightDecorationWidth) - h.getMeasuredWidth();
                                    Rect rect4 = rect3;
                                    int round2 = Math.round(rightDecorationWidth);
                                    int measuredHeight = h.getMeasuredHeight() + topDecorationHeight2;
                                    i13 = i11;
                                    rect2 = rect4;
                                    i14 = i12;
                                    i15 = i29;
                                    this.j.o(h, aVar, round, topDecorationHeight2, round2, measuredHeight);
                                } else {
                                    i13 = i11;
                                    i14 = i12;
                                    rect2 = rect3;
                                    i15 = i29;
                                    this.j.o(h, aVar, Math.round(leftDecorationWidth), topDecorationHeight2, h.getMeasuredWidth() + Math.round(leftDecorationWidth), h.getMeasuredHeight() + topDecorationHeight2);
                                }
                                f12 = rightDecorationWidth - ((getLeftDecorationWidth(h) + (h.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) r6).leftMargin)) + max);
                                f11 = getRightDecorationWidth(h) + h.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) r6).rightMargin + max + leftDecorationWidth;
                            }
                            i12 = i14 + 1;
                            i24 = i15;
                            i11 = i13;
                            m = z2;
                            bVar3 = bVar2;
                            rect3 = rect2;
                        }
                        z = m;
                        bVar.c += this.m.h;
                        i6 = aVar.g;
                    } else {
                        float f13 = paddingLeft;
                        float f14 = (width - aVar.e) / 2.0f;
                        f5 = (width - paddingRight) - f14;
                        f4 = f13 + f14;
                    }
                } else {
                    i2 = i18;
                    f4 = paddingLeft;
                    f5 = width - paddingRight;
                }
                f6 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                float f102 = aVar2.d;
                float f112 = f4 - f102;
                float f122 = f5 - f102;
                float max2 = Math.max(f6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                i11 = aVar.h;
                i12 = i24;
                int i282 = 0;
                while (i12 < i24 + i11) {
                }
                z = m;
                bVar.c += this.m.h;
                i6 = aVar.g;
            } else {
                i2 = i18;
                z = m;
                Rect rect5 = rect3;
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i32 = bVar.e;
                if (bVar.h == -1) {
                    int i33 = aVar.g;
                    int i34 = i32 - i33;
                    i3 = i32 + i33;
                    i32 = i34;
                } else {
                    i3 = i32;
                }
                int i35 = bVar.d;
                int i36 = this.d;
                if (i36 == 0) {
                    f = paddingTop;
                    f2 = height - paddingBottom;
                } else if (i36 == 1) {
                    int i37 = aVar.e;
                    float f15 = (height - i37) + paddingBottom;
                    f2 = i37 - paddingTop;
                    f = f15;
                } else if (i36 != 2) {
                    if (i36 == 3) {
                        f = paddingTop;
                        f3 = (height - aVar.e) / (aVar.h != 1 ? r13 - 1 : 1.0f);
                        f2 = height - paddingBottom;
                    } else if (i36 == 4) {
                        int i38 = aVar.h;
                        f3 = i38 != 0 ? (height - aVar.e) / i38 : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        float f16 = f3 / 2.0f;
                        f = paddingTop + f16;
                        f2 = (height - paddingBottom) - f16;
                    } else {
                        if (i36 != 5) {
                            throw new IllegalStateException("Invalid justifyContent is set: " + this.d);
                        }
                        f3 = aVar.h != 0 ? (height - aVar.e) / (r13 + 1) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        f = paddingTop + f3;
                        f2 = (height - paddingBottom) - f3;
                    }
                    float f17 = aVar2.d;
                    float f18 = f - f17;
                    float f19 = f2 - f17;
                    float max3 = Math.max(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    i4 = aVar.h;
                    i5 = i35;
                    int i39 = 0;
                    while (i5 < i35 + i4) {
                        int i40 = i35;
                        View h2 = h(i5);
                        if (h2 == null) {
                            i7 = i3;
                            topDecorationHeight = f19;
                            i8 = i4;
                            i10 = i5;
                            i9 = i40;
                            bottomDecorationHeight = f18;
                            rect = rect5;
                        } else {
                            float f20 = f18;
                            i7 = i3;
                            long j2 = bVar3.d[i5];
                            float f21 = f19;
                            int i41 = (int) j2;
                            int i42 = (int) (j2 >> 32);
                            if (K(h2, i41, i42, (LayoutParams) h2.getLayoutParams())) {
                                h2.measure(i41, i42);
                            }
                            float topDecorationHeight3 = f20 + getTopDecorationHeight(h2) + ((ViewGroup.MarginLayoutParams) r4).topMargin;
                            float bottomDecorationHeight2 = f21 - (getBottomDecorationHeight(h2) + ((ViewGroup.MarginLayoutParams) r4).rightMargin);
                            if (bVar.h == 1) {
                                rect = rect5;
                                calculateItemDecorationsForChild(h2, rect);
                                addView(h2);
                            } else {
                                rect = rect5;
                                calculateItemDecorationsForChild(h2, rect);
                                addView(h2, i39);
                                i39++;
                            }
                            int i43 = i39;
                            int leftDecorationWidth2 = getLeftDecorationWidth(h2) + i32;
                            int rightDecorationWidth2 = i7 - getRightDecorationWidth(h2);
                            int i44 = i5;
                            boolean z3 = this.g;
                            if (!z3) {
                                i8 = i4;
                                i9 = i40;
                                i10 = i44;
                                if (this.h) {
                                    this.j.p(h2, aVar, z3, leftDecorationWidth2, Math.round(bottomDecorationHeight2) - h2.getMeasuredHeight(), h2.getMeasuredWidth() + leftDecorationWidth2, Math.round(bottomDecorationHeight2));
                                } else {
                                    this.j.p(h2, aVar, z3, leftDecorationWidth2, Math.round(topDecorationHeight3), h2.getMeasuredWidth() + leftDecorationWidth2, h2.getMeasuredHeight() + Math.round(topDecorationHeight3));
                                }
                            } else if (this.h) {
                                int measuredWidth = rightDecorationWidth2 - h2.getMeasuredWidth();
                                int round3 = Math.round(bottomDecorationHeight2) - h2.getMeasuredHeight();
                                i10 = i44;
                                int round4 = Math.round(bottomDecorationHeight2);
                                i8 = i4;
                                i9 = i40;
                                this.j.p(h2, aVar, z3, measuredWidth, round3, rightDecorationWidth2, round4);
                            } else {
                                i8 = i4;
                                i9 = i40;
                                i10 = i44;
                                this.j.p(h2, aVar, z3, rightDecorationWidth2 - h2.getMeasuredWidth(), Math.round(topDecorationHeight3), rightDecorationWidth2, h2.getMeasuredHeight() + Math.round(topDecorationHeight3));
                            }
                            bottomDecorationHeight = getBottomDecorationHeight(h2) + h2.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) r4).topMargin + max3 + topDecorationHeight3;
                            topDecorationHeight = bottomDecorationHeight2 - ((getTopDecorationHeight(h2) + (h2.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) r4).bottomMargin)) + max3);
                            i39 = i43;
                        }
                        i5 = i10 + 1;
                        rect5 = rect;
                        i35 = i9;
                        f18 = bottomDecorationHeight;
                        i4 = i8;
                        f19 = topDecorationHeight;
                        i3 = i7;
                    }
                    bVar.c += this.m.h;
                    i6 = aVar.g;
                } else {
                    float f22 = (height - aVar.e) / 2.0f;
                    f = paddingTop + f22;
                    f2 = (height - paddingBottom) - f22;
                }
                f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                float f172 = aVar2.d;
                float f182 = f - f172;
                float f192 = f2 - f172;
                float max32 = Math.max(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                i4 = aVar.h;
                i5 = i35;
                int i392 = 0;
                while (i5 < i35 + i4) {
                }
                bVar.c += this.m.h;
                i6 = aVar.g;
            }
            i20 += i6;
            if (z || !this.g) {
                bVar.e += aVar.g * bVar.h;
            } else {
                bVar.e -= aVar.g * bVar.h;
            }
            i19 -= aVar.g;
            m = z;
            i18 = i2;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int scrollHorizontallyBy(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (!m() || this.c == 0) {
            int C = C(i, vVar, a0Var);
            this.v.clear();
            return C;
        }
        int D = D(i);
        this.n.d += D;
        this.p.p(-D);
        return D;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void scrollToPosition(int i) {
        this.r = i;
        this.s = Integer.MIN_VALUE;
        SavedState savedState = this.q;
        if (savedState != null) {
            savedState.b = -1;
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int scrollVerticallyBy(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (m() || (this.c == 0 && !m())) {
            int C = C(i, vVar, a0Var);
            this.v.clear();
            return C;
        }
        int D = D(i);
        this.n.d += D;
        this.p.p(-D);
        return D;
    }

    @Override // xsna.eor
    public final void setFlexLines(List<com.google.android.flexbox.a> list) {
        this.i = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i) {
        v vVar = new v(recyclerView.getContext());
        vVar.setTargetPosition(i);
        startSmoothScroll(vVar);
    }

    public final View t(int i) {
        View z = z(0, getChildCount(), i);
        if (z == null) {
            return null;
        }
        int i2 = this.j.c[getPosition(z)];
        if (i2 == -1) {
            return null;
        }
        return u(z, this.i.get(i2));
    }

    public final View u(View view, com.google.android.flexbox.a aVar) {
        boolean m = m();
        int i = aVar.h;
        for (int i2 = 1; i2 < i; i2++) {
            View childAt = getChildAt(i2);
            if (childAt != null && childAt.getVisibility() != 8) {
                if (!this.g || m) {
                    if (this.o.e(view) <= this.o.e(childAt)) {
                    }
                    view = childAt;
                } else {
                    if (this.o.b(view) >= this.o.b(childAt)) {
                    }
                    view = childAt;
                }
            }
        }
        return view;
    }

    public final View v(int i) {
        View z = z(getChildCount() - 1, -1, i);
        if (z == null) {
            return null;
        }
        return w(z, this.i.get(this.j.c[getPosition(z)]));
    }

    public final View w(View view, com.google.android.flexbox.a aVar) {
        boolean m = m();
        int childCount = (getChildCount() - aVar.h) - 1;
        for (int childCount2 = getChildCount() - 2; childCount2 > childCount; childCount2--) {
            View childAt = getChildAt(childCount2);
            if (childAt != null && childAt.getVisibility() != 8) {
                if (!this.g || m) {
                    if (this.o.b(view) >= this.o.b(childAt)) {
                    }
                    view = childAt;
                } else {
                    if (this.o.e(view) <= this.o.e(childAt)) {
                    }
                    view = childAt;
                }
            }
        }
        return view;
    }

    public final int x() {
        View y = y(getChildCount() - 1, -1, false);
        if (y == null) {
            return -1;
        }
        return getPosition(y);
    }

    public final View y(int i, int i2, boolean z) {
        int i3 = i;
        int i4 = i2 > i3 ? 1 : -1;
        while (i3 != i2) {
            View childAt = getChildAt(i3);
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            int decoratedLeft = getDecoratedLeft(childAt) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) childAt.getLayoutParams())).leftMargin;
            int decoratedTop = getDecoratedTop(childAt) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) childAt.getLayoutParams())).topMargin;
            int decoratedRight = getDecoratedRight(childAt) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) childAt.getLayoutParams())).rightMargin;
            int decoratedBottom = getDecoratedBottom(childAt) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) childAt.getLayoutParams())).bottomMargin;
            boolean z2 = paddingLeft <= decoratedLeft && width >= decoratedRight;
            boolean z3 = decoratedLeft >= width || decoratedRight >= paddingLeft;
            boolean z4 = paddingTop <= decoratedTop && height >= decoratedBottom;
            boolean z5 = decoratedTop >= height || decoratedBottom >= paddingTop;
            if (z) {
                if (z2 && z4) {
                    return childAt;
                }
                i3 += i4;
            } else {
                if (z3 && z5) {
                    return childAt;
                }
                i3 += i4;
            }
        }
        return null;
    }

    public final View z(int i, int i2, int i3) {
        int position;
        r();
        if (this.m == null) {
            b bVar = new b();
            bVar.h = 1;
            this.m = bVar;
        }
        int k = this.o.k();
        int g = this.o.g();
        int i4 = i2 <= i ? -1 : 1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View childAt = getChildAt(i);
            if (childAt != null && (position = getPosition(childAt)) >= 0 && position < i3) {
                if (((RecyclerView.p) childAt.getLayoutParams()).b.isRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.o.e(childAt) >= k && this.o.b(childAt) <= g) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onItemsUpdated(@NonNull RecyclerView recyclerView, int i, int i2) {
        super.onItemsUpdated(recyclerView, i, i2);
        L(i);
    }

    public static class LayoutParams extends RecyclerView.p implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new a();
        public float f;
        public float g;
        public int h;
        public float i;
        public int j;
        public int k;
        public int l;
        public int m;
        public boolean n;

        public class a implements Parcelable.Creator<LayoutParams> {
            @Override // android.os.Parcelable.Creator
            public final LayoutParams createFromParcel(Parcel parcel) {
                LayoutParams layoutParams = new LayoutParams(-2, -2);
                layoutParams.f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                layoutParams.g = 1.0f;
                layoutParams.h = -1;
                layoutParams.i = -1.0f;
                layoutParams.l = 16777215;
                layoutParams.m = 16777215;
                layoutParams.f = parcel.readFloat();
                layoutParams.g = parcel.readFloat();
                layoutParams.h = parcel.readInt();
                layoutParams.i = parcel.readFloat();
                layoutParams.j = parcel.readInt();
                layoutParams.k = parcel.readInt();
                layoutParams.l = parcel.readInt();
                layoutParams.m = parcel.readInt();
                layoutParams.n = parcel.readByte() != 0;
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) layoutParams).height = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) layoutParams).width = parcel.readInt();
                return layoutParams;
            }

            @Override // android.os.Parcelable.Creator
            public final LayoutParams[] newArray(int i) {
                return new LayoutParams[i];
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.g = 1.0f;
            this.h = -1;
            this.i = -1.0f;
            this.l = 16777215;
            this.m = 16777215;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float B9() {
            return this.i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int F1() {
            return this.j;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final boolean H9() {
            return this.n;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int L() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int L0() {
            return this.m;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int T5() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int U5() {
            return this.k;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float Z3() {
            return this.g;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int Z8() {
            return this.h;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int g0() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int getMaxWidth() {
            return this.l;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int getOrder() {
            return 1;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final void o4(int i) {
            this.k = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float r4() {
            return this.f;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final void t5(int i) {
            this.j = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int u5() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeFloat(this.f);
            parcel.writeFloat(this.g);
            parcel.writeInt(this.h);
            parcel.writeFloat(this.i);
            parcel.writeInt(this.j);
            parcel.writeInt(this.k);
            parcel.writeInt(this.l);
            parcel.writeInt(this.m);
            parcel.writeByte(this.n ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.g = 1.0f;
            this.h = -1;
            this.i = -1.0f;
            this.l = 16777215;
            this.m = 16777215;
        }
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.o.d properties = RecyclerView.o.getProperties(context, attributeSet, i, i2);
        int i3 = properties.a;
        if (i3 != 0) {
            if (i3 == 1) {
                if (properties.c) {
                    I(3);
                } else {
                    I(2);
                }
            }
        } else if (properties.c) {
            I(1);
        } else {
            I(0);
        }
        J(1);
        H(4);
        this.w = context;
    }

    @Override // xsna.eor
    public final void f(com.google.android.flexbox.a aVar) {
    }
}
