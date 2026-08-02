package ru.ozon.app.android.monetization.widgets.matchShoppingCards.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J2\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/SendReactionResponseDTO;", "", "addedToSelection", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "notificationBar", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "<init>", "(Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "getAddedToSelection", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getNotificationBar", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/notification/NotificationDTO;)Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/SendReactionResponseDTO;", "equals", "other", "hashCode", "", "toString", "", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SendReactionResponseDTO {
    public static final int $stable = NotificationDTO.$stable;
    private final AtomActionDTO action;
    private final Boolean addedToSelection;
    private final NotificationDTO notificationBar;

    public SendReactionResponseDTO(Boolean bool, AtomActionDTO atomActionDTO, NotificationDTO notificationDTO) {
        this.addedToSelection = bool;
        this.action = atomActionDTO;
        this.notificationBar = notificationDTO;
    }

    public static /* synthetic */ SendReactionResponseDTO copy$default(SendReactionResponseDTO sendReactionResponseDTO, Boolean bool, AtomActionDTO atomActionDTO, NotificationDTO notificationDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = sendReactionResponseDTO.addedToSelection;
        }
        if ((i11 & 2) != 0) {
            atomActionDTO = sendReactionResponseDTO.action;
        }
        if ((i11 & 4) != 0) {
            notificationDTO = sendReactionResponseDTO.notificationBar;
        }
        return sendReactionResponseDTO.copy(bool, atomActionDTO, notificationDTO);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getAddedToSelection() {
        return this.addedToSelection;
    }

    /* renamed from: component2, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    /* renamed from: component3, reason: from getter */
    public final NotificationDTO getNotificationBar() {
        return this.notificationBar;
    }

    @NotNull
    public final SendReactionResponseDTO copy(Boolean addedToSelection, AtomActionDTO action, NotificationDTO notificationBar) {
        return new SendReactionResponseDTO(addedToSelection, action, notificationBar);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SendReactionResponseDTO)) {
            return false;
        }
        SendReactionResponseDTO sendReactionResponseDTO = (SendReactionResponseDTO) other;
        return Intrinsics.d(this.addedToSelection, sendReactionResponseDTO.addedToSelection) && Intrinsics.d(this.action, sendReactionResponseDTO.action) && Intrinsics.d(this.notificationBar, sendReactionResponseDTO.notificationBar);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Boolean getAddedToSelection() {
        return this.addedToSelection;
    }

    public final NotificationDTO getNotificationBar() {
        return this.notificationBar;
    }

    public int hashCode() {
        Boolean bool = this.addedToSelection;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        NotificationDTO notificationDTO = this.notificationBar;
        return hashCode2 + (notificationDTO != null ? notificationDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SendReactionResponseDTO(addedToSelection=" + this.addedToSelection + ", action=" + this.action + ", notificationBar=" + this.notificationBar + ")";
    }
}
