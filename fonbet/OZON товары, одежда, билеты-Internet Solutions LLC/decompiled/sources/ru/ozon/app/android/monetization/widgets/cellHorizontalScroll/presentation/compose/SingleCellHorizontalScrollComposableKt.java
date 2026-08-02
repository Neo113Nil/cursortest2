package ru.ozon.app.android.monetization.widgets.cellHorizontalScroll.presentation.compose;

import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import WZ.t;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.Q1;
import androidx.lifecycle.AbstractC5434v;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
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
import ru.ozon.app.android.monetization.widgets.cellHorizontalScroll.presentation.compose.ui.NestedHorizontalCellWrapperComposableKt;
import ru.ozon.app.android.monetization.widgets.cellHorizontalScroll.presentation.singleCell.SingleCellHorizontalScrollVI;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aE\u0010\t\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/monetization/widgets/cellHorizontalScroll/presentation/singleCell/SingleCellHorizontalScrollVI;", "state", "Lkotlin/Function2;", "LWZ/t;", "", "onView", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "SingleCellHorizontalScrollComposable", "(Lru/ozon/app/android/monetization/widgets/cellHorizontalScroll/presentation/singleCell/SingleCellHorizontalScrollVI;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "monetization_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SingleCellHorizontalScrollComposableKt {
    public static final void SingleCellHorizontalScrollComposable(@NotNull SingleCellHorizontalScrollVI state, @NotNull Function2<? super SingleCellHorizontalScrollVI, ? super t, Unit> onView, @NotNull Function1<? super AtomAction, Unit> actionHandler, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        e b11;
        Function1<? super AtomAction, Unit> function1;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onView, "onView");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(-320435083);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(state) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(onView) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(actionHandler) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
            function1 = actionHandler;
        } else {
            t tokenizedEvent = state.getTokenizedEvent();
            u11.o(-2023764307);
            if (tokenizedEvent != null) {
                AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
                u11.o(-2023761647);
                boolean F11 = ((i12 & 112) == 32) | u11.F(state) | u11.F(tokenizedEvent);
                Object C11 = u11.C();
                if (F11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new SingleCellHorizontalScrollComposableKt$SingleCellHorizontalScrollComposable$1$1(onView, state, tokenizedEvent);
                    u11.x(C11);
                }
                u11.k();
                i.a(aVar, null, (Function0) C11, u11, 6);
            }
            u11.k();
            e.a aVar2 = e.f40358c0;
            TestInfo testInfo = state.getTestInfo();
            String automatizationId = testInfo != null ? testInfo.getAutomatizationId() : null;
            if (automatizationId == null) {
                automatizationId = "";
            }
            b11 = androidx.compose.foundation.e.b(a0.u(Q1.a(aVar2, automatizationId), 3), UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getLayerFloor1(), y0.a());
            e h11 = T.h(b11, 16, 0.0f, 2);
            V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f11 = c.f(u11, h11);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 f12 = E.f(u11, f7, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, f12);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            function1 = actionHandler;
            NestedHorizontalCellWrapperComposableKt.NestedHorizontalCellWrapperComposable(state.getCell(), true, null, function1, u11, CellDTO.$stable | 48 | ((i12 << 3) & 7168), 4);
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new SingleCellHorizontalScrollComposableKt$SingleCellHorizontalScrollComposable$3(state, onView, function1, i11));
        }
    }
}
