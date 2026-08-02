package ru.ozon.app.android.favorites.ui.favoriteReserveButton.delegate;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.favorites.ui.favoriteReserveButton.delegate.FavoriteReserveButtonDelegateImpl$resubscribe$2", f = "FavoriteReserveButtonDelegateImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class FavoriteReserveButtonDelegateImpl$resubscribe$2 extends j implements Function2<AtomAction, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FavoriteReserveButtonDelegateImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FavoriteReserveButtonDelegateImpl$resubscribe$2(FavoriteReserveButtonDelegateImpl favoriteReserveButtonDelegateImpl, d<? super FavoriteReserveButtonDelegateImpl$resubscribe$2> dVar) {
        super(2, dVar);
        this.this$0 = favoriteReserveButtonDelegateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        FavoriteReserveButtonDelegateImpl$resubscribe$2 favoriteReserveButtonDelegateImpl$resubscribe$2 = new FavoriteReserveButtonDelegateImpl$resubscribe$2(this.this$0, dVar);
        favoriteReserveButtonDelegateImpl$resubscribe$2.L$0 = obj;
        return favoriteReserveButtonDelegateImpl$resubscribe$2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Function1 function1;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        AtomAction atomAction = (AtomAction) this.L$0;
        function1 = this.this$0.actionHandler;
        if (function1 != null) {
            function1.invoke(atomAction);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AtomAction atomAction, d<? super Unit> dVar) {
        return ((FavoriteReserveButtonDelegateImpl$resubscribe$2) create(atomAction, dVar)).invokeSuspend(Unit.f71690a);
    }
}
