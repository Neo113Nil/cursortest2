package ru.ozon.app.android.pdp.widgets.cartButtonQuant;

import Sc.s;
import Wc.a;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.cart.CartQuantVO;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.pdp.widgets.cartButtonQuant.CartButtonQuantNotificationHandler$show$1$1", f = "CartButtonQuantNotificationHandler.kt", l = {32}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class CartButtonQuantNotificationHandler$show$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ NotificationLayoutManager $layoutManager;
    final /* synthetic */ J $lifecycleOwner;
    final /* synthetic */ CartQuantVO.NotificationBar $this_with;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CartButtonQuantNotificationHandler$show$1$1(CartQuantVO.NotificationBar notificationBar, NotificationLayoutManager notificationLayoutManager, J j11, Function1<? super AtomAction, Unit> function1, d<? super CartButtonQuantNotificationHandler$show$1$1> dVar) {
        super(2, dVar);
        this.$this_with = notificationBar;
        this.$layoutManager = notificationLayoutManager;
        this.$lifecycleOwner = j11;
        this.$actionHandler = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CartButtonQuantNotificationHandler$show$1$1(this.$this_with, this.$layoutManager, this.$lifecycleOwner, this.$actionHandler, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            Long preDelay = this.$this_with.getPreDelay();
            long longValue = preDelay != null ? preDelay.longValue() : 0L;
            this.label = 1;
            if (Y.b(longValue, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        NotificationBar.INSTANCE.make(this.$layoutManager, this.$this_with.getNotificationWrapper(), this.$lifecycleOwner, this.$actionHandler).show();
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((CartButtonQuantNotificationHandler$show$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
