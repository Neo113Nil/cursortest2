package ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.data;

import De.C2859b;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001cB%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/data/ReturnCreationPhotoPickerPerImageTypeDTO;", "", "items", "", "Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/data/ItemDTO;", "continueButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "notifications", "Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/data/ReturnCreationPhotoPickerPerImageTypeDTO$Notifications;", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/data/ReturnCreationPhotoPickerPerImageTypeDTO$Notifications;)V", "getItems", "()Ljava/util/List;", "getContinueButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getNotifications", "()Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/data/ReturnCreationPhotoPickerPerImageTypeDTO$Notifications;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Notifications", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ReturnCreationPhotoPickerPerImageTypeDTO {
    public static final int $stable = 8;

    @NotNull
    private final ButtonV3DTO continueButton;

    @NotNull
    private final List<ItemDTO> items;

    @NotNull
    private final Notifications notifications;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/data/ReturnCreationPhotoPickerPerImageTypeDTO$Notifications;", "", "uploadInProgress", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "uploadFailed", "<init>", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "getUploadInProgress", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getUploadFailed", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Notifications {
        public static final int $stable = NotificationDTO.$stable;

        @NotNull
        private final NotificationDTO uploadFailed;

        @NotNull
        private final NotificationDTO uploadInProgress;

        public Notifications(@NotNull NotificationDTO uploadInProgress, @NotNull NotificationDTO uploadFailed) {
            Intrinsics.checkNotNullParameter(uploadInProgress, "uploadInProgress");
            Intrinsics.checkNotNullParameter(uploadFailed, "uploadFailed");
            this.uploadInProgress = uploadInProgress;
            this.uploadFailed = uploadFailed;
        }

        public static /* synthetic */ Notifications copy$default(Notifications notifications, NotificationDTO notificationDTO, NotificationDTO notificationDTO2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                notificationDTO = notifications.uploadInProgress;
            }
            if ((i11 & 2) != 0) {
                notificationDTO2 = notifications.uploadFailed;
            }
            return notifications.copy(notificationDTO, notificationDTO2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final NotificationDTO getUploadInProgress() {
            return this.uploadInProgress;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final NotificationDTO getUploadFailed() {
            return this.uploadFailed;
        }

        @NotNull
        public final Notifications copy(@NotNull NotificationDTO uploadInProgress, @NotNull NotificationDTO uploadFailed) {
            Intrinsics.checkNotNullParameter(uploadInProgress, "uploadInProgress");
            Intrinsics.checkNotNullParameter(uploadFailed, "uploadFailed");
            return new Notifications(uploadInProgress, uploadFailed);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Notifications)) {
                return false;
            }
            Notifications notifications = (Notifications) other;
            return Intrinsics.d(this.uploadInProgress, notifications.uploadInProgress) && Intrinsics.d(this.uploadFailed, notifications.uploadFailed);
        }

        @NotNull
        public final NotificationDTO getUploadFailed() {
            return this.uploadFailed;
        }

        @NotNull
        public final NotificationDTO getUploadInProgress() {
            return this.uploadInProgress;
        }

        public int hashCode() {
            return this.uploadFailed.hashCode() + (this.uploadInProgress.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Notifications(uploadInProgress=" + this.uploadInProgress + ", uploadFailed=" + this.uploadFailed + ")";
        }
    }

    public ReturnCreationPhotoPickerPerImageTypeDTO(@NotNull List<ItemDTO> items, @NotNull ButtonV3DTO continueButton, @NotNull Notifications notifications) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(continueButton, "continueButton");
        Intrinsics.checkNotNullParameter(notifications, "notifications");
        this.items = items;
        this.continueButton = continueButton;
        this.notifications = notifications;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReturnCreationPhotoPickerPerImageTypeDTO copy$default(ReturnCreationPhotoPickerPerImageTypeDTO returnCreationPhotoPickerPerImageTypeDTO, List list, ButtonV3DTO buttonV3DTO, Notifications notifications, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = returnCreationPhotoPickerPerImageTypeDTO.items;
        }
        if ((i11 & 2) != 0) {
            buttonV3DTO = returnCreationPhotoPickerPerImageTypeDTO.continueButton;
        }
        if ((i11 & 4) != 0) {
            notifications = returnCreationPhotoPickerPerImageTypeDTO.notifications;
        }
        return returnCreationPhotoPickerPerImageTypeDTO.copy(list, buttonV3DTO, notifications);
    }

    @NotNull
    public final List<ItemDTO> component1() {
        return this.items;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ButtonV3DTO getContinueButton() {
        return this.continueButton;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Notifications getNotifications() {
        return this.notifications;
    }

    @NotNull
    public final ReturnCreationPhotoPickerPerImageTypeDTO copy(@NotNull List<ItemDTO> items, @NotNull ButtonV3DTO continueButton, @NotNull Notifications notifications) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(continueButton, "continueButton");
        Intrinsics.checkNotNullParameter(notifications, "notifications");
        return new ReturnCreationPhotoPickerPerImageTypeDTO(items, continueButton, notifications);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReturnCreationPhotoPickerPerImageTypeDTO)) {
            return false;
        }
        ReturnCreationPhotoPickerPerImageTypeDTO returnCreationPhotoPickerPerImageTypeDTO = (ReturnCreationPhotoPickerPerImageTypeDTO) other;
        return Intrinsics.d(this.items, returnCreationPhotoPickerPerImageTypeDTO.items) && Intrinsics.d(this.continueButton, returnCreationPhotoPickerPerImageTypeDTO.continueButton) && Intrinsics.d(this.notifications, returnCreationPhotoPickerPerImageTypeDTO.notifications);
    }

    @NotNull
    public final ButtonV3DTO getContinueButton() {
        return this.continueButton;
    }

    @NotNull
    public final List<ItemDTO> getItems() {
        return this.items;
    }

    @NotNull
    public final Notifications getNotifications() {
        return this.notifications;
    }

    public int hashCode() {
        return this.notifications.hashCode() + C2859b.c(this.continueButton, this.items.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        return "ReturnCreationPhotoPickerPerImageTypeDTO(items=" + this.items + ", continueButton=" + this.continueButton + ", notifications=" + this.notifications + ")";
    }
}
