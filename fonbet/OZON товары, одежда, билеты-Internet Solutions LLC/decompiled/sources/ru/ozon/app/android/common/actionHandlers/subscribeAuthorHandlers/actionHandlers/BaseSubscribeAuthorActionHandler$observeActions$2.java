package ru.ozon.app.android.common.actionHandlers.subscribeAuthorHandlers.actionHandlers;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.common.actionHandlers.subscribeAuthorHandlers.SubscribeAuthorViewModel;
import ru.ozon.app.android.common.actionHandlers.subscribeAuthorHandlers.SubscriptionFailureAction;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "revertEvent", "Lru/ozon/app/android/common/actionHandlers/subscribeAuthorHandlers/SubscriptionFailureAction;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/common/actionHandlers/subscribeAuthorHandlers/SubscriptionFailureAction;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class BaseSubscribeAuthorActionHandler$observeActions$2 extends AbstractC7737t implements Function1<SubscriptionFailureAction, Unit> {
    final /* synthetic */ CustomActionHandler.HandlerReferences $handlerRefs;
    final /* synthetic */ SubscribeAuthorViewModel $vm;
    final /* synthetic */ BaseSubscribeAuthorActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseSubscribeAuthorActionHandler$observeActions$2(BaseSubscribeAuthorActionHandler baseSubscribeAuthorActionHandler, CustomActionHandler.HandlerReferences handlerReferences, SubscribeAuthorViewModel subscribeAuthorViewModel) {
        super(1);
        this.this$0 = baseSubscribeAuthorActionHandler;
        this.$handlerRefs = handlerReferences;
        this.$vm = subscribeAuthorViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SubscriptionFailureAction subscriptionFailureAction) {
        invoke2(subscriptionFailureAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(SubscriptionFailureAction subscriptionFailureAction) {
        if (Intrinsics.d(subscriptionFailureAction.getActionId(), this.this$0.getActionId())) {
            this.this$0.revertEvent(this.$handlerRefs.getRefs().getController(), subscriptionFailureAction.getAuthorId());
            this.this$0.showNotification(this.$handlerRefs, subscriptionFailureAction.getNotification());
            this.$vm.getRevertAction().removeObservers(this.$handlerRefs.getRefs().getContainer().g());
        }
    }
}
