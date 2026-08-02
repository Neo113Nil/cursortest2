package defpackage;

import android.os.Trace;
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
public final class q5e implements vqa {
    public final /* synthetic */ a6e a;
    public final /* synthetic */ ewd b;
    public final /* synthetic */ p3e c;
    public final /* synthetic */ float d;
    public final /* synthetic */ e5e e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ lv1 h;
    public final /* synthetic */ fo i;
    public final /* synthetic */ int j;
    public final /* synthetic */ lnh k;
    public final /* synthetic */ ku3 l;

    public q5e(a6e a6eVar, ewd ewdVar, p3e p3eVar, float f, e5e e5eVar, KProperty0 kProperty0, Function0 function0, lv1 lv1Var, fo foVar, int i, lnh lnhVar, ku3 ku3Var) {
        this.a = a6eVar;
        this.b = ewdVar;
        this.c = p3eVar;
        this.d = f;
        this.e = e5eVar;
        this.f = kProperty0;
        this.g = function0;
        this.h = lv1Var;
        this.i = foVar;
        this.j = i;
        this.k = lnhVar;
        this.l = ku3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v57, types: [km5] */
    /* JADX WARN: Type inference failed for: r0v99 */
    /* JADX WARN: Type inference failed for: r2v40, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v52, types: [km5] */
    @Override // defpackage.vqa
    public final l1c a(wqa wqaVar, long j) {
        ewd ewdVar;
        int i;
        ewd ewdVar2;
        int i2;
        int i3;
        lv1 lv1Var;
        a6e a6eVar;
        fo foVar;
        a6e a6eVar2;
        int i4;
        int i5;
        int i6;
        long j2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        n1c n1cVar;
        int i18;
        int i19;
        vg0 vg0Var;
        int i20;
        int i21;
        ArrayList arrayList;
        int i22;
        int i23;
        int i24;
        List list;
        int i25;
        int i26;
        ewd ewdVar3;
        int i27;
        n1c n1cVar2;
        int i28;
        yji yjiVar;
        int i29;
        ArrayList arrayList2;
        int i30;
        vg0 vg0Var2;
        ArrayList arrayList3;
        ?? arrayList4;
        ?? arrayList5;
        Object obj;
        int i31;
        lnh lnhVar;
        int i32;
        int i33;
        int i34;
        ArrayList arrayList6;
        List list2;
        r5e r5eVar;
        wqa wqaVar2;
        int[] iArr;
        int i35;
        int i36;
        int i37;
        int i38;
        List list3;
        int i39;
        lv1 lv1Var2;
        n1c n1cVar3;
        long j3;
        List list4;
        int i40;
        vg0 vg0Var3;
        q5e q5eVar = this;
        yji yjiVar2 = wqaVar.b;
        a6e a6eVar3 = q5eVar.a;
        a6eVar3.A.getValue();
        ewd ewdVar4 = ewd.a;
        ewd ewdVar5 = q5eVar.b;
        boolean z = ewdVar5 == ewdVar4;
        n9e.r(j, z ? ewdVar4 : ewd.b);
        p3e p3eVar = q5eVar.c;
        int e0 = z ? yjiVar2.e0(p3eVar.b(yjiVar2.getLayoutDirection())) : yjiVar2.e0(l98.L(p3eVar, yjiVar2.getLayoutDirection()));
        int e02 = z ? yjiVar2.e0(p3eVar.c(yjiVar2.getLayoutDirection())) : yjiVar2.e0(l98.K(p3eVar, yjiVar2.getLayoutDirection()));
        int e03 = yjiVar2.e0(p3eVar.d());
        int e04 = yjiVar2.e0(p3eVar.a()) + e03;
        int i41 = e0 + e02;
        int i42 = z ? e04 : i41;
        if (z) {
            e02 = e03;
        } else if (!z) {
            e02 = e0;
        }
        int i43 = i42 - e02;
        boolean z2 = z;
        long i44 = cn3.i(-i41, -e04, j);
        a6eVar3.n = wqaVar;
        int e05 = yjiVar2.e0(q5eVar.d);
        long j4 = i44;
        int g = z2 ? an3.g(j) - e04 : an3.h(j) - i41;
        long j5 = (e0 << 32) | (e03 & 4294967295L);
        int f = q5eVar.e.f(wqaVar, g);
        int i45 = f < 0 ? 0 : f;
        int i46 = g;
        long j6 = j5;
        cn3.b(0, ewdVar5 == ewdVar4 ? an3.h(j4) : i45, 0, ewdVar5 != ewdVar4 ? an3.g(j4) : i45, 5);
        p5e p5eVar = (p5e) q5eVar.f.invoke();
        int i47 = i46 + e02 + i43;
        lnh lnhVar2 = q5eVar.k;
        nnh w = bea.w();
        Function1 e = w != null ? w.e() : null;
        nnh C = bea.C(w);
        yji yjiVar3 = yjiVar2;
        try {
            int k = a6eVar3.k();
            p5c p5cVar = a6eVar3.d;
            int C2 = nq8.C(k, p5eVar, p5cVar.e);
            if (k != C2) {
                ewdVar = ewdVar4;
                ((znh) p5cVar.c).i(C2);
                ((yqa) p5cVar.f).c(k);
            } else {
                ewdVar = ewdVar4;
            }
            a6eVar3.k();
            float l = a6eVar3.l();
            a6eVar3.n();
            int i48 = i45 + e05;
            int b = wzb.b(lnhVar2.a(i47, i45, e02, i43) - (l * i48));
            Unit unit = Unit.a;
            bea.K(w, C, e);
            List o = yaa.o(p5eVar, a6eVar3.y, a6eVar3.u);
            uzc uzcVar = q6a.a;
            uzc uzcVar2 = new uzc();
            int intValue = ((Number) q5eVar.g.invoke()).intValue();
            e1d e1dVar = a6eVar3.z;
            if (e02 < 0) {
                u3a.a("negative beforeContentPadding");
            }
            if (i43 < 0) {
                u3a.a("negative afterContentPadding");
            }
            int i49 = i48 < 0 ? 0 : i48;
            p5e p5eVar2 = p5eVar;
            int i50 = q5eVar.j;
            if (i50 > intValue) {
                ewdVar2 = ewdVar;
                i = intValue;
            } else {
                ewd ewdVar6 = ewdVar;
                i = i50;
                ewdVar2 = ewdVar6;
            }
            if (ewdVar5 == ewdVar2) {
                i2 = b;
                i3 = an3.h(j4);
            } else {
                i2 = b;
                i3 = i45;
            }
            List list5 = o;
            long b2 = cn3.b(0, i3, 0, ewdVar5 != ewdVar2 ? an3.g(j4) : i45, 5);
            e1d e1dVar2 = e1dVar;
            lnh lnhVar3 = q5eVar.k;
            ku3 ku3Var = q5eVar.l;
            if (intValue <= 0) {
                int j7 = an3.j(j4);
                int i51 = an3.i(j4);
                etd etdVar = new etd(14);
                int g2 = cn3.g(j7 + i41, j);
                int f2 = cn3.f(i51 + e04, j);
                lm5 lm5Var = lm5.a;
                lm5Var.getClass();
                r5eVar = new r5e(km5.a, i45, e05, i43, ewdVar5, -e02, i46 + i43, i, lnhVar3, yjiVar3.v0(g2, f2, lm5Var, etdVar), ku3Var, wqaVar, b2);
                wqaVar2 = wqaVar;
                a6eVar2 = a6eVar3;
            } else {
                a6e a6eVar4 = a6eVar3;
                long j8 = b2;
                int i52 = e05;
                int i53 = i43;
                int i54 = i;
                int i55 = i45;
                int i56 = i47;
                while (C2 > 0 && i2 > 0) {
                    C2--;
                    i2 -= i49;
                }
                int i57 = i2 * (-1);
                if (C2 >= intValue) {
                    C2 = intValue - 1;
                    i57 = 0;
                }
                int i58 = C2;
                vg0 vg0Var4 = new vg0();
                int i59 = -e02;
                int i60 = i59 + (i52 < 0 ? i52 : 0);
                int i61 = i49;
                int i62 = i57 + i60;
                int i63 = 0;
                while (true) {
                    lv1Var = q5eVar.h;
                    a6eVar = a6eVar4;
                    foVar = q5eVar.i;
                    if (i62 >= 0 || i58 <= 0) {
                        break;
                    }
                    i58--;
                    int i64 = i54;
                    int i65 = i56;
                    p5e p5eVar3 = p5eVar2;
                    int i66 = i55;
                    long j9 = j8;
                    int i67 = intValue;
                    long j10 = j6;
                    n1c x = s6a.x(wqaVar, i58, j9, p5eVar3, j10, ewdVar5, foVar, lv1Var, yjiVar3.getLayoutDirection(), i66, uzcVar2);
                    vg0Var4.add(0, x);
                    i63 = Math.max(i63, x.i);
                    i62 += i61;
                    p5eVar2 = p5eVar3;
                    j6 = j10;
                    i55 = i66;
                    i53 = i53;
                    intValue = i67;
                    j8 = j9;
                    e02 = e02;
                    j4 = j4;
                    i52 = i52;
                    i56 = i65;
                    e1dVar2 = e1dVar2;
                    i54 = i64;
                    a6eVar4 = a6eVar;
                    q5eVar = this;
                }
                e1d e1dVar3 = e1dVar2;
                int i68 = i52;
                int i69 = i54;
                lv1 lv1Var3 = lv1Var;
                int i70 = e02;
                int i71 = i56;
                long j11 = j4;
                int i72 = i63;
                int i73 = 0;
                a6eVar2 = a6eVar;
                int i74 = i55;
                long j12 = j8;
                int i75 = i53;
                int i76 = intValue;
                long j13 = j6;
                p5e p5eVar4 = p5eVar2;
                if (i62 < i60) {
                    i62 = i60;
                }
                int i77 = i62 - i60;
                int i78 = i46 + i75;
                int i79 = i78 < 0 ? 0 : i78;
                int i80 = -i77;
                boolean z3 = false;
                int i81 = i72;
                int i82 = i58;
                while (i73 < vg0Var4.size()) {
                    if (i80 >= i79) {
                        vg0Var4.remove(i73);
                        Unit unit2 = Unit.a;
                        z3 = true;
                    } else {
                        i82++;
                        i80 += i61;
                        i73++;
                    }
                }
                int i83 = i76;
                int i84 = i82;
                int i85 = i77;
                int i86 = i80;
                int i87 = i75;
                boolean z4 = z3;
                while (true) {
                    if (i84 >= i83) {
                        i4 = i86;
                        i5 = i87;
                        i6 = i83;
                        j2 = j12;
                        i7 = i81;
                        i8 = i46;
                        break;
                    }
                    if (i86 >= i79 && i86 > 0 && !vg0Var4.isEmpty()) {
                        i4 = i86;
                        i5 = i87;
                        i6 = i83;
                        i8 = i46;
                        j2 = j12;
                        i7 = i81;
                        break;
                    }
                    int i88 = i87;
                    int i89 = i83;
                    int i90 = i86;
                    int i91 = i46;
                    long j14 = j12;
                    int i92 = i81;
                    int i93 = i79;
                    vg0 vg0Var5 = vg0Var4;
                    int i94 = i84;
                    n1c x2 = s6a.x(wqaVar, i94, j14, p5eVar4, j13, ewdVar5, foVar, lv1Var3, yjiVar3.getLayoutDirection(), i74, uzcVar2);
                    int i95 = i89 - 1;
                    int i96 = i90 + (i94 == i95 ? i74 : i61);
                    if (i96 > i60 || i94 == i95) {
                        int max = Math.max(i92, x2.i);
                        vg0Var3 = vg0Var5;
                        vg0Var3.addLast(x2);
                        i81 = max;
                    } else {
                        i85 -= i61;
                        Unit unit3 = Unit.a;
                        i58 = i94 + 1;
                        i81 = i92;
                        vg0Var3 = vg0Var5;
                        z4 = true;
                    }
                    i84 = i94 + 1;
                    vg0Var4 = vg0Var3;
                    i86 = i96;
                    i79 = i93;
                    i46 = i91;
                    j12 = j14;
                    i87 = i88;
                    i83 = i89;
                }
                if (i4 < i8) {
                    int i97 = i8 - i4;
                    int i98 = i4 + i97;
                    int i99 = i7;
                    int i100 = i85 - i97;
                    int i101 = i70;
                    while (i100 < i101 && i58 > 0) {
                        i58--;
                        n1c x3 = s6a.x(wqaVar, i58, j2, p5eVar4, j13, ewdVar5, foVar, lv1Var3, yjiVar3.getLayoutDirection(), i74, uzcVar2);
                        vg0Var4.add(0, x3);
                        i99 = Math.max(i99, x3.i);
                        i100 += i61;
                        i101 = i101;
                        i84 = i84;
                    }
                    i9 = i84;
                    i10 = i101;
                    int i102 = i100;
                    int i103 = i99;
                    if (i102 < 0) {
                        i11 = i103;
                        i13 = i98 + i102;
                        i12 = 0;
                    } else {
                        i11 = i103;
                        i12 = i102;
                        i13 = i98;
                    }
                } else {
                    i9 = i84;
                    i10 = i70;
                    i11 = i7;
                    i12 = i85;
                    i13 = i4;
                }
                if (i12 < 0) {
                    u3a.a("invalid currentFirstPageScrollOffset");
                }
                int i104 = -i12;
                n1c n1cVar4 = (n1c) vg0Var4.first();
                int i105 = i13;
                int i106 = i68;
                if (i10 > 0 || i106 < 0) {
                    int i107 = i12;
                    int size = vg0Var4.size();
                    n1c n1cVar5 = n1cVar4;
                    int i108 = i107;
                    i14 = i104;
                    int i109 = 0;
                    while (i109 < size && i108 != 0) {
                        i15 = i106;
                        int i110 = i61;
                        if (i110 > i108) {
                            i61 = i110;
                            break;
                        }
                        i61 = i110;
                        i16 = 1;
                        if (i109 == vg0Var4.size() - 1) {
                            break;
                        }
                        i108 -= i61;
                        i109++;
                        n1cVar5 = (n1c) vg0Var4.get(i109);
                        i106 = i15;
                    }
                    i15 = i106;
                    i16 = 1;
                    i17 = i108;
                    n1cVar4 = n1cVar5;
                } else {
                    i14 = i104;
                    i15 = i106;
                    i16 = 1;
                    i17 = i12;
                }
                int max2 = Math.max(0, i58 - i69);
                int i111 = i58 - 1;
                if (max2 <= i111) {
                    ArrayList arrayList7 = null;
                    while (true) {
                        if (arrayList7 == null) {
                            arrayList7 = new ArrayList();
                        }
                        i19 = i17;
                        arrayList = arrayList7;
                        n1cVar = n1cVar4;
                        i18 = i8;
                        vg0Var = vg0Var4;
                        i20 = i69;
                        i21 = max2;
                        arrayList.add(s6a.x(wqaVar, i111, j2, p5eVar4, j13, ewdVar5, foVar, lv1Var3, yjiVar3.getLayoutDirection(), i74, uzcVar2));
                        if (i111 == i21) {
                            break;
                        }
                        i111--;
                        max2 = i21;
                        i69 = i20;
                        n1cVar4 = n1cVar;
                        vg0Var4 = vg0Var;
                        i8 = i18;
                        arrayList7 = arrayList;
                        i17 = i19;
                    }
                } else {
                    n1cVar = n1cVar4;
                    i18 = i8;
                    i19 = i17;
                    vg0Var = vg0Var4;
                    i20 = i69;
                    i21 = max2;
                    arrayList = null;
                }
                int size2 = list5.size();
                List list6 = arrayList;
                int i112 = 0;
                while (i112 < size2) {
                    List list7 = list5;
                    int i113 = size2;
                    int intValue2 = ((Number) list7.get(i112)).intValue();
                    if (intValue2 < i21) {
                        if (list6 == null) {
                            list6 = new ArrayList();
                        }
                        list4 = list7;
                        i40 = i21;
                        List list8 = list6;
                        list8.add(s6a.x(wqaVar, intValue2, j2, p5eVar4, j13, ewdVar5, foVar, lv1Var3, yjiVar3.getLayoutDirection(), i74, uzcVar2));
                        list6 = list8;
                    } else {
                        list4 = list7;
                        i40 = i21;
                    }
                    i112++;
                    i21 = i40;
                    size2 = i113;
                    list5 = list4;
                }
                List list9 = list5;
                if (list6 == null) {
                    list6 = km5.a;
                }
                List list10 = list6;
                int size3 = list10.size();
                int i114 = i11;
                for (int i115 = 0; i115 < size3; i115++) {
                    i114 = Math.max(i114, ((n1c) list10.get(i115)).i);
                }
                int i116 = ((n1c) vg0Var.last()).a;
                int min = Math.min(i20, (i6 - i116) - 1) + i116;
                int i117 = i116 + 1;
                if (i117 <= min) {
                    List list11 = null;
                    while (true) {
                        if (list11 == null) {
                            list11 = new ArrayList();
                        }
                        i22 = i114;
                        i23 = i20;
                        i24 = min;
                        list = list11;
                        int i118 = i117;
                        list.add(s6a.x(wqaVar, i118, j2, p5eVar4, j13, ewdVar5, foVar, lv1Var3, yjiVar3.getLayoutDirection(), i74, uzcVar2));
                        if (i118 == i24) {
                            break;
                        }
                        i117 = i118 + 1;
                        min = i24;
                        list11 = list;
                        i114 = i22;
                        i20 = i23;
                    }
                } else {
                    i22 = i114;
                    i23 = i20;
                    i24 = min;
                    list = null;
                }
                int size4 = list9.size();
                List list12 = list;
                int i119 = 0;
                while (i119 < size4) {
                    List list13 = list9;
                    int i120 = size4;
                    int intValue3 = ((Number) list13.get(i119)).intValue();
                    List list14 = list12;
                    if (i24 + 1 <= intValue3) {
                        int i121 = i6;
                        if (intValue3 < i121) {
                            if (list14 == null) {
                                list14 = new ArrayList();
                            }
                            i37 = i24;
                            List list15 = list14;
                            i35 = i119;
                            i38 = i120;
                            i36 = i121;
                            list3 = list13;
                            n1c x4 = s6a.x(wqaVar, intValue3, j2, p5eVar4, j13, ewdVar5, foVar, lv1Var3, yjiVar3.getLayoutDirection(), i74, uzcVar2);
                            i39 = i19;
                            long j15 = j2;
                            lv1Var2 = lv1Var3;
                            n1cVar3 = n1cVar;
                            j3 = j15;
                            list15.add(x4);
                            list12 = list15;
                            i6 = i36;
                            i24 = i37;
                            size4 = i38;
                            i119 = i35 + 1;
                            list9 = list3;
                            n1c n1cVar6 = n1cVar3;
                            lv1Var3 = lv1Var2;
                            j2 = j3;
                            n1cVar = n1cVar6;
                            i19 = i39;
                        } else {
                            i35 = i119;
                            i36 = i121;
                        }
                    } else {
                        i35 = i119;
                        i36 = i6;
                    }
                    i37 = i24;
                    i38 = i120;
                    list3 = list13;
                    i39 = i19;
                    long j16 = j2;
                    lv1Var2 = lv1Var3;
                    n1cVar3 = n1cVar;
                    j3 = j16;
                    list12 = list14;
                    i6 = i36;
                    i24 = i37;
                    size4 = i38;
                    i119 = i35 + 1;
                    list9 = list3;
                    n1c n1cVar62 = n1cVar3;
                    lv1Var3 = lv1Var2;
                    j2 = j3;
                    n1cVar = n1cVar62;
                    i19 = i39;
                }
                int i122 = i6;
                List list16 = list12;
                n1c n1cVar7 = n1cVar;
                int i123 = i19;
                long j17 = j2;
                List list17 = list16 == null ? km5.a : list16;
                int size5 = list17.size();
                int i124 = i22;
                for (int i125 = 0; i125 < size5; i125++) {
                    i124 = Math.max(i124, ((n1c) list17.get(i125)).i);
                }
                int i126 = (Intrinsics.c(n1cVar7, vg0Var.first()) && list10.isEmpty() && list17.isEmpty()) ? i16 : 0;
                ewd ewdVar7 = ewd.a;
                int g3 = cn3.g(ewdVar5 == ewdVar7 ? i124 : i105, j11);
                if (ewdVar5 == ewdVar7) {
                    i124 = i105;
                }
                int f3 = cn3.f(i124, j11);
                int i127 = ewdVar5 == ewdVar7 ? f3 : g3;
                int i128 = i18;
                int i129 = i105 < Math.min(i127, i128) ? i16 : 0;
                if (i129 == 0 || i14 == 0) {
                    i25 = i128;
                    i26 = i14;
                } else {
                    i25 = i128;
                    StringBuilder sb = new StringBuilder("non-zero pagesScrollOffset=");
                    i26 = i14;
                    sb.append(i26);
                    u3a.c(sb.toString());
                }
                int i130 = i26;
                ArrayList arrayList8 = new ArrayList(list17.size() + list10.size() + vg0Var.size());
                if (i129 != 0) {
                    if (!list10.isEmpty() || !list17.isEmpty()) {
                        u3a.a("No extra pages");
                    }
                    int size6 = vg0Var.size();
                    int[] iArr2 = new int[size6];
                    for (int i131 = 0; i131 < size6; i131++) {
                        iArr2[i131] = i74;
                    }
                    int[] iArr3 = new int[size6];
                    i27 = i126;
                    n1cVar2 = n1cVar7;
                    ng0 ng0Var = new ng0(yjiVar3.C0(i15), false, null);
                    if (ewdVar5 == ewd.a) {
                        ng0Var.b(wqaVar, i127, iArr2, iArr3);
                        iArr = iArr3;
                        arrayList2 = arrayList8;
                        i29 = i25;
                        i28 = i123;
                        i30 = i105;
                        ewdVar3 = ewdVar5;
                        yjiVar = yjiVar3;
                    } else {
                        iArr = iArr3;
                        arrayList2 = arrayList8;
                        i29 = i25;
                        i28 = i123;
                        i30 = i105;
                        ewdVar3 = ewdVar5;
                        yjiVar = yjiVar3;
                        ng0Var.j(wqaVar, i127, iArr2, ema.a, iArr);
                    }
                    IntRange B = ph0.B(iArr);
                    int i132 = B.b;
                    int i133 = B.c;
                    if ((i133 > 0 && i132 >= 0) || (i133 < 0 && i132 <= 0)) {
                        int i134 = 0;
                        while (true) {
                            int i135 = iArr[i134];
                            vg0Var2 = vg0Var;
                            int i136 = i133;
                            n1c n1cVar8 = (n1c) vg0Var2.get(i134);
                            n1cVar8.b(i135, g3, f3);
                            arrayList2.add(n1cVar8);
                            if (i134 == i132) {
                                break;
                            }
                            i134 += i136;
                            i133 = i136;
                            vg0Var = vg0Var2;
                        }
                    } else {
                        vg0Var2 = vg0Var;
                    }
                } else {
                    ewdVar3 = ewdVar5;
                    i27 = i126;
                    n1cVar2 = n1cVar7;
                    i28 = i123;
                    yjiVar = yjiVar3;
                    i29 = i25;
                    arrayList2 = arrayList8;
                    i30 = i105;
                    vg0Var2 = vg0Var;
                    int size7 = list10.size();
                    int i137 = i130;
                    for (int i138 = 0; i138 < size7; i138++) {
                        n1c n1cVar9 = (n1c) list10.get(i138);
                        i137 -= i48;
                        n1cVar9.b(i137, g3, f3);
                        arrayList2.add(n1cVar9);
                    }
                    int size8 = vg0Var2.size();
                    int i139 = i130;
                    for (int i140 = 0; i140 < size8; i140++) {
                        n1c n1cVar10 = (n1c) vg0Var2.get(i140);
                        n1cVar10.b(i139, g3, f3);
                        arrayList2.add(n1cVar10);
                        i139 += i48;
                    }
                    int size9 = list17.size();
                    for (int i141 = 0; i141 < size9; i141++) {
                        n1c n1cVar11 = (n1c) list17.get(i141);
                        n1cVar11.b(i139, g3, f3);
                        arrayList2.add(n1cVar11);
                        i139 += i48;
                    }
                }
                if (i27 != 0) {
                    arrayList3 = arrayList2;
                } else {
                    ArrayList arrayList9 = new ArrayList(arrayList2.size());
                    int size10 = arrayList2.size();
                    int i142 = 0;
                    while (i142 < size10) {
                        Object obj2 = arrayList2.get(i142);
                        n1c n1cVar12 = (n1c) obj2;
                        int i143 = size10;
                        int i144 = i142;
                        if (n1cVar12.a >= ((n1c) vg0Var2.first()).a && n1cVar12.a <= ((n1c) vg0Var2.last()).a) {
                            arrayList9.add(obj2);
                        }
                        i142 = i144 + 1;
                        size10 = i143;
                    }
                    arrayList3 = arrayList9;
                }
                if (list10.isEmpty()) {
                    arrayList4 = km5.a;
                } else {
                    arrayList4 = new ArrayList(arrayList2.size());
                    int size11 = arrayList2.size();
                    int i145 = 0;
                    while (i145 < size11) {
                        Object obj3 = arrayList2.get(i145);
                        int i146 = size11;
                        if (((n1c) obj3).a < ((n1c) vg0Var2.first()).a) {
                            arrayList4.add(obj3);
                        }
                        i145++;
                        size11 = i146;
                    }
                }
                if (list17.isEmpty()) {
                    arrayList5 = km5.a;
                } else {
                    arrayList5 = new ArrayList(arrayList2.size());
                    int size12 = arrayList2.size();
                    int i147 = 0;
                    arrayList4 = arrayList4;
                    while (i147 < size12) {
                        Object obj4 = arrayList2.get(i147);
                        Object obj5 = arrayList4;
                        if (((n1c) obj4).a > ((n1c) vg0Var2.last()).a) {
                            arrayList5.add(obj4);
                        }
                        i147++;
                        arrayList4 = obj5;
                    }
                }
                List list18 = arrayList4;
                if (arrayList3.isEmpty()) {
                    arrayList6 = arrayList3;
                    list2 = arrayList5;
                    i31 = f3;
                    lnhVar = lnhVar3;
                    i32 = i10;
                    i33 = i71;
                    i34 = i5;
                    obj = null;
                } else {
                    obj = arrayList3.get(0);
                    i31 = f3;
                    lnhVar = lnhVar3;
                    i32 = i10;
                    i33 = i71;
                    i34 = i5;
                    float f4 = -Math.abs(((n1c) obj).k - lnhVar.a(i33, i74, i32, i34));
                    int size13 = arrayList3.size() - 1;
                    int i148 = i16;
                    if (i148 <= size13) {
                        Object obj6 = obj;
                        float f5 = f4;
                        List list19 = arrayList5;
                        while (true) {
                            Object obj7 = arrayList3.get(i148);
                            arrayList6 = arrayList3;
                            list2 = list19;
                            float f6 = -Math.abs(((n1c) obj7).k - lnhVar.a(i33, i74, i32, i34));
                            if (Float.compare(f5, f6) < 0) {
                                f5 = f6;
                                obj6 = obj7;
                            }
                            if (i148 == size13) {
                                break;
                            }
                            i148++;
                            arrayList3 = arrayList6;
                            list19 = list2;
                        }
                        obj = obj6;
                    } else {
                        arrayList6 = arrayList3;
                        list2 = arrayList5;
                    }
                }
                n1c n1cVar13 = (n1c) obj;
                float b3 = i61 == 0 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : llf.b((lnhVar.a(i33, i74, i32, i34) - (n1cVar13 != null ? n1cVar13.k : 0)) / i61, -0.5f, 0.5f);
                ord ordVar = new ord(9, e1dVar3, arrayList2);
                int g4 = cn3.g(g3 + i41, j);
                int f7 = cn3.f(i31 + e04, j);
                lm5 lm5Var2 = lm5.a;
                lm5Var2.getClass();
                l1c v0 = yjiVar.v0(g4, f7, lm5Var2, ordVar);
                yjiVar3 = yjiVar;
                r5eVar = new r5e(arrayList6, i74, i15, i34, ewdVar3, i59, i78, i23, n1cVar2, n1cVar13, b3, i28, i9 < i122 || i30 > i29, lnhVar, v0, z4, list18, list2, ku3Var, wqaVar, j17);
                wqaVar2 = wqaVar;
            }
            a6e a6eVar5 = a6eVar2;
            a6eVar5.h(r5eVar, yjiVar3.W(), false);
            j5e j5eVar = a6eVar5.t;
            List list20 = r5eVar.a;
            Trace.beginSection("compose:pager:cache_window:keepAroundItems");
            try {
                if (j5eVar.b() && !list20.isEmpty()) {
                    int i149 = ((n1c) CollectionsKt.Y(list20)).a;
                    int i150 = ((n1c) CollectionsKt.h0(list20)).a;
                    for (int i151 = j5eVar.h; i151 < i149; i151++) {
                        wqaVar2.a(i151);
                    }
                    int i152 = i150 + 1;
                    int i153 = j5eVar.i;
                    if (i152 <= i153) {
                        while (true) {
                            wqaVar2.a(i152);
                            if (i152 == i153) {
                                break;
                            }
                            i152++;
                        }
                    }
                }
                Unit unit4 = Unit.a;
                return r5eVar;
            } finally {
                Trace.endSection();
            }
        } catch (Throwable th) {
            bea.K(w, C, e);
            throw th;
        }
    }
}
