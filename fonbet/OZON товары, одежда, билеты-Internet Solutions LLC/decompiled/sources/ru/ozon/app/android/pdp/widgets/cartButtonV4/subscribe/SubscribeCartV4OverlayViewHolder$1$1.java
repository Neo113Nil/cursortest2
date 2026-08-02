package ru.ozon.app.android.pdp.widgets.cartButtonV4.subscribe;

import Sc.o;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.subscribe.SubscribeViewModel;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.subscribe.SubscribeViewV4Mapper;
import ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonNotificationsKt;
import ru.ozon.app.android.utils.WhenExtKt;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/subscribe/SubscribeViewModel$Action;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/pdp/widgets/cartButtonV4/subscribe/SubscribeViewModel$Action;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class SubscribeCartV4OverlayViewHolder$1$1 extends AbstractC7737t implements Function1<SubscribeViewModel.Action, Unit> {
    final /* synthetic */ SubscribeCartV4OverlayViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubscribeCartV4OverlayViewHolder$1$1(SubscribeCartV4OverlayViewHolder subscribeCartV4OverlayViewHolder) {
        super(1);
        this.this$0 = subscribeCartV4OverlayViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SubscribeViewModel.Action action) {
        invoke2(action);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(SubscribeViewModel.Action action) {
        i iVar;
        i iVar2;
        if (action instanceof SubscribeViewModel.Action.Subscription) {
            iVar = this.this$0.container;
            SubscribeViewModel.Action.Subscription subscription = (SubscribeViewModel.Action.Subscription) action;
            iVar.M().update(new SubscribeViewV4Mapper.Subscription(subscription.getIsSubscribed()));
            boolean isSubscribed = subscription.getIsSubscribed();
            iVar2 = this.this$0.container;
            CartButtonNotificationsKt.showProductSubscriptionNotification$default(isSubscribed, iVar2.Q(), null, 4, null);
        } else {
            if (!(action instanceof SubscribeViewModel.Action.Error)) {
                throw new o();
            }
            View view = this.this$0.getView();
            Intrinsics.g(view, "null cannot be cast to non-null type ru.ozon.app.android.pdp.widgets.cartButtonV4.subscribe.SubscribeViewV4");
            ((SubscribeViewV4) view).shake();
        }
        WhenExtKt.getExhaustive(Unit.f71690a);
    }
}
