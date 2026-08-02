package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.q;
import androidx.recyclerview.widget.r;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import xsna.lhg;

/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.o implements r.h, RecyclerView.z.b {
    public int b;
    public c c;
    public f0 d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public final boolean i;
    public int j;
    public int k;
    public boolean l;
    public SavedState m;
    public final a n;
    public final b o;
    public int p;
    public final int[] q;

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes12.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int b;
        public int c;
        public boolean d;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState();
                savedState.b = parcel.readInt();
                savedState.c = parcel.readInt();
                savedState.d = parcel.readInt() == 1;
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState() {
        }

        public final boolean d() {
            return this.b >= 0;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final void e() {
            this.b = -1;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
            parcel.writeInt(this.d ? 1 : 0);
        }

        @SuppressLint({"UnknownNullness"})
        public SavedState(SavedState savedState) {
            this.b = savedState.b;
            this.c = savedState.c;
            this.d = savedState.d;
        }
    }

    public static class a {
        public f0 a;
        public int b;
        public int c;
        public boolean d;
        public boolean e;

        public a() {
            d();
        }

        public final void a() {
            this.c = this.d ? this.a.g() : this.a.k();
        }

        public final void b(int i, View view) {
            if (this.d) {
                this.c = this.a.m() + this.a.b(view);
            } else {
                this.c = this.a.e(view);
            }
            this.b = i;
        }

        public final void c(int i, View view) {
            int m = this.a.m();
            if (m >= 0) {
                b(i, view);
                return;
            }
            this.b = i;
            if (!this.d) {
                int e = this.a.e(view);
                int k = e - this.a.k();
                this.c = e;
                if (k > 0) {
                    int g = (this.a.g() - Math.min(0, (this.a.g() - m) - this.a.b(view))) - (this.a.c(view) + e);
                    if (g < 0) {
                        this.c -= Math.min(k, -g);
                        return;
                    }
                    return;
                }
                return;
            }
            int g2 = (this.a.g() - m) - this.a.b(view);
            this.c = this.a.g() - g2;
            if (g2 > 0) {
                int c = this.c - this.a.c(view);
                int k2 = this.a.k();
                int min = c - (Math.min(this.a.e(view) - k2, 0) + k2);
                if (min < 0) {
                    this.c = Math.min(g2, -min) + this.c;
                }
            }
        }

        public final void d() {
            this.b = -1;
            this.c = Integer.MIN_VALUE;
            this.d = false;
            this.e = false;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AnchorInfo{mPosition=");
            sb.append(this.b);
            sb.append(", mCoordinate=");
            sb.append(this.c);
            sb.append(", mLayoutFromEnd=");
            sb.append(this.d);
            sb.append(", mValid=");
            return defpackage.q0.a(sb, this.e, '}');
        }
    }

    public static class b {
        public int a;
        public boolean b;
        public boolean c;
        public boolean d;
    }

    /* loaded from: classes12.dex */
    public static class c {
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int j;
        public boolean l;
        public boolean a = true;
        public int h = 0;
        public int i = 0;
        public List<RecyclerView.e0> k = null;

        public final void a() {
            b(null);
        }

        public final void b(View view) {
            int layoutPosition;
            int size = this.k.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = this.k.get(i2).itemView;
                RecyclerView.p pVar = (RecyclerView.p) view3.getLayoutParams();
                if (view3 != view && !pVar.b.isRemoved() && (layoutPosition = (pVar.b.getLayoutPosition() - this.d) * this.e) >= 0 && layoutPosition < i) {
                    view2 = view3;
                    if (layoutPosition == 0) {
                        break;
                    } else {
                        i = layoutPosition;
                    }
                }
            }
            if (view2 == null) {
                this.d = -1;
            } else {
                this.d = ((RecyclerView.p) view2.getLayoutParams()).b.getLayoutPosition();
            }
        }

        public final boolean c(RecyclerView.a0 a0Var) {
            int i = this.d;
            return i >= 0 && i < a0Var.b();
        }

        public final View d(RecyclerView.v vVar) {
            List<RecyclerView.e0> list = this.k;
            if (list == null) {
                View f = vVar.f(this.d);
                this.d += this.e;
                return f;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = this.k.get(i).itemView;
                RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
                if (!pVar.b.isRemoved() && this.d == pVar.b.getLayoutPosition()) {
                    b(view);
                    return view;
                }
            }
            return null;
        }
    }

    public LinearLayoutManager() {
        this(1, false);
    }

    public View A(RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        q();
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
        int b2 = a0Var.b();
        int k = this.d.k();
        int g = this.d.g();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i2 != i) {
            View childAt = getChildAt(i2);
            int position = getPosition(childAt);
            int e = this.d.e(childAt);
            int b3 = this.d.b(childAt);
            if (position >= 0 && position < b2) {
                if (!((RecyclerView.p) childAt.getLayoutParams()).f()) {
                    boolean z3 = b3 <= k && e < k;
                    boolean z4 = e >= g && b3 > g;
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

    public final int B(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z) {
        int g;
        int g2 = this.d.g() - i;
        if (g2 <= 0) {
            return 0;
        }
        int i2 = -scrollBy(-g2, vVar, a0Var);
        int i3 = i + i2;
        if (!z || (g = this.d.g() - i3) <= 0) {
            return i2;
        }
        this.d.p(g);
        return g + i2;
    }

    public final int C(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z) {
        int k;
        int k2 = i - this.d.k();
        if (k2 <= 0) {
            return 0;
        }
        int i2 = -scrollBy(k2, vVar, a0Var);
        int i3 = i + i2;
        if (!z || (k = i3 - this.d.k()) <= 0) {
            return i2;
        }
        this.d.p(-k);
        return i2 - k;
    }

    public final View D() {
        return getChildAt(this.g ? 0 : getChildCount() - 1);
    }

    public final View E() {
        return getChildAt(this.g ? getChildCount() - 1 : 0);
    }

    @Deprecated
    public int F(RecyclerView.a0 a0Var) {
        if (a0Var.a != -1) {
            return this.d.l();
        }
        return 0;
    }

    public void G(RecyclerView.v vVar, RecyclerView.a0 a0Var, c cVar, b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int paddingLeft;
        int d;
        int i5;
        int i6;
        View d2 = cVar.d(vVar);
        if (d2 == null) {
            bVar.b = true;
            return;
        }
        RecyclerView.p pVar = (RecyclerView.p) d2.getLayoutParams();
        if (cVar.k == null) {
            if (this.g == (cVar.f == -1)) {
                addView(d2);
            } else {
                addView(d2, 0);
            }
        } else {
            if (this.g == (cVar.f == -1)) {
                addDisappearingView(d2);
            } else {
                addDisappearingView(d2, 0);
            }
        }
        measureChildWithMargins(d2, 0, 0);
        bVar.a = this.d.c(d2);
        if (this.b == 1) {
            if (isLayoutRTL()) {
                d = getWidth() - getPaddingRight();
                paddingLeft = d - this.d.d(d2);
            } else {
                paddingLeft = getPaddingLeft();
                d = this.d.d(d2) + paddingLeft;
            }
            if (cVar.f == -1) {
                i6 = cVar.b;
                i5 = i6 - bVar.a;
            } else {
                i5 = cVar.b;
                i6 = bVar.a + i5;
            }
            int i7 = paddingLeft;
            i4 = i5;
            i3 = i7;
            i2 = i6;
            i = d;
        } else {
            int paddingTop = getPaddingTop();
            int d3 = this.d.d(d2) + paddingTop;
            if (cVar.f == -1) {
                int i8 = cVar.b;
                i3 = i8 - bVar.a;
                i = i8;
                i2 = d3;
            } else {
                int i9 = cVar.b;
                i = bVar.a + i9;
                i2 = d3;
                i3 = i9;
            }
            i4 = paddingTop;
        }
        layoutDecoratedWithMargins(d2, i3, i4, i, i2);
        if (pVar.f() || pVar.e()) {
            bVar.c = true;
        }
        bVar.d = d2.hasFocusable();
    }

    public final void I(RecyclerView.v vVar, c cVar) {
        if (!cVar.a || cVar.l) {
            return;
        }
        int i = cVar.g;
        int i2 = cVar.i;
        if (cVar.f == -1) {
            int childCount = getChildCount();
            if (i < 0) {
                return;
            }
            int f = (this.d.f() - i) + i2;
            if (this.g) {
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = getChildAt(i3);
                    if (this.d.e(childAt) < f || this.d.o(childAt) < f) {
                        J(vVar, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = childCount - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View childAt2 = getChildAt(i5);
                if (this.d.e(childAt2) < f || this.d.o(childAt2) < f) {
                    J(vVar, i4, i5);
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
        if (!this.g) {
            for (int i7 = 0; i7 < childCount2; i7++) {
                View childAt3 = getChildAt(i7);
                if (this.d.b(childAt3) > i6 || this.d.n(childAt3) > i6) {
                    J(vVar, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = childCount2 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View childAt4 = getChildAt(i9);
            if (this.d.b(childAt4) > i6 || this.d.n(childAt4) > i6) {
                J(vVar, i8, i9);
                return;
            }
        }
    }

    public final void J(RecyclerView.v vVar, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                removeAndRecycleViewAt(i, vVar);
                i--;
            }
        } else {
            for (int i3 = i2 - 1; i3 >= i; i3--) {
                removeAndRecycleViewAt(i3, vVar);
            }
        }
    }

    public void K(int i, int i2) {
        this.j = i;
        this.k = i2;
        SavedState savedState = this.m;
        if (savedState != null) {
            savedState.e();
        }
        requestLayout();
    }

    public void L(boolean z) {
        assertNotInLayoutOrScroll(null);
        if (this.h == z) {
            return;
        }
        this.h = z;
        requestLayout();
    }

    public final void M(int i, int i2, boolean z, RecyclerView.a0 a0Var) {
        int k;
        this.c.l = this.d.i() == 0 && this.d.f() == 0;
        this.c.f = i;
        int[] iArr = this.q;
        iArr[0] = 0;
        iArr[1] = 0;
        o(a0Var, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        boolean z2 = i == 1;
        c cVar = this.c;
        int i3 = z2 ? max2 : max;
        cVar.h = i3;
        if (!z2) {
            max = max2;
        }
        cVar.i = max;
        if (z2) {
            cVar.h = this.d.h() + i3;
            View D = D();
            c cVar2 = this.c;
            cVar2.e = this.g ? -1 : 1;
            int position = getPosition(D);
            c cVar3 = this.c;
            cVar2.d = position + cVar3.e;
            cVar3.b = this.d.b(D);
            k = this.d.b(D) - this.d.g();
        } else {
            View E = E();
            c cVar4 = this.c;
            cVar4.h = this.d.k() + cVar4.h;
            c cVar5 = this.c;
            cVar5.e = this.g ? 1 : -1;
            int position2 = getPosition(E);
            c cVar6 = this.c;
            cVar5.d = position2 + cVar6.e;
            cVar6.b = this.d.e(E);
            k = (-this.d.e(E)) + this.d.k();
        }
        c cVar7 = this.c;
        cVar7.c = i2;
        if (z) {
            cVar7.c = i2 - k;
        }
        cVar7.g = k;
    }

    public final void N(int i, int i2) {
        this.c.c = this.d.g() - i2;
        c cVar = this.c;
        cVar.e = this.g ? -1 : 1;
        cVar.d = i;
        cVar.f = 1;
        cVar.b = i2;
        cVar.g = Integer.MIN_VALUE;
    }

    public final void O(int i, int i2) {
        this.c.c = i2 - this.d.k();
        c cVar = this.c;
        cVar.d = i;
        cVar.e = this.g ? 1 : -1;
        cVar.f = -1;
        cVar.b = i2;
        cVar.g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @SuppressLint({"UnknownNullness"})
    public final void assertNotInLayoutOrScroll(String str) {
        if (this.m == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    @Override // androidx.recyclerview.widget.r.h
    public final void b(@NonNull View view, @NonNull View view2) {
        assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        q();
        resolveShouldLayoutReverse();
        int position = getPosition(view);
        int position2 = getPosition(view2);
        char c2 = position < position2 ? (char) 1 : (char) 65535;
        if (this.g) {
            if (c2 == 1) {
                K(position2, this.d.g() - (this.d.c(view) + this.d.e(view2)));
                return;
            } else {
                K(position2, this.d.g() - this.d.b(view2));
                return;
            }
        }
        if (c2 == 65535) {
            K(position2, this.d.e(view2));
        } else {
            K(position2, this.d.b(view2) - this.d.c(view));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean canScrollHorizontally() {
        return this.b == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean canScrollVertically() {
        return this.b == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @SuppressLint({"UnknownNullness"})
    public final void collectAdjacentPrefetchPositions(int i, int i2, RecyclerView.a0 a0Var, RecyclerView.o.c cVar) {
        if (this.b != 0) {
            i = i2;
        }
        if (getChildCount() == 0 || i == 0) {
            return;
        }
        q();
        M(i > 0 ? 1 : -1, Math.abs(i), true, a0Var);
        p(a0Var, this.c, cVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @SuppressLint({"UnknownNullness"})
    public final void collectInitialPrefetchPositions(int i, RecyclerView.o.c cVar) {
        boolean z;
        int i2;
        SavedState savedState = this.m;
        if (savedState == null || !savedState.d()) {
            resolveShouldLayoutReverse();
            z = this.g;
            i2 = this.j;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            SavedState savedState2 = this.m;
            z = savedState2.d;
            i2 = savedState2.b;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.p && i2 >= 0 && i2 < i; i4++) {
            ((q.b) cVar).a(i2, 0);
            i2 += i3;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollExtent(RecyclerView.a0 a0Var) {
        return computeScrollExtent(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollOffset(RecyclerView.a0 a0Var) {
        return computeScrollOffset(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollRange(RecyclerView.a0 a0Var) {
        return computeScrollRange(a0Var);
    }

    public final int computeScrollExtent(RecyclerView.a0 a0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        q();
        f0 f0Var = this.d;
        boolean z = !this.i;
        return m0.a(a0Var, f0Var, u(z), t(z), this, this.i);
    }

    public final int computeScrollOffset(RecyclerView.a0 a0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        q();
        f0 f0Var = this.d;
        boolean z = !this.i;
        return m0.b(a0Var, f0Var, u(z), t(z), this, this.i, this.g);
    }

    public final int computeScrollRange(RecyclerView.a0 a0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        q();
        f0 f0Var = this.d;
        boolean z = !this.i;
        return m0.c(a0Var, f0Var, u(z), t(z), this, this.i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z.b
    @SuppressLint({"UnknownNullness"})
    public PointF computeScrollVectorForPosition(int i) {
        if (getChildCount() == 0) {
            return null;
        }
        int i2 = (i < getPosition(getChildAt(0))) != this.g ? -1 : 1;
        return this.b == 0 ? new PointF(i2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) : new PointF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollExtent(RecyclerView.a0 a0Var) {
        return computeScrollExtent(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollOffset(RecyclerView.a0 a0Var) {
        return computeScrollOffset(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollRange(RecyclerView.a0 a0Var) {
        return computeScrollRange(a0Var);
    }

    public final int convertFocusDirectionToLayoutDirection(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.b == 1) ? 1 : Integer.MIN_VALUE : this.b == 0 ? 1 : Integer.MIN_VALUE : this.b == 1 ? -1 : Integer.MIN_VALUE : this.b == 0 ? -1 : Integer.MIN_VALUE : (this.b != 1 && isLayoutRTL()) ? -1 : 1 : (this.b != 1 && isLayoutRTL()) ? 1 : -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @SuppressLint({"UnknownNullness"})
    public final View findViewByPosition(int i) {
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

    public int firstCompletelyVisibleItemPosition() {
        return s();
    }

    public int firstVisibleItemPosition() {
        return v();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @SuppressLint({"UnknownNullness"})
    public RecyclerView.p generateDefaultLayoutParams() {
        return new RecyclerView.p(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean isAutoMeasureEnabled() {
        return true;
    }

    public final boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    public int lastCompletelyVisibleItemPosition() {
        return w();
    }

    public int lastVisibleItemPosition() {
        return x();
    }

    public void o(@NonNull RecyclerView.a0 a0Var, @NonNull int[] iArr) {
        int i;
        int F = F(a0Var);
        if (this.c.f == -1) {
            i = 0;
        } else {
            i = F;
            F = 0;
        }
        iArr[0] = F;
        iArr[1] = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @SuppressLint({"UnknownNullness"})
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.v vVar) {
        super.onDetachedFromWindow(recyclerView, vVar);
        if (this.l) {
            removeAndRecycleAllViews(vVar);
            vVar.c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @SuppressLint({"UnknownNullness"})
    public View onFocusSearchFailed(View view, int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        int convertFocusDirectionToLayoutDirection;
        resolveShouldLayoutReverse();
        if (getChildCount() != 0 && (convertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i)) != Integer.MIN_VALUE) {
            q();
            M(convertFocusDirectionToLayoutDirection, (int) (this.d.l() * 0.33333334f), false, a0Var);
            c cVar = this.c;
            cVar.g = Integer.MIN_VALUE;
            cVar.a = false;
            r(vVar, cVar, a0Var, true);
            View y = convertFocusDirectionToLayoutDirection == -1 ? this.g ? y(getChildCount() - 1, -1) : y(0, getChildCount()) : this.g ? y(0, getChildCount()) : y(getChildCount() - 1, -1);
            View E = convertFocusDirectionToLayoutDirection == -1 ? E() : D();
            if (!E.hasFocusable()) {
                return y;
            }
            if (y != null) {
                return E;
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @SuppressLint({"UnknownNullness"})
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(v());
            accessibilityEvent.setToIndex(x());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @SuppressLint({"UnknownNullness"})
    public void onLayoutChildren(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        View A;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int B;
        int i6;
        View findViewByPosition;
        int e;
        int i7;
        int i8 = -1;
        if (!(this.m == null && this.j == -1) && a0Var.b() == 0) {
            removeAndRecycleAllViews(vVar);
            return;
        }
        SavedState savedState = this.m;
        if (savedState != null && savedState.d()) {
            this.j = this.m.b;
        }
        q();
        this.c.a = false;
        resolveShouldLayoutReverse();
        View focusedChild = getFocusedChild();
        a aVar = this.n;
        boolean z = true;
        if (!aVar.e || this.j != -1 || this.m != null) {
            aVar.d();
            aVar.d = this.g ^ this.h;
            if (!a0Var.g && (i = this.j) != -1) {
                if (i < 0 || i >= a0Var.b()) {
                    this.j = -1;
                    this.k = Integer.MIN_VALUE;
                } else {
                    aVar.b = this.j;
                    SavedState savedState2 = this.m;
                    if (savedState2 != null && savedState2.d()) {
                        boolean z2 = this.m.d;
                        aVar.d = z2;
                        if (z2) {
                            aVar.c = this.d.g() - this.m.c;
                        } else {
                            aVar.c = this.d.k() + this.m.c;
                        }
                    } else if (this.k == Integer.MIN_VALUE) {
                        View findViewByPosition2 = findViewByPosition(this.j);
                        if (findViewByPosition2 == null) {
                            if (getChildCount() > 0) {
                                aVar.d = (this.j < getPosition(getChildAt(0))) == this.g;
                            }
                            aVar.a();
                        } else if (this.d.c(findViewByPosition2) > this.d.l()) {
                            aVar.a();
                        } else if (this.d.e(findViewByPosition2) - this.d.k() < 0) {
                            aVar.c = this.d.k();
                            aVar.d = false;
                        } else if (this.d.g() - this.d.b(findViewByPosition2) < 0) {
                            aVar.c = this.d.g();
                            aVar.d = true;
                        } else {
                            aVar.c = aVar.d ? this.d.m() + this.d.b(findViewByPosition2) : this.d.e(findViewByPosition2);
                        }
                    } else {
                        boolean z3 = this.g;
                        aVar.d = z3;
                        if (z3) {
                            aVar.c = this.d.g() - this.k;
                        } else {
                            aVar.c = this.d.k() + this.k;
                        }
                    }
                    aVar.e = true;
                }
            }
            if (getChildCount() != 0) {
                View focusedChild2 = getFocusedChild();
                if (focusedChild2 != null) {
                    RecyclerView.p pVar = (RecyclerView.p) focusedChild2.getLayoutParams();
                    if (!pVar.f() && pVar.d() >= 0 && pVar.d() < a0Var.b()) {
                        aVar.c(getPosition(focusedChild2), focusedChild2);
                        aVar.e = true;
                    }
                }
                boolean z4 = this.e;
                boolean z5 = this.h;
                if (z4 == z5 && (A = A(vVar, a0Var, aVar.d, z5)) != null) {
                    aVar.b(getPosition(A), A);
                    if (!a0Var.g && supportsPredictiveItemAnimations()) {
                        int e2 = this.d.e(A);
                        int b2 = this.d.b(A);
                        int k = this.d.k();
                        int g = this.d.g();
                        boolean z6 = b2 <= k && e2 < k;
                        boolean z7 = e2 >= g && b2 > g;
                        if (z6 || z7) {
                            if (aVar.d) {
                                k = g;
                            }
                            aVar.c = k;
                        }
                    }
                    aVar.e = true;
                }
            }
            aVar.a();
            aVar.b = this.h ? a0Var.b() - 1 : 0;
            aVar.e = true;
        } else if (focusedChild != null && (this.d.e(focusedChild) >= this.d.g() || this.d.b(focusedChild) <= this.d.k())) {
            aVar.c(getPosition(focusedChild), focusedChild);
        }
        c cVar = this.c;
        cVar.f = cVar.j >= 0 ? 1 : -1;
        int[] iArr = this.q;
        iArr[0] = 0;
        iArr[1] = 0;
        o(a0Var, iArr);
        int k2 = this.d.k() + Math.max(0, iArr[0]);
        int h = this.d.h() + Math.max(0, iArr[1]);
        if (a0Var.g && (i6 = this.j) != -1 && this.k != Integer.MIN_VALUE && (findViewByPosition = findViewByPosition(i6)) != null) {
            if (this.g) {
                i7 = this.d.g() - this.d.b(findViewByPosition);
                e = this.k;
            } else {
                e = this.d.e(findViewByPosition) - this.d.k();
                i7 = this.k;
            }
            int i9 = i7 - e;
            if (i9 > 0) {
                k2 += i9;
            } else {
                h -= i9;
            }
        }
        if (!aVar.d ? !this.g : this.g) {
            i8 = 1;
        }
        H(vVar, a0Var, aVar, i8);
        detachAndScrapAttachedViews(vVar);
        this.c.l = this.d.i() == 0 && this.d.f() == 0;
        this.c.getClass();
        this.c.i = 0;
        if (aVar.d) {
            O(aVar.b, aVar.c);
            c cVar2 = this.c;
            cVar2.h = k2;
            r(vVar, cVar2, a0Var, false);
            c cVar3 = this.c;
            i3 = cVar3.b;
            int i10 = cVar3.d;
            int i11 = cVar3.c;
            if (i11 > 0) {
                h += i11;
            }
            N(aVar.b, aVar.c);
            c cVar4 = this.c;
            cVar4.h = h;
            cVar4.d += cVar4.e;
            r(vVar, cVar4, a0Var, false);
            c cVar5 = this.c;
            i2 = cVar5.b;
            int i12 = cVar5.c;
            if (i12 > 0) {
                O(i10, i3);
                c cVar6 = this.c;
                cVar6.h = i12;
                r(vVar, cVar6, a0Var, false);
                i3 = this.c.b;
            }
        } else {
            N(aVar.b, aVar.c);
            c cVar7 = this.c;
            cVar7.h = h;
            r(vVar, cVar7, a0Var, false);
            c cVar8 = this.c;
            i2 = cVar8.b;
            int i13 = cVar8.d;
            int i14 = cVar8.c;
            if (i14 > 0) {
                k2 += i14;
            }
            O(aVar.b, aVar.c);
            c cVar9 = this.c;
            cVar9.h = k2;
            cVar9.d += cVar9.e;
            r(vVar, cVar9, a0Var, false);
            c cVar10 = this.c;
            int i15 = cVar10.b;
            int i16 = cVar10.c;
            if (i16 > 0) {
                N(i13, i2);
                c cVar11 = this.c;
                cVar11.h = i16;
                r(vVar, cVar11, a0Var, false);
                i2 = this.c.b;
            }
            i3 = i15;
        }
        if (getChildCount() > 0) {
            if (this.g ^ this.h) {
                int B2 = B(i2, vVar, a0Var, true);
                i4 = i3 + B2;
                i5 = i2 + B2;
                B = C(i4, vVar, a0Var, false);
            } else {
                int C = C(i3, vVar, a0Var, true);
                i4 = i3 + C;
                i5 = i2 + C;
                B = B(i5, vVar, a0Var, false);
            }
            i3 = i4 + B;
            i2 = i5 + B;
        }
        if (a0Var.k && getChildCount() != 0 && !a0Var.g && supportsPredictiveItemAnimations()) {
            List<RecyclerView.e0> list = vVar.d;
            int size = list.size();
            int position = getPosition(getChildAt(0));
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            while (i17 < size) {
                RecyclerView.e0 e0Var = list.get(i17);
                if (!e0Var.isRemoved()) {
                    if ((e0Var.getLayoutPosition() < position ? z : false) != this.g) {
                        i18 += this.d.c(e0Var.itemView);
                    } else {
                        i19 += this.d.c(e0Var.itemView);
                    }
                }
                i17++;
                z = true;
            }
            this.c.k = list;
            if (i18 > 0) {
                O(getPosition(E()), i3);
                c cVar12 = this.c;
                cVar12.h = i18;
                cVar12.c = 0;
                cVar12.a();
                r(vVar, this.c, a0Var, false);
            }
            if (i19 > 0) {
                N(getPosition(D()), i2);
                c cVar13 = this.c;
                cVar13.h = i19;
                cVar13.c = 0;
                cVar13.a();
                r(vVar, this.c, a0Var, false);
            }
            this.c.k = null;
        }
        if (a0Var.g) {
            aVar.d();
        } else {
            f0 f0Var = this.d;
            f0Var.b = f0Var.l();
        }
        this.e = this.h;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @SuppressLint({"UnknownNullness"})
    public void onLayoutCompleted(RecyclerView.a0 a0Var) {
        super.onLayoutCompleted(a0Var);
        this.m = null;
        this.j = -1;
        this.k = Integer.MIN_VALUE;
        this.n.d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @SuppressLint({"UnknownNullness"})
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.m = savedState;
            if (this.j != -1) {
                savedState.e();
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @SuppressLint({"UnknownNullness"})
    public Parcelable onSaveInstanceState() {
        SavedState savedState = this.m;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        if (getChildCount() <= 0) {
            savedState2.e();
            return savedState2;
        }
        q();
        boolean z = this.e ^ this.g;
        savedState2.d = z;
        if (z) {
            View D = D();
            savedState2.c = this.d.g() - this.d.b(D);
            savedState2.b = getPosition(D);
            return savedState2;
        }
        View E = E();
        savedState2.b = getPosition(E);
        savedState2.c = this.d.e(E) - this.d.k();
        return savedState2;
    }

    public void p(RecyclerView.a0 a0Var, c cVar, RecyclerView.o.c cVar2) {
        int i = cVar.d;
        if (i < 0 || i >= a0Var.b()) {
            return;
        }
        ((q.b) cVar2).a(i, Math.max(0, cVar.g));
    }

    public final void q() {
        if (this.c == null) {
            this.c = new c();
        }
    }

    public final int r(RecyclerView.v vVar, c cVar, RecyclerView.a0 a0Var, boolean z) {
        int i = cVar.c;
        int i2 = cVar.g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                cVar.g = i2 + i;
            }
            I(vVar, cVar);
        }
        int i3 = cVar.c + cVar.h;
        while (true) {
            if ((!cVar.l && i3 <= 0) || !cVar.c(a0Var)) {
                break;
            }
            b bVar = this.o;
            bVar.a = 0;
            bVar.b = false;
            bVar.c = false;
            bVar.d = false;
            G(vVar, a0Var, cVar, bVar);
            if (!bVar.b) {
                int i4 = cVar.b;
                int i5 = bVar.a;
                cVar.b = (cVar.f * i5) + i4;
                if (!bVar.c || cVar.k != null || !a0Var.g) {
                    cVar.c -= i5;
                    i3 -= i5;
                }
                int i6 = cVar.g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + i5;
                    cVar.g = i7;
                    int i8 = cVar.c;
                    if (i8 < 0) {
                        cVar.g = i7 + i8;
                    }
                    I(vVar, cVar);
                }
                if (z && bVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - cVar.c;
    }

    public final void resolveShouldLayoutReverse() {
        if (this.b == 1 || !isLayoutRTL()) {
            this.g = this.f;
        } else {
            this.g = !this.f;
        }
    }

    public final int s() {
        View z = z(0, getChildCount(), true, false);
        if (z == null) {
            return -1;
        }
        return getPosition(z);
    }

    public final int scrollBy(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        q();
        this.c.a = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        M(i2, abs, true, a0Var);
        c cVar = this.c;
        int r = r(vVar, cVar, a0Var, false) + cVar.g;
        if (r < 0) {
            return 0;
        }
        if (abs > r) {
            i = i2 * r;
        }
        this.d.p(-i);
        this.c.j = i;
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @SuppressLint({"UnknownNullness"})
    public int scrollHorizontallyBy(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.b == 1) {
            return 0;
        }
        return scrollBy(i, vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void scrollToPosition(int i) {
        this.j = i;
        this.k = Integer.MIN_VALUE;
        SavedState savedState = this.m;
        if (savedState != null) {
            savedState.e();
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @SuppressLint({"UnknownNullness"})
    public int scrollVerticallyBy(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.b == 0) {
            return 0;
        }
        return scrollBy(i, vVar, a0Var);
    }

    public final void setOrientation(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(lhg.a(i, "invalid orientation:"));
        }
        assertNotInLayoutOrScroll(null);
        if (i != this.b || this.d == null) {
            f0 a2 = f0.a(this, i);
            this.d = a2;
            this.n.a = a2;
            this.b = i;
            requestLayout();
        }
    }

    public final void setReverseLayout(boolean z) {
        assertNotInLayoutOrScroll(null);
        if (z == this.f) {
            return;
        }
        this.f = z;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean shouldMeasureTwice() {
        return (getHeightMode() == 1073741824 || getWidthMode() == 1073741824 || !hasFlexibleChildInBothOrientations()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @SuppressLint({"UnknownNullness"})
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i) {
        v vVar = new v(recyclerView.getContext());
        vVar.setTargetPosition(i);
        startSmoothScroll(vVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean supportsPredictiveItemAnimations() {
        return this.m == null && this.e == this.h;
    }

    public final View t(boolean z) {
        return this.g ? z(0, getChildCount(), z, true) : z(getChildCount() - 1, -1, z, true);
    }

    public final View u(boolean z) {
        return this.g ? z(getChildCount() - 1, -1, z, true) : z(0, getChildCount(), z, true);
    }

    public int v() {
        View z = z(0, getChildCount(), false, true);
        if (z == null) {
            return -1;
        }
        return getPosition(z);
    }

    public final int w() {
        View z = z(getChildCount() - 1, -1, true, false);
        if (z == null) {
            return -1;
        }
        return getPosition(z);
    }

    public int x() {
        View z = z(getChildCount() - 1, -1, false, true);
        if (z == null) {
            return -1;
        }
        return getPosition(z);
    }

    public final View y(int i, int i2) {
        int i3;
        int i4;
        q();
        if (i2 <= i && i2 >= i) {
            return getChildAt(i);
        }
        if (this.d.e(getChildAt(i)) < this.d.k()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.b == 0 ? this.mHorizontalBoundCheck.a(i, i2, i3, i4) : this.mVerticalBoundCheck.a(i, i2, i3, i4);
    }

    public final View z(int i, int i2, boolean z, boolean z2) {
        q();
        int i3 = z ? 24579 : 320;
        int i4 = z2 ? 320 : 0;
        return this.b == 0 ? this.mHorizontalBoundCheck.a(i, i2, i3, i4) : this.mVerticalBoundCheck.a(i, i2, i3, i4);
    }

    public LinearLayoutManager(int i, boolean z) {
        this.b = 1;
        this.f = false;
        this.g = false;
        this.h = false;
        this.i = true;
        this.j = -1;
        this.k = Integer.MIN_VALUE;
        this.m = null;
        this.n = new a();
        this.o = new b();
        this.p = 2;
        this.q = new int[2];
        setOrientation(i);
        setReverseLayout(z);
    }

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.b = 1;
        this.f = false;
        this.g = false;
        this.h = false;
        this.i = true;
        this.j = -1;
        this.k = Integer.MIN_VALUE;
        this.m = null;
        this.n = new a();
        this.o = new b();
        this.p = 2;
        this.q = new int[2];
        RecyclerView.o.d properties = RecyclerView.o.getProperties(context, attributeSet, i, i2);
        setOrientation(properties.a);
        setReverseLayout(properties.c);
        L(properties.d);
    }

    public void H(RecyclerView.v vVar, RecyclerView.a0 a0Var, a aVar, int i) {
    }
}
