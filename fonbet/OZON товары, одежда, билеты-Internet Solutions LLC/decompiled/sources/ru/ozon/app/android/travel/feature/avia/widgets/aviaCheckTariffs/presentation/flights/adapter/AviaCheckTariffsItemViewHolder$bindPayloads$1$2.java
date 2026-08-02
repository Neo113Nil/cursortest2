package ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.presentation.flights.adapter;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
/* synthetic */ class AviaCheckTariffsItemViewHolder$bindPayloads$1$2 extends C7735q implements Function1<CommonControlSettings, Unit> {
    AviaCheckTariffsItemViewHolder$bindPayloads$1$2(Object obj) {
        super(1, obj, AviaCheckTariffsItemViewHolder.class, "onExpandClicked", "onExpandClicked(Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CommonControlSettings commonControlSettings) {
        invoke2(commonControlSettings);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CommonControlSettings commonControlSettings) {
        ((AviaCheckTariffsItemViewHolder) this.receiver).onExpandClicked(commonControlSettings);
    }
}
