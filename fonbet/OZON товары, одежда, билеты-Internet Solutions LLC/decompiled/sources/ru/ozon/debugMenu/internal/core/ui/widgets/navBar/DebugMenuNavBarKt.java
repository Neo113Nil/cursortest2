package ru.ozon.debugMenu.internal.core.ui.widgets.navBar;

import A0.h;
import B0.C2454a;
import B1.U;
import B1.V;
import B1.W;
import B1.Y;
import B1.m0;
import D1.InterfaceC2801g;
import J0.P;
import Nk.a;
import S0.A0;
import S0.F1;
import S0.InterfaceC3967k;
import Z1.b;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.J0;
import m3.C8060b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.richContent.data.RichContentDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import t0.p;
import t0.q;
import y20.C10833a;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001as\u0010\u000f\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001aC\u0010\u000f\u001a\u00020\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u000f\u0010\u0013\u001a1\u0010\u001e\u001a\u00020\u001b*\u00020\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001c\u0010\u001d\"\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!\"\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lkotlin/Function0;", "", "onBackButtonClick", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Landroidx/compose/ui/e;", "modifier", "endContent", "bottomContent", "", "backButtonEnabled", "Lt0/q;", "backButtonInteractionSource", "", "titleLinesLimit", "DebugMenuNavBar", "(Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLt0/q;ILS0/k;II)V", "startContent", "centerContent", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/e;LS0/k;II)V", "LB1/Y;", "", "LB1/U;", "measurables", "LZ1/b;", "constraints", "gap", "LB1/W;", "defaultMeasureResult-rqJ1uqs", "(LB1/Y;Ljava/util/List;JI)LB1/W;", "defaultMeasureResult", "Ll1/J0;", "RoundedShape", "Ll1/J0;", "LZ1/h;", "NavBarMinimumHeight", "F", "ozon-debug-menu_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DebugMenuNavBarKt {
    private static final float NavBarMinimumHeight = 44;

    @NotNull
    private static final J0 RoundedShape;

    static {
        float f7 = 24;
        RoundedShape = h.d(0.0f, 0.0f, f7, f7, 3);
    }

    public static final void DebugMenuNavBar(Function0<Unit> function0, @NotNull String title, e eVar, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, Function2<? super InterfaceC3967k, ? super Integer, Unit> function22, boolean z11, q qVar, int i11, InterfaceC3967k interfaceC3967k, int i12, int i13) {
        q qVar2;
        Intrinsics.checkNotNullParameter(title, "title");
        interfaceC3967k.o(-916052296);
        e eVar2 = (i13 & 4) != 0 ? e.f40358c0 : eVar;
        Function2<? super InterfaceC3967k, ? super Integer, Unit> function23 = (i13 & 8) != 0 ? null : function2;
        Function2<? super InterfaceC3967k, ? super Integer, Unit> function24 = (i13 & 16) != 0 ? null : function22;
        boolean z12 = (i13 & 32) != 0 ? true : z11;
        if ((i13 & 64) != 0) {
            interfaceC3967k.o(1484430545);
            Object C11 = interfaceC3967k.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = p.a();
                interfaceC3967k.x(C11);
            }
            qVar2 = (q) C11;
            interfaceC3967k.k();
        } else {
            qVar2 = qVar;
        }
        int i14 = (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? 1 : i11;
        float f7 = 8;
        e h11 = T.h(u0.T.a(androidx.compose.foundation.e.b(a0.e(eVar2, 1.0f), C10833a.a(interfaceC3967k).h(), RoundedShape)), 0.0f, f7, 1);
        C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), interfaceC3967k, 0);
        int I11 = interfaceC3967k.I();
        A0 d11 = interfaceC3967k.d();
        e f11 = c.f(interfaceC3967k, h11);
        InterfaceC2801g.f5440U.getClass();
        Function0 a12 = InterfaceC2801g.a.a();
        if (interfaceC3967k.v() == null) {
            C8060b.c();
            throw null;
        }
        interfaceC3967k.i();
        if (interfaceC3967k.t()) {
            interfaceC3967k.H(a12);
        } else {
            interfaceC3967k.e();
        }
        Function2 c11 = P.c(interfaceC3967k, a11, interfaceC3967k, d11);
        if (interfaceC3967k.t() || !Intrinsics.d(interfaceC3967k.C(), Integer.valueOf(I11))) {
            a.d(c11, I11, interfaceC3967k, I11);
        }
        F1.b(interfaceC3967k, f11, InterfaceC2801g.a.f());
        DebugMenuNavBar(a1.c.c(1057743141, new DebugMenuNavBarKt$DebugMenuNavBar$2$1(function0, eVar2, z12, qVar2), interfaceC3967k), a1.c.c(1928564740, new DebugMenuNavBarKt$DebugMenuNavBar$2$2(title, i14), interfaceC3967k), a1.c.c(-1495580957, new DebugMenuNavBarKt$DebugMenuNavBar$2$3(function23), interfaceC3967k), null, interfaceC3967k, 438, 8);
        interfaceC3967k.o(1986828706);
        if (function24 != null) {
            e j11 = T.j(e.f40358c0, 0.0f, f7, 0.0f, 0.0f, 13);
            ComposableSingletons$DebugMenuNavBarKt composableSingletons$DebugMenuNavBarKt = ComposableSingletons$DebugMenuNavBarKt.INSTANCE;
            DebugMenuNavBar(composableSingletons$DebugMenuNavBarKt.m1634getLambda1$ozon_debug_menu_release(), function24, composableSingletons$DebugMenuNavBarKt.m1635getLambda2$ozon_debug_menu_release(), j11, interfaceC3967k, ((i12 >> 9) & 112) | 3462, 0);
        }
        interfaceC3967k.k();
        interfaceC3967k.f();
        interfaceC3967k.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: defaultMeasureResult-rqJ1uqs, reason: not valid java name */
    public static final W m1637defaultMeasureResultrqJ1uqs(Y y11, List<? extends U> list, long j11, int i11) {
        U u11;
        U u12;
        U u13;
        long c11;
        W z02;
        int size = list.size();
        int i12 = 0;
        while (true) {
            u11 = null;
            if (i12 >= size) {
                u12 = null;
                break;
            }
            u12 = list.get(i12);
            if (Intrinsics.d(androidx.compose.ui.layout.a.a(u12), "start")) {
                break;
            }
            i12++;
        }
        Intrinsics.f(u12);
        U u14 = u12;
        int size2 = list.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size2) {
                u13 = null;
                break;
            }
            u13 = list.get(i13);
            if (Intrinsics.d(androidx.compose.ui.layout.a.a(u13), RichContentDTO.ALIGN_CENTER)) {
                break;
            }
            i13++;
        }
        Intrinsics.f(u13);
        U u15 = u13;
        int size3 = list.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size3) {
                break;
            }
            U u16 = list.get(i14);
            if (Intrinsics.d(androidx.compose.ui.layout.a.a(u16), "end")) {
                u11 = u16;
                break;
            }
            i14++;
        }
        Intrinsics.f(u11);
        m0 a02 = u14.a0(b.c(0, 0, 0, 0, 10, j11));
        m0 a03 = u11.a0(b.c(0, 0, 0, 0, 10, j11));
        int max = Math.max(a02.u0(), a03.u0());
        if (b.g(j11)) {
            int k11 = b.k(j11) - ((max + i11) * 2);
            int i15 = k11 < 0 ? 0 : k11;
            c11 = b.c(i15, i15, 0, 0, 8, j11);
        } else {
            c11 = b.c(0, 0, 0, 0, 10, j11);
        }
        m0 a04 = u15.a0(c11);
        int c12 = Vc.a.c(new int[]{a03.l0(), a04.l0(), y11.Y0(NavBarMinimumHeight)}, a02.l0());
        int k12 = b.k(j11);
        z02 = y11.z0(k12, c12, kotlin.collections.U.c(), new DebugMenuNavBarKt$defaultMeasureResult$1(a02, c12, a04, max + i11, a03, k12, max));
        return z02;
    }

    private static final void DebugMenuNavBar(Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, Function2<? super InterfaceC3967k, ? super Integer, Unit> function22, Function2<? super InterfaceC3967k, ? super Integer, Unit> function23, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        interfaceC3967k.o(-692447012);
        if ((i12 & 8) != 0) {
            eVar = e.f40358c0;
        }
        interfaceC3967k.o(1484518887);
        Object C11 = interfaceC3967k.C();
        if (C11 == InterfaceC3967k.a.a()) {
            C11 = new V() { // from class: ru.ozon.debugMenu.internal.core.ui.widgets.navBar.DebugMenuNavBarKt$DebugMenuNavBar$3$1
                @Override // B1.V
                /* renamed from: measure-3p2s80s */
                public final W mo2measure3p2s80s(Y Layout, List<? extends U> measurables, long j11) {
                    W m1637defaultMeasureResultrqJ1uqs;
                    Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    m1637defaultMeasureResultrqJ1uqs = DebugMenuNavBarKt.m1637defaultMeasureResultrqJ1uqs(Layout, measurables, j11, Layout.Y0(8));
                    return m1637defaultMeasureResultrqJ1uqs;
                }
            };
            interfaceC3967k.x(C11);
        }
        V v11 = (V) C11;
        interfaceC3967k.k();
        int i13 = i11 >> 6;
        int I11 = interfaceC3967k.I();
        A0 d11 = interfaceC3967k.d();
        e f7 = c.f(interfaceC3967k, eVar);
        InterfaceC2801g.f5440U.getClass();
        Function0 a11 = InterfaceC2801g.a.a();
        if (interfaceC3967k.v() != null) {
            interfaceC3967k.i();
            if (interfaceC3967k.t()) {
                interfaceC3967k.H(a11);
            } else {
                interfaceC3967k.e();
            }
            Function2 d12 = C2454a.d(interfaceC3967k, v11, interfaceC3967k, d11);
            if (interfaceC3967k.t() || !Intrinsics.d(interfaceC3967k.C(), Integer.valueOf(I11))) {
                a.d(d12, I11, interfaceC3967k, I11);
            }
            F1.b(interfaceC3967k, f7, InterfaceC2801g.a.f());
            e.a aVar = e.f40358c0;
            e b11 = androidx.compose.ui.layout.a.b(aVar, "start");
            V f11 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I12 = interfaceC3967k.I();
            A0 d13 = interfaceC3967k.d();
            e f12 = c.f(interfaceC3967k, b11);
            Function0 a12 = InterfaceC2801g.a.a();
            if (interfaceC3967k.v() != null) {
                interfaceC3967k.i();
                if (interfaceC3967k.t()) {
                    interfaceC3967k.H(a12);
                } else {
                    interfaceC3967k.e();
                }
                Function2 d14 = C2454a.d(interfaceC3967k, f11, interfaceC3967k, d13);
                if (interfaceC3967k.t() || !Intrinsics.d(interfaceC3967k.C(), Integer.valueOf(I12))) {
                    a.d(d14, I12, interfaceC3967k, I12);
                }
                F1.b(interfaceC3967k, f12, InterfaceC2801g.a.f());
                function2.invoke(interfaceC3967k, Integer.valueOf(i11 & 14));
                interfaceC3967k.f();
                e b12 = androidx.compose.ui.layout.a.b(aVar, RichContentDTO.ALIGN_CENTER);
                V f13 = C5185h.f(InterfaceC6250b.a.e(), false);
                int I13 = interfaceC3967k.I();
                A0 d15 = interfaceC3967k.d();
                e f14 = c.f(interfaceC3967k, b12);
                Function0 a13 = InterfaceC2801g.a.a();
                if (interfaceC3967k.v() != null) {
                    interfaceC3967k.i();
                    if (interfaceC3967k.t()) {
                        interfaceC3967k.H(a13);
                    } else {
                        interfaceC3967k.e();
                    }
                    Function2 d16 = C2454a.d(interfaceC3967k, f13, interfaceC3967k, d15);
                    if (interfaceC3967k.t() || !Intrinsics.d(interfaceC3967k.C(), Integer.valueOf(I13))) {
                        a.d(d16, I13, interfaceC3967k, I13);
                    }
                    F1.b(interfaceC3967k, f14, InterfaceC2801g.a.f());
                    function22.invoke(interfaceC3967k, Integer.valueOf((i11 >> 3) & 14));
                    interfaceC3967k.f();
                    e b13 = androidx.compose.ui.layout.a.b(aVar, "end");
                    V f15 = C5185h.f(InterfaceC6250b.a.o(), false);
                    int I14 = interfaceC3967k.I();
                    A0 d17 = interfaceC3967k.d();
                    e f16 = c.f(interfaceC3967k, b13);
                    Function0 a14 = InterfaceC2801g.a.a();
                    if (interfaceC3967k.v() != null) {
                        interfaceC3967k.i();
                        if (interfaceC3967k.t()) {
                            interfaceC3967k.H(a14);
                        } else {
                            interfaceC3967k.e();
                        }
                        Function2 d18 = C2454a.d(interfaceC3967k, f15, interfaceC3967k, d17);
                        if (interfaceC3967k.t() || !Intrinsics.d(interfaceC3967k.C(), Integer.valueOf(I14))) {
                            a.d(d18, I14, interfaceC3967k, I14);
                        }
                        F1.b(interfaceC3967k, f16, InterfaceC2801g.a.f());
                        function23.invoke(interfaceC3967k, Integer.valueOf(i13 & 14));
                        interfaceC3967k.f();
                        interfaceC3967k.f();
                        interfaceC3967k.k();
                        return;
                    }
                    C8060b.c();
                    throw null;
                }
                C8060b.c();
                throw null;
            }
            C8060b.c();
            throw null;
        }
        C8060b.c();
        throw null;
    }
}
