package ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v4.data;

import androidx.recyclerview.widget.LinearLayoutManager;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v4.data.DeliveryWidgetV4RepositoryImpl", f = "DeliveryWidgetV4RepositoryImpl.kt", l = {20, TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER}, m = "requestAsyncUpdate")
/* loaded from: classes12.dex */
final class DeliveryWidgetV4RepositoryImpl$requestAsyncUpdate$1 extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DeliveryWidgetV4RepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeliveryWidgetV4RepositoryImpl$requestAsyncUpdate$1(DeliveryWidgetV4RepositoryImpl deliveryWidgetV4RepositoryImpl, d<? super DeliveryWidgetV4RepositoryImpl$requestAsyncUpdate$1> dVar) {
        super(dVar);
        this.this$0 = deliveryWidgetV4RepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.requestAsyncUpdate(null, false, this);
    }
}
