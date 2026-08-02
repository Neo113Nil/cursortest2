package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormFooterCell;

import B1.B;
import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ReviewFormFooterCellComposableKt$TooltipSyncEffect$4 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ B $anchorCoordinates;
    final /* synthetic */ boolean $isTooltipVisible;
    final /* synthetic */ ReviewFormFooterCellVO $item;
    final /* synthetic */ Function0<Unit> $onTooltipActivated;
    final /* synthetic */ Function0<Unit> $onTooltipClosed;
    final /* synthetic */ Function1<String, Unit> $onTooltipShown;
    final /* synthetic */ Function1<String, Boolean> $shouldShowTooltip;
    final /* synthetic */ boolean $tooltipClosed;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ReviewFormFooterCellComposableKt$TooltipSyncEffect$4(ReviewFormFooterCellVO reviewFormFooterCellVO, boolean z11, boolean z12, B b11, Function1<? super String, Boolean> function1, Function0<Unit> function0, Function1<? super String, Unit> function12, Function0<Unit> function02, int i11) {
        super(2);
        this.$item = reviewFormFooterCellVO;
        this.$tooltipClosed = z11;
        this.$isTooltipVisible = z12;
        this.$anchorCoordinates = b11;
        this.$shouldShowTooltip = function1;
        this.$onTooltipActivated = function0;
        this.$onTooltipShown = function12;
        this.$onTooltipClosed = function02;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        ReviewFormFooterCellComposableKt.TooltipSyncEffect(this.$item, this.$tooltipClosed, this.$isTooltipVisible, this.$anchorCoordinates, this.$shouldShowTooltip, this.$onTooltipActivated, this.$onTooltipShown, this.$onTooltipClosed, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
