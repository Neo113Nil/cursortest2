package defpackage;

import androidx.compose.foundation.lazy.layout.c;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class bsa implements vqa {
    public final /* synthetic */ ksa a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ p3e c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ pg0 e;
    public final /* synthetic */ lg0 f;
    public final /* synthetic */ ku3 g;
    public final /* synthetic */ k29 h;
    public final /* synthetic */ jle i;
    public final /* synthetic */ fo j;
    public final /* synthetic */ lv1 k;

    public bsa(ksa ksaVar, boolean z, p3e p3eVar, KProperty0 kProperty0, pg0 pg0Var, lg0 lg0Var, ku3 ku3Var, k29 k29Var, jle jleVar, fo foVar, lv1 lv1Var) {
        this.a = ksaVar;
        this.b = z;
        this.c = p3eVar;
        this.d = kProperty0;
        this.e = pg0Var;
        this.f = lg0Var;
        this.g = ku3Var;
        this.h = k29Var;
        this.i = jleVar;
        this.j = foVar;
        this.k = lv1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:252:0x06dc  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x071a  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0761  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0792  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x079b  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x07a8  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x07ab  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x07a0  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0797  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0750  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x072b  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x06fe  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x06f2  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x06e1  */
    @Override // defpackage.vqa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final l1c a(wqa wqaVar, long j) {
        float e;
        c cVar;
        ksa ksaVar;
        long j2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        float f;
        List list;
        float f2;
        int i8;
        List list2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        ArrayList arrayList;
        rqa rqaVar;
        float f3;
        float f4;
        int i14;
        boolean z;
        int i15;
        tzc tzcVar;
        Integer valueOf;
        Integer valueOf2;
        int i16;
        csa csaVar;
        yji yjiVar;
        int[] iArr;
        int i17;
        yji yjiVar2 = wqaVar.b;
        ksa ksaVar2 = this.a;
        ksaVar2.t.getValue();
        int i18 = 1;
        boolean z2 = ksaVar2.b || yjiVar2.W();
        boolean z3 = this.b;
        n9e.r(j, z3 ? ewd.a : ewd.b);
        p3e p3eVar = this.c;
        int e0 = z3 ? yjiVar2.e0(p3eVar.b(yjiVar2.getLayoutDirection())) : yjiVar2.e0(l98.L(p3eVar, yjiVar2.getLayoutDirection()));
        int e02 = z3 ? yjiVar2.e0(p3eVar.c(yjiVar2.getLayoutDirection())) : yjiVar2.e0(l98.K(p3eVar, yjiVar2.getLayoutDirection()));
        int e03 = yjiVar2.e0(p3eVar.d());
        int e04 = yjiVar2.e0(p3eVar.a()) + e03;
        int i19 = e0 + e02;
        int i20 = z3 ? e04 : i19;
        int i21 = z3 ? e03 : !z3 ? e0 : e02;
        int i22 = i20 - i21;
        long i23 = cn3.i(-i19, -e04, j);
        sra sraVar = (sra) this.d.invoke();
        xpa xpaVar = sraVar.c;
        int h = an3.h(i23);
        int g = an3.g(i23);
        xpaVar.a.i(h);
        xpaVar.b.i(g);
        lg0 lg0Var = this.f;
        pg0 pg0Var = this.e;
        if (z3) {
            if (pg0Var == null) {
                throw wv8.d("null verticalArrangement when isVertical == true");
            }
            e = pg0Var.e();
        } else {
            if (lg0Var == null) {
                throw wv8.d("null horizontalAlignment when isVertical == false");
            }
            e = lg0Var.e();
        }
        int e05 = yjiVar2.e0(e);
        int itemCount = sraVar.getItemCount();
        long j3 = (e0 << 32) | (e03 & 4294967295L);
        int g2 = z3 ? an3.g(j) - e04 : an3.h(j) - i19;
        int i24 = i21;
        asa asaVar = new asa(i23, this.b, sraVar, wqaVar, itemCount, e05, this.j, this.k, i24, i22, j3, this.a);
        int i25 = itemCount;
        sra sraVar2 = asaVar.c;
        c cVar2 = sraVar2.d;
        nnh w = bea.w();
        Function1 e2 = w != null ? w.e() : null;
        nnh C = bea.C(w);
        try {
            int h2 = ksaVar2.h();
            ipa ipaVar = ksaVar2.e;
            int C2 = nq8.C(h2, sraVar, ipaVar.e);
            if (h2 != C2) {
                cVar = cVar2;
                ipaVar.b.i(C2);
                ipaVar.f.c(h2);
            } else {
                cVar = cVar2;
            }
            int i26 = ksaVar2.i();
            Unit unit = Unit.a;
            bea.K(w, C, e2);
            List o = yaa.o(sraVar, ksaVar2.s, ksaVar2.p);
            float floatValue = (yjiVar2.W() || !z2) ? ksaVar2.h : ((Number) ((eoh) ((d80) ksaVar2.x.c).b).getValue()).floatValue();
            rqa rqaVar2 = ksaVar2.o;
            boolean W = yjiVar2.W();
            e1d e1dVar = ksaVar2.w;
            boolean z4 = ksaVar2.i;
            if (i24 < 0) {
                u3a.a("invalid beforeContentPadding");
            }
            if (i22 < 0) {
                u3a.a("invalid afterContentPadding");
            }
            boolean z5 = this.b;
            ku3 ku3Var = this.g;
            k29 k29Var = this.h;
            if (i25 <= 0) {
                int j4 = an3.j(i23);
                int i27 = an3.i(i23);
                rqaVar2.d(0, j4, i27, new ArrayList(), cVar, asaVar, z5, W, 1, z2, 0, 0, ku3Var, k29Var);
                if (!W) {
                    long b = rqaVar2.b();
                    if (!c7a.a(b, 0L)) {
                        j4 = cn3.g((int) (b >> 32), i23);
                        i27 = cn3.f((int) (b & 4294967295L), i23);
                    }
                }
                yo9 yo9Var = new yo9(28);
                int g3 = cn3.g(j4 + i19, j);
                int f5 = cn3.f(i27 + e04, j);
                lm5 lm5Var = lm5.a;
                lm5Var.getClass();
                yjiVar = yjiVar2;
                ksaVar = ksaVar2;
                csaVar = new csa(null, 0, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, yjiVar2.v0(g3, f5, lm5Var, yo9Var), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, ku3Var, wqaVar, asaVar.e, km5.a, -i24, g2 + i22, 0, z5 ? ewd.a : ewd.b, i22, e05);
            } else {
                ksaVar = ksaVar2;
                if (C2 >= i25) {
                    C2 = i25 - 1;
                    i26 = 0;
                }
                int round = Math.round(floatValue);
                int i28 = i26 - round;
                if (C2 == 0 && i28 < 0) {
                    round += i28;
                    i28 = 0;
                }
                vg0 vg0Var = new vg0();
                int i29 = -i24;
                int i30 = C2;
                int i31 = i29 + (e05 < 0 ? e05 : 0);
                int i32 = i28 + i31;
                float f6 = floatValue;
                int i33 = 0;
                while (true) {
                    j2 = asaVar.e;
                    if (i32 >= 0 || i30 <= 0) {
                        break;
                    }
                    int i34 = i29;
                    int i35 = i30 - 1;
                    dsa R = asaVar.R(i35, j2);
                    vg0Var.add(0, R);
                    i33 = Math.max(i33, R.r);
                    i32 += R.q;
                    i30 = i35;
                    i29 = i34;
                }
                int i36 = i29;
                if (i32 < i31) {
                    round -= i31 - i32;
                    i32 = i31;
                }
                int i37 = round;
                int i38 = i32 - i31;
                int i39 = g2 + i22;
                int i40 = i39 >= 0 ? i39 : 0;
                int i41 = i33;
                int i42 = -i38;
                int i43 = i38;
                int i44 = i30;
                int i45 = 0;
                boolean z6 = false;
                while (i45 < vg0Var.size()) {
                    if (i42 >= i40) {
                        vg0Var.remove(i45);
                        Unit unit2 = Unit.a;
                        z6 = true;
                    } else {
                        i44++;
                        i42 += ((dsa) vg0Var.get(i45)).q;
                        i45++;
                    }
                }
                int i46 = i41;
                boolean z7 = z6;
                int i47 = i44;
                while (i47 < i25 && (i42 < i40 || i42 <= 0 || vg0Var.isEmpty())) {
                    int i48 = i40;
                    dsa R2 = asaVar.R(i47, j2);
                    int i49 = i25;
                    int i50 = R2.q;
                    i42 += i50;
                    if (i42 <= i31) {
                        i17 = i31;
                        if (i47 != i49 - 1) {
                            i43 -= i50;
                            Unit unit3 = Unit.a;
                            i30 = i47 + 1;
                            z7 = true;
                            i47++;
                            i40 = i48;
                            i31 = i17;
                            i25 = i49;
                        }
                    } else {
                        i17 = i31;
                    }
                    i46 = Math.max(i46, R2.r);
                    vg0Var.addLast(R2);
                    i47++;
                    i40 = i48;
                    i31 = i17;
                    i25 = i49;
                }
                int i51 = i25;
                if (i42 < g2) {
                    int i52 = g2 - i42;
                    int i53 = i42 + i52;
                    int i54 = i43 - i52;
                    while (i54 < i24 && i30 > 0) {
                        int i55 = i30 - 1;
                        int i56 = i52;
                        dsa R3 = asaVar.R(i55, j2);
                        vg0Var.add(0, R3);
                        i46 = Math.max(i46, R3.r);
                        i54 += R3.q;
                        i30 = i55;
                        i52 = i56;
                        i47 = i47;
                    }
                    int i57 = i52;
                    i = i47;
                    i2 = i37;
                    int i58 = i2 + i57;
                    if (i54 < 0) {
                        int i59 = i58 + i54;
                        i4 = i53 + i54;
                        i5 = i30;
                        i3 = i59;
                        i6 = 0;
                    } else {
                        i6 = i54;
                        i3 = i58;
                        i4 = i53;
                        i5 = i30;
                    }
                } else {
                    i = i47;
                    i2 = i37;
                    i3 = i2;
                    i4 = i42;
                    i5 = i30;
                    i6 = i43;
                }
                int i60 = i46;
                float f7 = (Integer.signum(Math.round(f6)) != Integer.signum(i3) || Math.abs(Math.round(f6)) < Math.abs(i3)) ? f6 : i3;
                float f8 = f6 - f7;
                float f9 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if (W && i3 > i2 && f8 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f9 = (i3 - i2) + f8;
                }
                float f10 = f9;
                if (i6 < 0) {
                    u3a.a("negative currentFirstItemScrollOffset");
                }
                int i61 = -i6;
                dsa dsaVar = (dsa) vg0Var.first();
                if (i24 > 0 || e05 < 0) {
                    i7 = i61;
                    int size = vg0Var.size();
                    dsa dsaVar2 = dsaVar;
                    int i62 = 0;
                    while (i62 < size) {
                        int i63 = size;
                        int i64 = ((dsa) vg0Var.get(i62)).q;
                        if (i6 == 0 || i64 > i6 || i62 == vg0Var.size() - 1) {
                            break;
                        }
                        i6 -= i64;
                        i62++;
                        dsaVar2 = (dsa) vg0Var.get(i62);
                        size = i63;
                    }
                    dsaVar = dsaVar2;
                } else {
                    i7 = i61;
                }
                int i65 = i6;
                int max = Math.max(0, i5);
                int i66 = i5 - 1;
                if (max <= i66) {
                    List list3 = null;
                    while (true) {
                        if (list3 == null) {
                            list3 = new ArrayList();
                        }
                        f = f10;
                        list = list3;
                        list.add(asaVar.R(i66, j2));
                        if (i66 == max) {
                            break;
                        }
                        i66--;
                        list3 = list;
                        f10 = f;
                    }
                } else {
                    f = f10;
                    list = null;
                }
                int size2 = o.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i67 = size2 - 1;
                        int intValue = ((Number) o.get(size2)).intValue();
                        if (intValue < max) {
                            if (list == null) {
                                list = new ArrayList();
                            }
                            list.add(asaVar.R(intValue, j2));
                        }
                        if (i67 < 0) {
                            break;
                        }
                        size2 = i67;
                    }
                }
                if (list == null) {
                    list = km5.a;
                }
                int i68 = i60;
                int i69 = 0;
                for (int size3 = list.size(); i69 < size3; size3 = size3) {
                    i68 = Math.max(i68, ((dsa) list.get(i69)).r);
                    i69++;
                }
                int min = Math.min(((dsa) CollectionsKt.h0(vg0Var)).a, i51 - 1);
                int i70 = ((dsa) CollectionsKt.h0(vg0Var)).a + 1;
                if (i70 <= min) {
                    List list4 = null;
                    while (true) {
                        if (list4 == null) {
                            list4 = new ArrayList();
                        }
                        f2 = f7;
                        i8 = i68;
                        list2 = list4;
                        list2.add(asaVar.R(i70, j2));
                        if (i70 == min) {
                            break;
                        }
                        i70++;
                        list4 = list2;
                        i68 = i8;
                        f7 = f2;
                    }
                } else {
                    f2 = f7;
                    i8 = i68;
                    list2 = null;
                }
                if (list2 != null && ((dsa) CollectionsKt.h0(list2)).a > min) {
                    min = ((dsa) CollectionsKt.h0(list2)).a;
                }
                int size4 = o.size();
                int i71 = 0;
                while (i71 < size4) {
                    int i72 = size4;
                    int intValue2 = ((Number) o.get(i71)).intValue();
                    if (intValue2 > min) {
                        if (list2 == null) {
                            list2 = new ArrayList();
                        }
                        list2.add(asaVar.R(intValue2, j2));
                    }
                    i71++;
                    size4 = i72;
                }
                if (list2 == null) {
                    list2 = km5.a;
                }
                int size5 = list2.size();
                int i73 = i8;
                for (int i74 = 0; i74 < size5; i74++) {
                    i73 = Math.max(i73, ((dsa) list2.get(i74)).r);
                }
                boolean z8 = Intrinsics.c(dsaVar, vg0Var.first()) && list.isEmpty() && list2.isEmpty();
                int g4 = cn3.g(z5 ? i73 : i4, i23);
                if (z5) {
                    i73 = i4;
                }
                int f11 = cn3.f(i73, i23);
                int i75 = z5 ? f11 : g4;
                boolean z9 = i4 < Math.min(i75, g2);
                if (z9 && i7 != 0) {
                    u3a.c("non-zero itemsScrollOffset");
                }
                boolean z10 = z8;
                ArrayList arrayList2 = new ArrayList(list2.size() + list.size() + vg0Var.size());
                if (z9) {
                    if (!list.isEmpty() || !list2.isEmpty()) {
                        u3a.a("no extra items");
                    }
                    int size6 = vg0Var.size();
                    int[] iArr2 = new int[size6];
                    for (int i76 = 0; i76 < size6; i76++) {
                        iArr2[i76] = ((dsa) vg0Var.get(i76)).p;
                    }
                    int[] iArr3 = new int[size6];
                    if (z5) {
                        if (pg0Var == null) {
                            throw wv8.d("null verticalArrangement when isVertical == true");
                        }
                        pg0Var.b(wqaVar, i75, iArr2, iArr3);
                        int i77 = i;
                        i9 = i4;
                        i10 = i77;
                        iArr = iArr3;
                        i11 = g2;
                        i12 = 0;
                    } else {
                        if (lg0Var == null) {
                            throw wv8.d("null horizontalArrangement when isVertical == false");
                        }
                        int i78 = i;
                        i9 = i4;
                        i10 = i78;
                        i12 = 0;
                        iArr = iArr3;
                        i11 = g2;
                        lg0Var.j(wqaVar, i75, iArr2, ema.a, iArr);
                    }
                    IntRange B = ph0.B(iArr);
                    int i79 = B.b;
                    int i80 = B.c;
                    if ((i80 > 0 && i79 >= 0) || (i80 < 0 && i79 <= 0)) {
                        int i81 = i12;
                        while (true) {
                            int i82 = iArr[i81];
                            dsa dsaVar3 = (dsa) vg0Var.get(i81);
                            dsaVar3.m(i82, g4, f11);
                            arrayList2.add(dsaVar3);
                            if (i81 == i79) {
                                break;
                            }
                            i81 += i80;
                        }
                    }
                } else {
                    int i83 = i;
                    i9 = i4;
                    i10 = i83;
                    i11 = g2;
                    i12 = 0;
                    int i84 = i7;
                    int i85 = 0;
                    for (int size7 = list.size(); i85 < size7; size7 = size7) {
                        dsa dsaVar4 = (dsa) list.get(i85);
                        i84 -= dsaVar4.q;
                        dsaVar4.m(i84, g4, f11);
                        arrayList2.add(dsaVar4);
                        i85++;
                    }
                    int size8 = vg0Var.size();
                    int i86 = i7;
                    for (int i87 = 0; i87 < size8; i87++) {
                        dsa dsaVar5 = (dsa) vg0Var.get(i87);
                        dsaVar5.m(i86, g4, f11);
                        arrayList2.add(dsaVar5);
                        i86 += dsaVar5.q;
                    }
                    int size9 = list2.size();
                    for (int i88 = 0; i88 < size9; i88++) {
                        dsa dsaVar6 = (dsa) list2.get(i88);
                        dsaVar6.m(i86, g4, f11);
                        arrayList2.add(dsaVar6);
                        i86 += dsaVar6.q;
                    }
                }
                if (z4) {
                    i13 = f11;
                    arrayList = arrayList2;
                    rqaVar = rqaVar2;
                    f3 = f2;
                } else {
                    f3 = f2;
                    rqaVar = rqaVar2;
                    rqaVar.d((int) f3, g4, f11, arrayList2, cVar, asaVar, z5, W, 1, z2, i65, i9, ku3Var, k29Var);
                    i13 = f11;
                    arrayList = arrayList2;
                }
                int i89 = i9;
                if (W) {
                    f4 = f3;
                    i14 = i89;
                } else {
                    long b2 = rqaVar.b();
                    f4 = f3;
                    i14 = i89;
                    if (!c7a.a(b2, 0L)) {
                        int i90 = z5 ? i13 : g4;
                        z = z5;
                        g4 = cn3.g(Math.max(g4, (int) (b2 >> 32)), i23);
                        int f12 = cn3.f(Math.max(i13, (int) (b2 & 4294967295L)), i23);
                        int i91 = z ? f12 : g4;
                        if (i91 != i90) {
                            int size10 = arrayList.size();
                            for (int i92 = i12; i92 < size10; i92++) {
                                dsa dsaVar7 = (dsa) arrayList.get(i92);
                                dsaVar7.t = i91;
                                dsaVar7.v = dsaVar7.h + i91;
                            }
                        }
                        i15 = f12;
                        int i93 = g4;
                        dsa dsaVar8 = (dsa) vg0Var.d();
                        int i94 = dsaVar8 == null ? dsaVar8.a : i12;
                        dsa dsaVar9 = (dsa) vg0Var.m();
                        int i95 = dsaVar9 == null ? dsaVar9.a : i12;
                        tzcVar = sraVar2.b.b;
                        if (tzcVar == null) {
                            tzcVar = m6a.a;
                        }
                        List p = hda.p(this.i, i94, i95, arrayList, tzcVar, i24, i93, i15, new ida(asaVar, 8));
                        if (z10) {
                            dsa dsaVar10 = (dsa) vg0Var.d();
                            if (dsaVar10 != null) {
                                valueOf = Integer.valueOf(dsaVar10.a);
                                if (z10) {
                                }
                                if (i10 >= i16) {
                                }
                                epa epaVar = new epa(e1dVar, arrayList, p, W, 1);
                                int g5 = cn3.g(i93 + i19, j);
                                int f13 = cn3.f(i15 + e04, j);
                                lm5 lm5Var2 = lm5.a;
                                lm5Var2.getClass();
                                yjiVar = yjiVar2;
                                csaVar = new csa(dsaVar, i65, i18, f4, yjiVar2.v0(g5, f13, lm5Var2, epaVar), f, z7, ku3Var, wqaVar, asaVar.e, n9e.N(valueOf == null ? valueOf.intValue() : i12, valueOf2 == null ? valueOf2.intValue() : i12, arrayList, p), i36, i39, i16, !z ? ewd.a : ewd.b, i22, e05);
                            }
                            valueOf = null;
                            if (z10) {
                            }
                            if (i10 >= i16) {
                            }
                            epa epaVar2 = new epa(e1dVar, arrayList, p, W, 1);
                            int g52 = cn3.g(i93 + i19, j);
                            int f132 = cn3.f(i15 + e04, j);
                            lm5 lm5Var22 = lm5.a;
                            lm5Var22.getClass();
                            yjiVar = yjiVar2;
                            csaVar = new csa(dsaVar, i65, i18, f4, yjiVar2.v0(g52, f132, lm5Var22, epaVar2), f, z7, ku3Var, wqaVar, asaVar.e, n9e.N(valueOf == null ? valueOf.intValue() : i12, valueOf2 == null ? valueOf2.intValue() : i12, arrayList, p), i36, i39, i16, !z ? ewd.a : ewd.b, i22, e05);
                        } else {
                            dsa dsaVar11 = (dsa) CollectionsKt.firstOrNull(arrayList);
                            if (dsaVar11 != null) {
                                valueOf = Integer.valueOf(dsaVar11.a);
                                if (z10) {
                                    dsa dsaVar12 = (dsa) vg0Var.m();
                                    if (dsaVar12 != null) {
                                        valueOf2 = Integer.valueOf(dsaVar12.a);
                                        i16 = i51;
                                    }
                                    i16 = i51;
                                    valueOf2 = null;
                                } else {
                                    dsa dsaVar13 = (dsa) CollectionsKt.j0(arrayList);
                                    if (dsaVar13 != null) {
                                        valueOf2 = Integer.valueOf(dsaVar13.a);
                                        i16 = i51;
                                    }
                                    i16 = i51;
                                    valueOf2 = null;
                                }
                                if (i10 >= i16 && i14 <= i11) {
                                    i18 = i12;
                                }
                                epa epaVar22 = new epa(e1dVar, arrayList, p, W, 1);
                                int g522 = cn3.g(i93 + i19, j);
                                int f1322 = cn3.f(i15 + e04, j);
                                lm5 lm5Var222 = lm5.a;
                                lm5Var222.getClass();
                                yjiVar = yjiVar2;
                                csaVar = new csa(dsaVar, i65, i18, f4, yjiVar2.v0(g522, f1322, lm5Var222, epaVar22), f, z7, ku3Var, wqaVar, asaVar.e, n9e.N(valueOf == null ? valueOf.intValue() : i12, valueOf2 == null ? valueOf2.intValue() : i12, arrayList, p), i36, i39, i16, !z ? ewd.a : ewd.b, i22, e05);
                            }
                            valueOf = null;
                            if (z10) {
                            }
                            if (i10 >= i16) {
                                i18 = i12;
                            }
                            epa epaVar222 = new epa(e1dVar, arrayList, p, W, 1);
                            int g5222 = cn3.g(i93 + i19, j);
                            int f13222 = cn3.f(i15 + e04, j);
                            lm5 lm5Var2222 = lm5.a;
                            lm5Var2222.getClass();
                            yjiVar = yjiVar2;
                            csaVar = new csa(dsaVar, i65, i18, f4, yjiVar2.v0(g5222, f13222, lm5Var2222, epaVar222), f, z7, ku3Var, wqaVar, asaVar.e, n9e.N(valueOf == null ? valueOf.intValue() : i12, valueOf2 == null ? valueOf2.intValue() : i12, arrayList, p), i36, i39, i16, !z ? ewd.a : ewd.b, i22, e05);
                        }
                    }
                }
                z = z5;
                i15 = i13;
                int i932 = g4;
                dsa dsaVar82 = (dsa) vg0Var.d();
                if (dsaVar82 == null) {
                }
                dsa dsaVar92 = (dsa) vg0Var.m();
                if (dsaVar92 == null) {
                }
                tzcVar = sraVar2.b.b;
                if (tzcVar == null) {
                }
                List p2 = hda.p(this.i, i94, i95, arrayList, tzcVar, i24, i932, i15, new ida(asaVar, 8));
                if (z10) {
                }
            }
            ksa ksaVar3 = ksaVar;
            ksaVar3.g(csaVar, yjiVar.W(), false);
            qq4 qq4Var = ksaVar3.a;
            return csaVar;
        } catch (Throwable th) {
            bea.K(w, C, e2);
            throw th;
        }
    }
}
