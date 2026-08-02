package ru.ozon.debugMenu.internal.core.ui.widgets.icon;

import B1.InterfaceC2547p;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.C5236c1;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l1.C7809a0;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a)\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lq1/b;", "painter", "Landroidx/compose/ui/e;", "modifier", "Ll1/Z;", "tint", "", "DebugMenuIcon-FNF3uiM", "(Lq1/b;Landroidx/compose/ui/e;JLS0/k;II)V", "DebugMenuIcon", "ozon-debug-menu_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DebugMenuIconKt {
    /* renamed from: DebugMenuIcon-FNF3uiM, reason: not valid java name */
    public static final void m1619DebugMenuIconFNF3uiM(@NotNull AbstractC8972b painter, e eVar, long j11, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        Intrinsics.checkNotNullParameter(painter, "painter");
        C3969l u11 = interfaceC3967k.u(-625176176);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.F(painter) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.n(eVar) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.s(j11) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i13 & 147) == 146 && u11.b()) {
            u11.j();
            eVar2 = eVar;
        } else {
            e eVar3 = i14 != 0 ? e.f40358c0 : eVar;
            u11.o(-1122534843);
            boolean z11 = (i13 & 896) == 256;
            Object C11 = u11.C();
            if (z11 || C11 == InterfaceC3967k.a.a()) {
                C11 = C7809a0.a.a(5, j11);
                u11.x(C11);
            }
            C7809a0 c7809a0 = (C7809a0) C11;
            u11.k();
            int i15 = C5236c1.f40825b;
            C5185h.a(androidx.compose.ui.draw.e.a(eVar3, painter, null, InterfaceC2547p.a.d(), 0.0f, c7809a0, 22), u11, 0);
            eVar2 = eVar3;
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new DebugMenuIconKt$DebugMenuIcon$1(painter, eVar2, j11, i11, i12));
        }
    }
}
