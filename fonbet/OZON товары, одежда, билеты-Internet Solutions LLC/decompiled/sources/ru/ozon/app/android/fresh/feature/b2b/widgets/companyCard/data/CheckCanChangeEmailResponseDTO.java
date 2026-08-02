package ru.ozon.app.android.fresh.feature.b2b.widgets.companyCard.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/companyCard/data/CheckCanChangeEmailResponseDTO;", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "notification", "Lru/ozon/app/android/fresh/feature/b2b/widgets/companyCard/data/NotificationResponseDTO;", "<init>", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/app/android/fresh/feature/b2b/widgets/companyCard/data/NotificationResponseDTO;)V", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getNotification", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/companyCard/data/NotificationResponseDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CheckCanChangeEmailResponseDTO {
    public static final int $stable = NotificationDTO.$stable;
    private final AtomActionDTO action;
    private final NotificationResponseDTO notification;

    public CheckCanChangeEmailResponseDTO(AtomActionDTO atomActionDTO, NotificationResponseDTO notificationResponseDTO) {
        this.action = atomActionDTO;
        this.notification = notificationResponseDTO;
    }

    public static /* synthetic */ CheckCanChangeEmailResponseDTO copy$default(CheckCanChangeEmailResponseDTO checkCanChangeEmailResponseDTO, AtomActionDTO atomActionDTO, NotificationResponseDTO notificationResponseDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            atomActionDTO = checkCanChangeEmailResponseDTO.action;
        }
        if ((i11 & 2) != 0) {
            notificationResponseDTO = checkCanChangeEmailResponseDTO.notification;
        }
        return checkCanChangeEmailResponseDTO.copy(atomActionDTO, notificationResponseDTO);
    }

    /* renamed from: component1, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    /* renamed from: component2, reason: from getter */
    public final NotificationResponseDTO getNotification() {
        return this.notification;
    }

    @NotNull
    public final CheckCanChangeEmailResponseDTO copy(AtomActionDTO action, NotificationResponseDTO notification) {
        return new CheckCanChangeEmailResponseDTO(action, notification);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckCanChangeEmailResponseDTO)) {
            return false;
        }
        CheckCanChangeEmailResponseDTO checkCanChangeEmailResponseDTO = (CheckCanChangeEmailResponseDTO) other;
        return Intrinsics.d(this.action, checkCanChangeEmailResponseDTO.action) && Intrinsics.d(this.notification, checkCanChangeEmailResponseDTO.notification);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final NotificationResponseDTO getNotification() {
        return this.notification;
    }

    public int hashCode() {
        AtomActionDTO atomActionDTO = this.action;
        int hashCode = (atomActionDTO == null ? 0 : atomActionDTO.hashCode()) * 31;
        NotificationResponseDTO notificationResponseDTO = this.notification;
        return hashCode + (notificationResponseDTO != null ? notificationResponseDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CheckCanChangeEmailResponseDTO(action=" + this.action + ", notification=" + this.notification + ")";
    }
}
