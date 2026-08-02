package ru.ozon.app.android.common.actionHandlers.subscribeAuthorHandlers.actionHandlers;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.common.actionHandlers.subscribeAuthorHandlers.SubscribeAuthorViewModel;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "notification", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class BaseSubscribeAuthorActionHandler$observeActions$3 extends AbstractC7737t implements Function1<NotificationDTO, Unit> {
    final /* synthetic */ CustomActionHandler.HandlerReferences $handlerRefs;
    final /* synthetic */ SubscribeAuthorViewModel $vm;
    final /* synthetic */ BaseSubscribeAuthorActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseSubscribeAuthorActionHandler$observeActions$3(BaseSubscribeAuthorActionHandler baseSubscribeAuthorActionHandler, CustomActionHandler.HandlerReferences handlerReferences, SubscribeAuthorViewModel subscribeAuthorViewModel) {
        super(1);
        this.this$0 = baseSubscribeAuthorActionHandler;
        this.$handlerRefs = handlerReferences;
        this.$vm = subscribeAuthorViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(NotificationDTO notificationDTO) {
        invoke2(notificationDTO);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(NotificationDTO notificationDTO) {
        this.this$0.showNotification(this.$handlerRefs, notificationDTO);
        this.$vm.getSuccessNotify().removeObservers(this.$handlerRefs.getRefs().getContainer().g());
    }
}
