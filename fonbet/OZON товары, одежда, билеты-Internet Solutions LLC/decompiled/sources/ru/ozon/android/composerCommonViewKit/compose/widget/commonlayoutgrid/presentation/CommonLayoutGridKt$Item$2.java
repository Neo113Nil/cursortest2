package ru.ozon.android.composerCommonViewKit.compose.widget.commonlayoutgrid.presentation;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import Tg.b;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.composerCommonViewKit.compose.widget.commonlayoutgrid.data.CommonLayoutGridDTO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class CommonLayoutGridKt$Item$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function1<b, Unit> $actionHandler;
    final /* synthetic */ int $index;
    final /* synthetic */ boolean $isUserAnAdult;
    final /* synthetic */ t $itemTokenizedEvent;
    final /* synthetic */ CommonLayoutGridDTO $this_Item;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CommonLayoutGridKt$Item$2(CommonLayoutGridDTO commonLayoutGridDTO, int i11, boolean z11, Function1<? super b, Unit> function1, t tVar, int i12) {
        super(2);
        this.$this_Item = commonLayoutGridDTO;
        this.$index = i11;
        this.$isUserAnAdult = z11;
        this.$actionHandler = function1;
        this.$itemTokenizedEvent = tVar;
        this.$$changed = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        CommonLayoutGridKt.Item(this.$this_Item, this.$index, this.$isUserAnAdult, this.$actionHandler, this.$itemTokenizedEvent, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
