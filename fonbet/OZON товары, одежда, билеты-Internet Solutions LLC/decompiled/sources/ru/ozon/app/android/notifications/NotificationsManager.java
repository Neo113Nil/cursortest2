package ru.ozon.app.android.notifications;

import io.reactivex.p;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lru/ozon/app/android/notifications/NotificationsManager;", "", "", "updateUnreadCountInfo", "()V", "Lio/reactivex/p;", "", "observeMessagesCount", "()Lio/reactivex/p;", "getUnreadChatCountSubject", "notifications_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface NotificationsManager {
    @NotNull
    p<Integer> getUnreadChatCountSubject();

    @NotNull
    p<Integer> observeMessagesCount();

    void updateUnreadCountInfo();
}
