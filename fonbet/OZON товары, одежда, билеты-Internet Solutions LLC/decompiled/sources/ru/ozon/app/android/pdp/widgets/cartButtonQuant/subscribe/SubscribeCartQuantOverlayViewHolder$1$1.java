package ru.ozon.app.android.pdp.widgets.cartButtonQuant.subscribe;

import Sc.o;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.subscribe.SubscribeQuantViewMapper;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.subscribe.SubscribeQuantViewModel;
import ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonNotificationsKt;
import ru.ozon.app.android.utils.WhenExtKt;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/subscribe/SubscribeQuantViewModel$QuantAction;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/pdp/widgets/cartButtonQuant/subscribe/SubscribeQuantViewModel$QuantAction;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class SubscribeCartQuantOverlayViewHolder$1$1 extends AbstractC7737t implements Function1<SubscribeQuantViewModel.QuantAction, Unit> {
    final /* synthetic */ SubscribeCartQuantOverlayViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubscribeCartQuantOverlayViewHolder$1$1(SubscribeCartQuantOverlayViewHolder subscribeCartQuantOverlayViewHolder) {
        super(1);
        this.this$0 = subscribeCartQuantOverlayViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SubscribeQuantViewModel.QuantAction quantAction) {
        invoke2(quantAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(SubscribeQuantViewModel.QuantAction quantAction) {
        ComposerNavigator composerNavigator;
        i iVar;
        i iVar2;
        if (quantAction instanceof SubscribeQuantViewModel.QuantAction.Subscription) {
            iVar = this.this$0.container;
            SubscribeQuantViewModel.QuantAction.Subscription subscription = (SubscribeQuantViewModel.QuantAction.Subscription) quantAction;
            iVar.M().update(new SubscribeQuantViewMapper.Subscription(subscription.getIsSubscribed()));
            boolean isSubscribed = subscription.getIsSubscribed();
            iVar2 = this.this$0.container;
            CartButtonNotificationsKt.showProductSubscriptionNotification$default(isSubscribed, iVar2.Q(), null, 4, null);
        } else if (Intrinsics.d(quantAction, SubscribeQuantViewModel.QuantAction.Error.INSTANCE)) {
            View view = this.this$0.getView();
            Intrinsics.g(view, "null cannot be cast to non-null type ru.ozon.app.android.pdp.widgets.cartButtonQuant.subscribe.SubscribeQuantView");
            ((SubscribeQuantView) view).shake();
        } else {
            if (!Intrinsics.d(quantAction, SubscribeQuantViewModel.QuantAction.CallAuth.INSTANCE)) {
                throw new o();
            }
            composerNavigator = this.this$0.composerNavigator;
            String uri = LinkGenerator.INSTANCE.auth().toString();
            Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
            ComposerNavigator.DefaultImpls.openDeeplink$default(composerNavigator, uri, null, 2, null);
        }
        WhenExtKt.getExhaustive(Unit.f71690a);
    }
}
