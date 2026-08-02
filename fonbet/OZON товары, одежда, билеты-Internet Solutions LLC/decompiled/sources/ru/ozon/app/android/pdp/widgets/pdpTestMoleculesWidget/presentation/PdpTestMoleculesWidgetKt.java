package ru.ozon.app.android.pdp.widgets.pdpTestMoleculesWidget.presentation;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import Sc.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.pdpTestMoleculesWidget.presentation.PdpTestMoleculesVI;
import ru.ozon.app.android.saleBadge.presentation.SaleBadgeWidgetKt;
import ru.ozon.app.android.timerMolecule.presentation.compose.TimerMoleculeWidgetKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/pdp/widgets/pdpTestMoleculesWidget/presentation/PdpTestMoleculesVI;", "state", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "PdpTestMoleculesWidget", "(Lru/ozon/app/android/pdp/widgets/pdpTestMoleculesWidget/presentation/PdpTestMoleculesVI;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "pdp_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PdpTestMoleculesWidgetKt {
    public static final void PdpTestMoleculesWidget(@NotNull PdpTestMoleculesVI state, @NotNull Function1<? super AtomAction, Unit> actionHandler, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l c3969l;
        Function1<? super AtomAction, Unit> function1;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(571026108);
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
            c3969l = u11;
        } else {
            PdpTestMoleculesVI.MoleculesWrapper moleculesWrapper = state.getMoleculesWrapper();
            if (moleculesWrapper instanceof PdpTestMoleculesVI.MoleculesWrapper.TimerMolecule) {
                u11.o(-256581541);
                c3969l = u11;
                TimerMoleculeWidgetKt.TimerMoleculeWidget(((PdpTestMoleculesVI.MoleculesWrapper.TimerMolecule) state.getMoleculesWrapper()).getTimer(), null, null, false, null, false, c3969l, 0, 62);
                c3969l.k();
                function1 = actionHandler;
            } else {
                c3969l = u11;
                if (!(moleculesWrapper instanceof PdpTestMoleculesVI.MoleculesWrapper.SaleBadgeMolecule)) {
                    c3969l.o(-256584323);
                    c3969l.k();
                    throw new o();
                }
                c3969l.o(-256577447);
                function1 = actionHandler;
                SaleBadgeWidgetKt.SaleBadgeWidget(((PdpTestMoleculesVI.MoleculesWrapper.SaleBadgeMolecule) state.getMoleculesWrapper()).getBadge(), null, function1, c3969l, (i12 << 3) & 896, 2);
                c3969l.k();
            }
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new PdpTestMoleculesWidgetKt$PdpTestMoleculesWidget$1(state, function1, i11));
        }
    }
}
