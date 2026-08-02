package ru.ozon.debugMenu.internal.core.ui.widgets.cell;

import B1.I;
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
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.richContent.data.RichContentDTO;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aÁ\u0001\u0010\u0015\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2(\b\u0002\u0010\u0011\u001a\"\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000e\u0018\u00010\r2\u0018\b\u0002\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\rH\u0001¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lkotlin/Function0;", "", "start", RichContentDTO.ALIGN_CENTER, "end", "separator", "startClickHandler", "endClickHandler", "LZ1/h;", "bottomPadding", "endPadding", "Landroidx/compose/ui/e;", "modifier", "Lkotlin/Function1;", "", "LB1/U;", "Le1/b$c;", "getAlignments", "getCenterMinWidth", "FoundationCell-eXZ4JBQ", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;FFLandroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LS0/k;III)V", "FoundationCell", "ozon-debug-menu_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FoundationCellKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x015d  */
    /* renamed from: FoundationCell-eXZ4JBQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1613FoundationCelleXZ4JBQ(@NotNull Function2<? super InterfaceC3967k, ? super Integer, Unit> start, @NotNull Function2<? super InterfaceC3967k, ? super Integer, Unit> center, @NotNull Function2<? super InterfaceC3967k, ? super Integer, Unit> end, @NotNull Function2<? super InterfaceC3967k, ? super Integer, Unit> separator, @NotNull Function2<? super InterfaceC3967k, ? super Integer, Unit> startClickHandler, @NotNull Function2<? super InterfaceC3967k, ? super Integer, Unit> endClickHandler, final float f7, final float f11, e eVar, Function1<? super List<? extends List<? extends U>>, ? extends List<? extends InterfaceC6250b.c>> function1, Function1<? super U, h> function12, InterfaceC3967k interfaceC3967k, int i11, int i12, int i13) {
        int i14;
        e eVar2;
        int i15;
        final Function1<? super List<? extends List<? extends U>>, ? extends List<? extends InterfaceC6250b.c>> function13;
        int i16;
        int i17;
        int i18;
        int i19;
        final Function1<? super U, h> function14;
        boolean z11;
        Object C11;
        boolean n11;
        Object C12;
        int I11;
        Function1<? super U, h> function15;
        J0 m02;
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(center, "center");
        Intrinsics.checkNotNullParameter(end, "end");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(startClickHandler, "startClickHandler");
        Intrinsics.checkNotNullParameter(endClickHandler, "endClickHandler");
        C3969l u11 = interfaceC3967k.u(-1929385673);
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
        int i21 = i14;
        if ((i13 & 4) != 0) {
            i21 |= 384;
        } else if ((i11 & 384) == 0) {
            i21 |= u11.F(end) ? 256 : 128;
        }
        if ((i13 & 8) != 0) {
            i21 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i21 |= u11.F(separator) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i13 & 16) != 0) {
            i21 |= 24576;
        } else if ((i11 & 24576) == 0) {
            i21 |= u11.F(startClickHandler) ? 16384 : 8192;
        }
        if ((i13 & 32) != 0) {
            i21 |= 196608;
        } else if ((i11 & 196608) == 0) {
            i21 |= u11.F(endClickHandler) ? 131072 : 65536;
        }
        if ((i13 & 64) != 0) {
            i21 |= 1572864;
        } else if ((i11 & 1572864) == 0) {
            i21 |= u11.q(f7) ? 1048576 : 524288;
        }
        if ((128 & i13) != 0) {
            i21 |= 12582912;
        } else if ((i11 & 12582912) == 0) {
            i21 |= u11.q(f11) ? 8388608 : 4194304;
        }
        int i22 = i13 & 256;
        if (i22 != 0) {
            i21 |= 100663296;
        } else if ((100663296 & i11) == 0) {
            eVar2 = eVar;
            i21 |= u11.n(eVar2) ? 67108864 : 33554432;
            i15 = i13 & UserVerificationMethods.USER_VERIFY_NONE;
            if (i15 == 0) {
                i21 |= 805306368;
                function13 = function1;
            } else {
                function13 = function1;
                if ((i11 & 805306368) == 0) {
                    i21 |= u11.F(function13) ? 536870912 : 268435456;
                }
            }
            i16 = i21;
            i17 = 1024 & i13;
            if (i17 == 0) {
                i19 = i12 | 6;
                i18 = i17;
            } else if ((i12 & 6) == 0) {
                i18 = i17;
                i19 = i12 | (u11.F(function12) ? 4 : 2);
            } else {
                i18 = i17;
                i19 = i12;
            }
            if ((i16 & 306783379) != 306783378 && (i19 & 3) == 2 && u11.b()) {
                u11.j();
                function15 = function12;
            } else {
                if (i22 != 0) {
                    eVar2 = e.f40358c0;
                }
                if (i15 != 0) {
                    function13 = null;
                }
                function14 = i18 == 0 ? function12 : null;
                List b02 = C7714v.b0(start, center, end, separator, c.c(-1985409037, new FoundationCellKt$FoundationCell$1(startClickHandler), u11), c.c(665609490, new FoundationCellKt$FoundationCell$2(endClickHandler), u11));
                u11.o(-276237895);
                z11 = ((i16 & 29360128) != 8388608) | ((i16 & 3670016) != 1048576) | ((i16 & 1879048192) != 536870912) | ((i19 & 14) != 4);
                C11 = u11.C();
                if (!z11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new c0() { // from class: ru.ozon.debugMenu.internal.core.ui.widgets.cell.FoundationCellKt$FoundationCell$3$1

                        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LB1/m0$a;", "", "invoke", "(LB1/m0$a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
                        /* renamed from: ru.ozon.debugMenu.internal.core.ui.widgets.cell.FoundationCellKt$FoundationCell$3$1$2, reason: invalid class name */
                        static final class AnonymousClass2 extends AbstractC7737t implements Function1<m0.a, Unit> {
                            final /* synthetic */ int $bottomPaddingPx;
                            final /* synthetic */ InterfaceC6250b.c $centerAlignment;
                            final /* synthetic */ m0 $centerPlaceable;
                            final /* synthetic */ InterfaceC6250b.c $endAlignment;
                            final /* synthetic */ m0 $endClickHandlerPlaceable;
                            final /* synthetic */ m0 $endPlaceable;
                            final /* synthetic */ int $height;
                            final /* synthetic */ m0 $separatorPlaceable;
                            final /* synthetic */ InterfaceC6250b.c $startAlignment;
                            final /* synthetic */ m0 $startClickHandlerPlaceable;
                            final /* synthetic */ m0 $startPlaceable;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            AnonymousClass2(m0 m0Var, m0 m0Var2, InterfaceC6250b.c cVar, int i11, m0 m0Var3, m0 m0Var4, m0 m0Var5, InterfaceC6250b.c cVar2, InterfaceC6250b.c cVar3, m0 m0Var6, int i12) {
                                super(1);
                                this.$startClickHandlerPlaceable = m0Var;
                                this.$startPlaceable = m0Var2;
                                this.$startAlignment = cVar;
                                this.$height = i11;
                                this.$endClickHandlerPlaceable = m0Var3;
                                this.$centerPlaceable = m0Var4;
                                this.$endPlaceable = m0Var5;
                                this.$endAlignment = cVar2;
                                this.$centerAlignment = cVar3;
                                this.$separatorPlaceable = m0Var6;
                                this.$bottomPaddingPx = i12;
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(m0.a aVar) {
                                invoke2(aVar);
                                return Unit.f71690a;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(m0.a layout) {
                                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                m0 m0Var = this.$startClickHandlerPlaceable;
                                if (m0Var != null) {
                                    layout.h(m0Var, 0, 0, 0.0f);
                                }
                                m0 m0Var2 = this.$startPlaceable;
                                if (m0Var2 != null) {
                                    layout.h(m0Var2, 0, this.$startAlignment.a(m0Var2.l0(), this.$height), 0.0f);
                                }
                                m0 m0Var3 = this.$endClickHandlerPlaceable;
                                if (m0Var3 != null) {
                                    m0 m0Var4 = this.$startPlaceable;
                                    layout.h(m0Var3, this.$centerPlaceable.u0() + (m0Var4 != null ? m0Var4.u0() : 0), 0, 0.0f);
                                }
                                m0 m0Var5 = this.$endPlaceable;
                                if (m0Var5 != null) {
                                    m0 m0Var6 = this.$startPlaceable;
                                    layout.h(m0Var5, this.$centerPlaceable.u0() + (m0Var6 != null ? m0Var6.u0() : 0), this.$endAlignment.a(this.$endPlaceable.l0(), this.$height), 0.0f);
                                }
                                m0 m0Var7 = this.$centerPlaceable;
                                m0 m0Var8 = this.$startPlaceable;
                                layout.h(m0Var7, m0Var8 != null ? m0Var8.u0() : 0, this.$centerAlignment.a(this.$centerPlaceable.l0(), this.$height), 0.0f);
                                m0 m0Var9 = this.$separatorPlaceable;
                                if (m0Var9 != null) {
                                    m0 m0Var10 = this.$startPlaceable;
                                    layout.h(m0Var9, m0Var10 != null ? m0Var10.u0() : 0, (this.$height - this.$separatorPlaceable.l0()) + this.$bottomPaddingPx, 0.0f);
                                }
                            }
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Removed duplicated region for block: B:103:0x0133  */
                        /* JADX WARN: Removed duplicated region for block: B:106:0x010f  */
                        /* JADX WARN: Removed duplicated region for block: B:107:0x00d3  */
                        /* JADX WARN: Removed duplicated region for block: B:108:0x00af  */
                        /* JADX WARN: Removed duplicated region for block: B:109:0x00a6  */
                        /* JADX WARN: Removed duplicated region for block: B:18:0x009f  */
                        /* JADX WARN: Removed duplicated region for block: B:20:0x00ac  */
                        /* JADX WARN: Removed duplicated region for block: B:23:0x00bf  */
                        /* JADX WARN: Removed duplicated region for block: B:26:0x00e3  */
                        /* JADX WARN: Removed duplicated region for block: B:35:0x0116  */
                        /* JADX WARN: Removed duplicated region for block: B:45:0x0146  */
                        /* JADX WARN: Removed duplicated region for block: B:99:0x0276  */
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
                        public final W mo3measure3p2s80s(Y Layout, List<? extends List<? extends U>> measurables, long j11) {
                            ?? arrayList;
                            int i23;
                            U u12;
                            m0 m0Var;
                            m0 m0Var2;
                            U u13;
                            m0 m0Var3;
                            int k11;
                            U u14;
                            int i24;
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
                            Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                            Intrinsics.checkNotNullParameter(measurables, "measurables");
                            int Y02 = Layout.Y0(f7);
                            int Y03 = Layout.Y0(f11);
                            Function1<List<? extends List<? extends U>>, List<InterfaceC6250b.c>> function16 = function13;
                            if (function16 == null || (invoke2 = function16.invoke(measurables)) == null || (arrayList = C7714v.K0(invoke2, 3)) == 0) {
                                arrayList = new ArrayList(measurables.size());
                                int size = measurables.size();
                                for (int i25 = 0; i25 < size; i25++) {
                                    measurables.get(i25);
                                    arrayList.add(InterfaceC6250b.a.i());
                                }
                            }
                            InterfaceC6250b.c cVar2 = (InterfaceC6250b.c) arrayList.get(0);
                            InterfaceC6250b.c cVar3 = (InterfaceC6250b.c) arrayList.get(1);
                            InterfaceC6250b.c cVar4 = (InterfaceC6250b.c) arrayList.get(2);
                            U u17 = (U) C7714v.M(measurables.get(1));
                            if (u17 != null) {
                                Function1<U, h> function17 = function14;
                                Integer valueOf = (function17 == null || (invoke = function17.invoke(u17)) == null) ? null : Integer.valueOf(Layout.Y0(invoke.d()));
                                if (valueOf != null) {
                                    i23 = valueOf.intValue();
                                    int k12 = !b.g(j11) ? (b.k(j11) - i23) - Y03 : b.k(j11);
                                    int i26 = k12 >= 0 ? 0 : k12;
                                    u12 = (U) C7714v.M(measurables.get(0));
                                    if (u12 == null) {
                                        m0Var = null;
                                        m0Var2 = u12.a0(b.c(0, i26, 0, 0, 12, j11));
                                    } else {
                                        m0Var = null;
                                        m0Var2 = null;
                                    }
                                    u13 = (U) C7714v.M(measurables.get(2));
                                    if (u13 == null) {
                                        m0Var3 = u13.a0(b.c(0, b.g(j11) ? i26 - (m0Var2 != null ? m0Var2.u0() : 0) : b.k(j11), 0, 0, 12, j11));
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
                                    int i27 = k11;
                                    u14 = (U) C7714v.M(measurables.get(1));
                                    if (u14 != null) {
                                        throw new IllegalStateException("В center-лямбде Cell нет контента. Там должен быть контент");
                                    }
                                    m0 a02 = u14.a0(b.c(b.g(j11) ? i27 : 0, i27, 0, 0, 12, j11));
                                    U u18 = (U) C7714v.D0(measurables.get(3));
                                    if (u18 != null) {
                                        ?? r172 = m0Var;
                                        int u02 = a02.u0() + (m0Var3 != null ? m0Var3.u0() : 0) + Y03;
                                        if (u02 < 0) {
                                            l.a("width(" + u02 + ") must be >= 0");
                                            throw r172;
                                        }
                                        i24 = Y03;
                                        m0Var4 = m0Var2;
                                        m0Var = u18.a0(Z1.c.i(u02, u02, 0, Integer.MAX_VALUE));
                                        r17 = r172;
                                    } else {
                                        i24 = Y03;
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
                                    z02 = Layout.z0(u03 + i24, max + Y02, kotlin.collections.U.c(), new AnonymousClass2(m0Var5, m0Var4, cVar, max, m0Var6, a02, m0Var3, cVar4, cVar3, m0Var, Y02));
                                    return z02;
                                }
                            }
                            i23 = 0;
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
                            int i272 = k11;
                            u14 = (U) C7714v.M(measurables.get(1));
                            if (u14 != null) {
                            }
                        }
                    };
                    u11.x(C11);
                }
                c0 c0Var = (c0) C11;
                u11.k();
                C4912a b11 = I.b(b02);
                n11 = u11.n(c0Var);
                Function1<? super U, h> function16 = function14;
                C12 = u11.C();
                if (!n11 || C12 == InterfaceC3967k.a.a()) {
                    C12 = new d0(c0Var);
                    u11.x(C12);
                }
                V v11 = (V) C12;
                I11 = u11.I();
                A0 d11 = u11.d();
                e f12 = androidx.compose.ui.c.f(u11, eVar2);
                Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                    u11.e();
                } else {
                    u11.H(a11);
                }
                Function2 f13 = E.f(u11, v11, u11, d11);
                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                    a.d(I11, u11, I11, f13);
                }
                F1.b(u11, f12, InterfaceC2801g.a.f());
                b11.invoke(u11, 0);
                u11.f();
                function15 = function16;
            }
            m02 = u11.m0();
            if (m02 == null) {
                m02.G(new FoundationCellKt$FoundationCell$4(start, center, end, separator, startClickHandler, endClickHandler, f7, f11, eVar2, function13, function15, i11, i12, i13));
                return;
            }
            return;
        }
        eVar2 = eVar;
        i15 = i13 & UserVerificationMethods.USER_VERIFY_NONE;
        if (i15 == 0) {
        }
        i16 = i21;
        i17 = 1024 & i13;
        if (i17 == 0) {
        }
        if ((i16 & 306783379) != 306783378) {
        }
        if (i22 != 0) {
        }
        if (i15 != 0) {
        }
        if (i18 == 0) {
        }
        List b022 = C7714v.b0(start, center, end, separator, c.c(-1985409037, new FoundationCellKt$FoundationCell$1(startClickHandler), u11), c.c(665609490, new FoundationCellKt$FoundationCell$2(endClickHandler), u11));
        u11.o(-276237895);
        if ((i16 & 3670016) != 1048576) {
        }
        z11 = ((i16 & 29360128) != 8388608) | ((i16 & 3670016) != 1048576) | ((i16 & 1879048192) != 536870912) | ((i19 & 14) != 4);
        C11 = u11.C();
        if (!z11) {
        }
        C11 = new c0() { // from class: ru.ozon.debugMenu.internal.core.ui.widgets.cell.FoundationCellKt$FoundationCell$3$1

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LB1/m0$a;", "", "invoke", "(LB1/m0$a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.debugMenu.internal.core.ui.widgets.cell.FoundationCellKt$FoundationCell$3$1$2, reason: invalid class name */
            static final class AnonymousClass2 extends AbstractC7737t implements Function1<m0.a, Unit> {
                final /* synthetic */ int $bottomPaddingPx;
                final /* synthetic */ InterfaceC6250b.c $centerAlignment;
                final /* synthetic */ m0 $centerPlaceable;
                final /* synthetic */ InterfaceC6250b.c $endAlignment;
                final /* synthetic */ m0 $endClickHandlerPlaceable;
                final /* synthetic */ m0 $endPlaceable;
                final /* synthetic */ int $height;
                final /* synthetic */ m0 $separatorPlaceable;
                final /* synthetic */ InterfaceC6250b.c $startAlignment;
                final /* synthetic */ m0 $startClickHandlerPlaceable;
                final /* synthetic */ m0 $startPlaceable;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(m0 m0Var, m0 m0Var2, InterfaceC6250b.c cVar, int i11, m0 m0Var3, m0 m0Var4, m0 m0Var5, InterfaceC6250b.c cVar2, InterfaceC6250b.c cVar3, m0 m0Var6, int i12) {
                    super(1);
                    this.$startClickHandlerPlaceable = m0Var;
                    this.$startPlaceable = m0Var2;
                    this.$startAlignment = cVar;
                    this.$height = i11;
                    this.$endClickHandlerPlaceable = m0Var3;
                    this.$centerPlaceable = m0Var4;
                    this.$endPlaceable = m0Var5;
                    this.$endAlignment = cVar2;
                    this.$centerAlignment = cVar3;
                    this.$separatorPlaceable = m0Var6;
                    this.$bottomPaddingPx = i12;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(m0.a aVar) {
                    invoke2(aVar);
                    return Unit.f71690a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(m0.a layout) {
                    Intrinsics.checkNotNullParameter(layout, "$this$layout");
                    m0 m0Var = this.$startClickHandlerPlaceable;
                    if (m0Var != null) {
                        layout.h(m0Var, 0, 0, 0.0f);
                    }
                    m0 m0Var2 = this.$startPlaceable;
                    if (m0Var2 != null) {
                        layout.h(m0Var2, 0, this.$startAlignment.a(m0Var2.l0(), this.$height), 0.0f);
                    }
                    m0 m0Var3 = this.$endClickHandlerPlaceable;
                    if (m0Var3 != null) {
                        m0 m0Var4 = this.$startPlaceable;
                        layout.h(m0Var3, this.$centerPlaceable.u0() + (m0Var4 != null ? m0Var4.u0() : 0), 0, 0.0f);
                    }
                    m0 m0Var5 = this.$endPlaceable;
                    if (m0Var5 != null) {
                        m0 m0Var6 = this.$startPlaceable;
                        layout.h(m0Var5, this.$centerPlaceable.u0() + (m0Var6 != null ? m0Var6.u0() : 0), this.$endAlignment.a(this.$endPlaceable.l0(), this.$height), 0.0f);
                    }
                    m0 m0Var7 = this.$centerPlaceable;
                    m0 m0Var8 = this.$startPlaceable;
                    layout.h(m0Var7, m0Var8 != null ? m0Var8.u0() : 0, this.$centerAlignment.a(this.$centerPlaceable.l0(), this.$height), 0.0f);
                    m0 m0Var9 = this.$separatorPlaceable;
                    if (m0Var9 != null) {
                        m0 m0Var10 = this.$startPlaceable;
                        layout.h(m0Var9, m0Var10 != null ? m0Var10.u0() : 0, (this.$height - this.$separatorPlaceable.l0()) + this.$bottomPaddingPx, 0.0f);
                    }
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:103:0x0133  */
            /* JADX WARN: Removed duplicated region for block: B:106:0x010f  */
            /* JADX WARN: Removed duplicated region for block: B:107:0x00d3  */
            /* JADX WARN: Removed duplicated region for block: B:108:0x00af  */
            /* JADX WARN: Removed duplicated region for block: B:109:0x00a6  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x009f  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x00ac  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x00bf  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x00e3  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x0116  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x0146  */
            /* JADX WARN: Removed duplicated region for block: B:99:0x0276  */
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
            public final W mo3measure3p2s80s(Y Layout, List<? extends List<? extends U>> measurables, long j11) {
                ?? arrayList;
                int i23;
                U u12;
                m0 m0Var;
                m0 m0Var2;
                U u13;
                m0 m0Var3;
                int k11;
                U u14;
                int i24;
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
                Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                int Y02 = Layout.Y0(f7);
                int Y03 = Layout.Y0(f11);
                Function1<List<? extends List<? extends U>>, List<InterfaceC6250b.c>> function162 = function13;
                if (function162 == null || (invoke2 = function162.invoke(measurables)) == null || (arrayList = C7714v.K0(invoke2, 3)) == 0) {
                    arrayList = new ArrayList(measurables.size());
                    int size = measurables.size();
                    for (int i25 = 0; i25 < size; i25++) {
                        measurables.get(i25);
                        arrayList.add(InterfaceC6250b.a.i());
                    }
                }
                InterfaceC6250b.c cVar2 = (InterfaceC6250b.c) arrayList.get(0);
                InterfaceC6250b.c cVar3 = (InterfaceC6250b.c) arrayList.get(1);
                InterfaceC6250b.c cVar4 = (InterfaceC6250b.c) arrayList.get(2);
                U u17 = (U) C7714v.M(measurables.get(1));
                if (u17 != null) {
                    Function1<U, h> function17 = function14;
                    Integer valueOf = (function17 == null || (invoke = function17.invoke(u17)) == null) ? null : Integer.valueOf(Layout.Y0(invoke.d()));
                    if (valueOf != null) {
                        i23 = valueOf.intValue();
                        int k12 = !b.g(j11) ? (b.k(j11) - i23) - Y03 : b.k(j11);
                        int i26 = k12 >= 0 ? 0 : k12;
                        u12 = (U) C7714v.M(measurables.get(0));
                        if (u12 == null) {
                            m0Var = null;
                            m0Var2 = u12.a0(b.c(0, i26, 0, 0, 12, j11));
                        } else {
                            m0Var = null;
                            m0Var2 = null;
                        }
                        u13 = (U) C7714v.M(measurables.get(2));
                        if (u13 == null) {
                            m0Var3 = u13.a0(b.c(0, b.g(j11) ? i26 - (m0Var2 != null ? m0Var2.u0() : 0) : b.k(j11), 0, 0, 12, j11));
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
                        int i272 = k11;
                        u14 = (U) C7714v.M(measurables.get(1));
                        if (u14 != null) {
                            throw new IllegalStateException("В center-лямбде Cell нет контента. Там должен быть контент");
                        }
                        m0 a02 = u14.a0(b.c(b.g(j11) ? i272 : 0, i272, 0, 0, 12, j11));
                        U u18 = (U) C7714v.D0(measurables.get(3));
                        if (u18 != null) {
                            ?? r172 = m0Var;
                            int u02 = a02.u0() + (m0Var3 != null ? m0Var3.u0() : 0) + Y03;
                            if (u02 < 0) {
                                l.a("width(" + u02 + ") must be >= 0");
                                throw r172;
                            }
                            i24 = Y03;
                            m0Var4 = m0Var2;
                            m0Var = u18.a0(Z1.c.i(u02, u02, 0, Integer.MAX_VALUE));
                            r17 = r172;
                        } else {
                            i24 = Y03;
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
                        z02 = Layout.z0(u03 + i24, max + Y02, kotlin.collections.U.c(), new AnonymousClass2(m0Var5, m0Var4, cVar, max, m0Var6, a02, m0Var3, cVar4, cVar3, m0Var, Y02));
                        return z02;
                    }
                }
                i23 = 0;
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
                int i2722 = k11;
                u14 = (U) C7714v.M(measurables.get(1));
                if (u14 != null) {
                }
            }
        };
        u11.x(C11);
        c0 c0Var2 = (c0) C11;
        u11.k();
        C4912a b112 = I.b(b022);
        n11 = u11.n(c0Var2);
        Function1<? super U, h> function162 = function14;
        C12 = u11.C();
        if (!n11) {
        }
        C12 = new d0(c0Var2);
        u11.x(C12);
        V v112 = (V) C12;
        I11 = u11.I();
        A0 d112 = u11.d();
        e f122 = androidx.compose.ui.c.f(u11, eVar2);
        Function0 a112 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 f132 = E.f(u11, v112, u11, d112);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, f132);
        F1.b(u11, f122, InterfaceC2801g.a.f());
        b112.invoke(u11, 0);
        u11.f();
        function15 = function162;
        m02 = u11.m0();
        if (m02 == null) {
        }
    }
}
