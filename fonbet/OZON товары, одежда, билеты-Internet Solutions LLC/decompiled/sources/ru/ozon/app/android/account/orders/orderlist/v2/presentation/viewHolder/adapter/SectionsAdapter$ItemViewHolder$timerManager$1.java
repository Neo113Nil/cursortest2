package ru.ozon.app.android.account.orders.orderlist.v2.presentation.viewHolder.adapter;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import ru.ozon.app.android.account.orders.orderlist.v2.presentation.viewHolder.adapter.SectionsAdapter;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class SectionsAdapter$ItemViewHolder$timerManager$1 extends C7735q implements Function1<Long, Unit> {
    SectionsAdapter$ItemViewHolder$timerManager$1(Object obj) {
        super(1, obj, SectionsAdapter.ItemViewHolder.class, "onTimerTick", "onTimerTick(J)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Long l11) {
        invoke(l11.longValue());
        return Unit.f71690a;
    }

    public final void invoke(long j11) {
        ((SectionsAdapter.ItemViewHolder) this.receiver).onTimerTick(j11);
    }
}
