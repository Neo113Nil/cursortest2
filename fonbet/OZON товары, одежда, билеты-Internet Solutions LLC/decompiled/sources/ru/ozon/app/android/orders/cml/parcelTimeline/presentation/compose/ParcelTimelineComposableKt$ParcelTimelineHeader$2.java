package ru.ozon.app.android.orders.cml.parcelTimeline.presentation.compose;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.orders.cml.parcelTimeline.presentation.ParcelTimelineVO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class ParcelTimelineComposableKt$ParcelTimelineHeader$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ ParcelTimelineVO.SectionVO.ConnectorVO $connector;
    final /* synthetic */ boolean $isLastElement;
    final /* synthetic */ Function1<ParcelTimelineUpdateEvent, Unit> $onHeaderClick;
    final /* synthetic */ ParcelTimelineVO.SectionVO $section;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ParcelTimelineComposableKt$ParcelTimelineHeader$2(ParcelTimelineVO.SectionVO sectionVO, Function1<? super ParcelTimelineUpdateEvent, Unit> function1, ParcelTimelineVO.SectionVO.ConnectorVO connectorVO, boolean z11, int i11) {
        super(2);
        this.$section = sectionVO;
        this.$onHeaderClick = function1;
        this.$connector = connectorVO;
        this.$isLastElement = z11;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        ParcelTimelineComposableKt.ParcelTimelineHeader(this.$section, this.$onHeaderClick, this.$connector, this.$isLastElement, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
