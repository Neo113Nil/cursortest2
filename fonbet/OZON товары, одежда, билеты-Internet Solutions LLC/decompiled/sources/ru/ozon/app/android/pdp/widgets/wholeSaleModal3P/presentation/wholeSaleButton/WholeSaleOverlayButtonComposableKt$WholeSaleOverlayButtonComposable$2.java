package ru.ozon.app.android.pdp.widgets.wholeSaleModal3P.presentation.wholeSaleButton;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class WholeSaleOverlayButtonComposableKt$WholeSaleOverlayButtonComposable$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function0<Unit> $onButtonClick;
    final /* synthetic */ WholeSaleModalButtonVI $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WholeSaleOverlayButtonComposableKt$WholeSaleOverlayButtonComposable$2(WholeSaleModalButtonVI wholeSaleModalButtonVI, Function0<Unit> function0, int i11) {
        super(2);
        this.$state = wholeSaleModalButtonVI;
        this.$onButtonClick = function0;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        WholeSaleOverlayButtonComposableKt.WholeSaleOverlayButtonComposable(this.$state, this.$onButtonClick, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
