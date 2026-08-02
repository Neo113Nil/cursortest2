package ru.ozon.app.android.payment.ui.updateOrderC2C;

import androidx.recyclerview.widget.LinearLayoutManager;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.payment.ui.updateOrderC2C.UpdateOrderC2CRepository", f = "UpdateOrderC2CRepository.kt", l = {TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER}, m = "updateOrder")
/* loaded from: classes13.dex */
final class UpdateOrderC2CRepository$updateOrder$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UpdateOrderC2CRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UpdateOrderC2CRepository$updateOrder$1(UpdateOrderC2CRepository updateOrderC2CRepository, d<? super UpdateOrderC2CRepository$updateOrder$1> dVar) {
        super(dVar);
        this.this$0 = updateOrderC2CRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.updateOrder(null, null, this);
    }
}
