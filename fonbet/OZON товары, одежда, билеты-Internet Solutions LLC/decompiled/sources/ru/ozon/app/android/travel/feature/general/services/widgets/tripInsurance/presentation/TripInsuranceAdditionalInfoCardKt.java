package ru.ozon.app.android.travel.feature.general.services.widgets.tripInsurance.presentation;

import A0.h;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import e1.InterfaceC6250b;
import e1.d;
import i1.C6988h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.services.widgets.tripInsurance.presentation.TripInsuranceVI;
import ru.ozon.uni.android.ds.compose.component.icon.DsIconAtomKt;
import ru.ozon.uni.android.ds.compose.component.image.DsImageAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import u0.C9891D;
import u0.E;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/tripInsurance/presentation/TripInsuranceVI$AdditionalInfo;", "state", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "Lru/ozon/app/android/action/BuildedActionHandler;", "actionHandler", "TripInsuranceAdditionalInfoCard", "(Lru/ozon/app/android/travel/feature/general/services/widgets/tripInsurance/presentation/TripInsuranceVI$AdditionalInfo;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "services_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TripInsuranceAdditionalInfoCardKt {
    public static final void TripInsuranceAdditionalInfoCard(@NotNull TripInsuranceVI.AdditionalInfo state, @NotNull Function1<? super AtomAction, Unit> actionHandler, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        e b11;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(1264179477);
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
        } else {
            d.b i13 = InterfaceC6250b.a.i();
            e.a aVar = e.f40358c0;
            e e11 = a0.e(aVar, 1.0f);
            DsSpacings dsSpacings = DsSpacings.INSTANCE;
            b11 = androidx.compose.foundation.e.b(C6988h.a(e11, h.b(dsSpacings.m1845getDp16D9Ej5fM())), state.getBgColor(), y0.a());
            boolean z11 = state.getAction() != null;
            u11.o(1822959631);
            boolean z12 = ((i12 & 112) == 32) | ((i12 & 14) == 4);
            Object C11 = u11.C();
            if (z12 || C11 == InterfaceC3967k.a.a()) {
                C11 = new TripInsuranceAdditionalInfoCardKt$TripInsuranceAdditionalInfoCard$1$1(state, actionHandler);
                u11.x(C11);
            }
            u11.k();
            e g10 = T.g(i.c(b11, z11, null, null, (Function0) C11, 6), dsSpacings.m1842getDp12D9Ej5fM(), dsSpacings.m1861getDp8D9Ej5fM());
            Y b12 = X.b(C5179b.f(), i13, u11, 48);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = c.f(u11, g10);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 h11 = Cm.e.h(u11, b12, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, h11);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            C9891D c9891d = C9891D.f99599a;
            e a12 = c9891d.a(aVar, 1.0f, true);
            Y b13 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
            int I12 = u11.I();
            A0 d12 = u11.d();
            e f11 = c.f(u11, a12);
            Function0 a13 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a13);
            } else {
                u11.e();
            }
            Function2 h12 = Cm.e.h(u11, b13, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                a.d(I12, u11, I12, h12);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            DsTextAtomKt.DsTextAtom(state.getTitle(), c9891d.a(aVar, 1.0f, false), u11, 0, 0);
            IconDTO icon = state.getIcon();
            u11.o(1317906595);
            if (icon != null) {
                E.a(u11, a0.r(aVar, dsSpacings.m1854getDp4D9Ej5fM()));
                DsIconAtomKt.DsIconAtom(icon, null, u11, IconDTO.$stable, 2);
            }
            u11.k();
            u11.f();
            ImageDTO image = state.getImage();
            u11.o(1348532074);
            if (image != null) {
                E.a(u11, a0.r(aVar, dsSpacings.m1861getDp8D9Ej5fM()));
                DsImageAtomKt.DsImageAtom(image, a0.f(aVar, dsSpacings.m1848getDp20D9Ej5fM()), u11, 0, 0);
            }
            u11.k();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new TripInsuranceAdditionalInfoCardKt$TripInsuranceAdditionalInfoCard$3(state, actionHandler, i11));
        }
    }
}
