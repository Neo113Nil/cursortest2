package ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v2.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class TravelPersonalAccountReplenishmentWidgetViewHolder$tagAdapter$1 extends C7735q implements Function2<String, Integer, Unit> {
    TravelPersonalAccountReplenishmentWidgetViewHolder$tagAdapter$1(Object obj) {
        super(2, obj, TravelPersonalAccountReplenishmentViewModel.class, "onTagClicked", "onTagClicked(Ljava/lang/String;I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(String str, Integer num) {
        invoke(str, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(String p02, int i11) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((TravelPersonalAccountReplenishmentViewModel) this.receiver).onTagClicked(p02, i11);
    }
}
