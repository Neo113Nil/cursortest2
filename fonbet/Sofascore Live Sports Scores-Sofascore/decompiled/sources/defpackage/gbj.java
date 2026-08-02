package defpackage;

import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gbj implements k1c {
    public final boolean a;
    public final uaj b;
    public final paj c;
    public final p3e d;
    public final float e;

    public gbj(boolean z, uaj uajVar, paj pajVar, p3e p3eVar, float f) {
        this.a = z;
        this.b = uajVar;
        this.c = pajVar;
        this.d = p3eVar;
        this.e = f;
    }

    public static int e(List list, int i, Function2 function2) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj7 = list.get(i2);
            if (Intrinsics.c(g7a.x((g1c) obj7), "TextField")) {
                int intValue = ((Number) function2.invoke(obj7, Integer.valueOf(i))).intValue();
                int size2 = list.size();
                int i3 = 0;
                while (true) {
                    obj = null;
                    if (i3 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i3);
                    if (Intrinsics.c(g7a.x((g1c) obj2), "Label")) {
                        break;
                    }
                    i3++;
                }
                g1c g1cVar = (g1c) obj2;
                int intValue2 = g1cVar != null ? ((Number) function2.invoke(g1cVar, Integer.valueOf(i))).intValue() : 0;
                int size3 = list.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i4);
                    if (Intrinsics.c(g7a.x((g1c) obj3), "Trailing")) {
                        break;
                    }
                    i4++;
                }
                g1c g1cVar2 = (g1c) obj3;
                int intValue3 = g1cVar2 != null ? ((Number) function2.invoke(g1cVar2, Integer.valueOf(i))).intValue() : 0;
                int size4 = list.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i5);
                    if (Intrinsics.c(g7a.x((g1c) obj4), "Prefix")) {
                        break;
                    }
                    i5++;
                }
                g1c g1cVar3 = (g1c) obj4;
                int intValue4 = g1cVar3 != null ? ((Number) function2.invoke(g1cVar3, Integer.valueOf(i))).intValue() : 0;
                int size5 = list.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size5) {
                        obj5 = null;
                        break;
                    }
                    obj5 = list.get(i6);
                    if (Intrinsics.c(g7a.x((g1c) obj5), "Suffix")) {
                        break;
                    }
                    i6++;
                }
                g1c g1cVar4 = (g1c) obj5;
                int intValue5 = g1cVar4 != null ? ((Number) function2.invoke(g1cVar4, Integer.valueOf(i))).intValue() : 0;
                int size6 = list.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size6) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i7);
                    if (Intrinsics.c(g7a.x((g1c) obj6), "Leading")) {
                        break;
                    }
                    i7++;
                }
                g1c g1cVar5 = (g1c) obj6;
                int intValue6 = g1cVar5 != null ? ((Number) function2.invoke(g1cVar5, Integer.valueOf(i))).intValue() : 0;
                int size7 = list.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size7) {
                        break;
                    }
                    Object obj8 = list.get(i8);
                    if (Intrinsics.c(g7a.x((g1c) obj8), "Hint")) {
                        obj = obj8;
                        break;
                    }
                    i8++;
                }
                g1c g1cVar6 = (g1c) obj;
                int i9 = intValue4 + intValue5;
                return cn3.g(Math.max(intValue + i9, Math.max((g1cVar6 != null ? ((Number) function2.invoke(g1cVar6, Integer.valueOf(i))).intValue() : 0) + i9, intValue2)) + intValue6 + intValue3, cn3.b(0, 0, 0, 0, 15));
            }
        }
        ycb.b("Collection contains no element matching the predicate.");
        pvd.x();
        return 0;
    }

    public static final int f(gbj gbjVar, int i, int i2, qhe qheVar) {
        return gbjVar.a ? vxd.b(i - qheVar.b, 2.0f, 1.0f) : i2;
    }

    @Override // defpackage.k1c
    public final int a(l9a l9aVar, List list, int i) {
        return e(list, i, new t6j(4));
    }

    public final int b(kx4 kx4Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, float f) {
        p3e p3eVar = this.d;
        return cn3.f(Math.max(i3, Math.max(i4, kx4Var.e0(p3eVar.a() + p3eVar.d()) + (i2 > 0 ? Math.max(kx4Var.e0(this.e * 2.0f), b6a.u(ewc.a.c(f), 0, i2)) : 0) + p93.c(i, i7, i5, i6, b6a.u(f, i2, 0)))) + i8, j);
    }

    public final int c(l9a l9aVar, List list, int i, Function2 function2) {
        Object obj;
        int i2;
        int i3;
        int i4;
        Object obj2;
        int i5;
        Object obj3;
        Object obj4;
        int i6;
        Object obj5;
        int i7;
        Object obj6;
        Object obj7;
        int size = list.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i8);
            if (Intrinsics.c(g7a.x((g1c) obj), "Leading")) {
                break;
            }
            i8++;
        }
        g1c g1cVar = (g1c) obj;
        if (g1cVar != null) {
            i2 = i;
            i4 = g7a.D(i2, g1cVar.G(Integer.MAX_VALUE));
            i3 = ((Number) function2.invoke(g1cVar, Integer.valueOf(i2))).intValue();
        } else {
            i2 = i;
            i3 = 0;
            i4 = i2;
        }
        int size2 = list.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i9);
            if (Intrinsics.c(g7a.x((g1c) obj2), "Trailing")) {
                break;
            }
            i9++;
        }
        g1c g1cVar2 = (g1c) obj2;
        if (g1cVar2 != null) {
            i4 = g7a.D(i4, g1cVar2.G(Integer.MAX_VALUE));
            i5 = ((Number) function2.invoke(g1cVar2, Integer.valueOf(i2))).intValue();
        } else {
            i5 = 0;
        }
        int size3 = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i10);
            if (Intrinsics.c(g7a.x((g1c) obj3), "Label")) {
                break;
            }
            i10++;
        }
        Object obj8 = (g1c) obj3;
        int intValue = obj8 != null ? ((Number) function2.invoke(obj8, Integer.valueOf(i4))).intValue() : 0;
        int size4 = list.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i11);
            if (Intrinsics.c(g7a.x((g1c) obj4), "Prefix")) {
                break;
            }
            i11++;
        }
        g1c g1cVar3 = (g1c) obj4;
        if (g1cVar3 != null) {
            int intValue2 = ((Number) function2.invoke(g1cVar3, Integer.valueOf(i4))).intValue();
            i4 = g7a.D(i4, g1cVar3.G(Integer.MAX_VALUE));
            i6 = intValue2;
        } else {
            i6 = 0;
        }
        int size5 = list.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i12);
            if (Intrinsics.c(g7a.x((g1c) obj5), "Suffix")) {
                break;
            }
            i12++;
        }
        g1c g1cVar4 = (g1c) obj5;
        if (g1cVar4 != null) {
            int intValue3 = ((Number) function2.invoke(g1cVar4, Integer.valueOf(i4))).intValue();
            i4 = g7a.D(i4, g1cVar4.G(Integer.MAX_VALUE));
            i7 = intValue3;
        } else {
            i7 = 0;
        }
        int size6 = list.size();
        for (int i13 = 0; i13 < size6; i13++) {
            Object obj9 = list.get(i13);
            if (Intrinsics.c(g7a.x((g1c) obj9), "TextField")) {
                int intValue4 = ((Number) function2.invoke(obj9, Integer.valueOf(i4))).intValue();
                int size7 = list.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i14);
                    if (Intrinsics.c(g7a.x((g1c) obj6), "Hint")) {
                        break;
                    }
                    i14++;
                }
                Object obj10 = (g1c) obj6;
                int intValue5 = obj10 != null ? ((Number) function2.invoke(obj10, Integer.valueOf(i4))).intValue() : 0;
                int size8 = list.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i15);
                    if (Intrinsics.c(g7a.x((g1c) obj7), "Supporting")) {
                        break;
                    }
                    i15++;
                }
                Object obj11 = (g1c) obj7;
                return b(l9aVar, intValue4, intValue, i3, i5, i6, i7, intValue5, obj11 != null ? ((Number) function2.invoke(obj11, Integer.valueOf(i2))).intValue() : 0, cn3.b(0, 0, 0, 0, 15), this.c.invoke());
            }
        }
        ycb.b("Collection contains no element matching the predicate.");
        pvd.x();
        return 0;
    }

    @Override // defpackage.k1c
    public final l1c d(final m1c m1cVar, List list, long j) {
        Object obj;
        Object obj2;
        Object obj3;
        int i;
        qhe qheVar;
        Object obj4;
        int i2;
        qhe qheVar2;
        Object obj5;
        int i3;
        Object obj6;
        Object obj7;
        qhe qheVar3;
        int i4;
        int i5;
        int i6;
        int i7;
        qhe qheVar4;
        int i8;
        qhe qheVar5;
        int i9;
        qhe qheVar6;
        int i10;
        float f;
        qhe qheVar7;
        fsf fsfVar;
        int i11;
        qhe qheVar8;
        qhe qheVar9;
        int i12;
        int i13;
        gbj gbjVar;
        int i14;
        float invoke = this.c.invoke();
        p3e p3eVar = this.d;
        final int e0 = m1cVar.e0(p3eVar.d());
        int e02 = m1cVar.e0(p3eVar.a());
        long a = an3.a(j, 0, 0, 0, 0, 10);
        int size = list.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i15);
            if (Intrinsics.c(ww9.A((g1c) obj), "Leading")) {
                break;
            }
            i15++;
        }
        g1c g1cVar = (g1c) obj;
        qhe J = g1cVar != null ? g1cVar.J(a) : null;
        int i16 = J != null ? J.a : 0;
        int max = Math.max(0, J != null ? J.b : 0);
        int size2 = list.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i17);
            if (Intrinsics.c(ww9.A((g1c) obj2), "Trailing")) {
                break;
            }
            i17++;
        }
        g1c g1cVar2 = (g1c) obj2;
        qhe J2 = g1cVar2 != null ? g1cVar2.J(cn3.j(-i16, 0, 2, a)) : null;
        int i18 = i16 + (J2 != null ? J2.a : 0);
        int max2 = Math.max(max, J2 != null ? J2.b : 0);
        int size3 = list.size();
        int i19 = 0;
        while (true) {
            if (i19 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i19);
            if (Intrinsics.c(ww9.A((g1c) obj3), "Prefix")) {
                break;
            }
            i19++;
        }
        g1c g1cVar3 = (g1c) obj3;
        if (g1cVar3 != null) {
            i = i18;
            qheVar = g1cVar3.J(cn3.j(-i18, 0, 2, a));
        } else {
            i = i18;
            qheVar = null;
        }
        int i20 = (qheVar != null ? qheVar.a : 0) + i;
        int max3 = Math.max(max2, qheVar != null ? qheVar.b : 0);
        int size4 = list.size();
        int i21 = 0;
        while (true) {
            if (i21 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i21);
            if (Intrinsics.c(ww9.A((g1c) obj4), "Suffix")) {
                break;
            }
            i21++;
        }
        g1c g1cVar4 = (g1c) obj4;
        if (g1cVar4 != null) {
            i2 = i20;
            qheVar2 = g1cVar4.J(cn3.j(-i20, 0, 2, a));
        } else {
            i2 = i20;
            qheVar2 = null;
        }
        int i22 = i2 + (qheVar2 != null ? qheVar2.a : 0);
        int max4 = Math.max(max3, qheVar2 != null ? qheVar2.b : 0);
        int size5 = list.size();
        int i23 = 0;
        while (true) {
            if (i23 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i23);
            int i24 = size5;
            if (Intrinsics.c(ww9.A((g1c) obj5), "Label")) {
                break;
            }
            i23++;
            size5 = i24;
        }
        g1c g1cVar5 = (g1c) obj5;
        fsf fsfVar2 = new fsf();
        int i25 = -i22;
        fsfVar2.a = g1cVar5 != null ? g1cVar5.J(cn3.i(i25, -e02, a)) : null;
        int size6 = list.size();
        int i26 = 0;
        while (true) {
            if (i26 >= size6) {
                i3 = e02;
                obj6 = null;
                break;
            }
            obj6 = list.get(i26);
            i3 = e02;
            if (Intrinsics.c(ww9.A((g1c) obj6), "Supporting")) {
                break;
            }
            i26++;
            e02 = i3;
        }
        g1c g1cVar6 = (g1c) obj6;
        int s = g1cVar6 != null ? g1cVar6.s(an3.j(j)) : 0;
        qhe qheVar10 = (qhe) fsfVar2.a;
        int i27 = e0 + (qheVar10 != null ? qheVar10.b : 0);
        long i28 = cn3.i(i25, ((-i27) - i3) - s, an3.a(j, 0, 0, 0, 0, 11));
        int size7 = list.size();
        int i29 = 0;
        while (i29 < size7) {
            int i30 = i27;
            g1c g1cVar7 = (g1c) list.get(i29);
            int i31 = size7;
            float f2 = invoke;
            if (Intrinsics.c(ww9.A(g1cVar7), "TextField")) {
                final qhe J3 = g1cVar7.J(i28);
                long a2 = an3.a(i28, 0, 0, 0, 0, 14);
                int size8 = list.size();
                int i32 = 0;
                while (true) {
                    if (i32 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i32);
                    int i33 = size8;
                    int i34 = i32;
                    if (Intrinsics.c(ww9.A((g1c) obj7), "Hint")) {
                        break;
                    }
                    i32 = i34 + 1;
                    size8 = i33;
                }
                g1c g1cVar8 = (g1c) obj7;
                qhe J4 = g1cVar8 != null ? g1cVar8.J(a2) : null;
                int max5 = Math.max(max4, Math.max(J3.b, J4 != null ? J4.b : 0) + i30 + i3);
                int i35 = J != null ? J.a : 0;
                int i36 = J2 != null ? J2.a : 0;
                int i37 = qheVar != null ? qheVar.a : 0;
                int i38 = qheVar2 != null ? qheVar2.a : 0;
                int i39 = i36;
                int i40 = J3.a;
                qhe qheVar11 = (qhe) fsfVar2.a;
                int i41 = i37 + i38;
                int g = cn3.g(Math.max(i40 + i41, Math.max((J4 != null ? J4.a : 0) + i41, qheVar11 != null ? qheVar11.a : 0)) + i35 + i39, j);
                qhe J5 = g1cVar6 != null ? g1cVar6.J(an3.a(cn3.j(0, -max5, 1, a), 0, g, 0, 0, 9)) : null;
                int i42 = J5 != null ? J5.b : 0;
                int i43 = J3.b;
                qhe qheVar12 = (qhe) fsfVar2.a;
                int i44 = qheVar12 != null ? qheVar12.b : 0;
                int i45 = J != null ? J.b : 0;
                if (J2 != null) {
                    qheVar3 = J;
                    i4 = i44;
                    i5 = J2.b;
                } else {
                    qheVar3 = J;
                    i4 = i44;
                    i5 = 0;
                }
                if (qheVar != null) {
                    i6 = i45;
                    i7 = qheVar.b;
                } else {
                    i6 = i45;
                    i7 = 0;
                }
                final qhe qheVar13 = J2;
                if (qheVar2 != null) {
                    qhe qheVar14 = qheVar;
                    i8 = qheVar2.b;
                    qheVar4 = qheVar14;
                } else {
                    qheVar4 = qheVar;
                    i8 = 0;
                }
                final qhe qheVar15 = qheVar4;
                if (J4 != null) {
                    qhe qheVar16 = qheVar3;
                    i9 = J4.b;
                    qheVar5 = qheVar16;
                } else {
                    qheVar5 = qheVar3;
                    i9 = 0;
                }
                if (J5 != null) {
                    qheVar7 = qheVar5;
                    qheVar6 = qheVar2;
                    i10 = i6;
                    f = f2;
                    fsfVar = fsfVar2;
                    i11 = J5.b;
                    qheVar8 = J4;
                    qheVar9 = J5;
                    i12 = g;
                    i13 = 0;
                    i14 = i43;
                    gbjVar = this;
                } else {
                    qheVar6 = qheVar2;
                    i10 = i6;
                    f = f2;
                    qheVar7 = qheVar5;
                    fsfVar = fsfVar2;
                    i11 = 0;
                    qheVar8 = J4;
                    qheVar9 = J5;
                    i12 = g;
                    i13 = 0;
                    gbjVar = this;
                    i14 = i43;
                }
                final int b = gbjVar.b(m1cVar, i14, i4, i10, i5, i7, i8, i9, i11, j, f);
                final int i46 = b - i42;
                int size9 = list.size();
                int i47 = i13;
                while (i47 < size9) {
                    g1c g1cVar9 = (g1c) list.get(i47);
                    if (Intrinsics.c(ww9.A(g1cVar9), "Container")) {
                        final qhe J6 = g1cVar9.J(cn3.a(i12 != Integer.MAX_VALUE ? i12 : i13, i12, i46 != Integer.MAX_VALUE ? i46 : i13, i46));
                        final int i48 = i12;
                        final float f3 = f;
                        final qhe qheVar17 = qheVar6;
                        final qhe qheVar18 = qheVar7;
                        final fsf fsfVar3 = fsfVar;
                        final qhe qheVar19 = qheVar8;
                        final qhe qheVar20 = qheVar9;
                        return m1c.G0(m1cVar, i48, b, new Function1() { // from class: fbj
                            /* JADX WARN: Removed duplicated region for block: B:18:0x00a8  */
                            /* JADX WARN: Removed duplicated region for block: B:21:0x00b0  */
                            /* JADX WARN: Removed duplicated region for block: B:24:0x00c1  */
                            /* JADX WARN: Removed duplicated region for block: B:28:0x00d9  */
                            /* JADX WARN: Removed duplicated region for block: B:31:0x00e3  */
                            /* JADX WARN: Removed duplicated region for block: B:34:0x00f2  */
                            /* JADX WARN: Removed duplicated region for block: B:38:0x010d  */
                            /* JADX WARN: Removed duplicated region for block: B:43:0x0118  */
                            /* JADX WARN: Removed duplicated region for block: B:45:0x011e  */
                            /* JADX WARN: Removed duplicated region for block: B:48:0x0128  */
                            /* JADX WARN: Removed duplicated region for block: B:50:0x012d  */
                            /* JADX WARN: Removed duplicated region for block: B:55:0x013f  */
                            /* JADX WARN: Removed duplicated region for block: B:57:0x0155  */
                            /* JADX WARN: Removed duplicated region for block: B:61:0x0121  */
                            /* JADX WARN: Removed duplicated region for block: B:62:0x011b  */
                            /* JADX WARN: Removed duplicated region for block: B:63:0x00f7  */
                            /* JADX WARN: Removed duplicated region for block: B:64:0x00e6  */
                            /* JADX WARN: Removed duplicated region for block: B:65:0x00dc  */
                            /* JADX WARN: Removed duplicated region for block: B:66:0x00c5  */
                            /* JADX WARN: Removed duplicated region for block: B:67:0x00b3  */
                            /* JADX WARN: Removed duplicated region for block: B:68:0x00ab  */
                            @Override // kotlin.jvm.functions.Function1
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object invoke(Object obj8) {
                                int i49;
                                int i50;
                                qhe qheVar21;
                                int e03;
                                uaj uajVar;
                                int i51;
                                int i52;
                                phe pheVar = (phe) obj8;
                                fsf fsfVar4 = fsf.this;
                                Object obj9 = fsfVar4.a;
                                gbj gbjVar2 = this;
                                m1c m1cVar2 = m1cVar;
                                int i53 = i48;
                                int i54 = b;
                                qhe qheVar22 = J3;
                                qhe qheVar23 = qheVar19;
                                qhe qheVar24 = qheVar18;
                                qhe qheVar25 = qheVar13;
                                qhe qheVar26 = qheVar15;
                                qhe qheVar27 = qheVar17;
                                qhe qheVar28 = J6;
                                qhe qheVar29 = qheVar20;
                                if (obj9 != null) {
                                    boolean z = gbjVar2.a;
                                    int i55 = e0;
                                    if (z) {
                                        i49 = i53;
                                        i50 = i54;
                                        qheVar21 = qheVar27;
                                        e03 = vxd.b(i46 - ((qhe) obj9).b, 2.0f, 1.0f);
                                    } else {
                                        i49 = i53;
                                        i50 = i54;
                                        qheVar21 = qheVar27;
                                        e03 = m1cVar2.e0(gbjVar2.e) + i55;
                                    }
                                    qhe qheVar30 = (qhe) fsfVar4.a;
                                    int i56 = qheVar30.b + i55;
                                    ema layoutDirection = m1cVar2.getLayoutDirection();
                                    uaj uajVar2 = gbjVar2.b;
                                    pheVar.e(qheVar28, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                    int i57 = i50 - (qheVar29 != null ? qheVar29.b : 0);
                                    if (qheVar24 != null) {
                                        uajVar = uajVar2;
                                        i51 = i57;
                                        phe.h(pheVar, qheVar24, 0, vxd.b(i57 - qheVar24.b, 2.0f, 1.0f));
                                    } else {
                                        uajVar = uajVar2;
                                        i51 = i57;
                                    }
                                    float f4 = f3;
                                    int u = b6a.u(f4, e03, i55);
                                    if (layoutDirection == ema.a) {
                                        if (qheVar24 != null) {
                                            i52 = qheVar24.a;
                                            int round = Math.round((1.0f + (layoutDirection != ema.a ? -1.0f : (-1.0f) * (-1.0f))) * ((((i49 - (qheVar24 == null ? qheVar24.a : 0)) - (qheVar25 == null ? qheVar25.a : 0)) - qheVar30.a) / 2.0f)) + i52;
                                            qha.z(uajVar);
                                            pheVar.e(qheVar30, b6a.u(f4, round, Math.round((1.0f + (layoutDirection != ema.a ? -1.0f : (-1.0f) * (-1.0f))) * ((((i49 - (qheVar24 == null ? qheVar24.a : 0)) - (qheVar25 == null ? qheVar25.a : 0)) - qheVar30.a) / 2.0f)) + i52), u, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                            if (qheVar26 != null) {
                                                phe.h(pheVar, qheVar26, qheVar24 != null ? qheVar24.a : 0, i56);
                                            }
                                            int i58 = (qheVar24 == null ? qheVar24.a : 0) + (qheVar26 == null ? qheVar26.a : 0);
                                            phe.h(pheVar, qheVar22, i58, i56);
                                            if (qheVar23 != null) {
                                                phe.h(pheVar, qheVar23, i58, i56);
                                            }
                                            if (qheVar21 != null) {
                                                qhe qheVar31 = qheVar21;
                                                phe.h(pheVar, qheVar31, (i49 - (qheVar25 != null ? qheVar25.a : 0)) - qheVar31.a, i56);
                                            }
                                            if (qheVar25 != null) {
                                                phe.h(pheVar, qheVar25, i49 - qheVar25.a, vxd.b(i51 - qheVar25.b, 2.0f, 1.0f));
                                            }
                                            if (qheVar29 != null) {
                                                phe.h(pheVar, qheVar29, 0, i51);
                                            }
                                        }
                                        i52 = 0;
                                        int round2 = Math.round((1.0f + (layoutDirection != ema.a ? -1.0f : (-1.0f) * (-1.0f))) * ((((i49 - (qheVar24 == null ? qheVar24.a : 0)) - (qheVar25 == null ? qheVar25.a : 0)) - qheVar30.a) / 2.0f)) + i52;
                                        qha.z(uajVar);
                                        pheVar.e(qheVar30, b6a.u(f4, round2, Math.round((1.0f + (layoutDirection != ema.a ? -1.0f : (-1.0f) * (-1.0f))) * ((((i49 - (qheVar24 == null ? qheVar24.a : 0)) - (qheVar25 == null ? qheVar25.a : 0)) - qheVar30.a) / 2.0f)) + i52), u, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                        if (qheVar26 != null) {
                                        }
                                        int i582 = (qheVar24 == null ? qheVar24.a : 0) + (qheVar26 == null ? qheVar26.a : 0);
                                        phe.h(pheVar, qheVar22, i582, i56);
                                        if (qheVar23 != null) {
                                        }
                                        if (qheVar21 != null) {
                                        }
                                        if (qheVar25 != null) {
                                        }
                                        if (qheVar29 != null) {
                                        }
                                    } else {
                                        if (qheVar25 != null) {
                                            i52 = qheVar25.a;
                                            int round22 = Math.round((1.0f + (layoutDirection != ema.a ? -1.0f : (-1.0f) * (-1.0f))) * ((((i49 - (qheVar24 == null ? qheVar24.a : 0)) - (qheVar25 == null ? qheVar25.a : 0)) - qheVar30.a) / 2.0f)) + i52;
                                            qha.z(uajVar);
                                            pheVar.e(qheVar30, b6a.u(f4, round22, Math.round((1.0f + (layoutDirection != ema.a ? -1.0f : (-1.0f) * (-1.0f))) * ((((i49 - (qheVar24 == null ? qheVar24.a : 0)) - (qheVar25 == null ? qheVar25.a : 0)) - qheVar30.a) / 2.0f)) + i52), u, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                            if (qheVar26 != null) {
                                            }
                                            int i5822 = (qheVar24 == null ? qheVar24.a : 0) + (qheVar26 == null ? qheVar26.a : 0);
                                            phe.h(pheVar, qheVar22, i5822, i56);
                                            if (qheVar23 != null) {
                                            }
                                            if (qheVar21 != null) {
                                            }
                                            if (qheVar25 != null) {
                                            }
                                            if (qheVar29 != null) {
                                            }
                                        }
                                        i52 = 0;
                                        int round222 = Math.round((1.0f + (layoutDirection != ema.a ? -1.0f : (-1.0f) * (-1.0f))) * ((((i49 - (qheVar24 == null ? qheVar24.a : 0)) - (qheVar25 == null ? qheVar25.a : 0)) - qheVar30.a) / 2.0f)) + i52;
                                        qha.z(uajVar);
                                        pheVar.e(qheVar30, b6a.u(f4, round222, Math.round((1.0f + (layoutDirection != ema.a ? -1.0f : (-1.0f) * (-1.0f))) * ((((i49 - (qheVar24 == null ? qheVar24.a : 0)) - (qheVar25 == null ? qheVar25.a : 0)) - qheVar30.a) / 2.0f)) + i52), u, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                        if (qheVar26 != null) {
                                        }
                                        int i58222 = (qheVar24 == null ? qheVar24.a : 0) + (qheVar26 == null ? qheVar26.a : 0);
                                        phe.h(pheVar, qheVar22, i58222, i56);
                                        if (qheVar23 != null) {
                                        }
                                        if (qheVar21 != null) {
                                        }
                                        if (qheVar25 != null) {
                                        }
                                        if (qheVar29 != null) {
                                        }
                                    }
                                } else {
                                    float j2 = m1cVar2.j();
                                    phe.g(pheVar, qheVar28, 0L);
                                    int i59 = i54 - (qheVar29 != null ? qheVar29.b : 0);
                                    int b2 = wzb.b(gbjVar2.d.d() * j2);
                                    if (qheVar24 != null) {
                                        phe.h(pheVar, qheVar24, 0, vxd.b(i59 - qheVar24.b, 2.0f, 1.0f));
                                    }
                                    if (qheVar26 != null) {
                                        phe.h(pheVar, qheVar26, qheVar24 != null ? qheVar24.a : 0, gbj.f(gbjVar2, i59, b2, qheVar26));
                                    }
                                    int i60 = (qheVar24 != null ? qheVar24.a : 0) + (qheVar26 != null ? qheVar26.a : 0);
                                    phe.h(pheVar, qheVar22, i60, gbj.f(gbjVar2, i59, b2, qheVar22));
                                    if (qheVar23 != null) {
                                        phe.h(pheVar, qheVar23, i60, gbj.f(gbjVar2, i59, b2, qheVar23));
                                    }
                                    if (qheVar27 != null) {
                                        phe.h(pheVar, qheVar27, (i53 - (qheVar25 != null ? qheVar25.a : 0)) - qheVar27.a, gbj.f(gbjVar2, i59, b2, qheVar27));
                                    }
                                    if (qheVar25 != null) {
                                        phe.h(pheVar, qheVar25, i53 - qheVar25.a, vxd.b(i59 - qheVar25.b, 2.0f, 1.0f));
                                    }
                                    if (qheVar29 != null) {
                                        phe.h(pheVar, qheVar29, 0, i59);
                                    }
                                }
                                return Unit.a;
                            }
                        });
                    }
                    i47++;
                    i46 = i46;
                }
                ycb.b("Collection contains no element matching the predicate.");
                pvd.x();
                return null;
            }
            invoke = f2;
            i29++;
            size7 = i31;
            i27 = i30;
            J = J;
        }
        ycb.b("Collection contains no element matching the predicate.");
        pvd.x();
        return null;
    }

    @Override // defpackage.k1c
    public final int h(l9a l9aVar, List list, int i) {
        return e(list, i, new t6j(3));
    }

    @Override // defpackage.k1c
    public final int i(l9a l9aVar, List list, int i) {
        return c(l9aVar, list, i, new t6j(6));
    }

    @Override // defpackage.k1c
    public final int j(l9a l9aVar, List list, int i) {
        return c(l9aVar, list, i, new t6j(5));
    }
}
