package ru.ozon.app.android.pdp.widgets.curtainPrice.presentation;

import S0.InterfaceC3967k;
import S1.p;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.Q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import n0.C8366G;
import ru.ozon.app.android.partnerBanks.presentation.PartnerBanksVO;
import ru.ozon.app.android.partnerBanks.presentation.compose.PartnersBanksWidgetKt;
import ru.ozon.app.android.pdp.widgets.curtainPrice.presentation.CurtainPriceVI;
import ru.ozon.pikazon.compose.painter.PikazonImagePainter;
import ru.ozon.pikazon.compose.painter.f;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class CurtainPriceComposableKt$Island$2$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ CurtainPriceVI.Island $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CurtainPriceComposableKt$Island$2$2(CurtainPriceVI.Island island, Function1<? super AtomAction, Unit> function1) {
        super(2);
        this.$state = island;
        this.$actionHandler = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        String image;
        String str;
        if ((i11 & 3) == 2 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        PartnerBanksVO partnerBanks = this.$state.getPartnerBanks();
        interfaceC3967k.o(1522341198);
        if (partnerBanks != null) {
            PartnersBanksWidgetKt.PartnersBanksWidget(partnerBanks, T.j(e.f40358c0, 0.0f, this.$state.getPrice().getDescription() != null ? 4 : 0, 8, 0.0f, 9), this.$actionHandler, interfaceC3967k, 0, 0);
            Unit unit = Unit.f71690a;
        }
        interfaceC3967k.k();
        CurtainPriceVI.BankLogo defaultBankLogo = this.$state.getDefaultBankLogo();
        if (defaultBankLogo == null) {
            return;
        }
        CurtainPriceVI.Island island = this.$state;
        Function1<AtomAction, Unit> function1 = this.$actionHandler;
        if (!p.a(interfaceC3967k) || (image = defaultBankLogo.getDarkImage()) == null) {
            image = defaultBankLogo.getImage();
        }
        PikazonImagePainter a11 = f.a(image, null, null, null, interfaceC3967k, 0, 14);
        e r11 = a0.r(T.j(e.f40358c0, 0.0f, island.getPrice().getDescription() != null ? 10 : 0, 12, 0.0f, 9), 95);
        interfaceC3967k.o(-1180760053);
        boolean F11 = interfaceC3967k.F(defaultBankLogo) | interfaceC3967k.n(function1);
        Object C11 = interfaceC3967k.C();
        if (F11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new CurtainPriceComposableKt$Island$2$2$2$1$1(defaultBankLogo, function1);
            interfaceC3967k.x(C11);
        }
        interfaceC3967k.k();
        e f7 = a0.f(i.b(r11, null, null, false, null, null, (Function0) C11, 28), 20);
        TestInfo testInfo = defaultBankLogo.getTestInfo();
        if (testInfo == null || (str = testInfo.getAutomatizationId()) == null) {
            str = "";
        }
        C8366G.a(a11, null, Q1.a(f7, str), null, null, 0.0f, null, interfaceC3967k, 48, 120);
    }
}
