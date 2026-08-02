package ru.ozon.debugMenu.internal.core.ui.widgets.navBar;

import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import e1.InterfaceC6250b;
import e1.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.app.android.R;
import ru.ozon.debugMenu.internal.core.ui.widgets.button.DebugMenuIconButtonKt;
import ru.ozon.debugMenu.internal.core.ui.widgets.button.presets.DebugMenuIconButtonShape;
import ru.ozon.debugMenu.internal.core.ui.widgets.button.presets.size.DebugMenuIconButtonSize;
import ru.ozon.debugMenu.internal.core.ui.widgets.button.presets.style.DebugMenuIconButtonStyle;
import y20.C10833a;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/Function0;", "", "onClick", "Landroidx/compose/ui/e;", "modifier", "DebugMenuCloseButton", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/e;LS0/k;II)V", "ozon-debug-menu_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DebugMenuCloseButtonKt {
    /* JADX WARN: Removed duplicated region for block: B:15:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DebugMenuCloseButton(@NotNull Function0<Unit> onClick, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        e eVar3;
        int I11;
        J0 m02;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        C3969l u11 = interfaceC3967k.u(644010167);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.F(onClick) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = 2 & i12;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 32 : 16;
            if ((i13 & 19) == 18 || !u11.b()) {
                eVar3 = i14 == 0 ? e.f40358c0 : eVar2;
                d e11 = InterfaceC6250b.a.e();
                e n11 = a0.n(T.j(eVar3, 0.0f, 0.0f, 4, 0.0f, 11), 44);
                V f7 = C5185h.f(e11, false);
                I11 = u11.I();
                A0 d11 = u11.d();
                e f11 = c.f(u11, n11);
                Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                    u11.e();
                } else {
                    u11.H(a11);
                }
                Function2 f12 = E.f(u11, f7, u11, d11);
                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                    a.d(I11, u11, I11, f12);
                }
                F1.b(u11, f11, InterfaceC2801g.a.f());
                int i15 = C10833a.f105964b;
                u11.o(-1745112686);
                AbstractC8972b a12 = G1.e.a(R.drawable.ozon_debug_menu_ic_m_cross_filled, u11, 0);
                u11.k();
                DebugMenuIconButtonKt.DebugMenuIconButton(a12, onClick, null, false, DebugMenuIconButtonShape.Circle, DebugMenuIconButtonStyle.NeutralSecondary.INSTANCE, DebugMenuIconButtonSize.Size400, null, u11, ((i13 << 3) & 112) | 1794048, 140);
                u11.f();
            } else {
                u11.j();
                eVar3 = eVar2;
            }
            m02 = u11.m0();
            if (m02 == null) {
                m02.G(new DebugMenuCloseButtonKt$DebugMenuCloseButton$2(onClick, eVar3, i11, i12));
                return;
            }
            return;
        }
        eVar2 = eVar;
        if ((i13 & 19) == 18) {
        }
        if (i14 == 0) {
        }
        d e112 = InterfaceC6250b.a.e();
        e n112 = a0.n(T.j(eVar3, 0.0f, 0.0f, 4, 0.0f, 11), 44);
        V f72 = C5185h.f(e112, false);
        I11 = u11.I();
        A0 d112 = u11.d();
        e f112 = c.f(u11, n112);
        Function0 a112 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 f122 = E.f(u11, f72, u11, d112);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, f122);
        F1.b(u11, f112, InterfaceC2801g.a.f());
        int i152 = C10833a.f105964b;
        u11.o(-1745112686);
        AbstractC8972b a122 = G1.e.a(R.drawable.ozon_debug_menu_ic_m_cross_filled, u11, 0);
        u11.k();
        DebugMenuIconButtonKt.DebugMenuIconButton(a122, onClick, null, false, DebugMenuIconButtonShape.Circle, DebugMenuIconButtonStyle.NeutralSecondary.INSTANCE, DebugMenuIconButtonSize.Size400, null, u11, ((i13 << 3) & 112) | 1794048, 140);
        u11.f();
        m02 = u11.m0();
        if (m02 == null) {
        }
    }
}
