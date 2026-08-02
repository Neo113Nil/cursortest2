package ru.ozon.app.android.travel.feature.general.main.widgets.unpaidOrderList.presentation;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import ru.ozon.app.android.travel.feature.general.main.widgets.unpaidOrderList.presentation.UnpaidOrderListVO;
import ru.ozon.app.android.travel.feature.general.main.widgets.unpaidOrderList.presentation.adapter.UnpaidOrderListAdapter;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
/* synthetic */ class UnpaidOrderListWidgetViewHolder$observeViewModel$1 extends C7735q implements Function1<List<UnpaidOrderListVO.OrderVO>, Unit> {
    UnpaidOrderListWidgetViewHolder$observeViewModel$1(Object obj) {
        super(1, obj, UnpaidOrderListAdapter.class, "submitList", "submitList(Ljava/util/List;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(List<UnpaidOrderListVO.OrderVO> list) {
        invoke2(list);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(List<UnpaidOrderListVO.OrderVO> list) {
        ((UnpaidOrderListAdapter) this.receiver).submitList(list);
    }
}
