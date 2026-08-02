package ru.ozon.uni.android.ds.compose.component.tooltip;

import Bl0.C2652m;
import S0.A1;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import d2.C6041S;
import d2.InterfaceC6040Q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.data.common.TooltipDTO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class DsTooltipAtomKt$DsTooltipAtomWithPopupProvider$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ A1<Integer> $beakOffset;
    final /* synthetic */ TooltipDTO $dto;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function0<Unit> $onCloseClick;
    final /* synthetic */ Function0<Unit> $onDismissRequest;
    final /* synthetic */ InterfaceC6040Q $popupPositionProvider;
    final /* synthetic */ C6041S $properties;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DsTooltipAtomKt$DsTooltipAtomWithPopupProvider$2(TooltipDTO tooltipDTO, e eVar, InterfaceC6040Q interfaceC6040Q, A1<Integer> a12, C6041S c6041s, Function0<Unit> function0, Function0<Unit> function02, int i11) {
        super(2);
        this.$dto = tooltipDTO;
        this.$modifier = eVar;
        this.$popupPositionProvider = interfaceC6040Q;
        this.$beakOffset = a12;
        this.$properties = c6041s;
        this.$onDismissRequest = function0;
        this.$onCloseClick = function02;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        DsTooltipAtomKt.DsTooltipAtomWithPopupProvider(this.$dto, this.$modifier, this.$popupPositionProvider, this.$beakOffset, this.$properties, this.$onDismissRequest, this.$onCloseClick, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
