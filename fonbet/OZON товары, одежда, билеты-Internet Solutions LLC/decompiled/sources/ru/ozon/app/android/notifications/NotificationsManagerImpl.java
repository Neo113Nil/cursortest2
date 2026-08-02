package ru.ozon.app.android.notifications;

import DM.i;
import GH.b;
import Mc.a;
import Nc.C3667a;
import android.net.Uri;
import io.reactivex.p;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import nc.C8486a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.di.NetworkComponentConfig;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\"\u0010\u0017\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u000f0\u000f0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\"\u0010\u0019\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u000f0\u000f0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/notifications/NotificationsManagerImpl;", "Lru/ozon/app/android/notifications/NotificationsManager;", "Lru/ozon/app/android/notifications/NotificationsApi;", "notificationsApi", "Lru/ozon/app/android/network/di/NetworkComponentConfig;", "networkComponentConfig", "<init>", "(Lru/ozon/app/android/notifications/NotificationsApi;Lru/ozon/app/android/network/di/NetworkComponentConfig;)V", "", "buildUrl", "()Ljava/lang/String;", "", "updateUnreadCountInfo", "()V", "Lio/reactivex/p;", "", "observeMessagesCount", "()Lio/reactivex/p;", "getUnreadChatCountSubject", "Lru/ozon/app/android/notifications/NotificationsApi;", "Lru/ozon/app/android/network/di/NetworkComponentConfig;", "LNc/a;", "kotlin.jvm.PlatformType", "allMessagesCountSubject", "LNc/a;", "unreadMessagesCountSubject", "Lnc/a;", "disposables", "Lnc/a;", "Companion", "notifications_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NotificationsManagerImpl implements NotificationsManager {

    @NotNull
    private final C3667a<Integer> allMessagesCountSubject;

    @NotNull
    private final C8486a disposables;

    @NotNull
    private final NetworkComponentConfig networkComponentConfig;

    @NotNull
    private final NotificationsApi notificationsApi;

    @NotNull
    private final C3667a<Integer> unreadMessagesCountSubject;

    public NotificationsManagerImpl(@NotNull NotificationsApi notificationsApi, @NotNull NetworkComponentConfig networkComponentConfig) {
        Intrinsics.checkNotNullParameter(notificationsApi, "notificationsApi");
        Intrinsics.checkNotNullParameter(networkComponentConfig, "networkComponentConfig");
        this.notificationsApi = notificationsApi;
        this.networkComponentConfig = networkComponentConfig;
        C3667a<Integer> d11 = C3667a.d();
        Intrinsics.checkNotNullExpressionValue(d11, "create(...)");
        this.allMessagesCountSubject = d11;
        C3667a<Integer> d12 = C3667a.d();
        Intrinsics.checkNotNullExpressionValue(d12, "create(...)");
        this.unreadMessagesCountSubject = d12;
        this.disposables = new C8486a();
    }

    private final String buildUrl() {
        String uri = Uri.parse(this.networkComponentConfig.getApiUrl()).buildUpon().appendEncodedPath("composer-api.bx/_action/messenger/v2").appendPath("unreadCount").build().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return uri;
    }

    @Override // ru.ozon.app.android.notifications.NotificationsManager
    @NotNull
    public p<Integer> getUnreadChatCountSubject() {
        p<Integer> distinctUntilChanged = this.unreadMessagesCountSubject.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged, "distinctUntilChanged(...)");
        return distinctUntilChanged;
    }

    @Override // ru.ozon.app.android.notifications.NotificationsManager
    @NotNull
    public p<Integer> observeMessagesCount() {
        return this.allMessagesCountSubject;
    }

    @Override // ru.ozon.app.android.notifications.NotificationsManager
    public void updateUnreadCountInfo() {
        this.disposables.a(this.notificationsApi.unreadCountMessenger(buildUrl()).j(a.b()).g(C8125a.a()).h(new i(new NotificationsManagerImpl$updateUnreadCountInfo$1(this), 5), new b(NotificationsManagerImpl$updateUnreadCountInfo$2.INSTANCE, 4)));
    }
}
