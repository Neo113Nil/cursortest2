package ru.ozon.app.android.orders.cml.parcelTimeline.presentation.compose;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.orders.cml.parcelTimeline.presentation.ParcelTimelineVO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class ParcelTimelineComposableKt$ParcelTimelineStep$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ ParcelTimelineVO.SectionVO.ConnectorVO $connector;
    final /* synthetic */ boolean $isLastStep;
    final /* synthetic */ boolean $isVisible;
    final /* synthetic */ ParcelTimelineVO.SectionVO.TimelineStepVO $step;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ParcelTimelineComposableKt$ParcelTimelineStep$2(boolean z11, ParcelTimelineVO.SectionVO.TimelineStepVO timelineStepVO, ParcelTimelineVO.SectionVO.ConnectorVO connectorVO, boolean z12, int i11) {
        super(2);
        this.$isVisible = z11;
        this.$step = timelineStepVO;
        this.$connector = connectorVO;
        this.$isLastStep = z12;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        ParcelTimelineComposableKt.ParcelTimelineStep(this.$isVisible, this.$step, this.$connector, this.$isLastStep, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
