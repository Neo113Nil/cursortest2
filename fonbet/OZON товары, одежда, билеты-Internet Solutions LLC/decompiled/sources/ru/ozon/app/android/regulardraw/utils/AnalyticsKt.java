package ru.ozon.app.android.regulardraw.utils;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import WZ.l;
import WZ.t;
import androidx.lifecycle.AbstractC5434v;
import b00.f;
import e3.i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LWZ/t;", "tokenizedEvent", "", "AnalyticsViewEventsEffect", "(LWZ/t;LS0/k;I)V", "regulardraw_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AnalyticsKt {
    public static final void AnalyticsViewEventsEffect(@NotNull t tokenizedEvent, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(tokenizedEvent, "tokenizedEvent");
        C3969l u11 = interfaceC3967k.u(-2058331300);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(tokenizedEvent) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && u11.b()) {
            u11.j();
        } else {
            l lVar = (l) u11.m(f.e());
            AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
            u11.o(1325551977);
            boolean F11 = u11.F(lVar) | u11.F(tokenizedEvent);
            Object C11 = u11.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new AnalyticsKt$AnalyticsViewEventsEffect$1$1(lVar, tokenizedEvent);
                u11.x(C11);
            }
            u11.k();
            i.a(aVar, null, (Function0) C11, u11, 6);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new AnalyticsKt$AnalyticsViewEventsEffect$2(tokenizedEvent, i11));
        }
    }
}
