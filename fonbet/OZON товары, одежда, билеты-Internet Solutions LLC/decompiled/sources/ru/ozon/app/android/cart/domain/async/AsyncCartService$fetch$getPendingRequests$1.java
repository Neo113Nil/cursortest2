package ru.ozon.app.android.cart.domain.async;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.cart.domain.async.AsyncCartService", f = "AsyncCartService.kt", l = {134}, m = "fetch$getPendingRequests")
/* loaded from: classes11.dex */
final class AsyncCartService$fetch$getPendingRequests$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    AsyncCartService$fetch$getPendingRequests$1(d<? super AsyncCartService$fetch$getPendingRequests$1> dVar) {
        super(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object fetch$getPendingRequests;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        fetch$getPendingRequests = AsyncCartService.fetch$getPendingRequests(null, this);
        return fetch$getPendingRequests;
    }
}
