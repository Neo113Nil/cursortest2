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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends k1 implements x1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f2283a;

    /* renamed from: b, reason: collision with root package name */
    public final n2[] f2284b;

    /* renamed from: c, reason: collision with root package name */
    public final q0 f2285c;

    /* renamed from: d, reason: collision with root package name */
    public final q0 f2286d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2287e;

    /* renamed from: f, reason: collision with root package name */
    public int f2288f;

    /* renamed from: g, reason: collision with root package name */
    public final h0 f2289g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2290h;
    public final BitSet j;

    /* renamed from: m, reason: collision with root package name */
    public final l2 f2294m;

    /* renamed from: n, reason: collision with root package name */
    public final int f2295n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2296o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2297p;
    public SavedState q;

    /* renamed from: r, reason: collision with root package name */
    public final Rect f2298r;

    /* renamed from: s, reason: collision with root package name */
    public final i2 f2299s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f2300t;

    /* renamed from: u, reason: collision with root package name */
    public int[] f2301u;

    /* renamed from: v, reason: collision with root package name */
    public final y f2302v;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2291i = false;

    /* renamed from: k, reason: collision with root package name */
    public int f2292k = -1;

    /* renamed from: l, reason: collision with root package name */
    public int f2293l = Integer.MIN_VALUE;

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new m2();

        /* renamed from: a, reason: collision with root package name */
        public int f2307a;

        /* renamed from: b, reason: collision with root package name */
        public int f2308b;

        /* renamed from: c, reason: collision with root package name */
        public int f2309c;

        /* renamed from: d, reason: collision with root package name */
        public int[] f2310d;

        /* renamed from: e, reason: collision with root package name */
        public int f2311e;

        /* renamed from: f, reason: collision with root package name */
        public int[] f2312f;

        /* renamed from: g, reason: collision with root package name */
        public ArrayList f2313g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f2314h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f2315i;
        public boolean j;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i5) {
            parcel.writeInt(this.f2307a);
            parcel.writeInt(this.f2308b);
            parcel.writeInt(this.f2309c);
            if (this.f2309c > 0) {
                parcel.writeIntArray(this.f2310d);
            }
            parcel.writeInt(this.f2311e);
            if (this.f2311e > 0) {
                parcel.writeIntArray(this.f2312f);
            }
            parcel.writeInt(this.f2314h ? 1 : 0);
            parcel.writeInt(this.f2315i ? 1 : 0);
            parcel.writeInt(this.j ? 1 : 0);
            parcel.writeList(this.f2313g);
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i5, int i10) {
        this.f2283a = -1;
        this.f2290h = false;
        l2 l2Var = new l2();
        this.f2294m = l2Var;
        this.f2295n = 2;
        this.f2298r = new Rect();
        this.f2299s = new i2(this);
        this.f2300t = true;
        this.f2302v = new y(1, this);
        j1 properties = k1.getProperties(context, attributeSet, i5, i10);
        int i11 = properties.f2444a;
        if (i11 != 0 && i11 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        assertNotInLayoutOrScroll(null);
        if (i11 != this.f2287e) {
            this.f2287e = i11;
            q0 q0Var = this.f2285c;
            this.f2285c = this.f2286d;
            this.f2286d = q0Var;
            requestLayout();
        }
        int i12 = properties.f2445b;
        assertNotInLayoutOrScroll(null);
        if (i12 != this.f2283a) {
            l2Var.a();
            requestLayout();
            this.f2283a = i12;
            this.j = new BitSet(this.f2283a);
            this.f2284b = new n2[this.f2283a];
            for (int i13 = 0; i13 < this.f2283a; i13++) {
                this.f2284b[i13] = new n2(this, i13);
            }
            requestLayout();
        }
        boolean z5 = properties.f2446c;
        assertNotInLayoutOrScroll(null);
        SavedState savedState = this.q;
        if (savedState != null && savedState.f2314h != z5) {
            savedState.f2314h = z5;
        }
        this.f2290h = z5;
        requestLayout();
        h0 h0Var = new h0();
        h0Var.f2409a = true;
        h0Var.f2414f = 0;
        h0Var.f2415g = 0;
        this.f2289g = h0Var;
        this.f2285c = q0.a(this, this.f2287e);
        this.f2286d = q0.a(this, 1 - this.f2287e);
    }

    public static int B(int i5, int i10, int i11) {
        int mode;
        return (!(i10 == 0 && i11 == 0) && ((mode = View.MeasureSpec.getMode(i5)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i5) - i10) - i11), mode) : i5;
    }

    public final void A(n2 n2Var, int i5, int i10) {
        int i11 = n2Var.f2489d;
        int i12 = n2Var.f2490e;
        if (i5 != -1) {
            int i13 = n2Var.f2488c;
            if (i13 == Integer.MIN_VALUE) {
                n2Var.a();
                i13 = n2Var.f2488c;
            }
            if (i13 - i11 >= i10) {
                this.j.set(i12, false);
                return;
            }
            return;
        }
        int i14 = n2Var.f2487b;
        if (i14 == Integer.MIN_VALUE) {
            View view = (View) n2Var.f2486a.get(0);
            j2 j2Var = (j2) view.getLayoutParams();
            n2Var.f2487b = n2Var.f2491f.f2285c.e(view);
            j2Var.getClass();
            i14 = n2Var.f2487b;
        }
        if (i14 + i11 <= i10) {
            this.j.set(i12, false);
        }
    }

    @Override // androidx.recyclerview.widget.k1
    public final void assertNotInLayoutOrScroll(String str) {
        if (this.q == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    @Override // androidx.recyclerview.widget.k1
    public final boolean canScrollHorizontally() {
        return this.f2287e == 0;
    }

    @Override // androidx.recyclerview.widget.k1
    public final boolean canScrollVertically() {
        return this.f2287e == 1;
    }

    @Override // androidx.recyclerview.widget.k1
    public final boolean checkLayoutParams(l1 l1Var) {
        return l1Var instanceof j2;
    }

    @Override // androidx.recyclerview.widget.k1
    public final void collectAdjacentPrefetchPositions(int i5, int i10, z1 z1Var, i1 i1Var) {
        h0 h0Var;
        int f6;
        int i11;
        if (this.f2287e != 0) {
            i5 = i10;
        }
        if (getChildCount() == 0 || i5 == 0) {
            return;
        }
        t(i5, z1Var);
        int[] iArr = this.f2301u;
        if (iArr == null || iArr.length < this.f2283a) {
            this.f2301u = new int[this.f2283a];
        }
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int i14 = this.f2283a;
            h0Var = this.f2289g;
            if (i12 >= i14) {
                break;
            }
            if (h0Var.f2412d == -1) {
                f6 = h0Var.f2414f;
                i11 = this.f2284b[i12].h(f6);
            } else {
                f6 = this.f2284b[i12].f(h0Var.f2415g);
                i11 = h0Var.f2415g;
            }
            int i15 = f6 - i11;
            if (i15 >= 0) {
                this.f2301u[i13] = i15;
                i13++;
            }
            i12++;
        }
        Arrays.sort(this.f2301u, 0, i13);
        for (int i16 = 0; i16 < i13; i16++) {
            int i17 = h0Var.f2411c;
            if (i17 < 0 || i17 >= z1Var.b()) {
                return;
            }
            ((d0) i1Var).a(h0Var.f2411c, this.f2301u[i16]);
            h0Var.f2411c += h0Var.f2412d;
        }
    }

    @Override // androidx.recyclerview.widget.k1
    public final int computeHorizontalScrollExtent(z1 z1Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z5 = !this.f2300t;
        return d.d(z1Var, this.f2285c, h(z5), g(z5), this, this.f2300t);
    }

    @Override // androidx.recyclerview.widget.k1
    public final int computeHorizontalScrollOffset(z1 z1Var) {
        return e(z1Var);
    }

    @Override // androidx.recyclerview.widget.k1
    public final int computeHorizontalScrollRange(z1 z1Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z5 = !this.f2300t;
        return d.f(z1Var, this.f2285c, h(z5), g(z5), this, this.f2300t);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0019, code lost:
    
        if ((r4 < k()) != r3.f2291i) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r3.f2291i != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
    
        r1 = 1;
     */
    @Override // androidx.recyclerview.widget.x1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PointF computeScrollVectorForPosition(int i5) {
        int i10 = -1;
        if (getChildCount() == 0) {
        }
        PointF pointF = new PointF();
        if (i10 == 0) {
            return null;
        }
        if (this.f2287e == 0) {
            pointF.x = i10;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = i10;
        return pointF;
    }

    @Override // androidx.recyclerview.widget.k1
    public final int computeVerticalScrollExtent(z1 z1Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z5 = !this.f2300t;
        return d.d(z1Var, this.f2285c, h(z5), g(z5), this, this.f2300t);
    }

    @Override // androidx.recyclerview.widget.k1
    public final int computeVerticalScrollOffset(z1 z1Var) {
        return e(z1Var);
    }

    @Override // androidx.recyclerview.widget.k1
    public final int computeVerticalScrollRange(z1 z1Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z5 = !this.f2300t;
        return d.f(z1Var, this.f2285c, h(z5), g(z5), this, this.f2300t);
    }

    public final boolean d() {
        int k6;
        if (getChildCount() != 0 && this.f2295n != 0 && isAttachedToWindow()) {
            if (this.f2291i) {
                k6 = l();
                k();
            } else {
                k6 = k();
                l();
            }
            if (k6 == 0 && p() != null) {
                this.f2294m.a();
                requestSimpleAnimationsInNextLayout();
                requestLayout();
                return true;
            }
        }
        return false;
    }

    public final int e(z1 z1Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z5 = !this.f2300t;
        return d.e(z1Var, this.f2285c, h(z5), g(z5), this, this.f2300t, this.f2291i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0282, code lost:
    
        r0.u(r21, r10);
     */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(s1 s1Var, h0 h0Var, z1 z1Var) {
        n2 n2Var;
        ?? r32;
        int h10;
        int c2;
        int k6;
        int c8;
        int i5;
        int i10;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this;
        int i11 = 0;
        int i12 = 1;
        staggeredGridLayoutManager.j.set(0, staggeredGridLayoutManager.f2283a, true);
        h0 h0Var2 = staggeredGridLayoutManager.f2289g;
        int i13 = h0Var2.f2417i ? h0Var.f2413e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : h0Var.f2413e == 1 ? h0Var.f2415g + h0Var.f2410b : h0Var.f2414f - h0Var.f2410b;
        int i14 = h0Var.f2413e;
        for (int i15 = 0; i15 < staggeredGridLayoutManager.f2283a; i15++) {
            if (!staggeredGridLayoutManager.f2284b[i15].f2486a.isEmpty()) {
                staggeredGridLayoutManager.A(staggeredGridLayoutManager.f2284b[i15], i14, i13);
            }
        }
        int g10 = staggeredGridLayoutManager.f2291i ? staggeredGridLayoutManager.f2285c.g() : staggeredGridLayoutManager.f2285c.k();
        boolean z5 = false;
        while (true) {
            int i16 = h0Var.f2411c;
            int i17 = -1;
            if (i16 < 0 || i16 >= z1Var.b() || (!h0Var2.f2417i && staggeredGridLayoutManager.j.isEmpty())) {
                break;
            }
            View d10 = s1Var.d(h0Var.f2411c);
            h0Var.f2411c += h0Var.f2412d;
            j2 j2Var = (j2) d10.getLayoutParams();
            int layoutPosition = j2Var.f2468a.getLayoutPosition();
            l2 l2Var = staggeredGridLayoutManager.f2294m;
            int[] iArr = (int[]) l2Var.f2472a;
            int i18 = (iArr == null || layoutPosition >= iArr.length) ? -1 : iArr[layoutPosition];
            if (i18 == -1) {
                if (staggeredGridLayoutManager.s(h0Var.f2413e)) {
                    i5 = staggeredGridLayoutManager.f2283a - i12;
                    i10 = -1;
                } else {
                    i17 = staggeredGridLayoutManager.f2283a;
                    i5 = i11;
                    i10 = i12;
                }
                n2 n2Var2 = null;
                if (h0Var.f2413e == i12) {
                    int k9 = staggeredGridLayoutManager.f2285c.k();
                    int i19 = Integer.MAX_VALUE;
                    while (i5 != i17) {
                        n2 n2Var3 = staggeredGridLayoutManager.f2284b[i5];
                        int i20 = i10;
                        int f6 = n2Var3.f(k9);
                        if (f6 < i19) {
                            n2Var2 = n2Var3;
                            i19 = f6;
                        }
                        i5 += i20;
                        i10 = i20;
                    }
                } else {
                    int i21 = i10;
                    int g11 = staggeredGridLayoutManager.f2285c.g();
                    int i22 = Integer.MIN_VALUE;
                    while (i5 != i17) {
                        n2 n2Var4 = staggeredGridLayoutManager.f2284b[i5];
                        int h11 = n2Var4.h(g11);
                        if (h11 > i22) {
                            n2Var2 = n2Var4;
                            i22 = h11;
                        }
                        i5 += i21;
                    }
                }
                n2Var = n2Var2;
                l2Var.b(layoutPosition);
                ((int[]) l2Var.f2472a)[layoutPosition] = n2Var.f2490e;
            } else {
                n2Var = staggeredGridLayoutManager.f2284b[i18];
            }
            n2 n2Var5 = n2Var;
            j2Var.f2448e = n2Var5;
            if (h0Var.f2413e == 1) {
                staggeredGridLayoutManager.addView(d10);
                r32 = 0;
            } else {
                r32 = 0;
                staggeredGridLayoutManager.addView(d10, 0);
            }
            if (staggeredGridLayoutManager.f2287e == 1) {
                staggeredGridLayoutManager.q(d10, k1.getChildMeasureSpec(staggeredGridLayoutManager.f2288f, staggeredGridLayoutManager.getWidthMode(), r32, ((ViewGroup.MarginLayoutParams) j2Var).width, r32), k1.getChildMeasureSpec(staggeredGridLayoutManager.getHeight(), staggeredGridLayoutManager.getHeightMode(), staggeredGridLayoutManager.getPaddingBottom() + staggeredGridLayoutManager.getPaddingTop(), ((ViewGroup.MarginLayoutParams) j2Var).height, true));
            } else {
                staggeredGridLayoutManager.q(d10, k1.getChildMeasureSpec(staggeredGridLayoutManager.getWidth(), staggeredGridLayoutManager.getWidthMode(), staggeredGridLayoutManager.getPaddingRight() + staggeredGridLayoutManager.getPaddingLeft(), ((ViewGroup.MarginLayoutParams) j2Var).width, true), k1.getChildMeasureSpec(staggeredGridLayoutManager.f2288f, staggeredGridLayoutManager.getHeightMode(), 0, ((ViewGroup.MarginLayoutParams) j2Var).height, false));
            }
            if (h0Var.f2413e == 1) {
                c2 = n2Var5.f(g10);
                h10 = staggeredGridLayoutManager.f2285c.c(d10) + c2;
            } else {
                h10 = n2Var5.h(g10);
                c2 = h10 - staggeredGridLayoutManager.f2285c.c(d10);
            }
            if (h0Var.f2413e == 1) {
                n2 n2Var6 = j2Var.f2448e;
                n2Var6.getClass();
                j2 j2Var2 = (j2) d10.getLayoutParams();
                j2Var2.f2448e = n2Var6;
                ArrayList arrayList = n2Var6.f2486a;
                arrayList.add(d10);
                n2Var6.f2488c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    n2Var6.f2487b = Integer.MIN_VALUE;
                }
                if (j2Var2.f2468a.isRemoved() || j2Var2.f2468a.isUpdated()) {
                    n2Var6.f2489d = n2Var6.f2491f.f2285c.c(d10) + n2Var6.f2489d;
                }
            } else {
                n2 n2Var7 = j2Var.f2448e;
                n2Var7.getClass();
                j2 j2Var3 = (j2) d10.getLayoutParams();
                j2Var3.f2448e = n2Var7;
                ArrayList arrayList2 = n2Var7.f2486a;
                arrayList2.add(0, d10);
                n2Var7.f2487b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    n2Var7.f2488c = Integer.MIN_VALUE;
                }
                if (j2Var3.f2468a.isRemoved() || j2Var3.f2468a.isUpdated()) {
                    n2Var7.f2489d = n2Var7.f2491f.f2285c.c(d10) + n2Var7.f2489d;
                }
            }
            if (staggeredGridLayoutManager.isLayoutRTL() && staggeredGridLayoutManager.f2287e == 1) {
                c8 = staggeredGridLayoutManager.f2286d.g() - (((staggeredGridLayoutManager.f2283a - 1) - n2Var5.f2490e) * staggeredGridLayoutManager.f2288f);
                k6 = c8 - staggeredGridLayoutManager.f2286d.c(d10);
            } else {
                k6 = staggeredGridLayoutManager.f2286d.k() + (n2Var5.f2490e * staggeredGridLayoutManager.f2288f);
                c8 = staggeredGridLayoutManager.f2286d.c(d10) + k6;
            }
            int i23 = k6;
            int i24 = c8;
            if (staggeredGridLayoutManager.f2287e == 1) {
                staggeredGridLayoutManager.layoutDecoratedWithMargins(d10, i23, c2, i24, h10);
                staggeredGridLayoutManager = this;
            } else {
                staggeredGridLayoutManager.layoutDecoratedWithMargins(d10, c2, i23, h10, i24);
            }
            staggeredGridLayoutManager.A(n2Var5, h0Var2.f2413e, i13);
            staggeredGridLayoutManager.u(s1Var, h0Var2);
            if (h0Var2.f2416h && d10.hasFocusable()) {
                staggeredGridLayoutManager.j.set(n2Var5.f2490e, false);
            }
            z5 = true;
            i12 = 1;
            i11 = 0;
        }
        int k10 = h0Var2.f2413e == -1 ? staggeredGridLayoutManager.f2285c.k() - staggeredGridLayoutManager.n(staggeredGridLayoutManager.f2285c.k()) : staggeredGridLayoutManager.m(staggeredGridLayoutManager.f2285c.g()) - staggeredGridLayoutManager.f2285c.g();
        if (k10 > 0) {
            return Math.min(h0Var.f2410b, k10);
        }
        return 0;
    }

    public final View g(boolean z5) {
        int k6 = this.f2285c.k();
        int g10 = this.f2285c.g();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int e7 = this.f2285c.e(childAt);
            int b10 = this.f2285c.b(childAt);
            if (b10 > k6 && e7 < g10) {
                if (b10 <= g10 || !z5) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.k1
    public final l1 generateDefaultLayoutParams() {
        return this.f2287e == 0 ? new j2(-2, -1) : new j2(-1, -2);
    }

    @Override // androidx.recyclerview.widget.k1
    public final l1 generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new j2(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.k1
    public final int getColumnCountForAccessibility(s1 s1Var, z1 z1Var) {
        if (this.f2287e == 1) {
            return Math.min(this.f2283a, z1Var.b());
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.k1
    public final int getRowCountForAccessibility(s1 s1Var, z1 z1Var) {
        if (this.f2287e == 0) {
            return Math.min(this.f2283a, z1Var.b());
        }
        return -1;
    }

    public final View h(boolean z5) {
        int k6 = this.f2285c.k();
        int g10 = this.f2285c.g();
        int childCount = getChildCount();
        View view = null;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            int e7 = this.f2285c.e(childAt);
            if (this.f2285c.b(childAt) > k6 && e7 < g10) {
                if (e7 >= k6 || !z5) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    public final void i(s1 s1Var, z1 z1Var, boolean z5) {
        int g10;
        int m6 = m(Integer.MIN_VALUE);
        if (m6 != Integer.MIN_VALUE && (g10 = this.f2285c.g() - m6) > 0) {
            int i5 = g10 - (-scrollBy(-g10, s1Var, z1Var));
            if (!z5 || i5 <= 0) {
                return;
            }
            this.f2285c.o(i5);
        }
    }

    @Override // androidx.recyclerview.widget.k1
    public final boolean isAutoMeasureEnabled() {
        return this.f2295n != 0;
    }

    public final boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.k1
    public final boolean isLayoutReversed() {
        return this.f2290h;
    }

    public final void j(s1 s1Var, z1 z1Var, boolean z5) {
        int k6;
        int n9 = n(Integer.MAX_VALUE);
        if (n9 != Integer.MAX_VALUE && (k6 = n9 - this.f2285c.k()) > 0) {
            int scrollBy = k6 - scrollBy(k6, s1Var, z1Var);
            if (!z5 || scrollBy <= 0) {
                return;
            }
            this.f2285c.o(-scrollBy);
        }
    }

    public final int k() {
        if (getChildCount() == 0) {
            return 0;
        }
        return getPosition(getChildAt(0));
    }

    public final int l() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return getPosition(getChildAt(childCount - 1));
    }

    public final int m(int i5) {
        int f6 = this.f2284b[0].f(i5);
        for (int i10 = 1; i10 < this.f2283a; i10++) {
            int f10 = this.f2284b[i10].f(i5);
            if (f10 > f6) {
                f6 = f10;
            }
        }
        return f6;
    }

    public final int n(int i5) {
        int h10 = this.f2284b[0].h(i5);
        for (int i10 = 1; i10 < this.f2283a; i10++) {
            int h11 = this.f2284b[i10].h(i5);
            if (h11 < h10) {
                h10 = h11;
            }
        }
        return h10;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(int i5, int i10, int i11) {
        int i12;
        int i13;
        l2 l2Var;
        int[] iArr;
        ArrayList arrayList;
        StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
        int i14;
        int l6 = this.f2291i ? l() : k();
        if (i11 != 8) {
            i12 = i5 + i10;
        } else {
            if (i5 >= i10) {
                i12 = i5 + 1;
                i13 = i10;
                l2Var = this.f2294m;
                iArr = (int[]) l2Var.f2472a;
                if (iArr != null && i13 < iArr.length) {
                    arrayList = (ArrayList) l2Var.f2473b;
                    if (arrayList != null) {
                        if (arrayList != null) {
                            for (int size = arrayList.size() - 1; size >= 0; size--) {
                                staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) ((ArrayList) l2Var.f2473b).get(size);
                                if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f2303a == i13) {
                                    break;
                                }
                            }
                        }
                        staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = null;
                        if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem != null) {
                            ((ArrayList) l2Var.f2473b).remove(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem);
                        }
                        int size2 = ((ArrayList) l2Var.f2473b).size();
                        int i15 = 0;
                        while (true) {
                            if (i15 >= size2) {
                                i15 = -1;
                                break;
                            } else if (((StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) ((ArrayList) l2Var.f2473b).get(i15)).f2303a >= i13) {
                                break;
                            } else {
                                i15++;
                            }
                        }
                        if (i15 != -1) {
                            StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2 = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) ((ArrayList) l2Var.f2473b).get(i15);
                            ((ArrayList) l2Var.f2473b).remove(i15);
                            i14 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2.f2303a;
                            if (i14 == -1) {
                                int[] iArr2 = (int[]) l2Var.f2472a;
                                Arrays.fill(iArr2, i13, iArr2.length, -1);
                                int length = ((int[]) l2Var.f2472a).length;
                            } else {
                                Arrays.fill((int[]) l2Var.f2472a, i13, Math.min(i14 + 1, ((int[]) l2Var.f2472a).length), -1);
                            }
                        }
                    }
                    i14 = -1;
                    if (i14 == -1) {
                    }
                }
                if (i11 != 1) {
                    l2Var.e(i5, i10);
                } else if (i11 == 2) {
                    l2Var.f(i5, i10);
                } else if (i11 == 8) {
                    l2Var.f(i5, 1);
                    l2Var.e(i10, 1);
                }
                if (i12 > l6) {
                    return;
                }
                if (i13 <= (this.f2291i ? k() : l())) {
                    requestLayout();
                    return;
                }
                return;
            }
            i12 = i10 + 1;
        }
        i13 = i5;
        l2Var = this.f2294m;
        iArr = (int[]) l2Var.f2472a;
        if (iArr != null) {
            arrayList = (ArrayList) l2Var.f2473b;
            if (arrayList != null) {
            }
            i14 = -1;
            if (i14 == -1) {
            }
        }
        if (i11 != 1) {
        }
        if (i12 > l6) {
        }
    }

    @Override // androidx.recyclerview.widget.k1
    public final void offsetChildrenHorizontal(int i5) {
        super.offsetChildrenHorizontal(i5);
        for (int i10 = 0; i10 < this.f2283a; i10++) {
            n2 n2Var = this.f2284b[i10];
            int i11 = n2Var.f2487b;
            if (i11 != Integer.MIN_VALUE) {
                n2Var.f2487b = i11 + i5;
            }
            int i12 = n2Var.f2488c;
            if (i12 != Integer.MIN_VALUE) {
                n2Var.f2488c = i12 + i5;
            }
        }
    }

    @Override // androidx.recyclerview.widget.k1
    public final void offsetChildrenVertical(int i5) {
        super.offsetChildrenVertical(i5);
        for (int i10 = 0; i10 < this.f2283a; i10++) {
            n2 n2Var = this.f2284b[i10];
            int i11 = n2Var.f2487b;
            if (i11 != Integer.MIN_VALUE) {
                n2Var.f2487b = i11 + i5;
            }
            int i12 = n2Var.f2488c;
            if (i12 != Integer.MIN_VALUE) {
                n2Var.f2488c = i12 + i5;
            }
        }
    }

    @Override // androidx.recyclerview.widget.k1
    public final void onAdapterChanged(x0 x0Var, x0 x0Var2) {
        this.f2294m.a();
        for (int i5 = 0; i5 < this.f2283a; i5++) {
            this.f2284b[i5].b();
        }
    }

    @Override // androidx.recyclerview.widget.k1
    public final void onDetachedFromWindow(RecyclerView recyclerView, s1 s1Var) {
        onDetachedFromWindow(recyclerView);
        removeCallbacks(this.f2302v);
        for (int i5 = 0; i5 < this.f2283a; i5++) {
            this.f2284b[i5].b();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x003a, code lost:
    
        if (r8.f2287e == 1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0040, code lost:
    
        if (r8.f2287e == 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x004c, code lost:
    
        if (isLayoutRTL() == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0058, code lost:
    
        if (isLayoutRTL() == false) goto L29;
     */
    @Override // androidx.recyclerview.widget.k1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View onFocusSearchFailed(View view, int i5, s1 s1Var, z1 z1Var) {
        View findContainingItemView;
        int i10;
        if (getChildCount() == 0 || (findContainingItemView = findContainingItemView(view)) == null) {
            return null;
        }
        x();
        if (i5 == 1) {
            if (this.f2287e != 1) {
            }
            i10 = -1;
        } else if (i5 == 2) {
            if (this.f2287e != 1) {
            }
            i10 = 1;
        } else if (i5 != 17) {
            if (i5 != 33) {
                if (i5 == 66) {
                }
            }
            i10 = Integer.MIN_VALUE;
        }
        if (i10 == Integer.MIN_VALUE) {
            return null;
        }
        j2 j2Var = (j2) findContainingItemView.getLayoutParams();
        j2Var.getClass();
        n2 n2Var = j2Var.f2448e;
        int l6 = i10 == 1 ? l() : k();
        z(l6, z1Var);
        y(i10);
        h0 h0Var = this.f2289g;
        h0Var.f2411c = h0Var.f2412d + l6;
        h0Var.f2410b = (int) (this.f2285c.l() * 0.33333334f);
        h0Var.f2416h = true;
        h0Var.f2409a = false;
        f(s1Var, h0Var, z1Var);
        this.f2296o = this.f2291i;
        View g10 = n2Var.g(l6, i10);
        if (g10 != null && g10 != findContainingItemView) {
            return g10;
        }
        if (s(i10)) {
            for (int i11 = this.f2283a - 1; i11 >= 0; i11--) {
                View g11 = this.f2284b[i11].g(l6, i10);
                if (g11 != null && g11 != findContainingItemView) {
                    return g11;
                }
            }
        } else {
            for (int i12 = 0; i12 < this.f2283a; i12++) {
                View g12 = this.f2284b[i12].g(l6, i10);
                if (g12 != null && g12 != findContainingItemView) {
                    return g12;
                }
            }
        }
        boolean z5 = (this.f2290h ^ true) == (i10 == -1);
        View findViewByPosition = findViewByPosition(z5 ? n2Var.c() : n2Var.d());
        if (findViewByPosition != null && findViewByPosition != findContainingItemView) {
            return findViewByPosition;
        }
        if (s(i10)) {
            for (int i13 = this.f2283a - 1; i13 >= 0; i13--) {
                if (i13 != n2Var.f2490e) {
                    View findViewByPosition2 = findViewByPosition(z5 ? this.f2284b[i13].c() : this.f2284b[i13].d());
                    if (findViewByPosition2 != null && findViewByPosition2 != findContainingItemView) {
                        return findViewByPosition2;
                    }
                }
            }
        } else {
            for (int i14 = 0; i14 < this.f2283a; i14++) {
                View findViewByPosition3 = findViewByPosition(z5 ? this.f2284b[i14].c() : this.f2284b[i14].d());
                if (findViewByPosition3 != null && findViewByPosition3 != findContainingItemView) {
                    return findViewByPosition3;
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.k1
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            View h10 = h(false);
            View g10 = g(false);
            if (h10 == null || g10 == null) {
                return;
            }
            int position = getPosition(h10);
            int position2 = getPosition(g10);
            if (position < position2) {
                accessibilityEvent.setFromIndex(position);
                accessibilityEvent.setToIndex(position2);
            } else {
                accessibilityEvent.setFromIndex(position2);
                accessibilityEvent.setToIndex(position);
            }
        }
    }

    @Override // androidx.recyclerview.widget.k1
    public final void onInitializeAccessibilityNodeInfo(s1 s1Var, z1 z1Var, q0.c cVar) {
        super.onInitializeAccessibilityNodeInfo(s1Var, z1Var, cVar);
        cVar.j("androidx.recyclerview.widget.StaggeredGridLayoutManager");
    }

    @Override // androidx.recyclerview.widget.k1
    public final void onInitializeAccessibilityNodeInfoForItem(s1 s1Var, z1 z1Var, View view, q0.c cVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof j2)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, cVar);
            return;
        }
        j2 j2Var = (j2) layoutParams;
        if (this.f2287e == 0) {
            n2 n2Var = j2Var.f2448e;
            cVar.k(c4.k.a(n2Var != null ? n2Var.f2490e : -1, 1, -1, -1, false, false));
        } else {
            n2 n2Var2 = j2Var.f2448e;
            cVar.k(c4.k.a(-1, -1, n2Var2 != null ? n2Var2.f2490e : -1, 1, false, false));
        }
    }

    @Override // androidx.recyclerview.widget.k1
    public final void onItemsAdded(RecyclerView recyclerView, int i5, int i10) {
        o(i5, i10, 1);
    }

    @Override // androidx.recyclerview.widget.k1
    public final void onItemsChanged(RecyclerView recyclerView) {
        this.f2294m.a();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.k1
    public final void onItemsMoved(RecyclerView recyclerView, int i5, int i10, int i11) {
        o(i5, i10, 8);
    }

    @Override // androidx.recyclerview.widget.k1
    public final void onItemsRemoved(RecyclerView recyclerView, int i5, int i10) {
        o(i5, i10, 2);
    }

    @Override // androidx.recyclerview.widget.k1
    public final void onItemsUpdated(RecyclerView recyclerView, int i5, int i10, Object obj) {
        o(i5, i10, 4);
    }

    @Override // androidx.recyclerview.widget.k1
    public final void onLayoutChildren(s1 s1Var, z1 z1Var) {
        r(s1Var, z1Var, true);
    }

    @Override // androidx.recyclerview.widget.k1
    public final void onLayoutCompleted(z1 z1Var) {
        this.f2292k = -1;
        this.f2293l = Integer.MIN_VALUE;
        this.q = null;
        this.f2299s.a();
    }

    @Override // androidx.recyclerview.widget.k1
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.q = savedState;
            if (this.f2292k != -1) {
                savedState.f2307a = -1;
                savedState.f2308b = -1;
                savedState.f2310d = null;
                savedState.f2309c = 0;
                savedState.f2311e = 0;
                savedState.f2312f = null;
                savedState.f2313g = null;
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.k1
    public final Parcelable onSaveInstanceState() {
        int h10;
        int k6;
        int[] iArr;
        SavedState savedState = this.q;
        if (savedState != null) {
            SavedState savedState2 = new SavedState();
            savedState2.f2309c = savedState.f2309c;
            savedState2.f2307a = savedState.f2307a;
            savedState2.f2308b = savedState.f2308b;
            savedState2.f2310d = savedState.f2310d;
            savedState2.f2311e = savedState.f2311e;
            savedState2.f2312f = savedState.f2312f;
            savedState2.f2314h = savedState.f2314h;
            savedState2.f2315i = savedState.f2315i;
            savedState2.j = savedState.j;
            savedState2.f2313g = savedState.f2313g;
            return savedState2;
        }
        SavedState savedState3 = new SavedState();
        savedState3.f2314h = this.f2290h;
        savedState3.f2315i = this.f2296o;
        savedState3.j = this.f2297p;
        l2 l2Var = this.f2294m;
        if (l2Var == null || (iArr = (int[]) l2Var.f2472a) == null) {
            savedState3.f2311e = 0;
        } else {
            savedState3.f2312f = iArr;
            savedState3.f2311e = iArr.length;
            savedState3.f2313g = (ArrayList) l2Var.f2473b;
        }
        if (getChildCount() <= 0) {
            savedState3.f2307a = -1;
            savedState3.f2308b = -1;
            savedState3.f2309c = 0;
            return savedState3;
        }
        savedState3.f2307a = this.f2296o ? l() : k();
        View g10 = this.f2291i ? g(true) : h(true);
        savedState3.f2308b = g10 != null ? getPosition(g10) : -1;
        int i5 = this.f2283a;
        savedState3.f2309c = i5;
        savedState3.f2310d = new int[i5];
        for (int i10 = 0; i10 < this.f2283a; i10++) {
            if (this.f2296o) {
                h10 = this.f2284b[i10].f(Integer.MIN_VALUE);
                if (h10 != Integer.MIN_VALUE) {
                    k6 = this.f2285c.g();
                    h10 -= k6;
                    savedState3.f2310d[i10] = h10;
                } else {
                    savedState3.f2310d[i10] = h10;
                }
            } else {
                h10 = this.f2284b[i10].h(Integer.MIN_VALUE);
                if (h10 != Integer.MIN_VALUE) {
                    k6 = this.f2285c.k();
                    h10 -= k6;
                    savedState3.f2310d[i10] = h10;
                } else {
                    savedState3.f2310d[i10] = h10;
                }
            }
        }
        return savedState3;
    }

    @Override // androidx.recyclerview.widget.k1
    public final void onScrollStateChanged(int i5) {
        if (i5 == 0) {
            d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x002c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View p() {
        int childCount = getChildCount();
        int i5 = childCount - 1;
        BitSet bitSet = new BitSet(this.f2283a);
        bitSet.set(0, this.f2283a, true);
        char c2 = (this.f2287e == 1 && isLayoutRTL()) ? (char) 1 : (char) 65535;
        if (this.f2291i) {
            childCount = -1;
        } else {
            i5 = 0;
        }
        int i10 = i5 < childCount ? 1 : -1;
        while (i5 != childCount) {
            View childAt = getChildAt(i5);
            j2 j2Var = (j2) childAt.getLayoutParams();
            if (bitSet.get(j2Var.f2448e.f2490e)) {
                n2 n2Var = j2Var.f2448e;
                if (this.f2291i) {
                    int i11 = n2Var.f2488c;
                    if (i11 == Integer.MIN_VALUE) {
                        n2Var.a();
                        i11 = n2Var.f2488c;
                    }
                    if (i11 < this.f2285c.g()) {
                        ArrayList arrayList = n2Var.f2486a;
                        ((j2) ((View) arrayList.get(arrayList.size() - 1)).getLayoutParams()).getClass();
                        return childAt;
                    }
                } else {
                    int i12 = n2Var.f2487b;
                    ArrayList arrayList2 = n2Var.f2486a;
                    if (i12 == Integer.MIN_VALUE) {
                        View view = (View) arrayList2.get(0);
                        j2 j2Var2 = (j2) view.getLayoutParams();
                        n2Var.f2487b = n2Var.f2491f.f2285c.e(view);
                        j2Var2.getClass();
                        i12 = n2Var.f2487b;
                    }
                    if (i12 > this.f2285c.k()) {
                        ((j2) ((View) arrayList2.get(0)).getLayoutParams()).getClass();
                        return childAt;
                    }
                }
                bitSet.clear(j2Var.f2448e.f2490e);
            }
            i5 += i10;
            if (i5 != childCount) {
                View childAt2 = getChildAt(i5);
                if (this.f2291i) {
                    int b10 = this.f2285c.b(childAt);
                    int b11 = this.f2285c.b(childAt2);
                    if (b10 < b11) {
                        return childAt;
                    }
                    if (b10 == b11) {
                        if ((j2Var.f2448e.f2490e - ((j2) childAt2.getLayoutParams()).f2448e.f2490e >= 0) == (c2 >= 0)) {
                            return childAt;
                        }
                    } else {
                        continue;
                    }
                } else {
                    int e7 = this.f2285c.e(childAt);
                    int e9 = this.f2285c.e(childAt2);
                    if (e7 > e9) {
                        return childAt;
                    }
                    if (e7 == e9) {
                        if ((j2Var.f2448e.f2490e - ((j2) childAt2.getLayoutParams()).f2448e.f2490e >= 0) == (c2 >= 0)) {
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    public final void q(View view, int i5, int i10) {
        Rect rect = this.f2298r;
        calculateItemDecorationsForChild(view, rect);
        j2 j2Var = (j2) view.getLayoutParams();
        int B = B(i5, ((ViewGroup.MarginLayoutParams) j2Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) j2Var).rightMargin + rect.right);
        int B2 = B(i10, ((ViewGroup.MarginLayoutParams) j2Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) j2Var).bottomMargin + rect.bottom);
        if (shouldMeasureChild(view, B, B2, j2Var)) {
            view.measure(B, B2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01aa, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01a6, code lost:
    
        if ((r11 < k()) != r16.f2291i) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0410, code lost:
    
        if (d() != false) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0198, code lost:
    
        if (r16.f2291i != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a8, code lost:
    
        r11 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(s1 s1Var, z1 z1Var, boolean z5) {
        SavedState savedState;
        int i5;
        int i10;
        boolean z7;
        SavedState savedState2 = this.q;
        i2 i2Var = this.f2299s;
        if (!(savedState2 == null && this.f2292k == -1) && z1Var.b() == 0) {
            removeAndRecycleAllViews(s1Var);
            i2Var.a();
            return;
        }
        boolean z10 = i2Var.f2434e;
        StaggeredGridLayoutManager staggeredGridLayoutManager = i2Var.f2436g;
        boolean z11 = true;
        boolean z12 = (z10 && this.f2292k == -1 && this.q == null) ? false : true;
        l2 l2Var = this.f2294m;
        if (z12) {
            i2Var.a();
            SavedState savedState3 = this.q;
            if (savedState3 != null) {
                int i11 = savedState3.f2309c;
                if (i11 > 0) {
                    if (i11 == this.f2283a) {
                        for (int i12 = 0; i12 < this.f2283a; i12++) {
                            this.f2284b[i12].b();
                            SavedState savedState4 = this.q;
                            int i13 = savedState4.f2310d[i12];
                            if (i13 != Integer.MIN_VALUE) {
                                i13 += savedState4.f2315i ? this.f2285c.g() : this.f2285c.k();
                            }
                            n2 n2Var = this.f2284b[i12];
                            n2Var.f2487b = i13;
                            n2Var.f2488c = i13;
                        }
                    } else {
                        savedState3.f2310d = null;
                        savedState3.f2309c = 0;
                        savedState3.f2311e = 0;
                        savedState3.f2312f = null;
                        savedState3.f2313g = null;
                        savedState3.f2307a = savedState3.f2308b;
                    }
                }
                SavedState savedState5 = this.q;
                this.f2297p = savedState5.j;
                boolean z13 = savedState5.f2314h;
                assertNotInLayoutOrScroll(null);
                SavedState savedState6 = this.q;
                if (savedState6 != null && savedState6.f2314h != z13) {
                    savedState6.f2314h = z13;
                }
                this.f2290h = z13;
                requestLayout();
                x();
                SavedState savedState7 = this.q;
                int i14 = savedState7.f2307a;
                if (i14 != -1) {
                    this.f2292k = i14;
                    i2Var.f2432c = savedState7.f2315i;
                } else {
                    i2Var.f2432c = this.f2291i;
                }
                if (savedState7.f2311e > 1) {
                    l2Var.f2472a = savedState7.f2312f;
                    l2Var.f2473b = savedState7.f2313g;
                }
            } else {
                x();
                i2Var.f2432c = this.f2291i;
            }
            if (!z1Var.f2601g && (i10 = this.f2292k) != -1) {
                if (i10 < 0 || i10 >= z1Var.b()) {
                    this.f2292k = -1;
                    this.f2293l = Integer.MIN_VALUE;
                } else {
                    SavedState savedState8 = this.q;
                    if (savedState8 == null || savedState8.f2307a == -1 || savedState8.f2309c < 1) {
                        View findViewByPosition = findViewByPosition(this.f2292k);
                        if (findViewByPosition != null) {
                            i2Var.f2430a = this.f2291i ? l() : k();
                            if (this.f2293l != Integer.MIN_VALUE) {
                                if (i2Var.f2432c) {
                                    i2Var.f2431b = (this.f2285c.g() - this.f2293l) - this.f2285c.b(findViewByPosition);
                                } else {
                                    i2Var.f2431b = (this.f2285c.k() + this.f2293l) - this.f2285c.e(findViewByPosition);
                                }
                            } else if (this.f2285c.c(findViewByPosition) > this.f2285c.l()) {
                                i2Var.f2431b = i2Var.f2432c ? this.f2285c.g() : this.f2285c.k();
                            } else {
                                int e7 = this.f2285c.e(findViewByPosition) - this.f2285c.k();
                                if (e7 < 0) {
                                    i2Var.f2431b = -e7;
                                } else {
                                    int g10 = this.f2285c.g() - this.f2285c.b(findViewByPosition);
                                    if (g10 < 0) {
                                        i2Var.f2431b = g10;
                                    } else {
                                        i2Var.f2431b = Integer.MIN_VALUE;
                                    }
                                }
                            }
                        } else {
                            int i15 = this.f2292k;
                            i2Var.f2430a = i15;
                            int i16 = this.f2293l;
                            if (i16 == Integer.MIN_VALUE) {
                                if (getChildCount() == 0) {
                                }
                                i2Var.f2432c = z7;
                                i2Var.f2431b = z7 ? staggeredGridLayoutManager.f2285c.g() : staggeredGridLayoutManager.f2285c.k();
                            } else if (i2Var.f2432c) {
                                i2Var.f2431b = staggeredGridLayoutManager.f2285c.g() - i16;
                            } else {
                                i2Var.f2431b = staggeredGridLayoutManager.f2285c.k() + i16;
                            }
                            i2Var.f2433d = true;
                        }
                    } else {
                        i2Var.f2431b = Integer.MIN_VALUE;
                        i2Var.f2430a = this.f2292k;
                    }
                    i2Var.f2434e = true;
                }
            }
            if (this.f2296o) {
                int b10 = z1Var.b();
                for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                    i5 = getPosition(getChildAt(childCount));
                    if (i5 >= 0 && i5 < b10) {
                        break;
                    }
                }
                i5 = 0;
                i2Var.f2430a = i5;
                i2Var.f2431b = Integer.MIN_VALUE;
                i2Var.f2434e = true;
            } else {
                int b11 = z1Var.b();
                int childCount2 = getChildCount();
                for (int i17 = 0; i17 < childCount2; i17++) {
                    int position = getPosition(getChildAt(i17));
                    if (position >= 0 && position < b11) {
                        i5 = position;
                        break;
                    }
                }
                i5 = 0;
                i2Var.f2430a = i5;
                i2Var.f2431b = Integer.MIN_VALUE;
                i2Var.f2434e = true;
            }
        }
        if (this.q == null && this.f2292k == -1 && (i2Var.f2432c != this.f2296o || isLayoutRTL() != this.f2297p)) {
            l2Var.a();
            i2Var.f2433d = true;
        }
        if (getChildCount() > 0 && ((savedState = this.q) == null || savedState.f2309c < 1)) {
            if (i2Var.f2433d) {
                for (int i18 = 0; i18 < this.f2283a; i18++) {
                    this.f2284b[i18].b();
                    int i19 = i2Var.f2431b;
                    if (i19 != Integer.MIN_VALUE) {
                        n2 n2Var2 = this.f2284b[i18];
                        n2Var2.f2487b = i19;
                        n2Var2.f2488c = i19;
                    }
                }
            } else if (z12 || i2Var.f2435f == null) {
                for (int i20 = 0; i20 < this.f2283a; i20++) {
                    n2 n2Var3 = this.f2284b[i20];
                    boolean z14 = this.f2291i;
                    int i21 = i2Var.f2431b;
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = n2Var3.f2491f;
                    int f6 = z14 ? n2Var3.f(Integer.MIN_VALUE) : n2Var3.h(Integer.MIN_VALUE);
                    n2Var3.b();
                    if (f6 != Integer.MIN_VALUE && ((!z14 || f6 >= staggeredGridLayoutManager2.f2285c.g()) && (z14 || f6 <= staggeredGridLayoutManager2.f2285c.k()))) {
                        if (i21 != Integer.MIN_VALUE) {
                            f6 += i21;
                        }
                        n2Var3.f2488c = f6;
                        n2Var3.f2487b = f6;
                    }
                }
                n2[] n2VarArr = this.f2284b;
                int length = n2VarArr.length;
                int[] iArr = i2Var.f2435f;
                if (iArr == null || iArr.length < length) {
                    i2Var.f2435f = new int[staggeredGridLayoutManager.f2284b.length];
                }
                for (int i22 = 0; i22 < length; i22++) {
                    i2Var.f2435f[i22] = n2VarArr[i22].h(Integer.MIN_VALUE);
                }
            } else {
                for (int i23 = 0; i23 < this.f2283a; i23++) {
                    n2 n2Var4 = this.f2284b[i23];
                    n2Var4.b();
                    int i24 = i2Var.f2435f[i23];
                    n2Var4.f2487b = i24;
                    n2Var4.f2488c = i24;
                }
            }
        }
        detachAndScrapAttachedViews(s1Var);
        h0 h0Var = this.f2289g;
        h0Var.f2409a = false;
        int l6 = this.f2286d.l();
        this.f2288f = l6 / this.f2283a;
        View.MeasureSpec.makeMeasureSpec(l6, this.f2286d.i());
        z(i2Var.f2430a, z1Var);
        if (i2Var.f2432c) {
            y(-1);
            f(s1Var, h0Var, z1Var);
            y(1);
            h0Var.f2411c = i2Var.f2430a + h0Var.f2412d;
            f(s1Var, h0Var, z1Var);
        } else {
            y(1);
            f(s1Var, h0Var, z1Var);
            y(-1);
            h0Var.f2411c = i2Var.f2430a + h0Var.f2412d;
            f(s1Var, h0Var, z1Var);
        }
        if (this.f2286d.i() != 1073741824) {
            int childCount3 = getChildCount();
            float f10 = 0.0f;
            for (int i25 = 0; i25 < childCount3; i25++) {
                View childAt = getChildAt(i25);
                float c2 = this.f2286d.c(childAt);
                if (c2 >= f10) {
                    ((j2) childAt.getLayoutParams()).getClass();
                    f10 = Math.max(f10, c2);
                }
            }
            int i26 = this.f2288f;
            int round = Math.round(f10 * this.f2283a);
            if (this.f2286d.i() == Integer.MIN_VALUE) {
                round = Math.min(round, this.f2286d.l());
            }
            this.f2288f = round / this.f2283a;
            View.MeasureSpec.makeMeasureSpec(round, this.f2286d.i());
            if (this.f2288f != i26) {
                for (int i27 = 0; i27 < childCount3; i27++) {
                    View childAt2 = getChildAt(i27);
                    j2 j2Var = (j2) childAt2.getLayoutParams();
                    j2Var.getClass();
                    if (isLayoutRTL() && this.f2287e == 1) {
                        int i28 = -((this.f2283a - 1) - j2Var.f2448e.f2490e);
                        childAt2.offsetLeftAndRight((this.f2288f * i28) - (i28 * i26));
                    } else {
                        int i29 = j2Var.f2448e.f2490e;
                        int i30 = this.f2288f * i29;
                        int i31 = i29 * i26;
                        if (this.f2287e == 1) {
                            childAt2.offsetLeftAndRight(i30 - i31);
                        } else {
                            childAt2.offsetTopAndBottom(i30 - i31);
                        }
                    }
                }
            }
        }
        if (getChildCount() > 0) {
            if (this.f2291i) {
                i(s1Var, z1Var, true);
                j(s1Var, z1Var, false);
            } else {
                j(s1Var, z1Var, true);
                i(s1Var, z1Var, false);
            }
        }
        if (z5 && !z1Var.f2601g && this.f2295n != 0 && getChildCount() > 0 && p() != null) {
            removeCallbacks(this.f2302v);
        }
        z11 = false;
        if (z1Var.f2601g) {
            i2Var.a();
        }
        this.f2296o = i2Var.f2432c;
        this.f2297p = isLayoutRTL();
        if (z11) {
            i2Var.a();
            r(s1Var, z1Var, false);
        }
    }

    public final boolean s(int i5) {
        if (this.f2287e == 0) {
            return (i5 == -1) != this.f2291i;
        }
        return ((i5 == -1) == this.f2291i) == isLayoutRTL();
    }

    public final int scrollBy(int i5, s1 s1Var, z1 z1Var) {
        if (getChildCount() == 0 || i5 == 0) {
            return 0;
        }
        t(i5, z1Var);
        h0 h0Var = this.f2289g;
        int f6 = f(s1Var, h0Var, z1Var);
        if (h0Var.f2410b >= f6) {
            i5 = i5 < 0 ? -f6 : f6;
        }
        this.f2285c.o(-i5);
        this.f2296o = this.f2291i;
        h0Var.f2410b = 0;
        u(s1Var, h0Var);
        return i5;
    }

    @Override // androidx.recyclerview.widget.k1
    public final int scrollHorizontallyBy(int i5, s1 s1Var, z1 z1Var) {
        return scrollBy(i5, s1Var, z1Var);
    }

    @Override // androidx.recyclerview.widget.k1
    public final void scrollToPosition(int i5) {
        SavedState savedState = this.q;
        if (savedState != null && savedState.f2307a != i5) {
            savedState.f2310d = null;
            savedState.f2309c = 0;
            savedState.f2307a = -1;
            savedState.f2308b = -1;
        }
        this.f2292k = i5;
        this.f2293l = Integer.MIN_VALUE;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.k1
    public final int scrollVerticallyBy(int i5, s1 s1Var, z1 z1Var) {
        return scrollBy(i5, s1Var, z1Var);
    }

    @Override // androidx.recyclerview.widget.k1
    public final void setMeasuredDimension(Rect rect, int i5, int i10) {
        int chooseSize;
        int chooseSize2;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.f2287e == 1) {
            chooseSize2 = k1.chooseSize(i10, rect.height() + paddingBottom, getMinimumHeight());
            chooseSize = k1.chooseSize(i5, (this.f2288f * this.f2283a) + paddingRight, getMinimumWidth());
        } else {
            chooseSize = k1.chooseSize(i5, rect.width() + paddingRight, getMinimumWidth());
            chooseSize2 = k1.chooseSize(i10, (this.f2288f * this.f2283a) + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(chooseSize, chooseSize2);
    }

    @Override // androidx.recyclerview.widget.k1
    public final void smoothScrollToPosition(RecyclerView recyclerView, z1 z1Var, int i5) {
        m0 m0Var = new m0(recyclerView.getContext());
        m0Var.setTargetPosition(i5);
        startSmoothScroll(m0Var);
    }

    @Override // androidx.recyclerview.widget.k1
    public final boolean supportsPredictiveItemAnimations() {
        return this.q == null;
    }

    public final void t(int i5, z1 z1Var) {
        int k6;
        int i10;
        if (i5 > 0) {
            k6 = l();
            i10 = 1;
        } else {
            k6 = k();
            i10 = -1;
        }
        h0 h0Var = this.f2289g;
        h0Var.f2409a = true;
        z(k6, z1Var);
        y(i10);
        h0Var.f2411c = k6 + h0Var.f2412d;
        h0Var.f2410b = Math.abs(i5);
    }

    public final void u(s1 s1Var, h0 h0Var) {
        if (!h0Var.f2409a || h0Var.f2417i) {
            return;
        }
        if (h0Var.f2410b == 0) {
            if (h0Var.f2413e == -1) {
                v(s1Var, h0Var.f2415g);
                return;
            } else {
                w(s1Var, h0Var.f2414f);
                return;
            }
        }
        int i5 = 1;
        if (h0Var.f2413e == -1) {
            int i10 = h0Var.f2414f;
            int h10 = this.f2284b[0].h(i10);
            while (i5 < this.f2283a) {
                int h11 = this.f2284b[i5].h(i10);
                if (h11 > h10) {
                    h10 = h11;
                }
                i5++;
            }
            int i11 = i10 - h10;
            v(s1Var, i11 < 0 ? h0Var.f2415g : h0Var.f2415g - Math.min(i11, h0Var.f2410b));
            return;
        }
        int i12 = h0Var.f2415g;
        int f6 = this.f2284b[0].f(i12);
        while (i5 < this.f2283a) {
            int f10 = this.f2284b[i5].f(i12);
            if (f10 < f6) {
                f6 = f10;
            }
            i5++;
        }
        int i13 = f6 - h0Var.f2415g;
        w(s1Var, i13 < 0 ? h0Var.f2414f : Math.min(i13, h0Var.f2410b) + h0Var.f2414f);
    }

    public final void v(s1 s1Var, int i5) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (this.f2285c.e(childAt) < i5 || this.f2285c.n(childAt) < i5) {
                return;
            }
            j2 j2Var = (j2) childAt.getLayoutParams();
            j2Var.getClass();
            if (j2Var.f2448e.f2486a.size() == 1) {
                return;
            }
            n2 n2Var = j2Var.f2448e;
            ArrayList arrayList = n2Var.f2486a;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            j2 j2Var2 = (j2) view.getLayoutParams();
            j2Var2.f2448e = null;
            if (j2Var2.f2468a.isRemoved() || j2Var2.f2468a.isUpdated()) {
                n2Var.f2489d -= n2Var.f2491f.f2285c.c(view);
            }
            if (size == 1) {
                n2Var.f2487b = Integer.MIN_VALUE;
            }
            n2Var.f2488c = Integer.MIN_VALUE;
            removeAndRecycleView(childAt, s1Var);
        }
    }

    public final void w(s1 s1Var, int i5) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (this.f2285c.b(childAt) > i5 || this.f2285c.m(childAt) > i5) {
                return;
            }
            j2 j2Var = (j2) childAt.getLayoutParams();
            j2Var.getClass();
            if (j2Var.f2448e.f2486a.size() == 1) {
                return;
            }
            n2 n2Var = j2Var.f2448e;
            ArrayList arrayList = n2Var.f2486a;
            View view = (View) arrayList.remove(0);
            j2 j2Var2 = (j2) view.getLayoutParams();
            j2Var2.f2448e = null;
            if (arrayList.size() == 0) {
                n2Var.f2488c = Integer.MIN_VALUE;
            }
            if (j2Var2.f2468a.isRemoved() || j2Var2.f2468a.isUpdated()) {
                n2Var.f2489d -= n2Var.f2491f.f2285c.c(view);
            }
            n2Var.f2487b = Integer.MIN_VALUE;
            removeAndRecycleView(childAt, s1Var);
        }
    }

    public final void x() {
        if (this.f2287e == 1 || !isLayoutRTL()) {
            this.f2291i = this.f2290h;
        } else {
            this.f2291i = !this.f2290h;
        }
    }

    public final void y(int i5) {
        h0 h0Var = this.f2289g;
        h0Var.f2413e = i5;
        h0Var.f2412d = this.f2291i != (i5 == -1) ? -1 : 1;
    }

    public final void z(int i5, z1 z1Var) {
        int i10;
        int i11;
        int i12;
        h0 h0Var = this.f2289g;
        boolean z5 = false;
        h0Var.f2410b = 0;
        h0Var.f2411c = i5;
        if (!isSmoothScrolling() || (i12 = z1Var.f2595a) == -1) {
            i10 = 0;
            i11 = 0;
        } else {
            if (this.f2291i == (i12 < i5)) {
                i10 = this.f2285c.l();
                i11 = 0;
            } else {
                i11 = this.f2285c.l();
                i10 = 0;
            }
        }
        if (getClipToPadding()) {
            h0Var.f2414f = this.f2285c.k() - i11;
            h0Var.f2415g = this.f2285c.g() + i10;
        } else {
            h0Var.f2415g = this.f2285c.f() + i10;
            h0Var.f2414f = -i11;
        }
        h0Var.f2416h = false;
        h0Var.f2409a = true;
        if (this.f2285c.i() == 0 && this.f2285c.f() == 0) {
            z5 = true;
        }
        h0Var.f2417i = z5;
    }

    @Override // androidx.recyclerview.widget.k1
    public final l1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new j2((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new j2(layoutParams);
    }
}
