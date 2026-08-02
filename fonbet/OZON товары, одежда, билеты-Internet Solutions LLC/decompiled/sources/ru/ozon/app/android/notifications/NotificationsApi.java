package ru.ozon.app.android.notifications;

import com.google.android.gms.common.internal.ImagesContract;
import io.reactivex.y;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Url;
import ru.ozon.app.android.notifications.model.UnreadCountInfo;
import ru.ozon.app.android.notifications.model.UnreadCountInfoMessenger;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lru/ozon/app/android/notifications/NotificationsApi;", "", "", ImagesContract.URL, "Lio/reactivex/y;", "Lru/ozon/app/android/notifications/model/UnreadCountInfo;", "unreadCount", "(Ljava/lang/String;)Lio/reactivex/y;", "Lru/ozon/app/android/notifications/model/UnreadCountInfoMessenger;", "unreadCountMessenger", "notifications_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface NotificationsApi {
    @GET
    @NotNull
    y<UnreadCountInfo> unreadCount(@Url @NotNull String url);

    @GET
    @NotNull
    y<UnreadCountInfoMessenger> unreadCountMessenger(@Url @NotNull String url);
}
