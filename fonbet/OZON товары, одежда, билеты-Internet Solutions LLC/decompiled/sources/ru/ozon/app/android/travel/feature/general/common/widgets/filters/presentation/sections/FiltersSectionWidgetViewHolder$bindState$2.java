package ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections;

import WZ.t;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class FiltersSectionWidgetViewHolder$bindState$2 extends C7735q implements Function2<t, Map<String, ? extends String>, Unit> {
    FiltersSectionWidgetViewHolder$bindState$2(Object obj) {
        super(2, obj, FiltersSectionWidgetViewHolder.class, "trackClickEvent", "trackClickEvent(Lru/ozon/composer/analytics/tokenized/TokenizedEvent;Ljava/util/Map;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(t tVar, Map<String, ? extends String> map) {
        invoke2(tVar, (Map<String, String>) map);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(t p02, Map<String, String> p12) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        ((FiltersSectionWidgetViewHolder) this.receiver).trackClickEvent(p02, p12);
    }
}
