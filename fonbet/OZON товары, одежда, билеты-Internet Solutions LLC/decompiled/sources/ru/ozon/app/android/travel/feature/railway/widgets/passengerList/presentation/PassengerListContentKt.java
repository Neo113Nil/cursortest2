package ru.ozon.app.android.travel.feature.railway.widgets.passengerList.presentation;

import A0.h;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import K00.b;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import WZ.l;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.lifecycle.AbstractC5434v;
import b00.f;
import e1.InterfaceC6250b;
import e3.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.railway.widgets.passengerList.presentation.PassengerListVI;
import ru.ozon.app.android.travel.utils.extensions.ComposeColorKt;
import ru.ozon.uni.android.ds.compose.component.cell.DsCellAtomKt;
import ru.ozon.uni.android.ds.compose.component.icon.DsIconAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.core.UniColors;
import u0.E;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/passengerList/presentation/PassengerListVI;", "state", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "PassengerListContent", "(Lru/ozon/app/android/travel/feature/railway/widgets/passengerList/presentation/PassengerListVI;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "railway_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PassengerListContentKt {
    public static final void PassengerListContent(@NotNull PassengerListVI state, @NotNull Function1<? super AtomAction, Unit> function1, InterfaceC3967k interfaceC3967k, int i11) {
        e b11;
        Function1<? super AtomAction, Unit> function12;
        Function1<? super AtomAction, Unit> function13;
        float f7;
        int i12;
        e b12;
        Function1<? super AtomAction, Unit> actionHandler = function1;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(-185197041);
        int i13 = 2;
        int i14 = (i11 & 6) == 0 ? (u11.F(state) ? 4 : 2) | i11 : i11;
        int i15 = 32;
        if ((i11 & 48) == 0) {
            i14 |= u11.F(actionHandler) ? 32 : 16;
        }
        int i16 = i14;
        if ((i16 & 19) == 18 && u11.b()) {
            u11.j();
            function12 = actionHandler;
        } else {
            l lVar = (l) u11.m(f.e());
            AbstractC5434v.a aVar = AbstractC5434v.a.ON_START;
            u11.o(-808081162);
            boolean F11 = u11.F(state) | u11.F(lVar);
            Object C11 = u11.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new PassengerListContentKt$PassengerListContent$1$1(state, lVar);
                u11.x(C11);
            }
            u11.k();
            int i17 = 6;
            i.a(aVar, null, (Function0) C11, u11, 6);
            float f11 = 1.0f;
            b11 = androidx.compose.foundation.e.b(a0.e(e.f40358c0, 1.0f), ComposeColorKt.composeColor(UniColors.LAYER_FLOOR_1, u11, 6), y0.a());
            C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f12 = c.f(u11, b11);
            Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 g10 = b.g(u11, a11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, g10);
            }
            F1.b(u11, f12, InterfaceC2801g.a.f());
            u11.o(-1234451126);
            for (PassengerListVI.Passenger passenger : state.getPassengers()) {
                u11.G(1597878958, Integer.valueOf(passenger.getId()));
                CellDTO passengerInfo = passenger.getPassengerInfo();
                e.a aVar2 = e.f40358c0;
                DsCellAtomKt.DsCellAtom(passengerInfo, T.h(a0.e(aVar2, f11), Paddings.PADDING_500.m1867getDpD9Ej5fM(), 0.0f, i13), actionHandler, u11, CellDTO.$stable | ((i16 << 3) & 896), 0);
                u11.J();
                u11.o(-1234439982);
                if (passenger.getTicketNumber() == null || passenger.getCopyIcon() == null) {
                    function13 = function1;
                } else {
                    Paddings paddings = Paddings.PADDING_100;
                    E.a(u11, a0.f(aVar2, paddings.m1867getDpD9Ej5fM()));
                    e g11 = T.g(androidx.compose.foundation.e.b(T.j(a0.v(aVar2, null, 3), 74, 0.0f, 0.0f, 0.0f, 14), ComposeColorKt.composeColor(UniColors.BG_ACTION_SECONDARY, u11, i17), h.b(CornerRadius.RADIUS_300.m1866getDpD9Ej5fM())), Paddings.PADDING_300.m1867getDpD9Ej5fM(), paddings.m1867getDpD9Ej5fM());
                    u11.o(1597910644);
                    boolean F12 = u11.F(passenger) | ((i16 & 112) == i15);
                    Object C12 = u11.C();
                    if (F12 || C12 == InterfaceC3967k.a.a()) {
                        function13 = function1;
                        C12 = new PassengerListContentKt$PassengerListContent$2$1$1$1(passenger, function13);
                        u11.x(C12);
                    } else {
                        function13 = function1;
                    }
                    u11.k();
                    e c11 = androidx.compose.foundation.i.c(g11, false, null, null, (Function0) C12, 7);
                    Y b13 = X.b(C5179b.f(), InterfaceC6250b.a.l(), u11, 0);
                    int I12 = u11.I();
                    A0 d12 = u11.d();
                    e f13 = c.f(u11, c11);
                    Function0 a13 = g.a(InterfaceC2801g.f5440U, u11);
                    if (u11.t()) {
                        u11.H(a13);
                    } else {
                        u11.e();
                    }
                    Function2 h11 = Cm.e.h(u11, b13, u11, d12);
                    if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                        a.d(I12, u11, I12, h11);
                    }
                    F1.b(u11, f13, InterfaceC2801g.a.f());
                    DsTextAtomKt.DsTextAtom(passenger.getTicketNumber(), null, u11, 0, i13);
                    E.a(u11, a0.r(aVar2, paddings.m1867getDpD9Ej5fM()));
                    DsIconAtomKt.DsIconAtom(passenger.getCopyIcon(), null, u11, IconDTO.$stable, i13);
                    u11.f();
                }
                u11.k();
                u11.o(-1234404977);
                if (passenger.getIsSeparatorVisible()) {
                    E.a(u11, a0.f(aVar2, Paddings.PADDING_350.m1867getDpD9Ej5fM()));
                    f7 = 1.0f;
                    i12 = 6;
                    b12 = androidx.compose.foundation.e.b(T.j(a0.e(a0.f(aVar2, 1), 1.0f), 72, 0.0f, 0.0f, 0.0f, 14), ComposeColorKt.composeColor(UniColors.GRAPHIC_NEUTRAL, u11, 6), y0.a());
                    E.a(u11, b12);
                    E.a(u11, a0.f(aVar2, Paddings.PADDING_400.m1867getDpD9Ej5fM()));
                } else {
                    f7 = 1.0f;
                    i12 = 6;
                }
                u11.k();
                f11 = f7;
                i17 = i12;
                i13 = 2;
                i15 = 32;
                actionHandler = function13;
            }
            function12 = actionHandler;
            u11.k();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new PassengerListContentKt$PassengerListContent$3(state, function12, i11));
        }
    }
}
