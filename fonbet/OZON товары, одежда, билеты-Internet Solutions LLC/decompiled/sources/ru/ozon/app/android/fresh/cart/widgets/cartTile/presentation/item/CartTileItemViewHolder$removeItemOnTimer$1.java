package ru.ozon.app.android.fresh.cart.widgets.cartTile.presentation.item;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.cart.widgets.cartTile.presentation.CartTileVO;
import xe.M;
import xe.N;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.cart.widgets.cartTile.presentation.item.CartTileItemViewHolder$removeItemOnTimer$1", f = "CartTileItemViewHolder.kt", l = {168}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class CartTileItemViewHolder$removeItemOnTimer$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ CartTileVO.TileItem $item;
    final /* synthetic */ Function1<CartTileVO.TileItem, Unit> $localDeleteItem;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CartTileItemViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CartTileItemViewHolder$removeItemOnTimer$1(CartTileVO.TileItem tileItem, Function1<? super CartTileVO.TileItem, Unit> function1, CartTileItemViewHolder cartTileItemViewHolder, d<? super CartTileItemViewHolder$removeItemOnTimer$1> dVar) {
        super(2, dVar);
        this.$item = tileItem;
        this.$localDeleteItem = function1;
        this.this$0 = cartTileItemViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        CartTileItemViewHolder$removeItemOnTimer$1 cartTileItemViewHolder$removeItemOnTimer$1 = new CartTileItemViewHolder$removeItemOnTimer$1(this.$item, this.$localDeleteItem, this.this$0, dVar);
        cartTileItemViewHolder$removeItemOnTimer$1.L$0 = obj;
        return cartTileItemViewHolder$removeItemOnTimer$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x004b  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        M m11;
        M m12;
        ComposerReferences composerReferences;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            m11 = (M) this.L$0;
            Long timer = this.$item.getTimer();
            if (timer != null) {
                long longValue = timer.longValue();
                this.L$0 = m11;
                this.label = 1;
                if (Y.b(longValue, this) == aVar) {
                    return aVar;
                }
                m12 = m11;
            }
            N.e(m11);
            this.$localDeleteItem.invoke(this.$item);
            if (this.$item.getDelayedRefresh()) {
                composerReferences = this.this$0.references;
                InterfaceC7851b.a.a(composerReferences.getController(), null, null, null, null, 15);
            }
            return Unit.f71690a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        m12 = (M) this.L$0;
        s.b(obj);
        m11 = m12;
        N.e(m11);
        this.$localDeleteItem.invoke(this.$item);
        if (this.$item.getDelayedRefresh()) {
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((CartTileItemViewHolder$removeItemOnTimer$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
