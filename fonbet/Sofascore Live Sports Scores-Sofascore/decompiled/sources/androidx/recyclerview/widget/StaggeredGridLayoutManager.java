package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a70;
import defpackage.boa;
import defpackage.c9i;
import defpackage.d9i;
import defpackage.da;
import defpackage.dad;
import defpackage.f8b;
import defpackage.flh;
import defpackage.frf;
import defpackage.grf;
import defpackage.gwd;
import defpackage.hrf;
import defpackage.jaa;
import defpackage.kac;
import defpackage.mz1;
import defpackage.prf;
import defpackage.qrf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends n implements prf {
    public final int a;
    public final flh[] b;
    public final gwd c;
    public final gwd d;
    public final int e;
    public int f;
    public final boa g;
    public boolean h;
    public final BitSet j;
    public final y m;
    public final int n;
    public boolean o;
    public boolean p;
    public SavedState q;
    public final Rect r;
    public final c9i s;
    public final boolean t;
    public int[] u;
    public final kac v;
    public boolean i = false;
    public int k = -1;
    public int l = Integer.MIN_VALUE;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new z();
        public int a;
        public int b;
        public int c;
        public int[] d;
        public int e;
        public int[] f;
        public ArrayList g;
        public boolean h;
        public boolean i;
        public boolean j;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
            if (this.c > 0) {
                parcel.writeIntArray(this.d);
            }
            parcel.writeInt(this.e);
            if (this.e > 0) {
                parcel.writeIntArray(this.f);
            }
            parcel.writeInt(this.h ? 1 : 0);
            parcel.writeInt(this.i ? 1 : 0);
            parcel.writeInt(this.j ? 1 : 0);
            parcel.writeList(this.g);
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.a = -1;
        this.h = false;
        y yVar = new y();
        this.m = yVar;
        this.n = 2;
        this.r = new Rect();
        this.s = new c9i(this);
        this.t = true;
        this.v = new kac(this, 19);
        grf properties = n.getProperties(context, attributeSet, i, i2);
        int i3 = properties.a;
        if (i3 != 0 && i3 != 1) {
            a70.p("invalid orientation.");
            throw null;
        }
        assertNotInLayoutOrScroll(null);
        if (i3 != this.e) {
            this.e = i3;
            gwd gwdVar = this.c;
            this.c = this.d;
            this.d = gwdVar;
            requestLayout();
        }
        int i4 = properties.b;
        assertNotInLayoutOrScroll(null);
        if (i4 != this.a) {
            yVar.a();
            requestLayout();
            this.a = i4;
            this.j = new BitSet(this.a);
            this.b = new flh[this.a];
            for (int i5 = 0; i5 < this.a; i5++) {
                this.b[i5] = new flh(this, i5);
            }
            requestLayout();
        }
        boolean z = properties.c;
        assertNotInLayoutOrScroll(null);
        SavedState savedState = this.q;
        if (savedState != null && savedState.h != z) {
            savedState.h = z;
        }
        this.h = z;
        requestLayout();
        boa boaVar = new boa();
        boaVar.a = true;
        boaVar.f = 0;
        boaVar.g = 0;
        this.g = boaVar;
        this.c = gwd.a(this, this.e);
        this.d = gwd.a(this, 1 - this.e);
    }

    public static int B(int i, int i2, int i3) {
        int mode;
        return (!(i2 == 0 && i3 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    public final void A(flh flhVar, int i, int i2) {
        int i3 = flhVar.e;
        int i4 = flhVar.f;
        BitSet bitSet = this.j;
        if (i != -1) {
            int i5 = flhVar.d;
            if (i5 == Integer.MIN_VALUE) {
                flhVar.b();
                i5 = flhVar.d;
            }
            if (i5 - i3 >= i2) {
                bitSet.set(i4, false);
                return;
            }
            return;
        }
        int i6 = flhVar.c;
        if (i6 == Integer.MIN_VALUE) {
            View view = (View) flhVar.b.get(0);
            d9i d9iVar = (d9i) view.getLayoutParams();
            flhVar.c = ((StaggeredGridLayoutManager) flhVar.g).c.e(view);
            d9iVar.getClass();
            i6 = flhVar.c;
        }
        if (i6 + i3 <= i2) {
            bitSet.set(i4, false);
        }
    }

    @Override // androidx.recyclerview.widget.n
    public final void assertNotInLayoutOrScroll(String str) {
        if (this.q == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    @Override // androidx.recyclerview.widget.n
    public final boolean canScrollHorizontally() {
        return this.e == 0;
    }

    @Override // androidx.recyclerview.widget.n
    public final boolean canScrollVertically() {
        return this.e == 1;
    }

    @Override // androidx.recyclerview.widget.n
    public final boolean checkLayoutParams(hrf hrfVar) {
        return hrfVar instanceof d9i;
    }

    @Override // androidx.recyclerview.widget.n
    public final void collectAdjacentPrefetchPositions(int i, int i2, qrf qrfVar, frf frfVar) {
        boa boaVar;
        int g;
        if (this.e != 0) {
            i = i2;
        }
        if (getChildCount() == 0 || i == 0) {
            return;
        }
        t(i, qrfVar);
        int[] iArr = this.u;
        int i3 = this.a;
        if (iArr == null || iArr.length < i3) {
            this.u = new int[i3];
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            boaVar = this.g;
            if (i4 >= i3) {
                break;
            }
            int i6 = boaVar.d;
            flh[] flhVarArr = this.b;
            if (i6 == -1) {
                int i7 = boaVar.f;
                g = i7 - flhVarArr[i4].j(i7);
            } else {
                g = flhVarArr[i4].g(boaVar.g) - boaVar.g;
            }
            if (g >= 0) {
                this.u[i5] = g;
                i5++;
            }
            i4++;
        }
        Arrays.sort(this.u, 0, i5);
        for (int i8 = 0; i8 < i5; i8++) {
            int i9 = boaVar.c;
            if (i9 < 0 || i9 >= qrfVar.b()) {
                return;
            }
            ((e) frfVar).a(boaVar.c, this.u[i8]);
            boaVar.c += boaVar.d;
        }
    }

    @Override // androidx.recyclerview.widget.n
    public final int computeHorizontalScrollExtent(qrf qrfVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z = !this.t;
        return jaa.u(qrfVar, this.c, h(z), g(z), this, this.t);
    }

    @Override // androidx.recyclerview.widget.n
    public final int computeHorizontalScrollOffset(qrf qrfVar) {
        return e(qrfVar);
    }

    @Override // androidx.recyclerview.widget.n
    public final int computeHorizontalScrollRange(qrf qrfVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z = !this.t;
        return jaa.w(qrfVar, this.c, h(z), g(z), this, this.t);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0019, code lost:
    
        if ((r4 < k()) != r3.i) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r3.i != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
    
        r1 = 1;
     */
    @Override // defpackage.prf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PointF computeScrollVectorForPosition(int i) {
        int i2 = -1;
        if (getChildCount() == 0) {
        }
        PointF pointF = new PointF();
        if (i2 == 0) {
            return null;
        }
        if (this.e == 0) {
            pointF.x = i2;
            pointF.y = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            return pointF;
        }
        pointF.x = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        pointF.y = i2;
        return pointF;
    }

    @Override // androidx.recyclerview.widget.n
    public final int computeVerticalScrollExtent(qrf qrfVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z = !this.t;
        return jaa.u(qrfVar, this.c, h(z), g(z), this, this.t);
    }

    @Override // androidx.recyclerview.widget.n
    public final int computeVerticalScrollOffset(qrf qrfVar) {
        return e(qrfVar);
    }

    @Override // androidx.recyclerview.widget.n
    public final int computeVerticalScrollRange(qrf qrfVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z = !this.t;
        return jaa.w(qrfVar, this.c, h(z), g(z), this, this.t);
    }

    public final boolean d() {
        int k;
        if (getChildCount() != 0 && this.n != 0 && isAttachedToWindow()) {
            if (this.i) {
                k = l();
                k();
            } else {
                k = k();
                l();
            }
            if (k == 0 && p() != null) {
                this.m.a();
                requestSimpleAnimationsInNextLayout();
                requestLayout();
                return true;
            }
        }
        return false;
    }

    public final int e(qrf qrfVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z = !this.t;
        return jaa.v(qrfVar, this.c, h(z), g(z), this, this.t, this.i);
    }

    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [boolean, int] */
    public final int f(o oVar, boa boaVar, qrf qrfVar) {
        int i;
        int i2;
        flh[] flhVarArr;
        flh[] flhVarArr2;
        BitSet bitSet;
        int i3;
        flh flhVar;
        ?? r3;
        int j;
        int c;
        int i4;
        int i5;
        int i6;
        View view;
        gwd gwdVar;
        BitSet bitSet2;
        int i7;
        int i8;
        int i9;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this;
        o oVar2 = oVar;
        BitSet bitSet3 = staggeredGridLayoutManager.j;
        int i10 = staggeredGridLayoutManager.a;
        bitSet3.set(0, i10, true);
        boa boaVar2 = staggeredGridLayoutManager.g;
        if (boaVar2.i) {
            i = boaVar.e;
            i2 = i == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            i = boaVar.e;
            i2 = i == 1 ? boaVar.g + boaVar.b : boaVar.f - boaVar.b;
        }
        int i11 = 0;
        while (true) {
            flhVarArr = staggeredGridLayoutManager.b;
            if (i11 >= i10) {
                break;
            }
            if (!flhVarArr[i11].b.isEmpty()) {
                staggeredGridLayoutManager.A(flhVarArr[i11], i, i2);
            }
            i11++;
        }
        boolean z = staggeredGridLayoutManager.i;
        gwd gwdVar2 = staggeredGridLayoutManager.c;
        int g = z ? gwdVar2.g() : gwdVar2.k();
        boolean z2 = false;
        while (true) {
            int i12 = boaVar.c;
            if (i12 < 0 || i12 >= qrfVar.b() || (!boaVar2.i && bitSet3.isEmpty())) {
                break;
            }
            View d = oVar2.d(boaVar.c);
            boaVar.c += boaVar.d;
            d9i d9iVar = (d9i) d.getLayoutParams();
            int layoutPosition = d9iVar.a.getLayoutPosition();
            y yVar = staggeredGridLayoutManager.m;
            int[] iArr = yVar.a;
            int i13 = (iArr == null || layoutPosition >= iArr.length) ? -1 : iArr[layoutPosition];
            if (i13 == -1) {
                if (staggeredGridLayoutManager.s(boaVar.e)) {
                    i8 = i10 - 1;
                    i7 = -1;
                    i9 = -1;
                } else {
                    i7 = i10;
                    i8 = 0;
                    i9 = 1;
                }
                flhVarArr2 = flhVarArr;
                flh flhVar2 = null;
                i3 = i10;
                if (boaVar.e == 1) {
                    int k = gwdVar2.k();
                    int i14 = Integer.MAX_VALUE;
                    while (i8 != i7) {
                        int i15 = i8;
                        flh flhVar3 = flhVarArr2[i15];
                        BitSet bitSet4 = bitSet3;
                        int g2 = flhVar3.g(k);
                        if (g2 < i14) {
                            i14 = g2;
                            flhVar2 = flhVar3;
                        }
                        i8 = i15 + i9;
                        bitSet3 = bitSet4;
                    }
                    bitSet = bitSet3;
                } else {
                    bitSet = bitSet3;
                    int g3 = gwdVar2.g();
                    int i16 = Integer.MIN_VALUE;
                    while (i8 != i7) {
                        flh flhVar4 = flhVarArr2[i8];
                        int i17 = i8;
                        int j2 = flhVar4.j(g3);
                        if (j2 > i16) {
                            flhVar2 = flhVar4;
                            i16 = j2;
                        }
                        i8 = i17 + i9;
                    }
                }
                flhVar = flhVar2;
                yVar.b(layoutPosition);
                yVar.a[layoutPosition] = flhVar.f;
            } else {
                flhVarArr2 = flhVarArr;
                bitSet = bitSet3;
                i3 = i10;
                flhVar = flhVarArr2[i13];
            }
            flh flhVar5 = flhVar;
            d9iVar.e = flhVar5;
            if (boaVar.e == 1) {
                staggeredGridLayoutManager.addView(d);
                r3 = 0;
            } else {
                r3 = 0;
                staggeredGridLayoutManager.addView(d, 0);
            }
            int i18 = staggeredGridLayoutManager.e;
            if (i18 == 1) {
                staggeredGridLayoutManager.q(d, n.getChildMeasureSpec(staggeredGridLayoutManager.f, staggeredGridLayoutManager.getWidthMode(), r3, ((ViewGroup.MarginLayoutParams) d9iVar).width, r3), n.getChildMeasureSpec(staggeredGridLayoutManager.getHeight(), staggeredGridLayoutManager.getHeightMode(), staggeredGridLayoutManager.getPaddingBottom() + staggeredGridLayoutManager.getPaddingTop(), ((ViewGroup.MarginLayoutParams) d9iVar).height, true));
            } else {
                staggeredGridLayoutManager.q(d, n.getChildMeasureSpec(staggeredGridLayoutManager.getWidth(), staggeredGridLayoutManager.getWidthMode(), staggeredGridLayoutManager.getPaddingRight() + staggeredGridLayoutManager.getPaddingLeft(), ((ViewGroup.MarginLayoutParams) d9iVar).width, true), n.getChildMeasureSpec(staggeredGridLayoutManager.f, staggeredGridLayoutManager.getHeightMode(), 0, ((ViewGroup.MarginLayoutParams) d9iVar).height, false));
            }
            if (boaVar.e == 1) {
                c = flhVar5.g(g);
                j = gwdVar2.c(d) + c;
            } else {
                j = flhVar5.j(g);
                c = j - gwdVar2.c(d);
            }
            int i19 = boaVar.e;
            flh flhVar6 = d9iVar.e;
            if (i19 == 1) {
                flhVar6.getClass();
                d9i d9iVar2 = (d9i) d.getLayoutParams();
                d9iVar2.e = flhVar6;
                ArrayList arrayList = flhVar6.b;
                arrayList.add(d);
                flhVar6.d = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    flhVar6.c = Integer.MIN_VALUE;
                }
                if (d9iVar2.a.isRemoved() || d9iVar2.a.isUpdated()) {
                    flhVar6.e = ((StaggeredGridLayoutManager) flhVar6.g).c.c(d) + flhVar6.e;
                }
            } else {
                flhVar6.getClass();
                d9i d9iVar3 = (d9i) d.getLayoutParams();
                d9iVar3.e = flhVar6;
                ArrayList arrayList2 = flhVar6.b;
                arrayList2.add(0, d);
                flhVar6.c = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    flhVar6.d = Integer.MIN_VALUE;
                }
                if (d9iVar3.a.isRemoved() || d9iVar3.a.isUpdated()) {
                    flhVar6.e = ((StaggeredGridLayoutManager) flhVar6.g).c.c(d) + flhVar6.e;
                }
            }
            boolean isLayoutRTL = staggeredGridLayoutManager.isLayoutRTL();
            gwd gwdVar3 = staggeredGridLayoutManager.d;
            if (isLayoutRTL && i18 == 1) {
                i5 = gwdVar3.g() - (((i3 - 1) - flhVar5.f) * staggeredGridLayoutManager.f);
                i4 = i5 - gwdVar3.c(d);
            } else {
                int k2 = (flhVar5.f * staggeredGridLayoutManager.f) + gwdVar3.k();
                int c2 = gwdVar3.c(d) + k2;
                i4 = k2;
                i5 = c2;
            }
            if (i18 == 1) {
                int i20 = j;
                i6 = g;
                view = d;
                gwdVar = gwdVar2;
                staggeredGridLayoutManager.layoutDecoratedWithMargins(view, i4, c, i5, i20);
                staggeredGridLayoutManager = this;
            } else {
                int i21 = j;
                i6 = g;
                view = d;
                gwdVar = gwdVar2;
                staggeredGridLayoutManager.layoutDecoratedWithMargins(view, c, i4, i21, i5);
            }
            staggeredGridLayoutManager.A(flhVar5, boaVar2.e, i2);
            staggeredGridLayoutManager.u(oVar, boaVar2);
            if (boaVar2.h && view.hasFocusable()) {
                bitSet2 = bitSet;
                bitSet2.set(flhVar5.f, false);
            } else {
                bitSet2 = bitSet;
            }
            bitSet3 = bitSet2;
            g = i6;
            z2 = true;
            flhVarArr = flhVarArr2;
            i10 = i3;
            oVar2 = oVar;
            gwdVar2 = gwdVar;
        }
        gwd gwdVar4 = gwdVar2;
        o oVar3 = oVar2;
        if (!z2) {
            staggeredGridLayoutManager.u(oVar3, boaVar2);
        }
        int k3 = boaVar2.e == -1 ? gwdVar4.k() - staggeredGridLayoutManager.n(gwdVar4.k()) : staggeredGridLayoutManager.m(gwdVar4.g()) - gwdVar4.g();
        if (k3 > 0) {
            return Math.min(boaVar.b, k3);
        }
        return 0;
    }

    public final View g(boolean z) {
        gwd gwdVar = this.c;
        int k = gwdVar.k();
        int g = gwdVar.g();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int e = gwdVar.e(childAt);
            int b = gwdVar.b(childAt);
            if (b > k && e < g) {
                if (b <= g || !z) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.n
    public final hrf generateDefaultLayoutParams() {
        return this.e == 0 ? new d9i(-2, -1) : new d9i(-1, -2);
    }

    @Override // androidx.recyclerview.widget.n
    public final hrf generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new d9i((ViewGroup.MarginLayoutParams) layoutParams) : new d9i(layoutParams);
    }

    @Override // androidx.recyclerview.widget.n
    public final int getColumnCountForAccessibility(o oVar, qrf qrfVar) {
        if (this.e == 1) {
            return Math.min(this.a, qrfVar.b());
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.n
    public final int getRowCountForAccessibility(o oVar, qrf qrfVar) {
        if (this.e == 0) {
            return Math.min(this.a, qrfVar.b());
        }
        return -1;
    }

    public final View h(boolean z) {
        gwd gwdVar = this.c;
        int k = gwdVar.k();
        int g = gwdVar.g();
        int childCount = getChildCount();
        View view = null;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int e = gwdVar.e(childAt);
            if (gwdVar.b(childAt) > k && e < g) {
                if (e >= k || !z) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    public final void i(o oVar, qrf qrfVar, boolean z) {
        int g;
        int m = m(Integer.MIN_VALUE);
        if (m != Integer.MIN_VALUE && (g = this.c.g() - m) > 0) {
            int i = g - (-scrollBy(-g, oVar, qrfVar));
            if (!z || i <= 0) {
                return;
            }
            this.c.o(i);
        }
    }

    @Override // androidx.recyclerview.widget.n
    public final boolean isAutoMeasureEnabled() {
        return this.n != 0;
    }

    public final boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.n
    public final boolean isLayoutReversed() {
        return this.h;
    }

    public final void j(o oVar, qrf qrfVar, boolean z) {
        int k;
        int n = n(Integer.MAX_VALUE);
        if (n != Integer.MAX_VALUE && (k = n - this.c.k()) > 0) {
            int scrollBy = k - scrollBy(k, oVar, qrfVar);
            if (!z || scrollBy <= 0) {
                return;
            }
            this.c.o(-scrollBy);
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

    public final int m(int i) {
        int g = this.b[0].g(i);
        for (int i2 = 1; i2 < this.a; i2++) {
            int g2 = this.b[i2].g(i);
            if (g2 > g) {
                g = g2;
            }
        }
        return g;
    }

    public final int n(int i) {
        int j = this.b[0].j(i);
        for (int i2 = 1; i2 < this.a; i2++) {
            int j2 = this.b[i2].j(i);
            if (j2 < j) {
                j = j2;
            }
        }
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(int i, int i2, int i3) {
        int i4;
        int i5;
        y yVar;
        int[] iArr;
        ArrayList arrayList;
        StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
        int i6;
        int l = this.i ? l() : k();
        if (i3 != 8) {
            i4 = i + i2;
        } else {
            if (i >= i2) {
                i4 = i + 1;
                i5 = i2;
                yVar = this.m;
                iArr = yVar.a;
                if (iArr != null && i5 < iArr.length) {
                    arrayList = yVar.b;
                    if (arrayList != null) {
                        if (arrayList != null) {
                            for (int size = arrayList.size() - 1; size >= 0; size--) {
                                staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) yVar.b.get(size);
                                if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.a == i5) {
                                    break;
                                }
                            }
                        }
                        staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = null;
                        if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem != null) {
                            yVar.b.remove(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem);
                        }
                        int size2 = yVar.b.size();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= size2) {
                                i7 = -1;
                                break;
                            } else if (((StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) yVar.b.get(i7)).a >= i5) {
                                break;
                            } else {
                                i7++;
                            }
                        }
                        if (i7 != -1) {
                            StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2 = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) yVar.b.get(i7);
                            yVar.b.remove(i7);
                            i6 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2.a;
                            int[] iArr2 = yVar.a;
                            if (i6 == -1) {
                                Arrays.fill(iArr2, i5, iArr2.length, -1);
                                int length = yVar.a.length;
                            } else {
                                Arrays.fill(yVar.a, i5, Math.min(i6 + 1, iArr2.length), -1);
                            }
                        }
                    }
                    i6 = -1;
                    int[] iArr22 = yVar.a;
                    if (i6 == -1) {
                    }
                }
                if (i3 != 1) {
                    yVar.c(i, i2);
                } else if (i3 == 2) {
                    yVar.d(i, i2);
                } else if (i3 == 8) {
                    yVar.d(i, 1);
                    yVar.c(i2, 1);
                }
                if (i4 > l) {
                    return;
                }
                if (i5 <= (this.i ? k() : l())) {
                    requestLayout();
                    return;
                }
                return;
            }
            i4 = i2 + 1;
        }
        i5 = i;
        yVar = this.m;
        iArr = yVar.a;
        if (iArr != null) {
            arrayList = yVar.b;
            if (arrayList != null) {
            }
            i6 = -1;
            int[] iArr222 = yVar.a;
            if (i6 == -1) {
            }
        }
        if (i3 != 1) {
        }
        if (i4 > l) {
        }
    }

    @Override // androidx.recyclerview.widget.n
    public final void offsetChildrenHorizontal(int i) {
        super.offsetChildrenHorizontal(i);
        for (int i2 = 0; i2 < this.a; i2++) {
            flh flhVar = this.b[i2];
            int i3 = flhVar.c;
            if (i3 != Integer.MIN_VALUE) {
                flhVar.c = i3 + i;
            }
            int i4 = flhVar.d;
            if (i4 != Integer.MIN_VALUE) {
                flhVar.d = i4 + i;
            }
        }
    }

    @Override // androidx.recyclerview.widget.n
    public final void offsetChildrenVertical(int i) {
        super.offsetChildrenVertical(i);
        for (int i2 = 0; i2 < this.a; i2++) {
            flh flhVar = this.b[i2];
            int i3 = flhVar.c;
            if (i3 != Integer.MIN_VALUE) {
                flhVar.c = i3 + i;
            }
            int i4 = flhVar.d;
            if (i4 != Integer.MIN_VALUE) {
                flhVar.d = i4 + i;
            }
        }
    }

    @Override // androidx.recyclerview.widget.n
    public final void onAdapterChanged(l lVar, l lVar2) {
        this.m.a();
        for (int i = 0; i < this.a; i++) {
            this.b[i].c();
        }
    }

    @Override // androidx.recyclerview.widget.n
    public final void onDetachedFromWindow(RecyclerView recyclerView, o oVar) {
        onDetachedFromWindow(recyclerView);
        removeCallbacks(this.v);
        for (int i = 0; i < this.a; i++) {
            this.b[i].c();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0036, code lost:
    
        if (r0 == 1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x003a, code lost:
    
        if (r0 == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0044, code lost:
    
        if (isLayoutRTL() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x004e, code lost:
    
        if (isLayoutRTL() == false) goto L26;
     */
    @Override // androidx.recyclerview.widget.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View onFocusSearchFailed(View view, int i, o oVar, qrf qrfVar) {
        View findContainingItemView;
        int i2;
        if (getChildCount() == 0 || (findContainingItemView = findContainingItemView(view)) == null) {
            return null;
        }
        x();
        int i3 = this.e;
        if (i == 1) {
            if (i3 != 1) {
            }
            i2 = -1;
        } else if (i == 2) {
            if (i3 != 1) {
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
        d9i d9iVar = (d9i) findContainingItemView.getLayoutParams();
        d9iVar.getClass();
        flh flhVar = d9iVar.e;
        int l = i2 == 1 ? l() : k();
        z(l, qrfVar);
        y(i2);
        boa boaVar = this.g;
        boaVar.c = boaVar.d + l;
        boaVar.b = (int) (this.c.l() * 0.33333334f);
        boaVar.h = true;
        boaVar.a = false;
        f(oVar, boaVar, qrfVar);
        this.o = this.i;
        View h = flhVar.h(l, i2);
        if (h != null && h != findContainingItemView) {
            return h;
        }
        boolean s = s(i2);
        flh[] flhVarArr = this.b;
        int i4 = this.a;
        if (s) {
            for (int i5 = i4 - 1; i5 >= 0; i5--) {
                View h2 = flhVarArr[i5].h(l, i2);
                if (h2 != null && h2 != findContainingItemView) {
                    return h2;
                }
            }
        } else {
            for (int i6 = 0; i6 < i4; i6++) {
                View h3 = flhVarArr[i6].h(l, i2);
                if (h3 != null && h3 != findContainingItemView) {
                    return h3;
                }
            }
        }
        boolean z = (this.h ^ true) == (i2 == -1);
        View findViewByPosition = findViewByPosition(z ? flhVar.d() : flhVar.e());
        if (findViewByPosition != null && findViewByPosition != findContainingItemView) {
            return findViewByPosition;
        }
        if (s(i2)) {
            for (int i7 = i4 - 1; i7 >= 0; i7--) {
                if (i7 != flhVar.f) {
                    View findViewByPosition2 = findViewByPosition(z ? flhVarArr[i7].d() : flhVarArr[i7].e());
                    if (findViewByPosition2 != null && findViewByPosition2 != findContainingItemView) {
                        return findViewByPosition2;
                    }
                }
            }
        } else {
            for (int i8 = 0; i8 < i4; i8++) {
                View findViewByPosition3 = findViewByPosition(z ? flhVarArr[i8].d() : flhVarArr[i8].e());
                if (findViewByPosition3 != null && findViewByPosition3 != findContainingItemView) {
                    return findViewByPosition3;
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.n
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            View h = h(false);
            View g = g(false);
            if (h == null || g == null) {
                return;
            }
            int position = getPosition(h);
            int position2 = getPosition(g);
            if (position < position2) {
                accessibilityEvent.setFromIndex(position);
                accessibilityEvent.setToIndex(position2);
            } else {
                accessibilityEvent.setFromIndex(position2);
                accessibilityEvent.setToIndex(position);
            }
        }
    }

    @Override // androidx.recyclerview.widget.n
    public final void onInitializeAccessibilityNodeInfo(o oVar, qrf qrfVar, da daVar) {
        super.onInitializeAccessibilityNodeInfo(oVar, qrfVar, daVar);
        daVar.k("androidx.recyclerview.widget.StaggeredGridLayoutManager");
    }

    @Override // androidx.recyclerview.widget.n
    public final void onInitializeAccessibilityNodeInfoForItem(o oVar, qrf qrfVar, View view, da daVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof d9i)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, daVar);
            return;
        }
        flh flhVar = ((d9i) layoutParams).e;
        if (this.e == 0) {
            daVar.m(dad.w(flhVar == null ? -1 : flhVar.f, 1, -1, -1, false));
        } else {
            daVar.m(dad.w(-1, -1, flhVar == null ? -1 : flhVar.f, 1, false));
        }
    }

    @Override // androidx.recyclerview.widget.n
    public final void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        o(i, i2, 1);
    }

    @Override // androidx.recyclerview.widget.n
    public final void onItemsChanged(RecyclerView recyclerView) {
        this.m.a();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.n
    public final void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        o(i, i2, 8);
    }

    @Override // androidx.recyclerview.widget.n
    public final void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        o(i, i2, 2);
    }

    @Override // androidx.recyclerview.widget.n
    public final void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        o(i, i2, 4);
    }

    @Override // androidx.recyclerview.widget.n
    public final void onLayoutChildren(o oVar, qrf qrfVar) {
        r(oVar, qrfVar, true);
    }

    @Override // androidx.recyclerview.widget.n
    public final void onLayoutCompleted(qrf qrfVar) {
        this.k = -1;
        this.l = Integer.MIN_VALUE;
        this.q = null;
        this.s.a();
    }

    @Override // androidx.recyclerview.widget.n
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.q = savedState;
            if (this.k != -1) {
                savedState.a = -1;
                savedState.b = -1;
                savedState.d = null;
                savedState.c = 0;
                savedState.e = 0;
                savedState.f = null;
                savedState.g = null;
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.n
    public final Parcelable onSaveInstanceState() {
        int j;
        int k;
        int[] iArr;
        SavedState savedState = this.q;
        if (savedState != null) {
            SavedState savedState2 = new SavedState();
            savedState2.c = savedState.c;
            savedState2.a = savedState.a;
            savedState2.b = savedState.b;
            savedState2.d = savedState.d;
            savedState2.e = savedState.e;
            savedState2.f = savedState.f;
            savedState2.h = savedState.h;
            savedState2.i = savedState.i;
            savedState2.j = savedState.j;
            savedState2.g = savedState.g;
            return savedState2;
        }
        SavedState savedState3 = new SavedState();
        savedState3.h = this.h;
        savedState3.i = this.o;
        savedState3.j = this.p;
        y yVar = this.m;
        if (yVar == null || (iArr = yVar.a) == null) {
            savedState3.e = 0;
        } else {
            savedState3.f = iArr;
            savedState3.e = iArr.length;
            savedState3.g = yVar.b;
        }
        if (getChildCount() <= 0) {
            savedState3.a = -1;
            savedState3.b = -1;
            savedState3.c = 0;
            return savedState3;
        }
        savedState3.a = this.o ? l() : k();
        View g = this.i ? g(true) : h(true);
        savedState3.b = g != null ? getPosition(g) : -1;
        int i = this.a;
        savedState3.c = i;
        savedState3.d = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            boolean z = this.o;
            gwd gwdVar = this.c;
            flh[] flhVarArr = this.b;
            if (z) {
                j = flhVarArr[i2].g(Integer.MIN_VALUE);
                if (j != Integer.MIN_VALUE) {
                    k = gwdVar.g();
                    j -= k;
                    savedState3.d[i2] = j;
                } else {
                    savedState3.d[i2] = j;
                }
            } else {
                j = flhVarArr[i2].j(Integer.MIN_VALUE);
                if (j != Integer.MIN_VALUE) {
                    k = gwdVar.k();
                    j -= k;
                    savedState3.d[i2] = j;
                } else {
                    savedState3.d[i2] = j;
                }
            }
        }
        return savedState3;
    }

    @Override // androidx.recyclerview.widget.n
    public final void onScrollStateChanged(int i) {
        if (i == 0) {
            d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ee A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x002a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View p() {
        int childCount = getChildCount();
        int i = childCount - 1;
        int i2 = this.a;
        BitSet bitSet = new BitSet(i2);
        bitSet.set(0, i2, true);
        char c = (this.e == 1 && isLayoutRTL()) ? (char) 1 : (char) 65535;
        if (this.i) {
            childCount = -1;
        } else {
            i = 0;
        }
        int i3 = i < childCount ? 1 : -1;
        while (i != childCount) {
            View childAt = getChildAt(i);
            d9i d9iVar = (d9i) childAt.getLayoutParams();
            boolean z = bitSet.get(d9iVar.e.f);
            gwd gwdVar = this.c;
            if (z) {
                flh flhVar = d9iVar.e;
                if (this.i) {
                    int i4 = flhVar.d;
                    if (i4 == Integer.MIN_VALUE) {
                        flhVar.b();
                        i4 = flhVar.d;
                    }
                    if (i4 < gwdVar.g()) {
                        ((d9i) ((View) mz1.h(flhVar.b, 1)).getLayoutParams()).getClass();
                        return childAt;
                    }
                } else {
                    int i5 = flhVar.c;
                    ArrayList arrayList = flhVar.b;
                    if (i5 == Integer.MIN_VALUE) {
                        View view = (View) arrayList.get(0);
                        d9i d9iVar2 = (d9i) view.getLayoutParams();
                        flhVar.c = ((StaggeredGridLayoutManager) flhVar.g).c.e(view);
                        d9iVar2.getClass();
                        i5 = flhVar.c;
                    }
                    if (i5 > gwdVar.k()) {
                        ((d9i) ((View) arrayList.get(0)).getLayoutParams()).getClass();
                        return childAt;
                    }
                }
                bitSet.clear(d9iVar.e.f);
            }
            i += i3;
            if (i != childCount) {
                View childAt2 = getChildAt(i);
                if (this.i) {
                    int b = gwdVar.b(childAt);
                    int b2 = gwdVar.b(childAt2);
                    if (b < b2) {
                        return childAt;
                    }
                    if (b == b2) {
                        if ((d9iVar.e.f - ((d9i) childAt2.getLayoutParams()).e.f >= 0) == (c >= 0)) {
                            return childAt;
                        }
                    } else {
                        continue;
                    }
                } else {
                    int e = gwdVar.e(childAt);
                    int e2 = gwdVar.e(childAt2);
                    if (e > e2) {
                        return childAt;
                    }
                    if (e == e2) {
                        if ((d9iVar.e.f - ((d9i) childAt2.getLayoutParams()).e.f >= 0) == (c >= 0)) {
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    public final void q(View view, int i, int i2) {
        Rect rect = this.r;
        calculateItemDecorationsForChild(view, rect);
        d9i d9iVar = (d9i) view.getLayoutParams();
        int B = B(i, ((ViewGroup.MarginLayoutParams) d9iVar).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) d9iVar).rightMargin + rect.right);
        int B2 = B(i2, ((ViewGroup.MarginLayoutParams) d9iVar).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) d9iVar).bottomMargin + rect.bottom);
        if (shouldMeasureChild(view, B, B2, d9iVar)) {
            view.measure(B, B2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x018b, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0187, code lost:
    
        if ((r4 < k()) != r17.i) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0179, code lost:
    
        if (r17.i != false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0189, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:258:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:264:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(o oVar, qrf qrfVar, boolean z) {
        int i;
        boolean z2;
        boolean z3;
        SavedState savedState;
        int i2;
        boolean z4;
        int i3;
        boolean z5;
        SavedState savedState2 = this.q;
        c9i c9iVar = this.s;
        if (!(savedState2 == null && this.k == -1) && qrfVar.b() == 0) {
            removeAndRecycleAllViews(oVar);
            c9iVar.a();
            return;
        }
        boolean z6 = c9iVar.e;
        StaggeredGridLayoutManager staggeredGridLayoutManager = c9iVar.g;
        boolean z7 = (z6 && this.k == -1 && this.q == null) ? false : true;
        flh[] flhVarArr = this.b;
        int i4 = this.a;
        y yVar = this.m;
        if (z7) {
            c9iVar.a();
            SavedState savedState3 = this.q;
            gwd gwdVar = this.c;
            if (savedState3 != null) {
                int i5 = savedState3.c;
                if (i5 > 0) {
                    if (i5 == i4) {
                        for (int i6 = 0; i6 < i4; i6++) {
                            flhVarArr[i6].c();
                            SavedState savedState4 = this.q;
                            int i7 = savedState4.d[i6];
                            if (i7 != Integer.MIN_VALUE) {
                                i7 += savedState4.i ? gwdVar.g() : gwdVar.k();
                            }
                            flh flhVar = flhVarArr[i6];
                            flhVar.c = i7;
                            flhVar.d = i7;
                        }
                    } else {
                        savedState3.d = null;
                        savedState3.c = 0;
                        savedState3.e = 0;
                        savedState3.f = null;
                        savedState3.g = null;
                        savedState3.a = savedState3.b;
                    }
                }
                SavedState savedState5 = this.q;
                this.p = savedState5.j;
                boolean z8 = savedState5.h;
                assertNotInLayoutOrScroll(null);
                SavedState savedState6 = this.q;
                if (savedState6 != null && savedState6.h != z8) {
                    savedState6.h = z8;
                }
                this.h = z8;
                requestLayout();
                x();
                SavedState savedState7 = this.q;
                int i8 = savedState7.a;
                if (i8 != -1) {
                    this.k = i8;
                    c9iVar.c = savedState7.i;
                } else {
                    c9iVar.c = this.i;
                }
                if (savedState7.e > 1) {
                    yVar.a = savedState7.f;
                    yVar.b = savedState7.g;
                }
            } else {
                x();
                c9iVar.c = this.i;
            }
            if (!qrfVar.g && (i3 = this.k) != -1) {
                if (i3 < 0 || i3 >= qrfVar.b()) {
                    this.k = -1;
                    this.l = Integer.MIN_VALUE;
                } else {
                    SavedState savedState8 = this.q;
                    if (savedState8 == null || savedState8.a == -1 || savedState8.c < 1) {
                        View findViewByPosition = findViewByPosition(this.k);
                        if (findViewByPosition != null) {
                            c9iVar.a = this.i ? l() : k();
                            if (this.l != Integer.MIN_VALUE) {
                                if (c9iVar.c) {
                                    c9iVar.b = (gwdVar.g() - this.l) - gwdVar.b(findViewByPosition);
                                } else {
                                    c9iVar.b = (gwdVar.k() + this.l) - gwdVar.e(findViewByPosition);
                                }
                            } else if (gwdVar.c(findViewByPosition) > gwdVar.l()) {
                                c9iVar.b = c9iVar.c ? gwdVar.g() : gwdVar.k();
                            } else {
                                int e = gwdVar.e(findViewByPosition) - gwdVar.k();
                                if (e < 0) {
                                    c9iVar.b = -e;
                                } else {
                                    int g = gwdVar.g() - gwdVar.b(findViewByPosition);
                                    if (g < 0) {
                                        c9iVar.b = g;
                                    } else {
                                        c9iVar.b = Integer.MIN_VALUE;
                                    }
                                }
                            }
                        } else {
                            int i9 = this.k;
                            c9iVar.a = i9;
                            int i10 = this.l;
                            if (i10 == Integer.MIN_VALUE) {
                                if (getChildCount() == 0) {
                                }
                                c9iVar.c = z5;
                                gwd gwdVar2 = staggeredGridLayoutManager.c;
                                c9iVar.b = z5 ? gwdVar2.g() : gwdVar2.k();
                            } else {
                                boolean z9 = c9iVar.c;
                                gwd gwdVar3 = staggeredGridLayoutManager.c;
                                if (z9) {
                                    c9iVar.b = gwdVar3.g() - i10;
                                } else {
                                    c9iVar.b = gwdVar3.k() + i10;
                                }
                            }
                            z4 = true;
                            c9iVar.d = true;
                            c9iVar.e = z4;
                        }
                    } else {
                        c9iVar.b = Integer.MIN_VALUE;
                        c9iVar.a = this.k;
                    }
                    z4 = true;
                    c9iVar.e = z4;
                }
            }
            if (this.o) {
                int b = qrfVar.b();
                for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                    i2 = getPosition(getChildAt(childCount));
                    if (i2 >= 0 && i2 < b) {
                        break;
                    }
                }
                i2 = 0;
                c9iVar.a = i2;
                c9iVar.b = Integer.MIN_VALUE;
                z4 = true;
                c9iVar.e = z4;
            } else {
                int b2 = qrfVar.b();
                int childCount2 = getChildCount();
                for (int i11 = 0; i11 < childCount2; i11++) {
                    int position = getPosition(getChildAt(i11));
                    if (position >= 0 && position < b2) {
                        i2 = position;
                        break;
                    }
                }
                i2 = 0;
                c9iVar.a = i2;
                c9iVar.b = Integer.MIN_VALUE;
                z4 = true;
                c9iVar.e = z4;
            }
        }
        if (this.q == null && this.k == -1 && !(c9iVar.c == this.o && isLayoutRTL() == this.p)) {
            yVar.a();
            i = 1;
            c9iVar.d = true;
        } else {
            i = 1;
        }
        if (getChildCount() > 0 && ((savedState = this.q) == null || savedState.c < i)) {
            if (c9iVar.d) {
                for (int i12 = 0; i12 < i4; i12++) {
                    flhVarArr[i12].c();
                    int i13 = c9iVar.b;
                    if (i13 != Integer.MIN_VALUE) {
                        flh flhVar2 = flhVarArr[i12];
                        flhVar2.c = i13;
                        flhVar2.d = i13;
                    }
                }
            } else if (z7 || c9iVar.f == null) {
                for (int i14 = 0; i14 < i4; i14++) {
                    flh flhVar3 = flhVarArr[i14];
                    boolean z10 = this.i;
                    int i15 = c9iVar.b;
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = (StaggeredGridLayoutManager) flhVar3.g;
                    int g2 = z10 ? flhVar3.g(Integer.MIN_VALUE) : flhVar3.j(Integer.MIN_VALUE);
                    flhVar3.c();
                    if (g2 != Integer.MIN_VALUE && ((!z10 || g2 >= staggeredGridLayoutManager2.c.g()) && (z10 || g2 <= staggeredGridLayoutManager2.c.k()))) {
                        if (i15 != Integer.MIN_VALUE) {
                            g2 += i15;
                        }
                        flhVar3.d = g2;
                        flhVar3.c = g2;
                    }
                }
                int length = flhVarArr.length;
                int[] iArr = c9iVar.f;
                if (iArr == null || iArr.length < length) {
                    c9iVar.f = new int[staggeredGridLayoutManager.b.length];
                }
                for (int i16 = 0; i16 < length; i16++) {
                    c9iVar.f[i16] = flhVarArr[i16].j(Integer.MIN_VALUE);
                }
            } else {
                for (int i17 = 0; i17 < i4; i17++) {
                    flh flhVar4 = flhVarArr[i17];
                    flhVar4.c();
                    int i18 = c9iVar.f[i17];
                    flhVar4.c = i18;
                    flhVar4.d = i18;
                }
            }
        }
        detachAndScrapAttachedViews(oVar);
        boa boaVar = this.g;
        boaVar.a = false;
        gwd gwdVar4 = this.d;
        int l = gwdVar4.l();
        this.f = l / i4;
        View.MeasureSpec.makeMeasureSpec(l, gwdVar4.i());
        z(c9iVar.a, qrfVar);
        if (c9iVar.c) {
            y(-1);
            f(oVar, boaVar, qrfVar);
            y(1);
            boaVar.c = c9iVar.a + boaVar.d;
            f(oVar, boaVar, qrfVar);
        } else {
            y(1);
            f(oVar, boaVar, qrfVar);
            y(-1);
            boaVar.c = c9iVar.a + boaVar.d;
            f(oVar, boaVar, qrfVar);
        }
        if (gwdVar4.i() != 1073741824) {
            int childCount3 = getChildCount();
            float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            for (int i19 = 0; i19 < childCount3; i19++) {
                View childAt = getChildAt(i19);
                float c = gwdVar4.c(childAt);
                if (c >= f) {
                    ((d9i) childAt.getLayoutParams()).getClass();
                    f = Math.max(f, c);
                }
            }
            int i20 = this.f;
            int round = Math.round(f * i4);
            if (gwdVar4.i() == Integer.MIN_VALUE) {
                round = Math.min(round, gwdVar4.l());
            }
            this.f = round / i4;
            View.MeasureSpec.makeMeasureSpec(round, gwdVar4.i());
            if (this.f != i20) {
                for (int i21 = 0; i21 < childCount3; i21++) {
                    View childAt2 = getChildAt(i21);
                    d9i d9iVar = (d9i) childAt2.getLayoutParams();
                    d9iVar.getClass();
                    boolean isLayoutRTL = isLayoutRTL();
                    int i22 = this.e;
                    if (isLayoutRTL && i22 == 1) {
                        int i23 = -((i4 - 1) - d9iVar.e.f);
                        childAt2.offsetLeftAndRight((this.f * i23) - (i23 * i20));
                    } else {
                        int i24 = d9iVar.e.f;
                        int i25 = this.f * i24;
                        int i26 = i24 * i20;
                        if (i22 == 1) {
                            childAt2.offsetLeftAndRight(i25 - i26);
                        } else {
                            childAt2.offsetTopAndBottom(i25 - i26);
                        }
                    }
                }
            }
        }
        if (getChildCount() <= 0) {
            z2 = true;
        } else if (this.i) {
            z2 = true;
            i(oVar, qrfVar, true);
            j(oVar, qrfVar, false);
        } else {
            z2 = true;
            j(oVar, qrfVar, true);
            i(oVar, qrfVar, false);
        }
        if (z && !qrfVar.g && this.n != 0 && getChildCount() > 0 && p() != null) {
            removeCallbacks(this.v);
            if (d()) {
                z3 = z2;
                if (qrfVar.g) {
                    c9iVar.a();
                }
                this.o = c9iVar.c;
                this.p = isLayoutRTL();
                if (z3) {
                    return;
                }
                c9iVar.a();
                r(oVar, qrfVar, false);
                return;
            }
        }
        z3 = false;
        if (qrfVar.g) {
        }
        this.o = c9iVar.c;
        this.p = isLayoutRTL();
        if (z3) {
        }
    }

    public final boolean s(int i) {
        if (this.e == 0) {
            return (i == -1) != this.i;
        }
        return ((i == -1) == this.i) == isLayoutRTL();
    }

    public final int scrollBy(int i, o oVar, qrf qrfVar) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        t(i, qrfVar);
        boa boaVar = this.g;
        int f = f(oVar, boaVar, qrfVar);
        if (boaVar.b >= f) {
            i = i < 0 ? -f : f;
        }
        this.c.o(-i);
        this.o = this.i;
        boaVar.b = 0;
        u(oVar, boaVar);
        return i;
    }

    @Override // androidx.recyclerview.widget.n
    public final int scrollHorizontallyBy(int i, o oVar, qrf qrfVar) {
        return scrollBy(i, oVar, qrfVar);
    }

    @Override // androidx.recyclerview.widget.n
    public final void scrollToPosition(int i) {
        SavedState savedState = this.q;
        if (savedState != null && savedState.a != i) {
            savedState.d = null;
            savedState.c = 0;
            savedState.a = -1;
            savedState.b = -1;
        }
        this.k = i;
        this.l = Integer.MIN_VALUE;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.n
    public final int scrollVerticallyBy(int i, o oVar, qrf qrfVar) {
        return scrollBy(i, oVar, qrfVar);
    }

    @Override // androidx.recyclerview.widget.n
    public final void setMeasuredDimension(Rect rect, int i, int i2) {
        int chooseSize;
        int chooseSize2;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.e == 1) {
            chooseSize2 = n.chooseSize(i2, rect.height() + paddingBottom, getMinimumHeight());
            chooseSize = n.chooseSize(i, (this.f * this.a) + paddingRight, getMinimumWidth());
        } else {
            chooseSize = n.chooseSize(i, rect.width() + paddingRight, getMinimumWidth());
            chooseSize2 = n.chooseSize(i2, (this.f * this.a) + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(chooseSize, chooseSize2);
    }

    @Override // androidx.recyclerview.widget.n
    public final void smoothScrollToPosition(RecyclerView recyclerView, qrf qrfVar, int i) {
        f8b f8bVar = new f8b(recyclerView.getContext());
        f8bVar.setTargetPosition(i);
        startSmoothScroll(f8bVar);
    }

    @Override // androidx.recyclerview.widget.n
    public final boolean supportsPredictiveItemAnimations() {
        return this.q == null;
    }

    public final void t(int i, qrf qrfVar) {
        int k;
        int i2;
        if (i > 0) {
            k = l();
            i2 = 1;
        } else {
            k = k();
            i2 = -1;
        }
        boa boaVar = this.g;
        boaVar.a = true;
        z(k, qrfVar);
        y(i2);
        boaVar.c = k + boaVar.d;
        boaVar.b = Math.abs(i);
    }

    public final void u(o oVar, boa boaVar) {
        if (!boaVar.a || boaVar.i) {
            return;
        }
        int i = boaVar.b;
        int i2 = boaVar.e;
        if (i == 0) {
            if (i2 == -1) {
                v(boaVar.g, oVar);
                return;
            } else {
                w(boaVar.f, oVar);
                return;
            }
        }
        int i3 = this.a;
        flh[] flhVarArr = this.b;
        int i4 = 1;
        if (i2 == -1) {
            int i5 = boaVar.f;
            int j = flhVarArr[0].j(i5);
            while (i4 < i3) {
                int j2 = flhVarArr[i4].j(i5);
                if (j2 > j) {
                    j = j2;
                }
                i4++;
            }
            int i6 = i5 - j;
            int i7 = boaVar.g;
            if (i6 >= 0) {
                i7 -= Math.min(i6, boaVar.b);
            }
            v(i7, oVar);
            return;
        }
        int i8 = boaVar.g;
        int g = flhVarArr[0].g(i8);
        while (i4 < i3) {
            int g2 = flhVarArr[i4].g(i8);
            if (g2 < g) {
                g = g2;
            }
            i4++;
        }
        int i9 = g - boaVar.g;
        int i10 = boaVar.f;
        if (i9 >= 0) {
            i10 += Math.min(i9, boaVar.b);
        }
        w(i10, oVar);
    }

    public final void v(int i, o oVar) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            gwd gwdVar = this.c;
            if (gwdVar.e(childAt) < i || gwdVar.n(childAt) < i) {
                return;
            }
            d9i d9iVar = (d9i) childAt.getLayoutParams();
            d9iVar.getClass();
            if (d9iVar.e.b.size() == 1) {
                return;
            }
            flh flhVar = d9iVar.e;
            ArrayList arrayList = flhVar.b;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            d9i d9iVar2 = (d9i) view.getLayoutParams();
            d9iVar2.e = null;
            if (d9iVar2.a.isRemoved() || d9iVar2.a.isUpdated()) {
                flhVar.e -= ((StaggeredGridLayoutManager) flhVar.g).c.c(view);
            }
            if (size == 1) {
                flhVar.c = Integer.MIN_VALUE;
            }
            flhVar.d = Integer.MIN_VALUE;
            removeAndRecycleView(childAt, oVar);
        }
    }

    public final void w(int i, o oVar) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            gwd gwdVar = this.c;
            if (gwdVar.b(childAt) > i || gwdVar.m(childAt) > i) {
                return;
            }
            d9i d9iVar = (d9i) childAt.getLayoutParams();
            d9iVar.getClass();
            if (d9iVar.e.b.size() == 1) {
                return;
            }
            flh flhVar = d9iVar.e;
            ArrayList arrayList = flhVar.b;
            View view = (View) arrayList.remove(0);
            d9i d9iVar2 = (d9i) view.getLayoutParams();
            d9iVar2.e = null;
            if (arrayList.size() == 0) {
                flhVar.d = Integer.MIN_VALUE;
            }
            if (d9iVar2.a.isRemoved() || d9iVar2.a.isUpdated()) {
                flhVar.e -= ((StaggeredGridLayoutManager) flhVar.g).c.c(view);
            }
            flhVar.c = Integer.MIN_VALUE;
            removeAndRecycleView(childAt, oVar);
        }
    }

    public final void x() {
        if (this.e == 1 || !isLayoutRTL()) {
            this.i = this.h;
        } else {
            this.i = !this.h;
        }
    }

    public final void y(int i) {
        boa boaVar = this.g;
        boaVar.e = i;
        boaVar.d = this.i != (i == -1) ? -1 : 1;
    }

    public final void z(int i, qrf qrfVar) {
        int i2;
        int i3;
        int i4;
        boa boaVar = this.g;
        boolean z = false;
        boaVar.b = 0;
        boaVar.c = i;
        if (!isSmoothScrolling() || (i4 = qrfVar.a) == -1) {
            i2 = 0;
            i3 = 0;
        } else {
            boolean z2 = this.i;
            boolean z3 = i4 < i;
            gwd gwdVar = this.c;
            if (z2 == z3) {
                i2 = gwdVar.l();
                i3 = 0;
            } else {
                i3 = gwdVar.l();
                i2 = 0;
            }
        }
        if (getClipToPadding()) {
            boaVar.f = this.c.k() - i3;
            boaVar.g = this.c.g() + i2;
        } else {
            boaVar.g = this.c.f() + i2;
            boaVar.f = -i3;
        }
        boaVar.h = false;
        boaVar.a = true;
        if (this.c.i() == 0 && this.c.f() == 0) {
            z = true;
        }
        boaVar.i = z;
    }

    @Override // androidx.recyclerview.widget.n
    public final hrf generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new d9i(context, attributeSet);
    }
}
