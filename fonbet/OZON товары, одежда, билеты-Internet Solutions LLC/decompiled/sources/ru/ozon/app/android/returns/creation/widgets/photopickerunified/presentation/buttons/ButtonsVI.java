package ru.ozon.app.android.returns.creation.widgets.photopickerunified.presentation.buttons;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.creation.widgets.photopickerunified.data.ReturnCreationPhotoPickerUnifiedDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\b\u0001\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photopickerunified/presentation/buttons/ButtonsVI;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "continueButton", "addPhotoButton", "addMorePhotoButton", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "uploadImageAction", "Lru/ozon/app/android/returns/creation/widgets/photopickerunified/data/ReturnCreationPhotoPickerUnifiedDTO$SettingsDTO;", "settings", "Lru/ozon/app/android/returns/creation/widgets/photopickerunified/data/ReturnCreationPhotoPickerUnifiedDTO$NotificationsDTO;", "notifications", "", "photosScrollKey", "<init>", "(JLru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/app/android/returns/creation/widgets/photopickerunified/data/ReturnCreationPhotoPickerUnifiedDTO$SettingsDTO;Lru/ozon/app/android/returns/creation/widgets/photopickerunified/data/ReturnCreationPhotoPickerUnifiedDTO$NotificationsDTO;I)V", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getContinueButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getAddPhotoButton", "getAddMorePhotoButton", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getUploadImageAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "Lru/ozon/app/android/returns/creation/widgets/photopickerunified/data/ReturnCreationPhotoPickerUnifiedDTO$SettingsDTO;", "getSettings", "()Lru/ozon/app/android/returns/creation/widgets/photopickerunified/data/ReturnCreationPhotoPickerUnifiedDTO$SettingsDTO;", "Lru/ozon/app/android/returns/creation/widgets/photopickerunified/data/ReturnCreationPhotoPickerUnifiedDTO$NotificationsDTO;", "getNotifications", "()Lru/ozon/app/android/returns/creation/widgets/photopickerunified/data/ReturnCreationPhotoPickerUnifiedDTO$NotificationsDTO;", "I", "getPhotosScrollKey", "()I", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ButtonsVI implements c {
    public static final int $stable = NotificationDTO.$stable;
    private final ButtonV3DTO addMorePhotoButton;

    @NotNull
    private final ButtonV3DTO addPhotoButton;

    @NotNull
    private final ButtonV3DTO continueButton;
    private final long id;

    @NotNull
    private final ReturnCreationPhotoPickerUnifiedDTO.NotificationsDTO notifications;
    private final int photosScrollKey;

    @NotNull
    private final ReturnCreationPhotoPickerUnifiedDTO.SettingsDTO settings;

    @NotNull
    private final AtomActionDTO uploadImageAction;

    public ButtonsVI(long j11, @NotNull ButtonV3DTO continueButton, @NotNull ButtonV3DTO addPhotoButton, ButtonV3DTO buttonV3DTO, @NotNull AtomActionDTO uploadImageAction, @NotNull ReturnCreationPhotoPickerUnifiedDTO.SettingsDTO settings, @NotNull ReturnCreationPhotoPickerUnifiedDTO.NotificationsDTO notifications, int i11) {
        Intrinsics.checkNotNullParameter(continueButton, "continueButton");
        Intrinsics.checkNotNullParameter(addPhotoButton, "addPhotoButton");
        Intrinsics.checkNotNullParameter(uploadImageAction, "uploadImageAction");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(notifications, "notifications");
        this.id = j11;
        this.continueButton = continueButton;
        this.addPhotoButton = addPhotoButton;
        this.addMorePhotoButton = buttonV3DTO;
        this.uploadImageAction = uploadImageAction;
        this.settings = settings;
        this.notifications = notifications;
        this.photosScrollKey = i11;
    }

    public final ButtonV3DTO getAddMorePhotoButton() {
        return this.addMorePhotoButton;
    }

    @NotNull
    public final ButtonV3DTO getAddPhotoButton() {
        return this.addPhotoButton;
    }

    @NotNull
    public final ButtonV3DTO getContinueButton() {
        return this.continueButton;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final ReturnCreationPhotoPickerUnifiedDTO.NotificationsDTO getNotifications() {
        return this.notifications;
    }

    public final int getPhotosScrollKey() {
        return this.photosScrollKey;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final ReturnCreationPhotoPickerUnifiedDTO.SettingsDTO getSettings() {
        return this.settings;
    }

    @NotNull
    public final AtomActionDTO getUploadImageAction() {
        return this.uploadImageAction;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }
}
