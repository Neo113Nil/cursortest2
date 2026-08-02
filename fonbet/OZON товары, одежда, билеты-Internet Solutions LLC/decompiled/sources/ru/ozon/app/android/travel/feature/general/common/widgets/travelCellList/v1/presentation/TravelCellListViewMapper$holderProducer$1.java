package ru.ozon.app.android.travel.feature.general.common.widgets.travelCellList.v1.presentation;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
/* synthetic */ class TravelCellListViewMapper$holderProducer$1 extends C7735q implements Function2<View, ComposerReferences, TravelCellListWidgetViewHolder> {
    public static final TravelCellListViewMapper$holderProducer$1 INSTANCE = new TravelCellListViewMapper$holderProducer$1();

    TravelCellListViewMapper$holderProducer$1() {
        super(2, TravelCellListWidgetViewHolder.class, "<init>", "<init>(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final TravelCellListWidgetViewHolder invoke(View p02, ComposerReferences p12) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        return new TravelCellListWidgetViewHolder(p02, p12);
    }
}
