package ru.ozon.app.android.cart.domain.async;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.cart.domain.async.AsyncCartService", f = "AsyncCartService.kt", l = {139, 141, 137, 146}, m = "fetch")
/* loaded from: classes11.dex */
final class AsyncCartService$fetch$1 extends c {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AsyncCartService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AsyncCartService$fetch$1(AsyncCartService asyncCartService, d<? super AsyncCartService$fetch$1> dVar) {
        super(dVar);
        this.this$0 = asyncCartService;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object fetch;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        fetch = this.this$0.fetch(null, this);
        return fetch;
    }
}
