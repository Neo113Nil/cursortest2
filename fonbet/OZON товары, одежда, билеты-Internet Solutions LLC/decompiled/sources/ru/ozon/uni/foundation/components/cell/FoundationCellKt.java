package ru.ozon.uni.foundation.components.cell;

import B1.I;
import B1.InterfaceC2552v;
import B1.InterfaceC2553w;
import B1.U;
import B1.V;
import B1.W;
import B1.Y;
import B1.c0;
import B1.d0;
import B1.m0;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import Z1.b;
import Z1.h;
import Z1.l;
import a1.C4912a;
import a1.c;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.richContent.data.RichContentDTO;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aå\u0001\u0010\u0016\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\"\b\u0002\u0010\u0010\u001a\u001c\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u000e\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r2(\b\u0002\u0010\u0012\u001a\"\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u000e\u0018\u00010\r2\u0018\b\u0002\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\rH\u0001¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lkotlin/Function0;", "", "start", RichContentDTO.ALIGN_CENTER, "end", "separator", "startClickHandler", "endClickHandler", "LZ1/h;", "bottomPadding", "endPadding", "Landroidx/compose/ui/e;", "modifier", "Lkotlin/Function1;", "", "LB1/U;", "checkCompliance", "Le1/b$c;", "getAlignments", "getCenterMinWidth", "FoundationCell-hW5Ac_0", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;FFLandroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LS0/k;III)V", "FoundationCell", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class FoundationCellKt {
    /* JADX WARN: Removed duplicated region for block: B:105:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0146  */
    /* renamed from: FoundationCell-hW5Ac_0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2986FoundationCellhW5Ac_0(@NotNull Function2<? super InterfaceC3967k, ? super Integer, Unit> start, @NotNull Function2<? super InterfaceC3967k, ? super Integer, Unit> center, @NotNull Function2<? super InterfaceC3967k, ? super Integer, Unit> end, @NotNull Function2<? super InterfaceC3967k, ? super Integer, Unit> separator, @NotNull Function2<? super InterfaceC3967k, ? super Integer, Unit> startClickHandler, @NotNull Function2<? super InterfaceC3967k, ? super Integer, Unit> endClickHandler, float f7, float f11, e eVar, Function1<? super List<? extends List<? extends U>>, Unit> function1, Function1<? super List<? extends List<? extends U>>, ? extends List<? extends InterfaceC6250b.c>> function12, Function1<? super U, h> function13, InterfaceC3967k interfaceC3967k, int i11, int i12, int i13) {
        int i14;
        int i15;
        float f12;
        float f13;
        int i16;
        int i17;
        e eVar2;
        int i18;
        Function1<? super List<? extends List<? extends U>>, Unit> function14;
        int i19;
        int i21;
        int i22;
        int i23;
        int i24;
        boolean n11;
        Object C11;
        int I11;
        e eVar3;
        Function1<? super List<? extends List<? extends U>>, Unit> function15;
        Function1<? super List<? extends List<? extends U>>, ? extends List<? extends InterfaceC6250b.c>> function16;
        Function1<? super U, h> function17;
        J0 m02;
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(center, "center");
        Intrinsics.checkNotNullParameter(end, "end");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(startClickHandler, "startClickHandler");
        Intrinsics.checkNotNullParameter(endClickHandler, "endClickHandler");
        C3969l u11 = interfaceC3967k.u(-1108454370);
        if ((i13 & 1) != 0) {
            i14 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i14 = i11 | (u11.F(start) ? 4 : 2);
        } else {
            i14 = i11;
        }
        if ((i13 & 2) != 0) {
            i14 |= 48;
        } else if ((i11 & 48) == 0) {
            i14 |= u11.F(center) ? 32 : 16;
        }
        int i25 = i14;
        if ((i13 & 4) != 0) {
            i25 |= 384;
            i15 = 32;
        } else {
            i15 = 32;
            if ((i11 & 384) == 0) {
                i25 |= u11.F(end) ? 256 : 128;
            }
        }
        if ((i13 & 8) != 0) {
            i25 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i25 |= u11.F(separator) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i13 & 16) != 0) {
            i25 |= 24576;
        } else if ((i11 & 24576) == 0) {
            i25 |= u11.F(startClickHandler) ? 16384 : 8192;
        }
        if ((i13 & 32) != 0) {
            i25 |= 196608;
        } else if ((i11 & 196608) == 0) {
            i25 |= u11.F(endClickHandler) ? 131072 : 65536;
        }
        if ((i13 & 64) != 0) {
            i25 |= 1572864;
        } else if ((i11 & 1572864) == 0) {
            f12 = f7;
            i25 |= u11.q(f12) ? 1048576 : 524288;
            if ((128 & i13) == 0) {
                i25 |= 12582912;
            } else if ((i11 & 12582912) == 0) {
                f13 = f11;
                i25 |= u11.q(f13) ? 8388608 : 4194304;
                i16 = 256 & i13;
                if (i16 != 0) {
                    i25 |= 100663296;
                } else if ((i11 & 100663296) == 0) {
                    i17 = 6;
                    eVar2 = eVar;
                    i25 |= u11.n(eVar2) ? 67108864 : 33554432;
                    i18 = i13 & UserVerificationMethods.USER_VERIFY_NONE;
                    if (i18 == 0) {
                        i25 |= 805306368;
                        function14 = function1;
                    } else {
                        function14 = function1;
                        if ((i11 & 805306368) == 0) {
                            i25 |= u11.F(function14) ? 536870912 : 268435456;
                        }
                    }
                    i19 = 1024 & i13;
                    if (i19 == 0) {
                        i22 = i12 | 6;
                        i21 = i19;
                    } else if ((i12 & 6) == 0) {
                        i21 = i19;
                        i22 = i12 | (u11.F(function12) ? 4 : 2);
                    } else {
                        i21 = i19;
                        i22 = i12;
                    }
                    i23 = 2048 & i13;
                    if (i23 == 0) {
                        i22 |= 48;
                    } else if ((i12 & 48) == 0) {
                        i24 = i23;
                        i22 |= u11.F(function13) ? i15 : 16;
                        if ((i25 & 306783379) != 306783378 && (i22 & 19) == 18 && u11.b()) {
                            u11.j();
                            function16 = function12;
                            function17 = function13;
                            function15 = function14;
                            eVar3 = eVar2;
                        } else {
                            e eVar4 = i16 != 0 ? e.f40358c0 : eVar2;
                            if (i18 != 0) {
                                function14 = null;
                            }
                            final Function1<? super List<? extends List<? extends U>>, ? extends List<? extends InterfaceC6250b.c>> function18 = i21 != 0 ? null : function12;
                            final Function1<? super U, h> function19 = i24 != 0 ? null : function13;
                            C4912a c11 = c.c(1449788642, new FoundationCellKt$FoundationCell$1(startClickHandler), u11);
                            C4912a c12 = c.c(2026984355, new FoundationCellKt$FoundationCell$2(endClickHandler), u11);
                            Function2[] function2Arr = new Function2[i17];
                            function2Arr[0] = start;
                            function2Arr[1] = center;
                            function2Arr[2] = end;
                            function2Arr[3] = separator;
                            function2Arr[4] = c11;
                            function2Arr[5] = c12;
                            List b02 = C7714v.b0(function2Arr);
                            final Function1<? super List<? extends List<? extends U>>, Unit> function110 = function14;
                            final float f14 = f13;
                            final float f15 = f12;
                            c0 c0Var = new c0() { // from class: ru.ozon.uni.foundation.components.cell.FoundationCellKt$FoundationCell$3
                                @Override // B1.c0
                                public int maxIntrinsicHeight(InterfaceC2553w interfaceC2553w, List<? extends List<? extends InterfaceC2552v>> measurables, int i26) {
                                    InterfaceC2552v interfaceC2552v;
                                    InterfaceC2552v interfaceC2552v2;
                                    InterfaceC2552v interfaceC2552v3;
                                    Intrinsics.checkNotNullParameter(interfaceC2553w, "<this>");
                                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                                    int Y02 = interfaceC2553w.Y0(f15);
                                    int i27 = 0;
                                    List list = (List) C7714v.Q(0, measurables);
                                    int D11 = (list == null || (interfaceC2552v3 = (InterfaceC2552v) C7714v.M(list)) == null) ? 0 : interfaceC2552v3.D(i26);
                                    List list2 = (List) C7714v.Q(1, measurables);
                                    int D12 = (list2 == null || (interfaceC2552v2 = (InterfaceC2552v) C7714v.M(list2)) == null) ? 0 : interfaceC2552v2.D(i26);
                                    List list3 = (List) C7714v.Q(2, measurables);
                                    if (list3 != null && (interfaceC2552v = (InterfaceC2552v) C7714v.M(list3)) != null) {
                                        i27 = interfaceC2552v.D(i26);
                                    }
                                    return Math.max(D11, Math.max(D12, i27)) + Y02;
                                }

                                @Override // B1.c0
                                public int maxIntrinsicWidth(InterfaceC2553w interfaceC2553w, List<? extends List<? extends InterfaceC2552v>> measurables, int i26) {
                                    InterfaceC2552v interfaceC2552v;
                                    InterfaceC2552v interfaceC2552v2;
                                    InterfaceC2552v interfaceC2552v3;
                                    Intrinsics.checkNotNullParameter(interfaceC2553w, "<this>");
                                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                                    int Y02 = interfaceC2553w.Y0(f14);
                                    int i27 = 0;
                                    List list = (List) C7714v.Q(0, measurables);
                                    int Y11 = (list == null || (interfaceC2552v3 = (InterfaceC2552v) C7714v.M(list)) == null) ? 0 : interfaceC2552v3.Y(i26);
                                    List list2 = (List) C7714v.Q(1, measurables);
                                    int Y12 = (list2 == null || (interfaceC2552v2 = (InterfaceC2552v) C7714v.M(list2)) == null) ? 0 : interfaceC2552v2.Y(i26);
                                    List list3 = (List) C7714v.Q(2, measurables);
                                    if (list3 != null && (interfaceC2552v = (InterfaceC2552v) C7714v.M(list3)) != null) {
                                        i27 = interfaceC2552v.Y(i26);
                                    }
                                    return Y11 + Y12 + i27 + Y02;
                                }

                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Removed duplicated region for block: B:102:0x027d  */
                                /* JADX WARN: Removed duplicated region for block: B:106:0x013a  */
                                /* JADX WARN: Removed duplicated region for block: B:109:0x0116  */
                                /* JADX WARN: Removed duplicated region for block: B:110:0x00da  */
                                /* JADX WARN: Removed duplicated region for block: B:111:0x00b6  */
                                /* JADX WARN: Removed duplicated region for block: B:112:0x00ad  */
                                /* JADX WARN: Removed duplicated region for block: B:21:0x00a6  */
                                /* JADX WARN: Removed duplicated region for block: B:23:0x00b3  */
                                /* JADX WARN: Removed duplicated region for block: B:26:0x00c6  */
                                /* JADX WARN: Removed duplicated region for block: B:29:0x00ea  */
                                /* JADX WARN: Removed duplicated region for block: B:38:0x011d  */
                                /* JADX WARN: Removed duplicated region for block: B:48:0x014d  */
                                /* JADX WARN: Type inference failed for: r17v12 */
                                /* JADX WARN: Type inference failed for: r17v2 */
                                /* JADX WARN: Type inference failed for: r17v3, types: [java.lang.Throwable] */
                                /* JADX WARN: Type inference failed for: r17v6, types: [java.lang.Throwable] */
                                /* JADX WARN: Type inference failed for: r4v1, types: [java.util.ArrayList] */
                                /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
                                /* JADX WARN: Type inference failed for: r4v32, types: [java.util.List] */
                                @Override // B1.c0
                                /* renamed from: measure-3p2s80s */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public W mo3measure3p2s80s(Y measure, List<? extends List<? extends U>> measurables, long j11) {
                                    ?? arrayList;
                                    int i26;
                                    U u12;
                                    m0 m0Var;
                                    m0 m0Var2;
                                    U u13;
                                    m0 m0Var3;
                                    int k11;
                                    U u14;
                                    int i27;
                                    m0 m0Var4;
                                    ?? r17;
                                    InterfaceC6250b.c cVar;
                                    m0 m0Var5;
                                    m0 m0Var6;
                                    W z02;
                                    U u15;
                                    U u16;
                                    h invoke;
                                    List<InterfaceC6250b.c> invoke2;
                                    Intrinsics.checkNotNullParameter(measure, "$this$measure");
                                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                                    Function1<List<? extends List<? extends U>>, Unit> function111 = function110;
                                    if (function111 != null) {
                                        function111.invoke(measurables);
                                    }
                                    int Y02 = measure.Y0(f15);
                                    int Y03 = measure.Y0(f14);
                                    Function1<List<? extends List<? extends U>>, List<InterfaceC6250b.c>> function112 = function18;
                                    if (function112 == null || (invoke2 = function112.invoke(measurables)) == null || (arrayList = C7714v.K0(invoke2, 3)) == 0) {
                                        arrayList = new ArrayList(measurables.size());
                                        int size = measurables.size();
                                        for (int i28 = 0; i28 < size; i28++) {
                                            measurables.get(i28);
                                            arrayList.add(InterfaceC6250b.a.i());
                                        }
                                    }
                                    InterfaceC6250b.c cVar2 = (InterfaceC6250b.c) arrayList.get(0);
                                    InterfaceC6250b.c cVar3 = (InterfaceC6250b.c) arrayList.get(1);
                                    InterfaceC6250b.c cVar4 = (InterfaceC6250b.c) arrayList.get(2);
                                    U u17 = (U) C7714v.M(measurables.get(1));
                                    if (u17 != null) {
                                        Function1<U, h> function113 = function19;
                                        Integer valueOf = (function113 == null || (invoke = function113.invoke(u17)) == null) ? null : Integer.valueOf(measure.Y0(invoke.d()));
                                        if (valueOf != null) {
                                            i26 = valueOf.intValue();
                                            int k12 = !b.g(j11) ? (b.k(j11) - i26) - Y03 : b.k(j11);
                                            int i29 = k12 >= 0 ? 0 : k12;
                                            u12 = (U) C7714v.M(measurables.get(0));
                                            if (u12 == null) {
                                                m0Var = null;
                                                m0Var2 = u12.a0(b.c(0, i29, 0, 0, 12, j11));
                                            } else {
                                                m0Var = null;
                                                m0Var2 = null;
                                            }
                                            u13 = (U) C7714v.M(measurables.get(2));
                                            if (u13 == null) {
                                                m0Var3 = u13.a0(b.c(0, b.g(j11) ? i29 - (m0Var2 != null ? m0Var2.u0() : 0) : b.k(j11), 0, 0, 12, j11));
                                            } else {
                                                m0Var3 = m0Var;
                                            }
                                            if (b.g(j11)) {
                                                k11 = b.k(j11);
                                            } else {
                                                k11 = (b.k(j11) - Y03) - ((m0Var2 != null ? m0Var2.u0() : 0) + (m0Var3 != null ? m0Var3.u0() : 0));
                                                if (k11 < 0) {
                                                    k11 = 0;
                                                }
                                            }
                                            int i31 = k11;
                                            u14 = (U) C7714v.M(measurables.get(1));
                                            if (u14 != null) {
                                                throw new IllegalStateException("В center-лямбде Cell нет контента. Там должен быть контент");
                                            }
                                            m0 a02 = u14.a0(b.c(b.g(j11) ? i31 : 0, i31, 0, 0, 12, j11));
                                            U u18 = (U) C7714v.D0(measurables.get(3));
                                            if (u18 != null) {
                                                ?? r172 = m0Var;
                                                int u02 = a02.u0() + (m0Var3 != null ? m0Var3.u0() : 0) + Y03;
                                                if (u02 < 0) {
                                                    l.a("width(" + u02 + ") must be >= 0");
                                                    throw r172;
                                                }
                                                i27 = Y03;
                                                m0Var4 = m0Var2;
                                                m0Var = u18.a0(Z1.c.i(u02, u02, 0, Integer.MAX_VALUE));
                                                r17 = r172;
                                            } else {
                                                i27 = Y03;
                                                m0Var4 = m0Var2;
                                                r17 = m0Var;
                                            }
                                            int u03 = a02.u0() + (m0Var4 != null ? m0Var4.u0() : 0) + (m0Var3 != null ? m0Var3.u0() : 0);
                                            int max = Math.max(m0Var4 != null ? m0Var4.l0() : 0, Math.max(a02.l0(), m0Var3 != null ? m0Var3.l0() : 0));
                                            if (m0Var4 == null || (u16 = (U) C7714v.D0(measurables.get(4))) == null) {
                                                cVar = cVar2;
                                                m0Var5 = r17;
                                            } else {
                                                int u04 = m0Var4.u0();
                                                if (u04 < 0 || max < 0) {
                                                    l.a("width(" + u04 + ") and height(" + max + ") must be >= 0");
                                                    throw r17;
                                                }
                                                cVar = cVar2;
                                                m0Var5 = u16.a0(Z1.c.i(u04, u04, max, max));
                                            }
                                            if (m0Var3 == null || (u15 = (U) C7714v.D0(measurables.get(5))) == null) {
                                                m0Var6 = r17;
                                            } else {
                                                int u05 = m0Var3.u0();
                                                if (u05 < 0 || max < 0) {
                                                    l.a("width(" + u05 + ") and height(" + max + ") must be >= 0");
                                                    throw r17;
                                                }
                                                m0Var6 = u15.a0(Z1.c.i(u05, u05, max, max));
                                            }
                                            z02 = measure.z0(u03 + i27, max + Y02, kotlin.collections.U.c(), new FoundationCellKt$FoundationCell$3$measure$2(m0Var5, m0Var4, cVar, max, m0Var6, a02, m0Var3, cVar4, cVar3, m0Var, Y02));
                                            return z02;
                                        }
                                    }
                                    i26 = 0;
                                    if (!b.g(j11)) {
                                    }
                                    if (k12 >= 0) {
                                    }
                                    u12 = (U) C7714v.M(measurables.get(0));
                                    if (u12 == null) {
                                    }
                                    u13 = (U) C7714v.M(measurables.get(2));
                                    if (u13 == null) {
                                    }
                                    if (b.g(j11)) {
                                    }
                                    int i312 = k11;
                                    u14 = (U) C7714v.M(measurables.get(1));
                                    if (u14 != null) {
                                    }
                                }

                                @Override // B1.c0
                                public int minIntrinsicHeight(InterfaceC2553w interfaceC2553w, List<? extends List<? extends InterfaceC2552v>> measurables, int i26) {
                                    InterfaceC2552v interfaceC2552v;
                                    InterfaceC2552v interfaceC2552v2;
                                    InterfaceC2552v interfaceC2552v3;
                                    Intrinsics.checkNotNullParameter(interfaceC2553w, "<this>");
                                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                                    int Y02 = interfaceC2553w.Y0(f15);
                                    int i27 = 0;
                                    List list = (List) C7714v.Q(0, measurables);
                                    int O11 = (list == null || (interfaceC2552v3 = (InterfaceC2552v) C7714v.M(list)) == null) ? 0 : interfaceC2552v3.O(i26);
                                    List list2 = (List) C7714v.Q(1, measurables);
                                    int O12 = (list2 == null || (interfaceC2552v2 = (InterfaceC2552v) C7714v.M(list2)) == null) ? 0 : interfaceC2552v2.O(i26);
                                    List list3 = (List) C7714v.Q(2, measurables);
                                    if (list3 != null && (interfaceC2552v = (InterfaceC2552v) C7714v.M(list3)) != null) {
                                        i27 = interfaceC2552v.O(i26);
                                    }
                                    return Math.max(O11, Math.max(O12, i27)) + Y02;
                                }

                                @Override // B1.c0
                                public int minIntrinsicWidth(InterfaceC2553w interfaceC2553w, List<? extends List<? extends InterfaceC2552v>> measurables, int i26) {
                                    InterfaceC2552v interfaceC2552v;
                                    InterfaceC2552v interfaceC2552v2;
                                    InterfaceC2552v interfaceC2552v3;
                                    Intrinsics.checkNotNullParameter(interfaceC2553w, "<this>");
                                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                                    int Y02 = interfaceC2553w.Y0(f14);
                                    int i27 = 0;
                                    List list = (List) C7714v.Q(0, measurables);
                                    int T11 = (list == null || (interfaceC2552v3 = (InterfaceC2552v) C7714v.M(list)) == null) ? 0 : interfaceC2552v3.T(i26);
                                    List list2 = (List) C7714v.Q(1, measurables);
                                    int T12 = (list2 == null || (interfaceC2552v2 = (InterfaceC2552v) C7714v.M(list2)) == null) ? 0 : interfaceC2552v2.T(i26);
                                    List list3 = (List) C7714v.Q(2, measurables);
                                    if (list3 != null && (interfaceC2552v = (InterfaceC2552v) C7714v.M(list3)) != null) {
                                        i27 = interfaceC2552v.T(i26);
                                    }
                                    return T11 + T12 + i27 + Y02;
                                }
                            };
                            C4912a b11 = I.b(b02);
                            n11 = u11.n(c0Var);
                            C11 = u11.C();
                            if (!n11 || C11 == InterfaceC3967k.a.a()) {
                                C11 = new d0(c0Var);
                                u11.x(C11);
                            }
                            V v11 = (V) C11;
                            I11 = u11.I();
                            A0 d11 = u11.d();
                            e f16 = androidx.compose.ui.c.f(u11, eVar4);
                            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
                            if (u11.t()) {
                                u11.H(a11);
                            } else {
                                u11.e();
                            }
                            Function2 f17 = E.f(u11, v11, u11, d11);
                            if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                                a.d(I11, u11, I11, f17);
                            }
                            F1.b(u11, f16, InterfaceC2801g.a.f());
                            b11.invoke(u11, 0);
                            u11.f();
                            eVar3 = eVar4;
                            function15 = function110;
                            function16 = function18;
                            function17 = function19;
                        }
                        m02 = u11.m0();
                        if (m02 != null) {
                            m02.G(new FoundationCellKt$FoundationCell$4(start, center, end, separator, startClickHandler, endClickHandler, f7, f11, eVar3, function15, function16, function17, i11, i12, i13));
                            return;
                        }
                        return;
                    }
                    i24 = i23;
                    if ((i25 & 306783379) != 306783378) {
                    }
                    if (i16 != 0) {
                    }
                    if (i18 != 0) {
                    }
                    if (i21 != 0) {
                    }
                    if (i24 != 0) {
                    }
                    C4912a c112 = c.c(1449788642, new FoundationCellKt$FoundationCell$1(startClickHandler), u11);
                    C4912a c122 = c.c(2026984355, new FoundationCellKt$FoundationCell$2(endClickHandler), u11);
                    Function2[] function2Arr2 = new Function2[i17];
                    function2Arr2[0] = start;
                    function2Arr2[1] = center;
                    function2Arr2[2] = end;
                    function2Arr2[3] = separator;
                    function2Arr2[4] = c112;
                    function2Arr2[5] = c122;
                    List b022 = C7714v.b0(function2Arr2);
                    final Function1<? super List<? extends List<? extends U>>, Unit> function1102 = function14;
                    final float f142 = f13;
                    final float f152 = f12;
                    c0 c0Var2 = new c0() { // from class: ru.ozon.uni.foundation.components.cell.FoundationCellKt$FoundationCell$3
                        @Override // B1.c0
                        public int maxIntrinsicHeight(InterfaceC2553w interfaceC2553w, List<? extends List<? extends InterfaceC2552v>> measurables, int i26) {
                            InterfaceC2552v interfaceC2552v;
                            InterfaceC2552v interfaceC2552v2;
                            InterfaceC2552v interfaceC2552v3;
                            Intrinsics.checkNotNullParameter(interfaceC2553w, "<this>");
                            Intrinsics.checkNotNullParameter(measurables, "measurables");
                            int Y02 = interfaceC2553w.Y0(f152);
                            int i27 = 0;
                            List list = (List) C7714v.Q(0, measurables);
                            int D11 = (list == null || (interfaceC2552v3 = (InterfaceC2552v) C7714v.M(list)) == null) ? 0 : interfaceC2552v3.D(i26);
                            List list2 = (List) C7714v.Q(1, measurables);
                            int D12 = (list2 == null || (interfaceC2552v2 = (InterfaceC2552v) C7714v.M(list2)) == null) ? 0 : interfaceC2552v2.D(i26);
                            List list3 = (List) C7714v.Q(2, measurables);
                            if (list3 != null && (interfaceC2552v = (InterfaceC2552v) C7714v.M(list3)) != null) {
                                i27 = interfaceC2552v.D(i26);
                            }
                            return Math.max(D11, Math.max(D12, i27)) + Y02;
                        }

                        @Override // B1.c0
                        public int maxIntrinsicWidth(InterfaceC2553w interfaceC2553w, List<? extends List<? extends InterfaceC2552v>> measurables, int i26) {
                            InterfaceC2552v interfaceC2552v;
                            InterfaceC2552v interfaceC2552v2;
                            InterfaceC2552v interfaceC2552v3;
                            Intrinsics.checkNotNullParameter(interfaceC2553w, "<this>");
                            Intrinsics.checkNotNullParameter(measurables, "measurables");
                            int Y02 = interfaceC2553w.Y0(f142);
                            int i27 = 0;
                            List list = (List) C7714v.Q(0, measurables);
                            int Y11 = (list == null || (interfaceC2552v3 = (InterfaceC2552v) C7714v.M(list)) == null) ? 0 : interfaceC2552v3.Y(i26);
                            List list2 = (List) C7714v.Q(1, measurables);
                            int Y12 = (list2 == null || (interfaceC2552v2 = (InterfaceC2552v) C7714v.M(list2)) == null) ? 0 : interfaceC2552v2.Y(i26);
                            List list3 = (List) C7714v.Q(2, measurables);
                            if (list3 != null && (interfaceC2552v = (InterfaceC2552v) C7714v.M(list3)) != null) {
                                i27 = interfaceC2552v.Y(i26);
                            }
                            return Y11 + Y12 + i27 + Y02;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Removed duplicated region for block: B:102:0x027d  */
                        /* JADX WARN: Removed duplicated region for block: B:106:0x013a  */
                        /* JADX WARN: Removed duplicated region for block: B:109:0x0116  */
                        /* JADX WARN: Removed duplicated region for block: B:110:0x00da  */
                        /* JADX WARN: Removed duplicated region for block: B:111:0x00b6  */
                        /* JADX WARN: Removed duplicated region for block: B:112:0x00ad  */
                        /* JADX WARN: Removed duplicated region for block: B:21:0x00a6  */
                        /* JADX WARN: Removed duplicated region for block: B:23:0x00b3  */
                        /* JADX WARN: Removed duplicated region for block: B:26:0x00c6  */
                        /* JADX WARN: Removed duplicated region for block: B:29:0x00ea  */
                        /* JADX WARN: Removed duplicated region for block: B:38:0x011d  */
                        /* JADX WARN: Removed duplicated region for block: B:48:0x014d  */
                        /* JADX WARN: Type inference failed for: r17v12 */
                        /* JADX WARN: Type inference failed for: r17v2 */
                        /* JADX WARN: Type inference failed for: r17v3, types: [java.lang.Throwable] */
                        /* JADX WARN: Type inference failed for: r17v6, types: [java.lang.Throwable] */
                        /* JADX WARN: Type inference failed for: r4v1, types: [java.util.ArrayList] */
                        /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
                        /* JADX WARN: Type inference failed for: r4v32, types: [java.util.List] */
                        @Override // B1.c0
                        /* renamed from: measure-3p2s80s */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public W mo3measure3p2s80s(Y measure, List<? extends List<? extends U>> measurables, long j11) {
                            ?? arrayList;
                            int i26;
                            U u12;
                            m0 m0Var;
                            m0 m0Var2;
                            U u13;
                            m0 m0Var3;
                            int k11;
                            U u14;
                            int i27;
                            m0 m0Var4;
                            ?? r17;
                            InterfaceC6250b.c cVar;
                            m0 m0Var5;
                            m0 m0Var6;
                            W z02;
                            U u15;
                            U u16;
                            h invoke;
                            List<InterfaceC6250b.c> invoke2;
                            Intrinsics.checkNotNullParameter(measure, "$this$measure");
                            Intrinsics.checkNotNullParameter(measurables, "measurables");
                            Function1<List<? extends List<? extends U>>, Unit> function111 = function1102;
                            if (function111 != null) {
                                function111.invoke(measurables);
                            }
                            int Y02 = measure.Y0(f152);
                            int Y03 = measure.Y0(f142);
                            Function1<List<? extends List<? extends U>>, List<InterfaceC6250b.c>> function112 = function18;
                            if (function112 == null || (invoke2 = function112.invoke(measurables)) == null || (arrayList = C7714v.K0(invoke2, 3)) == 0) {
                                arrayList = new ArrayList(measurables.size());
                                int size = measurables.size();
                                for (int i28 = 0; i28 < size; i28++) {
                                    measurables.get(i28);
                                    arrayList.add(InterfaceC6250b.a.i());
                                }
                            }
                            InterfaceC6250b.c cVar2 = (InterfaceC6250b.c) arrayList.get(0);
                            InterfaceC6250b.c cVar3 = (InterfaceC6250b.c) arrayList.get(1);
                            InterfaceC6250b.c cVar4 = (InterfaceC6250b.c) arrayList.get(2);
                            U u17 = (U) C7714v.M(measurables.get(1));
                            if (u17 != null) {
                                Function1<U, h> function113 = function19;
                                Integer valueOf = (function113 == null || (invoke = function113.invoke(u17)) == null) ? null : Integer.valueOf(measure.Y0(invoke.d()));
                                if (valueOf != null) {
                                    i26 = valueOf.intValue();
                                    int k12 = !b.g(j11) ? (b.k(j11) - i26) - Y03 : b.k(j11);
                                    int i29 = k12 >= 0 ? 0 : k12;
                                    u12 = (U) C7714v.M(measurables.get(0));
                                    if (u12 == null) {
                                        m0Var = null;
                                        m0Var2 = u12.a0(b.c(0, i29, 0, 0, 12, j11));
                                    } else {
                                        m0Var = null;
                                        m0Var2 = null;
                                    }
                                    u13 = (U) C7714v.M(measurables.get(2));
                                    if (u13 == null) {
                                        m0Var3 = u13.a0(b.c(0, b.g(j11) ? i29 - (m0Var2 != null ? m0Var2.u0() : 0) : b.k(j11), 0, 0, 12, j11));
                                    } else {
                                        m0Var3 = m0Var;
                                    }
                                    if (b.g(j11)) {
                                        k11 = b.k(j11);
                                    } else {
                                        k11 = (b.k(j11) - Y03) - ((m0Var2 != null ? m0Var2.u0() : 0) + (m0Var3 != null ? m0Var3.u0() : 0));
                                        if (k11 < 0) {
                                            k11 = 0;
                                        }
                                    }
                                    int i312 = k11;
                                    u14 = (U) C7714v.M(measurables.get(1));
                                    if (u14 != null) {
                                        throw new IllegalStateException("В center-лямбде Cell нет контента. Там должен быть контент");
                                    }
                                    m0 a02 = u14.a0(b.c(b.g(j11) ? i312 : 0, i312, 0, 0, 12, j11));
                                    U u18 = (U) C7714v.D0(measurables.get(3));
                                    if (u18 != null) {
                                        ?? r172 = m0Var;
                                        int u02 = a02.u0() + (m0Var3 != null ? m0Var3.u0() : 0) + Y03;
                                        if (u02 < 0) {
                                            l.a("width(" + u02 + ") must be >= 0");
                                            throw r172;
                                        }
                                        i27 = Y03;
                                        m0Var4 = m0Var2;
                                        m0Var = u18.a0(Z1.c.i(u02, u02, 0, Integer.MAX_VALUE));
                                        r17 = r172;
                                    } else {
                                        i27 = Y03;
                                        m0Var4 = m0Var2;
                                        r17 = m0Var;
                                    }
                                    int u03 = a02.u0() + (m0Var4 != null ? m0Var4.u0() : 0) + (m0Var3 != null ? m0Var3.u0() : 0);
                                    int max = Math.max(m0Var4 != null ? m0Var4.l0() : 0, Math.max(a02.l0(), m0Var3 != null ? m0Var3.l0() : 0));
                                    if (m0Var4 == null || (u16 = (U) C7714v.D0(measurables.get(4))) == null) {
                                        cVar = cVar2;
                                        m0Var5 = r17;
                                    } else {
                                        int u04 = m0Var4.u0();
                                        if (u04 < 0 || max < 0) {
                                            l.a("width(" + u04 + ") and height(" + max + ") must be >= 0");
                                            throw r17;
                                        }
                                        cVar = cVar2;
                                        m0Var5 = u16.a0(Z1.c.i(u04, u04, max, max));
                                    }
                                    if (m0Var3 == null || (u15 = (U) C7714v.D0(measurables.get(5))) == null) {
                                        m0Var6 = r17;
                                    } else {
                                        int u05 = m0Var3.u0();
                                        if (u05 < 0 || max < 0) {
                                            l.a("width(" + u05 + ") and height(" + max + ") must be >= 0");
                                            throw r17;
                                        }
                                        m0Var6 = u15.a0(Z1.c.i(u05, u05, max, max));
                                    }
                                    z02 = measure.z0(u03 + i27, max + Y02, kotlin.collections.U.c(), new FoundationCellKt$FoundationCell$3$measure$2(m0Var5, m0Var4, cVar, max, m0Var6, a02, m0Var3, cVar4, cVar3, m0Var, Y02));
                                    return z02;
                                }
                            }
                            i26 = 0;
                            if (!b.g(j11)) {
                            }
                            if (k12 >= 0) {
                            }
                            u12 = (U) C7714v.M(measurables.get(0));
                            if (u12 == null) {
                            }
                            u13 = (U) C7714v.M(measurables.get(2));
                            if (u13 == null) {
                            }
                            if (b.g(j11)) {
                            }
                            int i3122 = k11;
                            u14 = (U) C7714v.M(measurables.get(1));
                            if (u14 != null) {
                            }
                        }

                        @Override // B1.c0
                        public int minIntrinsicHeight(InterfaceC2553w interfaceC2553w, List<? extends List<? extends InterfaceC2552v>> measurables, int i26) {
                            InterfaceC2552v interfaceC2552v;
                            InterfaceC2552v interfaceC2552v2;
                            InterfaceC2552v interfaceC2552v3;
                            Intrinsics.checkNotNullParameter(interfaceC2553w, "<this>");
                            Intrinsics.checkNotNullParameter(measurables, "measurables");
                            int Y02 = interfaceC2553w.Y0(f152);
                            int i27 = 0;
                            List list = (List) C7714v.Q(0, measurables);
                            int O11 = (list == null || (interfaceC2552v3 = (InterfaceC2552v) C7714v.M(list)) == null) ? 0 : interfaceC2552v3.O(i26);
                            List list2 = (List) C7714v.Q(1, measurables);
                            int O12 = (list2 == null || (interfaceC2552v2 = (InterfaceC2552v) C7714v.M(list2)) == null) ? 0 : interfaceC2552v2.O(i26);
                            List list3 = (List) C7714v.Q(2, measurables);
                            if (list3 != null && (interfaceC2552v = (InterfaceC2552v) C7714v.M(list3)) != null) {
                                i27 = interfaceC2552v.O(i26);
                            }
                            return Math.max(O11, Math.max(O12, i27)) + Y02;
                        }

                        @Override // B1.c0
                        public int minIntrinsicWidth(InterfaceC2553w interfaceC2553w, List<? extends List<? extends InterfaceC2552v>> measurables, int i26) {
                            InterfaceC2552v interfaceC2552v;
                            InterfaceC2552v interfaceC2552v2;
                            InterfaceC2552v interfaceC2552v3;
                            Intrinsics.checkNotNullParameter(interfaceC2553w, "<this>");
                            Intrinsics.checkNotNullParameter(measurables, "measurables");
                            int Y02 = interfaceC2553w.Y0(f142);
                            int i27 = 0;
                            List list = (List) C7714v.Q(0, measurables);
                            int T11 = (list == null || (interfaceC2552v3 = (InterfaceC2552v) C7714v.M(list)) == null) ? 0 : interfaceC2552v3.T(i26);
                            List list2 = (List) C7714v.Q(1, measurables);
                            int T12 = (list2 == null || (interfaceC2552v2 = (InterfaceC2552v) C7714v.M(list2)) == null) ? 0 : interfaceC2552v2.T(i26);
                            List list3 = (List) C7714v.Q(2, measurables);
                            if (list3 != null && (interfaceC2552v = (InterfaceC2552v) C7714v.M(list3)) != null) {
                                i27 = interfaceC2552v.T(i26);
                            }
                            return T11 + T12 + i27 + Y02;
                        }
                    };
                    C4912a b112 = I.b(b022);
                    n11 = u11.n(c0Var2);
                    C11 = u11.C();
                    if (!n11) {
                    }
                    C11 = new d0(c0Var2);
                    u11.x(C11);
                    V v112 = (V) C11;
                    I11 = u11.I();
                    A0 d112 = u11.d();
                    e f162 = androidx.compose.ui.c.f(u11, eVar4);
                    Function0 a112 = g.a(InterfaceC2801g.f5440U, u11);
                    if (u11.t()) {
                    }
                    Function2 f172 = E.f(u11, v112, u11, d112);
                    if (!u11.t()) {
                    }
                    a.d(I11, u11, I11, f172);
                    F1.b(u11, f162, InterfaceC2801g.a.f());
                    b112.invoke(u11, 0);
                    u11.f();
                    eVar3 = eVar4;
                    function15 = function1102;
                    function16 = function18;
                    function17 = function19;
                    m02 = u11.m0();
                    if (m02 != null) {
                    }
                }
                i17 = 6;
                eVar2 = eVar;
                i18 = i13 & UserVerificationMethods.USER_VERIFY_NONE;
                if (i18 == 0) {
                }
                i19 = 1024 & i13;
                if (i19 == 0) {
                }
                i23 = 2048 & i13;
                if (i23 == 0) {
                }
                i24 = i23;
                if ((i25 & 306783379) != 306783378) {
                }
                if (i16 != 0) {
                }
                if (i18 != 0) {
                }
                if (i21 != 0) {
                }
                if (i24 != 0) {
                }
                C4912a c1122 = c.c(1449788642, new FoundationCellKt$FoundationCell$1(startClickHandler), u11);
                C4912a c1222 = c.c(2026984355, new FoundationCellKt$FoundationCell$2(endClickHandler), u11);
                Function2[] function2Arr22 = new Function2[i17];
                function2Arr22[0] = start;
                function2Arr22[1] = center;
                function2Arr22[2] = end;
                function2Arr22[3] = separator;
                function2Arr22[4] = c1122;
                function2Arr22[5] = c1222;
                List b0222 = C7714v.b0(function2Arr22);
                final Function1<? super List<? extends List<? extends U>>, Unit> function11022 = function14;
                final float f1422 = f13;
                final float f1522 = f12;
                c0 c0Var22 = new c0() { // from class: ru.ozon.uni.foundation.components.cell.FoundationCellKt$FoundationCell$3
                    @Override // B1.c0
                    public int maxIntrinsicHeight(InterfaceC2553w interfaceC2553w, List<? extends List<? extends InterfaceC2552v>> measurables, int i26) {
                        InterfaceC2552v interfaceC2552v;
                        InterfaceC2552v interfaceC2552v2;
                        InterfaceC2552v interfaceC2552v3;
                        Intrinsics.checkNotNullParameter(interfaceC2553w, "<this>");
                        Intrinsics.checkNotNullParameter(measurables, "measurables");
                        int Y02 = interfaceC2553w.Y0(f1522);
                        int i27 = 0;
                        List list = (List) C7714v.Q(0, measurables);
                        int D11 = (list == null || (interfaceC2552v3 = (InterfaceC2552v) C7714v.M(list)) == null) ? 0 : interfaceC2552v3.D(i26);
                        List list2 = (List) C7714v.Q(1, measurables);
                        int D12 = (list2 == null || (interfaceC2552v2 = (InterfaceC2552v) C7714v.M(list2)) == null) ? 0 : interfaceC2552v2.D(i26);
                        List list3 = (List) C7714v.Q(2, measurables);
                        if (list3 != null && (interfaceC2552v = (InterfaceC2552v) C7714v.M(list3)) != null) {
                            i27 = interfaceC2552v.D(i26);
                        }
                        return Math.max(D11, Math.max(D12, i27)) + Y02;
                    }

                    @Override // B1.c0
                    public int maxIntrinsicWidth(InterfaceC2553w interfaceC2553w, List<? extends List<? extends InterfaceC2552v>> measurables, int i26) {
                        InterfaceC2552v interfaceC2552v;
                        InterfaceC2552v interfaceC2552v2;
                        InterfaceC2552v interfaceC2552v3;
                        Intrinsics.checkNotNullParameter(interfaceC2553w, "<this>");
                        Intrinsics.checkNotNullParameter(measurables, "measurables");
                        int Y02 = interfaceC2553w.Y0(f1422);
                        int i27 = 0;
                        List list = (List) C7714v.Q(0, measurables);
                        int Y11 = (list == null || (interfaceC2552v3 = (InterfaceC2552v) C7714v.M(list)) == null) ? 0 : interfaceC2552v3.Y(i26);
                        List list2 = (List) C7714v.Q(1, measurables);
                        int Y12 = (list2 == null || (interfaceC2552v2 = (InterfaceC2552v) C7714v.M(list2)) == null) ? 0 : interfaceC2552v2.Y(i26);
                        List list3 = (List) C7714v.Q(2, measurables);
                        if (list3 != null && (interfaceC2552v = (InterfaceC2552v) C7714v.M(list3)) != null) {
                            i27 = interfaceC2552v.Y(i26);
                        }
                        return Y11 + Y12 + i27 + Y02;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:102:0x027d  */
                    /* JADX WARN: Removed duplicated region for block: B:106:0x013a  */
                    /* JADX WARN: Removed duplicated region for block: B:109:0x0116  */
                    /* JADX WARN: Removed duplicated region for block: B:110:0x00da  */
                    /* JADX WARN: Removed duplicated region for block: B:111:0x00b6  */
                    /* JADX WARN: Removed duplicated region for block: B:112:0x00ad  */
                    /* JADX WARN: Removed duplicated region for block: B:21:0x00a6  */
                    /* JADX WARN: Removed duplicated region for block: B:23:0x00b3  */
                    /* JADX WARN: Removed duplicated region for block: B:26:0x00c6  */
                    /* JADX WARN: Removed duplicated region for block: B:29:0x00ea  */
                    /* JADX WARN: Removed duplicated region for block: B:38:0x011d  */
                    /* JADX WARN: Removed duplicated region for block: B:48:0x014d  */
                    /* JADX WARN: Type inference failed for: r17v12 */
                    /* JADX WARN: Type inference failed for: r17v2 */
                    /* JADX WARN: Type inference failed for: r17v3, types: [java.lang.Throwable] */
                    /* JADX WARN: Type inference failed for: r17v6, types: [java.lang.Throwable] */
                    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.ArrayList] */
                    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
                    /* JADX WARN: Type inference failed for: r4v32, types: [java.util.List] */
                    @Override // B1.c0
                    /* renamed from: measure-3p2s80s */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public W mo3measure3p2s80s(Y measure, List<? extends List<? extends U>> measurables, long j11) {
                        ?? arrayList;
                        int i26;
                        U u12;
                        m0 m0Var;
                        m0 m0Var2;
                        U u13;
                        m0 m0Var3;
                        int k11;
                        U u14;
                        int i27;
                        m0 m0Var4;
                        ?? r17;
                        InterfaceC6250b.c cVar;
                        m0 m0Var5;
                        m0 m0Var6;
                        W z02;
                        U u15;
                        U u16;
                        h invoke;
                        List<InterfaceC6250b.c> invoke2;
                        Intrinsics.checkNotNullParameter(measure, "$this$measure");
                        Intrinsics.checkNotNullParameter(measurables, "measurables");
                        Function1<List<? extends List<? extends U>>, Unit> function111 = function11022;
                        if (function111 != null) {
                            function111.invoke(measurables);
                        }
                        int Y02 = measure.Y0(f1522);
                        int Y03 = measure.Y0(f1422);
                        Function1<List<? extends List<? extends U>>, List<InterfaceC6250b.c>> function112 = function18;
                        if (function112 == null || (invoke2 = function112.invoke(measurables)) == null || (arrayList = C7714v.K0(invoke2, 3)) == 0) {
                            arrayList = new ArrayList(measurables.size());
                            int size = measurables.size();
                            for (int i28 = 0; i28 < size; i28++) {
                                measurables.get(i28);
                                arrayList.add(InterfaceC6250b.a.i());
                            }
                        }
                        InterfaceC6250b.c cVar2 = (InterfaceC6250b.c) arrayList.get(0);
                        InterfaceC6250b.c cVar3 = (InterfaceC6250b.c) arrayList.get(1);
                        InterfaceC6250b.c cVar4 = (InterfaceC6250b.c) arrayList.get(2);
                        U u17 = (U) C7714v.M(measurables.get(1));
                        if (u17 != null) {
                            Function1<U, h> function113 = function19;
                            Integer valueOf = (function113 == null || (invoke = function113.invoke(u17)) == null) ? null : Integer.valueOf(measure.Y0(invoke.d()));
                            if (valueOf != null) {
                                i26 = valueOf.intValue();
                                int k12 = !b.g(j11) ? (b.k(j11) - i26) - Y03 : b.k(j11);
                                int i29 = k12 >= 0 ? 0 : k12;
                                u12 = (U) C7714v.M(measurables.get(0));
                                if (u12 == null) {
                                    m0Var = null;
                                    m0Var2 = u12.a0(b.c(0, i29, 0, 0, 12, j11));
                                } else {
                                    m0Var = null;
                                    m0Var2 = null;
                                }
                                u13 = (U) C7714v.M(measurables.get(2));
                                if (u13 == null) {
                                    m0Var3 = u13.a0(b.c(0, b.g(j11) ? i29 - (m0Var2 != null ? m0Var2.u0() : 0) : b.k(j11), 0, 0, 12, j11));
                                } else {
                                    m0Var3 = m0Var;
                                }
                                if (b.g(j11)) {
                                    k11 = b.k(j11);
                                } else {
                                    k11 = (b.k(j11) - Y03) - ((m0Var2 != null ? m0Var2.u0() : 0) + (m0Var3 != null ? m0Var3.u0() : 0));
                                    if (k11 < 0) {
                                        k11 = 0;
                                    }
                                }
                                int i3122 = k11;
                                u14 = (U) C7714v.M(measurables.get(1));
                                if (u14 != null) {
                                    throw new IllegalStateException("В center-лямбде Cell нет контента. Там должен быть контент");
                                }
                                m0 a02 = u14.a0(b.c(b.g(j11) ? i3122 : 0, i3122, 0, 0, 12, j11));
                                U u18 = (U) C7714v.D0(measurables.get(3));
                                if (u18 != null) {
                                    ?? r172 = m0Var;
                                    int u02 = a02.u0() + (m0Var3 != null ? m0Var3.u0() : 0) + Y03;
                                    if (u02 < 0) {
                                        l.a("width(" + u02 + ") must be >= 0");
                                        throw r172;
                                    }
                                    i27 = Y03;
                                    m0Var4 = m0Var2;
                                    m0Var = u18.a0(Z1.c.i(u02, u02, 0, Integer.MAX_VALUE));
                                    r17 = r172;
                                } else {
                                    i27 = Y03;
                                    m0Var4 = m0Var2;
                                    r17 = m0Var;
                                }
                                int u03 = a02.u0() + (m0Var4 != null ? m0Var4.u0() : 0) + (m0Var3 != null ? m0Var3.u0() : 0);
                                int max = Math.max(m0Var4 != null ? m0Var4.l0() : 0, Math.max(a02.l0(), m0Var3 != null ? m0Var3.l0() : 0));
                                if (m0Var4 == null || (u16 = (U) C7714v.D0(measurables.get(4))) == null) {
                                    cVar = cVar2;
                                    m0Var5 = r17;
                                } else {
                                    int u04 = m0Var4.u0();
                                    if (u04 < 0 || max < 0) {
                                        l.a("width(" + u04 + ") and height(" + max + ") must be >= 0");
                                        throw r17;
                                    }
                                    cVar = cVar2;
                                    m0Var5 = u16.a0(Z1.c.i(u04, u04, max, max));
                                }
                                if (m0Var3 == null || (u15 = (U) C7714v.D0(measurables.get(5))) == null) {
                                    m0Var6 = r17;
                                } else {
                                    int u05 = m0Var3.u0();
                                    if (u05 < 0 || max < 0) {
                                        l.a("width(" + u05 + ") and height(" + max + ") must be >= 0");
                                        throw r17;
                                    }
                                    m0Var6 = u15.a0(Z1.c.i(u05, u05, max, max));
                                }
                                z02 = measure.z0(u03 + i27, max + Y02, kotlin.collections.U.c(), new FoundationCellKt$FoundationCell$3$measure$2(m0Var5, m0Var4, cVar, max, m0Var6, a02, m0Var3, cVar4, cVar3, m0Var, Y02));
                                return z02;
                            }
                        }
                        i26 = 0;
                        if (!b.g(j11)) {
                        }
                        if (k12 >= 0) {
                        }
                        u12 = (U) C7714v.M(measurables.get(0));
                        if (u12 == null) {
                        }
                        u13 = (U) C7714v.M(measurables.get(2));
                        if (u13 == null) {
                        }
                        if (b.g(j11)) {
                        }
                        int i31222 = k11;
                        u14 = (U) C7714v.M(measurables.get(1));
                        if (u14 != null) {
                        }
                    }

                    @Override // B1.c0
                    public int minIntrinsicHeight(InterfaceC2553w interfaceC2553w, List<? extends List<? extends InterfaceC2552v>> measurables, int i26) {
                        InterfaceC2552v interfaceC2552v;
                        InterfaceC2552v interfaceC2552v2;
                        InterfaceC2552v interfaceC2552v3;
                        Intrinsics.checkNotNullParameter(interfaceC2553w, "<this>");
                        Intrinsics.checkNotNullParameter(measurables, "measurables");
                        int Y02 = interfaceC2553w.Y0(f1522);
                        int i27 = 0;
                        List list = (List) C7714v.Q(0, measurables);
                        int O11 = (list == null || (interfaceC2552v3 = (InterfaceC2552v) C7714v.M(list)) == null) ? 0 : interfaceC2552v3.O(i26);
                        List list2 = (List) C7714v.Q(1, measurables);
                        int O12 = (list2 == null || (interfaceC2552v2 = (InterfaceC2552v) C7714v.M(list2)) == null) ? 0 : interfaceC2552v2.O(i26);
                        List list3 = (List) C7714v.Q(2, measurables);
                        if (list3 != null && (interfaceC2552v = (InterfaceC2552v) C7714v.M(list3)) != null) {
                            i27 = interfaceC2552v.O(i26);
                        }
                        return Math.max(O11, Math.max(O12, i27)) + Y02;
                    }

                    @Override // B1.c0
                    public int minIntrinsicWidth(InterfaceC2553w interfaceC2553w, List<? extends List<? extends InterfaceC2552v>> measurables, int i26) {
                        InterfaceC2552v interfaceC2552v;
                        InterfaceC2552v interfaceC2552v2;
                        InterfaceC2552v interfaceC2552v3;
                        Intrinsics.checkNotNullParameter(interfaceC2553w, "<this>");
                        Intrinsics.checkNotNullParameter(measurables, "measurables");
                        int Y02 = interfaceC2553w.Y0(f1422);
                        int i27 = 0;
                        List list = (List) C7714v.Q(0, measurables);
                        int T11 = (list == null || (interfaceC2552v3 = (InterfaceC2552v) C7714v.M(list)) == null) ? 0 : interfaceC2552v3.T(i26);
                        List list2 = (List) C7714v.Q(1, measurables);
                        int T12 = (list2 == null || (interfaceC2552v2 = (InterfaceC2552v) C7714v.M(list2)) == null) ? 0 : interfaceC2552v2.T(i26);
                        List list3 = (List) C7714v.Q(2, measurables);
                        if (list3 != null && (interfaceC2552v = (InterfaceC2552v) C7714v.M(list3)) != null) {
                            i27 = interfaceC2552v.T(i26);
                        }
                        return T11 + T12 + i27 + Y02;
                    }
                };
                C4912a b1122 = I.b(b0222);
                n11 = u11.n(c0Var22);
                C11 = u11.C();
                if (!n11) {
                }
                C11 = new d0(c0Var22);
                u11.x(C11);
                V v1122 = (V) C11;
                I11 = u11.I();
                A0 d1122 = u11.d();
                e f1622 = androidx.compose.ui.c.f(u11, eVar4);
                Function0 a1122 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                }
                Function2 f1722 = E.f(u11, v1122, u11, d1122);
                if (!u11.t()) {
                }
                a.d(I11, u11, I11, f1722);
                F1.b(u11, f1622, InterfaceC2801g.a.f());
                b1122.invoke(u11, 0);
                u11.f();
                eVar3 = eVar4;
                function15 = function11022;
                function16 = function18;
                function17 = function19;
                m02 = u11.m0();
                if (m02 != null) {
                }
            }
            f13 = f11;
            i16 = 256 & i13;
            if (i16 != 0) {
            }
            i17 = 6;
            eVar2 = eVar;
            i18 = i13 & UserVerificationMethods.USER_VERIFY_NONE;
            if (i18 == 0) {
            }
            i19 = 1024 & i13;
            if (i19 == 0) {
            }
            i23 = 2048 & i13;
            if (i23 == 0) {
            }
            i24 = i23;
            if ((i25 & 306783379) != 306783378) {
            }
            if (i16 != 0) {
            }
            if (i18 != 0) {
            }
            if (i21 != 0) {
            }
            if (i24 != 0) {
            }
            C4912a c11222 = c.c(1449788642, new FoundationCellKt$FoundationCell$1(startClickHandler), u11);
            C4912a c12222 = c.c(2026984355, new FoundationCellKt$FoundationCell$2(endClickHandler), u11);
            Function2[] function2Arr222 = new Function2[i17];
            function2Arr222[0] = start;
            function2Arr222[1] = center;
            function2Arr222[2] = end;
            function2Arr222[3] = separator;
            function2Arr222[4] = c11222;
            function2Arr222[5] = c12222;
            List b02222 = C7714v.b0(function2Arr222);
            final Function1<? super List<? extends List<? extends U>>, Unit> function110222 = function14;
            final float f14222 = f13;
            final float f15222 = f12;
            c0 c0Var222 = new c0() { // from class: ru.ozon.uni.foundation.components.cell.FoundationCellKt$FoundationCell$3
                @Override // B1.c0
                public int maxIntrinsicHeight(InterfaceC2553w interfaceC2553w, List<? extends List<? extends InterfaceC2552v>> measurables, int i26) {
                    InterfaceC2552v interfaceC2552v;
                    InterfaceC2552v interfaceC2552v2;
                    InterfaceC2552v interfaceC2552v3;
                    Intrinsics.checkNotNullParameter(interfaceC2553w, "<this>");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    int Y02 = interfaceC2553w.Y0(f15222);
                    int i27 = 0;
                    List list = (List) C7714v.Q(0, measurables);
                    int D11 = (list == null || (interfaceC2552v3 = (InterfaceC2552v) C7714v.M(list)) == null) ? 0 : interfaceC2552v3.D(i26);
                    List list2 = (List) C7714v.Q(1, measurables);
                    int D12 = (list2 == null || (interfaceC2552v2 = (InterfaceC2552v) C7714v.M(list2)) == null) ? 0 : interfaceC2552v2.D(i26);
                    List list3 = (List) C7714v.Q(2, measurables);
                    if (list3 != null && (interfaceC2552v = (InterfaceC2552v) C7714v.M(list3)) != null) {
                        i27 = interfaceC2552v.D(i26);
                    }
                    return Math.max(D11, Math.max(D12, i27)) + Y02;
                }

                @Override // B1.c0
                public int maxIntrinsicWidth(InterfaceC2553w interfaceC2553w, List<? extends List<? extends InterfaceC2552v>> measurables, int i26) {
                    InterfaceC2552v interfaceC2552v;
                    InterfaceC2552v interfaceC2552v2;
                    InterfaceC2552v interfaceC2552v3;
                    Intrinsics.checkNotNullParameter(interfaceC2553w, "<this>");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    int Y02 = interfaceC2553w.Y0(f14222);
                    int i27 = 0;
                    List list = (List) C7714v.Q(0, measurables);
                    int Y11 = (list == null || (interfaceC2552v3 = (InterfaceC2552v) C7714v.M(list)) == null) ? 0 : interfaceC2552v3.Y(i26);
                    List list2 = (List) C7714v.Q(1, measurables);
                    int Y12 = (list2 == null || (interfaceC2552v2 = (InterfaceC2552v) C7714v.M(list2)) == null) ? 0 : interfaceC2552v2.Y(i26);
                    List list3 = (List) C7714v.Q(2, measurables);
                    if (list3 != null && (interfaceC2552v = (InterfaceC2552v) C7714v.M(list3)) != null) {
                        i27 = interfaceC2552v.Y(i26);
                    }
                    return Y11 + Y12 + i27 + Y02;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:102:0x027d  */
                /* JADX WARN: Removed duplicated region for block: B:106:0x013a  */
                /* JADX WARN: Removed duplicated region for block: B:109:0x0116  */
                /* JADX WARN: Removed duplicated region for block: B:110:0x00da  */
                /* JADX WARN: Removed duplicated region for block: B:111:0x00b6  */
                /* JADX WARN: Removed duplicated region for block: B:112:0x00ad  */
                /* JADX WARN: Removed duplicated region for block: B:21:0x00a6  */
                /* JADX WARN: Removed duplicated region for block: B:23:0x00b3  */
                /* JADX WARN: Removed duplicated region for block: B:26:0x00c6  */
                /* JADX WARN: Removed duplicated region for block: B:29:0x00ea  */
                /* JADX WARN: Removed duplicated region for block: B:38:0x011d  */
                /* JADX WARN: Removed duplicated region for block: B:48:0x014d  */
                /* JADX WARN: Type inference failed for: r17v12 */
                /* JADX WARN: Type inference failed for: r17v2 */
                /* JADX WARN: Type inference failed for: r17v3, types: [java.lang.Throwable] */
                /* JADX WARN: Type inference failed for: r17v6, types: [java.lang.Throwable] */
                /* JADX WARN: Type inference failed for: r4v1, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r4v32, types: [java.util.List] */
                @Override // B1.c0
                /* renamed from: measure-3p2s80s */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public W mo3measure3p2s80s(Y measure, List<? extends List<? extends U>> measurables, long j11) {
                    ?? arrayList;
                    int i26;
                    U u12;
                    m0 m0Var;
                    m0 m0Var2;
                    U u13;
                    m0 m0Var3;
                    int k11;
                    U u14;
                    int i27;
                    m0 m0Var4;
                    ?? r17;
                    InterfaceC6250b.c cVar;
                    m0 m0Var5;
                    m0 m0Var6;
                    W z02;
                    U u15;
                    U u16;
                    h invoke;
                    List<InterfaceC6250b.c> invoke2;
                    Intrinsics.checkNotNullParameter(measure, "$this$measure");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    Function1<List<? extends List<? extends U>>, Unit> function111 = function110222;
                    if (function111 != null) {
                        function111.invoke(measurables);
                    }
                    int Y02 = measure.Y0(f15222);
                    int Y03 = measure.Y0(f14222);
                    Function1<List<? extends List<? extends U>>, List<InterfaceC6250b.c>> function112 = function18;
                    if (function112 == null || (invoke2 = function112.invoke(measurables)) == null || (arrayList = C7714v.K0(invoke2, 3)) == 0) {
                        arrayList = new ArrayList(measurables.size());
                        int size = measurables.size();
                        for (int i28 = 0; i28 < size; i28++) {
                            measurables.get(i28);
                            arrayList.add(InterfaceC6250b.a.i());
                        }
                    }
                    InterfaceC6250b.c cVar2 = (InterfaceC6250b.c) arrayList.get(0);
                    InterfaceC6250b.c cVar3 = (InterfaceC6250b.c) arrayList.get(1);
                    InterfaceC6250b.c cVar4 = (InterfaceC6250b.c) arrayList.get(2);
                    U u17 = (U) C7714v.M(measurables.get(1));
                    if (u17 != null) {
                        Function1<U, h> function113 = function19;
                        Integer valueOf = (function113 == null || (invoke = function113.invoke(u17)) == null) ? null : Integer.valueOf(measure.Y0(invoke.d()));
                        if (valueOf != null) {
                            i26 = valueOf.intValue();
                            int k12 = !b.g(j11) ? (b.k(j11) - i26) - Y03 : b.k(j11);
                            int i29 = k12 >= 0 ? 0 : k12;
                            u12 = (U) C7714v.M(measurables.get(0));
                            if (u12 == null) {
                                m0Var = null;
                                m0Var2 = u12.a0(b.c(0, i29, 0, 0, 12, j11));
                            } else {
                                m0Var = null;
                                m0Var2 = null;
                            }
                            u13 = (U) C7714v.M(measurables.get(2));
                            if (u13 == null) {
                                m0Var3 = u13.a0(b.c(0, b.g(j11) ? i29 - (m0Var2 != null ? m0Var2.u0() : 0) : b.k(j11), 0, 0, 12, j11));
                            } else {
                                m0Var3 = m0Var;
                            }
                            if (b.g(j11)) {
                                k11 = b.k(j11);
                            } else {
                                k11 = (b.k(j11) - Y03) - ((m0Var2 != null ? m0Var2.u0() : 0) + (m0Var3 != null ? m0Var3.u0() : 0));
                                if (k11 < 0) {
                                    k11 = 0;
                                }
                            }
                            int i31222 = k11;
                            u14 = (U) C7714v.M(measurables.get(1));
                            if (u14 != null) {
                                throw new IllegalStateException("В center-лямбде Cell нет контента. Там должен быть контент");
                            }
                            m0 a02 = u14.a0(b.c(b.g(j11) ? i31222 : 0, i31222, 0, 0, 12, j11));
                            U u18 = (U) C7714v.D0(measurables.get(3));
                            if (u18 != null) {
                                ?? r172 = m0Var;
                                int u02 = a02.u0() + (m0Var3 != null ? m0Var3.u0() : 0) + Y03;
                                if (u02 < 0) {
                                    l.a("width(" + u02 + ") must be >= 0");
                                    throw r172;
                                }
                                i27 = Y03;
                                m0Var4 = m0Var2;
                                m0Var = u18.a0(Z1.c.i(u02, u02, 0, Integer.MAX_VALUE));
                                r17 = r172;
                            } else {
                                i27 = Y03;
                                m0Var4 = m0Var2;
                                r17 = m0Var;
                            }
                            int u03 = a02.u0() + (m0Var4 != null ? m0Var4.u0() : 0) + (m0Var3 != null ? m0Var3.u0() : 0);
                            int max = Math.max(m0Var4 != null ? m0Var4.l0() : 0, Math.max(a02.l0(), m0Var3 != null ? m0Var3.l0() : 0));
                            if (m0Var4 == null || (u16 = (U) C7714v.D0(measurables.get(4))) == null) {
                                cVar = cVar2;
                                m0Var5 = r17;
                            } else {
                                int u04 = m0Var4.u0();
                                if (u04 < 0 || max < 0) {
                                    l.a("width(" + u04 + ") and height(" + max + ") must be >= 0");
                                    throw r17;
                                }
                                cVar = cVar2;
                                m0Var5 = u16.a0(Z1.c.i(u04, u04, max, max));
                            }
                            if (m0Var3 == null || (u15 = (U) C7714v.D0(measurables.get(5))) == null) {
                                m0Var6 = r17;
                            } else {
                                int u05 = m0Var3.u0();
                                if (u05 < 0 || max < 0) {
                                    l.a("width(" + u05 + ") and height(" + max + ") must be >= 0");
                                    throw r17;
                                }
                                m0Var6 = u15.a0(Z1.c.i(u05, u05, max, max));
                            }
                            z02 = measure.z0(u03 + i27, max + Y02, kotlin.collections.U.c(), new FoundationCellKt$FoundationCell$3$measure$2(m0Var5, m0Var4, cVar, max, m0Var6, a02, m0Var3, cVar4, cVar3, m0Var, Y02));
                            return z02;
                        }
                    }
                    i26 = 0;
                    if (!b.g(j11)) {
                    }
                    if (k12 >= 0) {
                    }
                    u12 = (U) C7714v.M(measurables.get(0));
                    if (u12 == null) {
                    }
                    u13 = (U) C7714v.M(measurables.get(2));
                    if (u13 == null) {
                    }
                    if (b.g(j11)) {
                    }
                    int i312222 = k11;
                    u14 = (U) C7714v.M(measurables.get(1));
                    if (u14 != null) {
                    }
                }

                @Override // B1.c0
                public int minIntrinsicHeight(InterfaceC2553w interfaceC2553w, List<? extends List<? extends InterfaceC2552v>> measurables, int i26) {
                    InterfaceC2552v interfaceC2552v;
                    InterfaceC2552v interfaceC2552v2;
                    InterfaceC2552v interfaceC2552v3;
                    Intrinsics.checkNotNullParameter(interfaceC2553w, "<this>");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    int Y02 = interfaceC2553w.Y0(f15222);
                    int i27 = 0;
                    List list = (List) C7714v.Q(0, measurables);
                    int O11 = (list == null || (interfaceC2552v3 = (InterfaceC2552v) C7714v.M(list)) == null) ? 0 : interfaceC2552v3.O(i26);
                    List list2 = (List) C7714v.Q(1, measurables);
                    int O12 = (list2 == null || (interfaceC2552v2 = (InterfaceC2552v) C7714v.M(list2)) == null) ? 0 : interfaceC2552v2.O(i26);
                    List list3 = (List) C7714v.Q(2, measurables);
                    if (list3 != null && (interfaceC2552v = (InterfaceC2552v) C7714v.M(list3)) != null) {
                        i27 = interfaceC2552v.O(i26);
                    }
                    return Math.max(O11, Math.max(O12, i27)) + Y02;
                }

                @Override // B1.c0
                public int minIntrinsicWidth(InterfaceC2553w interfaceC2553w, List<? extends List<? extends InterfaceC2552v>> measurables, int i26) {
                    InterfaceC2552v interfaceC2552v;
                    InterfaceC2552v interfaceC2552v2;
                    InterfaceC2552v interfaceC2552v3;
                    Intrinsics.checkNotNullParameter(interfaceC2553w, "<this>");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    int Y02 = interfaceC2553w.Y0(f14222);
                    int i27 = 0;
                    List list = (List) C7714v.Q(0, measurables);
                    int T11 = (list == null || (interfaceC2552v3 = (InterfaceC2552v) C7714v.M(list)) == null) ? 0 : interfaceC2552v3.T(i26);
                    List list2 = (List) C7714v.Q(1, measurables);
                    int T12 = (list2 == null || (interfaceC2552v2 = (InterfaceC2552v) C7714v.M(list2)) == null) ? 0 : interfaceC2552v2.T(i26);
                    List list3 = (List) C7714v.Q(2, measurables);
                    if (list3 != null && (interfaceC2552v = (InterfaceC2552v) C7714v.M(list3)) != null) {
                        i27 = interfaceC2552v.T(i26);
                    }
                    return T11 + T12 + i27 + Y02;
                }
            };
            C4912a b11222 = I.b(b02222);
            n11 = u11.n(c0Var222);
            C11 = u11.C();
            if (!n11) {
            }
            C11 = new d0(c0Var222);
            u11.x(C11);
            V v11222 = (V) C11;
            I11 = u11.I();
            A0 d11222 = u11.d();
            e f16222 = androidx.compose.ui.c.f(u11, eVar4);
            Function0 a11222 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
            }
            Function2 f17222 = E.f(u11, v11222, u11, d11222);
            if (!u11.t()) {
            }
            a.d(I11, u11, I11, f17222);
            F1.b(u11, f16222, InterfaceC2801g.a.f());
            b11222.invoke(u11, 0);
            u11.f();
            eVar3 = eVar4;
            function15 = function110222;
            function16 = function18;
            function17 = function19;
            m02 = u11.m0();
            if (m02 != null) {
            }
        }
        f12 = f7;
        if ((128 & i13) == 0) {
        }
        f13 = f11;
        i16 = 256 & i13;
        if (i16 != 0) {
        }
        i17 = 6;
        eVar2 = eVar;
        i18 = i13 & UserVerificationMethods.USER_VERIFY_NONE;
        if (i18 == 0) {
        }
        i19 = 1024 & i13;
        if (i19 == 0) {
        }
        i23 = 2048 & i13;
        if (i23 == 0) {
        }
        i24 = i23;
        if ((i25 & 306783379) != 306783378) {
        }
        if (i16 != 0) {
        }
        if (i18 != 0) {
        }
        if (i21 != 0) {
        }
        if (i24 != 0) {
        }
        C4912a c112222 = c.c(1449788642, new FoundationCellKt$FoundationCell$1(startClickHandler), u11);
        C4912a c122222 = c.c(2026984355, new FoundationCellKt$FoundationCell$2(endClickHandler), u11);
        Function2[] function2Arr2222 = new Function2[i17];
        function2Arr2222[0] = start;
        function2Arr2222[1] = center;
        function2Arr2222[2] = end;
        function2Arr2222[3] = separator;
        function2Arr2222[4] = c112222;
        function2Arr2222[5] = c122222;
        List b022222 = C7714v.b0(function2Arr2222);
        final Function1<? super List<? extends List<? extends U>>, Unit> function1102222 = function14;
        final float f142222 = f13;
        final float f152222 = f12;
        c0 c0Var2222 = new c0() { // from class: ru.ozon.uni.foundation.components.cell.FoundationCellKt$FoundationCell$3
            @Override // B1.c0
            public int maxIntrinsicHeight(InterfaceC2553w interfaceC2553w, List<? extends List<? extends InterfaceC2552v>> measurables, int i26) {
                InterfaceC2552v interfaceC2552v;
                InterfaceC2552v interfaceC2552v2;
                InterfaceC2552v interfaceC2552v3;
                Intrinsics.checkNotNullParameter(interfaceC2553w, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                int Y02 = interfaceC2553w.Y0(f152222);
                int i27 = 0;
                List list = (List) C7714v.Q(0, measurables);
                int D11 = (list == null || (interfaceC2552v3 = (InterfaceC2552v) C7714v.M(list)) == null) ? 0 : interfaceC2552v3.D(i26);
                List list2 = (List) C7714v.Q(1, measurables);
                int D12 = (list2 == null || (interfaceC2552v2 = (InterfaceC2552v) C7714v.M(list2)) == null) ? 0 : interfaceC2552v2.D(i26);
                List list3 = (List) C7714v.Q(2, measurables);
                if (list3 != null && (interfaceC2552v = (InterfaceC2552v) C7714v.M(list3)) != null) {
                    i27 = interfaceC2552v.D(i26);
                }
                return Math.max(D11, Math.max(D12, i27)) + Y02;
            }

            @Override // B1.c0
            public int maxIntrinsicWidth(InterfaceC2553w interfaceC2553w, List<? extends List<? extends InterfaceC2552v>> measurables, int i26) {
                InterfaceC2552v interfaceC2552v;
                InterfaceC2552v interfaceC2552v2;
                InterfaceC2552v interfaceC2552v3;
                Intrinsics.checkNotNullParameter(interfaceC2553w, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                int Y02 = interfaceC2553w.Y0(f142222);
                int i27 = 0;
                List list = (List) C7714v.Q(0, measurables);
                int Y11 = (list == null || (interfaceC2552v3 = (InterfaceC2552v) C7714v.M(list)) == null) ? 0 : interfaceC2552v3.Y(i26);
                List list2 = (List) C7714v.Q(1, measurables);
                int Y12 = (list2 == null || (interfaceC2552v2 = (InterfaceC2552v) C7714v.M(list2)) == null) ? 0 : interfaceC2552v2.Y(i26);
                List list3 = (List) C7714v.Q(2, measurables);
                if (list3 != null && (interfaceC2552v = (InterfaceC2552v) C7714v.M(list3)) != null) {
                    i27 = interfaceC2552v.Y(i26);
                }
                return Y11 + Y12 + i27 + Y02;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:102:0x027d  */
            /* JADX WARN: Removed duplicated region for block: B:106:0x013a  */
            /* JADX WARN: Removed duplicated region for block: B:109:0x0116  */
            /* JADX WARN: Removed duplicated region for block: B:110:0x00da  */
            /* JADX WARN: Removed duplicated region for block: B:111:0x00b6  */
            /* JADX WARN: Removed duplicated region for block: B:112:0x00ad  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x00a6  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x00b3  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x00c6  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x00ea  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x011d  */
            /* JADX WARN: Removed duplicated region for block: B:48:0x014d  */
            /* JADX WARN: Type inference failed for: r17v12 */
            /* JADX WARN: Type inference failed for: r17v2 */
            /* JADX WARN: Type inference failed for: r17v3, types: [java.lang.Throwable] */
            /* JADX WARN: Type inference failed for: r17v6, types: [java.lang.Throwable] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r4v32, types: [java.util.List] */
            @Override // B1.c0
            /* renamed from: measure-3p2s80s */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public W mo3measure3p2s80s(Y measure, List<? extends List<? extends U>> measurables, long j11) {
                ?? arrayList;
                int i26;
                U u12;
                m0 m0Var;
                m0 m0Var2;
                U u13;
                m0 m0Var3;
                int k11;
                U u14;
                int i27;
                m0 m0Var4;
                ?? r17;
                InterfaceC6250b.c cVar;
                m0 m0Var5;
                m0 m0Var6;
                W z02;
                U u15;
                U u16;
                h invoke;
                List<InterfaceC6250b.c> invoke2;
                Intrinsics.checkNotNullParameter(measure, "$this$measure");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                Function1<List<? extends List<? extends U>>, Unit> function111 = function1102222;
                if (function111 != null) {
                    function111.invoke(measurables);
                }
                int Y02 = measure.Y0(f152222);
                int Y03 = measure.Y0(f142222);
                Function1<List<? extends List<? extends U>>, List<InterfaceC6250b.c>> function112 = function18;
                if (function112 == null || (invoke2 = function112.invoke(measurables)) == null || (arrayList = C7714v.K0(invoke2, 3)) == 0) {
                    arrayList = new ArrayList(measurables.size());
                    int size = measurables.size();
                    for (int i28 = 0; i28 < size; i28++) {
                        measurables.get(i28);
                        arrayList.add(InterfaceC6250b.a.i());
                    }
                }
                InterfaceC6250b.c cVar2 = (InterfaceC6250b.c) arrayList.get(0);
                InterfaceC6250b.c cVar3 = (InterfaceC6250b.c) arrayList.get(1);
                InterfaceC6250b.c cVar4 = (InterfaceC6250b.c) arrayList.get(2);
                U u17 = (U) C7714v.M(measurables.get(1));
                if (u17 != null) {
                    Function1<U, h> function113 = function19;
                    Integer valueOf = (function113 == null || (invoke = function113.invoke(u17)) == null) ? null : Integer.valueOf(measure.Y0(invoke.d()));
                    if (valueOf != null) {
                        i26 = valueOf.intValue();
                        int k12 = !b.g(j11) ? (b.k(j11) - i26) - Y03 : b.k(j11);
                        int i29 = k12 >= 0 ? 0 : k12;
                        u12 = (U) C7714v.M(measurables.get(0));
                        if (u12 == null) {
                            m0Var = null;
                            m0Var2 = u12.a0(b.c(0, i29, 0, 0, 12, j11));
                        } else {
                            m0Var = null;
                            m0Var2 = null;
                        }
                        u13 = (U) C7714v.M(measurables.get(2));
                        if (u13 == null) {
                            m0Var3 = u13.a0(b.c(0, b.g(j11) ? i29 - (m0Var2 != null ? m0Var2.u0() : 0) : b.k(j11), 0, 0, 12, j11));
                        } else {
                            m0Var3 = m0Var;
                        }
                        if (b.g(j11)) {
                            k11 = b.k(j11);
                        } else {
                            k11 = (b.k(j11) - Y03) - ((m0Var2 != null ? m0Var2.u0() : 0) + (m0Var3 != null ? m0Var3.u0() : 0));
                            if (k11 < 0) {
                                k11 = 0;
                            }
                        }
                        int i312222 = k11;
                        u14 = (U) C7714v.M(measurables.get(1));
                        if (u14 != null) {
                            throw new IllegalStateException("В center-лямбде Cell нет контента. Там должен быть контент");
                        }
                        m0 a02 = u14.a0(b.c(b.g(j11) ? i312222 : 0, i312222, 0, 0, 12, j11));
                        U u18 = (U) C7714v.D0(measurables.get(3));
                        if (u18 != null) {
                            ?? r172 = m0Var;
                            int u02 = a02.u0() + (m0Var3 != null ? m0Var3.u0() : 0) + Y03;
                            if (u02 < 0) {
                                l.a("width(" + u02 + ") must be >= 0");
                                throw r172;
                            }
                            i27 = Y03;
                            m0Var4 = m0Var2;
                            m0Var = u18.a0(Z1.c.i(u02, u02, 0, Integer.MAX_VALUE));
                            r17 = r172;
                        } else {
                            i27 = Y03;
                            m0Var4 = m0Var2;
                            r17 = m0Var;
                        }
                        int u03 = a02.u0() + (m0Var4 != null ? m0Var4.u0() : 0) + (m0Var3 != null ? m0Var3.u0() : 0);
                        int max = Math.max(m0Var4 != null ? m0Var4.l0() : 0, Math.max(a02.l0(), m0Var3 != null ? m0Var3.l0() : 0));
                        if (m0Var4 == null || (u16 = (U) C7714v.D0(measurables.get(4))) == null) {
                            cVar = cVar2;
                            m0Var5 = r17;
                        } else {
                            int u04 = m0Var4.u0();
                            if (u04 < 0 || max < 0) {
                                l.a("width(" + u04 + ") and height(" + max + ") must be >= 0");
                                throw r17;
                            }
                            cVar = cVar2;
                            m0Var5 = u16.a0(Z1.c.i(u04, u04, max, max));
                        }
                        if (m0Var3 == null || (u15 = (U) C7714v.D0(measurables.get(5))) == null) {
                            m0Var6 = r17;
                        } else {
                            int u05 = m0Var3.u0();
                            if (u05 < 0 || max < 0) {
                                l.a("width(" + u05 + ") and height(" + max + ") must be >= 0");
                                throw r17;
                            }
                            m0Var6 = u15.a0(Z1.c.i(u05, u05, max, max));
                        }
                        z02 = measure.z0(u03 + i27, max + Y02, kotlin.collections.U.c(), new FoundationCellKt$FoundationCell$3$measure$2(m0Var5, m0Var4, cVar, max, m0Var6, a02, m0Var3, cVar4, cVar3, m0Var, Y02));
                        return z02;
                    }
                }
                i26 = 0;
                if (!b.g(j11)) {
                }
                if (k12 >= 0) {
                }
                u12 = (U) C7714v.M(measurables.get(0));
                if (u12 == null) {
                }
                u13 = (U) C7714v.M(measurables.get(2));
                if (u13 == null) {
                }
                if (b.g(j11)) {
                }
                int i3122222 = k11;
                u14 = (U) C7714v.M(measurables.get(1));
                if (u14 != null) {
                }
            }

            @Override // B1.c0
            public int minIntrinsicHeight(InterfaceC2553w interfaceC2553w, List<? extends List<? extends InterfaceC2552v>> measurables, int i26) {
                InterfaceC2552v interfaceC2552v;
                InterfaceC2552v interfaceC2552v2;
                InterfaceC2552v interfaceC2552v3;
                Intrinsics.checkNotNullParameter(interfaceC2553w, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                int Y02 = interfaceC2553w.Y0(f152222);
                int i27 = 0;
                List list = (List) C7714v.Q(0, measurables);
                int O11 = (list == null || (interfaceC2552v3 = (InterfaceC2552v) C7714v.M(list)) == null) ? 0 : interfaceC2552v3.O(i26);
                List list2 = (List) C7714v.Q(1, measurables);
                int O12 = (list2 == null || (interfaceC2552v2 = (InterfaceC2552v) C7714v.M(list2)) == null) ? 0 : interfaceC2552v2.O(i26);
                List list3 = (List) C7714v.Q(2, measurables);
                if (list3 != null && (interfaceC2552v = (InterfaceC2552v) C7714v.M(list3)) != null) {
                    i27 = interfaceC2552v.O(i26);
                }
                return Math.max(O11, Math.max(O12, i27)) + Y02;
            }

            @Override // B1.c0
            public int minIntrinsicWidth(InterfaceC2553w interfaceC2553w, List<? extends List<? extends InterfaceC2552v>> measurables, int i26) {
                InterfaceC2552v interfaceC2552v;
                InterfaceC2552v interfaceC2552v2;
                InterfaceC2552v interfaceC2552v3;
                Intrinsics.checkNotNullParameter(interfaceC2553w, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                int Y02 = interfaceC2553w.Y0(f142222);
                int i27 = 0;
                List list = (List) C7714v.Q(0, measurables);
                int T11 = (list == null || (interfaceC2552v3 = (InterfaceC2552v) C7714v.M(list)) == null) ? 0 : interfaceC2552v3.T(i26);
                List list2 = (List) C7714v.Q(1, measurables);
                int T12 = (list2 == null || (interfaceC2552v2 = (InterfaceC2552v) C7714v.M(list2)) == null) ? 0 : interfaceC2552v2.T(i26);
                List list3 = (List) C7714v.Q(2, measurables);
                if (list3 != null && (interfaceC2552v = (InterfaceC2552v) C7714v.M(list3)) != null) {
                    i27 = interfaceC2552v.T(i26);
                }
                return T11 + T12 + i27 + Y02;
            }
        };
        C4912a b112222 = I.b(b022222);
        n11 = u11.n(c0Var2222);
        C11 = u11.C();
        if (!n11) {
        }
        C11 = new d0(c0Var2222);
        u11.x(C11);
        V v112222 = (V) C11;
        I11 = u11.I();
        A0 d112222 = u11.d();
        e f162222 = androidx.compose.ui.c.f(u11, eVar4);
        Function0 a112222 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 f172222 = E.f(u11, v112222, u11, d112222);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, f172222);
        F1.b(u11, f162222, InterfaceC2801g.a.f());
        b112222.invoke(u11, 0);
        u11.f();
        eVar3 = eVar4;
        function15 = function1102222;
        function16 = function18;
        function17 = function19;
        m02 = u11.m0();
        if (m02 != null) {
        }
    }
}
