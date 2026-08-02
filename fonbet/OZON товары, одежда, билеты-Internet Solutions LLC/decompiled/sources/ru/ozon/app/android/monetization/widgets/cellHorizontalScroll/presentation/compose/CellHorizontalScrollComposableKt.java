package ru.ozon.app.android.monetization.widgets.cellHorizontalScroll.presentation.compose;

import S0.C3969l;
import S0.C3996z;
import S0.InterfaceC3967k;
import S0.J0;
import WZ.t;
import a1.c;
import androidx.lifecycle.AbstractC5434v;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e3.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n0.V;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.monetization.widgets.cellHorizontalScroll.presentation.multiCell.CellHorizontalScrollVI;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aE\u0010\t\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/monetization/widgets/cellHorizontalScroll/presentation/multiCell/CellHorizontalScrollVI;", "state", "Lkotlin/Function2;", "LWZ/t;", "", "onView", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "CellHorizontalScrollComposable", "(Lru/ozon/app/android/monetization/widgets/cellHorizontalScroll/presentation/multiCell/CellHorizontalScrollVI;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "monetization_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CellHorizontalScrollComposableKt {
    public static final void CellHorizontalScrollComposable(@NotNull CellHorizontalScrollVI state, @NotNull Function2<? super CellHorizontalScrollVI, ? super t, Unit> onView, @NotNull Function1<? super AtomAction, Unit> actionHandler, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onView, "onView");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(514339933);
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
        } else {
            t tokenizedEvent = state.getTokenizedEvent();
            u11.o(207462853);
            if (tokenizedEvent != null) {
                AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
                u11.o(207465513);
                boolean F11 = ((i12 & 112) == 32) | u11.F(state) | u11.F(tokenizedEvent);
                Object C11 = u11.C();
                if (F11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new CellHorizontalScrollComposableKt$CellHorizontalScrollComposable$1$1(onView, state, tokenizedEvent);
                    u11.x(C11);
                }
                u11.k();
                i.a(aVar, null, (Function0) C11, u11, 6);
            }
            u11.k();
            C3996z.a(V.a().c(null), c.c(1100343197, new CellHorizontalScrollComposableKt$CellHorizontalScrollComposable$2(state, actionHandler), u11), u11, 56);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new CellHorizontalScrollComposableKt$CellHorizontalScrollComposable$3(state, onView, actionHandler, i11));
        }
    }
}
