package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import com.plaid.internal.EnumC3631g;
import java.util.List;
import y0.z;

/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.q implements k.h, RecyclerView.A.b {

    /* renamed from: A, reason: collision with root package name */
    public int f22691A;

    /* renamed from: B, reason: collision with root package name */
    public int f22692B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f22693C;

    /* renamed from: D, reason: collision with root package name */
    public SavedState f22694D;

    /* renamed from: E, reason: collision with root package name */
    public final a f22695E;

    /* renamed from: F, reason: collision with root package name */
    public final b f22696F;

    /* renamed from: G, reason: collision with root package name */
    public int f22697G;
    private int[] mReusableIntPair;

    /* renamed from: s, reason: collision with root package name */
    public int f22698s;

    /* renamed from: t, reason: collision with root package name */
    public c f22699t;

    /* renamed from: u, reason: collision with root package name */
    public s f22700u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f22701v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f22702w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f22703x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f22704y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f22705z;

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public int f22706a;

        /* renamed from: b, reason: collision with root package name */
        public int f22707b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f22708c;

        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState() {
        }

        public boolean a() {
            return this.f22706a >= 0;
        }

        public void b() {
            this.f22706a = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f22706a);
            parcel.writeInt(this.f22707b);
            parcel.writeInt(this.f22708c ? 1 : 0);
        }

        public SavedState(Parcel parcel) {
            this.f22706a = parcel.readInt();
            this.f22707b = parcel.readInt();
            this.f22708c = parcel.readInt() == 1;
        }

        public SavedState(SavedState savedState) {
            this.f22706a = savedState.f22706a;
            this.f22707b = savedState.f22707b;
            this.f22708c = savedState.f22708c;
        }
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public s f22709a;

        /* renamed from: b, reason: collision with root package name */
        public int f22710b;

        /* renamed from: c, reason: collision with root package name */
        public int f22711c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f22712d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f22713e;

        public a() {
            e();
        }

        public void a() {
            this.f22711c = this.f22712d ? this.f22709a.i() : this.f22709a.m();
        }

        public void b(View view, int i10) {
            if (this.f22712d) {
                this.f22711c = this.f22709a.d(view) + this.f22709a.o();
            } else {
                this.f22711c = this.f22709a.g(view);
            }
            this.f22710b = i10;
        }

        public void c(View view, int i10) {
            int o10 = this.f22709a.o();
            if (o10 >= 0) {
                b(view, i10);
                return;
            }
            this.f22710b = i10;
            if (this.f22712d) {
                int i11 = (this.f22709a.i() - o10) - this.f22709a.d(view);
                this.f22711c = this.f22709a.i() - i11;
                if (i11 > 0) {
                    int e10 = this.f22711c - this.f22709a.e(view);
                    int m10 = this.f22709a.m();
                    int min = e10 - (m10 + Math.min(this.f22709a.g(view) - m10, 0));
                    if (min < 0) {
                        this.f22711c += Math.min(i11, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int g10 = this.f22709a.g(view);
            int m11 = g10 - this.f22709a.m();
            this.f22711c = g10;
            if (m11 > 0) {
                int i12 = (this.f22709a.i() - Math.min(0, (this.f22709a.i() - o10) - this.f22709a.d(view))) - (g10 + this.f22709a.e(view));
                if (i12 < 0) {
                    this.f22711c -= Math.min(m11, -i12);
                }
            }
        }

        public boolean d(View view, RecyclerView.B b10) {
            RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
            return !rVar.c() && rVar.a() >= 0 && rVar.a() < b10.b();
        }

        public void e() {
            this.f22710b = -1;
            this.f22711c = Integer.MIN_VALUE;
            this.f22712d = false;
            this.f22713e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f22710b + ", mCoordinate=" + this.f22711c + ", mLayoutFromEnd=" + this.f22712d + ", mValid=" + this.f22713e + '}';
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f22714a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f22715b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f22716c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f22717d;

        public void a() {
            this.f22714a = 0;
            this.f22715b = false;
            this.f22716c = false;
            this.f22717d = false;
        }
    }

    public static class c {

        /* renamed from: b, reason: collision with root package name */
        public int f22719b;

        /* renamed from: c, reason: collision with root package name */
        public int f22720c;

        /* renamed from: d, reason: collision with root package name */
        public int f22721d;

        /* renamed from: e, reason: collision with root package name */
        public int f22722e;

        /* renamed from: f, reason: collision with root package name */
        public int f22723f;

        /* renamed from: g, reason: collision with root package name */
        public int f22724g;

        /* renamed from: k, reason: collision with root package name */
        public int f22728k;

        /* renamed from: m, reason: collision with root package name */
        public boolean f22730m;

        /* renamed from: a, reason: collision with root package name */
        public boolean f22718a = true;

        /* renamed from: h, reason: collision with root package name */
        public int f22725h = 0;

        /* renamed from: i, reason: collision with root package name */
        public int f22726i = 0;

        /* renamed from: j, reason: collision with root package name */
        public boolean f22727j = false;

        /* renamed from: l, reason: collision with root package name */
        public List f22729l = null;

        public void a() {
            b(null);
        }

        public void b(View view) {
            View f10 = f(view);
            if (f10 == null) {
                this.f22721d = -1;
            } else {
                this.f22721d = ((RecyclerView.r) f10.getLayoutParams()).a();
            }
        }

        public boolean c(RecyclerView.B b10) {
            int i10 = this.f22721d;
            return i10 >= 0 && i10 < b10.b();
        }

        public View d(RecyclerView.x xVar) {
            if (this.f22729l != null) {
                return e();
            }
            View o10 = xVar.o(this.f22721d);
            this.f22721d += this.f22722e;
            return o10;
        }

        public final View e() {
            int size = this.f22729l.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = ((RecyclerView.F) this.f22729l.get(i10)).itemView;
                RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
                if (!rVar.c() && this.f22721d == rVar.a()) {
                    b(view);
                    return view;
                }
            }
            return null;
        }

        public View f(View view) {
            int a10;
            int size = this.f22729l.size();
            View view2 = null;
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < size; i11++) {
                View view3 = ((RecyclerView.F) this.f22729l.get(i11)).itemView;
                RecyclerView.r rVar = (RecyclerView.r) view3.getLayoutParams();
                if (view3 != view && !rVar.c() && (a10 = (rVar.a() - this.f22721d) * this.f22722e) >= 0 && a10 < i10) {
                    if (a10 == 0) {
                        return view3;
                    }
                    view2 = view3;
                    i10 = a10;
                }
            }
            return view2;
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    private View y2() {
        return Y(this.f22703x ? 0 : Z() - 1);
    }

    private View z2() {
        return Y(this.f22703x ? Z() - 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean A() {
        return this.f22698s == 0;
    }

    public int A2(RecyclerView.B b10) {
        if (b10.d()) {
            return this.f22700u.n();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean B() {
        return this.f22698s == 1;
    }

    public int B2() {
        return this.f22698s;
    }

    public boolean C2() {
        return this.f22702w;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean D0() {
        return true;
    }

    public boolean D2() {
        return o0() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void E(int i10, int i11, RecyclerView.B b10, RecyclerView.q.c cVar) {
        if (this.f22698s != 0) {
            i10 = i11;
        }
        if (Z() == 0 || i10 == 0) {
            return;
        }
        h2();
        W2(i10 > 0 ? 1 : -1, Math.abs(i10), true, b10);
        b2(b10, this.f22699t, cVar);
    }

    public boolean E2() {
        return this.f22705z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void F(int i10, RecyclerView.q.c cVar) {
        boolean z10;
        int i11;
        SavedState savedState = this.f22694D;
        if (savedState == null || !savedState.a()) {
            N2();
            z10 = this.f22703x;
            i11 = this.f22691A;
            if (i11 == -1) {
                i11 = z10 ? i10 - 1 : 0;
            }
        } else {
            SavedState savedState2 = this.f22694D;
            z10 = savedState2.f22708c;
            i11 = savedState2.f22706a;
        }
        int i12 = z10 ? -1 : 1;
        for (int i13 = 0; i13 < this.f22697G && i11 >= 0 && i11 < i10; i13++) {
            cVar.a(i11, 0);
            i11 += i12;
        }
    }

    public void F2(RecyclerView.x xVar, RecyclerView.B b10, c cVar, b bVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int paddingLeft;
        int f10;
        int i14;
        int i15;
        View d10 = cVar.d(xVar);
        if (d10 == null) {
            bVar.f22715b = true;
            return;
        }
        RecyclerView.r rVar = (RecyclerView.r) d10.getLayoutParams();
        if (cVar.f22729l == null) {
            if (this.f22703x == (cVar.f22723f == -1)) {
                t(d10);
            } else {
                u(d10, 0);
            }
        } else {
            if (this.f22703x == (cVar.f22723f == -1)) {
                r(d10);
            } else {
                s(d10, 0);
            }
        }
        N0(d10, 0, 0);
        bVar.f22714a = this.f22700u.e(d10);
        if (this.f22698s == 1) {
            if (D2()) {
                f10 = z0() - getPaddingRight();
                paddingLeft = f10 - this.f22700u.f(d10);
            } else {
                paddingLeft = getPaddingLeft();
                f10 = this.f22700u.f(d10) + paddingLeft;
            }
            if (cVar.f22723f == -1) {
                i15 = cVar.f22719b;
                i14 = i15 - bVar.f22714a;
            } else {
                i14 = cVar.f22719b;
                i15 = bVar.f22714a + i14;
            }
            int i16 = paddingLeft;
            i13 = i14;
            i12 = i16;
            i11 = i15;
            i10 = f10;
        } else {
            int paddingTop = getPaddingTop();
            int f11 = this.f22700u.f(d10) + paddingTop;
            if (cVar.f22723f == -1) {
                int i17 = cVar.f22719b;
                i12 = i17 - bVar.f22714a;
                i10 = i17;
                i11 = f11;
            } else {
                int i18 = cVar.f22719b;
                i10 = bVar.f22714a + i18;
                i11 = f11;
                i12 = i18;
            }
            i13 = paddingTop;
        }
        M0(d10, i12, i13, i10, i11);
        if (rVar.c() || rVar.b()) {
            bVar.f22716c = true;
        }
        bVar.f22717d = d10.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int G(RecyclerView.B b10) {
        return c2(b10);
    }

    public final void G2(RecyclerView.x xVar, RecyclerView.B b10, int i10, int i11) {
        if (!b10.g() || Z() == 0 || b10.e() || !Z1()) {
            return;
        }
        List k10 = xVar.k();
        int size = k10.size();
        int s02 = s0(Y(0));
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            RecyclerView.F f10 = (RecyclerView.F) k10.get(i14);
            if (!f10.isRemoved()) {
                if ((f10.getLayoutPosition() < s02) != this.f22703x) {
                    i12 += this.f22700u.e(f10.itemView);
                } else {
                    i13 += this.f22700u.e(f10.itemView);
                }
            }
        }
        this.f22699t.f22729l = k10;
        if (i12 > 0) {
            Z2(s0(z2()), i10);
            c cVar = this.f22699t;
            cVar.f22725h = i12;
            cVar.f22720c = 0;
            cVar.a();
            i2(xVar, this.f22699t, b10, false);
        }
        if (i13 > 0) {
            X2(s0(y2()), i11);
            c cVar2 = this.f22699t;
            cVar2.f22725h = i13;
            cVar2.f22720c = 0;
            cVar2.a();
            i2(xVar, this.f22699t, b10, false);
        }
        this.f22699t.f22729l = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int H(RecyclerView.B b10) {
        return d2(b10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean H0() {
        return this.f22702w;
    }

    public void H2(RecyclerView.x xVar, RecyclerView.B b10, a aVar, int i10) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int I(RecyclerView.B b10) {
        return e2(b10);
    }

    public final void I2(RecyclerView.x xVar, c cVar) {
        if (!cVar.f22718a || cVar.f22730m) {
            return;
        }
        int i10 = cVar.f22724g;
        int i11 = cVar.f22726i;
        if (cVar.f22723f == -1) {
            K2(xVar, i10, i11);
        } else {
            L2(xVar, i10, i11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int J(RecyclerView.B b10) {
        return c2(b10);
    }

    public final void J2(RecyclerView.x xVar, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        if (i11 <= i10) {
            while (i10 > i11) {
                B1(i10, xVar);
                i10--;
            }
        } else {
            for (int i12 = i11 - 1; i12 >= i10; i12--) {
                B1(i12, xVar);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int K(RecyclerView.B b10) {
        return d2(b10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int K1(int i10, RecyclerView.x xVar, RecyclerView.B b10) {
        if (this.f22698s == 1) {
            return 0;
        }
        return O2(i10, xVar, b10);
    }

    public final void K2(RecyclerView.x xVar, int i10, int i11) {
        int Z10 = Z();
        if (i10 < 0) {
            return;
        }
        int h10 = (this.f22700u.h() - i10) + i11;
        if (this.f22703x) {
            for (int i12 = 0; i12 < Z10; i12++) {
                View Y10 = Y(i12);
                if (this.f22700u.g(Y10) < h10 || this.f22700u.q(Y10) < h10) {
                    J2(xVar, 0, i12);
                    return;
                }
            }
            return;
        }
        int i13 = Z10 - 1;
        for (int i14 = i13; i14 >= 0; i14--) {
            View Y11 = Y(i14);
            if (this.f22700u.g(Y11) < h10 || this.f22700u.q(Y11) < h10) {
                J2(xVar, i13, i14);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int L(RecyclerView.B b10) {
        return e2(b10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void L1(int i10) {
        this.f22691A = i10;
        this.f22692B = Integer.MIN_VALUE;
        SavedState savedState = this.f22694D;
        if (savedState != null) {
            savedState.b();
        }
        H1();
    }

    public final void L2(RecyclerView.x xVar, int i10, int i11) {
        if (i10 < 0) {
            return;
        }
        int i12 = i10 - i11;
        int Z10 = Z();
        if (!this.f22703x) {
            for (int i13 = 0; i13 < Z10; i13++) {
                View Y10 = Y(i13);
                if (this.f22700u.d(Y10) > i12 || this.f22700u.p(Y10) > i12) {
                    J2(xVar, 0, i13);
                    return;
                }
            }
            return;
        }
        int i14 = Z10 - 1;
        for (int i15 = i14; i15 >= 0; i15--) {
            View Y11 = Y(i15);
            if (this.f22700u.d(Y11) > i12 || this.f22700u.p(Y11) > i12) {
                J2(xVar, i14, i15);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int M1(int i10, RecyclerView.x xVar, RecyclerView.B b10) {
        if (this.f22698s == 0) {
            return 0;
        }
        return O2(i10, xVar, b10);
    }

    public boolean M2() {
        return this.f22700u.k() == 0 && this.f22700u.h() == 0;
    }

    public final void N2() {
        if (this.f22698s == 1 || !D2()) {
            this.f22703x = this.f22702w;
        } else {
            this.f22703x = !this.f22702w;
        }
    }

    public int O2(int i10, RecyclerView.x xVar, RecyclerView.B b10) {
        if (Z() == 0 || i10 == 0) {
            return 0;
        }
        h2();
        this.f22699t.f22718a = true;
        int i11 = i10 > 0 ? 1 : -1;
        int abs = Math.abs(i10);
        W2(i11, abs, true, b10);
        c cVar = this.f22699t;
        int i22 = cVar.f22724g + i2(xVar, cVar, b10, false);
        if (i22 < 0) {
            return 0;
        }
        if (abs > i22) {
            i10 = i11 * i22;
        }
        this.f22700u.r(-i10);
        this.f22699t.f22728k = i10;
        return i10;
    }

    public void P2(int i10, int i11) {
        this.f22691A = i10;
        this.f22692B = i11;
        SavedState savedState = this.f22694D;
        if (savedState != null) {
            savedState.b();
        }
        H1();
    }

    public void Q2(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i10);
        }
        w(null);
        if (i10 != this.f22698s || this.f22700u == null) {
            s b10 = s.b(this, i10);
            this.f22700u = b10;
            this.f22695E.f22709a = b10;
            this.f22698s = i10;
            H1();
        }
    }

    public void R2(boolean z10) {
        w(null);
        if (z10 == this.f22702w) {
            return;
        }
        this.f22702w = z10;
        H1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public View S(int i10) {
        int Z10 = Z();
        if (Z10 == 0) {
            return null;
        }
        int s02 = i10 - s0(Y(0));
        if (s02 >= 0 && s02 < Z10) {
            View Y10 = Y(s02);
            if (s0(Y10) == i10) {
                return Y10;
            }
        }
        return super.S(i10);
    }

    public void S2(boolean z10) {
        w(null);
        if (this.f22704y == z10) {
            return;
        }
        this.f22704y = z10;
        H1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public RecyclerView.r T() {
        return new RecyclerView.r(-2, -2);
    }

    public final boolean T2(RecyclerView.x xVar, RecyclerView.B b10, a aVar) {
        View v22;
        boolean z10 = false;
        if (Z() == 0) {
            return false;
        }
        View l02 = l0();
        if (l02 != null && aVar.d(l02, b10)) {
            aVar.c(l02, s0(l02));
            return true;
        }
        boolean z11 = this.f22701v;
        boolean z12 = this.f22704y;
        if (z11 != z12 || (v22 = v2(xVar, b10, aVar.f22712d, z12)) == null) {
            return false;
        }
        aVar.b(v22, s0(v22));
        if (!b10.e() && Z1()) {
            int g10 = this.f22700u.g(v22);
            int d10 = this.f22700u.d(v22);
            int m10 = this.f22700u.m();
            int i10 = this.f22700u.i();
            boolean z13 = d10 <= m10 && g10 < m10;
            if (g10 >= i10 && d10 > i10) {
                z10 = true;
            }
            if (z13 || z10) {
                if (aVar.f22712d) {
                    m10 = i10;
                }
                aVar.f22711c = m10;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean U1() {
        return (n0() == 1073741824 || A0() == 1073741824 || !B0()) ? false : true;
    }

    public final boolean U2(RecyclerView.B b10, a aVar) {
        int i10;
        if (!b10.e() && (i10 = this.f22691A) != -1) {
            if (i10 >= 0 && i10 < b10.b()) {
                aVar.f22710b = this.f22691A;
                SavedState savedState = this.f22694D;
                if (savedState != null && savedState.a()) {
                    boolean z10 = this.f22694D.f22708c;
                    aVar.f22712d = z10;
                    if (z10) {
                        aVar.f22711c = this.f22700u.i() - this.f22694D.f22707b;
                    } else {
                        aVar.f22711c = this.f22700u.m() + this.f22694D.f22707b;
                    }
                    return true;
                }
                if (this.f22692B != Integer.MIN_VALUE) {
                    boolean z11 = this.f22703x;
                    aVar.f22712d = z11;
                    if (z11) {
                        aVar.f22711c = this.f22700u.i() - this.f22692B;
                    } else {
                        aVar.f22711c = this.f22700u.m() + this.f22692B;
                    }
                    return true;
                }
                View S10 = S(this.f22691A);
                if (S10 == null) {
                    if (Z() > 0) {
                        aVar.f22712d = (this.f22691A < s0(Y(0))) == this.f22703x;
                    }
                    aVar.a();
                } else {
                    if (this.f22700u.e(S10) > this.f22700u.n()) {
                        aVar.a();
                        return true;
                    }
                    if (this.f22700u.g(S10) - this.f22700u.m() < 0) {
                        aVar.f22711c = this.f22700u.m();
                        aVar.f22712d = false;
                        return true;
                    }
                    if (this.f22700u.i() - this.f22700u.d(S10) < 0) {
                        aVar.f22711c = this.f22700u.i();
                        aVar.f22712d = true;
                        return true;
                    }
                    aVar.f22711c = aVar.f22712d ? this.f22700u.d(S10) + this.f22700u.o() : this.f22700u.g(S10);
                }
                return true;
            }
            this.f22691A = -1;
            this.f22692B = Integer.MIN_VALUE;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void V0(RecyclerView recyclerView, RecyclerView.x xVar) {
        super.V0(recyclerView, xVar);
        if (this.f22693C) {
            y1(xVar);
            xVar.c();
        }
    }

    public final void V2(RecyclerView.x xVar, RecyclerView.B b10, a aVar) {
        if (U2(b10, aVar) || T2(xVar, b10, aVar)) {
            return;
        }
        aVar.a();
        aVar.f22710b = this.f22704y ? b10.b() - 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public View W0(View view, int i10, RecyclerView.x xVar, RecyclerView.B b10) {
        int f22;
        N2();
        if (Z() == 0 || (f22 = f2(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        h2();
        W2(f22, (int) (this.f22700u.n() * 0.33333334f), false, b10);
        c cVar = this.f22699t;
        cVar.f22724g = Integer.MIN_VALUE;
        cVar.f22718a = false;
        i2(xVar, cVar, b10, true);
        View u22 = f22 == -1 ? u2() : t2();
        View z22 = f22 == -1 ? z2() : y2();
        if (!z22.hasFocusable()) {
            return u22;
        }
        if (u22 == null) {
            return null;
        }
        return z22;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void W1(RecyclerView recyclerView, RecyclerView.B b10, int i10) {
        o oVar = new o(recyclerView.getContext());
        oVar.p(i10);
        X1(oVar);
    }

    public final void W2(int i10, int i11, boolean z10, RecyclerView.B b10) {
        int m10;
        this.f22699t.f22730m = M2();
        this.f22699t.f22723f = i10;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        a2(b10, iArr);
        int max = Math.max(0, this.mReusableIntPair[0]);
        int max2 = Math.max(0, this.mReusableIntPair[1]);
        boolean z11 = i10 == 1;
        c cVar = this.f22699t;
        int i12 = z11 ? max2 : max;
        cVar.f22725h = i12;
        if (!z11) {
            max = max2;
        }
        cVar.f22726i = max;
        if (z11) {
            cVar.f22725h = i12 + this.f22700u.j();
            View y22 = y2();
            c cVar2 = this.f22699t;
            cVar2.f22722e = this.f22703x ? -1 : 1;
            int s02 = s0(y22);
            c cVar3 = this.f22699t;
            cVar2.f22721d = s02 + cVar3.f22722e;
            cVar3.f22719b = this.f22700u.d(y22);
            m10 = this.f22700u.d(y22) - this.f22700u.i();
        } else {
            View z22 = z2();
            this.f22699t.f22725h += this.f22700u.m();
            c cVar4 = this.f22699t;
            cVar4.f22722e = this.f22703x ? 1 : -1;
            int s03 = s0(z22);
            c cVar5 = this.f22699t;
            cVar4.f22721d = s03 + cVar5.f22722e;
            cVar5.f22719b = this.f22700u.g(z22);
            m10 = (-this.f22700u.g(z22)) + this.f22700u.m();
        }
        c cVar6 = this.f22699t;
        cVar6.f22720c = i11;
        if (z10) {
            cVar6.f22720c = i11 - m10;
        }
        cVar6.f22724g = m10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void X0(AccessibilityEvent accessibilityEvent) {
        super.X0(accessibilityEvent);
        if (Z() > 0) {
            accessibilityEvent.setFromIndex(n2());
            accessibilityEvent.setToIndex(q2());
        }
    }

    public final void X2(int i10, int i11) {
        this.f22699t.f22720c = this.f22700u.i() - i11;
        c cVar = this.f22699t;
        cVar.f22722e = this.f22703x ? -1 : 1;
        cVar.f22721d = i10;
        cVar.f22723f = 1;
        cVar.f22719b = i11;
        cVar.f22724g = Integer.MIN_VALUE;
    }

    public final void Y2(a aVar) {
        X2(aVar.f22710b, aVar.f22711c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void Z0(RecyclerView.x xVar, RecyclerView.B b10, y0.z zVar) {
        super.Z0(xVar, b10, zVar);
        RecyclerView.h hVar = this.f22876b.f22795m;
        if (hVar == null || hVar.getItemCount() <= 0) {
            return;
        }
        zVar.b(z.a.f68198B);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean Z1() {
        return this.f22694D == null && this.f22701v == this.f22704y;
    }

    public final void Z2(int i10, int i11) {
        this.f22699t.f22720c = i11 - this.f22700u.m();
        c cVar = this.f22699t;
        cVar.f22721d = i10;
        cVar.f22722e = this.f22703x ? 1 : -1;
        cVar.f22723f = -1;
        cVar.f22719b = i11;
        cVar.f22724g = Integer.MIN_VALUE;
    }

    public void a2(RecyclerView.B b10, int[] iArr) {
        int i10;
        int A22 = A2(b10);
        if (this.f22699t.f22723f == -1) {
            i10 = 0;
        } else {
            i10 = A22;
            A22 = 0;
        }
        iArr[0] = A22;
        iArr[1] = i10;
    }

    public final void a3(a aVar) {
        Z2(aVar.f22710b, aVar.f22711c);
    }

    public void b2(RecyclerView.B b10, c cVar, RecyclerView.q.c cVar2) {
        int i10 = cVar.f22721d;
        if (i10 < 0 || i10 >= b10.b()) {
            return;
        }
        cVar2.a(i10, Math.max(0, cVar.f22724g));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.A.b
    public PointF c(int i10) {
        if (Z() == 0) {
            return null;
        }
        int i11 = (i10 < s0(Y(0))) != this.f22703x ? -1 : 1;
        return this.f22698s == 0 ? new PointF(i11, 0.0f) : new PointF(0.0f, i11);
    }

    public final int c2(RecyclerView.B b10) {
        if (Z() == 0) {
            return 0;
        }
        h2();
        return v.a(b10, this.f22700u, m2(!this.f22705z, true), l2(!this.f22705z, true), this, this.f22705z);
    }

    public final int d2(RecyclerView.B b10) {
        if (Z() == 0) {
            return 0;
        }
        h2();
        return v.b(b10, this.f22700u, m2(!this.f22705z, true), l2(!this.f22705z, true), this, this.f22705z, this.f22703x);
    }

    public final int e2(RecyclerView.B b10) {
        if (Z() == 0) {
            return 0;
        }
        h2();
        return v.c(b10, this.f22700u, m2(!this.f22705z, true), l2(!this.f22705z, true), this, this.f22705z);
    }

    @Override // androidx.recyclerview.widget.k.h
    public void f(View view, View view2, int i10, int i11) {
        w("Cannot drop a view during a scroll or layout calculation");
        h2();
        N2();
        int s02 = s0(view);
        int s03 = s0(view2);
        char c10 = s02 < s03 ? (char) 1 : (char) 65535;
        if (this.f22703x) {
            if (c10 == 1) {
                P2(s03, this.f22700u.i() - (this.f22700u.g(view2) + this.f22700u.e(view)));
                return;
            } else {
                P2(s03, this.f22700u.i() - this.f22700u.d(view2));
                return;
            }
        }
        if (c10 == 65535) {
            P2(s03, this.f22700u.g(view2));
        } else {
            P2(s03, this.f22700u.d(view2) - this.f22700u.e(view));
        }
    }

    public int f2(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 17 ? i10 != 33 ? i10 != 66 ? (i10 == 130 && this.f22698s == 1) ? 1 : Integer.MIN_VALUE : this.f22698s == 0 ? 1 : Integer.MIN_VALUE : this.f22698s == 1 ? -1 : Integer.MIN_VALUE : this.f22698s == 0 ? -1 : Integer.MIN_VALUE : (this.f22698s != 1 && D2()) ? -1 : 1 : (this.f22698s != 1 && D2()) ? 1 : -1;
    }

    public c g2() {
        return new c();
    }

    public void h2() {
        if (this.f22699t == null) {
            this.f22699t = g2();
        }
    }

    public int i2(RecyclerView.x xVar, c cVar, RecyclerView.B b10, boolean z10) {
        int i10 = cVar.f22720c;
        int i11 = cVar.f22724g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                cVar.f22724g = i11 + i10;
            }
            I2(xVar, cVar);
        }
        int i12 = cVar.f22720c + cVar.f22725h;
        b bVar = this.f22696F;
        while (true) {
            if ((!cVar.f22730m && i12 <= 0) || !cVar.c(b10)) {
                break;
            }
            bVar.a();
            F2(xVar, b10, cVar, bVar);
            if (!bVar.f22715b) {
                cVar.f22719b += bVar.f22714a * cVar.f22723f;
                if (!bVar.f22716c || cVar.f22729l != null || !b10.e()) {
                    int i13 = cVar.f22720c;
                    int i14 = bVar.f22714a;
                    cVar.f22720c = i13 - i14;
                    i12 -= i14;
                }
                int i15 = cVar.f22724g;
                if (i15 != Integer.MIN_VALUE) {
                    int i16 = i15 + bVar.f22714a;
                    cVar.f22724g = i16;
                    int i17 = cVar.f22720c;
                    if (i17 < 0) {
                        cVar.f22724g = i16 + i17;
                    }
                    I2(xVar, cVar);
                }
                if (z10 && bVar.f22717d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - cVar.f22720c;
    }

    public int j2() {
        View s22 = s2(0, Z(), true, false);
        if (s22 == null) {
            return -1;
        }
        return s0(s22);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void k1(RecyclerView.x xVar, RecyclerView.B b10) {
        int i10;
        int i11;
        int i12;
        int i13;
        int w22;
        int i14;
        View S10;
        int g10;
        int i15;
        int i16 = -1;
        if (!(this.f22694D == null && this.f22691A == -1) && b10.b() == 0) {
            y1(xVar);
            return;
        }
        SavedState savedState = this.f22694D;
        if (savedState != null && savedState.a()) {
            this.f22691A = this.f22694D.f22706a;
        }
        h2();
        this.f22699t.f22718a = false;
        N2();
        View l02 = l0();
        a aVar = this.f22695E;
        if (!aVar.f22713e || this.f22691A != -1 || this.f22694D != null) {
            aVar.e();
            a aVar2 = this.f22695E;
            aVar2.f22712d = this.f22703x ^ this.f22704y;
            V2(xVar, b10, aVar2);
            this.f22695E.f22713e = true;
        } else if (l02 != null && (this.f22700u.g(l02) >= this.f22700u.i() || this.f22700u.d(l02) <= this.f22700u.m())) {
            this.f22695E.c(l02, s0(l02));
        }
        c cVar = this.f22699t;
        cVar.f22723f = cVar.f22728k >= 0 ? 1 : -1;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        a2(b10, iArr);
        int max = Math.max(0, this.mReusableIntPair[0]) + this.f22700u.m();
        int max2 = Math.max(0, this.mReusableIntPair[1]) + this.f22700u.j();
        if (b10.e() && (i14 = this.f22691A) != -1 && this.f22692B != Integer.MIN_VALUE && (S10 = S(i14)) != null) {
            if (this.f22703x) {
                i15 = this.f22700u.i() - this.f22700u.d(S10);
                g10 = this.f22692B;
            } else {
                g10 = this.f22700u.g(S10) - this.f22700u.m();
                i15 = this.f22692B;
            }
            int i17 = i15 - g10;
            if (i17 > 0) {
                max += i17;
            } else {
                max2 -= i17;
            }
        }
        a aVar3 = this.f22695E;
        if (!aVar3.f22712d ? !this.f22703x : this.f22703x) {
            i16 = 1;
        }
        H2(xVar, b10, aVar3, i16);
        M(xVar);
        this.f22699t.f22730m = M2();
        this.f22699t.f22727j = b10.e();
        this.f22699t.f22726i = 0;
        a aVar4 = this.f22695E;
        if (aVar4.f22712d) {
            a3(aVar4);
            c cVar2 = this.f22699t;
            cVar2.f22725h = max;
            i2(xVar, cVar2, b10, false);
            c cVar3 = this.f22699t;
            i11 = cVar3.f22719b;
            int i18 = cVar3.f22721d;
            int i19 = cVar3.f22720c;
            if (i19 > 0) {
                max2 += i19;
            }
            Y2(this.f22695E);
            c cVar4 = this.f22699t;
            cVar4.f22725h = max2;
            cVar4.f22721d += cVar4.f22722e;
            i2(xVar, cVar4, b10, false);
            c cVar5 = this.f22699t;
            i10 = cVar5.f22719b;
            int i20 = cVar5.f22720c;
            if (i20 > 0) {
                Z2(i18, i11);
                c cVar6 = this.f22699t;
                cVar6.f22725h = i20;
                i2(xVar, cVar6, b10, false);
                i11 = this.f22699t.f22719b;
            }
        } else {
            Y2(aVar4);
            c cVar7 = this.f22699t;
            cVar7.f22725h = max2;
            i2(xVar, cVar7, b10, false);
            c cVar8 = this.f22699t;
            i10 = cVar8.f22719b;
            int i21 = cVar8.f22721d;
            int i22 = cVar8.f22720c;
            if (i22 > 0) {
                max += i22;
            }
            a3(this.f22695E);
            c cVar9 = this.f22699t;
            cVar9.f22725h = max;
            cVar9.f22721d += cVar9.f22722e;
            i2(xVar, cVar9, b10, false);
            c cVar10 = this.f22699t;
            i11 = cVar10.f22719b;
            int i23 = cVar10.f22720c;
            if (i23 > 0) {
                X2(i21, i10);
                c cVar11 = this.f22699t;
                cVar11.f22725h = i23;
                i2(xVar, cVar11, b10, false);
                i10 = this.f22699t.f22719b;
            }
        }
        if (Z() > 0) {
            if (this.f22703x ^ this.f22704y) {
                int w23 = w2(i10, xVar, b10, true);
                i12 = i11 + w23;
                i13 = i10 + w23;
                w22 = x2(i12, xVar, b10, false);
            } else {
                int x22 = x2(i11, xVar, b10, true);
                i12 = i11 + x22;
                i13 = i10 + x22;
                w22 = w2(i13, xVar, b10, false);
            }
            i11 = i12 + w22;
            i10 = i13 + w22;
        }
        G2(xVar, b10, i11, i10);
        if (b10.e()) {
            this.f22695E.e();
        } else {
            this.f22700u.s();
        }
        this.f22701v = this.f22704y;
    }

    public final View k2() {
        return r2(0, Z());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void l1(RecyclerView.B b10) {
        super.l1(b10);
        this.f22694D = null;
        this.f22691A = -1;
        this.f22692B = Integer.MIN_VALUE;
        this.f22695E.e();
    }

    public View l2(boolean z10, boolean z11) {
        return this.f22703x ? s2(0, Z(), z10, z11) : s2(Z() - 1, -1, z10, z11);
    }

    public View m2(boolean z10, boolean z11) {
        return this.f22703x ? s2(Z() - 1, -1, z10, z11) : s2(0, Z(), z10, z11);
    }

    public int n2() {
        View s22 = s2(0, Z(), false, true);
        if (s22 == null) {
            return -1;
        }
        return s0(s22);
    }

    public int o2() {
        View s22 = s2(Z() - 1, -1, true, false);
        if (s22 == null) {
            return -1;
        }
        return s0(s22);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void p1(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f22694D = savedState;
            if (this.f22691A != -1) {
                savedState.b();
            }
            H1();
        }
    }

    public final View p2() {
        return r2(Z() - 1, -1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public Parcelable q1() {
        if (this.f22694D != null) {
            return new SavedState(this.f22694D);
        }
        SavedState savedState = new SavedState();
        if (Z() <= 0) {
            savedState.b();
            return savedState;
        }
        h2();
        boolean z10 = this.f22701v ^ this.f22703x;
        savedState.f22708c = z10;
        if (z10) {
            View y22 = y2();
            savedState.f22707b = this.f22700u.i() - this.f22700u.d(y22);
            savedState.f22706a = s0(y22);
            return savedState;
        }
        View z22 = z2();
        savedState.f22706a = s0(z22);
        savedState.f22707b = this.f22700u.g(z22) - this.f22700u.m();
        return savedState;
    }

    public int q2() {
        View s22 = s2(Z() - 1, -1, false, true);
        if (s22 == null) {
            return -1;
        }
        return s0(s22);
    }

    public View r2(int i10, int i11) {
        int i12;
        int i13;
        h2();
        if (i11 <= i10 && i11 >= i10) {
            return Y(i10);
        }
        if (this.f22700u.g(Y(i10)) < this.f22700u.m()) {
            i12 = 16644;
            i13 = 16388;
        } else {
            i12 = 4161;
            i13 = 4097;
        }
        return this.f22698s == 0 ? this.f22879e.a(i10, i11, i12, i13) : this.f22880f.a(i10, i11, i12, i13);
    }

    public View s2(int i10, int i11, boolean z10, boolean z11) {
        h2();
        int i12 = EnumC3631g.SDK_ASSET_ILLUSTRATION_ALERT_WARNING_YELLOW_VALUE;
        int i13 = z10 ? 24579 : 320;
        if (!z11) {
            i12 = 0;
        }
        return this.f22698s == 0 ? this.f22879e.a(i10, i11, i13, i12) : this.f22880f.a(i10, i11, i13, i12);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean t1(int i10, Bundle bundle) {
        int min;
        if (super.t1(i10, bundle)) {
            return true;
        }
        if (i10 == 16908343 && bundle != null) {
            if (this.f22698s == 1) {
                int i11 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
                if (i11 < 0) {
                    return false;
                }
                RecyclerView recyclerView = this.f22876b;
                min = Math.min(i11, v0(recyclerView.f22776c, recyclerView.f22754Q4) - 1);
            } else {
                int i12 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
                if (i12 < 0) {
                    return false;
                }
                RecyclerView recyclerView2 = this.f22876b;
                min = Math.min(i12, d0(recyclerView2.f22776c, recyclerView2.f22754Q4) - 1);
            }
            if (min >= 0) {
                P2(min, 0);
                return true;
            }
        }
        return false;
    }

    public final View t2() {
        return this.f22703x ? k2() : p2();
    }

    public final View u2() {
        return this.f22703x ? p2() : k2();
    }

    public View v2(RecyclerView.x xVar, RecyclerView.B b10, boolean z10, boolean z11) {
        int i10;
        int i11;
        int i12;
        h2();
        int Z10 = Z();
        if (z11) {
            i11 = Z() - 1;
            i10 = -1;
            i12 = -1;
        } else {
            i10 = Z10;
            i11 = 0;
            i12 = 1;
        }
        int b11 = b10.b();
        int m10 = this.f22700u.m();
        int i13 = this.f22700u.i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i11 != i10) {
            View Y10 = Y(i11);
            int s02 = s0(Y10);
            int g10 = this.f22700u.g(Y10);
            int d10 = this.f22700u.d(Y10);
            if (s02 >= 0 && s02 < b11) {
                if (!((RecyclerView.r) Y10.getLayoutParams()).c()) {
                    boolean z12 = d10 <= m10 && g10 < m10;
                    boolean z13 = g10 >= i13 && d10 > i13;
                    if (!z12 && !z13) {
                        return Y10;
                    }
                    if (z10) {
                        if (!z13) {
                            if (view != null) {
                            }
                            view = Y10;
                        }
                        view2 = Y10;
                    } else {
                        if (!z12) {
                            if (view != null) {
                            }
                            view = Y10;
                        }
                        view2 = Y10;
                    }
                } else if (view3 == null) {
                    view3 = Y10;
                }
            }
            i11 += i12;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void w(String str) {
        if (this.f22694D == null) {
            super.w(str);
        }
    }

    public final int w2(int i10, RecyclerView.x xVar, RecyclerView.B b10, boolean z10) {
        int i11;
        int i12 = this.f22700u.i() - i10;
        if (i12 <= 0) {
            return 0;
        }
        int i13 = -O2(-i12, xVar, b10);
        int i14 = i10 + i13;
        if (!z10 || (i11 = this.f22700u.i() - i14) <= 0) {
            return i13;
        }
        this.f22700u.r(i11);
        return i11 + i13;
    }

    public final int x2(int i10, RecyclerView.x xVar, RecyclerView.B b10, boolean z10) {
        int m10;
        int m11 = i10 - this.f22700u.m();
        if (m11 <= 0) {
            return 0;
        }
        int i11 = -O2(m11, xVar, b10);
        int i12 = i10 + i11;
        if (!z10 || (m10 = i12 - this.f22700u.m()) <= 0) {
            return i11;
        }
        this.f22700u.r(-m10);
        return i11 - m10;
    }

    public LinearLayoutManager(Context context, int i10, boolean z10) {
        this.f22698s = 1;
        this.f22702w = false;
        this.f22703x = false;
        this.f22704y = false;
        this.f22705z = true;
        this.f22691A = -1;
        this.f22692B = Integer.MIN_VALUE;
        this.f22694D = null;
        this.f22695E = new a();
        this.f22696F = new b();
        this.f22697G = 2;
        this.mReusableIntPair = new int[2];
        Q2(i10);
        R2(z10);
    }

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f22698s = 1;
        this.f22702w = false;
        this.f22703x = false;
        this.f22704y = false;
        this.f22705z = true;
        this.f22691A = -1;
        this.f22692B = Integer.MIN_VALUE;
        this.f22694D = null;
        this.f22695E = new a();
        this.f22696F = new b();
        this.f22697G = 2;
        this.mReusableIntPair = new int[2];
        RecyclerView.q.d t02 = RecyclerView.q.t0(context, attributeSet, i10, i11);
        Q2(t02.f22895a);
        R2(t02.f22897c);
        S2(t02.f22898d);
    }
}
