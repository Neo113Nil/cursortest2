package ru.ozon.app.android.fresh.feature.b2b.widgets.verificationEdoCheckingOperator.data.api;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0002\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/verificationEdoCheckingOperator/data/api/VerificationEdoResponse;", "", "isSuccess", "", "notification", "Lru/ozon/app/android/fresh/feature/b2b/widgets/verificationEdoCheckingOperator/data/api/VerificationEdoResponse$Notification;", "<init>", "(Ljava/lang/Boolean;Lru/ozon/app/android/fresh/feature/b2b/widgets/verificationEdoCheckingOperator/data/api/VerificationEdoResponse$Notification;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getNotification", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/verificationEdoCheckingOperator/data/api/VerificationEdoResponse$Notification;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Lru/ozon/app/android/fresh/feature/b2b/widgets/verificationEdoCheckingOperator/data/api/VerificationEdoResponse$Notification;)Lru/ozon/app/android/fresh/feature/b2b/widgets/verificationEdoCheckingOperator/data/api/VerificationEdoResponse;", "equals", "other", "hashCode", "", "toString", "", "Notification", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class VerificationEdoResponse {
    public static final int $stable = NotificationDTO.$stable;
    private final Boolean isSuccess;
    private final Notification notification;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/verificationEdoCheckingOperator/data/api/VerificationEdoResponse$Notification;", "", "type", "", "notificationBar", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "getType", "()Ljava/lang/String;", "getNotificationBar", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Notification {
        public static final int $stable = NotificationDTO.$stable;
        private final NotificationDTO notificationBar;

        @NotNull
        private final String type;

        public Notification(@NotNull String type, NotificationDTO notificationDTO) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.type = type;
            this.notificationBar = notificationDTO;
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

        /* renamed from: component2, reason: from getter */
        public final NotificationDTO getNotificationBar() {
            return this.notificationBar;
        }

        @NotNull
        public final Notification copy(@NotNull String type, NotificationDTO notificationBar) {
            Intrinsics.checkNotNullParameter(type, "type");
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

        public final NotificationDTO getNotificationBar() {
            return this.notificationBar;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            int hashCode = this.type.hashCode() * 31;
            NotificationDTO notificationDTO = this.notificationBar;
            return hashCode + (notificationDTO == null ? 0 : notificationDTO.hashCode());
        }

        @NotNull
        public String toString() {
            return "Notification(type=" + this.type + ", notificationBar=" + this.notificationBar + ")";
        }
    }

    public VerificationEdoResponse(Boolean bool, Notification notification) {
        this.isSuccess = bool;
        this.notification = notification;
    }

    public static /* synthetic */ VerificationEdoResponse copy$default(VerificationEdoResponse verificationEdoResponse, Boolean bool, Notification notification, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = verificationEdoResponse.isSuccess;
        }
        if ((i11 & 2) != 0) {
            notification = verificationEdoResponse.notification;
        }
        return verificationEdoResponse.copy(bool, notification);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /* renamed from: component2, reason: from getter */
    public final Notification getNotification() {
        return this.notification;
    }

    @NotNull
    public final VerificationEdoResponse copy(Boolean isSuccess, Notification notification) {
        return new VerificationEdoResponse(isSuccess, notification);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerificationEdoResponse)) {
            return false;
        }
        VerificationEdoResponse verificationEdoResponse = (VerificationEdoResponse) other;
        return Intrinsics.d(this.isSuccess, verificationEdoResponse.isSuccess) && Intrinsics.d(this.notification, verificationEdoResponse.notification);
    }

    public final Notification getNotification() {
        return this.notification;
    }

    public int hashCode() {
        Boolean bool = this.isSuccess;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Notification notification = this.notification;
        return hashCode + (notification != null ? notification.hashCode() : 0);
    }

    public final Boolean isSuccess() {
        return this.isSuccess;
    }

    @NotNull
    public String toString() {
        return "VerificationEdoResponse(isSuccess=" + this.isSuccess + ", notification=" + this.notification + ")";
    }
}
