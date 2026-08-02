package ru.ozon.app.android.cart.cartSplitV2.v1.presentation.item.accessories;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.cart.cartSplitV2.v1.presentation.item.accessories.AccessoriesViewModel", f = "AccessoriesViewModel.kt", l = {185}, m = "fetchAccessories")
/* loaded from: classes11.dex */
final class AccessoriesViewModel$fetchAccessories$1 extends c {
    long J$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AccessoriesViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccessoriesViewModel$fetchAccessories$1(AccessoriesViewModel accessoriesViewModel, d<? super AccessoriesViewModel$fetchAccessories$1> dVar) {
        super(dVar);
        this.this$0 = accessoriesViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object fetchAccessories;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        fetchAccessories = this.this$0.fetchAccessories(null, 0L, this);
        return fetchAccessories;
    }
}
