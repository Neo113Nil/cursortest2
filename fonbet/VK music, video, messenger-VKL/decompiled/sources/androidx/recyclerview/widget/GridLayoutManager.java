package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.q;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import xsna.am;
import xsna.h5s;
import xsna.lhg;
import xsna.odj;

/* loaded from: classes12.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public boolean r;
    public int s;
    public int[] t;
    public View[] u;
    public final SparseIntArray v;
    public final SparseIntArray w;
    public c x;
    public final Rect y;
    public boolean z;

    public static final class a extends c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int b(int i, int i2) {
            return i % i2;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int c(int i) {
            return 1;
        }
    }

    public static class b extends RecyclerView.p {
        public int f;
        public int g;

        public b(int i, int i2) {
            super(i, i2);
            this.f = -1;
            this.g = 0;
        }
    }

    public static abstract class c {
        public final SparseIntArray a = new SparseIntArray();
        public final SparseIntArray b = new SparseIntArray();
        public boolean c = false;

        public final int a(int i, int i2) {
            int c = c(i);
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                int c2 = c(i5);
                i3 += c2;
                if (i3 == i2) {
                    i4++;
                    i3 = 0;
                } else if (i3 > i2) {
                    i4++;
                    i3 = c2;
                }
            }
            return i3 + c > i2 ? i4 + 1 : i4;
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x004f -> B:18:0x0054). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0051 -> B:18:0x0054). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0053 -> B:18:0x0054). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int b(int i, int i2) {
            int i3;
            int i4;
            int c = c(i);
            if (c != i2) {
                if (this.c) {
                    SparseIntArray sparseIntArray = this.a;
                    int size = sparseIntArray.size() - 1;
                    int i5 = 0;
                    while (i5 <= size) {
                        int i6 = (i5 + size) >>> 1;
                        if (sparseIntArray.keyAt(i6) < i) {
                            i5 = i6 + 1;
                        } else {
                            size = i6 - 1;
                        }
                    }
                    int i7 = i5 - 1;
                    i3 = (i7 < 0 || i7 >= sparseIntArray.size()) ? -1 : sparseIntArray.keyAt(i7);
                    if (i3 >= 0) {
                        i4 = c(i3) + sparseIntArray.get(i3);
                        i3++;
                        if (i3 >= i) {
                            int c2 = c(i3);
                            i4 += c2;
                            if (i4 == i2) {
                                i4 = 0;
                            } else if (i4 > i2) {
                                i4 = c2;
                            }
                            i3++;
                            if (i3 >= i) {
                                if (c + i4 <= i2) {
                                    return i4;
                                }
                            }
                        }
                    }
                }
                i3 = 0;
                i4 = 0;
                if (i3 >= i) {
                }
            }
            return 0;
        }

        public abstract int c(int i);

        public final void d() {
            this.a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.r = false;
        this.s = -1;
        this.v = new SparseIntArray();
        this.w = new SparseIntArray();
        this.x = new a();
        this.y = new Rect();
        setSpanCount(RecyclerView.o.getProperties(context, attributeSet, i, i2).b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View A(RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z, boolean z2) {
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
        int b2 = a0Var.b();
        q();
        int k = this.d.k();
        int g = this.d.g();
        View view = null;
        View view2 = null;
        while (i2 != i) {
            View childAt = getChildAt(i2);
            int position = getPosition(childAt);
            if (position >= 0 && position < b2 && V(position, vVar, a0Var) == 0) {
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
            i2 += i3;
        }
        return view != null ? view : view2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0088, code lost:
    
        r21.b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
    
        return;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G(RecyclerView.v vVar, RecyclerView.a0 a0Var, LinearLayoutManager.c cVar, LinearLayoutManager.b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int childMeasureSpec;
        int i8;
        boolean z;
        View d;
        int j = this.d.j();
        boolean z2 = j != 1073741824;
        int i9 = getChildCount() > 0 ? this.t[this.s] : 0;
        if (z2) {
            Z();
        }
        boolean z3 = cVar.e == 1;
        int i10 = this.s;
        if (!z3) {
            i10 = V(cVar.d, vVar, a0Var) + W(cVar.d, vVar, a0Var);
        }
        int i11 = 0;
        while (i11 < this.s && cVar.c(a0Var) && i10 > 0) {
            int i12 = cVar.d;
            int W = W(i12, vVar, a0Var);
            if (W > this.s) {
                throw new IllegalArgumentException(h5s.c(this.s, " spans.", odj.a(i12, W, "Item at position ", " requires ", " spans but GridLayoutManager has only ")));
            }
            i10 -= W;
            if (i10 < 0 || (d = cVar.d(vVar)) == null) {
                break;
            }
            this.u[i11] = d;
            i11++;
        }
        if (z3) {
            i3 = 1;
            i2 = i11;
            i = 0;
        } else {
            i = i11 - 1;
            i2 = -1;
            i3 = -1;
        }
        int i13 = 0;
        while (i != i2) {
            View view = this.u[i];
            b bVar2 = (b) view.getLayoutParams();
            int W2 = W(getPosition(view), vVar, a0Var);
            bVar2.g = W2;
            bVar2.f = i13;
            i13 += W2;
            i += i3;
        }
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        int i14 = 0;
        for (int i15 = 0; i15 < i11; i15++) {
            View view2 = this.u[i15];
            if (cVar.k != null) {
                z = false;
                if (z3) {
                    addDisappearingView(view2);
                } else {
                    addDisappearingView(view2, 0);
                }
            } else if (z3) {
                addView(view2);
                z = false;
            } else {
                z = false;
                addView(view2, 0);
            }
            calculateItemDecorationsForChild(view2, this.y);
            X(view2, j, z);
            int c2 = this.d.c(view2);
            if (c2 > i14) {
                i14 = c2;
            }
            float d2 = (this.d.d(view2) * 1.0f) / ((b) view2.getLayoutParams()).g;
            if (d2 > f) {
                f = d2;
            }
        }
        if (z2) {
            P(Math.max(Math.round(f * this.s), i9));
            i14 = 0;
            for (int i16 = 0; i16 < i11; i16++) {
                View view3 = this.u[i16];
                X(view3, 1073741824, true);
                int c3 = this.d.c(view3);
                if (c3 > i14) {
                    i14 = c3;
                }
            }
        }
        for (int i17 = 0; i17 < i11; i17++) {
            View view4 = this.u[i17];
            if (this.d.c(view4) != i14) {
                b bVar3 = (b) view4.getLayoutParams();
                Rect rect = bVar3.c;
                int i18 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar3).topMargin + ((ViewGroup.MarginLayoutParams) bVar3).bottomMargin;
                int i19 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar3).leftMargin + ((ViewGroup.MarginLayoutParams) bVar3).rightMargin;
                int T = T(bVar3.f, bVar3.g);
                if (this.b == 1) {
                    i8 = RecyclerView.o.getChildMeasureSpec(T, 1073741824, i19, ((ViewGroup.MarginLayoutParams) bVar3).width, false);
                    childMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14 - i18, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14 - i19, 1073741824);
                    childMeasureSpec = RecyclerView.o.getChildMeasureSpec(T, 1073741824, i18, ((ViewGroup.MarginLayoutParams) bVar3).height, false);
                    i8 = makeMeasureSpec;
                }
                if (shouldReMeasureChild(view4, i8, childMeasureSpec, (RecyclerView.p) view4.getLayoutParams())) {
                    view4.measure(i8, childMeasureSpec);
                }
            }
        }
        bVar.a = i14;
        if (this.b != 1) {
            if (cVar.f == -1) {
                int i20 = cVar.b;
                i5 = i20 - i14;
                i4 = i20;
            } else {
                int i21 = cVar.b;
                i4 = i21 + i14;
                i5 = i21;
            }
            i6 = 0;
            i7 = 0;
        } else if (cVar.f == -1) {
            i7 = cVar.b;
            i6 = i7 - i14;
            i5 = 0;
            i4 = 0;
        } else {
            int i22 = cVar.b;
            i6 = i22;
            i4 = 0;
            i7 = i22 + i14;
            i5 = 0;
        }
        for (int i23 = 0; i23 < i11; i23++) {
            View view5 = this.u[i23];
            b bVar4 = (b) view5.getLayoutParams();
            if (this.b != 1) {
                i6 = getPaddingTop() + this.t[bVar4.f];
                i7 = this.d.d(view5) + i6;
            } else if (isLayoutRTL()) {
                i4 = this.t[this.s - bVar4.f] + getPaddingLeft();
                i5 = i4 - this.d.d(view5);
            } else {
                i5 = getPaddingLeft() + this.t[bVar4.f];
                i4 = this.d.d(view5) + i5;
            }
            int i24 = i4;
            int i25 = i5;
            int i26 = i7;
            layoutDecoratedWithMargins(view5, i25, i6, i24, i26);
            i5 = i25;
            i4 = i24;
            i7 = i26;
            if (bVar4.b.isRemoved() || bVar4.b.isUpdated()) {
                bVar.c = true;
            }
            bVar.d = view5.hasFocusable() | bVar.d;
        }
        Arrays.fill(this.u, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void H(RecyclerView.v vVar, RecyclerView.a0 a0Var, LinearLayoutManager.a aVar, int i) {
        Z();
        if (a0Var.b() > 0 && !a0Var.g) {
            boolean z = i == 1;
            int V = V(aVar.b, vVar, a0Var);
            if (z) {
                while (V > 0) {
                    int i2 = aVar.b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    aVar.b = i3;
                    V = V(i3, vVar, a0Var);
                }
            } else {
                int b2 = a0Var.b() - 1;
                int i4 = aVar.b;
                while (i4 < b2) {
                    int i5 = i4 + 1;
                    int V2 = V(i5, vVar, a0Var);
                    if (V2 <= V) {
                        break;
                    }
                    i4 = i5;
                    V = V2;
                }
                aVar.b = i4;
            }
        }
        S();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void L(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.L(false);
    }

    public final void P(int i) {
        int i2;
        int[] iArr = this.t;
        int i3 = this.s;
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
        this.t = iArr;
    }

    public final int Q(RecyclerView.a0 a0Var) {
        if (getChildCount() != 0 && a0Var.b() != 0) {
            q();
            boolean z = this.i;
            boolean z2 = !z;
            View u = u(z2);
            View t = t(z2);
            if (u != null && t != null) {
                int max = this.g ? Math.max(0, ((this.x.a(a0Var.b() - 1, this.s) + 1) - Math.max(r4, r5)) - 1) : Math.max(0, Math.min(this.x.a(getPosition(u), this.s), this.x.a(getPosition(t), this.s)));
                if (z) {
                    return Math.round((max * (Math.abs(this.d.b(t) - this.d.e(u)) / ((this.x.a(getPosition(t), this.s) - this.x.a(getPosition(u), this.s)) + 1))) + (this.d.k() - this.d.e(u)));
                }
                return max;
            }
        }
        return 0;
    }

    public final int R(RecyclerView.a0 a0Var) {
        if (getChildCount() == 0 || a0Var.b() == 0) {
            return 0;
        }
        q();
        boolean z = this.i;
        boolean z2 = !z;
        View u = u(z2);
        View t = t(z2);
        if (u == null || t == null) {
            return 0;
        }
        if (!z) {
            return this.x.a(a0Var.b() - 1, this.s) + 1;
        }
        int b2 = this.d.b(t) - this.d.e(u);
        int a2 = this.x.a(getPosition(u), this.s);
        return (int) ((b2 / ((this.x.a(getPosition(t), this.s) - a2) + 1)) * (this.x.a(a0Var.b() - 1, this.s) + 1));
    }

    public final void S() {
        View[] viewArr = this.u;
        if (viewArr == null || viewArr.length != this.s) {
            this.u = new View[this.s];
        }
    }

    public final int T(int i, int i2) {
        if (this.b != 1 || !isLayoutRTL()) {
            int[] iArr = this.t;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.t;
        int i3 = this.s;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    public final int U(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (!a0Var.g) {
            return this.x.a(i, this.s);
        }
        int d = vVar.d(i);
        if (d == -1) {
            return 0;
        }
        return this.x.a(d, this.s);
    }

    public final int V(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (!a0Var.g) {
            c cVar = this.x;
            int i2 = this.s;
            SparseIntArray sparseIntArray = cVar.a;
            if (!cVar.c) {
                return cVar.b(i, i2);
            }
            int i3 = sparseIntArray.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int b2 = cVar.b(i, i2);
            sparseIntArray.put(i, b2);
            return b2;
        }
        int i4 = this.w.get(i, -1);
        if (i4 != -1) {
            return i4;
        }
        int d = vVar.d(i);
        if (d == -1) {
            return 0;
        }
        c cVar2 = this.x;
        int i5 = this.s;
        SparseIntArray sparseIntArray2 = cVar2.a;
        if (!cVar2.c) {
            return cVar2.b(d, i5);
        }
        int i6 = sparseIntArray2.get(d, -1);
        if (i6 != -1) {
            return i6;
        }
        int b3 = cVar2.b(d, i5);
        sparseIntArray2.put(d, b3);
        return b3;
    }

    public final int W(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (!a0Var.g) {
            return this.x.c(i);
        }
        int i2 = this.v.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int d = vVar.d(i);
        if (d == -1) {
            return 1;
        }
        return this.x.c(d);
    }

    public final void X(View view, int i, boolean z) {
        int i2;
        int i3;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.c;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int T = T(bVar.f, bVar.g);
        if (this.b == 1) {
            i3 = RecyclerView.o.getChildMeasureSpec(T, i, i5, ((ViewGroup.MarginLayoutParams) bVar).width, false);
            i2 = RecyclerView.o.getChildMeasureSpec(this.d.l(), getHeightMode(), i4, ((ViewGroup.MarginLayoutParams) bVar).height, true);
        } else {
            int childMeasureSpec = RecyclerView.o.getChildMeasureSpec(T, i, i4, ((ViewGroup.MarginLayoutParams) bVar).height, false);
            int childMeasureSpec2 = RecyclerView.o.getChildMeasureSpec(this.d.l(), getWidthMode(), i5, ((ViewGroup.MarginLayoutParams) bVar).width, true);
            i2 = childMeasureSpec;
            i3 = childMeasureSpec2;
        }
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        if (z ? shouldReMeasureChild(view, i3, i2, pVar) : shouldMeasureChild(view, i3, i2, pVar)) {
            view.measure(i3, i2);
        }
    }

    public final void Y(c cVar) {
        this.x = cVar;
    }

    public final void Z() {
        int height;
        int paddingTop;
        if (this.b == 1) {
            height = getWidth() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        P(height - paddingTop);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean checkLayoutParams(RecyclerView.p pVar) {
        return pVar instanceof b;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final int computeHorizontalScrollOffset(RecyclerView.a0 a0Var) {
        return this.z ? Q(a0Var) : computeScrollOffset(a0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final int computeHorizontalScrollRange(RecyclerView.a0 a0Var) {
        return this.z ? R(a0Var) : computeScrollRange(a0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final int computeVerticalScrollOffset(RecyclerView.a0 a0Var) {
        return this.z ? Q(a0Var) : computeScrollOffset(a0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final int computeVerticalScrollRange(RecyclerView.a0 a0Var) {
        return this.z ? R(a0Var) : computeScrollRange(a0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final RecyclerView.p generateDefaultLayoutParams() {
        return this.b == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final RecyclerView.p generateLayoutParams(Context context, AttributeSet attributeSet) {
        b bVar = new b(context, attributeSet);
        bVar.f = -1;
        bVar.g = 0;
        return bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int getColumnCountForAccessibility(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.b == 1) {
            return this.s;
        }
        if (a0Var.b() < 1) {
            return 0;
        }
        return U(a0Var.b() - 1, vVar, a0Var) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int getRowCountForAccessibility(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.b == 0) {
            return this.s;
        }
        if (a0Var.b() < 1) {
            return 0;
        }
        return U(a0Var.b() - 1, vVar, a0Var) + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d3, code lost:
    
        if (r13 == (r2 > r15)) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00f3, code lost:
    
        if (r13 == (r2 > r4)) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0111  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View onFocusSearchFailed(View view, int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        int childCount;
        int i2;
        int i3;
        View view2;
        View view3;
        View view4;
        int i4;
        int i5;
        int i6;
        RecyclerView.v vVar2 = vVar;
        RecyclerView.a0 a0Var2 = a0Var;
        View findContainingItemView = findContainingItemView(view);
        View view5 = null;
        if (findContainingItemView == null) {
            return null;
        }
        b bVar = (b) findContainingItemView.getLayoutParams();
        int i7 = bVar.f;
        int i8 = bVar.g + i7;
        if (super.onFocusSearchFailed(view, i, vVar, a0Var) == null) {
            return null;
        }
        if ((convertFocusDirectionToLayoutDirection(i) == 1) != this.g) {
            i3 = getChildCount() - 1;
            childCount = -1;
            i2 = -1;
        } else {
            childCount = getChildCount();
            i2 = 1;
            i3 = 0;
        }
        boolean z = this.b == 1 && isLayoutRTL();
        int U = U(i3, vVar2, a0Var2);
        int i9 = -1;
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        int i13 = i3;
        View view6 = null;
        while (i13 != childCount) {
            int U2 = U(i13, vVar2, a0Var2);
            View childAt = getChildAt(i13);
            if (childAt == findContainingItemView) {
                break;
            }
            if (!childAt.hasFocusable() || U2 == U) {
                b bVar2 = (b) childAt.getLayoutParams();
                int i14 = bVar2.f;
                view2 = findContainingItemView;
                int i15 = bVar2.g + i14;
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
                                vVar2 = vVar;
                                a0Var2 = a0Var;
                                findContainingItemView = view2;
                            }
                            if (childAt.hasFocusable()) {
                                int i16 = bVar2.f;
                                i12 = Math.min(i15, i8) - Math.max(i14, i7);
                                view6 = childAt;
                                i10 = i16;
                                i11 = i4;
                                view5 = view3;
                                i13 += i2;
                                vVar2 = vVar;
                                a0Var2 = a0Var;
                                findContainingItemView = view2;
                            } else {
                                i10 = i6;
                                i12 = i5;
                                i9 = bVar2.f;
                                view6 = view4;
                                view5 = childAt;
                                i11 = Math.min(i15, i8) - Math.max(i14, i7);
                                i13 += i2;
                                vVar2 = vVar;
                                a0Var2 = a0Var;
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
                        vVar2 = vVar;
                        a0Var2 = a0Var;
                        findContainingItemView = view2;
                    }
                } else {
                    view3 = view5;
                }
                view4 = view6;
                i4 = i11;
                i6 = i10;
                i5 = i12;
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
            i4 = i11;
            i6 = i10;
            i5 = i12;
            i10 = i6;
            i12 = i5;
            view6 = view4;
            i11 = i4;
            view5 = view3;
            i13 += i2;
            vVar2 = vVar;
            a0Var2 = a0Var;
            findContainingItemView = view2;
        }
        View view7 = view5;
        return view7 != null ? view7 : view6;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onInitializeAccessibilityNodeInfo(@NonNull RecyclerView.v vVar, @NonNull RecyclerView.a0 a0Var, @NonNull am amVar) {
        super.onInitializeAccessibilityNodeInfo(vVar, a0Var, amVar);
        amVar.n(GridView.class.getName());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onInitializeAccessibilityNodeInfoForItem(RecyclerView.v vVar, RecyclerView.a0 a0Var, View view, am amVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, amVar);
            return;
        }
        b bVar = (b) layoutParams;
        int U = U(bVar.b.getLayoutPosition(), vVar, a0Var);
        if (this.b == 0) {
            amVar.q(am.h.a(bVar.f, bVar.g, U, 1, false));
        } else {
            amVar.q(am.h.a(U, 1, bVar.f, bVar.g, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        this.x.d();
        this.x.b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onItemsChanged(RecyclerView recyclerView) {
        this.x.d();
        this.x.b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        this.x.d();
        this.x.b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        this.x.d();
        this.x.b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.x.d();
        this.x.b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final void onLayoutChildren(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        boolean z = a0Var.g;
        SparseIntArray sparseIntArray = this.w;
        SparseIntArray sparseIntArray2 = this.v;
        if (z) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                b bVar = (b) getChildAt(i).getLayoutParams();
                int layoutPosition = bVar.b.getLayoutPosition();
                sparseIntArray2.put(layoutPosition, bVar.g);
                sparseIntArray.put(layoutPosition, bVar.f);
            }
        }
        super.onLayoutChildren(vVar, a0Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public void onLayoutCompleted(RecyclerView.a0 a0Var) {
        super.onLayoutCompleted(a0Var);
        this.r = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void p(RecyclerView.a0 a0Var, LinearLayoutManager.c cVar, RecyclerView.o.c cVar2) {
        int i = this.s;
        for (int i2 = 0; i2 < this.s && cVar.c(a0Var) && i > 0; i2++) {
            int i3 = cVar.d;
            ((q.b) cVar2).a(i3, Math.max(0, cVar.g));
            i -= this.x.c(i3);
            cVar.d += cVar.e;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final int scrollHorizontallyBy(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        Z();
        S();
        return super.scrollHorizontallyBy(i, vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final int scrollVerticallyBy(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        Z();
        S();
        return super.scrollVerticallyBy(i, vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void setMeasuredDimension(Rect rect, int i, int i2) {
        int chooseSize;
        int chooseSize2;
        if (this.t == null) {
            super.setMeasuredDimension(rect, i, i2);
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.b == 1) {
            chooseSize2 = RecyclerView.o.chooseSize(i2, rect.height() + paddingBottom, getMinimumHeight());
            int[] iArr = this.t;
            chooseSize = RecyclerView.o.chooseSize(i, iArr[iArr.length - 1] + paddingRight, getMinimumWidth());
        } else {
            chooseSize = RecyclerView.o.chooseSize(i, rect.width() + paddingRight, getMinimumWidth());
            int[] iArr2 = this.t;
            chooseSize2 = RecyclerView.o.chooseSize(i2, iArr2[iArr2.length - 1] + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(chooseSize, chooseSize2);
    }

    public final void setSpanCount(int i) {
        if (i == this.s) {
            return;
        }
        this.r = true;
        if (i < 1) {
            throw new IllegalArgumentException(lhg.a(i, "Span count should be at least 1. Provided "));
        }
        this.s = i;
        this.x.d();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public boolean supportsPredictiveItemAnimations() {
        return this.m == null && !this.r;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final RecyclerView.p generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            b bVar = new b((ViewGroup.MarginLayoutParams) layoutParams);
            bVar.f = -1;
            bVar.g = 0;
            return bVar;
        }
        b bVar2 = new b(layoutParams);
        bVar2.f = -1;
        bVar2.g = 0;
        return bVar2;
    }

    public GridLayoutManager(int i) {
        this.r = false;
        this.s = -1;
        this.v = new SparseIntArray();
        this.w = new SparseIntArray();
        this.x = new a();
        this.y = new Rect();
        setSpanCount(i);
    }

    public GridLayoutManager(int i, int i2) {
        super(i2, false);
        this.r = false;
        this.s = -1;
        this.v = new SparseIntArray();
        this.w = new SparseIntArray();
        this.x = new a();
        this.y = new Rect();
        setSpanCount(i);
    }
}
