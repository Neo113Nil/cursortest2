package ru.ozon.app.android.cart.domain.async;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.cart.domain.async.PendingRequests", f = "PendingRequests.kt", l = {41}, m = "putRequest")
/* loaded from: classes11.dex */
final class PendingRequests$putRequest$1 extends c {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PendingRequests this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PendingRequests$putRequest$1(PendingRequests pendingRequests, d<? super PendingRequests$putRequest$1> dVar) {
        super(dVar);
        this.this$0 = pendingRequests;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.putRequest(null, this);
    }
}
