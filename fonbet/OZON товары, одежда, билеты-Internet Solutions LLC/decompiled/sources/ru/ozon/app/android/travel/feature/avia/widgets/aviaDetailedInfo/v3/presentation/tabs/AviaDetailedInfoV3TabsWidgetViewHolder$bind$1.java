package ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.presentation.tabs;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.presentation.AviaDetailedInfoV3ViewModel;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
/* synthetic */ class AviaDetailedInfoV3TabsWidgetViewHolder$bind$1 extends C7735q implements Function1<Integer, Unit> {
    AviaDetailedInfoV3TabsWidgetViewHolder$bind$1(Object obj) {
        super(1, obj, AviaDetailedInfoV3ViewModel.class, "publishSelectedIndex", "publishSelectedIndex(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(int i11) {
        ((AviaDetailedInfoV3ViewModel) this.receiver).publishSelectedIndex(i11);
    }
}
