package ru.ozon.app.android.account.orders.cancel.presentation;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class CancelReasonFragment$setupObservers$1$1$5 extends C7735q implements Function1<List<? extends CancelReasonVO>, Unit> {
    CancelReasonFragment$setupObservers$1$1$5(Object obj) {
        super(1, obj, CancelReasonFragment.class, "handleItems", "handleItems(Ljava/util/List;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(List<? extends CancelReasonVO> list) {
        invoke2(list);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(List<? extends CancelReasonVO> list) {
        ((CancelReasonFragment) this.receiver).handleItems(list);
    }
}
