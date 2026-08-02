package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.wishlist;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.domain.wishlist.WishlistUpdate;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "event", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/domain/wishlist/WishlistUpdate;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.wishlist.WishlistSubscriber$subscribeIfNeed$1", f = "WishlistSubscriber.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class WishlistSubscriber$subscribeIfNeed$1 extends j implements Function2<WishlistUpdate, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ WishlistSubscriber this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WishlistSubscriber$subscribeIfNeed$1(WishlistSubscriber wishlistSubscriber, d<? super WishlistSubscriber$subscribeIfNeed$1> dVar) {
        super(2, dVar);
        this.this$0 = wishlistSubscriber;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        WishlistSubscriber$subscribeIfNeed$1 wishlistSubscriber$subscribeIfNeed$1 = new WishlistSubscriber$subscribeIfNeed$1(this.this$0, dVar);
        wishlistSubscriber$subscribeIfNeed$1.L$0 = obj;
        return wishlistSubscriber$subscribeIfNeed$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        boolean shouldShowOverlay;
        Function1 function1;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        shouldShowOverlay = this.this$0.shouldShowOverlay((WishlistUpdate) this.L$0);
        function1 = this.this$0.onEvent;
        function1.invoke(Boolean.valueOf(shouldShowOverlay));
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(WishlistUpdate wishlistUpdate, d<? super Unit> dVar) {
        return ((WishlistSubscriber$subscribeIfNeed$1) create(wishlistUpdate, dVar)).invokeSuspend(Unit.f71690a);
    }
}
