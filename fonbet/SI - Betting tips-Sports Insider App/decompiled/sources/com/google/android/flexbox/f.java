package com.google.android.flexbox;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.appcompat.widget.c1;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final FlexboxLayout f4230a;

    /* renamed from: b, reason: collision with root package name */
    public boolean[] f4231b;

    public f(FlexboxLayout flexboxLayout) {
        this.f4230a = flexboxLayout;
    }

    public static ArrayList d(List list, int i5, int i10) {
        int i11 = (i5 - i10) / 2;
        ArrayList arrayList = new ArrayList();
        b bVar = new b();
        bVar.f4217g = i11;
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            if (i12 == 0) {
                arrayList.add(bVar);
            }
            arrayList.add((b) list.get(i12));
            if (i12 == list.size() - 1) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public static int[] n(int i5, ArrayList arrayList, SparseIntArray sparseIntArray) {
        Collections.sort(arrayList);
        sparseIntArray.clear();
        int[] iArr = new int[i5];
        Iterator it = arrayList.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            e eVar = (e) it.next();
            int i11 = eVar.f4228a;
            iArr[i10] = i11;
            sparseIntArray.append(i11, eVar.f4229b);
            i10++;
        }
        return iArr;
    }

    public final void a(List list, b bVar, int i5, int i10) {
        bVar.f4222m = i10;
        FlexboxLayout flexboxLayout = this.f4230a;
        if (flexboxLayout.i()) {
            if ((flexboxLayout.j & 4) > 0) {
                int i11 = bVar.f4215e;
                int i12 = flexboxLayout.f4197l;
                bVar.f4215e = i11 + i12;
                bVar.f4216f += i12;
            }
        } else if ((flexboxLayout.f4195i & 4) > 0) {
            int i13 = bVar.f4215e;
            int i14 = flexboxLayout.f4196k;
            bVar.f4215e = i13 + i14;
            bVar.f4216f += i14;
        }
        list.add(bVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:159:0x0218, code lost:
    
        if (r7 >= (r9 + r12)) goto L78;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x039d A[EDGE_INSN: B:111:0x039d->B:112:0x039d BREAK  A[LOOP:0: B:11:0x0068->B:22:0x03a2], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0359  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(d dVar, int i5, int i10) {
        int i11;
        int i12;
        List list;
        int i13;
        int childMeasureSpec;
        FlexItem flexItem;
        int i14;
        int i15;
        List list2;
        int i16;
        int i17;
        int i18 = i5;
        FlexboxLayout flexboxLayout = this.f4230a;
        boolean i19 = flexboxLayout.i();
        int mode = View.MeasureSpec.getMode(i18);
        int size = View.MeasureSpec.getSize(i18);
        List list3 = (List) Objects.requireNonNullElseGet(null, new c());
        dVar.f4227b = list3;
        int paddingStart = i19 ? flexboxLayout.getPaddingStart() : flexboxLayout.getPaddingTop();
        int paddingEnd = i19 ? flexboxLayout.getPaddingEnd() : flexboxLayout.getPaddingBottom();
        int paddingTop = i19 ? flexboxLayout.getPaddingTop() : flexboxLayout.getPaddingStart();
        int paddingBottom = i19 ? flexboxLayout.getPaddingBottom() : flexboxLayout.getPaddingEnd();
        b bVar = new b();
        int i20 = 0;
        bVar.f4224o = 0;
        int i21 = paddingStart + paddingEnd;
        bVar.f4215e = i21;
        int flexItemCount = flexboxLayout.getFlexItemCount();
        int i22 = paddingTop;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = Integer.MIN_VALUE;
        while (i20 < flexItemCount) {
            int i27 = flexItemCount;
            View e7 = flexboxLayout.e(i20);
            if (e7 == null) {
                if (i20 == i27 - 1 && bVar.a() != 0) {
                    a(list3, bVar, i20, i25);
                }
                i12 = i21;
                i11 = paddingBottom;
            } else {
                i11 = paddingBottom;
                i12 = i21;
                if (e7.getVisibility() == 8) {
                    bVar.f4219i++;
                    bVar.f4218h++;
                    if (i20 == i27 - 1 && bVar.a() != 0) {
                        a(list3, bVar, i20, i25);
                    }
                } else {
                    if (e7 instanceof CompoundButton) {
                        CompoundButton compoundButton = (CompoundButton) e7;
                        i13 = 1;
                        FlexItem flexItem2 = (FlexItem) compoundButton.getLayoutParams();
                        int z5 = flexItem2.z();
                        int f02 = flexItem2.f0();
                        Drawable buttonDrawable = compoundButton.getButtonDrawable();
                        int minimumWidth = buttonDrawable == null ? 0 : buttonDrawable.getMinimumWidth();
                        int minimumHeight = buttonDrawable == null ? 0 : buttonDrawable.getMinimumHeight();
                        list = list3;
                        if (z5 == -1) {
                            z5 = minimumWidth;
                        }
                        flexItem2.J(z5);
                        if (f02 == -1) {
                            f02 = minimumHeight;
                        }
                        flexItem2.U(f02);
                    } else {
                        list = list3;
                        i13 = 1;
                    }
                    FlexItem flexItem3 = (FlexItem) e7.getLayoutParams();
                    if (flexItem3.t() == 4) {
                        bVar.f4223n.add(Integer.valueOf(i20));
                    }
                    int width = i19 ? flexItem3.getWidth() : flexItem3.getHeight();
                    if (flexItem3.Y() != -1.0f && mode == 1073741824) {
                        width = Math.round(size * flexItem3.Y());
                    }
                    if (i19) {
                        childMeasureSpec = ViewGroup.getChildMeasureSpec(i18, i12 + flexItem3.O() + flexItem3.d0(), width);
                        e7.measure(childMeasureSpec, ViewGroup.getChildMeasureSpec(i10, i22 + i11 + flexItem3.R() + flexItem3.K() + i25, flexItem3.getHeight()));
                    } else {
                        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i10, i22 + i11 + flexItem3.O() + flexItem3.d0() + i25, flexItem3.getWidth());
                        childMeasureSpec = ViewGroup.getChildMeasureSpec(i18, i12 + flexItem3.R() + flexItem3.K(), width);
                        e7.measure(childMeasureSpec2, childMeasureSpec);
                    }
                    c(e7);
                    i23 = View.combineMeasuredStates(i23, e7.getMeasuredState());
                    int i28 = bVar.f4215e;
                    int measuredWidth = (i19 ? e7.getMeasuredWidth() : e7.getMeasuredHeight()) + (i19 ? flexItem3.O() : flexItem3.R()) + (i19 ? flexItem3.d0() : flexItem3.K());
                    int size2 = list.size();
                    if (flexboxLayout.getFlexWrap() != 0) {
                        if (flexItem3.h0()) {
                            flexItem = flexItem3;
                        } else if (mode != 0) {
                            flexItem = flexItem3;
                            int maxLine = flexboxLayout.getMaxLine();
                            if (maxLine == -1 || maxLine > size2 + 1) {
                                if (flexboxLayout.i()) {
                                    i14 = flexboxLayout.f(i20, i24) ? flexboxLayout.f4197l : 0;
                                    if ((flexboxLayout.j & 4) > 0) {
                                        i15 = flexboxLayout.f4197l;
                                        i14 += i15;
                                    }
                                    if (i14 > 0) {
                                        measuredWidth += i14;
                                    }
                                } else {
                                    i14 = flexboxLayout.f(i20, i24) ? flexboxLayout.f4196k : 0;
                                    if ((flexboxLayout.f4195i & 4) > 0) {
                                        i15 = flexboxLayout.f4196k;
                                        i14 += i15;
                                    }
                                    if (i14 > 0) {
                                    }
                                }
                                bVar.f4225p = (bVar.f4225p ? 1 : 0) | (flexItem.W() == 0.0f ? i16 : 0);
                                boolean z7 = bVar.q;
                                if (flexItem.w() == 0.0f) {
                                    i16 = 0;
                                }
                                bVar.q = i16 | (z7 ? 1 : 0);
                                bVar.f4215e = (!i19 ? e7.getMeasuredWidth() : e7.getMeasuredHeight()) + (!i19 ? flexItem.O() : flexItem.R()) + (!i19 ? flexItem.d0() : flexItem.K()) + bVar.f4215e;
                                bVar.j += flexItem.W();
                                bVar.f4220k += flexItem.w();
                                if (flexboxLayout.f(i20, i24)) {
                                    if (flexboxLayout.i()) {
                                        int i29 = bVar.f4215e;
                                        int i30 = flexboxLayout.f4197l;
                                        bVar.f4215e = i29 + i30;
                                        bVar.f4216f += i30;
                                    } else {
                                        int i31 = bVar.f4215e;
                                        int i32 = flexboxLayout.f4196k;
                                        bVar.f4215e = i31 + i32;
                                        bVar.f4216f += i32;
                                    }
                                }
                                int max = Math.max(i17, (!i19 ? e7.getMeasuredHeight() : e7.getMeasuredWidth()) + (!i19 ? flexItem.R() : flexItem.O()) + (!i19 ? flexItem.K() : flexItem.d0()));
                                bVar.f4217g = Math.max(bVar.f4217g, max);
                                if (i19) {
                                    if (flexboxLayout.getFlexWrap() != 2) {
                                        bVar.f4221l = Math.max(bVar.f4221l, e7.getBaseline() + flexItem.R());
                                    } else {
                                        bVar.f4221l = Math.max(bVar.f4221l, (e7.getMeasuredHeight() - e7.getBaseline()) + flexItem.K());
                                    }
                                }
                                if (i20 == i27 - 1 && bVar.a() != 0) {
                                    a(list2, bVar, i20, i25);
                                    i25 += bVar.f4217g;
                                }
                                if (i25 <= Integer.MAX_VALUE) {
                                    break;
                                }
                                i26 = max;
                                i20++;
                                list3 = list2;
                                flexItemCount = i27;
                                paddingBottom = i11;
                                i18 = i5;
                            }
                            i21 = i12;
                            i16 = i13;
                            list2 = list;
                            bVar.f4218h += i16;
                            i24++;
                            i17 = i26;
                            bVar.f4225p = (bVar.f4225p ? 1 : 0) | (flexItem.W() == 0.0f ? i16 : 0);
                            boolean z72 = bVar.q;
                            if (flexItem.w() == 0.0f) {
                            }
                            bVar.q = i16 | (z72 ? 1 : 0);
                            bVar.f4215e = (!i19 ? e7.getMeasuredWidth() : e7.getMeasuredHeight()) + (!i19 ? flexItem.O() : flexItem.R()) + (!i19 ? flexItem.d0() : flexItem.K()) + bVar.f4215e;
                            bVar.j += flexItem.W();
                            bVar.f4220k += flexItem.w();
                            if (flexboxLayout.f(i20, i24)) {
                            }
                            int max2 = Math.max(i17, (!i19 ? e7.getMeasuredHeight() : e7.getMeasuredWidth()) + (!i19 ? flexItem.R() : flexItem.O()) + (!i19 ? flexItem.K() : flexItem.d0()));
                            bVar.f4217g = Math.max(bVar.f4217g, max2);
                            if (i19) {
                            }
                            if (i20 == i27 - 1) {
                                a(list2, bVar, i20, i25);
                                i25 += bVar.f4217g;
                            }
                            if (i25 <= Integer.MAX_VALUE) {
                            }
                        }
                        if (bVar.a() > 0) {
                            list2 = list;
                            a(list2, bVar, i20 > 0 ? i20 - 1 : 0, i25);
                            i25 += bVar.f4217g;
                        } else {
                            list2 = list;
                        }
                        if (i19) {
                            if (flexItem.getHeight() == -1) {
                                e7.measure(childMeasureSpec, ViewGroup.getChildMeasureSpec(i10, flexboxLayout.getPaddingBottom() + flexboxLayout.getPaddingTop() + flexItem.R() + flexItem.K() + i25, flexItem.getHeight()));
                                c(e7);
                            }
                        } else if (flexItem.getWidth() == -1) {
                            e7.measure(ViewGroup.getChildMeasureSpec(i10, flexboxLayout.getPaddingRight() + flexboxLayout.getPaddingLeft() + flexItem.O() + flexItem.d0() + i25, flexItem.getWidth()), childMeasureSpec);
                            c(e7);
                        }
                        bVar = new b();
                        i16 = i13;
                        bVar.f4218h = i16;
                        i21 = i12;
                        bVar.f4215e = i21;
                        bVar.f4224o = i20;
                        i17 = Integer.MIN_VALUE;
                        i24 = 0;
                        bVar.f4225p = (bVar.f4225p ? 1 : 0) | (flexItem.W() == 0.0f ? i16 : 0);
                        boolean z722 = bVar.q;
                        if (flexItem.w() == 0.0f) {
                        }
                        bVar.q = i16 | (z722 ? 1 : 0);
                        bVar.f4215e = (!i19 ? e7.getMeasuredWidth() : e7.getMeasuredHeight()) + (!i19 ? flexItem.O() : flexItem.R()) + (!i19 ? flexItem.d0() : flexItem.K()) + bVar.f4215e;
                        bVar.j += flexItem.W();
                        bVar.f4220k += flexItem.w();
                        if (flexboxLayout.f(i20, i24)) {
                        }
                        int max22 = Math.max(i17, (!i19 ? e7.getMeasuredHeight() : e7.getMeasuredWidth()) + (!i19 ? flexItem.R() : flexItem.O()) + (!i19 ? flexItem.K() : flexItem.d0()));
                        bVar.f4217g = Math.max(bVar.f4217g, max22);
                        if (i19) {
                        }
                        if (i20 == i27 - 1) {
                        }
                        if (i25 <= Integer.MAX_VALUE) {
                        }
                    }
                    flexItem = flexItem3;
                    i21 = i12;
                    i16 = i13;
                    list2 = list;
                    bVar.f4218h += i16;
                    i24++;
                    i17 = i26;
                    bVar.f4225p = (bVar.f4225p ? 1 : 0) | (flexItem.W() == 0.0f ? i16 : 0);
                    boolean z7222 = bVar.q;
                    if (flexItem.w() == 0.0f) {
                    }
                    bVar.q = i16 | (z7222 ? 1 : 0);
                    bVar.f4215e = (!i19 ? e7.getMeasuredWidth() : e7.getMeasuredHeight()) + (!i19 ? flexItem.O() : flexItem.R()) + (!i19 ? flexItem.d0() : flexItem.K()) + bVar.f4215e;
                    bVar.j += flexItem.W();
                    bVar.f4220k += flexItem.w();
                    if (flexboxLayout.f(i20, i24)) {
                    }
                    int max222 = Math.max(i17, (!i19 ? e7.getMeasuredHeight() : e7.getMeasuredWidth()) + (!i19 ? flexItem.R() : flexItem.O()) + (!i19 ? flexItem.K() : flexItem.d0()));
                    bVar.f4217g = Math.max(bVar.f4217g, max222);
                    if (i19) {
                    }
                    if (i20 == i27 - 1) {
                    }
                    if (i25 <= Integer.MAX_VALUE) {
                    }
                }
            }
            list2 = list3;
            i21 = i12;
            i20++;
            list3 = list2;
            flexItemCount = i27;
            paddingBottom = i11;
            i18 = i5;
        }
        dVar.f4226a = i23;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(View view) {
        boolean z5;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        boolean z7 = true;
        if (measuredWidth < flexItem.z()) {
            measuredWidth = flexItem.z();
        } else {
            if (measuredWidth <= flexItem.q0()) {
                z5 = false;
                if (measuredHeight >= flexItem.f0()) {
                    measuredHeight = flexItem.f0();
                } else if (measuredHeight > flexItem.j0()) {
                    measuredHeight = flexItem.j0();
                } else {
                    z7 = z5;
                }
                if (z7) {
                    return;
                }
                view.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
                return;
            }
            measuredWidth = flexItem.q0();
        }
        z5 = true;
        if (measuredHeight >= flexItem.f0()) {
        }
        if (z7) {
        }
    }

    public final ArrayList e(int i5) {
        ArrayList arrayList = new ArrayList(i5);
        for (int i10 = 0; i10 < i5; i10++) {
            FlexItem flexItem = (FlexItem) this.f4230a.getChildAt(i10).getLayoutParams();
            e eVar = new e();
            eVar.f4229b = flexItem.getOrder();
            eVar.f4228a = i10;
            arrayList.add(eVar);
        }
        return arrayList;
    }

    public final void f(int i5, int i10, int i11) {
        int mode;
        int size;
        FlexboxLayout flexboxLayout = this.f4230a;
        int flexDirection = flexboxLayout.getFlexDirection();
        if (flexDirection == 0 || flexDirection == 1) {
            mode = View.MeasureSpec.getMode(i10);
            size = View.MeasureSpec.getSize(i10);
        } else {
            if (flexDirection != 2 && flexDirection != 3) {
                throw new IllegalArgumentException(c1.i(flexDirection, "Invalid flex direction: "));
            }
            mode = View.MeasureSpec.getMode(i5);
            size = View.MeasureSpec.getSize(i5);
        }
        List<b> flexLinesInternal = flexboxLayout.getFlexLinesInternal();
        if (mode == 1073741824) {
            int sumOfCrossSize = flexboxLayout.getSumOfCrossSize() + i11;
            int i12 = 0;
            if (flexLinesInternal.size() == 1) {
                ((b) flexLinesInternal.get(0)).f4217g = size - i11;
                return;
            }
            if (flexLinesInternal.size() >= 2) {
                int alignContent = flexboxLayout.getAlignContent();
                if (alignContent == 1) {
                    b bVar = new b();
                    bVar.f4217g = size - sumOfCrossSize;
                    flexLinesInternal.add(0, bVar);
                    return;
                }
                if (alignContent == 2) {
                    flexboxLayout.setFlexLines(d(flexLinesInternal, size, sumOfCrossSize));
                    return;
                }
                if (alignContent == 3) {
                    if (sumOfCrossSize >= size) {
                        return;
                    }
                    float size2 = (size - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                    ArrayList arrayList = new ArrayList();
                    int size3 = flexLinesInternal.size();
                    float f6 = 0.0f;
                    while (i12 < size3) {
                        arrayList.add((b) flexLinesInternal.get(i12));
                        if (i12 != flexLinesInternal.size() - 1) {
                            b bVar2 = new b();
                            if (i12 == flexLinesInternal.size() - 2) {
                                bVar2.f4217g = Math.round(f6 + size2);
                                f6 = 0.0f;
                            } else {
                                bVar2.f4217g = Math.round(size2);
                            }
                            int i13 = bVar2.f4217g;
                            float f10 = (size2 - i13) + f6;
                            if (f10 > 1.0f) {
                                bVar2.f4217g = i13 + 1;
                                f10 -= 1.0f;
                            } else if (f10 < -1.0f) {
                                bVar2.f4217g = i13 - 1;
                                f10 += 1.0f;
                            }
                            f6 = f10;
                            arrayList.add(bVar2);
                        }
                        i12++;
                    }
                    flexboxLayout.setFlexLines(arrayList);
                    return;
                }
                if (alignContent == 4) {
                    if (sumOfCrossSize >= size) {
                        flexboxLayout.setFlexLines(d(flexLinesInternal, size, sumOfCrossSize));
                        return;
                    }
                    int size4 = (size - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                    ArrayList arrayList2 = new ArrayList();
                    b bVar3 = new b();
                    bVar3.f4217g = size4;
                    for (b bVar4 : flexLinesInternal) {
                        arrayList2.add(bVar3);
                        arrayList2.add(bVar4);
                        arrayList2.add(bVar3);
                    }
                    flexboxLayout.setFlexLines(arrayList2);
                    return;
                }
                if (alignContent == 5 && sumOfCrossSize < size) {
                    float size5 = (size - sumOfCrossSize) / flexLinesInternal.size();
                    int size6 = flexLinesInternal.size();
                    float f11 = 0.0f;
                    while (i12 < size6) {
                        b bVar5 = (b) flexLinesInternal.get(i12);
                        float f12 = bVar5.f4217g + size5;
                        if (i12 == flexLinesInternal.size() - 1) {
                            f12 += f11;
                            f11 = 0.0f;
                        }
                        int round = Math.round(f12);
                        float f13 = (f12 - round) + f11;
                        if (f13 > 1.0f) {
                            round++;
                            f13 -= 1.0f;
                        } else if (f13 < -1.0f) {
                            round--;
                            f13 += 1.0f;
                        }
                        f11 = f13;
                        bVar5.f4217g = round;
                        i12++;
                    }
                }
            }
        }
    }

    public final void g(int i5, int i10) {
        int size;
        int paddingLeft;
        int paddingRight;
        int i11;
        int i12;
        FlexboxLayout flexboxLayout = this.f4230a;
        int flexItemCount = flexboxLayout.getFlexItemCount();
        boolean[] zArr = this.f4231b;
        int i13 = 0;
        if (zArr == null) {
            this.f4231b = new boolean[Math.max(flexItemCount, 10)];
        } else if (zArr.length < flexItemCount) {
            this.f4231b = new boolean[Math.max(zArr.length * 2, flexItemCount)];
        } else {
            Arrays.fill(zArr, false);
        }
        if (flexboxLayout.getFlexItemCount() <= 0) {
            return;
        }
        int flexDirection = flexboxLayout.getFlexDirection();
        int flexDirection2 = flexboxLayout.getFlexDirection();
        if (flexDirection2 == 0 || flexDirection2 == 1) {
            int mode = View.MeasureSpec.getMode(i5);
            size = View.MeasureSpec.getSize(i5);
            int largestMainSize = flexboxLayout.getLargestMainSize();
            if (mode != 1073741824) {
                size = Math.min(largestMainSize, size);
            }
            paddingLeft = flexboxLayout.getPaddingLeft();
            paddingRight = flexboxLayout.getPaddingRight();
        } else {
            if (flexDirection2 != 2 && flexDirection2 != 3) {
                throw new IllegalArgumentException(c1.i(flexDirection, "Invalid flex direction: "));
            }
            int mode2 = View.MeasureSpec.getMode(i10);
            size = View.MeasureSpec.getSize(i10);
            if (mode2 != 1073741824) {
                size = flexboxLayout.getLargestMainSize();
            }
            paddingLeft = flexboxLayout.getPaddingTop();
            paddingRight = flexboxLayout.getPaddingBottom();
        }
        int i14 = paddingRight + paddingLeft;
        int i15 = size;
        List flexLinesInternal = flexboxLayout.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        while (i13 < size2) {
            b bVar = (b) flexLinesInternal.get(i13);
            int i16 = bVar.f4215e;
            if (i16 >= i15 || !bVar.f4225p) {
                i11 = i5;
                i12 = i10;
                if (i16 > i15 && bVar.q) {
                    m(i11, i12, bVar, i15, i14, false);
                }
            } else {
                i11 = i5;
                i12 = i10;
                h(i11, i12, bVar, i15, i14, false);
            }
            i13++;
            i5 = i11;
            i10 = i12;
        }
    }

    public final void h(int i5, int i10, b bVar, int i11, int i12, boolean z5) {
        int i13;
        float f6;
        int i14;
        float f10 = bVar.j;
        float f11 = 0.0f;
        if (f10 <= 0.0f || i11 < (i13 = bVar.f4215e)) {
            return;
        }
        float f12 = (i11 - i13) / f10;
        bVar.f4215e = i12 + bVar.f4216f;
        if (!z5) {
            bVar.f4217g = Integer.MIN_VALUE;
        }
        int i15 = 0;
        boolean z7 = false;
        int i16 = 0;
        float f13 = 0.0f;
        while (i15 < bVar.f4218h) {
            int i17 = bVar.f4224o + i15;
            FlexboxLayout flexboxLayout = this.f4230a;
            View e7 = flexboxLayout.e(i17);
            if (e7 == null || e7.getVisibility() == 8) {
                f6 = f11;
            } else {
                FlexItem flexItem = (FlexItem) e7.getLayoutParams();
                int flexDirection = flexboxLayout.getFlexDirection();
                f6 = f11;
                if (flexDirection == 0 || flexDirection == 1) {
                    int measuredWidth = e7.getMeasuredWidth();
                    int measuredHeight = e7.getMeasuredHeight();
                    if (!this.f4231b[i17] && flexItem.W() > f6) {
                        float W = (flexItem.W() * f12) + measuredWidth;
                        if (i15 == bVar.f4218h - 1) {
                            W += f13;
                            f13 = f6;
                        }
                        int round = Math.round(W);
                        if (round > flexItem.q0()) {
                            round = flexItem.q0();
                            this.f4231b[i17] = true;
                            bVar.j -= flexItem.W();
                            z7 = true;
                        } else {
                            float f14 = (W - round) + f13;
                            double d10 = f14;
                            if (d10 > 1.0d) {
                                round++;
                                f14 -= 1.0f;
                            } else if (d10 < -1.0d) {
                                round--;
                                f14 += 1.0f;
                            }
                            f13 = f14;
                        }
                        e7.measure(View.MeasureSpec.makeMeasureSpec(round, 1073741824), i(i10, flexItem, bVar.f4222m));
                        measuredWidth = e7.getMeasuredWidth();
                        measuredHeight = e7.getMeasuredHeight();
                    }
                    int max = Math.max(i16, measuredHeight + flexItem.R() + flexItem.K());
                    bVar.f4215e = measuredWidth + flexItem.O() + flexItem.d0() + bVar.f4215e;
                    i14 = max;
                } else {
                    int measuredHeight2 = e7.getMeasuredHeight();
                    int measuredWidth2 = e7.getMeasuredWidth();
                    if (!this.f4231b[i17] && flexItem.W() > f6) {
                        float W2 = (flexItem.W() * f12) + measuredHeight2;
                        if (i15 == bVar.f4218h - 1) {
                            W2 += f13;
                            f13 = f6;
                        }
                        int round2 = Math.round(W2);
                        if (round2 > flexItem.j0()) {
                            round2 = flexItem.j0();
                            this.f4231b[i17] = true;
                            bVar.j -= flexItem.W();
                            z7 = true;
                        } else {
                            float f15 = (W2 - round2) + f13;
                            double d11 = f15;
                            if (d11 > 1.0d) {
                                round2++;
                                f15 -= 1.0f;
                            } else if (d11 < -1.0d) {
                                round2--;
                                f15 += 1.0f;
                            }
                            f13 = f15;
                        }
                        e7.measure(j(i5, flexItem, bVar.f4222m), View.MeasureSpec.makeMeasureSpec(round2, 1073741824));
                        measuredWidth2 = e7.getMeasuredWidth();
                        measuredHeight2 = e7.getMeasuredHeight();
                    }
                    i14 = Math.max(i16, measuredWidth2 + flexItem.O() + flexItem.d0());
                    bVar.f4215e = measuredHeight2 + flexItem.R() + flexItem.K() + bVar.f4215e;
                }
                bVar.f4217g = Math.max(bVar.f4217g, i14);
                i16 = i14;
            }
            i15++;
            f11 = f6;
        }
        if (!z7 || i13 == bVar.f4215e) {
            return;
        }
        h(i5, i10, bVar, i11, i12, true);
    }

    public final int i(int i5, FlexItem flexItem, int i10) {
        FlexboxLayout flexboxLayout = this.f4230a;
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i5, flexboxLayout.getPaddingBottom() + flexboxLayout.getPaddingTop() + flexItem.R() + flexItem.K() + i10, flexItem.getHeight());
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        return size > flexItem.j0() ? View.MeasureSpec.makeMeasureSpec(flexItem.j0(), View.MeasureSpec.getMode(childMeasureSpec)) : size < flexItem.f0() ? View.MeasureSpec.makeMeasureSpec(flexItem.f0(), View.MeasureSpec.getMode(childMeasureSpec)) : childMeasureSpec;
    }

    public final int j(int i5, FlexItem flexItem, int i10) {
        FlexboxLayout flexboxLayout = this.f4230a;
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i5, flexboxLayout.getPaddingRight() + flexboxLayout.getPaddingLeft() + flexItem.O() + flexItem.d0() + i10, flexItem.getWidth());
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        return size > flexItem.q0() ? View.MeasureSpec.makeMeasureSpec(flexItem.q0(), View.MeasureSpec.getMode(childMeasureSpec)) : size < flexItem.z() ? View.MeasureSpec.makeMeasureSpec(flexItem.z(), View.MeasureSpec.getMode(childMeasureSpec)) : childMeasureSpec;
    }

    public final void k(View view, b bVar, int i5, int i10, int i11, int i12) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        FlexboxLayout flexboxLayout = this.f4230a;
        int alignItems = flexboxLayout.getAlignItems();
        if (flexItem.t() != -1) {
            alignItems = flexItem.t();
        }
        int i13 = bVar.f4217g;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (flexboxLayout.getFlexWrap() != 2) {
                    int i14 = i10 + i13;
                    view.layout(i5, (i14 - view.getMeasuredHeight()) - flexItem.K(), i11, i14 - flexItem.K());
                    return;
                } else {
                    view.layout(i5, view.getMeasuredHeight() + (i10 - i13) + flexItem.R(), i11, view.getMeasuredHeight() + (i12 - i13) + flexItem.R());
                    return;
                }
            }
            if (alignItems == 2) {
                int measuredHeight = (((i13 - view.getMeasuredHeight()) + flexItem.R()) - flexItem.K()) / 2;
                if (flexboxLayout.getFlexWrap() != 2) {
                    int i15 = i10 + measuredHeight;
                    view.layout(i5, i15, i11, view.getMeasuredHeight() + i15);
                    return;
                } else {
                    int i16 = i10 - measuredHeight;
                    view.layout(i5, i16, i11, view.getMeasuredHeight() + i16);
                    return;
                }
            }
            if (alignItems == 3) {
                if (flexboxLayout.getFlexWrap() != 2) {
                    int max = Math.max(bVar.f4221l - view.getBaseline(), flexItem.R());
                    view.layout(i5, i10 + max, i11, i12 + max);
                    return;
                } else {
                    int max2 = Math.max(view.getBaseline() + (bVar.f4221l - view.getMeasuredHeight()), flexItem.K());
                    view.layout(i5, i10 - max2, i11, i12 - max2);
                    return;
                }
            }
            if (alignItems != 4) {
                return;
            }
        }
        if (flexboxLayout.getFlexWrap() != 2) {
            view.layout(i5, i10 + flexItem.R(), i11, i12 + flexItem.R());
        } else {
            view.layout(i5, i10 - flexItem.K(), i11, i12 - flexItem.K());
        }
    }

    public final void l(View view, b bVar, boolean z5, int i5, int i10, int i11, int i12) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int alignItems = this.f4230a.getAlignItems();
        if (flexItem.t() != -1) {
            alignItems = flexItem.t();
        }
        int i13 = bVar.f4217g;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (!z5) {
                    view.layout(((i5 + i13) - view.getMeasuredWidth()) - flexItem.d0(), i10, ((i11 + i13) - view.getMeasuredWidth()) - flexItem.d0(), i12);
                    return;
                }
                view.layout(view.getMeasuredWidth() + (i5 - i13) + flexItem.O(), i10, view.getMeasuredWidth() + (i11 - i13) + flexItem.O(), i12);
                return;
            }
            if (alignItems == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int marginStart = ((marginLayoutParams.getMarginStart() + (i13 - view.getMeasuredWidth())) - marginLayoutParams.getMarginEnd()) / 2;
                if (z5) {
                    view.layout(i5 - marginStart, i10, i11 - marginStart, i12);
                    return;
                } else {
                    view.layout(i5 + marginStart, i10, i11 + marginStart, i12);
                    return;
                }
            }
            if (alignItems != 3 && alignItems != 4) {
                return;
            }
        }
        if (z5) {
            view.layout(i5 - flexItem.d0(), i10, i11 - flexItem.d0(), i12);
        } else {
            view.layout(i5 + flexItem.O(), i10, i11 + flexItem.O(), i12);
        }
    }

    public final void m(int i5, int i10, b bVar, int i11, int i12, boolean z5) {
        float f6;
        int i13;
        int i14 = bVar.f4215e;
        float f10 = bVar.f4220k;
        float f11 = 0.0f;
        if (f10 <= 0.0f || i11 > i14) {
            return;
        }
        float f12 = (i14 - i11) / f10;
        bVar.f4215e = i12 + bVar.f4216f;
        if (!z5) {
            bVar.f4217g = Integer.MIN_VALUE;
        }
        int i15 = 0;
        boolean z7 = false;
        int i16 = 0;
        float f13 = 0.0f;
        while (i15 < bVar.f4218h) {
            int i17 = bVar.f4224o + i15;
            FlexboxLayout flexboxLayout = this.f4230a;
            View e7 = flexboxLayout.e(i17);
            if (e7 == null || e7.getVisibility() == 8) {
                f6 = f11;
            } else {
                FlexItem flexItem = (FlexItem) e7.getLayoutParams();
                int flexDirection = flexboxLayout.getFlexDirection();
                f6 = f11;
                if (flexDirection == 0 || flexDirection == 1) {
                    int measuredWidth = e7.getMeasuredWidth();
                    int measuredHeight = e7.getMeasuredHeight();
                    if (!this.f4231b[i17] && flexItem.w() > f6) {
                        float w10 = measuredWidth - (flexItem.w() * f12);
                        if (i15 == bVar.f4218h - 1) {
                            w10 += f13;
                            f13 = f6;
                        }
                        int round = Math.round(w10);
                        if (round < flexItem.z()) {
                            round = flexItem.z();
                            this.f4231b[i17] = true;
                            bVar.f4220k -= flexItem.w();
                            z7 = true;
                        } else {
                            float f14 = (w10 - round) + f13;
                            double d10 = f14;
                            if (d10 > 1.0d) {
                                round++;
                                f14 -= 1.0f;
                            } else if (d10 < -1.0d) {
                                round--;
                                f14 += 1.0f;
                            }
                            f13 = f14;
                        }
                        e7.measure(View.MeasureSpec.makeMeasureSpec(round, 1073741824), i(i10, flexItem, bVar.f4222m));
                        measuredWidth = e7.getMeasuredWidth();
                        measuredHeight = e7.getMeasuredHeight();
                    }
                    int max = Math.max(i16, measuredHeight + flexItem.R() + flexItem.K());
                    bVar.f4215e = measuredWidth + flexItem.O() + flexItem.d0() + bVar.f4215e;
                    i13 = max;
                } else {
                    int measuredHeight2 = e7.getMeasuredHeight();
                    int measuredWidth2 = e7.getMeasuredWidth();
                    if (!this.f4231b[i17] && flexItem.w() > f6) {
                        float w11 = measuredHeight2 - (flexItem.w() * f12);
                        if (i15 == bVar.f4218h - 1) {
                            w11 += f13;
                            f13 = f6;
                        }
                        int round2 = Math.round(w11);
                        if (round2 < flexItem.f0()) {
                            round2 = flexItem.f0();
                            this.f4231b[i17] = true;
                            bVar.f4220k -= flexItem.w();
                            z7 = true;
                        } else {
                            float f15 = (w11 - round2) + f13;
                            double d11 = f15;
                            if (d11 > 1.0d) {
                                round2++;
                                f15 -= 1.0f;
                            } else if (d11 < -1.0d) {
                                round2--;
                                f15 += 1.0f;
                            }
                            f13 = f15;
                        }
                        e7.measure(j(i5, flexItem, bVar.f4222m), View.MeasureSpec.makeMeasureSpec(round2, 1073741824));
                        measuredWidth2 = e7.getMeasuredWidth();
                        measuredHeight2 = e7.getMeasuredHeight();
                    }
                    i13 = Math.max(i16, measuredWidth2 + flexItem.O() + flexItem.d0());
                    bVar.f4215e = measuredHeight2 + flexItem.R() + flexItem.K() + bVar.f4215e;
                }
                bVar.f4217g = Math.max(bVar.f4217g, i13);
                i16 = i13;
            }
            i15++;
            f11 = f6;
        }
        if (!z7 || i14 == bVar.f4215e) {
            return;
        }
        m(i5, i10, bVar, i11, i12, true);
    }

    public final void o(int i5, View view) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int min = Math.min(Math.max((i5 - flexItem.O()) - flexItem.d0(), flexItem.z()), flexItem.q0());
        view.measure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 1073741824));
    }

    public final void p(int i5, View view) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        view.measure(View.MeasureSpec.makeMeasureSpec(view.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(Math.max((i5 - flexItem.R()) - flexItem.K(), flexItem.f0()), flexItem.j0()), 1073741824));
    }

    public final void q() {
        View e7;
        FlexboxLayout flexboxLayout = this.f4230a;
        if (flexboxLayout.getFlexItemCount() <= 0) {
            return;
        }
        int flexDirection = flexboxLayout.getFlexDirection();
        if (flexboxLayout.getAlignItems() != 4) {
            for (b bVar : flexboxLayout.getFlexLinesInternal()) {
                Iterator it = bVar.f4223n.iterator();
                while (it.hasNext()) {
                    View e9 = flexboxLayout.e(((Integer) it.next()).intValue());
                    if (flexDirection == 0 || flexDirection == 1) {
                        p(bVar.f4217g, e9);
                    } else {
                        if (flexDirection != 2 && flexDirection != 3) {
                            throw new IllegalArgumentException(c1.i(flexDirection, "Invalid flex direction: "));
                        }
                        o(bVar.f4217g, e9);
                    }
                }
            }
            return;
        }
        List flexLinesInternal = flexboxLayout.getFlexLinesInternal();
        int size = flexLinesInternal.size();
        for (int i5 = 0; i5 < size; i5++) {
            b bVar2 = (b) flexLinesInternal.get(i5);
            int i10 = bVar2.f4218h;
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = bVar2.f4224o + i11;
                if (i11 < flexboxLayout.getFlexItemCount() && (e7 = flexboxLayout.e(i12)) != null && e7.getVisibility() != 8) {
                    FlexItem flexItem = (FlexItem) e7.getLayoutParams();
                    if (flexItem.t() == -1 || flexItem.t() == 4) {
                        if (flexDirection == 0 || flexDirection == 1) {
                            p(bVar2.f4217g, e7);
                        } else {
                            if (flexDirection != 2 && flexDirection != 3) {
                                throw new IllegalArgumentException(c1.i(flexDirection, "Invalid flex direction: "));
                            }
                            o(bVar2.f4217g, e7);
                        }
                    }
                }
            }
        }
    }
}
