package ru.ozon.uni.android.ds.compose.component.tooltip;

import S0.A1;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class DsTooltipKt$DsTooltip$4 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ DsTooltipBeakPosition $beakPosition;
    final /* synthetic */ boolean $hasCloseButton;
    final /* synthetic */ e $modifier;
    final /* synthetic */ A1<Integer> $offset$delegate;
    final /* synthetic */ Function0<Unit> $onCloseClick;
    final /* synthetic */ DsTooltipStyle $style;
    final /* synthetic */ String $subtitle;
    final /* synthetic */ e $subtitleModifier;
    final /* synthetic */ String $title;
    final /* synthetic */ e $titleModifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DsTooltipKt$DsTooltip$4(String str, e eVar, e eVar2, e eVar3, String str2, DsTooltipStyle dsTooltipStyle, boolean z11, DsTooltipBeakPosition dsTooltipBeakPosition, Function0<Unit> function0, A1<Integer> a12) {
        super(2);
        this.$title = str;
        this.$modifier = eVar;
        this.$titleModifier = eVar2;
        this.$subtitleModifier = eVar3;
        this.$subtitle = str2;
        this.$style = dsTooltipStyle;
        this.$hasCloseButton = z11;
        this.$beakPosition = dsTooltipBeakPosition;
        this.$onCloseClick = function0;
        this.$offset$delegate = a12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        int DsTooltip$lambda$3;
        if ((i11 & 3) == 2 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        String str = this.$title;
        e eVar = this.$modifier;
        e eVar2 = this.$titleModifier;
        e eVar3 = this.$subtitleModifier;
        String str2 = this.$subtitle;
        DsTooltipStyle dsTooltipStyle = this.$style;
        boolean z11 = this.$hasCloseButton;
        DsTooltipBeakPosition dsTooltipBeakPosition = this.$beakPosition;
        DsTooltip$lambda$3 = DsTooltipKt.DsTooltip$lambda$3(this.$offset$delegate);
        DsTooltipKt.DsTooltipBox(str, eVar, eVar2, eVar3, str2, dsTooltipStyle, z11, dsTooltipBeakPosition, DsTooltip$lambda$3, this.$onCloseClick, interfaceC3967k, 0, 0);
    }
}
