package ru.ozon.app.android.pdp.widgets.badgeListV3.presentation;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import WZ.t;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.T;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.Q1;
import androidx.lifecycle.AbstractC5434v;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e3.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.core.repository.UniTheme;
import u0.C9915y;
import v0.C10164d;
import v0.I;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aA\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/badgeListV3/presentation/BadgeListV3VO;", "state", "Lkotlin/Function1;", "LWZ/t;", "", "onView", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "BadgeListV3Widget", "(Lru/ozon/app/android/pdp/widgets/badgeListV3/presentation/BadgeListV3VO;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LS0/k;II)V", "BadgeListV3Content", "(Lru/ozon/app/android/pdp/widgets/badgeListV3/presentation/BadgeListV3VO;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "pdp_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BadgeListV3WidgetKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void BadgeListV3Content(BadgeListV3VO badgeListV3VO, Function1<? super AtomAction, Unit> function1, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        e b11;
        C3969l u11 = interfaceC3967k.u(359627903);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(badgeListV3VO) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(function1) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            b11 = androidx.compose.foundation.e.b(e.f40358c0, UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getLayerFloor1(), y0.a());
            TestInfo testInfo = badgeListV3VO.getTestInfo();
            String automatizationId = testInfo != null ? testInfo.getAutomatizationId() : null;
            if (automatizationId == null) {
                automatizationId = "";
            }
            e a11 = Q1.a(b11, automatizationId);
            I scrollState = badgeListV3VO.getScrollState();
            int i13 = C5179b.f39454h;
            C5179b.i n11 = C5179b.n(badgeListV3VO.getSpacedBy().m1867getDpD9Ej5fM());
            C9915y a12 = T.a(badgeListV3VO.getInset().m1867getDpD9Ej5fM(), 2, 0.0f);
            u11.o(596843190);
            boolean z11 = ((i12 & 14) == 4) | ((i12 & 112) == 32);
            Object C11 = u11.C();
            if (z11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new BadgeListV3WidgetKt$BadgeListV3Content$1$1(badgeListV3VO, function1);
                u11.x(C11);
            }
            u11.k();
            C10164d.b(a11, scrollState, a12, n11, null, null, false, (Function1) C11, u11, 0, 232);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new BadgeListV3WidgetKt$BadgeListV3Content$2(badgeListV3VO, function1, i11));
        }
    }

    public static final void BadgeListV3Widget(@NotNull BadgeListV3VO state, Function1<? super t, Unit> function1, @NotNull Function1<? super AtomAction, Unit> actionHandler, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(-1609422921);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(state) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = 2 & i12;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.F(function1) ? 32 : 16;
        }
        if ((4 & i12) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.F(actionHandler) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i13 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            if (i14 != 0) {
                u11.o(1127061622);
                Object C11 = u11.C();
                if (C11 == InterfaceC3967k.a.a()) {
                    C11 = BadgeListV3WidgetKt$BadgeListV3Widget$1$1.INSTANCE;
                    u11.x(C11);
                }
                function1 = (Function1) C11;
                u11.k();
            }
            t tokenizedEvent = state.getTokenizedEvent();
            u11.o(1127064154);
            if (tokenizedEvent != null) {
                AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
                u11.o(858471893);
                boolean F11 = ((i13 & 112) == 32) | u11.F(tokenizedEvent);
                Object C12 = u11.C();
                if (F11 || C12 == InterfaceC3967k.a.a()) {
                    C12 = new BadgeListV3WidgetKt$BadgeListV3Widget$2$1$1(function1, tokenizedEvent);
                    u11.x(C12);
                }
                u11.k();
                i.a(aVar, null, (Function0) C12, u11, 6);
                Unit unit = Unit.f71690a;
            }
            u11.k();
            BadgeListV3Content(state, actionHandler, u11, (i13 & 14) | ((i13 >> 3) & 112));
        }
        Function1<? super t, Unit> function12 = function1;
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new BadgeListV3WidgetKt$BadgeListV3Widget$3(state, function12, actionHandler, i11, i12));
        }
    }
}
