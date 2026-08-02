package com.google.android.flexbox;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.flexbox.a f57854a;

    /* renamed from: b, reason: collision with root package name */
    private boolean[] f57855b;

    /* renamed from: c, reason: collision with root package name */
    int[] f57856c;

    /* renamed from: d, reason: collision with root package name */
    long[] f57857d;

    /* renamed from: e, reason: collision with root package name */
    private long[] f57858e;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        List<c> f57859a;

        /* renamed from: b, reason: collision with root package name */
        int f57860b;
    }

    private static class b implements Comparable<b> {

        /* renamed from: a, reason: collision with root package name */
        int f57861a;

        /* renamed from: b, reason: collision with root package name */
        int f57862b;

        private b() {
        }

        @Override // java.lang.Comparable
        public final int compareTo(@NonNull b bVar) {
            b bVar2 = bVar;
            int i11 = this.f57862b;
            int i12 = bVar2.f57862b;
            return i11 != i12 ? i11 - i12 : this.f57861a - bVar2.f57861a;
        }

        @NonNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Order{order=");
            sb2.append(this.f57862b);
            sb2.append(", index=");
            return Ek.a.d(sb2, this.f57861a, '}');
        }

        /* synthetic */ b(int i11) {
            this();
        }
    }

    d(com.google.android.flexbox.a aVar) {
        this.f57854a = aVar;
    }

    private void a(List<c> list, c cVar, int i11, int i12) {
        cVar.f57848m = i12;
        this.f57854a.onNewFlexLineAdded(cVar);
        cVar.f57851p = i11;
        list.add(cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void c(int i11, View view) {
        boolean z11;
        com.google.android.flexbox.b bVar = (com.google.android.flexbox.b) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        boolean z12 = true;
        if (measuredWidth < bVar.getMinWidth()) {
            measuredWidth = bVar.getMinWidth();
        } else {
            if (measuredWidth <= bVar.t1()) {
                z11 = false;
                if (measuredHeight >= bVar.getMinHeight()) {
                    measuredHeight = bVar.getMinHeight();
                } else if (measuredHeight > bVar.X1()) {
                    measuredHeight = bVar.X1();
                } else {
                    z12 = z11;
                }
                if (z12) {
                    return;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
                view.measure(makeMeasureSpec, makeMeasureSpec2);
                y(i11, view, makeMeasureSpec, makeMeasureSpec2);
                this.f57854a.updateViewCache(i11, view);
                return;
            }
            measuredWidth = bVar.t1();
        }
        z11 = true;
        if (measuredHeight >= bVar.getMinHeight()) {
        }
        if (z12) {
        }
    }

    private static ArrayList e(int i11, int i12, List list) {
        int i13 = (i11 - i12) / 2;
        ArrayList arrayList = new ArrayList();
        c cVar = new c();
        cVar.f57842g = i13;
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            if (i14 == 0) {
                arrayList.add(cVar);
            }
            arrayList.add((c) list.get(i14));
            if (i14 == list.size() - 1) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    @NonNull
    private ArrayList f(int i11) {
        ArrayList arrayList = new ArrayList(i11);
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            com.google.android.flexbox.b bVar = (com.google.android.flexbox.b) this.f57854a.getFlexItemAt(i13).getLayoutParams();
            b bVar2 = new b(i12);
            bVar2.f57862b = bVar.getOrder();
            bVar2.f57861a = i13;
            arrayList.add(bVar2);
        }
        return arrayList;
    }

    private void n(int i11, int i12, c cVar, int i13, int i14, boolean z11) {
        int i15;
        float f7;
        float f11;
        int i16;
        double d11;
        double d12;
        float f12 = cVar.f57845j;
        float f13 = 0.0f;
        if (f12 <= 0.0f || i13 < (i15 = cVar.f57840e)) {
            return;
        }
        float f14 = (i13 - i15) / f12;
        cVar.f57840e = i14 + cVar.f57841f;
        if (!z11) {
            cVar.f57842g = LinearLayoutManager.INVALID_OFFSET;
        }
        int i17 = 0;
        boolean z12 = false;
        int i18 = 0;
        float f15 = 0.0f;
        while (i17 < cVar.f57843h) {
            int i19 = cVar.f57850o + i17;
            com.google.android.flexbox.a aVar = this.f57854a;
            View reorderedFlexItemAt = aVar.getReorderedFlexItemAt(i19);
            if (reorderedFlexItemAt == null || reorderedFlexItemAt.getVisibility() == 8) {
                f7 = f13;
                f11 = f14;
                z12 = z12;
            } else {
                com.google.android.flexbox.b bVar = (com.google.android.flexbox.b) reorderedFlexItemAt.getLayoutParams();
                int flexDirection = aVar.getFlexDirection();
                f7 = f13;
                if (flexDirection == 0 || flexDirection == 1) {
                    f11 = f14;
                    boolean z13 = z12;
                    int measuredWidth = reorderedFlexItemAt.getMeasuredWidth();
                    long[] jArr = this.f57858e;
                    if (jArr != null) {
                        measuredWidth = (int) jArr[i19];
                    }
                    int measuredHeight = reorderedFlexItemAt.getMeasuredHeight();
                    long[] jArr2 = this.f57858e;
                    if (jArr2 != null) {
                        measuredHeight = (int) (jArr2[i19] >> 32);
                    }
                    if (this.f57855b[i19] || bVar.k1() <= f7) {
                        z12 = z13;
                    } else {
                        float k12 = (bVar.k1() * f11) + measuredWidth;
                        if (i17 == cVar.f57843h - 1) {
                            k12 += f15;
                            f15 = f7;
                        }
                        int round = Math.round(k12);
                        if (round > bVar.t1()) {
                            round = bVar.t1();
                            this.f57855b[i19] = true;
                            cVar.f57845j -= bVar.k1();
                            z12 = true;
                        } else {
                            float f16 = (k12 - round) + f15;
                            double d13 = f16;
                            if (d13 > 1.0d) {
                                round++;
                                d11 = d13 - 1.0d;
                            } else {
                                if (d13 < -1.0d) {
                                    round--;
                                    d11 = d13 + 1.0d;
                                }
                                f15 = f16;
                                z12 = z13;
                            }
                            f16 = (float) d11;
                            f15 = f16;
                            z12 = z13;
                        }
                        int o11 = o(i12, bVar, cVar.f57848m);
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                        reorderedFlexItemAt.measure(makeMeasureSpec, o11);
                        int measuredWidth2 = reorderedFlexItemAt.getMeasuredWidth();
                        int measuredHeight2 = reorderedFlexItemAt.getMeasuredHeight();
                        y(i19, reorderedFlexItemAt, makeMeasureSpec, o11);
                        aVar.updateViewCache(i19, reorderedFlexItemAt);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int max = Math.max(i18, measuredHeight + bVar.O() + bVar.o0() + aVar.getDecorationLengthCrossAxis(reorderedFlexItemAt));
                    cVar.f57840e = measuredWidth + bVar.M1() + bVar.V1() + cVar.f57840e;
                    i16 = max;
                } else {
                    int measuredHeight3 = reorderedFlexItemAt.getMeasuredHeight();
                    long[] jArr3 = this.f57858e;
                    if (jArr3 != null) {
                        measuredHeight3 = (int) (jArr3[i19] >> 32);
                    }
                    int measuredWidth3 = reorderedFlexItemAt.getMeasuredWidth();
                    long[] jArr4 = this.f57858e;
                    f11 = f14;
                    boolean z14 = z12;
                    if (jArr4 != null) {
                        measuredWidth3 = (int) jArr4[i19];
                    }
                    if (this.f57855b[i19] || bVar.k1() <= f7) {
                        z12 = z14;
                    } else {
                        float k13 = (bVar.k1() * f11) + measuredHeight3;
                        if (i17 == cVar.f57843h - 1) {
                            k13 += f15;
                            f15 = f7;
                        }
                        int round2 = Math.round(k13);
                        if (round2 > bVar.X1()) {
                            round2 = bVar.X1();
                            this.f57855b[i19] = true;
                            cVar.f57845j -= bVar.k1();
                            z12 = true;
                        } else {
                            float f17 = (k13 - round2) + f15;
                            double d14 = f17;
                            if (d14 > 1.0d) {
                                round2++;
                                d12 = d14 - 1.0d;
                            } else {
                                if (d14 < -1.0d) {
                                    round2--;
                                    d12 = d14 + 1.0d;
                                }
                                f15 = f17;
                                z12 = z14;
                            }
                            f17 = (float) d12;
                            f15 = f17;
                            z12 = z14;
                        }
                        int p11 = p(i11, bVar, cVar.f57848m);
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                        reorderedFlexItemAt.measure(p11, makeMeasureSpec2);
                        measuredWidth3 = reorderedFlexItemAt.getMeasuredWidth();
                        int measuredHeight4 = reorderedFlexItemAt.getMeasuredHeight();
                        y(i19, reorderedFlexItemAt, p11, makeMeasureSpec2);
                        aVar.updateViewCache(i19, reorderedFlexItemAt);
                        measuredHeight3 = measuredHeight4;
                    }
                    i16 = Math.max(i18, measuredWidth3 + bVar.M1() + bVar.V1() + aVar.getDecorationLengthCrossAxis(reorderedFlexItemAt));
                    cVar.f57840e = measuredHeight3 + bVar.O() + bVar.o0() + cVar.f57840e;
                }
                cVar.f57842g = Math.max(cVar.f57842g, i16);
                i18 = i16;
            }
            i17++;
            f13 = f7;
            f14 = f11;
        }
        if (!z12 || i15 == cVar.f57840e) {
            return;
        }
        n(i11, i12, cVar, i13, i14, true);
    }

    private int o(int i11, com.google.android.flexbox.b bVar, int i12) {
        com.google.android.flexbox.a aVar = this.f57854a;
        int childHeightMeasureSpec = aVar.getChildHeightMeasureSpec(i11, aVar.getPaddingTop() + aVar.getPaddingBottom() + bVar.O() + bVar.o0() + i12, bVar.getHeight());
        int size = View.MeasureSpec.getSize(childHeightMeasureSpec);
        return size > bVar.X1() ? View.MeasureSpec.makeMeasureSpec(bVar.X1(), View.MeasureSpec.getMode(childHeightMeasureSpec)) : size < bVar.getMinHeight() ? View.MeasureSpec.makeMeasureSpec(bVar.getMinHeight(), View.MeasureSpec.getMode(childHeightMeasureSpec)) : childHeightMeasureSpec;
    }

    private int p(int i11, com.google.android.flexbox.b bVar, int i12) {
        com.google.android.flexbox.a aVar = this.f57854a;
        int childWidthMeasureSpec = aVar.getChildWidthMeasureSpec(i11, aVar.getPaddingLeft() + aVar.getPaddingRight() + bVar.M1() + bVar.V1() + i12, bVar.getWidth());
        int size = View.MeasureSpec.getSize(childWidthMeasureSpec);
        return size > bVar.t1() ? View.MeasureSpec.makeMeasureSpec(bVar.t1(), View.MeasureSpec.getMode(childWidthMeasureSpec)) : size < bVar.getMinWidth() ? View.MeasureSpec.makeMeasureSpec(bVar.getMinWidth(), View.MeasureSpec.getMode(childWidthMeasureSpec)) : childWidthMeasureSpec;
    }

    private void t(int i11, int i12, c cVar, int i13, int i14, boolean z11) {
        float f7;
        int i15;
        int i16 = cVar.f57840e;
        float f11 = cVar.f57846k;
        float f12 = 0.0f;
        if (f11 <= 0.0f || i13 > i16) {
            return;
        }
        float f13 = (i16 - i13) / f11;
        cVar.f57840e = i14 + cVar.f57841f;
        if (!z11) {
            cVar.f57842g = LinearLayoutManager.INVALID_OFFSET;
        }
        int i17 = 0;
        boolean z12 = false;
        int i18 = 0;
        float f14 = 0.0f;
        while (i17 < cVar.f57843h) {
            int i19 = cVar.f57850o + i17;
            com.google.android.flexbox.a aVar = this.f57854a;
            View reorderedFlexItemAt = aVar.getReorderedFlexItemAt(i19);
            if (reorderedFlexItemAt == null || reorderedFlexItemAt.getVisibility() == 8) {
                f7 = f12;
            } else {
                com.google.android.flexbox.b bVar = (com.google.android.flexbox.b) reorderedFlexItemAt.getLayoutParams();
                int flexDirection = aVar.getFlexDirection();
                f7 = f12;
                if (flexDirection == 0 || flexDirection == 1) {
                    int measuredWidth = reorderedFlexItemAt.getMeasuredWidth();
                    long[] jArr = this.f57858e;
                    if (jArr != null) {
                        measuredWidth = (int) jArr[i19];
                    }
                    int measuredHeight = reorderedFlexItemAt.getMeasuredHeight();
                    long[] jArr2 = this.f57858e;
                    if (jArr2 != null) {
                        measuredHeight = (int) (jArr2[i19] >> 32);
                    }
                    if (!this.f57855b[i19] && bVar.W0() > f7) {
                        float W02 = measuredWidth - (bVar.W0() * f13);
                        if (i17 == cVar.f57843h - 1) {
                            W02 += f14;
                            f14 = f7;
                        }
                        int round = Math.round(W02);
                        if (round < bVar.getMinWidth()) {
                            round = bVar.getMinWidth();
                            this.f57855b[i19] = true;
                            cVar.f57846k -= bVar.W0();
                            z12 = true;
                        } else {
                            float f15 = (W02 - round) + f14;
                            double d11 = f15;
                            if (d11 > 1.0d) {
                                round++;
                                f15 -= 1.0f;
                            } else if (d11 < -1.0d) {
                                round--;
                                f15 += 1.0f;
                            }
                            f14 = f15;
                        }
                        int o11 = o(i12, bVar, cVar.f57848m);
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                        reorderedFlexItemAt.measure(makeMeasureSpec, o11);
                        int measuredWidth2 = reorderedFlexItemAt.getMeasuredWidth();
                        int measuredHeight2 = reorderedFlexItemAt.getMeasuredHeight();
                        y(i19, reorderedFlexItemAt, makeMeasureSpec, o11);
                        aVar.updateViewCache(i19, reorderedFlexItemAt);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int max = Math.max(i18, measuredHeight + bVar.O() + bVar.o0() + aVar.getDecorationLengthCrossAxis(reorderedFlexItemAt));
                    cVar.f57840e = measuredWidth + bVar.M1() + bVar.V1() + cVar.f57840e;
                    i15 = max;
                } else {
                    int measuredHeight3 = reorderedFlexItemAt.getMeasuredHeight();
                    long[] jArr3 = this.f57858e;
                    if (jArr3 != null) {
                        measuredHeight3 = (int) (jArr3[i19] >> 32);
                    }
                    int measuredWidth3 = reorderedFlexItemAt.getMeasuredWidth();
                    long[] jArr4 = this.f57858e;
                    if (jArr4 != null) {
                        measuredWidth3 = (int) jArr4[i19];
                    }
                    if (!this.f57855b[i19] && bVar.W0() > f7) {
                        float W03 = measuredHeight3 - (bVar.W0() * f13);
                        if (i17 == cVar.f57843h - 1) {
                            W03 += f14;
                            f14 = f7;
                        }
                        int round2 = Math.round(W03);
                        if (round2 < bVar.getMinHeight()) {
                            round2 = bVar.getMinHeight();
                            this.f57855b[i19] = true;
                            cVar.f57846k -= bVar.W0();
                            z12 = true;
                        } else {
                            float f16 = (W03 - round2) + f14;
                            double d12 = f16;
                            if (d12 > 1.0d) {
                                round2++;
                                f16 -= 1.0f;
                            } else if (d12 < -1.0d) {
                                round2--;
                                f16 += 1.0f;
                            }
                            f14 = f16;
                        }
                        int p11 = p(i11, bVar, cVar.f57848m);
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                        reorderedFlexItemAt.measure(p11, makeMeasureSpec2);
                        measuredWidth3 = reorderedFlexItemAt.getMeasuredWidth();
                        int measuredHeight4 = reorderedFlexItemAt.getMeasuredHeight();
                        y(i19, reorderedFlexItemAt, p11, makeMeasureSpec2);
                        aVar.updateViewCache(i19, reorderedFlexItemAt);
                        measuredHeight3 = measuredHeight4;
                    }
                    i15 = Math.max(i18, measuredWidth3 + bVar.M1() + bVar.V1() + aVar.getDecorationLengthCrossAxis(reorderedFlexItemAt));
                    cVar.f57840e = measuredHeight3 + bVar.O() + bVar.o0() + cVar.f57840e;
                }
                cVar.f57842g = Math.max(cVar.f57842g, i15);
                i18 = i15;
            }
            i17++;
            f12 = f7;
        }
        if (!z12 || i16 == cVar.f57840e) {
            return;
        }
        t(i11, i12, cVar, i13, i14, true);
    }

    private static int[] u(int i11, ArrayList arrayList, SparseIntArray sparseIntArray) {
        Collections.sort(arrayList);
        sparseIntArray.clear();
        int[] iArr = new int[i11];
        Iterator it = arrayList.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            b bVar = (b) it.next();
            int i13 = bVar.f57861a;
            iArr[i12] = i13;
            sparseIntArray.append(i13, bVar.f57862b);
            i12++;
        }
        return iArr;
    }

    private void v(View view, int i11, int i12) {
        com.google.android.flexbox.b bVar = (com.google.android.flexbox.b) view.getLayoutParams();
        int M12 = (i11 - bVar.M1()) - bVar.V1();
        com.google.android.flexbox.a aVar = this.f57854a;
        int min = Math.min(Math.max(M12 - aVar.getDecorationLengthCrossAxis(view), bVar.getMinWidth()), bVar.t1());
        long[] jArr = this.f57858e;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) (jArr[i12] >> 32) : view.getMeasuredHeight(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec2, makeMeasureSpec);
        y(i12, view, makeMeasureSpec2, makeMeasureSpec);
        aVar.updateViewCache(i12, view);
    }

    private void w(View view, int i11, int i12) {
        com.google.android.flexbox.b bVar = (com.google.android.flexbox.b) view.getLayoutParams();
        int O11 = (i11 - bVar.O()) - bVar.o0();
        com.google.android.flexbox.a aVar = this.f57854a;
        int min = Math.min(Math.max(O11 - aVar.getDecorationLengthCrossAxis(view), bVar.getMinHeight()), bVar.X1());
        long[] jArr = this.f57858e;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) jArr[i12] : view.getMeasuredWidth(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        y(i12, view, makeMeasureSpec, makeMeasureSpec2);
        aVar.updateViewCache(i12, view);
    }

    private void y(int i11, View view, int i12, int i13) {
        long[] jArr = this.f57857d;
        if (jArr != null) {
            jArr[i11] = (i12 & 4294967295L) | (i13 << 32);
        }
        long[] jArr2 = this.f57858e;
        if (jArr2 != null) {
            jArr2[i11] = (view.getMeasuredWidth() & 4294967295L) | (view.getMeasuredHeight() << 32);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:166:0x01f6, code lost:
    
        if (r8 < (r9 + r14)) goto L100;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0391 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0305  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void b(a aVar, int i11, int i12, int i13, int i14, int i15, List<c> list) {
        List<c> list2;
        int i16;
        int childHeightMeasureSpec;
        com.google.android.flexbox.b bVar;
        int i17;
        int[] iArr;
        boolean z11;
        int i18 = i11;
        com.google.android.flexbox.a aVar2 = this.f57854a;
        boolean isMainAxisDirectionHorizontal = aVar2.isMainAxisDirectionHorizontal();
        int mode = View.MeasureSpec.getMode(i18);
        int size = View.MeasureSpec.getSize(i18);
        List<c> arrayList = list == null ? new ArrayList<>() : list;
        aVar.f57859a = arrayList;
        boolean z12 = i15 == -1;
        int paddingStart = isMainAxisDirectionHorizontal ? aVar2.getPaddingStart() : aVar2.getPaddingTop();
        int paddingEnd = isMainAxisDirectionHorizontal ? aVar2.getPaddingEnd() : aVar2.getPaddingBottom();
        int paddingTop = isMainAxisDirectionHorizontal ? aVar2.getPaddingTop() : aVar2.getPaddingStart();
        int paddingBottom = isMainAxisDirectionHorizontal ? aVar2.getPaddingBottom() : aVar2.getPaddingEnd();
        c cVar = new c();
        int i19 = i14;
        int i21 = 1;
        cVar.f57850o = i19;
        int i22 = paddingStart + paddingEnd;
        cVar.f57840e = i22;
        int flexItemCount = aVar2.getFlexItemCount();
        boolean z13 = z12;
        int i23 = Integer.MIN_VALUE;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        while (i19 < flexItemCount) {
            int i27 = flexItemCount;
            View reorderedFlexItemAt = aVar2.getReorderedFlexItemAt(i19);
            if (reorderedFlexItemAt == null) {
                if (i19 == i27 - 1 && cVar.b() != 0) {
                    a(arrayList, cVar, i19, i25);
                }
            } else if (reorderedFlexItemAt.getVisibility() == 8) {
                cVar.f57844i++;
                cVar.f57843h++;
                if (i19 == i27 - 1 && cVar.b() != 0) {
                    a(arrayList, cVar, i19, i25);
                }
            } else {
                if (reorderedFlexItemAt instanceof CompoundButton) {
                    CompoundButton compoundButton = (CompoundButton) reorderedFlexItemAt;
                    com.google.android.flexbox.b bVar2 = (com.google.android.flexbox.b) compoundButton.getLayoutParams();
                    int minWidth = bVar2.getMinWidth();
                    i16 = i22;
                    int minHeight = bVar2.getMinHeight();
                    Drawable a11 = androidx.core.widget.c.a(compoundButton);
                    int minimumWidth = a11 == null ? 0 : a11.getMinimumWidth();
                    int minimumHeight = a11 == null ? 0 : a11.getMinimumHeight();
                    list2 = arrayList;
                    if (minWidth == -1) {
                        minWidth = minimumWidth;
                    }
                    bVar2.J1(minWidth);
                    if (minHeight == -1) {
                        minHeight = minimumHeight;
                    }
                    bVar2.j1(minHeight);
                } else {
                    list2 = arrayList;
                    i16 = i22;
                }
                com.google.android.flexbox.b bVar3 = (com.google.android.flexbox.b) reorderedFlexItemAt.getLayoutParams();
                if (bVar3.T0() == 4) {
                    cVar.f57849n.add(Integer.valueOf(i19));
                }
                int width = isMainAxisDirectionHorizontal ? bVar3.getWidth() : bVar3.getHeight();
                if (bVar3.l1() != -1.0f && mode == 1073741824) {
                    width = Math.round(size * bVar3.l1());
                }
                if (isMainAxisDirectionHorizontal) {
                    childHeightMeasureSpec = aVar2.getChildWidthMeasureSpec(i18, i16 + bVar3.M1() + bVar3.V1(), width);
                    int childHeightMeasureSpec2 = aVar2.getChildHeightMeasureSpec(i12, paddingTop + paddingBottom + bVar3.O() + bVar3.o0() + i25, bVar3.getHeight());
                    reorderedFlexItemAt.measure(childHeightMeasureSpec, childHeightMeasureSpec2);
                    y(i19, reorderedFlexItemAt, childHeightMeasureSpec, childHeightMeasureSpec2);
                } else {
                    int childWidthMeasureSpec = aVar2.getChildWidthMeasureSpec(i12, paddingTop + paddingBottom + bVar3.M1() + bVar3.V1() + i25, bVar3.getWidth());
                    childHeightMeasureSpec = aVar2.getChildHeightMeasureSpec(i18, i16 + bVar3.O() + bVar3.o0(), width);
                    reorderedFlexItemAt.measure(childWidthMeasureSpec, childHeightMeasureSpec);
                    y(i19, reorderedFlexItemAt, childWidthMeasureSpec, childHeightMeasureSpec);
                }
                aVar2.updateViewCache(i19, reorderedFlexItemAt);
                c(i19, reorderedFlexItemAt);
                i24 = View.combineMeasuredStates(i24, reorderedFlexItemAt.getMeasuredState());
                int i28 = cVar.f57840e;
                int measuredWidth = (isMainAxisDirectionHorizontal ? reorderedFlexItemAt.getMeasuredWidth() : reorderedFlexItemAt.getMeasuredHeight()) + (isMainAxisDirectionHorizontal ? bVar3.M1() : bVar3.O()) + (isMainAxisDirectionHorizontal ? bVar3.V1() : bVar3.o0());
                int size2 = list2.size();
                if (aVar2.getFlexWrap() != 0) {
                    if (bVar3.n1()) {
                        bVar = bVar3;
                    } else if (mode != 0) {
                        bVar = bVar3;
                        int maxLine = aVar2.getMaxLine();
                        if (maxLine == -1 || maxLine > size2 + 1) {
                            int decorationLengthMainAxis = aVar2.getDecorationLengthMainAxis(reorderedFlexItemAt, i19, i26);
                            if (decorationLengthMainAxis > 0) {
                                measuredWidth += decorationLengthMainAxis;
                            }
                        }
                        i22 = i16;
                        arrayList = list2;
                        cVar.f57843h += i21;
                        i26++;
                        i17 = i23;
                        cVar.f57852q |= bVar.k1() != 0.0f;
                        cVar.f57853r |= bVar.W0() != 0.0f;
                        iArr = this.f57856c;
                        if (iArr != null) {
                            iArr[i19] = arrayList.size();
                        }
                        cVar.f57840e = (isMainAxisDirectionHorizontal ? reorderedFlexItemAt.getMeasuredWidth() : reorderedFlexItemAt.getMeasuredHeight()) + (isMainAxisDirectionHorizontal ? bVar.M1() : bVar.O()) + (isMainAxisDirectionHorizontal ? bVar.V1() : bVar.o0()) + cVar.f57840e;
                        cVar.f57845j += bVar.k1();
                        cVar.f57846k += bVar.W0();
                        aVar2.onNewFlexItemAdded(reorderedFlexItemAt, i19, i26, cVar);
                        int max = Math.max(i17, (isMainAxisDirectionHorizontal ? reorderedFlexItemAt.getMeasuredHeight() : reorderedFlexItemAt.getMeasuredWidth()) + (isMainAxisDirectionHorizontal ? bVar.O() : bVar.M1()) + (isMainAxisDirectionHorizontal ? bVar.o0() : bVar.V1()) + aVar2.getDecorationLengthCrossAxis(reorderedFlexItemAt));
                        cVar.f57842g = Math.max(cVar.f57842g, max);
                        if (isMainAxisDirectionHorizontal) {
                            if (aVar2.getFlexWrap() != 2) {
                                cVar.f57847l = Math.max(cVar.f57847l, reorderedFlexItemAt.getBaseline() + bVar.O());
                            } else {
                                cVar.f57847l = Math.max(cVar.f57847l, (reorderedFlexItemAt.getMeasuredHeight() - reorderedFlexItemAt.getBaseline()) + bVar.o0());
                            }
                        }
                        if (i19 == i27 - 1 && cVar.b() != 0) {
                            a(arrayList, cVar, i19, i25);
                            i25 += cVar.f57842g;
                        }
                        if (i15 == -1 && arrayList.size() > 0) {
                            i21 = 1;
                            if (arrayList.get(arrayList.size() - 1).f57851p >= i15 && i19 >= i15 && !z13) {
                                i25 = -cVar.f57842g;
                                z11 = true;
                                if (i25 <= i13 && z11) {
                                    break;
                                }
                                i23 = max;
                                i19++;
                                i18 = i11;
                                z13 = z11;
                                flexItemCount = i27;
                            }
                        } else {
                            i21 = 1;
                        }
                        z11 = z13;
                        if (i25 <= i13) {
                        }
                        i23 = max;
                        i19++;
                        i18 = i11;
                        z13 = z11;
                        flexItemCount = i27;
                    }
                    if (cVar.b() > 0) {
                        arrayList = list2;
                        a(arrayList, cVar, i19 > 0 ? i19 - 1 : 0, i25);
                        i25 += cVar.f57842g;
                    } else {
                        arrayList = list2;
                    }
                    if (isMainAxisDirectionHorizontal) {
                        if (bVar.getHeight() == -1) {
                            reorderedFlexItemAt.measure(childHeightMeasureSpec, aVar2.getChildHeightMeasureSpec(i12, aVar2.getPaddingTop() + aVar2.getPaddingBottom() + bVar.O() + bVar.o0() + i25, bVar.getHeight()));
                            c(i19, reorderedFlexItemAt);
                        }
                    } else if (bVar.getWidth() == -1) {
                        reorderedFlexItemAt.measure(aVar2.getChildWidthMeasureSpec(i12, aVar2.getPaddingLeft() + aVar2.getPaddingRight() + bVar.M1() + bVar.V1() + i25, bVar.getWidth()), childHeightMeasureSpec);
                        c(i19, reorderedFlexItemAt);
                    }
                    cVar = new c();
                    cVar.f57843h = i21;
                    i22 = i16;
                    cVar.f57840e = i22;
                    cVar.f57850o = i19;
                    i17 = Integer.MIN_VALUE;
                    i26 = 0;
                    cVar.f57852q |= bVar.k1() != 0.0f;
                    cVar.f57853r |= bVar.W0() != 0.0f;
                    iArr = this.f57856c;
                    if (iArr != null) {
                    }
                    cVar.f57840e = (isMainAxisDirectionHorizontal ? reorderedFlexItemAt.getMeasuredWidth() : reorderedFlexItemAt.getMeasuredHeight()) + (isMainAxisDirectionHorizontal ? bVar.M1() : bVar.O()) + (isMainAxisDirectionHorizontal ? bVar.V1() : bVar.o0()) + cVar.f57840e;
                    cVar.f57845j += bVar.k1();
                    cVar.f57846k += bVar.W0();
                    aVar2.onNewFlexItemAdded(reorderedFlexItemAt, i19, i26, cVar);
                    int max2 = Math.max(i17, (isMainAxisDirectionHorizontal ? reorderedFlexItemAt.getMeasuredHeight() : reorderedFlexItemAt.getMeasuredWidth()) + (isMainAxisDirectionHorizontal ? bVar.O() : bVar.M1()) + (isMainAxisDirectionHorizontal ? bVar.o0() : bVar.V1()) + aVar2.getDecorationLengthCrossAxis(reorderedFlexItemAt));
                    cVar.f57842g = Math.max(cVar.f57842g, max2);
                    if (isMainAxisDirectionHorizontal) {
                    }
                    if (i19 == i27 - 1) {
                        a(arrayList, cVar, i19, i25);
                        i25 += cVar.f57842g;
                    }
                    if (i15 == -1) {
                    }
                    i21 = 1;
                    z11 = z13;
                    if (i25 <= i13) {
                    }
                    i23 = max2;
                    i19++;
                    i18 = i11;
                    z13 = z11;
                    flexItemCount = i27;
                }
                bVar = bVar3;
                i22 = i16;
                arrayList = list2;
                cVar.f57843h += i21;
                i26++;
                i17 = i23;
                cVar.f57852q |= bVar.k1() != 0.0f;
                cVar.f57853r |= bVar.W0() != 0.0f;
                iArr = this.f57856c;
                if (iArr != null) {
                }
                cVar.f57840e = (isMainAxisDirectionHorizontal ? reorderedFlexItemAt.getMeasuredWidth() : reorderedFlexItemAt.getMeasuredHeight()) + (isMainAxisDirectionHorizontal ? bVar.M1() : bVar.O()) + (isMainAxisDirectionHorizontal ? bVar.V1() : bVar.o0()) + cVar.f57840e;
                cVar.f57845j += bVar.k1();
                cVar.f57846k += bVar.W0();
                aVar2.onNewFlexItemAdded(reorderedFlexItemAt, i19, i26, cVar);
                int max22 = Math.max(i17, (isMainAxisDirectionHorizontal ? reorderedFlexItemAt.getMeasuredHeight() : reorderedFlexItemAt.getMeasuredWidth()) + (isMainAxisDirectionHorizontal ? bVar.O() : bVar.M1()) + (isMainAxisDirectionHorizontal ? bVar.o0() : bVar.V1()) + aVar2.getDecorationLengthCrossAxis(reorderedFlexItemAt));
                cVar.f57842g = Math.max(cVar.f57842g, max22);
                if (isMainAxisDirectionHorizontal) {
                }
                if (i19 == i27 - 1) {
                }
                if (i15 == -1) {
                }
                i21 = 1;
                z11 = z13;
                if (i25 <= i13) {
                }
                i23 = max22;
                i19++;
                i18 = i11;
                z13 = z11;
                flexItemCount = i27;
            }
            z11 = z13;
            i19++;
            i18 = i11;
            z13 = z11;
            flexItemCount = i27;
        }
        aVar.f57860b = i24;
    }

    final void d(int i11, List list) {
        int i12 = this.f57856c[i11];
        if (i12 == -1) {
            i12 = 0;
        }
        for (int size = list.size() - 1; size >= i12; size--) {
            list.remove(size);
        }
        int[] iArr = this.f57856c;
        int length = iArr.length - 1;
        if (i11 > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i11, length, -1);
        }
        long[] jArr = this.f57857d;
        int length2 = jArr.length - 1;
        if (i11 > length2) {
            Arrays.fill(jArr, 0L);
        } else {
            Arrays.fill(jArr, i11, length2, 0L);
        }
    }

    final int[] g(SparseIntArray sparseIntArray) {
        int flexItemCount = this.f57854a.getFlexItemCount();
        return u(flexItemCount, f(flexItemCount), sparseIntArray);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final int[] h(View view, int i11, ViewGroup.LayoutParams layoutParams, SparseIntArray sparseIntArray) {
        com.google.android.flexbox.a aVar = this.f57854a;
        int flexItemCount = aVar.getFlexItemCount();
        ArrayList f7 = f(flexItemCount);
        b bVar = new b(0);
        if (view == null || !(layoutParams instanceof com.google.android.flexbox.b)) {
            bVar.f57862b = 1;
        } else {
            bVar.f57862b = ((com.google.android.flexbox.b) layoutParams).getOrder();
        }
        if (i11 == -1 || i11 == flexItemCount) {
            bVar.f57861a = flexItemCount;
        } else if (i11 < aVar.getFlexItemCount()) {
            bVar.f57861a = i11;
            while (i11 < flexItemCount) {
                ((b) f7.get(i11)).f57861a++;
                i11++;
            }
        } else {
            bVar.f57861a = flexItemCount;
        }
        f7.add(bVar);
        return u(flexItemCount + 1, f7, sparseIntArray);
    }

    final void i(int i11, int i12, int i13) {
        int mode;
        int size;
        com.google.android.flexbox.a aVar = this.f57854a;
        int flexDirection = aVar.getFlexDirection();
        if (flexDirection == 0 || flexDirection == 1) {
            mode = View.MeasureSpec.getMode(i12);
            size = View.MeasureSpec.getSize(i12);
        } else {
            if (flexDirection != 2 && flexDirection != 3) {
                throw new IllegalArgumentException(Ej.b.a(flexDirection, "Invalid flex direction: "));
            }
            mode = View.MeasureSpec.getMode(i11);
            size = View.MeasureSpec.getSize(i11);
        }
        List<c> flexLinesInternal = aVar.getFlexLinesInternal();
        if (mode == 1073741824) {
            int sumOfCrossSize = aVar.getSumOfCrossSize() + i13;
            int i14 = 0;
            if (flexLinesInternal.size() == 1) {
                flexLinesInternal.get(0).f57842g = size - i13;
                return;
            }
            if (flexLinesInternal.size() >= 2) {
                int alignContent = aVar.getAlignContent();
                if (alignContent == 1) {
                    c cVar = new c();
                    cVar.f57842g = size - sumOfCrossSize;
                    flexLinesInternal.add(0, cVar);
                    return;
                }
                if (alignContent == 2) {
                    aVar.setFlexLines(e(size, sumOfCrossSize, flexLinesInternal));
                    return;
                }
                if (alignContent == 3) {
                    if (sumOfCrossSize >= size) {
                        return;
                    }
                    float size2 = (size - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                    ArrayList arrayList = new ArrayList();
                    int size3 = flexLinesInternal.size();
                    float f7 = 0.0f;
                    while (i14 < size3) {
                        arrayList.add(flexLinesInternal.get(i14));
                        if (i14 != flexLinesInternal.size() - 1) {
                            c cVar2 = new c();
                            if (i14 == flexLinesInternal.size() - 2) {
                                cVar2.f57842g = Math.round(f7 + size2);
                                f7 = 0.0f;
                            } else {
                                cVar2.f57842g = Math.round(size2);
                            }
                            int i15 = cVar2.f57842g;
                            float f11 = (size2 - i15) + f7;
                            if (f11 > 1.0f) {
                                cVar2.f57842g = i15 + 1;
                                f11 -= 1.0f;
                            } else if (f11 < -1.0f) {
                                cVar2.f57842g = i15 - 1;
                                f11 += 1.0f;
                            }
                            f7 = f11;
                            arrayList.add(cVar2);
                        }
                        i14++;
                    }
                    aVar.setFlexLines(arrayList);
                    return;
                }
                if (alignContent == 4) {
                    if (sumOfCrossSize >= size) {
                        aVar.setFlexLines(e(size, sumOfCrossSize, flexLinesInternal));
                        return;
                    }
                    int size4 = (size - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                    ArrayList arrayList2 = new ArrayList();
                    c cVar3 = new c();
                    cVar3.f57842g = size4;
                    for (c cVar4 : flexLinesInternal) {
                        arrayList2.add(cVar3);
                        arrayList2.add(cVar4);
                        arrayList2.add(cVar3);
                    }
                    aVar.setFlexLines(arrayList2);
                    return;
                }
                if (alignContent == 5 && sumOfCrossSize < size) {
                    float size5 = (size - sumOfCrossSize) / flexLinesInternal.size();
                    int size6 = flexLinesInternal.size();
                    float f12 = 0.0f;
                    while (i14 < size6) {
                        c cVar5 = flexLinesInternal.get(i14);
                        float f13 = cVar5.f57842g + size5;
                        if (i14 == flexLinesInternal.size() - 1) {
                            f13 += f12;
                            f12 = 0.0f;
                        }
                        int round = Math.round(f13);
                        float f14 = (f13 - round) + f12;
                        if (f14 > 1.0f) {
                            round++;
                            f14 -= 1.0f;
                        } else if (f14 < -1.0f) {
                            round--;
                            f14 += 1.0f;
                        }
                        f12 = f14;
                        cVar5.f57842g = round;
                        i14++;
                    }
                }
            }
        }
    }

    final void j(int i11, int i12, int i13) {
        int size;
        int paddingLeft;
        int paddingRight;
        int i14;
        int i15;
        com.google.android.flexbox.a aVar = this.f57854a;
        int flexItemCount = aVar.getFlexItemCount();
        boolean[] zArr = this.f57855b;
        if (zArr == null) {
            if (flexItemCount < 10) {
                flexItemCount = 10;
            }
            this.f57855b = new boolean[flexItemCount];
        } else if (zArr.length < flexItemCount) {
            int length = zArr.length * 2;
            if (length >= flexItemCount) {
                flexItemCount = length;
            }
            this.f57855b = new boolean[flexItemCount];
        } else {
            Arrays.fill(zArr, false);
        }
        if (i13 >= aVar.getFlexItemCount()) {
            return;
        }
        int flexDirection = aVar.getFlexDirection();
        int flexDirection2 = aVar.getFlexDirection();
        if (flexDirection2 == 0 || flexDirection2 == 1) {
            int mode = View.MeasureSpec.getMode(i11);
            size = View.MeasureSpec.getSize(i11);
            int largestMainSize = aVar.getLargestMainSize();
            if (mode != 1073741824 && largestMainSize <= size) {
                size = largestMainSize;
            }
            paddingLeft = aVar.getPaddingLeft();
            paddingRight = aVar.getPaddingRight();
        } else {
            if (flexDirection2 != 2 && flexDirection2 != 3) {
                throw new IllegalArgumentException(Ej.b.a(flexDirection, "Invalid flex direction: "));
            }
            int mode2 = View.MeasureSpec.getMode(i12);
            size = View.MeasureSpec.getSize(i12);
            if (mode2 != 1073741824) {
                size = aVar.getLargestMainSize();
            }
            paddingLeft = aVar.getPaddingTop();
            paddingRight = aVar.getPaddingBottom();
        }
        int i16 = paddingLeft + paddingRight;
        int i17 = size;
        int[] iArr = this.f57856c;
        int i18 = iArr != null ? iArr[i13] : 0;
        List<c> flexLinesInternal = aVar.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        while (i18 < size2) {
            c cVar = flexLinesInternal.get(i18);
            int i19 = cVar.f57840e;
            if (i19 >= i17 || !cVar.f57852q) {
                i14 = i11;
                i15 = i12;
                if (i19 > i17 && cVar.f57853r) {
                    t(i14, i15, cVar, i17, i16, false);
                }
            } else {
                i14 = i11;
                i15 = i12;
                n(i14, i15, cVar, i17, i16, false);
            }
            i18++;
            i11 = i14;
            i12 = i15;
        }
    }

    final void k(int i11) {
        int[] iArr = this.f57856c;
        if (iArr == null) {
            if (i11 < 10) {
                i11 = 10;
            }
            this.f57856c = new int[i11];
        } else if (iArr.length < i11) {
            int length = iArr.length * 2;
            if (length >= i11) {
                i11 = length;
            }
            this.f57856c = Arrays.copyOf(iArr, i11);
        }
    }

    final void l(int i11) {
        long[] jArr = this.f57857d;
        if (jArr == null) {
            if (i11 < 10) {
                i11 = 10;
            }
            this.f57857d = new long[i11];
        } else if (jArr.length < i11) {
            int length = jArr.length * 2;
            if (length >= i11) {
                i11 = length;
            }
            this.f57857d = Arrays.copyOf(jArr, i11);
        }
    }

    final void m(int i11) {
        long[] jArr = this.f57858e;
        if (jArr == null) {
            if (i11 < 10) {
                i11 = 10;
            }
            this.f57858e = new long[i11];
        } else if (jArr.length < i11) {
            int length = jArr.length * 2;
            if (length >= i11) {
                i11 = length;
            }
            this.f57858e = Arrays.copyOf(jArr, i11);
        }
    }

    final boolean q(SparseIntArray sparseIntArray) {
        com.google.android.flexbox.a aVar = this.f57854a;
        int flexItemCount = aVar.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            return true;
        }
        for (int i11 = 0; i11 < flexItemCount; i11++) {
            View flexItemAt = aVar.getFlexItemAt(i11);
            if (flexItemAt != null && ((com.google.android.flexbox.b) flexItemAt.getLayoutParams()).getOrder() != sparseIntArray.get(i11)) {
                return true;
            }
        }
        return false;
    }

    final void r(View view, c cVar, int i11, int i12, int i13, int i14) {
        com.google.android.flexbox.b bVar = (com.google.android.flexbox.b) view.getLayoutParams();
        com.google.android.flexbox.a aVar = this.f57854a;
        int alignItems = aVar.getAlignItems();
        if (bVar.T0() != -1) {
            alignItems = bVar.T0();
        }
        int i15 = cVar.f57842g;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (aVar.getFlexWrap() != 2) {
                    int i16 = i12 + i15;
                    view.layout(i11, (i16 - view.getMeasuredHeight()) - bVar.o0(), i13, i16 - bVar.o0());
                    return;
                } else {
                    view.layout(i11, view.getMeasuredHeight() + (i12 - i15) + bVar.O(), i13, view.getMeasuredHeight() + (i14 - i15) + bVar.O());
                    return;
                }
            }
            if (alignItems == 2) {
                int measuredHeight = (((i15 - view.getMeasuredHeight()) + bVar.O()) - bVar.o0()) / 2;
                if (aVar.getFlexWrap() != 2) {
                    int i17 = i12 + measuredHeight;
                    view.layout(i11, i17, i13, view.getMeasuredHeight() + i17);
                    return;
                } else {
                    int i18 = i12 - measuredHeight;
                    view.layout(i11, i18, i13, view.getMeasuredHeight() + i18);
                    return;
                }
            }
            if (alignItems == 3) {
                if (aVar.getFlexWrap() != 2) {
                    int max = Math.max(cVar.f57847l - view.getBaseline(), bVar.O());
                    view.layout(i11, i12 + max, i13, i14 + max);
                    return;
                } else {
                    int max2 = Math.max(view.getBaseline() + (cVar.f57847l - view.getMeasuredHeight()), bVar.o0());
                    view.layout(i11, i12 - max2, i13, i14 - max2);
                    return;
                }
            }
            if (alignItems != 4) {
                return;
            }
        }
        if (aVar.getFlexWrap() != 2) {
            view.layout(i11, i12 + bVar.O(), i13, i14 + bVar.O());
        } else {
            view.layout(i11, i12 - bVar.o0(), i13, i14 - bVar.o0());
        }
    }

    final void s(View view, c cVar, boolean z11, int i11, int i12, int i13, int i14) {
        com.google.android.flexbox.b bVar = (com.google.android.flexbox.b) view.getLayoutParams();
        int alignItems = this.f57854a.getAlignItems();
        if (bVar.T0() != -1) {
            alignItems = bVar.T0();
        }
        int i15 = cVar.f57842g;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (!z11) {
                    view.layout(((i11 + i15) - view.getMeasuredWidth()) - bVar.V1(), i12, ((i13 + i15) - view.getMeasuredWidth()) - bVar.V1(), i14);
                    return;
                }
                view.layout(view.getMeasuredWidth() + (i11 - i15) + bVar.M1(), i12, view.getMeasuredWidth() + (i13 - i15) + bVar.M1(), i14);
                return;
            }
            if (alignItems == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int marginStart = ((marginLayoutParams.getMarginStart() + (i15 - view.getMeasuredWidth())) - marginLayoutParams.getMarginEnd()) / 2;
                if (z11) {
                    view.layout(i11 - marginStart, i12, i13 - marginStart, i14);
                    return;
                } else {
                    view.layout(i11 + marginStart, i12, i13 + marginStart, i14);
                    return;
                }
            }
            if (alignItems != 3 && alignItems != 4) {
                return;
            }
        }
        if (z11) {
            view.layout(i11 - bVar.V1(), i12, i13 - bVar.V1(), i14);
        } else {
            view.layout(i11 + bVar.M1(), i12, i13 + bVar.M1(), i14);
        }
    }

    final void x(int i11) {
        View reorderedFlexItemAt;
        com.google.android.flexbox.a aVar = this.f57854a;
        if (i11 >= aVar.getFlexItemCount()) {
            return;
        }
        int flexDirection = aVar.getFlexDirection();
        if (aVar.getAlignItems() != 4) {
            for (c cVar : aVar.getFlexLinesInternal()) {
                Iterator it = cVar.f57849n.iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    View reorderedFlexItemAt2 = aVar.getReorderedFlexItemAt(num.intValue());
                    if (flexDirection == 0 || flexDirection == 1) {
                        w(reorderedFlexItemAt2, cVar.f57842g, num.intValue());
                    } else {
                        if (flexDirection != 2 && flexDirection != 3) {
                            throw new IllegalArgumentException(Ej.b.a(flexDirection, "Invalid flex direction: "));
                        }
                        v(reorderedFlexItemAt2, cVar.f57842g, num.intValue());
                    }
                }
            }
            return;
        }
        int[] iArr = this.f57856c;
        List<c> flexLinesInternal = aVar.getFlexLinesInternal();
        int size = flexLinesInternal.size();
        for (int i12 = iArr != null ? iArr[i11] : 0; i12 < size; i12++) {
            c cVar2 = flexLinesInternal.get(i12);
            int i13 = cVar2.f57843h;
            for (int i14 = 0; i14 < i13; i14++) {
                int i15 = cVar2.f57850o + i14;
                if (i14 < aVar.getFlexItemCount() && (reorderedFlexItemAt = aVar.getReorderedFlexItemAt(i15)) != null && reorderedFlexItemAt.getVisibility() != 8) {
                    com.google.android.flexbox.b bVar = (com.google.android.flexbox.b) reorderedFlexItemAt.getLayoutParams();
                    if (bVar.T0() == -1 || bVar.T0() == 4) {
                        if (flexDirection == 0 || flexDirection == 1) {
                            w(reorderedFlexItemAt, cVar2.f57842g, i15);
                        } else {
                            if (flexDirection != 2 && flexDirection != 3) {
                                throw new IllegalArgumentException(Ej.b.a(flexDirection, "Invalid flex direction: "));
                            }
                            v(reorderedFlexItemAt, cVar2.f57842g, i15);
                        }
                    }
                }
            }
        }
    }
}
