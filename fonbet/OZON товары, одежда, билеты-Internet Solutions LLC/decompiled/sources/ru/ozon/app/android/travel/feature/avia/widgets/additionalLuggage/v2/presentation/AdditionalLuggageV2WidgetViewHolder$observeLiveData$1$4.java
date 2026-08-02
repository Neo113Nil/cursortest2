package ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
/* synthetic */ class AdditionalLuggageV2WidgetViewHolder$observeLiveData$1$4 extends C7735q implements Function1<Integer, Unit> {
    AdditionalLuggageV2WidgetViewHolder$observeLiveData$1$4(Object obj) {
        super(1, obj, AdditionalLuggageV2WidgetViewHolder.class, "scrollToTabPosition", "scrollToTabPosition(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(int i11) {
        ((AdditionalLuggageV2WidgetViewHolder) this.receiver).scrollToTabPosition(i11);
    }
}
