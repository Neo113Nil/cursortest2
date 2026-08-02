package ru.ozon.app.android.cart.cartSplitV2;

import A00.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.cart.common.presentation.throttleNotificationHandler.CartThrottleNotificationHandler;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA00/a;", "event", "", "invoke", "(LA00/a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class LockedQuantityBinder$composerEventsObserver$1 extends AbstractC7737t implements Function1<a, Unit> {
    final /* synthetic */ LockedQuantityBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LockedQuantityBinder$composerEventsObserver$1(LockedQuantityBinder lockedQuantityBinder) {
        super(1);
        this.this$0 = lockedQuantityBinder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(a aVar) {
        invoke2(aVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(a event) {
        boolean z11;
        CartThrottleNotificationHandler cartThrottleNotificationHandler;
        Intrinsics.checkNotNullParameter(event, "event");
        if ((event instanceof a.u.b) || (event instanceof a.u.c)) {
            this.this$0.dismissNotificationAfterRefresh = true;
        }
        if (event instanceof a.C2370k) {
            z11 = this.this$0.dismissNotificationAfterRefresh;
            if (z11) {
                cartThrottleNotificationHandler = this.this$0.cartThrottleNotificationHandler;
                cartThrottleNotificationHandler.dismiss();
                this.this$0.dismissNotificationAfterRefresh = false;
            }
        }
    }
}
