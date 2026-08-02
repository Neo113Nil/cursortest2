package com.google.android.flexbox;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.core.view.AbstractC2118w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.flexbox.a f31969a;
    private boolean[] mChildrenFrozen;
    int[] mIndexToFlexLine;
    long[] mMeasureSpecCache;
    private long[] mMeasuredSizeCache;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public List f31970a;

        /* renamed from: b, reason: collision with root package name */
        public int f31971b;

        public void a() {
            this.f31970a = null;
            this.f31971b = 0;
        }
    }

    /* renamed from: com.google.android.flexbox.c$c, reason: collision with other inner class name */
    public static class C0487c implements Comparable {

        /* renamed from: a, reason: collision with root package name */
        public int f31972a;

        /* renamed from: b, reason: collision with root package name */
        public int f31973b;

        public C0487c() {
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(C0487c c0487c) {
            int i10 = this.f31973b;
            int i11 = c0487c.f31973b;
            return i10 != i11 ? i10 - i11 : this.f31972a - c0487c.f31972a;
        }

        public String toString() {
            return "Order{order=" + this.f31973b + ", index=" + this.f31972a + '}';
        }
    }

    public c(com.google.android.flexbox.a aVar) {
        this.f31969a = aVar;
    }

    public final int A(int i10, FlexItem flexItem, int i11) {
        com.google.android.flexbox.a aVar = this.f31969a;
        int e10 = aVar.e(i10, aVar.getPaddingLeft() + this.f31969a.getPaddingRight() + flexItem.L() + flexItem.V() + i11, flexItem.getWidth());
        int size = View.MeasureSpec.getSize(e10);
        return size > flexItem.E() ? View.MeasureSpec.makeMeasureSpec(flexItem.E(), View.MeasureSpec.getMode(e10)) : size < flexItem.r() ? View.MeasureSpec.makeMeasureSpec(flexItem.r(), View.MeasureSpec.getMode(e10)) : e10;
    }

    public final int B(FlexItem flexItem, boolean z10) {
        return z10 ? flexItem.K() : flexItem.V();
    }

    public final int C(FlexItem flexItem, boolean z10) {
        return z10 ? flexItem.V() : flexItem.K();
    }

    public final int D(FlexItem flexItem, boolean z10) {
        return z10 ? flexItem.u() : flexItem.L();
    }

    public final int E(FlexItem flexItem, boolean z10) {
        return z10 ? flexItem.L() : flexItem.u();
    }

    public final int F(FlexItem flexItem, boolean z10) {
        return z10 ? flexItem.getHeight() : flexItem.getWidth();
    }

    public final int G(FlexItem flexItem, boolean z10) {
        return z10 ? flexItem.getWidth() : flexItem.getHeight();
    }

    public final int H(boolean z10) {
        return z10 ? this.f31969a.getPaddingBottom() : this.f31969a.getPaddingEnd();
    }

    public final int I(boolean z10) {
        return z10 ? this.f31969a.getPaddingEnd() : this.f31969a.getPaddingBottom();
    }

    public final int J(boolean z10) {
        return z10 ? this.f31969a.getPaddingTop() : this.f31969a.getPaddingStart();
    }

    public final int K(boolean z10) {
        return z10 ? this.f31969a.getPaddingStart() : this.f31969a.getPaddingTop();
    }

    public final int L(View view, boolean z10) {
        return z10 ? view.getMeasuredHeight() : view.getMeasuredWidth();
    }

    public final int M(View view, boolean z10) {
        return z10 ? view.getMeasuredWidth() : view.getMeasuredHeight();
    }

    public final boolean N(int i10, int i11, com.google.android.flexbox.b bVar) {
        return i10 == i11 - 1 && bVar.c() != 0;
    }

    public boolean O(SparseIntArray sparseIntArray) {
        int flexItemCount = this.f31969a.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            return true;
        }
        for (int i10 = 0; i10 < flexItemCount; i10++) {
            View g10 = this.f31969a.g(i10);
            if (g10 != null && ((FlexItem) g10.getLayoutParams()).getOrder() != sparseIntArray.get(i10)) {
                return true;
            }
        }
        return false;
    }

    public final boolean P(View view, int i10, int i11, int i12, int i13, FlexItem flexItem, int i14, int i15, int i16) {
        if (this.f31969a.getFlexWrap() == 0) {
            return false;
        }
        if (flexItem.B()) {
            return true;
        }
        if (i10 == 0) {
            return false;
        }
        int maxLine = this.f31969a.getMaxLine();
        if (maxLine != -1 && maxLine <= i16 + 1) {
            return false;
        }
        int p10 = this.f31969a.p(view, i14, i15);
        if (p10 > 0) {
            i13 += p10;
        }
        return i11 < i12 + i13;
    }

    public void Q(View view, com.google.android.flexbox.b bVar, int i10, int i11, int i12, int i13) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int alignItems = this.f31969a.getAlignItems();
        if (flexItem.o() != -1) {
            alignItems = flexItem.o();
        }
        int i14 = bVar.f31957g;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (this.f31969a.getFlexWrap() == 2) {
                    view.layout(i10, (i11 - i14) + view.getMeasuredHeight() + flexItem.u(), i12, (i13 - i14) + view.getMeasuredHeight() + flexItem.u());
                    return;
                } else {
                    int i15 = i11 + i14;
                    view.layout(i10, (i15 - view.getMeasuredHeight()) - flexItem.K(), i12, i15 - flexItem.K());
                    return;
                }
            }
            if (alignItems == 2) {
                int measuredHeight = (((i14 - view.getMeasuredHeight()) + flexItem.u()) - flexItem.K()) / 2;
                if (this.f31969a.getFlexWrap() != 2) {
                    int i16 = i11 + measuredHeight;
                    view.layout(i10, i16, i12, view.getMeasuredHeight() + i16);
                    return;
                } else {
                    int i17 = i11 - measuredHeight;
                    view.layout(i10, i17, i12, view.getMeasuredHeight() + i17);
                    return;
                }
            }
            if (alignItems == 3) {
                if (this.f31969a.getFlexWrap() != 2) {
                    int max = Math.max(bVar.f31962l - view.getBaseline(), flexItem.u());
                    view.layout(i10, i11 + max, i12, i13 + max);
                    return;
                } else {
                    int max2 = Math.max((bVar.f31962l - view.getMeasuredHeight()) + view.getBaseline(), flexItem.K());
                    view.layout(i10, i11 - max2, i12, i13 - max2);
                    return;
                }
            }
            if (alignItems != 4) {
                return;
            }
        }
        if (this.f31969a.getFlexWrap() != 2) {
            view.layout(i10, i11 + flexItem.u(), i12, i13 + flexItem.u());
        } else {
            view.layout(i10, i11 - flexItem.K(), i12, i13 - flexItem.K());
        }
    }

    public void R(View view, com.google.android.flexbox.b bVar, boolean z10, int i10, int i11, int i12, int i13) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int alignItems = this.f31969a.getAlignItems();
        if (flexItem.o() != -1) {
            alignItems = flexItem.o();
        }
        int i14 = bVar.f31957g;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (z10) {
                    view.layout((i10 - i14) + view.getMeasuredWidth() + flexItem.L(), i11, (i12 - i14) + view.getMeasuredWidth() + flexItem.L(), i13);
                    return;
                } else {
                    view.layout(((i10 + i14) - view.getMeasuredWidth()) - flexItem.V(), i11, ((i12 + i14) - view.getMeasuredWidth()) - flexItem.V(), i13);
                    return;
                }
            }
            if (alignItems == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int measuredWidth = (((i14 - view.getMeasuredWidth()) + AbstractC2118w.b(marginLayoutParams)) - AbstractC2118w.a(marginLayoutParams)) / 2;
                if (z10) {
                    view.layout(i10 - measuredWidth, i11, i12 - measuredWidth, i13);
                    return;
                } else {
                    view.layout(i10 + measuredWidth, i11, i12 + measuredWidth, i13);
                    return;
                }
            }
            if (alignItems != 3 && alignItems != 4) {
                return;
            }
        }
        if (z10) {
            view.layout(i10 - flexItem.V(), i11, i12 - flexItem.V(), i13);
        } else {
            view.layout(i10 + flexItem.L(), i11, i12 + flexItem.L(), i13);
        }
    }

    public long S(int i10, int i11) {
        return (i10 & BodyPartID.bodyIdMax) | (i11 << 32);
    }

    public final void T(int i10, int i11, com.google.android.flexbox.b bVar, int i12, int i13, boolean z10) {
        float f10;
        float f11;
        int i14;
        int i15;
        int i16 = bVar.f31955e;
        float f12 = bVar.f31961k;
        float f13 = 0.0f;
        if (f12 <= 0.0f || i12 > i16) {
            return;
        }
        float f14 = (i16 - i12) / f12;
        bVar.f31955e = i13 + bVar.f31956f;
        if (!z10) {
            bVar.f31957g = Integer.MIN_VALUE;
        }
        int i17 = 0;
        boolean z11 = false;
        int i18 = 0;
        float f15 = 0.0f;
        while (i17 < bVar.f31958h) {
            int i19 = bVar.f31965o + i17;
            View n10 = this.f31969a.n(i19);
            if (n10 == null || n10.getVisibility() == 8) {
                f10 = f13;
                f11 = f14;
            } else {
                FlexItem flexItem = (FlexItem) n10.getLayoutParams();
                int flexDirection = this.f31969a.getFlexDirection();
                f10 = f13;
                if (flexDirection == 0 || flexDirection == 1) {
                    int measuredWidth = n10.getMeasuredWidth();
                    long[] jArr = this.mMeasuredSizeCache;
                    if (jArr != null) {
                        measuredWidth = y(jArr[i19]);
                    }
                    int measuredHeight = n10.getMeasuredHeight();
                    long[] jArr2 = this.mMeasuredSizeCache;
                    f11 = f14;
                    if (jArr2 != null) {
                        measuredHeight = x(jArr2[i19]);
                    }
                    if (!this.mChildrenFrozen[i19] && flexItem.p() > f10) {
                        float p10 = measuredWidth - (f11 * flexItem.p());
                        if (i17 == bVar.f31958h - 1) {
                            p10 += f15;
                            f15 = f10;
                        }
                        int round = Math.round(p10);
                        if (round < flexItem.r()) {
                            i15 = flexItem.r();
                            this.mChildrenFrozen[i19] = true;
                            bVar.f31961k -= flexItem.p();
                            z11 = true;
                        } else {
                            f15 += p10 - round;
                            double d10 = f15;
                            if (d10 > 1.0d) {
                                i15 = round + 1;
                                f15 -= 1.0f;
                            } else if (d10 < -1.0d) {
                                i15 = round - 1;
                                f15 += 1.0f;
                            } else {
                                i15 = round;
                            }
                        }
                        int z12 = z(i11, flexItem, bVar.f31963m);
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
                        n10.measure(makeMeasureSpec, z12);
                        int measuredWidth2 = n10.getMeasuredWidth();
                        int measuredHeight2 = n10.getMeasuredHeight();
                        Z(i19, makeMeasureSpec, z12, n10);
                        this.f31969a.o(i19, n10);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int max = Math.max(i18, measuredHeight + flexItem.u() + flexItem.K() + this.f31969a.l(n10));
                    bVar.f31955e += measuredWidth + flexItem.L() + flexItem.V();
                    i14 = max;
                } else {
                    int measuredHeight3 = n10.getMeasuredHeight();
                    long[] jArr3 = this.mMeasuredSizeCache;
                    if (jArr3 != null) {
                        measuredHeight3 = x(jArr3[i19]);
                    }
                    int measuredWidth3 = n10.getMeasuredWidth();
                    long[] jArr4 = this.mMeasuredSizeCache;
                    if (jArr4 != null) {
                        measuredWidth3 = y(jArr4[i19]);
                    }
                    if (!this.mChildrenFrozen[i19] && flexItem.p() > f10) {
                        float p11 = measuredHeight3 - (flexItem.p() * f14);
                        if (i17 == bVar.f31958h - 1) {
                            p11 += f15;
                            f15 = f10;
                        }
                        int round2 = Math.round(p11);
                        if (round2 < flexItem.X()) {
                            round2 = flexItem.X();
                            this.mChildrenFrozen[i19] = true;
                            bVar.f31961k -= flexItem.p();
                            z11 = true;
                        } else {
                            f15 += p11 - round2;
                            double d11 = f15;
                            if (d11 > 1.0d) {
                                round2++;
                                f15 -= 1.0f;
                            } else if (d11 < -1.0d) {
                                round2--;
                                f15 += 1.0f;
                            }
                        }
                        int A10 = A(i10, flexItem, bVar.f31963m);
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                        n10.measure(A10, makeMeasureSpec2);
                        int measuredWidth4 = n10.getMeasuredWidth();
                        int measuredHeight4 = n10.getMeasuredHeight();
                        Z(i19, A10, makeMeasureSpec2, n10);
                        this.f31969a.o(i19, n10);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    i14 = Math.max(i18, measuredWidth3 + flexItem.L() + flexItem.V() + this.f31969a.l(n10));
                    bVar.f31955e += measuredHeight3 + flexItem.u() + flexItem.K();
                    f11 = f14;
                }
                bVar.f31957g = Math.max(bVar.f31957g, i14);
                i18 = i14;
            }
            i17++;
            f14 = f11;
            f13 = f10;
        }
        if (!z11 || i16 == bVar.f31955e) {
            return;
        }
        T(i10, i11, bVar, i12, i13, true);
    }

    public final int[] U(int i10, List list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i10];
        Iterator it = list.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            C0487c c0487c = (C0487c) it.next();
            int i12 = c0487c.f31972a;
            iArr[i11] = i12;
            sparseIntArray.append(i12, c0487c.f31973b);
            i11++;
        }
        return iArr;
    }

    public final void V(View view, int i10, int i11) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int min = Math.min(Math.max(((i10 - flexItem.L()) - flexItem.V()) - this.f31969a.l(view), flexItem.r()), flexItem.E());
        long[] jArr = this.mMeasuredSizeCache;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? x(jArr[i11]) : view.getMeasuredHeight(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec2, makeMeasureSpec);
        Z(i11, makeMeasureSpec2, makeMeasureSpec, view);
        this.f31969a.o(i11, view);
    }

    public final void W(View view, int i10, int i11) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int min = Math.min(Math.max(((i10 - flexItem.u()) - flexItem.K()) - this.f31969a.l(view), flexItem.X()), flexItem.b0());
        long[] jArr = this.mMeasuredSizeCache;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? y(jArr[i11]) : view.getMeasuredWidth(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        Z(i11, makeMeasureSpec, makeMeasureSpec2, view);
        this.f31969a.o(i11, view);
    }

    public void X() {
        Y(0);
    }

    public void Y(int i10) {
        View n10;
        if (i10 >= this.f31969a.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.f31969a.getFlexDirection();
        if (this.f31969a.getAlignItems() != 4) {
            for (com.google.android.flexbox.b bVar : this.f31969a.getFlexLinesInternal()) {
                for (Integer num : bVar.f31964n) {
                    View n11 = this.f31969a.n(num.intValue());
                    if (flexDirection == 0 || flexDirection == 1) {
                        W(n11, bVar.f31957g, num.intValue());
                    } else {
                        if (flexDirection != 2 && flexDirection != 3) {
                            throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
                        }
                        V(n11, bVar.f31957g, num.intValue());
                    }
                }
            }
            return;
        }
        int[] iArr = this.mIndexToFlexLine;
        List flexLinesInternal = this.f31969a.getFlexLinesInternal();
        int size = flexLinesInternal.size();
        for (int i11 = iArr != null ? iArr[i10] : 0; i11 < size; i11++) {
            com.google.android.flexbox.b bVar2 = (com.google.android.flexbox.b) flexLinesInternal.get(i11);
            int i12 = bVar2.f31958h;
            for (int i13 = 0; i13 < i12; i13++) {
                int i14 = bVar2.f31965o + i13;
                if (i13 < this.f31969a.getFlexItemCount() && (n10 = this.f31969a.n(i14)) != null && n10.getVisibility() != 8) {
                    FlexItem flexItem = (FlexItem) n10.getLayoutParams();
                    if (flexItem.o() == -1 || flexItem.o() == 4) {
                        if (flexDirection == 0 || flexDirection == 1) {
                            W(n10, bVar2.f31957g, i14);
                        } else {
                            if (flexDirection != 2 && flexDirection != 3) {
                                throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
                            }
                            V(n10, bVar2.f31957g, i14);
                        }
                    }
                }
            }
        }
    }

    public final void Z(int i10, int i11, int i12, View view) {
        long[] jArr = this.mMeasureSpecCache;
        if (jArr != null) {
            jArr[i10] = S(i11, i12);
        }
        long[] jArr2 = this.mMeasuredSizeCache;
        if (jArr2 != null) {
            jArr2[i10] = S(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    public final void a(List list, com.google.android.flexbox.b bVar, int i10, int i11) {
        bVar.f31963m = i11;
        this.f31969a.m(bVar);
        bVar.f31966p = i10;
        list.add(bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void b(b bVar, int i10, int i11, int i12, int i13, int i14, List list) {
        int i15;
        b bVar2;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        com.google.android.flexbox.b bVar3;
        int i25;
        int i26;
        boolean z10;
        int i27;
        boolean z11;
        int i28;
        int i29 = i10;
        boolean q10 = this.f31969a.q();
        int mode = View.MeasureSpec.getMode(i29);
        int size = View.MeasureSpec.getSize(i29);
        List arrayList = list == null ? new ArrayList() : list;
        bVar.f31970a = arrayList;
        boolean z12 = i14 == -1;
        int K10 = K(q10);
        int I10 = I(q10);
        int J10 = J(q10);
        int H10 = H(q10);
        com.google.android.flexbox.b bVar4 = new com.google.android.flexbox.b();
        int i30 = i13;
        bVar4.f31965o = i30;
        int i31 = K10 + I10;
        bVar4.f31955e = i31;
        int flexItemCount = this.f31969a.getFlexItemCount();
        boolean z13 = z12;
        com.google.android.flexbox.b bVar5 = bVar4;
        int i32 = Integer.MIN_VALUE;
        int i33 = 0;
        int i34 = 0;
        int i35 = 0;
        while (true) {
            if (i30 >= flexItemCount) {
                i15 = i34;
                bVar2 = bVar;
                break;
            }
            View n10 = this.f31969a.n(i30);
            if (n10 == null) {
                if (N(i30, flexItemCount, bVar5)) {
                    a(arrayList, bVar5, i30, i33);
                }
                i16 = i31;
            } else {
                i16 = i31;
                if (n10.getVisibility() == 8) {
                    bVar5.f31959i++;
                    bVar5.f31958h++;
                    if (N(i30, flexItemCount, bVar5)) {
                        a(arrayList, bVar5, i30, i33);
                    }
                } else {
                    if (n10 instanceof CompoundButton) {
                        v((CompoundButton) n10);
                    }
                    FlexItem flexItem = (FlexItem) n10.getLayoutParams();
                    int i36 = flexItemCount;
                    if (flexItem.o() == 4) {
                        bVar5.f31964n.add(Integer.valueOf(i30));
                    }
                    int G10 = G(flexItem, q10);
                    if (flexItem.A() != -1.0f && mode == 1073741824) {
                        G10 = Math.round(size * flexItem.A());
                    }
                    if (q10) {
                        i18 = mode;
                        i21 = this.f31969a.e(i29, i16 + E(flexItem, true) + C(flexItem, true), G10);
                        i17 = size;
                        i19 = i33;
                        int i37 = this.f31969a.i(i11, J10 + H10 + D(flexItem, true) + B(flexItem, true) + i33, F(flexItem, true));
                        n10.measure(i21, i37);
                        Z(i30, i21, i37, n10);
                        i20 = 0;
                    } else {
                        i17 = size;
                        i18 = mode;
                        i19 = i33;
                        i20 = 0;
                        int e10 = this.f31969a.e(i11, J10 + H10 + D(flexItem, false) + B(flexItem, false) + i19, F(flexItem, false));
                        int i38 = this.f31969a.i(i29, i16 + E(flexItem, false) + C(flexItem, false), G10);
                        n10.measure(e10, i38);
                        Z(i30, e10, i38, n10);
                        i21 = i38;
                    }
                    this.f31969a.o(i30, n10);
                    i(n10, i30);
                    i34 = View.combineMeasuredStates(i34, n10.getMeasuredState());
                    int i39 = i20;
                    i22 = i30;
                    int i40 = i21;
                    com.google.android.flexbox.b bVar6 = bVar5;
                    int i41 = i35;
                    i23 = i16;
                    i24 = i19;
                    boolean z14 = q10;
                    size = i17;
                    if (P(n10, i18, size, bVar5.f31955e, M(n10, q10) + E(flexItem, q10) + C(flexItem, q10), flexItem, i22, i41, arrayList.size())) {
                        if (bVar6.c() > 0) {
                            a(arrayList, bVar6, i22 > 0 ? i22 - 1 : i39, i24);
                            i28 = i24 + bVar6.f31957g;
                        } else {
                            i28 = i24;
                        }
                        if (z14) {
                            if (flexItem.getHeight() == -1) {
                                com.google.android.flexbox.a aVar = this.f31969a;
                                n10.measure(i40, aVar.i(i11, aVar.getPaddingTop() + this.f31969a.getPaddingBottom() + flexItem.u() + flexItem.K() + i28, flexItem.getHeight()));
                                i(n10, i22);
                            }
                        } else if (flexItem.getWidth() == -1) {
                            com.google.android.flexbox.a aVar2 = this.f31969a;
                            n10.measure(aVar2.e(i11, aVar2.getPaddingLeft() + this.f31969a.getPaddingRight() + flexItem.L() + flexItem.V() + i28, flexItem.getWidth()), i40);
                            i(n10, i22);
                        }
                        com.google.android.flexbox.b bVar7 = new com.google.android.flexbox.b();
                        bVar7.f31958h = 1;
                        bVar7.f31955e = i23;
                        bVar7.f31965o = i22;
                        i24 = i28;
                        i25 = i39;
                        bVar3 = bVar7;
                        i26 = Integer.MIN_VALUE;
                    } else {
                        bVar3 = bVar6;
                        bVar3.f31958h++;
                        i25 = i41 + 1;
                        i26 = i32;
                    }
                    bVar3.f31967q = (bVar3.f31967q ? 1 : 0) | (flexItem.y() != 0.0f ? 1 : i39);
                    bVar3.f31968r = (bVar3.f31968r ? 1 : 0) | (flexItem.p() != 0.0f ? 1 : i39);
                    int[] iArr = this.mIndexToFlexLine;
                    if (iArr != null) {
                        iArr[i22] = arrayList.size();
                    }
                    z10 = z14;
                    bVar3.f31955e += M(n10, z10) + E(flexItem, z10) + C(flexItem, z10);
                    bVar3.f31960j += flexItem.y();
                    bVar3.f31961k += flexItem.p();
                    this.f31969a.d(n10, i22, i25, bVar3);
                    int max = Math.max(i26, L(n10, z10) + D(flexItem, z10) + B(flexItem, z10) + this.f31969a.l(n10));
                    bVar3.f31957g = Math.max(bVar3.f31957g, max);
                    if (z10) {
                        if (this.f31969a.getFlexWrap() != 2) {
                            bVar3.f31962l = Math.max(bVar3.f31962l, n10.getBaseline() + flexItem.u());
                        } else {
                            bVar3.f31962l = Math.max(bVar3.f31962l, (n10.getMeasuredHeight() - n10.getBaseline()) + flexItem.K());
                        }
                    }
                    i27 = i36;
                    if (N(i22, i27, bVar3)) {
                        a(arrayList, bVar3, i22, i24);
                        i24 += bVar3.f31957g;
                    }
                    if (i14 != -1 && arrayList.size() > 0) {
                        if (((com.google.android.flexbox.b) arrayList.get(arrayList.size() - 1)).f31966p >= i14 && i22 >= i14 && !z13) {
                            i24 = -bVar3.a();
                            z11 = true;
                            if (i24 <= i12 && z11) {
                                bVar2 = bVar;
                                i15 = i34;
                                break;
                            }
                            i32 = max;
                            z13 = z11;
                            i35 = i25;
                            int i42 = i22 + 1;
                            q10 = z10;
                            bVar5 = bVar3;
                            i31 = i23;
                            i33 = i24;
                            i29 = i10;
                            flexItemCount = i27;
                            i30 = i42;
                            mode = i18;
                        }
                    }
                    z11 = z13;
                    if (i24 <= i12) {
                    }
                    i32 = max;
                    z13 = z11;
                    i35 = i25;
                    int i422 = i22 + 1;
                    q10 = z10;
                    bVar5 = bVar3;
                    i31 = i23;
                    i33 = i24;
                    i29 = i10;
                    flexItemCount = i27;
                    i30 = i422;
                    mode = i18;
                }
            }
            i22 = i30;
            i18 = mode;
            i27 = flexItemCount;
            i24 = i33;
            z10 = q10;
            i23 = i16;
            bVar3 = bVar5;
            int i4222 = i22 + 1;
            q10 = z10;
            bVar5 = bVar3;
            i31 = i23;
            i33 = i24;
            i29 = i10;
            flexItemCount = i27;
            i30 = i4222;
            mode = i18;
        }
        bVar2.f31971b = i15;
    }

    public void c(b bVar, int i10, int i11) {
        b(bVar, i10, i11, Integer.MAX_VALUE, 0, -1, null);
    }

    public void d(b bVar, int i10, int i11, int i12, int i13, List list) {
        b(bVar, i10, i11, i12, i13, -1, list);
    }

    public void e(b bVar, int i10, int i11, int i12, int i13, List list) {
        b(bVar, i10, i11, i12, 0, i13, list);
    }

    public void f(b bVar, int i10, int i11) {
        b(bVar, i11, i10, Integer.MAX_VALUE, 0, -1, null);
    }

    public void g(b bVar, int i10, int i11, int i12, int i13, List list) {
        b(bVar, i11, i10, i12, i13, -1, list);
    }

    public void h(b bVar, int i10, int i11, int i12, int i13, List list) {
        b(bVar, i11, i10, i12, 0, i13, list);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(View view, int i10) {
        boolean z10;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        boolean z11 = true;
        if (measuredWidth < flexItem.r()) {
            measuredWidth = flexItem.r();
        } else {
            if (measuredWidth <= flexItem.E()) {
                z10 = false;
                if (measuredHeight >= flexItem.X()) {
                    measuredHeight = flexItem.X();
                } else if (measuredHeight > flexItem.b0()) {
                    measuredHeight = flexItem.b0();
                } else {
                    z11 = z10;
                }
                if (z11) {
                    return;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
                view.measure(makeMeasureSpec, makeMeasureSpec2);
                Z(i10, makeMeasureSpec, makeMeasureSpec2, view);
                this.f31969a.o(i10, view);
                return;
            }
            measuredWidth = flexItem.E();
        }
        z10 = true;
        if (measuredHeight >= flexItem.X()) {
        }
        if (z11) {
        }
    }

    public void j(List list, int i10) {
        int i11 = this.mIndexToFlexLine[i10];
        if (i11 == -1) {
            i11 = 0;
        }
        if (list.size() > i11) {
            list.subList(i11, list.size()).clear();
        }
        int[] iArr = this.mIndexToFlexLine;
        int length = iArr.length - 1;
        if (i10 > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i10, length, -1);
        }
        long[] jArr = this.mMeasureSpecCache;
        int length2 = jArr.length - 1;
        if (i10 > length2) {
            Arrays.fill(jArr, 0L);
        } else {
            Arrays.fill(jArr, i10, length2, 0L);
        }
    }

    public final List k(List list, int i10, int i11) {
        int i12 = (i10 - i11) / 2;
        ArrayList arrayList = new ArrayList();
        com.google.android.flexbox.b bVar = new com.google.android.flexbox.b();
        bVar.f31957g = i12;
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            if (i13 == 0) {
                arrayList.add(bVar);
            }
            arrayList.add((com.google.android.flexbox.b) list.get(i13));
            if (i13 == list.size() - 1) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public final List l(int i10) {
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            FlexItem flexItem = (FlexItem) this.f31969a.g(i11).getLayoutParams();
            C0487c c0487c = new C0487c();
            c0487c.f31973b = flexItem.getOrder();
            c0487c.f31972a = i11;
            arrayList.add(c0487c);
        }
        return arrayList;
    }

    public int[] m(SparseIntArray sparseIntArray) {
        int flexItemCount = this.f31969a.getFlexItemCount();
        return U(flexItemCount, l(flexItemCount), sparseIntArray);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int[] n(View view, int i10, ViewGroup.LayoutParams layoutParams, SparseIntArray sparseIntArray) {
        int flexItemCount = this.f31969a.getFlexItemCount();
        List l10 = l(flexItemCount);
        C0487c c0487c = new C0487c();
        if (view == null || !(layoutParams instanceof FlexItem)) {
            c0487c.f31973b = 1;
        } else {
            c0487c.f31973b = ((FlexItem) layoutParams).getOrder();
        }
        if (i10 == -1 || i10 == flexItemCount) {
            c0487c.f31972a = flexItemCount;
        } else if (i10 < this.f31969a.getFlexItemCount()) {
            c0487c.f31972a = i10;
            while (i10 < flexItemCount) {
                ((C0487c) l10.get(i10)).f31972a++;
                i10++;
            }
        } else {
            c0487c.f31972a = flexItemCount;
        }
        l10.add(c0487c);
        return U(flexItemCount + 1, l10, sparseIntArray);
    }

    public void o(int i10, int i11, int i12) {
        int i13;
        int i14;
        int flexDirection = this.f31969a.getFlexDirection();
        if (flexDirection == 0 || flexDirection == 1) {
            int mode = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            i13 = mode;
            i14 = size;
        } else {
            if (flexDirection != 2 && flexDirection != 3) {
                throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
            }
            i13 = View.MeasureSpec.getMode(i10);
            i14 = View.MeasureSpec.getSize(i10);
        }
        List<com.google.android.flexbox.b> flexLinesInternal = this.f31969a.getFlexLinesInternal();
        if (i13 == 1073741824) {
            int sumOfCrossSize = this.f31969a.getSumOfCrossSize() + i12;
            int i15 = 0;
            if (flexLinesInternal.size() == 1) {
                ((com.google.android.flexbox.b) flexLinesInternal.get(0)).f31957g = i14 - i12;
                return;
            }
            if (flexLinesInternal.size() >= 2) {
                int alignContent = this.f31969a.getAlignContent();
                if (alignContent == 1) {
                    int i16 = i14 - sumOfCrossSize;
                    com.google.android.flexbox.b bVar = new com.google.android.flexbox.b();
                    bVar.f31957g = i16;
                    flexLinesInternal.add(0, bVar);
                    return;
                }
                if (alignContent == 2) {
                    this.f31969a.setFlexLines(k(flexLinesInternal, i14, sumOfCrossSize));
                    return;
                }
                if (alignContent == 3) {
                    if (sumOfCrossSize >= i14) {
                        return;
                    }
                    float size2 = (i14 - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                    ArrayList arrayList = new ArrayList();
                    int size3 = flexLinesInternal.size();
                    float f10 = 0.0f;
                    while (i15 < size3) {
                        arrayList.add((com.google.android.flexbox.b) flexLinesInternal.get(i15));
                        if (i15 != flexLinesInternal.size() - 1) {
                            com.google.android.flexbox.b bVar2 = new com.google.android.flexbox.b();
                            if (i15 == flexLinesInternal.size() - 2) {
                                bVar2.f31957g = Math.round(f10 + size2);
                                f10 = 0.0f;
                            } else {
                                bVar2.f31957g = Math.round(size2);
                            }
                            int i17 = bVar2.f31957g;
                            f10 += size2 - i17;
                            if (f10 > 1.0f) {
                                bVar2.f31957g = i17 + 1;
                                f10 -= 1.0f;
                            } else if (f10 < -1.0f) {
                                bVar2.f31957g = i17 - 1;
                                f10 += 1.0f;
                            }
                            arrayList.add(bVar2);
                        }
                        i15++;
                    }
                    this.f31969a.setFlexLines(arrayList);
                    return;
                }
                if (alignContent == 4) {
                    if (sumOfCrossSize >= i14) {
                        this.f31969a.setFlexLines(k(flexLinesInternal, i14, sumOfCrossSize));
                        return;
                    }
                    int size4 = (i14 - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                    ArrayList arrayList2 = new ArrayList();
                    com.google.android.flexbox.b bVar3 = new com.google.android.flexbox.b();
                    bVar3.f31957g = size4;
                    for (com.google.android.flexbox.b bVar4 : flexLinesInternal) {
                        arrayList2.add(bVar3);
                        arrayList2.add(bVar4);
                        arrayList2.add(bVar3);
                    }
                    this.f31969a.setFlexLines(arrayList2);
                    return;
                }
                if (alignContent == 5 && sumOfCrossSize < i14) {
                    float size5 = (i14 - sumOfCrossSize) / flexLinesInternal.size();
                    int size6 = flexLinesInternal.size();
                    float f11 = 0.0f;
                    while (i15 < size6) {
                        com.google.android.flexbox.b bVar5 = (com.google.android.flexbox.b) flexLinesInternal.get(i15);
                        float f12 = bVar5.f31957g + size5;
                        if (i15 == flexLinesInternal.size() - 1) {
                            f12 += f11;
                            f11 = 0.0f;
                        }
                        int round = Math.round(f12);
                        f11 += f12 - round;
                        if (f11 > 1.0f) {
                            round++;
                            f11 -= 1.0f;
                        } else if (f11 < -1.0f) {
                            round--;
                            f11 += 1.0f;
                        }
                        bVar5.f31957g = round;
                        i15++;
                    }
                }
            }
        }
    }

    public void p(int i10, int i11) {
        q(i10, i11, 0);
    }

    public void q(int i10, int i11, int i12) {
        int size;
        int paddingLeft;
        int paddingRight;
        int i13;
        int i14;
        r(this.f31969a.getFlexItemCount());
        if (i12 >= this.f31969a.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.f31969a.getFlexDirection();
        int flexDirection2 = this.f31969a.getFlexDirection();
        if (flexDirection2 == 0 || flexDirection2 == 1) {
            int mode = View.MeasureSpec.getMode(i10);
            size = View.MeasureSpec.getSize(i10);
            int largestMainSize = this.f31969a.getLargestMainSize();
            if (mode != 1073741824) {
                size = Math.min(largestMainSize, size);
            }
            paddingLeft = this.f31969a.getPaddingLeft();
            paddingRight = this.f31969a.getPaddingRight();
        } else {
            if (flexDirection2 != 2 && flexDirection2 != 3) {
                throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
            }
            int mode2 = View.MeasureSpec.getMode(i11);
            size = View.MeasureSpec.getSize(i11);
            if (mode2 != 1073741824) {
                size = this.f31969a.getLargestMainSize();
            }
            paddingLeft = this.f31969a.getPaddingTop();
            paddingRight = this.f31969a.getPaddingBottom();
        }
        int i15 = paddingLeft + paddingRight;
        int i16 = size;
        int[] iArr = this.mIndexToFlexLine;
        int i17 = iArr != null ? iArr[i12] : 0;
        List flexLinesInternal = this.f31969a.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        while (i17 < size2) {
            com.google.android.flexbox.b bVar = (com.google.android.flexbox.b) flexLinesInternal.get(i17);
            int i18 = bVar.f31955e;
            if (i18 >= i16 || !bVar.f31967q) {
                i13 = i10;
                i14 = i11;
                if (i18 > i16 && bVar.f31968r) {
                    T(i13, i14, bVar, i16, i15, false);
                }
            } else {
                i13 = i10;
                i14 = i11;
                w(i13, i14, bVar, i16, i15, false);
            }
            i17++;
            i10 = i13;
            i11 = i14;
        }
    }

    public final void r(int i10) {
        boolean[] zArr = this.mChildrenFrozen;
        if (zArr == null) {
            this.mChildrenFrozen = new boolean[Math.max(i10, 10)];
        } else if (zArr.length < i10) {
            this.mChildrenFrozen = new boolean[Math.max(zArr.length * 2, i10)];
        } else {
            Arrays.fill(zArr, false);
        }
    }

    public void s(int i10) {
        int[] iArr = this.mIndexToFlexLine;
        if (iArr == null) {
            this.mIndexToFlexLine = new int[Math.max(i10, 10)];
        } else if (iArr.length < i10) {
            this.mIndexToFlexLine = Arrays.copyOf(this.mIndexToFlexLine, Math.max(iArr.length * 2, i10));
        }
    }

    public void t(int i10) {
        long[] jArr = this.mMeasureSpecCache;
        if (jArr == null) {
            this.mMeasureSpecCache = new long[Math.max(i10, 10)];
        } else if (jArr.length < i10) {
            this.mMeasureSpecCache = Arrays.copyOf(this.mMeasureSpecCache, Math.max(jArr.length * 2, i10));
        }
    }

    public void u(int i10) {
        long[] jArr = this.mMeasuredSizeCache;
        if (jArr == null) {
            this.mMeasuredSizeCache = new long[Math.max(i10, 10)];
        } else if (jArr.length < i10) {
            this.mMeasuredSizeCache = Arrays.copyOf(this.mMeasuredSizeCache, Math.max(jArr.length * 2, i10));
        }
    }

    public final void v(CompoundButton compoundButton) {
        FlexItem flexItem = (FlexItem) compoundButton.getLayoutParams();
        int r10 = flexItem.r();
        int X10 = flexItem.X();
        Drawable a10 = C0.c.a(compoundButton);
        int minimumWidth = a10 == null ? 0 : a10.getMinimumWidth();
        int minimumHeight = a10 != null ? a10.getMinimumHeight() : 0;
        if (r10 == -1) {
            r10 = minimumWidth;
        }
        flexItem.I(r10);
        if (X10 == -1) {
            X10 = minimumHeight;
        }
        flexItem.w(X10);
    }

    public final void w(int i10, int i11, com.google.android.flexbox.b bVar, int i12, int i13, boolean z10) {
        int i14;
        float f10;
        float f11;
        int i15;
        double d10;
        double d11;
        float f12 = bVar.f31960j;
        float f13 = 0.0f;
        if (f12 <= 0.0f || i12 < (i14 = bVar.f31955e)) {
            return;
        }
        float f14 = (i12 - i14) / f12;
        bVar.f31955e = i13 + bVar.f31956f;
        if (!z10) {
            bVar.f31957g = Integer.MIN_VALUE;
        }
        int i16 = 0;
        boolean z11 = false;
        int i17 = 0;
        float f15 = 0.0f;
        while (i16 < bVar.f31958h) {
            int i18 = bVar.f31965o + i16;
            View n10 = this.f31969a.n(i18);
            if (n10 == null || n10.getVisibility() == 8) {
                f10 = f13;
                f11 = f14;
                z11 = z11;
            } else {
                FlexItem flexItem = (FlexItem) n10.getLayoutParams();
                int flexDirection = this.f31969a.getFlexDirection();
                f10 = f13;
                if (flexDirection == 0 || flexDirection == 1) {
                    f11 = f14;
                    boolean z12 = z11;
                    int measuredWidth = n10.getMeasuredWidth();
                    long[] jArr = this.mMeasuredSizeCache;
                    if (jArr != null) {
                        measuredWidth = y(jArr[i18]);
                    }
                    int measuredHeight = n10.getMeasuredHeight();
                    long[] jArr2 = this.mMeasuredSizeCache;
                    if (jArr2 != null) {
                        measuredHeight = x(jArr2[i18]);
                    }
                    if (this.mChildrenFrozen[i18] || flexItem.y() <= f10) {
                        z11 = z12;
                    } else {
                        float y10 = measuredWidth + (flexItem.y() * f11);
                        if (i16 == bVar.f31958h - 1) {
                            y10 += f15;
                            f15 = f10;
                        }
                        int round = Math.round(y10);
                        if (round > flexItem.E()) {
                            round = flexItem.E();
                            this.mChildrenFrozen[i18] = true;
                            bVar.f31960j -= flexItem.y();
                            z11 = true;
                        } else {
                            f15 += y10 - round;
                            double d12 = f15;
                            if (d12 > 1.0d) {
                                round++;
                                d10 = d12 - 1.0d;
                            } else {
                                if (d12 < -1.0d) {
                                    round--;
                                    d10 = d12 + 1.0d;
                                }
                                z11 = z12;
                            }
                            f15 = (float) d10;
                            z11 = z12;
                        }
                        int z13 = z(i11, flexItem, bVar.f31963m);
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                        n10.measure(makeMeasureSpec, z13);
                        int measuredWidth2 = n10.getMeasuredWidth();
                        int measuredHeight2 = n10.getMeasuredHeight();
                        Z(i18, makeMeasureSpec, z13, n10);
                        this.f31969a.o(i18, n10);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int max = Math.max(i17, measuredHeight + flexItem.u() + flexItem.K() + this.f31969a.l(n10));
                    bVar.f31955e += measuredWidth + flexItem.L() + flexItem.V();
                    i15 = max;
                } else {
                    int measuredHeight3 = n10.getMeasuredHeight();
                    long[] jArr3 = this.mMeasuredSizeCache;
                    if (jArr3 != null) {
                        measuredHeight3 = x(jArr3[i18]);
                    }
                    int measuredWidth3 = n10.getMeasuredWidth();
                    long[] jArr4 = this.mMeasuredSizeCache;
                    f11 = f14;
                    boolean z14 = z11;
                    if (jArr4 != null) {
                        measuredWidth3 = y(jArr4[i18]);
                    }
                    if (this.mChildrenFrozen[i18] || flexItem.y() <= f10) {
                        z11 = z14;
                    } else {
                        float y11 = measuredHeight3 + (flexItem.y() * f11);
                        if (i16 == bVar.f31958h - 1) {
                            y11 += f15;
                            f15 = f10;
                        }
                        int round2 = Math.round(y11);
                        if (round2 > flexItem.b0()) {
                            round2 = flexItem.b0();
                            this.mChildrenFrozen[i18] = true;
                            bVar.f31960j -= flexItem.y();
                            z11 = true;
                        } else {
                            f15 += y11 - round2;
                            double d13 = f15;
                            if (d13 > 1.0d) {
                                round2++;
                                d11 = d13 - 1.0d;
                            } else {
                                if (d13 < -1.0d) {
                                    round2--;
                                    d11 = d13 + 1.0d;
                                }
                                z11 = z14;
                            }
                            f15 = (float) d11;
                            z11 = z14;
                        }
                        int A10 = A(i10, flexItem, bVar.f31963m);
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                        n10.measure(A10, makeMeasureSpec2);
                        int measuredWidth4 = n10.getMeasuredWidth();
                        int measuredHeight4 = n10.getMeasuredHeight();
                        Z(i18, A10, makeMeasureSpec2, n10);
                        this.f31969a.o(i18, n10);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    i15 = Math.max(i17, measuredWidth3 + flexItem.L() + flexItem.V() + this.f31969a.l(n10));
                    bVar.f31955e += measuredHeight3 + flexItem.u() + flexItem.K();
                }
                bVar.f31957g = Math.max(bVar.f31957g, i15);
                i17 = i15;
            }
            i16++;
            f14 = f11;
            f13 = f10;
        }
        if (!z11 || i14 == bVar.f31955e) {
            return;
        }
        w(i10, i11, bVar, i12, i13, true);
    }

    public int x(long j10) {
        return (int) (j10 >> 32);
    }

    public int y(long j10) {
        return (int) j10;
    }

    public final int z(int i10, FlexItem flexItem, int i11) {
        com.google.android.flexbox.a aVar = this.f31969a;
        int i12 = aVar.i(i10, aVar.getPaddingTop() + this.f31969a.getPaddingBottom() + flexItem.u() + flexItem.K() + i11, flexItem.getHeight());
        int size = View.MeasureSpec.getSize(i12);
        return size > flexItem.b0() ? View.MeasureSpec.makeMeasureSpec(flexItem.b0(), View.MeasureSpec.getMode(i12)) : size < flexItem.X() ? View.MeasureSpec.makeMeasureSpec(flexItem.X(), View.MeasureSpec.getMode(i12)) : i12;
    }
}
