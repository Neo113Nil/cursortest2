package ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.presentation;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.presentation.DeliveryWidgetV3ViewModel", f = "DeliveryWidgetV3ViewModel.kt", l = {151, 165}, m = "requestStateChange")
/* loaded from: classes12.dex */
final class DeliveryWidgetV3ViewModel$requestStateChange$1 extends c {
    Object L$0;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DeliveryWidgetV3ViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeliveryWidgetV3ViewModel$requestStateChange$1(DeliveryWidgetV3ViewModel deliveryWidgetV3ViewModel, d<? super DeliveryWidgetV3ViewModel$requestStateChange$1> dVar) {
        super(dVar);
        this.this$0 = deliveryWidgetV3ViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object requestStateChange;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        requestStateChange = this.this$0.requestStateChange(null, false, this);
        return requestStateChange;
    }
}
