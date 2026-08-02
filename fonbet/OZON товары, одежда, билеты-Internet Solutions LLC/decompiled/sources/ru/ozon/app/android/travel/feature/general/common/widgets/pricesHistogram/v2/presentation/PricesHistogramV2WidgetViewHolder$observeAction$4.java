package ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v2.presentation;

import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
/* synthetic */ class PricesHistogramV2WidgetViewHolder$observeAction$4 extends C7719a implements Function2<t, d<? super Unit>, Object> {
    PricesHistogramV2WidgetViewHolder$observeAction$4(Object obj) {
        super(2, obj, PricesHistogramV2WidgetViewHolder.class, "sendAnalytics", "sendAnalytics(Lru/ozon/composer/analytics/tokenized/TokenizedEvent;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(t tVar, d<? super Unit> dVar) {
        Object observeAction$sendAnalytics;
        observeAction$sendAnalytics = PricesHistogramV2WidgetViewHolder.observeAction$sendAnalytics((PricesHistogramV2WidgetViewHolder) this.receiver, tVar, dVar);
        return observeAction$sendAnalytics;
    }
}
