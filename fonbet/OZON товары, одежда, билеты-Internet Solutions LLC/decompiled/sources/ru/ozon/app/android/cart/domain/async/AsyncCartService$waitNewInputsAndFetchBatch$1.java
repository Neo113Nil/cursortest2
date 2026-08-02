package ru.ozon.app.android.cart.domain.async;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.cart.domain.async.AsyncCartService", f = "AsyncCartService.kt", l = {126, 129}, m = "waitNewInputsAndFetchBatch")
/* loaded from: classes11.dex */
final class AsyncCartService$waitNewInputsAndFetchBatch$1 extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AsyncCartService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AsyncCartService$waitNewInputsAndFetchBatch$1(AsyncCartService asyncCartService, d<? super AsyncCartService$waitNewInputsAndFetchBatch$1> dVar) {
        super(dVar);
        this.this$0 = asyncCartService;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.waitNewInputsAndFetchBatch(null, this);
    }
}
