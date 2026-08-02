package ru.ozon.app.android.travel.feature.tours.widgets.toursDetailsAccordion.presentation;

import S0.InterfaceC3978p0;
import WZ.l;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
final class ToursDetailsAccordionContentKt$ToursDetailsAccordionContent$2$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ InterfaceC3978p0<Boolean> $isExpanded$delegate;
    final /* synthetic */ ToursDetailsAccordionVI $state;
    final /* synthetic */ l $tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ToursDetailsAccordionContentKt$ToursDetailsAccordionContent$2$1$1(ToursDetailsAccordionVI toursDetailsAccordionVI, l lVar, InterfaceC3978p0<Boolean> interfaceC3978p0) {
        super(0);
        this.$state = toursDetailsAccordionVI;
        this.$tokenizedAnalytics = lVar;
        this.$isExpanded$delegate = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        boolean ToursDetailsAccordionContent$lambda$1;
        InterfaceC3978p0<Boolean> interfaceC3978p0 = this.$isExpanded$delegate;
        ToursDetailsAccordionContent$lambda$1 = ToursDetailsAccordionContentKt.ToursDetailsAccordionContent$lambda$1(interfaceC3978p0);
        ToursDetailsAccordionContentKt.ToursDetailsAccordionContent$lambda$2(interfaceC3978p0, !ToursDetailsAccordionContent$lambda$1);
        t tokenizedEvent = this.$state.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processClickEvents$default(this.$tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }
}
