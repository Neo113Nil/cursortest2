package ru.ozon.app.android.travel.feature.avia.widgets.directFlightsDropdown.v1.presentation;

import WZ.l;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
/* synthetic */ class DirectFlightsDropdownWidgetViewHolder$onAttach$2 extends C7719a implements Function2<t, d<? super Unit>, Object> {
    DirectFlightsDropdownWidgetViewHolder$onAttach$2(Object obj) {
        super(2, obj, TokenizedAnalyticsExtensionsKt.class, "processClickEvents", "processClickEvents(Lru/ozon/composer/analytics/tokenized/TokenizedAnalytics;Lru/ozon/composer/analytics/tokenized/TokenizedEvent;Lru/ozon/composer/analytics/tokenized/CustomParamsModifier;)V", 5);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(t tVar, d<? super Unit> dVar) {
        Object onAttach$processClickEvents;
        onAttach$processClickEvents = DirectFlightsDropdownWidgetViewHolder.onAttach$processClickEvents((l) this.receiver, tVar, dVar);
        return onAttach$processClickEvents;
    }
}
