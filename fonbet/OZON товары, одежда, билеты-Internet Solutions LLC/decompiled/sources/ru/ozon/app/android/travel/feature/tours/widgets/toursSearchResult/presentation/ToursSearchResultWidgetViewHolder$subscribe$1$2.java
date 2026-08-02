package ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class ToursSearchResultWidgetViewHolder$subscribe$1$2 extends C7735q implements Function1<Long, Unit> {
    ToursSearchResultWidgetViewHolder$subscribe$1$2(Object obj) {
        super(1, obj, ToursSearchResultWidgetViewHolder.class, "startTimer", "startTimer(J)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Long l11) {
        invoke(l11.longValue());
        return Unit.f71690a;
    }

    public final void invoke(long j11) {
        ((ToursSearchResultWidgetViewHolder) this.receiver).startTimer(j11);
    }
}
