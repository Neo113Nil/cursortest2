package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import y0.z;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.q implements RecyclerView.A.b {

    /* renamed from: A, reason: collision with root package name */
    public BitSet f22919A;

    /* renamed from: F, reason: collision with root package name */
    public boolean f22924F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f22925G;

    /* renamed from: H, reason: collision with root package name */
    public SavedState f22926H;

    /* renamed from: I, reason: collision with root package name */
    public int f22927I;
    private int[] mPrefetchDistances;
    d[] mSpans;

    /* renamed from: t, reason: collision with root package name */
    public s f22934t;

    /* renamed from: u, reason: collision with root package name */
    public s f22935u;

    /* renamed from: v, reason: collision with root package name */
    public int f22936v;

    /* renamed from: w, reason: collision with root package name */
    public int f22937w;

    /* renamed from: x, reason: collision with root package name */
    public final n f22938x;

    /* renamed from: s, reason: collision with root package name */
    public int f22933s = -1;

    /* renamed from: y, reason: collision with root package name */
    public boolean f22939y = false;

    /* renamed from: z, reason: collision with root package name */
    public boolean f22940z = false;

    /* renamed from: B, reason: collision with root package name */
    public int f22920B = -1;

    /* renamed from: C, reason: collision with root package name */
    public int f22921C = Integer.MIN_VALUE;

    /* renamed from: D, reason: collision with root package name */
    public LazySpanLookup f22922D = new LazySpanLookup();

    /* renamed from: E, reason: collision with root package name */
    public int f22923E = 2;

    /* renamed from: J, reason: collision with root package name */
    public final Rect f22928J = new Rect();

    /* renamed from: K, reason: collision with root package name */
    public final b f22929K = new b();

    /* renamed from: L, reason: collision with root package name */
    public boolean f22930L = false;

    /* renamed from: O, reason: collision with root package name */
    public boolean f22931O = true;

    /* renamed from: P, reason: collision with root package name */
    public final Runnable f22932P = new a();

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public int f22945a;

        /* renamed from: b, reason: collision with root package name */
        public int f22946b;

        /* renamed from: c, reason: collision with root package name */
        public int f22947c;

        /* renamed from: d, reason: collision with root package name */
        public int f22948d;

        /* renamed from: e, reason: collision with root package name */
        public List f22949e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f22950f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f22951g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f22952h;
        int[] mSpanLookup;
        int[] mSpanOffsets;

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

        public void a() {
            this.mSpanOffsets = null;
            this.f22947c = 0;
            this.f22945a = -1;
            this.f22946b = -1;
        }

        public void b() {
            this.mSpanOffsets = null;
            this.f22947c = 0;
            this.f22948d = 0;
            this.mSpanLookup = null;
            this.f22949e = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f22945a);
            parcel.writeInt(this.f22946b);
            parcel.writeInt(this.f22947c);
            if (this.f22947c > 0) {
                parcel.writeIntArray(this.mSpanOffsets);
            }
            parcel.writeInt(this.f22948d);
            if (this.f22948d > 0) {
                parcel.writeIntArray(this.mSpanLookup);
            }
            parcel.writeInt(this.f22950f ? 1 : 0);
            parcel.writeInt(this.f22951g ? 1 : 0);
            parcel.writeInt(this.f22952h ? 1 : 0);
            parcel.writeList(this.f22949e);
        }

        public SavedState(Parcel parcel) {
            this.f22945a = parcel.readInt();
            this.f22946b = parcel.readInt();
            int readInt = parcel.readInt();
            this.f22947c = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.mSpanOffsets = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f22948d = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.mSpanLookup = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f22950f = parcel.readInt() == 1;
            this.f22951g = parcel.readInt() == 1;
            this.f22952h = parcel.readInt() == 1;
            this.f22949e = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.f22947c = savedState.f22947c;
            this.f22945a = savedState.f22945a;
            this.f22946b = savedState.f22946b;
            this.mSpanOffsets = savedState.mSpanOffsets;
            this.f22948d = savedState.f22948d;
            this.mSpanLookup = savedState.mSpanLookup;
            this.f22950f = savedState.f22950f;
            this.f22951g = savedState.f22951g;
            this.f22952h = savedState.f22952h;
            this.f22949e = savedState.f22949e;
        }
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.g2();
        }
    }

    public class b {

        /* renamed from: a, reason: collision with root package name */
        public int f22954a;

        /* renamed from: b, reason: collision with root package name */
        public int f22955b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f22956c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f22957d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f22958e;
        int[] mSpanReferenceLines;

        public b() {
            c();
        }

        public void a() {
            this.f22955b = this.f22956c ? StaggeredGridLayoutManager.this.f22934t.i() : StaggeredGridLayoutManager.this.f22934t.m();
        }

        public void b(int i10) {
            if (this.f22956c) {
                this.f22955b = StaggeredGridLayoutManager.this.f22934t.i() - i10;
            } else {
                this.f22955b = StaggeredGridLayoutManager.this.f22934t.m() + i10;
            }
        }

        public void c() {
            this.f22954a = -1;
            this.f22955b = Integer.MIN_VALUE;
            this.f22956c = false;
            this.f22957d = false;
            this.f22958e = false;
            int[] iArr = this.mSpanReferenceLines;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        public void d(d[] dVarArr) {
            int length = dVarArr.length;
            int[] iArr = this.mSpanReferenceLines;
            if (iArr == null || iArr.length < length) {
                this.mSpanReferenceLines = new int[StaggeredGridLayoutManager.this.mSpans.length];
            }
            for (int i10 = 0; i10 < length; i10++) {
                this.mSpanReferenceLines[i10] = dVarArr[i10].p(Integer.MIN_VALUE);
            }
        }
    }

    public static class c extends RecyclerView.r {

        /* renamed from: e, reason: collision with root package name */
        public d f22960e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f22961f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public final int e() {
            d dVar = this.f22960e;
            if (dVar == null) {
                return -1;
            }
            return dVar.f22966e;
        }

        public boolean f() {
            return this.f22961f;
        }

        public void g(boolean z10) {
            this.f22961f = z10;
        }

        public c(int i10, int i11) {
            super(i10, i11);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public class d {

        /* renamed from: a, reason: collision with root package name */
        public ArrayList f22962a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public int f22963b = Integer.MIN_VALUE;

        /* renamed from: c, reason: collision with root package name */
        public int f22964c = Integer.MIN_VALUE;

        /* renamed from: d, reason: collision with root package name */
        public int f22965d = 0;

        /* renamed from: e, reason: collision with root package name */
        public final int f22966e;

        public d(int i10) {
            this.f22966e = i10;
        }

        public void a(View view) {
            c n10 = n(view);
            n10.f22960e = this;
            this.f22962a.add(view);
            this.f22964c = Integer.MIN_VALUE;
            if (this.f22962a.size() == 1) {
                this.f22963b = Integer.MIN_VALUE;
            }
            if (n10.c() || n10.b()) {
                this.f22965d += StaggeredGridLayoutManager.this.f22934t.e(view);
            }
        }

        public void b(boolean z10, int i10) {
            int l10 = z10 ? l(Integer.MIN_VALUE) : p(Integer.MIN_VALUE);
            e();
            if (l10 == Integer.MIN_VALUE) {
                return;
            }
            if (!z10 || l10 >= StaggeredGridLayoutManager.this.f22934t.i()) {
                if (z10 || l10 <= StaggeredGridLayoutManager.this.f22934t.m()) {
                    if (i10 != Integer.MIN_VALUE) {
                        l10 += i10;
                    }
                    this.f22964c = l10;
                    this.f22963b = l10;
                }
            }
        }

        public void c() {
            LazySpanLookup.FullSpanItem f10;
            ArrayList arrayList = this.f22962a;
            View view = (View) arrayList.get(arrayList.size() - 1);
            c n10 = n(view);
            this.f22964c = StaggeredGridLayoutManager.this.f22934t.d(view);
            if (n10.f22961f && (f10 = StaggeredGridLayoutManager.this.f22922D.f(n10.a())) != null && f10.f22943b == 1) {
                this.f22964c += f10.a(this.f22966e);
            }
        }

        public void d() {
            LazySpanLookup.FullSpanItem f10;
            View view = (View) this.f22962a.get(0);
            c n10 = n(view);
            this.f22963b = StaggeredGridLayoutManager.this.f22934t.g(view);
            if (n10.f22961f && (f10 = StaggeredGridLayoutManager.this.f22922D.f(n10.a())) != null && f10.f22943b == -1) {
                this.f22963b -= f10.a(this.f22966e);
            }
        }

        public void e() {
            this.f22962a.clear();
            q();
            this.f22965d = 0;
        }

        public int f() {
            return StaggeredGridLayoutManager.this.f22939y ? i(this.f22962a.size() - 1, -1, true) : i(0, this.f22962a.size(), true);
        }

        public int g() {
            return StaggeredGridLayoutManager.this.f22939y ? i(0, this.f22962a.size(), true) : i(this.f22962a.size() - 1, -1, true);
        }

        public int h(int i10, int i11, boolean z10, boolean z11, boolean z12) {
            int m10 = StaggeredGridLayoutManager.this.f22934t.m();
            int i12 = StaggeredGridLayoutManager.this.f22934t.i();
            int i13 = i11 > i10 ? 1 : -1;
            while (i10 != i11) {
                View view = (View) this.f22962a.get(i10);
                int g10 = StaggeredGridLayoutManager.this.f22934t.g(view);
                int d10 = StaggeredGridLayoutManager.this.f22934t.d(view);
                boolean z13 = false;
                boolean z14 = !z12 ? g10 >= i12 : g10 > i12;
                if (!z12 ? d10 > m10 : d10 >= m10) {
                    z13 = true;
                }
                if (z14 && z13) {
                    if (z10 && z11) {
                        if (g10 >= m10 && d10 <= i12) {
                            return StaggeredGridLayoutManager.this.s0(view);
                        }
                    } else {
                        if (z11) {
                            return StaggeredGridLayoutManager.this.s0(view);
                        }
                        if (g10 < m10 || d10 > i12) {
                            return StaggeredGridLayoutManager.this.s0(view);
                        }
                    }
                }
                i10 += i13;
            }
            return -1;
        }

        public int i(int i10, int i11, boolean z10) {
            return h(i10, i11, false, false, z10);
        }

        public int j() {
            return this.f22965d;
        }

        public int k() {
            int i10 = this.f22964c;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            c();
            return this.f22964c;
        }

        public int l(int i10) {
            int i11 = this.f22964c;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f22962a.size() == 0) {
                return i10;
            }
            c();
            return this.f22964c;
        }

        public View m(int i10, int i11) {
            View view = null;
            if (i11 != -1) {
                int size = this.f22962a.size() - 1;
                while (size >= 0) {
                    View view2 = (View) this.f22962a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f22939y && staggeredGridLayoutManager.s0(view2) >= i10) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f22939y && staggeredGridLayoutManager2.s0(view2) <= i10) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
                return view;
            }
            int size2 = this.f22962a.size();
            int i12 = 0;
            while (i12 < size2) {
                View view3 = (View) this.f22962a.get(i12);
                StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                if (staggeredGridLayoutManager3.f22939y && staggeredGridLayoutManager3.s0(view3) <= i10) {
                    break;
                }
                StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                if ((!staggeredGridLayoutManager4.f22939y && staggeredGridLayoutManager4.s0(view3) >= i10) || !view3.hasFocusable()) {
                    break;
                }
                i12++;
                view = view3;
            }
            return view;
        }

        public c n(View view) {
            return (c) view.getLayoutParams();
        }

        public int o() {
            int i10 = this.f22963b;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            d();
            return this.f22963b;
        }

        public int p(int i10) {
            int i11 = this.f22963b;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f22962a.size() == 0) {
                return i10;
            }
            d();
            return this.f22963b;
        }

        public void q() {
            this.f22963b = Integer.MIN_VALUE;
            this.f22964c = Integer.MIN_VALUE;
        }

        public void r(int i10) {
            int i11 = this.f22963b;
            if (i11 != Integer.MIN_VALUE) {
                this.f22963b = i11 + i10;
            }
            int i12 = this.f22964c;
            if (i12 != Integer.MIN_VALUE) {
                this.f22964c = i12 + i10;
            }
        }

        public void s() {
            int size = this.f22962a.size();
            View view = (View) this.f22962a.remove(size - 1);
            c n10 = n(view);
            n10.f22960e = null;
            if (n10.c() || n10.b()) {
                this.f22965d -= StaggeredGridLayoutManager.this.f22934t.e(view);
            }
            if (size == 1) {
                this.f22963b = Integer.MIN_VALUE;
            }
            this.f22964c = Integer.MIN_VALUE;
        }

        public void t() {
            View view = (View) this.f22962a.remove(0);
            c n10 = n(view);
            n10.f22960e = null;
            if (this.f22962a.size() == 0) {
                this.f22964c = Integer.MIN_VALUE;
            }
            if (n10.c() || n10.b()) {
                this.f22965d -= StaggeredGridLayoutManager.this.f22934t.e(view);
            }
            this.f22963b = Integer.MIN_VALUE;
        }

        public void u(View view) {
            c n10 = n(view);
            n10.f22960e = this;
            this.f22962a.add(0, view);
            this.f22963b = Integer.MIN_VALUE;
            if (this.f22962a.size() == 1) {
                this.f22964c = Integer.MIN_VALUE;
            }
            if (n10.c() || n10.b()) {
                this.f22965d += StaggeredGridLayoutManager.this.f22934t.e(view);
            }
        }

        public void v(int i10) {
            this.f22963b = i10;
            this.f22964c = i10;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        RecyclerView.q.d t02 = RecyclerView.q.t0(context, attributeSet, i10, i11);
        X2(t02.f22895a);
        Z2(t02.f22896b);
        Y2(t02.f22897c);
        this.f22938x = new n();
        o2();
    }

    private void K2(View view, int i10, int i11, boolean z10) {
        z(view, this.f22928J);
        c cVar = (c) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        Rect rect = this.f22928J;
        int h32 = h3(i10, i12 + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int i13 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        Rect rect2 = this.f22928J;
        int h33 = h3(i11, i13 + rect2.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect2.bottom);
        if (z10 ? V1(view, h32, h33, cVar) : T1(view, h32, h33, cVar)) {
            view.measure(h32, h33);
        }
    }

    private void U2() {
        if (this.f22936v == 1 || !J2()) {
            this.f22940z = this.f22939y;
        } else {
            this.f22940z = !this.f22939y;
        }
    }

    private int i2(RecyclerView.B b10) {
        if (Z() == 0) {
            return 0;
        }
        return v.a(b10, this.f22934t, s2(!this.f22931O), r2(!this.f22931O), this, this.f22931O);
    }

    private int j2(RecyclerView.B b10) {
        if (Z() == 0) {
            return 0;
        }
        return v.b(b10, this.f22934t, s2(!this.f22931O), r2(!this.f22931O), this, this.f22931O, this.f22940z);
    }

    private int k2(RecyclerView.B b10) {
        if (Z() == 0) {
            return 0;
        }
        return v.c(b10, this.f22934t, s2(!this.f22931O), r2(!this.f22931O), this, this.f22931O);
    }

    private int l2(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 17 ? i10 != 33 ? i10 != 66 ? (i10 == 130 && this.f22936v == 1) ? 1 : Integer.MIN_VALUE : this.f22936v == 0 ? 1 : Integer.MIN_VALUE : this.f22936v == 1 ? -1 : Integer.MIN_VALUE : this.f22936v == 0 ? -1 : Integer.MIN_VALUE : (this.f22936v != 1 && J2()) ? -1 : 1 : (this.f22936v != 1 && J2()) ? 1 : -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean A() {
        return this.f22936v == 0;
    }

    public final int A2(int i10) {
        int p10 = this.mSpans[0].p(i10);
        for (int i11 = 1; i11 < this.f22933s; i11++) {
            int p11 = this.mSpans[i11].p(i10);
            if (p11 > p10) {
                p10 = p11;
            }
        }
        return p10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean B() {
        return this.f22936v == 1;
    }

    public final int B2(int i10) {
        int l10 = this.mSpans[0].l(i10);
        for (int i11 = 1; i11 < this.f22933s; i11++) {
            int l11 = this.mSpans[i11].l(i10);
            if (l11 < l10) {
                l10 = l11;
            }
        }
        return l10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean C(RecyclerView.r rVar) {
        return rVar instanceof c;
    }

    public final int C2(int i10) {
        int p10 = this.mSpans[0].p(i10);
        for (int i11 = 1; i11 < this.f22933s; i11++) {
            int p11 = this.mSpans[i11].p(i10);
            if (p11 < p10) {
                p10 = p11;
            }
        }
        return p10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean D0() {
        return this.f22923E != 0;
    }

    public final d D2(n nVar) {
        int i10;
        int i11;
        int i12;
        if (N2(nVar.f23196e)) {
            i11 = this.f22933s - 1;
            i10 = -1;
            i12 = -1;
        } else {
            i10 = this.f22933s;
            i11 = 0;
            i12 = 1;
        }
        d dVar = null;
        if (nVar.f23196e == 1) {
            int m10 = this.f22934t.m();
            int i13 = Integer.MAX_VALUE;
            while (i11 != i10) {
                d dVar2 = this.mSpans[i11];
                int l10 = dVar2.l(m10);
                if (l10 < i13) {
                    dVar = dVar2;
                    i13 = l10;
                }
                i11 += i12;
            }
            return dVar;
        }
        int i14 = this.f22934t.i();
        int i15 = Integer.MIN_VALUE;
        while (i11 != i10) {
            d dVar3 = this.mSpans[i11];
            int p10 = dVar3.p(i14);
            if (p10 > i15) {
                dVar = dVar3;
                i15 = p10;
            }
            i11 += i12;
        }
        return dVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void E(int i10, int i11, RecyclerView.B b10, RecyclerView.q.c cVar) {
        int l10;
        int i12;
        if (this.f22936v != 0) {
            i10 = i11;
        }
        if (Z() == 0 || i10 == 0) {
            return;
        }
        O2(i10, b10);
        int[] iArr = this.mPrefetchDistances;
        if (iArr == null || iArr.length < this.f22933s) {
            this.mPrefetchDistances = new int[this.f22933s];
        }
        int i13 = 0;
        for (int i14 = 0; i14 < this.f22933s; i14++) {
            n nVar = this.f22938x;
            if (nVar.f23195d == -1) {
                l10 = nVar.f23197f;
                i12 = this.mSpans[i14].p(l10);
            } else {
                l10 = this.mSpans[i14].l(nVar.f23198g);
                i12 = this.f22938x.f23198g;
            }
            int i15 = l10 - i12;
            if (i15 >= 0) {
                this.mPrefetchDistances[i13] = i15;
                i13++;
            }
        }
        Arrays.sort(this.mPrefetchDistances, 0, i13);
        for (int i16 = 0; i16 < i13 && this.f22938x.a(b10); i16++) {
            cVar.a(this.f22938x.f23194c, this.mPrefetchDistances[i16]);
            n nVar2 = this.f22938x;
            nVar2.f23194c += nVar2.f23195d;
        }
    }

    public int E2() {
        return this.f22936v;
    }

    public int F2() {
        return this.f22933s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int G(RecyclerView.B b10) {
        return i2(b10);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G2(int i10, int i11, int i12) {
        int i13;
        int i14;
        int y22 = this.f22940z ? y2() : x2();
        if (i12 != 8) {
            i13 = i10 + i11;
        } else {
            if (i10 >= i11) {
                i13 = i10 + 1;
                i14 = i11;
                this.f22922D.h(i14);
                if (i12 != 1) {
                    this.f22922D.j(i10, i11);
                } else if (i12 == 2) {
                    this.f22922D.k(i10, i11);
                } else if (i12 == 8) {
                    this.f22922D.k(i10, 1);
                    this.f22922D.j(i11, 1);
                }
                if (i13 > y22) {
                    return;
                }
                if (i14 <= (this.f22940z ? x2() : y2())) {
                    H1();
                    return;
                }
                return;
            }
            i13 = i11 + 1;
        }
        i14 = i10;
        this.f22922D.h(i14);
        if (i12 != 1) {
        }
        if (i13 > y22) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int H(RecyclerView.B b10) {
        return j2(b10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean H0() {
        return this.f22939y;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View H2() {
        int i10;
        int Z10 = Z();
        int i11 = Z10 - 1;
        BitSet bitSet = new BitSet(this.f22933s);
        bitSet.set(0, this.f22933s, true);
        char c10 = (this.f22936v == 1 && J2()) ? (char) 1 : (char) 65535;
        if (this.f22940z) {
            Z10 = -1;
        } else {
            i11 = 0;
        }
        int i12 = i11 < Z10 ? 1 : -1;
        while (i11 != Z10) {
            View Y10 = Y(i11);
            c cVar = (c) Y10.getLayoutParams();
            if (bitSet.get(cVar.f22960e.f22966e)) {
                if (h2(cVar.f22960e)) {
                    return Y10;
                }
                bitSet.clear(cVar.f22960e.f22966e);
            }
            if (!cVar.f22961f && (i10 = i11 + i12) != Z10) {
                View Y11 = Y(i10);
                if (this.f22940z) {
                    int d10 = this.f22934t.d(Y10);
                    int d11 = this.f22934t.d(Y11);
                    if (d10 >= d11) {
                        if (d10 != d11) {
                            continue;
                        }
                        if ((cVar.f22960e.f22966e - ((c) Y11.getLayoutParams()).f22960e.f22966e >= 0) == (c10 >= 0)) {
                        }
                    }
                } else {
                    int g10 = this.f22934t.g(Y10);
                    int g11 = this.f22934t.g(Y11);
                    if (g10 <= g11) {
                        if (g10 != g11) {
                            continue;
                        }
                        if ((cVar.f22960e.f22966e - ((c) Y11.getLayoutParams()).f22960e.f22966e >= 0) == (c10 >= 0)) {
                        }
                    }
                }
                return Y10;
            }
            i11 += i12;
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int I(RecyclerView.B b10) {
        return k2(b10);
    }

    public void I2() {
        this.f22922D.b();
        H1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int J(RecyclerView.B b10) {
        return i2(b10);
    }

    public boolean J2() {
        return o0() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int K(RecyclerView.B b10) {
        return j2(b10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int K1(int i10, RecyclerView.x xVar, RecyclerView.B b10) {
        return V2(i10, xVar, b10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int L(RecyclerView.B b10) {
        return k2(b10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void L1(int i10) {
        SavedState savedState = this.f22926H;
        if (savedState != null && savedState.f22945a != i10) {
            savedState.a();
        }
        this.f22920B = i10;
        this.f22921C = Integer.MIN_VALUE;
        H1();
    }

    public final void L2(View view, c cVar, boolean z10) {
        if (cVar.f22961f) {
            if (this.f22936v == 1) {
                K2(view, this.f22927I, RecyclerView.q.a0(m0(), n0(), getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z10);
                return;
            } else {
                K2(view, RecyclerView.q.a0(z0(), A0(), getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) cVar).width, true), this.f22927I, z10);
                return;
            }
        }
        if (this.f22936v == 1) {
            K2(view, RecyclerView.q.a0(this.f22937w, A0(), 0, ((ViewGroup.MarginLayoutParams) cVar).width, false), RecyclerView.q.a0(m0(), n0(), getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z10);
        } else {
            K2(view, RecyclerView.q.a0(z0(), A0(), getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) cVar).width, true), RecyclerView.q.a0(this.f22937w, n0(), 0, ((ViewGroup.MarginLayoutParams) cVar).height, false), z10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int M1(int i10, RecyclerView.x xVar, RecyclerView.B b10) {
        return V2(i10, xVar, b10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0152, code lost:
    
        if (g2() != false) goto L87;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M2(RecyclerView.x xVar, RecyclerView.B b10, boolean z10) {
        SavedState savedState;
        b bVar = this.f22929K;
        if (!(this.f22926H == null && this.f22920B == -1) && b10.b() == 0) {
            y1(xVar);
            bVar.c();
            return;
        }
        boolean z11 = true;
        boolean z12 = (bVar.f22958e && this.f22920B == -1 && this.f22926H == null) ? false : true;
        if (z12) {
            bVar.c();
            if (this.f22926H != null) {
                b2(bVar);
            } else {
                U2();
                bVar.f22956c = this.f22940z;
            }
            d3(b10, bVar);
            bVar.f22958e = true;
        }
        if (this.f22926H == null && this.f22920B == -1 && (bVar.f22956c != this.f22924F || J2() != this.f22925G)) {
            this.f22922D.b();
            bVar.f22957d = true;
        }
        if (Z() > 0 && ((savedState = this.f22926H) == null || savedState.f22947c < 1)) {
            if (bVar.f22957d) {
                for (int i10 = 0; i10 < this.f22933s; i10++) {
                    this.mSpans[i10].e();
                    int i11 = bVar.f22955b;
                    if (i11 != Integer.MIN_VALUE) {
                        this.mSpans[i10].v(i11);
                    }
                }
            } else if (z12 || this.f22929K.mSpanReferenceLines == null) {
                for (int i12 = 0; i12 < this.f22933s; i12++) {
                    this.mSpans[i12].b(this.f22940z, bVar.f22955b);
                }
                this.f22929K.d(this.mSpans);
            } else {
                for (int i13 = 0; i13 < this.f22933s; i13++) {
                    d dVar = this.mSpans[i13];
                    dVar.e();
                    dVar.v(this.f22929K.mSpanReferenceLines[i13]);
                }
            }
        }
        M(xVar);
        this.f22938x.f23192a = false;
        this.f22930L = false;
        f3(this.f22935u.n());
        e3(bVar.f22954a, b10);
        if (bVar.f22956c) {
            W2(-1);
            p2(xVar, this.f22938x, b10);
            W2(1);
            n nVar = this.f22938x;
            nVar.f23194c = bVar.f22954a + nVar.f23195d;
            p2(xVar, nVar, b10);
        } else {
            W2(1);
            p2(xVar, this.f22938x, b10);
            W2(-1);
            n nVar2 = this.f22938x;
            nVar2.f23194c = bVar.f22954a + nVar2.f23195d;
            p2(xVar, nVar2, b10);
        }
        T2();
        if (Z() > 0) {
            if (this.f22940z) {
                v2(xVar, b10, true);
                w2(xVar, b10, false);
            } else {
                w2(xVar, b10, true);
                v2(xVar, b10, false);
            }
        }
        if (z10 && !b10.e() && this.f22923E != 0 && Z() > 0 && (this.f22930L || H2() != null)) {
            C1(this.f22932P);
        }
        z11 = false;
        if (b10.e()) {
            this.f22929K.c();
        }
        this.f22924F = bVar.f22956c;
        this.f22925G = J2();
        if (z11) {
            this.f22929K.c();
            M2(xVar, b10, false);
        }
    }

    public final boolean N2(int i10) {
        if (this.f22936v == 0) {
            return (i10 == -1) != this.f22940z;
        }
        return ((i10 == -1) == this.f22940z) == J2();
    }

    public void O2(int i10, RecyclerView.B b10) {
        int x22;
        int i11;
        if (i10 > 0) {
            x22 = y2();
            i11 = 1;
        } else {
            x22 = x2();
            i11 = -1;
        }
        this.f22938x.f23192a = true;
        e3(x22, b10);
        W2(i11);
        n nVar = this.f22938x;
        nVar.f23194c = x22 + nVar.f23195d;
        nVar.f23193b = Math.abs(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void P0(int i10) {
        super.P0(i10);
        for (int i11 = 0; i11 < this.f22933s; i11++) {
            this.mSpans[i11].r(i10);
        }
    }

    public final void P2(View view) {
        for (int i10 = this.f22933s - 1; i10 >= 0; i10--) {
            this.mSpans[i10].u(view);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void Q0(int i10) {
        super.Q0(i10);
        for (int i11 = 0; i11 < this.f22933s; i11++) {
            this.mSpans[i11].r(i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void Q1(Rect rect, int i10, int i11) {
        int D10;
        int D11;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.f22936v == 1) {
            D11 = RecyclerView.q.D(i11, rect.height() + paddingTop, q0());
            D10 = RecyclerView.q.D(i10, (this.f22937w * this.f22933s) + paddingLeft, r0());
        } else {
            D10 = RecyclerView.q.D(i10, rect.width() + paddingLeft, r0());
            D11 = RecyclerView.q.D(i11, (this.f22937w * this.f22933s) + paddingTop, q0());
        }
        P1(D10, D11);
    }

    public final void Q2(RecyclerView.x xVar, n nVar) {
        if (!nVar.f23192a || nVar.f23200i) {
            return;
        }
        if (nVar.f23193b == 0) {
            if (nVar.f23196e == -1) {
                R2(xVar, nVar.f23198g);
                return;
            } else {
                S2(xVar, nVar.f23197f);
                return;
            }
        }
        if (nVar.f23196e != -1) {
            int B22 = B2(nVar.f23198g) - nVar.f23198g;
            S2(xVar, B22 < 0 ? nVar.f23197f : Math.min(B22, nVar.f23193b) + nVar.f23197f);
        } else {
            int i10 = nVar.f23197f;
            int A22 = i10 - A2(i10);
            R2(xVar, A22 < 0 ? nVar.f23198g : nVar.f23198g - Math.min(A22, nVar.f23193b));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void R0(RecyclerView.h hVar, RecyclerView.h hVar2) {
        this.f22922D.b();
        for (int i10 = 0; i10 < this.f22933s; i10++) {
            this.mSpans[i10].e();
        }
    }

    public final void R2(RecyclerView.x xVar, int i10) {
        for (int Z10 = Z() - 1; Z10 >= 0; Z10--) {
            View Y10 = Y(Z10);
            if (this.f22934t.g(Y10) < i10 || this.f22934t.q(Y10) < i10) {
                return;
            }
            c cVar = (c) Y10.getLayoutParams();
            if (cVar.f22961f) {
                for (int i11 = 0; i11 < this.f22933s; i11++) {
                    if (this.mSpans[i11].f22962a.size() == 1) {
                        return;
                    }
                }
                for (int i12 = 0; i12 < this.f22933s; i12++) {
                    this.mSpans[i12].s();
                }
            } else if (cVar.f22960e.f22962a.size() == 1) {
                return;
            } else {
                cVar.f22960e.s();
            }
            A1(Y10, xVar);
        }
    }

    public final void S2(RecyclerView.x xVar, int i10) {
        while (Z() > 0) {
            View Y10 = Y(0);
            if (this.f22934t.d(Y10) > i10 || this.f22934t.p(Y10) > i10) {
                return;
            }
            c cVar = (c) Y10.getLayoutParams();
            if (cVar.f22961f) {
                for (int i11 = 0; i11 < this.f22933s; i11++) {
                    if (this.mSpans[i11].f22962a.size() == 1) {
                        return;
                    }
                }
                for (int i12 = 0; i12 < this.f22933s; i12++) {
                    this.mSpans[i12].t();
                }
            } else if (cVar.f22960e.f22962a.size() == 1) {
                return;
            } else {
                cVar.f22960e.t();
            }
            A1(Y10, xVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public RecyclerView.r T() {
        return this.f22936v == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    public final void T2() {
        if (this.f22935u.k() == 1073741824) {
            return;
        }
        int Z10 = Z();
        float f10 = 0.0f;
        for (int i10 = 0; i10 < Z10; i10++) {
            View Y10 = Y(i10);
            float e10 = this.f22935u.e(Y10);
            if (e10 >= f10) {
                if (((c) Y10.getLayoutParams()).f()) {
                    e10 = (e10 * 1.0f) / this.f22933s;
                }
                f10 = Math.max(f10, e10);
            }
        }
        int i11 = this.f22937w;
        int round = Math.round(f10 * this.f22933s);
        if (this.f22935u.k() == Integer.MIN_VALUE) {
            round = Math.min(round, this.f22935u.n());
        }
        f3(round);
        if (this.f22937w == i11) {
            return;
        }
        for (int i12 = 0; i12 < Z10; i12++) {
            View Y11 = Y(i12);
            c cVar = (c) Y11.getLayoutParams();
            if (!cVar.f22961f) {
                if (J2() && this.f22936v == 1) {
                    int i13 = this.f22933s;
                    int i14 = cVar.f22960e.f22966e;
                    Y11.offsetLeftAndRight(((-((i13 - 1) - i14)) * this.f22937w) - ((-((i13 - 1) - i14)) * i11));
                } else {
                    int i15 = cVar.f22960e.f22966e;
                    int i16 = this.f22937w * i15;
                    int i17 = i15 * i11;
                    if (this.f22936v == 1) {
                        Y11.offsetLeftAndRight(i16 - i17);
                    } else {
                        Y11.offsetTopAndBottom(i16 - i17);
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public RecyclerView.r U(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public RecyclerView.r V(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void V0(RecyclerView recyclerView, RecyclerView.x xVar) {
        super.V0(recyclerView, xVar);
        C1(this.f22932P);
        for (int i10 = 0; i10 < this.f22933s; i10++) {
            this.mSpans[i10].e();
        }
        recyclerView.requestLayout();
    }

    public int V2(int i10, RecyclerView.x xVar, RecyclerView.B b10) {
        if (Z() == 0 || i10 == 0) {
            return 0;
        }
        O2(i10, b10);
        int p22 = p2(xVar, this.f22938x, b10);
        if (this.f22938x.f23193b >= p22) {
            i10 = i10 < 0 ? -p22 : p22;
        }
        this.f22934t.r(-i10);
        this.f22924F = this.f22940z;
        n nVar = this.f22938x;
        nVar.f23193b = 0;
        Q2(xVar, nVar);
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public View W0(View view, int i10, RecyclerView.x xVar, RecyclerView.B b10) {
        View R10;
        View m10;
        if (Z() == 0 || (R10 = R(view)) == null) {
            return null;
        }
        U2();
        int l22 = l2(i10);
        if (l22 == Integer.MIN_VALUE) {
            return null;
        }
        c cVar = (c) R10.getLayoutParams();
        boolean z10 = cVar.f22961f;
        d dVar = cVar.f22960e;
        int y22 = l22 == 1 ? y2() : x2();
        e3(y22, b10);
        W2(l22);
        n nVar = this.f22938x;
        nVar.f23194c = nVar.f23195d + y22;
        nVar.f23193b = (int) (this.f22934t.n() * 0.33333334f);
        n nVar2 = this.f22938x;
        nVar2.f23199h = true;
        nVar2.f23192a = false;
        p2(xVar, nVar2, b10);
        this.f22924F = this.f22940z;
        if (!z10 && (m10 = dVar.m(y22, l22)) != null && m10 != R10) {
            return m10;
        }
        if (N2(l22)) {
            for (int i11 = this.f22933s - 1; i11 >= 0; i11--) {
                View m11 = this.mSpans[i11].m(y22, l22);
                if (m11 != null && m11 != R10) {
                    return m11;
                }
            }
        } else {
            for (int i12 = 0; i12 < this.f22933s; i12++) {
                View m12 = this.mSpans[i12].m(y22, l22);
                if (m12 != null && m12 != R10) {
                    return m12;
                }
            }
        }
        boolean z11 = (this.f22939y ^ true) == (l22 == -1);
        if (!z10) {
            View S10 = S(z11 ? dVar.f() : dVar.g());
            if (S10 != null && S10 != R10) {
                return S10;
            }
        }
        if (N2(l22)) {
            for (int i13 = this.f22933s - 1; i13 >= 0; i13--) {
                if (i13 != dVar.f22966e) {
                    View S11 = S(z11 ? this.mSpans[i13].f() : this.mSpans[i13].g());
                    if (S11 != null && S11 != R10) {
                        return S11;
                    }
                }
            }
        } else {
            for (int i14 = 0; i14 < this.f22933s; i14++) {
                View S12 = S(z11 ? this.mSpans[i14].f() : this.mSpans[i14].g());
                if (S12 != null && S12 != R10) {
                    return S12;
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void W1(RecyclerView recyclerView, RecyclerView.B b10, int i10) {
        o oVar = new o(recyclerView.getContext());
        oVar.p(i10);
        X1(oVar);
    }

    public final void W2(int i10) {
        n nVar = this.f22938x;
        nVar.f23196e = i10;
        nVar.f23195d = this.f22940z != (i10 == -1) ? -1 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void X0(AccessibilityEvent accessibilityEvent) {
        super.X0(accessibilityEvent);
        if (Z() > 0) {
            View s22 = s2(false);
            View r22 = r2(false);
            if (s22 == null || r22 == null) {
                return;
            }
            int s02 = s0(s22);
            int s03 = s0(r22);
            if (s02 < s03) {
                accessibilityEvent.setFromIndex(s02);
                accessibilityEvent.setToIndex(s03);
            } else {
                accessibilityEvent.setFromIndex(s03);
                accessibilityEvent.setToIndex(s02);
            }
        }
    }

    public void X2(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        w(null);
        if (i10 == this.f22936v) {
            return;
        }
        this.f22936v = i10;
        s sVar = this.f22934t;
        this.f22934t = this.f22935u;
        this.f22935u = sVar;
        H1();
    }

    public void Y2(boolean z10) {
        w(null);
        SavedState savedState = this.f22926H;
        if (savedState != null && savedState.f22950f != z10) {
            savedState.f22950f = z10;
        }
        this.f22939y = z10;
        H1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void Z0(RecyclerView.x xVar, RecyclerView.B b10, y0.z zVar) {
        super.Z0(xVar, b10, zVar);
        zVar.w0("androidx.recyclerview.widget.StaggeredGridLayoutManager");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean Z1() {
        return this.f22926H == null;
    }

    public void Z2(int i10) {
        w(null);
        if (i10 != this.f22933s) {
            I2();
            this.f22933s = i10;
            this.f22919A = new BitSet(this.f22933s);
            this.mSpans = new d[this.f22933s];
            for (int i11 = 0; i11 < this.f22933s; i11++) {
                this.mSpans[i11] = new d(i11);
            }
            H1();
        }
    }

    public final void a2(View view) {
        for (int i10 = this.f22933s - 1; i10 >= 0; i10--) {
            this.mSpans[i10].a(view);
        }
    }

    public final void a3(int i10, int i11) {
        for (int i12 = 0; i12 < this.f22933s; i12++) {
            if (!this.mSpans[i12].f22962a.isEmpty()) {
                g3(this.mSpans[i12], i10, i11);
            }
        }
    }

    public final void b2(b bVar) {
        SavedState savedState = this.f22926H;
        int i10 = savedState.f22947c;
        if (i10 > 0) {
            if (i10 == this.f22933s) {
                for (int i11 = 0; i11 < this.f22933s; i11++) {
                    this.mSpans[i11].e();
                    SavedState savedState2 = this.f22926H;
                    int i12 = savedState2.mSpanOffsets[i11];
                    if (i12 != Integer.MIN_VALUE) {
                        i12 += savedState2.f22951g ? this.f22934t.i() : this.f22934t.m();
                    }
                    this.mSpans[i11].v(i12);
                }
            } else {
                savedState.b();
                SavedState savedState3 = this.f22926H;
                savedState3.f22945a = savedState3.f22946b;
            }
        }
        SavedState savedState4 = this.f22926H;
        this.f22925G = savedState4.f22952h;
        Y2(savedState4.f22950f);
        U2();
        SavedState savedState5 = this.f22926H;
        int i13 = savedState5.f22945a;
        if (i13 != -1) {
            this.f22920B = i13;
            bVar.f22956c = savedState5.f22951g;
        } else {
            bVar.f22956c = this.f22940z;
        }
        if (savedState5.f22948d > 1) {
            LazySpanLookup lazySpanLookup = this.f22922D;
            lazySpanLookup.mData = savedState5.mSpanLookup;
            lazySpanLookup.f22941a = savedState5.f22949e;
        }
    }

    public final boolean b3(RecyclerView.B b10, b bVar) {
        bVar.f22954a = this.f22924F ? u2(b10.b()) : q2(b10.b());
        bVar.f22955b = Integer.MIN_VALUE;
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.A.b
    public PointF c(int i10) {
        int f22 = f2(i10);
        PointF pointF = new PointF();
        if (f22 == 0) {
            return null;
        }
        if (this.f22936v == 0) {
            pointF.x = f22;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = f22;
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void c1(RecyclerView.x xVar, RecyclerView.B b10, View view, y0.z zVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof c)) {
            super.b1(view, zVar);
            return;
        }
        c cVar = (c) layoutParams;
        if (this.f22936v == 0) {
            zVar.z0(z.g.b(cVar.e(), cVar.f22961f ? this.f22933s : 1, -1, -1, false, false));
        } else {
            zVar.z0(z.g.b(-1, -1, cVar.e(), cVar.f22961f ? this.f22933s : 1, false, false));
        }
    }

    public boolean c2() {
        int l10 = this.mSpans[0].l(Integer.MIN_VALUE);
        for (int i10 = 1; i10 < this.f22933s; i10++) {
            if (this.mSpans[i10].l(Integer.MIN_VALUE) != l10) {
                return false;
            }
        }
        return true;
    }

    public boolean c3(RecyclerView.B b10, b bVar) {
        int i10;
        if (!b10.e() && (i10 = this.f22920B) != -1) {
            if (i10 >= 0 && i10 < b10.b()) {
                SavedState savedState = this.f22926H;
                if (savedState == null || savedState.f22945a == -1 || savedState.f22947c < 1) {
                    View S10 = S(this.f22920B);
                    if (S10 != null) {
                        bVar.f22954a = this.f22940z ? y2() : x2();
                        if (this.f22921C != Integer.MIN_VALUE) {
                            if (bVar.f22956c) {
                                bVar.f22955b = (this.f22934t.i() - this.f22921C) - this.f22934t.d(S10);
                            } else {
                                bVar.f22955b = (this.f22934t.m() + this.f22921C) - this.f22934t.g(S10);
                            }
                            return true;
                        }
                        if (this.f22934t.e(S10) > this.f22934t.n()) {
                            bVar.f22955b = bVar.f22956c ? this.f22934t.i() : this.f22934t.m();
                            return true;
                        }
                        int g10 = this.f22934t.g(S10) - this.f22934t.m();
                        if (g10 < 0) {
                            bVar.f22955b = -g10;
                            return true;
                        }
                        int i11 = this.f22934t.i() - this.f22934t.d(S10);
                        if (i11 < 0) {
                            bVar.f22955b = i11;
                            return true;
                        }
                        bVar.f22955b = Integer.MIN_VALUE;
                    } else {
                        int i12 = this.f22920B;
                        bVar.f22954a = i12;
                        int i13 = this.f22921C;
                        if (i13 == Integer.MIN_VALUE) {
                            bVar.f22956c = f2(i12) == 1;
                            bVar.a();
                        } else {
                            bVar.b(i13);
                        }
                        bVar.f22957d = true;
                    }
                } else {
                    bVar.f22955b = Integer.MIN_VALUE;
                    bVar.f22954a = this.f22920B;
                }
                return true;
            }
            this.f22920B = -1;
            this.f22921C = Integer.MIN_VALUE;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int d0(RecyclerView.x xVar, RecyclerView.B b10) {
        if (this.f22936v == 1) {
            return Math.min(this.f22933s, b10.b());
        }
        return -1;
    }

    public boolean d2() {
        int p10 = this.mSpans[0].p(Integer.MIN_VALUE);
        for (int i10 = 1; i10 < this.f22933s; i10++) {
            if (this.mSpans[i10].p(Integer.MIN_VALUE) != p10) {
                return false;
            }
        }
        return true;
    }

    public void d3(RecyclerView.B b10, b bVar) {
        if (c3(b10, bVar) || b3(b10, bVar)) {
            return;
        }
        bVar.a();
        bVar.f22954a = 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void e1(RecyclerView recyclerView, int i10, int i11) {
        G2(i10, i11, 1);
    }

    public final void e2(View view, c cVar, n nVar) {
        if (nVar.f23196e == 1) {
            if (cVar.f22961f) {
                a2(view);
                return;
            } else {
                cVar.f22960e.a(view);
                return;
            }
        }
        if (cVar.f22961f) {
            P2(view);
        } else {
            cVar.f22960e.u(view);
        }
    }

    public final void e3(int i10, RecyclerView.B b10) {
        int i11;
        int i12;
        int c10;
        n nVar = this.f22938x;
        boolean z10 = false;
        nVar.f23193b = 0;
        nVar.f23194c = i10;
        if (!K0() || (c10 = b10.c()) == -1) {
            i11 = 0;
            i12 = 0;
        } else {
            if (this.f22940z == (c10 < i10)) {
                i11 = this.f22934t.n();
                i12 = 0;
            } else {
                i12 = this.f22934t.n();
                i11 = 0;
            }
        }
        if (c0()) {
            this.f22938x.f23197f = this.f22934t.m() - i12;
            this.f22938x.f23198g = this.f22934t.i() + i11;
        } else {
            this.f22938x.f23198g = this.f22934t.h() + i11;
            this.f22938x.f23197f = -i12;
        }
        n nVar2 = this.f22938x;
        nVar2.f23199h = false;
        nVar2.f23192a = true;
        if (this.f22934t.k() == 0 && this.f22934t.h() == 0) {
            z10 = true;
        }
        nVar2.f23200i = z10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void f1(RecyclerView recyclerView) {
        this.f22922D.b();
        H1();
    }

    public final int f2(int i10) {
        if (Z() == 0) {
            return this.f22940z ? 1 : -1;
        }
        return (i10 < x2()) != this.f22940z ? -1 : 1;
    }

    public void f3(int i10) {
        this.f22937w = i10 / this.f22933s;
        this.f22927I = View.MeasureSpec.makeMeasureSpec(i10, this.f22935u.k());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void g1(RecyclerView recyclerView, int i10, int i11, int i12) {
        G2(i10, i11, 8);
    }

    public boolean g2() {
        int x22;
        int y22;
        if (Z() == 0 || this.f22923E == 0 || !C0()) {
            return false;
        }
        if (this.f22940z) {
            x22 = y2();
            y22 = x2();
        } else {
            x22 = x2();
            y22 = y2();
        }
        if (x22 == 0 && H2() != null) {
            this.f22922D.b();
            I1();
            H1();
            return true;
        }
        if (!this.f22930L) {
            return false;
        }
        int i10 = this.f22940z ? -1 : 1;
        int i11 = y22 + 1;
        LazySpanLookup.FullSpanItem e10 = this.f22922D.e(x22, i11, i10, true);
        if (e10 == null) {
            this.f22930L = false;
            this.f22922D.d(i11);
            return false;
        }
        LazySpanLookup.FullSpanItem e11 = this.f22922D.e(x22, e10.f22942a, i10 * (-1), true);
        if (e11 == null) {
            this.f22922D.d(e10.f22942a);
        } else {
            this.f22922D.d(e11.f22942a + 1);
        }
        I1();
        H1();
        return true;
    }

    public final void g3(d dVar, int i10, int i11) {
        int j10 = dVar.j();
        if (i10 == -1) {
            if (dVar.o() + j10 <= i11) {
                this.f22919A.set(dVar.f22966e, false);
            }
        } else if (dVar.k() - j10 >= i11) {
            this.f22919A.set(dVar.f22966e, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void h1(RecyclerView recyclerView, int i10, int i11) {
        G2(i10, i11, 2);
    }

    public final boolean h2(d dVar) {
        boolean z10;
        if (!this.f22940z) {
            if (dVar.o() > this.f22934t.m()) {
                z10 = dVar.n((View) dVar.f22962a.get(0)).f22961f;
                return !z10;
            }
            return false;
        }
        if (dVar.k() < this.f22934t.i()) {
            z10 = dVar.n((View) dVar.f22962a.get(r0.size() - 1)).f22961f;
            return !z10;
        }
        return false;
    }

    public final int h3(int i10, int i11, int i12) {
        int mode;
        return (!(i11 == 0 && i12 == 0) && ((mode = View.MeasureSpec.getMode(i10)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - i11) - i12), mode) : i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void j1(RecyclerView recyclerView, int i10, int i11, Object obj) {
        G2(i10, i11, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void k1(RecyclerView.x xVar, RecyclerView.B b10) {
        M2(xVar, b10, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void l1(RecyclerView.B b10) {
        super.l1(b10);
        this.f22920B = -1;
        this.f22921C = Integer.MIN_VALUE;
        this.f22926H = null;
        this.f22929K.c();
    }

    public final LazySpanLookup.FullSpanItem m2(int i10) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.mGapPerSpan = new int[this.f22933s];
        for (int i11 = 0; i11 < this.f22933s; i11++) {
            fullSpanItem.mGapPerSpan[i11] = i10 - this.mSpans[i11].l(i10);
        }
        return fullSpanItem;
    }

    public final LazySpanLookup.FullSpanItem n2(int i10) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.mGapPerSpan = new int[this.f22933s];
        for (int i11 = 0; i11 < this.f22933s; i11++) {
            fullSpanItem.mGapPerSpan[i11] = this.mSpans[i11].p(i10) - i10;
        }
        return fullSpanItem;
    }

    public final void o2() {
        this.f22934t = s.b(this, this.f22936v);
        this.f22935u = s.b(this, 1 - this.f22936v);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void p1(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f22926H = savedState;
            if (this.f22920B != -1) {
                savedState.a();
                this.f22926H.b();
            }
            H1();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v5 */
    public final int p2(RecyclerView.x xVar, n nVar, RecyclerView.B b10) {
        d dVar;
        int C22;
        int e10;
        int m10;
        int e11;
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        StaggeredGridLayoutManager staggeredGridLayoutManager2 = this;
        ?? r82 = 0;
        staggeredGridLayoutManager2.f22919A.set(0, staggeredGridLayoutManager2.f22933s, true);
        int i10 = staggeredGridLayoutManager2.f22938x.f23200i ? nVar.f23196e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : nVar.f23196e == 1 ? nVar.f23198g + nVar.f23193b : nVar.f23197f - nVar.f23193b;
        staggeredGridLayoutManager2.a3(nVar.f23196e, i10);
        int i11 = staggeredGridLayoutManager2.f22940z ? staggeredGridLayoutManager2.f22934t.i() : staggeredGridLayoutManager2.f22934t.m();
        boolean z10 = false;
        StaggeredGridLayoutManager staggeredGridLayoutManager3 = staggeredGridLayoutManager2;
        while (nVar.a(b10) && (staggeredGridLayoutManager3.f22938x.f23200i || !staggeredGridLayoutManager3.f22919A.isEmpty())) {
            View b11 = nVar.b(xVar);
            c cVar = (c) b11.getLayoutParams();
            int a10 = cVar.a();
            int g10 = staggeredGridLayoutManager3.f22922D.g(a10);
            boolean z11 = g10 == -1 ? true : r82;
            if (z11) {
                dVar = cVar.f22961f ? staggeredGridLayoutManager3.mSpans[r82] : staggeredGridLayoutManager3.D2(nVar);
                staggeredGridLayoutManager3.f22922D.n(a10, dVar);
            } else {
                dVar = staggeredGridLayoutManager3.mSpans[g10];
            }
            d dVar2 = dVar;
            cVar.f22960e = dVar2;
            if (nVar.f23196e == 1) {
                staggeredGridLayoutManager3.t(b11);
            } else {
                staggeredGridLayoutManager3.u(b11, r82);
            }
            staggeredGridLayoutManager3.L2(b11, cVar, r82);
            if (nVar.f23196e == 1) {
                e10 = cVar.f22961f ? staggeredGridLayoutManager3.z2(i11) : dVar2.l(i11);
                C22 = staggeredGridLayoutManager3.f22934t.e(b11) + e10;
                if (z11 && cVar.f22961f) {
                    LazySpanLookup.FullSpanItem m22 = staggeredGridLayoutManager3.m2(e10);
                    m22.f22943b = -1;
                    m22.f22942a = a10;
                    staggeredGridLayoutManager3.f22922D.a(m22);
                }
            } else {
                C22 = cVar.f22961f ? staggeredGridLayoutManager3.C2(i11) : dVar2.p(i11);
                e10 = C22 - staggeredGridLayoutManager3.f22934t.e(b11);
                if (z11 && cVar.f22961f) {
                    LazySpanLookup.FullSpanItem n22 = staggeredGridLayoutManager3.n2(C22);
                    n22.f22943b = 1;
                    n22.f22942a = a10;
                    staggeredGridLayoutManager3.f22922D.a(n22);
                }
            }
            if (cVar.f22961f && nVar.f23195d == -1) {
                if (z11) {
                    staggeredGridLayoutManager3.f22930L = true;
                } else {
                    if (!(nVar.f23196e == 1 ? staggeredGridLayoutManager3.c2() : staggeredGridLayoutManager3.d2())) {
                        LazySpanLookup.FullSpanItem f10 = staggeredGridLayoutManager3.f22922D.f(a10);
                        if (f10 != null) {
                            f10.f22944c = true;
                        }
                        staggeredGridLayoutManager3.f22930L = true;
                    }
                }
            }
            staggeredGridLayoutManager3.e2(b11, cVar, nVar);
            if (staggeredGridLayoutManager3.J2() && staggeredGridLayoutManager3.f22936v == 1) {
                e11 = cVar.f22961f ? staggeredGridLayoutManager3.f22935u.i() : staggeredGridLayoutManager3.f22935u.i() - (((staggeredGridLayoutManager3.f22933s - 1) - dVar2.f22966e) * staggeredGridLayoutManager3.f22937w);
                m10 = e11 - staggeredGridLayoutManager3.f22935u.e(b11);
            } else {
                m10 = cVar.f22961f ? staggeredGridLayoutManager3.f22935u.m() : (dVar2.f22966e * staggeredGridLayoutManager3.f22937w) + staggeredGridLayoutManager3.f22935u.m();
                e11 = staggeredGridLayoutManager3.f22935u.e(b11) + m10;
            }
            int i12 = e11;
            int i13 = m10;
            if (staggeredGridLayoutManager3.f22936v == 1) {
                staggeredGridLayoutManager3.M0(b11, i13, e10, i12, C22);
                staggeredGridLayoutManager = this;
            } else {
                staggeredGridLayoutManager3.M0(b11, e10, i13, C22, i12);
                staggeredGridLayoutManager = staggeredGridLayoutManager3;
            }
            if (cVar.f22961f) {
                staggeredGridLayoutManager.a3(staggeredGridLayoutManager.f22938x.f23196e, i10);
            } else {
                staggeredGridLayoutManager.g3(dVar2, staggeredGridLayoutManager.f22938x.f23196e, i10);
            }
            staggeredGridLayoutManager.Q2(xVar, staggeredGridLayoutManager.f22938x);
            if (staggeredGridLayoutManager.f22938x.f23199h && b11.hasFocusable()) {
                if (cVar.f22961f) {
                    staggeredGridLayoutManager.f22919A.clear();
                } else {
                    staggeredGridLayoutManager.f22919A.set(dVar2.f22966e, false);
                }
            }
            z10 = true;
            r82 = 0;
            staggeredGridLayoutManager3 = staggeredGridLayoutManager;
        }
        if (!z10) {
            staggeredGridLayoutManager3.Q2(xVar, staggeredGridLayoutManager3.f22938x);
        }
        int m11 = staggeredGridLayoutManager3.f22938x.f23196e == -1 ? staggeredGridLayoutManager3.f22934t.m() - staggeredGridLayoutManager3.C2(staggeredGridLayoutManager3.f22934t.m()) : staggeredGridLayoutManager3.z2(staggeredGridLayoutManager3.f22934t.i()) - staggeredGridLayoutManager3.f22934t.i();
        if (m11 > 0) {
            return Math.min(nVar.f23193b, m11);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public Parcelable q1() {
        int p10;
        int m10;
        int[] iArr;
        if (this.f22926H != null) {
            return new SavedState(this.f22926H);
        }
        SavedState savedState = new SavedState();
        savedState.f22950f = this.f22939y;
        savedState.f22951g = this.f22924F;
        savedState.f22952h = this.f22925G;
        LazySpanLookup lazySpanLookup = this.f22922D;
        if (lazySpanLookup == null || (iArr = lazySpanLookup.mData) == null) {
            savedState.f22948d = 0;
        } else {
            savedState.mSpanLookup = iArr;
            savedState.f22948d = iArr.length;
            savedState.f22949e = lazySpanLookup.f22941a;
        }
        if (Z() <= 0) {
            savedState.f22945a = -1;
            savedState.f22946b = -1;
            savedState.f22947c = 0;
            return savedState;
        }
        savedState.f22945a = this.f22924F ? y2() : x2();
        savedState.f22946b = t2();
        int i10 = this.f22933s;
        savedState.f22947c = i10;
        savedState.mSpanOffsets = new int[i10];
        for (int i11 = 0; i11 < this.f22933s; i11++) {
            if (this.f22924F) {
                p10 = this.mSpans[i11].l(Integer.MIN_VALUE);
                if (p10 != Integer.MIN_VALUE) {
                    m10 = this.f22934t.i();
                    p10 -= m10;
                    savedState.mSpanOffsets[i11] = p10;
                } else {
                    savedState.mSpanOffsets[i11] = p10;
                }
            } else {
                p10 = this.mSpans[i11].p(Integer.MIN_VALUE);
                if (p10 != Integer.MIN_VALUE) {
                    m10 = this.f22934t.m();
                    p10 -= m10;
                    savedState.mSpanOffsets[i11] = p10;
                } else {
                    savedState.mSpanOffsets[i11] = p10;
                }
            }
        }
        return savedState;
    }

    public final int q2(int i10) {
        int Z10 = Z();
        for (int i11 = 0; i11 < Z10; i11++) {
            int s02 = s0(Y(i11));
            if (s02 >= 0 && s02 < i10) {
                return s02;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void r1(int i10) {
        if (i10 == 0) {
            g2();
        }
    }

    public View r2(boolean z10) {
        int m10 = this.f22934t.m();
        int i10 = this.f22934t.i();
        View view = null;
        for (int Z10 = Z() - 1; Z10 >= 0; Z10--) {
            View Y10 = Y(Z10);
            int g10 = this.f22934t.g(Y10);
            int d10 = this.f22934t.d(Y10);
            if (d10 > m10 && g10 < i10) {
                if (d10 <= i10 || !z10) {
                    return Y10;
                }
                if (view == null) {
                    view = Y10;
                }
            }
        }
        return view;
    }

    public View s2(boolean z10) {
        int m10 = this.f22934t.m();
        int i10 = this.f22934t.i();
        int Z10 = Z();
        View view = null;
        for (int i11 = 0; i11 < Z10; i11++) {
            View Y10 = Y(i11);
            int g10 = this.f22934t.g(Y10);
            if (this.f22934t.d(Y10) > m10 && g10 < i10) {
                if (g10 >= m10 || !z10) {
                    return Y10;
                }
                if (view == null) {
                    view = Y10;
                }
            }
        }
        return view;
    }

    public int t2() {
        View r22 = this.f22940z ? r2(true) : s2(true);
        if (r22 == null) {
            return -1;
        }
        return s0(r22);
    }

    public final int u2(int i10) {
        for (int Z10 = Z() - 1; Z10 >= 0; Z10--) {
            int s02 = s0(Y(Z10));
            if (s02 >= 0 && s02 < i10) {
                return s02;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int v0(RecyclerView.x xVar, RecyclerView.B b10) {
        if (this.f22936v == 0) {
            return Math.min(this.f22933s, b10.b());
        }
        return -1;
    }

    public final void v2(RecyclerView.x xVar, RecyclerView.B b10, boolean z10) {
        int i10;
        int z22 = z2(Integer.MIN_VALUE);
        if (z22 != Integer.MIN_VALUE && (i10 = this.f22934t.i() - z22) > 0) {
            int i11 = i10 - (-V2(-i10, xVar, b10));
            if (!z10 || i11 <= 0) {
                return;
            }
            this.f22934t.r(i11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void w(String str) {
        if (this.f22926H == null) {
            super.w(str);
        }
    }

    public final void w2(RecyclerView.x xVar, RecyclerView.B b10, boolean z10) {
        int m10;
        int C22 = C2(Integer.MAX_VALUE);
        if (C22 != Integer.MAX_VALUE && (m10 = C22 - this.f22934t.m()) > 0) {
            int V22 = m10 - V2(m10, xVar, b10);
            if (!z10 || V22 <= 0) {
                return;
            }
            this.f22934t.r(-V22);
        }
    }

    public int x2() {
        if (Z() == 0) {
            return 0;
        }
        return s0(Y(0));
    }

    public int y2() {
        int Z10 = Z();
        if (Z10 == 0) {
            return 0;
        }
        return s0(Y(Z10 - 1));
    }

    public final int z2(int i10) {
        int l10 = this.mSpans[0].l(i10);
        for (int i11 = 1; i11 < this.f22933s; i11++) {
            int l11 = this.mSpans[i11].l(i10);
            if (l11 > l10) {
                l10 = l11;
            }
        }
        return l10;
    }

    public static class LazySpanLookup {

        /* renamed from: a, reason: collision with root package name */
        public List f22941a;
        int[] mData;

        public void a(FullSpanItem fullSpanItem) {
            if (this.f22941a == null) {
                this.f22941a = new ArrayList();
            }
            int size = this.f22941a.size();
            for (int i10 = 0; i10 < size; i10++) {
                FullSpanItem fullSpanItem2 = (FullSpanItem) this.f22941a.get(i10);
                if (fullSpanItem2.f22942a == fullSpanItem.f22942a) {
                    this.f22941a.remove(i10);
                }
                if (fullSpanItem2.f22942a >= fullSpanItem.f22942a) {
                    this.f22941a.add(i10, fullSpanItem);
                    return;
                }
            }
            this.f22941a.add(fullSpanItem);
        }

        public void b() {
            int[] iArr = this.mData;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f22941a = null;
        }

        public void c(int i10) {
            int[] iArr = this.mData;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i10, 10) + 1];
                this.mData = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i10 >= iArr.length) {
                int[] iArr3 = new int[o(i10)];
                this.mData = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.mData;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        public int d(int i10) {
            List list = this.f22941a;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (((FullSpanItem) this.f22941a.get(size)).f22942a >= i10) {
                        this.f22941a.remove(size);
                    }
                }
            }
            return h(i10);
        }

        public FullSpanItem e(int i10, int i11, int i12, boolean z10) {
            List list = this.f22941a;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.f22941a.get(i13);
                int i14 = fullSpanItem.f22942a;
                if (i14 >= i11) {
                    return null;
                }
                if (i14 >= i10 && (i12 == 0 || fullSpanItem.f22943b == i12 || (z10 && fullSpanItem.f22944c))) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        public FullSpanItem f(int i10) {
            List list = this.f22941a;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.f22941a.get(size);
                if (fullSpanItem.f22942a == i10) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        public int g(int i10) {
            int[] iArr = this.mData;
            if (iArr == null || i10 >= iArr.length) {
                return -1;
            }
            return iArr[i10];
        }

        public int h(int i10) {
            int[] iArr = this.mData;
            if (iArr == null || i10 >= iArr.length) {
                return -1;
            }
            int i11 = i(i10);
            if (i11 == -1) {
                int[] iArr2 = this.mData;
                Arrays.fill(iArr2, i10, iArr2.length, -1);
                return this.mData.length;
            }
            int min = Math.min(i11 + 1, this.mData.length);
            Arrays.fill(this.mData, i10, min, -1);
            return min;
        }

        public final int i(int i10) {
            if (this.f22941a == null) {
                return -1;
            }
            FullSpanItem f10 = f(i10);
            if (f10 != null) {
                this.f22941a.remove(f10);
            }
            int size = this.f22941a.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    i11 = -1;
                    break;
                }
                if (((FullSpanItem) this.f22941a.get(i11)).f22942a >= i10) {
                    break;
                }
                i11++;
            }
            if (i11 == -1) {
                return -1;
            }
            FullSpanItem fullSpanItem = (FullSpanItem) this.f22941a.get(i11);
            this.f22941a.remove(i11);
            return fullSpanItem.f22942a;
        }

        public void j(int i10, int i11) {
            int[] iArr = this.mData;
            if (iArr == null || i10 >= iArr.length) {
                return;
            }
            int i12 = i10 + i11;
            c(i12);
            int[] iArr2 = this.mData;
            System.arraycopy(iArr2, i10, iArr2, i12, (iArr2.length - i10) - i11);
            Arrays.fill(this.mData, i10, i12, -1);
            l(i10, i11);
        }

        public void k(int i10, int i11) {
            int[] iArr = this.mData;
            if (iArr == null || i10 >= iArr.length) {
                return;
            }
            int i12 = i10 + i11;
            c(i12);
            int[] iArr2 = this.mData;
            System.arraycopy(iArr2, i12, iArr2, i10, (iArr2.length - i10) - i11);
            int[] iArr3 = this.mData;
            Arrays.fill(iArr3, iArr3.length - i11, iArr3.length, -1);
            m(i10, i11);
        }

        public final void l(int i10, int i11) {
            List list = this.f22941a;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.f22941a.get(size);
                int i12 = fullSpanItem.f22942a;
                if (i12 >= i10) {
                    fullSpanItem.f22942a = i12 + i11;
                }
            }
        }

        public final void m(int i10, int i11) {
            List list = this.f22941a;
            if (list == null) {
                return;
            }
            int i12 = i10 + i11;
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.f22941a.get(size);
                int i13 = fullSpanItem.f22942a;
                if (i13 >= i10) {
                    if (i13 < i12) {
                        this.f22941a.remove(size);
                    } else {
                        fullSpanItem.f22942a = i13 - i11;
                    }
                }
            }
        }

        public void n(int i10, d dVar) {
            c(i10);
            this.mData[i10] = dVar.f22966e;
        }

        public int o(int i10) {
            int length = this.mData.length;
            while (length <= i10) {
                length *= 2;
            }
            return length;
        }

        @SuppressLint({"BanParcelableUsage"})
        public static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new a();

            /* renamed from: a, reason: collision with root package name */
            public int f22942a;

            /* renamed from: b, reason: collision with root package name */
            public int f22943b;

            /* renamed from: c, reason: collision with root package name */
            public boolean f22944c;
            int[] mGapPerSpan;

            public class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public FullSpanItem createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public FullSpanItem[] newArray(int i10) {
                    return new FullSpanItem[i10];
                }
            }

            public FullSpanItem(Parcel parcel) {
                this.f22942a = parcel.readInt();
                this.f22943b = parcel.readInt();
                this.f22944c = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.mGapPerSpan = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            public int a(int i10) {
                int[] iArr = this.mGapPerSpan;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i10];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f22942a + ", mGapDir=" + this.f22943b + ", mHasUnwantedGapAfter=" + this.f22944c + ", mGapPerSpan=" + Arrays.toString(this.mGapPerSpan) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i10) {
                parcel.writeInt(this.f22942a);
                parcel.writeInt(this.f22943b);
                parcel.writeInt(this.f22944c ? 1 : 0);
                int[] iArr = this.mGapPerSpan;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.mGapPerSpan);
                }
            }

            public FullSpanItem() {
            }
        }
    }

    public StaggeredGridLayoutManager(int i10, int i11) {
        this.f22936v = i11;
        Z2(i10);
        this.f22938x = new n();
        o2();
    }
}
