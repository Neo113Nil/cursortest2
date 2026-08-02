package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: l, reason: collision with root package name */
    public static final Set f2268l = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(17, 66, 33, 130)));

    /* renamed from: a, reason: collision with root package name */
    public boolean f2269a;

    /* renamed from: b, reason: collision with root package name */
    public int f2270b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f2271c;

    /* renamed from: d, reason: collision with root package name */
    public View[] f2272d;

    /* renamed from: e, reason: collision with root package name */
    public final SparseIntArray f2273e;

    /* renamed from: f, reason: collision with root package name */
    public final SparseIntArray f2274f;

    /* renamed from: g, reason: collision with root package name */
    public final l2 f2275g;

    /* renamed from: h, reason: collision with root package name */
    public final Rect f2276h;

    /* renamed from: i, reason: collision with root package name */
    public int f2277i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f2278k;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i5, int i10) {
        super(context, attributeSet, i5, i10);
        this.f2269a = false;
        this.f2270b = -1;
        this.f2273e = new SparseIntArray();
        this.f2274f = new SparseIntArray();
        this.f2275g = new l2();
        this.f2276h = new Rect();
        this.f2277i = -1;
        this.j = -1;
        this.f2278k = -1;
        A(k1.getProperties(context, attributeSet, i5, i10).f2445b);
    }

    public final void A(int i5) {
        if (i5 == this.f2270b) {
            return;
        }
        this.f2269a = true;
        if (i5 < 1) {
            throw new IllegalArgumentException(androidx.appcompat.widget.c1.i(i5, "Span count should be at least 1. Provided "));
        }
        this.f2270b = i5;
        this.f2275g.d();
        requestLayout();
    }

    public final void B() {
        int height;
        int paddingTop;
        if (getOrientation() == 1) {
            height = getWidth() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        p(height - paddingTop);
    }

    @Override // androidx.recyclerview.widget.k1
    public final boolean checkLayoutParams(l1 l1Var) {
        return l1Var instanceof g0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void collectPrefetchPositionsForLayoutState(z1 z1Var, k0 k0Var, i1 i1Var) {
        int i5;
        int i10 = this.f2270b;
        for (int i11 = 0; i11 < this.f2270b && (i5 = k0Var.f2457d) >= 0 && i5 < z1Var.b() && i10 > 0; i11++) {
            ((d0) i1Var).a(k0Var.f2457d, Math.max(0, k0Var.f2460g));
            this.f2275g.getClass();
            i10--;
            k0Var.f2457d += k0Var.f2458e;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View findReferenceChild(s1 s1Var, z1 z1Var, boolean z5, boolean z7) {
        int i5;
        int i10;
        int childCount = getChildCount();
        int i11 = 1;
        if (z7) {
            i10 = getChildCount() - 1;
            i5 = -1;
            i11 = -1;
        } else {
            i5 = childCount;
            i10 = 0;
        }
        int b10 = z1Var.b();
        ensureLayoutState();
        int k6 = this.mOrientationHelper.k();
        int g10 = this.mOrientationHelper.g();
        View view = null;
        View view2 = null;
        while (i10 != i5) {
            View childAt = getChildAt(i10);
            int position = getPosition(childAt);
            if (position >= 0 && position < b10 && x(position, s1Var, z1Var) == 0) {
                if (((l1) childAt.getLayoutParams()).f2468a.isRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.mOrientationHelper.e(childAt) < g10 && this.mOrientationHelper.b(childAt) >= k6) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i10 += i11;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.k1
    public final l1 generateDefaultLayoutParams() {
        return this.mOrientation == 0 ? new g0(-2, -1) : new g0(-1, -2);
    }

    @Override // androidx.recyclerview.widget.k1
    public final l1 generateLayoutParams(Context context, AttributeSet attributeSet) {
        g0 g0Var = new g0(context, attributeSet);
        g0Var.f2397e = -1;
        g0Var.f2398f = 0;
        return g0Var;
    }

    @Override // androidx.recyclerview.widget.k1
    public final int getColumnCountForAccessibility(s1 s1Var, z1 z1Var) {
        if (this.mOrientation == 1) {
            return Math.min(this.f2270b, getItemCount());
        }
        if (z1Var.b() < 1) {
            return 0;
        }
        return w(z1Var.b() - 1, s1Var, z1Var) + 1;
    }

    @Override // androidx.recyclerview.widget.k1
    public final int getRowCountForAccessibility(s1 s1Var, z1 z1Var) {
        if (this.mOrientation == 0) {
            return Math.min(this.f2270b, getItemCount());
        }
        if (z1Var.b() < 1) {
            return 0;
        }
        return w(z1Var.b() - 1, s1Var, z1Var) + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0099, code lost:
    
        r21.f2441b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009b, code lost:
    
        return;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void layoutChunk(s1 s1Var, z1 z1Var, k0 k0Var, j0 j0Var) {
        int i5;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int childMeasureSpec;
        int i16;
        boolean z5;
        int i17;
        View b10;
        int j = this.mOrientationHelper.j();
        boolean z7 = j != 1073741824;
        int i18 = getChildCount() > 0 ? this.f2271c[this.f2270b] : 0;
        if (z7) {
            B();
        }
        boolean z10 = k0Var.f2458e == 1;
        int i19 = this.f2270b;
        if (!z10) {
            i19 = x(k0Var.f2457d, s1Var, z1Var) + y(k0Var.f2457d, s1Var, z1Var);
        }
        int i20 = 0;
        while (i20 < this.f2270b && (i17 = k0Var.f2457d) >= 0 && i17 < z1Var.b() && i19 > 0) {
            int i21 = k0Var.f2457d;
            int y5 = y(i21, s1Var, z1Var);
            if (y5 > this.f2270b) {
                StringBuilder sb2 = new StringBuilder("Item at position ");
                sb2.append(i21);
                sb2.append(" requires ");
                sb2.append(y5);
                sb2.append(" spans but GridLayoutManager has only ");
                throw new IllegalArgumentException(r4.k.n(sb2, this.f2270b, " spans."));
            }
            i19 -= y5;
            if (i19 < 0 || (b10 = k0Var.b(s1Var)) == null) {
                break;
            }
            this.f2272d[i20] = b10;
            i20++;
        }
        if (z10) {
            i11 = 1;
            i10 = i20;
            i5 = 0;
        } else {
            i5 = i20 - 1;
            i10 = -1;
            i11 = -1;
        }
        int i22 = 0;
        while (i5 != i10) {
            View view = this.f2272d[i5];
            g0 g0Var = (g0) view.getLayoutParams();
            int y10 = y(getPosition(view), s1Var, z1Var);
            g0Var.f2398f = y10;
            g0Var.f2397e = i22;
            i22 += y10;
            i5 += i11;
        }
        float f6 = 0.0f;
        int i23 = 0;
        for (int i24 = 0; i24 < i20; i24++) {
            View view2 = this.f2272d[i24];
            if (k0Var.f2463k != null) {
                z5 = false;
                if (z10) {
                    addDisappearingView(view2);
                } else {
                    addDisappearingView(view2, 0);
                }
            } else if (z10) {
                addView(view2);
                z5 = false;
            } else {
                z5 = false;
                addView(view2, 0);
            }
            calculateItemDecorationsForChild(view2, this.f2276h);
            z(view2, j, z5);
            int c2 = this.mOrientationHelper.c(view2);
            if (c2 > i23) {
                i23 = c2;
            }
            float d10 = (this.mOrientationHelper.d(view2) * 1.0f) / ((g0) view2.getLayoutParams()).f2398f;
            if (d10 > f6) {
                f6 = d10;
            }
        }
        if (z7) {
            p(Math.max(Math.round(f6 * this.f2270b), i18));
            i23 = 0;
            for (int i25 = 0; i25 < i20; i25++) {
                View view3 = this.f2272d[i25];
                z(view3, 1073741824, true);
                int c8 = this.mOrientationHelper.c(view3);
                if (c8 > i23) {
                    i23 = c8;
                }
            }
        }
        for (int i26 = 0; i26 < i20; i26++) {
            View view4 = this.f2272d[i26];
            if (this.mOrientationHelper.c(view4) != i23) {
                g0 g0Var2 = (g0) view4.getLayoutParams();
                Rect rect = g0Var2.f2469b;
                int i27 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) g0Var2).topMargin + ((ViewGroup.MarginLayoutParams) g0Var2).bottomMargin;
                int i28 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) g0Var2).leftMargin + ((ViewGroup.MarginLayoutParams) g0Var2).rightMargin;
                int v5 = v(g0Var2.f2397e, g0Var2.f2398f);
                if (this.mOrientation == 1) {
                    i16 = k1.getChildMeasureSpec(v5, 1073741824, i28, ((ViewGroup.MarginLayoutParams) g0Var2).width, false);
                    childMeasureSpec = View.MeasureSpec.makeMeasureSpec(i23 - i27, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i23 - i28, 1073741824);
                    childMeasureSpec = k1.getChildMeasureSpec(v5, 1073741824, i27, ((ViewGroup.MarginLayoutParams) g0Var2).height, false);
                    i16 = makeMeasureSpec;
                }
                if (shouldReMeasureChild(view4, i16, childMeasureSpec, (l1) view4.getLayoutParams())) {
                    view4.measure(i16, childMeasureSpec);
                }
            }
        }
        j0Var.f2440a = i23;
        if (this.mOrientation != 1) {
            if (k0Var.f2459f == -1) {
                int i29 = k0Var.f2455b;
                i13 = i29 - i23;
                i12 = i29;
            } else {
                int i30 = k0Var.f2455b;
                i12 = i30 + i23;
                i13 = i30;
            }
            i14 = 0;
            i15 = 0;
        } else if (k0Var.f2459f == -1) {
            i15 = k0Var.f2455b;
            i14 = i15 - i23;
            i13 = 0;
            i12 = 0;
        } else {
            int i31 = k0Var.f2455b;
            i14 = i31;
            i12 = 0;
            i15 = i31 + i23;
            i13 = 0;
        }
        for (int i32 = 0; i32 < i20; i32++) {
            View view5 = this.f2272d[i32];
            g0 g0Var3 = (g0) view5.getLayoutParams();
            if (this.mOrientation != 1) {
                i14 = getPaddingTop() + this.f2271c[g0Var3.f2397e];
                i15 = this.mOrientationHelper.d(view5) + i14;
            } else if (isLayoutRTL()) {
                i12 = this.f2271c[this.f2270b - g0Var3.f2397e] + getPaddingLeft();
                i13 = i12 - this.mOrientationHelper.d(view5);
            } else {
                i13 = getPaddingLeft() + this.f2271c[g0Var3.f2397e];
                i12 = this.mOrientationHelper.d(view5) + i13;
            }
            int i33 = i12;
            int i34 = i13;
            int i35 = i15;
            layoutDecoratedWithMargins(view5, i34, i14, i33, i35);
            i13 = i34;
            i12 = i33;
            i15 = i35;
            if (g0Var3.f2468a.isRemoved() || g0Var3.f2468a.isUpdated()) {
                j0Var.f2442c = true;
            }
            j0Var.f2443d = view5.hasFocusable() | j0Var.f2443d;
        }
        Arrays.fill(this.f2272d, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void onAnchorReady(s1 s1Var, z1 z1Var, i0 i0Var, int i5) {
        super.onAnchorReady(s1Var, z1Var, i0Var, i5);
        B();
        if (z1Var.b() > 0 && !z1Var.f2601g) {
            boolean z5 = i5 == 1;
            int x10 = x(i0Var.f2426b, s1Var, z1Var);
            if (z5) {
                while (x10 > 0) {
                    int i10 = i0Var.f2426b;
                    if (i10 <= 0) {
                        break;
                    }
                    int i11 = i10 - 1;
                    i0Var.f2426b = i11;
                    x10 = x(i11, s1Var, z1Var);
                }
            } else {
                int b10 = z1Var.b() - 1;
                int i12 = i0Var.f2426b;
                while (i12 < b10) {
                    int i13 = i12 + 1;
                    int x11 = x(i13, s1Var, z1Var);
                    if (x11 <= x10) {
                        break;
                    }
                    i12 = i13;
                    x10 = x11;
                }
                i0Var.f2426b = i12;
            }
        }
        q();
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d3, code lost:
    
        if (r13 == (r2 > r15)) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00f3, code lost:
    
        if (r13 == (r2 > r4)) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0111  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.k1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View onFocusSearchFailed(View view, int i5, s1 s1Var, z1 z1Var) {
        int childCount;
        int i10;
        int i11;
        View view2;
        View view3;
        View view4;
        int i12;
        int i13;
        int i14;
        s1 s1Var2 = s1Var;
        z1 z1Var2 = z1Var;
        View findContainingItemView = findContainingItemView(view);
        View view5 = null;
        if (findContainingItemView == null) {
            return null;
        }
        g0 g0Var = (g0) findContainingItemView.getLayoutParams();
        int i15 = g0Var.f2397e;
        int i16 = g0Var.f2398f + i15;
        if (super.onFocusSearchFailed(view, i5, s1Var, z1Var) == null) {
            return null;
        }
        if ((convertFocusDirectionToLayoutDirection(i5) == 1) != this.mShouldReverseLayout) {
            i11 = getChildCount() - 1;
            childCount = -1;
            i10 = -1;
        } else {
            childCount = getChildCount();
            i10 = 1;
            i11 = 0;
        }
        boolean z5 = this.mOrientation == 1 && isLayoutRTL();
        int w10 = w(i11, s1Var2, z1Var2);
        int i17 = -1;
        int i18 = -1;
        int i19 = 0;
        int i20 = 0;
        int i21 = i11;
        View view6 = null;
        while (i21 != childCount) {
            int w11 = w(i21, s1Var2, z1Var2);
            View childAt = getChildAt(i21);
            if (childAt == findContainingItemView) {
                break;
            }
            if (!childAt.hasFocusable() || w11 == w10) {
                g0 g0Var2 = (g0) childAt.getLayoutParams();
                int i22 = g0Var2.f2397e;
                view2 = findContainingItemView;
                int i23 = g0Var2.f2398f + i22;
                if (childAt.hasFocusable() && i22 == i15 && i23 == i16) {
                    return childAt;
                }
                if (!(childAt.hasFocusable() && view5 == null) && (childAt.hasFocusable() || view6 != null)) {
                    view3 = view5;
                    int min = Math.min(i23, i16) - Math.max(i22, i15);
                    if (childAt.hasFocusable()) {
                        if (min <= i19) {
                            if (min == i19) {
                            }
                        }
                    } else if (view3 == null) {
                        view4 = view6;
                        i12 = i19;
                        if (isViewPartiallyVisible(childAt, false, true)) {
                            i13 = i20;
                            if (min > i13) {
                                i14 = i18;
                            } else {
                                if (min == i13) {
                                    i14 = i18;
                                } else {
                                    i14 = i18;
                                }
                                i18 = i14;
                                i20 = i13;
                                view6 = view4;
                                i19 = i12;
                                view5 = view3;
                                i21 += i10;
                                s1Var2 = s1Var;
                                z1Var2 = z1Var;
                                findContainingItemView = view2;
                            }
                            if (childAt.hasFocusable()) {
                                int i24 = g0Var2.f2397e;
                                i20 = Math.min(i23, i16) - Math.max(i22, i15);
                                view6 = childAt;
                                i18 = i24;
                                i19 = i12;
                                view5 = view3;
                                i21 += i10;
                                s1Var2 = s1Var;
                                z1Var2 = z1Var;
                                findContainingItemView = view2;
                            } else {
                                i18 = i14;
                                i20 = i13;
                                i17 = g0Var2.f2397e;
                                view6 = view4;
                                view5 = childAt;
                                i19 = Math.min(i23, i16) - Math.max(i22, i15);
                                i21 += i10;
                                s1Var2 = s1Var;
                                z1Var2 = z1Var;
                                findContainingItemView = view2;
                            }
                        }
                        i14 = i18;
                        i13 = i20;
                        i18 = i14;
                        i20 = i13;
                        view6 = view4;
                        i19 = i12;
                        view5 = view3;
                        i21 += i10;
                        s1Var2 = s1Var;
                        z1Var2 = z1Var;
                        findContainingItemView = view2;
                    }
                } else {
                    view3 = view5;
                }
                view4 = view6;
                i12 = i19;
                i14 = i18;
                i13 = i20;
                if (childAt.hasFocusable()) {
                }
            } else {
                if (view5 != null) {
                    break;
                }
                view2 = findContainingItemView;
                view3 = view5;
            }
            view4 = view6;
            i12 = i19;
            i14 = i18;
            i13 = i20;
            i18 = i14;
            i20 = i13;
            view6 = view4;
            i19 = i12;
            view5 = view3;
            i21 += i10;
            s1Var2 = s1Var;
            z1Var2 = z1Var;
            findContainingItemView = view2;
        }
        View view7 = view5;
        return view7 != null ? view7 : view6;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.k1
    public final void onInitializeAccessibilityNodeInfo(s1 s1Var, z1 z1Var, q0.c cVar) {
        super.onInitializeAccessibilityNodeInfo(s1Var, z1Var, cVar);
        cVar.j(GridView.class.getName());
        x0 x0Var = this.mRecyclerView.mAdapter;
        if (x0Var == null || x0Var.getItemCount() <= 1) {
            return;
        }
        cVar.b(q0.b.q);
    }

    @Override // androidx.recyclerview.widget.k1
    public final void onInitializeAccessibilityNodeInfoForItem(s1 s1Var, z1 z1Var, View view, q0.c cVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof g0)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, cVar);
            return;
        }
        g0 g0Var = (g0) layoutParams;
        int w10 = w(g0Var.f2468a.getLayoutPosition(), s1Var, z1Var);
        if (this.mOrientation == 0) {
            cVar.k(c4.k.a(g0Var.f2397e, g0Var.f2398f, w10, 1, false, false));
        } else {
            cVar.k(c4.k.a(w10, 1, g0Var.f2397e, g0Var.f2398f, false, false));
        }
    }

    @Override // androidx.recyclerview.widget.k1
    public final void onItemsAdded(RecyclerView recyclerView, int i5, int i10) {
        l2 l2Var = this.f2275g;
        l2Var.d();
        ((SparseIntArray) l2Var.f2473b).clear();
    }

    @Override // androidx.recyclerview.widget.k1
    public final void onItemsChanged(RecyclerView recyclerView) {
        l2 l2Var = this.f2275g;
        l2Var.d();
        ((SparseIntArray) l2Var.f2473b).clear();
    }

    @Override // androidx.recyclerview.widget.k1
    public final void onItemsMoved(RecyclerView recyclerView, int i5, int i10, int i11) {
        l2 l2Var = this.f2275g;
        l2Var.d();
        ((SparseIntArray) l2Var.f2473b).clear();
    }

    @Override // androidx.recyclerview.widget.k1
    public final void onItemsRemoved(RecyclerView recyclerView, int i5, int i10) {
        l2 l2Var = this.f2275g;
        l2Var.d();
        ((SparseIntArray) l2Var.f2473b).clear();
    }

    @Override // androidx.recyclerview.widget.k1
    public final void onItemsUpdated(RecyclerView recyclerView, int i5, int i10, Object obj) {
        l2 l2Var = this.f2275g;
        l2Var.d();
        ((SparseIntArray) l2Var.f2473b).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.k1
    public final void onLayoutChildren(s1 s1Var, z1 z1Var) {
        boolean z5 = z1Var.f2601g;
        SparseIntArray sparseIntArray = this.f2274f;
        SparseIntArray sparseIntArray2 = this.f2273e;
        if (z5) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                g0 g0Var = (g0) getChildAt(i5).getLayoutParams();
                int layoutPosition = g0Var.f2468a.getLayoutPosition();
                sparseIntArray2.put(layoutPosition, g0Var.f2398f);
                sparseIntArray.put(layoutPosition, g0Var.f2397e);
            }
        }
        super.onLayoutChildren(s1Var, z1Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.k1
    public final void onLayoutCompleted(z1 z1Var) {
        View findViewByPosition;
        super.onLayoutCompleted(z1Var);
        this.f2269a = false;
        int i5 = this.f2277i;
        if (i5 == -1 || (findViewByPosition = findViewByPosition(i5)) == null) {
            return;
        }
        findViewByPosition.sendAccessibilityEvent(67108864);
        this.f2277i = -1;
    }

    public final void p(int i5) {
        int i10;
        int[] iArr = this.f2271c;
        int i11 = this.f2270b;
        if (iArr == null || iArr.length != i11 + 1 || iArr[iArr.length - 1] != i5) {
            iArr = new int[i11 + 1];
        }
        int i12 = 0;
        iArr[0] = 0;
        int i13 = i5 / i11;
        int i14 = i5 % i11;
        int i15 = 0;
        for (int i16 = 1; i16 <= i11; i16++) {
            i12 += i14;
            if (i12 <= 0 || i11 - i12 >= i14) {
                i10 = i13;
            } else {
                i10 = i13 + 1;
                i12 -= i11;
            }
            i15 += i10;
            iArr[i16] = i15;
        }
        this.f2271c = iArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0213  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.k1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean performAccessibilityAction(int i5, Bundle bundle) {
        View view;
        d2 childViewHolder;
        int i10;
        int i11;
        if (i5 == q0.b.q.a() && i5 != -1) {
            int i12 = 0;
            while (true) {
                if (i12 >= getChildCount()) {
                    view = null;
                    break;
                }
                View childAt = getChildAt(i12);
                Objects.requireNonNull(childAt);
                if (childAt.isAccessibilityFocused()) {
                    view = getChildAt(i12);
                    break;
                }
                i12++;
            }
            if (view != null && bundle != null) {
                int i13 = bundle.getInt("android.view.accessibility.action.ARGUMENT_DIRECTION_INT", -1);
                if (f2268l.contains(Integer.valueOf(i13)) && (childViewHolder = this.mRecyclerView.getChildViewHolder(view)) != null) {
                    int absoluteAdapterPosition = childViewHolder.getAbsoluteAdapterPosition();
                    int s8 = s(absoluteAdapterPosition);
                    int r5 = r(absoluteAdapterPosition);
                    if (s8 >= 0 && r5 >= 0) {
                        if (!t(absoluteAdapterPosition).contains(Integer.valueOf(this.j)) || !u(r(absoluteAdapterPosition), absoluteAdapterPosition).contains(Integer.valueOf(this.f2278k))) {
                            this.j = s8;
                            this.f2278k = r5;
                        }
                        int i14 = this.j;
                        if (i14 == -1) {
                            i14 = s8;
                        }
                        int i15 = this.f2278k;
                        if (i15 != -1) {
                            r5 = i15;
                        }
                        if (i13 == 17) {
                            i10 = absoluteAdapterPosition - 1;
                            while (i10 >= 0) {
                                int s10 = s(i10);
                                int r6 = r(i10);
                                if (s10 < 0 || r6 < 0) {
                                    break;
                                }
                                if (this.mOrientation != 1) {
                                    if (t(i10).contains(Integer.valueOf(i14)) && r6 < r5) {
                                        this.f2278k = r6;
                                        break;
                                    }
                                    i10--;
                                } else {
                                    if ((s10 == i14 && r6 < r5) || s10 < i14) {
                                        this.j = s10;
                                        this.f2278k = r6;
                                        break;
                                    }
                                    i10--;
                                }
                            }
                            i10 = -1;
                            if (i10 == -1) {
                            }
                            if (i10 != -1) {
                            }
                        } else if (i13 == 33) {
                            i10 = absoluteAdapterPosition - 1;
                            while (i10 >= 0) {
                                int s11 = s(i10);
                                int r10 = r(i10);
                                if (s11 < 0 || r10 < 0) {
                                    break;
                                }
                                if (this.mOrientation == 1) {
                                    if (s11 < i14 && u(r(i10), i10).contains(Integer.valueOf(r5))) {
                                        this.j = s11;
                                        break;
                                    }
                                    i10--;
                                } else {
                                    if (s11 < i14 && r10 == r5) {
                                        this.j = ((Integer) Collections.max(t(i10))).intValue();
                                        break;
                                    }
                                    i10--;
                                }
                            }
                            i10 = -1;
                            if (i10 == -1) {
                            }
                            if (i10 != -1) {
                            }
                        } else if (i13 == 66) {
                            i10 = absoluteAdapterPosition + 1;
                            while (i10 < getItemCount()) {
                                int s12 = s(i10);
                                int r11 = r(i10);
                                if (s12 < 0 || r11 < 0) {
                                    break;
                                }
                                if (this.mOrientation != 1) {
                                    if (r11 > r5 && t(i10).contains(Integer.valueOf(i14))) {
                                        this.f2278k = r11;
                                        break;
                                    }
                                    i10++;
                                } else {
                                    if ((s12 == i14 && r11 > r5) || s12 > i14) {
                                        this.j = s12;
                                        this.f2278k = r11;
                                        break;
                                    }
                                    i10++;
                                }
                            }
                            i10 = -1;
                            if (i10 == -1) {
                                if (i13 != 17) {
                                }
                            }
                            if (i10 != -1) {
                            }
                        } else if (i13 == 130) {
                            i10 = absoluteAdapterPosition + 1;
                            while (i10 < getItemCount()) {
                                int s13 = s(i10);
                                int r12 = r(i10);
                                if (s13 < 0 || r12 < 0) {
                                    break;
                                }
                                if (this.mOrientation == 1) {
                                    if (s13 > i14 && (r12 == r5 || u(r(i10), i10).contains(Integer.valueOf(r5)))) {
                                        this.j = s13;
                                        break;
                                    }
                                    i10++;
                                } else {
                                    if (s13 > i14 && r12 == r5) {
                                        this.j = s(i10);
                                        break;
                                    }
                                    i10++;
                                }
                            }
                            i10 = -1;
                            if (i10 == -1 && (i11 = this.mOrientation) == 0) {
                                if (i13 != 17) {
                                    if (s8 >= 0 && i11 != 1) {
                                        TreeMap treeMap = new TreeMap(Collections.reverseOrder());
                                        int i16 = 0;
                                        loop2: while (true) {
                                            if (i16 >= getItemCount()) {
                                                for (Integer num : treeMap.keySet()) {
                                                    int intValue = num.intValue();
                                                    if (intValue < s8) {
                                                        i10 = ((Integer) treeMap.get(num)).intValue();
                                                        this.j = intValue;
                                                        this.f2278k = r(i10);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                Iterator it = t(i16).iterator();
                                                while (it.hasNext()) {
                                                    Integer num2 = (Integer) it.next();
                                                    if (num2.intValue() < 0) {
                                                        break loop2;
                                                    }
                                                    treeMap.put(num2, Integer.valueOf(i16));
                                                }
                                                i16++;
                                            }
                                        }
                                    }
                                    i10 = -1;
                                } else if (i13 == 66) {
                                    if (s8 >= 0 && i11 != 1) {
                                        TreeMap treeMap2 = new TreeMap();
                                        int i17 = 0;
                                        loop5: while (true) {
                                            if (i17 >= getItemCount()) {
                                                for (Integer num3 : treeMap2.keySet()) {
                                                    int intValue2 = num3.intValue();
                                                    if (intValue2 > s8) {
                                                        i10 = ((Integer) treeMap2.get(num3)).intValue();
                                                        this.j = intValue2;
                                                        this.f2278k = 0;
                                                        break;
                                                    }
                                                }
                                            } else {
                                                Iterator it2 = t(i17).iterator();
                                                while (it2.hasNext()) {
                                                    Integer num4 = (Integer) it2.next();
                                                    if (num4.intValue() < 0) {
                                                        break loop5;
                                                    }
                                                    if (!treeMap2.containsKey(num4)) {
                                                        treeMap2.put(num4, Integer.valueOf(i17));
                                                    }
                                                }
                                                i17++;
                                            }
                                        }
                                    }
                                    i10 = -1;
                                }
                            }
                            if (i10 != -1) {
                                scrollToPosition(i10);
                                this.f2277i = i10;
                                return true;
                            }
                        }
                    }
                }
            }
        } else {
            if (i5 != 16908343 || bundle == null) {
                return super.performAccessibilityAction(i5, bundle);
            }
            int i18 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
            int i19 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
            if (i18 != -1 && i19 != -1) {
                int itemCount = this.mRecyclerView.mAdapter.getItemCount();
                int i20 = 0;
                while (true) {
                    if (i20 >= itemCount) {
                        i20 = -1;
                        break;
                    }
                    RecyclerView recyclerView = this.mRecyclerView;
                    int x10 = x(i20, recyclerView.mRecycler, recyclerView.mState);
                    RecyclerView recyclerView2 = this.mRecyclerView;
                    int w10 = w(i20, recyclerView2.mRecycler, recyclerView2.mState);
                    if (this.mOrientation == 1) {
                        if (x10 == i19 && w10 == i18) {
                            break;
                        }
                        i20++;
                    } else {
                        if (x10 == i18 && w10 == i19) {
                            break;
                        }
                        i20++;
                    }
                }
                if (i20 > -1) {
                    scrollToPositionWithOffset(i20, 0);
                    return true;
                }
            }
        }
        return false;
    }

    public final void q() {
        View[] viewArr = this.f2272d;
        if (viewArr == null || viewArr.length != this.f2270b) {
            this.f2272d = new View[this.f2270b];
        }
    }

    public final int r(int i5) {
        if (this.mOrientation == 0) {
            RecyclerView recyclerView = this.mRecyclerView;
            return w(i5, recyclerView.mRecycler, recyclerView.mState);
        }
        RecyclerView recyclerView2 = this.mRecyclerView;
        return x(i5, recyclerView2.mRecycler, recyclerView2.mState);
    }

    public final int s(int i5) {
        if (this.mOrientation == 1) {
            RecyclerView recyclerView = this.mRecyclerView;
            return w(i5, recyclerView.mRecycler, recyclerView.mState);
        }
        RecyclerView recyclerView2 = this.mRecyclerView;
        return x(i5, recyclerView2.mRecycler, recyclerView2.mState);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.k1
    public final int scrollHorizontallyBy(int i5, s1 s1Var, z1 z1Var) {
        B();
        q();
        return super.scrollHorizontallyBy(i5, s1Var, z1Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.k1
    public final int scrollVerticallyBy(int i5, s1 s1Var, z1 z1Var) {
        B();
        q();
        return super.scrollVerticallyBy(i5, s1Var, z1Var);
    }

    @Override // androidx.recyclerview.widget.k1
    public final void setMeasuredDimension(Rect rect, int i5, int i10) {
        int chooseSize;
        int chooseSize2;
        if (this.f2271c == null) {
            super.setMeasuredDimension(rect, i5, i10);
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.mOrientation == 1) {
            chooseSize2 = k1.chooseSize(i10, rect.height() + paddingBottom, getMinimumHeight());
            int[] iArr = this.f2271c;
            chooseSize = k1.chooseSize(i5, iArr[iArr.length - 1] + paddingRight, getMinimumWidth());
        } else {
            chooseSize = k1.chooseSize(i5, rect.width() + paddingRight, getMinimumWidth());
            int[] iArr2 = this.f2271c;
            chooseSize2 = k1.chooseSize(i10, iArr2[iArr2.length - 1] + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(chooseSize, chooseSize2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void setStackFromEnd(boolean z5) {
        if (z5) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.setStackFromEnd(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.k1
    public final boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && !this.f2269a;
    }

    public final HashSet t(int i5) {
        return u(s(i5), i5);
    }

    public final HashSet u(int i5, int i10) {
        HashSet hashSet = new HashSet();
        RecyclerView recyclerView = this.mRecyclerView;
        int y5 = y(i10, recyclerView.mRecycler, recyclerView.mState);
        for (int i11 = i5; i11 < i5 + y5; i11++) {
            hashSet.add(Integer.valueOf(i11));
        }
        return hashSet;
    }

    public final int v(int i5, int i10) {
        if (this.mOrientation != 1 || !isLayoutRTL()) {
            int[] iArr = this.f2271c;
            return iArr[i10 + i5] - iArr[i5];
        }
        int[] iArr2 = this.f2271c;
        int i11 = this.f2270b;
        return iArr2[i11 - i5] - iArr2[(i11 - i5) - i10];
    }

    public final int w(int i5, s1 s1Var, z1 z1Var) {
        boolean z5 = z1Var.f2601g;
        l2 l2Var = this.f2275g;
        if (!z5) {
            int i10 = this.f2270b;
            l2Var.getClass();
            return l2.c(i5, i10);
        }
        int b10 = s1Var.b(i5);
        if (b10 != -1) {
            int i11 = this.f2270b;
            l2Var.getClass();
            return l2.c(b10, i11);
        }
        io.sentry.android.core.w0.m("GridLayoutManager", "Cannot find span size for pre layout position. " + i5);
        return 0;
    }

    public final int x(int i5, s1 s1Var, z1 z1Var) {
        boolean z5 = z1Var.f2601g;
        l2 l2Var = this.f2275g;
        if (!z5) {
            int i10 = this.f2270b;
            l2Var.getClass();
            return i5 % i10;
        }
        int i11 = this.f2274f.get(i5, -1);
        if (i11 != -1) {
            return i11;
        }
        int b10 = s1Var.b(i5);
        if (b10 != -1) {
            int i12 = this.f2270b;
            l2Var.getClass();
            return b10 % i12;
        }
        io.sentry.android.core.w0.m("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i5);
        return 0;
    }

    public final int y(int i5, s1 s1Var, z1 z1Var) {
        boolean z5 = z1Var.f2601g;
        l2 l2Var = this.f2275g;
        if (!z5) {
            l2Var.getClass();
            return 1;
        }
        int i10 = this.f2273e.get(i5, -1);
        if (i10 != -1) {
            return i10;
        }
        if (s1Var.b(i5) != -1) {
            l2Var.getClass();
            return 1;
        }
        io.sentry.android.core.w0.m("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i5);
        return 1;
    }

    public final void z(View view, int i5, boolean z5) {
        int i10;
        int i11;
        g0 g0Var = (g0) view.getLayoutParams();
        Rect rect = g0Var.f2469b;
        int i12 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) g0Var).topMargin + ((ViewGroup.MarginLayoutParams) g0Var).bottomMargin;
        int i13 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) g0Var).leftMargin + ((ViewGroup.MarginLayoutParams) g0Var).rightMargin;
        int v5 = v(g0Var.f2397e, g0Var.f2398f);
        if (this.mOrientation == 1) {
            i11 = k1.getChildMeasureSpec(v5, i5, i13, ((ViewGroup.MarginLayoutParams) g0Var).width, false);
            i10 = k1.getChildMeasureSpec(this.mOrientationHelper.l(), getHeightMode(), i12, ((ViewGroup.MarginLayoutParams) g0Var).height, true);
        } else {
            int childMeasureSpec = k1.getChildMeasureSpec(v5, i5, i12, ((ViewGroup.MarginLayoutParams) g0Var).height, false);
            int childMeasureSpec2 = k1.getChildMeasureSpec(this.mOrientationHelper.l(), getWidthMode(), i13, ((ViewGroup.MarginLayoutParams) g0Var).width, true);
            i10 = childMeasureSpec;
            i11 = childMeasureSpec2;
        }
        l1 l1Var = (l1) view.getLayoutParams();
        if (z5 ? shouldReMeasureChild(view, i11, i10, l1Var) : shouldMeasureChild(view, i11, i10, l1Var)) {
            view.measure(i11, i10);
        }
    }

    @Override // androidx.recyclerview.widget.k1
    public final l1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            g0 g0Var = new g0((ViewGroup.MarginLayoutParams) layoutParams);
            g0Var.f2397e = -1;
            g0Var.f2398f = 0;
            return g0Var;
        }
        g0 g0Var2 = new g0(layoutParams);
        g0Var2.f2397e = -1;
        g0Var2.f2398f = 0;
        return g0Var2;
    }

    public GridLayoutManager(int i5) {
        super(1, false);
        this.f2269a = false;
        this.f2270b = -1;
        this.f2273e = new SparseIntArray();
        this.f2274f = new SparseIntArray();
        this.f2275g = new l2();
        this.f2276h = new Rect();
        this.f2277i = -1;
        this.j = -1;
        this.f2278k = -1;
        A(i5);
    }
}
