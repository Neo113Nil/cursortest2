package com.bytedance.adsdk.ugeno.vj;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a70;
import defpackage.mz1;
import defpackage.wv8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
class oo {
    static final /* synthetic */ boolean gm = true;
    private final com.bytedance.adsdk.ugeno.vj.pcc oo;
    int[] pcc;
    long[] sf;
    private boolean[] vj;
    private long[] wh;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class pcc {
        List<gm> pcc;
        int sf;

        public void pcc() {
            this.pcc = null;
            this.sf = 0;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class sf implements Comparable<sf> {
        int pcc;
        int sf;

        private sf() {
        }

        @Override // java.lang.Comparable
        /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
        public int compareTo(sf sfVar) {
            int i = this.sf;
            int i2 = sfVar.sf;
            return i != i2 ? i - i2 : this.pcc - sfVar.pcc;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Order{order=");
            sb.append(this.sf);
            sb.append(", index=");
            return wv8.j(sb, this.pcc, '}');
        }
    }

    public oo(com.bytedance.adsdk.ugeno.vj.pcc pccVar) {
        this.oo = pccVar;
    }

    private void gm(int i) {
        boolean[] zArr = this.vj;
        if (zArr == null) {
            this.vj = new boolean[Math.max(i, 10)];
        } else if (zArr.length < i) {
            this.vj = new boolean[Math.max(zArr.length * 2, i)];
        } else {
            Arrays.fill(zArr, false);
        }
    }

    private int oo(boolean z) {
        com.bytedance.adsdk.ugeno.vj.pcc pccVar = this.oo;
        return z ? pccVar.getPaddingBottom() : pccVar.getPaddingEnd();
    }

    private void sf(int i, int i2, gm gmVar, int i3, int i4, boolean z) {
        float f;
        float f2;
        int i5;
        int i6;
        int i7 = gmVar.vj;
        float f3 = gmVar.vh;
        float f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (f3 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || i3 > i7) {
            return;
        }
        float f5 = (i7 - i3) / f3;
        gmVar.vj = i4 + gmVar.wh;
        if (!z) {
            gmVar.qf = Integer.MIN_VALUE;
        }
        int i8 = 0;
        boolean z2 = false;
        int i9 = 0;
        float f6 = 0.0f;
        while (i8 < gmVar.kj) {
            int i10 = gmVar.jr + i8;
            View sf2 = this.oo.sf(i10);
            if (sf2 == null || sf2.getVisibility() == 8) {
                f = f4;
                f2 = f5;
            } else {
                com.bytedance.adsdk.ugeno.vj.sf sfVar = (com.bytedance.adsdk.ugeno.vj.sf) sf2.getLayoutParams();
                int flexDirection = this.oo.getFlexDirection();
                f = f4;
                if (flexDirection == 0 || flexDirection == 1) {
                    int measuredWidth = sf2.getMeasuredWidth();
                    long[] jArr = this.wh;
                    if (jArr != null) {
                        measuredWidth = pcc(jArr[i10]);
                    }
                    int measuredHeight = sf2.getMeasuredHeight();
                    long[] jArr2 = this.wh;
                    f2 = f5;
                    if (jArr2 != null) {
                        measuredHeight = sf(jArr2[i10]);
                    }
                    if (!this.vj[i10] && sfVar.vj() > f) {
                        float vj = measuredWidth - (sfVar.vj() * f2);
                        if (i8 == gmVar.kj - 1) {
                            vj += f6;
                            f6 = f;
                        }
                        int round = Math.round(vj);
                        if (round < sfVar.qf()) {
                            i6 = sfVar.qf();
                            this.vj[i10] = true;
                            gmVar.vh -= sfVar.vj();
                            z2 = true;
                        } else {
                            float f7 = (vj - round) + f6;
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
                        int sf3 = sf(i2, sfVar, gmVar.hc);
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
                        sf2.measure(makeMeasureSpec, sf3);
                        int measuredWidth2 = sf2.getMeasuredWidth();
                        int measuredHeight2 = sf2.getMeasuredHeight();
                        pcc(i10, makeMeasureSpec, sf3, sf2);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int max = Math.max(i9, sfVar.dax() + sfVar.gbb() + measuredHeight + this.oo.pcc(sf2));
                    gmVar.vj = sfVar.jr() + sfVar.hc() + measuredWidth + gmVar.vj;
                    i5 = max;
                } else {
                    int measuredHeight3 = sf2.getMeasuredHeight();
                    long[] jArr3 = this.wh;
                    if (jArr3 != null) {
                        measuredHeight3 = sf(jArr3[i10]);
                    }
                    int measuredWidth3 = sf2.getMeasuredWidth();
                    long[] jArr4 = this.wh;
                    if (jArr4 != null) {
                        measuredWidth3 = pcc(jArr4[i10]);
                    }
                    if (!this.vj[i10] && sfVar.vj() > f) {
                        float vj2 = measuredHeight3 - (sfVar.vj() * f5);
                        if (i8 == gmVar.kj - 1) {
                            vj2 += f6;
                            f6 = f;
                        }
                        int round2 = Math.round(vj2);
                        if (round2 < sfVar.kj()) {
                            round2 = sfVar.kj();
                            this.vj[i10] = true;
                            gmVar.vh -= sfVar.vj();
                            z2 = true;
                        } else {
                            float f8 = (vj2 - round2) + f6;
                            double d2 = f8;
                            if (d2 > 1.0d) {
                                round2++;
                                f8 -= 1.0f;
                            } else if (d2 < -1.0d) {
                                round2--;
                                f8 += 1.0f;
                            }
                            f6 = f8;
                        }
                        int pcc2 = pcc(i, sfVar, gmVar.hc);
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                        sf2.measure(pcc2, makeMeasureSpec2);
                        int measuredWidth4 = sf2.getMeasuredWidth();
                        int measuredHeight4 = sf2.getMeasuredHeight();
                        pcc(i10, pcc2, makeMeasureSpec2, sf2);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    i5 = Math.max(i9, sfVar.jr() + sfVar.hc() + measuredWidth3 + this.oo.pcc(sf2));
                    gmVar.vj = sfVar.dax() + sfVar.gbb() + measuredHeight3 + gmVar.vj;
                    f2 = f5;
                }
                gmVar.qf = Math.max(gmVar.qf, i5);
                i9 = i5;
            }
            i8++;
            f5 = f2;
            f4 = f;
        }
        if (!z2 || i7 == gmVar.vj) {
            return;
        }
        sf(i, i2, gmVar, i3, i4, true);
    }

    private int vj(com.bytedance.adsdk.ugeno.vj.sf sfVar, boolean z) {
        return z ? sfVar.gbb() : sfVar.hc();
    }

    private int wh(com.bytedance.adsdk.ugeno.vj.sf sfVar, boolean z) {
        return z ? sfVar.dax() : sfVar.jr();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void pcc(pcc pccVar, int i, int i2, int i3, int i4, int i5, List<gm> list) {
        int i6;
        pcc pccVar2;
        boolean z;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        gm gmVar;
        int i16;
        int i17;
        boolean z2;
        int i18;
        int i19;
        int i20 = i;
        boolean pcc2 = this.oo.pcc();
        int mode = View.MeasureSpec.getMode(i20);
        int size = View.MeasureSpec.getSize(i20);
        List<gm> arrayList = list == null ? new ArrayList() : list;
        pccVar.pcc = arrayList;
        boolean z3 = i5 == -1;
        int pcc3 = pcc(pcc2);
        int sf2 = sf(pcc2);
        int gm2 = gm(pcc2);
        int oo = oo(pcc2);
        gm gmVar2 = new gm();
        int i21 = i4;
        gmVar2.jr = i21;
        int i22 = pcc3 + sf2;
        gmVar2.vj = i22;
        int flexItemCount = this.oo.getFlexItemCount();
        boolean z4 = z3;
        gm gmVar3 = gmVar2;
        int i23 = Integer.MIN_VALUE;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        while (true) {
            if (i21 >= flexItemCount) {
                i6 = i25;
                pccVar2 = pccVar;
                break;
            }
            View sf3 = this.oo.sf(i21);
            if (sf3 != null) {
                z = true;
                i7 = i22;
                if (sf3.getVisibility() != 8) {
                    if (sf3 instanceof CompoundButton) {
                        pcc((CompoundButton) sf3);
                    }
                    com.bytedance.adsdk.ugeno.vj.sf sfVar = (com.bytedance.adsdk.ugeno.vj.sf) sf3.getLayoutParams();
                    int i27 = flexItemCount;
                    if (sfVar.wh() == 4) {
                        gmVar3.gbb.add(Integer.valueOf(i21));
                    }
                    int pcc4 = pcc(sfVar, pcc2);
                    if (sfVar.tmg() != -1.0f && mode == 1073741824) {
                        pcc4 = Math.round(sfVar.tmg() * size);
                    }
                    com.bytedance.adsdk.ugeno.vj.pcc pccVar3 = this.oo;
                    if (pcc2) {
                        i9 = mode;
                        i12 = pccVar3.pcc(i20, i7 + gm(sfVar, true) + oo(sfVar, true), pcc4);
                        i8 = size;
                        i10 = i24;
                        int sf4 = this.oo.sf(i2, gm2 + oo + vj(sfVar, true) + wh(sfVar, true) + i24, sf(sfVar, true));
                        sf3.measure(i12, sf4);
                        pcc(i21, i12, sf4, sf3);
                        i11 = 0;
                    } else {
                        i8 = size;
                        i9 = mode;
                        i10 = i24;
                        i11 = 0;
                        int pcc5 = pccVar3.pcc(i2, gm2 + oo + vj(sfVar, false) + wh(sfVar, false) + i10, sf(sfVar, false));
                        int sf5 = this.oo.sf(i20, i7 + gm(sfVar, false) + oo(sfVar, false), pcc4);
                        sf3.measure(pcc5, sf5);
                        pcc(i21, pcc5, sf5, sf3);
                        i12 = sf5;
                    }
                    pcc(sf3, i21);
                    i25 = View.combineMeasuredStates(i25, sf3.getMeasuredState());
                    int i28 = i11;
                    i13 = i21;
                    int i29 = i12;
                    gm gmVar4 = gmVar3;
                    int i30 = i26;
                    i14 = i7;
                    i15 = i10;
                    boolean z5 = pcc2;
                    size = i8;
                    if (pcc(sf3, i9, size, gmVar3.vj, pcc(sf3, pcc2) + gm(sfVar, pcc2) + oo(sfVar, pcc2), sfVar, i13, i30, arrayList.size())) {
                        if (gmVar4.sf() > 0) {
                            pcc(arrayList, gmVar4, i13 > 0 ? i13 - 1 : i28, i15);
                            i19 = i15 + gmVar4.qf;
                        } else {
                            i19 = i15;
                        }
                        if (z5) {
                            if (sfVar.sf() == -1) {
                                com.bytedance.adsdk.ugeno.vj.pcc pccVar4 = this.oo;
                                sf3.measure(i29, pccVar4.sf(i2, sfVar.dax() + sfVar.gbb() + pccVar4.getPaddingTop() + this.oo.getPaddingBottom() + i19, sfVar.sf()));
                                pcc(sf3, i13);
                            }
                        } else if (sfVar.pcc() == -1) {
                            com.bytedance.adsdk.ugeno.vj.pcc pccVar5 = this.oo;
                            sf3.measure(pccVar5.pcc(i2, sfVar.jr() + sfVar.hc() + pccVar5.getPaddingLeft() + this.oo.getPaddingRight() + i19, sfVar.pcc()), i29);
                            pcc(sf3, i13);
                        }
                        gm gmVar5 = new gm();
                        gmVar5.kj = 1;
                        gmVar5.vj = i14;
                        gmVar5.jr = i13;
                        i15 = i19;
                        i16 = i28;
                        gmVar = gmVar5;
                        i17 = Integer.MIN_VALUE;
                    } else {
                        gmVar = gmVar4;
                        gmVar.kj++;
                        i16 = i30 + 1;
                        i17 = i23;
                    }
                    gmVar.nac = (gmVar.nac ? 1 : 0) | (sfVar.oo() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : i28);
                    gmVar.lu = (gmVar.lu ? 1 : 0) | (sfVar.vj() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : i28);
                    int[] iArr = this.pcc;
                    if (iArr != null) {
                        iArr[i13] = arrayList.size();
                    }
                    z2 = z5;
                    gmVar.vj = pcc(sf3, z2) + gm(sfVar, z2) + oo(sfVar, z2) + gmVar.vj;
                    gmVar.ork = sfVar.oo() + gmVar.ork;
                    gmVar.vh = sfVar.vj() + gmVar.vh;
                    this.oo.pcc(sf3, i13, i16, gmVar);
                    int max = Math.max(i17, sf(sf3, z2) + vj(sfVar, z2) + wh(sfVar, z2) + this.oo.pcc(sf3));
                    gmVar.qf = Math.max(gmVar.qf, max);
                    if (z2) {
                        int flexWrap = this.oo.getFlexWrap();
                        int i31 = gmVar.tmg;
                        if (flexWrap != 2) {
                            gmVar.tmg = Math.max(i31, sfVar.gbb() + sf3.getBaseline());
                        } else {
                            gmVar.tmg = Math.max(i31, sfVar.dax() + (sf3.getMeasuredHeight() - sf3.getBaseline()));
                        }
                    }
                    i18 = i27;
                    if (pcc(i13, i18, gmVar)) {
                        pcc(arrayList, gmVar, i13, i15);
                        i15 += gmVar.qf;
                    }
                    if (i5 != -1 && arrayList.size() > 0) {
                        if (((gm) mz1.g(1, arrayList)).dax >= i5 && i13 >= i5 && !z4) {
                            i15 = -gmVar.pcc();
                            z4 = true;
                        }
                    }
                    if (i15 > i3 && z4) {
                        pccVar2 = pccVar;
                        i6 = i25;
                        break;
                    }
                    i23 = max;
                    i26 = i16;
                    int i32 = i13 + 1;
                    pcc2 = z2;
                    gmVar3 = gmVar;
                    i22 = i14;
                    i24 = i15;
                    i20 = i;
                    flexItemCount = i18;
                    i21 = i32;
                    mode = i9;
                } else {
                    gmVar3.vy++;
                    gmVar3.kj++;
                    if (pcc(i21, flexItemCount, gmVar3)) {
                        pcc(arrayList, gmVar3, i21, i24);
                    }
                }
            } else {
                if (pcc(i21, flexItemCount, gmVar3)) {
                    pcc(arrayList, gmVar3, i21, i24);
                }
                i7 = i22;
                z = true;
            }
            i13 = i21;
            i9 = mode;
            i18 = flexItemCount;
            i15 = i24;
            z2 = pcc2;
            i14 = i7;
            gmVar = gmVar3;
            int i322 = i13 + 1;
            pcc2 = z2;
            gmVar3 = gmVar;
            i22 = i14;
            i24 = i15;
            i20 = i;
            flexItemCount = i18;
            i21 = i322;
            mode = i9;
        }
        pccVar2.sf = i6;
    }

    private int oo(com.bytedance.adsdk.ugeno.vj.sf sfVar, boolean z) {
        if (z) {
            return sfVar.jr();
        }
        return sfVar.dax();
    }

    private int gm(com.bytedance.adsdk.ugeno.vj.sf sfVar, boolean z) {
        if (z) {
            return sfVar.hc();
        }
        return sfVar.gbb();
    }

    private int gm(boolean z) {
        com.bytedance.adsdk.ugeno.vj.pcc pccVar = this.oo;
        if (z) {
            return pccVar.getPaddingTop();
        }
        return pccVar.getPaddingStart();
    }

    public long sf(int i, int i2) {
        return (i & 4294967295L) | (i2 << 32);
    }

    private List<sf> sf(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            com.bytedance.adsdk.ugeno.vj.sf sfVar = (com.bytedance.adsdk.ugeno.vj.sf) this.oo.pcc(i2).getLayoutParams();
            sf sfVar2 = new sf();
            sfVar2.sf = sfVar.gm();
            sfVar2.pcc = i2;
            arrayList.add(sfVar2);
        }
        return arrayList;
    }

    public boolean sf(SparseIntArray sparseIntArray) {
        int flexItemCount = this.oo.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            return true;
        }
        for (int i = 0; i < flexItemCount; i++) {
            View pcc2 = this.oo.pcc(i);
            if (pcc2 != null && ((com.bytedance.adsdk.ugeno.vj.sf) pcc2.getLayoutParams()).gm() != sparseIntArray.get(i)) {
                return true;
            }
        }
        return false;
    }

    public void sf(pcc pccVar, int i, int i2) {
        pcc(pccVar, i2, i, Integer.MAX_VALUE, 0, -1, (List<gm>) null);
    }

    private int sf(boolean z) {
        com.bytedance.adsdk.ugeno.vj.pcc pccVar = this.oo;
        if (z) {
            return pccVar.getPaddingEnd();
        }
        return pccVar.getPaddingBottom();
    }

    private int sf(View view, boolean z) {
        if (z) {
            return view.getMeasuredHeight();
        }
        return view.getMeasuredWidth();
    }

    private int sf(com.bytedance.adsdk.ugeno.vj.sf sfVar, boolean z) {
        if (z) {
            return sfVar.sf();
        }
        return sfVar.pcc();
    }

    public int sf(long j) {
        return (int) (j >> 32);
    }

    private int sf(int i, com.bytedance.adsdk.ugeno.vj.sf sfVar, int i2) {
        com.bytedance.adsdk.ugeno.vj.pcc pccVar = this.oo;
        int sf2 = pccVar.sf(i, sfVar.dax() + sfVar.gbb() + pccVar.getPaddingTop() + this.oo.getPaddingBottom() + i2, sfVar.sf());
        int size = View.MeasureSpec.getSize(sf2);
        if (size > sfVar.ork()) {
            return View.MeasureSpec.makeMeasureSpec(sfVar.ork(), View.MeasureSpec.getMode(sf2));
        }
        return size < sfVar.kj() ? View.MeasureSpec.makeMeasureSpec(sfVar.kj(), View.MeasureSpec.getMode(sf2)) : sf2;
    }

    public void sf(int i, int i2, int i3) {
        int i4;
        int i5;
        int round;
        int flexDirection = this.oo.getFlexDirection();
        if (flexDirection == 0 || flexDirection == 1) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            i4 = mode;
            i5 = size;
        } else if (flexDirection != 2 && flexDirection != 3) {
            a70.p("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
            return;
        } else {
            i4 = View.MeasureSpec.getMode(i);
            i5 = View.MeasureSpec.getSize(i);
        }
        List<gm> flexLinesInternal = this.oo.getFlexLinesInternal();
        if (i4 == 1073741824) {
            int sumOfCrossSize = this.oo.getSumOfCrossSize() + i3;
            int i6 = 0;
            if (flexLinesInternal.size() == 1) {
                flexLinesInternal.get(0).qf = i5 - i3;
                return;
            }
            if (flexLinesInternal.size() >= 2) {
                int alignContent = this.oo.getAlignContent();
                if (alignContent == 1) {
                    gm gmVar = new gm();
                    gmVar.qf = i5 - sumOfCrossSize;
                    flexLinesInternal.add(0, gmVar);
                    return;
                }
                if (alignContent == 2) {
                    this.oo.setFlexLines(pcc(flexLinesInternal, i5, sumOfCrossSize));
                    return;
                }
                if (alignContent == 3) {
                    if (sumOfCrossSize < i5) {
                        float size2 = (i5 - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                        ArrayList arrayList = new ArrayList();
                        int size3 = flexLinesInternal.size();
                        float f = 0.0f;
                        while (i6 < size3) {
                            arrayList.add(flexLinesInternal.get(i6));
                            if (i6 != flexLinesInternal.size() - 1) {
                                gm gmVar2 = new gm();
                                if (i6 == flexLinesInternal.size() - 2) {
                                    int round2 = Math.round(f + size2);
                                    gmVar2.qf = round2;
                                    round = round2;
                                    f = 0.0f;
                                } else {
                                    round = Math.round(size2);
                                    gmVar2.qf = round;
                                }
                                float f2 = (size2 - round) + f;
                                if (f2 > 1.0f) {
                                    gmVar2.qf = round + 1;
                                    f2 -= 1.0f;
                                } else if (f2 < -1.0f) {
                                    gmVar2.qf = round - 1;
                                    f2 += 1.0f;
                                }
                                f = f2;
                                arrayList.add(gmVar2);
                            }
                            i6++;
                        }
                        this.oo.setFlexLines(arrayList);
                        return;
                    }
                    return;
                }
                if (alignContent == 4) {
                    if (sumOfCrossSize >= i5) {
                        this.oo.setFlexLines(pcc(flexLinesInternal, i5, sumOfCrossSize));
                        return;
                    }
                    int size4 = (i5 - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                    ArrayList arrayList2 = new ArrayList();
                    gm gmVar3 = new gm();
                    gmVar3.qf = size4;
                    for (gm gmVar4 : flexLinesInternal) {
                        arrayList2.add(gmVar3);
                        arrayList2.add(gmVar4);
                        arrayList2.add(gmVar3);
                    }
                    this.oo.setFlexLines(arrayList2);
                    return;
                }
                if (alignContent == 5 && sumOfCrossSize < i5) {
                    float size5 = (i5 - sumOfCrossSize) / flexLinesInternal.size();
                    int size6 = flexLinesInternal.size();
                    float f3 = 0.0f;
                    while (i6 < size6) {
                        gm gmVar5 = flexLinesInternal.get(i6);
                        float f4 = gmVar5.qf + size5;
                        if (i6 == flexLinesInternal.size() - 1) {
                            f4 += f3;
                            f3 = 0.0f;
                        }
                        int round3 = Math.round(f4);
                        float f5 = (f4 - round3) + f3;
                        if (f5 > 1.0f) {
                            round3++;
                            f5 -= 1.0f;
                        } else if (f5 < -1.0f) {
                            round3--;
                            f5 += 1.0f;
                        }
                        f3 = f5;
                        gmVar5.qf = round3;
                        i6++;
                    }
                }
            }
        }
    }

    private void sf(View view, int i, int i2) {
        int measuredHeight;
        com.bytedance.adsdk.ugeno.vj.sf sfVar = (com.bytedance.adsdk.ugeno.vj.sf) view.getLayoutParams();
        int min = Math.min(Math.max(((i - sfVar.hc()) - sfVar.jr()) - this.oo.pcc(view), sfVar.qf()), sfVar.vy());
        long[] jArr = this.wh;
        if (jArr != null) {
            measuredHeight = sf(jArr[i2]);
        } else {
            measuredHeight = view.getMeasuredHeight();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec2, makeMeasureSpec);
        pcc(i2, makeMeasureSpec2, makeMeasureSpec, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int[] pcc(View view, int i, ViewGroup.LayoutParams layoutParams, SparseIntArray sparseIntArray) {
        int flexItemCount = this.oo.getFlexItemCount();
        List<sf> sf2 = sf(flexItemCount);
        sf sfVar = new sf();
        if (view != null && (layoutParams instanceof com.bytedance.adsdk.ugeno.vj.sf)) {
            sfVar.sf = ((com.bytedance.adsdk.ugeno.vj.sf) layoutParams).gm();
        } else {
            sfVar.sf = 1;
        }
        if (i != -1 && i != flexItemCount) {
            if (i < this.oo.getFlexItemCount()) {
                sfVar.pcc = i;
                while (i < flexItemCount) {
                    sf2.get(i).pcc++;
                    i++;
                }
            } else {
                sfVar.pcc = flexItemCount;
            }
        } else {
            sfVar.pcc = flexItemCount;
        }
        sf2.add(sfVar);
        return pcc(flexItemCount + 1, sf2, sparseIntArray);
    }

    public int[] pcc(SparseIntArray sparseIntArray) {
        int flexItemCount = this.oo.getFlexItemCount();
        return pcc(flexItemCount, sf(flexItemCount), sparseIntArray);
    }

    private int[] pcc(int i, List<sf> list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i];
        int i2 = 0;
        for (sf sfVar : list) {
            int i3 = sfVar.pcc;
            iArr[i2] = i3;
            sparseIntArray.append(i3, sfVar.sf);
            i2++;
        }
        return iArr;
    }

    public void pcc(pcc pccVar, int i, int i2) {
        pcc(pccVar, i, i2, Integer.MAX_VALUE, 0, -1, (List<gm>) null);
    }

    public int pcc(long j) {
        return (int) j;
    }

    private void pcc(CompoundButton compoundButton) {
        com.bytedance.adsdk.ugeno.vj.sf sfVar = (com.bytedance.adsdk.ugeno.vj.sf) compoundButton.getLayoutParams();
        int qf = sfVar.qf();
        int kj = sfVar.kj();
        Drawable pcc2 = com.bytedance.adsdk.ugeno.qf.vj.pcc(compoundButton);
        int minimumWidth = pcc2 == null ? 0 : pcc2.getMinimumWidth();
        int minimumHeight = pcc2 != null ? pcc2.getMinimumHeight() : 0;
        if (qf == -1) {
            qf = minimumWidth;
        }
        sfVar.pcc(qf);
        if (kj == -1) {
            kj = minimumHeight;
        }
        sfVar.sf(kj);
    }

    private int pcc(boolean z) {
        com.bytedance.adsdk.ugeno.vj.pcc pccVar = this.oo;
        if (z) {
            return pccVar.getPaddingStart();
        }
        return pccVar.getPaddingTop();
    }

    private int pcc(View view, boolean z) {
        if (z) {
            return view.getMeasuredWidth();
        }
        return view.getMeasuredHeight();
    }

    private int pcc(com.bytedance.adsdk.ugeno.vj.sf sfVar, boolean z) {
        if (z) {
            return sfVar.pcc();
        }
        return sfVar.sf();
    }

    private boolean pcc(View view, int i, int i2, int i3, int i4, com.bytedance.adsdk.ugeno.vj.sf sfVar, int i5, int i6, int i7) {
        if (this.oo.getFlexWrap() == 0) {
            return false;
        }
        if (sfVar.vh()) {
            return true;
        }
        if (i == 0) {
            return false;
        }
        int maxLine = this.oo.getMaxLine();
        if (maxLine != -1 && maxLine <= i7 + 1) {
            return false;
        }
        int pcc2 = this.oo.pcc(view, i5, i6);
        if (pcc2 > 0) {
            i4 += pcc2;
        }
        return i2 < i3 + i4;
    }

    private boolean pcc(int i, int i2, gm gmVar) {
        return i == i2 - 1 && gmVar.sf() != 0;
    }

    private void pcc(List<gm> list, gm gmVar, int i, int i2) {
        gmVar.hc = i2;
        this.oo.pcc(gmVar);
        gmVar.dax = i;
        list.add(gmVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void pcc(View view, int i) {
        boolean z;
        com.bytedance.adsdk.ugeno.vj.sf sfVar = (com.bytedance.adsdk.ugeno.vj.sf) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        boolean z2 = true;
        if (measuredWidth < sfVar.qf()) {
            measuredWidth = sfVar.qf();
        } else if (measuredWidth > sfVar.vy()) {
            measuredWidth = sfVar.vy();
        } else {
            z = false;
            if (measuredHeight >= sfVar.kj()) {
                measuredHeight = sfVar.kj();
            } else if (measuredHeight > sfVar.ork()) {
                measuredHeight = sfVar.ork();
            } else {
                z2 = z;
            }
            if (z2) {
                return;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            pcc(i, makeMeasureSpec, makeMeasureSpec2, view);
            return;
        }
        z = true;
        if (measuredHeight >= sfVar.kj()) {
        }
        if (z2) {
        }
    }

    public void pcc(int i, int i2) {
        pcc(i, i2, 0);
    }

    public void pcc(int i, int i2, int i3) {
        int size;
        int paddingLeft;
        int paddingRight;
        int i4;
        int i5;
        oo ooVar;
        gm(this.oo.getFlexItemCount());
        if (i3 >= this.oo.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.oo.getFlexDirection();
        int flexDirection2 = this.oo.getFlexDirection();
        if (flexDirection2 == 0 || flexDirection2 == 1) {
            int mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
            int largestMainSize = this.oo.getLargestMainSize();
            if (mode != 1073741824) {
                size = Math.min(largestMainSize, size);
            }
            paddingLeft = this.oo.getPaddingLeft();
            paddingRight = this.oo.getPaddingRight();
        } else {
            if (flexDirection2 != 2 && flexDirection2 != 3) {
                a70.p("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
                return;
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            size = View.MeasureSpec.getSize(i2);
            if (mode2 != 1073741824) {
                size = this.oo.getLargestMainSize();
            }
            paddingLeft = this.oo.getPaddingTop();
            paddingRight = this.oo.getPaddingBottom();
        }
        int i6 = paddingLeft + paddingRight;
        int i7 = size;
        int[] iArr = this.pcc;
        int i8 = iArr != null ? iArr[i3] : 0;
        List<gm> flexLinesInternal = this.oo.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        while (i8 < size2) {
            gm gmVar = flexLinesInternal.get(i8);
            int i9 = gmVar.vj;
            if (i9 < i7 && gmVar.nac) {
                ooVar = this;
                i4 = i;
                i5 = i2;
                ooVar.pcc(i4, i5, gmVar, i7, i6, false);
            } else {
                i4 = i;
                i5 = i2;
                if (i9 <= i7 || !gmVar.lu) {
                    ooVar = this;
                } else {
                    ooVar = this;
                    ooVar.sf(i4, i5, gmVar, i7, i6, false);
                }
            }
            i8++;
            this = ooVar;
            i = i4;
            i2 = i5;
        }
    }

    private void pcc(int i, int i2, gm gmVar, int i3, int i4, boolean z) {
        int i5;
        float f;
        float f2;
        int i6;
        double d;
        double d2;
        float f3 = gmVar.ork;
        float f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (f3 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || i3 < (i5 = gmVar.vj)) {
            return;
        }
        float f5 = (i3 - i5) / f3;
        gmVar.vj = i4 + gmVar.wh;
        if (!z) {
            gmVar.qf = Integer.MIN_VALUE;
        }
        int i7 = 0;
        boolean z2 = false;
        int i8 = 0;
        float f6 = 0.0f;
        while (i7 < gmVar.kj) {
            int i9 = gmVar.jr + i7;
            View sf2 = this.oo.sf(i9);
            if (sf2 == null || sf2.getVisibility() == 8) {
                f = f4;
                f2 = f5;
                z2 = z2;
            } else {
                com.bytedance.adsdk.ugeno.vj.sf sfVar = (com.bytedance.adsdk.ugeno.vj.sf) sf2.getLayoutParams();
                int flexDirection = this.oo.getFlexDirection();
                f = f4;
                if (flexDirection != 0 && flexDirection != 1) {
                    int measuredHeight = sf2.getMeasuredHeight();
                    long[] jArr = this.wh;
                    if (jArr != null) {
                        measuredHeight = sf(jArr[i9]);
                    }
                    int measuredWidth = sf2.getMeasuredWidth();
                    long[] jArr2 = this.wh;
                    f2 = f5;
                    boolean z3 = z2;
                    if (jArr2 != null) {
                        measuredWidth = pcc(jArr2[i9]);
                    }
                    if (this.vj[i9] || sfVar.oo() <= f) {
                        z2 = z3;
                    } else {
                        float oo = (sfVar.oo() * f2) + measuredHeight;
                        if (i7 == gmVar.kj - 1) {
                            oo += f6;
                            f6 = f;
                        }
                        int round = Math.round(oo);
                        if (round > sfVar.ork()) {
                            round = sfVar.ork();
                            this.vj[i9] = true;
                            gmVar.ork -= sfVar.oo();
                            z2 = true;
                        } else {
                            float f7 = (oo - round) + f6;
                            double d3 = f7;
                            if (d3 > 1.0d) {
                                round++;
                                d2 = d3 - 1.0d;
                            } else {
                                if (d3 < -1.0d) {
                                    round--;
                                    d2 = d3 + 1.0d;
                                }
                                f6 = f7;
                                z2 = z3;
                            }
                            f7 = (float) d2;
                            f6 = f7;
                            z2 = z3;
                        }
                        int pcc2 = pcc(i, sfVar, gmVar.hc);
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                        sf2.measure(pcc2, makeMeasureSpec);
                        int measuredWidth2 = sf2.getMeasuredWidth();
                        int measuredHeight2 = sf2.getMeasuredHeight();
                        pcc(i9, pcc2, makeMeasureSpec, sf2);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    i6 = Math.max(i8, sfVar.jr() + sfVar.hc() + measuredWidth + this.oo.pcc(sf2));
                    gmVar.vj = sfVar.dax() + sfVar.gbb() + measuredHeight + gmVar.vj;
                } else {
                    f2 = f5;
                    boolean z4 = z2;
                    int measuredWidth3 = sf2.getMeasuredWidth();
                    long[] jArr3 = this.wh;
                    if (jArr3 != null) {
                        measuredWidth3 = pcc(jArr3[i9]);
                    }
                    int measuredHeight3 = sf2.getMeasuredHeight();
                    long[] jArr4 = this.wh;
                    if (jArr4 != null) {
                        measuredHeight3 = sf(jArr4[i9]);
                    }
                    if (this.vj[i9] || sfVar.oo() <= f) {
                        z2 = z4;
                    } else {
                        float oo2 = (sfVar.oo() * f2) + measuredWidth3;
                        if (i7 == gmVar.kj - 1) {
                            oo2 += f6;
                            f6 = f;
                        }
                        int round2 = Math.round(oo2);
                        if (round2 > sfVar.vy()) {
                            round2 = sfVar.vy();
                            this.vj[i9] = true;
                            gmVar.ork -= sfVar.oo();
                            z2 = true;
                        } else {
                            float f8 = (oo2 - round2) + f6;
                            double d4 = f8;
                            if (d4 > 1.0d) {
                                round2++;
                                d = d4 - 1.0d;
                            } else {
                                if (d4 < -1.0d) {
                                    round2--;
                                    d = d4 + 1.0d;
                                }
                                f6 = f8;
                                z2 = z4;
                            }
                            f8 = (float) d;
                            f6 = f8;
                            z2 = z4;
                        }
                        int sf3 = sf(i2, sfVar, gmVar.hc);
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                        sf2.measure(makeMeasureSpec2, sf3);
                        int measuredWidth4 = sf2.getMeasuredWidth();
                        int measuredHeight4 = sf2.getMeasuredHeight();
                        pcc(i9, makeMeasureSpec2, sf3, sf2);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    int max = Math.max(i8, sfVar.dax() + sfVar.gbb() + measuredHeight3 + this.oo.pcc(sf2));
                    gmVar.vj = sfVar.jr() + sfVar.hc() + measuredWidth3 + gmVar.vj;
                    i6 = max;
                }
                gmVar.qf = Math.max(gmVar.qf, i6);
                i8 = i6;
            }
            i7++;
            f5 = f2;
            f4 = f;
        }
        if (!z2 || i5 == gmVar.vj) {
            return;
        }
        pcc(i, i2, gmVar, i3, i4, true);
    }

    private int pcc(int i, com.bytedance.adsdk.ugeno.vj.sf sfVar, int i2) {
        com.bytedance.adsdk.ugeno.vj.pcc pccVar = this.oo;
        int pcc2 = pccVar.pcc(i, sfVar.jr() + sfVar.hc() + pccVar.getPaddingLeft() + this.oo.getPaddingRight() + i2, sfVar.pcc());
        int size = View.MeasureSpec.getSize(pcc2);
        if (size > sfVar.vy()) {
            return View.MeasureSpec.makeMeasureSpec(sfVar.vy(), View.MeasureSpec.getMode(pcc2));
        }
        return size < sfVar.qf() ? View.MeasureSpec.makeMeasureSpec(sfVar.qf(), View.MeasureSpec.getMode(pcc2)) : pcc2;
    }

    private List<gm> pcc(List<gm> list, int i, int i2) {
        int i3 = (i - i2) / 2;
        ArrayList arrayList = new ArrayList();
        gm gmVar = new gm();
        gmVar.qf = i3;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (i4 == 0) {
                arrayList.add(gmVar);
            }
            arrayList.add(list.get(i4));
            if (i4 == list.size() - 1) {
                arrayList.add(gmVar);
            }
        }
        return arrayList;
    }

    public void pcc() {
        pcc(0);
    }

    public void pcc(int i) {
        View sf2;
        if (i >= this.oo.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.oo.getFlexDirection();
        if (this.oo.getAlignItems() == 4) {
            int[] iArr = this.pcc;
            List<gm> flexLinesInternal = this.oo.getFlexLinesInternal();
            int size = flexLinesInternal.size();
            for (int i2 = iArr != null ? iArr[i] : 0; i2 < size; i2++) {
                gm gmVar = flexLinesInternal.get(i2);
                int i3 = gmVar.kj;
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = gmVar.jr + i4;
                    if (i4 < this.oo.getFlexItemCount() && (sf2 = this.oo.sf(i5)) != null && sf2.getVisibility() != 8) {
                        com.bytedance.adsdk.ugeno.vj.sf sfVar = (com.bytedance.adsdk.ugeno.vj.sf) sf2.getLayoutParams();
                        if (sfVar.wh() == -1 || sfVar.wh() == 4) {
                            if (flexDirection != 0 && flexDirection != 1) {
                                if (flexDirection != 2 && flexDirection != 3) {
                                    a70.p("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
                                    return;
                                }
                                sf(sf2, gmVar.qf, i5);
                            } else {
                                pcc(sf2, gmVar.qf, i5);
                            }
                        }
                    }
                }
            }
            return;
        }
        for (gm gmVar2 : this.oo.getFlexLinesInternal()) {
            for (Integer num : gmVar2.gbb) {
                View sf3 = this.oo.sf(num.intValue());
                if (flexDirection != 0 && flexDirection != 1) {
                    if (flexDirection != 2 && flexDirection != 3) {
                        a70.p("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
                        return;
                    }
                    sf(sf3, gmVar2.qf, num.intValue());
                } else {
                    pcc(sf3, gmVar2.qf, num.intValue());
                }
            }
        }
    }

    private void pcc(View view, int i, int i2) {
        int measuredWidth;
        com.bytedance.adsdk.ugeno.vj.sf sfVar = (com.bytedance.adsdk.ugeno.vj.sf) view.getLayoutParams();
        int min = Math.min(Math.max(((i - sfVar.gbb()) - sfVar.dax()) - this.oo.pcc(view), sfVar.kj()), sfVar.ork());
        long[] jArr = this.wh;
        if (jArr != null) {
            measuredWidth = pcc(jArr[i2]);
        } else {
            measuredWidth = view.getMeasuredWidth();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        pcc(i2, makeMeasureSpec, makeMeasureSpec2, view);
    }

    public void pcc(View view, gm gmVar, int i, int i2, int i3, int i4) {
        com.bytedance.adsdk.ugeno.vj.sf sfVar = (com.bytedance.adsdk.ugeno.vj.sf) view.getLayoutParams();
        int alignItems = this.oo.getAlignItems();
        if (sfVar.wh() != -1) {
            alignItems = sfVar.wh();
        }
        int i5 = gmVar.qf;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (this.oo.getFlexWrap() != 2) {
                    int i6 = i2 + i5;
                    view.layout(i, (i6 - view.getMeasuredHeight()) - sfVar.dax(), i3, i6 - sfVar.dax());
                    return;
                }
                int measuredHeight = view.getMeasuredHeight();
                int gbb = sfVar.gbb() + measuredHeight + (i2 - i5);
                int measuredHeight2 = view.getMeasuredHeight();
                view.layout(i, gbb, i3, sfVar.gbb() + measuredHeight2 + (i4 - i5));
                return;
            }
            if (alignItems == 2) {
                int gbb2 = ((sfVar.gbb() + (i5 - view.getMeasuredHeight())) - sfVar.dax()) / 2;
                if (this.oo.getFlexWrap() != 2) {
                    int i7 = i2 + gbb2;
                    view.layout(i, i7, i3, view.getMeasuredHeight() + i7);
                    return;
                } else {
                    int i8 = i2 - gbb2;
                    view.layout(i, i8, i3, view.getMeasuredHeight() + i8);
                    return;
                }
            }
            if (alignItems == 3) {
                int flexWrap = this.oo.getFlexWrap();
                int i9 = gmVar.tmg;
                if (flexWrap != 2) {
                    int max = Math.max(i9 - view.getBaseline(), sfVar.gbb());
                    view.layout(i, i2 + max, i3, i4 + max);
                    return;
                } else {
                    int max2 = Math.max(view.getBaseline() + (i9 - view.getMeasuredHeight()), sfVar.dax());
                    view.layout(i, i2 - max2, i3, i4 - max2);
                    return;
                }
            }
            if (alignItems != 4) {
                return;
            }
        }
        if (this.oo.getFlexWrap() != 2) {
            view.layout(i, sfVar.gbb() + i2, i3, sfVar.gbb() + i4);
        } else {
            view.layout(i, i2 - sfVar.dax(), i3, i4 - sfVar.dax());
        }
    }

    public void pcc(View view, gm gmVar, boolean z, int i, int i2, int i3, int i4) {
        com.bytedance.adsdk.ugeno.vj.sf sfVar = (com.bytedance.adsdk.ugeno.vj.sf) view.getLayoutParams();
        int alignItems = this.oo.getAlignItems();
        if (sfVar.wh() != -1) {
            alignItems = sfVar.wh();
        }
        int i5 = gmVar.qf;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (!z) {
                    view.layout(((i + i5) - view.getMeasuredWidth()) - sfVar.jr(), i2, ((i3 + i5) - view.getMeasuredWidth()) - sfVar.jr(), i4);
                    return;
                }
                int measuredWidth = view.getMeasuredWidth();
                view.layout(sfVar.hc() + measuredWidth + (i - i5), i2, sfVar.hc() + view.getMeasuredWidth() + (i3 - i5), i4);
                return;
            }
            if (alignItems == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int pcc2 = ((com.bytedance.adsdk.ugeno.qf.wh.pcc(marginLayoutParams) + (i5 - view.getMeasuredWidth())) - com.bytedance.adsdk.ugeno.qf.wh.sf(marginLayoutParams)) / 2;
                if (!z) {
                    view.layout(i + pcc2, i2, i3 + pcc2, i4);
                    return;
                } else {
                    view.layout(i - pcc2, i2, i3 - pcc2, i4);
                    return;
                }
            }
            if (alignItems != 3 && alignItems != 4) {
                return;
            }
        }
        if (!z) {
            view.layout(sfVar.hc() + i, i2, sfVar.hc() + i3, i4);
        } else {
            view.layout(i - sfVar.jr(), i2, i3 - sfVar.jr(), i4);
        }
    }

    private void pcc(int i, int i2, int i3, View view) {
        long[] jArr = this.sf;
        if (jArr != null) {
            jArr[i] = sf(i2, i3);
        }
        long[] jArr2 = this.wh;
        if (jArr2 != null) {
            jArr2[i] = sf(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }
}
