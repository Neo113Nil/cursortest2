package ru.ozon.app.android.common.actionHandlers.subscribeAuthorHandlers;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/common/actionHandlers/subscribeAuthorHandlers/SubscriptionFailureAction;", "", "actionId", "", "authorId", "notification", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "getActionId", "()Ljava/lang/String;", "getAuthorId", "getNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SubscriptionFailureAction {
    private final String actionId;

    @NotNull
    private final String authorId;
    private final NotificationDTO notification;

    public SubscriptionFailureAction(String str, @NotNull String authorId, NotificationDTO notificationDTO) {
        Intrinsics.checkNotNullParameter(authorId, "authorId");
        this.actionId = str;
        this.authorId = authorId;
        this.notification = notificationDTO;
    }

    public final String getActionId() {
        return this.actionId;
    }

    @NotNull
    public final String getAuthorId() {
        return this.authorId;
    }

    public final NotificationDTO getNotification() {
        return this.notification;
    }
}
