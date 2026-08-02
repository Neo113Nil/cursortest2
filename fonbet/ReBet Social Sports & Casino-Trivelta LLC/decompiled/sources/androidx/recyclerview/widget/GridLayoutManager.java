package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import io.agora.rtc2.internal.AudioRoutingController;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import y0.z;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: W, reason: collision with root package name */
    public static final Set f22674W = Collections.unmodifiableSet(new HashSet(Arrays.asList(17, 66, 33, 130)));

    /* renamed from: H, reason: collision with root package name */
    public boolean f22675H;

    /* renamed from: I, reason: collision with root package name */
    public int f22676I;

    /* renamed from: J, reason: collision with root package name */
    public final SparseIntArray f22677J;

    /* renamed from: K, reason: collision with root package name */
    public final SparseIntArray f22678K;

    /* renamed from: L, reason: collision with root package name */
    public d f22679L;

    /* renamed from: O, reason: collision with root package name */
    public final Rect f22680O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f22681P;

    /* renamed from: R, reason: collision with root package name */
    public int f22682R;

    /* renamed from: T, reason: collision with root package name */
    public int f22683T;

    /* renamed from: V, reason: collision with root package name */
    public int f22684V;
    int[] mCachedBorders;
    View[] mSet;

    public static class a {
        public static boolean a(View view) {
            return view.isAccessibilityFocused();
        }
    }

    public static final class b extends d {
        @Override // androidx.recyclerview.widget.GridLayoutManager.d
        public int e(int i10, int i11) {
            return i10 % i11;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.d
        public int f(int i10) {
            return 1;
        }
    }

    public static abstract class d {

        /* renamed from: a, reason: collision with root package name */
        public final SparseIntArray f22687a = new SparseIntArray();

        /* renamed from: b, reason: collision with root package name */
        public final SparseIntArray f22688b = new SparseIntArray();

        /* renamed from: c, reason: collision with root package name */
        public boolean f22689c = false;

        /* renamed from: d, reason: collision with root package name */
        public boolean f22690d = false;

        public static int a(SparseIntArray sparseIntArray, int i10) {
            int size = sparseIntArray.size() - 1;
            int i11 = 0;
            while (i11 <= size) {
                int i12 = (i11 + size) >>> 1;
                if (sparseIntArray.keyAt(i12) < i10) {
                    i11 = i12 + 1;
                } else {
                    size = i12 - 1;
                }
            }
            int i13 = i11 - 1;
            if (i13 < 0 || i13 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i13);
        }

        public int b(int i10, int i11) {
            if (!this.f22690d) {
                return d(i10, i11);
            }
            int i12 = this.f22688b.get(i10, -1);
            if (i12 != -1) {
                return i12;
            }
            int d10 = d(i10, i11);
            this.f22688b.put(i10, d10);
            return d10;
        }

        public int c(int i10, int i11) {
            if (!this.f22689c) {
                return e(i10, i11);
            }
            int i12 = this.f22687a.get(i10, -1);
            if (i12 != -1) {
                return i12;
            }
            int e10 = e(i10, i11);
            this.f22687a.put(i10, e10);
            return e10;
        }

        public int d(int i10, int i11) {
            int i12;
            int i13;
            int i14;
            int a10;
            if (!this.f22690d || (a10 = a(this.f22688b, i10)) == -1) {
                i12 = 0;
                i13 = 0;
                i14 = 0;
            } else {
                i12 = this.f22688b.get(a10);
                i13 = a10 + 1;
                i14 = c(a10, i11) + f(a10);
                if (i14 == i11) {
                    i12++;
                    i14 = 0;
                }
            }
            int f10 = f(i10);
            while (i13 < i10) {
                int f11 = f(i13);
                i14 += f11;
                if (i14 == i11) {
                    i12++;
                    i14 = 0;
                } else if (i14 > i11) {
                    i12++;
                    i14 = f11;
                }
                i13++;
            }
            return i14 + f10 > i11 ? i12 + 1 : i12;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x002b -> B:10:0x0030). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x002d -> B:10:0x0030). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x002f -> B:10:0x0030). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int e(int i10, int i11) {
            int i12;
            int i13;
            int f10 = f(i10);
            if (f10 == i11) {
                return 0;
            }
            if (!this.f22689c || (i12 = a(this.f22687a, i10)) < 0) {
                i12 = 0;
                i13 = 0;
                if (i12 >= i10) {
                    int f11 = f(i12);
                    i13 += f11;
                    if (i13 == i11) {
                        i13 = 0;
                    } else if (i13 > i11) {
                        i13 = f11;
                    }
                    i12++;
                    if (i12 >= i10) {
                        if (f10 + i13 <= i11) {
                            return i13;
                        }
                        return 0;
                    }
                }
            } else {
                i13 = this.f22687a.get(i12) + f(i12);
                i12++;
                if (i12 >= i10) {
                }
            }
        }

        public abstract int f(int i10);

        public void g() {
            this.f22688b.clear();
        }

        public void h() {
            this.f22687a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f22675H = false;
        this.f22676I = -1;
        this.f22677J = new SparseIntArray();
        this.f22678K = new SparseIntArray();
        this.f22679L = new b();
        this.f22680O = new Rect();
        this.f22682R = -1;
        this.f22683T = -1;
        this.f22684V = -1;
        F3(RecyclerView.q.t0(context, attributeSet, i10, i11).f22896b);
    }

    public static int[] e3(int[] iArr, int i10, int i11) {
        int i12;
        if (iArr == null || iArr.length != i10 + 1 || iArr[iArr.length - 1] != i11) {
            iArr = new int[i10 + 1];
        }
        int i13 = 0;
        iArr[0] = 0;
        int i14 = i11 / i10;
        int i15 = i11 % i10;
        int i16 = 0;
        for (int i17 = 1; i17 <= i10; i17++) {
            i13 += i15;
            if (i13 <= 0 || i10 - i13 >= i15) {
                i12 = i14;
            } else {
                i12 = i14 + 1;
                i13 -= i10;
            }
            i16 += i12;
            iArr[i17] = i16;
        }
        return iArr;
    }

    public final int A3(RecyclerView.x xVar, RecyclerView.B b10, int i10) {
        if (!b10.e()) {
            return this.f22679L.f(i10);
        }
        int i11 = this.f22677J.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int f10 = xVar.f(i10);
        if (f10 != -1) {
            return this.f22679L.f(f10);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
        return 1;
    }

    public final void B3(float f10, int i10) {
        d3(Math.max(Math.round(f10 * this.f22676I), i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean C(RecyclerView.r rVar) {
        return rVar instanceof c;
    }

    public final boolean C3(int i10) {
        return (u3(i10).contains(Integer.valueOf(this.f22683T)) && s3(i10).contains(Integer.valueOf(this.f22684V))) ? false : true;
    }

    public final void D3(View view, int i10, boolean z10) {
        int i11;
        int i12;
        c cVar = (c) view.getLayoutParams();
        Rect rect = cVar.f22900b;
        int i13 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) cVar).topMargin + ((ViewGroup.MarginLayoutParams) cVar).bottomMargin;
        int i14 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) cVar).leftMargin + ((ViewGroup.MarginLayoutParams) cVar).rightMargin;
        int w32 = w3(cVar.f22685e, cVar.f22686f);
        if (this.f22698s == 1) {
            i12 = RecyclerView.q.a0(w32, i10, i14, ((ViewGroup.MarginLayoutParams) cVar).width, false);
            i11 = RecyclerView.q.a0(this.f22700u.n(), n0(), i13, ((ViewGroup.MarginLayoutParams) cVar).height, true);
        } else {
            int a02 = RecyclerView.q.a0(w32, i10, i13, ((ViewGroup.MarginLayoutParams) cVar).height, false);
            int a03 = RecyclerView.q.a0(this.f22700u.n(), A0(), i14, ((ViewGroup.MarginLayoutParams) cVar).width, true);
            i11 = a02;
            i12 = a03;
        }
        E3(view, i12, i11, z10);
    }

    public final void E3(View view, int i10, int i11, boolean z10) {
        RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
        if (z10 ? V1(view, i10, i11, rVar) : T1(view, i10, i11, rVar)) {
            view.measure(i10, i11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009f, code lost:
    
        r21.f22715b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a1, code lost:
    
        return;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void F2(RecyclerView.x xVar, RecyclerView.B b10, LinearLayoutManager.c cVar, LinearLayoutManager.b bVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int a02;
        int i17;
        View d10;
        int l10 = this.f22700u.l();
        boolean z10 = l10 != 1073741824;
        int i18 = Z() > 0 ? this.mCachedBorders[this.f22676I] : 0;
        if (z10) {
            H3();
        }
        boolean z11 = cVar.f22722e == 1;
        int i19 = this.f22676I;
        if (!z11) {
            i19 = z3(xVar, b10, cVar.f22721d) + A3(xVar, b10, cVar.f22721d);
        }
        int i20 = 0;
        while (i20 < this.f22676I && cVar.c(b10) && i19 > 0) {
            int i21 = cVar.f22721d;
            int A32 = A3(xVar, b10, i21);
            if (A32 > this.f22676I) {
                throw new IllegalArgumentException("Item at position " + i21 + " requires " + A32 + " spans but GridLayoutManager has only " + this.f22676I + " spans.");
            }
            i19 -= A32;
            if (i19 < 0 || (d10 = cVar.d(xVar)) == null) {
                break;
            }
            this.mSet[i20] = d10;
            i20++;
        }
        b3(xVar, b10, i20, z11);
        float f10 = 0.0f;
        int i22 = 0;
        for (int i23 = 0; i23 < i20; i23++) {
            View view = this.mSet[i23];
            if (cVar.f22729l == null) {
                if (z11) {
                    t(view);
                } else {
                    u(view, 0);
                }
            } else if (z11) {
                r(view);
            } else {
                s(view, 0);
            }
            z(view, this.f22680O);
            D3(view, l10, false);
            int e10 = this.f22700u.e(view);
            if (e10 > i22) {
                i22 = e10;
            }
            float f11 = (this.f22700u.f(view) * 1.0f) / ((c) view.getLayoutParams()).f22686f;
            if (f11 > f10) {
                f10 = f11;
            }
        }
        if (z10) {
            B3(f10, i18);
            i22 = 0;
            for (int i24 = 0; i24 < i20; i24++) {
                View view2 = this.mSet[i24];
                D3(view2, 1073741824, true);
                int e11 = this.f22700u.e(view2);
                if (e11 > i22) {
                    i22 = e11;
                }
            }
        }
        for (int i25 = 0; i25 < i20; i25++) {
            View view3 = this.mSet[i25];
            if (this.f22700u.e(view3) != i22) {
                c cVar2 = (c) view3.getLayoutParams();
                Rect rect = cVar2.f22900b;
                int i26 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) cVar2).topMargin + ((ViewGroup.MarginLayoutParams) cVar2).bottomMargin;
                int i27 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) cVar2).leftMargin + ((ViewGroup.MarginLayoutParams) cVar2).rightMargin;
                int w32 = w3(cVar2.f22685e, cVar2.f22686f);
                if (this.f22698s == 1) {
                    i17 = RecyclerView.q.a0(w32, 1073741824, i27, ((ViewGroup.MarginLayoutParams) cVar2).width, false);
                    a02 = View.MeasureSpec.makeMeasureSpec(i22 - i26, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i22 - i27, 1073741824);
                    a02 = RecyclerView.q.a0(w32, 1073741824, i26, ((ViewGroup.MarginLayoutParams) cVar2).height, false);
                    i17 = makeMeasureSpec;
                }
                E3(view3, i17, a02, true);
            }
        }
        bVar.f22714a = i22;
        if (this.f22698s == 1) {
            if (cVar.f22723f == -1) {
                i15 = cVar.f22719b;
                i16 = i15 - i22;
            } else {
                i16 = cVar.f22719b;
                i15 = i16 + i22;
            }
            i13 = i16;
            i14 = 0;
            i12 = 0;
        } else {
            if (cVar.f22723f == -1) {
                i11 = cVar.f22719b;
                i10 = i11 - i22;
            } else {
                i10 = cVar.f22719b;
                i11 = i10 + i22;
            }
            i12 = i10;
            i13 = 0;
            i14 = i11;
            i15 = 0;
        }
        for (int i28 = 0; i28 < i20; i28++) {
            View view4 = this.mSet[i28];
            c cVar3 = (c) view4.getLayoutParams();
            if (this.f22698s != 1) {
                i13 = this.mCachedBorders[cVar3.f22685e] + getPaddingTop();
                i15 = this.f22700u.f(view4) + i13;
            } else if (D2()) {
                i14 = getPaddingLeft() + this.mCachedBorders[this.f22676I - cVar3.f22685e];
                i12 = i14 - this.f22700u.f(view4);
            } else {
                i12 = this.mCachedBorders[cVar3.f22685e] + getPaddingLeft();
                i14 = this.f22700u.f(view4) + i12;
            }
            int i29 = i15;
            int i30 = i13;
            int i31 = i14;
            int i32 = i12;
            M0(view4, i32, i30, i31, i29);
            i15 = i29;
            i12 = i32;
            i14 = i31;
            i13 = i30;
            if (cVar3.c() || cVar3.b()) {
                bVar.f22716c = true;
            }
            bVar.f22717d = view4.hasFocusable() | bVar.f22717d;
        }
        Arrays.fill(this.mSet, (Object) null);
    }

    public void F3(int i10) {
        if (i10 == this.f22676I) {
            return;
        }
        this.f22675H = true;
        if (i10 >= 1) {
            this.f22676I = i10;
            this.f22679L.h();
            H1();
        } else {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i10);
        }
    }

    public void G3(d dVar) {
        this.f22679L = dVar;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public int H(RecyclerView.B b10) {
        return this.f22681P ? g3(b10) : super.H(b10);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void H2(RecyclerView.x xVar, RecyclerView.B b10, LinearLayoutManager.a aVar, int i10) {
        super.H2(xVar, b10, aVar, i10);
        H3();
        if (b10.b() > 0 && !b10.e()) {
            i3(xVar, b10, aVar, i10);
        }
        j3();
    }

    public final void H3() {
        int m02;
        int paddingTop;
        if (B2() == 1) {
            m02 = z0() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            m02 = m0() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        d3(m02 - paddingTop);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public int I(RecyclerView.B b10) {
        return this.f22681P ? h3(b10) : super.I(b10);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public int K(RecyclerView.B b10) {
        return this.f22681P ? g3(b10) : super.K(b10);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public int K1(int i10, RecyclerView.x xVar, RecyclerView.B b10) {
        H3();
        j3();
        return super.K1(i10, xVar, b10);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public int L(RecyclerView.B b10) {
        return this.f22681P ? h3(b10) : super.L(b10);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public int M1(int i10, RecyclerView.x xVar, RecyclerView.B b10) {
        H3();
        j3();
        return super.M1(i10, xVar, b10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void Q1(Rect rect, int i10, int i11) {
        int D10;
        int D11;
        if (this.mCachedBorders == null) {
            super.Q1(rect, i10, i11);
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.f22698s == 1) {
            D11 = RecyclerView.q.D(i11, rect.height() + paddingTop, q0());
            int[] iArr = this.mCachedBorders;
            D10 = RecyclerView.q.D(i10, iArr[iArr.length - 1] + paddingLeft, r0());
        } else {
            D10 = RecyclerView.q.D(i10, rect.width() + paddingLeft, r0());
            int[] iArr2 = this.mCachedBorders;
            D11 = RecyclerView.q.D(i11, iArr2[iArr2.length - 1] + paddingTop, q0());
        }
        P1(D10, D11);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void S2(boolean z10) {
        if (z10) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.S2(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public RecyclerView.r T() {
        return this.f22698s == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public RecyclerView.r U(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public RecyclerView.r V(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d3, code lost:
    
        if (r13 == (r2 > r15)) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00f3, code lost:
    
        if (r13 == (r2 > r4)) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0111  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View W0(View view, int i10, RecyclerView.x xVar, RecyclerView.B b10) {
        int Z10;
        int i11;
        int i12;
        View view2;
        View view3;
        View view4;
        int i13;
        int i14;
        int i15;
        RecyclerView.x xVar2 = xVar;
        RecyclerView.B b11 = b10;
        View R10 = R(view);
        View view5 = null;
        if (R10 == null) {
            return null;
        }
        c cVar = (c) R10.getLayoutParams();
        int i16 = cVar.f22685e;
        int i17 = cVar.f22686f + i16;
        if (super.W0(view, i10, xVar, b10) == null) {
            return null;
        }
        if ((f2(i10) == 1) != this.f22703x) {
            i12 = Z() - 1;
            Z10 = -1;
            i11 = -1;
        } else {
            Z10 = Z();
            i11 = 1;
            i12 = 0;
        }
        boolean z10 = this.f22698s == 1 && D2();
        int y32 = y3(xVar2, b11, i12);
        int i18 = -1;
        int i19 = -1;
        int i20 = 0;
        int i21 = 0;
        int i22 = i12;
        View view6 = null;
        while (i22 != Z10) {
            int y33 = y3(xVar2, b11, i22);
            View Y10 = Y(i22);
            if (Y10 == R10) {
                break;
            }
            if (!Y10.hasFocusable() || y33 == y32) {
                c cVar2 = (c) Y10.getLayoutParams();
                int i23 = cVar2.f22685e;
                view2 = R10;
                int i24 = cVar2.f22686f + i23;
                if (Y10.hasFocusable() && i23 == i16 && i24 == i17) {
                    return Y10;
                }
                if (!(Y10.hasFocusable() && view5 == null) && (Y10.hasFocusable() || view6 != null)) {
                    view3 = view5;
                    int min = Math.min(i24, i17) - Math.max(i23, i16);
                    if (Y10.hasFocusable()) {
                        if (min <= i20) {
                            if (min == i20) {
                            }
                        }
                    } else if (view3 == null) {
                        view4 = view6;
                        i13 = i20;
                        if (L0(Y10, false, true)) {
                            i14 = i21;
                            if (min > i14) {
                                i15 = i19;
                            } else {
                                if (min == i14) {
                                    i15 = i19;
                                } else {
                                    i15 = i19;
                                }
                                i19 = i15;
                                i21 = i14;
                                view6 = view4;
                                i20 = i13;
                                view5 = view3;
                                i22 += i11;
                                xVar2 = xVar;
                                b11 = b10;
                                R10 = view2;
                            }
                            if (Y10.hasFocusable()) {
                                int i25 = cVar2.f22685e;
                                i21 = Math.min(i24, i17) - Math.max(i23, i16);
                                view6 = Y10;
                                i19 = i25;
                                i20 = i13;
                                view5 = view3;
                                i22 += i11;
                                xVar2 = xVar;
                                b11 = b10;
                                R10 = view2;
                            } else {
                                i19 = i15;
                                i21 = i14;
                                i18 = cVar2.f22685e;
                                view6 = view4;
                                view5 = Y10;
                                i20 = Math.min(i24, i17) - Math.max(i23, i16);
                                i22 += i11;
                                xVar2 = xVar;
                                b11 = b10;
                                R10 = view2;
                            }
                        }
                        i15 = i19;
                        i14 = i21;
                        i19 = i15;
                        i21 = i14;
                        view6 = view4;
                        i20 = i13;
                        view5 = view3;
                        i22 += i11;
                        xVar2 = xVar;
                        b11 = b10;
                        R10 = view2;
                    }
                } else {
                    view3 = view5;
                }
                view4 = view6;
                i13 = i20;
                i15 = i19;
                i14 = i21;
                if (Y10.hasFocusable()) {
                }
            } else {
                if (view5 != null) {
                    break;
                }
                view2 = R10;
                view3 = view5;
            }
            view4 = view6;
            i13 = i20;
            i15 = i19;
            i14 = i21;
            i19 = i15;
            i21 = i14;
            view6 = view4;
            i20 = i13;
            view5 = view3;
            i22 += i11;
            xVar2 = xVar;
            b11 = b10;
            R10 = view2;
        }
        View view7 = view5;
        return view7 != null ? view7 : view6;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public void Z0(RecyclerView.x xVar, RecyclerView.B b10, y0.z zVar) {
        super.Z0(xVar, b10, zVar);
        zVar.w0(GridView.class.getName());
        RecyclerView.h hVar = this.f22876b.f22795m;
        if (hVar == null || hVar.getItemCount() <= 1) {
            return;
        }
        zVar.b(z.a.f68218V);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public boolean Z1() {
        return this.f22694D == null && !this.f22675H;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void b2(RecyclerView.B b10, LinearLayoutManager.c cVar, RecyclerView.q.c cVar2) {
        int i10 = this.f22676I;
        for (int i11 = 0; i11 < this.f22676I && cVar.c(b10) && i10 > 0; i11++) {
            int i12 = cVar.f22721d;
            cVar2.a(i12, Math.max(0, cVar.f22724g));
            i10 -= this.f22679L.f(i12);
            cVar.f22721d += cVar.f22722e;
        }
    }

    public final void b3(RecyclerView.x xVar, RecyclerView.B b10, int i10, boolean z10) {
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        if (z10) {
            i13 = 1;
            i12 = i10;
            i11 = 0;
        } else {
            i11 = i10 - 1;
            i12 = -1;
            i13 = -1;
        }
        while (i11 != i12) {
            View view = this.mSet[i11];
            c cVar = (c) view.getLayoutParams();
            int A32 = A3(xVar, b10, s0(view));
            cVar.f22686f = A32;
            cVar.f22685e = i14;
            i14 += A32;
            i11 += i13;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void c1(RecyclerView.x xVar, RecyclerView.B b10, View view, y0.z zVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof c)) {
            super.b1(view, zVar);
            return;
        }
        c cVar = (c) layoutParams;
        int y32 = y3(xVar, b10, cVar.a());
        if (this.f22698s == 0) {
            zVar.z0(z.g.b(cVar.e(), cVar.f(), y32, 1, false, false));
        } else {
            zVar.z0(z.g.b(y32, 1, cVar.e(), cVar.f(), false, false));
        }
    }

    public final void c3() {
        int Z10 = Z();
        for (int i10 = 0; i10 < Z10; i10++) {
            c cVar = (c) Y(i10).getLayoutParams();
            int a10 = cVar.a();
            this.f22677J.put(a10, cVar.f());
            this.f22678K.put(a10, cVar.e());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int d0(RecyclerView.x xVar, RecyclerView.B b10) {
        if (this.f22698s == 1) {
            return Math.min(this.f22676I, j());
        }
        if (b10.b() < 1) {
            return 0;
        }
        return y3(xVar, b10, b10.b() - 1) + 1;
    }

    public final void d3(int i10) {
        this.mCachedBorders = e3(this.mCachedBorders, this.f22676I, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void e1(RecyclerView recyclerView, int i10, int i11) {
        this.f22679L.h();
        this.f22679L.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void f1(RecyclerView recyclerView) {
        this.f22679L.h();
        this.f22679L.g();
    }

    public final void f3() {
        this.f22677J.clear();
        this.f22678K.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void g1(RecyclerView recyclerView, int i10, int i11, int i12) {
        this.f22679L.h();
        this.f22679L.g();
    }

    public final int g3(RecyclerView.B b10) {
        if (Z() != 0 && b10.b() != 0) {
            h2();
            boolean E22 = E2();
            View m22 = m2(!E22, true);
            View l22 = l2(!E22, true);
            if (m22 != null && l22 != null) {
                int b11 = this.f22679L.b(s0(m22), this.f22676I);
                int b12 = this.f22679L.b(s0(l22), this.f22676I);
                int max = this.f22703x ? Math.max(0, ((this.f22679L.b(b10.b() - 1, this.f22676I) + 1) - Math.max(b11, b12)) - 1) : Math.max(0, Math.min(b11, b12));
                if (E22) {
                    return Math.round((max * (Math.abs(this.f22700u.d(l22) - this.f22700u.g(m22)) / ((this.f22679L.b(s0(l22), this.f22676I) - this.f22679L.b(s0(m22), this.f22676I)) + 1))) + (this.f22700u.m() - this.f22700u.g(m22)));
                }
                return max;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void h1(RecyclerView recyclerView, int i10, int i11) {
        this.f22679L.h();
        this.f22679L.g();
    }

    public final int h3(RecyclerView.B b10) {
        if (Z() != 0 && b10.b() != 0) {
            h2();
            View m22 = m2(!E2(), true);
            View l22 = l2(!E2(), true);
            if (m22 != null && l22 != null) {
                if (!E2()) {
                    return this.f22679L.b(b10.b() - 1, this.f22676I) + 1;
                }
                int d10 = this.f22700u.d(l22) - this.f22700u.g(m22);
                int b11 = this.f22679L.b(s0(m22), this.f22676I);
                return (int) ((d10 / ((this.f22679L.b(s0(l22), this.f22676I) - b11) + 1)) * (this.f22679L.b(b10.b() - 1, this.f22676I) + 1));
            }
        }
        return 0;
    }

    public final void i3(RecyclerView.x xVar, RecyclerView.B b10, LinearLayoutManager.a aVar, int i10) {
        boolean z10 = i10 == 1;
        int z32 = z3(xVar, b10, aVar.f22710b);
        if (z10) {
            while (z32 > 0) {
                int i11 = aVar.f22710b;
                if (i11 <= 0) {
                    return;
                }
                int i12 = i11 - 1;
                aVar.f22710b = i12;
                z32 = z3(xVar, b10, i12);
            }
            return;
        }
        int b11 = b10.b() - 1;
        int i13 = aVar.f22710b;
        while (i13 < b11) {
            int i14 = i13 + 1;
            int z33 = z3(xVar, b10, i14);
            if (z33 <= z32) {
                break;
            }
            i13 = i14;
            z32 = z33;
        }
        aVar.f22710b = i13;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void j1(RecyclerView recyclerView, int i10, int i11, Object obj) {
        this.f22679L.h();
        this.f22679L.g();
    }

    public final void j3() {
        View[] viewArr = this.mSet;
        if (viewArr == null || viewArr.length != this.f22676I) {
            this.mSet = new View[this.f22676I];
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public void k1(RecyclerView.x xVar, RecyclerView.B b10) {
        if (b10.e()) {
            c3();
        }
        super.k1(xVar, b10);
        f3();
    }

    public final View k3() {
        for (int i10 = 0; i10 < Z(); i10++) {
            View Y10 = Y(i10);
            Objects.requireNonNull(Y10);
            if (a.a(Y10)) {
                return Y(i10);
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public void l1(RecyclerView.B b10) {
        View S10;
        super.l1(b10);
        this.f22675H = false;
        int i10 = this.f22682R;
        if (i10 == -1 || (S10 = S(i10)) == null) {
            return;
        }
        S10.sendAccessibilityEvent(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        this.f22682R = -1;
    }

    public int l3(int i10) {
        if (i10 < 0 || this.f22698s == 1) {
            return -1;
        }
        TreeMap treeMap = new TreeMap();
        for (int i11 = 0; i11 < j(); i11++) {
            for (Integer num : u3(i11)) {
                if (num.intValue() < 0) {
                    return -1;
                }
                if (!treeMap.containsKey(num)) {
                    treeMap.put(num, Integer.valueOf(i11));
                }
            }
        }
        for (Integer num2 : treeMap.keySet()) {
            int intValue = num2.intValue();
            if (intValue > i10) {
                int intValue2 = ((Integer) treeMap.get(num2)).intValue();
                this.f22683T = intValue;
                this.f22684V = 0;
                return intValue2;
            }
        }
        return -1;
    }

    public int m3(int i10) {
        if (i10 < 0 || this.f22698s == 1) {
            return -1;
        }
        TreeMap treeMap = new TreeMap(Collections.reverseOrder());
        for (int i11 = 0; i11 < j(); i11++) {
            for (Integer num : u3(i11)) {
                if (num.intValue() < 0) {
                    return -1;
                }
                treeMap.put(num, Integer.valueOf(i11));
            }
        }
        for (Integer num2 : treeMap.keySet()) {
            int intValue = num2.intValue();
            if (intValue < i10) {
                int intValue2 = ((Integer) treeMap.get(num2)).intValue();
                this.f22683T = intValue;
                this.f22684V = r3(intValue2);
                return intValue2;
            }
        }
        return -1;
    }

    public final int n3(int i10, int i11, int i12) {
        for (int i13 = i12 - 1; i13 >= 0; i13--) {
            int t32 = t3(i13);
            int r32 = r3(i13);
            if (t32 < 0 || r32 < 0) {
                break;
            }
            if (this.f22698s == 1) {
                if (t32 < i10 && s3(i13).contains(Integer.valueOf(i11))) {
                    this.f22683T = t32;
                    return i13;
                }
            } else if (t32 < i10 && r32 == i11) {
                this.f22683T = ((Integer) Collections.max(u3(i13))).intValue();
                return i13;
            }
        }
        return -1;
    }

    public final int o3(int i10, int i11, int i12) {
        for (int i13 = i12 + 1; i13 < j(); i13++) {
            int t32 = t3(i13);
            int r32 = r3(i13);
            if (t32 < 0 || r32 < 0) {
                break;
            }
            if (this.f22698s == 1) {
                if (t32 > i10 && (r32 == i11 || s3(i13).contains(Integer.valueOf(i11)))) {
                    this.f22683T = t32;
                    return i13;
                }
            } else if (t32 > i10 && r32 == i11) {
                this.f22683T = t3(i13);
                return i13;
            }
        }
        return -1;
    }

    public final int p3(int i10, int i11, int i12) {
        for (int i13 = i12 - 1; i13 >= 0; i13--) {
            int t32 = t3(i13);
            int r32 = r3(i13);
            if (t32 < 0 || r32 < 0) {
                break;
            }
            if (this.f22698s == 1) {
                if ((t32 == i10 && r32 < i11) || t32 < i10) {
                    this.f22683T = t32;
                    this.f22684V = r32;
                    return i13;
                }
            } else if (u3(i13).contains(Integer.valueOf(i10)) && r32 < i11) {
                this.f22684V = r32;
                return i13;
            }
        }
        return -1;
    }

    public final int q3(int i10, int i11, int i12) {
        for (int i13 = i12 + 1; i13 < j(); i13++) {
            int t32 = t3(i13);
            int r32 = r3(i13);
            if (t32 < 0 || r32 < 0) {
                break;
            }
            if (this.f22698s == 1) {
                if ((t32 == i10 && r32 > i11) || t32 > i10) {
                    this.f22683T = t32;
                    this.f22684V = r32;
                    return i13;
                }
            } else if (r32 > i11 && u3(i13).contains(Integer.valueOf(i10))) {
                this.f22684V = r32;
                return i13;
            }
        }
        return -1;
    }

    public final int r3(int i10) {
        if (this.f22698s == 0) {
            RecyclerView recyclerView = this.f22876b;
            return y3(recyclerView.f22776c, recyclerView.f22754Q4, i10);
        }
        RecyclerView recyclerView2 = this.f22876b;
        return z3(recyclerView2.f22776c, recyclerView2.f22754Q4, i10);
    }

    public final Set s3(int i10) {
        return v3(r3(i10), i10);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public boolean t1(int i10, Bundle bundle) {
        RecyclerView.F o02;
        int p32;
        if (i10 != z.a.f68218V.b() || i10 == -1) {
            if (i10 != 16908343 || bundle == null) {
                return super.t1(i10, bundle);
            }
            int i11 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
            int i12 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
            if (i11 != -1 && i12 != -1) {
                int itemCount = this.f22876b.f22795m.getItemCount();
                int i13 = 0;
                while (true) {
                    if (i13 >= itemCount) {
                        i13 = -1;
                        break;
                    }
                    RecyclerView recyclerView = this.f22876b;
                    int z32 = z3(recyclerView.f22776c, recyclerView.f22754Q4, i13);
                    RecyclerView recyclerView2 = this.f22876b;
                    int y32 = y3(recyclerView2.f22776c, recyclerView2.f22754Q4, i13);
                    if (this.f22698s == 1) {
                        if (z32 == i12 && y32 == i11) {
                            break;
                        }
                        i13++;
                    } else {
                        if (z32 == i11 && y32 == i12) {
                            break;
                        }
                        i13++;
                    }
                }
                if (i13 > -1) {
                    P2(i13, 0);
                    return true;
                }
            }
            return false;
        }
        View k32 = k3();
        if (k32 == null || bundle == null) {
            return false;
        }
        int i14 = bundle.getInt("android.view.accessibility.action.ARGUMENT_DIRECTION_INT", -1);
        if (!f22674W.contains(Integer.valueOf(i14)) || (o02 = this.f22876b.o0(k32)) == null) {
            return false;
        }
        int absoluteAdapterPosition = o02.getAbsoluteAdapterPosition();
        int t32 = t3(absoluteAdapterPosition);
        int r32 = r3(absoluteAdapterPosition);
        if (t32 >= 0 && r32 >= 0) {
            if (C3(absoluteAdapterPosition)) {
                this.f22683T = t32;
                this.f22684V = r32;
            }
            int i15 = this.f22683T;
            if (i15 == -1) {
                i15 = t32;
            }
            int i16 = this.f22684V;
            if (i16 != -1) {
                r32 = i16;
            }
            if (i14 == 17) {
                p32 = p3(i15, r32, absoluteAdapterPosition);
            } else if (i14 == 33) {
                p32 = n3(i15, r32, absoluteAdapterPosition);
            } else if (i14 == 66) {
                p32 = q3(i15, r32, absoluteAdapterPosition);
            } else {
                if (i14 != 130) {
                    return false;
                }
                p32 = o3(i15, r32, absoluteAdapterPosition);
            }
            if (p32 == -1 && this.f22698s == 0) {
                if (i14 == 17) {
                    p32 = m3(t32);
                } else if (i14 == 66) {
                    p32 = l3(t32);
                }
            }
            if (p32 != -1) {
                L1(p32);
                this.f22682R = p32;
                return true;
            }
        }
        return false;
    }

    public final int t3(int i10) {
        if (this.f22698s == 1) {
            RecyclerView recyclerView = this.f22876b;
            return y3(recyclerView.f22776c, recyclerView.f22754Q4, i10);
        }
        RecyclerView recyclerView2 = this.f22876b;
        return z3(recyclerView2.f22776c, recyclerView2.f22754Q4, i10);
    }

    public final Set u3(int i10) {
        return v3(t3(i10), i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int v0(RecyclerView.x xVar, RecyclerView.B b10) {
        if (this.f22698s == 0) {
            return Math.min(this.f22676I, j());
        }
        if (b10.b() < 1) {
            return 0;
        }
        return y3(xVar, b10, b10.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public View v2(RecyclerView.x xVar, RecyclerView.B b10, boolean z10, boolean z11) {
        int i10;
        int i11;
        int Z10 = Z();
        int i12 = 1;
        if (z11) {
            i11 = Z() - 1;
            i10 = -1;
            i12 = -1;
        } else {
            i10 = Z10;
            i11 = 0;
        }
        int b11 = b10.b();
        h2();
        int m10 = this.f22700u.m();
        int i13 = this.f22700u.i();
        View view = null;
        View view2 = null;
        while (i11 != i10) {
            View Y10 = Y(i11);
            int s02 = s0(Y10);
            if (s02 >= 0 && s02 < b11 && z3(xVar, b10, s02) == 0) {
                if (((RecyclerView.r) Y10.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = Y10;
                    }
                } else {
                    if (this.f22700u.g(Y10) < i13 && this.f22700u.d(Y10) >= m10) {
                        return Y10;
                    }
                    if (view == null) {
                        view = Y10;
                    }
                }
            }
            i11 += i12;
        }
        return view != null ? view : view2;
    }

    public final Set v3(int i10, int i11) {
        HashSet hashSet = new HashSet();
        RecyclerView recyclerView = this.f22876b;
        int A32 = A3(recyclerView.f22776c, recyclerView.f22754Q4, i11);
        for (int i12 = i10; i12 < i10 + A32; i12++) {
            hashSet.add(Integer.valueOf(i12));
        }
        return hashSet;
    }

    public int w3(int i10, int i11) {
        if (this.f22698s != 1 || !D2()) {
            int[] iArr = this.mCachedBorders;
            return iArr[i11 + i10] - iArr[i10];
        }
        int[] iArr2 = this.mCachedBorders;
        int i12 = this.f22676I;
        return iArr2[i12 - i10] - iArr2[(i12 - i10) - i11];
    }

    public int x3() {
        return this.f22676I;
    }

    public final int y3(RecyclerView.x xVar, RecyclerView.B b10, int i10) {
        if (!b10.e()) {
            return this.f22679L.b(i10, this.f22676I);
        }
        int f10 = xVar.f(i10);
        if (f10 != -1) {
            return this.f22679L.b(f10, this.f22676I);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i10);
        return 0;
    }

    public final int z3(RecyclerView.x xVar, RecyclerView.B b10, int i10) {
        if (!b10.e()) {
            return this.f22679L.c(i10, this.f22676I);
        }
        int i11 = this.f22678K.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int f10 = xVar.f(i10);
        if (f10 != -1) {
            return this.f22679L.c(f10, this.f22676I);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
        return 0;
    }

    public static class c extends RecyclerView.r {

        /* renamed from: e, reason: collision with root package name */
        public int f22685e;

        /* renamed from: f, reason: collision with root package name */
        public int f22686f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f22685e = -1;
            this.f22686f = 0;
        }

        public int e() {
            return this.f22685e;
        }

        public int f() {
            return this.f22686f;
        }

        public c(int i10, int i11) {
            super(i10, i11);
            this.f22685e = -1;
            this.f22686f = 0;
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f22685e = -1;
            this.f22686f = 0;
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f22685e = -1;
            this.f22686f = 0;
        }
    }

    public GridLayoutManager(Context context, int i10) {
        super(context);
        this.f22675H = false;
        this.f22676I = -1;
        this.f22677J = new SparseIntArray();
        this.f22678K = new SparseIntArray();
        this.f22679L = new b();
        this.f22680O = new Rect();
        this.f22682R = -1;
        this.f22683T = -1;
        this.f22684V = -1;
        F3(i10);
    }

    public GridLayoutManager(Context context, int i10, int i11, boolean z10) {
        super(context, i11, z10);
        this.f22675H = false;
        this.f22676I = -1;
        this.f22677J = new SparseIntArray();
        this.f22678K = new SparseIntArray();
        this.f22679L = new b();
        this.f22680O = new Rect();
        this.f22682R = -1;
        this.f22683T = -1;
        this.f22684V = -1;
        F3(i10);
    }
}
