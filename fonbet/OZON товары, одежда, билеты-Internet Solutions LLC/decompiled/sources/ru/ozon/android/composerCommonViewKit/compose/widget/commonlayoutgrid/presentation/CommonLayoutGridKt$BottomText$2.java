package ru.ozon.android.composerCommonViewKit.compose.widget.commonlayoutgrid.presentation;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.composerCommonViewKit.compose.widget.commonlayoutgrid.data.CommonLayoutGridDTO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class CommonLayoutGridKt$BottomText$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $index;
    final /* synthetic */ List<CommonLayoutGridDTO.Item> $items;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommonLayoutGridKt$BottomText$2(int i11, List<CommonLayoutGridDTO.Item> list, int i12) {
        super(2);
        this.$index = i11;
        this.$items = list;
        this.$$changed = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        CommonLayoutGridKt.BottomText(this.$index, this.$items, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
