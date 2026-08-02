package ru.ozon.app.android.notifications;

import Nc.C3667a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.notifications.model.UnreadCountInfoMessenger;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "response", "Lru/ozon/app/android/notifications/model/UnreadCountInfoMessenger;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/notifications/model/UnreadCountInfoMessenger;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class NotificationsManagerImpl$updateUnreadCountInfo$1 extends AbstractC7737t implements Function1<UnreadCountInfoMessenger, Unit> {
    final /* synthetic */ NotificationsManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationsManagerImpl$updateUnreadCountInfo$1(NotificationsManagerImpl notificationsManagerImpl) {
        super(1);
        this.this$0 = notificationsManagerImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(UnreadCountInfoMessenger unreadCountInfoMessenger) {
        invoke2(unreadCountInfoMessenger);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(UnreadCountInfoMessenger unreadCountInfoMessenger) {
        C3667a c3667a;
        C3667a c3667a2;
        c3667a = this.this$0.allMessagesCountSubject;
        c3667a.onNext(Integer.valueOf(unreadCountInfoMessenger.getUnreadCount()));
        c3667a2 = this.this$0.unreadMessagesCountSubject;
        c3667a2.onNext(Integer.valueOf(unreadCountInfoMessenger.getUnreadCount()));
    }
}
