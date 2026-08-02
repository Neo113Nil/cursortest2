package com.google.android.flexbox;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import xsna.dgn;
import xsna.eor;
import xsna.ji;
import xsna.lhg;
import xsna.vu5;

/* compiled from: FlexboxHelper.java */
/* loaded from: classes12.dex */
public final class b {
    public final eor a;
    public boolean[] b;

    @Nullable
    public int[] c;

    @Nullable
    public long[] d;

    @Nullable
    public long[] e;

    /* compiled from: FlexboxHelper.java */
    public static class a {
        public List<com.google.android.flexbox.a> a;
        public int b;
    }

    /* compiled from: FlexboxHelper.java */
    /* renamed from: com.google.android.flexbox.b$b, reason: collision with other inner class name */
    public static class C0110b implements Comparable<C0110b> {
        public int b;
        public int c;

        @Override // java.lang.Comparable
        public final int compareTo(@NonNull C0110b c0110b) {
            C0110b c0110b2 = c0110b;
            int i = this.c;
            int i2 = c0110b2.c;
            return i != i2 ? i - i2 : this.b - c0110b2.b;
        }

        @NonNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Order{order=");
            sb.append(this.c);
            sb.append(", index=");
            return vu5.b(sb, this.b, '}');
        }
    }

    public b(eor eorVar) {
        this.a = eorVar;
    }

    public static ArrayList e(int i, int i2, List list) {
        int i3 = (i - i2) / 2;
        ArrayList arrayList = new ArrayList();
        com.google.android.flexbox.a aVar = new com.google.android.flexbox.a();
        aVar.g = i3;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (i4 == 0) {
                arrayList.add(aVar);
            }
            arrayList.add((com.google.android.flexbox.a) list.get(i4));
            if (i4 == list.size() - 1) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    public static int[] r(int i, ArrayList arrayList, SparseIntArray sparseIntArray) {
        Collections.sort(arrayList);
        sparseIntArray.clear();
        int[] iArr = new int[i];
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            C0110b c0110b = (C0110b) it.next();
            int i3 = c0110b.b;
            iArr[i2] = i3;
            sparseIntArray.append(i3, c0110b.c);
            i2++;
        }
        return iArr;
    }

