package ru.ozon.app.android.cart.domain.cartMode;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.cart.domain.cartMode.CartModeManagerImpl", f = "CartModeManagerImpl.kt", l = {114, 116, 119, 119}, m = "resetCartModesSuspend")
/* loaded from: classes11.dex */
final class CartModeManagerImpl$resetCartModesSuspend$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CartModeManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartModeManagerImpl$resetCartModesSuspend$1(CartModeManagerImpl cartModeManagerImpl, d<? super CartModeManagerImpl$resetCartModesSuspend$1> dVar) {
        super(dVar);
        this.this$0 = cartModeManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object resetCartModesSuspend;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        resetCartModesSuspend = this.this$0.resetCartModesSuspend(this);
        return resetCartModesSuspend;
    }
}
