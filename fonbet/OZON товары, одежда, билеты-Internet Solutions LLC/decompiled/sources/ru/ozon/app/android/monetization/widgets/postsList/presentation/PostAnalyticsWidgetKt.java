package ru.ozon.app.android.monetization.widgets.postsList.presentation;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import WZ.l;
import androidx.lifecycle.AbstractC5434v;
import b00.f;
import e3.i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.monetization.widgets.postsList.presentation.models.PostAnalyticsVI;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/app/android/monetization/widgets/postsList/presentation/models/PostAnalyticsVI;", "state", "", "PostAnalyticsWidget", "(Lru/ozon/app/android/monetization/widgets/postsList/presentation/models/PostAnalyticsVI;LS0/k;I)V", "monetization_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PostAnalyticsWidgetKt {
    public static final void PostAnalyticsWidget(@NotNull PostAnalyticsVI state, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(state, "state");
        C3969l u11 = interfaceC3967k.u(-1694892555);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(state) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && u11.b()) {
            u11.j();
        } else {
            l lVar = (l) u11.m(f.e());
            AbstractC5434v.a aVar = AbstractC5434v.a.ON_START;
            u11.o(-1470633428);
            boolean F11 = ((i12 & 14) == 4) | u11.F(lVar);
            Object C11 = u11.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new PostAnalyticsWidgetKt$PostAnalyticsWidget$1$1(state, lVar);
                u11.x(C11);
            }
            u11.k();
            i.a(aVar, null, (Function0) C11, u11, 6);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new PostAnalyticsWidgetKt$PostAnalyticsWidget$2(state, i11));
        }
    }
}