    public final void a(List<com.google.android.flexbox.a> list, com.google.android.flexbox.a aVar, int i, int i2) {
        aVar.m = i2;
        this.a.f(aVar);
        aVar.p = i;
        list.add(aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:166:0x01f6, code lost:
    
        if (r8 < (r9 + r14)) goto L100;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x038b A[ADDED_TO_REGION] */
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
    public final void b(a aVar, int i, int i2, int i3, int i4, int i5, @Nullable List<com.google.android.flexbox.a> list) {
        List<com.google.android.flexbox.a> list2;
        int i6;
        int i7;
        FlexItem flexItem;
        int i8;
        int[] iArr;
        boolean z;
        int i9 = i;
        eor eorVar = this.a;
        boolean m = eorVar.m();
        int mode = View.MeasureSpec.getMode(i9);
        int size = View.MeasureSpec.getSize(i9);
        List<com.google.android.flexbox.a> arrayList = list == null ? new ArrayList<>() : list;
        aVar.a = arrayList;
        boolean z2 = i5 == -1;
        int paddingStart = m ? eorVar.getPaddingStart() : eorVar.getPaddingTop();
        int paddingEnd = m ? eorVar.getPaddingEnd() : eorVar.getPaddingBottom();
        int paddingTop = m ? eorVar.getPaddingTop() : eorVar.getPaddingStart();
        int paddingBottom = m ? eorVar.getPaddingBottom() : eorVar.getPaddingEnd();
        com.google.android.flexbox.a aVar2 = new com.google.android.flexbox.a();
        int i10 = i4;
        int i11 = 1;
        aVar2.o = i10;
        int i12 = paddingStart + paddingEnd;
        aVar2.e = i12;
        int flexItemCount = eorVar.getFlexItemCount();
        boolean z3 = z2;
        int i13 = Integer.MIN_VALUE;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i10 < flexItemCount) {
            int i17 = flexItemCount;
            View j = eorVar.j(i10);
            if (j == null) {
                if (i10 == i17 - 1 && aVar2.a() != 0) {
                    a(arrayList, aVar2, i10, i15);
                }
            } else if (j.getVisibility() == 8) {
                aVar2.i++;
                aVar2.h++;
                if (i10 == i17 - 1 && aVar2.a() != 0) {
                    a(arrayList, aVar2, i10, i15);
                }
            } else {
                if (j instanceof CompoundButton) {
                    CompoundButton compoundButton = (CompoundButton) j;
                    FlexItem flexItem2 = (FlexItem) compoundButton.getLayoutParams();
                    int F1 = flexItem2.F1();
                    i6 = i12;
                    int U5 = flexItem2.U5();
                    Drawable buttonDrawable = compoundButton.getButtonDrawable();
                    int minimumWidth = buttonDrawable == null ? 0 : buttonDrawable.getMinimumWidth();
                    int minimumHeight = buttonDrawable == null ? 0 : buttonDrawable.getMinimumHeight();
                    list2 = arrayList;
                    if (F1 == -1) {
                        F1 = minimumWidth;
                    }
                    flexItem2.t5(F1);
                    if (U5 == -1) {
                        U5 = minimumHeight;
                    }
                    flexItem2.o4(U5);
                } else {
                    list2 = arrayList;
                    i6 = i12;
                }
                FlexItem flexItem3 = (FlexItem) j.getLayoutParams();
                if (flexItem3.Z8() == 4) {
                    aVar2.n.add(Integer.valueOf(i10));
                }
                int width = m ? flexItem3.getWidth() : flexItem3.getHeight();
                if (flexItem3.B9() != -1.0f && mode == 1073741824) {
                    width = Math.round(size * flexItem3.B9());
                }
                if (m) {
                    i7 = eorVar.k(i9, i6 + flexItem3.u5() + flexItem3.T5(), width);
                    int i18 = eorVar.i(i2, paddingTop + paddingBottom + flexItem3.g0() + flexItem3.L() + i15, flexItem3.getHeight());
                    j.measure(i7, i18);
                    v(j, i10, i7, i18);
                } else {
                    int k = eorVar.k(i2, paddingTop + paddingBottom + flexItem3.u5() + flexItem3.T5() + i15, flexItem3.getWidth());
                    i7 = eorVar.i(i9, i6 + flexItem3.g0() + flexItem3.L(), width);
                    j.measure(k, i7);
                    v(j, i10, k, i7);
                }
                eorVar.l(i10, j);
                c(i10, j);
                i14 = View.combineMeasuredStates(i14, j.getMeasuredState());
                int i19 = aVar2.e;
                int measuredWidth = (m ? j.getMeasuredWidth() : j.getMeasuredHeight()) + (m ? flexItem3.u5() : flexItem3.g0()) + (m ? flexItem3.T5() : flexItem3.L());
                int size2 = list2.size();
                if (eorVar.getFlexWrap() != 0) {
                    if (flexItem3.H9()) {
                        flexItem = flexItem3;
                    } else if (mode != 0) {
                        flexItem = flexItem3;
                        int maxLine = eorVar.getMaxLine();
                        if (maxLine == -1 || maxLine > size2 + 1) {
                            int a2 = eorVar.a(i10, i16, j);
                            if (a2 > 0) {
                                measuredWidth += a2;
                            }
                        }
                        i12 = i6;
                        arrayList = list2;
                        aVar2.h += i11;
                        i16++;
                        i8 = i13;
                        aVar2.q |= flexItem.r4() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        aVar2.r |= flexItem.Z3() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        iArr = this.c;
                        if (iArr != null) {
                            iArr[i10] = arrayList.size();
                        }
                        aVar2.e = (m ? j.getMeasuredWidth() : j.getMeasuredHeight()) + (m ? flexItem.u5() : flexItem.g0()) + (m ? flexItem.T5() : flexItem.L()) + aVar2.e;
                        aVar2.j += flexItem.r4();
                        aVar2.k += flexItem.Z3();
                        eorVar.g(j, i10, i16, aVar2);
                        int max = Math.max(i8, eorVar.c(j) + (m ? j.getMeasuredHeight() : j.getMeasuredWidth()) + (m ? flexItem.g0() : flexItem.u5()) + (m ? flexItem.L() : flexItem.T5()));
                        aVar2.g = Math.max(aVar2.g, max);
                        if (m) {
                            if (eorVar.getFlexWrap() != 2) {
                                aVar2.l = Math.max(aVar2.l, j.getBaseline() + flexItem.g0());
                            } else {
                                aVar2.l = Math.max(aVar2.l, (j.getMeasuredHeight() - j.getBaseline()) + flexItem.L());
                            }
                        }
                        if (i10 == i17 - 1 && aVar2.a() != 0) {
                            a(arrayList, aVar2, i10, i15);
                            i15 += aVar2.g;
                        }
                        if (i5 == -1 && arrayList.size() > 0) {
                            if (((com.google.android.flexbox.a) ji.a(1, arrayList)).p >= i5 && i10 >= i5 && !z3) {
                                i15 = -aVar2.g;
                                z = true;
                                if (i15 <= i3 && z) {
                                    break;
                                }
                                i13 = max;
                                i10++;
                                z3 = z;
                                flexItemCount = i17;
                                i11 = 1;
                                i9 = i;
                            }
                        }
                        z = z3;
                        if (i15 <= i3) {
                        }
                        i13 = max;
                        i10++;
                        z3 = z;
                        flexItemCount = i17;
                        i11 = 1;
                        i9 = i;
                    }
                    if (aVar2.a() > 0) {
                        arrayList = list2;
                        a(arrayList, aVar2, i10 > 0 ? i10 - 1 : 0, i15);
                        i15 += aVar2.g;
                    } else {
                        arrayList = list2;
                    }
                    if (m) {
                        if (flexItem.getHeight() == -1) {
                            j.measure(i7, eorVar.i(i2, eorVar.getPaddingBottom() + eorVar.getPaddingTop() + flexItem.g0() + flexItem.L() + i15, flexItem.getHeight()));
                            c(i10, j);
                        }
                    } else if (flexItem.getWidth() == -1) {
                        j.measure(eorVar.k(i2, eorVar.getPaddingRight() + eorVar.getPaddingLeft() + flexItem.u5() + flexItem.T5() + i15, flexItem.getWidth()), i7);
                        c(i10, j);
                    }
                    aVar2 = new com.google.android.flexbox.a();
                    aVar2.h = i11;
                    i12 = i6;
                    aVar2.e = i12;
                    aVar2.o = i10;
                    i8 = Integer.MIN_VALUE;
                    i16 = 0;
                    aVar2.q |= flexItem.r4() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    aVar2.r |= flexItem.Z3() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    iArr = this.c;
                    if (iArr != null) {
                    }
                    aVar2.e = (m ? j.getMeasuredWidth() : j.getMeasuredHeight()) + (m ? flexItem.u5() : flexItem.g0()) + (m ? flexItem.T5() : flexItem.L()) + aVar2.e;
                    aVar2.j += flexItem.r4();
                    aVar2.k += flexItem.Z3();
                    eorVar.g(j, i10, i16, aVar2);
                    int max2 = Math.max(i8, eorVar.c(j) + (m ? j.getMeasuredHeight() : j.getMeasuredWidth()) + (m ? flexItem.g0() : flexItem.u5()) + (m ? flexItem.L() : flexItem.T5()));
                    aVar2.g = Math.max(aVar2.g, max2);
                    if (m) {
                    }
                    if (i10 == i17 - 1) {
                        a(arrayList, aVar2, i10, i15);
                        i15 += aVar2.g;
                    }
                    if (i5 == -1) {
                    }
                    z = z3;
                    if (i15 <= i3) {
                    }
                    i13 = max2;
                    i10++;
                    z3 = z;
                    flexItemCount = i17;
                    i11 = 1;
                    i9 = i;
                }
                flexItem = flexItem3;
                i12 = i6;
                arrayList = list2;
                aVar2.h += i11;
                i16++;
                i8 = i13;
                aVar2.q |= flexItem.r4() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                aVar2.r |= flexItem.Z3() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                iArr = this.c;
                if (iArr != null) {
                }
                aVar2.e = (m ? j.getMeasuredWidth() : j.getMeasuredHeight()) + (m ? flexItem.u5() : flexItem.g0()) + (m ? flexItem.T5() : flexItem.L()) + aVar2.e;
                aVar2.j += flexItem.r4();
                aVar2.k += flexItem.Z3();
                eorVar.g(j, i10, i16, aVar2);
                int max22 = Math.max(i8, eorVar.c(j) + (m ? j.getMeasuredHeight() : j.getMeasuredWidth()) + (m ? flexItem.g0() : flexItem.u5()) + (m ? flexItem.L() : flexItem.T5()));
                aVar2.g = Math.max(aVar2.g, max22);
                if (m) {
                }
                if (i10 == i17 - 1) {
                }
                if (i5 == -1) {
                }
                z = z3;
                if (i15 <= i3) {
                }
                i13 = max22;
                i10++;
                z3 = z;
                flexItemCount = i17;
                i11 = 1;
                i9 = i;
            }
            z = z3;
            i10++;
            z3 = z;
            flexItemCount = i17;
            i11 = 1;
            i9 = i;
        }
        aVar.b = i14;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(int i, View view) {
        boolean z;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        boolean z2 = true;
        if (measuredWidth < flexItem.F1()) {
            measuredWidth = flexItem.F1();
        } else {
            if (measuredWidth <= flexItem.getMaxWidth()) {
                z = false;
                if (measuredHeight >= flexItem.U5()) {
                    measuredHeight = flexItem.U5();
                } else if (measuredHeight > flexItem.L0()) {
                    measuredHeight = flexItem.L0();
                } else {
                    z2 = z;
                }
                if (z2) {
                    return;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
                view.measure(makeMeasureSpec, makeMeasureSpec2);
                v(view, i, makeMeasureSpec, makeMeasureSpec2);
                this.a.l(i, view);
                return;
            }
            measuredWidth = flexItem.getMaxWidth();
        }
        z = true;
        if (measuredHeight >= flexItem.U5()) {
        }
        if (z2) {
        }
    }

    public final void d(int i, List list) {
        int i2 = this.c[i];
        if (i2 == -1) {
            i2 = 0;
        }
        if (list.size() > i2) {
            list.subList(i2, list.size()).clear();
        }
        int[] iArr = this.c;
        int length = iArr.length - 1;
        if (i > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i, length, -1);
        }
        long[] jArr = this.d;
        int length2 = jArr.length - 1;
        if (i > length2) {
            Arrays.fill(jArr, 0L);
        } else {
            Arrays.fill(jArr, i, length2, 0L);
        }
    }

    @NonNull
    public final ArrayList f(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            FlexItem flexItem = (FlexItem) this.a.h(i2).getLayoutParams();
            C0110b c0110b = new C0110b();
            c0110b.c = flexItem.getOrder();
            c0110b.b = i2;
            arrayList.add(c0110b);
        }
        return arrayList;
    }

    public final void g(int i, int i2, int i3) {
        int mode;
        int size;
        eor eorVar = this.a;
        int flexDirection = eorVar.getFlexDirection();
        if (flexDirection == 0 || flexDirection == 1) {
            mode = View.MeasureSpec.getMode(i2);
            size = View.MeasureSpec.getSize(i2);
        } else {
            if (flexDirection != 2 && flexDirection != 3) {
                throw new IllegalArgumentException(lhg.a(flexDirection, "Invalid flex direction: "));
            }
            mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
        }
        List<com.google.android.flexbox.a> flexLinesInternal = eorVar.getFlexLinesInternal();
        if (mode == 1073741824) {
            int sumOfCrossSize = eorVar.getSumOfCrossSize() + i3;
            int i4 = 0;
            if (flexLinesInternal.size() == 1) {
                flexLinesInternal.get(0).g = size - i3;
                return;
            }
            if (flexLinesInternal.size() >= 2) {
                int alignContent = eorVar.getAlignContent();
                if (alignContent == 1) {
                    com.google.android.flexbox.a aVar = new com.google.android.flexbox.a();
                    aVar.g = size - sumOfCrossSize;
                    flexLinesInternal.add(0, aVar);
                    return;
                }
                if (alignContent == 2) {
                    eorVar.setFlexLines(e(size, sumOfCrossSize, flexLinesInternal));
                    return;
                }
                if (alignContent == 3) {
                    if (sumOfCrossSize >= size) {
                        return;
                    }
                    float size2 = (size - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                    ArrayList arrayList = new ArrayList();
                    int size3 = flexLinesInternal.size();
                    float f = 0.0f;
                    while (i4 < size3) {
                        arrayList.add(flexLinesInternal.get(i4));
                        if (i4 != flexLinesInternal.size() - 1) {
                            com.google.android.flexbox.a aVar2 = new com.google.android.flexbox.a();
                            if (i4 == flexLinesInternal.size() - 2) {
                                aVar2.g = Math.round(f + size2);
                                f = 0.0f;
                            } else {
                                aVar2.g = Math.round(size2);
                            }
                            int i5 = aVar2.g;
                            float f2 = (size2 - i5) + f;
                            if (f2 > 1.0f) {
                                aVar2.g = i5 + 1;
                                f2 -= 1.0f;
                            } else if (f2 < -1.0f) {
                                aVar2.g = i5 - 1;
                                f2 += 1.0f;
                            }
                            f = f2;
                            arrayList.add(aVar2);
                        }
                        i4++;
                    }
                    eorVar.setFlexLines(arrayList);
                    return;
                }
                if (alignContent == 4) {
                    if (sumOfCrossSize >= size) {
                        eorVar.setFlexLines(e(size, sumOfCrossSize, flexLinesInternal));
                        return;
                    }
                    int size4 = (size - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                    ArrayList arrayList2 = new ArrayList();
                    com.google.android.flexbox.a aVar3 = new com.google.android.flexbox.a();
                    aVar3.g = size4;
                    for (com.google.android.flexbox.a aVar4 : flexLinesInternal) {
                        arrayList2.add(aVar3);
                        arrayList2.add(aVar4);
                        arrayList2.add(aVar3);
                    }
                    eorVar.setFlexLines(arrayList2);
                    return;
                }
                if (alignContent == 5 && sumOfCrossSize < size) {
                    float size5 = (size - sumOfCrossSize) / flexLinesInternal.size();
                    int size6 = flexLinesInternal.size();
                    float f3 = 0.0f;
                    while (i4 < size6) {
                        com.google.android.flexbox.a aVar5 = flexLinesInternal.get(i4);
                        float f4 = aVar5.g + size5;
                        if (i4 == flexLinesInternal.size() - 1) {
                            f4 += f3;
                            f3 = 0.0f;
                        }
                        int round = Math.round(f4);
                        float f5 = (f4 - round) + f3;
                        if (f5 > 1.0f) {
                            round++;
                            f5 -= 1.0f;
                        } else if (f5 < -1.0f) {
                            round--;
                            f5 += 1.0f;
                        }
                        f3 = f5;
                        aVar5.g = round;
                        i4++;
                    }
                }
            }
        }
    }

    public final void h(int i, int i2, int i3) {
        int size;
        int paddingLeft;
        int paddingRight;
        int i4;
        int i5;
        eor eorVar = this.a;
        int flexItemCount = eorVar.getFlexItemCount();
        boolean[] zArr = this.b;
        if (zArr == null) {
            this.b = new boolean[Math.max(flexItemCount, 10)];
        } else if (zArr.length < flexItemCount) {
            this.b = new boolean[Math.max(zArr.length * 2, flexItemCount)];
        } else {
            Arrays.fill(zArr, false);
        }
        if (i3 >= eorVar.getFlexItemCount()) {
            return;
        }
        int flexDirection = eorVar.getFlexDirection();
        int flexDirection2 = eorVar.getFlexDirection();
        if (flexDirection2 == 0 || flexDirection2 == 1) {
            int mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
            int largestMainSize = eorVar.getLargestMainSize();
            if (mode != 1073741824) {
                size = Math.min(largestMainSize, size);
            }
            paddingLeft = eorVar.getPaddingLeft();
            paddingRight = eorVar.getPaddingRight();
        } else {
            if (flexDirection2 != 2 && flexDirection2 != 3) {
                throw new IllegalArgumentException(lhg.a(flexDirection, "Invalid flex direction: "));
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            size = View.MeasureSpec.getSize(i2);
            if (mode2 != 1073741824) {
                size = eorVar.getLargestMainSize();
            }
            paddingLeft = eorVar.getPaddingTop();
            paddingRight = eorVar.getPaddingBottom();
        }
        int i6 = paddingRight + paddingLeft;
        int i7 = size;
        int[] iArr = this.c;
        int i8 = iArr != null ? iArr[i3] : 0;
        List<com.google.android.flexbox.a> flexLinesInternal = eorVar.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        while (i8 < size2) {
            com.google.android.flexbox.a aVar = flexLinesInternal.get(i8);
            int i9 = aVar.e;
            if (i9 >= i7 || !aVar.q) {
                i4 = i;
                i5 = i2;
                if (i9 > i7 && aVar.r) {
                    q(i4, i5, aVar, i7, i6, false);
                }
            } else {
                i4 = i;
                i5 = i2;
                l(i4, i5, aVar, i7, i6, false);
            }
            i8++;
            i = i4;
            i2 = i5;
        }
    }

    public final void i(int i) {
        int[] iArr = this.c;
        if (iArr == null) {
            this.c = new int[Math.max(i, 10)];
        } else if (iArr.length < i) {
            this.c = Arrays.copyOf(this.c, Math.max(iArr.length * 2, i));
        }
    }

    public final void j(int i) {
        long[] jArr = this.d;
        if (jArr == null) {
            this.d = new long[Math.max(i, 10)];
        } else if (jArr.length < i) {
            this.d = Arrays.copyOf(this.d, Math.max(jArr.length * 2, i));
        }
    }

    public final void k(int i) {
        long[] jArr = this.e;
        if (jArr == null) {
            this.e = new long[Math.max(i, 10)];
        } else if (jArr.length < i) {
            this.e = Arrays.copyOf(this.e, Math.max(jArr.length * 2, i));
        }
    }

    public final void l(int i, int i2, com.google.android.flexbox.a aVar, int i3, int i4, boolean z) {
        int i5;
        float f;
        int i6;
        float f2;
        boolean z2;
        int i7;
        int i8;
        double d;
        float f3;
        boolean z3;
        boolean z4;
        double d2;
        float f4 = aVar.j;
        float f5 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (f4 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || i3 < (i5 = aVar.e)) {
            return;
        }
        float f6 = (i3 - i5) / f4;
        aVar.e = i4 + aVar.f;
        if (!z) {
            aVar.g = Integer.MIN_VALUE;
        }
        int i9 = 0;
        boolean z5 = false;
        int i10 = 0;
        float f7 = 0.0f;
        while (i9 < aVar.h) {
            int i11 = aVar.o + i9;
            eor eorVar = this.a;
            View j = eorVar.j(i11);
            if (j == null || j.getVisibility() == 8) {
                f = f5;
                i6 = i5;
                f2 = f6;
                z2 = z5;
                i7 = i9;
            } else {
                FlexItem flexItem = (FlexItem) j.getLayoutParams();
                int flexDirection = eorVar.getFlexDirection();
                f = f5;
                if (flexDirection == 0 || flexDirection == 1) {
                    i6 = i5;
                    float f8 = f6;
                    z2 = z5;
                    int measuredWidth = j.getMeasuredWidth();
                    long[] jArr = this.e;
                    if (jArr != null) {
                        measuredWidth = (int) jArr[i11];
                    }
                    int measuredHeight = j.getMeasuredHeight();
                    long[] jArr2 = this.e;
                    if (jArr2 != null) {
                        measuredHeight = (int) (jArr2[i11] >> 32);
                    }
                    if (this.b[i11] || flexItem.r4() <= f) {
                        i7 = i9;
                        f2 = f8;
                    } else {
                        float r4 = (flexItem.r4() * f8) + measuredWidth;
                        if (i9 == aVar.h - 1) {
                            r4 += f7;
                            f7 = f;
                        }
                        int round = Math.round(r4);
                        if (round > flexItem.getMaxWidth()) {
                            round = flexItem.getMaxWidth();
                            this.b[i11] = true;
                            aVar.j -= flexItem.r4();
                            z2 = true;
                            i7 = i9;
                            f2 = f8;
                        } else {
                            float f9 = (r4 - round) + f7;
                            i7 = i9;
                            f2 = f8;
                            double d3 = f9;
                            if (d3 > 1.0d) {
                                round++;
                                d = d3 - 1.0d;
                            } else if (d3 < -1.0d) {
                                round--;
                                d = d3 + 1.0d;
                            } else {
                                f7 = f9;
                            }
                            f7 = (float) d;
                        }
                        int m = m(i2, flexItem, aVar.m);
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                        j.measure(makeMeasureSpec, m);
                        int measuredWidth2 = j.getMeasuredWidth();
                        int measuredHeight2 = j.getMeasuredHeight();
                        v(j, i11, makeMeasureSpec, m);
                        eorVar.l(i11, j);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int max = Math.max(i10, eorVar.c(j) + measuredHeight + flexItem.g0() + flexItem.L());
                    aVar.e = measuredWidth + flexItem.u5() + flexItem.T5() + aVar.e;
                    i8 = max;
                } else {
                    int measuredHeight3 = j.getMeasuredHeight();
                    long[] jArr3 = this.e;
                    if (jArr3 != null) {
                        long j2 = jArr3[i11];
                        f3 = f6;
                        z3 = z5;
                        measuredHeight3 = (int) (j2 >> 32);
                    } else {
                        f3 = f6;
                        z3 = z5;
                    }
                    int measuredWidth3 = j.getMeasuredWidth();
                    long[] jArr4 = this.e;
                    if (jArr4 != null) {
                        measuredWidth3 = (int) jArr4[i11];
                    }
                    if (this.b[i11] || flexItem.r4() <= f) {
                        i6 = i5;
                        z4 = z3;
                    } else {
                        float r42 = (flexItem.r4() * f3) + measuredHeight3;
                        if (i9 == aVar.h - 1) {
                            r42 += f7;
                            f7 = f;
                        }
                        int round2 = Math.round(r42);
                        if (round2 > flexItem.L0()) {
                            round2 = flexItem.L0();
                            this.b[i11] = true;
                            aVar.j -= flexItem.r4();
                            z4 = true;
                            i6 = i5;
                        } else {
                            float f10 = (r42 - round2) + f7;
                            i6 = i5;
                            double d4 = f10;
                            if (d4 > 1.0d) {
                                round2++;
                                d2 = d4 - 1.0d;
                            } else if (d4 < -1.0d) {
                                round2--;
                                d2 = d4 + 1.0d;
                            } else {
                                f7 = f10;
                                z4 = z3;
                            }
                            f7 = (float) d2;
                            z4 = z3;
                        }
                        int n = n(i, flexItem, aVar.m);
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                        j.measure(n, makeMeasureSpec2);
                        int measuredWidth4 = j.getMeasuredWidth();
                        int measuredHeight4 = j.getMeasuredHeight();
                        v(j, i11, n, makeMeasureSpec2);
                        eorVar.l(i11, j);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    i8 = Math.max(i10, eorVar.c(j) + measuredWidth3 + flexItem.u5() + flexItem.T5());
                    aVar.e = measuredHeight3 + flexItem.g0() + flexItem.L() + aVar.e;
                    f2 = f3;
                    z2 = z4;
                    i7 = i9;
                }
                aVar.g = Math.max(aVar.g, i8);
                i10 = i8;
            }
            i9 = i7 + 1;
            f6 = f2;
            f5 = f;
            i5 = i6;
            z5 = z2;
        }
        int i12 = i5;
        if (!z5 || i12 == aVar.e) {
            return;
        }
        l(i, i2, aVar, i3, i4, true);
    }

    public final int m(int i, FlexItem flexItem, int i2) {
        eor eorVar = this.a;
        int i3 = eorVar.i(i, eorVar.getPaddingBottom() + eorVar.getPaddingTop() + flexItem.g0() + flexItem.L() + i2, flexItem.getHeight());
        int size = View.MeasureSpec.getSize(i3);
        return size > flexItem.L0() ? View.MeasureSpec.makeMeasureSpec(flexItem.L0(), View.MeasureSpec.getMode(i3)) : size < flexItem.U5() ? View.MeasureSpec.makeMeasureSpec(flexItem.U5(), View.MeasureSpec.getMode(i3)) : i3;
    }

    public final int n(int i, FlexItem flexItem, int i2) {
        eor eorVar = this.a;
        int k = eorVar.k(i, eorVar.getPaddingRight() + eorVar.getPaddingLeft() + flexItem.u5() + flexItem.T5() + i2, flexItem.getWidth());
        int size = View.MeasureSpec.getSize(k);
        return size > flexItem.getMaxWidth() ? View.MeasureSpec.makeMeasureSpec(flexItem.getMaxWidth(), View.MeasureSpec.getMode(k)) : size < flexItem.F1() ? View.MeasureSpec.makeMeasureSpec(flexItem.F1(), View.MeasureSpec.getMode(k)) : k;
    }

    public final void o(View view, com.google.android.flexbox.a aVar, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        eor eorVar = this.a;
        int alignItems = eorVar.getAlignItems();
        if (flexItem.Z8() != -1) {
            alignItems = flexItem.Z8();
        }
        int i5 = aVar.g;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (eorVar.getFlexWrap() != 2) {
                    int i6 = i2 + i5;
                    view.layout(i, (i6 - view.getMeasuredHeight()) - flexItem.L(), i3, i6 - flexItem.L());
                    return;
                } else {
                    view.layout(i, view.getMeasuredHeight() + (i2 - i5) + flexItem.g0(), i3, view.getMeasuredHeight() + (i4 - i5) + flexItem.g0());
                    return;
                }
            }
            if (alignItems == 2) {
                int measuredHeight = (((i5 - view.getMeasuredHeight()) + flexItem.g0()) - flexItem.L()) / 2;
                if (eorVar.getFlexWrap() != 2) {
                    int i7 = i2 + measuredHeight;
                    dgn.b(view, i7, i, i7, i3);
                    return;
                } else {
                    int i8 = i2 - measuredHeight;
                    dgn.b(view, i8, i, i8, i3);
                    return;
                }
            }
            if (alignItems == 3) {
                if (eorVar.getFlexWrap() != 2) {
                    int max = Math.max(aVar.l - view.getBaseline(), flexItem.g0());
                    view.layout(i, i2 + max, i3, i4 + max);
                    return;
                } else {
                    int max2 = Math.max(view.getBaseline() + (aVar.l - view.getMeasuredHeight()), flexItem.L());
                    view.layout(i, i2 - max2, i3, i4 - max2);
                    return;
                }
            }
            if (alignItems != 4) {
                return;
            }
        }
        if (eorVar.getFlexWrap() != 2) {
            view.layout(i, i2 + flexItem.g0(), i3, i4 + flexItem.g0());
        } else {
            view.layout(i, i2 - flexItem.L(), i3, i4 - flexItem.L());
        }
    }

    public final void p(View view, com.google.android.flexbox.a aVar, boolean z, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int alignItems = this.a.getAlignItems();
        if (flexItem.Z8() != -1) {
            alignItems = flexItem.Z8();
        }
        int i5 = aVar.g;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (!z) {
                    view.layout(((i + i5) - view.getMeasuredWidth()) - flexItem.T5(), i2, ((i3 + i5) - view.getMeasuredWidth()) - flexItem.T5(), i4);
                    return;
                }
                view.layout(view.getMeasuredWidth() + (i - i5) + flexItem.u5(), i2, view.getMeasuredWidth() + (i3 - i5) + flexItem.u5(), i4);
                return;
            }
            if (alignItems == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int marginStart = ((marginLayoutParams.getMarginStart() + (i5 - view.getMeasuredWidth())) - marginLayoutParams.getMarginEnd()) / 2;
                if (z) {
                    view.layout(i - marginStart, i2, i3 - marginStart, i4);
                    return;
                } else {
                    view.layout(i + marginStart, i2, i3 + marginStart, i4);
                    return;
                }
            }
            if (alignItems != 3 && alignItems != 4) {
                return;
            }
        }
        if (z) {
            view.layout(i - flexItem.T5(), i2, i3 - flexItem.T5(), i4);
        } else {
            view.layout(i + flexItem.u5(), i2, i3 + flexItem.u5(), i4);
        }
    }

    public final void q(int i, int i2, com.google.android.flexbox.a aVar, int i3, int i4, boolean z) {
        float f;
        float f2;
        int i5;
        int i6;
        int i7;
        int i8 = aVar.e;
        float f3 = aVar.k;
        float f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (f3 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || i3 > i8) {
            return;
        }
        float f5 = (i8 - i3) / f3;
        aVar.e = i4 + aVar.f;
        if (!z) {
            aVar.g = Integer.MIN_VALUE;
        }
        int i9 = 0;
        boolean z2 = false;
        int i10 = 0;
        float f6 = 0.0f;
        while (i9 < aVar.h) {
            int i11 = aVar.o + i9;
            eor eorVar = this.a;
            View j = eorVar.j(i11);
            if (j == null || j.getVisibility() == 8) {
                f = f4;
                f2 = f5;
            } else {
                FlexItem flexItem = (FlexItem) j.getLayoutParams();
                int flexDirection = eorVar.getFlexDirection();
                f = f4;
                if (flexDirection == 0 || flexDirection == 1) {
                    f2 = f5;
                    int measuredWidth = j.getMeasuredWidth();
                    long[] jArr = this.e;
                    if (jArr != null) {
                        measuredWidth = (int) jArr[i11];
                    }
                    int measuredHeight = j.getMeasuredHeight();
                    long[] jArr2 = this.e;
                    if (jArr2 != null) {
                        measuredHeight = (int) (jArr2[i11] >> 32);
                    }
                    if (!this.b[i11] && flexItem.Z3() > f) {
                        float Z3 = measuredWidth - (f2 * flexItem.Z3());
                        if (i9 == aVar.h - 1) {
                            Z3 += f6;
                            f6 = f;
                        }
                        int round = Math.round(Z3);
                        if (round < flexItem.F1()) {
                            i6 = flexItem.F1();
                            this.b[i11] = true;
                            aVar.k -= flexItem.Z3();
                            z2 = true;
                        } else {
                            float f7 = (Z3 - round) + f6;
                            double d = f7;
                            if (d > 1.0d) {
                                i6 = round + 1;
                                f7 -= 1.0f;
                            } else if (d < -1.0d) {
                                i6 = round - 1;
                                f7 += 1.0f;
                            } else {
                                i6 = round;
                            }
                            f6 = f7;
                        }
                        int m = m(i2, flexItem, aVar.m);
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
                        j.measure(makeMeasureSpec, m);
                        int measuredWidth2 = j.getMeasuredWidth();
                        int measuredHeight2 = j.getMeasuredHeight();
                        v(j, i11, makeMeasureSpec, m);
                        eorVar.l(i11, j);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int max = Math.max(i10, eorVar.c(j) + measuredHeight + flexItem.g0() + flexItem.L());
                    aVar.e = measuredWidth + flexItem.u5() + flexItem.T5() + aVar.e;
                    i5 = max;
                } else {
                    int measuredHeight3 = j.getMeasuredHeight();
                    long[] jArr3 = this.e;
                    if (jArr3 != null) {
                        measuredHeight3 = (int) (jArr3[i11] >> 32);
                    }
                    int measuredWidth3 = j.getMeasuredWidth();
                    long[] jArr4 = this.e;
                    if (jArr4 != null) {
                        measuredWidth3 = (int) jArr4[i11];
                    }
                    if (this.b[i11] || flexItem.Z3() <= f) {
                        f2 = f5;
                    } else {
                        float Z32 = measuredHeight3 - (flexItem.Z3() * f5);
                        if (i9 == aVar.h - 1) {
                            Z32 += f6;
                            f6 = f;
                        }
                        int round2 = Math.round(Z32);
                        if (round2 < flexItem.U5()) {
                            i7 = flexItem.U5();
                            this.b[i11] = true;
                            aVar.k -= flexItem.Z3();
                            z2 = true;
                            f2 = f5;
                        } else {
                            float f8 = (Z32 - round2) + f6;
                            f2 = f5;
                            double d2 = f8;
                            if (d2 > 1.0d) {
                                i7 = round2 + 1;
                                f8 -= 1.0f;
                            } else if (d2 < -1.0d) {
                                i7 = round2 - 1;
                                f8 += 1.0f;
                            } else {
                                i7 = round2;
                            }
                            f6 = f8;
                        }
                        int n = n(i, flexItem, aVar.m);
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
                        j.measure(n, makeMeasureSpec2);
                        int measuredWidth4 = j.getMeasuredWidth();
                        int measuredHeight4 = j.getMeasuredHeight();
                        v(j, i11, n, makeMeasureSpec2);
                        eorVar.l(i11, j);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    i5 = Math.max(i10, eorVar.c(j) + measuredWidth3 + flexItem.u5() + flexItem.T5());
                    aVar.e = measuredHeight3 + flexItem.g0() + flexItem.L() + aVar.e;
                }
                aVar.g = Math.max(aVar.g, i5);
                i10 = i5;
            }
            i9++;
            f4 = f;
            f5 = f2;
        }
        if (!z2 || i8 == aVar.e) {
            return;
        }
        q(i, i2, aVar, i3, i4, true);
    }

    public final void s(int i, int i2, View view) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int u5 = (i - flexItem.u5()) - flexItem.T5();
        eor eorVar = this.a;
        int min = Math.min(Math.max(u5 - eorVar.c(view), flexItem.F1()), flexItem.getMaxWidth());
        long[] jArr = this.e;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) (jArr[i2] >> 32) : view.getMeasuredHeight(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec2, makeMeasureSpec);
        v(view, i2, makeMeasureSpec2, makeMeasureSpec);
        eorVar.l(i2, view);
    }

    public final void t(int i, int i2, View view) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int g0 = (i - flexItem.g0()) - flexItem.L();
        eor eorVar = this.a;
        int min = Math.min(Math.max(g0 - eorVar.c(view), flexItem.U5()), flexItem.L0());
        long[] jArr = this.e;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) jArr[i2] : view.getMeasuredWidth(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        v(view, i2, makeMeasureSpec, makeMeasureSpec2);
        eorVar.l(i2, view);
    }

    public final void u(int i) {
        View j;
        eor eorVar = this.a;
        if (i >= eorVar.getFlexItemCount()) {
            return;
        }
        int flexDirection = eorVar.getFlexDirection();
        if (eorVar.getAlignItems() != 4) {
            for (com.google.android.flexbox.a aVar : eorVar.getFlexLinesInternal()) {
                Iterator it = aVar.n.iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    View j2 = eorVar.j(num.intValue());
                    if (flexDirection == 0 || flexDirection == 1) {
                        t(aVar.g, num.intValue(), j2);
                    } else {
                        if (flexDirection != 2 && flexDirection != 3) {
                            throw new IllegalArgumentException(lhg.a(flexDirection, "Invalid flex direction: "));
                        }
                        s(aVar.g, num.intValue(), j2);
                    }
                }
            }
            return;
        }
        int[] iArr = this.c;
        List<com.google.android.flexbox.a> flexLinesInternal = eorVar.getFlexLinesInternal();
        int size = flexLinesInternal.size();
        for (int i2 = iArr != null ? iArr[i] : 0; i2 < size; i2++) {
            com.google.android.flexbox.a aVar2 = flexLinesInternal.get(i2);
            int i3 = aVar2.h;
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = aVar2.o + i4;
                if (i4 < eorVar.getFlexItemCount() && (j = eorVar.j(i5)) != null && j.getVisibility() != 8) {
                    FlexItem flexItem = (FlexItem) j.getLayoutParams();
                    if (flexItem.Z8() == -1 || flexItem.Z8() == 4) {
                        if (flexDirection == 0 || flexDirection == 1) {
                            t(aVar2.g, i5, j);
                        } else {
                            if (flexDirection != 2 && flexDirection != 3) {
                                throw new IllegalArgumentException(lhg.a(flexDirection, "Invalid flex direction: "));
                            }
                            s(aVar2.g, i5, j);
                        }
                    }
                }
            }
        }
    }

    public final void v(View view, int i, int i2, int i3) {
        long[] jArr = this.d;
        if (jArr != null) {
            jArr[i] = (i2 & 4294967295L) | (i3 << 32);
        }
        long[] jArr2 = this.e;
        if (jArr2 != null) {
            jArr2[i] = (view.getMeasuredWidth() & 4294967295L) | (view.getMeasuredHeight() << 32);
        }
    }
}
