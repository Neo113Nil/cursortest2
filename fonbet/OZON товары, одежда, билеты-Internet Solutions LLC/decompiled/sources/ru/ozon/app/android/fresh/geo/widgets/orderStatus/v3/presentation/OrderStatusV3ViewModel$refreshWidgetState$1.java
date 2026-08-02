package ru.ozon.app.android.fresh.geo.widgets.orderStatus.v3.presentation;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.geo.widgets.orderStatus.v3.presentation.OrderStatusV3ViewModel", f = "OrderStatusV3ViewModel.kt", l = {50}, m = "refreshWidgetState")
/* loaded from: classes12.dex */
final class OrderStatusV3ViewModel$refreshWidgetState$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OrderStatusV3ViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderStatusV3ViewModel$refreshWidgetState$1(OrderStatusV3ViewModel orderStatusV3ViewModel, d<? super OrderStatusV3ViewModel$refreshWidgetState$1> dVar) {
        super(dVar);
        this.this$0 = orderStatusV3ViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object refreshWidgetState;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        refreshWidgetState = this.this$0.refreshWidgetState(this);
        return refreshWidgetState;
    }
}
