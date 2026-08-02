package ru.ozon.app.android.fresh.feature.b2b.widgets.companyCard.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/companyCard/data/NotificationResponseDTO;", "", "type", "", "notificationBar", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "getType", "()Ljava/lang/String;", "getNotificationBar", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class NotificationResponseDTO {
    public static final int $stable = NotificationDTO.$stable;
    private final NotificationDTO notificationBar;
    private final String type;

    public NotificationResponseDTO(String str, NotificationDTO notificationDTO) {
        this.type = str;
        this.notificationBar = notificationDTO;
    }

    public static /* synthetic */ NotificationResponseDTO copy$default(NotificationResponseDTO notificationResponseDTO, String str, NotificationDTO notificationDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = notificationResponseDTO.type;
        }
        if ((i11 & 2) != 0) {
            notificationDTO = notificationResponseDTO.notificationBar;
        }
        return notificationResponseDTO.copy(str, notificationDTO);
    }

    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final NotificationDTO getNotificationBar() {
        return this.notificationBar;
    }

    @NotNull
    public final NotificationResponseDTO copy(String type, NotificationDTO notificationBar) {
        return new NotificationResponseDTO(type, notificationBar);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationResponseDTO)) {
            return false;
        }
        NotificationResponseDTO notificationResponseDTO = (NotificationResponseDTO) other;
        return Intrinsics.d(this.type, notificationResponseDTO.type) && Intrinsics.d(this.notificationBar, notificationResponseDTO.notificationBar);
    }

    public final NotificationDTO getNotificationBar() {
        return this.notificationBar;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        NotificationDTO notificationDTO = this.notificationBar;
        return hashCode + (notificationDTO != null ? notificationDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "NotificationResponseDTO(type=" + this.type + ", notificationBar=" + this.notificationBar + ")";
    }
}
