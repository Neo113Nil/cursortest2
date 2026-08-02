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
import xsna.lhg;

/* loaded from: classes12.dex */
public class LoopingLinearLayoutManager extends RecyclerView.o implements r.h, RecyclerView.z.b {
    public int b;
    public c c;
    public f0 d;
    public boolean e;
    public final boolean f;
    public boolean g;
    public final boolean h;
    public final boolean i;
    public int j;
    public int k;
    public SavedState l;
    public final a m;
    public final b n;
    public final int o;
    public final int[] p;

    @SuppressLint({"BanParcelableUsage"})
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

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
            parcel.writeInt(this.d ? 1 : 0);
        }

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

    public static class c {
        public boolean a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
        public int j;
        public boolean k;
    }

    public LoopingLinearLayoutManager() {
        this.b = 1;
        this.f = false;
        this.g = false;
        this.h = false;
        this.i = true;
        this.j = -1;
        this.k = Integer.MIN_VALUE;
        this.l = null;
        this.m = new a();
        this.n = new b();
        this.o = 2;
        this.p = new int[2];
        setOrientation(0);
        assertNotInLayoutOrScroll(null);
        if (this.f) {
            this.f = false;
            requestLayout();
        }
    }

    public final int A(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z) {
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

    public final View B() {
        return getChildAt(this.g ? 0 : getChildCount() - 1);
    }

    public final View C() {
        return getChildAt(this.g ? getChildCount() - 1 : 0);
    }

    public final void D(RecyclerView.v vVar, c cVar) {
        if (!cVar.a || cVar.k) {
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
                        E(vVar, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = childCount - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View childAt2 = getChildAt(i5);
                if (this.d.e(childAt2) < f || this.d.o(childAt2) < f) {
                    E(vVar, i4, i5);
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
                    E(vVar, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = childCount2 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View childAt4 = getChildAt(i9);
            if (this.d.b(childAt4) > i6 || this.d.n(childAt4) > i6) {
                E(vVar, i8, i9);
                return;
            }
        }
    }

    public final void E(RecyclerView.v vVar, int i, int i2) {
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

    public final void F() {
        if (this.b == 1 || getLayoutDirection() != 1) {
            this.g = this.f;
        } else {
            this.g = !this.f;
        }
    }

    public final void G(int i, int i2) {
        this.j = i;
        this.k = i2;
        SavedState savedState = this.l;
        if (savedState != null) {
            savedState.b = -1;
        }
        requestLayout();
    }

    public final void H(int i, int i2, boolean z, RecyclerView.a0 a0Var) {
        int k;
        this.c.k = this.d.i() == 0 && this.d.f() == 0;
        this.c.f = i;
        int[] iArr = this.p;
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
            View B = B();
            c cVar2 = this.c;
            cVar2.e = this.g ? -1 : 1;
            int position = getPosition(B);
            c cVar3 = this.c;
            cVar2.d = position + cVar3.e;
            cVar3.b = this.d.b(B);
            k = this.d.b(B) - this.d.g();
        } else {
            View C = C();
            c cVar4 = this.c;
            cVar4.h = this.d.k() + cVar4.h;
            c cVar5 = this.c;
            cVar5.e = this.g ? 1 : -1;
            int position2 = getPosition(C);
            c cVar6 = this.c;
            cVar5.d = position2 + cVar6.e;
            cVar6.b = this.d.e(C);
            k = (-this.d.e(C)) + this.d.k();
        }
        c cVar7 = this.c;
        cVar7.c = i2;
        if (z) {
            cVar7.c = i2 - k;
        }
        cVar7.g = k;
    }

    public final void I(int i, int i2) {
        this.c.c = this.d.g() - i2;
        c cVar = this.c;
        cVar.e = this.g ? -1 : 1;
        cVar.d = i;
        cVar.f = 1;
        cVar.b = i2;
        cVar.g = Integer.MIN_VALUE;
    }

    public final void J(int i, int i2) {
        this.c.c = i2 - this.d.k();
        c cVar = this.c;
        cVar.d = i;
        cVar.e = this.g ? 1 : -1;
        cVar.f = -1;
        cVar.b = i2;
        cVar.g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void assertNotInLayoutOrScroll(String str) {
        if (this.l == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    @Override // androidx.recyclerview.widget.r.h
    public final void b(@NonNull View view, @NonNull View view2) {
        assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        s();
        F();
        int position = getPosition(view);
        int position2 = getPosition(view2);
        char c2 = position < position2 ? (char) 1 : (char) 65535;
        if (this.g) {
            if (c2 == 1) {
                G(position2, this.d.g() - (this.d.c(view) + this.d.e(view2)));
                return;
            } else {
                G(position2, this.d.g() - this.d.b(view2));
                return;
            }
        }
        if (c2 == 65535) {
            G(position2, this.d.e(view2));
        } else {
            G(position2, this.d.b(view2) - this.d.c(view));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean canScrollHorizontally() {
        return this.b == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean canScrollVertically() {
        return this.b == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void collectAdjacentPrefetchPositions(int i, int i2, RecyclerView.a0 a0Var, RecyclerView.o.c cVar) {
        if (this.b != 0) {
            i = i2;
        }
        if (getChildCount() == 0 || i == 0) {
            return;
        }
        s();
        H(i > 0 ? 1 : -1, Math.abs(i), true, a0Var);
        c cVar2 = this.c;
        int i3 = cVar2.d;
        if (i3 < 0 || i3 >= a0Var.b()) {
            return;
        }
        ((q.b) cVar).a(i3, Math.max(0, cVar2.g));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void collectInitialPrefetchPositions(int i, RecyclerView.o.c cVar) {
        boolean z;
        int i2;
        SavedState savedState = this.l;
        if (savedState == null || (i2 = savedState.b) < 0) {
            F();
            z = this.g;
            i2 = this.j;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = savedState.d;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.o && i2 >= 0 && i2 < i; i4++) {
            ((q.b) cVar).a(i2, 0);
            i2 += i3;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int computeHorizontalScrollExtent(RecyclerView.a0 a0Var) {
        return p(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int computeHorizontalScrollOffset(RecyclerView.a0 a0Var) {
        return q(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int computeHorizontalScrollRange(RecyclerView.a0 a0Var) {
        return r(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z.b
    public final PointF computeScrollVectorForPosition(int i) {
        if (getChildCount() == 0) {
            return null;
        }
        int i2 = (i < getPosition(getChildAt(0))) != this.g ? -1 : 1;
        return this.b == 0 ? new PointF(i2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) : new PointF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int computeVerticalScrollExtent(RecyclerView.a0 a0Var) {
        return p(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int computeVerticalScrollOffset(RecyclerView.a0 a0Var) {
        return q(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int computeVerticalScrollRange(RecyclerView.a0 a0Var) {
        return r(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
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

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final RecyclerView.p generateDefaultLayoutParams() {
        return new RecyclerView.p(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean isAutoMeasureEnabled() {
        return true;
    }

    public final void o(@NonNull RecyclerView.a0 a0Var, @NonNull int[] iArr) {
        int i;
        int l = a0Var.a != -1 ? this.d.l() : 0;
        if (this.c.f == -1) {
            i = 0;
        } else {
            i = l;
            l = 0;
        }
        iArr[0] = l;
        iArr[1] = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0033, code lost:
    
        if (r4.b == 1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0039, code lost:
    
        if (r4.b == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0045, code lost:
    
        if (getLayoutDirection() != 1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0051, code lost:
    
        if (getLayoutDirection() != 1) goto L26;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View onFocusSearchFailed(View view, int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        int i2;
        F();
        if (getChildCount() == 0) {
            return null;
        }
        if (i == 1) {
            if (this.b != 1) {
            }
            i2 = -1;
        } else if (i == 2) {
            if (this.b != 1) {
            }
            i2 = 1;
        } else if (i != 17) {
            if (i != 33) {
                if (i == 66) {
                }
            }
            i2 = Integer.MIN_VALUE;
        }
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        s();
        H(i2, (int) (this.d.l() * 0.33333334f), false, a0Var);
        c cVar = this.c;
        cVar.g = Integer.MIN_VALUE;
        cVar.a = false;
        t(vVar, cVar, a0Var, true);
        View w = i2 == -1 ? this.g ? w(getChildCount() - 1, -1) : w(0, getChildCount()) : this.g ? w(0, getChildCount()) : w(getChildCount() - 1, -1);
        View C = i2 == -1 ? C() : B();
        if (!C.hasFocusable()) {
            return w;
        }
        if (w == null) {
            return null;
        }
        return C;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            View x = x(0, getChildCount(), false, true);
            accessibilityEvent.setFromIndex(x == null ? -1 : getPosition(x));
            View x2 = x(getChildCount() - 1, -1, false, true);
            accessibilityEvent.setToIndex(x2 != null ? getPosition(x2) : -1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onLayoutChildren(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        int i;
        int i2;
        int i3;
        int i4;
        View findViewByPosition;
        int e;
        int i5;
        int i6;
        if (!(this.l == null && this.j == -1) && a0Var.b() == 0) {
            removeAndRecycleAllViews(vVar);
            return;
        }
        SavedState savedState = this.l;
        if (savedState != null && (i6 = savedState.b) >= 0) {
            this.j = i6;
        }
        s();
        this.c.a = false;
        F();
        View focusedChild = getFocusedChild();
        a aVar = this.m;
        if (!aVar.e || this.j != -1 || this.l != null) {
            aVar.d();
            aVar.d = this.g ^ this.h;
            if (!a0Var.g && (i = this.j) != -1) {
                if (i < 0 || i >= a0Var.b()) {
                    this.j = -1;
                    this.k = Integer.MIN_VALUE;
                } else {
                    int i7 = this.j;
                    aVar.b = i7;
                    SavedState savedState2 = this.l;
                    if (savedState2 != null && savedState2.b >= 0) {
                        boolean z = savedState2.d;
                        aVar.d = z;
                        if (z) {
                            aVar.c = this.d.g() - this.l.c;
                        } else {
                            aVar.c = this.d.k() + this.l.c;
                        }
                    } else if (this.k == Integer.MIN_VALUE) {
                        View findViewByPosition2 = findViewByPosition(i7);
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
                        boolean z2 = this.g;
                        aVar.d = z2;
                        if (z2) {
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
                    if (!pVar.b.isRemoved() && pVar.b.getLayoutPosition() >= 0 && pVar.b.getLayoutPosition() < a0Var.b()) {
                        aVar.c(getPosition(focusedChild2), focusedChild2);
                        aVar.e = true;
                    }
                }
                if (this.e == this.h) {
                    View y = aVar.d ? this.g ? y(0, getChildCount(), a0Var.b()) : y(getChildCount() - 1, -1, a0Var.b()) : this.g ? y(getChildCount() - 1, -1, a0Var.b()) : y(0, getChildCount(), a0Var.b());
                    if (y != null) {
                        aVar.b(getPosition(y), y);
                        aVar.e = true;
                    }
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
        int[] iArr = this.p;
        iArr[0] = 0;
        iArr[1] = 0;
        o(a0Var, iArr);
        int k = this.d.k() + Math.max(0, iArr[0]);
        int h = this.d.h() + Math.max(0, iArr[1]);
        if (a0Var.g && (i4 = this.j) != -1 && this.k != Integer.MIN_VALUE && (findViewByPosition = findViewByPosition(i4)) != null) {
            if (this.g) {
                i5 = this.d.g() - this.d.b(findViewByPosition);
                e = this.k;
            } else {
                e = this.d.e(findViewByPosition) - this.d.k();
                i5 = this.k;
            }
            int i8 = i5 - e;
            if (i8 > 0) {
                k += i8;
            } else {
                h -= i8;
            }
        }
        detachAndScrapAttachedViews(vVar);
        this.c.k = this.d.i() == 0 && this.d.f() == 0;
        this.c.getClass();
        this.c.i = 0;
        if (aVar.d) {
            J(aVar.b, aVar.c);
            c cVar2 = this.c;
            cVar2.h = k;
            t(vVar, cVar2, a0Var, false);
            c cVar3 = this.c;
            i3 = cVar3.b;
            int i9 = cVar3.d;
            int i10 = cVar3.c;
            if (i10 > 0) {
                h += i10;
            }
            I(aVar.b, aVar.c);
            c cVar4 = this.c;
            cVar4.h = h;
            cVar4.d += cVar4.e;
            t(vVar, cVar4, a0Var, false);
            c cVar5 = this.c;
            i2 = cVar5.b;
            int i11 = cVar5.c;
            if (i11 > 0) {
                J(i9, i3);
                c cVar6 = this.c;
                cVar6.h = i11;
                t(vVar, cVar6, a0Var, false);
                i3 = this.c.b;
            }
        } else {
            I(aVar.b, aVar.c);
            c cVar7 = this.c;
            cVar7.h = h;
            t(vVar, cVar7, a0Var, false);
            c cVar8 = this.c;
            i2 = cVar8.b;
            int i12 = cVar8.d;
            int i13 = cVar8.c;
            if (i13 > 0) {
                k += i13;
            }
            J(aVar.b, aVar.c);
            c cVar9 = this.c;
            cVar9.h = k;
            cVar9.d += cVar9.e;
            t(vVar, cVar9, a0Var, false);
            c cVar10 = this.c;
            int i14 = cVar10.b;
            int i15 = cVar10.c;
            if (i15 > 0) {
                I(i12, i2);
                c cVar11 = this.c;
                cVar11.h = i15;
                t(vVar, cVar11, a0Var, false);
                i2 = this.c.b;
            }
            i3 = i14;
        }
        if (getChildCount() > 0) {
            if (this.g ^ this.h) {
                A(z(i2, vVar, a0Var, true) + i3, vVar, a0Var, false);
            } else {
                z(A(i3, vVar, a0Var, true) + i2, vVar, a0Var, false);
            }
        }
        if (a0Var.k) {
            getChildCount();
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
    public final void onLayoutCompleted(RecyclerView.a0 a0Var) {
        super.onLayoutCompleted(a0Var);
        this.l = null;
        this.j = -1;
        this.k = Integer.MIN_VALUE;
        this.m.d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.l = (SavedState) parcelable;
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = this.l;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        if (getChildCount() <= 0) {
            savedState2.b = -1;
            return savedState2;
        }
        s();
        boolean z = this.e ^ this.g;
        savedState2.d = z;
        if (z) {
            View B = B();
            savedState2.c = this.d.g() - this.d.b(B);
            savedState2.b = getPosition(B);
            return savedState2;
        }
        View C = C();
        savedState2.b = getPosition(C);
        savedState2.c = this.d.e(C) - this.d.k();
        return savedState2;
    }

    public final int p(RecyclerView.a0 a0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        s();
        f0 f0Var = this.d;
        boolean z = !this.i;
        return m0.a(a0Var, f0Var, v(z), u(z), this, this.i);
    }

    public final int q(RecyclerView.a0 a0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        s();
        f0 f0Var = this.d;
        boolean z = !this.i;
        return m0.b(a0Var, f0Var, v(z), u(z), this, this.i, this.g);
    }

    public final int r(RecyclerView.a0 a0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        s();
        f0 f0Var = this.d;
        boolean z = !this.i;
        return m0.c(a0Var, f0Var, v(z), u(z), this, this.i);
    }

    public final void s() {
        if (this.c == null) {
            c cVar = new c();
            cVar.a = true;
            cVar.h = 0;
            cVar.i = 0;
            this.c = cVar;
        }
    }

    public final int scrollBy(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        s();
        this.c.a = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        H(i2, abs, true, a0Var);
        c cVar = this.c;
        int t = t(vVar, cVar, a0Var, false) + cVar.g;
        if (t < 0) {
            return 0;
        }
        if (abs > t) {
            i = i2 * t;
        }
        this.d.p(-i);
        this.c.j = i;
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int scrollHorizontallyBy(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.b == 1) {
            return 0;
        }
        return scrollBy(i, vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void scrollToPosition(int i) {
        this.j = i;
        this.k = Integer.MIN_VALUE;
        SavedState savedState = this.l;
        if (savedState != null) {
            savedState.b = -1;
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int scrollVerticallyBy(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
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
            this.m.a = a2;
            this.b = i;
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean shouldMeasureTwice() {
        return (getHeightMode() == 1073741824 || getWidthMode() == 1073741824 || !hasFlexibleChildInBothOrientations()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i) {
        v vVar = new v(recyclerView.getContext());
        vVar.setTargetPosition(i);
        startSmoothScroll(vVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean supportsPredictiveItemAnimations() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0115, code lost:
    
        if (r17.g != false) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int t(RecyclerView.v vVar, c cVar, RecyclerView.a0 a0Var, boolean z) {
        int b2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        LoopingLinearLayoutManager loopingLinearLayoutManager;
        int d;
        int i6;
        int i7 = cVar.c;
        int i8 = cVar.g;
        if (i8 != Integer.MIN_VALUE) {
            if (i7 < 0) {
                cVar.g = i8 + i7;
            }
            D(vVar, cVar);
        }
        int i9 = cVar.c + cVar.h;
        while (true) {
            if ((!cVar.k && i9 <= 0) || a0Var.b() <= 0) {
                break;
            }
            b bVar = this.n;
            bVar.a = 0;
            bVar.b = false;
            bVar.c = false;
            bVar.d = false;
            int i10 = cVar.d;
            if (i10 >= 0) {
                b2 = i10 % a0Var.b();
            } else {
                b2 = a0Var.b() - (Math.abs(cVar.d) % a0Var.b());
                if (b2 == Integer.MIN_VALUE) {
                    b2 = 0;
                }
            }
            View f = vVar.f(b2);
            cVar.d += cVar.e;
            if (f == null) {
                bVar.b = true;
            } else {
                RecyclerView.p pVar = (RecyclerView.p) f.getLayoutParams();
                if (this.g == (cVar.f == -1)) {
                    addView(f);
                } else {
                    addView(f, 0);
                }
                measureChildWithMargins(f, 0, 0);
                bVar.a = this.d.c(f);
                if (this.b == 1) {
                    if (getLayoutDirection() == 1) {
                        d = getWidth() - getPaddingRight();
                        i = d - this.d.d(f);
                    } else {
                        i = getPaddingLeft();
                        d = this.d.d(f) + i;
                    }
                    if (cVar.f == -1) {
                        i6 = cVar.b;
                        i4 = i6 - bVar.a;
                    } else {
                        i4 = cVar.b;
                        i6 = bVar.a + i4;
                    }
                    i3 = d;
                    i2 = i6;
                } else {
                    int paddingTop = getPaddingTop();
                    int d2 = this.d.d(f) + paddingTop;
                    if (cVar.f == -1) {
                        int i11 = cVar.b;
                        i3 = i11;
                        i2 = d2;
                        i5 = i11 - bVar.a;
                        loopingLinearLayoutManager = this;
                        i4 = paddingTop;
                        loopingLinearLayoutManager.layoutDecoratedWithMargins(f, i5, i4, i3, i2);
                        if (!pVar.b.isRemoved() || pVar.b.isUpdated()) {
                            bVar.c = true;
                        }
                        bVar.d = f.hasFocusable();
                    } else {
                        i = cVar.b;
                        i2 = d2;
                        i3 = bVar.a + i;
                        i4 = paddingTop;
                    }
                }
                i5 = i;
                loopingLinearLayoutManager = this;
                loopingLinearLayoutManager.layoutDecoratedWithMargins(f, i5, i4, i3, i2);
                if (!pVar.b.isRemoved()) {
                }
                bVar.c = true;
                bVar.d = f.hasFocusable();
            }
            if (!bVar.b) {
                int i12 = cVar.b;
                int i13 = bVar.a;
                cVar.b = (cVar.f * i13) + i12;
                if (!bVar.c) {
                }
                cVar.c -= i13;
                i9 -= i13;
                int i14 = cVar.g;
                if (i14 != Integer.MIN_VALUE) {
                    int i15 = i14 + i13;
                    cVar.g = i15;
                    int i16 = cVar.c;
                    if (i16 < 0) {
                        cVar.g = i15 + i16;
                    }
                    D(vVar, cVar);
                }
                if (z && bVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i7 - cVar.c;
    }

    public final View u(boolean z) {
        return this.g ? x(0, getChildCount(), z, true) : x(getChildCount() - 1, -1, z, true);
    }

    public final View v(boolean z) {
        return this.g ? x(getChildCount() - 1, -1, z, true) : x(0, getChildCount(), z, true);
    }

    public final View w(int i, int i2) {
        int i3;
        int i4;
        s();
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

    public final View x(int i, int i2, boolean z, boolean z2) {
        s();
        int i3 = z ? 24579 : 320;
        int i4 = z2 ? 320 : 0;
        return this.b == 0 ? this.mHorizontalBoundCheck.a(i, i2, i3, i4) : this.mVerticalBoundCheck.a(i, i2, i3, i4);
    }

    public final View y(int i, int i2, int i3) {
        s();
        int k = this.d.k();
        int g = this.d.g();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View childAt = getChildAt(i);
            int position = getPosition(childAt);
            if (position >= 0 && position < i3) {
                if (((RecyclerView.p) childAt.getLayoutParams()).b.isRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.d.e(childAt) < g && this.d.b(childAt) >= k) {
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

    public final int z(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z) {
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

    public LoopingLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.b = 1;
        this.f = false;
        this.g = false;
        this.h = false;
        this.i = true;
        this.j = -1;
        this.k = Integer.MIN_VALUE;
        this.l = null;
        this.m = new a();
        this.n = new b();
        this.o = 2;
        this.p = new int[2];
        RecyclerView.o.d properties = RecyclerView.o.getProperties(context, attributeSet, i, i2);
        setOrientation(properties.a);
        boolean z = properties.c;
        assertNotInLayoutOrScroll(null);
        if (z != this.f) {
            this.f = z;
            requestLayout();
        }
        boolean z2 = properties.d;
        assertNotInLayoutOrScroll(null);
        if (this.h == z2) {
            return;
        }
        this.h = z2;
        requestLayout();
    }
}
