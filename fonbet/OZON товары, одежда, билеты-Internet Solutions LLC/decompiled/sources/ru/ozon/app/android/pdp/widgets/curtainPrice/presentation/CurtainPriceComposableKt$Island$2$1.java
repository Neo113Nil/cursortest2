package ru.ozon.app.android.pdp.widgets.curtainPrice.presentation;

import D1.InterfaceC2801g;
import J0.P;
import Nk.a;
import S0.A0;
import S0.F1;
import S0.InterfaceC3967k;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import e1.InterfaceC6250b;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m3.C8060b;
import ru.ozon.app.android.pdp.widgets.curtainPrice.data.CurtainPriceDTO;
import ru.ozon.app.android.pdp.widgets.curtainPrice.presentation.CurtainPriceVI;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class CurtainPriceComposableKt$Island$2$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ CurtainPriceVI.Island $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CurtainPriceComposableKt$Island$2$1(CurtainPriceVI.Island island, Function1<? super AtomAction, Unit> function1) {
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
        if ((i11 & 3) == 2 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        CurtainPriceVI.Island island = this.$state;
        Function1<AtomAction, Unit> function1 = this.$actionHandler;
        e.a aVar = e.f40358c0;
        C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), interfaceC3967k, 0);
        int I11 = interfaceC3967k.I();
        A0 d11 = interfaceC3967k.d();
        e f7 = c.f(interfaceC3967k, aVar);
        InterfaceC2801g.f5440U.getClass();
        Function0 a12 = InterfaceC2801g.a.a();
        if (interfaceC3967k.v() == null) {
            C8060b.c();
            throw null;
        }
        interfaceC3967k.i();
        if (interfaceC3967k.t()) {
            interfaceC3967k.H(a12);
        } else {
            interfaceC3967k.e();
        }
        Function2 c11 = P.c(interfaceC3967k, a11, interfaceC3967k, d11);
        if (interfaceC3967k.t() || !Intrinsics.d(interfaceC3967k.C(), Integer.valueOf(I11))) {
            a.d(c11, I11, interfaceC3967k, I11);
        }
        F1.b(interfaceC3967k, f7, InterfaceC2801g.a.f());
        CurtainPriceDTO.PriceWrapperDTO price = island.getPrice();
        interfaceC3967k.o(-1180813589);
        boolean F11 = interfaceC3967k.F(island) | interfaceC3967k.n(function1);
        Object C11 = interfaceC3967k.C();
        if (F11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new CurtainPriceComposableKt$Island$2$1$1$1$1(island, function1);
            interfaceC3967k.x(C11);
        }
        interfaceC3967k.k();
        CurtainPriceComposableKt.RegularPrice(null, price, (Function0) C11, interfaceC3967k, (PriceDTO.$stable | CommonAtomIconDTO.$stable) << 3, 1);
        List<TextDTO> priceDescription = island.getPriceDescription();
        interfaceC3967k.o(-1180807697);
        if (priceDescription != null) {
            int i12 = 0;
            for (Object obj : priceDescription) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C7714v.O0();
                    throw null;
                }
                TextDTO textDTO = (TextDTO) obj;
                e.a aVar2 = e.f40358c0;
                interfaceC3967k.o(-17340806);
                boolean F12 = interfaceC3967k.F(island) | interfaceC3967k.n(function1);
                Object C12 = interfaceC3967k.C();
                if (F12 || C12 == InterfaceC3967k.a.a()) {
                    C12 = new CurtainPriceComposableKt$Island$2$1$1$2$1$1(island, function1);
                    interfaceC3967k.x(C12);
                }
                interfaceC3967k.k();
                DsTextAtomKt.DsTextAtom(textDTO, T.j(i.b(aVar2, null, null, false, null, null, (Function0) C12, 28), 12, i12 == 0 ? 4 : 0, 0.0f, 0.0f, 12), interfaceC3967k, 0, 0);
                i12 = i13;
            }
        }
        interfaceC3967k.k();
        interfaceC3967k.f();
    }
}
