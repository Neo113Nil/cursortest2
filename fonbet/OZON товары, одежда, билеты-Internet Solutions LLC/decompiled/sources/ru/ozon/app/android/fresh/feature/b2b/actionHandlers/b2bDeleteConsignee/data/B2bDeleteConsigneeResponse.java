package ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bDeleteConsignee.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bDeleteConsignee/data/B2bDeleteConsigneeResponse;", "", "isSuccess", "", "notification", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bDeleteConsignee/data/B2bDeleteConsigneeResponse$Notification;", "<init>", "(ZLru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bDeleteConsignee/data/B2bDeleteConsigneeResponse$Notification;)V", "()Z", "getNotification", "()Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bDeleteConsignee/data/B2bDeleteConsigneeResponse$Notification;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "Notification", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class B2bDeleteConsigneeResponse {
    public static final int $stable = NotificationDTO.$stable;
    private final boolean isSuccess;

    @NotNull
    private final Notification notification;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bDeleteConsignee/data/B2bDeleteConsigneeResponse$Notification;", "", "type", "", "notificationBar", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "getType", "()Ljava/lang/String;", "getNotificationBar", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Notification {
        public static final int $stable = NotificationDTO.$stable;

        @NotNull
        private final NotificationDTO notificationBar;

        @NotNull
        private final String type;

        public Notification(@NotNull String type, @NotNull NotificationDTO notificationBar) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(notificationBar, "notificationBar");
            this.type = type;
            this.notificationBar = notificationBar;
        }

        public static /* synthetic */ Notification copy$default(Notification notification, String str, NotificationDTO notificationDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = notification.type;
            }
            if ((i11 & 2) != 0) {
                notificationDTO = notification.notificationBar;
            }
            return notification.copy(str, notificationDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final NotificationDTO getNotificationBar() {
            return this.notificationBar;
        }

        @NotNull
        public final Notification copy(@NotNull String type, @NotNull NotificationDTO notificationBar) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(notificationBar, "notificationBar");
            return new Notification(type, notificationBar);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Notification)) {
                return false;
            }
            Notification notification = (Notification) other;
            return Intrinsics.d(this.type, notification.type) && Intrinsics.d(this.notificationBar, notification.notificationBar);
        }

        @NotNull
        public final NotificationDTO getNotificationBar() {
            return this.notificationBar;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            return this.notificationBar.hashCode() + (this.type.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Notification(type=" + this.type + ", notificationBar=" + this.notificationBar + ")";
        }
    }

    public B2bDeleteConsigneeResponse(boolean z11, @NotNull Notification notification) {
        Intrinsics.checkNotNullParameter(notification, "notification");
        this.isSuccess = z11;
        this.notification = notification;
    }

    public static /* synthetic */ B2bDeleteConsigneeResponse copy$default(B2bDeleteConsigneeResponse b2bDeleteConsigneeResponse, boolean z11, Notification notification, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = b2bDeleteConsigneeResponse.isSuccess;
        }
        if ((i11 & 2) != 0) {
            notification = b2bDeleteConsigneeResponse.notification;
        }
        return b2bDeleteConsigneeResponse.copy(z11, notification);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsSuccess() {
        return this.isSuccess;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Notification getNotification() {
        return this.notification;
    }

    @NotNull
    public final B2bDeleteConsigneeResponse copy(boolean isSuccess, @NotNull Notification notification) {
        Intrinsics.checkNotNullParameter(notification, "notification");
        return new B2bDeleteConsigneeResponse(isSuccess, notification);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof B2bDeleteConsigneeResponse)) {
            return false;
        }
        B2bDeleteConsigneeResponse b2bDeleteConsigneeResponse = (B2bDeleteConsigneeResponse) other;
        return this.isSuccess == b2bDeleteConsigneeResponse.isSuccess && Intrinsics.d(this.notification, b2bDeleteConsigneeResponse.notification);
    }

    @NotNull
    public final Notification getNotification() {
        return this.notification;
    }

    public int hashCode() {
        return this.notification.hashCode() + (Boolean.hashCode(this.isSuccess) * 31);
    }

    public final boolean isSuccess() {
        return this.isSuccess;
    }

    @NotNull
    public String toString() {
        return "B2bDeleteConsigneeResponse(isSuccess=" + this.isSuccess + ", notification=" + this.notification + ")";
    }
}
