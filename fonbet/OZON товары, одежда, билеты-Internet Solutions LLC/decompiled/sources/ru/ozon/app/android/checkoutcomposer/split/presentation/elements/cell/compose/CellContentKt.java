package ru.ozon.app.android.checkoutcomposer.split.presentation.elements.cell.compose;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import Tg.b;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.split.presentation.elements.cell.CellVO;
import ru.ozon.app.android.checkoutgeo.checkout.data.PaddingsKt;
import ru.ozon.uni.android.ds.compose.component.cell.DsCellAtomKt;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/split/presentation/elements/cell/CellVO;", "state", "Lkotlin/Function1;", "LTg/b;", "", "actionHandler", "CellContent", "(Lru/ozon/app/android/checkoutcomposer/split/presentation/elements/cell/CellVO;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "checkout_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CellContentKt {
    public static final void CellContent(@NotNull CellVO state, @NotNull Function1<? super b, Unit> actionHandler, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Function1<? super b, Unit> function1;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(1602060312);
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
            function1 = actionHandler;
        } else {
            function1 = actionHandler;
            DsCellAtomKt.DsCellAtom(state.getCell(), PaddingsKt.setupPaddings(e.f40358c0, state.getPaddings()), function1, u11, CellDTO.$stable | ((i12 << 3) & 896), 0);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new CellContentKt$CellContent$1(state, function1, i11));
        }
    }
}
