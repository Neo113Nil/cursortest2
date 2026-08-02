package ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.presentation;

import Em0.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.molecules.input.v2.CommonInputV2VO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class TravelAddNewPassengerFormV3WidgetViewHolder$bind$3 extends C7735q implements Function1<CommonInputV2VO.TextInputV2, c> {
    TravelAddNewPassengerFormV3WidgetViewHolder$bind$3(Object obj) {
        super(1, obj, TravelAddNewPassengerFormV3WidgetViewHolder.class, "setFormatWatcher", "setFormatWatcher(Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;)Lru/tinkoff/decoro/watchers/FormatWatcher;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final c invoke(CommonInputV2VO.TextInputV2 p02) {
        c formatWatcher;
        Intrinsics.checkNotNullParameter(p02, "p0");
        formatWatcher = ((TravelAddNewPassengerFormV3WidgetViewHolder) this.receiver).setFormatWatcher(p02);
        return formatWatcher;
    }
}
