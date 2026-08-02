package ru.ozon.debugMenu.internal.core.ui.widgets.screen;

import B1.U;
import B1.V;
import B1.W;
import B1.Y;
import B1.m0;
import D1.InterfaceC2801g;
import Fr.g;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import Z1.b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.a;
import androidx.compose.ui.platform.C5236c1;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import fd.InterfaceC6511n;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.debugMenu.internal.core.ui.widgets.navBar.DebugMenuNavBarKt;
import u0.InterfaceC9914x;
import u0.P;
import y20.C10833a;

@Metadata(d1 = {"\u0000,\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ak\u0010\f\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\tH\u0001¢\u0006\u0004\b\f\u0010\r\"\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"", "navBarTitle", "Landroidx/compose/ui/e;", "modifier", "Lkotlin/Function0;", "", "onBackButtonClick", "navBarBottomContent", "endNavBarContent", "Lkotlin/Function1;", "Lu0/x;", "content", "DebugMenuScreen", "(Ljava/lang/String;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lfd/n;LS0/k;II)V", "LZ1/h;", "screenTopPadding", "F", "ozon-debug-menu_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DebugMenuScreenKt {
    private static final float screenTopPadding = 24;

    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DebugMenuScreen(@NotNull String navBarTitle, e eVar, Function0<Unit> function0, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, Function2<? super InterfaceC3967k, ? super Integer, Unit> function22, @NotNull InterfaceC6511n<? super InterfaceC9914x, ? super InterfaceC3967k, ? super Integer, Unit> content, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        int i14;
        Function0<Unit> function02;
        int i15;
        Function2<? super InterfaceC3967k, ? super Integer, Unit> function23;
        int i16;
        Function2<? super InterfaceC3967k, ? super Integer, Unit> function24;
        Function2<? super InterfaceC3967k, ? super Integer, Unit> function25;
        e b11;
        Object C11;
        int I11;
        int I12;
        Function2<? super InterfaceC3967k, ? super Integer, Unit> function26;
        e eVar3;
        Function0<Unit> function03;
        J0 m02;
        Intrinsics.checkNotNullParameter(navBarTitle, "navBarTitle");
        Intrinsics.checkNotNullParameter(content, "content");
        C3969l u11 = interfaceC3967k.u(687551366);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(navBarTitle) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i17 = i12 & 2;
        if (i17 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 32 : 16;
            i14 = i12 & 4;
            if (i14 == 0) {
                i13 |= 384;
            } else if ((i11 & 384) == 0) {
                function02 = function0;
                i13 |= u11.F(function02) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                i15 = i12 & 8;
                if (i15 != 0) {
                    i13 |= 3072;
                } else if ((i11 & 3072) == 0) {
                    function23 = function2;
                    i13 |= u11.F(function23) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                    i16 = i12 & 16;
                    if (i16 == 0) {
                        i13 |= 24576;
                    } else if ((i11 & 24576) == 0) {
                        function24 = function22;
                        i13 |= u11.F(function24) ? 16384 : 8192;
                        if ((i12 & 32) != 0) {
                            i13 |= 196608;
                        } else if ((i11 & 196608) == 0) {
                            i13 |= u11.F(content) ? 131072 : 65536;
                        }
                        if ((74899 & i13) == 74898 || !u11.b()) {
                            e eVar4 = i17 != 0 ? e.f40358c0 : eVar2;
                            if (i14 != 0) {
                                function02 = null;
                            }
                            function25 = i15 != 0 ? null : function23;
                            Function2<? super InterfaceC3967k, ? super Integer, Unit> function27 = i16 == 0 ? function24 : null;
                            b11 = androidx.compose.foundation.e.b(a0.d(eVar4), C10833a.a(u11).g(), y0.a());
                            e b12 = c.b(b11, C5236c1.a(), new P(3));
                            u11.o(1273218434);
                            C11 = u11.C();
                            if (C11 == InterfaceC3967k.a.a()) {
                                C11 = new V() { // from class: ru.ozon.debugMenu.internal.core.ui.widgets.screen.DebugMenuScreenKt$DebugMenuScreen$1$1

                                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LB1/m0$a;", "", "invoke", "(LB1/m0$a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
                                    /* renamed from: ru.ozon.debugMenu.internal.core.ui.widgets.screen.DebugMenuScreenKt$DebugMenuScreen$1$1$1, reason: invalid class name */
                                    static final class AnonymousClass1 extends AbstractC7737t implements Function1<m0.a, Unit> {
                                        final /* synthetic */ m0 $contentPlaceable;
                                        final /* synthetic */ m0 $navBarPlaceable;
                                        final /* synthetic */ int $startHeight;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        AnonymousClass1(m0 m0Var, int i11, m0 m0Var2) {
                                            super(1);
                                            this.$contentPlaceable = m0Var;
                                            this.$startHeight = i11;
                                            this.$navBarPlaceable = m0Var2;
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(m0.a aVar) {
                                            invoke2(aVar);
                                            return Unit.f71690a;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(m0.a layout) {
                                            Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                            layout.d(this.$contentPlaceable, 0, this.$startHeight, 0.0f);
                                            layout.d(this.$navBarPlaceable, 0, 0, 0.0f);
                                        }
                                    }

                                    @Override // B1.V
                                    /* renamed from: measure-3p2s80s */
                                    public final W mo2measure3p2s80s(Y Layout, List<? extends U> measurables, long j11) {
                                        U u12;
                                        U u13;
                                        float f7;
                                        W z02;
                                        Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                                        Intrinsics.checkNotNullParameter(measurables, "measurables");
                                        int size = measurables.size();
                                        int i18 = 0;
                                        int i19 = 0;
                                        while (true) {
                                            u12 = null;
                                            if (i19 >= size) {
                                                u13 = null;
                                                break;
                                            }
                                            u13 = measurables.get(i19);
                                            if (Intrinsics.d(a.a(u13), "navBar")) {
                                                break;
                                            }
                                            i19++;
                                        }
                                        Intrinsics.f(u13);
                                        U u14 = u13;
                                        int size2 = measurables.size();
                                        while (true) {
                                            if (i18 >= size2) {
                                                break;
                                            }
                                            U u15 = measurables.get(i18);
                                            if (Intrinsics.d(a.a(u15), "content")) {
                                                u12 = u15;
                                                break;
                                            }
                                            i18++;
                                        }
                                        Intrinsics.f(u12);
                                        m0 a02 = u14.a0(b.c(0, 0, 0, 0, 10, j11));
                                        int l02 = a02.l0();
                                        f7 = DebugMenuScreenKt.screenTopPadding;
                                        int Y02 = l02 - Layout.Y0(f7);
                                        z02 = Layout.z0(b.k(j11), b.j(j11), kotlin.collections.U.c(), new AnonymousClass1(u12.a0(b.c(0, 0, 0, b.j(j11) - Y02, 2, j11)), Y02, a02));
                                        return z02;
                                    }
                                };
                                u11.x(C11);
                            }
                            V v11 = (V) C11;
                            u11.k();
                            I11 = u11.I();
                            A0 d11 = u11.d();
                            e f7 = c.f(u11, b12);
                            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
                            if (u11.t()) {
                                u11.H(a11);
                            } else {
                                u11.e();
                            }
                            Function2 f11 = E.f(u11, v11, u11, d11);
                            if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                                Ep.a.d(I11, u11, I11, f11);
                            }
                            F1.b(u11, f7, InterfaceC2801g.a.f());
                            e.a aVar = e.f40358c0;
                            e b13 = a.b(aVar, "content");
                            V f12 = C5185h.f(InterfaceC6250b.a.o(), false);
                            I12 = u11.I();
                            A0 d12 = u11.d();
                            e f13 = c.f(u11, b13);
                            Function0 a12 = InterfaceC2801g.a.a();
                            u11.i();
                            if (u11.t()) {
                                u11.H(a12);
                            } else {
                                u11.e();
                            }
                            Function2 f14 = E.f(u11, f12, u11, d12);
                            if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                                Ep.a.d(I12, u11, I12, f14);
                            }
                            F1.b(u11, f13, InterfaceC2801g.a.f());
                            content.invoke(T.b(0.0f, screenTopPadding, 0.0f, 0.0f, 13), u11, Integer.valueOf(((i13 >> 12) & 112) | 6));
                            u11.f();
                            int i18 = i13 << 3;
                            Function0<Unit> function04 = function02;
                            DebugMenuNavBarKt.DebugMenuNavBar(function04, navBarTitle, a.b(aVar, "navBar"), function27, function25, false, null, 0, u11, ((i13 >> 3) & 7168) | ((i13 >> 6) & 14) | 384 | (i18 & 112) | (57344 & i18), 224);
                            u11.f();
                            function26 = function27;
                            eVar3 = eVar4;
                            function03 = function04;
                        } else {
                            u11.j();
                            eVar3 = eVar2;
                            function03 = function02;
                            function25 = function23;
                            function26 = function24;
                        }
                        m02 = u11.m0();
                        if (m02 != null) {
                            m02.G(new DebugMenuScreenKt$DebugMenuScreen$3(navBarTitle, eVar3, function03, function25, function26, content, i11, i12));
                            return;
                        }
                        return;
                    }
                    function24 = function22;
                    if ((i12 & 32) != 0) {
                    }
                    if ((74899 & i13) == 74898) {
                    }
                    if (i17 != 0) {
                    }
                    if (i14 != 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i16 == 0) {
                    }
                    b11 = androidx.compose.foundation.e.b(a0.d(eVar4), C10833a.a(u11).g(), y0.a());
                    e b122 = c.b(b11, C5236c1.a(), new P(3));
                    u11.o(1273218434);
                    C11 = u11.C();
                    if (C11 == InterfaceC3967k.a.a()) {
                    }
                    V v112 = (V) C11;
                    u11.k();
                    I11 = u11.I();
                    A0 d112 = u11.d();
                    e f72 = c.f(u11, b122);
                    Function0 a112 = g.a(InterfaceC2801g.f5440U, u11);
                    if (u11.t()) {
                    }
                    Function2 f112 = E.f(u11, v112, u11, d112);
                    if (!u11.t()) {
                    }
                    Ep.a.d(I11, u11, I11, f112);
                    F1.b(u11, f72, InterfaceC2801g.a.f());
                    e.a aVar2 = e.f40358c0;
                    e b132 = a.b(aVar2, "content");
                    V f122 = C5185h.f(InterfaceC6250b.a.o(), false);
                    I12 = u11.I();
                    A0 d122 = u11.d();
                    e f132 = c.f(u11, b132);
                    Function0 a122 = InterfaceC2801g.a.a();
                    u11.i();
                    if (u11.t()) {
                    }
                    Function2 f142 = E.f(u11, f122, u11, d122);
                    if (!u11.t()) {
                    }
                    Ep.a.d(I12, u11, I12, f142);
                    F1.b(u11, f132, InterfaceC2801g.a.f());
                    content.invoke(T.b(0.0f, screenTopPadding, 0.0f, 0.0f, 13), u11, Integer.valueOf(((i13 >> 12) & 112) | 6));
                    u11.f();
                    int i182 = i13 << 3;
                    Function0<Unit> function042 = function02;
                    DebugMenuNavBarKt.DebugMenuNavBar(function042, navBarTitle, a.b(aVar2, "navBar"), function27, function25, false, null, 0, u11, ((i13 >> 3) & 7168) | ((i13 >> 6) & 14) | 384 | (i182 & 112) | (57344 & i182), 224);
                    u11.f();
                    function26 = function27;
                    eVar3 = eVar4;
                    function03 = function042;
                    m02 = u11.m0();
                    if (m02 != null) {
                    }
                }
                function23 = function2;
                i16 = i12 & 16;
                if (i16 == 0) {
                }
                function24 = function22;
                if ((i12 & 32) != 0) {
                }
                if ((74899 & i13) == 74898) {
                }
                if (i17 != 0) {
                }
                if (i14 != 0) {
                }
                if (i15 != 0) {
                }
                if (i16 == 0) {
                }
                b11 = androidx.compose.foundation.e.b(a0.d(eVar4), C10833a.a(u11).g(), y0.a());
                e b1222 = c.b(b11, C5236c1.a(), new P(3));
                u11.o(1273218434);
                C11 = u11.C();
                if (C11 == InterfaceC3967k.a.a()) {
                }
                V v1122 = (V) C11;
                u11.k();
                I11 = u11.I();
                A0 d1122 = u11.d();
                e f722 = c.f(u11, b1222);
                Function0 a1122 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                }
                Function2 f1122 = E.f(u11, v1122, u11, d1122);
                if (!u11.t()) {
                }
                Ep.a.d(I11, u11, I11, f1122);
                F1.b(u11, f722, InterfaceC2801g.a.f());
                e.a aVar22 = e.f40358c0;
                e b1322 = a.b(aVar22, "content");
                V f1222 = C5185h.f(InterfaceC6250b.a.o(), false);
                I12 = u11.I();
                A0 d1222 = u11.d();
                e f1322 = c.f(u11, b1322);
                Function0 a1222 = InterfaceC2801g.a.a();
                u11.i();
                if (u11.t()) {
                }
                Function2 f1422 = E.f(u11, f1222, u11, d1222);
                if (!u11.t()) {
                }
                Ep.a.d(I12, u11, I12, f1422);
                F1.b(u11, f1322, InterfaceC2801g.a.f());
                content.invoke(T.b(0.0f, screenTopPadding, 0.0f, 0.0f, 13), u11, Integer.valueOf(((i13 >> 12) & 112) | 6));
                u11.f();
                int i1822 = i13 << 3;
                Function0<Unit> function0422 = function02;
                DebugMenuNavBarKt.DebugMenuNavBar(function0422, navBarTitle, a.b(aVar22, "navBar"), function27, function25, false, null, 0, u11, ((i13 >> 3) & 7168) | ((i13 >> 6) & 14) | 384 | (i1822 & 112) | (57344 & i1822), 224);
                u11.f();
                function26 = function27;
                eVar3 = eVar4;
                function03 = function0422;
                m02 = u11.m0();
                if (m02 != null) {
                }
            }
            function02 = function0;
            i15 = i12 & 8;
            if (i15 != 0) {
            }
            function23 = function2;
            i16 = i12 & 16;
            if (i16 == 0) {
            }
            function24 = function22;
            if ((i12 & 32) != 0) {
            }
            if ((74899 & i13) == 74898) {
            }
            if (i17 != 0) {
            }
            if (i14 != 0) {
            }
            if (i15 != 0) {
            }
            if (i16 == 0) {
            }
            b11 = androidx.compose.foundation.e.b(a0.d(eVar4), C10833a.a(u11).g(), y0.a());
            e b12222 = c.b(b11, C5236c1.a(), new P(3));
            u11.o(1273218434);
            C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
            }
            V v11222 = (V) C11;
            u11.k();
            I11 = u11.I();
            A0 d11222 = u11.d();
            e f7222 = c.f(u11, b12222);
            Function0 a11222 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
            }
            Function2 f11222 = E.f(u11, v11222, u11, d11222);
            if (!u11.t()) {
            }
            Ep.a.d(I11, u11, I11, f11222);
            F1.b(u11, f7222, InterfaceC2801g.a.f());
            e.a aVar222 = e.f40358c0;
            e b13222 = a.b(aVar222, "content");
            V f12222 = C5185h.f(InterfaceC6250b.a.o(), false);
            I12 = u11.I();
            A0 d12222 = u11.d();
            e f13222 = c.f(u11, b13222);
            Function0 a12222 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
            }
            Function2 f14222 = E.f(u11, f12222, u11, d12222);
            if (!u11.t()) {
            }
            Ep.a.d(I12, u11, I12, f14222);
            F1.b(u11, f13222, InterfaceC2801g.a.f());
            content.invoke(T.b(0.0f, screenTopPadding, 0.0f, 0.0f, 13), u11, Integer.valueOf(((i13 >> 12) & 112) | 6));
            u11.f();
            int i18222 = i13 << 3;
            Function0<Unit> function04222 = function02;
            DebugMenuNavBarKt.DebugMenuNavBar(function04222, navBarTitle, a.b(aVar222, "navBar"), function27, function25, false, null, 0, u11, ((i13 >> 3) & 7168) | ((i13 >> 6) & 14) | 384 | (i18222 & 112) | (57344 & i18222), 224);
            u11.f();
            function26 = function27;
            eVar3 = eVar4;
            function03 = function04222;
            m02 = u11.m0();
            if (m02 != null) {
            }
        }
        eVar2 = eVar;
        i14 = i12 & 4;
        if (i14 == 0) {
        }
        function02 = function0;
        i15 = i12 & 8;
        if (i15 != 0) {
        }
        function23 = function2;
        i16 = i12 & 16;
        if (i16 == 0) {
        }
        function24 = function22;
        if ((i12 & 32) != 0) {
        }
        if ((74899 & i13) == 74898) {
        }
        if (i17 != 0) {
        }
        if (i14 != 0) {
        }
        if (i15 != 0) {
        }
        if (i16 == 0) {
        }
        b11 = androidx.compose.foundation.e.b(a0.d(eVar4), C10833a.a(u11).g(), y0.a());
        e b122222 = c.b(b11, C5236c1.a(), new P(3));
        u11.o(1273218434);
        C11 = u11.C();
        if (C11 == InterfaceC3967k.a.a()) {
        }
        V v112222 = (V) C11;
        u11.k();
        I11 = u11.I();
        A0 d112222 = u11.d();
        e f72222 = c.f(u11, b122222);
        Function0 a112222 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 f112222 = E.f(u11, v112222, u11, d112222);
        if (!u11.t()) {
        }
        Ep.a.d(I11, u11, I11, f112222);
        F1.b(u11, f72222, InterfaceC2801g.a.f());
        e.a aVar2222 = e.f40358c0;
        e b132222 = a.b(aVar2222, "content");
        V f122222 = C5185h.f(InterfaceC6250b.a.o(), false);
        I12 = u11.I();
        A0 d122222 = u11.d();
        e f132222 = c.f(u11, b132222);
        Function0 a122222 = InterfaceC2801g.a.a();
        u11.i();
        if (u11.t()) {
        }
        Function2 f142222 = E.f(u11, f122222, u11, d122222);
        if (!u11.t()) {
        }
        Ep.a.d(I12, u11, I12, f142222);
        F1.b(u11, f132222, InterfaceC2801g.a.f());
        content.invoke(T.b(0.0f, screenTopPadding, 0.0f, 0.0f, 13), u11, Integer.valueOf(((i13 >> 12) & 112) | 6));
        u11.f();
        int i182222 = i13 << 3;
        Function0<Unit> function042222 = function02;
        DebugMenuNavBarKt.DebugMenuNavBar(function042222, navBarTitle, a.b(aVar2222, "navBar"), function27, function25, false, null, 0, u11, ((i13 >> 3) & 7168) | ((i13 >> 6) & 14) | 384 | (i182222 & 112) | (57344 & i182222), 224);
        u11.f();
        function26 = function27;
        eVar3 = eVar4;
        function03 = function042222;
        m02 = u11.m0();
        if (m02 != null) {
        }
    }
}
