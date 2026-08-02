package ru.ozon.app.android.delivery.customActionsHandlers.cancelOrderV3;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.delivery.customActionsHandlers.cancelOrderV3.CancelOrderV3ActionHandler", f = "CancelOrderV3ActionHandler.kt", l = {164}, m = "clearCart")
/* loaded from: classes11.dex */
final class CancelOrderV3ActionHandler$clearCart$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CancelOrderV3ActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CancelOrderV3ActionHandler$clearCart$1(CancelOrderV3ActionHandler cancelOrderV3ActionHandler, d<? super CancelOrderV3ActionHandler$clearCart$1> dVar) {
        super(dVar);
        this.this$0 = cancelOrderV3ActionHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object clearCart;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        clearCart = this.this$0.clearCart(this);
        return clearCart;
    }
}
