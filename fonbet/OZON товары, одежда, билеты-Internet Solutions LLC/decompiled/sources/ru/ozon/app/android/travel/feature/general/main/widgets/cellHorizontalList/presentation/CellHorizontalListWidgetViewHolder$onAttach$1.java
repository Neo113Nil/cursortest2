package ru.ozon.app.android.travel.feature.general.main.widgets.cellHorizontalList.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
/* synthetic */ class CellHorizontalListWidgetViewHolder$onAttach$1 extends C7719a implements Function2<CellHorizontalListEvent, d<? super Unit>, Object> {
    CellHorizontalListWidgetViewHolder$onAttach$1(Object obj) {
        super(2, obj, CellHorizontalListWidgetViewHolder.class, "handleEvent", "handleEvent(Lru/ozon/app/android/travel/feature/general/main/widgets/cellHorizontalList/presentation/CellHorizontalListEvent;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CellHorizontalListEvent cellHorizontalListEvent, d<? super Unit> dVar) {
        Object onAttach$handleEvent;
        onAttach$handleEvent = CellHorizontalListWidgetViewHolder.onAttach$handleEvent((CellHorizontalListWidgetViewHolder) this.receiver, cellHorizontalListEvent, dVar);
        return onAttach$handleEvent;
    }
}
