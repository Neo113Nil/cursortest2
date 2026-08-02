package ru.ozon.app.android.checkoutcomposer.mercuryCertificatesAddress.presentation;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.checkoutcomposer.mercuryCertificatesAddress.presentation.UiState;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class MercuryCertificatesAddressWidgetKt$Addresses$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ UiState.AddressesState $addressesState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MercuryCertificatesAddressWidgetKt$Addresses$2(UiState.AddressesState addressesState, Function1<? super AtomAction, Unit> function1, int i11) {
        super(2);
        this.$addressesState = addressesState;
        this.$actionHandler = function1;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        MercuryCertificatesAddressWidgetKt.Addresses(this.$addressesState, this.$actionHandler, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
