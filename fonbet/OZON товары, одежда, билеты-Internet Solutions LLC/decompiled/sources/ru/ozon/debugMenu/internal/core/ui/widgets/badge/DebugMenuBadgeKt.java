package ru.ozon.debugMenu.internal.core.ui.widgets.badge;

import A0.h;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import i1.C6988h;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.app.android.R;
import ru.ozon.debugMenu.internal.core.ui.utils.b;
import ru.ozon.debugMenu.internal.core.ui.widgets.icon.DebugMenuIconKt;
import ru.ozon.debugMenu.internal.core.ui.widgets.text.TextKt;
import y20.C10833a;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "label", "Landroidx/compose/ui/e;", "modifier", "", "showChevron", "", "DebugMenuBadge", "(Ljava/lang/String;Landroidx/compose/ui/e;ZLS0/k;II)V", "ozon-debug-menu_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DebugMenuBadgeKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DebugMenuBadge(@NotNull String label, e eVar, boolean z11, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        int i14;
        boolean z12;
        e b11;
        int I11;
        C3969l c3969l;
        boolean z13;
        e eVar3;
        Intrinsics.checkNotNullParameter(label, "label");
        C3969l u11 = interfaceC3967k.u(-994848705);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(label) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i15 = i12 & 2;
        if (i15 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 32 : 16;
            i14 = i12 & 4;
            if (i14 == 0) {
                i13 |= 384;
            } else if ((i11 & 384) == 0) {
                z12 = z11;
                i13 |= u11.p(z12) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                if ((i13 & 147) == 146 || !u11.b()) {
                    e eVar4 = i15 != 0 ? e.f40358c0 : eVar2;
                    boolean z14 = i14 != 0 ? false : z12;
                    float f7 = !z14 ? 8 : 2;
                    float f11 = 8;
                    b11 = androidx.compose.foundation.e.b(C6988h.a(a0.f(b.a(eVar4, DebugMenuBadgeTestTags.Container), 24), h.b(f11)), C10833a.a(u11).d(), y0.a());
                    float f12 = 2;
                    e i16 = T.i(b11, f11, f12, f7, f12);
                    Y b12 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
                    I11 = u11.I();
                    A0 d11 = u11.d();
                    e f13 = c.f(u11, i16);
                    Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
                    if (u11.t()) {
                        u11.H(a11);
                    } else {
                        u11.e();
                    }
                    Function2 h11 = Cm.e.h(u11, b12, u11, d11);
                    if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                        a.d(I11, u11, I11, h11);
                    }
                    F1.b(u11, f13, InterfaceC2801g.a.f());
                    e.a aVar = e.f40358c0;
                    e l02 = b.a(aVar, DebugMenuBadgeTestTags.Label).l0(new VerticalAlignElement(InterfaceC6250b.a.i()));
                    if (1.0f <= 0.0d) {
                        throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
                    }
                    e eVar5 = eVar4;
                    TextKt.m1643Text4IGK_g(label, l02.l0(new LayoutWeightElement(1.0f, false)), C10833a.a(u11).m(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, C10833a.b().c(), u11, i13 & 14, 1575984, 55288);
                    u11.o(1336212699);
                    if (z14) {
                        e n11 = a0.n(T.j(b.a(aVar, DebugMenuBadgeTestTags.Chevron), f12, 0.0f, 0.0f, 0.0f, 14), 16);
                        u11.o(1056846146);
                        AbstractC8972b a12 = G1.e.a(R.drawable.ozon_debug_menu_ic_m_chevron_right_filled, u11, 0);
                        u11.k();
                        DebugMenuIconKt.m1619DebugMenuIconFNF3uiM(a12, n11, C10833a.a(u11).f(), u11, 0, 0);
                    }
                    c3969l = u11;
                    c3969l.k();
                    c3969l.f();
                    z13 = z14;
                    eVar3 = eVar5;
                } else {
                    u11.j();
                    eVar3 = eVar2;
                    c3969l = u11;
                    z13 = z12;
                }
                J0 m02 = c3969l.m0();
                if (m02 != null) {
                    m02.G(new DebugMenuBadgeKt$DebugMenuBadge$2(label, eVar3, z13, i11, i12));
                    return;
                }
                return;
            }
            z12 = z11;
            if ((i13 & 147) == 146) {
            }
            if (i15 != 0) {
            }
            if (i14 != 0) {
            }
            if (!z14) {
            }
            float f112 = 8;
            b11 = androidx.compose.foundation.e.b(C6988h.a(a0.f(b.a(eVar4, DebugMenuBadgeTestTags.Container), 24), h.b(f112)), C10833a.a(u11).d(), y0.a());
            float f122 = 2;
            e i162 = T.i(b11, f112, f122, f7, f122);
            Y b122 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
            I11 = u11.I();
            A0 d112 = u11.d();
            e f132 = c.f(u11, i162);
            Function0 a112 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
            }
            Function2 h112 = Cm.e.h(u11, b122, u11, d112);
            if (!u11.t()) {
            }
            a.d(I11, u11, I11, h112);
            F1.b(u11, f132, InterfaceC2801g.a.f());
            e.a aVar2 = e.f40358c0;
            e l022 = b.a(aVar2, DebugMenuBadgeTestTags.Label).l0(new VerticalAlignElement(InterfaceC6250b.a.i()));
            if (1.0f <= 0.0d) {
            }
        }
        eVar2 = eVar;
        i14 = i12 & 4;
        if (i14 == 0) {
        }
        z12 = z11;
        if ((i13 & 147) == 146) {
        }
        if (i15 != 0) {
        }
        if (i14 != 0) {
        }
        if (!z14) {
        }
        float f1122 = 8;
        b11 = androidx.compose.foundation.e.b(C6988h.a(a0.f(b.a(eVar4, DebugMenuBadgeTestTags.Container), 24), h.b(f1122)), C10833a.a(u11).d(), y0.a());
        float f1222 = 2;
        e i1622 = T.i(b11, f1122, f1222, f7, f1222);
        Y b1222 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
        I11 = u11.I();
        A0 d1122 = u11.d();
        e f1322 = c.f(u11, i1622);
        Function0 a1122 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 h1122 = Cm.e.h(u11, b1222, u11, d1122);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, h1122);
        F1.b(u11, f1322, InterfaceC2801g.a.f());
        e.a aVar22 = e.f40358c0;
        e l0222 = b.a(aVar22, DebugMenuBadgeTestTags.Label).l0(new VerticalAlignElement(InterfaceC6250b.a.i()));
        if (1.0f <= 0.0d) {
        }
    }
}
