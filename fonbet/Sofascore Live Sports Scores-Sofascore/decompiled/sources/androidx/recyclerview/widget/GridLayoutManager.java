package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a70;
import defpackage.a8b;
import defpackage.b8b;
import defpackage.c8b;
import defpackage.da;
import defpackage.dad;
import defpackage.fc6;
import defpackage.frf;
import defpackage.hrf;
import defpackage.ljg;
import defpackage.lnb;
import defpackage.p39;
import defpackage.q39;
import defpackage.qrf;
import defpackage.r9;
import defpackage.x9;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public static final Set l = Collections.unmodifiableSet(new HashSet(Arrays.asList(17, 66, 33, 130)));
    public boolean a;
    public int b;
    public int[] c;
    public View[] d;
    public final SparseIntArray e;
    public final SparseIntArray f;
    public r9 g;
    public final Rect h;
    public int i;
    public int j;
    public int k;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = false;
        this.b = -1;
        this.e = new SparseIntArray();
        this.f = new SparseIntArray();
        this.g = new p39(5, false);
        this.h = new Rect();
        this.i = -1;
        this.j = -1;
        this.k = -1;
        C(n.getProperties(context, attributeSet, i, i2).b);
    }

    public final int A(int i, o oVar, qrf qrfVar) {
        if (!qrfVar.g) {
            return this.g.o(i);
        }
        int i2 = this.e.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int b = oVar.b(i);
        if (b == -1) {
            return 1;
        }
        return this.g.o(b);
    }

    public final void B(View view, int i, boolean z) {
        int i2;
        int i3;
        q39 q39Var = (q39) view.getLayoutParams();
        Rect rect = q39Var.b;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) q39Var).topMargin + ((ViewGroup.MarginLayoutParams) q39Var).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) q39Var).leftMargin + ((ViewGroup.MarginLayoutParams) q39Var).rightMargin;
        int x = x(q39Var.e, q39Var.f);
        if (this.mOrientation == 1) {
            i3 = n.getChildMeasureSpec(x, i, i5, ((ViewGroup.MarginLayoutParams) q39Var).width, false);
            i2 = n.getChildMeasureSpec(this.mOrientationHelper.l(), getHeightMode(), i4, ((ViewGroup.MarginLayoutParams) q39Var).height, true);
        } else {
            int childMeasureSpec = n.getChildMeasureSpec(x, i, i4, ((ViewGroup.MarginLayoutParams) q39Var).height, false);
            int childMeasureSpec2 = n.getChildMeasureSpec(this.mOrientationHelper.l(), getWidthMode(), i5, ((ViewGroup.MarginLayoutParams) q39Var).width, true);
            i2 = childMeasureSpec;
            i3 = childMeasureSpec2;
        }
        hrf hrfVar = (hrf) view.getLayoutParams();
        if (z ? shouldReMeasureChild(view, i3, i2, hrfVar) : shouldMeasureChild(view, i3, i2, hrfVar)) {
            view.measure(i3, i2);
        }
    }

    public final void C(int i) {
        if (i == this.b) {
            return;
        }
        this.a = true;
        if (i < 1) {
            a70.p(ljg.j(i, "Span count should be at least 1. Provided "));
            return;
        }
        this.b = i;
        this.g.q();
        requestLayout();
    }

    public final void D() {
        int height;
        int paddingTop;
        if (getOrientation() == 1) {
            height = getWidth() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        r(height - paddingTop);
    }

    @Override // androidx.recyclerview.widget.n
    public final boolean checkLayoutParams(hrf hrfVar) {
        return hrfVar instanceof q39;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void collectPrefetchPositionsForLayoutState(qrf qrfVar, c8b c8bVar, frf frfVar) {
        int i;
        int i2 = this.b;
        for (int i3 = 0; i3 < this.b && (i = c8bVar.d) >= 0 && i < qrfVar.b() && i2 > 0; i3++) {
            int i4 = c8bVar.d;
            ((e) frfVar).a(i4, Math.max(0, c8bVar.g));
            i2 -= this.g.o(i4);
            c8bVar.d += c8bVar.e;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View findReferenceChild(o oVar, qrf qrfVar, boolean z, boolean z2) {
        int i;
        int i2;
        int childCount = getChildCount();
        int i3 = 1;
        if (z2) {
            i2 = getChildCount() - 1;
            i = -1;
            i3 = -1;
        } else {
            i = childCount;
            i2 = 0;
        }
        int b = qrfVar.b();
        ensureLayoutState();
        int k = this.mOrientationHelper.k();
        int g = this.mOrientationHelper.g();
        View view = null;
        View view2 = null;
        while (i2 != i) {
            View childAt = getChildAt(i2);
            int position = getPosition(childAt);
            if (position >= 0 && position < b && z(position, oVar, qrfVar) == 0) {
                if (((hrf) childAt.getLayoutParams()).a.isRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.mOrientationHelper.e(childAt) < g && this.mOrientationHelper.b(childAt) >= k) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i2 += i3;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.n
    public final hrf generateDefaultLayoutParams() {
        return this.mOrientation == 0 ? new q39(-2, -1) : new q39(-1, -2);
    }

    @Override // androidx.recyclerview.widget.n
    public final hrf generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            q39 q39Var = new q39((ViewGroup.MarginLayoutParams) layoutParams);
            q39Var.e = -1;
            q39Var.f = 0;
            return q39Var;
        }
        q39 q39Var2 = new q39(layoutParams);
        q39Var2.e = -1;
        q39Var2.f = 0;
        return q39Var2;
    }

    @Override // androidx.recyclerview.widget.n
    public final int getColumnCountForAccessibility(o oVar, qrf qrfVar) {
        if (this.mOrientation == 1) {
            return Math.min(this.b, getItemCount());
        }
        if (qrfVar.b() < 1) {
            return 0;
        }
        return y(qrfVar.b() - 1, oVar, qrfVar) + 1;
    }

    @Override // androidx.recyclerview.widget.n
    public final int getRowCountForAccessibility(o oVar, qrf qrfVar) {
        if (this.mOrientation == 0) {
            return Math.min(this.b, getItemCount());
        }
        if (qrfVar.b() < 1) {
            return 0;
        }
        return y(qrfVar.b() - 1, oVar, qrfVar) + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x008a, code lost:
    
        r21.b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:
    
        return;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void layoutChunk(o oVar, qrf qrfVar, c8b c8bVar, b8b b8bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int childMeasureSpec;
        int i9;
        boolean z;
        int i10;
        View b;
        GridLayoutManager gridLayoutManager = this;
        int j = gridLayoutManager.mOrientationHelper.j();
        boolean z2 = j != 1073741824;
        int i11 = gridLayoutManager.getChildCount() > 0 ? gridLayoutManager.c[gridLayoutManager.b] : 0;
        if (z2) {
            gridLayoutManager.D();
        }
        boolean z3 = c8bVar.e == 1;
        int i12 = gridLayoutManager.b;
        if (!z3) {
            i12 = gridLayoutManager.z(c8bVar.d, oVar, qrfVar) + gridLayoutManager.A(c8bVar.d, oVar, qrfVar);
        }
        int i13 = 0;
        while (i13 < gridLayoutManager.b && (i10 = c8bVar.d) >= 0 && i10 < qrfVar.b() && i12 > 0) {
            int i14 = c8bVar.d;
            int A = gridLayoutManager.A(i14, oVar, qrfVar);
            if (A > gridLayoutManager.b) {
                a70.p(fc6.h(gridLayoutManager.b, " spans.", lnb.s(i14, A, "Item at position ", " requires ", " spans but GridLayoutManager has only ")));
                return;
            }
            i12 -= A;
            if (i12 < 0 || (b = c8bVar.b(oVar)) == null) {
                break;
            }
            gridLayoutManager.d[i13] = b;
            i13++;
        }
        if (z3) {
            i3 = 1;
            i2 = i13;
            i = 0;
        } else {
            i = i13 - 1;
            i2 = -1;
            i3 = -1;
        }
        int i15 = 0;
        while (i != i2) {
            View view = gridLayoutManager.d[i];
            q39 q39Var = (q39) view.getLayoutParams();
            int A2 = gridLayoutManager.A(gridLayoutManager.getPosition(view), oVar, qrfVar);
            q39Var.f = A2;
            q39Var.e = i15;
            i15 += A2;
            i += i3;
        }
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        int i16 = 0;
        for (int i17 = 0; i17 < i13; i17++) {
            View view2 = gridLayoutManager.d[i17];
            if (c8bVar.k != null) {
                z = false;
                if (z3) {
                    gridLayoutManager.addDisappearingView(view2);
                } else {
                    gridLayoutManager.addDisappearingView(view2, 0);
                }
            } else if (z3) {
                gridLayoutManager.addView(view2);
                z = false;
            } else {
                z = false;
                gridLayoutManager.addView(view2, 0);
            }
            gridLayoutManager.calculateItemDecorationsForChild(view2, gridLayoutManager.h);
            gridLayoutManager.B(view2, j, z);
            int c = gridLayoutManager.mOrientationHelper.c(view2);
            if (c > i16) {
                i16 = c;
            }
            float d = (gridLayoutManager.mOrientationHelper.d(view2) * 1.0f) / ((q39) view2.getLayoutParams()).f;
            if (d > f) {
                f = d;
            }
        }
        if (z2) {
            gridLayoutManager.r(Math.max(Math.round(f * gridLayoutManager.b), i11));
            i16 = 0;
            for (int i18 = 0; i18 < i13; i18++) {
                View view3 = gridLayoutManager.d[i18];
                gridLayoutManager.B(view3, 1073741824, true);
                int c2 = gridLayoutManager.mOrientationHelper.c(view3);
                if (c2 > i16) {
                    i16 = c2;
                }
            }
        }
        for (int i19 = 0; i19 < i13; i19++) {
            View view4 = gridLayoutManager.d[i19];
            if (gridLayoutManager.mOrientationHelper.c(view4) != i16) {
                q39 q39Var2 = (q39) view4.getLayoutParams();
                Rect rect = q39Var2.b;
                int i20 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) q39Var2).topMargin + ((ViewGroup.MarginLayoutParams) q39Var2).bottomMargin;
                int i21 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) q39Var2).leftMargin + ((ViewGroup.MarginLayoutParams) q39Var2).rightMargin;
                int x = gridLayoutManager.x(q39Var2.e, q39Var2.f);
                if (gridLayoutManager.mOrientation == 1) {
                    i9 = n.getChildMeasureSpec(x, 1073741824, i21, ((ViewGroup.MarginLayoutParams) q39Var2).width, false);
                    childMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16 - i20, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16 - i21, 1073741824);
                    childMeasureSpec = n.getChildMeasureSpec(x, 1073741824, i20, ((ViewGroup.MarginLayoutParams) q39Var2).height, false);
                    i9 = makeMeasureSpec;
                }
                if (gridLayoutManager.shouldReMeasureChild(view4, i9, childMeasureSpec, (hrf) view4.getLayoutParams())) {
                    view4.measure(i9, childMeasureSpec);
                }
            }
        }
        int i22 = 0;
        b8bVar.a = i16;
        int i23 = gridLayoutManager.mOrientation;
        int i24 = c8bVar.f;
        int i25 = c8bVar.b;
        if (i23 != 1) {
            if (i24 == -1) {
                i5 = i25 - i16;
                i4 = i25;
            } else {
                i4 = i25 + i16;
                i5 = i25;
            }
            i6 = 0;
            i25 = 0;
        } else if (i24 == -1) {
            i6 = i25 - i16;
            i5 = 0;
            i4 = 0;
        } else {
            i6 = i25;
            i4 = 0;
            i25 += i16;
            i5 = 0;
        }
        while (true) {
            View[] viewArr = gridLayoutManager.d;
            if (i22 >= i13) {
                Arrays.fill(viewArr, (Object) null);
                return;
            }
            int i26 = i5;
            View view5 = viewArr[i22];
            q39 q39Var3 = (q39) view5.getLayoutParams();
            if (gridLayoutManager.mOrientation != 1) {
                i6 = gridLayoutManager.getPaddingTop() + gridLayoutManager.c[q39Var3.e];
                i25 = gridLayoutManager.mOrientationHelper.d(view5) + i6;
            } else if (gridLayoutManager.isLayoutRTL()) {
                i4 = gridLayoutManager.getPaddingLeft() + gridLayoutManager.c[gridLayoutManager.b - q39Var3.e];
                i26 = i4 - gridLayoutManager.mOrientationHelper.d(view5);
            } else {
                i8 = gridLayoutManager.getPaddingLeft() + gridLayoutManager.c[q39Var3.e];
                i7 = gridLayoutManager.mOrientationHelper.d(view5) + i8;
                int i27 = i25;
                gridLayoutManager.layoutDecoratedWithMargins(view5, i8, i6, i7, i27);
                i5 = i8;
                i4 = i7;
                i25 = i27;
                if (!q39Var3.a.isRemoved() || q39Var3.a.isUpdated()) {
                    b8bVar.c = true;
                }
                b8bVar.d = view5.hasFocusable() | b8bVar.d;
                i22++;
                gridLayoutManager = this;
            }
            i7 = i4;
            i8 = i26;
            int i272 = i25;
            gridLayoutManager.layoutDecoratedWithMargins(view5, i8, i6, i7, i272);
            i5 = i8;
            i4 = i7;
            i25 = i272;
            if (!q39Var3.a.isRemoved()) {
            }
            b8bVar.c = true;
            b8bVar.d = view5.hasFocusable() | b8bVar.d;
            i22++;
            gridLayoutManager = this;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void onAnchorReady(o oVar, qrf qrfVar, a8b a8bVar, int i) {
        super.onAnchorReady(oVar, qrfVar, a8bVar, i);
        D();
        if (qrfVar.b() > 0 && !qrfVar.g) {
            boolean z = i == 1;
            int z2 = z(a8bVar.b, oVar, qrfVar);
            if (z) {
                while (z2 > 0) {
                    int i2 = a8bVar.b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    a8bVar.b = i3;
                    z2 = z(i3, oVar, qrfVar);
                }
            } else {
                int b = qrfVar.b() - 1;
                int i4 = a8bVar.b;
                while (i4 < b) {
                    int i5 = i4 + 1;
                    int z3 = z(i5, oVar, qrfVar);
                    if (z3 <= z2) {
                        break;
                    }
                    i4 = i5;
                    z2 = z3;
                }
                a8bVar.b = i4;
            }
        }
        s();
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d3, code lost:
    
        if (r13 == (r2 > r15)) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00f3, code lost:
    
        if (r13 == (r2 > r4)) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0110  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View onFocusSearchFailed(View view, int i, o oVar, qrf qrfVar) {
        int childCount;
        int i2;
        int i3;
        View view2;
        View view3;
        View view4;
        int i4;
        int i5;
        int i6;
        boolean hasFocusable;
        o oVar2 = oVar;
        qrf qrfVar2 = qrfVar;
        View findContainingItemView = findContainingItemView(view);
        View view5 = null;
        if (findContainingItemView == null) {
            return null;
        }
        q39 q39Var = (q39) findContainingItemView.getLayoutParams();
        int i7 = q39Var.e;
        int i8 = q39Var.f + i7;
        if (super.onFocusSearchFailed(view, i, oVar, qrfVar) == null) {
            return null;
        }
        if ((convertFocusDirectionToLayoutDirection(i) == 1) != this.mShouldReverseLayout) {
            i3 = getChildCount() - 1;
            childCount = -1;
            i2 = -1;
        } else {
            childCount = getChildCount();
            i2 = 1;
            i3 = 0;
        }
        boolean z = this.mOrientation == 1 && isLayoutRTL();
        int y = y(i3, oVar2, qrfVar2);
        int i9 = -1;
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        int i13 = i3;
        View view6 = null;
        while (i13 != childCount) {
            int y2 = y(i13, oVar2, qrfVar2);
            View childAt = getChildAt(i13);
            if (childAt == findContainingItemView) {
                break;
            }
            if (!childAt.hasFocusable() || y2 == y) {
                q39 q39Var2 = (q39) childAt.getLayoutParams();
                int i14 = q39Var2.e;
                view2 = findContainingItemView;
                int i15 = q39Var2.f + i14;
                if (childAt.hasFocusable() && i14 == i7 && i15 == i8) {
                    return childAt;
                }
                if (!(childAt.hasFocusable() && view5 == null) && (childAt.hasFocusable() || view6 != null)) {
                    view3 = view5;
                    int min = Math.min(i15, i8) - Math.max(i14, i7);
                    if (childAt.hasFocusable()) {
                        if (min <= i11) {
                            if (min == i11) {
                            }
                        }
                    } else if (view3 == null) {
                        view4 = view6;
                        i4 = i11;
                        if (isViewPartiallyVisible(childAt, false, true)) {
                            i5 = i12;
                            if (min > i5) {
                                i6 = i10;
                            } else {
                                if (min == i5) {
                                    i6 = i10;
                                } else {
                                    i6 = i10;
                                }
                                i10 = i6;
                                i12 = i5;
                                view6 = view4;
                                i11 = i4;
                                view5 = view3;
                                i13 += i2;
                                oVar2 = oVar;
                                qrfVar2 = qrfVar;
                                findContainingItemView = view2;
                            }
                            hasFocusable = childAt.hasFocusable();
                            int i16 = q39Var2.e;
                            if (hasFocusable) {
                                i12 = Math.min(i15, i8) - Math.max(i14, i7);
                                view6 = childAt;
                                i10 = i16;
                                i11 = i4;
                                view5 = view3;
                                i13 += i2;
                                oVar2 = oVar;
                                qrfVar2 = qrfVar;
                                findContainingItemView = view2;
                            } else {
                                i11 = Math.min(i15, i8) - Math.max(i14, i7);
                                i10 = i6;
                                i12 = i5;
                                i9 = i16;
                                view6 = view4;
                                view5 = childAt;
                                i13 += i2;
                                oVar2 = oVar;
                                qrfVar2 = qrfVar;
                                findContainingItemView = view2;
                            }
                        }
                        i6 = i10;
                        i5 = i12;
                        i10 = i6;
                        i12 = i5;
                        view6 = view4;
                        i11 = i4;
                        view5 = view3;
                        i13 += i2;
                        oVar2 = oVar;
                        qrfVar2 = qrfVar;
                        findContainingItemView = view2;
                    }
                } else {
                    view3 = view5;
                }
                view4 = view6;
                i4 = i11;
                i6 = i10;
                i5 = i12;
                hasFocusable = childAt.hasFocusable();
                int i162 = q39Var2.e;
                if (hasFocusable) {
                }
            } else {
                if (view5 != null) {
                    break;
                }
                view2 = findContainingItemView;
                view3 = view5;
            }
            view4 = view6;
            i4 = i11;
            i6 = i10;
            i5 = i12;
            i10 = i6;
            i12 = i5;
            view6 = view4;
            i11 = i4;
            view5 = view3;
            i13 += i2;
            oVar2 = oVar;
            qrfVar2 = qrfVar;
            findContainingItemView = view2;
        }
        View view7 = view5;
        return view7 != null ? view7 : view6;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.n
    public final void onInitializeAccessibilityNodeInfo(o oVar, qrf qrfVar, da daVar) {
        super.onInitializeAccessibilityNodeInfo(oVar, qrfVar, daVar);
        daVar.k(GridView.class.getName());
        l lVar = this.mRecyclerView.mAdapter;
        if (lVar == null || lVar.getItemCount() <= 1) {
            return;
        }
        daVar.b(x9.r);
    }

    @Override // androidx.recyclerview.widget.n
    public final void onInitializeAccessibilityNodeInfoForItem(o oVar, qrf qrfVar, View view, da daVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof q39)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, daVar);
            return;
        }
        q39 q39Var = (q39) layoutParams;
        int y = y(q39Var.a.getLayoutPosition(), oVar, qrfVar);
        int i = this.mOrientation;
        int i2 = q39Var.e;
        int i3 = q39Var.f;
        if (i == 0) {
            daVar.m(dad.w(i2, i3, y, 1, false));
        } else {
            daVar.m(dad.w(y, 1, i2, i3, false));
        }
    }

    @Override // androidx.recyclerview.widget.n
    public final void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        this.g.q();
        ((SparseIntArray) this.g.b).clear();
    }

    @Override // androidx.recyclerview.widget.n
    public final void onItemsChanged(RecyclerView recyclerView) {
        this.g.q();
        ((SparseIntArray) this.g.b).clear();
    }

    @Override // androidx.recyclerview.widget.n
    public final void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        this.g.q();
        ((SparseIntArray) this.g.b).clear();
    }

    @Override // androidx.recyclerview.widget.n
    public final void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        this.g.q();
        ((SparseIntArray) this.g.b).clear();
    }

    @Override // androidx.recyclerview.widget.n
    public final void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.g.q();
        ((SparseIntArray) this.g.b).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.n
    public final void onLayoutChildren(o oVar, qrf qrfVar) {
        boolean z = qrfVar.g;
        SparseIntArray sparseIntArray = this.f;
        SparseIntArray sparseIntArray2 = this.e;
        if (z) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                q39 q39Var = (q39) getChildAt(i).getLayoutParams();
                int layoutPosition = q39Var.a.getLayoutPosition();
                sparseIntArray2.put(layoutPosition, q39Var.f);
                sparseIntArray.put(layoutPosition, q39Var.e);
            }
        }
        super.onLayoutChildren(oVar, qrfVar);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.n
    public final void onLayoutCompleted(qrf qrfVar) {
        View findViewByPosition;
        super.onLayoutCompleted(qrfVar);
        this.a = false;
        int i = this.i;
        if (i == -1 || (findViewByPosition = findViewByPosition(i)) == null) {
            return;
        }
        findViewByPosition.sendAccessibilityEvent(67108864);
        this.i = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0213  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        View view;
        u childViewHolder;
        int i2;
        int i3;
        if (i == x9.r.a() && i != -1) {
            int i4 = 0;
            while (true) {
                if (i4 >= getChildCount()) {
                    view = null;
                    break;
                }
                View childAt = getChildAt(i4);
                Objects.requireNonNull(childAt);
                if (childAt.isAccessibilityFocused()) {
                    view = getChildAt(i4);
                    break;
                }
                i4++;
            }
            if (view != null && bundle != null) {
                int i5 = bundle.getInt("android.view.accessibility.action.ARGUMENT_DIRECTION_INT", -1);
                if (l.contains(Integer.valueOf(i5)) && (childViewHolder = this.mRecyclerView.getChildViewHolder(view)) != null) {
                    int absoluteAdapterPosition = childViewHolder.getAbsoluteAdapterPosition();
                    int u = u(absoluteAdapterPosition);
                    int t = t(absoluteAdapterPosition);
                    if (u >= 0 && t >= 0) {
                        if (!v(absoluteAdapterPosition).contains(Integer.valueOf(this.j)) || !w(t(absoluteAdapterPosition), absoluteAdapterPosition).contains(Integer.valueOf(this.k))) {
                            this.j = u;
                            this.k = t;
                        }
                        int i6 = this.j;
                        if (i6 == -1) {
                            i6 = u;
                        }
                        int i7 = this.k;
                        if (i7 != -1) {
                            t = i7;
                        }
                        if (i5 == 17) {
                            i2 = absoluteAdapterPosition - 1;
                            while (i2 >= 0) {
                                int u2 = u(i2);
                                int t2 = t(i2);
                                if (u2 < 0 || t2 < 0) {
                                    break;
                                }
                                if (this.mOrientation != 1) {
                                    if (v(i2).contains(Integer.valueOf(i6)) && t2 < t) {
                                        this.k = t2;
                                        break;
                                    }
                                    i2--;
                                } else {
                                    if ((u2 == i6 && t2 < t) || u2 < i6) {
                                        this.j = u2;
                                        this.k = t2;
                                        break;
                                    }
                                    i2--;
                                }
                            }
                            i2 = -1;
                            if (i2 == -1) {
                            }
                            if (i2 != -1) {
                            }
                        } else if (i5 == 33) {
                            i2 = absoluteAdapterPosition - 1;
                            while (i2 >= 0) {
                                int u3 = u(i2);
                                int t3 = t(i2);
                                if (u3 < 0 || t3 < 0) {
                                    break;
                                }
                                if (this.mOrientation == 1) {
                                    if (u3 < i6 && w(t(i2), i2).contains(Integer.valueOf(t))) {
                                        this.j = u3;
                                        break;
                                    }
                                    i2--;
                                } else {
                                    if (u3 < i6 && t3 == t) {
                                        this.j = ((Integer) Collections.max(v(i2))).intValue();
                                        break;
                                    }
                                    i2--;
                                }
                            }
                            i2 = -1;
                            if (i2 == -1) {
                            }
                            if (i2 != -1) {
                            }
                        } else if (i5 == 66) {
                            i2 = absoluteAdapterPosition + 1;
                            while (i2 < getItemCount()) {
                                int u4 = u(i2);
                                int t4 = t(i2);
                                if (u4 < 0 || t4 < 0) {
                                    break;
                                }
                                if (this.mOrientation != 1) {
                                    if (t4 > t && v(i2).contains(Integer.valueOf(i6))) {
                                        this.k = t4;
                                        break;
                                    }
                                    i2++;
                                } else {
                                    if ((u4 == i6 && t4 > t) || u4 > i6) {
                                        this.j = u4;
                                        this.k = t4;
                                        break;
                                    }
                                    i2++;
                                }
                            }
                            i2 = -1;
                            if (i2 == -1) {
                                if (i5 != 17) {
                                }
                            }
                            if (i2 != -1) {
                            }
                        } else if (i5 == 130) {
                            i2 = absoluteAdapterPosition + 1;
                            while (i2 < getItemCount()) {
                                int u5 = u(i2);
                                int t5 = t(i2);
                                if (u5 < 0 || t5 < 0) {
                                    break;
                                }
                                if (this.mOrientation == 1) {
                                    if (u5 > i6 && (t5 == t || w(t(i2), i2).contains(Integer.valueOf(t)))) {
                                        this.j = u5;
                                        break;
                                    }
                                    i2++;
                                } else {
                                    if (u5 > i6 && t5 == t) {
                                        this.j = u(i2);
                                        break;
                                    }
                                    i2++;
                                }
                            }
                            i2 = -1;
                            if (i2 == -1 && (i3 = this.mOrientation) == 0) {
                                if (i5 != 17) {
                                    if (u >= 0 && i3 != 1) {
                                        TreeMap treeMap = new TreeMap(Collections.reverseOrder());
                                        int i8 = 0;
                                        loop2: while (true) {
                                            if (i8 >= getItemCount()) {
                                                for (Integer num : treeMap.keySet()) {
                                                    int intValue = num.intValue();
                                                    if (intValue < u) {
                                                        i2 = ((Integer) treeMap.get(num)).intValue();
                                                        this.j = intValue;
                                                        this.k = t(i2);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                Iterator it = v(i8).iterator();
                                                while (it.hasNext()) {
                                                    Integer num2 = (Integer) it.next();
                                                    if (num2.intValue() < 0) {
                                                        break loop2;
                                                    }
                                                    treeMap.put(num2, Integer.valueOf(i8));
                                                }
                                                i8++;
                                            }
                                        }
                                    }
                                    i2 = -1;
                                } else if (i5 == 66) {
                                    if (u >= 0 && i3 != 1) {
                                        TreeMap treeMap2 = new TreeMap();
                                        int i9 = 0;
                                        loop5: while (true) {
                                            if (i9 >= getItemCount()) {
                                                for (Integer num3 : treeMap2.keySet()) {
                                                    int intValue2 = num3.intValue();
                                                    if (intValue2 > u) {
                                                        i2 = ((Integer) treeMap2.get(num3)).intValue();
                                                        this.j = intValue2;
                                                        this.k = 0;
                                                        break;
                                                    }
                                                }
                                            } else {
                                                Iterator it2 = v(i9).iterator();
                                                while (it2.hasNext()) {
                                                    Integer num4 = (Integer) it2.next();
                                                    if (num4.intValue() < 0) {
                                                        break loop5;
                                                    }
                                                    if (!treeMap2.containsKey(num4)) {
                                                        treeMap2.put(num4, Integer.valueOf(i9));
                                                    }
                                                }
                                                i9++;
                                            }
                                        }
                                    }
                                    i2 = -1;
                                }
                            }
                            if (i2 != -1) {
                                scrollToPosition(i2);
                                this.i = i2;
                                return true;
                            }
                        }
                    }
                }
            }
        } else {
            if (i != 16908343 || bundle == null) {
                return super.performAccessibilityAction(i, bundle);
            }
            int i10 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
            int i11 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
            if (i10 != -1 && i11 != -1) {
                int itemCount = this.mRecyclerView.mAdapter.getItemCount();
                int i12 = 0;
                while (true) {
                    if (i12 >= itemCount) {
                        i12 = -1;
                        break;
                    }
                    RecyclerView recyclerView = this.mRecyclerView;
                    int z = z(i12, recyclerView.mRecycler, recyclerView.mState);
                    RecyclerView recyclerView2 = this.mRecyclerView;
                    int y = y(i12, recyclerView2.mRecycler, recyclerView2.mState);
                    if (this.mOrientation == 1) {
                        if (z == i11 && y == i10) {
                            break;
                        }
                        i12++;
                    } else {
                        if (z == i10 && y == i11) {
                            break;
                        }
                        i12++;
                    }
                }
                if (i12 > -1) {
                    scrollToPositionWithOffset(i12, 0);
                    return true;
                }
            }
        }
        return false;
    }

    public final void r(int i) {
        int i2;
        int[] iArr = this.c;
        int i3 = this.b;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.c = iArr;
    }

    public final void s() {
        View[] viewArr = this.d;
        if (viewArr == null || viewArr.length != this.b) {
            this.d = new View[this.b];
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.n
    public final int scrollHorizontallyBy(int i, o oVar, qrf qrfVar) {
        D();
        s();
        return super.scrollHorizontallyBy(i, oVar, qrfVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.n
    public final int scrollVerticallyBy(int i, o oVar, qrf qrfVar) {
        D();
        s();
        return super.scrollVerticallyBy(i, oVar, qrfVar);
    }

    @Override // androidx.recyclerview.widget.n
    public final void setMeasuredDimension(Rect rect, int i, int i2) {
        int chooseSize;
        int chooseSize2;
        if (this.c == null) {
            super.setMeasuredDimension(rect, i, i2);
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.mOrientation == 1) {
            chooseSize2 = n.chooseSize(i2, rect.height() + paddingBottom, getMinimumHeight());
            int[] iArr = this.c;
            chooseSize = n.chooseSize(i, iArr[iArr.length - 1] + paddingRight, getMinimumWidth());
        } else {
            chooseSize = n.chooseSize(i, rect.width() + paddingRight, getMinimumWidth());
            int[] iArr2 = this.c;
            chooseSize2 = n.chooseSize(i2, iArr2[iArr2.length - 1] + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(chooseSize, chooseSize2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void setStackFromEnd(boolean z) {
        if (z) {
            a70.m("GridLayoutManager does not support stack from end. Consider using reverse layout");
        } else {
            super.setStackFromEnd(false);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.n
    public final boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && !this.a;
    }

    public final int t(int i) {
        int i2 = this.mOrientation;
        RecyclerView recyclerView = this.mRecyclerView;
        return i2 == 0 ? y(i, recyclerView.mRecycler, recyclerView.mState) : z(i, recyclerView.mRecycler, recyclerView.mState);
    }

    public final int u(int i) {
        int i2 = this.mOrientation;
        RecyclerView recyclerView = this.mRecyclerView;
        return i2 == 1 ? y(i, recyclerView.mRecycler, recyclerView.mState) : z(i, recyclerView.mRecycler, recyclerView.mState);
    }

    public final HashSet v(int i) {
        return w(u(i), i);
    }

    public final HashSet w(int i, int i2) {
        HashSet hashSet = new HashSet();
        RecyclerView recyclerView = this.mRecyclerView;
        int A = A(i2, recyclerView.mRecycler, recyclerView.mState);
        for (int i3 = i; i3 < i + A; i3++) {
            hashSet.add(Integer.valueOf(i3));
        }
        return hashSet;
    }

    public final int x(int i, int i2) {
        if (this.mOrientation != 1 || !isLayoutRTL()) {
            int[] iArr = this.c;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.c;
        int i3 = this.b;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    public final int y(int i, o oVar, qrf qrfVar) {
        if (!qrfVar.g) {
            return this.g.m(i, this.b);
        }
        int b = oVar.b(i);
        if (b == -1) {
            return 0;
        }
        return this.g.m(b, this.b);
    }

    public final int z(int i, o oVar, qrf qrfVar) {
        if (!qrfVar.g) {
            return this.g.n(i, this.b);
        }
        int i2 = this.f.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int b = oVar.b(i);
        if (b == -1) {
            return 0;
        }
        return this.g.n(b, this.b);
    }

    @Override // androidx.recyclerview.widget.n
    public final hrf generateLayoutParams(Context context, AttributeSet attributeSet) {
        q39 q39Var = new q39(context, attributeSet);
        q39Var.e = -1;
        q39Var.f = 0;
        return q39Var;
    }

    public GridLayoutManager(int i) {
        this.a = false;
        this.b = -1;
        this.e = new SparseIntArray();
        this.f = new SparseIntArray();
        this.g = new p39(5, false);
        this.h = new Rect();
        this.i = -1;
        this.j = -1;
        this.k = -1;
        C(i);
    }

    public GridLayoutManager(int i, int i2) {
        super(1, false);
        this.a = false;
        this.b = -1;
        this.e = new SparseIntArray();
        this.f = new SparseIntArray();
        this.g = new p39(5, false);
        this.h = new Rect();
        this.i = -1;
        this.j = -1;
        this.k = -1;
        C(i);
    }
}
