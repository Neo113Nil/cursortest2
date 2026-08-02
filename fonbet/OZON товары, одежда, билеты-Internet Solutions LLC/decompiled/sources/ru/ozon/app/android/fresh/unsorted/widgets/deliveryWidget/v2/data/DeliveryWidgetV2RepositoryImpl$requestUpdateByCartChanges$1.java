package ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.data;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.data.DeliveryWidgetV2RepositoryImpl", f = "DeliveryWidgetV2RepositoryImpl.kt", l = {50}, m = "requestUpdateByCartChanges")
/* loaded from: classes12.dex */
final class DeliveryWidgetV2RepositoryImpl$requestUpdateByCartChanges$1 extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DeliveryWidgetV2RepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeliveryWidgetV2RepositoryImpl$requestUpdateByCartChanges$1(DeliveryWidgetV2RepositoryImpl deliveryWidgetV2RepositoryImpl, d<? super DeliveryWidgetV2RepositoryImpl$requestUpdateByCartChanges$1> dVar) {
        super(dVar);
        this.this$0 = deliveryWidgetV2RepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.requestUpdateByCartChanges(null, null, null, null, null, false, null, this);
    }
}
