package defpackage;

import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wxd implements k1c {
    public final Function1 a;
    public final boolean b;
    public final uaj c;
    public final paj d;
    public final p3e e;
    public final float f;

    public wxd(Function1 function1, boolean z, uaj uajVar, paj pajVar, p3e p3eVar, float f) {
        this.a = function1;
        this.b = z;
        this.c = uajVar;
        this.d = pajVar;
        this.e = p3eVar;
        this.f = f;
    }

    public static final int g(int i, wxd wxdVar, int i2, int i3, qhe qheVar, qhe qheVar2) {
        if (wxdVar.b) {
            i3 = vxd.b(i2 - qheVar2.b, 2.0f, 1.0f);
        }
        return Math.max(i + i3, (qheVar != null ? qheVar.b : 0) / 2);
    }

    @Override // defpackage.k1c
    public final int a(l9a l9aVar, List list, int i) {
        return f(l9aVar, list, i, new mpa(20));
    }

    public final int b(kx4 kx4Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, float f) {
        int c = p93.c(i5, i7, i3, i4, b6a.u(f, i6, 0));
        p3e p3eVar = this.e;
        float H0 = kx4Var.H0(p3eVar.d());
        return cn3.f(Math.max(i, Math.max(i2, wzb.b(b6a.t(H0, Math.max(H0, i6 / 2.0f), f) + c + kx4Var.H0(p3eVar.a())))) + i8, j);
    }

    public final int c(kx4 kx4Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, float f) {
        int i8 = i3 + i4;
        int max = Math.max(i5 + i8, Math.max(i7 + i8, b6a.u(f, i6, 0))) + i + i2;
        ema emaVar = ema.a;
        p3e p3eVar = this.e;
        return cn3.g(Math.max(max, wzb.b((i6 + kx4Var.H0(p3eVar.c(emaVar) + p3eVar.b(emaVar))) * f)), j);
    }

    @Override // defpackage.k1c
    public final l1c d(final m1c m1cVar, List list, long j) {
        Object obj;
        Object obj2;
        qhe qheVar;
        int i;
        qhe qheVar2;
        Object obj3;
        qhe qheVar3;
        int i2;
        qhe qheVar4;
        Object obj4;
        qhe qheVar5;
        int i3;
        qhe qheVar6;
        Object obj5;
        long j2;
        Object obj6;
        Object obj7;
        qhe qheVar7;
        int i4;
        fsf fsfVar;
        int i5;
        fsf fsfVar2;
        qhe qheVar8;
        int i6;
        long j3;
        int i7;
        qhe qheVar9;
        qhe qheVar10;
        int i8;
        qhe qheVar11;
        g1c g1cVar;
        wxd wxdVar;
        m1c m1cVar2;
        qhe qheVar12;
        int i9;
        qhe qheVar13;
        qhe qheVar14;
        int i10;
        int i11;
        int i12;
        fsf fsfVar3;
        int i13;
        wxd wxdVar2;
        qhe qheVar15;
        qhe qheVar16;
        int i14;
        qhe qheVar17;
        int i15;
        m1c m1cVar3;
        float f;
        List list2 = list;
        float invoke = this.d.invoke();
        p3e p3eVar = this.e;
        int e0 = m1cVar.e0(p3eVar.a());
        long a = an3.a(j, 0, 0, 0, 0, 10);
        int size = list2.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size) {
                obj = null;
                break;
            }
            obj = list2.get(i16);
            if (Intrinsics.c(ww9.A((g1c) obj), "Leading")) {
                break;
            }
            i16++;
        }
        g1c g1cVar2 = (g1c) obj;
        qhe J = g1cVar2 != null ? g1cVar2.J(a) : null;
        int i17 = J != null ? J.a : 0;
        int max = Math.max(0, J != null ? J.b : 0);
        int size2 = list2.size();
        int i18 = 0;
        while (true) {
            if (i18 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list2.get(i18);
            if (Intrinsics.c(ww9.A((g1c) obj2), "Trailing")) {
                break;
            }
            i18++;
        }
        g1c g1cVar3 = (g1c) obj2;
        if (g1cVar3 != null) {
            qheVar = J;
            i = i17;
            qheVar2 = g1cVar3.J(cn3.j(-i17, 0, 2, a));
        } else {
            qheVar = J;
            i = i17;
            qheVar2 = null;
        }
        int i19 = i + (qheVar2 != null ? qheVar2.a : 0);
        int max2 = Math.max(max, qheVar2 != null ? qheVar2.b : 0);
        int size3 = list2.size();
        int i20 = 0;
        while (true) {
            if (i20 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list2.get(i20);
            int i21 = size3;
            if (Intrinsics.c(ww9.A((g1c) obj3), "Prefix")) {
                break;
            }
            i20++;
            size3 = i21;
        }
        g1c g1cVar4 = (g1c) obj3;
        if (g1cVar4 != null) {
            qheVar3 = qheVar2;
            i2 = i19;
            qheVar4 = g1cVar4.J(cn3.j(-i19, 0, 2, a));
        } else {
            qheVar3 = qheVar2;
            i2 = i19;
            qheVar4 = null;
        }
        int i22 = i2 + (qheVar4 != null ? qheVar4.a : 0);
        int max3 = Math.max(max2, qheVar4 != null ? qheVar4.b : 0);
        int size4 = list2.size();
        int i23 = 0;
        while (true) {
            if (i23 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list2.get(i23);
            int i24 = size4;
            if (Intrinsics.c(ww9.A((g1c) obj4), "Suffix")) {
                break;
            }
            i23++;
            size4 = i24;
        }
        g1c g1cVar5 = (g1c) obj4;
        if (g1cVar5 != null) {
            qheVar5 = qheVar4;
            i3 = i22;
            qheVar6 = g1cVar5.J(cn3.j(-i22, 0, 2, a));
        } else {
            qheVar5 = qheVar4;
            i3 = i22;
            qheVar6 = null;
        }
        int i25 = i3 + (qheVar6 != null ? qheVar6.a : 0);
        int max4 = Math.max(max3, qheVar6 != null ? qheVar6.b : 0);
        int size5 = list2.size();
        int i26 = 0;
        while (true) {
            if (i26 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list2.get(i26);
            int i27 = size5;
            if (Intrinsics.c(ww9.A((g1c) obj5), "Label")) {
                break;
            }
            i26++;
            size5 = i27;
        }
        g1c g1cVar6 = (g1c) obj5;
        fsf fsfVar4 = new fsf();
        int e02 = m1cVar.e0(p3eVar.c(m1cVar.getLayoutDirection())) + m1cVar.e0(p3eVar.b(m1cVar.getLayoutDirection()));
        int i28 = -b6a.u(invoke, i25 + e02, e02);
        int i29 = -e0;
        qhe J2 = g1cVar6 != null ? g1cVar6.J(cn3.i(i28, i29, a)) : null;
        fsfVar4.a = J2;
        if (J2 != null) {
            float f2 = J2.a;
            j2 = (Float.floatToRawIntBits(J2.b) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
        } else {
            j2 = 0;
        }
        this.a.invoke(new njh(j2));
        int size6 = list2.size();
        int i30 = 0;
        while (true) {
            if (i30 >= size6) {
                obj6 = null;
                break;
            }
            obj6 = list2.get(i30);
            if (Intrinsics.c(ww9.A((g1c) obj6), "Supporting")) {
                break;
            }
            i30++;
        }
        g1c g1cVar7 = (g1c) obj6;
        int s = g1cVar7 != null ? g1cVar7.s(an3.j(j)) : 0;
        qhe qheVar18 = (qhe) fsfVar4.a;
        int max5 = Math.max((qheVar18 != null ? qheVar18.b : 0) / 2, m1cVar.e0(p3eVar.d()));
        long j4 = j;
        long i31 = cn3.i(-i25, (i29 - max5) - s, j4);
        g1c g1cVar8 = g1cVar7;
        long a2 = an3.a(i31, 0, 0, 0, 0, 11);
        int size7 = list2.size();
        int i32 = 0;
        while (i32 < size7) {
            g1c g1cVar9 = g1cVar8;
            g1c g1cVar10 = (g1c) list2.get(i32);
            int i33 = max5;
            int i34 = size7;
            if (Intrinsics.c(ww9.A(g1cVar10), "TextField")) {
                qhe J3 = g1cVar10.J(a2);
                long a3 = an3.a(a2, 0, 0, 0, 0, 14);
                int size8 = list2.size();
                int i35 = 0;
                while (true) {
                    if (i35 >= size8) {
                        obj7 = null;
                        break;
                    }
                    Object obj8 = list2.get(i35);
                    int i36 = size8;
                    if (Intrinsics.c(ww9.A((g1c) obj8), "Hint")) {
                        obj7 = obj8;
                        break;
                    }
                    i35++;
                    size8 = i36;
                }
                g1c g1cVar11 = (g1c) obj7;
                qhe J4 = g1cVar11 != null ? g1cVar11.J(a3) : null;
                int max6 = Math.max(max4, Math.max(J3.b, J4 != null ? J4.b : 0) + i33 + e0);
                int i37 = qheVar != null ? qheVar.a : 0;
                qhe qheVar19 = qheVar3;
                int i38 = qheVar3 != null ? qheVar19.a : 0;
                qhe qheVar20 = qheVar5;
                int i39 = qheVar5 != null ? qheVar20.a : 0;
                if (qheVar6 != null) {
                    i4 = qheVar6.a;
                    qheVar7 = qheVar19;
                } else {
                    qheVar7 = qheVar19;
                    i4 = 0;
                }
                int i40 = J3.a;
                qhe qheVar21 = qheVar7;
                qhe qheVar22 = (qhe) fsfVar4.a;
                if (qheVar22 != null) {
                    i5 = qheVar22.a;
                    fsfVar = fsfVar4;
                } else {
                    fsfVar = fsfVar4;
                    i5 = 0;
                }
                if (J4 != null) {
                    qheVar8 = J3;
                    i6 = i37;
                    fsfVar2 = fsfVar;
                    j3 = j4;
                    i7 = J4.a;
                    qheVar9 = J4;
                    qheVar10 = qheVar6;
                    i8 = i39;
                    qheVar11 = qheVar20;
                    g1cVar = g1cVar9;
                    wxdVar = this;
                    qheVar12 = qheVar;
                    i9 = max6;
                    qheVar13 = qheVar21;
                    m1cVar2 = m1cVar;
                } else {
                    fsfVar2 = fsfVar;
                    qheVar8 = J3;
                    i6 = i37;
                    j3 = j4;
                    i7 = 0;
                    qheVar9 = J4;
                    qheVar10 = qheVar6;
                    i8 = i39;
                    qheVar11 = qheVar20;
                    g1cVar = g1cVar9;
                    wxdVar = this;
                    m1cVar2 = m1cVar;
                    qheVar12 = qheVar;
                    i9 = max6;
                    qheVar13 = qheVar21;
                }
                final int c = wxdVar.c(m1cVar2, i6, i38, i8, i4, i40, i5, i7, j3, invoke);
                qhe J5 = g1cVar != null ? g1cVar.J(an3.a(cn3.j(0, -i9, 1, a), 0, c, 0, 0, 9)) : null;
                int i41 = J5 != null ? J5.b : 0;
                qhe qheVar23 = qheVar12;
                int i42 = qheVar12 != null ? qheVar23.b : 0;
                final qhe qheVar24 = qheVar13;
                int i43 = qheVar13 != null ? qheVar24.b : 0;
                qhe qheVar25 = qheVar11;
                int i44 = qheVar25 != null ? qheVar25.b : 0;
                qhe qheVar26 = qheVar10;
                int i45 = qheVar26 != null ? qheVar26.b : 0;
                qhe qheVar27 = qheVar8;
                int i46 = qheVar27.b;
                fsf fsfVar5 = fsfVar2;
                qhe qheVar28 = (qhe) fsfVar5.a;
                int i47 = qheVar28 != null ? qheVar28.b : 0;
                int i48 = i41;
                final qhe qheVar29 = qheVar9;
                if (qheVar29 != null) {
                    qheVar14 = qheVar26;
                    i10 = i45;
                    i11 = i46;
                    i12 = qheVar29.b;
                } else {
                    qheVar14 = qheVar26;
                    i10 = i45;
                    i11 = i46;
                    i12 = 0;
                }
                if (J5 != null) {
                    fsfVar3 = fsfVar5;
                    i13 = J5.b;
                    qheVar15 = qheVar25;
                    qheVar16 = qheVar27;
                    i14 = i47;
                    qheVar17 = qheVar23;
                    i15 = 0;
                    m1cVar3 = m1cVar;
                    f = invoke;
                    wxdVar2 = this;
                } else {
                    fsfVar3 = fsfVar5;
                    i13 = 0;
                    wxdVar2 = this;
                    qheVar15 = qheVar25;
                    qheVar16 = qheVar27;
                    i14 = i47;
                    qheVar17 = qheVar23;
                    i15 = 0;
                    m1cVar3 = m1cVar;
                    f = invoke;
                }
                final int b = wxdVar2.b(m1cVar3, i42, i43, i44, i10, i11, i14, i12, i13, j, f);
                final float f3 = f;
                int i49 = b - i48;
                int size9 = list.size();
                int i50 = i15;
                while (i50 < size9) {
                    g1c g1cVar12 = (g1c) list.get(i50);
                    if (Intrinsics.c(ww9.A(g1cVar12), "Container")) {
                        final qhe J6 = g1cVar12.J(cn3.a(c != Integer.MAX_VALUE ? c : i15, c, i49 != Integer.MAX_VALUE ? i49 : i15, i49));
                        final qhe qheVar30 = qheVar17;
                        final qhe qheVar31 = qheVar15;
                        final qhe qheVar32 = qheVar14;
                        final fsf fsfVar6 = fsfVar3;
                        final qhe qheVar33 = qheVar16;
                        final qhe qheVar34 = J5;
                        return m1c.G0(m1cVar, c, b, new Function1() { // from class: uxd
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj9) {
                                qhe qheVar35;
                                wxd wxdVar3;
                                float f4;
                                int i51;
                                int i52;
                                float f5;
                                qhe qheVar36;
                                wxd wxdVar4;
                                int i53;
                                float f6;
                                int i54;
                                float f7;
                                float f8;
                                uaj uajVar;
                                float f9;
                                phe pheVar = (phe) obj9;
                                qhe qheVar37 = (qhe) fsfVar6.a;
                                m1c m1cVar4 = m1cVar;
                                float j5 = m1cVar4.j();
                                ema layoutDirection = m1cVar4.getLayoutDirection();
                                wxd wxdVar5 = wxd.this;
                                float H0 = m1cVar4.H0(wxdVar5.f);
                                uaj uajVar2 = wxdVar5.c;
                                p3e p3eVar2 = wxdVar5.e;
                                pheVar.e(J6, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                qhe qheVar38 = qheVar34;
                                int i55 = b - (qheVar38 != null ? qheVar38.b : 0);
                                int b2 = wzb.b(p3eVar2.d() * j5);
                                qhe qheVar39 = qheVar30;
                                if (qheVar39 != null) {
                                    phe.h(pheVar, qheVar39, 0, vxd.b(i55 - qheVar39.b, 2.0f, 1.0f));
                                }
                                int i56 = c;
                                qhe qheVar40 = qheVar24;
                                if (qheVar37 != null) {
                                    if (wxdVar5.b) {
                                        f6 = H0;
                                        wxdVar3 = wxdVar5;
                                        i54 = vxd.b(i55 - qheVar37.b, 2.0f, 1.0f);
                                    } else {
                                        f6 = H0;
                                        wxdVar3 = wxdVar5;
                                        i54 = b2;
                                    }
                                    int i57 = -(qheVar37.b / 2);
                                    float f10 = f3;
                                    int u = b6a.u(f10, i54, i57);
                                    float L = l98.L(p3eVar2, layoutDirection) * j5;
                                    float K = l98.K(p3eVar2, layoutDirection) * j5;
                                    if (qheVar39 == null) {
                                        f8 = L;
                                        f7 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                    } else {
                                        f7 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                        float f11 = qheVar39.a;
                                        float f12 = L - f6;
                                        if (f12 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                            f12 = 0.0f;
                                        }
                                        f8 = f11 + f12;
                                    }
                                    if (qheVar40 == null) {
                                        uajVar = uajVar2;
                                        f9 = K;
                                    } else {
                                        uajVar = uajVar2;
                                        float f13 = qheVar40.a;
                                        float f14 = K - f6;
                                        if (f14 < f7) {
                                            f14 = f7;
                                        }
                                        f9 = f13 + f14;
                                    }
                                    qheVar35 = qheVar40;
                                    ema emaVar = ema.a;
                                    float f15 = layoutDirection == emaVar ? L : K;
                                    float round = Math.round((1.0f + (layoutDirection == ema.a ? -1.0f : (-1.0f) * (-1.0f))) * (((i56 - wzb.b(f8 + f9)) - qheVar37.a) / 2.0f)) + (layoutDirection == emaVar ? f8 : f9);
                                    qha.z(uajVar);
                                    f4 = 2.0f;
                                    pheVar.e(qheVar37, wzb.b(b6a.t(round, Math.round((1.0f + (layoutDirection != ema.a ? (-1.0f) * (-1.0f) : -1.0f)) * (((i56 - wzb.b(L + K)) - qheVar37.a) / 2.0f)) + f15, f10)), u, f7);
                                } else {
                                    qheVar35 = qheVar40;
                                    wxdVar3 = wxdVar5;
                                    f4 = 2.0f;
                                }
                                qhe qheVar41 = qheVar31;
                                if (qheVar41 != null) {
                                    i51 = b2;
                                    i52 = i55;
                                    f5 = f4;
                                    qheVar36 = qheVar35;
                                    wxdVar4 = wxdVar3;
                                    i53 = 0;
                                    phe.h(pheVar, qheVar41, qheVar39 != null ? qheVar39.a : 0, wxd.g(0, wxdVar4, i52, i51, qheVar37, qheVar41));
                                } else {
                                    i51 = b2;
                                    i52 = i55;
                                    f5 = f4;
                                    qheVar36 = qheVar35;
                                    wxdVar4 = wxdVar3;
                                    i53 = 0;
                                }
                                int i58 = (qheVar39 != null ? qheVar39.a : 0) + (qheVar41 != null ? qheVar41.a : 0);
                                qhe qheVar42 = qheVar33;
                                phe.h(pheVar, qheVar42, i58, wxd.g(i53, wxdVar4, i52, i51, qheVar37, qheVar42));
                                qhe qheVar43 = qheVar29;
                                if (qheVar43 != null) {
                                    phe.h(pheVar, qheVar43, i58, wxd.g(i53, wxdVar4, i52, i51, qheVar37, qheVar43));
                                }
                                qhe qheVar44 = qheVar32;
                                if (qheVar44 != null) {
                                    phe.h(pheVar, qheVar44, (i56 - (qheVar36 != null ? qheVar36.a : 0)) - qheVar44.a, wxd.g(i53, wxdVar4, i52, i51, qheVar37, qheVar44));
                                }
                                if (qheVar36 != null) {
                                    phe.h(pheVar, qheVar36, i56 - qheVar36.a, vxd.b(i52 - qheVar36.b, f5, 1.0f));
                                }
                                if (qheVar38 != null) {
                                    phe.h(pheVar, qheVar38, 0, i52);
                                }
                                return Unit.a;
                            }
                        });
                    }
                    i50++;
                    b = b;
                }
                ycb.b("Collection contains no element matching the predicate.");
                pvd.x();
                return null;
            }
            i32++;
            j4 = j;
            g1cVar8 = g1cVar9;
            size7 = i34;
            qheVar5 = qheVar5;
            list2 = list2;
            max5 = i33;
        }
        ycb.b("Collection contains no element matching the predicate.");
        pvd.x();
        return null;
    }

    public final int e(l9a l9aVar, List list, int i, Function2 function2) {
        Object obj;
        int i2;
        int i3;
        Object obj2;
        int i4;
        Object obj3;
        Object obj4;
        int i5;
        Object obj5;
        int i6;
        Object obj6;
        Object obj7;
        wxd wxdVar = this;
        float invoke = wxdVar.d.invoke();
        int size = list.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i7);
            if (Intrinsics.c(g7a.x((g1c) obj), "Leading")) {
                break;
            }
            i7++;
        }
        g1c g1cVar = (g1c) obj;
        if (g1cVar != null) {
            i2 = g7a.D(i, g1cVar.G(Integer.MAX_VALUE));
            i3 = ((Number) function2.invoke(g1cVar, Integer.valueOf(i))).intValue();
        } else {
            i2 = i;
            i3 = 0;
        }
        int size2 = list.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i8);
            if (Intrinsics.c(g7a.x((g1c) obj2), "Trailing")) {
                break;
            }
            i8++;
        }
        g1c g1cVar2 = (g1c) obj2;
        if (g1cVar2 != null) {
            i2 = g7a.D(i2, g1cVar2.G(Integer.MAX_VALUE));
            i4 = ((Number) function2.invoke(g1cVar2, Integer.valueOf(i))).intValue();
        } else {
            i4 = 0;
        }
        int size3 = list.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i9);
            if (Intrinsics.c(g7a.x((g1c) obj3), "Label")) {
                break;
            }
            i9++;
        }
        Object obj8 = (g1c) obj3;
        int intValue = obj8 != null ? ((Number) function2.invoke(obj8, Integer.valueOf(b6a.u(invoke, i2, i)))).intValue() : 0;
        int size4 = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i10);
            if (Intrinsics.c(g7a.x((g1c) obj4), "Prefix")) {
                break;
            }
            i10++;
        }
        g1c g1cVar3 = (g1c) obj4;
        if (g1cVar3 != null) {
            i5 = ((Number) function2.invoke(g1cVar3, Integer.valueOf(i2))).intValue();
            i2 = g7a.D(i2, g1cVar3.G(Integer.MAX_VALUE));
        } else {
            i5 = 0;
        }
        int size5 = list.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i11);
            if (Intrinsics.c(g7a.x((g1c) obj5), "Suffix")) {
                break;
            }
            i11++;
        }
        g1c g1cVar4 = (g1c) obj5;
        if (g1cVar4 != null) {
            i6 = ((Number) function2.invoke(g1cVar4, Integer.valueOf(i2))).intValue();
            i2 = g7a.D(i2, g1cVar4.G(Integer.MAX_VALUE));
        } else {
            i6 = 0;
        }
        int size6 = list.size();
        int i12 = 0;
        while (i12 < size6) {
            Object obj9 = list.get(i12);
            if (Intrinsics.c(g7a.x((g1c) obj9), "TextField")) {
                int intValue2 = ((Number) function2.invoke(obj9, Integer.valueOf(i2))).intValue();
                int size7 = list.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i13);
                    if (Intrinsics.c(g7a.x((g1c) obj6), "Hint")) {
                        break;
                    }
                    i13++;
                }
                Object obj10 = (g1c) obj6;
                int intValue3 = obj10 != null ? ((Number) function2.invoke(obj10, Integer.valueOf(i2))).intValue() : 0;
                int size8 = list.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i14);
                    if (Intrinsics.c(g7a.x((g1c) obj7), "Supporting")) {
                        break;
                    }
                    i14++;
                }
                Object obj11 = (g1c) obj7;
                return wxdVar.b(l9aVar, i3, i4, i5, i6, intValue2, intValue, intValue3, obj11 != null ? ((Number) function2.invoke(obj11, Integer.valueOf(i))).intValue() : 0, cn3.b(0, 0, 0, 0, 15), invoke);
            }
            i12++;
            i6 = i6;
            wxdVar = this;
            i5 = i5;
        }
        ycb.b("Collection contains no element matching the predicate.");
        pvd.x();
        return 0;
    }

    public final int f(l9a l9aVar, List list, int i, Function2 function2) {
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
                    if (Intrinsics.c(g7a.x((g1c) obj4), "Leading")) {
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
                    if (Intrinsics.c(g7a.x((g1c) obj5), "Prefix")) {
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
                    if (Intrinsics.c(g7a.x((g1c) obj6), "Suffix")) {
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
                return c(l9aVar, intValue4, intValue3, intValue5, intValue6, intValue, intValue2, g1cVar6 != null ? ((Number) function2.invoke(g1cVar6, Integer.valueOf(i))).intValue() : 0, cn3.b(0, 0, 0, 0, 15), this.d.invoke());
            }
        }
        ycb.b("Collection contains no element matching the predicate.");
        pvd.x();
        return 0;
    }

    @Override // defpackage.k1c
    public final int h(l9a l9aVar, List list, int i) {
        return f(l9aVar, list, i, new mpa(22));
    }

    @Override // defpackage.k1c
    public final int i(l9a l9aVar, List list, int i) {
        return e(l9aVar, list, i, new mpa(21));
    }

    @Override // defpackage.k1c
    public final int j(l9a l9aVar, List list, int i) {
        return e(l9aVar, list, i, new mpa(19));
    }
}
