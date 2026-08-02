package ru.ozon.app.android.travel.feature.general.common.widgets.notificationSwitcher.presentation;

import S0.A1;
import S0.C3969l;
import S0.D1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.n1;
import WZ.l;
import WZ.t;
import android.content.Context;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.C5239d1;
import androidx.core.app.n;
import androidx.lifecycle.AbstractC5434v;
import b00.f;
import e3.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.dto.travelWidgetSettings.TravelWidgetSettingsDTO;
import ru.ozon.uni.android.ds.compose.component.cell.DsCellAtomKt;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a/\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e²\u0006\f\u0010\r\u001a\u00020\n8\nX\u008a\u0084\u0002"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSwitcher/presentation/NotificationSwitcherVI;", "state", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "Lru/ozon/app/android/action/BuildedActionHandler;", "actionHandler", "NotificationSwitcherContent", "(Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSwitcher/presentation/NotificationSwitcherVI;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "LS0/A1;", "", "rememberAreNotificationsEnabled", "(LS0/k;I)LS0/A1;", "notificationsEnabled", "common_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NotificationSwitcherContentKt {
    public static final void NotificationSwitcherContent(@NotNull NotificationSwitcherVI state, @NotNull Function1<? super AtomAction, Unit> actionHandler, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Function1<? super AtomAction, Unit> function1;
        Paddings bottomPadding;
        Paddings rightPadding;
        Paddings topPadding;
        Paddings leftPadding;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(-537132261);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(state) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(actionHandler) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
            function1 = actionHandler;
        } else {
            if (NotificationSwitcherContent$lambda$0(rememberAreNotificationsEnabled(u11, 0))) {
                J0 m02 = u11.m0();
                if (m02 != null) {
                    m02.G(new NotificationSwitcherContentKt$NotificationSwitcherContent$1(state, actionHandler, i11));
                    return;
                }
                return;
            }
            u11.o(-1848634224);
            l lVar = ((Boolean) u11.m(C5239d1.a())).booleanValue() ? null : (l) u11.m(f.e());
            u11.k();
            t tokenizedEvent = state.getTokenizedEvent();
            u11.o(-1848629889);
            if (tokenizedEvent != null) {
                AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
                u11.o(-1632524403);
                boolean F11 = u11.F(lVar) | u11.F(tokenizedEvent);
                Object C11 = u11.C();
                if (F11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new NotificationSwitcherContentKt$NotificationSwitcherContent$2$1$1(lVar, tokenizedEvent);
                    u11.x(C11);
                }
                u11.k();
                i.a(aVar, null, (Function0) C11, u11, 6);
                Unit unit = Unit.f71690a;
            }
            u11.k();
            e e11 = a0.e(e.f40358c0, 1.0f);
            TravelWidgetSettingsDTO.PaddingsSetting cellPaddings = state.getCellPaddings();
            float m1838getDp0D9Ej5fM = (cellPaddings == null || (leftPadding = cellPaddings.getLeftPadding()) == null) ? DsSpacings.INSTANCE.m1838getDp0D9Ej5fM() : leftPadding.m1867getDpD9Ej5fM();
            TravelWidgetSettingsDTO.PaddingsSetting cellPaddings2 = state.getCellPaddings();
            float m1838getDp0D9Ej5fM2 = (cellPaddings2 == null || (topPadding = cellPaddings2.getTopPadding()) == null) ? DsSpacings.INSTANCE.m1838getDp0D9Ej5fM() : topPadding.m1867getDpD9Ej5fM();
            TravelWidgetSettingsDTO.PaddingsSetting cellPaddings3 = state.getCellPaddings();
            float m1838getDp0D9Ej5fM3 = (cellPaddings3 == null || (rightPadding = cellPaddings3.getRightPadding()) == null) ? DsSpacings.INSTANCE.m1838getDp0D9Ej5fM() : rightPadding.m1867getDpD9Ej5fM();
            TravelWidgetSettingsDTO.PaddingsSetting cellPaddings4 = state.getCellPaddings();
            e i13 = T.i(e11, m1838getDp0D9Ej5fM, m1838getDp0D9Ej5fM2, m1838getDp0D9Ej5fM3, (cellPaddings4 == null || (bottomPadding = cellPaddings4.getBottomPadding()) == null) ? DsSpacings.INSTANCE.m1838getDp0D9Ej5fM() : bottomPadding.m1867getDpD9Ej5fM());
            function1 = actionHandler;
            DsCellAtomKt.DsCellAtom(state.getCell(), i13, function1, u11, CellDTO.$stable | ((i12 << 3) & 896), 0);
        }
        J0 m03 = u11.m0();
        if (m03 != null) {
            m03.G(new NotificationSwitcherContentKt$NotificationSwitcherContent$3(state, function1, i11));
        }
    }

    private static final boolean NotificationSwitcherContent$lambda$0(A1<Boolean> a12) {
        return a12.getValue().booleanValue();
    }

    @NotNull
    public static final A1<Boolean> rememberAreNotificationsEnabled(InterfaceC3967k interfaceC3967k, int i11) {
        interfaceC3967k.o(-2138165887);
        Context context = (Context) interfaceC3967k.m(AndroidCompositionLocals_androidKt.d());
        boolean booleanValue = ((Boolean) interfaceC3967k.m(C5239d1.a())).booleanValue();
        interfaceC3967k.o(1529469467);
        Object C11 = interfaceC3967k.C();
        if (C11 == InterfaceC3967k.a.a()) {
            C11 = n1.f(Boolean.valueOf(booleanValue ? false : n.e(context).a()), D1.f25195a);
            interfaceC3967k.x(C11);
        }
        InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C11;
        interfaceC3967k.k();
        if (!booleanValue) {
            AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
            interfaceC3967k.o(1529479520);
            boolean F11 = interfaceC3967k.F(context);
            Object C12 = interfaceC3967k.C();
            if (F11 || C12 == InterfaceC3967k.a.a()) {
                C12 = new NotificationSwitcherContentKt$rememberAreNotificationsEnabled$1$1(interfaceC3978p0, context);
                interfaceC3967k.x(C12);
            }
            interfaceC3967k.k();
            i.a(aVar, null, (Function0) C12, interfaceC3967k, 6);
        }
        interfaceC3967k.k();
        return interfaceC3978p0;
    }
}
