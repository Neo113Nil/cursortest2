package ru.ozon.app.android.cabinet.profileAvatar.data.repository;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/cabinet/profileAvatar/data/repository/UploadAvatarResponse;", "", "avatarUrl", "", "errorNotificationBar", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "getAvatarUrl", "()Ljava/lang/String;", "getErrorNotificationBar", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class UploadAvatarResponse {
    private final String avatarUrl;
    private final NotificationDTO errorNotificationBar;

    public UploadAvatarResponse(String str, NotificationDTO notificationDTO) {
        this.avatarUrl = str;
        this.errorNotificationBar = notificationDTO;
    }

    public static /* synthetic */ UploadAvatarResponse copy$default(UploadAvatarResponse uploadAvatarResponse, String str, NotificationDTO notificationDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = uploadAvatarResponse.avatarUrl;
        }
        if ((i11 & 2) != 0) {
            notificationDTO = uploadAvatarResponse.errorNotificationBar;
        }
        return uploadAvatarResponse.copy(str, notificationDTO);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final NotificationDTO getErrorNotificationBar() {
        return this.errorNotificationBar;
    }

    @NotNull
    public final UploadAvatarResponse copy(String avatarUrl, NotificationDTO errorNotificationBar) {
        return new UploadAvatarResponse(avatarUrl, errorNotificationBar);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploadAvatarResponse)) {
            return false;
        }
        UploadAvatarResponse uploadAvatarResponse = (UploadAvatarResponse) other;
        return Intrinsics.d(this.avatarUrl, uploadAvatarResponse.avatarUrl) && Intrinsics.d(this.errorNotificationBar, uploadAvatarResponse.errorNotificationBar);
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final NotificationDTO getErrorNotificationBar() {
        return this.errorNotificationBar;
    }

    public int hashCode() {
        String str = this.avatarUrl;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        NotificationDTO notificationDTO = this.errorNotificationBar;
        return hashCode + (notificationDTO != null ? notificationDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UploadAvatarResponse(avatarUrl=" + this.avatarUrl + ", errorNotificationBar=" + this.errorNotificationBar + ")";
    }
}
