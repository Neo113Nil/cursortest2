package defpackage;

import androidx.compose.foundation.lazy.layout.c;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class dpa implements vqa {
    public final /* synthetic */ qpa a;
    public final /* synthetic */ p3e b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ s39 d;
    public final /* synthetic */ pg0 e;
    public final /* synthetic */ ku3 f;
    public final /* synthetic */ k29 g;
    public final /* synthetic */ jle h;

    public dpa(qpa qpaVar, p3e p3eVar, KProperty0 kProperty0, s39 s39Var, pg0 pg0Var, lg0 lg0Var, ku3 ku3Var, k29 k29Var, jle jleVar) {
        this.a = qpaVar;
        this.b = p3eVar;
        this.c = kProperty0;
        this.d = s39Var;
        this.e = pg0Var;
        this.f = ku3Var;
        this.g = k29Var;
        this.h = jleVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x05d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x062a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x063a A[LOOP:12: B:223:0x0638->B:224:0x063a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0656  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x076b  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x07da A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x027c  */
    @Override // defpackage.vqa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final l1c a(wqa wqaVar, long j) {
        wj9 wj9Var;
        wj9 wj9Var2;
        ida idaVar;
        Function1 function1;
        kn4 kn4Var;
        int c;
        int h;
        yji yjiVar;
        qpa qpaVar;
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        int size;
        List list;
        int i6;
        List list2;
        float f;
        int i7;
        List list3;
        int size2;
        int i8;
        int size3;
        int i9;
        hpa hpaVar;
        int i10;
        boolean z2;
        int size4;
        int i11;
        int i12;
        int i13;
        float f2;
        int i14;
        fpa fpaVar;
        List list4;
        int i15;
        cpa cpaVar;
        List list5;
        gpa gpaVar;
        cpa cpaVar2;
        int i16;
        lpa lpaVar;
        int i17;
        gpa gpaVar2;
        yji yjiVar2 = wqaVar.b;
        qpa qpaVar2 = this.a;
        e1d e1dVar = qpaVar2.s;
        ipa ipaVar = qpaVar2.d;
        e1dVar.getValue();
        boolean z3 = qpaVar2.b || yjiVar2.W();
        ewd ewdVar = ewd.a;
        n9e.r(j, ewdVar);
        ema layoutDirection = yjiVar2.getLayoutDirection();
        p3e p3eVar = this.b;
        int e0 = yjiVar2.e0(p3eVar.b(layoutDirection));
        int e02 = yjiVar2.e0(p3eVar.c(yjiVar2.getLayoutDirection()));
        int e03 = yjiVar2.e0(p3eVar.d());
        int e04 = yjiVar2.e0(p3eVar.a()) + e03;
        int i18 = e02 + e0;
        int i19 = e04 - e03;
        long i20 = cn3.i(-i18, -e04, j);
        zoa zoaVar = (zoa) this.c.invoke();
        lpa lpaVar2 = zoaVar.b.a;
        s39 s39Var = this.d;
        if (s39Var.d != null && an3.b(s39Var.b, i20) && s39Var.c == yjiVar2.j()) {
            wj9Var = s39Var.d;
            wj9Var.getClass();
        } else {
            s39Var.b = i20;
            s39Var.c = yjiVar2.j();
            wj9 wj9Var3 = (wj9) s39Var.a.invoke(wqaVar, new an3(i20));
            s39Var.d = wj9Var3;
            wj9Var = wj9Var3;
        }
        int length = ((int[]) wj9Var.b).length;
        if (length != lpaVar2.i) {
            lpaVar2.i = length;
            ArrayList arrayList = lpaVar2.b;
            arrayList.clear();
            wj9Var2 = wj9Var;
            arrayList.add(new jpa(0, 0));
            lpaVar2.c = 0;
            lpaVar2.d = 0;
            lpaVar2.e = 0;
            lpaVar2.f = -1;
            lpaVar2.g.clear();
        } else {
            wj9Var2 = wj9Var;
        }
        pg0 pg0Var = this.e;
        int e05 = yjiVar2.e0(pg0Var.e());
        int itemCount = zoaVar.getItemCount();
        int g = an3.g(j) - e04;
        cpa cpaVar3 = new cpa(zoaVar, wqaVar, e05, this.a, e03, i19, (e0 << 32) | (e03 & 4294967295L));
        zoa zoaVar2 = cpaVar3.c;
        c cVar = zoaVar2.c;
        kn4 kn4Var2 = new kn4(wj9Var2, itemCount, e05, cpaVar3, lpaVar2);
        int i21 = itemCount;
        lpa lpaVar3 = (lpa) kn4Var2.e;
        uf8 uf8Var = new uf8(16, lpaVar2, kn4Var2);
        ida idaVar2 = new ida(lpaVar2, 4);
        nnh w = bea.w();
        List list6 = null;
        if (w != null) {
            idaVar = idaVar2;
            function1 = w.e();
        } else {
            idaVar = idaVar2;
            function1 = null;
        }
        nnh C = bea.C(w);
        lpa lpaVar4 = lpaVar3;
        try {
            int g2 = qpaVar2.g();
            int C2 = nq8.C(g2, zoaVar, ipaVar.e);
            if (g2 != C2) {
                kn4Var = kn4Var2;
                ipaVar.b.i(C2);
                ipaVar.f.c(g2);
            } else {
                kn4Var = kn4Var2;
            }
            if (C2 >= i21 && i21 > 0) {
                c = lpaVar2.c(i21 - 1);
                h = 0;
                Unit unit = Unit.a;
                bea.K(w, C, function1);
                List o = yaa.o(zoaVar, qpaVar2.q, qpaVar2.n);
                float floatValue = (yjiVar2.W() && z3) ? ((Number) ((eoh) ((d80) qpaVar2.v.c).b).getValue()).floatValue() : qpaVar2.g;
                rqa rqaVar = qpaVar2.m;
                boolean W = yjiVar2.W();
                fpa fpaVar2 = qpaVar2.c;
                e1d e1dVar2 = qpaVar2.r;
                if (e03 < 0) {
                    u3a.a("negative beforeContentPadding");
                }
                if (i19 < 0) {
                    u3a.a("negative afterContentPadding");
                }
                ku3 ku3Var = this.f;
                k29 k29Var = this.g;
                float f3 = floatValue;
                int i22 = h;
                if (i21 > 0) {
                    int j2 = an3.j(i20);
                    int i23 = an3.i(i20);
                    rqaVar.d(0, j2, i23, new ArrayList(), cVar, cpaVar3, true, W, length, z3, 0, 0, ku3Var, k29Var);
                    if (!W) {
                        long b = rqaVar.b();
                        if (!c7a.a(b, 0L)) {
                            j2 = cn3.g((int) (b >> 32), i20);
                            i23 = cn3.f((int) (b & 4294967295L), i20);
                        }
                    }
                    yo9 yo9Var = new yo9(24);
                    int g3 = cn3.g(j2 + i18, j);
                    int f4 = cn3.f(i23 + e04, j);
                    lm5 lm5Var = lm5.a;
                    lm5Var.getClass();
                    qpaVar = qpaVar2;
                    yjiVar = yjiVar2;
                    fpaVar = new fpa(null, 0, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, yjiVar2.v0(g3, f4, lm5Var, yo9Var), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, ku3Var, wqaVar, length, uf8Var, idaVar, km5.a, -e03, g + i19, 0, ewdVar, i19, e05);
                } else {
                    yjiVar = yjiVar2;
                    qpaVar = qpaVar2;
                    cpa cpaVar4 = cpaVar3;
                    int i24 = e05;
                    int i25 = i19;
                    ida idaVar3 = idaVar;
                    int round = Math.round(f3);
                    int i26 = i22 - round;
                    if (c == 0 && i26 < 0) {
                        round += i26;
                        i26 = 0;
                    }
                    int i27 = c;
                    vg0 vg0Var = new vg0();
                    int i28 = -e03;
                    int i29 = i28 + (i24 < 0 ? i24 : 0);
                    int i30 = i26 + i29;
                    while (i30 < 0 && i27 > 0) {
                        int i31 = i24;
                        int i32 = i27 - 1;
                        hpa f5 = kn4Var.f(i32);
                        vg0Var.add(0, f5);
                        i30 += f5.g;
                        i27 = i32;
                        i24 = i31;
                        i25 = i25;
                    }
                    int i33 = i24;
                    int i34 = i25;
                    kn4 kn4Var3 = kn4Var;
                    int i35 = 0;
                    if (i30 < i29) {
                        round -= i29 - i30;
                        i30 = i29;
                    }
                    int i36 = round;
                    int i37 = i30 - i29;
                    int i38 = g + i34;
                    if (i38 < 0) {
                        i = i38;
                    } else {
                        i35 = i38;
                        i = i35;
                    }
                    int i39 = i37;
                    int i40 = -i37;
                    int i41 = i27;
                    int i42 = 0;
                    boolean z4 = false;
                    while (i42 < vg0Var.size()) {
                        if (i40 >= i35) {
                            vg0Var.remove(i42);
                            Unit unit2 = Unit.a;
                            z4 = true;
                        } else {
                            i41++;
                            i40 += ((hpa) vg0Var.get(i42)).g;
                            i42++;
                        }
                    }
                    boolean z5 = z4;
                    int i43 = i41;
                    while (i43 < i21 && (i40 < i35 || i40 <= 0 || vg0Var.isEmpty())) {
                        z = z5;
                        hpa f6 = kn4Var3.f(i43);
                        int i44 = i35;
                        int i45 = f6.g;
                        gpa[] gpaVarArr = f6.b;
                        int i46 = i43;
                        if (gpaVarArr.length == 0) {
                            break;
                        }
                        i40 += i45;
                        if (i40 > i29 || ((gpa) ph0.M(gpaVarArr)).a == i21 - 1) {
                            vg0Var.addLast(f6);
                            z5 = z;
                        } else {
                            i39 -= i45;
                            Unit unit3 = Unit.a;
                            i27 = i46 + 1;
                            z5 = true;
                        }
                        i43 = i46 + 1;
                        i35 = i44;
                    }
                    z = z5;
                    if (i40 < g) {
                        int i47 = g - i40;
                        int i48 = i40 + i47;
                        i3 = i39 - i47;
                        while (i3 < e03 && i27 > 0) {
                            int i49 = i27 - 1;
                            int i50 = i47;
                            hpa f7 = kn4Var3.f(i49);
                            vg0Var.add(0, f7);
                            i3 += f7.g;
                            i47 = i50;
                            i48 = i48;
                            i27 = i49;
                        }
                        int i51 = i48;
                        i2 = i36 + i47;
                        if (i3 < 0) {
                            i2 += i3;
                            i40 = i51 + i3;
                            i3 = 0;
                        } else {
                            i40 = i51;
                        }
                    } else {
                        i2 = i36;
                        i3 = i39;
                    }
                    float f8 = (Integer.signum(Math.round(f3)) != Integer.signum(i2) || Math.abs(Math.round(f3)) < Math.abs(i2)) ? f3 : i2;
                    float f9 = f3 - f8;
                    float f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    if (W && i2 > i36 && f9 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        f10 = (i2 - i36) + f9;
                    }
                    float f11 = f10;
                    if (i3 < 0) {
                        u3a.a("negative initial offset");
                    }
                    int i52 = -i3;
                    hpa hpaVar2 = (hpa) vg0Var.d();
                    int i53 = (hpaVar2 == null || (gpaVar2 = (gpa) ph0.A(hpaVar2.b)) == null) ? 0 : gpaVar2.a;
                    hpa hpaVar3 = (hpa) vg0Var.m();
                    if (hpaVar3 != null) {
                        gpa[] gpaVarArr2 = hpaVar3.b;
                        i4 = i3;
                        gpa gpaVar3 = gpaVarArr2.length == 0 ? null : gpaVarArr2[gpaVarArr2.length - 1];
                        if (gpaVar3 != null) {
                            i5 = gpaVar3.a;
                            size = o.size();
                            list = null;
                            i6 = 0;
                            while (i6 < size) {
                                int i54 = size;
                                int intValue = ((Number) o.get(i6)).intValue();
                                if (intValue < 0 || intValue >= i53) {
                                    cpaVar2 = cpaVar4;
                                    i16 = i53;
                                    lpaVar = lpaVar4;
                                    i17 = i6;
                                } else {
                                    i16 = i53;
                                    lpaVar = lpaVar4;
                                    i17 = i6;
                                    int e = lpaVar.e(intValue, lpaVar.i);
                                    cpa cpaVar5 = cpaVar4;
                                    gpa R = cpaVar5.R(intValue, 0, e, cpaVar4.e, kn4Var3.a(0, e));
                                    cpaVar2 = cpaVar5;
                                    List arrayList2 = list == null ? new ArrayList() : list;
                                    arrayList2.add(R);
                                    list = arrayList2;
                                }
                                i6 = i17 + 1;
                                lpaVar4 = lpaVar;
                                cpaVar4 = cpaVar2;
                                size = i54;
                                i53 = i16;
                            }
                            cpa cpaVar6 = cpaVar4;
                            int i55 = i53;
                            lpa lpaVar5 = lpaVar4;
                            if (list == null) {
                                list = km5.a;
                            }
                            List list7 = list;
                            if (W && fpaVar2 != null) {
                                list5 = fpaVar2.m;
                                if (!list5.isEmpty()) {
                                    int size5 = list5.size() - 1;
                                    f = f8;
                                    for (int i56 = -1; i56 < size5; i56 = -1) {
                                        if (((gpa) list5.get(size5)).a > i5 && (size5 == 0 || ((gpa) list5.get(size5 - 1)).a <= i5)) {
                                            gpaVar = (gpa) list5.get(size5);
                                            break;
                                        }
                                        size5--;
                                    }
                                    gpaVar = null;
                                    gpa gpaVar4 = (gpa) CollectionsKt.h0(list5);
                                    hpa hpaVar4 = (hpa) CollectionsKt.j0(vg0Var);
                                    int i57 = hpaVar4 != null ? hpaVar4.a + 1 : 0;
                                    if (gpaVar != null) {
                                        int i58 = gpaVar.a;
                                        i7 = i5;
                                        int min = Math.min(gpaVar4.a, i21 - 1);
                                        if (i58 <= min) {
                                            list3 = null;
                                            while (true) {
                                                list2 = list7;
                                                if (list3 != null) {
                                                    int size6 = list3.size();
                                                    int i59 = 0;
                                                    while (i59 < size6) {
                                                        int i60 = size6;
                                                        gpa[] gpaVarArr3 = ((hpa) list3.get(i59)).b;
                                                        int i61 = i59;
                                                        int length2 = gpaVarArr3.length;
                                                        int i62 = 0;
                                                        while (i62 < length2) {
                                                            int i63 = i62;
                                                            if (gpaVarArr3[i63].a == i58) {
                                                                break;
                                                            }
                                                            i62 = i63 + 1;
                                                        }
                                                        i59 = i61 + 1;
                                                        size6 = i60;
                                                    }
                                                }
                                                if (list3 == null) {
                                                    list3 = new ArrayList();
                                                }
                                                hpa f12 = kn4Var3.f(i57);
                                                i57++;
                                                list3.add(f12);
                                                if (i58 == min) {
                                                    break;
                                                }
                                                i58++;
                                                list7 = list2;
                                            }
                                            if (list3 == null) {
                                                list3 = km5.a;
                                            }
                                            size2 = o.size();
                                            i8 = 0;
                                            while (i8 < size2) {
                                                int intValue2 = ((Number) o.get(i8)).intValue();
                                                if (i7 + 1 > intValue2 || intValue2 >= i21) {
                                                    list4 = o;
                                                    i15 = size2;
                                                } else {
                                                    if (W) {
                                                        int size7 = list3.size();
                                                        int i64 = 0;
                                                        while (i64 < size7) {
                                                            list4 = o;
                                                            gpa[] gpaVarArr4 = ((hpa) list3.get(i64)).b;
                                                            i15 = size2;
                                                            int length3 = gpaVarArr4.length;
                                                            int i65 = 0;
                                                            while (i65 < length3) {
                                                                int i66 = i65;
                                                                if (gpaVarArr4[i66].a != intValue2) {
                                                                    i65 = i66 + 1;
                                                                }
                                                            }
                                                            i64++;
                                                            size2 = i15;
                                                            o = list4;
                                                        }
                                                    }
                                                    list4 = o;
                                                    i15 = size2;
                                                    int e2 = lpaVar5.e(intValue2, lpaVar5.i);
                                                    cpaVar = cpaVar6;
                                                    gpa R2 = cpaVar.R(intValue2, 0, e2, cpaVar6.e, kn4Var3.a(0, e2));
                                                    if (list6 == null) {
                                                        list6 = new ArrayList();
                                                    }
                                                    List list8 = list6;
                                                    list8.add(R2);
                                                    list6 = list8;
                                                    i8++;
                                                    size2 = i15;
                                                    cpaVar6 = cpaVar;
                                                    o = list4;
                                                }
                                                cpaVar = cpaVar6;
                                                i8++;
                                                size2 = i15;
                                                cpaVar6 = cpaVar;
                                                o = list4;
                                            }
                                            cpa cpaVar7 = cpaVar6;
                                            if (list6 == null) {
                                                list6 = km5.a;
                                            }
                                            List list9 = list6;
                                            if (e03 <= 0 || i33 < 0) {
                                                size3 = vg0Var.size();
                                                i9 = i4;
                                                hpaVar = hpaVar2;
                                                i10 = 0;
                                                while (i10 < size3) {
                                                    int i67 = ((hpa) vg0Var.get(i10)).g;
                                                    if (i9 == 0 || i67 > i9 || i10 == vg0Var.size() - 1) {
                                                        break;
                                                    }
                                                    i9 -= i67;
                                                    i10++;
                                                    hpaVar = (hpa) vg0Var.get(i10);
                                                }
                                            } else {
                                                i9 = i4;
                                                hpaVar = hpaVar2;
                                            }
                                            int h2 = an3.h(i20);
                                            int f13 = cn3.f(i40, i20);
                                            List list10 = vg0Var;
                                            if (!list3.isEmpty()) {
                                                list10 = CollectionsKt.w0(list3, vg0Var);
                                            }
                                            z2 = i40 < Math.min(f13, g);
                                            if (z2 && i52 != 0) {
                                                u3a.c("non-zero firstLineScrollOffset");
                                            }
                                            size4 = list10.size();
                                            i11 = 0;
                                            int i68 = 0;
                                            while (i11 < size4) {
                                                i68 += ((hpa) list10.get(i11)).b.length;
                                                i11++;
                                                i40 = i40;
                                            }
                                            i12 = i40;
                                            ArrayList arrayList3 = new ArrayList(i68);
                                            if (z2) {
                                                if (!list2.isEmpty() || !list9.isEmpty()) {
                                                    u3a.a("no items");
                                                }
                                                int size8 = list10.size();
                                                int[] iArr = new int[size8];
                                                for (int i69 = 0; i69 < size8; i69++) {
                                                    iArr[i69] = ((hpa) list10.get(i69)).f;
                                                }
                                                int[] iArr2 = new int[size8];
                                                pg0Var.b(wqaVar, f13, iArr, iArr2);
                                                IntRange B = ph0.B(iArr2);
                                                int i70 = B.a;
                                                int i71 = B.b;
                                                int i72 = B.c;
                                                if ((i72 > 0 && i70 <= i71) || (i72 < 0 && i71 <= i70)) {
                                                    while (true) {
                                                        int i73 = i72;
                                                        gpa[] a = ((hpa) list10.get(i70)).a(iArr2[i70], h2, f13);
                                                        int length4 = a.length;
                                                        int i74 = 0;
                                                        while (i74 < length4) {
                                                            int i75 = i74;
                                                            arrayList3.add(a[i75]);
                                                            i74 = i75 + 1;
                                                        }
                                                        if (i70 == i71) {
                                                            break;
                                                        }
                                                        i70 += i73;
                                                        i72 = i73;
                                                    }
                                                }
                                                i13 = i21;
                                                f2 = f;
                                            } else {
                                                int size9 = list2.size() - 1;
                                                if (size9 >= 0) {
                                                    int i76 = i52;
                                                    while (true) {
                                                        int i77 = size9 - 1;
                                                        gpa gpaVar5 = (gpa) list2.get(size9);
                                                        i76 -= gpaVar5.o;
                                                        i13 = i21;
                                                        gpaVar5.a(i76, 0, h2, f13);
                                                        arrayList3.add(gpaVar5);
                                                        if (i77 < 0) {
                                                            break;
                                                        }
                                                        size9 = i77;
                                                        i21 = i13;
                                                    }
                                                } else {
                                                    i13 = i21;
                                                }
                                                int size10 = list10.size();
                                                int i78 = i52;
                                                int i79 = 0;
                                                List list11 = list10;
                                                while (i79 < size10) {
                                                    hpa hpaVar5 = (hpa) list11.get(i79);
                                                    List list12 = list11;
                                                    gpa[] a2 = hpaVar5.a(i78, h2, f13);
                                                    int i80 = size10;
                                                    int length5 = a2.length;
                                                    int i81 = 0;
                                                    while (i81 < length5) {
                                                        int i82 = i81;
                                                        arrayList3.add(a2[i82]);
                                                        i81 = i82 + 1;
                                                    }
                                                    i78 += hpaVar5.g;
                                                    i79++;
                                                    list11 = list12;
                                                    size10 = i80;
                                                }
                                                int size11 = list9.size();
                                                for (int i83 = 0; i83 < size11; i83++) {
                                                    gpa gpaVar6 = (gpa) list9.get(i83);
                                                    gpaVar6.a(i78, 0, h2, f13);
                                                    arrayList3.add(gpaVar6);
                                                    i78 += gpaVar6.o;
                                                }
                                                f2 = f;
                                            }
                                            int i84 = i9;
                                            rqaVar.d((int) f2, h2, f13, arrayList3, cVar, cpaVar7, true, W, length, z3, i84, i12, ku3Var, k29Var);
                                            if (!W) {
                                                long b2 = rqaVar.b();
                                                if (!c7a.a(b2, 0L)) {
                                                    h2 = cn3.g(Math.max(h2, (int) (b2 >> 32)), i20);
                                                    int f14 = cn3.f(Math.max(f13, (int) (b2 & 4294967295L)), i20);
                                                    if (f14 != f13) {
                                                        int size12 = arrayList3.size();
                                                        for (int i85 = 0; i85 < size12; i85++) {
                                                            gpa gpaVar7 = (gpa) arrayList3.get(i85);
                                                            gpaVar7.p = f14;
                                                            gpaVar7.r = gpaVar7.f + f14;
                                                        }
                                                    }
                                                    i14 = f14;
                                                    int i86 = h2;
                                                    zoaVar2.b.getClass();
                                                    int i87 = i7;
                                                    List p = hda.p(this.h, i55, i87, arrayList3, m6a.a, e03, i86, i14, new uf8(17, kn4Var3, cpaVar7));
                                                    boolean z6 = i87 == i13 + (-1) || i12 > g;
                                                    epa epaVar = new epa(e1dVar2, arrayList3, p, W, 0);
                                                    int g4 = cn3.g(i86 + i18, j);
                                                    int f15 = cn3.f(i14 + e04, j);
                                                    lm5 lm5Var2 = lm5.a;
                                                    lm5Var2.getClass();
                                                    fpaVar = new fpa(hpaVar, i84, z6, f2, yjiVar.v0(g4, f15, lm5Var2, epaVar), f11, z, ku3Var, wqaVar, length, uf8Var, idaVar3, n9e.N(i55, i87, arrayList3, p), i28, i, i13, ewd.a, i34, i33);
                                                }
                                            }
                                            i14 = f13;
                                            int i862 = h2;
                                            zoaVar2.b.getClass();
                                            int i872 = i7;
                                            List p2 = hda.p(this.h, i55, i872, arrayList3, m6a.a, e03, i862, i14, new uf8(17, kn4Var3, cpaVar7));
                                            if (i872 == i13 + (-1)) {
                                            }
                                            epa epaVar2 = new epa(e1dVar2, arrayList3, p2, W, 0);
                                            int g42 = cn3.g(i862 + i18, j);
                                            int f152 = cn3.f(i14 + e04, j);
                                            lm5 lm5Var22 = lm5.a;
                                            lm5Var22.getClass();
                                            fpaVar = new fpa(hpaVar, i84, z6, f2, yjiVar.v0(g42, f152, lm5Var22, epaVar2), f11, z, ku3Var, wqaVar, length, uf8Var, idaVar3, n9e.N(i55, i872, arrayList3, p2), i28, i, i13, ewd.a, i34, i33);
                                        } else {
                                            list2 = list7;
                                            list3 = null;
                                            if (list3 == null) {
                                            }
                                            size2 = o.size();
                                            i8 = 0;
                                            while (i8 < size2) {
                                            }
                                            cpa cpaVar72 = cpaVar6;
                                            if (list6 == null) {
                                            }
                                            List list92 = list6;
                                            if (e03 <= 0) {
                                            }
                                            size3 = vg0Var.size();
                                            i9 = i4;
                                            hpaVar = hpaVar2;
                                            i10 = 0;
                                            while (i10 < size3) {
                                            }
                                            int h22 = an3.h(i20);
                                            int f132 = cn3.f(i40, i20);
                                            List list102 = vg0Var;
                                            if (!list3.isEmpty()) {
                                            }
                                            if (i40 < Math.min(f132, g)) {
                                            }
                                            if (z2) {
                                                u3a.c("non-zero firstLineScrollOffset");
                                            }
                                            size4 = list102.size();
                                            i11 = 0;
                                            int i682 = 0;
                                            while (i11 < size4) {
                                            }
                                            i12 = i40;
                                            ArrayList arrayList32 = new ArrayList(i682);
                                            if (z2) {
                                            }
                                            int i842 = i9;
                                            rqaVar.d((int) f2, h22, f132, arrayList32, cVar, cpaVar72, true, W, length, z3, i842, i12, ku3Var, k29Var);
                                            if (!W) {
                                            }
                                            i14 = f132;
                                            int i8622 = h22;
                                            zoaVar2.b.getClass();
                                            int i8722 = i7;
                                            List p22 = hda.p(this.h, i55, i8722, arrayList32, m6a.a, e03, i8622, i14, new uf8(17, kn4Var3, cpaVar72));
                                            if (i8722 == i13 + (-1)) {
                                            }
                                            epa epaVar22 = new epa(e1dVar2, arrayList32, p22, W, 0);
                                            int g422 = cn3.g(i8622 + i18, j);
                                            int f1522 = cn3.f(i14 + e04, j);
                                            lm5 lm5Var222 = lm5.a;
                                            lm5Var222.getClass();
                                            fpaVar = new fpa(hpaVar, i842, z6, f2, yjiVar.v0(g422, f1522, lm5Var222, epaVar22), f11, z, ku3Var, wqaVar, length, uf8Var, idaVar3, n9e.N(i55, i8722, arrayList32, p22), i28, i, i13, ewd.a, i34, i33);
                                        }
                                    } else {
                                        list2 = list7;
                                        i7 = i5;
                                        list3 = null;
                                        if (list3 == null) {
                                        }
                                        size2 = o.size();
                                        i8 = 0;
                                        while (i8 < size2) {
                                        }
                                        cpa cpaVar722 = cpaVar6;
                                        if (list6 == null) {
                                        }
                                        List list922 = list6;
                                        if (e03 <= 0) {
                                        }
                                        size3 = vg0Var.size();
                                        i9 = i4;
                                        hpaVar = hpaVar2;
                                        i10 = 0;
                                        while (i10 < size3) {
                                        }
                                        int h222 = an3.h(i20);
                                        int f1322 = cn3.f(i40, i20);
                                        List list1022 = vg0Var;
                                        if (!list3.isEmpty()) {
                                        }
                                        if (i40 < Math.min(f1322, g)) {
                                        }
                                        if (z2) {
                                        }
                                        size4 = list1022.size();
                                        i11 = 0;
                                        int i6822 = 0;
                                        while (i11 < size4) {
                                        }
                                        i12 = i40;
                                        ArrayList arrayList322 = new ArrayList(i6822);
                                        if (z2) {
                                        }
                                        int i8422 = i9;
                                        rqaVar.d((int) f2, h222, f1322, arrayList322, cVar, cpaVar722, true, W, length, z3, i8422, i12, ku3Var, k29Var);
                                        if (!W) {
                                        }
                                        i14 = f1322;
                                        int i86222 = h222;
                                        zoaVar2.b.getClass();
                                        int i87222 = i7;
                                        List p222 = hda.p(this.h, i55, i87222, arrayList322, m6a.a, e03, i86222, i14, new uf8(17, kn4Var3, cpaVar722));
                                        if (i87222 == i13 + (-1)) {
                                        }
                                        epa epaVar222 = new epa(e1dVar2, arrayList322, p222, W, 0);
                                        int g4222 = cn3.g(i86222 + i18, j);
                                        int f15222 = cn3.f(i14 + e04, j);
                                        lm5 lm5Var2222 = lm5.a;
                                        lm5Var2222.getClass();
                                        fpaVar = new fpa(hpaVar, i8422, z6, f2, yjiVar.v0(g4222, f15222, lm5Var2222, epaVar222), f11, z, ku3Var, wqaVar, length, uf8Var, idaVar3, n9e.N(i55, i87222, arrayList322, p222), i28, i, i13, ewd.a, i34, i33);
                                    }
                                }
                            }
                            list2 = list7;
                            f = f8;
                            i7 = i5;
                            list3 = null;
                            if (list3 == null) {
                            }
                            size2 = o.size();
                            i8 = 0;
                            while (i8 < size2) {
                            }
                            cpa cpaVar7222 = cpaVar6;
                            if (list6 == null) {
                            }
                            List list9222 = list6;
                            if (e03 <= 0) {
                            }
                            size3 = vg0Var.size();
                            i9 = i4;
                            hpaVar = hpaVar2;
                            i10 = 0;
                            while (i10 < size3) {
                            }
                            int h2222 = an3.h(i20);
                            int f13222 = cn3.f(i40, i20);
                            List list10222 = vg0Var;
                            if (!list3.isEmpty()) {
                            }
                            if (i40 < Math.min(f13222, g)) {
                            }
                            if (z2) {
                            }
                            size4 = list10222.size();
                            i11 = 0;
                            int i68222 = 0;
                            while (i11 < size4) {
                            }
                            i12 = i40;
                            ArrayList arrayList3222 = new ArrayList(i68222);
                            if (z2) {
                            }
                            int i84222 = i9;
                            rqaVar.d((int) f2, h2222, f13222, arrayList3222, cVar, cpaVar7222, true, W, length, z3, i84222, i12, ku3Var, k29Var);
                            if (!W) {
                            }
                            i14 = f13222;
                            int i862222 = h2222;
                            zoaVar2.b.getClass();
                            int i872222 = i7;
                            List p2222 = hda.p(this.h, i55, i872222, arrayList3222, m6a.a, e03, i862222, i14, new uf8(17, kn4Var3, cpaVar7222));
                            if (i872222 == i13 + (-1)) {
                            }
                            epa epaVar2222 = new epa(e1dVar2, arrayList3222, p2222, W, 0);
                            int g42222 = cn3.g(i862222 + i18, j);
                            int f152222 = cn3.f(i14 + e04, j);
                            lm5 lm5Var22222 = lm5.a;
                            lm5Var22222.getClass();
                            fpaVar = new fpa(hpaVar, i84222, z6, f2, yjiVar.v0(g42222, f152222, lm5Var22222, epaVar2222), f11, z, ku3Var, wqaVar, length, uf8Var, idaVar3, n9e.N(i55, i872222, arrayList3222, p2222), i28, i, i13, ewd.a, i34, i33);
                        }
                    } else {
                        i4 = i3;
                    }
                    i5 = 0;
                    size = o.size();
                    list = null;
                    i6 = 0;
                    while (i6 < size) {
                    }
                    cpa cpaVar62 = cpaVar4;
                    int i552 = i53;
                    lpa lpaVar52 = lpaVar4;
                    if (list == null) {
                    }
                    List list72 = list;
                    if (W) {
                        list5 = fpaVar2.m;
                        if (!list5.isEmpty()) {
                        }
                    }
                    list2 = list72;
                    f = f8;
                    i7 = i5;
                    list3 = null;
                    if (list3 == null) {
                    }
                    size2 = o.size();
                    i8 = 0;
                    while (i8 < size2) {
                    }
                    cpa cpaVar72222 = cpaVar62;
                    if (list6 == null) {
                    }
                    List list92222 = list6;
                    if (e03 <= 0) {
                    }
                    size3 = vg0Var.size();
                    i9 = i4;
                    hpaVar = hpaVar2;
                    i10 = 0;
                    while (i10 < size3) {
                    }
                    int h22222 = an3.h(i20);
                    int f132222 = cn3.f(i40, i20);
                    List list102222 = vg0Var;
                    if (!list3.isEmpty()) {
                    }
                    if (i40 < Math.min(f132222, g)) {
                    }
                    if (z2) {
                    }
                    size4 = list102222.size();
                    i11 = 0;
                    int i682222 = 0;
                    while (i11 < size4) {
                    }
                    i12 = i40;
                    ArrayList arrayList32222 = new ArrayList(i682222);
                    if (z2) {
                    }
                    int i842222 = i9;
                    rqaVar.d((int) f2, h22222, f132222, arrayList32222, cVar, cpaVar72222, true, W, length, z3, i842222, i12, ku3Var, k29Var);
                    if (!W) {
                    }
                    i14 = f132222;
                    int i8622222 = h22222;
                    zoaVar2.b.getClass();
                    int i8722222 = i7;
                    List p22222 = hda.p(this.h, i552, i8722222, arrayList32222, m6a.a, e03, i8622222, i14, new uf8(17, kn4Var3, cpaVar72222));
                    if (i8722222 == i13 + (-1)) {
                    }
                    epa epaVar22222 = new epa(e1dVar2, arrayList32222, p22222, W, 0);
                    int g422222 = cn3.g(i8622222 + i18, j);
                    int f1522222 = cn3.f(i14 + e04, j);
                    lm5 lm5Var222222 = lm5.a;
                    lm5Var222222.getClass();
                    fpaVar = new fpa(hpaVar, i842222, z6, f2, yjiVar.v0(g422222, f1522222, lm5Var222222, epaVar22222), f11, z, ku3Var, wqaVar, length, uf8Var, idaVar3, n9e.N(i552, i8722222, arrayList32222, p22222), i28, i, i13, ewd.a, i34, i33);
                }
                qpa qpaVar3 = qpaVar;
                qpaVar3.f(fpaVar, yjiVar.W(), false);
                qq4 qq4Var = qpaVar3.a;
                return fpaVar;
            }
            c = lpaVar2.c(C2);
            h = ipaVar.c.h();
            Unit unit4 = Unit.a;
            bea.K(w, C, function1);
            List o2 = yaa.o(zoaVar, qpaVar2.q, qpaVar2.n);
            if (yjiVar2.W()) {
            }
            rqa rqaVar2 = qpaVar2.m;
            boolean W2 = yjiVar2.W();
            fpa fpaVar22 = qpaVar2.c;
            e1d e1dVar22 = qpaVar2.r;
            if (e03 < 0) {
            }
            if (i19 < 0) {
            }
            ku3 ku3Var2 = this.f;
            k29 k29Var2 = this.g;
            float f32 = floatValue;
            int i222 = h;
            if (i21 > 0) {
            }
            qpa qpaVar32 = qpaVar;
            qpaVar32.f(fpaVar, yjiVar.W(), false);
            qq4 qq4Var2 = qpaVar32.a;
            return fpaVar;
        } catch (Throwable th) {
            bea.K(w, C, function1);
            throw th;
        }
    }
}
