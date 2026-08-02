package ru.ozon.app.android.travel.feature.tours.widgets.toursDetailsAccordion.presentation;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
final class ToursDetailsAccordionContentKt$ToursDetailsAccordionContent$3 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ ToursDetailsAccordionVI $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ToursDetailsAccordionContentKt$ToursDetailsAccordionContent$3(ToursDetailsAccordionVI toursDetailsAccordionVI, int i11) {
        super(2);
        this.$state = toursDetailsAccordionVI;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        ToursDetailsAccordionContentKt.ToursDetailsAccordionContent(this.$state, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
