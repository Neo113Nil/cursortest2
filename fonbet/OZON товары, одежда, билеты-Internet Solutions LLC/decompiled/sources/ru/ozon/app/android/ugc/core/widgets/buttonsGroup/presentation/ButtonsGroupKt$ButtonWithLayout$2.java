package ru.ozon.app.android.ugc.core.widgets.buttonsGroup.presentation;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import Tg.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.ugc.core.widgets.buttonsGroup.presentation.ButtonsGroupVO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import u0.InterfaceC9890C;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ButtonsGroupKt$ButtonWithLayout$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function1<b, Unit> $actionHandler;
    final /* synthetic */ ButtonsGroupVO.ButtonItem $buttonItem;
    final /* synthetic */ ButtonV3DTO $dto;
    final /* synthetic */ InterfaceC9890C $this_ButtonWithLayout;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ButtonsGroupKt$ButtonWithLayout$2(InterfaceC9890C interfaceC9890C, ButtonsGroupVO.ButtonItem buttonItem, ButtonV3DTO buttonV3DTO, Function1<? super b, Unit> function1, int i11) {
        super(2);
        this.$this_ButtonWithLayout = interfaceC9890C;
        this.$buttonItem = buttonItem;
        this.$dto = buttonV3DTO;
        this.$actionHandler = function1;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        ButtonsGroupKt.ButtonWithLayout(this.$this_ButtonWithLayout, this.$buttonItem, this.$dto, this.$actionHandler, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
