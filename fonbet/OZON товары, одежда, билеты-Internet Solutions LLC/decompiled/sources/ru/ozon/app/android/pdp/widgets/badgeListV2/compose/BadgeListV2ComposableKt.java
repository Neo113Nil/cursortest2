package ru.ozon.app.android.pdp.widgets.badgeListV2.compose;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import WZ.l;
import WZ.t;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.T;
import androidx.compose.ui.e;
import androidx.lifecycle.AbstractC5434v;
import b00.f;
import e3.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.badgeListV2.presentation.BadgeListV2VO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.core.repository.UniTheme;
import u0.C9915y;
import v0.C10164d;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/pdp/widgets/badgeListV2/presentation/BadgeListV2VO;", "state", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "BadgeListV2Composable", "(Lru/ozon/app/android/pdp/widgets/badgeListV2/presentation/BadgeListV2VO;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "pdp_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BadgeListV2ComposableKt {
    public static final void BadgeListV2Composable(@NotNull BadgeListV2VO state, @NotNull Function1<? super AtomAction, Unit> actionHandler, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        e b11;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(1871041824);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(state) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(actionHandler) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            l lVar = (l) u11.m(f.e());
            t tokenizedEvent = state.getTokenizedEvent();
            u11.o(-1607210869);
            if (tokenizedEvent != null) {
                AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
                u11.o(83070854);
                boolean F11 = u11.F(lVar) | u11.F(tokenizedEvent);
                Object C11 = u11.C();
                if (F11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new BadgeListV2ComposableKt$BadgeListV2Composable$1$1$1(lVar, tokenizedEvent);
                    u11.x(C11);
                }
                u11.k();
                i.a(aVar, null, (Function0) C11, u11, 6);
                Unit unit = Unit.f71690a;
            }
            u11.k();
            b11 = androidx.compose.foundation.e.b(e.f40358c0, UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getLayerFloor1(), y0.a());
            int i13 = C5179b.f39454h;
            C5179b.i n11 = C5179b.n(state.getSpacedBy());
            C9915y b12 = T.b(state.getInset(), 0.0f, 0.0f, 0.0f, 14);
            u11.o(-1607199382);
            boolean F12 = u11.F(state) | ((i12 & 112) == 32);
            Object C12 = u11.C();
            if (F12 || C12 == InterfaceC3967k.a.a()) {
                C12 = new BadgeListV2ComposableKt$BadgeListV2Composable$2$1(state, actionHandler);
                u11.x(C12);
            }
            u11.k();
            C10164d.b(b11, null, b12, n11, null, null, false, (Function1) C12, u11, 0, 234);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new BadgeListV2ComposableKt$BadgeListV2Composable$3(state, actionHandler, i11));
        }
    }
}
