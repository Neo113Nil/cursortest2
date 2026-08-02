package ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.core;

import WZ.l;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7719a;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class TopAuthorCounterComposeWidgetKt$TopAuthorCounterComposeWidget$1$4$3$1$1$1 extends C7719a implements Function1<t, Unit> {
    TopAuthorCounterComposeWidgetKt$TopAuthorCounterComposeWidget$1$4$3$1$1$1(Object obj) {
        super(1, obj, TokenizedAnalyticsExtKt.class, "processViewEvents", "processViewEvents(Lru/ozon/composer/analytics/tokenized/TokenizedAnalytics;Lru/ozon/composer/analytics/tokenized/TokenizedEvent;)Lkotlin/Unit;", 9);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(t tVar) {
        invoke2(tVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(t tVar) {
        TokenizedAnalyticsExtKt.processViewEvents((l) this.receiver, tVar);
    }
}
