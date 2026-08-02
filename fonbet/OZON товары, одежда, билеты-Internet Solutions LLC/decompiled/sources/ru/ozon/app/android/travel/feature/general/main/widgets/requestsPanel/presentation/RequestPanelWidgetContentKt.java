package ru.ozon.app.android.travel.feature.general.main.widgets.requestsPanel.presentation;

import A0.h;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import Tg.b;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import e1.InterfaceC6250b;
import i1.C6988h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7811b0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.ds.compose.component.cell.DsCellAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import u0.C9915y;
import u0.E;
import v0.C10164d;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/requestsPanel/presentation/RequestPanelVI;", "state", "Lkotlin/Function1;", "LTg/b;", "", "actionHandler", "RequestPanelWidgetContent", "(Lru/ozon/app/android/travel/feature/general/main/widgets/requestsPanel/presentation/RequestPanelVI;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "main_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RequestPanelWidgetContentKt {
    @SuppressLint({"UnusedBoxWithConstraintsScope"})
    public static final void RequestPanelWidgetContent(@NotNull RequestPanelVI state, @NotNull Function1<? super b, Unit> actionHandler, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        e.a aVar;
        CornerRadius cornerRadius;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(372982070);
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
            Context context = (Context) u11.m(AndroidCompositionLocals_androidKt.d());
            e.a aVar2 = e.f40358c0;
            e e11 = a0.e(androidx.compose.foundation.e.b(aVar2, C7811b0.b(ThemeExtKt.themeColor(context, R$attr.layerFloor1)), h.b(CornerRadius.RADIUS_600.m1866getDpD9Ej5fM())), 1.0f);
            C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = c.f(u11, e11);
            Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 g10 = K00.b.g(u11, a11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, g10);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            Paddings paddings = Paddings.PADDING_500;
            E.a(u11, a0.f(aVar2, paddings.m1867getDpD9Ej5fM()));
            DsTextAtomKt.DsTextAtom(state.getTitle(), T.h(aVar2, paddings.m1867getDpD9Ej5fM(), 0.0f, 2), u11, 0, 0);
            if (state.getRequests().size() == 1) {
                u11.o(47519332);
                E.a(u11, a0.f(aVar2, Paddings.PADDING_400.m1867getDpD9Ej5fM()));
                CellDTO cellDTO = (CellDTO) C7714v.K(state.getRequests());
                e h11 = T.h(a0.e(aVar2, 1.0f), Paddings.PADDING_300.m1867getDpD9Ej5fM(), 0.0f, 2);
                CellDTO.Settings settings = cellDTO.getSettings();
                if (settings == null || (cornerRadius = settings.getCornerRadius()) == null) {
                    cornerRadius = CornerRadius.RADIUS_500;
                }
                DsCellAtomKt.DsCellAtom(cellDTO, C6988h.a(h11, h.b(cornerRadius.m1866getDpD9Ej5fM())), actionHandler, u11, ((i12 << 3) & 896) | CellDTO.$stable, 0);
                u11.k();
                aVar = aVar2;
            } else if (state.getRequests().size() > 1) {
                u11.o(48133721);
                E.a(u11, a0.f(aVar2, Paddings.PADDING_400.m1867getDpD9Ej5fM()));
                Paddings paddings2 = Paddings.PADDING_300;
                C5179b.i n11 = C5179b.n(paddings2.m1867getDpD9Ej5fM());
                C9915y a13 = T.a(paddings2.m1867getDpD9Ej5fM(), 2, 0.0f);
                u11.o(417203429);
                boolean F11 = u11.F(state) | ((i12 & 112) == 32);
                Object C11 = u11.C();
                if (F11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new RequestPanelWidgetContentKt$RequestPanelWidgetContent$1$1$1(state, actionHandler);
                    u11.x(C11);
                }
                u11.k();
                aVar = aVar2;
                C10164d.b(null, null, a13, n11, null, null, false, (Function1) C11, u11, 0, 235);
                u11.k();
            } else {
                aVar = aVar2;
                u11.o(49003426);
                u11.k();
            }
            E.a(u11, a0.f(aVar, paddings.m1867getDpD9Ej5fM()));
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new RequestPanelWidgetContentKt$RequestPanelWidgetContent$2(state, actionHandler, i11));
        }
    }
}
