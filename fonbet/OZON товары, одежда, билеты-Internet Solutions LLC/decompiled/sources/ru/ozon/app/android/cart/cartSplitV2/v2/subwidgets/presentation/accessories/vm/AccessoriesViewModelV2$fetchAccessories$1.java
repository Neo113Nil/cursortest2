package ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.accessories.vm;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.accessories.vm.AccessoriesViewModelV2", f = "AccessoriesViewModelV2.kt", l = {185}, m = "fetchAccessories")
/* loaded from: classes11.dex */
final class AccessoriesViewModelV2$fetchAccessories$1 extends c {
    long J$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AccessoriesViewModelV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccessoriesViewModelV2$fetchAccessories$1(AccessoriesViewModelV2 accessoriesViewModelV2, d<? super AccessoriesViewModelV2$fetchAccessories$1> dVar) {
        super(dVar);
        this.this$0 = accessoriesViewModelV2;
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
