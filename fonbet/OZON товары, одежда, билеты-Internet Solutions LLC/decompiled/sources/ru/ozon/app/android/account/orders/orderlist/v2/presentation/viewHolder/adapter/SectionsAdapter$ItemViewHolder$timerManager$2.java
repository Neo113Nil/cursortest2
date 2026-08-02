package ru.ozon.app.android.account.orders.orderlist.v2.presentation.viewHolder.adapter;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C7735q;
import ru.ozon.app.android.account.orders.orderlist.v2.presentation.viewHolder.adapter.SectionsAdapter;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class SectionsAdapter$ItemViewHolder$timerManager$2 extends C7735q implements Function0<Unit> {
    SectionsAdapter$ItemViewHolder$timerManager$2(Object obj) {
        super(0, obj, SectionsAdapter.ItemViewHolder.class, "onTimerComplete", "onTimerComplete()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((SectionsAdapter.ItemViewHolder) this.receiver).onTimerComplete();
    }
}
