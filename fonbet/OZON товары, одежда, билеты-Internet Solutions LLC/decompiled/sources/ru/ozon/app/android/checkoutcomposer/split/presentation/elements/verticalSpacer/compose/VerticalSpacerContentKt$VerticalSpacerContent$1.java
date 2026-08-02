package ru.ozon.app.android.checkoutcomposer.split.presentation.elements.verticalSpacer.compose;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.checkoutcomposer.split.presentation.elements.verticalSpacer.VerticalSpacerVO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class VerticalSpacerContentKt$VerticalSpacerContent$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ VerticalSpacerVO $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VerticalSpacerContentKt$VerticalSpacerContent$1(VerticalSpacerVO verticalSpacerVO, int i11) {
        super(2);
        this.$state = verticalSpacerVO;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        VerticalSpacerContentKt.VerticalSpacerContent(this.$state, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
