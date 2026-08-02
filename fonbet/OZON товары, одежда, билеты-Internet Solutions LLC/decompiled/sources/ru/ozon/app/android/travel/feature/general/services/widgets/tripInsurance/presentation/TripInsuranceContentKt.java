package ru.ozon.app.android.travel.feature.general.services.widgets.tripInsurance.presentation;

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
import ru.ozon.uni.android.ds.compose.component.cell.DsCellAtomKt;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.core.repository.UniTheme;
import u0.E;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/tripInsurance/presentation/TripInsuranceVI;", "state", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "TripInsuranceContent", "(Lru/ozon/app/android/travel/feature/general/services/widgets/tripInsurance/presentation/TripInsuranceVI;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "services_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TripInsuranceContentKt {
    public static final void TripInsuranceContent(@NotNull TripInsuranceVI state, @NotNull Function1<? super AtomAction, Unit> actionHandler, InterfaceC3967k interfaceC3967k, int i11) {
        e b11;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(1628520794);
        int i12 = (i11 & 6) == 0 ? (u11.n(state) ? 4 : 2) | i11 : i11;
        if ((i11 & 48) == 0) {
            i12 |= u11.F(actionHandler) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            l lVar = (l) u11.m(f.e());
            AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
            u11.o(413876139);
            boolean F11 = ((i12 & 14) == 4) | u11.F(lVar);
            Object C11 = u11.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new TripInsuranceContentKt$TripInsuranceContent$1$1(state, lVar);
                u11.x(C11);
            }
            u11.k();
            i.a(aVar, null, (Function0) C11, u11, 6);
            e.a aVar2 = e.f40358c0;
            b11 = androidx.compose.foundation.e.b(a0.e(aVar2, 1.0f), UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getLayerFloor1(), y0.a());
            DsSpacings dsSpacings = DsSpacings.INSTANCE;
            e h11 = T.h(b11, dsSpacings.m1861getDp8D9Ej5fM(), 0.0f, 2);
            C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = c.f(u11, h11);
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
            F1.b(u11, f7, InterfaceC2801g.a.f());
            DsCellAtomKt.DsCellAtom(state.getMobileHeader(), T.h(a0.e(aVar2, 1.0f), dsSpacings.m1861getDp8D9Ej5fM(), 0.0f, 2), actionHandler, u11, ((i12 << 3) & 896) | CellDTO.$stable, 0);
            E.a(u11, a0.f(aVar2, dsSpacings.m1861getDp8D9Ej5fM()));
            u11.o(-895254120);
            for (CellDTO cellDTO : state.getBenefits()) {
                u11.G(-1785807517, cellDTO.getCenterBlock().getTitle().getText());
                e.a aVar3 = e.f40358c0;
                e e11 = a0.e(aVar3, 1.0f);
                DsSpacings dsSpacings2 = DsSpacings.INSTANCE;
                DsCellAtomKt.DsCellAtom(cellDTO, T.h(e11, dsSpacings2.m1861getDp8D9Ej5fM(), 0.0f, 2), null, u11, CellDTO.$stable, 4);
                u11.J();
                E.a(u11, a0.f(aVar3, dsSpacings2.m1859getDp6D9Ej5fM()));
            }
            u11.k();
            E.a(u11, a0.f(e.f40358c0, DsSpacings.INSTANCE.m1859getDp6D9Ej5fM()));
            TripInsuranceAdditionalInfoCardKt.TripInsuranceAdditionalInfoCard(state.getAdditionalInfo(), actionHandler, u11, i12 & 112);
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new TripInsuranceContentKt$TripInsuranceContent$3(state, actionHandler, i11));
        }
    }
}
