package ru.ozon.app.android.common.actionHandlers.subscribeAuthorHandlers;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/common/actionHandlers/subscribeAuthorHandlers/SubscribeAuthorActionDTO;", "", "authorId", "", "notification", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "successNotification", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/notification/NotificationDTO;Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "getAuthorId", "()Ljava/lang/String;", "getNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getSuccessNotification", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SubscribeAuthorActionDTO {

    @NotNull
    private final String authorId;
    private final NotificationDTO notification;
    private final NotificationDTO successNotification;

    public SubscribeAuthorActionDTO(@NotNull String authorId, NotificationDTO notificationDTO, NotificationDTO notificationDTO2) {
        Intrinsics.checkNotNullParameter(authorId, "authorId");
        this.authorId = authorId;
        this.notification = notificationDTO;
        this.successNotification = notificationDTO2;
    }

    public static /* synthetic */ SubscribeAuthorActionDTO copy$default(SubscribeAuthorActionDTO subscribeAuthorActionDTO, String str, NotificationDTO notificationDTO, NotificationDTO notificationDTO2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = subscribeAuthorActionDTO.authorId;
        }
        if ((i11 & 2) != 0) {
            notificationDTO = subscribeAuthorActionDTO.notification;
        }
        if ((i11 & 4) != 0) {
            notificationDTO2 = subscribeAuthorActionDTO.successNotification;
        }
        return subscribeAuthorActionDTO.copy(str, notificationDTO, notificationDTO2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getAuthorId() {
        return this.authorId;
    }

    /* renamed from: component2, reason: from getter */
    public final NotificationDTO getNotification() {
        return this.notification;
    }

    /* renamed from: component3, reason: from getter */
    public final NotificationDTO getSuccessNotification() {
        return this.successNotification;
    }

    @NotNull
    public final SubscribeAuthorActionDTO copy(@NotNull String authorId, NotificationDTO notification, NotificationDTO successNotification) {
        Intrinsics.checkNotNullParameter(authorId, "authorId");
        return new SubscribeAuthorActionDTO(authorId, notification, successNotification);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscribeAuthorActionDTO)) {
            return false;
        }
        SubscribeAuthorActionDTO subscribeAuthorActionDTO = (SubscribeAuthorActionDTO) other;
        return Intrinsics.d(this.authorId, subscribeAuthorActionDTO.authorId) && Intrinsics.d(this.notification, subscribeAuthorActionDTO.notification) && Intrinsics.d(this.successNotification, subscribeAuthorActionDTO.successNotification);
    }

    @NotNull
    public final String getAuthorId() {
        return this.authorId;
    }

    public final NotificationDTO getNotification() {
        return this.notification;
    }

    public final NotificationDTO getSuccessNotification() {
        return this.successNotification;
    }

    public int hashCode() {
        int hashCode = this.authorId.hashCode() * 31;
        NotificationDTO notificationDTO = this.notification;
        int hashCode2 = (hashCode + (notificationDTO == null ? 0 : notificationDTO.hashCode())) * 31;
        NotificationDTO notificationDTO2 = this.successNotification;
        return hashCode2 + (notificationDTO2 != null ? notificationDTO2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SubscribeAuthorActionDTO(authorId=" + this.authorId + ", notification=" + this.notification + ", successNotification=" + this.successNotification + ")";
    }
}
