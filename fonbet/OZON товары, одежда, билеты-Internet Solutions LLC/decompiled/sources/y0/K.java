package y0;

import S0.InterfaceC3978p0;
import androidx.compose.foundation.layout.C5179b;
import e1.d;
import fd.InterfaceC6511n;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C7704k;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import r0.EnumC9142v;
import s0.InterfaceC9574q;
import x0.InterfaceC10573B;

/* loaded from: classes8.dex */
public final class K {
    /* JADX INFO: Access modifiers changed from: private */
    public static final C10806m b(InterfaceC10573B interfaceC10573B, int i11, long j11, F f7, long j12, EnumC9142v enumC9142v, d.a aVar, d.b bVar, Z1.s sVar, int i12) {
        return new C10806m(i11, i12, interfaceC10573B.Z(i11, j11), j12, f7.d(i11), enumC9142v, aVar, bVar, sVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v18, types: [kotlin.collections.K] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r16v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v28, types: [kotlin.collections.K] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v9 */
    @NotNull
    public static final N c(@NotNull InterfaceC10573B interfaceC10573B, int i11, @NotNull F f7, int i12, int i13, int i14, int i15, int i16, int i17, long j11, @NotNull EnumC9142v enumC9142v, d.b bVar, d.a aVar, long j12, int i18, int i19, @NotNull List list, @NotNull InterfaceC9574q.a aVar2, @NotNull InterfaceC3978p0 interfaceC3978p0, @NotNull xe.M m11, @NotNull InterfaceC6511n interfaceC6511n) {
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        C7704k c7704k;
        int i36;
        C10806m c10806m;
        int i37;
        List list2;
        ArrayList arrayList;
        ?? arrayList2;
        List arrayList3;
        int i38;
        Object obj;
        boolean z11;
        float d11;
        int i39;
        if (i13 < 0) {
            throw new IllegalArgumentException("negative beforeContentPadding");
        }
        if (i14 < 0) {
            throw new IllegalArgumentException("negative afterContentPadding");
        }
        int i41 = i18 + i15;
        int i42 = 0;
        int i43 = i41 < 0 ? 0 : i41;
        if (i11 <= 0) {
            return new N(kotlin.collections.K.f71697a, i18, i15, i14, enumC9142v, -i13, i12 + i14, i19, aVar2, (B1.W) ((L) interfaceC6511n).invoke(Integer.valueOf(Z1.b.m(j11)), Integer.valueOf(Z1.b.l(j11)), H.f105654b), m11);
        }
        EnumC9142v enumC9142v2 = enumC9142v;
        EnumC9142v enumC9142v3 = EnumC9142v.Vertical;
        long b11 = Z1.c.b(enumC9142v2 == enumC9142v3 ? Z1.b.k(j11) : i18, enumC9142v2 != enumC9142v3 ? Z1.b.j(j11) : i18, 5);
        int i44 = i16;
        int i45 = i17;
        while (i44 > 0 && i45 > 0) {
            i44--;
            i45 -= i43;
        }
        int i46 = i45 * (-1);
        if (i44 >= i11) {
            i44 = i11 - 1;
            i46 = 0;
        }
        C7704k c7704k2 = new C7704k();
        int i47 = -i13;
        int i48 = (i15 < 0 ? i15 : 0) + i47;
        int i49 = i46 + i48;
        int i51 = 0;
        while (i49 < 0 && i44 > 0) {
            int i52 = i44 - 1;
            int i53 = i51;
            int i54 = i42;
            int i55 = i43;
            C7704k c7704k3 = c7704k2;
            C10806m b12 = b(interfaceC10573B, i52, b11, f7, j12, enumC9142v2, aVar, bVar, interfaceC10573B.getLayoutDirection(), i18);
            c7704k3.add(i54, b12);
            i51 = Math.max(i53, b12.b());
            i49 += i55;
            enumC9142v2 = enumC9142v;
            i42 = i54;
            c7704k2 = c7704k3;
            i48 = i48;
            i44 = i52;
            i47 = i47;
            i43 = i55;
        }
        int i56 = i42;
        int i57 = i43;
        int i58 = i49;
        C7704k c7704k4 = c7704k2;
        int i59 = i47;
        int i61 = i48;
        int i62 = i51;
        int i63 = (i58 < i61 ? i61 : i58) - i61;
        int i64 = i12 + i14;
        int i65 = i64 < 0 ? i56 : i64;
        int i66 = i56;
        int i67 = -i63;
        int i68 = i44;
        int i69 = i66;
        while (true) {
            i21 = 1;
            if (i69 >= c7704k4.getF26995b()) {
                break;
            }
            if (i67 >= i65) {
                c7704k4.b(i69);
                i66 = 1;
            } else {
                i68++;
                i67 += i57;
                i69++;
            }
        }
        int i71 = i44;
        int i72 = i66;
        int i73 = i67;
        int i74 = i11;
        int i75 = i62;
        int i76 = i63;
        while (true) {
            if (i68 >= i74) {
                i22 = i64;
                i23 = i76;
                i24 = i73;
                i25 = i75;
                i26 = i74;
                i27 = i68;
                i28 = i21;
                i29 = i12;
                break;
            }
            if (i73 >= i65 && i73 > 0 && !c7704k4.isEmpty()) {
                i29 = i12;
                i22 = i64;
                i23 = i76;
                i24 = i73;
                i25 = i75;
                i26 = i74;
                i27 = i68;
                i28 = i21;
                break;
            }
            int i77 = i21;
            int i78 = i64;
            int i79 = i76;
            int i81 = i65;
            int i82 = i73;
            int i83 = i75;
            int i84 = i74;
            int i85 = i68;
            C10806m b13 = b(interfaceC10573B, i85, b11, f7, j12, enumC9142v, aVar, bVar, interfaceC10573B.getLayoutDirection(), i18);
            int i86 = i84 - 1;
            int i87 = i82 + (i85 == i86 ? i18 : i57);
            if (i87 > i61 || i85 == i86) {
                i83 = Math.max(i83, b13.b());
                c7704k4.addLast(b13);
                i39 = i79;
            } else {
                int i88 = i85 + 1;
                i39 = i79 - i57;
                i71 = i88;
                i72 = i77;
            }
            i75 = i83;
            i68 = i85 + 1;
            i74 = i84;
            i76 = i39;
            i64 = i78;
            i21 = i77;
            i65 = i81;
            i73 = i87;
        }
        if (i24 < i29) {
            int i89 = i29 - i24;
            int i91 = i24 + i89;
            int i92 = i25;
            int i93 = i23 - i89;
            while (i93 < i13 && i71 > 0) {
                i71--;
                C10806m b14 = b(interfaceC10573B, i71, b11, f7, j12, enumC9142v, aVar, bVar, interfaceC10573B.getLayoutDirection(), i18);
                c7704k4.add(0, b14);
                i92 = Math.max(i92, b14.b());
                i27 = i27;
                i93 += i57;
                i91 = i91;
            }
            int i94 = i93;
            int i95 = i91;
            i31 = i27;
            int i96 = i92;
            if (i94 < 0) {
                i32 = i96;
                i24 = i95 + i94;
                i33 = 0;
            } else {
                i32 = i96;
                i33 = i94;
                i24 = i95;
            }
        } else {
            int i97 = i25;
            i31 = i27;
            i32 = i97;
            i33 = i23;
        }
        if (i33 < 0) {
            throw new IllegalArgumentException("invalid currentFirstPageScrollOffset");
        }
        int i98 = -i33;
        C10806m c10806m2 = (C10806m) c7704k4.first();
        if (i13 > 0 || i15 < 0) {
            int f26995b = c7704k4.getF26995b();
            C10806m c10806m3 = c10806m2;
            int i99 = i33;
            int i100 = 0;
            while (i100 < f26995b && i99 != 0) {
                i34 = i57;
                if (i34 > i99 || i100 == C7714v.P(c7704k4)) {
                    break;
                }
                i99 -= i34;
                i100++;
                c10806m3 = (C10806m) c7704k4.get(i100);
                i57 = i34;
            }
            i34 = i57;
            i35 = i99;
            c10806m2 = c10806m3;
        } else {
            i34 = i57;
            i35 = i33;
        }
        int i101 = i31;
        C7704k c7704k5 = c7704k4;
        C10806m c10806m4 = c10806m2;
        int i102 = i34;
        J j13 = new J(interfaceC10573B, b11, f7, j12, enumC9142v, aVar, bVar, i18);
        int max = Math.max(0, i71 - i19);
        int i103 = i71 - 1;
        ArrayList arrayList4 = null;
        if (max <= i103) {
            while (true) {
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList();
                }
                arrayList4.add(j13.invoke(Integer.valueOf(i103)));
                if (i103 == max) {
                    break;
                }
                i103--;
            }
        }
        int size = list.size();
        List list3 = arrayList4;
        for (int i104 = 0; i104 < size; i104++) {
            int intValue = ((Number) list.get(i104)).intValue();
            if (intValue < max) {
                if (list3 == null) {
                    list3 = new ArrayList();
                }
                list3.add(j13.invoke(Integer.valueOf(intValue)));
            }
        }
        if (list3 == null) {
            list3 = kotlin.collections.K.f71697a;
        }
        List list4 = list3;
        int size2 = list4.size();
        int i105 = i32;
        for (int i106 = 0; i106 < size2; i106++) {
            i105 = Math.max(i105, ((C10806m) list4.get(i106)).b());
        }
        int index = ((C10806m) c7704k5.last()).getIndex();
        int i107 = i105;
        I i108 = new I(interfaceC10573B, b11, f7, j12, enumC9142v, aVar, bVar, i18);
        int min = Math.min(index + i19, i26 - 1);
        int i109 = index + 1;
        List list5 = null;
        if (i109 <= min) {
            while (true) {
                if (list5 == null) {
                    list5 = new ArrayList();
                }
                list5.add(i108.invoke(Integer.valueOf(i109)));
                if (i109 == min) {
                    break;
                }
                i109++;
            }
        }
        int size3 = list.size();
        for (int i110 = 0; i110 < size3; i110++) {
            int intValue2 = ((Number) list.get(i110)).intValue();
            if (min + 1 <= intValue2 && intValue2 < i26) {
                if (list5 == null) {
                    list5 = new ArrayList();
                }
                list5.add(i108.invoke(Integer.valueOf(intValue2)));
            }
        }
        if (list5 == null) {
            list5 = kotlin.collections.K.f71697a;
        }
        List list6 = list5;
        int size4 = list6.size();
        int i111 = i107;
        for (int i112 = 0; i112 < size4; i112++) {
            i111 = Math.max(i111, ((C10806m) list6.get(i112)).b());
        }
        int i113 = (Intrinsics.d(c10806m4, c7704k5.first()) && list4.isEmpty() && list6.isEmpty()) ? i28 : 0;
        EnumC9142v enumC9142v4 = EnumC9142v.Vertical;
        int h11 = Z1.c.h(enumC9142v == enumC9142v4 ? i111 : i24, j11);
        if (enumC9142v == enumC9142v4) {
            i111 = i24;
        }
        int g10 = Z1.c.g(i111, j11);
        int i114 = enumC9142v == enumC9142v4 ? g10 : h11;
        int i115 = i24 < Math.min(i114, i29) ? i28 : 0;
        if (i115 != 0 && i98 != 0) {
            throw new IllegalStateException(Ej.b.a(i98, "non-zero pagesScrollOffset=").toString());
        }
        int i116 = i98;
        ArrayList arrayList5 = new ArrayList(list6.size() + list4.size() + c7704k5.getF26995b());
        if (i115 == 0) {
            c7704k = c7704k5;
            i36 = i24;
            c10806m = c10806m4;
            i37 = i113;
            int size5 = list4.size();
            int i117 = i116;
            for (int i118 = 0; i118 < size5; i118++) {
                C10806m c10806m5 = (C10806m) list4.get(i118);
                i117 -= i41;
                c10806m5.e(i117, h11, g10);
                arrayList5.add(c10806m5);
            }
            list2 = list4;
            int f26995b2 = c7704k.getF26995b();
            for (int i119 = 0; i119 < f26995b2; i119++) {
                C10806m c10806m6 = (C10806m) c7704k.get(i119);
                c10806m6.e(i116, h11, g10);
                arrayList5.add(c10806m6);
                i116 += i41;
            }
            int size6 = list6.size();
            for (int i120 = 0; i120 < size6; i120++) {
                C10806m c10806m7 = (C10806m) list6.get(i120);
                c10806m7.e(i116, h11, g10);
                arrayList5.add(c10806m7);
                i116 += i41;
            }
        } else {
            if (!list4.isEmpty() || !list6.isEmpty()) {
                throw new IllegalArgumentException("No extra pages");
            }
            int f26995b3 = c7704k5.getF26995b();
            int[] iArr = new int[f26995b3];
            for (int i121 = 0; i121 < f26995b3; i121++) {
                iArr[i121] = i18;
            }
            int[] iArr2 = new int[f26995b3];
            for (int i122 = 0; i122 < f26995b3; i122++) {
                iArr2[i122] = 0;
            }
            c10806m = c10806m4;
            i36 = i24;
            i37 = i113;
            C5179b.i iVar = new C5179b.i(interfaceC10573B.B(i15), false, null);
            if (enumC9142v == EnumC9142v.Vertical) {
                iVar.c(interfaceC10573B, i114, iArr, Z1.s.Ltr, iArr2);
            } else {
                iVar.c(interfaceC10573B, i114, iArr, Z1.s.Ltr, iArr2);
            }
            IntRange H11 = C7705l.H(iArr2);
            int f71842a = H11.getF71842a();
            int f71843b = H11.getF71843b();
            int f71844c = H11.getF71844c();
            if ((f71844c > 0 && f71842a <= f71843b) || (f71844c < 0 && f71843b <= f71842a)) {
                while (true) {
                    int i123 = iArr2[f71842a];
                    c7704k = c7704k5;
                    C10806m c10806m8 = (C10806m) c7704k.get(f71842a);
                    c10806m8.e(i123, h11, g10);
                    arrayList5.add(c10806m8);
                    if (f71842a == f71843b) {
                        break;
                    }
                    f71842a += f71844c;
                    c7704k5 = c7704k;
                }
            } else {
                c7704k = c7704k5;
            }
            list2 = list4;
        }
        if (i37 != 0) {
            arrayList = arrayList5;
        } else {
            ArrayList arrayList6 = new ArrayList(arrayList5.size());
            int size7 = arrayList5.size();
            for (int i124 = 0; i124 < size7; i124++) {
                Object obj2 = arrayList5.get(i124);
                C10806m c10806m9 = (C10806m) obj2;
                if (c10806m9.getIndex() >= ((C10806m) c7704k.first()).getIndex() && c10806m9.getIndex() <= ((C10806m) c7704k.last()).getIndex()) {
                    arrayList6.add(obj2);
                }
            }
            arrayList = arrayList6;
        }
        if (list2.isEmpty()) {
            arrayList2 = kotlin.collections.K.f71697a;
        } else {
            arrayList2 = new ArrayList(arrayList5.size());
            int size8 = arrayList5.size();
            for (int i125 = 0; i125 < size8; i125++) {
                Object obj3 = arrayList5.get(i125);
                if (((C10806m) obj3).getIndex() < ((C10806m) c7704k.first()).getIndex()) {
                    arrayList2.add(obj3);
                }
            }
        }
        List list7 = arrayList2;
        if (list6.isEmpty()) {
            arrayList3 = kotlin.collections.K.f71697a;
        } else {
            arrayList3 = new ArrayList(arrayList5.size());
            int size9 = arrayList5.size();
            for (int i126 = 0; i126 < size9; i126++) {
                Object obj4 = arrayList5.get(i126);
                if (((C10806m) obj4).getIndex() > ((C10806m) c7704k.last()).getIndex()) {
                    arrayList3.add(obj4);
                }
            }
        }
        if (arrayList.isEmpty()) {
            i38 = i28;
            obj = null;
        } else {
            Object obj5 = arrayList.get(0);
            int offset = ((C10806m) obj5).getOffset();
            aVar2.getClass();
            float f11 = 0;
            float f12 = -Math.abs(offset - f11);
            int P11 = C7714v.P(arrayList);
            i38 = i28;
            if (i38 <= P11) {
                int i127 = i38;
                while (true) {
                    Object obj6 = arrayList.get(i127);
                    float f13 = -Math.abs(((C10806m) obj6).getOffset() - f11);
                    if (Float.compare(f12, f13) < 0) {
                        obj5 = obj6;
                        f12 = f13;
                    }
                    if (i127 == P11) {
                        break;
                    }
                    i127++;
                }
            }
            obj = obj5;
        }
        C10806m c10806m10 = (C10806m) obj;
        aVar2.getClass();
        int offset2 = c10806m10 != null ? c10806m10.getOffset() : 0;
        if (i102 == 0) {
            d11 = 0.0f;
            z11 = false;
        } else {
            z11 = false;
            d11 = kotlin.ranges.h.d((0 - offset2) / i102, -0.5f, 0.5f);
        }
        return new N(arrayList, i18, i15, i14, enumC9142v, i59, i22, i19, c10806m, c10806m10, d11, i35, (i101 < i26 || i36 > i29) ? i38 : z11, aVar2, (B1.W) ((L) interfaceC6511n).invoke(Integer.valueOf(h11), Integer.valueOf(g10), new G(arrayList5, interfaceC3978p0)), i72, list7, arrayList3, m11);
    }
}
