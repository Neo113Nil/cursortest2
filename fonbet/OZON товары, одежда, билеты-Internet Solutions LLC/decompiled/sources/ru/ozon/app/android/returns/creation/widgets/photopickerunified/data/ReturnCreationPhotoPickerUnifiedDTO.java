package ru.ozon.app.android.returns.creation.widgets.photopickerunified.data;

import Cm.e;
import De.C2859b;
import G.g;
import Ih.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.cellList.v2.data.CellListV2DTO;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.data.SignedLinkDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u000267BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010)\u001a\u00020\fHÆ\u0003J\t\u0010*\u001a\u00020\fHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010,\u001a\u00020\u0010HÆ\u0003J\t\u0010-\u001a\u00020\u0012HÆ\u0003Jk\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012HÆ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u000203HÖ\u0001J\t\u00104\u001a\u000205HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u00068"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photopickerunified/data/ReturnCreationPhotoPickerUnifiedDTO;", "", "cell", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cellList", "Lru/ozon/app/android/common/cellList/v2/data/CellListV2DTO;", "uploadImageAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "existingImages", "", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/data/SignedLinkDTO;", "continueButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "addPhotoButton", "addMorePhotoButton", "settings", "Lru/ozon/app/android/returns/creation/widgets/photopickerunified/data/ReturnCreationPhotoPickerUnifiedDTO$SettingsDTO;", "notifications", "Lru/ozon/app/android/returns/creation/widgets/photopickerunified/data/ReturnCreationPhotoPickerUnifiedDTO$NotificationsDTO;", "<init>", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/app/android/common/cellList/v2/data/CellListV2DTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/app/android/returns/creation/widgets/photopickerunified/data/ReturnCreationPhotoPickerUnifiedDTO$SettingsDTO;Lru/ozon/app/android/returns/creation/widgets/photopickerunified/data/ReturnCreationPhotoPickerUnifiedDTO$NotificationsDTO;)V", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getCellList", "()Lru/ozon/app/android/common/cellList/v2/data/CellListV2DTO;", "getUploadImageAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getExistingImages", "()Ljava/util/List;", "getContinueButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getAddPhotoButton", "getAddMorePhotoButton", "getSettings", "()Lru/ozon/app/android/returns/creation/widgets/photopickerunified/data/ReturnCreationPhotoPickerUnifiedDTO$SettingsDTO;", "getNotifications", "()Lru/ozon/app/android/returns/creation/widgets/photopickerunified/data/ReturnCreationPhotoPickerUnifiedDTO$NotificationsDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "", "SettingsDTO", "NotificationsDTO", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ReturnCreationPhotoPickerUnifiedDTO {
    public static final int $stable = 8;
    private final ButtonV3DTO addMorePhotoButton;

    @NotNull
    private final ButtonV3DTO addPhotoButton;

    @NotNull
    private final CellDTO cell;

    @NotNull
    private final CellListV2DTO cellList;

    @NotNull
    private final ButtonV3DTO continueButton;

    @NotNull
    private final List<SignedLinkDTO> existingImages;

    @NotNull
    private final NotificationsDTO notifications;

    @NotNull
    private final SettingsDTO settings;

    @NotNull
    private final AtomActionDTO uploadImageAction;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photopickerunified/data/ReturnCreationPhotoPickerUnifiedDTO$NotificationsDTO;", "", "minCountRestriction", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "uploadInProgress", "uploadFailed", "continueFailed", "<init>", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;Lru/ozon/uni/atoms/data/notification/NotificationDTO;Lru/ozon/uni/atoms/data/notification/NotificationDTO;Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "getMinCountRestriction", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getUploadInProgress", "getUploadFailed", "getContinueFailed", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NotificationsDTO {
        public static final int $stable = NotificationDTO.$stable;

        @NotNull
        private final NotificationDTO continueFailed;

        @NotNull
        private final NotificationDTO minCountRestriction;

        @NotNull
        private final NotificationDTO uploadFailed;

        @NotNull
        private final NotificationDTO uploadInProgress;

        public NotificationsDTO(@NotNull NotificationDTO minCountRestriction, @NotNull NotificationDTO uploadInProgress, @NotNull NotificationDTO uploadFailed, @NotNull NotificationDTO continueFailed) {
            Intrinsics.checkNotNullParameter(minCountRestriction, "minCountRestriction");
            Intrinsics.checkNotNullParameter(uploadInProgress, "uploadInProgress");
            Intrinsics.checkNotNullParameter(uploadFailed, "uploadFailed");
            Intrinsics.checkNotNullParameter(continueFailed, "continueFailed");
            this.minCountRestriction = minCountRestriction;
            this.uploadInProgress = uploadInProgress;
            this.uploadFailed = uploadFailed;
            this.continueFailed = continueFailed;
        }

        public static /* synthetic */ NotificationsDTO copy$default(NotificationsDTO notificationsDTO, NotificationDTO notificationDTO, NotificationDTO notificationDTO2, NotificationDTO notificationDTO3, NotificationDTO notificationDTO4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                notificationDTO = notificationsDTO.minCountRestriction;
            }
            if ((i11 & 2) != 0) {
                notificationDTO2 = notificationsDTO.uploadInProgress;
            }
            if ((i11 & 4) != 0) {
                notificationDTO3 = notificationsDTO.uploadFailed;
            }
            if ((i11 & 8) != 0) {
                notificationDTO4 = notificationsDTO.continueFailed;
            }
            return notificationsDTO.copy(notificationDTO, notificationDTO2, notificationDTO3, notificationDTO4);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final NotificationDTO getMinCountRestriction() {
            return this.minCountRestriction;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final NotificationDTO getUploadInProgress() {
            return this.uploadInProgress;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final NotificationDTO getUploadFailed() {
            return this.uploadFailed;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final NotificationDTO getContinueFailed() {
            return this.continueFailed;
        }

        @NotNull
        public final NotificationsDTO copy(@NotNull NotificationDTO minCountRestriction, @NotNull NotificationDTO uploadInProgress, @NotNull NotificationDTO uploadFailed, @NotNull NotificationDTO continueFailed) {
            Intrinsics.checkNotNullParameter(minCountRestriction, "minCountRestriction");
            Intrinsics.checkNotNullParameter(uploadInProgress, "uploadInProgress");
            Intrinsics.checkNotNullParameter(uploadFailed, "uploadFailed");
            Intrinsics.checkNotNullParameter(continueFailed, "continueFailed");
            return new NotificationsDTO(minCountRestriction, uploadInProgress, uploadFailed, continueFailed);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NotificationsDTO)) {
                return false;
            }
            NotificationsDTO notificationsDTO = (NotificationsDTO) other;
            return Intrinsics.d(this.minCountRestriction, notificationsDTO.minCountRestriction) && Intrinsics.d(this.uploadInProgress, notificationsDTO.uploadInProgress) && Intrinsics.d(this.uploadFailed, notificationsDTO.uploadFailed) && Intrinsics.d(this.continueFailed, notificationsDTO.continueFailed);
        }

        @NotNull
        public final NotificationDTO getContinueFailed() {
            return this.continueFailed;
        }

        @NotNull
        public final NotificationDTO getMinCountRestriction() {
            return this.minCountRestriction;
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
            return this.continueFailed.hashCode() + ((this.uploadFailed.hashCode() + ((this.uploadInProgress.hashCode() + (this.minCountRestriction.hashCode() * 31)) * 31)) * 31);
        }

        @NotNull
        public String toString() {
            return "NotificationsDTO(minCountRestriction=" + this.minCountRestriction + ", uploadInProgress=" + this.uploadInProgress + ", uploadFailed=" + this.uploadFailed + ", continueFailed=" + this.continueFailed + ")";
        }
    }

    public ReturnCreationPhotoPickerUnifiedDTO(@NotNull CellDTO cell, @NotNull CellListV2DTO cellList, @NotNull AtomActionDTO uploadImageAction, @NotNull List<SignedLinkDTO> existingImages, @NotNull ButtonV3DTO continueButton, @NotNull ButtonV3DTO addPhotoButton, ButtonV3DTO buttonV3DTO, @NotNull SettingsDTO settings, @NotNull NotificationsDTO notifications) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        Intrinsics.checkNotNullParameter(cellList, "cellList");
        Intrinsics.checkNotNullParameter(uploadImageAction, "uploadImageAction");
        Intrinsics.checkNotNullParameter(existingImages, "existingImages");
        Intrinsics.checkNotNullParameter(continueButton, "continueButton");
        Intrinsics.checkNotNullParameter(addPhotoButton, "addPhotoButton");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(notifications, "notifications");
        this.cell = cell;
        this.cellList = cellList;
        this.uploadImageAction = uploadImageAction;
        this.existingImages = existingImages;
        this.continueButton = continueButton;
        this.addPhotoButton = addPhotoButton;
        this.addMorePhotoButton = buttonV3DTO;
        this.settings = settings;
        this.notifications = notifications;
    }

    public static /* synthetic */ ReturnCreationPhotoPickerUnifiedDTO copy$default(ReturnCreationPhotoPickerUnifiedDTO returnCreationPhotoPickerUnifiedDTO, CellDTO cellDTO, CellListV2DTO cellListV2DTO, AtomActionDTO atomActionDTO, List list, ButtonV3DTO buttonV3DTO, ButtonV3DTO buttonV3DTO2, ButtonV3DTO buttonV3DTO3, SettingsDTO settingsDTO, NotificationsDTO notificationsDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cellDTO = returnCreationPhotoPickerUnifiedDTO.cell;
        }
        if ((i11 & 2) != 0) {
            cellListV2DTO = returnCreationPhotoPickerUnifiedDTO.cellList;
        }
        if ((i11 & 4) != 0) {
            atomActionDTO = returnCreationPhotoPickerUnifiedDTO.uploadImageAction;
        }
        if ((i11 & 8) != 0) {
            list = returnCreationPhotoPickerUnifiedDTO.existingImages;
        }
        if ((i11 & 16) != 0) {
            buttonV3DTO = returnCreationPhotoPickerUnifiedDTO.continueButton;
        }
        if ((i11 & 32) != 0) {
            buttonV3DTO2 = returnCreationPhotoPickerUnifiedDTO.addPhotoButton;
        }
        if ((i11 & 64) != 0) {
            buttonV3DTO3 = returnCreationPhotoPickerUnifiedDTO.addMorePhotoButton;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            settingsDTO = returnCreationPhotoPickerUnifiedDTO.settings;
        }
        if ((i11 & 256) != 0) {
            notificationsDTO = returnCreationPhotoPickerUnifiedDTO.notifications;
        }
        SettingsDTO settingsDTO2 = settingsDTO;
        NotificationsDTO notificationsDTO2 = notificationsDTO;
        ButtonV3DTO buttonV3DTO4 = buttonV3DTO2;
        ButtonV3DTO buttonV3DTO5 = buttonV3DTO3;
        ButtonV3DTO buttonV3DTO6 = buttonV3DTO;
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        return returnCreationPhotoPickerUnifiedDTO.copy(cellDTO, cellListV2DTO, atomActionDTO2, list, buttonV3DTO6, buttonV3DTO4, buttonV3DTO5, settingsDTO2, notificationsDTO2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final CellDTO getCell() {
        return this.cell;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final CellListV2DTO getCellList() {
        return this.cellList;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final AtomActionDTO getUploadImageAction() {
        return this.uploadImageAction;
    }

    @NotNull
    public final List<SignedLinkDTO> component4() {
        return this.existingImages;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final ButtonV3DTO getContinueButton() {
        return this.continueButton;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final ButtonV3DTO getAddPhotoButton() {
        return this.addPhotoButton;
    }

    /* renamed from: component7, reason: from getter */
    public final ButtonV3DTO getAddMorePhotoButton() {
        return this.addMorePhotoButton;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final SettingsDTO getSettings() {
        return this.settings;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final NotificationsDTO getNotifications() {
        return this.notifications;
    }

    @NotNull
    public final ReturnCreationPhotoPickerUnifiedDTO copy(@NotNull CellDTO cell, @NotNull CellListV2DTO cellList, @NotNull AtomActionDTO uploadImageAction, @NotNull List<SignedLinkDTO> existingImages, @NotNull ButtonV3DTO continueButton, @NotNull ButtonV3DTO addPhotoButton, ButtonV3DTO addMorePhotoButton, @NotNull SettingsDTO settings, @NotNull NotificationsDTO notifications) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        Intrinsics.checkNotNullParameter(cellList, "cellList");
        Intrinsics.checkNotNullParameter(uploadImageAction, "uploadImageAction");
        Intrinsics.checkNotNullParameter(existingImages, "existingImages");
        Intrinsics.checkNotNullParameter(continueButton, "continueButton");
        Intrinsics.checkNotNullParameter(addPhotoButton, "addPhotoButton");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(notifications, "notifications");
        return new ReturnCreationPhotoPickerUnifiedDTO(cell, cellList, uploadImageAction, existingImages, continueButton, addPhotoButton, addMorePhotoButton, settings, notifications);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReturnCreationPhotoPickerUnifiedDTO)) {
            return false;
        }
        ReturnCreationPhotoPickerUnifiedDTO returnCreationPhotoPickerUnifiedDTO = (ReturnCreationPhotoPickerUnifiedDTO) other;
        return Intrinsics.d(this.cell, returnCreationPhotoPickerUnifiedDTO.cell) && Intrinsics.d(this.cellList, returnCreationPhotoPickerUnifiedDTO.cellList) && Intrinsics.d(this.uploadImageAction, returnCreationPhotoPickerUnifiedDTO.uploadImageAction) && Intrinsics.d(this.existingImages, returnCreationPhotoPickerUnifiedDTO.existingImages) && Intrinsics.d(this.continueButton, returnCreationPhotoPickerUnifiedDTO.continueButton) && Intrinsics.d(this.addPhotoButton, returnCreationPhotoPickerUnifiedDTO.addPhotoButton) && Intrinsics.d(this.addMorePhotoButton, returnCreationPhotoPickerUnifiedDTO.addMorePhotoButton) && Intrinsics.d(this.settings, returnCreationPhotoPickerUnifiedDTO.settings) && Intrinsics.d(this.notifications, returnCreationPhotoPickerUnifiedDTO.notifications);
    }

    public final ButtonV3DTO getAddMorePhotoButton() {
        return this.addMorePhotoButton;
    }

    @NotNull
    public final ButtonV3DTO getAddPhotoButton() {
        return this.addPhotoButton;
    }

    @NotNull
    public final CellDTO getCell() {
        return this.cell;
    }

    @NotNull
    public final CellListV2DTO getCellList() {
        return this.cellList;
    }

    @NotNull
    public final ButtonV3DTO getContinueButton() {
        return this.continueButton;
    }

    @NotNull
    public final List<SignedLinkDTO> getExistingImages() {
        return this.existingImages;
    }

    @NotNull
    public final NotificationsDTO getNotifications() {
        return this.notifications;
    }

    @NotNull
    public final SettingsDTO getSettings() {
        return this.settings;
    }

    @NotNull
    public final AtomActionDTO getUploadImageAction() {
        return this.uploadImageAction;
    }

    public int hashCode() {
        int c11 = C2859b.c(this.addPhotoButton, C2859b.c(this.continueButton, g.b(a.b(this.uploadImageAction, (this.cellList.hashCode() + (this.cell.hashCode() * 31)) * 31, 31), 31, this.existingImages), 31), 31);
        ButtonV3DTO buttonV3DTO = this.addMorePhotoButton;
        return this.notifications.hashCode() + ((this.settings.hashCode() + ((c11 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "ReturnCreationPhotoPickerUnifiedDTO(cell=" + this.cell + ", cellList=" + this.cellList + ", uploadImageAction=" + this.uploadImageAction + ", existingImages=" + this.existingImages + ", continueButton=" + this.continueButton + ", addPhotoButton=" + this.addPhotoButton + ", addMorePhotoButton=" + this.addMorePhotoButton + ", settings=" + this.settings + ", notifications=" + this.notifications + ")";
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photopickerunified/data/ReturnCreationPhotoPickerUnifiedDTO$SettingsDTO;", "", "minCount", "", "maxCount", "<init>", "(II)V", "getMinCount", "()I", "getMaxCount", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SettingsDTO {
        public static final int $stable = 0;
        private final int maxCount;
        private final int minCount;

        public SettingsDTO(int i11, int i12) {
            this.minCount = i11;
            this.maxCount = i12;
        }

        public static /* synthetic */ SettingsDTO copy$default(SettingsDTO settingsDTO, int i11, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i11 = settingsDTO.minCount;
            }
            if ((i13 & 2) != 0) {
                i12 = settingsDTO.maxCount;
            }
            return settingsDTO.copy(i11, i12);
        }

        /* renamed from: component1, reason: from getter */
        public final int getMinCount() {
            return this.minCount;
        }

        /* renamed from: component2, reason: from getter */
        public final int getMaxCount() {
            return this.maxCount;
        }

        @NotNull
        public final SettingsDTO copy(int minCount, int maxCount) {
            return new SettingsDTO(minCount, maxCount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SettingsDTO)) {
                return false;
            }
            SettingsDTO settingsDTO = (SettingsDTO) other;
            return this.minCount == settingsDTO.minCount && this.maxCount == settingsDTO.maxCount;
        }

        public final int getMaxCount() {
            return this.maxCount;
        }

        public final int getMinCount() {
            return this.minCount;
        }

        public int hashCode() {
            return Integer.hashCode(this.maxCount) + (Integer.hashCode(this.minCount) * 31);
        }

        @NotNull
        public String toString() {
            return e.c("SettingsDTO(minCount=", this.minCount, ", maxCount=", ")", this.maxCount);
        }

        public /* synthetic */ SettingsDTO(int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? 0 : i11, i12);
        }
    }

    public ReturnCreationPhotoPickerUnifiedDTO(CellDTO cellDTO, CellListV2DTO cellListV2DTO, AtomActionDTO atomActionDTO, List list, ButtonV3DTO buttonV3DTO, ButtonV3DTO buttonV3DTO2, ButtonV3DTO buttonV3DTO3, SettingsDTO settingsDTO, NotificationsDTO notificationsDTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(cellDTO, cellListV2DTO, atomActionDTO, (i11 & 8) != 0 ? K.f71697a : list, buttonV3DTO, buttonV3DTO2, buttonV3DTO3, settingsDTO, notificationsDTO);
    }
}
