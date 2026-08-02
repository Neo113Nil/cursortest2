package ru.ozon.app.android.account.orders.recipientWidget.data;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.account.orders.recipientWidget.data.ChangeRecipientRepositoryImpl", f = "ChangeRecipientRepository.kt", l = {32}, m = "changeRecipientForOrder")
/* loaded from: classes11.dex */
final class ChangeRecipientRepositoryImpl$changeRecipientForOrder$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChangeRecipientRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChangeRecipientRepositoryImpl$changeRecipientForOrder$1(ChangeRecipientRepositoryImpl changeRecipientRepositoryImpl, d<? super ChangeRecipientRepositoryImpl$changeRecipientForOrder$1> dVar) {
        super(dVar);
        this.this$0 = changeRecipientRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object changeRecipientForOrder;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        changeRecipientForOrder = this.this$0.changeRecipientForOrder(null, this);
        return changeRecipientForOrder;
    }
}
