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
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o;
import androidx.recyclerview.widget.s;
import com.google.android.flexbox.c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class FlexboxLayoutManager extends RecyclerView.q implements com.google.android.flexbox.a, RecyclerView.A.b {

    /* renamed from: X, reason: collision with root package name */
    public static final Rect f31895X = new Rect();

    /* renamed from: B, reason: collision with root package name */
    public RecyclerView.x f31897B;

    /* renamed from: C, reason: collision with root package name */
    public RecyclerView.B f31898C;

    /* renamed from: D, reason: collision with root package name */
    public c f31899D;

    /* renamed from: F, reason: collision with root package name */
    public s f31901F;

    /* renamed from: G, reason: collision with root package name */
    public s f31902G;

    /* renamed from: H, reason: collision with root package name */
    public SavedState f31903H;

    /* renamed from: O, reason: collision with root package name */
    public boolean f31908O;

    /* renamed from: R, reason: collision with root package name */
    public final Context f31910R;

    /* renamed from: T, reason: collision with root package name */
    public View f31911T;

    /* renamed from: s, reason: collision with root package name */
    public int f31914s;

    /* renamed from: t, reason: collision with root package name */
    public int f31915t;

    /* renamed from: u, reason: collision with root package name */
    public int f31916u;

    /* renamed from: v, reason: collision with root package name */
    public int f31917v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f31919x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f31920y;

    /* renamed from: w, reason: collision with root package name */
    public int f31918w = -1;

    /* renamed from: z, reason: collision with root package name */
    public List f31921z = new ArrayList();

    /* renamed from: A, reason: collision with root package name */
    public final com.google.android.flexbox.c f31896A = new com.google.android.flexbox.c(this);

    /* renamed from: E, reason: collision with root package name */
    public b f31900E = new b();

    /* renamed from: I, reason: collision with root package name */
    public int f31904I = -1;

    /* renamed from: J, reason: collision with root package name */
    public int f31905J = Integer.MIN_VALUE;

    /* renamed from: K, reason: collision with root package name */
    public int f31906K = Integer.MIN_VALUE;

    /* renamed from: L, reason: collision with root package name */
    public int f31907L = Integer.MIN_VALUE;

    /* renamed from: P, reason: collision with root package name */
    public SparseArray f31909P = new SparseArray();

    /* renamed from: V, reason: collision with root package name */
    public int f31912V = -1;

    /* renamed from: W, reason: collision with root package name */
    public c.b f31913W = new c.b();

    public class b {

        /* renamed from: a, reason: collision with root package name */
        public int f31933a;

        /* renamed from: b, reason: collision with root package name */
        public int f31934b;

        /* renamed from: c, reason: collision with root package name */
        public int f31935c;

        /* renamed from: d, reason: collision with root package name */
        public int f31936d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f31937e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f31938f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f31939g;

        public b() {
            this.f31936d = 0;
        }

        public static /* synthetic */ int l(b bVar, int i10) {
            int i11 = bVar.f31936d + i10;
            bVar.f31936d = i11;
            return i11;
        }

        public final void r() {
            if (FlexboxLayoutManager.this.q() || !FlexboxLayoutManager.this.f31919x) {
                this.f31935c = this.f31937e ? FlexboxLayoutManager.this.f31901F.i() : FlexboxLayoutManager.this.f31901F.m();
            } else {
                this.f31935c = this.f31937e ? FlexboxLayoutManager.this.f31901F.i() : FlexboxLayoutManager.this.z0() - FlexboxLayoutManager.this.f31901F.m();
            }
        }

        public final void s(View view) {
            s sVar = FlexboxLayoutManager.this.f31915t == 0 ? FlexboxLayoutManager.this.f31902G : FlexboxLayoutManager.this.f31901F;
            if (FlexboxLayoutManager.this.q() || !FlexboxLayoutManager.this.f31919x) {
                if (this.f31937e) {
                    this.f31935c = sVar.d(view) + sVar.o();
                } else {
                    this.f31935c = sVar.g(view);
                }
            } else if (this.f31937e) {
                this.f31935c = sVar.g(view) + sVar.o();
            } else {
                this.f31935c = sVar.d(view);
            }
            this.f31933a = FlexboxLayoutManager.this.s0(view);
            this.f31939g = false;
            int[] iArr = FlexboxLayoutManager.this.f31896A.mIndexToFlexLine;
            int i10 = this.f31933a;
            if (i10 == -1) {
                i10 = 0;
            }
            int i11 = iArr[i10];
            this.f31934b = i11 != -1 ? i11 : 0;
            if (FlexboxLayoutManager.this.f31921z.size() > this.f31934b) {
                this.f31933a = ((com.google.android.flexbox.b) FlexboxLayoutManager.this.f31921z.get(this.f31934b)).f31965o;
            }
        }

        public final void t() {
            this.f31933a = -1;
            this.f31934b = -1;
            this.f31935c = Integer.MIN_VALUE;
            this.f31938f = false;
            this.f31939g = false;
            if (FlexboxLayoutManager.this.q()) {
                if (FlexboxLayoutManager.this.f31915t == 0) {
                    this.f31937e = FlexboxLayoutManager.this.f31914s == 1;
                    return;
                } else {
                    this.f31937e = FlexboxLayoutManager.this.f31915t == 2;
                    return;
                }
            }
            if (FlexboxLayoutManager.this.f31915t == 0) {
                this.f31937e = FlexboxLayoutManager.this.f31914s == 3;
            } else {
                this.f31937e = FlexboxLayoutManager.this.f31915t == 2;
            }
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f31933a + ", mFlexLinePosition=" + this.f31934b + ", mCoordinate=" + this.f31935c + ", mPerpendicularCoordinate=" + this.f31936d + ", mLayoutFromEnd=" + this.f31937e + ", mValid=" + this.f31938f + ", mAssignedFromSavedState=" + this.f31939g + '}';
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public int f31941a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f31942b;

        /* renamed from: c, reason: collision with root package name */
        public int f31943c;

        /* renamed from: d, reason: collision with root package name */
        public int f31944d;

        /* renamed from: e, reason: collision with root package name */
        public int f31945e;

        /* renamed from: f, reason: collision with root package name */
        public int f31946f;

        /* renamed from: g, reason: collision with root package name */
        public int f31947g;

        /* renamed from: h, reason: collision with root package name */
        public int f31948h;

        /* renamed from: i, reason: collision with root package name */
        public int f31949i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f31950j;

        public c() {
            this.f31948h = 1;
            this.f31949i = 1;
        }

        public static /* synthetic */ int c(c cVar, int i10) {
            int i11 = cVar.f31945e + i10;
            cVar.f31945e = i11;
            return i11;
        }

        public static /* synthetic */ int d(c cVar, int i10) {
            int i11 = cVar.f31945e - i10;
            cVar.f31945e = i11;
            return i11;
        }

        public static /* synthetic */ int i(c cVar, int i10) {
            int i11 = cVar.f31941a - i10;
            cVar.f31941a = i11;
            return i11;
        }

        public static /* synthetic */ int l(c cVar) {
            int i10 = cVar.f31943c;
            cVar.f31943c = i10 + 1;
            return i10;
        }

        public static /* synthetic */ int m(c cVar) {
            int i10 = cVar.f31943c;
            cVar.f31943c = i10 - 1;
            return i10;
        }

        public static /* synthetic */ int n(c cVar, int i10) {
            int i11 = cVar.f31943c + i10;
            cVar.f31943c = i11;
            return i11;
        }

        public static /* synthetic */ int q(c cVar, int i10) {
            int i11 = cVar.f31946f + i10;
            cVar.f31946f = i11;
            return i11;
        }

        public static /* synthetic */ int u(c cVar, int i10) {
            int i11 = cVar.f31944d + i10;
            cVar.f31944d = i11;
            return i11;
        }

        public static /* synthetic */ int v(c cVar, int i10) {
            int i11 = cVar.f31944d - i10;
            cVar.f31944d = i11;
            return i11;
        }

        public final boolean D(RecyclerView.B b10, List list) {
            int i10;
            int i11 = this.f31944d;
            return i11 >= 0 && i11 < b10.b() && (i10 = this.f31943c) >= 0 && i10 < list.size();
        }

        public String toString() {
            return "LayoutState{mAvailable=" + this.f31941a + ", mFlexLinePosition=" + this.f31943c + ", mPosition=" + this.f31944d + ", mOffset=" + this.f31945e + ", mScrollingOffset=" + this.f31946f + ", mLastScrollDelta=" + this.f31947g + ", mItemDirection=" + this.f31948h + ", mLayoutDirection=" + this.f31949i + '}';
        }
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        RecyclerView.q.d t02 = RecyclerView.q.t0(context, attributeSet, i10, i11);
        int i12 = t02.f22895a;
        if (i12 != 0) {
            if (i12 == 1) {
                if (t02.f22897c) {
                    S2(3);
                } else {
                    S2(2);
                }
            }
        } else if (t02.f22897c) {
            S2(1);
        } else {
            S2(0);
        }
        T2(1);
        R2(4);
        this.f31910R = context;
    }

    private View B2() {
        return Y(0);
    }

    public static boolean J0(int i10, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (i12 > 0 && i10 != i12) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i10;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i10;
        }
        return true;
    }

    private void M2(RecyclerView.x xVar, int i10, int i11) {
        while (i11 >= i10) {
            B1(i11, xVar);
            i11--;
        }
    }

    private boolean T1(View view, int i10, int i11, RecyclerView.r rVar) {
        return (!view.isLayoutRequested() && I0() && J0(view.getWidth(), i10, ((ViewGroup.MarginLayoutParams) rVar).width) && J0(view.getHeight(), i11, ((ViewGroup.MarginLayoutParams) rVar).height)) ? false : true;
    }

    private int k2(RecyclerView.B b10) {
        if (Z() == 0) {
            return 0;
        }
        int b11 = b10.b();
        o2();
        View q22 = q2(b11);
        View t22 = t2(b11);
        if (b10.b() == 0 || q22 == null || t22 == null) {
            return 0;
        }
        return Math.min(this.f31901F.n(), this.f31901F.d(t22) - this.f31901F.g(q22));
    }

    private int l2(RecyclerView.B b10) {
        if (Z() == 0) {
            return 0;
        }
        int b11 = b10.b();
        View q22 = q2(b11);
        View t22 = t2(b11);
        if (b10.b() != 0 && q22 != null && t22 != null) {
            int s02 = s0(q22);
            int s03 = s0(t22);
            int abs = Math.abs(this.f31901F.d(t22) - this.f31901F.g(q22));
            int i10 = this.f31896A.mIndexToFlexLine[s02];
            if (i10 != 0 && i10 != -1) {
                return Math.round((i10 * (abs / ((r4[s03] - i10) + 1))) + (this.f31901F.m() - this.f31901F.g(q22)));
            }
        }
        return 0;
    }

    private int m2(RecyclerView.B b10) {
        if (Z() == 0) {
            return 0;
        }
        int b11 = b10.b();
        View q22 = q2(b11);
        View t22 = t2(b11);
        if (b10.b() == 0 || q22 == null || t22 == null) {
            return 0;
        }
        int s22 = s2();
        return (int) ((Math.abs(this.f31901F.d(t22) - this.f31901F.g(q22)) / ((v2() - s22) + 1)) * b10.b());
    }

    private void n2() {
        if (this.f31899D == null) {
            this.f31899D = new c();
        }
    }

    private int y2(int i10, RecyclerView.x xVar, RecyclerView.B b10, boolean z10) {
        int i11;
        int i12;
        if (q() || !this.f31919x) {
            int i13 = this.f31901F.i() - i10;
            if (i13 <= 0) {
                return 0;
            }
            i11 = -F2(-i13, xVar, b10);
        } else {
            int m10 = i10 - this.f31901F.m();
            if (m10 <= 0) {
                return 0;
            }
            i11 = F2(m10, xVar, b10);
        }
        int i14 = i10 + i11;
        if (!z10 || (i12 = this.f31901F.i() - i14) <= 0) {
            return i11;
        }
        this.f31901F.r(i12);
        return i12 + i11;
    }

    private int z2(int i10, RecyclerView.x xVar, RecyclerView.B b10, boolean z10) {
        int i11;
        int m10;
        if (q() || !this.f31919x) {
            int m11 = i10 - this.f31901F.m();
            if (m11 <= 0) {
                return 0;
            }
            i11 = -F2(m11, xVar, b10);
        } else {
            int i12 = this.f31901F.i() - i10;
            if (i12 <= 0) {
                return 0;
            }
            i11 = F2(-i12, xVar, b10);
        }
        int i13 = i10 + i11;
        if (!z10 || (m10 = i13 - this.f31901F.m()) <= 0) {
            return i11;
        }
        this.f31901F.r(-m10);
        return i11 - m10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean A() {
        if (this.f31915t == 0) {
            return q();
        }
        if (!q()) {
            return true;
        }
        int z02 = z0();
        View view = this.f31911T;
        return z02 > (view != null ? view.getWidth() : 0);
    }

    public final int A2(View view) {
        return e0(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.r) view.getLayoutParams())).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean B() {
        if (this.f31915t == 0) {
            return !q();
        }
        if (!q()) {
            int m02 = m0();
            View view = this.f31911T;
            if (m02 <= (view != null ? view.getHeight() : 0)) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean C(RecyclerView.r rVar) {
        return rVar instanceof LayoutParams;
    }

    public final int C2(View view) {
        return g0(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.r) view.getLayoutParams())).leftMargin;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean D0() {
        return true;
    }

    public final int D2(View view) {
        return j0(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.r) view.getLayoutParams())).rightMargin;
    }

    public final int E2(View view) {
        return k0(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.r) view.getLayoutParams())).topMargin;
    }

    public final int F2(int i10, RecyclerView.x xVar, RecyclerView.B b10) {
        if (Z() == 0 || i10 == 0) {
            return 0;
        }
        o2();
        int i11 = 1;
        this.f31899D.f31950j = true;
        boolean z10 = !q() && this.f31919x;
        if (!z10 ? i10 <= 0 : i10 >= 0) {
            i11 = -1;
        }
        int abs = Math.abs(i10);
        Z2(i11, abs);
        int p22 = this.f31899D.f31946f + p2(xVar, b10, this.f31899D);
        if (p22 < 0) {
            return 0;
        }
        if (z10) {
            if (abs > p22) {
                i10 = (-i11) * p22;
            }
        } else if (abs > p22) {
            i10 = i11 * p22;
        }
        this.f31901F.r(-i10);
        this.f31899D.f31947g = i10;
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int G(RecyclerView.B b10) {
        return k2(b10);
    }

    public final int G2(int i10) {
        if (Z() == 0 || i10 == 0) {
            return 0;
        }
        o2();
        boolean q10 = q();
        View view = this.f31911T;
        int width = q10 ? view.getWidth() : view.getHeight();
        int z02 = q10 ? z0() : m0();
        if (o0() == 1) {
            int abs = Math.abs(i10);
            if (i10 < 0) {
                return -Math.min((z02 + this.f31900E.f31936d) - width, abs);
            }
            if (this.f31900E.f31936d + i10 > 0) {
                return -this.f31900E.f31936d;
            }
        } else {
            if (i10 > 0) {
                return Math.min((z02 - this.f31900E.f31936d) - width, i10);
            }
            if (this.f31900E.f31936d + i10 < 0) {
                return -this.f31900E.f31936d;
            }
        }
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int H(RecyclerView.B b10) {
        return l2(b10);
    }

    public final boolean H2(View view, boolean z10) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int z02 = z0() - getPaddingRight();
        int m02 = m0() - getPaddingBottom();
        int C22 = C2(view);
        int E22 = E2(view);
        int D22 = D2(view);
        int A22 = A2(view);
        return z10 ? (paddingLeft <= C22 && z02 >= D22) && (paddingTop <= E22 && m02 >= A22) : (C22 >= z02 || D22 >= paddingLeft) && (E22 >= m02 || A22 >= paddingTop);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int I(RecyclerView.B b10) {
        return m2(b10);
    }

    public final int I2(com.google.android.flexbox.b bVar, c cVar) {
        return q() ? J2(bVar, cVar) : K2(bVar, cVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int J(RecyclerView.B b10) {
        return k2(b10);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int J2(com.google.android.flexbox.b bVar, c cVar) {
        float f10;
        float f11;
        float f12;
        int b10;
        int i10;
        float f13;
        com.google.android.flexbox.b bVar2 = bVar;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int z02 = z0();
        int i11 = cVar.f31945e;
        if (cVar.f31949i == -1) {
            i11 -= bVar2.f31957g;
        }
        int i12 = i11;
        int i13 = cVar.f31944d;
        int i14 = this.f31916u;
        int i15 = 1;
        if (i14 == 0) {
            f10 = paddingLeft;
            f11 = z02 - paddingRight;
        } else if (i14 == 1) {
            int i16 = bVar2.f31955e;
            float f14 = (z02 - i16) + paddingRight;
            f11 = i16 - paddingLeft;
            f10 = f14;
        } else {
            if (i14 != 2) {
                if (i14 == 3) {
                    f10 = paddingLeft;
                    f12 = (z02 - bVar2.f31955e) / (bVar2.f31958h != 1 ? r5 - 1 : 1.0f);
                    f11 = z02 - paddingRight;
                } else if (i14 == 4) {
                    int i17 = bVar2.f31958h;
                    f12 = i17 != 0 ? (z02 - bVar2.f31955e) / i17 : 0.0f;
                    float f15 = f12 / 2.0f;
                    f10 = paddingLeft + f15;
                    f11 = (z02 - paddingRight) - f15;
                } else {
                    if (i14 != 5) {
                        throw new IllegalStateException("Invalid justifyContent is set: " + this.f31916u);
                    }
                    f12 = bVar2.f31958h != 0 ? (z02 - bVar2.f31955e) / (r5 + 1) : 0.0f;
                    f10 = paddingLeft + f12;
                    f11 = (z02 - paddingRight) - f12;
                }
                float f16 = f10 - this.f31900E.f31936d;
                float f17 = f11 - this.f31900E.f31936d;
                float max = Math.max(f12, 0.0f);
                b10 = bVar2.b();
                int i18 = 0;
                i10 = i13;
                while (i10 < i13 + b10) {
                    float f18 = f17;
                    View g10 = g(i10);
                    if (g10 == null) {
                        f17 = f18;
                        f13 = max;
                    } else {
                        if (cVar.f31949i == i15) {
                            z(g10, f31895X);
                            t(g10);
                        } else {
                            z(g10, f31895X);
                            u(g10, i18);
                            i18++;
                        }
                        int i19 = i18;
                        com.google.android.flexbox.c cVar2 = this.f31896A;
                        f13 = max;
                        long j10 = cVar2.mMeasureSpecCache[i10];
                        int y10 = cVar2.y(j10);
                        int x10 = this.f31896A.x(j10);
                        if (T1(g10, y10, x10, (LayoutParams) g10.getLayoutParams())) {
                            g10.measure(y10, x10);
                        }
                        float p02 = f16 + ((ViewGroup.MarginLayoutParams) r10).leftMargin + p0(g10);
                        float u02 = f18 - (((ViewGroup.MarginLayoutParams) r10).rightMargin + u0(g10));
                        int x02 = i12 + x0(g10);
                        if (this.f31919x) {
                            this.f31896A.Q(g10, bVar2, Math.round(u02) - g10.getMeasuredWidth(), x02, Math.round(u02), g10.getMeasuredHeight() + x02);
                        } else {
                            this.f31896A.Q(g10, bVar, Math.round(p02), x02, g10.getMeasuredWidth() + Math.round(p02), x02 + g10.getMeasuredHeight());
                        }
                        f16 = p02 + g10.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) r10).rightMargin + u0(g10) + f13;
                        i18 = i19;
                        f17 = u02 - (((g10.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) r10).leftMargin) + p0(g10)) + f13);
                    }
                    i10++;
                    bVar2 = bVar;
                    max = f13;
                    i15 = 1;
                }
                c.n(cVar, this.f31899D.f31949i);
                return bVar.a();
            }
            int i20 = bVar2.f31955e;
            f10 = paddingLeft + ((z02 - i20) / 2.0f);
            f11 = (z02 - paddingRight) - ((z02 - i20) / 2.0f);
        }
        f12 = 0.0f;
        float f162 = f10 - this.f31900E.f31936d;
        float f172 = f11 - this.f31900E.f31936d;
        float max2 = Math.max(f12, 0.0f);
        b10 = bVar2.b();
        int i182 = 0;
        i10 = i13;
        while (i10 < i13 + b10) {
        }
        c.n(cVar, this.f31899D.f31949i);
        return bVar.a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int K(RecyclerView.B b10) {
        return l2(b10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int K1(int i10, RecyclerView.x xVar, RecyclerView.B b10) {
        if (!q() || this.f31915t == 0) {
            int F22 = F2(i10, xVar, b10);
            this.f31909P.clear();
            return F22;
        }
        int G22 = G2(i10);
        b.l(this.f31900E, G22);
        this.f31902G.r(-G22);
        return G22;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int K2(com.google.android.flexbox.b bVar, c cVar) {
        float f10;
        float f11;
        float f12;
        int b10;
        int i10;
        float f13;
        boolean z10;
        com.google.android.flexbox.b bVar2 = bVar;
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int m02 = m0();
        int i11 = cVar.f31945e;
        int i12 = cVar.f31945e;
        if (cVar.f31949i == -1) {
            int i13 = bVar2.f31957g;
            i11 -= i13;
            i12 += i13;
        }
        int i14 = i11;
        int i15 = i12;
        int i16 = cVar.f31944d;
        int i17 = this.f31916u;
        boolean z11 = true;
        if (i17 == 0) {
            f10 = paddingTop;
            f11 = m02 - paddingBottom;
        } else if (i17 == 1) {
            int i18 = bVar2.f31955e;
            float f14 = (m02 - i18) + paddingBottom;
            f11 = i18 - paddingTop;
            f10 = f14;
        } else {
            if (i17 != 2) {
                if (i17 == 3) {
                    f10 = paddingTop;
                    f12 = (m02 - bVar2.f31955e) / (bVar2.f31958h != 1 ? r5 - 1 : 1.0f);
                    f11 = m02 - paddingBottom;
                } else if (i17 == 4) {
                    int i19 = bVar2.f31958h;
                    f12 = i19 != 0 ? (m02 - bVar2.f31955e) / i19 : 0.0f;
                    float f15 = f12 / 2.0f;
                    f10 = paddingTop + f15;
                    f11 = (m02 - paddingBottom) - f15;
                } else {
                    if (i17 != 5) {
                        throw new IllegalStateException("Invalid justifyContent is set: " + this.f31916u);
                    }
                    f12 = bVar2.f31958h != 0 ? (m02 - bVar2.f31955e) / (r5 + 1) : 0.0f;
                    f10 = paddingTop + f12;
                    f11 = (m02 - paddingBottom) - f12;
                }
                float f16 = f10 - this.f31900E.f31936d;
                float f17 = f11 - this.f31900E.f31936d;
                float max = Math.max(f12, 0.0f);
                b10 = bVar2.b();
                int i20 = 0;
                i10 = i16;
                while (i10 < i16 + b10) {
                    float f18 = f17;
                    View g10 = g(i10);
                    if (g10 == null) {
                        f17 = f18;
                        z10 = z11;
                        f13 = max;
                    } else {
                        com.google.android.flexbox.c cVar2 = this.f31896A;
                        f13 = max;
                        long j10 = cVar2.mMeasureSpecCache[i10];
                        int y10 = cVar2.y(j10);
                        int x10 = this.f31896A.x(j10);
                        if (T1(g10, y10, x10, (LayoutParams) g10.getLayoutParams())) {
                            g10.measure(y10, x10);
                        }
                        float x02 = f16 + ((ViewGroup.MarginLayoutParams) r12).topMargin + x0(g10);
                        float X10 = f18 - (((ViewGroup.MarginLayoutParams) r12).rightMargin + X(g10));
                        if (cVar.f31949i == 1) {
                            z(g10, f31895X);
                            t(g10);
                        } else {
                            z(g10, f31895X);
                            u(g10, i20);
                            i20++;
                        }
                        int i21 = i20;
                        int p02 = p0(g10) + i14;
                        int u02 = i15 - u0(g10);
                        boolean z12 = this.f31919x;
                        if (!z12) {
                            z10 = true;
                            if (this.f31920y) {
                                this.f31896A.R(g10, bVar, z12, p02, Math.round(X10) - g10.getMeasuredHeight(), p02 + g10.getMeasuredWidth(), Math.round(X10));
                            } else {
                                this.f31896A.R(g10, bVar, z12, p02, Math.round(x02), p02 + g10.getMeasuredWidth(), g10.getMeasuredHeight() + Math.round(x02));
                            }
                        } else if (this.f31920y) {
                            z10 = true;
                            this.f31896A.R(g10, bVar2, z12, u02 - g10.getMeasuredWidth(), Math.round(X10) - g10.getMeasuredHeight(), u02, Math.round(X10));
                        } else {
                            z10 = true;
                            this.f31896A.R(g10, bVar, z12, u02 - g10.getMeasuredWidth(), Math.round(x02), u02, g10.getMeasuredHeight() + Math.round(x02));
                        }
                        f16 = x02 + g10.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) r12).topMargin + X(g10) + f13;
                        i20 = i21;
                        f17 = X10 - (((g10.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) r12).bottomMargin) + x0(g10)) + f13);
                    }
                    i10++;
                    bVar2 = bVar;
                    max = f13;
                    z11 = z10;
                }
                c.n(cVar, this.f31899D.f31949i);
                return bVar.a();
            }
            int i22 = bVar2.f31955e;
            f10 = paddingTop + ((m02 - i22) / 2.0f);
            f11 = (m02 - paddingBottom) - ((m02 - i22) / 2.0f);
        }
        f12 = 0.0f;
        float f162 = f10 - this.f31900E.f31936d;
        float f172 = f11 - this.f31900E.f31936d;
        float max2 = Math.max(f12, 0.0f);
        b10 = bVar2.b();
        int i202 = 0;
        i10 = i16;
        while (i10 < i16 + b10) {
        }
        c.n(cVar, this.f31899D.f31949i);
        return bVar.a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int L(RecyclerView.B b10) {
        return m2(b10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void L1(int i10) {
        this.f31904I = i10;
        this.f31905J = Integer.MIN_VALUE;
        SavedState savedState = this.f31903H;
        if (savedState != null) {
            savedState.h();
        }
        H1();
    }

    public final void L2(RecyclerView.x xVar, c cVar) {
        if (cVar.f31950j) {
            if (cVar.f31949i == -1) {
                N2(xVar, cVar);
            } else {
                O2(xVar, cVar);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int M1(int i10, RecyclerView.x xVar, RecyclerView.B b10) {
        if (q() || (this.f31915t == 0 && !q())) {
            int F22 = F2(i10, xVar, b10);
            this.f31909P.clear();
            return F22;
        }
        int G22 = G2(i10);
        b.l(this.f31900E, G22);
        this.f31902G.r(-G22);
        return G22;
    }

    public final void N2(RecyclerView.x xVar, c cVar) {
        int Z10;
        int i10;
        View Y10;
        int i11;
        if (cVar.f31946f < 0 || (Z10 = Z()) == 0 || (Y10 = Y(Z10 - 1)) == null || (i11 = this.f31896A.mIndexToFlexLine[s0(Y10)]) == -1) {
            return;
        }
        com.google.android.flexbox.b bVar = (com.google.android.flexbox.b) this.f31921z.get(i11);
        int i12 = i10;
        while (true) {
            if (i12 < 0) {
                break;
            }
            View Y11 = Y(i12);
            if (Y11 != null) {
                if (!h2(Y11, cVar.f31946f)) {
                    break;
                }
                if (bVar.f31965o != s0(Y11)) {
                    continue;
                } else if (i11 <= 0) {
                    Z10 = i12;
                    break;
                } else {
                    i11 += cVar.f31949i;
                    bVar = (com.google.android.flexbox.b) this.f31921z.get(i11);
                    Z10 = i12;
                }
            }
            i12--;
        }
        M2(xVar, Z10, i10);
    }

    public final void O2(RecyclerView.x xVar, c cVar) {
        int Z10;
        View Y10;
        if (cVar.f31946f < 0 || (Z10 = Z()) == 0 || (Y10 = Y(0)) == null) {
            return;
        }
        int i10 = this.f31896A.mIndexToFlexLine[s0(Y10)];
        int i11 = -1;
        if (i10 == -1) {
            return;
        }
        com.google.android.flexbox.b bVar = (com.google.android.flexbox.b) this.f31921z.get(i10);
        int i12 = 0;
        while (true) {
            if (i12 >= Z10) {
                break;
            }
            View Y11 = Y(i12);
            if (Y11 != null) {
                if (!i2(Y11, cVar.f31946f)) {
                    break;
                }
                if (bVar.f31966p != s0(Y11)) {
                    continue;
                } else if (i10 >= this.f31921z.size() - 1) {
                    i11 = i12;
                    break;
                } else {
                    i10 += cVar.f31949i;
                    bVar = (com.google.android.flexbox.b) this.f31921z.get(i10);
                    i11 = i12;
                }
            }
            i12++;
        }
        M2(xVar, 0, i11);
    }

    public final void P2() {
        int n02 = q() ? n0() : A0();
        this.f31899D.f31942b = n02 == 0 || n02 == Integer.MIN_VALUE;
    }

    public final void Q2() {
        int o02 = o0();
        int i10 = this.f31914s;
        if (i10 == 0) {
            this.f31919x = o02 == 1;
            this.f31920y = this.f31915t == 2;
            return;
        }
        if (i10 == 1) {
            this.f31919x = o02 != 1;
            this.f31920y = this.f31915t == 2;
            return;
        }
        if (i10 == 2) {
            boolean z10 = o02 == 1;
            this.f31919x = z10;
            if (this.f31915t == 2) {
                this.f31919x = !z10;
            }
            this.f31920y = false;
            return;
        }
        if (i10 != 3) {
            this.f31919x = false;
            this.f31920y = false;
            return;
        }
        boolean z11 = o02 == 1;
        this.f31919x = z11;
        if (this.f31915t == 2) {
            this.f31919x = !z11;
        }
        this.f31920y = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void R0(RecyclerView.h hVar, RecyclerView.h hVar2) {
        x1();
    }

    public void R2(int i10) {
        int i11 = this.f31917v;
        if (i11 != i10) {
            if (i11 == 4 || i10 == 4) {
                x1();
                j2();
            }
            this.f31917v = i10;
            H1();
        }
    }

    public void S2(int i10) {
        if (this.f31914s != i10) {
            x1();
            this.f31914s = i10;
            this.f31901F = null;
            this.f31902G = null;
            j2();
            H1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public RecyclerView.r T() {
        return new LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void T0(RecyclerView recyclerView) {
        super.T0(recyclerView);
        this.f31911T = (View) recyclerView.getParent();
    }

    public void T2(int i10) {
        if (i10 == 2) {
            throw new UnsupportedOperationException("wrap_reverse is not supported in FlexboxLayoutManager");
        }
        int i11 = this.f31915t;
        if (i11 != i10) {
            if (i11 == 0 || i10 == 0) {
                x1();
                j2();
            }
            this.f31915t = i10;
            this.f31901F = null;
            this.f31902G = null;
            H1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public RecyclerView.r U(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    public final boolean U2(RecyclerView.B b10, b bVar) {
        if (Z() == 0) {
            return false;
        }
        View t22 = bVar.f31937e ? t2(b10.b()) : q2(b10.b());
        if (t22 == null) {
            return false;
        }
        bVar.s(t22);
        if (b10.e() || !Z1()) {
            return true;
        }
        if (this.f31901F.g(t22) < this.f31901F.i() && this.f31901F.d(t22) >= this.f31901F.m()) {
            return true;
        }
        bVar.f31935c = bVar.f31937e ? this.f31901F.i() : this.f31901F.m();
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void V0(RecyclerView recyclerView, RecyclerView.x xVar) {
        super.V0(recyclerView, xVar);
        if (this.f31908O) {
            y1(xVar);
            xVar.c();
        }
    }

    public final boolean V2(RecyclerView.B b10, b bVar, SavedState savedState) {
        int i10;
        View Y10;
        if (!b10.e() && (i10 = this.f31904I) != -1) {
            if (i10 >= 0 && i10 < b10.b()) {
                bVar.f31933a = this.f31904I;
                bVar.f31934b = this.f31896A.mIndexToFlexLine[bVar.f31933a];
                SavedState savedState2 = this.f31903H;
                if (savedState2 != null && savedState2.g(b10.b())) {
                    bVar.f31935c = this.f31901F.m() + savedState.f31932b;
                    bVar.f31939g = true;
                    bVar.f31934b = -1;
                    return true;
                }
                if (this.f31905J != Integer.MIN_VALUE) {
                    if (q() || !this.f31919x) {
                        bVar.f31935c = this.f31901F.m() + this.f31905J;
                    } else {
                        bVar.f31935c = this.f31905J - this.f31901F.j();
                    }
                    return true;
                }
                View S10 = S(this.f31904I);
                if (S10 == null) {
                    if (Z() > 0 && (Y10 = Y(0)) != null) {
                        bVar.f31937e = this.f31904I < s0(Y10);
                    }
                    bVar.r();
                } else {
                    if (this.f31901F.e(S10) > this.f31901F.n()) {
                        bVar.r();
                        return true;
                    }
                    if (this.f31901F.g(S10) - this.f31901F.m() < 0) {
                        bVar.f31935c = this.f31901F.m();
                        bVar.f31937e = false;
                        return true;
                    }
                    if (this.f31901F.i() - this.f31901F.d(S10) < 0) {
                        bVar.f31935c = this.f31901F.i();
                        bVar.f31937e = true;
                        return true;
                    }
                    bVar.f31935c = bVar.f31937e ? this.f31901F.d(S10) + this.f31901F.o() : this.f31901F.g(S10);
                }
                return true;
            }
            this.f31904I = -1;
            this.f31905J = Integer.MIN_VALUE;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void W1(RecyclerView recyclerView, RecyclerView.B b10, int i10) {
        o oVar = new o(recyclerView.getContext());
        oVar.p(i10);
        X1(oVar);
    }

    public final void W2(RecyclerView.B b10, b bVar) {
        if (V2(b10, bVar, this.f31903H) || U2(b10, bVar)) {
            return;
        }
        bVar.r();
        bVar.f31933a = 0;
        bVar.f31934b = 0;
    }

    public final void X2(int i10) {
        if (i10 >= v2()) {
            return;
        }
        int Z10 = Z();
        this.f31896A.t(Z10);
        this.f31896A.u(Z10);
        this.f31896A.s(Z10);
        if (i10 >= this.f31896A.mIndexToFlexLine.length) {
            return;
        }
        this.f31912V = i10;
        View B22 = B2();
        if (B22 == null) {
            return;
        }
        this.f31904I = s0(B22);
        if (q() || !this.f31919x) {
            this.f31905J = this.f31901F.g(B22) - this.f31901F.m();
        } else {
            this.f31905J = this.f31901F.d(B22) + this.f31901F.j();
        }
    }

    public final void Y2(int i10) {
        int i11;
        int i12;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(z0(), A0());
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(m0(), n0());
        int z02 = z0();
        int m02 = m0();
        boolean z10 = false;
        if (q()) {
            int i13 = this.f31906K;
            if (i13 != Integer.MIN_VALUE && i13 != z02) {
                z10 = true;
            }
            i11 = this.f31899D.f31942b ? this.f31910R.getResources().getDisplayMetrics().heightPixels : this.f31899D.f31941a;
        } else {
            int i14 = this.f31907L;
            if (i14 != Integer.MIN_VALUE && i14 != m02) {
                z10 = true;
            }
            i11 = this.f31899D.f31942b ? this.f31910R.getResources().getDisplayMetrics().widthPixels : this.f31899D.f31941a;
        }
        int i15 = i11;
        this.f31906K = z02;
        this.f31907L = m02;
        int i16 = this.f31912V;
        if (i16 == -1 && (this.f31904I != -1 || z10)) {
            if (this.f31900E.f31937e) {
                return;
            }
            this.f31921z.clear();
            this.f31913W.a();
            if (q()) {
                this.f31896A.e(this.f31913W, makeMeasureSpec, makeMeasureSpec2, i15, this.f31900E.f31933a, this.f31921z);
            } else {
                this.f31896A.h(this.f31913W, makeMeasureSpec, makeMeasureSpec2, i15, this.f31900E.f31933a, this.f31921z);
            }
            this.f31921z = this.f31913W.f31970a;
            this.f31896A.p(makeMeasureSpec, makeMeasureSpec2);
            this.f31896A.X();
            b bVar = this.f31900E;
            bVar.f31934b = this.f31896A.mIndexToFlexLine[bVar.f31933a];
            this.f31899D.f31943c = this.f31900E.f31934b;
            return;
        }
        int min = i16 != -1 ? Math.min(i16, this.f31900E.f31933a) : this.f31900E.f31933a;
        this.f31913W.a();
        if (q()) {
            if (this.f31921z.size() > 0) {
                this.f31896A.j(this.f31921z, min);
                this.f31896A.b(this.f31913W, makeMeasureSpec, makeMeasureSpec2, i15, min, this.f31900E.f31933a, this.f31921z);
                i12 = min;
                this.f31921z = this.f31913W.f31970a;
                this.f31896A.q(makeMeasureSpec, makeMeasureSpec2, i12);
                this.f31896A.Y(i12);
            }
            i12 = min;
            this.f31896A.s(i10);
            this.f31896A.d(this.f31913W, makeMeasureSpec, makeMeasureSpec2, i15, 0, this.f31921z);
            this.f31921z = this.f31913W.f31970a;
            this.f31896A.q(makeMeasureSpec, makeMeasureSpec2, i12);
            this.f31896A.Y(i12);
        }
        i12 = min;
        if (this.f31921z.size() <= 0) {
            this.f31896A.s(i10);
            this.f31896A.g(this.f31913W, makeMeasureSpec, makeMeasureSpec2, i15, 0, this.f31921z);
            this.f31921z = this.f31913W.f31970a;
            this.f31896A.q(makeMeasureSpec, makeMeasureSpec2, i12);
            this.f31896A.Y(i12);
        }
        this.f31896A.j(this.f31921z, i12);
        min = i12;
        this.f31896A.b(this.f31913W, makeMeasureSpec2, makeMeasureSpec, i15, min, this.f31900E.f31933a, this.f31921z);
        makeMeasureSpec2 = makeMeasureSpec2;
        makeMeasureSpec = makeMeasureSpec;
        i12 = min;
        this.f31921z = this.f31913W.f31970a;
        this.f31896A.q(makeMeasureSpec, makeMeasureSpec2, i12);
        this.f31896A.Y(i12);
    }

    public final void Z2(int i10, int i11) {
        this.f31899D.f31949i = i10;
        boolean q10 = q();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(z0(), A0());
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(m0(), n0());
        boolean z10 = !q10 && this.f31919x;
        if (i10 == 1) {
            View Y10 = Y(Z() - 1);
            if (Y10 == null) {
                return;
            }
            this.f31899D.f31945e = this.f31901F.d(Y10);
            int s02 = s0(Y10);
            View u22 = u2(Y10, (com.google.android.flexbox.b) this.f31921z.get(this.f31896A.mIndexToFlexLine[s02]));
            this.f31899D.f31948h = 1;
            c cVar = this.f31899D;
            cVar.f31944d = s02 + cVar.f31948h;
            if (this.f31896A.mIndexToFlexLine.length <= this.f31899D.f31944d) {
                this.f31899D.f31943c = -1;
            } else {
                c cVar2 = this.f31899D;
                cVar2.f31943c = this.f31896A.mIndexToFlexLine[cVar2.f31944d];
            }
            if (z10) {
                this.f31899D.f31945e = this.f31901F.g(u22);
                this.f31899D.f31946f = (-this.f31901F.g(u22)) + this.f31901F.m();
                c cVar3 = this.f31899D;
                cVar3.f31946f = Math.max(cVar3.f31946f, 0);
            } else {
                this.f31899D.f31945e = this.f31901F.d(u22);
                this.f31899D.f31946f = this.f31901F.d(u22) - this.f31901F.i();
            }
            if ((this.f31899D.f31943c == -1 || this.f31899D.f31943c > this.f31921z.size() - 1) && this.f31899D.f31944d <= getFlexItemCount()) {
                int i12 = i11 - this.f31899D.f31946f;
                this.f31913W.a();
                if (i12 > 0) {
                    if (q10) {
                        this.f31896A.d(this.f31913W, makeMeasureSpec, makeMeasureSpec2, i12, this.f31899D.f31944d, this.f31921z);
                    } else {
                        this.f31896A.g(this.f31913W, makeMeasureSpec, makeMeasureSpec2, i12, this.f31899D.f31944d, this.f31921z);
                    }
                    this.f31896A.q(makeMeasureSpec, makeMeasureSpec2, this.f31899D.f31944d);
                    this.f31896A.Y(this.f31899D.f31944d);
                }
            }
        } else {
            View Y11 = Y(0);
            if (Y11 == null) {
                return;
            }
            this.f31899D.f31945e = this.f31901F.g(Y11);
            int s03 = s0(Y11);
            View r22 = r2(Y11, (com.google.android.flexbox.b) this.f31921z.get(this.f31896A.mIndexToFlexLine[s03]));
            this.f31899D.f31948h = 1;
            int i13 = this.f31896A.mIndexToFlexLine[s03];
            if (i13 == -1) {
                i13 = 0;
            }
            if (i13 > 0) {
                this.f31899D.f31944d = s03 - ((com.google.android.flexbox.b) this.f31921z.get(i13 - 1)).b();
            } else {
                this.f31899D.f31944d = -1;
            }
            this.f31899D.f31943c = i13 > 0 ? i13 - 1 : 0;
            if (z10) {
                this.f31899D.f31945e = this.f31901F.d(r22);
                this.f31899D.f31946f = this.f31901F.d(r22) - this.f31901F.i();
                c cVar4 = this.f31899D;
                cVar4.f31946f = Math.max(cVar4.f31946f, 0);
            } else {
                this.f31899D.f31945e = this.f31901F.g(r22);
                this.f31899D.f31946f = (-this.f31901F.g(r22)) + this.f31901F.m();
            }
        }
        c cVar5 = this.f31899D;
        cVar5.f31941a = i11 - cVar5.f31946f;
    }

    public final void a3(b bVar, boolean z10, boolean z11) {
        if (z11) {
            P2();
        } else {
            this.f31899D.f31942b = false;
        }
        if (q() || !this.f31919x) {
            this.f31899D.f31941a = this.f31901F.i() - bVar.f31935c;
        } else {
            this.f31899D.f31941a = bVar.f31935c - getPaddingRight();
        }
        this.f31899D.f31944d = bVar.f31933a;
        this.f31899D.f31948h = 1;
        this.f31899D.f31949i = 1;
        this.f31899D.f31945e = bVar.f31935c;
        this.f31899D.f31946f = Integer.MIN_VALUE;
        this.f31899D.f31943c = bVar.f31934b;
        if (!z10 || this.f31921z.size() <= 1 || bVar.f31934b < 0 || bVar.f31934b >= this.f31921z.size() - 1) {
            return;
        }
        com.google.android.flexbox.b bVar2 = (com.google.android.flexbox.b) this.f31921z.get(bVar.f31934b);
        c.l(this.f31899D);
        c.u(this.f31899D, bVar2.b());
    }

    public final void b3(b bVar, boolean z10, boolean z11) {
        if (z11) {
            P2();
        } else {
            this.f31899D.f31942b = false;
        }
        if (q() || !this.f31919x) {
            this.f31899D.f31941a = bVar.f31935c - this.f31901F.m();
        } else {
            this.f31899D.f31941a = (this.f31911T.getWidth() - bVar.f31935c) - this.f31901F.m();
        }
        this.f31899D.f31944d = bVar.f31933a;
        this.f31899D.f31948h = 1;
        this.f31899D.f31949i = -1;
        this.f31899D.f31945e = bVar.f31935c;
        this.f31899D.f31946f = Integer.MIN_VALUE;
        this.f31899D.f31943c = bVar.f31934b;
        if (!z10 || bVar.f31934b <= 0 || this.f31921z.size() <= bVar.f31934b) {
            return;
        }
        com.google.android.flexbox.b bVar2 = (com.google.android.flexbox.b) this.f31921z.get(bVar.f31934b);
        c.m(this.f31899D);
        c.v(this.f31899D, bVar2.b());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.A.b
    public PointF c(int i10) {
        View Y10;
        if (Z() == 0 || (Y10 = Y(0)) == null) {
            return null;
        }
        int i11 = i10 < s0(Y10) ? -1 : 1;
        return q() ? new PointF(0.0f, i11) : new PointF(i11, 0.0f);
    }

    @Override // com.google.android.flexbox.a
    public void d(View view, int i10, int i11, com.google.android.flexbox.b bVar) {
        z(view, f31895X);
        if (q()) {
            int p02 = p0(view) + u0(view);
            bVar.f31955e += p02;
            bVar.f31956f += p02;
        } else {
            int x02 = x0(view) + X(view);
            bVar.f31955e += x02;
            bVar.f31956f += x02;
        }
    }

    @Override // com.google.android.flexbox.a
    public int e(int i10, int i11, int i12) {
        return RecyclerView.q.a0(z0(), A0(), i11, i12, A());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void e1(RecyclerView recyclerView, int i10, int i11) {
        super.e1(recyclerView, i10, i11);
        X2(i10);
    }

    @Override // com.google.android.flexbox.a
    public View g(int i10) {
        View view = (View) this.f31909P.get(i10);
        return view != null ? view : this.f31897B.o(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void g1(RecyclerView recyclerView, int i10, int i11, int i12) {
        super.g1(recyclerView, i10, i11, i12);
        X2(Math.min(i10, i11));
    }

    @Override // com.google.android.flexbox.a
    public int getAlignContent() {
        return 5;
    }

    @Override // com.google.android.flexbox.a
    public int getAlignItems() {
        return this.f31917v;
    }

    @Override // com.google.android.flexbox.a
    public int getFlexDirection() {
        return this.f31914s;
    }

    @Override // com.google.android.flexbox.a
    public int getFlexItemCount() {
        return this.f31898C.b();
    }

    @Override // com.google.android.flexbox.a
    public List getFlexLinesInternal() {
        return this.f31921z;
    }

    @Override // com.google.android.flexbox.a
    public int getFlexWrap() {
        return this.f31915t;
    }

    @Override // com.google.android.flexbox.a
    public int getLargestMainSize() {
        if (this.f31921z.size() == 0) {
            return 0;
        }
        int size = this.f31921z.size();
        int i10 = Integer.MIN_VALUE;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = Math.max(i10, ((com.google.android.flexbox.b) this.f31921z.get(i11)).f31955e);
        }
        return i10;
    }

    @Override // com.google.android.flexbox.a
    public int getMaxLine() {
        return this.f31918w;
    }

    @Override // com.google.android.flexbox.a
    public int getSumOfCrossSize() {
        int size = this.f31921z.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += ((com.google.android.flexbox.b) this.f31921z.get(i11)).f31957g;
        }
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void h1(RecyclerView recyclerView, int i10, int i11) {
        super.h1(recyclerView, i10, i11);
        X2(i10);
    }

    public final boolean h2(View view, int i10) {
        return (q() || !this.f31919x) ? this.f31901F.g(view) >= this.f31901F.h() - i10 : this.f31901F.d(view) <= i10;
    }

    @Override // com.google.android.flexbox.a
    public int i(int i10, int i11, int i12) {
        return RecyclerView.q.a0(m0(), n0(), i11, i12, B());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void i1(RecyclerView recyclerView, int i10, int i11) {
        super.i1(recyclerView, i10, i11);
        X2(i10);
    }

    public final boolean i2(View view, int i10) {
        return (q() || !this.f31919x) ? this.f31901F.d(view) <= i10 : this.f31901F.h() - this.f31901F.g(view) <= i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void j1(RecyclerView recyclerView, int i10, int i11, Object obj) {
        super.j1(recyclerView, i10, i11, obj);
        X2(i10);
    }

    public final void j2() {
        this.f31921z.clear();
        this.f31900E.t();
        this.f31900E.f31936d = 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void k1(RecyclerView.x xVar, RecyclerView.B b10) {
        int i10;
        int i11;
        this.f31897B = xVar;
        this.f31898C = b10;
        int b11 = b10.b();
        if (b11 == 0 && b10.e()) {
            return;
        }
        Q2();
        o2();
        n2();
        this.f31896A.t(b11);
        this.f31896A.u(b11);
        this.f31896A.s(b11);
        this.f31899D.f31950j = false;
        SavedState savedState = this.f31903H;
        if (savedState != null && savedState.g(b11)) {
            this.f31904I = this.f31903H.f31931a;
        }
        if (!this.f31900E.f31938f || this.f31904I != -1 || this.f31903H != null) {
            this.f31900E.t();
            W2(b10, this.f31900E);
            this.f31900E.f31938f = true;
        }
        M(xVar);
        if (this.f31900E.f31937e) {
            b3(this.f31900E, false, true);
        } else {
            a3(this.f31900E, false, true);
        }
        Y2(b11);
        p2(xVar, b10, this.f31899D);
        if (this.f31900E.f31937e) {
            i11 = this.f31899D.f31945e;
            a3(this.f31900E, true, false);
            p2(xVar, b10, this.f31899D);
            i10 = this.f31899D.f31945e;
        } else {
            i10 = this.f31899D.f31945e;
            b3(this.f31900E, true, false);
            p2(xVar, b10, this.f31899D);
            i11 = this.f31899D.f31945e;
        }
        if (Z() > 0) {
            if (this.f31900E.f31937e) {
                z2(i11 + y2(i10, xVar, b10, true), xVar, b10, false);
            } else {
                y2(i10 + z2(i11, xVar, b10, true), xVar, b10, false);
            }
        }
    }

    @Override // com.google.android.flexbox.a
    public int l(View view) {
        int p02;
        int u02;
        if (q()) {
            p02 = x0(view);
            u02 = X(view);
        } else {
            p02 = p0(view);
            u02 = u0(view);
        }
        return p02 + u02;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void l1(RecyclerView.B b10) {
        super.l1(b10);
        this.f31903H = null;
        this.f31904I = -1;
        this.f31905J = Integer.MIN_VALUE;
        this.f31912V = -1;
        this.f31900E.t();
        this.f31909P.clear();
    }

    @Override // com.google.android.flexbox.a
    public void m(com.google.android.flexbox.b bVar) {
    }

    @Override // com.google.android.flexbox.a
    public View n(int i10) {
        return g(i10);
    }

    @Override // com.google.android.flexbox.a
    public void o(int i10, View view) {
        this.f31909P.put(i10, view);
    }

    public final void o2() {
        if (this.f31901F != null) {
            return;
        }
        if (q()) {
            if (this.f31915t == 0) {
                this.f31901F = s.a(this);
                this.f31902G = s.c(this);
                return;
            } else {
                this.f31901F = s.c(this);
                this.f31902G = s.a(this);
                return;
            }
        }
        if (this.f31915t == 0) {
            this.f31901F = s.c(this);
            this.f31902G = s.a(this);
        } else {
            this.f31901F = s.a(this);
            this.f31902G = s.c(this);
        }
    }

    @Override // com.google.android.flexbox.a
    public int p(View view, int i10, int i11) {
        int x02;
        int X10;
        if (q()) {
            x02 = p0(view);
            X10 = u0(view);
        } else {
            x02 = x0(view);
            X10 = X(view);
        }
        return x02 + X10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void p1(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f31903H = (SavedState) parcelable;
            H1();
        }
    }

    public final int p2(RecyclerView.x xVar, RecyclerView.B b10, c cVar) {
        if (cVar.f31946f != Integer.MIN_VALUE) {
            if (cVar.f31941a < 0) {
                c.q(cVar, cVar.f31941a);
            }
            L2(xVar, cVar);
        }
        int i10 = cVar.f31941a;
        int i11 = cVar.f31941a;
        boolean q10 = q();
        int i12 = 0;
        while (true) {
            if ((i11 > 0 || this.f31899D.f31942b) && cVar.D(b10, this.f31921z)) {
                com.google.android.flexbox.b bVar = (com.google.android.flexbox.b) this.f31921z.get(cVar.f31943c);
                cVar.f31944d = bVar.f31965o;
                i12 += I2(bVar, cVar);
                if (q10 || !this.f31919x) {
                    c.c(cVar, bVar.a() * cVar.f31949i);
                } else {
                    c.d(cVar, bVar.a() * cVar.f31949i);
                }
                i11 -= bVar.a();
            }
        }
        c.i(cVar, i12);
        if (cVar.f31946f != Integer.MIN_VALUE) {
            c.q(cVar, i12);
            if (cVar.f31941a < 0) {
                c.q(cVar, cVar.f31941a);
            }
            L2(xVar, cVar);
        }
        return i10 - cVar.f31941a;
    }

    @Override // com.google.android.flexbox.a
    public boolean q() {
        int i10 = this.f31914s;
        return i10 == 0 || i10 == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public Parcelable q1() {
        if (this.f31903H != null) {
            return new SavedState(this.f31903H);
        }
        SavedState savedState = new SavedState();
        if (Z() <= 0) {
            savedState.h();
            return savedState;
        }
        View B22 = B2();
        savedState.f31931a = s0(B22);
        savedState.f31932b = this.f31901F.g(B22) - this.f31901F.m();
        return savedState;
    }

    public final View q2(int i10) {
        View x22 = x2(0, Z(), i10);
        if (x22 == null) {
            return null;
        }
        int i11 = this.f31896A.mIndexToFlexLine[s0(x22)];
        if (i11 == -1) {
            return null;
        }
        return r2(x22, (com.google.android.flexbox.b) this.f31921z.get(i11));
    }

    public final View r2(View view, com.google.android.flexbox.b bVar) {
        boolean q10 = q();
        int i10 = bVar.f31958h;
        for (int i11 = 1; i11 < i10; i11++) {
            View Y10 = Y(i11);
            if (Y10 != null && Y10.getVisibility() != 8) {
                if (!this.f31919x || q10) {
                    if (this.f31901F.g(view) <= this.f31901F.g(Y10)) {
                    }
                    view = Y10;
                } else {
                    if (this.f31901F.d(view) >= this.f31901F.d(Y10)) {
                    }
                    view = Y10;
                }
            }
        }
        return view;
    }

    public int s2() {
        View w22 = w2(0, Z(), false);
        if (w22 == null) {
            return -1;
        }
        return s0(w22);
    }

    @Override // com.google.android.flexbox.a
    public void setFlexLines(List list) {
        this.f31921z = list;
    }

    public final View t2(int i10) {
        View x22 = x2(Z() - 1, -1, i10);
        if (x22 == null) {
            return null;
        }
        return u2(x22, (com.google.android.flexbox.b) this.f31921z.get(this.f31896A.mIndexToFlexLine[s0(x22)]));
    }

    public final View u2(View view, com.google.android.flexbox.b bVar) {
        boolean q10 = q();
        int Z10 = (Z() - bVar.f31958h) - 1;
        for (int Z11 = Z() - 2; Z11 > Z10; Z11--) {
            View Y10 = Y(Z11);
            if (Y10 != null && Y10.getVisibility() != 8) {
                if (!this.f31919x || q10) {
                    if (this.f31901F.d(view) >= this.f31901F.d(Y10)) {
                    }
                    view = Y10;
                } else {
                    if (this.f31901F.g(view) <= this.f31901F.g(Y10)) {
                    }
                    view = Y10;
                }
            }
        }
        return view;
    }

    public int v2() {
        View w22 = w2(Z() - 1, -1, false);
        if (w22 == null) {
            return -1;
        }
        return s0(w22);
    }

    public final View w2(int i10, int i11, boolean z10) {
        int i12 = i11 > i10 ? 1 : -1;
        while (i10 != i11) {
            View Y10 = Y(i10);
            if (H2(Y10, z10)) {
                return Y10;
            }
            i10 += i12;
        }
        return null;
    }

    public final View x2(int i10, int i11, int i12) {
        int s02;
        o2();
        n2();
        int m10 = this.f31901F.m();
        int i13 = this.f31901F.i();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i10 != i11) {
            View Y10 = Y(i10);
            if (Y10 != null && (s02 = s0(Y10)) >= 0 && s02 < i12) {
                if (((RecyclerView.r) Y10.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = Y10;
                    }
                } else {
                    if (this.f31901F.g(Y10) >= m10 && this.f31901F.d(Y10) <= i13) {
                        return Y10;
                    }
                    if (view == null) {
                        view = Y10;
                    }
                }
            }
            i10 += i14;
        }
        return view != null ? view : view2;
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public int f31931a;

        /* renamed from: b, reason: collision with root package name */
        public int f31932b;

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

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final boolean g(int i10) {
            int i11 = this.f31931a;
            return i11 >= 0 && i11 < i10;
        }

        public final void h() {
            this.f31931a = -1;
        }

        public String toString() {
            return "SavedState{mAnchorPosition=" + this.f31931a + ", mAnchorOffset=" + this.f31932b + '}';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f31931a);
            parcel.writeInt(this.f31932b);
        }

        public SavedState() {
        }

        public SavedState(Parcel parcel) {
            this.f31931a = parcel.readInt();
            this.f31932b = parcel.readInt();
        }

        public SavedState(SavedState savedState) {
            this.f31931a = savedState.f31931a;
            this.f31932b = savedState.f31932b;
        }
    }

    public static class LayoutParams extends RecyclerView.r implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new a();

        /* renamed from: e, reason: collision with root package name */
        public float f31922e;

        /* renamed from: f, reason: collision with root package name */
        public float f31923f;

        /* renamed from: g, reason: collision with root package name */
        public int f31924g;

        /* renamed from: h, reason: collision with root package name */
        public float f31925h;

        /* renamed from: i, reason: collision with root package name */
        public int f31926i;

        /* renamed from: j, reason: collision with root package name */
        public int f31927j;

        /* renamed from: k, reason: collision with root package name */
        public int f31928k;

        /* renamed from: l, reason: collision with root package name */
        public int f31929l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f31930m;

        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public LayoutParams createFromParcel(Parcel parcel) {
                return new LayoutParams(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public LayoutParams[] newArray(int i10) {
                return new LayoutParams[i10];
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f31922e = 0.0f;
            this.f31923f = 1.0f;
            this.f31924g = -1;
            this.f31925h = -1.0f;
            this.f31928k = 16777215;
            this.f31929l = 16777215;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float A() {
            return this.f31925h;
        }

        @Override // com.google.android.flexbox.FlexItem
        public boolean B() {
            return this.f31930m;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int E() {
            return this.f31928k;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void I(int i10) {
            this.f31926i = i10;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int K() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int L() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int V() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int X() {
            return this.f31927j;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int b0() {
            return this.f31929l;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getOrder() {
            return 1;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int o() {
            return this.f31924g;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float p() {
            return this.f31923f;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int r() {
            return this.f31926i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int u() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void w(int i10) {
            this.f31927j = i10;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeFloat(this.f31922e);
            parcel.writeFloat(this.f31923f);
            parcel.writeInt(this.f31924g);
            parcel.writeFloat(this.f31925h);
            parcel.writeInt(this.f31926i);
            parcel.writeInt(this.f31927j);
            parcel.writeInt(this.f31928k);
            parcel.writeInt(this.f31929l);
            parcel.writeByte(this.f31930m ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        @Override // com.google.android.flexbox.FlexItem
        public float y() {
            return this.f31922e;
        }

        public LayoutParams(int i10, int i11) {
            super(i10, i11);
            this.f31922e = 0.0f;
            this.f31923f = 1.0f;
            this.f31924g = -1;
            this.f31925h = -1.0f;
            this.f31928k = 16777215;
            this.f31929l = 16777215;
        }

        public LayoutParams(Parcel parcel) {
            super(-2, -2);
            this.f31922e = 0.0f;
            this.f31923f = 1.0f;
            this.f31924g = -1;
            this.f31925h = -1.0f;
            this.f31928k = 16777215;
            this.f31929l = 16777215;
            this.f31922e = parcel.readFloat();
            this.f31923f = parcel.readFloat();
            this.f31924g = parcel.readInt();
            this.f31925h = parcel.readFloat();
            this.f31926i = parcel.readInt();
            this.f31927j = parcel.readInt();
            this.f31928k = parcel.readInt();
            this.f31929l = parcel.readInt();
            this.f31930m = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }
}
