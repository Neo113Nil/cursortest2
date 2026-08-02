package ru.ozon.app.android.pdp.widgets.wholeSaleModal3P.presentation.wholeSaleModal;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.widgets.wholeSaleModal3P.data.DeliveryType;
import ru.ozon.app.android.pdp.widgets.wholeSaleModal3P.presentation.ViewIntent;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class WholeSaleModalComposableKt$WholeSaleModalComposable$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Pair<String, String> $countText;
    final /* synthetic */ Function1<ViewIntent, Unit> $onViewIntent;
    final /* synthetic */ Pair<String, String> $regionText;
    final /* synthetic */ DeliveryType $selectedTab;
    final /* synthetic */ WholeSaleModalVI $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    WholeSaleModalComposableKt$WholeSaleModalComposable$2(WholeSaleModalVI wholeSaleModalVI, DeliveryType deliveryType, Pair<String, String> pair, Pair<String, String> pair2, Function1<? super ViewIntent, Unit> function1, int i11) {
        super(2);
        this.$state = wholeSaleModalVI;
        this.$selectedTab = deliveryType;
        this.$countText = pair;
        this.$regionText = pair2;
        this.$onViewIntent = function1;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        WholeSaleModalComposableKt.WholeSaleModalComposable(this.$state, this.$selectedTab, this.$countText, this.$regionText, this.$onViewIntent, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
