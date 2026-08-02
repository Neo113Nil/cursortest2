package ru.ozon.app.android.travel.feature.railway.widgets.railwayTicketList.composable;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n0.C8392m;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "Ll1/Z;", "color", "", "RailwayTicketListDottedDivider-RPmYEkk", "(Landroidx/compose/ui/e;JLS0/k;I)V", "RailwayTicketListDottedDivider", "railway_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RailwayTicketListDottedDividerKt {
    /* renamed from: RailwayTicketListDottedDivider-RPmYEkk, reason: not valid java name */
    public static final void m1440RailwayTicketListDottedDividerRPmYEkk(@NotNull e modifier, long j11, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        C3969l u11 = interfaceC3967k.u(1775632773);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(modifier) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.s(j11) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            e f7 = a0.f(a0.e(modifier, 1.0f), 1);
            u11.o(-1419798909);
            boolean z11 = (i12 & 112) == 32;
            Object C11 = u11.C();
            if (z11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new RailwayTicketListDottedDividerKt$RailwayTicketListDottedDivider$1$1(j11);
                u11.x(C11);
            }
            u11.k();
            C8392m.a(f7, (Function1) C11, u11, 0);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new RailwayTicketListDottedDividerKt$RailwayTicketListDottedDivider$2(modifier, j11, i11));
        }
    }
}
