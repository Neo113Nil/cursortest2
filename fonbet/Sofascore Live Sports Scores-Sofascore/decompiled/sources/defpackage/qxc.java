package defpackage;

import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qxc implements k1c {
    public final hb8 a;

    public qxc(hb8 hb8Var) {
        this.a = hb8Var;
    }

    @Override // defpackage.k1c
    public final int a(l9a l9aVar, List list, int i) {
        ArrayList v = d7a.v(l9aVar);
        hb8 hb8Var = this.a;
        float f = hb8Var.d;
        fb8 fb8Var = hb8Var.h;
        List list2 = (List) CollectionsKt.a0(1, v);
        g1c g1cVar = list2 != null ? (g1c) CollectionsKt.firstOrNull(list2) : null;
        List list3 = (List) CollectionsKt.a0(2, v);
        fb8Var.a(g1cVar, list3 != null ? (g1c) CollectionsKt.firstOrNull(list3) : null, hb8Var.a, cn3.b(0, 0, 0, i, 7));
        if (hb8Var.a) {
            List list4 = (List) CollectionsKt.firstOrNull(v);
            if (list4 == null) {
                list4 = km5.a;
            }
            return hb8Var.d(i, l9aVar.e0(f), list4);
        }
        List list5 = (List) CollectionsKt.firstOrNull(v);
        if (list5 == null) {
            list5 = km5.a;
        }
        return hb8Var.a(list5, i, l9aVar.e0(f), l9aVar.e0(hb8Var.f), hb8Var.g, hb8Var.h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0428 A[LOOP:1: B:151:0x0426->B:152:0x0428, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x036e  */
    @Override // defpackage.k1c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final l1c d(m1c m1cVar, List list, long j) {
        k03 k03Var;
        k03 k03Var2;
        g1c g1cVar;
        g1c g1cVar2;
        int i;
        long j2;
        k6a k6aVar;
        int i2;
        char c;
        Integer num;
        bb8 bb8Var;
        Integer num2;
        int i3;
        int i4;
        ab8 b;
        ab8 ab8Var;
        int i5;
        int i6;
        g1c g1cVar3;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        ab8 ab8Var2;
        Integer num3;
        int i13;
        int i14;
        int size;
        int i15;
        int i16;
        i1d i1dVar;
        int i17;
        int i18;
        int i19;
        int j3;
        int h;
        char c2;
        int height;
        int width;
        int i20;
        g1c g1cVar4;
        Iterator it;
        k6a k6aVar2;
        Integer num4;
        long j4;
        k6a k6aVar3;
        ab8 b2;
        ab8 ab8Var3;
        int i21;
        int i22;
        Integer num5;
        long a;
        int i23;
        int i24;
        long a2;
        m1c m1cVar2 = m1cVar;
        ArrayList v = d7a.v(m1cVar2);
        final hb8 hb8Var = this.a;
        boolean z = hb8Var.a;
        final fb8 fb8Var = hb8Var.h;
        final int i25 = 0;
        if (hb8Var.g != 0 && !v.isEmpty()) {
            if (an3.g(j) != 0) {
                List list2 = (List) CollectionsKt.Y(v);
                if (list2.isEmpty()) {
                    return m1c.G0(m1cVar2, 0, 0, new gl7(17));
                }
                final int i26 = 1;
                List list3 = (List) CollectionsKt.a0(1, v);
                g1c g1cVar5 = list3 != null ? (g1c) CollectionsKt.firstOrNull(list3) : null;
                List list4 = (List) CollectionsKt.a0(2, v);
                g1c g1cVar6 = list4 != null ? (g1c) CollectionsKt.firstOrNull(list4) : null;
                list2.size();
                fb8Var.getClass();
                lna lnaVar = z ? lna.a : lna.b;
                long O = bea.O(bea.t(10, bea.s(j, lnaVar)), lnaVar);
                if (g1cVar5 != null) {
                    s02.U(g1cVar5, hb8Var, O, new Function1() { // from class: eb8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            int i27;
                            int i28;
                            int i29 = i25;
                            int i30 = 0;
                            hb8 hb8Var2 = hb8Var;
                            fb8 fb8Var2 = fb8Var;
                            qhe qheVar = (qhe) obj;
                            switch (i29) {
                                case 0:
                                    if (qheVar != null) {
                                        i30 = hb8Var2.f(qheVar);
                                        i27 = hb8Var2.e(qheVar);
                                    } else {
                                        i27 = 0;
                                    }
                                    new k6a(k6a.a(i30, i27));
                                    fb8Var2.getClass();
                                    break;
                                default:
                                    if (qheVar != null) {
                                        i30 = hb8Var2.f(qheVar);
                                        i28 = hb8Var2.e(qheVar);
                                    } else {
                                        i28 = 0;
                                    }
                                    new k6a(k6a.a(i30, i28));
                                    fb8Var2.getClass();
                                    break;
                            }
                            return Unit.a;
                        }
                    });
                }
                if (g1cVar6 != null) {
                    s02.U(g1cVar6, hb8Var, O, new Function1() { // from class: eb8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            int i27;
                            int i28;
                            int i29 = i26;
                            int i30 = 0;
                            hb8 hb8Var2 = hb8Var;
                            fb8 fb8Var2 = fb8Var;
                            qhe qheVar = (qhe) obj;
                            switch (i29) {
                                case 0:
                                    if (qheVar != null) {
                                        i30 = hb8Var2.f(qheVar);
                                        i27 = hb8Var2.e(qheVar);
                                    } else {
                                        i27 = 0;
                                    }
                                    new k6a(k6a.a(i30, i27));
                                    fb8Var2.getClass();
                                    break;
                                default:
                                    if (qheVar != null) {
                                        i30 = hb8Var2.f(qheVar);
                                        i28 = hb8Var2.e(qheVar);
                                    } else {
                                        i28 = 0;
                                    }
                                    new k6a(k6a.a(i30, i28));
                                    fb8Var2.getClass();
                                    break;
                            }
                            return Unit.a;
                        }
                    });
                }
                Iterator it2 = list2.iterator();
                float f = hb8Var.d;
                float f2 = hb8Var.f;
                long s = bea.s(j, z ? lna.a : lna.b);
                int i27 = hb8Var.g;
                fb8 fb8Var2 = hb8Var.h;
                i1d i1dVar2 = new i1d(new l1c[16], 0);
                int h2 = an3.h(s);
                int j5 = an3.j(s);
                int g = an3.g(s);
                uzc uzcVar = q6a.a;
                uzc uzcVar2 = new uzc();
                ArrayList arrayList = new ArrayList();
                i1d i1dVar3 = i1dVar2;
                int ceil = (int) Math.ceil(m1cVar2.H0(f));
                int ceil2 = (int) Math.ceil(m1cVar2.H0(f2));
                long a3 = cn3.a(0, h2, 0, g);
                long O2 = bea.O(bea.t(14, a3), z ? lna.a : lna.b);
                fsf fsfVar = new fsf();
                if (it2 instanceof mq3) {
                    m1cVar2.C0(h2);
                    m1cVar2.C0(g);
                    k03Var = new k03();
                } else {
                    k03Var = null;
                }
                if (it2.hasNext()) {
                    k03Var2 = k03Var;
                    if (it2 instanceof mq3) {
                        throw new ClassCastException();
                    }
                    g1cVar = (g1c) it2.next();
                    if (g1cVar == null) {
                        if (yaa.E(yaa.B(g1cVar)) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            yaa.B(g1cVar);
                            qhe J = g1cVar.J(O2);
                            fsfVar.a = J;
                            Unit unit = Unit.a;
                            i = ceil2;
                            a2 = k6a.a(hb8Var.f(J), hb8Var.e(J));
                        } else {
                            i = ceil2;
                            int B = z ? g1cVar.B(Integer.MAX_VALUE) : g1cVar.s(Integer.MAX_VALUE);
                            a2 = k6a.a(B, z ? g1cVar.s(B) : g1cVar.B(B));
                        }
                        g1cVar2 = g1cVar;
                        j2 = a3;
                        k6aVar = new k6a(a2);
                    } else {
                        g1cVar2 = g1cVar;
                        i = ceil2;
                        j2 = a3;
                        k6aVar = null;
                    }
                    Integer valueOf = k6aVar == null ? Integer.valueOf((int) (k6aVar.a >> 32)) : null;
                    if (k6aVar == null) {
                        i2 = h2;
                        num = Integer.valueOf((int) (k6aVar.a & 4294967295L));
                        c = ' ';
                    } else {
                        i2 = h2;
                        c = ' ';
                        num = null;
                    }
                    int[] iArr = new int[16];
                    int[] iArr2 = new int[16];
                    g1c g1cVar7 = g1cVar2;
                    vzc vzcVar = new vzc();
                    bb8Var = new bb8(i27, fb8Var2, s, ceil, i);
                    int i28 = i;
                    num2 = valueOf;
                    i3 = i27;
                    i4 = ceil;
                    k6a k6aVar4 = k6aVar;
                    b = bb8Var.b(it2.hasNext(), 0, k6a.a(i2, g), k6aVar4, 0, 0, 0, false, false);
                    if (b.b) {
                        ab8Var = b;
                    } else {
                        ab8Var = b;
                        bb8Var.a(ab8Var, k6aVar4 != null, -1, 0, i2, 0);
                    }
                    i5 = i2;
                    i6 = i5;
                    vzc vzcVar2 = vzcVar;
                    g1cVar3 = g1cVar7;
                    int[] iArr3 = iArr;
                    i7 = 0;
                    i8 = 0;
                    i9 = 0;
                    i10 = 0;
                    i11 = 0;
                    int i29 = 0;
                    int i30 = 0;
                    int[] iArr4 = iArr2;
                    int i31 = j5;
                    i12 = g;
                    ab8Var2 = ab8Var;
                    num3 = num;
                    i13 = 0;
                    while (!ab8Var2.b && g1cVar3 != null) {
                        num2.getClass();
                        int intValue = num2.intValue();
                        num3.getClass();
                        int intValue2 = num3.intValue();
                        int i32 = i5;
                        int i33 = i8 + intValue;
                        int max = Math.max(i7, intValue2);
                        int i34 = i6 - intValue;
                        int i35 = i13 + 1;
                        fb8Var2.getClass();
                        arrayList.add(g1cVar3);
                        uzcVar2.i(i13, fsfVar.a);
                        g1cVar3.h();
                        int i36 = i35 - i9;
                        boolean z2 = i36 >= i3;
                        if (k03Var2 == null) {
                            if (z2) {
                                int i37 = i34 - i4;
                                if (i37 < 0) {
                                    i20 = i3;
                                    i23 = 0;
                                } else {
                                    i20 = i3;
                                    i23 = i37;
                                }
                            } else {
                                i20 = i3;
                                i23 = i32;
                            }
                            m1cVar2.C0(i23);
                            if (z2) {
                                i24 = i12;
                            } else {
                                i24 = (i12 - max) - i28;
                                if (i24 < 0) {
                                    i24 = 0;
                                }
                            }
                            m1cVar2.C0(i24);
                            Unit unit2 = Unit.a;
                        } else {
                            i20 = i3;
                        }
                        if (it2.hasNext()) {
                            if (it2 instanceof mq3) {
                                throw new ClassCastException();
                            }
                            g1cVar4 = (g1c) it2.next();
                            fsfVar.a = null;
                            if (g1cVar4 != null) {
                                if (yaa.E(yaa.B(g1cVar4)) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                    yaa.B(g1cVar4);
                                    qhe J2 = g1cVar4.J(O2);
                                    fsfVar.a = J2;
                                    Unit unit3 = Unit.a;
                                    it = it2;
                                    a = k6a.a(hb8Var.f(J2), hb8Var.e(J2));
                                } else {
                                    it = it2;
                                    int B2 = z ? g1cVar4.B(Integer.MAX_VALUE) : g1cVar4.s(Integer.MAX_VALUE);
                                    a = k6a.a(B2, z ? g1cVar4.s(B2) : g1cVar4.B(B2));
                                }
                                k6aVar2 = new k6a(a);
                            } else {
                                it = it2;
                                k6aVar2 = null;
                            }
                            Integer valueOf2 = k6aVar2 != null ? Integer.valueOf(((int) (k6aVar2.a >> c)) + i4) : null;
                            Integer valueOf3 = k6aVar2 != null ? Integer.valueOf((int) (k6aVar2.a & 4294967295L)) : null;
                            boolean hasNext = it.hasNext();
                            int i38 = i10;
                            long a4 = k6a.a(i34, i12);
                            if (k6aVar2 == null) {
                                num4 = valueOf3;
                                j4 = O2;
                                k6aVar3 = null;
                            } else {
                                valueOf2.getClass();
                                int intValue3 = valueOf2.intValue();
                                valueOf3.getClass();
                                num4 = valueOf3;
                                j4 = O2;
                                k6aVar3 = new k6a(k6a.a(intValue3, num4.intValue()));
                            }
                            b2 = bb8Var.b(hasNext, i36, a4, k6aVar3, i38, i11, max, false, false);
                            if (b2.a) {
                                i22 = i32;
                                int min = Math.min(Math.max(i31, i33), i22);
                                int i39 = i11 + max;
                                ab8Var3 = b2;
                                bb8Var.a(ab8Var3, k6aVar2 != null, i38, i39, i34, i36);
                                int i40 = i30;
                                int i41 = i40 + 1;
                                int[] iArr5 = iArr4;
                                int[] copyOf = iArr5.length < i41 ? Arrays.copyOf(iArr5, Math.max(i41, (iArr5.length * 3) / 2)) : iArr5;
                                copyOf[i40] = max;
                                i30 = i40 + 1;
                                int i42 = (g - i39) - i28;
                                int i43 = i29;
                                int i44 = i43 + 1;
                                int[] iArr6 = iArr3;
                                int[] copyOf2 = iArr6.length < i44 ? Arrays.copyOf(iArr6, Math.max(i44, (iArr6.length * 3) / 2)) : iArr6;
                                copyOf2[i43] = i35;
                                i29 = i43 + 1;
                                num5 = valueOf2 != null ? Integer.valueOf(valueOf2.intValue() - i4) : null;
                                i10 = i38 + 1;
                                i11 = i39 + i28;
                                i31 = min;
                                i21 = i22;
                                iArr3 = copyOf2;
                                iArr4 = copyOf;
                                i9 = i35;
                                i8 = 0;
                                max = 0;
                                i12 = i42;
                            } else {
                                ab8Var3 = b2;
                                i21 = i34;
                                i22 = i32;
                                num5 = valueOf2;
                                i10 = i38;
                                i8 = i33;
                            }
                            m1cVar2 = m1cVar;
                            i5 = i22;
                            g1cVar3 = g1cVar4;
                            i13 = i35;
                            i3 = i20;
                            it2 = it;
                            ab8Var2 = ab8Var3;
                            i6 = i21;
                            i7 = max;
                            num3 = num4;
                            num2 = num5;
                            O2 = j4;
                        }
                        g1cVar4 = null;
                        fsfVar.a = null;
                        if (g1cVar4 != null) {
                        }
                        Integer valueOf22 = k6aVar2 != null ? Integer.valueOf(((int) (k6aVar2.a >> c)) + i4) : null;
                        if (k6aVar2 != null) {
                        }
                        boolean hasNext2 = it.hasNext();
                        int i382 = i10;
                        long a42 = k6a.a(i34, i12);
                        if (k6aVar2 == null) {
                        }
                        b2 = bb8Var.b(hasNext2, i36, a42, k6aVar3, i382, i11, max, false, false);
                        if (b2.a) {
                        }
                        m1cVar2 = m1cVar;
                        i5 = i22;
                        g1cVar3 = g1cVar4;
                        i13 = i35;
                        i3 = i20;
                        it2 = it;
                        ab8Var2 = ab8Var3;
                        i6 = i21;
                        i7 = max;
                        num3 = num4;
                        num2 = num5;
                        O2 = j4;
                    }
                    int[] iArr7 = iArr3;
                    int[] iArr8 = iArr4;
                    i14 = i29;
                    int i45 = i30;
                    size = arrayList.size();
                    qhe[] qheVarArr = new qhe[size];
                    for (i15 = 0; i15 < size; i15++) {
                        qheVarArr[i15] = uzcVar2.b(i15);
                    }
                    int[] iArr9 = new int[i14];
                    int[] iArr10 = new int[i14];
                    int i46 = i31;
                    int i47 = 0;
                    i16 = 0;
                    int i48 = 0;
                    while (i16 < i14) {
                        int i49 = iArr7[i16];
                        if (i16 < 0 || i16 >= i45) {
                            zzl.r("Index must be between 0 and size");
                            return null;
                        }
                        int i50 = iArr8[i16];
                        vzc vzcVar3 = vzcVar2;
                        if (vzcVar3.c(i16)) {
                            vzcVar2 = vzcVar3;
                            c2 = 65535;
                        } else {
                            c2 = 65535;
                            if (an3.g(j2) == Integer.MAX_VALUE) {
                                vzcVar2 = vzcVar3;
                                i50 = Integer.MAX_VALUE;
                            } else {
                                i50 = an3.g(j2) - i48;
                                vzcVar2 = vzcVar3;
                            }
                        }
                        int i51 = i14;
                        int i52 = i45;
                        hb8 hb8Var2 = hb8Var;
                        int[] iArr11 = iArr7;
                        ArrayList arrayList2 = arrayList;
                        i1d i1dVar4 = i1dVar3;
                        int[] iArr12 = iArr9;
                        int i53 = i4;
                        l1c C = aba.C(hb8Var2, i46, an3.i(j2), an3.h(j2), i50, i53, m1cVar, arrayList2, qheVarArr, i47, i49, iArr12, i16);
                        int i54 = i46;
                        if (z) {
                            height = C.getWidth();
                            width = C.getHeight();
                        } else {
                            height = C.getHeight();
                            width = C.getWidth();
                        }
                        iArr10[i16] = width;
                        i48 += width;
                        int max2 = Math.max(i54, height);
                        i1dVar4.b(C);
                        i16++;
                        i46 = max2;
                        hb8Var = hb8Var2;
                        i47 = i49;
                        iArr9 = iArr12;
                        i1dVar3 = i1dVar4;
                        i4 = i53;
                        i14 = i51;
                        i45 = i52;
                        arrayList = arrayList2;
                        iArr7 = iArr11;
                    }
                    i1dVar = i1dVar3;
                    int i55 = i46;
                    hb8 hb8Var3 = hb8Var;
                    int[] iArr13 = iArr9;
                    if (i1dVar.c != 0) {
                        i18 = 0;
                        i17 = 0;
                    } else {
                        i17 = i48;
                        i18 = i55;
                    }
                    pg0 pg0Var = hb8Var3.c;
                    lg0 lg0Var = hb8Var3.b;
                    if (z) {
                        int e0 = ((i1dVar.c - 1) * m1cVar.e0(lg0Var.e())) + i17;
                        int i56 = an3.i(s);
                        int g2 = an3.g(s);
                        if (e0 < i56) {
                            e0 = i56;
                        }
                        if (e0 <= g2) {
                            g2 = e0;
                        }
                        int i57 = g2;
                        lg0Var.j(m1cVar, i57, iArr10, m1cVar.getLayoutDirection(), iArr13);
                        i19 = i57;
                    } else {
                        int e02 = ((i1dVar.c - 1) * m1cVar.e0(pg0Var.e())) + i17;
                        int i58 = an3.i(s);
                        i19 = an3.g(s);
                        if (e02 < i58) {
                            e02 = i58;
                        }
                        if (e02 <= i19) {
                            i19 = e02;
                        }
                        pg0Var.b(m1cVar, i19, iArr10, iArr13);
                    }
                    j3 = an3.j(s);
                    h = an3.h(s);
                    if (i18 < j3) {
                        i18 = j3;
                    }
                    if (i18 <= h) {
                        h = i18;
                    }
                    if (z) {
                        int i59 = i19;
                        i19 = h;
                        h = i59;
                    }
                    return m1c.G0(m1cVar, i19, h, new yx7(i1dVar, 9));
                }
                k03Var2 = k03Var;
                g1cVar = null;
                if (g1cVar == null) {
                }
                if (k6aVar == null) {
                }
                if (k6aVar == null) {
                }
                int[] iArr14 = new int[16];
                int[] iArr22 = new int[16];
                g1c g1cVar72 = g1cVar2;
                vzc vzcVar4 = new vzc();
                bb8Var = new bb8(i27, fb8Var2, s, ceil, i);
                int i282 = i;
                num2 = valueOf;
                i3 = i27;
                i4 = ceil;
                k6a k6aVar42 = k6aVar;
                b = bb8Var.b(it2.hasNext(), 0, k6a.a(i2, g), k6aVar42, 0, 0, 0, false, false);
                if (b.b) {
                }
                i5 = i2;
                i6 = i5;
                vzc vzcVar22 = vzcVar4;
                g1cVar3 = g1cVar72;
                int[] iArr32 = iArr14;
                i7 = 0;
                i8 = 0;
                i9 = 0;
                i10 = 0;
                i11 = 0;
                int i292 = 0;
                int i302 = 0;
                int[] iArr42 = iArr22;
                int i312 = j5;
                i12 = g;
                ab8Var2 = ab8Var;
                num3 = num;
                i13 = 0;
                while (!ab8Var2.b) {
                    num2.getClass();
                    int intValue4 = num2.intValue();
                    num3.getClass();
                    int intValue22 = num3.intValue();
                    int i322 = i5;
                    int i332 = i8 + intValue4;
                    int max3 = Math.max(i7, intValue22);
                    int i342 = i6 - intValue4;
                    int i352 = i13 + 1;
                    fb8Var2.getClass();
                    arrayList.add(g1cVar3);
                    uzcVar2.i(i13, fsfVar.a);
                    g1cVar3.h();
                    int i362 = i352 - i9;
                    if (i362 >= i3) {
                    }
                    if (k03Var2 == null) {
                    }
                    if (it2.hasNext()) {
                    }
                    g1cVar4 = null;
                    fsfVar.a = null;
                    if (g1cVar4 != null) {
                    }
                    Integer valueOf222 = k6aVar2 != null ? Integer.valueOf(((int) (k6aVar2.a >> c)) + i4) : null;
                    if (k6aVar2 != null) {
                    }
                    boolean hasNext22 = it.hasNext();
                    int i3822 = i10;
                    long a422 = k6a.a(i342, i12);
                    if (k6aVar2 == null) {
                    }
                    b2 = bb8Var.b(hasNext22, i362, a422, k6aVar3, i3822, i11, max3, false, false);
                    if (b2.a) {
                    }
                    m1cVar2 = m1cVar;
                    i5 = i22;
                    g1cVar3 = g1cVar4;
                    i13 = i352;
                    i3 = i20;
                    it2 = it;
                    ab8Var2 = ab8Var3;
                    i6 = i21;
                    i7 = max3;
                    num3 = num4;
                    num2 = num5;
                    O2 = j4;
                }
                int[] iArr72 = iArr32;
                int[] iArr82 = iArr42;
                i14 = i292;
                int i452 = i302;
                size = arrayList.size();
                qhe[] qheVarArr2 = new qhe[size];
                while (i15 < size) {
                }
                int[] iArr92 = new int[i14];
                int[] iArr102 = new int[i14];
                int i462 = i312;
                int i472 = 0;
                i16 = 0;
                int i482 = 0;
                while (i16 < i14) {
                }
                i1dVar = i1dVar3;
                int i552 = i462;
                hb8 hb8Var32 = hb8Var;
                int[] iArr132 = iArr92;
                if (i1dVar.c != 0) {
                }
                pg0 pg0Var2 = hb8Var32.c;
                lg0 lg0Var2 = hb8Var32.b;
                if (z) {
                }
                j3 = an3.j(s);
                h = an3.h(s);
                if (i18 < j3) {
                }
                if (i18 <= h) {
                }
                if (z) {
                }
                return m1c.G0(m1cVar, i19, h, new yx7(i1dVar, 9));
            }
            fb8Var.getClass();
            db8 db8Var = db8.a;
            db8 db8Var2 = db8.a;
        }
        return m1c.G0(m1cVar2, 0, 0, new gl7(16));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qxc) && Intrinsics.c(this.a, ((qxc) obj).a);
    }

    @Override // defpackage.k1c
    public final int h(l9a l9aVar, List list, int i) {
        ArrayList v = d7a.v(l9aVar);
        hb8 hb8Var = this.a;
        float f = hb8Var.f;
        float f2 = hb8Var.d;
        fb8 fb8Var = hb8Var.h;
        List list2 = (List) CollectionsKt.a0(1, v);
        g1c g1cVar = list2 != null ? (g1c) CollectionsKt.firstOrNull(list2) : null;
        List list3 = (List) CollectionsKt.a0(2, v);
        fb8Var.a(g1cVar, list3 != null ? (g1c) CollectionsKt.firstOrNull(list3) : null, hb8Var.a, cn3.b(0, 0, 0, i, 7));
        if (hb8Var.a) {
            List list4 = (List) CollectionsKt.firstOrNull(v);
            if (list4 == null) {
                list4 = km5.a;
            }
            return hb8Var.h(list4, i, l9aVar.e0(f2), l9aVar.e0(f), hb8Var.g, hb8Var.h);
        }
        List list5 = (List) CollectionsKt.firstOrNull(v);
        if (list5 == null) {
            list5 = km5.a;
        }
        return hb8Var.a(list5, i, l9aVar.e0(f2), l9aVar.e0(f), hb8Var.g, hb8Var.h);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.k1c
    public final int i(l9a l9aVar, List list, int i) {
        ArrayList v = d7a.v(l9aVar);
        hb8 hb8Var = this.a;
        float f = hb8Var.d;
        fb8 fb8Var = hb8Var.h;
        List list2 = (List) CollectionsKt.a0(1, v);
        g1c g1cVar = list2 != null ? (g1c) CollectionsKt.firstOrNull(list2) : null;
        List list3 = (List) CollectionsKt.a0(2, v);
        fb8Var.a(g1cVar, list3 != null ? (g1c) CollectionsKt.firstOrNull(list3) : null, hb8Var.a, cn3.b(0, i, 0, 0, 13));
        if (hb8Var.a) {
            List list4 = (List) CollectionsKt.firstOrNull(v);
            if (list4 == null) {
                list4 = km5.a;
            }
            return hb8Var.a(list4, i, l9aVar.e0(f), l9aVar.e0(hb8Var.f), hb8Var.g, hb8Var.h);
        }
        List list5 = (List) CollectionsKt.firstOrNull(v);
        if (list5 == null) {
            list5 = km5.a;
        }
        return hb8Var.d(i, l9aVar.e0(f), list5);
    }

    @Override // defpackage.k1c
    public final int j(l9a l9aVar, List list, int i) {
        ArrayList v = d7a.v(l9aVar);
        hb8 hb8Var = this.a;
        float f = hb8Var.f;
        float f2 = hb8Var.d;
        fb8 fb8Var = hb8Var.h;
        List list2 = (List) CollectionsKt.a0(1, v);
        g1c g1cVar = list2 != null ? (g1c) CollectionsKt.firstOrNull(list2) : null;
        List list3 = (List) CollectionsKt.a0(2, v);
        fb8Var.a(g1cVar, list3 != null ? (g1c) CollectionsKt.firstOrNull(list3) : null, hb8Var.a, cn3.b(0, i, 0, 0, 13));
        if (hb8Var.a) {
            List list4 = (List) CollectionsKt.firstOrNull(v);
            if (list4 == null) {
                list4 = km5.a;
            }
            return hb8Var.a(list4, i, l9aVar.e0(f2), l9aVar.e0(f), hb8Var.g, hb8Var.h);
        }
        List list5 = (List) CollectionsKt.firstOrNull(v);
        if (list5 == null) {
            list5 = km5.a;
        }
        return hb8Var.h(list5, i, l9aVar.e0(f2), l9aVar.e0(f), hb8Var.g, hb8Var.h);
    }

    public final String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.a + ')';
    }
}
