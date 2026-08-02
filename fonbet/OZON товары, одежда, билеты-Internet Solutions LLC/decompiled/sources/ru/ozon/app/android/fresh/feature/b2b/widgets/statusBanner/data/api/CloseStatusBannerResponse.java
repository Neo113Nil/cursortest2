package ru.ozon.app.android.fresh.feature.b2b.widgets.statusBanner.data.api;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0002\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/statusBanner/data/api/CloseStatusBannerResponse;", "", "isSuccess", "", "notification", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "<init>", "(Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/notification/NotificationDTO;)Lru/ozon/app/android/fresh/feature/b2b/widgets/statusBanner/data/api/CloseStatusBannerResponse;", "equals", "other", "hashCode", "", "toString", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CloseStatusBannerResponse {
    public static final int $stable = NotificationDTO.$stable;
    private final Boolean isSuccess;
    private final NotificationDTO notification;

    public CloseStatusBannerResponse(Boolean bool, NotificationDTO notificationDTO) {
        this.isSuccess = bool;
        this.notification = notificationDTO;
    }

    public static /* synthetic */ CloseStatusBannerResponse copy$default(CloseStatusBannerResponse closeStatusBannerResponse, Boolean bool, NotificationDTO notificationDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = closeStatusBannerResponse.isSuccess;
        }
        if ((i11 & 2) != 0) {
            notificationDTO = closeStatusBannerResponse.notification;
        }
        return closeStatusBannerResponse.copy(bool, notificationDTO);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /* renamed from: component2, reason: from getter */
    public final NotificationDTO getNotification() {
        return this.notification;
    }

    @NotNull
    public final CloseStatusBannerResponse copy(Boolean isSuccess, NotificationDTO notification) {
        return new CloseStatusBannerResponse(isSuccess, notification);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CloseStatusBannerResponse)) {
            return false;
        }
        CloseStatusBannerResponse closeStatusBannerResponse = (CloseStatusBannerResponse) other;
        return Intrinsics.d(this.isSuccess, closeStatusBannerResponse.isSuccess) && Intrinsics.d(this.notification, closeStatusBannerResponse.notification);
    }

    public final NotificationDTO getNotification() {
        return this.notification;
    }

    public int hashCode() {
        Boolean bool = this.isSuccess;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        NotificationDTO notificationDTO = this.notification;
        return hashCode + (notificationDTO != null ? notificationDTO.hashCode() : 0);
    }

    public final Boolean isSuccess() {
        return this.isSuccess;
    }

    @NotNull
    public String toString() {
        return "CloseStatusBannerResponse(isSuccess=" + this.isSuccess + ", notification=" + this.notification + ")";
    }
}
