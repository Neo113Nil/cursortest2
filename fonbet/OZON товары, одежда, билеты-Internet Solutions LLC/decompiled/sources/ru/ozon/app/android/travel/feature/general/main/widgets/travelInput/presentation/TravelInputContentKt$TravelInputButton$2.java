package ru.ozon.app.android.travel.feature.general.main.widgets.travelInput.presentation;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class TravelInputContentKt$TravelInputButton$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ ButtonV3DTO $button;
    final /* synthetic */ String $inputName;
    final /* synthetic */ Function2<AtomAction, String, Unit> $onButtonClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TravelInputContentKt$TravelInputButton$2(ButtonV3DTO buttonV3DTO, String str, Function2<? super AtomAction, ? super String, Unit> function2, int i11) {
        super(2);
        this.$button = buttonV3DTO;
        this.$inputName = str;
        this.$onButtonClick = function2;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        TravelInputContentKt.TravelInputButton(this.$button, this.$inputName, this.$onButtonClick, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
