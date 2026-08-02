package ru.ozon.app.android.travel.feature.b2b.widgets.b2bUpcomingTrips.presentation.card;

import A0.g;
import A0.h;
import J0.C3343t;
import J0.R2;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import WZ.l;
import WZ.t;
import a1.c;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.AbstractC5434v;
import b00.f;
import e3.i;
import i1.C6988h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l1.C7811b0;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.b2b.widgets.b2bUpcomingTrips.data.B2BUpcomingTripsDTO;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\b\u0010\u0007\u001a-\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/b2bUpcomingTrips/presentation/card/B2BUpcomingTripsCardItemVI;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "B2BUpcomingTripsCardItemContent", "(Lru/ozon/app/android/travel/feature/b2b/widgets/b2bUpcomingTrips/presentation/card/B2BUpcomingTripsCardItemVI;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "TripItem", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "common", "onTripClick", "(Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Lkotlin/jvm/functions/Function1;)V", "b2b_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"UsingMaterialAndMaterial3Libraries"})
/* loaded from: classes13.dex */
public final class B2BUpcomingTripsCardItemContentKt {
    public static final void B2BUpcomingTripsCardItemContent(@NotNull B2BUpcomingTripsCardItemVI item, @NotNull Function1<? super AtomAction, Unit> actionHandler, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(-1028848107);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(item) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(actionHandler) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            t viewEvent = item.getViewEvent();
            u11.o(171877029);
            if (viewEvent != null) {
                l lVar = (l) u11.m(f.e());
                AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
                u11.o(1426527231);
                boolean F11 = u11.F(lVar) | u11.F(viewEvent);
                Object C11 = u11.C();
                if (F11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new B2BUpcomingTripsCardItemContentKt$B2BUpcomingTripsCardItemContent$1$1$1(lVar, viewEvent);
                    u11.x(C11);
                }
                u11.k();
                i.a(aVar, null, (Function0) C11, u11, 6);
                Unit unit = Unit.f71690a;
            }
            u11.k();
            TripItem(item, actionHandler, u11, i12 & 126);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new B2BUpcomingTripsCardItemContentKt$B2BUpcomingTripsCardItemContent$2(item, actionHandler, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TripItem(B2BUpcomingTripsCardItemVI b2BUpcomingTripsCardItemVI, Function1<? super AtomAction, Unit> function1, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        e b11;
        C3969l u11 = interfaceC3967k.u(1845368211);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(b2BUpcomingTripsCardItemVI) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(function1) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            B2BUpcomingTripsDTO.UpcomingTrip trip = b2BUpcomingTripsCardItemVI.getTrip();
            Context context = (Context) u11.m(AndroidCompositionLocals_androidKt.d());
            int themeColor = ThemeExtKt.themeColor(context, R$attr.layerFloor1);
            int parseColor = StyleParser.INSTANCE.parseColor(context, trip.getBackgroundColor(), R$color.bg_secondary);
            e eVar = e.f40358c0;
            e e11 = a0.e(eVar, 1.0f);
            if (b2BUpcomingTripsCardItemVI.getIsLast()) {
                CornerRadius cornerRadius = CornerRadius.RADIUS_500;
                eVar = C6988h.a(eVar, h.d(0.0f, 0.0f, cornerRadius.m1866getDpD9Ej5fM(), cornerRadius.m1866getDpD9Ej5fM(), 3));
            }
            b11 = androidx.compose.foundation.e.b(e11.l0(eVar), C7811b0.b(themeColor), y0.a());
            Paddings paddings = Paddings.PADDING_500;
            e j11 = T.j(b11, paddings.m1867getDpD9Ej5fM(), 0.0f, paddings.m1867getDpD9Ej5fM(), b2BUpcomingTripsCardItemVI.getIsLast() ? paddings.m1867getDpD9Ej5fM() : Paddings.PADDING_300.m1867getDpD9Ej5fM(), 2);
            long b12 = C7811b0.b(parseColor);
            float m1867getDpD9Ej5fM = Paddings.NONE.m1867getDpD9Ej5fM();
            g b13 = h.b(CornerRadius.RADIUS_500.m1866getDpD9Ej5fM());
            u11.o(-1977947539);
            boolean F11 = ((i12 & 112) == 32) | u11.F(trip);
            Object C11 = u11.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new B2BUpcomingTripsCardItemContentKt$TripItem$1$1(trip, function1);
                u11.x(C11);
            }
            u11.k();
            R2.b((Function0) C11, j11, true, b13, b12, C3343t.b(b12, u11), m1867getDpD9Ej5fM, null, c.c(469441517, new B2BUpcomingTripsCardItemContentKt$TripItem$2(trip), u11), u11, 805306368, 0);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new B2BUpcomingTripsCardItemContentKt$TripItem$3(b2BUpcomingTripsCardItemVI, function1, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onTripClick(CommonControlSettings commonControlSettings, Function1<? super AtomAction, Unit> function1) {
        AtomAction atomAction;
        if (commonControlSettings == null || (atomAction = commonControlSettings.toAtomAction()) == null) {
            return;
        }
        function1.invoke(atomAction);
    }
}
