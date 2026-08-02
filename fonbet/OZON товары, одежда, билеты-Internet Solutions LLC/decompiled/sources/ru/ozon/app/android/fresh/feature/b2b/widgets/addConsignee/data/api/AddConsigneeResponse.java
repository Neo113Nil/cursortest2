package ru.ozon.app.android.fresh.feature.b2b.widgets.addConsignee.data.api;

import T7.P;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0019B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J7\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/data/api/AddConsigneeResponse;", "", "isSuccess", "", "notification", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/data/api/AddConsigneeResponse$Notification;", "errors", "", "", "<init>", "(ZLru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/data/api/AddConsigneeResponse$Notification;Ljava/util/Map;)V", "()Z", "getNotification", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/data/api/AddConsigneeResponse$Notification;", "getErrors", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "Notification", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AddConsigneeResponse {
    public static final int $stable = 8;
    private final Map<String, String> errors;
    private final boolean isSuccess;
    private final Notification notification;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/data/api/AddConsigneeResponse$Notification;", "", "type", "", "notificationBar", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "getType", "()Ljava/lang/String;", "getNotificationBar", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

    public AddConsigneeResponse(boolean z11, Notification notification, Map<String, String> map) {
        this.isSuccess = z11;
        this.notification = notification;
        this.errors = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddConsigneeResponse copy$default(AddConsigneeResponse addConsigneeResponse, boolean z11, Notification notification, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = addConsigneeResponse.isSuccess;
        }
        if ((i11 & 2) != 0) {
            notification = addConsigneeResponse.notification;
        }
        if ((i11 & 4) != 0) {
            map = addConsigneeResponse.errors;
        }
        return addConsigneeResponse.copy(z11, notification, map);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsSuccess() {
        return this.isSuccess;
    }

    /* renamed from: component2, reason: from getter */
    public final Notification getNotification() {
        return this.notification;
    }

    public final Map<String, String> component3() {
        return this.errors;
    }

    @NotNull
    public final AddConsigneeResponse copy(boolean isSuccess, Notification notification, Map<String, String> errors) {
        return new AddConsigneeResponse(isSuccess, notification, errors);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddConsigneeResponse)) {
            return false;
        }
        AddConsigneeResponse addConsigneeResponse = (AddConsigneeResponse) other;
        return this.isSuccess == addConsigneeResponse.isSuccess && Intrinsics.d(this.notification, addConsigneeResponse.notification) && Intrinsics.d(this.errors, addConsigneeResponse.errors);
    }

    public final Map<String, String> getErrors() {
        return this.errors;
    }

    public final Notification getNotification() {
        return this.notification;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.isSuccess) * 31;
        Notification notification = this.notification;
        int hashCode2 = (hashCode + (notification == null ? 0 : notification.hashCode())) * 31;
        Map<String, String> map = this.errors;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final boolean isSuccess() {
        return this.isSuccess;
    }

    @NotNull
    public String toString() {
        boolean z11 = this.isSuccess;
        Notification notification = this.notification;
        Map<String, String> map = this.errors;
        StringBuilder sb2 = new StringBuilder("AddConsigneeResponse(isSuccess=");
        sb2.append(z11);
        sb2.append(", notification=");
        sb2.append(notification);
        sb2.append(", errors=");
        return P.f(sb2, map, ")");
    }
}
