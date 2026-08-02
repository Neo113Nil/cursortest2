package ru.ozon.uni.android.ds.compose.component.tooltip;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class DsTooltipKt$DsTooltipBox$3 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ int $beakOffset;
    final /* synthetic */ DsTooltipBeakPosition $beakPosition;
    final /* synthetic */ boolean $hasCloseButton;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function0<Unit> $onCloseClick;
    final /* synthetic */ DsTooltipStyle $style;
    final /* synthetic */ String $subtitle;
    final /* synthetic */ e $subtitleModifier;
    final /* synthetic */ String $title;
    final /* synthetic */ e $titleModifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DsTooltipKt$DsTooltipBox$3(String str, e eVar, e eVar2, e eVar3, String str2, DsTooltipStyle dsTooltipStyle, boolean z11, DsTooltipBeakPosition dsTooltipBeakPosition, int i11, Function0<Unit> function0, int i12, int i13) {
        super(2);
        this.$title = str;
        this.$modifier = eVar;
        this.$titleModifier = eVar2;
        this.$subtitleModifier = eVar3;
        this.$subtitle = str2;
        this.$style = dsTooltipStyle;
        this.$hasCloseButton = z11;
        this.$beakPosition = dsTooltipBeakPosition;
        this.$beakOffset = i11;
        this.$onCloseClick = function0;
        this.$$changed = i12;
        this.$$default = i13;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        DsTooltipKt.DsTooltipBox(this.$title, this.$modifier, this.$titleModifier, this.$subtitleModifier, this.$subtitle, this.$style, this.$hasCloseButton, this.$beakPosition, this.$beakOffset, this.$onCloseClick, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
