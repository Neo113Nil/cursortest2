package ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v2.presentation;

import Em0.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class CustomerContactsV2WidgetViewHolder$inputsListAdapter$2 extends C7735q implements Function1<CommonInputVO.TextCommonInputVO, c> {
    CustomerContactsV2WidgetViewHolder$inputsListAdapter$2(Object obj) {
        super(1, obj, CustomerContactsV2WidgetViewHolder.class, "setFormatWatcher", "setFormatWatcher(Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$TextCommonInputVO;)Lru/tinkoff/decoro/watchers/FormatWatcher;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final c invoke(CommonInputVO.TextCommonInputVO p02) {
        c formatWatcher;
        Intrinsics.checkNotNullParameter(p02, "p0");
        formatWatcher = ((CustomerContactsV2WidgetViewHolder) this.receiver).setFormatWatcher(p02);
        return formatWatcher;
    }
}
