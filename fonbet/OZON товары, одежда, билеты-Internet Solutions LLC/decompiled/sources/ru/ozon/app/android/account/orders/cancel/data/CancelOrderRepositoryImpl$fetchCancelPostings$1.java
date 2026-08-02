package ru.ozon.app.android.account.orders.cancel.data;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.account.orders.cancel.data.CancelOrderRepositoryImpl", f = "CancelOrderRepository.kt", l = {119}, m = "fetchCancelPostings")
/* loaded from: classes11.dex */
final class CancelOrderRepositoryImpl$fetchCancelPostings$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CancelOrderRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CancelOrderRepositoryImpl$fetchCancelPostings$1(CancelOrderRepositoryImpl cancelOrderRepositoryImpl, d<? super CancelOrderRepositoryImpl$fetchCancelPostings$1> dVar) {
        super(dVar);
        this.this$0 = cancelOrderRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.fetchCancelPostings(null, null, null, this);
    }
}
